package androidx.compose.material;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.material.AnchoredDraggableState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.google.android.exoplayer2.C;
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
/* compiled from: ModalBottomSheet.kt */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\u001a\u001c\u0010\u0005\u001a\u00020\u00062\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\b2\u0006\u0010\t\u001a\u00020\nH\u0002\u001a\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0007\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002\u001a\u0096\u0001\u0010\u0011\u001a\u00020\u00122\u001c\u0010\u0013\u001a\u0018\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00120\u0014¢\u0006\u0002\b\u0016¢\u0006\u0002\b\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u000e2\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u00012\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020!2\b\b\u0002\u0010#\u001a\u00020!2\u0011\u0010$\u001a\r\u0012\u0004\u0012\u00020\u00120%¢\u0006\u0002\b\u0016H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b&\u0010'\u001a@\u0010(\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020\r2\u000e\b\u0002\u0010*\u001a\b\u0012\u0004\u0012\u00020,0+2\u0014\b\u0002\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u001c0\u00142\b\b\u0002\u0010.\u001a\u00020\u001cH\u0007\u001aH\u0010(\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020\r2\u0006\u0010/\u001a\u0002002\u000e\b\u0002\u0010*\u001a\b\u0012\u0004\u0012\u00020,0+2\u0014\b\u0002\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u001c0\u00142\b\b\u0002\u0010.\u001a\u00020\u001cH\u0007\u001a3\u00101\u001a\u00020\u00122\u0006\u00102\u001a\u00020!2\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u00120%2\u0006\u00104\u001a\u00020\u001cH\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b5\u00106\u001a9\u00107\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020\r2\u000e\b\u0002\u0010*\u001a\b\u0012\u0004\u0012\u00020,0+2\u0012\u00108\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u001c0\u0014H\u0007¢\u0006\u0002\u00109\u001aE\u00107\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020\r2\u000e\b\u0002\u0010*\u001a\b\u0012\u0004\u0012\u00020,0+2\u0014\b\u0002\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u001c0\u00142\b\b\u0002\u0010:\u001a\u00020\u001cH\u0007¢\u0006\u0002\u0010;\u001aA\u00107\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020\r2\u000e\b\u0002\u0010*\u001a\b\u0012\u0004\u0012\u00020,0+2\u0006\u0010:\u001a\u00020\u001c2\u0012\u00108\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u001c0\u0014H\u0007¢\u0006\u0002\u0010<\"\u0013\u0010\u0000\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0003\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0004\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006=²\u0006\n\u0010>\u001a\u00020,X\u008a\u0084\u0002"}, d2 = {"MaxModalBottomSheetWidth", "Landroidx/compose/ui/unit/Dp;", "F", "ModalBottomSheetPositionalThreshold", "ModalBottomSheetVelocityThreshold", "ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "state", "Landroidx/compose/material/AnchoredDraggableState;", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "ModalBottomSheetAnchorChangeCallback", "Landroidx/compose/material/AnchoredDraggableState$AnchorChangedCallback;", "Landroidx/compose/material/ModalBottomSheetValue;", "Landroidx/compose/material/ModalBottomSheetState;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "ModalBottomSheetLayout", "", "sheetContent", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "modifier", "Landroidx/compose/ui/Modifier;", "sheetState", "sheetGesturesEnabled", "", "sheetShape", "Landroidx/compose/ui/graphics/Shape;", "sheetElevation", "sheetBackgroundColor", "Landroidx/compose/ui/graphics/Color;", "sheetContentColor", "scrimColor", FirebaseAnalytics.Param.CONTENT, "Lkotlin/Function0;", "ModalBottomSheetLayout-Gs3lGvM", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Landroidx/compose/material/ModalBottomSheetState;ZLandroidx/compose/ui/graphics/Shape;FJJJLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "ModalBottomSheetState", "initialValue", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "confirmValueChange", "isSkipHalfExpanded", "density", "Landroidx/compose/ui/unit/Density;", "Scrim", "color", "onDismiss", "visible", "Scrim-3J-VO9M", "(JLkotlin/jvm/functions/Function0;ZLandroidx/compose/runtime/Composer;I)V", "rememberModalBottomSheetState", "confirmStateChange", "(Landroidx/compose/material/ModalBottomSheetValue;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/ModalBottomSheetState;", "skipHalfExpanded", "(Landroidx/compose/material/ModalBottomSheetValue;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/ModalBottomSheetState;", "(Landroidx/compose/material/ModalBottomSheetValue;Landroidx/compose/animation/core/AnimationSpec;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/ModalBottomSheetState;", "material_release", "alpha"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ModalBottomSheetKt {
    private static final float ModalBottomSheetPositionalThreshold = Dp.m5607constructorimpl(56);
    private static final float ModalBottomSheetVelocityThreshold = Dp.m5607constructorimpl(125);
    private static final float MaxModalBottomSheetWidth = Dp.m5607constructorimpl(640);

    public static /* synthetic */ ModalBottomSheetState ModalBottomSheetState$default(ModalBottomSheetValue modalBottomSheetValue, Density density, AnimationSpec animationSpec, Function1 function1, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            animationSpec = SwipeableDefaults.INSTANCE.getAnimationSpec();
        }
        if ((i & 8) != 0) {
            function1 = ModalBottomSheetKt$ModalBottomSheetState$1.INSTANCE;
        }
        if ((i & 16) != 0) {
            z = false;
        }
        return ModalBottomSheetState(modalBottomSheetValue, density, animationSpec, function1, z);
    }

    public static final ModalBottomSheetState ModalBottomSheetState(ModalBottomSheetValue initialValue, Density density, AnimationSpec<Float> animationSpec, Function1<? super ModalBottomSheetValue, Boolean> confirmValueChange, boolean z) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(confirmValueChange, "confirmValueChange");
        ModalBottomSheetState modalBottomSheetState = new ModalBottomSheetState(initialValue, animationSpec, z, confirmValueChange);
        modalBottomSheetState.setDensity$material_release(density);
        return modalBottomSheetState;
    }

    public static /* synthetic */ ModalBottomSheetState ModalBottomSheetState$default(ModalBottomSheetValue modalBottomSheetValue, AnimationSpec animationSpec, Function1 function1, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            animationSpec = SwipeableDefaults.INSTANCE.getAnimationSpec();
        }
        if ((i & 4) != 0) {
            function1 = ModalBottomSheetKt$ModalBottomSheetState$3.INSTANCE;
        }
        if ((i & 8) != 0) {
            z = false;
        }
        return ModalBottomSheetState(modalBottomSheetValue, animationSpec, function1, z);
    }

    @Deprecated(message = "This constructor is deprecated. Density must be provided by the component. Please use the constructor that provides a [Density].", replaceWith = @ReplaceWith(expression = "\n            ModalBottomSheetState(\n                initialValue = initialValue,\n                density =,\n                animationSpec = animationSpec,\n                isSkipHalfExpanded = isSkipHalfExpanded,\n                confirmStateChange = confirmValueChange\n            )\n            ", imports = {}))
    public static final ModalBottomSheetState ModalBottomSheetState(ModalBottomSheetValue initialValue, AnimationSpec<Float> animationSpec, Function1<? super ModalBottomSheetValue, Boolean> confirmValueChange, boolean z) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(confirmValueChange, "confirmValueChange");
        return new ModalBottomSheetState(initialValue, animationSpec, z, confirmValueChange);
    }

    public static final ModalBottomSheetState rememberModalBottomSheetState(ModalBottomSheetValue initialValue, AnimationSpec<Float> animationSpec, Function1<? super ModalBottomSheetValue, Boolean> function1, boolean z, Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        composer.startReplaceableGroup(-126412120);
        ComposerKt.sourceInformation(composer, "C(rememberModalBottomSheetState)P(2)442@17797L7:ModalBottomSheet.kt#jmzs0o");
        SpringSpec<Float> animationSpec2 = (i2 & 2) != 0 ? SwipeableDefaults.INSTANCE.getAnimationSpec() : animationSpec;
        ModalBottomSheetKt$rememberModalBottomSheetState$1 modalBottomSheetKt$rememberModalBottomSheetState$1 = (i2 & 4) != 0 ? ModalBottomSheetKt$rememberModalBottomSheetState$1.INSTANCE : function1;
        boolean z2 = (i2 & 8) != 0 ? false : z;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-126412120, i, -1, "androidx.compose.material.rememberModalBottomSheetState (ModalBottomSheet.kt:436)");
        }
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume = composer.consume(CompositionLocalsKt.getLocalDensity());
        ComposerKt.sourceInformationMarkerEnd(composer);
        Density density = (Density) consume;
        composer.startMovableGroup(170051607, initialValue);
        ComposerKt.sourceInformation(composer, "447@18058L646");
        ModalBottomSheetState modalBottomSheetState = (ModalBottomSheetState) RememberSaveableKt.m2907rememberSaveable(new Object[]{initialValue, animationSpec2, Boolean.valueOf(z2), modalBottomSheetKt$rememberModalBottomSheetState$1, density}, ModalBottomSheetState.Companion.Saver(animationSpec2, modalBottomSheetKt$rememberModalBottomSheetState$1, z2, density), (String) null, (Function0<? extends Object>) new ModalBottomSheetKt$rememberModalBottomSheetState$2(initialValue, density, animationSpec2, modalBottomSheetKt$rememberModalBottomSheetState$1, z2), composer, 72, 4);
        composer.endMovableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return modalBottomSheetState;
    }

    @Deprecated(message = "This function is deprecated. confirmStateChange has been renamed to confirmValueChange.", replaceWith = @ReplaceWith(expression = "rememberModalBottomSheetState(initialValue, animationSpec, confirmStateChange, false)", imports = {}))
    public static final ModalBottomSheetState rememberModalBottomSheetState(ModalBottomSheetValue initialValue, AnimationSpec<Float> animationSpec, boolean z, Function1<? super ModalBottomSheetValue, Boolean> confirmStateChange, Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(confirmStateChange, "confirmStateChange");
        composer.startReplaceableGroup(-409288536);
        ComposerKt.sourceInformation(composer, "C(rememberModalBottomSheetState)P(2!1,3)495@20118L185:ModalBottomSheet.kt#jmzs0o");
        if ((i2 & 2) != 0) {
            animationSpec = SwipeableDefaults.INSTANCE.getAnimationSpec();
        }
        AnimationSpec<Float> animationSpec2 = animationSpec;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-409288536, i, -1, "androidx.compose.material.rememberModalBottomSheetState (ModalBottomSheet.kt:490)");
        }
        ModalBottomSheetState rememberModalBottomSheetState = rememberModalBottomSheetState(initialValue, animationSpec2, confirmStateChange, z, composer, (i & 14) | 64 | ((i >> 3) & 896) | ((i << 3) & 7168), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberModalBottomSheetState;
    }

    @Deprecated(message = "This function is deprecated. confirmStateChange has been renamed to confirmValueChange.", replaceWith = @ReplaceWith(expression = "rememberModalBottomSheetState(initialValue, animationSpec, confirmValueChange = confirmStateChange)", imports = {}))
    public static final ModalBottomSheetState rememberModalBottomSheetState(ModalBottomSheetValue initialValue, AnimationSpec<Float> animationSpec, Function1<? super ModalBottomSheetValue, Boolean> confirmStateChange, Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(confirmStateChange, "confirmStateChange");
        composer.startReplaceableGroup(-1928569212);
        ComposerKt.sourceInformation(composer, "C(rememberModalBottomSheetState)P(2)523@21187L174:ModalBottomSheet.kt#jmzs0o");
        if ((i2 & 2) != 0) {
            animationSpec = SwipeableDefaults.INSTANCE.getAnimationSpec();
        }
        AnimationSpec<Float> animationSpec2 = animationSpec;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1928569212, i, -1, "androidx.compose.material.rememberModalBottomSheetState (ModalBottomSheet.kt:519)");
        }
        ModalBottomSheetState rememberModalBottomSheetState = rememberModalBottomSheetState(initialValue, animationSpec2, confirmStateChange, false, composer, (i & 14) | 3136 | (i & 896), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberModalBottomSheetState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:178:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x011d  */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* renamed from: ModalBottomSheetLayout-Gs3lGvM  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1401ModalBottomSheetLayoutGs3lGvM(Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> sheetContent, Modifier modifier, ModalBottomSheetState modalBottomSheetState, boolean z, Shape shape, float f, long j, long j2, long j3, Function2<? super Composer, ? super Integer, Unit> content, Composer composer, int i, int i2) {
        int i3;
        Object obj;
        int i4;
        int i5;
        boolean z2;
        Shape shape2;
        int i6;
        int i7;
        long j4;
        int i8;
        int i9;
        ModalBottomSheetState modalBottomSheetState2;
        CornerBasedShape cornerBasedShape;
        long j5;
        long j6;
        long j7;
        Shape shape3;
        float f2;
        long j8;
        long j9;
        boolean z3;
        ModalBottomSheetState modalBottomSheetState3;
        Object obj2;
        Object rememberedValue;
        boolean changed;
        Object rememberedValue2;
        Composer composer2;
        boolean z4;
        Shape shape4;
        float f3;
        Modifier modifier2;
        long j10;
        long j11;
        long j12;
        ModalBottomSheetState modalBottomSheetState4;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(sheetContent, "sheetContent");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-92970288);
        ComposerKt.sourceInformation(startRestartGroup, "C(ModalBottomSheetLayout)P(4,1,9,7,8,6:c#ui.unit.Dp,3:c#ui.graphics.Color,5:c#ui.graphics.Color,2:c#ui.graphics.Color)565@23318L37,567@23437L6,569@23560L6,570@23607L37,571@23695L10,581@24005L24,583@24104L99,586@24208L4785:ModalBottomSheet.kt#jmzs0o");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changedInstance(sheetContent) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i10 = i2 & 2;
        if (i10 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            obj = modifier;
            i3 |= startRestartGroup.changed(obj) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 != 0) {
                i3 |= 128;
            }
            i5 = i2 & 8;
            if (i5 == 0) {
                i3 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
                z2 = z;
            } else {
                z2 = z;
                if ((i & 7168) == 0) {
                    i3 |= startRestartGroup.changed(z2) ? 2048 : 1024;
                }
            }
            if ((57344 & i) != 0) {
                shape2 = shape;
                i3 |= ((i2 & 16) == 0 && startRestartGroup.changed(shape2)) ? 16384 : 8192;
            } else {
                shape2 = shape;
            }
            i6 = i2 & 32;
            if (i6 == 0) {
                i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((458752 & i) == 0) {
                i3 |= startRestartGroup.changed(f) ? 131072 : 65536;
            }
            if ((3670016 & i) != 0) {
                i7 = i5;
                i3 |= ((i2 & 64) == 0 && startRestartGroup.changed(j)) ? 1048576 : 524288;
            } else {
                i7 = i5;
            }
            if ((29360128 & i) == 0) {
                i3 |= ((i2 & 128) == 0 && startRestartGroup.changed(j2)) ? 8388608 : 4194304;
            }
            if ((234881024 & i) != 0) {
                j4 = j3;
                i3 |= ((i2 & 256) == 0 && startRestartGroup.changed(j4)) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
            } else {
                j4 = j3;
            }
            if ((i2 & 512) != 0) {
                if ((1879048192 & i) == 0) {
                    i8 = startRestartGroup.changedInstance(content) ? 536870912 : 268435456;
                }
                i9 = i3;
                if (i4 == 4 || (1533916891 & i9) != 306783378 || !startRestartGroup.getSkipping()) {
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                        Modifier.Companion companion = i10 != 0 ? Modifier.Companion : obj;
                        if (i4 != 0) {
                            modalBottomSheetState2 = rememberModalBottomSheetState(ModalBottomSheetValue.Hidden, (AnimationSpec<Float>) null, (Function1<? super ModalBottomSheetValue, Boolean>) null, false, startRestartGroup, 6, 14);
                            i9 &= -897;
                        } else {
                            modalBottomSheetState2 = modalBottomSheetState;
                        }
                        if (i7 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 16) != 0) {
                            cornerBasedShape = MaterialTheme.INSTANCE.getShapes(startRestartGroup, 6).getLarge();
                            i9 &= -57345;
                        } else {
                            cornerBasedShape = shape2;
                        }
                        float m1400getElevationD9Ej5fM = i6 != 0 ? ModalBottomSheetDefaults.INSTANCE.m1400getElevationD9Ej5fM() : f;
                        if ((i2 & 64) != 0) {
                            j5 = MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m1313getSurface0d7_KjU();
                            i9 &= -3670017;
                        } else {
                            j5 = j;
                        }
                        if ((i2 & 128) != 0) {
                            j6 = ColorsKt.m1327contentColorForek8zF_U(j5, startRestartGroup, (i9 >> 18) & 14);
                            i9 &= -29360129;
                        } else {
                            j6 = j2;
                        }
                        if ((i2 & 256) != 0) {
                            i9 &= -234881025;
                            shape3 = cornerBasedShape;
                            f2 = m1400getElevationD9Ej5fM;
                            j8 = j5;
                            j9 = j6;
                            z3 = z2;
                            j7 = ModalBottomSheetDefaults.INSTANCE.getScrimColor(startRestartGroup, 6);
                        } else {
                            j7 = j3;
                            shape3 = cornerBasedShape;
                            f2 = m1400getElevationD9Ej5fM;
                            j8 = j5;
                            j9 = j6;
                            z3 = z2;
                        }
                        modalBottomSheetState3 = modalBottomSheetState2;
                        obj2 = companion;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        if (i4 != 0) {
                            i9 &= -897;
                        }
                        if ((i2 & 16) != 0) {
                            i9 &= -57345;
                        }
                        if ((i2 & 64) != 0) {
                            i9 &= -3670017;
                        }
                        if ((i2 & 128) != 0) {
                            i9 &= -29360129;
                        }
                        if ((i2 & 256) != 0) {
                            i9 &= -234881025;
                        }
                        f2 = f;
                        j8 = j;
                        j9 = j2;
                        obj2 = obj;
                        j7 = j4;
                        z3 = z2;
                        shape3 = shape2;
                        modalBottomSheetState3 = modalBottomSheetState;
                    }
                    int i11 = i9;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-92970288, i11, -1, "androidx.compose.material.ModalBottomSheetLayout (ModalBottomSheet.kt:561)");
                    }
                    startRestartGroup.startReplaceableGroup(502769027);
                    ComposerKt.sourceInformation(startRestartGroup, "576@23903L7,577@23919L63");
                    if (modalBottomSheetState3.getDensity$material_release() == null) {
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                        Object consume = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        EffectsKt.SideEffect(new ModalBottomSheetKt$ModalBottomSheetLayout$1(modalBottomSheetState3, (Density) consume), startRestartGroup, 0);
                    }
                    startRestartGroup.endReplaceableGroup();
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
                    Orientation orientation = Orientation.Vertical;
                    startRestartGroup.startReplaceableGroup(511388516);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
                    changed = startRestartGroup.changed(modalBottomSheetState3) | startRestartGroup.changed(coroutineScope);
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (!changed || rememberedValue2 == Composer.Companion.getEmpty()) {
                        rememberedValue2 = ModalBottomSheetAnchorChangeCallback(modalBottomSheetState3, coroutineScope);
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    startRestartGroup.endReplaceableGroup();
                    ModalBottomSheetState modalBottomSheetState5 = modalBottomSheetState3;
                    ModalBottomSheetKt$ModalBottomSheetLayout$2 modalBottomSheetKt$ModalBottomSheetLayout$2 = new ModalBottomSheetKt$ModalBottomSheetLayout$2(z3, modalBottomSheetState3, orientation, shape3, j8, j9, f2, i11, content, j7, coroutineScope, rememberedValue2, sheetContent);
                    composer2 = startRestartGroup;
                    BoxWithConstraintsKt.BoxWithConstraints(obj2, null, false, ComposableLambdaKt.composableLambda(composer2, -1731958854, true, modalBottomSheetKt$ModalBottomSheetLayout$2), composer2, ((i11 >> 3) & 14) | CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z4 = z3;
                    shape4 = shape3;
                    f3 = f2;
                    modifier2 = obj2;
                    j10 = j8;
                    j11 = j9;
                    j12 = j7;
                    modalBottomSheetState4 = modalBottomSheetState5;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    modalBottomSheetState4 = modalBottomSheetState;
                    f3 = f;
                    modifier2 = obj;
                    j12 = j4;
                    z4 = z2;
                    composer2 = startRestartGroup;
                    shape4 = shape2;
                    j10 = j;
                    j11 = j2;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                    return;
                }
                endRestartGroup.updateScope(new ModalBottomSheetKt$ModalBottomSheetLayout$3(sheetContent, modifier2, modalBottomSheetState4, z4, shape4, f3, j10, j11, j12, content, i, i2));
                return;
            }
            i8 = C.ENCODING_PCM_32BIT;
            i3 |= i8;
            i9 = i3;
            if (i4 == 4) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i10 != 0) {
            }
            if (i4 != 0) {
            }
            if (i7 != 0) {
            }
            if ((i2 & 16) != 0) {
            }
            if (i6 != 0) {
            }
            if ((i2 & 64) != 0) {
            }
            if ((i2 & 128) != 0) {
            }
            if ((i2 & 256) != 0) {
            }
            modalBottomSheetState3 = modalBottomSheetState2;
            obj2 = companion;
            int i112 = i9;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.startReplaceableGroup(502769027);
            ComposerKt.sourceInformation(startRestartGroup, "576@23903L7,577@23919L63");
            if (modalBottomSheetState3.getDensity$material_release() == null) {
            }
            startRestartGroup.endReplaceableGroup();
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
            Orientation orientation2 = Orientation.Vertical;
            startRestartGroup.startReplaceableGroup(511388516);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
            changed = startRestartGroup.changed(modalBottomSheetState3) | startRestartGroup.changed(coroutineScope2);
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (!changed) {
            }
            rememberedValue2 = ModalBottomSheetAnchorChangeCallback(modalBottomSheetState3, coroutineScope2);
            startRestartGroup.updateRememberedValue(rememberedValue2);
            startRestartGroup.endReplaceableGroup();
            ModalBottomSheetState modalBottomSheetState52 = modalBottomSheetState3;
            ModalBottomSheetKt$ModalBottomSheetLayout$2 modalBottomSheetKt$ModalBottomSheetLayout$22 = new ModalBottomSheetKt$ModalBottomSheetLayout$2(z3, modalBottomSheetState3, orientation2, shape3, j8, j9, f2, i112, content, j7, coroutineScope2, rememberedValue2, sheetContent);
            composer2 = startRestartGroup;
            BoxWithConstraintsKt.BoxWithConstraints(obj2, null, false, ComposableLambdaKt.composableLambda(composer2, -1731958854, true, modalBottomSheetKt$ModalBottomSheetLayout$22), composer2, ((i112 >> 3) & 14) | CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE, 6);
            if (ComposerKt.isTraceInProgress()) {
            }
            z4 = z3;
            shape4 = shape3;
            f3 = f2;
            modifier2 = obj2;
            j10 = j8;
            j11 = j9;
            j12 = j7;
            modalBottomSheetState4 = modalBottomSheetState52;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        obj = modifier;
        i4 = i2 & 4;
        if (i4 != 0) {
        }
        i5 = i2 & 8;
        if (i5 == 0) {
        }
        if ((57344 & i) != 0) {
        }
        i6 = i2 & 32;
        if (i6 == 0) {
        }
        if ((3670016 & i) != 0) {
        }
        if ((29360128 & i) == 0) {
        }
        if ((234881024 & i) != 0) {
        }
        if ((i2 & 512) != 0) {
        }
        i3 |= i8;
        i9 = i3;
        if (i4 == 4) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i10 != 0) {
        }
        if (i4 != 0) {
        }
        if (i7 != 0) {
        }
        if ((i2 & 16) != 0) {
        }
        if (i6 != 0) {
        }
        if ((i2 & 64) != 0) {
        }
        if ((i2 & 128) != 0) {
        }
        if ((i2 & 256) != 0) {
        }
        modalBottomSheetState3 = modalBottomSheetState2;
        obj2 = companion;
        int i1122 = i9;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        startRestartGroup.startReplaceableGroup(502769027);
        ComposerKt.sourceInformation(startRestartGroup, "576@23903L7,577@23919L63");
        if (modalBottomSheetState3.getDensity$material_release() == null) {
        }
        startRestartGroup.endReplaceableGroup();
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
        Orientation orientation22 = Orientation.Vertical;
        startRestartGroup.startReplaceableGroup(511388516);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
        changed = startRestartGroup.changed(modalBottomSheetState3) | startRestartGroup.changed(coroutineScope22);
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        rememberedValue2 = ModalBottomSheetAnchorChangeCallback(modalBottomSheetState3, coroutineScope22);
        startRestartGroup.updateRememberedValue(rememberedValue2);
        startRestartGroup.endReplaceableGroup();
        ModalBottomSheetState modalBottomSheetState522 = modalBottomSheetState3;
        ModalBottomSheetKt$ModalBottomSheetLayout$2 modalBottomSheetKt$ModalBottomSheetLayout$222 = new ModalBottomSheetKt$ModalBottomSheetLayout$2(z3, modalBottomSheetState3, orientation22, shape3, j8, j9, f2, i1122, content, j7, coroutineScope22, rememberedValue2, sheetContent);
        composer2 = startRestartGroup;
        BoxWithConstraintsKt.BoxWithConstraints(obj2, null, false, ComposableLambdaKt.composableLambda(composer2, -1731958854, true, modalBottomSheetKt$ModalBottomSheetLayout$222), composer2, ((i1122 >> 3) & 14) | CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE, 6);
        if (ComposerKt.isTraceInProgress()) {
        }
        z4 = z3;
        shape4 = shape3;
        f3 = f2;
        modifier2 = obj2;
        j10 = j8;
        j11 = j9;
        j12 = j7;
        modalBottomSheetState4 = modalBottomSheetState522;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Scrim-3J-VO9M  reason: not valid java name */
    public static final void m1402Scrim3JVO9M(long j, Function0<Unit> function0, boolean z, Composer composer, int i) {
        int i2;
        Modifier.Companion companion;
        Composer startRestartGroup = composer.startRestartGroup(-526532668);
        ComposerKt.sourceInformation(startRestartGroup, "C(Scrim)P(0:c#ui.graphics.Color)700@29148L121,704@29295L29,720@29810L62,716@29701L171:ModalBottomSheet.kt#jmzs0o");
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i2 & 731) != 146 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-526532668, i2, -1, "androidx.compose.material.Scrim (ModalBottomSheet.kt:694)");
            }
            if (j != Color.Companion.m3327getUnspecified0d7_KjU()) {
                State<Float> animateFloatAsState = AnimateAsStateKt.animateFloatAsState(z ? 1.0f : 0.0f, new TweenSpec(0, 0, null, 7, null), 0.0f, null, null, startRestartGroup, 48, 28);
                String m1469getString4foXLRw = Strings_androidKt.m1469getString4foXLRw(Strings.Companion.m1463getCloseSheetUdPEhr4(), startRestartGroup, 6);
                startRestartGroup.startReplaceableGroup(1010559499);
                ComposerKt.sourceInformation(startRestartGroup, "707@29432L37,708@29522L121");
                if (z) {
                    Modifier.Companion companion2 = Modifier.Companion;
                    startRestartGroup.startReplaceableGroup(1157296644);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                    boolean changed = startRestartGroup.changed(function0);
                    ModalBottomSheetKt$Scrim$dismissModifier$1$1 rememberedValue = startRestartGroup.rememberedValue();
                    if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                        rememberedValue = new ModalBottomSheetKt$Scrim$dismissModifier$1$1(function0, null);
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    startRestartGroup.endReplaceableGroup();
                    Modifier pointerInput = SuspendingPointerInputFilterKt.pointerInput(companion2, function0, (Function2) rememberedValue);
                    startRestartGroup.startReplaceableGroup(511388516);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
                    boolean changed2 = startRestartGroup.changed(m1469getString4foXLRw) | startRestartGroup.changed(function0);
                    ModalBottomSheetKt$Scrim$dismissModifier$2$1 rememberedValue2 = startRestartGroup.rememberedValue();
                    if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                        rememberedValue2 = new ModalBottomSheetKt$Scrim$dismissModifier$2$1(m1469getString4foXLRw, function0);
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    startRestartGroup.endReplaceableGroup();
                    companion = SemanticsModifierKt.semantics(pointerInput, true, (Function1) rememberedValue2);
                } else {
                    companion = Modifier.Companion;
                }
                startRestartGroup.endReplaceableGroup();
                Modifier then = SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null).then(companion);
                Color m3281boximpl = Color.m3281boximpl(j);
                startRestartGroup.startReplaceableGroup(511388516);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
                boolean changed3 = startRestartGroup.changed(m3281boximpl) | startRestartGroup.changed(animateFloatAsState);
                ModalBottomSheetKt$Scrim$1$1 rememberedValue3 = startRestartGroup.rememberedValue();
                if (changed3 || rememberedValue3 == Composer.Companion.getEmpty()) {
                    rememberedValue3 = new ModalBottomSheetKt$Scrim$1$1(j, animateFloatAsState);
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                startRestartGroup.endReplaceableGroup();
                CanvasKt.Canvas(then, (Function1) rememberedValue3, startRestartGroup, 0);
            }
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
        endRestartGroup.updateScope(new ModalBottomSheetKt$Scrim$2(j, function0, z, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NestedScrollConnection ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(AnchoredDraggableState<?> anchoredDraggableState, Orientation orientation) {
        return new ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1(anchoredDraggableState, orientation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AnchoredDraggableState.AnchorChangedCallback<ModalBottomSheetValue> ModalBottomSheetAnchorChangeCallback(final ModalBottomSheetState modalBottomSheetState, final CoroutineScope coroutineScope) {
        return new AnchoredDraggableState.AnchorChangedCallback<ModalBottomSheetValue>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetAnchorChangeCallback$1

            /* compiled from: ModalBottomSheet.kt */
            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            /* loaded from: classes.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[ModalBottomSheetValue.values().length];
                    try {
                        iArr[ModalBottomSheetValue.Hidden.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[ModalBottomSheetValue.HalfExpanded.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[ModalBottomSheetValue.Expanded.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            @Override // androidx.compose.material.AnchoredDraggableState.AnchorChangedCallback
            public final void onAnchorsChanged(ModalBottomSheetValue prevTarget, Map<ModalBottomSheetValue, Float> prevAnchors, Map<ModalBottomSheetValue, Float> newAnchors) {
                ModalBottomSheetValue modalBottomSheetValue;
                Intrinsics.checkNotNullParameter(prevTarget, "prevTarget");
                Intrinsics.checkNotNullParameter(prevAnchors, "prevAnchors");
                Intrinsics.checkNotNullParameter(newAnchors, "newAnchors");
                Float f = prevAnchors.get(prevTarget);
                int i = WhenMappings.$EnumSwitchMapping$0[prevTarget.ordinal()];
                if (i == 1) {
                    modalBottomSheetValue = ModalBottomSheetValue.Hidden;
                } else if (i == 2 || i == 3) {
                    if (newAnchors.containsKey(ModalBottomSheetValue.HalfExpanded)) {
                        modalBottomSheetValue = ModalBottomSheetValue.HalfExpanded;
                    } else {
                        modalBottomSheetValue = newAnchors.containsKey(ModalBottomSheetValue.Expanded) ? ModalBottomSheetValue.Expanded : ModalBottomSheetValue.Hidden;
                    }
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                if (Intrinsics.areEqual(((Number) MapsKt.getValue(newAnchors, modalBottomSheetValue)).floatValue(), f)) {
                    return;
                }
                if (ModalBottomSheetState.this.isAnimationRunning$material_release()) {
                    BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new ModalBottomSheetKt$ModalBottomSheetAnchorChangeCallback$1$onAnchorsChanged$1(ModalBottomSheetState.this, modalBottomSheetValue, null), 3, null);
                } else if (ModalBottomSheetState.this.trySnapTo$material_release(modalBottomSheetValue)) {
                } else {
                    BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new ModalBottomSheetKt$ModalBottomSheetAnchorChangeCallback$1$onAnchorsChanged$2(ModalBottomSheetState.this, modalBottomSheetValue, null), 3, null);
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float Scrim_3J_VO9M$lambda$2(State<Float> state) {
        return state.getValue().floatValue();
    }
}
