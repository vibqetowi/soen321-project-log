package androidx.compose.material3;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.material3.tokens.BottomAppBarTokens;
import androidx.compose.material3.tokens.TopAppBarLargeTokens;
import androidx.compose.material3.tokens.TopAppBarMediumTokens;
import androidx.compose.material3.tokens.TopAppBarSmallTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.AlignmentLineKt;
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
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.Velocity;
import androidx.compose.ui.unit.VelocityKt;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ifriend.keychain.cipherStorage.CipherStorageKeystoreRsaEcb;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.ResultKt;
import kotlin.Unit;
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
import kotlin.ranges.RangesKt;
/* compiled from: AppBar.kt */
@Metadata(d1 = {"\u0000¢\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0086\u0001\u0010\u0010\u001a\u00020\u00112\u001c\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00182\u0015\b\u0002\u0010\u0019\u001a\u000f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u001a¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001e\u001a\u00020\u00012\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b#\u0010$\u001ao\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001e\u001a\u00020\u00012\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"2\u001c\u0010%\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u0016H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b&\u0010'\u001a\u007f\u0010(\u001a\u00020\u00112\u0011\u0010)\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00182\u0013\b\u0002\u0010*\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\u001e\b\u0002\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u00162\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010+\u001a\u00020,2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010.H\u0007¢\u0006\u0002\u0010/\u001a\u007f\u00100\u001a\u00020\u00112\u0011\u0010)\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00182\u0013\b\u0002\u0010*\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\u001e\b\u0002\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u00162\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010+\u001a\u00020,2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010.H\u0007¢\u0006\u0002\u0010/\u001a\u007f\u00101\u001a\u00020\u00112\u0011\u0010)\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00182\u0013\b\u0002\u0010*\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\u001e\b\u0002\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u00162\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010+\u001a\u00020,2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010.H\u0007¢\u0006\u0002\u0010/\u001a\u0085\u0001\u00102\u001a\u00020\u00112\b\b\u0002\u0010\u0017\u001a\u00020\u00182\u0011\u0010)\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u0002062\u0011\u0010*\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\u001c\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u00162\u0006\u0010!\u001a\u00020\"2\u0006\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010.H\u0003¢\u0006\u0002\u00107\u001a\u007f\u00108\u001a\u00020\u00112\u0011\u0010)\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00182\u0013\b\u0002\u0010*\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\u001e\b\u0002\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u00162\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010+\u001a\u00020,2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010.H\u0007¢\u0006\u0002\u0010/\u001a\u007f\u00109\u001a\u00020\u00112\u0011\u0010)\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00182\u0013\b\u0002\u0010*\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\u001e\b\u0002\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u00162\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010+\u001a\u00020,2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010.H\u0007¢\u0006\u0002\u0010/\u001a¦\u0001\u0010:\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020\u001c2\u0006\u0010>\u001a\u00020\u001c2\u0006\u0010?\u001a\u00020\u001c2\u0011\u0010)\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\u0006\u00103\u001a\u0002042\u0006\u0010@\u001a\u00020<2\u0006\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u0002062\u0011\u0010*\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\u0011\u0010\u0012\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u0015H\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bH\u0010I\u001a¸\u0001\u0010J\u001a\u00020\u00112\b\b\u0002\u0010\u0017\u001a\u00020\u00182\u0011\u0010)\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\u0006\u00103\u001a\u0002042\u0006\u0010E\u001a\u00020\u00012\u0011\u0010K\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\u0006\u0010L\u001a\u0002042\u0011\u0010*\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\u001c\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u00162\u0006\u0010!\u001a\u00020\"2\u0006\u0010+\u001a\u00020,2\u0006\u0010M\u001a\u00020\u00012\u0006\u0010N\u001a\u00020\u00012\b\u0010-\u001a\u0004\u0018\u00010.H\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bO\u0010P\u001a+\u0010Q\u001a\u00020R2\b\b\u0002\u0010S\u001a\u00020<2\b\b\u0002\u0010T\u001a\u00020<2\b\b\u0002\u0010U\u001a\u00020<H\u0007¢\u0006\u0002\u0010V\u001aD\u0010W\u001a\u00020X2\u0006\u0010Y\u001a\u00020R2\u0006\u0010Z\u001a\u00020<2\u000e\u0010[\u001a\n\u0012\u0004\u0012\u00020<\u0018\u00010\\2\u000e\u0010]\u001a\n\u0012\u0004\u0012\u00020<\u0018\u00010^H\u0082@ø\u0001\u0000ø\u0001\u0000¢\u0006\u0002\u0010_\"\u0013\u0010\u0000\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0019\u0010\u0003\u001a\u00020\u0001X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0002\u001a\u0004\b\u0004\u0010\u0005\"\u0013\u0010\u0006\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0007\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\b\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\t\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\n\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u000b\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0014\u0010\f\u001a\u00020\rX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006`"}, d2 = {"BottomAppBarHorizontalPadding", "Landroidx/compose/ui/unit/Dp;", "F", "BottomAppBarVerticalPadding", "getBottomAppBarVerticalPadding", "()F", "FABHorizontalPadding", "FABVerticalPadding", "LargeTitleBottomPadding", "MediumTitleBottomPadding", "TopAppBarHorizontalPadding", "TopAppBarTitleInset", "TopTitleAlphaEasing", "Landroidx/compose/animation/core/CubicBezierEasing;", "getTopTitleAlphaEasing", "()Landroidx/compose/animation/core/CubicBezierEasing;", "BottomAppBar", "", "actions", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "modifier", "Landroidx/compose/ui/Modifier;", "floatingActionButton", "Lkotlin/Function0;", "containerColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "tonalElevation", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "windowInsets", "Landroidx/compose/foundation/layout/WindowInsets;", "BottomAppBar-Snr_uVM", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;JJFLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/runtime/Composer;II)V", FirebaseAnalytics.Param.CONTENT, "BottomAppBar-1oL4kX8", "(Landroidx/compose/ui/Modifier;JJFLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/layout/WindowInsets;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "CenterAlignedTopAppBar", "title", "navigationIcon", "colors", "Landroidx/compose/material3/TopAppBarColors;", "scrollBehavior", "Landroidx/compose/material3/TopAppBarScrollBehavior;", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/material3/TopAppBarColors;Landroidx/compose/material3/TopAppBarScrollBehavior;Landroidx/compose/runtime/Composer;II)V", "LargeTopAppBar", "MediumTopAppBar", "SingleRowTopAppBar", "titleTextStyle", "Landroidx/compose/ui/text/TextStyle;", "centeredTitle", "", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/material3/TopAppBarColors;Landroidx/compose/material3/TopAppBarScrollBehavior;Landroidx/compose/runtime/Composer;II)V", "SmallTopAppBar", "TopAppBar", "TopAppBarLayout", "heightPx", "", "navigationIconContentColor", "titleContentColor", "actionIconContentColor", "titleAlpha", "titleVerticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "titleHorizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "titleBottomPadding", "", "hideTitleSemantics", "TopAppBarLayout-kXwM9vE", "(Landroidx/compose/ui/Modifier;FJJJLkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;FLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;IZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "TwoRowsTopAppBar", "smallTitle", "smallTitleTextStyle", "maxHeight", "pinnedHeight", "TwoRowsTopAppBar-tjU4iQQ", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;FLkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/material3/TopAppBarColors;FFLandroidx/compose/material3/TopAppBarScrollBehavior;Landroidx/compose/runtime/Composer;III)V", "rememberTopAppBarState", "Landroidx/compose/material3/TopAppBarState;", "initialHeightOffsetLimit", "initialHeightOffset", "initialContentOffset", "(FFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/TopAppBarState;", "settleAppBar", "Landroidx/compose/ui/unit/Velocity;", "state", "velocity", "flingAnimationSpec", "Landroidx/compose/animation/core/DecayAnimationSpec;", "snapAnimationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "(Landroidx/compose/material3/TopAppBarState;FLandroidx/compose/animation/core/DecayAnimationSpec;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AppBarKt {
    private static final float BottomAppBarHorizontalPadding;
    private static final float BottomAppBarVerticalPadding;
    private static final float FABHorizontalPadding;
    private static final float FABVerticalPadding;
    private static final float LargeTitleBottomPadding;
    private static final float MediumTitleBottomPadding;
    private static final float TopAppBarHorizontalPadding;
    private static final float TopAppBarTitleInset;
    private static final CubicBezierEasing TopTitleAlphaEasing;

    /* JADX WARN: Removed duplicated region for block: B:101:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0131  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TopAppBar(Function2<? super Composer, ? super Integer, Unit> title, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, Composer composer, int i, int i2) {
        int i3;
        Object obj;
        int i4;
        Object obj2;
        int i5;
        Function3<RowScope, Composer, Integer, Unit> function32;
        Object obj3;
        Object obj4;
        int i6;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj9;
        Object obj10;
        Object obj11;
        Composer composer2;
        Modifier modifier2;
        Function2<? super Composer, ? super Integer, Unit> function22;
        Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function33;
        WindowInsets windowInsets2;
        TopAppBarColors topAppBarColors2;
        TopAppBarScrollBehavior topAppBarScrollBehavior2;
        ScopeUpdateScope endRestartGroup;
        int i7;
        int i8;
        Intrinsics.checkNotNullParameter(title, "title");
        Composer startRestartGroup = composer.startRestartGroup(1906353009);
        ComposerKt.sourceInformation(startRestartGroup, "C(TopAppBar)P(5,2,3!1,6)125@6259L12,126@6321L17,132@6511L10,129@6400L374:AppBar.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changedInstance(title) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            obj = modifier;
            i3 |= startRestartGroup.changed(obj) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                obj2 = function2;
                i3 |= startRestartGroup.changedInstance(obj2) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
                } else if ((i & 7168) == 0) {
                    function32 = function3;
                    i3 |= startRestartGroup.changedInstance(function32) ? 2048 : 1024;
                    if ((i & 57344) != 0) {
                        if ((i2 & 16) == 0) {
                            obj3 = windowInsets;
                            if (startRestartGroup.changed(obj3)) {
                                i8 = 16384;
                                i3 |= i8;
                            }
                        } else {
                            obj3 = windowInsets;
                        }
                        i8 = 8192;
                        i3 |= i8;
                    } else {
                        obj3 = windowInsets;
                    }
                    if ((i & 458752) != 0) {
                        if ((i2 & 32) == 0) {
                            obj4 = topAppBarColors;
                            if (startRestartGroup.changed(obj4)) {
                                i7 = 131072;
                                i3 |= i7;
                            }
                        } else {
                            obj4 = topAppBarColors;
                        }
                        i7 = 65536;
                        i3 |= i7;
                    } else {
                        obj4 = topAppBarColors;
                    }
                    i6 = i2 & 64;
                    if (i6 == 0) {
                        i3 |= 1572864;
                    } else if ((i & 3670016) == 0) {
                        obj5 = topAppBarScrollBehavior;
                        i3 |= startRestartGroup.changed(obj5) ? 1048576 : 524288;
                        if ((i3 & 2995931) == 599186 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                Modifier.Companion companion = i9 != 0 ? Modifier.Companion : obj;
                                Function2<Composer, Integer, Unit> m1693getLambda1$material3_release = i4 != 0 ? ComposableSingletons$AppBarKt.INSTANCE.m1693getLambda1$material3_release() : obj2;
                                if (i5 != 0) {
                                    function32 = ComposableSingletons$AppBarKt.INSTANCE.m1697getLambda2$material3_release();
                                }
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                    obj3 = TopAppBarDefaults.INSTANCE.getWindowInsets(startRestartGroup, 6);
                                }
                                if ((i2 & 32) != 0) {
                                    i3 &= -458753;
                                    obj4 = TopAppBarDefaults.INSTANCE.m2269topAppBarColorszjMxDiM(0L, 0L, 0L, 0L, 0L, startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                                }
                                if (i6 != 0) {
                                    obj7 = m1693getLambda1$material3_release;
                                    obj6 = null;
                                } else {
                                    obj6 = topAppBarScrollBehavior;
                                    obj7 = m1693getLambda1$material3_release;
                                }
                                obj8 = function32;
                                obj9 = obj3;
                                obj10 = obj4;
                                obj11 = companion;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                }
                                if ((i2 & 32) != 0) {
                                    i3 &= -458753;
                                }
                                obj8 = function32;
                                obj9 = obj3;
                                obj10 = obj4;
                                obj6 = obj5;
                                obj11 = obj;
                                obj7 = obj2;
                            }
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1906353009, i3, -1, "androidx.compose.material3.TopAppBar (AppBar.kt:120)");
                            }
                            int i10 = i3 << 6;
                            composer2 = startRestartGroup;
                            SingleRowTopAppBar(obj11, title, TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6), TopAppBarSmallTokens.INSTANCE.getHeadlineFont()), false, obj7, obj8, obj9, obj10, obj6, startRestartGroup, (57344 & i10) | ((i3 >> 3) & 14) | CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE | ((i3 << 3) & 112) | (458752 & i10) | (i10 & 3670016) | (29360128 & i10) | (i10 & 234881024), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier2 = obj11;
                            function22 = obj7;
                            function33 = obj8;
                            windowInsets2 = obj9;
                            topAppBarColors2 = obj10;
                            topAppBarScrollBehavior2 = obj6;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier2 = obj;
                            function22 = obj2;
                            function33 = function32;
                            windowInsets2 = obj3;
                            composer2 = startRestartGroup;
                            topAppBarColors2 = obj4;
                            topAppBarScrollBehavior2 = obj5;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                            return;
                        }
                        endRestartGroup.updateScope(new AppBarKt$TopAppBar$1(title, modifier2, function22, function33, windowInsets2, topAppBarColors2, topAppBarScrollBehavior2, i, i2));
                        return;
                    }
                    obj5 = topAppBarScrollBehavior;
                    if ((i3 & 2995931) == 599186) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i9 != 0) {
                    }
                    if (i4 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if ((i2 & 16) != 0) {
                    }
                    if ((i2 & 32) != 0) {
                    }
                    if (i6 != 0) {
                    }
                    obj8 = function32;
                    obj9 = obj3;
                    obj10 = obj4;
                    obj11 = companion;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    int i102 = i3 << 6;
                    composer2 = startRestartGroup;
                    SingleRowTopAppBar(obj11, title, TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6), TopAppBarSmallTokens.INSTANCE.getHeadlineFont()), false, obj7, obj8, obj9, obj10, obj6, startRestartGroup, (57344 & i102) | ((i3 >> 3) & 14) | CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE | ((i3 << 3) & 112) | (458752 & i102) | (i102 & 3670016) | (29360128 & i102) | (i102 & 234881024), 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier2 = obj11;
                    function22 = obj7;
                    function33 = obj8;
                    windowInsets2 = obj9;
                    topAppBarColors2 = obj10;
                    topAppBarScrollBehavior2 = obj6;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                function32 = function3;
                if ((i & 57344) != 0) {
                }
                if ((i & 458752) != 0) {
                }
                i6 = i2 & 64;
                if (i6 == 0) {
                }
                obj5 = topAppBarScrollBehavior;
                if ((i3 & 2995931) == 599186) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i9 != 0) {
                }
                if (i4 != 0) {
                }
                if (i5 != 0) {
                }
                if ((i2 & 16) != 0) {
                }
                if ((i2 & 32) != 0) {
                }
                if (i6 != 0) {
                }
                obj8 = function32;
                obj9 = obj3;
                obj10 = obj4;
                obj11 = companion;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                int i1022 = i3 << 6;
                composer2 = startRestartGroup;
                SingleRowTopAppBar(obj11, title, TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6), TopAppBarSmallTokens.INSTANCE.getHeadlineFont()), false, obj7, obj8, obj9, obj10, obj6, startRestartGroup, (57344 & i1022) | ((i3 >> 3) & 14) | CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE | ((i3 << 3) & 112) | (458752 & i1022) | (i1022 & 3670016) | (29360128 & i1022) | (i1022 & 234881024), 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier2 = obj11;
                function22 = obj7;
                function33 = obj8;
                windowInsets2 = obj9;
                topAppBarColors2 = obj10;
                topAppBarScrollBehavior2 = obj6;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            obj2 = function2;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            function32 = function3;
            if ((i & 57344) != 0) {
            }
            if ((i & 458752) != 0) {
            }
            i6 = i2 & 64;
            if (i6 == 0) {
            }
            obj5 = topAppBarScrollBehavior;
            if ((i3 & 2995931) == 599186) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i9 != 0) {
            }
            if (i4 != 0) {
            }
            if (i5 != 0) {
            }
            if ((i2 & 16) != 0) {
            }
            if ((i2 & 32) != 0) {
            }
            if (i6 != 0) {
            }
            obj8 = function32;
            obj9 = obj3;
            obj10 = obj4;
            obj11 = companion;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            int i10222 = i3 << 6;
            composer2 = startRestartGroup;
            SingleRowTopAppBar(obj11, title, TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6), TopAppBarSmallTokens.INSTANCE.getHeadlineFont()), false, obj7, obj8, obj9, obj10, obj6, startRestartGroup, (57344 & i10222) | ((i3 >> 3) & 14) | CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE | ((i3 << 3) & 112) | (458752 & i10222) | (i10222 & 3670016) | (29360128 & i10222) | (i10222 & 234881024), 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier2 = obj11;
            function22 = obj7;
            function33 = obj8;
            windowInsets2 = obj9;
            topAppBarColors2 = obj10;
            topAppBarScrollBehavior2 = obj6;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        obj = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        obj2 = function2;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        function32 = function3;
        if ((i & 57344) != 0) {
        }
        if ((i & 458752) != 0) {
        }
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        obj5 = topAppBarScrollBehavior;
        if ((i3 & 2995931) == 599186) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i9 != 0) {
        }
        if (i4 != 0) {
        }
        if (i5 != 0) {
        }
        if ((i2 & 16) != 0) {
        }
        if ((i2 & 32) != 0) {
        }
        if (i6 != 0) {
        }
        obj8 = function32;
        obj9 = obj3;
        obj10 = obj4;
        obj11 = companion;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        int i102222 = i3 << 6;
        composer2 = startRestartGroup;
        SingleRowTopAppBar(obj11, title, TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6), TopAppBarSmallTokens.INSTANCE.getHeadlineFont()), false, obj7, obj8, obj9, obj10, obj6, startRestartGroup, (57344 & i102222) | ((i3 >> 3) & 14) | CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE | ((i3 << 3) & 112) | (458752 & i102222) | (i102222 & 3670016) | (29360128 & i102222) | (i102222 & 234881024), 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier2 = obj11;
        function22 = obj7;
        function33 = obj8;
        windowInsets2 = obj9;
        topAppBarColors2 = obj10;
        topAppBarScrollBehavior2 = obj6;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x012c  */
    @Deprecated(level = DeprecationLevel.WARNING, message = "Use TopAppBar instead.", replaceWith = @ReplaceWith(expression = "TopAppBar(title, modifier, navigationIcon, actions, windowInsets, colors, scrollBehavior)", imports = {}))
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SmallTopAppBar(Function2<? super Composer, ? super Integer, Unit> title, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, Composer composer, int i, int i2) {
        int i3;
        Object obj;
        int i4;
        Object obj2;
        int i5;
        Function3<RowScope, Composer, Integer, Unit> function32;
        Object obj3;
        Object obj4;
        int i6;
        Object obj5;
        WindowInsets windowInsets2;
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj9;
        Object obj10;
        Object obj11;
        Composer composer2;
        Modifier modifier2;
        Function2<? super Composer, ? super Integer, Unit> function22;
        Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function33;
        WindowInsets windowInsets3;
        TopAppBarColors topAppBarColors2;
        TopAppBarScrollBehavior topAppBarScrollBehavior2;
        ScopeUpdateScope endRestartGroup;
        int i7;
        int i8;
        Intrinsics.checkNotNullParameter(title, "title");
        Composer startRestartGroup = composer.startRestartGroup(-1967617284);
        ComposerKt.sourceInformation(startRestartGroup, "C(SmallTopAppBar)P(5,2,3!1,6)188@9238L12,189@9300L17,191@9375L89:AppBar.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changedInstance(title) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            obj = modifier;
            i3 |= startRestartGroup.changed(obj) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                obj2 = function2;
                i3 |= startRestartGroup.changedInstance(obj2) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
                } else if ((i & 7168) == 0) {
                    function32 = function3;
                    i3 |= startRestartGroup.changedInstance(function32) ? 2048 : 1024;
                    if ((i & 57344) != 0) {
                        if ((i2 & 16) == 0) {
                            obj3 = windowInsets;
                            if (startRestartGroup.changed(obj3)) {
                                i8 = 16384;
                                i3 |= i8;
                            }
                        } else {
                            obj3 = windowInsets;
                        }
                        i8 = 8192;
                        i3 |= i8;
                    } else {
                        obj3 = windowInsets;
                    }
                    if ((i & 458752) != 0) {
                        if ((i2 & 32) == 0) {
                            obj4 = topAppBarColors;
                            if (startRestartGroup.changed(obj4)) {
                                i7 = 131072;
                                i3 |= i7;
                            }
                        } else {
                            obj4 = topAppBarColors;
                        }
                        i7 = 65536;
                        i3 |= i7;
                    } else {
                        obj4 = topAppBarColors;
                    }
                    i6 = i2 & 64;
                    if (i6 == 0) {
                        i3 |= 1572864;
                        obj5 = topAppBarScrollBehavior;
                    } else {
                        obj5 = topAppBarScrollBehavior;
                        if ((i & 3670016) == 0) {
                            i3 |= startRestartGroup.changed(obj5) ? 1048576 : 524288;
                        }
                    }
                    if ((2995931 & i3) == 599186 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            Modifier.Companion companion = i9 == 0 ? Modifier.Companion : obj;
                            Function2<Composer, Integer, Unit> m1698getLambda3$material3_release = i4 == 0 ? ComposableSingletons$AppBarKt.INSTANCE.m1698getLambda3$material3_release() : obj2;
                            if (i5 != 0) {
                                function32 = ComposableSingletons$AppBarKt.INSTANCE.m1699getLambda4$material3_release();
                            }
                            if ((i2 & 16) == 0) {
                                windowInsets2 = TopAppBarDefaults.INSTANCE.getWindowInsets(startRestartGroup, 6);
                                i3 &= -57345;
                            } else {
                                windowInsets2 = obj3;
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                                obj4 = TopAppBarDefaults.INSTANCE.m2269topAppBarColorszjMxDiM(0L, 0L, 0L, 0L, 0L, startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                            }
                            if (i6 == 0) {
                                obj7 = companion;
                                obj8 = windowInsets2;
                                obj6 = null;
                            } else {
                                obj6 = topAppBarScrollBehavior;
                                obj7 = companion;
                                obj8 = windowInsets2;
                            }
                            obj9 = function32;
                            obj10 = obj4;
                            obj11 = m1698getLambda3$material3_release;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                            }
                            obj9 = function32;
                            obj10 = obj4;
                            obj6 = obj5;
                            obj11 = obj2;
                            obj8 = obj3;
                            obj7 = obj;
                        }
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1967617284, i3, -1, "androidx.compose.material3.SmallTopAppBar (AppBar.kt:183)");
                        }
                        composer2 = startRestartGroup;
                        TopAppBar(title, obj7, obj11, obj9, obj8, obj10, obj6, startRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (i3 & 458752) | (i3 & 3670016), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier2 = obj7;
                        function22 = obj11;
                        function33 = obj9;
                        windowInsets3 = obj8;
                        topAppBarColors2 = obj10;
                        topAppBarScrollBehavior2 = obj6;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier2 = obj;
                        function22 = obj2;
                        function33 = function32;
                        composer2 = startRestartGroup;
                        windowInsets3 = obj3;
                        topAppBarColors2 = obj4;
                        topAppBarScrollBehavior2 = obj5;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                        return;
                    }
                    endRestartGroup.updateScope(new AppBarKt$SmallTopAppBar$1(title, modifier2, function22, function33, windowInsets3, topAppBarColors2, topAppBarScrollBehavior2, i, i2));
                    return;
                }
                function32 = function3;
                if ((i & 57344) != 0) {
                }
                if ((i & 458752) != 0) {
                }
                i6 = i2 & 64;
                if (i6 == 0) {
                }
                if ((2995931 & i3) == 599186) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i9 == 0) {
                }
                if (i4 == 0) {
                }
                if (i5 != 0) {
                }
                if ((i2 & 16) == 0) {
                }
                if ((i2 & 32) != 0) {
                }
                if (i6 == 0) {
                }
                obj9 = function32;
                obj10 = obj4;
                obj11 = m1698getLambda3$material3_release;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                composer2 = startRestartGroup;
                TopAppBar(title, obj7, obj11, obj9, obj8, obj10, obj6, startRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (i3 & 458752) | (i3 & 3670016), 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier2 = obj7;
                function22 = obj11;
                function33 = obj9;
                windowInsets3 = obj8;
                topAppBarColors2 = obj10;
                topAppBarScrollBehavior2 = obj6;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            obj2 = function2;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            function32 = function3;
            if ((i & 57344) != 0) {
            }
            if ((i & 458752) != 0) {
            }
            i6 = i2 & 64;
            if (i6 == 0) {
            }
            if ((2995931 & i3) == 599186) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i9 == 0) {
            }
            if (i4 == 0) {
            }
            if (i5 != 0) {
            }
            if ((i2 & 16) == 0) {
            }
            if ((i2 & 32) != 0) {
            }
            if (i6 == 0) {
            }
            obj9 = function32;
            obj10 = obj4;
            obj11 = m1698getLambda3$material3_release;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            composer2 = startRestartGroup;
            TopAppBar(title, obj7, obj11, obj9, obj8, obj10, obj6, startRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (i3 & 458752) | (i3 & 3670016), 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier2 = obj7;
            function22 = obj11;
            function33 = obj9;
            windowInsets3 = obj8;
            topAppBarColors2 = obj10;
            topAppBarScrollBehavior2 = obj6;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        obj = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        obj2 = function2;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        function32 = function3;
        if ((i & 57344) != 0) {
        }
        if ((i & 458752) != 0) {
        }
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        if ((2995931 & i3) == 599186) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i9 == 0) {
        }
        if (i4 == 0) {
        }
        if (i5 != 0) {
        }
        if ((i2 & 16) == 0) {
        }
        if ((i2 & 32) != 0) {
        }
        if (i6 == 0) {
        }
        obj9 = function32;
        obj10 = obj4;
        obj11 = m1698getLambda3$material3_release;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        composer2 = startRestartGroup;
        TopAppBar(title, obj7, obj11, obj9, obj8, obj10, obj6, startRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (i3 & 458752) | (i3 & 3670016), 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier2 = obj7;
        function22 = obj11;
        function33 = obj9;
        windowInsets3 = obj8;
        topAppBarColors2 = obj10;
        topAppBarScrollBehavior2 = obj6;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0131  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CenterAlignedTopAppBar(Function2<? super Composer, ? super Integer, Unit> title, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, Composer composer, int i, int i2) {
        int i3;
        Object obj;
        int i4;
        Object obj2;
        int i5;
        Function3<RowScope, Composer, Integer, Unit> function32;
        Object obj3;
        Object obj4;
        int i6;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj9;
        Object obj10;
        Object obj11;
        Composer composer2;
        Modifier modifier2;
        Function2<? super Composer, ? super Integer, Unit> function22;
        Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function33;
        WindowInsets windowInsets2;
        TopAppBarColors topAppBarColors2;
        TopAppBarScrollBehavior topAppBarScrollBehavior2;
        ScopeUpdateScope endRestartGroup;
        int i7;
        int i8;
        Intrinsics.checkNotNullParameter(title, "title");
        Composer startRestartGroup = composer.startRestartGroup(-2139286460);
        ComposerKt.sourceInformation(startRestartGroup, "C(CenterAlignedTopAppBar)P(5,2,3!1,6)229@11657L12,230@11719L30,237@11930L10,233@11811L381:AppBar.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changedInstance(title) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            obj = modifier;
            i3 |= startRestartGroup.changed(obj) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                obj2 = function2;
                i3 |= startRestartGroup.changedInstance(obj2) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
                } else if ((i & 7168) == 0) {
                    function32 = function3;
                    i3 |= startRestartGroup.changedInstance(function32) ? 2048 : 1024;
                    if ((i & 57344) != 0) {
                        if ((i2 & 16) == 0) {
                            obj3 = windowInsets;
                            if (startRestartGroup.changed(obj3)) {
                                i8 = 16384;
                                i3 |= i8;
                            }
                        } else {
                            obj3 = windowInsets;
                        }
                        i8 = 8192;
                        i3 |= i8;
                    } else {
                        obj3 = windowInsets;
                    }
                    if ((i & 458752) != 0) {
                        if ((i2 & 32) == 0) {
                            obj4 = topAppBarColors;
                            if (startRestartGroup.changed(obj4)) {
                                i7 = 131072;
                                i3 |= i7;
                            }
                        } else {
                            obj4 = topAppBarColors;
                        }
                        i7 = 65536;
                        i3 |= i7;
                    } else {
                        obj4 = topAppBarColors;
                    }
                    i6 = i2 & 64;
                    if (i6 == 0) {
                        i3 |= 1572864;
                    } else if ((i & 3670016) == 0) {
                        obj5 = topAppBarScrollBehavior;
                        i3 |= startRestartGroup.changed(obj5) ? 1048576 : 524288;
                        if ((i3 & 2995931) == 599186 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                Modifier.Companion companion = i9 != 0 ? Modifier.Companion : obj;
                                Function2<Composer, Integer, Unit> m1700getLambda5$material3_release = i4 != 0 ? ComposableSingletons$AppBarKt.INSTANCE.m1700getLambda5$material3_release() : obj2;
                                if (i5 != 0) {
                                    function32 = ComposableSingletons$AppBarKt.INSTANCE.m1701getLambda6$material3_release();
                                }
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                    obj3 = TopAppBarDefaults.INSTANCE.getWindowInsets(startRestartGroup, 6);
                                }
                                if ((i2 & 32) != 0) {
                                    i3 &= -458753;
                                    obj4 = TopAppBarDefaults.INSTANCE.m2265centerAlignedTopAppBarColorszjMxDiM(0L, 0L, 0L, 0L, 0L, startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                                }
                                if (i6 != 0) {
                                    obj7 = m1700getLambda5$material3_release;
                                    obj6 = null;
                                } else {
                                    obj6 = topAppBarScrollBehavior;
                                    obj7 = m1700getLambda5$material3_release;
                                }
                                obj8 = function32;
                                obj9 = obj3;
                                obj10 = obj4;
                                obj11 = companion;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                }
                                if ((i2 & 32) != 0) {
                                    i3 &= -458753;
                                }
                                obj8 = function32;
                                obj9 = obj3;
                                obj10 = obj4;
                                obj6 = obj5;
                                obj11 = obj;
                                obj7 = obj2;
                            }
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-2139286460, i3, -1, "androidx.compose.material3.CenterAlignedTopAppBar (AppBar.kt:224)");
                            }
                            int i10 = i3 << 6;
                            composer2 = startRestartGroup;
                            SingleRowTopAppBar(obj11, title, TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6), TopAppBarSmallTokens.INSTANCE.getHeadlineFont()), true, obj7, obj8, obj9, obj10, obj6, startRestartGroup, (57344 & i10) | ((i3 >> 3) & 14) | CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE | ((i3 << 3) & 112) | (458752 & i10) | (i10 & 3670016) | (29360128 & i10) | (i10 & 234881024), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier2 = obj11;
                            function22 = obj7;
                            function33 = obj8;
                            windowInsets2 = obj9;
                            topAppBarColors2 = obj10;
                            topAppBarScrollBehavior2 = obj6;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier2 = obj;
                            function22 = obj2;
                            function33 = function32;
                            windowInsets2 = obj3;
                            composer2 = startRestartGroup;
                            topAppBarColors2 = obj4;
                            topAppBarScrollBehavior2 = obj5;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                            return;
                        }
                        endRestartGroup.updateScope(new AppBarKt$CenterAlignedTopAppBar$1(title, modifier2, function22, function33, windowInsets2, topAppBarColors2, topAppBarScrollBehavior2, i, i2));
                        return;
                    }
                    obj5 = topAppBarScrollBehavior;
                    if ((i3 & 2995931) == 599186) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i9 != 0) {
                    }
                    if (i4 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if ((i2 & 16) != 0) {
                    }
                    if ((i2 & 32) != 0) {
                    }
                    if (i6 != 0) {
                    }
                    obj8 = function32;
                    obj9 = obj3;
                    obj10 = obj4;
                    obj11 = companion;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    int i102 = i3 << 6;
                    composer2 = startRestartGroup;
                    SingleRowTopAppBar(obj11, title, TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6), TopAppBarSmallTokens.INSTANCE.getHeadlineFont()), true, obj7, obj8, obj9, obj10, obj6, startRestartGroup, (57344 & i102) | ((i3 >> 3) & 14) | CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE | ((i3 << 3) & 112) | (458752 & i102) | (i102 & 3670016) | (29360128 & i102) | (i102 & 234881024), 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier2 = obj11;
                    function22 = obj7;
                    function33 = obj8;
                    windowInsets2 = obj9;
                    topAppBarColors2 = obj10;
                    topAppBarScrollBehavior2 = obj6;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                function32 = function3;
                if ((i & 57344) != 0) {
                }
                if ((i & 458752) != 0) {
                }
                i6 = i2 & 64;
                if (i6 == 0) {
                }
                obj5 = topAppBarScrollBehavior;
                if ((i3 & 2995931) == 599186) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i9 != 0) {
                }
                if (i4 != 0) {
                }
                if (i5 != 0) {
                }
                if ((i2 & 16) != 0) {
                }
                if ((i2 & 32) != 0) {
                }
                if (i6 != 0) {
                }
                obj8 = function32;
                obj9 = obj3;
                obj10 = obj4;
                obj11 = companion;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                int i1022 = i3 << 6;
                composer2 = startRestartGroup;
                SingleRowTopAppBar(obj11, title, TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6), TopAppBarSmallTokens.INSTANCE.getHeadlineFont()), true, obj7, obj8, obj9, obj10, obj6, startRestartGroup, (57344 & i1022) | ((i3 >> 3) & 14) | CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE | ((i3 << 3) & 112) | (458752 & i1022) | (i1022 & 3670016) | (29360128 & i1022) | (i1022 & 234881024), 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier2 = obj11;
                function22 = obj7;
                function33 = obj8;
                windowInsets2 = obj9;
                topAppBarColors2 = obj10;
                topAppBarScrollBehavior2 = obj6;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            obj2 = function2;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            function32 = function3;
            if ((i & 57344) != 0) {
            }
            if ((i & 458752) != 0) {
            }
            i6 = i2 & 64;
            if (i6 == 0) {
            }
            obj5 = topAppBarScrollBehavior;
            if ((i3 & 2995931) == 599186) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i9 != 0) {
            }
            if (i4 != 0) {
            }
            if (i5 != 0) {
            }
            if ((i2 & 16) != 0) {
            }
            if ((i2 & 32) != 0) {
            }
            if (i6 != 0) {
            }
            obj8 = function32;
            obj9 = obj3;
            obj10 = obj4;
            obj11 = companion;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            int i10222 = i3 << 6;
            composer2 = startRestartGroup;
            SingleRowTopAppBar(obj11, title, TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6), TopAppBarSmallTokens.INSTANCE.getHeadlineFont()), true, obj7, obj8, obj9, obj10, obj6, startRestartGroup, (57344 & i10222) | ((i3 >> 3) & 14) | CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE | ((i3 << 3) & 112) | (458752 & i10222) | (i10222 & 3670016) | (29360128 & i10222) | (i10222 & 234881024), 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier2 = obj11;
            function22 = obj7;
            function33 = obj8;
            windowInsets2 = obj9;
            topAppBarColors2 = obj10;
            topAppBarScrollBehavior2 = obj6;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        obj = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        obj2 = function2;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        function32 = function3;
        if ((i & 57344) != 0) {
        }
        if ((i & 458752) != 0) {
        }
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        obj5 = topAppBarScrollBehavior;
        if ((i3 & 2995931) == 599186) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i9 != 0) {
        }
        if (i4 != 0) {
        }
        if (i5 != 0) {
        }
        if ((i2 & 16) != 0) {
        }
        if ((i2 & 32) != 0) {
        }
        if (i6 != 0) {
        }
        obj8 = function32;
        obj9 = obj3;
        obj10 = obj4;
        obj11 = companion;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        int i102222 = i3 << 6;
        composer2 = startRestartGroup;
        SingleRowTopAppBar(obj11, title, TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6), TopAppBarSmallTokens.INSTANCE.getHeadlineFont()), true, obj7, obj8, obj9, obj10, obj6, startRestartGroup, (57344 & i102222) | ((i3 >> 3) & 14) | CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE | ((i3 << 3) & 112) | (458752 & i102222) | (i102222 & 3670016) | (29360128 & i102222) | (i102222 & 234881024), 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier2 = obj11;
        function22 = obj7;
        function33 = obj8;
        windowInsets2 = obj9;
        topAppBarColors2 = obj10;
        topAppBarScrollBehavior2 = obj6;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0130  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void MediumTopAppBar(Function2<? super Composer, ? super Integer, Unit> title, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, Composer composer, int i, int i2) {
        int i3;
        Object obj;
        int i4;
        Object obj2;
        int i5;
        Function3<RowScope, Composer, Integer, Unit> function32;
        Object obj3;
        Object obj4;
        int i6;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj9;
        Object obj10;
        Object obj11;
        Composer composer2;
        Modifier modifier2;
        Function2<? super Composer, ? super Integer, Unit> function22;
        Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function33;
        WindowInsets windowInsets2;
        TopAppBarColors topAppBarColors2;
        TopAppBarScrollBehavior topAppBarScrollBehavior2;
        ScopeUpdateScope endRestartGroup;
        int i7;
        int i8;
        Intrinsics.checkNotNullParameter(title, "title");
        Composer startRestartGroup = composer.startRestartGroup(1805417862);
        ComposerKt.sourceInformation(startRestartGroup, "C(MediumTopAppBar)P(5,2,3!1,6)284@14510L12,285@14572L23,291@14766L10,292@14868L10,288@14657L646:AppBar.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changedInstance(title) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            obj = modifier;
            i3 |= startRestartGroup.changed(obj) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                obj2 = function2;
                i3 |= startRestartGroup.changedInstance(obj2) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
                } else if ((i & 7168) == 0) {
                    function32 = function3;
                    i3 |= startRestartGroup.changedInstance(function32) ? 2048 : 1024;
                    if ((i & 57344) != 0) {
                        if ((i2 & 16) == 0) {
                            obj3 = windowInsets;
                            if (startRestartGroup.changed(obj3)) {
                                i8 = 16384;
                                i3 |= i8;
                            }
                        } else {
                            obj3 = windowInsets;
                        }
                        i8 = 8192;
                        i3 |= i8;
                    } else {
                        obj3 = windowInsets;
                    }
                    if ((458752 & i) != 0) {
                        if ((i2 & 32) == 0) {
                            obj4 = topAppBarColors;
                            if (startRestartGroup.changed(obj4)) {
                                i7 = 131072;
                                i3 |= i7;
                            }
                        } else {
                            obj4 = topAppBarColors;
                        }
                        i7 = 65536;
                        i3 |= i7;
                    } else {
                        obj4 = topAppBarColors;
                    }
                    i6 = i2 & 64;
                    if (i6 == 0) {
                        i3 |= 1572864;
                        obj5 = topAppBarScrollBehavior;
                    } else {
                        obj5 = topAppBarScrollBehavior;
                        if ((i & 3670016) == 0) {
                            i3 |= startRestartGroup.changed(obj5) ? 1048576 : 524288;
                        }
                    }
                    if ((2995931 & i3) == 599186 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            Modifier.Companion companion = i9 == 0 ? Modifier.Companion : obj;
                            Function2<Composer, Integer, Unit> m1702getLambda7$material3_release = i4 == 0 ? ComposableSingletons$AppBarKt.INSTANCE.m1702getLambda7$material3_release() : obj2;
                            if (i5 != 0) {
                                function32 = ComposableSingletons$AppBarKt.INSTANCE.m1703getLambda8$material3_release();
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                                obj3 = TopAppBarDefaults.INSTANCE.getWindowInsets(startRestartGroup, 6);
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                                obj4 = TopAppBarDefaults.INSTANCE.m2267mediumTopAppBarColorszjMxDiM(0L, 0L, 0L, 0L, 0L, startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                            }
                            if (i6 == 0) {
                                obj7 = companion;
                                obj8 = m1702getLambda7$material3_release;
                                obj6 = null;
                            } else {
                                obj6 = topAppBarScrollBehavior;
                                obj7 = companion;
                                obj8 = m1702getLambda7$material3_release;
                            }
                            obj9 = function32;
                            obj10 = obj3;
                            obj11 = obj4;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                            }
                            obj7 = obj;
                            obj8 = obj2;
                            obj9 = function32;
                            obj10 = obj3;
                            obj11 = obj4;
                            obj6 = obj5;
                        }
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1805417862, i3, -1, "androidx.compose.material3.MediumTopAppBar (AppBar.kt:279)");
                        }
                        int i10 = i3 << 12;
                        composer2 = startRestartGroup;
                        m1573TwoRowsTopAppBartjU4iQQ(obj7, title, TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6), TopAppBarMediumTokens.INSTANCE.getHeadlineFont()), MediumTitleBottomPadding, title, TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6), TopAppBarSmallTokens.INSTANCE.getHeadlineFont()), obj8, obj9, obj10, obj11, TopAppBarMediumTokens.INSTANCE.m2771getContainerHeightD9Ej5fM(), TopAppBarSmallTokens.INSTANCE.m2781getContainerHeightD9Ej5fM(), obj6, composer2, ((i3 >> 3) & 14) | CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE | ((i3 << 3) & 112) | (57344 & i10) | (i10 & 3670016) | (29360128 & i10) | (234881024 & i10) | (i10 & 1879048192), ((i3 >> 12) & 896) | 54, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier2 = obj7;
                        function22 = obj8;
                        function33 = obj9;
                        windowInsets2 = obj10;
                        topAppBarColors2 = obj11;
                        topAppBarScrollBehavior2 = obj6;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier2 = obj;
                        function22 = obj2;
                        function33 = function32;
                        composer2 = startRestartGroup;
                        windowInsets2 = obj3;
                        topAppBarColors2 = obj4;
                        topAppBarScrollBehavior2 = obj5;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                        return;
                    }
                    endRestartGroup.updateScope(new AppBarKt$MediumTopAppBar$1(title, modifier2, function22, function33, windowInsets2, topAppBarColors2, topAppBarScrollBehavior2, i, i2));
                    return;
                }
                function32 = function3;
                if ((i & 57344) != 0) {
                }
                if ((458752 & i) != 0) {
                }
                i6 = i2 & 64;
                if (i6 == 0) {
                }
                if ((2995931 & i3) == 599186) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i9 == 0) {
                }
                if (i4 == 0) {
                }
                if (i5 != 0) {
                }
                if ((i2 & 16) != 0) {
                }
                if ((i2 & 32) != 0) {
                }
                if (i6 == 0) {
                }
                obj9 = function32;
                obj10 = obj3;
                obj11 = obj4;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                int i102 = i3 << 12;
                composer2 = startRestartGroup;
                m1573TwoRowsTopAppBartjU4iQQ(obj7, title, TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6), TopAppBarMediumTokens.INSTANCE.getHeadlineFont()), MediumTitleBottomPadding, title, TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6), TopAppBarSmallTokens.INSTANCE.getHeadlineFont()), obj8, obj9, obj10, obj11, TopAppBarMediumTokens.INSTANCE.m2771getContainerHeightD9Ej5fM(), TopAppBarSmallTokens.INSTANCE.m2781getContainerHeightD9Ej5fM(), obj6, composer2, ((i3 >> 3) & 14) | CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE | ((i3 << 3) & 112) | (57344 & i102) | (i102 & 3670016) | (29360128 & i102) | (234881024 & i102) | (i102 & 1879048192), ((i3 >> 12) & 896) | 54, 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier2 = obj7;
                function22 = obj8;
                function33 = obj9;
                windowInsets2 = obj10;
                topAppBarColors2 = obj11;
                topAppBarScrollBehavior2 = obj6;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            obj2 = function2;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            function32 = function3;
            if ((i & 57344) != 0) {
            }
            if ((458752 & i) != 0) {
            }
            i6 = i2 & 64;
            if (i6 == 0) {
            }
            if ((2995931 & i3) == 599186) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i9 == 0) {
            }
            if (i4 == 0) {
            }
            if (i5 != 0) {
            }
            if ((i2 & 16) != 0) {
            }
            if ((i2 & 32) != 0) {
            }
            if (i6 == 0) {
            }
            obj9 = function32;
            obj10 = obj3;
            obj11 = obj4;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            int i1022 = i3 << 12;
            composer2 = startRestartGroup;
            m1573TwoRowsTopAppBartjU4iQQ(obj7, title, TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6), TopAppBarMediumTokens.INSTANCE.getHeadlineFont()), MediumTitleBottomPadding, title, TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6), TopAppBarSmallTokens.INSTANCE.getHeadlineFont()), obj8, obj9, obj10, obj11, TopAppBarMediumTokens.INSTANCE.m2771getContainerHeightD9Ej5fM(), TopAppBarSmallTokens.INSTANCE.m2781getContainerHeightD9Ej5fM(), obj6, composer2, ((i3 >> 3) & 14) | CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE | ((i3 << 3) & 112) | (57344 & i1022) | (i1022 & 3670016) | (29360128 & i1022) | (234881024 & i1022) | (i1022 & 1879048192), ((i3 >> 12) & 896) | 54, 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier2 = obj7;
            function22 = obj8;
            function33 = obj9;
            windowInsets2 = obj10;
            topAppBarColors2 = obj11;
            topAppBarScrollBehavior2 = obj6;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        obj = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        obj2 = function2;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        function32 = function3;
        if ((i & 57344) != 0) {
        }
        if ((458752 & i) != 0) {
        }
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        if ((2995931 & i3) == 599186) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i9 == 0) {
        }
        if (i4 == 0) {
        }
        if (i5 != 0) {
        }
        if ((i2 & 16) != 0) {
        }
        if ((i2 & 32) != 0) {
        }
        if (i6 == 0) {
        }
        obj9 = function32;
        obj10 = obj3;
        obj11 = obj4;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        int i10222 = i3 << 12;
        composer2 = startRestartGroup;
        m1573TwoRowsTopAppBartjU4iQQ(obj7, title, TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6), TopAppBarMediumTokens.INSTANCE.getHeadlineFont()), MediumTitleBottomPadding, title, TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6), TopAppBarSmallTokens.INSTANCE.getHeadlineFont()), obj8, obj9, obj10, obj11, TopAppBarMediumTokens.INSTANCE.m2771getContainerHeightD9Ej5fM(), TopAppBarSmallTokens.INSTANCE.m2781getContainerHeightD9Ej5fM(), obj6, composer2, ((i3 >> 3) & 14) | CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE | ((i3 << 3) & 112) | (57344 & i10222) | (i10222 & 3670016) | (29360128 & i10222) | (234881024 & i10222) | (i10222 & 1879048192), ((i3 >> 12) & 896) | 54, 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier2 = obj7;
        function22 = obj8;
        function33 = obj9;
        windowInsets2 = obj10;
        topAppBarColors2 = obj11;
        topAppBarScrollBehavior2 = obj6;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0130  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LargeTopAppBar(Function2<? super Composer, ? super Integer, Unit> title, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, Composer composer, int i, int i2) {
        int i3;
        Object obj;
        int i4;
        Object obj2;
        int i5;
        Function3<RowScope, Composer, Integer, Unit> function32;
        Object obj3;
        Object obj4;
        int i6;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj9;
        Object obj10;
        Object obj11;
        Composer composer2;
        Modifier modifier2;
        Function2<? super Composer, ? super Integer, Unit> function22;
        Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function33;
        WindowInsets windowInsets2;
        TopAppBarColors topAppBarColors2;
        TopAppBarScrollBehavior topAppBarScrollBehavior2;
        ScopeUpdateScope endRestartGroup;
        int i7;
        int i8;
        Intrinsics.checkNotNullParameter(title, "title");
        Composer startRestartGroup = composer.startRestartGroup(-474540752);
        ComposerKt.sourceInformation(startRestartGroup, "C(LargeTopAppBar)P(5,2,3!1,6)342@17613L12,343@17675L22,348@17839L10,349@17940L10,346@17759L643:AppBar.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changedInstance(title) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            obj = modifier;
            i3 |= startRestartGroup.changed(obj) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                obj2 = function2;
                i3 |= startRestartGroup.changedInstance(obj2) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
                } else if ((i & 7168) == 0) {
                    function32 = function3;
                    i3 |= startRestartGroup.changedInstance(function32) ? 2048 : 1024;
                    if ((i & 57344) != 0) {
                        if ((i2 & 16) == 0) {
                            obj3 = windowInsets;
                            if (startRestartGroup.changed(obj3)) {
                                i8 = 16384;
                                i3 |= i8;
                            }
                        } else {
                            obj3 = windowInsets;
                        }
                        i8 = 8192;
                        i3 |= i8;
                    } else {
                        obj3 = windowInsets;
                    }
                    if ((458752 & i) != 0) {
                        if ((i2 & 32) == 0) {
                            obj4 = topAppBarColors;
                            if (startRestartGroup.changed(obj4)) {
                                i7 = 131072;
                                i3 |= i7;
                            }
                        } else {
                            obj4 = topAppBarColors;
                        }
                        i7 = 65536;
                        i3 |= i7;
                    } else {
                        obj4 = topAppBarColors;
                    }
                    i6 = i2 & 64;
                    if (i6 == 0) {
                        i3 |= 1572864;
                        obj5 = topAppBarScrollBehavior;
                    } else {
                        obj5 = topAppBarScrollBehavior;
                        if ((i & 3670016) == 0) {
                            i3 |= startRestartGroup.changed(obj5) ? 1048576 : 524288;
                        }
                    }
                    if ((2995931 & i3) == 599186 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            Modifier.Companion companion = i9 == 0 ? Modifier.Companion : obj;
                            Function2<Composer, Integer, Unit> m1704getLambda9$material3_release = i4 == 0 ? ComposableSingletons$AppBarKt.INSTANCE.m1704getLambda9$material3_release() : obj2;
                            if (i5 != 0) {
                                function32 = ComposableSingletons$AppBarKt.INSTANCE.m1694getLambda10$material3_release();
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                                obj3 = TopAppBarDefaults.INSTANCE.getWindowInsets(startRestartGroup, 6);
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                                obj4 = TopAppBarDefaults.INSTANCE.m2266largeTopAppBarColorszjMxDiM(0L, 0L, 0L, 0L, 0L, startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                            }
                            if (i6 == 0) {
                                obj7 = companion;
                                obj8 = m1704getLambda9$material3_release;
                                obj6 = null;
                            } else {
                                obj6 = topAppBarScrollBehavior;
                                obj7 = companion;
                                obj8 = m1704getLambda9$material3_release;
                            }
                            obj9 = function32;
                            obj10 = obj3;
                            obj11 = obj4;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                            }
                            obj7 = obj;
                            obj8 = obj2;
                            obj9 = function32;
                            obj10 = obj3;
                            obj11 = obj4;
                            obj6 = obj5;
                        }
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-474540752, i3, -1, "androidx.compose.material3.LargeTopAppBar (AppBar.kt:337)");
                        }
                        int i10 = i3 << 12;
                        composer2 = startRestartGroup;
                        m1573TwoRowsTopAppBartjU4iQQ(obj7, title, TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6), TopAppBarLargeTokens.INSTANCE.getHeadlineFont()), LargeTitleBottomPadding, title, TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6), TopAppBarSmallTokens.INSTANCE.getHeadlineFont()), obj8, obj9, obj10, obj11, TopAppBarLargeTokens.INSTANCE.m2767getContainerHeightD9Ej5fM(), TopAppBarSmallTokens.INSTANCE.m2781getContainerHeightD9Ej5fM(), obj6, composer2, ((i3 >> 3) & 14) | CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE | ((i3 << 3) & 112) | (57344 & i10) | (i10 & 3670016) | (29360128 & i10) | (234881024 & i10) | (i10 & 1879048192), ((i3 >> 12) & 896) | 54, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier2 = obj7;
                        function22 = obj8;
                        function33 = obj9;
                        windowInsets2 = obj10;
                        topAppBarColors2 = obj11;
                        topAppBarScrollBehavior2 = obj6;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier2 = obj;
                        function22 = obj2;
                        function33 = function32;
                        composer2 = startRestartGroup;
                        windowInsets2 = obj3;
                        topAppBarColors2 = obj4;
                        topAppBarScrollBehavior2 = obj5;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                        return;
                    }
                    endRestartGroup.updateScope(new AppBarKt$LargeTopAppBar$1(title, modifier2, function22, function33, windowInsets2, topAppBarColors2, topAppBarScrollBehavior2, i, i2));
                    return;
                }
                function32 = function3;
                if ((i & 57344) != 0) {
                }
                if ((458752 & i) != 0) {
                }
                i6 = i2 & 64;
                if (i6 == 0) {
                }
                if ((2995931 & i3) == 599186) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i9 == 0) {
                }
                if (i4 == 0) {
                }
                if (i5 != 0) {
                }
                if ((i2 & 16) != 0) {
                }
                if ((i2 & 32) != 0) {
                }
                if (i6 == 0) {
                }
                obj9 = function32;
                obj10 = obj3;
                obj11 = obj4;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                int i102 = i3 << 12;
                composer2 = startRestartGroup;
                m1573TwoRowsTopAppBartjU4iQQ(obj7, title, TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6), TopAppBarLargeTokens.INSTANCE.getHeadlineFont()), LargeTitleBottomPadding, title, TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6), TopAppBarSmallTokens.INSTANCE.getHeadlineFont()), obj8, obj9, obj10, obj11, TopAppBarLargeTokens.INSTANCE.m2767getContainerHeightD9Ej5fM(), TopAppBarSmallTokens.INSTANCE.m2781getContainerHeightD9Ej5fM(), obj6, composer2, ((i3 >> 3) & 14) | CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE | ((i3 << 3) & 112) | (57344 & i102) | (i102 & 3670016) | (29360128 & i102) | (234881024 & i102) | (i102 & 1879048192), ((i3 >> 12) & 896) | 54, 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier2 = obj7;
                function22 = obj8;
                function33 = obj9;
                windowInsets2 = obj10;
                topAppBarColors2 = obj11;
                topAppBarScrollBehavior2 = obj6;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            obj2 = function2;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            function32 = function3;
            if ((i & 57344) != 0) {
            }
            if ((458752 & i) != 0) {
            }
            i6 = i2 & 64;
            if (i6 == 0) {
            }
            if ((2995931 & i3) == 599186) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i9 == 0) {
            }
            if (i4 == 0) {
            }
            if (i5 != 0) {
            }
            if ((i2 & 16) != 0) {
            }
            if ((i2 & 32) != 0) {
            }
            if (i6 == 0) {
            }
            obj9 = function32;
            obj10 = obj3;
            obj11 = obj4;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            int i1022 = i3 << 12;
            composer2 = startRestartGroup;
            m1573TwoRowsTopAppBartjU4iQQ(obj7, title, TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6), TopAppBarLargeTokens.INSTANCE.getHeadlineFont()), LargeTitleBottomPadding, title, TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6), TopAppBarSmallTokens.INSTANCE.getHeadlineFont()), obj8, obj9, obj10, obj11, TopAppBarLargeTokens.INSTANCE.m2767getContainerHeightD9Ej5fM(), TopAppBarSmallTokens.INSTANCE.m2781getContainerHeightD9Ej5fM(), obj6, composer2, ((i3 >> 3) & 14) | CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE | ((i3 << 3) & 112) | (57344 & i1022) | (i1022 & 3670016) | (29360128 & i1022) | (234881024 & i1022) | (i1022 & 1879048192), ((i3 >> 12) & 896) | 54, 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier2 = obj7;
            function22 = obj8;
            function33 = obj9;
            windowInsets2 = obj10;
            topAppBarColors2 = obj11;
            topAppBarScrollBehavior2 = obj6;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        obj = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        obj2 = function2;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        function32 = function3;
        if ((i & 57344) != 0) {
        }
        if ((458752 & i) != 0) {
        }
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        if ((2995931 & i3) == 599186) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i9 == 0) {
        }
        if (i4 == 0) {
        }
        if (i5 != 0) {
        }
        if ((i2 & 16) != 0) {
        }
        if ((i2 & 32) != 0) {
        }
        if (i6 == 0) {
        }
        obj9 = function32;
        obj10 = obj3;
        obj11 = obj4;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        int i10222 = i3 << 12;
        composer2 = startRestartGroup;
        m1573TwoRowsTopAppBartjU4iQQ(obj7, title, TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6), TopAppBarLargeTokens.INSTANCE.getHeadlineFont()), LargeTitleBottomPadding, title, TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6), TopAppBarSmallTokens.INSTANCE.getHeadlineFont()), obj8, obj9, obj10, obj11, TopAppBarLargeTokens.INSTANCE.m2767getContainerHeightD9Ej5fM(), TopAppBarSmallTokens.INSTANCE.m2781getContainerHeightD9Ej5fM(), obj6, composer2, ((i3 >> 3) & 14) | CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE | ((i3 << 3) & 112) | (57344 & i10222) | (i10222 & 3670016) | (29360128 & i10222) | (234881024 & i10222) | (i10222 & 1879048192), ((i3 >> 12) & 896) | 54, 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier2 = obj7;
        function22 = obj8;
        function33 = obj9;
        windowInsets2 = obj10;
        topAppBarColors2 = obj11;
        topAppBarScrollBehavior2 = obj6;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:145:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x012a  */
    /* renamed from: BottomAppBar-Snr_uVM  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1571BottomAppBarSnr_uVM(Function3<? super RowScope, ? super Composer, ? super Integer, Unit> actions, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, long j, long j2, float f, PaddingValues paddingValues, WindowInsets windowInsets, Composer composer, int i, int i2) {
        int i3;
        int i4;
        Object obj;
        long j3;
        long j4;
        int i5;
        float f2;
        int i6;
        Modifier.Companion companion;
        Object obj2;
        long j5;
        long j6;
        WindowInsets windowInsets2;
        int i7;
        PaddingValues paddingValues2;
        PaddingValues paddingValues3;
        Modifier modifier2;
        ScopeUpdateScope endRestartGroup;
        int i8;
        int i9;
        int i10;
        Intrinsics.checkNotNullParameter(actions, "actions");
        Composer startRestartGroup = composer.startRestartGroup(2141738945);
        ComposerKt.sourceInformation(startRestartGroup, "C(BottomAppBar)P(!1,5,4,1:c#ui.graphics.Color,2:c#ui.graphics.Color,6:c#ui.unit.Dp)398@20365L14,399@20407L31,402@20633L12,403@20651L634:AppBar.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changedInstance(actions) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i11 = i2 & 2;
        if (i11 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                obj = function2;
                i3 |= startRestartGroup.changedInstance(obj) ? 256 : 128;
                if ((i & 7168) == 0) {
                    if ((i2 & 8) == 0) {
                        j3 = j;
                        if (startRestartGroup.changed(j3)) {
                            i10 = 2048;
                            i3 |= i10;
                        }
                    } else {
                        j3 = j;
                    }
                    i10 = 1024;
                    i3 |= i10;
                } else {
                    j3 = j;
                }
                if ((i & 57344) == 0) {
                    if ((i2 & 16) == 0) {
                        j4 = j2;
                        if (startRestartGroup.changed(j4)) {
                            i9 = 16384;
                            i3 |= i9;
                        }
                    } else {
                        j4 = j2;
                    }
                    i9 = 8192;
                    i3 |= i9;
                } else {
                    j4 = j2;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    f2 = f;
                } else {
                    f2 = f;
                    if ((i & 458752) == 0) {
                        i3 |= startRestartGroup.changed(f2) ? 131072 : 65536;
                    }
                }
                i6 = i2 & 64;
                if (i6 != 0) {
                    i3 |= 1572864;
                } else if ((i & 3670016) == 0) {
                    i3 |= startRestartGroup.changed(paddingValues) ? 1048576 : 524288;
                }
                if ((i & 29360128) == 0) {
                    if ((i2 & 128) == 0 && startRestartGroup.changed(windowInsets)) {
                        i8 = 8388608;
                        i3 |= i8;
                    }
                    i8 = 4194304;
                    i3 |= i8;
                }
                if ((i3 & 23967451) == 4793490 || !startRestartGroup.getSkipping()) {
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                        companion = i11 != 0 ? Modifier.Companion : modifier;
                        obj2 = i4 != 0 ? null : obj;
                        if ((i2 & 8) != 0) {
                            j5 = BottomAppBarDefaults.INSTANCE.getContainerColor(startRestartGroup, 6);
                            i3 &= -7169;
                        } else {
                            j5 = j3;
                        }
                        if ((i2 & 16) != 0) {
                            j6 = ColorSchemeKt.m1687contentColorForek8zF_U(j5, startRestartGroup, (i3 >> 9) & 14);
                            i3 &= -57345;
                        } else {
                            j6 = j4;
                        }
                        if (i5 != 0) {
                            f2 = BottomAppBarDefaults.INSTANCE.m1584getContainerElevationD9Ej5fM();
                        }
                        PaddingValues contentPadding = i6 != 0 ? BottomAppBarDefaults.INSTANCE.getContentPadding() : paddingValues;
                        if ((i2 & 128) != 0) {
                            i3 &= -29360129;
                            windowInsets2 = BottomAppBarDefaults.INSTANCE.getWindowInsets(startRestartGroup, 6);
                        } else {
                            windowInsets2 = windowInsets;
                        }
                        PaddingValues paddingValues4 = contentPadding;
                        i7 = i3;
                        paddingValues2 = paddingValues4;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                        }
                        if ((i2 & 128) != 0) {
                            i3 &= -29360129;
                        }
                        companion = modifier;
                        windowInsets2 = windowInsets;
                        obj2 = obj;
                        j5 = j3;
                        j6 = j4;
                        i7 = i3;
                        paddingValues2 = paddingValues;
                    }
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2141738945, i7, -1, "androidx.compose.material3.BottomAppBar (AppBar.kt:394)");
                    }
                    ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(startRestartGroup, 1974005449, true, new AppBarKt$BottomAppBar$1(actions, i7, obj2));
                    int i12 = i7 >> 6;
                    m1570BottomAppBar1oL4kX8(companion, j5, j6, f2, paddingValues2, windowInsets2, composableLambda, startRestartGroup, ((i7 >> 3) & 14) | 1572864 | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (i12 & 458752), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    paddingValues3 = paddingValues2;
                    modifier2 = companion;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    modifier2 = modifier;
                    windowInsets2 = windowInsets;
                    obj2 = obj;
                    j5 = j3;
                    j6 = j4;
                    paddingValues3 = paddingValues;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                    return;
                }
                endRestartGroup.updateScope(new AppBarKt$BottomAppBar$2(actions, modifier2, obj2, j5, j6, f2, paddingValues3, windowInsets2, i, i2));
                return;
            }
            obj = function2;
            if ((i & 7168) == 0) {
            }
            if ((i & 57344) == 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            i6 = i2 & 64;
            if (i6 != 0) {
            }
            if ((i & 29360128) == 0) {
            }
            if ((i3 & 23967451) == 4793490) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i11 != 0) {
            }
            if (i4 != 0) {
            }
            if ((i2 & 8) != 0) {
            }
            if ((i2 & 16) != 0) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            if ((i2 & 128) != 0) {
            }
            PaddingValues paddingValues42 = contentPadding;
            i7 = i3;
            paddingValues2 = paddingValues42;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            ComposableLambda composableLambda2 = ComposableLambdaKt.composableLambda(startRestartGroup, 1974005449, true, new AppBarKt$BottomAppBar$1(actions, i7, obj2));
            int i122 = i7 >> 6;
            m1570BottomAppBar1oL4kX8(companion, j5, j6, f2, paddingValues2, windowInsets2, composableLambda2, startRestartGroup, ((i7 >> 3) & 14) | 1572864 | (i122 & 112) | (i122 & 896) | (i122 & 7168) | (57344 & i122) | (i122 & 458752), 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            paddingValues3 = paddingValues2;
            modifier2 = companion;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        obj = function2;
        if ((i & 7168) == 0) {
        }
        if ((i & 57344) == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        i6 = i2 & 64;
        if (i6 != 0) {
        }
        if ((i & 29360128) == 0) {
        }
        if ((i3 & 23967451) == 4793490) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i11 != 0) {
        }
        if (i4 != 0) {
        }
        if ((i2 & 8) != 0) {
        }
        if ((i2 & 16) != 0) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        if ((i2 & 128) != 0) {
        }
        PaddingValues paddingValues422 = contentPadding;
        i7 = i3;
        paddingValues2 = paddingValues422;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        ComposableLambda composableLambda22 = ComposableLambdaKt.composableLambda(startRestartGroup, 1974005449, true, new AppBarKt$BottomAppBar$1(actions, i7, obj2));
        int i1222 = i7 >> 6;
        m1570BottomAppBar1oL4kX8(companion, j5, j6, f2, paddingValues2, windowInsets2, composableLambda22, startRestartGroup, ((i7 >> 3) & 14) | 1572864 | (i1222 & 112) | (i1222 & 896) | (i1222 & 7168) | (57344 & i1222) | (i1222 & 458752), 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        paddingValues3 = paddingValues2;
        modifier2 = companion;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00ff  */
    /* renamed from: BottomAppBar-1oL4kX8  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1570BottomAppBar1oL4kX8(Modifier modifier, long j, long j2, float f, PaddingValues paddingValues, WindowInsets windowInsets, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> content, Composer composer, int i, int i2) {
        int i3;
        long j3;
        long j4;
        float f2;
        int i4;
        Object obj;
        Object obj2;
        int i5;
        Modifier.Companion companion;
        int i6;
        PaddingValues paddingValues2;
        WindowInsets windowInsets2;
        float f3;
        Modifier modifier2;
        ScopeUpdateScope endRestartGroup;
        int i7;
        int i8;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-1391700845);
        ComposerKt.sourceInformation(startRestartGroup, "C(BottomAppBar)P(4,0:c#ui.graphics.Color,2:c#ui.graphics.Color,5:c#ui.unit.Dp,3,6)456@22906L14,457@22948L31,460@23174L12,468@23508L9,463@23241L693:AppBar.kt#uh7d8r");
        int i9 = i2 & 1;
        if (i9 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 112) == 0) {
            if ((i2 & 2) == 0) {
                j3 = j;
                if (startRestartGroup.changed(j3)) {
                    i8 = 32;
                    i3 |= i8;
                }
            } else {
                j3 = j;
            }
            i8 = 16;
            i3 |= i8;
        } else {
            j3 = j;
        }
        if ((i & 896) == 0) {
            if ((i2 & 4) == 0) {
                j4 = j2;
                if (startRestartGroup.changed(j4)) {
                    i7 = 256;
                    i3 |= i7;
                }
            } else {
                j4 = j2;
            }
            i7 = 128;
            i3 |= i7;
        } else {
            j4 = j2;
        }
        int i10 = i2 & 8;
        if (i10 != 0) {
            i3 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
        } else if ((i & 7168) == 0) {
            f2 = f;
            i3 |= startRestartGroup.changed(f2) ? 2048 : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 57344) == 0) {
                obj = paddingValues;
                i3 |= startRestartGroup.changed(obj) ? 16384 : 8192;
                if ((i & 458752) == 0) {
                    obj2 = windowInsets;
                    i3 |= ((i2 & 32) == 0 && startRestartGroup.changed(obj2)) ? 131072 : 65536;
                } else {
                    obj2 = windowInsets;
                }
                if ((i2 & 64) == 0) {
                    if ((i & 3670016) == 0) {
                        i5 = startRestartGroup.changedInstance(content) ? 1048576 : 524288;
                    }
                    if ((i3 & 2995931) == 599186 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            companion = i9 == 0 ? Modifier.Companion : modifier;
                            if ((i2 & 2) != 0) {
                                j3 = BottomAppBarDefaults.INSTANCE.getContainerColor(startRestartGroup, 6);
                                i3 &= -113;
                            }
                            if ((i2 & 4) != 0) {
                                j4 = ColorSchemeKt.m1687contentColorForek8zF_U(j3, startRestartGroup, (i3 >> 3) & 14);
                                i3 &= -897;
                            }
                            if (i10 != 0) {
                                f2 = BottomAppBarDefaults.INSTANCE.m1584getContainerElevationD9Ej5fM();
                            }
                            if (i4 != 0) {
                                obj = BottomAppBarDefaults.INSTANCE.getContentPadding();
                            }
                            if ((i2 & 32) != 0) {
                                i6 = i3 & (-458753);
                                paddingValues2 = obj;
                                windowInsets2 = BottomAppBarDefaults.INSTANCE.getWindowInsets(startRestartGroup, 6);
                                f3 = f2;
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1391700845, i6, -1, "androidx.compose.material3.BottomAppBar (AppBar.kt:454)");
                                }
                                Shape shape = ShapesKt.toShape(BottomAppBarTokens.INSTANCE.getContainerShape(), startRestartGroup, 6);
                                ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(startRestartGroup, -396569832, true, new AppBarKt$BottomAppBar$3(windowInsets2, paddingValues2, content, i6));
                                int i11 = i6 << 3;
                                WindowInsets windowInsets3 = windowInsets2;
                                SurfaceKt.m2067SurfaceT9BRK9s(companion, shape, j3, j4, f3, 0.0f, null, composableLambda, startRestartGroup, (i6 & 14) | 12582912 | (i11 & 896) | (i11 & 7168) | (i11 & 57344), 96);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                f2 = f3;
                                obj2 = windowInsets3;
                                obj = paddingValues2;
                                modifier2 = companion;
                            }
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 2) != 0) {
                                i3 &= -113;
                            }
                            if ((i2 & 4) != 0) {
                                i3 &= -897;
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                            }
                            companion = modifier;
                        }
                        i6 = i3;
                        f3 = f2;
                        paddingValues2 = obj;
                        windowInsets2 = obj2;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        Shape shape2 = ShapesKt.toShape(BottomAppBarTokens.INSTANCE.getContainerShape(), startRestartGroup, 6);
                        ComposableLambda composableLambda2 = ComposableLambdaKt.composableLambda(startRestartGroup, -396569832, true, new AppBarKt$BottomAppBar$3(windowInsets2, paddingValues2, content, i6));
                        int i112 = i6 << 3;
                        WindowInsets windowInsets32 = windowInsets2;
                        SurfaceKt.m2067SurfaceT9BRK9s(companion, shape2, j3, j4, f3, 0.0f, null, composableLambda2, startRestartGroup, (i6 & 14) | 12582912 | (i112 & 896) | (i112 & 7168) | (i112 & 57344), 96);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        f2 = f3;
                        obj2 = windowInsets32;
                        obj = paddingValues2;
                        modifier2 = companion;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier2 = modifier;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                        return;
                    }
                    endRestartGroup.updateScope(new AppBarKt$BottomAppBar$4(modifier2, j3, j4, f2, obj, obj2, content, i, i2));
                    return;
                }
                i5 = 1572864;
                i3 |= i5;
                if ((i3 & 2995931) == 599186) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i9 == 0) {
                }
                if ((i2 & 2) != 0) {
                }
                if ((i2 & 4) != 0) {
                }
                if (i10 != 0) {
                }
                if (i4 != 0) {
                }
                if ((i2 & 32) != 0) {
                }
                i6 = i3;
                f3 = f2;
                paddingValues2 = obj;
                windowInsets2 = obj2;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                Shape shape22 = ShapesKt.toShape(BottomAppBarTokens.INSTANCE.getContainerShape(), startRestartGroup, 6);
                ComposableLambda composableLambda22 = ComposableLambdaKt.composableLambda(startRestartGroup, -396569832, true, new AppBarKt$BottomAppBar$3(windowInsets2, paddingValues2, content, i6));
                int i1122 = i6 << 3;
                WindowInsets windowInsets322 = windowInsets2;
                SurfaceKt.m2067SurfaceT9BRK9s(companion, shape22, j3, j4, f3, 0.0f, null, composableLambda22, startRestartGroup, (i6 & 14) | 12582912 | (i1122 & 896) | (i1122 & 7168) | (i1122 & 57344), 96);
                if (ComposerKt.isTraceInProgress()) {
                }
                f2 = f3;
                obj2 = windowInsets322;
                obj = paddingValues2;
                modifier2 = companion;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            obj = paddingValues;
            if ((i & 458752) == 0) {
            }
            if ((i2 & 64) == 0) {
            }
            i3 |= i5;
            if ((i3 & 2995931) == 599186) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i9 == 0) {
            }
            if ((i2 & 2) != 0) {
            }
            if ((i2 & 4) != 0) {
            }
            if (i10 != 0) {
            }
            if (i4 != 0) {
            }
            if ((i2 & 32) != 0) {
            }
            i6 = i3;
            f3 = f2;
            paddingValues2 = obj;
            windowInsets2 = obj2;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            Shape shape222 = ShapesKt.toShape(BottomAppBarTokens.INSTANCE.getContainerShape(), startRestartGroup, 6);
            ComposableLambda composableLambda222 = ComposableLambdaKt.composableLambda(startRestartGroup, -396569832, true, new AppBarKt$BottomAppBar$3(windowInsets2, paddingValues2, content, i6));
            int i11222 = i6 << 3;
            WindowInsets windowInsets3222 = windowInsets2;
            SurfaceKt.m2067SurfaceT9BRK9s(companion, shape222, j3, j4, f3, 0.0f, null, composableLambda222, startRestartGroup, (i6 & 14) | 12582912 | (i11222 & 896) | (i11222 & 7168) | (i11222 & 57344), 96);
            if (ComposerKt.isTraceInProgress()) {
            }
            f2 = f3;
            obj2 = windowInsets3222;
            obj = paddingValues2;
            modifier2 = companion;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        f2 = f;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        obj = paddingValues;
        if ((i & 458752) == 0) {
        }
        if ((i2 & 64) == 0) {
        }
        i3 |= i5;
        if ((i3 & 2995931) == 599186) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i9 == 0) {
        }
        if ((i2 & 2) != 0) {
        }
        if ((i2 & 4) != 0) {
        }
        if (i10 != 0) {
        }
        if (i4 != 0) {
        }
        if ((i2 & 32) != 0) {
        }
        i6 = i3;
        f3 = f2;
        paddingValues2 = obj;
        windowInsets2 = obj2;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        Shape shape2222 = ShapesKt.toShape(BottomAppBarTokens.INSTANCE.getContainerShape(), startRestartGroup, 6);
        ComposableLambda composableLambda2222 = ComposableLambdaKt.composableLambda(startRestartGroup, -396569832, true, new AppBarKt$BottomAppBar$3(windowInsets2, paddingValues2, content, i6));
        int i112222 = i6 << 3;
        WindowInsets windowInsets32222 = windowInsets2;
        SurfaceKt.m2067SurfaceT9BRK9s(companion, shape2222, j3, j4, f3, 0.0f, null, composableLambda2222, startRestartGroup, (i6 & 14) | 12582912 | (i112222 & 896) | (i112222 & 7168) | (i112222 & 57344), 96);
        if (ComposerKt.isTraceInProgress()) {
        }
        f2 = f3;
        obj2 = windowInsets32222;
        obj = paddingValues2;
        modifier2 = companion;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final TopAppBarState rememberTopAppBarState(float f, float f2, float f3, Composer composer, int i, int i2) {
        composer.startReplaceableGroup(1801969826);
        ComposerKt.sourceInformation(composer, "C(rememberTopAppBarState)P(2,1)799@38640L145,799@38593L192:AppBar.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            f = -3.4028235E38f;
        }
        if ((i2 & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i2 & 4) != 0) {
            f3 = 0.0f;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1801969826, i, -1, "androidx.compose.material3.rememberTopAppBarState (AppBar.kt:794)");
        }
        Object[] objArr = new Object[0];
        Saver<TopAppBarState, ?> saver = TopAppBarState.Companion.getSaver();
        Float valueOf = Float.valueOf(f);
        Float valueOf2 = Float.valueOf(f2);
        Float valueOf3 = Float.valueOf(f3);
        composer.startReplaceableGroup(1618982084);
        ComposerKt.sourceInformation(composer, "CC(remember)P(1,2,3):Composables.kt#9igjgp");
        boolean changed = composer.changed(valueOf) | composer.changed(valueOf2) | composer.changed(valueOf3);
        AppBarKt$rememberTopAppBarState$1$1 rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new AppBarKt$rememberTopAppBarState$1$1(f, f2, f3);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        TopAppBarState topAppBarState = (TopAppBarState) RememberSaveableKt.m2907rememberSaveable(objArr, saver, (String) null, (Function0<? extends Object>) rememberedValue, composer, 72, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return topAppBarState;
    }

    public static final float getBottomAppBarVerticalPadding() {
        return BottomAppBarVerticalPadding;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:145:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SingleRowTopAppBar(Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, TextStyle textStyle, boolean z, Function2<? super Composer, ? super Integer, Unit> function22, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, Composer composer, int i, int i2) {
        Object obj;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean changed;
        AppBarKt$SingleRowTopAppBar$1$1 rememberedValue;
        Modifier.Companion companion;
        TopAppBarState state;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(1841601619);
        ComposerKt.sourceInformation(startRestartGroup, "C(SingleRowTopAppBar)P(3,6,7,1,4!1,8)*1035@47262L7,1036@47335L167,1036@47324L178,1049@48098L24,1048@48048L151,1086@49505L1166:AppBar.kt#uh7d8r");
        int i8 = i2 & 1;
        if (i8 != 0) {
            i3 = i | 6;
            obj = modifier;
        } else if ((i & 14) == 0) {
            obj = modifier;
            i3 = (startRestartGroup.changed(obj) ? 4 : 2) | i;
        } else {
            obj = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= startRestartGroup.changed(textStyle) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
        } else if ((i & 7168) == 0) {
            i3 |= startRestartGroup.changed(z) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((57344 & i) == 0) {
            i3 |= startRestartGroup.changedInstance(function22) ? 16384 : 8192;
        }
        if ((i2 & 32) != 0) {
            i4 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else {
            if ((458752 & i) == 0) {
                i4 = startRestartGroup.changedInstance(function3) ? 131072 : 65536;
            }
            if ((i2 & 64) == 0) {
                i3 |= 1572864;
            } else if ((3670016 & i) == 0) {
                i3 |= startRestartGroup.changed(windowInsets) ? 1048576 : 524288;
            }
            if ((i2 & 128) == 0) {
                i5 = 12582912;
            } else {
                if ((29360128 & i) == 0) {
                    i5 = startRestartGroup.changed(topAppBarColors) ? 8388608 : 4194304;
                }
                if ((i2 & 256) == 0) {
                    if ((234881024 & i) == 0) {
                        i6 = startRestartGroup.changed(topAppBarScrollBehavior) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                    }
                    i7 = i3;
                    if ((191739611 & i7) == 38347922 || !startRestartGroup.getSkipping()) {
                        Modifier.Companion companion2 = i8 == 0 ? Modifier.Companion : obj;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1841601619, i7, -1, "androidx.compose.material3.SingleRowTopAppBar (AppBar.kt:1021)");
                        }
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                        Object consume = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        float f = -((Density) consume).mo588toPx0680j_4(TopAppBarSmallTokens.INSTANCE.m2781getContainerHeightD9Ej5fM());
                        Float valueOf = Float.valueOf(f);
                        startRestartGroup.startReplaceableGroup(511388516);
                        ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
                        changed = startRestartGroup.changed(valueOf) | startRestartGroup.changed(topAppBarScrollBehavior);
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (!changed || rememberedValue == Composer.Companion.getEmpty()) {
                            rememberedValue = new AppBarKt$SingleRowTopAppBar$1$1(topAppBarScrollBehavior, f);
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        startRestartGroup.endReplaceableGroup();
                        EffectsKt.SideEffect((Function0) rememberedValue, startRestartGroup, 0);
                        State<Color> m329animateColorAsStateeuL9pac = SingleValueAnimationKt.m329animateColorAsStateeuL9pac(topAppBarColors.m2261containerColorXeAY9LY$material3_release(((topAppBarScrollBehavior != null || (state = topAppBarScrollBehavior.getState()) == null) ? 0.0f : state.getOverlappedFraction()) <= 0.01f ? 1.0f : 0.0f, startRestartGroup, (i7 >> 18) & 112), AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null), null, null, startRestartGroup, 48, 12);
                        ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(startRestartGroup, 1520880938, true, new AppBarKt$SingleRowTopAppBar$actionsRow$1(function3, i7));
                        startRestartGroup.startReplaceableGroup(-1008376318);
                        ComposerKt.sourceInformation(startRestartGroup, "1066@48747L118,1066@48724L141,1069@48895L255");
                        if (topAppBarScrollBehavior == null && !topAppBarScrollBehavior.isPinned()) {
                            Modifier.Companion companion3 = Modifier.Companion;
                            Orientation orientation = Orientation.Vertical;
                            startRestartGroup.startReplaceableGroup(1157296644);
                            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                            boolean changed2 = startRestartGroup.changed(topAppBarScrollBehavior);
                            AppBarKt$SingleRowTopAppBar$appBarDragModifier$1$1 rememberedValue2 = startRestartGroup.rememberedValue();
                            if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                                rememberedValue2 = new AppBarKt$SingleRowTopAppBar$appBarDragModifier$1$1(topAppBarScrollBehavior);
                                startRestartGroup.updateRememberedValue(rememberedValue2);
                            }
                            startRestartGroup.endReplaceableGroup();
                            DraggableState rememberDraggableState = DraggableKt.rememberDraggableState((Function1) rememberedValue2, startRestartGroup, 0);
                            Modifier.Companion companion4 = companion3;
                            startRestartGroup.startReplaceableGroup(1157296644);
                            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                            boolean changed3 = startRestartGroup.changed(topAppBarScrollBehavior);
                            AppBarKt$SingleRowTopAppBar$appBarDragModifier$2$1 rememberedValue3 = startRestartGroup.rememberedValue();
                            if (changed3 || rememberedValue3 == Composer.Companion.getEmpty()) {
                                rememberedValue3 = new AppBarKt$SingleRowTopAppBar$appBarDragModifier$2$1(topAppBarScrollBehavior, null);
                                startRestartGroup.updateRememberedValue(rememberedValue3);
                            }
                            startRestartGroup.endReplaceableGroup();
                            companion = DraggableKt.draggable$default(companion4, rememberDraggableState, orientation, false, null, false, null, (Function3) rememberedValue3, false, TsExtractor.TS_PACKET_SIZE, null);
                        } else {
                            companion = Modifier.Companion;
                        }
                        startRestartGroup.endReplaceableGroup();
                        Modifier modifier2 = companion2;
                        SurfaceKt.m2067SurfaceT9BRK9s(companion2.then(companion), null, SingleRowTopAppBar$lambda$3(m329animateColorAsStateeuL9pac), 0L, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(startRestartGroup, 376925230, true, new AppBarKt$SingleRowTopAppBar$2(windowInsets, topAppBarColors, function2, textStyle, z, function22, composableLambda, i7, topAppBarScrollBehavior)), startRestartGroup, 12582912, 122);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        obj = modifier2;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                        return;
                    }
                    endRestartGroup.updateScope(new AppBarKt$SingleRowTopAppBar$3(obj, function2, textStyle, z, function22, function3, windowInsets, topAppBarColors, topAppBarScrollBehavior, i, i2));
                    return;
                }
                i6 = 100663296;
                i3 |= i6;
                i7 = i3;
                if ((191739611 & i7) == 38347922) {
                }
                if (i8 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume2 = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                float f2 = -((Density) consume2).mo588toPx0680j_4(TopAppBarSmallTokens.INSTANCE.m2781getContainerHeightD9Ej5fM());
                Float valueOf2 = Float.valueOf(f2);
                startRestartGroup.startReplaceableGroup(511388516);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
                changed = startRestartGroup.changed(valueOf2) | startRestartGroup.changed(topAppBarScrollBehavior);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!changed) {
                }
                rememberedValue = new AppBarKt$SingleRowTopAppBar$1$1(topAppBarScrollBehavior, f2);
                startRestartGroup.updateRememberedValue(rememberedValue);
                startRestartGroup.endReplaceableGroup();
                EffectsKt.SideEffect((Function0) rememberedValue, startRestartGroup, 0);
                State<Color> m329animateColorAsStateeuL9pac2 = SingleValueAnimationKt.m329animateColorAsStateeuL9pac(topAppBarColors.m2261containerColorXeAY9LY$material3_release(((topAppBarScrollBehavior != null || (state = topAppBarScrollBehavior.getState()) == null) ? 0.0f : state.getOverlappedFraction()) <= 0.01f ? 1.0f : 0.0f, startRestartGroup, (i7 >> 18) & 112), AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null), null, null, startRestartGroup, 48, 12);
                ComposableLambda composableLambda2 = ComposableLambdaKt.composableLambda(startRestartGroup, 1520880938, true, new AppBarKt$SingleRowTopAppBar$actionsRow$1(function3, i7));
                startRestartGroup.startReplaceableGroup(-1008376318);
                ComposerKt.sourceInformation(startRestartGroup, "1066@48747L118,1066@48724L141,1069@48895L255");
                if (topAppBarScrollBehavior == null) {
                }
                companion = Modifier.Companion;
                startRestartGroup.endReplaceableGroup();
                Modifier modifier22 = companion2;
                SurfaceKt.m2067SurfaceT9BRK9s(companion2.then(companion), null, SingleRowTopAppBar$lambda$3(m329animateColorAsStateeuL9pac2), 0L, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(startRestartGroup, 376925230, true, new AppBarKt$SingleRowTopAppBar$2(windowInsets, topAppBarColors, function2, textStyle, z, function22, composableLambda2, i7, topAppBarScrollBehavior)), startRestartGroup, 12582912, 122);
                if (ComposerKt.isTraceInProgress()) {
                }
                obj = modifier22;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            i3 |= i5;
            if ((i2 & 256) == 0) {
            }
            i3 |= i6;
            i7 = i3;
            if ((191739611 & i7) == 38347922) {
            }
            if (i8 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume22 = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            float f22 = -((Density) consume22).mo588toPx0680j_4(TopAppBarSmallTokens.INSTANCE.m2781getContainerHeightD9Ej5fM());
            Float valueOf22 = Float.valueOf(f22);
            startRestartGroup.startReplaceableGroup(511388516);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
            changed = startRestartGroup.changed(valueOf22) | startRestartGroup.changed(topAppBarScrollBehavior);
            rememberedValue = startRestartGroup.rememberedValue();
            if (!changed) {
            }
            rememberedValue = new AppBarKt$SingleRowTopAppBar$1$1(topAppBarScrollBehavior, f22);
            startRestartGroup.updateRememberedValue(rememberedValue);
            startRestartGroup.endReplaceableGroup();
            EffectsKt.SideEffect((Function0) rememberedValue, startRestartGroup, 0);
            State<Color> m329animateColorAsStateeuL9pac22 = SingleValueAnimationKt.m329animateColorAsStateeuL9pac(topAppBarColors.m2261containerColorXeAY9LY$material3_release(((topAppBarScrollBehavior != null || (state = topAppBarScrollBehavior.getState()) == null) ? 0.0f : state.getOverlappedFraction()) <= 0.01f ? 1.0f : 0.0f, startRestartGroup, (i7 >> 18) & 112), AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null), null, null, startRestartGroup, 48, 12);
            ComposableLambda composableLambda22 = ComposableLambdaKt.composableLambda(startRestartGroup, 1520880938, true, new AppBarKt$SingleRowTopAppBar$actionsRow$1(function3, i7));
            startRestartGroup.startReplaceableGroup(-1008376318);
            ComposerKt.sourceInformation(startRestartGroup, "1066@48747L118,1066@48724L141,1069@48895L255");
            if (topAppBarScrollBehavior == null) {
            }
            companion = Modifier.Companion;
            startRestartGroup.endReplaceableGroup();
            Modifier modifier222 = companion2;
            SurfaceKt.m2067SurfaceT9BRK9s(companion2.then(companion), null, SingleRowTopAppBar$lambda$3(m329animateColorAsStateeuL9pac22), 0L, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(startRestartGroup, 376925230, true, new AppBarKt$SingleRowTopAppBar$2(windowInsets, topAppBarColors, function2, textStyle, z, function22, composableLambda22, i7, topAppBarScrollBehavior)), startRestartGroup, 12582912, 122);
            if (ComposerKt.isTraceInProgress()) {
            }
            obj = modifier222;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i3 |= i4;
        if ((i2 & 64) == 0) {
        }
        if ((i2 & 128) == 0) {
        }
        i3 |= i5;
        if ((i2 & 256) == 0) {
        }
        i3 |= i6;
        i7 = i3;
        if ((191739611 & i7) == 38347922) {
        }
        if (i8 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume222 = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        float f222 = -((Density) consume222).mo588toPx0680j_4(TopAppBarSmallTokens.INSTANCE.m2781getContainerHeightD9Ej5fM());
        Float valueOf222 = Float.valueOf(f222);
        startRestartGroup.startReplaceableGroup(511388516);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
        changed = startRestartGroup.changed(valueOf222) | startRestartGroup.changed(topAppBarScrollBehavior);
        rememberedValue = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        rememberedValue = new AppBarKt$SingleRowTopAppBar$1$1(topAppBarScrollBehavior, f222);
        startRestartGroup.updateRememberedValue(rememberedValue);
        startRestartGroup.endReplaceableGroup();
        EffectsKt.SideEffect((Function0) rememberedValue, startRestartGroup, 0);
        State<Color> m329animateColorAsStateeuL9pac222 = SingleValueAnimationKt.m329animateColorAsStateeuL9pac(topAppBarColors.m2261containerColorXeAY9LY$material3_release(((topAppBarScrollBehavior != null || (state = topAppBarScrollBehavior.getState()) == null) ? 0.0f : state.getOverlappedFraction()) <= 0.01f ? 1.0f : 0.0f, startRestartGroup, (i7 >> 18) & 112), AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null), null, null, startRestartGroup, 48, 12);
        ComposableLambda composableLambda222 = ComposableLambdaKt.composableLambda(startRestartGroup, 1520880938, true, new AppBarKt$SingleRowTopAppBar$actionsRow$1(function3, i7));
        startRestartGroup.startReplaceableGroup(-1008376318);
        ComposerKt.sourceInformation(startRestartGroup, "1066@48747L118,1066@48724L141,1069@48895L255");
        if (topAppBarScrollBehavior == null) {
        }
        companion = Modifier.Companion;
        startRestartGroup.endReplaceableGroup();
        Modifier modifier2222 = companion2;
        SurfaceKt.m2067SurfaceT9BRK9s(companion2.then(companion), null, SingleRowTopAppBar$lambda$3(m329animateColorAsStateeuL9pac222), 0L, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(startRestartGroup, 376925230, true, new AppBarKt$SingleRowTopAppBar$2(windowInsets, topAppBarColors, function2, textStyle, z, function22, composableLambda222, i7, topAppBarScrollBehavior)), startRestartGroup, 12582912, 122);
        if (ComposerKt.isTraceInProgress()) {
        }
        obj = modifier2222;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0131  */
    /* renamed from: TwoRowsTopAppBar-tjU4iQQ  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1573TwoRowsTopAppBartjU4iQQ(Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, TextStyle textStyle, float f, Function2<? super Composer, ? super Integer, Unit> function22, TextStyle textStyle2, Function2<? super Composer, ? super Integer, Unit> function23, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, WindowInsets windowInsets, TopAppBarColors topAppBarColors, float f2, float f3, TopAppBarScrollBehavior topAppBarScrollBehavior, Composer composer, int i, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        Modifier.Companion companion;
        Composer composer2;
        Modifier modifier2;
        TopAppBarState state;
        Composer startRestartGroup = composer.startRestartGroup(210227552);
        ComposerKt.sourceInformation(startRestartGroup, "C(TwoRowsTopAppBar)P(3,9,11,10:c#ui.unit.Dp,7,8,4!1,12!1,2:c#ui.unit.Dp,5:c#ui.unit.Dp)*1146@51718L7,1154@52031L189,1154@52020L200,1166@52751L39,1166@52723L68,1203@54215L2301:AppBar.kt#uh7d8r");
        int i8 = i3 & 1;
        if (i8 != 0) {
            i4 = i | 6;
        } else if ((i & 14) == 0) {
            i4 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 112) == 0) {
            i4 |= startRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i & 896) == 0) {
            i4 |= startRestartGroup.changed(textStyle) ? 256 : 128;
            if ((i3 & 8) == 0) {
                i4 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
            } else if ((i & 7168) == 0) {
                i4 |= startRestartGroup.changed(f) ? 2048 : 1024;
            }
            if ((i3 & 16) == 0) {
                i4 |= 24576;
            } else if ((57344 & i) == 0) {
                i4 |= startRestartGroup.changedInstance(function22) ? 16384 : 8192;
                if ((i3 & 32) != 0) {
                    i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i & 458752) == 0) {
                    i4 |= startRestartGroup.changed(textStyle2) ? 131072 : 65536;
                }
                if ((i3 & 64) != 0) {
                    i4 |= 1572864;
                } else if ((i & 3670016) == 0) {
                    i4 |= startRestartGroup.changedInstance(function23) ? 1048576 : 524288;
                }
                if ((i3 & 128) != 0) {
                    i5 = 12582912;
                } else {
                    if ((29360128 & i) == 0) {
                        i5 = startRestartGroup.changedInstance(function3) ? 8388608 : 4194304;
                    }
                    if ((i3 & 256) == 0) {
                        i4 |= 100663296;
                    } else if ((234881024 & i) == 0) {
                        i4 |= startRestartGroup.changed(windowInsets) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                        if ((i3 & 512) == 0) {
                            if ((1879048192 & i) == 0) {
                                i6 = startRestartGroup.changed(topAppBarColors) ? 536870912 : 268435456;
                            }
                            if ((i3 & 1024) == 0) {
                                i7 = i2 | 6;
                            } else if ((i2 & 14) == 0) {
                                i7 = i2 | (startRestartGroup.changed(f2) ? 4 : 2);
                            } else {
                                i7 = i2;
                            }
                            if ((i3 & 2048) == 0) {
                                i7 |= 48;
                            } else if ((i2 & 112) == 0) {
                                i7 |= startRestartGroup.changed(f3) ? 32 : 16;
                            }
                            if ((i3 & 4096) == 0) {
                                i7 |= 384;
                            } else if ((i2 & 896) == 0) {
                                i7 |= startRestartGroup.changed(topAppBarScrollBehavior) ? 256 : 128;
                            }
                            if ((1533916891 & i4) == 306783378 || (i7 & 731) != 146 || !startRestartGroup.getSkipping()) {
                                Modifier.Companion companion2 = i8 == 0 ? Modifier.Companion : modifier;
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(210227552, i4, i7, "androidx.compose.material3.TwoRowsTopAppBar (AppBar.kt:1123)");
                                }
                                if (Dp.m5606compareTo0680j_4(f2, f3) > 0) {
                                    throw new IllegalArgumentException("A TwoRowsTopAppBar max height should be greater than its pinned height");
                                }
                                Ref.FloatRef floatRef = new Ref.FloatRef();
                                Ref.FloatRef floatRef2 = new Ref.FloatRef();
                                Ref.IntRef intRef = new Ref.IntRef();
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                Object consume = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                Density density = (Density) consume;
                                floatRef.element = density.mo588toPx0680j_4(f3);
                                floatRef2.element = density.mo588toPx0680j_4(f2);
                                intRef.element = density.mo582roundToPx0680j_4(f);
                                Float valueOf = Float.valueOf(floatRef.element);
                                Float valueOf2 = Float.valueOf(floatRef2.element);
                                startRestartGroup.startReplaceableGroup(1618982084);
                                ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2,3):Composables.kt#9igjgp");
                                boolean changed = startRestartGroup.changed(valueOf) | startRestartGroup.changed(topAppBarScrollBehavior) | startRestartGroup.changed(valueOf2);
                                AppBarKt$TwoRowsTopAppBar$2$1 rememberedValue = startRestartGroup.rememberedValue();
                                if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                                    rememberedValue = new AppBarKt$TwoRowsTopAppBar$2$1(topAppBarScrollBehavior, floatRef, floatRef2);
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                startRestartGroup.endReplaceableGroup();
                                EffectsKt.SideEffect((Function0) rememberedValue, startRestartGroup, 0);
                                float collapsedFraction = (topAppBarScrollBehavior == null || (state = topAppBarScrollBehavior.getState()) == null) ? 0.0f : state.getCollapsedFraction();
                                State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m3281boximpl(topAppBarColors.m2261containerColorXeAY9LY$material3_release(collapsedFraction, startRestartGroup, (i4 >> 24) & 112)), startRestartGroup, 0);
                                ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(startRestartGroup, -1048401111, true, new AppBarKt$TwoRowsTopAppBar$actionsRow$1(function3, i4));
                                float transform = TopTitleAlphaEasing.transform(collapsedFraction);
                                float f4 = 1.0f - collapsedFraction;
                                boolean z = collapsedFraction < 0.5f;
                                boolean z2 = !z;
                                startRestartGroup.startReplaceableGroup(-1609665814);
                                ComposerKt.sourceInformation(startRestartGroup, "1187@53760L118,1187@53737L141,1190@53908L255");
                                if (topAppBarScrollBehavior != null && !topAppBarScrollBehavior.isPinned()) {
                                    Modifier.Companion companion3 = Modifier.Companion;
                                    Orientation orientation = Orientation.Vertical;
                                    startRestartGroup.startReplaceableGroup(1157296644);
                                    ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                                    boolean changed2 = startRestartGroup.changed(topAppBarScrollBehavior);
                                    AppBarKt$TwoRowsTopAppBar$appBarDragModifier$1$1 rememberedValue2 = startRestartGroup.rememberedValue();
                                    if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                                        rememberedValue2 = new AppBarKt$TwoRowsTopAppBar$appBarDragModifier$1$1(topAppBarScrollBehavior);
                                        startRestartGroup.updateRememberedValue(rememberedValue2);
                                    }
                                    startRestartGroup.endReplaceableGroup();
                                    DraggableState rememberDraggableState = DraggableKt.rememberDraggableState((Function1) rememberedValue2, startRestartGroup, 0);
                                    Modifier.Companion companion4 = companion3;
                                    startRestartGroup.startReplaceableGroup(1157296644);
                                    ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                                    boolean changed3 = startRestartGroup.changed(topAppBarScrollBehavior);
                                    AppBarKt$TwoRowsTopAppBar$appBarDragModifier$2$1 rememberedValue3 = startRestartGroup.rememberedValue();
                                    if (changed3 || rememberedValue3 == Composer.Companion.getEmpty()) {
                                        rememberedValue3 = new AppBarKt$TwoRowsTopAppBar$appBarDragModifier$2$1(topAppBarScrollBehavior, null);
                                        startRestartGroup.updateRememberedValue(rememberedValue3);
                                    }
                                    startRestartGroup.endReplaceableGroup();
                                    companion = DraggableKt.draggable$default(companion4, rememberDraggableState, orientation, false, null, false, null, (Function3) rememberedValue3, false, TsExtractor.TS_PACKET_SIZE, null);
                                } else {
                                    companion = Modifier.Companion;
                                }
                                startRestartGroup.endReplaceableGroup();
                                composer2 = startRestartGroup;
                                SurfaceKt.m2067SurfaceT9BRK9s(companion2.then(companion), null, TwoRowsTopAppBar_tjU4iQQ$lambda$8(rememberUpdatedState), 0L, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composer2, 1985938853, true, new AppBarKt$TwoRowsTopAppBar$3(windowInsets, floatRef, topAppBarColors, function22, textStyle2, transform, z, function23, composableLambda, i4, floatRef2, topAppBarScrollBehavior, function2, textStyle, f4, intRef, z2)), composer2, 12582912, 122);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier2 = companion2;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                modifier2 = modifier;
                                composer2 = startRestartGroup;
                            }
                            ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup == null) {
                                return;
                            }
                            endRestartGroup.updateScope(new AppBarKt$TwoRowsTopAppBar$4(modifier2, function2, textStyle, f, function22, textStyle2, function23, function3, windowInsets, topAppBarColors, f2, f3, topAppBarScrollBehavior, i, i2, i3));
                            return;
                        }
                        i6 = C.ENCODING_PCM_32BIT;
                        i4 = i6 | i4;
                        if ((i3 & 1024) == 0) {
                        }
                        if ((i3 & 2048) == 0) {
                        }
                        if ((i3 & 4096) == 0) {
                        }
                        if ((1533916891 & i4) == 306783378) {
                        }
                        if (i8 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        if (Dp.m5606compareTo0680j_4(f2, f3) > 0) {
                        }
                    }
                    if ((i3 & 512) == 0) {
                    }
                    i4 = i6 | i4;
                    if ((i3 & 1024) == 0) {
                    }
                    if ((i3 & 2048) == 0) {
                    }
                    if ((i3 & 4096) == 0) {
                    }
                    if ((1533916891 & i4) == 306783378) {
                    }
                    if (i8 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    if (Dp.m5606compareTo0680j_4(f2, f3) > 0) {
                    }
                }
                i4 |= i5;
                if ((i3 & 256) == 0) {
                }
                if ((i3 & 512) == 0) {
                }
                i4 = i6 | i4;
                if ((i3 & 1024) == 0) {
                }
                if ((i3 & 2048) == 0) {
                }
                if ((i3 & 4096) == 0) {
                }
                if ((1533916891 & i4) == 306783378) {
                }
                if (i8 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                if (Dp.m5606compareTo0680j_4(f2, f3) > 0) {
                }
            }
            if ((i3 & 32) != 0) {
            }
            if ((i3 & 64) != 0) {
            }
            if ((i3 & 128) != 0) {
            }
            i4 |= i5;
            if ((i3 & 256) == 0) {
            }
            if ((i3 & 512) == 0) {
            }
            i4 = i6 | i4;
            if ((i3 & 1024) == 0) {
            }
            if ((i3 & 2048) == 0) {
            }
            if ((i3 & 4096) == 0) {
            }
            if ((1533916891 & i4) == 306783378) {
            }
            if (i8 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            if (Dp.m5606compareTo0680j_4(f2, f3) > 0) {
            }
        }
        if ((i3 & 8) == 0) {
        }
        if ((i3 & 16) == 0) {
        }
        if ((i3 & 32) != 0) {
        }
        if ((i3 & 64) != 0) {
        }
        if ((i3 & 128) != 0) {
        }
        i4 |= i5;
        if ((i3 & 256) == 0) {
        }
        if ((i3 & 512) == 0) {
        }
        i4 = i6 | i4;
        if ((i3 & 1024) == 0) {
        }
        if ((i3 & 2048) == 0) {
        }
        if ((i3 & 4096) == 0) {
        }
        if ((1533916891 & i4) == 306783378) {
        }
        if (i8 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        if (Dp.m5606compareTo0680j_4(f2, f3) > 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: TopAppBarLayout-kXwM9vE  reason: not valid java name */
    public static final void m1572TopAppBarLayoutkXwM9vE(Modifier modifier, final float f, long j, long j2, long j3, Function2<? super Composer, ? super Integer, Unit> function2, TextStyle textStyle, float f2, final Arrangement.Vertical vertical, final Arrangement.Horizontal horizontal, final int i, boolean z, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Composer composer, int i2, int i3) {
        int i4;
        int i5;
        Composer startRestartGroup = composer.startRestartGroup(-6794037);
        ComposerKt.sourceInformation(startRestartGroup, "C(TopAppBarLayout)P(4,2,6:c#ui.graphics.Color,10:c#ui.graphics.Color,0:c#ui.graphics.Color,7,12,8,13,11,9,3,5)1296@58560L4308:AppBar.kt#uh7d8r");
        if ((i2 & 14) == 0) {
            i4 = i2 | (startRestartGroup.changed(modifier) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 112) == 0) {
            i4 |= startRestartGroup.changed(f) ? 32 : 16;
        }
        if ((i2 & 896) == 0) {
            i4 |= startRestartGroup.changed(j) ? 256 : 128;
        }
        if ((i2 & 7168) == 0) {
            i4 |= startRestartGroup.changed(j2) ? 2048 : 1024;
        }
        if ((57344 & i2) == 0) {
            i4 |= startRestartGroup.changed(j3) ? 16384 : 8192;
        }
        if ((458752 & i2) == 0) {
            i4 |= startRestartGroup.changedInstance(function2) ? 131072 : 65536;
        }
        if ((3670016 & i2) == 0) {
            i4 |= startRestartGroup.changed(textStyle) ? 1048576 : 524288;
        }
        if ((29360128 & i2) == 0) {
            i4 |= startRestartGroup.changed(f2) ? 8388608 : 4194304;
        }
        if ((i2 & 234881024) == 0) {
            i4 |= startRestartGroup.changed(vertical) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((i2 & 1879048192) == 0) {
            i4 |= startRestartGroup.changed(horizontal) ? 536870912 : 268435456;
        }
        int i6 = i4;
        if ((i3 & 14) == 0) {
            i5 = i3 | (startRestartGroup.changed(i) ? 4 : 2);
        } else {
            i5 = i3;
        }
        if ((i3 & 112) == 0) {
            i5 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i3 & 896) == 0) {
            i5 |= startRestartGroup.changedInstance(function22) ? 256 : 128;
        }
        if ((i3 & 7168) == 0) {
            i5 |= startRestartGroup.changedInstance(function23) ? 2048 : 1024;
        }
        if ((1533916891 & i6) != 306783378 || (i5 & 5851) != 1170 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-6794037, i6, i5, "androidx.compose.material3.TopAppBarLayout (AppBar.kt:1280)");
            }
            MeasurePolicy measurePolicy = new MeasurePolicy() { // from class: androidx.compose.material3.AppBarKt$TopAppBarLayout$2
                @Override // androidx.compose.ui.layout.MeasurePolicy
                public /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i7) {
                    return MeasurePolicy.CC.$default$maxIntrinsicHeight(this, intrinsicMeasureScope, list, i7);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i7) {
                    return MeasurePolicy.CC.$default$maxIntrinsicWidth(this, intrinsicMeasureScope, list, i7);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i7) {
                    return MeasurePolicy.CC.$default$minIntrinsicHeight(this, intrinsicMeasureScope, list, i7);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i7) {
                    return MeasurePolicy.CC.$default$minIntrinsicWidth(this, intrinsicMeasureScope, list, i7);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                /* renamed from: measure-3p2s80s */
                public final MeasureResult mo272measure3p2s80s(MeasureScope Layout, List<? extends Measurable> measurables, long j4) {
                    int coerceAtLeast;
                    Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
                    Intrinsics.checkNotNullParameter(measurables, "measurables");
                    List<? extends Measurable> list = measurables;
                    for (Measurable measurable : list) {
                        if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable), "navigationIcon")) {
                            Placeable mo4545measureBRTryo0 = measurable.mo4545measureBRTryo0(Constraints.m5542copyZbe2FdA$default(j4, 0, 0, 0, 0, 14, null));
                            for (Measurable measurable2 : list) {
                                if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable2), "actionIcons")) {
                                    Placeable mo4545measureBRTryo02 = measurable2.mo4545measureBRTryo0(Constraints.m5542copyZbe2FdA$default(j4, 0, 0, 0, 0, 14, null));
                                    if (Constraints.m5551getMaxWidthimpl(j4) == Integer.MAX_VALUE) {
                                        coerceAtLeast = Constraints.m5551getMaxWidthimpl(j4);
                                    } else {
                                        coerceAtLeast = RangesKt.coerceAtLeast((Constraints.m5551getMaxWidthimpl(j4) - mo4545measureBRTryo0.getWidth()) - mo4545measureBRTryo02.getWidth(), 0);
                                    }
                                    int i7 = coerceAtLeast;
                                    for (Measurable measurable3 : list) {
                                        if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable3), "title")) {
                                            Placeable mo4545measureBRTryo03 = measurable3.mo4545measureBRTryo0(Constraints.m5542copyZbe2FdA$default(j4, 0, i7, 0, 0, 12, null));
                                            int i8 = mo4545measureBRTryo03.get(AlignmentLineKt.getLastBaseline()) != Integer.MIN_VALUE ? mo4545measureBRTryo03.get(AlignmentLineKt.getLastBaseline()) : 0;
                                            int roundToInt = MathKt.roundToInt(f);
                                            return MeasureScope.CC.layout$default(Layout, Constraints.m5551getMaxWidthimpl(j4), roundToInt, null, new AppBarKt$TopAppBarLayout$2$measure$1(mo4545measureBRTryo0, roundToInt, mo4545measureBRTryo03, horizontal, j4, mo4545measureBRTryo02, Layout, vertical, i, i8), 4, null);
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
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)73@2855L7,74@2910L7,75@2969L7,76@2981L460:Layout.kt#80mrfh");
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Density density = (Density) consume;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume2 = startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            LayoutDirection layoutDirection = (LayoutDirection) consume2;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume3 = startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ViewConfiguration viewConfiguration = (ViewConfiguration) consume3;
            Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(modifier);
            int i7 = ((((i6 << 3) & 112) << 9) & 7168) | 6;
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
            Updater.m2900setimpl(m2893constructorimpl, measurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2900setimpl(m2893constructorimpl, density, ComposeUiNode.Companion.getSetDensity());
            Updater.m2900setimpl(m2893constructorimpl, layoutDirection, ComposeUiNode.Companion.getSetLayoutDirection());
            Updater.m2900setimpl(m2893constructorimpl, viewConfiguration, ComposeUiNode.Companion.getSetViewConfiguration());
            materializerOf.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, Integer.valueOf((i7 >> 3) & 112));
            startRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -290535407, "C1298@58590L352,1308@58955L577,1322@59545L336:AppBar.kt#uh7d8r");
            Modifier layoutId = LayoutIdKt.layoutId(Modifier.Companion, "navigationIcon");
            float f3 = TopAppBarHorizontalPadding;
            Modifier m752paddingqDBjuR0$default = PaddingKt.m752paddingqDBjuR0$default(layoutId, f3, 0.0f, 0.0f, 0.0f, 14, null);
            startRestartGroup.startReplaceableGroup(733328855);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume4 = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Density density2 = (Density) consume4;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume5 = startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            LayoutDirection layoutDirection2 = (LayoutDirection) consume5;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume6 = startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ViewConfiguration viewConfiguration2 = (ViewConfiguration) consume6;
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf2 = LayoutKt.materializerOf(m752paddingqDBjuR0$default);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor2);
            } else {
                startRestartGroup.useNode();
            }
            startRestartGroup.disableReusing();
            Composer m2893constructorimpl2 = Updater.m2893constructorimpl(startRestartGroup);
            Updater.m2900setimpl(m2893constructorimpl2, rememberBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2900setimpl(m2893constructorimpl2, density2, ComposeUiNode.Companion.getSetDensity());
            Updater.m2900setimpl(m2893constructorimpl2, layoutDirection2, ComposeUiNode.Companion.getSetLayoutDirection());
            Updater.m2900setimpl(m2893constructorimpl2, viewConfiguration2, ComposeUiNode.Companion.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf2.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629305, "C72@3384L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1090283935, "C1303@58765L163:AppBar.kt#uh7d8r");
            CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m3281boximpl(j))}, function22, startRestartGroup, ((i5 >> 3) & 112) | 8);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            Modifier m750paddingVpY3zN4$default = PaddingKt.m750paddingVpY3zN4$default(LayoutIdKt.layoutId(Modifier.Companion, "title"), f3, 0.0f, 2, null);
            Modifier.Companion companion = Modifier.Companion;
            if (z) {
                companion = SemanticsModifierKt.clearAndSetSemantics(companion, AppBarKt$TopAppBarLayout$1$2.INSTANCE);
            }
            Modifier m3447graphicsLayerAp8cVGQ$default = GraphicsLayerModifierKt.m3447graphicsLayerAp8cVGQ$default(m750paddingVpY3zN4$default.then(companion), 0.0f, 0.0f, f2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131067, null);
            startRestartGroup.startReplaceableGroup(733328855);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
            MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume7 = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Density density3 = (Density) consume7;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume8 = startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            LayoutDirection layoutDirection3 = (LayoutDirection) consume8;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume9 = startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ViewConfiguration viewConfiguration3 = (ViewConfiguration) consume9;
            Function0<ComposeUiNode> constructor3 = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf3 = LayoutKt.materializerOf(m3447graphicsLayerAp8cVGQ$default);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor3);
            } else {
                startRestartGroup.useNode();
            }
            startRestartGroup.disableReusing();
            Composer m2893constructorimpl3 = Updater.m2893constructorimpl(startRestartGroup);
            Updater.m2900setimpl(m2893constructorimpl3, rememberBoxMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2900setimpl(m2893constructorimpl3, density3, ComposeUiNode.Companion.getSetDensity());
            Updater.m2900setimpl(m2893constructorimpl3, layoutDirection3, ComposeUiNode.Companion.getSetLayoutDirection());
            Updater.m2900setimpl(m2893constructorimpl3, viewConfiguration3, ComposeUiNode.Companion.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf3.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629305, "C72@3384L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1090283420, "C1315@59280L238:AppBar.kt#uh7d8r");
            TextKt.ProvideTextStyle(textStyle, ComposableLambdaKt.composableLambda(startRestartGroup, 824316656, true, new AppBarKt$TopAppBarLayout$1$3$1(j2, function2, i6)), startRestartGroup, ((i6 >> 18) & 14) | 48);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            Modifier m752paddingqDBjuR0$default2 = PaddingKt.m752paddingqDBjuR0$default(LayoutIdKt.layoutId(Modifier.Companion, "actionIcons"), 0.0f, 0.0f, f3, 0.0f, 11, null);
            startRestartGroup.startReplaceableGroup(733328855);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
            MeasurePolicy rememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume10 = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Density density4 = (Density) consume10;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume11 = startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            LayoutDirection layoutDirection4 = (LayoutDirection) consume11;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume12 = startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ViewConfiguration viewConfiguration4 = (ViewConfiguration) consume12;
            Function0<ComposeUiNode> constructor4 = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf4 = LayoutKt.materializerOf(m752paddingqDBjuR0$default2);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor4);
            } else {
                startRestartGroup.useNode();
            }
            startRestartGroup.disableReusing();
            Composer m2893constructorimpl4 = Updater.m2893constructorimpl(startRestartGroup);
            Updater.m2900setimpl(m2893constructorimpl4, rememberBoxMeasurePolicy3, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2900setimpl(m2893constructorimpl4, density4, ComposeUiNode.Companion.getSetDensity());
            Updater.m2900setimpl(m2893constructorimpl4, layoutDirection4, ComposeUiNode.Companion.getSetLayoutDirection());
            Updater.m2900setimpl(m2893constructorimpl4, viewConfiguration4, ComposeUiNode.Companion.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf4.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629305, "C72@3384L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1090282985, "C1327@59715L152:AppBar.kt#uh7d8r");
            CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m3281boximpl(j3))}, function23, startRestartGroup, ((i5 >> 6) & 112) | 8);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
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
        endRestartGroup.updateScope(new AppBarKt$TopAppBarLayout$3(modifier, f, j, j2, j3, function2, textStyle, f2, vertical, horizontal, i, z, function22, function23, i2, i3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x011a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object settleAppBar(TopAppBarState topAppBarState, float f, DecayAnimationSpec<Float> decayAnimationSpec, AnimationSpec<Float> animationSpec, Continuation<? super Velocity> continuation) {
        AppBarKt$settleAppBar$1 appBarKt$settleAppBar$1;
        Object coroutine_suspended;
        int i;
        Ref.FloatRef floatRef;
        AnimationSpec<Float> animationSpec2;
        AnimationSpec<Float> animationSpec3;
        AnimationState AnimationState$default;
        float heightOffsetLimit;
        Ref.FloatRef floatRef2;
        TopAppBarState topAppBarState2 = topAppBarState;
        if (continuation instanceof AppBarKt$settleAppBar$1) {
            appBarKt$settleAppBar$1 = (AppBarKt$settleAppBar$1) continuation;
            if ((appBarKt$settleAppBar$1.label & Integer.MIN_VALUE) != 0) {
                appBarKt$settleAppBar$1.label -= Integer.MIN_VALUE;
                Object obj = appBarKt$settleAppBar$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = appBarKt$settleAppBar$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (topAppBarState.getCollapsedFraction() >= 0.01f) {
                        if (!(topAppBarState.getCollapsedFraction() == 1.0f)) {
                            floatRef = new Ref.FloatRef();
                            floatRef.element = f;
                            if (decayAnimationSpec == null || Math.abs(f) <= 1.0f) {
                                animationSpec2 = animationSpec;
                            } else {
                                Ref.FloatRef floatRef3 = new Ref.FloatRef();
                                appBarKt$settleAppBar$1.L$0 = topAppBarState2;
                                animationSpec2 = animationSpec;
                                appBarKt$settleAppBar$1.L$1 = animationSpec2;
                                appBarKt$settleAppBar$1.L$2 = floatRef;
                                appBarKt$settleAppBar$1.label = 1;
                                if (SuspendAnimationKt.animateDecay$default(AnimationStateKt.AnimationState$default(0.0f, f, 0L, 0L, false, 28, null), decayAnimationSpec, false, new AppBarKt$settleAppBar$2(floatRef3, topAppBarState2, floatRef), appBarKt$settleAppBar$1, 2, null) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                        }
                    }
                    return Velocity.m5823boximpl(Velocity.Companion.m5843getZero9UxMQ8M());
                } else if (i != 1) {
                    if (i == 2) {
                        floatRef2 = (Ref.FloatRef) appBarKt$settleAppBar$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        floatRef = floatRef2;
                        return Velocity.m5823boximpl(VelocityKt.Velocity(0.0f, floatRef.element));
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ResultKt.throwOnFailure(obj);
                    floatRef = (Ref.FloatRef) appBarKt$settleAppBar$1.L$2;
                    animationSpec2 = (AnimationSpec) appBarKt$settleAppBar$1.L$1;
                    topAppBarState2 = (TopAppBarState) appBarKt$settleAppBar$1.L$0;
                }
                animationSpec3 = animationSpec2;
                if (animationSpec3 != null && topAppBarState2.getHeightOffset() < 0.0f && topAppBarState2.getHeightOffset() > topAppBarState2.getHeightOffsetLimit()) {
                    AnimationState$default = AnimationStateKt.AnimationState$default(topAppBarState2.getHeightOffset(), 0.0f, 0L, 0L, false, 30, null);
                    heightOffsetLimit = topAppBarState2.getCollapsedFraction() >= 0.5f ? 0.0f : topAppBarState2.getHeightOffsetLimit();
                    appBarKt$settleAppBar$1.L$0 = floatRef;
                    appBarKt$settleAppBar$1.L$1 = null;
                    appBarKt$settleAppBar$1.L$2 = null;
                    appBarKt$settleAppBar$1.label = 2;
                    if (SuspendAnimationKt.animateTo$default(AnimationState$default, Boxing.boxFloat(heightOffsetLimit), animationSpec3, false, new AppBarKt$settleAppBar$3(topAppBarState2), appBarKt$settleAppBar$1, 4, null) != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    floatRef2 = floatRef;
                    floatRef = floatRef2;
                }
                return Velocity.m5823boximpl(VelocityKt.Velocity(0.0f, floatRef.element));
            }
        }
        appBarKt$settleAppBar$1 = new AppBarKt$settleAppBar$1(continuation);
        Object obj2 = appBarKt$settleAppBar$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = appBarKt$settleAppBar$1.label;
        if (i != 0) {
        }
        animationSpec3 = animationSpec2;
        if (animationSpec3 != null) {
            AnimationState$default = AnimationStateKt.AnimationState$default(topAppBarState2.getHeightOffset(), 0.0f, 0L, 0L, false, 30, null);
            if (topAppBarState2.getCollapsedFraction() >= 0.5f) {
            }
            appBarKt$settleAppBar$1.L$0 = floatRef;
            appBarKt$settleAppBar$1.L$1 = null;
            appBarKt$settleAppBar$1.L$2 = null;
            appBarKt$settleAppBar$1.label = 2;
            if (SuspendAnimationKt.animateTo$default(AnimationState$default, Boxing.boxFloat(heightOffsetLimit), animationSpec3, false, new AppBarKt$settleAppBar$3(topAppBarState2), appBarKt$settleAppBar$1, 4, null) != coroutine_suspended) {
            }
        }
        return Velocity.m5823boximpl(VelocityKt.Velocity(0.0f, floatRef.element));
    }

    public static final CubicBezierEasing getTopTitleAlphaEasing() {
        return TopTitleAlphaEasing;
    }

    private static final long SingleRowTopAppBar$lambda$3(State<Color> state) {
        return state.getValue().m3301unboximpl();
    }

    private static final long TwoRowsTopAppBar_tjU4iQQ$lambda$8(State<Color> state) {
        return state.getValue().m3301unboximpl();
    }

    static {
        float f = 16;
        float f2 = 12;
        float m5607constructorimpl = Dp.m5607constructorimpl(Dp.m5607constructorimpl(f) - Dp.m5607constructorimpl(f2));
        BottomAppBarHorizontalPadding = m5607constructorimpl;
        float m5607constructorimpl2 = Dp.m5607constructorimpl(Dp.m5607constructorimpl(f) - Dp.m5607constructorimpl(f2));
        BottomAppBarVerticalPadding = m5607constructorimpl2;
        FABHorizontalPadding = Dp.m5607constructorimpl(Dp.m5607constructorimpl(f) - m5607constructorimpl);
        FABVerticalPadding = Dp.m5607constructorimpl(Dp.m5607constructorimpl(f2) - m5607constructorimpl2);
        TopTitleAlphaEasing = new CubicBezierEasing(0.8f, 0.0f, 0.8f, 0.15f);
        MediumTitleBottomPadding = Dp.m5607constructorimpl(24);
        LargeTitleBottomPadding = Dp.m5607constructorimpl(28);
        float m5607constructorimpl3 = Dp.m5607constructorimpl(4);
        TopAppBarHorizontalPadding = m5607constructorimpl3;
        TopAppBarTitleInset = Dp.m5607constructorimpl(Dp.m5607constructorimpl(f) - m5607constructorimpl3);
    }
}
