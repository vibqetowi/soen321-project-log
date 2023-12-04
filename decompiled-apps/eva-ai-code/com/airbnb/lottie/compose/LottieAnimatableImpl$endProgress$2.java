package com.airbnb.lottie.compose;

import com.airbnb.lottie.LottieComposition;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
/* compiled from: LottieAnimatable.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
final class LottieAnimatableImpl$endProgress$2 extends Lambda implements Function0<Float> {
    final /* synthetic */ LottieAnimatableImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LottieAnimatableImpl$endProgress$2(LottieAnimatableImpl lottieAnimatableImpl) {
        super(0);
        this.this$0 = lottieAnimatableImpl;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Float invoke() {
        LottieComposition composition = this.this$0.getComposition();
        float f = 0.0f;
        if (composition != null) {
            if (this.this$0.getSpeed() < 0.0f) {
                LottieClipSpec clipSpec = this.this$0.getClipSpec();
                if (clipSpec != null) {
                    f = clipSpec.getMinProgress$lottie_compose_release(composition);
                }
            } else {
                LottieClipSpec clipSpec2 = this.this$0.getClipSpec();
                f = clipSpec2 != null ? clipSpec2.getMaxProgress$lottie_compose_release(composition) : 1.0f;
            }
        }
        return Float.valueOf(f);
    }
}
