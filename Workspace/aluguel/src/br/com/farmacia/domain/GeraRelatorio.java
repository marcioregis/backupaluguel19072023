package br.com.farmacia.domain;

import java.sql.Connection;
import java.sql.SQLException;
//import java.util.HashMap;
import java.util.Map;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import br.com.farmacia.factory.ConexaoFactory;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

@ManagedBean(name = "MBGeraRecibo")
@ViewScoped
public class GeraRelatorio {

	Map<String, Object> HashMap;
	public GeraRelatorio() throws SQLException {
		Connection conexao = ConexaoFactory.conectar();
		try {
		
		JasperReport jasperReport = JasperCompileManager.compileReport("C:\\Users\\marcioregis\\JaspersoftWorkspace\\relatorios\\recibos.jasper");	
		JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, HashMap, conexao);
		@SuppressWarnings("unused")
		JasperViewer jasperViewer = new JasperViewer(jasperPrint, false);
		JasperViewer.setDefaultLookAndFeelDecorated(true);
		
		
		} catch (JRException e) {
			e.printStackTrace();
		}
		
	}
}
