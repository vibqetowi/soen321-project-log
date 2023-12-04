package androidx.compose.ui.tooling.animation.clock;

import androidx.compose.animation.core.Animation;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.tooling.TransitionInfo;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.tooling.animation.states.TargetState;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.exifinterface.media.ExifInterface;
import com.google.firebase.messaging.Constants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: Utils.kt */
@Metadata(d1 = {"\u0000X\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\u001a\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0000\u001a\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0000\u001a5\u0010\n\u001a\n\u0012\u0004\u0012\u0002H\f\u0018\u00010\u000b\"\u0004\b\u0000\u0010\f2\u0006\u0010\r\u001a\u0002H\f2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0000¢\u0006\u0002\u0010\u0011\u001a&\u0010\u0012\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0013R\u0006\u0012\u0002\b\u00030\u00140\u0001*\u0006\u0012\u0002\b\u00030\u0014H\u0000\u001aH\u0010\u0015\u001a\u00020\u0016\"\u0004\b\u0000\u0010\f\"\b\b\u0001\u0010\u0017*\u00020\u0018*\u000e\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\u00170\u00192\u0006\u0010\u001a\u001a\u00020\u00022\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u0002H\f0\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u0006H\u0000\u001a>\u0010\u0015\u001a\u00020\u0016\"\u0004\b\u0000\u0010\f\"\b\b\u0001\u0010\u0017*\u00020\u0018*\u0012\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\u00170\u001eR\u00020\u001f2\b\b\u0002\u0010\u001d\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u0006H\u0000\u001aB\u0010\u0015\u001a\u00020\u0016\"\u0004\b\u0000\u0010\f\"\b\b\u0001\u0010\u0017*\u00020\u0018\"\u0004\b\u0002\u0010!*\u0018\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\u00170\u0013R\b\u0012\u0004\u0012\u0002H!0\u00142\b\b\u0002\u0010\u001d\u001a\u00020\u0006H\u0000\"\u001a\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004¨\u0006\"²\u0006\u001a\u0010#\u001a\u00020\u0006\"\u0004\b\u0000\u0010\f\"\b\b\u0001\u0010\u0017*\u00020\u0018X\u008a\u0084\u0002²\u0006&\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u0002H\f0%\"\u0004\b\u0000\u0010\f\"\b\b\u0001\u0010\u0017*\u00020\u0018X\u008a\u0084\u0002²\u0006&\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u0002H\f0%\"\u0004\b\u0000\u0010\f\"\b\b\u0001\u0010\u0017*\u00020\u0018X\u008a\u0084\u0002"}, d2 = {"IGNORE_TRANSITIONS", "", "", "getIGNORE_TRANSITIONS", "()Ljava/util/List;", "millisToNanos", "", "timeMs", "nanosToMillis", "timeNs", "parseParametersToValue", "Landroidx/compose/ui/tooling/animation/states/TargetState;", ExifInterface.GPS_DIRECTION_TRUE, "currentValue", "par1", "", "par2", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Landroidx/compose/ui/tooling/animation/states/TargetState;", "allAnimations", "Landroidx/compose/animation/core/Transition$TransitionAnimationState;", "Landroidx/compose/animation/core/Transition;", "createTransitionInfo", "Landroidx/compose/animation/tooling/TransitionInfo;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Landroidx/compose/animation/core/AnimationVector;", "Landroidx/compose/animation/core/Animation;", Constants.ScionAnalytics.PARAM_LABEL, "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "stepMs", "Landroidx/compose/animation/core/InfiniteTransition$TransitionAnimationState;", "Landroidx/compose/animation/core/InfiniteTransition;", "endTimeMs", ExifInterface.LATITUDE_SOUTH, "ui-tooling_release", "startTimeMs", "values", ""}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UtilsKt {
    private static final List<String> IGNORE_TRANSITIONS = CollectionsKt.listOf("TransformOriginInterruptionHandling");

    public static final long millisToNanos(long j) {
        return j * 1000000;
    }

    public static final List<String> getIGNORE_TRANSITIONS() {
        return IGNORE_TRANSITIONS;
    }

    public static final long nanosToMillis(long j) {
        return (j + 999999) / 1000000;
    }

    public static final List<Transition<?>.TransitionAnimationState<?, ?>> allAnimations(Transition<?> transition) {
        Intrinsics.checkNotNullParameter(transition, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = transition.getTransitions().iterator();
        while (it.hasNext()) {
            CollectionsKt.addAll(arrayList, allAnimations((Transition) it.next()));
        }
        return CollectionsKt.plus((Collection) transition.getAnimations(), (Iterable) arrayList);
    }

    public static /* synthetic */ TransitionInfo createTransitionInfo$default(Transition.TransitionAnimationState transitionAnimationState, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 1;
        }
        return createTransitionInfo(transitionAnimationState, j);
    }

    public static final <T, V extends AnimationVector, S> TransitionInfo createTransitionInfo(Transition<S>.TransitionAnimationState<T, V> transitionAnimationState, long j) {
        Intrinsics.checkNotNullParameter(transitionAnimationState, "<this>");
        return createTransitionInfo(transitionAnimationState.getAnimation(), transitionAnimationState.getLabel(), transitionAnimationState.getAnimationSpec(), j);
    }

    public static /* synthetic */ TransitionInfo createTransitionInfo$default(Animation animation, String str, AnimationSpec animationSpec, long j, int i, Object obj) {
        if ((i & 4) != 0) {
            j = 1;
        }
        return createTransitionInfo(animation, str, animationSpec, j);
    }

    public static final <T, V extends AnimationVector> TransitionInfo createTransitionInfo(Animation<T, V> animation, String label, AnimationSpec<T> animationSpec, long j) {
        Intrinsics.checkNotNullParameter(animation, "<this>");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        long nanosToMillis = nanosToMillis(animation.getDurationNanos());
        Lazy lazy = LazyKt.lazy(new UtilsKt$createTransitionInfo$startTimeMs$2(animationSpec));
        Lazy lazy2 = LazyKt.lazy(new UtilsKt$createTransitionInfo$values$2(animation, nanosToMillis, j, lazy));
        String name = animationSpec.getClass().getName();
        Intrinsics.checkNotNullExpressionValue(name, "animationSpec.javaClass.name");
        return new TransitionInfo(label, name, createTransitionInfo$lambda$1(lazy), nanosToMillis, createTransitionInfo$lambda$2(lazy2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long createTransitionInfo$lambda$1(Lazy<Long> lazy) {
        return lazy.getValue().longValue();
    }

    private static final <T> Map<Long, T> createTransitionInfo$lambda$2(Lazy<? extends Map<Long, T>> lazy) {
        return lazy.getValue();
    }

    public static /* synthetic */ TransitionInfo createTransitionInfo$default(InfiniteTransition.TransitionAnimationState transitionAnimationState, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 1;
        }
        return createTransitionInfo(transitionAnimationState, j, j2);
    }

    public static final <T, V extends AnimationVector> TransitionInfo createTransitionInfo(InfiniteTransition.TransitionAnimationState<T, V> transitionAnimationState, long j, long j2) {
        Intrinsics.checkNotNullParameter(transitionAnimationState, "<this>");
        Lazy lazy = LazyKt.lazy(new UtilsKt$createTransitionInfo$values$4(0L, transitionAnimationState, j2, j));
        String label = transitionAnimationState.getLabel();
        String name = transitionAnimationState.getAnimationSpec().getClass().getName();
        Intrinsics.checkNotNullExpressionValue(name, "animationSpec.javaClass.name");
        return new TransitionInfo(label, name, 0L, j2, createTransitionInfo$lambda$3(lazy));
    }

    private static final <T> Map<Long, T> createTransitionInfo$lambda$3(Lazy<? extends Map<Long, T>> lazy) {
        return lazy.getValue();
    }

    private static final boolean parseParametersToValue$parametersAreValid(Object obj, Object obj2) {
        return (obj == null || obj2 == null || obj.getClass() != obj2.getClass()) ? false : true;
    }

    private static final boolean parseParametersToValue$parametersHasTheSameType(Object obj, Object obj2, Object obj3) {
        return obj.getClass() == obj2.getClass() && obj.getClass() == obj3.getClass();
    }

    private static final Dp parseParametersToValue$getDp(Object obj) {
        Dp dp = obj instanceof Dp ? (Dp) obj : null;
        if (dp == null) {
            Float f = obj instanceof Float ? (Float) obj : null;
            dp = f != null ? Dp.m5605boximpl(Dp.m5607constructorimpl(f.floatValue())) : null;
            if (dp == null) {
                Double d = obj instanceof Double ? (Double) obj : null;
                dp = d != null ? Dp.m5605boximpl(Dp.m5607constructorimpl((float) d.doubleValue())) : null;
                if (dp == null) {
                    Integer num = obj instanceof Integer ? (Integer) obj : null;
                    if (num != null) {
                        return Dp.m5605boximpl(Dp.m5607constructorimpl(num.intValue()));
                    }
                    return null;
                }
            }
        }
        return dp;
    }

    private static final <T> TargetState<Dp> parseParametersToValue$parseDp(T t, Object obj, Object obj2) {
        if (!(t instanceof Dp) || obj2 == null) {
            return null;
        }
        if ((obj instanceof Dp) && (obj2 instanceof Dp)) {
            return new TargetState<>(obj, obj2);
        }
        Dp parseParametersToValue$getDp = parseParametersToValue$getDp(obj);
        Dp parseParametersToValue$getDp2 = parseParametersToValue$getDp(obj2);
        if (parseParametersToValue$getDp == null || parseParametersToValue$getDp2 == null) {
            return null;
        }
        return new TargetState<>(parseParametersToValue$getDp, parseParametersToValue$getDp2);
    }

    public static final <T> TargetState<T> parseParametersToValue(T t, Object par1, Object obj) {
        TargetState<T> targetState;
        Intrinsics.checkNotNullParameter(par1, "par1");
        if (t == null) {
            return null;
        }
        TargetState<T> targetState2 = (TargetState<T>) parseParametersToValue$parseDp(t, par1, obj);
        if (targetState2 != null) {
            return targetState2;
        }
        if (parseParametersToValue$parametersAreValid(par1, obj)) {
            Intrinsics.checkNotNull(obj);
            if (parseParametersToValue$parametersHasTheSameType(t, par1, obj)) {
                return new TargetState<>(par1, obj);
            }
            if ((par1 instanceof List) && (obj instanceof List)) {
                try {
                    if (t instanceof IntSize) {
                        Object obj2 = ((List) par1).get(0);
                        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Int");
                        int intValue = ((Integer) obj2).intValue();
                        Object obj3 = ((List) par1).get(1);
                        Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Int");
                        IntSize m5759boximpl = IntSize.m5759boximpl(IntSizeKt.IntSize(intValue, ((Integer) obj3).intValue()));
                        Object obj4 = ((List) obj).get(0);
                        Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type kotlin.Int");
                        int intValue2 = ((Integer) obj4).intValue();
                        Object obj5 = ((List) obj).get(1);
                        Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type kotlin.Int");
                        targetState = new TargetState<>(m5759boximpl, IntSize.m5759boximpl(IntSizeKt.IntSize(intValue2, ((Integer) obj5).intValue())));
                    } else if (t instanceof IntOffset) {
                        Object obj6 = ((List) par1).get(0);
                        Intrinsics.checkNotNull(obj6, "null cannot be cast to non-null type kotlin.Int");
                        int intValue3 = ((Integer) obj6).intValue();
                        Object obj7 = ((List) par1).get(1);
                        Intrinsics.checkNotNull(obj7, "null cannot be cast to non-null type kotlin.Int");
                        IntOffset m5716boximpl = IntOffset.m5716boximpl(IntOffsetKt.IntOffset(intValue3, ((Integer) obj7).intValue()));
                        Object obj8 = ((List) obj).get(0);
                        Intrinsics.checkNotNull(obj8, "null cannot be cast to non-null type kotlin.Int");
                        int intValue4 = ((Integer) obj8).intValue();
                        Object obj9 = ((List) obj).get(1);
                        Intrinsics.checkNotNull(obj9, "null cannot be cast to non-null type kotlin.Int");
                        targetState = new TargetState<>(m5716boximpl, IntOffset.m5716boximpl(IntOffsetKt.IntOffset(intValue4, ((Integer) obj9).intValue())));
                    } else if (t instanceof Size) {
                        Object obj10 = ((List) par1).get(0);
                        Intrinsics.checkNotNull(obj10, "null cannot be cast to non-null type kotlin.Float");
                        float floatValue = ((Float) obj10).floatValue();
                        Object obj11 = ((List) par1).get(1);
                        Intrinsics.checkNotNull(obj11, "null cannot be cast to non-null type kotlin.Float");
                        Size m3075boximpl = Size.m3075boximpl(SizeKt.Size(floatValue, ((Float) obj11).floatValue()));
                        Object obj12 = ((List) obj).get(0);
                        Intrinsics.checkNotNull(obj12, "null cannot be cast to non-null type kotlin.Float");
                        float floatValue2 = ((Float) obj12).floatValue();
                        Object obj13 = ((List) obj).get(1);
                        Intrinsics.checkNotNull(obj13, "null cannot be cast to non-null type kotlin.Float");
                        targetState = new TargetState<>(m3075boximpl, Size.m3075boximpl(SizeKt.Size(floatValue2, ((Float) obj13).floatValue())));
                    } else if (t instanceof Offset) {
                        Object obj14 = ((List) par1).get(0);
                        Intrinsics.checkNotNull(obj14, "null cannot be cast to non-null type kotlin.Float");
                        float floatValue3 = ((Float) obj14).floatValue();
                        Object obj15 = ((List) par1).get(1);
                        Intrinsics.checkNotNull(obj15, "null cannot be cast to non-null type kotlin.Float");
                        Offset m3007boximpl = Offset.m3007boximpl(OffsetKt.Offset(floatValue3, ((Float) obj15).floatValue()));
                        Object obj16 = ((List) obj).get(0);
                        Intrinsics.checkNotNull(obj16, "null cannot be cast to non-null type kotlin.Float");
                        float floatValue4 = ((Float) obj16).floatValue();
                        Object obj17 = ((List) obj).get(1);
                        Intrinsics.checkNotNull(obj17, "null cannot be cast to non-null type kotlin.Float");
                        targetState = new TargetState<>(m3007boximpl, Offset.m3007boximpl(OffsetKt.Offset(floatValue4, ((Float) obj17).floatValue())));
                    } else if (t instanceof Rect) {
                        Object obj18 = ((List) par1).get(0);
                        Intrinsics.checkNotNull(obj18, "null cannot be cast to non-null type kotlin.Float");
                        float floatValue5 = ((Float) obj18).floatValue();
                        Object obj19 = ((List) par1).get(1);
                        Intrinsics.checkNotNull(obj19, "null cannot be cast to non-null type kotlin.Float");
                        float floatValue6 = ((Float) obj19).floatValue();
                        Object obj20 = ((List) par1).get(2);
                        Intrinsics.checkNotNull(obj20, "null cannot be cast to non-null type kotlin.Float");
                        float floatValue7 = ((Float) obj20).floatValue();
                        Object obj21 = ((List) par1).get(3);
                        Intrinsics.checkNotNull(obj21, "null cannot be cast to non-null type kotlin.Float");
                        Rect rect = new Rect(floatValue5, floatValue6, floatValue7, ((Float) obj21).floatValue());
                        Object obj22 = ((List) obj).get(0);
                        Intrinsics.checkNotNull(obj22, "null cannot be cast to non-null type kotlin.Float");
                        float floatValue8 = ((Float) obj22).floatValue();
                        Object obj23 = ((List) obj).get(1);
                        Intrinsics.checkNotNull(obj23, "null cannot be cast to non-null type kotlin.Float");
                        float floatValue9 = ((Float) obj23).floatValue();
                        Object obj24 = ((List) obj).get(2);
                        Intrinsics.checkNotNull(obj24, "null cannot be cast to non-null type kotlin.Float");
                        float floatValue10 = ((Float) obj24).floatValue();
                        Object obj25 = ((List) obj).get(3);
                        Intrinsics.checkNotNull(obj25, "null cannot be cast to non-null type kotlin.Float");
                        targetState = new TargetState<>(rect, new Rect(floatValue8, floatValue9, floatValue10, ((Float) obj25).floatValue()));
                    } else if (t instanceof Color) {
                        Object obj26 = ((List) par1).get(0);
                        Intrinsics.checkNotNull(obj26, "null cannot be cast to non-null type kotlin.Float");
                        float floatValue11 = ((Float) obj26).floatValue();
                        Object obj27 = ((List) par1).get(1);
                        Intrinsics.checkNotNull(obj27, "null cannot be cast to non-null type kotlin.Float");
                        float floatValue12 = ((Float) obj27).floatValue();
                        Object obj28 = ((List) par1).get(2);
                        Intrinsics.checkNotNull(obj28, "null cannot be cast to non-null type kotlin.Float");
                        float floatValue13 = ((Float) obj28).floatValue();
                        Object obj29 = ((List) par1).get(3);
                        Intrinsics.checkNotNull(obj29, "null cannot be cast to non-null type kotlin.Float");
                        Color m3281boximpl = Color.m3281boximpl(ColorKt.Color$default(floatValue11, floatValue12, floatValue13, ((Float) obj29).floatValue(), null, 16, null));
                        Object obj30 = ((List) obj).get(0);
                        Intrinsics.checkNotNull(obj30, "null cannot be cast to non-null type kotlin.Float");
                        float floatValue14 = ((Float) obj30).floatValue();
                        Object obj31 = ((List) obj).get(1);
                        Intrinsics.checkNotNull(obj31, "null cannot be cast to non-null type kotlin.Float");
                        float floatValue15 = ((Float) obj31).floatValue();
                        Object obj32 = ((List) obj).get(2);
                        Intrinsics.checkNotNull(obj32, "null cannot be cast to non-null type kotlin.Float");
                        float floatValue16 = ((Float) obj32).floatValue();
                        Object obj33 = ((List) obj).get(3);
                        Intrinsics.checkNotNull(obj33, "null cannot be cast to non-null type kotlin.Float");
                        targetState = new TargetState<>(m3281boximpl, Color.m3281boximpl(ColorKt.Color$default(floatValue14, floatValue15, floatValue16, ((Float) obj33).floatValue(), null, 16, null)));
                    } else if (t instanceof Dp) {
                        Object obj34 = ((List) par1).get(0);
                        Intrinsics.checkNotNull(obj34);
                        Object obj35 = ((List) obj).get(0);
                        Intrinsics.checkNotNull(obj35);
                        targetState = (TargetState<T>) parseParametersToValue$parseDp(t, obj34, obj35);
                    } else if (parseParametersToValue$parametersAreValid(((List) par1).get(0), ((List) obj).get(0))) {
                        Object obj36 = ((List) par1).get(0);
                        Intrinsics.checkNotNull(obj36);
                        Object obj37 = ((List) obj).get(0);
                        Intrinsics.checkNotNull(obj37);
                        if (parseParametersToValue$parametersHasTheSameType(t, obj36, obj37)) {
                            targetState = new TargetState<>(((List) par1).get(0), ((List) obj).get(0));
                        }
                    }
                    Intrinsics.checkNotNull(targetState, "null cannot be cast to non-null type androidx.compose.ui.tooling.animation.states.TargetState<T of androidx.compose.ui.tooling.animation.clock.UtilsKt.parseParametersToValue>");
                    return targetState;
                } catch (ClassCastException | IllegalArgumentException | IndexOutOfBoundsException | NullPointerException unused) {
                }
            }
            return null;
        }
        return null;
    }
}
