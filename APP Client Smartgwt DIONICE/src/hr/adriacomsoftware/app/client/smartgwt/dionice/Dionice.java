package hr.adriacomsoftware.app.client.smartgwt.dionice;

import hr.adriacomsoftware.app.client.smartgwt.dionice.models.DionicePerspectiveModel;
import hr.adriacomsoftware.app.client.smartgwt.dionice.models.DioniceSifrarnikModel;
import hr.adriacomsoftware.app.client.smartgwt.dionice.views.UpisnicaView;
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
public class Dionice extends AS2GwtDesktop {
	
	@Override
	protected void getNavigationPaneSections(AS2NavigationPane navigationPane) {
		navigationPane.addSection(DionicePerspectiveModel.getInstance().getSectionName(), DionicePerspectiveModel.getInstance());
	}
	@Override
	protected List<DataSource> getDropDownCacheModels() {
		List<DataSource> list = new ArrayList<DataSource>();
		list.add(DioniceSifrarnikModel.getInstance());
		return list;
	}

	@Override
    public String getNavigationPaneHeader(){
    	return "Jadranska banka d.d.";
    }
	
	@Override
	protected Canvas getView(String name){
		if(name.equals("upisnice"))
			return new UpisnicaView(name);
		else
			return new AS2ContextArea();

	}

//	@Override
//	protected String getDefaultViewName() {
//		return DionicePerspectiveModel.DEFAULT_PERSPECTIVE_NAME;
//	}
//	
//	protected String getDefaultViewDisplayName(){
//		return DionicePerspectiveModel.DEFAULT_PERSPECTIVE_DISPLAY_NAME;
//
//	}

	@Override
	protected String getApplicationName() {
		return "Dionička knjiga";
	}

	@Override
	protected String getApplicationId() {
		return "dionice";
	}


}