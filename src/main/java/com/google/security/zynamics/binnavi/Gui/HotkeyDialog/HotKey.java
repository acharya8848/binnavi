// Copyright 2011-2016 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.security.zynamics.binnavi.Gui.HotkeyDialog;

import javax.swing.KeyStroke;

import com.google.common.base.Preconditions;

/**
 * Wrapper class for displaying hotkeys in the table.
 */
public final class HotKey {

  private final String description;
  private final KeyStroke keyStroke;

  public HotKey(final KeyStroke keyStroke, final String description) {
    this.keyStroke =
        Preconditions.checkNotNull(keyStroke, "IE02861: keyStroke argument can not be null");
    this.description =
        Preconditions.checkNotNull(description, "IE02862: description argument can not be null");
  }

  public String getDescription() {
    return description;
  }

  @Override
  public String toString() {
    return keyStroke.toString() + " " + description;
  }

  public KeyStroke getKeyStroke() {
    return keyStroke;
  }
}
