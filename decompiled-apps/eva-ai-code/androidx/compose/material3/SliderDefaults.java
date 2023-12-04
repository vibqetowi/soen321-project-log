package androidx.compose.material3;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.HoverableKt;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.ripple.RippleKt;
import androidx.compose.material3.tokens.SliderTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Dp;
import androidx.profileinstaller.ProfileVerifier;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.ifriend.keychain.cipherStorage.CipherStorageKeystoreRsaEcb;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: Slider.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JE\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010J3\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007¢\u0006\u0002\u0010\u0014Jy\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00162\b\b\u0002\u0010\u001a\u001a\u00020\u00162\b\b\u0002\u0010\u001b\u001a\u00020\u00162\b\b\u0002\u0010\u001c\u001a\u00020\u00162\b\b\u0002\u0010\u001d\u001a\u00020\u00162\b\b\u0002\u0010\u001e\u001a\u00020\u00162\b\b\u0002\u0010\u001f\u001a\u00020\u0016H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b \u0010!\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\""}, d2 = {"Landroidx/compose/material3/SliderDefaults;", "", "()V", "Thumb", "", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "modifier", "Landroidx/compose/ui/Modifier;", "colors", "Landroidx/compose/material3/SliderColors;", "enabled", "", "thumbSize", "Landroidx/compose/ui/unit/DpSize;", "Thumb-9LiSoMs", "(Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SliderColors;ZJLandroidx/compose/runtime/Composer;II)V", "Track", "sliderPositions", "Landroidx/compose/material3/SliderPositions;", "(Landroidx/compose/material3/SliderPositions;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SliderColors;ZLandroidx/compose/runtime/Composer;II)V", "thumbColor", "Landroidx/compose/ui/graphics/Color;", "activeTrackColor", "activeTickColor", "inactiveTrackColor", "inactiveTickColor", "disabledThumbColor", "disabledActiveTrackColor", "disabledActiveTickColor", "disabledInactiveTrackColor", "disabledInactiveTickColor", "colors-q0g_0yA", "(JJJJJJJJJJLandroidx/compose/runtime/Composer;III)Landroidx/compose/material3/SliderColors;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SliderDefaults {
    public static final int $stable = 0;
    public static final SliderDefaults INSTANCE = new SliderDefaults();

    private SliderDefaults() {
    }

    /* renamed from: colors-q0g_0yA  reason: not valid java name */
    public final SliderColors m1975colorsq0g_0yA(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, Composer composer, int i, int i2, int i3) {
        composer.startReplaceableGroup(885588574);
        ComposerKt.sourceInformation(composer, "C(colors)P(9:c#ui.graphics.Color,1:c#ui.graphics.Color,0:c#ui.graphics.Color,8:c#ui.graphics.Color,7:c#ui.graphics.Color,6:c#ui.graphics.Color,3:c#ui.graphics.Color,2:c#ui.graphics.Color,5:c#ui.graphics.Color,4:c#ui.graphics.Color)897@37512L9,898@37587L9,900@37687L9,902@37838L9,903@37929L9,906@38096L9,908@38209L11,911@38340L9,914@38521L9,918@38719L9,921@38892L9:Slider.kt#uh7d8r");
        long color = (i3 & 1) != 0 ? ColorSchemeKt.toColor(SliderTokens.INSTANCE.getHandleColor(), composer, 6) : j;
        long color2 = (i3 & 2) != 0 ? ColorSchemeKt.toColor(SliderTokens.INSTANCE.getActiveTrackColor(), composer, 6) : j2;
        long m3290copywmQWz5c$default = (i3 & 4) != 0 ? Color.m3290copywmQWz5c$default(ColorSchemeKt.toColor(SliderTokens.INSTANCE.getTickMarksActiveContainerColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j3;
        long color3 = (i3 & 8) != 0 ? ColorSchemeKt.toColor(SliderTokens.INSTANCE.getInactiveTrackColor(), composer, 6) : j4;
        long m3290copywmQWz5c$default2 = (i3 & 16) != 0 ? Color.m3290copywmQWz5c$default(ColorSchemeKt.toColor(SliderTokens.INSTANCE.getTickMarksInactiveContainerColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j5;
        long m3336compositeOverOWjLjI = (i3 & 32) != 0 ? ColorKt.m3336compositeOverOWjLjI(Color.m3290copywmQWz5c$default(ColorSchemeKt.toColor(SliderTokens.INSTANCE.getDisabledHandleColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColorScheme(composer, 6).m1651getSurface0d7_KjU()) : j6;
        long m3290copywmQWz5c$default3 = (i3 & 64) != 0 ? Color.m3290copywmQWz5c$default(ColorSchemeKt.toColor(SliderTokens.INSTANCE.getDisabledActiveTrackColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j7;
        long m3290copywmQWz5c$default4 = (i3 & 128) != 0 ? Color.m3290copywmQWz5c$default(ColorSchemeKt.toColor(SliderTokens.INSTANCE.getTickMarksDisabledContainerColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j8;
        long m3290copywmQWz5c$default5 = (i3 & 256) != 0 ? Color.m3290copywmQWz5c$default(ColorSchemeKt.toColor(SliderTokens.INSTANCE.getDisabledInactiveTrackColor(), composer, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j9;
        long m3290copywmQWz5c$default6 = (i3 & 512) != 0 ? Color.m3290copywmQWz5c$default(ColorSchemeKt.toColor(SliderTokens.INSTANCE.getTickMarksDisabledContainerColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j10;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(885588574, i, i2, "androidx.compose.material3.SliderDefaults.colors (Slider.kt:896)");
        }
        SliderColors sliderColors = new SliderColors(color, color2, m3290copywmQWz5c$default, color3, m3290copywmQWz5c$default2, m3336compositeOverOWjLjI, m3290copywmQWz5c$default3, m3290copywmQWz5c$default4, m3290copywmQWz5c$default5, m3290copywmQWz5c$default6, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return sliderColors;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x015b  */
    /* renamed from: Thumb-9LiSoMs  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1974Thumb9LiSoMs(MutableInteractionSource interactionSource, Modifier modifier, SliderColors sliderColors, boolean z, long j, Composer composer, int i, int i2) {
        int i3;
        Modifier.Companion companion;
        SliderColors sliderColors2;
        int i4;
        boolean z2;
        int i5;
        long j2;
        boolean z3;
        long j3;
        Object rememberedValue;
        SnapshotStateList snapshotStateList;
        boolean changed;
        SliderDefaults$Thumb$1$1 rememberedValue2;
        Modifier modifier2;
        SliderColors sliderColors3;
        long j4;
        ScopeUpdateScope endRestartGroup;
        int i6;
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Composer startRestartGroup = composer.startRestartGroup(-290277409);
        ComposerKt.sourceInformation(startRestartGroup, "C(Thumb)P(2,3!,4:c#ui.unit.DpSize)953@40405L8,957@40521L46,958@40610L658,958@40576L692,976@41467L9,983@41669L143,990@42011L19,978@41486L568:Slider.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(interactionSource) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            companion = modifier;
            i3 |= startRestartGroup.changed(companion) ? 32 : 16;
            if ((i & 896) != 0) {
                if ((i2 & 4) == 0) {
                    sliderColors2 = sliderColors;
                    if (startRestartGroup.changed(sliderColors2)) {
                        i6 = 256;
                        i3 |= i6;
                    }
                } else {
                    sliderColors2 = sliderColors;
                }
                i6 = 128;
                i3 |= i6;
            } else {
                sliderColors2 = sliderColors;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
            } else if ((i & 7168) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 2048 : 1024;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                    j2 = j;
                } else {
                    j2 = j;
                    if ((57344 & i) == 0) {
                        i3 |= startRestartGroup.changed(j2) ? 16384 : 8192;
                    }
                }
                if ((i2 & 32) != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((458752 & i) == 0) {
                    i3 |= startRestartGroup.changed(this) ? 131072 : 65536;
                }
                if ((374491 & i3) == 74898 || !startRestartGroup.getSkipping()) {
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                        if (i7 != 0) {
                            companion = Modifier.Companion;
                        }
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                            sliderColors2 = m1975colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, startRestartGroup, 0, (i3 >> 15) & 14, AnalyticsListener.EVENT_DRM_KEYS_LOADED);
                        }
                        z3 = i4 != 0 ? true : z;
                        if (i5 != 0) {
                            j3 = SliderKt.ThumbSize;
                            j2 = j3;
                        } else {
                            j2 = j;
                        }
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                        }
                        z3 = z2;
                    }
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-290277409, i3, -1, "androidx.compose.material3.SliderDefaults.Thumb (Slider.kt:950)");
                    }
                    startRestartGroup.startReplaceableGroup(-492369756);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == Composer.Companion.getEmpty()) {
                        rememberedValue = SnapshotStateKt.mutableStateListOf();
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    startRestartGroup.endReplaceableGroup();
                    snapshotStateList = (SnapshotStateList) rememberedValue;
                    int i8 = i3 & 14;
                    startRestartGroup.startReplaceableGroup(511388516);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
                    changed = startRestartGroup.changed(interactionSource) | startRestartGroup.changed(snapshotStateList);
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (!changed || rememberedValue2 == Composer.Companion.getEmpty()) {
                        rememberedValue2 = new SliderDefaults$Thumb$1$1(interactionSource, snapshotStateList, null);
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    startRestartGroup.endReplaceableGroup();
                    EffectsKt.LaunchedEffect(interactionSource, (Function2) rememberedValue2, startRestartGroup, i8 | 64);
                    float f = snapshotStateList.isEmpty() ^ true ? SliderKt.ThumbPressedElevation : SliderKt.ThumbDefaultElevation;
                    Shape shape = ShapesKt.toShape(SliderTokens.INSTANCE.getHandleShape(), startRestartGroup, 6);
                    long j5 = j2;
                    Modifier hoverable$default = HoverableKt.hoverable$default(IndicationKt.indication(SizeKt.m796size6HolHcs(companion, j2), interactionSource, RippleKt.m1559rememberRipple9IZ8Weo(false, Dp.m5607constructorimpl(SliderTokens.INSTANCE.m2713getStateLayerSizeD9Ej5fM() / 2), 0L, startRestartGroup, 54, 4)), interactionSource, false, 2, null);
                    if (!z3) {
                        f = Dp.m5607constructorimpl(0);
                    }
                    SpacerKt.Spacer(BackgroundKt.m420backgroundbw27NRU(ShadowKt.m2930shadows4CzXII$default(hoverable$default, f, shape, false, 0L, 0L, 24, null), sliderColors2.thumbColor$material3_release(z3, startRestartGroup, ((i3 >> 3) & 112) | ((i3 >> 9) & 14)).getValue().m3301unboximpl(), shape), startRestartGroup, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = companion;
                    sliderColors3 = sliderColors2;
                    j4 = j5;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    modifier2 = companion;
                    sliderColors3 = sliderColors2;
                    z3 = z2;
                    j4 = j2;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                    return;
                }
                endRestartGroup.updateScope(new SliderDefaults$Thumb$2(this, interactionSource, modifier2, sliderColors3, z3, j4, i, i2));
                return;
            }
            z2 = z;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            if ((i2 & 32) != 0) {
            }
            if ((374491 & i3) == 74898) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i7 != 0) {
            }
            if ((i2 & 4) != 0) {
            }
            if (i4 != 0) {
            }
            if (i5 != 0) {
            }
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
            rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
            }
            startRestartGroup.endReplaceableGroup();
            snapshotStateList = (SnapshotStateList) rememberedValue;
            int i82 = i3 & 14;
            startRestartGroup.startReplaceableGroup(511388516);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
            changed = startRestartGroup.changed(interactionSource) | startRestartGroup.changed(snapshotStateList);
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (!changed) {
            }
            rememberedValue2 = new SliderDefaults$Thumb$1$1(interactionSource, snapshotStateList, null);
            startRestartGroup.updateRememberedValue(rememberedValue2);
            startRestartGroup.endReplaceableGroup();
            EffectsKt.LaunchedEffect(interactionSource, (Function2) rememberedValue2, startRestartGroup, i82 | 64);
            if (snapshotStateList.isEmpty() ^ true) {
            }
            Shape shape2 = ShapesKt.toShape(SliderTokens.INSTANCE.getHandleShape(), startRestartGroup, 6);
            long j52 = j2;
            Modifier hoverable$default2 = HoverableKt.hoverable$default(IndicationKt.indication(SizeKt.m796size6HolHcs(companion, j2), interactionSource, RippleKt.m1559rememberRipple9IZ8Weo(false, Dp.m5607constructorimpl(SliderTokens.INSTANCE.m2713getStateLayerSizeD9Ej5fM() / 2), 0L, startRestartGroup, 54, 4)), interactionSource, false, 2, null);
            if (!z3) {
            }
            SpacerKt.Spacer(BackgroundKt.m420backgroundbw27NRU(ShadowKt.m2930shadows4CzXII$default(hoverable$default2, f, shape2, false, 0L, 0L, 24, null), sliderColors2.thumbColor$material3_release(z3, startRestartGroup, ((i3 >> 3) & 112) | ((i3 >> 9) & 14)).getValue().m3301unboximpl(), shape2), startRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier2 = companion;
            sliderColors3 = sliderColors2;
            j4 = j52;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        companion = modifier;
        if ((i & 896) != 0) {
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z2 = z;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        if ((i2 & 32) != 0) {
        }
        if ((374491 & i3) == 74898) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i7 != 0) {
        }
        if ((i2 & 4) != 0) {
        }
        if (i4 != 0) {
        }
        if (i5 != 0) {
        }
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        startRestartGroup.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
        rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        snapshotStateList = (SnapshotStateList) rememberedValue;
        int i822 = i3 & 14;
        startRestartGroup.startReplaceableGroup(511388516);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
        changed = startRestartGroup.changed(interactionSource) | startRestartGroup.changed(snapshotStateList);
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        rememberedValue2 = new SliderDefaults$Thumb$1$1(interactionSource, snapshotStateList, null);
        startRestartGroup.updateRememberedValue(rememberedValue2);
        startRestartGroup.endReplaceableGroup();
        EffectsKt.LaunchedEffect(interactionSource, (Function2) rememberedValue2, startRestartGroup, i822 | 64);
        if (snapshotStateList.isEmpty() ^ true) {
        }
        Shape shape22 = ShapesKt.toShape(SliderTokens.INSTANCE.getHandleShape(), startRestartGroup, 6);
        long j522 = j2;
        Modifier hoverable$default22 = HoverableKt.hoverable$default(IndicationKt.indication(SizeKt.m796size6HolHcs(companion, j2), interactionSource, RippleKt.m1559rememberRipple9IZ8Weo(false, Dp.m5607constructorimpl(SliderTokens.INSTANCE.m2713getStateLayerSizeD9Ej5fM() / 2), 0L, startRestartGroup, 54, 4)), interactionSource, false, 2, null);
        if (!z3) {
        }
        SpacerKt.Spacer(BackgroundKt.m420backgroundbw27NRU(ShadowKt.m2930shadows4CzXII$default(hoverable$default22, f, shape22, false, 0L, 0L, 24, null), sliderColors2.thumbColor$material3_release(z3, startRestartGroup, ((i3 >> 3) & 112) | ((i3 >> 9) & 14)).getValue().m3301unboximpl(), shape22), startRestartGroup, 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier2 = companion;
        sliderColors3 = sliderColors2;
        j4 = j522;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0168 A[LOOP:0: B:86:0x0166->B:87:0x0168, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01a4  */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v3, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Track(SliderPositions sliderPositions, Modifier modifier, SliderColors sliderColors, boolean z, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        SliderColors sliderColors2;
        int i4;
        boolean z2;
        boolean z3;
        SliderColors sliderColors3;
        ?? r3;
        int i5;
        int i6;
        boolean z4;
        SliderDefaults$Track$1$1 rememberedValue;
        Composer composer2;
        ScopeUpdateScope endRestartGroup;
        int i7;
        Intrinsics.checkNotNullParameter(sliderPositions, "sliderPositions");
        Composer startRestartGroup = composer.startRestartGroup(-1546713545);
        ComposerKt.sourceInformation(startRestartGroup, "C(Track)P(3,2)1010@42874L8,1013@42965L35,1014@43039L34,1015@43113L34,1016@43185L33,1020@43314L1884,1017@43227L1971:Slider.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(sliderPositions) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            Object obj = modifier;
            i3 |= startRestartGroup.changed(obj) ? 32 : 16;
            modifier2 = obj;
            if ((i & 896) != 0) {
                if ((i2 & 4) == 0) {
                    sliderColors2 = sliderColors;
                    if (startRestartGroup.changed(sliderColors2)) {
                        i7 = 256;
                        i3 |= i7;
                    }
                } else {
                    sliderColors2 = sliderColors;
                }
                i7 = 128;
                i3 |= i7;
            } else {
                sliderColors2 = sliderColors;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
                z2 = z;
            } else {
                z2 = z;
                if ((i & 7168) == 0) {
                    i3 |= startRestartGroup.changed(z2) ? 2048 : 1024;
                }
            }
            if ((i2 & 16) == 0) {
                i3 |= 24576;
            } else if ((57344 & i) == 0) {
                i3 |= startRestartGroup.changed(this) ? 16384 : 8192;
            }
            if ((46811 & i3) == 9362 || !startRestartGroup.getSkipping()) {
                startRestartGroup.startDefaults();
                if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                    Modifier.Companion companion = i8 == 0 ? Modifier.Companion : modifier2;
                    if ((i2 & 4) == 0) {
                        z3 = true;
                        sliderColors3 = m1975colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, startRestartGroup, 0, (i3 >> 12) & 14, AnalyticsListener.EVENT_DRM_KEYS_LOADED);
                        i3 &= -897;
                    } else {
                        z3 = true;
                        sliderColors3 = sliderColors2;
                    }
                    z2 = i4 == 0 ? z3 ? 1 : 0 : z;
                    sliderColors2 = sliderColors3;
                    modifier2 = companion;
                    r3 = z3;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    r3 = 1;
                }
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1546713545, i3, -1, "androidx.compose.material3.SliderDefaults.Track (Slider.kt:1007)");
                }
                int i9 = ((i3 >> 9) & 14) | 48 | (i3 & 896);
                State<Color> trackColor$material3_release = sliderColors2.trackColor$material3_release(z2, false, startRestartGroup, i9);
                State<Color> trackColor$material3_release2 = sliderColors2.trackColor$material3_release(z2, r3, startRestartGroup, i9);
                State<Color> tickColor$material3_release = sliderColors2.tickColor$material3_release(z2, false, startRestartGroup, i9);
                State<Color> tickColor$material3_release2 = sliderColors2.tickColor$material3_release(z2, r3, startRestartGroup, i9);
                Modifier m781height3ABfNKs = SizeKt.m781height3ABfNKs(SizeKt.fillMaxWidth$default(modifier2, 0.0f, r3, null), SliderKt.getTrackHeight());
                Object[] objArr = new Object[5];
                objArr[0] = trackColor$material3_release;
                objArr[r3] = sliderPositions;
                objArr[2] = trackColor$material3_release2;
                objArr[3] = tickColor$material3_release;
                objArr[4] = tickColor$material3_release2;
                startRestartGroup.startReplaceableGroup(-568225417);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                i6 = 0;
                z4 = false;
                for (i5 = 5; i6 < i5; i5 = 5) {
                    z4 |= startRestartGroup.changed(objArr[i6]);
                    i6++;
                }
                rememberedValue = startRestartGroup.rememberedValue();
                if (!z4 || rememberedValue == Composer.Companion.getEmpty()) {
                    composer2 = startRestartGroup;
                    rememberedValue = new SliderDefaults$Track$1$1(trackColor$material3_release, sliderPositions, trackColor$material3_release2, tickColor$material3_release, tickColor$material3_release2);
                    composer2.updateRememberedValue(rememberedValue);
                } else {
                    composer2 = startRestartGroup;
                }
                composer2.endReplaceableGroup();
                CanvasKt.Canvas(m781height3ABfNKs, (Function1) rememberedValue, composer2, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                startRestartGroup.skipToGroupEnd();
                composer2 = startRestartGroup;
            }
            Modifier modifier3 = modifier2;
            SliderColors sliderColors4 = sliderColors2;
            boolean z5 = z2;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
                return;
            }
            endRestartGroup.updateScope(new SliderDefaults$Track$2(this, sliderPositions, modifier3, sliderColors4, z5, i, i2));
            return;
        }
        modifier2 = modifier;
        if ((i & 896) != 0) {
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        if ((i2 & 16) == 0) {
        }
        if ((46811 & i3) == 9362) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i8 == 0) {
        }
        if ((i2 & 4) == 0) {
        }
        if (i4 == 0) {
        }
        sliderColors2 = sliderColors3;
        modifier2 = companion;
        r3 = z3;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        int i92 = ((i3 >> 9) & 14) | 48 | (i3 & 896);
        State<Color> trackColor$material3_release3 = sliderColors2.trackColor$material3_release(z2, false, startRestartGroup, i92);
        State<Color> trackColor$material3_release22 = sliderColors2.trackColor$material3_release(z2, r3, startRestartGroup, i92);
        State<Color> tickColor$material3_release3 = sliderColors2.tickColor$material3_release(z2, false, startRestartGroup, i92);
        State<Color> tickColor$material3_release22 = sliderColors2.tickColor$material3_release(z2, r3, startRestartGroup, i92);
        Modifier m781height3ABfNKs2 = SizeKt.m781height3ABfNKs(SizeKt.fillMaxWidth$default(modifier2, 0.0f, r3, null), SliderKt.getTrackHeight());
        Object[] objArr2 = new Object[5];
        objArr2[0] = trackColor$material3_release3;
        objArr2[r3] = sliderPositions;
        objArr2[2] = trackColor$material3_release22;
        objArr2[3] = tickColor$material3_release3;
        objArr2[4] = tickColor$material3_release22;
        startRestartGroup.startReplaceableGroup(-568225417);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
        i6 = 0;
        z4 = false;
        while (i6 < i5) {
        }
        rememberedValue = startRestartGroup.rememberedValue();
        if (z4) {
        }
        composer2 = startRestartGroup;
        rememberedValue = new SliderDefaults$Track$1$1(trackColor$material3_release3, sliderPositions, trackColor$material3_release22, tickColor$material3_release3, tickColor$material3_release22);
        composer2.updateRememberedValue(rememberedValue);
        composer2.endReplaceableGroup();
        CanvasKt.Canvas(m781height3ABfNKs2, (Function1) rememberedValue, composer2, 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        Modifier modifier32 = modifier2;
        SliderColors sliderColors42 = sliderColors2;
        boolean z52 = z2;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }
}
