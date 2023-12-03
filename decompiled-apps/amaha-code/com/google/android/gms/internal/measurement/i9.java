package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes.dex */
public final class i9 implements h9 {

    /* renamed from: a  reason: collision with root package name */
    public static final b4 f8431a;

    static {
        e4 e4Var = new e4(x3.a(), true, true);
        e4Var.c("measurement.client.global_params", true);
        e4Var.c("measurement.service.global_params_in_payload", true);
        f8431a = e4Var.c("measurement.service.clear_global_params_on_uninstall", true);
        e4Var.c("measurement.service.global_params", true);
        e4Var.a(0L, "measurement.id.service.global_params");
    }

    @Override // com.google.android.gms.internal.measurement.h9
    public final boolean b() {
        return ((Boolean) f8431a.b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.h9
    public final void a() {
    }
}
