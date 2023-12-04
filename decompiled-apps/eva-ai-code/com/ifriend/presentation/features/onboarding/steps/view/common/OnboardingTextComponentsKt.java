package com.ifriend.presentation.features.onboarding.steps.view.common;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.ifriend.keychain.cipherStorage.CipherStorageKeystoreRsaEcb;
import com.ifriend.ui.components.buttons.GlowingButtonKt;
import com.ifriend.ui.components.modifier.ConditionalModifierKt;
import com.ifriend.ui.theme.AppFontFamily;
import com.ifriend.ui.theme.AppTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: OnboardingTextComponents.kt */
@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\u001a7\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\tH\u0007¢\u0006\u0002\u0010\n\u001a\u001f\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\r\u001a3\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001a)\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\u0014\u001aO\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001cH\u0007¢\u0006\u0002\u0010\u001d\u001a1\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u001f\u001a\u00020\u0010H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b \u0010!\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\"²\u0006\n\u0010#\u001a\u00020$X\u008a\u0084\u0002²\u0006\n\u0010%\u001a\u00020$X\u008a\u0084\u0002"}, d2 = {"OnboardingButton", "", "text", "", "modifier", "Landroidx/compose/ui/Modifier;", "isActive", "", "onClick", "Lkotlin/Function0;", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "OnboardingDescription", "isVisible", "(Ljava/lang/String;ZLandroidx/compose/runtime/Composer;II)V", "OnboardingInfo", TtmlNode.ATTR_TTS_TEXT_ALIGN, "Landroidx/compose/ui/text/style/TextAlign;", "OnboardingInfo-cbXALmg", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/runtime/Composer;II)V", "OnboardingSmallSubtitle", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;II)V", "OnboardingTextField", "onTextChanged", "Lkotlin/Function1;", "placeholder", "keyboardOptions", "Landroidx/compose/foundation/text/KeyboardOptions;", "keyboardActions", "Landroidx/compose/foundation/text/KeyboardActions;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;Landroidx/compose/runtime/Composer;II)V", "OnboardingTitle", "align", "OnboardingTitle-8iNrtrE", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;ILandroidx/compose/runtime/Composer;II)V", "presentation_release", "color", "Landroidx/compose/ui/graphics/Color;", "textColor"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OnboardingTextComponentsKt {
    /* JADX WARN: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0161  */
    /* renamed from: OnboardingTitle-8iNrtrE  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m6936OnboardingTitle8iNrtrE(String text, Modifier modifier, int i, Composer composer, int i2, int i3) {
        int i4;
        Object obj;
        int i5;
        int i6;
        Object obj2;
        int m5469getCentere0LSkKk;
        Composer composer2;
        int i7;
        Modifier modifier2;
        int i8;
        Intrinsics.checkNotNullParameter(text, "text");
        Composer startRestartGroup = composer.startRestartGroup(-1307487324);
        ComposerKt.sourceInformation(startRestartGroup, "C(OnboardingTitle)P(2,1,0:c#ui.text.style.TextAlign)");
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i4 = (startRestartGroup.changed(text) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i9 = i3 & 2;
        if (i9 != 0) {
            i4 |= 48;
        } else if ((i2 & 112) == 0) {
            obj = modifier;
            i4 |= startRestartGroup.changed(obj) ? 32 : 16;
            if ((i2 & 896) != 0) {
                if ((i3 & 4) == 0) {
                    i5 = i;
                    if (startRestartGroup.changed(i5)) {
                        i8 = 256;
                        i4 |= i8;
                    }
                } else {
                    i5 = i;
                }
                i8 = 128;
                i4 |= i8;
            } else {
                i5 = i;
            }
            if ((i4 & 731) == 146 || !startRestartGroup.getSkipping()) {
                startRestartGroup.startDefaults();
                if ((i2 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                    Modifier.Companion companion = i9 == 0 ? Modifier.Companion : obj;
                    if ((i3 & 4) == 0) {
                        i6 = i4 & (-897);
                        obj2 = companion;
                        m5469getCentere0LSkKk = TextAlign.Companion.m5469getCentere0LSkKk();
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1307487324, i6, -1, "com.ifriend.presentation.features.onboarding.steps.view.common.OnboardingTitle (OnboardingTextComponents.kt:45)");
                        }
                        TextStyle textStyle = new TextStyle(Color.Companion.m3328getWhite0d7_KjU(), TextUnitKt.getSp(36), FontWeight.Companion.getMedium(), (FontStyle) null, (FontSynthesis) null, AppFontFamily.INSTANCE.getGhino(), (String) null, TextUnitKt.getSp(-1), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.m5462boximpl(m5469getCentere0LSkKk), (TextDirection) null, TextUnitKt.getSp(36), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16613208, (DefaultConstructorMarker) null);
                        composer2 = startRestartGroup;
                        Modifier modifier3 = obj2;
                        TextKt.m2145Text4IGK_g(text, PaddingKt.m750paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(obj2, 0.0f, 1, null), AppTheme.INSTANCE.getDimensions(startRestartGroup, AppTheme.$stable).m7175getMediumD9Ej5fM(), 0.0f, 2, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyle, composer2, i6 & 14, 0, 65532);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        i7 = m5469getCentere0LSkKk;
                        modifier2 = modifier3;
                    } else {
                        i6 = i4;
                        obj2 = companion;
                    }
                } else {
                    startRestartGroup.skipToGroupEnd();
                    if ((i3 & 4) != 0) {
                        i4 &= -897;
                    }
                    i6 = i4;
                    obj2 = obj;
                }
                m5469getCentere0LSkKk = i5;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                TextStyle textStyle2 = new TextStyle(Color.Companion.m3328getWhite0d7_KjU(), TextUnitKt.getSp(36), FontWeight.Companion.getMedium(), (FontStyle) null, (FontSynthesis) null, AppFontFamily.INSTANCE.getGhino(), (String) null, TextUnitKt.getSp(-1), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.m5462boximpl(m5469getCentere0LSkKk), (TextDirection) null, TextUnitKt.getSp(36), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16613208, (DefaultConstructorMarker) null);
                composer2 = startRestartGroup;
                Modifier modifier32 = obj2;
                TextKt.m2145Text4IGK_g(text, PaddingKt.m750paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(obj2, 0.0f, 1, null), AppTheme.INSTANCE.getDimensions(startRestartGroup, AppTheme.$stable).m7175getMediumD9Ej5fM(), 0.0f, 2, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyle2, composer2, i6 & 14, 0, 65532);
                if (ComposerKt.isTraceInProgress()) {
                }
                i7 = m5469getCentere0LSkKk;
                modifier2 = modifier32;
            } else {
                startRestartGroup.skipToGroupEnd();
                modifier2 = obj;
                i7 = i5;
                composer2 = startRestartGroup;
            }
            ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                return;
            }
            endRestartGroup.updateScope(new OnboardingTextComponentsKt$OnboardingTitle$1(text, modifier2, i7, i2, i3));
            return;
        }
        obj = modifier;
        if ((i2 & 896) != 0) {
        }
        if ((i4 & 731) == 146) {
        }
        startRestartGroup.startDefaults();
        if ((i2 & 1) != 0) {
        }
        if (i9 == 0) {
        }
        if ((i3 & 4) == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OnboardingSmallSubtitle(String text, Modifier modifier, boolean z, Composer composer, int i, int i2) {
        int i3;
        Object obj;
        int i4;
        boolean z2;
        int i5;
        Composer composer2;
        boolean z3;
        Modifier modifier2;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(text, "text");
        Composer startRestartGroup = composer.startRestartGroup(1939410957);
        ComposerKt.sourceInformation(startRestartGroup, "C(OnboardingSmallSubtitle)P(2,1)");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(text) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
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
                i5 = i3;
                if ((i5 & 731) == 146 || !startRestartGroup.getSkipping()) {
                    Modifier.Companion companion = i6 != 0 ? Modifier.Companion : obj;
                    boolean z4 = i4 != 0 ? true : z2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1939410957, i5, -1, "com.ifriend.presentation.features.onboarding.steps.view.common.OnboardingSmallSubtitle (OnboardingTextComponents.kt:68)");
                    }
                    Color.Companion companion2 = Color.Companion;
                    Modifier modifier3 = companion;
                    composer2 = startRestartGroup;
                    TextKt.m2145Text4IGK_g(text, PaddingKt.m750paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), AppTheme.INSTANCE.getDimensions(startRestartGroup, AppTheme.$stable).m7175getMediumD9Ej5fM(), 0.0f, 2, null), OnboardingSmallSubtitle$lambda$0(SingleValueAnimationKt.m329animateColorAsStateeuL9pac(z4 ? Color.m3290copywmQWz5c$default(companion2.m3328getWhite0d7_KjU(), 0.8f, 0.0f, 0.0f, 0.0f, 14, null) : companion2.m3326getTransparent0d7_KjU(), null, "OnboardingSmallSubtitle::color", null, startRestartGroup, 384, 10)), TextUnitKt.getSp(14), (FontStyle) null, FontWeight.Companion.getMedium(), AppFontFamily.INSTANCE.getIbmSans(), 0L, (TextDecoration) null, TextAlign.m5462boximpl(TextAlign.Companion.m5469getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i5 & 14) | 199680, 0, 130448);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z3 = z4;
                    modifier2 = modifier3;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    modifier2 = obj;
                    z3 = z2;
                    composer2 = startRestartGroup;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                    return;
                }
                endRestartGroup.updateScope(new OnboardingTextComponentsKt$OnboardingSmallSubtitle$1(text, modifier2, z3, i, i2));
                return;
            }
            z2 = z;
            i5 = i3;
            if ((i5 & 731) == 146) {
            }
            if (i6 != 0) {
            }
            if (i4 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Color.Companion companion22 = Color.Companion;
            Modifier modifier32 = companion;
            composer2 = startRestartGroup;
            TextKt.m2145Text4IGK_g(text, PaddingKt.m750paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), AppTheme.INSTANCE.getDimensions(startRestartGroup, AppTheme.$stable).m7175getMediumD9Ej5fM(), 0.0f, 2, null), OnboardingSmallSubtitle$lambda$0(SingleValueAnimationKt.m329animateColorAsStateeuL9pac(z4 ? Color.m3290copywmQWz5c$default(companion22.m3328getWhite0d7_KjU(), 0.8f, 0.0f, 0.0f, 0.0f, 14, null) : companion22.m3326getTransparent0d7_KjU(), null, "OnboardingSmallSubtitle::color", null, startRestartGroup, 384, 10)), TextUnitKt.getSp(14), (FontStyle) null, FontWeight.Companion.getMedium(), AppFontFamily.INSTANCE.getIbmSans(), 0L, (TextDecoration) null, TextAlign.m5462boximpl(TextAlign.Companion.m5469getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i5 & 14) | 199680, 0, 130448);
            if (ComposerKt.isTraceInProgress()) {
            }
            z3 = z4;
            modifier2 = modifier32;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        obj = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z2 = z;
        i5 = i3;
        if ((i5 & 731) == 146) {
        }
        if (i6 != 0) {
        }
        if (i4 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        Color.Companion companion222 = Color.Companion;
        Modifier modifier322 = companion;
        composer2 = startRestartGroup;
        TextKt.m2145Text4IGK_g(text, PaddingKt.m750paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), AppTheme.INSTANCE.getDimensions(startRestartGroup, AppTheme.$stable).m7175getMediumD9Ej5fM(), 0.0f, 2, null), OnboardingSmallSubtitle$lambda$0(SingleValueAnimationKt.m329animateColorAsStateeuL9pac(z4 ? Color.m3290copywmQWz5c$default(companion222.m3328getWhite0d7_KjU(), 0.8f, 0.0f, 0.0f, 0.0f, 14, null) : companion222.m3326getTransparent0d7_KjU(), null, "OnboardingSmallSubtitle::color", null, startRestartGroup, 384, 10)), TextUnitKt.getSp(14), (FontStyle) null, FontWeight.Companion.getMedium(), AppFontFamily.INSTANCE.getIbmSans(), 0L, (TextDecoration) null, TextAlign.m5462boximpl(TextAlign.Companion.m5469getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i5 & 14) | 199680, 0, 130448);
        if (ComposerKt.isTraceInProgress()) {
        }
        z3 = z4;
        modifier2 = modifier322;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OnboardingDescription(String text, boolean z, Composer composer, int i, int i2) {
        int i3;
        boolean z2;
        int i4;
        Composer composer2;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(text, "text");
        Composer startRestartGroup = composer.startRestartGroup(-1716018905);
        ComposerKt.sourceInformation(startRestartGroup, "C(OnboardingDescription)P(1)");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(text) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            z2 = z;
            i3 |= startRestartGroup.changed(z2) ? 32 : 16;
            i4 = i3;
            if ((i4 & 91) == 18 || !startRestartGroup.getSkipping()) {
                boolean z3 = i5 == 0 ? true : z2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1716018905, i4, -1, "com.ifriend.presentation.features.onboarding.steps.view.common.OnboardingDescription (OnboardingTextComponents.kt:90)");
                }
                Color.Companion companion = Color.Companion;
                composer2 = startRestartGroup;
                TextKt.m2145Text4IGK_g(text, SizeKt.m800width3ABfNKs(Modifier.Companion, Dp.m5607constructorimpl(282)), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(OnboardingDescription$lambda$1(SingleValueAnimationKt.m329animateColorAsStateeuL9pac(!z3 ? Color.m3290copywmQWz5c$default(companion.m3328getWhite0d7_KjU(), 0.2f, 0.0f, 0.0f, 0.0f, 14, null) : companion.m3326getTransparent0d7_KjU(), null, "OnboardingDescriptionText::textColor", null, startRestartGroup, 384, 10)), TextUnitKt.getSp(14), FontWeight.Companion.getMedium(), (FontStyle) null, (FontSynthesis) null, AppFontFamily.INSTANCE.getIbmSans(), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.m5462boximpl(TextAlign.Companion.m5469getCentere0LSkKk()), (TextDirection) null, TextUnitKt.getSp(18), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16613336, (DefaultConstructorMarker) null), composer2, (i4 & 14) | 48, 0, 65532);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z2 = z3;
            } else {
                startRestartGroup.skipToGroupEnd();
                composer2 = startRestartGroup;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
                return;
            }
            endRestartGroup.updateScope(new OnboardingTextComponentsKt$OnboardingDescription$1(text, z2, i, i2));
            return;
        }
        z2 = z;
        i4 = i3;
        if ((i4 & 91) == 18) {
        }
        if (i5 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        Color.Companion companion2 = Color.Companion;
        composer2 = startRestartGroup;
        TextKt.m2145Text4IGK_g(text, SizeKt.m800width3ABfNKs(Modifier.Companion, Dp.m5607constructorimpl(282)), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(OnboardingDescription$lambda$1(SingleValueAnimationKt.m329animateColorAsStateeuL9pac(!z3 ? Color.m3290copywmQWz5c$default(companion2.m3328getWhite0d7_KjU(), 0.2f, 0.0f, 0.0f, 0.0f, 14, null) : companion2.m3326getTransparent0d7_KjU(), null, "OnboardingDescriptionText::textColor", null, startRestartGroup, 384, 10)), TextUnitKt.getSp(14), FontWeight.Companion.getMedium(), (FontStyle) null, (FontSynthesis) null, AppFontFamily.INSTANCE.getIbmSans(), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.m5462boximpl(TextAlign.Companion.m5469getCentere0LSkKk()), (TextDirection) null, TextUnitKt.getSp(18), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16613336, (DefaultConstructorMarker) null), composer2, (i4 & 14) | 48, 0, 65532);
        if (ComposerKt.isTraceInProgress()) {
        }
        z2 = z3;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:136:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OnboardingTextField(String text, Function1<? super String, Unit> onTextChanged, String placeholder, Modifier modifier, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, Composer composer, int i, int i2) {
        int i3;
        Modifier.Companion companion;
        int i4;
        Object obj;
        KeyboardActions keyboardActions2;
        KeyboardActions keyboardActions3;
        Modifier modifier2;
        Object obj2;
        int i5;
        Object rememberedValue;
        Object rememberedValue2;
        boolean changed;
        OnboardingTextComponentsKt$OnboardingTextField$1$1 rememberedValue3;
        int currentCompositeKeyHash;
        Composer m2893constructorimpl;
        String str;
        boolean z;
        int i6;
        boolean changed2;
        OnboardingTextComponentsKt$OnboardingTextField$2$2$1 rememberedValue4;
        Composer composer2;
        Modifier modifier3;
        KeyboardOptions keyboardOptions2;
        KeyboardActions keyboardActions4;
        ScopeUpdateScope endRestartGroup;
        int i7;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(onTextChanged, "onTextChanged");
        Intrinsics.checkNotNullParameter(placeholder, "placeholder");
        Composer startRestartGroup = composer.startRestartGroup(-880334420);
        ComposerKt.sourceInformation(startRestartGroup, "C(OnboardingTextField)P(5,3,4,2,1)");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(text) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changedInstance(onTextChanged) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= startRestartGroup.changed(placeholder) ? 256 : 128;
        }
        int i8 = i2 & 8;
        if (i8 != 0) {
            i3 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
        } else if ((i & 7168) == 0) {
            companion = modifier;
            i3 |= startRestartGroup.changed(companion) ? 2048 : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((57344 & i) == 0) {
                obj = keyboardOptions;
                i3 |= startRestartGroup.changed(obj) ? 16384 : 8192;
                if ((458752 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        keyboardActions2 = keyboardActions;
                        if (startRestartGroup.changed(keyboardActions2)) {
                            i7 = 131072;
                            i3 |= i7;
                        }
                    } else {
                        keyboardActions2 = keyboardActions;
                    }
                    i7 = 65536;
                    i3 |= i7;
                } else {
                    keyboardActions2 = keyboardActions;
                }
                if ((374491 & i3) == 74898 || !startRestartGroup.getSkipping()) {
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                        if (i8 != 0) {
                            companion = Modifier.Companion;
                        }
                        if (i4 != 0) {
                            obj = new KeyboardOptions(0, false, 0, 0, 15, null);
                        }
                        if ((i2 & 32) != 0) {
                            keyboardActions3 = new KeyboardActions(null, null, null, null, null, null, 63, null);
                            modifier2 = companion;
                            obj2 = obj;
                            i5 = i3 & (-458753);
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-880334420, i5, -1, "com.ifriend.presentation.features.onboarding.steps.view.common.OnboardingTextField (OnboardingTextComponents.kt:117)");
                            }
                            startRestartGroup.startReplaceableGroup(-492369756);
                            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == Composer.Companion.getEmpty()) {
                                rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            startRestartGroup.endReplaceableGroup();
                            MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) rememberedValue;
                            startRestartGroup.startReplaceableGroup(-492369756);
                            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                            rememberedValue2 = startRestartGroup.rememberedValue();
                            if (rememberedValue2 == Composer.Companion.getEmpty()) {
                                rememberedValue2 = new FocusRequester();
                                startRestartGroup.updateRememberedValue(rememberedValue2);
                            }
                            startRestartGroup.endReplaceableGroup();
                            FocusRequester focusRequester = (FocusRequester) rememberedValue2;
                            Unit unit = Unit.INSTANCE;
                            startRestartGroup.startReplaceableGroup(1157296644);
                            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                            changed = startRestartGroup.changed(focusRequester);
                            rememberedValue3 = startRestartGroup.rememberedValue();
                            if (!changed || rememberedValue3 == Composer.Companion.getEmpty()) {
                                rememberedValue3 = new OnboardingTextComponentsKt$OnboardingTextField$1$1(focusRequester, null);
                                startRestartGroup.updateRememberedValue(rememberedValue3);
                            }
                            startRestartGroup.endReplaceableGroup();
                            EffectsKt.LaunchedEffect(unit, (Function2) rememberedValue3, startRestartGroup, 70);
                            Alignment center = Alignment.Companion.getCenter();
                            startRestartGroup.startReplaceableGroup(733328855);
                            ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)69@3214L67,70@3286L130:Box.kt#2w3rfo");
                            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, startRestartGroup, 6);
                            startRestartGroup.startReplaceableGroup(-1323940314);
                            ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
                            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                            Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(Modifier.Companion);
                            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            startRestartGroup.startReusableNode();
                            if (!startRestartGroup.getInserting()) {
                                startRestartGroup.createNode(constructor);
                            } else {
                                startRestartGroup.useNode();
                            }
                            m2893constructorimpl = Updater.m2893constructorimpl(startRestartGroup);
                            Updater.m2900setimpl(m2893constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                            Updater.m2900setimpl(m2893constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
                            if (!m2893constructorimpl.getInserting() || !Intrinsics.areEqual(m2893constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                m2893constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                m2893constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            modifierMaterializerOf.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, 0);
                            startRestartGroup.startReplaceableGroup(2058660585);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629358, "C71@3331L9:Box.kt#2w3rfo");
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            str = text;
                            AnimatedVisibilityKt.AnimatedVisibility(str.length() != 0, (Modifier) null, EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(300, 0, null, 6, null), 0.0f, 2, null), EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.snap$default(0, 1, null), 0.0f, 2, null), (String) null, ComposableLambdaKt.composableLambda(startRestartGroup, -15326326, true, new OnboardingTextComponentsKt$OnboardingTextField$2$1(placeholder, i5)), startRestartGroup, 200064, 18);
                            if (str.length() != 0) {
                                i6 = 1157296644;
                                z = true;
                            } else {
                                z = false;
                                i6 = 1157296644;
                            }
                            startRestartGroup.startReplaceableGroup(i6);
                            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                            changed2 = startRestartGroup.changed(boxScopeInstance);
                            rememberedValue4 = startRestartGroup.rememberedValue();
                            if (!changed2 || rememberedValue4 == Composer.Companion.getEmpty()) {
                                rememberedValue4 = new OnboardingTextComponentsKt$OnboardingTextField$2$2$1(boxScopeInstance);
                                startRestartGroup.updateRememberedValue(rememberedValue4);
                            }
                            startRestartGroup.endReplaceableGroup();
                            int i9 = i5;
                            Modifier modifier4 = modifier2;
                            composer2 = startRestartGroup;
                            int i10 = i9 << 6;
                            BasicTextFieldKt.BasicTextField(text, onTextChanged, FocusRequesterModifierKt.focusRequester(SizeKt.m781height3ABfNKs(LayoutModifierKt.layout(ConditionalModifierKt.conditional(modifier2, z, (Function1) rememberedValue4, OnboardingTextComponentsKt$OnboardingTextField$2$3.INSTANCE), OnboardingTextComponentsKt$OnboardingTextField$2$4.INSTANCE), Dp.m5607constructorimpl(46)), focusRequester), true, false, new TextStyle(Color.Companion.m3328getWhite0d7_KjU(), TextUnitKt.getSp(32), FontWeight.Companion.getMedium(), (FontStyle) null, (FontSynthesis) null, AppFontFamily.INSTANCE.getGhino(), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), obj2, keyboardActions3, true, 0, 0, (VisualTransformation) null, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource, (Brush) new SolidColor(Color.Companion.m3328getWhite0d7_KjU(), null), (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) ComposableSingletons$OnboardingTextComponentsKt.INSTANCE.m6933getLambda1$presentation_release(), composer2, (i9 & 14) | 100666368 | (i9 & 112) | (i10 & 3670016) | (i10 & 29360128), 224256, 7696);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier4;
                            keyboardOptions2 = obj2;
                            keyboardActions4 = keyboardActions3;
                        }
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                        }
                    }
                    obj2 = obj;
                    keyboardActions3 = keyboardActions2;
                    i5 = i3;
                    modifier2 = companion;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    startRestartGroup.startReplaceableGroup(-492369756);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == Composer.Companion.getEmpty()) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    MutableInteractionSource mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
                    startRestartGroup.startReplaceableGroup(-492369756);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (rememberedValue2 == Composer.Companion.getEmpty()) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    FocusRequester focusRequester2 = (FocusRequester) rememberedValue2;
                    Unit unit2 = Unit.INSTANCE;
                    startRestartGroup.startReplaceableGroup(1157296644);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                    changed = startRestartGroup.changed(focusRequester2);
                    rememberedValue3 = startRestartGroup.rememberedValue();
                    if (!changed) {
                    }
                    rememberedValue3 = new OnboardingTextComponentsKt$OnboardingTextField$1$1(focusRequester2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                    startRestartGroup.endReplaceableGroup();
                    EffectsKt.LaunchedEffect(unit2, (Function2) rememberedValue3, startRestartGroup, 70);
                    Alignment center2 = Alignment.Companion.getCenter();
                    startRestartGroup.startReplaceableGroup(733328855);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)69@3214L67,70@3286L130:Box.kt#2w3rfo");
                    MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center2, false, startRestartGroup, 6);
                    startRestartGroup.startReplaceableGroup(-1323940314);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(Modifier.Companion);
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    }
                    startRestartGroup.startReusableNode();
                    if (!startRestartGroup.getInserting()) {
                    }
                    m2893constructorimpl = Updater.m2893constructorimpl(startRestartGroup);
                    Updater.m2900setimpl(m2893constructorimpl, rememberBoxMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
                    Updater.m2900setimpl(m2893constructorimpl, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                    if (!m2893constructorimpl.getInserting()) {
                    }
                    m2893constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m2893constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2);
                    modifierMaterializerOf2.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, 0);
                    startRestartGroup.startReplaceableGroup(2058660585);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629358, "C71@3331L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    str = text;
                    if (str.length() != 0) {
                    }
                    AnimatedVisibilityKt.AnimatedVisibility(str.length() != 0, (Modifier) null, EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(300, 0, null, 6, null), 0.0f, 2, null), EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.snap$default(0, 1, null), 0.0f, 2, null), (String) null, ComposableLambdaKt.composableLambda(startRestartGroup, -15326326, true, new OnboardingTextComponentsKt$OnboardingTextField$2$1(placeholder, i5)), startRestartGroup, 200064, 18);
                    if (str.length() != 0) {
                    }
                    startRestartGroup.startReplaceableGroup(i6);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                    changed2 = startRestartGroup.changed(boxScopeInstance2);
                    rememberedValue4 = startRestartGroup.rememberedValue();
                    if (!changed2) {
                    }
                    rememberedValue4 = new OnboardingTextComponentsKt$OnboardingTextField$2$2$1(boxScopeInstance2);
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                    startRestartGroup.endReplaceableGroup();
                    int i92 = i5;
                    Modifier modifier42 = modifier2;
                    composer2 = startRestartGroup;
                    int i102 = i92 << 6;
                    BasicTextFieldKt.BasicTextField(text, onTextChanged, FocusRequesterModifierKt.focusRequester(SizeKt.m781height3ABfNKs(LayoutModifierKt.layout(ConditionalModifierKt.conditional(modifier2, z, (Function1) rememberedValue4, OnboardingTextComponentsKt$OnboardingTextField$2$3.INSTANCE), OnboardingTextComponentsKt$OnboardingTextField$2$4.INSTANCE), Dp.m5607constructorimpl(46)), focusRequester2), true, false, new TextStyle(Color.Companion.m3328getWhite0d7_KjU(), TextUnitKt.getSp(32), FontWeight.Companion.getMedium(), (FontStyle) null, (FontSynthesis) null, AppFontFamily.INSTANCE.getGhino(), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), obj2, keyboardActions3, true, 0, 0, (VisualTransformation) null, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource2, (Brush) new SolidColor(Color.Companion.m3328getWhite0d7_KjU(), null), (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) ComposableSingletons$OnboardingTextComponentsKt.INSTANCE.m6933getLambda1$presentation_release(), composer2, (i92 & 14) | 100666368 | (i92 & 112) | (i102 & 3670016) | (i102 & 29360128), 224256, 7696);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier42;
                    keyboardOptions2 = obj2;
                    keyboardActions4 = keyboardActions3;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    modifier3 = companion;
                    keyboardOptions2 = obj;
                    keyboardActions4 = keyboardActions2;
                    composer2 = startRestartGroup;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                    return;
                }
                endRestartGroup.updateScope(new OnboardingTextComponentsKt$OnboardingTextField$3(text, onTextChanged, placeholder, modifier3, keyboardOptions2, keyboardActions4, i, i2));
                return;
            }
            obj = keyboardOptions;
            if ((458752 & i) == 0) {
            }
            if ((374491 & i3) == 74898) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i8 != 0) {
            }
            if (i4 != 0) {
            }
            if ((i2 & 32) != 0) {
            }
            obj2 = obj;
            keyboardActions3 = keyboardActions2;
            i5 = i3;
            modifier2 = companion;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
            rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
            }
            startRestartGroup.endReplaceableGroup();
            MutableInteractionSource mutableInteractionSource22 = (MutableInteractionSource) rememberedValue;
            startRestartGroup.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.Companion.getEmpty()) {
            }
            startRestartGroup.endReplaceableGroup();
            FocusRequester focusRequester22 = (FocusRequester) rememberedValue2;
            Unit unit22 = Unit.INSTANCE;
            startRestartGroup.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
            changed = startRestartGroup.changed(focusRequester22);
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (!changed) {
            }
            rememberedValue3 = new OnboardingTextComponentsKt$OnboardingTextField$1$1(focusRequester22, null);
            startRestartGroup.updateRememberedValue(rememberedValue3);
            startRestartGroup.endReplaceableGroup();
            EffectsKt.LaunchedEffect(unit22, (Function2) rememberedValue3, startRestartGroup, 70);
            Alignment center22 = Alignment.Companion.getCenter();
            startRestartGroup.startReplaceableGroup(733328855);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)69@3214L67,70@3286L130:Box.kt#2w3rfo");
            MeasurePolicy rememberBoxMeasurePolicy22 = BoxKt.rememberBoxMeasurePolicy(center22, false, startRestartGroup, 6);
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor22 = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf22 = LayoutKt.modifierMaterializerOf(Modifier.Companion);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (!startRestartGroup.getInserting()) {
            }
            m2893constructorimpl = Updater.m2893constructorimpl(startRestartGroup);
            Updater.m2900setimpl(m2893constructorimpl, rememberBoxMeasurePolicy22, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2900setimpl(m2893constructorimpl, currentCompositionLocalMap22, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (!m2893constructorimpl.getInserting()) {
            }
            m2893constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m2893constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash22);
            modifierMaterializerOf22.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629358, "C71@3331L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
            str = text;
            if (str.length() != 0) {
            }
            AnimatedVisibilityKt.AnimatedVisibility(str.length() != 0, (Modifier) null, EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(300, 0, null, 6, null), 0.0f, 2, null), EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.snap$default(0, 1, null), 0.0f, 2, null), (String) null, ComposableLambdaKt.composableLambda(startRestartGroup, -15326326, true, new OnboardingTextComponentsKt$OnboardingTextField$2$1(placeholder, i5)), startRestartGroup, 200064, 18);
            if (str.length() != 0) {
            }
            startRestartGroup.startReplaceableGroup(i6);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
            changed2 = startRestartGroup.changed(boxScopeInstance22);
            rememberedValue4 = startRestartGroup.rememberedValue();
            if (!changed2) {
            }
            rememberedValue4 = new OnboardingTextComponentsKt$OnboardingTextField$2$2$1(boxScopeInstance22);
            startRestartGroup.updateRememberedValue(rememberedValue4);
            startRestartGroup.endReplaceableGroup();
            int i922 = i5;
            Modifier modifier422 = modifier2;
            composer2 = startRestartGroup;
            int i1022 = i922 << 6;
            BasicTextFieldKt.BasicTextField(text, onTextChanged, FocusRequesterModifierKt.focusRequester(SizeKt.m781height3ABfNKs(LayoutModifierKt.layout(ConditionalModifierKt.conditional(modifier2, z, (Function1) rememberedValue4, OnboardingTextComponentsKt$OnboardingTextField$2$3.INSTANCE), OnboardingTextComponentsKt$OnboardingTextField$2$4.INSTANCE), Dp.m5607constructorimpl(46)), focusRequester22), true, false, new TextStyle(Color.Companion.m3328getWhite0d7_KjU(), TextUnitKt.getSp(32), FontWeight.Companion.getMedium(), (FontStyle) null, (FontSynthesis) null, AppFontFamily.INSTANCE.getGhino(), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), obj2, keyboardActions3, true, 0, 0, (VisualTransformation) null, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource22, (Brush) new SolidColor(Color.Companion.m3328getWhite0d7_KjU(), null), (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) ComposableSingletons$OnboardingTextComponentsKt.INSTANCE.m6933getLambda1$presentation_release(), composer2, (i922 & 14) | 100666368 | (i922 & 112) | (i1022 & 3670016) | (i1022 & 29360128), 224256, 7696);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier422;
            keyboardOptions2 = obj2;
            keyboardActions4 = keyboardActions3;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        companion = modifier;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        obj = keyboardOptions;
        if ((458752 & i) == 0) {
        }
        if ((374491 & i3) == 74898) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i8 != 0) {
        }
        if (i4 != 0) {
        }
        if ((i2 & 32) != 0) {
        }
        obj2 = obj;
        keyboardActions3 = keyboardActions2;
        i5 = i3;
        modifier2 = companion;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        startRestartGroup.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
        rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        MutableInteractionSource mutableInteractionSource222 = (MutableInteractionSource) rememberedValue;
        startRestartGroup.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (rememberedValue2 == Composer.Companion.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        FocusRequester focusRequester222 = (FocusRequester) rememberedValue2;
        Unit unit222 = Unit.INSTANCE;
        startRestartGroup.startReplaceableGroup(1157296644);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
        changed = startRestartGroup.changed(focusRequester222);
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        rememberedValue3 = new OnboardingTextComponentsKt$OnboardingTextField$1$1(focusRequester222, null);
        startRestartGroup.updateRememberedValue(rememberedValue3);
        startRestartGroup.endReplaceableGroup();
        EffectsKt.LaunchedEffect(unit222, (Function2) rememberedValue3, startRestartGroup, 70);
        Alignment center222 = Alignment.Companion.getCenter();
        startRestartGroup.startReplaceableGroup(733328855);
        ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)69@3214L67,70@3286L130:Box.kt#2w3rfo");
        MeasurePolicy rememberBoxMeasurePolicy222 = BoxKt.rememberBoxMeasurePolicy(center222, false, startRestartGroup, 6);
        startRestartGroup.startReplaceableGroup(-1323940314);
        ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap222 = startRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor222 = ComposeUiNode.Companion.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf222 = LayoutKt.modifierMaterializerOf(Modifier.Companion);
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m2893constructorimpl = Updater.m2893constructorimpl(startRestartGroup);
        Updater.m2900setimpl(m2893constructorimpl, rememberBoxMeasurePolicy222, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m2900setimpl(m2893constructorimpl, currentCompositionLocalMap222, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if (!m2893constructorimpl.getInserting()) {
        }
        m2893constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m2893constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash222);
        modifierMaterializerOf222.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629358, "C71@3331L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance222 = BoxScopeInstance.INSTANCE;
        str = text;
        if (str.length() != 0) {
        }
        AnimatedVisibilityKt.AnimatedVisibility(str.length() != 0, (Modifier) null, EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(300, 0, null, 6, null), 0.0f, 2, null), EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.snap$default(0, 1, null), 0.0f, 2, null), (String) null, ComposableLambdaKt.composableLambda(startRestartGroup, -15326326, true, new OnboardingTextComponentsKt$OnboardingTextField$2$1(placeholder, i5)), startRestartGroup, 200064, 18);
        if (str.length() != 0) {
        }
        startRestartGroup.startReplaceableGroup(i6);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
        changed2 = startRestartGroup.changed(boxScopeInstance222);
        rememberedValue4 = startRestartGroup.rememberedValue();
        if (!changed2) {
        }
        rememberedValue4 = new OnboardingTextComponentsKt$OnboardingTextField$2$2$1(boxScopeInstance222);
        startRestartGroup.updateRememberedValue(rememberedValue4);
        startRestartGroup.endReplaceableGroup();
        int i9222 = i5;
        Modifier modifier4222 = modifier2;
        composer2 = startRestartGroup;
        int i10222 = i9222 << 6;
        BasicTextFieldKt.BasicTextField(text, onTextChanged, FocusRequesterModifierKt.focusRequester(SizeKt.m781height3ABfNKs(LayoutModifierKt.layout(ConditionalModifierKt.conditional(modifier2, z, (Function1) rememberedValue4, OnboardingTextComponentsKt$OnboardingTextField$2$3.INSTANCE), OnboardingTextComponentsKt$OnboardingTextField$2$4.INSTANCE), Dp.m5607constructorimpl(46)), focusRequester222), true, false, new TextStyle(Color.Companion.m3328getWhite0d7_KjU(), TextUnitKt.getSp(32), FontWeight.Companion.getMedium(), (FontStyle) null, (FontSynthesis) null, AppFontFamily.INSTANCE.getGhino(), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), obj2, keyboardActions3, true, 0, 0, (VisualTransformation) null, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource222, (Brush) new SolidColor(Color.Companion.m3328getWhite0d7_KjU(), null), (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) ComposableSingletons$OnboardingTextComponentsKt.INSTANCE.m6933getLambda1$presentation_release(), composer2, (i9222 & 14) | 100666368 | (i9222 & 112) | (i10222 & 3670016) | (i10222 & 29360128), 224256, 7696);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endReplaceableGroup();
        composer2.endNode();
        composer2.endReplaceableGroup();
        composer2.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier3 = modifier4222;
        keyboardOptions2 = obj2;
        keyboardActions4 = keyboardActions3;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* renamed from: OnboardingInfo-cbXALmg  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m6935OnboardingInfocbXALmg(String text, Modifier modifier, TextAlign textAlign, Composer composer, int i, int i2) {
        int i3;
        Object obj;
        int i4;
        Object obj2;
        int i5;
        Composer composer2;
        Modifier modifier2;
        TextAlign textAlign2;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(text, "text");
        Composer startRestartGroup = composer.startRestartGroup(1984539548);
        ComposerKt.sourceInformation(startRestartGroup, "C(OnboardingInfo)P(1!,2:c#ui.text.style.TextAlign)");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(text) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            obj = modifier;
            i3 |= startRestartGroup.changed(obj) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                obj2 = textAlign;
                i3 |= startRestartGroup.changed(obj2) ? 256 : 128;
                i5 = i3;
                if ((i5 & 731) == 146 || !startRestartGroup.getSkipping()) {
                    Modifier.Companion companion = i6 != 0 ? Modifier.Companion : obj;
                    Object obj3 = i4 != 0 ? null : obj2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1984539548, i5, -1, "com.ifriend.presentation.features.onboarding.steps.view.common.OnboardingInfo (OnboardingTextComponents.kt:186)");
                    }
                    composer2 = startRestartGroup;
                    Modifier modifier3 = companion;
                    TextAlign textAlign3 = obj3;
                    TextKt.m2145Text4IGK_g(text, modifier3, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, textAlign3, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(Color.m3290copywmQWz5c$default(Color.Companion.m3328getWhite0d7_KjU(), 0.2f, 0.0f, 0.0f, 0.0f, 14, null), TextUnitKt.getSp(14), FontWeight.Companion.getNormal(), (FontStyle) null, (FontSynthesis) null, AppFontFamily.INSTANCE.getSfProDisplay(), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), composer2, (i5 & 14) | (i5 & 112) | ((i5 << 21) & 1879048192), 0, 65020);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = companion;
                    textAlign2 = obj3;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    modifier2 = obj;
                    textAlign2 = obj2;
                    composer2 = startRestartGroup;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                    return;
                }
                endRestartGroup.updateScope(new OnboardingTextComponentsKt$OnboardingInfo$1(text, modifier2, textAlign2, i, i2));
                return;
            }
            obj2 = textAlign;
            i5 = i3;
            if ((i5 & 731) == 146) {
            }
            if (i6 != 0) {
            }
            if (i4 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            composer2 = startRestartGroup;
            Modifier modifier32 = companion;
            TextAlign textAlign32 = obj3;
            TextKt.m2145Text4IGK_g(text, modifier32, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, textAlign32, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(Color.m3290copywmQWz5c$default(Color.Companion.m3328getWhite0d7_KjU(), 0.2f, 0.0f, 0.0f, 0.0f, 14, null), TextUnitKt.getSp(14), FontWeight.Companion.getNormal(), (FontStyle) null, (FontSynthesis) null, AppFontFamily.INSTANCE.getSfProDisplay(), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), composer2, (i5 & 14) | (i5 & 112) | ((i5 << 21) & 1879048192), 0, 65020);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier2 = companion;
            textAlign2 = obj3;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        obj = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        obj2 = textAlign;
        i5 = i3;
        if ((i5 & 731) == 146) {
        }
        if (i6 != 0) {
        }
        if (i4 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        composer2 = startRestartGroup;
        Modifier modifier322 = companion;
        TextAlign textAlign322 = obj3;
        TextKt.m2145Text4IGK_g(text, modifier322, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, textAlign322, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(Color.m3290copywmQWz5c$default(Color.Companion.m3328getWhite0d7_KjU(), 0.2f, 0.0f, 0.0f, 0.0f, 14, null), TextUnitKt.getSp(14), FontWeight.Companion.getNormal(), (FontStyle) null, (FontSynthesis) null, AppFontFamily.INSTANCE.getSfProDisplay(), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), composer2, (i5 & 14) | (i5 & 112) | ((i5 << 21) & 1879048192), 0, 65020);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier2 = companion;
        textAlign2 = obj3;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OnboardingButton(String text, Modifier modifier, boolean z, Function0<Unit> onClick, Composer composer, int i, int i2) {
        int i3;
        Object obj;
        int i4;
        boolean z2;
        Modifier modifier2;
        boolean z3;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer startRestartGroup = composer.startRestartGroup(-534840196);
        ComposerKt.sourceInformation(startRestartGroup, "C(OnboardingButton)P(3,1)");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(text) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
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
                if ((i2 & 8) != 0) {
                    i3 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
                } else if ((i & 7168) == 0) {
                    i3 |= startRestartGroup.changedInstance(onClick) ? 2048 : 1024;
                }
                if ((i3 & 5851) == 1170 || !startRestartGroup.getSkipping()) {
                    Modifier.Companion companion = i5 != 0 ? Modifier.Companion : obj;
                    boolean z4 = i4 != 0 ? true : z2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-534840196, i3, -1, "com.ifriend.presentation.features.onboarding.steps.view.common.OnboardingButton (OnboardingTextComponents.kt:206)");
                    }
                    GlowingButtonKt.GlowingButton(PaddingKt.m752paddingqDBjuR0$default(PaddingKt.m750paddingVpY3zN4$default(companion, AppTheme.INSTANCE.getDimensions(startRestartGroup, AppTheme.$stable).m7166getExtraLargeD9Ej5fM(), 0.0f, 2, null), 0.0f, 0.0f, 0.0f, AppTheme.INSTANCE.getDimensions(startRestartGroup, AppTheme.$stable).m7172getLargeD9Ej5fM(), 7, null), text, z4, onClick, startRestartGroup, ((i3 << 3) & 112) | (i3 & 896) | (i3 & 7168), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = companion;
                    z3 = z4;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    modifier2 = obj;
                    z3 = z2;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                    return;
                }
                endRestartGroup.updateScope(new OnboardingTextComponentsKt$OnboardingButton$1(text, modifier2, z3, onClick, i, i2));
                return;
            }
            z2 = z;
            if ((i2 & 8) != 0) {
            }
            if ((i3 & 5851) == 1170) {
            }
            if (i5 != 0) {
            }
            if (i4 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            GlowingButtonKt.GlowingButton(PaddingKt.m752paddingqDBjuR0$default(PaddingKt.m750paddingVpY3zN4$default(companion, AppTheme.INSTANCE.getDimensions(startRestartGroup, AppTheme.$stable).m7166getExtraLargeD9Ej5fM(), 0.0f, 2, null), 0.0f, 0.0f, 0.0f, AppTheme.INSTANCE.getDimensions(startRestartGroup, AppTheme.$stable).m7172getLargeD9Ej5fM(), 7, null), text, z4, onClick, startRestartGroup, ((i3 << 3) & 112) | (i3 & 896) | (i3 & 7168), 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier2 = companion;
            z3 = z4;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        obj = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z2 = z;
        if ((i2 & 8) != 0) {
        }
        if ((i3 & 5851) == 1170) {
        }
        if (i5 != 0) {
        }
        if (i4 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        GlowingButtonKt.GlowingButton(PaddingKt.m752paddingqDBjuR0$default(PaddingKt.m750paddingVpY3zN4$default(companion, AppTheme.INSTANCE.getDimensions(startRestartGroup, AppTheme.$stable).m7166getExtraLargeD9Ej5fM(), 0.0f, 2, null), 0.0f, 0.0f, 0.0f, AppTheme.INSTANCE.getDimensions(startRestartGroup, AppTheme.$stable).m7172getLargeD9Ej5fM(), 7, null), text, z4, onClick, startRestartGroup, ((i3 << 3) & 112) | (i3 & 896) | (i3 & 7168), 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier2 = companion;
        z3 = z4;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    private static final long OnboardingSmallSubtitle$lambda$0(State<Color> state) {
        return state.getValue().m3301unboximpl();
    }

    private static final long OnboardingDescription$lambda$1(State<Color> state) {
        return state.getValue().m3301unboximpl();
    }
}
