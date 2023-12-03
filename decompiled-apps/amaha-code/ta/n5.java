package ta;

import android.os.SystemClock;
import android.util.Pair;
import g9.a;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes.dex */
public final class n5 extends y5 {
    public final g3 A;
    public final g3 B;
    public final g3 C;

    /* renamed from: x  reason: collision with root package name */
    public final HashMap f32770x;

    /* renamed from: y  reason: collision with root package name */
    public final g3 f32771y;

    /* renamed from: z  reason: collision with root package name */
    public final g3 f32772z;

    public n5(d6 d6Var) {
        super(d6Var);
        this.f32770x = new HashMap();
        j3 j3Var = this.f32943u.B;
        y3.i(j3Var);
        this.f32771y = new g3(j3Var, "last_delete_stale", 0L);
        j3 j3Var2 = this.f32943u.B;
        y3.i(j3Var2);
        this.f32772z = new g3(j3Var2, "backoff", 0L);
        j3 j3Var3 = this.f32943u.B;
        y3.i(j3Var3);
        this.A = new g3(j3Var3, "last_upload", 0L);
        j3 j3Var4 = this.f32943u.B;
        y3.i(j3Var4);
        this.B = new g3(j3Var4, "last_upload_attempt", 0L);
        j3 j3Var5 = this.f32943u.B;
        y3.i(j3Var5);
        this.C = new g3(j3Var5, "midnight_offset", 0L);
    }

    @Deprecated
    public final Pair l(String str) {
        m5 m5Var;
        h();
        y3 y3Var = this.f32943u;
        y3Var.H.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        HashMap hashMap = this.f32770x;
        m5 m5Var2 = (m5) hashMap.get(str);
        if (m5Var2 != null && elapsedRealtime < m5Var2.f32747c) {
            return new Pair(m5Var2.f32745a, Boolean.valueOf(m5Var2.f32746b));
        }
        long n10 = y3Var.A.n(str, j2.f32641b) + elapsedRealtime;
        try {
            a.C0248a a10 = g9.a.a(y3Var.f32953u);
            String str2 = a10.f16386a;
            boolean z10 = a10.f16387b;
            if (str2 != null) {
                m5Var = new m5(str2, n10, z10);
            } else {
                m5Var = new m5("", n10, z10);
            }
        } catch (Exception e10) {
            w2 w2Var = y3Var.C;
            y3.k(w2Var);
            w2Var.G.c(e10, "Unable to get advertising id");
            m5Var = new m5("", n10, false);
        }
        hashMap.put(str, m5Var);
        return new Pair(m5Var.f32745a, Boolean.valueOf(m5Var.f32746b));
    }

    @Deprecated
    public final String m(String str, boolean z10) {
        String str2;
        h();
        if (z10) {
            str2 = (String) l(str).first;
        } else {
            str2 = "00000000-0000-0000-0000-000000000000";
        }
        MessageDigest p10 = k6.p();
        if (p10 == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, p10.digest(str2.getBytes())));
    }

    @Override // ta.y5
    public final void k() {
    }
}
