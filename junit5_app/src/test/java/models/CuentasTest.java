package models;

import Exceptions.DineroInsuficienteException;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.math.BigDecimal;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;

class CuentasTest {

    private Cuentas cuenta;

    private TestInfo testinfo;
    private TestReporter report;

    @BeforeEach
    void initMetodoTest(TestInfo testinfo, TestReporter report) {
//        System.out.println("iniciando el metodo");
        this.cuenta = new Cuentas("nino el felino", new BigDecimal("1000.12345"));
        this.testinfo = testinfo;
        this.report = report;

        report.publishEntry("ejecutando: "+ testinfo.getDisplayName() + " "+testinfo.getTestMethod().orElse(null).getName()
                + " con las etiquetas " + testinfo.getTags());
    }

    @AfterEach
    void teardown() {
//        System.out.println("finalizando el metodo de prueba");
    }

    //    @BeforeAll
//    static void beforeAll() {
//        System.out.println("inicializando el test");
//    }
//
//    @AfterAll
//    static void afterAll() {
//        System.out.println("finalizando el test");
//
//    }
    @Tag("cuenta")
    @Nested
    @DisplayName("probando atributos de la cuenta corriente")
    class CuentaTestNombreSaldo {
        @Test
        @DisplayName("probando nombre")
        void testNombreCuenta() {
            System.out.println(testinfo.getTags());
            if(testinfo.getTags().contains("cuenta")){
                System.out.println("hacer algo con la etiqueta cuenta");
            }


//        cuenta.setPersona("nino el felino");

            String esperado = "nino el felino";
            String real = cuenta.getPersona();
            assertEquals(esperado, real, () -> "el nombre de la cuenta no es el esperado, se esperaba " + esperado
                    + " pero fue " + real);
            assertNotNull(real, () -> " la cuenta no puede ser nula");
        }

        @Test
        @DisplayName(" saldo no menor que cero y valor valido")
        void testSaldoCuenta() {
//        cuenta = new Cuentas("nino el felino", new BigDecimal("1000.12345"));
            assertNotNull(cuenta.getSaldo());
            assertEquals(1000.12345, cuenta.getSaldo().doubleValue());
            assertFalse(cuenta.getSaldo().compareTo(BigDecimal.ZERO) < 0);
            assertTrue(cuenta.getSaldo().compareTo(BigDecimal.ZERO) > 0);
        }

        @Test
        void testReferenciaCuenta() {
            cuenta = new Cuentas("chibo lito", new BigDecimal("8900.9997"));
            Cuentas cuentas2 = new Cuentas("chibo lito", new BigDecimal("8900.9997"));

//        assertNotEquals(cuentas2, cuentas );
            assertEquals(cuentas2, cuenta);
        }
    }

    @Tag("param")
    @Nested
    class ParametrizedTest{
        @ParameterizedTest
        @CsvSource({"1, 100", "2, 200", "3, 300", "4, 500", "5, 700", "6, 1000"})
        void testDebitoCuentaCsvSource(String index, String monto) {
            System.out.println(index + " - "+monto);
            cuenta.debito(new BigDecimal(monto));
            assertNotNull(cuenta.getSaldo());
            assertTrue(cuenta.getSaldo().compareTo(BigDecimal.ZERO) >0);
        }

        @ParameterizedTest
        @CsvFileSource (resources = "/data.csv")
        void testDebitoCuentaCsvFileSource(String monto) {
//            System.out.println( "monto);
            cuenta.debito(new BigDecimal(monto));
            assertNotNull(cuenta.getSaldo());
            assertTrue(cuenta.getSaldo().compareTo(BigDecimal.ZERO) >0);
        }

        @ParameterizedTest
        @MethodSource("montoList")
        void testDebitoCuentaMethodSource(String monto) {
//            System.out.println( "monto);
            cuenta.debito(new BigDecimal(monto));
            assertNotNull(cuenta.getSaldo());
            assertTrue(cuenta.getSaldo().compareTo(BigDecimal.ZERO) >0);
        }

        @ParameterizedTest
        @CsvSource({"200, 100, Pepe, Pepe", "250, 200, maria, Maria", "300, 300, Chibo, Chino", "510, 500, Miki, Mili", "750, 700, Nino, Nino", "1000, 1000, Gordo, Gordo"})
        void testDebitoCuentaCsvSource2(String saldo, String monto, String esperado, String actual) {
            System.out.println(saldo + " - "+monto);
            cuenta.setSaldo(new BigDecimal(saldo));
            cuenta.debito(new BigDecimal(monto));
            assertNotNull(cuenta.getSaldo());
            assertNotNull(cuenta.getPersona());
            assertEquals(esperado, actual);
            assertTrue(cuenta.getSaldo().compareTo(BigDecimal.ZERO) >0);
        }

