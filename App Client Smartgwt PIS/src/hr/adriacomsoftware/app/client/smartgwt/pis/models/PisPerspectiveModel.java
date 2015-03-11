package hr.adriacomsoftware.app.client.smartgwt.pis.models;

import hr.adriacomsoftware.inf.client.smartgwt.desktop.perspective.xml.AS2NavigationPaneSectionDaoModel;

public class PisPerspectiveModel extends AS2NavigationPaneSectionDaoModel {

	public static final String DEFAULT_PERSPECTIVE_NAME = "ura";
	public static final String DEFAULT_PERSPECTIVE_DISPLAY_NAME = "Ulazni račun";
	
	private static PisPerspectiveModel instance = new PisPerspectiveModel("PisPerspectiveModel");
	public static PisPerspectiveModel getInstance() {
		return instance;
	}

	public PisPerspectiveModel(String id) {
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
