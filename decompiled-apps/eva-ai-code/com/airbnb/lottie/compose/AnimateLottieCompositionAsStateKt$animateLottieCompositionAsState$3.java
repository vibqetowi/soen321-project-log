package com.airbnb.lottie.compose;

import androidx.compose.runtime.MutableState;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.compose.LottieAnimatable;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: animateLottieCompositionAsState.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.airbnb.lottie.compose.AnimateLottieCompositionAsStateKt$animateLottieCompositionAsState$3", f = "animateLottieCompositionAsState.kt", i = {}, l = {73, 78}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
public final class AnimateLottieCompositionAsStateKt$animateLottieCompositionAsState$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ float $actualSpeed;
    final /* synthetic */ LottieAnimatable $animatable;
    final /* synthetic */ LottieCancellationBehavior $cancellationBehavior;
    final /* synthetic */ LottieClipSpec $clipSpec;
    final /* synthetic */ LottieComposition $composition;
    final /* synthetic */ boolean $isPlaying;
    final /* synthetic */ int $iterations;
    final /* synthetic */ boolean $restartOnPlay;
    final /* synthetic */ boolean $reverseOnRepeat;
    final /* synthetic */ boolean $useCompositionFrameRate;
    final /* synthetic */ MutableState<Boolean> $wasPlaying$delegate;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimateLottieCompositionAsStateKt$animateLottieCompositionAsState$3(boolean z, boolean z2, LottieAnimatable lottieAnimatable, LottieComposition lottieComposition, int i, boolean z3, float f, LottieClipSpec lottieClipSpec, LottieCancellationBehavior lottieCancellationBehavior, boolean z4, MutableState<Boolean> mutableState, Continuation<? super AnimateLottieCompositionAsStateKt$animateLottieCompositionAsState$3> continuation) {
        super(2, continuation);
        this.$isPlaying = z;
        this.$restartOnPlay = z2;
        this.$animatable = lottieAnimatable;
        this.$composition = lottieComposition;
        this.$iterations = i;
        this.$reverseOnRepeat = z3;
        this.$actualSpeed = f;
        this.$clipSpec = lottieClipSpec;
        this.$cancellationBehavior = lottieCancellationBehavior;
        this.$useCompositionFrameRate = z4;
        this.$wasPlaying$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AnimateLottieCompositionAsStateKt$animateLottieCompositionAsState$3(this.$isPlaying, this.$restartOnPlay, this.$animatable, this.$composition, this.$iterations, this.$reverseOnRepeat, this.$actualSpeed, this.$clipSpec, this.$cancellationBehavior, this.$useCompositionFrameRate, this.$wasPlaying$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AnimateLottieCompositionAsStateKt$animateLottieCompositionAsState$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean animateLottieCompositionAsState$lambda$3;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.$isPlaying) {
                animateLottieCompositionAsState$lambda$3 = AnimateLottieCompositionAsStateKt.animateLottieCompositionAsState$lambda$3(this.$wasPlaying$delegate);
                if (!animateLottieCompositionAsState$lambda$3 && this.$restartOnPlay) {
                    this.label = 1;
                    if (LottieAnimatableKt.resetToBeginning(this.$animatable, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            }
        } else if (i != 1) {
            if (i == 2) {
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
        }
        AnimateLottieCompositionAsStateKt.animateLottieCompositionAsState$lambda$4(this.$wasPlaying$delegate, this.$isPlaying);
        if (this.$isPlaying) {
            LottieAnimatable lottieAnimatable = this.$animatable;
            this.label = 2;
            if (LottieAnimatable.DefaultImpls.animate$default(lottieAnimatable, this.$composition, 0, this.$iterations, this.$reverseOnRepeat, this.$actualSpeed, this.$clipSpec, lottieAnimatable.getProgress(), false, this.$cancellationBehavior, false, this.$useCompositionFrameRate, this, 514, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }
}
