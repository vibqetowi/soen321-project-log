package com.ifriend.presentation.features.purchases.premium.screen;

import com.ifriend.presentation.features.purchases.premium.model.BuyPremiumPlanUiParams;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
/* compiled from: remember.kt */
@Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0005\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"<anonymous>", "R", "invoke", "()Ljava/lang/Object;", "com/ifriend/ui/utils/composables/RememberKt$rememberAction$1$1"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class BuyPremiumScreenKt$BuyPremiumPlansScreen$1$1$1$2$invoke$lambda$1$$inlined$rememberAction$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ BuyPremiumClicks $clicks$inlined;
    final /* synthetic */ BuyPremiumPlanUiParams $item$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyPremiumScreenKt$BuyPremiumPlansScreen$1$1$1$2$invoke$lambda$1$$inlined$rememberAction$1(BuyPremiumClicks buyPremiumClicks, BuyPremiumPlanUiParams buyPremiumPlanUiParams) {
        super(0);
        this.$clicks$inlined = buyPremiumClicks;
        this.$item$inlined = buyPremiumPlanUiParams;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.$clicks$inlined.getOnItemClick().invoke(this.$item$inlined);
        return Unit.INSTANCE;
    }
}
