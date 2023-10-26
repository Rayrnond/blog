/*
 *  Copyright 2023 Raymond Pattend & Narro LLC. All rights reserved.
 */

package org.narroproject.blogprj.utilities.objects.blog.helpers;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.text.SimpleDateFormat;
import java.util.Date;

@AllArgsConstructor@Builder@Setter@Getter
public class BMetaData {

    private String title;
    private String subtitle;
    private String thumbnail;
    private boolean available;
    private long timestamp;

    public String getNiceDate() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMMMM dd, yyyy");
        return simpleDateFormat.format(new Date(timestamp));
    }

}
