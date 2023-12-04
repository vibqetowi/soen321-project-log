package com.ifriend.presentation.features.purchases.neurons.viewmodel;

import com.android.billingclient.api.BillingFlowParams;
import com.ifriend.presentation.common.uistate.UiStateDelegate;
import com.ifriend.presentation.features.purchases.neurons.model.BuyNeuronsProductUiParams;
import com.ifriend.presentation.features.purchases.neurons.viewmodel.BuyNeuronsViewModel;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BuyNeuronsViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.presentation.features.purchases.neurons.viewmodel.BuyNeuronsViewModel$onContinueClick$2", f = "BuyNeuronsViewModel.kt", i = {}, l = {176, 180, 181}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class BuyNeuronsViewModel$onContinueClick$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ BuyNeuronsViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyNeuronsViewModel$onContinueClick$2(BuyNeuronsViewModel buyNeuronsViewModel, Continuation<? super BuyNeuronsViewModel$onContinueClick$2> continuation) {
        super(2, continuation);
        this.this$0 = buyNeuronsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BuyNeuronsViewModel$onContinueClick$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BuyNeuronsViewModel$onContinueClick$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BuyNeuronsViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/presentation/features/purchases/neurons/viewmodel/BuyNeuronsViewModel$UiState;", "state", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.presentation.features.purchases.neurons.viewmodel.BuyNeuronsViewModel$onContinueClick$2$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Function1<BuyNeuronsViewModel.UiState, BuyNeuronsViewModel.UiState> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final BuyNeuronsViewModel.UiState invoke(BuyNeuronsViewModel.UiState state) {
            Intrinsics.checkNotNullParameter(state, "state");
            return BuyNeuronsViewModel.UiState.copy$default(state, null, true, null, 5, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x008e A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        UiStateDelegate<BuyNeuronsViewModel.UiState, BuyNeuronsViewModel.Event> uiStateDelegate;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            UiStateDelegate<BuyNeuronsViewModel.UiState, BuyNeuronsViewModel.Event> uiStateDelegate2 = this.this$0;
            this.label = 1;
            if (uiStateDelegate2.updateUiState(uiStateDelegate2, AnonymousClass1.INSTANCE, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            uiStateDelegate = this.this$0;
            this.label = 3;
            if (uiStateDelegate.sendEvent2(uiStateDelegate, (BuyNeuronsViewModel.Event) new BuyNeuronsViewModel.Event.LaunchBillingFlow((BillingFlowParams) obj), (Continuation<? super Unit>) this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        } else {
            ResultKt.throwOnFailure(obj);
        }
        UiStateDelegate<BuyNeuronsViewModel.UiState, BuyNeuronsViewModel.Event> uiStateDelegate3 = this.this$0;
        for (BuyNeuronsProductUiParams buyNeuronsProductUiParams : uiStateDelegate3.getUiState(uiStateDelegate3).getProducts()) {
            if (buyNeuronsProductUiParams.isSelected()) {
                this.label = 2;
                obj = this.this$0.getBillingFlowParams(buyNeuronsProductUiParams.getProductId(), this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                uiStateDelegate = this.this$0;
                this.label = 3;
                if (uiStateDelegate.sendEvent2(uiStateDelegate, (BuyNeuronsViewModel.Event) new BuyNeuronsViewModel.Event.LaunchBillingFlow((BillingFlowParams) obj), (Continuation<? super Unit>) this) == coroutine_suspended) {
                }
                return Unit.INSTANCE;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
