package p9;

import android.os.SystemClock;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.internal.zzal;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import m9.g;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
/* loaded from: classes.dex */
public final class l extends v.c {
    public static final String P;
    public k9.n A;
    public Long B;
    public j C;
    public final n D;
    public final n E;
    public final n F;
    public final n G;
    public final n H;
    public final n I;
    public final n J;
    public final n K;
    public final n L;
    public final n M;
    public final n N;
    public final n O;

    /* renamed from: z  reason: collision with root package name */
    public long f28040z;

    static {
        Pattern pattern = a.f28027a;
        P = "urn:x-cast:".concat("com.google.cast.media");
    }

    public l() {
        super(P);
        n nVar = new n(86400000L);
        this.D = nVar;
        n nVar2 = new n(86400000L);
        this.E = nVar2;
        n nVar3 = new n(86400000L);
        this.F = nVar3;
        n nVar4 = new n(86400000L);
        n nVar5 = new n(10000L);
        this.G = nVar5;
        n nVar6 = new n(86400000L);
        this.H = nVar6;
        n nVar7 = new n(86400000L);
        this.I = nVar7;
        n nVar8 = new n(86400000L);
        this.J = nVar8;
        n nVar9 = new n(86400000L);
        n nVar10 = new n(86400000L);
        n nVar11 = new n(86400000L);
        n nVar12 = new n(86400000L);
        this.K = nVar12;
        n nVar13 = new n(86400000L);
        n nVar14 = new n(86400000L);
        n nVar15 = new n(86400000L);
        this.L = nVar15;
        n nVar16 = new n(86400000L);
        this.N = nVar16;
        this.M = new n(86400000L);
        n nVar17 = new n(86400000L);
        n nVar18 = new n(86400000L);
        n nVar19 = new n(86400000L);
        this.O = nVar19;
        l(nVar);
        l(nVar2);
        l(nVar3);
        l(nVar4);
        l(nVar5);
        l(nVar6);
        l(nVar7);
        l(nVar8);
        l(nVar9);
        l(nVar10);
        l(nVar11);
        l(nVar12);
        l(nVar13);
        l(nVar14);
        l(nVar15);
        l(nVar16);
        l(nVar16);
        l(nVar17);
        l(nVar18);
        l(nVar19);
        A();
    }

    public static k B(JSONObject jSONObject) {
        MediaError.f0(jSONObject);
        k kVar = new k();
        if (jSONObject.has("customData")) {
            jSONObject.optJSONObject("customData");
        }
        return kVar;
    }

    public final void A() {
        this.f28040z = 0L;
        this.A = null;
        for (n nVar : (List) this.f34634y) {
            nVar.e(2002);
        }
    }

