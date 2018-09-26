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

import static org.gwtproject.i18n.client.DateTimeFormat.PredefinedFormat;

import com.google.gwt.junit.client.GWTTestCase;
import java.util.Date;
import org.gwtproject.i18n.client.DateTimeFormat;
import org.gwtproject.i18n.client.TimeZone;

/** Eponymous unit test. */
public class DateTimeFormatRendererTest extends GWTTestCase {

  @Override
  public String getModuleName() {
    return "org.gwtproject.text.Text";
  }

  public void testDefault() {
    Date d = new Date(39874748234L);

    assertEquals(
        DateTimeFormat.getFormat(DateTimeFormat.PredefinedFormat.DATE_SHORT).format(d),
        new DateTimeFormatRenderer().render(d));
  }

  public void testFull() {
    Date d = new Date(3983374748234L);
    DateTimeFormat f = DateTimeFormat.getFormat(DateTimeFormat.PredefinedFormat.DATE_FULL);
    TimeZone t = TimeZone.createTimeZone(180);

    assertEquals(f.format(d, t), new DateTimeFormatRenderer(f, t).render(d));
  }

  public void testNoTz() {
    Date d = new Date(3983374748234L);
    DateTimeFormat f = DateTimeFormat.getFormat(PredefinedFormat.DATE_FULL);

    assertEquals(f.format(d), new DateTimeFormatRenderer(f).render(d));
  }

  public void testNull() {
    assertEquals("", new DateTimeFormatRenderer().render(null));
  }
}
