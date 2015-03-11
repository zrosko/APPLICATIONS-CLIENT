package hr.adriacomsoftware.app.client.smartgwt.evid;

import java.util.ArrayList;
import java.util.List;

import hr.adriacomsoftware.app.client.smartgwt.evid.models.EvidPerspectiveModel;
import hr.adriacomsoftware.app.client.smartgwt.evid.models.EvidencijaDolazakaSifrarnikModel;
import hr.adriacomsoftware.app.client.smartgwt.evid.views.EvidencijaDolazakaView;
import hr.adriacomsoftware.app.client.smartgwt.evid.views.EvidencijaGoView;
import hr.adriacomsoftware.app.client.smartgwt.evid.views.EvidencijaMjesecnaView;
import hr.adriacomsoftware.app.client.smartgwt.evid.views.EvidencijaOvlastiView;
import hr.adriacomsoftware.app.client.smartgwt.evid.views.EvidencijaPotvrdaView;
import hr.adriacomsoftware.inf.client.smartgwt.desktop.views.AS2ContextArea;
import hr.adriacomsoftware.inf.client.smartgwt.desktop.views.AS2GwtDesktop;
import hr.adriacomsoftware.inf.client.smartgwt.desktop.views.AS2NavigationPane;

import com.smartgwt.client.data.DataSource;
import com.smartgwt.client.widgets.Canvas;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Evid extends AS2GwtDesktop {

	@Override
	protected void getNavigationPaneSections(AS2NavigationPane navigationPane) {
		navigationPane.addSection(EvidPerspectiveModel.getInstance().getSectionName(), EvidPerspectiveModel.getInstance());
	}
	
	@Override
	protected List<DataSource> getDropDownCacheModels() {
		List<DataSource> list = new ArrayList<DataSource>();
		list.add(EvidencijaDolazakaSifrarnikModel.getInstance());
		return list;
	}

	@Override
    public String getNavigationPaneHeader(){
    	return "Jadranska banka d.d.";
    }
	
	@Override
	protected Canvas getView(String name){
		if(name.equals("evidencijadolazaka"))
			return new EvidencijaDolazakaView(name);
		else if(name.equals("evidencijapotvrda"))
			return new EvidencijaPotvrdaView(name);
		else if(name.equals("evidencijamjesecna"))
			return new EvidencijaMjesecnaView(name);
		else if(name.equals("evidencijaovlasti"))
			return new EvidencijaOvlastiView(name);
		else if(name.equals("evidencijago"))
			return new EvidencijaGoView(name);
		else
			return new AS2ContextArea();

	}
	@Override
	protected String getApplicationName() {		
		return "Evidencija prisutnosti";
	}

	@Override
	protected String getApplicationId() {
		return "evid";
	}

//	@Override
//	protected String getDefaultViewName() {
//		return "PPPR" ; //EvidPerspectiveModel.DEFAULT_PERSPECTIVE_NAME;
//	}
	
//	protected String getDefaultViewDisplayName(){
//		return EvidPerspectiveModel.DEFAULT_PERSPECTIVE_DISPLAY_NAME;
//
//	}
}