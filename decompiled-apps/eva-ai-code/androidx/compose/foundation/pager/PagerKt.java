package androidx.compose.foundation.pager;

import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpecKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.snapping.SnapFlingBehavior;
import androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider;
import androidx.compose.foundation.gestures.snapping.SnapPositionInLayoutKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.pager.PageSize;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.google.android.exoplayer2.C;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ifriend.data.networking.OkHttpClientProviderKt;
import com.ifriend.keychain.cipherStorage.CipherStorageKeystoreRsaEcb;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.internal.ws.WebSocketProtocol;
/* compiled from: Pager.kt */
@Metadata(d1 = {"\u0000¦\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u001aÛ\u0001\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00042\b\b\u0002\u0010\u0019\u001a\u00020\u00042%\b\u0002\u0010\u001a\u001a\u001f\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001b2\b\b\u0002\u0010 \u001a\u00020!21\u0010\"\u001a-\u0012\u0004\u0012\u00020$\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020\b0#¢\u0006\u0002\b&¢\u0006\u0002\b'H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b(\u0010)\u001aå\u0001\u0010\u0007\u001a\u00020\b2\u0006\u0010*\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00042\b\b\u0002\u0010\u0019\u001a\u00020\u00042%\b\u0002\u0010\u001a\u001a\u001f\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001b2\b\b\u0002\u0010 \u001a\u00020!21\u0010\"\u001a-\u0012\u0004\u0012\u00020$\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020\b0#¢\u0006\u0002\b&¢\u0006\u0002\b'H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b+\u0010,\u001a.\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\n2\u0006\u00100\u001a\u0002012\f\u00102\u001a\b\u0012\u0004\u0012\u000204032\u0006\u00105\u001a\u000204H\u0002\u001aÛ\u0001\u00106\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u00107\u001a\u0002082\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00042\b\b\u0002\u0010\u0019\u001a\u00020\u00042%\b\u0002\u0010\u001a\u001a\u001f\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001b2\b\b\u0002\u0010 \u001a\u00020!21\u0010\"\u001a-\u0012\u0004\u0012\u00020$\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020\b0#¢\u0006\u0002\b&¢\u0006\u0002\b'H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b9\u0010:\u001aå\u0001\u00106\u001a\u00020\b2\u0006\u0010*\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u00107\u001a\u0002082\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00042\b\b\u0002\u0010\u0019\u001a\u00020\u00042%\b\u0002\u0010\u001a\u001a\u001f\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001b2\b\b\u0002\u0010 \u001a\u00020!21\u0010\"\u001a-\u0012\u0004\u0012\u00020$\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020\b0#¢\u0006\u0002\b&¢\u0006\u0002\b'H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b;\u0010<\u001a\u0017\u0010=\u001a\u00020\b2\f\u0010>\u001a\b\u0012\u0004\u0012\u00020@0?H\u0082\b\u001a\f\u0010A\u001a\u000204*\u00020\nH\u0002\u001a\f\u0010B\u001a\u00020\u0004*\u00020\nH\u0002\u001a!\u0010C\u001a\u00020\f*\u00020\f2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010D\u001a\u00020\u0004H\u0001¢\u0006\u0002\u0010E\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006F"}, d2 = {"ConsumeHorizontalFlingNestedScrollConnection", "Landroidx/compose/foundation/pager/ConsumeAllFlingOnDirection;", "ConsumeVerticalFlingNestedScrollConnection", OkHttpClientProviderKt.DEBUG_KEY, "", "LowVelocityAnimationDefaultDuration", "", "HorizontalPager", "", "state", "Landroidx/compose/foundation/pager/PagerState;", "modifier", "Landroidx/compose/ui/Modifier;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "pageSize", "Landroidx/compose/foundation/pager/PageSize;", "beyondBoundsPageCount", "pageSpacing", "Landroidx/compose/ui/unit/Dp;", "verticalAlignment", "Landroidx/compose/ui/Alignment$Vertical;", "flingBehavior", "Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior;", "userScrollEnabled", "reverseLayout", "key", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", FirebaseAnalytics.Param.INDEX, "", "pageNestedScrollConnection", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "pageContent", "Lkotlin/Function2;", "Landroidx/compose/foundation/pager/PagerScope;", "page", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "HorizontalPager-xYaah8o", "(Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/pager/PageSize;IFLandroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior;ZZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;III)V", "pageCount", "HorizontalPager-AlbwjTQ", "(ILandroidx/compose/ui/Modifier;Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/pager/PageSize;IFLandroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior;ZZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;III)V", "SnapLayoutInfoProvider", "Landroidx/compose/foundation/gestures/snapping/SnapLayoutInfoProvider;", "pagerState", "pagerSnapDistance", "Landroidx/compose/foundation/pager/PagerSnapDistance;", "decayAnimationSpec", "Landroidx/compose/animation/core/DecayAnimationSpec;", "", "snapPositionalThreshold", "VerticalPager", "horizontalAlignment", "Landroidx/compose/ui/Alignment$Horizontal;", "VerticalPager-xYaah8o", "(Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/pager/PageSize;IFLandroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior;ZZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;III)V", "VerticalPager-AlbwjTQ", "(ILandroidx/compose/ui/Modifier;Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/pager/PageSize;IFLandroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior;ZZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;III)V", "debugLog", "generateMsg", "Lkotlin/Function0;", "", "dragGestureDelta", "isScrollingForward", "pagerSemantics", "isVertical", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/pager/PagerState;ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PagerKt {
    private static final ConsumeAllFlingOnDirection ConsumeHorizontalFlingNestedScrollConnection = new ConsumeAllFlingOnDirection(Orientation.Horizontal);
    private static final ConsumeAllFlingOnDirection ConsumeVerticalFlingNestedScrollConnection = new ConsumeAllFlingOnDirection(Orientation.Vertical);
    private static final boolean DEBUG = false;
    private static final int LowVelocityAnimationDefaultDuration = 500;

    private static final void debugLog(Function0<String> function0) {
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:203:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0117  */
    /* renamed from: HorizontalPager-xYaah8o  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m967HorizontalPagerxYaah8o(PagerState state, Modifier modifier, PaddingValues paddingValues, PageSize pageSize, int i, float f, Alignment.Vertical vertical, SnapFlingBehavior snapFlingBehavior, boolean z, boolean z2, Function1<? super Integer, ? extends Object> function1, NestedScrollConnection nestedScrollConnection, Function4<? super PagerScope, ? super Integer, ? super Composer, ? super Integer, Unit> pageContent, Composer composer, int i2, int i3, int i4) {
        int i5;
        Object obj;
        int i6;
        Object obj2;
        int i7;
        int i8;
        int i9;
        int i10;
        float f2;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        boolean z3;
        Composer composer2;
        int i22;
        int i23;
        int i24;
        int i25;
        SnapFlingBehavior snapFlingBehavior2;
        NestedScrollConnection nestedScrollConnection2;
        SnapFlingBehavior snapFlingBehavior3;
        boolean z4;
        int i26;
        float f3;
        Alignment.Vertical vertical2;
        int i27;
        Function1<? super Integer, ? extends Object> function12;
        PageSize pageSize2;
        Object obj3;
        Object obj4;
        Modifier modifier2;
        PaddingValues paddingValues2;
        PageSize pageSize3;
        int i28;
        float f4;
        Alignment.Vertical vertical3;
        SnapFlingBehavior snapFlingBehavior4;
        boolean z5;
        Function1<? super Integer, ? extends Object> function13;
        NestedScrollConnection nestedScrollConnection3;
        boolean z6;
        ScopeUpdateScope endRestartGroup;
        int i29;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(pageContent, "pageContent");
        Composer startRestartGroup = composer.startRestartGroup(1491175841);
        ComposerKt.sourceInformation(startRestartGroup, "C(HorizontalPager)P(10,4,1,7!1,8:c#ui.unit.Dp,12!1,11,9!1,6)113@6091L28,122@6441L620:Pager.kt#g6yjnt");
        if ((i4 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i5 = (startRestartGroup.changed(state) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        int i30 = i4 & 2;
        if (i30 != 0) {
            i5 |= 48;
        } else if ((i2 & 112) == 0) {
            obj = modifier;
            i5 |= startRestartGroup.changed(obj) ? 32 : 16;
            i6 = i4 & 4;
            if (i6 == 0) {
                i5 |= 384;
            } else if ((i2 & 896) == 0) {
                obj2 = paddingValues;
                i5 |= startRestartGroup.changed(obj2) ? 256 : 128;
                i7 = i4 & 8;
                if (i7 != 0) {
                    i5 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
                } else if ((i2 & 7168) == 0) {
                    i5 |= startRestartGroup.changed(pageSize) ? 2048 : 1024;
                    i8 = i4 & 16;
                    if (i8 == 0) {
                        i5 |= 24576;
                        i9 = i;
                    } else {
                        i9 = i;
                        if ((i2 & 57344) == 0) {
                            i5 |= startRestartGroup.changed(i9) ? 16384 : 8192;
                        }
                    }
                    i10 = i4 & 32;
                    if (i10 == 0) {
                        i5 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        f2 = f;
                    } else {
                        f2 = f;
                        if ((i2 & 458752) == 0) {
                            i5 |= startRestartGroup.changed(f2) ? 131072 : 65536;
                        }
                    }
                    i11 = i4 & 64;
                    if (i11 == 0) {
                        i5 |= 1572864;
                    } else if ((i2 & 3670016) == 0) {
                        i5 |= startRestartGroup.changed(vertical) ? 1048576 : 524288;
                    }
                    if ((i2 & 29360128) == 0) {
                        if ((i4 & 128) == 0 && startRestartGroup.changed(snapFlingBehavior)) {
                            i29 = 8388608;
                            i5 |= i29;
                        }
                        i29 = 4194304;
                        i5 |= i29;
                    }
                    i12 = i4 & 256;
                    if (i12 == 0) {
                        i5 |= 100663296;
                    } else if ((i2 & 234881024) == 0) {
                        i13 = i12;
                        i5 |= startRestartGroup.changed(z) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                        i14 = i4 & 512;
                        if (i14 != 0) {
                            i16 = i5 | C.ENCODING_PCM_32BIT;
                            i15 = i14;
                        } else {
                            if ((i2 & 1879048192) == 0) {
                                i15 = i14;
                                i5 |= startRestartGroup.changed(z2) ? 536870912 : 268435456;
                            } else {
                                i15 = i14;
                            }
                            i16 = i5;
                        }
                        i17 = i4 & 1024;
                        if (i17 != 0) {
                            i18 = i3 | 6;
                        } else if ((i3 & 14) == 0) {
                            i18 = i3 | (startRestartGroup.changedInstance(function1) ? 4 : 2);
                        } else {
                            i18 = i3;
                        }
                        i19 = i4 & 2048;
                        if (i19 != 0) {
                            i18 |= 16;
                        }
                        int i31 = i18;
                        if ((i4 & 4096) != 0) {
                            i31 |= 384;
                        } else if ((i3 & 896) == 0) {
                            i31 |= startRestartGroup.changedInstance(pageContent) ? 256 : 128;
                        }
                        i20 = i31;
                        if (i19 == 2048 || (i16 & 1533916891) != 306783378 || (i20 & 731) != 146 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            if ((i2 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                Modifier.Companion companion = i30 != 0 ? Modifier.Companion : obj;
                                PaddingValues m741PaddingValues0680j_4 = i6 != 0 ? PaddingKt.m741PaddingValues0680j_4(Dp.m5607constructorimpl(0)) : obj2;
                                PageSize.Fill fill = i7 != 0 ? PageSize.Fill.INSTANCE : pageSize;
                                int i32 = i8 != 0 ? 0 : i9;
                                float m5607constructorimpl = i10 != 0 ? Dp.m5607constructorimpl(0) : f2;
                                Alignment.Vertical centerVertically = i11 != 0 ? Alignment.Companion.getCenterVertically() : vertical;
                                if ((i4 & 128) != 0) {
                                    i21 = i20;
                                    z3 = false;
                                    composer2 = startRestartGroup;
                                    i22 = i13;
                                    i23 = i15;
                                    i24 = 1491175841;
                                    i25 = i19;
                                    snapFlingBehavior2 = PagerDefaults.INSTANCE.m965flingBehaviorPfoAEA0(state, null, null, null, null, 0.0f, 0.0f, startRestartGroup, (i16 & 14) | 12582912, WebSocketProtocol.PAYLOAD_SHORT);
                                    i16 &= -29360129;
                                } else {
                                    i21 = i20;
                                    z3 = false;
                                    composer2 = startRestartGroup;
                                    i22 = i13;
                                    i23 = i15;
                                    i24 = 1491175841;
                                    i25 = i19;
                                    snapFlingBehavior2 = snapFlingBehavior;
                                }
                                boolean z7 = i22 != 0 ? true : z;
                                if (i23 == 0) {
                                    z3 = z2;
                                }
                                Function1<? super Integer, ? extends Object> function14 = i17 != 0 ? null : function1;
                                if (i25 != 0) {
                                    snapFlingBehavior3 = snapFlingBehavior2;
                                    z4 = z7;
                                    nestedScrollConnection2 = PagerDefaults.INSTANCE.pageNestedScrollConnection(Orientation.Horizontal);
                                    i20 = i21 & (-113);
                                    i26 = i32;
                                    f3 = m5607constructorimpl;
                                    vertical2 = centerVertically;
                                    i27 = i16;
                                } else {
                                    nestedScrollConnection2 = nestedScrollConnection;
                                    snapFlingBehavior3 = snapFlingBehavior2;
                                    z4 = z7;
                                    i26 = i32;
                                    f3 = m5607constructorimpl;
                                    vertical2 = centerVertically;
                                    i27 = i16;
                                    i20 = i21;
                                }
                                function12 = function14;
                                pageSize2 = fill;
                                obj3 = m741PaddingValues0680j_4;
                                obj4 = companion;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i4 & 128) != 0) {
                                    i16 &= -29360129;
                                }
                                if (i19 != 0) {
                                    i20 &= -113;
                                }
                                pageSize2 = pageSize;
                                vertical2 = vertical;
                                snapFlingBehavior3 = snapFlingBehavior;
                                z4 = z;
                                z3 = z2;
                                nestedScrollConnection2 = nestedScrollConnection;
                                obj4 = obj;
                                i26 = i9;
                                f3 = f2;
                                obj3 = obj2;
                                composer2 = startRestartGroup;
                                i27 = i16;
                                i24 = 1491175841;
                                function12 = function1;
                            }
                            composer2.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(i24, i27, i20, "androidx.compose.foundation.pager.HorizontalPager (Pager.kt:105)");
                            }
                            int i33 = i27 >> 6;
                            int i34 = ((i27 >> 3) & 14) | 24576 | ((i27 << 3) & 112) | (i27 & 896) | ((i27 >> 18) & 7168) | (i33 & 458752) | (i33 & 3670016);
                            int i35 = i27 << 9;
                            LazyLayoutPagerKt.m961Pagerfs30GE4(obj4, state, obj3, z3, Orientation.Horizontal, snapFlingBehavior3, z4, i26, f3, pageSize2, nestedScrollConnection2, function12, Alignment.Companion.getCenterHorizontally(), vertical2, pageContent, composer2, i34 | (29360128 & i35) | (i35 & 234881024) | ((i27 << 18) & 1879048192), ((i27 >> 9) & 7168) | ((i20 << 3) & 112) | 392 | ((i20 << 6) & 57344), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier2 = obj4;
                            paddingValues2 = obj3;
                            pageSize3 = pageSize2;
                            i28 = i26;
                            f4 = f3;
                            vertical3 = vertical2;
                            snapFlingBehavior4 = snapFlingBehavior3;
                            z5 = z4;
                            function13 = function12;
                            nestedScrollConnection3 = nestedScrollConnection2;
                            z6 = z3;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            z6 = z2;
                            function13 = function1;
                            nestedScrollConnection3 = nestedScrollConnection;
                            modifier2 = obj;
                            i28 = i9;
                            f4 = f2;
                            paddingValues2 = obj2;
                            composer2 = startRestartGroup;
                            pageSize3 = pageSize;
                            vertical3 = vertical;
                            snapFlingBehavior4 = snapFlingBehavior;
                            z5 = z;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                            return;
                        }
                        endRestartGroup.updateScope(new PagerKt$HorizontalPager$1(state, modifier2, paddingValues2, pageSize3, i28, f4, vertical3, snapFlingBehavior4, z5, z6, function13, nestedScrollConnection3, pageContent, i2, i3, i4));
                        return;
                    }
                    i13 = i12;
                    i14 = i4 & 512;
                    if (i14 != 0) {
                    }
                    i17 = i4 & 1024;
                    if (i17 != 0) {
                    }
                    i19 = i4 & 2048;
                    if (i19 != 0) {
                    }
                    int i312 = i18;
                    if ((i4 & 4096) != 0) {
                    }
                    i20 = i312;
                    if (i19 == 2048) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                    }
                    if (i30 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (i10 != 0) {
                    }
                    if (i11 != 0) {
                    }
                    if ((i4 & 128) != 0) {
                    }
                    if (i22 != 0) {
                    }
                    if (i23 == 0) {
                    }
                    if (i17 != 0) {
                    }
                    if (i25 != 0) {
                    }
                    function12 = function14;
                    pageSize2 = fill;
                    obj3 = m741PaddingValues0680j_4;
                    obj4 = companion;
                    composer2.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    int i332 = i27 >> 6;
                    int i342 = ((i27 >> 3) & 14) | 24576 | ((i27 << 3) & 112) | (i27 & 896) | ((i27 >> 18) & 7168) | (i332 & 458752) | (i332 & 3670016);
                    int i352 = i27 << 9;
                    LazyLayoutPagerKt.m961Pagerfs30GE4(obj4, state, obj3, z3, Orientation.Horizontal, snapFlingBehavior3, z4, i26, f3, pageSize2, nestedScrollConnection2, function12, Alignment.Companion.getCenterHorizontally(), vertical2, pageContent, composer2, i342 | (29360128 & i352) | (i352 & 234881024) | ((i27 << 18) & 1879048192), ((i27 >> 9) & 7168) | ((i20 << 3) & 112) | 392 | ((i20 << 6) & 57344), 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier2 = obj4;
                    paddingValues2 = obj3;
                    pageSize3 = pageSize2;
                    i28 = i26;
                    f4 = f3;
                    vertical3 = vertical2;
                    snapFlingBehavior4 = snapFlingBehavior3;
                    z5 = z4;
                    function13 = function12;
                    nestedScrollConnection3 = nestedScrollConnection2;
                    z6 = z3;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                i8 = i4 & 16;
                if (i8 == 0) {
                }
                i10 = i4 & 32;
                if (i10 == 0) {
                }
                i11 = i4 & 64;
                if (i11 == 0) {
                }
                if ((i2 & 29360128) == 0) {
                }
                i12 = i4 & 256;
                if (i12 == 0) {
                }
                i13 = i12;
                i14 = i4 & 512;
                if (i14 != 0) {
                }
                i17 = i4 & 1024;
                if (i17 != 0) {
                }
                i19 = i4 & 2048;
                if (i19 != 0) {
                }
                int i3122 = i18;
                if ((i4 & 4096) != 0) {
                }
                i20 = i3122;
                if (i19 == 2048) {
                }
                startRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                }
                if (i30 != 0) {
                }
                if (i6 != 0) {
                }
                if (i7 != 0) {
                }
                if (i8 != 0) {
                }
                if (i10 != 0) {
                }
                if (i11 != 0) {
                }
                if ((i4 & 128) != 0) {
                }
                if (i22 != 0) {
                }
                if (i23 == 0) {
                }
                if (i17 != 0) {
                }
                if (i25 != 0) {
                }
                function12 = function14;
                pageSize2 = fill;
                obj3 = m741PaddingValues0680j_4;
                obj4 = companion;
                composer2.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                int i3322 = i27 >> 6;
                int i3422 = ((i27 >> 3) & 14) | 24576 | ((i27 << 3) & 112) | (i27 & 896) | ((i27 >> 18) & 7168) | (i3322 & 458752) | (i3322 & 3670016);
                int i3522 = i27 << 9;
                LazyLayoutPagerKt.m961Pagerfs30GE4(obj4, state, obj3, z3, Orientation.Horizontal, snapFlingBehavior3, z4, i26, f3, pageSize2, nestedScrollConnection2, function12, Alignment.Companion.getCenterHorizontally(), vertical2, pageContent, composer2, i3422 | (29360128 & i3522) | (i3522 & 234881024) | ((i27 << 18) & 1879048192), ((i27 >> 9) & 7168) | ((i20 << 3) & 112) | 392 | ((i20 << 6) & 57344), 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier2 = obj4;
                paddingValues2 = obj3;
                pageSize3 = pageSize2;
                i28 = i26;
                f4 = f3;
                vertical3 = vertical2;
                snapFlingBehavior4 = snapFlingBehavior3;
                z5 = z4;
                function13 = function12;
                nestedScrollConnection3 = nestedScrollConnection2;
                z6 = z3;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            obj2 = paddingValues;
            i7 = i4 & 8;
            if (i7 != 0) {
            }
            i8 = i4 & 16;
            if (i8 == 0) {
            }
            i10 = i4 & 32;
            if (i10 == 0) {
            }
            i11 = i4 & 64;
            if (i11 == 0) {
            }
            if ((i2 & 29360128) == 0) {
            }
            i12 = i4 & 256;
            if (i12 == 0) {
            }
            i13 = i12;
            i14 = i4 & 512;
            if (i14 != 0) {
            }
            i17 = i4 & 1024;
            if (i17 != 0) {
            }
            i19 = i4 & 2048;
            if (i19 != 0) {
            }
            int i31222 = i18;
            if ((i4 & 4096) != 0) {
            }
            i20 = i31222;
            if (i19 == 2048) {
            }
            startRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
            }
            if (i30 != 0) {
            }
            if (i6 != 0) {
            }
            if (i7 != 0) {
            }
            if (i8 != 0) {
            }
            if (i10 != 0) {
            }
            if (i11 != 0) {
            }
            if ((i4 & 128) != 0) {
            }
            if (i22 != 0) {
            }
            if (i23 == 0) {
            }
            if (i17 != 0) {
            }
            if (i25 != 0) {
            }
            function12 = function14;
            pageSize2 = fill;
            obj3 = m741PaddingValues0680j_4;
            obj4 = companion;
            composer2.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            int i33222 = i27 >> 6;
            int i34222 = ((i27 >> 3) & 14) | 24576 | ((i27 << 3) & 112) | (i27 & 896) | ((i27 >> 18) & 7168) | (i33222 & 458752) | (i33222 & 3670016);
            int i35222 = i27 << 9;
            LazyLayoutPagerKt.m961Pagerfs30GE4(obj4, state, obj3, z3, Orientation.Horizontal, snapFlingBehavior3, z4, i26, f3, pageSize2, nestedScrollConnection2, function12, Alignment.Companion.getCenterHorizontally(), vertical2, pageContent, composer2, i34222 | (29360128 & i35222) | (i35222 & 234881024) | ((i27 << 18) & 1879048192), ((i27 >> 9) & 7168) | ((i20 << 3) & 112) | 392 | ((i20 << 6) & 57344), 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier2 = obj4;
            paddingValues2 = obj3;
            pageSize3 = pageSize2;
            i28 = i26;
            f4 = f3;
            vertical3 = vertical2;
            snapFlingBehavior4 = snapFlingBehavior3;
            z5 = z4;
            function13 = function12;
            nestedScrollConnection3 = nestedScrollConnection2;
            z6 = z3;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        obj = modifier;
        i6 = i4 & 4;
        if (i6 == 0) {
        }
        obj2 = paddingValues;
        i7 = i4 & 8;
        if (i7 != 0) {
        }
        i8 = i4 & 16;
        if (i8 == 0) {
        }
        i10 = i4 & 32;
        if (i10 == 0) {
        }
        i11 = i4 & 64;
        if (i11 == 0) {
        }
        if ((i2 & 29360128) == 0) {
        }
        i12 = i4 & 256;
        if (i12 == 0) {
        }
        i13 = i12;
        i14 = i4 & 512;
        if (i14 != 0) {
        }
        i17 = i4 & 1024;
        if (i17 != 0) {
        }
        i19 = i4 & 2048;
        if (i19 != 0) {
        }
        int i312222 = i18;
        if ((i4 & 4096) != 0) {
        }
        i20 = i312222;
        if (i19 == 2048) {
        }
        startRestartGroup.startDefaults();
        if ((i2 & 1) != 0) {
        }
        if (i30 != 0) {
        }
        if (i6 != 0) {
        }
        if (i7 != 0) {
        }
        if (i8 != 0) {
        }
        if (i10 != 0) {
        }
        if (i11 != 0) {
        }
        if ((i4 & 128) != 0) {
        }
        if (i22 != 0) {
        }
        if (i23 == 0) {
        }
        if (i17 != 0) {
        }
        if (i25 != 0) {
        }
        function12 = function14;
        pageSize2 = fill;
        obj3 = m741PaddingValues0680j_4;
        obj4 = companion;
        composer2.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        int i332222 = i27 >> 6;
        int i342222 = ((i27 >> 3) & 14) | 24576 | ((i27 << 3) & 112) | (i27 & 896) | ((i27 >> 18) & 7168) | (i332222 & 458752) | (i332222 & 3670016);
        int i352222 = i27 << 9;
        LazyLayoutPagerKt.m961Pagerfs30GE4(obj4, state, obj3, z3, Orientation.Horizontal, snapFlingBehavior3, z4, i26, f3, pageSize2, nestedScrollConnection2, function12, Alignment.Companion.getCenterHorizontally(), vertical2, pageContent, composer2, i342222 | (29360128 & i352222) | (i352222 & 234881024) | ((i27 << 18) & 1879048192), ((i27 >> 9) & 7168) | ((i20 << 3) & 112) | 392 | ((i20 << 6) & 57344), 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier2 = obj4;
        paddingValues2 = obj3;
        pageSize3 = pageSize2;
        i28 = i26;
        f4 = f3;
        vertical3 = vertical2;
        snapFlingBehavior4 = snapFlingBehavior3;
        z5 = z4;
        function13 = function12;
        nestedScrollConnection3 = nestedScrollConnection2;
        z6 = z3;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:226:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x012e  */
    @Deprecated(level = DeprecationLevel.ERROR, message = "Please use the overload without pageCount. pageCount should be provided through PagerState.", replaceWith = @ReplaceWith(expression = "HorizontalPager(\n            modifier = modifier,\n            state = state,\n            pageSpacing = pageSpacing,\n            horizontalAlignment = horizontalAlignment,\n            userScrollEnabled = userScrollEnabled,\n            reverseLayout = reverseLayout,\n            contentPadding = contentPadding,\n            beyondBoundsPageCount = beyondBoundsPageCount,\n            pageSize = pageSize,\n            flingBehavior = flingBehavior,\n            key = key,\n            pageNestedScrollConnection = pageNestedScrollConnection,\n            pageContent = pageContent\n        )", imports = {"androidx.compose.foundation.gestures.Orientation", "androidx.compose.foundation.layout.PaddingValues", "androidx.compose.foundation.pager.PageSize", "androidx.compose.foundation.pager.PagerDefaults"}))
    /* renamed from: HorizontalPager-AlbwjTQ  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m966HorizontalPagerAlbwjTQ(int i, Modifier modifier, PagerState pagerState, PaddingValues paddingValues, PageSize pageSize, int i2, float f, Alignment.Vertical vertical, SnapFlingBehavior snapFlingBehavior, boolean z, boolean z2, Function1<? super Integer, ? extends Object> function1, NestedScrollConnection nestedScrollConnection, Function4<? super PagerScope, ? super Integer, ? super Composer, ? super Integer, Unit> pageContent, Composer composer, int i3, int i4, int i5) {
        int i6;
        Object obj;
        Object obj2;
        int i7;
        Object obj3;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        Object obj4;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        Modifier.Companion companion;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        PagerState pagerState2;
        SnapFlingBehavior snapFlingBehavior2;
        NestedScrollConnection nestedScrollConnection2;
        Object obj5;
        boolean z3;
        PaddingValues paddingValues2;
        PageSize pageSize2;
        int i29;
        Alignment.Vertical vertical2;
        float f2;
        Object obj6;
        boolean z4;
        Function1<? super Integer, ? extends Object> function12;
        Composer composer2;
        Modifier modifier2;
        PagerState pagerState3;
        PageSize pageSize3;
        int i30;
        float f3;
        Alignment.Vertical vertical3;
        SnapFlingBehavior snapFlingBehavior3;
        boolean z5;
        boolean z6;
        Function1<? super Integer, ? extends Object> function13;
        NestedScrollConnection nestedScrollConnection3;
        ScopeUpdateScope endRestartGroup;
        int i31;
        int i32;
        Intrinsics.checkNotNullParameter(pageContent, "pageContent");
        Composer startRestartGroup = composer.startRestartGroup(1817327312);
        ComposerKt.sourceInformation(startRestartGroup, "C(HorizontalPager)P(6,4,11,1,8!1,9:c#ui.unit.Dp,13!1,12,10!1,7)215@11194L13,215@11175L32,221@11495L28,230@11845L620:Pager.kt#g6yjnt");
        if ((i5 & 1) != 0) {
            i6 = i3 | 6;
        } else if ((i3 & 14) == 0) {
            i6 = (startRestartGroup.changed(i) ? 4 : 2) | i3;
        } else {
            i6 = i3;
        }
        int i33 = i5 & 2;
        if (i33 != 0) {
            i6 |= 48;
        } else if ((i3 & 112) == 0) {
            obj = modifier;
            i6 |= startRestartGroup.changed(obj) ? 32 : 16;
            if ((i3 & 896) != 0) {
                if ((i5 & 4) == 0) {
                    obj2 = pagerState;
                    if (startRestartGroup.changed(obj2)) {
                        i32 = 256;
                        i6 |= i32;
                    }
                } else {
                    obj2 = pagerState;
                }
                i32 = 128;
                i6 |= i32;
            } else {
                obj2 = pagerState;
            }
            i7 = i5 & 8;
            if (i7 == 0) {
                i6 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
            } else if ((i3 & 7168) == 0) {
                obj3 = paddingValues;
                i6 |= startRestartGroup.changed(obj3) ? 2048 : 1024;
                i8 = i5 & 16;
                if (i8 != 0) {
                    i6 |= 24576;
                } else if ((i3 & 57344) == 0) {
                    i6 |= startRestartGroup.changed(pageSize) ? 16384 : 8192;
                }
                i9 = i5 & 32;
                if (i9 != 0) {
                    i6 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i3 & 458752) == 0) {
                    i6 |= startRestartGroup.changed(i2) ? 131072 : 65536;
                }
                i10 = i5 & 64;
                if (i10 != 0) {
                    i6 |= 1572864;
                } else if ((i3 & 3670016) == 0) {
                    i6 |= startRestartGroup.changed(f) ? 1048576 : 524288;
                }
                i11 = i5 & 128;
                if (i11 != 0) {
                    i6 |= 12582912;
                } else if ((i3 & 29360128) == 0) {
                    i12 = i11;
                    i6 |= startRestartGroup.changed(vertical) ? 8388608 : 4194304;
                    if ((i3 & 234881024) != 0) {
                        if ((i5 & 256) == 0) {
                            obj4 = snapFlingBehavior;
                            if (startRestartGroup.changed(obj4)) {
                                i31 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                                i6 |= i31;
                            }
                        } else {
                            obj4 = snapFlingBehavior;
                        }
                        i31 = 33554432;
                        i6 |= i31;
                    } else {
                        obj4 = snapFlingBehavior;
                    }
                    i13 = i5 & 512;
                    if (i13 == 0) {
                        i6 |= C.ENCODING_PCM_32BIT;
                    } else if ((i3 & 1879048192) == 0) {
                        i14 = i13;
                        i6 |= startRestartGroup.changed(z) ? 536870912 : 268435456;
                        i15 = i5 & 1024;
                        if (i15 != 0) {
                            i17 = i4 | 6;
                            i16 = i15;
                        } else if ((i4 & 14) == 0) {
                            i16 = i15;
                            i17 = i4 | (startRestartGroup.changed(z2) ? 4 : 2);
                        } else {
                            i16 = i15;
                            i17 = i4;
                        }
                        i18 = i5 & 2048;
                        if (i18 != 0) {
                            i19 = i18;
                            i20 = i17 | 48;
                        } else {
                            if ((i4 & 112) == 0) {
                                i19 = i18;
                                i17 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
                            } else {
                                i19 = i18;
                            }
                            i20 = i17;
                        }
                        i21 = i5 & 4096;
                        if (i21 != 0) {
                            i20 |= 128;
                        }
                        if ((i5 & 8192) != 0) {
                            i20 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
                        } else if ((i4 & 7168) == 0) {
                            i20 |= startRestartGroup.changedInstance(pageContent) ? 2048 : 1024;
                        }
                        i22 = i20;
                        if (i21 == 4096 || (1533916891 & i6) != 306783378 || (i22 & 5851) != 1170 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            if ((i3 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                companion = i33 != 0 ? Modifier.Companion : obj;
                                if ((i5 & 4) != 0) {
                                    Integer valueOf = Integer.valueOf(i);
                                    startRestartGroup.startReplaceableGroup(1157296644);
                                    ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                                    boolean changed = startRestartGroup.changed(valueOf);
                                    PagerKt$HorizontalPager$2$1 rememberedValue = startRestartGroup.rememberedValue();
                                    if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                                        rememberedValue = new PagerKt$HorizontalPager$2$1(i);
                                        startRestartGroup.updateRememberedValue(rememberedValue);
                                    }
                                    startRestartGroup.endReplaceableGroup();
                                    int i34 = i6;
                                    i24 = i21;
                                    i25 = i12;
                                    i26 = i14;
                                    i27 = i16;
                                    i28 = i19;
                                    pagerState2 = PagerStateKt.rememberPagerState(0, 0.0f, (Function0) rememberedValue, startRestartGroup, 0, 3);
                                    i23 = i34 & (-897);
                                } else {
                                    i23 = i6;
                                    i24 = i21;
                                    i25 = i12;
                                    i26 = i14;
                                    i27 = i16;
                                    i28 = i19;
                                    pagerState2 = obj2;
                                }
                                PaddingValues m741PaddingValues0680j_4 = i7 != 0 ? PaddingKt.m741PaddingValues0680j_4(Dp.m5607constructorimpl(0)) : paddingValues;
                                PageSize.Fill fill = i8 != 0 ? PageSize.Fill.INSTANCE : pageSize;
                                int i35 = i9 != 0 ? 0 : i2;
                                float m5607constructorimpl = i10 != 0 ? Dp.m5607constructorimpl(0) : f;
                                Alignment.Vertical centerVertically = i25 != 0 ? Alignment.Companion.getCenterVertically() : vertical;
                                if ((i5 & 256) != 0) {
                                    snapFlingBehavior2 = PagerDefaults.INSTANCE.m965flingBehaviorPfoAEA0(pagerState2, null, null, null, null, 0.0f, 0.0f, startRestartGroup, ((i23 >> 6) & 14) | 12582912, WebSocketProtocol.PAYLOAD_SHORT);
                                    i23 &= -234881025;
                                } else {
                                    snapFlingBehavior2 = snapFlingBehavior;
                                }
                                boolean z7 = i26 != 0 ? true : z;
                                boolean z8 = i27 == 0 ? z2 : false;
                                Function1<? super Integer, ? extends Object> function14 = i28 != 0 ? null : function1;
                                Object obj7 = companion;
                                if (i24 != 0) {
                                    i22 &= -897;
                                    nestedScrollConnection2 = PagerDefaults.INSTANCE.pageNestedScrollConnection(Orientation.Horizontal);
                                    obj5 = pagerState2;
                                    i6 = i23;
                                    z3 = z8;
                                    paddingValues2 = m741PaddingValues0680j_4;
                                    pageSize2 = fill;
                                    i29 = i35;
                                    vertical2 = centerVertically;
                                    f2 = m5607constructorimpl;
                                    obj6 = snapFlingBehavior2;
                                    z4 = z7;
                                    function12 = function14;
                                    companion = obj7;
                                } else {
                                    nestedScrollConnection2 = nestedScrollConnection;
                                    obj5 = pagerState2;
                                    i6 = i23;
                                    z3 = z8;
                                    paddingValues2 = m741PaddingValues0680j_4;
                                    pageSize2 = fill;
                                    i29 = i35;
                                    vertical2 = centerVertically;
                                    f2 = m5607constructorimpl;
                                    obj6 = snapFlingBehavior2;
                                    z4 = z7;
                                    function12 = function14;
                                }
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i5 & 4) != 0) {
                                    i6 &= -897;
                                }
                                if ((i5 & 256) != 0) {
                                    i6 &= -234881025;
                                }
                                if (i21 != 0) {
                                    i22 &= -897;
                                }
                                pageSize2 = pageSize;
                                i29 = i2;
                                f2 = f;
                                vertical2 = vertical;
                                z4 = z;
                                z3 = z2;
                                function12 = function1;
                                nestedScrollConnection2 = nestedScrollConnection;
                                paddingValues2 = obj3;
                                obj6 = obj4;
                                companion = obj;
                                obj5 = obj2;
                            }
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1817327312, i6, i22, "androidx.compose.foundation.pager.HorizontalPager (Pager.kt:212)");
                            }
                            int i36 = i6 >> 3;
                            int i37 = i6 >> 9;
                            int i38 = (i36 & 896) | (i36 & 14) | 24576 | (i36 & 112) | ((i22 << 9) & 7168) | (i37 & 458752) | (i37 & 3670016);
                            int i39 = i6 << 6;
                            composer2 = startRestartGroup;
                            LazyLayoutPagerKt.m961Pagerfs30GE4(companion, obj5, paddingValues2, z3, Orientation.Horizontal, obj6, z4, i29, f2, pageSize2, nestedScrollConnection2, function12, Alignment.Companion.getCenterHorizontally(), vertical2, pageContent, composer2, i38 | (29360128 & i39) | (i39 & 234881024) | ((i6 << 15) & 1879048192), ((i6 >> 12) & 7168) | (i22 & 112) | 392 | ((i22 << 3) & 57344), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier2 = companion;
                            pagerState3 = obj5;
                            obj3 = paddingValues2;
                            pageSize3 = pageSize2;
                            i30 = i29;
                            f3 = f2;
                            vertical3 = vertical2;
                            snapFlingBehavior3 = obj6;
                            z5 = z4;
                            z6 = z3;
                            function13 = function12;
                            nestedScrollConnection3 = nestedScrollConnection2;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            i30 = i2;
                            f3 = f;
                            vertical3 = vertical;
                            function13 = function1;
                            nestedScrollConnection3 = nestedScrollConnection;
                            modifier2 = obj;
                            pagerState3 = obj2;
                            composer2 = startRestartGroup;
                            z5 = z;
                            z6 = z2;
                            snapFlingBehavior3 = obj4;
                            pageSize3 = pageSize;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                            return;
                        }
                        endRestartGroup.updateScope(new PagerKt$HorizontalPager$3(i, modifier2, pagerState3, obj3, pageSize3, i30, f3, vertical3, snapFlingBehavior3, z5, z6, function13, nestedScrollConnection3, pageContent, i3, i4, i5));
                        return;
                    }
                    i14 = i13;
                    i15 = i5 & 1024;
                    if (i15 != 0) {
                    }
                    i18 = i5 & 2048;
                    if (i18 != 0) {
                    }
                    i21 = i5 & 4096;
                    if (i21 != 0) {
                    }
                    if ((i5 & 8192) != 0) {
                    }
                    i22 = i20;
                    if (i21 == 4096) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i3 & 1) != 0) {
                    }
                    if (i33 != 0) {
                    }
                    if ((i5 & 4) != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (i9 != 0) {
                    }
                    if (i10 != 0) {
                    }
                    if (i25 != 0) {
                    }
                    if ((i5 & 256) != 0) {
                    }
                    if (i26 != 0) {
                    }
                    if (i27 == 0) {
                    }
                    if (i28 != 0) {
                    }
                    Object obj72 = companion;
                    if (i24 != 0) {
                    }
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    int i362 = i6 >> 3;
                    int i372 = i6 >> 9;
                    int i382 = (i362 & 896) | (i362 & 14) | 24576 | (i362 & 112) | ((i22 << 9) & 7168) | (i372 & 458752) | (i372 & 3670016);
                    int i392 = i6 << 6;
                    composer2 = startRestartGroup;
                    LazyLayoutPagerKt.m961Pagerfs30GE4(companion, obj5, paddingValues2, z3, Orientation.Horizontal, obj6, z4, i29, f2, pageSize2, nestedScrollConnection2, function12, Alignment.Companion.getCenterHorizontally(), vertical2, pageContent, composer2, i382 | (29360128 & i392) | (i392 & 234881024) | ((i6 << 15) & 1879048192), ((i6 >> 12) & 7168) | (i22 & 112) | 392 | ((i22 << 3) & 57344), 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier2 = companion;
                    pagerState3 = obj5;
                    obj3 = paddingValues2;
                    pageSize3 = pageSize2;
                    i30 = i29;
                    f3 = f2;
                    vertical3 = vertical2;
                    snapFlingBehavior3 = obj6;
                    z5 = z4;
                    z6 = z3;
                    function13 = function12;
                    nestedScrollConnection3 = nestedScrollConnection2;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                i12 = i11;
                if ((i3 & 234881024) != 0) {
                }
                i13 = i5 & 512;
                if (i13 == 0) {
                }
                i14 = i13;
                i15 = i5 & 1024;
                if (i15 != 0) {
                }
                i18 = i5 & 2048;
                if (i18 != 0) {
                }
                i21 = i5 & 4096;
                if (i21 != 0) {
                }
                if ((i5 & 8192) != 0) {
                }
                i22 = i20;
                if (i21 == 4096) {
                }
                startRestartGroup.startDefaults();
                if ((i3 & 1) != 0) {
                }
                if (i33 != 0) {
                }
                if ((i5 & 4) != 0) {
                }
                if (i7 != 0) {
                }
                if (i8 != 0) {
                }
                if (i9 != 0) {
                }
                if (i10 != 0) {
                }
                if (i25 != 0) {
                }
                if ((i5 & 256) != 0) {
                }
                if (i26 != 0) {
                }
                if (i27 == 0) {
                }
                if (i28 != 0) {
                }
                Object obj722 = companion;
                if (i24 != 0) {
                }
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                int i3622 = i6 >> 3;
                int i3722 = i6 >> 9;
                int i3822 = (i3622 & 896) | (i3622 & 14) | 24576 | (i3622 & 112) | ((i22 << 9) & 7168) | (i3722 & 458752) | (i3722 & 3670016);
                int i3922 = i6 << 6;
                composer2 = startRestartGroup;
                LazyLayoutPagerKt.m961Pagerfs30GE4(companion, obj5, paddingValues2, z3, Orientation.Horizontal, obj6, z4, i29, f2, pageSize2, nestedScrollConnection2, function12, Alignment.Companion.getCenterHorizontally(), vertical2, pageContent, composer2, i3822 | (29360128 & i3922) | (i3922 & 234881024) | ((i6 << 15) & 1879048192), ((i6 >> 12) & 7168) | (i22 & 112) | 392 | ((i22 << 3) & 57344), 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier2 = companion;
                pagerState3 = obj5;
                obj3 = paddingValues2;
                pageSize3 = pageSize2;
                i30 = i29;
                f3 = f2;
                vertical3 = vertical2;
                snapFlingBehavior3 = obj6;
                z5 = z4;
                z6 = z3;
                function13 = function12;
                nestedScrollConnection3 = nestedScrollConnection2;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            obj3 = paddingValues;
            i8 = i5 & 16;
            if (i8 != 0) {
            }
            i9 = i5 & 32;
            if (i9 != 0) {
            }
            i10 = i5 & 64;
            if (i10 != 0) {
            }
            i11 = i5 & 128;
            if (i11 != 0) {
            }
            i12 = i11;
            if ((i3 & 234881024) != 0) {
            }
            i13 = i5 & 512;
            if (i13 == 0) {
            }
            i14 = i13;
            i15 = i5 & 1024;
            if (i15 != 0) {
            }
            i18 = i5 & 2048;
            if (i18 != 0) {
            }
            i21 = i5 & 4096;
            if (i21 != 0) {
            }
            if ((i5 & 8192) != 0) {
            }
            i22 = i20;
            if (i21 == 4096) {
            }
            startRestartGroup.startDefaults();
            if ((i3 & 1) != 0) {
            }
            if (i33 != 0) {
            }
            if ((i5 & 4) != 0) {
            }
            if (i7 != 0) {
            }
            if (i8 != 0) {
            }
            if (i9 != 0) {
            }
            if (i10 != 0) {
            }
            if (i25 != 0) {
            }
            if ((i5 & 256) != 0) {
            }
            if (i26 != 0) {
            }
            if (i27 == 0) {
            }
            if (i28 != 0) {
            }
            Object obj7222 = companion;
            if (i24 != 0) {
            }
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            int i36222 = i6 >> 3;
            int i37222 = i6 >> 9;
            int i38222 = (i36222 & 896) | (i36222 & 14) | 24576 | (i36222 & 112) | ((i22 << 9) & 7168) | (i37222 & 458752) | (i37222 & 3670016);
            int i39222 = i6 << 6;
            composer2 = startRestartGroup;
            LazyLayoutPagerKt.m961Pagerfs30GE4(companion, obj5, paddingValues2, z3, Orientation.Horizontal, obj6, z4, i29, f2, pageSize2, nestedScrollConnection2, function12, Alignment.Companion.getCenterHorizontally(), vertical2, pageContent, composer2, i38222 | (29360128 & i39222) | (i39222 & 234881024) | ((i6 << 15) & 1879048192), ((i6 >> 12) & 7168) | (i22 & 112) | 392 | ((i22 << 3) & 57344), 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier2 = companion;
            pagerState3 = obj5;
            obj3 = paddingValues2;
            pageSize3 = pageSize2;
            i30 = i29;
            f3 = f2;
            vertical3 = vertical2;
            snapFlingBehavior3 = obj6;
            z5 = z4;
            z6 = z3;
            function13 = function12;
            nestedScrollConnection3 = nestedScrollConnection2;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        obj = modifier;
        if ((i3 & 896) != 0) {
        }
        i7 = i5 & 8;
        if (i7 == 0) {
        }
        obj3 = paddingValues;
        i8 = i5 & 16;
        if (i8 != 0) {
        }
        i9 = i5 & 32;
        if (i9 != 0) {
        }
        i10 = i5 & 64;
        if (i10 != 0) {
        }
        i11 = i5 & 128;
        if (i11 != 0) {
        }
        i12 = i11;
        if ((i3 & 234881024) != 0) {
        }
        i13 = i5 & 512;
        if (i13 == 0) {
        }
        i14 = i13;
        i15 = i5 & 1024;
        if (i15 != 0) {
        }
        i18 = i5 & 2048;
        if (i18 != 0) {
        }
        i21 = i5 & 4096;
        if (i21 != 0) {
        }
        if ((i5 & 8192) != 0) {
        }
        i22 = i20;
        if (i21 == 4096) {
        }
        startRestartGroup.startDefaults();
        if ((i3 & 1) != 0) {
        }
        if (i33 != 0) {
        }
        if ((i5 & 4) != 0) {
        }
        if (i7 != 0) {
        }
        if (i8 != 0) {
        }
        if (i9 != 0) {
        }
        if (i10 != 0) {
        }
        if (i25 != 0) {
        }
        if ((i5 & 256) != 0) {
        }
        if (i26 != 0) {
        }
        if (i27 == 0) {
        }
        if (i28 != 0) {
        }
        Object obj72222 = companion;
        if (i24 != 0) {
        }
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        int i362222 = i6 >> 3;
        int i372222 = i6 >> 9;
        int i382222 = (i362222 & 896) | (i362222 & 14) | 24576 | (i362222 & 112) | ((i22 << 9) & 7168) | (i372222 & 458752) | (i372222 & 3670016);
        int i392222 = i6 << 6;
        composer2 = startRestartGroup;
        LazyLayoutPagerKt.m961Pagerfs30GE4(companion, obj5, paddingValues2, z3, Orientation.Horizontal, obj6, z4, i29, f2, pageSize2, nestedScrollConnection2, function12, Alignment.Companion.getCenterHorizontally(), vertical2, pageContent, composer2, i382222 | (29360128 & i392222) | (i392222 & 234881024) | ((i6 << 15) & 1879048192), ((i6 >> 12) & 7168) | (i22 & 112) | 392 | ((i22 << 3) & 57344), 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier2 = companion;
        pagerState3 = obj5;
        obj3 = paddingValues2;
        pageSize3 = pageSize2;
        i30 = i29;
        f3 = f2;
        vertical3 = vertical2;
        snapFlingBehavior3 = obj6;
        z5 = z4;
        z6 = z3;
        function13 = function12;
        nestedScrollConnection3 = nestedScrollConnection2;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:203:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0117  */
    /* renamed from: VerticalPager-xYaah8o  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m969VerticalPagerxYaah8o(PagerState state, Modifier modifier, PaddingValues paddingValues, PageSize pageSize, int i, float f, Alignment.Horizontal horizontal, SnapFlingBehavior snapFlingBehavior, boolean z, boolean z2, Function1<? super Integer, ? extends Object> function1, NestedScrollConnection nestedScrollConnection, Function4<? super PagerScope, ? super Integer, ? super Composer, ? super Integer, Unit> pageContent, Composer composer, int i2, int i3, int i4) {
        int i5;
        Object obj;
        int i6;
        Object obj2;
        int i7;
        int i8;
        int i9;
        int i10;
        float f2;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        boolean z3;
        Composer composer2;
        int i22;
        int i23;
        int i24;
        int i25;
        SnapFlingBehavior snapFlingBehavior2;
        NestedScrollConnection nestedScrollConnection2;
        SnapFlingBehavior snapFlingBehavior3;
        boolean z4;
        int i26;
        float f3;
        Alignment.Horizontal horizontal2;
        int i27;
        Function1<? super Integer, ? extends Object> function12;
        PageSize pageSize2;
        Object obj3;
        Object obj4;
        Modifier modifier2;
        PaddingValues paddingValues2;
        PageSize pageSize3;
        int i28;
        float f4;
        Alignment.Horizontal horizontal3;
        SnapFlingBehavior snapFlingBehavior4;
        boolean z5;
        Function1<? super Integer, ? extends Object> function13;
        NestedScrollConnection nestedScrollConnection3;
        boolean z6;
        ScopeUpdateScope endRestartGroup;
        int i29;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(pageContent, "pageContent");
        Composer startRestartGroup = composer.startRestartGroup(-1457068767);
        ComposerKt.sourceInformation(startRestartGroup, "C(VerticalPager)P(11,5,1,8!1,9:c#ui.unit.Dp,3!1,12,10!1,7)299@15710L28,308@16058L618:Pager.kt#g6yjnt");
        if ((i4 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i5 = (startRestartGroup.changed(state) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        int i30 = i4 & 2;
        if (i30 != 0) {
            i5 |= 48;
        } else if ((i2 & 112) == 0) {
            obj = modifier;
            i5 |= startRestartGroup.changed(obj) ? 32 : 16;
            i6 = i4 & 4;
            if (i6 == 0) {
                i5 |= 384;
            } else if ((i2 & 896) == 0) {
                obj2 = paddingValues;
                i5 |= startRestartGroup.changed(obj2) ? 256 : 128;
                i7 = i4 & 8;
                if (i7 != 0) {
                    i5 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
                } else if ((i2 & 7168) == 0) {
                    i5 |= startRestartGroup.changed(pageSize) ? 2048 : 1024;
                    i8 = i4 & 16;
                    if (i8 == 0) {
                        i5 |= 24576;
                        i9 = i;
                    } else {
                        i9 = i;
                        if ((i2 & 57344) == 0) {
                            i5 |= startRestartGroup.changed(i9) ? 16384 : 8192;
                        }
                    }
                    i10 = i4 & 32;
                    if (i10 == 0) {
                        i5 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        f2 = f;
                    } else {
                        f2 = f;
                        if ((i2 & 458752) == 0) {
                            i5 |= startRestartGroup.changed(f2) ? 131072 : 65536;
                        }
                    }
                    i11 = i4 & 64;
                    if (i11 == 0) {
                        i5 |= 1572864;
                    } else if ((i2 & 3670016) == 0) {
                        i5 |= startRestartGroup.changed(horizontal) ? 1048576 : 524288;
                    }
                    if ((i2 & 29360128) == 0) {
                        if ((i4 & 128) == 0 && startRestartGroup.changed(snapFlingBehavior)) {
                            i29 = 8388608;
                            i5 |= i29;
                        }
                        i29 = 4194304;
                        i5 |= i29;
                    }
                    i12 = i4 & 256;
                    if (i12 == 0) {
                        i5 |= 100663296;
                    } else if ((i2 & 234881024) == 0) {
                        i13 = i12;
                        i5 |= startRestartGroup.changed(z) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                        i14 = i4 & 512;
                        if (i14 != 0) {
                            i16 = i5 | C.ENCODING_PCM_32BIT;
                            i15 = i14;
                        } else {
                            if ((i2 & 1879048192) == 0) {
                                i15 = i14;
                                i5 |= startRestartGroup.changed(z2) ? 536870912 : 268435456;
                            } else {
                                i15 = i14;
                            }
                            i16 = i5;
                        }
                        i17 = i4 & 1024;
                        if (i17 != 0) {
                            i18 = i3 | 6;
                        } else if ((i3 & 14) == 0) {
                            i18 = i3 | (startRestartGroup.changedInstance(function1) ? 4 : 2);
                        } else {
                            i18 = i3;
                        }
                        i19 = i4 & 2048;
                        if (i19 != 0) {
                            i18 |= 16;
                        }
                        int i31 = i18;
                        if ((i4 & 4096) != 0) {
                            i31 |= 384;
                        } else if ((i3 & 896) == 0) {
                            i31 |= startRestartGroup.changedInstance(pageContent) ? 256 : 128;
                        }
                        i20 = i31;
                        if (i19 == 2048 || (i16 & 1533916891) != 306783378 || (i20 & 731) != 146 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            if ((i2 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                Modifier.Companion companion = i30 != 0 ? Modifier.Companion : obj;
                                PaddingValues m741PaddingValues0680j_4 = i6 != 0 ? PaddingKt.m741PaddingValues0680j_4(Dp.m5607constructorimpl(0)) : obj2;
                                PageSize.Fill fill = i7 != 0 ? PageSize.Fill.INSTANCE : pageSize;
                                int i32 = i8 != 0 ? 0 : i9;
                                float m5607constructorimpl = i10 != 0 ? Dp.m5607constructorimpl(0) : f2;
                                Alignment.Horizontal centerHorizontally = i11 != 0 ? Alignment.Companion.getCenterHorizontally() : horizontal;
                                if ((i4 & 128) != 0) {
                                    i21 = i20;
                                    z3 = false;
                                    composer2 = startRestartGroup;
                                    i22 = i13;
                                    i23 = i15;
                                    i24 = -1457068767;
                                    i25 = i19;
                                    snapFlingBehavior2 = PagerDefaults.INSTANCE.m965flingBehaviorPfoAEA0(state, null, null, null, null, 0.0f, 0.0f, startRestartGroup, (i16 & 14) | 12582912, WebSocketProtocol.PAYLOAD_SHORT);
                                    i16 &= -29360129;
                                } else {
                                    i21 = i20;
                                    z3 = false;
                                    composer2 = startRestartGroup;
                                    i22 = i13;
                                    i23 = i15;
                                    i24 = -1457068767;
                                    i25 = i19;
                                    snapFlingBehavior2 = snapFlingBehavior;
                                }
                                boolean z7 = i22 != 0 ? true : z;
                                if (i23 == 0) {
                                    z3 = z2;
                                }
                                Function1<? super Integer, ? extends Object> function14 = i17 != 0 ? null : function1;
                                if (i25 != 0) {
                                    snapFlingBehavior3 = snapFlingBehavior2;
                                    z4 = z7;
                                    nestedScrollConnection2 = PagerDefaults.INSTANCE.pageNestedScrollConnection(Orientation.Vertical);
                                    i20 = i21 & (-113);
                                    i26 = i32;
                                    f3 = m5607constructorimpl;
                                    horizontal2 = centerHorizontally;
                                    i27 = i16;
                                } else {
                                    nestedScrollConnection2 = nestedScrollConnection;
                                    snapFlingBehavior3 = snapFlingBehavior2;
                                    z4 = z7;
                                    i26 = i32;
                                    f3 = m5607constructorimpl;
                                    horizontal2 = centerHorizontally;
                                    i27 = i16;
                                    i20 = i21;
                                }
                                function12 = function14;
                                pageSize2 = fill;
                                obj3 = m741PaddingValues0680j_4;
                                obj4 = companion;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i4 & 128) != 0) {
                                    i16 &= -29360129;
                                }
                                if (i19 != 0) {
                                    i20 &= -113;
                                }
                                pageSize2 = pageSize;
                                horizontal2 = horizontal;
                                snapFlingBehavior3 = snapFlingBehavior;
                                z4 = z;
                                z3 = z2;
                                nestedScrollConnection2 = nestedScrollConnection;
                                obj4 = obj;
                                i26 = i9;
                                f3 = f2;
                                obj3 = obj2;
                                composer2 = startRestartGroup;
                                i27 = i16;
                                i24 = -1457068767;
                                function12 = function1;
                            }
                            composer2.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(i24, i27, i20, "androidx.compose.foundation.pager.VerticalPager (Pager.kt:291)");
                            }
                            int i33 = i27 >> 6;
                            int i34 = ((i27 >> 3) & 14) | 24576 | ((i27 << 3) & 112) | (i27 & 896) | ((i27 >> 18) & 7168) | (i33 & 458752) | (i33 & 3670016);
                            int i35 = i27 << 9;
                            LazyLayoutPagerKt.m961Pagerfs30GE4(obj4, state, obj3, z3, Orientation.Vertical, snapFlingBehavior3, z4, i26, f3, pageSize2, nestedScrollConnection2, function12, horizontal2, Alignment.Companion.getCenterVertically(), pageContent, composer2, i34 | (29360128 & i35) | (i35 & 234881024) | ((i27 << 18) & 1879048192), ((i27 >> 12) & 896) | ((i20 << 3) & 112) | 3080 | ((i20 << 6) & 57344), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier2 = obj4;
                            paddingValues2 = obj3;
                            pageSize3 = pageSize2;
                            i28 = i26;
                            f4 = f3;
                            horizontal3 = horizontal2;
                            snapFlingBehavior4 = snapFlingBehavior3;
                            z5 = z4;
                            function13 = function12;
                            nestedScrollConnection3 = nestedScrollConnection2;
                            z6 = z3;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            z6 = z2;
                            function13 = function1;
                            nestedScrollConnection3 = nestedScrollConnection;
                            modifier2 = obj;
                            i28 = i9;
                            f4 = f2;
                            paddingValues2 = obj2;
                            composer2 = startRestartGroup;
                            pageSize3 = pageSize;
                            horizontal3 = horizontal;
                            snapFlingBehavior4 = snapFlingBehavior;
                            z5 = z;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                            return;
                        }
                        endRestartGroup.updateScope(new PagerKt$VerticalPager$1(state, modifier2, paddingValues2, pageSize3, i28, f4, horizontal3, snapFlingBehavior4, z5, z6, function13, nestedScrollConnection3, pageContent, i2, i3, i4));
                        return;
                    }
                    i13 = i12;
                    i14 = i4 & 512;
                    if (i14 != 0) {
                    }
                    i17 = i4 & 1024;
                    if (i17 != 0) {
                    }
                    i19 = i4 & 2048;
                    if (i19 != 0) {
                    }
                    int i312 = i18;
                    if ((i4 & 4096) != 0) {
                    }
                    i20 = i312;
                    if (i19 == 2048) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                    }
                    if (i30 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (i10 != 0) {
                    }
                    if (i11 != 0) {
                    }
                    if ((i4 & 128) != 0) {
                    }
                    if (i22 != 0) {
                    }
                    if (i23 == 0) {
                    }
                    if (i17 != 0) {
                    }
                    if (i25 != 0) {
                    }
                    function12 = function14;
                    pageSize2 = fill;
                    obj3 = m741PaddingValues0680j_4;
                    obj4 = companion;
                    composer2.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    int i332 = i27 >> 6;
                    int i342 = ((i27 >> 3) & 14) | 24576 | ((i27 << 3) & 112) | (i27 & 896) | ((i27 >> 18) & 7168) | (i332 & 458752) | (i332 & 3670016);
                    int i352 = i27 << 9;
                    LazyLayoutPagerKt.m961Pagerfs30GE4(obj4, state, obj3, z3, Orientation.Vertical, snapFlingBehavior3, z4, i26, f3, pageSize2, nestedScrollConnection2, function12, horizontal2, Alignment.Companion.getCenterVertically(), pageContent, composer2, i342 | (29360128 & i352) | (i352 & 234881024) | ((i27 << 18) & 1879048192), ((i27 >> 12) & 896) | ((i20 << 3) & 112) | 3080 | ((i20 << 6) & 57344), 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier2 = obj4;
                    paddingValues2 = obj3;
                    pageSize3 = pageSize2;
                    i28 = i26;
                    f4 = f3;
                    horizontal3 = horizontal2;
                    snapFlingBehavior4 = snapFlingBehavior3;
                    z5 = z4;
                    function13 = function12;
                    nestedScrollConnection3 = nestedScrollConnection2;
                    z6 = z3;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                i8 = i4 & 16;
                if (i8 == 0) {
                }
                i10 = i4 & 32;
                if (i10 == 0) {
                }
                i11 = i4 & 64;
                if (i11 == 0) {
                }
                if ((i2 & 29360128) == 0) {
                }
                i12 = i4 & 256;
                if (i12 == 0) {
                }
                i13 = i12;
                i14 = i4 & 512;
                if (i14 != 0) {
                }
                i17 = i4 & 1024;
                if (i17 != 0) {
                }
                i19 = i4 & 2048;
                if (i19 != 0) {
                }
                int i3122 = i18;
                if ((i4 & 4096) != 0) {
                }
                i20 = i3122;
                if (i19 == 2048) {
                }
                startRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                }
                if (i30 != 0) {
                }
                if (i6 != 0) {
                }
                if (i7 != 0) {
                }
                if (i8 != 0) {
                }
                if (i10 != 0) {
                }
                if (i11 != 0) {
                }
                if ((i4 & 128) != 0) {
                }
                if (i22 != 0) {
                }
                if (i23 == 0) {
                }
                if (i17 != 0) {
                }
                if (i25 != 0) {
                }
                function12 = function14;
                pageSize2 = fill;
                obj3 = m741PaddingValues0680j_4;
                obj4 = companion;
                composer2.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                int i3322 = i27 >> 6;
                int i3422 = ((i27 >> 3) & 14) | 24576 | ((i27 << 3) & 112) | (i27 & 896) | ((i27 >> 18) & 7168) | (i3322 & 458752) | (i3322 & 3670016);
                int i3522 = i27 << 9;
                LazyLayoutPagerKt.m961Pagerfs30GE4(obj4, state, obj3, z3, Orientation.Vertical, snapFlingBehavior3, z4, i26, f3, pageSize2, nestedScrollConnection2, function12, horizontal2, Alignment.Companion.getCenterVertically(), pageContent, composer2, i3422 | (29360128 & i3522) | (i3522 & 234881024) | ((i27 << 18) & 1879048192), ((i27 >> 12) & 896) | ((i20 << 3) & 112) | 3080 | ((i20 << 6) & 57344), 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier2 = obj4;
                paddingValues2 = obj3;
                pageSize3 = pageSize2;
                i28 = i26;
                f4 = f3;
                horizontal3 = horizontal2;
                snapFlingBehavior4 = snapFlingBehavior3;
                z5 = z4;
                function13 = function12;
                nestedScrollConnection3 = nestedScrollConnection2;
                z6 = z3;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            obj2 = paddingValues;
            i7 = i4 & 8;
            if (i7 != 0) {
            }
            i8 = i4 & 16;
            if (i8 == 0) {
            }
            i10 = i4 & 32;
            if (i10 == 0) {
            }
            i11 = i4 & 64;
            if (i11 == 0) {
            }
            if ((i2 & 29360128) == 0) {
            }
            i12 = i4 & 256;
            if (i12 == 0) {
            }
            i13 = i12;
            i14 = i4 & 512;
            if (i14 != 0) {
            }
            i17 = i4 & 1024;
            if (i17 != 0) {
            }
            i19 = i4 & 2048;
            if (i19 != 0) {
            }
            int i31222 = i18;
            if ((i4 & 4096) != 0) {
            }
            i20 = i31222;
            if (i19 == 2048) {
            }
            startRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
            }
            if (i30 != 0) {
            }
            if (i6 != 0) {
            }
            if (i7 != 0) {
            }
            if (i8 != 0) {
            }
            if (i10 != 0) {
            }
            if (i11 != 0) {
            }
            if ((i4 & 128) != 0) {
            }
            if (i22 != 0) {
            }
            if (i23 == 0) {
            }
            if (i17 != 0) {
            }
            if (i25 != 0) {
            }
            function12 = function14;
            pageSize2 = fill;
            obj3 = m741PaddingValues0680j_4;
            obj4 = companion;
            composer2.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            int i33222 = i27 >> 6;
            int i34222 = ((i27 >> 3) & 14) | 24576 | ((i27 << 3) & 112) | (i27 & 896) | ((i27 >> 18) & 7168) | (i33222 & 458752) | (i33222 & 3670016);
            int i35222 = i27 << 9;
            LazyLayoutPagerKt.m961Pagerfs30GE4(obj4, state, obj3, z3, Orientation.Vertical, snapFlingBehavior3, z4, i26, f3, pageSize2, nestedScrollConnection2, function12, horizontal2, Alignment.Companion.getCenterVertically(), pageContent, composer2, i34222 | (29360128 & i35222) | (i35222 & 234881024) | ((i27 << 18) & 1879048192), ((i27 >> 12) & 896) | ((i20 << 3) & 112) | 3080 | ((i20 << 6) & 57344), 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier2 = obj4;
            paddingValues2 = obj3;
            pageSize3 = pageSize2;
            i28 = i26;
            f4 = f3;
            horizontal3 = horizontal2;
            snapFlingBehavior4 = snapFlingBehavior3;
            z5 = z4;
            function13 = function12;
            nestedScrollConnection3 = nestedScrollConnection2;
            z6 = z3;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        obj = modifier;
        i6 = i4 & 4;
        if (i6 == 0) {
        }
        obj2 = paddingValues;
        i7 = i4 & 8;
        if (i7 != 0) {
        }
        i8 = i4 & 16;
        if (i8 == 0) {
        }
        i10 = i4 & 32;
        if (i10 == 0) {
        }
        i11 = i4 & 64;
        if (i11 == 0) {
        }
        if ((i2 & 29360128) == 0) {
        }
        i12 = i4 & 256;
        if (i12 == 0) {
        }
        i13 = i12;
        i14 = i4 & 512;
        if (i14 != 0) {
        }
        i17 = i4 & 1024;
        if (i17 != 0) {
        }
        i19 = i4 & 2048;
        if (i19 != 0) {
        }
        int i312222 = i18;
        if ((i4 & 4096) != 0) {
        }
        i20 = i312222;
        if (i19 == 2048) {
        }
        startRestartGroup.startDefaults();
        if ((i2 & 1) != 0) {
        }
        if (i30 != 0) {
        }
        if (i6 != 0) {
        }
        if (i7 != 0) {
        }
        if (i8 != 0) {
        }
        if (i10 != 0) {
        }
        if (i11 != 0) {
        }
        if ((i4 & 128) != 0) {
        }
        if (i22 != 0) {
        }
        if (i23 == 0) {
        }
        if (i17 != 0) {
        }
        if (i25 != 0) {
        }
        function12 = function14;
        pageSize2 = fill;
        obj3 = m741PaddingValues0680j_4;
        obj4 = companion;
        composer2.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        int i332222 = i27 >> 6;
        int i342222 = ((i27 >> 3) & 14) | 24576 | ((i27 << 3) & 112) | (i27 & 896) | ((i27 >> 18) & 7168) | (i332222 & 458752) | (i332222 & 3670016);
        int i352222 = i27 << 9;
        LazyLayoutPagerKt.m961Pagerfs30GE4(obj4, state, obj3, z3, Orientation.Vertical, snapFlingBehavior3, z4, i26, f3, pageSize2, nestedScrollConnection2, function12, horizontal2, Alignment.Companion.getCenterVertically(), pageContent, composer2, i342222 | (29360128 & i352222) | (i352222 & 234881024) | ((i27 << 18) & 1879048192), ((i27 >> 12) & 896) | ((i20 << 3) & 112) | 3080 | ((i20 << 6) & 57344), 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier2 = obj4;
        paddingValues2 = obj3;
        pageSize3 = pageSize2;
        i28 = i26;
        f4 = f3;
        horizontal3 = horizontal2;
        snapFlingBehavior4 = snapFlingBehavior3;
        z5 = z4;
        function13 = function12;
        nestedScrollConnection3 = nestedScrollConnection2;
        z6 = z3;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:226:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x012e  */
    @Deprecated(level = DeprecationLevel.ERROR, message = "Please use the overload without pageCount. pageCount should be provided through PagerState.", replaceWith = @ReplaceWith(expression = "VerticalPager(\n            modifier = modifier,\n            state = state,\n            pageSpacing = pageSpacing,\n            horizontalAlignment = horizontalAlignment,\n            userScrollEnabled = userScrollEnabled,\n            reverseLayout = reverseLayout,\n            contentPadding = contentPadding,\n            beyondBoundsPageCount = beyondBoundsPageCount,\n            pageSize = pageSize,\n            flingBehavior = flingBehavior,\n            key = key,\n            pageNestedScrollConnection = pageNestedScrollConnection,\n            pageContent = pageContent\n        )", imports = {"androidx.compose.foundation.gestures.Orientation", "androidx.compose.foundation.layout.PaddingValues", "androidx.compose.foundation.pager.PageSize", "androidx.compose.foundation.pager.PagerDefaults"}))
    /* renamed from: VerticalPager-AlbwjTQ  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m968VerticalPagerAlbwjTQ(int i, Modifier modifier, PagerState pagerState, PaddingValues paddingValues, PageSize pageSize, int i2, float f, Alignment.Horizontal horizontal, SnapFlingBehavior snapFlingBehavior, boolean z, boolean z2, Function1<? super Integer, ? extends Object> function1, NestedScrollConnection nestedScrollConnection, Function4<? super PagerScope, ? super Integer, ? super Composer, ? super Integer, Unit> pageContent, Composer composer, int i3, int i4, int i5) {
        int i6;
        Object obj;
        Object obj2;
        int i7;
        Object obj3;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        Object obj4;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        Modifier.Companion companion;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        PagerState pagerState2;
        SnapFlingBehavior snapFlingBehavior2;
        NestedScrollConnection nestedScrollConnection2;
        Object obj5;
        boolean z3;
        PaddingValues paddingValues2;
        PageSize pageSize2;
        int i29;
        Alignment.Horizontal horizontal2;
        float f2;
        Object obj6;
        boolean z4;
        Function1<? super Integer, ? extends Object> function12;
        Composer composer2;
        Modifier modifier2;
        PagerState pagerState3;
        PageSize pageSize3;
        int i30;
        float f3;
        Alignment.Horizontal horizontal3;
        SnapFlingBehavior snapFlingBehavior3;
        boolean z5;
        boolean z6;
        Function1<? super Integer, ? extends Object> function13;
        NestedScrollConnection nestedScrollConnection3;
        ScopeUpdateScope endRestartGroup;
        int i31;
        int i32;
        Intrinsics.checkNotNullParameter(pageContent, "pageContent");
        Composer startRestartGroup = composer.startRestartGroup(-1904588400);
        ComposerKt.sourceInformation(startRestartGroup, "C(VerticalPager)P(7,5,12,1,9!1,10:c#ui.unit.Dp,3!1,13,11!1,8)400@20798L13,400@20779L32,406@21105L28,415@21453L618:Pager.kt#g6yjnt");
        if ((i5 & 1) != 0) {
            i6 = i3 | 6;
        } else if ((i3 & 14) == 0) {
            i6 = (startRestartGroup.changed(i) ? 4 : 2) | i3;
        } else {
            i6 = i3;
        }
        int i33 = i5 & 2;
        if (i33 != 0) {
            i6 |= 48;
        } else if ((i3 & 112) == 0) {
            obj = modifier;
            i6 |= startRestartGroup.changed(obj) ? 32 : 16;
            if ((i3 & 896) != 0) {
                if ((i5 & 4) == 0) {
                    obj2 = pagerState;
                    if (startRestartGroup.changed(obj2)) {
                        i32 = 256;
                        i6 |= i32;
                    }
                } else {
                    obj2 = pagerState;
                }
                i32 = 128;
                i6 |= i32;
            } else {
                obj2 = pagerState;
            }
            i7 = i5 & 8;
            if (i7 == 0) {
                i6 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
            } else if ((i3 & 7168) == 0) {
                obj3 = paddingValues;
                i6 |= startRestartGroup.changed(obj3) ? 2048 : 1024;
                i8 = i5 & 16;
                if (i8 != 0) {
                    i6 |= 24576;
                } else if ((i3 & 57344) == 0) {
                    i6 |= startRestartGroup.changed(pageSize) ? 16384 : 8192;
                }
                i9 = i5 & 32;
                if (i9 != 0) {
                    i6 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i3 & 458752) == 0) {
                    i6 |= startRestartGroup.changed(i2) ? 131072 : 65536;
                }
                i10 = i5 & 64;
                if (i10 != 0) {
                    i6 |= 1572864;
                } else if ((i3 & 3670016) == 0) {
                    i6 |= startRestartGroup.changed(f) ? 1048576 : 524288;
                }
                i11 = i5 & 128;
                if (i11 != 0) {
                    i6 |= 12582912;
                } else if ((i3 & 29360128) == 0) {
                    i12 = i11;
                    i6 |= startRestartGroup.changed(horizontal) ? 8388608 : 4194304;
                    if ((i3 & 234881024) != 0) {
                        if ((i5 & 256) == 0) {
                            obj4 = snapFlingBehavior;
                            if (startRestartGroup.changed(obj4)) {
                                i31 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                                i6 |= i31;
                            }
                        } else {
                            obj4 = snapFlingBehavior;
                        }
                        i31 = 33554432;
                        i6 |= i31;
                    } else {
                        obj4 = snapFlingBehavior;
                    }
                    i13 = i5 & 512;
                    if (i13 == 0) {
                        i6 |= C.ENCODING_PCM_32BIT;
                    } else if ((i3 & 1879048192) == 0) {
                        i14 = i13;
                        i6 |= startRestartGroup.changed(z) ? 536870912 : 268435456;
                        i15 = i5 & 1024;
                        if (i15 != 0) {
                            i17 = i4 | 6;
                            i16 = i15;
                        } else if ((i4 & 14) == 0) {
                            i16 = i15;
                            i17 = i4 | (startRestartGroup.changed(z2) ? 4 : 2);
                        } else {
                            i16 = i15;
                            i17 = i4;
                        }
                        i18 = i5 & 2048;
                        if (i18 != 0) {
                            i19 = i18;
                            i20 = i17 | 48;
                        } else {
                            if ((i4 & 112) == 0) {
                                i19 = i18;
                                i17 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
                            } else {
                                i19 = i18;
                            }
                            i20 = i17;
                        }
                        i21 = i5 & 4096;
                        if (i21 != 0) {
                            i20 |= 128;
                        }
                        if ((i5 & 8192) != 0) {
                            i20 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
                        } else if ((i4 & 7168) == 0) {
                            i20 |= startRestartGroup.changedInstance(pageContent) ? 2048 : 1024;
                        }
                        i22 = i20;
                        if (i21 == 4096 || (1533916891 & i6) != 306783378 || (i22 & 5851) != 1170 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            if ((i3 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                companion = i33 != 0 ? Modifier.Companion : obj;
                                if ((i5 & 4) != 0) {
                                    Integer valueOf = Integer.valueOf(i);
                                    startRestartGroup.startReplaceableGroup(1157296644);
                                    ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                                    boolean changed = startRestartGroup.changed(valueOf);
                                    PagerKt$VerticalPager$2$1 rememberedValue = startRestartGroup.rememberedValue();
                                    if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                                        rememberedValue = new PagerKt$VerticalPager$2$1(i);
                                        startRestartGroup.updateRememberedValue(rememberedValue);
                                    }
                                    startRestartGroup.endReplaceableGroup();
                                    int i34 = i6;
                                    i24 = i21;
                                    i25 = i12;
                                    i26 = i16;
                                    i27 = i19;
                                    i28 = i14;
                                    pagerState2 = PagerStateKt.rememberPagerState(0, 0.0f, (Function0) rememberedValue, startRestartGroup, 0, 3);
                                    i23 = i34 & (-897);
                                } else {
                                    i23 = i6;
                                    i24 = i21;
                                    i25 = i12;
                                    i26 = i16;
                                    i27 = i19;
                                    i28 = i14;
                                    pagerState2 = obj2;
                                }
                                PaddingValues m741PaddingValues0680j_4 = i7 != 0 ? PaddingKt.m741PaddingValues0680j_4(Dp.m5607constructorimpl(0)) : paddingValues;
                                PageSize.Fill fill = i8 != 0 ? PageSize.Fill.INSTANCE : pageSize;
                                int i35 = i9 != 0 ? 0 : i2;
                                float m5607constructorimpl = i10 != 0 ? Dp.m5607constructorimpl(0) : f;
                                Alignment.Horizontal centerHorizontally = i25 != 0 ? Alignment.Companion.getCenterHorizontally() : horizontal;
                                if ((i5 & 256) != 0) {
                                    snapFlingBehavior2 = PagerDefaults.INSTANCE.m965flingBehaviorPfoAEA0(pagerState2, null, null, null, null, 0.0f, 0.0f, startRestartGroup, ((i23 >> 6) & 14) | 12582912, WebSocketProtocol.PAYLOAD_SHORT);
                                    i23 &= -234881025;
                                } else {
                                    snapFlingBehavior2 = snapFlingBehavior;
                                }
                                boolean z7 = i28 != 0 ? true : z;
                                boolean z8 = i26 == 0 ? z2 : false;
                                Function1<? super Integer, ? extends Object> function14 = i27 != 0 ? null : function1;
                                Object obj7 = companion;
                                if (i24 != 0) {
                                    i22 &= -897;
                                    nestedScrollConnection2 = PagerDefaults.INSTANCE.pageNestedScrollConnection(Orientation.Vertical);
                                    obj5 = pagerState2;
                                    i6 = i23;
                                    z3 = z8;
                                    paddingValues2 = m741PaddingValues0680j_4;
                                    pageSize2 = fill;
                                    i29 = i35;
                                    horizontal2 = centerHorizontally;
                                    f2 = m5607constructorimpl;
                                    obj6 = snapFlingBehavior2;
                                    z4 = z7;
                                    function12 = function14;
                                    companion = obj7;
                                } else {
                                    nestedScrollConnection2 = nestedScrollConnection;
                                    obj5 = pagerState2;
                                    i6 = i23;
                                    z3 = z8;
                                    paddingValues2 = m741PaddingValues0680j_4;
                                    pageSize2 = fill;
                                    i29 = i35;
                                    horizontal2 = centerHorizontally;
                                    f2 = m5607constructorimpl;
                                    obj6 = snapFlingBehavior2;
                                    z4 = z7;
                                    function12 = function14;
                                }
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i5 & 4) != 0) {
                                    i6 &= -897;
                                }
                                if ((i5 & 256) != 0) {
                                    i6 &= -234881025;
                                }
                                if (i21 != 0) {
                                    i22 &= -897;
                                }
                                pageSize2 = pageSize;
                                i29 = i2;
                                f2 = f;
                                horizontal2 = horizontal;
                                z4 = z;
                                z3 = z2;
                                function12 = function1;
                                nestedScrollConnection2 = nestedScrollConnection;
                                paddingValues2 = obj3;
                                obj6 = obj4;
                                companion = obj;
                                obj5 = obj2;
                            }
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1904588400, i6, i22, "androidx.compose.foundation.pager.VerticalPager (Pager.kt:397)");
                            }
                            int i36 = i6 >> 3;
                            int i37 = i6 >> 9;
                            int i38 = (i36 & 896) | (i36 & 14) | 24576 | (i36 & 112) | ((i22 << 9) & 7168) | (i37 & 458752) | (i37 & 3670016);
                            int i39 = i6 << 6;
                            composer2 = startRestartGroup;
                            LazyLayoutPagerKt.m961Pagerfs30GE4(companion, obj5, paddingValues2, z3, Orientation.Vertical, obj6, z4, i29, f2, pageSize2, nestedScrollConnection2, function12, horizontal2, Alignment.Companion.getCenterVertically(), pageContent, composer2, i38 | (29360128 & i39) | (i39 & 234881024) | ((i6 << 15) & 1879048192), ((i6 >> 15) & 896) | (i22 & 112) | 3080 | ((i22 << 3) & 57344), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier2 = companion;
                            pagerState3 = obj5;
                            obj3 = paddingValues2;
                            pageSize3 = pageSize2;
                            i30 = i29;
                            f3 = f2;
                            horizontal3 = horizontal2;
                            snapFlingBehavior3 = obj6;
                            z5 = z4;
                            z6 = z3;
                            function13 = function12;
                            nestedScrollConnection3 = nestedScrollConnection2;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            i30 = i2;
                            f3 = f;
                            horizontal3 = horizontal;
                            function13 = function1;
                            nestedScrollConnection3 = nestedScrollConnection;
                            modifier2 = obj;
                            pagerState3 = obj2;
                            composer2 = startRestartGroup;
                            z5 = z;
                            z6 = z2;
                            snapFlingBehavior3 = obj4;
                            pageSize3 = pageSize;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                            return;
                        }
                        endRestartGroup.updateScope(new PagerKt$VerticalPager$3(i, modifier2, pagerState3, obj3, pageSize3, i30, f3, horizontal3, snapFlingBehavior3, z5, z6, function13, nestedScrollConnection3, pageContent, i3, i4, i5));
                        return;
                    }
                    i14 = i13;
                    i15 = i5 & 1024;
                    if (i15 != 0) {
                    }
                    i18 = i5 & 2048;
                    if (i18 != 0) {
                    }
                    i21 = i5 & 4096;
                    if (i21 != 0) {
                    }
                    if ((i5 & 8192) != 0) {
                    }
                    i22 = i20;
                    if (i21 == 4096) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i3 & 1) != 0) {
                    }
                    if (i33 != 0) {
                    }
                    if ((i5 & 4) != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (i9 != 0) {
                    }
                    if (i10 != 0) {
                    }
                    if (i25 != 0) {
                    }
                    if ((i5 & 256) != 0) {
                    }
                    if (i28 != 0) {
                    }
                    if (i26 == 0) {
                    }
                    if (i27 != 0) {
                    }
                    Object obj72 = companion;
                    if (i24 != 0) {
                    }
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    int i362 = i6 >> 3;
                    int i372 = i6 >> 9;
                    int i382 = (i362 & 896) | (i362 & 14) | 24576 | (i362 & 112) | ((i22 << 9) & 7168) | (i372 & 458752) | (i372 & 3670016);
                    int i392 = i6 << 6;
                    composer2 = startRestartGroup;
                    LazyLayoutPagerKt.m961Pagerfs30GE4(companion, obj5, paddingValues2, z3, Orientation.Vertical, obj6, z4, i29, f2, pageSize2, nestedScrollConnection2, function12, horizontal2, Alignment.Companion.getCenterVertically(), pageContent, composer2, i382 | (29360128 & i392) | (i392 & 234881024) | ((i6 << 15) & 1879048192), ((i6 >> 15) & 896) | (i22 & 112) | 3080 | ((i22 << 3) & 57344), 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier2 = companion;
                    pagerState3 = obj5;
                    obj3 = paddingValues2;
                    pageSize3 = pageSize2;
                    i30 = i29;
                    f3 = f2;
                    horizontal3 = horizontal2;
                    snapFlingBehavior3 = obj6;
                    z5 = z4;
                    z6 = z3;
                    function13 = function12;
                    nestedScrollConnection3 = nestedScrollConnection2;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                i12 = i11;
                if ((i3 & 234881024) != 0) {
                }
                i13 = i5 & 512;
                if (i13 == 0) {
                }
                i14 = i13;
                i15 = i5 & 1024;
                if (i15 != 0) {
                }
                i18 = i5 & 2048;
                if (i18 != 0) {
                }
                i21 = i5 & 4096;
                if (i21 != 0) {
                }
                if ((i5 & 8192) != 0) {
                }
                i22 = i20;
                if (i21 == 4096) {
                }
                startRestartGroup.startDefaults();
                if ((i3 & 1) != 0) {
                }
                if (i33 != 0) {
                }
                if ((i5 & 4) != 0) {
                }
                if (i7 != 0) {
                }
                if (i8 != 0) {
                }
                if (i9 != 0) {
                }
                if (i10 != 0) {
                }
                if (i25 != 0) {
                }
                if ((i5 & 256) != 0) {
                }
                if (i28 != 0) {
                }
                if (i26 == 0) {
                }
                if (i27 != 0) {
                }
                Object obj722 = companion;
                if (i24 != 0) {
                }
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                int i3622 = i6 >> 3;
                int i3722 = i6 >> 9;
                int i3822 = (i3622 & 896) | (i3622 & 14) | 24576 | (i3622 & 112) | ((i22 << 9) & 7168) | (i3722 & 458752) | (i3722 & 3670016);
                int i3922 = i6 << 6;
                composer2 = startRestartGroup;
                LazyLayoutPagerKt.m961Pagerfs30GE4(companion, obj5, paddingValues2, z3, Orientation.Vertical, obj6, z4, i29, f2, pageSize2, nestedScrollConnection2, function12, horizontal2, Alignment.Companion.getCenterVertically(), pageContent, composer2, i3822 | (29360128 & i3922) | (i3922 & 234881024) | ((i6 << 15) & 1879048192), ((i6 >> 15) & 896) | (i22 & 112) | 3080 | ((i22 << 3) & 57344), 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier2 = companion;
                pagerState3 = obj5;
                obj3 = paddingValues2;
                pageSize3 = pageSize2;
                i30 = i29;
                f3 = f2;
                horizontal3 = horizontal2;
                snapFlingBehavior3 = obj6;
                z5 = z4;
                z6 = z3;
                function13 = function12;
                nestedScrollConnection3 = nestedScrollConnection2;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            obj3 = paddingValues;
            i8 = i5 & 16;
            if (i8 != 0) {
            }
            i9 = i5 & 32;
            if (i9 != 0) {
            }
            i10 = i5 & 64;
            if (i10 != 0) {
            }
            i11 = i5 & 128;
            if (i11 != 0) {
            }
            i12 = i11;
            if ((i3 & 234881024) != 0) {
            }
            i13 = i5 & 512;
            if (i13 == 0) {
            }
            i14 = i13;
            i15 = i5 & 1024;
            if (i15 != 0) {
            }
            i18 = i5 & 2048;
            if (i18 != 0) {
            }
            i21 = i5 & 4096;
            if (i21 != 0) {
            }
            if ((i5 & 8192) != 0) {
            }
            i22 = i20;
            if (i21 == 4096) {
            }
            startRestartGroup.startDefaults();
            if ((i3 & 1) != 0) {
            }
            if (i33 != 0) {
            }
            if ((i5 & 4) != 0) {
            }
            if (i7 != 0) {
            }
            if (i8 != 0) {
            }
            if (i9 != 0) {
            }
            if (i10 != 0) {
            }
            if (i25 != 0) {
            }
            if ((i5 & 256) != 0) {
            }
            if (i28 != 0) {
            }
            if (i26 == 0) {
            }
            if (i27 != 0) {
            }
            Object obj7222 = companion;
            if (i24 != 0) {
            }
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            int i36222 = i6 >> 3;
            int i37222 = i6 >> 9;
            int i38222 = (i36222 & 896) | (i36222 & 14) | 24576 | (i36222 & 112) | ((i22 << 9) & 7168) | (i37222 & 458752) | (i37222 & 3670016);
            int i39222 = i6 << 6;
            composer2 = startRestartGroup;
            LazyLayoutPagerKt.m961Pagerfs30GE4(companion, obj5, paddingValues2, z3, Orientation.Vertical, obj6, z4, i29, f2, pageSize2, nestedScrollConnection2, function12, horizontal2, Alignment.Companion.getCenterVertically(), pageContent, composer2, i38222 | (29360128 & i39222) | (i39222 & 234881024) | ((i6 << 15) & 1879048192), ((i6 >> 15) & 896) | (i22 & 112) | 3080 | ((i22 << 3) & 57344), 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier2 = companion;
            pagerState3 = obj5;
            obj3 = paddingValues2;
            pageSize3 = pageSize2;
            i30 = i29;
            f3 = f2;
            horizontal3 = horizontal2;
            snapFlingBehavior3 = obj6;
            z5 = z4;
            z6 = z3;
            function13 = function12;
            nestedScrollConnection3 = nestedScrollConnection2;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        obj = modifier;
        if ((i3 & 896) != 0) {
        }
        i7 = i5 & 8;
        if (i7 == 0) {
        }
        obj3 = paddingValues;
        i8 = i5 & 16;
        if (i8 != 0) {
        }
        i9 = i5 & 32;
        if (i9 != 0) {
        }
        i10 = i5 & 64;
        if (i10 != 0) {
        }
        i11 = i5 & 128;
        if (i11 != 0) {
        }
        i12 = i11;
        if ((i3 & 234881024) != 0) {
        }
        i13 = i5 & 512;
        if (i13 == 0) {
        }
        i14 = i13;
        i15 = i5 & 1024;
        if (i15 != 0) {
        }
        i18 = i5 & 2048;
        if (i18 != 0) {
        }
        i21 = i5 & 4096;
        if (i21 != 0) {
        }
        if ((i5 & 8192) != 0) {
        }
        i22 = i20;
        if (i21 == 4096) {
        }
        startRestartGroup.startDefaults();
        if ((i3 & 1) != 0) {
        }
        if (i33 != 0) {
        }
        if ((i5 & 4) != 0) {
        }
        if (i7 != 0) {
        }
        if (i8 != 0) {
        }
        if (i9 != 0) {
        }
        if (i10 != 0) {
        }
        if (i25 != 0) {
        }
        if ((i5 & 256) != 0) {
        }
        if (i28 != 0) {
        }
        if (i26 == 0) {
        }
        if (i27 != 0) {
        }
        Object obj72222 = companion;
        if (i24 != 0) {
        }
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        int i362222 = i6 >> 3;
        int i372222 = i6 >> 9;
        int i382222 = (i362222 & 896) | (i362222 & 14) | 24576 | (i362222 & 112) | ((i22 << 9) & 7168) | (i372222 & 458752) | (i372222 & 3670016);
        int i392222 = i6 << 6;
        composer2 = startRestartGroup;
        LazyLayoutPagerKt.m961Pagerfs30GE4(companion, obj5, paddingValues2, z3, Orientation.Vertical, obj6, z4, i29, f2, pageSize2, nestedScrollConnection2, function12, horizontal2, Alignment.Companion.getCenterVertically(), pageContent, composer2, i382222 | (29360128 & i392222) | (i392222 & 234881024) | ((i6 << 15) & 1879048192), ((i6 >> 15) & 896) | (i22 & 112) | 3080 | ((i22 << 3) & 57344), 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier2 = companion;
        pagerState3 = obj5;
        obj3 = paddingValues2;
        pageSize3 = pageSize2;
        i30 = i29;
        f3 = f2;
        horizontal3 = horizontal2;
        snapFlingBehavior3 = obj6;
        z5 = z4;
        z6 = z3;
        function13 = function12;
        nestedScrollConnection3 = nestedScrollConnection2;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapLayoutInfoProvider SnapLayoutInfoProvider(final PagerState pagerState, final PagerSnapDistance pagerSnapDistance, final DecayAnimationSpec<Float> decayAnimationSpec, final float f) {
        return new SnapLayoutInfoProvider() { // from class: androidx.compose.foundation.pager.PagerKt$SnapLayoutInfoProvider$1
            public final boolean isValidDistance(float f2) {
                if (!(f2 == Float.POSITIVE_INFINITY)) {
                    if (!(f2 == Float.NEGATIVE_INFINITY)) {
                        return true;
                    }
                }
                return false;
            }

            public final PagerLayoutInfo getLayoutInfo() {
                return PagerState.this.getLayoutInfo$foundation_release();
            }

            @Override // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
            public float calculateSnappingOffset(Density density, float f2) {
                boolean isScrollingForward;
                float dragGestureDelta;
                float pageSize;
                Intrinsics.checkNotNullParameter(density, "<this>");
                List<PageInfo> visiblePagesInfo = getLayoutInfo().getVisiblePagesInfo();
                int size = visiblePagesInfo.size();
                float f3 = Float.NEGATIVE_INFINITY;
                float f4 = Float.POSITIVE_INFINITY;
                for (int i = 0; i < size; i++) {
                    PageInfo pageInfo = visiblePagesInfo.get(i);
                    float calculateDistanceToDesiredSnapPosition = SnapPositionInLayoutKt.calculateDistanceToDesiredSnapPosition(density, PagerLayoutInfoKt.getMainAxisViewportSize(getLayoutInfo()), getLayoutInfo().getBeforeContentPadding(), getLayoutInfo().getAfterContentPadding(), getLayoutInfo().getPageSize(), pageInfo.getOffset(), pageInfo.getIndex(), PagerStateKt.getSnapAlignmentStartToStart());
                    if (calculateDistanceToDesiredSnapPosition <= 0.0f && calculateDistanceToDesiredSnapPosition > f3) {
                        f3 = calculateDistanceToDesiredSnapPosition;
                    }
                    if (calculateDistanceToDesiredSnapPosition >= 0.0f && calculateDistanceToDesiredSnapPosition < f4) {
                        f4 = calculateDistanceToDesiredSnapPosition;
                    }
                }
                isScrollingForward = PagerKt.isScrollingForward(PagerState.this);
                dragGestureDelta = PagerKt.dragGestureDelta(PagerState.this);
                float pageSize2 = (dragGestureDelta / getLayoutInfo().getPageSize()) - ((int) pageSize);
                float signum = Math.signum(f2);
                if (signum == 0.0f) {
                    f3 = Math.abs(pageSize2) > f ? f4 : f4;
                } else if (!(signum == 1.0f)) {
                    if (!(signum == -1.0f)) {
                        f3 = 0.0f;
                    }
                }
                if (isValidDistance(f3)) {
                    return f3;
                }
                return 0.0f;
            }

            @Override // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
            public float calculateSnapStepSize(Density density) {
                Intrinsics.checkNotNullParameter(density, "<this>");
                return getLayoutInfo().getPageSize();
            }

            @Override // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
            public float calculateApproachOffset(Density density, float f2) {
                int firstVisiblePage$foundation_release;
                PageInfo pageInfo;
                double floor;
                Intrinsics.checkNotNullParameter(density, "<this>");
                int pageSize$foundation_release = PagerState.this.getPageSize$foundation_release() + PagerState.this.getPageSpacing$foundation_release();
                float calculateTargetValue = DecayAnimationSpecKt.calculateTargetValue(decayAnimationSpec, 0.0f, f2);
                if (f2 < 0.0f) {
                    firstVisiblePage$foundation_release = PagerState.this.getFirstVisiblePage$foundation_release() + 1;
                } else {
                    firstVisiblePage$foundation_release = PagerState.this.getFirstVisiblePage$foundation_release();
                }
                List<PageInfo> visiblePagesInfo = getLayoutInfo().getVisiblePagesInfo();
                int size = visiblePagesInfo.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        pageInfo = null;
                        break;
                    }
                    pageInfo = visiblePagesInfo.get(i);
                    if (pageInfo.getIndex() == firstVisiblePage$foundation_release) {
                        break;
                    }
                    i++;
                }
                PageInfo pageInfo2 = pageInfo;
                int offset = pageInfo2 != null ? pageInfo2.getOffset() : 0;
                float f3 = ((firstVisiblePage$foundation_release * pageSize$foundation_release) + calculateTargetValue) / pageSize$foundation_release;
                if (f2 > 0.0f) {
                    floor = Math.ceil(f3);
                } else {
                    floor = Math.floor(f3);
                }
                int coerceAtLeast = RangesKt.coerceAtLeast(Math.abs((RangesKt.coerceIn(pagerSnapDistance.calculateTargetPage(firstVisiblePage$foundation_release, RangesKt.coerceIn((int) floor, 0, PagerState.this.getPageCount()), f2, PagerState.this.getPageSize$foundation_release(), PagerState.this.getPageSpacing$foundation_release()), 0, PagerState.this.getPageCount()) - firstVisiblePage$foundation_release) * pageSize$foundation_release) - Math.abs(offset), 0);
                return coerceAtLeast == 0 ? coerceAtLeast : coerceAtLeast * Math.signum(f2);
            }
        };
    }

    public static final Modifier pagerSemantics(Modifier modifier, PagerState state, boolean z, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        composer.startReplaceableGroup(1509835088);
        ComposerKt.sourceInformation(composer, "C(pagerSemantics)P(1)843@38529L24:Pager.kt#g6yjnt");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1509835088, i, -1, "androidx.compose.foundation.pager.pagerSemantics (Pager.kt:842)");
        }
        composer.startReplaceableGroup(773894976);
        ComposerKt.sourceInformation(composer, "CC(rememberCoroutineScope)488@20446L144:Effects.kt#9igjgp");
        composer.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(composer, "CC(remember):Composables.kt#9igjgp");
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer));
            composer.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
            rememberedValue = compositionScopedCoroutineScopeCanceller;
        }
        composer.endReplaceableGroup();
        CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
        composer.endReplaceableGroup();
        Modifier then = modifier.then(SemanticsModifierKt.semantics$default(Modifier.Companion, false, new PagerKt$pagerSemantics$1(z, state, coroutineScope), 1, null));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return then;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean pagerSemantics$performForwardPaging(PagerState pagerState, CoroutineScope coroutineScope) {
        if (pagerState.getCanScrollForward()) {
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new PagerKt$pagerSemantics$performForwardPaging$1(pagerState, null), 3, null);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean pagerSemantics$performBackwardPaging(PagerState pagerState, CoroutineScope coroutineScope) {
        if (pagerState.getCanScrollBackward()) {
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new PagerKt$pagerSemantics$performBackwardPaging$1(pagerState, null), 3, null);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isScrollingForward(PagerState pagerState) {
        return dragGestureDelta(pagerState) < 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float dragGestureDelta(PagerState pagerState) {
        if (pagerState.getLayoutInfo$foundation_release().getOrientation() == Orientation.Horizontal) {
            return Offset.m3018getXimpl(pagerState.m977getUpDownDifferenceF1C5BW0$foundation_release());
        }
        return Offset.m3019getYimpl(pagerState.m977getUpDownDifferenceF1C5BW0$foundation_release());
    }
}
