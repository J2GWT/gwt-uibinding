/*
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package ir.moke.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.dom.client.Document;
import com.google.gwt.user.client.ui.RootPanel;
import ir.moke.client.component.basic.BasicNameBinder;
import ir.moke.client.component.composite.SimpleCompositeComponent;

public class gwt implements EntryPoint {

    @Override
    public void onModuleLoad() {
        BasicNameBinder basicNameBinder = new BasicNameBinder();
        Document.get().getBody().appendChild(basicNameBinder.getElement());
        basicNameBinder.setName("Mahdi");

        String[] colors = {"blue","red","yellow"};
        SimpleCompositeComponent simpleCompositeComponent = new SimpleCompositeComponent(colors);
        RootPanel.get().add(simpleCompositeComponent);
        
    }
}
