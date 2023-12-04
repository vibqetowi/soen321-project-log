package com.airbnb.lottie.compose;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LottieAnimatable.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class LottieAnimatableImpl$isAtEnd$2 extends Lambda implements Function0<Boolean> {
    final /* synthetic */ LottieAnimatableImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LottieAnimatableImpl$isAtEnd$2(LottieAnimatableImpl lottieAnimatableImpl) {
        super(0);
        this.this$0 = lottieAnimatableImpl;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        float endProgress;
        boolean z = false;
        if (this.this$0.getIteration() == this.this$0.getIterations()) {
            float progress = this.this$0.getProgress();
            endProgress = this.this$0.getEndProgress();
            if (progress == endProgress) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }
}
