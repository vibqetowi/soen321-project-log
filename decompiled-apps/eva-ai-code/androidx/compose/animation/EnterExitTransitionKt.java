package androidx.compose.animation;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: EnterExitTransition.kt */
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aT\u0010\r\u001a\u00020\u000e2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142#\b\u0002\u0010\u0015\u001a\u001d\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\u00170\u0016H\u0007ø\u0001\u0000\u001aT\u0010\u001b\u001a\u00020\u000e2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u001c2\b\b\u0002\u0010\u0013\u001a\u00020\u00142#\b\u0002\u0010\u001d\u001a\u001d\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\b0\u0016H\u0007ø\u0001\u0000\u001aT\u0010\u001f\u001a\u00020\u000e2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u00102\b\b\u0002\u0010\u0011\u001a\u00020 2\b\b\u0002\u0010\u0013\u001a\u00020\u00142#\b\u0002\u0010!\u001a\u001d\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020\u00170\u0016H\u0007ø\u0001\u0000\u001a\"\u0010#\u001a\u00020\u000e2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00102\b\b\u0002\u0010$\u001a\u00020\u0004H\u0007\u001a\"\u0010%\u001a\u00020&2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00102\b\b\u0002\u0010'\u001a\u00020\u0004H\u0007\u001a9\u0010(\u001a\u00020\u000e2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00102\b\b\u0002\u0010)\u001a\u00020\u00042\b\b\u0002\u0010*\u001a\u00020\u000bH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b+\u0010,\u001a9\u0010-\u001a\u00020&2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00102\b\b\u0002\u0010.\u001a\u00020\u00042\b\b\u0002\u0010*\u001a\u00020\u000bH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b/\u00100\u001aT\u00101\u001a\u00020&2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u00102\b\b\u0002\u00102\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142#\b\u0002\u00103\u001a\u001d\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\u00170\u0016H\u0007ø\u0001\u0000\u001aT\u00104\u001a\u00020&2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u00102\b\b\u0002\u00102\u001a\u00020\u001c2\b\b\u0002\u0010\u0013\u001a\u00020\u00142#\b\u0002\u00105\u001a\u001d\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\b0\u0016H\u0007ø\u0001\u0000\u001aT\u00106\u001a\u00020&2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u00102\b\b\u0002\u00102\u001a\u00020 2\b\b\u0002\u0010\u0013\u001a\u00020\u00142#\b\u0002\u00107\u001a\u001d\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020\u00170\u0016H\u0007ø\u0001\u0000\u001a>\u00108\u001a\u00020\u000e2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00102!\u00109\u001a\u001d\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\u00060\u0016H\u0007ø\u0001\u0000\u001a@\u0010:\u001a\u00020\u000e2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00102#\b\u0002\u0010;\u001a\u001d\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\u00170\u0016H\u0007ø\u0001\u0000\u001a@\u0010<\u001a\u00020\u000e2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00102#\b\u0002\u0010=\u001a\u001d\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020\u00170\u0016H\u0007ø\u0001\u0000\u001a>\u0010>\u001a\u00020&2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00102!\u0010?\u001a\u001d\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\u00060\u0016H\u0007ø\u0001\u0000\u001a@\u0010@\u001a\u00020&2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00102#\b\u0002\u0010A\u001a\u001d\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\u00170\u0016H\u0007ø\u0001\u0000\u001a@\u0010B\u001a\u00020&2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00102#\b\u0002\u0010C\u001a\u001d\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020\u00170\u0016H\u0007ø\u0001\u0000\u001a/\u0010D\u001a\u00020E*\b\u0012\u0004\u0012\u00020G0F2\u0006\u0010H\u001a\u00020\u000e2\u0006\u0010I\u001a\u00020&2\u0006\u0010J\u001a\u00020KH\u0001¢\u0006\u0002\u0010L\u001aB\u0010M\u001a\u00020E*\u00020E2\f\u0010N\u001a\b\u0012\u0004\u0012\u00020G0F2\u000e\u0010O\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010Q0P2\u000e\u0010R\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010Q0P2\u0006\u0010S\u001a\u00020KH\u0002\u001aB\u0010T\u001a\u00020E*\u00020E2\f\u0010N\u001a\b\u0012\u0004\u0012\u00020G0F2\u000e\u00108\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010U0P2\u000e\u0010>\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010U0P2\u0006\u0010S\u001a\u00020KH\u0002\u001a\f\u0010V\u001a\u00020\u001c*\u00020\u0012H\u0002\u001a\f\u0010V\u001a\u00020\u001c*\u00020 H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003X\u0082\u0004ø\u0001\u0000¢\u0006\u0002\n\u0000\"\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003X\u0082\u0004ø\u0001\u0000¢\u0006\u0002\n\u0000\"\u001d\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nX\u0082\u0004ø\u0001\u0000¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006W²\u0006\n\u0010X\u001a\u00020\u0014X\u008a\u008e\u0002²\u0006\n\u0010Y\u001a\u00020\u0014X\u008a\u008e\u0002²\u0006\n\u0010Z\u001a\u00020\u0004X\u008a\u0084\u0002²\u0006\n\u0010[\u001a\u00020\u0004X\u008a\u0084\u0002²\u0006\n\u0010*\u001a\u00020\u000bX\u008a\u0084\u0002²\u0006\n\u0010\\\u001a\u00020\u0014X\u008a\u008e\u0002²\u0006\n\u0010\\\u001a\u00020\u0014X\u008a\u008e\u0002"}, d2 = {"DefaultAlpha", "Landroidx/compose/runtime/MutableFloatState;", "DefaultAlphaAndScaleSpring", "Landroidx/compose/animation/core/SpringSpec;", "", "DefaultOffsetAnimationSpec", "Landroidx/compose/ui/unit/IntOffset;", "DefaultSizeAnimationSpec", "Landroidx/compose/ui/unit/IntSize;", "TransformOriginVectorConverter", "Landroidx/compose/animation/core/TwoWayConverter;", "Landroidx/compose/ui/graphics/TransformOrigin;", "Landroidx/compose/animation/core/AnimationVector2D;", "expandHorizontally", "Landroidx/compose/animation/EnterTransition;", "animationSpec", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "expandFrom", "Landroidx/compose/ui/Alignment$Horizontal;", "clip", "", "initialWidth", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "fullWidth", "expandIn", "Landroidx/compose/ui/Alignment;", "initialSize", "fullSize", "expandVertically", "Landroidx/compose/ui/Alignment$Vertical;", "initialHeight", "fullHeight", "fadeIn", "initialAlpha", "fadeOut", "Landroidx/compose/animation/ExitTransition;", "targetAlpha", "scaleIn", "initialScale", "transformOrigin", "scaleIn-L8ZKh-E", "(Landroidx/compose/animation/core/FiniteAnimationSpec;FJ)Landroidx/compose/animation/EnterTransition;", "scaleOut", "targetScale", "scaleOut-L8ZKh-E", "(Landroidx/compose/animation/core/FiniteAnimationSpec;FJ)Landroidx/compose/animation/ExitTransition;", "shrinkHorizontally", "shrinkTowards", "targetWidth", "shrinkOut", "targetSize", "shrinkVertically", "targetHeight", "slideIn", "initialOffset", "slideInHorizontally", "initialOffsetX", "slideInVertically", "initialOffsetY", "slideOut", "targetOffset", "slideOutHorizontally", "targetOffsetX", "slideOutVertically", "targetOffsetY", "createModifier", "Landroidx/compose/ui/Modifier;", "Landroidx/compose/animation/core/Transition;", "Landroidx/compose/animation/EnterExitState;", "enter", "exit", Constants.ScionAnalytics.PARAM_LABEL, "", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;", "shrinkExpand", "transition", "expand", "Landroidx/compose/runtime/State;", "Landroidx/compose/animation/ChangeSize;", "shrink", "labelPrefix", "slideInOut", "Landroidx/compose/animation/Slide;", "toAlignment", "animation_release", "shouldAnimateAlpha", "shouldAnimateScale", "alpha", "scale", "shouldAnimate"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class EnterExitTransitionKt {
    private static final TwoWayConverter<TransformOrigin, AnimationVector2D> TransformOriginVectorConverter = VectorConvertersKt.TwoWayConverter(EnterExitTransitionKt$TransformOriginVectorConverter$1.INSTANCE, EnterExitTransitionKt$TransformOriginVectorConverter$2.INSTANCE);
    private static final MutableFloatState DefaultAlpha = PrimitiveSnapshotStateKt.mutableFloatStateOf(1.0f);
    private static final SpringSpec<Float> DefaultAlphaAndScaleSpring = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
    private static final SpringSpec<IntOffset> DefaultOffsetAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m5716boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.Companion)), 1, null);
    private static final SpringSpec<IntSize> DefaultSizeAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m5759boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.Companion)), 1, null);

    /* compiled from: EnterExitTransition.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnterExitState.values().length];
            try {
                iArr[EnterExitState.Visible.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnterExitState.PreEnter.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnterExitState.PostExit.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ EnterTransition fadeIn$default(FiniteAnimationSpec finiteAnimationSpec, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
        }
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        return fadeIn(finiteAnimationSpec, f);
    }

    public static final EnterTransition fadeIn(FiniteAnimationSpec<Float> animationSpec, float f) {
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        return new EnterTransitionImpl(new TransitionData(new Fade(f, animationSpec), null, null, null, 14, null));
    }

    public static /* synthetic */ ExitTransition fadeOut$default(FiniteAnimationSpec finiteAnimationSpec, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
        }
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        return fadeOut(finiteAnimationSpec, f);
    }

    public static final ExitTransition fadeOut(FiniteAnimationSpec<Float> animationSpec, float f) {
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        return new ExitTransitionImpl(new TransitionData(new Fade(f, animationSpec), null, null, null, 14, null));
    }

    public static /* synthetic */ EnterTransition slideIn$default(FiniteAnimationSpec finiteAnimationSpec, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m5716boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.Companion)), 1, null);
        }
        return slideIn(finiteAnimationSpec, function1);
    }

    public static final EnterTransition slideIn(FiniteAnimationSpec<IntOffset> animationSpec, Function1<? super IntSize, IntOffset> initialOffset) {
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(initialOffset, "initialOffset");
        return new EnterTransitionImpl(new TransitionData(null, new Slide(initialOffset, animationSpec), null, null, 13, null));
    }

    public static /* synthetic */ ExitTransition slideOut$default(FiniteAnimationSpec finiteAnimationSpec, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m5716boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.Companion)), 1, null);
        }
        return slideOut(finiteAnimationSpec, function1);
    }

    public static final ExitTransition slideOut(FiniteAnimationSpec<IntOffset> animationSpec, Function1<? super IntSize, IntOffset> targetOffset) {
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(targetOffset, "targetOffset");
        return new ExitTransitionImpl(new TransitionData(null, new Slide(targetOffset, animationSpec), null, null, 13, null));
    }

    /* renamed from: scaleIn-L8ZKh-E$default  reason: not valid java name */
    public static /* synthetic */ EnterTransition m304scaleInL8ZKhE$default(FiniteAnimationSpec finiteAnimationSpec, float f, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
        }
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        if ((i & 4) != 0) {
            j = TransformOrigin.Companion.m3682getCenterSzJe1aQ();
        }
        return m303scaleInL8ZKhE(finiteAnimationSpec, f, j);
    }

    /* renamed from: scaleIn-L8ZKh-E  reason: not valid java name */
    public static final EnterTransition m303scaleInL8ZKhE(FiniteAnimationSpec<Float> animationSpec, float f, long j) {
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        return new EnterTransitionImpl(new TransitionData(null, null, null, new Scale(f, j, animationSpec, null), 7, null));
    }

    /* renamed from: scaleOut-L8ZKh-E$default  reason: not valid java name */
    public static /* synthetic */ ExitTransition m306scaleOutL8ZKhE$default(FiniteAnimationSpec finiteAnimationSpec, float f, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
        }
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        if ((i & 4) != 0) {
            j = TransformOrigin.Companion.m3682getCenterSzJe1aQ();
        }
        return m305scaleOutL8ZKhE(finiteAnimationSpec, f, j);
    }

    /* renamed from: scaleOut-L8ZKh-E  reason: not valid java name */
    public static final ExitTransition m305scaleOutL8ZKhE(FiniteAnimationSpec<Float> animationSpec, float f, long j) {
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        return new ExitTransitionImpl(new TransitionData(null, null, null, new Scale(f, j, animationSpec, null), 7, null));
    }

    public static /* synthetic */ EnterTransition expandIn$default(FiniteAnimationSpec finiteAnimationSpec, Alignment alignment, boolean z, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m5759boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.Companion)), 1, null);
        }
        if ((i & 2) != 0) {
            alignment = Alignment.Companion.getBottomEnd();
        }
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            function1 = EnterExitTransitionKt$expandIn$1.INSTANCE;
        }
        return expandIn(finiteAnimationSpec, alignment, z, function1);
    }

    public static final EnterTransition expandIn(FiniteAnimationSpec<IntSize> animationSpec, Alignment expandFrom, boolean z, Function1<? super IntSize, IntSize> initialSize) {
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(expandFrom, "expandFrom");
        Intrinsics.checkNotNullParameter(initialSize, "initialSize");
        return new EnterTransitionImpl(new TransitionData(null, null, new ChangeSize(expandFrom, initialSize, animationSpec, z), null, 11, null));
    }

    public static /* synthetic */ ExitTransition shrinkOut$default(FiniteAnimationSpec finiteAnimationSpec, Alignment alignment, boolean z, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m5759boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.Companion)), 1, null);
        }
        if ((i & 2) != 0) {
            alignment = Alignment.Companion.getBottomEnd();
        }
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            function1 = EnterExitTransitionKt$shrinkOut$1.INSTANCE;
        }
        return shrinkOut(finiteAnimationSpec, alignment, z, function1);
    }

    public static final ExitTransition shrinkOut(FiniteAnimationSpec<IntSize> animationSpec, Alignment shrinkTowards, boolean z, Function1<? super IntSize, IntSize> targetSize) {
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(shrinkTowards, "shrinkTowards");
        Intrinsics.checkNotNullParameter(targetSize, "targetSize");
        return new ExitTransitionImpl(new TransitionData(null, null, new ChangeSize(shrinkTowards, targetSize, animationSpec, z), null, 11, null));
    }

    public static /* synthetic */ EnterTransition expandHorizontally$default(FiniteAnimationSpec finiteAnimationSpec, Alignment.Horizontal horizontal, boolean z, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m5759boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.Companion)), 1, null);
        }
        if ((i & 2) != 0) {
            horizontal = Alignment.Companion.getEnd();
        }
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            function1 = EnterExitTransitionKt$expandHorizontally$1.INSTANCE;
        }
        return expandHorizontally(finiteAnimationSpec, horizontal, z, function1);
    }

    public static final EnterTransition expandHorizontally(FiniteAnimationSpec<IntSize> animationSpec, Alignment.Horizontal expandFrom, boolean z, Function1<? super Integer, Integer> initialWidth) {
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(expandFrom, "expandFrom");
        Intrinsics.checkNotNullParameter(initialWidth, "initialWidth");
        return expandIn(animationSpec, toAlignment(expandFrom), z, new EnterExitTransitionKt$expandHorizontally$2(initialWidth));
    }

    public static /* synthetic */ EnterTransition expandVertically$default(FiniteAnimationSpec finiteAnimationSpec, Alignment.Vertical vertical, boolean z, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m5759boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.Companion)), 1, null);
        }
        if ((i & 2) != 0) {
            vertical = Alignment.Companion.getBottom();
        }
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            function1 = EnterExitTransitionKt$expandVertically$1.INSTANCE;
        }
        return expandVertically(finiteAnimationSpec, vertical, z, function1);
    }

    public static final EnterTransition expandVertically(FiniteAnimationSpec<IntSize> animationSpec, Alignment.Vertical expandFrom, boolean z, Function1<? super Integer, Integer> initialHeight) {
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(expandFrom, "expandFrom");
        Intrinsics.checkNotNullParameter(initialHeight, "initialHeight");
        return expandIn(animationSpec, toAlignment(expandFrom), z, new EnterExitTransitionKt$expandVertically$2(initialHeight));
    }

    public static /* synthetic */ ExitTransition shrinkHorizontally$default(FiniteAnimationSpec finiteAnimationSpec, Alignment.Horizontal horizontal, boolean z, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m5759boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.Companion)), 1, null);
        }
        if ((i & 2) != 0) {
            horizontal = Alignment.Companion.getEnd();
        }
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            function1 = EnterExitTransitionKt$shrinkHorizontally$1.INSTANCE;
        }
        return shrinkHorizontally(finiteAnimationSpec, horizontal, z, function1);
    }

    public static final ExitTransition shrinkHorizontally(FiniteAnimationSpec<IntSize> animationSpec, Alignment.Horizontal shrinkTowards, boolean z, Function1<? super Integer, Integer> targetWidth) {
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(shrinkTowards, "shrinkTowards");
        Intrinsics.checkNotNullParameter(targetWidth, "targetWidth");
        return shrinkOut(animationSpec, toAlignment(shrinkTowards), z, new EnterExitTransitionKt$shrinkHorizontally$2(targetWidth));
    }

    public static /* synthetic */ ExitTransition shrinkVertically$default(FiniteAnimationSpec finiteAnimationSpec, Alignment.Vertical vertical, boolean z, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m5759boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.Companion)), 1, null);
        }
        if ((i & 2) != 0) {
            vertical = Alignment.Companion.getBottom();
        }
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            function1 = EnterExitTransitionKt$shrinkVertically$1.INSTANCE;
        }
        return shrinkVertically(finiteAnimationSpec, vertical, z, function1);
    }

    public static final ExitTransition shrinkVertically(FiniteAnimationSpec<IntSize> animationSpec, Alignment.Vertical shrinkTowards, boolean z, Function1<? super Integer, Integer> targetHeight) {
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(shrinkTowards, "shrinkTowards");
        Intrinsics.checkNotNullParameter(targetHeight, "targetHeight");
        return shrinkOut(animationSpec, toAlignment(shrinkTowards), z, new EnterExitTransitionKt$shrinkVertically$2(targetHeight));
    }

    public static /* synthetic */ EnterTransition slideInHorizontally$default(FiniteAnimationSpec finiteAnimationSpec, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m5716boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.Companion)), 1, null);
        }
        if ((i & 2) != 0) {
            function1 = EnterExitTransitionKt$slideInHorizontally$1.INSTANCE;
        }
        return slideInHorizontally(finiteAnimationSpec, function1);
    }

    public static final EnterTransition slideInHorizontally(FiniteAnimationSpec<IntOffset> animationSpec, Function1<? super Integer, Integer> initialOffsetX) {
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(initialOffsetX, "initialOffsetX");
        return slideIn(animationSpec, new EnterExitTransitionKt$slideInHorizontally$2(initialOffsetX));
    }

    public static /* synthetic */ EnterTransition slideInVertically$default(FiniteAnimationSpec finiteAnimationSpec, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m5716boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.Companion)), 1, null);
        }
        if ((i & 2) != 0) {
            function1 = EnterExitTransitionKt$slideInVertically$1.INSTANCE;
        }
        return slideInVertically(finiteAnimationSpec, function1);
    }

    public static final EnterTransition slideInVertically(FiniteAnimationSpec<IntOffset> animationSpec, Function1<? super Integer, Integer> initialOffsetY) {
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(initialOffsetY, "initialOffsetY");
        return slideIn(animationSpec, new EnterExitTransitionKt$slideInVertically$2(initialOffsetY));
    }

    public static /* synthetic */ ExitTransition slideOutHorizontally$default(FiniteAnimationSpec finiteAnimationSpec, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m5716boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.Companion)), 1, null);
        }
        if ((i & 2) != 0) {
            function1 = EnterExitTransitionKt$slideOutHorizontally$1.INSTANCE;
        }
        return slideOutHorizontally(finiteAnimationSpec, function1);
    }

    public static final ExitTransition slideOutHorizontally(FiniteAnimationSpec<IntOffset> animationSpec, Function1<? super Integer, Integer> targetOffsetX) {
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(targetOffsetX, "targetOffsetX");
        return slideOut(animationSpec, new EnterExitTransitionKt$slideOutHorizontally$2(targetOffsetX));
    }

    public static /* synthetic */ ExitTransition slideOutVertically$default(FiniteAnimationSpec finiteAnimationSpec, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m5716boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.Companion)), 1, null);
        }
        if ((i & 2) != 0) {
            function1 = EnterExitTransitionKt$slideOutVertically$1.INSTANCE;
        }
        return slideOutVertically(finiteAnimationSpec, function1);
    }

    public static final ExitTransition slideOutVertically(FiniteAnimationSpec<IntOffset> animationSpec, Function1<? super Integer, Integer> targetOffsetY) {
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(targetOffsetY, "targetOffsetY");
        return slideOut(animationSpec, new EnterExitTransitionKt$slideOutVertically$2(targetOffsetY));
    }

    private static final Alignment toAlignment(Alignment.Horizontal horizontal) {
        return Intrinsics.areEqual(horizontal, Alignment.Companion.getStart()) ? Alignment.Companion.getCenterStart() : Intrinsics.areEqual(horizontal, Alignment.Companion.getEnd()) ? Alignment.Companion.getCenterEnd() : Alignment.Companion.getCenter();
    }

    private static final Alignment toAlignment(Alignment.Vertical vertical) {
        return Intrinsics.areEqual(vertical, Alignment.Companion.getTop()) ? Alignment.Companion.getTopCenter() : Intrinsics.areEqual(vertical, Alignment.Companion.getBottom()) ? Alignment.Companion.getBottomCenter() : Alignment.Companion.getCenter();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x04ac  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x04be  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0508  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x050b  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0510  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x051c  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0538  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x054a  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0595  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x059a  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x05a6  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x05ff  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0265  */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r33v0, types: [androidx.compose.runtime.Composer, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Modifier createModifier(Transition<EnterExitState> transition, EnterTransition enter, ExitTransition exit, String label, Composer composer, int i) {
        MutableState mutableState;
        MutableState mutableState2;
        String str;
        String str2;
        String str3;
        Modifier modifier;
        int i2;
        TransformOrigin transformOrigin;
        MutableFloatState mutableFloatState;
        Modifier modifier2;
        float f;
        int i3;
        int i4;
        TransformOrigin m3669boximpl;
        int i5;
        TransformOrigin transformOrigin2;
        int i6;
        boolean changed;
        EnterExitTransitionKt$createModifier$1$1 rememberedValue;
        String str4;
        float f2;
        String str5;
        int i7;
        float f3;
        Intrinsics.checkNotNullParameter(transition, "<this>");
        Intrinsics.checkNotNullParameter(enter, "enter");
        Intrinsics.checkNotNullParameter(exit, "exit");
        Intrinsics.checkNotNullParameter(label, "label");
        composer.startReplaceableGroup(914000546);
        ComposerKt.sourceInformation(composer, "C(createModifier)831@36300L38,832@36348L37,836@36443L43,837@36496L42,844@36867L40,845@36938L40:EnterExitTransition.kt#xbi5r1");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(914000546, i, -1, "androidx.compose.animation.createModifier (EnterExitTransition.kt:819)");
        }
        Modifier shrinkExpand = shrinkExpand(slideInOut(Modifier.Companion, transition, SnapshotStateKt.rememberUpdatedState(enter.getData$animation_release().getSlide(), composer, 0), SnapshotStateKt.rememberUpdatedState(exit.getData$animation_release().getSlide(), composer, 0), label), transition, SnapshotStateKt.rememberUpdatedState(enter.getData$animation_release().getChangeSize(), composer, 0), SnapshotStateKt.rememberUpdatedState(exit.getData$animation_release().getChangeSize(), composer, 0), label);
        int i8 = i & 14;
        composer.startReplaceableGroup(1157296644);
        ComposerKt.sourceInformation(composer, "CC(remember)P(1):Composables.kt#9igjgp");
        boolean changed2 = composer.changed(transition);
        Object rememberedValue2 = composer.rememberedValue();
        if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        MutableState mutableState3 = rememberedValue2;
        composer.startReplaceableGroup(1157296644);
        ComposerKt.sourceInformation(composer, "CC(remember)P(1):Composables.kt#9igjgp");
        boolean changed3 = composer.changed(transition);
        Object rememberedValue3 = composer.rememberedValue();
        if (changed3 || rememberedValue3 == Composer.Companion.getEmpty()) {
            rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
            composer.updateRememberedValue(rememberedValue3);
        }
        composer.endReplaceableGroup();
        MutableState mutableState4 = (MutableState) rememberedValue3;
        if (transition.getCurrentState() != transition.getTargetState() || transition.isSeeking()) {
            if (enter.getData$animation_release().getFade() != null || exit.getData$animation_release().getFade() != null) {
                createModifier$lambda$2(mutableState3, true);
            }
            if (enter.getData$animation_release().getScale() != null || exit.getData$animation_release().getScale() != null) {
                createModifier$lambda$5(mutableState4, true);
            }
        } else {
            createModifier$lambda$2(mutableState3, false);
            createModifier$lambda$5(mutableState4, false);
        }
        composer.startReplaceableGroup(1657241561);
        ComposerKt.sourceInformation(composer, "869@37922L27,859@37401L796");
        float f4 = 1.0f;
        if (createModifier$lambda$1(mutableState3)) {
            EnterExitTransitionKt$createModifier$alpha$2 enterExitTransitionKt$createModifier$alpha$2 = new EnterExitTransitionKt$createModifier$alpha$2(enter, exit);
            composer.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(composer, "CC(remember):Composables.kt#9igjgp");
            Object rememberedValue4 = composer.rememberedValue();
            if (rememberedValue4 == Composer.Companion.getEmpty()) {
                rememberedValue4 = label + " alpha";
                composer.updateRememberedValue(rememberedValue4);
            }
            composer.endReplaceableGroup();
            String str6 = (String) rememberedValue4;
            int i9 = i8 | 384;
            composer.startReplaceableGroup(-1338768149);
            ComposerKt.sourceInformation(composer, "CC(animateFloat)P(2)939@37552L78:Transition.kt#pdpnli");
            TwoWayConverter<Float, AnimationVector1D> vectorConverter = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
            int i10 = i9 & 14;
            int i11 = i9 << 3;
            int i12 = i10 | (i11 & 896) | (i11 & 7168) | (i11 & 57344);
            composer.startReplaceableGroup(-142660079);
            ComposerKt.sourceInformation(composer, "CC(animateValue)P(3,2)857@34142L32,858@34197L31,859@34253L23,861@34289L89:Transition.kt#pdpnli");
            int i13 = (i12 >> 9) & 112;
            EnterExitState currentState = transition.getCurrentState();
            composer.startReplaceableGroup(755689166);
            ComposerKt.sourceInformation(composer, "C:EnterExitTransition.kt#xbi5r1");
            if (ComposerKt.isTraceInProgress()) {
                str4 = "CC(remember)P(1):Composables.kt#9igjgp";
                ComposerKt.traceEventStart(755689166, i13, -1, "androidx.compose.animation.createModifier.<anonymous> (EnterExitTransition.kt:870)");
            } else {
                str4 = "CC(remember)P(1):Composables.kt#9igjgp";
            }
            int i14 = WhenMappings.$EnumSwitchMapping$0[currentState.ordinal()];
            if (i14 != 1) {
                if (i14 == 2) {
                    Fade fade = enter.getData$animation_release().getFade();
                    if (fade != null) {
                        f2 = fade.getAlpha();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        composer.endReplaceableGroup();
                        Float valueOf = Float.valueOf(f2);
                        EnterExitState targetState = transition.getTargetState();
                        composer.startReplaceableGroup(755689166);
                        ComposerKt.sourceInformation(composer, "C:EnterExitTransition.kt#xbi5r1");
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        i7 = WhenMappings.$EnumSwitchMapping$0[targetState.ordinal()];
                        if (i7 != 1) {
                        }
                        f3 = 1.0f;
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        composer.endReplaceableGroup();
                        mutableState = mutableState4;
                        mutableState2 = mutableState3;
                        modifier = shrinkExpand;
                        i2 = -142660079;
                        str = "CC(animateValue)P(3,2)857@34142L32,858@34197L31,859@34253L23,861@34289L89:Transition.kt#pdpnli";
                        transformOrigin = null;
                        str2 = str5;
                        str3 = str4;
                        mutableFloatState = androidx.compose.animation.core.TransitionKt.createTransitionAnimation(transition, valueOf, Float.valueOf(f3), enterExitTransitionKt$createModifier$alpha$2.invoke((EnterExitTransitionKt$createModifier$alpha$2) transition.getSegment(), (Transition.Segment<EnterExitState>) composer, (??) Integer.valueOf((i12 >> 3) & 112)), vectorConverter, str6, composer, (i12 & 14) | ((i12 << 9) & 57344) | ((i12 << 6) & 458752));
                        composer.endReplaceableGroup();
                        composer.endReplaceableGroup();
                    }
                } else if (i14 != 3) {
                    throw new NoWhenBranchMatchedException();
                } else {
                    Fade fade2 = exit.getData$animation_release().getFade();
                    if (fade2 != null) {
                        f2 = fade2.getAlpha();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer.endReplaceableGroup();
                        Float valueOf2 = Float.valueOf(f2);
                        EnterExitState targetState2 = transition.getTargetState();
                        composer.startReplaceableGroup(755689166);
                        ComposerKt.sourceInformation(composer, "C:EnterExitTransition.kt#xbi5r1");
                        if (ComposerKt.isTraceInProgress()) {
                            str5 = "C:EnterExitTransition.kt#xbi5r1";
                            ComposerKt.traceEventStart(755689166, i13, -1, "androidx.compose.animation.createModifier.<anonymous> (EnterExitTransition.kt:870)");
                        } else {
                            str5 = "C:EnterExitTransition.kt#xbi5r1";
                        }
                        i7 = WhenMappings.$EnumSwitchMapping$0[targetState2.ordinal()];
                        if (i7 != 1) {
                            if (i7 == 2) {
                                Fade fade3 = enter.getData$animation_release().getFade();
                                if (fade3 != null) {
                                    f3 = fade3.getAlpha();
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    composer.endReplaceableGroup();
                                    mutableState = mutableState4;
                                    mutableState2 = mutableState3;
                                    modifier = shrinkExpand;
                                    i2 = -142660079;
                                    str = "CC(animateValue)P(3,2)857@34142L32,858@34197L31,859@34253L23,861@34289L89:Transition.kt#pdpnli";
                                    transformOrigin = null;
                                    str2 = str5;
                                    str3 = str4;
                                    mutableFloatState = androidx.compose.animation.core.TransitionKt.createTransitionAnimation(transition, valueOf2, Float.valueOf(f3), enterExitTransitionKt$createModifier$alpha$2.invoke((EnterExitTransitionKt$createModifier$alpha$2) transition.getSegment(), (Transition.Segment<EnterExitState>) composer, (??) Integer.valueOf((i12 >> 3) & 112)), vectorConverter, str6, composer, (i12 & 14) | ((i12 << 9) & 57344) | ((i12 << 6) & 458752));
                                    composer.endReplaceableGroup();
                                    composer.endReplaceableGroup();
                                }
                            } else if (i7 != 3) {
                                throw new NoWhenBranchMatchedException();
                            } else {
                                Fade fade4 = exit.getData$animation_release().getFade();
                                if (fade4 != null) {
                                    f3 = fade4.getAlpha();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    composer.endReplaceableGroup();
                                    mutableState = mutableState4;
                                    mutableState2 = mutableState3;
                                    modifier = shrinkExpand;
                                    i2 = -142660079;
                                    str = "CC(animateValue)P(3,2)857@34142L32,858@34197L31,859@34253L23,861@34289L89:Transition.kt#pdpnli";
                                    transformOrigin = null;
                                    str2 = str5;
                                    str3 = str4;
                                    mutableFloatState = androidx.compose.animation.core.TransitionKt.createTransitionAnimation(transition, valueOf2, Float.valueOf(f3), enterExitTransitionKt$createModifier$alpha$2.invoke((EnterExitTransitionKt$createModifier$alpha$2) transition.getSegment(), (Transition.Segment<EnterExitState>) composer, (??) Integer.valueOf((i12 >> 3) & 112)), vectorConverter, str6, composer, (i12 & 14) | ((i12 << 9) & 57344) | ((i12 << 6) & 458752));
                                    composer.endReplaceableGroup();
                                    composer.endReplaceableGroup();
                                }
                            }
                        }
                        f3 = 1.0f;
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        composer.endReplaceableGroup();
                        mutableState = mutableState4;
                        mutableState2 = mutableState3;
                        modifier = shrinkExpand;
                        i2 = -142660079;
                        str = "CC(animateValue)P(3,2)857@34142L32,858@34197L31,859@34253L23,861@34289L89:Transition.kt#pdpnli";
                        transformOrigin = null;
                        str2 = str5;
                        str3 = str4;
                        mutableFloatState = androidx.compose.animation.core.TransitionKt.createTransitionAnimation(transition, valueOf2, Float.valueOf(f3), enterExitTransitionKt$createModifier$alpha$2.invoke((EnterExitTransitionKt$createModifier$alpha$2) transition.getSegment(), (Transition.Segment<EnterExitState>) composer, (??) Integer.valueOf((i12 >> 3) & 112)), vectorConverter, str6, composer, (i12 & 14) | ((i12 << 9) & 57344) | ((i12 << 6) & 458752));
                        composer.endReplaceableGroup();
                        composer.endReplaceableGroup();
                    }
                }
            }
            f2 = 1.0f;
            if (ComposerKt.isTraceInProgress()) {
            }
            composer.endReplaceableGroup();
            Float valueOf22 = Float.valueOf(f2);
            EnterExitState targetState22 = transition.getTargetState();
            composer.startReplaceableGroup(755689166);
            ComposerKt.sourceInformation(composer, "C:EnterExitTransition.kt#xbi5r1");
            if (ComposerKt.isTraceInProgress()) {
            }
            i7 = WhenMappings.$EnumSwitchMapping$0[targetState22.ordinal()];
            if (i7 != 1) {
            }
            f3 = 1.0f;
            if (ComposerKt.isTraceInProgress()) {
            }
            composer.endReplaceableGroup();
            mutableState = mutableState4;
            mutableState2 = mutableState3;
            modifier = shrinkExpand;
            i2 = -142660079;
            str = "CC(animateValue)P(3,2)857@34142L32,858@34197L31,859@34253L23,861@34289L89:Transition.kt#pdpnli";
            transformOrigin = null;
            str2 = str5;
            str3 = str4;
            mutableFloatState = androidx.compose.animation.core.TransitionKt.createTransitionAnimation(transition, valueOf22, Float.valueOf(f3), enterExitTransitionKt$createModifier$alpha$2.invoke((EnterExitTransitionKt$createModifier$alpha$2) transition.getSegment(), (Transition.Segment<EnterExitState>) composer, (??) Integer.valueOf((i12 >> 3) & 112)), vectorConverter, str6, composer, (i12 & 14) | ((i12 << 9) & 57344) | ((i12 << 6) & 458752));
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
        } else {
            mutableState = mutableState4;
            mutableState2 = mutableState3;
            str = "CC(animateValue)P(3,2)857@34142L32,858@34197L31,859@34253L23,861@34289L89:Transition.kt#pdpnli";
            str2 = "C:EnterExitTransition.kt#xbi5r1";
            str3 = "CC(remember)P(1):Composables.kt#9igjgp";
            modifier = shrinkExpand;
            i2 = -142660079;
            transformOrigin = null;
            mutableFloatState = DefaultAlpha;
        }
        State state = mutableFloatState;
        composer.endReplaceableGroup();
        if (createModifier$lambda$4(mutableState)) {
            composer.startReplaceableGroup(1657242461);
            ComposerKt.sourceInformation(composer, "892@38813L27,882@38290L800,908@39583L536,921@40163L157");
            EnterExitTransitionKt$createModifier$scale$2 enterExitTransitionKt$createModifier$scale$2 = new EnterExitTransitionKt$createModifier$scale$2(enter, exit);
            composer.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(composer, "CC(remember):Composables.kt#9igjgp");
            Object rememberedValue5 = composer.rememberedValue();
            if (rememberedValue5 == Composer.Companion.getEmpty()) {
                rememberedValue5 = label + " scale";
                composer.updateRememberedValue(rememberedValue5);
            }
            composer.endReplaceableGroup();
            String str7 = (String) rememberedValue5;
            int i15 = i8 | 384;
            composer.startReplaceableGroup(-1338768149);
            ComposerKt.sourceInformation(composer, "CC(animateFloat)P(2)939@37552L78:Transition.kt#pdpnli");
            TwoWayConverter<Float, AnimationVector1D> vectorConverter2 = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
            int i16 = i15 & 14;
            int i17 = i15 << 3;
            int i18 = (i17 & 57344) | i16 | (i17 & 896) | (i17 & 7168);
            composer.startReplaceableGroup(i2);
            String str8 = str;
            ComposerKt.sourceInformation(composer, str8);
            int i19 = (i18 >> 9) & 112;
            EnterExitState currentState2 = transition.getCurrentState();
            composer.startReplaceableGroup(-596129937);
            ComposerKt.sourceInformation(composer, str2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-596129937, i19, -1, "androidx.compose.animation.createModifier.<anonymous> (EnterExitTransition.kt:893)");
            }
            int i20 = WhenMappings.$EnumSwitchMapping$0[currentState2.ordinal()];
            if (i20 != 1) {
                if (i20 == 2) {
                    Scale scale = enter.getData$animation_release().getScale();
                    if (scale != null) {
                        f = scale.getScale();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        composer.endReplaceableGroup();
                        Float valueOf3 = Float.valueOf(f);
                        EnterExitState targetState3 = transition.getTargetState();
                        composer.startReplaceableGroup(-596129937);
                        ComposerKt.sourceInformation(composer, str2);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        i3 = WhenMappings.$EnumSwitchMapping$0[targetState3.ordinal()];
                        if (i3 != 1) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        composer.endReplaceableGroup();
                        int i21 = i4;
                        State createTransitionAnimation = androidx.compose.animation.core.TransitionKt.createTransitionAnimation(transition, valueOf3, Float.valueOf(f4), enterExitTransitionKt$createModifier$scale$2.invoke((EnterExitTransitionKt$createModifier$scale$2) transition.getSegment(), (Transition.Segment<EnterExitState>) composer, (??) Integer.valueOf((i18 >> 3) & 112)), vectorConverter2, str7, composer, (i18 & 14) | ((i18 << 9) & 57344) | ((i18 << 6) & 458752));
                        composer.endReplaceableGroup();
                        composer.endReplaceableGroup();
                        if (transition.getCurrentState() == EnterExitState.PreEnter) {
                        }
                    }
                } else if (i20 != 3) {
                    throw new NoWhenBranchMatchedException();
                } else {
                    Scale scale2 = exit.getData$animation_release().getScale();
                    if (scale2 != null) {
                        f = scale2.getScale();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer.endReplaceableGroup();
                        Float valueOf32 = Float.valueOf(f);
                        EnterExitState targetState32 = transition.getTargetState();
                        composer.startReplaceableGroup(-596129937);
                        ComposerKt.sourceInformation(composer, str2);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-596129937, i19, -1, "androidx.compose.animation.createModifier.<anonymous> (EnterExitTransition.kt:893)");
                        }
                        i3 = WhenMappings.$EnumSwitchMapping$0[targetState32.ordinal()];
                        if (i3 != 1) {
                            i4 = 2;
                            if (i3 == 2) {
                                Scale scale3 = enter.getData$animation_release().getScale();
                                if (scale3 != null) {
                                    f4 = scale3.getScale();
                                }
                            } else if (i3 != 3) {
                                throw new NoWhenBranchMatchedException();
                            } else {
                                Scale scale4 = exit.getData$animation_release().getScale();
                                if (scale4 != null) {
                                    f4 = scale4.getScale();
                                }
                            }
                        } else {
                            i4 = 2;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer.endReplaceableGroup();
                        int i212 = i4;
                        State createTransitionAnimation2 = androidx.compose.animation.core.TransitionKt.createTransitionAnimation(transition, valueOf32, Float.valueOf(f4), enterExitTransitionKt$createModifier$scale$2.invoke((EnterExitTransitionKt$createModifier$scale$2) transition.getSegment(), (Transition.Segment<EnterExitState>) composer, (??) Integer.valueOf((i18 >> 3) & 112)), vectorConverter2, str7, composer, (i18 & 14) | ((i18 << 9) & 57344) | ((i18 << 6) & 458752));
                        composer.endReplaceableGroup();
                        composer.endReplaceableGroup();
                        if (transition.getCurrentState() == EnterExitState.PreEnter) {
                            Scale scale5 = enter.getData$animation_release().getScale();
                            if (scale5 != null || (scale5 = exit.getData$animation_release().getScale()) != null) {
                                m3669boximpl = TransformOrigin.m3669boximpl(scale5.m326getTransformOriginSzJe1aQ());
                                TwoWayConverter<TransformOrigin, AnimationVector2D> twoWayConverter = TransformOriginVectorConverter;
                                int i22 = i8 | 3136;
                                composer.startReplaceableGroup(-142660079);
                                ComposerKt.sourceInformation(composer, str8);
                                EnterExitTransitionKt$createModifier$$inlined$animateValue$1 enterExitTransitionKt$createModifier$$inlined$animateValue$1 = EnterExitTransitionKt$createModifier$$inlined$animateValue$1.INSTANCE;
                                int i23 = (i22 >> 9) & 112;
                                EnterExitState currentState3 = transition.getCurrentState();
                                composer.startReplaceableGroup(-288165413);
                                ComposerKt.sourceInformation(composer, str2);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-288165413, i23, -1, "androidx.compose.animation.createModifier.<anonymous> (EnterExitTransition.kt:911)");
                                }
                                i5 = WhenMappings.$EnumSwitchMapping$0[currentState3.ordinal()];
                                if (i5 != 1) {
                                    transformOrigin2 = m3669boximpl;
                                } else if (i5 == i212) {
                                    Scale scale6 = enter.getData$animation_release().getScale();
                                    if (scale6 != null || (scale6 = exit.getData$animation_release().getScale()) != null) {
                                        transformOrigin2 = TransformOrigin.m3669boximpl(scale6.m326getTransformOriginSzJe1aQ());
                                    }
                                    transformOrigin2 = transformOrigin;
                                } else if (i5 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                } else {
                                    Scale scale7 = exit.getData$animation_release().getScale();
                                    if (scale7 != null || (scale7 = enter.getData$animation_release().getScale()) != null) {
                                        transformOrigin2 = TransformOrigin.m3669boximpl(scale7.m326getTransformOriginSzJe1aQ());
                                    }
                                    transformOrigin2 = transformOrigin;
                                }
                                long m3681unboximpl = transformOrigin2 == null ? transformOrigin2.m3681unboximpl() : TransformOrigin.Companion.m3682getCenterSzJe1aQ();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                composer.endReplaceableGroup();
                                TransformOrigin m3669boximpl2 = TransformOrigin.m3669boximpl(m3681unboximpl);
                                EnterExitState targetState4 = transition.getTargetState();
                                composer.startReplaceableGroup(-288165413);
                                ComposerKt.sourceInformation(composer, str2);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-288165413, i23, -1, "androidx.compose.animation.createModifier.<anonymous> (EnterExitTransition.kt:911)");
                                }
                                i6 = WhenMappings.$EnumSwitchMapping$0[targetState4.ordinal()];
                                if (i6 != 1) {
                                    if (i6 == i212) {
                                        Scale scale8 = enter.getData$animation_release().getScale();
                                        if (scale8 != null || (scale8 = exit.getData$animation_release().getScale()) != null) {
                                            m3669boximpl = TransformOrigin.m3669boximpl(scale8.m326getTransformOriginSzJe1aQ());
                                        }
                                        m3669boximpl = transformOrigin;
                                    } else if (i6 != 3) {
                                        throw new NoWhenBranchMatchedException();
                                    } else {
                                        Scale scale9 = exit.getData$animation_release().getScale();
                                        if (scale9 != null || (scale9 = enter.getData$animation_release().getScale()) != null) {
                                            m3669boximpl = TransformOrigin.m3669boximpl(scale9.m326getTransformOriginSzJe1aQ());
                                        }
                                        m3669boximpl = transformOrigin;
                                    }
                                }
                                long m3681unboximpl2 = m3669boximpl == null ? m3669boximpl.m3681unboximpl() : TransformOrigin.Companion.m3682getCenterSzJe1aQ();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                composer.endReplaceableGroup();
                                State createTransitionAnimation3 = androidx.compose.animation.core.TransitionKt.createTransitionAnimation(transition, m3669boximpl2, TransformOrigin.m3669boximpl(m3681unboximpl2), enterExitTransitionKt$createModifier$$inlined$animateValue$1.invoke((EnterExitTransitionKt$createModifier$$inlined$animateValue$1) transition.getSegment(), (Transition.Segment<EnterExitState>) composer, (??) Integer.valueOf((i22 >> 3) & 112)), twoWayConverter, "TransformOriginInterruptionHandling", composer, (i22 & 14) | ((i22 << 9) & 57344) | ((i22 << 6) & 458752));
                                composer.endReplaceableGroup();
                                composer.startReplaceableGroup(1618982084);
                                ComposerKt.sourceInformation(composer, "CC(remember)P(1,2,3):Composables.kt#9igjgp");
                                changed = composer.changed(state) | composer.changed(createTransitionAnimation2) | composer.changed(createTransitionAnimation3);
                                rememberedValue = composer.rememberedValue();
                                if (!changed || rememberedValue == Composer.Companion.getEmpty()) {
                                    rememberedValue = new EnterExitTransitionKt$createModifier$1$1(state, createTransitionAnimation2, createTransitionAnimation3);
                                    composer.updateRememberedValue(rememberedValue);
                                }
                                composer.endReplaceableGroup();
                                modifier2 = GraphicsLayerModifierKt.graphicsLayer(modifier, (Function1) rememberedValue);
                                composer.endReplaceableGroup();
                            }
                            m3669boximpl = transformOrigin;
                            TwoWayConverter<TransformOrigin, AnimationVector2D> twoWayConverter2 = TransformOriginVectorConverter;
                            int i222 = i8 | 3136;
                            composer.startReplaceableGroup(-142660079);
                            ComposerKt.sourceInformation(composer, str8);
                            EnterExitTransitionKt$createModifier$$inlined$animateValue$1 enterExitTransitionKt$createModifier$$inlined$animateValue$12 = EnterExitTransitionKt$createModifier$$inlined$animateValue$1.INSTANCE;
                            int i232 = (i222 >> 9) & 112;
                            EnterExitState currentState32 = transition.getCurrentState();
                            composer.startReplaceableGroup(-288165413);
                            ComposerKt.sourceInformation(composer, str2);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            i5 = WhenMappings.$EnumSwitchMapping$0[currentState32.ordinal()];
                            if (i5 != 1) {
                            }
                            if (transformOrigin2 == null) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            composer.endReplaceableGroup();
                            TransformOrigin m3669boximpl22 = TransformOrigin.m3669boximpl(m3681unboximpl);
                            EnterExitState targetState42 = transition.getTargetState();
                            composer.startReplaceableGroup(-288165413);
                            ComposerKt.sourceInformation(composer, str2);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            i6 = WhenMappings.$EnumSwitchMapping$0[targetState42.ordinal()];
                            if (i6 != 1) {
                            }
                            if (m3669boximpl == null) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            composer.endReplaceableGroup();
                            State createTransitionAnimation32 = androidx.compose.animation.core.TransitionKt.createTransitionAnimation(transition, m3669boximpl22, TransformOrigin.m3669boximpl(m3681unboximpl2), enterExitTransitionKt$createModifier$$inlined$animateValue$12.invoke((EnterExitTransitionKt$createModifier$$inlined$animateValue$1) transition.getSegment(), (Transition.Segment<EnterExitState>) composer, (??) Integer.valueOf((i222 >> 3) & 112)), twoWayConverter2, "TransformOriginInterruptionHandling", composer, (i222 & 14) | ((i222 << 9) & 57344) | ((i222 << 6) & 458752));
                            composer.endReplaceableGroup();
                            composer.startReplaceableGroup(1618982084);
                            ComposerKt.sourceInformation(composer, "CC(remember)P(1,2,3):Composables.kt#9igjgp");
                            changed = composer.changed(state) | composer.changed(createTransitionAnimation2) | composer.changed(createTransitionAnimation32);
                            rememberedValue = composer.rememberedValue();
                            if (!changed) {
                            }
                            rememberedValue = new EnterExitTransitionKt$createModifier$1$1(state, createTransitionAnimation2, createTransitionAnimation32);
                            composer.updateRememberedValue(rememberedValue);
                            composer.endReplaceableGroup();
                            modifier2 = GraphicsLayerModifierKt.graphicsLayer(modifier, (Function1) rememberedValue);
                            composer.endReplaceableGroup();
                        } else {
                            Scale scale10 = exit.getData$animation_release().getScale();
                            if (scale10 != null || (scale10 = enter.getData$animation_release().getScale()) != null) {
                                m3669boximpl = TransformOrigin.m3669boximpl(scale10.m326getTransformOriginSzJe1aQ());
                                TwoWayConverter<TransformOrigin, AnimationVector2D> twoWayConverter22 = TransformOriginVectorConverter;
                                int i2222 = i8 | 3136;
                                composer.startReplaceableGroup(-142660079);
                                ComposerKt.sourceInformation(composer, str8);
                                EnterExitTransitionKt$createModifier$$inlined$animateValue$1 enterExitTransitionKt$createModifier$$inlined$animateValue$122 = EnterExitTransitionKt$createModifier$$inlined$animateValue$1.INSTANCE;
                                int i2322 = (i2222 >> 9) & 112;
                                EnterExitState currentState322 = transition.getCurrentState();
                                composer.startReplaceableGroup(-288165413);
                                ComposerKt.sourceInformation(composer, str2);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                i5 = WhenMappings.$EnumSwitchMapping$0[currentState322.ordinal()];
                                if (i5 != 1) {
                                }
                                if (transformOrigin2 == null) {
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                composer.endReplaceableGroup();
                                TransformOrigin m3669boximpl222 = TransformOrigin.m3669boximpl(m3681unboximpl);
                                EnterExitState targetState422 = transition.getTargetState();
                                composer.startReplaceableGroup(-288165413);
                                ComposerKt.sourceInformation(composer, str2);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                i6 = WhenMappings.$EnumSwitchMapping$0[targetState422.ordinal()];
                                if (i6 != 1) {
                                }
                                if (m3669boximpl == null) {
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                composer.endReplaceableGroup();
                                State createTransitionAnimation322 = androidx.compose.animation.core.TransitionKt.createTransitionAnimation(transition, m3669boximpl222, TransformOrigin.m3669boximpl(m3681unboximpl2), enterExitTransitionKt$createModifier$$inlined$animateValue$122.invoke((EnterExitTransitionKt$createModifier$$inlined$animateValue$1) transition.getSegment(), (Transition.Segment<EnterExitState>) composer, (??) Integer.valueOf((i2222 >> 3) & 112)), twoWayConverter22, "TransformOriginInterruptionHandling", composer, (i2222 & 14) | ((i2222 << 9) & 57344) | ((i2222 << 6) & 458752));
                                composer.endReplaceableGroup();
                                composer.startReplaceableGroup(1618982084);
                                ComposerKt.sourceInformation(composer, "CC(remember)P(1,2,3):Composables.kt#9igjgp");
                                changed = composer.changed(state) | composer.changed(createTransitionAnimation2) | composer.changed(createTransitionAnimation322);
                                rememberedValue = composer.rememberedValue();
                                if (!changed) {
                                }
                                rememberedValue = new EnterExitTransitionKt$createModifier$1$1(state, createTransitionAnimation2, createTransitionAnimation322);
                                composer.updateRememberedValue(rememberedValue);
                                composer.endReplaceableGroup();
                                modifier2 = GraphicsLayerModifierKt.graphicsLayer(modifier, (Function1) rememberedValue);
                                composer.endReplaceableGroup();
                            }
                            m3669boximpl = transformOrigin;
                            TwoWayConverter<TransformOrigin, AnimationVector2D> twoWayConverter222 = TransformOriginVectorConverter;
                            int i22222 = i8 | 3136;
                            composer.startReplaceableGroup(-142660079);
                            ComposerKt.sourceInformation(composer, str8);
                            EnterExitTransitionKt$createModifier$$inlined$animateValue$1 enterExitTransitionKt$createModifier$$inlined$animateValue$1222 = EnterExitTransitionKt$createModifier$$inlined$animateValue$1.INSTANCE;
                            int i23222 = (i22222 >> 9) & 112;
                            EnterExitState currentState3222 = transition.getCurrentState();
                            composer.startReplaceableGroup(-288165413);
                            ComposerKt.sourceInformation(composer, str2);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            i5 = WhenMappings.$EnumSwitchMapping$0[currentState3222.ordinal()];
                            if (i5 != 1) {
                            }
                            if (transformOrigin2 == null) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            composer.endReplaceableGroup();
                            TransformOrigin m3669boximpl2222 = TransformOrigin.m3669boximpl(m3681unboximpl);
                            EnterExitState targetState4222 = transition.getTargetState();
                            composer.startReplaceableGroup(-288165413);
                            ComposerKt.sourceInformation(composer, str2);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            i6 = WhenMappings.$EnumSwitchMapping$0[targetState4222.ordinal()];
                            if (i6 != 1) {
                            }
                            if (m3669boximpl == null) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            composer.endReplaceableGroup();
                            State createTransitionAnimation3222 = androidx.compose.animation.core.TransitionKt.createTransitionAnimation(transition, m3669boximpl2222, TransformOrigin.m3669boximpl(m3681unboximpl2), enterExitTransitionKt$createModifier$$inlined$animateValue$1222.invoke((EnterExitTransitionKt$createModifier$$inlined$animateValue$1) transition.getSegment(), (Transition.Segment<EnterExitState>) composer, (??) Integer.valueOf((i22222 >> 3) & 112)), twoWayConverter222, "TransformOriginInterruptionHandling", composer, (i22222 & 14) | ((i22222 << 9) & 57344) | ((i22222 << 6) & 458752));
                            composer.endReplaceableGroup();
                            composer.startReplaceableGroup(1618982084);
                            ComposerKt.sourceInformation(composer, "CC(remember)P(1,2,3):Composables.kt#9igjgp");
                            changed = composer.changed(state) | composer.changed(createTransitionAnimation2) | composer.changed(createTransitionAnimation3222);
                            rememberedValue = composer.rememberedValue();
                            if (!changed) {
                            }
                            rememberedValue = new EnterExitTransitionKt$createModifier$1$1(state, createTransitionAnimation2, createTransitionAnimation3222);
                            composer.updateRememberedValue(rememberedValue);
                            composer.endReplaceableGroup();
                            modifier2 = GraphicsLayerModifierKt.graphicsLayer(modifier, (Function1) rememberedValue);
                            composer.endReplaceableGroup();
                        }
                    }
                }
            }
            f = 1.0f;
            if (ComposerKt.isTraceInProgress()) {
            }
            composer.endReplaceableGroup();
            Float valueOf322 = Float.valueOf(f);
            EnterExitState targetState322 = transition.getTargetState();
            composer.startReplaceableGroup(-596129937);
            ComposerKt.sourceInformation(composer, str2);
            if (ComposerKt.isTraceInProgress()) {
            }
            i3 = WhenMappings.$EnumSwitchMapping$0[targetState322.ordinal()];
            if (i3 != 1) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            composer.endReplaceableGroup();
            int i2122 = i4;
            State createTransitionAnimation22 = androidx.compose.animation.core.TransitionKt.createTransitionAnimation(transition, valueOf322, Float.valueOf(f4), enterExitTransitionKt$createModifier$scale$2.invoke((EnterExitTransitionKt$createModifier$scale$2) transition.getSegment(), (Transition.Segment<EnterExitState>) composer, (??) Integer.valueOf((i18 >> 3) & 112)), vectorConverter2, str7, composer, (i18 & 14) | ((i18 << 9) & 57344) | ((i18 << 6) & 458752));
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            if (transition.getCurrentState() == EnterExitState.PreEnter) {
            }
        } else {
            Modifier modifier3 = modifier;
            if (createModifier$lambda$1(mutableState2)) {
                composer.startReplaceableGroup(1657244550);
                ComposerKt.sourceInformation(composer, "928@40400L42");
                composer.startReplaceableGroup(1157296644);
                ComposerKt.sourceInformation(composer, str3);
                boolean changed4 = composer.changed(state);
                EnterExitTransitionKt$createModifier$2$1 rememberedValue6 = composer.rememberedValue();
                if (changed4 || rememberedValue6 == Composer.Companion.getEmpty()) {
                    rememberedValue6 = new EnterExitTransitionKt$createModifier$2$1(state);
                    composer.updateRememberedValue(rememberedValue6);
                }
                composer.endReplaceableGroup();
                modifier2 = GraphicsLayerModifierKt.graphicsLayer(modifier3, (Function1) rememberedValue6);
                composer.endReplaceableGroup();
            } else {
                composer.startReplaceableGroup(1657244642);
                composer.endReplaceableGroup();
                modifier2 = modifier3;
            }
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return modifier2;
    }

    private static final boolean createModifier$lambda$1(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void createModifier$lambda$2(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean createModifier$lambda$4(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void createModifier$lambda$5(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final Modifier slideInOut(Modifier modifier, Transition<EnterExitState> transition, State<Slide> state, State<Slide> state2, String str) {
        return ComposedModifierKt.composed$default(modifier, null, new EnterExitTransitionKt$slideInOut$1(transition, state, state2, str), 1, null);
    }

    private static final Modifier shrinkExpand(Modifier modifier, Transition<EnterExitState> transition, State<ChangeSize> state, State<ChangeSize> state2, String str) {
        return ComposedModifierKt.composed$default(modifier, null, new EnterExitTransitionKt$shrinkExpand$1(transition, state, state2, str), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float createModifier$lambda$8(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float createModifier$lambda$11(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long createModifier$lambda$13(State<TransformOrigin> state) {
        return state.getValue().m3681unboximpl();
    }
}
