package com.google.firebase.storage.internal;

import android.net.Uri;
import android.text.TextUtils;
import v9.o;
/* loaded from: classes.dex */
public class Slashes {
    public static String normalizeSlashes(String str) {
        String[] split;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (!str.startsWith("/") && !str.endsWith("/") && !str.contains("//")) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        for (String str2 : str.split("/", -1)) {
            if (!TextUtils.isEmpty(str2)) {
                if (sb2.length() > 0) {
                    sb2.append("/");
                    sb2.append(str2);
                } else {
                    sb2.append(str2);
                }
            }
        }
        return sb2.toString();
    }

    public static String preserveSlashEncode(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return slashize(Uri.encode(str));
    }

    public static String slashize(String str) {
        o.h(str);
        return str.replace("%2F", "/");
    }
}
