/*
 *  Copyright 2020 frank.
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
package org.lgdv;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSObject;
import org.teavm.jso.browser.Window;

public class CodeBlocks {
    @JSBody(script = "return {  };")
    public static native <T extends JSObject> T createJSObject();

    public static void postMessage(JSObject message){
        Window.worker().postMessage(message);
    }

    public static CodeBlocksBaseMessage createBaseMessage(String cmd, int id){
        CodeBlocksBaseMessage msg = createJSObject();
        msg.setCommand(cmd);
        msg.setId(""+id);
        return msg;
    }
}
