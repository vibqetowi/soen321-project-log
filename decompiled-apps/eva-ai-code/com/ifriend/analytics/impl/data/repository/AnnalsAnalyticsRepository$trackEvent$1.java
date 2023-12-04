package com.ifriend.analytics.impl.data.repository;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import timber.log.Timber;
/* compiled from: AnnalsAnalyticsRepository.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "throwable", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.analytics.impl.data.repository.AnnalsAnalyticsRepository$trackEvent$1", f = "AnnalsAnalyticsRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class AnnalsAnalyticsRepository$trackEvent$1 extends SuspendLambda implements Function2<Throwable, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AnnalsAnalyticsRepository$trackEvent$1(Continuation<? super AnnalsAnalyticsRepository$trackEvent$1> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AnnalsAnalyticsRepository$trackEvent$1 annalsAnalyticsRepository$trackEvent$1 = new AnnalsAnalyticsRepository$trackEvent$1(continuation);
        annalsAnalyticsRepository$trackEvent$1.L$0 = obj;
        return annalsAnalyticsRepository$trackEvent$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Throwable th, Continuation<? super Unit> continuation) {
        return ((AnnalsAnalyticsRepository$trackEvent$1) create(th, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Timber.Forest.e((Throwable) this.L$0);
        return Unit.INSTANCE;
    }
}
