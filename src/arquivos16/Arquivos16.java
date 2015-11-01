package arquivos16;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;

public class Arquivos16 {

    public static void main(String[] args) throws IOException, XMLStreamException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("serial.txt"));
        XMLStreamWriter writer = XMLOutputFactory.newInstance().createXMLStreamWriter(new FileOutputStream("products.xml"));
        
        Producto p = (Producto) ois.readObject();
            writer.writeStartDocument("1.0");
            writer.writeStartElement("products");
            while (p != null) {
                System.out.println(p.toString());

                writer.writeStartElement("product");
                writer.writeAttribute("cod", p.getCode());
                writer.writeStartElement("precio");
                writer.writeCharacters(String.valueOf(p.getPrice()));
                writer.writeEndElement();
                writer.writeStartElement("descripcion");
                writer.writeCharacters(p.getDescripcion());
                writer.writeEndElement();
                writer.writeEndElement();

                p = (Producto) ois.readObject();
            }
            writer.writeEndDocument();
            
            ois.close();
            writer.flush();
            writer.close();
    }

}
