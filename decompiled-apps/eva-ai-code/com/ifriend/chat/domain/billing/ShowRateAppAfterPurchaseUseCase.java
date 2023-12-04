package com.ifriend.chat.domain.billing;

import com.ifriend.domain.data.purchases.BillingPurchasesHistory;
import com.ifriend.domain.logic.purchase.PurchaseType;
import com.ifriend.domain.rateUs.RateAppShowingPlanner;
import com.ifriend.domain.rateUs.RateUsStateStorage;
import com.ifriend.domain.rateUs.ShowRateUsUseCase;
import com.ifriend.domain.toggle.FeatureToggle;
import com.ifriend.keychain.KeychainModule;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlow;
/* compiled from: ShowRateAppAfterPurchaseUseCase.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0019\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u000fR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"Lcom/ifriend/chat/domain/billing/ShowRateAppAfterPurchaseUseCase;", "", KeychainModule.Maps.STORAGE, "Lcom/ifriend/domain/rateUs/RateUsStateStorage;", "rateAndReviewUsToggle", "Lcom/ifriend/domain/toggle/FeatureToggle;", "rateAppShowingPlanner", "Lcom/ifriend/domain/rateUs/RateAppShowingPlanner;", "billingPurchasesHistory", "Lcom/ifriend/domain/data/purchases/BillingPurchasesHistory;", "(Lcom/ifriend/domain/rateUs/RateUsStateStorage;Lcom/ifriend/domain/toggle/FeatureToggle;Lcom/ifriend/domain/rateUs/RateAppShowingPlanner;Lcom/ifriend/domain/data/purchases/BillingPurchasesHistory;)V", "showIfNeed", "", "purchaseType", "Lcom/ifriend/domain/logic/purchase/PurchaseType;", "(Lcom/ifriend/domain/logic/purchase/PurchaseType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ShowRateAppAfterPurchaseUseCase {
    private final BillingPurchasesHistory billingPurchasesHistory;
    private final FeatureToggle rateAndReviewUsToggle;
    private final RateAppShowingPlanner rateAppShowingPlanner;
    private final RateUsStateStorage storage;

    public ShowRateAppAfterPurchaseUseCase(RateUsStateStorage storage, FeatureToggle rateAndReviewUsToggle, RateAppShowingPlanner rateAppShowingPlanner, BillingPurchasesHistory billingPurchasesHistory) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(rateAndReviewUsToggle, "rateAndReviewUsToggle");
        Intrinsics.checkNotNullParameter(rateAppShowingPlanner, "rateAppShowingPlanner");
        Intrinsics.checkNotNullParameter(billingPurchasesHistory, "billingPurchasesHistory");
        this.storage = storage;
        this.rateAndReviewUsToggle = rateAndReviewUsToggle;
        this.rateAppShowingPlanner = rateAppShowingPlanner;
        this.billingPurchasesHistory = billingPurchasesHistory;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object showIfNeed(PurchaseType purchaseType, Continuation<? super Unit> continuation) {
        ShowRateAppAfterPurchaseUseCase$showIfNeed$1 showRateAppAfterPurchaseUseCase$showIfNeed$1;
        Object obj;
        int i;
        ShowRateAppAfterPurchaseUseCase showRateAppAfterPurchaseUseCase;
        ShowRateAppAfterPurchaseUseCase showRateAppAfterPurchaseUseCase2;
        ShowRateAppAfterPurchaseUseCase showRateAppAfterPurchaseUseCase3;
        if (continuation instanceof ShowRateAppAfterPurchaseUseCase$showIfNeed$1) {
            showRateAppAfterPurchaseUseCase$showIfNeed$1 = (ShowRateAppAfterPurchaseUseCase$showIfNeed$1) continuation;
            if ((showRateAppAfterPurchaseUseCase$showIfNeed$1.label & Integer.MIN_VALUE) != 0) {
                showRateAppAfterPurchaseUseCase$showIfNeed$1.label -= Integer.MIN_VALUE;
                obj = showRateAppAfterPurchaseUseCase$showIfNeed$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = showRateAppAfterPurchaseUseCase$showIfNeed$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (this.storage.getCurrentStep() == ShowRateUsUseCase.Step.INACTIVE) {
                        return Unit.INSTANCE;
                    }
                    FeatureToggle featureToggle = this.rateAndReviewUsToggle;
                    showRateAppAfterPurchaseUseCase$showIfNeed$1.L$0 = this;
                    showRateAppAfterPurchaseUseCase$showIfNeed$1.L$1 = purchaseType;
                    showRateAppAfterPurchaseUseCase$showIfNeed$1.label = 1;
                    obj = featureToggle.isEnabled(showRateAppAfterPurchaseUseCase$showIfNeed$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    showRateAppAfterPurchaseUseCase = this;
                } else if (i != 1) {
                    if (i == 2) {
                        showRateAppAfterPurchaseUseCase3 = (ShowRateAppAfterPurchaseUseCase) showRateAppAfterPurchaseUseCase$showIfNeed$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        if (((Number) obj).intValue() == 1) {
                            showRateAppAfterPurchaseUseCase3.rateAppShowingPlanner.show();
                        }
                        return Unit.INSTANCE;
                    } else if (i == 3) {
                        showRateAppAfterPurchaseUseCase2 = (ShowRateAppAfterPurchaseUseCase) showRateAppAfterPurchaseUseCase$showIfNeed$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        if (((Number) obj).intValue() == 1) {
                            showRateAppAfterPurchaseUseCase2.rateAppShowingPlanner.show();
                        }
                        return Unit.INSTANCE;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    purchaseType = (PurchaseType) showRateAppAfterPurchaseUseCase$showIfNeed$1.L$1;
                    showRateAppAfterPurchaseUseCase = (ShowRateAppAfterPurchaseUseCase) showRateAppAfterPurchaseUseCase$showIfNeed$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                if (((Boolean) ((StateFlow) obj).getValue()).booleanValue()) {
                    return Unit.INSTANCE;
                }
                if (purchaseType == PurchaseType.SUBSCRIPTION) {
                    BillingPurchasesHistory billingPurchasesHistory = showRateAppAfterPurchaseUseCase.billingPurchasesHistory;
                    PurchaseType purchaseType2 = PurchaseType.SUBSCRIPTION;
                    showRateAppAfterPurchaseUseCase$showIfNeed$1.L$0 = showRateAppAfterPurchaseUseCase;
                    showRateAppAfterPurchaseUseCase$showIfNeed$1.L$1 = null;
                    showRateAppAfterPurchaseUseCase$showIfNeed$1.label = 2;
                    obj = billingPurchasesHistory.getPurchasesHistoryCount(purchaseType2, showRateAppAfterPurchaseUseCase$showIfNeed$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    showRateAppAfterPurchaseUseCase3 = showRateAppAfterPurchaseUseCase;
                    if (((Number) obj).intValue() == 1) {
                    }
                    return Unit.INSTANCE;
                }
                BillingPurchasesHistory billingPurchasesHistory2 = showRateAppAfterPurchaseUseCase.billingPurchasesHistory;
                PurchaseType purchaseType3 = PurchaseType.IN_APP;
                showRateAppAfterPurchaseUseCase$showIfNeed$1.L$0 = showRateAppAfterPurchaseUseCase;
                showRateAppAfterPurchaseUseCase$showIfNeed$1.L$1 = null;
                showRateAppAfterPurchaseUseCase$showIfNeed$1.label = 3;
                obj = billingPurchasesHistory2.getPurchasesHistoryCount(purchaseType3, showRateAppAfterPurchaseUseCase$showIfNeed$1);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                showRateAppAfterPurchaseUseCase2 = showRateAppAfterPurchaseUseCase;
                if (((Number) obj).intValue() == 1) {
                }
                return Unit.INSTANCE;
            }
        }
        showRateAppAfterPurchaseUseCase$showIfNeed$1 = new ShowRateAppAfterPurchaseUseCase$showIfNeed$1(this, continuation);
        obj = showRateAppAfterPurchaseUseCase$showIfNeed$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = showRateAppAfterPurchaseUseCase$showIfNeed$1.label;
        if (i != 0) {
        }
        if (((Boolean) ((StateFlow) obj).getValue()).booleanValue()) {
        }
    }
}
