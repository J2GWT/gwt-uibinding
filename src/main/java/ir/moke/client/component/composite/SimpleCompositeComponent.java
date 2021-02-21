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

package ir.moke.client.component.composite;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.Widget;

public class SimpleCompositeComponent extends Composite {

    interface SimpleCompositeComponentBinder extends UiBinder<Widget, SimpleCompositeComponent> {
    }

    private static final SimpleCompositeComponentBinder uiBinder = GWT.create(SimpleCompositeComponentBinder.class);

    @UiField
    ListBox listBox;

    public SimpleCompositeComponent(String... colors) {
        initWidget(uiBinder.createAndBindUi(this));
        for (String c : colors) {
            listBox.addItem(c);
        }
    }
}
