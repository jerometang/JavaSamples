/*
 *  Copyright 2017 Quest Software Inc.
 *
 * ALL RIGHTS RESERVED.
 */

package com.jtang.pattern.bridge.systemPaint.image;

/**
 * Created by jtang on 6/9/2017.
 */
public class JPGImage extends Image {
    @Override
    public void parseFile(String fileName) {
        Matrix matrix = new Matrix();
        //imple the JPG image populate to matrix
        this.imp.doPaint(matrix);

        System.out.println("Done the JPG image paint for "  + fileName + " on "+ this.imp.getClass().getName());
    }
}
