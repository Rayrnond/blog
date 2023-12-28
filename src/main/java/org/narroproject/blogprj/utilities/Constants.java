/*
 *  Copyright 2023 Raymond Pattend & Narro LLC. All rights reserved.
 */

package org.narroproject.blogprj.utilities;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public class Constants {

    // Combination of JWK 1 and JWK 2 for api use
    public static String FULLJWK = "";

    public static String PRIVATE_KEY = "";

    public static String JWK = "{  \"kty\": \"RSA\",  \"n\": \"tL3qhoeh0Hcex5-atnZNTXr826mL-ar8-zCSraRM5OlneLfu7sgNx-s-1CIlTVb3-qv6bAEF-gTKdzwrySiYjax_BYjtfDdfB7D6CEpsQTpT4PhSddkNXi_vSdH6i3swFClLK9j7e5gpqaKT3LuJVKTFPIxBCNROhpcXwRqoWjzPEG5muk9qIMd0upjxhu4o3uk594uS14rrb7UFltagSPX0VYJkvbJ3vBsozRs-OxIe9EynUFt1ERb32GRSZqjhtnxV1OZW4UJ9Z2vWdoM5RTdUNX5dfIrEh8OMNtut0wIQd4BW0tdo1DvU3zR9QETQTl61WDaYgOOL9v_GrRDm-7Uq1n4teWXEMFKdnAmOKAV9At7txSAGe6UWQ1sE2VjfhnCb49TZwvvlx9a9_FBNibnDekn5ebCpkNSO-_qfHlMzZAFdOmh2wdUI6C5D9x1MvhFPGirk4XWDGdxqru-_Zu4RWeZHWKHB9cbT9JG6uOARHPGmednu74gX4PbZPGY3HvwAo26IPaOPwfrQ_fuDtQJ34auh5IeNeGPJgQLRMwk5vO8R-cvJho08ud9JeiFVRNrMc00UewiaH9unrNp_FgHjrlFA-Q-p0j64tSZuErQIiqbAo-Q_cJpo47aO59czwCeXNFIP2diewwJVeiric4qPd6kInOtoa51WqqExWeE\",  \"e\": \"AQAB\",  \"alg\": \"RS256\",  \"kid\": \"1\",  \"use\": \"sig\"}";


    static {
        JsonObject jsonObject = new JsonObject();
        JsonArray jsonArray = new JsonArray();
        jsonArray.add(new Gson().fromJson(JWK, JsonObject.class));
        jsonObject.add("keys", jsonArray);
        FULLJWK = jsonObject.toString();
    }

}
