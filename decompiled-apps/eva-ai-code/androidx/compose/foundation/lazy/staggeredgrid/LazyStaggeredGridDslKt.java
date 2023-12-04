package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.Orientation;
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
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: LazyStaggeredGridDsl.kt */
@Metadata(d1 = {"\u0000¢\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0086\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\u0017\u0010\u0013\u001a\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00010\u0014¢\u0006\u0002\b\u0016H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0086\u0001\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\u001b\u001a\u00020\u000f2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\u0017\u0010\u0013\u001a\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00010\u0014¢\u0006\u0002\b\u0016H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010\u001f\u001a?\u0010 \u001a\u0019\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$0!¢\u0006\u0002\b\u00162\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\b\u001a\u00020\tH\u0003ø\u0001\u0001¢\u0006\u0002\u0010%\u001a?\u0010&\u001a\u0019\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$0!¢\u0006\u0002\b\u00162\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\tH\u0003ø\u0001\u0001¢\u0006\u0002\u0010'\u001aÓ\u0001\u0010(\u001a\u00020\u0001\"\u0004\b\u0000\u0010)*\u00020\u00152\f\u0010(\u001a\b\u0012\u0004\u0012\u0002H)0*2%\b\n\u0010+\u001a\u001f\u0012\u0013\u0012\u0011H)¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(.\u0012\u0004\u0012\u00020/\u0018\u00010\u00142%\b\u0006\u00100\u001a\u001f\u0012\u0013\u0012\u0011H)¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(.\u0012\u0006\u0012\u0004\u0018\u00010/0\u00142%\b\n\u00101\u001a\u001f\u0012\u0013\u0012\u0011H)¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(.\u0012\u0004\u0012\u000202\u0018\u00010\u001423\b\u0004\u00103\u001a-\u0012\u0004\u0012\u000204\u0012\u0013\u0012\u0011H)¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(.\u0012\u0004\u0012\u00020\u00010!¢\u0006\u0002\b5¢\u0006\u0002\b\u0016H\u0086\bø\u0001\u0002¢\u0006\u0002\u00106\u001aÓ\u0001\u0010(\u001a\u00020\u0001\"\u0004\b\u0000\u0010)*\u00020\u00152\f\u0010(\u001a\b\u0012\u0004\u0012\u0002H)072%\b\n\u0010+\u001a\u001f\u0012\u0013\u0012\u0011H)¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(.\u0012\u0004\u0012\u00020/\u0018\u00010\u00142%\b\u0006\u00100\u001a\u001f\u0012\u0013\u0012\u0011H)¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(.\u0012\u0006\u0012\u0004\u0018\u00010/0\u00142%\b\n\u00101\u001a\u001f\u0012\u0013\u0012\u0011H)¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(.\u0012\u0004\u0012\u000202\u0018\u00010\u001423\b\u0004\u00103\u001a-\u0012\u0004\u0012\u000204\u0012\u0013\u0012\u0011H)¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(.\u0012\u0004\u0012\u00020\u00010!¢\u0006\u0002\b5¢\u0006\u0002\b\u0016H\u0086\bø\u0001\u0002¢\u0006\u0002\u00108\u001a§\u0002\u00109\u001a\u00020\u0001\"\u0004\b\u0000\u0010)*\u00020\u00152\f\u0010(\u001a\b\u0012\u0004\u0012\u0002H)0*2:\b\n\u0010+\u001a4\u0012\u0013\u0012\u00110:¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(;\u0012\u0013\u0012\u0011H)¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(.\u0012\u0004\u0012\u00020/\u0018\u00010!2:\b\u0006\u00100\u001a4\u0012\u0013\u0012\u00110:¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(;\u0012\u0013\u0012\u0011H)¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(.\u0012\u0006\u0012\u0004\u0018\u00010/0!2:\b\n\u00101\u001a4\u0012\u0013\u0012\u00110:¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(;\u0012\u0013\u0012\u0011H)¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(.\u0012\u0004\u0012\u000202\u0018\u00010!2H\b\u0004\u00103\u001aB\u0012\u0004\u0012\u000204\u0012\u0013\u0012\u00110:¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(;\u0012\u0013\u0012\u0011H)¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(.\u0012\u0004\u0012\u00020\u00010<¢\u0006\u0002\b5¢\u0006\u0002\b\u0016H\u0086\bø\u0001\u0002¢\u0006\u0002\u0010=\u001a§\u0002\u00109\u001a\u00020\u0001\"\u0004\b\u0000\u0010)*\u00020\u00152\f\u0010(\u001a\b\u0012\u0004\u0012\u0002H)072:\b\n\u0010+\u001a4\u0012\u0013\u0012\u00110:¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(;\u0012\u0013\u0012\u0011H)¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(.\u0012\u0004\u0012\u00020/\u0018\u00010!2:\b\u0006\u00100\u001a4\u0012\u0013\u0012\u00110:¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(;\u0012\u0013\u0012\u0011H)¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(.\u0012\u0006\u0012\u0004\u0018\u00010/0!2:\b\n\u00101\u001a4\u0012\u0013\u0012\u00110:¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(;\u0012\u0013\u0012\u0011H)¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(.\u0012\u0004\u0012\u000202\u0018\u00010!2H\b\u0004\u00103\u001aB\u0012\u0004\u0012\u000204\u0012\u0013\u0012\u00110:¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(;\u0012\u0013\u0012\u0011H)¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(.\u0012\u0004\u0012\u00020\u00010<¢\u0006\u0002\b5¢\u0006\u0002\b\u0016H\u0086\bø\u0001\u0002¢\u0006\u0002\u0010>\u0082\u0002\u0012\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0005\b\u009920\u0001¨\u0006?"}, d2 = {"LazyHorizontalStaggeredGrid", "", "rows", "Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells;", "modifier", "Landroidx/compose/ui/Modifier;", "state", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "reverseLayout", "", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "horizontalItemSpacing", "Landroidx/compose/ui/unit/Dp;", "flingBehavior", "Landroidx/compose/foundation/gestures/FlingBehavior;", "userScrollEnabled", FirebaseAnalytics.Param.CONTENT, "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;", "Lkotlin/ExtensionFunctionType;", "LazyHorizontalStaggeredGrid-cJHQLPU", "(Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Vertical;FLandroidx/compose/foundation/gestures/FlingBehavior;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "LazyVerticalStaggeredGrid", "columns", "verticalItemSpacing", "horizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "LazyVerticalStaggeredGrid-zadm560", "(Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Landroidx/compose/foundation/layout/PaddingValues;ZFLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/gestures/FlingBehavior;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "rememberColumnSlots", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;", "(Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function2;", "rememberRowSlots", "(Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function2;", FirebaseAnalytics.Param.ITEMS, ExifInterface.GPS_DIRECTION_TRUE, "", "key", "Lkotlin/ParameterName;", "name", "item", "", "contentType", TtmlNode.TAG_SPAN, "Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridItemSpan;", "itemContent", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemScope;", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;[Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "itemsIndexed", "", FirebaseAnalytics.Param.INDEX, "Lkotlin/Function3;", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;[Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function5;)V", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;Ljava/util/List;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function5;)V", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LazyStaggeredGridDslKt {
    /* JADX WARN: Removed duplicated region for block: B:102:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:157:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x011d  */
    /* renamed from: LazyVerticalStaggeredGrid-zadm560  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m927LazyVerticalStaggeredGridzadm560(StaggeredGridCells columns, Modifier modifier, LazyStaggeredGridState lazyStaggeredGridState, PaddingValues paddingValues, boolean z, float f, Arrangement.Horizontal horizontal, FlingBehavior flingBehavior, boolean z2, Function1<? super LazyStaggeredGridScope, Unit> content, Composer composer, int i, int i2) {
        int i3;
        Modifier.Companion companion;
        int i4;
        int i5;
        Object obj;
        int i6;
        boolean z3;
        int i7;
        float f2;
        int i8;
        int i9;
        int i10;
        LazyStaggeredGridState lazyStaggeredGridState2;
        FlingBehavior flingBehavior2;
        boolean z4;
        Arrangement.Horizontal horizontal2;
        LazyStaggeredGridState lazyStaggeredGridState3;
        Object obj2;
        float f3;
        FlingBehavior flingBehavior3;
        boolean z5;
        PaddingValues paddingValues2;
        Composer composer2;
        Modifier modifier2;
        LazyStaggeredGridState lazyStaggeredGridState4;
        Arrangement.Horizontal horizontal3;
        boolean z6;
        PaddingValues paddingValues3;
        float f4;
        FlingBehavior flingBehavior4;
        boolean z7;
        ScopeUpdateScope endRestartGroup;
        int i11;
        Intrinsics.checkNotNullParameter(columns, "columns");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(1695323794);
        ComposerKt.sourceInformation(startRestartGroup, "C(LazyVerticalStaggeredGrid)P(!1,5,7,2,6,9:c#ui.unit.Dp,4,3,8)64@3068L32,69@3365L15,83@3878L67,73@3476L502:LazyStaggeredGridDsl.kt#fzvcnm");
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
            companion = modifier;
            i3 |= startRestartGroup.changed(companion) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 != 0) {
                i3 |= 128;
            }
            i5 = i2 & 8;
            if (i5 == 0) {
                i3 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
            } else if ((i & 7168) == 0) {
                obj = paddingValues;
                i3 |= startRestartGroup.changed(obj) ? 2048 : 1024;
                i6 = i2 & 16;
                if (i6 != 0) {
                    i3 |= 24576;
                } else if ((i & 57344) == 0) {
                    z3 = z;
                    i3 |= startRestartGroup.changed(z3) ? 16384 : 8192;
                    i7 = i2 & 32;
                    if (i7 == 0) {
                        i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        f2 = f;
                    } else {
                        f2 = f;
                        if ((i & 458752) == 0) {
                            i3 |= startRestartGroup.changed(f2) ? 131072 : 65536;
                        }
                    }
                    i8 = i2 & 64;
                    if (i8 == 0) {
                        i3 |= 1572864;
                    } else if ((i & 3670016) == 0) {
                        i3 |= startRestartGroup.changed(horizontal) ? 1048576 : 524288;
                    }
                    if ((i & 29360128) == 0) {
                        if ((i2 & 128) == 0 && startRestartGroup.changed(flingBehavior)) {
                            i11 = 8388608;
                            i3 |= i11;
                        }
                        i11 = 4194304;
                        i3 |= i11;
                    }
                    i9 = i2 & 256;
                    if (i9 == 0) {
                        i3 |= 100663296;
                    } else if ((i & 234881024) == 0) {
                        i3 |= startRestartGroup.changed(z2) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                    }
                    if ((i2 & 512) != 0) {
                        if ((1879048192 & i) == 0) {
                            i10 = startRestartGroup.changedInstance(content) ? 536870912 : 268435456;
                        }
                        if (i4 == 4 || (1533916891 & i3) != 306783378 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                if (i12 != 0) {
                                    companion = Modifier.Companion;
                                }
                                if (i4 != 0) {
                                    lazyStaggeredGridState2 = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, startRestartGroup, 0, 3);
                                    i3 &= -897;
                                } else {
                                    lazyStaggeredGridState2 = lazyStaggeredGridState;
                                }
                                PaddingValues m741PaddingValues0680j_4 = i5 != 0 ? PaddingKt.m741PaddingValues0680j_4(Dp.m5607constructorimpl(0)) : obj;
                                if (i6 != 0) {
                                    z3 = false;
                                }
                                float m5607constructorimpl = i7 != 0 ? Dp.m5607constructorimpl(0) : f2;
                                Arrangement.HorizontalOrVertical m655spacedBy0680j_4 = i8 != 0 ? Arrangement.INSTANCE.m655spacedBy0680j_4(Dp.m5607constructorimpl(0)) : horizontal;
                                if ((i2 & 128) != 0) {
                                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(startRestartGroup, 6);
                                    i3 &= -29360129;
                                } else {
                                    flingBehavior2 = flingBehavior;
                                }
                                if (i9 != 0) {
                                    horizontal2 = m655spacedBy0680j_4;
                                    z4 = true;
                                } else {
                                    z4 = z2;
                                    horizontal2 = m655spacedBy0680j_4;
                                }
                                lazyStaggeredGridState3 = lazyStaggeredGridState2;
                                obj2 = companion;
                                f3 = m5607constructorimpl;
                                flingBehavior3 = flingBehavior2;
                                z5 = z3;
                                paddingValues2 = m741PaddingValues0680j_4;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if (i4 != 0) {
                                    i3 &= -897;
                                }
                                if ((i2 & 128) != 0) {
                                    i3 &= -29360129;
                                }
                                lazyStaggeredGridState3 = lazyStaggeredGridState;
                                flingBehavior3 = flingBehavior;
                                z4 = z2;
                                obj2 = companion;
                                f3 = f2;
                                z5 = z3;
                                horizontal2 = horizontal;
                                paddingValues2 = obj;
                            }
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1695323794, i3, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid (LazyStaggeredGridDsl.kt:61)");
                            }
                            int i13 = i3 >> 3;
                            int i14 = i3 << 3;
                            Arrangement.Horizontal horizontal4 = horizontal2;
                            PaddingValues paddingValues4 = paddingValues2;
                            composer2 = startRestartGroup;
                            LazyStaggeredGridKt.m932LazyStaggeredGridLJWHXA8(lazyStaggeredGridState3, Orientation.Vertical, rememberColumnSlots(columns, horizontal2, paddingValues2, startRestartGroup, (i3 & 14) | ((i3 >> 15) & 112) | (i13 & 896)), obj2, paddingValues2, z5, flingBehavior3, z4, f3, horizontal2.mo661getSpacingD9Ej5fM(), content, startRestartGroup, ((i3 << 6) & 7168) | 56 | (57344 & i14) | (i14 & 458752) | (i13 & 3670016) | (i13 & 29360128) | ((i3 << 9) & 234881024), (i3 >> 27) & 14, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier2 = obj2;
                            lazyStaggeredGridState4 = lazyStaggeredGridState3;
                            horizontal3 = horizontal4;
                            z6 = z5;
                            paddingValues3 = paddingValues4;
                            f4 = f3;
                            flingBehavior4 = flingBehavior3;
                            z7 = z4;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            lazyStaggeredGridState4 = lazyStaggeredGridState;
                            horizontal3 = horizontal;
                            flingBehavior4 = flingBehavior;
                            modifier2 = companion;
                            paddingValues3 = obj;
                            f4 = f2;
                            z6 = z3;
                            composer2 = startRestartGroup;
                            z7 = z2;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                            return;
                        }
                        endRestartGroup.updateScope(new LazyStaggeredGridDslKt$LazyVerticalStaggeredGrid$1(columns, modifier2, lazyStaggeredGridState4, paddingValues3, z6, f4, horizontal3, flingBehavior4, z7, content, i, i2));
                        return;
                    }
                    i10 = C.ENCODING_PCM_32BIT;
                    i3 |= i10;
                    if (i4 == 4) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i12 != 0) {
                    }
                    if (i4 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i8 != 0) {
                    }
                    if ((i2 & 128) != 0) {
                    }
                    if (i9 != 0) {
                    }
                    lazyStaggeredGridState3 = lazyStaggeredGridState2;
                    obj2 = companion;
                    f3 = m5607constructorimpl;
                    flingBehavior3 = flingBehavior2;
                    z5 = z3;
                    paddingValues2 = m741PaddingValues0680j_4;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    int i132 = i3 >> 3;
                    int i142 = i3 << 3;
                    Arrangement.Horizontal horizontal42 = horizontal2;
                    PaddingValues paddingValues42 = paddingValues2;
                    composer2 = startRestartGroup;
                    LazyStaggeredGridKt.m932LazyStaggeredGridLJWHXA8(lazyStaggeredGridState3, Orientation.Vertical, rememberColumnSlots(columns, horizontal2, paddingValues2, startRestartGroup, (i3 & 14) | ((i3 >> 15) & 112) | (i132 & 896)), obj2, paddingValues2, z5, flingBehavior3, z4, f3, horizontal2.mo661getSpacingD9Ej5fM(), content, startRestartGroup, ((i3 << 6) & 7168) | 56 | (57344 & i142) | (i142 & 458752) | (i132 & 3670016) | (i132 & 29360128) | ((i3 << 9) & 234881024), (i3 >> 27) & 14, 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier2 = obj2;
                    lazyStaggeredGridState4 = lazyStaggeredGridState3;
                    horizontal3 = horizontal42;
                    z6 = z5;
                    paddingValues3 = paddingValues42;
                    f4 = f3;
                    flingBehavior4 = flingBehavior3;
                    z7 = z4;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                z3 = z;
                i7 = i2 & 32;
                if (i7 == 0) {
                }
                i8 = i2 & 64;
                if (i8 == 0) {
                }
                if ((i & 29360128) == 0) {
                }
                i9 = i2 & 256;
                if (i9 == 0) {
                }
                if ((i2 & 512) != 0) {
                }
                i3 |= i10;
                if (i4 == 4) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i12 != 0) {
                }
                if (i4 != 0) {
                }
                if (i5 != 0) {
                }
                if (i6 != 0) {
                }
                if (i7 != 0) {
                }
                if (i8 != 0) {
                }
                if ((i2 & 128) != 0) {
                }
                if (i9 != 0) {
                }
                lazyStaggeredGridState3 = lazyStaggeredGridState2;
                obj2 = companion;
                f3 = m5607constructorimpl;
                flingBehavior3 = flingBehavior2;
                z5 = z3;
                paddingValues2 = m741PaddingValues0680j_4;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                int i1322 = i3 >> 3;
                int i1422 = i3 << 3;
                Arrangement.Horizontal horizontal422 = horizontal2;
                PaddingValues paddingValues422 = paddingValues2;
                composer2 = startRestartGroup;
                LazyStaggeredGridKt.m932LazyStaggeredGridLJWHXA8(lazyStaggeredGridState3, Orientation.Vertical, rememberColumnSlots(columns, horizontal2, paddingValues2, startRestartGroup, (i3 & 14) | ((i3 >> 15) & 112) | (i1322 & 896)), obj2, paddingValues2, z5, flingBehavior3, z4, f3, horizontal2.mo661getSpacingD9Ej5fM(), content, startRestartGroup, ((i3 << 6) & 7168) | 56 | (57344 & i1422) | (i1422 & 458752) | (i1322 & 3670016) | (i1322 & 29360128) | ((i3 << 9) & 234881024), (i3 >> 27) & 14, 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier2 = obj2;
                lazyStaggeredGridState4 = lazyStaggeredGridState3;
                horizontal3 = horizontal422;
                z6 = z5;
                paddingValues3 = paddingValues422;
                f4 = f3;
                flingBehavior4 = flingBehavior3;
                z7 = z4;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            obj = paddingValues;
            i6 = i2 & 16;
            if (i6 != 0) {
            }
            z3 = z;
            i7 = i2 & 32;
            if (i7 == 0) {
            }
            i8 = i2 & 64;
            if (i8 == 0) {
            }
            if ((i & 29360128) == 0) {
            }
            i9 = i2 & 256;
            if (i9 == 0) {
            }
            if ((i2 & 512) != 0) {
            }
            i3 |= i10;
            if (i4 == 4) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i12 != 0) {
            }
            if (i4 != 0) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            if (i7 != 0) {
            }
            if (i8 != 0) {
            }
            if ((i2 & 128) != 0) {
            }
            if (i9 != 0) {
            }
            lazyStaggeredGridState3 = lazyStaggeredGridState2;
            obj2 = companion;
            f3 = m5607constructorimpl;
            flingBehavior3 = flingBehavior2;
            z5 = z3;
            paddingValues2 = m741PaddingValues0680j_4;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            int i13222 = i3 >> 3;
            int i14222 = i3 << 3;
            Arrangement.Horizontal horizontal4222 = horizontal2;
            PaddingValues paddingValues4222 = paddingValues2;
            composer2 = startRestartGroup;
            LazyStaggeredGridKt.m932LazyStaggeredGridLJWHXA8(lazyStaggeredGridState3, Orientation.Vertical, rememberColumnSlots(columns, horizontal2, paddingValues2, startRestartGroup, (i3 & 14) | ((i3 >> 15) & 112) | (i13222 & 896)), obj2, paddingValues2, z5, flingBehavior3, z4, f3, horizontal2.mo661getSpacingD9Ej5fM(), content, startRestartGroup, ((i3 << 6) & 7168) | 56 | (57344 & i14222) | (i14222 & 458752) | (i13222 & 3670016) | (i13222 & 29360128) | ((i3 << 9) & 234881024), (i3 >> 27) & 14, 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier2 = obj2;
            lazyStaggeredGridState4 = lazyStaggeredGridState3;
            horizontal3 = horizontal4222;
            z6 = z5;
            paddingValues3 = paddingValues4222;
            f4 = f3;
            flingBehavior4 = flingBehavior3;
            z7 = z4;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        companion = modifier;
        i4 = i2 & 4;
        if (i4 != 0) {
        }
        i5 = i2 & 8;
        if (i5 == 0) {
        }
        obj = paddingValues;
        i6 = i2 & 16;
        if (i6 != 0) {
        }
        z3 = z;
        i7 = i2 & 32;
        if (i7 == 0) {
        }
        i8 = i2 & 64;
        if (i8 == 0) {
        }
        if ((i & 29360128) == 0) {
        }
        i9 = i2 & 256;
        if (i9 == 0) {
        }
        if ((i2 & 512) != 0) {
        }
        i3 |= i10;
        if (i4 == 4) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i12 != 0) {
        }
        if (i4 != 0) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        if (i7 != 0) {
        }
        if (i8 != 0) {
        }
        if ((i2 & 128) != 0) {
        }
        if (i9 != 0) {
        }
        lazyStaggeredGridState3 = lazyStaggeredGridState2;
        obj2 = companion;
        f3 = m5607constructorimpl;
        flingBehavior3 = flingBehavior2;
        z5 = z3;
        paddingValues2 = m741PaddingValues0680j_4;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        int i132222 = i3 >> 3;
        int i142222 = i3 << 3;
        Arrangement.Horizontal horizontal42222 = horizontal2;
        PaddingValues paddingValues42222 = paddingValues2;
        composer2 = startRestartGroup;
        LazyStaggeredGridKt.m932LazyStaggeredGridLJWHXA8(lazyStaggeredGridState3, Orientation.Vertical, rememberColumnSlots(columns, horizontal2, paddingValues2, startRestartGroup, (i3 & 14) | ((i3 >> 15) & 112) | (i132222 & 896)), obj2, paddingValues2, z5, flingBehavior3, z4, f3, horizontal2.mo661getSpacingD9Ej5fM(), content, startRestartGroup, ((i3 << 6) & 7168) | 56 | (57344 & i142222) | (i142222 & 458752) | (i132222 & 3670016) | (i132222 & 29360128) | ((i3 << 9) & 234881024), (i3 >> 27) & 14, 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier2 = obj2;
        lazyStaggeredGridState4 = lazyStaggeredGridState3;
        horizontal3 = horizontal42222;
        z6 = z5;
        paddingValues3 = paddingValues42222;
        f4 = f3;
        flingBehavior4 = flingBehavior3;
        z7 = z4;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    private static final Function2<Density, Constraints, LazyStaggeredGridSlots> rememberColumnSlots(StaggeredGridCells staggeredGridCells, Arrangement.Horizontal horizontal, PaddingValues paddingValues, Composer composer, int i) {
        composer.startReplaceableGroup(-1038659655);
        ComposerKt.sourceInformation(composer, "C(rememberColumnSlots)P(!1,2)94@4216L1127:LazyStaggeredGridDsl.kt#fzvcnm");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1038659655, i, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberColumnSlots (LazyStaggeredGridDsl.kt:90)");
        }
        composer.startReplaceableGroup(1618982084);
        ComposerKt.sourceInformation(composer, "CC(remember)P(1,2,3):Composables.kt#9igjgp");
        boolean changed = composer.changed(staggeredGridCells) | composer.changed(horizontal) | composer.changed(paddingValues);
        LazyStaggeredGridSlotCache rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new LazyStaggeredGridSlotCache(new LazyStaggeredGridDslKt$rememberColumnSlots$1$1(paddingValues, staggeredGridCells, horizontal));
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        Function2<Density, Constraints, LazyStaggeredGridSlots> function2 = (Function2) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return function2;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:157:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x011d  */
    /* renamed from: LazyHorizontalStaggeredGrid-cJHQLPU  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m926LazyHorizontalStaggeredGridcJHQLPU(StaggeredGridCells rows, Modifier modifier, LazyStaggeredGridState lazyStaggeredGridState, PaddingValues paddingValues, boolean z, Arrangement.Vertical vertical, float f, FlingBehavior flingBehavior, boolean z2, Function1<? super LazyStaggeredGridScope, Unit> content, Composer composer, int i, int i2) {
        int i3;
        Modifier.Companion companion;
        int i4;
        int i5;
        Object obj;
        int i6;
        boolean z3;
        int i7;
        Object obj2;
        int i8;
        int i9;
        int i10;
        LazyStaggeredGridState lazyStaggeredGridState2;
        FlingBehavior flingBehavior2;
        boolean z4;
        float f2;
        LazyStaggeredGridState lazyStaggeredGridState3;
        Object obj3;
        FlingBehavior flingBehavior3;
        boolean z5;
        PaddingValues paddingValues2;
        Composer composer2;
        Modifier modifier2;
        LazyStaggeredGridState lazyStaggeredGridState4;
        Arrangement.Vertical vertical2;
        boolean z6;
        PaddingValues paddingValues3;
        float f3;
        FlingBehavior flingBehavior4;
        boolean z7;
        ScopeUpdateScope endRestartGroup;
        int i11;
        Intrinsics.checkNotNullParameter(rows, "rows");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-8666074);
        ComposerKt.sourceInformation(startRestartGroup, "C(LazyHorizontalStaggeredGrid)P(6,4,7,1,5,9,3:c#ui.unit.Dp,2,8)154@7006L32,159@7301L15,173@7816L59,163@7412L496:LazyStaggeredGridDsl.kt#fzvcnm");
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
            companion = modifier;
            i3 |= startRestartGroup.changed(companion) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 != 0) {
                i3 |= 128;
            }
            i5 = i2 & 8;
            if (i5 == 0) {
                i3 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
            } else if ((i & 7168) == 0) {
                obj = paddingValues;
                i3 |= startRestartGroup.changed(obj) ? 2048 : 1024;
                i6 = i2 & 16;
                if (i6 != 0) {
                    i3 |= 24576;
                } else if ((i & 57344) == 0) {
                    z3 = z;
                    i3 |= startRestartGroup.changed(z3) ? 16384 : 8192;
                    i7 = i2 & 32;
                    if (i7 == 0) {
                        i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        obj2 = vertical;
                    } else {
                        obj2 = vertical;
                        if ((i & 458752) == 0) {
                            i3 |= startRestartGroup.changed(obj2) ? 131072 : 65536;
                        }
                    }
                    i8 = i2 & 64;
                    if (i8 == 0) {
                        i3 |= 1572864;
                    } else if ((i & 3670016) == 0) {
                        i3 |= startRestartGroup.changed(f) ? 1048576 : 524288;
                    }
                    if ((i & 29360128) == 0) {
                        if ((i2 & 128) == 0 && startRestartGroup.changed(flingBehavior)) {
                            i11 = 8388608;
                            i3 |= i11;
                        }
                        i11 = 4194304;
                        i3 |= i11;
                    }
                    i9 = i2 & 256;
                    if (i9 == 0) {
                        i3 |= 100663296;
                    } else if ((i & 234881024) == 0) {
                        i3 |= startRestartGroup.changed(z2) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                    }
                    if ((i2 & 512) != 0) {
                        if ((1879048192 & i) == 0) {
                            i10 = startRestartGroup.changedInstance(content) ? 536870912 : 268435456;
                        }
                        if (i4 == 4 || (1533916891 & i3) != 306783378 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                if (i12 != 0) {
                                    companion = Modifier.Companion;
                                }
                                if (i4 != 0) {
                                    lazyStaggeredGridState2 = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, startRestartGroup, 0, 3);
                                    i3 &= -897;
                                } else {
                                    lazyStaggeredGridState2 = lazyStaggeredGridState;
                                }
                                PaddingValues m741PaddingValues0680j_4 = i5 != 0 ? PaddingKt.m741PaddingValues0680j_4(Dp.m5607constructorimpl(0)) : obj;
                                if (i6 != 0) {
                                    z3 = false;
                                }
                                Arrangement.HorizontalOrVertical m655spacedBy0680j_4 = i7 != 0 ? Arrangement.INSTANCE.m655spacedBy0680j_4(Dp.m5607constructorimpl(0)) : obj2;
                                float m5607constructorimpl = i8 != 0 ? Dp.m5607constructorimpl(0) : f;
                                if ((i2 & 128) != 0) {
                                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(startRestartGroup, 6);
                                    i3 &= -29360129;
                                } else {
                                    flingBehavior2 = flingBehavior;
                                }
                                if (i9 != 0) {
                                    f2 = m5607constructorimpl;
                                    z4 = true;
                                } else {
                                    z4 = z2;
                                    f2 = m5607constructorimpl;
                                }
                                lazyStaggeredGridState3 = lazyStaggeredGridState2;
                                obj3 = companion;
                                obj2 = m655spacedBy0680j_4;
                                flingBehavior3 = flingBehavior2;
                                z5 = z3;
                                paddingValues2 = m741PaddingValues0680j_4;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if (i4 != 0) {
                                    i3 &= -897;
                                }
                                if ((i2 & 128) != 0) {
                                    i3 &= -29360129;
                                }
                                lazyStaggeredGridState3 = lazyStaggeredGridState;
                                f2 = f;
                                flingBehavior3 = flingBehavior;
                                z4 = z2;
                                obj3 = companion;
                                z5 = z3;
                                paddingValues2 = obj;
                            }
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-8666074, i3, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid (LazyStaggeredGridDsl.kt:151)");
                            }
                            int i13 = i3 >> 3;
                            int i14 = i3 << 6;
                            int i15 = i3 << 3;
                            Arrangement.Vertical vertical3 = obj2;
                            PaddingValues paddingValues4 = paddingValues2;
                            composer2 = startRestartGroup;
                            LazyStaggeredGridKt.m932LazyStaggeredGridLJWHXA8(lazyStaggeredGridState3, Orientation.Horizontal, rememberRowSlots(rows, obj2, paddingValues2, startRestartGroup, (i3 & 14) | ((i3 >> 12) & 112) | (i13 & 896)), obj3, paddingValues2, z5, flingBehavior3, z4, f2, obj2.mo661getSpacingD9Ej5fM(), content, startRestartGroup, (i13 & 29360128) | (i14 & 7168) | 56 | (57344 & i15) | (i15 & 458752) | (i13 & 3670016) | (i14 & 234881024), (i3 >> 27) & 14, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier2 = obj3;
                            lazyStaggeredGridState4 = lazyStaggeredGridState3;
                            vertical2 = vertical3;
                            z6 = z5;
                            paddingValues3 = paddingValues4;
                            f3 = f2;
                            flingBehavior4 = flingBehavior3;
                            z7 = z4;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            lazyStaggeredGridState4 = lazyStaggeredGridState;
                            f3 = f;
                            flingBehavior4 = flingBehavior;
                            modifier2 = companion;
                            paddingValues3 = obj;
                            vertical2 = obj2;
                            z6 = z3;
                            composer2 = startRestartGroup;
                            z7 = z2;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                            return;
                        }
                        endRestartGroup.updateScope(new LazyStaggeredGridDslKt$LazyHorizontalStaggeredGrid$1(rows, modifier2, lazyStaggeredGridState4, paddingValues3, z6, vertical2, f3, flingBehavior4, z7, content, i, i2));
                        return;
                    }
                    i10 = C.ENCODING_PCM_32BIT;
                    i3 |= i10;
                    if (i4 == 4) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i12 != 0) {
                    }
                    if (i4 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i8 != 0) {
                    }
                    if ((i2 & 128) != 0) {
                    }
                    if (i9 != 0) {
                    }
                    lazyStaggeredGridState3 = lazyStaggeredGridState2;
                    obj3 = companion;
                    obj2 = m655spacedBy0680j_4;
                    flingBehavior3 = flingBehavior2;
                    z5 = z3;
                    paddingValues2 = m741PaddingValues0680j_4;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    int i132 = i3 >> 3;
                    int i142 = i3 << 6;
                    int i152 = i3 << 3;
                    Arrangement.Vertical vertical32 = obj2;
                    PaddingValues paddingValues42 = paddingValues2;
                    composer2 = startRestartGroup;
                    LazyStaggeredGridKt.m932LazyStaggeredGridLJWHXA8(lazyStaggeredGridState3, Orientation.Horizontal, rememberRowSlots(rows, obj2, paddingValues2, startRestartGroup, (i3 & 14) | ((i3 >> 12) & 112) | (i132 & 896)), obj3, paddingValues2, z5, flingBehavior3, z4, f2, obj2.mo661getSpacingD9Ej5fM(), content, startRestartGroup, (i132 & 29360128) | (i142 & 7168) | 56 | (57344 & i152) | (i152 & 458752) | (i132 & 3670016) | (i142 & 234881024), (i3 >> 27) & 14, 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier2 = obj3;
                    lazyStaggeredGridState4 = lazyStaggeredGridState3;
                    vertical2 = vertical32;
                    z6 = z5;
                    paddingValues3 = paddingValues42;
                    f3 = f2;
                    flingBehavior4 = flingBehavior3;
                    z7 = z4;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                z3 = z;
                i7 = i2 & 32;
                if (i7 == 0) {
                }
                i8 = i2 & 64;
                if (i8 == 0) {
                }
                if ((i & 29360128) == 0) {
                }
                i9 = i2 & 256;
                if (i9 == 0) {
                }
                if ((i2 & 512) != 0) {
                }
                i3 |= i10;
                if (i4 == 4) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i12 != 0) {
                }
                if (i4 != 0) {
                }
                if (i5 != 0) {
                }
                if (i6 != 0) {
                }
                if (i7 != 0) {
                }
                if (i8 != 0) {
                }
                if ((i2 & 128) != 0) {
                }
                if (i9 != 0) {
                }
                lazyStaggeredGridState3 = lazyStaggeredGridState2;
                obj3 = companion;
                obj2 = m655spacedBy0680j_4;
                flingBehavior3 = flingBehavior2;
                z5 = z3;
                paddingValues2 = m741PaddingValues0680j_4;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                int i1322 = i3 >> 3;
                int i1422 = i3 << 6;
                int i1522 = i3 << 3;
                Arrangement.Vertical vertical322 = obj2;
                PaddingValues paddingValues422 = paddingValues2;
                composer2 = startRestartGroup;
                LazyStaggeredGridKt.m932LazyStaggeredGridLJWHXA8(lazyStaggeredGridState3, Orientation.Horizontal, rememberRowSlots(rows, obj2, paddingValues2, startRestartGroup, (i3 & 14) | ((i3 >> 12) & 112) | (i1322 & 896)), obj3, paddingValues2, z5, flingBehavior3, z4, f2, obj2.mo661getSpacingD9Ej5fM(), content, startRestartGroup, (i1322 & 29360128) | (i1422 & 7168) | 56 | (57344 & i1522) | (i1522 & 458752) | (i1322 & 3670016) | (i1422 & 234881024), (i3 >> 27) & 14, 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier2 = obj3;
                lazyStaggeredGridState4 = lazyStaggeredGridState3;
                vertical2 = vertical322;
                z6 = z5;
                paddingValues3 = paddingValues422;
                f3 = f2;
                flingBehavior4 = flingBehavior3;
                z7 = z4;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            obj = paddingValues;
            i6 = i2 & 16;
            if (i6 != 0) {
            }
            z3 = z;
            i7 = i2 & 32;
            if (i7 == 0) {
            }
            i8 = i2 & 64;
            if (i8 == 0) {
            }
            if ((i & 29360128) == 0) {
            }
            i9 = i2 & 256;
            if (i9 == 0) {
            }
            if ((i2 & 512) != 0) {
            }
            i3 |= i10;
            if (i4 == 4) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i12 != 0) {
            }
            if (i4 != 0) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            if (i7 != 0) {
            }
            if (i8 != 0) {
            }
            if ((i2 & 128) != 0) {
            }
            if (i9 != 0) {
            }
            lazyStaggeredGridState3 = lazyStaggeredGridState2;
            obj3 = companion;
            obj2 = m655spacedBy0680j_4;
            flingBehavior3 = flingBehavior2;
            z5 = z3;
            paddingValues2 = m741PaddingValues0680j_4;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            int i13222 = i3 >> 3;
            int i14222 = i3 << 6;
            int i15222 = i3 << 3;
            Arrangement.Vertical vertical3222 = obj2;
            PaddingValues paddingValues4222 = paddingValues2;
            composer2 = startRestartGroup;
            LazyStaggeredGridKt.m932LazyStaggeredGridLJWHXA8(lazyStaggeredGridState3, Orientation.Horizontal, rememberRowSlots(rows, obj2, paddingValues2, startRestartGroup, (i3 & 14) | ((i3 >> 12) & 112) | (i13222 & 896)), obj3, paddingValues2, z5, flingBehavior3, z4, f2, obj2.mo661getSpacingD9Ej5fM(), content, startRestartGroup, (i13222 & 29360128) | (i14222 & 7168) | 56 | (57344 & i15222) | (i15222 & 458752) | (i13222 & 3670016) | (i14222 & 234881024), (i3 >> 27) & 14, 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier2 = obj3;
            lazyStaggeredGridState4 = lazyStaggeredGridState3;
            vertical2 = vertical3222;
            z6 = z5;
            paddingValues3 = paddingValues4222;
            f3 = f2;
            flingBehavior4 = flingBehavior3;
            z7 = z4;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        companion = modifier;
        i4 = i2 & 4;
        if (i4 != 0) {
        }
        i5 = i2 & 8;
        if (i5 == 0) {
        }
        obj = paddingValues;
        i6 = i2 & 16;
        if (i6 != 0) {
        }
        z3 = z;
        i7 = i2 & 32;
        if (i7 == 0) {
        }
        i8 = i2 & 64;
        if (i8 == 0) {
        }
        if ((i & 29360128) == 0) {
        }
        i9 = i2 & 256;
        if (i9 == 0) {
        }
        if ((i2 & 512) != 0) {
        }
        i3 |= i10;
        if (i4 == 4) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i12 != 0) {
        }
        if (i4 != 0) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        if (i7 != 0) {
        }
        if (i8 != 0) {
        }
        if ((i2 & 128) != 0) {
        }
        if (i9 != 0) {
        }
        lazyStaggeredGridState3 = lazyStaggeredGridState2;
        obj3 = companion;
        obj2 = m655spacedBy0680j_4;
        flingBehavior3 = flingBehavior2;
        z5 = z3;
        paddingValues2 = m741PaddingValues0680j_4;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        int i132222 = i3 >> 3;
        int i142222 = i3 << 6;
        int i152222 = i3 << 3;
        Arrangement.Vertical vertical32222 = obj2;
        PaddingValues paddingValues42222 = paddingValues2;
        composer2 = startRestartGroup;
        LazyStaggeredGridKt.m932LazyStaggeredGridLJWHXA8(lazyStaggeredGridState3, Orientation.Horizontal, rememberRowSlots(rows, obj2, paddingValues2, startRestartGroup, (i3 & 14) | ((i3 >> 12) & 112) | (i132222 & 896)), obj3, paddingValues2, z5, flingBehavior3, z4, f2, obj2.mo661getSpacingD9Ej5fM(), content, startRestartGroup, (i132222 & 29360128) | (i142222 & 7168) | 56 | (57344 & i152222) | (i152222 & 458752) | (i132222 & 3670016) | (i142222 & 234881024), (i3 >> 27) & 14, 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier2 = obj3;
        lazyStaggeredGridState4 = lazyStaggeredGridState3;
        vertical2 = vertical32222;
        z6 = z5;
        paddingValues3 = paddingValues42222;
        f3 = f2;
        flingBehavior4 = flingBehavior3;
        z7 = z4;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    private static final Function2<Density, Constraints, LazyStaggeredGridSlots> rememberRowSlots(StaggeredGridCells staggeredGridCells, Arrangement.Vertical vertical, PaddingValues paddingValues, Composer composer, int i) {
        composer.startReplaceableGroup(-675899235);
        ComposerKt.sourceInformation(composer, "C(rememberRowSlots)P(1,2)184@8133L953:LazyStaggeredGridDsl.kt#fzvcnm");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-675899235, i, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberRowSlots (LazyStaggeredGridDsl.kt:180)");
        }
        composer.startReplaceableGroup(1618982084);
        ComposerKt.sourceInformation(composer, "CC(remember)P(1,2,3):Composables.kt#9igjgp");
        boolean changed = composer.changed(staggeredGridCells) | composer.changed(vertical) | composer.changed(paddingValues);
        LazyStaggeredGridSlotCache rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new LazyStaggeredGridSlotCache(new LazyStaggeredGridDslKt$rememberRowSlots$1$1(paddingValues, staggeredGridCells, vertical));
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        Function2<Density, Constraints, LazyStaggeredGridSlots> function2 = (Function2) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return function2;
    }

    public static /* synthetic */ void items$default(LazyStaggeredGridScope lazyStaggeredGridScope, List items, Function1 function1, Function1 contentType, Function1 function12, Function4 itemContent, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        if ((i & 4) != 0) {
            contentType = LazyStaggeredGridDslKt$items$1.INSTANCE;
        }
        if ((i & 8) != 0) {
            function12 = null;
        }
        Intrinsics.checkNotNullParameter(lazyStaggeredGridScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyStaggeredGridScope.items(items.size(), function1 != null ? new LazyStaggeredGridDslKt$items$2$1(function1, items) : null, new LazyStaggeredGridDslKt$items$3(contentType, items), function12 != null ? new LazyStaggeredGridDslKt$items$4$1(function12, items) : null, ComposableLambdaKt.composableLambdaInstance(-886456479, true, new LazyStaggeredGridDslKt$items$5(itemContent, items)));
    }

    public static final <T> void items(LazyStaggeredGridScope lazyStaggeredGridScope, List<? extends T> items, Function1<? super T, ? extends Object> function1, Function1<? super T, ? extends Object> contentType, Function1<? super T, StaggeredGridItemSpan> function12, Function4<? super LazyStaggeredGridItemScope, ? super T, ? super Composer, ? super Integer, Unit> itemContent) {
        Intrinsics.checkNotNullParameter(lazyStaggeredGridScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyStaggeredGridScope.items(items.size(), function1 != null ? new LazyStaggeredGridDslKt$items$2$1(function1, items) : null, new LazyStaggeredGridDslKt$items$3(contentType, items), function12 != null ? new LazyStaggeredGridDslKt$items$4$1(function12, items) : null, ComposableLambdaKt.composableLambdaInstance(-886456479, true, new LazyStaggeredGridDslKt$items$5(itemContent, items)));
    }

    public static /* synthetic */ void itemsIndexed$default(LazyStaggeredGridScope lazyStaggeredGridScope, List items, Function2 function2, Function2 contentType, Function2 function22, Function5 itemContent, int i, Object obj) {
        if ((i & 2) != 0) {
            function2 = null;
        }
        if ((i & 4) != 0) {
            contentType = LazyStaggeredGridDslKt$itemsIndexed$1.INSTANCE;
        }
        if ((i & 8) != 0) {
            function22 = null;
        }
        Intrinsics.checkNotNullParameter(lazyStaggeredGridScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyStaggeredGridScope.items(items.size(), function2 != null ? new LazyStaggeredGridDslKt$itemsIndexed$2$1(function2, items) : null, new LazyStaggeredGridDslKt$itemsIndexed$3(contentType, items), function22 != null ? new LazyStaggeredGridDslKt$itemsIndexed$4$1(function22, items) : null, ComposableLambdaKt.composableLambdaInstance(284833944, true, new LazyStaggeredGridDslKt$itemsIndexed$5(itemContent, items)));
    }

    public static final <T> void itemsIndexed(LazyStaggeredGridScope lazyStaggeredGridScope, List<? extends T> items, Function2<? super Integer, ? super T, ? extends Object> function2, Function2<? super Integer, ? super T, ? extends Object> contentType, Function2<? super Integer, ? super T, StaggeredGridItemSpan> function22, Function5<? super LazyStaggeredGridItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, Unit> itemContent) {
        Intrinsics.checkNotNullParameter(lazyStaggeredGridScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyStaggeredGridScope.items(items.size(), function2 != null ? new LazyStaggeredGridDslKt$itemsIndexed$2$1(function2, items) : null, new LazyStaggeredGridDslKt$itemsIndexed$3(contentType, items), function22 != null ? new LazyStaggeredGridDslKt$itemsIndexed$4$1(function22, items) : null, ComposableLambdaKt.composableLambdaInstance(284833944, true, new LazyStaggeredGridDslKt$itemsIndexed$5(itemContent, items)));
    }

    public static /* synthetic */ void items$default(LazyStaggeredGridScope lazyStaggeredGridScope, Object[] items, Function1 function1, Function1 contentType, Function1 function12, Function4 itemContent, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        if ((i & 4) != 0) {
            contentType = LazyStaggeredGridDslKt$items$6.INSTANCE;
        }
        if ((i & 8) != 0) {
            function12 = null;
        }
        Intrinsics.checkNotNullParameter(lazyStaggeredGridScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyStaggeredGridScope.items(items.length, function1 != null ? new LazyStaggeredGridDslKt$items$7$1(function1, items) : null, new LazyStaggeredGridDslKt$items$8(contentType, items), function12 != null ? new LazyStaggeredGridDslKt$items$9$1(function12, items) : null, ComposableLambdaKt.composableLambdaInstance(2101296000, true, new LazyStaggeredGridDslKt$items$10(itemContent, items)));
    }

    public static final <T> void items(LazyStaggeredGridScope lazyStaggeredGridScope, T[] items, Function1<? super T, ? extends Object> function1, Function1<? super T, ? extends Object> contentType, Function1<? super T, StaggeredGridItemSpan> function12, Function4<? super LazyStaggeredGridItemScope, ? super T, ? super Composer, ? super Integer, Unit> itemContent) {
        Intrinsics.checkNotNullParameter(lazyStaggeredGridScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyStaggeredGridScope.items(items.length, function1 != null ? new LazyStaggeredGridDslKt$items$7$1(function1, items) : null, new LazyStaggeredGridDslKt$items$8(contentType, items), function12 != null ? new LazyStaggeredGridDslKt$items$9$1(function12, items) : null, ComposableLambdaKt.composableLambdaInstance(2101296000, true, new LazyStaggeredGridDslKt$items$10(itemContent, items)));
    }

    public static /* synthetic */ void itemsIndexed$default(LazyStaggeredGridScope lazyStaggeredGridScope, Object[] items, Function2 function2, Function2 contentType, Function2 function22, Function5 itemContent, int i, Object obj) {
        if ((i & 2) != 0) {
            function2 = null;
        }
        if ((i & 4) != 0) {
            contentType = LazyStaggeredGridDslKt$itemsIndexed$6.INSTANCE;
        }
        if ((i & 8) != 0) {
            function22 = null;
        }
        Intrinsics.checkNotNullParameter(lazyStaggeredGridScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyStaggeredGridScope.items(items.length, function2 != null ? new LazyStaggeredGridDslKt$itemsIndexed$7$1(function2, items) : null, new LazyStaggeredGridDslKt$itemsIndexed$8(contentType, items), function22 != null ? new LazyStaggeredGridDslKt$itemsIndexed$9$1(function22, items) : null, ComposableLambdaKt.composableLambdaInstance(-804487775, true, new LazyStaggeredGridDslKt$itemsIndexed$10(itemContent, items)));
    }

    public static final <T> void itemsIndexed(LazyStaggeredGridScope lazyStaggeredGridScope, T[] items, Function2<? super Integer, ? super T, ? extends Object> function2, Function2<? super Integer, ? super T, ? extends Object> contentType, Function2<? super Integer, ? super T, StaggeredGridItemSpan> function22, Function5<? super LazyStaggeredGridItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, Unit> itemContent) {
        Intrinsics.checkNotNullParameter(lazyStaggeredGridScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyStaggeredGridScope.items(items.length, function2 != null ? new LazyStaggeredGridDslKt$itemsIndexed$7$1(function2, items) : null, new LazyStaggeredGridDslKt$itemsIndexed$8(contentType, items), function22 != null ? new LazyStaggeredGridDslKt$itemsIndexed$9$1(function22, items) : null, ComposableLambdaKt.composableLambdaInstance(-804487775, true, new LazyStaggeredGridDslKt$itemsIndexed$10(itemContent, items)));
    }
}
