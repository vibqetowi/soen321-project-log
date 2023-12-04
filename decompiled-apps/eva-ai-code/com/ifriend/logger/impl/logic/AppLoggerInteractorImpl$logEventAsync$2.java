package com.ifriend.logger.impl.logic;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.ifriend.logger.api.events.LoggerEvent;
import com.ifriend.logger.api.providers.LoggerProvider;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: AppLoggerInteractorImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.logger.impl.logic.AppLoggerInteractorImpl$logEventAsync$2", f = "AppLoggerInteractorImpl.kt", i = {}, l = {ConstraintLayout.LayoutParams.Table.LAYOUT_MARGIN_BASELINE, ConstraintLayout.LayoutParams.Table.LAYOUT_GONE_MARGIN_BASELINE}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class AppLoggerInteractorImpl$logEventAsync$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ LoggerEvent $event;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ AppLoggerInteractorImpl this$0;

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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppLoggerInteractorImpl$logEventAsync$2(LoggerEvent loggerEvent, AppLoggerInteractorImpl appLoggerInteractorImpl, Continuation<? super AppLoggerInteractorImpl$logEventAsync$2> continuation) {
        super(2, continuation);
        this.$event = loggerEvent;
        this.this$0 = appLoggerInteractorImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AppLoggerInteractorImpl$logEventAsync$2(this.$event, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AppLoggerInteractorImpl$logEventAsync$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AppLoggerInteractorImpl appLoggerInteractorImpl;
        Iterator it;
        LoggerEvent loggerEvent;
        Iterable iterable;
        Object logTimberEvent;
        Object logDataDogEvent;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            List<LoggerProvider> providers = this.$event.getProviders();
            AppLoggerInteractorImpl appLoggerInteractorImpl2 = this.this$0;
            LoggerEvent loggerEvent2 = this.$event;
            appLoggerInteractorImpl = appLoggerInteractorImpl2;
            it = providers.iterator();
            loggerEvent = loggerEvent2;
            iterable = providers;
        } else if (i != 1 && i != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            it = (Iterator) this.L$3;
            iterable = (Iterable) this.L$2;
            loggerEvent = (LoggerEvent) this.L$1;
            appLoggerInteractorImpl = (AppLoggerInteractorImpl) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        while (it.hasNext()) {
            int i2 = WhenMappings.$EnumSwitchMapping$0[((LoggerProvider) it.next()).ordinal()];
            if (i2 == 1) {
                this.L$0 = appLoggerInteractorImpl;
                this.L$1 = loggerEvent;
                this.L$2 = iterable;
                this.L$3 = it;
                this.label = 1;
                logDataDogEvent = appLoggerInteractorImpl.logDataDogEvent(loggerEvent, this);
                if (logDataDogEvent == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i2 != 2) {
                continue;
            } else {
                this.L$0 = appLoggerInteractorImpl;
                this.L$1 = loggerEvent;
                this.L$2 = iterable;
                this.L$3 = it;
                this.label = 2;
                logTimberEvent = appLoggerInteractorImpl.logTimberEvent(loggerEvent, this);
                if (logTimberEvent == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        }
        return Unit.INSTANCE;
    }
}
