package hr.adriacomsoftware.app.client.smartgwt.pis;

import hr.adriacomsoftware.app.client.smartgwt.pis.models.PisPerspectiveModel;
import hr.adriacomsoftware.app.client.smartgwt.pis.models.PisarnicaSifrarnikModel;
import hr.adriacomsoftware.app.client.smartgwt.pis.views.PisarnicaView;
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
public class Pis extends AS2GwtDesktop {
	
	@Override
	protected void getNavigationPaneSections(AS2NavigationPane navigationPane) {
		navigationPane.addSection(PisPerspectiveModel.getInstance().getSectionName(), PisPerspectiveModel.getInstance());
	}
	
	@Override
	protected List<DataSource> getDropDownCacheModels() {
		List<DataSource> list = new ArrayList<DataSource>();
		list.add(PisarnicaSifrarnikModel.getInstance());
		return list;
	}
	
	@Override
    public String getNavigationPaneHeader(){
    	return "Jadranska Banka d.d.";
    }

	@Override
	protected Canvas getView(String name){
		if(name.equals("ura")){
			return new PisarnicaView(name);
		}else if(name.equals("ulazna_posta")){
			return new PisarnicaView(name);
		}else if(name.equals("izlazna_posta")){
			return new PisarnicaView(name);
		}else
			return new AS2ContextArea();

	}
	
	@Override
	protected String getApplicationName() {		
		return "Pisarnica";
	}

	@Override
	protected String getApplicationId() {
		return "pis";
	}
	
//	@Override
//	protected String getDefaultViewName() {
//		return "";
//	}
//	
//	protected String getDefaultViewDisplayName(){
//		return "";
//	}
	
}