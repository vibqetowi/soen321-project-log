package androidx.compose.material;

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
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
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
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
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
@Metadata(d1 = {"\u0000n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u0083\u0001\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u00142\u0011\u0010\u0015\u001a\r\u0012\u0004\u0012\u00020\u00100\u0014¢\u0006\u0002\b\u00162\u0011\u0010\u0017\u001a\r\u0012\u0004\u0012\u00020\u00100\u0014¢\u0006\u0002\b\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00122\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u001eH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b \u0010!\u001a\u008b\u0001\u0010\"\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u00142\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00122\u0015\b\u0002\u0010\u0015\u001a\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0014¢\u0006\u0002\b\u00162\u0015\b\u0002\u0010\u0017\u001a\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0014¢\u0006\u0002\b\u00162\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u001eH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b#\u0010$\u001a{\u0010\"\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u00142\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00122\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\u001c\u0010%\u001a\u0018\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u00100&¢\u0006\u0002\b\u0016¢\u0006\u0002\b(H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b)\u0010*\u001a7\u0010+\u001a\u00020\u00102\u0013\u0010\u0015\u001a\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0014¢\u0006\u0002\b\u00162\u0013\u0010\u0017\u001a\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0014¢\u0006\u0002\b\u0016H\u0003¢\u0006\u0002\u0010,\u001a@\u0010-\u001a\u00020\u00102\u0006\u0010.\u001a\u00020\u001e2\u0006\u0010/\u001a\u00020\u001e2\u0006\u0010\u0011\u001a\u00020\u00122\u0011\u0010%\u001a\r\u0012\u0004\u0012\u00020\u00100\u0014¢\u0006\u0002\b\u0016H\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b0\u00101\u001aD\u00102\u001a\u00020\u0010*\u0002032\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u00020\u000b2\u0006\u0010:\u001a\u00020\u000b2\u0006\u0010;\u001a\u00020\u000b2\u0006\u0010<\u001a\u00020\u000bH\u0002\u001a\u001c\u0010=\u001a\u00020\u0010*\u0002032\u0006\u0010>\u001a\u0002072\u0006\u0010:\u001a\u00020\u000bH\u0002\"\u0013\u0010\u0000\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0003\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0004\u001a\u00020\u0005X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0006\"\u0013\u0010\u0007\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\b\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\t\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u000e\u0010\n\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000\"\u0013\u0010\u000e\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006?²\u0006\n\u0010@\u001a\u00020\u001eX\u008a\u0084\u0002"}, d2 = {"DoubleLineTextBaselineWithIcon", "Landroidx/compose/ui/unit/Dp;", "F", "HorizontalTextPadding", "IconDistanceFromBaseline", "Landroidx/compose/ui/unit/TextUnit;", "J", "LargeTabHeight", "SingleLineTextBaselineWithIcon", "SmallTabHeight", "TabFadeInAnimationDelay", "", "TabFadeInAnimationDuration", "TabFadeOutAnimationDuration", "TextDistanceFromLeadingIcon", "LeadingIconTab", "", "selected", "", "onClick", "Lkotlin/Function0;", "text", "Landroidx/compose/runtime/Composable;", "icon", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "selectedContentColor", "Landroidx/compose/ui/graphics/Color;", "unselectedContentColor", "LeadingIconTab-0nD-MI0", "(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;JJLandroidx/compose/runtime/Composer;II)V", "Tab", "Tab-0nD-MI0", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/interaction/MutableInteractionSource;JJLandroidx/compose/runtime/Composer;II)V", FirebaseAnalytics.Param.CONTENT, "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Lkotlin/ExtensionFunctionType;", "Tab-EVJuX4I", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;JJLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "TabBaselineLayout", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "TabTransition", "activeColor", "inactiveColor", "TabTransition-Klgx-Pg", "(JJZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "placeTextAndIcon", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "density", "Landroidx/compose/ui/unit/Density;", "textPlaceable", "Landroidx/compose/ui/layout/Placeable;", "iconPlaceable", "tabWidth", "tabHeight", "firstBaseline", "lastBaseline", "placeTextOrIcon", "textOrIconPlaceable", "material_release", "color"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TabKt {
    private static final int TabFadeInAnimationDelay = 100;
    private static final int TabFadeInAnimationDuration = 150;
    private static final int TabFadeOutAnimationDuration = 100;
    private static final float SmallTabHeight = Dp.m5607constructorimpl(48);
    private static final float LargeTabHeight = Dp.m5607constructorimpl(72);
    private static final float HorizontalTextPadding = Dp.m5607constructorimpl(16);
    private static final float SingleLineTextBaselineWithIcon = Dp.m5607constructorimpl(14);
    private static final float DoubleLineTextBaselineWithIcon = Dp.m5607constructorimpl(6);
    private static final long IconDistanceFromBaseline = TextUnitKt.getSp(20);
    private static final float TextDistanceFromLeadingIcon = Dp.m5607constructorimpl(8);

    /* JADX WARN: Removed duplicated region for block: B:104:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:154:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0121  */
    /* renamed from: Tab-0nD-MI0  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1488Tab0nDMI0(boolean z, Function0<Unit> onClick, Modifier modifier, boolean z2, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, MutableInteractionSource mutableInteractionSource, long j, long j2, Composer composer, int i, int i2) {
        int i3;
        int i4;
        boolean z3;
        int i5;
        int i6;
        Object obj;
        int i7;
        long j3;
        MutableInteractionSource mutableInteractionSource2;
        long j4;
        Modifier modifier2;
        boolean z4;
        long j5;
        Function2<? super Composer, ? super Integer, Unit> function23;
        long j6;
        Function2<? super Composer, ? super Integer, Unit> function24;
        MutableInteractionSource mutableInteractionSource3;
        boolean z5;
        Composer composer2;
        Function2<? super Composer, ? super Integer, Unit> function25;
        Function2<? super Composer, ? super Integer, Unit> function26;
        Modifier modifier3;
        boolean z6;
        MutableInteractionSource mutableInteractionSource4;
        long j7;
        long j8;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer startRestartGroup = composer.startRestartGroup(-1486097588);
        ComposerKt.sourceInformation(startRestartGroup, "C(Tab)P(5,4,3!1,7!2,6:c#ui.graphics.Color,8:c#ui.graphics.Color)96@4350L39,97@4443L7,98@4535L6,106@4792L234:Tab.kt#jmzs0o");
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
                z3 = z2;
                i3 |= startRestartGroup.changed(z3) ? 2048 : 1024;
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
                    i7 = i2 & 64;
                    if (i7 == 0) {
                        i3 |= 1572864;
                    } else if ((i & 3670016) == 0) {
                        i3 |= startRestartGroup.changed(mutableInteractionSource) ? 1048576 : 524288;
                    }
                    if ((i & 29360128) == 0) {
                        i3 |= ((i2 & 128) == 0 && startRestartGroup.changed(j)) ? 8388608 : 4194304;
                    }
                    if ((234881024 & i) != 0) {
                        j3 = j2;
                        i3 |= ((i2 & 256) == 0 && startRestartGroup.changed(j3)) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                    } else {
                        j3 = j2;
                    }
                    if ((191739611 & i3) == 38347922 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        ComposableLambda composableLambda = null;
                        if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            Modifier.Companion companion = i8 == 0 ? Modifier.Companion : modifier;
                            if (i4 != 0) {
                                z3 = true;
                            }
                            Function2<? super Composer, ? super Integer, Unit> function27 = i5 == 0 ? null : function2;
                            if (i6 != 0) {
                                obj = null;
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
                            if ((i2 & 128) == 0) {
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                Object consume = startRestartGroup.consume(ContentColorKt.getLocalContentColor());
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                j4 = ((Color) consume).m3301unboximpl();
                                i3 &= -29360129;
                            } else {
                                j4 = j;
                            }
                            if ((i2 & 256) == 0) {
                                i3 &= -234881025;
                                modifier2 = companion;
                                z4 = z3;
                                j5 = Color.m3290copywmQWz5c$default(j4, ContentAlpha.INSTANCE.getMedium(startRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            } else {
                                modifier2 = companion;
                                z4 = z3;
                                j5 = j3;
                            }
                            function23 = obj;
                            j6 = j4;
                            function24 = function27;
                            mutableInteractionSource3 = mutableInteractionSource2;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 128) != 0) {
                                i3 &= -29360129;
                            }
                            if ((i2 & 256) != 0) {
                                i3 &= -234881025;
                            }
                            modifier2 = modifier;
                            mutableInteractionSource3 = mutableInteractionSource;
                            j6 = j;
                            z4 = z3;
                            j5 = j3;
                            function23 = obj;
                            function24 = function2;
                        }
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1486097588, i3, -1, "androidx.compose.material.Tab (Tab.kt:89)");
                        }
                        if (function24 == null) {
                            z5 = true;
                            composableLambda = ComposableLambdaKt.composableLambda(startRestartGroup, -1729014781, true, new TabKt$Tab$styledText$1$1(function24, i3));
                        } else {
                            z5 = true;
                        }
                        int i9 = i3 >> 6;
                        Function2<? super Composer, ? super Integer, Unit> function28 = function23;
                        Function2<? super Composer, ? super Integer, Unit> function29 = function24;
                        composer2 = startRestartGroup;
                        m1489TabEVJuX4I(z, onClick, modifier2, z4, mutableInteractionSource3, j6, j5, ComposableLambdaKt.composableLambda(startRestartGroup, -178151495, z5, new TabKt$Tab$2(composableLambda, function23, i3)), startRestartGroup, 12582912 | (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i9) | (458752 & i9) | (i9 & 3670016), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function25 = function29;
                        function26 = function28;
                        modifier3 = modifier2;
                        z6 = z4;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        j7 = j6;
                        j8 = j5;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier3 = modifier;
                        z6 = z3;
                        function26 = obj;
                        composer2 = startRestartGroup;
                        function25 = function2;
                        j8 = j3;
                        mutableInteractionSource4 = mutableInteractionSource;
                        j7 = j;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                        return;
                    }
                    endRestartGroup.updateScope(new TabKt$Tab$3(z, onClick, modifier3, z6, function25, function26, mutableInteractionSource4, j7, j8, i, i2));
                    return;
                }
                i6 = i2 & 32;
                if (i6 == 0) {
                }
                i7 = i2 & 64;
                if (i7 == 0) {
                }
                if ((i & 29360128) == 0) {
                }
                if ((234881024 & i) != 0) {
                }
                if ((191739611 & i3) == 38347922) {
                }
                startRestartGroup.startDefaults();
                ComposableLambda composableLambda2 = null;
                if ((i & 1) != 0) {
                }
                if (i8 == 0) {
                }
                if (i4 != 0) {
                }
                if (i5 == 0) {
                }
                if (i6 != 0) {
                }
                if (i7 == 0) {
                }
                if ((i2 & 128) == 0) {
                }
                if ((i2 & 256) == 0) {
                }
                function23 = obj;
                j6 = j4;
                function24 = function27;
                mutableInteractionSource3 = mutableInteractionSource2;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                if (function24 == null) {
                }
                int i92 = i3 >> 6;
                Function2<? super Composer, ? super Integer, Unit> function282 = function23;
                Function2<? super Composer, ? super Integer, Unit> function292 = function24;
                composer2 = startRestartGroup;
                m1489TabEVJuX4I(z, onClick, modifier2, z4, mutableInteractionSource3, j6, j5, ComposableLambdaKt.composableLambda(startRestartGroup, -178151495, z5, new TabKt$Tab$2(composableLambda2, function23, i3)), startRestartGroup, 12582912 | (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i92) | (458752 & i92) | (i92 & 3670016), 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                function25 = function292;
                function26 = function282;
                modifier3 = modifier2;
                z6 = z4;
                mutableInteractionSource4 = mutableInteractionSource3;
                j7 = j6;
                j8 = j5;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            z3 = z2;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            i6 = i2 & 32;
            if (i6 == 0) {
            }
            i7 = i2 & 64;
            if (i7 == 0) {
            }
            if ((i & 29360128) == 0) {
            }
            if ((234881024 & i) != 0) {
            }
            if ((191739611 & i3) == 38347922) {
            }
            startRestartGroup.startDefaults();
            ComposableLambda composableLambda22 = null;
            if ((i & 1) != 0) {
            }
            if (i8 == 0) {
            }
            if (i4 != 0) {
            }
            if (i5 == 0) {
            }
            if (i6 != 0) {
            }
            if (i7 == 0) {
            }
            if ((i2 & 128) == 0) {
            }
            if ((i2 & 256) == 0) {
            }
            function23 = obj;
            j6 = j4;
            function24 = function27;
            mutableInteractionSource3 = mutableInteractionSource2;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            if (function24 == null) {
            }
            int i922 = i3 >> 6;
            Function2<? super Composer, ? super Integer, Unit> function2822 = function23;
            Function2<? super Composer, ? super Integer, Unit> function2922 = function24;
            composer2 = startRestartGroup;
            m1489TabEVJuX4I(z, onClick, modifier2, z4, mutableInteractionSource3, j6, j5, ComposableLambdaKt.composableLambda(startRestartGroup, -178151495, z5, new TabKt$Tab$2(composableLambda22, function23, i3)), startRestartGroup, 12582912 | (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i922) | (458752 & i922) | (i922 & 3670016), 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            function25 = function2922;
            function26 = function2822;
            modifier3 = modifier2;
            z6 = z4;
            mutableInteractionSource4 = mutableInteractionSource3;
            j7 = j6;
            j8 = j5;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z3 = z2;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        i6 = i2 & 32;
        if (i6 == 0) {
        }
        i7 = i2 & 64;
        if (i7 == 0) {
        }
        if ((i & 29360128) == 0) {
        }
        if ((234881024 & i) != 0) {
        }
        if ((191739611 & i3) == 38347922) {
        }
        startRestartGroup.startDefaults();
        ComposableLambda composableLambda222 = null;
        if ((i & 1) != 0) {
        }
        if (i8 == 0) {
        }
        if (i4 != 0) {
        }
        if (i5 == 0) {
        }
        if (i6 != 0) {
        }
        if (i7 == 0) {
        }
        if ((i2 & 128) == 0) {
        }
        if ((i2 & 256) == 0) {
        }
        function23 = obj;
        j6 = j4;
        function24 = function27;
        mutableInteractionSource3 = mutableInteractionSource2;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        if (function24 == null) {
        }
        int i9222 = i3 >> 6;
        Function2<? super Composer, ? super Integer, Unit> function28222 = function23;
        Function2<? super Composer, ? super Integer, Unit> function29222 = function24;
        composer2 = startRestartGroup;
        m1489TabEVJuX4I(z, onClick, modifier2, z4, mutableInteractionSource3, j6, j5, ComposableLambdaKt.composableLambda(startRestartGroup, -178151495, z5, new TabKt$Tab$2(composableLambda222, function23, i3)), startRestartGroup, 12582912 | (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i9222) | (458752 & i9222) | (i9222 & 3670016), 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        function25 = function29222;
        function26 = function28222;
        modifier3 = modifier2;
        z6 = z4;
        mutableInteractionSource4 = mutableInteractionSource3;
        j7 = j6;
        j8 = j5;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:144:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x012b  */
    /* renamed from: LeadingIconTab-0nD-MI0  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1487LeadingIconTab0nDMI0(boolean z, Function0<Unit> onClick, Function2<? super Composer, ? super Integer, Unit> text, Function2<? super Composer, ? super Integer, Unit> icon, Modifier modifier, boolean z2, MutableInteractionSource mutableInteractionSource, long j, long j2, Composer composer, int i, int i2) {
        int i3;
        Modifier.Companion companion;
        int i4;
        boolean z3;
        int i5;
        Object obj;
        int i6;
        long j3;
        long j4;
        boolean z4;
        int i7;
        long j5;
        Object obj2;
        MutableInteractionSource mutableInteractionSource2;
        Modifier modifier2;
        boolean z5;
        long j6;
        long j7;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Composer startRestartGroup = composer.startRestartGroup(-1499861761);
        ComposerKt.sourceInformation(startRestartGroup, "C(LeadingIconTab)P(5,4,7,1,3!2,6:c#ui.graphics.Color,8:c#ui.graphics.Color)158@6914L39,159@7007L7,160@7099L6,165@7347L60,167@7413L929:Tab.kt#jmzs0o");
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
        int i8 = i2 & 16;
        if (i8 != 0) {
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
                i5 = i2 & 64;
                if (i5 != 0) {
                    i3 |= 1572864;
                } else if ((3670016 & i) == 0) {
                    obj = mutableInteractionSource;
                    i3 |= startRestartGroup.changed(obj) ? 1048576 : 524288;
                    if ((29360128 & i) != 0) {
                        i6 = i3 | (((i2 & 128) == 0 && startRestartGroup.changed(j)) ? 8388608 : 4194304);
                    } else {
                        i6 = i3;
                    }
                    if ((i & 234881024) == 0) {
                        i6 |= ((i2 & 256) == 0 && startRestartGroup.changed(j2)) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                    }
                    if ((i6 & 191739611) == 38347922 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            if (i8 != 0) {
                                companion = Modifier.Companion;
                            }
                            if (i4 != 0) {
                                z3 = true;
                            }
                            if (i5 != 0) {
                                startRestartGroup.startReplaceableGroup(-492369756);
                                ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                                Object rememberedValue = startRestartGroup.rememberedValue();
                                if (rememberedValue == Composer.Companion.getEmpty()) {
                                    rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                startRestartGroup.endReplaceableGroup();
                                obj = (MutableInteractionSource) rememberedValue;
                            }
                            if ((i2 & 128) == 0) {
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                Object consume = startRestartGroup.consume(ContentColorKt.getLocalContentColor());
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                j3 = ((Color) consume).m3301unboximpl();
                                i6 &= -29360129;
                            } else {
                                j3 = j;
                            }
                            if ((i2 & 256) == 0) {
                                z4 = z3;
                                i7 = i6 & (-234881025);
                                j4 = Color.m3290copywmQWz5c$default(j3, ContentAlpha.INSTANCE.getMedium(startRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                obj2 = companion;
                                j5 = j3;
                            } else {
                                j4 = j2;
                                z4 = z3;
                                i7 = i6;
                                j5 = j3;
                                obj2 = companion;
                            }
                            mutableInteractionSource2 = obj;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 128) != 0) {
                                i6 &= -29360129;
                            }
                            if ((i2 & 256) != 0) {
                                i6 &= -234881025;
                            }
                            j5 = j;
                            j4 = j2;
                            z4 = z3;
                            mutableInteractionSource2 = obj;
                            i7 = i6;
                            obj2 = companion;
                        }
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1499861761, i7, -1, "androidx.compose.material.LeadingIconTab (Tab.kt:151)");
                        }
                        int i9 = i7;
                        int i10 = i9 >> 21;
                        m1490TabTransitionKlgxPg(j5, j4, z, ComposableLambdaKt.composableLambda(startRestartGroup, 866677691, true, new TabKt$LeadingIconTab$2(obj2, z, mutableInteractionSource2, RippleKt.m1559rememberRipple9IZ8Weo(true, 0.0f, j5, startRestartGroup, ((i7 >> 15) & 896) | 6, 2), z4, onClick, icon, i7, text)), startRestartGroup, (i10 & 112) | (i10 & 14) | CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE | ((i9 << 6) & 896));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier2 = obj2;
                        z5 = z4;
                        obj = mutableInteractionSource2;
                        j6 = j5;
                        j7 = j4;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        j6 = j;
                        j7 = j2;
                        z5 = z3;
                        modifier2 = companion;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                        return;
                    }
                    endRestartGroup.updateScope(new TabKt$LeadingIconTab$3(z, onClick, text, icon, modifier2, z5, obj, j6, j7, i, i2));
                    return;
                }
                obj = mutableInteractionSource;
                if ((29360128 & i) != 0) {
                }
                if ((i & 234881024) == 0) {
                }
                if ((i6 & 191739611) == 38347922) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i8 != 0) {
                }
                if (i4 != 0) {
                }
                if (i5 != 0) {
                }
                if ((i2 & 128) == 0) {
                }
                if ((i2 & 256) == 0) {
                }
                mutableInteractionSource2 = obj;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                int i92 = i7;
                int i102 = i92 >> 21;
                m1490TabTransitionKlgxPg(j5, j4, z, ComposableLambdaKt.composableLambda(startRestartGroup, 866677691, true, new TabKt$LeadingIconTab$2(obj2, z, mutableInteractionSource2, RippleKt.m1559rememberRipple9IZ8Weo(true, 0.0f, j5, startRestartGroup, ((i7 >> 15) & 896) | 6, 2), z4, onClick, icon, i7, text)), startRestartGroup, (i102 & 112) | (i102 & 14) | CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE | ((i92 << 6) & 896));
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier2 = obj2;
                z5 = z4;
                obj = mutableInteractionSource2;
                j6 = j5;
                j7 = j4;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            z3 = z2;
            i5 = i2 & 64;
            if (i5 != 0) {
            }
            obj = mutableInteractionSource;
            if ((29360128 & i) != 0) {
            }
            if ((i & 234881024) == 0) {
            }
            if ((i6 & 191739611) == 38347922) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i8 != 0) {
            }
            if (i4 != 0) {
            }
            if (i5 != 0) {
            }
            if ((i2 & 128) == 0) {
            }
            if ((i2 & 256) == 0) {
            }
            mutableInteractionSource2 = obj;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            int i922 = i7;
            int i1022 = i922 >> 21;
            m1490TabTransitionKlgxPg(j5, j4, z, ComposableLambdaKt.composableLambda(startRestartGroup, 866677691, true, new TabKt$LeadingIconTab$2(obj2, z, mutableInteractionSource2, RippleKt.m1559rememberRipple9IZ8Weo(true, 0.0f, j5, startRestartGroup, ((i7 >> 15) & 896) | 6, 2), z4, onClick, icon, i7, text)), startRestartGroup, (i1022 & 112) | (i1022 & 14) | CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE | ((i922 << 6) & 896));
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier2 = obj2;
            z5 = z4;
            obj = mutableInteractionSource2;
            j6 = j5;
            j7 = j4;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        companion = modifier;
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        z3 = z2;
        i5 = i2 & 64;
        if (i5 != 0) {
        }
        obj = mutableInteractionSource;
        if ((29360128 & i) != 0) {
        }
        if ((i & 234881024) == 0) {
        }
        if ((i6 & 191739611) == 38347922) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i8 != 0) {
        }
        if (i4 != 0) {
        }
        if (i5 != 0) {
        }
        if ((i2 & 128) == 0) {
        }
        if ((i2 & 256) == 0) {
        }
        mutableInteractionSource2 = obj;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        int i9222 = i7;
        int i10222 = i9222 >> 21;
        m1490TabTransitionKlgxPg(j5, j4, z, ComposableLambdaKt.composableLambda(startRestartGroup, 866677691, true, new TabKt$LeadingIconTab$2(obj2, z, mutableInteractionSource2, RippleKt.m1559rememberRipple9IZ8Weo(true, 0.0f, j5, startRestartGroup, ((i7 >> 15) & 896) | 6, 2), z4, onClick, icon, i7, text)), startRestartGroup, (i10222 & 112) | (i10222 & 14) | CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE | ((i9222 << 6) & 896));
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier2 = obj2;
        z5 = z4;
        obj = mutableInteractionSource2;
        j6 = j5;
        j7 = j4;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:133:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0124  */
    /* renamed from: Tab-EVJuX4I  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1489TabEVJuX4I(boolean z, Function0<Unit> onClick, Modifier modifier, boolean z2, MutableInteractionSource mutableInteractionSource, long j, long j2, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> content, Composer composer, int i, int i2) {
        int i3;
        Modifier.Companion companion;
        int i4;
        boolean z3;
        int i5;
        Object obj;
        int i6;
        long j3;
        int i7;
        long j4;
        boolean z4;
        MutableInteractionSource mutableInteractionSource2;
        long j5;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(713679175);
        ComposerKt.sourceInformation(startRestartGroup, "C(Tab)P(5,4,3,1,2,6:c#ui.graphics.Color,7:c#ui.graphics.Color)227@10083L39,228@10176L7,229@10268L6,235@10562L60,237@10628L618:Tab.kt#jmzs0o");
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
            companion = modifier;
            i3 |= startRestartGroup.changed(companion) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
            } else if ((i & 7168) == 0) {
                z3 = z2;
                i3 |= startRestartGroup.changed(z3) ? 2048 : 1024;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((57344 & i) == 0) {
                    obj = mutableInteractionSource;
                    i3 |= startRestartGroup.changed(obj) ? 16384 : 8192;
                    if ((458752 & i) != 0) {
                        i6 = i3 | (((i2 & 32) == 0 && startRestartGroup.changed(j)) ? 131072 : 65536);
                    } else {
                        i6 = i3;
                    }
                    if ((i & 3670016) != 0) {
                        j3 = j2;
                        i6 |= ((i2 & 64) == 0 && startRestartGroup.changed(j3)) ? 1048576 : 524288;
                    } else {
                        j3 = j2;
                    }
                    if ((i2 & 128) != 0) {
                        if ((29360128 & i) == 0) {
                            i7 = startRestartGroup.changedInstance(content) ? 8388608 : 4194304;
                        }
                        if ((23967451 & i6) == 4793490 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                if (i8 != 0) {
                                    companion = Modifier.Companion;
                                }
                                if (i4 != 0) {
                                    z3 = true;
                                }
                                if (i5 != 0) {
                                    startRestartGroup.startReplaceableGroup(-492369756);
                                    ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                                    Object rememberedValue = startRestartGroup.rememberedValue();
                                    if (rememberedValue == Composer.Companion.getEmpty()) {
                                        rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                        startRestartGroup.updateRememberedValue(rememberedValue);
                                    }
                                    startRestartGroup.endReplaceableGroup();
                                    obj = (MutableInteractionSource) rememberedValue;
                                }
                                if ((i2 & 32) != 0) {
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                    Object consume = startRestartGroup.consume(ContentColorKt.getLocalContentColor());
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    j4 = ((Color) consume).m3301unboximpl();
                                    i6 &= -458753;
                                } else {
                                    j4 = j;
                                }
                                if ((i2 & 64) != 0) {
                                    j3 = Color.m3290copywmQWz5c$default(j4, ContentAlpha.INSTANCE.getMedium(startRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                    i6 &= -3670017;
                                }
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i2 & 32) != 0) {
                                    i6 &= -458753;
                                }
                                if ((i2 & 64) != 0) {
                                    i6 &= -3670017;
                                }
                                j4 = j;
                            }
                            MutableInteractionSource mutableInteractionSource3 = obj;
                            long j6 = j3;
                            int i9 = i6;
                            Modifier modifier2 = companion;
                            boolean z5 = z3;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(713679175, i9, -1, "androidx.compose.material.Tab (Tab.kt:222)");
                            }
                            int i10 = i9 >> 15;
                            m1490TabTransitionKlgxPg(j4, j6, z, ComposableLambdaKt.composableLambda(startRestartGroup, -1237246709, true, new TabKt$Tab$5(modifier2, z, mutableInteractionSource3, RippleKt.m1559rememberRipple9IZ8Weo(true, 0.0f, j4, startRestartGroup, ((i9 >> 9) & 896) | 6, 2), z5, onClick, content, i9)), startRestartGroup, (i10 & 112) | (i10 & 14) | CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE | ((i9 << 6) & 896));
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            companion = modifier2;
                            z4 = z5;
                            mutableInteractionSource2 = mutableInteractionSource3;
                            j5 = j4;
                            j3 = j6;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            z4 = z3;
                            mutableInteractionSource2 = obj;
                            j5 = j;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup == null) {
                            return;
                        }
                        endRestartGroup.updateScope(new TabKt$Tab$6(z, onClick, companion, z4, mutableInteractionSource2, j5, j3, content, i, i2));
                        return;
                    }
                    i7 = 12582912;
                    i6 |= i7;
                    if ((23967451 & i6) == 4793490) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (i4 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if ((i2 & 32) != 0) {
                    }
                    if ((i2 & 64) != 0) {
                    }
                    MutableInteractionSource mutableInteractionSource32 = obj;
                    long j62 = j3;
                    int i92 = i6;
                    Modifier modifier22 = companion;
                    boolean z52 = z3;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    int i102 = i92 >> 15;
                    m1490TabTransitionKlgxPg(j4, j62, z, ComposableLambdaKt.composableLambda(startRestartGroup, -1237246709, true, new TabKt$Tab$5(modifier22, z, mutableInteractionSource32, RippleKt.m1559rememberRipple9IZ8Weo(true, 0.0f, j4, startRestartGroup, ((i92 >> 9) & 896) | 6, 2), z52, onClick, content, i92)), startRestartGroup, (i102 & 112) | (i102 & 14) | CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE | ((i92 << 6) & 896));
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    companion = modifier22;
                    z4 = z52;
                    mutableInteractionSource2 = mutableInteractionSource32;
                    j5 = j4;
                    j3 = j62;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                obj = mutableInteractionSource;
                if ((458752 & i) != 0) {
                }
                if ((i & 3670016) != 0) {
                }
                if ((i2 & 128) != 0) {
                }
                i6 |= i7;
                if ((23967451 & i6) == 4793490) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i8 != 0) {
                }
                if (i4 != 0) {
                }
                if (i5 != 0) {
                }
                if ((i2 & 32) != 0) {
                }
                if ((i2 & 64) != 0) {
                }
                MutableInteractionSource mutableInteractionSource322 = obj;
                long j622 = j3;
                int i922 = i6;
                Modifier modifier222 = companion;
                boolean z522 = z3;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                int i1022 = i922 >> 15;
                m1490TabTransitionKlgxPg(j4, j622, z, ComposableLambdaKt.composableLambda(startRestartGroup, -1237246709, true, new TabKt$Tab$5(modifier222, z, mutableInteractionSource322, RippleKt.m1559rememberRipple9IZ8Weo(true, 0.0f, j4, startRestartGroup, ((i922 >> 9) & 896) | 6, 2), z522, onClick, content, i922)), startRestartGroup, (i1022 & 112) | (i1022 & 14) | CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE | ((i922 << 6) & 896));
                if (ComposerKt.isTraceInProgress()) {
                }
                companion = modifier222;
                z4 = z522;
                mutableInteractionSource2 = mutableInteractionSource322;
                j5 = j4;
                j3 = j622;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z3 = z2;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            obj = mutableInteractionSource;
            if ((458752 & i) != 0) {
            }
            if ((i & 3670016) != 0) {
            }
            if ((i2 & 128) != 0) {
            }
            i6 |= i7;
            if ((23967451 & i6) == 4793490) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i8 != 0) {
            }
            if (i4 != 0) {
            }
            if (i5 != 0) {
            }
            if ((i2 & 32) != 0) {
            }
            if ((i2 & 64) != 0) {
            }
            MutableInteractionSource mutableInteractionSource3222 = obj;
            long j6222 = j3;
            int i9222 = i6;
            Modifier modifier2222 = companion;
            boolean z5222 = z3;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            int i10222 = i9222 >> 15;
            m1490TabTransitionKlgxPg(j4, j6222, z, ComposableLambdaKt.composableLambda(startRestartGroup, -1237246709, true, new TabKt$Tab$5(modifier2222, z, mutableInteractionSource3222, RippleKt.m1559rememberRipple9IZ8Weo(true, 0.0f, j4, startRestartGroup, ((i9222 >> 9) & 896) | 6, 2), z5222, onClick, content, i9222)), startRestartGroup, (i10222 & 112) | (i10222 & 14) | CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE | ((i9222 << 6) & 896));
            if (ComposerKt.isTraceInProgress()) {
            }
            companion = modifier2222;
            z4 = z5222;
            mutableInteractionSource2 = mutableInteractionSource3222;
            j5 = j4;
            j3 = j6222;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        companion = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z3 = z2;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        obj = mutableInteractionSource;
        if ((458752 & i) != 0) {
        }
        if ((i & 3670016) != 0) {
        }
        if ((i2 & 128) != 0) {
        }
        i6 |= i7;
        if ((23967451 & i6) == 4793490) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i8 != 0) {
        }
        if (i4 != 0) {
        }
        if (i5 != 0) {
        }
        if ((i2 & 32) != 0) {
        }
        if ((i2 & 64) != 0) {
        }
        MutableInteractionSource mutableInteractionSource32222 = obj;
        long j62222 = j3;
        int i92222 = i6;
        Modifier modifier22222 = companion;
        boolean z52222 = z3;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        int i102222 = i92222 >> 15;
        m1490TabTransitionKlgxPg(j4, j62222, z, ComposableLambdaKt.composableLambda(startRestartGroup, -1237246709, true, new TabKt$Tab$5(modifier22222, z, mutableInteractionSource32222, RippleKt.m1559rememberRipple9IZ8Weo(true, 0.0f, j4, startRestartGroup, ((i92222 >> 9) & 896) | 6, 2), z52222, onClick, content, i92222)), startRestartGroup, (i102222 & 112) | (i102222 & 14) | CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE | ((i92222 << 6) & 896));
        if (ComposerKt.isTraceInProgress()) {
        }
        companion = modifier22222;
        z4 = z52222;
        mutableInteractionSource2 = mutableInteractionSource32222;
        j5 = j4;
        j3 = j62222;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: TabTransition-Klgx-Pg  reason: not valid java name */
    public static final void m1490TabTransitionKlgxPg(long j, long j2, boolean z, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-405571117);
        ComposerKt.sourceInformation(startRestartGroup, "C(TabTransition)P(0:c#ui.graphics.Color,2:c#ui.graphics.Color,3)268@11677L26,269@11732L550,287@12287L164:Tab.kt#jmzs0o");
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
                ComposerKt.traceEventStart(-405571117, i2, -1, "androidx.compose.material.TabTransition (Tab.kt:262)");
            }
            int i3 = i2 >> 6;
            Transition updateTransition = TransitionKt.updateTransition(Boolean.valueOf(z), (String) null, startRestartGroup, i3 & 14, 2);
            TabKt$TabTransition$color$2 tabKt$TabTransition$color$2 = TabKt$TabTransition$color$2.INSTANCE;
            startRestartGroup.startReplaceableGroup(-1939694975);
            ComposerKt.sourceInformation(startRestartGroup, "CC(animateColor)P(2)68@3220L31,69@3287L70,73@3370L70:Transition.kt#xbi5r1");
            boolean booleanValue = ((Boolean) updateTransition.getTargetState()).booleanValue();
            startRestartGroup.startReplaceableGroup(1445938070);
            ComposerKt.sourceInformation(startRestartGroup, "C:Tab.kt#jmzs0o");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1445938070, 0, -1, "androidx.compose.material.TabTransition.<anonymous> (Tab.kt:284)");
            }
            long j3 = booleanValue ? j : j2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            startRestartGroup.endReplaceableGroup();
            ColorSpace m3295getColorSpaceimpl = Color.m3295getColorSpaceimpl(j3);
            startRestartGroup.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
            boolean changed = startRestartGroup.changed(m3295getColorSpaceimpl);
            TwoWayConverter<Color, AnimationVector4D> rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = ColorVectorConverterKt.getVectorConverter(Color.Companion).invoke(m3295getColorSpaceimpl);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            TwoWayConverter twoWayConverter = (TwoWayConverter) rememberedValue;
            startRestartGroup.startReplaceableGroup(-142660079);
            ComposerKt.sourceInformation(startRestartGroup, "CC(animateValue)P(3,2)857@34142L32,858@34197L31,859@34253L23,861@34289L89:Transition.kt#pdpnli");
            boolean booleanValue2 = ((Boolean) updateTransition.getCurrentState()).booleanValue();
            startRestartGroup.startReplaceableGroup(1445938070);
            ComposerKt.sourceInformation(startRestartGroup, "C:Tab.kt#jmzs0o");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1445938070, 0, -1, "androidx.compose.material.TabTransition.<anonymous> (Tab.kt:284)");
            }
            long j4 = booleanValue2 ? j : j2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            startRestartGroup.endReplaceableGroup();
            Color m3281boximpl = Color.m3281boximpl(j4);
            boolean booleanValue3 = ((Boolean) updateTransition.getTargetState()).booleanValue();
            startRestartGroup.startReplaceableGroup(1445938070);
            ComposerKt.sourceInformation(startRestartGroup, "C:Tab.kt#jmzs0o");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1445938070, 0, -1, "androidx.compose.material.TabTransition.<anonymous> (Tab.kt:284)");
            }
            long j5 = booleanValue3 ? j : j2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            startRestartGroup.endReplaceableGroup();
            State createTransitionAnimation = TransitionKt.createTransitionAnimation(updateTransition, m3281boximpl, Color.m3281boximpl(j5), tabKt$TabTransition$color$2.invoke((TabKt$TabTransition$color$2) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), twoWayConverter, "ColorAnimation", startRestartGroup, 32768);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m3281boximpl(Color.m3290copywmQWz5c$default(TabTransition_Klgx_Pg$lambda$5(createTransitionAnimation), 1.0f, 0.0f, 0.0f, 0.0f, 14, null))), ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m3293getAlphaimpl(TabTransition_Klgx_Pg$lambda$5(createTransitionAnimation))))}, function2, startRestartGroup, (i3 & 112) | 8);
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
        Composer startRestartGroup = composer.startRestartGroup(1249848471);
        ComposerKt.sourceInformation(startRestartGroup, "C(TabBaselineLayout)P(1)304@12859L1909:Tab.kt#jmzs0o");
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
                ComposerKt.traceEventStart(1249848471, i2, -1, "androidx.compose.material.TabBaselineLayout (Tab.kt:300)");
            }
            MeasurePolicy measurePolicy = new MeasurePolicy() { // from class: androidx.compose.material.TabKt$TabBaselineLayout$2
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
                    return MeasureScope.CC.layout$default(Layout, max, i3, null, new TabKt$TabBaselineLayout$2$measure$1(mo4545measureBRTryo0, placeable, Layout, max, i3, mo4545measureBRTryo0 != null ? Integer.valueOf(mo4545measureBRTryo0.get(AlignmentLineKt.getFirstBaseline())) : null, mo4545measureBRTryo0 != null ? Integer.valueOf(mo4545measureBRTryo0.get(AlignmentLineKt.getLastBaseline())) : null), 4, null);
                }
            };
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(Modifier.Companion);
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
            Updater.m2900setimpl(m2893constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (m2893constructorimpl.getInserting() || !Intrinsics.areEqual(m2893constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2893constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2893constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2141028452, "C:Tab.kt#jmzs0o");
            startRestartGroup.startReplaceableGroup(-2141028452);
            ComposerKt.sourceInformation(startRestartGroup, "307@12925L123");
            if (function2 != null) {
                Modifier m750paddingVpY3zN4$default = PaddingKt.m750paddingVpY3zN4$default(LayoutIdKt.layoutId(Modifier.Companion, "text"), HorizontalTextPadding, 0.0f, 2, null);
                startRestartGroup.startReplaceableGroup(733328855);
                ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)69@3214L67,70@3286L130:Box.kt#2w3rfo");
                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(m750paddingVpY3zN4$default);
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor2);
                } else {
                    startRestartGroup.useNode();
                }
                Composer m2893constructorimpl2 = Updater.m2893constructorimpl(startRestartGroup);
                Updater.m2900setimpl(m2893constructorimpl2, rememberBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.m2900setimpl(m2893constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                if (m2893constructorimpl2.getInserting() || !Intrinsics.areEqual(m2893constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    m2893constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    m2893constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                modifierMaterializerOf2.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629358, "C71@3331L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1952926252, "C309@13040L6:Tab.kt#jmzs0o");
                function2.invoke(startRestartGroup, Integer.valueOf(i2 & 14));
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
            }
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(448373045);
            ComposerKt.sourceInformation(startRestartGroup, "312@13111L41");
            if (function22 != null) {
                Modifier layoutId = LayoutIdKt.layoutId(Modifier.Companion, "icon");
                startRestartGroup.startReplaceableGroup(733328855);
                ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)69@3214L67,70@3286L130:Box.kt#2w3rfo");
                MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor3 = ComposeUiNode.Companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(layoutId);
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor3);
                } else {
                    startRestartGroup.useNode();
                }
                Composer m2893constructorimpl3 = Updater.m2893constructorimpl(startRestartGroup);
                Updater.m2900setimpl(m2893constructorimpl3, rememberBoxMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.m2900setimpl(m2893constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                if (m2893constructorimpl3.getInserting() || !Intrinsics.areEqual(m2893constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    m2893constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    m2893constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                modifierMaterializerOf3.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629358, "C71@3331L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1952926148, "C312@13144L6:Tab.kt#jmzs0o");
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
        int mo582roundToPx0680j_4 = density.mo582roundToPx0680j_4(f) + density.mo582roundToPx0680j_4(TabRowDefaults.INSTANCE.m1498getIndicatorHeightD9Ej5fM());
        int i5 = (i2 - i4) - mo582roundToPx0680j_4;
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, (i - placeable.getWidth()) / 2, i5, 0.0f, 4, null);
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, (i - placeable2.getWidth()) / 2, i5 - ((placeable2.getHeight() + density.mo581roundToPxR2X_6o(IconDistanceFromBaseline)) - i3), 0.0f, 4, null);
    }

    private static final long TabTransition_Klgx_Pg$lambda$5(State<Color> state) {
        return state.getValue().m3301unboximpl();
    }
}
