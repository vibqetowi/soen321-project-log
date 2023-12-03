package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes.dex */
public final class n8 implements m8 {
    public static final a4 A;
    public static final a4 B;
    public static final a4 C;
    public static final a4 D;
    public static final a4 E;
    public static final a4 F;
    public static final a4 G;
    public static final a4 H;
    public static final d4 I;
    public static final a4 J;

    /* renamed from: a  reason: collision with root package name */
    public static final a4 f8495a;

    /* renamed from: b  reason: collision with root package name */
    public static final a4 f8496b;

    /* renamed from: c  reason: collision with root package name */
    public static final a4 f8497c;

    /* renamed from: d  reason: collision with root package name */
    public static final d4 f8498d;

    /* renamed from: e  reason: collision with root package name */
    public static final d4 f8499e;
    public static final a4 f;

    /* renamed from: g  reason: collision with root package name */
    public static final a4 f8500g;

    /* renamed from: h  reason: collision with root package name */
    public static final a4 f8501h;

    /* renamed from: i  reason: collision with root package name */
    public static final a4 f8502i;

    /* renamed from: j  reason: collision with root package name */
    public static final a4 f8503j;

    /* renamed from: k  reason: collision with root package name */
    public static final a4 f8504k;

    /* renamed from: l  reason: collision with root package name */
    public static final a4 f8505l;

    /* renamed from: m  reason: collision with root package name */
    public static final a4 f8506m;

    /* renamed from: n  reason: collision with root package name */
    public static final a4 f8507n;

    /* renamed from: o  reason: collision with root package name */
    public static final a4 f8508o;

    /* renamed from: p  reason: collision with root package name */
    public static final a4 f8509p;

    /* renamed from: q  reason: collision with root package name */
    public static final a4 f8510q;
    public static final a4 r;

    /* renamed from: s  reason: collision with root package name */
    public static final a4 f8511s;

    /* renamed from: t  reason: collision with root package name */
    public static final a4 f8512t;

    /* renamed from: u  reason: collision with root package name */
    public static final a4 f8513u;

    /* renamed from: v  reason: collision with root package name */
    public static final a4 f8514v;

    /* renamed from: w  reason: collision with root package name */
    public static final a4 f8515w;

    /* renamed from: x  reason: collision with root package name */
    public static final a4 f8516x;

    /* renamed from: y  reason: collision with root package name */
    public static final a4 f8517y;

    /* renamed from: z  reason: collision with root package name */
    public static final a4 f8518z;

