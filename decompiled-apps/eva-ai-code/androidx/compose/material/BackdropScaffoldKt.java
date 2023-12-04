package androidx.compose.material;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.ZIndexModifierKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.google.android.exoplayer2.C;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ifriend.keychain.cipherStorage.CipherStorageKeystoreRsaEcb;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
/* compiled from: BackdropScaffold.kt */
@Metadata(d1 = {"\u0000r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a;\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0011\u0010\u0007\u001a\r\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0002\b\t2\u0011\u0010\n\u001a\r\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0002\b\tH\u0003¢\u0006\u0002\u0010\u000b\u001aõ\u0001\u0010\f\u001a\u00020\u00042\u0011\u0010\u0007\u001a\r\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0002\b\t2\u0011\u0010\r\u001a\r\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0002\b\t2\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0002\b\t2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00012\b\b\u0002\u0010\u0016\u001a\u00020\u00012\b\b\u0002\u0010\u0017\u001a\u00020\u00142\b\b\u0002\u0010\u0018\u001a\u00020\u00142\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u00012\b\b\u0002\u0010\u001f\u001a\u00020\u001a2\b\b\u0002\u0010 \u001a\u00020\u001a2\b\b\u0002\u0010!\u001a\u00020\u001a2\u0019\b\u0002\u0010\"\u001a\u0013\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00040#¢\u0006\u0002\b\tH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b%\u0010&\u001ah\u0010'\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00102\u0016\u0010(\u001a\u0012\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0002\b\t¢\u0006\u0002\b)2\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020+0#2\"\u0010,\u001a\u001e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u00040-¢\u0006\u0002\b\t¢\u0006\u0002\b)H\u0003ø\u0001\u0000¢\u0006\u0002\u0010/\u001a3\u00100\u001a\u00020\u00042\u0006\u00101\u001a\u00020\u001a2\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\u0006\u00103\u001a\u00020\u0014H\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b4\u00105\u001aE\u00106\u001a\u00020\u00122\u0006\u00107\u001a\u00020\u00062\u000e\b\u0002\u00108\u001a\b\u0012\u0004\u0012\u00020.092\u0014\b\u0002\u0010:\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00140#2\b\b\u0002\u0010;\u001a\u00020$H\u0007¢\u0006\u0002\u0010<\"\u0013\u0010\u0000\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006=²\u0006\n\u0010>\u001a\u00020.X\u008a\u0084\u0002²\u0006\n\u0010?\u001a\u00020.X\u008a\u0084\u0002"}, d2 = {"AnimationSlideOffset", "Landroidx/compose/ui/unit/Dp;", "F", "BackLayerTransition", "", TypedValues.AttributesType.S_TARGET, "Landroidx/compose/material/BackdropValue;", "appBar", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", FirebaseAnalytics.Param.CONTENT, "(Landroidx/compose/material/BackdropValue;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "BackdropScaffold", "backLayerContent", "frontLayerContent", "modifier", "Landroidx/compose/ui/Modifier;", "scaffoldState", "Landroidx/compose/material/BackdropScaffoldState;", "gesturesEnabled", "", "peekHeight", "headerHeight", "persistentAppBar", "stickyFrontLayer", "backLayerBackgroundColor", "Landroidx/compose/ui/graphics/Color;", "backLayerContentColor", "frontLayerShape", "Landroidx/compose/ui/graphics/Shape;", "frontLayerElevation", "frontLayerBackgroundColor", "frontLayerContentColor", "frontLayerScrimColor", "snackbarHost", "Lkotlin/Function1;", "Landroidx/compose/material/SnackbarHostState;", "BackdropScaffold-BZszfkY", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Landroidx/compose/material/BackdropScaffoldState;ZFFZZJJLandroidx/compose/ui/graphics/Shape;FJJJLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "BackdropStack", "backLayer", "Landroidx/compose/ui/UiComposable;", "calculateBackLayerConstraints", "Landroidx/compose/ui/unit/Constraints;", "frontLayer", "Lkotlin/Function2;", "", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;I)V", "Scrim", "color", "onDismiss", "visible", "Scrim-3J-VO9M", "(JLkotlin/jvm/functions/Function0;ZLandroidx/compose/runtime/Composer;I)V", "rememberBackdropScaffoldState", "initialValue", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "confirmStateChange", "snackbarHostState", "(Landroidx/compose/material/BackdropValue;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Landroidx/compose/material/SnackbarHostState;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/BackdropScaffoldState;", "material_release", "alpha", "animationProgress"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BackdropScaffoldKt {
    private static final float AnimationSlideOffset = Dp.m5607constructorimpl(20);

    public static final BackdropScaffoldState rememberBackdropScaffoldState(BackdropValue initialValue, AnimationSpec<Float> animationSpec, Function1<? super BackdropValue, Boolean> function1, SnackbarHostState snackbarHostState, Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        composer.startReplaceableGroup(-862178912);
        ComposerKt.sourceInformation(composer, "C(rememberBackdropScaffoldState)P(2)171@6447L32,173@6518L538:BackdropScaffold.kt#jmzs0o");
        if ((i2 & 2) != 0) {
            animationSpec = SwipeableDefaults.INSTANCE.getAnimationSpec();
        }
        if ((i2 & 4) != 0) {
            function1 = BackdropScaffoldKt$rememberBackdropScaffoldState$1.INSTANCE;
        }
        if ((i2 & 8) != 0) {
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
            ComposerKt.traceEventStart(-862178912, i, -1, "androidx.compose.material.rememberBackdropScaffoldState (BackdropScaffold.kt:167)");
        }
        BackdropScaffoldState backdropScaffoldState = (BackdropScaffoldState) RememberSaveableKt.m2907rememberSaveable(new Object[]{animationSpec, function1, snackbarHostState}, BackdropScaffoldState.Companion.Saver(animationSpec, function1, snackbarHostState), (String) null, (Function0<? extends Object>) new BackdropScaffoldKt$rememberBackdropScaffoldState$3(initialValue, animationSpec, function1, snackbarHostState), composer, 72, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return backdropScaffoldState;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0485  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x050b  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0532  */
    /* JADX WARN: Removed duplicated region for block: B:292:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0151  */
    /* renamed from: BackdropScaffold-BZszfkY  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1246BackdropScaffoldBZszfkY(Function2<? super Composer, ? super Integer, Unit> appBar, Function2<? super Composer, ? super Integer, Unit> backLayerContent, Function2<? super Composer, ? super Integer, Unit> frontLayerContent, Modifier modifier, BackdropScaffoldState backdropScaffoldState, boolean z, float f, float f2, boolean z2, boolean z3, long j, long j2, Shape shape, float f3, long j3, long j4, long j5, Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function3, Composer composer, int i, int i2, int i3) {
        int i4;
        Object obj;
        Object obj2;
        int i5;
        int i6;
        float f4;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        Object obj3;
        int i15;
        int i16;
        Object obj4;
        Object obj5;
        int i17;
        boolean z4;
        int i18;
        int i19;
        int i20;
        int i21;
        long j6;
        long j7;
        Shape shape2;
        long j8;
        long j9;
        long j10;
        long j11;
        long j12;
        Object obj6;
        Function3<SnackbarHostState, Composer, Integer, Unit> function32;
        float f5;
        Object obj7;
        boolean z5;
        Object obj8;
        int i22;
        long j13;
        float f6;
        long j14;
        long j15;
        long j16;
        int i23;
        float f7;
        boolean z6;
        boolean z7;
        long j17;
        boolean changed;
        BackdropScaffoldKt$BackdropScaffold$calculateBackLayerConstraints$1$1 rememberedValue;
        Composer composer2;
        Modifier modifier2;
        BackdropScaffoldState backdropScaffoldState2;
        boolean z8;
        boolean z9;
        boolean z10;
        long j18;
        long j19;
        Shape shape3;
        float f8;
        long j20;
        long j21;
        long j22;
        Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function33;
        float f9;
        float f10;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(appBar, "appBar");
        Intrinsics.checkNotNullParameter(backLayerContent, "backLayerContent");
        Intrinsics.checkNotNullParameter(frontLayerContent, "frontLayerContent");
        Composer startRestartGroup = composer.startRestartGroup(1397420093);
        ComposerKt.sourceInformation(startRestartGroup, "C(BackdropScaffold)P(!1,2,5,12,15,10,13:c#ui.unit.Dp,11:c#ui.unit.Dp,14,17,1:c#ui.graphics.Color,3:c#ui.graphics.Color,9,7:c#ui.unit.Dp,4:c#ui.graphics.Color,6:c#ui.graphics.Color,8:c#ui.graphics.Color)260@11766L40,266@12093L6,267@12144L41,268@12241L15,270@12387L6,271@12439L42,272@12542L20,*275@12690L7,276@12764L7,288@13147L100,293@13271L3282:BackdropScaffold.kt#jmzs0o");
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 14) == 0) {
            i4 = (startRestartGroup.changedInstance(appBar) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 112) == 0) {
            i4 |= startRestartGroup.changedInstance(backLayerContent) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i & 896) == 0) {
            i4 |= startRestartGroup.changedInstance(frontLayerContent) ? 256 : 128;
        }
        int i24 = i3 & 8;
        if (i24 != 0) {
            i4 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
        } else if ((i & 7168) == 0) {
            obj = modifier;
            i4 |= startRestartGroup.changed(obj) ? 2048 : 1024;
            int i25 = 8192;
            if ((i & 57344) != 0) {
                obj2 = backdropScaffoldState;
                i4 |= ((i3 & 16) == 0 && startRestartGroup.changed(obj2)) ? 16384 : 8192;
            } else {
                obj2 = backdropScaffoldState;
            }
            i5 = i3 & 32;
            if (i5 == 0) {
                i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((i & 458752) == 0) {
                i4 |= startRestartGroup.changed(z) ? 131072 : 65536;
            }
            i6 = i3 & 64;
            if (i6 == 0) {
                i4 |= 1572864;
                f4 = f;
            } else {
                f4 = f;
                if ((i & 3670016) == 0) {
                    i4 |= startRestartGroup.changed(f4) ? 1048576 : 524288;
                }
            }
            i7 = i3 & 128;
            if (i7 == 0) {
                i4 |= 12582912;
            } else if ((i & 29360128) == 0) {
                i8 = i7;
                i4 |= startRestartGroup.changed(f2) ? 8388608 : 4194304;
                i9 = i3 & 256;
                if (i9 != 0) {
                    i4 |= 100663296;
                } else if ((i & 234881024) == 0) {
                    i10 = i9;
                    i4 |= startRestartGroup.changed(z2) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                    i11 = i3 & 512;
                    if (i11 == 0) {
                        i13 = i4 | C.ENCODING_PCM_32BIT;
                        i12 = i11;
                    } else {
                        if ((i & 1879048192) == 0) {
                            i12 = i11;
                            i4 |= startRestartGroup.changed(z3) ? 536870912 : 268435456;
                        } else {
                            i12 = i11;
                        }
                        i13 = i4;
                    }
                    if ((i2 & 14) != 0) {
                        i14 = i2 | (((i3 & 1024) == 0 && startRestartGroup.changed(j)) ? 4 : 2);
                    } else {
                        i14 = i2;
                    }
                    if ((i2 & 112) == 0) {
                        i14 |= ((i3 & 2048) == 0 && startRestartGroup.changed(j2)) ? 32 : 16;
                    }
                    if ((i2 & 896) != 0) {
                        obj3 = shape;
                        i14 |= ((i3 & 4096) == 0 && startRestartGroup.changed(obj3)) ? 256 : 128;
                    } else {
                        obj3 = shape;
                    }
                    i15 = i3 & 8192;
                    if (i15 == 0) {
                        i14 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
                    } else if ((i2 & 7168) == 0) {
                        i14 |= startRestartGroup.changed(f3) ? 2048 : 1024;
                        if ((i2 & 57344) == 0) {
                            if ((i3 & 16384) == 0 && startRestartGroup.changed(j3)) {
                                i25 = 16384;
                            }
                            i14 |= i25;
                        }
                        if ((458752 & i2) == 0) {
                            i14 |= ((i3 & 32768) == 0 && startRestartGroup.changed(j4)) ? 131072 : 65536;
                        }
                        if ((3670016 & i2) == 0) {
                            i14 |= ((i3 & 65536) == 0 && startRestartGroup.changed(j5)) ? 1048576 : 524288;
                        }
                        i16 = i3 & 131072;
                        if (i16 != 0) {
                            i14 |= 12582912;
                            obj4 = function3;
                        } else {
                            obj4 = function3;
                            if ((i2 & 29360128) == 0) {
                                i14 |= startRestartGroup.changedInstance(obj4) ? 8388608 : 4194304;
                            }
                        }
                        int i26 = i14;
                        if ((i13 & 1533916891) == 306783378 || (23967451 & i26) != 4793490 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                Modifier.Companion companion = i24 != 0 ? Modifier.Companion : obj;
                                if ((i3 & 16) != 0) {
                                    i17 = i15;
                                    obj5 = companion;
                                    z4 = true;
                                    i18 = i8;
                                    i19 = i10;
                                    i20 = i12;
                                    i13 &= -57345;
                                    obj2 = rememberBackdropScaffoldState(BackdropValue.Concealed, null, null, null, startRestartGroup, 6, 14);
                                } else {
                                    obj5 = companion;
                                    i17 = i15;
                                    z4 = true;
                                    i18 = i8;
                                    i19 = i10;
                                    i20 = i12;
                                }
                                boolean z11 = i5 != 0 ? z4 : z;
                                if (i6 != 0) {
                                    f4 = BackdropScaffoldDefaults.INSTANCE.m1245getPeekHeightD9Ej5fM();
                                }
                                float m1244getHeaderHeightD9Ej5fM = i18 != 0 ? BackdropScaffoldDefaults.INSTANCE.m1244getHeaderHeightD9Ej5fM() : f2;
                                boolean z12 = i19 != 0 ? z4 : z2;
                                boolean z13 = i20 != 0 ? z4 : z3;
                                if ((i3 & 1024) != 0) {
                                    i21 = 6;
                                    i26 &= -15;
                                    j6 = MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m1309getPrimary0d7_KjU();
                                } else {
                                    i21 = 6;
                                    j6 = j;
                                }
                                if ((i3 & 2048) != 0) {
                                    j7 = ColorsKt.m1327contentColorForek8zF_U(j6, startRestartGroup, i26 & 14);
                                    i26 &= -113;
                                } else {
                                    j7 = j2;
                                }
                                if ((i3 & 4096) != 0) {
                                    shape2 = BackdropScaffoldDefaults.INSTANCE.getFrontLayerShape(startRestartGroup, i21);
                                    i26 &= -897;
                                } else {
                                    shape2 = shape;
                                }
                                float m1243getFrontLayerElevationD9Ej5fM = i17 != 0 ? BackdropScaffoldDefaults.INSTANCE.m1243getFrontLayerElevationD9Ej5fM() : f3;
                                if ((i3 & 16384) != 0) {
                                    j8 = j6;
                                    j9 = MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m1313getSurface0d7_KjU();
                                    i26 &= -57345;
                                } else {
                                    j8 = j6;
                                    j9 = j3;
                                }
                                if ((i3 & 32768) != 0) {
                                    j10 = ColorsKt.m1327contentColorForek8zF_U(j9, startRestartGroup, (i26 >> 12) & 14);
                                    i26 &= -458753;
                                } else {
                                    j10 = j4;
                                }
                                if ((i3 & 65536) != 0) {
                                    j11 = j9;
                                    j12 = BackdropScaffoldDefaults.INSTANCE.getFrontLayerScrimColor(startRestartGroup, 6);
                                    i26 = (-3670017) & i26;
                                } else {
                                    j11 = j9;
                                    j12 = j5;
                                }
                                if (i16 != 0) {
                                    function32 = ComposableSingletons$BackdropScaffoldKt.INSTANCE.m1333getLambda1$material_release();
                                    f5 = m1244getHeaderHeightD9Ej5fM;
                                    obj7 = obj2;
                                    z5 = z13;
                                    obj8 = shape2;
                                    i22 = i26;
                                    j13 = j10;
                                    f6 = m1243getFrontLayerElevationD9Ej5fM;
                                    j14 = j7;
                                    j15 = j11;
                                    j16 = j12;
                                    i23 = i13;
                                    obj6 = obj5;
                                } else {
                                    obj6 = obj5;
                                    function32 = function3;
                                    f5 = m1244getHeaderHeightD9Ej5fM;
                                    obj7 = obj2;
                                    z5 = z13;
                                    obj8 = shape2;
                                    i22 = i26;
                                    j13 = j10;
                                    f6 = m1243getFrontLayerElevationD9Ej5fM;
                                    j14 = j7;
                                    j15 = j11;
                                    j16 = j12;
                                    i23 = i13;
                                }
                                f7 = f4;
                                z6 = z11;
                                z7 = z12;
                                j17 = j8;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i3 & 16) != 0) {
                                    i13 &= -57345;
                                }
                                if ((i3 & 1024) != 0) {
                                    i26 &= -15;
                                }
                                if ((i3 & 2048) != 0) {
                                    i26 &= -113;
                                }
                                if ((i3 & 4096) != 0) {
                                    i26 &= -897;
                                }
                                if ((i3 & 16384) != 0) {
                                    i26 &= -57345;
                                }
                                if ((i3 & 32768) != 0) {
                                    i26 &= -458753;
                                }
                                if ((i3 & 65536) != 0) {
                                    i26 &= -3670017;
                                }
                                z6 = z;
                                f5 = f2;
                                z7 = z2;
                                z5 = z3;
                                j14 = j2;
                                f6 = f3;
                                j15 = j3;
                                j13 = j4;
                                j16 = j5;
                                function32 = function3;
                                obj6 = obj;
                                obj7 = obj2;
                                obj8 = obj3;
                                i22 = i26;
                                i23 = i13;
                                j17 = j;
                                f7 = f4;
                            }
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1397420093, i23, i22, "androidx.compose.material.BackdropScaffold (BackdropScaffold.kt:255)");
                            }
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                            Object consume = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            float mo588toPx0680j_4 = ((Density) consume).mo588toPx0680j_4(f7);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                            Object consume2 = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            float mo588toPx0680j_42 = ((Density) consume2).mo588toPx0680j_4(f5);
                            ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(startRestartGroup, 1744778315, true, new BackdropScaffoldKt$BackdropScaffold$backLayer$1(z7, obj7, appBar, backLayerContent, i23));
                            Float valueOf = Float.valueOf(mo588toPx0680j_42);
                            startRestartGroup.startReplaceableGroup(1157296644);
                            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                            changed = startRestartGroup.changed(valueOf);
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (!changed || rememberedValue == Composer.Companion.getEmpty()) {
                                rememberedValue = new BackdropScaffoldKt$BackdropScaffold$calculateBackLayerConstraints$1$1(mo588toPx0680j_42);
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            startRestartGroup.endReplaceableGroup();
                            int i27 = i22;
                            float f11 = f5;
                            float f12 = f7;
                            Modifier modifier3 = obj6;
                            composer2 = startRestartGroup;
                            int i28 = i27 << 6;
                            SurfaceKt.m1471SurfaceFjzlyU(null, null, j17, j14, null, 0.0f, ComposableLambdaKt.composableLambda(composer2, -1049909631, true, new BackdropScaffoldKt$BackdropScaffold$1(obj6, composableLambda, (Function1) rememberedValue, mo588toPx0680j_42, z5, z6, obj7, mo588toPx0680j_4, i23, obj8, j15, j13, f6, i27, f11, f12, frontLayerContent, j16, function32)), composer2, (i28 & 7168) | (i28 & 896) | 1572864, 51);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier2 = modifier3;
                            backdropScaffoldState2 = obj7;
                            z8 = z6;
                            z9 = z7;
                            z10 = z5;
                            j18 = j17;
                            j19 = j14;
                            shape3 = obj8;
                            f8 = f6;
                            j20 = j15;
                            j21 = j13;
                            j22 = j16;
                            function33 = function32;
                            f9 = f11;
                            f10 = f12;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            f9 = f2;
                            j19 = j2;
                            f8 = f3;
                            j20 = j3;
                            j21 = j4;
                            j22 = j5;
                            f10 = f4;
                            modifier2 = obj;
                            backdropScaffoldState2 = obj2;
                            shape3 = obj3;
                            function33 = obj4;
                            composer2 = startRestartGroup;
                            z8 = z;
                            z9 = z2;
                            z10 = z3;
                            j18 = j;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                            return;
                        }
                        endRestartGroup.updateScope(new BackdropScaffoldKt$BackdropScaffold$2(appBar, backLayerContent, frontLayerContent, modifier2, backdropScaffoldState2, z8, f10, f9, z9, z10, j18, j19, shape3, f8, j20, j21, j22, function33, i, i2, i3));
                        return;
                    }
                    if ((i2 & 57344) == 0) {
                    }
                    if ((458752 & i2) == 0) {
                    }
                    if ((3670016 & i2) == 0) {
                    }
                    i16 = i3 & 131072;
                    if (i16 != 0) {
                    }
                    int i262 = i14;
                    if ((i13 & 1533916891) == 306783378) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i24 != 0) {
                    }
                    if ((i3 & 16) != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i18 != 0) {
                    }
                    if (i19 != 0) {
                    }
                    if (i20 != 0) {
                    }
                    if ((i3 & 1024) != 0) {
                    }
                    if ((i3 & 2048) != 0) {
                    }
                    if ((i3 & 4096) != 0) {
                    }
                    if (i17 != 0) {
                    }
                    if ((i3 & 16384) != 0) {
                    }
                    if ((i3 & 32768) != 0) {
                    }
                    if ((i3 & 65536) != 0) {
                    }
                    if (i16 != 0) {
                    }
                    f7 = f4;
                    z6 = z11;
                    z7 = z12;
                    j17 = j8;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object consume3 = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    float mo588toPx0680j_43 = ((Density) consume3).mo588toPx0680j_4(f7);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object consume22 = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    float mo588toPx0680j_422 = ((Density) consume22).mo588toPx0680j_4(f5);
                    ComposableLambda composableLambda2 = ComposableLambdaKt.composableLambda(startRestartGroup, 1744778315, true, new BackdropScaffoldKt$BackdropScaffold$backLayer$1(z7, obj7, appBar, backLayerContent, i23));
                    Float valueOf2 = Float.valueOf(mo588toPx0680j_422);
                    startRestartGroup.startReplaceableGroup(1157296644);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                    changed = startRestartGroup.changed(valueOf2);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!changed) {
                    }
                    rememberedValue = new BackdropScaffoldKt$BackdropScaffold$calculateBackLayerConstraints$1$1(mo588toPx0680j_422);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                    startRestartGroup.endReplaceableGroup();
                    int i272 = i22;
                    float f112 = f5;
                    float f122 = f7;
                    Modifier modifier32 = obj6;
                    composer2 = startRestartGroup;
                    int i282 = i272 << 6;
                    SurfaceKt.m1471SurfaceFjzlyU(null, null, j17, j14, null, 0.0f, ComposableLambdaKt.composableLambda(composer2, -1049909631, true, new BackdropScaffoldKt$BackdropScaffold$1(obj6, composableLambda2, (Function1) rememberedValue, mo588toPx0680j_422, z5, z6, obj7, mo588toPx0680j_43, i23, obj8, j15, j13, f6, i272, f112, f122, frontLayerContent, j16, function32)), composer2, (i282 & 7168) | (i282 & 896) | 1572864, 51);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier2 = modifier32;
                    backdropScaffoldState2 = obj7;
                    z8 = z6;
                    z9 = z7;
                    z10 = z5;
                    j18 = j17;
                    j19 = j14;
                    shape3 = obj8;
                    f8 = f6;
                    j20 = j15;
                    j21 = j13;
                    j22 = j16;
                    function33 = function32;
                    f9 = f112;
                    f10 = f122;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                i10 = i9;
                i11 = i3 & 512;
                if (i11 == 0) {
                }
                if ((i2 & 14) != 0) {
                }
                if ((i2 & 112) == 0) {
                }
                if ((i2 & 896) != 0) {
                }
                i15 = i3 & 8192;
                if (i15 == 0) {
                }
                if ((i2 & 57344) == 0) {
                }
                if ((458752 & i2) == 0) {
                }
                if ((3670016 & i2) == 0) {
                }
                i16 = i3 & 131072;
                if (i16 != 0) {
                }
                int i2622 = i14;
                if ((i13 & 1533916891) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i24 != 0) {
                }
                if ((i3 & 16) != 0) {
                }
                if (i5 != 0) {
                }
                if (i6 != 0) {
                }
                if (i18 != 0) {
                }
                if (i19 != 0) {
                }
                if (i20 != 0) {
                }
                if ((i3 & 1024) != 0) {
                }
                if ((i3 & 2048) != 0) {
                }
                if ((i3 & 4096) != 0) {
                }
                if (i17 != 0) {
                }
                if ((i3 & 16384) != 0) {
                }
                if ((i3 & 32768) != 0) {
                }
                if ((i3 & 65536) != 0) {
                }
                if (i16 != 0) {
                }
                f7 = f4;
                z6 = z11;
                z7 = z12;
                j17 = j8;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume32 = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                float mo588toPx0680j_432 = ((Density) consume32).mo588toPx0680j_4(f7);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume222 = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                float mo588toPx0680j_4222 = ((Density) consume222).mo588toPx0680j_4(f5);
                ComposableLambda composableLambda22 = ComposableLambdaKt.composableLambda(startRestartGroup, 1744778315, true, new BackdropScaffoldKt$BackdropScaffold$backLayer$1(z7, obj7, appBar, backLayerContent, i23));
                Float valueOf22 = Float.valueOf(mo588toPx0680j_4222);
                startRestartGroup.startReplaceableGroup(1157296644);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                changed = startRestartGroup.changed(valueOf22);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!changed) {
                }
                rememberedValue = new BackdropScaffoldKt$BackdropScaffold$calculateBackLayerConstraints$1$1(mo588toPx0680j_4222);
                startRestartGroup.updateRememberedValue(rememberedValue);
                startRestartGroup.endReplaceableGroup();
                int i2722 = i22;
                float f1122 = f5;
                float f1222 = f7;
                Modifier modifier322 = obj6;
                composer2 = startRestartGroup;
                int i2822 = i2722 << 6;
                SurfaceKt.m1471SurfaceFjzlyU(null, null, j17, j14, null, 0.0f, ComposableLambdaKt.composableLambda(composer2, -1049909631, true, new BackdropScaffoldKt$BackdropScaffold$1(obj6, composableLambda22, (Function1) rememberedValue, mo588toPx0680j_4222, z5, z6, obj7, mo588toPx0680j_432, i23, obj8, j15, j13, f6, i2722, f1122, f1222, frontLayerContent, j16, function32)), composer2, (i2822 & 7168) | (i2822 & 896) | 1572864, 51);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier2 = modifier322;
                backdropScaffoldState2 = obj7;
                z8 = z6;
                z9 = z7;
                z10 = z5;
                j18 = j17;
                j19 = j14;
                shape3 = obj8;
                f8 = f6;
                j20 = j15;
                j21 = j13;
                j22 = j16;
                function33 = function32;
                f9 = f1122;
                f10 = f1222;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            i8 = i7;
            i9 = i3 & 256;
            if (i9 != 0) {
            }
            i10 = i9;
            i11 = i3 & 512;
            if (i11 == 0) {
            }
            if ((i2 & 14) != 0) {
            }
            if ((i2 & 112) == 0) {
            }
            if ((i2 & 896) != 0) {
            }
            i15 = i3 & 8192;
            if (i15 == 0) {
            }
            if ((i2 & 57344) == 0) {
            }
            if ((458752 & i2) == 0) {
            }
            if ((3670016 & i2) == 0) {
            }
            i16 = i3 & 131072;
            if (i16 != 0) {
            }
            int i26222 = i14;
            if ((i13 & 1533916891) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i24 != 0) {
            }
            if ((i3 & 16) != 0) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            if (i18 != 0) {
            }
            if (i19 != 0) {
            }
            if (i20 != 0) {
            }
            if ((i3 & 1024) != 0) {
            }
            if ((i3 & 2048) != 0) {
            }
            if ((i3 & 4096) != 0) {
            }
            if (i17 != 0) {
            }
            if ((i3 & 16384) != 0) {
            }
            if ((i3 & 32768) != 0) {
            }
            if ((i3 & 65536) != 0) {
            }
            if (i16 != 0) {
            }
            f7 = f4;
            z6 = z11;
            z7 = z12;
            j17 = j8;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume322 = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            float mo588toPx0680j_4322 = ((Density) consume322).mo588toPx0680j_4(f7);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume2222 = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            float mo588toPx0680j_42222 = ((Density) consume2222).mo588toPx0680j_4(f5);
            ComposableLambda composableLambda222 = ComposableLambdaKt.composableLambda(startRestartGroup, 1744778315, true, new BackdropScaffoldKt$BackdropScaffold$backLayer$1(z7, obj7, appBar, backLayerContent, i23));
            Float valueOf222 = Float.valueOf(mo588toPx0680j_42222);
            startRestartGroup.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
            changed = startRestartGroup.changed(valueOf222);
            rememberedValue = startRestartGroup.rememberedValue();
            if (!changed) {
            }
            rememberedValue = new BackdropScaffoldKt$BackdropScaffold$calculateBackLayerConstraints$1$1(mo588toPx0680j_42222);
            startRestartGroup.updateRememberedValue(rememberedValue);
            startRestartGroup.endReplaceableGroup();
            int i27222 = i22;
            float f11222 = f5;
            float f12222 = f7;
            Modifier modifier3222 = obj6;
            composer2 = startRestartGroup;
            int i28222 = i27222 << 6;
            SurfaceKt.m1471SurfaceFjzlyU(null, null, j17, j14, null, 0.0f, ComposableLambdaKt.composableLambda(composer2, -1049909631, true, new BackdropScaffoldKt$BackdropScaffold$1(obj6, composableLambda222, (Function1) rememberedValue, mo588toPx0680j_42222, z5, z6, obj7, mo588toPx0680j_4322, i23, obj8, j15, j13, f6, i27222, f11222, f12222, frontLayerContent, j16, function32)), composer2, (i28222 & 7168) | (i28222 & 896) | 1572864, 51);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier2 = modifier3222;
            backdropScaffoldState2 = obj7;
            z8 = z6;
            z9 = z7;
            z10 = z5;
            j18 = j17;
            j19 = j14;
            shape3 = obj8;
            f8 = f6;
            j20 = j15;
            j21 = j13;
            j22 = j16;
            function33 = function32;
            f9 = f11222;
            f10 = f12222;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        obj = modifier;
        int i252 = 8192;
        if ((i & 57344) != 0) {
        }
        i5 = i3 & 32;
        if (i5 == 0) {
        }
        i6 = i3 & 64;
        if (i6 == 0) {
        }
        i7 = i3 & 128;
        if (i7 == 0) {
        }
        i8 = i7;
        i9 = i3 & 256;
        if (i9 != 0) {
        }
        i10 = i9;
        i11 = i3 & 512;
        if (i11 == 0) {
        }
        if ((i2 & 14) != 0) {
        }
        if ((i2 & 112) == 0) {
        }
        if ((i2 & 896) != 0) {
        }
        i15 = i3 & 8192;
        if (i15 == 0) {
        }
        if ((i2 & 57344) == 0) {
        }
        if ((458752 & i2) == 0) {
        }
        if ((3670016 & i2) == 0) {
        }
        i16 = i3 & 131072;
        if (i16 != 0) {
        }
        int i262222 = i14;
        if ((i13 & 1533916891) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i24 != 0) {
        }
        if ((i3 & 16) != 0) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        if (i18 != 0) {
        }
        if (i19 != 0) {
        }
        if (i20 != 0) {
        }
        if ((i3 & 1024) != 0) {
        }
        if ((i3 & 2048) != 0) {
        }
        if ((i3 & 4096) != 0) {
        }
        if (i17 != 0) {
        }
        if ((i3 & 16384) != 0) {
        }
        if ((i3 & 32768) != 0) {
        }
        if ((i3 & 65536) != 0) {
        }
        if (i16 != 0) {
        }
        f7 = f4;
        z6 = z11;
        z7 = z12;
        j17 = j8;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume3222 = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        float mo588toPx0680j_43222 = ((Density) consume3222).mo588toPx0680j_4(f7);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume22222 = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        float mo588toPx0680j_422222 = ((Density) consume22222).mo588toPx0680j_4(f5);
        ComposableLambda composableLambda2222 = ComposableLambdaKt.composableLambda(startRestartGroup, 1744778315, true, new BackdropScaffoldKt$BackdropScaffold$backLayer$1(z7, obj7, appBar, backLayerContent, i23));
        Float valueOf2222 = Float.valueOf(mo588toPx0680j_422222);
        startRestartGroup.startReplaceableGroup(1157296644);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
        changed = startRestartGroup.changed(valueOf2222);
        rememberedValue = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        rememberedValue = new BackdropScaffoldKt$BackdropScaffold$calculateBackLayerConstraints$1$1(mo588toPx0680j_422222);
        startRestartGroup.updateRememberedValue(rememberedValue);
        startRestartGroup.endReplaceableGroup();
        int i272222 = i22;
        float f112222 = f5;
        float f122222 = f7;
        Modifier modifier32222 = obj6;
        composer2 = startRestartGroup;
        int i282222 = i272222 << 6;
        SurfaceKt.m1471SurfaceFjzlyU(null, null, j17, j14, null, 0.0f, ComposableLambdaKt.composableLambda(composer2, -1049909631, true, new BackdropScaffoldKt$BackdropScaffold$1(obj6, composableLambda2222, (Function1) rememberedValue, mo588toPx0680j_422222, z5, z6, obj7, mo588toPx0680j_43222, i23, obj8, j15, j13, f6, i272222, f112222, f122222, frontLayerContent, j16, function32)), composer2, (i282222 & 7168) | (i282222 & 896) | 1572864, 51);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier2 = modifier32222;
        backdropScaffoldState2 = obj7;
        z8 = z6;
        z9 = z7;
        z10 = z5;
        j18 = j17;
        j19 = j14;
        shape3 = obj8;
        f8 = f6;
        j20 = j15;
        j21 = j13;
        j22 = j16;
        function33 = function32;
        f9 = f112222;
        f10 = f122222;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Scrim-3J-VO9M  reason: not valid java name */
    public static final void m1247Scrim3JVO9M(long j, Function0<Unit> function0, boolean z, Composer composer, int i) {
        int i2;
        Modifier.Companion companion;
        Composer startRestartGroup = composer.startRestartGroup(-92141505);
        ComposerKt.sourceInformation(startRestartGroup, "C(Scrim)P(0:c#ui.graphics.Color)388@16708L121,401@17118L62,397@17009L171:BackdropScaffold.kt#jmzs0o");
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
                ComposerKt.traceEventStart(-92141505, i2, -1, "androidx.compose.material.Scrim (BackdropScaffold.kt:382)");
            }
            if (j != Color.Companion.m3327getUnspecified0d7_KjU()) {
                State<Float> animateFloatAsState = AnimateAsStateKt.animateFloatAsState(z ? 1.0f : 0.0f, new TweenSpec(0, 0, null, 7, null), 0.0f, null, null, startRestartGroup, 48, 28);
                startRestartGroup.startReplaceableGroup(1010547004);
                ComposerKt.sourceInformation(startRestartGroup, "393@16915L37");
                if (z) {
                    Modifier.Companion companion2 = Modifier.Companion;
                    Unit unit = Unit.INSTANCE;
                    startRestartGroup.startReplaceableGroup(1157296644);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                    boolean changed = startRestartGroup.changed(function0);
                    BackdropScaffoldKt$Scrim$dismissModifier$1$1 rememberedValue = startRestartGroup.rememberedValue();
                    if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                        rememberedValue = new BackdropScaffoldKt$Scrim$dismissModifier$1$1(function0, null);
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    startRestartGroup.endReplaceableGroup();
                    companion = SuspendingPointerInputFilterKt.pointerInput(companion2, unit, (Function2) rememberedValue);
                } else {
                    companion = Modifier.Companion;
                }
                startRestartGroup.endReplaceableGroup();
                Modifier then = SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null).then(companion);
                Color m3281boximpl = Color.m3281boximpl(j);
                startRestartGroup.startReplaceableGroup(511388516);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
                boolean changed2 = startRestartGroup.changed(m3281boximpl) | startRestartGroup.changed(animateFloatAsState);
                BackdropScaffoldKt$Scrim$1$1 rememberedValue2 = startRestartGroup.rememberedValue();
                if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                    rememberedValue2 = new BackdropScaffoldKt$Scrim$1$1(j, animateFloatAsState);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                startRestartGroup.endReplaceableGroup();
                CanvasKt.Canvas(then, (Function1) rememberedValue2, startRestartGroup, 0);
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
        endRestartGroup.updateScope(new BackdropScaffoldKt$Scrim$2(j, function0, z, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void BackLayerTransition(BackdropValue backdropValue, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Composer composer, int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-950970976);
        ComposerKt.sourceInformation(startRestartGroup, "C(BackLayerTransition)P(2)421@17840L112,*424@18002L7,429@18176L486:BackdropScaffold.kt#jmzs0o");
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(backdropValue) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changedInstance(function22) ? 256 : 128;
        }
        int i3 = i2;
        if ((i3 & 731) != 146 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-950970976, i3, -1, "androidx.compose.material.BackLayerTransition (BackdropScaffold.kt:414)");
            }
            State<Float> animateFloatAsState = AnimateAsStateKt.animateFloatAsState(backdropValue == BackdropValue.Revealed ? 0.0f : 2.0f, new TweenSpec(0, 0, null, 7, null), 0.0f, null, null, startRestartGroup, 48, 28);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            float mo588toPx0680j_4 = ((Density) consume).mo588toPx0680j_4(AnimationSlideOffset);
            float f = 1;
            float coerceIn = RangesKt.coerceIn(BackLayerTransition$lambda$7(animateFloatAsState) - f, 0.0f, 1.0f);
            float coerceIn2 = RangesKt.coerceIn(f - BackLayerTransition$lambda$7(animateFloatAsState), 0.0f, 1.0f);
            startRestartGroup.startReplaceableGroup(733328855);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)69@3214L67,70@3286L130:Box.kt#2w3rfo");
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(Modifier.Companion);
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
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1538629162, "C430@18190L226,438@18425L231:BackdropScaffold.kt#jmzs0o");
            Modifier m3447graphicsLayerAp8cVGQ$default = GraphicsLayerModifierKt.m3447graphicsLayerAp8cVGQ$default(ZIndexModifierKt.zIndex(Modifier.Companion, coerceIn), 0.0f, 0.0f, coerceIn, 0.0f, (f - coerceIn) * mo588toPx0680j_4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131051, null);
            startRestartGroup.startReplaceableGroup(733328855);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)69@3214L67,70@3286L130:Box.kt#2w3rfo");
            MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(m3447graphicsLayerAp8cVGQ$default);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor2);
            } else {
                startRestartGroup.useNode();
            }
            Composer m2893constructorimpl2 = Updater.m2893constructorimpl(startRestartGroup);
            Updater.m2900setimpl(m2893constructorimpl2, rememberBoxMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2900setimpl(m2893constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (m2893constructorimpl2.getInserting() || !Intrinsics.areEqual(m2893constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m2893constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m2893constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            modifierMaterializerOf2.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629358, "C71@3331L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -481855289, "C436@18398L8:BackdropScaffold.kt#jmzs0o");
            function2.invoke(startRestartGroup, Integer.valueOf((i3 >> 3) & 14));
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            Modifier m3447graphicsLayerAp8cVGQ$default2 = GraphicsLayerModifierKt.m3447graphicsLayerAp8cVGQ$default(ZIndexModifierKt.zIndex(Modifier.Companion, coerceIn2), 0.0f, 0.0f, coerceIn2, 0.0f, (f - coerceIn2) * (-mo588toPx0680j_4), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131051, null);
            startRestartGroup.startReplaceableGroup(733328855);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)69@3214L67,70@3286L130:Box.kt#2w3rfo");
            MeasurePolicy rememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor3 = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(m3447graphicsLayerAp8cVGQ$default2);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor3);
            } else {
                startRestartGroup.useNode();
            }
            Composer m2893constructorimpl3 = Updater.m2893constructorimpl(startRestartGroup);
            Updater.m2900setimpl(m2893constructorimpl3, rememberBoxMeasurePolicy3, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2900setimpl(m2893constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (m2893constructorimpl3.getInserting() || !Intrinsics.areEqual(m2893constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                m2893constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                m2893constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            modifierMaterializerOf3.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629358, "C71@3331L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -481855050, "C444@18637L9:BackdropScaffold.kt#jmzs0o");
            function22.invoke(startRestartGroup, Integer.valueOf((i3 >> 6) & 14));
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
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
        endRestartGroup.updateScope(new BackdropScaffoldKt$BackLayerTransition$2(backdropValue, function2, function22, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void BackdropStack(Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, Function1<? super Constraints, Constraints> function1, Function4<? super Constraints, ? super Float, ? super Composer, ? super Integer, Unit> function4, Composer composer, int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-1248995194);
        ComposerKt.sourceInformation(startRestartGroup, "C(BackdropStack)P(3)457@18967L890,457@18940L917:BackdropScaffold.kt#jmzs0o");
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= startRestartGroup.changedInstance(function4) ? 2048 : 1024;
        }
        if ((i2 & 5851) != 1170 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1248995194, i2, -1, "androidx.compose.material.BackdropStack (BackdropScaffold.kt:451)");
            }
            startRestartGroup.startReplaceableGroup(1618982084);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2,3):Composables.kt#9igjgp");
            boolean changed = startRestartGroup.changed(function2) | startRestartGroup.changed(function1) | startRestartGroup.changed(function4);
            BackdropScaffoldKt$BackdropStack$1$1 rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new BackdropScaffoldKt$BackdropStack$1$1(function2, function1, function4, i2);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            SubcomposeLayoutKt.SubcomposeLayout(modifier, (Function2) rememberedValue, startRestartGroup, i2 & 14, 0);
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
        endRestartGroup.updateScope(new BackdropScaffoldKt$BackdropStack$2(modifier, function2, function1, function4, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float Scrim_3J_VO9M$lambda$4(State<Float> state) {
        return state.getValue().floatValue();
    }

    private static final float BackLayerTransition$lambda$7(State<Float> state) {
        return state.getValue().floatValue();
    }
}
