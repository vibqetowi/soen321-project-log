package androidx.compose.material;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.material.ripple.RippleKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.unit.Dp;
import com.ifriend.keychain.cipherStorage.CipherStorageKeystoreRsaEcb;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
/* compiled from: RadioButton.kt */
@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aM\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\r2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u0016H\u0007¢\u0006\u0002\u0010\u0017\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0013\u0010\u0002\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0004\"\u0013\u0010\u0005\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0004\"\u0013\u0010\u0006\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0004\"\u0013\u0010\u0007\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0004\"\u0013\u0010\b\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0004\"\u0013\u0010\t\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"RadioAnimationDuration", "", "RadioButtonDotSize", "Landroidx/compose/ui/unit/Dp;", "F", "RadioButtonPadding", "RadioButtonRippleRadius", "RadioButtonSize", "RadioRadius", "RadioStrokeWidth", "RadioButton", "", "selected", "", "onClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "colors", "Landroidx/compose/material/RadioButtonColors;", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/material/RadioButtonColors;Landroidx/compose/runtime/Composer;II)V", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RadioButtonKt {
    private static final int RadioAnimationDuration = 100;
    private static final float RadioButtonDotSize;
    private static final float RadioButtonPadding;
    private static final float RadioButtonRippleRadius = Dp.m5607constructorimpl(24);
    private static final float RadioButtonSize;
    private static final float RadioRadius;
    private static final float RadioStrokeWidth;

    /* JADX WARN: Removed duplicated region for block: B:101:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x013f  */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r13v12 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RadioButton(boolean z, Function0<Unit> function0, Modifier modifier, boolean z2, MutableInteractionSource mutableInteractionSource, RadioButtonColors radioButtonColors, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z3;
        int i5;
        MutableInteractionSource mutableInteractionSource2;
        Object obj;
        boolean z4;
        MutableInteractionSource mutableInteractionSource3;
        MutableInteractionSource mutableInteractionSource4;
        Modifier modifier3;
        RadioButtonColors m1441colorsRGew2ao;
        float m5607constructorimpl;
        ?? r13;
        State<Color> state;
        RadioButtonColors radioButtonColors2;
        Modifier modifier4;
        int i6;
        Composer composer2;
        State<Dp> state2;
        boolean z5;
        Modifier.Companion companion;
        Modifier.Companion companion2;
        boolean changed;
        RadioButtonKt$RadioButton$2$1 rememberedValue;
        RadioButtonColors radioButtonColors3;
        boolean z6;
        MutableInteractionSource mutableInteractionSource5;
        Object obj2;
        int i7;
        Object obj3;
        Composer startRestartGroup = composer.startRestartGroup(1314435585);
        ComposerKt.sourceInformation(startRestartGroup, "C(RadioButton)P(5,4,3,1,2)78@3687L39,79@3780L8,81@3813L164,85@4006L29,115@4958L385,102@4551L792:RadioButton.kt#jmzs0o");
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
            Object obj4 = modifier;
            i3 |= startRestartGroup.changed(obj4) ? 256 : 128;
            modifier2 = obj4;
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
                    mutableInteractionSource2 = mutableInteractionSource;
                    i3 |= startRestartGroup.changed(mutableInteractionSource2) ? 16384 : 8192;
                    if ((458752 & i) != 0) {
                        if ((i2 & 32) == 0) {
                            obj2 = radioButtonColors;
                            if (startRestartGroup.changed(obj2)) {
                                i7 = 131072;
                                obj3 = obj2;
                                i3 |= i7;
                                obj = obj3;
                            }
                        } else {
                            obj2 = radioButtonColors;
                        }
                        i7 = 65536;
                        obj3 = obj2;
                        i3 |= i7;
                        obj = obj3;
                    } else {
                        obj = radioButtonColors;
                    }
                    if ((374491 & i3) == 74898 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            Modifier.Companion companion3 = i8 == 0 ? Modifier.Companion : modifier2;
                            z4 = i4 == 0 ? true : z3;
                            if (i5 == 0) {
                                startRestartGroup.startReplaceableGroup(-492369756);
                                ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                                Object rememberedValue2 = startRestartGroup.rememberedValue();
                                if (rememberedValue2 == Composer.Companion.getEmpty()) {
                                    rememberedValue2 = InteractionSourceKt.MutableInteractionSource();
                                    startRestartGroup.updateRememberedValue(rememberedValue2);
                                }
                                startRestartGroup.endReplaceableGroup();
                                mutableInteractionSource3 = (MutableInteractionSource) rememberedValue2;
                            } else {
                                mutableInteractionSource3 = mutableInteractionSource2;
                            }
                            if ((i2 & 32) == 0) {
                                i3 &= -458753;
                                mutableInteractionSource4 = mutableInteractionSource3;
                                modifier3 = companion3;
                                m1441colorsRGew2ao = RadioButtonDefaults.INSTANCE.m1441colorsRGew2ao(0L, 0L, 0L, startRestartGroup, CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE, 7);
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1314435585, i3, -1, "androidx.compose.material.RadioButton (RadioButton.kt:73)");
                                }
                                if (!z) {
                                    m5607constructorimpl = Dp.m5607constructorimpl(RadioButtonDotSize / 2);
                                } else {
                                    m5607constructorimpl = Dp.m5607constructorimpl(0);
                                }
                                State<Dp> m341animateDpAsStateAjpBEmI = AnimateAsStateKt.m341animateDpAsStateAjpBEmI(m5607constructorimpl, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, null, startRestartGroup, 48, 12);
                                int i9 = i3 >> 9;
                                State<Color> radioColor = m1441colorsRGew2ao.radioColor(z4, z, startRestartGroup, ((i3 << 3) & 112) | (i9 & 14) | (i9 & 896));
                                startRestartGroup.startReplaceableGroup(1941632354);
                                ComposerKt.sourceInformation(startRestartGroup, "94@4361L123");
                                if (function0 == null) {
                                    state2 = m341animateDpAsStateAjpBEmI;
                                    r13 = 0;
                                    state = radioColor;
                                    radioButtonColors2 = m1441colorsRGew2ao;
                                    z5 = z4;
                                    modifier4 = modifier3;
                                    i6 = 2;
                                    composer2 = startRestartGroup;
                                    companion = SelectableKt.m980selectableO2vRcR0(Modifier.Companion, z, mutableInteractionSource4, RippleKt.m1559rememberRipple9IZ8Weo(false, RadioButtonRippleRadius, 0L, startRestartGroup, 54, 4), z5, Role.m4917boximpl(Role.Companion.m4928getRadioButtono7Vup1c()), function0);
                                } else {
                                    r13 = 0;
                                    state = radioColor;
                                    radioButtonColors2 = m1441colorsRGew2ao;
                                    modifier4 = modifier3;
                                    i6 = 2;
                                    composer2 = startRestartGroup;
                                    state2 = m341animateDpAsStateAjpBEmI;
                                    z5 = z4;
                                    companion = Modifier.Companion;
                                }
                                composer2.endReplaceableGroup();
                                if (function0 == null) {
                                    companion2 = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.Companion);
                                } else {
                                    companion2 = Modifier.Companion;
                                }
                                Modifier m787requiredSize3ABfNKs = SizeKt.m787requiredSize3ABfNKs(PaddingKt.m748padding3ABfNKs(SizeKt.wrapContentSize$default(modifier4.then(companion2).then(companion), Alignment.Companion.getCenter(), r13, i6, null), RadioButtonPadding), RadioButtonSize);
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
                                radioButtonColors3 = radioButtonColors2;
                                z6 = z5;
                                mutableInteractionSource5 = mutableInteractionSource4;
                            } else {
                                mutableInteractionSource4 = mutableInteractionSource3;
                                modifier3 = companion3;
                            }
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                            }
                            modifier3 = modifier2;
                            z4 = z3;
                            mutableInteractionSource4 = mutableInteractionSource2;
                        }
                        m1441colorsRGew2ao = obj;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        if (!z) {
                        }
                        State<Dp> m341animateDpAsStateAjpBEmI2 = AnimateAsStateKt.m341animateDpAsStateAjpBEmI(m5607constructorimpl, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, null, startRestartGroup, 48, 12);
                        int i92 = i3 >> 9;
                        State<Color> radioColor2 = m1441colorsRGew2ao.radioColor(z4, z, startRestartGroup, ((i3 << 3) & 112) | (i92 & 14) | (i92 & 896));
                        startRestartGroup.startReplaceableGroup(1941632354);
                        ComposerKt.sourceInformation(startRestartGroup, "94@4361L123");
                        if (function0 == null) {
                        }
                        composer2.endReplaceableGroup();
                        if (function0 == null) {
                        }
                        Modifier m787requiredSize3ABfNKs2 = SizeKt.m787requiredSize3ABfNKs(PaddingKt.m748padding3ABfNKs(SizeKt.wrapContentSize$default(modifier4.then(companion2).then(companion), Alignment.Companion.getCenter(), r13, i6, null), RadioButtonPadding), RadioButtonSize);
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
                        radioButtonColors3 = radioButtonColors2;
                        z6 = z5;
                        mutableInteractionSource5 = mutableInteractionSource4;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        z6 = z3;
                        mutableInteractionSource5 = mutableInteractionSource2;
                        composer2 = startRestartGroup;
                        radioButtonColors3 = obj;
                    }
                    ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        return;
                    }
                    endRestartGroup.updateScope(new RadioButtonKt$RadioButton$3(z, function0, modifier2, z6, mutableInteractionSource5, radioButtonColors3, i, i2));
                    return;
                }
                mutableInteractionSource2 = mutableInteractionSource;
                if ((458752 & i) != 0) {
                }
                if ((374491 & i3) == 74898) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i8 == 0) {
                }
                if (i4 == 0) {
                }
                if (i5 == 0) {
                }
                if ((i2 & 32) == 0) {
                }
            }
            z3 = z2;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            mutableInteractionSource2 = mutableInteractionSource;
            if ((458752 & i) != 0) {
            }
            if ((374491 & i3) == 74898) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i8 == 0) {
            }
            if (i4 == 0) {
            }
            if (i5 == 0) {
            }
            if ((i2 & 32) == 0) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z3 = z2;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        if ((458752 & i) != 0) {
        }
        if ((374491 & i3) == 74898) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i8 == 0) {
        }
        if (i4 == 0) {
        }
        if (i5 == 0) {
        }
        if ((i2 & 32) == 0) {
        }
    }

    static {
        float f = 2;
        RadioButtonPadding = Dp.m5607constructorimpl(f);
        float m5607constructorimpl = Dp.m5607constructorimpl(20);
        RadioButtonSize = m5607constructorimpl;
        RadioRadius = Dp.m5607constructorimpl(m5607constructorimpl / f);
        RadioButtonDotSize = Dp.m5607constructorimpl(12);
        RadioStrokeWidth = Dp.m5607constructorimpl(f);
    }
}
