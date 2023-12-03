package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes.dex */
public final class ea implements da {

    /* renamed from: a  reason: collision with root package name */
    public static final b4 f8369a;

    /* renamed from: b  reason: collision with root package name */
    public static final b4 f8370b;

    /* renamed from: c  reason: collision with root package name */
    public static final b4 f8371c;

    /* renamed from: d  reason: collision with root package name */
    public static final b4 f8372d;

    static {
        e4 e4Var = new e4(x3.a(), true, true);
        f8369a = e4Var.c("measurement.collection.enable_session_stitching_token.client.dev", true);
        f8370b = e4Var.c("measurement.session_stitching_token_enabled", false);
        f8371c = e4Var.c("measurement.collection.enable_session_stitching_token.service", false);
        f8372d = e4Var.c("measurement.collection.enable_session_stitching_token.service_new", true);
        e4Var.a(0L, "measurement.id.collection.enable_session_stitching_token.client.dev");
    }

    @Override // com.google.android.gms.internal.measurement.da
    public final boolean b() {
        return ((Boolean) f8369a.b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.da
    public final boolean c() {
        return ((Boolean) f8370b.b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.da
    public final boolean d() {
        return ((Boolean) f8372d.b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.da
    public final boolean e() {
        return ((Boolean) f8371c.b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.da
    public final void a() {
    }
}
