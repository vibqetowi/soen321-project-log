package androidx.compose.material;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Dp;
import androidx.profileinstaller.ProfileVerifier;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ifriend.keychain.cipherStorage.CipherStorageKeystoreRsaEcb;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: AppBar.kt */
@Metadata(d1 = {"\u0000Z\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001ae\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00072\u001c\u0010\u0014\u001a\u0018\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\n0\u0015¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u0018H\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001aq\u0010\u001b\u001a\u00020\n2\b\b\u0002\u0010\u0013\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u000e\u001a\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u001c\u0010\u0014\u001a\u0018\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\n0\u0015¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u0018H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0087\u0001\u0010\u001f\u001a\u00020\n2\u0011\u0010 \u001a\r\u0012\u0004\u0012\u00020\n0!¢\u0006\u0002\b\u00172\b\b\u0002\u0010\u0013\u001a\u00020\u00072\u0015\b\u0002\u0010\"\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010!¢\u0006\u0002\b\u00172\u001e\b\u0002\u0010#\u001a\u0018\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\n0\u0015¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u00182\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u0001H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b$\u0010%\u001ae\u0010\u001f\u001a\u00020\n2\b\b\u0002\u0010\u0013\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u001c\u0010\u0014\u001a\u0018\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\n0\u0015¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u0018H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b&\u0010'\u001a\u0019\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020)H\u0080\b\u001a,\u0010,\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020)0-2\u0006\u0010.\u001a\u00020)2\u0006\u0010+\u001a\u00020)2\u0006\u0010/\u001a\u00020)H\u0000\u001a\u0011\u00100\u001a\u00020)2\u0006\u00101\u001a\u00020)H\u0082\b\"\u0013\u0010\u0000\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0003\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0004\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0005\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u00062"}, d2 = {"AppBarHeight", "Landroidx/compose/ui/unit/Dp;", "F", "AppBarHorizontalPadding", "BottomAppBarCutoutOffset", "BottomAppBarRoundedEdgeRadius", "TitleIconModifier", "Landroidx/compose/ui/Modifier;", "TitleInsetWithoutIcon", "AppBar", "", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "Landroidx/compose/ui/graphics/Color;", "contentColor", "elevation", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "shape", "Landroidx/compose/ui/graphics/Shape;", "modifier", FirebaseAnalytics.Param.CONTENT, "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "AppBar-celAv9A", "(JJFLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "BottomAppBar", "cutoutShape", "BottomAppBar-Y1yfwus", "(Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/graphics/Shape;FLandroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "TopAppBar", "title", "Lkotlin/Function0;", "navigationIcon", "actions", "TopAppBar-xWeB9-s", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;JJFLandroidx/compose/runtime/Composer;II)V", "TopAppBar-HsRjFd4", "(Landroidx/compose/ui/Modifier;JJFLandroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "calculateCutoutCircleYIntercept", "", "cutoutRadius", "verticalOffset", "calculateRoundedEdgeIntercept", "Lkotlin/Pair;", "controlPointX", "radius", "square", "x", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AppBarKt {
    private static final float AppBarHeight = Dp.m5607constructorimpl(56);
    private static final float AppBarHorizontalPadding;
    private static final float BottomAppBarCutoutOffset;
    private static final float BottomAppBarRoundedEdgeRadius;
    private static final Modifier TitleIconModifier;
    private static final Modifier TitleInsetWithoutIcon;

    private static final float square(float f) {
        return f * f;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x012e  */
    /* renamed from: TopAppBar-xWeB9-s  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1241TopAppBarxWeB9s(Function2<? super Composer, ? super Integer, Unit> title, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, long j, long j2, float f, Composer composer, int i, int i2) {
        int i3;
        int i4;
        Object obj;
        int i5;
        Object obj2;
        long j3;
        long j4;
        int i6;
        float f2;
        Modifier.Companion companion;
        Object obj3;
        Function3<RowScope, Composer, Integer, Unit> m1332getLambda1$material_release;
        long j5;
        long j6;
        long j7;
        float f3;
        Modifier modifier2;
        float f4;
        ScopeUpdateScope endRestartGroup;
        int i7;
        int i8;
        Intrinsics.checkNotNullParameter(title, "title");
        Composer startRestartGroup = composer.startRestartGroup(-2087748139);
        ComposerKt.sourceInformation(startRestartGroup, "C(TopAppBar)P(6,4,5!1,1:c#ui.graphics.Color,2:c#ui.graphics.Color,3:c#ui.unit.Dp)81@3902L6,82@3951L32,85@4047L1254:AppBar.kt#jmzs0o");
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
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                obj = function2;
                i3 |= startRestartGroup.changedInstance(obj) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
                } else if ((i & 7168) == 0) {
                    obj2 = function3;
                    i3 |= startRestartGroup.changedInstance(obj2) ? 2048 : 1024;
                    if ((57344 & i) != 0) {
                        if ((i2 & 16) == 0) {
                            j3 = j;
                            if (startRestartGroup.changed(j3)) {
                                i8 = 16384;
                                i3 |= i8;
                            }
                        } else {
                            j3 = j;
                        }
                        i8 = 8192;
                        i3 |= i8;
                    } else {
                        j3 = j;
                    }
                    if ((i & 458752) != 0) {
                        if ((i2 & 32) == 0) {
                            j4 = j2;
                            if (startRestartGroup.changed(j4)) {
                                i7 = 131072;
                                i3 |= i7;
                            }
                        } else {
                            j4 = j2;
                        }
                        i7 = 65536;
                        i3 |= i7;
                    } else {
                        j4 = j2;
                    }
                    i6 = i2 & 64;
                    if (i6 == 0) {
                        i3 |= 1572864;
                        f2 = f;
                    } else {
                        f2 = f;
                        if ((i & 3670016) == 0) {
                            i3 |= startRestartGroup.changed(f2) ? 1048576 : 524288;
                        }
                    }
                    if ((i3 & 2995931) == 599186 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            companion = i9 == 0 ? Modifier.Companion : modifier;
                            obj3 = i4 == 0 ? null : obj;
                            m1332getLambda1$material_release = i5 == 0 ? ComposableSingletons$AppBarKt.INSTANCE.m1332getLambda1$material_release() : obj2;
                            if ((i2 & 16) == 0) {
                                j5 = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(startRestartGroup, 6));
                                i3 &= -57345;
                            } else {
                                j5 = j3;
                            }
                            if ((i2 & 32) == 0) {
                                j6 = ColorsKt.m1327contentColorForek8zF_U(j5, startRestartGroup, (i3 >> 12) & 14);
                                i3 &= -458753;
                            } else {
                                j6 = j4;
                            }
                            if (i6 == 0) {
                                f3 = AppBarDefaults.INSTANCE.m1237getTopAppBarElevationD9Ej5fM();
                                j7 = j6;
                            } else {
                                j7 = j6;
                                f3 = f2;
                            }
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                            }
                            companion = modifier;
                            obj3 = obj;
                            m1332getLambda1$material_release = obj2;
                            j5 = j3;
                            f3 = f2;
                            j7 = j4;
                        }
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-2087748139, i3, -1, "androidx.compose.material.TopAppBar (AppBar.kt:76)");
                        }
                        int i10 = i3 >> 12;
                        m1238AppBarcelAv9A(j5, j7, f3, AppBarDefaults.INSTANCE.getContentPadding(), RectangleShapeKt.getRectangleShape(), companion, ComposableLambdaKt.composableLambda(startRestartGroup, -1484077694, true, new AppBarKt$TopAppBar$1(obj3, i3, title, m1332getLambda1$material_release)), startRestartGroup, (i10 & 896) | (i10 & 14) | 1600512 | (i10 & 112) | ((i3 << 12) & 458752), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier2 = companion;
                        f4 = f3;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier2 = modifier;
                        obj3 = obj;
                        m1332getLambda1$material_release = obj2;
                        j5 = j3;
                        f4 = f2;
                        j7 = j4;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                        return;
                    }
                    endRestartGroup.updateScope(new AppBarKt$TopAppBar$2(title, modifier2, obj3, m1332getLambda1$material_release, j5, j7, f4, i, i2));
                    return;
                }
                obj2 = function3;
                if ((57344 & i) != 0) {
                }
                if ((i & 458752) != 0) {
                }
                i6 = i2 & 64;
                if (i6 == 0) {
                }
                if ((i3 & 2995931) == 599186) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i9 == 0) {
                }
                if (i4 == 0) {
                }
                if (i5 == 0) {
                }
                if ((i2 & 16) == 0) {
                }
                if ((i2 & 32) == 0) {
                }
                if (i6 == 0) {
                }
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                int i102 = i3 >> 12;
                m1238AppBarcelAv9A(j5, j7, f3, AppBarDefaults.INSTANCE.getContentPadding(), RectangleShapeKt.getRectangleShape(), companion, ComposableLambdaKt.composableLambda(startRestartGroup, -1484077694, true, new AppBarKt$TopAppBar$1(obj3, i3, title, m1332getLambda1$material_release)), startRestartGroup, (i102 & 896) | (i102 & 14) | 1600512 | (i102 & 112) | ((i3 << 12) & 458752), 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier2 = companion;
                f4 = f3;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            obj = function2;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            obj2 = function3;
            if ((57344 & i) != 0) {
            }
            if ((i & 458752) != 0) {
            }
            i6 = i2 & 64;
            if (i6 == 0) {
            }
            if ((i3 & 2995931) == 599186) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i9 == 0) {
            }
            if (i4 == 0) {
            }
            if (i5 == 0) {
            }
            if ((i2 & 16) == 0) {
            }
            if ((i2 & 32) == 0) {
            }
            if (i6 == 0) {
            }
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            int i1022 = i3 >> 12;
            m1238AppBarcelAv9A(j5, j7, f3, AppBarDefaults.INSTANCE.getContentPadding(), RectangleShapeKt.getRectangleShape(), companion, ComposableLambdaKt.composableLambda(startRestartGroup, -1484077694, true, new AppBarKt$TopAppBar$1(obj3, i3, title, m1332getLambda1$material_release)), startRestartGroup, (i1022 & 896) | (i1022 & 14) | 1600512 | (i1022 & 112) | ((i3 << 12) & 458752), 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier2 = companion;
            f4 = f3;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        obj = function2;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        obj2 = function3;
        if ((57344 & i) != 0) {
        }
        if ((i & 458752) != 0) {
        }
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        if ((i3 & 2995931) == 599186) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i9 == 0) {
        }
        if (i4 == 0) {
        }
        if (i5 == 0) {
        }
        if ((i2 & 16) == 0) {
        }
        if ((i2 & 32) == 0) {
        }
        if (i6 == 0) {
        }
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        int i10222 = i3 >> 12;
        m1238AppBarcelAv9A(j5, j7, f3, AppBarDefaults.INSTANCE.getContentPadding(), RectangleShapeKt.getRectangleShape(), companion, ComposableLambdaKt.composableLambda(startRestartGroup, -1484077694, true, new AppBarKt$TopAppBar$1(obj3, i3, title, m1332getLambda1$material_release)), startRestartGroup, (i10222 & 896) | (i10222 & 14) | 1600512 | (i10222 & 112) | ((i3 << 12) & 458752), 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier2 = companion;
        f4 = f3;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0136  */
    /* renamed from: TopAppBar-HsRjFd4  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1240TopAppBarHsRjFd4(Modifier modifier, long j, long j2, float f, PaddingValues paddingValues, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> content, Composer composer, int i, int i2) {
        Object obj;
        int i3;
        long j3;
        long j4;
        float f2;
        int i4;
        Object obj2;
        int i5;
        long j5;
        Object obj3;
        long j6;
        PaddingValues contentPadding;
        long j7;
        float f3;
        Modifier modifier2;
        long j8;
        long j9;
        float f4;
        PaddingValues paddingValues2;
        int i6;
        int i7;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(1897058582);
        ComposerKt.sourceInformation(startRestartGroup, "C(TopAppBar)P(5,0:c#ui.graphics.Color,2:c#ui.graphics.Color,4:c#ui.unit.Dp,3)156@6973L6,157@7022L32,162@7231L182:AppBar.kt#jmzs0o");
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
        if ((i & 112) == 0) {
            if ((i2 & 2) == 0) {
                j3 = j;
                if (startRestartGroup.changed(j3)) {
                    i7 = 32;
                    i3 |= i7;
                }
            } else {
                j3 = j;
            }
            i7 = 16;
            i3 |= i7;
        } else {
            j3 = j;
        }
        if ((i & 896) == 0) {
            if ((i2 & 4) == 0) {
                j4 = j2;
                if (startRestartGroup.changed(j4)) {
                    i6 = 256;
                    i3 |= i6;
                }
            } else {
                j4 = j2;
            }
            i6 = 128;
            i3 |= i6;
        } else {
            j4 = j2;
        }
        int i9 = i2 & 8;
        if (i9 != 0) {
            i3 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
        } else if ((i & 7168) == 0) {
            f2 = f;
            i3 |= startRestartGroup.changed(f2) ? 2048 : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((57344 & i) == 0) {
                obj2 = paddingValues;
                i3 |= startRestartGroup.changed(obj2) ? 16384 : 8192;
                if ((i2 & 32) == 0) {
                    if ((i & 458752) == 0) {
                        i5 = startRestartGroup.changedInstance(content) ? 131072 : 65536;
                    }
                    if ((374491 & i3) == 74898 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            Modifier.Companion companion = i8 == 0 ? Modifier.Companion : obj;
                            if ((i2 & 2) == 0) {
                                j5 = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(startRestartGroup, 6));
                                i3 &= -113;
                            } else {
                                j5 = j3;
                            }
                            if ((i2 & 4) != 0) {
                                i3 &= -897;
                                j4 = ColorsKt.m1327contentColorForek8zF_U(j5, startRestartGroup, (i3 >> 3) & 14);
                            }
                            if (i9 != 0) {
                                f2 = AppBarDefaults.INSTANCE.m1237getTopAppBarElevationD9Ej5fM();
                            }
                            if (i4 == 0) {
                                obj3 = companion;
                                j6 = j5;
                                contentPadding = AppBarDefaults.INSTANCE.getContentPadding();
                                j7 = j4;
                                f3 = f2;
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1897058582, i3, -1, "androidx.compose.material.TopAppBar (AppBar.kt:154)");
                                }
                                int i10 = i3 >> 3;
                                m1238AppBarcelAv9A(j6, j7, f3, contentPadding, RectangleShapeKt.getRectangleShape(), obj3, content, startRestartGroup, (i10 & 7168) | (i10 & 14) | 24576 | (i10 & 112) | (i10 & 896) | ((i3 << 15) & 458752) | (3670016 & (i3 << 3)), 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier2 = obj3;
                                j8 = j6;
                                j9 = j7;
                                f4 = f3;
                                paddingValues2 = contentPadding;
                            } else {
                                obj3 = companion;
                                j6 = j5;
                            }
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 2) != 0) {
                                i3 &= -113;
                            }
                            if ((i2 & 4) != 0) {
                                i3 &= -897;
                            }
                            obj3 = obj;
                            j6 = j3;
                        }
                        j7 = j4;
                        f3 = f2;
                        contentPadding = obj2;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        int i102 = i3 >> 3;
                        m1238AppBarcelAv9A(j6, j7, f3, contentPadding, RectangleShapeKt.getRectangleShape(), obj3, content, startRestartGroup, (i102 & 7168) | (i102 & 14) | 24576 | (i102 & 112) | (i102 & 896) | ((i3 << 15) & 458752) | (3670016 & (i3 << 3)), 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier2 = obj3;
                        j8 = j6;
                        j9 = j7;
                        f4 = f3;
                        paddingValues2 = contentPadding;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier2 = obj;
                        j8 = j3;
                        j9 = j4;
                        f4 = f2;
                        paddingValues2 = obj2;
                    }
                    ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        return;
                    }
                    endRestartGroup.updateScope(new AppBarKt$TopAppBar$3(modifier2, j8, j9, f4, paddingValues2, content, i, i2));
                    return;
                }
                i5 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                i3 |= i5;
                if ((374491 & i3) == 74898) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i8 == 0) {
                }
                if ((i2 & 2) == 0) {
                }
                if ((i2 & 4) != 0) {
                }
                if (i9 != 0) {
                }
                if (i4 == 0) {
                }
            }
            obj2 = paddingValues;
            if ((i2 & 32) == 0) {
            }
            i3 |= i5;
            if ((374491 & i3) == 74898) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i8 == 0) {
            }
            if ((i2 & 2) == 0) {
            }
            if ((i2 & 4) != 0) {
            }
            if (i9 != 0) {
            }
            if (i4 == 0) {
            }
        }
        f2 = f;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        obj2 = paddingValues;
        if ((i2 & 32) == 0) {
        }
        i3 |= i5;
        if ((374491 & i3) == 74898) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i8 == 0) {
        }
        if ((i2 & 2) == 0) {
        }
        if ((i2 & 4) != 0) {
        }
        if (i9 != 0) {
        }
        if (i4 == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:134:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x012f  */
    /* renamed from: BottomAppBar-Y1yfwus  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1239BottomAppBarY1yfwus(Modifier modifier, long j, long j2, Shape shape, float f, PaddingValues paddingValues, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> content, Composer composer, int i, int i2) {
        int i3;
        long j3;
        long j4;
        Object obj;
        int i4;
        float f2;
        int i5;
        int i6;
        PaddingValues paddingValues2;
        Modifier modifier2;
        Shape shape2;
        BottomAppBarCutoutShape rectangleShape;
        Modifier modifier3;
        Shape shape3;
        float f3;
        long j5;
        long j6;
        PaddingValues paddingValues3;
        ScopeUpdateScope endRestartGroup;
        int i7;
        int i8;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-1651948973);
        ComposerKt.sourceInformation(startRestartGroup, "C(BottomAppBar)P(6,0:c#ui.graphics.Color,2:c#ui.graphics.Color,4,5:c#ui.unit.Dp,3)216@9902L6,217@9951L32,223@10232L7,229@10422L152:AppBar.kt#jmzs0o");
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
            obj = shape;
            i3 |= startRestartGroup.changed(obj) ? 2048 : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((57344 & i) == 0) {
                f2 = f;
                i3 |= startRestartGroup.changed(f2) ? 16384 : 8192;
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i & 458752) == 0) {
                    i3 |= startRestartGroup.changed(paddingValues) ? 131072 : 65536;
                }
                if ((i2 & 64) == 0) {
                    if ((i & 3670016) == 0) {
                        i6 = startRestartGroup.changedInstance(content) ? 1048576 : 524288;
                    }
                    if ((i3 & 2995931) == 599186 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            Modifier.Companion companion = i9 == 0 ? Modifier.Companion : modifier;
                            if ((i2 & 2) != 0) {
                                i3 &= -113;
                                j3 = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(startRestartGroup, 6));
                            }
                            if ((i2 & 4) != 0) {
                                i3 &= -897;
                                j4 = ColorsKt.m1327contentColorForek8zF_U(j3, startRestartGroup, (i3 >> 3) & 14);
                            }
                            if (i10 != 0) {
                                obj = null;
                            }
                            if (i4 != 0) {
                                f2 = AppBarDefaults.INSTANCE.m1236getBottomAppBarElevationD9Ej5fM();
                            }
                            if (i5 == 0) {
                                modifier2 = companion;
                                paddingValues2 = AppBarDefaults.INSTANCE.getContentPadding();
                            } else {
                                paddingValues2 = paddingValues;
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
                            modifier2 = modifier;
                            paddingValues2 = paddingValues;
                        }
                        long j7 = j3;
                        long j8 = j4;
                        float f4 = f2;
                        shape2 = obj;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1651948973, i3, -1, "androidx.compose.material.BottomAppBar (AppBar.kt:214)");
                        }
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                        Object consume = startRestartGroup.consume(ScaffoldKt.getLocalFabPlacement());
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        FabPlacement fabPlacement = (FabPlacement) consume;
                        if (shape2 != null) {
                            boolean z = false;
                            if (fabPlacement != null && fabPlacement.isDocked()) {
                                z = true;
                            }
                            if (z) {
                                rectangleShape = new BottomAppBarCutoutShape(shape2, fabPlacement);
                                int i11 = i3 >> 3;
                                int i12 = i3 >> 6;
                                m1238AppBarcelAv9A(j7, j8, f4, paddingValues2, rectangleShape, modifier2, content, startRestartGroup, (i11 & 112) | (i11 & 14) | (i12 & 896) | (i12 & 7168) | ((i3 << 15) & 458752) | (i3 & 3670016), 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier3 = modifier2;
                                shape3 = shape2;
                                f3 = f4;
                                j5 = j7;
                                j6 = j8;
                                paddingValues3 = paddingValues2;
                            }
                        }
                        rectangleShape = RectangleShapeKt.getRectangleShape();
                        int i112 = i3 >> 3;
                        int i122 = i3 >> 6;
                        m1238AppBarcelAv9A(j7, j8, f4, paddingValues2, rectangleShape, modifier2, content, startRestartGroup, (i112 & 112) | (i112 & 14) | (i122 & 896) | (i122 & 7168) | ((i3 << 15) & 458752) | (i3 & 3670016), 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier3 = modifier2;
                        shape3 = shape2;
                        f3 = f4;
                        j5 = j7;
                        j6 = j8;
                        paddingValues3 = paddingValues2;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier3 = modifier;
                        paddingValues3 = paddingValues;
                        j5 = j3;
                        j6 = j4;
                        shape3 = obj;
                        f3 = f2;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                        return;
                    }
                    endRestartGroup.updateScope(new AppBarKt$BottomAppBar$1(modifier3, j5, j6, shape3, f3, paddingValues3, content, i, i2));
                    return;
                }
                i6 = 1572864;
                i3 |= i6;
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
                if (i5 == 0) {
                }
                long j72 = j3;
                long j82 = j4;
                float f42 = f2;
                shape2 = obj;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume2 = startRestartGroup.consume(ScaffoldKt.getLocalFabPlacement());
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                FabPlacement fabPlacement2 = (FabPlacement) consume2;
                if (shape2 != null) {
                }
                rectangleShape = RectangleShapeKt.getRectangleShape();
                int i1122 = i3 >> 3;
                int i1222 = i3 >> 6;
                m1238AppBarcelAv9A(j72, j82, f42, paddingValues2, rectangleShape, modifier2, content, startRestartGroup, (i1122 & 112) | (i1122 & 14) | (i1222 & 896) | (i1222 & 7168) | ((i3 << 15) & 458752) | (i3 & 3670016), 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier2;
                shape3 = shape2;
                f3 = f42;
                j5 = j72;
                j6 = j82;
                paddingValues3 = paddingValues2;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            f2 = f;
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            if ((i2 & 64) == 0) {
            }
            i3 |= i6;
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
            if (i5 == 0) {
            }
            long j722 = j3;
            long j822 = j4;
            float f422 = f2;
            shape2 = obj;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume22 = startRestartGroup.consume(ScaffoldKt.getLocalFabPlacement());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            FabPlacement fabPlacement22 = (FabPlacement) consume22;
            if (shape2 != null) {
            }
            rectangleShape = RectangleShapeKt.getRectangleShape();
            int i11222 = i3 >> 3;
            int i12222 = i3 >> 6;
            m1238AppBarcelAv9A(j722, j822, f422, paddingValues2, rectangleShape, modifier2, content, startRestartGroup, (i11222 & 112) | (i11222 & 14) | (i12222 & 896) | (i12222 & 7168) | ((i3 << 15) & 458752) | (i3 & 3670016), 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier2;
            shape3 = shape2;
            f3 = f422;
            j5 = j722;
            j6 = j822;
            paddingValues3 = paddingValues2;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        obj = shape;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        f2 = f;
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        if ((i2 & 64) == 0) {
        }
        i3 |= i6;
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
        if (i5 == 0) {
        }
        long j7222 = j3;
        long j8222 = j4;
        float f4222 = f2;
        shape2 = obj;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume222 = startRestartGroup.consume(ScaffoldKt.getLocalFabPlacement());
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        FabPlacement fabPlacement222 = (FabPlacement) consume222;
        if (shape2 != null) {
        }
        rectangleShape = RectangleShapeKt.getRectangleShape();
        int i112222 = i3 >> 3;
        int i122222 = i3 >> 6;
        m1238AppBarcelAv9A(j7222, j8222, f4222, paddingValues2, rectangleShape, modifier2, content, startRestartGroup, (i112222 & 112) | (i112222 & 14) | (i122222 & 896) | (i122222 & 7168) | ((i3 << 15) & 458752) | (i3 & 3670016), 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier3 = modifier2;
        shape3 = shape2;
        f3 = f4222;
        j5 = j7222;
        j6 = j8222;
        paddingValues3 = paddingValues2;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final float calculateCutoutCircleYIntercept(float f, float f2) {
        return -((float) Math.sqrt((f * f) - (f2 * f2)));
    }

    public static final Pair<Float, Float> calculateRoundedEdgeIntercept(float f, float f2, float f3) {
        Float valueOf;
        Float valueOf2;
        Pair pair;
        Float valueOf3;
        Float valueOf4;
        float f4 = f2 * f2;
        float f5 = f3 * f3;
        float f6 = (f * f) + f4;
        float f7 = f4 * f5 * (f6 - f5);
        float f8 = f * f5;
        double d = f7;
        float sqrt = (f8 - ((float) Math.sqrt(d))) / f6;
        float sqrt2 = (f8 + ((float) Math.sqrt(d))) / f6;
        float sqrt3 = (float) Math.sqrt(f5 - (sqrt * sqrt));
        float sqrt4 = (float) Math.sqrt(f5 - (sqrt2 * sqrt2));
        if (f2 > 0.0f) {
            if (sqrt3 > sqrt4) {
                valueOf3 = Float.valueOf(sqrt);
                valueOf4 = Float.valueOf(sqrt3);
            } else {
                valueOf3 = Float.valueOf(sqrt2);
                valueOf4 = Float.valueOf(sqrt4);
            }
            pair = TuplesKt.to(valueOf3, valueOf4);
        } else {
            if (sqrt3 < sqrt4) {
                valueOf = Float.valueOf(sqrt);
                valueOf2 = Float.valueOf(sqrt3);
            } else {
                valueOf = Float.valueOf(sqrt2);
                valueOf2 = Float.valueOf(sqrt4);
            }
            pair = TuplesKt.to(valueOf, valueOf2);
        }
        float floatValue = ((Number) pair.component1()).floatValue();
        float floatValue2 = ((Number) pair.component2()).floatValue();
        if (floatValue < f) {
            floatValue2 = -floatValue2;
        }
        return TuplesKt.to(Float.valueOf(floatValue), Float.valueOf(floatValue2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /* renamed from: AppBar-celAv9A  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1238AppBarcelAv9A(long j, long j2, float f, PaddingValues paddingValues, Shape shape, Modifier modifier, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, int i, int i2) {
        int i3;
        int i4;
        Object obj;
        Modifier.Companion companion;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(-1249680788);
        ComposerKt.sourceInformation(startRestartGroup, "C(AppBar)P(0:c#ui.graphics.Color,2:c#ui.graphics.Color,4:c#ui.unit.Dp,3,6,5)513@22344L583:AppBar.kt#jmzs0o");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(j) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(j2) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= startRestartGroup.changed(f) ? 256 : 128;
            if ((i2 & 8) == 0) {
                i3 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
            } else if ((i & 7168) == 0) {
                i3 |= startRestartGroup.changed(paddingValues) ? 2048 : 1024;
            }
            if ((i2 & 16) == 0) {
                i3 |= 24576;
            } else if ((57344 & i) == 0) {
                i3 |= startRestartGroup.changed(shape) ? 16384 : 8192;
            }
            i4 = i2 & 32;
            if (i4 == 0) {
                i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((i & 458752) == 0) {
                obj = modifier;
                i3 |= startRestartGroup.changed(obj) ? 131072 : 65536;
                if ((i2 & 64) != 0) {
                    i3 |= 1572864;
                } else if ((3670016 & i) == 0) {
                    i3 |= startRestartGroup.changedInstance(function3) ? 1048576 : 524288;
                }
                if ((2995931 & i3) == 599186 || !startRestartGroup.getSkipping()) {
                    companion = i4 != 0 ? Modifier.Companion : obj;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1249680788, i3, -1, "androidx.compose.material.AppBar (AppBar.kt:504)");
                    }
                    int i5 = i3 << 6;
                    SurfaceKt.m1471SurfaceFjzlyU(companion, shape, j, j2, null, f, ComposableLambdaKt.composableLambda(startRestartGroup, -1027830352, true, new AppBarKt$AppBar$1(paddingValues, function3, i3)), startRestartGroup, ((i3 >> 15) & 14) | 1572864 | ((i3 >> 9) & 112) | (i5 & 896) | (i5 & 7168) | ((i3 << 9) & 458752), 16);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    startRestartGroup.skipToGroupEnd();
                    companion = obj;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                    return;
                }
                endRestartGroup.updateScope(new AppBarKt$AppBar$2(j, j2, f, paddingValues, shape, companion, function3, i, i2));
                return;
            }
            obj = modifier;
            if ((i2 & 64) != 0) {
            }
            if ((2995931 & i3) == 599186) {
            }
            if (i4 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            int i52 = i3 << 6;
            SurfaceKt.m1471SurfaceFjzlyU(companion, shape, j, j2, null, f, ComposableLambdaKt.composableLambda(startRestartGroup, -1027830352, true, new AppBarKt$AppBar$1(paddingValues, function3, i3)), startRestartGroup, ((i3 >> 15) & 14) | 1572864 | ((i3 >> 9) & 112) | (i52 & 896) | (i52 & 7168) | ((i3 << 9) & 458752), 16);
            if (ComposerKt.isTraceInProgress()) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        if ((i2 & 8) == 0) {
        }
        if ((i2 & 16) == 0) {
        }
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        obj = modifier;
        if ((i2 & 64) != 0) {
        }
        if ((2995931 & i3) == 599186) {
        }
        if (i4 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        int i522 = i3 << 6;
        SurfaceKt.m1471SurfaceFjzlyU(companion, shape, j, j2, null, f, ComposableLambdaKt.composableLambda(startRestartGroup, -1027830352, true, new AppBarKt$AppBar$1(paddingValues, function3, i3)), startRestartGroup, ((i3 >> 15) & 14) | 1572864 | ((i3 >> 9) & 112) | (i522 & 896) | (i522 & 7168) | ((i3 << 9) & 458752), 16);
        if (ComposerKt.isTraceInProgress()) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    static {
        float f = 4;
        float m5607constructorimpl = Dp.m5607constructorimpl(f);
        AppBarHorizontalPadding = m5607constructorimpl;
        TitleInsetWithoutIcon = SizeKt.m800width3ABfNKs(Modifier.Companion, Dp.m5607constructorimpl(Dp.m5607constructorimpl(16) - m5607constructorimpl));
        TitleIconModifier = SizeKt.m800width3ABfNKs(SizeKt.fillMaxHeight$default(Modifier.Companion, 0.0f, 1, null), Dp.m5607constructorimpl(Dp.m5607constructorimpl(72) - m5607constructorimpl));
        BottomAppBarCutoutOffset = Dp.m5607constructorimpl(8);
        BottomAppBarRoundedEdgeRadius = Dp.m5607constructorimpl(f);
    }
}