        @ParameterizedTest
        @CsvFileSource (resources = "/data2.csv")
        void testDebitoCuentaCsvFileSource2(String saldo, String monto, String esperado, String actual) {
//            System.out.println( "monto);
            cuenta.debito(new BigDecimal(monto));
            assertNotNull(cuenta.getSaldo());
            assertNotNull(cuenta.getPersona());
            assertEquals(esperado, actual);
            assertTrue(cuenta.getSaldo().compareTo(BigDecimal.ZERO) >0);
        }

    }

    @Tag("param")
    @TestInstance(TestInstance.Lifecycle.PER_CLASS)
    @Nested
    class CuentaOperacionesTestValueSource{
        @ParameterizedTest
        @ValueSource(strings = {"100", "200", "300", "500", "700", "1000"})
        void testDebitoCuenta(String monto) {
//        Cuentas cuentas = new Cuentas("nino el felino", new BigDecimal("1000.12345"));
            cuenta.debito(new BigDecimal(monto));
            assertNotNull(cuenta.getSaldo());
//            assertEquals(900, cuenta.getSaldo().intValue());
//            assertEquals("900.12345", cuenta.getSaldo().toPlainString());
            assertTrue(cuenta.getSaldo().compareTo(BigDecimal.ZERO) >0);
        }


         List<String> montoList(){
            return Arrays.asList("100", "200", "300", "500", "700", "1000");
        }

        @Tag("cuenta")
        @Test
        void testCrebitoCuenta() {
//        Cuentas cuentas = new Cuentas("nino el felino", new BigDecimal("1000.12345"));
            cuenta.credito(new BigDecimal("100"));
            assertNotNull(cuenta.getSaldo());
            assertEquals(1100, cuenta.getSaldo().intValue());
            assertEquals("1100.12345", cuenta.getSaldo().toPlainString());
        }
        @Tag("cuenta")
        @Tag("banco")
        @Test
        void testTransfeririDineroCuentas() {
            Cuentas cuenta1 = new Cuentas("Gato Berto", new BigDecimal("2500"));

            Cuentas cuenta2 = new Cuentas("chibo lito", new BigDecimal("1500.8989"));

            Banco banco = new Banco();
            banco.setNombre("banco del gato");
            banco.transferir(cuenta2, cuenta1, new BigDecimal(500));
            assertEquals("1000.8989", cuenta2.getSaldo().toPlainString());
            assertEquals("3000", cuenta1.getSaldo().toPlainString());
        }
    }


    @Test
    @Tag("cuenta")
    @Tag("error")
    void testDineroInsuficienteExceptionCuenta() {
//        Cuentas cuenta = new Cuentas("nino el felino", new BigDecimal("1000.12345"));
        Exception exception = assertThrows(DineroInsuficienteException.class, () -> {
            cuenta.debito(new BigDecimal(1500));
        });
        String actual = exception.getMessage();
        String esperado = "Dinero Insuficiente";
        assertEquals(esperado, actual);
    }



    @Test
    @Tag("cuenta")
    @Tag("error")
//    @Disabled
    void testRelacionBancoCuentas() {
//        fail();
        Cuentas cuenta1 = new Cuentas("Gato Berto", new BigDecimal("2500"));
        Cuentas cuenta2 = new Cuentas("chibo lito", new BigDecimal("1500.8989"));

        Banco banco = new Banco();
        banco.addCuentas(cuenta1);
        banco.addCuentas(cuenta2);

        banco.setNombre("banco del gato");
        banco.transferir(cuenta2, cuenta1, new BigDecimal(500));
        assertAll(() -> assertEquals("1000.8989", cuenta2.getSaldo().toPlainString()),
                () -> assertEquals("3000", cuenta1.getSaldo().toPlainString()),
                () -> assertEquals(2, banco.getCuentas().size()),
                () -> assertEquals("banco del gato", cuenta1.getBanco().getNombre()),
                () -> {
                    assertEquals("Gato Berto", banco.getCuentas().stream()
                            .filter(c -> c.getPersona().equals("Gato Berto"))
                            .findFirst()
                            .get().getPersona());
                },
                () -> {
                    assertTrue(banco.getCuentas().stream()
                            .anyMatch(c -> c.getPersona().equals("chibo lito")));
                });
    }

    @Test
    @DisplayName("no menor que cero y valor valido")
    void testSaldoCuentaDev() {
//        cuenta = new Cuentas("nino el felino", new BigDecimal("1000.12345"));
        boolean esDev = "dev".equals(System.getProperty("ENV"));
        assumeTrue(esDev);
        assertNotNull(cuenta.getSaldo());
        assertEquals(1000.12345, cuenta.getSaldo().doubleValue());
        assertFalse(cuenta.getSaldo().compareTo(BigDecimal.ZERO) < 0);
        assertTrue(cuenta.getSaldo().compareTo(BigDecimal.ZERO) > 0);

    }

