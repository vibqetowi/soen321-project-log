package com.google.firebase.database.connection;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class ConnectionUtils {
    public static void hardAssert(boolean z10) {
        hardAssert(z10, "", new Object[0]);
    }

    public static Long longFromObject(Object obj) {
        if (obj instanceof Integer) {
            return Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Long) {
            return (Long) obj;
        }
        return null;
    }

    public static String pathToString(List<String> list) {
        if (list.isEmpty()) {
            return "/";
        }
        StringBuilder sb2 = new StringBuilder();
        boolean z10 = true;
        for (String str : list) {
            if (!z10) {
                sb2.append("/");
            }
            sb2.append(str);
            z10 = false;
        }
        return sb2.toString();
    }

    public static List<String> stringToPath(String str) {
        ArrayList arrayList = new ArrayList();
        String[] split = str.split("/", -1);
        for (int i6 = 0; i6 < split.length; i6++) {
            if (!split[i6].isEmpty()) {
                arrayList.add(split[i6]);
            }
        }
        return arrayList;
    }

    public static void hardAssert(boolean z10, String str, Object... objArr) {
        if (z10) {
            return;
        }
        throw new AssertionError("hardAssert failed: " + String.format(str, objArr));
    }
}