    static {
        e4 e4Var = new e4(x3.a(), false, true);
        f8495a = e4Var.a(10000L, "measurement.ad_id_cache_time");
        f8496b = e4Var.a(100L, "measurement.max_bundles_per_iteration");
        f8497c = e4Var.a(86400000L, "measurement.config.cache_time");
        e4Var.b("measurement.log_tag", "FA");
        f8498d = new d4(e4Var, "measurement.config.url_authority", "app-measurement.com");
        f8499e = new d4(e4Var, "measurement.config.url_scheme", "https");
        f = e4Var.a(1000L, "measurement.upload.debug_upload_interval");
        f8500g = e4Var.a(4L, "measurement.lifetimevalue.max_currency_tracked");
        f8501h = e4Var.a(100000L, "measurement.store.max_stored_events_per_app");
        f8502i = e4Var.a(50L, "measurement.experiment.max_ids");
        f8503j = e4Var.a(200L, "measurement.audience.filter_result_max_count");
        f8504k = e4Var.a(60000L, "measurement.alarm_manager.minimum_interval");
        f8505l = e4Var.a(500L, "measurement.upload.minimum_delay");
        f8506m = e4Var.a(86400000L, "measurement.monitoring.sample_period_millis");
        f8507n = e4Var.a(10000L, "measurement.upload.realtime_upload_interval");
        f8508o = e4Var.a(604800000L, "measurement.upload.refresh_blacklisted_config_interval");
        e4Var.a(3600000L, "measurement.config.cache_time.service");
        f8509p = e4Var.a(5000L, "measurement.service_client.idle_disconnect_millis");
        e4Var.b("measurement.log_tag.service", "FA-SVC");
        f8510q = e4Var.a(86400000L, "measurement.upload.stale_data_deletion_interval");
        r = e4Var.a(604800000L, "measurement.sdk.attribution.cache.ttl");
        f8511s = e4Var.a(7200000L, "measurement.redaction.app_instance_id.ttl");
        f8512t = e4Var.a(43200000L, "measurement.upload.backoff_period");
        f8513u = e4Var.a(15000L, "measurement.upload.initial_upload_delay_time");
        f8514v = e4Var.a(3600000L, "measurement.upload.interval");
        f8515w = e4Var.a(65536L, "measurement.upload.max_bundle_size");
        f8516x = e4Var.a(100L, "measurement.upload.max_bundles");
        f8517y = e4Var.a(500L, "measurement.upload.max_conversions_per_day");
        f8518z = e4Var.a(1000L, "measurement.upload.max_error_events_per_day");
        A = e4Var.a(1000L, "measurement.upload.max_events_per_bundle");
        B = e4Var.a(100000L, "measurement.upload.max_events_per_day");
        C = e4Var.a(50000L, "measurement.upload.max_public_events_per_day");
        D = e4Var.a(2419200000L, "measurement.upload.max_queue_time");
        E = e4Var.a(10L, "measurement.upload.max_realtime_events_per_day");
        F = e4Var.a(65536L, "measurement.upload.max_batch_size");
        G = e4Var.a(6L, "measurement.upload.retry_count");
        H = e4Var.a(1800000L, "measurement.upload.retry_time");
        I = new d4(e4Var, "measurement.upload.url", "https://app-measurement.com/a");
        J = e4Var.a(3600000L, "measurement.upload.window_interval");
    }

    @Override // com.google.android.gms.internal.measurement.m8
    public final long A() {
        return ((Long) f8509p.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.m8
    public final long B() {
        return ((Long) f8517y.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.m8
    public final long C() {
        return ((Long) F.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.m8
    public final long D() {
        return ((Long) G.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.m8
    public final long E() {
        return ((Long) f8518z.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.m8
    public final String F() {
        return (String) I.b();
    }

    @Override // com.google.android.gms.internal.measurement.m8
    public final long G() {
        return ((Long) f8515w.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.m8
    public final long H() {
        return ((Long) f8516x.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.m8
    public final long I() {
        return ((Long) E.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.m8
    public final String J() {
        return (String) f8498d.b();
    }

    @Override // com.google.android.gms.internal.measurement.m8
    public final String K() {
        return (String) f8499e.b();
    }

    @Override // com.google.android.gms.internal.measurement.m8
    public final long L() {
        return ((Long) f8514v.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.m8
    public final long a() {
        return ((Long) f8495a.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.m8
    public final long b() {
        return ((Long) f8496b.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.m8
    public final long c() {
        return ((Long) f8497c.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.m8
    public final long d() {
        return ((Long) f8500g.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.m8
    public final long e() {
        return ((Long) f.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.m8
    public final long f() {
        return ((Long) f8503j.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.m8
    public final long g() {
        return ((Long) f8504k.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.m8
    public final long h() {
        return ((Long) f8501h.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.m8
    public final long i() {
        return ((Long) f8502i.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.m8
    public final long j() {
        return ((Long) f8513u.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.m8
    public final long m() {
        return ((Long) f8512t.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.m8
    public final long n() {
        return ((Long) f8510q.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.m8
    public final long o() {
        return ((Long) f8507n.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.m8
    public final long p() {
        return ((Long) f8511s.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.m8
    public final long q() {
        return ((Long) D.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.m8
    public final long r() {
        return ((Long) f8508o.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.m8
    public final long s() {
        return ((Long) f8506m.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.m8
    public final long t() {
        return ((Long) f8505l.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.m8
    public final long u() {
        return ((Long) C.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.m8
    public final long v() {
        return ((Long) r.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.m8
    public final long w() {
        return ((Long) H.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.m8
    public final long x() {
        return ((Long) A.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.m8
    public final long y() {
        return ((Long) B.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.m8
    public final long z() {
        return ((Long) J.b()).longValue();
    }
}
