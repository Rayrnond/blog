/*
 *  Copyright 2023 Raymond Pattend & Narro LLC. All rights reserved.
 */

package org.narroproject.blogprj.utilities.objects.blog.helpers;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter@Setter@Builder
public class BNote {

    private String title;
    private String subtitle;
    private String url;

}
