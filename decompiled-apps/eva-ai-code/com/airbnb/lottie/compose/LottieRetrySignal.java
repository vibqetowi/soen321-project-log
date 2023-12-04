package com.airbnb.lottie.compose;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import com.appsflyer.AppsFlyerProperties;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.channels.ChannelsKt;
/* compiled from: LottieRetrySignal.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0000¢\u0006\u0002\u0010\u0002J\u0011\u0010\u000e\u001a\u00020\u0005H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u000fJ\u0006\u0010\u0010\u001a\u00020\u0005R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R+\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00078F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Lcom/airbnb/lottie/compose/LottieRetrySignal;", "", "()V", AppsFlyerProperties.CHANNEL, "Lkotlinx/coroutines/channels/Channel;", "", "<set-?>", "", "isAwaitingRetry", "()Z", "setAwaitingRetry", "(Z)V", "isAwaitingRetry$delegate", "Landroidx/compose/runtime/MutableState;", "awaitRetry", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "retry", "lottie-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class LottieRetrySignal {
    public static final int $stable = 0;
    private final Channel<Unit> channel = ChannelKt.Channel$default(1, BufferOverflow.DROP_OLDEST, null, 4, null);
    private final MutableState isAwaitingRetry$delegate;

    public LottieRetrySignal() {
        MutableState mutableStateOf$default;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        this.isAwaitingRetry$delegate = mutableStateOf$default;
    }

    private final void setAwaitingRetry(boolean z) {
        this.isAwaitingRetry$delegate.setValue(Boolean.valueOf(z));
    }

    public final boolean isAwaitingRetry() {
        return ((Boolean) this.isAwaitingRetry$delegate.getValue()).booleanValue();
    }

    public final void retry() {
        ChannelsKt.trySendBlocking(this.channel, Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object awaitRetry(Continuation<? super Unit> continuation) {
        LottieRetrySignal$awaitRetry$1 lottieRetrySignal$awaitRetry$1;
        int i;
        LottieRetrySignal lottieRetrySignal;
        if (continuation instanceof LottieRetrySignal$awaitRetry$1) {
            lottieRetrySignal$awaitRetry$1 = (LottieRetrySignal$awaitRetry$1) continuation;
            if ((lottieRetrySignal$awaitRetry$1.label & Integer.MIN_VALUE) != 0) {
                lottieRetrySignal$awaitRetry$1.label -= Integer.MIN_VALUE;
                Object obj = lottieRetrySignal$awaitRetry$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = lottieRetrySignal$awaitRetry$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    try {
                        setAwaitingRetry(true);
                        Channel<Unit> channel = this.channel;
                        lottieRetrySignal$awaitRetry$1.L$0 = this;
                        lottieRetrySignal$awaitRetry$1.label = 1;
                        if (channel.receive(lottieRetrySignal$awaitRetry$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        lottieRetrySignal = this;
                    } catch (Throwable th) {
                        th = th;
                        lottieRetrySignal = this;
                        lottieRetrySignal.setAwaitingRetry(false);
                        throw th;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    lottieRetrySignal = (LottieRetrySignal) lottieRetrySignal$awaitRetry$1.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (Throwable th2) {
                        th = th2;
                        lottieRetrySignal.setAwaitingRetry(false);
                        throw th;
                    }
                }
                lottieRetrySignal.setAwaitingRetry(false);
                return Unit.INSTANCE;
            }
        }
        lottieRetrySignal$awaitRetry$1 = new LottieRetrySignal$awaitRetry$1(this, continuation);
        Object obj2 = lottieRetrySignal$awaitRetry$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = lottieRetrySignal$awaitRetry$1.label;
        if (i != 0) {
        }
        lottieRetrySignal.setAwaitingRetry(false);
        return Unit.INSTANCE;
    }
}
