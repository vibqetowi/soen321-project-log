package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material3.tokens.ListTokens;
import androidx.compose.material3.tokens.TypographyKeyTokens;
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
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.app.FrameMetricsAggregator;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.google.android.exoplayer2.C;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ifriend.keychain.cipherStorage.CipherStorageKeystoreRsaEcb;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ListItem.kt */
@Metadata(d1 = {"\u0000^\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a¬\u0001\u0010\b\u001a\u00020\t2\u0011\u0010\n\u001a\r\u0012\u0004\u0012\u00020\t0\u000b¢\u0006\u0002\b\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\u0015\b\u0002\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b¢\u0006\u0002\b\f2\u0015\b\u0002\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b¢\u0006\u0002\b\f2\u0015\b\u0002\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b¢\u0006\u0002\b\f2\u0015\b\u0002\u0010\u0012\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b¢\u0006\u0002\b\f2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00012\b\b\u0002\u0010\u0016\u001a\u00020\u0001H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u007f\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u0015\u001a\u00020\u00012\b\b\u0002\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u001f\u001a\u00020 2\u001c\u0010!\u001a\u0018\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\t0\"¢\u0006\u0002\b\f¢\u0006\u0002\b$H\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b%\u0010&\u001a8\u0010'\u001a\u00020\t2\u0006\u0010(\u001a\u00020\u001c2\u0006\u0010)\u001a\u00020*2\u0011\u0010!\u001a\r\u0012\u0004\u0012\u00020\t0\u000b¢\u0006\u0002\b\fH\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b+\u0010,\u001a<\u0010-\u001a\u00020\t*\u00020#2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010.\u001a\u00020/2\u0011\u0010!\u001a\r\u0012\u0004\u0012\u00020\t0\u000b¢\u0006\u0002\b\fH\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b0\u00101\u001a<\u00102\u001a\u00020\t*\u00020#2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010.\u001a\u00020/2\u0011\u0010!\u001a\r\u0012\u0004\u0012\u00020\t0\u000b¢\u0006\u0002\b\fH\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b3\u00101\"\u0013\u0010\u0000\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0003\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0004\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0005\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0006\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0007\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u00064"}, d2 = {"ContentEndPadding", "Landroidx/compose/ui/unit/Dp;", "F", "LeadingContentEndPadding", "ListItemHorizontalPadding", "ListItemThreeLineVerticalPadding", "ListItemVerticalPadding", "TrailingHorizontalPadding", "ListItem", "", "headlineContent", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "modifier", "Landroidx/compose/ui/Modifier;", "overlineContent", "supportingContent", "leadingContent", "trailingContent", "colors", "Landroidx/compose/material3/ListItemColors;", "tonalElevation", "shadowElevation", "ListItem-HXNGIdc", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/material3/ListItemColors;FFLandroidx/compose/runtime/Composer;II)V", "shape", "Landroidx/compose/ui/graphics/Shape;", "containerColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "minHeight", "paddingValues", "Landroidx/compose/foundation/layout/PaddingValues;", FirebaseAnalytics.Param.CONTENT, "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "Lkotlin/ExtensionFunctionType;", "ListItem-xOgov6c", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJFFFLandroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "ProvideTextStyleFromToken", "color", "textToken", "Landroidx/compose/material3/tokens/TypographyKeyTokens;", "ProvideTextStyleFromToken-3J-VO9M", "(JLandroidx/compose/material3/tokens/TypographyKeyTokens;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "LeadingContent", "topAlign", "", "LeadingContent-3IgeMak", "(Landroidx/compose/foundation/layout/RowScope;JZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "TrailingContent", "TrailingContent-3IgeMak", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ListItemKt {
    private static final float ContentEndPadding;
    private static final float LeadingContentEndPadding;
    private static final float ListItemHorizontalPadding;
    private static final float ListItemThreeLineVerticalPadding;
    private static final float ListItemVerticalPadding;
    private static final float TrailingHorizontalPadding;

    /* JADX WARN: Removed duplicated region for block: B:102:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:197:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x010e  */
    /* renamed from: ListItem-HXNGIdc  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1850ListItemHXNGIdc(Function2<? super Composer, ? super Integer, Unit> headlineContent, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, ListItemColors listItemColors, float f, float f2, Composer composer, int i, int i2) {
        int i3;
        int i4;
        Object obj;
        int i5;
        Object obj2;
        int i6;
        Object obj3;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        float f3;
        Modifier.Companion companion;
        Object obj4;
        Function2<? super Composer, ? super Integer, Unit> function25;
        int i12;
        int i13;
        ListItemColors listItemColors2;
        float m1848getElevationD9Ej5fM;
        float m1848getElevationD9Ej5fM2;
        int i14;
        ListItemColors listItemColors3;
        Function2<? super Composer, ? super Integer, Unit> function26;
        ComposableLambda composableLambda;
        int m1867getListItemType7AlIA9s$material3_release;
        Function2<? super Composer, ? super Integer, Unit> function27;
        boolean z;
        ComposableLambda composableLambda2;
        Function2<? super Composer, ? super Integer, Unit> function28;
        float m2551getListItemTwoLineContainerHeightD9Ej5fM;
        float f4;
        Function2<? super Composer, ? super Integer, Unit> function29;
        Function2<? super Composer, ? super Integer, Unit> function210;
        Function2<? super Composer, ? super Integer, Unit> function211;
        ListItemColors listItemColors4;
        Modifier modifier2;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(headlineContent, "headlineContent");
        Composer startRestartGroup = composer.startRestartGroup(-1647707763);
        ComposerKt.sourceInformation(startRestartGroup, "C(ListItem)P(1,3,4,6,2,8!1,7:c#ui.unit.Dp,5:c#ui.unit.Dp)80@3784L8,155@6557L16,156@6611L29,153@6486L1021:ListItem.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changedInstance(headlineContent) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i15 = i2 & 2;
        if (i15 != 0) {
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
                    obj2 = function22;
                    i3 |= startRestartGroup.changedInstance(obj2) ? 2048 : 1024;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else if ((i & 57344) == 0) {
                        obj3 = function23;
                        i3 |= startRestartGroup.changedInstance(obj3) ? 16384 : 8192;
                        i7 = i2 & 32;
                        if (i7 != 0) {
                            i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        } else if ((i & 458752) == 0) {
                            i3 |= startRestartGroup.changedInstance(function24) ? 131072 : 65536;
                            if ((i & 3670016) == 0) {
                                i3 |= ((i2 & 64) == 0 && startRestartGroup.changed(listItemColors)) ? 1048576 : 524288;
                            }
                            i8 = i2 & 128;
                            if (i8 == 0) {
                                i3 |= 12582912;
                            } else if ((i & 29360128) == 0) {
                                i9 = i8;
                                i3 |= startRestartGroup.changed(f) ? 8388608 : 4194304;
                                i10 = i2 & 256;
                                if (i10 != 0) {
                                    i3 |= 100663296;
                                } else if ((i & 234881024) == 0) {
                                    i11 = i10;
                                    f3 = f2;
                                    i3 |= startRestartGroup.changed(f3) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                                    if ((i3 & 191739611) == 38347922 || !startRestartGroup.getSkipping()) {
                                        startRestartGroup.startDefaults();
                                        ComposableLambda composableLambda3 = null;
                                        if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                            companion = i15 == 0 ? Modifier.Companion : modifier;
                                            if (i4 != 0) {
                                                obj = null;
                                            }
                                            if (i5 != 0) {
                                                obj2 = null;
                                            }
                                            obj4 = i6 == 0 ? null : obj3;
                                            function25 = i7 == 0 ? null : function24;
                                            if ((i2 & 64) == 0) {
                                                i12 = i9;
                                                i13 = i11;
                                                listItemColors2 = ListItemDefaults.INSTANCE.m1847colorsJ08w3E(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, startRestartGroup, C.ENCODING_PCM_32BIT, FrameMetricsAggregator.EVERY_DURATION);
                                                i3 &= -3670017;
                                            } else {
                                                i12 = i9;
                                                i13 = i11;
                                                listItemColors2 = listItemColors;
                                            }
                                            m1848getElevationD9Ej5fM = i12 == 0 ? ListItemDefaults.INSTANCE.m1848getElevationD9Ej5fM() : f;
                                            m1848getElevationD9Ej5fM2 = i13 == 0 ? ListItemDefaults.INSTANCE.m1848getElevationD9Ej5fM() : f2;
                                            ListItemColors listItemColors5 = listItemColors2;
                                            i14 = i3;
                                            listItemColors3 = listItemColors5;
                                        } else {
                                            startRestartGroup.skipToGroupEnd();
                                            if ((i2 & 64) != 0) {
                                                i3 &= -3670017;
                                            }
                                            companion = modifier;
                                            function25 = function24;
                                            m1848getElevationD9Ej5fM = f;
                                            i14 = i3;
                                            obj4 = obj3;
                                            m1848getElevationD9Ej5fM2 = f3;
                                            listItemColors3 = listItemColors;
                                        }
                                        startRestartGroup.endDefaults();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1647707763, i14, -1, "androidx.compose.material3.ListItem (ListItem.kt:73)");
                                        }
                                        ComposableLambda composableLambda4 = ComposableLambdaKt.composableLambda(startRestartGroup, -403249643, true, new ListItemKt$ListItem$decoratedHeadlineContent$1(listItemColors3, i14, headlineContent));
                                        ComposableLambda composableLambda5 = obj2 == null ? ComposableLambdaKt.composableLambda(startRestartGroup, -1020860251, true, new ListItemKt$ListItem$decoratedSupportingContent$1$1(listItemColors3, i14, obj2)) : null;
                                        if (obj == null) {
                                            function26 = obj;
                                            composableLambda = ComposableLambdaKt.composableLambda(startRestartGroup, -764441232, true, new ListItemKt$ListItem$decoratedOverlineContent$1$1(listItemColors3, i14, obj));
                                        } else {
                                            function26 = obj;
                                            composableLambda = null;
                                        }
                                        Function2<? super Composer, ? super Integer, Unit> function212 = obj2;
                                        m1867getListItemType7AlIA9s$material3_release = ListItemType.Companion.m1867getListItemType7AlIA9s$material3_release(composableLambda == null, composableLambda5 == null);
                                        if (obj4 == null) {
                                            ListItemKt$ListItem$decoratedLeadingContent$1$1 listItemKt$ListItem$decoratedLeadingContent$1$1 = new ListItemKt$ListItem$decoratedLeadingContent$1$1(listItemColors3, i14, m1867getListItemType7AlIA9s$material3_release, obj4);
                                            function27 = obj4;
                                            z = true;
                                            composableLambda2 = ComposableLambdaKt.composableLambda(startRestartGroup, 1673725255, true, listItemKt$ListItem$decoratedLeadingContent$1$1);
                                        } else {
                                            function27 = obj4;
                                            z = true;
                                            composableLambda2 = null;
                                        }
                                        if (function25 == null) {
                                            function28 = function25;
                                            composableLambda3 = ComposableLambdaKt.composableLambda(startRestartGroup, 1392069445, z, new ListItemKt$ListItem$decoratedTrailingContent$1$1(listItemColors3, i14, m1867getListItemType7AlIA9s$material3_release, function25));
                                        } else {
                                            function28 = function25;
                                        }
                                        if (ListItemType.m1862equalsimpl0(m1867getListItemType7AlIA9s$material3_release, ListItemType.Companion.m1868getOneLineAlXitO8())) {
                                            m2551getListItemTwoLineContainerHeightD9Ej5fM = ListItemType.m1862equalsimpl0(m1867getListItemType7AlIA9s$material3_release, ListItemType.Companion.m1870getTwoLineAlXitO8()) ? ListTokens.INSTANCE.m2551getListItemTwoLineContainerHeightD9Ej5fM() : ListTokens.INSTANCE.m2549getListItemThreeLineContainerHeightD9Ej5fM();
                                        } else {
                                            m2551getListItemTwoLineContainerHeightD9Ej5fM = ListTokens.INSTANCE.m2547getListItemOneLineContainerHeightD9Ej5fM();
                                        }
                                        int i16 = i14 >> 9;
                                        m1851ListItemxOgov6c(companion, null, listItemColors3.containerColor$material3_release(startRestartGroup, (i14 >> 18) & 14).getValue().m3301unboximpl(), listItemColors3.headlineColor$material3_release(true, startRestartGroup, ((i14 >> 15) & 112) | 6).getValue().m3301unboximpl(), m1848getElevationD9Ej5fM, m1848getElevationD9Ej5fM2, m2551getListItemTwoLineContainerHeightD9Ej5fM, PaddingKt.m742PaddingValuesYgX7TsA(ListItemHorizontalPadding, !ListItemType.m1862equalsimpl0(m1867getListItemType7AlIA9s$material3_release, ListItemType.Companion.m1869getThreeLineAlXitO8()) ? ListItemThreeLineVerticalPadding : ListItemVerticalPadding), ComposableLambdaKt.composableLambda(startRestartGroup, -1813277157, true, new ListItemKt$ListItem$1(composableLambda2, PaddingKt.m745PaddingValuesa9UjIt4$default(0.0f, 0.0f, !ListItemType.m1862equalsimpl0(m1867getListItemType7AlIA9s$material3_release, ListItemType.Companion.m1869getThreeLineAlXitO8()) ? ContentEndPadding : Dp.m5607constructorimpl(0), 0.0f, 11, null), !ListItemType.m1862equalsimpl0(m1867getListItemType7AlIA9s$material3_release, ListItemType.Companion.m1869getThreeLineAlXitO8()) ? Alignment.Companion.getTop() : Alignment.Companion.getCenterVertically(), !ListItemType.m1862equalsimpl0(m1867getListItemType7AlIA9s$material3_release, ListItemType.Companion.m1869getThreeLineAlXitO8()) ? Arrangement.INSTANCE.getTop() : Arrangement.INSTANCE.getCenter(), composableLambda3, composableLambda, composableLambda4, composableLambda5)), startRestartGroup, ((i14 >> 3) & 14) | 100663296 | (i16 & 57344) | (i16 & 458752), 2);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        f4 = m1848getElevationD9Ej5fM;
                                        f3 = m1848getElevationD9Ej5fM2;
                                        obj = function26;
                                        function29 = function212;
                                        function210 = function27;
                                        function211 = function28;
                                        listItemColors4 = listItemColors3;
                                        modifier2 = companion;
                                    } else {
                                        startRestartGroup.skipToGroupEnd();
                                        modifier2 = modifier;
                                        function211 = function24;
                                        listItemColors4 = listItemColors;
                                        function29 = obj2;
                                        function210 = obj3;
                                        f4 = f;
                                    }
                                    endRestartGroup = startRestartGroup.endRestartGroup();
                                    if (endRestartGroup != null) {
                                        return;
                                    }
                                    endRestartGroup.updateScope(new ListItemKt$ListItem$2(headlineContent, modifier2, obj, function29, function210, function211, listItemColors4, f4, f3, i, i2));
                                    return;
                                }
                                i11 = i10;
                                f3 = f2;
                                if ((i3 & 191739611) == 38347922) {
                                }
                                startRestartGroup.startDefaults();
                                ComposableLambda composableLambda32 = null;
                                if ((i & 1) != 0) {
                                }
                                if (i15 == 0) {
                                }
                                if (i4 != 0) {
                                }
                                if (i5 != 0) {
                                }
                                if (i6 == 0) {
                                }
                                if (i7 == 0) {
                                }
                                if ((i2 & 64) == 0) {
                                }
                                if (i12 == 0) {
                                }
                                if (i13 == 0) {
                                }
                                ListItemColors listItemColors52 = listItemColors2;
                                i14 = i3;
                                listItemColors3 = listItemColors52;
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                ComposableLambda composableLambda42 = ComposableLambdaKt.composableLambda(startRestartGroup, -403249643, true, new ListItemKt$ListItem$decoratedHeadlineContent$1(listItemColors3, i14, headlineContent));
                                if (obj2 == null) {
                                }
                                if (obj == null) {
                                }
                                Function2<? super Composer, ? super Integer, Unit> function2122 = obj2;
                                m1867getListItemType7AlIA9s$material3_release = ListItemType.Companion.m1867getListItemType7AlIA9s$material3_release(composableLambda == null, composableLambda5 == null);
                                if (obj4 == null) {
                                }
                                if (function25 == null) {
                                }
                                if (ListItemType.m1862equalsimpl0(m1867getListItemType7AlIA9s$material3_release, ListItemType.Companion.m1868getOneLineAlXitO8())) {
                                }
                                if (!ListItemType.m1862equalsimpl0(m1867getListItemType7AlIA9s$material3_release, ListItemType.Companion.m1869getThreeLineAlXitO8())) {
                                }
                                int i162 = i14 >> 9;
                                m1851ListItemxOgov6c(companion, null, listItemColors3.containerColor$material3_release(startRestartGroup, (i14 >> 18) & 14).getValue().m3301unboximpl(), listItemColors3.headlineColor$material3_release(true, startRestartGroup, ((i14 >> 15) & 112) | 6).getValue().m3301unboximpl(), m1848getElevationD9Ej5fM, m1848getElevationD9Ej5fM2, m2551getListItemTwoLineContainerHeightD9Ej5fM, PaddingKt.m742PaddingValuesYgX7TsA(ListItemHorizontalPadding, !ListItemType.m1862equalsimpl0(m1867getListItemType7AlIA9s$material3_release, ListItemType.Companion.m1869getThreeLineAlXitO8()) ? ListItemThreeLineVerticalPadding : ListItemVerticalPadding), ComposableLambdaKt.composableLambda(startRestartGroup, -1813277157, true, new ListItemKt$ListItem$1(composableLambda2, PaddingKt.m745PaddingValuesa9UjIt4$default(0.0f, 0.0f, !ListItemType.m1862equalsimpl0(m1867getListItemType7AlIA9s$material3_release, ListItemType.Companion.m1869getThreeLineAlXitO8()) ? ContentEndPadding : Dp.m5607constructorimpl(0), 0.0f, 11, null), !ListItemType.m1862equalsimpl0(m1867getListItemType7AlIA9s$material3_release, ListItemType.Companion.m1869getThreeLineAlXitO8()) ? Alignment.Companion.getTop() : Alignment.Companion.getCenterVertically(), !ListItemType.m1862equalsimpl0(m1867getListItemType7AlIA9s$material3_release, ListItemType.Companion.m1869getThreeLineAlXitO8()) ? Arrangement.INSTANCE.getTop() : Arrangement.INSTANCE.getCenter(), composableLambda32, composableLambda, composableLambda42, composableLambda5)), startRestartGroup, ((i14 >> 3) & 14) | 100663296 | (i162 & 57344) | (i162 & 458752), 2);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                f4 = m1848getElevationD9Ej5fM;
                                f3 = m1848getElevationD9Ej5fM2;
                                obj = function26;
                                function29 = function2122;
                                function210 = function27;
                                function211 = function28;
                                listItemColors4 = listItemColors3;
                                modifier2 = companion;
                                endRestartGroup = startRestartGroup.endRestartGroup();
                                if (endRestartGroup != null) {
                                }
                            }
                            i9 = i8;
                            i10 = i2 & 256;
                            if (i10 != 0) {
                            }
                            i11 = i10;
                            f3 = f2;
                            if ((i3 & 191739611) == 38347922) {
                            }
                            startRestartGroup.startDefaults();
                            ComposableLambda composableLambda322 = null;
                            if ((i & 1) != 0) {
                            }
                            if (i15 == 0) {
                            }
                            if (i4 != 0) {
                            }
                            if (i5 != 0) {
                            }
                            if (i6 == 0) {
                            }
                            if (i7 == 0) {
                            }
                            if ((i2 & 64) == 0) {
                            }
                            if (i12 == 0) {
                            }
                            if (i13 == 0) {
                            }
                            ListItemColors listItemColors522 = listItemColors2;
                            i14 = i3;
                            listItemColors3 = listItemColors522;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            ComposableLambda composableLambda422 = ComposableLambdaKt.composableLambda(startRestartGroup, -403249643, true, new ListItemKt$ListItem$decoratedHeadlineContent$1(listItemColors3, i14, headlineContent));
                            if (obj2 == null) {
                            }
                            if (obj == null) {
                            }
                            Function2<? super Composer, ? super Integer, Unit> function21222 = obj2;
                            m1867getListItemType7AlIA9s$material3_release = ListItemType.Companion.m1867getListItemType7AlIA9s$material3_release(composableLambda == null, composableLambda5 == null);
                            if (obj4 == null) {
                            }
                            if (function25 == null) {
                            }
                            if (ListItemType.m1862equalsimpl0(m1867getListItemType7AlIA9s$material3_release, ListItemType.Companion.m1868getOneLineAlXitO8())) {
                            }
                            if (!ListItemType.m1862equalsimpl0(m1867getListItemType7AlIA9s$material3_release, ListItemType.Companion.m1869getThreeLineAlXitO8())) {
                            }
                            int i1622 = i14 >> 9;
                            m1851ListItemxOgov6c(companion, null, listItemColors3.containerColor$material3_release(startRestartGroup, (i14 >> 18) & 14).getValue().m3301unboximpl(), listItemColors3.headlineColor$material3_release(true, startRestartGroup, ((i14 >> 15) & 112) | 6).getValue().m3301unboximpl(), m1848getElevationD9Ej5fM, m1848getElevationD9Ej5fM2, m2551getListItemTwoLineContainerHeightD9Ej5fM, PaddingKt.m742PaddingValuesYgX7TsA(ListItemHorizontalPadding, !ListItemType.m1862equalsimpl0(m1867getListItemType7AlIA9s$material3_release, ListItemType.Companion.m1869getThreeLineAlXitO8()) ? ListItemThreeLineVerticalPadding : ListItemVerticalPadding), ComposableLambdaKt.composableLambda(startRestartGroup, -1813277157, true, new ListItemKt$ListItem$1(composableLambda2, PaddingKt.m745PaddingValuesa9UjIt4$default(0.0f, 0.0f, !ListItemType.m1862equalsimpl0(m1867getListItemType7AlIA9s$material3_release, ListItemType.Companion.m1869getThreeLineAlXitO8()) ? ContentEndPadding : Dp.m5607constructorimpl(0), 0.0f, 11, null), !ListItemType.m1862equalsimpl0(m1867getListItemType7AlIA9s$material3_release, ListItemType.Companion.m1869getThreeLineAlXitO8()) ? Alignment.Companion.getTop() : Alignment.Companion.getCenterVertically(), !ListItemType.m1862equalsimpl0(m1867getListItemType7AlIA9s$material3_release, ListItemType.Companion.m1869getThreeLineAlXitO8()) ? Arrangement.INSTANCE.getTop() : Arrangement.INSTANCE.getCenter(), composableLambda322, composableLambda, composableLambda422, composableLambda5)), startRestartGroup, ((i14 >> 3) & 14) | 100663296 | (i1622 & 57344) | (i1622 & 458752), 2);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            f4 = m1848getElevationD9Ej5fM;
                            f3 = m1848getElevationD9Ej5fM2;
                            obj = function26;
                            function29 = function21222;
                            function210 = function27;
                            function211 = function28;
                            listItemColors4 = listItemColors3;
                            modifier2 = companion;
                            endRestartGroup = startRestartGroup.endRestartGroup();
                            if (endRestartGroup != null) {
                            }
                        }
                        if ((i & 3670016) == 0) {
                        }
                        i8 = i2 & 128;
                        if (i8 == 0) {
                        }
                        i9 = i8;
                        i10 = i2 & 256;
                        if (i10 != 0) {
                        }
                        i11 = i10;
                        f3 = f2;
                        if ((i3 & 191739611) == 38347922) {
                        }
                        startRestartGroup.startDefaults();
                        ComposableLambda composableLambda3222 = null;
                        if ((i & 1) != 0) {
                        }
                        if (i15 == 0) {
                        }
                        if (i4 != 0) {
                        }
                        if (i5 != 0) {
                        }
                        if (i6 == 0) {
                        }
                        if (i7 == 0) {
                        }
                        if ((i2 & 64) == 0) {
                        }
                        if (i12 == 0) {
                        }
                        if (i13 == 0) {
                        }
                        ListItemColors listItemColors5222 = listItemColors2;
                        i14 = i3;
                        listItemColors3 = listItemColors5222;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        ComposableLambda composableLambda4222 = ComposableLambdaKt.composableLambda(startRestartGroup, -403249643, true, new ListItemKt$ListItem$decoratedHeadlineContent$1(listItemColors3, i14, headlineContent));
                        if (obj2 == null) {
                        }
                        if (obj == null) {
                        }
                        Function2<? super Composer, ? super Integer, Unit> function212222 = obj2;
                        m1867getListItemType7AlIA9s$material3_release = ListItemType.Companion.m1867getListItemType7AlIA9s$material3_release(composableLambda == null, composableLambda5 == null);
                        if (obj4 == null) {
                        }
                        if (function25 == null) {
                        }
                        if (ListItemType.m1862equalsimpl0(m1867getListItemType7AlIA9s$material3_release, ListItemType.Companion.m1868getOneLineAlXitO8())) {
                        }
                        if (!ListItemType.m1862equalsimpl0(m1867getListItemType7AlIA9s$material3_release, ListItemType.Companion.m1869getThreeLineAlXitO8())) {
                        }
                        int i16222 = i14 >> 9;
                        m1851ListItemxOgov6c(companion, null, listItemColors3.containerColor$material3_release(startRestartGroup, (i14 >> 18) & 14).getValue().m3301unboximpl(), listItemColors3.headlineColor$material3_release(true, startRestartGroup, ((i14 >> 15) & 112) | 6).getValue().m3301unboximpl(), m1848getElevationD9Ej5fM, m1848getElevationD9Ej5fM2, m2551getListItemTwoLineContainerHeightD9Ej5fM, PaddingKt.m742PaddingValuesYgX7TsA(ListItemHorizontalPadding, !ListItemType.m1862equalsimpl0(m1867getListItemType7AlIA9s$material3_release, ListItemType.Companion.m1869getThreeLineAlXitO8()) ? ListItemThreeLineVerticalPadding : ListItemVerticalPadding), ComposableLambdaKt.composableLambda(startRestartGroup, -1813277157, true, new ListItemKt$ListItem$1(composableLambda2, PaddingKt.m745PaddingValuesa9UjIt4$default(0.0f, 0.0f, !ListItemType.m1862equalsimpl0(m1867getListItemType7AlIA9s$material3_release, ListItemType.Companion.m1869getThreeLineAlXitO8()) ? ContentEndPadding : Dp.m5607constructorimpl(0), 0.0f, 11, null), !ListItemType.m1862equalsimpl0(m1867getListItemType7AlIA9s$material3_release, ListItemType.Companion.m1869getThreeLineAlXitO8()) ? Alignment.Companion.getTop() : Alignment.Companion.getCenterVertically(), !ListItemType.m1862equalsimpl0(m1867getListItemType7AlIA9s$material3_release, ListItemType.Companion.m1869getThreeLineAlXitO8()) ? Arrangement.INSTANCE.getTop() : Arrangement.INSTANCE.getCenter(), composableLambda3222, composableLambda, composableLambda4222, composableLambda5)), startRestartGroup, ((i14 >> 3) & 14) | 100663296 | (i16222 & 57344) | (i16222 & 458752), 2);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        f4 = m1848getElevationD9Ej5fM;
                        f3 = m1848getElevationD9Ej5fM2;
                        obj = function26;
                        function29 = function212222;
                        function210 = function27;
                        function211 = function28;
                        listItemColors4 = listItemColors3;
                        modifier2 = companion;
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    obj3 = function23;
                    i7 = i2 & 32;
                    if (i7 != 0) {
                    }
                    if ((i & 3670016) == 0) {
                    }
                    i8 = i2 & 128;
                    if (i8 == 0) {
                    }
                    i9 = i8;
                    i10 = i2 & 256;
                    if (i10 != 0) {
                    }
                    i11 = i10;
                    f3 = f2;
                    if ((i3 & 191739611) == 38347922) {
                    }
                    startRestartGroup.startDefaults();
                    ComposableLambda composableLambda32222 = null;
                    if ((i & 1) != 0) {
                    }
                    if (i15 == 0) {
                    }
                    if (i4 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i6 == 0) {
                    }
                    if (i7 == 0) {
                    }
                    if ((i2 & 64) == 0) {
                    }
                    if (i12 == 0) {
                    }
                    if (i13 == 0) {
                    }
                    ListItemColors listItemColors52222 = listItemColors2;
                    i14 = i3;
                    listItemColors3 = listItemColors52222;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    ComposableLambda composableLambda42222 = ComposableLambdaKt.composableLambda(startRestartGroup, -403249643, true, new ListItemKt$ListItem$decoratedHeadlineContent$1(listItemColors3, i14, headlineContent));
                    if (obj2 == null) {
                    }
                    if (obj == null) {
                    }
                    Function2<? super Composer, ? super Integer, Unit> function2122222 = obj2;
                    m1867getListItemType7AlIA9s$material3_release = ListItemType.Companion.m1867getListItemType7AlIA9s$material3_release(composableLambda == null, composableLambda5 == null);
                    if (obj4 == null) {
                    }
                    if (function25 == null) {
                    }
                    if (ListItemType.m1862equalsimpl0(m1867getListItemType7AlIA9s$material3_release, ListItemType.Companion.m1868getOneLineAlXitO8())) {
                    }
                    if (!ListItemType.m1862equalsimpl0(m1867getListItemType7AlIA9s$material3_release, ListItemType.Companion.m1869getThreeLineAlXitO8())) {
                    }
                    int i162222 = i14 >> 9;
                    m1851ListItemxOgov6c(companion, null, listItemColors3.containerColor$material3_release(startRestartGroup, (i14 >> 18) & 14).getValue().m3301unboximpl(), listItemColors3.headlineColor$material3_release(true, startRestartGroup, ((i14 >> 15) & 112) | 6).getValue().m3301unboximpl(), m1848getElevationD9Ej5fM, m1848getElevationD9Ej5fM2, m2551getListItemTwoLineContainerHeightD9Ej5fM, PaddingKt.m742PaddingValuesYgX7TsA(ListItemHorizontalPadding, !ListItemType.m1862equalsimpl0(m1867getListItemType7AlIA9s$material3_release, ListItemType.Companion.m1869getThreeLineAlXitO8()) ? ListItemThreeLineVerticalPadding : ListItemVerticalPadding), ComposableLambdaKt.composableLambda(startRestartGroup, -1813277157, true, new ListItemKt$ListItem$1(composableLambda2, PaddingKt.m745PaddingValuesa9UjIt4$default(0.0f, 0.0f, !ListItemType.m1862equalsimpl0(m1867getListItemType7AlIA9s$material3_release, ListItemType.Companion.m1869getThreeLineAlXitO8()) ? ContentEndPadding : Dp.m5607constructorimpl(0), 0.0f, 11, null), !ListItemType.m1862equalsimpl0(m1867getListItemType7AlIA9s$material3_release, ListItemType.Companion.m1869getThreeLineAlXitO8()) ? Alignment.Companion.getTop() : Alignment.Companion.getCenterVertically(), !ListItemType.m1862equalsimpl0(m1867getListItemType7AlIA9s$material3_release, ListItemType.Companion.m1869getThreeLineAlXitO8()) ? Arrangement.INSTANCE.getTop() : Arrangement.INSTANCE.getCenter(), composableLambda32222, composableLambda, composableLambda42222, composableLambda5)), startRestartGroup, ((i14 >> 3) & 14) | 100663296 | (i162222 & 57344) | (i162222 & 458752), 2);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    f4 = m1848getElevationD9Ej5fM;
                    f3 = m1848getElevationD9Ej5fM2;
                    obj = function26;
                    function29 = function2122222;
                    function210 = function27;
                    function211 = function28;
                    listItemColors4 = listItemColors3;
                    modifier2 = companion;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                obj2 = function22;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                obj3 = function23;
                i7 = i2 & 32;
                if (i7 != 0) {
                }
                if ((i & 3670016) == 0) {
                }
                i8 = i2 & 128;
                if (i8 == 0) {
                }
                i9 = i8;
                i10 = i2 & 256;
                if (i10 != 0) {
                }
                i11 = i10;
                f3 = f2;
                if ((i3 & 191739611) == 38347922) {
                }
                startRestartGroup.startDefaults();
                ComposableLambda composableLambda322222 = null;
                if ((i & 1) != 0) {
                }
                if (i15 == 0) {
                }
                if (i4 != 0) {
                }
                if (i5 != 0) {
                }
                if (i6 == 0) {
                }
                if (i7 == 0) {
                }
                if ((i2 & 64) == 0) {
                }
                if (i12 == 0) {
                }
                if (i13 == 0) {
                }
                ListItemColors listItemColors522222 = listItemColors2;
                i14 = i3;
                listItemColors3 = listItemColors522222;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                ComposableLambda composableLambda422222 = ComposableLambdaKt.composableLambda(startRestartGroup, -403249643, true, new ListItemKt$ListItem$decoratedHeadlineContent$1(listItemColors3, i14, headlineContent));
                if (obj2 == null) {
                }
                if (obj == null) {
                }
                Function2<? super Composer, ? super Integer, Unit> function21222222 = obj2;
                m1867getListItemType7AlIA9s$material3_release = ListItemType.Companion.m1867getListItemType7AlIA9s$material3_release(composableLambda == null, composableLambda5 == null);
                if (obj4 == null) {
                }
                if (function25 == null) {
                }
                if (ListItemType.m1862equalsimpl0(m1867getListItemType7AlIA9s$material3_release, ListItemType.Companion.m1868getOneLineAlXitO8())) {
                }
                if (!ListItemType.m1862equalsimpl0(m1867getListItemType7AlIA9s$material3_release, ListItemType.Companion.m1869getThreeLineAlXitO8())) {
                }
                int i1622222 = i14 >> 9;
                m1851ListItemxOgov6c(companion, null, listItemColors3.containerColor$material3_release(startRestartGroup, (i14 >> 18) & 14).getValue().m3301unboximpl(), listItemColors3.headlineColor$material3_release(true, startRestartGroup, ((i14 >> 15) & 112) | 6).getValue().m3301unboximpl(), m1848getElevationD9Ej5fM, m1848getElevationD9Ej5fM2, m2551getListItemTwoLineContainerHeightD9Ej5fM, PaddingKt.m742PaddingValuesYgX7TsA(ListItemHorizontalPadding, !ListItemType.m1862equalsimpl0(m1867getListItemType7AlIA9s$material3_release, ListItemType.Companion.m1869getThreeLineAlXitO8()) ? ListItemThreeLineVerticalPadding : ListItemVerticalPadding), ComposableLambdaKt.composableLambda(startRestartGroup, -1813277157, true, new ListItemKt$ListItem$1(composableLambda2, PaddingKt.m745PaddingValuesa9UjIt4$default(0.0f, 0.0f, !ListItemType.m1862equalsimpl0(m1867getListItemType7AlIA9s$material3_release, ListItemType.Companion.m1869getThreeLineAlXitO8()) ? ContentEndPadding : Dp.m5607constructorimpl(0), 0.0f, 11, null), !ListItemType.m1862equalsimpl0(m1867getListItemType7AlIA9s$material3_release, ListItemType.Companion.m1869getThreeLineAlXitO8()) ? Alignment.Companion.getTop() : Alignment.Companion.getCenterVertically(), !ListItemType.m1862equalsimpl0(m1867getListItemType7AlIA9s$material3_release, ListItemType.Companion.m1869getThreeLineAlXitO8()) ? Arrangement.INSTANCE.getTop() : Arrangement.INSTANCE.getCenter(), composableLambda322222, composableLambda, composableLambda422222, composableLambda5)), startRestartGroup, ((i14 >> 3) & 14) | 100663296 | (i1622222 & 57344) | (i1622222 & 458752), 2);
                if (ComposerKt.isTraceInProgress()) {
                }
                f4 = m1848getElevationD9Ej5fM;
                f3 = m1848getElevationD9Ej5fM2;
                obj = function26;
                function29 = function21222222;
                function210 = function27;
                function211 = function28;
                listItemColors4 = listItemColors3;
                modifier2 = companion;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            obj = function2;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            obj2 = function22;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            obj3 = function23;
            i7 = i2 & 32;
            if (i7 != 0) {
            }
            if ((i & 3670016) == 0) {
            }
            i8 = i2 & 128;
            if (i8 == 0) {
            }
            i9 = i8;
            i10 = i2 & 256;
            if (i10 != 0) {
            }
            i11 = i10;
            f3 = f2;
            if ((i3 & 191739611) == 38347922) {
            }
            startRestartGroup.startDefaults();
            ComposableLambda composableLambda3222222 = null;
            if ((i & 1) != 0) {
            }
            if (i15 == 0) {
            }
            if (i4 != 0) {
            }
            if (i5 != 0) {
            }
            if (i6 == 0) {
            }
            if (i7 == 0) {
            }
            if ((i2 & 64) == 0) {
            }
            if (i12 == 0) {
            }
            if (i13 == 0) {
            }
            ListItemColors listItemColors5222222 = listItemColors2;
            i14 = i3;
            listItemColors3 = listItemColors5222222;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            ComposableLambda composableLambda4222222 = ComposableLambdaKt.composableLambda(startRestartGroup, -403249643, true, new ListItemKt$ListItem$decoratedHeadlineContent$1(listItemColors3, i14, headlineContent));
            if (obj2 == null) {
            }
            if (obj == null) {
            }
            Function2<? super Composer, ? super Integer, Unit> function212222222 = obj2;
            m1867getListItemType7AlIA9s$material3_release = ListItemType.Companion.m1867getListItemType7AlIA9s$material3_release(composableLambda == null, composableLambda5 == null);
            if (obj4 == null) {
            }
            if (function25 == null) {
            }
            if (ListItemType.m1862equalsimpl0(m1867getListItemType7AlIA9s$material3_release, ListItemType.Companion.m1868getOneLineAlXitO8())) {
            }
            if (!ListItemType.m1862equalsimpl0(m1867getListItemType7AlIA9s$material3_release, ListItemType.Companion.m1869getThreeLineAlXitO8())) {
            }
            int i16222222 = i14 >> 9;
            m1851ListItemxOgov6c(companion, null, listItemColors3.containerColor$material3_release(startRestartGroup, (i14 >> 18) & 14).getValue().m3301unboximpl(), listItemColors3.headlineColor$material3_release(true, startRestartGroup, ((i14 >> 15) & 112) | 6).getValue().m3301unboximpl(), m1848getElevationD9Ej5fM, m1848getElevationD9Ej5fM2, m2551getListItemTwoLineContainerHeightD9Ej5fM, PaddingKt.m742PaddingValuesYgX7TsA(ListItemHorizontalPadding, !ListItemType.m1862equalsimpl0(m1867getListItemType7AlIA9s$material3_release, ListItemType.Companion.m1869getThreeLineAlXitO8()) ? ListItemThreeLineVerticalPadding : ListItemVerticalPadding), ComposableLambdaKt.composableLambda(startRestartGroup, -1813277157, true, new ListItemKt$ListItem$1(composableLambda2, PaddingKt.m745PaddingValuesa9UjIt4$default(0.0f, 0.0f, !ListItemType.m1862equalsimpl0(m1867getListItemType7AlIA9s$material3_release, ListItemType.Companion.m1869getThreeLineAlXitO8()) ? ContentEndPadding : Dp.m5607constructorimpl(0), 0.0f, 11, null), !ListItemType.m1862equalsimpl0(m1867getListItemType7AlIA9s$material3_release, ListItemType.Companion.m1869getThreeLineAlXitO8()) ? Alignment.Companion.getTop() : Alignment.Companion.getCenterVertically(), !ListItemType.m1862equalsimpl0(m1867getListItemType7AlIA9s$material3_release, ListItemType.Companion.m1869getThreeLineAlXitO8()) ? Arrangement.INSTANCE.getTop() : Arrangement.INSTANCE.getCenter(), composableLambda3222222, composableLambda, composableLambda4222222, composableLambda5)), startRestartGroup, ((i14 >> 3) & 14) | 100663296 | (i16222222 & 57344) | (i16222222 & 458752), 2);
            if (ComposerKt.isTraceInProgress()) {
            }
            f4 = m1848getElevationD9Ej5fM;
            f3 = m1848getElevationD9Ej5fM2;
            obj = function26;
            function29 = function212222222;
            function210 = function27;
            function211 = function28;
            listItemColors4 = listItemColors3;
            modifier2 = companion;
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
        obj2 = function22;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        obj3 = function23;
        i7 = i2 & 32;
        if (i7 != 0) {
        }
        if ((i & 3670016) == 0) {
        }
        i8 = i2 & 128;
        if (i8 == 0) {
        }
        i9 = i8;
        i10 = i2 & 256;
        if (i10 != 0) {
        }
        i11 = i10;
        f3 = f2;
        if ((i3 & 191739611) == 38347922) {
        }
        startRestartGroup.startDefaults();
        ComposableLambda composableLambda32222222 = null;
        if ((i & 1) != 0) {
        }
        if (i15 == 0) {
        }
        if (i4 != 0) {
        }
        if (i5 != 0) {
        }
        if (i6 == 0) {
        }
        if (i7 == 0) {
        }
        if ((i2 & 64) == 0) {
        }
        if (i12 == 0) {
        }
        if (i13 == 0) {
        }
        ListItemColors listItemColors52222222 = listItemColors2;
        i14 = i3;
        listItemColors3 = listItemColors52222222;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        ComposableLambda composableLambda42222222 = ComposableLambdaKt.composableLambda(startRestartGroup, -403249643, true, new ListItemKt$ListItem$decoratedHeadlineContent$1(listItemColors3, i14, headlineContent));
        if (obj2 == null) {
        }
        if (obj == null) {
        }
        Function2<? super Composer, ? super Integer, Unit> function2122222222 = obj2;
        m1867getListItemType7AlIA9s$material3_release = ListItemType.Companion.m1867getListItemType7AlIA9s$material3_release(composableLambda == null, composableLambda5 == null);
        if (obj4 == null) {
        }
        if (function25 == null) {
        }
        if (ListItemType.m1862equalsimpl0(m1867getListItemType7AlIA9s$material3_release, ListItemType.Companion.m1868getOneLineAlXitO8())) {
        }
        if (!ListItemType.m1862equalsimpl0(m1867getListItemType7AlIA9s$material3_release, ListItemType.Companion.m1869getThreeLineAlXitO8())) {
        }
        int i162222222 = i14 >> 9;
        m1851ListItemxOgov6c(companion, null, listItemColors3.containerColor$material3_release(startRestartGroup, (i14 >> 18) & 14).getValue().m3301unboximpl(), listItemColors3.headlineColor$material3_release(true, startRestartGroup, ((i14 >> 15) & 112) | 6).getValue().m3301unboximpl(), m1848getElevationD9Ej5fM, m1848getElevationD9Ej5fM2, m2551getListItemTwoLineContainerHeightD9Ej5fM, PaddingKt.m742PaddingValuesYgX7TsA(ListItemHorizontalPadding, !ListItemType.m1862equalsimpl0(m1867getListItemType7AlIA9s$material3_release, ListItemType.Companion.m1869getThreeLineAlXitO8()) ? ListItemThreeLineVerticalPadding : ListItemVerticalPadding), ComposableLambdaKt.composableLambda(startRestartGroup, -1813277157, true, new ListItemKt$ListItem$1(composableLambda2, PaddingKt.m745PaddingValuesa9UjIt4$default(0.0f, 0.0f, !ListItemType.m1862equalsimpl0(m1867getListItemType7AlIA9s$material3_release, ListItemType.Companion.m1869getThreeLineAlXitO8()) ? ContentEndPadding : Dp.m5607constructorimpl(0), 0.0f, 11, null), !ListItemType.m1862equalsimpl0(m1867getListItemType7AlIA9s$material3_release, ListItemType.Companion.m1869getThreeLineAlXitO8()) ? Alignment.Companion.getTop() : Alignment.Companion.getCenterVertically(), !ListItemType.m1862equalsimpl0(m1867getListItemType7AlIA9s$material3_release, ListItemType.Companion.m1869getThreeLineAlXitO8()) ? Arrangement.INSTANCE.getTop() : Arrangement.INSTANCE.getCenter(), composableLambda32222222, composableLambda, composableLambda42222222, composableLambda5)), startRestartGroup, ((i14 >> 3) & 14) | 100663296 | (i162222222 & 57344) | (i162222222 & 458752), 2);
        if (ComposerKt.isTraceInProgress()) {
        }
        f4 = m1848getElevationD9Ej5fM;
        f3 = m1848getElevationD9Ej5fM2;
        obj = function26;
        function29 = function2122222222;
        function210 = function27;
        function211 = function28;
        listItemColors4 = listItemColors3;
        modifier2 = companion;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:150:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x011b  */
    /* renamed from: ListItem-xOgov6c  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1851ListItemxOgov6c(Modifier modifier, Shape shape, long j, long j2, float f, float f2, float f3, PaddingValues paddingValues, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, int i, int i2) {
        int i3;
        Object obj;
        long j3;
        long j4;
        int i4;
        int i5;
        Modifier.Companion companion;
        Shape shape2;
        long j5;
        float m1848getElevationD9Ej5fM;
        float f4;
        long j6;
        Modifier modifier2;
        ScopeUpdateScope endRestartGroup;
        int i6;
        int i7;
        Composer startRestartGroup = composer.startRestartGroup(1069030861);
        ComposerKt.sourceInformation(startRestartGroup, "C(ListItem)P(4,7,0:c#ui.graphics.Color,2:c#ui.graphics.Color,8:c#ui.unit.Dp,6:c#ui.unit.Dp,3:c#ui.unit.Dp,5)204@8376L5,205@8428L14,206@8487L12,213@8715L451:ListItem.kt#uh7d8r");
        int i8 = i2 & 1;
        if (i8 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 112) == 0) {
            if ((i2 & 2) == 0) {
                obj = shape;
                if (startRestartGroup.changed(obj)) {
                    i7 = 32;
                    i3 |= i7;
                }
            } else {
                obj = shape;
            }
            i7 = 16;
            i3 |= i7;
        } else {
            obj = shape;
        }
        if ((i & 896) == 0) {
            if ((i2 & 4) == 0) {
                j3 = j;
                if (startRestartGroup.changed(j3)) {
                    i6 = 256;
                    i3 |= i6;
                }
            } else {
                j3 = j;
            }
            i6 = 128;
            i3 |= i6;
        } else {
            j3 = j;
        }
        if ((i & 7168) == 0) {
            j4 = j2;
            i3 |= ((i2 & 8) == 0 && startRestartGroup.changed(j4)) ? 2048 : 1024;
        } else {
            j4 = j2;
        }
        int i9 = i2 & 16;
        if (i9 != 0) {
            i3 |= 24576;
        } else if ((i & 57344) == 0) {
            i3 |= startRestartGroup.changed(f) ? 16384 : 8192;
        }
        int i10 = i2 & 32;
        if (i10 != 0) {
            i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((i & 458752) == 0) {
            i3 |= startRestartGroup.changed(f2) ? 131072 : 65536;
        }
        if ((i2 & 64) != 0) {
            i4 = 1572864;
        } else {
            if ((i & 3670016) == 0) {
                i4 = startRestartGroup.changed(f3) ? 1048576 : 524288;
            }
            if ((i2 & 128) == 0) {
                i3 |= 12582912;
            } else if ((29360128 & i) == 0) {
                i3 |= startRestartGroup.changed(paddingValues) ? 8388608 : 4194304;
            }
            if ((i2 & 256) != 0) {
                if ((234881024 & i) == 0) {
                    i5 = startRestartGroup.changedInstance(function3) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                }
                if ((191739611 & i3) == 38347922 || !startRestartGroup.getSkipping()) {
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                        companion = i8 != 0 ? Modifier.Companion : modifier;
                        if ((i2 & 2) != 0) {
                            shape2 = ListItemDefaults.INSTANCE.getShape(startRestartGroup, 6);
                            i3 &= -113;
                        } else {
                            shape2 = obj;
                        }
                        if ((i2 & 4) != 0) {
                            j5 = ListItemDefaults.INSTANCE.getContainerColor(startRestartGroup, 6);
                            i3 &= -897;
                        } else {
                            j5 = j3;
                        }
                        if ((i2 & 8) != 0) {
                            j4 = ListItemDefaults.INSTANCE.getContentColor(startRestartGroup, 6);
                            i3 &= -7169;
                        }
                        float m1848getElevationD9Ej5fM2 = i9 != 0 ? ListItemDefaults.INSTANCE.m1848getElevationD9Ej5fM() : f;
                        m1848getElevationD9Ej5fM = i10 != 0 ? ListItemDefaults.INSTANCE.m1848getElevationD9Ej5fM() : f2;
                        f4 = m1848getElevationD9Ej5fM2;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 2) != 0) {
                            i3 &= -113;
                        }
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                        }
                        companion = modifier;
                        m1848getElevationD9Ej5fM = f2;
                        shape2 = obj;
                        j5 = j3;
                        f4 = f;
                    }
                    long j7 = j4;
                    int i11 = i3;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1069030861, i11, -1, "androidx.compose.material3.ListItem (ListItem.kt:202)");
                    }
                    SurfaceKt.m2067SurfaceT9BRK9s(companion, shape2, j5, j7, f4, m1848getElevationD9Ej5fM, null, ComposableLambdaKt.composableLambda(startRestartGroup, 1393735016, true, new ListItemKt$ListItem$3(f3, paddingValues, function3, i11)), startRestartGroup, (i11 & 14) | 12582912 | (i11 & 112) | (i11 & 896) | (i11 & 7168) | (i11 & 57344) | (i11 & 458752), 64);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    j4 = j7;
                    j6 = j5;
                    obj = shape2;
                    modifier2 = companion;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    modifier2 = modifier;
                    m1848getElevationD9Ej5fM = f2;
                    j6 = j3;
                    f4 = f;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                    return;
                }
                endRestartGroup.updateScope(new ListItemKt$ListItem$4(modifier2, obj, j6, j4, f4, m1848getElevationD9Ej5fM, f3, paddingValues, function3, i, i2));
                return;
            }
            i5 = 100663296;
            i3 |= i5;
            if ((191739611 & i3) == 38347922) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i8 != 0) {
            }
            if ((i2 & 2) != 0) {
            }
            if ((i2 & 4) != 0) {
            }
            if ((i2 & 8) != 0) {
            }
            if (i9 != 0) {
            }
            if (i10 != 0) {
            }
            f4 = m1848getElevationD9Ej5fM2;
            long j72 = j4;
            int i112 = i3;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            SurfaceKt.m2067SurfaceT9BRK9s(companion, shape2, j5, j72, f4, m1848getElevationD9Ej5fM, null, ComposableLambdaKt.composableLambda(startRestartGroup, 1393735016, true, new ListItemKt$ListItem$3(f3, paddingValues, function3, i112)), startRestartGroup, (i112 & 14) | 12582912 | (i112 & 112) | (i112 & 896) | (i112 & 7168) | (i112 & 57344) | (i112 & 458752), 64);
            if (ComposerKt.isTraceInProgress()) {
            }
            j4 = j72;
            j6 = j5;
            obj = shape2;
            modifier2 = companion;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i3 |= i4;
        if ((i2 & 128) == 0) {
        }
        if ((i2 & 256) != 0) {
        }
        i3 |= i5;
        if ((191739611 & i3) == 38347922) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i8 != 0) {
        }
        if ((i2 & 2) != 0) {
        }
        if ((i2 & 4) != 0) {
        }
        if ((i2 & 8) != 0) {
        }
        if (i9 != 0) {
        }
        if (i10 != 0) {
        }
        f4 = m1848getElevationD9Ej5fM2;
        long j722 = j4;
        int i1122 = i3;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        SurfaceKt.m2067SurfaceT9BRK9s(companion, shape2, j5, j722, f4, m1848getElevationD9Ej5fM, null, ComposableLambdaKt.composableLambda(startRestartGroup, 1393735016, true, new ListItemKt$ListItem$3(f3, paddingValues, function3, i1122)), startRestartGroup, (i1122 & 14) | 12582912 | (i1122 & 112) | (i1122 & 896) | (i1122 & 7168) | (i1122 & 57344) | (i1122 & 458752), 64);
        if (ComposerKt.isTraceInProgress()) {
        }
        j4 = j722;
        j6 = j5;
        obj = shape2;
        modifier2 = companion;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: LeadingContent-3IgeMak  reason: not valid java name */
    public static final void m1849LeadingContent3IgeMak(RowScope rowScope, long j, boolean z, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(1383930970);
        ComposerKt.sourceInformation(startRestartGroup, "C(LeadingContent)P(1:c#ui.graphics.Color,2)236@9308L274:ListItem.kt#uh7d8r");
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(rowScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(j) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= startRestartGroup.changedInstance(function2) ? 2048 : 1024;
        }
        if ((i2 & 5851) != 1170 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1383930970, i2, -1, "androidx.compose.material3.LeadingContent (ListItem.kt:232)");
            }
            CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m3281boximpl(j))}, ComposableLambdaKt.composableLambda(startRestartGroup, 315166618, true, new ListItemKt$LeadingContent$1(z, rowScope, function2, i2)), startRestartGroup, 56);
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
        endRestartGroup.updateScope(new ListItemKt$LeadingContent$2(rowScope, j, z, function2, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: TrailingContent-3IgeMak  reason: not valid java name */
    public static final void m1853TrailingContent3IgeMak(RowScope rowScope, long j, boolean z, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(1404787004);
        ComposerKt.sourceInformation(startRestartGroup, "C(TrailingContent)P(1:c#ui.graphics.Color,2)249@9723L316:ListItem.kt#uh7d8r");
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(rowScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(j) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= startRestartGroup.changedInstance(function2) ? 2048 : 1024;
        }
        if ((i2 & 5851) != 1170 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1404787004, i2, -1, "androidx.compose.material3.TrailingContent (ListItem.kt:245)");
            }
            Modifier m750paddingVpY3zN4$default = PaddingKt.m750paddingVpY3zN4$default(Modifier.Companion, TrailingHorizontalPadding, 0.0f, 2, null);
            Modifier.Companion companion = Modifier.Companion;
            if (!z) {
                companion = rowScope.align(companion, Alignment.Companion.getCenterVertically());
            }
            Modifier then = m750paddingVpY3zN4$default.then(companion);
            startRestartGroup.startReplaceableGroup(733328855);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, startRestartGroup, 0);
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
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(then);
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
            Updater.m2900setimpl(m2893constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2900setimpl(m2893constructorimpl, density, ComposeUiNode.Companion.getSetDensity());
            Updater.m2900setimpl(m2893constructorimpl, layoutDirection, ComposeUiNode.Companion.getSetLayoutDirection());
            Updater.m2900setimpl(m2893constructorimpl, viewConfiguration, ComposeUiNode.Companion.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629305, "C72@3384L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1419469451, "C254@9892L141:ListItem.kt#uh7d8r");
            int i3 = i2 >> 3;
            m1852ProvideTextStyleFromToken3JVO9M(j, ListTokens.INSTANCE.getListItemTrailingSupportingTextFont(), function2, startRestartGroup, (i3 & 14) | 48 | (i3 & 896));
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
        endRestartGroup.updateScope(new ListItemKt$TrailingContent$2(rowScope, j, z, function2, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ProvideTextStyleFromToken-3J-VO9M  reason: not valid java name */
    public static final void m1852ProvideTextStyleFromToken3JVO9M(long j, TypographyKeyTokens typographyKeyTokens, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(1133967795);
        ComposerKt.sourceInformation(startRestartGroup, "C(ProvideTextStyleFromToken)P(0:c#ui.graphics.Color,2)394@15546L10,395@15582L111:ListItem.kt#uh7d8r");
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(typographyKeyTokens) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changedInstance(function2) ? 256 : 128;
        }
        if ((i2 & 731) != 146 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1133967795, i2, -1, "androidx.compose.material3.ProvideTextStyleFromToken (ListItem.kt:389)");
            }
            CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m3281boximpl(j))}, ComposableLambdaKt.composableLambda(startRestartGroup, -514310925, true, new ListItemKt$ProvideTextStyleFromToken$1(TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6), typographyKeyTokens), function2, i2)), startRestartGroup, 56);
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
        endRestartGroup.updateScope(new ListItemKt$ProvideTextStyleFromToken$2(j, typographyKeyTokens, function2, i));
    }

    static {
        float f = 8;
        ListItemVerticalPadding = Dp.m5607constructorimpl(f);
        float f2 = 16;
        ListItemThreeLineVerticalPadding = Dp.m5607constructorimpl(f2);
        ListItemHorizontalPadding = Dp.m5607constructorimpl(f2);
        LeadingContentEndPadding = Dp.m5607constructorimpl(f2);
        ContentEndPadding = Dp.m5607constructorimpl(f);
        TrailingHorizontalPadding = Dp.m5607constructorimpl(f);
    }
}
