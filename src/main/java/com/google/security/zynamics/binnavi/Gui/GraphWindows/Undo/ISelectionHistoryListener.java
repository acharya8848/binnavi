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

package com.google.security.zynamics.binnavi.Gui.GraphWindows.Undo;

/**
 * Interface for listener objects that want to be notified about changes in selection histories.
 */
public interface ISelectionHistoryListener {
  /**
   * Signals the end of a Redo operation.
   */
  void finishedRedo();

  /**
   * Signals the end of an Undo operation.
   */
  void finishedUndo();

  /**
   * Invoked after a snapshot was added to the selection history.
   *
   * @param snapshot The added snapshot.
   */
  void snapshotAdded(CSelectionSnapshot snapshot);

  /**
   * Invoked after a snapshot was removed from the selection history.
   */
  void snapshotRemoved();

  /**
   * Signals the start of a Redo operation.
   */
  void startedRedo();

  /**
   * Signals the start of an Undo operation.
   */
  void startedUndo();
}
