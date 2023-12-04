package com.ifriend.presentation.features.purchases.neurons.viewmodel;

import com.facebook.internal.FacebookRequestErrorClassification;
import com.ifriend.presentation.R;
import com.ifriend.presentation.common.uistate.UiStateDelegate;
import com.ifriend.presentation.features.purchases.neurons.model.BuyNeuronsProductUiParams;
import com.ifriend.presentation.features.purchases.neurons.viewmodel.BuyNeuronsViewModel;
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
@DebugMetadata(c = "com.ifriend.presentation.features.purchases.neurons.viewmodel.BuyNeuronsViewModel$updateActionLabel$1", f = "BuyNeuronsViewModel.kt", i = {}, l = {FacebookRequestErrorClassification.EC_INVALID_TOKEN}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class BuyNeuronsViewModel$updateActionLabel$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ BuyNeuronsProductUiParams $item;
    int label;
    final /* synthetic */ BuyNeuronsViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyNeuronsViewModel$updateActionLabel$1(BuyNeuronsViewModel buyNeuronsViewModel, BuyNeuronsProductUiParams buyNeuronsProductUiParams, Continuation<? super BuyNeuronsViewModel$updateActionLabel$1> continuation) {
        super(2, continuation);
        this.this$0 = buyNeuronsViewModel;
        this.$item = buyNeuronsProductUiParams;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BuyNeuronsViewModel$updateActionLabel$1(this.this$0, this.$item, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BuyNeuronsViewModel$updateActionLabel$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            String string = this.this$0.getString(R.string.chat_subscription__buy_action, this.$item.getPriceLabel());
            UiStateDelegate<BuyNeuronsViewModel.UiState, BuyNeuronsViewModel.Event> uiStateDelegate = this.this$0;
            this.label = 1;
            if (uiStateDelegate.updateUiState(uiStateDelegate, new AnonymousClass1(string), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BuyNeuronsViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/presentation/features/purchases/neurons/viewmodel/BuyNeuronsViewModel$UiState;", "state", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.presentation.features.purchases.neurons.viewmodel.BuyNeuronsViewModel$updateActionLabel$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Function1<BuyNeuronsViewModel.UiState, BuyNeuronsViewModel.UiState> {
        final /* synthetic */ String $actionLabel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(String str) {
            super(1);
            this.$actionLabel = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public final BuyNeuronsViewModel.UiState invoke(BuyNeuronsViewModel.UiState state) {
            Intrinsics.checkNotNullParameter(state, "state");
            return BuyNeuronsViewModel.UiState.copy$default(state, null, false, this.$actionLabel, 3, null);
        }
    }
}
