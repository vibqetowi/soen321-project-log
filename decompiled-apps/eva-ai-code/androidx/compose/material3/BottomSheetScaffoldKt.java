package androidx.compose.material3;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ifriend.keychain.cipherStorage.CipherStorageKeystoreRsaEcb;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: BottomSheetScaffold.kt */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0017\u001a\u0083\u0002\u0010\u0000\u001a\u00020\u00012\u001c\u0010\u0002\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0005¢\u0006\u0002\b\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\f2\b\b\u0002\u0010\u0013\u001a\u00020\f2\u0015\b\u0002\u0010\u0014\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0015¢\u0006\u0002\b\u00052\b\b\u0002\u0010\u0016\u001a\u00020\u00172\u0015\b\u0002\u0010\u0018\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0015¢\u0006\u0002\b\u00052\u0019\b\u0002\u0010\u0019\u001a\u0013\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u00052\b\b\u0002\u0010\u001b\u001a\u00020\u00102\b\b\u0002\u0010\u001c\u001a\u00020\u00102\u0017\u0010\u001d\u001a\u0013\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0005H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010 \u001aq\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"2\u0006\u0010$\u001a\u00020%26\u0010&\u001a2\u0012\u0013\u0012\u00110#¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(*\u0012\u0013\u0012\u00110+¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(,\u0012\u0004\u0012\u00020\u00010'2!\u0010-\u001a\u001d\u0012\u0013\u0012\u00110#¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(*\u0012\u0004\u0012\u00020\u00010\u0003H\u0003\u001aÃ\u0001\u0010.\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\b2\u0013\u0010\u0018\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0015¢\u0006\u0002\b\u00052&\u0010/\u001a\"\u0012\u0013\u0012\u00110\u001e¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(0\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u00052&\u00101\u001a\"\u0012\u0013\u0012\u001102¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(3\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u00052\u0011\u0010\u0019\u001a\r\u0012\u0004\u0012\u00020\u00010\u0015¢\u0006\u0002\b\u00052\u0006\u0010\u000b\u001a\u00020\f2\f\u00104\u001a\b\u0012\u0004\u0012\u00020+0\u00152\u0006\u00105\u001a\u00020%2\u0006\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u0010H\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b6\u00107\u001a\u0090\u0001\u00108\u001a\u00020\u00012\u0006\u0010$\u001a\u00020%2\u0006\u00109\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u00103\u001a\u00020+2\u0006\u0010:\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u00102\u0006\u0010;\u001a\u00020\f2\u0006\u0010<\u001a\u00020\f2\u0013\u0010=\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0015¢\u0006\u0002\b\u00052\u001c\u0010\u001d\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0005¢\u0006\u0002\b\u0006H\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b>\u0010?\u001a!\u0010@\u001a\u00020\n2\b\b\u0002\u0010A\u001a\u00020%2\b\b\u0002\u0010B\u001a\u00020\u001aH\u0007¢\u0006\u0002\u0010C\u001a7\u0010D\u001a\u00020%2\b\b\u0002\u0010E\u001a\u00020#2\u0014\b\u0002\u0010F\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00170\u00032\b\b\u0002\u0010G\u001a\u00020\u0017H\u0007¢\u0006\u0002\u0010H\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006I"}, d2 = {"BottomSheetScaffold", "", "sheetContent", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "modifier", "Landroidx/compose/ui/Modifier;", "scaffoldState", "Landroidx/compose/material3/BottomSheetScaffoldState;", "sheetPeekHeight", "Landroidx/compose/ui/unit/Dp;", "sheetShape", "Landroidx/compose/ui/graphics/Shape;", "sheetContainerColor", "Landroidx/compose/ui/graphics/Color;", "sheetContentColor", "sheetTonalElevation", "sheetShadowElevation", "sheetDragHandle", "Lkotlin/Function0;", "sheetSwipeEnabled", "", "topBar", "snackbarHost", "Landroidx/compose/material3/SnackbarHostState;", "containerColor", "contentColor", FirebaseAnalytics.Param.CONTENT, "Landroidx/compose/foundation/layout/PaddingValues;", "BottomSheetScaffold-6cEcpDs", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/BottomSheetScaffoldState;FLandroidx/compose/ui/graphics/Shape;JJFFLkotlin/jvm/functions/Function2;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;JJLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "BottomSheetScaffoldAnchorChangeHandler", "Landroidx/compose/material3/AnchorChangeHandler;", "Landroidx/compose/material3/SheetValue;", "state", "Landroidx/compose/material3/SheetState;", "animateTo", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", TypedValues.AttributesType.S_TARGET, "", "velocity", "snapTo", "BottomSheetScaffoldLayout", TtmlNode.TAG_BODY, "innerPadding", "bottomSheet", "", "layoutHeight", "sheetOffset", "sheetState", "BottomSheetScaffoldLayout-PxNyym8", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;FLkotlin/jvm/functions/Function0;Landroidx/compose/material3/SheetState;JJLandroidx/compose/runtime/Composer;I)V", "StandardBottomSheet", "peekHeight", "shape", "tonalElevation", "shadowElevation", "dragHandle", "StandardBottomSheet-8oydGBM", "(Landroidx/compose/material3/SheetState;FZFLandroidx/compose/ui/graphics/Shape;JJFFLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "rememberBottomSheetScaffoldState", "bottomSheetState", "snackbarHostState", "(Landroidx/compose/material3/SheetState;Landroidx/compose/material3/SnackbarHostState;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/BottomSheetScaffoldState;", "rememberStandardBottomSheetState", "initialValue", "confirmValueChange", "skipHiddenState", "(Landroidx/compose/material3/SheetValue;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/SheetState;", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BottomSheetScaffoldKt {
    /* JADX WARN: Code restructure failed: missing block: B:143:0x01b6, code lost:
        if (r2.changed(r45) == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x01d3, code lost:
        if (r2.changed(r47) == false) goto L77;
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:267:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0139  */
    /* renamed from: BottomSheetScaffold-6cEcpDs  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1588BottomSheetScaffold6cEcpDs(Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> sheetContent, Modifier modifier, BottomSheetScaffoldState bottomSheetScaffoldState, float f, Shape shape, long j, long j2, float f2, float f3, Function2<? super Composer, ? super Integer, Unit> function2, boolean z, Function2<? super Composer, ? super Integer, Unit> function22, Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function3, long j3, long j4, Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> content, Composer composer, int i, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        Modifier modifier2;
        BottomSheetScaffoldState bottomSheetScaffoldState2;
        BottomSheetScaffoldState bottomSheetScaffoldState3;
        int i14;
        Shape shape2;
        Shape shape3;
        long j5;
        long j6;
        float m1586getElevationD9Ej5fM;
        Function2<? super Composer, ? super Integer, Unit> function23;
        int i15;
        long j7;
        Modifier modifier3;
        long j8;
        int i16;
        long j9;
        int i17;
        float f4;
        Function2<? super Composer, ? super Integer, Unit> function24;
        boolean z2;
        Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function32;
        Shape shape4;
        float f5;
        BottomSheetScaffoldState bottomSheetScaffoldState4;
        boolean changed;
        BottomSheetScaffoldKt$BottomSheetScaffold$3$1 rememberedValue;
        Shape shape5;
        float f6;
        BottomSheetScaffoldState bottomSheetScaffoldState5;
        float f7;
        Function2<? super Composer, ? super Integer, Unit> function25;
        boolean z3;
        Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function33;
        float f8;
        Modifier modifier4;
        ScopeUpdateScope endRestartGroup;
        int i18;
        Intrinsics.checkNotNullParameter(sheetContent, "sheetContent");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(144898711);
        ComposerKt.sourceInformation(startRestartGroup, "C(BottomSheetScaffold)P(6,3,4,9:c#ui.unit.Dp,11,5:c#ui.graphics.Color,7:c#ui.graphics.Color,13:c#ui.unit.Dp,10:c#ui.unit.Dp,8,12,15,14,0:c#ui.graphics.Color,2:c#ui.graphics.Color)99@5165L34,101@5308L13,102@5376L14,103@5423L36,110@5880L11,111@5927L31,122@6281L50,114@6017L1096:BottomSheetScaffold.kt#uh7d8r");
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 14) == 0) {
            i4 = (startRestartGroup.changedInstance(sheetContent) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        int i19 = i3 & 2;
        if (i19 != 0) {
            i4 |= 48;
        } else if ((i & 112) == 0) {
            i4 |= startRestartGroup.changed(modifier) ? 32 : 16;
            if ((i & 896) == 0) {
                if ((i3 & 4) == 0 && startRestartGroup.changed(bottomSheetScaffoldState)) {
                    i18 = 256;
                    i4 |= i18;
                }
                i18 = 128;
                i4 |= i18;
            }
            i5 = i3 & 8;
            int i20 = 2048;
            if (i5 == 0) {
                i4 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
            } else if ((i & 7168) == 0) {
                i4 |= startRestartGroup.changed(f) ? 2048 : 1024;
                int i21 = 16384;
                if ((i & 57344) == 0) {
                    i4 |= ((i3 & 16) == 0 && startRestartGroup.changed(shape)) ? 16384 : 8192;
                }
                if ((i & 458752) == 0) {
                    i4 |= ((i3 & 32) == 0 && startRestartGroup.changed(j)) ? 131072 : 65536;
                }
                if ((i & 3670016) == 0) {
                    i4 |= ((i3 & 64) == 0 && startRestartGroup.changed(j2)) ? 1048576 : 524288;
                }
                i6 = i3 & 128;
                if (i6 != 0) {
                    i4 |= 12582912;
                } else if ((i & 29360128) == 0) {
                    i4 |= startRestartGroup.changed(f2) ? 8388608 : 4194304;
                }
                i7 = i3 & 256;
                if (i7 != 0) {
                    i4 |= 100663296;
                } else if ((i & 234881024) == 0) {
                    i4 |= startRestartGroup.changed(f3) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                }
                i8 = i3 & 512;
                if (i8 != 0) {
                    i4 |= C.ENCODING_PCM_32BIT;
                } else if ((i & 1879048192) == 0) {
                    i4 |= startRestartGroup.changedInstance(function2) ? 536870912 : 268435456;
                }
                i9 = i3 & 1024;
                if (i9 != 0) {
                    i10 = i2 | 6;
                } else if ((i2 & 14) == 0) {
                    i10 = i2 | (startRestartGroup.changed(z) ? 4 : 2);
                } else {
                    i10 = i2;
                }
                i11 = i3 & 2048;
                if (i11 != 0) {
                    i10 |= 48;
                } else if ((i2 & 112) == 0) {
                    i10 |= startRestartGroup.changedInstance(function22) ? 32 : 16;
                }
                int i22 = i10;
                i12 = i3 & 4096;
                if (i12 != 0) {
                    i22 |= 384;
                } else if ((i2 & 896) == 0) {
                    i22 |= startRestartGroup.changedInstance(function3) ? 256 : 128;
                    if ((i2 & 7168) == 0) {
                        if ((i3 & 8192) != 0) {
                        }
                        i20 = 1024;
                        i22 |= i20;
                    }
                    if ((i2 & 57344) == 0) {
                        if ((i3 & 16384) != 0) {
                        }
                        i21 = 8192;
                        i22 |= i21;
                    }
                    if ((i3 & 32768) != 0) {
                        if ((i2 & 458752) == 0) {
                            i13 = startRestartGroup.changedInstance(content) ? 131072 : 65536;
                        }
                        if ((i4 & 1533916891) == 306783378 || (374491 & i22) != 74898 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                Modifier.Companion companion = i19 != 0 ? Modifier.Companion : modifier;
                                if ((i3 & 4) != 0) {
                                    modifier2 = companion;
                                    bottomSheetScaffoldState2 = rememberBottomSheetScaffoldState(null, null, startRestartGroup, 0, 3);
                                    i4 &= -897;
                                } else {
                                    modifier2 = companion;
                                    bottomSheetScaffoldState2 = bottomSheetScaffoldState;
                                }
                                float m1587getSheetPeekHeightD9Ej5fM = i5 != 0 ? BottomSheetDefaults.INSTANCE.m1587getSheetPeekHeightD9Ej5fM() : f;
                                if ((i3 & 16) != 0) {
                                    bottomSheetScaffoldState3 = bottomSheetScaffoldState2;
                                    i14 = 6;
                                    shape2 = BottomSheetDefaults.INSTANCE.getExpandedShape(startRestartGroup, 6);
                                    i4 &= -57345;
                                } else {
                                    bottomSheetScaffoldState3 = bottomSheetScaffoldState2;
                                    i14 = 6;
                                    shape2 = shape;
                                }
                                float f9 = m1587getSheetPeekHeightD9Ej5fM;
                                if ((i3 & 32) != 0) {
                                    i4 &= -458753;
                                    shape3 = shape2;
                                    j5 = BottomSheetDefaults.INSTANCE.getContainerColor(startRestartGroup, i14);
                                } else {
                                    shape3 = shape2;
                                    j5 = j;
                                }
                                if ((i3 & 64) != 0) {
                                    j6 = ColorSchemeKt.m1687contentColorForek8zF_U(j5, startRestartGroup, (i4 >> 15) & 14);
                                    i4 &= -3670017;
                                } else {
                                    j6 = j2;
                                }
                                m1586getElevationD9Ej5fM = i6 != 0 ? BottomSheetDefaults.INSTANCE.m1586getElevationD9Ej5fM() : f2;
                                float m1586getElevationD9Ej5fM2 = i7 != 0 ? BottomSheetDefaults.INSTANCE.m1586getElevationD9Ej5fM() : f3;
                                Function2<Composer, Integer, Unit> m1705getLambda1$material3_release = i8 != 0 ? ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m1705getLambda1$material3_release() : function2;
                                boolean z4 = i9 != 0 ? true : z;
                                function23 = i11 != 0 ? null : function22;
                                Function3<SnackbarHostState, Composer, Integer, Unit> m1706getLambda2$material3_release = i12 != 0 ? ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m1706getLambda2$material3_release() : function3;
                                if ((i3 & 8192) != 0) {
                                    i15 = i22 & (-7169);
                                    j7 = MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, 6).m1651getSurface0d7_KjU();
                                } else {
                                    i15 = i22;
                                    j7 = j3;
                                }
                                Function2<? super Composer, ? super Integer, Unit> function26 = m1705getLambda1$material3_release;
                                if ((i3 & 16384) != 0) {
                                    long m1687contentColorForek8zF_U = ColorSchemeKt.m1687contentColorForek8zF_U(j7, startRestartGroup, (i15 >> 9) & 14);
                                    i17 = (-57345) & i15;
                                    i16 = i4;
                                    function32 = m1706getLambda2$material3_release;
                                    j8 = m1687contentColorForek8zF_U;
                                    modifier3 = modifier2;
                                    f4 = f9;
                                    f5 = m1586getElevationD9Ej5fM2;
                                    j9 = j7;
                                    bottomSheetScaffoldState4 = bottomSheetScaffoldState3;
                                    function24 = function26;
                                    z2 = z4;
                                    shape4 = shape3;
                                } else {
                                    modifier3 = modifier2;
                                    j8 = j4;
                                    i16 = i4;
                                    j9 = j7;
                                    i17 = i15;
                                    f4 = f9;
                                    function24 = function26;
                                    z2 = z4;
                                    function32 = m1706getLambda2$material3_release;
                                    shape4 = shape3;
                                    f5 = m1586getElevationD9Ej5fM2;
                                    bottomSheetScaffoldState4 = bottomSheetScaffoldState3;
                                }
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i3 & 4) != 0) {
                                    i4 &= -897;
                                }
                                if ((i3 & 16) != 0) {
                                    i4 &= -57345;
                                }
                                if ((i3 & 32) != 0) {
                                    i4 &= -458753;
                                }
                                if ((i3 & 64) != 0) {
                                    i4 &= -3670017;
                                }
                                if ((i3 & 8192) != 0) {
                                    i22 &= -7169;
                                }
                                if ((i3 & 16384) != 0) {
                                    i22 &= -57345;
                                }
                                modifier3 = modifier;
                                bottomSheetScaffoldState4 = bottomSheetScaffoldState;
                                shape4 = shape;
                                j5 = j;
                                j6 = j2;
                                m1586getElevationD9Ej5fM = f2;
                                f5 = f3;
                                function24 = function2;
                                function23 = function22;
                                function32 = function3;
                                j9 = j3;
                                j8 = j4;
                                i16 = i4;
                                i17 = i22;
                                f4 = f;
                                z2 = z;
                            }
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(144898711, i16, i17, "androidx.compose.material3.BottomSheetScaffold (BottomSheetScaffold.kt:96)");
                            }
                            SheetState bottomSheetState = bottomSheetScaffoldState4.getBottomSheetState();
                            Shape shape6 = shape4;
                            float f10 = f5;
                            ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(startRestartGroup, 106433656, true, new BottomSheetScaffoldKt$BottomSheetScaffold$1(bottomSheetScaffoldState4, f4, z2, shape4, j5, j6, m1586getElevationD9Ej5fM, f5, function24, sheetContent, i16, i17));
                            float f11 = m1586getElevationD9Ej5fM;
                            ComposableLambda composableLambda2 = ComposableLambdaKt.composableLambda(startRestartGroup, -1629779374, true, new BottomSheetScaffoldKt$BottomSheetScaffold$2(function32, bottomSheetScaffoldState4, i17));
                            startRestartGroup.startReplaceableGroup(1157296644);
                            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                            changed = startRestartGroup.changed(bottomSheetScaffoldState4);
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (!changed || rememberedValue == Composer.Companion.getEmpty()) {
                                rememberedValue = new BottomSheetScaffoldKt$BottomSheetScaffold$3$1(bottomSheetScaffoldState4);
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            startRestartGroup.endReplaceableGroup();
                            BottomSheetScaffoldState bottomSheetScaffoldState6 = bottomSheetScaffoldState4;
                            int i23 = ((i17 >> 9) & 896) | ((i16 >> 3) & 14) | 27648 | (i17 & 112) | ((i16 << 6) & 458752);
                            int i24 = i17 << 15;
                            m1589BottomSheetScaffoldLayoutPxNyym8(modifier3, function23, content, composableLambda, composableLambda2, f4, (Function0) rememberedValue, bottomSheetState, j9, j8, startRestartGroup, i23 | (234881024 & i24) | (i24 & 1879048192));
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            shape5 = shape6;
                            f6 = f10;
                            bottomSheetScaffoldState5 = bottomSheetScaffoldState6;
                            f7 = f4;
                            function25 = function24;
                            z3 = z2;
                            function33 = function32;
                            f8 = f11;
                            modifier4 = modifier3;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier4 = modifier;
                            bottomSheetScaffoldState5 = bottomSheetScaffoldState;
                            f7 = f;
                            shape5 = shape;
                            j5 = j;
                            j6 = j2;
                            f8 = f2;
                            f6 = f3;
                            function25 = function2;
                            z3 = z;
                            function23 = function22;
                            function33 = function3;
                            j9 = j3;
                            j8 = j4;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup == null) {
                            return;
                        }
                        endRestartGroup.updateScope(new BottomSheetScaffoldKt$BottomSheetScaffold$4(sheetContent, modifier4, bottomSheetScaffoldState5, f7, shape5, j5, j6, f8, f6, function25, z3, function23, function33, j9, j8, content, i, i2, i3));
                        return;
                    }
                    i13 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    i22 |= i13;
                    if ((i4 & 1533916891) == 306783378) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i19 != 0) {
                    }
                    if ((i3 & 4) != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if ((i3 & 16) != 0) {
                    }
                    float f92 = m1587getSheetPeekHeightD9Ej5fM;
                    if ((i3 & 32) != 0) {
                    }
                    if ((i3 & 64) != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (i9 != 0) {
                    }
                    if (i11 != 0) {
                    }
                    if (i12 != 0) {
                    }
                    if ((i3 & 8192) != 0) {
                    }
                    Function2<? super Composer, ? super Integer, Unit> function262 = m1705getLambda1$material3_release;
                    if ((i3 & 16384) != 0) {
                    }
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    SheetState bottomSheetState2 = bottomSheetScaffoldState4.getBottomSheetState();
                    Shape shape62 = shape4;
                    float f102 = f5;
                    ComposableLambda composableLambda3 = ComposableLambdaKt.composableLambda(startRestartGroup, 106433656, true, new BottomSheetScaffoldKt$BottomSheetScaffold$1(bottomSheetScaffoldState4, f4, z2, shape4, j5, j6, m1586getElevationD9Ej5fM, f5, function24, sheetContent, i16, i17));
                    float f112 = m1586getElevationD9Ej5fM;
                    ComposableLambda composableLambda22 = ComposableLambdaKt.composableLambda(startRestartGroup, -1629779374, true, new BottomSheetScaffoldKt$BottomSheetScaffold$2(function32, bottomSheetScaffoldState4, i17));
                    startRestartGroup.startReplaceableGroup(1157296644);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                    changed = startRestartGroup.changed(bottomSheetScaffoldState4);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!changed) {
                    }
                    rememberedValue = new BottomSheetScaffoldKt$BottomSheetScaffold$3$1(bottomSheetScaffoldState4);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                    startRestartGroup.endReplaceableGroup();
                    BottomSheetScaffoldState bottomSheetScaffoldState62 = bottomSheetScaffoldState4;
                    int i232 = ((i17 >> 9) & 896) | ((i16 >> 3) & 14) | 27648 | (i17 & 112) | ((i16 << 6) & 458752);
                    int i242 = i17 << 15;
                    m1589BottomSheetScaffoldLayoutPxNyym8(modifier3, function23, content, composableLambda3, composableLambda22, f4, (Function0) rememberedValue, bottomSheetState2, j9, j8, startRestartGroup, i232 | (234881024 & i242) | (i242 & 1879048192));
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    shape5 = shape62;
                    f6 = f102;
                    bottomSheetScaffoldState5 = bottomSheetScaffoldState62;
                    f7 = f4;
                    function25 = function24;
                    z3 = z2;
                    function33 = function32;
                    f8 = f112;
                    modifier4 = modifier3;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                if ((i2 & 7168) == 0) {
                }
                if ((i2 & 57344) == 0) {
                }
                if ((i3 & 32768) != 0) {
                }
                i22 |= i13;
                if ((i4 & 1533916891) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i19 != 0) {
                }
                if ((i3 & 4) != 0) {
                }
                if (i5 != 0) {
                }
                if ((i3 & 16) != 0) {
                }
                float f922 = m1587getSheetPeekHeightD9Ej5fM;
                if ((i3 & 32) != 0) {
                }
                if ((i3 & 64) != 0) {
                }
                if (i6 != 0) {
                }
                if (i7 != 0) {
                }
                if (i8 != 0) {
                }
                if (i9 != 0) {
                }
                if (i11 != 0) {
                }
                if (i12 != 0) {
                }
                if ((i3 & 8192) != 0) {
                }
                Function2<? super Composer, ? super Integer, Unit> function2622 = m1705getLambda1$material3_release;
                if ((i3 & 16384) != 0) {
                }
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                SheetState bottomSheetState22 = bottomSheetScaffoldState4.getBottomSheetState();
                Shape shape622 = shape4;
                float f1022 = f5;
                ComposableLambda composableLambda32 = ComposableLambdaKt.composableLambda(startRestartGroup, 106433656, true, new BottomSheetScaffoldKt$BottomSheetScaffold$1(bottomSheetScaffoldState4, f4, z2, shape4, j5, j6, m1586getElevationD9Ej5fM, f5, function24, sheetContent, i16, i17));
                float f1122 = m1586getElevationD9Ej5fM;
                ComposableLambda composableLambda222 = ComposableLambdaKt.composableLambda(startRestartGroup, -1629779374, true, new BottomSheetScaffoldKt$BottomSheetScaffold$2(function32, bottomSheetScaffoldState4, i17));
                startRestartGroup.startReplaceableGroup(1157296644);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                changed = startRestartGroup.changed(bottomSheetScaffoldState4);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!changed) {
                }
                rememberedValue = new BottomSheetScaffoldKt$BottomSheetScaffold$3$1(bottomSheetScaffoldState4);
                startRestartGroup.updateRememberedValue(rememberedValue);
                startRestartGroup.endReplaceableGroup();
                BottomSheetScaffoldState bottomSheetScaffoldState622 = bottomSheetScaffoldState4;
                int i2322 = ((i17 >> 9) & 896) | ((i16 >> 3) & 14) | 27648 | (i17 & 112) | ((i16 << 6) & 458752);
                int i2422 = i17 << 15;
                m1589BottomSheetScaffoldLayoutPxNyym8(modifier3, function23, content, composableLambda32, composableLambda222, f4, (Function0) rememberedValue, bottomSheetState22, j9, j8, startRestartGroup, i2322 | (234881024 & i2422) | (i2422 & 1879048192));
                if (ComposerKt.isTraceInProgress()) {
                }
                shape5 = shape622;
                f6 = f1022;
                bottomSheetScaffoldState5 = bottomSheetScaffoldState622;
                f7 = f4;
                function25 = function24;
                z3 = z2;
                function33 = function32;
                f8 = f1122;
                modifier4 = modifier3;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            int i212 = 16384;
            if ((i & 57344) == 0) {
            }
            if ((i & 458752) == 0) {
            }
            if ((i & 3670016) == 0) {
            }
            i6 = i3 & 128;
            if (i6 != 0) {
            }
            i7 = i3 & 256;
            if (i7 != 0) {
            }
            i8 = i3 & 512;
            if (i8 != 0) {
            }
            i9 = i3 & 1024;
            if (i9 != 0) {
            }
            i11 = i3 & 2048;
            if (i11 != 0) {
            }
            int i222 = i10;
            i12 = i3 & 4096;
            if (i12 != 0) {
            }
            if ((i2 & 7168) == 0) {
            }
            if ((i2 & 57344) == 0) {
            }
            if ((i3 & 32768) != 0) {
            }
            i222 |= i13;
            if ((i4 & 1533916891) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i19 != 0) {
            }
            if ((i3 & 4) != 0) {
            }
            if (i5 != 0) {
            }
            if ((i3 & 16) != 0) {
            }
            float f9222 = m1587getSheetPeekHeightD9Ej5fM;
            if ((i3 & 32) != 0) {
            }
            if ((i3 & 64) != 0) {
            }
            if (i6 != 0) {
            }
            if (i7 != 0) {
            }
            if (i8 != 0) {
            }
            if (i9 != 0) {
            }
            if (i11 != 0) {
            }
            if (i12 != 0) {
            }
            if ((i3 & 8192) != 0) {
            }
            Function2<? super Composer, ? super Integer, Unit> function26222 = m1705getLambda1$material3_release;
            if ((i3 & 16384) != 0) {
            }
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            SheetState bottomSheetState222 = bottomSheetScaffoldState4.getBottomSheetState();
            Shape shape6222 = shape4;
            float f10222 = f5;
            ComposableLambda composableLambda322 = ComposableLambdaKt.composableLambda(startRestartGroup, 106433656, true, new BottomSheetScaffoldKt$BottomSheetScaffold$1(bottomSheetScaffoldState4, f4, z2, shape4, j5, j6, m1586getElevationD9Ej5fM, f5, function24, sheetContent, i16, i17));
            float f11222 = m1586getElevationD9Ej5fM;
            ComposableLambda composableLambda2222 = ComposableLambdaKt.composableLambda(startRestartGroup, -1629779374, true, new BottomSheetScaffoldKt$BottomSheetScaffold$2(function32, bottomSheetScaffoldState4, i17));
            startRestartGroup.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
            changed = startRestartGroup.changed(bottomSheetScaffoldState4);
            rememberedValue = startRestartGroup.rememberedValue();
            if (!changed) {
            }
            rememberedValue = new BottomSheetScaffoldKt$BottomSheetScaffold$3$1(bottomSheetScaffoldState4);
            startRestartGroup.updateRememberedValue(rememberedValue);
            startRestartGroup.endReplaceableGroup();
            BottomSheetScaffoldState bottomSheetScaffoldState6222 = bottomSheetScaffoldState4;
            int i23222 = ((i17 >> 9) & 896) | ((i16 >> 3) & 14) | 27648 | (i17 & 112) | ((i16 << 6) & 458752);
            int i24222 = i17 << 15;
            m1589BottomSheetScaffoldLayoutPxNyym8(modifier3, function23, content, composableLambda322, composableLambda2222, f4, (Function0) rememberedValue, bottomSheetState222, j9, j8, startRestartGroup, i23222 | (234881024 & i24222) | (i24222 & 1879048192));
            if (ComposerKt.isTraceInProgress()) {
            }
            shape5 = shape6222;
            f6 = f10222;
            bottomSheetScaffoldState5 = bottomSheetScaffoldState6222;
            f7 = f4;
            function25 = function24;
            z3 = z2;
            function33 = function32;
            f8 = f11222;
            modifier4 = modifier3;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        if ((i & 896) == 0) {
        }
        i5 = i3 & 8;
        int i202 = 2048;
        if (i5 == 0) {
        }
        int i2122 = 16384;
        if ((i & 57344) == 0) {
        }
        if ((i & 458752) == 0) {
        }
        if ((i & 3670016) == 0) {
        }
        i6 = i3 & 128;
        if (i6 != 0) {
        }
        i7 = i3 & 256;
        if (i7 != 0) {
        }
        i8 = i3 & 512;
        if (i8 != 0) {
        }
        i9 = i3 & 1024;
        if (i9 != 0) {
        }
        i11 = i3 & 2048;
        if (i11 != 0) {
        }
        int i2222 = i10;
        i12 = i3 & 4096;
        if (i12 != 0) {
        }
        if ((i2 & 7168) == 0) {
        }
        if ((i2 & 57344) == 0) {
        }
        if ((i3 & 32768) != 0) {
        }
        i2222 |= i13;
        if ((i4 & 1533916891) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i19 != 0) {
        }
        if ((i3 & 4) != 0) {
        }
        if (i5 != 0) {
        }
        if ((i3 & 16) != 0) {
        }
        float f92222 = m1587getSheetPeekHeightD9Ej5fM;
        if ((i3 & 32) != 0) {
        }
        if ((i3 & 64) != 0) {
        }
        if (i6 != 0) {
        }
        if (i7 != 0) {
        }
        if (i8 != 0) {
        }
        if (i9 != 0) {
        }
        if (i11 != 0) {
        }
        if (i12 != 0) {
        }
        if ((i3 & 8192) != 0) {
        }
        Function2<? super Composer, ? super Integer, Unit> function262222 = m1705getLambda1$material3_release;
        if ((i3 & 16384) != 0) {
        }
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        SheetState bottomSheetState2222 = bottomSheetScaffoldState4.getBottomSheetState();
        Shape shape62222 = shape4;
        float f102222 = f5;
        ComposableLambda composableLambda3222 = ComposableLambdaKt.composableLambda(startRestartGroup, 106433656, true, new BottomSheetScaffoldKt$BottomSheetScaffold$1(bottomSheetScaffoldState4, f4, z2, shape4, j5, j6, m1586getElevationD9Ej5fM, f5, function24, sheetContent, i16, i17));
        float f112222 = m1586getElevationD9Ej5fM;
        ComposableLambda composableLambda22222 = ComposableLambdaKt.composableLambda(startRestartGroup, -1629779374, true, new BottomSheetScaffoldKt$BottomSheetScaffold$2(function32, bottomSheetScaffoldState4, i17));
        startRestartGroup.startReplaceableGroup(1157296644);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
        changed = startRestartGroup.changed(bottomSheetScaffoldState4);
        rememberedValue = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        rememberedValue = new BottomSheetScaffoldKt$BottomSheetScaffold$3$1(bottomSheetScaffoldState4);
        startRestartGroup.updateRememberedValue(rememberedValue);
        startRestartGroup.endReplaceableGroup();
        BottomSheetScaffoldState bottomSheetScaffoldState62222 = bottomSheetScaffoldState4;
        int i232222 = ((i17 >> 9) & 896) | ((i16 >> 3) & 14) | 27648 | (i17 & 112) | ((i16 << 6) & 458752);
        int i242222 = i17 << 15;
        m1589BottomSheetScaffoldLayoutPxNyym8(modifier3, function23, content, composableLambda3222, composableLambda22222, f4, (Function0) rememberedValue, bottomSheetState2222, j9, j8, startRestartGroup, i232222 | (234881024 & i242222) | (i242222 & 1879048192));
        if (ComposerKt.isTraceInProgress()) {
        }
        shape5 = shape62222;
        f6 = f102222;
        bottomSheetScaffoldState5 = bottomSheetScaffoldState62222;
        f7 = f4;
        function25 = function24;
        z3 = z2;
        function33 = function32;
        f8 = f112222;
        modifier4 = modifier3;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final BottomSheetScaffoldState rememberBottomSheetScaffoldState(SheetState sheetState, SnackbarHostState snackbarHostState, Composer composer, int i, int i2) {
        composer.startReplaceableGroup(-1474606134);
        ComposerKt.sourceInformation(composer, "C(rememberBottomSheetScaffoldState)167@7874L34,168@7953L32,170@8027L196:BottomSheetScaffold.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            sheetState = rememberStandardBottomSheetState(null, null, false, composer, 0, 7);
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
            ComposerKt.traceEventStart(-1474606134, i, -1, "androidx.compose.material3.rememberBottomSheetScaffoldState (BottomSheetScaffold.kt:166)");
        }
        composer.startReplaceableGroup(511388516);
        ComposerKt.sourceInformation(composer, "CC(remember)P(1,2):Composables.kt#9igjgp");
        boolean changed = composer.changed(sheetState) | composer.changed(snackbarHostState);
        Object rememberedValue2 = composer.rememberedValue();
        if (changed || rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = new BottomSheetScaffoldState(sheetState, snackbarHostState);
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

    public static final SheetState rememberStandardBottomSheetState(SheetValue sheetValue, Function1<? super SheetValue, Boolean> function1, boolean z, Composer composer, int i, int i2) {
        composer.startReplaceableGroup(678511581);
        ComposerKt.sourceInformation(composer, "C(rememberStandardBottomSheetState)P(1)192@8853L76:BottomSheetScaffold.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            sheetValue = SheetValue.PartiallyExpanded;
        }
        SheetValue sheetValue2 = sheetValue;
        if ((i2 & 2) != 0) {
            function1 = BottomSheetScaffoldKt$rememberStandardBottomSheetState$1.INSTANCE;
        }
        Function1<? super SheetValue, Boolean> function12 = function1;
        if ((i2 & 4) != 0) {
            z = true;
        }
        boolean z2 = z;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(678511581, i, -1, "androidx.compose.material3.rememberStandardBottomSheetState (BottomSheetScaffold.kt:188)");
        }
        SheetState rememberSheetState = SheetDefaultsKt.rememberSheetState(false, function12, sheetValue2, z2, composer, (i & 112) | 6 | ((i << 6) & 896) | ((i << 3) & 7168), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberSheetState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: StandardBottomSheet-8oydGBM  reason: not valid java name */
    public static final void m1590StandardBottomSheet8oydGBM(SheetState sheetState, float f, boolean z, float f2, Shape shape, long j, long j2, float f3, float f4, Function2<? super Composer, ? super Integer, Unit> function2, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, int i, int i2) {
        int i3;
        int i4;
        Composer startRestartGroup = composer.startRestartGroup(-763942484);
        ComposerKt.sourceInformation(startRestartGroup, "C(StandardBottomSheet)P(9,5:c#ui.unit.Dp,8,4,7,0:c#ui.graphics.Color,2:c#ui.graphics.Color,10:c#ui.unit.Dp,6:c#ui.unit.Dp,3)209@9346L24,*210@9412L7,214@9580L467,235@10256L318,252@10976L530,229@10052L3768:BottomSheetScaffold.kt#uh7d8r");
        if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(sheetState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(f) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i3 |= startRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i3 |= startRestartGroup.changed(f2) ? 2048 : 1024;
        }
        if ((i & 57344) == 0) {
            i3 |= startRestartGroup.changed(shape) ? 16384 : 8192;
        }
        if ((i & 458752) == 0) {
            i3 |= startRestartGroup.changed(j) ? 131072 : 65536;
        }
        if ((3670016 & i) == 0) {
            i3 |= startRestartGroup.changed(j2) ? 1048576 : 524288;
        }
        if ((29360128 & i) == 0) {
            i3 |= startRestartGroup.changed(f3) ? 8388608 : 4194304;
        }
        if ((i & 234881024) == 0) {
            i3 |= startRestartGroup.changed(f4) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((i & 1879048192) == 0) {
            i3 |= startRestartGroup.changedInstance(function2) ? 536870912 : 268435456;
        }
        if ((i2 & 14) == 0) {
            i4 = i2 | (startRestartGroup.changedInstance(function3) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i3 & 1533916891) != 306783378 || (i4 & 11) != 2 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-763942484, i3, i4, "androidx.compose.material3.StandardBottomSheet (BottomSheetScaffold.kt:196)");
            }
            startRestartGroup.startReplaceableGroup(773894976);
            ComposerKt.sourceInformation(startRestartGroup, "CC(rememberCoroutineScope)476@19869L144:Effects.kt#9igjgp");
            startRestartGroup.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, startRestartGroup));
                startRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                rememberedValue = compositionScopedCoroutineScopeCanceller;
            }
            startRestartGroup.endReplaceableGroup();
            CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
            startRestartGroup.endReplaceableGroup();
            int i5 = i3;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            float mo588toPx0680j_4 = ((Density) consume).mo588toPx0680j_4(f);
            Orientation orientation = Orientation.Vertical;
            startRestartGroup.startReplaceableGroup(511388516);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
            boolean changed = startRestartGroup.changed(sheetState) | startRestartGroup.changed(coroutineScope);
            int i6 = i4;
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = BottomSheetScaffoldAnchorChangeHandler(sheetState, new BottomSheetScaffoldKt$StandardBottomSheet$anchorChangeHandler$1$1(coroutineScope, sheetState), new BottomSheetScaffoldKt$StandardBottomSheet$anchorChangeHandler$1$2(coroutineScope, sheetState));
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceableGroup();
            AnchorChangeHandler anchorChangeHandler = (AnchorChangeHandler) rememberedValue2;
            Modifier m786requiredHeightInVpY3zN4$default = SizeKt.m786requiredHeightInVpY3zN4$default(SizeKt.fillMaxWidth$default(SizeKt.m802widthInVpY3zN4$default(Modifier.Companion, 0.0f, SheetDefaultsKt.getBottomSheetMaxWidth(), 1, null), 0.0f, 1, null), f, 0.0f, 2, null);
            SwipeableV2State<SheetValue> swipeableState$material3_release = sheetState.getSwipeableState$material3_release();
            startRestartGroup.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
            boolean changed2 = startRestartGroup.changed(swipeableState$material3_release);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (changed2 || rememberedValue3 == Composer.Companion.getEmpty()) {
                rememberedValue3 = SheetDefaultsKt.ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(sheetState, orientation, new BottomSheetScaffoldKt$StandardBottomSheet$1$1(coroutineScope, sheetState));
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            startRestartGroup.endReplaceableGroup();
            Modifier swipeableV2$default = SwipeableV2Kt.swipeableV2$default(NestedScrollModifierKt.nestedScroll$default(m786requiredHeightInVpY3zN4$default, (NestedScrollConnection) rememberedValue3, null, 2, null), sheetState.getSwipeableState$material3_release(), orientation, z, false, null, 24, null);
            SwipeableV2State<SheetValue> swipeableState$material3_release2 = sheetState.getSwipeableState$material3_release();
            Set of = SetsKt.setOf((Object[]) new SheetValue[]{SheetValue.Hidden, SheetValue.PartiallyExpanded, SheetValue.Expanded});
            Float valueOf = Float.valueOf(f2);
            Float valueOf2 = Float.valueOf(mo588toPx0680j_4);
            startRestartGroup.startReplaceableGroup(1618982084);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2,3):Composables.kt#9igjgp");
            boolean changed3 = startRestartGroup.changed(valueOf) | startRestartGroup.changed(sheetState) | startRestartGroup.changed(valueOf2);
            BottomSheetScaffoldKt$StandardBottomSheet$2$1 rememberedValue4 = startRestartGroup.rememberedValue();
            if (changed3 || rememberedValue4 == Composer.Companion.getEmpty()) {
                rememberedValue4 = new BottomSheetScaffoldKt$StandardBottomSheet$2$1(sheetState, f2, mo588toPx0680j_4);
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            startRestartGroup.endReplaceableGroup();
            int i7 = i5 >> 9;
            SurfaceKt.m2067SurfaceT9BRK9s(SwipeableV2Kt.swipeAnchors(swipeableV2$default, swipeableState$material3_release2, of, anchorChangeHandler, (Function2) rememberedValue4), shape, j, j2, f3, f4, null, ComposableLambdaKt.composableLambda(startRestartGroup, -1381492089, true, new BottomSheetScaffoldKt$StandardBottomSheet$3(function2, function3, i6, sheetState, z, coroutineScope, i5)), startRestartGroup, (i7 & 112) | 12582912 | (i7 & 896) | (i7 & 7168) | (57344 & i7) | (i7 & 458752), 64);
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
        endRestartGroup.updateScope(new BottomSheetScaffoldKt$StandardBottomSheet$4(sheetState, f, z, f2, shape, j, j2, f3, f4, function2, function3, i, i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: BottomSheetScaffoldLayout-PxNyym8  reason: not valid java name */
    public static final void m1589BottomSheetScaffoldLayoutPxNyym8(Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> function3, Function3<? super Integer, ? super Composer, ? super Integer, Unit> function32, Function2<? super Composer, ? super Integer, Unit> function22, float f, Function0<Float> function0, SheetState sheetState, long j, long j2, Composer composer, int i) {
        int i2;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(-1120561936);
        ComposerKt.sourceInformation(startRestartGroup, "C(BottomSheetScaffoldLayout)P(4,9!2,8,6:c#ui.unit.Dp,5,7,2:c#ui.graphics.Color,3:c#ui.graphics.Color)328@14299L1935,328@14282L1952:BottomSheetScaffold.kt#uh7d8r");
        int i3 = (i & 14) == 0 ? (startRestartGroup.changed(modifier) ? 4 : 2) | i : i;
        if ((i & 112) == 0) {
            i3 |= startRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i3 |= startRestartGroup.changedInstance(function3) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i3 |= startRestartGroup.changedInstance(function32) ? 2048 : 1024;
        }
        if ((57344 & i) == 0) {
            i3 |= startRestartGroup.changedInstance(function22) ? 16384 : 8192;
        }
        if ((458752 & i) == 0) {
            i3 |= startRestartGroup.changed(f) ? 131072 : 65536;
        }
        if ((3670016 & i) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 1048576 : 524288;
        }
        if ((29360128 & i) == 0) {
            i3 |= startRestartGroup.changed(sheetState) ? 8388608 : 4194304;
        }
        if ((234881024 & i) == 0) {
            i3 |= startRestartGroup.changed(j) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((i & 1879048192) == 0) {
            i3 |= startRestartGroup.changed(j2) ? 536870912 : 268435456;
        }
        if ((i3 & 1533916891) != 306783378 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1120561936, i3, -1, "androidx.compose.material3.BottomSheetScaffoldLayout (BottomSheetScaffold.kt:316)");
            }
            Object[] objArr = {function32, function0, function2, modifier, Color.m3281boximpl(j), Color.m3281boximpl(j2), function3, Dp.m5605boximpl(f), function22, sheetState};
            startRestartGroup.startReplaceableGroup(-568225417);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
            boolean z = false;
            for (int i4 = 0; i4 < 10; i4++) {
                z |= startRestartGroup.changed(objArr[i4]);
            }
            BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1 rememberedValue = startRestartGroup.rememberedValue();
            if (z || rememberedValue == Composer.Companion.getEmpty()) {
                i2 = 0;
                composer2 = startRestartGroup;
                rememberedValue = new BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1(function0, function2, function22, sheetState, function32, i3, modifier, j, j2, function3, f);
                composer2.updateRememberedValue(rememberedValue);
            } else {
                composer2 = startRestartGroup;
                i2 = 0;
            }
            composer2.endReplaceableGroup();
            SubcomposeLayoutKt.SubcomposeLayout(null, (Function2) rememberedValue, composer2, i2, 1);
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
        endRestartGroup.updateScope(new BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2(modifier, function2, function3, function32, function22, f, function0, sheetState, j, j2, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AnchorChangeHandler<SheetValue> BottomSheetScaffoldAnchorChangeHandler(final SheetState sheetState, final Function2<? super SheetValue, ? super Float, Unit> function2, final Function1<? super SheetValue, Unit> function1) {
        return new AnchorChangeHandler<SheetValue>() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$BottomSheetScaffoldAnchorChangeHandler$1

            /* compiled from: BottomSheetScaffold.kt */
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
                if (i == 1 || i == 2) {
                    sheetValue = SheetValue.PartiallyExpanded;
                } else if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                } else {
                    sheetValue = newAnchors.containsKey(SheetValue.Expanded) ? SheetValue.Expanded : SheetValue.PartiallyExpanded;
                }
                if (Intrinsics.areEqual(((Number) MapsKt.getValue(newAnchors, sheetValue)).floatValue(), f)) {
                    return;
                }
                if (SheetState.this.getSwipeableState$material3_release().isAnimationRunning()) {
                    function2.invoke(sheetValue, Float.valueOf(SheetState.this.getSwipeableState$material3_release().getLastVelocity()));
                } else {
                    function1.invoke(sheetValue);
                }
            }
        };
    }
}
