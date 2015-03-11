package hr.adriacomsoftware.app.client.smartgwt.dionice.models;

import hr.adriacomsoftware.inf.client.smartgwt.desktop.perspective.xml.AS2NavigationPaneSectionDaoModel;

public class DionicePerspectiveModel extends AS2NavigationPaneSectionDaoModel {
	public static final String DEFAULT_PERSPECTIVE_NAME = "upisnice";
	public static final String DEFAULT_PERSPECTIVE_DISPLAY_NAME = "Upisnice";
	
	private static DionicePerspectiveModel instance = new DionicePerspectiveModel("DionPerspectiveModel");
	public static DionicePerspectiveModel getInstance() {
		return instance;
	}

	public DionicePerspectiveModel(String id) {
		super(id);
	}

	public String getSectionName() {
		return DEFAULT_PERSPECTIVE_DISPLAY_NAME;
	}

	@Override
	public String getDefaultPerspectiveName() {
		return DEFAULT_PERSPECTIVE_NAME;
	}
}
