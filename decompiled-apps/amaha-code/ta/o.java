package ta;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Iterator;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    public final String f32773a;

    /* renamed from: b  reason: collision with root package name */
    public final String f32774b;

    /* renamed from: c  reason: collision with root package name */
    public final String f32775c;

    /* renamed from: d  reason: collision with root package name */
    public final long f32776d;

    /* renamed from: e  reason: collision with root package name */
    public final long f32777e;
    public final q f;

    public o(y3 y3Var, String str, String str2, String str3, long j10, Bundle bundle) {
        q qVar;
        v9.o.e(str2);
        v9.o.e(str3);
        this.f32773a = str2;
        this.f32774b = str3;
        this.f32775c = true == TextUtils.isEmpty(str) ? null : str;
        this.f32776d = j10;
        this.f32777e = 0L;
        if (!bundle.isEmpty()) {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    w2 w2Var = y3Var.C;
                    y3.k(w2Var);
                    w2Var.f32925z.b("Param name can't be null");
                    it.remove();
                } else {
                    k6 k6Var = y3Var.F;
                    y3.i(k6Var);
                    Object l2 = k6Var.l(bundle2.get(next), next);
                    if (l2 == null) {
                        w2 w2Var2 = y3Var.C;
                        y3.k(w2Var2);
                        w2Var2.C.c(y3Var.G.e(next), "Param value can't be null");
                        it.remove();
                    } else {
                        k6 k6Var2 = y3Var.F;
                        y3.i(k6Var2);
                        k6Var2.y(bundle2, next, l2);
                    }
                }
            }
            qVar = new q(bundle2);
        } else {
            qVar = new q(new Bundle());
        }
        this.f = qVar;
    }

    public final o a(y3 y3Var, long j10) {
        return new o(y3Var, this.f32775c, this.f32773a, this.f32774b, this.f32776d, j10, this.f);
    }

    public final String toString() {
        String qVar = this.f.toString();
        return "Event{appId='" + this.f32773a + "', name='" + this.f32774b + "', params=" + qVar + "}";
    }

    public o(y3 y3Var, String str, String str2, String str3, long j10, long j11, q qVar) {
        v9.o.e(str2);
        v9.o.e(str3);
        v9.o.h(qVar);
        this.f32773a = str2;
        this.f32774b = str3;
        this.f32775c = true == TextUtils.isEmpty(str) ? null : str;
        this.f32776d = j10;
        this.f32777e = j11;
        if (j11 != 0 && j11 > j10) {
            w2 w2Var = y3Var.C;
            y3.k(w2Var);
            w2Var.C.d("Event created with reverse previous/current timestamps. appId, name", w2.q(str2), w2.q(str3));
        }
        this.f = qVar;
    }
}