    public final void C() {
        synchronized (((List) this.f34634y)) {
            try {
                for (n nVar : (List) this.f34634y) {
                    nVar.e(2002);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        A();
    }

    public final long D() {
        MediaInfo mediaInfo;
        MediaInfo mediaInfo2;
        long j10;
        k9.h hVar;
        k9.n nVar = this.A;
        MediaInfo mediaInfo3 = null;
        if (nVar == null) {
            mediaInfo = null;
        } else {
            mediaInfo = nVar.f23170u;
        }
        long j11 = 0;
        if (mediaInfo == null || nVar == null) {
            return 0L;
        }
        Long l2 = this.B;
        if (l2 != null) {
            if (l2.equals(4294967296000L)) {
                k9.n nVar2 = this.A;
                if (nVar2.O != null) {
                    long longValue = l2.longValue();
                    k9.n nVar3 = this.A;
                    if (nVar3 != null && (hVar = nVar3.O) != null) {
                        long j12 = hVar.f23140v;
                        j11 = !hVar.f23142x ? v(1.0d, j12, -1L) : j12;
                    }
                    return Math.min(longValue, j11);
                }
                if (nVar2 == null) {
                    mediaInfo2 = null;
                } else {
                    mediaInfo2 = nVar2.f23170u;
                }
                if (mediaInfo2 != null) {
                    j10 = mediaInfo2.f7263y;
                } else {
                    j10 = 0;
                }
                if (j10 >= 0) {
                    long longValue2 = l2.longValue();
                    k9.n nVar4 = this.A;
                    if (nVar4 != null) {
                        mediaInfo3 = nVar4.f23170u;
                    }
                    if (mediaInfo3 != null) {
                        j11 = mediaInfo3.f7263y;
                    }
                    return Math.min(longValue2, j11);
                }
            }
            return l2.longValue();
        } else if (this.f28040z == 0) {
            return 0L;
        } else {
            double d10 = nVar.f23173x;
            long j13 = nVar.A;
            int i6 = nVar.f23174y;
            if (d10 != 0.0d && i6 == 2) {
                return v(d10, j13, mediaInfo.f7263y);
            }
            return j13;
        }
    }

    public final void t(m mVar, int i6, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        long q10 = q();
        try {
            jSONObject2.put("requestId", q10);
            jSONObject2.put("type", "QUEUE_UPDATE");
            jSONObject2.put("mediaSessionId", u());
            if (i6 != 0) {
                jSONObject2.put("jump", i6);
            }
            if (jSONObject != null) {
                jSONObject2.put("customData", jSONObject);
            }
        } catch (JSONException unused) {
        }
        p(q10, jSONObject2.toString());
        this.K.a(q10, mVar);
    }

    public final long u() {
        k9.n nVar = this.A;
        if (nVar != null) {
            return nVar.f23171v;
        }
        throw new zzal();
    }

    public final long v(double d10, long j10, long j11) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f28040z;
        if (elapsedRealtime < 0) {
            elapsedRealtime = 0;
        }
        if (elapsedRealtime == 0) {
            return j10;
        }
        long j12 = j10 + ((long) (elapsedRealtime * d10));
        if (j11 <= 0 || j12 <= j11) {
            if (j12 < 0) {
                return 0L;
            }
            return j12;
        }
        return j11;
    }

    public final void w() {
        j jVar = this.C;
        if (jVar != null) {
            m9.u uVar = (m9.u) jVar;
            uVar.f25009a.getClass();
            m9.g gVar = uVar.f25009a;
            for (m9.v vVar : gVar.f24991i.values()) {
                if (!gVar.e()) {
                    if (!gVar.e()) {
                        vVar.getClass();
                    }
                    vVar.getClass();
                } else {
                    vVar.getClass();
                    throw null;
                }
            }
            Iterator it = gVar.f24989g.iterator();
            while (it.hasNext()) {
                ((g.b) it.next()).e();
            }
            Iterator it2 = gVar.f24990h.iterator();
            while (it2.hasNext()) {
                ((g.a) it2.next()).a();
            }
        }
    }

    public final void x() {
        j jVar = this.C;
        if (jVar != null) {
            m9.u uVar = (m9.u) jVar;
            uVar.f25009a.getClass();
            m9.g gVar = uVar.f25009a;
            Iterator it = gVar.f24989g.iterator();
            while (it.hasNext()) {
                ((g.b) it.next()).a();
            }
            Iterator it2 = gVar.f24990h.iterator();
            while (it2.hasNext()) {
                ((g.a) it2.next()).getClass();
            }
        }
    }

    public final void y() {
        j jVar = this.C;
        if (jVar != null) {
            m9.g gVar = ((m9.u) jVar).f25009a;
            Iterator it = gVar.f24989g.iterator();
            while (it.hasNext()) {
                ((g.b) it.next()).b();
            }
            Iterator it2 = gVar.f24990h.iterator();
            while (it2.hasNext()) {
                ((g.a) it2.next()).getClass();
            }
        }
    }

    public final void z() {
        j jVar = this.C;
        if (jVar != null) {
            m9.g gVar = ((m9.u) jVar).f25009a;
            Iterator it = gVar.f24989g.iterator();
            while (it.hasNext()) {
                ((g.b) it.next()).d();
            }
            Iterator it2 = gVar.f24990h.iterator();
            while (it2.hasNext()) {
                ((g.a) it2.next()).getClass();
            }
        }
    }
}
