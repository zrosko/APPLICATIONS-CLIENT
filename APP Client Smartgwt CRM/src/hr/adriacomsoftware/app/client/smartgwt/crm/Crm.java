package hr.adriacomsoftware.app.client.smartgwt.crm;

import hr.adriacomsoftware.app.client.smartgwt.blokade.po.models.BlokadePoSifrarnikModel;
import hr.adriacomsoftware.app.client.smartgwt.blokade.po.views.BlokadePoView;
import hr.adriacomsoftware.app.client.smartgwt.crm.models.BlokadePerspectiveModel;
import hr.adriacomsoftware.inf.client.smartgwt.desktop.views.AS2ContextArea;
import hr.adriacomsoftware.inf.client.smartgwt.desktop.views.AS2GwtDesktop;
import hr.adriacomsoftware.inf.client.smartgwt.desktop.views.AS2NavigationPane;

import java.util.ArrayList;
import java.util.List;

import com.smartgwt.client.data.DataSource;
import com.smartgwt.client.widgets.Canvas;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Crm extends AS2GwtDesktop {

	@Override
	protected void getNavigationPaneSections(AS2NavigationPane navigationPane) {
		navigationPane.addSection(BlokadePerspectiveModel.getInstance().getSectionName(), BlokadePerspectiveModel.getInstance());
//		navigationPane.addSection(ObrtniciPerspectiveModel.getInstance().getSectionName(), ObrtniciPerspectiveModel.getInstance());
	}
	
	@Override
	protected List<DataSource> getDropDownCacheModels() {
		List<DataSource> list = new ArrayList<DataSource>();
		list.add(BlokadePoSifrarnikModel.getInstance());
		//list.add(ObrtniciSifrarnikModel.getInstance());
		return list;
	}

	@Override
    public String getNavigationPaneHeader(){
    	return "Jadranska banka d.d.";
    }

	@Override
	//handler na klick perspektive
	protected Canvas getView(String name){
		if(name.equals("blokade_po"))
			return new BlokadePoView(name);
//		else if(name.equals("blokade_gr"))
//			return new BlokadePoView(name);
//		else if(name.equals("stecaj"))
//			return new BlokadePoView(name);
//		else if(name.equals("ovrhe"))
//			return new BlokadePoView(name);
//		else if(name.equals("predstecajne"))
//			return new BlokadePoView(name);
//		else if(name.equals("obrtnici"))
//			return new BlokadePoView(name);
//		else if(name.equals("ob_bonitet"))
//			return new BlokadePoView(name);
//		else if(name.equals("krediti_gr"))
//			return new BlokadePoView(name);
//		else if(name.equals("krediti_po"))
//			return new BlokadePoView(name);
//		else if(name.equals("klijenti_gr"))
//			return new BlokadePoView(name);
//		else if(name.equals("klijenti_po"))
//			return new BlokadePoView(name);
		else
			return new AS2ContextArea();

	}

//	@Override
//	protected String getDefaultSectionName() {
//		return "Obrtnici";
//	}
	@Override
	protected String getDefaultViewName() {
		return "blokade_po";
	}
	
	protected String getDefaultViewDisplayName(){
		return "Bonitet";
	}
	
	@Override
	protected String getApplicationName() {
		return "Kontakt centar";
	}

	@Override
	protected String getApplicationId() {
		return "crm";
	}
}