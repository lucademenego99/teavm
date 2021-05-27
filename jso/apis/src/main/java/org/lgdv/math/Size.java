package org.lgdv.math;

import org.lgdv.JSON;

/**
 * Store an integer size
 * 
 * @author frank
 *
 */
public class Size implements JSON.Stringable {
    public final int width;
    public final int height;

    public Size(int w, int h) {
        this.width = w;
        this.height = h;
    }

    public String toJSON(){
        return "{\"width\":"+width+", \"height\":"+height+"}";
    }
}
