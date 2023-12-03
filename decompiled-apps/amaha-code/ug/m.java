package ug;

import android.location.Location;
import com.google.firebase.database.core.ServerValues;
import gv.r;
import hh.g;
import java.util.Date;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: PropertiesBuilder.kt */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final JSONObject f34143a = new JSONObject();

    /* renamed from: b  reason: collision with root package name */
    public final JSONObject f34144b = new JSONObject();

    /* renamed from: c  reason: collision with root package name */
    public boolean f34145c = true;

    /* compiled from: PropertiesBuilder.kt */
    /* loaded from: classes.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.a<String> {
        public a() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            m.this.getClass();
            return kotlin.jvm.internal.i.n(" putAttrDate() ", "Core_PropertiesBuilder");
        }
    }

    /* compiled from: PropertiesBuilder.kt */
    /* loaded from: classes.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.a<String> {
        public b() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            m.this.getClass();
            return kotlin.jvm.internal.i.n(" putAttrLocation() ", "Core_PropertiesBuilder");
        }
    }

    /* compiled from: PropertiesBuilder.kt */
    /* loaded from: classes.dex */
    public static final class c extends kotlin.jvm.internal.k implements ss.a<String> {
        public c() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            m.this.getClass();
            return kotlin.jvm.internal.i.n(" putAttrLocation() ", "Core_PropertiesBuilder");
        }
    }

    public static void g(String str) {
        if (!gv.n.B0(str)) {
            return;
        }
        throw new IllegalStateException("Attribute name should not be blank.".toString());
    }

    public final JSONObject a() {
        boolean z10;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = this.f34143a;
        boolean z11 = false;
        if (jSONObject2.length() > 0) {
            jSONObject.put("EVENT_ATTRS", jSONObject2.toString());
            z10 = false;
        } else {
            z10 = true;
        }
        JSONObject jSONObject3 = this.f34144b;
        if (jSONObject3.length() > 0) {
            jSONObject.put("EVENT_ATTRS_CUST", jSONObject3.toString());
        } else {
            z11 = z10;
        }
        if (z11) {
            jSONObject.put("EVENT_ATTRS", new JSONObject().toString());
        }
        jSONObject.put("EVENT_G_TIME", String.valueOf(System.currentTimeMillis())).put("EVENT_L_TIME", xg.j.a());
        if (!this.f34145c) {
            jSONObject.put("N_I_E", 1);
        }
        return jSONObject;
    }

    public final void b(String attrName, Date attrValue) {
        JSONArray jSONArray;
        kotlin.jvm.internal.i.g(attrName, "attrName");
        kotlin.jvm.internal.i.g(attrValue, "attrValue");
        try {
            g(attrName);
            JSONObject jSONObject = this.f34144b;
            if (jSONObject.has(ServerValues.NAME_OP_TIMESTAMP)) {
                jSONArray = jSONObject.getJSONArray(ServerValues.NAME_OP_TIMESTAMP);
            } else {
                jSONArray = new JSONArray();
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(r.i1(attrName).toString(), attrValue.getTime());
            jSONArray.put(jSONObject2);
            jSONObject.put(ServerValues.NAME_OP_TIMESTAMP, jSONArray);
        } catch (Exception e10) {
            hh.a aVar = hh.g.f17610d;
            g.a.a(1, e10, new a());
        }
    }

    public final void c(long j10, String str) {
        JSONArray jSONArray;
        try {
            g(str);
            JSONObject jSONObject = this.f34144b;
            if (jSONObject.has(ServerValues.NAME_OP_TIMESTAMP)) {
                jSONArray = jSONObject.getJSONArray(ServerValues.NAME_OP_TIMESTAMP);
            } else {
                jSONArray = new JSONArray();
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(r.i1(str).toString(), j10);
            jSONArray.put(jSONObject2);
            jSONObject.put(ServerValues.NAME_OP_TIMESTAMP, jSONArray);
        } catch (Exception e10) {
            hh.a aVar = hh.g.f17610d;
            g.a.a(1, e10, new n(this));
        }
    }

    public final void d(String attrName, Location attrValue) {
        JSONArray jSONArray;
        kotlin.jvm.internal.i.g(attrName, "attrName");
        kotlin.jvm.internal.i.g(attrValue, "attrValue");
        try {
            g(attrName);
            JSONObject jSONObject = this.f34144b;
            if (jSONObject.has("location")) {
                jSONArray = jSONObject.getJSONArray("location");
            } else {
                jSONArray = new JSONArray();
            }
            JSONObject jSONObject2 = new JSONObject();
            String obj = r.i1(attrName).toString();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(attrValue.getLatitude());
            sb2.append(',');
            sb2.append(attrValue.getLongitude());
            jSONObject2.put(obj, sb2.toString());
            jSONArray.put(jSONObject2);
            jSONObject.put("location", jSONArray);
        } catch (Exception e10) {
            hh.a aVar = hh.g.f17610d;
            g.a.a(1, e10, new c());
        }
    }

    public final void e(String attrName, fi.c attrValue) {
        JSONArray jSONArray;
        kotlin.jvm.internal.i.g(attrName, "attrName");
        kotlin.jvm.internal.i.g(attrValue, "attrValue");
        try {
            g(attrName);
            JSONObject jSONObject = this.f34144b;
            if (jSONObject.has("location")) {
                jSONArray = jSONObject.getJSONArray("location");
            } else {
                jSONArray = new JSONArray();
            }
            JSONObject jSONObject2 = new JSONObject();
            String obj = r.i1(attrName).toString();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(attrValue.f15058a);
            sb2.append(',');
            sb2.append(attrValue.f15059b);
            jSONObject2.put(obj, sb2.toString());
            jSONArray.put(jSONObject2);
            jSONObject.put("location", jSONArray);
        } catch (Exception e10) {
            hh.a aVar = hh.g.f17610d;
            g.a.a(1, e10, new b());
        }
    }

    public final void f(Object attrValue, String attrName) {
        kotlin.jvm.internal.i.g(attrName, "attrName");
        kotlin.jvm.internal.i.g(attrValue, "attrValue");
        try {
            g(attrName);
            if (kotlin.jvm.internal.i.b(attrName, "moe_non_interactive") && (attrValue instanceof Integer) && kotlin.jvm.internal.i.b(attrValue, 1)) {
                this.f34145c = false;
            } else {
                this.f34143a.put(r.i1(attrName).toString(), attrValue);
            }
        } catch (Exception e10) {
            hh.a aVar = hh.g.f17610d;
            g.a.a(1, e10, new q(this));
        }
    }
}
