package androidx.compose.material3;

import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.ProgressSemanticsKt;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.DraggableKt$draggable$1;
import androidx.compose.foundation.gestures.DraggableKt$draggable$2;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.tokens.SliderTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.util.MathHelpersKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.ifriend.keychain.cipherStorage.CipherStorageKeystoreRsaEcb;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.math.MathKt;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
/* compiled from: Slider.kt */
@Metadata(d1 = {"\u0000ª\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0014\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u001aä\u0001\u0010\u0015\u001a\u00020\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u00182\u0018\u0010\u0019\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0018\u0012\u0004\u0012\u00020\u00160\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u00012\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\b0\u00182\u0010\b\u0002\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010 2\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020$2\u0019\b\u0002\u0010&\u001a\u0013\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u00160\u001a¢\u0006\u0002\b(2\u0019\b\u0002\u0010)\u001a\u0013\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u00160\u001a¢\u0006\u0002\b(2\u0019\b\u0002\u0010*\u001a\u0013\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u00160\u001a¢\u0006\u0002\b(2\b\b\u0002\u0010+\u001a\u00020,H\u0007¢\u0006\u0002\u0010-\u001a\u007f\u0010\u0015\u001a\u00020\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u00182\u0018\u0010\u0019\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0018\u0012\u0004\u0012\u00020\u00160\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u00012\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\b0\u00182\b\b\u0002\u0010+\u001a\u00020,2\u0010\b\u0002\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010 2\b\b\u0002\u0010!\u001a\u00020\"H\u0007¢\u0006\u0002\u0010.\u001aÈ\u0001\u0010/\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u00012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u00182\u0018\u0010\u0019\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0018\u0012\u0004\u0012\u00020\u00160\u001a2\u0006\u0010\u001c\u001a\u00020\u001d2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\b0\u00182\b\b\u0002\u0010+\u001a\u00020,2\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010 2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020$2\u0017\u0010&\u001a\u0013\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u00160\u001a¢\u0006\u0002\b(2\u0017\u0010)\u001a\u0013\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u00160\u001a¢\u0006\u0002\b(2\u0017\u0010*\u001a\u0013\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u00160\u001a¢\u0006\u0002\b(H\u0003¢\u0006\u0002\u00100\u001a³\u0001\u00101\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\b2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00160\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u00012\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\b0\u00182\u0010\b\u0002\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010 2\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u00102\u001a\u00020$2\u0019\b\u0002\u00103\u001a\u0013\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u00160\u001a¢\u0006\u0002\b(2\u0019\b\u0002\u0010*\u001a\u0013\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u00160\u001a¢\u0006\u0002\b(2\b\b\u0002\u0010+\u001a\u00020,H\u0007¢\u0006\u0002\u00104\u001a}\u00101\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\b2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00160\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u00012\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\b0\u00182\b\b\u0002\u0010+\u001a\u00020,2\u0010\b\u0002\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010 2\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u00102\u001a\u00020$H\u0007¢\u0006\u0002\u00105\u001a\u0099\u0001\u00106\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u00102\u001a\u00020$2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00160\u001a2\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010 2\u0006\u0010+\u001a\u00020,2\u0006\u0010\u0017\u001a\u00020\b2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\b0\u00182\u0017\u00103\u001a\u0013\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u00160\u001a¢\u0006\u0002\b(2\u0017\u0010*\u001a\u0013\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u00160\u001a¢\u0006\u0002\b(H\u0003¢\u0006\u0002\u00107\u001a1\u00108\u001a\u00020\u00162\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020\b2\u0006\u0010<\u001a\u00020\b2\u0006\u0010=\u001a\u00020\bH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010>\u001a \u0010?\u001a\u00020\b2\u0006\u0010@\u001a\u00020\b2\u0006\u0010A\u001a\u00020\b2\u0006\u0010B\u001a\u00020\bH\u0002\u001a0\u0010C\u001a\u00020\b2\u0006\u0010D\u001a\u00020\b2\u0006\u0010E\u001a\u00020\b2\u0006\u0010F\u001a\u00020\b2\u0006\u0010G\u001a\u00020\b2\u0006\u0010H\u001a\u00020\bH\u0002\u001a<\u0010C\u001a\b\u0012\u0004\u0012\u00020\b0\u00182\u0006\u0010D\u001a\u00020\b2\u0006\u0010E\u001a\u00020\b2\f\u0010I\u001a\b\u0012\u0004\u0012\u00020\b0\u00182\u0006\u0010G\u001a\u00020\b2\u0006\u0010H\u001a\u00020\bH\u0002\u001a(\u0010J\u001a\u00020\b2\u0006\u0010;\u001a\u00020\b2\u0006\u0010K\u001a\u00020L2\u0006\u0010M\u001a\u00020\b2\u0006\u0010N\u001a\u00020\bH\u0002\u001a\u0010\u0010O\u001a\u00020L2\u0006\u0010+\u001a\u00020,H\u0002\u001a;\u0010P\u001a\u0010\u0012\u0004\u0012\u00020R\u0012\u0004\u0012\u00020\b\u0018\u00010Q*\u00020S2\u0006\u0010T\u001a\u00020U2\u0006\u0010V\u001a\u00020WH\u0082@ø\u0001\u0001ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\bX\u0010Y\u001a\u0098\u0001\u0010Z\u001a\u00020\u0001*\u00020\u00012\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020$2\f\u0010[\u001a\b\u0012\u0004\u0012\u00020\b0\\2\f\u0010]\u001a\b\u0012\u0004\u0012\u00020\b0\\2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010^\u001a\u00020\u001d2\u0006\u0010N\u001a\u00020,2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\b0\u00182\u0018\u0010_\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00160\u001a0\\2\u001e\u0010`\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00160a0\\H\u0002\u001a\\\u0010b\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00160\u001a2\u0010\b\u0002\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010 2\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\b0\u00182\b\b\u0002\u0010+\u001a\u00020,H\u0002\u001ad\u0010c\u001a\u00020\u0001*\u00020\u00012\u0006\u00109\u001a\u00020:2\u0006\u00102\u001a\u00020$2\u0006\u0010N\u001a\u00020,2\u0006\u0010^\u001a\u00020\u001d2\f\u0010d\u001a\b\u0012\u0004\u0012\u00020\b0\\2\u0012\u0010_\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160 0\\2\f\u0010e\u001a\b\u0012\u0004\u0012\u00020\b0f2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0013\u0010\u0002\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0004\"\u0013\u0010\u0005\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0004\"\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0013\u0010\t\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0004\"\u0013\u0010\n\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0004\"\u0013\u0010\u000b\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0004\"\u0013\u0010\f\u001a\u00020\rX\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u000e\"\u0019\u0010\u000f\u001a\u00020\u0003X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0010\u0010\u0011\"\u0013\u0010\u0012\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0004\"\u0019\u0010\u0013\u001a\u00020\u0003X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0014\u0010\u0011\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006g"}, d2 = {"DefaultSliderConstraints", "Landroidx/compose/ui/Modifier;", "SliderHeight", "Landroidx/compose/ui/unit/Dp;", "F", "SliderMinWidth", "SliderToTickAnimation", "Landroidx/compose/animation/core/TweenSpec;", "", "ThumbDefaultElevation", "ThumbHeight", "ThumbPressedElevation", "ThumbSize", "Landroidx/compose/ui/unit/DpSize;", "J", "ThumbWidth", "getThumbWidth", "()F", "TickSize", "TrackHeight", "getTrackHeight", "RangeSlider", "", "value", "Lkotlin/ranges/ClosedFloatingPointRange;", "onValueChange", "Lkotlin/Function1;", "modifier", "enabled", "", "valueRange", "onValueChangeFinished", "Lkotlin/Function0;", "colors", "Landroidx/compose/material3/SliderColors;", "startInteractionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "endInteractionSource", "startThumb", "Landroidx/compose/material3/SliderPositions;", "Landroidx/compose/runtime/Composable;", "endThumb", "track", "steps", "", "(Lkotlin/ranges/ClosedFloatingPointRange;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLkotlin/ranges/ClosedFloatingPointRange;Lkotlin/jvm/functions/Function0;Landroidx/compose/material3/SliderColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;ILandroidx/compose/runtime/Composer;III)V", "(Lkotlin/ranges/ClosedFloatingPointRange;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLkotlin/ranges/ClosedFloatingPointRange;ILkotlin/jvm/functions/Function0;Landroidx/compose/material3/SliderColors;Landroidx/compose/runtime/Composer;II)V", "RangeSliderImpl", "(Landroidx/compose/ui/Modifier;Lkotlin/ranges/ClosedFloatingPointRange;Lkotlin/jvm/functions/Function1;ZLkotlin/ranges/ClosedFloatingPointRange;ILkotlin/jvm/functions/Function0;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "Slider", "interactionSource", "thumb", "(FLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLkotlin/ranges/ClosedFloatingPointRange;Lkotlin/jvm/functions/Function0;Landroidx/compose/material3/SliderColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;ILandroidx/compose/runtime/Composer;III)V", "(FLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLkotlin/ranges/ClosedFloatingPointRange;ILkotlin/jvm/functions/Function0;Landroidx/compose/material3/SliderColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "SliderImpl", "(Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;IFLkotlin/ranges/ClosedFloatingPointRange;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "animateToTarget", "draggableState", "Landroidx/compose/foundation/gestures/DraggableState;", "current", TypedValues.AttributesType.S_TARGET, "velocity", "(Landroidx/compose/foundation/gestures/DraggableState;FFFLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "calcFraction", "a", "b", "pos", "scale", "a1", "b1", "x1", "a2", "b2", "x", "snapValueToTick", "tickFractions", "", "minPx", "maxPx", "stepsToTickFractions", "awaitSlop", "Lkotlin/Pair;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "id", "Landroidx/compose/ui/input/pointer/PointerId;", "type", "Landroidx/compose/ui/input/pointer/PointerType;", "awaitSlop-8vUncbI", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "rangeSliderPressDragModifier", "rawOffsetStart", "Landroidx/compose/runtime/State;", "rawOffsetEnd", "isRtl", "gestureEndAction", "onDrag", "Lkotlin/Function2;", "sliderSemantics", "sliderTapModifier", "rawOffset", "pressOffset", "Landroidx/compose/runtime/MutableState;", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SliderKt {
    private static final Modifier DefaultSliderConstraints;
    private static final float SliderHeight;
    private static final float SliderMinWidth;
    private static final TweenSpec<Float> SliderToTickAnimation;
    private static final float ThumbDefaultElevation;
    private static final float ThumbHeight;
    private static final float ThumbPressedElevation;
    private static final long ThumbSize;
    private static final float ThumbWidth;
    private static final float TickSize;
    private static final float TrackHeight;

    /* JADX WARN: Removed duplicated region for block: B:100:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x010b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Slider(float f, Function1<? super Float, Unit> onValueChange, Modifier modifier, boolean z, ClosedFloatingPointRange<Float> closedFloatingPointRange, int i, Function0<Unit> function0, SliderColors sliderColors, MutableInteractionSource mutableInteractionSource, Composer composer, int i2, int i3) {
        int i4;
        int i5;
        Object obj;
        int i6;
        int i7;
        int i8;
        Object obj2;
        SliderColors sliderColors2;
        int i9;
        ClosedFloatingPointRange<Float> closedFloatingPointRange2;
        Modifier modifier2;
        boolean z2;
        Object obj3;
        int i10;
        Object obj4;
        MutableInteractionSource mutableInteractionSource2;
        SliderColors sliderColors3;
        Composer composer2;
        Modifier modifier3;
        ClosedFloatingPointRange<Float> closedFloatingPointRange3;
        int i11;
        Function0<Unit> function02;
        boolean z3;
        MutableInteractionSource mutableInteractionSource3;
        SliderColors sliderColors4;
        int i12;
        int i13;
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        Composer startRestartGroup = composer.startRestartGroup(-202044027);
        ComposerKt.sourceInformation(startRestartGroup, "C(Slider)P(7,4,3,1,8,6,5)155@7443L8,156@7503L39,160@7603L705:Slider.kt#uh7d8r");
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
            i4 |= startRestartGroup.changed(modifier) ? 256 : 128;
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
            } else if ((i2 & 7168) == 0) {
                i4 |= startRestartGroup.changed(z) ? 2048 : 1024;
                if ((i2 & 57344) == 0) {
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
                } else if ((i2 & 458752) == 0) {
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
                    if ((i2 & 29360128) != 0) {
                        if ((i3 & 128) == 0) {
                            sliderColors2 = sliderColors;
                            if (startRestartGroup.changed(sliderColors2)) {
                                i12 = 8388608;
                                i4 |= i12;
                            }
                        } else {
                            sliderColors2 = sliderColors;
                        }
                        i12 = 4194304;
                        i4 |= i12;
                    } else {
                        sliderColors2 = sliderColors;
                    }
                    i9 = i3 & 256;
                    if (i9 == 0) {
                        i4 |= 100663296;
                    } else if ((i2 & 234881024) == 0) {
                        i4 |= startRestartGroup.changed(mutableInteractionSource) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                    }
                    if ((i4 & 191739611) == 38347922 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i2 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            Modifier.Companion companion = i14 == 0 ? Modifier.Companion : modifier;
                            boolean z4 = i5 == 0 ? true : z;
                            if ((i3 & 16) == 0) {
                                closedFloatingPointRange2 = RangesKt.rangeTo(0.0f, 1.0f);
                                i4 &= -57345;
                            } else {
                                closedFloatingPointRange2 = obj;
                            }
                            int i15 = i6 == 0 ? 0 : i7;
                            Object obj5 = i8 == 0 ? null : obj2;
                            if ((i3 & 128) != 0) {
                                sliderColors2 = SliderDefaults.INSTANCE.m1975colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, startRestartGroup, 0, 6, AnalyticsListener.EVENT_DRM_KEYS_LOADED);
                                i4 &= -29360129;
                            }
                            if (i9 == 0) {
                                startRestartGroup.startReplaceableGroup(-492369756);
                                ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                                Object rememberedValue = startRestartGroup.rememberedValue();
                                if (rememberedValue == Composer.Companion.getEmpty()) {
                                    rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                startRestartGroup.endReplaceableGroup();
                                modifier2 = companion;
                                z2 = z4;
                                obj3 = closedFloatingPointRange2;
                                i10 = i15;
                                obj4 = obj5;
                                mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
                            } else {
                                modifier2 = companion;
                                z2 = z4;
                                obj3 = closedFloatingPointRange2;
                                i10 = i15;
                                obj4 = obj5;
                                mutableInteractionSource2 = mutableInteractionSource;
                            }
                            sliderColors3 = sliderColors2;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i3 & 16) != 0) {
                                i4 &= -57345;
                            }
                            if ((i3 & 128) != 0) {
                                i4 &= -29360129;
                            }
                            sliderColors3 = sliderColors2;
                            obj3 = obj;
                            obj4 = obj2;
                            i10 = i7;
                            modifier2 = modifier;
                            z2 = z;
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-202044027, i4, -1, "androidx.compose.material3.Slider (Slider.kt:146)");
                        }
                        if (i10 < 0) {
                            throw new IllegalArgumentException("steps should be >= 0".toString());
                        }
                        int i16 = i4 >> 6;
                        MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource2;
                        SliderColors sliderColors5 = sliderColors3;
                        boolean z5 = z2;
                        composer2 = startRestartGroup;
                        SliderImpl(modifier2, z2, mutableInteractionSource2, onValueChange, obj4, i10, f, obj3, ComposableLambdaKt.composableLambda(startRestartGroup, -1522452856, true, new SliderKt$Slider$3(mutableInteractionSource2, sliderColors3, z2, i4)), ComposableLambdaKt.composableLambda(startRestartGroup, 686671625, true, new SliderKt$Slider$4(sliderColors3, z2, i4)), startRestartGroup, (i16 & 57344) | (i16 & 14) | 905969664 | (i16 & 112) | ((i4 >> 18) & 896) | ((i4 << 6) & 7168) | (458752 & i4) | ((i4 << 18) & 3670016) | ((i4 << 9) & 29360128));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier2;
                        closedFloatingPointRange3 = obj3;
                        i11 = i10;
                        function02 = obj4;
                        z3 = z5;
                        mutableInteractionSource3 = mutableInteractionSource4;
                        sliderColors4 = sliderColors5;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier3 = modifier;
                        z3 = z;
                        sliderColors4 = sliderColors2;
                        closedFloatingPointRange3 = obj;
                        function02 = obj2;
                        composer2 = startRestartGroup;
                        i11 = i7;
                        mutableInteractionSource3 = mutableInteractionSource;
                    }
                    ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        return;
                    }
                    endRestartGroup.updateScope(new SliderKt$Slider$5(f, onValueChange, modifier3, z3, closedFloatingPointRange3, i11, function02, sliderColors4, mutableInteractionSource3, i2, i3));
                    return;
                }
                i7 = i;
                i8 = i3 & 64;
                if (i8 == 0) {
                }
                if ((i2 & 29360128) != 0) {
                }
                i9 = i3 & 256;
                if (i9 == 0) {
                }
                if ((i4 & 191739611) == 38347922) {
                }
                startRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                }
                if (i14 == 0) {
                }
                if (i5 == 0) {
                }
                if ((i3 & 16) == 0) {
                }
                if (i6 == 0) {
                }
                if (i8 == 0) {
                }
                if ((i3 & 128) != 0) {
                }
                if (i9 == 0) {
                }
                sliderColors3 = sliderColors2;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                if (i10 < 0) {
                }
            }
            if ((i2 & 57344) == 0) {
            }
            i6 = i3 & 32;
            if (i6 != 0) {
            }
            i7 = i;
            i8 = i3 & 64;
            if (i8 == 0) {
            }
            if ((i2 & 29360128) != 0) {
            }
            i9 = i3 & 256;
            if (i9 == 0) {
            }
            if ((i4 & 191739611) == 38347922) {
            }
            startRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
            }
            if (i14 == 0) {
            }
            if (i5 == 0) {
            }
            if ((i3 & 16) == 0) {
            }
            if (i6 == 0) {
            }
            if (i8 == 0) {
            }
            if ((i3 & 128) != 0) {
            }
            if (i9 == 0) {
            }
            sliderColors3 = sliderColors2;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            if (i10 < 0) {
            }
        }
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        if ((i2 & 57344) == 0) {
        }
        i6 = i3 & 32;
        if (i6 != 0) {
        }
        i7 = i;
        i8 = i3 & 64;
        if (i8 == 0) {
        }
        if ((i2 & 29360128) != 0) {
        }
        i9 = i3 & 256;
        if (i9 == 0) {
        }
        if ((i4 & 191739611) == 38347922) {
        }
        startRestartGroup.startDefaults();
        if ((i2 & 1) != 0) {
        }
        if (i14 == 0) {
        }
        if (i5 == 0) {
        }
        if ((i3 & 16) == 0) {
        }
        if (i6 == 0) {
        }
        if (i8 == 0) {
        }
        if ((i3 & 128) != 0) {
        }
        if (i9 == 0) {
        }
        sliderColors3 = sliderColors2;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        if (i10 < 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x012b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Slider(float f, Function1<? super Float, Unit> onValueChange, Modifier modifier, boolean z, ClosedFloatingPointRange<Float> closedFloatingPointRange, Function0<Unit> function0, SliderColors sliderColors, MutableInteractionSource mutableInteractionSource, Function3<? super SliderPositions, ? super Composer, ? super Integer, Unit> function3, Function3<? super SliderPositions, ? super Composer, ? super Integer, Unit> function32, int i, Composer composer, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        ClosedFloatingPointRange<Float> closedFloatingPointRange2;
        SliderColors sliderColors2;
        Modifier modifier2;
        MutableInteractionSource mutableInteractionSource2;
        MutableInteractionSource mutableInteractionSource3;
        boolean z2;
        ComposableLambda composableLambda;
        int i14;
        Function3<? super SliderPositions, ? super Composer, ? super Integer, Unit> function33;
        Function3<? super SliderPositions, ? super Composer, ? super Integer, Unit> function34;
        ClosedFloatingPointRange<Float> closedFloatingPointRange3;
        Function0<Unit> function02;
        SliderColors sliderColors3;
        MutableInteractionSource mutableInteractionSource4;
        Modifier modifier3;
        boolean z3;
        Composer composer2;
        Modifier modifier4;
        boolean z4;
        ClosedFloatingPointRange<Float> closedFloatingPointRange4;
        Function0<Unit> function03;
        SliderColors sliderColors4;
        MutableInteractionSource mutableInteractionSource5;
        Function3<? super SliderPositions, ? super Composer, ? super Integer, Unit> function35;
        Function3<? super SliderPositions, ? super Composer, ? super Integer, Unit> function36;
        int i15;
        int i16;
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        Composer startRestartGroup = composer.startRestartGroup(251663723);
        ComposerKt.sourceInformation(startRestartGroup, "C(Slider)P(9,4,3,1,10,5!2,7,8)250@11737L8,251@11797L39,271@12381L338:Slider.kt#uh7d8r");
        if ((i4 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i5 = (startRestartGroup.changed(f) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 112) == 0) {
            i5 |= startRestartGroup.changedInstance(onValueChange) ? 32 : 16;
        }
        int i17 = i4 & 4;
        if (i17 != 0) {
            i5 |= 384;
        } else if ((i2 & 896) == 0) {
            i5 |= startRestartGroup.changed(modifier) ? 256 : 128;
            i6 = i4 & 8;
            if (i6 == 0) {
                i5 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
            } else if ((i2 & 7168) == 0) {
                i5 |= startRestartGroup.changed(z) ? 2048 : 1024;
                if ((i2 & 57344) == 0) {
                    if ((i4 & 16) == 0 && startRestartGroup.changed(closedFloatingPointRange)) {
                        i16 = 16384;
                        i5 |= i16;
                    }
                    i16 = 8192;
                    i5 |= i16;
                }
                i7 = i4 & 32;
                if (i7 != 0) {
                    i5 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i2 & 458752) == 0) {
                    i5 |= startRestartGroup.changedInstance(function0) ? 131072 : 65536;
                }
                if ((i2 & 3670016) == 0) {
                    i5 |= ((i4 & 64) == 0 && startRestartGroup.changed(sliderColors)) ? 1048576 : 524288;
                }
                i8 = i4 & 128;
                if (i8 != 0) {
                    i5 |= 12582912;
                } else if ((i2 & 29360128) == 0) {
                    i5 |= startRestartGroup.changed(mutableInteractionSource) ? 8388608 : 4194304;
                }
                i9 = i4 & 256;
                if (i9 != 0) {
                    i5 |= 100663296;
                } else if ((i2 & 234881024) == 0) {
                    i5 |= startRestartGroup.changedInstance(function3) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                }
                i10 = i4 & 512;
                if (i10 != 0) {
                    i5 |= C.ENCODING_PCM_32BIT;
                } else if ((i2 & 1879048192) == 0) {
                    i5 |= startRestartGroup.changedInstance(function32) ? 536870912 : 268435456;
                }
                i11 = i4 & 1024;
                if (i11 != 0) {
                    i13 = i3 | 6;
                } else if ((i3 & 14) != 0) {
                    i12 = i3;
                    if ((i5 & 1533916891) == 306783378 || (i12 & 11) != 2 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i2 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            Modifier.Companion companion = i17 == 0 ? Modifier.Companion : modifier;
                            boolean z5 = i6 == 0 ? true : z;
                            if ((i4 & 16) == 0) {
                                closedFloatingPointRange2 = RangesKt.rangeTo(0.0f, 1.0f);
                                i5 &= -57345;
                            } else {
                                closedFloatingPointRange2 = closedFloatingPointRange;
                            }
                            Function0<Unit> function04 = i7 == 0 ? null : function0;
                            if ((i4 & 64) == 0) {
                                sliderColors2 = SliderDefaults.INSTANCE.m1975colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, startRestartGroup, 0, 6, AnalyticsListener.EVENT_DRM_KEYS_LOADED);
                                i5 &= -3670017;
                            } else {
                                sliderColors2 = sliderColors;
                            }
                            if (i8 == 0) {
                                startRestartGroup.startReplaceableGroup(-492369756);
                                ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                                Object rememberedValue = startRestartGroup.rememberedValue();
                                modifier2 = companion;
                                if (rememberedValue == Composer.Companion.getEmpty()) {
                                    rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                startRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
                            } else {
                                modifier2 = companion;
                                mutableInteractionSource2 = mutableInteractionSource;
                            }
                            if (i9 == 0) {
                                SliderKt$Slider$7 sliderKt$Slider$7 = new SliderKt$Slider$7(mutableInteractionSource2, sliderColors2, z5, i5);
                                mutableInteractionSource3 = mutableInteractionSource2;
                                z2 = true;
                                composableLambda = ComposableLambdaKt.composableLambda(startRestartGroup, 1998248322, true, sliderKt$Slider$7);
                            } else {
                                mutableInteractionSource3 = mutableInteractionSource2;
                                z2 = true;
                                composableLambda = function3;
                            }
                            ComposableLambda composableLambda2 = i10 == 0 ? ComposableLambdaKt.composableLambda(startRestartGroup, 1543282935, z2, new SliderKt$Slider$8(sliderColors2, z5, i5)) : function32;
                            if (i11 == 0) {
                                function33 = composableLambda;
                                function34 = composableLambda2;
                                i14 = 0;
                            } else {
                                i14 = i;
                                function33 = composableLambda;
                                function34 = composableLambda2;
                            }
                            closedFloatingPointRange3 = closedFloatingPointRange2;
                            function02 = function04;
                            sliderColors3 = sliderColors2;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            modifier3 = modifier2;
                            z3 = z5;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i4 & 16) != 0) {
                                i5 &= -57345;
                            }
                            if ((i4 & 64) != 0) {
                                i5 &= -3670017;
                            }
                            modifier3 = modifier;
                            z3 = z;
                            closedFloatingPointRange3 = closedFloatingPointRange;
                            function02 = function0;
                            sliderColors3 = sliderColors;
                            mutableInteractionSource4 = mutableInteractionSource;
                            function33 = function3;
                            function34 = function32;
                            i14 = i;
                            z2 = true;
                        }
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(251663723, i5, i12, "androidx.compose.material3.Slider (Slider.kt:243)");
                        }
                        if (i14 < 0 ? z2 : false) {
                            throw new IllegalArgumentException("steps should be >= 0".toString());
                        }
                        int i18 = i5 >> 6;
                        composer2 = startRestartGroup;
                        SliderImpl(modifier3, z3, mutableInteractionSource4, onValueChange, function02, i14, f, closedFloatingPointRange3, function33, function34, startRestartGroup, (i18 & 112) | (i18 & 14) | ((i5 >> 15) & 896) | ((i5 << 6) & 7168) | ((i5 >> 3) & 57344) | ((i12 << 15) & 458752) | ((i5 << 18) & 3670016) | ((i5 << 9) & 29360128) | (i5 & 234881024) | (i5 & 1879048192));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        z4 = z3;
                        closedFloatingPointRange4 = closedFloatingPointRange3;
                        function03 = function02;
                        sliderColors4 = sliderColors3;
                        mutableInteractionSource5 = mutableInteractionSource4;
                        function35 = function33;
                        function36 = function34;
                        i15 = i14;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier4 = modifier;
                        z4 = z;
                        closedFloatingPointRange4 = closedFloatingPointRange;
                        function03 = function0;
                        sliderColors4 = sliderColors;
                        mutableInteractionSource5 = mutableInteractionSource;
                        function35 = function3;
                        function36 = function32;
                        composer2 = startRestartGroup;
                        i15 = i;
                    }
                    ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        return;
                    }
                    endRestartGroup.updateScope(new SliderKt$Slider$10(f, onValueChange, modifier4, z4, closedFloatingPointRange4, function03, sliderColors4, mutableInteractionSource5, function35, function36, i15, i2, i3, i4));
                    return;
                } else {
                    i13 = i3 | (startRestartGroup.changed(i) ? 4 : 2);
                }
                i12 = i13;
                if ((i5 & 1533916891) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                }
                if (i17 == 0) {
                }
                if (i6 == 0) {
                }
                if ((i4 & 16) == 0) {
                }
                if (i7 == 0) {
                }
                if ((i4 & 64) == 0) {
                }
                if (i8 == 0) {
                }
                if (i9 == 0) {
                }
                if (i10 == 0) {
                }
                if (i11 == 0) {
                }
                closedFloatingPointRange3 = closedFloatingPointRange2;
                function02 = function04;
                sliderColors3 = sliderColors2;
                mutableInteractionSource4 = mutableInteractionSource3;
                modifier3 = modifier2;
                z3 = z5;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                if (i14 < 0 ? z2 : false) {
                }
            }
            if ((i2 & 57344) == 0) {
            }
            i7 = i4 & 32;
            if (i7 != 0) {
            }
            if ((i2 & 3670016) == 0) {
            }
            i8 = i4 & 128;
            if (i8 != 0) {
            }
            i9 = i4 & 256;
            if (i9 != 0) {
            }
            i10 = i4 & 512;
            if (i10 != 0) {
            }
            i11 = i4 & 1024;
            if (i11 != 0) {
            }
            i12 = i13;
            if ((i5 & 1533916891) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
            }
            if (i17 == 0) {
            }
            if (i6 == 0) {
            }
            if ((i4 & 16) == 0) {
            }
            if (i7 == 0) {
            }
            if ((i4 & 64) == 0) {
            }
            if (i8 == 0) {
            }
            if (i9 == 0) {
            }
            if (i10 == 0) {
            }
            if (i11 == 0) {
            }
            closedFloatingPointRange3 = closedFloatingPointRange2;
            function02 = function04;
            sliderColors3 = sliderColors2;
            mutableInteractionSource4 = mutableInteractionSource3;
            modifier3 = modifier2;
            z3 = z5;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            if (i14 < 0 ? z2 : false) {
            }
        }
        i6 = i4 & 8;
        if (i6 == 0) {
        }
        if ((i2 & 57344) == 0) {
        }
        i7 = i4 & 32;
        if (i7 != 0) {
        }
        if ((i2 & 3670016) == 0) {
        }
        i8 = i4 & 128;
        if (i8 != 0) {
        }
        i9 = i4 & 256;
        if (i9 != 0) {
        }
        i10 = i4 & 512;
        if (i10 != 0) {
        }
        i11 = i4 & 1024;
        if (i11 != 0) {
        }
        i12 = i13;
        if ((i5 & 1533916891) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i2 & 1) != 0) {
        }
        if (i17 == 0) {
        }
        if (i6 == 0) {
        }
        if ((i4 & 16) == 0) {
        }
        if (i7 == 0) {
        }
        if ((i4 & 64) == 0) {
        }
        if (i8 == 0) {
        }
        if (i9 == 0) {
        }
        if (i10 == 0) {
        }
        if (i11 == 0) {
        }
        closedFloatingPointRange3 = closedFloatingPointRange2;
        function02 = function04;
        sliderColors3 = sliderColors2;
        mutableInteractionSource4 = mutableInteractionSource3;
        modifier3 = modifier2;
        z3 = z5;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        if (i14 < 0 ? z2 : false) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0131  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RangeSlider(ClosedFloatingPointRange<Float> value, Function1<? super ClosedFloatingPointRange<Float>, Unit> onValueChange, Modifier modifier, boolean z, ClosedFloatingPointRange<Float> closedFloatingPointRange, int i, Function0<Unit> function0, SliderColors sliderColors, Composer composer, int i2, int i3) {
        int i4;
        int i5;
        boolean z2;
        Object obj;
        int i6;
        int i7;
        int i8;
        Object obj2;
        Object obj3;
        Modifier modifier2;
        Object obj4;
        Object obj5;
        int i9;
        SliderColors m1975colorsq0g_0yA;
        boolean z3;
        Object rememberedValue;
        Object rememberedValue2;
        Composer composer2;
        Modifier modifier3;
        ClosedFloatingPointRange<Float> closedFloatingPointRange2;
        int i10;
        Function0<Unit> function02;
        boolean z4;
        SliderColors sliderColors2;
        int i11;
        int i12;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        Composer startRestartGroup = composer.startRestartGroup(-743091416);
        ComposerKt.sourceInformation(startRestartGroup, "C(RangeSlider)P(6,3,2,1,7,5,4)328@15054L8,330@15126L39,331@15223L39,335@15320L988:Slider.kt#uh7d8r");
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
        int i13 = i3 & 4;
        if (i13 != 0) {
            i4 |= 384;
        } else if ((i2 & 896) == 0) {
            i4 |= startRestartGroup.changed(modifier) ? 256 : 128;
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
            } else if ((i2 & 7168) == 0) {
                z2 = z;
                i4 |= startRestartGroup.changed(z2) ? 2048 : 1024;
                if ((i2 & 57344) == 0) {
                    if ((i3 & 16) == 0) {
                        obj = closedFloatingPointRange;
                        if (startRestartGroup.changed(obj)) {
                            i12 = 16384;
                            i4 |= i12;
                        }
                    } else {
                        obj = closedFloatingPointRange;
                    }
                    i12 = 8192;
                    i4 |= i12;
                } else {
                    obj = closedFloatingPointRange;
                }
                i6 = i3 & 32;
                if (i6 != 0) {
                    i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i2 & 458752) == 0) {
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
                    if ((i2 & 29360128) != 0) {
                        if ((i3 & 128) == 0) {
                            obj3 = sliderColors;
                            if (startRestartGroup.changed(obj3)) {
                                i11 = 8388608;
                                i4 |= i11;
                            }
                        } else {
                            obj3 = sliderColors;
                        }
                        i11 = 4194304;
                        i4 |= i11;
                    } else {
                        obj3 = sliderColors;
                    }
                    if ((i4 & 23967451) == 4793490 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i2 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            Modifier.Companion companion = i13 == 0 ? Modifier.Companion : modifier;
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
                            if (i8 != 0) {
                                obj2 = null;
                            }
                            if ((i3 & 128) == 0) {
                                i4 &= -29360129;
                                modifier2 = companion;
                                obj4 = obj;
                                obj5 = obj2;
                                i9 = i7;
                                m1975colorsq0g_0yA = SliderDefaults.INSTANCE.m1975colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, startRestartGroup, 0, 6, AnalyticsListener.EVENT_DRM_KEYS_LOADED);
                                z3 = z2;
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-743091416, i4, -1, "androidx.compose.material3.RangeSlider (Slider.kt:319)");
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
                                if (i9 < 0) {
                                    throw new IllegalArgumentException("steps should be >= 0".toString());
                                }
                                int i14 = i4 << 3;
                                SliderColors sliderColors3 = m1975colorsq0g_0yA;
                                boolean z5 = z3;
                                composer2 = startRestartGroup;
                                RangeSliderImpl(modifier2, value, onValueChange, z3, obj4, i9, obj5, mutableInteractionSource, mutableInteractionSource2, ComposableLambdaKt.composableLambda(startRestartGroup, 1361279243, true, new SliderKt$RangeSlider$2(mutableInteractionSource, m1975colorsq0g_0yA, z3, i4)), ComposableLambdaKt.composableLambda(startRestartGroup, 741565023, true, new SliderKt$RangeSlider$3(mutableInteractionSource2, m1975colorsq0g_0yA, z3, i4)), ComposableLambdaKt.composableLambda(startRestartGroup, -298726816, true, new SliderKt$RangeSlider$4(m1975colorsq0g_0yA, z3, i4)), composer2, ((i4 >> 6) & 14) | 918552576 | (i14 & 112) | (i14 & 896) | (i4 & 7168) | (57344 & i4) | (458752 & i4) | (i4 & 3670016), 54, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier3 = modifier2;
                                closedFloatingPointRange2 = obj4;
                                i10 = i9;
                                function02 = obj5;
                                z4 = z5;
                                sliderColors2 = sliderColors3;
                            } else {
                                modifier2 = companion;
                            }
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i3 & 16) != 0) {
                                i4 &= -57345;
                            }
                            if ((i3 & 128) != 0) {
                                i4 &= -29360129;
                            }
                            modifier2 = modifier;
                        }
                        obj4 = obj;
                        obj5 = obj2;
                        i9 = i7;
                        z3 = z2;
                        m1975colorsq0g_0yA = obj3;
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
                        if (i9 < 0) {
                        }
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier3 = modifier;
                        z4 = z2;
                        sliderColors2 = obj3;
                        closedFloatingPointRange2 = obj;
                        function02 = obj2;
                        i10 = i7;
                        composer2 = startRestartGroup;
                    }
                    ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        return;
                    }
                    endRestartGroup.updateScope(new SliderKt$RangeSlider$5(value, onValueChange, modifier3, z4, closedFloatingPointRange2, i10, function02, sliderColors2, i2, i3));
                    return;
                }
                i7 = i;
                i8 = i3 & 64;
                if (i8 == 0) {
                }
                if ((i2 & 29360128) != 0) {
                }
                if ((i4 & 23967451) == 4793490) {
                }
                startRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                }
                if (i13 == 0) {
                }
                if (i5 != 0) {
                }
                if ((i3 & 16) != 0) {
                }
                if (i6 != 0) {
                }
                if (i8 != 0) {
                }
                if ((i3 & 128) == 0) {
                }
            }
            z2 = z;
            if ((i2 & 57344) == 0) {
            }
            i6 = i3 & 32;
            if (i6 != 0) {
            }
            i7 = i;
            i8 = i3 & 64;
            if (i8 == 0) {
            }
            if ((i2 & 29360128) != 0) {
            }
            if ((i4 & 23967451) == 4793490) {
            }
            startRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
            }
            if (i13 == 0) {
            }
            if (i5 != 0) {
            }
            if ((i3 & 16) != 0) {
            }
            if (i6 != 0) {
            }
            if (i8 != 0) {
            }
            if ((i3 & 128) == 0) {
            }
        }
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        z2 = z;
        if ((i2 & 57344) == 0) {
        }
        i6 = i3 & 32;
        if (i6 != 0) {
        }
        i7 = i;
        i8 = i3 & 64;
        if (i8 == 0) {
        }
        if ((i2 & 29360128) != 0) {
        }
        if ((i4 & 23967451) == 4793490) {
        }
        startRestartGroup.startDefaults();
        if ((i2 & 1) != 0) {
        }
        if (i13 == 0) {
        }
        if (i5 != 0) {
        }
        if ((i3 & 16) != 0) {
        }
        if (i6 != 0) {
        }
        if (i8 != 0) {
        }
        if ((i3 & 128) == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0130  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RangeSlider(ClosedFloatingPointRange<Float> value, Function1<? super ClosedFloatingPointRange<Float>, Unit> onValueChange, Modifier modifier, boolean z, ClosedFloatingPointRange<Float> closedFloatingPointRange, Function0<Unit> function0, SliderColors sliderColors, MutableInteractionSource mutableInteractionSource, MutableInteractionSource mutableInteractionSource2, Function3<? super SliderPositions, ? super Composer, ? super Integer, Unit> function3, Function3<? super SliderPositions, ? super Composer, ? super Integer, Unit> function32, Function3<? super SliderPositions, ? super Composer, ? super Integer, Unit> function33, int i, Composer composer, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        Modifier modifier2;
        ClosedFloatingPointRange<Float> closedFloatingPointRange2;
        ClosedFloatingPointRange<Float> closedFloatingPointRange3;
        int i15;
        SliderColors sliderColors2;
        MutableInteractionSource mutableInteractionSource3;
        MutableInteractionSource mutableInteractionSource4;
        MutableInteractionSource mutableInteractionSource5;
        boolean z2;
        ComposableLambda composableLambda;
        ClosedFloatingPointRange<Float> closedFloatingPointRange4;
        int i16;
        MutableInteractionSource mutableInteractionSource6;
        SliderColors sliderColors3;
        Function3<? super SliderPositions, ? super Composer, ? super Integer, Unit> function34;
        Function3<? super SliderPositions, ? super Composer, ? super Integer, Unit> function35;
        Function3<? super SliderPositions, ? super Composer, ? super Integer, Unit> function36;
        boolean z3;
        Function0<Unit> function02;
        MutableInteractionSource mutableInteractionSource7;
        Modifier modifier3;
        Composer composer2;
        Modifier modifier4;
        boolean z4;
        ClosedFloatingPointRange<Float> closedFloatingPointRange5;
        Function0<Unit> function03;
        SliderColors sliderColors4;
        MutableInteractionSource mutableInteractionSource8;
        MutableInteractionSource mutableInteractionSource9;
        Function3<? super SliderPositions, ? super Composer, ? super Integer, Unit> function37;
        Function3<? super SliderPositions, ? super Composer, ? super Integer, Unit> function38;
        Function3<? super SliderPositions, ? super Composer, ? super Integer, Unit> function39;
        int i17;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        Composer startRestartGroup = composer.startRestartGroup(-1048796133);
        ComposerKt.sourceInformation(startRestartGroup, "C(RangeSlider)P(11,5,4,1,12,6!1,7!1,8!1,10)435@20161L8,436@20226L39,437@20320L39,464@21150L445:Slider.kt#uh7d8r");
        if ((i4 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i5 = (startRestartGroup.changed(value) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 112) == 0) {
            i5 |= startRestartGroup.changedInstance(onValueChange) ? 32 : 16;
        }
        int i18 = i4 & 4;
        if (i18 != 0) {
            i5 |= 384;
        } else if ((i2 & 896) == 0) {
            i5 |= startRestartGroup.changed(modifier) ? 256 : 128;
            i6 = i4 & 8;
            if (i6 == 0) {
                i5 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
            } else if ((i2 & 7168) == 0) {
                i5 |= startRestartGroup.changed(z) ? 2048 : 1024;
                if ((i2 & 57344) == 0) {
                    i5 |= ((i4 & 16) == 0 && startRestartGroup.changed(closedFloatingPointRange)) ? 16384 : 8192;
                }
                i7 = i4 & 32;
                if (i7 != 0) {
                    i5 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i2 & 458752) == 0) {
                    i5 |= startRestartGroup.changedInstance(function0) ? 131072 : 65536;
                }
                if ((i2 & 3670016) == 0) {
                    i5 |= ((i4 & 64) == 0 && startRestartGroup.changed(sliderColors)) ? 1048576 : 524288;
                }
                i8 = i4 & 128;
                if (i8 != 0) {
                    i5 |= 12582912;
                } else if ((i2 & 29360128) == 0) {
                    i5 |= startRestartGroup.changed(mutableInteractionSource) ? 8388608 : 4194304;
                }
                i9 = i4 & 256;
                if (i9 != 0) {
                    i5 |= 100663296;
                } else if ((i2 & 234881024) == 0) {
                    i5 |= startRestartGroup.changed(mutableInteractionSource2) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                }
                i10 = i4 & 512;
                if (i10 != 0) {
                    i5 |= C.ENCODING_PCM_32BIT;
                } else if ((i2 & 1879048192) == 0) {
                    i5 |= startRestartGroup.changedInstance(function3) ? 536870912 : 268435456;
                }
                i11 = i4 & 1024;
                if (i11 != 0) {
                    i12 = i3 | 6;
                } else if ((i3 & 14) == 0) {
                    i12 = i3 | (startRestartGroup.changedInstance(function32) ? 4 : 2);
                } else {
                    i12 = i3;
                }
                i13 = i4 & 2048;
                if (i13 != 0) {
                    i12 |= 48;
                } else if ((i3 & 112) == 0) {
                    i12 |= startRestartGroup.changedInstance(function33) ? 32 : 16;
                }
                int i19 = i12;
                i14 = i4 & 4096;
                if (i14 != 0) {
                    i19 |= 384;
                } else if ((i3 & 896) == 0) {
                    i19 |= startRestartGroup.changed(i) ? 256 : 128;
                    if ((i5 & 1533916891) == 306783378 || (i19 & 731) != 146 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i2 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            Modifier.Companion companion = i18 == 0 ? Modifier.Companion : modifier;
                            boolean z5 = i6 == 0 ? true : z;
                            if ((i4 & 16) == 0) {
                                modifier2 = companion;
                                closedFloatingPointRange2 = RangesKt.rangeTo(0.0f, 1.0f);
                                i5 &= -57345;
                            } else {
                                modifier2 = companion;
                                closedFloatingPointRange2 = closedFloatingPointRange;
                            }
                            Function0<Unit> function04 = i7 == 0 ? null : function0;
                            if ((i4 & 64) == 0) {
                                closedFloatingPointRange3 = closedFloatingPointRange2;
                                i15 = i5 & (-3670017);
                                sliderColors2 = SliderDefaults.INSTANCE.m1975colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, startRestartGroup, 0, 6, AnalyticsListener.EVENT_DRM_KEYS_LOADED);
                            } else {
                                closedFloatingPointRange3 = closedFloatingPointRange2;
                                i15 = i5;
                                sliderColors2 = sliderColors;
                            }
                            if (i8 == 0) {
                                startRestartGroup.startReplaceableGroup(-492369756);
                                ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                                Object rememberedValue = startRestartGroup.rememberedValue();
                                if (rememberedValue == Composer.Companion.getEmpty()) {
                                    rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                startRestartGroup.endReplaceableGroup();
                                mutableInteractionSource3 = (MutableInteractionSource) rememberedValue;
                            } else {
                                mutableInteractionSource3 = mutableInteractionSource;
                            }
                            if (i9 == 0) {
                                startRestartGroup.startReplaceableGroup(-492369756);
                                ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                                Object rememberedValue2 = startRestartGroup.rememberedValue();
                                if (rememberedValue2 == Composer.Companion.getEmpty()) {
                                    rememberedValue2 = InteractionSourceKt.MutableInteractionSource();
                                    startRestartGroup.updateRememberedValue(rememberedValue2);
                                }
                                startRestartGroup.endReplaceableGroup();
                                mutableInteractionSource4 = (MutableInteractionSource) rememberedValue2;
                            } else {
                                mutableInteractionSource4 = mutableInteractionSource2;
                            }
                            if (i10 == 0) {
                                SliderKt$RangeSlider$8 sliderKt$RangeSlider$8 = new SliderKt$RangeSlider$8(mutableInteractionSource3, sliderColors2, z5, i15);
                                mutableInteractionSource5 = mutableInteractionSource3;
                                z2 = true;
                                composableLambda = ComposableLambdaKt.composableLambda(startRestartGroup, 585242822, true, sliderKt$RangeSlider$8);
                            } else {
                                mutableInteractionSource5 = mutableInteractionSource3;
                                z2 = true;
                                composableLambda = function3;
                            }
                            ComposableLambda composableLambda2 = i11 == 0 ? ComposableLambdaKt.composableLambda(startRestartGroup, 1397395775, z2, new SliderKt$RangeSlider$9(mutableInteractionSource4, sliderColors2, z5, i15)) : function32;
                            ComposableLambda composableLambda3 = i13 == 0 ? ComposableLambdaKt.composableLambda(startRestartGroup, -2139066097, z2, new SliderKt$RangeSlider$10(sliderColors2, z5, i15)) : function33;
                            if (i14 == 0) {
                                closedFloatingPointRange4 = closedFloatingPointRange3;
                                mutableInteractionSource6 = mutableInteractionSource4;
                                sliderColors3 = sliderColors2;
                                function34 = composableLambda;
                                function35 = composableLambda2;
                                i5 = i15;
                                function36 = composableLambda3;
                                i16 = 0;
                            } else {
                                closedFloatingPointRange4 = closedFloatingPointRange3;
                                i16 = i;
                                mutableInteractionSource6 = mutableInteractionSource4;
                                sliderColors3 = sliderColors2;
                                function34 = composableLambda;
                                function35 = composableLambda2;
                                i5 = i15;
                                function36 = composableLambda3;
                            }
                            z3 = z5;
                            function02 = function04;
                            mutableInteractionSource7 = mutableInteractionSource5;
                            modifier3 = modifier2;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i4 & 16) != 0) {
                                i5 &= -57345;
                            }
                            if ((i4 & 64) != 0) {
                                i5 &= -3670017;
                            }
                            modifier3 = modifier;
                            z3 = z;
                            closedFloatingPointRange4 = closedFloatingPointRange;
                            function02 = function0;
                            sliderColors3 = sliderColors;
                            mutableInteractionSource7 = mutableInteractionSource;
                            mutableInteractionSource6 = mutableInteractionSource2;
                            function34 = function3;
                            function35 = function32;
                            function36 = function33;
                            i16 = i;
                            z2 = true;
                        }
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1048796133, i5, i19, "androidx.compose.material3.RangeSlider (Slider.kt:428)");
                        }
                        if (i16 < 0 ? z2 : false) {
                            throw new IllegalArgumentException("steps should be >= 0".toString());
                        }
                        int i20 = i5 << 3;
                        composer2 = startRestartGroup;
                        RangeSliderImpl(modifier3, value, onValueChange, z3, closedFloatingPointRange4, i16, function02, mutableInteractionSource7, mutableInteractionSource6, function34, function35, function36, composer2, ((i5 >> 6) & 14) | (i20 & 112) | (i20 & 896) | (i5 & 7168) | (i5 & 57344) | ((i19 << 9) & 458752) | (i20 & 3670016) | (i5 & 29360128) | (234881024 & i5) | (i5 & 1879048192), (i19 & 14) | (i19 & 112), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        z4 = z3;
                        closedFloatingPointRange5 = closedFloatingPointRange4;
                        function03 = function02;
                        sliderColors4 = sliderColors3;
                        mutableInteractionSource8 = mutableInteractionSource7;
                        mutableInteractionSource9 = mutableInteractionSource6;
                        function37 = function34;
                        function38 = function35;
                        function39 = function36;
                        i17 = i16;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier4 = modifier;
                        z4 = z;
                        closedFloatingPointRange5 = closedFloatingPointRange;
                        function03 = function0;
                        sliderColors4 = sliderColors;
                        mutableInteractionSource8 = mutableInteractionSource;
                        mutableInteractionSource9 = mutableInteractionSource2;
                        function38 = function32;
                        function39 = function33;
                        i17 = i;
                        composer2 = startRestartGroup;
                        function37 = function3;
                    }
                    ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        return;
                    }
                    endRestartGroup.updateScope(new SliderKt$RangeSlider$12(value, onValueChange, modifier4, z4, closedFloatingPointRange5, function03, sliderColors4, mutableInteractionSource8, mutableInteractionSource9, function37, function38, function39, i17, i2, i3, i4));
                    return;
                }
                if ((i5 & 1533916891) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                }
                if (i18 == 0) {
                }
                if (i6 == 0) {
                }
                if ((i4 & 16) == 0) {
                }
                if (i7 == 0) {
                }
                if ((i4 & 64) == 0) {
                }
                if (i8 == 0) {
                }
                if (i9 == 0) {
                }
                if (i10 == 0) {
                }
                if (i11 == 0) {
                }
                if (i13 == 0) {
                }
                if (i14 == 0) {
                }
                z3 = z5;
                function02 = function04;
                mutableInteractionSource7 = mutableInteractionSource5;
                modifier3 = modifier2;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                if (i16 < 0 ? z2 : false) {
                }
            }
            if ((i2 & 57344) == 0) {
            }
            i7 = i4 & 32;
            if (i7 != 0) {
            }
            if ((i2 & 3670016) == 0) {
            }
            i8 = i4 & 128;
            if (i8 != 0) {
            }
            i9 = i4 & 256;
            if (i9 != 0) {
            }
            i10 = i4 & 512;
            if (i10 != 0) {
            }
            i11 = i4 & 1024;
            if (i11 != 0) {
            }
            i13 = i4 & 2048;
            if (i13 != 0) {
            }
            int i192 = i12;
            i14 = i4 & 4096;
            if (i14 != 0) {
            }
            if ((i5 & 1533916891) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
            }
            if (i18 == 0) {
            }
            if (i6 == 0) {
            }
            if ((i4 & 16) == 0) {
            }
            if (i7 == 0) {
            }
            if ((i4 & 64) == 0) {
            }
            if (i8 == 0) {
            }
            if (i9 == 0) {
            }
            if (i10 == 0) {
            }
            if (i11 == 0) {
            }
            if (i13 == 0) {
            }
            if (i14 == 0) {
            }
            z3 = z5;
            function02 = function04;
            mutableInteractionSource7 = mutableInteractionSource5;
            modifier3 = modifier2;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            if (i16 < 0 ? z2 : false) {
            }
        }
        i6 = i4 & 8;
        if (i6 == 0) {
        }
        if ((i2 & 57344) == 0) {
        }
        i7 = i4 & 32;
        if (i7 != 0) {
        }
        if ((i2 & 3670016) == 0) {
        }
        i8 = i4 & 128;
        if (i8 != 0) {
        }
        i9 = i4 & 256;
        if (i9 != 0) {
        }
        i10 = i4 & 512;
        if (i10 != 0) {
        }
        i11 = i4 & 1024;
        if (i11 != 0) {
        }
        i13 = i4 & 2048;
        if (i13 != 0) {
        }
        int i1922 = i12;
        i14 = i4 & 4096;
        if (i14 != 0) {
        }
        if ((i5 & 1533916891) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i2 & 1) != 0) {
        }
        if (i18 == 0) {
        }
        if (i6 == 0) {
        }
        if ((i4 & 16) == 0) {
        }
        if (i7 == 0) {
        }
        if ((i4 & 64) == 0) {
        }
        if (i8 == 0) {
        }
        if (i9 == 0) {
        }
        if (i10 == 0) {
        }
        if (i11 == 0) {
        }
        if (i13 == 0) {
        }
        if (i14 == 0) {
        }
        z3 = z5;
        function02 = function04;
        mutableInteractionSource7 = mutableInteractionSource5;
        modifier3 = modifier2;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        if (i16 < 0 ? z2 : false) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v22 */
    public static final void SliderImpl(Modifier modifier, boolean z, MutableInteractionSource mutableInteractionSource, Function1<? super Float, Unit> function1, Function0<Unit> function0, int i, float f, ClosedFloatingPointRange<Float> closedFloatingPointRange, Function3<? super SliderPositions, ? super Composer, ? super Integer, Unit> function3, Function3<? super SliderPositions, ? super Composer, ? super Integer, Unit> function32, Composer composer, int i2) {
        int i3;
        int i4;
        boolean z2;
        String str;
        float f2;
        String str2;
        float f3;
        int i5;
        MutableState mutableState;
        Composer composer2;
        SliderPositions sliderPositions;
        Modifier draggable;
        Composer composer3;
        Composer startRestartGroup = composer.startRestartGroup(851260148);
        ComposerKt.sourceInformation(startRestartGroup, "C(SliderImpl)P(2!5,8,9)493@22061L74,493@22023L112,499@22161L59,503@22243L45,504@22310L30,512@22682L7,513@22733L57,514@22813L31,518@23040L77,524@23249L492,535@23770L217,558@24427L40,563@24569L2021:Slider.kt#uh7d8r");
        if ((i2 & 14) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            i3 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i2 & 896) == 0) {
            i3 |= startRestartGroup.changed(mutableInteractionSource) ? 256 : 128;
        }
        if ((i2 & 7168) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 2048 : 1024;
        }
        if ((57344 & i2) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 16384 : 8192;
        }
        if ((458752 & i2) == 0) {
            i3 |= startRestartGroup.changed(i) ? 131072 : 65536;
        }
        if ((3670016 & i2) == 0) {
            i3 |= startRestartGroup.changed(f) ? 1048576 : 524288;
        }
        if ((29360128 & i2) == 0) {
            i3 |= startRestartGroup.changed(closedFloatingPointRange) ? 8388608 : 4194304;
        }
        if ((234881024 & i2) == 0) {
            i3 |= startRestartGroup.changedInstance(function3) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((1879048192 & i2) == 0) {
            i3 |= startRestartGroup.changedInstance(function32) ? 536870912 : 268435456;
        }
        int i6 = i3;
        if ((1533916891 & i6) != 306783378 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(851260148, i6, -1, "androidx.compose.material3.SliderImpl (Slider.kt:481)");
            }
            Float valueOf = Float.valueOf(f);
            startRestartGroup.startReplaceableGroup(511388516);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
            boolean changed = startRestartGroup.changed(valueOf) | startRestartGroup.changed(function1);
            SliderKt$SliderImpl$onValueChangeState$1$1 rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new SliderKt$SliderImpl$onValueChangeState$1$1(f, function1);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(rememberedValue, startRestartGroup, 0);
            Integer valueOf2 = Integer.valueOf(i);
            startRestartGroup.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
            boolean changed2 = startRestartGroup.changed(valueOf2);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = stepsToTickFractions(i);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceableGroup();
            float[] fArr = (float[]) rememberedValue2;
            startRestartGroup.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == Composer.Companion.getEmpty()) {
                rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(getThumbWidth()), null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            startRestartGroup.endReplaceableGroup();
            MutableState mutableState2 = (MutableState) rememberedValue3;
            startRestartGroup.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == Composer.Companion.getEmpty()) {
                rememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            startRestartGroup.endReplaceableGroup();
            final MutableState mutableState3 = (MutableState) rememberedValue4;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (consume == LayoutDirection.Rtl) {
                z2 = true;
                i4 = -492369756;
            } else {
                i4 = -492369756;
                z2 = false;
            }
            startRestartGroup.startReplaceableGroup(i4);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
            Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (rememberedValue5 == Composer.Companion.getEmpty()) {
                rememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(SliderImpl$scaleToOffset(closedFloatingPointRange, 0.0f, 0.0f, f)), null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            startRestartGroup.endReplaceableGroup();
            MutableState mutableState4 = (MutableState) rememberedValue5;
            startRestartGroup.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
            Object rememberedValue6 = startRestartGroup.rememberedValue();
            if (rememberedValue6 == Composer.Companion.getEmpty()) {
                str = "CC:CompositionLocal.kt#9igjgp";
                rememberedValue6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(0.0f), null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue6);
            } else {
                str = "CC:CompositionLocal.kt#9igjgp";
            }
            startRestartGroup.endReplaceableGroup();
            MutableState mutableState5 = (MutableState) rememberedValue6;
            float calcFraction = calcFraction(closedFloatingPointRange.getStart().floatValue(), closedFloatingPointRange.getEndInclusive().floatValue(), RangesKt.coerceIn(f, closedFloatingPointRange.getStart().floatValue(), closedFloatingPointRange.getEndInclusive().floatValue()));
            startRestartGroup.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
            Object rememberedValue7 = startRestartGroup.rememberedValue();
            if (rememberedValue7 == Composer.Companion.getEmpty()) {
                f2 = 0.0f;
                rememberedValue7 = new SliderPositions(RangesKt.rangeTo(0.0f, calcFraction), fArr);
                startRestartGroup.updateRememberedValue(rememberedValue7);
            } else {
                f2 = 0.0f;
            }
            startRestartGroup.endReplaceableGroup();
            SliderPositions sliderPositions2 = (SliderPositions) rememberedValue7;
            sliderPositions2.setActiveRange$material3_release(RangesKt.rangeTo(f2, calcFraction));
            sliderPositions2.setTickFractions$material3_release(fArr);
            int i7 = i6 >> 21;
            startRestartGroup.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
            boolean changed3 = startRestartGroup.changed(closedFloatingPointRange);
            Object rememberedValue8 = startRestartGroup.rememberedValue();
            if (changed3 || rememberedValue8 == Composer.Companion.getEmpty()) {
                str2 = "CC(remember)P(1):Composables.kt#9igjgp";
                f3 = calcFraction;
                i5 = i6;
                mutableState = mutableState2;
                composer2 = startRestartGroup;
                sliderPositions = sliderPositions2;
                SliderDraggableState sliderDraggableState = new SliderDraggableState(new SliderKt$SliderImpl$draggableState$1$1(mutableState3, mutableState2, mutableState4, mutableState5, fArr, rememberUpdatedState, closedFloatingPointRange));
                composer2.updateRememberedValue(sliderDraggableState);
                rememberedValue8 = sliderDraggableState;
            } else {
                str2 = "CC(remember)P(1):Composables.kt#9igjgp";
                i5 = i6;
                mutableState = mutableState2;
                composer2 = startRestartGroup;
                sliderPositions = sliderPositions2;
                f3 = calcFraction;
            }
            composer2.endReplaceableGroup();
            SliderDraggableState sliderDraggableState2 = (SliderDraggableState) rememberedValue8;
            State rememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(new SliderKt$SliderImpl$gestureEndAction$1(sliderDraggableState2, function0), composer2, 0);
            SliderDraggableState sliderDraggableState3 = sliderDraggableState2;
            Modifier sliderTapModifier = sliderTapModifier(Modifier.Companion, sliderDraggableState3, mutableInteractionSource, ((Number) mutableState3.getValue()).intValue(), z2, mutableState4, rememberUpdatedState2, mutableState5, z);
            Modifier.Companion companion = Modifier.Companion;
            Orientation orientation = Orientation.Horizontal;
            boolean isDragging = sliderDraggableState2.isDragging();
            Modifier.Companion companion2 = companion;
            composer2.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(composer2, str2);
            boolean changed4 = composer2.changed(rememberUpdatedState2);
            SliderKt$SliderImpl$drag$1$1 rememberedValue9 = composer2.rememberedValue();
            if (changed4 || rememberedValue9 == Composer.Companion.getEmpty()) {
                rememberedValue9 = new SliderKt$SliderImpl$drag$1$1(rememberUpdatedState2, null);
                composer2.updateRememberedValue(rememberedValue9);
            }
            composer2.endReplaceableGroup();
            draggable = DraggableKt.draggable(companion2, sliderDraggableState3, orientation, (r20 & 4) != 0 ? true : z, (r20 & 8) != 0 ? null : mutableInteractionSource, (r20 & 16) != 0 ? false : isDragging, (r20 & 32) != 0 ? new DraggableKt$draggable$1(null) : null, (r20 & 64) != 0 ? new DraggableKt$draggable$2(null) : rememberedValue9, (r20 & 128) != 0 ? false : z2);
            composer3 = composer2;
            Modifier then = FocusableKt.focusable(sliderSemantics(SizeKt.m791requiredSizeInqDBjuR0$default(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier), SliderTokens.INSTANCE.m2708getHandleWidthD9Ej5fM(), SliderTokens.INSTANCE.m2707getHandleHeightD9Ej5fM(), 0.0f, 0.0f, 12, null), f, z, function1, function0, closedFloatingPointRange, i), z, mutableInteractionSource).then(sliderTapModifier).then(draggable);
            final float f4 = f3;
            final MutableState mutableState6 = mutableState;
            MeasurePolicy measurePolicy = new MeasurePolicy() { // from class: androidx.compose.material3.SliderKt$SliderImpl$2
                @Override // androidx.compose.ui.layout.MeasurePolicy
                public /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i8) {
                    return MeasurePolicy.CC.$default$maxIntrinsicHeight(this, intrinsicMeasureScope, list, i8);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i8) {
                    return MeasurePolicy.CC.$default$maxIntrinsicWidth(this, intrinsicMeasureScope, list, i8);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i8) {
                    return MeasurePolicy.CC.$default$minIntrinsicHeight(this, intrinsicMeasureScope, list, i8);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i8) {
                    return MeasurePolicy.CC.$default$minIntrinsicWidth(this, intrinsicMeasureScope, list, i8);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                /* renamed from: measure-3p2s80s */
                public final MeasureResult mo272measure3p2s80s(MeasureScope Layout, List<? extends Measurable> measurables, long j) {
                    boolean z3;
                    Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
                    Intrinsics.checkNotNullParameter(measurables, "measurables");
                    List<? extends Measurable> list = measurables;
                    for (Measurable measurable : list) {
                        if (LayoutIdKt.getLayoutId(measurable) == SliderComponents.THUMB) {
                            Placeable mo4545measureBRTryo0 = measurable.mo4545measureBRTryo0(j);
                            for (Measurable measurable2 : list) {
                                if (LayoutIdKt.getLayoutId(measurable2) == SliderComponents.TRACK) {
                                    z3 = true;
                                    continue;
                                } else {
                                    z3 = false;
                                    continue;
                                }
                                if (z3) {
                                    Placeable mo4545measureBRTryo02 = measurable2.mo4545measureBRTryo0(Constraints.m5542copyZbe2FdA$default(ConstraintsKt.m5568offsetNN6EwU$default(j, -mo4545measureBRTryo0.getWidth(), 0, 2, null), 0, 0, 0, 0, 11, null));
                                    int width = mo4545measureBRTryo02.getWidth() + mo4545measureBRTryo0.getWidth();
                                    int max = Math.max(mo4545measureBRTryo02.getHeight(), mo4545measureBRTryo0.getHeight());
                                    mutableState6.setValue(Float.valueOf(mo4545measureBRTryo0.getWidth()));
                                    mutableState3.setValue(Integer.valueOf(width));
                                    return MeasureScope.CC.layout$default(Layout, width, max, null, new SliderKt$SliderImpl$2$measure$1(mo4545measureBRTryo02, mo4545measureBRTryo0.getWidth() / 2, (max - mo4545measureBRTryo02.getHeight()) / 2, mo4545measureBRTryo0, MathKt.roundToInt(mo4545measureBRTryo02.getWidth() * f4), (max - mo4545measureBRTryo0.getHeight()) / 2), 4, null);
                                }
                            }
                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
            };
            composer3.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(composer3, "CC(Layout)P(!1,2)73@2855L7,74@2910L7,75@2969L7,76@2981L460:Layout.kt#80mrfh");
            String str3 = str;
            ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, str3);
            Object consume2 = composer3.consume(CompositionLocalsKt.getLocalDensity());
            ComposerKt.sourceInformationMarkerEnd(composer3);
            Density density = (Density) consume2;
            ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, str3);
            Object consume3 = composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ComposerKt.sourceInformationMarkerEnd(composer3);
            LayoutDirection layoutDirection = (LayoutDirection) consume3;
            ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, str3);
            Object consume4 = composer3.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposerKt.sourceInformationMarkerEnd(composer3);
            ViewConfiguration viewConfiguration = (ViewConfiguration) consume4;
            Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(then);
            if (!(composer3.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer3.startReusableNode();
            if (composer3.getInserting()) {
                composer3.createNode(constructor);
            } else {
                composer3.useNode();
            }
            Composer m2893constructorimpl = Updater.m2893constructorimpl(composer3);
            Updater.m2900setimpl(m2893constructorimpl, measurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2900setimpl(m2893constructorimpl, density, ComposeUiNode.Companion.getSetDensity());
            Updater.m2900setimpl(m2893constructorimpl, layoutDirection, ComposeUiNode.Companion.getSetLayoutDirection());
            Updater.m2900setimpl(m2893constructorimpl, viewConfiguration, ComposeUiNode.Companion.getSetViewConfiguration());
            materializerOf.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(composer3)), composer3, 0);
            composer3.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(composer3, 1541256180, "C565@24599L84,566@24696L84:Slider.kt#uh7d8r");
            Modifier layoutId = LayoutIdKt.layoutId(Modifier.Companion, SliderComponents.THUMB);
            composer3.startReplaceableGroup(733328855);
            ComposerKt.sourceInformation(composer3, "CC(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, composer3, 0);
            composer3.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(composer3, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
            ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume5 = composer3.consume(CompositionLocalsKt.getLocalDensity());
            ComposerKt.sourceInformationMarkerEnd(composer3);
            Density density2 = (Density) consume5;
            ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume6 = composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ComposerKt.sourceInformationMarkerEnd(composer3);
            LayoutDirection layoutDirection2 = (LayoutDirection) consume6;
            ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume7 = composer3.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposerKt.sourceInformationMarkerEnd(composer3);
            ViewConfiguration viewConfiguration2 = (ViewConfiguration) consume7;
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf2 = LayoutKt.materializerOf(layoutId);
            if (!(composer3.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer3.startReusableNode();
            if (composer3.getInserting()) {
                composer3.createNode(constructor2);
            } else {
                composer3.useNode();
            }
            composer3.disableReusing();
            Composer m2893constructorimpl2 = Updater.m2893constructorimpl(composer3);
            Updater.m2900setimpl(m2893constructorimpl2, rememberBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2900setimpl(m2893constructorimpl2, density2, ComposeUiNode.Companion.getSetDensity());
            Updater.m2900setimpl(m2893constructorimpl2, layoutDirection2, ComposeUiNode.Companion.getSetLayoutDirection());
            Updater.m2900setimpl(m2893constructorimpl2, viewConfiguration2, ComposeUiNode.Companion.getSetViewConfiguration());
            composer3.enableReusing();
            materializerOf2.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(composer3)), composer3, 0);
            composer3.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(composer3, -1253629305, "C72@3384L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer3, -1819487535, "C565@24659L22:Slider.kt#uh7d8r");
            SliderPositions sliderPositions3 = sliderPositions;
            function3.invoke(sliderPositions3, composer3, Integer.valueOf((i7 & 112) | 6));
            ComposerKt.sourceInformationMarkerEnd(composer3);
            ComposerKt.sourceInformationMarkerEnd(composer3);
            composer3.endReplaceableGroup();
            composer3.endNode();
            composer3.endReplaceableGroup();
            composer3.endReplaceableGroup();
            Modifier layoutId2 = LayoutIdKt.layoutId(Modifier.Companion, SliderComponents.TRACK);
            composer3.startReplaceableGroup(733328855);
            ComposerKt.sourceInformation(composer3, "CC(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
            MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, composer3, 0);
            composer3.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(composer3, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
            ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume8 = composer3.consume(CompositionLocalsKt.getLocalDensity());
            ComposerKt.sourceInformationMarkerEnd(composer3);
            Density density3 = (Density) consume8;
            ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume9 = composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ComposerKt.sourceInformationMarkerEnd(composer3);
            LayoutDirection layoutDirection3 = (LayoutDirection) consume9;
            ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume10 = composer3.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposerKt.sourceInformationMarkerEnd(composer3);
            ViewConfiguration viewConfiguration3 = (ViewConfiguration) consume10;
            Function0<ComposeUiNode> constructor3 = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf3 = LayoutKt.materializerOf(layoutId2);
            if (!(composer3.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer3.startReusableNode();
            if (composer3.getInserting()) {
                composer3.createNode(constructor3);
            } else {
                composer3.useNode();
            }
            composer3.disableReusing();
            Composer m2893constructorimpl3 = Updater.m2893constructorimpl(composer3);
            Updater.m2900setimpl(m2893constructorimpl3, rememberBoxMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2900setimpl(m2893constructorimpl3, density3, ComposeUiNode.Companion.getSetDensity());
            Updater.m2900setimpl(m2893constructorimpl3, layoutDirection3, ComposeUiNode.Companion.getSetLayoutDirection());
            Updater.m2900setimpl(m2893constructorimpl3, viewConfiguration3, ComposeUiNode.Companion.getSetViewConfiguration());
            composer3.enableReusing();
            materializerOf3.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(composer3)), composer3, 0);
            composer3.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(composer3, -1253629305, "C72@3384L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer3, -1819487438, "C566@24756L22:Slider.kt#uh7d8r");
            function32.invoke(sliderPositions3, composer3, Integer.valueOf(((i5 >> 24) & 112) | 6));
            ComposerKt.sourceInformationMarkerEnd(composer3);
            ComposerKt.sourceInformationMarkerEnd(composer3);
            composer3.endReplaceableGroup();
            composer3.endNode();
            composer3.endReplaceableGroup();
            composer3.endReplaceableGroup();
            ComposerKt.sourceInformationMarkerEnd(composer3);
            composer3.endReplaceableGroup();
            composer3.endNode();
            composer3.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer3 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer3.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new SliderKt$SliderImpl$3(modifier, z, mutableInteractionSource, function1, function0, i, f, closedFloatingPointRange, function3, function32, i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float SliderImpl$scaleToUserValue(ClosedFloatingPointRange<Float> closedFloatingPointRange, float f, float f2, float f3) {
        return scale(f, f2, f3, closedFloatingPointRange.getStart().floatValue(), closedFloatingPointRange.getEndInclusive().floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float SliderImpl$scaleToOffset(ClosedFloatingPointRange<Float> closedFloatingPointRange, float f, float f2, float f3) {
        return scale(closedFloatingPointRange.getStart().floatValue(), closedFloatingPointRange.getEndInclusive().floatValue(), f3, f, f2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x01be, code lost:
        if (r5 == androidx.compose.runtime.Composer.Companion.getEmpty()) goto L154;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0495  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x04f3  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x05d0  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x05dc  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x05e0  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0648  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x06db  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x06e7  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x06eb  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0783  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0814  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0820  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0824  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0911  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x091d  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0921  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x09aa  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x09b6  */
    /* JADX WARN: Removed duplicated region for block: B:241:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x011d  */
    /* JADX WARN: Type inference failed for: r0v154 */
    /* JADX WARN: Type inference failed for: r0v155 */
    /* JADX WARN: Type inference failed for: r0v53, types: [T] */
    /* JADX WARN: Type inference failed for: r2v33 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RangeSliderImpl(Modifier modifier, final ClosedFloatingPointRange<Float> closedFloatingPointRange, Function1<? super ClosedFloatingPointRange<Float>, Unit> function1, boolean z, final ClosedFloatingPointRange<Float> closedFloatingPointRange2, int i, Function0<Unit> function0, MutableInteractionSource mutableInteractionSource, MutableInteractionSource mutableInteractionSource2, Function3<? super SliderPositions, ? super Composer, ? super Integer, Unit> function3, Function3<? super SliderPositions, ? super Composer, ? super Integer, Unit> function32, Function3<? super SliderPositions, ? super Composer, ? super Integer, Unit> function33, Composer composer, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean changed;
        int i15;
        boolean changed2;
        Object rememberedValue;
        Object rememberedValue2;
        Object rememberedValue3;
        Object rememberedValue4;
        Object rememberedValue5;
        String str;
        ?? r0;
        Object rememberedValue6;
        Object rememberedValue7;
        String str2;
        boolean changed3;
        SliderKt$RangeSliderImpl$gestureEndAction$1$1 rememberedValue8;
        Composer composer2;
        Object rememberedValue9;
        float[] fArr;
        boolean changed4;
        SliderKt$RangeSliderImpl$startThumbSemantics$1$1 rememberedValue10;
        boolean changed5;
        SliderKt$RangeSliderImpl$endThumbSemantics$1$1 rememberedValue11;
        boolean changed6;
        SliderKt$RangeSliderImpl$1$1$1 rememberedValue12;
        boolean changed7;
        SliderKt$RangeSliderImpl$1$3$1 rememberedValue13;
        int i16;
        MutableState mutableStateOf$default;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(2067530570);
        ComposerKt.sourceInformation(startRestartGroup, "C(RangeSliderImpl)P(3,10,4!1,11,8,5,6!1,7)641@27264L74,641@27200L138,647@27364L59,651@27452L45,652@27523L45,653@27591L30,655@27660L7,665@28240L34,666@28300L31,667@28355L31,669@28455L47,669@28415L87,673@28521L1112,718@30413L133,733@30914L73,741@31182L75,747@31395L35,748@31463L33,750@31502L4199:Slider.kt#uh7d8r");
        if ((i4 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i5 = (startRestartGroup.changed(modifier) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 112) == 0) {
            i5 |= startRestartGroup.changed(closedFloatingPointRange) ? 32 : 16;
        }
        if ((i4 & 4) != 0) {
            i5 |= 384;
        } else if ((i2 & 896) == 0) {
            i5 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i4 & 8) != 0) {
            i5 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
        } else if ((i2 & 7168) == 0) {
            i5 |= startRestartGroup.changed(z) ? 2048 : 1024;
        }
        if ((i4 & 16) != 0) {
            i5 |= 24576;
        } else if ((57344 & i2) == 0) {
            i5 |= startRestartGroup.changed(closedFloatingPointRange2) ? 16384 : 8192;
            i6 = i4 & 32;
            if (i6 == 0) {
                i5 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((i2 & 458752) == 0) {
                i5 |= startRestartGroup.changed(i) ? 131072 : 65536;
            }
            if ((i4 & 64) == 0) {
                i7 = 1572864;
            } else {
                if ((i2 & 3670016) == 0) {
                    i7 = startRestartGroup.changedInstance(function0) ? 1048576 : 524288;
                }
                if ((i4 & 128) != 0) {
                    i8 = 12582912;
                } else {
                    if ((29360128 & i2) == 0) {
                        i8 = startRestartGroup.changed(mutableInteractionSource) ? 8388608 : 4194304;
                    }
                    if ((i4 & 256) == 0) {
                        i9 = 100663296;
                    } else {
                        if ((234881024 & i2) == 0) {
                            i9 = startRestartGroup.changed(mutableInteractionSource2) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                        }
                        if ((i4 & 512) == 0) {
                            if ((1879048192 & i2) == 0) {
                                i10 = startRestartGroup.changedInstance(function3) ? 536870912 : 268435456;
                            }
                            i11 = i5;
                            if ((i4 & 1024) == 0) {
                                i12 = i3 | 6;
                            } else if ((i3 & 14) == 0) {
                                i12 = i3 | (startRestartGroup.changedInstance(function32) ? 4 : 2);
                            } else {
                                i12 = i3;
                            }
                            if ((i4 & 2048) == 0) {
                                i12 |= 48;
                            } else if ((i3 & 112) == 0) {
                                i12 |= startRestartGroup.changedInstance(function33) ? 32 : 16;
                            }
                            i13 = i12;
                            if ((1533916891 & i11) == 306783378 || (i13 & 91) != 18 || !startRestartGroup.getSkipping()) {
                                i14 = i6 == 0 ? 0 : i;
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(2067530570, i11, i13, "androidx.compose.material3.RangeSliderImpl (Slider.kt:627)");
                                }
                                startRestartGroup.startReplaceableGroup(511388516);
                                ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
                                changed = startRestartGroup.changed(closedFloatingPointRange) | startRestartGroup.changed(function1);
                                SliderKt$RangeSliderImpl$onValueChangeState$1$1 rememberedValue14 = startRestartGroup.rememberedValue();
                                if (changed) {
                                    i15 = i11;
                                } else {
                                    i15 = i11;
                                }
                                rememberedValue14 = new SliderKt$RangeSliderImpl$onValueChangeState$1$1(closedFloatingPointRange, function1);
                                startRestartGroup.updateRememberedValue(rememberedValue14);
                                startRestartGroup.endReplaceableGroup();
                                State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(rememberedValue14, startRestartGroup, 0);
                                Integer valueOf = Integer.valueOf(i14);
                                startRestartGroup.startReplaceableGroup(1157296644);
                                ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                                changed2 = startRestartGroup.changed(valueOf);
                                rememberedValue = startRestartGroup.rememberedValue();
                                if (!changed2 || rememberedValue == Composer.Companion.getEmpty()) {
                                    rememberedValue = stepsToTickFractions(i14);
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                startRestartGroup.endReplaceableGroup();
                                float[] fArr2 = (float[]) rememberedValue;
                                startRestartGroup.startReplaceableGroup(-492369756);
                                ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                                int i17 = i14;
                                rememberedValue2 = startRestartGroup.rememberedValue();
                                if (rememberedValue2 == Composer.Companion.getEmpty()) {
                                    rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(getThumbWidth()), null, 2, null);
                                    startRestartGroup.updateRememberedValue(rememberedValue2);
                                }
                                startRestartGroup.endReplaceableGroup();
                                final MutableState mutableState = (MutableState) rememberedValue2;
                                startRestartGroup.startReplaceableGroup(-492369756);
                                ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                                rememberedValue3 = startRestartGroup.rememberedValue();
                                if (rememberedValue3 == Composer.Companion.getEmpty()) {
                                    rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(getThumbWidth()), null, 2, null);
                                    startRestartGroup.updateRememberedValue(rememberedValue3);
                                }
                                startRestartGroup.endReplaceableGroup();
                                final MutableState mutableState2 = (MutableState) rememberedValue3;
                                startRestartGroup.startReplaceableGroup(-492369756);
                                ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                                rememberedValue4 = startRestartGroup.rememberedValue();
                                if (rememberedValue4 == Composer.Companion.getEmpty()) {
                                    rememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
                                    startRestartGroup.updateRememberedValue(rememberedValue4);
                                }
                                startRestartGroup.endReplaceableGroup();
                                final MutableState mutableState3 = (MutableState) rememberedValue4;
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                Object consume = startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                boolean z2 = consume != LayoutDirection.Rtl;
                                final Ref.ObjectRef objectRef = new Ref.ObjectRef();
                                startRestartGroup.startReplaceableGroup(-492369756);
                                ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                                rememberedValue5 = startRestartGroup.rememberedValue();
                                if (rememberedValue5 != Composer.Companion.getEmpty()) {
                                    str = "CC:CompositionLocal.kt#9igjgp";
                                    mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                                    startRestartGroup.updateRememberedValue(mutableStateOf$default);
                                    r0 = mutableStateOf$default;
                                } else {
                                    str = "CC:CompositionLocal.kt#9igjgp";
                                    r0 = rememberedValue5;
                                }
                                startRestartGroup.endReplaceableGroup();
                                objectRef.element = r0;
                                startRestartGroup.startReplaceableGroup(-492369756);
                                ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                                rememberedValue6 = startRestartGroup.rememberedValue();
                                if (rememberedValue6 == Composer.Companion.getEmpty()) {
                                    rememberedValue6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(0.0f), null, 2, null);
                                    startRestartGroup.updateRememberedValue(rememberedValue6);
                                }
                                startRestartGroup.endReplaceableGroup();
                                final MutableState mutableState4 = (MutableState) rememberedValue6;
                                startRestartGroup.startReplaceableGroup(-492369756);
                                ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                                rememberedValue7 = startRestartGroup.rememberedValue();
                                if (rememberedValue7 != Composer.Companion.getEmpty()) {
                                    str2 = "CC(remember):Composables.kt#9igjgp";
                                    rememberedValue7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(0.0f), null, 2, null);
                                    startRestartGroup.updateRememberedValue(rememberedValue7);
                                } else {
                                    str2 = "CC(remember):Composables.kt#9igjgp";
                                }
                                startRestartGroup.endReplaceableGroup();
                                final MutableState mutableState5 = (MutableState) rememberedValue7;
                                startRestartGroup.startReplaceableGroup(1157296644);
                                ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                                changed3 = startRestartGroup.changed(function0);
                                rememberedValue8 = startRestartGroup.rememberedValue();
                                if (!changed3 || rememberedValue8 == Composer.Companion.getEmpty()) {
                                    rememberedValue8 = new SliderKt$RangeSliderImpl$gestureEndAction$1$1(function0);
                                    startRestartGroup.updateRememberedValue(rememberedValue8);
                                }
                                startRestartGroup.endReplaceableGroup();
                                String str3 = str;
                                composer2 = startRestartGroup;
                                Modifier rangeSliderPressDragModifier = rangeSliderPressDragModifier(Modifier.Companion, mutableInteractionSource, mutableInteractionSource2, mutableState4, mutableState5, z, z2, RangeSliderImpl$lambda$31(mutableState3), closedFloatingPointRange2, SnapshotStateKt.rememberUpdatedState(rememberedValue8, startRestartGroup, 0), SnapshotStateKt.rememberUpdatedState(new SliderKt$RangeSliderImpl$onDrag$1(mutableState4, mutableState5, closedFloatingPointRange, fArr2, rememberUpdatedState, mutableState3, mutableState2, mutableState, closedFloatingPointRange2), composer2, 0));
                                float coerceIn = RangesKt.coerceIn(closedFloatingPointRange.getStart().floatValue(), closedFloatingPointRange2.getStart().floatValue(), closedFloatingPointRange.getEndInclusive().floatValue());
                                float coerceIn2 = RangesKt.coerceIn(closedFloatingPointRange.getEndInclusive().floatValue(), closedFloatingPointRange.getStart().floatValue(), closedFloatingPointRange2.getEndInclusive().floatValue());
                                final float calcFraction = calcFraction(closedFloatingPointRange2.getStart().floatValue(), closedFloatingPointRange2.getEndInclusive().floatValue(), coerceIn);
                                final float calcFraction2 = calcFraction(closedFloatingPointRange2.getStart().floatValue(), closedFloatingPointRange2.getEndInclusive().floatValue(), coerceIn2);
                                composer2.startReplaceableGroup(-492369756);
                                ComposerKt.sourceInformation(composer2, str2);
                                rememberedValue9 = composer2.rememberedValue();
                                if (rememberedValue9 != Composer.Companion.getEmpty()) {
                                    fArr = fArr2;
                                    rememberedValue9 = new SliderPositions(RangesKt.rangeTo(calcFraction, calcFraction2), fArr);
                                    composer2.updateRememberedValue(rememberedValue9);
                                } else {
                                    fArr = fArr2;
                                }
                                composer2.endReplaceableGroup();
                                SliderPositions sliderPositions = (SliderPositions) rememberedValue9;
                                sliderPositions.setActiveRange$material3_release(RangesKt.rangeTo(calcFraction, calcFraction2));
                                sliderPositions.setTickFractions$material3_release(fArr);
                                float f = i17;
                                int floor = (int) Math.floor(f * calcFraction2);
                                int floor2 = (int) Math.floor(f * (1.0f - calcFraction));
                                Modifier.Companion companion = Modifier.Companion;
                                Float valueOf2 = Float.valueOf(coerceIn2);
                                composer2.startReplaceableGroup(511388516);
                                ComposerKt.sourceInformation(composer2, "CC(remember)P(1,2):Composables.kt#9igjgp");
                                changed4 = composer2.changed(rememberUpdatedState) | composer2.changed(valueOf2);
                                rememberedValue10 = composer2.rememberedValue();
                                if (!changed4 || rememberedValue10 == Composer.Companion.getEmpty()) {
                                    rememberedValue10 = new SliderKt$RangeSliderImpl$startThumbSemantics$1$1(rememberUpdatedState, coerceIn2);
                                    composer2.updateRememberedValue(rememberedValue10);
                                }
                                composer2.endReplaceableGroup();
                                Modifier sliderSemantics = sliderSemantics(companion, coerceIn, z, (Function1) rememberedValue10, function0, RangesKt.rangeTo(closedFloatingPointRange2.getStart().floatValue(), coerceIn2), floor);
                                Modifier.Companion companion2 = Modifier.Companion;
                                Float valueOf3 = Float.valueOf(coerceIn);
                                composer2.startReplaceableGroup(511388516);
                                ComposerKt.sourceInformation(composer2, "CC(remember)P(1,2):Composables.kt#9igjgp");
                                changed5 = composer2.changed(valueOf3) | composer2.changed(rememberUpdatedState);
                                rememberedValue11 = composer2.rememberedValue();
                                if (!changed5 || rememberedValue11 == Composer.Companion.getEmpty()) {
                                    rememberedValue11 = new SliderKt$RangeSliderImpl$endThumbSemantics$1$1(rememberUpdatedState, coerceIn);
                                    composer2.updateRememberedValue(rememberedValue11);
                                }
                                composer2.endReplaceableGroup();
                                Modifier sliderSemantics2 = sliderSemantics(companion2, coerceIn2, z, rememberedValue11, function0, RangesKt.rangeTo(coerceIn, closedFloatingPointRange2.getEndInclusive().floatValue()), floor2);
                                String m2058getStringNWtq28 = Strings_androidKt.m2058getStringNWtq28(Strings.Companion.m2041getSliderRangeStartadMyvUU(), composer2, 6);
                                String m2058getStringNWtq282 = Strings_androidKt.m2058getStringNWtq28(Strings.Companion.m2040getSliderRangeEndadMyvUU(), composer2, 6);
                                Modifier then = SizeKt.m791requiredSizeInqDBjuR0$default(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier), SliderTokens.INSTANCE.m2708getHandleWidthD9Ej5fM(), SliderTokens.INSTANCE.m2707getHandleHeightD9Ej5fM(), 0.0f, 0.0f, 12, null).then(rangeSliderPressDragModifier);
                                MeasurePolicy measurePolicy = new MeasurePolicy() { // from class: androidx.compose.material3.SliderKt$RangeSliderImpl$2
                                    @Override // androidx.compose.ui.layout.MeasurePolicy
                                    public /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i18) {
                                        return MeasurePolicy.CC.$default$maxIntrinsicHeight(this, intrinsicMeasureScope, list, i18);
                                    }

                                    @Override // androidx.compose.ui.layout.MeasurePolicy
                                    public /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i18) {
                                        return MeasurePolicy.CC.$default$maxIntrinsicWidth(this, intrinsicMeasureScope, list, i18);
                                    }

                                    @Override // androidx.compose.ui.layout.MeasurePolicy
                                    public /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i18) {
                                        return MeasurePolicy.CC.$default$minIntrinsicHeight(this, intrinsicMeasureScope, list, i18);
                                    }

                                    @Override // androidx.compose.ui.layout.MeasurePolicy
                                    public /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i18) {
                                        return MeasurePolicy.CC.$default$minIntrinsicWidth(this, intrinsicMeasureScope, list, i18);
                                    }

                                    @Override // androidx.compose.ui.layout.MeasurePolicy
                                    /* renamed from: measure-3p2s80s */
                                    public final MeasureResult mo272measure3p2s80s(MeasureScope Layout, List<? extends Measurable> measurables, long j) {
                                        boolean z3;
                                        boolean z4;
                                        boolean z5;
                                        float RangeSliderImpl$lambda$25;
                                        float RangeSliderImpl$lambda$28;
                                        int RangeSliderImpl$lambda$31;
                                        float RangeSliderImpl$lambda$282;
                                        float RangeSliderImpl$lambda$252;
                                        float RangeSliderImpl$scaleToOffset$34;
                                        float RangeSliderImpl$scaleToOffset$342;
                                        Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
                                        Intrinsics.checkNotNullParameter(measurables, "measurables");
                                        List<? extends Measurable> list = measurables;
                                        for (Measurable measurable : list) {
                                            if (LayoutIdKt.getLayoutId(measurable) == RangeSliderComponents.STARTTHUMB) {
                                                z3 = true;
                                                continue;
                                            } else {
                                                z3 = false;
                                                continue;
                                            }
                                            if (z3) {
                                                Placeable mo4545measureBRTryo0 = measurable.mo4545measureBRTryo0(j);
                                                for (Measurable measurable2 : list) {
                                                    if (LayoutIdKt.getLayoutId(measurable2) == RangeSliderComponents.ENDTHUMB) {
                                                        z4 = true;
                                                        continue;
                                                    } else {
                                                        z4 = false;
                                                        continue;
                                                    }
                                                    if (z4) {
                                                        Placeable mo4545measureBRTryo02 = measurable2.mo4545measureBRTryo0(j);
                                                        for (Measurable measurable3 : list) {
                                                            if (LayoutIdKt.getLayoutId(measurable3) == RangeSliderComponents.TRACK) {
                                                                z5 = true;
                                                                continue;
                                                            } else {
                                                                z5 = false;
                                                                continue;
                                                            }
                                                            if (z5) {
                                                                Placeable mo4545measureBRTryo03 = measurable3.mo4545measureBRTryo0(Constraints.m5542copyZbe2FdA$default(ConstraintsKt.m5568offsetNN6EwU$default(j, (-(mo4545measureBRTryo0.getWidth() + mo4545measureBRTryo02.getWidth())) / 2, 0, 2, null), 0, 0, 0, 0, 11, null));
                                                                int width = mo4545measureBRTryo03.getWidth() + ((mo4545measureBRTryo0.getWidth() + mo4545measureBRTryo02.getWidth()) / 2);
                                                                int max = Math.max(mo4545measureBRTryo03.getHeight(), Math.max(mo4545measureBRTryo0.getHeight(), mo4545measureBRTryo02.getHeight()));
                                                                SliderKt.RangeSliderImpl$lambda$26(mutableState, mo4545measureBRTryo0.getWidth());
                                                                SliderKt.RangeSliderImpl$lambda$29(mutableState2, mo4545measureBRTryo02.getWidth());
                                                                SliderKt.RangeSliderImpl$lambda$32(mutableState3, width);
                                                                if (!objectRef.element.getValue().booleanValue()) {
                                                                    RangeSliderImpl$lambda$31 = SliderKt.RangeSliderImpl$lambda$31(mutableState3);
                                                                    RangeSliderImpl$lambda$282 = SliderKt.RangeSliderImpl$lambda$28(mutableState2);
                                                                    float f2 = 2;
                                                                    float max2 = Math.max(RangeSliderImpl$lambda$31 - (RangeSliderImpl$lambda$282 / f2), 0.0f);
                                                                    RangeSliderImpl$lambda$252 = SliderKt.RangeSliderImpl$lambda$25(mutableState);
                                                                    float min = Math.min(RangeSliderImpl$lambda$252 / f2, max2);
                                                                    MutableState<Float> mutableState6 = mutableState4;
                                                                    RangeSliderImpl$scaleToOffset$34 = SliderKt.RangeSliderImpl$scaleToOffset$34(closedFloatingPointRange2, min, max2, closedFloatingPointRange.getStart().floatValue());
                                                                    mutableState6.setValue(Float.valueOf(RangeSliderImpl$scaleToOffset$34));
                                                                    MutableState<Float> mutableState7 = mutableState5;
                                                                    RangeSliderImpl$scaleToOffset$342 = SliderKt.RangeSliderImpl$scaleToOffset$34(closedFloatingPointRange2, min, max2, closedFloatingPointRange.getEndInclusive().floatValue());
                                                                    mutableState7.setValue(Float.valueOf(RangeSliderImpl$scaleToOffset$342));
                                                                    objectRef.element.setValue(true);
                                                                }
                                                                int width2 = mo4545measureBRTryo0.getWidth() / 2;
                                                                int roundToInt = MathKt.roundToInt(mo4545measureBRTryo03.getWidth() * calcFraction);
                                                                RangeSliderImpl$lambda$25 = SliderKt.RangeSliderImpl$lambda$25(mutableState);
                                                                RangeSliderImpl$lambda$28 = SliderKt.RangeSliderImpl$lambda$28(mutableState2);
                                                                return MeasureScope.CC.layout$default(Layout, width, max, null, new SliderKt$RangeSliderImpl$2$measure$1(mo4545measureBRTryo03, width2, (max - mo4545measureBRTryo03.getHeight()) / 2, mo4545measureBRTryo0, roundToInt, (max - mo4545measureBRTryo0.getHeight()) / 2, mo4545measureBRTryo02, MathKt.roundToInt((mo4545measureBRTryo03.getWidth() * calcFraction2) + ((RangeSliderImpl$lambda$25 - RangeSliderImpl$lambda$28) / 2)), (max - mo4545measureBRTryo02.getHeight()) / 2), 4, null);
                                                            }
                                                        }
                                                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                                                    }
                                                }
                                                throw new NoSuchElementException("Collection contains no element matching the predicate.");
                                            }
                                        }
                                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                                    }
                                };
                                composer2.startReplaceableGroup(-1323940314);
                                ComposerKt.sourceInformation(composer2, "CC(Layout)P(!1,2)73@2855L7,74@2910L7,75@2969L7,76@2981L460:Layout.kt#80mrfh");
                                ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, str3);
                                Object consume2 = composer2.consume(CompositionLocalsKt.getLocalDensity());
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                Density density = (Density) consume2;
                                ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, str3);
                                Object consume3 = composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                LayoutDirection layoutDirection = (LayoutDirection) consume3;
                                ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, str3);
                                Object consume4 = composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                ViewConfiguration viewConfiguration = (ViewConfiguration) consume4;
                                Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(then);
                                if (!(composer2.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer2.startReusableNode();
                                if (!composer2.getInserting()) {
                                    composer2.createNode(constructor);
                                } else {
                                    composer2.useNode();
                                }
                                Composer m2893constructorimpl = Updater.m2893constructorimpl(composer2);
                                Updater.m2900setimpl(m2893constructorimpl, measurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                                Updater.m2900setimpl(m2893constructorimpl, density, ComposeUiNode.Companion.getSetDensity());
                                Updater.m2900setimpl(m2893constructorimpl, layoutDirection, ComposeUiNode.Companion.getSetLayoutDirection());
                                Updater.m2900setimpl(m2893constructorimpl, viewConfiguration, ComposeUiNode.Companion.getSetViewConfiguration());
                                materializerOf.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(composer2)), composer2, 0);
                                composer2.startReplaceableGroup(2058660585);
                                ComposerKt.sourceInformationMarkerStart(composer2, -2040262222, "C754@31668L84,752@31532L369,762@32048L82,760@31914L359,768@32286L117:Slider.kt#uh7d8r");
                                Modifier layoutId = LayoutIdKt.layoutId(Modifier.Companion, RangeSliderComponents.STARTTHUMB);
                                composer2.startReplaceableGroup(1157296644);
                                ComposerKt.sourceInformation(composer2, "CC(remember)P(1):Composables.kt#9igjgp");
                                changed6 = composer2.changed(m2058getStringNWtq28);
                                rememberedValue12 = composer2.rememberedValue();
                                if (!changed6 || rememberedValue12 == Composer.Companion.getEmpty()) {
                                    rememberedValue12 = new SliderKt$RangeSliderImpl$1$1$1(m2058getStringNWtq28);
                                    composer2.updateRememberedValue(rememberedValue12);
                                }
                                composer2.endReplaceableGroup();
                                Modifier then2 = FocusableKt.focusable(SemanticsModifierKt.semantics(layoutId, true, (Function1) rememberedValue12), z, mutableInteractionSource).then(sliderSemantics);
                                composer2.startReplaceableGroup(733328855);
                                ComposerKt.sourceInformation(composer2, "CC(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, composer2, 0);
                                composer2.startReplaceableGroup(-1323940314);
                                ComposerKt.sourceInformation(composer2, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                Object consume5 = composer2.consume(CompositionLocalsKt.getLocalDensity());
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                Density density2 = (Density) consume5;
                                ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                Object consume6 = composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                LayoutDirection layoutDirection2 = (LayoutDirection) consume6;
                                ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                Object consume7 = composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                ViewConfiguration viewConfiguration2 = (ViewConfiguration) consume7;
                                Function0<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf2 = LayoutKt.materializerOf(then2);
                                if (!(composer2.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer2.startReusableNode();
                                if (!composer2.getInserting()) {
                                    composer2.createNode(constructor2);
                                } else {
                                    composer2.useNode();
                                }
                                composer2.disableReusing();
                                Composer m2893constructorimpl2 = Updater.m2893constructorimpl(composer2);
                                Updater.m2900setimpl(m2893constructorimpl2, rememberBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                                Updater.m2900setimpl(m2893constructorimpl2, density2, ComposeUiNode.Companion.getSetDensity());
                                Updater.m2900setimpl(m2893constructorimpl2, layoutDirection2, ComposeUiNode.Companion.getSetLayoutDirection());
                                Updater.m2900setimpl(m2893constructorimpl2, viewConfiguration2, ComposeUiNode.Companion.getSetViewConfiguration());
                                composer2.enableReusing();
                                materializerOf2.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(composer2)), composer2, 0);
                                composer2.startReplaceableGroup(2058660585);
                                ComposerKt.sourceInformationMarkerStart(composer2, -1253629305, "C72@3384L9:Box.kt#2w3rfo");
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                ComposerKt.sourceInformationMarkerStart(composer2, 1631550503, "C759@31872L27:Slider.kt#uh7d8r");
                                function3.invoke(sliderPositions, composer2, Integer.valueOf(((i15 >> 24) & 112) | 6));
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                composer2.endReplaceableGroup();
                                composer2.endNode();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                Modifier layoutId2 = LayoutIdKt.layoutId(Modifier.Companion, RangeSliderComponents.ENDTHUMB);
                                composer2.startReplaceableGroup(1157296644);
                                ComposerKt.sourceInformation(composer2, "CC(remember)P(1):Composables.kt#9igjgp");
                                changed7 = composer2.changed(m2058getStringNWtq282);
                                rememberedValue13 = composer2.rememberedValue();
                                if (!changed7 || rememberedValue13 == Composer.Companion.getEmpty()) {
                                    rememberedValue13 = new SliderKt$RangeSliderImpl$1$3$1(m2058getStringNWtq282);
                                    composer2.updateRememberedValue(rememberedValue13);
                                }
                                composer2.endReplaceableGroup();
                                Modifier then3 = FocusableKt.focusable(SemanticsModifierKt.semantics(layoutId2, true, (Function1) rememberedValue13), z, mutableInteractionSource2).then(sliderSemantics2);
                                composer2.startReplaceableGroup(733328855);
                                ComposerKt.sourceInformation(composer2, "CC(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, composer2, 0);
                                composer2.startReplaceableGroup(-1323940314);
                                ComposerKt.sourceInformation(composer2, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                Object consume8 = composer2.consume(CompositionLocalsKt.getLocalDensity());
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                Density density3 = (Density) consume8;
                                ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                Object consume9 = composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                LayoutDirection layoutDirection3 = (LayoutDirection) consume9;
                                ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                Object consume10 = composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                ViewConfiguration viewConfiguration3 = (ViewConfiguration) consume10;
                                Function0<ComposeUiNode> constructor3 = ComposeUiNode.Companion.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf3 = LayoutKt.materializerOf(then3);
                                if (!(composer2.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer2.startReusableNode();
                                if (!composer2.getInserting()) {
                                    composer2.createNode(constructor3);
                                } else {
                                    composer2.useNode();
                                }
                                composer2.disableReusing();
                                Composer m2893constructorimpl3 = Updater.m2893constructorimpl(composer2);
                                Updater.m2900setimpl(m2893constructorimpl3, rememberBoxMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
                                Updater.m2900setimpl(m2893constructorimpl3, density3, ComposeUiNode.Companion.getSetDensity());
                                Updater.m2900setimpl(m2893constructorimpl3, layoutDirection3, ComposeUiNode.Companion.getSetLayoutDirection());
                                Updater.m2900setimpl(m2893constructorimpl3, viewConfiguration3, ComposeUiNode.Companion.getSetViewConfiguration());
                                composer2.enableReusing();
                                materializerOf3.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(composer2)), composer2, 0);
                                composer2.startReplaceableGroup(2058660585);
                                ComposerKt.sourceInformationMarkerStart(composer2, -1253629305, "C72@3384L9:Box.kt#2w3rfo");
                                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                ComposerKt.sourceInformationMarkerStart(composer2, 1631550877, "C767@32246L25:Slider.kt#uh7d8r");
                                function32.invoke(sliderPositions, composer2, Integer.valueOf(((i13 << 3) & 112) | 6));
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                composer2.endReplaceableGroup();
                                composer2.endNode();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                Modifier layoutId3 = LayoutIdKt.layoutId(Modifier.Companion, RangeSliderComponents.TRACK);
                                composer2.startReplaceableGroup(733328855);
                                ComposerKt.sourceInformation(composer2, "CC(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                MeasurePolicy rememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, composer2, 0);
                                composer2.startReplaceableGroup(-1323940314);
                                ComposerKt.sourceInformation(composer2, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                Object consume11 = composer2.consume(CompositionLocalsKt.getLocalDensity());
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                Density density4 = (Density) consume11;
                                ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                Object consume12 = composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                LayoutDirection layoutDirection4 = (LayoutDirection) consume12;
                                ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                Object consume13 = composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                ViewConfiguration viewConfiguration4 = (ViewConfiguration) consume13;
                                Function0<ComposeUiNode> constructor4 = ComposeUiNode.Companion.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf4 = LayoutKt.materializerOf(layoutId3);
                                if (!(composer2.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer2.startReusableNode();
                                if (!composer2.getInserting()) {
                                    composer2.createNode(constructor4);
                                } else {
                                    composer2.useNode();
                                }
                                composer2.disableReusing();
                                Composer m2893constructorimpl4 = Updater.m2893constructorimpl(composer2);
                                Updater.m2900setimpl(m2893constructorimpl4, rememberBoxMeasurePolicy3, ComposeUiNode.Companion.getSetMeasurePolicy());
                                Updater.m2900setimpl(m2893constructorimpl4, density4, ComposeUiNode.Companion.getSetDensity());
                                Updater.m2900setimpl(m2893constructorimpl4, layoutDirection4, ComposeUiNode.Companion.getSetLayoutDirection());
                                Updater.m2900setimpl(m2893constructorimpl4, viewConfiguration4, ComposeUiNode.Companion.getSetViewConfiguration());
                                composer2.enableReusing();
                                materializerOf4.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(composer2)), composer2, 0);
                                composer2.startReplaceableGroup(2058660585);
                                ComposerKt.sourceInformationMarkerStart(composer2, -1253629305, "C72@3384L9:Box.kt#2w3rfo");
                                BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                                ComposerKt.sourceInformationMarkerStart(composer2, 1631550998, "C769@32367L22:Slider.kt#uh7d8r");
                                function33.invoke(sliderPositions, composer2, Integer.valueOf((i13 & 112) | 6));
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                composer2.endReplaceableGroup();
                                composer2.endNode();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                composer2.endReplaceableGroup();
                                composer2.endNode();
                                composer2.endReplaceableGroup();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                i16 = i17;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                i16 = i;
                                composer2 = startRestartGroup;
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup != null) {
                                return;
                            }
                            endRestartGroup.updateScope(new SliderKt$RangeSliderImpl$3(modifier, closedFloatingPointRange, function1, z, closedFloatingPointRange2, i16, function0, mutableInteractionSource, mutableInteractionSource2, function3, function32, function33, i2, i3, i4));
                            return;
                        }
                        i10 = C.ENCODING_PCM_32BIT;
                        i5 |= i10;
                        i11 = i5;
                        if ((i4 & 1024) == 0) {
                        }
                        if ((i4 & 2048) == 0) {
                        }
                        i13 = i12;
                        if ((1533916891 & i11) == 306783378) {
                        }
                        if (i6 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        startRestartGroup.startReplaceableGroup(511388516);
                        ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
                        changed = startRestartGroup.changed(closedFloatingPointRange) | startRestartGroup.changed(function1);
                        SliderKt$RangeSliderImpl$onValueChangeState$1$1 rememberedValue142 = startRestartGroup.rememberedValue();
                        if (changed) {
                        }
                        rememberedValue142 = new SliderKt$RangeSliderImpl$onValueChangeState$1$1(closedFloatingPointRange, function1);
                        startRestartGroup.updateRememberedValue(rememberedValue142);
                        startRestartGroup.endReplaceableGroup();
                        State rememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(rememberedValue142, startRestartGroup, 0);
                        Integer valueOf4 = Integer.valueOf(i14);
                        startRestartGroup.startReplaceableGroup(1157296644);
                        ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                        changed2 = startRestartGroup.changed(valueOf4);
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (!changed2) {
                        }
                        rememberedValue = stepsToTickFractions(i14);
                        startRestartGroup.updateRememberedValue(rememberedValue);
                        startRestartGroup.endReplaceableGroup();
                        float[] fArr22 = (float[]) rememberedValue;
                        startRestartGroup.startReplaceableGroup(-492369756);
                        ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                        int i172 = i14;
                        rememberedValue2 = startRestartGroup.rememberedValue();
                        if (rememberedValue2 == Composer.Companion.getEmpty()) {
                        }
                        startRestartGroup.endReplaceableGroup();
                        final MutableState<Float> mutableState6 = (MutableState) rememberedValue2;
                        startRestartGroup.startReplaceableGroup(-492369756);
                        ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                        rememberedValue3 = startRestartGroup.rememberedValue();
                        if (rememberedValue3 == Composer.Companion.getEmpty()) {
                        }
                        startRestartGroup.endReplaceableGroup();
                        final MutableState<Float> mutableState22 = (MutableState) rememberedValue3;
                        startRestartGroup.startReplaceableGroup(-492369756);
                        ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                        rememberedValue4 = startRestartGroup.rememberedValue();
                        if (rememberedValue4 == Composer.Companion.getEmpty()) {
                        }
                        startRestartGroup.endReplaceableGroup();
                        final MutableState<Integer> mutableState32 = (MutableState) rememberedValue4;
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                        Object consume14 = startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        if (consume14 != LayoutDirection.Rtl) {
                        }
                        final Ref.ObjectRef<MutableState<Boolean>> objectRef2 = new Ref.ObjectRef();
                        startRestartGroup.startReplaceableGroup(-492369756);
                        ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                        rememberedValue5 = startRestartGroup.rememberedValue();
                        if (rememberedValue5 != Composer.Companion.getEmpty()) {
                        }
                        startRestartGroup.endReplaceableGroup();
                        objectRef2.element = r0;
                        startRestartGroup.startReplaceableGroup(-492369756);
                        ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                        rememberedValue6 = startRestartGroup.rememberedValue();
                        if (rememberedValue6 == Composer.Companion.getEmpty()) {
                        }
                        startRestartGroup.endReplaceableGroup();
                        final MutableState<Float> mutableState42 = (MutableState) rememberedValue6;
                        startRestartGroup.startReplaceableGroup(-492369756);
                        ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                        rememberedValue7 = startRestartGroup.rememberedValue();
                        if (rememberedValue7 != Composer.Companion.getEmpty()) {
                        }
                        startRestartGroup.endReplaceableGroup();
                        final MutableState<Float> mutableState52 = (MutableState) rememberedValue7;
                        startRestartGroup.startReplaceableGroup(1157296644);
                        ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                        changed3 = startRestartGroup.changed(function0);
                        rememberedValue8 = startRestartGroup.rememberedValue();
                        if (!changed3) {
                        }
                        rememberedValue8 = new SliderKt$RangeSliderImpl$gestureEndAction$1$1(function0);
                        startRestartGroup.updateRememberedValue(rememberedValue8);
                        startRestartGroup.endReplaceableGroup();
                        String str32 = str;
                        composer2 = startRestartGroup;
                        Modifier rangeSliderPressDragModifier2 = rangeSliderPressDragModifier(Modifier.Companion, mutableInteractionSource, mutableInteractionSource2, mutableState42, mutableState52, z, z2, RangeSliderImpl$lambda$31(mutableState32), closedFloatingPointRange2, SnapshotStateKt.rememberUpdatedState(rememberedValue8, startRestartGroup, 0), SnapshotStateKt.rememberUpdatedState(new SliderKt$RangeSliderImpl$onDrag$1(mutableState42, mutableState52, closedFloatingPointRange, fArr22, rememberUpdatedState2, mutableState32, mutableState22, mutableState6, closedFloatingPointRange2), composer2, 0));
                        float coerceIn3 = RangesKt.coerceIn(closedFloatingPointRange.getStart().floatValue(), closedFloatingPointRange2.getStart().floatValue(), closedFloatingPointRange.getEndInclusive().floatValue());
                        float coerceIn22 = RangesKt.coerceIn(closedFloatingPointRange.getEndInclusive().floatValue(), closedFloatingPointRange.getStart().floatValue(), closedFloatingPointRange2.getEndInclusive().floatValue());
                        final float calcFraction3 = calcFraction(closedFloatingPointRange2.getStart().floatValue(), closedFloatingPointRange2.getEndInclusive().floatValue(), coerceIn3);
                        final float calcFraction22 = calcFraction(closedFloatingPointRange2.getStart().floatValue(), closedFloatingPointRange2.getEndInclusive().floatValue(), coerceIn22);
                        composer2.startReplaceableGroup(-492369756);
                        ComposerKt.sourceInformation(composer2, str2);
                        rememberedValue9 = composer2.rememberedValue();
                        if (rememberedValue9 != Composer.Companion.getEmpty()) {
                        }
                        composer2.endReplaceableGroup();
                        SliderPositions sliderPositions2 = (SliderPositions) rememberedValue9;
                        sliderPositions2.setActiveRange$material3_release(RangesKt.rangeTo(calcFraction3, calcFraction22));
                        sliderPositions2.setTickFractions$material3_release(fArr);
                        float f2 = i172;
                        int floor3 = (int) Math.floor(f2 * calcFraction22);
                        int floor22 = (int) Math.floor(f2 * (1.0f - calcFraction3));
                        Modifier.Companion companion3 = Modifier.Companion;
                        Float valueOf22 = Float.valueOf(coerceIn22);
                        composer2.startReplaceableGroup(511388516);
                        ComposerKt.sourceInformation(composer2, "CC(remember)P(1,2):Composables.kt#9igjgp");
                        changed4 = composer2.changed(rememberUpdatedState2) | composer2.changed(valueOf22);
                        rememberedValue10 = composer2.rememberedValue();
                        if (!changed4) {
                        }
                        rememberedValue10 = new SliderKt$RangeSliderImpl$startThumbSemantics$1$1(rememberUpdatedState2, coerceIn22);
                        composer2.updateRememberedValue(rememberedValue10);
                        composer2.endReplaceableGroup();
                        Modifier sliderSemantics3 = sliderSemantics(companion3, coerceIn3, z, (Function1) rememberedValue10, function0, RangesKt.rangeTo(closedFloatingPointRange2.getStart().floatValue(), coerceIn22), floor3);
                        Modifier.Companion companion22 = Modifier.Companion;
                        Float valueOf32 = Float.valueOf(coerceIn3);
                        composer2.startReplaceableGroup(511388516);
                        ComposerKt.sourceInformation(composer2, "CC(remember)P(1,2):Composables.kt#9igjgp");
                        changed5 = composer2.changed(valueOf32) | composer2.changed(rememberUpdatedState2);
                        rememberedValue11 = composer2.rememberedValue();
                        if (!changed5) {
                        }
                        rememberedValue11 = new SliderKt$RangeSliderImpl$endThumbSemantics$1$1(rememberUpdatedState2, coerceIn3);
                        composer2.updateRememberedValue(rememberedValue11);
                        composer2.endReplaceableGroup();
                        Modifier sliderSemantics22 = sliderSemantics(companion22, coerceIn22, z, rememberedValue11, function0, RangesKt.rangeTo(coerceIn3, closedFloatingPointRange2.getEndInclusive().floatValue()), floor22);
                        String m2058getStringNWtq283 = Strings_androidKt.m2058getStringNWtq28(Strings.Companion.m2041getSliderRangeStartadMyvUU(), composer2, 6);
                        String m2058getStringNWtq2822 = Strings_androidKt.m2058getStringNWtq28(Strings.Companion.m2040getSliderRangeEndadMyvUU(), composer2, 6);
                        Modifier then4 = SizeKt.m791requiredSizeInqDBjuR0$default(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier), SliderTokens.INSTANCE.m2708getHandleWidthD9Ej5fM(), SliderTokens.INSTANCE.m2707getHandleHeightD9Ej5fM(), 0.0f, 0.0f, 12, null).then(rangeSliderPressDragModifier2);
                        MeasurePolicy measurePolicy2 = new MeasurePolicy() { // from class: androidx.compose.material3.SliderKt$RangeSliderImpl$2
                            @Override // androidx.compose.ui.layout.MeasurePolicy
                            public /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i18) {
                                return MeasurePolicy.CC.$default$maxIntrinsicHeight(this, intrinsicMeasureScope, list, i18);
                            }

                            @Override // androidx.compose.ui.layout.MeasurePolicy
                            public /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i18) {
                                return MeasurePolicy.CC.$default$maxIntrinsicWidth(this, intrinsicMeasureScope, list, i18);
                            }

                            @Override // androidx.compose.ui.layout.MeasurePolicy
                            public /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i18) {
                                return MeasurePolicy.CC.$default$minIntrinsicHeight(this, intrinsicMeasureScope, list, i18);
                            }

                            @Override // androidx.compose.ui.layout.MeasurePolicy
                            public /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i18) {
                                return MeasurePolicy.CC.$default$minIntrinsicWidth(this, intrinsicMeasureScope, list, i18);
                            }

                            @Override // androidx.compose.ui.layout.MeasurePolicy
                            /* renamed from: measure-3p2s80s */
                            public final MeasureResult mo272measure3p2s80s(MeasureScope Layout, List<? extends Measurable> measurables, long j) {
                                boolean z3;
                                boolean z4;
                                boolean z5;
                                float RangeSliderImpl$lambda$25;
                                float RangeSliderImpl$lambda$28;
                                int RangeSliderImpl$lambda$31;
                                float RangeSliderImpl$lambda$282;
                                float RangeSliderImpl$lambda$252;
                                float RangeSliderImpl$scaleToOffset$34;
                                float RangeSliderImpl$scaleToOffset$342;
                                Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
                                Intrinsics.checkNotNullParameter(measurables, "measurables");
                                List<? extends Measurable> list = measurables;
                                for (Measurable measurable : list) {
                                    if (LayoutIdKt.getLayoutId(measurable) == RangeSliderComponents.STARTTHUMB) {
                                        z3 = true;
                                        continue;
                                    } else {
                                        z3 = false;
                                        continue;
                                    }
                                    if (z3) {
                                        Placeable mo4545measureBRTryo0 = measurable.mo4545measureBRTryo0(j);
                                        for (Measurable measurable2 : list) {
                                            if (LayoutIdKt.getLayoutId(measurable2) == RangeSliderComponents.ENDTHUMB) {
                                                z4 = true;
                                                continue;
                                            } else {
                                                z4 = false;
                                                continue;
                                            }
                                            if (z4) {
                                                Placeable mo4545measureBRTryo02 = measurable2.mo4545measureBRTryo0(j);
                                                for (Measurable measurable3 : list) {
                                                    if (LayoutIdKt.getLayoutId(measurable3) == RangeSliderComponents.TRACK) {
                                                        z5 = true;
                                                        continue;
                                                    } else {
                                                        z5 = false;
                                                        continue;
                                                    }
                                                    if (z5) {
                                                        Placeable mo4545measureBRTryo03 = measurable3.mo4545measureBRTryo0(Constraints.m5542copyZbe2FdA$default(ConstraintsKt.m5568offsetNN6EwU$default(j, (-(mo4545measureBRTryo0.getWidth() + mo4545measureBRTryo02.getWidth())) / 2, 0, 2, null), 0, 0, 0, 0, 11, null));
                                                        int width = mo4545measureBRTryo03.getWidth() + ((mo4545measureBRTryo0.getWidth() + mo4545measureBRTryo02.getWidth()) / 2);
                                                        int max = Math.max(mo4545measureBRTryo03.getHeight(), Math.max(mo4545measureBRTryo0.getHeight(), mo4545measureBRTryo02.getHeight()));
                                                        SliderKt.RangeSliderImpl$lambda$26(mutableState6, mo4545measureBRTryo0.getWidth());
                                                        SliderKt.RangeSliderImpl$lambda$29(mutableState22, mo4545measureBRTryo02.getWidth());
                                                        SliderKt.RangeSliderImpl$lambda$32(mutableState32, width);
                                                        if (!objectRef2.element.getValue().booleanValue()) {
                                                            RangeSliderImpl$lambda$31 = SliderKt.RangeSliderImpl$lambda$31(mutableState32);
                                                            RangeSliderImpl$lambda$282 = SliderKt.RangeSliderImpl$lambda$28(mutableState22);
                                                            float f22 = 2;
                                                            float max2 = Math.max(RangeSliderImpl$lambda$31 - (RangeSliderImpl$lambda$282 / f22), 0.0f);
                                                            RangeSliderImpl$lambda$252 = SliderKt.RangeSliderImpl$lambda$25(mutableState6);
                                                            float min = Math.min(RangeSliderImpl$lambda$252 / f22, max2);
                                                            MutableState<Float> mutableState62 = mutableState42;
                                                            RangeSliderImpl$scaleToOffset$34 = SliderKt.RangeSliderImpl$scaleToOffset$34(closedFloatingPointRange2, min, max2, closedFloatingPointRange.getStart().floatValue());
                                                            mutableState62.setValue(Float.valueOf(RangeSliderImpl$scaleToOffset$34));
                                                            MutableState<Float> mutableState7 = mutableState52;
                                                            RangeSliderImpl$scaleToOffset$342 = SliderKt.RangeSliderImpl$scaleToOffset$34(closedFloatingPointRange2, min, max2, closedFloatingPointRange.getEndInclusive().floatValue());
                                                            mutableState7.setValue(Float.valueOf(RangeSliderImpl$scaleToOffset$342));
                                                            objectRef2.element.setValue(true);
                                                        }
                                                        int width2 = mo4545measureBRTryo0.getWidth() / 2;
                                                        int roundToInt = MathKt.roundToInt(mo4545measureBRTryo03.getWidth() * calcFraction3);
                                                        RangeSliderImpl$lambda$25 = SliderKt.RangeSliderImpl$lambda$25(mutableState6);
                                                        RangeSliderImpl$lambda$28 = SliderKt.RangeSliderImpl$lambda$28(mutableState22);
                                                        return MeasureScope.CC.layout$default(Layout, width, max, null, new SliderKt$RangeSliderImpl$2$measure$1(mo4545measureBRTryo03, width2, (max - mo4545measureBRTryo03.getHeight()) / 2, mo4545measureBRTryo0, roundToInt, (max - mo4545measureBRTryo0.getHeight()) / 2, mo4545measureBRTryo02, MathKt.roundToInt((mo4545measureBRTryo03.getWidth() * calcFraction22) + ((RangeSliderImpl$lambda$25 - RangeSliderImpl$lambda$28) / 2)), (max - mo4545measureBRTryo02.getHeight()) / 2), 4, null);
                                                    }
                                                }
                                                throw new NoSuchElementException("Collection contains no element matching the predicate.");
                                            }
                                        }
                                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                                    }
                                }
                                throw new NoSuchElementException("Collection contains no element matching the predicate.");
                            }
                        };
                        composer2.startReplaceableGroup(-1323940314);
                        ComposerKt.sourceInformation(composer2, "CC(Layout)P(!1,2)73@2855L7,74@2910L7,75@2969L7,76@2981L460:Layout.kt#80mrfh");
                        ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, str32);
                        Object consume22 = composer2.consume(CompositionLocalsKt.getLocalDensity());
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        Density density5 = (Density) consume22;
                        ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, str32);
                        Object consume32 = composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        LayoutDirection layoutDirection5 = (LayoutDirection) consume32;
                        ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, str32);
                        Object consume42 = composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ViewConfiguration viewConfiguration5 = (ViewConfiguration) consume42;
                        Function0<ComposeUiNode> constructor5 = ComposeUiNode.Companion.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf5 = LayoutKt.materializerOf(then4);
                        if (!(composer2.getApplier() instanceof Applier)) {
                        }
                        composer2.startReusableNode();
                        if (!composer2.getInserting()) {
                        }
                        Composer m2893constructorimpl5 = Updater.m2893constructorimpl(composer2);
                        Updater.m2900setimpl(m2893constructorimpl5, measurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
                        Updater.m2900setimpl(m2893constructorimpl5, density5, ComposeUiNode.Companion.getSetDensity());
                        Updater.m2900setimpl(m2893constructorimpl5, layoutDirection5, ComposeUiNode.Companion.getSetLayoutDirection());
                        Updater.m2900setimpl(m2893constructorimpl5, viewConfiguration5, ComposeUiNode.Companion.getSetViewConfiguration());
                        materializerOf5.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(composer2)), composer2, 0);
                        composer2.startReplaceableGroup(2058660585);
                        ComposerKt.sourceInformationMarkerStart(composer2, -2040262222, "C754@31668L84,752@31532L369,762@32048L82,760@31914L359,768@32286L117:Slider.kt#uh7d8r");
                        Modifier layoutId4 = LayoutIdKt.layoutId(Modifier.Companion, RangeSliderComponents.STARTTHUMB);
                        composer2.startReplaceableGroup(1157296644);
                        ComposerKt.sourceInformation(composer2, "CC(remember)P(1):Composables.kt#9igjgp");
                        changed6 = composer2.changed(m2058getStringNWtq283);
                        rememberedValue12 = composer2.rememberedValue();
                        if (!changed6) {
                        }
                        rememberedValue12 = new SliderKt$RangeSliderImpl$1$1$1(m2058getStringNWtq283);
                        composer2.updateRememberedValue(rememberedValue12);
                        composer2.endReplaceableGroup();
                        Modifier then22 = FocusableKt.focusable(SemanticsModifierKt.semantics(layoutId4, true, (Function1) rememberedValue12), z, mutableInteractionSource).then(sliderSemantics3);
                        composer2.startReplaceableGroup(733328855);
                        ComposerKt.sourceInformation(composer2, "CC(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                        MeasurePolicy rememberBoxMeasurePolicy4 = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, composer2, 0);
                        composer2.startReplaceableGroup(-1323940314);
                        ComposerKt.sourceInformation(composer2, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                        ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        Object consume52 = composer2.consume(CompositionLocalsKt.getLocalDensity());
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        Density density22 = (Density) consume52;
                        ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        Object consume62 = composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        LayoutDirection layoutDirection22 = (LayoutDirection) consume62;
                        ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        Object consume72 = composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ViewConfiguration viewConfiguration22 = (ViewConfiguration) consume72;
                        Function0<ComposeUiNode> constructor22 = ComposeUiNode.Companion.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf22 = LayoutKt.materializerOf(then22);
                        if (!(composer2.getApplier() instanceof Applier)) {
                        }
                        composer2.startReusableNode();
                        if (!composer2.getInserting()) {
                        }
                        composer2.disableReusing();
                        Composer m2893constructorimpl22 = Updater.m2893constructorimpl(composer2);
                        Updater.m2900setimpl(m2893constructorimpl22, rememberBoxMeasurePolicy4, ComposeUiNode.Companion.getSetMeasurePolicy());
                        Updater.m2900setimpl(m2893constructorimpl22, density22, ComposeUiNode.Companion.getSetDensity());
                        Updater.m2900setimpl(m2893constructorimpl22, layoutDirection22, ComposeUiNode.Companion.getSetLayoutDirection());
                        Updater.m2900setimpl(m2893constructorimpl22, viewConfiguration22, ComposeUiNode.Companion.getSetViewConfiguration());
                        composer2.enableReusing();
                        materializerOf22.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(composer2)), composer2, 0);
                        composer2.startReplaceableGroup(2058660585);
                        ComposerKt.sourceInformationMarkerStart(composer2, -1253629305, "C72@3384L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(composer2, 1631550503, "C759@31872L27:Slider.kt#uh7d8r");
                        function3.invoke(sliderPositions2, composer2, Integer.valueOf(((i15 >> 24) & 112) | 6));
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        Modifier layoutId22 = LayoutIdKt.layoutId(Modifier.Companion, RangeSliderComponents.ENDTHUMB);
                        composer2.startReplaceableGroup(1157296644);
                        ComposerKt.sourceInformation(composer2, "CC(remember)P(1):Composables.kt#9igjgp");
                        changed7 = composer2.changed(m2058getStringNWtq2822);
                        rememberedValue13 = composer2.rememberedValue();
                        if (!changed7) {
                        }
                        rememberedValue13 = new SliderKt$RangeSliderImpl$1$3$1(m2058getStringNWtq2822);
                        composer2.updateRememberedValue(rememberedValue13);
                        composer2.endReplaceableGroup();
                        Modifier then32 = FocusableKt.focusable(SemanticsModifierKt.semantics(layoutId22, true, (Function1) rememberedValue13), z, mutableInteractionSource2).then(sliderSemantics22);
                        composer2.startReplaceableGroup(733328855);
                        ComposerKt.sourceInformation(composer2, "CC(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                        MeasurePolicy rememberBoxMeasurePolicy22 = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, composer2, 0);
                        composer2.startReplaceableGroup(-1323940314);
                        ComposerKt.sourceInformation(composer2, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                        ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        Object consume82 = composer2.consume(CompositionLocalsKt.getLocalDensity());
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        Density density32 = (Density) consume82;
                        ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        Object consume92 = composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        LayoutDirection layoutDirection32 = (LayoutDirection) consume92;
                        ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        Object consume102 = composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ViewConfiguration viewConfiguration32 = (ViewConfiguration) consume102;
                        Function0<ComposeUiNode> constructor32 = ComposeUiNode.Companion.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf32 = LayoutKt.materializerOf(then32);
                        if (!(composer2.getApplier() instanceof Applier)) {
                        }
                        composer2.startReusableNode();
                        if (!composer2.getInserting()) {
                        }
                        composer2.disableReusing();
                        Composer m2893constructorimpl32 = Updater.m2893constructorimpl(composer2);
                        Updater.m2900setimpl(m2893constructorimpl32, rememberBoxMeasurePolicy22, ComposeUiNode.Companion.getSetMeasurePolicy());
                        Updater.m2900setimpl(m2893constructorimpl32, density32, ComposeUiNode.Companion.getSetDensity());
                        Updater.m2900setimpl(m2893constructorimpl32, layoutDirection32, ComposeUiNode.Companion.getSetLayoutDirection());
                        Updater.m2900setimpl(m2893constructorimpl32, viewConfiguration32, ComposeUiNode.Companion.getSetViewConfiguration());
                        composer2.enableReusing();
                        materializerOf32.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(composer2)), composer2, 0);
                        composer2.startReplaceableGroup(2058660585);
                        ComposerKt.sourceInformationMarkerStart(composer2, -1253629305, "C72@3384L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(composer2, 1631550877, "C767@32246L25:Slider.kt#uh7d8r");
                        function32.invoke(sliderPositions2, composer2, Integer.valueOf(((i13 << 3) & 112) | 6));
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        Modifier layoutId32 = LayoutIdKt.layoutId(Modifier.Companion, RangeSliderComponents.TRACK);
                        composer2.startReplaceableGroup(733328855);
                        ComposerKt.sourceInformation(composer2, "CC(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                        MeasurePolicy rememberBoxMeasurePolicy32 = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, composer2, 0);
                        composer2.startReplaceableGroup(-1323940314);
                        ComposerKt.sourceInformation(composer2, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                        ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        Object consume112 = composer2.consume(CompositionLocalsKt.getLocalDensity());
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        Density density42 = (Density) consume112;
                        ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        Object consume122 = composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        LayoutDirection layoutDirection42 = (LayoutDirection) consume122;
                        ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        Object consume132 = composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ViewConfiguration viewConfiguration42 = (ViewConfiguration) consume132;
                        Function0<ComposeUiNode> constructor42 = ComposeUiNode.Companion.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf42 = LayoutKt.materializerOf(layoutId32);
                        if (!(composer2.getApplier() instanceof Applier)) {
                        }
                        composer2.startReusableNode();
                        if (!composer2.getInserting()) {
                        }
                        composer2.disableReusing();
                        Composer m2893constructorimpl42 = Updater.m2893constructorimpl(composer2);
                        Updater.m2900setimpl(m2893constructorimpl42, rememberBoxMeasurePolicy32, ComposeUiNode.Companion.getSetMeasurePolicy());
                        Updater.m2900setimpl(m2893constructorimpl42, density42, ComposeUiNode.Companion.getSetDensity());
                        Updater.m2900setimpl(m2893constructorimpl42, layoutDirection42, ComposeUiNode.Companion.getSetLayoutDirection());
                        Updater.m2900setimpl(m2893constructorimpl42, viewConfiguration42, ComposeUiNode.Companion.getSetViewConfiguration());
                        composer2.enableReusing();
                        materializerOf42.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(composer2)), composer2, 0);
                        composer2.startReplaceableGroup(2058660585);
                        ComposerKt.sourceInformationMarkerStart(composer2, -1253629305, "C72@3384L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance32 = BoxScopeInstance.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(composer2, 1631550998, "C769@32367L22:Slider.kt#uh7d8r");
                        function33.invoke(sliderPositions2, composer2, Integer.valueOf((i13 & 112) | 6));
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        i16 = i172;
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    i5 |= i9;
                    if ((i4 & 512) == 0) {
                    }
                    i5 |= i10;
                    i11 = i5;
                    if ((i4 & 1024) == 0) {
                    }
                    if ((i4 & 2048) == 0) {
                    }
                    i13 = i12;
                    if ((1533916891 & i11) == 306783378) {
                    }
                    if (i6 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    startRestartGroup.startReplaceableGroup(511388516);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
                    changed = startRestartGroup.changed(closedFloatingPointRange) | startRestartGroup.changed(function1);
                    SliderKt$RangeSliderImpl$onValueChangeState$1$1 rememberedValue1422 = startRestartGroup.rememberedValue();
                    if (changed) {
                    }
                    rememberedValue1422 = new SliderKt$RangeSliderImpl$onValueChangeState$1$1(closedFloatingPointRange, function1);
                    startRestartGroup.updateRememberedValue(rememberedValue1422);
                    startRestartGroup.endReplaceableGroup();
                    State rememberUpdatedState22 = SnapshotStateKt.rememberUpdatedState(rememberedValue1422, startRestartGroup, 0);
                    Integer valueOf42 = Integer.valueOf(i14);
                    startRestartGroup.startReplaceableGroup(1157296644);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                    changed2 = startRestartGroup.changed(valueOf42);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!changed2) {
                    }
                    rememberedValue = stepsToTickFractions(i14);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                    startRestartGroup.endReplaceableGroup();
                    float[] fArr222 = (float[]) rememberedValue;
                    startRestartGroup.startReplaceableGroup(-492369756);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                    int i1722 = i14;
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (rememberedValue2 == Composer.Companion.getEmpty()) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    final MutableState<Float> mutableState62 = (MutableState) rememberedValue2;
                    startRestartGroup.startReplaceableGroup(-492369756);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                    rememberedValue3 = startRestartGroup.rememberedValue();
                    if (rememberedValue3 == Composer.Companion.getEmpty()) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    final MutableState<Float> mutableState222 = (MutableState) rememberedValue3;
                    startRestartGroup.startReplaceableGroup(-492369756);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                    rememberedValue4 = startRestartGroup.rememberedValue();
                    if (rememberedValue4 == Composer.Companion.getEmpty()) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    final MutableState<Integer> mutableState322 = (MutableState) rememberedValue4;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object consume142 = startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    if (consume142 != LayoutDirection.Rtl) {
                    }
                    final Ref.ObjectRef<MutableState<Boolean>> objectRef22 = new Ref.ObjectRef();
                    startRestartGroup.startReplaceableGroup(-492369756);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                    rememberedValue5 = startRestartGroup.rememberedValue();
                    if (rememberedValue5 != Composer.Companion.getEmpty()) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    objectRef22.element = r0;
                    startRestartGroup.startReplaceableGroup(-492369756);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                    rememberedValue6 = startRestartGroup.rememberedValue();
                    if (rememberedValue6 == Composer.Companion.getEmpty()) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    final MutableState<Float> mutableState422 = (MutableState) rememberedValue6;
                    startRestartGroup.startReplaceableGroup(-492369756);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                    rememberedValue7 = startRestartGroup.rememberedValue();
                    if (rememberedValue7 != Composer.Companion.getEmpty()) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    final MutableState<Float> mutableState522 = (MutableState) rememberedValue7;
                    startRestartGroup.startReplaceableGroup(1157296644);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                    changed3 = startRestartGroup.changed(function0);
                    rememberedValue8 = startRestartGroup.rememberedValue();
                    if (!changed3) {
                    }
                    rememberedValue8 = new SliderKt$RangeSliderImpl$gestureEndAction$1$1(function0);
                    startRestartGroup.updateRememberedValue(rememberedValue8);
                    startRestartGroup.endReplaceableGroup();
                    String str322 = str;
                    composer2 = startRestartGroup;
                    Modifier rangeSliderPressDragModifier22 = rangeSliderPressDragModifier(Modifier.Companion, mutableInteractionSource, mutableInteractionSource2, mutableState422, mutableState522, z, z2, RangeSliderImpl$lambda$31(mutableState322), closedFloatingPointRange2, SnapshotStateKt.rememberUpdatedState(rememberedValue8, startRestartGroup, 0), SnapshotStateKt.rememberUpdatedState(new SliderKt$RangeSliderImpl$onDrag$1(mutableState422, mutableState522, closedFloatingPointRange, fArr222, rememberUpdatedState22, mutableState322, mutableState222, mutableState62, closedFloatingPointRange2), composer2, 0));
                    float coerceIn32 = RangesKt.coerceIn(closedFloatingPointRange.getStart().floatValue(), closedFloatingPointRange2.getStart().floatValue(), closedFloatingPointRange.getEndInclusive().floatValue());
                    float coerceIn222 = RangesKt.coerceIn(closedFloatingPointRange.getEndInclusive().floatValue(), closedFloatingPointRange.getStart().floatValue(), closedFloatingPointRange2.getEndInclusive().floatValue());
                    final float calcFraction32 = calcFraction(closedFloatingPointRange2.getStart().floatValue(), closedFloatingPointRange2.getEndInclusive().floatValue(), coerceIn32);
                    final float calcFraction222 = calcFraction(closedFloatingPointRange2.getStart().floatValue(), closedFloatingPointRange2.getEndInclusive().floatValue(), coerceIn222);
                    composer2.startReplaceableGroup(-492369756);
                    ComposerKt.sourceInformation(composer2, str2);
                    rememberedValue9 = composer2.rememberedValue();
                    if (rememberedValue9 != Composer.Companion.getEmpty()) {
                    }
                    composer2.endReplaceableGroup();
                    SliderPositions sliderPositions22 = (SliderPositions) rememberedValue9;
                    sliderPositions22.setActiveRange$material3_release(RangesKt.rangeTo(calcFraction32, calcFraction222));
                    sliderPositions22.setTickFractions$material3_release(fArr);
                    float f22 = i1722;
                    int floor32 = (int) Math.floor(f22 * calcFraction222);
                    int floor222 = (int) Math.floor(f22 * (1.0f - calcFraction32));
                    Modifier.Companion companion32 = Modifier.Companion;
                    Float valueOf222 = Float.valueOf(coerceIn222);
                    composer2.startReplaceableGroup(511388516);
                    ComposerKt.sourceInformation(composer2, "CC(remember)P(1,2):Composables.kt#9igjgp");
                    changed4 = composer2.changed(rememberUpdatedState22) | composer2.changed(valueOf222);
                    rememberedValue10 = composer2.rememberedValue();
                    if (!changed4) {
                    }
                    rememberedValue10 = new SliderKt$RangeSliderImpl$startThumbSemantics$1$1(rememberUpdatedState22, coerceIn222);
                    composer2.updateRememberedValue(rememberedValue10);
                    composer2.endReplaceableGroup();
                    Modifier sliderSemantics32 = sliderSemantics(companion32, coerceIn32, z, (Function1) rememberedValue10, function0, RangesKt.rangeTo(closedFloatingPointRange2.getStart().floatValue(), coerceIn222), floor32);
                    Modifier.Companion companion222 = Modifier.Companion;
                    Float valueOf322 = Float.valueOf(coerceIn32);
                    composer2.startReplaceableGroup(511388516);
                    ComposerKt.sourceInformation(composer2, "CC(remember)P(1,2):Composables.kt#9igjgp");
                    changed5 = composer2.changed(valueOf322) | composer2.changed(rememberUpdatedState22);
                    rememberedValue11 = composer2.rememberedValue();
                    if (!changed5) {
                    }
                    rememberedValue11 = new SliderKt$RangeSliderImpl$endThumbSemantics$1$1(rememberUpdatedState22, coerceIn32);
                    composer2.updateRememberedValue(rememberedValue11);
                    composer2.endReplaceableGroup();
                    Modifier sliderSemantics222 = sliderSemantics(companion222, coerceIn222, z, rememberedValue11, function0, RangesKt.rangeTo(coerceIn32, closedFloatingPointRange2.getEndInclusive().floatValue()), floor222);
                    String m2058getStringNWtq2832 = Strings_androidKt.m2058getStringNWtq28(Strings.Companion.m2041getSliderRangeStartadMyvUU(), composer2, 6);
                    String m2058getStringNWtq28222 = Strings_androidKt.m2058getStringNWtq28(Strings.Companion.m2040getSliderRangeEndadMyvUU(), composer2, 6);
                    Modifier then42 = SizeKt.m791requiredSizeInqDBjuR0$default(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier), SliderTokens.INSTANCE.m2708getHandleWidthD9Ej5fM(), SliderTokens.INSTANCE.m2707getHandleHeightD9Ej5fM(), 0.0f, 0.0f, 12, null).then(rangeSliderPressDragModifier22);
                    MeasurePolicy measurePolicy22 = new MeasurePolicy() { // from class: androidx.compose.material3.SliderKt$RangeSliderImpl$2
                        @Override // androidx.compose.ui.layout.MeasurePolicy
                        public /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i18) {
                            return MeasurePolicy.CC.$default$maxIntrinsicHeight(this, intrinsicMeasureScope, list, i18);
                        }

                        @Override // androidx.compose.ui.layout.MeasurePolicy
                        public /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i18) {
                            return MeasurePolicy.CC.$default$maxIntrinsicWidth(this, intrinsicMeasureScope, list, i18);
                        }

                        @Override // androidx.compose.ui.layout.MeasurePolicy
                        public /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i18) {
                            return MeasurePolicy.CC.$default$minIntrinsicHeight(this, intrinsicMeasureScope, list, i18);
                        }

                        @Override // androidx.compose.ui.layout.MeasurePolicy
                        public /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i18) {
                            return MeasurePolicy.CC.$default$minIntrinsicWidth(this, intrinsicMeasureScope, list, i18);
                        }

                        @Override // androidx.compose.ui.layout.MeasurePolicy
                        /* renamed from: measure-3p2s80s */
                        public final MeasureResult mo272measure3p2s80s(MeasureScope Layout, List<? extends Measurable> measurables, long j) {
                            boolean z3;
                            boolean z4;
                            boolean z5;
                            float RangeSliderImpl$lambda$25;
                            float RangeSliderImpl$lambda$28;
                            int RangeSliderImpl$lambda$31;
                            float RangeSliderImpl$lambda$282;
                            float RangeSliderImpl$lambda$252;
                            float RangeSliderImpl$scaleToOffset$34;
                            float RangeSliderImpl$scaleToOffset$342;
                            Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
                            Intrinsics.checkNotNullParameter(measurables, "measurables");
                            List<? extends Measurable> list = measurables;
                            for (Measurable measurable : list) {
                                if (LayoutIdKt.getLayoutId(measurable) == RangeSliderComponents.STARTTHUMB) {
                                    z3 = true;
                                    continue;
                                } else {
                                    z3 = false;
                                    continue;
                                }
                                if (z3) {
                                    Placeable mo4545measureBRTryo0 = measurable.mo4545measureBRTryo0(j);
                                    for (Measurable measurable2 : list) {
                                        if (LayoutIdKt.getLayoutId(measurable2) == RangeSliderComponents.ENDTHUMB) {
                                            z4 = true;
                                            continue;
                                        } else {
                                            z4 = false;
                                            continue;
                                        }
                                        if (z4) {
                                            Placeable mo4545measureBRTryo02 = measurable2.mo4545measureBRTryo0(j);
                                            for (Measurable measurable3 : list) {
                                                if (LayoutIdKt.getLayoutId(measurable3) == RangeSliderComponents.TRACK) {
                                                    z5 = true;
                                                    continue;
                                                } else {
                                                    z5 = false;
                                                    continue;
                                                }
                                                if (z5) {
                                                    Placeable mo4545measureBRTryo03 = measurable3.mo4545measureBRTryo0(Constraints.m5542copyZbe2FdA$default(ConstraintsKt.m5568offsetNN6EwU$default(j, (-(mo4545measureBRTryo0.getWidth() + mo4545measureBRTryo02.getWidth())) / 2, 0, 2, null), 0, 0, 0, 0, 11, null));
                                                    int width = mo4545measureBRTryo03.getWidth() + ((mo4545measureBRTryo0.getWidth() + mo4545measureBRTryo02.getWidth()) / 2);
                                                    int max = Math.max(mo4545measureBRTryo03.getHeight(), Math.max(mo4545measureBRTryo0.getHeight(), mo4545measureBRTryo02.getHeight()));
                                                    SliderKt.RangeSliderImpl$lambda$26(mutableState62, mo4545measureBRTryo0.getWidth());
                                                    SliderKt.RangeSliderImpl$lambda$29(mutableState222, mo4545measureBRTryo02.getWidth());
                                                    SliderKt.RangeSliderImpl$lambda$32(mutableState322, width);
                                                    if (!objectRef22.element.getValue().booleanValue()) {
                                                        RangeSliderImpl$lambda$31 = SliderKt.RangeSliderImpl$lambda$31(mutableState322);
                                                        RangeSliderImpl$lambda$282 = SliderKt.RangeSliderImpl$lambda$28(mutableState222);
                                                        float f222 = 2;
                                                        float max2 = Math.max(RangeSliderImpl$lambda$31 - (RangeSliderImpl$lambda$282 / f222), 0.0f);
                                                        RangeSliderImpl$lambda$252 = SliderKt.RangeSliderImpl$lambda$25(mutableState62);
                                                        float min = Math.min(RangeSliderImpl$lambda$252 / f222, max2);
                                                        MutableState<Float> mutableState622 = mutableState422;
                                                        RangeSliderImpl$scaleToOffset$34 = SliderKt.RangeSliderImpl$scaleToOffset$34(closedFloatingPointRange2, min, max2, closedFloatingPointRange.getStart().floatValue());
                                                        mutableState622.setValue(Float.valueOf(RangeSliderImpl$scaleToOffset$34));
                                                        MutableState<Float> mutableState7 = mutableState522;
                                                        RangeSliderImpl$scaleToOffset$342 = SliderKt.RangeSliderImpl$scaleToOffset$34(closedFloatingPointRange2, min, max2, closedFloatingPointRange.getEndInclusive().floatValue());
                                                        mutableState7.setValue(Float.valueOf(RangeSliderImpl$scaleToOffset$342));
                                                        objectRef22.element.setValue(true);
                                                    }
                                                    int width2 = mo4545measureBRTryo0.getWidth() / 2;
                                                    int roundToInt = MathKt.roundToInt(mo4545measureBRTryo03.getWidth() * calcFraction32);
                                                    RangeSliderImpl$lambda$25 = SliderKt.RangeSliderImpl$lambda$25(mutableState62);
                                                    RangeSliderImpl$lambda$28 = SliderKt.RangeSliderImpl$lambda$28(mutableState222);
                                                    return MeasureScope.CC.layout$default(Layout, width, max, null, new SliderKt$RangeSliderImpl$2$measure$1(mo4545measureBRTryo03, width2, (max - mo4545measureBRTryo03.getHeight()) / 2, mo4545measureBRTryo0, roundToInt, (max - mo4545measureBRTryo0.getHeight()) / 2, mo4545measureBRTryo02, MathKt.roundToInt((mo4545measureBRTryo03.getWidth() * calcFraction222) + ((RangeSliderImpl$lambda$25 - RangeSliderImpl$lambda$28) / 2)), (max - mo4545measureBRTryo02.getHeight()) / 2), 4, null);
                                                }
                                            }
                                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                                        }
                                    }
                                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                                }
                            }
                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                        }
                    };
                    composer2.startReplaceableGroup(-1323940314);
                    ComposerKt.sourceInformation(composer2, "CC(Layout)P(!1,2)73@2855L7,74@2910L7,75@2969L7,76@2981L460:Layout.kt#80mrfh");
                    ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, str322);
                    Object consume222 = composer2.consume(CompositionLocalsKt.getLocalDensity());
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    Density density52 = (Density) consume222;
                    ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, str322);
                    Object consume322 = composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    LayoutDirection layoutDirection52 = (LayoutDirection) consume322;
                    ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, str322);
                    Object consume422 = composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ViewConfiguration viewConfiguration52 = (ViewConfiguration) consume422;
                    Function0<ComposeUiNode> constructor52 = ComposeUiNode.Companion.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf52 = LayoutKt.materializerOf(then42);
                    if (!(composer2.getApplier() instanceof Applier)) {
                    }
                    composer2.startReusableNode();
                    if (!composer2.getInserting()) {
                    }
                    Composer m2893constructorimpl52 = Updater.m2893constructorimpl(composer2);
                    Updater.m2900setimpl(m2893constructorimpl52, measurePolicy22, ComposeUiNode.Companion.getSetMeasurePolicy());
                    Updater.m2900setimpl(m2893constructorimpl52, density52, ComposeUiNode.Companion.getSetDensity());
                    Updater.m2900setimpl(m2893constructorimpl52, layoutDirection52, ComposeUiNode.Companion.getSetLayoutDirection());
                    Updater.m2900setimpl(m2893constructorimpl52, viewConfiguration52, ComposeUiNode.Companion.getSetViewConfiguration());
                    materializerOf52.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    ComposerKt.sourceInformationMarkerStart(composer2, -2040262222, "C754@31668L84,752@31532L369,762@32048L82,760@31914L359,768@32286L117:Slider.kt#uh7d8r");
                    Modifier layoutId42 = LayoutIdKt.layoutId(Modifier.Companion, RangeSliderComponents.STARTTHUMB);
                    composer2.startReplaceableGroup(1157296644);
                    ComposerKt.sourceInformation(composer2, "CC(remember)P(1):Composables.kt#9igjgp");
                    changed6 = composer2.changed(m2058getStringNWtq2832);
                    rememberedValue12 = composer2.rememberedValue();
                    if (!changed6) {
                    }
                    rememberedValue12 = new SliderKt$RangeSliderImpl$1$1$1(m2058getStringNWtq2832);
                    composer2.updateRememberedValue(rememberedValue12);
                    composer2.endReplaceableGroup();
                    Modifier then222 = FocusableKt.focusable(SemanticsModifierKt.semantics(layoutId42, true, (Function1) rememberedValue12), z, mutableInteractionSource).then(sliderSemantics32);
                    composer2.startReplaceableGroup(733328855);
                    ComposerKt.sourceInformation(composer2, "CC(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                    MeasurePolicy rememberBoxMeasurePolicy42 = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, composer2, 0);
                    composer2.startReplaceableGroup(-1323940314);
                    ComposerKt.sourceInformation(composer2, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                    ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    Object consume522 = composer2.consume(CompositionLocalsKt.getLocalDensity());
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    Density density222 = (Density) consume522;
                    ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    Object consume622 = composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    LayoutDirection layoutDirection222 = (LayoutDirection) consume622;
                    ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    Object consume722 = composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ViewConfiguration viewConfiguration222 = (ViewConfiguration) consume722;
                    Function0<ComposeUiNode> constructor222 = ComposeUiNode.Companion.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf222 = LayoutKt.materializerOf(then222);
                    if (!(composer2.getApplier() instanceof Applier)) {
                    }
                    composer2.startReusableNode();
                    if (!composer2.getInserting()) {
                    }
                    composer2.disableReusing();
                    Composer m2893constructorimpl222 = Updater.m2893constructorimpl(composer2);
                    Updater.m2900setimpl(m2893constructorimpl222, rememberBoxMeasurePolicy42, ComposeUiNode.Companion.getSetMeasurePolicy());
                    Updater.m2900setimpl(m2893constructorimpl222, density222, ComposeUiNode.Companion.getSetDensity());
                    Updater.m2900setimpl(m2893constructorimpl222, layoutDirection222, ComposeUiNode.Companion.getSetLayoutDirection());
                    Updater.m2900setimpl(m2893constructorimpl222, viewConfiguration222, ComposeUiNode.Companion.getSetViewConfiguration());
                    composer2.enableReusing();
                    materializerOf222.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    ComposerKt.sourceInformationMarkerStart(composer2, -1253629305, "C72@3384L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance42 = BoxScopeInstance.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(composer2, 1631550503, "C759@31872L27:Slider.kt#uh7d8r");
                    function3.invoke(sliderPositions22, composer2, Integer.valueOf(((i15 >> 24) & 112) | 6));
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    Modifier layoutId222 = LayoutIdKt.layoutId(Modifier.Companion, RangeSliderComponents.ENDTHUMB);
                    composer2.startReplaceableGroup(1157296644);
                    ComposerKt.sourceInformation(composer2, "CC(remember)P(1):Composables.kt#9igjgp");
                    changed7 = composer2.changed(m2058getStringNWtq28222);
                    rememberedValue13 = composer2.rememberedValue();
                    if (!changed7) {
                    }
                    rememberedValue13 = new SliderKt$RangeSliderImpl$1$3$1(m2058getStringNWtq28222);
                    composer2.updateRememberedValue(rememberedValue13);
                    composer2.endReplaceableGroup();
                    Modifier then322 = FocusableKt.focusable(SemanticsModifierKt.semantics(layoutId222, true, (Function1) rememberedValue13), z, mutableInteractionSource2).then(sliderSemantics222);
                    composer2.startReplaceableGroup(733328855);
                    ComposerKt.sourceInformation(composer2, "CC(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                    MeasurePolicy rememberBoxMeasurePolicy222 = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, composer2, 0);
                    composer2.startReplaceableGroup(-1323940314);
                    ComposerKt.sourceInformation(composer2, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                    ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    Object consume822 = composer2.consume(CompositionLocalsKt.getLocalDensity());
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    Density density322 = (Density) consume822;
                    ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    Object consume922 = composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    LayoutDirection layoutDirection322 = (LayoutDirection) consume922;
                    ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    Object consume1022 = composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ViewConfiguration viewConfiguration322 = (ViewConfiguration) consume1022;
                    Function0<ComposeUiNode> constructor322 = ComposeUiNode.Companion.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf322 = LayoutKt.materializerOf(then322);
                    if (!(composer2.getApplier() instanceof Applier)) {
                    }
                    composer2.startReusableNode();
                    if (!composer2.getInserting()) {
                    }
                    composer2.disableReusing();
                    Composer m2893constructorimpl322 = Updater.m2893constructorimpl(composer2);
                    Updater.m2900setimpl(m2893constructorimpl322, rememberBoxMeasurePolicy222, ComposeUiNode.Companion.getSetMeasurePolicy());
                    Updater.m2900setimpl(m2893constructorimpl322, density322, ComposeUiNode.Companion.getSetDensity());
                    Updater.m2900setimpl(m2893constructorimpl322, layoutDirection322, ComposeUiNode.Companion.getSetLayoutDirection());
                    Updater.m2900setimpl(m2893constructorimpl322, viewConfiguration322, ComposeUiNode.Companion.getSetViewConfiguration());
                    composer2.enableReusing();
                    materializerOf322.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    ComposerKt.sourceInformationMarkerStart(composer2, -1253629305, "C72@3384L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance222 = BoxScopeInstance.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(composer2, 1631550877, "C767@32246L25:Slider.kt#uh7d8r");
                    function32.invoke(sliderPositions22, composer2, Integer.valueOf(((i13 << 3) & 112) | 6));
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    Modifier layoutId322 = LayoutIdKt.layoutId(Modifier.Companion, RangeSliderComponents.TRACK);
                    composer2.startReplaceableGroup(733328855);
                    ComposerKt.sourceInformation(composer2, "CC(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                    MeasurePolicy rememberBoxMeasurePolicy322 = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, composer2, 0);
                    composer2.startReplaceableGroup(-1323940314);
                    ComposerKt.sourceInformation(composer2, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                    ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    Object consume1122 = composer2.consume(CompositionLocalsKt.getLocalDensity());
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    Density density422 = (Density) consume1122;
                    ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    Object consume1222 = composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    LayoutDirection layoutDirection422 = (LayoutDirection) consume1222;
                    ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    Object consume1322 = composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ViewConfiguration viewConfiguration422 = (ViewConfiguration) consume1322;
                    Function0<ComposeUiNode> constructor422 = ComposeUiNode.Companion.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf422 = LayoutKt.materializerOf(layoutId322);
                    if (!(composer2.getApplier() instanceof Applier)) {
                    }
                    composer2.startReusableNode();
                    if (!composer2.getInserting()) {
                    }
                    composer2.disableReusing();
                    Composer m2893constructorimpl422 = Updater.m2893constructorimpl(composer2);
                    Updater.m2900setimpl(m2893constructorimpl422, rememberBoxMeasurePolicy322, ComposeUiNode.Companion.getSetMeasurePolicy());
                    Updater.m2900setimpl(m2893constructorimpl422, density422, ComposeUiNode.Companion.getSetDensity());
                    Updater.m2900setimpl(m2893constructorimpl422, layoutDirection422, ComposeUiNode.Companion.getSetLayoutDirection());
                    Updater.m2900setimpl(m2893constructorimpl422, viewConfiguration422, ComposeUiNode.Companion.getSetViewConfiguration());
                    composer2.enableReusing();
                    materializerOf422.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    ComposerKt.sourceInformationMarkerStart(composer2, -1253629305, "C72@3384L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance322 = BoxScopeInstance.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(composer2, 1631550998, "C769@32367L22:Slider.kt#uh7d8r");
                    function33.invoke(sliderPositions22, composer2, Integer.valueOf((i13 & 112) | 6));
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    i16 = i1722;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                i5 |= i8;
                if ((i4 & 256) == 0) {
                }
                i5 |= i9;
                if ((i4 & 512) == 0) {
                }
                i5 |= i10;
                i11 = i5;
                if ((i4 & 1024) == 0) {
                }
                if ((i4 & 2048) == 0) {
                }
                i13 = i12;
                if ((1533916891 & i11) == 306783378) {
                }
                if (i6 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                startRestartGroup.startReplaceableGroup(511388516);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
                changed = startRestartGroup.changed(closedFloatingPointRange) | startRestartGroup.changed(function1);
                SliderKt$RangeSliderImpl$onValueChangeState$1$1 rememberedValue14222 = startRestartGroup.rememberedValue();
                if (changed) {
                }
                rememberedValue14222 = new SliderKt$RangeSliderImpl$onValueChangeState$1$1(closedFloatingPointRange, function1);
                startRestartGroup.updateRememberedValue(rememberedValue14222);
                startRestartGroup.endReplaceableGroup();
                State rememberUpdatedState222 = SnapshotStateKt.rememberUpdatedState(rememberedValue14222, startRestartGroup, 0);
                Integer valueOf422 = Integer.valueOf(i14);
                startRestartGroup.startReplaceableGroup(1157296644);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                changed2 = startRestartGroup.changed(valueOf422);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!changed2) {
                }
                rememberedValue = stepsToTickFractions(i14);
                startRestartGroup.updateRememberedValue(rememberedValue);
                startRestartGroup.endReplaceableGroup();
                float[] fArr2222 = (float[]) rememberedValue;
                startRestartGroup.startReplaceableGroup(-492369756);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                int i17222 = i14;
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == Composer.Companion.getEmpty()) {
                }
                startRestartGroup.endReplaceableGroup();
                final MutableState<Float> mutableState622 = (MutableState) rememberedValue2;
                startRestartGroup.startReplaceableGroup(-492369756);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (rememberedValue3 == Composer.Companion.getEmpty()) {
                }
                startRestartGroup.endReplaceableGroup();
                final MutableState<Float> mutableState2222 = (MutableState) rememberedValue3;
                startRestartGroup.startReplaceableGroup(-492369756);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                rememberedValue4 = startRestartGroup.rememberedValue();
                if (rememberedValue4 == Composer.Companion.getEmpty()) {
                }
                startRestartGroup.endReplaceableGroup();
                final MutableState<Integer> mutableState3222 = (MutableState) rememberedValue4;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume1422 = startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                if (consume1422 != LayoutDirection.Rtl) {
                }
                final Ref.ObjectRef<MutableState<Boolean>> objectRef222 = new Ref.ObjectRef();
                startRestartGroup.startReplaceableGroup(-492369756);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                rememberedValue5 = startRestartGroup.rememberedValue();
                if (rememberedValue5 != Composer.Companion.getEmpty()) {
                }
                startRestartGroup.endReplaceableGroup();
                objectRef222.element = r0;
                startRestartGroup.startReplaceableGroup(-492369756);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                rememberedValue6 = startRestartGroup.rememberedValue();
                if (rememberedValue6 == Composer.Companion.getEmpty()) {
                }
                startRestartGroup.endReplaceableGroup();
                final MutableState<Float> mutableState4222 = (MutableState) rememberedValue6;
                startRestartGroup.startReplaceableGroup(-492369756);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                rememberedValue7 = startRestartGroup.rememberedValue();
                if (rememberedValue7 != Composer.Companion.getEmpty()) {
                }
                startRestartGroup.endReplaceableGroup();
                final MutableState<Float> mutableState5222 = (MutableState) rememberedValue7;
                startRestartGroup.startReplaceableGroup(1157296644);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                changed3 = startRestartGroup.changed(function0);
                rememberedValue8 = startRestartGroup.rememberedValue();
                if (!changed3) {
                }
                rememberedValue8 = new SliderKt$RangeSliderImpl$gestureEndAction$1$1(function0);
                startRestartGroup.updateRememberedValue(rememberedValue8);
                startRestartGroup.endReplaceableGroup();
                String str3222 = str;
                composer2 = startRestartGroup;
                Modifier rangeSliderPressDragModifier222 = rangeSliderPressDragModifier(Modifier.Companion, mutableInteractionSource, mutableInteractionSource2, mutableState4222, mutableState5222, z, z2, RangeSliderImpl$lambda$31(mutableState3222), closedFloatingPointRange2, SnapshotStateKt.rememberUpdatedState(rememberedValue8, startRestartGroup, 0), SnapshotStateKt.rememberUpdatedState(new SliderKt$RangeSliderImpl$onDrag$1(mutableState4222, mutableState5222, closedFloatingPointRange, fArr2222, rememberUpdatedState222, mutableState3222, mutableState2222, mutableState622, closedFloatingPointRange2), composer2, 0));
                float coerceIn322 = RangesKt.coerceIn(closedFloatingPointRange.getStart().floatValue(), closedFloatingPointRange2.getStart().floatValue(), closedFloatingPointRange.getEndInclusive().floatValue());
                float coerceIn2222 = RangesKt.coerceIn(closedFloatingPointRange.getEndInclusive().floatValue(), closedFloatingPointRange.getStart().floatValue(), closedFloatingPointRange2.getEndInclusive().floatValue());
                final float calcFraction322 = calcFraction(closedFloatingPointRange2.getStart().floatValue(), closedFloatingPointRange2.getEndInclusive().floatValue(), coerceIn322);
                final float calcFraction2222 = calcFraction(closedFloatingPointRange2.getStart().floatValue(), closedFloatingPointRange2.getEndInclusive().floatValue(), coerceIn2222);
                composer2.startReplaceableGroup(-492369756);
                ComposerKt.sourceInformation(composer2, str2);
                rememberedValue9 = composer2.rememberedValue();
                if (rememberedValue9 != Composer.Companion.getEmpty()) {
                }
                composer2.endReplaceableGroup();
                SliderPositions sliderPositions222 = (SliderPositions) rememberedValue9;
                sliderPositions222.setActiveRange$material3_release(RangesKt.rangeTo(calcFraction322, calcFraction2222));
                sliderPositions222.setTickFractions$material3_release(fArr);
                float f222 = i17222;
                int floor322 = (int) Math.floor(f222 * calcFraction2222);
                int floor2222 = (int) Math.floor(f222 * (1.0f - calcFraction322));
                Modifier.Companion companion322 = Modifier.Companion;
                Float valueOf2222 = Float.valueOf(coerceIn2222);
                composer2.startReplaceableGroup(511388516);
                ComposerKt.sourceInformation(composer2, "CC(remember)P(1,2):Composables.kt#9igjgp");
                changed4 = composer2.changed(rememberUpdatedState222) | composer2.changed(valueOf2222);
                rememberedValue10 = composer2.rememberedValue();
                if (!changed4) {
                }
                rememberedValue10 = new SliderKt$RangeSliderImpl$startThumbSemantics$1$1(rememberUpdatedState222, coerceIn2222);
                composer2.updateRememberedValue(rememberedValue10);
                composer2.endReplaceableGroup();
                Modifier sliderSemantics322 = sliderSemantics(companion322, coerceIn322, z, (Function1) rememberedValue10, function0, RangesKt.rangeTo(closedFloatingPointRange2.getStart().floatValue(), coerceIn2222), floor322);
                Modifier.Companion companion2222 = Modifier.Companion;
                Float valueOf3222 = Float.valueOf(coerceIn322);
                composer2.startReplaceableGroup(511388516);
                ComposerKt.sourceInformation(composer2, "CC(remember)P(1,2):Composables.kt#9igjgp");
                changed5 = composer2.changed(valueOf3222) | composer2.changed(rememberUpdatedState222);
                rememberedValue11 = composer2.rememberedValue();
                if (!changed5) {
                }
                rememberedValue11 = new SliderKt$RangeSliderImpl$endThumbSemantics$1$1(rememberUpdatedState222, coerceIn322);
                composer2.updateRememberedValue(rememberedValue11);
                composer2.endReplaceableGroup();
                Modifier sliderSemantics2222 = sliderSemantics(companion2222, coerceIn2222, z, rememberedValue11, function0, RangesKt.rangeTo(coerceIn322, closedFloatingPointRange2.getEndInclusive().floatValue()), floor2222);
                String m2058getStringNWtq28322 = Strings_androidKt.m2058getStringNWtq28(Strings.Companion.m2041getSliderRangeStartadMyvUU(), composer2, 6);
                String m2058getStringNWtq282222 = Strings_androidKt.m2058getStringNWtq28(Strings.Companion.m2040getSliderRangeEndadMyvUU(), composer2, 6);
                Modifier then422 = SizeKt.m791requiredSizeInqDBjuR0$default(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier), SliderTokens.INSTANCE.m2708getHandleWidthD9Ej5fM(), SliderTokens.INSTANCE.m2707getHandleHeightD9Ej5fM(), 0.0f, 0.0f, 12, null).then(rangeSliderPressDragModifier222);
                MeasurePolicy measurePolicy222 = new MeasurePolicy() { // from class: androidx.compose.material3.SliderKt$RangeSliderImpl$2
                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    public /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i18) {
                        return MeasurePolicy.CC.$default$maxIntrinsicHeight(this, intrinsicMeasureScope, list, i18);
                    }

                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    public /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i18) {
                        return MeasurePolicy.CC.$default$maxIntrinsicWidth(this, intrinsicMeasureScope, list, i18);
                    }

                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    public /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i18) {
                        return MeasurePolicy.CC.$default$minIntrinsicHeight(this, intrinsicMeasureScope, list, i18);
                    }

                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    public /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i18) {
                        return MeasurePolicy.CC.$default$minIntrinsicWidth(this, intrinsicMeasureScope, list, i18);
                    }

                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    /* renamed from: measure-3p2s80s */
                    public final MeasureResult mo272measure3p2s80s(MeasureScope Layout, List<? extends Measurable> measurables, long j) {
                        boolean z3;
                        boolean z4;
                        boolean z5;
                        float RangeSliderImpl$lambda$25;
                        float RangeSliderImpl$lambda$28;
                        int RangeSliderImpl$lambda$31;
                        float RangeSliderImpl$lambda$282;
                        float RangeSliderImpl$lambda$252;
                        float RangeSliderImpl$scaleToOffset$34;
                        float RangeSliderImpl$scaleToOffset$342;
                        Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
                        Intrinsics.checkNotNullParameter(measurables, "measurables");
                        List<? extends Measurable> list = measurables;
                        for (Measurable measurable : list) {
                            if (LayoutIdKt.getLayoutId(measurable) == RangeSliderComponents.STARTTHUMB) {
                                z3 = true;
                                continue;
                            } else {
                                z3 = false;
                                continue;
                            }
                            if (z3) {
                                Placeable mo4545measureBRTryo0 = measurable.mo4545measureBRTryo0(j);
                                for (Measurable measurable2 : list) {
                                    if (LayoutIdKt.getLayoutId(measurable2) == RangeSliderComponents.ENDTHUMB) {
                                        z4 = true;
                                        continue;
                                    } else {
                                        z4 = false;
                                        continue;
                                    }
                                    if (z4) {
                                        Placeable mo4545measureBRTryo02 = measurable2.mo4545measureBRTryo0(j);
                                        for (Measurable measurable3 : list) {
                                            if (LayoutIdKt.getLayoutId(measurable3) == RangeSliderComponents.TRACK) {
                                                z5 = true;
                                                continue;
                                            } else {
                                                z5 = false;
                                                continue;
                                            }
                                            if (z5) {
                                                Placeable mo4545measureBRTryo03 = measurable3.mo4545measureBRTryo0(Constraints.m5542copyZbe2FdA$default(ConstraintsKt.m5568offsetNN6EwU$default(j, (-(mo4545measureBRTryo0.getWidth() + mo4545measureBRTryo02.getWidth())) / 2, 0, 2, null), 0, 0, 0, 0, 11, null));
                                                int width = mo4545measureBRTryo03.getWidth() + ((mo4545measureBRTryo0.getWidth() + mo4545measureBRTryo02.getWidth()) / 2);
                                                int max = Math.max(mo4545measureBRTryo03.getHeight(), Math.max(mo4545measureBRTryo0.getHeight(), mo4545measureBRTryo02.getHeight()));
                                                SliderKt.RangeSliderImpl$lambda$26(mutableState622, mo4545measureBRTryo0.getWidth());
                                                SliderKt.RangeSliderImpl$lambda$29(mutableState2222, mo4545measureBRTryo02.getWidth());
                                                SliderKt.RangeSliderImpl$lambda$32(mutableState3222, width);
                                                if (!objectRef222.element.getValue().booleanValue()) {
                                                    RangeSliderImpl$lambda$31 = SliderKt.RangeSliderImpl$lambda$31(mutableState3222);
                                                    RangeSliderImpl$lambda$282 = SliderKt.RangeSliderImpl$lambda$28(mutableState2222);
                                                    float f2222 = 2;
                                                    float max2 = Math.max(RangeSliderImpl$lambda$31 - (RangeSliderImpl$lambda$282 / f2222), 0.0f);
                                                    RangeSliderImpl$lambda$252 = SliderKt.RangeSliderImpl$lambda$25(mutableState622);
                                                    float min = Math.min(RangeSliderImpl$lambda$252 / f2222, max2);
                                                    MutableState<Float> mutableState6222 = mutableState4222;
                                                    RangeSliderImpl$scaleToOffset$34 = SliderKt.RangeSliderImpl$scaleToOffset$34(closedFloatingPointRange2, min, max2, closedFloatingPointRange.getStart().floatValue());
                                                    mutableState6222.setValue(Float.valueOf(RangeSliderImpl$scaleToOffset$34));
                                                    MutableState<Float> mutableState7 = mutableState5222;
                                                    RangeSliderImpl$scaleToOffset$342 = SliderKt.RangeSliderImpl$scaleToOffset$34(closedFloatingPointRange2, min, max2, closedFloatingPointRange.getEndInclusive().floatValue());
                                                    mutableState7.setValue(Float.valueOf(RangeSliderImpl$scaleToOffset$342));
                                                    objectRef222.element.setValue(true);
                                                }
                                                int width2 = mo4545measureBRTryo0.getWidth() / 2;
                                                int roundToInt = MathKt.roundToInt(mo4545measureBRTryo03.getWidth() * calcFraction322);
                                                RangeSliderImpl$lambda$25 = SliderKt.RangeSliderImpl$lambda$25(mutableState622);
                                                RangeSliderImpl$lambda$28 = SliderKt.RangeSliderImpl$lambda$28(mutableState2222);
                                                return MeasureScope.CC.layout$default(Layout, width, max, null, new SliderKt$RangeSliderImpl$2$measure$1(mo4545measureBRTryo03, width2, (max - mo4545measureBRTryo03.getHeight()) / 2, mo4545measureBRTryo0, roundToInt, (max - mo4545measureBRTryo0.getHeight()) / 2, mo4545measureBRTryo02, MathKt.roundToInt((mo4545measureBRTryo03.getWidth() * calcFraction2222) + ((RangeSliderImpl$lambda$25 - RangeSliderImpl$lambda$28) / 2)), (max - mo4545measureBRTryo02.getHeight()) / 2), 4, null);
                                            }
                                        }
                                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                                    }
                                }
                                throw new NoSuchElementException("Collection contains no element matching the predicate.");
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                };
                composer2.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(composer2, "CC(Layout)P(!1,2)73@2855L7,74@2910L7,75@2969L7,76@2981L460:Layout.kt#80mrfh");
                ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, str3222);
                Object consume2222 = composer2.consume(CompositionLocalsKt.getLocalDensity());
                ComposerKt.sourceInformationMarkerEnd(composer2);
                Density density522 = (Density) consume2222;
                ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, str3222);
                Object consume3222 = composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ComposerKt.sourceInformationMarkerEnd(composer2);
                LayoutDirection layoutDirection522 = (LayoutDirection) consume3222;
                ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, str3222);
                Object consume4222 = composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ViewConfiguration viewConfiguration522 = (ViewConfiguration) consume4222;
                Function0<ComposeUiNode> constructor522 = ComposeUiNode.Companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf522 = LayoutKt.materializerOf(then422);
                if (!(composer2.getApplier() instanceof Applier)) {
                }
                composer2.startReusableNode();
                if (!composer2.getInserting()) {
                }
                Composer m2893constructorimpl522 = Updater.m2893constructorimpl(composer2);
                Updater.m2900setimpl(m2893constructorimpl522, measurePolicy222, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.m2900setimpl(m2893constructorimpl522, density522, ComposeUiNode.Companion.getSetDensity());
                Updater.m2900setimpl(m2893constructorimpl522, layoutDirection522, ComposeUiNode.Companion.getSetLayoutDirection());
                Updater.m2900setimpl(m2893constructorimpl522, viewConfiguration522, ComposeUiNode.Companion.getSetViewConfiguration());
                materializerOf522.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(composer2)), composer2, 0);
                composer2.startReplaceableGroup(2058660585);
                ComposerKt.sourceInformationMarkerStart(composer2, -2040262222, "C754@31668L84,752@31532L369,762@32048L82,760@31914L359,768@32286L117:Slider.kt#uh7d8r");
                Modifier layoutId422 = LayoutIdKt.layoutId(Modifier.Companion, RangeSliderComponents.STARTTHUMB);
                composer2.startReplaceableGroup(1157296644);
                ComposerKt.sourceInformation(composer2, "CC(remember)P(1):Composables.kt#9igjgp");
                changed6 = composer2.changed(m2058getStringNWtq28322);
                rememberedValue12 = composer2.rememberedValue();
                if (!changed6) {
                }
                rememberedValue12 = new SliderKt$RangeSliderImpl$1$1$1(m2058getStringNWtq28322);
                composer2.updateRememberedValue(rememberedValue12);
                composer2.endReplaceableGroup();
                Modifier then2222 = FocusableKt.focusable(SemanticsModifierKt.semantics(layoutId422, true, (Function1) rememberedValue12), z, mutableInteractionSource).then(sliderSemantics322);
                composer2.startReplaceableGroup(733328855);
                ComposerKt.sourceInformation(composer2, "CC(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                MeasurePolicy rememberBoxMeasurePolicy422 = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, composer2, 0);
                composer2.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(composer2, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume5222 = composer2.consume(CompositionLocalsKt.getLocalDensity());
                ComposerKt.sourceInformationMarkerEnd(composer2);
                Density density2222 = (Density) consume5222;
                ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume6222 = composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ComposerKt.sourceInformationMarkerEnd(composer2);
                LayoutDirection layoutDirection2222 = (LayoutDirection) consume6222;
                ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume7222 = composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ViewConfiguration viewConfiguration2222 = (ViewConfiguration) consume7222;
                Function0<ComposeUiNode> constructor2222 = ComposeUiNode.Companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf2222 = LayoutKt.materializerOf(then2222);
                if (!(composer2.getApplier() instanceof Applier)) {
                }
                composer2.startReusableNode();
                if (!composer2.getInserting()) {
                }
                composer2.disableReusing();
                Composer m2893constructorimpl2222 = Updater.m2893constructorimpl(composer2);
                Updater.m2900setimpl(m2893constructorimpl2222, rememberBoxMeasurePolicy422, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.m2900setimpl(m2893constructorimpl2222, density2222, ComposeUiNode.Companion.getSetDensity());
                Updater.m2900setimpl(m2893constructorimpl2222, layoutDirection2222, ComposeUiNode.Companion.getSetLayoutDirection());
                Updater.m2900setimpl(m2893constructorimpl2222, viewConfiguration2222, ComposeUiNode.Companion.getSetViewConfiguration());
                composer2.enableReusing();
                materializerOf2222.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(composer2)), composer2, 0);
                composer2.startReplaceableGroup(2058660585);
                ComposerKt.sourceInformationMarkerStart(composer2, -1253629305, "C72@3384L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance422 = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composer2, 1631550503, "C759@31872L27:Slider.kt#uh7d8r");
                function3.invoke(sliderPositions222, composer2, Integer.valueOf(((i15 >> 24) & 112) | 6));
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                Modifier layoutId2222 = LayoutIdKt.layoutId(Modifier.Companion, RangeSliderComponents.ENDTHUMB);
                composer2.startReplaceableGroup(1157296644);
                ComposerKt.sourceInformation(composer2, "CC(remember)P(1):Composables.kt#9igjgp");
                changed7 = composer2.changed(m2058getStringNWtq282222);
                rememberedValue13 = composer2.rememberedValue();
                if (!changed7) {
                }
                rememberedValue13 = new SliderKt$RangeSliderImpl$1$3$1(m2058getStringNWtq282222);
                composer2.updateRememberedValue(rememberedValue13);
                composer2.endReplaceableGroup();
                Modifier then3222 = FocusableKt.focusable(SemanticsModifierKt.semantics(layoutId2222, true, (Function1) rememberedValue13), z, mutableInteractionSource2).then(sliderSemantics2222);
                composer2.startReplaceableGroup(733328855);
                ComposerKt.sourceInformation(composer2, "CC(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                MeasurePolicy rememberBoxMeasurePolicy2222 = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, composer2, 0);
                composer2.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(composer2, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume8222 = composer2.consume(CompositionLocalsKt.getLocalDensity());
                ComposerKt.sourceInformationMarkerEnd(composer2);
                Density density3222 = (Density) consume8222;
                ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume9222 = composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ComposerKt.sourceInformationMarkerEnd(composer2);
                LayoutDirection layoutDirection3222 = (LayoutDirection) consume9222;
                ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume10222 = composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ViewConfiguration viewConfiguration3222 = (ViewConfiguration) consume10222;
                Function0<ComposeUiNode> constructor3222 = ComposeUiNode.Companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf3222 = LayoutKt.materializerOf(then3222);
                if (!(composer2.getApplier() instanceof Applier)) {
                }
                composer2.startReusableNode();
                if (!composer2.getInserting()) {
                }
                composer2.disableReusing();
                Composer m2893constructorimpl3222 = Updater.m2893constructorimpl(composer2);
                Updater.m2900setimpl(m2893constructorimpl3222, rememberBoxMeasurePolicy2222, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.m2900setimpl(m2893constructorimpl3222, density3222, ComposeUiNode.Companion.getSetDensity());
                Updater.m2900setimpl(m2893constructorimpl3222, layoutDirection3222, ComposeUiNode.Companion.getSetLayoutDirection());
                Updater.m2900setimpl(m2893constructorimpl3222, viewConfiguration3222, ComposeUiNode.Companion.getSetViewConfiguration());
                composer2.enableReusing();
                materializerOf3222.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(composer2)), composer2, 0);
                composer2.startReplaceableGroup(2058660585);
                ComposerKt.sourceInformationMarkerStart(composer2, -1253629305, "C72@3384L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance2222 = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composer2, 1631550877, "C767@32246L25:Slider.kt#uh7d8r");
                function32.invoke(sliderPositions222, composer2, Integer.valueOf(((i13 << 3) & 112) | 6));
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                Modifier layoutId3222 = LayoutIdKt.layoutId(Modifier.Companion, RangeSliderComponents.TRACK);
                composer2.startReplaceableGroup(733328855);
                ComposerKt.sourceInformation(composer2, "CC(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                MeasurePolicy rememberBoxMeasurePolicy3222 = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, composer2, 0);
                composer2.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(composer2, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume11222 = composer2.consume(CompositionLocalsKt.getLocalDensity());
                ComposerKt.sourceInformationMarkerEnd(composer2);
                Density density4222 = (Density) consume11222;
                ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume12222 = composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ComposerKt.sourceInformationMarkerEnd(composer2);
                LayoutDirection layoutDirection4222 = (LayoutDirection) consume12222;
                ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume13222 = composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ViewConfiguration viewConfiguration4222 = (ViewConfiguration) consume13222;
                Function0<ComposeUiNode> constructor4222 = ComposeUiNode.Companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf4222 = LayoutKt.materializerOf(layoutId3222);
                if (!(composer2.getApplier() instanceof Applier)) {
                }
                composer2.startReusableNode();
                if (!composer2.getInserting()) {
                }
                composer2.disableReusing();
                Composer m2893constructorimpl4222 = Updater.m2893constructorimpl(composer2);
                Updater.m2900setimpl(m2893constructorimpl4222, rememberBoxMeasurePolicy3222, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.m2900setimpl(m2893constructorimpl4222, density4222, ComposeUiNode.Companion.getSetDensity());
                Updater.m2900setimpl(m2893constructorimpl4222, layoutDirection4222, ComposeUiNode.Companion.getSetLayoutDirection());
                Updater.m2900setimpl(m2893constructorimpl4222, viewConfiguration4222, ComposeUiNode.Companion.getSetViewConfiguration());
                composer2.enableReusing();
                materializerOf4222.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(composer2)), composer2, 0);
                composer2.startReplaceableGroup(2058660585);
                ComposerKt.sourceInformationMarkerStart(composer2, -1253629305, "C72@3384L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance3222 = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composer2, 1631550998, "C769@32367L22:Slider.kt#uh7d8r");
                function33.invoke(sliderPositions222, composer2, Integer.valueOf((i13 & 112) | 6));
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                }
                i16 = i17222;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            i5 |= i7;
            if ((i4 & 128) != 0) {
            }
            i5 |= i8;
            if ((i4 & 256) == 0) {
            }
            i5 |= i9;
            if ((i4 & 512) == 0) {
            }
            i5 |= i10;
            i11 = i5;
            if ((i4 & 1024) == 0) {
            }
            if ((i4 & 2048) == 0) {
            }
            i13 = i12;
            if ((1533916891 & i11) == 306783378) {
            }
            if (i6 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.startReplaceableGroup(511388516);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
            changed = startRestartGroup.changed(closedFloatingPointRange) | startRestartGroup.changed(function1);
            SliderKt$RangeSliderImpl$onValueChangeState$1$1 rememberedValue142222 = startRestartGroup.rememberedValue();
            if (changed) {
            }
            rememberedValue142222 = new SliderKt$RangeSliderImpl$onValueChangeState$1$1(closedFloatingPointRange, function1);
            startRestartGroup.updateRememberedValue(rememberedValue142222);
            startRestartGroup.endReplaceableGroup();
            State rememberUpdatedState2222 = SnapshotStateKt.rememberUpdatedState(rememberedValue142222, startRestartGroup, 0);
            Integer valueOf4222 = Integer.valueOf(i14);
            startRestartGroup.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
            changed2 = startRestartGroup.changed(valueOf4222);
            rememberedValue = startRestartGroup.rememberedValue();
            if (!changed2) {
            }
            rememberedValue = stepsToTickFractions(i14);
            startRestartGroup.updateRememberedValue(rememberedValue);
            startRestartGroup.endReplaceableGroup();
            float[] fArr22222 = (float[]) rememberedValue;
            startRestartGroup.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
            int i172222 = i14;
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.Companion.getEmpty()) {
            }
            startRestartGroup.endReplaceableGroup();
            final MutableState<Float> mutableState6222 = (MutableState) rememberedValue2;
            startRestartGroup.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == Composer.Companion.getEmpty()) {
            }
            startRestartGroup.endReplaceableGroup();
            final MutableState<Float> mutableState22222 = (MutableState) rememberedValue3;
            startRestartGroup.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
            rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == Composer.Companion.getEmpty()) {
            }
            startRestartGroup.endReplaceableGroup();
            final MutableState<Integer> mutableState32222 = (MutableState) rememberedValue4;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume14222 = startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (consume14222 != LayoutDirection.Rtl) {
            }
            final Ref.ObjectRef<MutableState<Boolean>> objectRef2222 = new Ref.ObjectRef();
            startRestartGroup.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
            rememberedValue5 = startRestartGroup.rememberedValue();
            if (rememberedValue5 != Composer.Companion.getEmpty()) {
            }
            startRestartGroup.endReplaceableGroup();
            objectRef2222.element = r0;
            startRestartGroup.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
            rememberedValue6 = startRestartGroup.rememberedValue();
            if (rememberedValue6 == Composer.Companion.getEmpty()) {
            }
            startRestartGroup.endReplaceableGroup();
            final MutableState<Float> mutableState42222 = (MutableState) rememberedValue6;
            startRestartGroup.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
            rememberedValue7 = startRestartGroup.rememberedValue();
            if (rememberedValue7 != Composer.Companion.getEmpty()) {
            }
            startRestartGroup.endReplaceableGroup();
            final MutableState<Float> mutableState52222 = (MutableState) rememberedValue7;
            startRestartGroup.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
            changed3 = startRestartGroup.changed(function0);
            rememberedValue8 = startRestartGroup.rememberedValue();
            if (!changed3) {
            }
            rememberedValue8 = new SliderKt$RangeSliderImpl$gestureEndAction$1$1(function0);
            startRestartGroup.updateRememberedValue(rememberedValue8);
            startRestartGroup.endReplaceableGroup();
            String str32222 = str;
            composer2 = startRestartGroup;
            Modifier rangeSliderPressDragModifier2222 = rangeSliderPressDragModifier(Modifier.Companion, mutableInteractionSource, mutableInteractionSource2, mutableState42222, mutableState52222, z, z2, RangeSliderImpl$lambda$31(mutableState32222), closedFloatingPointRange2, SnapshotStateKt.rememberUpdatedState(rememberedValue8, startRestartGroup, 0), SnapshotStateKt.rememberUpdatedState(new SliderKt$RangeSliderImpl$onDrag$1(mutableState42222, mutableState52222, closedFloatingPointRange, fArr22222, rememberUpdatedState2222, mutableState32222, mutableState22222, mutableState6222, closedFloatingPointRange2), composer2, 0));
            float coerceIn3222 = RangesKt.coerceIn(closedFloatingPointRange.getStart().floatValue(), closedFloatingPointRange2.getStart().floatValue(), closedFloatingPointRange.getEndInclusive().floatValue());
            float coerceIn22222 = RangesKt.coerceIn(closedFloatingPointRange.getEndInclusive().floatValue(), closedFloatingPointRange.getStart().floatValue(), closedFloatingPointRange2.getEndInclusive().floatValue());
            final float calcFraction3222 = calcFraction(closedFloatingPointRange2.getStart().floatValue(), closedFloatingPointRange2.getEndInclusive().floatValue(), coerceIn3222);
            final float calcFraction22222 = calcFraction(closedFloatingPointRange2.getStart().floatValue(), closedFloatingPointRange2.getEndInclusive().floatValue(), coerceIn22222);
            composer2.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(composer2, str2);
            rememberedValue9 = composer2.rememberedValue();
            if (rememberedValue9 != Composer.Companion.getEmpty()) {
            }
            composer2.endReplaceableGroup();
            SliderPositions sliderPositions2222 = (SliderPositions) rememberedValue9;
            sliderPositions2222.setActiveRange$material3_release(RangesKt.rangeTo(calcFraction3222, calcFraction22222));
            sliderPositions2222.setTickFractions$material3_release(fArr);
            float f2222 = i172222;
            int floor3222 = (int) Math.floor(f2222 * calcFraction22222);
            int floor22222 = (int) Math.floor(f2222 * (1.0f - calcFraction3222));
            Modifier.Companion companion3222 = Modifier.Companion;
            Float valueOf22222 = Float.valueOf(coerceIn22222);
            composer2.startReplaceableGroup(511388516);
            ComposerKt.sourceInformation(composer2, "CC(remember)P(1,2):Composables.kt#9igjgp");
            changed4 = composer2.changed(rememberUpdatedState2222) | composer2.changed(valueOf22222);
            rememberedValue10 = composer2.rememberedValue();
            if (!changed4) {
            }
            rememberedValue10 = new SliderKt$RangeSliderImpl$startThumbSemantics$1$1(rememberUpdatedState2222, coerceIn22222);
            composer2.updateRememberedValue(rememberedValue10);
            composer2.endReplaceableGroup();
            Modifier sliderSemantics3222 = sliderSemantics(companion3222, coerceIn3222, z, (Function1) rememberedValue10, function0, RangesKt.rangeTo(closedFloatingPointRange2.getStart().floatValue(), coerceIn22222), floor3222);
            Modifier.Companion companion22222 = Modifier.Companion;
            Float valueOf32222 = Float.valueOf(coerceIn3222);
            composer2.startReplaceableGroup(511388516);
            ComposerKt.sourceInformation(composer2, "CC(remember)P(1,2):Composables.kt#9igjgp");
            changed5 = composer2.changed(valueOf32222) | composer2.changed(rememberUpdatedState2222);
            rememberedValue11 = composer2.rememberedValue();
            if (!changed5) {
            }
            rememberedValue11 = new SliderKt$RangeSliderImpl$endThumbSemantics$1$1(rememberUpdatedState2222, coerceIn3222);
            composer2.updateRememberedValue(rememberedValue11);
            composer2.endReplaceableGroup();
            Modifier sliderSemantics22222 = sliderSemantics(companion22222, coerceIn22222, z, rememberedValue11, function0, RangesKt.rangeTo(coerceIn3222, closedFloatingPointRange2.getEndInclusive().floatValue()), floor22222);
            String m2058getStringNWtq283222 = Strings_androidKt.m2058getStringNWtq28(Strings.Companion.m2041getSliderRangeStartadMyvUU(), composer2, 6);
            String m2058getStringNWtq2822222 = Strings_androidKt.m2058getStringNWtq28(Strings.Companion.m2040getSliderRangeEndadMyvUU(), composer2, 6);
            Modifier then4222 = SizeKt.m791requiredSizeInqDBjuR0$default(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier), SliderTokens.INSTANCE.m2708getHandleWidthD9Ej5fM(), SliderTokens.INSTANCE.m2707getHandleHeightD9Ej5fM(), 0.0f, 0.0f, 12, null).then(rangeSliderPressDragModifier2222);
            MeasurePolicy measurePolicy2222 = new MeasurePolicy() { // from class: androidx.compose.material3.SliderKt$RangeSliderImpl$2
                @Override // androidx.compose.ui.layout.MeasurePolicy
                public /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i18) {
                    return MeasurePolicy.CC.$default$maxIntrinsicHeight(this, intrinsicMeasureScope, list, i18);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i18) {
                    return MeasurePolicy.CC.$default$maxIntrinsicWidth(this, intrinsicMeasureScope, list, i18);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i18) {
                    return MeasurePolicy.CC.$default$minIntrinsicHeight(this, intrinsicMeasureScope, list, i18);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i18) {
                    return MeasurePolicy.CC.$default$minIntrinsicWidth(this, intrinsicMeasureScope, list, i18);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                /* renamed from: measure-3p2s80s */
                public final MeasureResult mo272measure3p2s80s(MeasureScope Layout, List<? extends Measurable> measurables, long j) {
                    boolean z3;
                    boolean z4;
                    boolean z5;
                    float RangeSliderImpl$lambda$25;
                    float RangeSliderImpl$lambda$28;
                    int RangeSliderImpl$lambda$31;
                    float RangeSliderImpl$lambda$282;
                    float RangeSliderImpl$lambda$252;
                    float RangeSliderImpl$scaleToOffset$34;
                    float RangeSliderImpl$scaleToOffset$342;
                    Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
                    Intrinsics.checkNotNullParameter(measurables, "measurables");
                    List<? extends Measurable> list = measurables;
                    for (Measurable measurable : list) {
                        if (LayoutIdKt.getLayoutId(measurable) == RangeSliderComponents.STARTTHUMB) {
                            z3 = true;
                            continue;
                        } else {
                            z3 = false;
                            continue;
                        }
                        if (z3) {
                            Placeable mo4545measureBRTryo0 = measurable.mo4545measureBRTryo0(j);
                            for (Measurable measurable2 : list) {
                                if (LayoutIdKt.getLayoutId(measurable2) == RangeSliderComponents.ENDTHUMB) {
                                    z4 = true;
                                    continue;
                                } else {
                                    z4 = false;
                                    continue;
                                }
                                if (z4) {
                                    Placeable mo4545measureBRTryo02 = measurable2.mo4545measureBRTryo0(j);
                                    for (Measurable measurable3 : list) {
                                        if (LayoutIdKt.getLayoutId(measurable3) == RangeSliderComponents.TRACK) {
                                            z5 = true;
                                            continue;
                                        } else {
                                            z5 = false;
                                            continue;
                                        }
                                        if (z5) {
                                            Placeable mo4545measureBRTryo03 = measurable3.mo4545measureBRTryo0(Constraints.m5542copyZbe2FdA$default(ConstraintsKt.m5568offsetNN6EwU$default(j, (-(mo4545measureBRTryo0.getWidth() + mo4545measureBRTryo02.getWidth())) / 2, 0, 2, null), 0, 0, 0, 0, 11, null));
                                            int width = mo4545measureBRTryo03.getWidth() + ((mo4545measureBRTryo0.getWidth() + mo4545measureBRTryo02.getWidth()) / 2);
                                            int max = Math.max(mo4545measureBRTryo03.getHeight(), Math.max(mo4545measureBRTryo0.getHeight(), mo4545measureBRTryo02.getHeight()));
                                            SliderKt.RangeSliderImpl$lambda$26(mutableState6222, mo4545measureBRTryo0.getWidth());
                                            SliderKt.RangeSliderImpl$lambda$29(mutableState22222, mo4545measureBRTryo02.getWidth());
                                            SliderKt.RangeSliderImpl$lambda$32(mutableState32222, width);
                                            if (!objectRef2222.element.getValue().booleanValue()) {
                                                RangeSliderImpl$lambda$31 = SliderKt.RangeSliderImpl$lambda$31(mutableState32222);
                                                RangeSliderImpl$lambda$282 = SliderKt.RangeSliderImpl$lambda$28(mutableState22222);
                                                float f22222 = 2;
                                                float max2 = Math.max(RangeSliderImpl$lambda$31 - (RangeSliderImpl$lambda$282 / f22222), 0.0f);
                                                RangeSliderImpl$lambda$252 = SliderKt.RangeSliderImpl$lambda$25(mutableState6222);
                                                float min = Math.min(RangeSliderImpl$lambda$252 / f22222, max2);
                                                MutableState<Float> mutableState62222 = mutableState42222;
                                                RangeSliderImpl$scaleToOffset$34 = SliderKt.RangeSliderImpl$scaleToOffset$34(closedFloatingPointRange2, min, max2, closedFloatingPointRange.getStart().floatValue());
                                                mutableState62222.setValue(Float.valueOf(RangeSliderImpl$scaleToOffset$34));
                                                MutableState<Float> mutableState7 = mutableState52222;
                                                RangeSliderImpl$scaleToOffset$342 = SliderKt.RangeSliderImpl$scaleToOffset$34(closedFloatingPointRange2, min, max2, closedFloatingPointRange.getEndInclusive().floatValue());
                                                mutableState7.setValue(Float.valueOf(RangeSliderImpl$scaleToOffset$342));
                                                objectRef2222.element.setValue(true);
                                            }
                                            int width2 = mo4545measureBRTryo0.getWidth() / 2;
                                            int roundToInt = MathKt.roundToInt(mo4545measureBRTryo03.getWidth() * calcFraction3222);
                                            RangeSliderImpl$lambda$25 = SliderKt.RangeSliderImpl$lambda$25(mutableState6222);
                                            RangeSliderImpl$lambda$28 = SliderKt.RangeSliderImpl$lambda$28(mutableState22222);
                                            return MeasureScope.CC.layout$default(Layout, width, max, null, new SliderKt$RangeSliderImpl$2$measure$1(mo4545measureBRTryo03, width2, (max - mo4545measureBRTryo03.getHeight()) / 2, mo4545measureBRTryo0, roundToInt, (max - mo4545measureBRTryo0.getHeight()) / 2, mo4545measureBRTryo02, MathKt.roundToInt((mo4545measureBRTryo03.getWidth() * calcFraction22222) + ((RangeSliderImpl$lambda$25 - RangeSliderImpl$lambda$28) / 2)), (max - mo4545measureBRTryo02.getHeight()) / 2), 4, null);
                                        }
                                    }
                                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                                }
                            }
                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
            };
            composer2.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(composer2, "CC(Layout)P(!1,2)73@2855L7,74@2910L7,75@2969L7,76@2981L460:Layout.kt#80mrfh");
            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, str32222);
            Object consume22222 = composer2.consume(CompositionLocalsKt.getLocalDensity());
            ComposerKt.sourceInformationMarkerEnd(composer2);
            Density density5222 = (Density) consume22222;
            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, str32222);
            Object consume32222 = composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ComposerKt.sourceInformationMarkerEnd(composer2);
            LayoutDirection layoutDirection5222 = (LayoutDirection) consume32222;
            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, str32222);
            Object consume42222 = composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ViewConfiguration viewConfiguration5222 = (ViewConfiguration) consume42222;
            Function0<ComposeUiNode> constructor5222 = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf5222 = LayoutKt.materializerOf(then4222);
            if (!(composer2.getApplier() instanceof Applier)) {
            }
            composer2.startReusableNode();
            if (!composer2.getInserting()) {
            }
            Composer m2893constructorimpl5222 = Updater.m2893constructorimpl(composer2);
            Updater.m2900setimpl(m2893constructorimpl5222, measurePolicy2222, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2900setimpl(m2893constructorimpl5222, density5222, ComposeUiNode.Companion.getSetDensity());
            Updater.m2900setimpl(m2893constructorimpl5222, layoutDirection5222, ComposeUiNode.Companion.getSetLayoutDirection());
            Updater.m2900setimpl(m2893constructorimpl5222, viewConfiguration5222, ComposeUiNode.Companion.getSetViewConfiguration());
            materializerOf5222.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(composer2)), composer2, 0);
            composer2.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(composer2, -2040262222, "C754@31668L84,752@31532L369,762@32048L82,760@31914L359,768@32286L117:Slider.kt#uh7d8r");
            Modifier layoutId4222 = LayoutIdKt.layoutId(Modifier.Companion, RangeSliderComponents.STARTTHUMB);
            composer2.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(composer2, "CC(remember)P(1):Composables.kt#9igjgp");
            changed6 = composer2.changed(m2058getStringNWtq283222);
            rememberedValue12 = composer2.rememberedValue();
            if (!changed6) {
            }
            rememberedValue12 = new SliderKt$RangeSliderImpl$1$1$1(m2058getStringNWtq283222);
            composer2.updateRememberedValue(rememberedValue12);
            composer2.endReplaceableGroup();
            Modifier then22222 = FocusableKt.focusable(SemanticsModifierKt.semantics(layoutId4222, true, (Function1) rememberedValue12), z, mutableInteractionSource).then(sliderSemantics3222);
            composer2.startReplaceableGroup(733328855);
            ComposerKt.sourceInformation(composer2, "CC(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
            MeasurePolicy rememberBoxMeasurePolicy4222 = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, composer2, 0);
            composer2.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(composer2, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume52222 = composer2.consume(CompositionLocalsKt.getLocalDensity());
            ComposerKt.sourceInformationMarkerEnd(composer2);
            Density density22222 = (Density) consume52222;
            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume62222 = composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ComposerKt.sourceInformationMarkerEnd(composer2);
            LayoutDirection layoutDirection22222 = (LayoutDirection) consume62222;
            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume72222 = composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ViewConfiguration viewConfiguration22222 = (ViewConfiguration) consume72222;
            Function0<ComposeUiNode> constructor22222 = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf22222 = LayoutKt.materializerOf(then22222);
            if (!(composer2.getApplier() instanceof Applier)) {
            }
            composer2.startReusableNode();
            if (!composer2.getInserting()) {
            }
            composer2.disableReusing();
            Composer m2893constructorimpl22222 = Updater.m2893constructorimpl(composer2);
            Updater.m2900setimpl(m2893constructorimpl22222, rememberBoxMeasurePolicy4222, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2900setimpl(m2893constructorimpl22222, density22222, ComposeUiNode.Companion.getSetDensity());
            Updater.m2900setimpl(m2893constructorimpl22222, layoutDirection22222, ComposeUiNode.Companion.getSetLayoutDirection());
            Updater.m2900setimpl(m2893constructorimpl22222, viewConfiguration22222, ComposeUiNode.Companion.getSetViewConfiguration());
            composer2.enableReusing();
            materializerOf22222.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(composer2)), composer2, 0);
            composer2.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(composer2, -1253629305, "C72@3384L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance4222 = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer2, 1631550503, "C759@31872L27:Slider.kt#uh7d8r");
            function3.invoke(sliderPositions2222, composer2, Integer.valueOf(((i15 >> 24) & 112) | 6));
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            Modifier layoutId22222 = LayoutIdKt.layoutId(Modifier.Companion, RangeSliderComponents.ENDTHUMB);
            composer2.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(composer2, "CC(remember)P(1):Composables.kt#9igjgp");
            changed7 = composer2.changed(m2058getStringNWtq2822222);
            rememberedValue13 = composer2.rememberedValue();
            if (!changed7) {
            }
            rememberedValue13 = new SliderKt$RangeSliderImpl$1$3$1(m2058getStringNWtq2822222);
            composer2.updateRememberedValue(rememberedValue13);
            composer2.endReplaceableGroup();
            Modifier then32222 = FocusableKt.focusable(SemanticsModifierKt.semantics(layoutId22222, true, (Function1) rememberedValue13), z, mutableInteractionSource2).then(sliderSemantics22222);
            composer2.startReplaceableGroup(733328855);
            ComposerKt.sourceInformation(composer2, "CC(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
            MeasurePolicy rememberBoxMeasurePolicy22222 = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, composer2, 0);
            composer2.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(composer2, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume82222 = composer2.consume(CompositionLocalsKt.getLocalDensity());
            ComposerKt.sourceInformationMarkerEnd(composer2);
            Density density32222 = (Density) consume82222;
            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume92222 = composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ComposerKt.sourceInformationMarkerEnd(composer2);
            LayoutDirection layoutDirection32222 = (LayoutDirection) consume92222;
            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume102222 = composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ViewConfiguration viewConfiguration32222 = (ViewConfiguration) consume102222;
            Function0<ComposeUiNode> constructor32222 = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf32222 = LayoutKt.materializerOf(then32222);
            if (!(composer2.getApplier() instanceof Applier)) {
            }
            composer2.startReusableNode();
            if (!composer2.getInserting()) {
            }
            composer2.disableReusing();
            Composer m2893constructorimpl32222 = Updater.m2893constructorimpl(composer2);
            Updater.m2900setimpl(m2893constructorimpl32222, rememberBoxMeasurePolicy22222, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2900setimpl(m2893constructorimpl32222, density32222, ComposeUiNode.Companion.getSetDensity());
            Updater.m2900setimpl(m2893constructorimpl32222, layoutDirection32222, ComposeUiNode.Companion.getSetLayoutDirection());
            Updater.m2900setimpl(m2893constructorimpl32222, viewConfiguration32222, ComposeUiNode.Companion.getSetViewConfiguration());
            composer2.enableReusing();
            materializerOf32222.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(composer2)), composer2, 0);
            composer2.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(composer2, -1253629305, "C72@3384L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance22222 = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer2, 1631550877, "C767@32246L25:Slider.kt#uh7d8r");
            function32.invoke(sliderPositions2222, composer2, Integer.valueOf(((i13 << 3) & 112) | 6));
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            Modifier layoutId32222 = LayoutIdKt.layoutId(Modifier.Companion, RangeSliderComponents.TRACK);
            composer2.startReplaceableGroup(733328855);
            ComposerKt.sourceInformation(composer2, "CC(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
            MeasurePolicy rememberBoxMeasurePolicy32222 = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, composer2, 0);
            composer2.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(composer2, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume112222 = composer2.consume(CompositionLocalsKt.getLocalDensity());
            ComposerKt.sourceInformationMarkerEnd(composer2);
            Density density42222 = (Density) consume112222;
            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume122222 = composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ComposerKt.sourceInformationMarkerEnd(composer2);
            LayoutDirection layoutDirection42222 = (LayoutDirection) consume122222;
            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume132222 = composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ViewConfiguration viewConfiguration42222 = (ViewConfiguration) consume132222;
            Function0<ComposeUiNode> constructor42222 = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf42222 = LayoutKt.materializerOf(layoutId32222);
            if (!(composer2.getApplier() instanceof Applier)) {
            }
            composer2.startReusableNode();
            if (!composer2.getInserting()) {
            }
            composer2.disableReusing();
            Composer m2893constructorimpl42222 = Updater.m2893constructorimpl(composer2);
            Updater.m2900setimpl(m2893constructorimpl42222, rememberBoxMeasurePolicy32222, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2900setimpl(m2893constructorimpl42222, density42222, ComposeUiNode.Companion.getSetDensity());
            Updater.m2900setimpl(m2893constructorimpl42222, layoutDirection42222, ComposeUiNode.Companion.getSetLayoutDirection());
            Updater.m2900setimpl(m2893constructorimpl42222, viewConfiguration42222, ComposeUiNode.Companion.getSetViewConfiguration());
            composer2.enableReusing();
            materializerOf42222.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(composer2)), composer2, 0);
            composer2.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(composer2, -1253629305, "C72@3384L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance32222 = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer2, 1631550998, "C769@32367L22:Slider.kt#uh7d8r");
            function33.invoke(sliderPositions2222, composer2, Integer.valueOf((i13 & 112) | 6));
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
            }
            i16 = i172222;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i6 = i4 & 32;
        if (i6 == 0) {
        }
        if ((i4 & 64) == 0) {
        }
        i5 |= i7;
        if ((i4 & 128) != 0) {
        }
        i5 |= i8;
        if ((i4 & 256) == 0) {
        }
        i5 |= i9;
        if ((i4 & 512) == 0) {
        }
        i5 |= i10;
        i11 = i5;
        if ((i4 & 1024) == 0) {
        }
        if ((i4 & 2048) == 0) {
        }
        i13 = i12;
        if ((1533916891 & i11) == 306783378) {
        }
        if (i6 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        startRestartGroup.startReplaceableGroup(511388516);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
        changed = startRestartGroup.changed(closedFloatingPointRange) | startRestartGroup.changed(function1);
        SliderKt$RangeSliderImpl$onValueChangeState$1$1 rememberedValue1422222 = startRestartGroup.rememberedValue();
        if (changed) {
        }
        rememberedValue1422222 = new SliderKt$RangeSliderImpl$onValueChangeState$1$1(closedFloatingPointRange, function1);
        startRestartGroup.updateRememberedValue(rememberedValue1422222);
        startRestartGroup.endReplaceableGroup();
        State rememberUpdatedState22222 = SnapshotStateKt.rememberUpdatedState(rememberedValue1422222, startRestartGroup, 0);
        Integer valueOf42222 = Integer.valueOf(i14);
        startRestartGroup.startReplaceableGroup(1157296644);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
        changed2 = startRestartGroup.changed(valueOf42222);
        rememberedValue = startRestartGroup.rememberedValue();
        if (!changed2) {
        }
        rememberedValue = stepsToTickFractions(i14);
        startRestartGroup.updateRememberedValue(rememberedValue);
        startRestartGroup.endReplaceableGroup();
        float[] fArr222222 = (float[]) rememberedValue;
        startRestartGroup.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
        int i1722222 = i14;
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (rememberedValue2 == Composer.Companion.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        final MutableState<Float> mutableState62222 = (MutableState) rememberedValue2;
        startRestartGroup.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (rememberedValue3 == Composer.Companion.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        final MutableState<Float> mutableState222222 = (MutableState) rememberedValue3;
        startRestartGroup.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
        rememberedValue4 = startRestartGroup.rememberedValue();
        if (rememberedValue4 == Composer.Companion.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        final MutableState<Integer> mutableState322222 = (MutableState) rememberedValue4;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume142222 = startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        if (consume142222 != LayoutDirection.Rtl) {
        }
        final Ref.ObjectRef<MutableState<Boolean>> objectRef22222 = new Ref.ObjectRef();
        startRestartGroup.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
        rememberedValue5 = startRestartGroup.rememberedValue();
        if (rememberedValue5 != Composer.Companion.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        objectRef22222.element = r0;
        startRestartGroup.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
        rememberedValue6 = startRestartGroup.rememberedValue();
        if (rememberedValue6 == Composer.Companion.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        final MutableState<Float> mutableState422222 = (MutableState) rememberedValue6;
        startRestartGroup.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
        rememberedValue7 = startRestartGroup.rememberedValue();
        if (rememberedValue7 != Composer.Companion.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        final MutableState<Float> mutableState522222 = (MutableState) rememberedValue7;
        startRestartGroup.startReplaceableGroup(1157296644);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
        changed3 = startRestartGroup.changed(function0);
        rememberedValue8 = startRestartGroup.rememberedValue();
        if (!changed3) {
        }
        rememberedValue8 = new SliderKt$RangeSliderImpl$gestureEndAction$1$1(function0);
        startRestartGroup.updateRememberedValue(rememberedValue8);
        startRestartGroup.endReplaceableGroup();
        String str322222 = str;
        composer2 = startRestartGroup;
        Modifier rangeSliderPressDragModifier22222 = rangeSliderPressDragModifier(Modifier.Companion, mutableInteractionSource, mutableInteractionSource2, mutableState422222, mutableState522222, z, z2, RangeSliderImpl$lambda$31(mutableState322222), closedFloatingPointRange2, SnapshotStateKt.rememberUpdatedState(rememberedValue8, startRestartGroup, 0), SnapshotStateKt.rememberUpdatedState(new SliderKt$RangeSliderImpl$onDrag$1(mutableState422222, mutableState522222, closedFloatingPointRange, fArr222222, rememberUpdatedState22222, mutableState322222, mutableState222222, mutableState62222, closedFloatingPointRange2), composer2, 0));
        float coerceIn32222 = RangesKt.coerceIn(closedFloatingPointRange.getStart().floatValue(), closedFloatingPointRange2.getStart().floatValue(), closedFloatingPointRange.getEndInclusive().floatValue());
        float coerceIn222222 = RangesKt.coerceIn(closedFloatingPointRange.getEndInclusive().floatValue(), closedFloatingPointRange.getStart().floatValue(), closedFloatingPointRange2.getEndInclusive().floatValue());
        final float calcFraction32222 = calcFraction(closedFloatingPointRange2.getStart().floatValue(), closedFloatingPointRange2.getEndInclusive().floatValue(), coerceIn32222);
        final float calcFraction222222 = calcFraction(closedFloatingPointRange2.getStart().floatValue(), closedFloatingPointRange2.getEndInclusive().floatValue(), coerceIn222222);
        composer2.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(composer2, str2);
        rememberedValue9 = composer2.rememberedValue();
        if (rememberedValue9 != Composer.Companion.getEmpty()) {
        }
        composer2.endReplaceableGroup();
        SliderPositions sliderPositions22222 = (SliderPositions) rememberedValue9;
        sliderPositions22222.setActiveRange$material3_release(RangesKt.rangeTo(calcFraction32222, calcFraction222222));
        sliderPositions22222.setTickFractions$material3_release(fArr);
        float f22222 = i1722222;
        int floor32222 = (int) Math.floor(f22222 * calcFraction222222);
        int floor222222 = (int) Math.floor(f22222 * (1.0f - calcFraction32222));
        Modifier.Companion companion32222 = Modifier.Companion;
        Float valueOf222222 = Float.valueOf(coerceIn222222);
        composer2.startReplaceableGroup(511388516);
        ComposerKt.sourceInformation(composer2, "CC(remember)P(1,2):Composables.kt#9igjgp");
        changed4 = composer2.changed(rememberUpdatedState22222) | composer2.changed(valueOf222222);
        rememberedValue10 = composer2.rememberedValue();
        if (!changed4) {
        }
        rememberedValue10 = new SliderKt$RangeSliderImpl$startThumbSemantics$1$1(rememberUpdatedState22222, coerceIn222222);
        composer2.updateRememberedValue(rememberedValue10);
        composer2.endReplaceableGroup();
        Modifier sliderSemantics32222 = sliderSemantics(companion32222, coerceIn32222, z, (Function1) rememberedValue10, function0, RangesKt.rangeTo(closedFloatingPointRange2.getStart().floatValue(), coerceIn222222), floor32222);
        Modifier.Companion companion222222 = Modifier.Companion;
        Float valueOf322222 = Float.valueOf(coerceIn32222);
        composer2.startReplaceableGroup(511388516);
        ComposerKt.sourceInformation(composer2, "CC(remember)P(1,2):Composables.kt#9igjgp");
        changed5 = composer2.changed(valueOf322222) | composer2.changed(rememberUpdatedState22222);
        rememberedValue11 = composer2.rememberedValue();
        if (!changed5) {
        }
        rememberedValue11 = new SliderKt$RangeSliderImpl$endThumbSemantics$1$1(rememberUpdatedState22222, coerceIn32222);
        composer2.updateRememberedValue(rememberedValue11);
        composer2.endReplaceableGroup();
        Modifier sliderSemantics222222 = sliderSemantics(companion222222, coerceIn222222, z, rememberedValue11, function0, RangesKt.rangeTo(coerceIn32222, closedFloatingPointRange2.getEndInclusive().floatValue()), floor222222);
        String m2058getStringNWtq2832222 = Strings_androidKt.m2058getStringNWtq28(Strings.Companion.m2041getSliderRangeStartadMyvUU(), composer2, 6);
        String m2058getStringNWtq28222222 = Strings_androidKt.m2058getStringNWtq28(Strings.Companion.m2040getSliderRangeEndadMyvUU(), composer2, 6);
        Modifier then42222 = SizeKt.m791requiredSizeInqDBjuR0$default(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier), SliderTokens.INSTANCE.m2708getHandleWidthD9Ej5fM(), SliderTokens.INSTANCE.m2707getHandleHeightD9Ej5fM(), 0.0f, 0.0f, 12, null).then(rangeSliderPressDragModifier22222);
        MeasurePolicy measurePolicy22222 = new MeasurePolicy() { // from class: androidx.compose.material3.SliderKt$RangeSliderImpl$2
            @Override // androidx.compose.ui.layout.MeasurePolicy
            public /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i18) {
                return MeasurePolicy.CC.$default$maxIntrinsicHeight(this, intrinsicMeasureScope, list, i18);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i18) {
                return MeasurePolicy.CC.$default$maxIntrinsicWidth(this, intrinsicMeasureScope, list, i18);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i18) {
                return MeasurePolicy.CC.$default$minIntrinsicHeight(this, intrinsicMeasureScope, list, i18);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i18) {
                return MeasurePolicy.CC.$default$minIntrinsicWidth(this, intrinsicMeasureScope, list, i18);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            /* renamed from: measure-3p2s80s */
            public final MeasureResult mo272measure3p2s80s(MeasureScope Layout, List<? extends Measurable> measurables, long j) {
                boolean z3;
                boolean z4;
                boolean z5;
                float RangeSliderImpl$lambda$25;
                float RangeSliderImpl$lambda$28;
                int RangeSliderImpl$lambda$31;
                float RangeSliderImpl$lambda$282;
                float RangeSliderImpl$lambda$252;
                float RangeSliderImpl$scaleToOffset$34;
                float RangeSliderImpl$scaleToOffset$342;
                Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                List<? extends Measurable> list = measurables;
                for (Measurable measurable : list) {
                    if (LayoutIdKt.getLayoutId(measurable) == RangeSliderComponents.STARTTHUMB) {
                        z3 = true;
                        continue;
                    } else {
                        z3 = false;
                        continue;
                    }
                    if (z3) {
                        Placeable mo4545measureBRTryo0 = measurable.mo4545measureBRTryo0(j);
                        for (Measurable measurable2 : list) {
                            if (LayoutIdKt.getLayoutId(measurable2) == RangeSliderComponents.ENDTHUMB) {
                                z4 = true;
                                continue;
                            } else {
                                z4 = false;
                                continue;
                            }
                            if (z4) {
                                Placeable mo4545measureBRTryo02 = measurable2.mo4545measureBRTryo0(j);
                                for (Measurable measurable3 : list) {
                                    if (LayoutIdKt.getLayoutId(measurable3) == RangeSliderComponents.TRACK) {
                                        z5 = true;
                                        continue;
                                    } else {
                                        z5 = false;
                                        continue;
                                    }
                                    if (z5) {
                                        Placeable mo4545measureBRTryo03 = measurable3.mo4545measureBRTryo0(Constraints.m5542copyZbe2FdA$default(ConstraintsKt.m5568offsetNN6EwU$default(j, (-(mo4545measureBRTryo0.getWidth() + mo4545measureBRTryo02.getWidth())) / 2, 0, 2, null), 0, 0, 0, 0, 11, null));
                                        int width = mo4545measureBRTryo03.getWidth() + ((mo4545measureBRTryo0.getWidth() + mo4545measureBRTryo02.getWidth()) / 2);
                                        int max = Math.max(mo4545measureBRTryo03.getHeight(), Math.max(mo4545measureBRTryo0.getHeight(), mo4545measureBRTryo02.getHeight()));
                                        SliderKt.RangeSliderImpl$lambda$26(mutableState62222, mo4545measureBRTryo0.getWidth());
                                        SliderKt.RangeSliderImpl$lambda$29(mutableState222222, mo4545measureBRTryo02.getWidth());
                                        SliderKt.RangeSliderImpl$lambda$32(mutableState322222, width);
                                        if (!objectRef22222.element.getValue().booleanValue()) {
                                            RangeSliderImpl$lambda$31 = SliderKt.RangeSliderImpl$lambda$31(mutableState322222);
                                            RangeSliderImpl$lambda$282 = SliderKt.RangeSliderImpl$lambda$28(mutableState222222);
                                            float f222222 = 2;
                                            float max2 = Math.max(RangeSliderImpl$lambda$31 - (RangeSliderImpl$lambda$282 / f222222), 0.0f);
                                            RangeSliderImpl$lambda$252 = SliderKt.RangeSliderImpl$lambda$25(mutableState62222);
                                            float min = Math.min(RangeSliderImpl$lambda$252 / f222222, max2);
                                            MutableState<Float> mutableState622222 = mutableState422222;
                                            RangeSliderImpl$scaleToOffset$34 = SliderKt.RangeSliderImpl$scaleToOffset$34(closedFloatingPointRange2, min, max2, closedFloatingPointRange.getStart().floatValue());
                                            mutableState622222.setValue(Float.valueOf(RangeSliderImpl$scaleToOffset$34));
                                            MutableState<Float> mutableState7 = mutableState522222;
                                            RangeSliderImpl$scaleToOffset$342 = SliderKt.RangeSliderImpl$scaleToOffset$34(closedFloatingPointRange2, min, max2, closedFloatingPointRange.getEndInclusive().floatValue());
                                            mutableState7.setValue(Float.valueOf(RangeSliderImpl$scaleToOffset$342));
                                            objectRef22222.element.setValue(true);
                                        }
                                        int width2 = mo4545measureBRTryo0.getWidth() / 2;
                                        int roundToInt = MathKt.roundToInt(mo4545measureBRTryo03.getWidth() * calcFraction32222);
                                        RangeSliderImpl$lambda$25 = SliderKt.RangeSliderImpl$lambda$25(mutableState62222);
                                        RangeSliderImpl$lambda$28 = SliderKt.RangeSliderImpl$lambda$28(mutableState222222);
                                        return MeasureScope.CC.layout$default(Layout, width, max, null, new SliderKt$RangeSliderImpl$2$measure$1(mo4545measureBRTryo03, width2, (max - mo4545measureBRTryo03.getHeight()) / 2, mo4545measureBRTryo0, roundToInt, (max - mo4545measureBRTryo0.getHeight()) / 2, mo4545measureBRTryo02, MathKt.roundToInt((mo4545measureBRTryo03.getWidth() * calcFraction222222) + ((RangeSliderImpl$lambda$25 - RangeSliderImpl$lambda$28) / 2)), (max - mo4545measureBRTryo02.getHeight()) / 2), 4, null);
                                    }
                                }
                                throw new NoSuchElementException("Collection contains no element matching the predicate.");
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        };
        composer2.startReplaceableGroup(-1323940314);
        ComposerKt.sourceInformation(composer2, "CC(Layout)P(!1,2)73@2855L7,74@2910L7,75@2969L7,76@2981L460:Layout.kt#80mrfh");
        ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, str322222);
        Object consume222222 = composer2.consume(CompositionLocalsKt.getLocalDensity());
        ComposerKt.sourceInformationMarkerEnd(composer2);
        Density density52222 = (Density) consume222222;
        ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, str322222);
        Object consume322222 = composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ComposerKt.sourceInformationMarkerEnd(composer2);
        LayoutDirection layoutDirection52222 = (LayoutDirection) consume322222;
        ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, str322222);
        Object consume422222 = composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ViewConfiguration viewConfiguration52222 = (ViewConfiguration) consume422222;
        Function0<ComposeUiNode> constructor52222 = ComposeUiNode.Companion.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf52222 = LayoutKt.materializerOf(then42222);
        if (!(composer2.getApplier() instanceof Applier)) {
        }
        composer2.startReusableNode();
        if (!composer2.getInserting()) {
        }
        Composer m2893constructorimpl52222 = Updater.m2893constructorimpl(composer2);
        Updater.m2900setimpl(m2893constructorimpl52222, measurePolicy22222, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m2900setimpl(m2893constructorimpl52222, density52222, ComposeUiNode.Companion.getSetDensity());
        Updater.m2900setimpl(m2893constructorimpl52222, layoutDirection52222, ComposeUiNode.Companion.getSetLayoutDirection());
        Updater.m2900setimpl(m2893constructorimpl52222, viewConfiguration52222, ComposeUiNode.Companion.getSetViewConfiguration());
        materializerOf52222.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(composer2)), composer2, 0);
        composer2.startReplaceableGroup(2058660585);
        ComposerKt.sourceInformationMarkerStart(composer2, -2040262222, "C754@31668L84,752@31532L369,762@32048L82,760@31914L359,768@32286L117:Slider.kt#uh7d8r");
        Modifier layoutId42222 = LayoutIdKt.layoutId(Modifier.Companion, RangeSliderComponents.STARTTHUMB);
        composer2.startReplaceableGroup(1157296644);
        ComposerKt.sourceInformation(composer2, "CC(remember)P(1):Composables.kt#9igjgp");
        changed6 = composer2.changed(m2058getStringNWtq2832222);
        rememberedValue12 = composer2.rememberedValue();
        if (!changed6) {
        }
        rememberedValue12 = new SliderKt$RangeSliderImpl$1$1$1(m2058getStringNWtq2832222);
        composer2.updateRememberedValue(rememberedValue12);
        composer2.endReplaceableGroup();
        Modifier then222222 = FocusableKt.focusable(SemanticsModifierKt.semantics(layoutId42222, true, (Function1) rememberedValue12), z, mutableInteractionSource).then(sliderSemantics32222);
        composer2.startReplaceableGroup(733328855);
        ComposerKt.sourceInformation(composer2, "CC(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
        MeasurePolicy rememberBoxMeasurePolicy42222 = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, composer2, 0);
        composer2.startReplaceableGroup(-1323940314);
        ComposerKt.sourceInformation(composer2, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
        ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
        Object consume522222 = composer2.consume(CompositionLocalsKt.getLocalDensity());
        ComposerKt.sourceInformationMarkerEnd(composer2);
        Density density222222 = (Density) consume522222;
        ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
        Object consume622222 = composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ComposerKt.sourceInformationMarkerEnd(composer2);
        LayoutDirection layoutDirection222222 = (LayoutDirection) consume622222;
        ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
        Object consume722222 = composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ViewConfiguration viewConfiguration222222 = (ViewConfiguration) consume722222;
        Function0<ComposeUiNode> constructor222222 = ComposeUiNode.Companion.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf222222 = LayoutKt.materializerOf(then222222);
        if (!(composer2.getApplier() instanceof Applier)) {
        }
        composer2.startReusableNode();
        if (!composer2.getInserting()) {
        }
        composer2.disableReusing();
        Composer m2893constructorimpl222222 = Updater.m2893constructorimpl(composer2);
        Updater.m2900setimpl(m2893constructorimpl222222, rememberBoxMeasurePolicy42222, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m2900setimpl(m2893constructorimpl222222, density222222, ComposeUiNode.Companion.getSetDensity());
        Updater.m2900setimpl(m2893constructorimpl222222, layoutDirection222222, ComposeUiNode.Companion.getSetLayoutDirection());
        Updater.m2900setimpl(m2893constructorimpl222222, viewConfiguration222222, ComposeUiNode.Companion.getSetViewConfiguration());
        composer2.enableReusing();
        materializerOf222222.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(composer2)), composer2, 0);
        composer2.startReplaceableGroup(2058660585);
        ComposerKt.sourceInformationMarkerStart(composer2, -1253629305, "C72@3384L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance42222 = BoxScopeInstance.INSTANCE;
        ComposerKt.sourceInformationMarkerStart(composer2, 1631550503, "C759@31872L27:Slider.kt#uh7d8r");
        function3.invoke(sliderPositions22222, composer2, Integer.valueOf(((i15 >> 24) & 112) | 6));
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endReplaceableGroup();
        composer2.endNode();
        composer2.endReplaceableGroup();
        composer2.endReplaceableGroup();
        Modifier layoutId222222 = LayoutIdKt.layoutId(Modifier.Companion, RangeSliderComponents.ENDTHUMB);
        composer2.startReplaceableGroup(1157296644);
        ComposerKt.sourceInformation(composer2, "CC(remember)P(1):Composables.kt#9igjgp");
        changed7 = composer2.changed(m2058getStringNWtq28222222);
        rememberedValue13 = composer2.rememberedValue();
        if (!changed7) {
        }
        rememberedValue13 = new SliderKt$RangeSliderImpl$1$3$1(m2058getStringNWtq28222222);
        composer2.updateRememberedValue(rememberedValue13);
        composer2.endReplaceableGroup();
        Modifier then322222 = FocusableKt.focusable(SemanticsModifierKt.semantics(layoutId222222, true, (Function1) rememberedValue13), z, mutableInteractionSource2).then(sliderSemantics222222);
        composer2.startReplaceableGroup(733328855);
        ComposerKt.sourceInformation(composer2, "CC(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
        MeasurePolicy rememberBoxMeasurePolicy222222 = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, composer2, 0);
        composer2.startReplaceableGroup(-1323940314);
        ComposerKt.sourceInformation(composer2, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
        ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
        Object consume822222 = composer2.consume(CompositionLocalsKt.getLocalDensity());
        ComposerKt.sourceInformationMarkerEnd(composer2);
        Density density322222 = (Density) consume822222;
        ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
        Object consume922222 = composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ComposerKt.sourceInformationMarkerEnd(composer2);
        LayoutDirection layoutDirection322222 = (LayoutDirection) consume922222;
        ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
        Object consume1022222 = composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ViewConfiguration viewConfiguration322222 = (ViewConfiguration) consume1022222;
        Function0<ComposeUiNode> constructor322222 = ComposeUiNode.Companion.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf322222 = LayoutKt.materializerOf(then322222);
        if (!(composer2.getApplier() instanceof Applier)) {
        }
        composer2.startReusableNode();
        if (!composer2.getInserting()) {
        }
        composer2.disableReusing();
        Composer m2893constructorimpl322222 = Updater.m2893constructorimpl(composer2);
        Updater.m2900setimpl(m2893constructorimpl322222, rememberBoxMeasurePolicy222222, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m2900setimpl(m2893constructorimpl322222, density322222, ComposeUiNode.Companion.getSetDensity());
        Updater.m2900setimpl(m2893constructorimpl322222, layoutDirection322222, ComposeUiNode.Companion.getSetLayoutDirection());
        Updater.m2900setimpl(m2893constructorimpl322222, viewConfiguration322222, ComposeUiNode.Companion.getSetViewConfiguration());
        composer2.enableReusing();
        materializerOf322222.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(composer2)), composer2, 0);
        composer2.startReplaceableGroup(2058660585);
        ComposerKt.sourceInformationMarkerStart(composer2, -1253629305, "C72@3384L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance222222 = BoxScopeInstance.INSTANCE;
        ComposerKt.sourceInformationMarkerStart(composer2, 1631550877, "C767@32246L25:Slider.kt#uh7d8r");
        function32.invoke(sliderPositions22222, composer2, Integer.valueOf(((i13 << 3) & 112) | 6));
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endReplaceableGroup();
        composer2.endNode();
        composer2.endReplaceableGroup();
        composer2.endReplaceableGroup();
        Modifier layoutId322222 = LayoutIdKt.layoutId(Modifier.Companion, RangeSliderComponents.TRACK);
        composer2.startReplaceableGroup(733328855);
        ComposerKt.sourceInformation(composer2, "CC(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
        MeasurePolicy rememberBoxMeasurePolicy322222 = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, composer2, 0);
        composer2.startReplaceableGroup(-1323940314);
        ComposerKt.sourceInformation(composer2, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
        ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
        Object consume1122222 = composer2.consume(CompositionLocalsKt.getLocalDensity());
        ComposerKt.sourceInformationMarkerEnd(composer2);
        Density density422222 = (Density) consume1122222;
        ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
        Object consume1222222 = composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ComposerKt.sourceInformationMarkerEnd(composer2);
        LayoutDirection layoutDirection422222 = (LayoutDirection) consume1222222;
        ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
        Object consume1322222 = composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ViewConfiguration viewConfiguration422222 = (ViewConfiguration) consume1322222;
        Function0<ComposeUiNode> constructor422222 = ComposeUiNode.Companion.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf422222 = LayoutKt.materializerOf(layoutId322222);
        if (!(composer2.getApplier() instanceof Applier)) {
        }
        composer2.startReusableNode();
        if (!composer2.getInserting()) {
        }
        composer2.disableReusing();
        Composer m2893constructorimpl422222 = Updater.m2893constructorimpl(composer2);
        Updater.m2900setimpl(m2893constructorimpl422222, rememberBoxMeasurePolicy322222, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m2900setimpl(m2893constructorimpl422222, density422222, ComposeUiNode.Companion.getSetDensity());
        Updater.m2900setimpl(m2893constructorimpl422222, layoutDirection422222, ComposeUiNode.Companion.getSetLayoutDirection());
        Updater.m2900setimpl(m2893constructorimpl422222, viewConfiguration422222, ComposeUiNode.Companion.getSetViewConfiguration());
        composer2.enableReusing();
        materializerOf422222.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(composer2)), composer2, 0);
        composer2.startReplaceableGroup(2058660585);
        ComposerKt.sourceInformationMarkerStart(composer2, -1253629305, "C72@3384L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance322222 = BoxScopeInstance.INSTANCE;
        ComposerKt.sourceInformationMarkerStart(composer2, 1631550998, "C769@32367L22:Slider.kt#uh7d8r");
        function33.invoke(sliderPositions22222, composer2, Integer.valueOf((i13 & 112) | 6));
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endReplaceableGroup();
        composer2.endNode();
        composer2.endReplaceableGroup();
        composer2.endReplaceableGroup();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endReplaceableGroup();
        composer2.endNode();
        composer2.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
        }
        i16 = i1722222;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float RangeSliderImpl$lambda$25(MutableState<Float> mutableState) {
        return mutableState.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RangeSliderImpl$lambda$26(MutableState<Float> mutableState, float f) {
        mutableState.setValue(Float.valueOf(f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float RangeSliderImpl$lambda$28(MutableState<Float> mutableState) {
        return mutableState.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RangeSliderImpl$lambda$29(MutableState<Float> mutableState, float f) {
        mutableState.setValue(Float.valueOf(f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int RangeSliderImpl$lambda$31(MutableState<Integer> mutableState) {
        return mutableState.getValue().intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RangeSliderImpl$lambda$32(MutableState<Integer> mutableState, int i) {
        mutableState.setValue(Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ClosedFloatingPointRange<Float> RangeSliderImpl$scaleToUserValue$33(ClosedFloatingPointRange<Float> closedFloatingPointRange, float f, float f2, ClosedFloatingPointRange<Float> closedFloatingPointRange2) {
        return scale(f, f2, closedFloatingPointRange2, closedFloatingPointRange.getStart().floatValue(), closedFloatingPointRange.getEndInclusive().floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float RangeSliderImpl$scaleToOffset$34(ClosedFloatingPointRange<Float> closedFloatingPointRange, float f, float f2, float f3) {
        return scale(closedFloatingPointRange.getStart().floatValue(), closedFloatingPointRange.getEndInclusive().floatValue(), f3, f, f2);
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
    public static final Object m1977awaitSlop8vUncbI(AwaitPointerEventScope awaitPointerEventScope, long j, int i, Continuation<? super Pair<PointerInputChange, Float>> continuation) {
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
                    Object m1770awaitHorizontalPointerSlopOrCancellationgDDlDlE = DragGestureDetectorCopyKt.m1770awaitHorizontalPointerSlopOrCancellationgDDlDlE(awaitPointerEventScope, j, i, new SliderKt$awaitSlop$postPointerSlop$1(floatRef2), sliderKt$awaitSlop$12);
                    if (m1770awaitHorizontalPointerSlopOrCancellationgDDlDlE == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    obj = m1770awaitHorizontalPointerSlopOrCancellationgDDlDlE;
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
    public static final float[] stepsToTickFractions(int i) {
        if (i == 0) {
            return new float[0];
        }
        int i2 = i + 2;
        float[] fArr = new float[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            fArr[i3] = i3 / (i + 1);
        }
        return fArr;
    }

    private static final float scale(float f, float f2, float f3, float f4, float f5) {
        return MathHelpersKt.lerp(f4, f5, calcFraction(f, f2, f3));
    }

    private static final ClosedFloatingPointRange<Float> scale(float f, float f2, ClosedFloatingPointRange<Float> closedFloatingPointRange, float f3, float f4) {
        return RangesKt.rangeTo(scale(f, f2, closedFloatingPointRange.getStart().floatValue(), f3, f4), scale(f, f2, closedFloatingPointRange.getEndInclusive().floatValue(), f3, f4));
    }

    private static final float calcFraction(float f, float f2, float f3) {
        float f4 = f2 - f;
        return RangesKt.coerceIn((f4 > 0.0f ? 1 : (f4 == 0.0f ? 0 : -1)) == 0 ? 0.0f : (f3 - f) / f4, 0.0f, 1.0f);
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

    private static final Modifier sliderSemantics(Modifier modifier, float f, boolean z, Function1<? super Float, Unit> function1, Function0<Unit> function0, ClosedFloatingPointRange<Float> closedFloatingPointRange, int i) {
        return ProgressSemanticsKt.progressSemantics(SemanticsModifierKt.semantics$default(modifier, false, new SliderKt$sliderSemantics$1(z, closedFloatingPointRange, i, RangesKt.coerceIn(f, closedFloatingPointRange.getStart().floatValue(), closedFloatingPointRange.getEndInclusive().floatValue()), function1, function0), 1, null), f, closedFloatingPointRange, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object animateToTarget(DraggableState draggableState, float f, float f2, float f3, Continuation<? super Unit> continuation) {
        Object drag$default = DraggableState.CC.drag$default(draggableState, null, new SliderKt$animateToTarget$2(f, f2, f3, null), continuation, 1, null);
        return drag$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? drag$default : Unit.INSTANCE;
    }

    private static final Modifier rangeSliderPressDragModifier(Modifier modifier, MutableInteractionSource mutableInteractionSource, MutableInteractionSource mutableInteractionSource2, State<Float> state, State<Float> state2, boolean z, boolean z2, int i, ClosedFloatingPointRange<Float> closedFloatingPointRange, State<? extends Function1<? super Boolean, Unit>> state3, State<? extends Function2<? super Boolean, ? super Float, Unit>> state4) {
        return z ? SuspendingPointerInputFilterKt.pointerInput(modifier, new Object[]{mutableInteractionSource, mutableInteractionSource2, Integer.valueOf(i), Boolean.valueOf(z2), closedFloatingPointRange}, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) new SliderKt$rangeSliderPressDragModifier$1(mutableInteractionSource, mutableInteractionSource2, state, state2, state4, z2, i, state3, null)) : modifier;
    }

    static {
        float m2708getHandleWidthD9Ej5fM = SliderTokens.INSTANCE.m2708getHandleWidthD9Ej5fM();
        ThumbWidth = m2708getHandleWidthD9Ej5fM;
        float m2707getHandleHeightD9Ej5fM = SliderTokens.INSTANCE.m2707getHandleHeightD9Ej5fM();
        ThumbHeight = m2707getHandleHeightD9Ej5fM;
        ThumbSize = DpKt.m5629DpSizeYgX7TsA(m2708getHandleWidthD9Ej5fM, m2707getHandleHeightD9Ej5fM);
        ThumbDefaultElevation = Dp.m5607constructorimpl(1);
        ThumbPressedElevation = Dp.m5607constructorimpl(6);
        TickSize = SliderTokens.INSTANCE.m2714getTickMarksContainerSizeD9Ej5fM();
        TrackHeight = SliderTokens.INSTANCE.m2709getInactiveTrackHeightD9Ej5fM();
        float m5607constructorimpl = Dp.m5607constructorimpl(48);
        SliderHeight = m5607constructorimpl;
        float m5607constructorimpl2 = Dp.m5607constructorimpl(144);
        SliderMinWidth = m5607constructorimpl2;
        DefaultSliderConstraints = SizeKt.m783heightInVpY3zN4$default(SizeKt.m802widthInVpY3zN4$default(Modifier.Companion, m5607constructorimpl2, 0.0f, 2, null), 0.0f, m5607constructorimpl, 1, null);
        SliderToTickAnimation = new TweenSpec<>(100, 0, null, 6, null);
    }

    public static final float getThumbWidth() {
        return ThumbWidth;
    }

    public static final float getTrackHeight() {
        return TrackHeight;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator] */
    public static final float snapValueToTick(float f, float[] fArr, float f2, float f3) {
        Float valueOf;
        if (fArr.length == 0) {
            valueOf = null;
        } else {
            float f4 = fArr[0];
            int lastIndex = ArraysKt.getLastIndex(fArr);
            if (lastIndex != 0) {
                float abs = Math.abs(MathHelpersKt.lerp(f2, f3, f4) - f);
                ?? it = new IntRange(1, lastIndex).iterator();
                while (it.hasNext()) {
                    float f5 = fArr[it.nextInt()];
                    float abs2 = Math.abs(MathHelpersKt.lerp(f2, f3, f5) - f);
                    if (Float.compare(abs, abs2) > 0) {
                        f4 = f5;
                        abs = abs2;
                    }
                }
                valueOf = Float.valueOf(f4);
            } else {
                valueOf = Float.valueOf(f4);
            }
        }
        return valueOf != null ? MathHelpersKt.lerp(f2, f3, valueOf.floatValue()) : f;
    }

    private static final Modifier sliderTapModifier(Modifier modifier, DraggableState draggableState, MutableInteractionSource mutableInteractionSource, int i, boolean z, State<Float> state, State<? extends Function0<Unit>> state2, MutableState<Float> mutableState, boolean z2) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new SliderKt$sliderTapModifier$$inlined$debugInspectorInfo$1(draggableState, mutableInteractionSource, i, z, state, state2, mutableState, z2) : InspectableValueKt.getNoInspectorInfo(), new SliderKt$sliderTapModifier$2(z2, draggableState, mutableInteractionSource, i, z, mutableState, state, state2));
    }
}
