/*
 *  © 2023 Raymond Pattend & Narro LLC. All rights reserved.
 */

package org.narroproject.blogprj.utilities.objects.blog;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.Getter;
import lombok.Setter;
import org.narroproject.blogprj.utilities.objects.blog.helpers.BContent;
import org.narroproject.blogprj.utilities.objects.blog.helpers.BMetaData;
import org.narroproject.blogprj.utilities.objects.blog.helpers.BNote;

@Getter@Setter
public class BlogMarkdown {

    private final static Gson gson = new GsonBuilder().create(); // auto deserialized

    public static BlogMarkdown fromJson(String json) {
        return gson.fromJson(json, BlogMarkdown.class);
    }

    private String id;
    private BMetaData metadata;
    private BContent[] content;
    private BNote note;

}
