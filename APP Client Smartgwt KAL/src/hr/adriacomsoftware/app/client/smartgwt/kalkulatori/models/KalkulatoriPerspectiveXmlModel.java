/**
 * (C) Copyright 2010, 2011 upTick Pty Ltd
 *
 * Licensed under the terms of the GNU General Public License version 3
 * as published by the Free Software Foundation. You may obtain a copy of the
 * License at: http://www.gnu.org/copyleft/gpl.html
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package hr.adriacomsoftware.app.client.smartgwt.kalkulatori.models;

import hr.adriacomsoftware.inf.client.smartgwt.desktop.perspective.xml.AS2NavigationPaneSectionXmlModel;

public class KalkulatoriPerspectiveXmlModel extends AS2NavigationPaneSectionXmlModel {
  private static KalkulatoriPerspectiveXmlModel instance;
  public static KalkulatoriPerspectiveXmlModel getInstance() {
    if (instance == null) {
      instance = new KalkulatoriPerspectiveXmlModel("KalkulatoriPerspectiveXmlModel");
    }
    return instance;
  }

  public KalkulatoriPerspectiveXmlModel(String id) {
    super(id);
    DEFAULT_PERSPECTIVE_NAME="anuitetski_obracun";
    DEFAULT_PERSPECTIVE_DISPLAY_NAME="Anuitetski obračun";
    // the name of the default ListGrid item to select
    // see NavigationPaneSectionListGrid -> onDataArrived()
    // see MainPageView -> initNavigationPane()
    setDataURL(URL_PREFIX+"Kalkulatori", URL_SUFFIX);
  }
  public String getSectionName(){
	  return "Kalkulatori";
  }

@Override
public String getDefaultPerspectiveName() {
	return DEFAULT_PERSPECTIVE_NAME;

}
}
