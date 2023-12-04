package androidx.compose.material3;

import android.view.View;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.DraggableKt$draggable$1;
import androidx.compose.foundation.gestures.DraggableKt$draggable$2;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.google.android.exoplayer2.C;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Map;
import java.util.UUID;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: ModalBottomSheet.android.kt */
@Metadata(d1 = {"\u0000|\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\u001a\u009e\u0001\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000b2\u0015\b\u0002\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00112\u001c\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00010\u0013¢\u0006\u0002\b\u0011¢\u0006\u0002\b\u0015H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017\u001a¨\u0001\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000b2\u0015\b\u0002\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00112\b\b\u0002\u0010\u0018\u001a\u00020\u00192\u001c\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00010\u0013¢\u0006\u0002\b\u0011¢\u0006\u0002\b\u0015H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001b\u001aq\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\u0006\u0010\u001f\u001a\u00020\u000726\u0010 \u001a2\u0012\u0013\u0012\u00110\u001e¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0013\u0012\u00110%¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020\u00010!2!\u0010'\u001a\u001d\u0012\u0013\u0012\u00110\u001e¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u00010\u0013H\u0003\u001a6\u0010(\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\u0018\u001a\u00020\u00192\u0011\u0010\u0012\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0011H\u0001¢\u0006\u0002\u0010)\u001a3\u0010*\u001a\u00020\u00012\u0006\u0010+\u001a\u00020\u000b2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010,\u001a\u00020-H\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b.\u0010/\u001a-\u00100\u001a\u00020\u00072\b\b\u0002\u00101\u001a\u00020-2\u0014\b\u0002\u00102\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020-0\u0013H\u0007¢\u0006\u0002\u00103\u001aX\u00104\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u00105\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\u0006\u00106\u001a\u00020%2,\u00107\u001a(\u0012\u0004\u0012\u000208\u0012\u0013\u0012\u00110%¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020\u00010!¢\u0006\u0002\b\u0015H\u0003\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00069"}, d2 = {"ModalBottomSheet", "", "onDismissRequest", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "sheetState", "Landroidx/compose/material3/SheetState;", "shape", "Landroidx/compose/ui/graphics/Shape;", "containerColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "tonalElevation", "Landroidx/compose/ui/unit/Dp;", "scrimColor", "dragHandle", "Landroidx/compose/runtime/Composable;", FirebaseAnalytics.Param.CONTENT, "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Lkotlin/ExtensionFunctionType;", "ModalBottomSheet-xOkiWaM", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SheetState;Landroidx/compose/ui/graphics/Shape;JJFJLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "windowInsets", "Landroidx/compose/foundation/layout/WindowInsets;", "ModalBottomSheet-EP0qOeE", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SheetState;Landroidx/compose/ui/graphics/Shape;JJFJLkotlin/jvm/functions/Function2;Landroidx/compose/foundation/layout/WindowInsets;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "ModalBottomSheetAnchorChangeHandler", "Landroidx/compose/material3/AnchorChangeHandler;", "Landroidx/compose/material3/SheetValue;", "state", "animateTo", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", TypedValues.AttributesType.S_TARGET, "", "velocity", "snapTo", "ModalBottomSheetPopup", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/layout/WindowInsets;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "Scrim", "color", "visible", "", "Scrim-3J-VO9M", "(JLkotlin/jvm/functions/Function0;ZLandroidx/compose/runtime/Composer;I)V", "rememberModalBottomSheetState", "skipPartiallyExpanded", "confirmValueChange", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/SheetState;", "modalBottomSheetSwipeable", "anchorChangeHandler", "screenHeight", "onDragStopped", "Lkotlinx/coroutines/CoroutineScope;", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ModalBottomSheet_androidKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:216:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0110  */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* renamed from: ModalBottomSheet-EP0qOeE  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1873ModalBottomSheetEP0qOeE(Function0<Unit> onDismissRequest, Modifier modifier, SheetState sheetState, Shape shape, long j, long j2, float f, long j3, Function2<? super Composer, ? super Integer, Unit> function2, WindowInsets windowInsets, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> content, Composer composer, int i, int i2, int i3) {
        int i4;
        Object obj;
        SheetState sheetState2;
        Shape shape2;
        long j4;
        int i5;
        int i6;
        int i7;
        int i8;
        SheetState sheetState3;
        Shape shape3;
        long j5;
        long j6;
        long j7;
        WindowInsets windowInsets2;
        float f2;
        Function2<? super Composer, ? super Integer, Unit> function22;
        SheetState sheetState4;
        long j8;
        long j9;
        long j10;
        int i9;
        Shape shape4;
        Object obj2;
        Object rememberedValue;
        boolean changed;
        Object rememberedValue2;
        Composer composer2;
        SheetState sheetState5;
        SheetState sheetState6;
        Modifier modifier2;
        SheetState sheetState7;
        WindowInsets windowInsets3;
        Shape shape5;
        long j11;
        long j12;
        float f3;
        long j13;
        Function2<? super Composer, ? super Integer, Unit> function23;
        ScopeUpdateScope endRestartGroup;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        Intrinsics.checkNotNullParameter(onDismissRequest, "onDismissRequest");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-879758728);
        ComposerKt.sourceInformation(startRestartGroup, "C(ModalBottomSheet)P(5,4,8,7,0:c#ui.graphics.Color,2:c#ui.graphics.Color,9:c#ui.unit.Dp,6:c#ui.graphics.Color,3,10)125@5985L31,126@6057L13,127@6120L14,128@6162L31,130@6295L10,132@6442L12,135@6525L24,152@7150L507,167@7663L4907,269@12645L41,269@12618L68:ModalBottomSheet.android.kt#uh7d8r");
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 14) == 0) {
            i4 = (startRestartGroup.changedInstance(onDismissRequest) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        int i16 = i3 & 2;
        if (i16 != 0) {
            i4 |= 48;
        } else if ((i & 112) == 0) {
            obj = modifier;
            i4 |= startRestartGroup.changed(obj) ? 32 : 16;
            if ((i & 896) != 0) {
                if ((i3 & 4) == 0) {
                    sheetState2 = sheetState;
                    if (startRestartGroup.changed(sheetState2)) {
                        i15 = 256;
                        i4 |= i15;
                    }
                } else {
                    sheetState2 = sheetState;
                }
                i15 = 128;
                i4 |= i15;
            } else {
                sheetState2 = sheetState;
            }
            if ((i & 7168) != 0) {
                if ((i3 & 8) == 0) {
                    shape2 = shape;
                    if (startRestartGroup.changed(shape2)) {
                        i14 = 2048;
                        i4 |= i14;
                    }
                } else {
                    shape2 = shape;
                }
                i14 = 1024;
                i4 |= i14;
            } else {
                shape2 = shape;
            }
            if ((57344 & i) != 0) {
                if ((i3 & 16) == 0) {
                    j4 = j;
                    if (startRestartGroup.changed(j4)) {
                        i13 = 16384;
                        i4 |= i13;
                    }
                } else {
                    j4 = j;
                }
                i13 = 8192;
                i4 |= i13;
            } else {
                j4 = j;
            }
            if ((458752 & i) != 0) {
                if ((i3 & 32) == 0) {
                    i5 = i16;
                    if (startRestartGroup.changed(j2)) {
                        i12 = 131072;
                        i4 |= i12;
                    }
                } else {
                    i5 = i16;
                }
                i12 = 65536;
                i4 |= i12;
            } else {
                i5 = i16;
            }
            i6 = i3 & 64;
            if (i6 == 0) {
                i4 |= 1572864;
            } else if ((i & 3670016) == 0) {
                i4 |= startRestartGroup.changed(f) ? 1048576 : 524288;
            }
            if ((i & 29360128) == 0) {
                if ((i3 & 128) == 0 && startRestartGroup.changed(j3)) {
                    i11 = 8388608;
                    i4 |= i11;
                }
                i11 = 4194304;
                i4 |= i11;
            }
            i7 = i3 & 256;
            if (i7 == 0) {
                i4 |= 100663296;
            } else if ((i & 234881024) == 0) {
                i4 |= startRestartGroup.changedInstance(function2) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
            }
            if ((i & 1879048192) == 0) {
                if ((i3 & 512) == 0 && startRestartGroup.changed(windowInsets)) {
                    i10 = 536870912;
                    i4 |= i10;
                }
                i10 = 268435456;
                i4 |= i10;
            }
            if ((i3 & 1024) == 0) {
                i8 = i2 | 6;
            } else if ((i2 & 14) == 0) {
                i8 = i2 | (startRestartGroup.changedInstance(content) ? 4 : 2);
            } else {
                i8 = i2;
            }
            if ((i4 & 1533916891) == 306783378 || (i8 & 11) != 2 || !startRestartGroup.getSkipping()) {
                startRestartGroup.startDefaults();
                if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                    Modifier.Companion companion = i5 == 0 ? Modifier.Companion : obj;
                    if ((i3 & 4) == 0) {
                        sheetState3 = rememberModalBottomSheetState(false, null, startRestartGroup, 0, 3);
                        i4 &= -897;
                    } else {
                        sheetState3 = sheetState2;
                    }
                    if ((i3 & 8) == 0) {
                        shape3 = BottomSheetDefaults.INSTANCE.getExpandedShape(startRestartGroup, 6);
                        i4 &= -7169;
                    } else {
                        shape3 = shape2;
                    }
                    if ((i3 & 16) == 0) {
                        j5 = BottomSheetDefaults.INSTANCE.getContainerColor(startRestartGroup, 6);
                        i4 &= -57345;
                    } else {
                        j5 = j4;
                    }
                    if ((i3 & 32) == 0) {
                        j6 = ColorSchemeKt.m1687contentColorForek8zF_U(j5, startRestartGroup, (i4 >> 12) & 14);
                        i4 &= -458753;
                    } else {
                        j6 = j2;
                    }
                    float m1586getElevationD9Ej5fM = i6 == 0 ? BottomSheetDefaults.INSTANCE.m1586getElevationD9Ej5fM() : f;
                    if ((i3 & 128) == 0) {
                        j7 = BottomSheetDefaults.INSTANCE.getScrimColor(startRestartGroup, 6);
                        i4 &= -29360129;
                    } else {
                        j7 = j3;
                    }
                    Function2<Composer, Integer, Unit> m1710getLambda1$material3_release = i7 == 0 ? ComposableSingletons$ModalBottomSheet_androidKt.INSTANCE.m1710getLambda1$material3_release() : function2;
                    if ((i3 & 512) == 0) {
                        windowInsets2 = BottomSheetDefaults.INSTANCE.getWindowInsets(startRestartGroup, 6);
                        i4 &= -1879048193;
                    } else {
                        windowInsets2 = windowInsets;
                    }
                    f2 = m1586getElevationD9Ej5fM;
                    function22 = m1710getLambda1$material3_release;
                    sheetState4 = sheetState3;
                    j8 = j5;
                    j9 = j6;
                    j10 = j7;
                    i9 = i4;
                    shape4 = shape3;
                    obj2 = companion;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    if ((i3 & 4) != 0) {
                        i4 &= -897;
                    }
                    if ((i3 & 8) != 0) {
                        i4 &= -7169;
                    }
                    if ((i3 & 16) != 0) {
                        i4 &= -57345;
                    }
                    if ((i3 & 32) != 0) {
                        i4 &= -458753;
                    }
                    if ((i3 & 128) != 0) {
                        i4 &= -29360129;
                    }
                    if ((i3 & 512) != 0) {
                        i4 &= -1879048193;
                    }
                    j9 = j2;
                    f2 = f;
                    j10 = j3;
                    function22 = function2;
                    obj2 = obj;
                    sheetState4 = sheetState2;
                    shape4 = shape2;
                    j8 = j4;
                    windowInsets2 = windowInsets;
                    i9 = i4;
                }
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-879758728, i9, i8, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.android.kt:122)");
                }
                startRestartGroup.startReplaceableGroup(773894976);
                ComposerKt.sourceInformation(startRestartGroup, "CC(rememberCoroutineScope)476@19869L144:Effects.kt#9igjgp");
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
                ModalBottomSheet_androidKt$ModalBottomSheet$animateToDismiss$1 modalBottomSheet_androidKt$ModalBottomSheet$animateToDismiss$1 = new ModalBottomSheet_androidKt$ModalBottomSheet$animateToDismiss$1(sheetState4, coroutineScope, onDismissRequest);
                ModalBottomSheet_androidKt$ModalBottomSheet$settleToDismiss$1 modalBottomSheet_androidKt$ModalBottomSheet$settleToDismiss$1 = new ModalBottomSheet_androidKt$ModalBottomSheet$settleToDismiss$1(coroutineScope, sheetState4, onDismissRequest);
                int i17 = ((i9 >> 6) & 14) | 64;
                startRestartGroup.startReplaceableGroup(511388516);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
                changed = startRestartGroup.changed(sheetState4) | startRestartGroup.changed(coroutineScope);
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (!changed || rememberedValue2 == Composer.Companion.getEmpty()) {
                    rememberedValue2 = ModalBottomSheetAnchorChangeHandler(sheetState4, new ModalBottomSheet_androidKt$ModalBottomSheet$anchorChangeHandler$1$1(coroutineScope, sheetState4), new ModalBottomSheet_androidKt$ModalBottomSheet$anchorChangeHandler$1$2(sheetState4, coroutineScope));
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                startRestartGroup.endReplaceableGroup();
                Modifier modifier3 = obj2;
                Modifier modifier4 = obj2;
                WindowInsets windowInsets4 = windowInsets2;
                composer2 = startRestartGroup;
                sheetState5 = sheetState4;
                ModalBottomSheetPopup(new ModalBottomSheet_androidKt$ModalBottomSheet$1(sheetState4, coroutineScope, onDismissRequest), windowInsets4, ComposableLambdaKt.composableLambda(composer2, 1424497392, true, new ModalBottomSheet_androidKt$ModalBottomSheet$2(j10, modalBottomSheet_androidKt$ModalBottomSheet$animateToDismiss$1, sheetState4, i9, modifier3, rememberedValue2, modalBottomSheet_androidKt$ModalBottomSheet$settleToDismiss$1, shape4, j8, j9, f2, function22, content, i8, coroutineScope)), composer2, ((i9 >> 24) & 112) | 384);
                if (sheetState5.getHasExpandedState()) {
                    sheetState6 = sheetState5;
                } else {
                    composer2.startReplaceableGroup(1157296644);
                    ComposerKt.sourceInformation(composer2, "CC(remember)P(1):Composables.kt#9igjgp");
                    sheetState6 = sheetState5;
                    boolean changed2 = composer2.changed(sheetState6);
                    ModalBottomSheet_androidKt$ModalBottomSheet$3$1 rememberedValue3 = composer2.rememberedValue();
                    if (changed2 || rememberedValue3 == Composer.Companion.getEmpty()) {
                        rememberedValue3 = new ModalBottomSheet_androidKt$ModalBottomSheet$3$1(sheetState6, null);
                        composer2.updateRememberedValue(rememberedValue3);
                    }
                    composer2.endReplaceableGroup();
                    EffectsKt.LaunchedEffect(sheetState6, (Function2) rememberedValue3, composer2, i17);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
                sheetState7 = sheetState6;
                windowInsets3 = windowInsets4;
                shape5 = shape4;
                j11 = j8;
                j12 = j9;
                f3 = f2;
                j13 = j10;
                function23 = function22;
            } else {
                startRestartGroup.skipToGroupEnd();
                windowInsets3 = windowInsets;
                modifier2 = obj;
                sheetState7 = sheetState2;
                shape5 = shape2;
                j11 = j4;
                composer2 = startRestartGroup;
                j12 = j2;
                f3 = f;
                j13 = j3;
                function23 = function2;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
                return;
            }
            endRestartGroup.updateScope(new ModalBottomSheet_androidKt$ModalBottomSheet$4(onDismissRequest, modifier2, sheetState7, shape5, j11, j12, f3, j13, function23, windowInsets3, content, i, i2, i3));
            return;
        }
        obj = modifier;
        if ((i & 896) != 0) {
        }
        if ((i & 7168) != 0) {
        }
        if ((57344 & i) != 0) {
        }
        if ((458752 & i) != 0) {
        }
        i6 = i3 & 64;
        if (i6 == 0) {
        }
        if ((i & 29360128) == 0) {
        }
        i7 = i3 & 256;
        if (i7 == 0) {
        }
        if ((i & 1879048192) == 0) {
        }
        if ((i3 & 1024) == 0) {
        }
        if ((i4 & 1533916891) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i5 == 0) {
        }
        if ((i3 & 4) == 0) {
        }
        if ((i3 & 8) == 0) {
        }
        if ((i3 & 16) == 0) {
        }
        if ((i3 & 32) == 0) {
        }
        if (i6 == 0) {
        }
        if ((i3 & 128) == 0) {
        }
        if (i7 == 0) {
        }
        if ((i3 & 512) == 0) {
        }
        f2 = m1586getElevationD9Ej5fM;
        function22 = m1710getLambda1$material3_release;
        sheetState4 = sheetState3;
        j8 = j5;
        j9 = j6;
        j10 = j7;
        i9 = i4;
        shape4 = shape3;
        obj2 = companion;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        startRestartGroup.startReplaceableGroup(773894976);
        ComposerKt.sourceInformation(startRestartGroup, "CC(rememberCoroutineScope)476@19869L144:Effects.kt#9igjgp");
        startRestartGroup.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
        rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        CoroutineScope coroutineScope2 = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
        startRestartGroup.endReplaceableGroup();
        ModalBottomSheet_androidKt$ModalBottomSheet$animateToDismiss$1 modalBottomSheet_androidKt$ModalBottomSheet$animateToDismiss$12 = new ModalBottomSheet_androidKt$ModalBottomSheet$animateToDismiss$1(sheetState4, coroutineScope2, onDismissRequest);
        ModalBottomSheet_androidKt$ModalBottomSheet$settleToDismiss$1 modalBottomSheet_androidKt$ModalBottomSheet$settleToDismiss$12 = new ModalBottomSheet_androidKt$ModalBottomSheet$settleToDismiss$1(coroutineScope2, sheetState4, onDismissRequest);
        int i172 = ((i9 >> 6) & 14) | 64;
        startRestartGroup.startReplaceableGroup(511388516);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
        changed = startRestartGroup.changed(sheetState4) | startRestartGroup.changed(coroutineScope2);
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        rememberedValue2 = ModalBottomSheetAnchorChangeHandler(sheetState4, new ModalBottomSheet_androidKt$ModalBottomSheet$anchorChangeHandler$1$1(coroutineScope2, sheetState4), new ModalBottomSheet_androidKt$ModalBottomSheet$anchorChangeHandler$1$2(sheetState4, coroutineScope2));
        startRestartGroup.updateRememberedValue(rememberedValue2);
        startRestartGroup.endReplaceableGroup();
        Modifier modifier32 = obj2;
        Modifier modifier42 = obj2;
        WindowInsets windowInsets42 = windowInsets2;
        composer2 = startRestartGroup;
        sheetState5 = sheetState4;
        ModalBottomSheetPopup(new ModalBottomSheet_androidKt$ModalBottomSheet$1(sheetState4, coroutineScope2, onDismissRequest), windowInsets42, ComposableLambdaKt.composableLambda(composer2, 1424497392, true, new ModalBottomSheet_androidKt$ModalBottomSheet$2(j10, modalBottomSheet_androidKt$ModalBottomSheet$animateToDismiss$12, sheetState4, i9, modifier32, rememberedValue2, modalBottomSheet_androidKt$ModalBottomSheet$settleToDismiss$12, shape4, j8, j9, f2, function22, content, i8, coroutineScope2)), composer2, ((i9 >> 24) & 112) | 384);
        if (sheetState5.getHasExpandedState()) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier2 = modifier42;
        sheetState7 = sheetState6;
        windowInsets3 = windowInsets42;
        shape5 = shape4;
        j11 = j8;
        j12 = j9;
        f3 = f2;
        j13 = j10;
        function23 = function22;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:176:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0111  */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use ModalBottomSheet overload with windowInset parameter.")
    /* renamed from: ModalBottomSheet-xOkiWaM  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void m1874ModalBottomSheetxOkiWaM(Function0 onDismissRequest, Modifier modifier, SheetState sheetState, Shape shape, long j, long j2, float f, long j3, Function2 function2, Function3 content, Composer composer, int i, int i2) {
        int i3;
        Object obj;
        Object obj2;
        long j4;
        int i4;
        float f2;
        int i5;
        int i6;
        int i7;
        int i8;
        SheetState sheetState2;
        Shape shape2;
        long j5;
        Modifier modifier2;
        long j6;
        Function2<Composer, Integer, Unit> m1711getLambda2$material3_release;
        long j7;
        long j8;
        float f3;
        long j9;
        Object obj3;
        Object obj4;
        Composer composer2;
        Modifier modifier3;
        SheetState sheetState3;
        Shape shape3;
        long j10;
        long j11;
        float f4;
        long j12;
        Function2 function22;
        ScopeUpdateScope endRestartGroup;
        int i9;
        int i10;
        int i11;
        Intrinsics.checkNotNullParameter(onDismissRequest, "onDismissRequest");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-1311611302);
        ComposerKt.sourceInformation(startRestartGroup, "C(ModalBottomSheet)P(5,4,8,7,0:c#ui.graphics.Color,2:c#ui.graphics.Color,9:c#ui.unit.Dp,6:c#ui.graphics.Color,3)284@12980L31,285@13052L13,286@13115L14,287@13157L31,289@13290L10,292@13437L321:ModalBottomSheet.android.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changedInstance(onDismissRequest) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i12 = i2 & 2;
        if (i12 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
            if ((i & 896) != 0) {
                if ((i2 & 4) == 0) {
                    obj = sheetState;
                    if (startRestartGroup.changed(obj)) {
                        i11 = 256;
                        i3 |= i11;
                    }
                } else {
                    obj = sheetState;
                }
                i11 = 128;
                i3 |= i11;
            } else {
                obj = sheetState;
            }
            if ((i & 7168) != 0) {
                if ((i2 & 8) == 0) {
                    obj2 = shape;
                    if (startRestartGroup.changed(obj2)) {
                        i10 = 2048;
                        i3 |= i10;
                    }
                } else {
                    obj2 = shape;
                }
                i10 = 1024;
                i3 |= i10;
            } else {
                obj2 = shape;
            }
            if ((i & 57344) == 0) {
                if ((i2 & 16) == 0 && startRestartGroup.changed(j)) {
                    i9 = 16384;
                    i3 |= i9;
                }
                i9 = 8192;
                i3 |= i9;
            }
            if ((i & 458752) != 0) {
                j4 = j2;
                i3 |= ((i2 & 32) == 0 && startRestartGroup.changed(j4)) ? 131072 : 65536;
            } else {
                j4 = j2;
            }
            i4 = i2 & 64;
            if (i4 == 0) {
                i3 |= 1572864;
            } else if ((i & 3670016) == 0) {
                f2 = f;
                i3 |= startRestartGroup.changed(f2) ? 1048576 : 524288;
                if ((i & 29360128) == 0) {
                    i5 = i3 | (((i2 & 128) == 0 && startRestartGroup.changed(j3)) ? 8388608 : 4194304);
                } else {
                    i5 = i3;
                }
                i6 = i2 & 256;
                if (i6 != 0) {
                    i5 |= 100663296;
                } else if ((i & 234881024) == 0) {
                    i5 |= startRestartGroup.changedInstance(function2) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                }
                if ((i2 & 512) == 0) {
                    if ((1879048192 & i) == 0) {
                        i7 = startRestartGroup.changedInstance(content) ? 536870912 : 268435456;
                    }
                    i8 = i5;
                    if ((i8 & 1533916891) == 306783378 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            Modifier.Companion companion = i12 == 0 ? Modifier.Companion : modifier;
                            if ((i2 & 4) == 0) {
                                sheetState2 = rememberModalBottomSheetState(false, null, startRestartGroup, 0, 3);
                                i8 &= -897;
                            } else {
                                sheetState2 = obj;
                            }
                            if ((i2 & 8) == 0) {
                                shape2 = BottomSheetDefaults.INSTANCE.getExpandedShape(startRestartGroup, 6);
                                i8 &= -7169;
                            } else {
                                shape2 = obj2;
                            }
                            if ((i2 & 16) == 0) {
                                i8 &= -57345;
                                j5 = BottomSheetDefaults.INSTANCE.getContainerColor(startRestartGroup, 6);
                            } else {
                                j5 = j;
                            }
                            if ((i2 & 32) != 0) {
                                j4 = ColorSchemeKt.m1687contentColorForek8zF_U(j5, startRestartGroup, (i8 >> 12) & 14);
                                i8 &= -458753;
                            }
                            float m1586getElevationD9Ej5fM = i4 == 0 ? BottomSheetDefaults.INSTANCE.m1586getElevationD9Ej5fM() : f2;
                            if ((i2 & 128) == 0) {
                                modifier2 = companion;
                                j6 = BottomSheetDefaults.INSTANCE.getScrimColor(startRestartGroup, 6);
                                i8 = (-29360129) & i8;
                            } else {
                                modifier2 = companion;
                                j6 = j3;
                            }
                            m1711getLambda2$material3_release = i6 == 0 ? ComposableSingletons$ModalBottomSheet_androidKt.INSTANCE.m1711getLambda2$material3_release() : function2;
                            j7 = j5;
                            j8 = j4;
                            f3 = m1586getElevationD9Ej5fM;
                            j9 = j6;
                            obj3 = sheetState2;
                            obj4 = shape2;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 4) != 0) {
                                i8 &= -897;
                            }
                            if ((i2 & 8) != 0) {
                                i8 &= -7169;
                            }
                            if ((i2 & 16) != 0) {
                                i8 &= -57345;
                            }
                            if ((i2 & 32) != 0) {
                                i8 &= -458753;
                            }
                            if ((i2 & 128) != 0) {
                                i8 &= -29360129;
                            }
                            modifier2 = modifier;
                            j7 = j;
                            j9 = j3;
                            m1711getLambda2$material3_release = function2;
                            obj3 = obj;
                            obj4 = obj2;
                            j8 = j4;
                            f3 = f2;
                        }
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1311611302, i8, -1, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.android.kt:281)");
                        }
                        composer2 = startRestartGroup;
                        m1873ModalBottomSheetEP0qOeE(onDismissRequest, modifier2, obj3, obj4, j7, j8, f3, j9, m1711getLambda2$material3_release, null, content, composer2, (i8 & 14) | (i8 & 112) | (i8 & 896) | (i8 & 7168) | (57344 & i8) | (458752 & i8) | (i8 & 3670016) | (i8 & 29360128) | (i8 & 234881024), (i8 >> 27) & 14, 512);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier2;
                        sheetState3 = obj3;
                        shape3 = obj4;
                        j10 = j7;
                        j11 = j8;
                        f4 = f3;
                        j12 = j9;
                        function22 = m1711getLambda2$material3_release;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier3 = modifier;
                        sheetState3 = obj;
                        shape3 = obj2;
                        j11 = j4;
                        composer2 = startRestartGroup;
                        f4 = f2;
                        j10 = j;
                        j12 = j3;
                        function22 = function2;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                        return;
                    }
                    endRestartGroup.updateScope(new ModalBottomSheet_androidKt$ModalBottomSheet$5(onDismissRequest, modifier3, sheetState3, shape3, j10, j11, f4, j12, function22, content, i, i2));
                    return;
                }
                i7 = C.ENCODING_PCM_32BIT;
                i5 |= i7;
                i8 = i5;
                if ((i8 & 1533916891) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i12 == 0) {
                }
                if ((i2 & 4) == 0) {
                }
                if ((i2 & 8) == 0) {
                }
                if ((i2 & 16) == 0) {
                }
                if ((i2 & 32) != 0) {
                }
                if (i4 == 0) {
                }
                if ((i2 & 128) == 0) {
                }
                if (i6 == 0) {
                }
                j7 = j5;
                j8 = j4;
                f3 = m1586getElevationD9Ej5fM;
                j9 = j6;
                obj3 = sheetState2;
                obj4 = shape2;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                composer2 = startRestartGroup;
                m1873ModalBottomSheetEP0qOeE(onDismissRequest, modifier2, obj3, obj4, j7, j8, f3, j9, m1711getLambda2$material3_release, null, content, composer2, (i8 & 14) | (i8 & 112) | (i8 & 896) | (i8 & 7168) | (57344 & i8) | (458752 & i8) | (i8 & 3670016) | (i8 & 29360128) | (i8 & 234881024), (i8 >> 27) & 14, 512);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier2;
                sheetState3 = obj3;
                shape3 = obj4;
                j10 = j7;
                j11 = j8;
                f4 = f3;
                j12 = j9;
                function22 = m1711getLambda2$material3_release;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            f2 = f;
            if ((i & 29360128) == 0) {
            }
            i6 = i2 & 256;
            if (i6 != 0) {
            }
            if ((i2 & 512) == 0) {
            }
            i5 |= i7;
            i8 = i5;
            if ((i8 & 1533916891) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i12 == 0) {
            }
            if ((i2 & 4) == 0) {
            }
            if ((i2 & 8) == 0) {
            }
            if ((i2 & 16) == 0) {
            }
            if ((i2 & 32) != 0) {
            }
            if (i4 == 0) {
            }
            if ((i2 & 128) == 0) {
            }
            if (i6 == 0) {
            }
            j7 = j5;
            j8 = j4;
            f3 = m1586getElevationD9Ej5fM;
            j9 = j6;
            obj3 = sheetState2;
            obj4 = shape2;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            composer2 = startRestartGroup;
            m1873ModalBottomSheetEP0qOeE(onDismissRequest, modifier2, obj3, obj4, j7, j8, f3, j9, m1711getLambda2$material3_release, null, content, composer2, (i8 & 14) | (i8 & 112) | (i8 & 896) | (i8 & 7168) | (57344 & i8) | (458752 & i8) | (i8 & 3670016) | (i8 & 29360128) | (i8 & 234881024), (i8 >> 27) & 14, 512);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier2;
            sheetState3 = obj3;
            shape3 = obj4;
            j10 = j7;
            j11 = j8;
            f4 = f3;
            j12 = j9;
            function22 = m1711getLambda2$material3_release;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        if ((i & 896) != 0) {
        }
        if ((i & 7168) != 0) {
        }
        if ((i & 57344) == 0) {
        }
        if ((i & 458752) != 0) {
        }
        i4 = i2 & 64;
        if (i4 == 0) {
        }
        f2 = f;
        if ((i & 29360128) == 0) {
        }
        i6 = i2 & 256;
        if (i6 != 0) {
        }
        if ((i2 & 512) == 0) {
        }
        i5 |= i7;
        i8 = i5;
        if ((i8 & 1533916891) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i12 == 0) {
        }
        if ((i2 & 4) == 0) {
        }
        if ((i2 & 8) == 0) {
        }
        if ((i2 & 16) == 0) {
        }
        if ((i2 & 32) != 0) {
        }
        if (i4 == 0) {
        }
        if ((i2 & 128) == 0) {
        }
        if (i6 == 0) {
        }
        j7 = j5;
        j8 = j4;
        f3 = m1586getElevationD9Ej5fM;
        j9 = j6;
        obj3 = sheetState2;
        obj4 = shape2;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        composer2 = startRestartGroup;
        m1873ModalBottomSheetEP0qOeE(onDismissRequest, modifier2, obj3, obj4, j7, j8, f3, j9, m1711getLambda2$material3_release, null, content, composer2, (i8 & 14) | (i8 & 112) | (i8 & 896) | (i8 & 7168) | (57344 & i8) | (458752 & i8) | (i8 & 3670016) | (i8 & 29360128) | (i8 & 234881024), (i8 >> 27) & 14, 512);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier3 = modifier2;
        sheetState3 = obj3;
        shape3 = obj4;
        j10 = j7;
        j11 = j8;
        f4 = f3;
        j12 = j9;
        function22 = m1711getLambda2$material3_release;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final SheetState rememberModalBottomSheetState(boolean z, Function1<? super SheetValue, Boolean> function1, Composer composer, int i, int i2) {
        composer.startReplaceableGroup(-1261794383);
        ComposerKt.sourceInformation(composer, "C(rememberModalBottomSheetState)P(1)318@14402L69:ModalBottomSheet.android.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            z = false;
        }
        boolean z2 = z;
        if ((i2 & 2) != 0) {
            function1 = ModalBottomSheet_androidKt$rememberModalBottomSheetState$1.INSTANCE;
        }
        Function1<? super SheetValue, Boolean> function12 = function1;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1261794383, i, -1, "androidx.compose.material3.rememberModalBottomSheetState (ModalBottomSheet.android.kt:315)");
        }
        SheetState rememberSheetState = SheetDefaultsKt.rememberSheetState(z2, function12, SheetValue.Hidden, false, composer, (i & 14) | 384 | (i & 112), 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberSheetState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Scrim-3J-VO9M  reason: not valid java name */
    public static final void m1875Scrim3JVO9M(long j, Function0<Unit> function0, boolean z, Composer composer, int i) {
        int i2;
        Modifier.Companion companion;
        Composer startRestartGroup = composer.startRestartGroup(1053897700);
        ComposerKt.sourceInformation(startRestartGroup, "C(Scrim)P(0:c#ui.graphics.Color)327@14631L121,346@15192L62,342@15086L168:ModalBottomSheet.android.kt#uh7d8r");
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
                ComposerKt.traceEventStart(1053897700, i2, -1, "androidx.compose.material3.Scrim (ModalBottomSheet.android.kt:321)");
            }
            if (j != Color.Companion.m3327getUnspecified0d7_KjU()) {
                State<Float> animateFloatAsState = AnimateAsStateKt.animateFloatAsState(z ? 1.0f : 0.0f, new TweenSpec(0, 0, null, 7, null), 0.0f, null, null, startRestartGroup, 48, 28);
                startRestartGroup.startReplaceableGroup(-1858721447);
                ComposerKt.sourceInformation(startRestartGroup, "333@14864L124");
                if (z) {
                    Modifier.Companion companion2 = Modifier.Companion;
                    startRestartGroup.startReplaceableGroup(1157296644);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                    boolean changed = startRestartGroup.changed(function0);
                    ModalBottomSheet_androidKt$Scrim$dismissSheet$1$1 rememberedValue = startRestartGroup.rememberedValue();
                    if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                        rememberedValue = new ModalBottomSheet_androidKt$Scrim$dismissSheet$1$1(function0, null);
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    startRestartGroup.endReplaceableGroup();
                    companion = SemanticsModifierKt.clearAndSetSemantics(SuspendingPointerInputFilterKt.pointerInput(companion2, function0, (Function2) rememberedValue), ModalBottomSheet_androidKt$Scrim$dismissSheet$2.INSTANCE);
                } else {
                    companion = Modifier.Companion;
                }
                startRestartGroup.endReplaceableGroup();
                Modifier then = SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null).then(companion);
                Color m3281boximpl = Color.m3281boximpl(j);
                startRestartGroup.startReplaceableGroup(511388516);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
                boolean changed2 = startRestartGroup.changed(m3281boximpl) | startRestartGroup.changed(animateFloatAsState);
                ModalBottomSheet_androidKt$Scrim$1$1 rememberedValue2 = startRestartGroup.rememberedValue();
                if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                    rememberedValue2 = new ModalBottomSheet_androidKt$Scrim$1$1(j, animateFloatAsState);
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
        endRestartGroup.updateScope(new ModalBottomSheet_androidKt$Scrim$2(j, function0, z, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier modalBottomSheetSwipeable(Modifier modifier, SheetState sheetState, AnchorChangeHandler<SheetValue> anchorChangeHandler, float f, Function2<? super CoroutineScope, ? super Float, Unit> function2) {
        Modifier draggable;
        draggable = DraggableKt.draggable(modifier, sheetState.getSwipeableState$material3_release().getSwipeDraggableState$material3_release(), Orientation.Vertical, (r20 & 4) != 0 ? true : sheetState.isVisible(), (r20 & 8) != 0 ? null : null, (r20 & 16) != 0 ? false : sheetState.getSwipeableState$material3_release().isAnimationRunning(), (r20 & 32) != 0 ? new DraggableKt$draggable$1(null) : null, (r20 & 64) != 0 ? new DraggableKt$draggable$2(null) : new ModalBottomSheet_androidKt$modalBottomSheetSwipeable$1(function2), (r20 & 128) != 0 ? false : false);
        return SwipeableV2Kt.swipeAnchors(draggable, sheetState.getSwipeableState$material3_release(), SetsKt.setOf((Object[]) new SheetValue[]{SheetValue.Hidden, SheetValue.PartiallyExpanded, SheetValue.Expanded}), anchorChangeHandler, new ModalBottomSheet_androidKt$modalBottomSheetSwipeable$2(f, sheetState));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object modalBottomSheetSwipeable$suspendConversion0(Function2 function2, CoroutineScope coroutineScope, float f, Continuation continuation) {
        function2.invoke(coroutineScope, Boxing.boxFloat(f));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AnchorChangeHandler<SheetValue> ModalBottomSheetAnchorChangeHandler(final SheetState sheetState, final Function2<? super SheetValue, ? super Float, Unit> function2, final Function1<? super SheetValue, Unit> function1) {
        return new AnchorChangeHandler<SheetValue>() { // from class: androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheetAnchorChangeHandler$1

            /* compiled from: ModalBottomSheet.android.kt */
            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            /* loaded from: classes.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[SheetValue.values().length];
                    try {
                        iArr[SheetValue.Hidden.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[SheetValue.PartiallyExpanded.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[SheetValue.Expanded.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            @Override // androidx.compose.material3.AnchorChangeHandler
            public final void onAnchorsChanged(SheetValue previousTarget, Map<SheetValue, Float> previousAnchors, Map<SheetValue, Float> newAnchors) {
                SheetValue sheetValue;
                Intrinsics.checkNotNullParameter(previousTarget, "previousTarget");
                Intrinsics.checkNotNullParameter(previousAnchors, "previousAnchors");
                Intrinsics.checkNotNullParameter(newAnchors, "newAnchors");
                Float f = previousAnchors.get(previousTarget);
                int i = WhenMappings.$EnumSwitchMapping$0[previousTarget.ordinal()];
                if (i == 1) {
                    sheetValue = SheetValue.Hidden;
                } else if (i == 2 || i == 3) {
                    if (newAnchors.containsKey(SheetValue.PartiallyExpanded)) {
                        sheetValue = SheetValue.PartiallyExpanded;
                    } else {
                        sheetValue = newAnchors.containsKey(SheetValue.Expanded) ? SheetValue.Expanded : SheetValue.Hidden;
                    }
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                if (Intrinsics.areEqual(((Number) MapsKt.getValue(newAnchors, sheetValue)).floatValue(), f)) {
                    return;
                }
                if (SheetState.this.getSwipeableState$material3_release().isAnimationRunning() || previousAnchors.isEmpty()) {
                    function2.invoke(sheetValue, Float.valueOf(SheetState.this.getSwipeableState$material3_release().getLastVelocity()));
                } else {
                    function1.invoke(sheetValue);
                }
            }
        };
    }

    public static final void ModalBottomSheetPopup(Function0<Unit> onDismissRequest, WindowInsets windowInsets, Function2<? super Composer, ? super Integer, Unit> content, Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(onDismissRequest, "onDismissRequest");
        Intrinsics.checkNotNullParameter(windowInsets, "windowInsets");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-627217336);
        ComposerKt.sourceInformation(startRestartGroup, "C(ModalBottomSheetPopup)P(1,2)420@17875L7,421@17896L38,422@17963L28,423@18018L29,424@18081L621,446@18708L217:ModalBottomSheet.android.kt#uh7d8r");
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changedInstance(onDismissRequest) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(windowInsets) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changedInstance(content) ? 256 : 128;
        }
        int i3 = i2;
        if ((i3 & 731) != 146 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-627217336, i3, -1, "androidx.compose.material3.ModalBottomSheetPopup (ModalBottomSheet.android.kt:415)");
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            View view = (View) consume;
            UUID id = (UUID) RememberSaveableKt.m2907rememberSaveable(new Object[0], (Saver<Object, ? extends Object>) null, (String) null, (Function0<? extends Object>) ModalBottomSheet_androidKt$ModalBottomSheetPopup$id$1.INSTANCE, startRestartGroup, 3080, 6);
            CompositionContext rememberCompositionContext = ComposablesKt.rememberCompositionContext(startRestartGroup, 0);
            State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(content, startRestartGroup, (i3 >> 6) & 14);
            startRestartGroup.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
            Object rememberedValue = startRestartGroup.rememberedValue();
            ModalBottomSheetWindow modalBottomSheetWindow = rememberedValue;
            if (rememberedValue == Composer.Companion.getEmpty()) {
                Intrinsics.checkNotNullExpressionValue(id, "id");
                ModalBottomSheetWindow modalBottomSheetWindow2 = new ModalBottomSheetWindow(onDismissRequest, view, id);
                modalBottomSheetWindow2.setCustomContent(rememberCompositionContext, ComposableLambdaKt.composableLambdaInstance(861223805, true, new ModalBottomSheet_androidKt$ModalBottomSheetPopup$modalBottomSheetWindow$1$1$1(windowInsets, rememberUpdatedState)));
                startRestartGroup.updateRememberedValue(modalBottomSheetWindow2);
                modalBottomSheetWindow = modalBottomSheetWindow2;
            }
            startRestartGroup.endReplaceableGroup();
            ModalBottomSheetWindow modalBottomSheetWindow3 = (ModalBottomSheetWindow) modalBottomSheetWindow;
            EffectsKt.DisposableEffect(modalBottomSheetWindow3, new ModalBottomSheet_androidKt$ModalBottomSheetPopup$1(modalBottomSheetWindow3), startRestartGroup, 8);
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
        endRestartGroup.updateScope(new ModalBottomSheet_androidKt$ModalBottomSheetPopup$2(onDismissRequest, windowInsets, content, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float Scrim_3J_VO9M$lambda$2(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function2<Composer, Integer, Unit> ModalBottomSheetPopup$lambda$5(State<? extends Function2<? super Composer, ? super Integer, Unit>> state) {
        return (Function2) state.getValue();
    }
}
