package androidx.compose.material3;

import androidx.compose.animation.ColorVectorConverterKt;
import androidx.compose.animation.core.AnimationVector4D;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material.ripple.RippleKt;
import androidx.compose.material3.tokens.PrimaryNavigationTabTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.layout.AlignmentLineKt;
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
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ifriend.keychain.cipherStorage.CipherStorageKeystoreRsaEcb;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: Tab.kt */
@Metadata(d1 = {"\u0000p\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u0083\u0001\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u00142\u0011\u0010\u0015\u001a\r\u0012\u0004\u0012\u00020\u00100\u0014¢\u0006\u0002\b\u00162\u0011\u0010\u0017\u001a\r\u0012\u0004\u0012\u00020\u00100\u0014¢\u0006\u0002\b\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00122\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001e\u001a\u00020\u001fH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b \u0010!\u001a\u008b\u0001\u0010\"\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u00142\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00122\u0015\b\u0002\u0010\u0015\u001a\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0014¢\u0006\u0002\b\u00162\u0015\b\u0002\u0010\u0017\u001a\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0014¢\u0006\u0002\b\u00162\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001e\u001a\u00020\u001fH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b#\u0010$\u001a{\u0010\"\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u00142\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00122\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\u001c\u0010%\u001a\u0018\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u00100&¢\u0006\u0002\b\u0016¢\u0006\u0002\b(H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b)\u0010*\u001a7\u0010+\u001a\u00020\u00102\u0013\u0010\u0015\u001a\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0014¢\u0006\u0002\b\u00162\u0013\u0010\u0017\u001a\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0014¢\u0006\u0002\b\u0016H\u0003¢\u0006\u0002\u0010,\u001a@\u0010-\u001a\u00020\u00102\u0006\u0010.\u001a\u00020\u001c2\u0006\u0010/\u001a\u00020\u001c2\u0006\u0010\u0011\u001a\u00020\u00122\u0011\u0010%\u001a\r\u0012\u0004\u0012\u00020\u00100\u0014¢\u0006\u0002\b\u0016H\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b0\u00101\u001aD\u00102\u001a\u00020\u0010*\u0002032\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u00020\u000b2\u0006\u0010:\u001a\u00020\u000b2\u0006\u0010;\u001a\u00020\u000b2\u0006\u0010<\u001a\u00020\u000bH\u0002\u001a\u001c\u0010=\u001a\u00020\u0010*\u0002032\u0006\u0010>\u001a\u0002072\u0006\u0010:\u001a\u00020\u000bH\u0002\"\u0013\u0010\u0000\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0003\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0004\u001a\u00020\u0005X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0006\"\u0013\u0010\u0007\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\b\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\t\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u000e\u0010\n\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000\"\u0013\u0010\u000e\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006?"}, d2 = {"DoubleLineTextBaselineWithIcon", "Landroidx/compose/ui/unit/Dp;", "F", "HorizontalTextPadding", "IconDistanceFromBaseline", "Landroidx/compose/ui/unit/TextUnit;", "J", "LargeTabHeight", "SingleLineTextBaselineWithIcon", "SmallTabHeight", "TabFadeInAnimationDelay", "", "TabFadeInAnimationDuration", "TabFadeOutAnimationDuration", "TextDistanceFromLeadingIcon", "LeadingIconTab", "", "selected", "", "onClick", "Lkotlin/Function0;", "text", "Landroidx/compose/runtime/Composable;", "icon", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "selectedContentColor", "Landroidx/compose/ui/graphics/Color;", "unselectedContentColor", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "LeadingIconTab-wqdebIU", "(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZJJLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "Tab", "Tab-wqdebIU", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;JJLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", FirebaseAnalytics.Param.CONTENT, "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Lkotlin/ExtensionFunctionType;", "Tab-bogVsAg", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZJJLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "TabBaselineLayout", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "TabTransition", "activeColor", "inactiveColor", "TabTransition-Klgx-Pg", "(JJZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "placeTextAndIcon", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "density", "Landroidx/compose/ui/unit/Density;", "textPlaceable", "Landroidx/compose/ui/layout/Placeable;", "iconPlaceable", "tabWidth", "tabHeight", "firstBaseline", "lastBaseline", "placeTextOrIcon", "textOrIconPlaceable", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TabKt {
    private static final int TabFadeInAnimationDelay = 100;
    private static final int TabFadeInAnimationDuration = 150;
    private static final int TabFadeOutAnimationDuration = 100;
    private static final float SmallTabHeight = PrimaryNavigationTabTokens.INSTANCE.m2687getContainerHeightD9Ej5fM();
    private static final float LargeTabHeight = Dp.m5607constructorimpl(72);
    private static final float HorizontalTextPadding = Dp.m5607constructorimpl(16);
    private static final float SingleLineTextBaselineWithIcon = Dp.m5607constructorimpl(14);
    private static final float DoubleLineTextBaselineWithIcon = Dp.m5607constructorimpl(6);
    private static final long IconDistanceFromBaseline = TextUnitKt.getSp(20);
    private static final float TextDistanceFromLeadingIcon = Dp.m5607constructorimpl(8);

    /* JADX WARN: Removed duplicated region for block: B:104:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:154:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0124  */
    /* renamed from: Tab-wqdebIU  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2094TabwqdebIU(boolean z, Function0<Unit> onClick, Modifier modifier, boolean z2, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, long j, long j2, MutableInteractionSource mutableInteractionSource, Composer composer, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        Object obj;
        long j3;
        int i7;
        long j4;
        MutableInteractionSource mutableInteractionSource2;
        Modifier modifier2;
        boolean z3;
        long j5;
        long j6;
        Function2<? super Composer, ? super Integer, Unit> function23;
        Function2<? super Composer, ? super Integer, Unit> function24;
        boolean z4;
        Composer composer2;
        Function2<? super Composer, ? super Integer, Unit> function25;
        Modifier modifier3;
        Function2<? super Composer, ? super Integer, Unit> function26;
        boolean z5;
        long j7;
        long j8;
        MutableInteractionSource mutableInteractionSource3;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer startRestartGroup = composer.startRestartGroup(-350627181);
        ComposerKt.sourceInformation(startRestartGroup, "C(Tab)P(5,4,3!1,7!1,6:c#ui.graphics.Color,8:c#ui.graphics.Color)99@4497L7,101@4614L39,111@4981L234:Tab.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changedInstance(onClick) ? 32 : 16;
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
            } else if ((i & 7168) == 0) {
                i3 |= startRestartGroup.changed(z2) ? 2048 : 1024;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 57344) == 0) {
                    i3 |= startRestartGroup.changedInstance(function2) ? 16384 : 8192;
                    i6 = i2 & 32;
                    if (i6 == 0) {
                        i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        obj = function22;
                    } else {
                        obj = function22;
                        if ((i & 458752) == 0) {
                            i3 |= startRestartGroup.changedInstance(obj) ? 131072 : 65536;
                        }
                    }
                    if ((i & 3670016) == 0) {
                        i3 |= ((i2 & 64) == 0 && startRestartGroup.changed(j)) ? 1048576 : 524288;
                    }
                    if ((i & 29360128) != 0) {
                        j3 = j2;
                        i3 |= ((i2 & 128) == 0 && startRestartGroup.changed(j3)) ? 8388608 : 4194304;
                    } else {
                        j3 = j2;
                    }
                    i7 = i2 & 256;
                    if (i7 == 0) {
                        i3 |= 100663296;
                    } else if ((i & 234881024) == 0) {
                        i3 |= startRestartGroup.changed(mutableInteractionSource) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                    }
                    if ((i3 & 191739611) == 38347922 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        ComposableLambda composableLambda = null;
                        if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            Modifier.Companion companion = i8 == 0 ? Modifier.Companion : modifier;
                            boolean z6 = i4 == 0 ? true : z2;
                            Function2<? super Composer, ? super Integer, Unit> function27 = i5 == 0 ? null : function2;
                            if (i6 != 0) {
                                obj = null;
                            }
                            if ((i2 & 64) == 0) {
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                Object consume = startRestartGroup.consume(ContentColorKt.getLocalContentColor());
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                j4 = ((Color) consume).m3301unboximpl();
                                i3 &= -3670017;
                            } else {
                                j4 = j;
                            }
                            if ((i2 & 128) != 0) {
                                i3 &= -29360129;
                                j3 = j4;
                            }
                            if (i7 == 0) {
                                startRestartGroup.startReplaceableGroup(-492369756);
                                ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                                Object rememberedValue = startRestartGroup.rememberedValue();
                                if (rememberedValue == Composer.Companion.getEmpty()) {
                                    rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                startRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
                            } else {
                                mutableInteractionSource2 = mutableInteractionSource;
                            }
                            modifier2 = companion;
                            z3 = z6;
                            j5 = j4;
                            j6 = j3;
                            function23 = obj;
                            function24 = function27;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                            }
                            if ((i2 & 128) != 0) {
                                i3 &= -29360129;
                            }
                            modifier2 = modifier;
                            z3 = z2;
                            j5 = j;
                            mutableInteractionSource2 = mutableInteractionSource;
                            j6 = j3;
                            function23 = obj;
                            function24 = function2;
                        }
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-350627181, i3, -1, "androidx.compose.material3.Tab (Tab.kt:92)");
                        }
                        if (function24 == null) {
                            z4 = true;
                            composableLambda = ComposableLambdaKt.composableLambda(startRestartGroup, 708874428, true, new TabKt$Tab$styledText$1$1(function24, i3));
                        } else {
                            z4 = true;
                        }
                        int i9 = i3 >> 6;
                        Function2<? super Composer, ? super Integer, Unit> function28 = function23;
                        Function2<? super Composer, ? super Integer, Unit> function29 = function24;
                        composer2 = startRestartGroup;
                        m2093TabbogVsAg(z, onClick, modifier2, z3, j5, j6, mutableInteractionSource2, ComposableLambdaKt.composableLambda(startRestartGroup, 1540996038, z4, new TabKt$Tab$2(composableLambda, function23, i3)), startRestartGroup, 12582912 | (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i9) | (458752 & i9) | (i9 & 3670016), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function25 = function29;
                        modifier3 = modifier2;
                        function26 = function28;
                        z5 = z3;
                        j7 = j5;
                        j8 = j6;
                        mutableInteractionSource3 = mutableInteractionSource2;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier3 = modifier;
                        z5 = z2;
                        function25 = function2;
                        mutableInteractionSource3 = mutableInteractionSource;
                        function26 = obj;
                        composer2 = startRestartGroup;
                        j8 = j3;
                        j7 = j;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                        return;
                    }
                    endRestartGroup.updateScope(new TabKt$Tab$3(z, onClick, modifier3, z5, function25, function26, j7, j8, mutableInteractionSource3, i, i2));
                    return;
                }
                i6 = i2 & 32;
                if (i6 == 0) {
                }
                if ((i & 3670016) == 0) {
                }
                if ((i & 29360128) != 0) {
                }
                i7 = i2 & 256;
                if (i7 == 0) {
                }
                if ((i3 & 191739611) == 38347922) {
                }
                startRestartGroup.startDefaults();
                ComposableLambda composableLambda2 = null;
                if ((i & 1) != 0) {
                }
                if (i8 == 0) {
                }
                if (i4 == 0) {
                }
                if (i5 == 0) {
                }
                if (i6 != 0) {
                }
                if ((i2 & 64) == 0) {
                }
                if ((i2 & 128) != 0) {
                }
                if (i7 == 0) {
                }
                modifier2 = companion;
                z3 = z6;
                j5 = j4;
                j6 = j3;
                function23 = obj;
                function24 = function27;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                if (function24 == null) {
                }
                int i92 = i3 >> 6;
                Function2<? super Composer, ? super Integer, Unit> function282 = function23;
                Function2<? super Composer, ? super Integer, Unit> function292 = function24;
                composer2 = startRestartGroup;
                m2093TabbogVsAg(z, onClick, modifier2, z3, j5, j6, mutableInteractionSource2, ComposableLambdaKt.composableLambda(startRestartGroup, 1540996038, z4, new TabKt$Tab$2(composableLambda2, function23, i3)), startRestartGroup, 12582912 | (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i92) | (458752 & i92) | (i92 & 3670016), 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                function25 = function292;
                modifier3 = modifier2;
                function26 = function282;
                z5 = z3;
                j7 = j5;
                j8 = j6;
                mutableInteractionSource3 = mutableInteractionSource2;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            i6 = i2 & 32;
            if (i6 == 0) {
            }
            if ((i & 3670016) == 0) {
            }
            if ((i & 29360128) != 0) {
            }
            i7 = i2 & 256;
            if (i7 == 0) {
            }
            if ((i3 & 191739611) == 38347922) {
            }
            startRestartGroup.startDefaults();
            ComposableLambda composableLambda22 = null;
            if ((i & 1) != 0) {
            }
            if (i8 == 0) {
            }
            if (i4 == 0) {
            }
            if (i5 == 0) {
            }
            if (i6 != 0) {
            }
            if ((i2 & 64) == 0) {
            }
            if ((i2 & 128) != 0) {
            }
            if (i7 == 0) {
            }
            modifier2 = companion;
            z3 = z6;
            j5 = j4;
            j6 = j3;
            function23 = obj;
            function24 = function27;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            if (function24 == null) {
            }
            int i922 = i3 >> 6;
            Function2<? super Composer, ? super Integer, Unit> function2822 = function23;
            Function2<? super Composer, ? super Integer, Unit> function2922 = function24;
            composer2 = startRestartGroup;
            m2093TabbogVsAg(z, onClick, modifier2, z3, j5, j6, mutableInteractionSource2, ComposableLambdaKt.composableLambda(startRestartGroup, 1540996038, z4, new TabKt$Tab$2(composableLambda22, function23, i3)), startRestartGroup, 12582912 | (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i922) | (458752 & i922) | (i922 & 3670016), 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            function25 = function2922;
            modifier3 = modifier2;
            function26 = function2822;
            z5 = z3;
            j7 = j5;
            j8 = j6;
            mutableInteractionSource3 = mutableInteractionSource2;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        i6 = i2 & 32;
        if (i6 == 0) {
        }
        if ((i & 3670016) == 0) {
        }
        if ((i & 29360128) != 0) {
        }
        i7 = i2 & 256;
        if (i7 == 0) {
        }
        if ((i3 & 191739611) == 38347922) {
        }
        startRestartGroup.startDefaults();
        ComposableLambda composableLambda222 = null;
        if ((i & 1) != 0) {
        }
        if (i8 == 0) {
        }
        if (i4 == 0) {
        }
        if (i5 == 0) {
        }
        if (i6 != 0) {
        }
        if ((i2 & 64) == 0) {
        }
        if ((i2 & 128) != 0) {
        }
        if (i7 == 0) {
        }
        modifier2 = companion;
        z3 = z6;
        j5 = j4;
        j6 = j3;
        function23 = obj;
        function24 = function27;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        if (function24 == null) {
        }
        int i9222 = i3 >> 6;
        Function2<? super Composer, ? super Integer, Unit> function28222 = function23;
        Function2<? super Composer, ? super Integer, Unit> function29222 = function24;
        composer2 = startRestartGroup;
        m2093TabbogVsAg(z, onClick, modifier2, z3, j5, j6, mutableInteractionSource2, ComposableLambdaKt.composableLambda(startRestartGroup, 1540996038, z4, new TabKt$Tab$2(composableLambda222, function23, i3)), startRestartGroup, 12582912 | (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i9222) | (458752 & i9222) | (i9222 & 3670016), 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        function25 = function29222;
        modifier3 = modifier2;
        function26 = function28222;
        z5 = z3;
        j7 = j5;
        j8 = j6;
        mutableInteractionSource3 = mutableInteractionSource2;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:144:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x012d  */
    /* renamed from: LeadingIconTab-wqdebIU  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2092LeadingIconTabwqdebIU(boolean z, Function0<Unit> onClick, Function2<? super Composer, ? super Integer, Unit> text, Function2<? super Composer, ? super Integer, Unit> icon, Modifier modifier, boolean z2, long j, long j2, MutableInteractionSource mutableInteractionSource, Composer composer, int i, int i2) {
        int i3;
        Modifier.Companion companion;
        int i4;
        boolean z3;
        long j3;
        int i5;
        int i6;
        int i7;
        long j4;
        MutableInteractionSource mutableInteractionSource2;
        int i8;
        long j5;
        long j6;
        Object obj;
        boolean z4;
        Modifier modifier2;
        boolean z5;
        long j7;
        long j8;
        MutableInteractionSource mutableInteractionSource3;
        ScopeUpdateScope endRestartGroup;
        int i9;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Composer startRestartGroup = composer.startRestartGroup(-777316544);
        ComposerKt.sourceInformation(startRestartGroup, "C(LeadingIconTab)P(5,4,7,1,3!1,6:c#ui.graphics.Color,8:c#ui.graphics.Color)161@6997L7,163@7114L39,168@7394L60,170@7460L991:Tab.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changedInstance(onClick) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= startRestartGroup.changedInstance(text) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
        } else if ((i & 7168) == 0) {
            i3 |= startRestartGroup.changedInstance(icon) ? 2048 : 1024;
        }
        int i10 = i2 & 16;
        if (i10 != 0) {
            i3 |= 24576;
        } else if ((57344 & i) == 0) {
            companion = modifier;
            i3 |= startRestartGroup.changed(companion) ? 16384 : 8192;
            i4 = i2 & 32;
            if (i4 == 0) {
                i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((458752 & i) == 0) {
                z3 = z2;
                i3 |= startRestartGroup.changed(z3) ? 131072 : 65536;
                if ((3670016 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        j3 = j;
                        if (startRestartGroup.changed(j3)) {
                            i9 = 1048576;
                            i3 |= i9;
                        }
                    } else {
                        j3 = j;
                    }
                    i9 = 524288;
                    i3 |= i9;
                } else {
                    j3 = j;
                }
                if ((29360128 & i) == 0) {
                    i5 = i3 | (((i2 & 128) == 0 && startRestartGroup.changed(j2)) ? 8388608 : 4194304);
                } else {
                    i5 = i3;
                }
                i6 = i2 & 256;
                if (i6 != 0) {
                    i5 |= 100663296;
                } else if ((i & 234881024) == 0) {
                    i5 |= startRestartGroup.changed(mutableInteractionSource) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                }
                if ((i5 & 191739611) == 38347922 || !startRestartGroup.getSkipping()) {
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                        if (i10 != 0) {
                            companion = Modifier.Companion;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        }
                        if ((i2 & 64) != 0) {
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                            Object consume = startRestartGroup.consume(ContentColorKt.getLocalContentColor());
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            j3 = ((Color) consume).m3301unboximpl();
                            i5 &= -3670017;
                        }
                        if ((i2 & 128) != 0) {
                            i7 = i5 & (-29360129);
                            j4 = j3;
                        } else {
                            i7 = i5;
                            j4 = j2;
                        }
                        if (i6 != 0) {
                            startRestartGroup.startReplaceableGroup(-492369756);
                            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                            Object rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == Composer.Companion.getEmpty()) {
                                rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            startRestartGroup.endReplaceableGroup();
                            i8 = i7;
                            mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                            i8 = i7;
                        }
                        j5 = j3;
                        j6 = j4;
                        obj = companion;
                        z4 = z3;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 64) != 0) {
                            i5 &= -3670017;
                        }
                        if ((i2 & 128) != 0) {
                            i5 &= -29360129;
                        }
                        j6 = j2;
                        mutableInteractionSource2 = mutableInteractionSource;
                        z4 = z3;
                        j5 = j3;
                        i8 = i5;
                        obj = companion;
                    }
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-777316544, i8, -1, "androidx.compose.material3.LeadingIconTab (Tab.kt:154)");
                    }
                    int i11 = i8;
                    int i12 = i11 >> 18;
                    m2095TabTransitionKlgxPg(j5, j6, z, ComposableLambdaKt.composableLambda(startRestartGroup, -429037564, true, new TabKt$LeadingIconTab$2(obj, z, mutableInteractionSource2, RippleKt.m1559rememberRipple9IZ8Weo(true, 0.0f, j5, startRestartGroup, ((i8 >> 12) & 896) | 6, 2), z4, onClick, icon, i8, text)), startRestartGroup, (i12 & 112) | (i12 & 14) | CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE | ((i11 << 6) & 896));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = obj;
                    z5 = z4;
                    j7 = j5;
                    j8 = j6;
                    mutableInteractionSource3 = mutableInteractionSource2;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    j8 = j2;
                    mutableInteractionSource3 = mutableInteractionSource;
                    j7 = j3;
                    z5 = z3;
                    modifier2 = companion;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                    return;
                }
                endRestartGroup.updateScope(new TabKt$LeadingIconTab$3(z, onClick, text, icon, modifier2, z5, j7, j8, mutableInteractionSource3, i, i2));
                return;
            }
            z3 = z2;
            if ((3670016 & i) == 0) {
            }
            if ((29360128 & i) == 0) {
            }
            i6 = i2 & 256;
            if (i6 != 0) {
            }
            if ((i5 & 191739611) == 38347922) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i10 != 0) {
            }
            if (i4 != 0) {
            }
            if ((i2 & 64) != 0) {
            }
            if ((i2 & 128) != 0) {
            }
            if (i6 != 0) {
            }
            j5 = j3;
            j6 = j4;
            obj = companion;
            z4 = z3;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            int i112 = i8;
            int i122 = i112 >> 18;
            m2095TabTransitionKlgxPg(j5, j6, z, ComposableLambdaKt.composableLambda(startRestartGroup, -429037564, true, new TabKt$LeadingIconTab$2(obj, z, mutableInteractionSource2, RippleKt.m1559rememberRipple9IZ8Weo(true, 0.0f, j5, startRestartGroup, ((i8 >> 12) & 896) | 6, 2), z4, onClick, icon, i8, text)), startRestartGroup, (i122 & 112) | (i122 & 14) | CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE | ((i112 << 6) & 896));
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier2 = obj;
            z5 = z4;
            j7 = j5;
            j8 = j6;
            mutableInteractionSource3 = mutableInteractionSource2;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        companion = modifier;
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        z3 = z2;
        if ((3670016 & i) == 0) {
        }
        if ((29360128 & i) == 0) {
        }
        i6 = i2 & 256;
        if (i6 != 0) {
        }
        if ((i5 & 191739611) == 38347922) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i10 != 0) {
        }
        if (i4 != 0) {
        }
        if ((i2 & 64) != 0) {
        }
        if ((i2 & 128) != 0) {
        }
        if (i6 != 0) {
        }
        j5 = j3;
        j6 = j4;
        obj = companion;
        z4 = z3;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        int i1122 = i8;
        int i1222 = i1122 >> 18;
        m2095TabTransitionKlgxPg(j5, j6, z, ComposableLambdaKt.composableLambda(startRestartGroup, -429037564, true, new TabKt$LeadingIconTab$2(obj, z, mutableInteractionSource2, RippleKt.m1559rememberRipple9IZ8Weo(true, 0.0f, j5, startRestartGroup, ((i8 >> 12) & 896) | 6, 2), z4, onClick, icon, i8, text)), startRestartGroup, (i1222 & 112) | (i1222 & 14) | CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE | ((i1122 << 6) & 896));
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier2 = obj;
        z5 = z4;
        j7 = j5;
        j8 = j6;
        mutableInteractionSource3 = mutableInteractionSource2;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:134:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0128  */
    /* renamed from: Tab-bogVsAg  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2093TabbogVsAg(boolean z, Function0<Unit> onClick, Modifier modifier, boolean z2, long j, long j2, MutableInteractionSource mutableInteractionSource, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> content, Composer composer, int i, int i2) {
        int i3;
        Modifier.Companion companion;
        int i4;
        boolean z3;
        long j3;
        int i5;
        int i6;
        Object obj;
        int i7;
        long j4;
        boolean z4;
        MutableInteractionSource mutableInteractionSource2;
        int i8;
        long j5;
        Modifier modifier2;
        long j6;
        boolean z5;
        long j7;
        long j8;
        MutableInteractionSource mutableInteractionSource3;
        ScopeUpdateScope endRestartGroup;
        int i9;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-202735880);
        ComposerKt.sourceInformation(startRestartGroup, "C(Tab)P(5,4,3,1,6:c#ui.graphics.Color,7:c#ui.graphics.Color,2)231@10212L7,233@10329L39,239@10655L60,241@10721L618:Tab.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changedInstance(onClick) ? 32 : 16;
        }
        int i10 = i2 & 4;
        if (i10 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            companion = modifier;
            i3 |= startRestartGroup.changed(companion) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
            } else if ((i & 7168) == 0) {
                z3 = z2;
                i3 |= startRestartGroup.changed(z3) ? 2048 : 1024;
                if ((57344 & i) == 0) {
                    if ((i2 & 16) == 0) {
                        j3 = j;
                        if (startRestartGroup.changed(j3)) {
                            i9 = 16384;
                            i3 |= i9;
                        }
                    } else {
                        j3 = j;
                    }
                    i9 = 8192;
                    i3 |= i9;
                } else {
                    j3 = j;
                }
                if ((458752 & i) == 0) {
                    i5 = i3 | (((i2 & 32) == 0 && startRestartGroup.changed(j2)) ? 131072 : 65536);
                } else {
                    i5 = i3;
                }
                i6 = i2 & 64;
                if (i6 != 0) {
                    i5 |= 1572864;
                    obj = mutableInteractionSource;
                } else {
                    obj = mutableInteractionSource;
                    if ((i & 3670016) == 0) {
                        i5 |= startRestartGroup.changed(obj) ? 1048576 : 524288;
                    }
                }
                if ((i2 & 128) == 0) {
                    if ((29360128 & i) == 0) {
                        i7 = startRestartGroup.changedInstance(content) ? 8388608 : 4194304;
                    }
                    if ((23967451 & i5) == 4793490 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            if (i10 != 0) {
                                companion = Modifier.Companion;
                            }
                            if (i4 != 0) {
                                z3 = true;
                            }
                            if ((i2 & 16) != 0) {
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                Object consume = startRestartGroup.consume(ContentColorKt.getLocalContentColor());
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                j3 = ((Color) consume).m3301unboximpl();
                                i5 &= -57345;
                            }
                            if ((i2 & 32) == 0) {
                                i5 = (-458753) & i5;
                                j4 = j3;
                            } else {
                                j4 = j2;
                            }
                            if (i6 == 0) {
                                startRestartGroup.startReplaceableGroup(-492369756);
                                ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                                Object rememberedValue = startRestartGroup.rememberedValue();
                                if (rememberedValue == Composer.Companion.getEmpty()) {
                                    rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                startRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
                                z4 = z3;
                            } else {
                                z4 = z3;
                                mutableInteractionSource2 = obj;
                            }
                            i8 = i5;
                            j5 = j4;
                            modifier2 = companion;
                            j6 = j3;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 16) != 0) {
                                i5 &= -57345;
                            }
                            if ((i2 & 32) != 0) {
                                i5 &= -458753;
                            }
                            j5 = j2;
                            z4 = z3;
                            j6 = j3;
                            mutableInteractionSource2 = obj;
                            i8 = i5;
                            modifier2 = companion;
                        }
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-202735880, i8, -1, "androidx.compose.material3.Tab (Tab.kt:226)");
                        }
                        int i11 = i8;
                        int i12 = i11 >> 12;
                        m2095TabTransitionKlgxPg(j6, j5, z, ComposableLambdaKt.composableLambda(startRestartGroup, -551896140, true, new TabKt$Tab$5(modifier2, z, mutableInteractionSource2, RippleKt.m1559rememberRipple9IZ8Weo(true, 0.0f, j6, startRestartGroup, ((i8 >> 6) & 896) | 6, 2), z4, onClick, content, i8)), startRestartGroup, (i12 & 112) | (i12 & 14) | CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE | ((i11 << 6) & 896));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        companion = modifier2;
                        z5 = z4;
                        j7 = j6;
                        j8 = j5;
                        mutableInteractionSource3 = mutableInteractionSource2;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        z5 = z3;
                        j7 = j3;
                        mutableInteractionSource3 = obj;
                        j8 = j2;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                        return;
                    }
                    endRestartGroup.updateScope(new TabKt$Tab$6(z, onClick, companion, z5, j7, j8, mutableInteractionSource3, content, i, i2));
                    return;
                }
                i7 = 12582912;
                i5 |= i7;
                if ((23967451 & i5) == 4793490) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i10 != 0) {
                }
                if (i4 != 0) {
                }
                if ((i2 & 16) != 0) {
                }
                if ((i2 & 32) == 0) {
                }
                if (i6 == 0) {
                }
                i8 = i5;
                j5 = j4;
                modifier2 = companion;
                j6 = j3;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                int i112 = i8;
                int i122 = i112 >> 12;
                m2095TabTransitionKlgxPg(j6, j5, z, ComposableLambdaKt.composableLambda(startRestartGroup, -551896140, true, new TabKt$Tab$5(modifier2, z, mutableInteractionSource2, RippleKt.m1559rememberRipple9IZ8Weo(true, 0.0f, j6, startRestartGroup, ((i8 >> 6) & 896) | 6, 2), z4, onClick, content, i8)), startRestartGroup, (i122 & 112) | (i122 & 14) | CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE | ((i112 << 6) & 896));
                if (ComposerKt.isTraceInProgress()) {
                }
                companion = modifier2;
                z5 = z4;
                j7 = j6;
                j8 = j5;
                mutableInteractionSource3 = mutableInteractionSource2;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            z3 = z2;
            if ((57344 & i) == 0) {
            }
            if ((458752 & i) == 0) {
            }
            i6 = i2 & 64;
            if (i6 != 0) {
            }
            if ((i2 & 128) == 0) {
            }
            i5 |= i7;
            if ((23967451 & i5) == 4793490) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i10 != 0) {
            }
            if (i4 != 0) {
            }
            if ((i2 & 16) != 0) {
            }
            if ((i2 & 32) == 0) {
            }
            if (i6 == 0) {
            }
            i8 = i5;
            j5 = j4;
            modifier2 = companion;
            j6 = j3;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            int i1122 = i8;
            int i1222 = i1122 >> 12;
            m2095TabTransitionKlgxPg(j6, j5, z, ComposableLambdaKt.composableLambda(startRestartGroup, -551896140, true, new TabKt$Tab$5(modifier2, z, mutableInteractionSource2, RippleKt.m1559rememberRipple9IZ8Weo(true, 0.0f, j6, startRestartGroup, ((i8 >> 6) & 896) | 6, 2), z4, onClick, content, i8)), startRestartGroup, (i1222 & 112) | (i1222 & 14) | CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE | ((i1122 << 6) & 896));
            if (ComposerKt.isTraceInProgress()) {
            }
            companion = modifier2;
            z5 = z4;
            j7 = j6;
            j8 = j5;
            mutableInteractionSource3 = mutableInteractionSource2;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        companion = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z3 = z2;
        if ((57344 & i) == 0) {
        }
        if ((458752 & i) == 0) {
        }
        i6 = i2 & 64;
        if (i6 != 0) {
        }
        if ((i2 & 128) == 0) {
        }
        i5 |= i7;
        if ((23967451 & i5) == 4793490) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i10 != 0) {
        }
        if (i4 != 0) {
        }
        if ((i2 & 16) != 0) {
        }
        if ((i2 & 32) == 0) {
        }
        if (i6 == 0) {
        }
        i8 = i5;
        j5 = j4;
        modifier2 = companion;
        j6 = j3;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        int i11222 = i8;
        int i12222 = i11222 >> 12;
        m2095TabTransitionKlgxPg(j6, j5, z, ComposableLambdaKt.composableLambda(startRestartGroup, -551896140, true, new TabKt$Tab$5(modifier2, z, mutableInteractionSource2, RippleKt.m1559rememberRipple9IZ8Weo(true, 0.0f, j6, startRestartGroup, ((i8 >> 6) & 896) | 6, 2), z4, onClick, content, i8)), startRestartGroup, (i12222 & 112) | (i12222 & 14) | CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE | ((i11222 << 6) & 896));
        if (ComposerKt.isTraceInProgress()) {
        }
        companion = modifier2;
        z5 = z4;
        j7 = j6;
        j8 = j5;
        mutableInteractionSource3 = mutableInteractionSource2;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: TabTransition-Klgx-Pg  reason: not valid java name */
    public static final void m2095TabTransitionKlgxPg(long j, long j2, boolean z, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(735731848);
        ComposerKt.sourceInformation(startRestartGroup, "C(TabTransition)P(0:c#ui.graphics.Color,2:c#ui.graphics.Color,3)272@11770L26,273@11825L550,291@12380L99:Tab.kt#uh7d8r");
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(j2) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= startRestartGroup.changedInstance(function2) ? 2048 : 1024;
        }
        if ((i2 & 5851) != 1170 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(735731848, i2, -1, "androidx.compose.material3.TabTransition (Tab.kt:266)");
            }
            int i3 = i2 >> 6;
            Transition updateTransition = TransitionKt.updateTransition(Boolean.valueOf(z), (String) null, startRestartGroup, i3 & 14, 2);
            TabKt$TabTransition$color$2 tabKt$TabTransition$color$2 = TabKt$TabTransition$color$2.INSTANCE;
            startRestartGroup.startReplaceableGroup(-1939694975);
            ComposerKt.sourceInformation(startRestartGroup, "CC(animateColor)P(2)68@3220L31,69@3287L70,73@3370L70:Transition.kt#xbi5r1");
            boolean booleanValue = ((Boolean) updateTransition.getTargetState()).booleanValue();
            startRestartGroup.startReplaceableGroup(-1997025499);
            ComposerKt.sourceInformation(startRestartGroup, "C:Tab.kt#uh7d8r");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1997025499, 0, -1, "androidx.compose.material3.TabTransition.<anonymous> (Tab.kt:288)");
            }
            long j3 = booleanValue ? j : j2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            startRestartGroup.endReplaceableGroup();
            ColorSpace m3295getColorSpaceimpl = Color.m3295getColorSpaceimpl(j3);
            startRestartGroup.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1):Composables.kt#9igjgp");
            boolean changed = startRestartGroup.changed(m3295getColorSpaceimpl);
            TwoWayConverter<Color, AnimationVector4D> rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = ColorVectorConverterKt.getVectorConverter(Color.Companion).invoke(m3295getColorSpaceimpl);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            TwoWayConverter twoWayConverter = (TwoWayConverter) rememberedValue;
            startRestartGroup.startReplaceableGroup(-142660079);
            ComposerKt.sourceInformation(startRestartGroup, "CC(animateValue)P(3,2)856@34079L32,857@34134L31,858@34190L23,860@34226L89:Transition.kt#pdpnli");
            boolean booleanValue2 = ((Boolean) updateTransition.getCurrentState()).booleanValue();
            startRestartGroup.startReplaceableGroup(-1997025499);
            ComposerKt.sourceInformation(startRestartGroup, "C:Tab.kt#uh7d8r");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1997025499, 0, -1, "androidx.compose.material3.TabTransition.<anonymous> (Tab.kt:288)");
            }
            long j4 = booleanValue2 ? j : j2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            startRestartGroup.endReplaceableGroup();
            Color m3281boximpl = Color.m3281boximpl(j4);
            boolean booleanValue3 = ((Boolean) updateTransition.getTargetState()).booleanValue();
            startRestartGroup.startReplaceableGroup(-1997025499);
            ComposerKt.sourceInformation(startRestartGroup, "C:Tab.kt#uh7d8r");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1997025499, 0, -1, "androidx.compose.material3.TabTransition.<anonymous> (Tab.kt:288)");
            }
            long j5 = booleanValue3 ? j : j2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            startRestartGroup.endReplaceableGroup();
            State createTransitionAnimation = TransitionKt.createTransitionAnimation(updateTransition, m3281boximpl, Color.m3281boximpl(j5), tabKt$TabTransition$color$2.invoke((TabKt$TabTransition$color$2) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), twoWayConverter, "ColorAnimation", startRestartGroup, 32768);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m3281boximpl(TabTransition_Klgx_Pg$lambda$5(createTransitionAnimation)))}, function2, startRestartGroup, (i3 & 112) | 8);
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
        endRestartGroup.updateScope(new TabKt$TabTransition$1(j, j2, z, function2, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void TabBaselineLayout(final Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, Composer composer, int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(514131524);
        ComposerKt.sourceInformation(startRestartGroup, "C(TabBaselineLayout)P(1)307@12887L2151:Tab.kt#uh7d8r");
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changedInstance(function2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changedInstance(function22) ? 32 : 16;
        }
        if ((i2 & 91) != 18 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(514131524, i2, -1, "androidx.compose.material3.TabBaselineLayout (Tab.kt:303)");
            }
            MeasurePolicy measurePolicy = new MeasurePolicy() { // from class: androidx.compose.material3.TabKt$TabBaselineLayout$2
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
                    Placeable mo4545measureBRTryo0;
                    Placeable placeable;
                    long j2;
                    Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
                    Intrinsics.checkNotNullParameter(measurables, "measurables");
                    if (function2 != null) {
                        for (Measurable measurable : measurables) {
                            mo4545measureBRTryo0 = Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable), "text") ? measurable.mo4545measureBRTryo0(Constraints.m5542copyZbe2FdA$default(j, 0, 0, 0, 0, 11, null)) : null;
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                    if (function22 != null) {
                        for (Measurable measurable2 : measurables) {
                            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable2), "icon")) {
                                placeable = measurable2.mo4545measureBRTryo0(j);
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                    placeable = null;
                    int max = Math.max(mo4545measureBRTryo0 != null ? mo4545measureBRTryo0.getWidth() : 0, placeable != null ? placeable.getWidth() : 0);
                    int i3 = Layout.mo582roundToPx0680j_4((mo4545measureBRTryo0 == null || placeable == null) ? TabKt.SmallTabHeight : TabKt.LargeTabHeight);
                    int height = placeable != null ? placeable.getHeight() : 0;
                    int height2 = mo4545measureBRTryo0 != null ? mo4545measureBRTryo0.getHeight() : 0;
                    j2 = TabKt.IconDistanceFromBaseline;
                    int max2 = Math.max(i3, height + height2 + Layout.mo581roundToPxR2X_6o(j2));
                    return MeasureScope.CC.layout$default(Layout, max, max2, null, new TabKt$TabBaselineLayout$2$measure$1(mo4545measureBRTryo0, placeable, Layout, max, max2, mo4545measureBRTryo0 != null ? Integer.valueOf(mo4545measureBRTryo0.get(AlignmentLineKt.getFirstBaseline())) : null, mo4545measureBRTryo0 != null ? Integer.valueOf(mo4545measureBRTryo0.get(AlignmentLineKt.getLastBaseline())) : null), 4, null);
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
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 720851189, "C:Tab.kt#uh7d8r");
            startRestartGroup.startReplaceableGroup(720851189);
            ComposerKt.sourceInformation(startRestartGroup, "310@12953L173");
            if (function2 != null) {
                Modifier m750paddingVpY3zN4$default = PaddingKt.m750paddingVpY3zN4$default(LayoutIdKt.layoutId(Modifier.Companion, "text"), HorizontalTextPadding, 0.0f, 2, null);
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
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -978021409, "C314@13118L6:Tab.kt#uh7d8r");
                function2.invoke(startRestartGroup, Integer.valueOf(i2 & 14));
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
            }
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(150513216);
            ComposerKt.sourceInformation(startRestartGroup, "317@13189L41");
            if (function22 != null) {
                Modifier layoutId = LayoutIdKt.layoutId(Modifier.Companion, "icon");
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
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -978021305, "C317@13222L6:Tab.kt#uh7d8r");
                function22.invoke(startRestartGroup, Integer.valueOf((i2 >> 3) & 14));
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
        endRestartGroup.updateScope(new TabKt$TabBaselineLayout$3(function2, function22, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void placeTextOrIcon(Placeable.PlacementScope placementScope, Placeable placeable, int i) {
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, (i - placeable.getHeight()) / 2, 0.0f, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void placeTextAndIcon(Placeable.PlacementScope placementScope, Density density, Placeable placeable, Placeable placeable2, int i, int i2, int i3, int i4) {
        float f;
        if (i3 == i4) {
            f = SingleLineTextBaselineWithIcon;
        } else {
            f = DoubleLineTextBaselineWithIcon;
        }
        int mo582roundToPx0680j_4 = density.mo582roundToPx0680j_4(f) + density.mo582roundToPx0680j_4(PrimaryNavigationTabTokens.INSTANCE.m2685getActiveIndicatorHeightD9Ej5fM());
        int i5 = (i2 - i4) - mo582roundToPx0680j_4;
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, (i - placeable.getWidth()) / 2, i5, 0.0f, 4, null);
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, (i - placeable2.getWidth()) / 2, i5 - ((placeable2.getHeight() + density.mo581roundToPxR2X_6o(IconDistanceFromBaseline)) - i3), 0.0f, 4, null);
    }

    private static final long TabTransition_Klgx_Pg$lambda$5(State<Color> state) {
        return state.getValue().m3301unboximpl();
    }
}
