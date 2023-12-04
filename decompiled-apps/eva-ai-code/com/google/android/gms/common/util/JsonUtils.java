package com.google.android.gms.common.util;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.lang3.StringUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes2.dex */
public final class JsonUtils {
    private static final Pattern zza = Pattern.compile("\\\\.");
    private static final Pattern zzb = Pattern.compile("[\\\\\"/\b\f\n\r\t]");

    private JsonUtils() {
    }

    public static boolean areJsonValuesEquivalent(Object obj, Object obj2) {
        if (obj == null && obj2 == null) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        if (!(obj instanceof JSONObject) || !(obj2 instanceof JSONObject)) {
            if (!(obj instanceof JSONArray) || !(obj2 instanceof JSONArray)) {
                return obj.equals(obj2);
            }
            JSONArray jSONArray = (JSONArray) obj;
            JSONArray jSONArray2 = (JSONArray) obj2;
            if (jSONArray.length() == jSONArray2.length()) {
                for (int i = 0; i < jSONArray.length(); i++) {
                    if (!areJsonValuesEquivalent(jSONArray.get(i), jSONArray2.get(i))) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        }
        JSONObject jSONObject = (JSONObject) obj;
        JSONObject jSONObject2 = (JSONObject) obj2;
        if (jSONObject.length() != jSONObject2.length()) {
            return false;
        }
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            if (!jSONObject2.has(next)) {
                return false;
            }
            try {
                Preconditions.checkNotNull(next);
            } catch (JSONException unused) {
            }
            if (!areJsonValuesEquivalent(jSONObject.get(next), jSONObject2.get(next))) {
                return false;
            }
        }
        return true;
    }

    public static String escapeString(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        Matcher matcher = zzb.matcher(str);
        StringBuffer stringBuffer = null;
        while (matcher.find()) {
            if (stringBuffer == null) {
                stringBuffer = new StringBuffer();
            }
            char charAt = matcher.group().charAt(0);
            if (charAt == '\f') {
                matcher.appendReplacement(stringBuffer, "\\\\f");
            } else if (charAt == '\r') {
                matcher.appendReplacement(stringBuffer, "\\\\r");
            } else if (charAt == '\"') {
                matcher.appendReplacement(stringBuffer, "\\\\\\\"");
            } else if (charAt == '/') {
                matcher.appendReplacement(stringBuffer, "\\\\/");
            } else if (charAt == '\\') {
                matcher.appendReplacement(stringBuffer, "\\\\\\\\");
            } else {
                switch (charAt) {
                    case '\b':
                        matcher.appendReplacement(stringBuffer, "\\\\b");
                        continue;
                    case '\t':
                        matcher.appendReplacement(stringBuffer, "\\\\t");
                        continue;
                    case '\n':
                        matcher.appendReplacement(stringBuffer, "\\\\n");
                        continue;
                }
            }
        }
        if (stringBuffer == null) {
            return str;
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    public static String unescapeString(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        String zza2 = zzc.zza(str);
        Matcher matcher = zza.matcher(zza2);
        StringBuffer stringBuffer = null;
        while (matcher.find()) {
            if (stringBuffer == null) {
                stringBuffer = new StringBuffer();
            }
            char charAt = matcher.group().charAt(1);
            if (charAt == '\"') {
                matcher.appendReplacement(stringBuffer, "\"");
            } else if (charAt == '/') {
                matcher.appendReplacement(stringBuffer, RemoteSettings.FORWARD_SLASH_STRING);
            } else if (charAt == '\\') {
                matcher.appendReplacement(stringBuffer, "\\\\");
            } else if (charAt == 'b') {
                matcher.appendReplacement(stringBuffer, "\b");
            } else if (charAt == 'f') {
                matcher.appendReplacement(stringBuffer, "\f");
            } else if (charAt == 'n') {
                matcher.appendReplacement(stringBuffer, "\n");
            } else if (charAt == 'r') {
                matcher.appendReplacement(stringBuffer, StringUtils.CR);
            } else if (charAt == 't') {
                matcher.appendReplacement(stringBuffer, "\t");
            } else {
                throw new IllegalStateException("Found an escaped character that should never be.");
            }
        }
        if (stringBuffer == null) {
            return zza2;
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }
}
