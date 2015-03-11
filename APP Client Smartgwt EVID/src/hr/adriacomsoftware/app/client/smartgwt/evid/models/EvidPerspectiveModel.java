package hr.adriacomsoftware.app.client.smartgwt.evid.models;

import hr.adriacomsoftware.inf.client.smartgwt.desktop.perspective.xml.AS2NavigationPaneSectionDaoModel;

public class EvidPerspectiveModel extends AS2NavigationPaneSectionDaoModel {

	public static final String DEFAULT_PERSPECTIVE_NAME = "evidencijadolazaka";
	public static final String DEFAULT_PERSPECTIVE_DISPLAY_NAME = "Evidencija dolazaka";
	
	private static EvidPerspectiveModel instance = new EvidPerspectiveModel("EvidPerspectiveModel");
	public static EvidPerspectiveModel getInstance() {
		return instance;
	}

	public EvidPerspectiveModel(String id) {
		super(id);
	}

	public String getSectionName() {
		return DEFAULT_PERSPECTIVE_DISPLAY_NAME;
	}

	@Override
	public String getDefaultPerspectiveName() {
		return DEFAULT_PERSPECTIVE_NAME;
	}

//	@Override
//	public HashMap<String, String> getFetchOperationProperties() {
//		HashMap<String,String> params = new HashMap<String,String>();
//		params.put(REMOTE_METHOD,getRemoteMethod());
//		params.put(REMOTE_OBJECT,getRemoteObject());
//		params.put(TRANSFORM_TO,getTransformTo());
//		params.put(MODEL, this.getID());
//		params.put(APLIKACIJA, AS2ClientContext.getSessionValue(AS2ClientContext.APPLICATION_ID));
//		return params;
//	}
}
