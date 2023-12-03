package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes.dex */
public final class x9 implements w9 {

    /* renamed from: a  reason: collision with root package name */
    public static final b4 f8694a;

    /* renamed from: b  reason: collision with root package name */
    public static final b4 f8695b;

    /* renamed from: c  reason: collision with root package name */
    public static final b4 f8696c;

    /* renamed from: d  reason: collision with root package name */
    public static final b4 f8697d;

    static {
        e4 e4Var = new e4(x3.a(), true, true);
        e4Var.c("measurement.redaction.app_instance_id", true);
        f8694a = e4Var.c("measurement.redaction.client_ephemeral_aiid_generation", true);
        e4Var.c("measurement.redaction.config_redacted_fields", true);
        e4Var.c("measurement.redaction.device_info", true);
        f8695b = e4Var.c("measurement.redaction.e_tag", true);
        e4Var.c("measurement.redaction.enhanced_uid", true);
        e4Var.c("measurement.redaction.populate_ephemeral_app_instance_id", true);
        e4Var.c("measurement.redaction.google_signals", true);
        e4Var.c("measurement.redaction.no_aiid_in_config_request", true);
        f8696c = e4Var.c("measurement.redaction.retain_major_os_version", true);
        f8697d = e4Var.c("measurement.redaction.scion_payload_generator", true);
        e4Var.c("measurement.redaction.upload_redacted_fields", true);
        e4Var.c("measurement.redaction.upload_subdomain_override", true);
        e4Var.c("measurement.redaction.user_id", true);
    }

    @Override // com.google.android.gms.internal.measurement.w9
    public final boolean b() {
        return ((Boolean) f8694a.b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.w9
    public final boolean c() {
        return ((Boolean) f8695b.b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.w9
    public final boolean d() {
        return ((Boolean) f8697d.b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.w9
    public final boolean e() {
        return ((Boolean) f8696c.b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.w9
    public final void a() {
    }
}
