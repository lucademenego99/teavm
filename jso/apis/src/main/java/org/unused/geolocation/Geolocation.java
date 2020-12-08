/*
 *  Copyright 2018 ScraM Team.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.unused.geolocation;

import org.teavm.jso.JSObject;

/**
 *
 * @author ScraM Team
 */
public abstract class Geolocation implements JSObject {
  public abstract void getCurrentPosition(PositionHandler positionHandler);
  public abstract void getCurrentPosition(PositionHandler positionHandler, PositionErrorHandler positionErrorHandler);
}
