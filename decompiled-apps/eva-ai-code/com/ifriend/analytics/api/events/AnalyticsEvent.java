package com.ifriend.analytics.api.events;

import com.facebook.internal.NativeProtocol;
import com.ifriend.analytics.api.providers.AnalyticsProvider;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
/* compiled from: CustomAnalyticsEvents.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u00020\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u001e\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/ifriend/analytics/api/events/AnalyticsEvent;", "", "eventName", "", "getEventName", "()Ljava/lang/String;", NativeProtocol.WEB_DIALOG_PARAMS, "", "getParams", "()Ljava/util/Map;", "providers", "", "Lcom/ifriend/analytics/api/providers/AnalyticsProvider;", "getProviders", "()Ljava/util/List;", "api"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface AnalyticsEvent {
    String getEventName();

    Map<String, String> getParams();

    List<AnalyticsProvider> getProviders();

    /* compiled from: CustomAnalyticsEvents.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class DefaultImpls {
        public static List<AnalyticsProvider> getProviders(AnalyticsEvent analyticsEvent) {
            return CollectionsKt.emptyList();
        }
    }
}
