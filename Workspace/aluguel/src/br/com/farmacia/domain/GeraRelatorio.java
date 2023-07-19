package br.com.farmacia.domain;

import java.io.FileOutputStream;
import java.io.IOException;
import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfWriter;

public class GeraRelatorio {
	
	public static void main(String[] args) {
		//Connection conexao = ConexaoFactory.conectar();
		// criamos um documento vazio
		Document documentoPDF = new Document();
	
		try {
			// cria uma instancia do cocumento e da nome do pdf
			PdfWriter.getInstance(documentoPDF, new FileOutputStream("C:\\PDF\\PDF_PROGRAMINHAS.pdf"));
			
			// abrir o documento
			documentoPDF.open();
			
			//setar o tamanho da pagina
			documentoPDF.setPageSize(PageSize.A4);
		
			// adicionar primeiro paragrafo
			documentoPDF.add(new Paragraph("GERANDO PDF COM PROGRAMINHA E VOCE"));
			documentoPDF.add(new Paragraph("           "));
			documentoPDF.add(new Paragraph("GERANDO PDF COM PROGRAMINHA E VOCE"));
			documentoPDF.add(new Paragraph("GERANDO PDF COM PROGRAMINHA E VOCE"));
			documentoPDF.add(new Paragraph("GERANDO PDF COM PROGRAMINHA E VOCE"));
			documentoPDF.add(new Paragraph("GERANDO PDF COM PROGRAMINHA E VOCE"));
			
			//nova pagina
			documentoPDF.newPage();
			documentoPDF.add(new Paragraph("NOVA PAGINA PROGRAMINHA E VOCE"));
			
		}catch(DocumentException de) {
			de.printStackTrace();
		}catch(IOException ioe) {
			ioe.printStackTrace();
		}finally {
			documentoPDF.close();
		}
		
	}
}
