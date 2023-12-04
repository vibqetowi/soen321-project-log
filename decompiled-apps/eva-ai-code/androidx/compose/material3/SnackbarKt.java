package androidx.compose.material3;

import androidx.compose.foundation.layout.AlignmentLineKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.tokens.SnackbarTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
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
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.facebook.internal.NativeProtocol;
import com.google.android.exoplayer2.C;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ifriend.keychain.cipherStorage.CipherStorageKeystoreRsaEcb;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
/* compiled from: Snackbar.kt */
@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u001ah\u0010\n\u001a\u00020\u000b2\u0011\u0010\f\u001a\r\u0012\u0004\u0012\u00020\u000b0\r¢\u0006\u0002\b\u000e2\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\u000b0\r¢\u0006\u0002\b\u000e2\u0013\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r¢\u0006\u0002\b\u000e2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001aj\u0010\u0018\u001a\u00020\u000b2\u0011\u0010\f\u001a\r\u0012\u0004\u0012\u00020\u000b0\r¢\u0006\u0002\b\u000e2\u0013\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r¢\u0006\u0002\b\u000e2\u0013\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r¢\u0006\u0002\b\u000e2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u0014H\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u0017\u001am\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020\u00142\b\b\u0002\u0010&\u001a\u00020\u00142\b\b\u0002\u0010'\u001a\u00020\u00142\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u0014H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b(\u0010)\u001a\u009c\u0001\u0010\u001c\u001a\u00020\u000b2\b\b\u0002\u0010\u001f\u001a\u00020 2\u0015\b\u0002\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r¢\u0006\u0002\b\u000e2\u0015\b\u0002\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r¢\u0006\u0002\b\u000e2\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020\u00142\b\b\u0002\u0010&\u001a\u00020\u00142\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00142\u0011\u0010*\u001a\r\u0012\u0004\u0012\u00020\u000b0\r¢\u0006\u0002\b\u000eH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b+\u0010,\"\u0013\u0010\u0000\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0003\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0004\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0005\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0006\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0007\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\b\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\t\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006-"}, d2 = {"ContainerMaxWidth", "Landroidx/compose/ui/unit/Dp;", "F", "HeightToFirstLine", "HorizontalSpacing", "HorizontalSpacingButtonSide", "LongButtonVerticalOffset", "SeparateButtonExtraY", "SnackbarVerticalPadding", "TextEndExtraSpacing", "NewLineButtonSnackbar", "", "text", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", NativeProtocol.WEB_DIALOG_ACTION, "dismissAction", "actionTextStyle", "Landroidx/compose/ui/text/TextStyle;", "actionContentColor", "Landroidx/compose/ui/graphics/Color;", "dismissActionContentColor", "NewLineButtonSnackbar-kKq0p4A", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;JJLandroidx/compose/runtime/Composer;I)V", "OneRowSnackbar", "actionTextColor", "dismissActionColor", "OneRowSnackbar-kKq0p4A", "Snackbar", "snackbarData", "Landroidx/compose/material3/SnackbarData;", "modifier", "Landroidx/compose/ui/Modifier;", "actionOnNewLine", "", "shape", "Landroidx/compose/ui/graphics/Shape;", "containerColor", "contentColor", "actionColor", "Snackbar-sDKtq54", "(Landroidx/compose/material3/SnackbarData;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJJJJLandroidx/compose/runtime/Composer;II)V", FirebaseAnalytics.Param.CONTENT, "Snackbar-eQBnUkQ", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/graphics/Shape;JJJJLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SnackbarKt {
    private static final float HorizontalSpacingButtonSide;
    private static final float TextEndExtraSpacing;
    private static final float ContainerMaxWidth = Dp.m5607constructorimpl(600);
    private static final float HeightToFirstLine = Dp.m5607constructorimpl(30);
    private static final float HorizontalSpacing = Dp.m5607constructorimpl(16);
    private static final float SeparateButtonExtraY = Dp.m5607constructorimpl(2);
    private static final float SnackbarVerticalPadding = Dp.m5607constructorimpl(6);
    private static final float LongButtonVerticalOffset = Dp.m5607constructorimpl(12);

    /* JADX WARN: Removed duplicated region for block: B:101:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:177:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0115  */
    /* renamed from: Snackbar-eQBnUkQ  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1982SnackbareQBnUkQ(Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, boolean z, Shape shape, long j, long j2, long j3, long j4, Function2<? super Composer, ? super Integer, Unit> content, Composer composer, int i, int i2) {
        Object obj;
        int i3;
        Object obj2;
        int i4;
        Object obj3;
        int i5;
        long j5;
        int i6;
        Modifier.Companion companion;
        Object obj4;
        boolean z2;
        Shape shape2;
        long j6;
        long j7;
        long j8;
        boolean z3;
        Function2<? super Composer, ? super Integer, Unit> function23;
        long j9;
        long j10;
        long j11;
        ScopeUpdateScope endRestartGroup;
        int i7;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-1235788955);
        ComposerKt.sourceInformation(startRestartGroup, "C(Snackbar)P(8!1,6,2,9,3:c#ui.graphics.Color,5:c#ui.graphics.Color,1:c#ui.graphics.Color,7:c#ui.graphics.Color)99@4842L5,100@4894L5,101@4944L12,102@5007L18,103@5083L25,106@5154L1420:Snackbar.kt#uh7d8r");
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
        int i9 = i2 & 2;
        if (i9 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            obj2 = function2;
            i3 |= startRestartGroup.changedInstance(obj2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                obj3 = function22;
                i3 |= startRestartGroup.changedInstance(obj3) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
                } else if ((i & 7168) == 0) {
                    i3 |= startRestartGroup.changed(z) ? 2048 : 1024;
                    if ((57344 & i) == 0) {
                        if ((i2 & 16) == 0 && startRestartGroup.changed(shape)) {
                            i7 = 16384;
                            i3 |= i7;
                        }
                        i7 = 8192;
                        i3 |= i7;
                    }
                    if ((458752 & i) == 0) {
                        i3 |= ((i2 & 32) == 0 && startRestartGroup.changed(j)) ? 131072 : 65536;
                    }
                    if ((3670016 & i) == 0) {
                        i3 |= ((i2 & 64) == 0 && startRestartGroup.changed(j2)) ? 1048576 : 524288;
                    }
                    if ((29360128 & i) == 0) {
                        i3 |= ((i2 & 128) == 0 && startRestartGroup.changed(j3)) ? 8388608 : 4194304;
                    }
                    if ((234881024 & i) != 0) {
                        j5 = j4;
                        i3 |= ((i2 & 256) == 0 && startRestartGroup.changed(j5)) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                    } else {
                        j5 = j4;
                    }
                    if ((i2 & 512) != 0) {
                        if ((1879048192 & i) == 0) {
                            i6 = startRestartGroup.changedInstance(content) ? 536870912 : 268435456;
                        }
                        if ((1533916891 & i3) == 306783378 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                companion = i8 != 0 ? Modifier.Companion : obj;
                                if (i9 != 0) {
                                    obj2 = null;
                                }
                                obj4 = i4 == 0 ? obj3 : null;
                                z2 = i5 != 0 ? false : z;
                                if ((i2 & 16) != 0) {
                                    shape2 = SnackbarDefaults.INSTANCE.getShape(startRestartGroup, 6);
                                    i3 &= -57345;
                                } else {
                                    shape2 = shape;
                                }
                                if ((i2 & 32) != 0) {
                                    j6 = SnackbarDefaults.INSTANCE.getColor(startRestartGroup, 6);
                                    i3 &= -458753;
                                } else {
                                    j6 = j;
                                }
                                if ((i2 & 64) != 0) {
                                    j7 = SnackbarDefaults.INSTANCE.getContentColor(startRestartGroup, 6);
                                    i3 &= -3670017;
                                } else {
                                    j7 = j2;
                                }
                                if ((i2 & 128) != 0) {
                                    j8 = SnackbarDefaults.INSTANCE.getActionContentColor(startRestartGroup, 6);
                                    i3 &= -29360129;
                                } else {
                                    j8 = j3;
                                }
                                if ((i2 & 256) != 0) {
                                    j5 = SnackbarDefaults.INSTANCE.getDismissActionContentColor(startRestartGroup, 6);
                                    i3 &= -234881025;
                                }
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                }
                                if ((i2 & 32) != 0) {
                                    i3 &= -458753;
                                }
                                if ((i2 & 64) != 0) {
                                    i3 &= -3670017;
                                }
                                if ((i2 & 128) != 0) {
                                    i3 &= -29360129;
                                }
                                if ((i2 & 256) != 0) {
                                    i3 &= -234881025;
                                }
                                shape2 = shape;
                                j7 = j2;
                                j8 = j3;
                                companion = obj;
                                obj4 = obj3;
                                z2 = z;
                                j6 = j;
                            }
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1235788955, i3, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:94)");
                            }
                            Object obj5 = obj4;
                            int i10 = i3 >> 9;
                            SurfaceKt.m2067SurfaceT9BRK9s(companion, shape2, j6, j7, 0.0f, SnackbarTokens.INSTANCE.m2716getContainerElevationD9Ej5fM(), null, ComposableLambdaKt.composableLambda(startRestartGroup, -1829663446, true, new SnackbarKt$Snackbar$1(obj2, content, obj4, j8, j5, i3, z2)), startRestartGroup, (i10 & 7168) | 12779520 | (i3 & 14) | (i10 & 112) | (i10 & 896), 80);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z3 = z2;
                            function23 = obj2;
                            j9 = j6;
                            j10 = j5;
                            j11 = j8;
                            obj3 = obj5;
                            obj = companion;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            z3 = z;
                            shape2 = shape;
                            j7 = j2;
                            function23 = obj2;
                            j10 = j5;
                            j9 = j;
                            j11 = j3;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup == null) {
                            return;
                        }
                        endRestartGroup.updateScope(new SnackbarKt$Snackbar$2(obj, function23, obj3, z3, shape2, j9, j7, j11, j10, content, i, i2));
                        return;
                    }
                    i6 = C.ENCODING_PCM_32BIT;
                    i3 |= i6;
                    if ((1533916891 & i3) == 306783378) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (i9 != 0) {
                    }
                    if (i4 == 0) {
                    }
                    if (i5 != 0) {
                    }
                    if ((i2 & 16) != 0) {
                    }
                    if ((i2 & 32) != 0) {
                    }
                    if ((i2 & 64) != 0) {
                    }
                    if ((i2 & 128) != 0) {
                    }
                    if ((i2 & 256) != 0) {
                    }
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    Object obj52 = obj4;
                    int i102 = i3 >> 9;
                    SurfaceKt.m2067SurfaceT9BRK9s(companion, shape2, j6, j7, 0.0f, SnackbarTokens.INSTANCE.m2716getContainerElevationD9Ej5fM(), null, ComposableLambdaKt.composableLambda(startRestartGroup, -1829663446, true, new SnackbarKt$Snackbar$1(obj2, content, obj4, j8, j5, i3, z2)), startRestartGroup, (i102 & 7168) | 12779520 | (i3 & 14) | (i102 & 112) | (i102 & 896), 80);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    z3 = z2;
                    function23 = obj2;
                    j9 = j6;
                    j10 = j5;
                    j11 = j8;
                    obj3 = obj52;
                    obj = companion;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                if ((57344 & i) == 0) {
                }
                if ((458752 & i) == 0) {
                }
                if ((3670016 & i) == 0) {
                }
                if ((29360128 & i) == 0) {
                }
                if ((234881024 & i) != 0) {
                }
                if ((i2 & 512) != 0) {
                }
                i3 |= i6;
                if ((1533916891 & i3) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i8 != 0) {
                }
                if (i9 != 0) {
                }
                if (i4 == 0) {
                }
                if (i5 != 0) {
                }
                if ((i2 & 16) != 0) {
                }
                if ((i2 & 32) != 0) {
                }
                if ((i2 & 64) != 0) {
                }
                if ((i2 & 128) != 0) {
                }
                if ((i2 & 256) != 0) {
                }
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                Object obj522 = obj4;
                int i1022 = i3 >> 9;
                SurfaceKt.m2067SurfaceT9BRK9s(companion, shape2, j6, j7, 0.0f, SnackbarTokens.INSTANCE.m2716getContainerElevationD9Ej5fM(), null, ComposableLambdaKt.composableLambda(startRestartGroup, -1829663446, true, new SnackbarKt$Snackbar$1(obj2, content, obj4, j8, j5, i3, z2)), startRestartGroup, (i1022 & 7168) | 12779520 | (i3 & 14) | (i1022 & 112) | (i1022 & 896), 80);
                if (ComposerKt.isTraceInProgress()) {
                }
                z3 = z2;
                function23 = obj2;
                j9 = j6;
                j10 = j5;
                j11 = j8;
                obj3 = obj522;
                obj = companion;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            obj3 = function22;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            if ((57344 & i) == 0) {
            }
            if ((458752 & i) == 0) {
            }
            if ((3670016 & i) == 0) {
            }
            if ((29360128 & i) == 0) {
            }
            if ((234881024 & i) != 0) {
            }
            if ((i2 & 512) != 0) {
            }
            i3 |= i6;
            if ((1533916891 & i3) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i8 != 0) {
            }
            if (i9 != 0) {
            }
            if (i4 == 0) {
            }
            if (i5 != 0) {
            }
            if ((i2 & 16) != 0) {
            }
            if ((i2 & 32) != 0) {
            }
            if ((i2 & 64) != 0) {
            }
            if ((i2 & 128) != 0) {
            }
            if ((i2 & 256) != 0) {
            }
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            Object obj5222 = obj4;
            int i10222 = i3 >> 9;
            SurfaceKt.m2067SurfaceT9BRK9s(companion, shape2, j6, j7, 0.0f, SnackbarTokens.INSTANCE.m2716getContainerElevationD9Ej5fM(), null, ComposableLambdaKt.composableLambda(startRestartGroup, -1829663446, true, new SnackbarKt$Snackbar$1(obj2, content, obj4, j8, j5, i3, z2)), startRestartGroup, (i10222 & 7168) | 12779520 | (i3 & 14) | (i10222 & 112) | (i10222 & 896), 80);
            if (ComposerKt.isTraceInProgress()) {
            }
            z3 = z2;
            function23 = obj2;
            j9 = j6;
            j10 = j5;
            j11 = j8;
            obj3 = obj5222;
            obj = companion;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        obj2 = function2;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        obj3 = function22;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        if ((57344 & i) == 0) {
        }
        if ((458752 & i) == 0) {
        }
        if ((3670016 & i) == 0) {
        }
        if ((29360128 & i) == 0) {
        }
        if ((234881024 & i) != 0) {
        }
        if ((i2 & 512) != 0) {
        }
        i3 |= i6;
        if ((1533916891 & i3) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i8 != 0) {
        }
        if (i9 != 0) {
        }
        if (i4 == 0) {
        }
        if (i5 != 0) {
        }
        if ((i2 & 16) != 0) {
        }
        if ((i2 & 32) != 0) {
        }
        if ((i2 & 64) != 0) {
        }
        if ((i2 & 128) != 0) {
        }
        if ((i2 & 256) != 0) {
        }
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        Object obj52222 = obj4;
        int i102222 = i3 >> 9;
        SurfaceKt.m2067SurfaceT9BRK9s(companion, shape2, j6, j7, 0.0f, SnackbarTokens.INSTANCE.m2716getContainerElevationD9Ej5fM(), null, ComposableLambdaKt.composableLambda(startRestartGroup, -1829663446, true, new SnackbarKt$Snackbar$1(obj2, content, obj4, j8, j5, i3, z2)), startRestartGroup, (i102222 & 7168) | 12779520 | (i3 & 14) | (i102222 & 112) | (i102222 & 896), 80);
        if (ComposerKt.isTraceInProgress()) {
        }
        z3 = z2;
        function23 = obj2;
        j9 = j6;
        j10 = j5;
        j11 = j8;
        obj3 = obj52222;
        obj = companion;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:175:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0119  */
    /* renamed from: Snackbar-sDKtq54  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1983SnackbarsDKtq54(SnackbarData snackbarData, Modifier modifier, boolean z, Shape shape, long j, long j2, long j3, long j4, long j5, Composer composer, int i, int i2) {
        int i3;
        Object obj;
        int i4;
        boolean z2;
        Object obj2;
        long j6;
        long j7;
        Modifier.Companion companion;
        boolean z3;
        Shape shape2;
        long j8;
        long j9;
        long j10;
        long j11;
        SnackbarData snackbarData2;
        long j12;
        ComposableLambda composableLambda;
        boolean z4;
        Shape shape3;
        ScopeUpdateScope endRestartGroup;
        int i5;
        int i6;
        Intrinsics.checkNotNullParameter(snackbarData, "snackbarData");
        Composer startRestartGroup = composer.startRestartGroup(274621471);
        ComposerKt.sourceInformation(startRestartGroup, "C(Snackbar)P(8,6,2,7,3:c#ui.graphics.Color,4:c#ui.graphics.Color,0:c#ui.graphics.Color,1:c#ui.graphics.Color,5:c#ui.graphics.Color)201@9465L5,202@9517L5,203@9567L12,204@9623L11,205@9685L18,206@9761L25,236@10774L456:Snackbar.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(snackbarData) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            obj = modifier;
            i3 |= startRestartGroup.changed(obj) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 256 : 128;
                if ((i & 7168) == 0) {
                    if ((i2 & 8) == 0) {
                        obj2 = shape;
                        if (startRestartGroup.changed(obj2)) {
                            i6 = 2048;
                            i3 |= i6;
                        }
                    } else {
                        obj2 = shape;
                    }
                    i6 = 1024;
                    i3 |= i6;
                } else {
                    obj2 = shape;
                }
                if ((i & 57344) == 0) {
                    if ((i2 & 16) == 0 && startRestartGroup.changed(j)) {
                        i5 = 16384;
                        i3 |= i5;
                    }
                    i5 = 8192;
                    i3 |= i5;
                }
                if ((i & 458752) == 0) {
                    j6 = j2;
                    i3 |= ((i2 & 32) == 0 && startRestartGroup.changed(j6)) ? 131072 : 65536;
                } else {
                    j6 = j2;
                }
                if ((i & 3670016) == 0) {
                    j7 = j3;
                    i3 |= ((i2 & 64) == 0 && startRestartGroup.changed(j7)) ? 1048576 : 524288;
                } else {
                    j7 = j3;
                }
                if ((i & 29360128) == 0) {
                    i3 |= ((i2 & 128) == 0 && startRestartGroup.changed(j4)) ? 8388608 : 4194304;
                }
                if ((i & 234881024) == 0) {
                    i3 |= ((i2 & 256) == 0 && startRestartGroup.changed(j5)) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                }
                if ((191739611 & i3) == 38347922 || !startRestartGroup.getSkipping()) {
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                        companion = i7 != 0 ? Modifier.Companion : obj;
                        z3 = i4 != 0 ? false : z2;
                        if ((i2 & 8) != 0) {
                            shape2 = SnackbarDefaults.INSTANCE.getShape(startRestartGroup, 6);
                            i3 &= -7169;
                        } else {
                            shape2 = obj2;
                        }
                        if ((i2 & 16) != 0) {
                            j8 = SnackbarDefaults.INSTANCE.getColor(startRestartGroup, 6);
                            i3 &= -57345;
                        } else {
                            j8 = j;
                        }
                        if ((i2 & 32) != 0) {
                            j6 = SnackbarDefaults.INSTANCE.getContentColor(startRestartGroup, 6);
                            i3 &= -458753;
                        }
                        if ((i2 & 64) != 0) {
                            j7 = SnackbarDefaults.INSTANCE.getActionColor(startRestartGroup, 6);
                            i3 &= -3670017;
                        }
                        if ((i2 & 128) != 0) {
                            j9 = SnackbarDefaults.INSTANCE.getActionContentColor(startRestartGroup, 6);
                            i3 = (-29360129) & i3;
                        } else {
                            j9 = j4;
                        }
                        if ((i2 & 256) != 0) {
                            i3 &= -234881025;
                            j11 = j9;
                            j10 = SnackbarDefaults.INSTANCE.getDismissActionContentColor(startRestartGroup, 6);
                        } else {
                            j10 = j5;
                            j11 = j9;
                        }
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                        }
                        if ((i2 & 128) != 0) {
                            i3 &= -29360129;
                        }
                        if ((i2 & 256) != 0) {
                            i3 &= -234881025;
                        }
                        j11 = j4;
                        j10 = j5;
                        companion = obj;
                        z3 = z2;
                        shape2 = obj2;
                        j8 = j;
                    }
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(274621471, i3, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:197)");
                    }
                    String actionLabel = snackbarData.getVisuals().getActionLabel();
                    ComposableLambda composableLambda2 = actionLabel != null ? ComposableLambdaKt.composableLambda(startRestartGroup, -1378313599, true, new SnackbarKt$Snackbar$actionComposable$1(j7, i3, snackbarData, actionLabel)) : null;
                    if (snackbarData.getVisuals().getWithDismissAction()) {
                        snackbarData2 = snackbarData;
                        j12 = j7;
                        composableLambda = ComposableLambdaKt.composableLambda(startRestartGroup, -1812633777, true, new SnackbarKt$Snackbar$dismissActionComposable$1(snackbarData2, i3));
                    } else {
                        snackbarData2 = snackbarData;
                        j12 = j7;
                        composableLambda = null;
                    }
                    Modifier modifier2 = companion;
                    int i8 = i3 << 3;
                    m1982SnackbareQBnUkQ(PaddingKt.m748padding3ABfNKs(companion, Dp.m5607constructorimpl(12)), composableLambda2, composableLambda, z3, shape2, j8, j6, j11, j10, ComposableLambdaKt.composableLambda(startRestartGroup, -1266389126, true, new SnackbarKt$Snackbar$3(snackbarData2)), startRestartGroup, (i8 & 3670016) | (i8 & 7168) | C.ENCODING_PCM_32BIT | (57344 & i8) | (458752 & i8) | (i3 & 29360128) | (i3 & 234881024), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    j7 = j12;
                    z4 = z3;
                    shape3 = shape2;
                    obj = modifier2;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    j11 = j4;
                    j10 = j5;
                    z4 = z2;
                    shape3 = obj2;
                    j8 = j;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                    return;
                }
                endRestartGroup.updateScope(new SnackbarKt$Snackbar$4(snackbarData, obj, z4, shape3, j8, j6, j7, j11, j10, i, i2));
                return;
            }
            z2 = z;
            if ((i & 7168) == 0) {
            }
            if ((i & 57344) == 0) {
            }
            if ((i & 458752) == 0) {
            }
            if ((i & 3670016) == 0) {
            }
            if ((i & 29360128) == 0) {
            }
            if ((i & 234881024) == 0) {
            }
            if ((191739611 & i3) == 38347922) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i7 != 0) {
            }
            if (i4 != 0) {
            }
            if ((i2 & 8) != 0) {
            }
            if ((i2 & 16) != 0) {
            }
            if ((i2 & 32) != 0) {
            }
            if ((i2 & 64) != 0) {
            }
            if ((i2 & 128) != 0) {
            }
            if ((i2 & 256) != 0) {
            }
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            String actionLabel2 = snackbarData.getVisuals().getActionLabel();
            if (actionLabel2 != null) {
            }
            if (snackbarData.getVisuals().getWithDismissAction()) {
            }
            Modifier modifier22 = companion;
            int i82 = i3 << 3;
            m1982SnackbareQBnUkQ(PaddingKt.m748padding3ABfNKs(companion, Dp.m5607constructorimpl(12)), composableLambda2, composableLambda, z3, shape2, j8, j6, j11, j10, ComposableLambdaKt.composableLambda(startRestartGroup, -1266389126, true, new SnackbarKt$Snackbar$3(snackbarData2)), startRestartGroup, (i82 & 3670016) | (i82 & 7168) | C.ENCODING_PCM_32BIT | (57344 & i82) | (458752 & i82) | (i3 & 29360128) | (i3 & 234881024), 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            j7 = j12;
            z4 = z3;
            shape3 = shape2;
            obj = modifier22;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        obj = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z2 = z;
        if ((i & 7168) == 0) {
        }
        if ((i & 57344) == 0) {
        }
        if ((i & 458752) == 0) {
        }
        if ((i & 3670016) == 0) {
        }
        if ((i & 29360128) == 0) {
        }
        if ((i & 234881024) == 0) {
        }
        if ((191739611 & i3) == 38347922) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i7 != 0) {
        }
        if (i4 != 0) {
        }
        if ((i2 & 8) != 0) {
        }
        if ((i2 & 16) != 0) {
        }
        if ((i2 & 32) != 0) {
        }
        if ((i2 & 64) != 0) {
        }
        if ((i2 & 128) != 0) {
        }
        if ((i2 & 256) != 0) {
        }
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        String actionLabel22 = snackbarData.getVisuals().getActionLabel();
        if (actionLabel22 != null) {
        }
        if (snackbarData.getVisuals().getWithDismissAction()) {
        }
        Modifier modifier222 = companion;
        int i822 = i3 << 3;
        m1982SnackbareQBnUkQ(PaddingKt.m748padding3ABfNKs(companion, Dp.m5607constructorimpl(12)), composableLambda2, composableLambda, z3, shape2, j8, j6, j11, j10, ComposableLambdaKt.composableLambda(startRestartGroup, -1266389126, true, new SnackbarKt$Snackbar$3(snackbarData2)), startRestartGroup, (i822 & 3670016) | (i822 & 7168) | C.ENCODING_PCM_32BIT | (57344 & i822) | (458752 & i822) | (i3 & 29360128) | (i3 & 234881024), 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        j7 = j12;
        z4 = z3;
        shape3 = shape2;
        obj = modifier222;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: NewLineButtonSnackbar-kKq0p4A  reason: not valid java name */
    public static final void m1980NewLineButtonSnackbarkKq0p4A(Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, TextStyle textStyle, long j, long j2, Composer composer, int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-1332496681);
        ComposerKt.sourceInformation(startRestartGroup, "C(NewLineButtonSnackbar)P(5!1,3,2,1:c#ui.graphics.Color,4:c#ui.graphics.Color)259@11505L1173:Snackbar.kt#uh7d8r");
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changedInstance(function2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changedInstance(function22) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changedInstance(function23) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= startRestartGroup.changed(textStyle) ? 2048 : 1024;
        }
        if ((57344 & i) == 0) {
            i2 |= startRestartGroup.changed(j) ? 16384 : 8192;
        }
        if ((458752 & i) == 0) {
            i2 |= startRestartGroup.changed(j2) ? 131072 : 65536;
        }
        if ((374491 & i2) != 74898 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1332496681, i2, -1, "androidx.compose.material3.NewLineButtonSnackbar (Snackbar.kt:251)");
            }
            Modifier m752paddingqDBjuR0$default = PaddingKt.m752paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(SizeKt.m802widthInVpY3zN4$default(Modifier.Companion, 0.0f, ContainerMaxWidth, 1, null), 0.0f, 1, null), HorizontalSpacing, 0.0f, 0.0f, SeparateButtonExtraY, 6, null);
            startRestartGroup.startReplaceableGroup(-483455358);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Column)P(2,3,1)77@3913L61,78@3979L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Density density = (Density) consume;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume2 = startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            LayoutDirection layoutDirection = (LayoutDirection) consume2;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume3 = startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ViewConfiguration viewConfiguration = (ViewConfiguration) consume3;
            Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(m752paddingqDBjuR0$default);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            startRestartGroup.disableReusing();
            Composer m2893constructorimpl = Updater.m2893constructorimpl(startRestartGroup);
            Updater.m2900setimpl(m2893constructorimpl, columnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2900setimpl(m2893constructorimpl, density, ComposeUiNode.Companion.getSetDensity());
            Updater.m2900setimpl(m2893constructorimpl, layoutDirection, ComposeUiNode.Companion.getSetLayoutDirection());
            Updater.m2900setimpl(m2893constructorimpl, viewConfiguration, ComposeUiNode.Companion.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 276693704, "C79@4027L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -916592099, "C269@11812L171,274@11993L679:Snackbar.kt#uh7d8r");
            Modifier m629paddingFromBaselineVpY3zN4 = AlignmentLineKt.m629paddingFromBaselineVpY3zN4(Modifier.Companion, HeightToFirstLine, LongButtonVerticalOffset);
            float f = HorizontalSpacingButtonSide;
            Modifier m752paddingqDBjuR0$default2 = PaddingKt.m752paddingqDBjuR0$default(m629paddingFromBaselineVpY3zN4, 0.0f, 0.0f, f, 0.0f, 11, null);
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
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf2 = LayoutKt.materializerOf(m752paddingqDBjuR0$default2);
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
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 302366561, "C272@11975L6:Snackbar.kt#uh7d8r");
            function2.invoke(startRestartGroup, Integer.valueOf(i2 & 14));
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            Modifier m752paddingqDBjuR0$default3 = PaddingKt.m752paddingqDBjuR0$default(columnScopeInstance.align(Modifier.Companion, Alignment.Companion.getEnd()), 0.0f, 0.0f, function23 == null ? f : Dp.m5607constructorimpl(0), 0.0f, 11, null);
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
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf3 = LayoutKt.materializerOf(m752paddingqDBjuR0$default3);
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
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 302366747, "C278@12161L501:Snackbar.kt#uh7d8r");
            startRestartGroup.startReplaceableGroup(693286680);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Row)P(2,1,3)78@3913L58,79@3976L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getTop(), startRestartGroup, 0);
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
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf4 = LayoutKt.materializerOf(Modifier.Companion);
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
            Updater.m2900setimpl(m2893constructorimpl4, rowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2900setimpl(m2893constructorimpl4, density4, ComposeUiNode.Companion.getSetDensity());
            Updater.m2900setimpl(m2893constructorimpl4, layoutDirection4, ComposeUiNode.Companion.getSetLayoutDirection());
            Updater.m2900setimpl(m2893constructorimpl4, viewConfiguration4, ComposeUiNode.Companion.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf4.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -326682283, "C80@4021L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 435596114, "C279@12183L208:Snackbar.kt#uh7d8r");
            CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m3281boximpl(j)), TextKt.getLocalTextStyle().provides(textStyle)}, function22, startRestartGroup, (i2 & 112) | 8);
            startRestartGroup.startReplaceableGroup(302366994);
            ComposerKt.sourceInformation(startRestartGroup, "285@12457L173");
            if (function23 != null) {
                CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m3281boximpl(j2))}, function23, startRestartGroup, ((i2 >> 3) & 112) | 8);
            }
            startRestartGroup.endReplaceableGroup();
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
        endRestartGroup.updateScope(new SnackbarKt$NewLineButtonSnackbar$2(function2, function22, function23, textStyle, j, j2, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: OneRowSnackbar-kKq0p4A  reason: not valid java name */
    public static final void m1981OneRowSnackbarkKq0p4A(Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, TextStyle textStyle, long j, long j2, Composer composer, int i) {
        int i2;
        float m5607constructorimpl;
        Composer startRestartGroup = composer.startRestartGroup(-903235475);
        ComposerKt.sourceInformation(startRestartGroup, "C(OneRowSnackbar)P(5!1,3,2,1:c#ui.graphics.Color,4:c#ui.graphics.Color)307@13036L4435:Snackbar.kt#uh7d8r");
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changedInstance(function2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changedInstance(function22) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changedInstance(function23) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= startRestartGroup.changed(textStyle) ? 2048 : 1024;
        }
        if ((57344 & i) == 0) {
            i2 |= startRestartGroup.changed(j) ? 16384 : 8192;
        }
        if ((458752 & i) == 0) {
            i2 |= startRestartGroup.changed(j2) ? 131072 : 65536;
        }
        if ((374491 & i2) != 74898 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-903235475, i2, -1, "androidx.compose.material3.OneRowSnackbar (Snackbar.kt:296)");
            }
            Modifier.Companion companion = Modifier.Companion;
            float f = HorizontalSpacing;
            if (function23 == null) {
                m5607constructorimpl = HorizontalSpacingButtonSide;
            } else {
                m5607constructorimpl = Dp.m5607constructorimpl(0);
            }
            Modifier m752paddingqDBjuR0$default = PaddingKt.m752paddingqDBjuR0$default(companion, f, 0.0f, m5607constructorimpl, 0.0f, 10, null);
            MeasurePolicy measurePolicy = new MeasurePolicy() { // from class: androidx.compose.material3.SnackbarKt$OneRowSnackbar$2
                @Override // androidx.compose.ui.layout.MeasurePolicy
                public /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i3) {
                    return MeasurePolicy.CC.$default$maxIntrinsicHeight(this, intrinsicMeasureScope, list, i3);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i3) {
                    return MeasurePolicy.CC.$default$maxIntrinsicWidth(this, intrinsicMeasureScope, list, i3);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i3) {
                    return MeasurePolicy.CC.$default$minIntrinsicHeight(this, intrinsicMeasureScope, list, i3);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i3) {
                    return MeasurePolicy.CC.$default$minIntrinsicWidth(this, intrinsicMeasureScope, list, i3);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                /* renamed from: measure-3p2s80s */
                public final MeasureResult mo272measure3p2s80s(MeasureScope Layout, List<? extends Measurable> measurables, long j3) {
                    float f2;
                    Object obj;
                    Object obj2;
                    int i3;
                    float f3;
                    int max;
                    int i4;
                    int height;
                    int i5;
                    float f4;
                    Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
                    Intrinsics.checkNotNullParameter(measurables, "measurables");
                    int m5551getMaxWidthimpl = Constraints.m5551getMaxWidthimpl(j3);
                    f2 = SnackbarKt.ContainerMaxWidth;
                    int min = Math.min(m5551getMaxWidthimpl, Layout.mo582roundToPx0680j_4(f2));
                    List<? extends Measurable> list = measurables;
                    String str = r1;
                    Iterator<T> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (Intrinsics.areEqual(LayoutIdKt.getLayoutId((Measurable) obj), str)) {
                            break;
                        }
                    }
                    Measurable measurable = (Measurable) obj;
                    Placeable mo4545measureBRTryo0 = measurable != null ? measurable.mo4545measureBRTryo0(j3) : null;
                    String str2 = r2;
                    Iterator<T> it2 = list.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it2.next();
                        if (Intrinsics.areEqual(LayoutIdKt.getLayoutId((Measurable) obj2), str2)) {
                            break;
                        }
                    }
                    Measurable measurable2 = (Measurable) obj2;
                    Placeable mo4545measureBRTryo02 = measurable2 != null ? measurable2.mo4545measureBRTryo0(j3) : null;
                    int width = mo4545measureBRTryo0 != null ? mo4545measureBRTryo0.getWidth() : 0;
                    int height2 = mo4545measureBRTryo0 != null ? mo4545measureBRTryo0.getHeight() : 0;
                    int width2 = mo4545measureBRTryo02 != null ? mo4545measureBRTryo02.getWidth() : 0;
                    int height3 = mo4545measureBRTryo02 != null ? mo4545measureBRTryo02.getHeight() : 0;
                    if (width2 == 0) {
                        f4 = SnackbarKt.TextEndExtraSpacing;
                        i3 = Layout.mo582roundToPx0680j_4(f4);
                    } else {
                        i3 = 0;
                    }
                    int coerceAtLeast = RangesKt.coerceAtLeast(((min - width) - width2) - i3, Constraints.m5553getMinWidthimpl(j3));
                    String str3 = r3;
                    for (Measurable measurable3 : list) {
                        if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable3), str3)) {
                            int i6 = height3;
                            Placeable mo4545measureBRTryo03 = measurable3.mo4545measureBRTryo0(Constraints.m5542copyZbe2FdA$default(j3, 0, coerceAtLeast, 0, 0, 9, null));
                            int i7 = mo4545measureBRTryo03.get(androidx.compose.ui.layout.AlignmentLineKt.getFirstBaseline());
                            if (!(i7 != Integer.MIN_VALUE)) {
                                throw new IllegalArgumentException("No baselines for text".toString());
                            }
                            int i8 = mo4545measureBRTryo03.get(androidx.compose.ui.layout.AlignmentLineKt.getLastBaseline());
                            if (!(i8 != Integer.MIN_VALUE)) {
                                throw new IllegalArgumentException("No baselines for text".toString());
                            }
                            boolean z = i7 == i8;
                            int i9 = min - width2;
                            int i10 = i9 - width;
                            if (!z) {
                                f3 = SnackbarKt.HeightToFirstLine;
                                int i11 = Layout.mo582roundToPx0680j_4(f3) - i7;
                                max = Math.max(Layout.mo582roundToPx0680j_4(SnackbarTokens.INSTANCE.m2719getTwoLinesContainerHeightD9Ej5fM()), mo4545measureBRTryo03.getHeight() + i11);
                                i4 = i11;
                                height = mo4545measureBRTryo0 != null ? (max - mo4545measureBRTryo0.getHeight()) / 2 : 0;
                            } else {
                                int max2 = Math.max(Layout.mo582roundToPx0680j_4(SnackbarTokens.INSTANCE.m2718getSingleLineContainerHeightD9Ej5fM()), Math.max(height2, i6));
                                int height4 = (max2 - mo4545measureBRTryo03.getHeight()) / 2;
                                height = (mo4545measureBRTryo0 == null || (i5 = mo4545measureBRTryo0.get(androidx.compose.ui.layout.AlignmentLineKt.getFirstBaseline())) == Integer.MIN_VALUE) ? 0 : (i7 + height4) - i5;
                                i4 = height4;
                                max = max2;
                            }
                            return MeasureScope.CC.layout$default(Layout, min, max, null, new SnackbarKt$OneRowSnackbar$2$measure$4(mo4545measureBRTryo03, i4, mo4545measureBRTryo02, i9, mo4545measureBRTryo02 != null ? (max - mo4545measureBRTryo02.getHeight()) / 2 : 0, mo4545measureBRTryo0, i10, height), 4, null);
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
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(m752paddingqDBjuR0$default);
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
            materializerOf.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -167734449, "C309@13066L86:Snackbar.kt#uh7d8r");
            Modifier m750paddingVpY3zN4$default = PaddingKt.m750paddingVpY3zN4$default(LayoutIdKt.layoutId(Modifier.Companion, "text"), 0.0f, SnackbarVerticalPadding, 1, null);
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
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf2 = LayoutKt.materializerOf(m750paddingVpY3zN4$default);
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
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 448288318, "C309@13144L6:Snackbar.kt#uh7d8r");
            function2.invoke(startRestartGroup, Integer.valueOf(i2 & 14));
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(-167734350);
            ComposerKt.sourceInformation(startRestartGroup, "311@13203L295");
            if (function22 != null) {
                Modifier layoutId = LayoutIdKt.layoutId(Modifier.Companion, NativeProtocol.WEB_DIALOG_ACTION);
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
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf3 = LayoutKt.materializerOf(layoutId);
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
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 448288433, "C312@13259L221:Snackbar.kt#uh7d8r");
                CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m3281boximpl(j)), TextKt.getLocalTextStyle().provides(textStyle)}, function22, startRestartGroup, (i2 & 112) | 8);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
            }
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(44738809);
            ComposerKt.sourceInformation(startRestartGroup, "320@13570L247");
            if (function23 != null) {
                Modifier layoutId2 = LayoutIdKt.layoutId(Modifier.Companion, "dismissAction");
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
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf4 = LayoutKt.materializerOf(layoutId2);
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
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 448288807, "C321@13633L166:Snackbar.kt#uh7d8r");
                CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m3281boximpl(j2))}, function23, startRestartGroup, ((i2 >> 3) & 112) | 8);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
            }
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
        endRestartGroup.updateScope(new SnackbarKt$OneRowSnackbar$3(function2, function22, function23, textStyle, j, j2, i));
    }

    static {
        float f = 8;
        HorizontalSpacingButtonSide = Dp.m5607constructorimpl(f);
        TextEndExtraSpacing = Dp.m5607constructorimpl(f);
    }
}
