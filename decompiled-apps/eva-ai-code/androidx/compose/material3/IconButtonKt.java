package androidx.compose.material3;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.ToggleableKt;
import androidx.compose.material.ripple.RippleKt;
import androidx.compose.material3.tokens.IconButtonTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ifriend.keychain.cipherStorage.CipherStorageKeystoreRsaEcb;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: IconButton.kt */
@Metadata(d1 = {"\u0000H\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a`\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u000fH\u0007¢\u0006\u0002\u0010\u0010\u001an\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00072\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00142\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00152\b\b\u0002\u0010\f\u001a\u00020\r2\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u000fH\u0007¢\u0006\u0002\u0010\u0016\u001a`\u0010\u0017\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u000fH\u0007¢\u0006\u0002\u0010\u0010\u001an\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00072\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00142\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00152\b\b\u0002\u0010\f\u001a\u00020\r2\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u000fH\u0007¢\u0006\u0002\u0010\u0016\u001aV\u0010\u0019\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u000fH\u0007¢\u0006\u0002\u0010\u001a\u001ad\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00072\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00142\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00152\b\b\u0002\u0010\f\u001a\u00020\r2\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u000fH\u0007¢\u0006\u0002\u0010\u001c\u001al\u0010\u001d\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010\f\u001a\u00020\r2\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u000fH\u0007¢\u0006\u0002\u0010 \u001az\u0010!\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00072\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00142\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00152\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010\f\u001a\u00020\r2\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u000fH\u0007¢\u0006\u0002\u0010\"¨\u0006#"}, d2 = {"FilledIconButton", "", "onClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "shape", "Landroidx/compose/ui/graphics/Shape;", "colors", "Landroidx/compose/material3/IconButtonColors;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", FirebaseAnalytics.Param.CONTENT, "Landroidx/compose/runtime/Composable;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/IconButtonColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "FilledIconToggleButton", "checked", "onCheckedChange", "Lkotlin/Function1;", "Landroidx/compose/material3/IconToggleButtonColors;", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/IconToggleButtonColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "FilledTonalIconButton", "FilledTonalIconToggleButton", "IconButton", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/IconButtonColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "IconToggleButton", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/IconToggleButtonColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "OutlinedIconButton", androidx.compose.material.OutlinedTextFieldKt.BorderId, "Landroidx/compose/foundation/BorderStroke;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/IconButtonColors;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "OutlinedIconToggleButton", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/IconToggleButtonColors;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class IconButtonKt {
    /* JADX WARN: Removed duplicated region for block: B:100:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0156  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void IconButton(Function0<Unit> onClick, Modifier modifier, boolean z, IconButtonColors iconButtonColors, MutableInteractionSource mutableInteractionSource, Function2<? super Composer, ? super Integer, Unit> content, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        Object obj;
        int i5;
        Object obj2;
        int i6;
        Object obj3;
        Modifier modifier3;
        boolean z3;
        Composer composer2;
        Modifier modifier4;
        boolean z4;
        IconButtonColors iconButtonColors2;
        MutableInteractionSource mutableInteractionSource2;
        ScopeUpdateScope endRestartGroup;
        int i7;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-1142896114);
        ComposerKt.sourceInformation(startRestartGroup, "C(IconButton)P(5,4,2!1,3)77@3836L18,78@3906L39,85@4173L9,86@4223L23,92@4468L135,81@3991L840:IconButton.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changedInstance(onClick) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 256 : 128;
                if ((i & 7168) == 0) {
                    if ((i2 & 8) == 0) {
                        obj = iconButtonColors;
                        if (startRestartGroup.changed(obj)) {
                            i7 = 2048;
                            i3 |= i7;
                        }
                    } else {
                        obj = iconButtonColors;
                    }
                    i7 = 1024;
                    i3 |= i7;
                } else {
                    obj = iconButtonColors;
                }
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                    obj2 = mutableInteractionSource;
                } else {
                    obj2 = mutableInteractionSource;
                    if ((57344 & i) == 0) {
                        i3 |= startRestartGroup.changed(obj2) ? 16384 : 8192;
                    }
                }
                if ((i2 & 32) == 0) {
                    if ((458752 & i) == 0) {
                        i6 = startRestartGroup.changedInstance(content) ? 131072 : 65536;
                    }
                    if ((374491 & i3) == 74898 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            Modifier.Companion companion = i8 == 0 ? Modifier.Companion : modifier2;
                            if (i4 != 0) {
                                z2 = true;
                            }
                            if ((i2 & 8) == 0) {
                                i3 &= -7169;
                                obj = IconButtonDefaults.INSTANCE.m1823iconButtonColorsro_MJ88(0L, 0L, 0L, 0L, startRestartGroup, 24576, 15);
                            }
                            if (i5 == 0) {
                                startRestartGroup.startReplaceableGroup(-492369756);
                                ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                                Object rememberedValue = startRestartGroup.rememberedValue();
                                if (rememberedValue == Composer.Companion.getEmpty()) {
                                    rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                startRestartGroup.endReplaceableGroup();
                                modifier3 = companion;
                                obj3 = (MutableInteractionSource) rememberedValue;
                            } else {
                                obj3 = mutableInteractionSource;
                                modifier3 = companion;
                            }
                            z3 = z2;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                            }
                            z3 = z2;
                            obj3 = obj2;
                            modifier3 = modifier2;
                        }
                        IconButtonColors iconButtonColors3 = obj;
                        int i9 = i3;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1142896114, i9, -1, "androidx.compose.material3.IconButton (IconButton.kt:73)");
                        }
                        int i10 = i9 >> 6;
                        int i11 = (i10 & 112) | (i10 & 14);
                        composer2 = startRestartGroup;
                        Modifier m452clickableO2vRcR0$default = ClickableKt.m452clickableO2vRcR0$default(BackgroundKt.m421backgroundbw27NRU$default(ClipKt.clip(SizeKt.m795size3ABfNKs(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier3), IconButtonTokens.INSTANCE.m2528getStateLayerSizeD9Ej5fM()), ShapesKt.toShape(IconButtonTokens.INSTANCE.getStateLayerShape(), startRestartGroup, 6)), iconButtonColors3.containerColor$material3_release(z3, startRestartGroup, i11).getValue().m3301unboximpl(), null, 2, null), obj3, RippleKt.m1559rememberRipple9IZ8Weo(false, Dp.m5607constructorimpl(IconButtonTokens.INSTANCE.m2528getStateLayerSizeD9Ej5fM() / 2), 0L, startRestartGroup, 54, 4), z3, null, Role.m4917boximpl(Role.Companion.m4924getButtono7Vup1c()), onClick, 8, null);
                        Alignment center = Alignment.Companion.getCenter();
                        composer2.startReplaceableGroup(733328855);
                        ComposerKt.sourceInformation(composer2, "CC(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer2, 6);
                        composer2.startReplaceableGroup(-1323940314);
                        ComposerKt.sourceInformation(composer2, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                        ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        Object consume = composer2.consume(CompositionLocalsKt.getLocalDensity());
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        Density density = (Density) consume;
                        ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        Object consume2 = composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        LayoutDirection layoutDirection = (LayoutDirection) consume2;
                        ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        Object consume3 = composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ViewConfiguration viewConfiguration = (ViewConfiguration) consume3;
                        Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(m452clickableO2vRcR0$default);
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (!composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        composer2.disableReusing();
                        Composer m2893constructorimpl = Updater.m2893constructorimpl(composer2);
                        Updater.m2900setimpl(m2893constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                        Updater.m2900setimpl(m2893constructorimpl, density, ComposeUiNode.Companion.getSetDensity());
                        Updater.m2900setimpl(m2893constructorimpl, layoutDirection, ComposeUiNode.Companion.getSetLayoutDirection());
                        Updater.m2900setimpl(m2893constructorimpl, viewConfiguration, ComposeUiNode.Companion.getSetViewConfiguration());
                        composer2.enableReusing();
                        materializerOf.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(composer2)), composer2, 0);
                        composer2.startReplaceableGroup(2058660585);
                        ComposerKt.sourceInformationMarkerStart(composer2, -1253629305, "C72@3384L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(composer2, 1676789754, "C99@4705L21,100@4741L84:IconButton.kt#uh7d8r");
                        CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m3281boximpl(iconButtonColors3.contentColor$material3_release(z3, composer2, i11).getValue().m3301unboximpl()))}, content, composer2, ((i9 >> 12) & 112) | 8);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        z4 = z3;
                        iconButtonColors2 = iconButtonColors3;
                        mutableInteractionSource2 = obj3;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier4 = modifier2;
                        z4 = z2;
                        iconButtonColors2 = obj;
                        composer2 = startRestartGroup;
                        mutableInteractionSource2 = obj2;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                        return;
                    }
                    endRestartGroup.updateScope(new IconButtonKt$IconButton$3(onClick, modifier4, z4, iconButtonColors2, mutableInteractionSource2, content, i, i2));
                    return;
                }
                i6 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                i3 |= i6;
                if ((374491 & i3) == 74898) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i8 == 0) {
                }
                if (i4 != 0) {
                }
                if ((i2 & 8) == 0) {
                }
                if (i5 == 0) {
                }
                z3 = z2;
                IconButtonColors iconButtonColors32 = obj;
                int i92 = i3;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                int i102 = i92 >> 6;
                int i112 = (i102 & 112) | (i102 & 14);
                composer2 = startRestartGroup;
                Modifier m452clickableO2vRcR0$default2 = ClickableKt.m452clickableO2vRcR0$default(BackgroundKt.m421backgroundbw27NRU$default(ClipKt.clip(SizeKt.m795size3ABfNKs(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier3), IconButtonTokens.INSTANCE.m2528getStateLayerSizeD9Ej5fM()), ShapesKt.toShape(IconButtonTokens.INSTANCE.getStateLayerShape(), startRestartGroup, 6)), iconButtonColors32.containerColor$material3_release(z3, startRestartGroup, i112).getValue().m3301unboximpl(), null, 2, null), obj3, RippleKt.m1559rememberRipple9IZ8Weo(false, Dp.m5607constructorimpl(IconButtonTokens.INSTANCE.m2528getStateLayerSizeD9Ej5fM() / 2), 0L, startRestartGroup, 54, 4), z3, null, Role.m4917boximpl(Role.Companion.m4924getButtono7Vup1c()), onClick, 8, null);
                Alignment center2 = Alignment.Companion.getCenter();
                composer2.startReplaceableGroup(733328855);
                ComposerKt.sourceInformation(composer2, "CC(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center2, false, composer2, 6);
                composer2.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(composer2, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume4 = composer2.consume(CompositionLocalsKt.getLocalDensity());
                ComposerKt.sourceInformationMarkerEnd(composer2);
                Density density2 = (Density) consume4;
                ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume22 = composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ComposerKt.sourceInformationMarkerEnd(composer2);
                LayoutDirection layoutDirection2 = (LayoutDirection) consume22;
                ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume32 = composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ViewConfiguration viewConfiguration2 = (ViewConfiguration) consume32;
                Function0<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf2 = LayoutKt.materializerOf(m452clickableO2vRcR0$default2);
                if (!(composer2.getApplier() instanceof Applier)) {
                }
                composer2.startReusableNode();
                if (!composer2.getInserting()) {
                }
                composer2.disableReusing();
                Composer m2893constructorimpl2 = Updater.m2893constructorimpl(composer2);
                Updater.m2900setimpl(m2893constructorimpl2, rememberBoxMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.m2900setimpl(m2893constructorimpl2, density2, ComposeUiNode.Companion.getSetDensity());
                Updater.m2900setimpl(m2893constructorimpl2, layoutDirection2, ComposeUiNode.Companion.getSetLayoutDirection());
                Updater.m2900setimpl(m2893constructorimpl2, viewConfiguration2, ComposeUiNode.Companion.getSetViewConfiguration());
                composer2.enableReusing();
                materializerOf2.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(composer2)), composer2, 0);
                composer2.startReplaceableGroup(2058660585);
                ComposerKt.sourceInformationMarkerStart(composer2, -1253629305, "C72@3384L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composer2, 1676789754, "C99@4705L21,100@4741L84:IconButton.kt#uh7d8r");
                CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m3281boximpl(iconButtonColors32.contentColor$material3_release(z3, composer2, i112).getValue().m3301unboximpl()))}, content, composer2, ((i92 >> 12) & 112) | 8);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier4 = modifier3;
                z4 = z3;
                iconButtonColors2 = iconButtonColors32;
                mutableInteractionSource2 = obj3;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            z2 = z;
            if ((i & 7168) == 0) {
            }
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            if ((i2 & 32) == 0) {
            }
            i3 |= i6;
            if ((374491 & i3) == 74898) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i8 == 0) {
            }
            if (i4 != 0) {
            }
            if ((i2 & 8) == 0) {
            }
            if (i5 == 0) {
            }
            z3 = z2;
            IconButtonColors iconButtonColors322 = obj;
            int i922 = i3;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            int i1022 = i922 >> 6;
            int i1122 = (i1022 & 112) | (i1022 & 14);
            composer2 = startRestartGroup;
            Modifier m452clickableO2vRcR0$default22 = ClickableKt.m452clickableO2vRcR0$default(BackgroundKt.m421backgroundbw27NRU$default(ClipKt.clip(SizeKt.m795size3ABfNKs(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier3), IconButtonTokens.INSTANCE.m2528getStateLayerSizeD9Ej5fM()), ShapesKt.toShape(IconButtonTokens.INSTANCE.getStateLayerShape(), startRestartGroup, 6)), iconButtonColors322.containerColor$material3_release(z3, startRestartGroup, i1122).getValue().m3301unboximpl(), null, 2, null), obj3, RippleKt.m1559rememberRipple9IZ8Weo(false, Dp.m5607constructorimpl(IconButtonTokens.INSTANCE.m2528getStateLayerSizeD9Ej5fM() / 2), 0L, startRestartGroup, 54, 4), z3, null, Role.m4917boximpl(Role.Companion.m4924getButtono7Vup1c()), onClick, 8, null);
            Alignment center22 = Alignment.Companion.getCenter();
            composer2.startReplaceableGroup(733328855);
            ComposerKt.sourceInformation(composer2, "CC(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
            MeasurePolicy rememberBoxMeasurePolicy22 = BoxKt.rememberBoxMeasurePolicy(center22, false, composer2, 6);
            composer2.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(composer2, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume42 = composer2.consume(CompositionLocalsKt.getLocalDensity());
            ComposerKt.sourceInformationMarkerEnd(composer2);
            Density density22 = (Density) consume42;
            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume222 = composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ComposerKt.sourceInformationMarkerEnd(composer2);
            LayoutDirection layoutDirection22 = (LayoutDirection) consume222;
            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume322 = composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ViewConfiguration viewConfiguration22 = (ViewConfiguration) consume322;
            Function0<ComposeUiNode> constructor22 = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf22 = LayoutKt.materializerOf(m452clickableO2vRcR0$default22);
            if (!(composer2.getApplier() instanceof Applier)) {
            }
            composer2.startReusableNode();
            if (!composer2.getInserting()) {
            }
            composer2.disableReusing();
            Composer m2893constructorimpl22 = Updater.m2893constructorimpl(composer2);
            Updater.m2900setimpl(m2893constructorimpl22, rememberBoxMeasurePolicy22, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2900setimpl(m2893constructorimpl22, density22, ComposeUiNode.Companion.getSetDensity());
            Updater.m2900setimpl(m2893constructorimpl22, layoutDirection22, ComposeUiNode.Companion.getSetLayoutDirection());
            Updater.m2900setimpl(m2893constructorimpl22, viewConfiguration22, ComposeUiNode.Companion.getSetViewConfiguration());
            composer2.enableReusing();
            materializerOf22.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(composer2)), composer2, 0);
            composer2.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(composer2, -1253629305, "C72@3384L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer2, 1676789754, "C99@4705L21,100@4741L84:IconButton.kt#uh7d8r");
            CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m3281boximpl(iconButtonColors322.contentColor$material3_release(z3, composer2, i1122).getValue().m3301unboximpl()))}, content, composer2, ((i922 >> 12) & 112) | 8);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier4 = modifier3;
            z4 = z3;
            iconButtonColors2 = iconButtonColors322;
            mutableInteractionSource2 = obj3;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z2 = z;
        if ((i & 7168) == 0) {
        }
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        if ((i2 & 32) == 0) {
        }
        i3 |= i6;
        if ((374491 & i3) == 74898) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i8 == 0) {
        }
        if (i4 != 0) {
        }
        if ((i2 & 8) == 0) {
        }
        if (i5 == 0) {
        }
        z3 = z2;
        IconButtonColors iconButtonColors3222 = obj;
        int i9222 = i3;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        int i10222 = i9222 >> 6;
        int i11222 = (i10222 & 112) | (i10222 & 14);
        composer2 = startRestartGroup;
        Modifier m452clickableO2vRcR0$default222 = ClickableKt.m452clickableO2vRcR0$default(BackgroundKt.m421backgroundbw27NRU$default(ClipKt.clip(SizeKt.m795size3ABfNKs(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier3), IconButtonTokens.INSTANCE.m2528getStateLayerSizeD9Ej5fM()), ShapesKt.toShape(IconButtonTokens.INSTANCE.getStateLayerShape(), startRestartGroup, 6)), iconButtonColors3222.containerColor$material3_release(z3, startRestartGroup, i11222).getValue().m3301unboximpl(), null, 2, null), obj3, RippleKt.m1559rememberRipple9IZ8Weo(false, Dp.m5607constructorimpl(IconButtonTokens.INSTANCE.m2528getStateLayerSizeD9Ej5fM() / 2), 0L, startRestartGroup, 54, 4), z3, null, Role.m4917boximpl(Role.Companion.m4924getButtono7Vup1c()), onClick, 8, null);
        Alignment center222 = Alignment.Companion.getCenter();
        composer2.startReplaceableGroup(733328855);
        ComposerKt.sourceInformation(composer2, "CC(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
        MeasurePolicy rememberBoxMeasurePolicy222 = BoxKt.rememberBoxMeasurePolicy(center222, false, composer2, 6);
        composer2.startReplaceableGroup(-1323940314);
        ComposerKt.sourceInformation(composer2, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
        ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
        Object consume422 = composer2.consume(CompositionLocalsKt.getLocalDensity());
        ComposerKt.sourceInformationMarkerEnd(composer2);
        Density density222 = (Density) consume422;
        ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
        Object consume2222 = composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ComposerKt.sourceInformationMarkerEnd(composer2);
        LayoutDirection layoutDirection222 = (LayoutDirection) consume2222;
        ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
        Object consume3222 = composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ViewConfiguration viewConfiguration222 = (ViewConfiguration) consume3222;
        Function0<ComposeUiNode> constructor222 = ComposeUiNode.Companion.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf222 = LayoutKt.materializerOf(m452clickableO2vRcR0$default222);
        if (!(composer2.getApplier() instanceof Applier)) {
        }
        composer2.startReusableNode();
        if (!composer2.getInserting()) {
        }
        composer2.disableReusing();
        Composer m2893constructorimpl222 = Updater.m2893constructorimpl(composer2);
        Updater.m2900setimpl(m2893constructorimpl222, rememberBoxMeasurePolicy222, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m2900setimpl(m2893constructorimpl222, density222, ComposeUiNode.Companion.getSetDensity());
        Updater.m2900setimpl(m2893constructorimpl222, layoutDirection222, ComposeUiNode.Companion.getSetLayoutDirection());
        Updater.m2900setimpl(m2893constructorimpl222, viewConfiguration222, ComposeUiNode.Companion.getSetViewConfiguration());
        composer2.enableReusing();
        materializerOf222.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(composer2)), composer2, 0);
        composer2.startReplaceableGroup(2058660585);
        ComposerKt.sourceInformationMarkerStart(composer2, -1253629305, "C72@3384L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance222 = BoxScopeInstance.INSTANCE;
        ComposerKt.sourceInformationMarkerStart(composer2, 1676789754, "C99@4705L21,100@4741L84:IconButton.kt#uh7d8r");
        CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m3281boximpl(iconButtonColors3222.contentColor$material3_release(z3, composer2, i11222).getValue().m3301unboximpl()))}, content, composer2, ((i9222 >> 12) & 112) | 8);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endReplaceableGroup();
        composer2.endNode();
        composer2.endReplaceableGroup();
        composer2.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier4 = modifier3;
        z4 = z3;
        iconButtonColors2 = iconButtonColors3222;
        mutableInteractionSource2 = obj3;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x012b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void IconToggleButton(boolean z, Function1<? super Boolean, Unit> onCheckedChange, Modifier modifier, boolean z2, IconToggleButtonColors iconToggleButtonColors, MutableInteractionSource mutableInteractionSource, Function2<? super Composer, ? super Integer, Unit> content, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z3;
        Object obj;
        int i5;
        Object obj2;
        int i6;
        Object obj3;
        Modifier modifier3;
        boolean z4;
        IconToggleButtonColors iconToggleButtonColors2;
        int i7;
        Composer composer2;
        boolean z5;
        IconToggleButtonColors iconToggleButtonColors3;
        Modifier modifier4;
        MutableInteractionSource mutableInteractionSource2;
        ScopeUpdateScope endRestartGroup;
        int i8;
        Intrinsics.checkNotNullParameter(onCheckedChange, "onCheckedChange");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(692561811);
        ComposerKt.sourceInformation(startRestartGroup, "C(IconToggleButton)P(!1,6,5,3!1,4)138@6848L24,139@6924L39,146@7191L9,147@7241L32,154@7545L135,142@7009L908:IconButton.kt#uh7d8r");
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
            i3 |= startRestartGroup.changedInstance(onCheckedChange) ? 32 : 16;
        }
        int i9 = i2 & 4;
        if (i9 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
            } else if ((i & 7168) == 0) {
                z3 = z2;
                i3 |= startRestartGroup.changed(z3) ? 2048 : 1024;
                if ((57344 & i) == 0) {
                    if ((i2 & 16) == 0) {
                        obj = iconToggleButtonColors;
                        if (startRestartGroup.changed(obj)) {
                            i8 = 16384;
                            i3 |= i8;
                        }
                    } else {
                        obj = iconToggleButtonColors;
                    }
                    i8 = 8192;
                    i3 |= i8;
                } else {
                    obj = iconToggleButtonColors;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    obj2 = mutableInteractionSource;
                } else {
                    obj2 = mutableInteractionSource;
                    if ((458752 & i) == 0) {
                        i3 |= startRestartGroup.changed(obj2) ? 131072 : 65536;
                    }
                }
                if ((i2 & 64) == 0) {
                    if ((3670016 & i) == 0) {
                        i6 = startRestartGroup.changedInstance(content) ? 1048576 : 524288;
                    }
                    if ((2995931 & i3) == 599186 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            Modifier.Companion companion = i9 == 0 ? Modifier.Companion : modifier2;
                            boolean z6 = i4 == 0 ? true : z3;
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                                obj = IconButtonDefaults.INSTANCE.m1824iconToggleButtonColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, startRestartGroup, 1572864, 63);
                            }
                            if (i5 == 0) {
                                startRestartGroup.startReplaceableGroup(-492369756);
                                ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                                Object rememberedValue = startRestartGroup.rememberedValue();
                                if (rememberedValue == Composer.Companion.getEmpty()) {
                                    rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                startRestartGroup.endReplaceableGroup();
                                modifier3 = companion;
                                obj3 = (MutableInteractionSource) rememberedValue;
                                i7 = i3;
                                z4 = z6;
                                iconToggleButtonColors2 = obj;
                            } else {
                                obj3 = mutableInteractionSource;
                                modifier3 = companion;
                                z4 = z6;
                                iconToggleButtonColors2 = obj;
                                i7 = i3;
                            }
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                            i7 = i3;
                            modifier3 = modifier2;
                            z4 = z3;
                            iconToggleButtonColors2 = obj;
                            obj3 = obj2;
                        }
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(692561811, i7, -1, "androidx.compose.material3.IconToggleButton (IconButton.kt:133)");
                        }
                        int i10 = ((i7 >> 6) & 896) | ((i7 >> 9) & 14) | ((i7 << 3) & 112);
                        int i11 = i7;
                        IconToggleButtonColors iconToggleButtonColors4 = iconToggleButtonColors2;
                        boolean z7 = z4;
                        composer2 = startRestartGroup;
                        Modifier m984toggleableO2vRcR0 = ToggleableKt.m984toggleableO2vRcR0(BackgroundKt.m421backgroundbw27NRU$default(ClipKt.clip(SizeKt.m795size3ABfNKs(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier3), IconButtonTokens.INSTANCE.m2528getStateLayerSizeD9Ej5fM()), ShapesKt.toShape(IconButtonTokens.INSTANCE.getStateLayerShape(), startRestartGroup, 6)), iconToggleButtonColors2.containerColor$material3_release(z4, z, startRestartGroup, i10).getValue().m3301unboximpl(), null, 2, null), z, obj3, RippleKt.m1559rememberRipple9IZ8Weo(false, Dp.m5607constructorimpl(IconButtonTokens.INSTANCE.m2528getStateLayerSizeD9Ej5fM() / 2), 0L, startRestartGroup, 54, 4), z4, Role.m4917boximpl(Role.Companion.m4925getCheckboxo7Vup1c()), onCheckedChange);
                        Alignment center = Alignment.Companion.getCenter();
                        composer2.startReplaceableGroup(733328855);
                        ComposerKt.sourceInformation(composer2, "CC(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer2, 6);
                        composer2.startReplaceableGroup(-1323940314);
                        ComposerKt.sourceInformation(composer2, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                        ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        Object consume = composer2.consume(CompositionLocalsKt.getLocalDensity());
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        Density density = (Density) consume;
                        ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        Object consume2 = composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        LayoutDirection layoutDirection = (LayoutDirection) consume2;
                        ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        Object consume3 = composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ViewConfiguration viewConfiguration = (ViewConfiguration) consume3;
                        Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(m984toggleableO2vRcR0);
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (!composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        composer2.disableReusing();
                        Composer m2893constructorimpl = Updater.m2893constructorimpl(composer2);
                        Updater.m2900setimpl(m2893constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                        Updater.m2900setimpl(m2893constructorimpl, density, ComposeUiNode.Companion.getSetDensity());
                        Updater.m2900setimpl(m2893constructorimpl, layoutDirection, ComposeUiNode.Companion.getSetLayoutDirection());
                        Updater.m2900setimpl(m2893constructorimpl, viewConfiguration, ComposeUiNode.Companion.getSetViewConfiguration());
                        composer2.enableReusing();
                        materializerOf.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(composer2)), composer2, 0);
                        composer2.startReplaceableGroup(2058660585);
                        ComposerKt.sourceInformationMarkerStart(composer2, -1253629305, "C72@3384L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(composer2, 165225739, "C161@7782L30,162@7827L84:IconButton.kt#uh7d8r");
                        z5 = z7;
                        CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m3281boximpl(iconToggleButtonColors4.contentColor$material3_release(z5, z, composer2, i10).getValue().m3301unboximpl()))}, content, composer2, ((i11 >> 15) & 112) | 8);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        iconToggleButtonColors3 = iconToggleButtonColors4;
                        modifier4 = modifier3;
                        mutableInteractionSource2 = obj3;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier4 = modifier2;
                        z5 = z3;
                        iconToggleButtonColors3 = obj;
                        composer2 = startRestartGroup;
                        mutableInteractionSource2 = obj2;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                        return;
                    }
                    endRestartGroup.updateScope(new IconButtonKt$IconToggleButton$3(z, onCheckedChange, modifier4, z5, iconToggleButtonColors3, mutableInteractionSource2, content, i, i2));
                    return;
                }
                i6 = 1572864;
                i3 |= i6;
                if ((2995931 & i3) == 599186) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i9 == 0) {
                }
                if (i4 == 0) {
                }
                if ((i2 & 16) != 0) {
                }
                if (i5 == 0) {
                }
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                int i102 = ((i7 >> 6) & 896) | ((i7 >> 9) & 14) | ((i7 << 3) & 112);
                int i112 = i7;
                IconToggleButtonColors iconToggleButtonColors42 = iconToggleButtonColors2;
                boolean z72 = z4;
                composer2 = startRestartGroup;
                Modifier m984toggleableO2vRcR02 = ToggleableKt.m984toggleableO2vRcR0(BackgroundKt.m421backgroundbw27NRU$default(ClipKt.clip(SizeKt.m795size3ABfNKs(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier3), IconButtonTokens.INSTANCE.m2528getStateLayerSizeD9Ej5fM()), ShapesKt.toShape(IconButtonTokens.INSTANCE.getStateLayerShape(), startRestartGroup, 6)), iconToggleButtonColors2.containerColor$material3_release(z4, z, startRestartGroup, i102).getValue().m3301unboximpl(), null, 2, null), z, obj3, RippleKt.m1559rememberRipple9IZ8Weo(false, Dp.m5607constructorimpl(IconButtonTokens.INSTANCE.m2528getStateLayerSizeD9Ej5fM() / 2), 0L, startRestartGroup, 54, 4), z4, Role.m4917boximpl(Role.Companion.m4925getCheckboxo7Vup1c()), onCheckedChange);
                Alignment center2 = Alignment.Companion.getCenter();
                composer2.startReplaceableGroup(733328855);
                ComposerKt.sourceInformation(composer2, "CC(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center2, false, composer2, 6);
                composer2.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(composer2, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume4 = composer2.consume(CompositionLocalsKt.getLocalDensity());
                ComposerKt.sourceInformationMarkerEnd(composer2);
                Density density2 = (Density) consume4;
                ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume22 = composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ComposerKt.sourceInformationMarkerEnd(composer2);
                LayoutDirection layoutDirection2 = (LayoutDirection) consume22;
                ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume32 = composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ViewConfiguration viewConfiguration2 = (ViewConfiguration) consume32;
                Function0<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf2 = LayoutKt.materializerOf(m984toggleableO2vRcR02);
                if (!(composer2.getApplier() instanceof Applier)) {
                }
                composer2.startReusableNode();
                if (!composer2.getInserting()) {
                }
                composer2.disableReusing();
                Composer m2893constructorimpl2 = Updater.m2893constructorimpl(composer2);
                Updater.m2900setimpl(m2893constructorimpl2, rememberBoxMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.m2900setimpl(m2893constructorimpl2, density2, ComposeUiNode.Companion.getSetDensity());
                Updater.m2900setimpl(m2893constructorimpl2, layoutDirection2, ComposeUiNode.Companion.getSetLayoutDirection());
                Updater.m2900setimpl(m2893constructorimpl2, viewConfiguration2, ComposeUiNode.Companion.getSetViewConfiguration());
                composer2.enableReusing();
                materializerOf2.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(composer2)), composer2, 0);
                composer2.startReplaceableGroup(2058660585);
                ComposerKt.sourceInformationMarkerStart(composer2, -1253629305, "C72@3384L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composer2, 165225739, "C161@7782L30,162@7827L84:IconButton.kt#uh7d8r");
                z5 = z72;
                CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m3281boximpl(iconToggleButtonColors42.contentColor$material3_release(z5, z, composer2, i102).getValue().m3301unboximpl()))}, content, composer2, ((i112 >> 15) & 112) | 8);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                }
                iconToggleButtonColors3 = iconToggleButtonColors42;
                modifier4 = modifier3;
                mutableInteractionSource2 = obj3;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            z3 = z2;
            if ((57344 & i) == 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            if ((i2 & 64) == 0) {
            }
            i3 |= i6;
            if ((2995931 & i3) == 599186) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i9 == 0) {
            }
            if (i4 == 0) {
            }
            if ((i2 & 16) != 0) {
            }
            if (i5 == 0) {
            }
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            int i1022 = ((i7 >> 6) & 896) | ((i7 >> 9) & 14) | ((i7 << 3) & 112);
            int i1122 = i7;
            IconToggleButtonColors iconToggleButtonColors422 = iconToggleButtonColors2;
            boolean z722 = z4;
            composer2 = startRestartGroup;
            Modifier m984toggleableO2vRcR022 = ToggleableKt.m984toggleableO2vRcR0(BackgroundKt.m421backgroundbw27NRU$default(ClipKt.clip(SizeKt.m795size3ABfNKs(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier3), IconButtonTokens.INSTANCE.m2528getStateLayerSizeD9Ej5fM()), ShapesKt.toShape(IconButtonTokens.INSTANCE.getStateLayerShape(), startRestartGroup, 6)), iconToggleButtonColors2.containerColor$material3_release(z4, z, startRestartGroup, i1022).getValue().m3301unboximpl(), null, 2, null), z, obj3, RippleKt.m1559rememberRipple9IZ8Weo(false, Dp.m5607constructorimpl(IconButtonTokens.INSTANCE.m2528getStateLayerSizeD9Ej5fM() / 2), 0L, startRestartGroup, 54, 4), z4, Role.m4917boximpl(Role.Companion.m4925getCheckboxo7Vup1c()), onCheckedChange);
            Alignment center22 = Alignment.Companion.getCenter();
            composer2.startReplaceableGroup(733328855);
            ComposerKt.sourceInformation(composer2, "CC(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
            MeasurePolicy rememberBoxMeasurePolicy22 = BoxKt.rememberBoxMeasurePolicy(center22, false, composer2, 6);
            composer2.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(composer2, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume42 = composer2.consume(CompositionLocalsKt.getLocalDensity());
            ComposerKt.sourceInformationMarkerEnd(composer2);
            Density density22 = (Density) consume42;
            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume222 = composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ComposerKt.sourceInformationMarkerEnd(composer2);
            LayoutDirection layoutDirection22 = (LayoutDirection) consume222;
            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume322 = composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ViewConfiguration viewConfiguration22 = (ViewConfiguration) consume322;
            Function0<ComposeUiNode> constructor22 = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf22 = LayoutKt.materializerOf(m984toggleableO2vRcR022);
            if (!(composer2.getApplier() instanceof Applier)) {
            }
            composer2.startReusableNode();
            if (!composer2.getInserting()) {
            }
            composer2.disableReusing();
            Composer m2893constructorimpl22 = Updater.m2893constructorimpl(composer2);
            Updater.m2900setimpl(m2893constructorimpl22, rememberBoxMeasurePolicy22, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2900setimpl(m2893constructorimpl22, density22, ComposeUiNode.Companion.getSetDensity());
            Updater.m2900setimpl(m2893constructorimpl22, layoutDirection22, ComposeUiNode.Companion.getSetLayoutDirection());
            Updater.m2900setimpl(m2893constructorimpl22, viewConfiguration22, ComposeUiNode.Companion.getSetViewConfiguration());
            composer2.enableReusing();
            materializerOf22.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(composer2)), composer2, 0);
            composer2.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(composer2, -1253629305, "C72@3384L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer2, 165225739, "C161@7782L30,162@7827L84:IconButton.kt#uh7d8r");
            z5 = z722;
            CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m3281boximpl(iconToggleButtonColors422.contentColor$material3_release(z5, z, composer2, i1022).getValue().m3301unboximpl()))}, content, composer2, ((i1122 >> 15) & 112) | 8);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
            }
            iconToggleButtonColors3 = iconToggleButtonColors422;
            modifier4 = modifier3;
            mutableInteractionSource2 = obj3;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z3 = z2;
        if ((57344 & i) == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        if ((i2 & 64) == 0) {
        }
        i3 |= i6;
        if ((2995931 & i3) == 599186) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i9 == 0) {
        }
        if (i4 == 0) {
        }
        if ((i2 & 16) != 0) {
        }
        if (i5 == 0) {
        }
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        int i10222 = ((i7 >> 6) & 896) | ((i7 >> 9) & 14) | ((i7 << 3) & 112);
        int i11222 = i7;
        IconToggleButtonColors iconToggleButtonColors4222 = iconToggleButtonColors2;
        boolean z7222 = z4;
        composer2 = startRestartGroup;
        Modifier m984toggleableO2vRcR0222 = ToggleableKt.m984toggleableO2vRcR0(BackgroundKt.m421backgroundbw27NRU$default(ClipKt.clip(SizeKt.m795size3ABfNKs(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier3), IconButtonTokens.INSTANCE.m2528getStateLayerSizeD9Ej5fM()), ShapesKt.toShape(IconButtonTokens.INSTANCE.getStateLayerShape(), startRestartGroup, 6)), iconToggleButtonColors2.containerColor$material3_release(z4, z, startRestartGroup, i10222).getValue().m3301unboximpl(), null, 2, null), z, obj3, RippleKt.m1559rememberRipple9IZ8Weo(false, Dp.m5607constructorimpl(IconButtonTokens.INSTANCE.m2528getStateLayerSizeD9Ej5fM() / 2), 0L, startRestartGroup, 54, 4), z4, Role.m4917boximpl(Role.Companion.m4925getCheckboxo7Vup1c()), onCheckedChange);
        Alignment center222 = Alignment.Companion.getCenter();
        composer2.startReplaceableGroup(733328855);
        ComposerKt.sourceInformation(composer2, "CC(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
        MeasurePolicy rememberBoxMeasurePolicy222 = BoxKt.rememberBoxMeasurePolicy(center222, false, composer2, 6);
        composer2.startReplaceableGroup(-1323940314);
        ComposerKt.sourceInformation(composer2, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
        ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
        Object consume422 = composer2.consume(CompositionLocalsKt.getLocalDensity());
        ComposerKt.sourceInformationMarkerEnd(composer2);
        Density density222 = (Density) consume422;
        ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
        Object consume2222 = composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ComposerKt.sourceInformationMarkerEnd(composer2);
        LayoutDirection layoutDirection222 = (LayoutDirection) consume2222;
        ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
        Object consume3222 = composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ViewConfiguration viewConfiguration222 = (ViewConfiguration) consume3222;
        Function0<ComposeUiNode> constructor222 = ComposeUiNode.Companion.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf222 = LayoutKt.materializerOf(m984toggleableO2vRcR0222);
        if (!(composer2.getApplier() instanceof Applier)) {
        }
        composer2.startReusableNode();
        if (!composer2.getInserting()) {
        }
        composer2.disableReusing();
        Composer m2893constructorimpl222 = Updater.m2893constructorimpl(composer2);
        Updater.m2900setimpl(m2893constructorimpl222, rememberBoxMeasurePolicy222, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m2900setimpl(m2893constructorimpl222, density222, ComposeUiNode.Companion.getSetDensity());
        Updater.m2900setimpl(m2893constructorimpl222, layoutDirection222, ComposeUiNode.Companion.getSetLayoutDirection());
        Updater.m2900setimpl(m2893constructorimpl222, viewConfiguration222, ComposeUiNode.Companion.getSetViewConfiguration());
        composer2.enableReusing();
        materializerOf222.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(composer2)), composer2, 0);
        composer2.startReplaceableGroup(2058660585);
        ComposerKt.sourceInformationMarkerStart(composer2, -1253629305, "C72@3384L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance222 = BoxScopeInstance.INSTANCE;
        ComposerKt.sourceInformationMarkerStart(composer2, 165225739, "C161@7782L30,162@7827L84:IconButton.kt#uh7d8r");
        z5 = z7222;
        CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m3281boximpl(iconToggleButtonColors4222.contentColor$material3_release(z5, z, composer2, i10222).getValue().m3301unboximpl()))}, content, composer2, ((i11222 >> 15) & 112) | 8);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endReplaceableGroup();
        composer2.endNode();
        composer2.endReplaceableGroup();
        composer2.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
        }
        iconToggleButtonColors3 = iconToggleButtonColors4222;
        modifier4 = modifier3;
        mutableInteractionSource2 = obj3;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x012d  */
    /* JADX WARN: Type inference failed for: r14v17, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r14v26 */
    /* JADX WARN: Type inference failed for: r14v27 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FilledIconButton(Function0<Unit> onClick, Modifier modifier, boolean z, Shape shape, IconButtonColors iconButtonColors, MutableInteractionSource mutableInteractionSource, Function2<? super Composer, ? super Integer, Unit> content, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        Shape shape2;
        Object obj;
        int i5;
        Object obj2;
        int i6;
        boolean z3;
        Modifier modifier3;
        Shape shape3;
        IconButtonColors iconButtonColors2;
        MutableInteractionSource mutableInteractionSource2;
        int i7;
        boolean z4;
        Shape shape4;
        ?? r14;
        Composer composer2;
        Shape shape5;
        MutableInteractionSource mutableInteractionSource3;
        IconButtonColors iconButtonColors3;
        boolean z5;
        Modifier modifier4;
        boolean z6;
        Object obj3;
        int i8;
        Object obj4;
        Shape shape6;
        int i9;
        Shape shape7;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(1594730011);
        ComposerKt.sourceInformation(startRestartGroup, "C(FilledIconButton)P(5,4,2,6!1,3)200@9870L11,201@9933L24,202@10009L39,209@10241L23,210@10298L21,204@10090L441:IconButton.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changedInstance(onClick) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i10 = i2 & 2;
        if (i10 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 256 : 128;
                if ((i & 7168) == 0) {
                    if ((i2 & 8) == 0) {
                        shape6 = shape;
                        if (startRestartGroup.changed(shape6)) {
                            i9 = 2048;
                            shape7 = shape6;
                            i3 |= i9;
                            shape2 = shape7;
                        }
                    } else {
                        shape6 = shape;
                    }
                    i9 = 1024;
                    shape7 = shape6;
                    i3 |= i9;
                    shape2 = shape7;
                } else {
                    shape2 = shape;
                }
                if ((57344 & i) == 0) {
                    if ((i2 & 16) == 0) {
                        obj3 = iconButtonColors;
                        if (startRestartGroup.changed(obj3)) {
                            i8 = 16384;
                            obj4 = obj3;
                            i3 |= i8;
                            obj = obj4;
                        }
                    } else {
                        obj3 = iconButtonColors;
                    }
                    i8 = 8192;
                    obj4 = obj3;
                    i3 |= i8;
                    obj = obj4;
                } else {
                    obj = iconButtonColors;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((458752 & i) == 0) {
                    obj2 = mutableInteractionSource;
                    i3 |= startRestartGroup.changed(obj2) ? 131072 : 65536;
                    if ((i2 & 64) != 0) {
                        if ((3670016 & i) == 0) {
                            i6 = startRestartGroup.changedInstance(content) ? 1048576 : 524288;
                        }
                        if ((2995931 & i3) == 599186 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                Modifier.Companion companion = i10 != 0 ? Modifier.Companion : modifier2;
                                if (i4 != 0) {
                                    z2 = true;
                                }
                                Shape shape8 = shape2;
                                if ((i2 & 8) != 0) {
                                    i3 &= -7169;
                                    shape8 = IconButtonDefaults.INSTANCE.getFilledShape(startRestartGroup, 6);
                                }
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                    z3 = true;
                                    obj = IconButtonDefaults.INSTANCE.m1819filledIconButtonColorsro_MJ88(0L, 0L, 0L, 0L, startRestartGroup, 24576, 15);
                                } else {
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
                                    modifier3 = companion;
                                    mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
                                    z4 = z2;
                                    shape4 = shape8;
                                    iconButtonColors2 = obj;
                                    i7 = i3;
                                    r14 = z3;
                                    startRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1594730011, i7, -1, "androidx.compose.material3.FilledIconButton (IconButton.kt:196)");
                                    }
                                    int i11 = ((i7 >> 6) & 14) | ((i7 >> 9) & 112);
                                    int i12 = i7;
                                    IconButtonColors iconButtonColors4 = iconButtonColors2;
                                    boolean z7 = z4;
                                    Modifier modifier5 = modifier3;
                                    composer2 = startRestartGroup;
                                    SurfaceKt.m2070Surfaceo_FOJdg(onClick, SemanticsModifierKt.semantics$default(modifier3, false, IconButtonKt$FilledIconButton$2.INSTANCE, r14, null), z7, shape4, iconButtonColors2.containerColor$material3_release(z4, startRestartGroup, i11).getValue().m3301unboximpl(), iconButtonColors2.contentColor$material3_release(z4, startRestartGroup, i11).getValue().m3301unboximpl(), 0.0f, 0.0f, null, mutableInteractionSource2, ComposableLambdaKt.composableLambda(startRestartGroup, -1560623888, r14, new IconButtonKt$FilledIconButton$3(content, i12)), composer2, (i12 & 14) | (i12 & 896) | (i12 & 7168) | ((i12 << 12) & 1879048192), 6, 448);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    shape5 = shape4;
                                    mutableInteractionSource3 = mutableInteractionSource2;
                                    iconButtonColors3 = iconButtonColors4;
                                    z5 = z7;
                                    modifier4 = modifier5;
                                } else {
                                    modifier3 = companion;
                                    shape3 = shape8;
                                    iconButtonColors2 = obj;
                                    mutableInteractionSource2 = obj2;
                                    i7 = i3;
                                    z6 = z3;
                                }
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i2 & 8) != 0) {
                                    i3 &= -7169;
                                }
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                }
                                shape3 = shape2;
                                iconButtonColors2 = obj;
                                mutableInteractionSource2 = obj2;
                                z6 = true;
                                i7 = i3;
                                modifier3 = modifier2;
                            }
                            z4 = z2;
                            r14 = z6;
                            shape4 = shape3;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            int i112 = ((i7 >> 6) & 14) | ((i7 >> 9) & 112);
                            int i122 = i7;
                            IconButtonColors iconButtonColors42 = iconButtonColors2;
                            boolean z72 = z4;
                            Modifier modifier52 = modifier3;
                            composer2 = startRestartGroup;
                            SurfaceKt.m2070Surfaceo_FOJdg(onClick, SemanticsModifierKt.semantics$default(modifier3, false, IconButtonKt$FilledIconButton$2.INSTANCE, r14, null), z72, shape4, iconButtonColors2.containerColor$material3_release(z4, startRestartGroup, i112).getValue().m3301unboximpl(), iconButtonColors2.contentColor$material3_release(z4, startRestartGroup, i112).getValue().m3301unboximpl(), 0.0f, 0.0f, null, mutableInteractionSource2, ComposableLambdaKt.composableLambda(startRestartGroup, -1560623888, r14, new IconButtonKt$FilledIconButton$3(content, i122)), composer2, (i122 & 14) | (i122 & 896) | (i122 & 7168) | ((i122 << 12) & 1879048192), 6, 448);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            shape5 = shape4;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            iconButtonColors3 = iconButtonColors42;
                            z5 = z72;
                            modifier4 = modifier52;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            composer2 = startRestartGroup;
                            modifier4 = modifier2;
                            z5 = z2;
                            shape5 = shape2;
                            iconButtonColors3 = obj;
                            mutableInteractionSource3 = obj2;
                        }
                        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                            return;
                        }
                        endRestartGroup.updateScope(new IconButtonKt$FilledIconButton$4(onClick, modifier4, z5, shape5, iconButtonColors3, mutableInteractionSource3, content, i, i2));
                        return;
                    }
                    i6 = 1572864;
                    i3 |= i6;
                    if ((2995931 & i3) == 599186) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i10 != 0) {
                    }
                    if (i4 != 0) {
                    }
                    Shape shape82 = shape2;
                    if ((i2 & 8) != 0) {
                    }
                    if ((i2 & 16) != 0) {
                    }
                    if (i5 != 0) {
                    }
                }
                obj2 = mutableInteractionSource;
                if ((i2 & 64) != 0) {
                }
                i3 |= i6;
                if ((2995931 & i3) == 599186) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i10 != 0) {
                }
                if (i4 != 0) {
                }
                Shape shape822 = shape2;
                if ((i2 & 8) != 0) {
                }
                if ((i2 & 16) != 0) {
                }
                if (i5 != 0) {
                }
            }
            z2 = z;
            if ((i & 7168) == 0) {
            }
            if ((57344 & i) == 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            obj2 = mutableInteractionSource;
            if ((i2 & 64) != 0) {
            }
            i3 |= i6;
            if ((2995931 & i3) == 599186) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i10 != 0) {
            }
            if (i4 != 0) {
            }
            Shape shape8222 = shape2;
            if ((i2 & 8) != 0) {
            }
            if ((i2 & 16) != 0) {
            }
            if (i5 != 0) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z2 = z;
        if ((i & 7168) == 0) {
        }
        if ((57344 & i) == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        obj2 = mutableInteractionSource;
        if ((i2 & 64) != 0) {
        }
        i3 |= i6;
        if ((2995931 & i3) == 599186) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i10 != 0) {
        }
        if (i4 != 0) {
        }
        Shape shape82222 = shape2;
        if ((i2 & 8) != 0) {
        }
        if ((i2 & 16) != 0) {
        }
        if (i5 != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x012d  */
    /* JADX WARN: Type inference failed for: r14v17, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r14v26 */
    /* JADX WARN: Type inference failed for: r14v27 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FilledTonalIconButton(Function0<Unit> onClick, Modifier modifier, boolean z, Shape shape, IconButtonColors iconButtonColors, MutableInteractionSource mutableInteractionSource, Function2<? super Composer, ? super Integer, Unit> content, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        Shape shape2;
        Object obj;
        int i5;
        Object obj2;
        int i6;
        boolean z3;
        Modifier modifier3;
        Shape shape3;
        IconButtonColors iconButtonColors2;
        MutableInteractionSource mutableInteractionSource2;
        int i7;
        boolean z4;
        Shape shape4;
        ?? r14;
        Composer composer2;
        Shape shape5;
        MutableInteractionSource mutableInteractionSource3;
        IconButtonColors iconButtonColors3;
        boolean z5;
        Modifier modifier4;
        boolean z6;
        Object obj3;
        int i8;
        Object obj4;
        Shape shape6;
        int i9;
        Shape shape7;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-783937767);
        ComposerKt.sourceInformation(startRestartGroup, "C(FilledTonalIconButton)P(5,4,2,6!1,3)260@12819L11,261@12882L29,262@12963L39,269@13195L23,270@13252L21,264@13044L446:IconButton.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changedInstance(onClick) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i10 = i2 & 2;
        if (i10 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 256 : 128;
                if ((i & 7168) == 0) {
                    if ((i2 & 8) == 0) {
                        shape6 = shape;
                        if (startRestartGroup.changed(shape6)) {
                            i9 = 2048;
                            shape7 = shape6;
                            i3 |= i9;
                            shape2 = shape7;
                        }
                    } else {
                        shape6 = shape;
                    }
                    i9 = 1024;
                    shape7 = shape6;
                    i3 |= i9;
                    shape2 = shape7;
                } else {
                    shape2 = shape;
                }
                if ((57344 & i) == 0) {
                    if ((i2 & 16) == 0) {
                        obj3 = iconButtonColors;
                        if (startRestartGroup.changed(obj3)) {
                            i8 = 16384;
                            obj4 = obj3;
                            i3 |= i8;
                            obj = obj4;
                        }
                    } else {
                        obj3 = iconButtonColors;
                    }
                    i8 = 8192;
                    obj4 = obj3;
                    i3 |= i8;
                    obj = obj4;
                } else {
                    obj = iconButtonColors;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((458752 & i) == 0) {
                    obj2 = mutableInteractionSource;
                    i3 |= startRestartGroup.changed(obj2) ? 131072 : 65536;
                    if ((i2 & 64) != 0) {
                        if ((3670016 & i) == 0) {
                            i6 = startRestartGroup.changedInstance(content) ? 1048576 : 524288;
                        }
                        if ((2995931 & i3) == 599186 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                Modifier.Companion companion = i10 != 0 ? Modifier.Companion : modifier2;
                                if (i4 != 0) {
                                    z2 = true;
                                }
                                Shape shape8 = shape2;
                                if ((i2 & 8) != 0) {
                                    i3 &= -7169;
                                    shape8 = IconButtonDefaults.INSTANCE.getFilledShape(startRestartGroup, 6);
                                }
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                    z3 = true;
                                    obj = IconButtonDefaults.INSTANCE.m1821filledTonalIconButtonColorsro_MJ88(0L, 0L, 0L, 0L, startRestartGroup, 24576, 15);
                                } else {
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
                                    modifier3 = companion;
                                    mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
                                    z4 = z2;
                                    shape4 = shape8;
                                    iconButtonColors2 = obj;
                                    i7 = i3;
                                    r14 = z3;
                                    startRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-783937767, i7, -1, "androidx.compose.material3.FilledTonalIconButton (IconButton.kt:256)");
                                    }
                                    int i11 = ((i7 >> 6) & 14) | ((i7 >> 9) & 112);
                                    int i12 = i7;
                                    IconButtonColors iconButtonColors4 = iconButtonColors2;
                                    boolean z7 = z4;
                                    Modifier modifier5 = modifier3;
                                    composer2 = startRestartGroup;
                                    SurfaceKt.m2070Surfaceo_FOJdg(onClick, SemanticsModifierKt.semantics$default(modifier3, false, IconButtonKt$FilledTonalIconButton$2.INSTANCE, r14, null), z7, shape4, iconButtonColors2.containerColor$material3_release(z4, startRestartGroup, i11).getValue().m3301unboximpl(), iconButtonColors2.contentColor$material3_release(z4, startRestartGroup, i11).getValue().m3301unboximpl(), 0.0f, 0.0f, null, mutableInteractionSource2, ComposableLambdaKt.composableLambda(startRestartGroup, -1772884636, r14, new IconButtonKt$FilledTonalIconButton$3(content, i12)), composer2, (i12 & 14) | (i12 & 896) | (i12 & 7168) | ((i12 << 12) & 1879048192), 6, 448);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    shape5 = shape4;
                                    mutableInteractionSource3 = mutableInteractionSource2;
                                    iconButtonColors3 = iconButtonColors4;
                                    z5 = z7;
                                    modifier4 = modifier5;
                                } else {
                                    modifier3 = companion;
                                    shape3 = shape8;
                                    iconButtonColors2 = obj;
                                    mutableInteractionSource2 = obj2;
                                    i7 = i3;
                                    z6 = z3;
                                }
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i2 & 8) != 0) {
                                    i3 &= -7169;
                                }
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                }
                                shape3 = shape2;
                                iconButtonColors2 = obj;
                                mutableInteractionSource2 = obj2;
                                z6 = true;
                                i7 = i3;
                                modifier3 = modifier2;
                            }
                            z4 = z2;
                            r14 = z6;
                            shape4 = shape3;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            int i112 = ((i7 >> 6) & 14) | ((i7 >> 9) & 112);
                            int i122 = i7;
                            IconButtonColors iconButtonColors42 = iconButtonColors2;
                            boolean z72 = z4;
                            Modifier modifier52 = modifier3;
                            composer2 = startRestartGroup;
                            SurfaceKt.m2070Surfaceo_FOJdg(onClick, SemanticsModifierKt.semantics$default(modifier3, false, IconButtonKt$FilledTonalIconButton$2.INSTANCE, r14, null), z72, shape4, iconButtonColors2.containerColor$material3_release(z4, startRestartGroup, i112).getValue().m3301unboximpl(), iconButtonColors2.contentColor$material3_release(z4, startRestartGroup, i112).getValue().m3301unboximpl(), 0.0f, 0.0f, null, mutableInteractionSource2, ComposableLambdaKt.composableLambda(startRestartGroup, -1772884636, r14, new IconButtonKt$FilledTonalIconButton$3(content, i122)), composer2, (i122 & 14) | (i122 & 896) | (i122 & 7168) | ((i122 << 12) & 1879048192), 6, 448);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            shape5 = shape4;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            iconButtonColors3 = iconButtonColors42;
                            z5 = z72;
                            modifier4 = modifier52;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            composer2 = startRestartGroup;
                            modifier4 = modifier2;
                            z5 = z2;
                            shape5 = shape2;
                            iconButtonColors3 = obj;
                            mutableInteractionSource3 = obj2;
                        }
                        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                            return;
                        }
                        endRestartGroup.updateScope(new IconButtonKt$FilledTonalIconButton$4(onClick, modifier4, z5, shape5, iconButtonColors3, mutableInteractionSource3, content, i, i2));
                        return;
                    }
                    i6 = 1572864;
                    i3 |= i6;
                    if ((2995931 & i3) == 599186) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i10 != 0) {
                    }
                    if (i4 != 0) {
                    }
                    Shape shape82 = shape2;
                    if ((i2 & 8) != 0) {
                    }
                    if ((i2 & 16) != 0) {
                    }
                    if (i5 != 0) {
                    }
                }
                obj2 = mutableInteractionSource;
                if ((i2 & 64) != 0) {
                }
                i3 |= i6;
                if ((2995931 & i3) == 599186) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i10 != 0) {
                }
                if (i4 != 0) {
                }
                Shape shape822 = shape2;
                if ((i2 & 8) != 0) {
                }
                if ((i2 & 16) != 0) {
                }
                if (i5 != 0) {
                }
            }
            z2 = z;
            if ((i & 7168) == 0) {
            }
            if ((57344 & i) == 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            obj2 = mutableInteractionSource;
            if ((i2 & 64) != 0) {
            }
            i3 |= i6;
            if ((2995931 & i3) == 599186) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i10 != 0) {
            }
            if (i4 != 0) {
            }
            Shape shape8222 = shape2;
            if ((i2 & 8) != 0) {
            }
            if ((i2 & 16) != 0) {
            }
            if (i5 != 0) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z2 = z;
        if ((i & 7168) == 0) {
        }
        if ((57344 & i) == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        obj2 = mutableInteractionSource;
        if ((i2 & 64) != 0) {
        }
        i3 |= i6;
        if ((2995931 & i3) == 599186) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i10 != 0) {
        }
        if (i4 != 0) {
        }
        Shape shape82222 = shape2;
        if ((i2 & 8) != 0) {
        }
        if ((i2 & 16) != 0) {
        }
        if (i5 != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:139:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0127  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FilledIconToggleButton(boolean z, Function1<? super Boolean, Unit> onCheckedChange, Modifier modifier, boolean z2, Shape shape, IconToggleButtonColors iconToggleButtonColors, MutableInteractionSource mutableInteractionSource, Function2<? super Composer, ? super Integer, Unit> content, Composer composer, int i, int i2) {
        int i3;
        int i4;
        boolean z3;
        Shape shape2;
        Object obj;
        int i5;
        Object obj2;
        int i6;
        Modifier.Companion companion;
        Shape shape3;
        IconToggleButtonColors iconToggleButtonColors2;
        Object obj3;
        int i7;
        Shape shape4;
        IconToggleButtonColors iconToggleButtonColors3;
        Composer composer2;
        Shape shape5;
        MutableInteractionSource mutableInteractionSource2;
        IconToggleButtonColors iconToggleButtonColors4;
        Modifier modifier2;
        boolean z4;
        ScopeUpdateScope endRestartGroup;
        int i8;
        int i9;
        Intrinsics.checkNotNullParameter(onCheckedChange, "onCheckedChange");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-1708189280);
        ComposerKt.sourceInformation(startRestartGroup, "C(FilledIconToggleButton)P(!1,6,5,3,7!1,4)318@15646L11,319@15715L30,320@15797L39,328@16070L32,329@16136L30,322@15878L500:IconButton.kt#uh7d8r");
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
            i3 |= startRestartGroup.changedInstance(onCheckedChange) ? 32 : 16;
        }
        int i10 = i2 & 4;
        if (i10 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
            } else if ((i & 7168) == 0) {
                z3 = z2;
                i3 |= startRestartGroup.changed(z3) ? 2048 : 1024;
                if ((i & 57344) == 0) {
                    if ((i2 & 16) == 0) {
                        shape2 = shape;
                        if (startRestartGroup.changed(shape2)) {
                            i9 = 16384;
                            i3 |= i9;
                        }
                    } else {
                        shape2 = shape;
                    }
                    i9 = 8192;
                    i3 |= i9;
                } else {
                    shape2 = shape;
                }
                if ((458752 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        obj = iconToggleButtonColors;
                        if (startRestartGroup.changed(obj)) {
                            i8 = 131072;
                            i3 |= i8;
                        }
                    } else {
                        obj = iconToggleButtonColors;
                    }
                    i8 = 65536;
                    i3 |= i8;
                } else {
                    obj = iconToggleButtonColors;
                }
                i5 = i2 & 64;
                if (i5 != 0) {
                    i3 |= 1572864;
                } else if ((3670016 & i) == 0) {
                    obj2 = mutableInteractionSource;
                    i3 |= startRestartGroup.changed(obj2) ? 1048576 : 524288;
                    if ((i2 & 128) != 0) {
                        if ((29360128 & i) == 0) {
                            i6 = startRestartGroup.changedInstance(content) ? 8388608 : 4194304;
                        }
                        if ((23967451 & i3) == 4793490 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                companion = i10 != 0 ? Modifier.Companion : modifier;
                                if (i4 != 0) {
                                    z3 = true;
                                }
                                if ((i2 & 16) != 0) {
                                    shape3 = IconButtonDefaults.INSTANCE.getFilledShape(startRestartGroup, 6);
                                    i3 &= -57345;
                                } else {
                                    shape3 = shape2;
                                }
                                if ((i2 & 32) != 0) {
                                    iconToggleButtonColors2 = IconButtonDefaults.INSTANCE.m1820filledIconToggleButtonColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, startRestartGroup, 1572864, 63);
                                    i3 &= -458753;
                                } else {
                                    iconToggleButtonColors2 = iconToggleButtonColors;
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
                                    i7 = i3;
                                    shape4 = shape3;
                                    obj3 = (MutableInteractionSource) rememberedValue;
                                } else {
                                    obj3 = mutableInteractionSource;
                                    i7 = i3;
                                    shape4 = shape3;
                                }
                                iconToggleButtonColors3 = iconToggleButtonColors2;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                }
                                if ((i2 & 32) != 0) {
                                    i3 &= -458753;
                                }
                                companion = modifier;
                                iconToggleButtonColors3 = iconToggleButtonColors;
                                shape4 = shape2;
                                obj3 = obj2;
                                i7 = i3;
                            }
                            boolean z5 = z3;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1708189280, i7, -1, "androidx.compose.material3.FilledIconToggleButton (IconButton.kt:313)");
                            }
                            int i11 = i7 >> 9;
                            int i12 = (i11 & 14) | ((i7 << 3) & 112) | (i11 & 896);
                            int i13 = i7;
                            IconToggleButtonColors iconToggleButtonColors5 = iconToggleButtonColors3;
                            Modifier modifier3 = companion;
                            composer2 = startRestartGroup;
                            SurfaceKt.m2069Surfaced85dljk(z, onCheckedChange, SemanticsModifierKt.semantics$default(companion, false, IconButtonKt$FilledIconToggleButton$2.INSTANCE, 1, null), z5, shape4, iconToggleButtonColors3.containerColor$material3_release(z5, z, startRestartGroup, i12).getValue().m3301unboximpl(), iconToggleButtonColors3.contentColor$material3_release(z5, z, startRestartGroup, i12).getValue().m3301unboximpl(), 0.0f, 0.0f, (BorderStroke) null, obj3, ComposableLambdaKt.composableLambda(startRestartGroup, 1235871670, true, new IconButtonKt$FilledIconToggleButton$3(content, i13)), composer2, (i13 & 14) | (i13 & 112) | (i13 & 7168) | (i13 & 57344), ((i13 >> 18) & 14) | 48, 896);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            shape5 = shape4;
                            mutableInteractionSource2 = obj3;
                            iconToggleButtonColors4 = iconToggleButtonColors5;
                            modifier2 = modifier3;
                            z4 = z5;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier2 = modifier;
                            z4 = z3;
                            shape5 = shape2;
                            iconToggleButtonColors4 = obj;
                            composer2 = startRestartGroup;
                            mutableInteractionSource2 = obj2;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                            return;
                        }
                        endRestartGroup.updateScope(new IconButtonKt$FilledIconToggleButton$4(z, onCheckedChange, modifier2, z4, shape5, iconToggleButtonColors4, mutableInteractionSource2, content, i, i2));
                        return;
                    }
                    i6 = 12582912;
                    i3 |= i6;
                    if ((23967451 & i3) == 4793490) {
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
                    if ((i2 & 32) != 0) {
                    }
                    if (i5 != 0) {
                    }
                    iconToggleButtonColors3 = iconToggleButtonColors2;
                    boolean z52 = z3;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    int i112 = i7 >> 9;
                    int i122 = (i112 & 14) | ((i7 << 3) & 112) | (i112 & 896);
                    int i132 = i7;
                    IconToggleButtonColors iconToggleButtonColors52 = iconToggleButtonColors3;
                    Modifier modifier32 = companion;
                    composer2 = startRestartGroup;
                    SurfaceKt.m2069Surfaced85dljk(z, onCheckedChange, SemanticsModifierKt.semantics$default(companion, false, IconButtonKt$FilledIconToggleButton$2.INSTANCE, 1, null), z52, shape4, iconToggleButtonColors3.containerColor$material3_release(z52, z, startRestartGroup, i122).getValue().m3301unboximpl(), iconToggleButtonColors3.contentColor$material3_release(z52, z, startRestartGroup, i122).getValue().m3301unboximpl(), 0.0f, 0.0f, (BorderStroke) null, obj3, ComposableLambdaKt.composableLambda(startRestartGroup, 1235871670, true, new IconButtonKt$FilledIconToggleButton$3(content, i132)), composer2, (i132 & 14) | (i132 & 112) | (i132 & 7168) | (i132 & 57344), ((i132 >> 18) & 14) | 48, 896);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    shape5 = shape4;
                    mutableInteractionSource2 = obj3;
                    iconToggleButtonColors4 = iconToggleButtonColors52;
                    modifier2 = modifier32;
                    z4 = z52;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                obj2 = mutableInteractionSource;
                if ((i2 & 128) != 0) {
                }
                i3 |= i6;
                if ((23967451 & i3) == 4793490) {
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
                if ((i2 & 32) != 0) {
                }
                if (i5 != 0) {
                }
                iconToggleButtonColors3 = iconToggleButtonColors2;
                boolean z522 = z3;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                int i1122 = i7 >> 9;
                int i1222 = (i1122 & 14) | ((i7 << 3) & 112) | (i1122 & 896);
                int i1322 = i7;
                IconToggleButtonColors iconToggleButtonColors522 = iconToggleButtonColors3;
                Modifier modifier322 = companion;
                composer2 = startRestartGroup;
                SurfaceKt.m2069Surfaced85dljk(z, onCheckedChange, SemanticsModifierKt.semantics$default(companion, false, IconButtonKt$FilledIconToggleButton$2.INSTANCE, 1, null), z522, shape4, iconToggleButtonColors3.containerColor$material3_release(z522, z, startRestartGroup, i1222).getValue().m3301unboximpl(), iconToggleButtonColors3.contentColor$material3_release(z522, z, startRestartGroup, i1222).getValue().m3301unboximpl(), 0.0f, 0.0f, (BorderStroke) null, obj3, ComposableLambdaKt.composableLambda(startRestartGroup, 1235871670, true, new IconButtonKt$FilledIconToggleButton$3(content, i1322)), composer2, (i1322 & 14) | (i1322 & 112) | (i1322 & 7168) | (i1322 & 57344), ((i1322 >> 18) & 14) | 48, 896);
                if (ComposerKt.isTraceInProgress()) {
                }
                shape5 = shape4;
                mutableInteractionSource2 = obj3;
                iconToggleButtonColors4 = iconToggleButtonColors522;
                modifier2 = modifier322;
                z4 = z522;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z3 = z2;
            if ((i & 57344) == 0) {
            }
            if ((458752 & i) == 0) {
            }
            i5 = i2 & 64;
            if (i5 != 0) {
            }
            obj2 = mutableInteractionSource;
            if ((i2 & 128) != 0) {
            }
            i3 |= i6;
            if ((23967451 & i3) == 4793490) {
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
            if ((i2 & 32) != 0) {
            }
            if (i5 != 0) {
            }
            iconToggleButtonColors3 = iconToggleButtonColors2;
            boolean z5222 = z3;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            int i11222 = i7 >> 9;
            int i12222 = (i11222 & 14) | ((i7 << 3) & 112) | (i11222 & 896);
            int i13222 = i7;
            IconToggleButtonColors iconToggleButtonColors5222 = iconToggleButtonColors3;
            Modifier modifier3222 = companion;
            composer2 = startRestartGroup;
            SurfaceKt.m2069Surfaced85dljk(z, onCheckedChange, SemanticsModifierKt.semantics$default(companion, false, IconButtonKt$FilledIconToggleButton$2.INSTANCE, 1, null), z5222, shape4, iconToggleButtonColors3.containerColor$material3_release(z5222, z, startRestartGroup, i12222).getValue().m3301unboximpl(), iconToggleButtonColors3.contentColor$material3_release(z5222, z, startRestartGroup, i12222).getValue().m3301unboximpl(), 0.0f, 0.0f, (BorderStroke) null, obj3, ComposableLambdaKt.composableLambda(startRestartGroup, 1235871670, true, new IconButtonKt$FilledIconToggleButton$3(content, i13222)), composer2, (i13222 & 14) | (i13222 & 112) | (i13222 & 7168) | (i13222 & 57344), ((i13222 >> 18) & 14) | 48, 896);
            if (ComposerKt.isTraceInProgress()) {
            }
            shape5 = shape4;
            mutableInteractionSource2 = obj3;
            iconToggleButtonColors4 = iconToggleButtonColors5222;
            modifier2 = modifier3222;
            z4 = z5222;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z3 = z2;
        if ((i & 57344) == 0) {
        }
        if ((458752 & i) == 0) {
        }
        i5 = i2 & 64;
        if (i5 != 0) {
        }
        obj2 = mutableInteractionSource;
        if ((i2 & 128) != 0) {
        }
        i3 |= i6;
        if ((23967451 & i3) == 4793490) {
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
        if ((i2 & 32) != 0) {
        }
        if (i5 != 0) {
        }
        iconToggleButtonColors3 = iconToggleButtonColors2;
        boolean z52222 = z3;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        int i112222 = i7 >> 9;
        int i122222 = (i112222 & 14) | ((i7 << 3) & 112) | (i112222 & 896);
        int i132222 = i7;
        IconToggleButtonColors iconToggleButtonColors52222 = iconToggleButtonColors3;
        Modifier modifier32222 = companion;
        composer2 = startRestartGroup;
        SurfaceKt.m2069Surfaced85dljk(z, onCheckedChange, SemanticsModifierKt.semantics$default(companion, false, IconButtonKt$FilledIconToggleButton$2.INSTANCE, 1, null), z52222, shape4, iconToggleButtonColors3.containerColor$material3_release(z52222, z, startRestartGroup, i122222).getValue().m3301unboximpl(), iconToggleButtonColors3.contentColor$material3_release(z52222, z, startRestartGroup, i122222).getValue().m3301unboximpl(), 0.0f, 0.0f, (BorderStroke) null, obj3, ComposableLambdaKt.composableLambda(startRestartGroup, 1235871670, true, new IconButtonKt$FilledIconToggleButton$3(content, i132222)), composer2, (i132222 & 14) | (i132222 & 112) | (i132222 & 7168) | (i132222 & 57344), ((i132222 >> 18) & 14) | 48, 896);
        if (ComposerKt.isTraceInProgress()) {
        }
        shape5 = shape4;
        mutableInteractionSource2 = obj3;
        iconToggleButtonColors4 = iconToggleButtonColors52222;
        modifier2 = modifier32222;
        z4 = z52222;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:139:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0127  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FilledTonalIconToggleButton(boolean z, Function1<? super Boolean, Unit> onCheckedChange, Modifier modifier, boolean z2, Shape shape, IconToggleButtonColors iconToggleButtonColors, MutableInteractionSource mutableInteractionSource, Function2<? super Composer, ? super Integer, Unit> content, Composer composer, int i, int i2) {
        int i3;
        int i4;
        boolean z3;
        Shape shape2;
        Object obj;
        int i5;
        Object obj2;
        int i6;
        Modifier.Companion companion;
        Shape shape3;
        IconToggleButtonColors iconToggleButtonColors2;
        Object obj3;
        int i7;
        Shape shape4;
        IconToggleButtonColors iconToggleButtonColors3;
        Composer composer2;
        Shape shape5;
        MutableInteractionSource mutableInteractionSource2;
        IconToggleButtonColors iconToggleButtonColors4;
        Modifier modifier2;
        boolean z4;
        ScopeUpdateScope endRestartGroup;
        int i8;
        int i9;
        Intrinsics.checkNotNullParameter(onCheckedChange, "onCheckedChange");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(1676089246);
        ComposerKt.sourceInformation(startRestartGroup, "C(FilledTonalIconToggleButton)P(!1,6,5,3,7!1,4)382@18890L11,383@18959L35,384@19046L39,392@19319L32,393@19385L30,386@19127L505:IconButton.kt#uh7d8r");
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
            i3 |= startRestartGroup.changedInstance(onCheckedChange) ? 32 : 16;
        }
        int i10 = i2 & 4;
        if (i10 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
            } else if ((i & 7168) == 0) {
                z3 = z2;
                i3 |= startRestartGroup.changed(z3) ? 2048 : 1024;
                if ((i & 57344) == 0) {
                    if ((i2 & 16) == 0) {
                        shape2 = shape;
                        if (startRestartGroup.changed(shape2)) {
                            i9 = 16384;
                            i3 |= i9;
                        }
                    } else {
                        shape2 = shape;
                    }
                    i9 = 8192;
                    i3 |= i9;
                } else {
                    shape2 = shape;
                }
                if ((458752 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        obj = iconToggleButtonColors;
                        if (startRestartGroup.changed(obj)) {
                            i8 = 131072;
                            i3 |= i8;
                        }
                    } else {
                        obj = iconToggleButtonColors;
                    }
                    i8 = 65536;
                    i3 |= i8;
                } else {
                    obj = iconToggleButtonColors;
                }
                i5 = i2 & 64;
                if (i5 != 0) {
                    i3 |= 1572864;
                } else if ((3670016 & i) == 0) {
                    obj2 = mutableInteractionSource;
                    i3 |= startRestartGroup.changed(obj2) ? 1048576 : 524288;
                    if ((i2 & 128) != 0) {
                        if ((29360128 & i) == 0) {
                            i6 = startRestartGroup.changedInstance(content) ? 8388608 : 4194304;
                        }
                        if ((23967451 & i3) == 4793490 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                companion = i10 != 0 ? Modifier.Companion : modifier;
                                if (i4 != 0) {
                                    z3 = true;
                                }
                                if ((i2 & 16) != 0) {
                                    shape3 = IconButtonDefaults.INSTANCE.getFilledShape(startRestartGroup, 6);
                                    i3 &= -57345;
                                } else {
                                    shape3 = shape2;
                                }
                                if ((i2 & 32) != 0) {
                                    iconToggleButtonColors2 = IconButtonDefaults.INSTANCE.m1822filledTonalIconToggleButtonColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, startRestartGroup, 1572864, 63);
                                    i3 &= -458753;
                                } else {
                                    iconToggleButtonColors2 = iconToggleButtonColors;
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
                                    i7 = i3;
                                    shape4 = shape3;
                                    obj3 = (MutableInteractionSource) rememberedValue;
                                } else {
                                    obj3 = mutableInteractionSource;
                                    i7 = i3;
                                    shape4 = shape3;
                                }
                                iconToggleButtonColors3 = iconToggleButtonColors2;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                }
                                if ((i2 & 32) != 0) {
                                    i3 &= -458753;
                                }
                                companion = modifier;
                                iconToggleButtonColors3 = iconToggleButtonColors;
                                shape4 = shape2;
                                obj3 = obj2;
                                i7 = i3;
                            }
                            boolean z5 = z3;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1676089246, i7, -1, "androidx.compose.material3.FilledTonalIconToggleButton (IconButton.kt:377)");
                            }
                            int i11 = i7 >> 9;
                            int i12 = (i11 & 14) | ((i7 << 3) & 112) | (i11 & 896);
                            int i13 = i7;
                            IconToggleButtonColors iconToggleButtonColors5 = iconToggleButtonColors3;
                            Modifier modifier3 = companion;
                            composer2 = startRestartGroup;
                            SurfaceKt.m2069Surfaced85dljk(z, onCheckedChange, SemanticsModifierKt.semantics$default(companion, false, IconButtonKt$FilledTonalIconToggleButton$2.INSTANCE, 1, null), z5, shape4, iconToggleButtonColors3.containerColor$material3_release(z5, z, startRestartGroup, i12).getValue().m3301unboximpl(), iconToggleButtonColors3.contentColor$material3_release(z5, z, startRestartGroup, i12).getValue().m3301unboximpl(), 0.0f, 0.0f, (BorderStroke) null, obj3, ComposableLambdaKt.composableLambda(startRestartGroup, -58218680, true, new IconButtonKt$FilledTonalIconToggleButton$3(content, i13)), composer2, (i13 & 14) | (i13 & 112) | (i13 & 7168) | (i13 & 57344), ((i13 >> 18) & 14) | 48, 896);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            shape5 = shape4;
                            mutableInteractionSource2 = obj3;
                            iconToggleButtonColors4 = iconToggleButtonColors5;
                            modifier2 = modifier3;
                            z4 = z5;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier2 = modifier;
                            z4 = z3;
                            shape5 = shape2;
                            iconToggleButtonColors4 = obj;
                            composer2 = startRestartGroup;
                            mutableInteractionSource2 = obj2;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                            return;
                        }
                        endRestartGroup.updateScope(new IconButtonKt$FilledTonalIconToggleButton$4(z, onCheckedChange, modifier2, z4, shape5, iconToggleButtonColors4, mutableInteractionSource2, content, i, i2));
                        return;
                    }
                    i6 = 12582912;
                    i3 |= i6;
                    if ((23967451 & i3) == 4793490) {
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
                    if ((i2 & 32) != 0) {
                    }
                    if (i5 != 0) {
                    }
                    iconToggleButtonColors3 = iconToggleButtonColors2;
                    boolean z52 = z3;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    int i112 = i7 >> 9;
                    int i122 = (i112 & 14) | ((i7 << 3) & 112) | (i112 & 896);
                    int i132 = i7;
                    IconToggleButtonColors iconToggleButtonColors52 = iconToggleButtonColors3;
                    Modifier modifier32 = companion;
                    composer2 = startRestartGroup;
                    SurfaceKt.m2069Surfaced85dljk(z, onCheckedChange, SemanticsModifierKt.semantics$default(companion, false, IconButtonKt$FilledTonalIconToggleButton$2.INSTANCE, 1, null), z52, shape4, iconToggleButtonColors3.containerColor$material3_release(z52, z, startRestartGroup, i122).getValue().m3301unboximpl(), iconToggleButtonColors3.contentColor$material3_release(z52, z, startRestartGroup, i122).getValue().m3301unboximpl(), 0.0f, 0.0f, (BorderStroke) null, obj3, ComposableLambdaKt.composableLambda(startRestartGroup, -58218680, true, new IconButtonKt$FilledTonalIconToggleButton$3(content, i132)), composer2, (i132 & 14) | (i132 & 112) | (i132 & 7168) | (i132 & 57344), ((i132 >> 18) & 14) | 48, 896);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    shape5 = shape4;
                    mutableInteractionSource2 = obj3;
                    iconToggleButtonColors4 = iconToggleButtonColors52;
                    modifier2 = modifier32;
                    z4 = z52;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                obj2 = mutableInteractionSource;
                if ((i2 & 128) != 0) {
                }
                i3 |= i6;
                if ((23967451 & i3) == 4793490) {
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
                if ((i2 & 32) != 0) {
                }
                if (i5 != 0) {
                }
                iconToggleButtonColors3 = iconToggleButtonColors2;
                boolean z522 = z3;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                int i1122 = i7 >> 9;
                int i1222 = (i1122 & 14) | ((i7 << 3) & 112) | (i1122 & 896);
                int i1322 = i7;
                IconToggleButtonColors iconToggleButtonColors522 = iconToggleButtonColors3;
                Modifier modifier322 = companion;
                composer2 = startRestartGroup;
                SurfaceKt.m2069Surfaced85dljk(z, onCheckedChange, SemanticsModifierKt.semantics$default(companion, false, IconButtonKt$FilledTonalIconToggleButton$2.INSTANCE, 1, null), z522, shape4, iconToggleButtonColors3.containerColor$material3_release(z522, z, startRestartGroup, i1222).getValue().m3301unboximpl(), iconToggleButtonColors3.contentColor$material3_release(z522, z, startRestartGroup, i1222).getValue().m3301unboximpl(), 0.0f, 0.0f, (BorderStroke) null, obj3, ComposableLambdaKt.composableLambda(startRestartGroup, -58218680, true, new IconButtonKt$FilledTonalIconToggleButton$3(content, i1322)), composer2, (i1322 & 14) | (i1322 & 112) | (i1322 & 7168) | (i1322 & 57344), ((i1322 >> 18) & 14) | 48, 896);
                if (ComposerKt.isTraceInProgress()) {
                }
                shape5 = shape4;
                mutableInteractionSource2 = obj3;
                iconToggleButtonColors4 = iconToggleButtonColors522;
                modifier2 = modifier322;
                z4 = z522;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z3 = z2;
            if ((i & 57344) == 0) {
            }
            if ((458752 & i) == 0) {
            }
            i5 = i2 & 64;
            if (i5 != 0) {
            }
            obj2 = mutableInteractionSource;
            if ((i2 & 128) != 0) {
            }
            i3 |= i6;
            if ((23967451 & i3) == 4793490) {
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
            if ((i2 & 32) != 0) {
            }
            if (i5 != 0) {
            }
            iconToggleButtonColors3 = iconToggleButtonColors2;
            boolean z5222 = z3;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            int i11222 = i7 >> 9;
            int i12222 = (i11222 & 14) | ((i7 << 3) & 112) | (i11222 & 896);
            int i13222 = i7;
            IconToggleButtonColors iconToggleButtonColors5222 = iconToggleButtonColors3;
            Modifier modifier3222 = companion;
            composer2 = startRestartGroup;
            SurfaceKt.m2069Surfaced85dljk(z, onCheckedChange, SemanticsModifierKt.semantics$default(companion, false, IconButtonKt$FilledTonalIconToggleButton$2.INSTANCE, 1, null), z5222, shape4, iconToggleButtonColors3.containerColor$material3_release(z5222, z, startRestartGroup, i12222).getValue().m3301unboximpl(), iconToggleButtonColors3.contentColor$material3_release(z5222, z, startRestartGroup, i12222).getValue().m3301unboximpl(), 0.0f, 0.0f, (BorderStroke) null, obj3, ComposableLambdaKt.composableLambda(startRestartGroup, -58218680, true, new IconButtonKt$FilledTonalIconToggleButton$3(content, i13222)), composer2, (i13222 & 14) | (i13222 & 112) | (i13222 & 7168) | (i13222 & 57344), ((i13222 >> 18) & 14) | 48, 896);
            if (ComposerKt.isTraceInProgress()) {
            }
            shape5 = shape4;
            mutableInteractionSource2 = obj3;
            iconToggleButtonColors4 = iconToggleButtonColors5222;
            modifier2 = modifier3222;
            z4 = z5222;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z3 = z2;
        if ((i & 57344) == 0) {
        }
        if ((458752 & i) == 0) {
        }
        i5 = i2 & 64;
        if (i5 != 0) {
        }
        obj2 = mutableInteractionSource;
        if ((i2 & 128) != 0) {
        }
        i3 |= i6;
        if ((23967451 & i3) == 4793490) {
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
        if ((i2 & 32) != 0) {
        }
        if (i5 != 0) {
        }
        iconToggleButtonColors3 = iconToggleButtonColors2;
        boolean z52222 = z3;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        int i112222 = i7 >> 9;
        int i122222 = (i112222 & 14) | ((i7 << 3) & 112) | (i112222 & 896);
        int i132222 = i7;
        IconToggleButtonColors iconToggleButtonColors52222 = iconToggleButtonColors3;
        Modifier modifier32222 = companion;
        composer2 = startRestartGroup;
        SurfaceKt.m2069Surfaced85dljk(z, onCheckedChange, SemanticsModifierKt.semantics$default(companion, false, IconButtonKt$FilledTonalIconToggleButton$2.INSTANCE, 1, null), z52222, shape4, iconToggleButtonColors3.containerColor$material3_release(z52222, z, startRestartGroup, i122222).getValue().m3301unboximpl(), iconToggleButtonColors3.contentColor$material3_release(z52222, z, startRestartGroup, i122222).getValue().m3301unboximpl(), 0.0f, 0.0f, (BorderStroke) null, obj3, ComposableLambdaKt.composableLambda(startRestartGroup, -58218680, true, new IconButtonKt$FilledTonalIconToggleButton$3(content, i132222)), composer2, (i132222 & 14) | (i132222 & 112) | (i132222 & 7168) | (i132222 & 57344), ((i132222 >> 18) & 14) | 48, 896);
        if (ComposerKt.isTraceInProgress()) {
        }
        shape5 = shape4;
        mutableInteractionSource2 = obj3;
        iconToggleButtonColors4 = iconToggleButtonColors52222;
        modifier2 = modifier32222;
        z4 = z52222;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:142:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0126  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OutlinedIconButton(Function0<Unit> onClick, Modifier modifier, boolean z, Shape shape, IconButtonColors iconButtonColors, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, Function2<? super Composer, ? super Integer, Unit> content, Composer composer, int i, int i2) {
        int i3;
        Modifier.Companion companion;
        int i4;
        boolean z2;
        Shape shape2;
        Object obj;
        Object obj2;
        int i5;
        Object obj3;
        int i6;
        int i7;
        Object obj4;
        Modifier modifier2;
        boolean z3;
        Shape shape3;
        IconButtonColors iconButtonColors2;
        Object obj5;
        int i8;
        Object obj6;
        Composer composer2;
        Shape shape4;
        BorderStroke borderStroke2;
        MutableInteractionSource mutableInteractionSource2;
        Modifier modifier3;
        IconButtonColors iconButtonColors3;
        boolean z4;
        ScopeUpdateScope endRestartGroup;
        Object obj7;
        int i9;
        Object obj8;
        Object obj9;
        int i10;
        Object obj10;
        Shape shape5;
        int i11;
        Shape shape6;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-1746603025);
        ComposerKt.sourceInformation(startRestartGroup, "C(OutlinedIconButton)P(6,5,3,7,1!1,4)446@22052L13,447@22117L26,448@22192L33,449@22277L39,456@22509L23,457@22566L21,451@22358L464:IconButton.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changedInstance(onClick) ? 4 : 2) | i;
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
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 256 : 128;
                if ((i & 7168) == 0) {
                    if ((i2 & 8) == 0) {
                        shape5 = shape;
                        if (startRestartGroup.changed(shape5)) {
                            i11 = 2048;
                            shape6 = shape5;
                            i3 |= i11;
                            shape2 = shape6;
                        }
                    } else {
                        shape5 = shape;
                    }
                    i11 = 1024;
                    shape6 = shape5;
                    i3 |= i11;
                    shape2 = shape6;
                } else {
                    shape2 = shape;
                }
                if ((57344 & i) == 0) {
                    if ((i2 & 16) == 0) {
                        obj9 = iconButtonColors;
                        if (startRestartGroup.changed(obj9)) {
                            i10 = 16384;
                            obj10 = obj9;
                            i3 |= i10;
                            obj = obj10;
                        }
                    } else {
                        obj9 = iconButtonColors;
                    }
                    i10 = 8192;
                    obj10 = obj9;
                    i3 |= i10;
                    obj = obj10;
                } else {
                    obj = iconButtonColors;
                }
                if ((458752 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        obj7 = borderStroke;
                        if (startRestartGroup.changed(obj7)) {
                            i9 = 131072;
                            obj8 = obj7;
                            i3 |= i9;
                            obj2 = obj8;
                        }
                    } else {
                        obj7 = borderStroke;
                    }
                    i9 = 65536;
                    obj8 = obj7;
                    i3 |= i9;
                    obj2 = obj8;
                } else {
                    obj2 = borderStroke;
                }
                i5 = i2 & 64;
                if (i5 != 0) {
                    i3 |= 1572864;
                    obj3 = mutableInteractionSource;
                } else {
                    Object obj11 = mutableInteractionSource;
                    obj3 = obj11;
                    if ((3670016 & i) == 0) {
                        i3 |= startRestartGroup.changed(obj11) ? 1048576 : 524288;
                        obj3 = obj11;
                    }
                }
                if ((i2 & 128) == 0) {
                    if ((29360128 & i) == 0) {
                        i6 = startRestartGroup.changedInstance(content) ? 8388608 : 4194304;
                    }
                    if ((23967451 & i3) == 4793490 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            if (i12 != 0) {
                                companion = Modifier.Companion;
                            }
                            if (i4 != 0) {
                                z2 = true;
                            }
                            Shape shape7 = shape2;
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                                shape7 = IconButtonDefaults.INSTANCE.getOutlinedShape(startRestartGroup, 6);
                            }
                            if ((i2 & 16) == 0) {
                                i7 = 1;
                                i3 &= -57345;
                                obj = IconButtonDefaults.INSTANCE.m1825outlinedIconButtonColorsro_MJ88(0L, 0L, 0L, 0L, startRestartGroup, 24576, 15);
                            } else {
                                i7 = 1;
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                                obj2 = IconButtonDefaults.INSTANCE.outlinedIconButtonBorder(z2, startRestartGroup, ((i3 >> 6) & 14) | 48);
                            }
                            if (i5 == 0) {
                                startRestartGroup.startReplaceableGroup(-492369756);
                                ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                                Object rememberedValue = startRestartGroup.rememberedValue();
                                if (rememberedValue == Composer.Companion.getEmpty()) {
                                    rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                startRestartGroup.endReplaceableGroup();
                                obj4 = (MutableInteractionSource) rememberedValue;
                            } else {
                                obj4 = mutableInteractionSource;
                            }
                            modifier2 = companion;
                            z3 = z2;
                            shape3 = shape7;
                            iconButtonColors2 = obj;
                            obj5 = obj2;
                            i8 = i3;
                            obj6 = obj4;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                            }
                            modifier2 = companion;
                            shape3 = shape2;
                            obj5 = obj2;
                            i7 = 1;
                            obj6 = obj3;
                            i8 = i3;
                            z3 = z2;
                            iconButtonColors2 = obj;
                        }
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1746603025, i8, -1, "androidx.compose.material3.OutlinedIconButton (IconButton.kt:442)");
                        }
                        int i13 = ((i8 >> 6) & 14) | ((i8 >> 9) & 112);
                        Modifier modifier4 = modifier2;
                        int i14 = i8;
                        int i15 = i14 << 9;
                        IconButtonColors iconButtonColors4 = iconButtonColors2;
                        boolean z5 = z3;
                        composer2 = startRestartGroup;
                        SurfaceKt.m2070Surfaceo_FOJdg(onClick, SemanticsModifierKt.semantics$default(modifier2, false, IconButtonKt$OutlinedIconButton$2.INSTANCE, i7, null), z5, shape3, iconButtonColors2.containerColor$material3_release(z3, startRestartGroup, i13).getValue().m3301unboximpl(), iconButtonColors2.contentColor$material3_release(z3, startRestartGroup, i13).getValue().m3301unboximpl(), 0.0f, 0.0f, obj5, obj6, ComposableLambdaKt.composableLambda(startRestartGroup, 582332538, i7, new IconButtonKt$OutlinedIconButton$3(content, i8)), composer2, (i14 & 14) | (i14 & 896) | (i14 & 7168) | (234881024 & i15) | (i15 & 1879048192), 6, PsExtractor.AUDIO_STREAM);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        shape4 = shape3;
                        borderStroke2 = obj5;
                        mutableInteractionSource2 = obj6;
                        modifier3 = modifier4;
                        iconButtonColors3 = iconButtonColors4;
                        z4 = z5;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        composer2 = startRestartGroup;
                        modifier3 = companion;
                        z4 = z2;
                        shape4 = shape2;
                        iconButtonColors3 = obj;
                        borderStroke2 = obj2;
                        mutableInteractionSource2 = obj3;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                        return;
                    }
                    endRestartGroup.updateScope(new IconButtonKt$OutlinedIconButton$4(onClick, modifier3, z4, shape4, iconButtonColors3, borderStroke2, mutableInteractionSource2, content, i, i2));
                    return;
                }
                i6 = 12582912;
                i3 |= i6;
                if ((23967451 & i3) == 4793490) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i12 != 0) {
                }
                if (i4 != 0) {
                }
                Shape shape72 = shape2;
                if ((i2 & 8) != 0) {
                }
                if ((i2 & 16) == 0) {
                }
                if ((i2 & 32) != 0) {
                }
                if (i5 == 0) {
                }
                modifier2 = companion;
                z3 = z2;
                shape3 = shape72;
                iconButtonColors2 = obj;
                obj5 = obj2;
                i8 = i3;
                obj6 = obj4;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                int i132 = ((i8 >> 6) & 14) | ((i8 >> 9) & 112);
                Modifier modifier42 = modifier2;
                int i142 = i8;
                int i152 = i142 << 9;
                IconButtonColors iconButtonColors42 = iconButtonColors2;
                boolean z52 = z3;
                composer2 = startRestartGroup;
                SurfaceKt.m2070Surfaceo_FOJdg(onClick, SemanticsModifierKt.semantics$default(modifier2, false, IconButtonKt$OutlinedIconButton$2.INSTANCE, i7, null), z52, shape3, iconButtonColors2.containerColor$material3_release(z3, startRestartGroup, i132).getValue().m3301unboximpl(), iconButtonColors2.contentColor$material3_release(z3, startRestartGroup, i132).getValue().m3301unboximpl(), 0.0f, 0.0f, obj5, obj6, ComposableLambdaKt.composableLambda(startRestartGroup, 582332538, i7, new IconButtonKt$OutlinedIconButton$3(content, i8)), composer2, (i142 & 14) | (i142 & 896) | (i142 & 7168) | (234881024 & i152) | (i152 & 1879048192), 6, PsExtractor.AUDIO_STREAM);
                if (ComposerKt.isTraceInProgress()) {
                }
                shape4 = shape3;
                borderStroke2 = obj5;
                mutableInteractionSource2 = obj6;
                modifier3 = modifier42;
                iconButtonColors3 = iconButtonColors42;
                z4 = z52;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            z2 = z;
            if ((i & 7168) == 0) {
            }
            if ((57344 & i) == 0) {
            }
            if ((458752 & i) == 0) {
            }
            i5 = i2 & 64;
            if (i5 != 0) {
            }
            if ((i2 & 128) == 0) {
            }
            i3 |= i6;
            if ((23967451 & i3) == 4793490) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i12 != 0) {
            }
            if (i4 != 0) {
            }
            Shape shape722 = shape2;
            if ((i2 & 8) != 0) {
            }
            if ((i2 & 16) == 0) {
            }
            if ((i2 & 32) != 0) {
            }
            if (i5 == 0) {
            }
            modifier2 = companion;
            z3 = z2;
            shape3 = shape722;
            iconButtonColors2 = obj;
            obj5 = obj2;
            i8 = i3;
            obj6 = obj4;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            int i1322 = ((i8 >> 6) & 14) | ((i8 >> 9) & 112);
            Modifier modifier422 = modifier2;
            int i1422 = i8;
            int i1522 = i1422 << 9;
            IconButtonColors iconButtonColors422 = iconButtonColors2;
            boolean z522 = z3;
            composer2 = startRestartGroup;
            SurfaceKt.m2070Surfaceo_FOJdg(onClick, SemanticsModifierKt.semantics$default(modifier2, false, IconButtonKt$OutlinedIconButton$2.INSTANCE, i7, null), z522, shape3, iconButtonColors2.containerColor$material3_release(z3, startRestartGroup, i1322).getValue().m3301unboximpl(), iconButtonColors2.contentColor$material3_release(z3, startRestartGroup, i1322).getValue().m3301unboximpl(), 0.0f, 0.0f, obj5, obj6, ComposableLambdaKt.composableLambda(startRestartGroup, 582332538, i7, new IconButtonKt$OutlinedIconButton$3(content, i8)), composer2, (i1422 & 14) | (i1422 & 896) | (i1422 & 7168) | (234881024 & i1522) | (i1522 & 1879048192), 6, PsExtractor.AUDIO_STREAM);
            if (ComposerKt.isTraceInProgress()) {
            }
            shape4 = shape3;
            borderStroke2 = obj5;
            mutableInteractionSource2 = obj6;
            modifier3 = modifier422;
            iconButtonColors3 = iconButtonColors422;
            z4 = z522;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        companion = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z2 = z;
        if ((i & 7168) == 0) {
        }
        if ((57344 & i) == 0) {
        }
        if ((458752 & i) == 0) {
        }
        i5 = i2 & 64;
        if (i5 != 0) {
        }
        if ((i2 & 128) == 0) {
        }
        i3 |= i6;
        if ((23967451 & i3) == 4793490) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i12 != 0) {
        }
        if (i4 != 0) {
        }
        Shape shape7222 = shape2;
        if ((i2 & 8) != 0) {
        }
        if ((i2 & 16) == 0) {
        }
        if ((i2 & 32) != 0) {
        }
        if (i5 == 0) {
        }
        modifier2 = companion;
        z3 = z2;
        shape3 = shape7222;
        iconButtonColors2 = obj;
        obj5 = obj2;
        i8 = i3;
        obj6 = obj4;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        int i13222 = ((i8 >> 6) & 14) | ((i8 >> 9) & 112);
        Modifier modifier4222 = modifier2;
        int i14222 = i8;
        int i15222 = i14222 << 9;
        IconButtonColors iconButtonColors4222 = iconButtonColors2;
        boolean z5222 = z3;
        composer2 = startRestartGroup;
        SurfaceKt.m2070Surfaceo_FOJdg(onClick, SemanticsModifierKt.semantics$default(modifier2, false, IconButtonKt$OutlinedIconButton$2.INSTANCE, i7, null), z5222, shape3, iconButtonColors2.containerColor$material3_release(z3, startRestartGroup, i13222).getValue().m3301unboximpl(), iconButtonColors2.contentColor$material3_release(z3, startRestartGroup, i13222).getValue().m3301unboximpl(), 0.0f, 0.0f, obj5, obj6, ComposableLambdaKt.composableLambda(startRestartGroup, 582332538, i7, new IconButtonKt$OutlinedIconButton$3(content, i8)), composer2, (i14222 & 14) | (i14222 & 896) | (i14222 & 7168) | (234881024 & i15222) | (i15222 & 1879048192), 6, PsExtractor.AUDIO_STREAM);
        if (ComposerKt.isTraceInProgress()) {
        }
        shape4 = shape3;
        borderStroke2 = obj5;
        mutableInteractionSource2 = obj6;
        modifier3 = modifier4222;
        iconButtonColors3 = iconButtonColors4222;
        z4 = z5222;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:154:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OutlinedIconToggleButton(boolean z, Function1<? super Boolean, Unit> onCheckedChange, Modifier modifier, boolean z2, Shape shape, IconToggleButtonColors iconToggleButtonColors, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, Function2<? super Composer, ? super Integer, Unit> content, Composer composer, int i, int i2) {
        int i3;
        int i4;
        boolean z3;
        Shape shape2;
        Object obj;
        BorderStroke borderStroke2;
        int i5;
        int i6;
        Modifier.Companion companion;
        Shape shape3;
        int i7;
        IconToggleButtonColors iconToggleButtonColors2;
        MutableInteractionSource mutableInteractionSource2;
        int i8;
        Shape shape4;
        boolean z4;
        Object obj2;
        IconToggleButtonColors iconToggleButtonColors3;
        Composer composer2;
        Shape shape5;
        BorderStroke borderStroke3;
        MutableInteractionSource mutableInteractionSource3;
        Modifier modifier2;
        IconToggleButtonColors iconToggleButtonColors4;
        boolean z5;
        ScopeUpdateScope endRestartGroup;
        int i9;
        int i10;
        int i11;
        Intrinsics.checkNotNullParameter(onCheckedChange, "onCheckedChange");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(1470292106);
        ComposerKt.sourceInformation(startRestartGroup, "C(OutlinedIconToggleButton)P(1,7,6,4,8,2!1,5)508@25156L13,509@25227L32,510@25308L48,511@25408L39,519@25681L32,520@25747L30,513@25489L523:IconButton.kt#uh7d8r");
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
            i3 |= startRestartGroup.changedInstance(onCheckedChange) ? 32 : 16;
        }
        int i12 = i2 & 4;
        if (i12 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
            } else if ((i & 7168) == 0) {
                z3 = z2;
                i3 |= startRestartGroup.changed(z3) ? 2048 : 1024;
                if ((i & 57344) == 0) {
                    if ((i2 & 16) == 0) {
                        shape2 = shape;
                        if (startRestartGroup.changed(shape2)) {
                            i11 = 16384;
                            i3 |= i11;
                        }
                    } else {
                        shape2 = shape;
                    }
                    i11 = 8192;
                    i3 |= i11;
                } else {
                    shape2 = shape;
                }
                if ((458752 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        obj = iconToggleButtonColors;
                        if (startRestartGroup.changed(obj)) {
                            i10 = 131072;
                            i3 |= i10;
                        }
                    } else {
                        obj = iconToggleButtonColors;
                    }
                    i10 = 65536;
                    i3 |= i10;
                } else {
                    obj = iconToggleButtonColors;
                }
                if ((3670016 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        borderStroke2 = borderStroke;
                        if (startRestartGroup.changed(borderStroke2)) {
                            i9 = 1048576;
                            i3 |= i9;
                        }
                    } else {
                        borderStroke2 = borderStroke;
                    }
                    i9 = 524288;
                    i3 |= i9;
                } else {
                    borderStroke2 = borderStroke;
                }
                i5 = i2 & 128;
                if (i5 != 0) {
                    i3 |= 12582912;
                } else if ((i & 29360128) == 0) {
                    i3 |= startRestartGroup.changed(mutableInteractionSource) ? 8388608 : 4194304;
                }
                if ((i2 & 256) == 0) {
                    if ((234881024 & i) == 0) {
                        i6 = startRestartGroup.changedInstance(content) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                    }
                    if ((191739611 & i3) == 38347922 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            companion = i12 == 0 ? Modifier.Companion : modifier;
                            if (i4 != 0) {
                                z3 = true;
                            }
                            if ((i2 & 16) == 0) {
                                shape3 = IconButtonDefaults.INSTANCE.getOutlinedShape(startRestartGroup, 6);
                                i3 &= -57345;
                            } else {
                                shape3 = shape2;
                            }
                            if ((i2 & 32) == 0) {
                                i7 = i5;
                                iconToggleButtonColors2 = IconButtonDefaults.INSTANCE.m1826outlinedIconToggleButtonColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, startRestartGroup, 1572864, 63);
                                i3 &= -458753;
                            } else {
                                i7 = i5;
                                iconToggleButtonColors2 = iconToggleButtonColors;
                            }
                            if ((i2 & 64) != 0) {
                                borderStroke2 = IconButtonDefaults.INSTANCE.outlinedIconToggleButtonBorder(z3, z, startRestartGroup, ((i3 >> 9) & 14) | 384 | ((i3 << 3) & 112));
                                i3 &= -3670017;
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
                                i8 = i3;
                                shape4 = shape3;
                                mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
                            } else {
                                mutableInteractionSource2 = mutableInteractionSource;
                                i8 = i3;
                                shape4 = shape3;
                            }
                            z4 = z3;
                            obj2 = borderStroke2;
                            iconToggleButtonColors3 = iconToggleButtonColors2;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                            }
                            companion = modifier;
                            mutableInteractionSource2 = mutableInteractionSource;
                            z4 = z3;
                            shape4 = shape2;
                            obj2 = borderStroke2;
                            iconToggleButtonColors3 = iconToggleButtonColors;
                            i8 = i3;
                        }
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1470292106, i8, -1, "androidx.compose.material3.OutlinedIconToggleButton (IconButton.kt:503)");
                        }
                        int i13 = i8 >> 9;
                        int i14 = (i13 & 14) | ((i8 << 3) & 112) | (i13 & 896);
                        int i15 = i8;
                        Modifier modifier3 = companion;
                        IconToggleButtonColors iconToggleButtonColors5 = iconToggleButtonColors3;
                        boolean z6 = z4;
                        composer2 = startRestartGroup;
                        SurfaceKt.m2069Surfaced85dljk(z, onCheckedChange, SemanticsModifierKt.semantics$default(companion, false, IconButtonKt$OutlinedIconToggleButton$2.INSTANCE, 1, null), z6, shape4, iconToggleButtonColors3.containerColor$material3_release(z4, z, startRestartGroup, i14).getValue().m3301unboximpl(), iconToggleButtonColors3.contentColor$material3_release(z4, z, startRestartGroup, i14).getValue().m3301unboximpl(), 0.0f, 0.0f, obj2, mutableInteractionSource2, ComposableLambdaKt.composableLambda(startRestartGroup, 1207657396, true, new IconButtonKt$OutlinedIconToggleButton$3(content, i15)), composer2, (i15 & 14) | (i15 & 112) | (i15 & 7168) | (i15 & 57344) | (1879048192 & (i15 << 9)), ((i15 >> 21) & 14) | 48, 384);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        shape5 = shape4;
                        borderStroke3 = obj2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        modifier2 = modifier3;
                        iconToggleButtonColors4 = iconToggleButtonColors5;
                        z5 = z6;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier2 = modifier;
                        composer2 = startRestartGroup;
                        z5 = z3;
                        shape5 = shape2;
                        iconToggleButtonColors4 = obj;
                        borderStroke3 = borderStroke2;
                        mutableInteractionSource3 = mutableInteractionSource;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                        return;
                    }
                    endRestartGroup.updateScope(new IconButtonKt$OutlinedIconToggleButton$4(z, onCheckedChange, modifier2, z5, shape5, iconToggleButtonColors4, borderStroke3, mutableInteractionSource3, content, i, i2));
                    return;
                }
                i6 = 100663296;
                i3 |= i6;
                if ((191739611 & i3) == 38347922) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i12 == 0) {
                }
                if (i4 != 0) {
                }
                if ((i2 & 16) == 0) {
                }
                if ((i2 & 32) == 0) {
                }
                if ((i2 & 64) != 0) {
                }
                if (i7 == 0) {
                }
                z4 = z3;
                obj2 = borderStroke2;
                iconToggleButtonColors3 = iconToggleButtonColors2;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                int i132 = i8 >> 9;
                int i142 = (i132 & 14) | ((i8 << 3) & 112) | (i132 & 896);
                int i152 = i8;
                Modifier modifier32 = companion;
                IconToggleButtonColors iconToggleButtonColors52 = iconToggleButtonColors3;
                boolean z62 = z4;
                composer2 = startRestartGroup;
                SurfaceKt.m2069Surfaced85dljk(z, onCheckedChange, SemanticsModifierKt.semantics$default(companion, false, IconButtonKt$OutlinedIconToggleButton$2.INSTANCE, 1, null), z62, shape4, iconToggleButtonColors3.containerColor$material3_release(z4, z, startRestartGroup, i142).getValue().m3301unboximpl(), iconToggleButtonColors3.contentColor$material3_release(z4, z, startRestartGroup, i142).getValue().m3301unboximpl(), 0.0f, 0.0f, obj2, mutableInteractionSource2, ComposableLambdaKt.composableLambda(startRestartGroup, 1207657396, true, new IconButtonKt$OutlinedIconToggleButton$3(content, i152)), composer2, (i152 & 14) | (i152 & 112) | (i152 & 7168) | (i152 & 57344) | (1879048192 & (i152 << 9)), ((i152 >> 21) & 14) | 48, 384);
                if (ComposerKt.isTraceInProgress()) {
                }
                shape5 = shape4;
                borderStroke3 = obj2;
                mutableInteractionSource3 = mutableInteractionSource2;
                modifier2 = modifier32;
                iconToggleButtonColors4 = iconToggleButtonColors52;
                z5 = z62;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            z3 = z2;
            if ((i & 57344) == 0) {
            }
            if ((458752 & i) == 0) {
            }
            if ((3670016 & i) == 0) {
            }
            i5 = i2 & 128;
            if (i5 != 0) {
            }
            if ((i2 & 256) == 0) {
            }
            i3 |= i6;
            if ((191739611 & i3) == 38347922) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i12 == 0) {
            }
            if (i4 != 0) {
            }
            if ((i2 & 16) == 0) {
            }
            if ((i2 & 32) == 0) {
            }
            if ((i2 & 64) != 0) {
            }
            if (i7 == 0) {
            }
            z4 = z3;
            obj2 = borderStroke2;
            iconToggleButtonColors3 = iconToggleButtonColors2;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            int i1322 = i8 >> 9;
            int i1422 = (i1322 & 14) | ((i8 << 3) & 112) | (i1322 & 896);
            int i1522 = i8;
            Modifier modifier322 = companion;
            IconToggleButtonColors iconToggleButtonColors522 = iconToggleButtonColors3;
            boolean z622 = z4;
            composer2 = startRestartGroup;
            SurfaceKt.m2069Surfaced85dljk(z, onCheckedChange, SemanticsModifierKt.semantics$default(companion, false, IconButtonKt$OutlinedIconToggleButton$2.INSTANCE, 1, null), z622, shape4, iconToggleButtonColors3.containerColor$material3_release(z4, z, startRestartGroup, i1422).getValue().m3301unboximpl(), iconToggleButtonColors3.contentColor$material3_release(z4, z, startRestartGroup, i1422).getValue().m3301unboximpl(), 0.0f, 0.0f, obj2, mutableInteractionSource2, ComposableLambdaKt.composableLambda(startRestartGroup, 1207657396, true, new IconButtonKt$OutlinedIconToggleButton$3(content, i1522)), composer2, (i1522 & 14) | (i1522 & 112) | (i1522 & 7168) | (i1522 & 57344) | (1879048192 & (i1522 << 9)), ((i1522 >> 21) & 14) | 48, 384);
            if (ComposerKt.isTraceInProgress()) {
            }
            shape5 = shape4;
            borderStroke3 = obj2;
            mutableInteractionSource3 = mutableInteractionSource2;
            modifier2 = modifier322;
            iconToggleButtonColors4 = iconToggleButtonColors522;
            z5 = z622;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z3 = z2;
        if ((i & 57344) == 0) {
        }
        if ((458752 & i) == 0) {
        }
        if ((3670016 & i) == 0) {
        }
        i5 = i2 & 128;
        if (i5 != 0) {
        }
        if ((i2 & 256) == 0) {
        }
        i3 |= i6;
        if ((191739611 & i3) == 38347922) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i12 == 0) {
        }
        if (i4 != 0) {
        }
        if ((i2 & 16) == 0) {
        }
        if ((i2 & 32) == 0) {
        }
        if ((i2 & 64) != 0) {
        }
        if (i7 == 0) {
        }
        z4 = z3;
        obj2 = borderStroke2;
        iconToggleButtonColors3 = iconToggleButtonColors2;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        int i13222 = i8 >> 9;
        int i14222 = (i13222 & 14) | ((i8 << 3) & 112) | (i13222 & 896);
        int i15222 = i8;
        Modifier modifier3222 = companion;
        IconToggleButtonColors iconToggleButtonColors5222 = iconToggleButtonColors3;
        boolean z6222 = z4;
        composer2 = startRestartGroup;
        SurfaceKt.m2069Surfaced85dljk(z, onCheckedChange, SemanticsModifierKt.semantics$default(companion, false, IconButtonKt$OutlinedIconToggleButton$2.INSTANCE, 1, null), z6222, shape4, iconToggleButtonColors3.containerColor$material3_release(z4, z, startRestartGroup, i14222).getValue().m3301unboximpl(), iconToggleButtonColors3.contentColor$material3_release(z4, z, startRestartGroup, i14222).getValue().m3301unboximpl(), 0.0f, 0.0f, obj2, mutableInteractionSource2, ComposableLambdaKt.composableLambda(startRestartGroup, 1207657396, true, new IconButtonKt$OutlinedIconToggleButton$3(content, i15222)), composer2, (i15222 & 14) | (i15222 & 112) | (i15222 & 7168) | (i15222 & 57344) | (1879048192 & (i15222 << 9)), ((i15222 >> 21) & 14) | 48, 384);
        if (ComposerKt.isTraceInProgress()) {
        }
        shape5 = shape4;
        borderStroke3 = obj2;
        mutableInteractionSource3 = mutableInteractionSource2;
        modifier2 = modifier3222;
        iconToggleButtonColors4 = iconToggleButtonColors5222;
        z5 = z6222;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }
}
