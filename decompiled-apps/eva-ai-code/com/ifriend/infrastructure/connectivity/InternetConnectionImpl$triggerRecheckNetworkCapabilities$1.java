package com.ifriend.infrastructure.connectivity;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.ifriend.domain.infrastucture.Connectivity;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: InternetConnectionImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.infrastructure.connectivity.InternetConnectionImpl$triggerRecheckNetworkCapabilities$1", f = "InternetConnectionImpl.kt", i = {}, l = {TsExtractor.TS_STREAM_TYPE_SPLICE_INFO}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class InternetConnectionImpl$triggerRecheckNetworkCapabilities$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ InternetConnectionImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InternetConnectionImpl$triggerRecheckNetworkCapabilities$1(InternetConnectionImpl internetConnectionImpl, Continuation<? super InternetConnectionImpl$triggerRecheckNetworkCapabilities$1> continuation) {
        super(2, continuation);
        this.this$0 = internetConnectionImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InternetConnectionImpl$triggerRecheckNetworkCapabilities$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InternetConnectionImpl$triggerRecheckNetworkCapabilities$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MutableSharedFlow mutableSharedFlow;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (!((Connectivity) this.this$0.networkState.getValue()).isFullyConnected()) {
                mutableSharedFlow = this.this$0.connectivityFlow;
                this.label = 1;
                if (mutableSharedFlow.emit(Unit.INSTANCE, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
