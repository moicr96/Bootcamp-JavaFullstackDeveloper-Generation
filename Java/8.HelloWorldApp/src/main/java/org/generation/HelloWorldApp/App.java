package org.generation.HelloWorldApp;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		generatePDF("CH25");
	}//main
	public static void generatePDF(String str) {
		Document doc=new Document();
		try {
			PdfWriter.getInstance(doc, new FileOutputStream("CH26_HW.pdf"));
			doc.open();
			doc.add(new Paragraph("Hola Mundo Maven "+str));			
		} catch (FileNotFoundException | DocumentException e){
			e.printStackTrace();			
		} finally {
			doc.close();
		}
	}
}//App
