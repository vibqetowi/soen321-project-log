package com.airbnb.lottie.compose;

import androidx.compose.animation.core.InfiniteAnimationPolicyKt;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.runtime.MonotonicFrameClockKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import com.airbnb.lottie.LottieComposition;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.ranges.RangesKt;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LottieAnimatable.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002Jm\u0010P\u001a\u00020Q2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010%\u001a\u00020$2\u0006\u0010+\u001a\u00020$2\u0006\u0010A\u001a\u00020\u001d2\u0006\u0010E\u001a\u00020\u00142\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010R\u001a\u00020\u00142\u0006\u0010S\u001a\u00020\u001d2\u0006\u0010T\u001a\u00020U2\u0006\u0010V\u001a\u00020\u001d2\u0006\u0010I\u001a\u00020\u001dH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010WJ\u0019\u0010X\u001a\u00020\u001d2\u0006\u0010+\u001a\u00020$H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010YJ\u0018\u0010Z\u001a\u00020\u001d2\u0006\u0010+\u001a\u00020$2\u0006\u0010[\u001a\u00020/H\u0002J3\u0010\\\u001a\u00020Q2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u00108\u001a\u00020\u00142\u0006\u0010%\u001a\u00020$2\u0006\u0010]\u001a\u00020\u001dH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010^J\u0010\u0010_\u001a\u00020Q2\u0006\u00108\u001a\u00020\u0014H\u0002J\u0016\u0010`\u001a\u00020\u0014*\u00020\u00142\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002R/\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00048V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR/\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\f8V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\u000b\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u0019\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001a\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u001d8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0018\u001a\u0004\b\u001c\u0010\u001eR+\u0010 \u001a\u00020\u001d2\u0006\u0010\u0003\u001a\u00020\u001d8V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b#\u0010\u000b\u001a\u0004\b \u0010\u001e\"\u0004\b!\u0010\"R+\u0010%\u001a\u00020$2\u0006\u0010\u0003\u001a\u00020$8V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b*\u0010\u000b\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R+\u0010+\u001a\u00020$2\u0006\u0010\u0003\u001a\u00020$8V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b.\u0010\u000b\u001a\u0004\b,\u0010'\"\u0004\b-\u0010)R+\u00100\u001a\u00020/2\u0006\u0010\u0003\u001a\u00020/8V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b5\u0010\u000b\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u000e\u00106\u001a\u000207X\u0082\u0004¢\u0006\u0002\n\u0000R+\u00108\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00148V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b<\u0010\u000b\u001a\u0004\b9\u0010\u0016\"\u0004\b:\u0010;R+\u0010=\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00148B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b@\u0010\u000b\u001a\u0004\b>\u0010\u0016\"\u0004\b?\u0010;R+\u0010A\u001a\u00020\u001d2\u0006\u0010\u0003\u001a\u00020\u001d8V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\bD\u0010\u000b\u001a\u0004\bB\u0010\u001e\"\u0004\bC\u0010\"R+\u0010E\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00148V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\bH\u0010\u000b\u001a\u0004\bF\u0010\u0016\"\u0004\bG\u0010;R+\u0010I\u001a\u00020\u001d2\u0006\u0010\u0003\u001a\u00020\u001d8V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\bL\u0010\u000b\u001a\u0004\bJ\u0010\u001e\"\u0004\bK\u0010\"R\u0014\u0010M\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bN\u0010O\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006a"}, d2 = {"Lcom/airbnb/lottie/compose/LottieAnimatableImpl;", "Lcom/airbnb/lottie/compose/LottieAnimatable;", "()V", "<set-?>", "Lcom/airbnb/lottie/compose/LottieClipSpec;", "clipSpec", "getClipSpec", "()Lcom/airbnb/lottie/compose/LottieClipSpec;", "setClipSpec", "(Lcom/airbnb/lottie/compose/LottieClipSpec;)V", "clipSpec$delegate", "Landroidx/compose/runtime/MutableState;", "Lcom/airbnb/lottie/LottieComposition;", "composition", "getComposition", "()Lcom/airbnb/lottie/LottieComposition;", "setComposition", "(Lcom/airbnb/lottie/LottieComposition;)V", "composition$delegate", "endProgress", "", "getEndProgress", "()F", "endProgress$delegate", "Landroidx/compose/runtime/State;", "frameSpeed", "getFrameSpeed", "frameSpeed$delegate", "isAtEnd", "", "()Z", "isAtEnd$delegate", "isPlaying", "setPlaying", "(Z)V", "isPlaying$delegate", "", "iteration", "getIteration", "()I", "setIteration", "(I)V", "iteration$delegate", "iterations", "getIterations", "setIterations", "iterations$delegate", "", "lastFrameNanos", "getLastFrameNanos", "()J", "setLastFrameNanos", "(J)V", "lastFrameNanos$delegate", "mutex", "Landroidx/compose/foundation/MutatorMutex;", "progress", "getProgress", "setProgress", "(F)V", "progress$delegate", "progressRaw", "getProgressRaw", "setProgressRaw", "progressRaw$delegate", "reverseOnRepeat", "getReverseOnRepeat", "setReverseOnRepeat", "reverseOnRepeat$delegate", "speed", "getSpeed", "setSpeed", "speed$delegate", "useCompositionFrameRate", "getUseCompositionFrameRate", "setUseCompositionFrameRate", "useCompositionFrameRate$delegate", "value", "getValue", "()Ljava/lang/Float;", "animate", "", "initialProgress", "continueFromPreviousAnimate", "cancellationBehavior", "Lcom/airbnb/lottie/compose/LottieCancellationBehavior;", "ignoreSystemAnimationsDisabled", "(Lcom/airbnb/lottie/LottieComposition;IIZFLcom/airbnb/lottie/compose/LottieClipSpec;FZLcom/airbnb/lottie/compose/LottieCancellationBehavior;ZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "doFrame", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onFrame", "frameNanos", "snapTo", "resetLastFrameNanos", "(Lcom/airbnb/lottie/LottieComposition;FIZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateProgress", "roundToCompositionFrameRate", "lottie-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class LottieAnimatableImpl implements LottieAnimatable {
    private final MutableState clipSpec$delegate;
    private final MutableState composition$delegate;
    private final State endProgress$delegate;
    private final State frameSpeed$delegate;
    private final State isAtEnd$delegate;
    private final MutableState isPlaying$delegate;
    private final MutableState iteration$delegate;
    private final MutableState iterations$delegate;
    private final MutableState lastFrameNanos$delegate;
    private final MutatorMutex mutex;
    private final MutableState progress$delegate;
    private final MutableState progressRaw$delegate;
    private final MutableState reverseOnRepeat$delegate;
    private final MutableState speed$delegate;
    private final MutableState useCompositionFrameRate$delegate;

    public LottieAnimatableImpl() {
        MutableState mutableStateOf$default;
        MutableState mutableStateOf$default2;
        MutableState mutableStateOf$default3;
        MutableState mutableStateOf$default4;
        MutableState mutableStateOf$default5;
        MutableState mutableStateOf$default6;
        MutableState mutableStateOf$default7;
        MutableState mutableStateOf$default8;
        MutableState mutableStateOf$default9;
        MutableState mutableStateOf$default10;
        MutableState mutableStateOf$default11;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        this.isPlaying$delegate = mutableStateOf$default;
        mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(1, null, 2, null);
        this.iteration$delegate = mutableStateOf$default2;
        mutableStateOf$default3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(1, null, 2, null);
        this.iterations$delegate = mutableStateOf$default3;
        mutableStateOf$default4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        this.reverseOnRepeat$delegate = mutableStateOf$default4;
        mutableStateOf$default5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.clipSpec$delegate = mutableStateOf$default5;
        mutableStateOf$default6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(1.0f), null, 2, null);
        this.speed$delegate = mutableStateOf$default6;
        mutableStateOf$default7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        this.useCompositionFrameRate$delegate = mutableStateOf$default7;
        this.frameSpeed$delegate = SnapshotStateKt.derivedStateOf(new LottieAnimatableImpl$frameSpeed$2(this));
        mutableStateOf$default8 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.composition$delegate = mutableStateOf$default8;
        Float valueOf = Float.valueOf(0.0f);
        mutableStateOf$default9 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(valueOf, null, 2, null);
        this.progressRaw$delegate = mutableStateOf$default9;
        mutableStateOf$default10 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(valueOf, null, 2, null);
        this.progress$delegate = mutableStateOf$default10;
        mutableStateOf$default11 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Long.MIN_VALUE, null, 2, null);
        this.lastFrameNanos$delegate = mutableStateOf$default11;
        this.endProgress$delegate = SnapshotStateKt.derivedStateOf(new LottieAnimatableImpl$endProgress$2(this));
        this.isAtEnd$delegate = SnapshotStateKt.derivedStateOf(new LottieAnimatableImpl$isAtEnd$2(this));
        this.mutex = new MutatorMutex();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaying(boolean z) {
        this.isPlaying$delegate.setValue(Boolean.valueOf(z));
    }

    @Override // com.airbnb.lottie.compose.LottieAnimationState
    public boolean isPlaying() {
        return ((Boolean) this.isPlaying$delegate.getValue()).booleanValue();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.runtime.State
    public Float getValue() {
        return Float.valueOf(getProgress());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIteration(int i) {
        this.iteration$delegate.setValue(Integer.valueOf(i));
    }

    @Override // com.airbnb.lottie.compose.LottieAnimationState
    public int getIteration() {
        return ((Number) this.iteration$delegate.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIterations(int i) {
        this.iterations$delegate.setValue(Integer.valueOf(i));
    }

    @Override // com.airbnb.lottie.compose.LottieAnimationState
    public int getIterations() {
        return ((Number) this.iterations$delegate.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReverseOnRepeat(boolean z) {
        this.reverseOnRepeat$delegate.setValue(Boolean.valueOf(z));
    }

    @Override // com.airbnb.lottie.compose.LottieAnimationState
    public boolean getReverseOnRepeat() {
        return ((Boolean) this.reverseOnRepeat$delegate.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClipSpec(LottieClipSpec lottieClipSpec) {
        this.clipSpec$delegate.setValue(lottieClipSpec);
    }

    @Override // com.airbnb.lottie.compose.LottieAnimationState
    public LottieClipSpec getClipSpec() {
        return (LottieClipSpec) this.clipSpec$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSpeed(float f) {
        this.speed$delegate.setValue(Float.valueOf(f));
    }

    @Override // com.airbnb.lottie.compose.LottieAnimationState
    public float getSpeed() {
        return ((Number) this.speed$delegate.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUseCompositionFrameRate(boolean z) {
        this.useCompositionFrameRate$delegate.setValue(Boolean.valueOf(z));
    }

    @Override // com.airbnb.lottie.compose.LottieAnimationState
    public boolean getUseCompositionFrameRate() {
        return ((Boolean) this.useCompositionFrameRate$delegate.getValue()).booleanValue();
    }

    private final float getFrameSpeed() {
        return ((Number) this.frameSpeed$delegate.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setComposition(LottieComposition lottieComposition) {
        this.composition$delegate.setValue(lottieComposition);
    }

    @Override // com.airbnb.lottie.compose.LottieAnimationState
    public LottieComposition getComposition() {
        return (LottieComposition) this.composition$delegate.getValue();
    }

    private final float getProgressRaw() {
        return ((Number) this.progressRaw$delegate.getValue()).floatValue();
    }

    private final void setProgressRaw(float f) {
        this.progressRaw$delegate.setValue(Float.valueOf(f));
    }

    private void setProgress(float f) {
        this.progress$delegate.setValue(Float.valueOf(f));
    }

    @Override // com.airbnb.lottie.compose.LottieAnimationState
    public float getProgress() {
        return ((Number) this.progress$delegate.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLastFrameNanos(long j) {
        this.lastFrameNanos$delegate.setValue(Long.valueOf(j));
    }

    @Override // com.airbnb.lottie.compose.LottieAnimationState
    public long getLastFrameNanos() {
        return ((Number) this.lastFrameNanos$delegate.getValue()).longValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float getEndProgress() {
        return ((Number) this.endProgress$delegate.getValue()).floatValue();
    }

    @Override // com.airbnb.lottie.compose.LottieAnimationState
    public boolean isAtEnd() {
        return ((Boolean) this.isAtEnd$delegate.getValue()).booleanValue();
    }

    @Override // com.airbnb.lottie.compose.LottieAnimatable
    public Object snapTo(LottieComposition lottieComposition, float f, int i, boolean z, Continuation<? super Unit> continuation) {
        Object mutate$default = MutatorMutex.mutate$default(this.mutex, null, new LottieAnimatableImpl$snapTo$2(this, lottieComposition, f, i, z, null), continuation, 1, null);
        return mutate$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? mutate$default : Unit.INSTANCE;
    }

    @Override // com.airbnb.lottie.compose.LottieAnimatable
    public Object animate(LottieComposition lottieComposition, int i, int i2, boolean z, float f, LottieClipSpec lottieClipSpec, float f2, boolean z2, LottieCancellationBehavior lottieCancellationBehavior, boolean z3, boolean z4, Continuation<? super Unit> continuation) {
        Object mutate$default = MutatorMutex.mutate$default(this.mutex, null, new LottieAnimatableImpl$animate$2(this, i, i2, z, f, lottieClipSpec, lottieComposition, f2, z4, z2, lottieCancellationBehavior, null), continuation, 1, null);
        return mutate$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? mutate$default : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object doFrame(int i, Continuation<? super Boolean> continuation) {
        if (i == Integer.MAX_VALUE) {
            return InfiniteAnimationPolicyKt.withInfiniteAnimationFrameNanos(new LottieAnimatableImpl$doFrame$2(this, i), continuation);
        }
        return MonotonicFrameClockKt.withFrameNanos(new LottieAnimatableImpl$doFrame$3(this, i), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean onFrame(int i, long j) {
        LottieComposition composition = getComposition();
        if (composition == null) {
            return true;
        }
        long lastFrameNanos = getLastFrameNanos() == Long.MIN_VALUE ? 0L : j - getLastFrameNanos();
        setLastFrameNanos(j);
        LottieClipSpec clipSpec = getClipSpec();
        float minProgress$lottie_compose_release = clipSpec != null ? clipSpec.getMinProgress$lottie_compose_release(composition) : 0.0f;
        LottieClipSpec clipSpec2 = getClipSpec();
        float maxProgress$lottie_compose_release = clipSpec2 != null ? clipSpec2.getMaxProgress$lottie_compose_release(composition) : 1.0f;
        float duration = (((float) (lastFrameNanos / 1000000)) / composition.getDuration()) * getFrameSpeed();
        float progressRaw = getFrameSpeed() < 0.0f ? minProgress$lottie_compose_release - (getProgressRaw() + duration) : (getProgressRaw() + duration) - maxProgress$lottie_compose_release;
        if (progressRaw < 0.0f) {
            updateProgress(RangesKt.coerceIn(getProgressRaw(), minProgress$lottie_compose_release, maxProgress$lottie_compose_release) + duration);
        } else {
            float f = maxProgress$lottie_compose_release - minProgress$lottie_compose_release;
            int i2 = ((int) (progressRaw / f)) + 1;
            if (getIteration() + i2 > i) {
                updateProgress(getEndProgress());
                setIteration(i);
                return false;
            }
            setIteration(getIteration() + i2);
            float f2 = progressRaw - ((i2 - 1) * f);
            updateProgress(getFrameSpeed() < 0.0f ? maxProgress$lottie_compose_release - f2 : minProgress$lottie_compose_release + f2);
        }
        return true;
    }

    private final float roundToCompositionFrameRate(float f, LottieComposition lottieComposition) {
        if (lottieComposition == null) {
            return f;
        }
        return f - (f % (1 / lottieComposition.getFrameRate()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateProgress(float f) {
        setProgressRaw(f);
        if (getUseCompositionFrameRate()) {
            f = roundToCompositionFrameRate(f, getComposition());
        }
        setProgress(f);
    }
}
