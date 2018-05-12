/*
 * Copyright 2010 Google Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.gwtproject.text.client;


import org.gwtproject.i18n.client.DateTimeFormat;
import org.gwtproject.i18n.client.TimeZone;
import org.gwtproject.text.shared.AbstractRenderer;

import java.util.Date;

import static org.gwtproject.i18n.client.DateTimeFormat.PredefinedFormat;
import static org.gwtproject.i18n.client.DateTimeFormat.getFormat;


/**
 * Renders {@link Date} objects with a {@link DateTimeFormat}.
 */
public class DateTimeFormatRenderer extends AbstractRenderer<Date> {
  private final DateTimeFormat format;
  private final TimeZone timeZone;

  /**
   * Create an instance using {@link PredefinedFormat#DATE_SHORT}.
   */
  public DateTimeFormatRenderer() {
    this(getFormat(DateTimeFormat.PredefinedFormat.DATE_SHORT));
  }
  
  /**
   * Create an instance with the given format and the default time zone.
   */
  public DateTimeFormatRenderer(DateTimeFormat format) {
    this(format, null);
  }

  /**
   * Create an instance with the given format and time zone.
   */
  public DateTimeFormatRenderer(DateTimeFormat format, TimeZone timeZone) {
    assert format != null;
    this.format = format;
    this.timeZone = timeZone;
  }

  public String render(Date object) {
    if (object == null) {
      return "";
    }
    return format.format(object, timeZone);
  }
}
