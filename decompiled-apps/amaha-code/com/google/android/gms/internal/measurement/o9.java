package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes.dex */
public final class o9 implements n9 {

    /* renamed from: a  reason: collision with root package name */
    public static final b4 f8542a;

    static {
        e4 e4Var = new e4(x3.a(), false, true);
        e4Var.a(0L, "measurement.id.lifecycle.app_in_background_parameter");
        e4Var.c("measurement.lifecycle.app_backgrounded_tracking", true);
        f8542a = e4Var.c("measurement.lifecycle.app_in_background_parameter", false);
        e4Var.a(0L, "measurement.id.lifecycle.app_backgrounded_tracking");
    }

    @Override // com.google.android.gms.internal.measurement.n9
    public final boolean a() {
        return ((Boolean) f8542a.b()).booleanValue();
    }
}
