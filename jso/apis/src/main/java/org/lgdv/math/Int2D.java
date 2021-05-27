package org.lgdv.math;

import org.lgdv.JSON;

/**
 * Store an integer position
 * 
 * @author frank
 *
 */
public class Int2D implements JSON.Stringable{
    public final int x;
    public final int y;

    public Int2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toJSON(){
        return "{\"x\":" + this.x + ",\"y\":"+this.y+"}";
    }
}
