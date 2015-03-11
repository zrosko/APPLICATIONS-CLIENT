package hr.adriacomsoftware.app.client.smartgwt.crm.models;

import hr.adriacomsoftware.inf.client.smartgwt.desktop.perspective.xml.AS2NavigationPaneSectionXmlModel;

public class ObrtniciPerspectiveModel extends AS2NavigationPaneSectionXmlModel {

	public static final String DEFAULT_PERSPECTIVE_NAME = "obrtnici";
	public static final String DEFAULT_PERSPECTIVE_DISPLAY_NAME = "Obrtnici";
	
	private static ObrtniciPerspectiveModel instance = new ObrtniciPerspectiveModel("ObrtniciPerspectiveModel");
	public static ObrtniciPerspectiveModel getInstance() {
		return instance;
	}
	
	public ObrtniciPerspectiveModel(String id) {
		super(id);
		// the name of the default ListGrid item to select
		// see NavigationPaneSectionListGrid -> onDataArrived()
		// see MainPageView -> initNavigationPane()
		setDataURL(URL_PREFIX + "ObrtniciPerspective", URL_SUFFIX);
	}

	public String getSectionName() {
		return "Obrtnici";
	}

	@Override
	public String getDefaultPerspectiveName() {
		return "obrtnici";
	}
}
