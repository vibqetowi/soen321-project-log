package com.ifriend.presentation.features.purchases.neurons.viewmodel;

import androidx.exifinterface.media.ExifInterface;
import com.ifriend.presentation.common.uistate.UiStateDelegate;
import com.ifriend.presentation.features.purchases.billing.models.ProductPurchaseEvent;
import com.ifriend.presentation.features.purchases.neurons.viewmodel.BuyNeuronsViewModel;
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
@DebugMetadata(c = "com.ifriend.presentation.features.purchases.neurons.viewmodel.BuyNeuronsViewModel$special$$inlined$collectIn$default$1", f = "BuyNeuronsViewModel.kt", i = {}, l = {21}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class BuyNeuronsViewModel$special$$inlined$collectIn$default$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Flow $this_collectIn;
    int label;
    final /* synthetic */ BuyNeuronsViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyNeuronsViewModel$special$$inlined$collectIn$default$1(Flow flow, Continuation continuation, BuyNeuronsViewModel buyNeuronsViewModel) {
        super(2, continuation);
        this.$this_collectIn = flow;
        this.this$0 = buyNeuronsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BuyNeuronsViewModel$special$$inlined$collectIn$default$1(this.$this_collectIn, continuation, this.this$0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BuyNeuronsViewModel$special$$inlined$collectIn$default$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
    /* renamed from: com.ifriend.presentation.features.purchases.neurons.viewmodel.BuyNeuronsViewModel$special$$inlined$collectIn$default$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1<T> implements FlowCollector {
        final /* synthetic */ BuyNeuronsViewModel this$0;

        /* compiled from: flow.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "com.ifriend.presentation.features.purchases.neurons.viewmodel.BuyNeuronsViewModel$special$$inlined$collectIn$default$1$1", f = "BuyNeuronsViewModel.kt", i = {0, 0}, l = {34}, m = "emit", n = {"this", "state"}, s = {"L$0", "L$1"})
        /* renamed from: com.ifriend.presentation.features.purchases.neurons.viewmodel.BuyNeuronsViewModel$special$$inlined$collectIn$default$1$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes6.dex */
        public static final class C01831 extends ContinuationImpl {
            Object L$0;
            Object L$1;
            int label;
            /* synthetic */ Object result;

            public C01831(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return AnonymousClass1.this.emit(null, this);
            }
        }

        public AnonymousClass1(BuyNeuronsViewModel buyNeuronsViewModel) {
            this.this$0 = buyNeuronsViewModel;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0061  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0067  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(T t, Continuation<? super Unit> continuation) {
            C01831 c01831;
            int i;
            ProductPurchaseEvent productPurchaseEvent;
            AnonymousClass1<T> anonymousClass1;
            if (continuation instanceof C01831) {
                c01831 = (C01831) continuation;
                if ((c01831.label & Integer.MIN_VALUE) != 0) {
                    c01831.label -= Integer.MIN_VALUE;
                    Object obj = c01831.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c01831.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        productPurchaseEvent = (ProductPurchaseEvent) t;
                        UiStateDelegate<BuyNeuronsViewModel.UiState, BuyNeuronsViewModel.Event> uiStateDelegate = this.this$0;
                        c01831.L$0 = this;
                        c01831.L$1 = productPurchaseEvent;
                        c01831.label = 1;
                        if (uiStateDelegate.updateUiState(uiStateDelegate, BuyNeuronsViewModel$2$1.INSTANCE, c01831) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        anonymousClass1 = this;
                    } else if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        productPurchaseEvent = (ProductPurchaseEvent) c01831.L$1;
                        anonymousClass1 = (AnonymousClass1) c01831.L$0;
                        ResultKt.throwOnFailure(obj);
                    }
                    if (!Intrinsics.areEqual(productPurchaseEvent, ProductPurchaseEvent.BuyProductFailure.INSTANCE)) {
                        anonymousClass1.this$0.handleBuyProductFailure();
                    } else if (Intrinsics.areEqual(productPurchaseEvent, ProductPurchaseEvent.BuyProductUserCanceled.INSTANCE)) {
                        anonymousClass1.this$0.isPurchased = false;
                    } else if (Intrinsics.areEqual(productPurchaseEvent, ProductPurchaseEvent.InAppPurchaseFailure.INSTANCE)) {
                        anonymousClass1.this$0.handleBuyProductFailure();
                    } else if (productPurchaseEvent instanceof ProductPurchaseEvent.BuyProductSuccessful) {
                        anonymousClass1.this$0.handleBuyProductSuccessful();
                    }
                    return Unit.INSTANCE;
                }
            }
            c01831 = new C01831(continuation);
            Object obj2 = c01831.result;
            Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = c01831.label;
            if (i != 0) {
            }
            if (!Intrinsics.areEqual(productPurchaseEvent, ProductPurchaseEvent.BuyProductFailure.INSTANCE)) {
            }
            return Unit.INSTANCE;
        }
    }
}
