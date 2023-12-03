package si;

import hh.g;
import ni.r;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: DeliveryControl.java */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final long f31583a;

    /* renamed from: b  reason: collision with root package name */
    public final d f31584b;

    public b(long j10, d dVar) {
        this.f31583a = j10;
        this.f31584b = dVar;
    }

    public static JSONObject a(b bVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("priority", bVar.f31583a).put("fc_meta", d.a(bVar.f31584b));
            return jSONObject;
        } catch (Exception e10) {
            r rVar = new r(9);
            hh.a aVar = hh.g.f17610d;
            g.a.a(1, e10, rVar);
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f31583a != bVar.f31583a) {
            return false;
        }
        d dVar = bVar.f31584b;
        d dVar2 = this.f31584b;
        if (dVar2 != null) {
            return dVar2.equals(dVar);
        }
        if (dVar == null) {
            return true;
        }
        return false;
    }

    public final String toString() {
        try {
            JSONObject a10 = a(this);
            if (a10 != null) {
                return a10.toString(4);
            }
        } catch (JSONException unused) {
        }
        return super.toString();
    }
}
