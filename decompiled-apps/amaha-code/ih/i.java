package ih;

import hh.g;
import org.json.JSONObject;
import qg.t;
/* compiled from: Event.kt */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final String f20088a;

    /* renamed from: b  reason: collision with root package name */
    public final JSONObject f20089b;

    /* renamed from: c  reason: collision with root package name */
    public final String f20090c;

    /* renamed from: d  reason: collision with root package name */
    public final long f20091d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f20092e;

    public i(JSONObject jSONObject, String name) {
        kotlin.jvm.internal.i.g(name, "name");
        this.f20088a = name;
        this.f20089b = jSONObject;
        boolean z10 = true;
        if (jSONObject.has("EVENT_G_TIME") && jSONObject.has("EVENT_L_TIME")) {
            try {
                jSONObject.put("EVENT_ACTION", name);
            } catch (Exception e10) {
                xg.i iVar = new xg.i(0);
                hh.a aVar = hh.g.f17610d;
                g.a.a(1, e10, iVar);
            }
        } else {
            String l2 = Long.toString(System.currentTimeMillis());
            String a10 = xg.j.a();
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("EVENT_ACTION", name);
                jSONObject2.put("EVENT_ATTRS", jSONObject.toString());
                jSONObject2.put("EVENT_G_TIME", l2);
                jSONObject2.put("EVENT_L_TIME", a10);
                jSONObject = jSONObject2;
            } catch (Exception e11) {
                xg.i iVar2 = new xg.i(1);
                hh.a aVar2 = hh.g.f17610d;
                g.a.a(1, e11, iVar2);
                jSONObject = null;
            }
        }
        String jSONObject3 = jSONObject.toString();
        kotlin.jvm.internal.i.f(jSONObject3, "getDataPointJson(name, attributes).toString()");
        this.f20090c = jSONObject3;
        this.f20091d = System.currentTimeMillis();
        kotlin.jvm.internal.h hVar = new kotlin.jvm.internal.h();
        try {
            JSONObject jSONObject4 = new JSONObject(jSONObject3);
            if (jSONObject4.has("N_I_E")) {
                z10 = jSONObject4.getInt("N_I_E") == 0;
            }
        } catch (Exception e12) {
            hh.a aVar3 = hh.g.f17610d;
            g.a.a(1, e12, new t(hVar));
        }
        this.f20092e = z10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Event{name='");
        sb2.append(this.f20088a);
        sb2.append("', attributes=");
        sb2.append(this.f20089b);
        sb2.append(", isInteractiveEvent=");
        return defpackage.c.t(sb2, this.f20092e, '}');
    }
}
