package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes.dex */
public final class q8 implements p8 {

    /* renamed from: a  reason: collision with root package name */
    public static final a4 f8574a;

    static {
        e4 e4Var = new e4(x3.a(), false, true);
        e4Var.c("measurement.client.consent_state_v1", true);
        e4Var.c("measurement.client.3p_consent_state_v1", true);
        e4Var.c("measurement.service.consent_state_v1_W36", true);
        f8574a = e4Var.a(203600L, "measurement.service.storage_consent_support_version");
    }

    @Override // com.google.android.gms.internal.measurement.p8
    public final long a() {
        return ((Long) f8574a.b()).longValue();
    }
}
