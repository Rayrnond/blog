/*
 *  Copyright 2023 Raymond Pattend & Narro LLC. All rights reserved.
 */

package org.narroproject.blogprj.utilities.objects.blog.helpers;

public enum BContentType {

    H1,
    H2,
    H3,
    H4,
    PARAGRAPH,
    IMAGE;

    public boolean isHeader() {
        return this == H1 || this == H2 || this == H3 || this == H4;
    }

    public boolean isH1() {
        return this == H1;
    }
    public boolean isH2() {
        return this == H2;
    }
    public boolean isH3() {
        return this == H3;
    }
    public boolean isH4() {
        return this == H4;
    }
    public boolean isParagraph() {
        return this == PARAGRAPH;
    }
    public boolean isImage() {
        return this == IMAGE;
    }



}
