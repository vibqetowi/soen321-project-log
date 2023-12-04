package com.ifriend.ui.components.textfield;

import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
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
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.google.android.exoplayer2.C;
import com.ifriend.keychain.cipherStorage.CipherStorageKeystoreRsaEcb;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: TransparentTextField.kt */
@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a}\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0005j\u0002`\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0007¢\u0006\u0002\u0010\u0015¨\u0006\u0016"}, d2 = {"TransparentTextField", "", "text", "", "onTextChanged", "Lkotlin/Function1;", "Lcom/ifriend/ui/tools/OnTextChange;", "modifier", "Landroidx/compose/ui/Modifier;", "singleLine", "", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "placeholderTextStyle", "placeholder", "keyboardOptions", "Landroidx/compose/foundation/text/KeyboardOptions;", "keyboardActions", "Landroidx/compose/foundation/text/KeyboardActions;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Ljava/lang/String;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "common_ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TransparentTextFieldKt {
    /* JADX WARN: Removed duplicated region for block: B:101:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:169:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x011d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TransparentTextField(String text, Function1<? super String, Unit> onTextChanged, Modifier modifier, boolean z, TextStyle textStyle, TextStyle textStyle2, String str, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, MutableInteractionSource mutableInteractionSource, Composer composer, int i, int i2) {
        int i3;
        int i4;
        int i5;
        Object obj;
        Object obj2;
        int i6;
        Object obj3;
        int i7;
        int i8;
        TextStyle textStyle3;
        KeyboardActions keyboardActions2;
        MutableInteractionSource mutableInteractionSource2;
        KeyboardOptions keyboardOptions2;
        Modifier modifier2;
        boolean z2;
        TextStyle textStyle4;
        TextStyle textStyle5;
        String str2;
        KeyboardActions keyboardActions3;
        Composer composer2;
        String str3;
        Modifier modifier3;
        boolean z3;
        TextStyle textStyle6;
        KeyboardOptions keyboardOptions3;
        KeyboardActions keyboardActions4;
        MutableInteractionSource mutableInteractionSource3;
        TextStyle textStyle7;
        ScopeUpdateScope endRestartGroup;
        int i9;
        int i10;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(onTextChanged, "onTextChanged");
        Composer startRestartGroup = composer.startRestartGroup(863967637);
        ComposerKt.sourceInformation(startRestartGroup, "C(TransparentTextField)P(8,4,3,7,9,6,5,2,1)");
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
        int i11 = i2 & 4;
        if (i11 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
            } else if ((i & 7168) == 0) {
                i3 |= startRestartGroup.changed(z) ? 2048 : 1024;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((57344 & i) == 0) {
                    obj = textStyle;
                    i3 |= startRestartGroup.changed(obj) ? 16384 : 8192;
                    if ((i & 458752) != 0) {
                        if ((i2 & 32) == 0) {
                            obj2 = textStyle2;
                            if (startRestartGroup.changed(obj2)) {
                                i10 = 131072;
                                i3 |= i10;
                            }
                        } else {
                            obj2 = textStyle2;
                        }
                        i10 = 65536;
                        i3 |= i10;
                    } else {
                        obj2 = textStyle2;
                    }
                    i6 = i2 & 64;
                    if (i6 == 0) {
                        i3 |= 1572864;
                    } else if ((i & 3670016) == 0) {
                        obj3 = str;
                        i3 |= startRestartGroup.changed(obj3) ? 1048576 : 524288;
                        i7 = i2 & 128;
                        if (i7 != 0) {
                            i3 |= 12582912;
                        } else if ((i & 29360128) == 0) {
                            i3 |= startRestartGroup.changed(keyboardOptions) ? 8388608 : 4194304;
                        }
                        if ((i & 234881024) == 0) {
                            if ((i2 & 256) == 0 && startRestartGroup.changed(keyboardActions)) {
                                i9 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                                i3 |= i9;
                            }
                            i9 = 33554432;
                            i3 |= i9;
                        }
                        i8 = i2 & 512;
                        if (i8 != 0) {
                            i3 |= C.ENCODING_PCM_32BIT;
                        } else if ((i & 1879048192) == 0) {
                            i3 |= startRestartGroup.changed(mutableInteractionSource) ? 536870912 : 268435456;
                        }
                        if ((i3 & 1533916891) == 306783378 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                Modifier.Companion companion = i11 != 0 ? Modifier.Companion : modifier;
                                boolean z4 = i4 != 0 ? true : z;
                                TextStyle textStyle8 = i5 != 0 ? new TextStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16777215, (DefaultConstructorMarker) null) : obj;
                                if ((i2 & 32) != 0) {
                                    textStyle3 = r54.m5100copyv2rsoow((r48 & 1) != 0 ? r54.spanStyle.m5041getColor0d7_KjU() : Color.m3290copywmQWz5c$default(textStyle8.m5103getColor0d7_KjU(), 0.2f, 0.0f, 0.0f, 0.0f, 14, null), (r48 & 2) != 0 ? r54.spanStyle.m5042getFontSizeXSAIIZE() : 0L, (r48 & 4) != 0 ? r54.spanStyle.getFontWeight() : null, (r48 & 8) != 0 ? r54.spanStyle.m5043getFontStyle4Lr2A7w() : null, (r48 & 16) != 0 ? r54.spanStyle.m5044getFontSynthesisZQGJjVo() : null, (r48 & 32) != 0 ? r54.spanStyle.getFontFamily() : null, (r48 & 64) != 0 ? r54.spanStyle.getFontFeatureSettings() : null, (r48 & 128) != 0 ? r54.spanStyle.m5045getLetterSpacingXSAIIZE() : 0L, (r48 & 256) != 0 ? r54.spanStyle.m5040getBaselineShift5SSeXJ0() : null, (r48 & 512) != 0 ? r54.spanStyle.getTextGeometricTransform() : null, (r48 & 1024) != 0 ? r54.spanStyle.getLocaleList() : null, (r48 & 2048) != 0 ? r54.spanStyle.m5039getBackground0d7_KjU() : 0L, (r48 & 4096) != 0 ? r54.spanStyle.getTextDecoration() : null, (r48 & 8192) != 0 ? r54.spanStyle.getShadow() : null, (r48 & 16384) != 0 ? r54.spanStyle.getDrawStyle() : null, (r48 & 32768) != 0 ? r54.paragraphStyle.m4997getTextAlignbuA522U() : null, (r48 & 65536) != 0 ? r54.paragraphStyle.m4999getTextDirectionmmuk1to() : null, (r48 & 131072) != 0 ? r54.paragraphStyle.m4996getLineHeightXSAIIZE() : 0L, (r48 & 262144) != 0 ? r54.paragraphStyle.getTextIndent() : null, (r48 & 524288) != 0 ? r54.platformStyle : null, (r48 & 1048576) != 0 ? r54.paragraphStyle.getLineHeightStyle() : null, (r48 & 2097152) != 0 ? r54.paragraphStyle.m4994getLineBreakLgCVezo() : null, (r48 & 4194304) != 0 ? r54.paragraphStyle.m4992getHyphensEaSxIns() : null, (r48 & 8388608) != 0 ? textStyle8.paragraphStyle.getTextMotion() : null);
                                    i3 &= -458753;
                                } else {
                                    textStyle3 = textStyle2;
                                }
                                String str4 = i6 != 0 ? "" : obj3;
                                KeyboardOptions keyboardOptions4 = i7 != 0 ? new KeyboardOptions(0, false, 0, 0, 15, null) : keyboardOptions;
                                if ((i2 & 256) != 0) {
                                    keyboardActions2 = new KeyboardActions(null, null, null, null, null, null, 63, null);
                                    i3 &= -234881025;
                                } else {
                                    keyboardActions2 = keyboardActions;
                                }
                                if (i8 != 0) {
                                    startRestartGroup.startReplaceableGroup(-492369756);
                                    ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                                    Object rememberedValue = startRestartGroup.rememberedValue();
                                    if (rememberedValue == Composer.Companion.getEmpty()) {
                                        rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                        startRestartGroup.updateRememberedValue(rememberedValue);
                                    }
                                    startRestartGroup.endReplaceableGroup();
                                    keyboardOptions2 = keyboardOptions4;
                                    modifier2 = companion;
                                    mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
                                } else {
                                    mutableInteractionSource2 = mutableInteractionSource;
                                    keyboardOptions2 = keyboardOptions4;
                                    modifier2 = companion;
                                }
                                z2 = z4;
                                textStyle4 = textStyle8;
                                textStyle5 = textStyle3;
                                str2 = str4;
                                keyboardActions3 = keyboardActions2;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i2 & 32) != 0) {
                                    i3 &= -458753;
                                }
                                if ((i2 & 256) != 0) {
                                    i3 &= -234881025;
                                }
                                modifier2 = modifier;
                                z2 = z;
                                textStyle5 = textStyle2;
                                keyboardOptions2 = keyboardOptions;
                                keyboardActions3 = keyboardActions;
                                mutableInteractionSource2 = mutableInteractionSource;
                                textStyle4 = obj;
                                str2 = obj3;
                            }
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(863967637, i3, -1, "com.ifriend.ui.components.textfield.TransparentTextField (TransparentTextField.kt:33)");
                            }
                            int i12 = i3 >> 3;
                            String str5 = str2;
                            composer2 = startRestartGroup;
                            TextStyle textStyle9 = textStyle5;
                            BasicTextFieldKt.BasicTextField(text, onTextChanged, modifier2, true, false, textStyle4, keyboardOptions2, keyboardActions3, z2, 0, 0, (VisualTransformation) null, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource2, (Brush) new SolidColor(Color.Companion.m3328getWhite0d7_KjU(), null), (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) ComposableLambdaKt.composableLambda(startRestartGroup, -817984437, true, new TransparentTextFieldKt$TransparentTextField$2(text, str2, textStyle5, i3)), composer2, (i3 & 14) | CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE | (i3 & 112) | (i3 & 896) | ((i3 << 3) & 458752) | (i12 & 3670016) | (i12 & 29360128) | ((i3 << 15) & 234881024), ((i3 >> 18) & 7168) | 221184, 7696);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            str3 = str5;
                            modifier3 = modifier2;
                            z3 = z2;
                            textStyle6 = textStyle4;
                            keyboardOptions3 = keyboardOptions2;
                            keyboardActions4 = keyboardActions3;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            textStyle7 = textStyle9;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier3 = modifier;
                            z3 = z;
                            keyboardOptions3 = keyboardOptions;
                            keyboardActions4 = keyboardActions;
                            mutableInteractionSource3 = mutableInteractionSource;
                            composer2 = startRestartGroup;
                            textStyle6 = obj;
                            textStyle7 = obj2;
                            str3 = obj3;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                            return;
                        }
                        endRestartGroup.updateScope(new TransparentTextFieldKt$TransparentTextField$3(text, onTextChanged, modifier3, z3, textStyle6, textStyle7, str3, keyboardOptions3, keyboardActions4, mutableInteractionSource3, i, i2));
                        return;
                    }
                    obj3 = str;
                    i7 = i2 & 128;
                    if (i7 != 0) {
                    }
                    if ((i & 234881024) == 0) {
                    }
                    i8 = i2 & 512;
                    if (i8 != 0) {
                    }
                    if ((i3 & 1533916891) == 306783378) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i11 != 0) {
                    }
                    if (i4 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if ((i2 & 32) != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if ((i2 & 256) != 0) {
                    }
                    if (i8 != 0) {
                    }
                    z2 = z4;
                    textStyle4 = textStyle8;
                    textStyle5 = textStyle3;
                    str2 = str4;
                    keyboardActions3 = keyboardActions2;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    int i122 = i3 >> 3;
                    String str52 = str2;
                    composer2 = startRestartGroup;
                    TextStyle textStyle92 = textStyle5;
                    BasicTextFieldKt.BasicTextField(text, onTextChanged, modifier2, true, false, textStyle4, keyboardOptions2, keyboardActions3, z2, 0, 0, (VisualTransformation) null, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource2, (Brush) new SolidColor(Color.Companion.m3328getWhite0d7_KjU(), null), (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) ComposableLambdaKt.composableLambda(startRestartGroup, -817984437, true, new TransparentTextFieldKt$TransparentTextField$2(text, str2, textStyle5, i3)), composer2, (i3 & 14) | CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE | (i3 & 112) | (i3 & 896) | ((i3 << 3) & 458752) | (i122 & 3670016) | (i122 & 29360128) | ((i3 << 15) & 234881024), ((i3 >> 18) & 7168) | 221184, 7696);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    str3 = str52;
                    modifier3 = modifier2;
                    z3 = z2;
                    textStyle6 = textStyle4;
                    keyboardOptions3 = keyboardOptions2;
                    keyboardActions4 = keyboardActions3;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    textStyle7 = textStyle92;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                obj = textStyle;
                if ((i & 458752) != 0) {
                }
                i6 = i2 & 64;
                if (i6 == 0) {
                }
                obj3 = str;
                i7 = i2 & 128;
                if (i7 != 0) {
                }
                if ((i & 234881024) == 0) {
                }
                i8 = i2 & 512;
                if (i8 != 0) {
                }
                if ((i3 & 1533916891) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i11 != 0) {
                }
                if (i4 != 0) {
                }
                if (i5 != 0) {
                }
                if ((i2 & 32) != 0) {
                }
                if (i6 != 0) {
                }
                if (i7 != 0) {
                }
                if ((i2 & 256) != 0) {
                }
                if (i8 != 0) {
                }
                z2 = z4;
                textStyle4 = textStyle8;
                textStyle5 = textStyle3;
                str2 = str4;
                keyboardActions3 = keyboardActions2;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                int i1222 = i3 >> 3;
                String str522 = str2;
                composer2 = startRestartGroup;
                TextStyle textStyle922 = textStyle5;
                BasicTextFieldKt.BasicTextField(text, onTextChanged, modifier2, true, false, textStyle4, keyboardOptions2, keyboardActions3, z2, 0, 0, (VisualTransformation) null, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource2, (Brush) new SolidColor(Color.Companion.m3328getWhite0d7_KjU(), null), (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) ComposableLambdaKt.composableLambda(startRestartGroup, -817984437, true, new TransparentTextFieldKt$TransparentTextField$2(text, str2, textStyle5, i3)), composer2, (i3 & 14) | CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE | (i3 & 112) | (i3 & 896) | ((i3 << 3) & 458752) | (i1222 & 3670016) | (i1222 & 29360128) | ((i3 << 15) & 234881024), ((i3 >> 18) & 7168) | 221184, 7696);
                if (ComposerKt.isTraceInProgress()) {
                }
                str3 = str522;
                modifier3 = modifier2;
                z3 = z2;
                textStyle6 = textStyle4;
                keyboardOptions3 = keyboardOptions2;
                keyboardActions4 = keyboardActions3;
                mutableInteractionSource3 = mutableInteractionSource2;
                textStyle7 = textStyle922;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            obj = textStyle;
            if ((i & 458752) != 0) {
            }
            i6 = i2 & 64;
            if (i6 == 0) {
            }
            obj3 = str;
            i7 = i2 & 128;
            if (i7 != 0) {
            }
            if ((i & 234881024) == 0) {
            }
            i8 = i2 & 512;
            if (i8 != 0) {
            }
            if ((i3 & 1533916891) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i11 != 0) {
            }
            if (i4 != 0) {
            }
            if (i5 != 0) {
            }
            if ((i2 & 32) != 0) {
            }
            if (i6 != 0) {
            }
            if (i7 != 0) {
            }
            if ((i2 & 256) != 0) {
            }
            if (i8 != 0) {
            }
            z2 = z4;
            textStyle4 = textStyle8;
            textStyle5 = textStyle3;
            str2 = str4;
            keyboardActions3 = keyboardActions2;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            int i12222 = i3 >> 3;
            String str5222 = str2;
            composer2 = startRestartGroup;
            TextStyle textStyle9222 = textStyle5;
            BasicTextFieldKt.BasicTextField(text, onTextChanged, modifier2, true, false, textStyle4, keyboardOptions2, keyboardActions3, z2, 0, 0, (VisualTransformation) null, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource2, (Brush) new SolidColor(Color.Companion.m3328getWhite0d7_KjU(), null), (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) ComposableLambdaKt.composableLambda(startRestartGroup, -817984437, true, new TransparentTextFieldKt$TransparentTextField$2(text, str2, textStyle5, i3)), composer2, (i3 & 14) | CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE | (i3 & 112) | (i3 & 896) | ((i3 << 3) & 458752) | (i12222 & 3670016) | (i12222 & 29360128) | ((i3 << 15) & 234881024), ((i3 >> 18) & 7168) | 221184, 7696);
            if (ComposerKt.isTraceInProgress()) {
            }
            str3 = str5222;
            modifier3 = modifier2;
            z3 = z2;
            textStyle6 = textStyle4;
            keyboardOptions3 = keyboardOptions2;
            keyboardActions4 = keyboardActions3;
            mutableInteractionSource3 = mutableInteractionSource2;
            textStyle7 = textStyle9222;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        obj = textStyle;
        if ((i & 458752) != 0) {
        }
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        obj3 = str;
        i7 = i2 & 128;
        if (i7 != 0) {
        }
        if ((i & 234881024) == 0) {
        }
        i8 = i2 & 512;
        if (i8 != 0) {
        }
        if ((i3 & 1533916891) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i11 != 0) {
        }
        if (i4 != 0) {
        }
        if (i5 != 0) {
        }
        if ((i2 & 32) != 0) {
        }
        if (i6 != 0) {
        }
        if (i7 != 0) {
        }
        if ((i2 & 256) != 0) {
        }
        if (i8 != 0) {
        }
        z2 = z4;
        textStyle4 = textStyle8;
        textStyle5 = textStyle3;
        str2 = str4;
        keyboardActions3 = keyboardActions2;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        int i122222 = i3 >> 3;
        String str52222 = str2;
        composer2 = startRestartGroup;
        TextStyle textStyle92222 = textStyle5;
        BasicTextFieldKt.BasicTextField(text, onTextChanged, modifier2, true, false, textStyle4, keyboardOptions2, keyboardActions3, z2, 0, 0, (VisualTransformation) null, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource2, (Brush) new SolidColor(Color.Companion.m3328getWhite0d7_KjU(), null), (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) ComposableLambdaKt.composableLambda(startRestartGroup, -817984437, true, new TransparentTextFieldKt$TransparentTextField$2(text, str2, textStyle5, i3)), composer2, (i3 & 14) | CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE | (i3 & 112) | (i3 & 896) | ((i3 << 3) & 458752) | (i122222 & 3670016) | (i122222 & 29360128) | ((i3 << 15) & 234881024), ((i3 >> 18) & 7168) | 221184, 7696);
        if (ComposerKt.isTraceInProgress()) {
        }
        str3 = str52222;
        modifier3 = modifier2;
        z3 = z2;
        textStyle6 = textStyle4;
        keyboardOptions3 = keyboardOptions2;
        keyboardActions4 = keyboardActions3;
        mutableInteractionSource3 = mutableInteractionSource2;
        textStyle7 = textStyle92222;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }
}
