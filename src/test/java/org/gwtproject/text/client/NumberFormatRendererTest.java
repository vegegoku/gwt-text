/*
 * Copyright © 2018 The GWT Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.gwtproject.text.client;

import org.gwtproject.i18n.client.NumberFormat;
import com.google.gwt.junit.client.GWTTestCase;

/** Eponymous unit test. */
public class NumberFormatRendererTest extends GWTTestCase {

  @Override
  public String getModuleName() {
    return "org.gwtproject.text.Text";
  }

  public void testDefault() {
    assertEquals(
        NumberFormat.getDecimalFormat().format(Math.PI),
        new NumberFormatRenderer().render(Math.PI));
  }

  public void testScientific() {
    assertEquals(
        NumberFormat.getScientificFormat().format(Math.PI),
        new NumberFormatRenderer(NumberFormat.getScientificFormat()).render(Math.PI));
  }

  public void testNull() {
    assertEquals("", new NumberFormatRenderer().render(null));
  }
}
