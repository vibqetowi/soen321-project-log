package com.ifriend.chat.presentation.ui.purchase.neurons;

import android.os.Bundle;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
/* compiled from: BuyNeuronsBottomSheetDialogFragment.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/util/UUID;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class BuyNeuronsBottomSheetDialogFragment$requestId$2 extends Lambda implements Function0<UUID> {
    final /* synthetic */ BuyNeuronsBottomSheetDialogFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyNeuronsBottomSheetDialogFragment$requestId$2(BuyNeuronsBottomSheetDialogFragment buyNeuronsBottomSheetDialogFragment) {
        super(0);
        this.this$0 = buyNeuronsBottomSheetDialogFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final UUID invoke() {
        String string;
        Bundle arguments = this.this$0.getArguments();
        UUID fromString = (arguments == null || (string = arguments.getString("key_request_id")) == null) ? null : UUID.fromString(string);
        if (fromString != null) {
            return fromString;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
