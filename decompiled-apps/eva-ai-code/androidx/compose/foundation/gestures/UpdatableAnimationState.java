package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.animation.core.VectorizedSpringSpec;
import androidx.compose.runtime.MonotonicFrameClockKt;
import androidx.compose.ui.MotionDurationScale;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FloatCompanionObject;
/* compiled from: UpdatableAnimationState.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0005¢\u0006\u0002\u0010\u0002JM\u0010\u000f\u001a\u00020\u00102!\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u00100\u00122\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00100\u0017H\u0086@ø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0002\u0010\u0018R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Landroidx/compose/foundation/gestures/UpdatableAnimationState;", "", "()V", "isRunning", "", "lastFrameTime", "", "lastVelocity", "Landroidx/compose/animation/core/AnimationVector1D;", "value", "", "getValue", "()F", "setValue", "(F)V", "animateToZero", "", "beforeFrame", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "valueDelta", "afterFrame", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class UpdatableAnimationState {
    @Deprecated
    public static final float VisibilityThreshold = 0.01f;
    private boolean isRunning;
    private long lastFrameTime = Long.MIN_VALUE;
    private AnimationVector1D lastVelocity = ZeroVector;
    private float value;
    private static final Companion Companion = new Companion(null);
    private static final AnimationVector1D ZeroVector = new AnimationVector1D(0.0f);
    private static final VectorizedSpringSpec<AnimationVector1D> RebasableAnimationSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null).vectorize((TwoWayConverter) VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE));

    public final float getValue() {
        return this.value;
    }

    public final void setValue(float f) {
        this.value = f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b5, code lost:
        if ((r13 != 0.0f) == false) goto L30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b4  */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v20 */
    /* JADX WARN: Type inference failed for: r14v21 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00a8 -> B:62:0x00ab). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object animateToZero(Function1<? super Float, Unit> function1, Function0<Unit> function0, Continuation<? super Unit> continuation) {
        UpdatableAnimationState$animateToZero$1 updatableAnimationState$animateToZero$1;
        int i;
        Object obj;
        UpdatableAnimationState$animateToZero$1 updatableAnimationState$animateToZero$12;
        Function0 function02;
        Function1<? super Float, Unit> function12;
        float f;
        UpdatableAnimationState updatableAnimationState;
        Function0 function03;
        try {
            if (continuation instanceof UpdatableAnimationState$animateToZero$1) {
                updatableAnimationState$animateToZero$1 = (UpdatableAnimationState$animateToZero$1) continuation;
                if ((updatableAnimationState$animateToZero$1.label & Integer.MIN_VALUE) != 0) {
                    updatableAnimationState$animateToZero$1.label -= Integer.MIN_VALUE;
                    Object obj2 = updatableAnimationState$animateToZero$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = updatableAnimationState$animateToZero$1.label;
                    boolean z = true;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj2);
                        if (!(!this.isRunning)) {
                            throw new IllegalStateException("Check failed.".toString());
                        }
                        MotionDurationScale motionDurationScale = (MotionDurationScale) updatableAnimationState$animateToZero$1.getContext().get(MotionDurationScale.Key);
                        float scaleFactor = motionDurationScale != null ? motionDurationScale.getScaleFactor() : 1.0f;
                        this.isRunning = true;
                        obj = coroutine_suspended;
                        updatableAnimationState$animateToZero$12 = updatableAnimationState$animateToZero$1;
                        function02 = function0;
                        function12 = function1;
                        f = scaleFactor;
                        updatableAnimationState = this;
                        if (!Companion.isZeroish(updatableAnimationState.value)) {
                            updatableAnimationState$animateToZero$12.L$0 = updatableAnimationState;
                            updatableAnimationState$animateToZero$12.L$1 = function12;
                            updatableAnimationState$animateToZero$12.L$2 = function02;
                            updatableAnimationState$animateToZero$12.F$0 = f;
                            updatableAnimationState$animateToZero$12.label = 1;
                            if (MonotonicFrameClockKt.withFrameNanos(new UpdatableAnimationState$animateToZero$3(updatableAnimationState, f, function12), updatableAnimationState$animateToZero$12) == obj) {
                                return obj;
                            }
                            function02.invoke();
                        }
                        function03 = function02;
                        UpdatableAnimationState updatableAnimationState2 = updatableAnimationState;
                        Function1<? super Float, Unit> function13 = function12;
                        function0 = updatableAnimationState2;
                        if (Math.abs(function0.value) != 0.0f) {
                            z = false;
                        }
                        if (!z) {
                            updatableAnimationState$animateToZero$12.L$0 = function0;
                            updatableAnimationState$animateToZero$12.L$1 = function03;
                            updatableAnimationState$animateToZero$12.L$2 = null;
                            updatableAnimationState$animateToZero$12.label = 2;
                            Object withFrameNanos = MonotonicFrameClockKt.withFrameNanos(new UpdatableAnimationState$animateToZero$4(function0, function13), updatableAnimationState$animateToZero$12);
                            function0 = function0;
                            if (withFrameNanos == obj) {
                                return obj;
                            }
                            function03.invoke();
                        }
                        function0.lastFrameTime = Long.MIN_VALUE;
                        function0.lastVelocity = ZeroVector;
                        function0.isRunning = false;
                        return Unit.INSTANCE;
                    } else if (i != 1) {
                        if (i == 2) {
                            function03 = (Function0) updatableAnimationState$animateToZero$1.L$1;
                            UpdatableAnimationState updatableAnimationState3 = (UpdatableAnimationState) updatableAnimationState$animateToZero$1.L$0;
                            ResultKt.throwOnFailure(obj2);
                            function0 = updatableAnimationState3;
                            function03.invoke();
                            function0.lastFrameTime = Long.MIN_VALUE;
                            function0.lastVelocity = ZeroVector;
                            function0.isRunning = false;
                            return Unit.INSTANCE;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        f = updatableAnimationState$animateToZero$1.F$0;
                        Function0 function04 = (Function0) updatableAnimationState$animateToZero$1.L$2;
                        Function1<? super Float, Unit> function14 = (Function1) updatableAnimationState$animateToZero$1.L$1;
                        UpdatableAnimationState updatableAnimationState4 = (UpdatableAnimationState) updatableAnimationState$animateToZero$1.L$0;
                        try {
                            ResultKt.throwOnFailure(obj2);
                            updatableAnimationState = updatableAnimationState4;
                            UpdatableAnimationState$animateToZero$1 updatableAnimationState$animateToZero$13 = updatableAnimationState$animateToZero$1;
                            function02 = function04;
                            function12 = function14;
                            obj = coroutine_suspended;
                            updatableAnimationState$animateToZero$12 = updatableAnimationState$animateToZero$13;
                            try {
                                function02.invoke();
                            } catch (Throwable th) {
                                th = th;
                                function0 = updatableAnimationState;
                                function0.lastFrameTime = Long.MIN_VALUE;
                                function0.lastVelocity = ZeroVector;
                                function0.isRunning = false;
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            function0 = updatableAnimationState4;
                            function0.lastFrameTime = Long.MIN_VALUE;
                            function0.lastVelocity = ZeroVector;
                            function0.isRunning = false;
                            throw th;
                        }
                    }
                }
            }
            if (i != 0) {
            }
        } catch (Throwable th3) {
            th = th3;
        }
        updatableAnimationState$animateToZero$1 = new UpdatableAnimationState$animateToZero$1(this, continuation);
        Object obj22 = updatableAnimationState$animateToZero$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = updatableAnimationState$animateToZero$1.label;
        boolean z2 = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: UpdatableAnimationState.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\n\u0010\r\u001a\u00020\u000e*\u00020\tR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Landroidx/compose/foundation/gestures/UpdatableAnimationState$Companion;", "", "()V", "RebasableAnimationSpec", "Landroidx/compose/animation/core/VectorizedSpringSpec;", "Landroidx/compose/animation/core/AnimationVector1D;", "getRebasableAnimationSpec", "()Landroidx/compose/animation/core/VectorizedSpringSpec;", "VisibilityThreshold", "", "ZeroVector", "getZeroVector", "()Landroidx/compose/animation/core/AnimationVector1D;", "isZeroish", "", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final AnimationVector1D getZeroVector() {
            return UpdatableAnimationState.ZeroVector;
        }

        public final VectorizedSpringSpec<AnimationVector1D> getRebasableAnimationSpec() {
            return UpdatableAnimationState.RebasableAnimationSpec;
        }

        public final boolean isZeroish(float f) {
            return Math.abs(f) < 0.01f;
        }
    }
}
