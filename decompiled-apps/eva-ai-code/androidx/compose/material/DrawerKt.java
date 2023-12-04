package androidx.compose.material;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.CanvasKt;
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
import androidx.compose.runtime.saveable.Saver;
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
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: Drawer.kt */
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010$\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0096\u0001\u0010\t\u001a\u00020\n2\u001c\u0010\u000b\u001a\u0018\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n0\f¢\u0006\u0002\b\u000e¢\u0006\u0002\b\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00052\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u001a2\u0011\u0010\u001d\u001a\r\u0012\u0004\u0012\u00020\n0\u001e¢\u0006\u0002\b\u000eH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \u001a\u001e\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"2\u0006\u0010$\u001a\u00020\u00132\u0006\u0010%\u001a\u00020&H\u0002\u001a3\u0010'\u001a\u00020\n2\u0006\u0010(\u001a\u00020\u001a2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\n0\u001e2\u0006\u0010*\u001a\u00020\u0015H\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b+\u0010,\u001a.\u0010-\u001a\u00020\u00132\u0006\u0010.\u001a\u00020#2\u0006\u0010/\u001a\u0002002\u0014\b\u0002\u00101\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00150\fH\u0007\u001a\u0014\u00102\u001a\u0002032\n\u0010$\u001a\u0006\u0012\u0002\b\u000304H\u0002\u001a\u0096\u0001\u00105\u001a\u00020\n2\u001c\u0010\u000b\u001a\u0018\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n0\f¢\u0006\u0002\b\u000e¢\u0006\u0002\b\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u0002062\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00052\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u001a2\u0011\u0010\u001d\u001a\r\u0012\u0004\u0012\u00020\n0\u001e¢\u0006\u0002\b\u000eH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b7\u00108\u001aA\u00109\u001a\u00020\n2\u0006\u0010:\u001a\u00020\u00152\f\u0010;\u001a\b\u0012\u0004\u0012\u00020\n0\u001e2\f\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00020\u001e2\u0006\u0010(\u001a\u00020\u001aH\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b=\u0010>\u001a.\u0010?\u001a\u0010\u0012\u0004\u0012\u00020#\u0012\u0006\u0012\u0004\u0018\u00010\u00020@2\u0006\u0010A\u001a\u00020\u00022\u0006\u0010B\u001a\u00020\u00022\u0006\u0010C\u001a\u00020\u0015H\u0002\u001a \u0010D\u001a\u00020\u00022\u0006\u0010E\u001a\u00020\u00022\u0006\u0010F\u001a\u00020\u00022\u0006\u0010G\u001a\u00020\u0002H\u0002\u001a+\u0010H\u001a\u00020\u00132\u0006\u0010.\u001a\u00020#2\u0014\b\u0002\u00101\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00150\fH\u0007¢\u0006\u0002\u0010I\u001a+\u0010J\u001a\u0002062\u0006\u0010.\u001a\u00020K2\u0014\b\u0002\u00101\u001a\u000e\u0012\u0004\u0012\u00020K\u0012\u0004\u0012\u00020\u00150\fH\u0007¢\u0006\u0002\u0010L\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0002X\u0082T¢\u0006\u0002\n\u0000\"\u0013\u0010\u0004\u001a\u00020\u0005X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0006\"\u0013\u0010\u0007\u001a\u00020\u0005X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0006\"\u0013\u0010\b\u001a\u00020\u0005X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0006\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006M²\u0006\n\u0010N\u001a\u00020\u0002X\u008a\u0084\u0002"}, d2 = {"AnimationSpec", "Landroidx/compose/animation/core/TweenSpec;", "", "BottomDrawerOpenFraction", "DrawerPositionalThreshold", "Landroidx/compose/ui/unit/Dp;", "F", "DrawerVelocityThreshold", "EndDrawerPadding", "BottomDrawer", "", "drawerContent", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "modifier", "Landroidx/compose/ui/Modifier;", "drawerState", "Landroidx/compose/material/BottomDrawerState;", "gesturesEnabled", "", "drawerShape", "Landroidx/compose/ui/graphics/Shape;", "drawerElevation", "drawerBackgroundColor", "Landroidx/compose/ui/graphics/Color;", "drawerContentColor", "scrimColor", FirebaseAnalytics.Param.CONTENT, "Lkotlin/Function0;", "BottomDrawer-Gs3lGvM", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Landroidx/compose/material/BottomDrawerState;ZLandroidx/compose/ui/graphics/Shape;FJJJLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "BottomDrawerAnchorChangeCallback", "Landroidx/compose/material/AnchoredDraggableState$AnchorChangedCallback;", "Landroidx/compose/material/BottomDrawerValue;", "state", "scope", "Lkotlinx/coroutines/CoroutineScope;", "BottomDrawerScrim", "color", "onDismiss", "visible", "BottomDrawerScrim-3J-VO9M", "(JLkotlin/jvm/functions/Function0;ZLandroidx/compose/runtime/Composer;I)V", "BottomDrawerState", "initialValue", "density", "Landroidx/compose/ui/unit/Density;", "confirmStateChange", "ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "Landroidx/compose/material/AnchoredDraggableState;", "ModalDrawer", "Landroidx/compose/material/DrawerState;", "ModalDrawer-Gs3lGvM", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Landroidx/compose/material/DrawerState;ZLandroidx/compose/ui/graphics/Shape;FJJJLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Scrim", "open", "onClose", "fraction", "Scrim-Bx497Mc", "(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;JLandroidx/compose/runtime/Composer;I)V", "calculateAnchors", "", "fullHeight", "drawerHeight", "isLandscape", "calculateFraction", "a", "b", "pos", "rememberBottomDrawerState", "(Landroidx/compose/material/BottomDrawerValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/BottomDrawerState;", "rememberDrawerState", "Landroidx/compose/material/DrawerValue;", "(Landroidx/compose/material/DrawerValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/DrawerState;", "material_release", "alpha"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DrawerKt {
    private static final float BottomDrawerOpenFraction = 0.5f;
    private static final float DrawerPositionalThreshold;
    private static final float EndDrawerPadding;
    private static final float DrawerVelocityThreshold = Dp.m5607constructorimpl(400);
    private static final TweenSpec<Float> AnimationSpec = new TweenSpec<>(256, 0, null, 6, null);

    public static /* synthetic */ BottomDrawerState BottomDrawerState$default(BottomDrawerValue bottomDrawerValue, Density density, Function1 function1, int i, Object obj) {
        if ((i & 4) != 0) {
            function1 = DrawerKt$BottomDrawerState$1.INSTANCE;
        }
        return BottomDrawerState(bottomDrawerValue, density, function1);
    }

    public static final BottomDrawerState BottomDrawerState(BottomDrawerValue initialValue, Density density, Function1<? super BottomDrawerValue, Boolean> confirmStateChange) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(confirmStateChange, "confirmStateChange");
        BottomDrawerState bottomDrawerState = new BottomDrawerState(initialValue, confirmStateChange);
        bottomDrawerState.setDensity$material_release(density);
        return bottomDrawerState;
    }

    public static final DrawerState rememberDrawerState(DrawerValue initialValue, Function1<? super DrawerValue, Boolean> function1, Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        composer.startReplaceableGroup(-1435874229);
        ComposerKt.sourceInformation(composer, "C(rememberDrawerState)P(1)455@15934L61,455@15870L125:Drawer.kt#jmzs0o");
        if ((i2 & 2) != 0) {
            function1 = DrawerKt$rememberDrawerState$1.INSTANCE;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1435874229, i, -1, "androidx.compose.material.rememberDrawerState (Drawer.kt:451)");
        }
        Object[] objArr = new Object[0];
        Saver<DrawerState, DrawerValue> Saver = DrawerState.Companion.Saver(function1);
        composer.startReplaceableGroup(511388516);
        ComposerKt.sourceInformation(composer, "CC(remember)P(1,2):Composables.kt#9igjgp");
        boolean changed = composer.changed(initialValue) | composer.changed(function1);
        DrawerKt$rememberDrawerState$2$1 rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new DrawerKt$rememberDrawerState$2$1(initialValue, function1);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        DrawerState drawerState = (DrawerState) RememberSaveableKt.m2907rememberSaveable(objArr, Saver, (String) null, (Function0<? extends Object>) rememberedValue, composer, 72, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return drawerState;
    }

    public static final BottomDrawerState rememberBottomDrawerState(BottomDrawerValue initialValue, Function1<? super BottomDrawerValue, Boolean> function1, Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        composer.startReplaceableGroup(-598115156);
        ComposerKt.sourceInformation(composer, "C(rememberBottomDrawerState)P(1)472@16436L7,473@16543L76,473@16455L164:Drawer.kt#jmzs0o");
        if ((i2 & 2) != 0) {
            function1 = DrawerKt$rememberBottomDrawerState$1.INSTANCE;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-598115156, i, -1, "androidx.compose.material.rememberBottomDrawerState (Drawer.kt:468)");
        }
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume = composer.consume(CompositionLocalsKt.getLocalDensity());
        ComposerKt.sourceInformationMarkerEnd(composer);
        Density density = (Density) consume;
        Object[] objArr = {density};
        Saver<BottomDrawerState, BottomDrawerValue> Saver = BottomDrawerState.Companion.Saver(density, function1);
        composer.startReplaceableGroup(1618982084);
        ComposerKt.sourceInformation(composer, "CC(remember)P(1,2,3):Composables.kt#9igjgp");
        boolean changed = composer.changed(initialValue) | composer.changed(density) | composer.changed(function1);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = (Function0) new DrawerKt$rememberBottomDrawerState$2$1(initialValue, density, function1);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        BottomDrawerState bottomDrawerState = (BottomDrawerState) RememberSaveableKt.m2907rememberSaveable(objArr, Saver, (String) null, (Function0<? extends Object>) rememberedValue, composer, 72, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return bottomDrawerState;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:181:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x011f  */
    /* renamed from: ModalDrawer-Gs3lGvM  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1352ModalDrawerGs3lGvM(Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> drawerContent, Modifier modifier, DrawerState drawerState, boolean z, Shape shape, float f, long j, long j2, long j3, Function2<? super Composer, ? super Integer, Unit> content, Composer composer, int i, int i2) {
        int i3;
        Object obj;
        Object obj2;
        int i4;
        boolean z2;
        Object obj3;
        int i5;
        float f2;
        int i6;
        int i7;
        DrawerState drawerState2;
        CornerBasedShape cornerBasedShape;
        long j4;
        long j5;
        long j6;
        Object obj4;
        float f3;
        long j7;
        long j8;
        Object obj5;
        Object obj6;
        boolean z3;
        int i8;
        Object rememberedValue;
        Composer composer2;
        DrawerState drawerState3;
        boolean z4;
        Shape shape2;
        float f4;
        long j9;
        long j10;
        long j11;
        Modifier modifier2;
        ScopeUpdateScope endRestartGroup;
        int i9;
        int i10;
        int i11;
        Intrinsics.checkNotNullParameter(drawerContent, "drawerContent");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(1305806945);
        ComposerKt.sourceInformation(startRestartGroup, "C(ModalDrawer)P(2,8,6,7,5,4:c#ui.unit.Dp,1:c#ui.graphics.Color,3:c#ui.graphics.Color,9:c#ui.graphics.Color)512@18429L39,514@18546L6,516@18661L6,517@18709L38,518@18788L10,521@18856L24,522@18885L3435:Drawer.kt#jmzs0o");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changedInstance(drawerContent) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i12 = i2 & 2;
        if (i12 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            obj = modifier;
            i3 |= startRestartGroup.changed(obj) ? 32 : 16;
            if ((i & 896) != 0) {
                if ((i2 & 4) == 0) {
                    obj2 = drawerState;
                    if (startRestartGroup.changed(obj2)) {
                        i11 = 256;
                        i3 |= i11;
                    }
                } else {
                    obj2 = drawerState;
                }
                i11 = 128;
                i3 |= i11;
            } else {
                obj2 = drawerState;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
            } else if ((i & 7168) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 2048 : 1024;
                if ((57344 & i) == 0) {
                    if ((i2 & 16) == 0) {
                        obj3 = shape;
                        if (startRestartGroup.changed(obj3)) {
                            i10 = 16384;
                            i3 |= i10;
                        }
                    } else {
                        obj3 = shape;
                    }
                    i10 = 8192;
                    i3 |= i10;
                } else {
                    obj3 = shape;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((458752 & i) == 0) {
                    f2 = f;
                    i3 |= startRestartGroup.changed(f2) ? 131072 : 65536;
                    if ((i & 3670016) != 0) {
                        if ((i2 & 64) == 0) {
                            i6 = i12;
                            if (startRestartGroup.changed(j)) {
                                i9 = 1048576;
                                i3 |= i9;
                            }
                        } else {
                            i6 = i12;
                        }
                        i9 = 524288;
                        i3 |= i9;
                    } else {
                        i6 = i12;
                    }
                    if ((i & 29360128) == 0) {
                        i3 |= ((i2 & 128) == 0 && startRestartGroup.changed(j2)) ? 8388608 : 4194304;
                    }
                    if ((234881024 & i) == 0) {
                        i3 |= ((i2 & 256) == 0 && startRestartGroup.changed(j3)) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                    }
                    if ((i2 & 512) != 0) {
                        if ((1879048192 & i) == 0) {
                            i7 = startRestartGroup.changedInstance(content) ? 536870912 : 268435456;
                        }
                        if ((1533916891 & i3) == 306783378 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                Modifier.Companion companion = i6 != 0 ? Modifier.Companion : obj;
                                if ((i2 & 4) != 0) {
                                    drawerState2 = rememberDrawerState(DrawerValue.Closed, null, startRestartGroup, 6, 2);
                                    i3 &= -897;
                                } else {
                                    drawerState2 = obj2;
                                }
                                if (i4 != 0) {
                                    z2 = true;
                                }
                                if ((i2 & 16) != 0) {
                                    cornerBasedShape = MaterialTheme.INSTANCE.getShapes(startRestartGroup, 6).getLarge();
                                    i3 &= -57345;
                                } else {
                                    cornerBasedShape = obj3;
                                }
                                float m1349getElevationD9Ej5fM = i5 != 0 ? DrawerDefaults.INSTANCE.m1349getElevationD9Ej5fM() : f2;
                                if ((i2 & 64) != 0) {
                                    j4 = MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m1313getSurface0d7_KjU();
                                    i3 &= -3670017;
                                } else {
                                    j4 = j;
                                }
                                if ((i2 & 128) != 0) {
                                    j5 = ColorsKt.m1327contentColorForek8zF_U(j4, startRestartGroup, (i3 >> 18) & 14);
                                    i3 &= -29360129;
                                } else {
                                    j5 = j2;
                                }
                                if ((i2 & 256) != 0) {
                                    i3 &= -234881025;
                                    obj4 = cornerBasedShape;
                                    j8 = j5;
                                    j6 = DrawerDefaults.INSTANCE.getScrimColor(startRestartGroup, 6);
                                    obj6 = drawerState2;
                                    f3 = m1349getElevationD9Ej5fM;
                                    z3 = z2;
                                    j7 = j4;
                                    obj5 = companion;
                                } else {
                                    j6 = j3;
                                    obj4 = cornerBasedShape;
                                    f3 = m1349getElevationD9Ej5fM;
                                    j7 = j4;
                                    j8 = j5;
                                    obj5 = companion;
                                    obj6 = drawerState2;
                                    z3 = z2;
                                }
                                i8 = i3;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i2 & 4) != 0) {
                                    i3 &= -897;
                                }
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                }
                                if ((i2 & 64) != 0) {
                                    i3 &= -3670017;
                                }
                                if ((i2 & 128) != 0) {
                                    i3 &= -29360129;
                                }
                                if ((i2 & 256) != 0) {
                                    j7 = j;
                                    j8 = j2;
                                    j6 = j3;
                                    i8 = (-234881025) & i3;
                                } else {
                                    j7 = j;
                                    j8 = j2;
                                    j6 = j3;
                                    i8 = i3;
                                }
                                obj5 = obj;
                                obj6 = obj2;
                                z3 = z2;
                                obj4 = obj3;
                                f3 = f2;
                            }
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1305806945, i8, -1, "androidx.compose.material.ModalDrawer (Drawer.kt:509)");
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
                            Modifier modifier3 = obj5;
                            composer2 = startRestartGroup;
                            BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxSize$default(obj5, 0.0f, 1, null), null, false, ComposableLambdaKt.composableLambda(composer2, 816674999, true, new DrawerKt$ModalDrawer$1(obj6, z3, i8, j6, obj4, j7, j8, f3, content, coroutineScope, drawerContent)), composer2, CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE, 6);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            drawerState3 = obj6;
                            z4 = z3;
                            shape2 = obj4;
                            f4 = f3;
                            j9 = j7;
                            j10 = j8;
                            j11 = j6;
                            modifier2 = modifier3;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier2 = obj;
                            drawerState3 = obj2;
                            z4 = z2;
                            shape2 = obj3;
                            f4 = f2;
                            composer2 = startRestartGroup;
                            j9 = j;
                            j10 = j2;
                            j11 = j3;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                            return;
                        }
                        endRestartGroup.updateScope(new DrawerKt$ModalDrawer$2(drawerContent, modifier2, drawerState3, z4, shape2, f4, j9, j10, j11, content, i, i2));
                        return;
                    }
                    i7 = C.ENCODING_PCM_32BIT;
                    i3 |= i7;
                    if ((1533916891 & i3) == 306783378) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if ((i2 & 4) != 0) {
                    }
                    if (i4 != 0) {
                    }
                    if ((i2 & 16) != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if ((i2 & 64) != 0) {
                    }
                    if ((i2 & 128) != 0) {
                    }
                    if ((i2 & 256) != 0) {
                    }
                    i8 = i3;
                    startRestartGroup.endDefaults();
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
                    Modifier modifier32 = obj5;
                    composer2 = startRestartGroup;
                    BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxSize$default(obj5, 0.0f, 1, null), null, false, ComposableLambdaKt.composableLambda(composer2, 816674999, true, new DrawerKt$ModalDrawer$1(obj6, z3, i8, j6, obj4, j7, j8, f3, content, coroutineScope2, drawerContent)), composer2, CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE, 6);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    drawerState3 = obj6;
                    z4 = z3;
                    shape2 = obj4;
                    f4 = f3;
                    j9 = j7;
                    j10 = j8;
                    j11 = j6;
                    modifier2 = modifier32;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                f2 = f;
                if ((i & 3670016) != 0) {
                }
                if ((i & 29360128) == 0) {
                }
                if ((234881024 & i) == 0) {
                }
                if ((i2 & 512) != 0) {
                }
                i3 |= i7;
                if ((1533916891 & i3) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i6 != 0) {
                }
                if ((i2 & 4) != 0) {
                }
                if (i4 != 0) {
                }
                if ((i2 & 16) != 0) {
                }
                if (i5 != 0) {
                }
                if ((i2 & 64) != 0) {
                }
                if ((i2 & 128) != 0) {
                }
                if ((i2 & 256) != 0) {
                }
                i8 = i3;
                startRestartGroup.endDefaults();
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
                Modifier modifier322 = obj5;
                composer2 = startRestartGroup;
                BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxSize$default(obj5, 0.0f, 1, null), null, false, ComposableLambdaKt.composableLambda(composer2, 816674999, true, new DrawerKt$ModalDrawer$1(obj6, z3, i8, j6, obj4, j7, j8, f3, content, coroutineScope22, drawerContent)), composer2, CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE, 6);
                if (ComposerKt.isTraceInProgress()) {
                }
                drawerState3 = obj6;
                z4 = z3;
                shape2 = obj4;
                f4 = f3;
                j9 = j7;
                j10 = j8;
                j11 = j6;
                modifier2 = modifier322;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z2 = z;
            if ((57344 & i) == 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            f2 = f;
            if ((i & 3670016) != 0) {
            }
            if ((i & 29360128) == 0) {
            }
            if ((234881024 & i) == 0) {
            }
            if ((i2 & 512) != 0) {
            }
            i3 |= i7;
            if ((1533916891 & i3) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i6 != 0) {
            }
            if ((i2 & 4) != 0) {
            }
            if (i4 != 0) {
            }
            if ((i2 & 16) != 0) {
            }
            if (i5 != 0) {
            }
            if ((i2 & 64) != 0) {
            }
            if ((i2 & 128) != 0) {
            }
            if ((i2 & 256) != 0) {
            }
            i8 = i3;
            startRestartGroup.endDefaults();
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
            Modifier modifier3222 = obj5;
            composer2 = startRestartGroup;
            BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxSize$default(obj5, 0.0f, 1, null), null, false, ComposableLambdaKt.composableLambda(composer2, 816674999, true, new DrawerKt$ModalDrawer$1(obj6, z3, i8, j6, obj4, j7, j8, f3, content, coroutineScope222, drawerContent)), composer2, CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE, 6);
            if (ComposerKt.isTraceInProgress()) {
            }
            drawerState3 = obj6;
            z4 = z3;
            shape2 = obj4;
            f4 = f3;
            j9 = j7;
            j10 = j8;
            j11 = j6;
            modifier2 = modifier3222;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        obj = modifier;
        if ((i & 896) != 0) {
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z2 = z;
        if ((57344 & i) == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        f2 = f;
        if ((i & 3670016) != 0) {
        }
        if ((i & 29360128) == 0) {
        }
        if ((234881024 & i) == 0) {
        }
        if ((i2 & 512) != 0) {
        }
        i3 |= i7;
        if ((1533916891 & i3) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i6 != 0) {
        }
        if ((i2 & 4) != 0) {
        }
        if (i4 != 0) {
        }
        if ((i2 & 16) != 0) {
        }
        if (i5 != 0) {
        }
        if ((i2 & 64) != 0) {
        }
        if ((i2 & 128) != 0) {
        }
        if ((i2 & 256) != 0) {
        }
        i8 = i3;
        startRestartGroup.endDefaults();
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
        Modifier modifier32222 = obj5;
        composer2 = startRestartGroup;
        BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxSize$default(obj5, 0.0f, 1, null), null, false, ComposableLambdaKt.composableLambda(composer2, 816674999, true, new DrawerKt$ModalDrawer$1(obj6, z3, i8, j6, obj4, j7, j8, f3, content, coroutineScope2222, drawerContent)), composer2, CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE, 6);
        if (ComposerKt.isTraceInProgress()) {
        }
        drawerState3 = obj6;
        z4 = z3;
        shape2 = obj4;
        f4 = f3;
        j9 = j7;
        j10 = j8;
        j11 = j6;
        modifier2 = modifier32222;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:177:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0117  */
    /* renamed from: BottomDrawer-Gs3lGvM  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1350BottomDrawerGs3lGvM(Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> drawerContent, Modifier modifier, BottomDrawerState bottomDrawerState, boolean z, Shape shape, float f, long j, long j2, long j3, Function2<? super Composer, ? super Integer, Unit> content, Composer composer, int i, int i2) {
        int i3;
        Object obj;
        int i4;
        int i5;
        boolean z2;
        Object obj2;
        int i6;
        int i7;
        long j4;
        int i8;
        Object obj3;
        BottomDrawerState bottomDrawerState2;
        CornerBasedShape cornerBasedShape;
        long j5;
        long j6;
        long j7;
        boolean z3;
        long j8;
        long j9;
        Modifier modifier2;
        BottomDrawerState bottomDrawerState3;
        Object obj4;
        float f2;
        int i9;
        Object rememberedValue;
        Composer composer2;
        boolean z4;
        Shape shape2;
        float f3;
        BottomDrawerState bottomDrawerState4;
        long j10;
        long j11;
        long j12;
        Modifier modifier3;
        ScopeUpdateScope endRestartGroup;
        int i10;
        int i11;
        int i12;
        Intrinsics.checkNotNullParameter(drawerContent, "drawerContent");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(625649286);
        ComposerKt.sourceInformation(startRestartGroup, "C(BottomDrawer)P(2,8,6,7,5,4:c#ui.unit.Dp,1:c#ui.graphics.Color,3:c#ui.graphics.Color,9:c#ui.graphics.Color)643@24199L33,645@24310L6,647@24425L6,648@24473L38,649@24552L10,659@24864L24,661@24894L3701:Drawer.kt#jmzs0o");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changedInstance(drawerContent) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i13 = i2 & 2;
        if (i13 != 0) {
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
            } else if ((i & 7168) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 2048 : 1024;
                if ((57344 & i) == 0) {
                    if ((i2 & 16) == 0) {
                        obj2 = shape;
                        if (startRestartGroup.changed(obj2)) {
                            i12 = 16384;
                            i3 |= i12;
                        }
                    } else {
                        obj2 = shape;
                    }
                    i12 = 8192;
                    i3 |= i12;
                } else {
                    obj2 = shape;
                }
                i6 = i2 & 32;
                if (i6 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i & 458752) == 0) {
                    i3 |= startRestartGroup.changed(f) ? 131072 : 65536;
                }
                if ((i & 3670016) == 0) {
                    if ((i2 & 64) == 0) {
                        i7 = i13;
                        if (startRestartGroup.changed(j)) {
                            i11 = 1048576;
                            i3 |= i11;
                        }
                    } else {
                        i7 = i13;
                    }
                    i11 = 524288;
                    i3 |= i11;
                } else {
                    i7 = i13;
                }
                if ((i & 29360128) == 0) {
                    if ((i2 & 128) == 0 && startRestartGroup.changed(j2)) {
                        i10 = 8388608;
                        i3 |= i10;
                    }
                    i10 = 4194304;
                    i3 |= i10;
                }
                if ((234881024 & i) == 0) {
                    j4 = j3;
                    i3 |= ((i2 & 256) == 0 && startRestartGroup.changed(j4)) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                } else {
                    j4 = j3;
                }
                if ((i2 & 512) == 0) {
                    if ((1879048192 & i) == 0) {
                        i8 = startRestartGroup.changedInstance(content) ? 536870912 : 268435456;
                    }
                    if (i4 == 4 || (1533916891 & i3) != 306783378 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            Modifier.Companion companion = i7 == 0 ? Modifier.Companion : obj;
                            if (i4 == 0) {
                                obj3 = companion;
                                bottomDrawerState2 = rememberBottomDrawerState(BottomDrawerValue.Closed, null, startRestartGroup, 6, 2);
                                i3 &= -897;
                            } else {
                                obj3 = companion;
                                bottomDrawerState2 = bottomDrawerState;
                            }
                            if (i5 != 0) {
                                z2 = true;
                            }
                            if ((i2 & 16) == 0) {
                                cornerBasedShape = MaterialTheme.INSTANCE.getShapes(startRestartGroup, 6).getLarge();
                                i3 &= -57345;
                            } else {
                                cornerBasedShape = obj2;
                            }
                            float m1349getElevationD9Ej5fM = i6 == 0 ? DrawerDefaults.INSTANCE.m1349getElevationD9Ej5fM() : f;
                            if ((i2 & 64) == 0) {
                                j5 = MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m1313getSurface0d7_KjU();
                                i3 &= -3670017;
                            } else {
                                j5 = j;
                            }
                            if ((i2 & 128) == 0) {
                                j6 = ColorsKt.m1327contentColorForek8zF_U(j5, startRestartGroup, (i3 >> 18) & 14);
                                i3 &= -29360129;
                            } else {
                                j6 = j2;
                            }
                            if ((i2 & 256) != 0) {
                                j4 = DrawerDefaults.INSTANCE.getScrimColor(startRestartGroup, 6);
                                i3 &= -234881025;
                            }
                            j7 = j4;
                            z3 = z2;
                            j8 = j5;
                            j9 = j6;
                            modifier2 = obj3;
                            bottomDrawerState3 = bottomDrawerState2;
                            obj4 = cornerBasedShape;
                            f2 = m1349getElevationD9Ej5fM;
                            i9 = i3;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if (i4 != 0) {
                                i3 &= -897;
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                            }
                            if ((i2 & 128) != 0) {
                                i3 &= -29360129;
                            }
                            if ((i2 & 256) != 0) {
                                bottomDrawerState3 = bottomDrawerState;
                                f2 = f;
                                j8 = j;
                                j9 = j2;
                                i9 = (-234881025) & i3;
                            } else {
                                bottomDrawerState3 = bottomDrawerState;
                                f2 = f;
                                j8 = j;
                                j9 = j2;
                                i9 = i3;
                            }
                            j7 = j4;
                            z3 = z2;
                            obj4 = obj2;
                            modifier2 = obj;
                        }
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(625649286, i9, -1, "androidx.compose.material.BottomDrawer (Drawer.kt:640)");
                        }
                        startRestartGroup.startReplaceableGroup(-1561647407);
                        ComposerKt.sourceInformation(startRestartGroup, "654@24761L7,655@24777L64");
                        if (bottomDrawerState3.getDensity$material_release() == null) {
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                            Object consume = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            EffectsKt.SideEffect(new DrawerKt$BottomDrawer$1(bottomDrawerState3, (Density) consume), startRestartGroup, 0);
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
                        Modifier modifier4 = modifier2;
                        BottomDrawerState bottomDrawerState5 = bottomDrawerState3;
                        composer2 = startRestartGroup;
                        BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxSize$default(modifier2, 0.0f, 1, null), null, false, ComposableLambdaKt.composableLambda(composer2, 1220102512, true, new DrawerKt$BottomDrawer$2(z3, bottomDrawerState3, content, i9, j7, coroutineScope, obj4, j8, j9, f2, drawerContent)), composer2, CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE, 6);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z4 = z3;
                        shape2 = obj4;
                        f3 = f2;
                        bottomDrawerState4 = bottomDrawerState5;
                        j10 = j8;
                        j11 = j9;
                        j12 = j7;
                        modifier3 = modifier4;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        f3 = f;
                        z4 = z2;
                        composer2 = startRestartGroup;
                        j10 = j;
                        j12 = j4;
                        modifier3 = obj;
                        shape2 = obj2;
                        bottomDrawerState4 = bottomDrawerState;
                        j11 = j2;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                        return;
                    }
                    endRestartGroup.updateScope(new DrawerKt$BottomDrawer$3(drawerContent, modifier3, bottomDrawerState4, z4, shape2, f3, j10, j11, j12, content, i, i2));
                    return;
                }
                i8 = C.ENCODING_PCM_32BIT;
                i3 |= i8;
                if (i4 == 4) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i7 == 0) {
                }
                if (i4 == 0) {
                }
                if (i5 != 0) {
                }
                if ((i2 & 16) == 0) {
                }
                if (i6 == 0) {
                }
                if ((i2 & 64) == 0) {
                }
                if ((i2 & 128) == 0) {
                }
                if ((i2 & 256) != 0) {
                }
                j7 = j4;
                z3 = z2;
                j8 = j5;
                j9 = j6;
                modifier2 = obj3;
                bottomDrawerState3 = bottomDrawerState2;
                obj4 = cornerBasedShape;
                f2 = m1349getElevationD9Ej5fM;
                i9 = i3;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                startRestartGroup.startReplaceableGroup(-1561647407);
                ComposerKt.sourceInformation(startRestartGroup, "654@24761L7,655@24777L64");
                if (bottomDrawerState3.getDensity$material_release() == null) {
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
                Modifier modifier42 = modifier2;
                BottomDrawerState bottomDrawerState52 = bottomDrawerState3;
                composer2 = startRestartGroup;
                BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxSize$default(modifier2, 0.0f, 1, null), null, false, ComposableLambdaKt.composableLambda(composer2, 1220102512, true, new DrawerKt$BottomDrawer$2(z3, bottomDrawerState3, content, i9, j7, coroutineScope2, obj4, j8, j9, f2, drawerContent)), composer2, CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE, 6);
                if (ComposerKt.isTraceInProgress()) {
                }
                z4 = z3;
                shape2 = obj4;
                f3 = f2;
                bottomDrawerState4 = bottomDrawerState52;
                j10 = j8;
                j11 = j9;
                j12 = j7;
                modifier3 = modifier42;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            z2 = z;
            if ((57344 & i) == 0) {
            }
            i6 = i2 & 32;
            if (i6 != 0) {
            }
            if ((i & 3670016) == 0) {
            }
            if ((i & 29360128) == 0) {
            }
            if ((234881024 & i) == 0) {
            }
            if ((i2 & 512) == 0) {
            }
            i3 |= i8;
            if (i4 == 4) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i7 == 0) {
            }
            if (i4 == 0) {
            }
            if (i5 != 0) {
            }
            if ((i2 & 16) == 0) {
            }
            if (i6 == 0) {
            }
            if ((i2 & 64) == 0) {
            }
            if ((i2 & 128) == 0) {
            }
            if ((i2 & 256) != 0) {
            }
            j7 = j4;
            z3 = z2;
            j8 = j5;
            j9 = j6;
            modifier2 = obj3;
            bottomDrawerState3 = bottomDrawerState2;
            obj4 = cornerBasedShape;
            f2 = m1349getElevationD9Ej5fM;
            i9 = i3;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.startReplaceableGroup(-1561647407);
            ComposerKt.sourceInformation(startRestartGroup, "654@24761L7,655@24777L64");
            if (bottomDrawerState3.getDensity$material_release() == null) {
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
            Modifier modifier422 = modifier2;
            BottomDrawerState bottomDrawerState522 = bottomDrawerState3;
            composer2 = startRestartGroup;
            BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxSize$default(modifier2, 0.0f, 1, null), null, false, ComposableLambdaKt.composableLambda(composer2, 1220102512, true, new DrawerKt$BottomDrawer$2(z3, bottomDrawerState3, content, i9, j7, coroutineScope22, obj4, j8, j9, f2, drawerContent)), composer2, CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE, 6);
            if (ComposerKt.isTraceInProgress()) {
            }
            z4 = z3;
            shape2 = obj4;
            f3 = f2;
            bottomDrawerState4 = bottomDrawerState522;
            j10 = j8;
            j11 = j9;
            j12 = j7;
            modifier3 = modifier422;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        obj = modifier;
        i4 = i2 & 4;
        if (i4 != 0) {
        }
        i5 = i2 & 8;
        if (i5 == 0) {
        }
        z2 = z;
        if ((57344 & i) == 0) {
        }
        i6 = i2 & 32;
        if (i6 != 0) {
        }
        if ((i & 3670016) == 0) {
        }
        if ((i & 29360128) == 0) {
        }
        if ((234881024 & i) == 0) {
        }
        if ((i2 & 512) == 0) {
        }
        i3 |= i8;
        if (i4 == 4) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i7 == 0) {
        }
        if (i4 == 0) {
        }
        if (i5 != 0) {
        }
        if ((i2 & 16) == 0) {
        }
        if (i6 == 0) {
        }
        if ((i2 & 64) == 0) {
        }
        if ((i2 & 128) == 0) {
        }
        if ((i2 & 256) != 0) {
        }
        j7 = j4;
        z3 = z2;
        j8 = j5;
        j9 = j6;
        modifier2 = obj3;
        bottomDrawerState3 = bottomDrawerState2;
        obj4 = cornerBasedShape;
        f2 = m1349getElevationD9Ej5fM;
        i9 = i3;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        startRestartGroup.startReplaceableGroup(-1561647407);
        ComposerKt.sourceInformation(startRestartGroup, "654@24761L7,655@24777L64");
        if (bottomDrawerState3.getDensity$material_release() == null) {
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
        CoroutineScope coroutineScope222 = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
        startRestartGroup.endReplaceableGroup();
        Modifier modifier4222 = modifier2;
        BottomDrawerState bottomDrawerState5222 = bottomDrawerState3;
        composer2 = startRestartGroup;
        BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxSize$default(modifier2, 0.0f, 1, null), null, false, ComposableLambdaKt.composableLambda(composer2, 1220102512, true, new DrawerKt$BottomDrawer$2(z3, bottomDrawerState3, content, i9, j7, coroutineScope222, obj4, j8, j9, f2, drawerContent)), composer2, CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE, 6);
        if (ComposerKt.isTraceInProgress()) {
        }
        z4 = z3;
        shape2 = obj4;
        f3 = f2;
        bottomDrawerState4 = bottomDrawerState5222;
        j10 = j8;
        j11 = j9;
        j12 = j7;
        modifier3 = modifier4222;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    private static final Map<BottomDrawerValue, Float> calculateAnchors(float f, float f2, boolean z) {
        float f3 = 0.5f * f;
        float max = Math.max(0.0f, f - f2);
        if (f2 < f3 || z) {
            Pair[] pairArr = new Pair[2];
            pairArr[0] = TuplesKt.to(BottomDrawerValue.Closed, Float.valueOf(f));
            pairArr[1] = TuplesKt.to(BottomDrawerValue.Expanded, f2 == 0.0f ? null : Float.valueOf(max));
            return MapsKt.mapOf(pairArr);
        }
        Pair[] pairArr2 = new Pair[3];
        pairArr2[0] = TuplesKt.to(BottomDrawerValue.Closed, Float.valueOf(f));
        pairArr2[1] = TuplesKt.to(BottomDrawerValue.Open, Float.valueOf(f3));
        pairArr2[2] = TuplesKt.to(BottomDrawerValue.Expanded, f2 == 0.0f ? null : Float.valueOf(max));
        return MapsKt.mapOf(pairArr2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float calculateFraction(float f, float f2, float f3) {
        return RangesKt.coerceIn((f3 - f) / (f2 - f), 0.0f, 1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: BottomDrawerScrim-3J-VO9M  reason: not valid java name */
    public static final void m1351BottomDrawerScrim3JVO9M(long j, Function0<Unit> function0, boolean z, Composer composer, int i) {
        int i2;
        Modifier.Companion companion;
        Composer startRestartGroup = composer.startRestartGroup(-513067266);
        ComposerKt.sourceInformation(startRestartGroup, "C(BottomDrawerScrim)P(0:c#ui.graphics.Color)805@29975L121,809@30123L30,827@30676L62,823@30567L171:Drawer.kt#jmzs0o");
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
                ComposerKt.traceEventStart(-513067266, i2, -1, "androidx.compose.material.BottomDrawerScrim (Drawer.kt:799)");
            }
            if (j != Color.Companion.m3327getUnspecified0d7_KjU()) {
                State<Float> animateFloatAsState = AnimateAsStateKt.animateFloatAsState(z ? 1.0f : 0.0f, new TweenSpec(0, 0, null, 7, null), 0.0f, null, null, startRestartGroup, 48, 28);
                String m1469getString4foXLRw = Strings_androidKt.m1469getString4foXLRw(Strings.Companion.m1462getCloseDrawerUdPEhr4(), startRestartGroup, 6);
                startRestartGroup.startReplaceableGroup(-1298942364);
                ComposerKt.sourceInformation(startRestartGroup, "812@30261L73,815@30387L122");
                if (z) {
                    Modifier.Companion companion2 = Modifier.Companion;
                    startRestartGroup.startReplaceableGroup(1157296644);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                    boolean changed = startRestartGroup.changed(function0);
                    DrawerKt$BottomDrawerScrim$dismissModifier$1$1 rememberedValue = startRestartGroup.rememberedValue();
                    if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                        rememberedValue = new DrawerKt$BottomDrawerScrim$dismissModifier$1$1(function0, null);
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    startRestartGroup.endReplaceableGroup();
                    Modifier pointerInput = SuspendingPointerInputFilterKt.pointerInput(companion2, function0, (Function2) rememberedValue);
                    startRestartGroup.startReplaceableGroup(511388516);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
                    boolean changed2 = startRestartGroup.changed(m1469getString4foXLRw) | startRestartGroup.changed(function0);
                    DrawerKt$BottomDrawerScrim$dismissModifier$2$1 rememberedValue2 = startRestartGroup.rememberedValue();
                    if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                        rememberedValue2 = new DrawerKt$BottomDrawerScrim$dismissModifier$2$1(m1469getString4foXLRw, function0);
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
                DrawerKt$BottomDrawerScrim$1$1 rememberedValue3 = startRestartGroup.rememberedValue();
                if (changed3 || rememberedValue3 == Composer.Companion.getEmpty()) {
                    rememberedValue3 = new DrawerKt$BottomDrawerScrim$1$1(j, animateFloatAsState);
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
        endRestartGroup.updateScope(new DrawerKt$BottomDrawerScrim$2(j, function0, z, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Scrim-Bx497Mc  reason: not valid java name */
    public static final void m1353ScrimBx497Mc(boolean z, Function0<Unit> function0, Function0<Float> function02, long j, Composer composer, int i) {
        int i2;
        Modifier.Companion companion;
        Composer startRestartGroup = composer.startRestartGroup(1983403750);
        ComposerKt.sourceInformation(startRestartGroup, "C(Scrim)P(3,2,1,0:c#ui.graphics.Color)840@30893L30,856@31337L51,852@31246L142:Drawer.kt#jmzs0o");
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changedInstance(function02) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= startRestartGroup.changed(j) ? 2048 : 1024;
        }
        if ((i2 & 5851) != 1170 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1983403750, i2, -1, "androidx.compose.material.Scrim (Drawer.kt:834)");
            }
            String m1469getString4foXLRw = Strings_androidKt.m1469getString4foXLRw(Strings.Companion.m1462getCloseDrawerUdPEhr4(), startRestartGroup, 6);
            startRestartGroup.startReplaceableGroup(1010561092);
            ComposerKt.sourceInformation(startRestartGroup, "843@31012L35,844@31096L108");
            if (z) {
                Modifier.Companion companion2 = Modifier.Companion;
                startRestartGroup.startReplaceableGroup(1157296644);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                boolean changed = startRestartGroup.changed(function0);
                DrawerKt$Scrim$dismissDrawer$1$1 rememberedValue = startRestartGroup.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = new DrawerKt$Scrim$dismissDrawer$1$1(function0, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                startRestartGroup.endReplaceableGroup();
                Modifier pointerInput = SuspendingPointerInputFilterKt.pointerInput(companion2, function0, (Function2) rememberedValue);
                startRestartGroup.startReplaceableGroup(511388516);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
                boolean changed2 = startRestartGroup.changed(m1469getString4foXLRw) | startRestartGroup.changed(function0);
                DrawerKt$Scrim$dismissDrawer$2$1 rememberedValue2 = startRestartGroup.rememberedValue();
                if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                    rememberedValue2 = new DrawerKt$Scrim$dismissDrawer$2$1(m1469getString4foXLRw, function0);
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
            boolean changed3 = startRestartGroup.changed(m3281boximpl) | startRestartGroup.changed(function02);
            DrawerKt$Scrim$1$1 rememberedValue3 = startRestartGroup.rememberedValue();
            if (changed3 || rememberedValue3 == Composer.Companion.getEmpty()) {
                rememberedValue3 = new DrawerKt$Scrim$1$1(j, function02);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            startRestartGroup.endReplaceableGroup();
            CanvasKt.Canvas(then, (Function1) rememberedValue3, startRestartGroup, 0);
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
        endRestartGroup.updateScope(new DrawerKt$Scrim$2(z, function0, function02, j, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NestedScrollConnection ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(AnchoredDraggableState<?> anchoredDraggableState) {
        return new DrawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1(anchoredDraggableState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AnchoredDraggableState.AnchorChangedCallback<BottomDrawerValue> BottomDrawerAnchorChangeCallback(final BottomDrawerState bottomDrawerState, final CoroutineScope coroutineScope) {
        return new AnchoredDraggableState.AnchorChangedCallback<BottomDrawerValue>() { // from class: androidx.compose.material.DrawerKt$BottomDrawerAnchorChangeCallback$1

            /* compiled from: Drawer.kt */
            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            /* loaded from: classes.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[BottomDrawerValue.values().length];
                    try {
                        iArr[BottomDrawerValue.Closed.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[BottomDrawerValue.Open.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[BottomDrawerValue.Expanded.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            @Override // androidx.compose.material.AnchoredDraggableState.AnchorChangedCallback
            public final void onAnchorsChanged(BottomDrawerValue previousTarget, Map<BottomDrawerValue, Float> previousAnchors, Map<BottomDrawerValue, Float> newAnchors) {
                BottomDrawerValue bottomDrawerValue;
                Intrinsics.checkNotNullParameter(previousTarget, "previousTarget");
                Intrinsics.checkNotNullParameter(previousAnchors, "previousAnchors");
                Intrinsics.checkNotNullParameter(newAnchors, "newAnchors");
                Float f = previousAnchors.get(previousTarget);
                int i = WhenMappings.$EnumSwitchMapping$0[previousTarget.ordinal()];
                if (i == 1) {
                    bottomDrawerValue = BottomDrawerValue.Closed;
                } else if (i == 2 || i == 3) {
                    if (newAnchors.containsKey(BottomDrawerValue.Open)) {
                        bottomDrawerValue = BottomDrawerValue.Open;
                    } else {
                        bottomDrawerValue = newAnchors.containsKey(BottomDrawerValue.Expanded) ? BottomDrawerValue.Expanded : BottomDrawerValue.Closed;
                    }
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                if (Intrinsics.areEqual(((Number) MapsKt.getValue(newAnchors, bottomDrawerValue)).floatValue(), f)) {
                    return;
                }
                if (BottomDrawerState.this.isAnimationRunning$material_release()) {
                    BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new DrawerKt$BottomDrawerAnchorChangeCallback$1$onAnchorsChanged$1(BottomDrawerState.this, bottomDrawerValue, null), 3, null);
                } else if (BottomDrawerState.this.trySnapTo$material_release(bottomDrawerValue)) {
                } else {
                    BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new DrawerKt$BottomDrawerAnchorChangeCallback$1$onAnchorsChanged$2(BottomDrawerState.this, bottomDrawerValue, null), 3, null);
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float BottomDrawerScrim_3J_VO9M$lambda$3(State<Float> state) {
        return state.getValue().floatValue();
    }

    static {
        float f = 56;
        EndDrawerPadding = Dp.m5607constructorimpl(f);
        DrawerPositionalThreshold = Dp.m5607constructorimpl(f);
    }
}
