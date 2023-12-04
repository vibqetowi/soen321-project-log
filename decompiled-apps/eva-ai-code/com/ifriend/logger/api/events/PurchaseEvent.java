package com.ifriend.logger.api.events;

import com.facebook.internal.NativeProtocol;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ifriend.logger.api.providers.LoggerProvider;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: LoggerEvent.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\u0015\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J=\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00072\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\b\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006&"}, d2 = {"Lcom/ifriend/logger/api/events/PurchaseEvent;", "Lcom/ifriend/logger/api/events/LoggerEvent;", "eventName", "", FirebaseAnalytics.Param.LEVEL, "Lcom/ifriend/logger/api/events/LoggerLevel;", NativeProtocol.WEB_DIALOG_PARAMS, "", "component", "(Ljava/lang/String;Lcom/ifriend/logger/api/events/LoggerLevel;Ljava/util/Map;Ljava/lang/String;)V", "getComponent", "()Ljava/lang/String;", "getEventName", "getLevel", "()Lcom/ifriend/logger/api/events/LoggerLevel;", "getParams", "()Ljava/util/Map;", "providers", "", "Lcom/ifriend/logger/api/providers/LoggerProvider;", "getProviders", "()Ljava/util/List;", "reason", "Lcom/ifriend/logger/api/events/LoggerReason;", "getReason", "()Lcom/ifriend/logger/api/events/LoggerReason;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "api"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PurchaseEvent implements LoggerEvent {
    private final String component;
    private final String eventName;
    private final LoggerLevel level;
    private final Map<String, String> params;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PurchaseEvent copy$default(PurchaseEvent purchaseEvent, String str, LoggerLevel loggerLevel, Map map, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = purchaseEvent.eventName;
        }
        if ((i & 2) != 0) {
            loggerLevel = purchaseEvent.level;
        }
        if ((i & 4) != 0) {
            map = purchaseEvent.params;
        }
        if ((i & 8) != 0) {
            str2 = purchaseEvent.component;
        }
        return purchaseEvent.copy(str, loggerLevel, map, str2);
    }

    public final String component1() {
        return this.eventName;
    }

    public final LoggerLevel component2() {
        return this.level;
    }

    public final Map<String, String> component3() {
        return this.params;
    }

    public final String component4() {
        return this.component;
    }

    public final PurchaseEvent copy(String eventName, LoggerLevel level, Map<String, String> params, String component) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(level, "level");
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(component, "component");
        return new PurchaseEvent(eventName, level, params, component);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PurchaseEvent) {
            PurchaseEvent purchaseEvent = (PurchaseEvent) obj;
            return Intrinsics.areEqual(this.eventName, purchaseEvent.eventName) && this.level == purchaseEvent.level && Intrinsics.areEqual(this.params, purchaseEvent.params) && Intrinsics.areEqual(this.component, purchaseEvent.component);
        }
        return false;
    }

    public int hashCode() {
        return (((((this.eventName.hashCode() * 31) + this.level.hashCode()) * 31) + this.params.hashCode()) * 31) + this.component.hashCode();
    }

    public String toString() {
        String str = this.eventName;
        LoggerLevel loggerLevel = this.level;
        Map<String, String> map = this.params;
        String str2 = this.component;
        return "PurchaseEvent(eventName=" + str + ", level=" + loggerLevel + ", params=" + map + ", component=" + str2 + ")";
    }

    public PurchaseEvent(String eventName, LoggerLevel level, Map<String, String> params, String component) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(level, "level");
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(component, "component");
        this.eventName = eventName;
        this.level = level;
        this.params = params;
        this.component = component;
    }

    @Override // com.ifriend.logger.api.events.LoggerEvent
    public String getEventName() {
        return this.eventName;
    }

    @Override // com.ifriend.logger.api.events.LoggerEvent
    public LoggerLevel getLevel() {
        return this.level;
    }

    public /* synthetic */ PurchaseEvent(String str, LoggerLevel loggerLevel, Map map, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, loggerLevel, (i & 4) != 0 ? MapsKt.emptyMap() : map, str2);
    }

    @Override // com.ifriend.logger.api.events.LoggerEvent
    public Map<String, String> getParams() {
        return this.params;
    }

    @Override // com.ifriend.logger.api.events.LoggerEvent
    public String getComponent() {
        return this.component;
    }

    @Override // com.ifriend.logger.api.events.LoggerEvent
    public LoggerReason getReason() {
        return LoggerReason.PURCHASES;
    }

    @Override // com.ifriend.logger.api.events.LoggerEvent
    public List<LoggerProvider> getProviders() {
        return CollectionsKt.listOf(LoggerProvider.DATA_DOG);
    }
}
