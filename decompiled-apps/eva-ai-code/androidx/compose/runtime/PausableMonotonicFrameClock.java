package androidx.compose.runtime;

import androidx.compose.runtime.MonotonicFrameClock;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: PausableMonotonicFrameClock.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003J\u0006\u0010\t\u001a\u00020\nJ\u0006\u0010\u000b\u001a\u00020\nJ:\u0010\f\u001a\u0002H\r\"\u0004\b\u0000\u0010\r2!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u0002H\r0\u000fH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0014R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Landroidx/compose/runtime/PausableMonotonicFrameClock;", "Landroidx/compose/runtime/MonotonicFrameClock;", "frameClock", "(Landroidx/compose/runtime/MonotonicFrameClock;)V", "isPaused", "", "()Z", "latch", "Landroidx/compose/runtime/Latch;", "pause", "", "resume", "withFrameNanos", "R", "onFrame", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "frameTimeNanos", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PausableMonotonicFrameClock implements MonotonicFrameClock {
    public static final int $stable = 8;
    private final MonotonicFrameClock frameClock;
    private final Latch latch;

    @Override // androidx.compose.runtime.MonotonicFrameClock, kotlin.coroutines.CoroutineContext.Element
    public /* synthetic */ CoroutineContext.Key getKey() {
        return MonotonicFrameClock.CC.$default$getKey(this);
    }

    public PausableMonotonicFrameClock(MonotonicFrameClock frameClock) {
        Intrinsics.checkNotNullParameter(frameClock, "frameClock");
        this.frameClock = frameClock;
        this.latch = new Latch();
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public <R> R fold(R r, Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return (R) MonotonicFrameClock.DefaultImpls.fold(this, r, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public <E extends CoroutineContext.Element> E get(CoroutineContext.Key<E> key) {
        return (E) MonotonicFrameClock.DefaultImpls.get(this, key);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public CoroutineContext minusKey(CoroutineContext.Key<?> key) {
        return MonotonicFrameClock.DefaultImpls.minusKey(this, key);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext plus(CoroutineContext coroutineContext) {
        return MonotonicFrameClock.DefaultImpls.plus(this, coroutineContext);
    }

    public final boolean isPaused() {
        return !this.latch.isOpen();
    }

    public final void pause() {
        this.latch.closeLatch();
    }

    public final void resume() {
        this.latch.openLatch();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0064 A[PHI: r7 
      PHI: (r7v6 java.lang.Object) = (r7v5 java.lang.Object), (r7v1 java.lang.Object) binds: [B:21:0x0061, B:12:0x0029] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    @Override // androidx.compose.runtime.MonotonicFrameClock
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public <R> Object withFrameNanos(Function1<? super Long, ? extends R> function1, Continuation<? super R> continuation) {
        PausableMonotonicFrameClock$withFrameNanos$1 pausableMonotonicFrameClock$withFrameNanos$1;
        int i;
        PausableMonotonicFrameClock pausableMonotonicFrameClock;
        if (continuation instanceof PausableMonotonicFrameClock$withFrameNanos$1) {
            pausableMonotonicFrameClock$withFrameNanos$1 = (PausableMonotonicFrameClock$withFrameNanos$1) continuation;
            if ((pausableMonotonicFrameClock$withFrameNanos$1.label & Integer.MIN_VALUE) != 0) {
                pausableMonotonicFrameClock$withFrameNanos$1.label -= Integer.MIN_VALUE;
                Object obj = pausableMonotonicFrameClock$withFrameNanos$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = pausableMonotonicFrameClock$withFrameNanos$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Latch latch = this.latch;
                    pausableMonotonicFrameClock$withFrameNanos$1.L$0 = this;
                    pausableMonotonicFrameClock$withFrameNanos$1.L$1 = function1;
                    pausableMonotonicFrameClock$withFrameNanos$1.label = 1;
                    if (latch.await(pausableMonotonicFrameClock$withFrameNanos$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    pausableMonotonicFrameClock = this;
                } else if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                } else {
                    function1 = (Function1) pausableMonotonicFrameClock$withFrameNanos$1.L$1;
                    pausableMonotonicFrameClock = (PausableMonotonicFrameClock) pausableMonotonicFrameClock$withFrameNanos$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                MonotonicFrameClock monotonicFrameClock = pausableMonotonicFrameClock.frameClock;
                pausableMonotonicFrameClock$withFrameNanos$1.L$0 = null;
                pausableMonotonicFrameClock$withFrameNanos$1.L$1 = null;
                pausableMonotonicFrameClock$withFrameNanos$1.label = 2;
                obj = monotonicFrameClock.withFrameNanos(function1, pausableMonotonicFrameClock$withFrameNanos$1);
                return obj != coroutine_suspended ? coroutine_suspended : obj;
            }
        }
        pausableMonotonicFrameClock$withFrameNanos$1 = new PausableMonotonicFrameClock$withFrameNanos$1(this, continuation);
        Object obj2 = pausableMonotonicFrameClock$withFrameNanos$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = pausableMonotonicFrameClock$withFrameNanos$1.label;
        if (i != 0) {
        }
        MonotonicFrameClock monotonicFrameClock2 = pausableMonotonicFrameClock.frameClock;
        pausableMonotonicFrameClock$withFrameNanos$1.L$0 = null;
        pausableMonotonicFrameClock$withFrameNanos$1.L$1 = null;
        pausableMonotonicFrameClock$withFrameNanos$1.label = 2;
        obj2 = monotonicFrameClock2.withFrameNanos(function1, pausableMonotonicFrameClock$withFrameNanos$1);
        if (obj2 != coroutine_suspended2) {
        }
    }
}
