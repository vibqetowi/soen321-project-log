package com.ifriend.analytics.api.events;

import com.facebook.internal.NativeProtocol;
import com.ifriend.analytics.api.providers.AnalyticsProvider;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: CustomAnalyticsEvents.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J)\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR \u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/ifriend/analytics/api/events/AnnalsAnalyticsEvent;", "Lcom/ifriend/analytics/api/events/AnalyticsEvent;", "eventName", "", NativeProtocol.WEB_DIALOG_PARAMS, "", "(Ljava/lang/String;Ljava/util/Map;)V", "getEventName", "()Ljava/lang/String;", "getParams", "()Ljava/util/Map;", "providers", "", "Lcom/ifriend/analytics/api/providers/AnalyticsProvider;", "getProviders", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "api"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AnnalsAnalyticsEvent implements AnalyticsEvent {
    private final String eventName;
    private final Map<String, String> params;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AnnalsAnalyticsEvent copy$default(AnnalsAnalyticsEvent annalsAnalyticsEvent, String str, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = annalsAnalyticsEvent.eventName;
        }
        if ((i & 2) != 0) {
            map = annalsAnalyticsEvent.params;
        }
        return annalsAnalyticsEvent.copy(str, map);
    }

    public final String component1() {
        return this.eventName;
    }

    public final Map<String, String> component2() {
        return this.params;
    }

    public final AnnalsAnalyticsEvent copy(String eventName, Map<String, String> params) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(params, "params");
        return new AnnalsAnalyticsEvent(eventName, params);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AnnalsAnalyticsEvent) {
            AnnalsAnalyticsEvent annalsAnalyticsEvent = (AnnalsAnalyticsEvent) obj;
            return Intrinsics.areEqual(this.eventName, annalsAnalyticsEvent.eventName) && Intrinsics.areEqual(this.params, annalsAnalyticsEvent.params);
        }
        return false;
    }

    public int hashCode() {
        return (this.eventName.hashCode() * 31) + this.params.hashCode();
    }

    public String toString() {
        String str = this.eventName;
        Map<String, String> map = this.params;
        return "AnnalsAnalyticsEvent(eventName=" + str + ", params=" + map + ")";
    }

    public AnnalsAnalyticsEvent(String eventName, Map<String, String> params) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(params, "params");
        this.eventName = eventName;
        this.params = params;
    }

    @Override // com.ifriend.analytics.api.events.AnalyticsEvent
    public String getEventName() {
        return this.eventName;
    }

    public /* synthetic */ AnnalsAnalyticsEvent(String str, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? MapsKt.emptyMap() : map);
    }

    @Override // com.ifriend.analytics.api.events.AnalyticsEvent
    public Map<String, String> getParams() {
        return this.params;
    }

    @Override // com.ifriend.analytics.api.events.AnalyticsEvent
    public List<AnalyticsProvider> getProviders() {
        return CollectionsKt.listOf(AnalyticsProvider.ANALYTICS_ANNALS);
    }
}
