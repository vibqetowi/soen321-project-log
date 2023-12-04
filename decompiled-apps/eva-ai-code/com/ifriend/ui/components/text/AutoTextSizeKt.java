package com.ifriend.ui.components.text;

import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.TextUnit;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.ifriend.keychain.cipherStorage.CipherStorageKeystoreRsaEcb;
import com.ifriend.ui.theme.AppTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: AutoTextSize.kt */
@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001ac\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u0012H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u001ac\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00152\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u0012H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0016\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0017²\u0006\n\u0010\u0018\u001a\u00020\u000fX\u008a\u008e\u0002²\u0006\n\u0010\u0019\u001a\u00020\u000fX\u008a\u008e\u0002²\u0006\n\u0010\u0018\u001a\u00020\u000fX\u008a\u008e\u0002²\u0006\n\u0010\u0019\u001a\u00020\u000fX\u008a\u008e\u0002"}, d2 = {"TEXT_SCALE_REDUCTION_INTERVAL", "", "AutoTextSize", "", "modifier", "Landroidx/compose/ui/Modifier;", "text", "Landroidx/compose/ui/text/AnnotatedString;", "color", "Landroidx/compose/ui/graphics/Color;", TtmlNode.ATTR_TTS_TEXT_ALIGN, "Landroidx/compose/ui/text/style/TextAlign;", "style", "Landroidx/compose/ui/text/TextStyle;", "targetTextSizeHeight", "Landroidx/compose/ui/unit/TextUnit;", "targetLineHeight", "maxLines", "", "AutoTextSize-toyU4E8", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/AnnotatedString;JLandroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/TextStyle;JJILandroidx/compose/runtime/Composer;II)V", "", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;JLandroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/TextStyle;JJILandroidx/compose/runtime/Composer;II)V", "common_ui_release", "textSize", "lineHeight"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AutoTextSizeKt {
    public static final float TEXT_SCALE_REDUCTION_INTERVAL = 0.9f;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:149:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e9  */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* renamed from: AutoTextSize-toyU4E8  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m7073AutoTextSizetoyU4E8(Modifier modifier, String text, long j, TextAlign textAlign, TextStyle style, long j2, long j3, int i, Composer composer, int i2, int i3) {
        int i4;
        long j4;
        Object obj;
        long j5;
        int i5;
        long j6;
        int i6;
        Modifier modifier2;
        long j7;
        Object obj2;
        long j8;
        long j9;
        Object rememberedValue;
        Object rememberedValue2;
        boolean changed;
        AutoTextSizeKt$AutoTextSize$1$1 rememberedValue3;
        Composer composer2;
        Modifier modifier3;
        long j10;
        TextAlign textAlign2;
        long j11;
        long j12;
        int i7;
        ScopeUpdateScope endRestartGroup;
        int i8;
        int i9;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(style, "style");
        Composer startRestartGroup = composer.startRestartGroup(-417397041);
        ComposerKt.sourceInformation(startRestartGroup, "C(AutoTextSize)P(2,6,0:c#ui.graphics.Color,7:c#ui.text.style.TextAlign,3,5:c#ui.unit.TextUnit,4:c#ui.unit.TextUnit)");
        int i10 = i3 & 1;
        if (i10 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i4 = (startRestartGroup.changed(modifier) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 112) == 0) {
            i4 |= startRestartGroup.changed(text) ? 32 : 16;
        }
        if ((i2 & 896) == 0) {
            if ((i3 & 4) == 0) {
                j4 = j;
                if (startRestartGroup.changed(j4)) {
                    i9 = 256;
                    i4 |= i9;
                }
            } else {
                j4 = j;
            }
            i9 = 128;
            i4 |= i9;
        } else {
            j4 = j;
        }
        int i11 = i3 & 8;
        if (i11 != 0) {
            i4 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
        } else if ((i2 & 7168) == 0) {
            obj = textAlign;
            i4 |= startRestartGroup.changed(obj) ? 2048 : 1024;
            if ((i3 & 16) == 0) {
                i4 |= 24576;
            } else if ((57344 & i2) == 0) {
                i4 |= startRestartGroup.changed(style) ? 16384 : 8192;
            }
            if ((458752 & i2) != 0) {
                if ((i3 & 32) == 0) {
                    j5 = j2;
                    if (startRestartGroup.changed(j5)) {
                        i8 = 131072;
                        i4 |= i8;
                    }
                } else {
                    j5 = j2;
                }
                i8 = 65536;
                i4 |= i8;
            } else {
                j5 = j2;
            }
            if ((i2 & 3670016) == 0) {
                i4 |= ((i3 & 64) == 0 && startRestartGroup.changed(j3)) ? 1048576 : 524288;
            }
            i5 = i3 & 128;
            if (i5 == 0) {
                i4 |= 12582912;
            } else if ((i2 & 29360128) == 0) {
                i4 |= startRestartGroup.changed(i) ? 8388608 : 4194304;
            }
            if ((23967451 & i4) == 4793490 || !startRestartGroup.getSkipping()) {
                startRestartGroup.startDefaults();
                if ((i2 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                    Modifier.Companion companion = i10 == 0 ? Modifier.Companion : modifier;
                    if ((i3 & 4) != 0) {
                        j4 = AppTheme.INSTANCE.getColors(startRestartGroup, 6).m7108getTextPrimary0d7_KjU();
                        i4 &= -897;
                    }
                    if (i11 != 0) {
                        obj = null;
                    }
                    if ((i3 & 32) != 0) {
                        j5 = style.m5104getFontSizeXSAIIZE();
                        i4 &= -458753;
                    }
                    if ((i3 & 64) == 0) {
                        j6 = style.m5110getLineHeightXSAIIZE();
                        i4 = (-3670017) & i4;
                    } else {
                        j6 = j3;
                    }
                    i6 = i5 == 0 ? 1 : i;
                    modifier2 = companion;
                    j7 = j4;
                    obj2 = obj;
                    j8 = j5;
                    j9 = j6;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    if ((i3 & 4) != 0) {
                        i4 &= -897;
                    }
                    if ((i3 & 32) != 0) {
                        i4 &= -458753;
                    }
                    if ((i3 & 64) != 0) {
                        i4 &= -3670017;
                    }
                    modifier2 = modifier;
                    j9 = j3;
                    i6 = i;
                    j7 = j4;
                    obj2 = obj;
                    j8 = j5;
                }
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-417397041, i4, -1, "com.ifriend.ui.components.text.AutoTextSize (AutoTextSize.kt:29)");
                }
                startRestartGroup.startReplaceableGroup(-492369756);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(TextUnit.m5778boximpl(j8), null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                startRestartGroup.endReplaceableGroup();
                MutableState mutableState = (MutableState) rememberedValue;
                startRestartGroup.startReplaceableGroup(-492369756);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == Composer.Companion.getEmpty()) {
                    rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(TextUnit.m5778boximpl(j9), null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                startRestartGroup.endReplaceableGroup();
                MutableState mutableState2 = (MutableState) rememberedValue2;
                long AutoTextSize_toyU4E8$lambda$1 = AutoTextSize_toyU4E8$lambda$1(mutableState);
                FontFamily fontFamily = style.getFontFamily();
                FontStyle m5105getFontStyle4Lr2A7w = style.m5105getFontStyle4Lr2A7w();
                FontWeight fontWeight = style.getFontWeight();
                long AutoTextSize_toyU4E8$lambda$4 = AutoTextSize_toyU4E8$lambda$4(mutableState2);
                int m5517getEllipsisgIe3tQ8 = TextOverflow.Companion.m5517getEllipsisgIe3tQ8();
                startRestartGroup.startReplaceableGroup(511388516);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
                changed = startRestartGroup.changed(mutableState) | startRestartGroup.changed(mutableState2);
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (!changed || rememberedValue3 == Composer.Companion.getEmpty()) {
                    rememberedValue3 = new AutoTextSizeKt$AutoTextSize$1$1(mutableState, mutableState2);
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                startRestartGroup.endReplaceableGroup();
                composer2 = startRestartGroup;
                TextKt.m2145Text4IGK_g(text, modifier2, j7, AutoTextSize_toyU4E8$lambda$1, m5105getFontStyle4Lr2A7w, fontWeight, fontFamily, 0L, (TextDecoration) null, obj2, AutoTextSize_toyU4E8$lambda$4, m5517getEllipsisgIe3tQ8, false, i6, 0, (Function1<? super TextLayoutResult, Unit>) rememberedValue3, (TextStyle) null, composer2, ((i4 >> 3) & 14) | ((i4 << 3) & 112) | (i4 & 896) | ((i4 << 18) & 1879048192), ((i4 >> 12) & 7168) | 48, 86400);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                j10 = j7;
                textAlign2 = obj2;
                j11 = j8;
                j12 = j9;
                i7 = i6;
            } else {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier;
                j10 = j4;
                textAlign2 = obj;
                j11 = j5;
                composer2 = startRestartGroup;
                j12 = j3;
                i7 = i;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
                return;
            }
            endRestartGroup.updateScope(new AutoTextSizeKt$AutoTextSize$2(modifier3, text, j10, textAlign2, style, j11, j12, i7, i2, i3));
            return;
        }
        obj = textAlign;
        if ((i3 & 16) == 0) {
        }
        if ((458752 & i2) != 0) {
        }
        if ((i2 & 3670016) == 0) {
        }
        i5 = i3 & 128;
        if (i5 == 0) {
        }
        if ((23967451 & i4) == 4793490) {
        }
        startRestartGroup.startDefaults();
        if ((i2 & 1) != 0) {
        }
        if (i10 == 0) {
        }
        if ((i3 & 4) != 0) {
        }
        if (i11 != 0) {
        }
        if ((i3 & 32) != 0) {
        }
        if ((i3 & 64) == 0) {
        }
        if (i5 == 0) {
        }
        modifier2 = companion;
        j7 = j4;
        obj2 = obj;
        j8 = j5;
        j9 = j6;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        startRestartGroup.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
        rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        MutableState mutableState3 = (MutableState) rememberedValue;
        startRestartGroup.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (rememberedValue2 == Composer.Companion.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        MutableState mutableState22 = (MutableState) rememberedValue2;
        long AutoTextSize_toyU4E8$lambda$12 = AutoTextSize_toyU4E8$lambda$1(mutableState3);
        FontFamily fontFamily2 = style.getFontFamily();
        FontStyle m5105getFontStyle4Lr2A7w2 = style.m5105getFontStyle4Lr2A7w();
        FontWeight fontWeight2 = style.getFontWeight();
        long AutoTextSize_toyU4E8$lambda$42 = AutoTextSize_toyU4E8$lambda$4(mutableState22);
        int m5517getEllipsisgIe3tQ82 = TextOverflow.Companion.m5517getEllipsisgIe3tQ8();
        startRestartGroup.startReplaceableGroup(511388516);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
        changed = startRestartGroup.changed(mutableState3) | startRestartGroup.changed(mutableState22);
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        rememberedValue3 = new AutoTextSizeKt$AutoTextSize$1$1(mutableState3, mutableState22);
        startRestartGroup.updateRememberedValue(rememberedValue3);
        startRestartGroup.endReplaceableGroup();
        composer2 = startRestartGroup;
        TextKt.m2145Text4IGK_g(text, modifier2, j7, AutoTextSize_toyU4E8$lambda$12, m5105getFontStyle4Lr2A7w2, fontWeight2, fontFamily2, 0L, (TextDecoration) null, obj2, AutoTextSize_toyU4E8$lambda$42, m5517getEllipsisgIe3tQ82, false, i6, 0, (Function1<? super TextLayoutResult, Unit>) rememberedValue3, (TextStyle) null, composer2, ((i4 >> 3) & 14) | ((i4 << 3) & 112) | (i4 & 896) | ((i4 << 18) & 1879048192), ((i4 >> 12) & 7168) | 48, 86400);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier3 = modifier2;
        j10 = j7;
        textAlign2 = obj2;
        j11 = j8;
        j12 = j9;
        i7 = i6;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long AutoTextSize_toyU4E8$lambda$1(MutableState<TextUnit> mutableState) {
        return mutableState.getValue().m5797unboximpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AutoTextSize_toyU4E8$lambda$2(MutableState<TextUnit> mutableState, long j) {
        mutableState.setValue(TextUnit.m5778boximpl(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long AutoTextSize_toyU4E8$lambda$4(MutableState<TextUnit> mutableState) {
        return mutableState.getValue().m5797unboximpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AutoTextSize_toyU4E8$lambda$5(MutableState<TextUnit> mutableState, long j) {
        mutableState.setValue(TextUnit.m5778boximpl(j));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:149:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e9  */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* renamed from: AutoTextSize-toyU4E8  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m7072AutoTextSizetoyU4E8(Modifier modifier, AnnotatedString text, long j, TextAlign textAlign, TextStyle style, long j2, long j3, int i, Composer composer, int i2, int i3) {
        int i4;
        long j4;
        Object obj;
        long j5;
        int i5;
        long j6;
        int i6;
        Modifier modifier2;
        long j7;
        Object obj2;
        long j8;
        long j9;
        Object rememberedValue;
        Object rememberedValue2;
        boolean changed;
        AutoTextSizeKt$AutoTextSize$3$1 rememberedValue3;
        Composer composer2;
        Modifier modifier3;
        long j10;
        TextAlign textAlign2;
        long j11;
        long j12;
        int i7;
        ScopeUpdateScope endRestartGroup;
        int i8;
        int i9;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(style, "style");
        Composer startRestartGroup = composer.startRestartGroup(-1731932345);
        ComposerKt.sourceInformation(startRestartGroup, "C(AutoTextSize)P(2,6,0:c#ui.graphics.Color,7:c#ui.text.style.TextAlign,3,5:c#ui.unit.TextUnit,4:c#ui.unit.TextUnit)");
        int i10 = i3 & 1;
        if (i10 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i4 = (startRestartGroup.changed(modifier) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 112) == 0) {
            i4 |= startRestartGroup.changed(text) ? 32 : 16;
        }
        if ((i2 & 896) == 0) {
            if ((i3 & 4) == 0) {
                j4 = j;
                if (startRestartGroup.changed(j4)) {
                    i9 = 256;
                    i4 |= i9;
                }
            } else {
                j4 = j;
            }
            i9 = 128;
            i4 |= i9;
        } else {
            j4 = j;
        }
        int i11 = i3 & 8;
        if (i11 != 0) {
            i4 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
        } else if ((i2 & 7168) == 0) {
            obj = textAlign;
            i4 |= startRestartGroup.changed(obj) ? 2048 : 1024;
            if ((i3 & 16) == 0) {
                i4 |= 24576;
            } else if ((57344 & i2) == 0) {
                i4 |= startRestartGroup.changed(style) ? 16384 : 8192;
            }
            if ((458752 & i2) != 0) {
                if ((i3 & 32) == 0) {
                    j5 = j2;
                    if (startRestartGroup.changed(j5)) {
                        i8 = 131072;
                        i4 |= i8;
                    }
                } else {
                    j5 = j2;
                }
                i8 = 65536;
                i4 |= i8;
            } else {
                j5 = j2;
            }
            if ((i2 & 3670016) == 0) {
                i4 |= ((i3 & 64) == 0 && startRestartGroup.changed(j3)) ? 1048576 : 524288;
            }
            i5 = i3 & 128;
            if (i5 == 0) {
                i4 |= 12582912;
            } else if ((i2 & 29360128) == 0) {
                i4 |= startRestartGroup.changed(i) ? 8388608 : 4194304;
            }
            if ((23967451 & i4) == 4793490 || !startRestartGroup.getSkipping()) {
                startRestartGroup.startDefaults();
                if ((i2 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                    Modifier.Companion companion = i10 == 0 ? Modifier.Companion : modifier;
                    if ((i3 & 4) != 0) {
                        j4 = AppTheme.INSTANCE.getColors(startRestartGroup, 6).m7108getTextPrimary0d7_KjU();
                        i4 &= -897;
                    }
                    if (i11 != 0) {
                        obj = null;
                    }
                    if ((i3 & 32) != 0) {
                        j5 = style.m5104getFontSizeXSAIIZE();
                        i4 &= -458753;
                    }
                    if ((i3 & 64) == 0) {
                        j6 = style.m5110getLineHeightXSAIIZE();
                        i4 = (-3670017) & i4;
                    } else {
                        j6 = j3;
                    }
                    i6 = i5 == 0 ? 1 : i;
                    modifier2 = companion;
                    j7 = j4;
                    obj2 = obj;
                    j8 = j5;
                    j9 = j6;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    if ((i3 & 4) != 0) {
                        i4 &= -897;
                    }
                    if ((i3 & 32) != 0) {
                        i4 &= -458753;
                    }
                    if ((i3 & 64) != 0) {
                        i4 &= -3670017;
                    }
                    modifier2 = modifier;
                    j9 = j3;
                    i6 = i;
                    j7 = j4;
                    obj2 = obj;
                    j8 = j5;
                }
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1731932345, i4, -1, "com.ifriend.ui.components.text.AutoTextSize (AutoTextSize.kt:66)");
                }
                startRestartGroup.startReplaceableGroup(-492369756);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(TextUnit.m5778boximpl(j8), null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                startRestartGroup.endReplaceableGroup();
                MutableState mutableState = (MutableState) rememberedValue;
                startRestartGroup.startReplaceableGroup(-492369756);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == Composer.Companion.getEmpty()) {
                    rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(TextUnit.m5778boximpl(j9), null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                startRestartGroup.endReplaceableGroup();
                MutableState mutableState2 = (MutableState) rememberedValue2;
                long AutoTextSize_toyU4E8$lambda$8 = AutoTextSize_toyU4E8$lambda$8(mutableState);
                FontFamily fontFamily = style.getFontFamily();
                FontStyle m5105getFontStyle4Lr2A7w = style.m5105getFontStyle4Lr2A7w();
                FontWeight fontWeight = style.getFontWeight();
                long AutoTextSize_toyU4E8$lambda$11 = AutoTextSize_toyU4E8$lambda$11(mutableState2);
                int m5517getEllipsisgIe3tQ8 = TextOverflow.Companion.m5517getEllipsisgIe3tQ8();
                startRestartGroup.startReplaceableGroup(511388516);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
                changed = startRestartGroup.changed(mutableState) | startRestartGroup.changed(mutableState2);
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (!changed || rememberedValue3 == Composer.Companion.getEmpty()) {
                    rememberedValue3 = new AutoTextSizeKt$AutoTextSize$3$1(mutableState, mutableState2);
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                startRestartGroup.endReplaceableGroup();
                composer2 = startRestartGroup;
                TextKt.m2146TextIbK3jfQ(text, modifier2, j7, AutoTextSize_toyU4E8$lambda$8, m5105getFontStyle4Lr2A7w, fontWeight, fontFamily, 0L, null, obj2, AutoTextSize_toyU4E8$lambda$11, m5517getEllipsisgIe3tQ8, false, i6, 0, null, rememberedValue3, null, composer2, ((i4 >> 3) & 14) | ((i4 << 3) & 112) | (i4 & 896) | ((i4 << 18) & 1879048192), ((i4 >> 12) & 7168) | 48, 184704);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                j10 = j7;
                textAlign2 = obj2;
                j11 = j8;
                j12 = j9;
                i7 = i6;
            } else {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier;
                j10 = j4;
                textAlign2 = obj;
                j11 = j5;
                composer2 = startRestartGroup;
                j12 = j3;
                i7 = i;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
                return;
            }
            endRestartGroup.updateScope(new AutoTextSizeKt$AutoTextSize$4(modifier3, text, j10, textAlign2, style, j11, j12, i7, i2, i3));
            return;
        }
        obj = textAlign;
        if ((i3 & 16) == 0) {
        }
        if ((458752 & i2) != 0) {
        }
        if ((i2 & 3670016) == 0) {
        }
        i5 = i3 & 128;
        if (i5 == 0) {
        }
        if ((23967451 & i4) == 4793490) {
        }
        startRestartGroup.startDefaults();
        if ((i2 & 1) != 0) {
        }
        if (i10 == 0) {
        }
        if ((i3 & 4) != 0) {
        }
        if (i11 != 0) {
        }
        if ((i3 & 32) != 0) {
        }
        if ((i3 & 64) == 0) {
        }
        if (i5 == 0) {
        }
        modifier2 = companion;
        j7 = j4;
        obj2 = obj;
        j8 = j5;
        j9 = j6;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        startRestartGroup.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
        rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        MutableState mutableState3 = (MutableState) rememberedValue;
        startRestartGroup.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (rememberedValue2 == Composer.Companion.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        MutableState mutableState22 = (MutableState) rememberedValue2;
        long AutoTextSize_toyU4E8$lambda$82 = AutoTextSize_toyU4E8$lambda$8(mutableState3);
        FontFamily fontFamily2 = style.getFontFamily();
        FontStyle m5105getFontStyle4Lr2A7w2 = style.m5105getFontStyle4Lr2A7w();
        FontWeight fontWeight2 = style.getFontWeight();
        long AutoTextSize_toyU4E8$lambda$112 = AutoTextSize_toyU4E8$lambda$11(mutableState22);
        int m5517getEllipsisgIe3tQ82 = TextOverflow.Companion.m5517getEllipsisgIe3tQ8();
        startRestartGroup.startReplaceableGroup(511388516);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
        changed = startRestartGroup.changed(mutableState3) | startRestartGroup.changed(mutableState22);
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        rememberedValue3 = new AutoTextSizeKt$AutoTextSize$3$1(mutableState3, mutableState22);
        startRestartGroup.updateRememberedValue(rememberedValue3);
        startRestartGroup.endReplaceableGroup();
        composer2 = startRestartGroup;
        TextKt.m2146TextIbK3jfQ(text, modifier2, j7, AutoTextSize_toyU4E8$lambda$82, m5105getFontStyle4Lr2A7w2, fontWeight2, fontFamily2, 0L, null, obj2, AutoTextSize_toyU4E8$lambda$112, m5517getEllipsisgIe3tQ82, false, i6, 0, null, rememberedValue3, null, composer2, ((i4 >> 3) & 14) | ((i4 << 3) & 112) | (i4 & 896) | ((i4 << 18) & 1879048192), ((i4 >> 12) & 7168) | 48, 184704);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier3 = modifier2;
        j10 = j7;
        textAlign2 = obj2;
        j11 = j8;
        j12 = j9;
        i7 = i6;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long AutoTextSize_toyU4E8$lambda$8(MutableState<TextUnit> mutableState) {
        return mutableState.getValue().m5797unboximpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AutoTextSize_toyU4E8$lambda$9(MutableState<TextUnit> mutableState, long j) {
        mutableState.setValue(TextUnit.m5778boximpl(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long AutoTextSize_toyU4E8$lambda$11(MutableState<TextUnit> mutableState) {
        return mutableState.getValue().m5797unboximpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AutoTextSize_toyU4E8$lambda$12(MutableState<TextUnit> mutableState, long j) {
        mutableState.setValue(TextUnit.m5778boximpl(j));
    }
}
