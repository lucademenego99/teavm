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

public class Figure extends Sprite{
    Figure(MapGame mapGame, String type, int c, int r) {
       super("figure_", mapGame, type, c, r);
    }

    protected void onEnterTile(int c, int r) { }
    protected void onLeaveTile(int c, int r) { }
    protected void onFinishedWalking() {}

    public void walkToTile(int c, int r) {
        postMoveCommand(c, r, "walkToTile");
    }

    public void walkTo(int c, int r) {
        postMoveCommand(c, r, "walkTo");
    }
}