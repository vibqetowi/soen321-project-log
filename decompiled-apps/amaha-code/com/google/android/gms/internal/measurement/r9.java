package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes.dex */
public final class r9 implements q9 {

    /* renamed from: a  reason: collision with root package name */
    public static final b4 f8582a;

    /* renamed from: b  reason: collision with root package name */
    public static final c4 f8583b;

    /* renamed from: c  reason: collision with root package name */
    public static final a4 f8584c;

    /* renamed from: d  reason: collision with root package name */
    public static final a4 f8585d;

    /* renamed from: e  reason: collision with root package name */
    public static final d4 f8586e;

    static {
        e4 e4Var = new e4(x3.a(), false, true);
        f8582a = e4Var.c("measurement.test.boolean_flag", false);
        f8583b = new c4(e4Var, Double.valueOf(-3.0d));
        f8584c = e4Var.a(-2L, "measurement.test.int_flag");
        f8585d = e4Var.a(-1L, "measurement.test.long_flag");
        f8586e = new d4(e4Var, "measurement.test.string_flag", "---");
    }

    @Override // com.google.android.gms.internal.measurement.q9
    public final double a() {
        return ((Double) f8583b.b()).doubleValue();
    }

    @Override // com.google.android.gms.internal.measurement.q9
    public final long b() {
        return ((Long) f8584c.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.q9
    public final long c() {
        return ((Long) f8585d.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.q9
    public final boolean d() {
        return ((Boolean) f8582a.b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.q9
    public final String e() {
        return (String) f8586e.b();
    }
}
