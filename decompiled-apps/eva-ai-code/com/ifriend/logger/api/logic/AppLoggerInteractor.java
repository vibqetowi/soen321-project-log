package com.ifriend.logger.api.logic;

import androidx.core.app.NotificationCompat;
import com.ifriend.logger.api.events.LoggerEvent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
/* compiled from: AppLoggerInteractor.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J#\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H¦@ø\u0001\u0000¢\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, d2 = {"Lcom/ifriend/logger/api/logic/AppLoggerInteractor;", "", "logEvent", "", NotificationCompat.CATEGORY_EVENT, "Lcom/ifriend/logger/api/events/LoggerEvent;", "isHandleError", "", "(Lcom/ifriend/logger/api/events/LoggerEvent;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "logEventAsync", "api"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface AppLoggerInteractor {
    Object logEvent(LoggerEvent loggerEvent, boolean z, Continuation<? super Unit> continuation);

    void logEventAsync(LoggerEvent loggerEvent);

    /* compiled from: AppLoggerInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ Object logEvent$default(AppLoggerInteractor appLoggerInteractor, LoggerEvent loggerEvent, boolean z, Continuation continuation, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    z = true;
                }
                return appLoggerInteractor.logEvent(loggerEvent, z, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logEvent");
        }
    }
}
