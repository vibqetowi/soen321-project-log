package com.ifriend.common_utils.extensions;

import androidx.exifinterface.media.ExifInterface;
import java.util.Iterator;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.client.config.CookieSpecs;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: json.kt */
@Metadata(d1 = {"\u0000 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a$\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\u0006\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0086\b¢\u0006\u0002\u0010\u0005\u001a\u0019\u0010\u0006\u001a\u00020\u0002*\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0086\u0002\u001a\u0019\u0010\b\u001a\u00020\t*\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0086\u0002\u001a\u001c\u0010\n\u001a\u00020\u000b*\u00020\u00022\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000bH\u0007\u001a\"\u0010\u000e\u001a\u0004\u0018\u00010\u0004*\u00020\u00022\u0006\u0010\f\u001a\u00020\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004H\u0007¨\u0006\u000f"}, d2 = {"getOrNull", ExifInterface.GPS_DIRECTION_TRUE, "Lorg/json/JSONObject;", "key", "", "(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Object;", "plus", "another", "plusAssign", "", "safeGetBoolean", "", "name", CookieSpecs.DEFAULT, "safeGetString", "common_utils"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class JsonKt {
    public static final /* synthetic */ <T> T getOrNull(JSONObject jSONObject, String key) {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        if (jSONObject.has(key)) {
            T t = (T) jSONObject.get(key);
            Intrinsics.reifiedOperationMarker(3, ExifInterface.GPS_DIRECTION_TRUE);
            if (t instanceof Object) {
                return t;
            }
            return null;
        }
        return null;
    }

    public static /* synthetic */ String safeGetString$default(JSONObject jSONObject, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return safeGetString(jSONObject, str, str2);
    }

    @Deprecated(message = "Use generic function instead", replaceWith = @ReplaceWith(expression = "getOrNull<String>(name)", imports = {}))
    public static final String safeGetString(JSONObject jSONObject, String name, String str) {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        try {
            return jSONObject.getString(name);
        } catch (JSONException unused) {
            return str;
        }
    }

    @Deprecated(message = "Use generic function instead", replaceWith = @ReplaceWith(expression = "getOrNull<Boolean>(name)", imports = {}))
    public static final boolean safeGetBoolean(JSONObject jSONObject, String name, boolean z) {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        try {
            return jSONObject.getBoolean(name);
        } catch (JSONException unused) {
            return z;
        }
    }

    public static final JSONObject plus(JSONObject jSONObject, JSONObject jSONObject2) {
        Unit unit;
        Iterator<String> keys;
        Iterator<String> keys2;
        JSONObject jSONObject3 = new JSONObject();
        Unit unit2 = null;
        if (jSONObject == null || (keys2 = jSONObject.keys()) == null) {
            unit = null;
        } else {
            while (keys2.hasNext()) {
                String next = keys2.next();
                jSONObject3.put(next, jSONObject.get(next));
            }
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            return jSONObject2 == null ? jSONObject3 : jSONObject2;
        }
        if (jSONObject2 != null && (keys = jSONObject2.keys()) != null) {
            while (keys.hasNext()) {
                String next2 = keys.next();
                jSONObject3.put(next2, jSONObject2.get(next2));
            }
            unit2 = Unit.INSTANCE;
        }
        return unit2 == null ? jSONObject : jSONObject3;
    }

    public static final void plusAssign(JSONObject jSONObject, JSONObject jSONObject2) {
        Iterator<String> keys;
        if (jSONObject2 == null || (keys = jSONObject2.keys()) == null) {
            return;
        }
        while (keys.hasNext()) {
            String next = keys.next();
            if (jSONObject != null) {
                jSONObject.put(next, jSONObject2.get(next));
            }
        }
    }
}
