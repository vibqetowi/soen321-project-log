package com.airbnb.lottie.compose;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
/* compiled from: LottieAnimatable.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
final class LottieAnimatableImpl$frameSpeed$2 extends Lambda implements Function0<Float> {
    final /* synthetic */ LottieAnimatableImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LottieAnimatableImpl$frameSpeed$2(LottieAnimatableImpl lottieAnimatableImpl) {
        super(0);
        this.this$0 = lottieAnimatableImpl;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Float invoke() {
        return Float.valueOf((this.this$0.getReverseOnRepeat() && this.this$0.getIteration() % 2 == 0) ? -this.this$0.getSpeed() : this.this$0.getSpeed());
    }
}
