package hr.adriacomsoftware.app.client.smartgwt.kpi;

import hr.adriacomsoftware.app.client.smartgwt.kpi.models.ChartsTransportModel;
import hr.adriacomsoftware.app.client.smartgwt.kpi.views.EastLayout;
import hr.adriacomsoftware.app.client.smartgwt.kpi.views.navigation.PokazateljiNavigationSection;
import hr.adriacomsoftware.inf.client.smartgwt.desktop.views.AS2GwtDesktop;
import hr.adriacomsoftware.inf.client.smartgwt.desktop.views.AS2NavigationPane;
import hr.adriacomsoftware.inf.client.smartgwt.desktop.views.AS2NavigationPaneHeader;

import java.util.List;

import org.moxieapps.gwt.highcharts.client.Highcharts;
import org.moxieapps.gwt.highcharts.client.Lang;

import com.smartgwt.client.data.DataSource;
import com.smartgwt.client.widgets.layout.VLayout;

public class Kpi extends AS2GwtDesktop {
	protected static String WEST_WIDTH = "20%";
	
	@Override
	protected boolean isAuthenticationNeeded(){
		return true;
	}
	
	@Override
	protected void getNavigationPaneSections(AS2NavigationPane navigationPane) {
	}
	
	@Override
	protected AS2NavigationPane getNavigationPane() {
		AS2NavigationPane navigationPane = new AS2NavigationPane();
		navigationPane.addSection(new PokazateljiNavigationSection());
		return navigationPane;
	}
	
	@Override
	protected AS2NavigationPaneHeader initNavigationPaneHeader() {
		AS2NavigationPaneHeader navigationPaneHeader = new AS2NavigationPaneHeader();
		navigationPaneHeader
				.setNavigationPaneHeaderLabelContents(getNavigationPaneContents());
		navigationPaneHeader.setMembers(navigationPaneHeader.navigationPaneHeaderLabel);
		return navigationPaneHeader;
	}
	
	protected String getNavigationPaneContents(){
    	return "Jadranska banka d.d.";
    }
	
//	@Override
//	protected String getDefaultViewName() {
//		return "";
//	}
//	
//	protected String getDefaultViewDisplayName(){
//		return "";
//	}
	
	@Override
	protected VLayout initEastLayout() {
		EastLayout east = new EastLayout();
		return east;
	}
	@Override
	protected void customizeApplication() {
		// GWT-Highcharts internationalization
		Highcharts.setOptions(new Highcharts.Options()
				.setLang(new Lang()
						.setMonths(
								new String[] { "siječanj", "veljača", "ožujak",
										"travanj", "svibanj", "lipanj",
										"srpanj", "kolovoz", "rujan",
										"listopad", "studeni", "prosinac" })
						.setWeekdays(
								new String[] { "ponedjeljak", "utorak",
										"srijeda", "četvrtak", "petak",
										"subota", "nedjelja" })
						.setDecimalPoint(",")
						.setThousandsSep(".")
						.setPrintButtonTitle("Ispiši dijagram")
						.setDownloadJPEG("Spremi kao JPEG sliku")
						.setDownloadPDF("Spremi kao PDF dokument")
						.setDownloadPNG("Spremi kao PNG sliku")
						.setDownloadSVG("Spremi kao SVG vektor")
						.setResetZoom("Poništi povećanje")
						.setResetZoomTitle("Poništi povećavanje 1:1")
						.setShortMonths(
								new String[] { "sij", "velj", "ožu", "tra",
										"svi", "lip", "srp", "kol", "ruj",
										"lis", "stu", "pro" })
						.setLoading("učitavanje ...")
						.setRangeSelectorFrom("Od").setRangeSelectorTo("Do")
						.setRangeSelectorZoom("Povećavanje")));
		ChartsTransportModel._dataSource = ChartsTransportModel.getInstance();
	}
	
	@Override
	protected String getApplicationName() {
		return "Balanced Scorecard";
	}

	@Override
	protected String getApplicationId() {
		return "kpi";
	}

	@Override
	protected List<DataSource> getDropDownCacheModels() {
		// TODO Auto-generated method stub
		return null;
	}
}
