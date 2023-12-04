package com.ifriend.ui.components.text;

import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.profileinstaller.ProfileVerifier;
import com.ifriend.keychain.cipherStorage.CipherStorageKeystoreRsaEcb;
import com.ifriend.ui.theme.AppTheme;
import com.ifriend.ui.theme.AppThemeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: TypewriterText.kt */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\u001aG\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007¢\u0006\u0002\u0010\r\u001a\r\u0010\u000e\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u000f¨\u0006\u0010²\u0006\n\u0010\u0011\u001a\u00020\u0005X\u008a\u008e\u0002²\u0006\n\u0010\u0012\u001a\u00020\fX\u008a\u008e\u0002²\u0006\n\u0010\u0013\u001a\u00020\u0005X\u008a\u008e\u0002"}, d2 = {"TypewriterText", "", "modifier", "Landroidx/compose/ui/Modifier;", "text", "", "style", "Landroidx/compose/ui/text/TextStyle;", "durationMillis", "", "repeatDurationMillis", "isRepeat", "", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;JJZLandroidx/compose/runtime/Composer;II)V", "TypewriterTextPreview", "(Landroidx/compose/runtime/Composer;I)V", "common_ui_release", "typeText", "isFirst", "displayText"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TypewriterTextKt {
    public static final void TypewriterTextPreview(Composer composer, int i) {
        Composer startRestartGroup = composer.startRestartGroup(1219953745);
        ComposerKt.sourceInformation(startRestartGroup, "C(TypewriterTextPreview)");
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1219953745, i, -1, "com.ifriend.ui.components.text.TypewriterTextPreview (TypewriterText.kt:25)");
            }
            startRestartGroup.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("Chelsea Football Club is an English professional football club based in Fulham.", null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            MutableState mutableState = (MutableState) rememberedValue;
            startRestartGroup.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(true, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceableGroup();
            AppThemeKt.AppTheme(null, null, null, null, ComposableLambdaKt.composableLambda(startRestartGroup, -450645046, true, new TypewriterTextKt$TypewriterTextPreview$1(mutableState, (MutableState) rememberedValue2, "Founded in 1905, they play their home games at Stamford Bridge. The club competes in the Premier League", "Chelsea Football Club is an English professional football club based in Fulham.")), startRestartGroup, 24576, 15);
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
        endRestartGroup.updateScope(new TypewriterTextKt$TypewriterTextPreview$2(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String TypewriterTextPreview$lambda$1(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean TypewriterTextPreview$lambda$4(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void TypewriterTextPreview$lambda$5(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0197 A[LOOP:0: B:101:0x0195->B:102:0x0197, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x015b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TypewriterText(Modifier modifier, String text, TextStyle textStyle, long j, long j2, boolean z, Composer composer, int i, int i2) {
        int i3;
        TextStyle textStyle2;
        long j3;
        long j4;
        boolean z2;
        int i4;
        Modifier modifier2;
        boolean z3;
        long j5;
        int i5;
        TextStyle textStyle3;
        long j6;
        Object rememberedValue;
        boolean z4;
        TypewriterTextKt$TypewriterText$1$1 rememberedValue2;
        Composer composer2;
        Modifier modifier3;
        TextStyle textStyle4;
        long j7;
        long j8;
        boolean z5;
        ScopeUpdateScope endRestartGroup;
        int i6;
        Intrinsics.checkNotNullParameter(text, "text");
        Composer startRestartGroup = composer.startRestartGroup(44622367);
        ComposerKt.sourceInformation(startRestartGroup, "C(TypewriterText)P(2,5,4!1,3)");
        int i7 = i2 & 1;
        if (i7 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(text) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            if ((i2 & 4) == 0) {
                textStyle2 = textStyle;
                if (startRestartGroup.changed(textStyle2)) {
                    i6 = 256;
                    i3 |= i6;
                }
            } else {
                textStyle2 = textStyle;
            }
            i6 = 128;
            i3 |= i6;
        } else {
            textStyle2 = textStyle;
        }
        int i8 = i2 & 8;
        if (i8 != 0) {
            i3 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
            j3 = j;
        } else {
            j3 = j;
            if ((i & 7168) == 0) {
                i3 |= startRestartGroup.changed(j3) ? 2048 : 1024;
            }
        }
        int i9 = i2 & 16;
        if (i9 != 0) {
            i3 |= 24576;
            j4 = j2;
        } else {
            j4 = j2;
            if ((57344 & i) == 0) {
                i3 |= startRestartGroup.changed(j4) ? 16384 : 8192;
            }
        }
        int i10 = i2 & 32;
        if (i10 != 0) {
            i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((458752 & i) == 0) {
            z2 = z;
            i3 |= startRestartGroup.changed(z2) ? 131072 : 65536;
            if ((i3 & 374491) == 74898 || !startRestartGroup.getSkipping()) {
                startRestartGroup.startDefaults();
                if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                    Modifier.Companion companion = i7 == 0 ? Modifier.Companion : modifier;
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                        textStyle2 = AppTheme.INSTANCE.getTypography(startRestartGroup, 6).getTitleItemMedium();
                    }
                    if (i8 != 0) {
                        j3 = 50;
                    }
                    if (i9 != 0) {
                        j4 = 500;
                    }
                    modifier2 = companion;
                    if (i10 != 0) {
                        z3 = false;
                        j5 = j4;
                        i5 = i3;
                        textStyle3 = textStyle2;
                        j6 = j3;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(44622367, i5, -1, "com.ifriend.ui.components.text.TypewriterText (TypewriterText.kt:70)");
                        }
                        startRestartGroup.startReplaceableGroup(-492369756);
                        ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (rememberedValue == Composer.Companion.getEmpty()) {
                            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        startRestartGroup.endReplaceableGroup();
                        MutableState mutableState = (MutableState) rememberedValue;
                        Object[] objArr = {mutableState, text, Long.valueOf(j6), Boolean.valueOf(z3), Long.valueOf(j5)};
                        startRestartGroup.startReplaceableGroup(-568225417);
                        ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                        z4 = false;
                        for (i4 = 0; i4 < 5; i4++) {
                            z4 |= startRestartGroup.changed(objArr[i4]);
                        }
                        rememberedValue2 = startRestartGroup.rememberedValue();
                        if (!z4 || rememberedValue2 == Composer.Companion.getEmpty()) {
                            rememberedValue2 = new TypewriterTextKt$TypewriterText$1$1(text, j6, z3, j5, mutableState, null);
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                        }
                        startRestartGroup.endReplaceableGroup();
                        EffectsKt.LaunchedEffect(text, (Function2) rememberedValue2, startRestartGroup, ((i5 >> 3) & 14) | 64);
                        int i11 = i5;
                        composer2 = startRestartGroup;
                        TextKt.m2145Text4IGK_g(TypewriterText$lambda$7(mutableState), modifier2, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyle3, composer2, (i11 << 3) & 112, (i11 << 12) & 3670016, 65532);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier2;
                        textStyle4 = textStyle3;
                        j7 = j6;
                        j8 = j5;
                        z5 = z3;
                    }
                } else {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    modifier2 = modifier;
                }
                j5 = j4;
                textStyle3 = textStyle2;
                j6 = j3;
                z3 = z2;
                i5 = i3;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                startRestartGroup.startReplaceableGroup(-492369756);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.Companion.getEmpty()) {
                }
                startRestartGroup.endReplaceableGroup();
                MutableState mutableState2 = (MutableState) rememberedValue;
                Object[] objArr2 = {mutableState2, text, Long.valueOf(j6), Boolean.valueOf(z3), Long.valueOf(j5)};
                startRestartGroup.startReplaceableGroup(-568225417);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                z4 = false;
                while (i4 < 5) {
                }
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (!z4) {
                }
                rememberedValue2 = new TypewriterTextKt$TypewriterText$1$1(text, j6, z3, j5, mutableState2, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
                startRestartGroup.endReplaceableGroup();
                EffectsKt.LaunchedEffect(text, (Function2) rememberedValue2, startRestartGroup, ((i5 >> 3) & 14) | 64);
                int i112 = i5;
                composer2 = startRestartGroup;
                TextKt.m2145Text4IGK_g(TypewriterText$lambda$7(mutableState2), modifier2, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyle3, composer2, (i112 << 3) & 112, (i112 << 12) & 3670016, 65532);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier2;
                textStyle4 = textStyle3;
                j7 = j6;
                j8 = j5;
                z5 = z3;
            } else {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier;
                composer2 = startRestartGroup;
                z5 = z2;
                long j9 = j4;
                textStyle4 = textStyle2;
                j8 = j9;
                j7 = j3;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
                return;
            }
            endRestartGroup.updateScope(new TypewriterTextKt$TypewriterText$2(modifier3, text, textStyle4, j7, j8, z5, i, i2));
            return;
        }
        z2 = z;
        if ((i3 & 374491) == 74898) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i7 == 0) {
        }
        if ((i2 & 4) != 0) {
        }
        if (i8 != 0) {
        }
        if (i9 != 0) {
        }
        modifier2 = companion;
        if (i10 != 0) {
        }
        j5 = j4;
        textStyle3 = textStyle2;
        j6 = j3;
        z3 = z2;
        i5 = i3;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        startRestartGroup.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
        rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        MutableState mutableState22 = (MutableState) rememberedValue;
        Object[] objArr22 = {mutableState22, text, Long.valueOf(j6), Boolean.valueOf(z3), Long.valueOf(j5)};
        startRestartGroup.startReplaceableGroup(-568225417);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
        z4 = false;
        while (i4 < 5) {
        }
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (!z4) {
        }
        rememberedValue2 = new TypewriterTextKt$TypewriterText$1$1(text, j6, z3, j5, mutableState22, null);
        startRestartGroup.updateRememberedValue(rememberedValue2);
        startRestartGroup.endReplaceableGroup();
        EffectsKt.LaunchedEffect(text, (Function2) rememberedValue2, startRestartGroup, ((i5 >> 3) & 14) | 64);
        int i1122 = i5;
        composer2 = startRestartGroup;
        TextKt.m2145Text4IGK_g(TypewriterText$lambda$7(mutableState22), modifier2, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyle3, composer2, (i1122 << 3) & 112, (i1122 << 12) & 3670016, 65532);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier3 = modifier2;
        textStyle4 = textStyle3;
        j7 = j6;
        j8 = j5;
        z5 = z3;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    private static final String TypewriterText$lambda$7(MutableState<String> mutableState) {
        return mutableState.getValue();
    }
}
