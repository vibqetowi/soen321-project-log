package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.material.AnchoredDraggableState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ifriend.keychain.cipherStorage.CipherStorageKeystoreRsaEcb;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: BottomSheetScaffold.kt */
@Metadata(d1 = {"\u0000Ä\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u009c\u0001\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2-\u0010\u000b\u001a)\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u00110\f2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\u001c\u0010\u001c\u001a\u0018\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00060\f¢\u0006\u0002\b\u001e¢\u0006\u0002\b\u001fH\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b \u0010!\u001aá\u0002\u0010\"\u001a\u00020\u00062\u001c\u0010#\u001a\u0018\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00060\f¢\u0006\u0002\b\u001e¢\u0006\u0002\b\u001f2\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010$\u001a\u00020%2\u0015\b\u0002\u0010&\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010'¢\u0006\u0002\b\u001e2\u0019\b\u0002\u0010(\u001a\u0013\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u00060\f¢\u0006\u0002\b\u001e2\u0015\b\u0002\u0010*\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010'¢\u0006\u0002\b\u001e2\b\b\u0002\u0010+\u001a\u00020,2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00012\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010-\u001a\u00020\u00012 \b\u0002\u0010.\u001a\u001a\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u0006\u0018\u00010\f¢\u0006\u0002\b\u001e¢\u0006\u0002\b\u001f2\b\b\u0002\u0010/\u001a\u00020\n2\b\b\u0002\u00100\u001a\u00020\u00152\b\b\u0002\u00101\u001a\u00020\u00012\b\b\u0002\u00102\u001a\u00020\u00182\b\b\u0002\u00103\u001a\u00020\u00182\b\b\u0002\u00104\u001a\u00020\u00182\b\b\u0002\u00105\u001a\u00020\u00182\b\b\u0002\u00106\u001a\u00020\u00182\u0017\u0010\u001c\u001a\u0013\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020\u00060\f¢\u0006\u0002\b\u001eH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b8\u00109\u001a\u001e\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00120;2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010<\u001a\u00020=H\u0002\u001aÈ\u0001\u0010>\u001a\u00020\u00062\u0013\u0010&\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010'¢\u0006\u0002\b\u001e2&\u0010?\u001a\"\u0012\u0013\u0012\u001107¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(@\u0012\u0004\u0012\u00020\u00060\f¢\u0006\u0002\b\u001e2&\u0010A\u001a\"\u0012\u0013\u0012\u00110B¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(C\u0012\u0004\u0012\u00020\u00060\f¢\u0006\u0002\b\u001e2\u0013\u0010*\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010'¢\u0006\u0002\b\u001e2\u0011\u0010(\u001a\r\u0012\u0004\u0012\u00020\u00060'¢\u0006\u0002\b\u001e2\u0006\u0010-\u001a\u00020\u00012\u0006\u0010+\u001a\u00020,2\f\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00130'2\u0006\u0010E\u001a\u00020\bH\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bF\u0010G\u001a4\u0010H\u001a\u00020\b2\u0006\u0010I\u001a\u00020\u00122\u000e\b\u0002\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00130K2\u0012\u0010L\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\n0\fH\u0007\u001a>\u0010M\u001a\u00020\b2\u0006\u0010I\u001a\u00020\u00122\u0006\u0010N\u001a\u00020O2\u000e\b\u0002\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00130K2\u0014\b\u0002\u0010P\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\n0\fH\u0007\u001a\u001c\u0010Q\u001a\u00020R2\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030S2\u0006\u0010T\u001a\u00020UH\u0002\u001a+\u0010V\u001a\u00020%2\b\b\u0002\u0010W\u001a\u00020X2\b\b\u0002\u0010Y\u001a\u00020\b2\b\b\u0002\u0010Z\u001a\u00020)H\u0007¢\u0006\u0002\u0010[\u001a;\u0010\\\u001a\u00020\b2\u0006\u0010I\u001a\u00020\u00122\u000e\b\u0002\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00130K2\u0014\b\u0002\u0010L\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\n0\fH\u0007¢\u0006\u0002\u0010]\"\u0013\u0010\u0000\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0003\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0004\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006^"}, d2 = {"BottomSheetScaffoldPositionalThreshold", "Landroidx/compose/ui/unit/Dp;", "F", "BottomSheetScaffoldVelocityThreshold", "FabSpacing", "BottomSheet", "", "state", "Landroidx/compose/material/BottomSheetState;", "sheetGesturesEnabled", "", "calculateAnchors", "Lkotlin/Function1;", "Landroidx/compose/ui/unit/IntSize;", "Lkotlin/ParameterName;", "name", "sheetSize", "", "Landroidx/compose/material/BottomSheetValue;", "", "sheetShape", "Landroidx/compose/ui/graphics/Shape;", "sheetElevation", "sheetBackgroundColor", "Landroidx/compose/ui/graphics/Color;", "sheetContentColor", "modifier", "Landroidx/compose/ui/Modifier;", FirebaseAnalytics.Param.CONTENT, "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "BottomSheet-0cLKjW4", "(Landroidx/compose/material/BottomSheetState;ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/graphics/Shape;FJJLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "BottomSheetScaffold", "sheetContent", "scaffoldState", "Landroidx/compose/material/BottomSheetScaffoldState;", "topBar", "Lkotlin/Function0;", "snackbarHost", "Landroidx/compose/material/SnackbarHostState;", "floatingActionButton", "floatingActionButtonPosition", "Landroidx/compose/material/FabPosition;", "sheetPeekHeight", "drawerContent", "drawerGesturesEnabled", "drawerShape", "drawerElevation", "drawerBackgroundColor", "drawerContentColor", "drawerScrimColor", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "contentColor", "Landroidx/compose/foundation/layout/PaddingValues;", "BottomSheetScaffold-bGncdBI", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Landroidx/compose/material/BottomSheetScaffoldState;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;IZLandroidx/compose/ui/graphics/Shape;FJJFLkotlin/jvm/functions/Function3;ZLandroidx/compose/ui/graphics/Shape;FJJJJJLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;IIII)V", "BottomSheetScaffoldAnchorChangeCallback", "Landroidx/compose/material/AnchoredDraggableState$AnchorChangedCallback;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "BottomSheetScaffoldLayout", TtmlNode.TAG_BODY, "innerPadding", "bottomSheet", "", "layoutHeight", "sheetOffset", "sheetState", "BottomSheetScaffoldLayout-KCBPh4w", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;FILkotlin/jvm/functions/Function0;Landroidx/compose/material/BottomSheetState;Landroidx/compose/runtime/Composer;I)V", "BottomSheetScaffoldState", "initialValue", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "confirmStateChange", "BottomSheetState", "density", "Landroidx/compose/ui/unit/Density;", "confirmValueChange", "ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "Landroidx/compose/material/AnchoredDraggableState;", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "rememberBottomSheetScaffoldState", "drawerState", "Landroidx/compose/material/DrawerState;", "bottomSheetState", "snackbarHostState", "(Landroidx/compose/material/DrawerState;Landroidx/compose/material/BottomSheetState;Landroidx/compose/material/SnackbarHostState;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/BottomSheetScaffoldState;", "rememberBottomSheetState", "(Landroidx/compose/material/BottomSheetValue;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/BottomSheetState;", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BottomSheetScaffoldKt {
    private static final float FabSpacing = Dp.m5607constructorimpl(16);
    private static final float BottomSheetScaffoldPositionalThreshold = Dp.m5607constructorimpl(56);
    private static final float BottomSheetScaffoldVelocityThreshold = Dp.m5607constructorimpl(125);

    public static /* synthetic */ BottomSheetState BottomSheetScaffoldState$default(BottomSheetValue bottomSheetValue, AnimationSpec animationSpec, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            animationSpec = SwipeableDefaults.INSTANCE.getAnimationSpec();
        }
        return BottomSheetScaffoldState(bottomSheetValue, animationSpec, function1);
    }

    @Deprecated(message = "This constructor is deprecated. confirmStateChange has been renamed to confirmValueChange.", replaceWith = @ReplaceWith(expression = "BottomSheetScaffoldState(initialValue, animationSpec, confirmStateChange)", imports = {}))
    public static final BottomSheetState BottomSheetScaffoldState(BottomSheetValue initialValue, AnimationSpec<Float> animationSpec, Function1<? super BottomSheetValue, Boolean> confirmStateChange) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(confirmStateChange, "confirmStateChange");
        return new BottomSheetState(initialValue, animationSpec, confirmStateChange);
    }

    public static /* synthetic */ BottomSheetState BottomSheetState$default(BottomSheetValue bottomSheetValue, Density density, AnimationSpec animationSpec, Function1 function1, int i, Object obj) {
        if ((i & 4) != 0) {
            animationSpec = SwipeableDefaults.INSTANCE.getAnimationSpec();
        }
        if ((i & 8) != 0) {
            function1 = BottomSheetScaffoldKt$BottomSheetState$1.INSTANCE;
        }
        return BottomSheetState(bottomSheetValue, density, animationSpec, function1);
    }

    public static final BottomSheetState BottomSheetState(BottomSheetValue initialValue, Density density, AnimationSpec<Float> animationSpec, Function1<? super BottomSheetValue, Boolean> confirmValueChange) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(confirmValueChange, "confirmValueChange");
        BottomSheetState bottomSheetState = new BottomSheetState(initialValue, animationSpec, confirmValueChange);
        bottomSheetState.setDensity$material_release(density);
        return bottomSheetState;
    }

    public static final BottomSheetState rememberBottomSheetState(BottomSheetValue initialValue, AnimationSpec<Float> animationSpec, Function1<? super BottomSheetValue, Boolean> function1, Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        composer.startReplaceableGroup(1808153344);
        ComposerKt.sourceInformation(composer, "C(rememberBottomSheetState)P(2)308@11241L7,309@11260L433:BottomSheetScaffold.kt#jmzs0o");
        if ((i2 & 2) != 0) {
            animationSpec = SwipeableDefaults.INSTANCE.getAnimationSpec();
        }
        if ((i2 & 4) != 0) {
            function1 = BottomSheetScaffoldKt$rememberBottomSheetState$1.INSTANCE;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1808153344, i, -1, "androidx.compose.material.rememberBottomSheetState (BottomSheetScaffold.kt:303)");
        }
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume = composer.consume(CompositionLocalsKt.getLocalDensity());
        ComposerKt.sourceInformationMarkerEnd(composer);
        Density density = (Density) consume;
        BottomSheetState bottomSheetState = (BottomSheetState) RememberSaveableKt.m2907rememberSaveable(new Object[]{animationSpec}, BottomSheetState.Companion.Saver(animationSpec, function1, density), (String) null, (Function0<? extends Object>) new BottomSheetScaffoldKt$rememberBottomSheetState$2(initialValue, density, animationSpec, function1), composer, 72, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return bottomSheetState;
    }

    public static final BottomSheetScaffoldState rememberBottomSheetScaffoldState(DrawerState drawerState, BottomSheetState bottomSheetState, SnackbarHostState snackbarHostState, Composer composer, int i, int i2) {
        composer.startReplaceableGroup(-1353009744);
        ComposerKt.sourceInformation(composer, "C(rememberBottomSheetScaffoldState)P(1)351@12567L39,352@12649L35,353@12729L32,355@12803L248:BottomSheetScaffold.kt#jmzs0o");
        if ((i2 & 1) != 0) {
            drawerState = DrawerKt.rememberDrawerState(DrawerValue.Closed, null, composer, 6, 2);
        }
        if ((i2 & 2) != 0) {
            bottomSheetState = rememberBottomSheetState(BottomSheetValue.Collapsed, null, null, composer, 6, 6);
        }
        if ((i2 & 4) != 0) {
            composer.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(composer, "CC(remember):Composables.kt#9igjgp");
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new SnackbarHostState();
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            snackbarHostState = (SnackbarHostState) rememberedValue;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1353009744, i, -1, "androidx.compose.material.rememberBottomSheetScaffoldState (BottomSheetScaffold.kt:350)");
        }
        composer.startReplaceableGroup(1618982084);
        ComposerKt.sourceInformation(composer, "CC(remember)P(1,2,3):Composables.kt#9igjgp");
        boolean changed = composer.changed(drawerState) | composer.changed(bottomSheetState) | composer.changed(snackbarHostState);
        Object rememberedValue2 = composer.rememberedValue();
        if (changed || rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = new BottomSheetScaffoldState(drawerState, bottomSheetState, snackbarHostState);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        BottomSheetScaffoldState bottomSheetScaffoldState = (BottomSheetScaffoldState) rememberedValue2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return bottomSheetScaffoldState;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x041d  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x047d  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0481  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0484  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x048f  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x04a4  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x04aa  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x04b7  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x04ce  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x04d9  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x04e4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x04ea  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x04fb  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x0506  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x0515  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x051c  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x053a  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x055c  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x057a  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x0672  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x0697  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:381:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0140  */
    /* renamed from: BottomSheetScaffold-bGncdBI  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1267BottomSheetScaffoldbGncdBI(Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> sheetContent, Modifier modifier, BottomSheetScaffoldState bottomSheetScaffoldState, Function2<? super Composer, ? super Integer, Unit> function2, Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function22, int i, boolean z, Shape shape, float f, long j, long j2, float f2, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function32, boolean z2, Shape shape2, float f3, long j3, long j4, long j5, long j6, long j7, Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> content, Composer composer, int i2, int i3, int i4, int i5) {
        int i6;
        BottomSheetScaffoldState bottomSheetScaffoldState2;
        int i7;
        int i8;
        Object obj;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        long j8;
        int i22;
        Function2<? super Composer, ? super Integer, Unit> function23;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        BottomSheetScaffoldState bottomSheetScaffoldState3;
        Function2<? super Composer, ? super Integer, Unit> function24;
        Function3<SnackbarHostState, Composer, Integer, Unit> m1334getLambda1$material_release;
        Function2<? super Composer, ? super Integer, Unit> function25;
        int m1380getEnd5ygKITE;
        boolean z3;
        CornerBasedShape cornerBasedShape;
        float m1264getSheetElevationD9Ej5fM;
        Shape shape3;
        BottomSheetScaffoldState bottomSheetScaffoldState4;
        long j9;
        long j10;
        boolean z4;
        long j11;
        CornerBasedShape cornerBasedShape2;
        Shape shape4;
        float f4;
        long j12;
        long j13;
        long j14;
        int i29;
        long j15;
        long j16;
        Shape shape5;
        float f5;
        Shape shape6;
        long j17;
        long j18;
        Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function33;
        Modifier modifier2;
        int i30;
        int i31;
        float f6;
        long j19;
        Modifier modifier3;
        boolean z5;
        Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function34;
        float f7;
        Shape shape7;
        float f8;
        long j20;
        long j21;
        float f9;
        long j22;
        long j23;
        long j24;
        Shape shape8;
        BottomSheetScaffoldState bottomSheetScaffoldState5;
        ScopeUpdateScope endRestartGroup;
        int i32;
        int i33;
        Intrinsics.checkNotNullParameter(sheetContent, "sheetContent");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(46422755);
        ComposerKt.sourceInformation(startRestartGroup, "C(BottomSheetScaffold)P(15,12,13,22,21,10,11:c#material.FabPosition,18,20,17:c#ui.unit.Dp,14:c#ui.graphics.Color,16:c#ui.graphics.Color,19:c#ui.unit.Dp,4,7,9,6:c#ui.unit.Dp,3:c#ui.graphics.Color,5:c#ui.graphics.Color,8:c#ui.graphics.Color,0:c#ui.graphics.Color,2:c#ui.graphics.Color)417@16492L34,423@16861L6,425@16992L6,426@17039L37,430@17296L6,432@17411L6,433@17459L38,434@17544L10,435@17599L6,436@17644L32,*447@18055L7,499@20525L713:BottomSheetScaffold.kt#jmzs0o");
        if ((i5 & 1) != 0) {
            i6 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i6 = (startRestartGroup.changedInstance(sheetContent) ? 4 : 2) | i2;
        } else {
            i6 = i2;
        }
        int i34 = i5 & 2;
        if (i34 != 0) {
            i6 |= 48;
        } else if ((i2 & 112) == 0) {
            i6 |= startRestartGroup.changed(modifier) ? 32 : 16;
            if ((i2 & 896) != 0) {
                if ((i5 & 4) == 0) {
                    bottomSheetScaffoldState2 = bottomSheetScaffoldState;
                    if (startRestartGroup.changed(bottomSheetScaffoldState2)) {
                        i33 = 256;
                        i6 |= i33;
                    }
                } else {
                    bottomSheetScaffoldState2 = bottomSheetScaffoldState;
                }
                i33 = 128;
                i6 |= i33;
            } else {
                bottomSheetScaffoldState2 = bottomSheetScaffoldState;
            }
            i7 = i5 & 8;
            if (i7 == 0) {
                i6 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
            } else if ((i2 & 7168) == 0) {
                i6 |= startRestartGroup.changedInstance(function2) ? 2048 : 1024;
                i8 = i5 & 16;
                if (i8 != 0) {
                    i6 |= 24576;
                    obj = function3;
                } else {
                    obj = function3;
                    if ((i2 & 57344) == 0) {
                        i6 |= startRestartGroup.changedInstance(obj) ? 16384 : 8192;
                    }
                }
                i9 = i5 & 32;
                if (i9 != 0) {
                    i6 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i2 & 458752) == 0) {
                    i6 |= startRestartGroup.changedInstance(function22) ? 131072 : 65536;
                }
                i10 = i5 & 64;
                if (i10 != 0) {
                    i6 |= 1572864;
                } else if ((i2 & 3670016) == 0) {
                    i6 |= startRestartGroup.changed(i) ? 1048576 : 524288;
                }
                i11 = i5 & 128;
                if (i11 != 0) {
                    i6 |= 12582912;
                } else if ((i2 & 29360128) == 0) {
                    i12 = i11;
                    i6 |= startRestartGroup.changed(z) ? 8388608 : 4194304;
                    if ((i2 & 234881024) == 0) {
                        if ((i5 & 256) == 0 && startRestartGroup.changed(shape)) {
                            i32 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                            i6 |= i32;
                        }
                        i32 = 33554432;
                        i6 |= i32;
                    }
                    i13 = i5 & 512;
                    if (i13 == 0) {
                        i6 |= C.ENCODING_PCM_32BIT;
                    } else if ((i2 & 1879048192) == 0) {
                        i14 = i13;
                        i6 |= startRestartGroup.changed(f) ? 536870912 : 268435456;
                        if ((i3 & 14) == 0) {
                            i15 = (((i5 & 1024) == 0 && startRestartGroup.changed(j)) ? 4 : 2) | i3;
                        } else {
                            i15 = i3;
                        }
                        if ((i3 & 112) == 0) {
                            i15 |= ((i5 & 2048) == 0 && startRestartGroup.changed(j2)) ? 32 : 16;
                        }
                        i16 = i5 & 4096;
                        if (i16 != 0) {
                            i15 |= 384;
                        } else if ((i3 & 896) == 0) {
                            i15 |= startRestartGroup.changed(f2) ? 256 : 128;
                            i17 = i5 & 8192;
                            if (i17 == 0) {
                                i15 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
                            } else if ((i3 & 7168) == 0) {
                                i15 |= startRestartGroup.changedInstance(function32) ? 2048 : 1024;
                                i18 = i5 & 16384;
                                if (i18 != 0) {
                                    i15 |= 24576;
                                } else if ((i3 & 57344) == 0) {
                                    i19 = i18;
                                    i15 |= startRestartGroup.changed(z2) ? 16384 : 8192;
                                    if ((i3 & 458752) == 0) {
                                        i15 |= ((i5 & 32768) == 0 && startRestartGroup.changed(shape2)) ? 131072 : 65536;
                                    }
                                    i20 = i5 & 65536;
                                    if (i20 == 0) {
                                        i15 |= 1572864;
                                    } else if ((i3 & 3670016) == 0) {
                                        i15 |= startRestartGroup.changed(f3) ? 1048576 : 524288;
                                    }
                                    if ((i3 & 29360128) == 0) {
                                        i15 |= ((i5 & 131072) == 0 && startRestartGroup.changed(j3)) ? 8388608 : 4194304;
                                    }
                                    if ((i3 & 234881024) == 0) {
                                        i15 |= ((i5 & 262144) == 0 && startRestartGroup.changed(j4)) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                                    }
                                    if ((i3 & 1879048192) == 0) {
                                        i15 |= ((i5 & 524288) == 0 && startRestartGroup.changed(j5)) ? 536870912 : 268435456;
                                    }
                                    int i35 = i15;
                                    if ((i4 & 14) != 0) {
                                        i21 = i4 | (((i5 & 1048576) == 0 && startRestartGroup.changed(j6)) ? 4 : 2);
                                    } else {
                                        i21 = i4;
                                    }
                                    if ((i4 & 112) != 0) {
                                        j8 = j7;
                                        i21 |= ((i5 & 2097152) == 0 && startRestartGroup.changed(j8)) ? 32 : 16;
                                    } else {
                                        j8 = j7;
                                    }
                                    if ((i5 & 4194304) == 0) {
                                        i21 |= 384;
                                    } else if ((i4 & 896) == 0) {
                                        i21 |= startRestartGroup.changedInstance(content) ? 256 : 128;
                                    }
                                    if ((1533916891 & i6) == 306783378 || (i35 & 1533916891) != 306783378 || (i21 & 731) != 146 || !startRestartGroup.getSkipping()) {
                                        startRestartGroup.startDefaults();
                                        if ((i2 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                            Modifier.Companion companion = i34 == 0 ? Modifier.Companion : modifier;
                                            if ((i5 & 4) == 0) {
                                                i23 = i21;
                                                i24 = 6;
                                                i25 = i17;
                                                i26 = i12;
                                                i27 = i19;
                                                i28 = i14;
                                                i22 = i6 & (-897);
                                                bottomSheetScaffoldState3 = rememberBottomSheetScaffoldState(null, null, null, startRestartGroup, 0, 7);
                                                function23 = null;
                                            } else {
                                                i22 = i6;
                                                function23 = null;
                                                i23 = i21;
                                                i24 = 6;
                                                i25 = i17;
                                                i26 = i12;
                                                i27 = i19;
                                                i28 = i14;
                                                bottomSheetScaffoldState3 = bottomSheetScaffoldState;
                                            }
                                            function24 = i7 == 0 ? function23 : function2;
                                            m1334getLambda1$material_release = i8 == 0 ? ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m1334getLambda1$material_release() : obj;
                                            function25 = i9 == 0 ? function23 : function22;
                                            m1380getEnd5ygKITE = i10 == 0 ? FabPosition.Companion.m1380getEnd5ygKITE() : i;
                                            z3 = i26 == 0 ? true : z;
                                            if ((i5 & 256) == 0) {
                                                cornerBasedShape = MaterialTheme.INSTANCE.getShapes(startRestartGroup, i24).getLarge();
                                                i22 &= -234881025;
                                            } else {
                                                cornerBasedShape = shape;
                                            }
                                            m1264getSheetElevationD9Ej5fM = i28 == 0 ? BottomSheetScaffoldDefaults.INSTANCE.m1264getSheetElevationD9Ej5fM() : f;
                                            if ((i5 & 1024) == 0) {
                                                shape3 = cornerBasedShape;
                                                i35 &= -15;
                                                bottomSheetScaffoldState4 = bottomSheetScaffoldState3;
                                                j9 = MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m1313getSurface0d7_KjU();
                                            } else {
                                                shape3 = cornerBasedShape;
                                                bottomSheetScaffoldState4 = bottomSheetScaffoldState3;
                                                j9 = j;
                                            }
                                            if ((i5 & 2048) == 0) {
                                                j10 = ColorsKt.m1327contentColorForek8zF_U(j9, startRestartGroup, i35 & 14);
                                                i35 &= -113;
                                            } else {
                                                j10 = j2;
                                            }
                                            float m1265getSheetPeekHeightD9Ej5fM = i16 == 0 ? BottomSheetScaffoldDefaults.INSTANCE.m1265getSheetPeekHeightD9Ej5fM() : f2;
                                            Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function35 = i25 == 0 ? null : function32;
                                            z4 = i27 == 0 ? true : z2;
                                            float f10 = m1265getSheetPeekHeightD9Ej5fM;
                                            if ((i5 & 32768) == 0) {
                                                j11 = j9;
                                                cornerBasedShape2 = MaterialTheme.INSTANCE.getShapes(startRestartGroup, 6).getLarge();
                                                i35 &= -458753;
                                            } else {
                                                j11 = j9;
                                                cornerBasedShape2 = shape2;
                                            }
                                            float m1349getElevationD9Ej5fM = i20 == 0 ? DrawerDefaults.INSTANCE.m1349getElevationD9Ej5fM() : f3;
                                            if ((i5 & 131072) == 0) {
                                                shape4 = cornerBasedShape2;
                                                i35 &= -29360129;
                                                f4 = m1349getElevationD9Ej5fM;
                                                j12 = MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m1313getSurface0d7_KjU();
                                            } else {
                                                shape4 = cornerBasedShape2;
                                                f4 = m1349getElevationD9Ej5fM;
                                                j12 = j3;
                                            }
                                            if ((262144 & i5) == 0) {
                                                j13 = ColorsKt.m1327contentColorForek8zF_U(j12, startRestartGroup, (i35 >> 21) & 14);
                                                i35 &= -234881025;
                                            } else {
                                                j13 = j4;
                                            }
                                            if ((i5 & 524288) == 0) {
                                                j14 = j12;
                                                i29 = 6;
                                                j15 = DrawerDefaults.INSTANCE.getScrimColor(startRestartGroup, 6);
                                                i35 &= -1879048193;
                                            } else {
                                                j14 = j12;
                                                i29 = 6;
                                                j15 = j5;
                                            }
                                            long j25 = j15;
                                            if ((i5 & 1048576) == 0) {
                                                j16 = MaterialTheme.INSTANCE.getColors(startRestartGroup, i29).m1302getBackground0d7_KjU();
                                                i23 &= -15;
                                            } else {
                                                j16 = j6;
                                            }
                                            if ((2097152 & i5) == 0) {
                                                f5 = f10;
                                                shape6 = shape4;
                                                i30 = i23 & (-113);
                                                function33 = function35;
                                                j17 = ColorsKt.m1327contentColorForek8zF_U(j16, startRestartGroup, i23 & 14);
                                                shape5 = shape3;
                                                bottomSheetScaffoldState2 = bottomSheetScaffoldState4;
                                                j18 = j16;
                                                i6 = i22;
                                                modifier2 = companion;
                                                i31 = i35;
                                            } else {
                                                shape5 = shape3;
                                                f5 = f10;
                                                shape6 = shape4;
                                                j17 = j7;
                                                j18 = j16;
                                                i6 = i22;
                                                function33 = function35;
                                                modifier2 = companion;
                                                i30 = i23;
                                                i31 = i35;
                                                bottomSheetScaffoldState2 = bottomSheetScaffoldState4;
                                            }
                                            f6 = f4;
                                            j19 = j25;
                                        } else {
                                            startRestartGroup.skipToGroupEnd();
                                            if ((i5 & 4) != 0) {
                                                i6 &= -897;
                                            }
                                            if ((i5 & 256) != 0) {
                                                i6 &= -234881025;
                                            }
                                            if ((i5 & 1024) != 0) {
                                                i35 &= -15;
                                            }
                                            if ((i5 & 2048) != 0) {
                                                i35 &= -113;
                                            }
                                            if ((32768 & i5) != 0) {
                                                i35 &= -458753;
                                            }
                                            if ((i5 & 131072) != 0) {
                                                i35 &= -29360129;
                                            }
                                            if ((262144 & i5) != 0) {
                                                i35 &= -234881025;
                                            }
                                            if ((i5 & 524288) != 0) {
                                                i35 &= -1879048193;
                                            }
                                            if ((i5 & 1048576) != 0) {
                                                i21 &= -15;
                                            }
                                            if ((2097152 & i5) != 0) {
                                                i21 &= -113;
                                            }
                                            modifier2 = modifier;
                                            function24 = function2;
                                            m1380getEnd5ygKITE = i;
                                            shape5 = shape;
                                            m1264getSheetElevationD9Ej5fM = f;
                                            j11 = j;
                                            j10 = j2;
                                            f5 = f2;
                                            function33 = function32;
                                            z4 = z2;
                                            shape6 = shape2;
                                            f6 = f3;
                                            j14 = j3;
                                            j13 = j4;
                                            j18 = j6;
                                            j17 = j7;
                                            i30 = i21;
                                            m1334getLambda1$material_release = obj;
                                            i31 = i35;
                                            function25 = function22;
                                            z3 = z;
                                            j19 = j5;
                                        }
                                        startRestartGroup.endDefaults();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(46422755, i6, i31, "androidx.compose.material.BottomSheetScaffold (BottomSheetScaffold.kt:414)");
                                        }
                                        startRestartGroup.startReplaceableGroup(1207995830);
                                        ComposerKt.sourceInformation(startRestartGroup, "441@17907L7,442@17934L72,442@17923L83");
                                        if (bottomSheetScaffoldState2.getBottomSheetState().getDensity$material_release() == null) {
                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                            Object consume = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                            Density density = (Density) consume;
                                            startRestartGroup.startReplaceableGroup(511388516);
                                            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
                                            boolean changed = startRestartGroup.changed(bottomSheetScaffoldState2) | startRestartGroup.changed(density);
                                            BottomSheetScaffoldKt$BottomSheetScaffold$1$1 rememberedValue = startRestartGroup.rememberedValue();
                                            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                                                rememberedValue = new BottomSheetScaffoldKt$BottomSheetScaffold$1$1(bottomSheetScaffoldState2, density);
                                                startRestartGroup.updateRememberedValue(rememberedValue);
                                            }
                                            startRestartGroup.endReplaceableGroup();
                                            EffectsKt.SideEffect((Function0) rememberedValue, startRestartGroup, 0);
                                        }
                                        startRestartGroup.endReplaceableGroup();
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                        Object consume2 = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        int i36 = i30 << 6;
                                        SurfaceKt.m1471SurfaceFjzlyU(SizeKt.fillMaxSize$default(modifier2, 0.0f, 1, null), null, j18, j17, null, 0.0f, ComposableLambdaKt.composableLambda(startRestartGroup, 1273816607, true, new BottomSheetScaffoldKt$BottomSheetScaffold$2(function33, ComposableLambdaKt.composableLambda(startRestartGroup, 893101063, true, new BottomSheetScaffoldKt$BottomSheetScaffold$child$1(bottomSheetScaffoldState2, function24, content, function25, f5, m1380getEnd5ygKITE, i6, i30, i31, z3, ((Density) consume2).mo588toPx0680j_4(f5), shape5, m1264getSheetElevationD9Ej5fM, j11, j10, sheetContent, m1334getLambda1$material_release)), bottomSheetScaffoldState2, z4, shape6, f6, j14, j13, j19, i31)), startRestartGroup, (i36 & 7168) | (i36 & 896) | 1572864, 50);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        modifier3 = modifier2;
                                        z5 = z3;
                                        function34 = function33;
                                        f7 = m1264getSheetElevationD9Ej5fM;
                                        shape7 = shape6;
                                        f8 = f6;
                                        j20 = j13;
                                        j21 = j10;
                                        f9 = f5;
                                        j22 = j11;
                                        j23 = j19;
                                        j24 = j18;
                                        BottomSheetScaffoldState bottomSheetScaffoldState6 = bottomSheetScaffoldState2;
                                        shape8 = shape5;
                                        bottomSheetScaffoldState5 = bottomSheetScaffoldState6;
                                    } else {
                                        startRestartGroup.skipToGroupEnd();
                                        modifier3 = modifier;
                                        function24 = function2;
                                        function25 = function22;
                                        j22 = j;
                                        j21 = j2;
                                        f9 = f2;
                                        function34 = function32;
                                        z4 = z2;
                                        shape7 = shape2;
                                        f8 = f3;
                                        j14 = j3;
                                        j20 = j4;
                                        j23 = j5;
                                        j24 = j6;
                                        j17 = j8;
                                        bottomSheetScaffoldState5 = bottomSheetScaffoldState2;
                                        m1334getLambda1$material_release = obj;
                                        m1380getEnd5ygKITE = i;
                                        z5 = z;
                                        shape8 = shape;
                                        f7 = f;
                                    }
                                    endRestartGroup = startRestartGroup.endRestartGroup();
                                    if (endRestartGroup != null) {
                                        return;
                                    }
                                    endRestartGroup.updateScope(new BottomSheetScaffoldKt$BottomSheetScaffold$3(sheetContent, modifier3, bottomSheetScaffoldState5, function24, m1334getLambda1$material_release, function25, m1380getEnd5ygKITE, z5, shape8, f7, j22, j21, f9, function34, z4, shape7, f8, j14, j20, j23, j24, j17, content, i2, i3, i4, i5));
                                    return;
                                }
                                i19 = i18;
                                if ((i3 & 458752) == 0) {
                                }
                                i20 = i5 & 65536;
                                if (i20 == 0) {
                                }
                                if ((i3 & 29360128) == 0) {
                                }
                                if ((i3 & 234881024) == 0) {
                                }
                                if ((i3 & 1879048192) == 0) {
                                }
                                int i352 = i15;
                                if ((i4 & 14) != 0) {
                                }
                                if ((i4 & 112) != 0) {
                                }
                                if ((i5 & 4194304) == 0) {
                                }
                                if ((1533916891 & i6) == 306783378) {
                                }
                                startRestartGroup.startDefaults();
                                if ((i2 & 1) != 0) {
                                }
                                if (i34 == 0) {
                                }
                                if ((i5 & 4) == 0) {
                                }
                                if (i7 == 0) {
                                }
                                if (i8 == 0) {
                                }
                                if (i9 == 0) {
                                }
                                if (i10 == 0) {
                                }
                                if (i26 == 0) {
                                }
                                if ((i5 & 256) == 0) {
                                }
                                if (i28 == 0) {
                                }
                                if ((i5 & 1024) == 0) {
                                }
                                if ((i5 & 2048) == 0) {
                                }
                                if (i16 == 0) {
                                }
                                if (i25 == 0) {
                                }
                                if (i27 == 0) {
                                }
                                float f102 = m1265getSheetPeekHeightD9Ej5fM;
                                if ((i5 & 32768) == 0) {
                                }
                                if (i20 == 0) {
                                }
                                if ((i5 & 131072) == 0) {
                                }
                                if ((262144 & i5) == 0) {
                                }
                                if ((i5 & 524288) == 0) {
                                }
                                long j252 = j15;
                                if ((i5 & 1048576) == 0) {
                                }
                                if ((2097152 & i5) == 0) {
                                }
                                f6 = f4;
                                j19 = j252;
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                startRestartGroup.startReplaceableGroup(1207995830);
                                ComposerKt.sourceInformation(startRestartGroup, "441@17907L7,442@17934L72,442@17923L83");
                                if (bottomSheetScaffoldState2.getBottomSheetState().getDensity$material_release() == null) {
                                }
                                startRestartGroup.endReplaceableGroup();
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                Object consume22 = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                int i362 = i30 << 6;
                                SurfaceKt.m1471SurfaceFjzlyU(SizeKt.fillMaxSize$default(modifier2, 0.0f, 1, null), null, j18, j17, null, 0.0f, ComposableLambdaKt.composableLambda(startRestartGroup, 1273816607, true, new BottomSheetScaffoldKt$BottomSheetScaffold$2(function33, ComposableLambdaKt.composableLambda(startRestartGroup, 893101063, true, new BottomSheetScaffoldKt$BottomSheetScaffold$child$1(bottomSheetScaffoldState2, function24, content, function25, f5, m1380getEnd5ygKITE, i6, i30, i31, z3, ((Density) consume22).mo588toPx0680j_4(f5), shape5, m1264getSheetElevationD9Ej5fM, j11, j10, sheetContent, m1334getLambda1$material_release)), bottomSheetScaffoldState2, z4, shape6, f6, j14, j13, j19, i31)), startRestartGroup, (i362 & 7168) | (i362 & 896) | 1572864, 50);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                modifier3 = modifier2;
                                z5 = z3;
                                function34 = function33;
                                f7 = m1264getSheetElevationD9Ej5fM;
                                shape7 = shape6;
                                f8 = f6;
                                j20 = j13;
                                j21 = j10;
                                f9 = f5;
                                j22 = j11;
                                j23 = j19;
                                j24 = j18;
                                BottomSheetScaffoldState bottomSheetScaffoldState62 = bottomSheetScaffoldState2;
                                shape8 = shape5;
                                bottomSheetScaffoldState5 = bottomSheetScaffoldState62;
                                endRestartGroup = startRestartGroup.endRestartGroup();
                                if (endRestartGroup != null) {
                                }
                            }
                            i18 = i5 & 16384;
                            if (i18 != 0) {
                            }
                            i19 = i18;
                            if ((i3 & 458752) == 0) {
                            }
                            i20 = i5 & 65536;
                            if (i20 == 0) {
                            }
                            if ((i3 & 29360128) == 0) {
                            }
                            if ((i3 & 234881024) == 0) {
                            }
                            if ((i3 & 1879048192) == 0) {
                            }
                            int i3522 = i15;
                            if ((i4 & 14) != 0) {
                            }
                            if ((i4 & 112) != 0) {
                            }
                            if ((i5 & 4194304) == 0) {
                            }
                            if ((1533916891 & i6) == 306783378) {
                            }
                            startRestartGroup.startDefaults();
                            if ((i2 & 1) != 0) {
                            }
                            if (i34 == 0) {
                            }
                            if ((i5 & 4) == 0) {
                            }
                            if (i7 == 0) {
                            }
                            if (i8 == 0) {
                            }
                            if (i9 == 0) {
                            }
                            if (i10 == 0) {
                            }
                            if (i26 == 0) {
                            }
                            if ((i5 & 256) == 0) {
                            }
                            if (i28 == 0) {
                            }
                            if ((i5 & 1024) == 0) {
                            }
                            if ((i5 & 2048) == 0) {
                            }
                            if (i16 == 0) {
                            }
                            if (i25 == 0) {
                            }
                            if (i27 == 0) {
                            }
                            float f1022 = m1265getSheetPeekHeightD9Ej5fM;
                            if ((i5 & 32768) == 0) {
                            }
                            if (i20 == 0) {
                            }
                            if ((i5 & 131072) == 0) {
                            }
                            if ((262144 & i5) == 0) {
                            }
                            if ((i5 & 524288) == 0) {
                            }
                            long j2522 = j15;
                            if ((i5 & 1048576) == 0) {
                            }
                            if ((2097152 & i5) == 0) {
                            }
                            f6 = f4;
                            j19 = j2522;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            startRestartGroup.startReplaceableGroup(1207995830);
                            ComposerKt.sourceInformation(startRestartGroup, "441@17907L7,442@17934L72,442@17923L83");
                            if (bottomSheetScaffoldState2.getBottomSheetState().getDensity$material_release() == null) {
                            }
                            startRestartGroup.endReplaceableGroup();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                            Object consume222 = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            int i3622 = i30 << 6;
                            SurfaceKt.m1471SurfaceFjzlyU(SizeKt.fillMaxSize$default(modifier2, 0.0f, 1, null), null, j18, j17, null, 0.0f, ComposableLambdaKt.composableLambda(startRestartGroup, 1273816607, true, new BottomSheetScaffoldKt$BottomSheetScaffold$2(function33, ComposableLambdaKt.composableLambda(startRestartGroup, 893101063, true, new BottomSheetScaffoldKt$BottomSheetScaffold$child$1(bottomSheetScaffoldState2, function24, content, function25, f5, m1380getEnd5ygKITE, i6, i30, i31, z3, ((Density) consume222).mo588toPx0680j_4(f5), shape5, m1264getSheetElevationD9Ej5fM, j11, j10, sheetContent, m1334getLambda1$material_release)), bottomSheetScaffoldState2, z4, shape6, f6, j14, j13, j19, i31)), startRestartGroup, (i3622 & 7168) | (i3622 & 896) | 1572864, 50);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier3 = modifier2;
                            z5 = z3;
                            function34 = function33;
                            f7 = m1264getSheetElevationD9Ej5fM;
                            shape7 = shape6;
                            f8 = f6;
                            j20 = j13;
                            j21 = j10;
                            f9 = f5;
                            j22 = j11;
                            j23 = j19;
                            j24 = j18;
                            BottomSheetScaffoldState bottomSheetScaffoldState622 = bottomSheetScaffoldState2;
                            shape8 = shape5;
                            bottomSheetScaffoldState5 = bottomSheetScaffoldState622;
                            endRestartGroup = startRestartGroup.endRestartGroup();
                            if (endRestartGroup != null) {
                            }
                        }
                        i17 = i5 & 8192;
                        if (i17 == 0) {
                        }
                        i18 = i5 & 16384;
                        if (i18 != 0) {
                        }
                        i19 = i18;
                        if ((i3 & 458752) == 0) {
                        }
                        i20 = i5 & 65536;
                        if (i20 == 0) {
                        }
                        if ((i3 & 29360128) == 0) {
                        }
                        if ((i3 & 234881024) == 0) {
                        }
                        if ((i3 & 1879048192) == 0) {
                        }
                        int i35222 = i15;
                        if ((i4 & 14) != 0) {
                        }
                        if ((i4 & 112) != 0) {
                        }
                        if ((i5 & 4194304) == 0) {
                        }
                        if ((1533916891 & i6) == 306783378) {
                        }
                        startRestartGroup.startDefaults();
                        if ((i2 & 1) != 0) {
                        }
                        if (i34 == 0) {
                        }
                        if ((i5 & 4) == 0) {
                        }
                        if (i7 == 0) {
                        }
                        if (i8 == 0) {
                        }
                        if (i9 == 0) {
                        }
                        if (i10 == 0) {
                        }
                        if (i26 == 0) {
                        }
                        if ((i5 & 256) == 0) {
                        }
                        if (i28 == 0) {
                        }
                        if ((i5 & 1024) == 0) {
                        }
                        if ((i5 & 2048) == 0) {
                        }
                        if (i16 == 0) {
                        }
                        if (i25 == 0) {
                        }
                        if (i27 == 0) {
                        }
                        float f10222 = m1265getSheetPeekHeightD9Ej5fM;
                        if ((i5 & 32768) == 0) {
                        }
                        if (i20 == 0) {
                        }
                        if ((i5 & 131072) == 0) {
                        }
                        if ((262144 & i5) == 0) {
                        }
                        if ((i5 & 524288) == 0) {
                        }
                        long j25222 = j15;
                        if ((i5 & 1048576) == 0) {
                        }
                        if ((2097152 & i5) == 0) {
                        }
                        f6 = f4;
                        j19 = j25222;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        startRestartGroup.startReplaceableGroup(1207995830);
                        ComposerKt.sourceInformation(startRestartGroup, "441@17907L7,442@17934L72,442@17923L83");
                        if (bottomSheetScaffoldState2.getBottomSheetState().getDensity$material_release() == null) {
                        }
                        startRestartGroup.endReplaceableGroup();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                        Object consume2222 = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        int i36222 = i30 << 6;
                        SurfaceKt.m1471SurfaceFjzlyU(SizeKt.fillMaxSize$default(modifier2, 0.0f, 1, null), null, j18, j17, null, 0.0f, ComposableLambdaKt.composableLambda(startRestartGroup, 1273816607, true, new BottomSheetScaffoldKt$BottomSheetScaffold$2(function33, ComposableLambdaKt.composableLambda(startRestartGroup, 893101063, true, new BottomSheetScaffoldKt$BottomSheetScaffold$child$1(bottomSheetScaffoldState2, function24, content, function25, f5, m1380getEnd5ygKITE, i6, i30, i31, z3, ((Density) consume2222).mo588toPx0680j_4(f5), shape5, m1264getSheetElevationD9Ej5fM, j11, j10, sheetContent, m1334getLambda1$material_release)), bottomSheetScaffoldState2, z4, shape6, f6, j14, j13, j19, i31)), startRestartGroup, (i36222 & 7168) | (i36222 & 896) | 1572864, 50);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier3 = modifier2;
                        z5 = z3;
                        function34 = function33;
                        f7 = m1264getSheetElevationD9Ej5fM;
                        shape7 = shape6;
                        f8 = f6;
                        j20 = j13;
                        j21 = j10;
                        f9 = f5;
                        j22 = j11;
                        j23 = j19;
                        j24 = j18;
                        BottomSheetScaffoldState bottomSheetScaffoldState6222 = bottomSheetScaffoldState2;
                        shape8 = shape5;
                        bottomSheetScaffoldState5 = bottomSheetScaffoldState6222;
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    i14 = i13;
                    if ((i3 & 14) == 0) {
                    }
                    if ((i3 & 112) == 0) {
                    }
                    i16 = i5 & 4096;
                    if (i16 != 0) {
                    }
                    i17 = i5 & 8192;
                    if (i17 == 0) {
                    }
                    i18 = i5 & 16384;
                    if (i18 != 0) {
                    }
                    i19 = i18;
                    if ((i3 & 458752) == 0) {
                    }
                    i20 = i5 & 65536;
                    if (i20 == 0) {
                    }
                    if ((i3 & 29360128) == 0) {
                    }
                    if ((i3 & 234881024) == 0) {
                    }
                    if ((i3 & 1879048192) == 0) {
                    }
                    int i352222 = i15;
                    if ((i4 & 14) != 0) {
                    }
                    if ((i4 & 112) != 0) {
                    }
                    if ((i5 & 4194304) == 0) {
                    }
                    if ((1533916891 & i6) == 306783378) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                    }
                    if (i34 == 0) {
                    }
                    if ((i5 & 4) == 0) {
                    }
                    if (i7 == 0) {
                    }
                    if (i8 == 0) {
                    }
                    if (i9 == 0) {
                    }
                    if (i10 == 0) {
                    }
                    if (i26 == 0) {
                    }
                    if ((i5 & 256) == 0) {
                    }
                    if (i28 == 0) {
                    }
                    if ((i5 & 1024) == 0) {
                    }
                    if ((i5 & 2048) == 0) {
                    }
                    if (i16 == 0) {
                    }
                    if (i25 == 0) {
                    }
                    if (i27 == 0) {
                    }
                    float f102222 = m1265getSheetPeekHeightD9Ej5fM;
                    if ((i5 & 32768) == 0) {
                    }
                    if (i20 == 0) {
                    }
                    if ((i5 & 131072) == 0) {
                    }
                    if ((262144 & i5) == 0) {
                    }
                    if ((i5 & 524288) == 0) {
                    }
                    long j252222 = j15;
                    if ((i5 & 1048576) == 0) {
                    }
                    if ((2097152 & i5) == 0) {
                    }
                    f6 = f4;
                    j19 = j252222;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    startRestartGroup.startReplaceableGroup(1207995830);
                    ComposerKt.sourceInformation(startRestartGroup, "441@17907L7,442@17934L72,442@17923L83");
                    if (bottomSheetScaffoldState2.getBottomSheetState().getDensity$material_release() == null) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object consume22222 = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    int i362222 = i30 << 6;
                    SurfaceKt.m1471SurfaceFjzlyU(SizeKt.fillMaxSize$default(modifier2, 0.0f, 1, null), null, j18, j17, null, 0.0f, ComposableLambdaKt.composableLambda(startRestartGroup, 1273816607, true, new BottomSheetScaffoldKt$BottomSheetScaffold$2(function33, ComposableLambdaKt.composableLambda(startRestartGroup, 893101063, true, new BottomSheetScaffoldKt$BottomSheetScaffold$child$1(bottomSheetScaffoldState2, function24, content, function25, f5, m1380getEnd5ygKITE, i6, i30, i31, z3, ((Density) consume22222).mo588toPx0680j_4(f5), shape5, m1264getSheetElevationD9Ej5fM, j11, j10, sheetContent, m1334getLambda1$material_release)), bottomSheetScaffoldState2, z4, shape6, f6, j14, j13, j19, i31)), startRestartGroup, (i362222 & 7168) | (i362222 & 896) | 1572864, 50);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier2;
                    z5 = z3;
                    function34 = function33;
                    f7 = m1264getSheetElevationD9Ej5fM;
                    shape7 = shape6;
                    f8 = f6;
                    j20 = j13;
                    j21 = j10;
                    f9 = f5;
                    j22 = j11;
                    j23 = j19;
                    j24 = j18;
                    BottomSheetScaffoldState bottomSheetScaffoldState62222 = bottomSheetScaffoldState2;
                    shape8 = shape5;
                    bottomSheetScaffoldState5 = bottomSheetScaffoldState62222;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                i12 = i11;
                if ((i2 & 234881024) == 0) {
                }
                i13 = i5 & 512;
                if (i13 == 0) {
                }
                i14 = i13;
                if ((i3 & 14) == 0) {
                }
                if ((i3 & 112) == 0) {
                }
                i16 = i5 & 4096;
                if (i16 != 0) {
                }
                i17 = i5 & 8192;
                if (i17 == 0) {
                }
                i18 = i5 & 16384;
                if (i18 != 0) {
                }
                i19 = i18;
                if ((i3 & 458752) == 0) {
                }
                i20 = i5 & 65536;
                if (i20 == 0) {
                }
                if ((i3 & 29360128) == 0) {
                }
                if ((i3 & 234881024) == 0) {
                }
                if ((i3 & 1879048192) == 0) {
                }
                int i3522222 = i15;
                if ((i4 & 14) != 0) {
                }
                if ((i4 & 112) != 0) {
                }
                if ((i5 & 4194304) == 0) {
                }
                if ((1533916891 & i6) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                }
                if (i34 == 0) {
                }
                if ((i5 & 4) == 0) {
                }
                if (i7 == 0) {
                }
                if (i8 == 0) {
                }
                if (i9 == 0) {
                }
                if (i10 == 0) {
                }
                if (i26 == 0) {
                }
                if ((i5 & 256) == 0) {
                }
                if (i28 == 0) {
                }
                if ((i5 & 1024) == 0) {
                }
                if ((i5 & 2048) == 0) {
                }
                if (i16 == 0) {
                }
                if (i25 == 0) {
                }
                if (i27 == 0) {
                }
                float f1022222 = m1265getSheetPeekHeightD9Ej5fM;
                if ((i5 & 32768) == 0) {
                }
                if (i20 == 0) {
                }
                if ((i5 & 131072) == 0) {
                }
                if ((262144 & i5) == 0) {
                }
                if ((i5 & 524288) == 0) {
                }
                long j2522222 = j15;
                if ((i5 & 1048576) == 0) {
                }
                if ((2097152 & i5) == 0) {
                }
                f6 = f4;
                j19 = j2522222;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                startRestartGroup.startReplaceableGroup(1207995830);
                ComposerKt.sourceInformation(startRestartGroup, "441@17907L7,442@17934L72,442@17923L83");
                if (bottomSheetScaffoldState2.getBottomSheetState().getDensity$material_release() == null) {
                }
                startRestartGroup.endReplaceableGroup();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume222222 = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                int i3622222 = i30 << 6;
                SurfaceKt.m1471SurfaceFjzlyU(SizeKt.fillMaxSize$default(modifier2, 0.0f, 1, null), null, j18, j17, null, 0.0f, ComposableLambdaKt.composableLambda(startRestartGroup, 1273816607, true, new BottomSheetScaffoldKt$BottomSheetScaffold$2(function33, ComposableLambdaKt.composableLambda(startRestartGroup, 893101063, true, new BottomSheetScaffoldKt$BottomSheetScaffold$child$1(bottomSheetScaffoldState2, function24, content, function25, f5, m1380getEnd5ygKITE, i6, i30, i31, z3, ((Density) consume222222).mo588toPx0680j_4(f5), shape5, m1264getSheetElevationD9Ej5fM, j11, j10, sheetContent, m1334getLambda1$material_release)), bottomSheetScaffoldState2, z4, shape6, f6, j14, j13, j19, i31)), startRestartGroup, (i3622222 & 7168) | (i3622222 & 896) | 1572864, 50);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier2;
                z5 = z3;
                function34 = function33;
                f7 = m1264getSheetElevationD9Ej5fM;
                shape7 = shape6;
                f8 = f6;
                j20 = j13;
                j21 = j10;
                f9 = f5;
                j22 = j11;
                j23 = j19;
                j24 = j18;
                BottomSheetScaffoldState bottomSheetScaffoldState622222 = bottomSheetScaffoldState2;
                shape8 = shape5;
                bottomSheetScaffoldState5 = bottomSheetScaffoldState622222;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            i8 = i5 & 16;
            if (i8 != 0) {
            }
            i9 = i5 & 32;
            if (i9 != 0) {
            }
            i10 = i5 & 64;
            if (i10 != 0) {
            }
            i11 = i5 & 128;
            if (i11 != 0) {
            }
            i12 = i11;
            if ((i2 & 234881024) == 0) {
            }
            i13 = i5 & 512;
            if (i13 == 0) {
            }
            i14 = i13;
            if ((i3 & 14) == 0) {
            }
            if ((i3 & 112) == 0) {
            }
            i16 = i5 & 4096;
            if (i16 != 0) {
            }
            i17 = i5 & 8192;
            if (i17 == 0) {
            }
            i18 = i5 & 16384;
            if (i18 != 0) {
            }
            i19 = i18;
            if ((i3 & 458752) == 0) {
            }
            i20 = i5 & 65536;
            if (i20 == 0) {
            }
            if ((i3 & 29360128) == 0) {
            }
            if ((i3 & 234881024) == 0) {
            }
            if ((i3 & 1879048192) == 0) {
            }
            int i35222222 = i15;
            if ((i4 & 14) != 0) {
            }
            if ((i4 & 112) != 0) {
            }
            if ((i5 & 4194304) == 0) {
            }
            if ((1533916891 & i6) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
            }
            if (i34 == 0) {
            }
            if ((i5 & 4) == 0) {
            }
            if (i7 == 0) {
            }
            if (i8 == 0) {
            }
            if (i9 == 0) {
            }
            if (i10 == 0) {
            }
            if (i26 == 0) {
            }
            if ((i5 & 256) == 0) {
            }
            if (i28 == 0) {
            }
            if ((i5 & 1024) == 0) {
            }
            if ((i5 & 2048) == 0) {
            }
            if (i16 == 0) {
            }
            if (i25 == 0) {
            }
            if (i27 == 0) {
            }
            float f10222222 = m1265getSheetPeekHeightD9Ej5fM;
            if ((i5 & 32768) == 0) {
            }
            if (i20 == 0) {
            }
            if ((i5 & 131072) == 0) {
            }
            if ((262144 & i5) == 0) {
            }
            if ((i5 & 524288) == 0) {
            }
            long j25222222 = j15;
            if ((i5 & 1048576) == 0) {
            }
            if ((2097152 & i5) == 0) {
            }
            f6 = f4;
            j19 = j25222222;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.startReplaceableGroup(1207995830);
            ComposerKt.sourceInformation(startRestartGroup, "441@17907L7,442@17934L72,442@17923L83");
            if (bottomSheetScaffoldState2.getBottomSheetState().getDensity$material_release() == null) {
            }
            startRestartGroup.endReplaceableGroup();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume2222222 = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            int i36222222 = i30 << 6;
            SurfaceKt.m1471SurfaceFjzlyU(SizeKt.fillMaxSize$default(modifier2, 0.0f, 1, null), null, j18, j17, null, 0.0f, ComposableLambdaKt.composableLambda(startRestartGroup, 1273816607, true, new BottomSheetScaffoldKt$BottomSheetScaffold$2(function33, ComposableLambdaKt.composableLambda(startRestartGroup, 893101063, true, new BottomSheetScaffoldKt$BottomSheetScaffold$child$1(bottomSheetScaffoldState2, function24, content, function25, f5, m1380getEnd5ygKITE, i6, i30, i31, z3, ((Density) consume2222222).mo588toPx0680j_4(f5), shape5, m1264getSheetElevationD9Ej5fM, j11, j10, sheetContent, m1334getLambda1$material_release)), bottomSheetScaffoldState2, z4, shape6, f6, j14, j13, j19, i31)), startRestartGroup, (i36222222 & 7168) | (i36222222 & 896) | 1572864, 50);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier2;
            z5 = z3;
            function34 = function33;
            f7 = m1264getSheetElevationD9Ej5fM;
            shape7 = shape6;
            f8 = f6;
            j20 = j13;
            j21 = j10;
            f9 = f5;
            j22 = j11;
            j23 = j19;
            j24 = j18;
            BottomSheetScaffoldState bottomSheetScaffoldState6222222 = bottomSheetScaffoldState2;
            shape8 = shape5;
            bottomSheetScaffoldState5 = bottomSheetScaffoldState6222222;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        if ((i2 & 896) != 0) {
        }
        i7 = i5 & 8;
        if (i7 == 0) {
        }
        i8 = i5 & 16;
        if (i8 != 0) {
        }
        i9 = i5 & 32;
        if (i9 != 0) {
        }
        i10 = i5 & 64;
        if (i10 != 0) {
        }
        i11 = i5 & 128;
        if (i11 != 0) {
        }
        i12 = i11;
        if ((i2 & 234881024) == 0) {
        }
        i13 = i5 & 512;
        if (i13 == 0) {
        }
        i14 = i13;
        if ((i3 & 14) == 0) {
        }
        if ((i3 & 112) == 0) {
        }
        i16 = i5 & 4096;
        if (i16 != 0) {
        }
        i17 = i5 & 8192;
        if (i17 == 0) {
        }
        i18 = i5 & 16384;
        if (i18 != 0) {
        }
        i19 = i18;
        if ((i3 & 458752) == 0) {
        }
        i20 = i5 & 65536;
        if (i20 == 0) {
        }
        if ((i3 & 29360128) == 0) {
        }
        if ((i3 & 234881024) == 0) {
        }
        if ((i3 & 1879048192) == 0) {
        }
        int i352222222 = i15;
        if ((i4 & 14) != 0) {
        }
        if ((i4 & 112) != 0) {
        }
        if ((i5 & 4194304) == 0) {
        }
        if ((1533916891 & i6) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i2 & 1) != 0) {
        }
        if (i34 == 0) {
        }
        if ((i5 & 4) == 0) {
        }
        if (i7 == 0) {
        }
        if (i8 == 0) {
        }
        if (i9 == 0) {
        }
        if (i10 == 0) {
        }
        if (i26 == 0) {
        }
        if ((i5 & 256) == 0) {
        }
        if (i28 == 0) {
        }
        if ((i5 & 1024) == 0) {
        }
        if ((i5 & 2048) == 0) {
        }
        if (i16 == 0) {
        }
        if (i25 == 0) {
        }
        if (i27 == 0) {
        }
        float f102222222 = m1265getSheetPeekHeightD9Ej5fM;
        if ((i5 & 32768) == 0) {
        }
        if (i20 == 0) {
        }
        if ((i5 & 131072) == 0) {
        }
        if ((262144 & i5) == 0) {
        }
        if ((i5 & 524288) == 0) {
        }
        long j252222222 = j15;
        if ((i5 & 1048576) == 0) {
        }
        if ((2097152 & i5) == 0) {
        }
        f6 = f4;
        j19 = j252222222;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        startRestartGroup.startReplaceableGroup(1207995830);
        ComposerKt.sourceInformation(startRestartGroup, "441@17907L7,442@17934L72,442@17923L83");
        if (bottomSheetScaffoldState2.getBottomSheetState().getDensity$material_release() == null) {
        }
        startRestartGroup.endReplaceableGroup();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume22222222 = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        int i362222222 = i30 << 6;
        SurfaceKt.m1471SurfaceFjzlyU(SizeKt.fillMaxSize$default(modifier2, 0.0f, 1, null), null, j18, j17, null, 0.0f, ComposableLambdaKt.composableLambda(startRestartGroup, 1273816607, true, new BottomSheetScaffoldKt$BottomSheetScaffold$2(function33, ComposableLambdaKt.composableLambda(startRestartGroup, 893101063, true, new BottomSheetScaffoldKt$BottomSheetScaffold$child$1(bottomSheetScaffoldState2, function24, content, function25, f5, m1380getEnd5ygKITE, i6, i30, i31, z3, ((Density) consume22222222).mo588toPx0680j_4(f5), shape5, m1264getSheetElevationD9Ej5fM, j11, j10, sheetContent, m1334getLambda1$material_release)), bottomSheetScaffoldState2, z4, shape6, f6, j14, j13, j19, i31)), startRestartGroup, (i362222222 & 7168) | (i362222222 & 896) | 1572864, 50);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier3 = modifier2;
        z5 = z3;
        function34 = function33;
        f7 = m1264getSheetElevationD9Ej5fM;
        shape7 = shape6;
        f8 = f6;
        j20 = j13;
        j21 = j10;
        f9 = f5;
        j22 = j11;
        j23 = j19;
        j24 = j18;
        BottomSheetScaffoldState bottomSheetScaffoldState62222222 = bottomSheetScaffoldState2;
        shape8 = shape5;
        bottomSheetScaffoldState5 = bottomSheetScaffoldState62222222;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:103:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x011a  */
    /* renamed from: BottomSheet-0cLKjW4  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1266BottomSheet0cLKjW4(BottomSheetState bottomSheetState, boolean z, Function1<? super IntSize, ? extends Map<BottomSheetValue, Float>> function1, Shape shape, float f, long j, long j2, Modifier modifier, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, int i, int i2) {
        int i3;
        int i4;
        int i5;
        Object rememberedValue;
        boolean changed;
        Object rememberedValue2;
        Modifier modifier2;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(1407045933);
        ComposerKt.sourceInformation(startRestartGroup, "C(BottomSheet)P(8,6!1,7,5:c#ui.unit.Dp,3:c#ui.graphics.Color,4:c#ui.graphics.Color,2)536@21671L24,537@21727L92,540@21824L1599:BottomSheetScaffold.kt#jmzs0o");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(bottomSheetState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(z) ? 32 : 16;
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                i3 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
            } else if ((i & 7168) == 0) {
                i3 |= startRestartGroup.changed(shape) ? 2048 : 1024;
                if ((i2 & 16) != 0) {
                    i3 |= 24576;
                } else if ((57344 & i) == 0) {
                    i3 |= startRestartGroup.changed(f) ? 16384 : 8192;
                    if ((i2 & 32) == 0) {
                        i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((i & 458752) == 0) {
                        i3 |= startRestartGroup.changed(j) ? 131072 : 65536;
                    }
                    if ((i2 & 64) == 0) {
                        i3 |= 1572864;
                    } else if ((3670016 & i) == 0) {
                        i3 |= startRestartGroup.changed(j2) ? 1048576 : 524288;
                    }
                    i4 = i2 & 128;
                    if (i4 == 0) {
                        i3 |= 12582912;
                    } else if ((i & 29360128) == 0) {
                        i3 |= startRestartGroup.changed(modifier) ? 8388608 : 4194304;
                    }
                    if ((i2 & 256) != 0) {
                        if ((234881024 & i) == 0) {
                            i5 = startRestartGroup.changedInstance(function3) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                        }
                        if ((191739611 & i3) == 38347922 || !startRestartGroup.getSkipping()) {
                            Modifier.Companion companion = i4 != 0 ? Modifier.Companion : modifier;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1407045933, i3, -1, "androidx.compose.material.BottomSheet (BottomSheetScaffold.kt:525)");
                            }
                            startRestartGroup.startReplaceableGroup(773894976);
                            ComposerKt.sourceInformation(startRestartGroup, "CC(rememberCoroutineScope)488@20446L144:Effects.kt#9igjgp");
                            startRestartGroup.startReplaceableGroup(-492369756);
                            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == Composer.Companion.getEmpty()) {
                                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, startRestartGroup));
                                startRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                                rememberedValue = compositionScopedCoroutineScopeCanceller;
                            }
                            startRestartGroup.endReplaceableGroup();
                            CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
                            startRestartGroup.endReplaceableGroup();
                            startRestartGroup.startReplaceableGroup(511388516);
                            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
                            changed = startRestartGroup.changed(bottomSheetState) | startRestartGroup.changed(coroutineScope);
                            rememberedValue2 = startRestartGroup.rememberedValue();
                            if (!changed || rememberedValue2 == Composer.Companion.getEmpty()) {
                                rememberedValue2 = BottomSheetScaffoldAnchorChangeCallback(bottomSheetState, coroutineScope);
                                startRestartGroup.updateRememberedValue(rememberedValue2);
                            }
                            startRestartGroup.endReplaceableGroup();
                            int i6 = i3 >> 9;
                            SurfaceKt.m1471SurfaceFjzlyU(SemanticsModifierKt.semantics$default(OnRemeasuredModifierKt.onSizeChanged(AnchoredDraggableKt.anchoredDraggable$default(companion, bottomSheetState.getAnchoredDraggableState$material_release(), Orientation.Vertical, z, false, null, 24, null), new BottomSheetScaffoldKt$BottomSheet$1(bottomSheetState, function1, (AnchoredDraggableState.AnchorChangedCallback) rememberedValue2)), false, new BottomSheetScaffoldKt$BottomSheet$2(bottomSheetState, coroutineScope), 1, null), shape, j, j2, null, f, ComposableLambdaKt.composableLambda(startRestartGroup, 1944994153, true, new BottomSheetScaffoldKt$BottomSheet$3(function3, i3)), startRestartGroup, ((i3 >> 6) & 112) | 1572864 | (i6 & 896) | (i6 & 7168) | ((i3 << 3) & 458752), 16);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier2 = companion;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier2 = modifier;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup == null) {
                            return;
                        }
                        endRestartGroup.updateScope(new BottomSheetScaffoldKt$BottomSheet$4(bottomSheetState, z, function1, shape, f, j, j2, modifier2, function3, i, i2));
                        return;
                    }
                    i5 = 100663296;
                    i3 |= i5;
                    if ((191739611 & i3) == 38347922) {
                    }
                    if (i4 != 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    startRestartGroup.startReplaceableGroup(773894976);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(rememberCoroutineScope)488@20446L144:Effects.kt#9igjgp");
                    startRestartGroup.startReplaceableGroup(-492369756);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == Composer.Companion.getEmpty()) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    CoroutineScope coroutineScope2 = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.startReplaceableGroup(511388516);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
                    changed = startRestartGroup.changed(bottomSheetState) | startRestartGroup.changed(coroutineScope2);
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (!changed) {
                    }
                    rememberedValue2 = BottomSheetScaffoldAnchorChangeCallback(bottomSheetState, coroutineScope2);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                    startRestartGroup.endReplaceableGroup();
                    int i62 = i3 >> 9;
                    SurfaceKt.m1471SurfaceFjzlyU(SemanticsModifierKt.semantics$default(OnRemeasuredModifierKt.onSizeChanged(AnchoredDraggableKt.anchoredDraggable$default(companion, bottomSheetState.getAnchoredDraggableState$material_release(), Orientation.Vertical, z, false, null, 24, null), new BottomSheetScaffoldKt$BottomSheet$1(bottomSheetState, function1, (AnchoredDraggableState.AnchorChangedCallback) rememberedValue2)), false, new BottomSheetScaffoldKt$BottomSheet$2(bottomSheetState, coroutineScope2), 1, null), shape, j, j2, null, f, ComposableLambdaKt.composableLambda(startRestartGroup, 1944994153, true, new BottomSheetScaffoldKt$BottomSheet$3(function3, i3)), startRestartGroup, ((i3 >> 6) & 112) | 1572864 | (i62 & 896) | (i62 & 7168) | ((i3 << 3) & 458752), 16);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier2 = companion;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                if ((i2 & 32) == 0) {
                }
                if ((i2 & 64) == 0) {
                }
                i4 = i2 & 128;
                if (i4 == 0) {
                }
                if ((i2 & 256) != 0) {
                }
                i3 |= i5;
                if ((191739611 & i3) == 38347922) {
                }
                if (i4 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                startRestartGroup.startReplaceableGroup(773894976);
                ComposerKt.sourceInformation(startRestartGroup, "CC(rememberCoroutineScope)488@20446L144:Effects.kt#9igjgp");
                startRestartGroup.startReplaceableGroup(-492369756);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.Companion.getEmpty()) {
                }
                startRestartGroup.endReplaceableGroup();
                CoroutineScope coroutineScope22 = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.startReplaceableGroup(511388516);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
                changed = startRestartGroup.changed(bottomSheetState) | startRestartGroup.changed(coroutineScope22);
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (!changed) {
                }
                rememberedValue2 = BottomSheetScaffoldAnchorChangeCallback(bottomSheetState, coroutineScope22);
                startRestartGroup.updateRememberedValue(rememberedValue2);
                startRestartGroup.endReplaceableGroup();
                int i622 = i3 >> 9;
                SurfaceKt.m1471SurfaceFjzlyU(SemanticsModifierKt.semantics$default(OnRemeasuredModifierKt.onSizeChanged(AnchoredDraggableKt.anchoredDraggable$default(companion, bottomSheetState.getAnchoredDraggableState$material_release(), Orientation.Vertical, z, false, null, 24, null), new BottomSheetScaffoldKt$BottomSheet$1(bottomSheetState, function1, (AnchoredDraggableState.AnchorChangedCallback) rememberedValue2)), false, new BottomSheetScaffoldKt$BottomSheet$2(bottomSheetState, coroutineScope22), 1, null), shape, j, j2, null, f, ComposableLambdaKt.composableLambda(startRestartGroup, 1944994153, true, new BottomSheetScaffoldKt$BottomSheet$3(function3, i3)), startRestartGroup, ((i3 >> 6) & 112) | 1572864 | (i622 & 896) | (i622 & 7168) | ((i3 << 3) & 458752), 16);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier2 = companion;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            if ((i2 & 16) != 0) {
            }
            if ((i2 & 32) == 0) {
            }
            if ((i2 & 64) == 0) {
            }
            i4 = i2 & 128;
            if (i4 == 0) {
            }
            if ((i2 & 256) != 0) {
            }
            i3 |= i5;
            if ((191739611 & i3) == 38347922) {
            }
            if (i4 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.startReplaceableGroup(773894976);
            ComposerKt.sourceInformation(startRestartGroup, "CC(rememberCoroutineScope)488@20446L144:Effects.kt#9igjgp");
            startRestartGroup.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
            rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
            }
            startRestartGroup.endReplaceableGroup();
            CoroutineScope coroutineScope222 = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(511388516);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
            changed = startRestartGroup.changed(bottomSheetState) | startRestartGroup.changed(coroutineScope222);
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (!changed) {
            }
            rememberedValue2 = BottomSheetScaffoldAnchorChangeCallback(bottomSheetState, coroutineScope222);
            startRestartGroup.updateRememberedValue(rememberedValue2);
            startRestartGroup.endReplaceableGroup();
            int i6222 = i3 >> 9;
            SurfaceKt.m1471SurfaceFjzlyU(SemanticsModifierKt.semantics$default(OnRemeasuredModifierKt.onSizeChanged(AnchoredDraggableKt.anchoredDraggable$default(companion, bottomSheetState.getAnchoredDraggableState$material_release(), Orientation.Vertical, z, false, null, 24, null), new BottomSheetScaffoldKt$BottomSheet$1(bottomSheetState, function1, (AnchoredDraggableState.AnchorChangedCallback) rememberedValue2)), false, new BottomSheetScaffoldKt$BottomSheet$2(bottomSheetState, coroutineScope222), 1, null), shape, j, j2, null, f, ComposableLambdaKt.composableLambda(startRestartGroup, 1944994153, true, new BottomSheetScaffoldKt$BottomSheet$3(function3, i3)), startRestartGroup, ((i3 >> 6) & 112) | 1572864 | (i6222 & 896) | (i6222 & 7168) | ((i3 << 3) & 458752), 16);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier2 = companion;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        if ((i2 & 4) == 0) {
        }
        if ((i2 & 8) == 0) {
        }
        if ((i2 & 16) != 0) {
        }
        if ((i2 & 32) == 0) {
        }
        if ((i2 & 64) == 0) {
        }
        i4 = i2 & 128;
        if (i4 == 0) {
        }
        if ((i2 & 256) != 0) {
        }
        i3 |= i5;
        if ((191739611 & i3) == 38347922) {
        }
        if (i4 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        startRestartGroup.startReplaceableGroup(773894976);
        ComposerKt.sourceInformation(startRestartGroup, "CC(rememberCoroutineScope)488@20446L144:Effects.kt#9igjgp");
        startRestartGroup.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
        rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        CoroutineScope coroutineScope2222 = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.startReplaceableGroup(511388516);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
        changed = startRestartGroup.changed(bottomSheetState) | startRestartGroup.changed(coroutineScope2222);
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        rememberedValue2 = BottomSheetScaffoldAnchorChangeCallback(bottomSheetState, coroutineScope2222);
        startRestartGroup.updateRememberedValue(rememberedValue2);
        startRestartGroup.endReplaceableGroup();
        int i62222 = i3 >> 9;
        SurfaceKt.m1471SurfaceFjzlyU(SemanticsModifierKt.semantics$default(OnRemeasuredModifierKt.onSizeChanged(AnchoredDraggableKt.anchoredDraggable$default(companion, bottomSheetState.getAnchoredDraggableState$material_release(), Orientation.Vertical, z, false, null, 24, null), new BottomSheetScaffoldKt$BottomSheet$1(bottomSheetState, function1, (AnchoredDraggableState.AnchorChangedCallback) rememberedValue2)), false, new BottomSheetScaffoldKt$BottomSheet$2(bottomSheetState, coroutineScope2222), 1, null), shape, j, j2, null, f, ComposableLambdaKt.composableLambda(startRestartGroup, 1944994153, true, new BottomSheetScaffoldKt$BottomSheet$3(function3, i3)), startRestartGroup, ((i3 >> 6) & 112) | 1572864 | (i62222 & 896) | (i62222 & 7168) | ((i3 << 3) & 458752), 16);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier2 = companion;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: BottomSheetScaffoldLayout-KCBPh4w  reason: not valid java name */
    public static final void m1268BottomSheetScaffoldLayoutKCBPh4w(Function2<? super Composer, ? super Integer, Unit> function2, Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> function3, Function3<? super Integer, ? super Composer, ? super Integer, Unit> function32, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, float f, int i, Function0<Float> function0, BottomSheetState bottomSheetState, Composer composer, int i2) {
        int i3;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(1621720523);
        ComposerKt.sourceInformation(startRestartGroup, "C(BottomSheetScaffoldLayout)P(8!3,7,5:c#ui.unit.Dp,3:c#material.FabPosition)612@24340L2821,612@24323L2838:BottomSheetScaffold.kt#jmzs0o");
        int i4 = (i2 & 14) == 0 ? (startRestartGroup.changedInstance(function2) ? 4 : 2) | i2 : i2;
        if ((i2 & 112) == 0) {
            i4 |= startRestartGroup.changedInstance(function3) ? 32 : 16;
        }
        if ((i2 & 896) == 0) {
            i4 |= startRestartGroup.changedInstance(function32) ? 256 : 128;
        }
        if ((i2 & 7168) == 0) {
            i4 |= startRestartGroup.changedInstance(function22) ? 2048 : 1024;
        }
        if ((57344 & i2) == 0) {
            i4 |= startRestartGroup.changedInstance(function23) ? 16384 : 8192;
        }
        if ((458752 & i2) == 0) {
            i4 |= startRestartGroup.changed(f) ? 131072 : 65536;
        }
        if ((3670016 & i2) == 0) {
            i4 |= startRestartGroup.changed(i) ? 1048576 : 524288;
        }
        if ((29360128 & i2) == 0) {
            i4 |= startRestartGroup.changedInstance(function0) ? 8388608 : 4194304;
        }
        if ((234881024 & i2) == 0) {
            i4 |= startRestartGroup.changed(bottomSheetState) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        int i5 = i4;
        if ((191739611 & i5) != 38347922 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1621720523, i5, -1, "androidx.compose.material.BottomSheetScaffoldLayout (BottomSheetScaffold.kt:601)");
            }
            Object[] objArr = {function32, function0, function2, function3, Dp.m5605boximpl(f), function22, FabPosition.m1372boximpl(i), function23, bottomSheetState};
            startRestartGroup.startReplaceableGroup(-568225417);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
            boolean z = false;
            for (int i6 = 0; i6 < 9; i6++) {
                z |= startRestartGroup.changed(objArr[i6]);
            }
            BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1 rememberedValue = startRestartGroup.rememberedValue();
            if (z || rememberedValue == Composer.Companion.getEmpty()) {
                i3 = 1;
                composer2 = startRestartGroup;
                rememberedValue = new BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1(function0, function2, function22, i, f, function23, bottomSheetState, function32, i5, function3);
                composer2.updateRememberedValue(rememberedValue);
            } else {
                composer2 = startRestartGroup;
                i3 = 1;
            }
            composer2.endReplaceableGroup();
            SubcomposeLayoutKt.SubcomposeLayout(null, (Function2) rememberedValue, composer2, 0, i3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2(function2, function3, function32, function22, function23, f, i, function0, bottomSheetState, i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NestedScrollConnection ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(AnchoredDraggableState<?> anchoredDraggableState, Orientation orientation) {
        return new BottomSheetScaffoldKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1(anchoredDraggableState, orientation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AnchoredDraggableState.AnchorChangedCallback<BottomSheetValue> BottomSheetScaffoldAnchorChangeCallback(final BottomSheetState bottomSheetState, final CoroutineScope coroutineScope) {
        return new AnchoredDraggableState.AnchorChangedCallback<BottomSheetValue>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffoldAnchorChangeCallback$1

            /* compiled from: BottomSheetScaffold.kt */
            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            /* loaded from: classes.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[BottomSheetValue.values().length];
                    try {
                        iArr[BottomSheetValue.Collapsed.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[BottomSheetValue.Expanded.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            @Override // androidx.compose.material.AnchoredDraggableState.AnchorChangedCallback
            public final void onAnchorsChanged(BottomSheetValue prevTarget, Map<BottomSheetValue, Float> prevAnchors, Map<BottomSheetValue, Float> newAnchors) {
                BottomSheetValue bottomSheetValue;
                Intrinsics.checkNotNullParameter(prevTarget, "prevTarget");
                Intrinsics.checkNotNullParameter(prevAnchors, "prevAnchors");
                Intrinsics.checkNotNullParameter(newAnchors, "newAnchors");
                Float f = prevAnchors.get(prevTarget);
                int i = WhenMappings.$EnumSwitchMapping$0[prevTarget.ordinal()];
                if (i == 1) {
                    bottomSheetValue = BottomSheetValue.Collapsed;
                } else if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                } else {
                    bottomSheetValue = newAnchors.containsKey(BottomSheetValue.Expanded) ? BottomSheetValue.Expanded : BottomSheetValue.Collapsed;
                }
                if (Intrinsics.areEqual(((Number) MapsKt.getValue(newAnchors, bottomSheetValue)).floatValue(), f)) {
                    return;
                }
                if (BottomSheetState.this.isAnimationRunning$material_release()) {
                    BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new BottomSheetScaffoldKt$BottomSheetScaffoldAnchorChangeCallback$1$onAnchorsChanged$1(BottomSheetState.this, bottomSheetValue, null), 3, null);
                } else if (BottomSheetState.this.trySnapTo$material_release(bottomSheetValue)) {
                } else {
                    BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new BottomSheetScaffoldKt$BottomSheetScaffoldAnchorChangeCallback$1$onAnchorsChanged$2(BottomSheetState.this, bottomSheetValue, null), 3, null);
                }
            }
        };
    }
}
