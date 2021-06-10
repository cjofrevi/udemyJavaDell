import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.HashMap;
import java.util.Objects;


public class ParserXMLNEPOOL {
        static HashMap<String,Boolean> riIDMap = new HashMap<String,Boolean>();
        static int counter = 0;
        public static void main(String[] args) {

            try {
                File inputFile = new File("response.xml");
                DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
                DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
                Document doc = dBuilder.parse(inputFile);
                doc.getDocumentElement().normalize();
                System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
                NodeList nList = doc.getElementsByTagName("row");
                System.out.println("----------------------------");



                for (int temp = 0; temp < nList.getLength(); temp++) {
                    Node nNode = nList.item(temp);


                    //System.out.println("\nCurrent Element :" + nNode.getNodeName());

                    if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                        Element eElement = (Element) nNode;

                        if (eElement.getAttribute("CCYY").matches("\\D{4}") ){
//                            if (Objects.equals(riIDMap.get(eElement.getAttribute("CCYY")), q6t51)){
                            System.out.println(eElement.getAttribute("rlID"));
                            riIDMap.put(eElement.getAttribute("CCYY"), false);

                        }else{

//                            if (riIDMap.get(eElement.getAttribute("CCYY")) == false){
//                                riIDMap.replace(eElement.getAttribute("CCYY"), true);
//                            } else {
//                                System.out.println("riID: "+eElement.getAttribute("CCYY")+" is repeated");
//                            }
//                              System.out.println(riIDMap.get(eElement.getAttribute("rlID")));
                        }
                    }
                };
                riIDMap.keySet().forEach(ParserXMLNEPOOL::printIfNotRepeated);
                if (counter == 0) {
                    System.out.println("All are well paired");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        static void printIfNotRepeated(String riID){

            if (riIDMap.get(riID) == false)  {
                System.out.println("riID: "+riID+" is not well Paired");
                counter++;
            }

        }
    }

