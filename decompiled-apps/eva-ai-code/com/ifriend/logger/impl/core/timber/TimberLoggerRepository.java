package com.ifriend.logger.impl.core.timber;

import com.facebook.internal.NativeProtocol;
import com.facebook.share.internal.ShareConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.Gson;
import com.ifriend.core.tools.api.DispatcherProvider;
import com.ifriend.logger.api.events.LoggerLevel;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import timber.log.Timber;
/* compiled from: TimberLoggerRepository.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ-\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u0011H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0012R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Lcom/ifriend/logger/impl/core/timber/TimberLoggerRepository;", "", "gson", "Lcom/google/gson/Gson;", "dispatcherProvider", "Lcom/ifriend/core/tools/api/DispatcherProvider;", "(Lcom/google/gson/Gson;Lcom/ifriend/core/tools/api/DispatcherProvider;)V", "sendError", "", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "", "throwable", "", "sendEvent", FirebaseAnalytics.Param.LEVEL, "Lcom/ifriend/logger/api/events/LoggerLevel;", NativeProtocol.WEB_DIALOG_PARAMS, "", "(Lcom/ifriend/logger/api/events/LoggerLevel;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TimberLoggerRepository {
    private final DispatcherProvider dispatcherProvider;
    private final Gson gson;

    @Inject
    public TimberLoggerRepository(Gson gson, DispatcherProvider dispatcherProvider) {
        Intrinsics.checkNotNullParameter(gson, "gson");
        Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
        this.gson = gson;
        this.dispatcherProvider = dispatcherProvider;
    }

    public final Object sendEvent(LoggerLevel loggerLevel, Map<String, String> map, Continuation<? super Unit> continuation) {
        Object withContext = BuildersKt.withContext(this.dispatcherProvider.background(), new TimberLoggerRepository$sendEvent$2(this, map, loggerLevel, null), continuation);
        return withContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : Unit.INSTANCE;
    }

    public final void sendError(String message, Throwable throwable) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Timber.Forest.d(throwable, message, new Object[0]);
    }
}
