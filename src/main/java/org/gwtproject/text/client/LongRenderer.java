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

import com.google.gwt.i18n.client.NumberFormat;
import org.gwtproject.text.shared.AbstractRenderer;
import org.gwtproject.text.shared.Renderer;

/**
 * A localized renderer based on {@link NumberFormat#getDecimalFormat}.
 */
public class LongRenderer extends AbstractRenderer<Long> {
  private static LongRenderer INSTANCE;

  /**
   * Returns the instance.
   */
  public static Renderer<Long> instance() {
    if (INSTANCE == null) {
      INSTANCE = new LongRenderer();
    }
    return INSTANCE;
  }

  protected LongRenderer() {
  }

  public String render(Long object) {
    if (object == null) {
      return "";
    }

    return NumberFormat.getDecimalFormat().format(object);
  }
}
