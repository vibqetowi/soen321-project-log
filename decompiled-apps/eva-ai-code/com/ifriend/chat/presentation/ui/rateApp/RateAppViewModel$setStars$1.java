package com.ifriend.chat.presentation.ui.rateApp;

import com.ifriend.chat.presentation.ui.rateApp.RateAppState;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: RateAppViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/chat/presentation/ui/rateApp/RateAppState;", "it", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class RateAppViewModel$setStars$1 extends Lambda implements Function1<RateAppState, RateAppState> {
    final /* synthetic */ RateAppState $currentState;
    final /* synthetic */ int $starsAmount;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RateAppViewModel$setStars$1(RateAppState rateAppState, int i) {
        super(1);
        this.$currentState = rateAppState;
        this.$starsAmount = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final RateAppState invoke(RateAppState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return RateAppState.StarsState.copy$default((RateAppState.StarsState) this.$currentState, null, Integer.valueOf(this.$starsAmount), 1, null);
    }
}
