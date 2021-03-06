/**
 * Copyright Intellectual Reserve, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.gedcomx.rt.json;

/**
 * Interface for objects that support access by a JSON map instead of access by a list when a list of the objects are supplied.
 *
 * @author Ryan Heaton
 */
public interface HasJsonKey {

  /**
   * Whether the json-keyed value is supposed to have a unique key in the list.
   *
   * @return Whether the json-keyed value is supposed to have a unique key in the list.
   */
  boolean isHasUniqueKey();

  /**
   * The JSON key in the map for this object.
   *
   * @return The key in the map.
   */
  String getJsonKey();

  /**
   * The JSON key in the map for this object.
   *
   * @param jsonKey The key in the map.
   */
  void setJsonKey(String jsonKey);

}
