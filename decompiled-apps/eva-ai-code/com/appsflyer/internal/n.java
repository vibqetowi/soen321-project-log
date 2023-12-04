package com.appsflyer.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.util.Base64;
import com.appsflyer.AFLogger;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public final class n {
    String AFInAppEventParameterName;
    String AFInAppEventType;
    bt AFKeystoreWrapper;
    String valueOf;
    private byte[] values;

    public n() {
    }

    public static JSONObject AFInAppEventType(Map<String, ?> map) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, ?> entry : map.entrySet()) {
            try {
                jSONObject.put(entry.getKey(), valueOf(entry.getValue()));
            } catch (JSONException unused) {
            }
        }
        return jSONObject;
    }

    private static Object valueOf(Object obj) {
        if (obj == null) {
            return JSONObject.NULL;
        }
        if ((obj instanceof JSONArray) || (obj instanceof JSONObject) || obj.equals(JSONObject.NULL)) {
            return obj;
        }
        try {
            if (obj instanceof Collection) {
                JSONArray jSONArray = new JSONArray();
                for (Object obj2 : (Collection) obj) {
                    jSONArray.put(valueOf(obj2));
                }
                return jSONArray;
            } else if (obj.getClass().isArray()) {
                int length = Array.getLength(obj);
                JSONArray jSONArray2 = new JSONArray();
                for (int i = 0; i < length; i++) {
                    jSONArray2.put(valueOf(Array.get(obj, i)));
                }
                return jSONArray2;
            } else if (obj instanceof Map) {
                return AFInAppEventType((Map) obj);
            } else {
                return ((obj instanceof Boolean) || (obj instanceof Byte) || (obj instanceof Character) || (obj instanceof Double) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Short) || (obj instanceof String)) ? obj : obj.toString();
            }
        } catch (Exception unused) {
            return JSONObject.NULL;
        }
    }

    public static Map<String, Object> valueOf(JSONObject jSONObject) throws JSONException {
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof JSONArray) {
                obj = values((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = valueOf((JSONObject) obj);
            }
            hashMap.put(next, obj);
        }
        return hashMap;
    }

    private static List<Object> values(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            Object obj = jSONArray.get(i);
            if (obj instanceof JSONArray) {
                obj = values((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = valueOf((JSONObject) obj);
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static cj AFInAppEventParameterName(Context context) {
        if (context instanceof Activity) {
            return cj.activity;
        }
        if (context instanceof Application) {
            return cj.application;
        }
        return cj.other;
    }

    private n(String str, byte[] bArr, String str2, bt btVar) {
        this.valueOf = str;
        this.values = bArr;
        this.AFInAppEventType = str2;
        this.AFKeystoreWrapper = btVar;
    }

    @Deprecated
    public n(String str, byte[] bArr, String str2) {
        this(str, bArr, str2, null);
    }

    public n(char[] cArr) {
        Scanner scanner = new Scanner(new String(cArr));
        int i = 0;
        int i2 = 0;
        while (scanner.hasNextLine()) {
            String nextLine = scanner.nextLine();
            if (nextLine.startsWith("url=")) {
                this.valueOf = nextLine.substring(4).trim();
            } else if (nextLine.startsWith("version=")) {
                this.AFInAppEventType = nextLine.substring(8).trim();
                Matcher matcher = Pattern.compile("^(0|[1-9]\\d*)\\.(0|[1-9]\\d*)\\.(0|[1-9]\\d*)(?:-((?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*)(?:\\.(?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*))*))?(?:\\+([0-9a-zA-Z-]+(?:\\.[0-9a-zA-Z-]+)*))?$").matcher(this.AFInAppEventType);
                if (matcher.matches()) {
                    i = Integer.parseInt(matcher.group(1));
                    i2 = Integer.parseInt(matcher.group(2));
                }
            } else if (nextLine.startsWith("data=")) {
                String trim = nextLine.substring(5).trim();
                this.values = (i > 4 || i2 >= 11) ? Base64.decode(trim, 2) : trim.getBytes();
            } else if (nextLine.startsWith("type=")) {
                String trim2 = nextLine.substring(5).trim();
                try {
                    this.AFKeystoreWrapper = bt.valueOf(trim2);
                } catch (Exception e) {
                    AFLogger.valueOf("CACHE: Unknown task type: ".concat(String.valueOf(trim2)), e);
                }
            }
        }
        scanner.close();
    }

    public final byte[] AFInAppEventParameterName() {
        return this.values;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            n nVar = (n) obj;
            String str = this.AFInAppEventType;
            if (str == null ? nVar.AFInAppEventType != null : !str.equals(nVar.AFInAppEventType)) {
                return false;
            }
            if (!Arrays.equals(this.values, nVar.values)) {
                return false;
            }
            String str2 = this.valueOf;
            if (str2 == null ? nVar.valueOf != null : !str2.equals(nVar.valueOf)) {
                return false;
            }
            String str3 = this.AFInAppEventParameterName;
            if (str3 == null ? nVar.AFInAppEventParameterName != null : !str3.equals(nVar.AFInAppEventParameterName)) {
                return false;
            }
            if (this.AFKeystoreWrapper == nVar.AFKeystoreWrapper) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.AFInAppEventType;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + Arrays.hashCode(this.values)) * 31;
        String str2 = this.valueOf;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.AFInAppEventParameterName;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        bt btVar = this.AFKeystoreWrapper;
        return hashCode3 + (btVar != null ? btVar.hashCode() : 0);
    }
}
