package androidx.compose.material;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import androidx.compose.ui.unit.Dp;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ifriend.keychain.cipherStorage.CipherStorageKeystoreRsaEcb;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: Scaffold.kt */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a¢\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\u0013\b\u0002\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\t0\u000f¢\u0006\u0002\b\u00102\u0013\b\u0002\u0010\u0011\u001a\r\u0012\u0004\u0012\u00020\t0\u000f¢\u0006\u0002\b\u00102\u0019\b\u0002\u0010\u0012\u001a\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\t0\u0013¢\u0006\u0002\b\u00102\u0013\b\u0002\u0010\u0015\u001a\r\u0012\u0004\u0012\u00020\t0\u000f¢\u0006\u0002\b\u00102\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192 \b\u0002\u0010\u001a\u001a\u001a\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0013¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u00192\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020\u00012\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010$\u001a\u00020\"2\b\b\u0002\u0010%\u001a\u00020\"2\b\b\u0002\u0010&\u001a\u00020\"2\u0017\u0010'\u001a\u0013\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\t0\u0013¢\u0006\u0002\b\u0010H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b)\u0010*\u001a£\u0001\u0010+\u001a\u00020\t2\u0006\u0010,\u001a\u00020\u00192\u0006\u0010-\u001a\u00020\u00172\u0016\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\t0\u000f¢\u0006\u0002\b\u0010¢\u0006\u0002\b.2\u001c\u0010'\u001a\u0018\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\t0\u0013¢\u0006\u0002\b\u0010¢\u0006\u0002\b.2\u0016\u0010/\u001a\u0012\u0012\u0004\u0012\u00020\t0\u000f¢\u0006\u0002\b\u0010¢\u0006\u0002\b.2\u0016\u00100\u001a\u0012\u0012\u0004\u0012\u00020\t0\u000f¢\u0006\u0002\b\u0010¢\u0006\u0002\b.2\u0016\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\t0\u000f¢\u0006\u0002\b\u0010¢\u0006\u0002\b.H\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b1\u00102\u001a!\u00103\u001a\u00020\r2\b\b\u0002\u00104\u001a\u0002052\b\b\u0002\u00106\u001a\u00020\u0014H\u0007¢\u0006\u0002\u00107\"\u0013\u0010\u0000\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u001c\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u00068"}, d2 = {"FabSpacing", "Landroidx/compose/ui/unit/Dp;", "F", "LocalFabPlacement", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/material/FabPlacement;", "getLocalFabPlacement", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "Scaffold", "", "modifier", "Landroidx/compose/ui/Modifier;", "scaffoldState", "Landroidx/compose/material/ScaffoldState;", "topBar", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "bottomBar", "snackbarHost", "Lkotlin/Function1;", "Landroidx/compose/material/SnackbarHostState;", "floatingActionButton", "floatingActionButtonPosition", "Landroidx/compose/material/FabPosition;", "isFloatingActionButtonDocked", "", "drawerContent", "Landroidx/compose/foundation/layout/ColumnScope;", "Lkotlin/ExtensionFunctionType;", "drawerGesturesEnabled", "drawerShape", "Landroidx/compose/ui/graphics/Shape;", "drawerElevation", "drawerBackgroundColor", "Landroidx/compose/ui/graphics/Color;", "drawerContentColor", "drawerScrimColor", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "contentColor", FirebaseAnalytics.Param.CONTENT, "Landroidx/compose/foundation/layout/PaddingValues;", "Scaffold-27mzLpw", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material/ScaffoldState;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;IZLkotlin/jvm/functions/Function3;ZLandroidx/compose/ui/graphics/Shape;FJJJJJLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "ScaffoldLayout", "isFabDocked", "fabPosition", "Landroidx/compose/ui/UiComposable;", "snackbar", "fab", "ScaffoldLayout-MDYNRJg", "(ZILkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "rememberScaffoldState", "drawerState", "Landroidx/compose/material/DrawerState;", "snackbarHostState", "(Landroidx/compose/material/DrawerState;Landroidx/compose/material/SnackbarHostState;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/ScaffoldState;", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ScaffoldKt {
    private static final ProvidableCompositionLocal<FabPlacement> LocalFabPlacement = CompositionLocalKt.staticCompositionLocalOf(ScaffoldKt$LocalFabPlacement$1.INSTANCE);
    private static final float FabSpacing = Dp.m5607constructorimpl(16);

    public static final ScaffoldState rememberScaffoldState(DrawerState drawerState, SnackbarHostState snackbarHostState, Composer composer, int i, int i2) {
        composer.startReplaceableGroup(1569641925);
        ComposerKt.sourceInformation(composer, "C(rememberScaffoldState)63@2263L39,64@2347L32,65@2399L62:Scaffold.kt#jmzs0o");
        if ((i2 & 1) != 0) {
            drawerState = DrawerKt.rememberDrawerState(DrawerValue.Closed, null, composer, 6, 2);
        }
        if ((i2 & 2) != 0) {
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
            ComposerKt.traceEventStart(1569641925, i, -1, "androidx.compose.material.rememberScaffoldState (Scaffold.kt:62)");
        }
        composer.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(composer, "CC(remember):Composables.kt#9igjgp");
        Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = new ScaffoldState(drawerState, snackbarHostState);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        ScaffoldState scaffoldState = (ScaffoldState) rememberedValue2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return scaffoldState;
    }

    /* JADX WARN: Code restructure failed: missing block: B:143:0x01be, code lost:
        if (r0.changed(r54) == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x01d8, code lost:
        if (r0.changed(r56) == false) goto L71;
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x04ad  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x04ce  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x04f6  */
    /* JADX WARN: Removed duplicated region for block: B:300:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0145  */
    /* renamed from: Scaffold-27mzLpw  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1442Scaffold27mzLpw(Modifier modifier, ScaffoldState scaffoldState, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function23, int i, boolean z, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function32, boolean z2, Shape shape, float f, long j, long j2, long j3, long j4, long j5, Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> content, Composer composer, int i2, int i3, int i4) {
        int i5;
        int i6;
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
        Modifier modifier2;
        ScaffoldState scaffoldState2;
        Function2<Composer, Integer, Unit> m1335getLambda1$material_release;
        Function2<Composer, Integer, Unit> m1336getLambda2$material_release;
        Function3<SnackbarHostState, Composer, Integer, Unit> m1337getLambda3$material_release;
        Function2<Composer, Integer, Unit> m1338getLambda4$material_release;
        boolean z3;
        CornerBasedShape cornerBasedShape;
        Shape shape2;
        boolean z4;
        int i17;
        long j6;
        long j7;
        long j8;
        int i18;
        long j9;
        long j10;
        boolean z5;
        long j11;
        long j12;
        int i19;
        int i20;
        long j13;
        Modifier modifier3;
        ScaffoldState scaffoldState3;
        Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function33;
        Shape shape3;
        long j14;
        float f2;
        ScaffoldState scaffoldState4;
        ScaffoldState scaffoldState5;
        Function2<? super Composer, ? super Integer, Unit> function24;
        float f3;
        long j15;
        long j16;
        long j17;
        long j18;
        long j19;
        Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function34;
        Function2<? super Composer, ? super Integer, Unit> function25;
        boolean z6;
        Function2<? super Composer, ? super Integer, Unit> function26;
        int i21;
        Shape shape4;
        Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function35;
        boolean z7;
        ScopeUpdateScope endRestartGroup;
        int i22;
        int i23;
        int i24;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(1037492569);
        ComposerKt.sourceInformation(startRestartGroup, "C(Scaffold)P(14,15,17,1,16,11,12:c#material.FabPosition,13,5,8,10,7:c#ui.unit.Dp,4:c#ui.graphics.Color,6:c#ui.graphics.Color,9:c#ui.graphics.Color,0:c#ui.graphics.Color,3:c#ui.graphics.Color)160@7052L23,169@7562L6,171@7677L6,172@7725L38,173@7810L10,174@7865L6,175@7910L32:Scaffold.kt#jmzs0o");
        int i25 = i4 & 1;
        if (i25 != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i5 = (startRestartGroup.changed(modifier) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i2 & 112) == 0) {
            if ((i4 & 2) == 0 && startRestartGroup.changed(scaffoldState)) {
                i24 = 32;
                i5 |= i24;
            }
            i24 = 16;
            i5 |= i24;
        }
        int i26 = i4 & 4;
        if (i26 != 0) {
            i5 |= 384;
        } else if ((i2 & 896) == 0) {
            i5 |= startRestartGroup.changedInstance(function2) ? 256 : 128;
            i6 = i4 & 8;
            int i27 = 2048;
            if (i6 == 0) {
                i5 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
            } else if ((i2 & 7168) == 0) {
                i5 |= startRestartGroup.changedInstance(function22) ? 2048 : 1024;
                i7 = i4 & 16;
                int i28 = 16384;
                if (i7 != 0) {
                    i5 |= 24576;
                } else if ((i2 & 57344) == 0) {
                    i5 |= startRestartGroup.changedInstance(function3) ? 16384 : 8192;
                }
                i8 = i4 & 32;
                if (i8 != 0) {
                    i5 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    obj = function23;
                } else {
                    obj = function23;
                    if ((i2 & 458752) == 0) {
                        i5 |= startRestartGroup.changedInstance(obj) ? 131072 : 65536;
                    }
                }
                i9 = i4 & 64;
                if (i9 != 0) {
                    i5 |= 1572864;
                    i10 = i;
                } else {
                    i10 = i;
                    if ((i2 & 3670016) == 0) {
                        i5 |= startRestartGroup.changed(i10) ? 1048576 : 524288;
                    }
                }
                i11 = i4 & 128;
                if (i11 != 0) {
                    i5 |= 12582912;
                } else if ((i2 & 29360128) == 0) {
                    i5 |= startRestartGroup.changed(z) ? 8388608 : 4194304;
                }
                i12 = i4 & 256;
                if (i12 != 0) {
                    i5 |= 100663296;
                } else if ((i2 & 234881024) == 0) {
                    i5 |= startRestartGroup.changedInstance(function32) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                }
                i13 = i4 & 512;
                if (i13 != 0) {
                    i5 |= C.ENCODING_PCM_32BIT;
                } else if ((i2 & 1879048192) == 0) {
                    i5 |= startRestartGroup.changed(z2) ? 536870912 : 268435456;
                }
                if ((i3 & 14) == 0) {
                    if ((i4 & 1024) == 0 && startRestartGroup.changed(shape)) {
                        i23 = 4;
                        i14 = i3 | i23;
                    }
                    i23 = 2;
                    i14 = i3 | i23;
                } else {
                    i14 = i3;
                }
                i15 = i4 & 2048;
                if (i15 != 0) {
                    i14 |= 48;
                } else if ((i3 & 112) == 0) {
                    i14 |= startRestartGroup.changed(f) ? 32 : 16;
                }
                if ((i3 & 896) == 0) {
                    if ((i4 & 4096) == 0 && startRestartGroup.changed(j)) {
                        i22 = 256;
                        i14 |= i22;
                    }
                    i22 = 128;
                    i14 |= i22;
                }
                if ((i3 & 7168) == 0) {
                    if ((i4 & 8192) != 0) {
                    }
                    i27 = 1024;
                    i14 |= i27;
                }
                if ((i3 & 57344) == 0) {
                    if ((i4 & 16384) != 0) {
                    }
                    i28 = 8192;
                    i14 |= i28;
                }
                if ((i3 & 458752) == 0) {
                    i14 |= ((i4 & 32768) == 0 && startRestartGroup.changed(j4)) ? 131072 : 65536;
                }
                if ((i3 & 3670016) == 0) {
                    i14 |= ((i4 & 65536) == 0 && startRestartGroup.changed(j5)) ? 1048576 : 524288;
                }
                if ((i4 & 131072) == 0) {
                    if ((i3 & 29360128) == 0) {
                        i16 = startRestartGroup.changedInstance(content) ? 8388608 : 4194304;
                    }
                    if ((i5 & 1533916891) == 306783378 || (i14 & 23967451) != 4793490 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i2 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            Modifier.Companion companion = i25 == 0 ? Modifier.Companion : modifier;
                            if ((i4 & 2) == 0) {
                                modifier2 = companion;
                                scaffoldState2 = rememberScaffoldState(null, null, startRestartGroup, 0, 3);
                                i5 &= -113;
                            } else {
                                modifier2 = companion;
                                scaffoldState2 = scaffoldState;
                            }
                            m1335getLambda1$material_release = i26 == 0 ? ComposableSingletons$ScaffoldKt.INSTANCE.m1335getLambda1$material_release() : function2;
                            m1336getLambda2$material_release = i6 == 0 ? ComposableSingletons$ScaffoldKt.INSTANCE.m1336getLambda2$material_release() : function22;
                            m1337getLambda3$material_release = i7 == 0 ? ComposableSingletons$ScaffoldKt.INSTANCE.m1337getLambda3$material_release() : function3;
                            m1338getLambda4$material_release = i8 == 0 ? ComposableSingletons$ScaffoldKt.INSTANCE.m1338getLambda4$material_release() : function23;
                            if (i9 != 0) {
                                i10 = FabPosition.Companion.m1380getEnd5ygKITE();
                            }
                            z3 = i11 == 0 ? false : z;
                            Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function36 = i12 == 0 ? null : function32;
                            boolean z8 = i13 == 0 ? true : z2;
                            ScaffoldState scaffoldState6 = scaffoldState2;
                            Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function37 = function36;
                            if ((i4 & 1024) == 0) {
                                cornerBasedShape = MaterialTheme.INSTANCE.getShapes(startRestartGroup, 6).getLarge();
                                i14 &= -15;
                            } else {
                                cornerBasedShape = shape;
                            }
                            int i29 = i14;
                            float m1349getElevationD9Ej5fM = i15 == 0 ? DrawerDefaults.INSTANCE.m1349getElevationD9Ej5fM() : f;
                            if ((i4 & 4096) == 0) {
                                shape2 = cornerBasedShape;
                                boolean z9 = z8;
                                i17 = i29 & (-897);
                                j6 = MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m1313getSurface0d7_KjU();
                                z4 = z9;
                            } else {
                                shape2 = cornerBasedShape;
                                z4 = z8;
                                i17 = i29;
                                j6 = j;
                            }
                            float f4 = m1349getElevationD9Ej5fM;
                            if ((i4 & 8192) == 0) {
                                j7 = ColorsKt.m1327contentColorForek8zF_U(j6, startRestartGroup, (i17 >> 6) & 14);
                                i17 &= -7169;
                            } else {
                                j7 = j2;
                            }
                            if ((i4 & 16384) == 0) {
                                j8 = j6;
                                i18 = 6;
                                j9 = DrawerDefaults.INSTANCE.getScrimColor(startRestartGroup, 6);
                                i17 &= -57345;
                            } else {
                                j8 = j6;
                                i18 = 6;
                                j9 = j3;
                            }
                            if ((32768 & i4) == 0) {
                                j10 = MaterialTheme.INSTANCE.getColors(startRestartGroup, i18).m1302getBackground0d7_KjU();
                                i17 &= -458753;
                            } else {
                                j10 = j4;
                            }
                            if ((i4 & 65536) == 0) {
                                z5 = z4;
                                j12 = j10;
                                i19 = i17 & (-3670017);
                                i20 = i5;
                                j11 = ColorsKt.m1327contentColorForek8zF_U(j10, startRestartGroup, (i17 >> 15) & 14);
                                modifier3 = modifier2;
                                scaffoldState3 = scaffoldState6;
                                function33 = function37;
                                shape3 = shape2;
                                j13 = j9;
                            } else {
                                z5 = z4;
                                j11 = j5;
                                j12 = j10;
                                i19 = i17;
                                i20 = i5;
                                j13 = j9;
                                modifier3 = modifier2;
                                scaffoldState3 = scaffoldState6;
                                function33 = function37;
                                shape3 = shape2;
                            }
                            j14 = j7;
                            f2 = f4;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i4 & 2) != 0) {
                                i5 &= -113;
                            }
                            if ((i4 & 1024) != 0) {
                                i14 &= -15;
                            }
                            int i30 = i14;
                            if ((i4 & 4096) != 0) {
                                i30 &= -897;
                            }
                            if ((i4 & 8192) != 0) {
                                i30 &= -7169;
                            }
                            if ((i4 & 16384) != 0) {
                                i30 &= -57345;
                            }
                            if ((32768 & i4) != 0) {
                                i30 &= -458753;
                            }
                            if ((i4 & 65536) != 0) {
                                i30 &= -3670017;
                            }
                            scaffoldState3 = scaffoldState;
                            m1335getLambda1$material_release = function2;
                            m1336getLambda2$material_release = function22;
                            z3 = z;
                            function33 = function32;
                            z5 = z2;
                            f2 = f;
                            j8 = j;
                            j14 = j2;
                            j13 = j3;
                            j12 = j4;
                            j11 = j5;
                            i19 = i30;
                            i20 = i5;
                            m1338getLambda4$material_release = obj;
                            modifier3 = modifier;
                            m1337getLambda3$material_release = function3;
                            shape3 = shape;
                        }
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1037492569, i20, i19, "androidx.compose.material.Scaffold (Scaffold.kt:158)");
                        }
                        Function2<? super Composer, ? super Integer, Unit> function27 = m1335getLambda1$material_release;
                        ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(startRestartGroup, 1823402604, true, new ScaffoldKt$Scaffold$child$1(j12, j11, i19, z3, i10, m1335getLambda1$material_release, content, m1338getLambda4$material_release, m1336getLambda2$material_release, i20, m1337getLambda3$material_release, scaffoldState3));
                        if (function33 == null) {
                            startRestartGroup.startReplaceableGroup(-1013848234);
                            ComposerKt.sourceInformation(startRestartGroup, "195@8636L487");
                            scaffoldState4 = scaffoldState3;
                            int i31 = i19 << 12;
                            DrawerKt.m1352ModalDrawerGs3lGvM(function33, modifier3, scaffoldState3.getDrawerState(), z5, shape3, f2, j8, j14, j13, ComposableLambdaKt.composableLambda(startRestartGroup, 100842932, true, new ScaffoldKt$Scaffold$1(composableLambda)), startRestartGroup, ((i20 >> 24) & 14) | C.ENCODING_PCM_32BIT | ((i20 << 3) & 112) | ((i20 >> 18) & 7168) | (i31 & 57344) | (i31 & 458752) | (i31 & 3670016) | (i31 & 29360128) | (i31 & 234881024), 0);
                            startRestartGroup.endReplaceableGroup();
                        } else {
                            scaffoldState4 = scaffoldState3;
                            startRestartGroup.startReplaceableGroup(-1013847725);
                            ComposerKt.sourceInformation(startRestartGroup, "208@9145L15");
                            composableLambda.invoke(modifier3, startRestartGroup, Integer.valueOf((i20 & 14) | 48));
                            startRestartGroup.endReplaceableGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        scaffoldState5 = scaffoldState4;
                        function24 = m1338getLambda4$material_release;
                        f3 = f2;
                        j15 = j8;
                        j16 = j14;
                        j17 = j13;
                        j18 = j12;
                        j19 = j11;
                        function34 = function33;
                        function25 = function27;
                        int i32 = i10;
                        z6 = z5;
                        function26 = m1336getLambda2$material_release;
                        i21 = i32;
                        boolean z10 = z3;
                        shape4 = shape3;
                        function35 = m1337getLambda3$material_release;
                        z7 = z10;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier3 = modifier;
                        scaffoldState5 = scaffoldState;
                        function25 = function2;
                        function26 = function22;
                        function35 = function3;
                        function34 = function32;
                        shape4 = shape;
                        f3 = f;
                        j15 = j;
                        j16 = j2;
                        j17 = j3;
                        j18 = j4;
                        j19 = j5;
                        function24 = obj;
                        i21 = i10;
                        z7 = z;
                        z6 = z2;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                        return;
                    }
                    endRestartGroup.updateScope(new ScaffoldKt$Scaffold$2(modifier3, scaffoldState5, function25, function26, function35, function24, i21, z7, function34, z6, shape4, f3, j15, j16, j17, j18, j19, content, i2, i3, i4));
                    return;
                }
                i16 = 12582912;
                i14 |= i16;
                if ((i5 & 1533916891) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                }
                if (i25 == 0) {
                }
                if ((i4 & 2) == 0) {
                }
                if (i26 == 0) {
                }
                if (i6 == 0) {
                }
                if (i7 == 0) {
                }
                if (i8 == 0) {
                }
                if (i9 != 0) {
                }
                if (i11 == 0) {
                }
                if (i12 == 0) {
                }
                if (i13 == 0) {
                }
                ScaffoldState scaffoldState62 = scaffoldState2;
                Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function372 = function36;
                if ((i4 & 1024) == 0) {
                }
                int i292 = i14;
                if (i15 == 0) {
                }
                if ((i4 & 4096) == 0) {
                }
                float f42 = m1349getElevationD9Ej5fM;
                if ((i4 & 8192) == 0) {
                }
                if ((i4 & 16384) == 0) {
                }
                if ((32768 & i4) == 0) {
                }
                if ((i4 & 65536) == 0) {
                }
                j14 = j7;
                f2 = f42;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                Function2<? super Composer, ? super Integer, Unit> function272 = m1335getLambda1$material_release;
                ComposableLambda composableLambda2 = ComposableLambdaKt.composableLambda(startRestartGroup, 1823402604, true, new ScaffoldKt$Scaffold$child$1(j12, j11, i19, z3, i10, m1335getLambda1$material_release, content, m1338getLambda4$material_release, m1336getLambda2$material_release, i20, m1337getLambda3$material_release, scaffoldState3));
                if (function33 == null) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                scaffoldState5 = scaffoldState4;
                function24 = m1338getLambda4$material_release;
                f3 = f2;
                j15 = j8;
                j16 = j14;
                j17 = j13;
                j18 = j12;
                j19 = j11;
                function34 = function33;
                function25 = function272;
                int i322 = i10;
                z6 = z5;
                function26 = m1336getLambda2$material_release;
                i21 = i322;
                boolean z102 = z3;
                shape4 = shape3;
                function35 = m1337getLambda3$material_release;
                z7 = z102;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            i7 = i4 & 16;
            int i282 = 16384;
            if (i7 != 0) {
            }
            i8 = i4 & 32;
            if (i8 != 0) {
            }
            i9 = i4 & 64;
            if (i9 != 0) {
            }
            i11 = i4 & 128;
            if (i11 != 0) {
            }
            i12 = i4 & 256;
            if (i12 != 0) {
            }
            i13 = i4 & 512;
            if (i13 != 0) {
            }
            if ((i3 & 14) == 0) {
            }
            i15 = i4 & 2048;
            if (i15 != 0) {
            }
            if ((i3 & 896) == 0) {
            }
            if ((i3 & 7168) == 0) {
            }
            if ((i3 & 57344) == 0) {
            }
            if ((i3 & 458752) == 0) {
            }
            if ((i3 & 3670016) == 0) {
            }
            if ((i4 & 131072) == 0) {
            }
            i14 |= i16;
            if ((i5 & 1533916891) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
            }
            if (i25 == 0) {
            }
            if ((i4 & 2) == 0) {
            }
            if (i26 == 0) {
            }
            if (i6 == 0) {
            }
            if (i7 == 0) {
            }
            if (i8 == 0) {
            }
            if (i9 != 0) {
            }
            if (i11 == 0) {
            }
            if (i12 == 0) {
            }
            if (i13 == 0) {
            }
            ScaffoldState scaffoldState622 = scaffoldState2;
            Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3722 = function36;
            if ((i4 & 1024) == 0) {
            }
            int i2922 = i14;
            if (i15 == 0) {
            }
            if ((i4 & 4096) == 0) {
            }
            float f422 = m1349getElevationD9Ej5fM;
            if ((i4 & 8192) == 0) {
            }
            if ((i4 & 16384) == 0) {
            }
            if ((32768 & i4) == 0) {
            }
            if ((i4 & 65536) == 0) {
            }
            j14 = j7;
            f2 = f422;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            Function2<? super Composer, ? super Integer, Unit> function2722 = m1335getLambda1$material_release;
            ComposableLambda composableLambda22 = ComposableLambdaKt.composableLambda(startRestartGroup, 1823402604, true, new ScaffoldKt$Scaffold$child$1(j12, j11, i19, z3, i10, m1335getLambda1$material_release, content, m1338getLambda4$material_release, m1336getLambda2$material_release, i20, m1337getLambda3$material_release, scaffoldState3));
            if (function33 == null) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            scaffoldState5 = scaffoldState4;
            function24 = m1338getLambda4$material_release;
            f3 = f2;
            j15 = j8;
            j16 = j14;
            j17 = j13;
            j18 = j12;
            j19 = j11;
            function34 = function33;
            function25 = function2722;
            int i3222 = i10;
            z6 = z5;
            function26 = m1336getLambda2$material_release;
            i21 = i3222;
            boolean z1022 = z3;
            shape4 = shape3;
            function35 = m1337getLambda3$material_release;
            z7 = z1022;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i6 = i4 & 8;
        int i272 = 2048;
        if (i6 == 0) {
        }
        i7 = i4 & 16;
        int i2822 = 16384;
        if (i7 != 0) {
        }
        i8 = i4 & 32;
        if (i8 != 0) {
        }
        i9 = i4 & 64;
        if (i9 != 0) {
        }
        i11 = i4 & 128;
        if (i11 != 0) {
        }
        i12 = i4 & 256;
        if (i12 != 0) {
        }
        i13 = i4 & 512;
        if (i13 != 0) {
        }
        if ((i3 & 14) == 0) {
        }
        i15 = i4 & 2048;
        if (i15 != 0) {
        }
        if ((i3 & 896) == 0) {
        }
        if ((i3 & 7168) == 0) {
        }
        if ((i3 & 57344) == 0) {
        }
        if ((i3 & 458752) == 0) {
        }
        if ((i3 & 3670016) == 0) {
        }
        if ((i4 & 131072) == 0) {
        }
        i14 |= i16;
        if ((i5 & 1533916891) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i2 & 1) != 0) {
        }
        if (i25 == 0) {
        }
        if ((i4 & 2) == 0) {
        }
        if (i26 == 0) {
        }
        if (i6 == 0) {
        }
        if (i7 == 0) {
        }
        if (i8 == 0) {
        }
        if (i9 != 0) {
        }
        if (i11 == 0) {
        }
        if (i12 == 0) {
        }
        if (i13 == 0) {
        }
        ScaffoldState scaffoldState6222 = scaffoldState2;
        Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function37222 = function36;
        if ((i4 & 1024) == 0) {
        }
        int i29222 = i14;
        if (i15 == 0) {
        }
        if ((i4 & 4096) == 0) {
        }
        float f4222 = m1349getElevationD9Ej5fM;
        if ((i4 & 8192) == 0) {
        }
        if ((i4 & 16384) == 0) {
        }
        if ((32768 & i4) == 0) {
        }
        if ((i4 & 65536) == 0) {
        }
        j14 = j7;
        f2 = f4222;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        Function2<? super Composer, ? super Integer, Unit> function27222 = m1335getLambda1$material_release;
        ComposableLambda composableLambda222 = ComposableLambdaKt.composableLambda(startRestartGroup, 1823402604, true, new ScaffoldKt$Scaffold$child$1(j12, j11, i19, z3, i10, m1335getLambda1$material_release, content, m1338getLambda4$material_release, m1336getLambda2$material_release, i20, m1337getLambda3$material_release, scaffoldState3));
        if (function33 == null) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        scaffoldState5 = scaffoldState4;
        function24 = m1338getLambda4$material_release;
        f3 = f2;
        j15 = j8;
        j16 = j14;
        j17 = j13;
        j18 = j12;
        j19 = j11;
        function34 = function33;
        function25 = function27222;
        int i32222 = i10;
        z6 = z5;
        function26 = m1336getLambda2$material_release;
        i21 = i32222;
        boolean z10222 = z3;
        shape4 = shape3;
        function35 = m1337getLambda3$material_release;
        z7 = z10222;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ScaffoldLayout-MDYNRJg  reason: not valid java name */
    public static final void m1443ScaffoldLayoutMDYNRJg(boolean z, int i, Function2<? super Composer, ? super Integer, Unit> function2, Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, Composer composer, int i2) {
        int i3;
        int i4;
        Composer startRestartGroup = composer.startRestartGroup(-1401632215);
        ComposerKt.sourceInformation(startRestartGroup, "C(ScaffoldLayout)P(4,3:c#material.FabPosition,6,1,5,2)236@10234L4586,236@10217L4603:Scaffold.kt#jmzs0o");
        int i5 = (i2 & 14) == 0 ? (startRestartGroup.changed(z) ? 4 : 2) | i2 : i2;
        if ((i2 & 112) == 0) {
            i5 |= startRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i2 & 896) == 0) {
            i5 |= startRestartGroup.changedInstance(function2) ? 256 : 128;
        }
        if ((i2 & 7168) == 0) {
            i5 |= startRestartGroup.changedInstance(function3) ? 2048 : 1024;
        }
        if ((57344 & i2) == 0) {
            i5 |= startRestartGroup.changedInstance(function22) ? 16384 : 8192;
        }
        if ((458752 & i2) == 0) {
            i5 |= startRestartGroup.changedInstance(function23) ? 131072 : 65536;
        }
        if ((3670016 & i2) == 0) {
            i5 |= startRestartGroup.changedInstance(function24) ? 1048576 : 524288;
        }
        int i6 = i5;
        if ((2995931 & i6) != 599186 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1401632215, i6, -1, "androidx.compose.material.ScaffoldLayout (Scaffold.kt:227)");
            }
            Object[] objArr = {function2, function22, function23, FabPosition.m1372boximpl(i), Boolean.valueOf(z), function24, function3};
            startRestartGroup.startReplaceableGroup(-568225417);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
            int i7 = 0;
            boolean z2 = false;
            for (int i8 = 7; i7 < i8; i8 = 7) {
                z2 |= startRestartGroup.changed(objArr[i7]);
                i7++;
            }
            ScaffoldKt$ScaffoldLayout$1$1 rememberedValue = startRestartGroup.rememberedValue();
            if (z2 || rememberedValue == Composer.Companion.getEmpty()) {
                i3 = 1;
                i4 = 0;
                rememberedValue = new ScaffoldKt$ScaffoldLayout$1$1(function2, function22, function23, i, z, function24, i6, function3);
                startRestartGroup.updateRememberedValue(rememberedValue);
            } else {
                i3 = 1;
                i4 = 0;
            }
            startRestartGroup.endReplaceableGroup();
            SubcomposeLayoutKt.SubcomposeLayout(null, (Function2) rememberedValue, startRestartGroup, i4, i3);
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
        endRestartGroup.updateScope(new ScaffoldKt$ScaffoldLayout$2(z, i, function2, function3, function22, function23, function24, i2));
    }

    public static final ProvidableCompositionLocal<FabPlacement> getLocalFabPlacement() {
        return LocalFabPlacement;
    }
}
