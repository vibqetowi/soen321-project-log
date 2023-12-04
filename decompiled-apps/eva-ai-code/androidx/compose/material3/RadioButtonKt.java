package androidx.compose.material3;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.material.ripple.RippleKt;
import androidx.compose.material3.tokens.RadioButtonTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.unit.Dp;
import androidx.profileinstaller.ProfileVerifier;
import com.ifriend.keychain.cipherStorage.CipherStorageKeystoreRsaEcb;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
/* compiled from: RadioButton.kt */
@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aM\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\n2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0013H\u0007¢\u0006\u0002\u0010\u0014\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0013\u0010\u0002\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0004\"\u0013\u0010\u0005\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0004\"\u0013\u0010\u0006\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"RadioAnimationDuration", "", "RadioButtonDotSize", "Landroidx/compose/ui/unit/Dp;", "F", "RadioButtonPadding", "RadioStrokeWidth", "RadioButton", "", "selected", "", "onClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "colors", "Landroidx/compose/material3/RadioButtonColors;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/RadioButtonColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RadioButtonKt {
    private static final int RadioAnimationDuration = 100;
    private static final float RadioButtonDotSize = Dp.m5607constructorimpl(12);
    private static final float RadioButtonPadding;
    private static final float RadioStrokeWidth;

    /* JADX WARN: Removed duplicated region for block: B:102:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x014f  */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r13v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RadioButton(boolean z, Function0<Unit> function0, Modifier modifier, boolean z2, RadioButtonColors radioButtonColors, MutableInteractionSource mutableInteractionSource, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z3;
        Object obj;
        int i5;
        Object obj2;
        boolean z4;
        Object obj3;
        Modifier modifier3;
        RadioButtonColors radioButtonColors2;
        Object obj4;
        float m5607constructorimpl;
        ?? r13;
        State<Color> state;
        RadioButtonColors radioButtonColors3;
        Modifier modifier4;
        int i6;
        Composer composer2;
        State<Dp> state2;
        boolean z5;
        Modifier.Companion companion;
        Modifier.Companion companion2;
        boolean changed;
        RadioButtonKt$RadioButton$2$1 rememberedValue;
        RadioButtonColors radioButtonColors4;
        boolean z6;
        MutableInteractionSource mutableInteractionSource2;
        ScopeUpdateScope endRestartGroup;
        Object obj5;
        int i7;
        Object obj6;
        Composer startRestartGroup = composer.startRestartGroup(408580840);
        ComposerKt.sourceInformation(startRestartGroup, "C(RadioButton)P(5,4,3,1)77@3761L8,78@3821L39,80@3885L164,84@4078L29,114@5054L415,101@4636L833:RadioButton.kt#uh7d8r");
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
            i3 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            Object obj7 = modifier;
            i3 |= startRestartGroup.changed(obj7) ? 256 : 128;
            modifier2 = obj7;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
            } else if ((i & 7168) == 0) {
                z3 = z2;
                i3 |= startRestartGroup.changed(z3) ? 2048 : 1024;
                if ((57344 & i) == 0) {
                    if ((i2 & 16) == 0) {
                        obj5 = radioButtonColors;
                        if (startRestartGroup.changed(obj5)) {
                            i7 = 16384;
                            obj6 = obj5;
                            i3 |= i7;
                            obj = obj6;
                        }
                    } else {
                        obj5 = radioButtonColors;
                    }
                    i7 = 8192;
                    obj6 = obj5;
                    i3 |= i7;
                    obj = obj6;
                } else {
                    obj = radioButtonColors;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    obj2 = mutableInteractionSource;
                } else {
                    Object obj8 = mutableInteractionSource;
                    obj2 = obj8;
                    if ((458752 & i) == 0) {
                        i3 |= startRestartGroup.changed(obj8) ? 131072 : 65536;
                        obj2 = obj8;
                    }
                }
                if ((374491 & i3) == 74898 || !startRestartGroup.getSkipping()) {
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                        Modifier.Companion companion3 = i8 != 0 ? Modifier.Companion : modifier2;
                        z4 = i4 != 0 ? true : z3;
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            obj = RadioButtonDefaults.INSTANCE.m1944colorsro_MJ88(0L, 0L, 0L, 0L, startRestartGroup, 24576, 15);
                        }
                        if (i5 != 0) {
                            startRestartGroup.startReplaceableGroup(-492369756);
                            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                            Object rememberedValue2 = startRestartGroup.rememberedValue();
                            if (rememberedValue2 == Composer.Companion.getEmpty()) {
                                rememberedValue2 = InteractionSourceKt.MutableInteractionSource();
                                startRestartGroup.updateRememberedValue(rememberedValue2);
                            }
                            startRestartGroup.endReplaceableGroup();
                            obj3 = (MutableInteractionSource) rememberedValue2;
                        } else {
                            obj3 = mutableInteractionSource;
                        }
                        modifier3 = companion3;
                        radioButtonColors2 = obj;
                        obj4 = obj3;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                        }
                        modifier3 = modifier2;
                        z4 = z3;
                        radioButtonColors2 = obj;
                        obj4 = obj2;
                    }
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(408580840, i3, -1, "androidx.compose.material3.RadioButton (RadioButton.kt:72)");
                    }
                    if (z) {
                        m5607constructorimpl = Dp.m5607constructorimpl(RadioButtonDotSize / 2);
                    } else {
                        m5607constructorimpl = Dp.m5607constructorimpl(0);
                    }
                    State<Dp> m341animateDpAsStateAjpBEmI = AnimateAsStateKt.m341animateDpAsStateAjpBEmI(m5607constructorimpl, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, null, startRestartGroup, 48, 12);
                    State<Color> radioColor$material3_release = radioButtonColors2.radioColor$material3_release(z4, z, startRestartGroup, ((i3 >> 6) & 896) | ((i3 >> 9) & 14) | ((i3 << 3) & 112));
                    startRestartGroup.startReplaceableGroup(735546407);
                    ComposerKt.sourceInformation(startRestartGroup, "93@4433L136");
                    if (function0 != null) {
                        state2 = m341animateDpAsStateAjpBEmI;
                        r13 = 0;
                        state = radioColor$material3_release;
                        radioButtonColors3 = radioButtonColors2;
                        z5 = z4;
                        modifier4 = modifier3;
                        i6 = 2;
                        composer2 = startRestartGroup;
                        companion = SelectableKt.m980selectableO2vRcR0(Modifier.Companion, z, obj4, RippleKt.m1559rememberRipple9IZ8Weo(false, Dp.m5607constructorimpl(RadioButtonTokens.INSTANCE.m2692getStateLayerSizeD9Ej5fM() / 2), 0L, startRestartGroup, 54, 4), z5, Role.m4917boximpl(Role.Companion.m4928getRadioButtono7Vup1c()), function0);
                    } else {
                        r13 = 0;
                        state = radioColor$material3_release;
                        radioButtonColors3 = radioButtonColors2;
                        modifier4 = modifier3;
                        i6 = 2;
                        composer2 = startRestartGroup;
                        state2 = m341animateDpAsStateAjpBEmI;
                        z5 = z4;
                        companion = Modifier.Companion;
                    }
                    composer2.endReplaceableGroup();
                    if (function0 != null) {
                        companion2 = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.Companion);
                    } else {
                        companion2 = Modifier.Companion;
                    }
                    Modifier m787requiredSize3ABfNKs = SizeKt.m787requiredSize3ABfNKs(PaddingKt.m748padding3ABfNKs(SizeKt.wrapContentSize$default(modifier4.then(companion2).then(companion), Alignment.Companion.getCenter(), r13, i6, null), RadioButtonPadding), RadioButtonTokens.INSTANCE.m2691getIconSizeD9Ej5fM());
                    composer2.startReplaceableGroup(511388516);
                    ComposerKt.sourceInformation(composer2, "CC(remember)P(1,2):Composables.kt#9igjgp");
                    State<Dp> state3 = state2;
                    changed = composer2.changed(state) | composer2.changed(state3);
                    rememberedValue = composer2.rememberedValue();
                    if (!changed || rememberedValue == Composer.Companion.getEmpty()) {
                        rememberedValue = new RadioButtonKt$RadioButton$2$1(state, state3);
                        composer2.updateRememberedValue(rememberedValue);
                    }
                    composer2.endReplaceableGroup();
                    CanvasKt.Canvas(m787requiredSize3ABfNKs, (Function1) rememberedValue, composer2, r13);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier4;
                    radioButtonColors4 = radioButtonColors3;
                    z6 = z5;
                    mutableInteractionSource2 = obj4;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    composer2 = startRestartGroup;
                    z6 = z3;
                    radioButtonColors4 = obj;
                    mutableInteractionSource2 = obj2;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                    return;
                }
                endRestartGroup.updateScope(new RadioButtonKt$RadioButton$3(z, function0, modifier2, z6, radioButtonColors4, mutableInteractionSource2, i, i2));
                return;
            }
            z3 = z2;
            if ((57344 & i) == 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
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
            if ((i2 & 16) != 0) {
            }
            if (i5 != 0) {
            }
            modifier3 = companion3;
            radioButtonColors2 = obj;
            obj4 = obj3;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            if (z) {
            }
            State<Dp> m341animateDpAsStateAjpBEmI2 = AnimateAsStateKt.m341animateDpAsStateAjpBEmI(m5607constructorimpl, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, null, startRestartGroup, 48, 12);
            State<Color> radioColor$material3_release2 = radioButtonColors2.radioColor$material3_release(z4, z, startRestartGroup, ((i3 >> 6) & 896) | ((i3 >> 9) & 14) | ((i3 << 3) & 112));
            startRestartGroup.startReplaceableGroup(735546407);
            ComposerKt.sourceInformation(startRestartGroup, "93@4433L136");
            if (function0 != null) {
            }
            composer2.endReplaceableGroup();
            if (function0 != null) {
            }
            Modifier m787requiredSize3ABfNKs2 = SizeKt.m787requiredSize3ABfNKs(PaddingKt.m748padding3ABfNKs(SizeKt.wrapContentSize$default(modifier4.then(companion2).then(companion), Alignment.Companion.getCenter(), r13, i6, null), RadioButtonPadding), RadioButtonTokens.INSTANCE.m2691getIconSizeD9Ej5fM());
            composer2.startReplaceableGroup(511388516);
            ComposerKt.sourceInformation(composer2, "CC(remember)P(1,2):Composables.kt#9igjgp");
            State<Dp> state32 = state2;
            changed = composer2.changed(state) | composer2.changed(state32);
            rememberedValue = composer2.rememberedValue();
            if (!changed) {
            }
            rememberedValue = new RadioButtonKt$RadioButton$2$1(state, state32);
            composer2.updateRememberedValue(rememberedValue);
            composer2.endReplaceableGroup();
            CanvasKt.Canvas(m787requiredSize3ABfNKs2, (Function1) rememberedValue, composer2, r13);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier2 = modifier4;
            radioButtonColors4 = radioButtonColors3;
            z6 = z5;
            mutableInteractionSource2 = obj4;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
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
        if ((374491 & i3) == 74898) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i8 != 0) {
        }
        if (i4 != 0) {
        }
        if ((i2 & 16) != 0) {
        }
        if (i5 != 0) {
        }
        modifier3 = companion3;
        radioButtonColors2 = obj;
        obj4 = obj3;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        if (z) {
        }
        State<Dp> m341animateDpAsStateAjpBEmI22 = AnimateAsStateKt.m341animateDpAsStateAjpBEmI(m5607constructorimpl, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, null, startRestartGroup, 48, 12);
        State<Color> radioColor$material3_release22 = radioButtonColors2.radioColor$material3_release(z4, z, startRestartGroup, ((i3 >> 6) & 896) | ((i3 >> 9) & 14) | ((i3 << 3) & 112));
        startRestartGroup.startReplaceableGroup(735546407);
        ComposerKt.sourceInformation(startRestartGroup, "93@4433L136");
        if (function0 != null) {
        }
        composer2.endReplaceableGroup();
        if (function0 != null) {
        }
        Modifier m787requiredSize3ABfNKs22 = SizeKt.m787requiredSize3ABfNKs(PaddingKt.m748padding3ABfNKs(SizeKt.wrapContentSize$default(modifier4.then(companion2).then(companion), Alignment.Companion.getCenter(), r13, i6, null), RadioButtonPadding), RadioButtonTokens.INSTANCE.m2691getIconSizeD9Ej5fM());
        composer2.startReplaceableGroup(511388516);
        ComposerKt.sourceInformation(composer2, "CC(remember)P(1,2):Composables.kt#9igjgp");
        State<Dp> state322 = state2;
        changed = composer2.changed(state) | composer2.changed(state322);
        rememberedValue = composer2.rememberedValue();
        if (!changed) {
        }
        rememberedValue = new RadioButtonKt$RadioButton$2$1(state, state322);
        composer2.updateRememberedValue(rememberedValue);
        composer2.endReplaceableGroup();
        CanvasKt.Canvas(m787requiredSize3ABfNKs22, (Function1) rememberedValue, composer2, r13);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier2 = modifier4;
        radioButtonColors4 = radioButtonColors3;
        z6 = z5;
        mutableInteractionSource2 = obj4;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    static {
        float f = 2;
        RadioButtonPadding = Dp.m5607constructorimpl(f);
        RadioStrokeWidth = Dp.m5607constructorimpl(f);
    }
}
