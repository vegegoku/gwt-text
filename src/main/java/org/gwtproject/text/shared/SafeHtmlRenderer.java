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
package org.gwtproject.text.shared;

import org.gwtproject.safehtml.shared.SafeHtml;
import org.gwtproject.safehtml.shared.SafeHtmlBuilder;

/**
 * An object that can render other objects of a particular type into safe HTML form. Allows
 * decoupling that is useful for a dependency-injection architecture.
 *
 * @param <T> the type to render
 */
public interface SafeHtmlRenderer<T> {

  /** Renders {@code object} as safe HTML. */
  SafeHtml render(T object);

  /** Renders {@code object} as safe HTML, appended directly to {@code builder}. */
  void render(T object, SafeHtmlBuilder builder);
}
