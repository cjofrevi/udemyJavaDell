package models;

import Exceptions.DineroInsuficienteException;
import org.junit.jupiter.api.*;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class CuentasTest {

    Cuentas cuenta;

    @BeforeEach
    void initMetodoTest(){
        System.out.println("iniciando el metodo");
        this.cuenta = new Cuentas("nino el felino", new BigDecimal("1000.12345"));
    }

    @AfterEach
    void teardown(){
        System.out.println("finalizando el metodo de prueba");
    }

    @BeforeAll
    static void beforeAll() {
        System.out.println("inicializando el test");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("finalizando el test");

    }

    @Test
    @DisplayName("probando nombre de la cuenta corriente")
    void testNombreCuenta() {

//        cuenta.setPersona("nino el felino");

        String esperado = "nino el felino";
        String real = cuenta.getPersona();
        assertEquals(esperado, real, () -> "el nombre de la cuenta no es el esperado, se esperaba "+ esperado
                +" pero fue " + real);
        assertNotNull(real, () ->" la cuenta no puede ser nula");


    }

    @Test
    @DisplayName("no menor que cero y valor valido")
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

    @Test
    void testDebitoCuenta() {
//        Cuentas cuentas = new Cuentas("nino el felino", new BigDecimal("1000.12345"));
        cuenta.debito(new BigDecimal("100"));
        assertNotNull(cuenta.getSaldo());
        assertEquals(900, cuenta.getSaldo().intValue());
        assertEquals("900.12345", cuenta.getSaldo().toPlainString());
    }

    @Test
    void testCrebitoCuenta() {
//        Cuentas cuentas = new Cuentas("nino el felino", new BigDecimal("1000.12345"));
        cuenta.credito(new BigDecimal("100"));
        assertNotNull(cuenta.getSaldo());
        assertEquals(1100, cuenta.getSaldo().intValue());
        assertEquals("1100.12345", cuenta.getSaldo().toPlainString());
    }

    @Test
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
    void testTransfeririDineroCuentas() {
        Cuentas cuenta1 = new Cuentas("Gato Berto", new BigDecimal("2500"));

        Cuentas cuenta2 = new Cuentas("chibo lito", new BigDecimal("1500.8989"));

        Banco banco = new Banco();
        banco.setNombre("banco del gato");
        banco.transferir(cuenta2, cuenta1, new BigDecimal(500));
        assertEquals("1000.8989", cuenta2.getSaldo().toPlainString());
        assertEquals("3000", cuenta1.getSaldo().toPlainString());
    }

    @Test
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
}