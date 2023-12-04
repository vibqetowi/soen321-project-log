package com.ifriend.chat.presentation.ui.purchase.premium;

import android.os.Bundle;
import com.ifriend.analytics.usecase.purchase.PurchaseSource;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
/* compiled from: BuyPremiumFragment.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ifriend/analytics/usecase/purchase/PurchaseSource;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class BuyPremiumFragment$source$2 extends Lambda implements Function0<PurchaseSource> {
    final /* synthetic */ BuyPremiumFragment this$0;

    /* compiled from: BuyPremiumFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public /* synthetic */ class EntriesMappings {
        public static final /* synthetic */ EnumEntries<PurchaseSource> entries$0 = EnumEntriesKt.enumEntries(PurchaseSource.values());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyPremiumFragment$source$2(BuyPremiumFragment buyPremiumFragment) {
        super(0);
        this.this$0 = buyPremiumFragment;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final PurchaseSource invoke() {
        Bundle arguments = this.this$0.getArguments();
        if (arguments != null) {
            PurchaseSource purchaseSource = (PurchaseSource) ArraysKt.getOrNull((PurchaseSource[]) EntriesMappings.entries$0.toArray(new PurchaseSource[0]), arguments.getInt("key_source", -1));
            if (purchaseSource != null) {
                return purchaseSource;
            }
        }
        return PurchaseSource.UNKNOWN;
    }
}
