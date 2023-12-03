package com.google.firebase.database.util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONStringer;
import org.json.JSONTokener;
/* loaded from: classes.dex */
public class JsonMapper {
    public static Map<String, Object> parseJson(String str) {
        try {
            return unwrapJsonObject(new JSONObject(str));
        } catch (JSONException e10) {
            throw new IOException(e10);
        }
    }

    public static Object parseJsonValue(String str) {
        try {
            return unwrapJson(new JSONTokener(str).nextValue());
        } catch (JSONException e10) {
            throw new IOException(e10);
        }
    }

    public static String serializeJson(Map<String, Object> map) {
        return serializeJsonValue(map);
    }

    public static String serializeJsonValue(Object obj) {
        if (obj == null) {
            return "null";
        }
        if (obj instanceof String) {
            return JSONObject.quote((String) obj);
        }
        if (obj instanceof Number) {
            try {
                return JSONObject.numberToString((Number) obj);
            } catch (JSONException e10) {
                throw new IOException("Could not serialize number", e10);
            }
        } else if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue() ? "true" : "false";
        } else {
            try {
                JSONStringer jSONStringer = new JSONStringer();
                serializeJsonValue(obj, jSONStringer);
                return jSONStringer.toString();
            } catch (JSONException e11) {
                throw new IOException("Failed to serialize JSON", e11);
            }
        }
    }

    private static Object unwrapJson(Object obj) {
        if (obj instanceof JSONObject) {
            return unwrapJsonObject((JSONObject) obj);
        }
        if (obj instanceof JSONArray) {
            return unwrapJsonArray((JSONArray) obj);
        }
        if (obj.equals(JSONObject.NULL)) {
            return null;
        }
        return obj;
    }

    private static List<Object> unwrapJsonArray(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i6 = 0; i6 < jSONArray.length(); i6++) {
            arrayList.add(unwrapJson(jSONArray.get(i6)));
        }
        return arrayList;
    }

    private static Map<String, Object> unwrapJsonObject(JSONObject jSONObject) {
        HashMap hashMap = new HashMap(jSONObject.length());
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, unwrapJson(jSONObject.get(next)));
        }
        return hashMap;
    }

    private static void serializeJsonValue(Object obj, JSONStringer jSONStringer) {
        if (obj instanceof Map) {
            jSONStringer.object();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                jSONStringer.key((String) entry.getKey());
                serializeJsonValue(entry.getValue(), jSONStringer);
            }
            jSONStringer.endObject();
        } else if (obj instanceof Collection) {
            jSONStringer.array();
            for (Object obj2 : (Collection) obj) {
                serializeJsonValue(obj2, jSONStringer);
            }
            jSONStringer.endArray();
        } else {
            jSONStringer.value(obj);
        }
    }
}
