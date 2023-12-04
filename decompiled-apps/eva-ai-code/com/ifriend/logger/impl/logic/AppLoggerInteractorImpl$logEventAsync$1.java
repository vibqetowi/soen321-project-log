package com.ifriend.logger.impl.logic;

import com.ifriend.logger.api.events.LoggerEvent;
import com.ifriend.logger.impl.core.timber.TimberLoggerRepository;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
/* compiled from: AppLoggerInteractorImpl.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "throwable", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.logger.impl.logic.AppLoggerInteractorImpl$logEventAsync$1", f = "AppLoggerInteractorImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class AppLoggerInteractorImpl$logEventAsync$1 extends SuspendLambda implements Function2<Throwable, Continuation<? super Unit>, Object> {
    final /* synthetic */ LoggerEvent $event;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AppLoggerInteractorImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppLoggerInteractorImpl$logEventAsync$1(AppLoggerInteractorImpl appLoggerInteractorImpl, LoggerEvent loggerEvent, Continuation<? super AppLoggerInteractorImpl$logEventAsync$1> continuation) {
        super(2, continuation);
        this.this$0 = appLoggerInteractorImpl;
        this.$event = loggerEvent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AppLoggerInteractorImpl$logEventAsync$1 appLoggerInteractorImpl$logEventAsync$1 = new AppLoggerInteractorImpl$logEventAsync$1(this.this$0, this.$event, continuation);
        appLoggerInteractorImpl$logEventAsync$1.L$0 = obj;
        return appLoggerInteractorImpl$logEventAsync$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Throwable th, Continuation<? super Unit> continuation) {
        return ((AppLoggerInteractorImpl$logEventAsync$1) create(th, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        TimberLoggerRepository timberLoggerRepository;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            timberLoggerRepository = this.this$0.timberLoggerRepository;
            LoggerEvent loggerEvent = this.$event;
            timberLoggerRepository.sendError("DataDogEvent:" + loggerEvent, (Throwable) this.L$0);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
