package androidx.compose.material.ripple;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.util.MathHelpersKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
/* compiled from: RippleAnimation.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\"\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0002\u0010\bJ\u0011\u0010#\u001a\u00020\u0019H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010$J\u0011\u0010%\u001a\u00020\u0019H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010$J\u0011\u0010&\u001a\u00020\u0019H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010$J\u0006\u0010'\u001a\u00020\u0019J\u001f\u0010(\u001a\u00020\u0019*\u00020)2\u0006\u0010*\u001a\u00020+ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b,\u0010-R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R+\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00078B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R+\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00078B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001d\u0010\u0016\u001a\u0004\b\u001b\u0010\u0012\"\u0004\b\u001c\u0010\u0014R\u0019\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0002\n\u0000R\u0019\u0010\u0004\u001a\u00020\u0005X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u001eR\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010 R\u0019\u0010!\u001a\u0004\u0018\u00010\u0003X\u0082\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0002\n\u0000R\u0012\u0010\"\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010 \u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006."}, d2 = {"Landroidx/compose/material/ripple/RippleAnimation;", "", "origin", "Landroidx/compose/ui/geometry/Offset;", "radius", "Landroidx/compose/ui/unit/Dp;", "bounded", "", "(Landroidx/compose/ui/geometry/Offset;FZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "animatedAlpha", "Landroidx/compose/animation/core/Animatable;", "", "Landroidx/compose/animation/core/AnimationVector1D;", "animatedCenterPercent", "animatedRadiusPercent", "<set-?>", "finishRequested", "getFinishRequested", "()Z", "setFinishRequested", "(Z)V", "finishRequested$delegate", "Landroidx/compose/runtime/MutableState;", "finishSignalDeferred", "Lkotlinx/coroutines/CompletableDeferred;", "", "finishedFadingIn", "getFinishedFadingIn", "setFinishedFadingIn", "finishedFadingIn$delegate", "F", "startRadius", "Ljava/lang/Float;", "targetCenter", "targetRadius", "animate", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fadeIn", "fadeOut", "finish", "draw", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "color", "Landroidx/compose/ui/graphics/Color;", "draw-4WTKRHQ", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;J)V", "material-ripple_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RippleAnimation {
    private final Animatable<Float, AnimationVector1D> animatedAlpha;
    private final Animatable<Float, AnimationVector1D> animatedCenterPercent;
    private final Animatable<Float, AnimationVector1D> animatedRadiusPercent;
    private final boolean bounded;
    private final MutableState finishRequested$delegate;
    private final CompletableDeferred<Unit> finishSignalDeferred;
    private final MutableState finishedFadingIn$delegate;
    private Offset origin;
    private final float radius;
    private Float startRadius;
    private Offset targetCenter;
    private Float targetRadius;

    public /* synthetic */ RippleAnimation(Offset offset, float f, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(offset, f, z);
    }

    private RippleAnimation(Offset offset, float f, boolean z) {
        MutableState mutableStateOf$default;
        MutableState mutableStateOf$default2;
        this.origin = offset;
        this.radius = f;
        this.bounded = z;
        this.animatedAlpha = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
        this.animatedRadiusPercent = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
        this.animatedCenterPercent = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
        this.finishSignalDeferred = CompletableDeferredKt.CompletableDeferred((Job) null);
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        this.finishedFadingIn$delegate = mutableStateOf$default;
        mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        this.finishRequested$delegate = mutableStateOf$default2;
    }

    private final boolean getFinishedFadingIn() {
        return ((Boolean) this.finishedFadingIn$delegate.getValue()).booleanValue();
    }

    private final void setFinishedFadingIn(boolean z) {
        this.finishedFadingIn$delegate.setValue(Boolean.valueOf(z));
    }

    private final boolean getFinishRequested() {
        return ((Boolean) this.finishRequested$delegate.getValue()).booleanValue();
    }

    private final void setFinishRequested(boolean z) {
        this.finishRequested$delegate.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0067 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0073 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object animate(Continuation<? super Unit> continuation) {
        RippleAnimation$animate$1 rippleAnimation$animate$1;
        Object coroutine_suspended;
        int i;
        RippleAnimation rippleAnimation;
        CompletableDeferred<Unit> completableDeferred;
        if (continuation instanceof RippleAnimation$animate$1) {
            rippleAnimation$animate$1 = (RippleAnimation$animate$1) continuation;
            if ((rippleAnimation$animate$1.label & Integer.MIN_VALUE) != 0) {
                rippleAnimation$animate$1.label -= Integer.MIN_VALUE;
                Object obj = rippleAnimation$animate$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = rippleAnimation$animate$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    rippleAnimation$animate$1.L$0 = this;
                    rippleAnimation$animate$1.label = 1;
                    if (fadeIn(rippleAnimation$animate$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    rippleAnimation = this;
                } else if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            ResultKt.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    rippleAnimation = (RippleAnimation) rippleAnimation$animate$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    rippleAnimation$animate$1.L$0 = null;
                    rippleAnimation$animate$1.label = 3;
                    if (rippleAnimation.fadeOut(rippleAnimation$animate$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                } else {
                    rippleAnimation = (RippleAnimation) rippleAnimation$animate$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                rippleAnimation.setFinishedFadingIn(true);
                completableDeferred = rippleAnimation.finishSignalDeferred;
                rippleAnimation$animate$1.L$0 = rippleAnimation;
                rippleAnimation$animate$1.label = 2;
                if (completableDeferred.await(rippleAnimation$animate$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                rippleAnimation$animate$1.L$0 = null;
                rippleAnimation$animate$1.label = 3;
                if (rippleAnimation.fadeOut(rippleAnimation$animate$1) == coroutine_suspended) {
                }
                return Unit.INSTANCE;
            }
        }
        rippleAnimation$animate$1 = new RippleAnimation$animate$1(this, continuation);
        Object obj2 = rippleAnimation$animate$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = rippleAnimation$animate$1.label;
        if (i != 0) {
        }
        rippleAnimation.setFinishedFadingIn(true);
        completableDeferred = rippleAnimation.finishSignalDeferred;
        rippleAnimation$animate$1.L$0 = rippleAnimation;
        rippleAnimation$animate$1.label = 2;
        if (completableDeferred.await(rippleAnimation$animate$1) == coroutine_suspended) {
        }
        rippleAnimation$animate$1.L$0 = null;
        rippleAnimation$animate$1.label = 3;
        if (rippleAnimation.fadeOut(rippleAnimation$animate$1) == coroutine_suspended) {
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object fadeIn(Continuation<? super Unit> continuation) {
        Object coroutineScope = CoroutineScopeKt.coroutineScope(new RippleAnimation$fadeIn$2(this, null), continuation);
        return coroutineScope == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? coroutineScope : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object fadeOut(Continuation<? super Unit> continuation) {
        Object coroutineScope = CoroutineScopeKt.coroutineScope(new RippleAnimation$fadeOut$2(this, null), continuation);
        return coroutineScope == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? coroutineScope : Unit.INSTANCE;
    }

    public final void finish() {
        setFinishRequested(true);
        this.finishSignalDeferred.complete(Unit.INSTANCE);
    }

    /* renamed from: draw-4WTKRHQ  reason: not valid java name */
    public final void m1552draw4WTKRHQ(DrawScope draw, long j) {
        Float valueOf;
        Intrinsics.checkNotNullParameter(draw, "$this$draw");
        if (this.startRadius == null) {
            this.startRadius = Float.valueOf(RippleAnimationKt.m1554getRippleStartRadiusuvyYCjk(draw.mo3762getSizeNHjbRc()));
        }
        if (this.targetRadius == null) {
            if (Float.isNaN(this.radius)) {
                valueOf = Float.valueOf(RippleAnimationKt.m1553getRippleEndRadiuscSwnlzA(draw, this.bounded, draw.mo3762getSizeNHjbRc()));
            } else {
                valueOf = Float.valueOf(draw.mo588toPx0680j_4(this.radius));
            }
            this.targetRadius = valueOf;
        }
        if (this.origin == null) {
            this.origin = Offset.m3007boximpl(draw.mo3761getCenterF1C5BW0());
        }
        if (this.targetCenter == null) {
            this.targetCenter = Offset.m3007boximpl(OffsetKt.Offset(Size.m3087getWidthimpl(draw.mo3762getSizeNHjbRc()) / 2.0f, Size.m3084getHeightimpl(draw.mo3762getSizeNHjbRc()) / 2.0f));
        }
        float floatValue = (!getFinishRequested() || getFinishedFadingIn()) ? this.animatedAlpha.getValue().floatValue() : 1.0f;
        Float f = this.startRadius;
        Intrinsics.checkNotNull(f);
        float floatValue2 = f.floatValue();
        Float f2 = this.targetRadius;
        Intrinsics.checkNotNull(f2);
        float lerp = MathHelpersKt.lerp(floatValue2, f2.floatValue(), this.animatedRadiusPercent.getValue().floatValue());
        Offset offset = this.origin;
        Intrinsics.checkNotNull(offset);
        float m3018getXimpl = Offset.m3018getXimpl(offset.m3028unboximpl());
        Offset offset2 = this.targetCenter;
        Intrinsics.checkNotNull(offset2);
        float lerp2 = MathHelpersKt.lerp(m3018getXimpl, Offset.m3018getXimpl(offset2.m3028unboximpl()), this.animatedCenterPercent.getValue().floatValue());
        Offset offset3 = this.origin;
        Intrinsics.checkNotNull(offset3);
        float m3019getYimpl = Offset.m3019getYimpl(offset3.m3028unboximpl());
        Offset offset4 = this.targetCenter;
        Intrinsics.checkNotNull(offset4);
        long Offset = OffsetKt.Offset(lerp2, MathHelpersKt.lerp(m3019getYimpl, Offset.m3019getYimpl(offset4.m3028unboximpl()), this.animatedCenterPercent.getValue().floatValue()));
        long m3290copywmQWz5c$default = Color.m3290copywmQWz5c$default(j, Color.m3293getAlphaimpl(j) * floatValue, 0.0f, 0.0f, 0.0f, 14, null);
        if (!this.bounded) {
            DrawScope.CC.m3829drawCircleVaOC9Bg$default(draw, m3290copywmQWz5c$default, lerp, Offset, 0.0f, null, null, 0, 120, null);
            return;
        }
        float m3087getWidthimpl = Size.m3087getWidthimpl(draw.mo3762getSizeNHjbRc());
        float m3084getHeightimpl = Size.m3084getHeightimpl(draw.mo3762getSizeNHjbRc());
        int m3280getIntersectrtfAjoo = ClipOp.Companion.m3280getIntersectrtfAjoo();
        DrawContext drawContext = draw.getDrawContext();
        long mo3768getSizeNHjbRc = drawContext.mo3768getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo3771clipRectN_I0leg(0.0f, 0.0f, m3087getWidthimpl, m3084getHeightimpl, m3280getIntersectrtfAjoo);
        DrawScope.CC.m3829drawCircleVaOC9Bg$default(draw, m3290copywmQWz5c$default, lerp, Offset, 0.0f, null, null, 0, 120, null);
        drawContext.getCanvas().restore();
        drawContext.mo3769setSizeuvyYCjk(mo3768getSizeNHjbRc);
    }
}
