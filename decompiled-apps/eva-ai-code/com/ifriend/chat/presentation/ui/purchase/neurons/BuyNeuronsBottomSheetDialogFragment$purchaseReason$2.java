package com.ifriend.chat.presentation.ui.purchase.neurons;

import android.os.Build;
import android.os.Bundle;
import com.ifriend.presentation.features.chat.common.models.MessageIdsParams;
import com.ifriend.presentation.features.purchases.billing.models.PurchaseReason;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
/* compiled from: BuyNeuronsBottomSheetDialogFragment.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ifriend/presentation/features/purchases/billing/models/PurchaseReason;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class BuyNeuronsBottomSheetDialogFragment$purchaseReason$2 extends Lambda implements Function0<PurchaseReason> {
    final /* synthetic */ BuyNeuronsBottomSheetDialogFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyNeuronsBottomSheetDialogFragment$purchaseReason$2(BuyNeuronsBottomSheetDialogFragment buyNeuronsBottomSheetDialogFragment) {
        super(0);
        this.this$0 = buyNeuronsBottomSheetDialogFragment;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final PurchaseReason invoke() {
        String string;
        Object obj;
        Bundle arguments = this.this$0.getArguments();
        if (arguments != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                obj = arguments.getSerializable("key_messages_id", MessageIdsParams.class);
            } else {
                Object serializable = arguments.getSerializable("key_messages_id");
                if (!(serializable instanceof MessageIdsParams)) {
                    serializable = null;
                }
                obj = (Serializable) ((MessageIdsParams) serializable);
            }
            MessageIdsParams messageIdsParams = (MessageIdsParams) obj;
            if (messageIdsParams != null) {
                return new PurchaseReason.BuyMessage(messageIdsParams);
            }
        }
        Bundle arguments2 = this.this$0.getArguments();
        if (arguments2 != null && (string = arguments2.getString("key_avatar_description")) != null) {
            return new PurchaseReason.GenerateAvatar(string);
        }
        return PurchaseReason.Purchase.INSTANCE;
    }
}
