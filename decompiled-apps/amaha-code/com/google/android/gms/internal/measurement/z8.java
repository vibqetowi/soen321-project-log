package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes.dex */
public final class z8 implements y8 {

    /* renamed from: a  reason: collision with root package name */
    public static final b4 f8731a;

    /* renamed from: b  reason: collision with root package name */
    public static final b4 f8732b;

    /* renamed from: c  reason: collision with root package name */
    public static final b4 f8733c;

    static {
        e4 e4Var = new e4(x3.a(), false, true);
        e4Var.c("measurement.service.audience.fix_skip_audience_with_failed_filters", true);
        f8731a = e4Var.c("measurement.audience.refresh_event_count_filters_timestamp", false);
        f8732b = e4Var.c("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        f8733c = e4Var.c("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }

    @Override // com.google.android.gms.internal.measurement.y8
    public final boolean b() {
        return ((Boolean) f8731a.b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.y8
    public final boolean c() {
        return ((Boolean) f8732b.b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.y8
    public final boolean e() {
        return ((Boolean) f8733c.b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.y8
    public final void a() {
    }
}
