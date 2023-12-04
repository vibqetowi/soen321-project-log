package com.ifriend.logger.api.events;

import com.facebook.internal.NativeProtocol;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ifriend.logger.api.events.LoggerEvent;
import com.ifriend.logger.api.providers.LoggerProvider;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: LoggerEvent.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\u0015\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0003J3\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006#"}, d2 = {"Lcom/ifriend/logger/api/events/LocalEvent;", "Lcom/ifriend/logger/api/events/LoggerEvent;", "eventName", "", FirebaseAnalytics.Param.LEVEL, "Lcom/ifriend/logger/api/events/LoggerLevel;", NativeProtocol.WEB_DIALOG_PARAMS, "", "(Ljava/lang/String;Lcom/ifriend/logger/api/events/LoggerLevel;Ljava/util/Map;)V", "getEventName", "()Ljava/lang/String;", "getLevel", "()Lcom/ifriend/logger/api/events/LoggerLevel;", "getParams", "()Ljava/util/Map;", "providers", "", "Lcom/ifriend/logger/api/providers/LoggerProvider;", "getProviders", "()Ljava/util/List;", "reason", "Lcom/ifriend/logger/api/events/LoggerReason;", "getReason", "()Lcom/ifriend/logger/api/events/LoggerReason;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "api"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LocalEvent implements LoggerEvent {
    private final String eventName;
    private final LoggerLevel level;
    private final Map<String, String> params;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LocalEvent copy$default(LocalEvent localEvent, String str, LoggerLevel loggerLevel, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = localEvent.eventName;
        }
        if ((i & 2) != 0) {
            loggerLevel = localEvent.level;
        }
        if ((i & 4) != 0) {
            map = localEvent.params;
        }
        return localEvent.copy(str, loggerLevel, map);
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

    public final LocalEvent copy(String eventName, LoggerLevel level, Map<String, String> params) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(level, "level");
        Intrinsics.checkNotNullParameter(params, "params");
        return new LocalEvent(eventName, level, params);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LocalEvent) {
            LocalEvent localEvent = (LocalEvent) obj;
            return Intrinsics.areEqual(this.eventName, localEvent.eventName) && this.level == localEvent.level && Intrinsics.areEqual(this.params, localEvent.params);
        }
        return false;
    }

    public int hashCode() {
        return (((this.eventName.hashCode() * 31) + this.level.hashCode()) * 31) + this.params.hashCode();
    }

    public String toString() {
        String str = this.eventName;
        LoggerLevel loggerLevel = this.level;
        Map<String, String> map = this.params;
        return "LocalEvent(eventName=" + str + ", level=" + loggerLevel + ", params=" + map + ")";
    }

    public LocalEvent(String eventName, LoggerLevel level, Map<String, String> params) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(level, "level");
        Intrinsics.checkNotNullParameter(params, "params");
        this.eventName = eventName;
        this.level = level;
        this.params = params;
    }

    @Override // com.ifriend.logger.api.events.LoggerEvent
    public String getComponent() {
        return LoggerEvent.DefaultImpls.getComponent(this);
    }

    @Override // com.ifriend.logger.api.events.LoggerEvent
    public String getEventName() {
        return this.eventName;
    }

    public /* synthetic */ LocalEvent(String str, LoggerLevel loggerLevel, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? LoggerLevel.INFO : loggerLevel, (i & 4) != 0 ? MapsKt.emptyMap() : map);
    }

    @Override // com.ifriend.logger.api.events.LoggerEvent
    public LoggerLevel getLevel() {
        return this.level;
    }

    @Override // com.ifriend.logger.api.events.LoggerEvent
    public Map<String, String> getParams() {
        return this.params;
    }

    @Override // com.ifriend.logger.api.events.LoggerEvent
    public LoggerReason getReason() {
        return LoggerReason.UNKNOWN;
    }

    @Override // com.ifriend.logger.api.events.LoggerEvent
    public List<LoggerProvider> getProviders() {
        return CollectionsKt.listOf(LoggerProvider.LOCAL_IN_APP);
    }
}
