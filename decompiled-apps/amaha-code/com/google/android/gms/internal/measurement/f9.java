package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes.dex */
public final class f9 implements e9 {

    /* renamed from: a  reason: collision with root package name */
    public static final b4 f8384a;

    static {
        e4 e4Var = new e4(x3.a(), false, true);
        f8384a = e4Var.c("measurement.client.sessions.check_on_reset_and_enable2", true);
        e4Var.c("measurement.client.sessions.check_on_startup", true);
        e4Var.c("measurement.client.sessions.start_session_before_view_screen", true);
    }

    @Override // com.google.android.gms.internal.measurement.e9
    public final boolean b() {
        return ((Boolean) f8384a.b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.e9
    public final void a() {
    }
}
