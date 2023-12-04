package com.ifriend.presentation.common.observers.appevents.params;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: AppUiParams.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"toBuyNeurons", "Lcom/ifriend/presentation/common/observers/appevents/params/BuyNeuronsBillingUiParams;", "Lcom/ifriend/presentation/common/observers/appevents/params/BuyChatSubscriptionBillingUiParams;", "goToUpgradeAfterDismiss", "", "presentation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AppUiParamsKt {
    public static /* synthetic */ BuyNeuronsBillingUiParams toBuyNeurons$default(BuyChatSubscriptionBillingUiParams buyChatSubscriptionBillingUiParams, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return toBuyNeurons(buyChatSubscriptionBillingUiParams, z);
    }

    public static final BuyNeuronsBillingUiParams toBuyNeurons(BuyChatSubscriptionBillingUiParams buyChatSubscriptionBillingUiParams, boolean z) {
        Intrinsics.checkNotNullParameter(buyChatSubscriptionBillingUiParams, "<this>");
        return new BuyNeuronsBillingUiParams(z, buyChatSubscriptionBillingUiParams.getPurchaseReason(), buyChatSubscriptionBillingUiParams.getPurchaseSource(), buyChatSubscriptionBillingUiParams.getRequestId());
    }
}
