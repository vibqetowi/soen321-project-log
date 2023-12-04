package com.ifriend.infrastructure.connectivity;

import com.ifriend.domain.infrastucture.Connectivity;
import com.ifriend.infrastructure.connectivity.InternetConnectionImpl;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
/* compiled from: InternetConnectionImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.infrastructure.connectivity.InternetConnectionImpl$updateConnectivityState$1", f = "InternetConnectionImpl.kt", i = {}, l = {91, 93, 95, 98}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class InternetConnectionImpl$updateConnectivityState$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ InternetConnectionImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InternetConnectionImpl$updateConnectivityState$1(InternetConnectionImpl internetConnectionImpl, Continuation<? super InternetConnectionImpl$updateConnectivityState$1> continuation) {
        super(2, continuation);
        this.this$0 = internetConnectionImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InternetConnectionImpl$updateConnectivityState$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InternetConnectionImpl$updateConnectivityState$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0086 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        MutableStateFlow mutableStateFlow;
        boolean isNetworkCapabilitiesValid;
        Connectivity connectivity;
        MutableStateFlow mutableStateFlow2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            mutableStateFlow = this.this$0.updateConnectivityState;
            this.label = 1;
            if (mutableStateFlow.emit(InternetConnectionImpl.FetchState.Loading, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i != 1) {
            if (i == 2) {
                ResultKt.throwOnFailure(obj);
                connectivity = (Connectivity) obj;
                if (connectivity.isFullyConnected()) {
                    this.label = 3;
                    if (this.this$0.networkState.emit(connectivity, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                mutableStateFlow2 = this.this$0.updateConnectivityState;
                this.label = 4;
                if (mutableStateFlow2.emit(InternetConnectionImpl.FetchState.Success, this) == coroutine_suspended) {
                }
                return Unit.INSTANCE;
            } else if (i != 3) {
                if (i == 4) {
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                ResultKt.throwOnFailure(obj);
                mutableStateFlow2 = this.this$0.updateConnectivityState;
                this.label = 4;
                if (mutableStateFlow2.emit(InternetConnectionImpl.FetchState.Success, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
        } else {
            ResultKt.throwOnFailure(obj);
        }
        isNetworkCapabilitiesValid = this.this$0.isNetworkCapabilitiesValid();
        if (isNetworkCapabilitiesValid) {
            this.label = 2;
            obj = this.this$0.getLastKnowConnectivityState(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            connectivity = (Connectivity) obj;
            if (connectivity.isFullyConnected()) {
            }
        }
        mutableStateFlow2 = this.this$0.updateConnectivityState;
        this.label = 4;
        if (mutableStateFlow2.emit(InternetConnectionImpl.FetchState.Success, this) == coroutine_suspended) {
        }
        return Unit.INSTANCE;
    }
}
