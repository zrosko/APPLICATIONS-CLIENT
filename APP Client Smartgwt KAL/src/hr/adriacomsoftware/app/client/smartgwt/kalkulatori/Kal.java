package hr.adriacomsoftware.app.client.smartgwt.kalkulatori;

import hr.adriacomsoftware.app.client.smartgwt.kalkulatori.models.KalkulatoriPerspectiveXmlModel;
import hr.adriacomsoftware.app.client.smartgwt.kalkulatori.views.AnuitetiView;
import hr.adriacomsoftware.app.client.smartgwt.kalkulatori.views.ObracunKamateView;
import hr.adriacomsoftware.inf.client.smartgwt.desktop.views.AS2ContextArea;
import hr.adriacomsoftware.inf.client.smartgwt.desktop.views.AS2GwtDesktop;
import hr.adriacomsoftware.inf.client.smartgwt.desktop.views.AS2NavigationPane;

import java.util.List;

import com.smartgwt.client.data.DataSource;
import com.smartgwt.client.widgets.Canvas;

public class Kal extends AS2GwtDesktop {
	
	@Override
	protected void getNavigationPaneSections(AS2NavigationPane navigationPane) {
		navigationPane.addSection(KalkulatoriPerspectiveXmlModel.getInstance().getSectionName(), KalkulatoriPerspectiveXmlModel.getInstance());
	}
	
	@Override
	protected List<DataSource> getDropDownCacheModels() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
    public String getNavigationPaneHeader(){
    	return "Jadranska banka d.d.";
    }
	
	@Override
	protected Canvas getView(String name){
		if(name.equals("anuitetski_obracun")){
			return new AnuitetiView();
		}else if(name.equals("obracun_kamate")){
			return new ObracunKamateView();
		}else
			return new AS2ContextArea();

	}
//	
//	protected void getSectionHeaderClickHandler(SectionHeaderClickEvent event) {
//		SectionStackSection section = event.getSection();
//		String name = ((AS2NavigationPaneSectionXml) section).getSelectedRecord();
//		if (!section.getSectionStack().sectionIsExpanded(section.getID())) {
//			name = ((AS2NavigationPaneSectionXml) section).getDefaultPerspectiveName();
//			Record record = null;
//			if (!name.equals("")) {
//				((AS2NavigationPaneSectionXml) section).selectRecord(name);
//				record = ((AS2NavigationPaneSectionXml) section).getListGrid()
//						.getSelectedRecord();
//			}if (record != null)
//				setContextAreaViewXml(
//						name,
//						record.getAttribute(AS2NavigationPaneSectionXmlModel.DISPLAY_NAME));
//			else {
//				setContextAreaViewXml(
//						name,
//						AS2NavigationPaneSectionXmlModel.DEFAULT_PERSPECTIVE_DISPLAY_NAME);
//				//TODO testirati
////				((AS2NavigationPaneSectionXmlModel) ((AS2NavigationPaneSectionXml) section)
////						.getListGrid().getDataSource()).DEFAULT_PERSPECTIVE_DISPLAY_NAME);
//			}
//		} else {
//			setContextAreaViewXml("", "");
//		}
//
//	}
	
//	@Override
//	protected String getDefaultViewName() {
//		return KalkulatoriPerspectiveXmlModel.DEFAULT_PERSPECTIVE_NAME;
//	}
//	
//	protected String getDefaultViewDisplayName(){
//		return KalkulatoriPerspectiveXmlModel.DEFAULT_PERSPECTIVE_DISPLAY_NAME;
//	}
	
	@Override
	protected String getApplicationName() {
		return "Kalkulatori";
	}

	@Override
	protected String getApplicationId() {
		return "kal";
	}
}