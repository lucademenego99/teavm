/*
 *  Copyright 2021 frank bauer.
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
package de.fau.tf.lgdv.phaser;

import de.fau.tf.lgdv.CodeBlocks;

public class AnimatedSprite extends Sprite{
    AnimatedSprite(MapGame mapGame, String type, int c, int r) {
        super("sprite_", mapGame, type, c, r);
    }

    protected void onFinishedAnimation(){}

    public void play(){
        RPCIDMessage reply = CodeBlocks.createJSObject();
        reply.setCommand("startAnimation");
        reply.setID(this.uID);
        CodeBlocks.postMessage(reply);
    }

    public void stop(){
        RPCIDMessage reply = CodeBlocks.createJSObject();
        reply.setCommand("stopAnimation");
        reply.setID(this.uID);
        CodeBlocks.postMessage(reply);
    }
}
