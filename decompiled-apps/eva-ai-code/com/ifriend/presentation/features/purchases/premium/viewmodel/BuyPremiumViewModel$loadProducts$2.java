package com.ifriend.presentation.features.purchases.premium.viewmodel;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.ifriend.analytics.api.logic.AnalyticsInteractor;
import com.ifriend.billing.api.models.BillingProduct;
import com.ifriend.presentation.common.observers.FlowObserverEmitter;
import com.ifriend.presentation.common.uistate.UiStateDelegate;
import com.ifriend.presentation.features.purchases.premium.model.BuyPremiumPlanUiMapper;
import com.ifriend.presentation.features.purchases.premium.model.BuyPremiumPlanUiParams;
import com.ifriend.presentation.features.purchases.premium.viewmodel.BuyPremiumViewModel;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.collections.immutable.ExtensionsKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BuyPremiumViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.presentation.features.purchases.premium.viewmodel.BuyPremiumViewModel$loadProducts$2", f = "BuyPremiumViewModel.kt", i = {}, l = {121, 122, TsExtractor.TS_STREAM_TYPE_AC3, TsExtractor.TS_STREAM_TYPE_HDMV_DTS, 154}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class BuyPremiumViewModel$loadProducts$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ BuyPremiumViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyPremiumViewModel$loadProducts$2(BuyPremiumViewModel buyPremiumViewModel, Continuation<? super BuyPremiumViewModel$loadProducts$2> continuation) {
        super(2, continuation);
        this.this$0 = buyPremiumViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BuyPremiumViewModel$loadProducts$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BuyPremiumViewModel$loadProducts$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BuyPremiumViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/presentation/features/purchases/premium/viewmodel/BuyPremiumViewModel$UiState;", "state", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.presentation.features.purchases.premium.viewmodel.BuyPremiumViewModel$loadProducts$2$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Function1<BuyPremiumViewModel.UiState, BuyPremiumViewModel.UiState> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final BuyPremiumViewModel.UiState invoke(BuyPremiumViewModel.UiState state) {
            Intrinsics.checkNotNullParameter(state, "state");
            return BuyPremiumViewModel.UiState.copy$default(state, null, null, null, null, true, false, null, 111, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00aa  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object purchaseProducts;
        List list;
        BuyPremiumPlanUiParams buyPremiumPlanUiParams;
        BuyPremiumPlanUiParams buyPremiumPlanUiParams2;
        BuyPremiumPlanUiMapper buyPremiumPlanUiMapper;
        BuyPremiumPlanUiMapper buyPremiumPlanUiMapper2;
        BuyPremiumPlanUiMapper buyPremiumPlanUiMapper3;
        AnalyticsInteractor analyticsInteractor;
        FlowObserverEmitter flowObserverEmitter;
        UiStateDelegate<BuyPremiumViewModel.UiState, BuyPremiumViewModel.Event> uiStateDelegate;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            UiStateDelegate<BuyPremiumViewModel.UiState, BuyPremiumViewModel.Event> uiStateDelegate2 = this.this$0;
            this.label = 1;
            if (uiStateDelegate2.updateUiState(uiStateDelegate2, AnonymousClass1.INSTANCE, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    ResultKt.throwOnFailure(obj);
                    uiStateDelegate = this.this$0;
                    this.label = 4;
                    if (uiStateDelegate.sendEvent2(uiStateDelegate, (BuyPremiumViewModel.Event) BuyPremiumViewModel.Event.CloseFeature.INSTANCE, (Continuation<? super Unit>) this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                } else if (i == 4) {
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                } else if (i == 5) {
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
            ResultKt.throwOnFailure(obj);
            purchaseProducts = obj;
            list = (List) purchaseProducts;
            if (list.size() >= 3) {
                analyticsInteractor = this.this$0.analyticsInteractor;
                analyticsInteractor.trackException("Plans count is less than 3", new IllegalStateException("Plans count is less than 3"));
                flowObserverEmitter = this.this$0.exceptionsEmitter;
                this.label = 3;
                if (flowObserverEmitter.emit(new IllegalStateException("Invalid Products count!"), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                uiStateDelegate = this.this$0;
                this.label = 4;
                if (uiStateDelegate.sendEvent2(uiStateDelegate, (BuyPremiumViewModel.Event) BuyPremiumViewModel.Event.CloseFeature.INSTANCE, (Continuation<? super Unit>) this) == coroutine_suspended) {
                }
                return Unit.INSTANCE;
            }
            List take = CollectionsKt.take(CollectionsKt.sortedWith(list, new Comparator() { // from class: com.ifriend.presentation.features.purchases.premium.viewmodel.BuyPremiumViewModel$loadProducts$2$invokeSuspend$$inlined$sortedBy$1
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt.compareValues(Integer.valueOf(((BillingProduct) t).getSubscriptionMonths()), Integer.valueOf(((BillingProduct) t2).getSubscriptionMonths()));
                }
            }), 3);
            Iterator it = take.iterator();
            if (!it.hasNext()) {
                throw new NoSuchElementException();
            }
            double priceForOneMonth = ((BillingProduct) it.next()).getPriceForOneMonth();
            while (it.hasNext()) {
                priceForOneMonth = Math.max(priceForOneMonth, ((BillingProduct) it.next()).getPriceForOneMonth());
            }
            BuyPremiumPlanUiParams[] buyPremiumPlanUiParamsArr = new BuyPremiumPlanUiParams[3];
            BillingProduct billingProduct = (BillingProduct) CollectionsKt.getOrNull(take, 0);
            BuyPremiumPlanUiParams buyPremiumPlanUiParams3 = null;
            if (billingProduct != null) {
                buyPremiumPlanUiMapper3 = this.this$0.mapper;
                buyPremiumPlanUiParams = BuyPremiumPlanUiMapper.map$default(buyPremiumPlanUiMapper3, billingProduct, priceForOneMonth, false, 4, null);
            } else {
                buyPremiumPlanUiParams = null;
            }
            buyPremiumPlanUiParamsArr[0] = buyPremiumPlanUiParams;
            BillingProduct billingProduct2 = (BillingProduct) CollectionsKt.getOrNull(take, 2);
            if (billingProduct2 != null) {
                BuyPremiumViewModel buyPremiumViewModel = this.this$0;
                buyPremiumPlanUiMapper2 = buyPremiumViewModel.mapper;
                buyPremiumPlanUiParams2 = buyPremiumPlanUiMapper2.map(billingProduct2, priceForOneMonth, true);
                buyPremiumViewModel.updateActionLabel(buyPremiumPlanUiParams2);
            } else {
                buyPremiumPlanUiParams2 = null;
            }
            buyPremiumPlanUiParamsArr[1] = buyPremiumPlanUiParams2;
            BillingProduct billingProduct3 = (BillingProduct) CollectionsKt.getOrNull(take, 1);
            if (billingProduct3 != null) {
                buyPremiumPlanUiMapper = this.this$0.mapper;
                buyPremiumPlanUiParams3 = BuyPremiumPlanUiMapper.map$default(buyPremiumPlanUiMapper, billingProduct3, priceForOneMonth, false, 4, null);
            }
            buyPremiumPlanUiParamsArr[2] = buyPremiumPlanUiParams3;
            ImmutableList immutableList = ExtensionsKt.toImmutableList(CollectionsKt.listOfNotNull((Object[]) buyPremiumPlanUiParamsArr));
            UiStateDelegate<BuyPremiumViewModel.UiState, BuyPremiumViewModel.Event> uiStateDelegate3 = this.this$0;
            this.label = 5;
            if (uiStateDelegate3.updateUiState(uiStateDelegate3, new AnonymousClass2(immutableList), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        } else {
            ResultKt.throwOnFailure(obj);
        }
        this.label = 2;
        purchaseProducts = this.this$0.getPurchaseProducts(this);
        if (purchaseProducts == coroutine_suspended) {
            return coroutine_suspended;
        }
        list = (List) purchaseProducts;
        if (list.size() >= 3) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BuyPremiumViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/presentation/features/purchases/premium/viewmodel/BuyPremiumViewModel$UiState;", "state", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.presentation.features.purchases.premium.viewmodel.BuyPremiumViewModel$loadProducts$2$2  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass2 extends Lambda implements Function1<BuyPremiumViewModel.UiState, BuyPremiumViewModel.UiState> {
        final /* synthetic */ ImmutableList<BuyPremiumPlanUiParams> $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(ImmutableList<BuyPremiumPlanUiParams> immutableList) {
            super(1);
            this.$items = immutableList;
        }

        @Override // kotlin.jvm.functions.Function1
        public final BuyPremiumViewModel.UiState invoke(BuyPremiumViewModel.UiState state) {
            Intrinsics.checkNotNullParameter(state, "state");
            return BuyPremiumViewModel.UiState.copy$default(state, null, null, null, this.$items, false, false, null, 119, null);
        }
    }
}
