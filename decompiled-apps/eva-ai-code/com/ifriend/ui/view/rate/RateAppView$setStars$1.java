package com.ifriend.ui.view.rate;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: RateAppView.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", FirebaseAnalytics.Param.INDEX, "", "starView", "Lcom/ifriend/ui/view/rate/RateStarView;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
final class RateAppView$setStars$1 extends Lambda implements Function2<Integer, RateStarView, Unit> {
    final /* synthetic */ int $starsAmount;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RateAppView$setStars$1(int i) {
        super(2);
        this.$starsAmount = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Integer num, RateStarView rateStarView) {
        invoke(num.intValue(), rateStarView);
        return Unit.INSTANCE;
    }

    public final void invoke(int i, RateStarView starView) {
        Intrinsics.checkNotNullParameter(starView, "starView");
        starView.setState(i + 1 <= this.$starsAmount);
    }
}
