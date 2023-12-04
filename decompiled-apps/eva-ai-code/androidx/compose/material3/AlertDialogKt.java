package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.location.LocationRequestCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.google.android.exoplayer2.C;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ifriend.keychain.cipherStorage.CipherStorageKeystoreRsaEcb;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
/* compiled from: AlertDialog.kt */
@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u001a©\u0001\u0010\f\u001a\u00020\r2\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\r0\u000f¢\u0006\u0002\b\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\u0013\u0010\u0013\u001a\u000f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000f¢\u0006\u0002\b\u00102\u0013\u0010\u0014\u001a\u000f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000f¢\u0006\u0002\b\u00102\u0013\u0010\u0015\u001a\u000f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000f¢\u0006\u0002\b\u00102\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u0019H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \u001a8\u0010!\u001a\u00020\r2\u0006\u0010\"\u001a\u00020\u00012\u0006\u0010#\u001a\u00020\u00012\u0011\u0010$\u001a\r\u0012\u0004\u0012\u00020\r0\u000f¢\u0006\u0002\b\u0010H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b%\u0010&\"\u0019\u0010\u0000\u001a\u00020\u0001X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0002\u0010\u0003\"\u0019\u0010\u0005\u001a\u00020\u0001X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0006\u0010\u0003\"\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006'"}, d2 = {"DialogMaxWidth", "Landroidx/compose/ui/unit/Dp;", "getDialogMaxWidth", "()F", "F", "DialogMinWidth", "getDialogMinWidth", "DialogPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "IconPadding", "TextPadding", "TitlePadding", "AlertDialogContent", "", "buttons", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "modifier", "Landroidx/compose/ui/Modifier;", "icon", "title", "text", "shape", "Landroidx/compose/ui/graphics/Shape;", "containerColor", "Landroidx/compose/ui/graphics/Color;", "tonalElevation", "buttonContentColor", "iconContentColor", "titleContentColor", "textContentColor", "AlertDialogContent-4hvqGtA", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;JFJJJJLandroidx/compose/runtime/Composer;III)V", "AlertDialogFlowRow", "mainAxisSpacing", "crossAxisSpacing", FirebaseAnalytics.Param.CONTENT, "AlertDialogFlowRow-ixp7dh8", "(FFLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AlertDialogKt {
    private static final PaddingValues DialogPadding;
    private static final PaddingValues IconPadding;
    private static final PaddingValues TextPadding;
    private static final PaddingValues TitlePadding;
    private static final float DialogMinWidth = Dp.m5607constructorimpl(280);
    private static final float DialogMaxWidth = Dp.m5607constructorimpl(560);

    /* JADX WARN: Removed duplicated region for block: B:100:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:151:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0130  */
    /* renamed from: AlertDialogContent-4hvqGtA  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1566AlertDialogContent4hvqGtA(Function2<? super Composer, ? super Integer, Unit> buttons, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Shape shape, long j, float f, long j2, long j3, long j4, long j5, Composer composer, int i, int i2, int i3) {
        int i4;
        Object obj;
        int i5;
        int i6;
        int i7;
        int i8;
        Composer composer2;
        Modifier modifier2;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        Intrinsics.checkNotNullParameter(shape, "shape");
        Composer startRestartGroup = composer.startRestartGroup(1522575799);
        ComposerKt.sourceInformation(startRestartGroup, "C(AlertDialogContent)P(1,5,3,9,7,6,2:c#ui.graphics.Color,11:c#ui.unit.Dp,0:c#ui.graphics.Color,4:c#ui.graphics.Color,10:c#ui.graphics.Color,8:c#ui.graphics.Color)51@1823L2647:AlertDialog.kt#uh7d8r");
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 14) == 0) {
            i4 = (startRestartGroup.changedInstance(buttons) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        int i9 = i3 & 2;
        if (i9 != 0) {
            i4 |= 48;
        } else if ((i & 112) == 0) {
            obj = modifier;
            i4 |= startRestartGroup.changed(obj) ? 32 : 16;
            if ((i3 & 4) == 0) {
                i4 |= 384;
            } else if ((i & 896) == 0) {
                i4 |= startRestartGroup.changedInstance(function2) ? 256 : 128;
            }
            if ((i3 & 8) == 0) {
                i4 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
            } else if ((i & 7168) == 0) {
                i4 |= startRestartGroup.changedInstance(function22) ? 2048 : 1024;
            }
            if ((i3 & 16) == 0) {
                i4 |= 24576;
            } else if ((i & 57344) == 0) {
                i4 |= startRestartGroup.changedInstance(function23) ? 16384 : 8192;
                if ((i3 & 32) != 0) {
                    i5 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else {
                    if ((i & 458752) == 0) {
                        i5 = startRestartGroup.changed(shape) ? 131072 : 65536;
                    }
                    if ((i3 & 64) == 0) {
                        i6 = i4 | 1572864;
                    } else {
                        int i10 = i4;
                        if ((i & 3670016) == 0) {
                            i6 = i10 | (startRestartGroup.changed(j) ? 1048576 : 524288);
                        } else {
                            i6 = i10;
                        }
                    }
                    if ((i3 & 128) == 0) {
                        i6 |= 12582912;
                    } else if ((29360128 & i) == 0) {
                        i6 |= startRestartGroup.changed(f) ? 8388608 : 4194304;
                        if ((i3 & 256) != 0) {
                            i6 |= 100663296;
                        } else if ((234881024 & i) == 0) {
                            i6 |= startRestartGroup.changed(j2) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                        }
                        if ((i3 & 512) != 0) {
                            i6 |= C.ENCODING_PCM_32BIT;
                        } else if ((1879048192 & i) == 0) {
                            i6 |= startRestartGroup.changed(j3) ? 536870912 : 268435456;
                        }
                        i7 = i6;
                        if ((i3 & 1024) != 0) {
                            i8 = i2 | 6;
                        } else if ((i2 & 14) == 0) {
                            i8 = i2 | (startRestartGroup.changed(j4) ? 4 : 2);
                        } else {
                            i8 = i2;
                        }
                        if ((i3 & 2048) != 0) {
                            i8 |= 48;
                        } else if ((i2 & 112) == 0) {
                            i8 |= startRestartGroup.changed(j5) ? 32 : 16;
                        }
                        if ((1533916891 & i7) == 306783378 || (i8 & 91) != 18 || !startRestartGroup.getSkipping()) {
                            Modifier.Companion companion = i9 != 0 ? Modifier.Companion : obj;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1522575799, i7, i8, "androidx.compose.material3.AlertDialogContent (AlertDialog.kt:37)");
                            }
                            composer2 = startRestartGroup;
                            int i11 = i7 >> 12;
                            SurfaceKt.m2067SurfaceT9BRK9s(companion, shape, j, 0L, f, 0.0f, null, ComposableLambdaKt.composableLambda(composer2, -2126308228, true, new AlertDialogKt$AlertDialogContent$1(function2, function22, function23, j3, i7, j4, j5, j2, buttons)), composer2, ((i7 >> 3) & 14) | 12582912 | (i11 & 112) | (i11 & 896) | ((i7 >> 9) & 57344), LocationRequestCompat.QUALITY_LOW_POWER);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier2 = companion;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier2 = obj;
                            composer2 = startRestartGroup;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                            return;
                        }
                        endRestartGroup.updateScope(new AlertDialogKt$AlertDialogContent$2(buttons, modifier2, function2, function22, function23, shape, j, f, j2, j3, j4, j5, i, i2, i3));
                        return;
                    }
                    if ((i3 & 256) != 0) {
                    }
                    if ((i3 & 512) != 0) {
                    }
                    i7 = i6;
                    if ((i3 & 1024) != 0) {
                    }
                    if ((i3 & 2048) != 0) {
                    }
                    if ((1533916891 & i7) == 306783378) {
                    }
                    if (i9 != 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    composer2 = startRestartGroup;
                    int i112 = i7 >> 12;
                    SurfaceKt.m2067SurfaceT9BRK9s(companion, shape, j, 0L, f, 0.0f, null, ComposableLambdaKt.composableLambda(composer2, -2126308228, true, new AlertDialogKt$AlertDialogContent$1(function2, function22, function23, j3, i7, j4, j5, j2, buttons)), composer2, ((i7 >> 3) & 14) | 12582912 | (i112 & 112) | (i112 & 896) | ((i7 >> 9) & 57344), LocationRequestCompat.QUALITY_LOW_POWER);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier2 = companion;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                i4 |= i5;
                if ((i3 & 64) == 0) {
                }
                if ((i3 & 128) == 0) {
                }
                if ((i3 & 256) != 0) {
                }
                if ((i3 & 512) != 0) {
                }
                i7 = i6;
                if ((i3 & 1024) != 0) {
                }
                if ((i3 & 2048) != 0) {
                }
                if ((1533916891 & i7) == 306783378) {
                }
                if (i9 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                composer2 = startRestartGroup;
                int i1122 = i7 >> 12;
                SurfaceKt.m2067SurfaceT9BRK9s(companion, shape, j, 0L, f, 0.0f, null, ComposableLambdaKt.composableLambda(composer2, -2126308228, true, new AlertDialogKt$AlertDialogContent$1(function2, function22, function23, j3, i7, j4, j5, j2, buttons)), composer2, ((i7 >> 3) & 14) | 12582912 | (i1122 & 112) | (i1122 & 896) | ((i7 >> 9) & 57344), LocationRequestCompat.QUALITY_LOW_POWER);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier2 = companion;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            if ((i3 & 32) != 0) {
            }
            i4 |= i5;
            if ((i3 & 64) == 0) {
            }
            if ((i3 & 128) == 0) {
            }
            if ((i3 & 256) != 0) {
            }
            if ((i3 & 512) != 0) {
            }
            i7 = i6;
            if ((i3 & 1024) != 0) {
            }
            if ((i3 & 2048) != 0) {
            }
            if ((1533916891 & i7) == 306783378) {
            }
            if (i9 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            composer2 = startRestartGroup;
            int i11222 = i7 >> 12;
            SurfaceKt.m2067SurfaceT9BRK9s(companion, shape, j, 0L, f, 0.0f, null, ComposableLambdaKt.composableLambda(composer2, -2126308228, true, new AlertDialogKt$AlertDialogContent$1(function2, function22, function23, j3, i7, j4, j5, j2, buttons)), composer2, ((i7 >> 3) & 14) | 12582912 | (i11222 & 112) | (i11222 & 896) | ((i7 >> 9) & 57344), LocationRequestCompat.QUALITY_LOW_POWER);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier2 = companion;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        obj = modifier;
        if ((i3 & 4) == 0) {
        }
        if ((i3 & 8) == 0) {
        }
        if ((i3 & 16) == 0) {
        }
        if ((i3 & 32) != 0) {
        }
        i4 |= i5;
        if ((i3 & 64) == 0) {
        }
        if ((i3 & 128) == 0) {
        }
        if ((i3 & 256) != 0) {
        }
        if ((i3 & 512) != 0) {
        }
        i7 = i6;
        if ((i3 & 1024) != 0) {
        }
        if ((i3 & 2048) != 0) {
        }
        if ((1533916891 & i7) == 306783378) {
        }
        if (i9 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        composer2 = startRestartGroup;
        int i112222 = i7 >> 12;
        SurfaceKt.m2067SurfaceT9BRK9s(companion, shape, j, 0L, f, 0.0f, null, ComposableLambdaKt.composableLambda(composer2, -2126308228, true, new AlertDialogKt$AlertDialogContent$1(function2, function22, function23, j3, i7, j4, j5, j2, buttons)), composer2, ((i7 >> 3) & 14) | 12582912 | (i112222 & 112) | (i112222 & 896) | ((i7 >> 9) & 57344), LocationRequestCompat.QUALITY_LOW_POWER);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier2 = companion;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* renamed from: AlertDialogFlowRow-ixp7dh8  reason: not valid java name */
    public static final void m1567AlertDialogFlowRowixp7dh8(final float f, final float f2, Function2<? super Composer, ? super Integer, Unit> content, Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(586821353);
        ComposerKt.sourceInformation(startRestartGroup, "C(AlertDialogFlowRow)P(2:c#ui.unit.Dp,1:c#ui.unit.Dp)129@4728L3185:AlertDialog.kt#uh7d8r");
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(f) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(f2) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changedInstance(content) ? 256 : 128;
        }
        if ((i2 & 731) != 146 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(586821353, i2, -1, "androidx.compose.material3.AlertDialogFlowRow (AlertDialog.kt:124)");
            }
            MeasurePolicy measurePolicy = new MeasurePolicy() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogFlowRow$1
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
                public final MeasureResult mo272measure3p2s80s(MeasureScope Layout, List<? extends Measurable> measurables, long j) {
                    Ref.IntRef intRef;
                    Ref.IntRef intRef2;
                    ArrayList arrayList;
                    ArrayList arrayList2;
                    Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
                    Intrinsics.checkNotNullParameter(measurables, "measurables");
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    ArrayList arrayList5 = new ArrayList();
                    Ref.IntRef intRef3 = new Ref.IntRef();
                    Ref.IntRef intRef4 = new Ref.IntRef();
                    ArrayList arrayList6 = new ArrayList();
                    Ref.IntRef intRef5 = new Ref.IntRef();
                    Ref.IntRef intRef6 = new Ref.IntRef();
                    for (Measurable measurable : measurables) {
                        Placeable mo4545measureBRTryo0 = measurable.mo4545measureBRTryo0(j);
                        Ref.IntRef intRef7 = intRef6;
                        if (measure_3p2s80s$canAddToCurrentSequence(arrayList6, intRef5, Layout, f, j, mo4545measureBRTryo0)) {
                            intRef = intRef5;
                            intRef2 = intRef4;
                            arrayList = arrayList5;
                            arrayList2 = arrayList6;
                        } else {
                            intRef = intRef5;
                            ArrayList arrayList7 = arrayList5;
                            arrayList = arrayList5;
                            arrayList2 = arrayList6;
                            intRef2 = intRef4;
                            measure_3p2s80s$startNewSequence(arrayList3, intRef4, Layout, f2, arrayList6, arrayList4, intRef7, arrayList7, intRef3, intRef);
                        }
                        Ref.IntRef intRef8 = intRef;
                        if (!arrayList2.isEmpty()) {
                            intRef8.element += Layout.mo582roundToPx0680j_4(f);
                        }
                        arrayList2.add(mo4545measureBRTryo0);
                        intRef8.element += mo4545measureBRTryo0.getWidth();
                        intRef6 = intRef7;
                        intRef6.element = Math.max(intRef6.element, mo4545measureBRTryo0.getHeight());
                        intRef5 = intRef8;
                        arrayList6 = arrayList2;
                        arrayList5 = arrayList;
                        intRef4 = intRef2;
                    }
                    Ref.IntRef intRef9 = intRef4;
                    ArrayList arrayList8 = arrayList5;
                    Ref.IntRef intRef10 = intRef5;
                    ArrayList arrayList9 = arrayList6;
                    if (!arrayList9.isEmpty()) {
                        measure_3p2s80s$startNewSequence(arrayList3, intRef9, Layout, f2, arrayList9, arrayList4, intRef6, arrayList8, intRef3, intRef10);
                    }
                    int max = Math.max(intRef3.element, Constraints.m5553getMinWidthimpl(j));
                    return MeasureScope.CC.layout$default(Layout, max, Math.max(intRef9.element, Constraints.m5552getMinHeightimpl(j)), null, new AlertDialogKt$AlertDialogFlowRow$1$measure$1(arrayList3, Layout, f, max, arrayList8), 4, null);
                }

                private static final boolean measure_3p2s80s$canAddToCurrentSequence(List<Placeable> list, Ref.IntRef intRef, MeasureScope measureScope, float f3, long j, Placeable placeable) {
                    return list.isEmpty() || (intRef.element + measureScope.mo582roundToPx0680j_4(f3)) + placeable.getWidth() <= Constraints.m5551getMaxWidthimpl(j);
                }

                private static final void measure_3p2s80s$startNewSequence(List<List<Placeable>> list, Ref.IntRef intRef, MeasureScope measureScope, float f3, List<Placeable> list2, List<Integer> list3, Ref.IntRef intRef2, List<Integer> list4, Ref.IntRef intRef3, Ref.IntRef intRef4) {
                    List<List<Placeable>> list5 = list;
                    if (!list5.isEmpty()) {
                        intRef.element += measureScope.mo582roundToPx0680j_4(f3);
                    }
                    list5.add(CollectionsKt.toList(list2));
                    list3.add(Integer.valueOf(intRef2.element));
                    list4.add(Integer.valueOf(intRef.element));
                    intRef.element += intRef2.element;
                    intRef3.element = Math.max(intRef3.element, intRef4.element);
                    list2.clear();
                    intRef4.element = 0;
                    intRef2.element = 0;
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
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(Modifier.Companion);
            int i3 = ((((i2 >> 6) & 14) << 9) & 7168) | 6;
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
            materializerOf.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, Integer.valueOf((i3 >> 3) & 112));
            startRestartGroup.startReplaceableGroup(2058660585);
            content.invoke(startRestartGroup, Integer.valueOf((i3 >> 9) & 14));
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
        endRestartGroup.updateScope(new AlertDialogKt$AlertDialogFlowRow$2(f, f2, content, i));
    }

    public static final float getDialogMinWidth() {
        return DialogMinWidth;
    }

    public static final float getDialogMaxWidth() {
        return DialogMaxWidth;
    }

    static {
        float f = 24;
        DialogPadding = PaddingKt.m741PaddingValues0680j_4(Dp.m5607constructorimpl(f));
        float f2 = 16;
        IconPadding = PaddingKt.m745PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, Dp.m5607constructorimpl(f2), 7, null);
        TitlePadding = PaddingKt.m745PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, Dp.m5607constructorimpl(f2), 7, null);
        TextPadding = PaddingKt.m745PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, Dp.m5607constructorimpl(f), 7, null);
    }
}
