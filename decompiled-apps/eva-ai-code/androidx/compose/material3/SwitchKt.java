package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteractionKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.ToggleableKt;
import androidx.compose.material.ripple.RippleKt;
import androidx.compose.material3.tokens.SwitchTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.ifriend.keychain.cipherStorage.CipherStorageKeystoreRsaEcb;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: Switch.kt */
@Metadata(d1 = {"\u0000^\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aj\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u0015\b\u0002\u0010\u0016\u001a\u000f\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0017¢\u0006\u0002\b\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u00112\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001dH\u0007¢\u0006\u0002\u0010\u001e\u001a|\u0010\u001f\u001a\u00020\u000f*\u00020 2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u001b2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00020\"2\u0013\u0010\u0016\u001a\u000f\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0017¢\u0006\u0002\b\u00182\u0006\u0010\u001c\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00042\u0006\u0010'\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u0004H\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b)\u0010*\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0013\u0010\u0003\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0005\"\u0013\u0010\u0006\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0005\"\u0019\u0010\u0007\u001a\u00020\u0004X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0005\u001a\u0004\b\b\u0010\t\"\u0013\u0010\n\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0005\"\u0013\u0010\u000b\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0005\"\u0019\u0010\f\u001a\u00020\u0004X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0005\u001a\u0004\b\r\u0010\t\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006+"}, d2 = {"AnimationSpec", "Landroidx/compose/animation/core/TweenSpec;", "", "SwitchHeight", "Landroidx/compose/ui/unit/Dp;", "F", "SwitchWidth", "ThumbDiameter", "getThumbDiameter", "()F", "ThumbPadding", "ThumbPathLength", "UncheckedThumbDiameter", "getUncheckedThumbDiameter", "Switch", "", "checked", "", "onCheckedChange", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "thumbContent", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "enabled", "colors", "Landroidx/compose/material3/SwitchColors;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/material3/SwitchColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "SwitchImpl", "Landroidx/compose/foundation/layout/BoxScope;", "thumbValue", "Landroidx/compose/runtime/State;", "Landroidx/compose/foundation/interaction/InteractionSource;", "thumbShape", "Landroidx/compose/ui/graphics/Shape;", "uncheckedThumbDiameter", "minBound", "maxBound", "SwitchImpl-0DmnUew", "(Landroidx/compose/foundation/layout/BoxScope;ZZLandroidx/compose/material3/SwitchColors;Landroidx/compose/runtime/State;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/ui/graphics/Shape;FFFLandroidx/compose/runtime/Composer;II)V", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SwitchKt {
    private static final TweenSpec<Float> AnimationSpec;
    private static final float SwitchHeight;
    private static final float SwitchWidth;
    private static final float ThumbDiameter;
    private static final float ThumbPadding;
    private static final float ThumbPathLength;
    private static final float UncheckedThumbDiameter;

    /* JADX WARN: Removed duplicated region for block: B:100:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0456  */
    /* JADX WARN: Removed duplicated region for block: B:154:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x012b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Switch(boolean z, Function1<? super Boolean, Unit> function1, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, boolean z2, SwitchColors switchColors, MutableInteractionSource mutableInteractionSource, Composer composer, int i, int i2) {
        int i3;
        Object obj;
        int i4;
        Object obj2;
        int i5;
        boolean z3;
        Object obj3;
        int i6;
        Object obj4;
        boolean z4;
        String str;
        SwitchColors switchColors2;
        Object obj5;
        Modifier modifier2;
        Object obj6;
        Object obj7;
        int i7;
        float f;
        boolean changed;
        SwitchKt$Switch$valueToOffset$1$1 rememberedValue;
        Object rememberedValue2;
        Object rememberedValue3;
        Animatable animatable;
        Composer composer2;
        Object obj8;
        Modifier.Companion companion;
        Modifier.Companion companion2;
        Composer composer3;
        Function2<? super Composer, ? super Integer, Unit> function22;
        SwitchColors switchColors3;
        boolean z5;
        ScopeUpdateScope endRestartGroup;
        int i8;
        Composer startRestartGroup = composer.startRestartGroup(1580463220);
        ComposerKt.sourceInformation(startRestartGroup, "C(Switch)P(!1,5,4,6,2)96@4503L8,97@4563L39,*106@4851L7,107@4926L7,108@4986L111,113@5161L36,114@5214L24,116@5244L156,121@5406L216,145@6082L848:Switch.kt#uh7d8r");
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
            i3 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i9 = i2 & 4;
        if (i9 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            obj = modifier;
            i3 |= startRestartGroup.changed(obj) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
            } else if ((i & 7168) == 0) {
                obj2 = function2;
                i3 |= startRestartGroup.changedInstance(obj2) ? 2048 : 1024;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((57344 & i) == 0) {
                    z3 = z2;
                    i3 |= startRestartGroup.changed(z3) ? 16384 : 8192;
                    if ((i & 458752) != 0) {
                        if ((i2 & 32) == 0) {
                            obj3 = switchColors;
                            if (startRestartGroup.changed(obj3)) {
                                i8 = 131072;
                                i3 |= i8;
                            }
                        } else {
                            obj3 = switchColors;
                        }
                        i8 = 65536;
                        i3 |= i8;
                    } else {
                        obj3 = switchColors;
                    }
                    i6 = i2 & 64;
                    if (i6 == 0) {
                        i3 |= 1572864;
                    } else if ((i & 3670016) == 0) {
                        obj4 = mutableInteractionSource;
                        i3 |= startRestartGroup.changed(obj4) ? 1048576 : 524288;
                        if ((2995931 & i3) == 599186 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                Modifier.Companion companion3 = i9 != 0 ? Modifier.Companion : modifier;
                                Object obj9 = i4 != 0 ? null : obj2;
                                z4 = i5 != 0 ? true : z3;
                                if ((i2 & 32) != 0) {
                                    str = "CC(remember):Composables.kt#9igjgp";
                                    switchColors2 = SwitchDefaults.INSTANCE.m2087colorsV1nXRL4(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, startRestartGroup, 0, 1572864, 65535);
                                    i3 &= -458753;
                                } else {
                                    str = "CC(remember):Composables.kt#9igjgp";
                                    switchColors2 = obj3;
                                }
                                if (i6 != 0) {
                                    startRestartGroup.startReplaceableGroup(-492369756);
                                    ComposerKt.sourceInformation(startRestartGroup, str);
                                    Object rememberedValue4 = startRestartGroup.rememberedValue();
                                    if (rememberedValue4 == Composer.Companion.getEmpty()) {
                                        rememberedValue4 = InteractionSourceKt.MutableInteractionSource();
                                        startRestartGroup.updateRememberedValue(rememberedValue4);
                                    }
                                    startRestartGroup.endReplaceableGroup();
                                    modifier2 = companion3;
                                    obj6 = obj9;
                                    obj7 = switchColors2;
                                    obj5 = (MutableInteractionSource) rememberedValue4;
                                } else {
                                    obj5 = mutableInteractionSource;
                                    modifier2 = companion3;
                                    obj6 = obj9;
                                    obj7 = switchColors2;
                                }
                                i7 = i3;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i2 & 32) != 0) {
                                    i3 &= -458753;
                                }
                                i7 = i3;
                                obj6 = obj2;
                                z4 = z3;
                                obj7 = obj3;
                                obj5 = obj4;
                                str = "CC(remember):Composables.kt#9igjgp";
                                modifier2 = modifier;
                            }
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1580463220, i7, -1, "androidx.compose.material3.Switch (Switch.kt:90)");
                            }
                            if (obj6 == null) {
                                f = UncheckedThumbDiameter;
                            } else {
                                f = ThumbDiameter;
                            }
                            float f2 = f;
                            float f3 = SwitchHeight;
                            float m5607constructorimpl = Dp.m5607constructorimpl(Dp.m5607constructorimpl(f3 - f2) / 2);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                            Object consume = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            float mo588toPx0680j_4 = ((Density) consume).mo588toPx0680j_4(m5607constructorimpl);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                            Object consume2 = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            float f4 = ThumbPathLength;
                            float mo588toPx0680j_42 = ((Density) consume2).mo588toPx0680j_4(f4);
                            Float valueOf = Float.valueOf(mo588toPx0680j_4);
                            Float valueOf2 = Float.valueOf(mo588toPx0680j_42);
                            startRestartGroup.startReplaceableGroup(511388516);
                            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
                            changed = startRestartGroup.changed(valueOf) | startRestartGroup.changed(valueOf2);
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (!changed || rememberedValue == Composer.Companion.getEmpty()) {
                                rememberedValue = new SwitchKt$Switch$valueToOffset$1$1(mo588toPx0680j_42, mo588toPx0680j_4);
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            startRestartGroup.endReplaceableGroup();
                            float floatValue = ((Number) ((Function1) rememberedValue).invoke(Boolean.valueOf(z))).floatValue();
                            startRestartGroup.startReplaceableGroup(-492369756);
                            ComposerKt.sourceInformation(startRestartGroup, str);
                            rememberedValue2 = startRestartGroup.rememberedValue();
                            if (rememberedValue2 == Composer.Companion.getEmpty()) {
                                rememberedValue2 = AnimatableKt.Animatable$default(floatValue, 0.0f, 2, null);
                                startRestartGroup.updateRememberedValue(rememberedValue2);
                            }
                            startRestartGroup.endReplaceableGroup();
                            Animatable animatable2 = (Animatable) rememberedValue2;
                            startRestartGroup.startReplaceableGroup(773894976);
                            ComposerKt.sourceInformation(startRestartGroup, "CC(rememberCoroutineScope)476@19869L144:Effects.kt#9igjgp");
                            startRestartGroup.startReplaceableGroup(-492369756);
                            ComposerKt.sourceInformation(startRestartGroup, str);
                            rememberedValue3 = startRestartGroup.rememberedValue();
                            if (rememberedValue3 == Composer.Companion.getEmpty()) {
                                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, startRestartGroup));
                                startRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                                rememberedValue3 = compositionScopedCoroutineScopeCanceller;
                            }
                            startRestartGroup.endReplaceableGroup();
                            CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue3).getCoroutineScope();
                            startRestartGroup.endReplaceableGroup();
                            EffectsKt.SideEffect(new SwitchKt$Switch$2(animatable2, mo588toPx0680j_4), startRestartGroup, 0);
                            EffectsKt.DisposableEffect(Boolean.valueOf(z), new SwitchKt$Switch$3(animatable2, floatValue, coroutineScope), startRestartGroup, i7 & 14);
                            if (function1 != null) {
                                obj8 = null;
                                animatable = animatable2;
                                composer2 = startRestartGroup;
                                companion = ToggleableKt.m984toggleableO2vRcR0(Modifier.Companion, z, obj5, null, z4, Role.m4917boximpl(Role.Companion.m4929getSwitcho7Vup1c()), function1);
                            } else {
                                animatable = animatable2;
                                composer2 = startRestartGroup;
                                obj8 = null;
                                companion = Modifier.Companion;
                            }
                            if (function1 != null) {
                                companion2 = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.Companion);
                            } else {
                                companion2 = Modifier.Companion;
                            }
                            Modifier m789requiredSizeVpY3zN4 = SizeKt.m789requiredSizeVpY3zN4(SizeKt.wrapContentSize$default(modifier2.then(companion2).then(companion), Alignment.Companion.getCenter(), false, 2, obj8), SwitchWidth, f3);
                            composer3 = composer2;
                            composer3.startReplaceableGroup(733328855);
                            ComposerKt.sourceInformation(composer3, "CC(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, composer3, 0);
                            composer3.startReplaceableGroup(-1323940314);
                            ComposerKt.sourceInformation(composer3, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                            ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            Object consume3 = composer3.consume(CompositionLocalsKt.getLocalDensity());
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            Density density = (Density) consume3;
                            ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            Object consume4 = composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            LayoutDirection layoutDirection = (LayoutDirection) consume4;
                            ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            Object consume5 = composer3.consume(CompositionLocalsKt.getLocalViewConfiguration());
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            ViewConfiguration viewConfiguration = (ViewConfiguration) consume5;
                            Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(m789requiredSizeVpY3zN4);
                            if (!(composer3.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer3.createNode(constructor);
                            } else {
                                composer3.useNode();
                            }
                            composer3.disableReusing();
                            Composer m2893constructorimpl = Updater.m2893constructorimpl(composer3);
                            Updater.m2900setimpl(m2893constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                            Updater.m2900setimpl(m2893constructorimpl, density, ComposeUiNode.Companion.getSetDensity());
                            Updater.m2900setimpl(m2893constructorimpl, layoutDirection, ComposeUiNode.Companion.getSetLayoutDirection());
                            Updater.m2900setimpl(m2893constructorimpl, viewConfiguration, ComposeUiNode.Companion.getSetViewConfiguration());
                            composer3.enableReusing();
                            materializerOf.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(composer3)), composer3, 0);
                            composer3.startReplaceableGroup(2058660585);
                            ComposerKt.sourceInformationMarkerStart(composer3, -1253629305, "C72@3384L9:Box.kt#2w3rfo");
                            ComposerKt.sourceInformationMarkerStart(composer3, -1873061389, "C164@6720L9,158@6473L451:Switch.kt#uh7d8r");
                            int i10 = i7 >> 6;
                            boolean z6 = z4;
                            SwitchColors switchColors4 = obj7;
                            Function2<? super Composer, ? super Integer, Unit> function23 = obj6;
                            Modifier modifier3 = modifier2;
                            m2089SwitchImpl0DmnUew(BoxScopeInstance.INSTANCE, z, z6, switchColors4, animatable.asState(), function23, (InteractionSource) obj5, ShapesKt.toShape(SwitchTokens.INSTANCE.getHandleShape(), composer3, 6), f2, m5607constructorimpl, f4, composer3, 6 | ((i7 << 3) & 112) | (i10 & 896) | (i10 & 7168) | ((i7 << 6) & 458752) | (i7 & 3670016), 6);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            composer3.endReplaceableGroup();
                            composer3.endNode();
                            composer3.endReplaceableGroup();
                            composer3.endReplaceableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            obj = modifier3;
                            function22 = obj6;
                            switchColors3 = obj7;
                            z5 = z4;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            composer3 = startRestartGroup;
                            function22 = obj2;
                            z5 = z3;
                            switchColors3 = obj3;
                            obj5 = obj4;
                        }
                        endRestartGroup = composer3.endRestartGroup();
                        if (endRestartGroup == null) {
                            return;
                        }
                        endRestartGroup.updateScope(new SwitchKt$Switch$5(z, function1, obj, function22, z5, switchColors3, obj5, i, i2));
                        return;
                    }
                    obj4 = mutableInteractionSource;
                    if ((2995931 & i3) == 599186) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i9 != 0) {
                    }
                    if (i4 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if ((i2 & 32) != 0) {
                    }
                    if (i6 != 0) {
                    }
                    i7 = i3;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    if (obj6 == null) {
                    }
                    float f22 = f;
                    float f32 = SwitchHeight;
                    float m5607constructorimpl2 = Dp.m5607constructorimpl(Dp.m5607constructorimpl(f32 - f22) / 2);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object consume6 = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    float mo588toPx0680j_43 = ((Density) consume6).mo588toPx0680j_4(m5607constructorimpl2);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object consume22 = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    float f42 = ThumbPathLength;
                    float mo588toPx0680j_422 = ((Density) consume22).mo588toPx0680j_4(f42);
                    Float valueOf3 = Float.valueOf(mo588toPx0680j_43);
                    Float valueOf22 = Float.valueOf(mo588toPx0680j_422);
                    startRestartGroup.startReplaceableGroup(511388516);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
                    changed = startRestartGroup.changed(valueOf3) | startRestartGroup.changed(valueOf22);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!changed) {
                    }
                    rememberedValue = new SwitchKt$Switch$valueToOffset$1$1(mo588toPx0680j_422, mo588toPx0680j_43);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                    startRestartGroup.endReplaceableGroup();
                    float floatValue2 = ((Number) ((Function1) rememberedValue).invoke(Boolean.valueOf(z))).floatValue();
                    startRestartGroup.startReplaceableGroup(-492369756);
                    ComposerKt.sourceInformation(startRestartGroup, str);
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (rememberedValue2 == Composer.Companion.getEmpty()) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    Animatable animatable22 = (Animatable) rememberedValue2;
                    startRestartGroup.startReplaceableGroup(773894976);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(rememberCoroutineScope)476@19869L144:Effects.kt#9igjgp");
                    startRestartGroup.startReplaceableGroup(-492369756);
                    ComposerKt.sourceInformation(startRestartGroup, str);
                    rememberedValue3 = startRestartGroup.rememberedValue();
                    if (rememberedValue3 == Composer.Companion.getEmpty()) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    CoroutineScope coroutineScope2 = ((CompositionScopedCoroutineScopeCanceller) rememberedValue3).getCoroutineScope();
                    startRestartGroup.endReplaceableGroup();
                    EffectsKt.SideEffect(new SwitchKt$Switch$2(animatable22, mo588toPx0680j_43), startRestartGroup, 0);
                    EffectsKt.DisposableEffect(Boolean.valueOf(z), new SwitchKt$Switch$3(animatable22, floatValue2, coroutineScope2), startRestartGroup, i7 & 14);
                    if (function1 != null) {
                    }
                    if (function1 != null) {
                    }
                    Modifier m789requiredSizeVpY3zN42 = SizeKt.m789requiredSizeVpY3zN4(SizeKt.wrapContentSize$default(modifier2.then(companion2).then(companion), Alignment.Companion.getCenter(), false, 2, obj8), SwitchWidth, f32);
                    composer3 = composer2;
                    composer3.startReplaceableGroup(733328855);
                    ComposerKt.sourceInformation(composer3, "CC(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                    MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, composer3, 0);
                    composer3.startReplaceableGroup(-1323940314);
                    ComposerKt.sourceInformation(composer3, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                    ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    Object consume32 = composer3.consume(CompositionLocalsKt.getLocalDensity());
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    Density density2 = (Density) consume32;
                    ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    Object consume42 = composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    LayoutDirection layoutDirection2 = (LayoutDirection) consume42;
                    ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    Object consume52 = composer3.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ViewConfiguration viewConfiguration2 = (ViewConfiguration) consume52;
                    Function0<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf2 = LayoutKt.materializerOf(m789requiredSizeVpY3zN42);
                    if (!(composer3.getApplier() instanceof Applier)) {
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                    }
                    composer3.disableReusing();
                    Composer m2893constructorimpl2 = Updater.m2893constructorimpl(composer3);
                    Updater.m2900setimpl(m2893constructorimpl2, rememberBoxMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
                    Updater.m2900setimpl(m2893constructorimpl2, density2, ComposeUiNode.Companion.getSetDensity());
                    Updater.m2900setimpl(m2893constructorimpl2, layoutDirection2, ComposeUiNode.Companion.getSetLayoutDirection());
                    Updater.m2900setimpl(m2893constructorimpl2, viewConfiguration2, ComposeUiNode.Companion.getSetViewConfiguration());
                    composer3.enableReusing();
                    materializerOf2.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(composer3)), composer3, 0);
                    composer3.startReplaceableGroup(2058660585);
                    ComposerKt.sourceInformationMarkerStart(composer3, -1253629305, "C72@3384L9:Box.kt#2w3rfo");
                    ComposerKt.sourceInformationMarkerStart(composer3, -1873061389, "C164@6720L9,158@6473L451:Switch.kt#uh7d8r");
                    int i102 = i7 >> 6;
                    boolean z62 = z4;
                    SwitchColors switchColors42 = obj7;
                    Function2<? super Composer, ? super Integer, Unit> function232 = obj6;
                    Modifier modifier32 = modifier2;
                    m2089SwitchImpl0DmnUew(BoxScopeInstance.INSTANCE, z, z62, switchColors42, animatable.asState(), function232, (InteractionSource) obj5, ShapesKt.toShape(SwitchTokens.INSTANCE.getHandleShape(), composer3, 6), f22, m5607constructorimpl2, f42, composer3, 6 | ((i7 << 3) & 112) | (i102 & 896) | (i102 & 7168) | ((i7 << 6) & 458752) | (i7 & 3670016), 6);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    composer3.endReplaceableGroup();
                    composer3.endNode();
                    composer3.endReplaceableGroup();
                    composer3.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    obj = modifier32;
                    function22 = obj6;
                    switchColors3 = obj7;
                    z5 = z4;
                    endRestartGroup = composer3.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                z3 = z2;
                if ((i & 458752) != 0) {
                }
                i6 = i2 & 64;
                if (i6 == 0) {
                }
                obj4 = mutableInteractionSource;
                if ((2995931 & i3) == 599186) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i9 != 0) {
                }
                if (i4 != 0) {
                }
                if (i5 != 0) {
                }
                if ((i2 & 32) != 0) {
                }
                if (i6 != 0) {
                }
                i7 = i3;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                if (obj6 == null) {
                }
                float f222 = f;
                float f322 = SwitchHeight;
                float m5607constructorimpl22 = Dp.m5607constructorimpl(Dp.m5607constructorimpl(f322 - f222) / 2);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume62 = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                float mo588toPx0680j_432 = ((Density) consume62).mo588toPx0680j_4(m5607constructorimpl22);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume222 = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                float f422 = ThumbPathLength;
                float mo588toPx0680j_4222 = ((Density) consume222).mo588toPx0680j_4(f422);
                Float valueOf32 = Float.valueOf(mo588toPx0680j_432);
                Float valueOf222 = Float.valueOf(mo588toPx0680j_4222);
                startRestartGroup.startReplaceableGroup(511388516);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
                changed = startRestartGroup.changed(valueOf32) | startRestartGroup.changed(valueOf222);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!changed) {
                }
                rememberedValue = new SwitchKt$Switch$valueToOffset$1$1(mo588toPx0680j_4222, mo588toPx0680j_432);
                startRestartGroup.updateRememberedValue(rememberedValue);
                startRestartGroup.endReplaceableGroup();
                float floatValue22 = ((Number) ((Function1) rememberedValue).invoke(Boolean.valueOf(z))).floatValue();
                startRestartGroup.startReplaceableGroup(-492369756);
                ComposerKt.sourceInformation(startRestartGroup, str);
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == Composer.Companion.getEmpty()) {
                }
                startRestartGroup.endReplaceableGroup();
                Animatable animatable222 = (Animatable) rememberedValue2;
                startRestartGroup.startReplaceableGroup(773894976);
                ComposerKt.sourceInformation(startRestartGroup, "CC(rememberCoroutineScope)476@19869L144:Effects.kt#9igjgp");
                startRestartGroup.startReplaceableGroup(-492369756);
                ComposerKt.sourceInformation(startRestartGroup, str);
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (rememberedValue3 == Composer.Companion.getEmpty()) {
                }
                startRestartGroup.endReplaceableGroup();
                CoroutineScope coroutineScope22 = ((CompositionScopedCoroutineScopeCanceller) rememberedValue3).getCoroutineScope();
                startRestartGroup.endReplaceableGroup();
                EffectsKt.SideEffect(new SwitchKt$Switch$2(animatable222, mo588toPx0680j_432), startRestartGroup, 0);
                EffectsKt.DisposableEffect(Boolean.valueOf(z), new SwitchKt$Switch$3(animatable222, floatValue22, coroutineScope22), startRestartGroup, i7 & 14);
                if (function1 != null) {
                }
                if (function1 != null) {
                }
                Modifier m789requiredSizeVpY3zN422 = SizeKt.m789requiredSizeVpY3zN4(SizeKt.wrapContentSize$default(modifier2.then(companion2).then(companion), Alignment.Companion.getCenter(), false, 2, obj8), SwitchWidth, f322);
                composer3 = composer2;
                composer3.startReplaceableGroup(733328855);
                ComposerKt.sourceInformation(composer3, "CC(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                MeasurePolicy rememberBoxMeasurePolicy22 = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, composer3, 0);
                composer3.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(composer3, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume322 = composer3.consume(CompositionLocalsKt.getLocalDensity());
                ComposerKt.sourceInformationMarkerEnd(composer3);
                Density density22 = (Density) consume322;
                ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume422 = composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ComposerKt.sourceInformationMarkerEnd(composer3);
                LayoutDirection layoutDirection22 = (LayoutDirection) consume422;
                ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume522 = composer3.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposerKt.sourceInformationMarkerEnd(composer3);
                ViewConfiguration viewConfiguration22 = (ViewConfiguration) consume522;
                Function0<ComposeUiNode> constructor22 = ComposeUiNode.Companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf22 = LayoutKt.materializerOf(m789requiredSizeVpY3zN422);
                if (!(composer3.getApplier() instanceof Applier)) {
                }
                composer3.startReusableNode();
                if (composer3.getInserting()) {
                }
                composer3.disableReusing();
                Composer m2893constructorimpl22 = Updater.m2893constructorimpl(composer3);
                Updater.m2900setimpl(m2893constructorimpl22, rememberBoxMeasurePolicy22, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.m2900setimpl(m2893constructorimpl22, density22, ComposeUiNode.Companion.getSetDensity());
                Updater.m2900setimpl(m2893constructorimpl22, layoutDirection22, ComposeUiNode.Companion.getSetLayoutDirection());
                Updater.m2900setimpl(m2893constructorimpl22, viewConfiguration22, ComposeUiNode.Companion.getSetViewConfiguration());
                composer3.enableReusing();
                materializerOf22.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(composer3)), composer3, 0);
                composer3.startReplaceableGroup(2058660585);
                ComposerKt.sourceInformationMarkerStart(composer3, -1253629305, "C72@3384L9:Box.kt#2w3rfo");
                ComposerKt.sourceInformationMarkerStart(composer3, -1873061389, "C164@6720L9,158@6473L451:Switch.kt#uh7d8r");
                int i1022 = i7 >> 6;
                boolean z622 = z4;
                SwitchColors switchColors422 = obj7;
                Function2<? super Composer, ? super Integer, Unit> function2322 = obj6;
                Modifier modifier322 = modifier2;
                m2089SwitchImpl0DmnUew(BoxScopeInstance.INSTANCE, z, z622, switchColors422, animatable.asState(), function2322, (InteractionSource) obj5, ShapesKt.toShape(SwitchTokens.INSTANCE.getHandleShape(), composer3, 6), f222, m5607constructorimpl22, f422, composer3, 6 | ((i7 << 3) & 112) | (i1022 & 896) | (i1022 & 7168) | ((i7 << 6) & 458752) | (i7 & 3670016), 6);
                ComposerKt.sourceInformationMarkerEnd(composer3);
                ComposerKt.sourceInformationMarkerEnd(composer3);
                composer3.endReplaceableGroup();
                composer3.endNode();
                composer3.endReplaceableGroup();
                composer3.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                }
                obj = modifier322;
                function22 = obj6;
                switchColors3 = obj7;
                z5 = z4;
                endRestartGroup = composer3.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            obj2 = function2;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            z3 = z2;
            if ((i & 458752) != 0) {
            }
            i6 = i2 & 64;
            if (i6 == 0) {
            }
            obj4 = mutableInteractionSource;
            if ((2995931 & i3) == 599186) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i9 != 0) {
            }
            if (i4 != 0) {
            }
            if (i5 != 0) {
            }
            if ((i2 & 32) != 0) {
            }
            if (i6 != 0) {
            }
            i7 = i3;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            if (obj6 == null) {
            }
            float f2222 = f;
            float f3222 = SwitchHeight;
            float m5607constructorimpl222 = Dp.m5607constructorimpl(Dp.m5607constructorimpl(f3222 - f2222) / 2);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume622 = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            float mo588toPx0680j_4322 = ((Density) consume622).mo588toPx0680j_4(m5607constructorimpl222);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume2222 = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            float f4222 = ThumbPathLength;
            float mo588toPx0680j_42222 = ((Density) consume2222).mo588toPx0680j_4(f4222);
            Float valueOf322 = Float.valueOf(mo588toPx0680j_4322);
            Float valueOf2222 = Float.valueOf(mo588toPx0680j_42222);
            startRestartGroup.startReplaceableGroup(511388516);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
            changed = startRestartGroup.changed(valueOf322) | startRestartGroup.changed(valueOf2222);
            rememberedValue = startRestartGroup.rememberedValue();
            if (!changed) {
            }
            rememberedValue = new SwitchKt$Switch$valueToOffset$1$1(mo588toPx0680j_42222, mo588toPx0680j_4322);
            startRestartGroup.updateRememberedValue(rememberedValue);
            startRestartGroup.endReplaceableGroup();
            float floatValue222 = ((Number) ((Function1) rememberedValue).invoke(Boolean.valueOf(z))).floatValue();
            startRestartGroup.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(startRestartGroup, str);
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.Companion.getEmpty()) {
            }
            startRestartGroup.endReplaceableGroup();
            Animatable animatable2222 = (Animatable) rememberedValue2;
            startRestartGroup.startReplaceableGroup(773894976);
            ComposerKt.sourceInformation(startRestartGroup, "CC(rememberCoroutineScope)476@19869L144:Effects.kt#9igjgp");
            startRestartGroup.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(startRestartGroup, str);
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == Composer.Companion.getEmpty()) {
            }
            startRestartGroup.endReplaceableGroup();
            CoroutineScope coroutineScope222 = ((CompositionScopedCoroutineScopeCanceller) rememberedValue3).getCoroutineScope();
            startRestartGroup.endReplaceableGroup();
            EffectsKt.SideEffect(new SwitchKt$Switch$2(animatable2222, mo588toPx0680j_4322), startRestartGroup, 0);
            EffectsKt.DisposableEffect(Boolean.valueOf(z), new SwitchKt$Switch$3(animatable2222, floatValue222, coroutineScope222), startRestartGroup, i7 & 14);
            if (function1 != null) {
            }
            if (function1 != null) {
            }
            Modifier m789requiredSizeVpY3zN4222 = SizeKt.m789requiredSizeVpY3zN4(SizeKt.wrapContentSize$default(modifier2.then(companion2).then(companion), Alignment.Companion.getCenter(), false, 2, obj8), SwitchWidth, f3222);
            composer3 = composer2;
            composer3.startReplaceableGroup(733328855);
            ComposerKt.sourceInformation(composer3, "CC(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
            MeasurePolicy rememberBoxMeasurePolicy222 = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, composer3, 0);
            composer3.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(composer3, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
            ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume3222 = composer3.consume(CompositionLocalsKt.getLocalDensity());
            ComposerKt.sourceInformationMarkerEnd(composer3);
            Density density222 = (Density) consume3222;
            ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume4222 = composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ComposerKt.sourceInformationMarkerEnd(composer3);
            LayoutDirection layoutDirection222 = (LayoutDirection) consume4222;
            ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume5222 = composer3.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposerKt.sourceInformationMarkerEnd(composer3);
            ViewConfiguration viewConfiguration222 = (ViewConfiguration) consume5222;
            Function0<ComposeUiNode> constructor222 = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf222 = LayoutKt.materializerOf(m789requiredSizeVpY3zN4222);
            if (!(composer3.getApplier() instanceof Applier)) {
            }
            composer3.startReusableNode();
            if (composer3.getInserting()) {
            }
            composer3.disableReusing();
            Composer m2893constructorimpl222 = Updater.m2893constructorimpl(composer3);
            Updater.m2900setimpl(m2893constructorimpl222, rememberBoxMeasurePolicy222, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2900setimpl(m2893constructorimpl222, density222, ComposeUiNode.Companion.getSetDensity());
            Updater.m2900setimpl(m2893constructorimpl222, layoutDirection222, ComposeUiNode.Companion.getSetLayoutDirection());
            Updater.m2900setimpl(m2893constructorimpl222, viewConfiguration222, ComposeUiNode.Companion.getSetViewConfiguration());
            composer3.enableReusing();
            materializerOf222.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(composer3)), composer3, 0);
            composer3.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(composer3, -1253629305, "C72@3384L9:Box.kt#2w3rfo");
            ComposerKt.sourceInformationMarkerStart(composer3, -1873061389, "C164@6720L9,158@6473L451:Switch.kt#uh7d8r");
            int i10222 = i7 >> 6;
            boolean z6222 = z4;
            SwitchColors switchColors4222 = obj7;
            Function2<? super Composer, ? super Integer, Unit> function23222 = obj6;
            Modifier modifier3222 = modifier2;
            m2089SwitchImpl0DmnUew(BoxScopeInstance.INSTANCE, z, z6222, switchColors4222, animatable.asState(), function23222, (InteractionSource) obj5, ShapesKt.toShape(SwitchTokens.INSTANCE.getHandleShape(), composer3, 6), f2222, m5607constructorimpl222, f4222, composer3, 6 | ((i7 << 3) & 112) | (i10222 & 896) | (i10222 & 7168) | ((i7 << 6) & 458752) | (i7 & 3670016), 6);
            ComposerKt.sourceInformationMarkerEnd(composer3);
            ComposerKt.sourceInformationMarkerEnd(composer3);
            composer3.endReplaceableGroup();
            composer3.endNode();
            composer3.endReplaceableGroup();
            composer3.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
            }
            obj = modifier3222;
            function22 = obj6;
            switchColors3 = obj7;
            z5 = z4;
            endRestartGroup = composer3.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        obj = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        obj2 = function2;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        z3 = z2;
        if ((i & 458752) != 0) {
        }
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        obj4 = mutableInteractionSource;
        if ((2995931 & i3) == 599186) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i9 != 0) {
        }
        if (i4 != 0) {
        }
        if (i5 != 0) {
        }
        if ((i2 & 32) != 0) {
        }
        if (i6 != 0) {
        }
        i7 = i3;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        if (obj6 == null) {
        }
        float f22222 = f;
        float f32222 = SwitchHeight;
        float m5607constructorimpl2222 = Dp.m5607constructorimpl(Dp.m5607constructorimpl(f32222 - f22222) / 2);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume6222 = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        float mo588toPx0680j_43222 = ((Density) consume6222).mo588toPx0680j_4(m5607constructorimpl2222);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume22222 = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        float f42222 = ThumbPathLength;
        float mo588toPx0680j_422222 = ((Density) consume22222).mo588toPx0680j_4(f42222);
        Float valueOf3222 = Float.valueOf(mo588toPx0680j_43222);
        Float valueOf22222 = Float.valueOf(mo588toPx0680j_422222);
        startRestartGroup.startReplaceableGroup(511388516);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
        changed = startRestartGroup.changed(valueOf3222) | startRestartGroup.changed(valueOf22222);
        rememberedValue = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        rememberedValue = new SwitchKt$Switch$valueToOffset$1$1(mo588toPx0680j_422222, mo588toPx0680j_43222);
        startRestartGroup.updateRememberedValue(rememberedValue);
        startRestartGroup.endReplaceableGroup();
        float floatValue2222 = ((Number) ((Function1) rememberedValue).invoke(Boolean.valueOf(z))).floatValue();
        startRestartGroup.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(startRestartGroup, str);
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (rememberedValue2 == Composer.Companion.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        Animatable animatable22222 = (Animatable) rememberedValue2;
        startRestartGroup.startReplaceableGroup(773894976);
        ComposerKt.sourceInformation(startRestartGroup, "CC(rememberCoroutineScope)476@19869L144:Effects.kt#9igjgp");
        startRestartGroup.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(startRestartGroup, str);
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (rememberedValue3 == Composer.Companion.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        CoroutineScope coroutineScope2222 = ((CompositionScopedCoroutineScopeCanceller) rememberedValue3).getCoroutineScope();
        startRestartGroup.endReplaceableGroup();
        EffectsKt.SideEffect(new SwitchKt$Switch$2(animatable22222, mo588toPx0680j_43222), startRestartGroup, 0);
        EffectsKt.DisposableEffect(Boolean.valueOf(z), new SwitchKt$Switch$3(animatable22222, floatValue2222, coroutineScope2222), startRestartGroup, i7 & 14);
        if (function1 != null) {
        }
        if (function1 != null) {
        }
        Modifier m789requiredSizeVpY3zN42222 = SizeKt.m789requiredSizeVpY3zN4(SizeKt.wrapContentSize$default(modifier2.then(companion2).then(companion), Alignment.Companion.getCenter(), false, 2, obj8), SwitchWidth, f32222);
        composer3 = composer2;
        composer3.startReplaceableGroup(733328855);
        ComposerKt.sourceInformation(composer3, "CC(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
        MeasurePolicy rememberBoxMeasurePolicy2222 = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, composer3, 0);
        composer3.startReplaceableGroup(-1323940314);
        ComposerKt.sourceInformation(composer3, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
        ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
        Object consume32222 = composer3.consume(CompositionLocalsKt.getLocalDensity());
        ComposerKt.sourceInformationMarkerEnd(composer3);
        Density density2222 = (Density) consume32222;
        ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
        Object consume42222 = composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ComposerKt.sourceInformationMarkerEnd(composer3);
        LayoutDirection layoutDirection2222 = (LayoutDirection) consume42222;
        ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
        Object consume52222 = composer3.consume(CompositionLocalsKt.getLocalViewConfiguration());
        ComposerKt.sourceInformationMarkerEnd(composer3);
        ViewConfiguration viewConfiguration2222 = (ViewConfiguration) consume52222;
        Function0<ComposeUiNode> constructor2222 = ComposeUiNode.Companion.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf2222 = LayoutKt.materializerOf(m789requiredSizeVpY3zN42222);
        if (!(composer3.getApplier() instanceof Applier)) {
        }
        composer3.startReusableNode();
        if (composer3.getInserting()) {
        }
        composer3.disableReusing();
        Composer m2893constructorimpl2222 = Updater.m2893constructorimpl(composer3);
        Updater.m2900setimpl(m2893constructorimpl2222, rememberBoxMeasurePolicy2222, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m2900setimpl(m2893constructorimpl2222, density2222, ComposeUiNode.Companion.getSetDensity());
        Updater.m2900setimpl(m2893constructorimpl2222, layoutDirection2222, ComposeUiNode.Companion.getSetLayoutDirection());
        Updater.m2900setimpl(m2893constructorimpl2222, viewConfiguration2222, ComposeUiNode.Companion.getSetViewConfiguration());
        composer3.enableReusing();
        materializerOf2222.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(composer3)), composer3, 0);
        composer3.startReplaceableGroup(2058660585);
        ComposerKt.sourceInformationMarkerStart(composer3, -1253629305, "C72@3384L9:Box.kt#2w3rfo");
        ComposerKt.sourceInformationMarkerStart(composer3, -1873061389, "C164@6720L9,158@6473L451:Switch.kt#uh7d8r");
        int i102222 = i7 >> 6;
        boolean z62222 = z4;
        SwitchColors switchColors42222 = obj7;
        Function2<? super Composer, ? super Integer, Unit> function232222 = obj6;
        Modifier modifier32222 = modifier2;
        m2089SwitchImpl0DmnUew(BoxScopeInstance.INSTANCE, z, z62222, switchColors42222, animatable.asState(), function232222, (InteractionSource) obj5, ShapesKt.toShape(SwitchTokens.INSTANCE.getHandleShape(), composer3, 6), f22222, m5607constructorimpl2222, f42222, composer3, 6 | ((i7 << 3) & 112) | (i102222 & 896) | (i102222 & 7168) | ((i7 << 6) & 458752) | (i7 & 3670016), 6);
        ComposerKt.sourceInformationMarkerEnd(composer3);
        ComposerKt.sourceInformationMarkerEnd(composer3);
        composer3.endReplaceableGroup();
        composer3.endNode();
        composer3.endReplaceableGroup();
        composer3.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
        }
        obj = modifier32222;
        function22 = obj6;
        switchColors3 = obj7;
        z5 = z4;
        endRestartGroup = composer3.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: SwitchImpl-0DmnUew  reason: not valid java name */
    public static final void m2089SwitchImpl0DmnUew(BoxScope boxScope, boolean z, boolean z2, SwitchColors switchColors, State<Float> state, Function2<? super Composer, ? super Integer, Unit> function2, InteractionSource interactionSource, Shape shape, float f, float f2, float f3, Composer composer, int i, int i2) {
        int i3;
        int i4;
        float m5607constructorimpl;
        float floatValue;
        float m2739getTrackOutlineWidthD9Ej5fM;
        Composer startRestartGroup = composer.startRestartGroup(-1968109941);
        ComposerKt.sourceInformation(startRestartGroup, "C(SwitchImpl)P(!1,2!1,8,6!1,7,9:c#ui.unit.Dp,5:c#ui.unit.Dp,4:c#ui.unit.Dp)187@7372L28,188@7440L25,*190@7508L7,210@8141L9,217@8350L29,222@8469L951:Switch.kt#uh7d8r");
        if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(boxScope) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i3 |= startRestartGroup.changed(z2) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i3 |= startRestartGroup.changed(switchColors) ? 2048 : 1024;
        }
        if ((57344 & i) == 0) {
            i3 |= startRestartGroup.changed(state) ? 16384 : 8192;
        }
        if ((i & 458752) == 0) {
            i3 |= startRestartGroup.changedInstance(function2) ? 131072 : 65536;
        }
        if ((i & 3670016) == 0) {
            i3 |= startRestartGroup.changed(interactionSource) ? 1048576 : 524288;
        }
        if ((i & 29360128) == 0) {
            i3 |= startRestartGroup.changed(shape) ? 8388608 : 4194304;
        }
        if ((i & 234881024) == 0) {
            i3 |= startRestartGroup.changed(f) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((i & 1879048192) == 0) {
            i3 |= startRestartGroup.changed(f2) ? 536870912 : 268435456;
        }
        if ((i2 & 14) == 0) {
            i4 = i2 | (startRestartGroup.changed(f3) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i3 & 1533916891) != 306783378 || (i4 & 11) != 2 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1968109941, i3, i4, "androidx.compose.material3.SwitchImpl (Switch.kt:175)");
            }
            int i5 = ((i3 >> 6) & 14) | (i3 & 112) | ((i3 >> 3) & 896);
            State<Color> trackColor$material3_release = switchColors.trackColor$material3_release(z2, z, startRestartGroup, i5);
            State<Boolean> collectIsPressedAsState = PressInteractionKt.collectIsPressedAsState(interactionSource, startRestartGroup, (i3 >> 18) & 14);
            int i6 = i3;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            float mo584toDpu2uoSUM = ((Density) consume).mo584toDpu2uoSUM(state.getValue().floatValue());
            if (SwitchImpl_0DmnUew$lambda$7(collectIsPressedAsState)) {
                m5607constructorimpl = SwitchTokens.INSTANCE.m2733getPressedHandleWidthD9Ej5fM();
            } else {
                m5607constructorimpl = Dp.m5607constructorimpl(Dp.m5607constructorimpl(Dp.m5607constructorimpl(ThumbDiameter - f) * (Dp.m5607constructorimpl(mo584toDpu2uoSUM - f2) / Dp.m5607constructorimpl(f3 - f2))) + f);
            }
            startRestartGroup.startReplaceableGroup(-993794105);
            ComposerKt.sourceInformation(startRestartGroup, "*199@7849L7");
            if (!SwitchImpl_0DmnUew$lambda$7(collectIsPressedAsState)) {
                floatValue = state.getValue().floatValue();
            } else {
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume2 = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Density density = (Density) consume2;
                if (!z) {
                    m2739getTrackOutlineWidthD9Ej5fM = SwitchTokens.INSTANCE.m2739getTrackOutlineWidthD9Ej5fM();
                } else {
                    m2739getTrackOutlineWidthD9Ej5fM = Dp.m5607constructorimpl(ThumbPathLength - SwitchTokens.INSTANCE.m2739getTrackOutlineWidthD9Ej5fM());
                }
                floatValue = density.mo588toPx0680j_4(m2739getTrackOutlineWidthD9Ej5fM);
            }
            startRestartGroup.endReplaceableGroup();
            Shape shape2 = ShapesKt.toShape(SwitchTokens.INSTANCE.getTrackShape(), startRestartGroup, 6);
            Modifier m420backgroundbw27NRU = BackgroundKt.m420backgroundbw27NRU(BorderKt.m432borderxT4_qwU(SizeKt.m781height3ABfNKs(SizeKt.m800width3ABfNKs(boxScope.align(Modifier.Companion, Alignment.Companion.getCenter()), SwitchWidth), SwitchHeight), SwitchTokens.INSTANCE.m2739getTrackOutlineWidthD9Ej5fM(), switchColors.borderColor$material3_release(z2, z, startRestartGroup, i5).getValue().m3301unboximpl(), shape2), SwitchImpl_0DmnUew$lambda$6(trackColor$material3_release), shape2);
            startRestartGroup.startReplaceableGroup(733328855);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume3 = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Density density2 = (Density) consume3;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume4 = startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            LayoutDirection layoutDirection = (LayoutDirection) consume4;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume5 = startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ViewConfiguration viewConfiguration = (ViewConfiguration) consume5;
            Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(m420backgroundbw27NRU);
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
            Updater.m2900setimpl(m2893constructorimpl, density2, ComposeUiNode.Companion.getSetDensity());
            Updater.m2900setimpl(m2893constructorimpl, layoutDirection, ComposeUiNode.Companion.getSetLayoutDirection());
            Updater.m2900setimpl(m2893constructorimpl, viewConfiguration, ComposeUiNode.Companion.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629305, "C72@3384L9:Box.kt#2w3rfo");
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1420969751, "C223@8518L28,228@8706L42,231@8870L64,225@8599L815:Switch.kt#uh7d8r");
            long SwitchImpl_0DmnUew$lambda$13$lambda$10 = SwitchImpl_0DmnUew$lambda$13$lambda$10(switchColors.thumbColor$material3_release(z2, z, startRestartGroup, i5));
            Modifier align = BoxScopeInstance.INSTANCE.align(Modifier.Companion, Alignment.Companion.getCenterStart());
            Float valueOf = Float.valueOf(floatValue);
            startRestartGroup.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
            boolean changed = startRestartGroup.changed(valueOf);
            SwitchKt$SwitchImpl$1$1$1 rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new SwitchKt$SwitchImpl$1$1$1(floatValue);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            Modifier m420backgroundbw27NRU2 = BackgroundKt.m420backgroundbw27NRU(SizeKt.m787requiredSize3ABfNKs(IndicationKt.indication(OffsetKt.offset(align, (Function1) rememberedValue), interactionSource, RippleKt.m1559rememberRipple9IZ8Weo(false, Dp.m5607constructorimpl(SwitchTokens.INSTANCE.m2737getStateLayerSizeD9Ej5fM() / 2), 0L, startRestartGroup, 54, 4)), m5607constructorimpl), SwitchImpl_0DmnUew$lambda$13$lambda$10, shape);
            Alignment center = Alignment.Companion.getCenter();
            startRestartGroup.startReplaceableGroup(733328855);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
            MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center, false, startRestartGroup, 6);
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume6 = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Density density3 = (Density) consume6;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume7 = startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            LayoutDirection layoutDirection2 = (LayoutDirection) consume7;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume8 = startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ViewConfiguration viewConfiguration2 = (ViewConfiguration) consume8;
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf2 = LayoutKt.materializerOf(m420backgroundbw27NRU2);
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
            Updater.m2900setimpl(m2893constructorimpl2, rememberBoxMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2900setimpl(m2893constructorimpl2, density3, ComposeUiNode.Companion.getSetDensity());
            Updater.m2900setimpl(m2893constructorimpl2, layoutDirection2, ComposeUiNode.Companion.getSetLayoutDirection());
            Updater.m2900setimpl(m2893constructorimpl2, viewConfiguration2, ComposeUiNode.Companion.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf2.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629305, "C72@3384L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2040677196, "C:Switch.kt#uh7d8r");
            startRestartGroup.startReplaceableGroup(1420970387);
            ComposerKt.sourceInformation(startRestartGroup, "238@9196L27,239@9240L150");
            if (function2 != null) {
                CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(switchColors.iconColor$material3_release(z2, z, startRestartGroup, i5).getValue())}, function2, startRestartGroup, ((i6 >> 12) & 112) | 8);
            }
            startRestartGroup.endReplaceableGroup();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
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
        endRestartGroup.updateScope(new SwitchKt$SwitchImpl$2(boxScope, z, z2, switchColors, state, function2, interactionSource, shape, f, f2, f3, i, i2));
    }

    static {
        float m2735getSelectedHandleWidthD9Ej5fM = SwitchTokens.INSTANCE.m2735getSelectedHandleWidthD9Ej5fM();
        ThumbDiameter = m2735getSelectedHandleWidthD9Ej5fM;
        UncheckedThumbDiameter = SwitchTokens.INSTANCE.m2742getUnselectedHandleWidthD9Ej5fM();
        float m2740getTrackWidthD9Ej5fM = SwitchTokens.INSTANCE.m2740getTrackWidthD9Ej5fM();
        SwitchWidth = m2740getTrackWidthD9Ej5fM;
        float m2738getTrackHeightD9Ej5fM = SwitchTokens.INSTANCE.m2738getTrackHeightD9Ej5fM();
        SwitchHeight = m2738getTrackHeightD9Ej5fM;
        float m5607constructorimpl = Dp.m5607constructorimpl(Dp.m5607constructorimpl(m2738getTrackHeightD9Ej5fM - m2735getSelectedHandleWidthD9Ej5fM) / 2);
        ThumbPadding = m5607constructorimpl;
        ThumbPathLength = Dp.m5607constructorimpl(Dp.m5607constructorimpl(m2740getTrackWidthD9Ej5fM - m2735getSelectedHandleWidthD9Ej5fM) - m5607constructorimpl);
        AnimationSpec = new TweenSpec<>(100, 0, null, 6, null);
    }

    public static final float getThumbDiameter() {
        return ThumbDiameter;
    }

    public static final float getUncheckedThumbDiameter() {
        return UncheckedThumbDiameter;
    }

    private static final long SwitchImpl_0DmnUew$lambda$6(State<Color> state) {
        return state.getValue().m3301unboximpl();
    }

    private static final boolean SwitchImpl_0DmnUew$lambda$7(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final long SwitchImpl_0DmnUew$lambda$13$lambda$10(State<Color> state) {
        return state.getValue().m3301unboximpl();
    }
}
