package androidx.compose.foundation.pager;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.math.MathKt;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PagerState.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PagerState$targetPage$2 extends Lambda implements Function0<Integer> {
    final /* synthetic */ PagerState this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagerState$targetPage$2(PagerState pagerState) {
        super(0);
        this.this$0 = pagerState;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        int animationTargetPage;
        int pageAvailableSpace;
        int roundToInt;
        float positionThresholdFraction;
        int coerceInPageRange;
        if (this.this$0.isScrollInProgress()) {
            animationTargetPage = this.this$0.getAnimationTargetPage();
            if (animationTargetPage != -1) {
                roundToInt = this.this$0.getAnimationTargetPage();
            } else {
                if (this.this$0.getSnapRemainingScrollOffset$foundation_release() == 0.0f) {
                    float abs = Math.abs(this.this$0.getCurrentPageOffsetFraction());
                    positionThresholdFraction = this.this$0.getPositionThresholdFraction();
                    if (abs >= Math.abs(positionThresholdFraction)) {
                        roundToInt = this.this$0.getCurrentPage() + ((int) Math.signum(this.this$0.getCurrentPageOffsetFraction()));
                    } else {
                        roundToInt = this.this$0.getCurrentPage();
                    }
                } else {
                    float snapRemainingScrollOffset$foundation_release = this.this$0.getSnapRemainingScrollOffset$foundation_release();
                    pageAvailableSpace = this.this$0.getPageAvailableSpace();
                    roundToInt = MathKt.roundToInt(snapRemainingScrollOffset$foundation_release / pageAvailableSpace) + this.this$0.getCurrentPage();
                }
            }
        } else {
            roundToInt = this.this$0.getCurrentPage();
        }
        coerceInPageRange = this.this$0.coerceInPageRange(roundToInt);
        return Integer.valueOf(coerceInPageRange);
    }
}
