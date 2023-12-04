package com.ifriend.analytics.api.providers;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AnalyticsProvider.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ifriend/analytics/api/providers/AnalyticsProvider;", "", "(Ljava/lang/String;I)V", "ANALYTICS_FIREBASE", "ANALYTICS_ANNALS", "ANALYTICS_APPSFLYER", "api"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AnalyticsProvider {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AnalyticsProvider[] $VALUES;
    public static final AnalyticsProvider ANALYTICS_FIREBASE = new AnalyticsProvider("ANALYTICS_FIREBASE", 0);
    public static final AnalyticsProvider ANALYTICS_ANNALS = new AnalyticsProvider("ANALYTICS_ANNALS", 1);
    public static final AnalyticsProvider ANALYTICS_APPSFLYER = new AnalyticsProvider("ANALYTICS_APPSFLYER", 2);

    private static final /* synthetic */ AnalyticsProvider[] $values() {
        return new AnalyticsProvider[]{ANALYTICS_FIREBASE, ANALYTICS_ANNALS, ANALYTICS_APPSFLYER};
    }

    public static EnumEntries<AnalyticsProvider> getEntries() {
        return $ENTRIES;
    }

    public static AnalyticsProvider valueOf(String str) {
        return (AnalyticsProvider) Enum.valueOf(AnalyticsProvider.class, str);
    }

    public static AnalyticsProvider[] values() {
        return (AnalyticsProvider[]) $VALUES.clone();
    }

    private AnalyticsProvider(String str, int i) {
    }

    static {
        AnalyticsProvider[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }
}
