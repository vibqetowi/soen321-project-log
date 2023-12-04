package com.airbnb.lottie.compose;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import com.airbnb.lottie.LottieComposition;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
/* compiled from: LottieCompositionResult.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0011\u0010 \u001a\u00020\u0005H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010!J\u0015\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0005H\u0000¢\u0006\u0002\b%J\u0015\u0010&\u001a\u00020#2\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0002\b'R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R/\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00078V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001b\u0010\u000f\u001a\u00020\u00108VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u000f\u0010\u0011R\u001b\u0010\u0014\u001a\u00020\u00108VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0014\u0010\u0011R\u001b\u0010\u0016\u001a\u00020\u00108VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0016\u0010\u0011R\u001b\u0010\u0018\u001a\u00020\u00108VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0013\u001a\u0004\b\u0018\u0010\u0011R/\u0010\u001a\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00058V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u001f\u0010\u000e\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006("}, d2 = {"Lcom/airbnb/lottie/compose/LottieCompositionResultImpl;", "Lcom/airbnb/lottie/compose/LottieCompositionResult;", "()V", "compositionDeferred", "Lkotlinx/coroutines/CompletableDeferred;", "Lcom/airbnb/lottie/LottieComposition;", "<set-?>", "", "error", "getError", "()Ljava/lang/Throwable;", "setError", "(Ljava/lang/Throwable;)V", "error$delegate", "Landroidx/compose/runtime/MutableState;", "isComplete", "", "()Z", "isComplete$delegate", "Landroidx/compose/runtime/State;", "isFailure", "isFailure$delegate", "isLoading", "isLoading$delegate", "isSuccess", "isSuccess$delegate", "value", "getValue", "()Lcom/airbnb/lottie/LottieComposition;", "setValue", "(Lcom/airbnb/lottie/LottieComposition;)V", "value$delegate", "await", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "complete", "", "composition", "complete$lottie_compose_release", "completeExceptionally", "completeExceptionally$lottie_compose_release", "lottie-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class LottieCompositionResultImpl implements LottieCompositionResult {
    private final CompletableDeferred<LottieComposition> compositionDeferred = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
    private final MutableState error$delegate;
    private final State isComplete$delegate;
    private final State isFailure$delegate;
    private final State isLoading$delegate;
    private final State isSuccess$delegate;
    private final MutableState value$delegate;

    public LottieCompositionResultImpl() {
        MutableState mutableStateOf$default;
        MutableState mutableStateOf$default2;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.value$delegate = mutableStateOf$default;
        mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.error$delegate = mutableStateOf$default2;
        this.isLoading$delegate = SnapshotStateKt.derivedStateOf(new LottieCompositionResultImpl$isLoading$2(this));
        this.isComplete$delegate = SnapshotStateKt.derivedStateOf(new LottieCompositionResultImpl$isComplete$2(this));
        this.isFailure$delegate = SnapshotStateKt.derivedStateOf(new LottieCompositionResultImpl$isFailure$2(this));
        this.isSuccess$delegate = SnapshotStateKt.derivedStateOf(new LottieCompositionResultImpl$isSuccess$2(this));
    }

    private void setValue(LottieComposition lottieComposition) {
        this.value$delegate.setValue(lottieComposition);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.airbnb.lottie.compose.LottieCompositionResult, androidx.compose.runtime.State
    public LottieComposition getValue() {
        return (LottieComposition) this.value$delegate.getValue();
    }

    private void setError(Throwable th) {
        this.error$delegate.setValue(th);
    }

    @Override // com.airbnb.lottie.compose.LottieCompositionResult
    public Throwable getError() {
        return (Throwable) this.error$delegate.getValue();
    }

    @Override // com.airbnb.lottie.compose.LottieCompositionResult
    public boolean isLoading() {
        return ((Boolean) this.isLoading$delegate.getValue()).booleanValue();
    }

    @Override // com.airbnb.lottie.compose.LottieCompositionResult
    public boolean isComplete() {
        return ((Boolean) this.isComplete$delegate.getValue()).booleanValue();
    }

    @Override // com.airbnb.lottie.compose.LottieCompositionResult
    public boolean isFailure() {
        return ((Boolean) this.isFailure$delegate.getValue()).booleanValue();
    }

    @Override // com.airbnb.lottie.compose.LottieCompositionResult
    public boolean isSuccess() {
        return ((Boolean) this.isSuccess$delegate.getValue()).booleanValue();
    }

    @Override // com.airbnb.lottie.compose.LottieCompositionResult
    public Object await(Continuation<? super LottieComposition> continuation) {
        return this.compositionDeferred.await(continuation);
    }

    public final synchronized void complete$lottie_compose_release(LottieComposition composition) {
        Intrinsics.checkNotNullParameter(composition, "composition");
        if (isComplete()) {
            return;
        }
        setValue(composition);
        this.compositionDeferred.complete(composition);
    }

    public final synchronized void completeExceptionally$lottie_compose_release(Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        if (isComplete()) {
            return;
        }
        setError(error);
        this.compositionDeferred.completeExceptionally(error);
    }
}
