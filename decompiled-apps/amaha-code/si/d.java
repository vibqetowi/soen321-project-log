package si;

import hh.g;
import ni.r;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: FrequencyCapping.java */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f31586a;

    /* renamed from: b  reason: collision with root package name */
    public final long f31587b;

    /* renamed from: c  reason: collision with root package name */
    public final long f31588c;

    public d(long j10, long j11, boolean z10) {
        this.f31586a = z10;
        this.f31587b = j10;
        this.f31588c = j11;
    }

    public static JSONObject a(d dVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ignore_global_delay", dVar.f31586a).put("count", dVar.f31587b).put("delay", dVar.f31588c);
            return jSONObject;
        } catch (Exception e10) {
            r rVar = new r(11);
            hh.a aVar = hh.g.f17610d;
            g.a.a(1, e10, rVar);
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f31586a == dVar.f31586a && this.f31587b == dVar.f31587b && this.f31588c == dVar.f31588c) {
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
