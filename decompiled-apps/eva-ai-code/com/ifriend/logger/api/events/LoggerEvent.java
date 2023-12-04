package com.ifriend.logger.api.events;

import com.facebook.internal.NativeProtocol;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ifriend.logger.api.providers.LoggerProvider;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
/* compiled from: LoggerEvent.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0012\u0010\b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR \u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/ifriend/logger/api/events/LoggerEvent;", "", "component", "", "getComponent", "()Ljava/lang/String;", "eventName", "getEventName", FirebaseAnalytics.Param.LEVEL, "Lcom/ifriend/logger/api/events/LoggerLevel;", "getLevel", "()Lcom/ifriend/logger/api/events/LoggerLevel;", NativeProtocol.WEB_DIALOG_PARAMS, "", "getParams", "()Ljava/util/Map;", "providers", "", "Lcom/ifriend/logger/api/providers/LoggerProvider;", "getProviders", "()Ljava/util/List;", "reason", "Lcom/ifriend/logger/api/events/LoggerReason;", "getReason", "()Lcom/ifriend/logger/api/events/LoggerReason;", "api"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface LoggerEvent {
    String getComponent();

    String getEventName();

    LoggerLevel getLevel();

    Map<String, String> getParams();

    List<LoggerProvider> getProviders();

    LoggerReason getReason();

    /* compiled from: LoggerEvent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class DefaultImpls {
        public static String getComponent(LoggerEvent loggerEvent) {
            return "";
        }

        public static LoggerReason getReason(LoggerEvent loggerEvent) {
            return LoggerReason.UNKNOWN;
        }

        public static Map<String, String> getParams(LoggerEvent loggerEvent) {
            return MapsKt.emptyMap();
        }

        public static List<LoggerProvider> getProviders(LoggerEvent loggerEvent) {
            return CollectionsKt.emptyList();
        }
    }
}
