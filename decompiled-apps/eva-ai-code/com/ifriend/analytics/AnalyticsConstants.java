package com.ifriend.analytics;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
/* compiled from: AnalyticsConstants.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u001d\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0\t8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\t8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/ifriend/analytics/AnalyticsConstants;", "", "()V", "REGISTRATION_VERSION", "", "STATE", "TIMESTAMP", "UUID", AnalyticsConstants.TIMESTAMP, "Lkotlin/Pair;", "", "getTimestamp", "()Lkotlin/Pair;", "timestampAsString", "getTimestampAsString", "analytics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AnalyticsConstants {
    public static final AnalyticsConstants INSTANCE = new AnalyticsConstants();
    public static final String REGISTRATION_VERSION = "registration_version";
    public static final String STATE = "state";
    public static final String TIMESTAMP = "timestamp";
    public static final String UUID = "uuid";

    private AnalyticsConstants() {
    }

    public final Pair<String, Long> getTimestamp() {
        return TuplesKt.to(TIMESTAMP, Long.valueOf(System.currentTimeMillis()));
    }

    public final Pair<String, String> getTimestampAsString() {
        return TuplesKt.to(TIMESTAMP, String.valueOf(System.currentTimeMillis()));
    }
}
