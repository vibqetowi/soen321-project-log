package com.ifriend.chat.presentation.ui.purchase.premium;

import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
/* compiled from: BuyPremiumFragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class BuyPremiumFragment$goToNeurons$2 extends Lambda implements Function0<Boolean> {
    final /* synthetic */ BuyPremiumFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyPremiumFragment$goToNeurons$2(BuyPremiumFragment buyPremiumFragment) {
        super(0);
        this.this$0 = buyPremiumFragment;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        Bundle arguments = this.this$0.getArguments();
        return Boolean.valueOf(arguments != null ? arguments.getBoolean("go_to_neurons") : false);
    }
}
