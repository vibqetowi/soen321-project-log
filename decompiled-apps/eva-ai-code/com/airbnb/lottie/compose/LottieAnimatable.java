package com.airbnb.lottie.compose;

import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.compose.LottieAnimationState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
/* compiled from: LottieAnimatable.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\bg\u0018\u00002\u00020\u0001J\u0081\u0001\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\n2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\n2\b\b\u0002\u0010\u0014\u001a\u00020\nH¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0015J;\u0010\u0016\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0017\u001a\u00020\f2\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\u0018\u001a\u00020\nH¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0019\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Lcom/airbnb/lottie/compose/LottieAnimatable;", "Lcom/airbnb/lottie/compose/LottieAnimationState;", "animate", "", "composition", "Lcom/airbnb/lottie/LottieComposition;", "iteration", "", "iterations", "reverseOnRepeat", "", "speed", "", "clipSpec", "Lcom/airbnb/lottie/compose/LottieClipSpec;", "initialProgress", "continueFromPreviousAnimate", "cancellationBehavior", "Lcom/airbnb/lottie/compose/LottieCancellationBehavior;", "ignoreSystemAnimationsDisabled", "useCompositionFrameRate", "(Lcom/airbnb/lottie/LottieComposition;IIZFLcom/airbnb/lottie/compose/LottieClipSpec;FZLcom/airbnb/lottie/compose/LottieCancellationBehavior;ZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "snapTo", "progress", "resetLastFrameNanos", "(Lcom/airbnb/lottie/LottieComposition;FIZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lottie-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface LottieAnimatable extends LottieAnimationState {
    Object animate(LottieComposition lottieComposition, int i, int i2, boolean z, float f, LottieClipSpec lottieClipSpec, float f2, boolean z2, LottieCancellationBehavior lottieCancellationBehavior, boolean z3, boolean z4, Continuation<? super Unit> continuation);

    Object snapTo(LottieComposition lottieComposition, float f, int i, boolean z, Continuation<? super Unit> continuation);

    /* compiled from: LottieAnimatable.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class DefaultImpls {
        public static long getLastFrameNanos(LottieAnimatable lottieAnimatable) {
            return LottieAnimationState.DefaultImpls.getLastFrameNanos(lottieAnimatable);
        }

        public static /* synthetic */ Object snapTo$default(LottieAnimatable lottieAnimatable, LottieComposition lottieComposition, float f, int i, boolean z, Continuation continuation, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 1) != 0) {
                    lottieComposition = lottieAnimatable.getComposition();
                }
                LottieComposition lottieComposition2 = lottieComposition;
                if ((i2 & 2) != 0) {
                    f = lottieAnimatable.getProgress();
                }
                float f2 = f;
                if ((i2 & 4) != 0) {
                    i = lottieAnimatable.getIteration();
                }
                int i3 = i;
                if ((i2 & 8) != 0) {
                    z = !(f2 == lottieAnimatable.getProgress());
                }
                return lottieAnimatable.snapTo(lottieComposition2, f2, i3, z, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: snapTo");
        }

        public static /* synthetic */ Object animate$default(LottieAnimatable lottieAnimatable, LottieComposition lottieComposition, int i, int i2, boolean z, float f, LottieClipSpec lottieClipSpec, float f2, boolean z2, LottieCancellationBehavior lottieCancellationBehavior, boolean z3, boolean z4, Continuation continuation, int i3, Object obj) {
            if (obj == null) {
                int iteration = (i3 & 2) != 0 ? lottieAnimatable.getIteration() : i;
                int iterations = (i3 & 4) != 0 ? lottieAnimatable.getIterations() : i2;
                boolean reverseOnRepeat = (i3 & 8) != 0 ? lottieAnimatable.getReverseOnRepeat() : z;
                float speed = (i3 & 16) != 0 ? lottieAnimatable.getSpeed() : f;
                LottieClipSpec clipSpec = (i3 & 32) != 0 ? lottieAnimatable.getClipSpec() : lottieClipSpec;
                return lottieAnimatable.animate(lottieComposition, iteration, iterations, reverseOnRepeat, speed, clipSpec, (i3 & 64) != 0 ? LottieAnimatableKt.access$defaultProgress(lottieComposition, clipSpec, speed) : f2, (i3 & 128) != 0 ? false : z2, (i3 & 256) != 0 ? LottieCancellationBehavior.Immediately : lottieCancellationBehavior, (i3 & 512) != 0 ? false : z3, (i3 & 1024) != 0 ? false : z4, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animate");
        }
    }
}
