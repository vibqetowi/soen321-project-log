package bf;

import com.google.firebase.perf.config.RemoteConfigManager;
import java.util.concurrent.Executors;
/* compiled from: ConfigResolver.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: d  reason: collision with root package name */
    public static final df.a f4250d = df.a.d();

    /* renamed from: e  reason: collision with root package name */
    public static volatile a f4251e;

    /* renamed from: a  reason: collision with root package name */
    public final RemoteConfigManager f4252a = RemoteConfigManager.getInstance();

    /* renamed from: b  reason: collision with root package name */
    public kf.d f4253b = new kf.d();

    /* renamed from: c  reason: collision with root package name */
    public final v f4254c;

    public a() {
        v vVar;
        df.a aVar = v.f4276c;
        synchronized (v.class) {
            if (v.f4277d == null) {
                v.f4277d = new v(Executors.newSingleThreadExecutor());
            }
            vVar = v.f4277d;
        }
        this.f4254c = vVar;
    }

    public static synchronized a e() {
        a aVar;
        synchronized (a.class) {
            if (f4251e == null) {
                f4251e = new a();
            }
            aVar = f4251e;
        }
        return aVar;
    }

    public static boolean r(long j10) {
        if (j10 >= 0) {
            return true;
        }
        return false;
    }

    public static boolean s(String str) {
        if (str.trim().isEmpty()) {
            return false;
        }
        for (String str2 : str.split(";")) {
            String trim = str2.trim();
            Boolean bool = ze.a.f39365a;
            if (trim.equals("20.3.1")) {
                return true;
            }
        }
        return false;
    }

    public static boolean t(long j10) {
        if (j10 >= 0) {
            return true;
        }
        return false;
    }

    public static boolean v(float f) {
        if (0.0f <= f && f <= 1.0f) {
            return true;
        }
        return false;
    }

    public final kf.e<Boolean> a(com.android.volley.toolbox.a aVar) {
        v vVar = this.f4254c;
        String f = aVar.f();
        if (f == null) {
            vVar.getClass();
            v.f4276c.a("Key is null when getting boolean value on device cache.");
            return new kf.e<>();
        }
        if (vVar.f4278a == null) {
            vVar.b(v.a());
            if (vVar.f4278a == null) {
                return new kf.e<>();
            }
        }
        if (!vVar.f4278a.contains(f)) {
            return new kf.e<>();
        }
        try {
            return new kf.e<>(Boolean.valueOf(vVar.f4278a.getBoolean(f, false)));
        } catch (ClassCastException e10) {
            v.f4276c.b("Key %s from sharedPreferences has type other than long: %s", f, e10.getMessage());
            return new kf.e<>();
        }
    }

    public final kf.e<Float> b(com.android.volley.toolbox.a aVar) {
        v vVar = this.f4254c;
        String f = aVar.f();
        if (f == null) {
            vVar.getClass();
            v.f4276c.a("Key is null when getting float value on device cache.");
            return new kf.e<>();
        }
        if (vVar.f4278a == null) {
            vVar.b(v.a());
            if (vVar.f4278a == null) {
                return new kf.e<>();
            }
        }
        if (!vVar.f4278a.contains(f)) {
            return new kf.e<>();
        }
        try {
            return new kf.e<>(Float.valueOf(vVar.f4278a.getFloat(f, 0.0f)));
        } catch (ClassCastException e10) {
            v.f4276c.b("Key %s from sharedPreferences has type other than float: %s", f, e10.getMessage());
            return new kf.e<>();
        }
    }

    public final kf.e<Long> c(com.android.volley.toolbox.a aVar) {
        v vVar = this.f4254c;
        String f = aVar.f();
        if (f == null) {
            vVar.getClass();
            v.f4276c.a("Key is null when getting long value on device cache.");
            return new kf.e<>();
        }
        if (vVar.f4278a == null) {
            vVar.b(v.a());
            if (vVar.f4278a == null) {
                return new kf.e<>();
            }
        }
        if (!vVar.f4278a.contains(f)) {
            return new kf.e<>();
        }
        try {
            return new kf.e<>(Long.valueOf(vVar.f4278a.getLong(f, 0L)));
        } catch (ClassCastException e10) {
            v.f4276c.b("Key %s from sharedPreferences has type other than long: %s", f, e10.getMessage());
            return new kf.e<>();
        }
    }

    public final kf.e<String> d(com.android.volley.toolbox.a aVar) {
        v vVar = this.f4254c;
        String f = aVar.f();
        if (f == null) {
            vVar.getClass();
            v.f4276c.a("Key is null when getting String value on device cache.");
            return new kf.e<>();
        }
        if (vVar.f4278a == null) {
            vVar.b(v.a());
            if (vVar.f4278a == null) {
                return new kf.e<>();
            }
        }
        if (!vVar.f4278a.contains(f)) {
            return new kf.e<>();
        }
        try {
            return new kf.e<>(vVar.f4278a.getString(f, ""));
        } catch (ClassCastException e10) {
            v.f4276c.b("Key %s from sharedPreferences has type other than String: %s", f, e10.getMessage());
            return new kf.e<>();
        }
    }

    public final boolean f() {
        d dVar;
        synchronized (d.class) {
            if (d.f4257v == null) {
                d.f4257v = new d();
            }
            dVar = d.f4257v;
        }
        kf.e<Boolean> i6 = i(dVar);
        if (i6.b()) {
            return i6.a().booleanValue();
        }
        kf.e<Boolean> eVar = this.f4252a.getBoolean("fpr_experiment_app_start_ttid");
        if (eVar.b()) {
            this.f4254c.f("com.google.firebase.perf.ExperimentTTID", eVar.a().booleanValue());
            return eVar.a().booleanValue();
        }
        kf.e<Boolean> a10 = a(dVar);
        if (a10.b()) {
            return a10.a().booleanValue();
        }
        return false;
    }

    public final Boolean g() {
        b bVar;
        Boolean bool;
        synchronized (b.class) {
            if (b.f4255v == null) {
                b.f4255v = new b();
            }
            bVar = b.f4255v;
        }
        kf.e<Boolean> i6 = i(bVar);
        if (i6.b()) {
            bool = i6.a();
        } else {
            bool = Boolean.FALSE;
        }
        if (bool.booleanValue()) {
            return Boolean.FALSE;
        }
        c J = c.J();
        kf.e<Boolean> a10 = a(J);
        if (a10.b()) {
            return a10.a();
        }
        kf.e<Boolean> i10 = i(J);
        if (i10.b()) {
            return i10.a();
        }
        return null;
    }

    public final boolean h() {
        k kVar;
        synchronized (k.class) {
            if (k.f4265v == null) {
                k.f4265v = new k();
            }
            kVar = k.f4265v;
        }
        RemoteConfigManager remoteConfigManager = this.f4252a;
        kVar.getClass();
        kf.e<String> string = remoteConfigManager.getString("fpr_disabled_android_versions");
        if (string.b()) {
            this.f4254c.e("com.google.firebase.perf.SdkDisabledVersions", string.a());
            return s(string.a());
        }
        kf.e<String> d10 = d(kVar);
        if (d10.b()) {
            return s(d10.a());
        }
        return s("");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0020 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.os.Bundle, android.os.BaseBundle] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r3v5, types: [android.os.Bundle, android.os.BaseBundle] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v4, types: [df.a] */
    /* JADX WARN: Type inference failed for: r5v7, types: [kf.e<java.lang.Boolean>] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final kf.e<Boolean> i(com.android.volley.toolbox.a aVar) {
        boolean z10;
        kf.d dVar = this.f4253b;
        kf.e g5 = aVar.g();
        if (g5 != 0) {
            if (dVar.f23311a.containsKey(g5)) {
                z10 = true;
                if (z10) {
                    return new kf.e<>();
                }
                try {
                    Boolean bool = (Boolean) dVar.f23311a.get(g5);
                    if (bool == null) {
                        g5 = new kf.e();
                    } else {
                        g5 = new kf.e(bool);
                    }
                    return g5;
                } catch (ClassCastException e10) {
                    kf.d.f23310b.b("Metadata key %s contains type other than boolean: %s", new Object[]{g5, e10.getMessage()});
                    return new kf.e<>();
                }
            }
        } else {
            dVar.getClass();
        }
        z10 = false;
        if (z10) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0020 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.os.Bundle, android.os.BaseBundle] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r3v5, types: [android.os.Bundle, android.os.BaseBundle] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v4, types: [df.a] */
    /* JADX WARN: Type inference failed for: r5v7, types: [kf.e<java.lang.Float>] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final kf.e<Float> j(com.android.volley.toolbox.a aVar) {
        boolean z10;
        kf.d dVar = this.f4253b;
        kf.e g5 = aVar.g();
        if (g5 != 0) {
            if (dVar.f23311a.containsKey(g5)) {
                z10 = true;
                if (z10) {
                    return new kf.e<>();
                }
                try {
                    Float f = (Float) dVar.f23311a.get(g5);
                    if (f == null) {
                        g5 = new kf.e();
                    } else {
                        g5 = new kf.e(f);
                    }
                    return g5;
                } catch (ClassCastException e10) {
                    kf.d.f23310b.b("Metadata key %s contains type other than float: %s", new Object[]{g5, e10.getMessage()});
                    return new kf.e<>();
                }
            }
        } else {
            dVar.getClass();
        }
        z10 = false;
        if (z10) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0020 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v14, types: [kf.e] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v4, types: [df.a] */
    /* JADX WARN: Type inference failed for: r5v5, types: [kf.e] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [kf.e] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final kf.e<Long> k(com.android.volley.toolbox.a aVar) {
        boolean z10;
        kf.d dVar = this.f4253b;
        kf.e g5 = aVar.g();
        if (g5 != null) {
            if (dVar.f23311a.containsKey(g5)) {
                z10 = true;
                if (z10) {
                    g5 = new kf.e();
                } else {
                    try {
                        Integer num = (Integer) dVar.f23311a.get(g5);
                        if (num == null) {
                            g5 = new kf.e();
                        } else {
                            g5 = new kf.e(num);
                        }
                    } catch (ClassCastException e10) {
                        kf.d.f23310b.b("Metadata key %s contains type other than int: %s", new Object[]{g5, e10.getMessage()});
                        g5 = new kf.e();
                    }
                }
                if (!g5.b()) {
                    return new kf.e<>(Long.valueOf(((Integer) g5.a()).intValue()));
                }
                return new kf.e<>();
            }
        } else {
            dVar.getClass();
        }
        z10 = false;
        if (z10) {
        }
        if (!g5.b()) {
        }
    }

    public final long l() {
        j jVar;
        boolean z10;
        synchronized (j.class) {
            if (j.f4264v == null) {
                j.f4264v = new j();
            }
            jVar = j.f4264v;
        }
        kf.e<Long> m10 = m(jVar);
        boolean z11 = true;
        if (m10.b()) {
            if (m10.a().longValue() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                this.f4254c.d(m10.a().longValue(), "com.google.firebase.perf.TimeLimitSec");
                return m10.a().longValue();
            }
        }
        kf.e<Long> c10 = c(jVar);
        if (c10.b()) {
            if (c10.a().longValue() <= 0) {
                z11 = false;
            }
            if (z11) {
                return c10.a().longValue();
            }
        }
        Long l2 = 600L;
        return l2.longValue();
    }

    public final kf.e<Long> m(com.android.volley.toolbox.a aVar) {
        return this.f4252a.getLong(aVar.i());
    }

    public final long n() {
        n nVar;
        synchronized (n.class) {
            if (n.f4268v == null) {
                n.f4268v = new n();
            }
            nVar = n.f4268v;
        }
        kf.e<Long> k10 = k(nVar);
        if (k10.b() && t(k10.a().longValue())) {
            return k10.a().longValue();
        }
        kf.e<Long> m10 = m(nVar);
        if (m10.b() && t(m10.a().longValue())) {
            this.f4254c.d(m10.a().longValue(), "com.google.firebase.perf.SessionsCpuCaptureFrequencyForegroundMs");
            return m10.a().longValue();
        }
        kf.e<Long> c10 = c(nVar);
        if (c10.b() && t(c10.a().longValue())) {
            return c10.a().longValue();
        }
        Long l2 = 100L;
        return l2.longValue();
    }

    public final long o() {
        q qVar;
        synchronized (q.class) {
            if (q.f4271v == null) {
                q.f4271v = new q();
            }
            qVar = q.f4271v;
        }
        kf.e<Long> k10 = k(qVar);
        if (k10.b() && t(k10.a().longValue())) {
            return k10.a().longValue();
        }
        kf.e<Long> m10 = m(qVar);
        if (m10.b() && t(m10.a().longValue())) {
            this.f4254c.d(m10.a().longValue(), "com.google.firebase.perf.SessionsMemoryCaptureFrequencyForegroundMs");
            return m10.a().longValue();
        }
        kf.e<Long> c10 = c(qVar);
        if (c10.b() && t(c10.a().longValue())) {
            return c10.a().longValue();
        }
        Long l2 = 100L;
        return l2.longValue();
    }

    public final long p() {
        s sVar;
        synchronized (s.class) {
            if (s.f4273v == null) {
                s.f4273v = new s();
            }
            sVar = s.f4273v;
        }
        kf.e<Long> m10 = m(sVar);
        if (m10.b() && r(m10.a().longValue())) {
            this.f4254c.d(m10.a().longValue(), "com.google.firebase.perf.TraceEventCountBackground");
            return m10.a().longValue();
        }
        kf.e<Long> c10 = c(sVar);
        if (c10.b() && r(c10.a().longValue())) {
            return c10.a().longValue();
        }
        Long l2 = 30L;
        return l2.longValue();
    }

    public final long q() {
        t tVar;
        synchronized (t.class) {
            if (t.f4274v == null) {
                t.f4274v = new t();
            }
            tVar = t.f4274v;
        }
        kf.e<Long> m10 = m(tVar);
        if (m10.b() && r(m10.a().longValue())) {
            this.f4254c.d(m10.a().longValue(), "com.google.firebase.perf.TraceEventCountForeground");
            return m10.a().longValue();
        }
        kf.e<Long> c10 = c(tVar);
        if (c10.b() && r(c10.a().longValue())) {
            return c10.a().longValue();
        }
        Long l2 = 300L;
        return l2.longValue();
    }

    public final boolean u() {
        l lVar;
        boolean z10;
        boolean z11;
        Boolean g5 = g();
        if (g5 != null && !g5.booleanValue()) {
            return false;
        }
        synchronized (l.class) {
            if (l.f4266v == null) {
                l.f4266v = new l();
            }
            lVar = l.f4266v;
        }
        RemoteConfigManager remoteConfigManager = this.f4252a;
        lVar.getClass();
        kf.e<Boolean> eVar = remoteConfigManager.getBoolean("fpr_enabled");
        if (eVar.b()) {
            if (this.f4252a.isLastFetchFailed()) {
                z10 = false;
            } else {
                this.f4254c.f("com.google.firebase.perf.SdkEnabled", eVar.a().booleanValue());
                z10 = eVar.a().booleanValue();
            }
        } else {
            kf.e<Boolean> a10 = a(lVar);
            if (a10.b()) {
                z10 = a10.a().booleanValue();
            } else {
                z10 = true;
            }
        }
        if (z10 && !h()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            return false;
        }
        return true;
    }
}
