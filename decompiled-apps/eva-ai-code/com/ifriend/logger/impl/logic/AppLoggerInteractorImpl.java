package com.ifriend.logger.impl.logic;

import com.ifriend.core.utils.CoroutinesKt;
import com.ifriend.logger.api.events.LoggerEvent;
import com.ifriend.logger.api.logic.AppLoggerInteractor;
import com.ifriend.logger.api.providers.LoggerProvider;
import com.ifriend.logger.impl.core.datadog.DataDogRepository;
import com.ifriend.logger.impl.core.timber.TimberLoggerRepository;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: AppLoggerInteractorImpl.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0019\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\rJ!\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0019\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Lcom/ifriend/logger/impl/logic/AppLoggerInteractorImpl;", "Lcom/ifriend/logger/api/logic/AppLoggerInteractor;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "dataDogRepository", "Lcom/ifriend/logger/impl/core/datadog/DataDogRepository;", "timberLoggerRepository", "Lcom/ifriend/logger/impl/core/timber/TimberLoggerRepository;", "(Lkotlinx/coroutines/CoroutineScope;Lcom/ifriend/logger/impl/core/datadog/DataDogRepository;Lcom/ifriend/logger/impl/core/timber/TimberLoggerRepository;)V", "logDataDogEvent", "", "event", "Lcom/ifriend/logger/api/events/LoggerEvent;", "(Lcom/ifriend/logger/api/events/LoggerEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "logEvent", "isHandleError", "", "(Lcom/ifriend/logger/api/events/LoggerEvent;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "logEventAsync", "logTimberEvent", "Companion", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AppLoggerInteractorImpl implements AppLoggerInteractor {
    private static final String COMPONENT_KEY = "component";
    private static final String COMPONENT_NO_SPECIFIED_KEY = "not_specified";
    public static final Companion Companion = new Companion(null);
    private static final String EVENT_KEY = "event";
    private static final String TIMESTAMP_KEY = "timestamp";
    private final CoroutineScope coroutineScope;
    private final DataDogRepository dataDogRepository;
    private final TimberLoggerRepository timberLoggerRepository;

    /* compiled from: AppLoggerInteractorImpl.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LoggerProvider.values().length];
            try {
                iArr[LoggerProvider.DATA_DOG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LoggerProvider.LOCAL_IN_APP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Inject
    public AppLoggerInteractorImpl(CoroutineScope coroutineScope, DataDogRepository dataDogRepository, TimberLoggerRepository timberLoggerRepository) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(dataDogRepository, "dataDogRepository");
        Intrinsics.checkNotNullParameter(timberLoggerRepository, "timberLoggerRepository");
        this.coroutineScope = coroutineScope;
        this.dataDogRepository = dataDogRepository;
        this.timberLoggerRepository = timberLoggerRepository;
    }

    /* compiled from: AppLoggerInteractorImpl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/ifriend/logger/impl/logic/AppLoggerInteractorImpl$Companion;", "", "()V", "COMPONENT_KEY", "", "COMPONENT_NO_SPECIFIED_KEY", "EVENT_KEY", "TIMESTAMP_KEY", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0078 A[Catch: all -> 0x00b6, TryCatch #0 {all -> 0x00b6, blocks: (B:23:0x0072, B:25:0x0078, B:29:0x008b, B:32:0x009e), top: B:46:0x0072 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d6  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00b1 -> B:36:0x00b3). Please submit an issue!!! */
    @Override // com.ifriend.logger.api.logic.AppLoggerInteractor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object logEvent(LoggerEvent loggerEvent, boolean z, Continuation<? super Unit> continuation) {
        AppLoggerInteractorImpl$logEvent$1 appLoggerInteractorImpl$logEvent$1;
        int i;
        AppLoggerInteractorImpl appLoggerInteractorImpl;
        LoggerEvent loggerEvent2;
        Throwable th;
        boolean z2;
        Iterator it;
        Object obj;
        LoggerEvent loggerEvent3;
        boolean z3;
        if (continuation instanceof AppLoggerInteractorImpl$logEvent$1) {
            appLoggerInteractorImpl$logEvent$1 = (AppLoggerInteractorImpl$logEvent$1) continuation;
            if ((appLoggerInteractorImpl$logEvent$1.label & Integer.MIN_VALUE) != 0) {
                appLoggerInteractorImpl$logEvent$1.label -= Integer.MIN_VALUE;
                Object obj2 = appLoggerInteractorImpl$logEvent$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = appLoggerInteractorImpl$logEvent$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj2);
                    try {
                        List<LoggerProvider> providers = loggerEvent.getProviders();
                        appLoggerInteractorImpl = this;
                        loggerEvent2 = loggerEvent;
                        it = providers.iterator();
                        obj = providers;
                        z2 = z;
                        while (it.hasNext()) {
                        }
                    } catch (Throwable th2) {
                        appLoggerInteractorImpl = this;
                        loggerEvent2 = loggerEvent;
                        th = th2;
                        z2 = z;
                    }
                    return Unit.INSTANCE;
                }
                if (i == 1) {
                    z3 = appLoggerInteractorImpl$logEvent$1.Z$0;
                    it = (Iterator) appLoggerInteractorImpl$logEvent$1.L$3;
                    obj = (Iterable) appLoggerInteractorImpl$logEvent$1.L$2;
                    loggerEvent3 = (LoggerEvent) appLoggerInteractorImpl$logEvent$1.L$1;
                    appLoggerInteractorImpl = (AppLoggerInteractorImpl) appLoggerInteractorImpl$logEvent$1.L$0;
                } else if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    z3 = appLoggerInteractorImpl$logEvent$1.Z$0;
                    it = (Iterator) appLoggerInteractorImpl$logEvent$1.L$3;
                    obj = (Iterable) appLoggerInteractorImpl$logEvent$1.L$2;
                    loggerEvent3 = (LoggerEvent) appLoggerInteractorImpl$logEvent$1.L$1;
                    appLoggerInteractorImpl = (AppLoggerInteractorImpl) appLoggerInteractorImpl$logEvent$1.L$0;
                }
                try {
                    ResultKt.throwOnFailure(obj2);
                    z2 = z3;
                    loggerEvent2 = loggerEvent3;
                    while (it.hasNext()) {
                        int i2 = WhenMappings.$EnumSwitchMapping$0[((LoggerProvider) it.next()).ordinal()];
                        if (i2 == 1) {
                            appLoggerInteractorImpl$logEvent$1.L$0 = appLoggerInteractorImpl;
                            appLoggerInteractorImpl$logEvent$1.L$1 = loggerEvent2;
                            appLoggerInteractorImpl$logEvent$1.L$2 = obj;
                            appLoggerInteractorImpl$logEvent$1.L$3 = it;
                            appLoggerInteractorImpl$logEvent$1.Z$0 = z2;
                            appLoggerInteractorImpl$logEvent$1.label = 1;
                            if (appLoggerInteractorImpl.logDataDogEvent(loggerEvent2, appLoggerInteractorImpl$logEvent$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else if (i2 == 2) {
                            appLoggerInteractorImpl$logEvent$1.L$0 = appLoggerInteractorImpl;
                            appLoggerInteractorImpl$logEvent$1.L$1 = loggerEvent2;
                            appLoggerInteractorImpl$logEvent$1.L$2 = obj;
                            appLoggerInteractorImpl$logEvent$1.L$3 = it;
                            appLoggerInteractorImpl$logEvent$1.Z$0 = z2;
                            appLoggerInteractorImpl$logEvent$1.label = 2;
                            if (appLoggerInteractorImpl.logTimberEvent(loggerEvent2, appLoggerInteractorImpl$logEvent$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        loggerEvent3 = loggerEvent2;
                        z3 = z2;
                        z2 = z3;
                        loggerEvent2 = loggerEvent3;
                        while (it.hasNext()) {
                            try {
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    z2 = z3;
                    loggerEvent2 = loggerEvent3;
                }
                return Unit.INSTANCE;
                if (!z2) {
                    appLoggerInteractorImpl.timberLoggerRepository.sendError("DataDogEvent log event error:" + loggerEvent2, th);
                    return Unit.INSTANCE;
                }
                throw th;
            }
        }
        appLoggerInteractorImpl$logEvent$1 = new AppLoggerInteractorImpl$logEvent$1(this, continuation);
        Object obj22 = appLoggerInteractorImpl$logEvent$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = appLoggerInteractorImpl$logEvent$1.label;
        if (i != 0) {
        }
        if (!z2) {
        }
    }

    @Override // com.ifriend.logger.api.logic.AppLoggerInteractor
    public void logEventAsync(LoggerEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        CoroutinesKt.safeLaunch$default(this.coroutineScope, new AppLoggerInteractorImpl$logEventAsync$1(this, event, null), null, new AppLoggerInteractorImpl$logEventAsync$2(event, this, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object logDataDogEvent(LoggerEvent loggerEvent, Continuation<? super Unit> continuation) {
        Map<String, String> mutableMap = MapsKt.toMutableMap(loggerEvent.getParams());
        mutableMap.put("event", loggerEvent.getEventName());
        String component = loggerEvent.getComponent();
        if (StringsKt.isBlank(component)) {
            component = COMPONENT_NO_SPECIFIED_KEY;
        }
        mutableMap.put(COMPONENT_KEY, component);
        mutableMap.put("timestamp", String.valueOf(System.currentTimeMillis()));
        Object sendEvent = this.dataDogRepository.sendEvent(loggerEvent.getLevel().getValue(), loggerEvent.getReason().getValue(), mutableMap, continuation);
        return sendEvent == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? sendEvent : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object logTimberEvent(LoggerEvent loggerEvent, Continuation<? super Unit> continuation) {
        Map<String, String> mutableMap = MapsKt.toMutableMap(loggerEvent.getParams());
        mutableMap.put("event", loggerEvent.getEventName());
        String component = loggerEvent.getComponent();
        if (StringsKt.isBlank(component)) {
            component = COMPONENT_NO_SPECIFIED_KEY;
        }
        mutableMap.put(COMPONENT_KEY, component);
        Object sendEvent = this.timberLoggerRepository.sendEvent(loggerEvent.getLevel(), mutableMap, continuation);
        return sendEvent == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? sendEvent : Unit.INSTANCE;
    }
}
