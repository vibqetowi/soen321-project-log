package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.ScrollableDefaults;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.profileinstaller.ProfileVerifier;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ifriend.keychain.cipherStorage.CipherStorageKeystoreRsaEcb;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: LazyGridDsl.kt */
@Metadata(d1 = {"\u0000\u009e\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a~\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\u0017\u0010\u0013\u001a\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00010\u0014¢\u0006\u0002\b\u0016H\u0007¢\u0006\u0002\u0010\u0017\u001a~\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\u0017\u0010\u0013\u001a\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00010\u0014¢\u0006\u0002\b\u0016H\u0007¢\u0006\u0002\u0010\u001a\u001a&\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001dH\u0002\u001a?\u0010!\u001a\u0019\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%0\"¢\u0006\u0002\b\u00162\u0006\u0010\u0019\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\tH\u0003ø\u0001\u0000¢\u0006\u0002\u0010&\u001a?\u0010'\u001a\u0019\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%0\"¢\u0006\u0002\b\u00162\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\tH\u0003ø\u0001\u0000¢\u0006\u0002\u0010(\u001aá\u0001\u0010)\u001a\u00020\u0001\"\u0004\b\u0000\u0010**\u00020\u00152\f\u0010)\u001a\b\u0012\u0004\u0012\u0002H*0+2%\b\n\u0010,\u001a\u001f\u0012\u0013\u0012\u0011H*¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(/\u0012\u0004\u0012\u000200\u0018\u00010\u001420\b\n\u00101\u001a*\u0012\u0004\u0012\u000202\u0012\u0013\u0012\u0011H*¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(/\u0012\u0004\u0012\u000203\u0018\u00010\"¢\u0006\u0002\b\u00162%\b\n\u00104\u001a\u001f\u0012\u0013\u0012\u0011H*¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(/\u0012\u0006\u0012\u0004\u0018\u0001000\u001423\b\u0004\u00105\u001a-\u0012\u0004\u0012\u000206\u0012\u0013\u0012\u0011H*¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(/\u0012\u0004\u0012\u00020\u00010\"¢\u0006\u0002\b7¢\u0006\u0002\b\u0016H\u0086\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0002\u00108\u001aá\u0001\u0010)\u001a\u00020\u0001\"\u0004\b\u0000\u0010**\u00020\u00152\f\u0010)\u001a\b\u0012\u0004\u0012\u0002H*0\u001c2%\b\n\u0010,\u001a\u001f\u0012\u0013\u0012\u0011H*¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(/\u0012\u0004\u0012\u000200\u0018\u00010\u001420\b\n\u00101\u001a*\u0012\u0004\u0012\u000202\u0012\u0013\u0012\u0011H*¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(/\u0012\u0004\u0012\u000203\u0018\u00010\"¢\u0006\u0002\b\u00162%\b\n\u00104\u001a\u001f\u0012\u0013\u0012\u0011H*¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(/\u0012\u0006\u0012\u0004\u0018\u0001000\u001423\b\u0004\u00105\u001a-\u0012\u0004\u0012\u000206\u0012\u0013\u0012\u0011H*¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(/\u0012\u0004\u0012\u00020\u00010\"¢\u0006\u0002\b7¢\u0006\u0002\b\u0016H\u0086\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0002\u00109\u001aµ\u0002\u0010:\u001a\u00020\u0001\"\u0004\b\u0000\u0010**\u00020\u00152\f\u0010)\u001a\b\u0012\u0004\u0012\u0002H*0+2:\b\n\u0010,\u001a4\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(;\u0012\u0013\u0012\u0011H*¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(/\u0012\u0004\u0012\u000200\u0018\u00010\"2E\b\n\u00101\u001a?\u0012\u0004\u0012\u000202\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(;\u0012\u0013\u0012\u0011H*¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(/\u0012\u0004\u0012\u000203\u0018\u00010<¢\u0006\u0002\b\u00162:\b\u0006\u00104\u001a4\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(;\u0012\u0013\u0012\u0011H*¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(/\u0012\u0006\u0012\u0004\u0018\u0001000\"2H\b\u0004\u00105\u001aB\u0012\u0004\u0012\u000206\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(;\u0012\u0013\u0012\u0011H*¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(/\u0012\u0004\u0012\u00020\u00010<¢\u0006\u0002\b7¢\u0006\u0002\b\u0016H\u0086\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0002\u0010=\u001aµ\u0002\u0010:\u001a\u00020\u0001\"\u0004\b\u0000\u0010**\u00020\u00152\f\u0010)\u001a\b\u0012\u0004\u0012\u0002H*0\u001c2:\b\n\u0010,\u001a4\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(;\u0012\u0013\u0012\u0011H*¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(/\u0012\u0004\u0012\u000200\u0018\u00010\"2E\b\n\u00101\u001a?\u0012\u0004\u0012\u000202\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(;\u0012\u0013\u0012\u0011H*¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(/\u0012\u0004\u0012\u000203\u0018\u00010<¢\u0006\u0002\b\u00162:\b\u0006\u00104\u001a4\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(;\u0012\u0013\u0012\u0011H*¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(/\u0012\u0006\u0012\u0004\u0018\u0001000\"2H\b\u0004\u00105\u001aB\u0012\u0004\u0012\u000206\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(;\u0012\u0013\u0012\u0011H*¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(/\u0012\u0004\u0012\u00020\u00010<¢\u0006\u0002\b7¢\u0006\u0002\b\u0016H\u0086\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0002\u0010>\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b\u009920\u0001¨\u0006?"}, d2 = {"LazyHorizontalGrid", "", "rows", "Landroidx/compose/foundation/lazy/grid/GridCells;", "modifier", "Landroidx/compose/ui/Modifier;", "state", "Landroidx/compose/foundation/lazy/grid/LazyGridState;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "reverseLayout", "", "horizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "flingBehavior", "Landroidx/compose/foundation/gestures/FlingBehavior;", "userScrollEnabled", FirebaseAnalytics.Param.CONTENT, "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/grid/LazyGridScope;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/foundation/lazy/grid/GridCells;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/grid/LazyGridState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/gestures/FlingBehavior;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "LazyVerticalGrid", "columns", "(Landroidx/compose/foundation/lazy/grid/GridCells;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/grid/LazyGridState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/gestures/FlingBehavior;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "calculateCellsCrossAxisSizeImpl", "", "", "gridSize", "slotCount", "spacing", "rememberColumnWidthSums", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/foundation/lazy/grid/LazyGridSlots;", "(Landroidx/compose/foundation/lazy/grid/GridCells;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function2;", "rememberRowHeightSums", "(Landroidx/compose/foundation/lazy/grid/GridCells;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function2;", FirebaseAnalytics.Param.ITEMS, ExifInterface.GPS_DIRECTION_TRUE, "", "key", "Lkotlin/ParameterName;", "name", "item", "", TtmlNode.TAG_SPAN, "Landroidx/compose/foundation/lazy/grid/LazyGridItemSpanScope;", "Landroidx/compose/foundation/lazy/grid/GridItemSpan;", "contentType", "itemContent", "Landroidx/compose/foundation/lazy/grid/LazyGridItemScope;", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/foundation/lazy/grid/LazyGridScope;[Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "(Landroidx/compose/foundation/lazy/grid/LazyGridScope;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "itemsIndexed", FirebaseAnalytics.Param.INDEX, "Lkotlin/Function3;", "(Landroidx/compose/foundation/lazy/grid/LazyGridScope;[Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function5;)V", "(Landroidx/compose/foundation/lazy/grid/LazyGridScope;Ljava/util/List;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function5;)V", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LazyGridDslKt {
    /* JADX WARN: Removed duplicated region for block: B:101:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:174:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0113  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LazyVerticalGrid(GridCells columns, Modifier modifier, LazyGridState lazyGridState, PaddingValues paddingValues, boolean z, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, FlingBehavior flingBehavior, boolean z2, Function1<? super LazyGridScope, Unit> content, Composer composer, int i, int i2) {
        int i3;
        Object obj;
        int i4;
        Object obj2;
        int i5;
        boolean z3;
        Object obj3;
        int i6;
        Object obj4;
        int i7;
        int i8;
        Modifier.Companion companion;
        LazyGridState lazyGridState2;
        Arrangement.Vertical vertical2;
        FlingBehavior flingBehavior2;
        boolean z4;
        Object obj5;
        boolean z5;
        PaddingValues paddingValues2;
        Object obj6;
        Arrangement.Horizontal horizontal2;
        FlingBehavior flingBehavior3;
        Composer composer2;
        Modifier modifier2;
        Arrangement.Horizontal horizontal3;
        PaddingValues paddingValues3;
        LazyGridState lazyGridState3;
        boolean z6;
        Arrangement.Vertical vertical3;
        FlingBehavior flingBehavior4;
        boolean z7;
        ScopeUpdateScope endRestartGroup;
        int i9;
        int i10;
        int i11;
        Intrinsics.checkNotNullParameter(columns, "columns");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(1485410512);
        ComposerKt.sourceInformation(startRestartGroup, "C(LazyVerticalGrid)P(!1,5,7,2,6,9,4,3,8)64@2980L23,70@3340L15,75@3468L71,74@3442L481:LazyGridDsl.kt#7791vq");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(columns) ? 4 : 2) | i;
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
                    obj = lazyGridState;
                    if (startRestartGroup.changed(obj)) {
                        i11 = 256;
                        i3 |= i11;
                    }
                } else {
                    obj = lazyGridState;
                }
                i11 = 128;
                i3 |= i11;
            } else {
                obj = lazyGridState;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
            } else if ((i & 7168) == 0) {
                obj2 = paddingValues;
                i3 |= startRestartGroup.changed(obj2) ? 2048 : 1024;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 57344) == 0) {
                    z3 = z;
                    i3 |= startRestartGroup.changed(z3) ? 16384 : 8192;
                    if ((458752 & i) != 0) {
                        if ((i2 & 32) == 0) {
                            obj3 = vertical;
                            if (startRestartGroup.changed(obj3)) {
                                i10 = 131072;
                                i3 |= i10;
                            }
                        } else {
                            obj3 = vertical;
                        }
                        i10 = 65536;
                        i3 |= i10;
                    } else {
                        obj3 = vertical;
                    }
                    i6 = i2 & 64;
                    if (i6 == 0) {
                        i3 |= 1572864;
                        obj4 = horizontal;
                    } else {
                        obj4 = horizontal;
                        if ((i & 3670016) == 0) {
                            i3 |= startRestartGroup.changed(obj4) ? 1048576 : 524288;
                        }
                    }
                    if ((i & 29360128) == 0) {
                        if ((i2 & 128) == 0 && startRestartGroup.changed(flingBehavior)) {
                            i9 = 8388608;
                            i3 |= i9;
                        }
                        i9 = 4194304;
                        i3 |= i9;
                    }
                    i7 = i2 & 256;
                    if (i7 == 0) {
                        i3 |= 100663296;
                    } else if ((i & 234881024) == 0) {
                        i3 |= startRestartGroup.changed(z2) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                    }
                    if ((i2 & 512) != 0) {
                        if ((i & 1879048192) == 0) {
                            i8 = startRestartGroup.changedInstance(content) ? 536870912 : 268435456;
                        }
                        if ((1533916891 & i3) == 306783378 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                companion = i12 != 0 ? Modifier.Companion : modifier;
                                if ((i2 & 4) != 0) {
                                    lazyGridState2 = LazyGridStateKt.rememberLazyGridState(0, 0, startRestartGroup, 0, 3);
                                    i3 &= -897;
                                } else {
                                    lazyGridState2 = obj;
                                }
                                PaddingValues m741PaddingValues0680j_4 = i4 != 0 ? PaddingKt.m741PaddingValues0680j_4(Dp.m5607constructorimpl(0)) : obj2;
                                boolean z8 = i5 == 0 ? z3 : false;
                                if ((i2 & 32) != 0) {
                                    Arrangement arrangement = Arrangement.INSTANCE;
                                    vertical2 = !z8 ? arrangement.getTop() : arrangement.getBottom();
                                    i3 &= -458753;
                                } else {
                                    vertical2 = obj3;
                                }
                                Arrangement.Horizontal start = i6 != 0 ? Arrangement.INSTANCE.getStart() : obj4;
                                if ((i2 & 128) != 0) {
                                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(startRestartGroup, 6);
                                    i3 &= -29360129;
                                } else {
                                    flingBehavior2 = flingBehavior;
                                }
                                z4 = i7 != 0 ? true : z2;
                                obj5 = lazyGridState2;
                                z5 = z8;
                                paddingValues2 = m741PaddingValues0680j_4;
                                obj6 = vertical2;
                                horizontal2 = start;
                                flingBehavior3 = flingBehavior2;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i2 & 4) != 0) {
                                    i3 &= -897;
                                }
                                if ((i2 & 32) != 0) {
                                    i3 &= -458753;
                                }
                                if ((i2 & 128) != 0) {
                                    i3 &= -29360129;
                                }
                                companion = modifier;
                                flingBehavior3 = flingBehavior;
                                z4 = z2;
                                obj5 = obj;
                                z5 = z3;
                                obj6 = obj3;
                                paddingValues2 = obj2;
                                horizontal2 = obj4;
                            }
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1485410512, i3, -1, "androidx.compose.foundation.lazy.grid.LazyVerticalGrid (LazyGridDsl.kt:61)");
                            }
                            int i13 = i3 >> 3;
                            Function2<Density, Constraints, LazyGridSlots> rememberColumnWidthSums = rememberColumnWidthSums(columns, horizontal2, paddingValues2, startRestartGroup, (i3 & 14) | ((i3 >> 15) & 112) | (i13 & 896));
                            int i14 = (i13 & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i13 & 112) | (i3 & 7168) | (57344 & i3) | (i13 & 3670016) | (i13 & 29360128);
                            int i15 = i3 << 9;
                            Arrangement.Horizontal horizontal4 = horizontal2;
                            PaddingValues paddingValues4 = paddingValues2;
                            composer2 = startRestartGroup;
                            LazyGridKt.LazyGrid(companion, obj5, rememberColumnWidthSums, paddingValues2, z5, true, flingBehavior3, z4, obj6, horizontal2, content, startRestartGroup, i14 | (i15 & 234881024) | (i15 & 1879048192), (i3 >> 27) & 14, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier2 = companion;
                            horizontal3 = horizontal4;
                            paddingValues3 = paddingValues4;
                            lazyGridState3 = obj5;
                            z6 = z5;
                            vertical3 = obj6;
                            flingBehavior4 = flingBehavior3;
                            z7 = z4;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier2 = modifier;
                            z7 = z2;
                            lazyGridState3 = obj;
                            paddingValues3 = obj2;
                            horizontal3 = obj4;
                            z6 = z3;
                            vertical3 = obj3;
                            composer2 = startRestartGroup;
                            flingBehavior4 = flingBehavior;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                            return;
                        }
                        endRestartGroup.updateScope(new LazyGridDslKt$LazyVerticalGrid$1(columns, modifier2, lazyGridState3, paddingValues3, z6, vertical3, horizontal3, flingBehavior4, z7, content, i, i2));
                        return;
                    }
                    i8 = C.ENCODING_PCM_32BIT;
                    i3 |= i8;
                    if ((1533916891 & i3) == 306783378) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i12 != 0) {
                    }
                    if ((i2 & 4) != 0) {
                    }
                    if (i4 != 0) {
                    }
                    if (i5 == 0) {
                    }
                    if ((i2 & 32) != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if ((i2 & 128) != 0) {
                    }
                    if (i7 != 0) {
                    }
                    obj5 = lazyGridState2;
                    z5 = z8;
                    paddingValues2 = m741PaddingValues0680j_4;
                    obj6 = vertical2;
                    horizontal2 = start;
                    flingBehavior3 = flingBehavior2;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    int i132 = i3 >> 3;
                    Function2<Density, Constraints, LazyGridSlots> rememberColumnWidthSums2 = rememberColumnWidthSums(columns, horizontal2, paddingValues2, startRestartGroup, (i3 & 14) | ((i3 >> 15) & 112) | (i132 & 896));
                    int i142 = (i132 & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i132 & 112) | (i3 & 7168) | (57344 & i3) | (i132 & 3670016) | (i132 & 29360128);
                    int i152 = i3 << 9;
                    Arrangement.Horizontal horizontal42 = horizontal2;
                    PaddingValues paddingValues42 = paddingValues2;
                    composer2 = startRestartGroup;
                    LazyGridKt.LazyGrid(companion, obj5, rememberColumnWidthSums2, paddingValues2, z5, true, flingBehavior3, z4, obj6, horizontal2, content, startRestartGroup, i142 | (i152 & 234881024) | (i152 & 1879048192), (i3 >> 27) & 14, 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier2 = companion;
                    horizontal3 = horizontal42;
                    paddingValues3 = paddingValues42;
                    lazyGridState3 = obj5;
                    z6 = z5;
                    vertical3 = obj6;
                    flingBehavior4 = flingBehavior3;
                    z7 = z4;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                z3 = z;
                if ((458752 & i) != 0) {
                }
                i6 = i2 & 64;
                if (i6 == 0) {
                }
                if ((i & 29360128) == 0) {
                }
                i7 = i2 & 256;
                if (i7 == 0) {
                }
                if ((i2 & 512) != 0) {
                }
                i3 |= i8;
                if ((1533916891 & i3) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i12 != 0) {
                }
                if ((i2 & 4) != 0) {
                }
                if (i4 != 0) {
                }
                if (i5 == 0) {
                }
                if ((i2 & 32) != 0) {
                }
                if (i6 != 0) {
                }
                if ((i2 & 128) != 0) {
                }
                if (i7 != 0) {
                }
                obj5 = lazyGridState2;
                z5 = z8;
                paddingValues2 = m741PaddingValues0680j_4;
                obj6 = vertical2;
                horizontal2 = start;
                flingBehavior3 = flingBehavior2;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                int i1322 = i3 >> 3;
                Function2<Density, Constraints, LazyGridSlots> rememberColumnWidthSums22 = rememberColumnWidthSums(columns, horizontal2, paddingValues2, startRestartGroup, (i3 & 14) | ((i3 >> 15) & 112) | (i1322 & 896));
                int i1422 = (i1322 & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i1322 & 112) | (i3 & 7168) | (57344 & i3) | (i1322 & 3670016) | (i1322 & 29360128);
                int i1522 = i3 << 9;
                Arrangement.Horizontal horizontal422 = horizontal2;
                PaddingValues paddingValues422 = paddingValues2;
                composer2 = startRestartGroup;
                LazyGridKt.LazyGrid(companion, obj5, rememberColumnWidthSums22, paddingValues2, z5, true, flingBehavior3, z4, obj6, horizontal2, content, startRestartGroup, i1422 | (i1522 & 234881024) | (i1522 & 1879048192), (i3 >> 27) & 14, 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier2 = companion;
                horizontal3 = horizontal422;
                paddingValues3 = paddingValues422;
                lazyGridState3 = obj5;
                z6 = z5;
                vertical3 = obj6;
                flingBehavior4 = flingBehavior3;
                z7 = z4;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            obj2 = paddingValues;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            z3 = z;
            if ((458752 & i) != 0) {
            }
            i6 = i2 & 64;
            if (i6 == 0) {
            }
            if ((i & 29360128) == 0) {
            }
            i7 = i2 & 256;
            if (i7 == 0) {
            }
            if ((i2 & 512) != 0) {
            }
            i3 |= i8;
            if ((1533916891 & i3) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i12 != 0) {
            }
            if ((i2 & 4) != 0) {
            }
            if (i4 != 0) {
            }
            if (i5 == 0) {
            }
            if ((i2 & 32) != 0) {
            }
            if (i6 != 0) {
            }
            if ((i2 & 128) != 0) {
            }
            if (i7 != 0) {
            }
            obj5 = lazyGridState2;
            z5 = z8;
            paddingValues2 = m741PaddingValues0680j_4;
            obj6 = vertical2;
            horizontal2 = start;
            flingBehavior3 = flingBehavior2;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            int i13222 = i3 >> 3;
            Function2<Density, Constraints, LazyGridSlots> rememberColumnWidthSums222 = rememberColumnWidthSums(columns, horizontal2, paddingValues2, startRestartGroup, (i3 & 14) | ((i3 >> 15) & 112) | (i13222 & 896));
            int i14222 = (i13222 & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i13222 & 112) | (i3 & 7168) | (57344 & i3) | (i13222 & 3670016) | (i13222 & 29360128);
            int i15222 = i3 << 9;
            Arrangement.Horizontal horizontal4222 = horizontal2;
            PaddingValues paddingValues4222 = paddingValues2;
            composer2 = startRestartGroup;
            LazyGridKt.LazyGrid(companion, obj5, rememberColumnWidthSums222, paddingValues2, z5, true, flingBehavior3, z4, obj6, horizontal2, content, startRestartGroup, i14222 | (i15222 & 234881024) | (i15222 & 1879048192), (i3 >> 27) & 14, 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier2 = companion;
            horizontal3 = horizontal4222;
            paddingValues3 = paddingValues4222;
            lazyGridState3 = obj5;
            z6 = z5;
            vertical3 = obj6;
            flingBehavior4 = flingBehavior3;
            z7 = z4;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        if ((i & 896) != 0) {
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        obj2 = paddingValues;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        z3 = z;
        if ((458752 & i) != 0) {
        }
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        if ((i & 29360128) == 0) {
        }
        i7 = i2 & 256;
        if (i7 == 0) {
        }
        if ((i2 & 512) != 0) {
        }
        i3 |= i8;
        if ((1533916891 & i3) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i12 != 0) {
        }
        if ((i2 & 4) != 0) {
        }
        if (i4 != 0) {
        }
        if (i5 == 0) {
        }
        if ((i2 & 32) != 0) {
        }
        if (i6 != 0) {
        }
        if ((i2 & 128) != 0) {
        }
        if (i7 != 0) {
        }
        obj5 = lazyGridState2;
        z5 = z8;
        paddingValues2 = m741PaddingValues0680j_4;
        obj6 = vertical2;
        horizontal2 = start;
        flingBehavior3 = flingBehavior2;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        int i132222 = i3 >> 3;
        Function2<Density, Constraints, LazyGridSlots> rememberColumnWidthSums2222 = rememberColumnWidthSums(columns, horizontal2, paddingValues2, startRestartGroup, (i3 & 14) | ((i3 >> 15) & 112) | (i132222 & 896));
        int i142222 = (i132222 & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i132222 & 112) | (i3 & 7168) | (57344 & i3) | (i132222 & 3670016) | (i132222 & 29360128);
        int i152222 = i3 << 9;
        Arrangement.Horizontal horizontal42222 = horizontal2;
        PaddingValues paddingValues42222 = paddingValues2;
        composer2 = startRestartGroup;
        LazyGridKt.LazyGrid(companion, obj5, rememberColumnWidthSums2222, paddingValues2, z5, true, flingBehavior3, z4, obj6, horizontal2, content, startRestartGroup, i142222 | (i152222 & 234881024) | (i152222 & 1879048192), (i3 >> 27) & 14, 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier2 = companion;
        horizontal3 = horizontal42222;
        paddingValues3 = paddingValues42222;
        lazyGridState3 = obj5;
        z6 = z5;
        vertical3 = obj6;
        flingBehavior4 = flingBehavior3;
        z7 = z4;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:174:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0113  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LazyHorizontalGrid(GridCells rows, Modifier modifier, LazyGridState lazyGridState, PaddingValues paddingValues, boolean z, Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, FlingBehavior flingBehavior, boolean z2, Function1<? super LazyGridScope, Unit> content, Composer composer, int i, int i2) {
        int i3;
        Object obj;
        int i4;
        Object obj2;
        int i5;
        boolean z3;
        Object obj3;
        int i6;
        Object obj4;
        int i7;
        int i8;
        Modifier.Companion companion;
        LazyGridState lazyGridState2;
        Arrangement.Horizontal horizontal2;
        FlingBehavior flingBehavior2;
        boolean z4;
        Object obj5;
        boolean z5;
        PaddingValues paddingValues2;
        Object obj6;
        Arrangement.Vertical vertical2;
        FlingBehavior flingBehavior3;
        Composer composer2;
        Modifier modifier2;
        Arrangement.Vertical vertical3;
        PaddingValues paddingValues3;
        LazyGridState lazyGridState3;
        boolean z6;
        Arrangement.Horizontal horizontal3;
        FlingBehavior flingBehavior4;
        boolean z7;
        ScopeUpdateScope endRestartGroup;
        int i9;
        int i10;
        int i11;
        Intrinsics.checkNotNullParameter(rows, "rows");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(2123608858);
        ComposerKt.sourceInformation(startRestartGroup, "C(LazyHorizontalGrid)P(6,4,7,1,5,3,9,2,8)117@5477L23,123@5834L15,128@5962L64,127@5936L475:LazyGridDsl.kt#7791vq");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(rows) ? 4 : 2) | i;
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
                    obj = lazyGridState;
                    if (startRestartGroup.changed(obj)) {
                        i11 = 256;
                        i3 |= i11;
                    }
                } else {
                    obj = lazyGridState;
                }
                i11 = 128;
                i3 |= i11;
            } else {
                obj = lazyGridState;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
            } else if ((i & 7168) == 0) {
                obj2 = paddingValues;
                i3 |= startRestartGroup.changed(obj2) ? 2048 : 1024;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 57344) == 0) {
                    z3 = z;
                    i3 |= startRestartGroup.changed(z3) ? 16384 : 8192;
                    if ((458752 & i) != 0) {
                        if ((i2 & 32) == 0) {
                            obj3 = horizontal;
                            if (startRestartGroup.changed(obj3)) {
                                i10 = 131072;
                                i3 |= i10;
                            }
                        } else {
                            obj3 = horizontal;
                        }
                        i10 = 65536;
                        i3 |= i10;
                    } else {
                        obj3 = horizontal;
                    }
                    i6 = i2 & 64;
                    if (i6 == 0) {
                        i3 |= 1572864;
                        obj4 = vertical;
                    } else {
                        obj4 = vertical;
                        if ((i & 3670016) == 0) {
                            i3 |= startRestartGroup.changed(obj4) ? 1048576 : 524288;
                        }
                    }
                    if ((i & 29360128) == 0) {
                        if ((i2 & 128) == 0 && startRestartGroup.changed(flingBehavior)) {
                            i9 = 8388608;
                            i3 |= i9;
                        }
                        i9 = 4194304;
                        i3 |= i9;
                    }
                    i7 = i2 & 256;
                    if (i7 == 0) {
                        i3 |= 100663296;
                    } else if ((i & 234881024) == 0) {
                        i3 |= startRestartGroup.changed(z2) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                    }
                    if ((i2 & 512) != 0) {
                        if ((i & 1879048192) == 0) {
                            i8 = startRestartGroup.changedInstance(content) ? 536870912 : 268435456;
                        }
                        if ((1533916891 & i3) == 306783378 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                companion = i12 != 0 ? Modifier.Companion : modifier;
                                if ((i2 & 4) != 0) {
                                    lazyGridState2 = LazyGridStateKt.rememberLazyGridState(0, 0, startRestartGroup, 0, 3);
                                    i3 &= -897;
                                } else {
                                    lazyGridState2 = obj;
                                }
                                PaddingValues m741PaddingValues0680j_4 = i4 != 0 ? PaddingKt.m741PaddingValues0680j_4(Dp.m5607constructorimpl(0)) : obj2;
                                boolean z8 = i5 == 0 ? z3 : false;
                                if ((i2 & 32) != 0) {
                                    Arrangement arrangement = Arrangement.INSTANCE;
                                    horizontal2 = !z8 ? arrangement.getStart() : arrangement.getEnd();
                                    i3 &= -458753;
                                } else {
                                    horizontal2 = obj3;
                                }
                                Arrangement.Vertical top = i6 != 0 ? Arrangement.INSTANCE.getTop() : obj4;
                                if ((i2 & 128) != 0) {
                                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(startRestartGroup, 6);
                                    i3 &= -29360129;
                                } else {
                                    flingBehavior2 = flingBehavior;
                                }
                                z4 = i7 != 0 ? true : z2;
                                obj5 = lazyGridState2;
                                z5 = z8;
                                paddingValues2 = m741PaddingValues0680j_4;
                                obj6 = horizontal2;
                                vertical2 = top;
                                flingBehavior3 = flingBehavior2;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i2 & 4) != 0) {
                                    i3 &= -897;
                                }
                                if ((i2 & 32) != 0) {
                                    i3 &= -458753;
                                }
                                if ((i2 & 128) != 0) {
                                    i3 &= -29360129;
                                }
                                companion = modifier;
                                flingBehavior3 = flingBehavior;
                                z4 = z2;
                                obj5 = obj;
                                z5 = z3;
                                obj6 = obj3;
                                paddingValues2 = obj2;
                                vertical2 = obj4;
                            }
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(2123608858, i3, -1, "androidx.compose.foundation.lazy.grid.LazyHorizontalGrid (LazyGridDsl.kt:114)");
                            }
                            int i13 = i3 >> 3;
                            Arrangement.Vertical vertical4 = vertical2;
                            PaddingValues paddingValues4 = paddingValues2;
                            composer2 = startRestartGroup;
                            LazyGridKt.LazyGrid(companion, obj5, rememberRowHeightSums(rows, vertical2, paddingValues2, startRestartGroup, (i3 & 14) | ((i3 >> 15) & 112) | (i13 & 896)), paddingValues2, z5, false, flingBehavior3, z4, vertical2, obj6, content, startRestartGroup, (i13 & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i13 & 112) | (i3 & 7168) | (57344 & i3) | (i13 & 3670016) | (i13 & 29360128) | ((i3 << 6) & 234881024) | ((i3 << 12) & 1879048192), (i3 >> 27) & 14, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier2 = companion;
                            vertical3 = vertical4;
                            paddingValues3 = paddingValues4;
                            lazyGridState3 = obj5;
                            z6 = z5;
                            horizontal3 = obj6;
                            flingBehavior4 = flingBehavior3;
                            z7 = z4;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier2 = modifier;
                            z7 = z2;
                            lazyGridState3 = obj;
                            paddingValues3 = obj2;
                            vertical3 = obj4;
                            z6 = z3;
                            horizontal3 = obj3;
                            composer2 = startRestartGroup;
                            flingBehavior4 = flingBehavior;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                            return;
                        }
                        endRestartGroup.updateScope(new LazyGridDslKt$LazyHorizontalGrid$1(rows, modifier2, lazyGridState3, paddingValues3, z6, horizontal3, vertical3, flingBehavior4, z7, content, i, i2));
                        return;
                    }
                    i8 = C.ENCODING_PCM_32BIT;
                    i3 |= i8;
                    if ((1533916891 & i3) == 306783378) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i12 != 0) {
                    }
                    if ((i2 & 4) != 0) {
                    }
                    if (i4 != 0) {
                    }
                    if (i5 == 0) {
                    }
                    if ((i2 & 32) != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if ((i2 & 128) != 0) {
                    }
                    if (i7 != 0) {
                    }
                    obj5 = lazyGridState2;
                    z5 = z8;
                    paddingValues2 = m741PaddingValues0680j_4;
                    obj6 = horizontal2;
                    vertical2 = top;
                    flingBehavior3 = flingBehavior2;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    int i132 = i3 >> 3;
                    Arrangement.Vertical vertical42 = vertical2;
                    PaddingValues paddingValues42 = paddingValues2;
                    composer2 = startRestartGroup;
                    LazyGridKt.LazyGrid(companion, obj5, rememberRowHeightSums(rows, vertical2, paddingValues2, startRestartGroup, (i3 & 14) | ((i3 >> 15) & 112) | (i132 & 896)), paddingValues2, z5, false, flingBehavior3, z4, vertical2, obj6, content, startRestartGroup, (i132 & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i132 & 112) | (i3 & 7168) | (57344 & i3) | (i132 & 3670016) | (i132 & 29360128) | ((i3 << 6) & 234881024) | ((i3 << 12) & 1879048192), (i3 >> 27) & 14, 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier2 = companion;
                    vertical3 = vertical42;
                    paddingValues3 = paddingValues42;
                    lazyGridState3 = obj5;
                    z6 = z5;
                    horizontal3 = obj6;
                    flingBehavior4 = flingBehavior3;
                    z7 = z4;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                z3 = z;
                if ((458752 & i) != 0) {
                }
                i6 = i2 & 64;
                if (i6 == 0) {
                }
                if ((i & 29360128) == 0) {
                }
                i7 = i2 & 256;
                if (i7 == 0) {
                }
                if ((i2 & 512) != 0) {
                }
                i3 |= i8;
                if ((1533916891 & i3) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i12 != 0) {
                }
                if ((i2 & 4) != 0) {
                }
                if (i4 != 0) {
                }
                if (i5 == 0) {
                }
                if ((i2 & 32) != 0) {
                }
                if (i6 != 0) {
                }
                if ((i2 & 128) != 0) {
                }
                if (i7 != 0) {
                }
                obj5 = lazyGridState2;
                z5 = z8;
                paddingValues2 = m741PaddingValues0680j_4;
                obj6 = horizontal2;
                vertical2 = top;
                flingBehavior3 = flingBehavior2;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                int i1322 = i3 >> 3;
                Arrangement.Vertical vertical422 = vertical2;
                PaddingValues paddingValues422 = paddingValues2;
                composer2 = startRestartGroup;
                LazyGridKt.LazyGrid(companion, obj5, rememberRowHeightSums(rows, vertical2, paddingValues2, startRestartGroup, (i3 & 14) | ((i3 >> 15) & 112) | (i1322 & 896)), paddingValues2, z5, false, flingBehavior3, z4, vertical2, obj6, content, startRestartGroup, (i1322 & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i1322 & 112) | (i3 & 7168) | (57344 & i3) | (i1322 & 3670016) | (i1322 & 29360128) | ((i3 << 6) & 234881024) | ((i3 << 12) & 1879048192), (i3 >> 27) & 14, 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier2 = companion;
                vertical3 = vertical422;
                paddingValues3 = paddingValues422;
                lazyGridState3 = obj5;
                z6 = z5;
                horizontal3 = obj6;
                flingBehavior4 = flingBehavior3;
                z7 = z4;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            obj2 = paddingValues;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            z3 = z;
            if ((458752 & i) != 0) {
            }
            i6 = i2 & 64;
            if (i6 == 0) {
            }
            if ((i & 29360128) == 0) {
            }
            i7 = i2 & 256;
            if (i7 == 0) {
            }
            if ((i2 & 512) != 0) {
            }
            i3 |= i8;
            if ((1533916891 & i3) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i12 != 0) {
            }
            if ((i2 & 4) != 0) {
            }
            if (i4 != 0) {
            }
            if (i5 == 0) {
            }
            if ((i2 & 32) != 0) {
            }
            if (i6 != 0) {
            }
            if ((i2 & 128) != 0) {
            }
            if (i7 != 0) {
            }
            obj5 = lazyGridState2;
            z5 = z8;
            paddingValues2 = m741PaddingValues0680j_4;
            obj6 = horizontal2;
            vertical2 = top;
            flingBehavior3 = flingBehavior2;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            int i13222 = i3 >> 3;
            Arrangement.Vertical vertical4222 = vertical2;
            PaddingValues paddingValues4222 = paddingValues2;
            composer2 = startRestartGroup;
            LazyGridKt.LazyGrid(companion, obj5, rememberRowHeightSums(rows, vertical2, paddingValues2, startRestartGroup, (i3 & 14) | ((i3 >> 15) & 112) | (i13222 & 896)), paddingValues2, z5, false, flingBehavior3, z4, vertical2, obj6, content, startRestartGroup, (i13222 & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i13222 & 112) | (i3 & 7168) | (57344 & i3) | (i13222 & 3670016) | (i13222 & 29360128) | ((i3 << 6) & 234881024) | ((i3 << 12) & 1879048192), (i3 >> 27) & 14, 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier2 = companion;
            vertical3 = vertical4222;
            paddingValues3 = paddingValues4222;
            lazyGridState3 = obj5;
            z6 = z5;
            horizontal3 = obj6;
            flingBehavior4 = flingBehavior3;
            z7 = z4;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        if ((i & 896) != 0) {
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        obj2 = paddingValues;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        z3 = z;
        if ((458752 & i) != 0) {
        }
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        if ((i & 29360128) == 0) {
        }
        i7 = i2 & 256;
        if (i7 == 0) {
        }
        if ((i2 & 512) != 0) {
        }
        i3 |= i8;
        if ((1533916891 & i3) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i12 != 0) {
        }
        if ((i2 & 4) != 0) {
        }
        if (i4 != 0) {
        }
        if (i5 == 0) {
        }
        if ((i2 & 32) != 0) {
        }
        if (i6 != 0) {
        }
        if ((i2 & 128) != 0) {
        }
        if (i7 != 0) {
        }
        obj5 = lazyGridState2;
        z5 = z8;
        paddingValues2 = m741PaddingValues0680j_4;
        obj6 = horizontal2;
        vertical2 = top;
        flingBehavior3 = flingBehavior2;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        int i132222 = i3 >> 3;
        Arrangement.Vertical vertical42222 = vertical2;
        PaddingValues paddingValues42222 = paddingValues2;
        composer2 = startRestartGroup;
        LazyGridKt.LazyGrid(companion, obj5, rememberRowHeightSums(rows, vertical2, paddingValues2, startRestartGroup, (i3 & 14) | ((i3 >> 15) & 112) | (i132222 & 896)), paddingValues2, z5, false, flingBehavior3, z4, vertical2, obj6, content, startRestartGroup, (i132222 & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i132222 & 112) | (i3 & 7168) | (57344 & i3) | (i132222 & 3670016) | (i132222 & 29360128) | ((i3 << 6) & 234881024) | ((i3 << 12) & 1879048192), (i3 >> 27) & 14, 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier2 = companion;
        vertical3 = vertical42222;
        paddingValues3 = paddingValues42222;
        lazyGridState3 = obj5;
        z6 = z5;
        horizontal3 = obj6;
        flingBehavior4 = flingBehavior3;
        z7 = z4;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    private static final Function2<Density, Constraints, LazyGridSlots> rememberColumnWidthSums(GridCells gridCells, Arrangement.Horizontal horizontal, PaddingValues paddingValues, Composer composer, int i) {
        composer.startReplaceableGroup(-1355301804);
        ComposerKt.sourceInformation(composer, "C(rememberColumnWidthSums)P(!1,2)148@6622L992:LazyGridDsl.kt#7791vq");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1355301804, i, -1, "androidx.compose.foundation.lazy.grid.rememberColumnWidthSums (LazyGridDsl.kt:144)");
        }
        composer.startReplaceableGroup(1618982084);
        ComposerKt.sourceInformation(composer, "CC(remember)P(1,2,3):Composables.kt#9igjgp");
        boolean changed = composer.changed(gridCells) | composer.changed(horizontal) | composer.changed(paddingValues);
        GridSlotCache rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new GridSlotCache(new LazyGridDslKt$rememberColumnWidthSums$1$1(paddingValues, gridCells, horizontal));
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        Function2<Density, Constraints, LazyGridSlots> function2 = (Function2) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return function2;
    }

    private static final Function2<Density, Constraints, LazyGridSlots> rememberRowHeightSums(GridCells gridCells, Arrangement.Vertical vertical, PaddingValues paddingValues, Composer composer, int i) {
        composer.startReplaceableGroup(239683573);
        ComposerKt.sourceInformation(composer, "C(rememberRowHeightSums)P(1,2)181@7812L926:LazyGridDsl.kt#7791vq");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(239683573, i, -1, "androidx.compose.foundation.lazy.grid.rememberRowHeightSums (LazyGridDsl.kt:177)");
        }
        composer.startReplaceableGroup(1618982084);
        ComposerKt.sourceInformation(composer, "CC(remember)P(1,2,3):Composables.kt#9igjgp");
        boolean changed = composer.changed(gridCells) | composer.changed(vertical) | composer.changed(paddingValues);
        GridSlotCache rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new GridSlotCache(new LazyGridDslKt$rememberRowHeightSums$1$1(paddingValues, gridCells, vertical));
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        Function2<Density, Constraints, LazyGridSlots> function2 = (Function2) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return function2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Integer> calculateCellsCrossAxisSizeImpl(int i, int i2, int i3) {
        int i4 = i - (i3 * (i2 - 1));
        int i5 = i4 / i2;
        int i6 = i4 % i2;
        ArrayList arrayList = new ArrayList(i2);
        int i7 = 0;
        while (i7 < i2) {
            arrayList.add(Integer.valueOf((i7 < i6 ? 1 : 0) + i5));
            i7++;
        }
        return arrayList;
    }

    public static /* synthetic */ void items$default(LazyGridScope lazyGridScope, List items, Function1 function1, Function2 function2, Function1 contentType, Function4 itemContent, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        if ((i & 4) != 0) {
            function2 = null;
        }
        if ((i & 8) != 0) {
            contentType = LazyGridDslKt$items$1.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(lazyGridScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyGridScope.items(items.size(), function1 != null ? new LazyGridDslKt$items$2(function1, items) : null, function2 != null ? new LazyGridDslKt$items$3(function2, items) : null, new LazyGridDslKt$items$4(contentType, items), ComposableLambdaKt.composableLambdaInstance(699646206, true, new LazyGridDslKt$items$5(itemContent, items)));
    }

    public static final <T> void items(LazyGridScope lazyGridScope, List<? extends T> items, Function1<? super T, ? extends Object> function1, Function2<? super LazyGridItemSpanScope, ? super T, GridItemSpan> function2, Function1<? super T, ? extends Object> contentType, Function4<? super LazyGridItemScope, ? super T, ? super Composer, ? super Integer, Unit> itemContent) {
        Intrinsics.checkNotNullParameter(lazyGridScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyGridScope.items(items.size(), function1 != null ? new LazyGridDslKt$items$2(function1, items) : null, function2 != null ? new LazyGridDslKt$items$3(function2, items) : null, new LazyGridDslKt$items$4(contentType, items), ComposableLambdaKt.composableLambdaInstance(699646206, true, new LazyGridDslKt$items$5(itemContent, items)));
    }

    public static /* synthetic */ void itemsIndexed$default(LazyGridScope lazyGridScope, List items, Function2 function2, Function3 function3, Function2 contentType, Function5 itemContent, int i, Object obj) {
        if ((i & 2) != 0) {
            function2 = null;
        }
        if ((i & 4) != 0) {
            function3 = null;
        }
        if ((i & 8) != 0) {
            contentType = LazyGridDslKt$itemsIndexed$1.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(lazyGridScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyGridScope.items(items.size(), function2 != null ? new LazyGridDslKt$itemsIndexed$2(function2, items) : null, function3 != null ? new LazyGridDslKt$itemsIndexed$3(function3, items) : null, new LazyGridDslKt$itemsIndexed$4(contentType, items), ComposableLambdaKt.composableLambdaInstance(1229287273, true, new LazyGridDslKt$itemsIndexed$5(itemContent, items)));
    }

    public static final <T> void itemsIndexed(LazyGridScope lazyGridScope, List<? extends T> items, Function2<? super Integer, ? super T, ? extends Object> function2, Function3<? super LazyGridItemSpanScope, ? super Integer, ? super T, GridItemSpan> function3, Function2<? super Integer, ? super T, ? extends Object> contentType, Function5<? super LazyGridItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, Unit> itemContent) {
        Intrinsics.checkNotNullParameter(lazyGridScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyGridScope.items(items.size(), function2 != null ? new LazyGridDslKt$itemsIndexed$2(function2, items) : null, function3 != null ? new LazyGridDslKt$itemsIndexed$3(function3, items) : null, new LazyGridDslKt$itemsIndexed$4(contentType, items), ComposableLambdaKt.composableLambdaInstance(1229287273, true, new LazyGridDslKt$itemsIndexed$5(itemContent, items)));
    }

    public static /* synthetic */ void items$default(LazyGridScope lazyGridScope, Object[] items, Function1 function1, Function2 function2, Function1 contentType, Function4 itemContent, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        if ((i & 4) != 0) {
            function2 = null;
        }
        if ((i & 8) != 0) {
            contentType = LazyGridDslKt$items$6.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(lazyGridScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyGridScope.items(items.length, function1 != null ? new LazyGridDslKt$items$7(function1, items) : null, function2 != null ? new LazyGridDslKt$items$8(function2, items) : null, new LazyGridDslKt$items$9(contentType, items), ComposableLambdaKt.composableLambdaInstance(407562193, true, new LazyGridDslKt$items$10(itemContent, items)));
    }

    public static final <T> void items(LazyGridScope lazyGridScope, T[] items, Function1<? super T, ? extends Object> function1, Function2<? super LazyGridItemSpanScope, ? super T, GridItemSpan> function2, Function1<? super T, ? extends Object> contentType, Function4<? super LazyGridItemScope, ? super T, ? super Composer, ? super Integer, Unit> itemContent) {
        Intrinsics.checkNotNullParameter(lazyGridScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyGridScope.items(items.length, function1 != null ? new LazyGridDslKt$items$7(function1, items) : null, function2 != null ? new LazyGridDslKt$items$8(function2, items) : null, new LazyGridDslKt$items$9(contentType, items), ComposableLambdaKt.composableLambdaInstance(407562193, true, new LazyGridDslKt$items$10(itemContent, items)));
    }

    public static /* synthetic */ void itemsIndexed$default(LazyGridScope lazyGridScope, Object[] items, Function2 function2, Function3 function3, Function2 contentType, Function5 itemContent, int i, Object obj) {
        if ((i & 2) != 0) {
            function2 = null;
        }
        if ((i & 4) != 0) {
            function3 = null;
        }
        if ((i & 8) != 0) {
            contentType = LazyGridDslKt$itemsIndexed$6.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(lazyGridScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyGridScope.items(items.length, function2 != null ? new LazyGridDslKt$itemsIndexed$7(function2, items) : null, function3 != null ? new LazyGridDslKt$itemsIndexed$8(function3, items) : null, new LazyGridDslKt$itemsIndexed$9(contentType, items), ComposableLambdaKt.composableLambdaInstance(-911455938, true, new LazyGridDslKt$itemsIndexed$10(itemContent, items)));
    }

    public static final <T> void itemsIndexed(LazyGridScope lazyGridScope, T[] items, Function2<? super Integer, ? super T, ? extends Object> function2, Function3<? super LazyGridItemSpanScope, ? super Integer, ? super T, GridItemSpan> function3, Function2<? super Integer, ? super T, ? extends Object> contentType, Function5<? super LazyGridItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, Unit> itemContent) {
        Intrinsics.checkNotNullParameter(lazyGridScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyGridScope.items(items.length, function2 != null ? new LazyGridDslKt$itemsIndexed$7(function2, items) : null, function3 != null ? new LazyGridDslKt$itemsIndexed$8(function3, items) : null, new LazyGridDslKt$itemsIndexed$9(contentType, items), ComposableLambdaKt.composableLambdaInstance(-911455938, true, new LazyGridDslKt$itemsIndexed$10(itemContent, items)));
    }
}
