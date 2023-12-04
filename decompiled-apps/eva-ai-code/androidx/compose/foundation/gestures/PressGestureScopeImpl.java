package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;
import com.ifriend.keychain.KeychainModule;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TapGestureDetector.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0002\u0010\u0004J\u0011\u0010\u000f\u001a\u00020\u0010H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0011J\u0006\u0010\u0012\u001a\u00020\u0010J\u0006\u0010\u0013\u001a\u00020\u0010J\u0011\u0010\u0014\u001a\u00020\u0010H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0011J\u0011\u0010\u0015\u001a\u00020\u000bH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0011J\u001a\u0010\u0016\u001a\u00020\u0017*\u00020\u0018H\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u0016\u001a\u00020\u0017*\u00020\u001bH\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u001e\u001a\u00020\u0018*\u00020\u001bH\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010\u001e\u001a\u00020\u0018*\u00020\u0005H\u0097\u0001ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J\u001d\u0010\u001e\u001a\u00020\u0018*\u00020\u0017H\u0097\u0001ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b!\u0010#J\u001a\u0010$\u001a\u00020%*\u00020&H\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b'\u0010(J\u001a\u0010)\u001a\u00020\u0005*\u00020\u0018H\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b*\u0010\"J\u001a\u0010)\u001a\u00020\u0005*\u00020\u001bH\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b+\u0010 J\r\u0010,\u001a\u00020-*\u00020.H\u0097\u0001J\u001a\u0010/\u001a\u00020&*\u00020%H\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b0\u0010(J\u001a\u00101\u001a\u00020\u001b*\u00020\u0018H\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b2\u00103J\u001d\u00101\u001a\u00020\u001b*\u00020\u0005H\u0097\u0001ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b4\u00103J\u001d\u00101\u001a\u00020\u001b*\u00020\u0017H\u0097\u0001ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b4\u00105R\u0014\u0010\u0003\u001a\u00020\u00058\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00066"}, d2 = {"Landroidx/compose/foundation/gestures/PressGestureScopeImpl;", "Landroidx/compose/foundation/gestures/PressGestureScope;", "Landroidx/compose/ui/unit/Density;", "density", "(Landroidx/compose/ui/unit/Density;)V", "", "getDensity", "()F", "fontScale", "getFontScale", "isCanceled", "", "isReleased", "mutex", "Lkotlinx/coroutines/sync/Mutex;", "awaitRelease", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", KeychainModule.AuthPromptOptions.CANCEL, "release", "reset", "tryAwaitRelease", "roundToPx", "", "Landroidx/compose/ui/unit/Dp;", "roundToPx-0680j_4", "(F)I", "Landroidx/compose/ui/unit/TextUnit;", "roundToPx--R2X_6o", "(J)I", "toDp", "toDp-GaN1DYA", "(J)F", "toDp-u2uoSUM", "(F)F", "(I)F", "toDpSize", "Landroidx/compose/ui/unit/DpSize;", "Landroidx/compose/ui/geometry/Size;", "toDpSize-k-rfVVM", "(J)J", "toPx", "toPx-0680j_4", "toPx--R2X_6o", "toRect", "Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/unit/DpRect;", "toSize", "toSize-XkaWNTQ", "toSp", "toSp-0xMU5do", "(F)J", "toSp-kPz2Gy4", "(I)J", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PressGestureScopeImpl implements PressGestureScope, Density {
    private final /* synthetic */ Density $$delegate_0;
    private boolean isCanceled;
    private boolean isReleased;
    private final Mutex mutex;

    @Override // androidx.compose.ui.unit.Density
    public float getDensity() {
        return this.$$delegate_0.getDensity();
    }

    @Override // androidx.compose.ui.unit.Density
    public float getFontScale() {
        return this.$$delegate_0.getFontScale();
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: roundToPx--R2X_6o  reason: not valid java name */
    public int mo581roundToPxR2X_6o(long j) {
        return this.$$delegate_0.mo581roundToPxR2X_6o(j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: roundToPx-0680j_4  reason: not valid java name */
    public int mo582roundToPx0680j_4(float f) {
        return this.$$delegate_0.mo582roundToPx0680j_4(f);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toDp-GaN1DYA  reason: not valid java name */
    public float mo583toDpGaN1DYA(long j) {
        return this.$$delegate_0.mo583toDpGaN1DYA(j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toDp-u2uoSUM  reason: not valid java name */
    public float mo584toDpu2uoSUM(float f) {
        return this.$$delegate_0.mo584toDpu2uoSUM(f);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toDp-u2uoSUM  reason: not valid java name */
    public float mo585toDpu2uoSUM(int i) {
        return this.$$delegate_0.mo585toDpu2uoSUM(i);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toDpSize-k-rfVVM  reason: not valid java name */
    public long mo586toDpSizekrfVVM(long j) {
        return this.$$delegate_0.mo586toDpSizekrfVVM(j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toPx--R2X_6o  reason: not valid java name */
    public float mo587toPxR2X_6o(long j) {
        return this.$$delegate_0.mo587toPxR2X_6o(j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toPx-0680j_4  reason: not valid java name */
    public float mo588toPx0680j_4(float f) {
        return this.$$delegate_0.mo588toPx0680j_4(f);
    }

    @Override // androidx.compose.ui.unit.Density
    public Rect toRect(DpRect dpRect) {
        Intrinsics.checkNotNullParameter(dpRect, "<this>");
        return this.$$delegate_0.toRect(dpRect);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toSize-XkaWNTQ  reason: not valid java name */
    public long mo589toSizeXkaWNTQ(long j) {
        return this.$$delegate_0.mo589toSizeXkaWNTQ(j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toSp-0xMU5do  reason: not valid java name */
    public long mo590toSp0xMU5do(float f) {
        return this.$$delegate_0.mo590toSp0xMU5do(f);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toSp-kPz2Gy4  reason: not valid java name */
    public long mo591toSpkPz2Gy4(float f) {
        return this.$$delegate_0.mo591toSpkPz2Gy4(f);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toSp-kPz2Gy4  reason: not valid java name */
    public long mo592toSpkPz2Gy4(int i) {
        return this.$$delegate_0.mo592toSpkPz2Gy4(i);
    }

    public PressGestureScopeImpl(Density density) {
        Intrinsics.checkNotNullParameter(density, "density");
        this.$$delegate_0 = density;
        this.mutex = MutexKt.Mutex(false);
    }

    public final void cancel() {
        this.isCanceled = true;
        Mutex.DefaultImpls.unlock$default(this.mutex, null, 1, null);
    }

    public final void release() {
        this.isReleased = true;
        Mutex.DefaultImpls.unlock$default(this.mutex, null, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object reset(Continuation<? super Unit> continuation) {
        PressGestureScopeImpl$reset$1 pressGestureScopeImpl$reset$1;
        int i;
        PressGestureScopeImpl pressGestureScopeImpl;
        if (continuation instanceof PressGestureScopeImpl$reset$1) {
            pressGestureScopeImpl$reset$1 = (PressGestureScopeImpl$reset$1) continuation;
            if ((pressGestureScopeImpl$reset$1.label & Integer.MIN_VALUE) != 0) {
                pressGestureScopeImpl$reset$1.label -= Integer.MIN_VALUE;
                Object obj = pressGestureScopeImpl$reset$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = pressGestureScopeImpl$reset$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Mutex mutex = this.mutex;
                    pressGestureScopeImpl$reset$1.L$0 = this;
                    pressGestureScopeImpl$reset$1.label = 1;
                    if (Mutex.DefaultImpls.lock$default(mutex, null, pressGestureScopeImpl$reset$1, 1, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    pressGestureScopeImpl = this;
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    pressGestureScopeImpl = (PressGestureScopeImpl) pressGestureScopeImpl$reset$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                pressGestureScopeImpl.isReleased = false;
                pressGestureScopeImpl.isCanceled = false;
                return Unit.INSTANCE;
            }
        }
        pressGestureScopeImpl$reset$1 = new PressGestureScopeImpl$reset$1(this, continuation);
        Object obj2 = pressGestureScopeImpl$reset$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = pressGestureScopeImpl$reset$1.label;
        if (i != 0) {
        }
        pressGestureScopeImpl.isReleased = false;
        pressGestureScopeImpl.isCanceled = false;
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    @Override // androidx.compose.foundation.gestures.PressGestureScope
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object awaitRelease(Continuation<? super Unit> continuation) {
        PressGestureScopeImpl$awaitRelease$1 pressGestureScopeImpl$awaitRelease$1;
        Object obj;
        int i;
        if (continuation instanceof PressGestureScopeImpl$awaitRelease$1) {
            pressGestureScopeImpl$awaitRelease$1 = (PressGestureScopeImpl$awaitRelease$1) continuation;
            if ((pressGestureScopeImpl$awaitRelease$1.label & Integer.MIN_VALUE) != 0) {
                pressGestureScopeImpl$awaitRelease$1.label -= Integer.MIN_VALUE;
                obj = pressGestureScopeImpl$awaitRelease$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = pressGestureScopeImpl$awaitRelease$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    pressGestureScopeImpl$awaitRelease$1.label = 1;
                    obj = tryAwaitRelease(pressGestureScopeImpl$awaitRelease$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ResultKt.throwOnFailure(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    throw new GestureCancellationException("The press gesture was canceled.");
                }
                return Unit.INSTANCE;
            }
        }
        pressGestureScopeImpl$awaitRelease$1 = new PressGestureScopeImpl$awaitRelease$1(this, continuation);
        obj = pressGestureScopeImpl$awaitRelease$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = pressGestureScopeImpl$awaitRelease$1.label;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    @Override // androidx.compose.foundation.gestures.PressGestureScope
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object tryAwaitRelease(Continuation<? super Boolean> continuation) {
        PressGestureScopeImpl$tryAwaitRelease$1 pressGestureScopeImpl$tryAwaitRelease$1;
        int i;
        PressGestureScopeImpl pressGestureScopeImpl;
        if (continuation instanceof PressGestureScopeImpl$tryAwaitRelease$1) {
            pressGestureScopeImpl$tryAwaitRelease$1 = (PressGestureScopeImpl$tryAwaitRelease$1) continuation;
            if ((pressGestureScopeImpl$tryAwaitRelease$1.label & Integer.MIN_VALUE) != 0) {
                pressGestureScopeImpl$tryAwaitRelease$1.label -= Integer.MIN_VALUE;
                Object obj = pressGestureScopeImpl$tryAwaitRelease$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = pressGestureScopeImpl$tryAwaitRelease$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (!this.isReleased && !this.isCanceled) {
                        Mutex mutex = this.mutex;
                        pressGestureScopeImpl$tryAwaitRelease$1.L$0 = this;
                        pressGestureScopeImpl$tryAwaitRelease$1.label = 1;
                        if (Mutex.DefaultImpls.lock$default(mutex, null, pressGestureScopeImpl$tryAwaitRelease$1, 1, null) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        pressGestureScopeImpl = this;
                    } else {
                        pressGestureScopeImpl = this;
                        return Boxing.boxBoolean(pressGestureScopeImpl.isReleased);
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    pressGestureScopeImpl = (PressGestureScopeImpl) pressGestureScopeImpl$tryAwaitRelease$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                Mutex.DefaultImpls.unlock$default(pressGestureScopeImpl.mutex, null, 1, null);
                return Boxing.boxBoolean(pressGestureScopeImpl.isReleased);
            }
        }
        pressGestureScopeImpl$tryAwaitRelease$1 = new PressGestureScopeImpl$tryAwaitRelease$1(this, continuation);
        Object obj2 = pressGestureScopeImpl$tryAwaitRelease$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = pressGestureScopeImpl$tryAwaitRelease$1.label;
        if (i != 0) {
        }
        Mutex.DefaultImpls.unlock$default(pressGestureScopeImpl.mutex, null, 1, null);
        return Boxing.boxBoolean(pressGestureScopeImpl.isReleased);
    }
}
