package lj;

import android.database.Cursor;
import android.os.Bundle;
import hh.g;
import ih.p;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: MarshallingHelper.kt */
/* loaded from: classes.dex */
public final class c {

    /* compiled from: MarshallingHelper.kt */
    /* loaded from: classes.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.a<String> {
        public a() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            c.this.getClass();
            return kotlin.jvm.internal.i.n(" jsonToBundle() : ", "PushBase_6.6.0_MarshallingHelper");
        }
    }

    /* compiled from: MarshallingHelper.kt */
    /* loaded from: classes.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.a<String> {
        public b() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            c.this.getClass();
            return kotlin.jvm.internal.i.n(" templateBundleFromCursor() : ", "PushBase_6.6.0_MarshallingHelper");
        }
    }

    /* compiled from: MarshallingHelper.kt */
    /* renamed from: lj.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0386c extends kotlin.jvm.internal.k implements ss.a<String> {
        public C0386c() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            c.this.getClass();
            return kotlin.jvm.internal.i.n(" notificationBundleFromCursor() : ", "PushBase_6.6.0_MarshallingHelper");
        }
    }

    public final Bundle a(JSONObject jSONObject) {
        Bundle bundle = new Bundle();
        try {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object obj = jSONObject.get(next);
                if (obj instanceof String) {
                    bundle.putString(next, (String) obj);
                } else if (obj instanceof Integer) {
                    bundle.putInt(next, ((Number) obj).intValue());
                } else if (obj instanceof Boolean) {
                    bundle.putBoolean(next, ((Boolean) obj).booleanValue());
                } else if (obj instanceof Double) {
                    bundle.putDouble(next, ((Number) obj).doubleValue());
                } else if (obj instanceof Float) {
                    bundle.putFloat(next, ((Number) obj).floatValue());
                } else if (obj instanceof Long) {
                    bundle.putLong(next, ((Number) obj).longValue());
                } else if (obj instanceof JSONObject) {
                    a((JSONObject) obj);
                }
            }
        } catch (JSONException e10) {
            hh.a aVar = hh.g.f17610d;
            g.a.a(1, e10, new a());
        }
        return bundle;
    }

    public final Bundle b(p sdkInstance, Cursor cursor) {
        kotlin.jvm.internal.i.g(sdkInstance, "sdkInstance");
        try {
            int columnIndex = cursor.getColumnIndex("campaign_payload");
            if (columnIndex != -1) {
                return a(new JSONObject(cursor.getString(columnIndex)));
            }
            return null;
        } catch (Exception e10) {
            hh.a aVar = hh.g.f17610d;
            g.a.a(1, e10, new b());
            return null;
        }
    }

    public final pj.b c(p sdkInstance, Cursor cursor) {
        kotlin.jvm.internal.i.g(sdkInstance, "sdkInstance");
        try {
            int columnIndex = cursor.getColumnIndex("campaign_payload");
            if (columnIndex != -1) {
                return new h(sdkInstance).d(a(new JSONObject(cursor.getString(columnIndex))));
            }
            return null;
        } catch (Exception e10) {
            hh.a aVar = hh.g.f17610d;
            g.a.a(1, e10, new C0386c());
            return null;
        }
    }
}
