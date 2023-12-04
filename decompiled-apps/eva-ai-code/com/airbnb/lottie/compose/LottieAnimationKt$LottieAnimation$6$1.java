package com.airbnb.lottie.compose;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LottieAnimation.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class LottieAnimationKt$LottieAnimation$6$1 extends Lambda implements Function0<Float> {
    final /* synthetic */ LottieAnimationState $progress$delegate;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LottieAnimationKt$LottieAnimation$6$1(LottieAnimationState lottieAnimationState) {
        super(0);
        this.$progress$delegate = lottieAnimationState;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Float invoke() {
        float LottieAnimation$lambda$6;
        LottieAnimation$lambda$6 = LottieAnimationKt.LottieAnimation$lambda$6(this.$progress$delegate);
        return Float.valueOf(LottieAnimation$lambda$6);
    }
}
