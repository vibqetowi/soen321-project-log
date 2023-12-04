package com.ifriend.presentation.features.purchases.premium.viewmodel;

import androidx.exifinterface.media.ExifInterface;
import com.ifriend.presentation.common.uistate.UiStateDelegate;
import com.ifriend.presentation.features.purchases.billing.models.ProductPurchaseEvent;
import com.ifriend.presentation.features.purchases.premium.viewmodel.BuyPremiumViewModel;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
/* compiled from: flow.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¨\u0006\u0003"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/CoroutineScope;", "", "com/ifriend/common_utils/extensions/FlowKt$collectIn$1", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.presentation.features.purchases.premium.viewmodel.BuyPremiumViewModel$special$$inlined$collectIn$default$1", f = "BuyPremiumViewModel.kt", i = {}, l = {21}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class BuyPremiumViewModel$special$$inlined$collectIn$default$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Flow $this_collectIn;
    int label;
    final /* synthetic */ BuyPremiumViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyPremiumViewModel$special$$inlined$collectIn$default$1(Flow flow, Continuation continuation, BuyPremiumViewModel buyPremiumViewModel) {
        super(2, continuation);
        this.$this_collectIn = flow;
        this.this$0 = buyPremiumViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BuyPremiumViewModel$special$$inlined$collectIn$default$1(this.$this_collectIn, continuation, this.this$0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BuyPremiumViewModel$special$$inlined$collectIn$default$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            if (this.$this_collectIn.collect(new AnonymousClass1(this.this$0), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.INSTANCE;
    }

    /* compiled from: flow.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "it", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "com/ifriend/common_utils/extensions/FlowKt$collectIn$1$1"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.presentation.features.purchases.premium.viewmodel.BuyPremiumViewModel$special$$inlined$collectIn$default$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1<T> implements FlowCollector {
        final /* synthetic */ BuyPremiumViewModel this$0;

        /* compiled from: flow.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "com.ifriend.presentation.features.purchases.premium.viewmodel.BuyPremiumViewModel$special$$inlined$collectIn$default$1$1", f = "BuyPremiumViewModel.kt", i = {0, 0}, l = {34, 37}, m = "emit", n = {"this", "state"}, s = {"L$0", "L$1"})
        /* renamed from: com.ifriend.presentation.features.purchases.premium.viewmodel.BuyPremiumViewModel$special$$inlined$collectIn$default$1$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes6.dex */
        public static final class C01841 extends ContinuationImpl {
            Object L$0;
            Object L$1;
            int label;
            /* synthetic */ Object result;

            public C01841(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return AnonymousClass1.this.emit(null, this);
            }
        }

        public AnonymousClass1(BuyPremiumViewModel buyPremiumViewModel) {
            this.this$0 = buyPremiumViewModel;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0042  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0080  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(T t, Continuation<? super Unit> continuation) {
            C01841 c01841;
            int i;
            ProductPurchaseEvent productPurchaseEvent;
            AnonymousClass1<T> anonymousClass1;
            if (continuation instanceof C01841) {
                c01841 = (C01841) continuation;
                if ((c01841.label & Integer.MIN_VALUE) != 0) {
                    c01841.label -= Integer.MIN_VALUE;
                    Object obj = c01841.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c01841.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        productPurchaseEvent = (ProductPurchaseEvent) t;
                        UiStateDelegate<BuyPremiumViewModel.UiState, BuyPremiumViewModel.Event> uiStateDelegate = this.this$0;
                        c01841.L$0 = this;
                        c01841.L$1 = productPurchaseEvent;
                        c01841.label = 1;
                        if (uiStateDelegate.updateUiState(uiStateDelegate, BuyPremiumViewModel$1$1.INSTANCE, c01841) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        anonymousClass1 = this;
                    } else if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    } else {
                        productPurchaseEvent = (ProductPurchaseEvent) c01841.L$1;
                        anonymousClass1 = (AnonymousClass1) c01841.L$0;
                        ResultKt.throwOnFailure(obj);
                    }
                    if (!Intrinsics.areEqual(productPurchaseEvent, ProductPurchaseEvent.BuyProductUserCanceled.INSTANCE)) {
                        UiStateDelegate<BuyPremiumViewModel.UiState, BuyPremiumViewModel.Event> uiStateDelegate2 = anonymousClass1.this$0;
                        c01841.L$0 = null;
                        c01841.L$1 = null;
                        c01841.label = 2;
                        if (uiStateDelegate2.updateUiState(uiStateDelegate2, BuyPremiumViewModel$1$2.INSTANCE, c01841) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else if (!Intrinsics.areEqual(productPurchaseEvent, ProductPurchaseEvent.BuyProductFailure.INSTANCE)) {
                        if (!Intrinsics.areEqual(productPurchaseEvent, ProductPurchaseEvent.InAppPurchaseFailure.INSTANCE)) {
                            if (productPurchaseEvent instanceof ProductPurchaseEvent.BuyProductSuccessful) {
                                anonymousClass1.this$0.handleBuyProductSuccessful();
                            }
                        } else {
                            anonymousClass1.this$0.handleBuyProductFailure();
                        }
                    } else {
                        anonymousClass1.this$0.handleBuyProductFailure();
                    }
                    return Unit.INSTANCE;
                }
            }
            c01841 = new C01841(continuation);
            Object obj2 = c01841.result;
            Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = c01841.label;
            if (i != 0) {
            }
            if (!Intrinsics.areEqual(productPurchaseEvent, ProductPurchaseEvent.BuyProductUserCanceled.INSTANCE)) {
            }
            return Unit.INSTANCE;
        }
    }
}