    @Test
    @DisplayName("no menor que cero y valor valido")
    void testSaldoCuentaDev2() {
//        cuenta = new Cuentas("nino el felino", new BigDecimal("1000.12345"));
        boolean esDev = "dev".equals(System.getProperty("ENV"));
        assumingThat(esDev, () -> {
            assertNotNull(cuenta.getSaldo());
            assertEquals(1000.12345, cuenta.getSaldo().doubleValue());

        });
        assertFalse(cuenta.getSaldo().compareTo(BigDecimal.ZERO) < 0);
        assertTrue(cuenta.getSaldo().compareTo(BigDecimal.ZERO) > 0);

    }
    @DisplayName("probando debito cuenta repetir")
    @RepeatedTest(value = 5, name = "{displayName} repeticion numero {currentRepetition} de {totalRepetitions}")
    void testDebitoCuentaRepetir(RepetitionInfo info) {
//        Cuentas cuentas = new Cuentas("nino el felino", new BigDecimal("1000.12345"));
        if(info.getCurrentRepetition() == 3){
            System.out.println("eestamos en la repeticion "+ info.getCurrentRepetition());
        }
        cuenta.debito(new BigDecimal("100"));
        assertNotNull(cuenta.getSaldo());
        assertEquals(900, cuenta.getSaldo().intValue());
        assertEquals("900.12345", cuenta.getSaldo().toPlainString());
    }

    @Nested
    class SistemaOperativoTEST{

        @Test
        @EnabledOnOs(OS.WINDOWS)
        void testSoloWindows() {

        }

        @Test
        @EnabledOnOs({OS.LINUX, OS.MAC})
        void testSoloLinuxMax() {

        }

        @Test
        @DisabledOnOs(OS.WINDOWS)
        void testNowindows() {
        }
    }

    @Nested
    class JavaVersionTest{

        @Test
        @EnabledOnJre(JRE.JAVA_8)
        void soloJDK8() {
        }

        @Test
        @EnabledOnJre(JRE.JAVA_15)
        void soloJDK15() {
        }

        @Test
        @DisabledOnJre(JRE.JAVA_15)
        void nooJDK15() {
        }
    }

    @Nested
    class systemPropertyTest{
        @Test
        void ImprimirSystemProperties() {
            Properties properties = System.getProperties();
            properties.forEach((k,v)-> System.out.println(k + ":" + v ));
        }

        @Test
        @EnabledIfSystemProperty(named = "java.version", matches = ".*8.*")
        void testJavaVersion() {
        }

        @Test
        @DisabledIfSystemProperty(named = "os.arch", matches = ".*32.*")
        void testsolo64() {
        }

        @Test
        @EnabledIfSystemProperty(named = "os.arch", matches = ".*32.*")
        void testNo64() {
        }

        @Test
        @EnabledIfSystemProperty(named = "user.name", matches = "cjofrevi")
        void testSoloUsername() {
        }

        @Test
        @EnabledIfSystemProperty(named ="ENV", matches = "dev")
        void testDev() {
        }
    }

    @Nested
    class VariableAmbienteTest{
        @Test
        void imprimirVariablesAmbiente() {
            Map<String, String> getenv = System.getenv();
            getenv.forEach((k, v) -> System.out.println(k + " = "+ v));
        }

        @Test
        @EnabledIfEnvironmentVariable(named = "JAVA_HOME", matches = ".*jdk1.8.0_271.*")
        void testJava_Home() {
        }

        @Test
        @EnabledIfEnvironmentVariable(named = "NUMBER_OF_PROCESSORS", matches = "8")
        void testCoreNumber() {
        }

        @Test
        @EnabledIfEnvironmentVariable(named = "ENVIROMENT", matches= "dev")
        void testENV(){
        }
    }

    @Nested
    @Tag("timeout")
    class timeoutTest{
        @Test
        @Timeout(5)
        void pruebaTimeout() throws InterruptedException {
            TimeUnit.SECONDS.sleep(1);
        }

        @Test
        @Timeout(value = 5000, unit = TimeUnit.MILLISECONDS)
        void pruebaTimeout2() throws InterruptedException {
            TimeUnit.SECONDS.sleep(1);
        }

        @Test
        void testTimeoutassertion() {
            assertTimeout(Duration.ofSeconds(2), () -> {
                TimeUnit.SECONDS.sleep(1);
            });
        }
    }

}