package char_stream;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.List;

public class Test_XML_1 {
    public static void main(String []args) throws DocumentException
    {

        SAXReader saxReader=new SAXReader();
        Document read = saxReader.read("..\\File_IO_Char_Stream\\src\\helloworld.xml");
        System.out.println(read.getRootElement().getName());

        Element rootElement = read.getRootElement();

        List<Element> element = rootElement.elements();

        for (Element element1 : element) {
            System.out.println(element1.getName());
        }

        Element element1 = rootElement.element("user");
        System.out.println(element1.attributeValue("id"));

        System.out.println(element1.elementText("name"));
        System.out.println(element1.elementText("value"));

    }
}
