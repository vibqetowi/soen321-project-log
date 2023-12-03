package com.google.firebase.messaging;

import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.util.Arrays;
import java.util.MissingFormatArgumentException;
import org.json.JSONArray;
import org.json.JSONException;
/* compiled from: NotificationParams.java */
/* loaded from: classes.dex */
public final class v {

    /* renamed from: a  reason: collision with root package name */
    public final Bundle f9784a;

    public v(Bundle bundle) {
        this.f9784a = new Bundle(bundle);
    }

    public static boolean f(Bundle bundle) {
        if (!"1".equals(bundle.getString("gcm.n.e")) && !"1".equals(bundle.getString("gcm.n.e".replace("gcm.n.", "gcm.notification.")))) {
            return false;
        }
        return true;
    }

    public static String h(String str) {
        if (str.startsWith("gcm.n.")) {
            return str.substring(6);
        }
        return str;
    }

    public final boolean a(String str) {
        String e10 = e(str);
        if (!"1".equals(e10) && !Boolean.parseBoolean(e10)) {
            return false;
        }
        return true;
    }

    public final Integer b(String str) {
        String e10 = e(str);
        if (!TextUtils.isEmpty(e10)) {
            try {
                return Integer.valueOf(Integer.parseInt(e10));
            } catch (NumberFormatException unused) {
                Log.w("NotificationParams", "Couldn't parse value of " + h(str) + "(" + e10 + ") into an int");
                return null;
            }
        }
        return null;
    }

    public final JSONArray c(String str) {
        String e10 = e(str);
        if (!TextUtils.isEmpty(e10)) {
            try {
                return new JSONArray(e10);
            } catch (JSONException unused) {
                Log.w("NotificationParams", "Malformed JSON for key " + h(str) + ": " + e10 + ", falling back to default");
                return null;
            }
        }
        return null;
    }

    public final String d(Resources resources, String str, String str2) {
        String[] strArr;
        String e10 = e(str2);
        if (!TextUtils.isEmpty(e10)) {
            return e10;
        }
        String e11 = e(str2.concat("_loc_key"));
        if (TextUtils.isEmpty(e11)) {
            return null;
        }
        int identifier = resources.getIdentifier(e11, "string", str);
        if (identifier == 0) {
            Log.w("NotificationParams", h(str2.concat("_loc_key")) + " resource not found: " + str2 + " Default value will be used.");
            return null;
        }
        JSONArray c10 = c(str2.concat("_loc_args"));
        if (c10 == null) {
            strArr = null;
        } else {
            int length = c10.length();
            strArr = new String[length];
            for (int i6 = 0; i6 < length; i6++) {
                strArr[i6] = c10.optString(i6);
            }
        }
        if (strArr == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, strArr);
        } catch (MissingFormatArgumentException e12) {
            Log.w("NotificationParams", "Missing format argument for " + h(str2) + ": " + Arrays.toString(strArr) + " Default value will be used.", e12);
            return null;
        }
    }

    public final String e(String str) {
        String replace;
        Bundle bundle = this.f9784a;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            if (!str.startsWith("gcm.n.")) {
                replace = str;
            } else {
                replace = str.replace("gcm.n.", "gcm.notification.");
            }
            if (bundle.containsKey(replace)) {
                str = replace;
            }
        }
        return bundle.getString(str);
    }

    public final Bundle g() {
        boolean z10;
        Bundle bundle = this.f9784a;
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle.keySet()) {
            if (!str.startsWith("google.c.a.") && !str.equals("from")) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (!z10) {
                bundle2.remove(str);
            }
        }
        return bundle2;
    }
}
