package hr.adriacomsoftware.app.client.smartgwt.portal;

import java.util.List;

import hr.adriacomsoftware.app.client.smartgwt.portal.views.PortalView;
import hr.adriacomsoftware.inf.client.smartgwt.desktop.views.AS2ContextArea;
import hr.adriacomsoftware.inf.client.smartgwt.desktop.views.AS2GwtDesktop;
import hr.adriacomsoftware.inf.client.smartgwt.desktop.views.AS2NavigationPane;
import hr.adriacomsoftware.inf.client.smartgwt.desktop.views.AS2NavigationPaneHeader;

import com.smartgwt.client.data.DataSource;
import com.smartgwt.client.widgets.Canvas;
import com.smartgwt.client.widgets.layout.VLayout;

public class Portal extends AS2GwtDesktop {
	
	
	@Override
	protected void getNavigationPaneSections(AS2NavigationPane navigationPane) {}
	
	
	@Override
	protected AS2NavigationPaneHeader initNavigationPaneHeader() {
		AS2NavigationPaneHeader navigationPaneHeader = new AS2NavigationPaneHeader();
		navigationPaneHeader.setNavigationPaneHeaderLabelContents(getNavigationPaneContents());
		navigationPaneHeader.setMembers(navigationPaneHeader.navigationPaneHeaderLabel);
		return navigationPaneHeader;
	}
	

	@Override
	protected List<DataSource> getDropDownCacheModels() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected VLayout initWestLayout() {
		return null;
	}
	
	@Override
	protected VLayout initEastLayout() {
		return null;
	}

	@Override
	protected void customizeApplication() {
		southLayout.setMembers(getView("portal"));
	}

	protected String getNavigationPaneContents(){
    	return "Interne stranice za zaposlenike Jadranske banke d.d.";
    }
	
	@Override
	protected Canvas getView(String name){
		if(name.equals("portal")){
			return new PortalView(name);
		}else
			return new AS2ContextArea();

	}
	
	@Override
	protected String getDefaultViewName() {
		return "";
	}
	
	protected String getDefaultViewDisplayName(){
		return "";
	}

	@Override
	protected String getApplicationName() {
		return "Portal";
	}

	@Override
	protected String getApplicationId() {
		return "portal";
	}

}