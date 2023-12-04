package androidx.compose.material;

import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.HoverableKt;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.ProgressSemanticsKt;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.ripple.RippleKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.util.MathHelpersKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.ifriend.keychain.cipherStorage.CipherStorageKeystoreRsaEcb;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.RangesKt;
/* compiled from: Slider.kt */
@Metadata(d1 = {"\u0000\u009e\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aS\u0010\u0011\u001a\u00020\u00122\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u00162\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u00192\u0006\u0010\u001a\u001a\u00020\bH\u0003¢\u0006\u0002\u0010\u001b\u001a\u007f\u0010\u001c\u001a\u00020\u00122\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\b0\u00162\u0018\u0010\u001d\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0016\u0012\u0004\u0012\u00020\u00120\u00142\b\b\u0002\u0010\u001e\u001a\u00020\u00012\b\b\u0002\u0010\u001f\u001a\u00020 2\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u00162\b\b\u0002\u0010!\u001a\u00020\"2\u0010\b\u0002\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010$2\b\b\u0002\u0010%\u001a\u00020&H\u0007¢\u0006\u0002\u0010'\u001ak\u0010(\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010)\u001a\u00020\b2\u0006\u0010*\u001a\u00020\b2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\b0,2\u0006\u0010%\u001a\u00020&2\u0006\u0010-\u001a\u00020\b2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020/2\u0006\u0010\u001e\u001a\u00020\u00012\u0006\u00101\u001a\u00020\u00012\u0006\u00102\u001a\u00020\u0001H\u0003¢\u0006\u0002\u00103\u001a}\u00104\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\b2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00120\u00142\b\b\u0002\u0010\u001e\u001a\u00020\u00012\b\b\u0002\u0010\u001f\u001a\u00020 2\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u00162\b\b\u0002\u0010!\u001a\u00020\"2\u0010\b\u0002\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010$2\b\b\u0002\u00105\u001a\u00020/2\b\b\u0002\u0010%\u001a\u00020&H\u0007¢\u0006\u0002\u00106\u001aK\u00107\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020 2\u0006\u00108\u001a\u00020\b2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\b0,2\u0006\u0010%\u001a\u00020&2\u0006\u0010-\u001a\u00020\b2\u0006\u00105\u001a\u00020/2\u0006\u0010\u001e\u001a\u00020\u0001H\u0003¢\u0006\u0002\u00109\u001aS\u0010:\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u00012\u0006\u0010%\u001a\u00020&2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010)\u001a\u00020\b2\u0006\u0010*\u001a\u00020\b2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\b0,2\u0006\u0010;\u001a\u00020\b2\u0006\u0010<\u001a\u00020\bH\u0003¢\u0006\u0002\u0010=\u001a1\u0010>\u001a\u00020\u00122\u0006\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020\b2\u0006\u0010B\u001a\u00020\b2\u0006\u0010C\u001a\u00020\bH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010D\u001a \u0010E\u001a\u00020\b2\u0006\u0010F\u001a\u00020\b2\u0006\u0010G\u001a\u00020\b2\u0006\u0010H\u001a\u00020\bH\u0002\u001a0\u0010I\u001a\u00020\b2\u0006\u0010J\u001a\u00020\b2\u0006\u0010K\u001a\u00020\b2\u0006\u0010L\u001a\u00020\b2\u0006\u0010M\u001a\u00020\b2\u0006\u0010N\u001a\u00020\bH\u0002\u001a<\u0010I\u001a\b\u0012\u0004\u0012\u00020\b0\u00162\u0006\u0010J\u001a\u00020\b2\u0006\u0010K\u001a\u00020\b2\f\u0010O\u001a\b\u0012\u0004\u0012\u00020\b0\u00162\u0006\u0010M\u001a\u00020\b2\u0006\u0010N\u001a\u00020\bH\u0002\u001a.\u0010P\u001a\u00020\b2\u0006\u0010A\u001a\u00020\b2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\b0,2\u0006\u0010Q\u001a\u00020\b2\u0006\u0010R\u001a\u00020\bH\u0002\u001a\u0016\u0010S\u001a\b\u0012\u0004\u0012\u00020\b0,2\u0006\u0010!\u001a\u00020\"H\u0002\u001aI\u0010T\u001a\u00020\u0012*\u00020U2\u0006\u0010\u001e\u001a\u00020\u00012\u0006\u0010V\u001a\u00020\u00032\u0006\u00105\u001a\u00020/2\u0006\u0010%\u001a\u00020&2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010W\u001a\u00020\u0003H\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bX\u0010Y\u001a;\u0010Z\u001a\u0010\u0012\u0004\u0012\u00020\\\u0012\u0004\u0012\u00020\b\u0018\u00010[*\u00020]2\u0006\u0010^\u001a\u00020_2\u0006\u0010`\u001a\u00020aH\u0082@ø\u0001\u0001ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\bb\u0010c\u001a\u0098\u0001\u0010d\u001a\u00020\u0001*\u00020\u00012\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020/2\f\u0010e\u001a\b\u0012\u0004\u0012\u00020\b0f2\f\u0010g\u001a\b\u0012\u0004\u0012\u00020\b0f2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010h\u001a\u00020 2\u0006\u0010R\u001a\u00020\b2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u00162\u0018\u0010i\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00120\u00140f2\u001e\u0010j\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00120k0fH\u0002\u001a\\\u0010l\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u001a\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020 2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00120\u00142\u0010\b\u0002\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010$2\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u00162\b\b\u0002\u0010!\u001a\u00020\"H\u0002\u001aj\u0010m\u001a\u00020\u0001*\u00020\u00012\u0006\u0010?\u001a\u00020@2\u0006\u00105\u001a\u00020/2\u0006\u0010R\u001a\u00020\b2\u0006\u0010h\u001a\u00020 2\f\u0010n\u001a\b\u0012\u0004\u0012\u00020\b0f2\u0018\u0010i\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00120\u00140f2\f\u0010o\u001a\b\u0012\u0004\u0012\u00020\b0\u00192\u0006\u0010\u001f\u001a\u00020 H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0013\u0010\u0002\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0004\"\u0013\u0010\u0005\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0004\"\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0013\u0010\t\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0004\"\u0013\u0010\n\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0004\"\u0019\u0010\u000b\u001a\u00020\u0003X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\f\u0010\r\"\u0013\u0010\u000e\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0004\"\u0019\u0010\u000f\u001a\u00020\u0003X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0010\u0010\r\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006p"}, d2 = {"DefaultSliderConstraints", "Landroidx/compose/ui/Modifier;", "SliderHeight", "Landroidx/compose/ui/unit/Dp;", "F", "SliderMinWidth", "SliderToTickAnimation", "Landroidx/compose/animation/core/TweenSpec;", "", "ThumbDefaultElevation", "ThumbPressedElevation", "ThumbRadius", "getThumbRadius", "()F", "ThumbRippleRadius", "TrackHeight", "getTrackHeight", "CorrectValueSideEffect", "", "scaleToOffset", "Lkotlin/Function1;", "valueRange", "Lkotlin/ranges/ClosedFloatingPointRange;", "trackRange", "valueState", "Landroidx/compose/runtime/MutableState;", "value", "(Lkotlin/jvm/functions/Function1;Lkotlin/ranges/ClosedFloatingPointRange;Lkotlin/ranges/ClosedFloatingPointRange;Landroidx/compose/runtime/MutableState;FLandroidx/compose/runtime/Composer;I)V", "RangeSlider", "onValueChange", "modifier", "enabled", "", "steps", "", "onValueChangeFinished", "Lkotlin/Function0;", "colors", "Landroidx/compose/material/SliderColors;", "(Lkotlin/ranges/ClosedFloatingPointRange;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLkotlin/ranges/ClosedFloatingPointRange;ILkotlin/jvm/functions/Function0;Landroidx/compose/material/SliderColors;Landroidx/compose/runtime/Composer;II)V", "RangeSliderImpl", "positionFractionStart", "positionFractionEnd", "tickFractions", "", ViewHierarchyConstants.DIMENSION_WIDTH_KEY, "startInteractionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "endInteractionSource", "startThumbSemantics", "endThumbSemantics", "(ZFFLjava/util/List;Landroidx/compose/material/SliderColors;FLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Slider", "interactionSource", "(FLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLkotlin/ranges/ClosedFloatingPointRange;ILkotlin/jvm/functions/Function0;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/material/SliderColors;Landroidx/compose/runtime/Composer;II)V", "SliderImpl", "positionFraction", "(ZFLjava/util/List;Landroidx/compose/material/SliderColors;FLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "Track", "thumbPx", "trackStrokeWidth", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material/SliderColors;ZFFLjava/util/List;FFLandroidx/compose/runtime/Composer;I)V", "animateToTarget", "draggableState", "Landroidx/compose/foundation/gestures/DraggableState;", "current", TypedValues.AttributesType.S_TARGET, "velocity", "(Landroidx/compose/foundation/gestures/DraggableState;FFFLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "calcFraction", "a", "b", "pos", "scale", "a1", "b1", "x1", "a2", "b2", "x", "snapValueToTick", "minPx", "maxPx", "stepsToTickFractions", "SliderThumb", "Landroidx/compose/foundation/layout/BoxScope;", TypedValues.CycleType.S_WAVE_OFFSET, "thumbSize", "SliderThumb-PcYyNuk", "(Landroidx/compose/foundation/layout/BoxScope;Landroidx/compose/ui/Modifier;FLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/material/SliderColors;ZFLandroidx/compose/runtime/Composer;I)V", "awaitSlop", "Lkotlin/Pair;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "id", "Landroidx/compose/ui/input/pointer/PointerId;", "type", "Landroidx/compose/ui/input/pointer/PointerType;", "awaitSlop-8vUncbI", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "rangeSliderPressDragModifier", "rawOffsetStart", "Landroidx/compose/runtime/State;", "rawOffsetEnd", "isRtl", "gestureEndAction", "onDrag", "Lkotlin/Function2;", "sliderSemantics", "sliderTapModifier", "rawOffset", "pressOffset", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SliderKt {
    private static final Modifier DefaultSliderConstraints;
    private static final float SliderHeight;
    private static final float SliderMinWidth;
    private static final TweenSpec<Float> SliderToTickAnimation;
    private static final float ThumbRadius = Dp.m5607constructorimpl(10);
    private static final float ThumbRippleRadius = Dp.m5607constructorimpl(24);
    private static final float ThumbDefaultElevation = Dp.m5607constructorimpl(1);
    private static final float ThumbPressedElevation = Dp.m5607constructorimpl(6);
    private static final float TrackHeight = Dp.m5607constructorimpl(4);

    /* JADX WARN: Removed duplicated region for block: B:100:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x011e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Slider(float f, Function1<? super Float, Unit> onValueChange, Modifier modifier, boolean z, ClosedFloatingPointRange<Float> closedFloatingPointRange, int i, Function0<Unit> function0, MutableInteractionSource mutableInteractionSource, SliderColors sliderColors, Composer composer, int i2, int i3) {
        int i4;
        Modifier.Companion companion;
        int i5;
        boolean z2;
        Object obj;
        int i6;
        int i7;
        int i8;
        int i9;
        ClosedFloatingPointRange<Float> closedFloatingPointRange2;
        int i10;
        Function0<Unit> function02;
        MutableInteractionSource mutableInteractionSource2;
        int i11;
        SliderColors m1446colorsq0g_0yA;
        boolean z3;
        SliderColors sliderColors2;
        ClosedFloatingPointRange<Float> closedFloatingPointRange3;
        Modifier modifier2;
        Function0<Unit> function03;
        MutableInteractionSource mutableInteractionSource3;
        int i12;
        int i13;
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        Composer startRestartGroup = composer.startRestartGroup(-1962335196);
        ComposerKt.sourceInformation(startRestartGroup, "C(Slider)P(7,4,3,1,8,6,5,2)154@7436L39,155@7519L8,158@7612L35,159@7672L59,162@7736L3444:Slider.kt#jmzs0o");
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i4 = (startRestartGroup.changed(f) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 112) == 0) {
            i4 |= startRestartGroup.changedInstance(onValueChange) ? 32 : 16;
        }
        int i14 = i3 & 4;
        if (i14 != 0) {
            i4 |= 384;
        } else if ((i2 & 896) == 0) {
            companion = modifier;
            i4 |= startRestartGroup.changed(companion) ? 256 : 128;
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
            } else if ((i2 & 7168) == 0) {
                z2 = z;
                i4 |= startRestartGroup.changed(z2) ? 2048 : 1024;
                if ((57344 & i2) == 0) {
                    if ((i3 & 16) == 0) {
                        obj = closedFloatingPointRange;
                        if (startRestartGroup.changed(obj)) {
                            i13 = 16384;
                            i4 |= i13;
                        }
                    } else {
                        obj = closedFloatingPointRange;
                    }
                    i13 = 8192;
                    i4 |= i13;
                } else {
                    obj = closedFloatingPointRange;
                }
                i6 = i3 & 32;
                if (i6 != 0) {
                    i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((458752 & i2) == 0) {
                    i7 = i;
                    i4 |= startRestartGroup.changed(i7) ? 131072 : 65536;
                    i8 = i3 & 64;
                    if (i8 == 0) {
                        i4 |= 1572864;
                    } else if ((i2 & 3670016) == 0) {
                        i4 |= startRestartGroup.changedInstance(function0) ? 1048576 : 524288;
                    }
                    i9 = i3 & 128;
                    if (i9 == 0) {
                        i4 |= 12582912;
                    } else if ((i2 & 29360128) == 0) {
                        i4 |= startRestartGroup.changed(mutableInteractionSource) ? 8388608 : 4194304;
                    }
                    if ((i2 & 234881024) == 0) {
                        if ((i3 & 256) == 0 && startRestartGroup.changed(sliderColors)) {
                            i12 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                            i4 |= i12;
                        }
                        i12 = 33554432;
                        i4 |= i12;
                    }
                    if ((i4 & 191739611) == 38347922 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i2 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            if (i14 != 0) {
                                companion = Modifier.Companion;
                            }
                            if (i5 != 0) {
                                z2 = true;
                            }
                            if ((i3 & 16) == 0) {
                                closedFloatingPointRange2 = RangesKt.rangeTo(0.0f, 1.0f);
                                i4 &= -57345;
                            } else {
                                closedFloatingPointRange2 = obj;
                            }
                            i10 = i6 == 0 ? 0 : i7;
                            function02 = i8 == 0 ? null : function0;
                            if (i9 == 0) {
                                startRestartGroup.startReplaceableGroup(-492369756);
                                ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                                Object rememberedValue = startRestartGroup.rememberedValue();
                                if (rememberedValue == Composer.Companion.getEmpty()) {
                                    rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                startRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
                            } else {
                                mutableInteractionSource2 = mutableInteractionSource;
                            }
                            if ((i3 & 256) != 0) {
                                i11 = i4 & (-234881025);
                                m1446colorsq0g_0yA = SliderDefaults.INSTANCE.m1446colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, startRestartGroup, 0, 6, AnalyticsListener.EVENT_DRM_KEYS_LOADED);
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1962335196, i11, -1, "androidx.compose.material.Slider (Slider.kt:145)");
                                }
                                if (!(i10 >= 0)) {
                                    throw new IllegalArgumentException("steps should be >= 0".toString());
                                }
                                State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(onValueChange, startRestartGroup, (i11 >> 3) & 14);
                                Integer valueOf = Integer.valueOf(i10);
                                startRestartGroup.startReplaceableGroup(1157296644);
                                ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                                boolean changed = startRestartGroup.changed(valueOf);
                                Object rememberedValue2 = startRestartGroup.rememberedValue();
                                if (changed || rememberedValue2 == Composer.Companion.getEmpty()) {
                                    rememberedValue2 = stepsToTickFractions(i10);
                                    startRestartGroup.updateRememberedValue(rememberedValue2);
                                }
                                startRestartGroup.endReplaceableGroup();
                                Modifier minimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(companion);
                                float f2 = ThumbRadius;
                                float f3 = 2;
                                BoxWithConstraintsKt.BoxWithConstraints(FocusableKt.focusable(sliderSemantics(SizeKt.m791requiredSizeInqDBjuR0$default(minimumInteractiveComponentSize, Dp.m5607constructorimpl(f2 * f3), Dp.m5607constructorimpl(f2 * f3), 0.0f, 0.0f, 12, null), f, z2, onValueChange, function02, closedFloatingPointRange2, i10), z2, mutableInteractionSource2), null, false, ComposableLambdaKt.composableLambda(startRestartGroup, 2085116814, true, new SliderKt$Slider$3(closedFloatingPointRange2, i11, f, mutableInteractionSource2, z2, (List) rememberedValue2, m1446colorsq0g_0yA, rememberUpdatedState, function02)), startRestartGroup, CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE, 6);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                z3 = z2;
                                sliderColors2 = m1446colorsq0g_0yA;
                                closedFloatingPointRange3 = closedFloatingPointRange2;
                                modifier2 = companion;
                                function03 = function02;
                                mutableInteractionSource3 = mutableInteractionSource2;
                            }
                            i11 = i4;
                            m1446colorsq0g_0yA = sliderColors;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            if (!(i10 >= 0)) {
                            }
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i3 & 16) != 0) {
                                i4 &= -57345;
                            }
                            if ((i3 & 256) != 0) {
                                int i15 = i4 & (-234881025);
                                function02 = function0;
                                m1446colorsq0g_0yA = sliderColors;
                                closedFloatingPointRange2 = obj;
                                i10 = i7;
                                i11 = i15;
                                mutableInteractionSource2 = mutableInteractionSource;
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                if (!(i10 >= 0)) {
                                }
                            } else {
                                function02 = function0;
                                mutableInteractionSource2 = mutableInteractionSource;
                                closedFloatingPointRange2 = obj;
                                i10 = i7;
                                i11 = i4;
                                m1446colorsq0g_0yA = sliderColors;
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                if (!(i10 >= 0)) {
                                }
                            }
                        }
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        mutableInteractionSource3 = mutableInteractionSource;
                        modifier2 = companion;
                        z3 = z2;
                        closedFloatingPointRange3 = obj;
                        i10 = i7;
                        function03 = function0;
                        sliderColors2 = sliderColors;
                    }
                    ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        return;
                    }
                    endRestartGroup.updateScope(new SliderKt$Slider$4(f, onValueChange, modifier2, z3, closedFloatingPointRange3, i10, function03, mutableInteractionSource3, sliderColors2, i2, i3));
                    return;
                }
                i7 = i;
                i8 = i3 & 64;
                if (i8 == 0) {
                }
                i9 = i3 & 128;
                if (i9 == 0) {
                }
                if ((i2 & 234881024) == 0) {
                }
                if ((i4 & 191739611) == 38347922) {
                }
                startRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                }
                if (i14 != 0) {
                }
                if (i5 != 0) {
                }
                if ((i3 & 16) == 0) {
                }
                if (i6 == 0) {
                }
                if (i8 == 0) {
                }
                if (i9 == 0) {
                }
                if ((i3 & 256) != 0) {
                }
                i11 = i4;
                m1446colorsq0g_0yA = sliderColors;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                if (!(i10 >= 0)) {
                }
            }
            z2 = z;
            if ((57344 & i2) == 0) {
            }
            i6 = i3 & 32;
            if (i6 != 0) {
            }
            i7 = i;
            i8 = i3 & 64;
            if (i8 == 0) {
            }
            i9 = i3 & 128;
            if (i9 == 0) {
            }
            if ((i2 & 234881024) == 0) {
            }
            if ((i4 & 191739611) == 38347922) {
            }
            startRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
            }
            if (i14 != 0) {
            }
            if (i5 != 0) {
            }
            if ((i3 & 16) == 0) {
            }
            if (i6 == 0) {
            }
            if (i8 == 0) {
            }
            if (i9 == 0) {
            }
            if ((i3 & 256) != 0) {
            }
            i11 = i4;
            m1446colorsq0g_0yA = sliderColors;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            if (!(i10 >= 0)) {
            }
        }
        companion = modifier;
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        z2 = z;
        if ((57344 & i2) == 0) {
        }
        i6 = i3 & 32;
        if (i6 != 0) {
        }
        i7 = i;
        i8 = i3 & 64;
        if (i8 == 0) {
        }
        i9 = i3 & 128;
        if (i9 == 0) {
        }
        if ((i2 & 234881024) == 0) {
        }
        if ((i4 & 191739611) == 38347922) {
        }
        startRestartGroup.startDefaults();
        if ((i2 & 1) != 0) {
        }
        if (i14 != 0) {
        }
        if (i5 != 0) {
        }
        if ((i3 & 16) == 0) {
        }
        if (i6 == 0) {
        }
        if (i8 == 0) {
        }
        if (i9 == 0) {
        }
        if ((i3 & 256) != 0) {
        }
        i11 = i4;
        m1446colorsq0g_0yA = sliderColors;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        if (!(i10 >= 0)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x012f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RangeSlider(ClosedFloatingPointRange<Float> value, Function1<? super ClosedFloatingPointRange<Float>, Unit> onValueChange, Modifier modifier, boolean z, ClosedFloatingPointRange<Float> closedFloatingPointRange, int i, Function0<Unit> function0, SliderColors sliderColors, Composer composer, int i2, int i3) {
        int i4;
        Modifier.Companion companion;
        int i5;
        boolean z2;
        Object obj;
        int i6;
        int i7;
        int i8;
        Object obj2;
        SliderColors sliderColors2;
        Object obj3;
        int i9;
        Modifier modifier2;
        boolean z3;
        Object obj4;
        int i10;
        Object rememberedValue;
        Object rememberedValue2;
        Composer composer2;
        Modifier modifier3;
        boolean z4;
        ClosedFloatingPointRange<Float> closedFloatingPointRange2;
        int i11;
        Function0<Unit> function02;
        SliderColors sliderColors3;
        int i12;
        int i13;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        Composer startRestartGroup = composer.startRestartGroup(-1556183027);
        ComposerKt.sourceInformation(startRestartGroup, "C(RangeSlider)P(6,3,2,1,7,5,4)299@13521L8,301@13593L39,302@13690L39,305@13811L35,306@13871L59,310@13936L5142:Slider.kt#jmzs0o");
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i4 = (startRestartGroup.changed(value) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 112) == 0) {
            i4 |= startRestartGroup.changedInstance(onValueChange) ? 32 : 16;
        }
        int i14 = i3 & 4;
        if (i14 != 0) {
            i4 |= 384;
        } else if ((i2 & 896) == 0) {
            companion = modifier;
            i4 |= startRestartGroup.changed(companion) ? 256 : 128;
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
            } else if ((i2 & 7168) == 0) {
                z2 = z;
                i4 |= startRestartGroup.changed(z2) ? 2048 : 1024;
                if ((57344 & i2) == 0) {
                    if ((i3 & 16) == 0) {
                        obj = closedFloatingPointRange;
                        if (startRestartGroup.changed(obj)) {
                            i13 = 16384;
                            i4 |= i13;
                        }
                    } else {
                        obj = closedFloatingPointRange;
                    }
                    i13 = 8192;
                    i4 |= i13;
                } else {
                    obj = closedFloatingPointRange;
                }
                i6 = i3 & 32;
                if (i6 != 0) {
                    i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((458752 & i2) == 0) {
                    i7 = i;
                    i4 |= startRestartGroup.changed(i7) ? 131072 : 65536;
                    i8 = i3 & 64;
                    if (i8 == 0) {
                        i4 |= 1572864;
                        obj2 = function0;
                    } else {
                        obj2 = function0;
                        if ((i2 & 3670016) == 0) {
                            i4 |= startRestartGroup.changedInstance(obj2) ? 1048576 : 524288;
                        }
                    }
                    if ((i2 & 29360128) == 0) {
                        if ((i3 & 128) == 0 && startRestartGroup.changed(sliderColors)) {
                            i12 = 8388608;
                            i4 |= i12;
                        }
                        i12 = 4194304;
                        i4 |= i12;
                    }
                    if ((i4 & 23967451) == 4793490 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i2 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            if (i14 != 0) {
                                companion = Modifier.Companion;
                            }
                            if (i5 != 0) {
                                z2 = true;
                            }
                            if ((i3 & 16) != 0) {
                                i4 &= -57345;
                                obj = RangesKt.rangeTo(0.0f, 1.0f);
                            }
                            if (i6 != 0) {
                                i7 = 0;
                            }
                            Object obj5 = i8 == 0 ? null : obj2;
                            if ((i3 & 128) == 0) {
                                i4 &= -29360129;
                                obj3 = obj5;
                                sliderColors2 = SliderDefaults.INSTANCE.m1446colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, startRestartGroup, 0, 6, AnalyticsListener.EVENT_DRM_KEYS_LOADED);
                                modifier2 = companion;
                                z3 = z2;
                                obj4 = obj;
                                i10 = i7;
                                i9 = i4;
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1556183027, i9, -1, "androidx.compose.material.RangeSlider (Slider.kt:290)");
                                }
                                startRestartGroup.startReplaceableGroup(-492369756);
                                ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                                rememberedValue = startRestartGroup.rememberedValue();
                                if (rememberedValue == Composer.Companion.getEmpty()) {
                                    rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                startRestartGroup.endReplaceableGroup();
                                MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) rememberedValue;
                                startRestartGroup.startReplaceableGroup(-492369756);
                                ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                                rememberedValue2 = startRestartGroup.rememberedValue();
                                if (rememberedValue2 == Composer.Companion.getEmpty()) {
                                    rememberedValue2 = InteractionSourceKt.MutableInteractionSource();
                                    startRestartGroup.updateRememberedValue(rememberedValue2);
                                }
                                startRestartGroup.endReplaceableGroup();
                                MutableInteractionSource mutableInteractionSource2 = (MutableInteractionSource) rememberedValue2;
                                if (i10 >= 0) {
                                    throw new IllegalArgumentException("steps should be >= 0".toString());
                                }
                                State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(onValueChange, startRestartGroup, (i9 >> 3) & 14);
                                Integer valueOf = Integer.valueOf(i10);
                                startRestartGroup.startReplaceableGroup(1157296644);
                                ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                                boolean changed = startRestartGroup.changed(valueOf);
                                Object rememberedValue3 = startRestartGroup.rememberedValue();
                                if (changed || rememberedValue3 == Composer.Companion.getEmpty()) {
                                    rememberedValue3 = stepsToTickFractions(i10);
                                    startRestartGroup.updateRememberedValue(rememberedValue3);
                                }
                                startRestartGroup.endReplaceableGroup();
                                Modifier minimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier2);
                                float f = ThumbRadius;
                                composer2 = startRestartGroup;
                                BoxWithConstraintsKt.BoxWithConstraints(SizeKt.m791requiredSizeInqDBjuR0$default(minimumInteractiveComponentSize, Dp.m5607constructorimpl(4 * f), Dp.m5607constructorimpl(f * 2), 0.0f, 0.0f, 12, null), null, false, ComposableLambdaKt.composableLambda(composer2, 652589923, true, new SliderKt$RangeSlider$2(obj4, value, i9, rememberUpdatedState, mutableInteractionSource, mutableInteractionSource2, z3, i10, obj3, (List) rememberedValue3, sliderColors2)), composer2, CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE, 6);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier3 = modifier2;
                                z4 = z3;
                                closedFloatingPointRange2 = obj4;
                                i11 = i10;
                                function02 = obj3;
                                sliderColors3 = sliderColors2;
                            } else {
                                sliderColors2 = sliderColors;
                                obj3 = obj5;
                                i9 = i4;
                                modifier2 = companion;
                                z3 = z2;
                                obj4 = obj;
                                i10 = i7;
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                startRestartGroup.startReplaceableGroup(-492369756);
                                ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                                rememberedValue = startRestartGroup.rememberedValue();
                                if (rememberedValue == Composer.Companion.getEmpty()) {
                                }
                                startRestartGroup.endReplaceableGroup();
                                MutableInteractionSource mutableInteractionSource3 = (MutableInteractionSource) rememberedValue;
                                startRestartGroup.startReplaceableGroup(-492369756);
                                ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                                rememberedValue2 = startRestartGroup.rememberedValue();
                                if (rememberedValue2 == Composer.Companion.getEmpty()) {
                                }
                                startRestartGroup.endReplaceableGroup();
                                MutableInteractionSource mutableInteractionSource22 = (MutableInteractionSource) rememberedValue2;
                                if (i10 >= 0) {
                                }
                            }
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i3 & 16) != 0) {
                                i4 &= -57345;
                            }
                            if ((i3 & 128) != 0) {
                                sliderColors2 = sliderColors;
                                obj3 = obj2;
                                modifier2 = companion;
                                z3 = z2;
                                obj4 = obj;
                                i10 = i7;
                                i9 = i4 & (-29360129);
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                startRestartGroup.startReplaceableGroup(-492369756);
                                ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                                rememberedValue = startRestartGroup.rememberedValue();
                                if (rememberedValue == Composer.Companion.getEmpty()) {
                                }
                                startRestartGroup.endReplaceableGroup();
                                MutableInteractionSource mutableInteractionSource32 = (MutableInteractionSource) rememberedValue;
                                startRestartGroup.startReplaceableGroup(-492369756);
                                ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                                rememberedValue2 = startRestartGroup.rememberedValue();
                                if (rememberedValue2 == Composer.Companion.getEmpty()) {
                                }
                                startRestartGroup.endReplaceableGroup();
                                MutableInteractionSource mutableInteractionSource222 = (MutableInteractionSource) rememberedValue2;
                                if (i10 >= 0) {
                                }
                            } else {
                                sliderColors2 = sliderColors;
                                obj3 = obj2;
                                modifier2 = companion;
                                z3 = z2;
                                obj4 = obj;
                                i10 = i7;
                                i9 = i4;
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                startRestartGroup.startReplaceableGroup(-492369756);
                                ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                                rememberedValue = startRestartGroup.rememberedValue();
                                if (rememberedValue == Composer.Companion.getEmpty()) {
                                }
                                startRestartGroup.endReplaceableGroup();
                                MutableInteractionSource mutableInteractionSource322 = (MutableInteractionSource) rememberedValue;
                                startRestartGroup.startReplaceableGroup(-492369756);
                                ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                                rememberedValue2 = startRestartGroup.rememberedValue();
                                if (rememberedValue2 == Composer.Companion.getEmpty()) {
                                }
                                startRestartGroup.endReplaceableGroup();
                                MutableInteractionSource mutableInteractionSource2222 = (MutableInteractionSource) rememberedValue2;
                                if (i10 >= 0) {
                                }
                            }
                        }
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        z4 = z2;
                        i11 = i7;
                        composer2 = startRestartGroup;
                        function02 = obj2;
                        modifier3 = companion;
                        closedFloatingPointRange2 = obj;
                        sliderColors3 = sliderColors;
                    }
                    ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        return;
                    }
                    endRestartGroup.updateScope(new SliderKt$RangeSlider$3(value, onValueChange, modifier3, z4, closedFloatingPointRange2, i11, function02, sliderColors3, i2, i3));
                    return;
                }
                i7 = i;
                i8 = i3 & 64;
                if (i8 == 0) {
                }
                if ((i2 & 29360128) == 0) {
                }
                if ((i4 & 23967451) == 4793490) {
                }
                startRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                }
                if (i14 != 0) {
                }
                if (i5 != 0) {
                }
                if ((i3 & 16) != 0) {
                }
                if (i6 != 0) {
                }
                if (i8 == 0) {
                }
                if ((i3 & 128) == 0) {
                }
            }
            z2 = z;
            if ((57344 & i2) == 0) {
            }
            i6 = i3 & 32;
            if (i6 != 0) {
            }
            i7 = i;
            i8 = i3 & 64;
            if (i8 == 0) {
            }
            if ((i2 & 29360128) == 0) {
            }
            if ((i4 & 23967451) == 4793490) {
            }
            startRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
            }
            if (i14 != 0) {
            }
            if (i5 != 0) {
            }
            if ((i3 & 16) != 0) {
            }
            if (i6 != 0) {
            }
            if (i8 == 0) {
            }
            if ((i3 & 128) == 0) {
            }
        }
        companion = modifier;
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        z2 = z;
        if ((57344 & i2) == 0) {
        }
        i6 = i3 & 32;
        if (i6 != 0) {
        }
        i7 = i;
        i8 = i3 & 64;
        if (i8 == 0) {
        }
        if ((i2 & 29360128) == 0) {
        }
        if ((i4 & 23967451) == 4793490) {
        }
        startRestartGroup.startDefaults();
        if ((i2 & 1) != 0) {
        }
        if (i14 != 0) {
        }
        if (i5 != 0) {
        }
        if ((i3 & 16) != 0) {
        }
        if (i6 != 0) {
        }
        if (i8 == 0) {
        }
        if ((i3 & 128) == 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SliderImpl(boolean z, float f, List<Float> list, SliderColors sliderColors, float f2, MutableInteractionSource mutableInteractionSource, Modifier modifier, Composer composer, int i) {
        Composer startRestartGroup = composer.startRestartGroup(1679682785);
        ComposerKt.sourceInformation(startRestartGroup, "C(SliderImpl)P(1,4,5!1,6)588@24897L712:Slider.kt#jmzs0o");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1679682785, i, -1, "androidx.compose.material.SliderImpl (Slider.kt:579)");
        }
        Modifier then = modifier.then(DefaultSliderConstraints);
        startRestartGroup.startReplaceableGroup(733328855);
        ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)69@3214L67,70@3286L130:Box.kt#2w3rfo");
        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-1323940314);
        ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(then);
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
            startRestartGroup.createNode(constructor);
        } else {
            startRestartGroup.useNode();
        }
        Composer m2893constructorimpl = Updater.m2893constructorimpl(startRestartGroup);
        Updater.m2900setimpl(m2893constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m2900setimpl(m2893constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if (m2893constructorimpl.getInserting() || !Intrinsics.areEqual(m2893constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m2893constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m2893constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629358, "C71@3331L9:Box.kt#2w3rfo");
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 618023922, "C*592@25057L7,601@25302L216,611@25527L76:Slider.kt#jmzs0o");
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        Density density = (Density) consume;
        float mo588toPx0680j_4 = density.mo588toPx0680j_4(TrackHeight);
        float f3 = ThumbRadius;
        float mo588toPx0680j_42 = density.mo588toPx0680j_4(f3);
        float mo584toDpu2uoSUM = density.mo584toDpu2uoSUM(f2);
        float m5607constructorimpl = Dp.m5607constructorimpl(f3 * 2);
        float m5607constructorimpl2 = Dp.m5607constructorimpl(mo584toDpu2uoSUM * f);
        int i2 = i >> 6;
        Track(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), sliderColors, z, 0.0f, f, list, mo588toPx0680j_42, mo588toPx0680j_4, startRestartGroup, (i2 & 112) | 265222 | ((i << 6) & 896) | ((i << 9) & 57344));
        m1447SliderThumbPcYyNuk(BoxScopeInstance.INSTANCE, Modifier.Companion, m5607constructorimpl2, mutableInteractionSource, sliderColors, z, m5607constructorimpl, startRestartGroup, (i2 & 7168) | 1572918 | ((i << 3) & 57344) | ((i << 15) & 458752));
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new SliderKt$SliderImpl$2(z, f, list, sliderColors, f2, mutableInteractionSource, modifier, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RangeSliderImpl(boolean z, float f, float f2, List<Float> list, SliderColors sliderColors, float f3, MutableInteractionSource mutableInteractionSource, MutableInteractionSource mutableInteractionSource2, Modifier modifier, Modifier modifier2, Modifier modifier3, Composer composer, int i, int i2) {
        Composer startRestartGroup = composer.startRestartGroup(-278895713);
        ComposerKt.sourceInformation(startRestartGroup, "C(RangeSliderImpl)P(1,6,5,9!1,10,7!1,4,8)630@26054L35,631@26122L33,632@26160L1522:Slider.kt#jmzs0o");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-278895713, i, i2, "androidx.compose.material.RangeSliderImpl (Slider.kt:616)");
        }
        String m1469getString4foXLRw = Strings_androidKt.m1469getString4foXLRw(Strings.Companion.m1468getSliderRangeStartUdPEhr4(), startRestartGroup, 6);
        String m1469getString4foXLRw2 = Strings_androidKt.m1469getString4foXLRw(Strings.Companion.m1467getSliderRangeEndUdPEhr4(), startRestartGroup, 6);
        Modifier then = modifier.then(DefaultSliderConstraints);
        startRestartGroup.startReplaceableGroup(733328855);
        ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)69@3214L67,70@3286L130:Box.kt#2w3rfo");
        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-1323940314);
        ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(then);
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
            startRestartGroup.createNode(constructor);
        } else {
            startRestartGroup.useNode();
        }
        Composer m2893constructorimpl = Updater.m2893constructorimpl(startRestartGroup);
        Updater.m2900setimpl(m2893constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m2900setimpl(m2893constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if (m2893constructorimpl.getInserting() || !Intrinsics.areEqual(m2893constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m2893constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m2893constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629358, "C71@3331L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1690173328, "C*636@26320L7,645@26628L301,660@27025L48,658@26939L369,671@27403L46,669@27317L359:Slider.kt#jmzs0o");
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        Density density = (Density) consume;
        float mo588toPx0680j_4 = density.mo588toPx0680j_4(TrackHeight);
        float f4 = ThumbRadius;
        float mo588toPx0680j_42 = density.mo588toPx0680j_4(f4);
        float mo584toDpu2uoSUM = density.mo584toDpu2uoSUM(f3);
        float m5607constructorimpl = Dp.m5607constructorimpl(f4 * 2);
        float m5607constructorimpl2 = Dp.m5607constructorimpl(mo584toDpu2uoSUM * f);
        float m5607constructorimpl3 = Dp.m5607constructorimpl(mo584toDpu2uoSUM * f2);
        int i3 = i >> 9;
        int i4 = i << 6;
        Track(SizeKt.fillMaxSize$default(boxScopeInstance.align(Modifier.Companion, Alignment.Companion.getCenterStart()), 0.0f, 1, null), sliderColors, z, f, f2, list, mo588toPx0680j_42, mo588toPx0680j_4, startRestartGroup, (i3 & 112) | 262144 | (i4 & 896) | (i4 & 7168) | (i4 & 57344));
        Modifier.Companion companion = Modifier.Companion;
        startRestartGroup.startReplaceableGroup(1157296644);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
        boolean changed = startRestartGroup.changed(m1469getString4foXLRw);
        SliderKt$RangeSliderImpl$1$2$1 rememberedValue = startRestartGroup.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new SliderKt$RangeSliderImpl$1$2$1(m1469getString4foXLRw);
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        startRestartGroup.endReplaceableGroup();
        int i5 = i & 57344;
        int i6 = (i << 15) & 458752;
        m1447SliderThumbPcYyNuk(boxScopeInstance, FocusableKt.focusable(SemanticsModifierKt.semantics(companion, true, (Function1) rememberedValue), true, mutableInteractionSource).then(modifier2), m5607constructorimpl2, mutableInteractionSource, sliderColors, z, m5607constructorimpl, startRestartGroup, (i3 & 7168) | 1572870 | i5 | i6);
        Modifier.Companion companion2 = Modifier.Companion;
        startRestartGroup.startReplaceableGroup(1157296644);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
        boolean changed2 = startRestartGroup.changed(m1469getString4foXLRw2);
        SliderKt$RangeSliderImpl$1$3$1 rememberedValue2 = startRestartGroup.rememberedValue();
        if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = new SliderKt$RangeSliderImpl$1$3$1(m1469getString4foXLRw2);
            startRestartGroup.updateRememberedValue(rememberedValue2);
        }
        startRestartGroup.endReplaceableGroup();
        m1447SliderThumbPcYyNuk(boxScopeInstance, FocusableKt.focusable(SemanticsModifierKt.semantics(companion2, true, (Function1) rememberedValue2), true, mutableInteractionSource2).then(modifier3), m5607constructorimpl3, mutableInteractionSource2, sliderColors, z, m5607constructorimpl, startRestartGroup, ((i >> 12) & 7168) | 1572870 | i5 | i6);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new SliderKt$RangeSliderImpl$2(z, f, f2, list, sliderColors, f3, mutableInteractionSource, mutableInteractionSource2, modifier, modifier2, modifier3, i, i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: SliderThumb-PcYyNuk  reason: not valid java name */
    public static final void m1447SliderThumbPcYyNuk(BoxScope boxScope, Modifier modifier, float f, MutableInteractionSource mutableInteractionSource, SliderColors sliderColors, boolean z, float f2, Composer composer, int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(428907178);
        ComposerKt.sourceInformation(startRestartGroup, "C(SliderThumb)P(3,4:c#ui.unit.Dp,2!,5:c#ui.unit.Dp)692@27895L1553:Slider.kt#jmzs0o");
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(boxScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changed(f) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= startRestartGroup.changed(mutableInteractionSource) ? 2048 : 1024;
        }
        if ((57344 & i) == 0) {
            i2 |= startRestartGroup.changed(sliderColors) ? 16384 : 8192;
        }
        if ((458752 & i) == 0) {
            i2 |= startRestartGroup.changed(z) ? 131072 : 65536;
        }
        if ((3670016 & i) == 0) {
            i2 |= startRestartGroup.changed(f2) ? 1048576 : 524288;
        }
        int i3 = i2;
        if ((2995931 & i3) == 599186 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(428907178, i3, -1, "androidx.compose.material.SliderThumb (Slider.kt:684)");
            }
            Modifier align = boxScope.align(PaddingKt.m752paddingqDBjuR0$default(Modifier.Companion, f, 0.0f, 0.0f, 0.0f, 14, null), Alignment.Companion.getCenterStart());
            startRestartGroup.startReplaceableGroup(733328855);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)69@3214L67,70@3286L130:Box.kt#2w3rfo");
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(align);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m2893constructorimpl = Updater.m2893constructorimpl(startRestartGroup);
            Updater.m2900setimpl(m2893constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2900setimpl(m2893constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (m2893constructorimpl.getInserting() || !Intrinsics.areEqual(m2893constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2893constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2893constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629358, "C71@3331L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -528162279, "C696@28026L46,697@28115L658,697@28081L692,720@29129L59,724@29393L19,715@28935L507:Slider.kt#jmzs0o");
            startRestartGroup.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = SnapshotStateKt.mutableStateListOf();
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            SnapshotStateList snapshotStateList = (SnapshotStateList) rememberedValue;
            int i4 = i3 >> 9;
            int i5 = i4 & 14;
            startRestartGroup.startReplaceableGroup(511388516);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
            boolean changed = startRestartGroup.changed(mutableInteractionSource) | startRestartGroup.changed(snapshotStateList);
            SliderKt$SliderThumb$1$1$1 rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = new SliderKt$SliderThumb$1$1$1(mutableInteractionSource, snapshotStateList, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceableGroup();
            EffectsKt.LaunchedEffect(mutableInteractionSource, (Function2) rememberedValue2, startRestartGroup, i5 | 64);
            SpacerKt.Spacer(BackgroundKt.m420backgroundbw27NRU(ShadowKt.m2930shadows4CzXII$default(HoverableKt.hoverable$default(IndicationKt.indication(SizeKt.m797sizeVpY3zN4(modifier, f2, f2), mutableInteractionSource, RippleKt.m1559rememberRipple9IZ8Weo(false, ThumbRippleRadius, 0L, startRestartGroup, 54, 4)), mutableInteractionSource, false, 2, null), z ? snapshotStateList.isEmpty() ^ true ? ThumbPressedElevation : ThumbDefaultElevation : Dp.m5607constructorimpl(0), RoundedCornerShapeKt.getCircleShape(), false, 0L, 0L, 24, null), sliderColors.thumbColor(z, startRestartGroup, ((i3 >> 15) & 14) | (i4 & 112)).getValue().m3301unboximpl(), RoundedCornerShapeKt.getCircleShape()), startRestartGroup, 0);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new SliderKt$SliderThumb$2(boxScope, modifier, f, mutableInteractionSource, sliderColors, z, f2, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Track(Modifier modifier, SliderColors sliderColors, boolean z, float f, float f2, List<Float> list, float f3, float f4, Composer composer, int i) {
        Composer startRestartGroup = composer.startRestartGroup(1833126050);
        ComposerKt.sourceInformation(startRestartGroup, "C(Track)P(2!2,4!1,6)740@29741L35,741@29811L34,742@29881L34,743@29949L33,744@29987L1514:Slider.kt#jmzs0o");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1833126050, i, -1, "androidx.compose.material.Track (Slider.kt:730)");
        }
        int i2 = ((i >> 6) & 14) | 48 | ((i << 3) & 896);
        CanvasKt.Canvas(modifier, new SliderKt$Track$1(f3, sliderColors.trackColor(z, false, startRestartGroup, i2), f4, f2, f, sliderColors.trackColor(z, true, startRestartGroup, i2), list, sliderColors.tickColor(z, false, startRestartGroup, i2), sliderColors.tickColor(z, true, startRestartGroup, i2)), startRestartGroup, i & 14);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new SliderKt$Track$2(modifier, sliderColors, z, f, f2, list, f3, f4, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float snapValueToTick(float f, List<Float> list, float f2, float f3) {
        Object obj;
        Iterator<T> it = list.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                float abs = Math.abs(MathHelpersKt.lerp(f2, f3, ((Number) next).floatValue()) - f);
                do {
                    Object next2 = it.next();
                    float abs2 = Math.abs(MathHelpersKt.lerp(f2, f3, ((Number) next2).floatValue()) - f);
                    if (Float.compare(abs, abs2) > 0) {
                        next = next2;
                        abs = abs2;
                    }
                } while (it.hasNext());
                obj = next;
            } else {
                obj = next;
            }
        } else {
            obj = null;
        }
        Float f4 = (Float) obj;
        return f4 != null ? MathHelpersKt.lerp(f2, f3, f4.floatValue()) : f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0068 A[ORIG_RETURN, RETURN] */
    /* renamed from: awaitSlop-8vUncbI  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m1450awaitSlop8vUncbI(AwaitPointerEventScope awaitPointerEventScope, long j, int i, Continuation<? super Pair<PointerInputChange, Float>> continuation) {
        SliderKt$awaitSlop$1 sliderKt$awaitSlop$1;
        int i2;
        Ref.FloatRef floatRef;
        PointerInputChange pointerInputChange;
        if (continuation instanceof SliderKt$awaitSlop$1) {
            sliderKt$awaitSlop$1 = (SliderKt$awaitSlop$1) continuation;
            if ((sliderKt$awaitSlop$1.label & Integer.MIN_VALUE) != 0) {
                sliderKt$awaitSlop$1.label -= Integer.MIN_VALUE;
                SliderKt$awaitSlop$1 sliderKt$awaitSlop$12 = sliderKt$awaitSlop$1;
                Object obj = sliderKt$awaitSlop$12.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = sliderKt$awaitSlop$12.label;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Ref.FloatRef floatRef2 = new Ref.FloatRef();
                    sliderKt$awaitSlop$12.L$0 = floatRef2;
                    sliderKt$awaitSlop$12.label = 1;
                    Object m1345awaitHorizontalPointerSlopOrCancellationgDDlDlE = DragGestureDetectorCopyKt.m1345awaitHorizontalPointerSlopOrCancellationgDDlDlE(awaitPointerEventScope, j, i, new SliderKt$awaitSlop$postPointerSlop$1(floatRef2), sliderKt$awaitSlop$12);
                    if (m1345awaitHorizontalPointerSlopOrCancellationgDDlDlE == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    obj = m1345awaitHorizontalPointerSlopOrCancellationgDDlDlE;
                    floatRef = floatRef2;
                } else if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    floatRef = (Ref.FloatRef) sliderKt$awaitSlop$12.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                pointerInputChange = (PointerInputChange) obj;
                if (pointerInputChange == null) {
                    return TuplesKt.to(pointerInputChange, Boxing.boxFloat(floatRef.element));
                }
                return null;
            }
        }
        sliderKt$awaitSlop$1 = new SliderKt$awaitSlop$1(continuation);
        SliderKt$awaitSlop$1 sliderKt$awaitSlop$122 = sliderKt$awaitSlop$1;
        Object obj2 = sliderKt$awaitSlop$122.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = sliderKt$awaitSlop$122.label;
        if (i2 != 0) {
        }
        pointerInputChange = (PointerInputChange) obj2;
        if (pointerInputChange == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Float> stepsToTickFractions(int i) {
        if (i == 0) {
            return CollectionsKt.emptyList();
        }
        int i2 = i + 2;
        ArrayList arrayList = new ArrayList(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            arrayList.add(Float.valueOf(i3 / (i + 1)));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float scale(float f, float f2, float f3, float f4, float f5) {
        return MathHelpersKt.lerp(f4, f5, calcFraction(f, f2, f3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ClosedFloatingPointRange<Float> scale(float f, float f2, ClosedFloatingPointRange<Float> closedFloatingPointRange, float f3, float f4) {
        return RangesKt.rangeTo(scale(f, f2, closedFloatingPointRange.getStart().floatValue(), f3, f4), scale(f, f2, closedFloatingPointRange.getEndInclusive().floatValue(), f3, f4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float calcFraction(float f, float f2, float f3) {
        float f4 = f2 - f;
        return RangesKt.coerceIn((f4 > 0.0f ? 1 : (f4 == 0.0f ? 0 : -1)) == 0 ? 0.0f : (f3 - f) / f4, 0.0f, 1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CorrectValueSideEffect(Function1<? super Float, Float> function1, ClosedFloatingPointRange<Float> closedFloatingPointRange, ClosedFloatingPointRange<Float> closedFloatingPointRange2, MutableState<Float> mutableState, float f, Composer composer, int i) {
        Composer startRestartGroup = composer.startRestartGroup(-743965752);
        ComposerKt.sourceInformation(startRestartGroup, "C(CorrectValueSideEffect)P(!1,3!1,4)839@33355L300,839@33344L311:Slider.kt#jmzs0o");
        int i2 = (i & 14) == 0 ? (startRestartGroup.changedInstance(function1) ? 4 : 2) | i : i;
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(closedFloatingPointRange) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changed(closedFloatingPointRange2) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= startRestartGroup.changed(mutableState) ? 2048 : 1024;
        }
        if ((57344 & i) == 0) {
            i2 |= startRestartGroup.changed(f) ? 16384 : 8192;
        }
        if ((i2 & 46811) != 9362 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-743965752, i, -1, "androidx.compose.material.CorrectValueSideEffect (Slider.kt:832)");
            }
            Object[] objArr = {closedFloatingPointRange, function1, Float.valueOf(f), mutableState, closedFloatingPointRange2};
            startRestartGroup.startReplaceableGroup(-568225417);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
            boolean z = false;
            for (int i3 = 0; i3 < 5; i3++) {
                z |= startRestartGroup.changed(objArr[i3]);
            }
            SliderKt$CorrectValueSideEffect$1$1 rememberedValue = startRestartGroup.rememberedValue();
            if (z || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new SliderKt$CorrectValueSideEffect$1$1(closedFloatingPointRange, function1, f, mutableState, closedFloatingPointRange2);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            EffectsKt.SideEffect((Function0) rememberedValue, startRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new SliderKt$CorrectValueSideEffect$2(function1, closedFloatingPointRange, closedFloatingPointRange2, mutableState, f, i));
    }

    static /* synthetic */ Modifier sliderSemantics$default(Modifier modifier, float f, boolean z, Function1 function1, Function0 function0, ClosedFloatingPointRange closedFloatingPointRange, int i, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            function0 = null;
        }
        Function0 function02 = function0;
        if ((i2 & 16) != 0) {
            closedFloatingPointRange = RangesKt.rangeTo(0.0f, 1.0f);
        }
        ClosedFloatingPointRange closedFloatingPointRange2 = closedFloatingPointRange;
        if ((i2 & 32) != 0) {
            i = 0;
        }
        return sliderSemantics(modifier, f, z, function1, function02, closedFloatingPointRange2, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier sliderSemantics(Modifier modifier, float f, boolean z, Function1<? super Float, Unit> function1, Function0<Unit> function0, ClosedFloatingPointRange<Float> closedFloatingPointRange, int i) {
        return ProgressSemanticsKt.progressSemantics(SemanticsModifierKt.semantics$default(modifier, false, new SliderKt$sliderSemantics$1(z, closedFloatingPointRange, i, RangesKt.coerceIn(f, closedFloatingPointRange.getStart().floatValue(), closedFloatingPointRange.getEndInclusive().floatValue()), function1, function0), 1, null), f, closedFloatingPointRange, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object animateToTarget(DraggableState draggableState, float f, float f2, float f3, Continuation<? super Unit> continuation) {
        Object drag$default = DraggableState.CC.drag$default(draggableState, null, new SliderKt$animateToTarget$2(f, f2, f3, null), continuation, 1, null);
        return drag$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? drag$default : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier rangeSliderPressDragModifier(Modifier modifier, MutableInteractionSource mutableInteractionSource, MutableInteractionSource mutableInteractionSource2, State<Float> state, State<Float> state2, boolean z, boolean z2, float f, ClosedFloatingPointRange<Float> closedFloatingPointRange, State<? extends Function1<? super Boolean, Unit>> state3, State<? extends Function2<? super Boolean, ? super Float, Unit>> state4) {
        return z ? SuspendingPointerInputFilterKt.pointerInput(modifier, new Object[]{mutableInteractionSource, mutableInteractionSource2, Float.valueOf(f), Boolean.valueOf(z2), closedFloatingPointRange}, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) new SliderKt$rangeSliderPressDragModifier$1(mutableInteractionSource, mutableInteractionSource2, state, state2, state4, z2, f, state3, null)) : modifier;
    }

    public static final float getThumbRadius() {
        return ThumbRadius;
    }

    public static final float getTrackHeight() {
        return TrackHeight;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier sliderTapModifier(Modifier modifier, DraggableState draggableState, MutableInteractionSource mutableInteractionSource, float f, boolean z, State<Float> state, State<? extends Function1<? super Float, Unit>> state2, MutableState<Float> mutableState, boolean z2) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new SliderKt$sliderTapModifier$$inlined$debugInspectorInfo$1(draggableState, mutableInteractionSource, f, z, state, state2, mutableState, z2) : InspectableValueKt.getNoInspectorInfo(), new SliderKt$sliderTapModifier$2(z2, draggableState, mutableInteractionSource, f, z, mutableState, state, state2));
    }

    static {
        float m5607constructorimpl = Dp.m5607constructorimpl(48);
        SliderHeight = m5607constructorimpl;
        float m5607constructorimpl2 = Dp.m5607constructorimpl(144);
        SliderMinWidth = m5607constructorimpl2;
        DefaultSliderConstraints = SizeKt.m783heightInVpY3zN4$default(SizeKt.m802widthInVpY3zN4$default(Modifier.Companion, m5607constructorimpl2, 0.0f, 2, null), 0.0f, m5607constructorimpl, 1, null);
        SliderToTickAnimation = new TweenSpec<>(100, 0, null, 6, null);
    }
}
