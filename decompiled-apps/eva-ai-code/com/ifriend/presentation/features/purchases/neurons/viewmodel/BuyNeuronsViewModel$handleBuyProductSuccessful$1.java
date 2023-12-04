package com.ifriend.presentation.features.purchases.neurons.viewmodel;

import com.ifriend.presentation.common.observers.FlowObserverEmitter;
import com.ifriend.presentation.common.uistate.UiStateDelegate;
import com.ifriend.presentation.features.purchases.neurons.viewmodel.BuyNeuronsViewModel;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BuyNeuronsViewModel.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "throwable", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.presentation.features.purchases.neurons.viewmodel.BuyNeuronsViewModel$handleBuyProductSuccessful$1", f = "BuyNeuronsViewModel.kt", i = {}, l = {151, 152}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class BuyNeuronsViewModel$handleBuyProductSuccessful$1 extends SuspendLambda implements Function2<Throwable, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ BuyNeuronsViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyNeuronsViewModel$handleBuyProductSuccessful$1(BuyNeuronsViewModel buyNeuronsViewModel, Continuation<? super BuyNeuronsViewModel$handleBuyProductSuccessful$1> continuation) {
        super(2, continuation);
        this.this$0 = buyNeuronsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BuyNeuronsViewModel$handleBuyProductSuccessful$1 buyNeuronsViewModel$handleBuyProductSuccessful$1 = new BuyNeuronsViewModel$handleBuyProductSuccessful$1(this.this$0, continuation);
        buyNeuronsViewModel$handleBuyProductSuccessful$1.L$0 = obj;
        return buyNeuronsViewModel$handleBuyProductSuccessful$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Throwable th, Continuation<? super Unit> continuation) {
        return ((BuyNeuronsViewModel$handleBuyProductSuccessful$1) create(th, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FlowObserverEmitter flowObserverEmitter = this.this$0.exceptionsEmitter;
            this.label = 1;
            if (flowObserverEmitter.emit((Throwable) this.L$0, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i != 1) {
            if (i == 2) {
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
        }
        UiStateDelegate<BuyNeuronsViewModel.UiState, BuyNeuronsViewModel.Event> uiStateDelegate = this.this$0;
        this.label = 2;
        if (uiStateDelegate.sendEvent2(uiStateDelegate, (BuyNeuronsViewModel.Event) BuyNeuronsViewModel.Event.Close.INSTANCE, (Continuation<? super Unit>) this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
