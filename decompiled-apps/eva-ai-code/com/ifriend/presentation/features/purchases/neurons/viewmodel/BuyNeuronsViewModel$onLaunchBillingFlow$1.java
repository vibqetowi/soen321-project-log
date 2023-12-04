package com.ifriend.presentation.features.purchases.neurons.viewmodel;

import com.ifriend.presentation.common.observers.FlowObserverEmitter;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BuyNeuronsViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.presentation.features.purchases.neurons.viewmodel.BuyNeuronsViewModel$onLaunchBillingFlow$1", f = "BuyNeuronsViewModel.kt", i = {}, l = {247}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class BuyNeuronsViewModel$onLaunchBillingFlow$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Object $result;
    int label;
    final /* synthetic */ BuyNeuronsViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyNeuronsViewModel$onLaunchBillingFlow$1(Object obj, BuyNeuronsViewModel buyNeuronsViewModel, Continuation<? super BuyNeuronsViewModel$onLaunchBillingFlow$1> continuation) {
        super(2, continuation);
        this.$result = obj;
        this.this$0 = buyNeuronsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BuyNeuronsViewModel$onLaunchBillingFlow$1(this.$result, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BuyNeuronsViewModel$onLaunchBillingFlow$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (Result.m7277isFailureimpl(this.$result)) {
                FlowObserverEmitter flowObserverEmitter = this.this$0.exceptionsEmitter;
                Throwable m7274exceptionOrNullimpl = Result.m7274exceptionOrNullimpl(this.$result);
                if (m7274exceptionOrNullimpl == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                this.label = 1;
                if (flowObserverEmitter.emit(m7274exceptionOrNullimpl, this) == coroutine_suspended) {
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
