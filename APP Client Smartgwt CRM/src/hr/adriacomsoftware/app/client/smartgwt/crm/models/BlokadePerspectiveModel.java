package hr.adriacomsoftware.app.client.smartgwt.crm.models;

import hr.adriacomsoftware.inf.client.smartgwt.desktop.perspective.xml.AS2NavigationPaneSectionXmlModel;

public class BlokadePerspectiveModel extends AS2NavigationPaneSectionXmlModel {
	
	public static final String DEFAULT_PERSPECTIVE_NAME = "blokade_po";
	public static final String DEFAULT_PERSPECTIVE_DISPLAY_NAME = "PO Blokade";
	
	private static BlokadePerspectiveModel instance = new BlokadePerspectiveModel("BlokadePerspectiveModel");
	public static BlokadePerspectiveModel getInstance() {
		return instance;
	}

	public BlokadePerspectiveModel(String id) {
		super(id);
		// the name of the default ListGrid item to select
		// see NavigationPaneSectionListGrid -> onDataArrived()
		// see MainPageView -> initNavigationPane()
		setDataURL(URL_PREFIX + "BlokadePerspective", URL_SUFFIX);
	}

	public String getSectionName() {
		return "Blokade";
	}

	@Override
	public String getDefaultPerspectiveName() {
		return "blokade_po";
	}
}
