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

public class Sprite {
    private static int serial = 10000000;
    public final String type;
    public final MapGame mapGame;
    final String uID;
    int row;
    int column;
    private boolean removed;

    Sprite(MapGame mapGame, String type, int c, int r) {
        this("sprite_", mapGame, type, c, r);
    }

    protected Sprite(String uIDPrefix, MapGame mapGame, String type, int c, int r){
        this.type = type;
        this.uID = uIDPrefix + serial++;
        this.row = r;
        this.column = c;
        this.mapGame = mapGame;
        System.out.println("Created:" + this.uID);
    }

    public int getColumn() {
        return column;
    }

    public int getRow() {
        return row;
    }

    public boolean wasRemoved(){
        return removed;
    }

    public void moveToTile(int c, int r) {
        row = r;
        column = c;
        postMoveCommand(c, r, "moveToTile");
    }

    public void moveTo(int x, int y) {
        postMoveCommand(x, y, "moveTo");
    }

    public void remove(){
        mapGame._remove(this);
        removed = true;
    }

    void postMoveCommand(int x, int y, String moveTo) {
        RPCTileMessage reply = CodeBlocks.createJSObject();
        reply.setCommand(moveTo);
        reply.setC(x);
        reply.setR(y);
        reply.setID(this.uID);
        CodeBlocks.postMessage(reply);
    }
}
