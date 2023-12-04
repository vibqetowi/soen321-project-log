package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import androidx.compose.ui.unit.Dp;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.google.android.exoplayer2.C;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ifriend.keychain.cipherStorage.CipherStorageKeystoreRsaEcb;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: Scaffold.kt */
@Metadata(d1 = {"\u0000N\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a´\u0001\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u0013\b\u0002\u0010\f\u001a\r\u0012\u0004\u0012\u00020\t0\r¢\u0006\u0002\b\u000e2\u0013\b\u0002\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\t0\r¢\u0006\u0002\b\u000e2\u0013\b\u0002\u0010\u0010\u001a\r\u0012\u0004\u0012\u00020\t0\r¢\u0006\u0002\b\u000e2\u0013\b\u0002\u0010\u0011\u001a\r\u0012\u0004\u0012\u00020\t0\r¢\u0006\u0002\b\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00182\u0017\u0010\u0019\u001a\u0013\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\t0\u001a¢\u0006\u0002\b\u000eH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u008a\u0001\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\u00132\u0011\u0010\f\u001a\r\u0012\u0004\u0012\u00020\t0\r¢\u0006\u0002\b\u000e2\u0017\u0010\u0019\u001a\u0013\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\t0\u001a¢\u0006\u0002\b\u000e2\u0011\u0010 \u001a\r\u0012\u0004\u0012\u00020\t0\r¢\u0006\u0002\b\u000e2\u0011\u0010!\u001a\r\u0012\u0004\u0012\u00020\t0\r¢\u0006\u0002\b\u000e2\u0006\u0010\u0017\u001a\u00020\u00182\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\t0\r¢\u0006\u0002\b\u000eH\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\"\u0010#\"\u0013\u0010\u0000\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u001c\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006$"}, d2 = {"FabSpacing", "Landroidx/compose/ui/unit/Dp;", "F", "LocalFabPlacement", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/material3/FabPlacement;", "getLocalFabPlacement", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "Scaffold", "", "modifier", "Landroidx/compose/ui/Modifier;", "topBar", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "bottomBar", "snackbarHost", "floatingActionButton", "floatingActionButtonPosition", "Landroidx/compose/material3/FabPosition;", "containerColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "contentWindowInsets", "Landroidx/compose/foundation/layout/WindowInsets;", FirebaseAnalytics.Param.CONTENT, "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/PaddingValues;", "Scaffold-TvnljyQ", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;IJJLandroidx/compose/foundation/layout/WindowInsets;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "ScaffoldLayout", "fabPosition", "snackbar", "fab", "ScaffoldLayout-FMILGgc", "(ILkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/layout/WindowInsets;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ScaffoldKt {
    private static final ProvidableCompositionLocal<FabPlacement> LocalFabPlacement = CompositionLocalKt.staticCompositionLocalOf(ScaffoldKt$LocalFabPlacement$1.INSTANCE);
    private static final float FabSpacing = Dp.m5607constructorimpl(16);

    /* JADX WARN: Removed duplicated region for block: B:100:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:170:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0121  */
    /* renamed from: Scaffold-TvnljyQ  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1949ScaffoldTvnljyQ(Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, int i, long j, long j2, WindowInsets windowInsets, Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> content, Composer composer, int i2, int i3) {
        int i4;
        Object obj;
        int i5;
        Object obj2;
        int i6;
        int i7;
        Object obj3;
        int i8;
        int i9;
        long j3;
        int i10;
        Modifier.Companion companion;
        Function2<Composer, Integer, Unit> m1713getLambda1$material3_release;
        Function2<Composer, Integer, Unit> m1714getLambda2$material3_release;
        Function2<Composer, Integer, Unit> m1715getLambda3$material3_release;
        Function2<Composer, Integer, Unit> m1716getLambda4$material3_release;
        int m1798getEndERTFSPs;
        int i11;
        long j4;
        int i12;
        WindowInsets windowInsets2;
        WindowInsets windowInsets3;
        long j5;
        long j6;
        Function2<? super Composer, ? super Integer, Unit> function25;
        Function2<? super Composer, ? super Integer, Unit> function26;
        Function2<? super Composer, ? super Integer, Unit> function27;
        Modifier modifier2;
        ScopeUpdateScope endRestartGroup;
        int i13;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-1219521777);
        ComposerKt.sourceInformation(startRestartGroup, "C(Scaffold)P(7,9!1,8,5,6:c#material3.FabPosition,1:c#ui.graphics.Color,3:c#ui.graphics.Color,4)80@4062L11,81@4112L31,82@4202L19,85@4280L405:Scaffold.kt#uh7d8r");
        int i14 = i3 & 1;
        if (i14 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i4 = (startRestartGroup.changed(modifier) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i15 = i3 & 2;
        if (i15 != 0) {
            i4 |= 48;
        } else if ((i2 & 112) == 0) {
            obj = function2;
            i4 |= startRestartGroup.changedInstance(obj) ? 32 : 16;
            i5 = i3 & 4;
            if (i5 == 0) {
                i4 |= 384;
            } else if ((i2 & 896) == 0) {
                obj2 = function22;
                i4 |= startRestartGroup.changedInstance(obj2) ? 256 : 128;
                i6 = i3 & 8;
                if (i6 != 0) {
                    i4 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
                } else if ((i2 & 7168) == 0) {
                    i4 |= startRestartGroup.changedInstance(function23) ? 2048 : 1024;
                    i7 = i3 & 16;
                    if (i7 == 0) {
                        i4 |= 24576;
                    } else if ((57344 & i2) == 0) {
                        obj3 = function24;
                        i4 |= startRestartGroup.changedInstance(obj3) ? 16384 : 8192;
                        i8 = i3 & 32;
                        if (i8 != 0) {
                            i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        } else if ((i2 & 458752) == 0) {
                            i4 |= startRestartGroup.changed(i) ? 131072 : 65536;
                        }
                        if ((i2 & 3670016) == 0) {
                            i9 = i7;
                            i4 |= ((i3 & 64) == 0 && startRestartGroup.changed(j)) ? 1048576 : 524288;
                        } else {
                            i9 = i7;
                        }
                        if ((i2 & 29360128) == 0) {
                            j3 = j2;
                            i4 |= ((i3 & 128) == 0 && startRestartGroup.changed(j3)) ? 8388608 : 4194304;
                        } else {
                            j3 = j2;
                        }
                        if ((234881024 & i2) == 0) {
                            if ((i3 & 256) == 0 && startRestartGroup.changed(windowInsets)) {
                                i13 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                                i4 |= i13;
                            }
                            i13 = 33554432;
                            i4 |= i13;
                        }
                        if ((i3 & 512) == 0) {
                            if ((1879048192 & i2) == 0) {
                                i10 = startRestartGroup.changedInstance(content) ? 536870912 : 268435456;
                            }
                            if ((1533916891 & i4) == 306783378 || !startRestartGroup.getSkipping()) {
                                startRestartGroup.startDefaults();
                                if ((i2 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                    companion = i14 == 0 ? Modifier.Companion : modifier;
                                    m1713getLambda1$material3_release = i15 == 0 ? ComposableSingletons$ScaffoldKt.INSTANCE.m1713getLambda1$material3_release() : obj;
                                    m1714getLambda2$material3_release = i5 == 0 ? ComposableSingletons$ScaffoldKt.INSTANCE.m1714getLambda2$material3_release() : obj2;
                                    m1715getLambda3$material3_release = i6 == 0 ? ComposableSingletons$ScaffoldKt.INSTANCE.m1715getLambda3$material3_release() : function23;
                                    m1716getLambda4$material3_release = i9 == 0 ? ComposableSingletons$ScaffoldKt.INSTANCE.m1716getLambda4$material3_release() : obj3;
                                    m1798getEndERTFSPs = i8 == 0 ? FabPosition.Companion.m1798getEndERTFSPs() : i;
                                    if ((i3 & 64) == 0) {
                                        i11 = i4 & (-3670017);
                                        j4 = MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, 6).m1627getBackground0d7_KjU();
                                    } else {
                                        i11 = i4;
                                        j4 = j;
                                    }
                                    if ((i3 & 128) != 0) {
                                        j3 = ColorSchemeKt.m1687contentColorForek8zF_U(j4, startRestartGroup, (i11 >> 18) & 14);
                                        i11 &= -29360129;
                                    }
                                    if ((i3 & 256) == 0) {
                                        i12 = i11 & (-234881025);
                                        windowInsets2 = ScaffoldDefaults.INSTANCE.getContentWindowInsets(startRestartGroup, 6);
                                        companion = companion;
                                    } else {
                                        i12 = i11;
                                        windowInsets2 = windowInsets;
                                    }
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    if ((i3 & 64) != 0) {
                                        i4 &= -3670017;
                                    }
                                    if ((i3 & 128) != 0) {
                                        i4 &= -29360129;
                                    }
                                    if ((i3 & 256) != 0) {
                                        i4 &= -234881025;
                                    }
                                    companion = modifier;
                                    windowInsets2 = windowInsets;
                                    m1713getLambda1$material3_release = obj;
                                    m1714getLambda2$material3_release = obj2;
                                    m1716getLambda4$material3_release = obj3;
                                    m1715getLambda3$material3_release = function23;
                                    m1798getEndERTFSPs = i;
                                    i12 = i4;
                                    j4 = j;
                                }
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1219521777, i12, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:73)");
                                }
                                int i16 = i12 >> 12;
                                SurfaceKt.m2067SurfaceT9BRK9s(companion, null, j4, j3, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(startRestartGroup, -1979205334, true, new ScaffoldKt$Scaffold$1(m1798getEndERTFSPs, m1713getLambda1$material3_release, content, m1715getLambda3$material3_release, m1716getLambda4$material3_release, windowInsets2, m1714getLambda2$material3_release, i12)), startRestartGroup, (i12 & 14) | 12582912 | (i16 & 896) | (i16 & 7168), 114);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                windowInsets3 = windowInsets2;
                                j5 = j3;
                                j6 = j4;
                                function25 = m1714getLambda2$material3_release;
                                function26 = m1715getLambda3$material3_release;
                                function27 = m1716getLambda4$material3_release;
                                obj = m1713getLambda1$material3_release;
                                modifier2 = companion;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                modifier2 = modifier;
                                function26 = function23;
                                windowInsets3 = windowInsets;
                                function25 = obj2;
                                j5 = j3;
                                function27 = obj3;
                                m1798getEndERTFSPs = i;
                                j6 = j;
                            }
                            endRestartGroup = startRestartGroup.endRestartGroup();
                            if (endRestartGroup != null) {
                                return;
                            }
                            endRestartGroup.updateScope(new ScaffoldKt$Scaffold$2(modifier2, obj, function25, function26, function27, m1798getEndERTFSPs, j6, j5, windowInsets3, content, i2, i3));
                            return;
                        }
                        i10 = C.ENCODING_PCM_32BIT;
                        i4 |= i10;
                        if ((1533916891 & i4) == 306783378) {
                        }
                        startRestartGroup.startDefaults();
                        if ((i2 & 1) != 0) {
                        }
                        if (i14 == 0) {
                        }
                        if (i15 == 0) {
                        }
                        if (i5 == 0) {
                        }
                        if (i6 == 0) {
                        }
                        if (i9 == 0) {
                        }
                        if (i8 == 0) {
                        }
                        if ((i3 & 64) == 0) {
                        }
                        if ((i3 & 128) != 0) {
                        }
                        if ((i3 & 256) == 0) {
                        }
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        int i162 = i12 >> 12;
                        SurfaceKt.m2067SurfaceT9BRK9s(companion, null, j4, j3, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(startRestartGroup, -1979205334, true, new ScaffoldKt$Scaffold$1(m1798getEndERTFSPs, m1713getLambda1$material3_release, content, m1715getLambda3$material3_release, m1716getLambda4$material3_release, windowInsets2, m1714getLambda2$material3_release, i12)), startRestartGroup, (i12 & 14) | 12582912 | (i162 & 896) | (i162 & 7168), 114);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        windowInsets3 = windowInsets2;
                        j5 = j3;
                        j6 = j4;
                        function25 = m1714getLambda2$material3_release;
                        function26 = m1715getLambda3$material3_release;
                        function27 = m1716getLambda4$material3_release;
                        obj = m1713getLambda1$material3_release;
                        modifier2 = companion;
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    obj3 = function24;
                    i8 = i3 & 32;
                    if (i8 != 0) {
                    }
                    if ((i2 & 3670016) == 0) {
                    }
                    if ((i2 & 29360128) == 0) {
                    }
                    if ((234881024 & i2) == 0) {
                    }
                    if ((i3 & 512) == 0) {
                    }
                    i4 |= i10;
                    if ((1533916891 & i4) == 306783378) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                    }
                    if (i14 == 0) {
                    }
                    if (i15 == 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (i6 == 0) {
                    }
                    if (i9 == 0) {
                    }
                    if (i8 == 0) {
                    }
                    if ((i3 & 64) == 0) {
                    }
                    if ((i3 & 128) != 0) {
                    }
                    if ((i3 & 256) == 0) {
                    }
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    int i1622 = i12 >> 12;
                    SurfaceKt.m2067SurfaceT9BRK9s(companion, null, j4, j3, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(startRestartGroup, -1979205334, true, new ScaffoldKt$Scaffold$1(m1798getEndERTFSPs, m1713getLambda1$material3_release, content, m1715getLambda3$material3_release, m1716getLambda4$material3_release, windowInsets2, m1714getLambda2$material3_release, i12)), startRestartGroup, (i12 & 14) | 12582912 | (i1622 & 896) | (i1622 & 7168), 114);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    windowInsets3 = windowInsets2;
                    j5 = j3;
                    j6 = j4;
                    function25 = m1714getLambda2$material3_release;
                    function26 = m1715getLambda3$material3_release;
                    function27 = m1716getLambda4$material3_release;
                    obj = m1713getLambda1$material3_release;
                    modifier2 = companion;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                i7 = i3 & 16;
                if (i7 == 0) {
                }
                obj3 = function24;
                i8 = i3 & 32;
                if (i8 != 0) {
                }
                if ((i2 & 3670016) == 0) {
                }
                if ((i2 & 29360128) == 0) {
                }
                if ((234881024 & i2) == 0) {
                }
                if ((i3 & 512) == 0) {
                }
                i4 |= i10;
                if ((1533916891 & i4) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                }
                if (i14 == 0) {
                }
                if (i15 == 0) {
                }
                if (i5 == 0) {
                }
                if (i6 == 0) {
                }
                if (i9 == 0) {
                }
                if (i8 == 0) {
                }
                if ((i3 & 64) == 0) {
                }
                if ((i3 & 128) != 0) {
                }
                if ((i3 & 256) == 0) {
                }
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                int i16222 = i12 >> 12;
                SurfaceKt.m2067SurfaceT9BRK9s(companion, null, j4, j3, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(startRestartGroup, -1979205334, true, new ScaffoldKt$Scaffold$1(m1798getEndERTFSPs, m1713getLambda1$material3_release, content, m1715getLambda3$material3_release, m1716getLambda4$material3_release, windowInsets2, m1714getLambda2$material3_release, i12)), startRestartGroup, (i12 & 14) | 12582912 | (i16222 & 896) | (i16222 & 7168), 114);
                if (ComposerKt.isTraceInProgress()) {
                }
                windowInsets3 = windowInsets2;
                j5 = j3;
                j6 = j4;
                function25 = m1714getLambda2$material3_release;
                function26 = m1715getLambda3$material3_release;
                function27 = m1716getLambda4$material3_release;
                obj = m1713getLambda1$material3_release;
                modifier2 = companion;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            obj2 = function22;
            i6 = i3 & 8;
            if (i6 != 0) {
            }
            i7 = i3 & 16;
            if (i7 == 0) {
            }
            obj3 = function24;
            i8 = i3 & 32;
            if (i8 != 0) {
            }
            if ((i2 & 3670016) == 0) {
            }
            if ((i2 & 29360128) == 0) {
            }
            if ((234881024 & i2) == 0) {
            }
            if ((i3 & 512) == 0) {
            }
            i4 |= i10;
            if ((1533916891 & i4) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
            }
            if (i14 == 0) {
            }
            if (i15 == 0) {
            }
            if (i5 == 0) {
            }
            if (i6 == 0) {
            }
            if (i9 == 0) {
            }
            if (i8 == 0) {
            }
            if ((i3 & 64) == 0) {
            }
            if ((i3 & 128) != 0) {
            }
            if ((i3 & 256) == 0) {
            }
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            int i162222 = i12 >> 12;
            SurfaceKt.m2067SurfaceT9BRK9s(companion, null, j4, j3, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(startRestartGroup, -1979205334, true, new ScaffoldKt$Scaffold$1(m1798getEndERTFSPs, m1713getLambda1$material3_release, content, m1715getLambda3$material3_release, m1716getLambda4$material3_release, windowInsets2, m1714getLambda2$material3_release, i12)), startRestartGroup, (i12 & 14) | 12582912 | (i162222 & 896) | (i162222 & 7168), 114);
            if (ComposerKt.isTraceInProgress()) {
            }
            windowInsets3 = windowInsets2;
            j5 = j3;
            j6 = j4;
            function25 = m1714getLambda2$material3_release;
            function26 = m1715getLambda3$material3_release;
            function27 = m1716getLambda4$material3_release;
            obj = m1713getLambda1$material3_release;
            modifier2 = companion;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        obj = function2;
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        obj2 = function22;
        i6 = i3 & 8;
        if (i6 != 0) {
        }
        i7 = i3 & 16;
        if (i7 == 0) {
        }
        obj3 = function24;
        i8 = i3 & 32;
        if (i8 != 0) {
        }
        if ((i2 & 3670016) == 0) {
        }
        if ((i2 & 29360128) == 0) {
        }
        if ((234881024 & i2) == 0) {
        }
        if ((i3 & 512) == 0) {
        }
        i4 |= i10;
        if ((1533916891 & i4) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i2 & 1) != 0) {
        }
        if (i14 == 0) {
        }
        if (i15 == 0) {
        }
        if (i5 == 0) {
        }
        if (i6 == 0) {
        }
        if (i9 == 0) {
        }
        if (i8 == 0) {
        }
        if ((i3 & 64) == 0) {
        }
        if ((i3 & 128) != 0) {
        }
        if ((i3 & 256) == 0) {
        }
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        int i1622222 = i12 >> 12;
        SurfaceKt.m2067SurfaceT9BRK9s(companion, null, j4, j3, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(startRestartGroup, -1979205334, true, new ScaffoldKt$Scaffold$1(m1798getEndERTFSPs, m1713getLambda1$material3_release, content, m1715getLambda3$material3_release, m1716getLambda4$material3_release, windowInsets2, m1714getLambda2$material3_release, i12)), startRestartGroup, (i12 & 14) | 12582912 | (i1622222 & 896) | (i1622222 & 7168), 114);
        if (ComposerKt.isTraceInProgress()) {
        }
        windowInsets3 = windowInsets2;
        j5 = j3;
        j6 = j4;
        function25 = m1714getLambda2$material3_release;
        function26 = m1715getLambda3$material3_release;
        function27 = m1716getLambda4$material3_release;
        obj = m1713getLambda1$material3_release;
        modifier2 = companion;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ScaffoldLayout-FMILGgc  reason: not valid java name */
    public static final void m1950ScaffoldLayoutFMILGgc(int i, Function2<? super Composer, ? super Integer, Unit> function2, Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, WindowInsets windowInsets, Function2<? super Composer, ? super Integer, Unit> function24, Composer composer, int i2) {
        int i3;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(-975511942);
        ComposerKt.sourceInformation(startRestartGroup, "C(ScaffoldLayout)P(4:c#material3.FabPosition,6,1,5,3,2)121@5603L6544,121@5586L6561:Scaffold.kt#uh7d8r");
        int i4 = (i2 & 14) == 0 ? (startRestartGroup.changed(i) ? 4 : 2) | i2 : i2;
        if ((i2 & 112) == 0) {
            i4 |= startRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if ((i2 & 896) == 0) {
            i4 |= startRestartGroup.changedInstance(function3) ? 256 : 128;
        }
        if ((i2 & 7168) == 0) {
            i4 |= startRestartGroup.changedInstance(function22) ? 2048 : 1024;
        }
        if ((57344 & i2) == 0) {
            i4 |= startRestartGroup.changedInstance(function23) ? 16384 : 8192;
        }
        if ((458752 & i2) == 0) {
            i4 |= startRestartGroup.changed(windowInsets) ? 131072 : 65536;
        }
        if ((3670016 & i2) == 0) {
            i4 |= startRestartGroup.changedInstance(function24) ? 1048576 : 524288;
        }
        int i5 = i4;
        if ((2995931 & i5) != 599186 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-975511942, i5, -1, "androidx.compose.material3.ScaffoldLayout (Scaffold.kt:111)");
            }
            Object[] objArr = {function2, function22, windowInsets, function23, FabPosition.m1790boximpl(i), function24, function3};
            startRestartGroup.startReplaceableGroup(-568225417);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
            int i6 = 0;
            boolean z = false;
            for (int i7 = 7; i6 < i7; i7 = 7) {
                z |= startRestartGroup.changed(objArr[i6]);
                i6++;
            }
            ScaffoldKt$ScaffoldLayout$1$1 rememberedValue = startRestartGroup.rememberedValue();
            if (z || rememberedValue == Composer.Companion.getEmpty()) {
                i3 = 0;
                composer2 = startRestartGroup;
                rememberedValue = new ScaffoldKt$ScaffoldLayout$1$1(function2, function22, function23, i, windowInsets, function24, i5, function3);
                composer2.updateRememberedValue(rememberedValue);
            } else {
                i3 = 0;
                composer2 = startRestartGroup;
            }
            composer2.endReplaceableGroup();
            SubcomposeLayoutKt.SubcomposeLayout(null, (Function2) rememberedValue, composer2, i3, 1);
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
        endRestartGroup.updateScope(new ScaffoldKt$ScaffoldLayout$2(i, function2, function3, function22, function23, windowInsets, function24, i2));
    }

    public static final ProvidableCompositionLocal<FabPlacement> getLocalFabPlacement() {
        return LocalFabPlacement;
    }
}
