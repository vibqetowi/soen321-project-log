package androidx.compose.foundation.text;

import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.google.android.exoplayer2.C;
import com.ifriend.keychain.cipherStorage.CipherStorageKeystoreRsaEcb;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: BasicTextField.kt */
@Metadata(d1 = {"\u0000l\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\u001aâ\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\t2\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b23\b\u0002\u0010\u001c\u001a-\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00010\u001d¢\u0006\u0002\b\u001e¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(!\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u001eH\u0007¢\u0006\u0002\u0010\"\u001aì\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\t2\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010#\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b23\b\u0002\u0010\u001c\u001a-\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00010\u001d¢\u0006\u0002\b\u001e¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(!\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u001eH\u0007¢\u0006\u0002\u0010$\u001aâ\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020%2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\t2\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b23\b\u0002\u0010\u001c\u001a-\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00010\u001d¢\u0006\u0002\b\u001e¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(!\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u001eH\u0007¢\u0006\u0002\u0010&\u001aì\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020%2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\t2\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010#\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b23\b\u0002\u0010\u001c\u001a-\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00010\u001d¢\u0006\u0002\b\u001e¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(!\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u001eH\u0007¢\u0006\u0002\u0010'¨\u0006(²\u0006\n\u0010)\u001a\u00020\u0003X\u008a\u008e\u0002²\u0006\n\u0010*\u001a\u00020%X\u008a\u008e\u0002"}, d2 = {"BasicTextField", "", "value", "Landroidx/compose/ui/text/input/TextFieldValue;", "onValueChange", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "readOnly", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "keyboardOptions", "Landroidx/compose/foundation/text/KeyboardOptions;", "keyboardActions", "Landroidx/compose/foundation/text/KeyboardActions;", "singleLine", "maxLines", "", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "onTextLayout", "Landroidx/compose/ui/text/TextLayoutResult;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "cursorBrush", "Landroidx/compose/ui/graphics/Brush;", "decorationBox", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ParameterName;", "name", "innerTextField", "(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZILandroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "minLines", "(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZILandroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "foundation_release", "textFieldValueState", "lastTextValue"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BasicTextFieldKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x045f  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x04c4  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x04de  */
    /* JADX WARN: Removed duplicated region for block: B:274:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0139  */
    /* JADX WARN: Type inference failed for: r6v12 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BasicTextField(String value, Function1<? super String, Unit> onValueChange, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z3, int i, int i2, VisualTransformation visualTransformation, Function1<? super TextLayoutResult, Unit> function1, MutableInteractionSource mutableInteractionSource, Brush brush, Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> function3, Composer composer, int i3, int i4, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        Modifier.Companion companion;
        boolean z4;
        KeyboardActions keyboardActions2;
        int i20;
        boolean z5;
        MutableInteractionSource mutableInteractionSource2;
        int i21;
        int i22;
        SolidColor solidColor;
        int i23;
        Function3<Function2<? super Composer, ? super Integer, Unit>, Composer, Integer, Unit> function32;
        MutableInteractionSource mutableInteractionSource3;
        Brush brush2;
        VisualTransformation visualTransformation2;
        Function1<? super TextLayoutResult, Unit> function12;
        boolean z6;
        TextStyle textStyle2;
        KeyboardOptions keyboardOptions2;
        boolean z7;
        int i24;
        int i25;
        Object rememberedValue;
        boolean changed;
        BasicTextFieldKt$BasicTextField$3$1 rememberedValue2;
        boolean changed2;
        Object rememberedValue3;
        boolean changed3;
        BasicTextFieldKt$BasicTextField$4$1 rememberedValue4;
        boolean z8;
        KeyboardOptions keyboardOptions3;
        int i26;
        TextStyle textStyle3;
        VisualTransformation visualTransformation3;
        Function1<? super TextLayoutResult, Unit> function13;
        Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> function33;
        boolean z9;
        int i27;
        Modifier modifier2;
        ScopeUpdateScope endRestartGroup;
        int i28;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        Composer startRestartGroup = composer.startRestartGroup(945255183);
        ComposerKt.sourceInformation(startRestartGroup, "C(BasicTextField)P(14,10,8,2,11,13,5,4,12,6,7,15,9,3)136@7932L39,143@8326L57,149@8679L216,149@8668L227,158@9216L41,162@9334L373,160@9263L1032:BasicTextField.kt#423gt5");
        if ((i5 & 1) != 0) {
            i6 = i3 | 6;
        } else if ((i3 & 14) == 0) {
            i6 = (startRestartGroup.changed(value) ? 4 : 2) | i3;
        } else {
            i6 = i3;
        }
        if ((i5 & 2) != 0) {
            i6 |= 48;
        } else if ((i3 & 112) == 0) {
            i6 |= startRestartGroup.changedInstance(onValueChange) ? 32 : 16;
        }
        int i29 = i5 & 4;
        if (i29 != 0) {
            i6 |= 384;
        } else if ((i3 & 896) == 0) {
            i6 |= startRestartGroup.changed(modifier) ? 256 : 128;
            i7 = i5 & 8;
            if (i7 == 0) {
                i6 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
            } else if ((i3 & 7168) == 0) {
                i6 |= startRestartGroup.changed(z) ? 2048 : 1024;
                i8 = i5 & 16;
                if (i8 != 0) {
                    i6 |= 24576;
                } else if ((i3 & 57344) == 0) {
                    i6 |= startRestartGroup.changed(z2) ? 16384 : 8192;
                }
                i9 = i5 & 32;
                if (i9 != 0) {
                    i6 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i3 & 458752) == 0) {
                    i6 |= startRestartGroup.changed(textStyle) ? 131072 : 65536;
                }
                i10 = i5 & 64;
                if (i10 != 0) {
                    i6 |= 1572864;
                } else if ((i3 & 3670016) == 0) {
                    i6 |= startRestartGroup.changed(keyboardOptions) ? 1048576 : 524288;
                }
                i11 = i5 & 128;
                if (i11 != 0) {
                    i6 |= 12582912;
                } else if ((i3 & 29360128) == 0) {
                    i6 |= startRestartGroup.changed(keyboardActions) ? 8388608 : 4194304;
                }
                i12 = i5 & 256;
                if (i12 != 0) {
                    i6 |= 100663296;
                } else if ((i3 & 234881024) == 0) {
                    i6 |= startRestartGroup.changed(z3) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                }
                if ((i3 & 1879048192) == 0) {
                    if ((i5 & 512) == 0 && startRestartGroup.changed(i)) {
                        i28 = 536870912;
                        i6 |= i28;
                    }
                    i28 = 268435456;
                    i6 |= i28;
                }
                i13 = i5 & 1024;
                if (i13 != 0) {
                    i14 = i4 | 6;
                } else if ((i4 & 14) == 0) {
                    i14 = i4 | (startRestartGroup.changed(i2) ? 4 : 2);
                } else {
                    i14 = i4;
                }
                i15 = i5 & 2048;
                if (i15 != 0) {
                    i14 |= 48;
                } else if ((i4 & 112) == 0) {
                    i14 |= startRestartGroup.changed(visualTransformation) ? 32 : 16;
                }
                int i30 = i14;
                i16 = i5 & 4096;
                if (i16 != 0) {
                    i30 |= 384;
                } else if ((i4 & 896) == 0) {
                    i30 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
                    i17 = i5 & 8192;
                    if (i17 == 0) {
                        i30 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
                    } else if ((i4 & 7168) == 0) {
                        i30 |= startRestartGroup.changed(mutableInteractionSource) ? 2048 : 1024;
                        i18 = i5 & 16384;
                        if (i18 != 0) {
                            i30 |= 24576;
                        } else if ((i4 & 57344) == 0) {
                            i30 |= startRestartGroup.changed(brush) ? 16384 : 8192;
                        }
                        i19 = i5 & 32768;
                        if (i19 != 0) {
                            i30 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        } else if ((i4 & 458752) == 0) {
                            i30 |= startRestartGroup.changedInstance(function3) ? 131072 : 65536;
                        }
                        if ((i6 & 1533916891) == 306783378 || (374491 & i30) != 74898 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            if ((i3 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                companion = i29 != 0 ? Modifier.Companion : modifier;
                                z4 = i7 != 0 ? true : z;
                                boolean z10 = i8 != 0 ? false : z2;
                                TextStyle textStyle4 = i9 != 0 ? TextStyle.Companion.getDefault() : textStyle;
                                KeyboardOptions keyboardOptions4 = i10 != 0 ? KeyboardOptions.Companion.getDefault() : keyboardOptions;
                                keyboardActions2 = i11 != 0 ? KeyboardActions.Companion.getDefault() : keyboardActions;
                                boolean z11 = i12 != 0 ? false : z3;
                                if ((i5 & 512) != 0) {
                                    i20 = z11 ? 1 : Integer.MAX_VALUE;
                                    i6 &= -1879048193;
                                } else {
                                    i20 = i;
                                }
                                int i31 = i13 != 0 ? 1 : i2;
                                VisualTransformation none = i15 != 0 ? VisualTransformation.Companion.getNone() : visualTransformation;
                                BasicTextFieldKt$BasicTextField$1 basicTextFieldKt$BasicTextField$1 = i16 != 0 ? BasicTextFieldKt$BasicTextField$1.INSTANCE : function1;
                                if (i17 != 0) {
                                    startRestartGroup.startReplaceableGroup(-492369756);
                                    ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                                    Object rememberedValue5 = startRestartGroup.rememberedValue();
                                    z5 = z11;
                                    if (rememberedValue5 == Composer.Companion.getEmpty()) {
                                        rememberedValue5 = InteractionSourceKt.MutableInteractionSource();
                                        startRestartGroup.updateRememberedValue(rememberedValue5);
                                    }
                                    startRestartGroup.endReplaceableGroup();
                                    mutableInteractionSource2 = (MutableInteractionSource) rememberedValue5;
                                } else {
                                    z5 = z11;
                                    mutableInteractionSource2 = mutableInteractionSource;
                                }
                                if (i18 != 0) {
                                    i21 = i6;
                                    i22 = i31;
                                    solidColor = new SolidColor(Color.Companion.m3317getBlack0d7_KjU(), null);
                                } else {
                                    i21 = i6;
                                    i22 = i31;
                                    solidColor = brush;
                                }
                                if (i19 != 0) {
                                    i23 = i22;
                                    mutableInteractionSource3 = mutableInteractionSource2;
                                    brush2 = solidColor;
                                    function32 = ComposableSingletons$BasicTextFieldKt.INSTANCE.m1026getLambda1$foundation_release();
                                } else {
                                    i23 = i22;
                                    function32 = function3;
                                    mutableInteractionSource3 = mutableInteractionSource2;
                                    brush2 = solidColor;
                                }
                                visualTransformation2 = none;
                                function12 = basicTextFieldKt$BasicTextField$1;
                                z6 = z10;
                                textStyle2 = textStyle4;
                                keyboardOptions2 = keyboardOptions4;
                                z7 = z5;
                                i24 = i21;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i5 & 512) != 0) {
                                    i6 &= -1879048193;
                                }
                                companion = modifier;
                                z4 = z;
                                z6 = z2;
                                keyboardOptions2 = keyboardOptions;
                                keyboardActions2 = keyboardActions;
                                z7 = z3;
                                i20 = i;
                                i23 = i2;
                                visualTransformation2 = visualTransformation;
                                function12 = function1;
                                mutableInteractionSource3 = mutableInteractionSource;
                                brush2 = brush;
                                function32 = function3;
                                i24 = i6;
                                textStyle2 = textStyle;
                            }
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                i25 = i20;
                                ComposerKt.traceEventStart(945255183, i24, i30, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:122)");
                            } else {
                                i25 = i20;
                            }
                            startRestartGroup.startReplaceableGroup(-492369756);
                            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == Composer.Companion.getEmpty()) {
                                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new TextFieldValue(value, 0L, (TextRange) null, 6, (DefaultConstructorMarker) null), null, 2, null);
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            startRestartGroup.endReplaceableGroup();
                            MutableState mutableState = (MutableState) rememberedValue;
                            TextFieldValue m5321copy3r_uNRQ$default = TextFieldValue.m5321copy3r_uNRQ$default(BasicTextField$lambda$2(mutableState), value, 0L, (TextRange) null, 6, (Object) null);
                            startRestartGroup.startReplaceableGroup(511388516);
                            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
                            changed = startRestartGroup.changed(m5321copy3r_uNRQ$default) | startRestartGroup.changed(mutableState);
                            boolean z12 = z6;
                            rememberedValue2 = startRestartGroup.rememberedValue();
                            if (!changed || rememberedValue2 == Composer.Companion.getEmpty()) {
                                rememberedValue2 = new BasicTextFieldKt$BasicTextField$3$1(m5321copy3r_uNRQ$default, mutableState);
                                startRestartGroup.updateRememberedValue(rememberedValue2);
                            }
                            startRestartGroup.endReplaceableGroup();
                            EffectsKt.SideEffect((Function0) rememberedValue2, startRestartGroup, 0);
                            startRestartGroup.startReplaceableGroup(1157296644);
                            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                            changed2 = startRestartGroup.changed(value);
                            rememberedValue3 = startRestartGroup.rememberedValue();
                            if (!changed2 || rememberedValue3 == Composer.Companion.getEmpty()) {
                                rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(value, null, 2, null);
                                startRestartGroup.updateRememberedValue(rememberedValue3);
                            }
                            startRestartGroup.endReplaceableGroup();
                            MutableState mutableState2 = (MutableState) rememberedValue3;
                            ImeOptions imeOptions$foundation_release = keyboardOptions2.toImeOptions$foundation_release(z7);
                            boolean z13 = !z7;
                            int i32 = z7 ? 1 : i23;
                            int i33 = z7 ? 1 : i25;
                            startRestartGroup.startReplaceableGroup(1618982084);
                            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2,3):Composables.kt#9igjgp");
                            KeyboardOptions keyboardOptions5 = keyboardOptions2;
                            changed3 = startRestartGroup.changed(mutableState) | startRestartGroup.changed(mutableState2) | startRestartGroup.changed(onValueChange);
                            boolean z14 = z7;
                            rememberedValue4 = startRestartGroup.rememberedValue();
                            if (!changed3 || rememberedValue4 == Composer.Companion.getEmpty()) {
                                rememberedValue4 = new BasicTextFieldKt$BasicTextField$4$1(onValueChange, mutableState, mutableState2);
                                startRestartGroup.updateRememberedValue(rememberedValue4);
                            }
                            startRestartGroup.endReplaceableGroup();
                            int i34 = i30 << 9;
                            CoreTextFieldKt.CoreTextField(m5321copy3r_uNRQ$default, rememberedValue4, companion, textStyle2, visualTransformation2, function12, mutableInteractionSource3, brush2, z13, i33, i32, imeOptions$foundation_release, keyboardActions2, z4, z12, function32, startRestartGroup, (i24 & 896) | ((i24 >> 6) & 7168) | (i34 & 57344) | (i34 & 458752) | (3670016 & i34) | (i34 & 29360128), ((i24 >> 15) & 896) | (i24 & 7168) | (i24 & 57344) | (i30 & 458752), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z8 = z12;
                            keyboardOptions3 = keyboardOptions5;
                            i26 = i23;
                            textStyle3 = textStyle2;
                            visualTransformation3 = visualTransformation2;
                            function13 = function12;
                            function33 = function32;
                            z9 = z14;
                            i27 = i25;
                            modifier2 = companion;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier2 = modifier;
                            z4 = z;
                            z8 = z2;
                            textStyle3 = textStyle;
                            keyboardOptions3 = keyboardOptions;
                            keyboardActions2 = keyboardActions;
                            z9 = z3;
                            i27 = i;
                            i26 = i2;
                            visualTransformation3 = visualTransformation;
                            function13 = function1;
                            mutableInteractionSource3 = mutableInteractionSource;
                            brush2 = brush;
                            function33 = function3;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup == null) {
                            return;
                        }
                        endRestartGroup.updateScope(new BasicTextFieldKt$BasicTextField$5(value, onValueChange, modifier2, z4, z8, textStyle3, keyboardOptions3, keyboardActions2, z9, i27, i26, visualTransformation3, function13, mutableInteractionSource3, brush2, function33, i3, i4, i5));
                        return;
                    }
                    i18 = i5 & 16384;
                    if (i18 != 0) {
                    }
                    i19 = i5 & 32768;
                    if (i19 != 0) {
                    }
                    if ((i6 & 1533916891) == 306783378) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i3 & 1) != 0) {
                    }
                    if (i29 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (i9 != 0) {
                    }
                    if (i10 != 0) {
                    }
                    if (i11 != 0) {
                    }
                    if (i12 != 0) {
                    }
                    if ((i5 & 512) != 0) {
                    }
                    if (i13 != 0) {
                    }
                    if (i15 != 0) {
                    }
                    if (i16 != 0) {
                    }
                    if (i17 != 0) {
                    }
                    if (i18 != 0) {
                    }
                    if (i19 != 0) {
                    }
                    visualTransformation2 = none;
                    function12 = basicTextFieldKt$BasicTextField$1;
                    z6 = z10;
                    textStyle2 = textStyle4;
                    keyboardOptions2 = keyboardOptions4;
                    z7 = z5;
                    i24 = i21;
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
                    TextFieldValue m5321copy3r_uNRQ$default2 = TextFieldValue.m5321copy3r_uNRQ$default(BasicTextField$lambda$2(mutableState3), value, 0L, (TextRange) null, 6, (Object) null);
                    startRestartGroup.startReplaceableGroup(511388516);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
                    changed = startRestartGroup.changed(m5321copy3r_uNRQ$default2) | startRestartGroup.changed(mutableState3);
                    boolean z122 = z6;
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (!changed) {
                    }
                    rememberedValue2 = new BasicTextFieldKt$BasicTextField$3$1(m5321copy3r_uNRQ$default2, mutableState3);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                    startRestartGroup.endReplaceableGroup();
                    EffectsKt.SideEffect((Function0) rememberedValue2, startRestartGroup, 0);
                    startRestartGroup.startReplaceableGroup(1157296644);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                    changed2 = startRestartGroup.changed(value);
                    rememberedValue3 = startRestartGroup.rememberedValue();
                    if (!changed2) {
                    }
                    rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(value, null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                    startRestartGroup.endReplaceableGroup();
                    MutableState mutableState22 = (MutableState) rememberedValue3;
                    ImeOptions imeOptions$foundation_release2 = keyboardOptions2.toImeOptions$foundation_release(z7);
                    boolean z132 = !z7;
                    if (z7) {
                    }
                    if (z7) {
                    }
                    startRestartGroup.startReplaceableGroup(1618982084);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2,3):Composables.kt#9igjgp");
                    KeyboardOptions keyboardOptions52 = keyboardOptions2;
                    changed3 = startRestartGroup.changed(mutableState3) | startRestartGroup.changed(mutableState22) | startRestartGroup.changed(onValueChange);
                    boolean z142 = z7;
                    rememberedValue4 = startRestartGroup.rememberedValue();
                    if (!changed3) {
                    }
                    rememberedValue4 = new BasicTextFieldKt$BasicTextField$4$1(onValueChange, mutableState3, mutableState22);
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                    startRestartGroup.endReplaceableGroup();
                    int i342 = i30 << 9;
                    CoreTextFieldKt.CoreTextField(m5321copy3r_uNRQ$default2, rememberedValue4, companion, textStyle2, visualTransformation2, function12, mutableInteractionSource3, brush2, z132, i33, i32, imeOptions$foundation_release2, keyboardActions2, z4, z122, function32, startRestartGroup, (i24 & 896) | ((i24 >> 6) & 7168) | (i342 & 57344) | (i342 & 458752) | (3670016 & i342) | (i342 & 29360128), ((i24 >> 15) & 896) | (i24 & 7168) | (i24 & 57344) | (i30 & 458752), 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    z8 = z122;
                    keyboardOptions3 = keyboardOptions52;
                    i26 = i23;
                    textStyle3 = textStyle2;
                    visualTransformation3 = visualTransformation2;
                    function13 = function12;
                    function33 = function32;
                    z9 = z142;
                    i27 = i25;
                    modifier2 = companion;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                i17 = i5 & 8192;
                if (i17 == 0) {
                }
                i18 = i5 & 16384;
                if (i18 != 0) {
                }
                i19 = i5 & 32768;
                if (i19 != 0) {
                }
                if ((i6 & 1533916891) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i3 & 1) != 0) {
                }
                if (i29 != 0) {
                }
                if (i7 != 0) {
                }
                if (i8 != 0) {
                }
                if (i9 != 0) {
                }
                if (i10 != 0) {
                }
                if (i11 != 0) {
                }
                if (i12 != 0) {
                }
                if ((i5 & 512) != 0) {
                }
                if (i13 != 0) {
                }
                if (i15 != 0) {
                }
                if (i16 != 0) {
                }
                if (i17 != 0) {
                }
                if (i18 != 0) {
                }
                if (i19 != 0) {
                }
                visualTransformation2 = none;
                function12 = basicTextFieldKt$BasicTextField$1;
                z6 = z10;
                textStyle2 = textStyle4;
                keyboardOptions2 = keyboardOptions4;
                z7 = z5;
                i24 = i21;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                startRestartGroup.startReplaceableGroup(-492369756);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.Companion.getEmpty()) {
                }
                startRestartGroup.endReplaceableGroup();
                MutableState mutableState32 = (MutableState) rememberedValue;
                TextFieldValue m5321copy3r_uNRQ$default22 = TextFieldValue.m5321copy3r_uNRQ$default(BasicTextField$lambda$2(mutableState32), value, 0L, (TextRange) null, 6, (Object) null);
                startRestartGroup.startReplaceableGroup(511388516);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
                changed = startRestartGroup.changed(m5321copy3r_uNRQ$default22) | startRestartGroup.changed(mutableState32);
                boolean z1222 = z6;
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (!changed) {
                }
                rememberedValue2 = new BasicTextFieldKt$BasicTextField$3$1(m5321copy3r_uNRQ$default22, mutableState32);
                startRestartGroup.updateRememberedValue(rememberedValue2);
                startRestartGroup.endReplaceableGroup();
                EffectsKt.SideEffect((Function0) rememberedValue2, startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(1157296644);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                changed2 = startRestartGroup.changed(value);
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (!changed2) {
                }
                rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(value, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue3);
                startRestartGroup.endReplaceableGroup();
                MutableState mutableState222 = (MutableState) rememberedValue3;
                ImeOptions imeOptions$foundation_release22 = keyboardOptions2.toImeOptions$foundation_release(z7);
                boolean z1322 = !z7;
                if (z7) {
                }
                if (z7) {
                }
                startRestartGroup.startReplaceableGroup(1618982084);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2,3):Composables.kt#9igjgp");
                KeyboardOptions keyboardOptions522 = keyboardOptions2;
                changed3 = startRestartGroup.changed(mutableState32) | startRestartGroup.changed(mutableState222) | startRestartGroup.changed(onValueChange);
                boolean z1422 = z7;
                rememberedValue4 = startRestartGroup.rememberedValue();
                if (!changed3) {
                }
                rememberedValue4 = new BasicTextFieldKt$BasicTextField$4$1(onValueChange, mutableState32, mutableState222);
                startRestartGroup.updateRememberedValue(rememberedValue4);
                startRestartGroup.endReplaceableGroup();
                int i3422 = i30 << 9;
                CoreTextFieldKt.CoreTextField(m5321copy3r_uNRQ$default22, rememberedValue4, companion, textStyle2, visualTransformation2, function12, mutableInteractionSource3, brush2, z1322, i33, i32, imeOptions$foundation_release22, keyboardActions2, z4, z1222, function32, startRestartGroup, (i24 & 896) | ((i24 >> 6) & 7168) | (i3422 & 57344) | (i3422 & 458752) | (3670016 & i3422) | (i3422 & 29360128), ((i24 >> 15) & 896) | (i24 & 7168) | (i24 & 57344) | (i30 & 458752), 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                z8 = z1222;
                keyboardOptions3 = keyboardOptions522;
                i26 = i23;
                textStyle3 = textStyle2;
                visualTransformation3 = visualTransformation2;
                function13 = function12;
                function33 = function32;
                z9 = z1422;
                i27 = i25;
                modifier2 = companion;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            i8 = i5 & 16;
            if (i8 != 0) {
            }
            i9 = i5 & 32;
            if (i9 != 0) {
            }
            i10 = i5 & 64;
            if (i10 != 0) {
            }
            i11 = i5 & 128;
            if (i11 != 0) {
            }
            i12 = i5 & 256;
            if (i12 != 0) {
            }
            if ((i3 & 1879048192) == 0) {
            }
            i13 = i5 & 1024;
            if (i13 != 0) {
            }
            i15 = i5 & 2048;
            if (i15 != 0) {
            }
            int i302 = i14;
            i16 = i5 & 4096;
            if (i16 != 0) {
            }
            i17 = i5 & 8192;
            if (i17 == 0) {
            }
            i18 = i5 & 16384;
            if (i18 != 0) {
            }
            i19 = i5 & 32768;
            if (i19 != 0) {
            }
            if ((i6 & 1533916891) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i3 & 1) != 0) {
            }
            if (i29 != 0) {
            }
            if (i7 != 0) {
            }
            if (i8 != 0) {
            }
            if (i9 != 0) {
            }
            if (i10 != 0) {
            }
            if (i11 != 0) {
            }
            if (i12 != 0) {
            }
            if ((i5 & 512) != 0) {
            }
            if (i13 != 0) {
            }
            if (i15 != 0) {
            }
            if (i16 != 0) {
            }
            if (i17 != 0) {
            }
            if (i18 != 0) {
            }
            if (i19 != 0) {
            }
            visualTransformation2 = none;
            function12 = basicTextFieldKt$BasicTextField$1;
            z6 = z10;
            textStyle2 = textStyle4;
            keyboardOptions2 = keyboardOptions4;
            z7 = z5;
            i24 = i21;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
            rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
            }
            startRestartGroup.endReplaceableGroup();
            MutableState mutableState322 = (MutableState) rememberedValue;
            TextFieldValue m5321copy3r_uNRQ$default222 = TextFieldValue.m5321copy3r_uNRQ$default(BasicTextField$lambda$2(mutableState322), value, 0L, (TextRange) null, 6, (Object) null);
            startRestartGroup.startReplaceableGroup(511388516);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
            changed = startRestartGroup.changed(m5321copy3r_uNRQ$default222) | startRestartGroup.changed(mutableState322);
            boolean z12222 = z6;
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (!changed) {
            }
            rememberedValue2 = new BasicTextFieldKt$BasicTextField$3$1(m5321copy3r_uNRQ$default222, mutableState322);
            startRestartGroup.updateRememberedValue(rememberedValue2);
            startRestartGroup.endReplaceableGroup();
            EffectsKt.SideEffect((Function0) rememberedValue2, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
            changed2 = startRestartGroup.changed(value);
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (!changed2) {
            }
            rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(value, null, 2, null);
            startRestartGroup.updateRememberedValue(rememberedValue3);
            startRestartGroup.endReplaceableGroup();
            MutableState mutableState2222 = (MutableState) rememberedValue3;
            ImeOptions imeOptions$foundation_release222 = keyboardOptions2.toImeOptions$foundation_release(z7);
            boolean z13222 = !z7;
            if (z7) {
            }
            if (z7) {
            }
            startRestartGroup.startReplaceableGroup(1618982084);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2,3):Composables.kt#9igjgp");
            KeyboardOptions keyboardOptions5222 = keyboardOptions2;
            changed3 = startRestartGroup.changed(mutableState322) | startRestartGroup.changed(mutableState2222) | startRestartGroup.changed(onValueChange);
            boolean z14222 = z7;
            rememberedValue4 = startRestartGroup.rememberedValue();
            if (!changed3) {
            }
            rememberedValue4 = new BasicTextFieldKt$BasicTextField$4$1(onValueChange, mutableState322, mutableState2222);
            startRestartGroup.updateRememberedValue(rememberedValue4);
            startRestartGroup.endReplaceableGroup();
            int i34222 = i302 << 9;
            CoreTextFieldKt.CoreTextField(m5321copy3r_uNRQ$default222, rememberedValue4, companion, textStyle2, visualTransformation2, function12, mutableInteractionSource3, brush2, z13222, i33, i32, imeOptions$foundation_release222, keyboardActions2, z4, z12222, function32, startRestartGroup, (i24 & 896) | ((i24 >> 6) & 7168) | (i34222 & 57344) | (i34222 & 458752) | (3670016 & i34222) | (i34222 & 29360128), ((i24 >> 15) & 896) | (i24 & 7168) | (i24 & 57344) | (i302 & 458752), 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            z8 = z12222;
            keyboardOptions3 = keyboardOptions5222;
            i26 = i23;
            textStyle3 = textStyle2;
            visualTransformation3 = visualTransformation2;
            function13 = function12;
            function33 = function32;
            z9 = z14222;
            i27 = i25;
            modifier2 = companion;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i7 = i5 & 8;
        if (i7 == 0) {
        }
        i8 = i5 & 16;
        if (i8 != 0) {
        }
        i9 = i5 & 32;
        if (i9 != 0) {
        }
        i10 = i5 & 64;
        if (i10 != 0) {
        }
        i11 = i5 & 128;
        if (i11 != 0) {
        }
        i12 = i5 & 256;
        if (i12 != 0) {
        }
        if ((i3 & 1879048192) == 0) {
        }
        i13 = i5 & 1024;
        if (i13 != 0) {
        }
        i15 = i5 & 2048;
        if (i15 != 0) {
        }
        int i3022 = i14;
        i16 = i5 & 4096;
        if (i16 != 0) {
        }
        i17 = i5 & 8192;
        if (i17 == 0) {
        }
        i18 = i5 & 16384;
        if (i18 != 0) {
        }
        i19 = i5 & 32768;
        if (i19 != 0) {
        }
        if ((i6 & 1533916891) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i3 & 1) != 0) {
        }
        if (i29 != 0) {
        }
        if (i7 != 0) {
        }
        if (i8 != 0) {
        }
        if (i9 != 0) {
        }
        if (i10 != 0) {
        }
        if (i11 != 0) {
        }
        if (i12 != 0) {
        }
        if ((i5 & 512) != 0) {
        }
        if (i13 != 0) {
        }
        if (i15 != 0) {
        }
        if (i16 != 0) {
        }
        if (i17 != 0) {
        }
        if (i18 != 0) {
        }
        if (i19 != 0) {
        }
        visualTransformation2 = none;
        function12 = basicTextFieldKt$BasicTextField$1;
        z6 = z10;
        textStyle2 = textStyle4;
        keyboardOptions2 = keyboardOptions4;
        z7 = z5;
        i24 = i21;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        startRestartGroup.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
        rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        MutableState mutableState3222 = (MutableState) rememberedValue;
        TextFieldValue m5321copy3r_uNRQ$default2222 = TextFieldValue.m5321copy3r_uNRQ$default(BasicTextField$lambda$2(mutableState3222), value, 0L, (TextRange) null, 6, (Object) null);
        startRestartGroup.startReplaceableGroup(511388516);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
        changed = startRestartGroup.changed(m5321copy3r_uNRQ$default2222) | startRestartGroup.changed(mutableState3222);
        boolean z122222 = z6;
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        rememberedValue2 = new BasicTextFieldKt$BasicTextField$3$1(m5321copy3r_uNRQ$default2222, mutableState3222);
        startRestartGroup.updateRememberedValue(rememberedValue2);
        startRestartGroup.endReplaceableGroup();
        EffectsKt.SideEffect((Function0) rememberedValue2, startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(1157296644);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
        changed2 = startRestartGroup.changed(value);
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (!changed2) {
        }
        rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(value, null, 2, null);
        startRestartGroup.updateRememberedValue(rememberedValue3);
        startRestartGroup.endReplaceableGroup();
        MutableState mutableState22222 = (MutableState) rememberedValue3;
        ImeOptions imeOptions$foundation_release2222 = keyboardOptions2.toImeOptions$foundation_release(z7);
        boolean z132222 = !z7;
        if (z7) {
        }
        if (z7) {
        }
        startRestartGroup.startReplaceableGroup(1618982084);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2,3):Composables.kt#9igjgp");
        KeyboardOptions keyboardOptions52222 = keyboardOptions2;
        changed3 = startRestartGroup.changed(mutableState3222) | startRestartGroup.changed(mutableState22222) | startRestartGroup.changed(onValueChange);
        boolean z142222 = z7;
        rememberedValue4 = startRestartGroup.rememberedValue();
        if (!changed3) {
        }
        rememberedValue4 = new BasicTextFieldKt$BasicTextField$4$1(onValueChange, mutableState3222, mutableState22222);
        startRestartGroup.updateRememberedValue(rememberedValue4);
        startRestartGroup.endReplaceableGroup();
        int i342222 = i3022 << 9;
        CoreTextFieldKt.CoreTextField(m5321copy3r_uNRQ$default2222, rememberedValue4, companion, textStyle2, visualTransformation2, function12, mutableInteractionSource3, brush2, z132222, i33, i32, imeOptions$foundation_release2222, keyboardActions2, z4, z122222, function32, startRestartGroup, (i24 & 896) | ((i24 >> 6) & 7168) | (i342222 & 57344) | (i342222 & 458752) | (3670016 & i342222) | (i342222 & 29360128), ((i24 >> 15) & 896) | (i24 & 7168) | (i24 & 57344) | (i3022 & 458752), 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        z8 = z122222;
        keyboardOptions3 = keyboardOptions52222;
        i26 = i23;
        textStyle3 = textStyle2;
        visualTransformation3 = visualTransformation2;
        function13 = function12;
        function33 = function32;
        z9 = z142222;
        i27 = i25;
        modifier2 = companion;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextFieldValue BasicTextField$lambda$2(MutableState<TextFieldValue> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String BasicTextField$lambda$6(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:260:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0139  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BasicTextField(TextFieldValue value, Function1<? super TextFieldValue, Unit> onValueChange, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z3, int i, int i2, VisualTransformation visualTransformation, Function1<? super TextLayoutResult, Unit> function1, MutableInteractionSource mutableInteractionSource, Brush brush, Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> function3, Composer composer, int i3, int i4, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        boolean z4;
        MutableInteractionSource mutableInteractionSource2;
        MutableInteractionSource mutableInteractionSource3;
        int i21;
        SolidColor solidColor;
        MutableInteractionSource mutableInteractionSource4;
        Function3<Function2<? super Composer, ? super Integer, Unit>, Composer, Integer, Unit> function32;
        Brush brush2;
        int i22;
        VisualTransformation visualTransformation2;
        Modifier modifier2;
        Function1<? super TextLayoutResult, Unit> function12;
        KeyboardActions keyboardActions2;
        boolean z5;
        int i23;
        boolean z6;
        TextStyle textStyle2;
        KeyboardOptions keyboardOptions2;
        boolean z7;
        int i24;
        boolean changed;
        BasicTextFieldKt$BasicTextField$8$1 rememberedValue;
        Composer composer2;
        Modifier modifier3;
        boolean z8;
        boolean z9;
        TextStyle textStyle3;
        boolean z10;
        KeyboardActions keyboardActions3;
        int i25;
        int i26;
        VisualTransformation visualTransformation3;
        Function1<? super TextLayoutResult, Unit> function13;
        KeyboardOptions keyboardOptions3;
        MutableInteractionSource mutableInteractionSource5;
        Brush brush3;
        Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> function33;
        ScopeUpdateScope endRestartGroup;
        int i27;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        Composer startRestartGroup = composer.startRestartGroup(1804514146);
        ComposerKt.sourceInformation(startRestartGroup, "C(BasicTextField)P(14,10,8,2,11,13,5,4,12,6,7,15,9,3)282@16342L39,289@16644L90,287@16582L740:BasicTextField.kt#423gt5");
        if ((i5 & 1) != 0) {
            i6 = i3 | 6;
        } else if ((i3 & 14) == 0) {
            i6 = (startRestartGroup.changed(value) ? 4 : 2) | i3;
        } else {
            i6 = i3;
        }
        if ((i5 & 2) != 0) {
            i6 |= 48;
        } else if ((i3 & 112) == 0) {
            i6 |= startRestartGroup.changedInstance(onValueChange) ? 32 : 16;
        }
        int i28 = i5 & 4;
        if (i28 != 0) {
            i6 |= 384;
        } else if ((i3 & 896) == 0) {
            i6 |= startRestartGroup.changed(modifier) ? 256 : 128;
            i7 = i5 & 8;
            if (i7 == 0) {
                i6 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
            } else if ((i3 & 7168) == 0) {
                i6 |= startRestartGroup.changed(z) ? 2048 : 1024;
                i8 = i5 & 16;
                if (i8 != 0) {
                    i6 |= 24576;
                } else if ((i3 & 57344) == 0) {
                    i6 |= startRestartGroup.changed(z2) ? 16384 : 8192;
                }
                i9 = i5 & 32;
                if (i9 != 0) {
                    i6 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i3 & 458752) == 0) {
                    i6 |= startRestartGroup.changed(textStyle) ? 131072 : 65536;
                }
                i10 = i5 & 64;
                if (i10 != 0) {
                    i6 |= 1572864;
                } else if ((i3 & 3670016) == 0) {
                    i6 |= startRestartGroup.changed(keyboardOptions) ? 1048576 : 524288;
                }
                i11 = i5 & 128;
                if (i11 != 0) {
                    i6 |= 12582912;
                } else if ((i3 & 29360128) == 0) {
                    i6 |= startRestartGroup.changed(keyboardActions) ? 8388608 : 4194304;
                }
                i12 = i5 & 256;
                if (i12 != 0) {
                    i6 |= 100663296;
                } else if ((i3 & 234881024) == 0) {
                    i6 |= startRestartGroup.changed(z3) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                }
                if ((i3 & 1879048192) == 0) {
                    if ((i5 & 512) == 0 && startRestartGroup.changed(i)) {
                        i27 = 536870912;
                        i6 |= i27;
                    }
                    i27 = 268435456;
                    i6 |= i27;
                }
                i13 = i5 & 1024;
                if (i13 != 0) {
                    i14 = i4 | 6;
                } else if ((i4 & 14) == 0) {
                    i14 = i4 | (startRestartGroup.changed(i2) ? 4 : 2);
                } else {
                    i14 = i4;
                }
                i15 = i5 & 2048;
                if (i15 != 0) {
                    i14 |= 48;
                } else if ((i4 & 112) == 0) {
                    i14 |= startRestartGroup.changed(visualTransformation) ? 32 : 16;
                }
                int i29 = i14;
                i16 = i5 & 4096;
                if (i16 != 0) {
                    i29 |= 384;
                } else if ((i4 & 896) == 0) {
                    i29 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
                    i17 = i5 & 8192;
                    if (i17 == 0) {
                        i29 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
                    } else if ((i4 & 7168) == 0) {
                        i29 |= startRestartGroup.changed(mutableInteractionSource) ? 2048 : 1024;
                        i18 = i5 & 16384;
                        if (i18 != 0) {
                            i29 |= 24576;
                        } else if ((i4 & 57344) == 0) {
                            i29 |= startRestartGroup.changed(brush) ? 16384 : 8192;
                        }
                        i19 = i5 & 32768;
                        if (i19 != 0) {
                            i29 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        } else if ((i4 & 458752) == 0) {
                            i29 |= startRestartGroup.changedInstance(function3) ? 131072 : 65536;
                        }
                        if ((i6 & 1533916891) == 306783378 || (374491 & i29) != 74898 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            if ((i3 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                Modifier.Companion companion = i28 != 0 ? Modifier.Companion : modifier;
                                boolean z11 = i7 != 0 ? true : z;
                                boolean z12 = i8 != 0 ? false : z2;
                                TextStyle textStyle4 = i9 != 0 ? TextStyle.Companion.getDefault() : textStyle;
                                KeyboardOptions keyboardOptions4 = i10 != 0 ? KeyboardOptions.Companion.getDefault() : keyboardOptions;
                                KeyboardActions keyboardActions4 = i11 != 0 ? KeyboardActions.Companion.getDefault() : keyboardActions;
                                boolean z13 = i12 != 0 ? false : z3;
                                if ((i5 & 512) != 0) {
                                    i20 = z13 ? 1 : Integer.MAX_VALUE;
                                    i6 &= -1879048193;
                                } else {
                                    i20 = i;
                                }
                                int i30 = i13 != 0 ? 1 : i2;
                                VisualTransformation none = i15 != 0 ? VisualTransformation.Companion.getNone() : visualTransformation;
                                BasicTextFieldKt$BasicTextField$6 basicTextFieldKt$BasicTextField$6 = i16 != 0 ? BasicTextFieldKt$BasicTextField$6.INSTANCE : function1;
                                if (i17 != 0) {
                                    startRestartGroup.startReplaceableGroup(-492369756);
                                    ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                                    Object rememberedValue2 = startRestartGroup.rememberedValue();
                                    z4 = z13;
                                    if (rememberedValue2 == Composer.Companion.getEmpty()) {
                                        rememberedValue2 = InteractionSourceKt.MutableInteractionSource();
                                        startRestartGroup.updateRememberedValue(rememberedValue2);
                                    }
                                    startRestartGroup.endReplaceableGroup();
                                    mutableInteractionSource2 = (MutableInteractionSource) rememberedValue2;
                                } else {
                                    z4 = z13;
                                    mutableInteractionSource2 = mutableInteractionSource;
                                }
                                if (i18 != 0) {
                                    mutableInteractionSource3 = mutableInteractionSource2;
                                    i21 = i6;
                                    solidColor = new SolidColor(Color.Companion.m3317getBlack0d7_KjU(), null);
                                } else {
                                    mutableInteractionSource3 = mutableInteractionSource2;
                                    i21 = i6;
                                    solidColor = brush;
                                }
                                if (i19 != 0) {
                                    mutableInteractionSource4 = mutableInteractionSource3;
                                    brush2 = solidColor;
                                    function32 = ComposableSingletons$BasicTextFieldKt.INSTANCE.m1027getLambda2$foundation_release();
                                } else {
                                    mutableInteractionSource4 = mutableInteractionSource3;
                                    function32 = function3;
                                    brush2 = solidColor;
                                }
                                i22 = i30;
                                visualTransformation2 = none;
                                modifier2 = companion;
                                function12 = basicTextFieldKt$BasicTextField$6;
                                keyboardActions2 = keyboardActions4;
                                z5 = z11;
                                i23 = i20;
                                z6 = z12;
                                textStyle2 = textStyle4;
                                keyboardOptions2 = keyboardOptions4;
                                z7 = z4;
                                i24 = i21;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i5 & 512) != 0) {
                                    i6 &= -1879048193;
                                }
                                modifier2 = modifier;
                                z5 = z;
                                z6 = z2;
                                textStyle2 = textStyle;
                                keyboardOptions2 = keyboardOptions;
                                keyboardActions2 = keyboardActions;
                                z7 = z3;
                                i23 = i;
                                i22 = i2;
                                visualTransformation2 = visualTransformation;
                                function12 = function1;
                                mutableInteractionSource4 = mutableInteractionSource;
                                brush2 = brush;
                                function32 = function3;
                                i24 = i6;
                            }
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1804514146, i24, i29, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:268)");
                            }
                            ImeOptions imeOptions$foundation_release = keyboardOptions2.toImeOptions$foundation_release(z7);
                            boolean z14 = !z7;
                            int i31 = z7 ? 1 : i22;
                            int i32 = z7 ? 1 : i23;
                            int i33 = i24 & 14;
                            startRestartGroup.startReplaceableGroup(511388516);
                            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
                            changed = startRestartGroup.changed(value) | startRestartGroup.changed(onValueChange);
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (!changed || rememberedValue == Composer.Companion.getEmpty()) {
                                rememberedValue = new BasicTextFieldKt$BasicTextField$8$1(value, onValueChange);
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            startRestartGroup.endReplaceableGroup();
                            int i34 = i29 << 9;
                            composer2 = startRestartGroup;
                            boolean z15 = z7;
                            KeyboardOptions keyboardOptions5 = keyboardOptions2;
                            CoreTextFieldKt.CoreTextField(value, (Function1) rememberedValue, modifier2, textStyle2, visualTransformation2, function12, mutableInteractionSource4, brush2, z14, i32, i31, imeOptions$foundation_release, keyboardActions2, z5, z6, function32, composer2, i33 | (i24 & 896) | ((i24 >> 6) & 7168) | (i34 & 57344) | (i34 & 458752) | (3670016 & i34) | (i34 & 29360128), (i24 & 57344) | ((i24 >> 15) & 896) | (i24 & 7168) | (i29 & 458752), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier2;
                            z8 = z5;
                            z9 = z6;
                            textStyle3 = textStyle2;
                            z10 = z15;
                            keyboardActions3 = keyboardActions2;
                            i25 = i23;
                            i26 = i22;
                            visualTransformation3 = visualTransformation2;
                            function13 = function12;
                            keyboardOptions3 = keyboardOptions5;
                            mutableInteractionSource5 = mutableInteractionSource4;
                            brush3 = brush2;
                            function33 = function32;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier3 = modifier;
                            z8 = z;
                            z9 = z2;
                            textStyle3 = textStyle;
                            keyboardOptions3 = keyboardOptions;
                            keyboardActions3 = keyboardActions;
                            z10 = z3;
                            i26 = i2;
                            visualTransformation3 = visualTransformation;
                            function13 = function1;
                            mutableInteractionSource5 = mutableInteractionSource;
                            brush3 = brush;
                            function33 = function3;
                            composer2 = startRestartGroup;
                            i25 = i;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                            return;
                        }
                        endRestartGroup.updateScope(new BasicTextFieldKt$BasicTextField$9(value, onValueChange, modifier3, z8, z9, textStyle3, keyboardOptions3, keyboardActions3, z10, i25, i26, visualTransformation3, function13, mutableInteractionSource5, brush3, function33, i3, i4, i5));
                        return;
                    }
                    i18 = i5 & 16384;
                    if (i18 != 0) {
                    }
                    i19 = i5 & 32768;
                    if (i19 != 0) {
                    }
                    if ((i6 & 1533916891) == 306783378) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i3 & 1) != 0) {
                    }
                    if (i28 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (i9 != 0) {
                    }
                    if (i10 != 0) {
                    }
                    if (i11 != 0) {
                    }
                    if (i12 != 0) {
                    }
                    if ((i5 & 512) != 0) {
                    }
                    if (i13 != 0) {
                    }
                    if (i15 != 0) {
                    }
                    if (i16 != 0) {
                    }
                    if (i17 != 0) {
                    }
                    if (i18 != 0) {
                    }
                    if (i19 != 0) {
                    }
                    i22 = i30;
                    visualTransformation2 = none;
                    modifier2 = companion;
                    function12 = basicTextFieldKt$BasicTextField$6;
                    keyboardActions2 = keyboardActions4;
                    z5 = z11;
                    i23 = i20;
                    z6 = z12;
                    textStyle2 = textStyle4;
                    keyboardOptions2 = keyboardOptions4;
                    z7 = z4;
                    i24 = i21;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    ImeOptions imeOptions$foundation_release2 = keyboardOptions2.toImeOptions$foundation_release(z7);
                    boolean z142 = !z7;
                    if (z7) {
                    }
                    if (z7) {
                    }
                    int i332 = i24 & 14;
                    startRestartGroup.startReplaceableGroup(511388516);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
                    changed = startRestartGroup.changed(value) | startRestartGroup.changed(onValueChange);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!changed) {
                    }
                    rememberedValue = new BasicTextFieldKt$BasicTextField$8$1(value, onValueChange);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                    startRestartGroup.endReplaceableGroup();
                    int i342 = i29 << 9;
                    composer2 = startRestartGroup;
                    boolean z152 = z7;
                    KeyboardOptions keyboardOptions52 = keyboardOptions2;
                    CoreTextFieldKt.CoreTextField(value, (Function1) rememberedValue, modifier2, textStyle2, visualTransformation2, function12, mutableInteractionSource4, brush2, z142, i32, i31, imeOptions$foundation_release2, keyboardActions2, z5, z6, function32, composer2, i332 | (i24 & 896) | ((i24 >> 6) & 7168) | (i342 & 57344) | (i342 & 458752) | (3670016 & i342) | (i342 & 29360128), (i24 & 57344) | ((i24 >> 15) & 896) | (i24 & 7168) | (i29 & 458752), 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier2;
                    z8 = z5;
                    z9 = z6;
                    textStyle3 = textStyle2;
                    z10 = z152;
                    keyboardActions3 = keyboardActions2;
                    i25 = i23;
                    i26 = i22;
                    visualTransformation3 = visualTransformation2;
                    function13 = function12;
                    keyboardOptions3 = keyboardOptions52;
                    mutableInteractionSource5 = mutableInteractionSource4;
                    brush3 = brush2;
                    function33 = function32;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                i17 = i5 & 8192;
                if (i17 == 0) {
                }
                i18 = i5 & 16384;
                if (i18 != 0) {
                }
                i19 = i5 & 32768;
                if (i19 != 0) {
                }
                if ((i6 & 1533916891) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i3 & 1) != 0) {
                }
                if (i28 != 0) {
                }
                if (i7 != 0) {
                }
                if (i8 != 0) {
                }
                if (i9 != 0) {
                }
                if (i10 != 0) {
                }
                if (i11 != 0) {
                }
                if (i12 != 0) {
                }
                if ((i5 & 512) != 0) {
                }
                if (i13 != 0) {
                }
                if (i15 != 0) {
                }
                if (i16 != 0) {
                }
                if (i17 != 0) {
                }
                if (i18 != 0) {
                }
                if (i19 != 0) {
                }
                i22 = i30;
                visualTransformation2 = none;
                modifier2 = companion;
                function12 = basicTextFieldKt$BasicTextField$6;
                keyboardActions2 = keyboardActions4;
                z5 = z11;
                i23 = i20;
                z6 = z12;
                textStyle2 = textStyle4;
                keyboardOptions2 = keyboardOptions4;
                z7 = z4;
                i24 = i21;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                ImeOptions imeOptions$foundation_release22 = keyboardOptions2.toImeOptions$foundation_release(z7);
                boolean z1422 = !z7;
                if (z7) {
                }
                if (z7) {
                }
                int i3322 = i24 & 14;
                startRestartGroup.startReplaceableGroup(511388516);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
                changed = startRestartGroup.changed(value) | startRestartGroup.changed(onValueChange);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!changed) {
                }
                rememberedValue = new BasicTextFieldKt$BasicTextField$8$1(value, onValueChange);
                startRestartGroup.updateRememberedValue(rememberedValue);
                startRestartGroup.endReplaceableGroup();
                int i3422 = i29 << 9;
                composer2 = startRestartGroup;
                boolean z1522 = z7;
                KeyboardOptions keyboardOptions522 = keyboardOptions2;
                CoreTextFieldKt.CoreTextField(value, (Function1) rememberedValue, modifier2, textStyle2, visualTransformation2, function12, mutableInteractionSource4, brush2, z1422, i32, i31, imeOptions$foundation_release22, keyboardActions2, z5, z6, function32, composer2, i3322 | (i24 & 896) | ((i24 >> 6) & 7168) | (i3422 & 57344) | (i3422 & 458752) | (3670016 & i3422) | (i3422 & 29360128), (i24 & 57344) | ((i24 >> 15) & 896) | (i24 & 7168) | (i29 & 458752), 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier2;
                z8 = z5;
                z9 = z6;
                textStyle3 = textStyle2;
                z10 = z1522;
                keyboardActions3 = keyboardActions2;
                i25 = i23;
                i26 = i22;
                visualTransformation3 = visualTransformation2;
                function13 = function12;
                keyboardOptions3 = keyboardOptions522;
                mutableInteractionSource5 = mutableInteractionSource4;
                brush3 = brush2;
                function33 = function32;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            i8 = i5 & 16;
            if (i8 != 0) {
            }
            i9 = i5 & 32;
            if (i9 != 0) {
            }
            i10 = i5 & 64;
            if (i10 != 0) {
            }
            i11 = i5 & 128;
            if (i11 != 0) {
            }
            i12 = i5 & 256;
            if (i12 != 0) {
            }
            if ((i3 & 1879048192) == 0) {
            }
            i13 = i5 & 1024;
            if (i13 != 0) {
            }
            i15 = i5 & 2048;
            if (i15 != 0) {
            }
            int i292 = i14;
            i16 = i5 & 4096;
            if (i16 != 0) {
            }
            i17 = i5 & 8192;
            if (i17 == 0) {
            }
            i18 = i5 & 16384;
            if (i18 != 0) {
            }
            i19 = i5 & 32768;
            if (i19 != 0) {
            }
            if ((i6 & 1533916891) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i3 & 1) != 0) {
            }
            if (i28 != 0) {
            }
            if (i7 != 0) {
            }
            if (i8 != 0) {
            }
            if (i9 != 0) {
            }
            if (i10 != 0) {
            }
            if (i11 != 0) {
            }
            if (i12 != 0) {
            }
            if ((i5 & 512) != 0) {
            }
            if (i13 != 0) {
            }
            if (i15 != 0) {
            }
            if (i16 != 0) {
            }
            if (i17 != 0) {
            }
            if (i18 != 0) {
            }
            if (i19 != 0) {
            }
            i22 = i30;
            visualTransformation2 = none;
            modifier2 = companion;
            function12 = basicTextFieldKt$BasicTextField$6;
            keyboardActions2 = keyboardActions4;
            z5 = z11;
            i23 = i20;
            z6 = z12;
            textStyle2 = textStyle4;
            keyboardOptions2 = keyboardOptions4;
            z7 = z4;
            i24 = i21;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            ImeOptions imeOptions$foundation_release222 = keyboardOptions2.toImeOptions$foundation_release(z7);
            boolean z14222 = !z7;
            if (z7) {
            }
            if (z7) {
            }
            int i33222 = i24 & 14;
            startRestartGroup.startReplaceableGroup(511388516);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
            changed = startRestartGroup.changed(value) | startRestartGroup.changed(onValueChange);
            rememberedValue = startRestartGroup.rememberedValue();
            if (!changed) {
            }
            rememberedValue = new BasicTextFieldKt$BasicTextField$8$1(value, onValueChange);
            startRestartGroup.updateRememberedValue(rememberedValue);
            startRestartGroup.endReplaceableGroup();
            int i34222 = i292 << 9;
            composer2 = startRestartGroup;
            boolean z15222 = z7;
            KeyboardOptions keyboardOptions5222 = keyboardOptions2;
            CoreTextFieldKt.CoreTextField(value, (Function1) rememberedValue, modifier2, textStyle2, visualTransformation2, function12, mutableInteractionSource4, brush2, z14222, i32, i31, imeOptions$foundation_release222, keyboardActions2, z5, z6, function32, composer2, i33222 | (i24 & 896) | ((i24 >> 6) & 7168) | (i34222 & 57344) | (i34222 & 458752) | (3670016 & i34222) | (i34222 & 29360128), (i24 & 57344) | ((i24 >> 15) & 896) | (i24 & 7168) | (i292 & 458752), 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier2;
            z8 = z5;
            z9 = z6;
            textStyle3 = textStyle2;
            z10 = z15222;
            keyboardActions3 = keyboardActions2;
            i25 = i23;
            i26 = i22;
            visualTransformation3 = visualTransformation2;
            function13 = function12;
            keyboardOptions3 = keyboardOptions5222;
            mutableInteractionSource5 = mutableInteractionSource4;
            brush3 = brush2;
            function33 = function32;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i7 = i5 & 8;
        if (i7 == 0) {
        }
        i8 = i5 & 16;
        if (i8 != 0) {
        }
        i9 = i5 & 32;
        if (i9 != 0) {
        }
        i10 = i5 & 64;
        if (i10 != 0) {
        }
        i11 = i5 & 128;
        if (i11 != 0) {
        }
        i12 = i5 & 256;
        if (i12 != 0) {
        }
        if ((i3 & 1879048192) == 0) {
        }
        i13 = i5 & 1024;
        if (i13 != 0) {
        }
        i15 = i5 & 2048;
        if (i15 != 0) {
        }
        int i2922 = i14;
        i16 = i5 & 4096;
        if (i16 != 0) {
        }
        i17 = i5 & 8192;
        if (i17 == 0) {
        }
        i18 = i5 & 16384;
        if (i18 != 0) {
        }
        i19 = i5 & 32768;
        if (i19 != 0) {
        }
        if ((i6 & 1533916891) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i3 & 1) != 0) {
        }
        if (i28 != 0) {
        }
        if (i7 != 0) {
        }
        if (i8 != 0) {
        }
        if (i9 != 0) {
        }
        if (i10 != 0) {
        }
        if (i11 != 0) {
        }
        if (i12 != 0) {
        }
        if ((i5 & 512) != 0) {
        }
        if (i13 != 0) {
        }
        if (i15 != 0) {
        }
        if (i16 != 0) {
        }
        if (i17 != 0) {
        }
        if (i18 != 0) {
        }
        if (i19 != 0) {
        }
        i22 = i30;
        visualTransformation2 = none;
        modifier2 = companion;
        function12 = basicTextFieldKt$BasicTextField$6;
        keyboardActions2 = keyboardActions4;
        z5 = z11;
        i23 = i20;
        z6 = z12;
        textStyle2 = textStyle4;
        keyboardOptions2 = keyboardOptions4;
        z7 = z4;
        i24 = i21;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        ImeOptions imeOptions$foundation_release2222 = keyboardOptions2.toImeOptions$foundation_release(z7);
        boolean z142222 = !z7;
        if (z7) {
        }
        if (z7) {
        }
        int i332222 = i24 & 14;
        startRestartGroup.startReplaceableGroup(511388516);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
        changed = startRestartGroup.changed(value) | startRestartGroup.changed(onValueChange);
        rememberedValue = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        rememberedValue = new BasicTextFieldKt$BasicTextField$8$1(value, onValueChange);
        startRestartGroup.updateRememberedValue(rememberedValue);
        startRestartGroup.endReplaceableGroup();
        int i342222 = i2922 << 9;
        composer2 = startRestartGroup;
        boolean z152222 = z7;
        KeyboardOptions keyboardOptions52222 = keyboardOptions2;
        CoreTextFieldKt.CoreTextField(value, (Function1) rememberedValue, modifier2, textStyle2, visualTransformation2, function12, mutableInteractionSource4, brush2, z142222, i32, i31, imeOptions$foundation_release2222, keyboardActions2, z5, z6, function32, composer2, i332222 | (i24 & 896) | ((i24 >> 6) & 7168) | (i342222 & 57344) | (i342222 & 458752) | (3670016 & i342222) | (i342222 & 29360128), (i24 & 57344) | ((i24 >> 15) & 896) | (i24 & 7168) | (i2922 & 458752), 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier3 = modifier2;
        z8 = z5;
        z9 = z6;
        textStyle3 = textStyle2;
        z10 = z152222;
        keyboardActions3 = keyboardActions2;
        i25 = i23;
        i26 = i22;
        visualTransformation3 = visualTransformation2;
        function13 = function12;
        keyboardOptions3 = keyboardOptions52222;
        mutableInteractionSource5 = mutableInteractionSource4;
        brush3 = brush2;
        function33 = function32;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:220:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x013e  */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void BasicTextField(String value, Function1 onValueChange, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z3, int i, VisualTransformation visualTransformation, Function1 function1, MutableInteractionSource mutableInteractionSource, Brush brush, Function3 function3, Composer composer, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        MutableInteractionSource mutableInteractionSource2;
        Composer composer2;
        Modifier modifier2;
        boolean z4;
        boolean z5;
        TextStyle textStyle2;
        KeyboardOptions keyboardOptions2;
        KeyboardActions keyboardActions2;
        boolean z6;
        int i19;
        VisualTransformation visualTransformation2;
        Function1 function12;
        MutableInteractionSource mutableInteractionSource3;
        Brush brush2;
        Function3 function32;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        Composer startRestartGroup = composer.startRestartGroup(-454732590);
        ComposerKt.sourceInformation(startRestartGroup, "C(BasicTextField)P(13,9,7,2,10,12,5,4,11,6,14,8,3)326@18012L39,331@18252L579:BasicTextField.kt#423gt5");
        if ((i4 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i5 = (startRestartGroup.changed(value) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 112) == 0) {
            i5 |= startRestartGroup.changedInstance(onValueChange) ? 32 : 16;
        }
        int i20 = i4 & 4;
        if (i20 != 0) {
            i5 |= 384;
        } else if ((i2 & 896) == 0) {
            i5 |= startRestartGroup.changed(modifier) ? 256 : 128;
            i6 = i4 & 8;
            if (i6 == 0) {
                i5 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
            } else if ((i2 & 7168) == 0) {
                i5 |= startRestartGroup.changed(z) ? 2048 : 1024;
                i7 = i4 & 16;
                if (i7 != 0) {
                    i5 |= 24576;
                } else if ((i2 & 57344) == 0) {
                    i5 |= startRestartGroup.changed(z2) ? 16384 : 8192;
                }
                i8 = i4 & 32;
                if (i8 != 0) {
                    i5 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i2 & 458752) == 0) {
                    i5 |= startRestartGroup.changed(textStyle) ? 131072 : 65536;
                }
                i9 = i4 & 64;
                if (i9 != 0) {
                    i5 |= 1572864;
                } else if ((i2 & 3670016) == 0) {
                    i5 |= startRestartGroup.changed(keyboardOptions) ? 1048576 : 524288;
                }
                i10 = i4 & 128;
                if (i10 != 0) {
                    i5 |= 12582912;
                } else if ((i2 & 29360128) == 0) {
                    i5 |= startRestartGroup.changed(keyboardActions) ? 8388608 : 4194304;
                }
                i11 = i4 & 256;
                if (i11 != 0) {
                    i5 |= 100663296;
                } else if ((i2 & 234881024) == 0) {
                    i5 |= startRestartGroup.changed(z3) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                }
                i12 = i4 & 512;
                if (i12 != 0) {
                    i5 |= C.ENCODING_PCM_32BIT;
                } else if ((i2 & 1879048192) == 0) {
                    i5 |= startRestartGroup.changed(i) ? 536870912 : 268435456;
                }
                i13 = i4 & 1024;
                if (i13 != 0) {
                    i14 = i3 | 6;
                } else if ((i3 & 14) == 0) {
                    i14 = i3 | (startRestartGroup.changed(visualTransformation) ? 4 : 2);
                } else {
                    i14 = i3;
                }
                i15 = i4 & 2048;
                if (i15 != 0) {
                    i14 |= 48;
                } else if ((i3 & 112) == 0) {
                    i14 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
                }
                int i21 = i14;
                i16 = i4 & 4096;
                if (i16 != 0) {
                    i21 |= 384;
                } else if ((i3 & 896) == 0) {
                    i21 |= startRestartGroup.changed(mutableInteractionSource) ? 256 : 128;
                    i17 = i4 & 8192;
                    if (i17 == 0) {
                        i21 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
                    } else if ((i3 & 7168) == 0) {
                        i21 |= startRestartGroup.changed(brush) ? 2048 : 1024;
                        i18 = i4 & 16384;
                        if (i18 != 0) {
                            i21 |= 24576;
                        } else if ((i3 & 57344) == 0) {
                            i21 |= startRestartGroup.changedInstance(function3) ? 16384 : 8192;
                        }
                        if ((i5 & 1533916891) == 306783378 || (46811 & i21) != 9362 || !startRestartGroup.getSkipping()) {
                            Modifier.Companion companion = i20 != 0 ? Modifier.Companion : modifier;
                            boolean z7 = i6 != 0 ? true : z;
                            boolean z8 = i7 != 0 ? false : z2;
                            TextStyle textStyle3 = i8 != 0 ? TextStyle.Companion.getDefault() : textStyle;
                            KeyboardOptions keyboardOptions3 = i9 != 0 ? KeyboardOptions.Companion.getDefault() : keyboardOptions;
                            KeyboardActions keyboardActions3 = i10 != 0 ? KeyboardActions.Companion.getDefault() : keyboardActions;
                            boolean z9 = i11 != 0 ? false : z3;
                            int i22 = i12 != 0 ? Integer.MAX_VALUE : i;
                            VisualTransformation none = i13 != 0 ? VisualTransformation.Companion.getNone() : visualTransformation;
                            BasicTextFieldKt$BasicTextField$10 basicTextFieldKt$BasicTextField$10 = i15 != 0 ? BasicTextFieldKt$BasicTextField$10.INSTANCE : function1;
                            if (i16 != 0) {
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
                            SolidColor solidColor = i17 != 0 ? new SolidColor(Color.Companion.m3317getBlack0d7_KjU(), null) : brush;
                            Function3<Function2<? super Composer, ? super Integer, Unit>, Composer, Integer, Unit> m1028getLambda3$foundation_release = i18 != 0 ? ComposableSingletons$BasicTextFieldKt.INSTANCE.m1028getLambda3$foundation_release() : function3;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-454732590, i5, i21, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:313)");
                            }
                            int i23 = i21 << 3;
                            composer2 = startRestartGroup;
                            BasicTextField(value, onValueChange, companion, z7, z8, textStyle3, keyboardOptions3, keyboardActions3, z9, i22, 1, none, basicTextFieldKt$BasicTextField$10, mutableInteractionSource2, solidColor, m1028getLambda3$foundation_release, composer2, (i5 & 14) | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (i5 & 57344) | (i5 & 458752) | (3670016 & i5) | (29360128 & i5) | (234881024 & i5) | (i5 & 1879048192), (i23 & 112) | 6 | (i23 & 896) | (i23 & 7168) | (i23 & 57344) | (i23 & 458752), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier2 = companion;
                            z4 = z7;
                            z5 = z8;
                            textStyle2 = textStyle3;
                            keyboardOptions2 = keyboardOptions3;
                            keyboardActions2 = keyboardActions3;
                            z6 = z9;
                            i19 = i22;
                            visualTransformation2 = none;
                            function12 = basicTextFieldKt$BasicTextField$10;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            brush2 = solidColor;
                            function32 = m1028getLambda3$foundation_release;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier2 = modifier;
                            z4 = z;
                            z5 = z2;
                            textStyle2 = textStyle;
                            keyboardOptions2 = keyboardOptions;
                            keyboardActions2 = keyboardActions;
                            i19 = i;
                            visualTransformation2 = visualTransformation;
                            function12 = function1;
                            mutableInteractionSource3 = mutableInteractionSource;
                            brush2 = brush;
                            function32 = function3;
                            composer2 = startRestartGroup;
                            z6 = z3;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                            return;
                        }
                        endRestartGroup.updateScope(new BasicTextFieldKt$BasicTextField$12(value, onValueChange, modifier2, z4, z5, textStyle2, keyboardOptions2, keyboardActions2, z6, i19, visualTransformation2, function12, mutableInteractionSource3, brush2, function32, i2, i3, i4));
                        return;
                    }
                    i18 = i4 & 16384;
                    if (i18 != 0) {
                    }
                    if ((i5 & 1533916891) == 306783378) {
                    }
                    if (i20 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (i9 != 0) {
                    }
                    if (i10 != 0) {
                    }
                    if (i11 != 0) {
                    }
                    if (i12 != 0) {
                    }
                    if (i13 != 0) {
                    }
                    if (i15 != 0) {
                    }
                    if (i16 != 0) {
                    }
                    if (i17 != 0) {
                    }
                    if (i18 != 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    int i232 = i21 << 3;
                    composer2 = startRestartGroup;
                    BasicTextField(value, onValueChange, companion, z7, z8, textStyle3, keyboardOptions3, keyboardActions3, z9, i22, 1, none, basicTextFieldKt$BasicTextField$10, mutableInteractionSource2, solidColor, m1028getLambda3$foundation_release, composer2, (i5 & 14) | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (i5 & 57344) | (i5 & 458752) | (3670016 & i5) | (29360128 & i5) | (234881024 & i5) | (i5 & 1879048192), (i232 & 112) | 6 | (i232 & 896) | (i232 & 7168) | (i232 & 57344) | (i232 & 458752), 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier2 = companion;
                    z4 = z7;
                    z5 = z8;
                    textStyle2 = textStyle3;
                    keyboardOptions2 = keyboardOptions3;
                    keyboardActions2 = keyboardActions3;
                    z6 = z9;
                    i19 = i22;
                    visualTransformation2 = none;
                    function12 = basicTextFieldKt$BasicTextField$10;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    brush2 = solidColor;
                    function32 = m1028getLambda3$foundation_release;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                i17 = i4 & 8192;
                if (i17 == 0) {
                }
                i18 = i4 & 16384;
                if (i18 != 0) {
                }
                if ((i5 & 1533916891) == 306783378) {
                }
                if (i20 != 0) {
                }
                if (i6 != 0) {
                }
                if (i7 != 0) {
                }
                if (i8 != 0) {
                }
                if (i9 != 0) {
                }
                if (i10 != 0) {
                }
                if (i11 != 0) {
                }
                if (i12 != 0) {
                }
                if (i13 != 0) {
                }
                if (i15 != 0) {
                }
                if (i16 != 0) {
                }
                if (i17 != 0) {
                }
                if (i18 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                int i2322 = i21 << 3;
                composer2 = startRestartGroup;
                BasicTextField(value, onValueChange, companion, z7, z8, textStyle3, keyboardOptions3, keyboardActions3, z9, i22, 1, none, basicTextFieldKt$BasicTextField$10, mutableInteractionSource2, solidColor, m1028getLambda3$foundation_release, composer2, (i5 & 14) | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (i5 & 57344) | (i5 & 458752) | (3670016 & i5) | (29360128 & i5) | (234881024 & i5) | (i5 & 1879048192), (i2322 & 112) | 6 | (i2322 & 896) | (i2322 & 7168) | (i2322 & 57344) | (i2322 & 458752), 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier2 = companion;
                z4 = z7;
                z5 = z8;
                textStyle2 = textStyle3;
                keyboardOptions2 = keyboardOptions3;
                keyboardActions2 = keyboardActions3;
                z6 = z9;
                i19 = i22;
                visualTransformation2 = none;
                function12 = basicTextFieldKt$BasicTextField$10;
                mutableInteractionSource3 = mutableInteractionSource2;
                brush2 = solidColor;
                function32 = m1028getLambda3$foundation_release;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            i7 = i4 & 16;
            if (i7 != 0) {
            }
            i8 = i4 & 32;
            if (i8 != 0) {
            }
            i9 = i4 & 64;
            if (i9 != 0) {
            }
            i10 = i4 & 128;
            if (i10 != 0) {
            }
            i11 = i4 & 256;
            if (i11 != 0) {
            }
            i12 = i4 & 512;
            if (i12 != 0) {
            }
            i13 = i4 & 1024;
            if (i13 != 0) {
            }
            i15 = i4 & 2048;
            if (i15 != 0) {
            }
            int i212 = i14;
            i16 = i4 & 4096;
            if (i16 != 0) {
            }
            i17 = i4 & 8192;
            if (i17 == 0) {
            }
            i18 = i4 & 16384;
            if (i18 != 0) {
            }
            if ((i5 & 1533916891) == 306783378) {
            }
            if (i20 != 0) {
            }
            if (i6 != 0) {
            }
            if (i7 != 0) {
            }
            if (i8 != 0) {
            }
            if (i9 != 0) {
            }
            if (i10 != 0) {
            }
            if (i11 != 0) {
            }
            if (i12 != 0) {
            }
            if (i13 != 0) {
            }
            if (i15 != 0) {
            }
            if (i16 != 0) {
            }
            if (i17 != 0) {
            }
            if (i18 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            int i23222 = i212 << 3;
            composer2 = startRestartGroup;
            BasicTextField(value, onValueChange, companion, z7, z8, textStyle3, keyboardOptions3, keyboardActions3, z9, i22, 1, none, basicTextFieldKt$BasicTextField$10, mutableInteractionSource2, solidColor, m1028getLambda3$foundation_release, composer2, (i5 & 14) | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (i5 & 57344) | (i5 & 458752) | (3670016 & i5) | (29360128 & i5) | (234881024 & i5) | (i5 & 1879048192), (i23222 & 112) | 6 | (i23222 & 896) | (i23222 & 7168) | (i23222 & 57344) | (i23222 & 458752), 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier2 = companion;
            z4 = z7;
            z5 = z8;
            textStyle2 = textStyle3;
            keyboardOptions2 = keyboardOptions3;
            keyboardActions2 = keyboardActions3;
            z6 = z9;
            i19 = i22;
            visualTransformation2 = none;
            function12 = basicTextFieldKt$BasicTextField$10;
            mutableInteractionSource3 = mutableInteractionSource2;
            brush2 = solidColor;
            function32 = m1028getLambda3$foundation_release;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i6 = i4 & 8;
        if (i6 == 0) {
        }
        i7 = i4 & 16;
        if (i7 != 0) {
        }
        i8 = i4 & 32;
        if (i8 != 0) {
        }
        i9 = i4 & 64;
        if (i9 != 0) {
        }
        i10 = i4 & 128;
        if (i10 != 0) {
        }
        i11 = i4 & 256;
        if (i11 != 0) {
        }
        i12 = i4 & 512;
        if (i12 != 0) {
        }
        i13 = i4 & 1024;
        if (i13 != 0) {
        }
        i15 = i4 & 2048;
        if (i15 != 0) {
        }
        int i2122 = i14;
        i16 = i4 & 4096;
        if (i16 != 0) {
        }
        i17 = i4 & 8192;
        if (i17 == 0) {
        }
        i18 = i4 & 16384;
        if (i18 != 0) {
        }
        if ((i5 & 1533916891) == 306783378) {
        }
        if (i20 != 0) {
        }
        if (i6 != 0) {
        }
        if (i7 != 0) {
        }
        if (i8 != 0) {
        }
        if (i9 != 0) {
        }
        if (i10 != 0) {
        }
        if (i11 != 0) {
        }
        if (i12 != 0) {
        }
        if (i13 != 0) {
        }
        if (i15 != 0) {
        }
        if (i16 != 0) {
        }
        if (i17 != 0) {
        }
        if (i18 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        int i232222 = i2122 << 3;
        composer2 = startRestartGroup;
        BasicTextField(value, onValueChange, companion, z7, z8, textStyle3, keyboardOptions3, keyboardActions3, z9, i22, 1, none, basicTextFieldKt$BasicTextField$10, mutableInteractionSource2, solidColor, m1028getLambda3$foundation_release, composer2, (i5 & 14) | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (i5 & 57344) | (i5 & 458752) | (3670016 & i5) | (29360128 & i5) | (234881024 & i5) | (i5 & 1879048192), (i232222 & 112) | 6 | (i232222 & 896) | (i232222 & 7168) | (i232222 & 57344) | (i232222 & 458752), 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier2 = companion;
        z4 = z7;
        z5 = z8;
        textStyle2 = textStyle3;
        keyboardOptions2 = keyboardOptions3;
        keyboardActions2 = keyboardActions3;
        z6 = z9;
        i19 = i22;
        visualTransformation2 = none;
        function12 = basicTextFieldKt$BasicTextField$10;
        mutableInteractionSource3 = mutableInteractionSource2;
        brush2 = solidColor;
        function32 = m1028getLambda3$foundation_release;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:220:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x013e  */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void BasicTextField(TextFieldValue value, Function1 onValueChange, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z3, int i, VisualTransformation visualTransformation, Function1 function1, MutableInteractionSource mutableInteractionSource, Brush brush, Function3 function3, Composer composer, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        MutableInteractionSource mutableInteractionSource2;
        Composer composer2;
        Modifier modifier2;
        boolean z4;
        boolean z5;
        TextStyle textStyle2;
        KeyboardOptions keyboardOptions2;
        KeyboardActions keyboardActions2;
        boolean z6;
        int i19;
        VisualTransformation visualTransformation2;
        Function1 function12;
        MutableInteractionSource mutableInteractionSource3;
        Brush brush2;
        Function3 function32;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        Composer startRestartGroup = composer.startRestartGroup(-560482651);
        ComposerKt.sourceInformation(startRestartGroup, "C(BasicTextField)P(13,9,7,2,10,12,5,4,11,6,14,8,3)366@19537L39,371@19777L579:BasicTextField.kt#423gt5");
        if ((i4 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i5 = (startRestartGroup.changed(value) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 112) == 0) {
            i5 |= startRestartGroup.changedInstance(onValueChange) ? 32 : 16;
        }
        int i20 = i4 & 4;
        if (i20 != 0) {
            i5 |= 384;
        } else if ((i2 & 896) == 0) {
            i5 |= startRestartGroup.changed(modifier) ? 256 : 128;
            i6 = i4 & 8;
            if (i6 == 0) {
                i5 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
            } else if ((i2 & 7168) == 0) {
                i5 |= startRestartGroup.changed(z) ? 2048 : 1024;
                i7 = i4 & 16;
                if (i7 != 0) {
                    i5 |= 24576;
                } else if ((i2 & 57344) == 0) {
                    i5 |= startRestartGroup.changed(z2) ? 16384 : 8192;
                }
                i8 = i4 & 32;
                if (i8 != 0) {
                    i5 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i2 & 458752) == 0) {
                    i5 |= startRestartGroup.changed(textStyle) ? 131072 : 65536;
                }
                i9 = i4 & 64;
                if (i9 != 0) {
                    i5 |= 1572864;
                } else if ((i2 & 3670016) == 0) {
                    i5 |= startRestartGroup.changed(keyboardOptions) ? 1048576 : 524288;
                }
                i10 = i4 & 128;
                if (i10 != 0) {
                    i5 |= 12582912;
                } else if ((i2 & 29360128) == 0) {
                    i5 |= startRestartGroup.changed(keyboardActions) ? 8388608 : 4194304;
                }
                i11 = i4 & 256;
                if (i11 != 0) {
                    i5 |= 100663296;
                } else if ((i2 & 234881024) == 0) {
                    i5 |= startRestartGroup.changed(z3) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                }
                i12 = i4 & 512;
                if (i12 != 0) {
                    i5 |= C.ENCODING_PCM_32BIT;
                } else if ((i2 & 1879048192) == 0) {
                    i5 |= startRestartGroup.changed(i) ? 536870912 : 268435456;
                }
                i13 = i4 & 1024;
                if (i13 != 0) {
                    i14 = i3 | 6;
                } else if ((i3 & 14) == 0) {
                    i14 = i3 | (startRestartGroup.changed(visualTransformation) ? 4 : 2);
                } else {
                    i14 = i3;
                }
                i15 = i4 & 2048;
                if (i15 != 0) {
                    i14 |= 48;
                } else if ((i3 & 112) == 0) {
                    i14 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
                }
                int i21 = i14;
                i16 = i4 & 4096;
                if (i16 != 0) {
                    i21 |= 384;
                } else if ((i3 & 896) == 0) {
                    i21 |= startRestartGroup.changed(mutableInteractionSource) ? 256 : 128;
                    i17 = i4 & 8192;
                    if (i17 == 0) {
                        i21 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
                    } else if ((i3 & 7168) == 0) {
                        i21 |= startRestartGroup.changed(brush) ? 2048 : 1024;
                        i18 = i4 & 16384;
                        if (i18 != 0) {
                            i21 |= 24576;
                        } else if ((i3 & 57344) == 0) {
                            i21 |= startRestartGroup.changedInstance(function3) ? 16384 : 8192;
                        }
                        if ((i5 & 1533916891) == 306783378 || (46811 & i21) != 9362 || !startRestartGroup.getSkipping()) {
                            Modifier.Companion companion = i20 != 0 ? Modifier.Companion : modifier;
                            boolean z7 = i6 != 0 ? true : z;
                            boolean z8 = i7 != 0 ? false : z2;
                            TextStyle textStyle3 = i8 != 0 ? TextStyle.Companion.getDefault() : textStyle;
                            KeyboardOptions keyboardOptions3 = i9 != 0 ? KeyboardOptions.Companion.getDefault() : keyboardOptions;
                            KeyboardActions keyboardActions3 = i10 != 0 ? KeyboardActions.Companion.getDefault() : keyboardActions;
                            boolean z9 = i11 != 0 ? false : z3;
                            int i22 = i12 != 0 ? Integer.MAX_VALUE : i;
                            VisualTransformation none = i13 != 0 ? VisualTransformation.Companion.getNone() : visualTransformation;
                            BasicTextFieldKt$BasicTextField$13 basicTextFieldKt$BasicTextField$13 = i15 != 0 ? BasicTextFieldKt$BasicTextField$13.INSTANCE : function1;
                            if (i16 != 0) {
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
                            SolidColor solidColor = i17 != 0 ? new SolidColor(Color.Companion.m3317getBlack0d7_KjU(), null) : brush;
                            Function3<Function2<? super Composer, ? super Integer, Unit>, Composer, Integer, Unit> m1029getLambda4$foundation_release = i18 != 0 ? ComposableSingletons$BasicTextFieldKt.INSTANCE.m1029getLambda4$foundation_release() : function3;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-560482651, i5, i21, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:353)");
                            }
                            int i23 = i21 << 3;
                            composer2 = startRestartGroup;
                            BasicTextField(value, onValueChange, companion, z7, z8, textStyle3, keyboardOptions3, keyboardActions3, z9, i22, 1, none, basicTextFieldKt$BasicTextField$13, mutableInteractionSource2, solidColor, m1029getLambda4$foundation_release, composer2, (i5 & 14) | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (i5 & 57344) | (i5 & 458752) | (3670016 & i5) | (29360128 & i5) | (234881024 & i5) | (i5 & 1879048192), (i23 & 112) | 6 | (i23 & 896) | (i23 & 7168) | (i23 & 57344) | (i23 & 458752), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier2 = companion;
                            z4 = z7;
                            z5 = z8;
                            textStyle2 = textStyle3;
                            keyboardOptions2 = keyboardOptions3;
                            keyboardActions2 = keyboardActions3;
                            z6 = z9;
                            i19 = i22;
                            visualTransformation2 = none;
                            function12 = basicTextFieldKt$BasicTextField$13;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            brush2 = solidColor;
                            function32 = m1029getLambda4$foundation_release;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier2 = modifier;
                            z4 = z;
                            z5 = z2;
                            textStyle2 = textStyle;
                            keyboardOptions2 = keyboardOptions;
                            keyboardActions2 = keyboardActions;
                            i19 = i;
                            visualTransformation2 = visualTransformation;
                            function12 = function1;
                            mutableInteractionSource3 = mutableInteractionSource;
                            brush2 = brush;
                            function32 = function3;
                            composer2 = startRestartGroup;
                            z6 = z3;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                            return;
                        }
                        endRestartGroup.updateScope(new BasicTextFieldKt$BasicTextField$15(value, onValueChange, modifier2, z4, z5, textStyle2, keyboardOptions2, keyboardActions2, z6, i19, visualTransformation2, function12, mutableInteractionSource3, brush2, function32, i2, i3, i4));
                        return;
                    }
                    i18 = i4 & 16384;
                    if (i18 != 0) {
                    }
                    if ((i5 & 1533916891) == 306783378) {
                    }
                    if (i20 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (i9 != 0) {
                    }
                    if (i10 != 0) {
                    }
                    if (i11 != 0) {
                    }
                    if (i12 != 0) {
                    }
                    if (i13 != 0) {
                    }
                    if (i15 != 0) {
                    }
                    if (i16 != 0) {
                    }
                    if (i17 != 0) {
                    }
                    if (i18 != 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    int i232 = i21 << 3;
                    composer2 = startRestartGroup;
                    BasicTextField(value, onValueChange, companion, z7, z8, textStyle3, keyboardOptions3, keyboardActions3, z9, i22, 1, none, basicTextFieldKt$BasicTextField$13, mutableInteractionSource2, solidColor, m1029getLambda4$foundation_release, composer2, (i5 & 14) | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (i5 & 57344) | (i5 & 458752) | (3670016 & i5) | (29360128 & i5) | (234881024 & i5) | (i5 & 1879048192), (i232 & 112) | 6 | (i232 & 896) | (i232 & 7168) | (i232 & 57344) | (i232 & 458752), 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier2 = companion;
                    z4 = z7;
                    z5 = z8;
                    textStyle2 = textStyle3;
                    keyboardOptions2 = keyboardOptions3;
                    keyboardActions2 = keyboardActions3;
                    z6 = z9;
                    i19 = i22;
                    visualTransformation2 = none;
                    function12 = basicTextFieldKt$BasicTextField$13;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    brush2 = solidColor;
                    function32 = m1029getLambda4$foundation_release;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                i17 = i4 & 8192;
                if (i17 == 0) {
                }
                i18 = i4 & 16384;
                if (i18 != 0) {
                }
                if ((i5 & 1533916891) == 306783378) {
                }
                if (i20 != 0) {
                }
                if (i6 != 0) {
                }
                if (i7 != 0) {
                }
                if (i8 != 0) {
                }
                if (i9 != 0) {
                }
                if (i10 != 0) {
                }
                if (i11 != 0) {
                }
                if (i12 != 0) {
                }
                if (i13 != 0) {
                }
                if (i15 != 0) {
                }
                if (i16 != 0) {
                }
                if (i17 != 0) {
                }
                if (i18 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                int i2322 = i21 << 3;
                composer2 = startRestartGroup;
                BasicTextField(value, onValueChange, companion, z7, z8, textStyle3, keyboardOptions3, keyboardActions3, z9, i22, 1, none, basicTextFieldKt$BasicTextField$13, mutableInteractionSource2, solidColor, m1029getLambda4$foundation_release, composer2, (i5 & 14) | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (i5 & 57344) | (i5 & 458752) | (3670016 & i5) | (29360128 & i5) | (234881024 & i5) | (i5 & 1879048192), (i2322 & 112) | 6 | (i2322 & 896) | (i2322 & 7168) | (i2322 & 57344) | (i2322 & 458752), 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier2 = companion;
                z4 = z7;
                z5 = z8;
                textStyle2 = textStyle3;
                keyboardOptions2 = keyboardOptions3;
                keyboardActions2 = keyboardActions3;
                z6 = z9;
                i19 = i22;
                visualTransformation2 = none;
                function12 = basicTextFieldKt$BasicTextField$13;
                mutableInteractionSource3 = mutableInteractionSource2;
                brush2 = solidColor;
                function32 = m1029getLambda4$foundation_release;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            i7 = i4 & 16;
            if (i7 != 0) {
            }
            i8 = i4 & 32;
            if (i8 != 0) {
            }
            i9 = i4 & 64;
            if (i9 != 0) {
            }
            i10 = i4 & 128;
            if (i10 != 0) {
            }
            i11 = i4 & 256;
            if (i11 != 0) {
            }
            i12 = i4 & 512;
            if (i12 != 0) {
            }
            i13 = i4 & 1024;
            if (i13 != 0) {
            }
            i15 = i4 & 2048;
            if (i15 != 0) {
            }
            int i212 = i14;
            i16 = i4 & 4096;
            if (i16 != 0) {
            }
            i17 = i4 & 8192;
            if (i17 == 0) {
            }
            i18 = i4 & 16384;
            if (i18 != 0) {
            }
            if ((i5 & 1533916891) == 306783378) {
            }
            if (i20 != 0) {
            }
            if (i6 != 0) {
            }
            if (i7 != 0) {
            }
            if (i8 != 0) {
            }
            if (i9 != 0) {
            }
            if (i10 != 0) {
            }
            if (i11 != 0) {
            }
            if (i12 != 0) {
            }
            if (i13 != 0) {
            }
            if (i15 != 0) {
            }
            if (i16 != 0) {
            }
            if (i17 != 0) {
            }
            if (i18 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            int i23222 = i212 << 3;
            composer2 = startRestartGroup;
            BasicTextField(value, onValueChange, companion, z7, z8, textStyle3, keyboardOptions3, keyboardActions3, z9, i22, 1, none, basicTextFieldKt$BasicTextField$13, mutableInteractionSource2, solidColor, m1029getLambda4$foundation_release, composer2, (i5 & 14) | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (i5 & 57344) | (i5 & 458752) | (3670016 & i5) | (29360128 & i5) | (234881024 & i5) | (i5 & 1879048192), (i23222 & 112) | 6 | (i23222 & 896) | (i23222 & 7168) | (i23222 & 57344) | (i23222 & 458752), 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier2 = companion;
            z4 = z7;
            z5 = z8;
            textStyle2 = textStyle3;
            keyboardOptions2 = keyboardOptions3;
            keyboardActions2 = keyboardActions3;
            z6 = z9;
            i19 = i22;
            visualTransformation2 = none;
            function12 = basicTextFieldKt$BasicTextField$13;
            mutableInteractionSource3 = mutableInteractionSource2;
            brush2 = solidColor;
            function32 = m1029getLambda4$foundation_release;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i6 = i4 & 8;
        if (i6 == 0) {
        }
        i7 = i4 & 16;
        if (i7 != 0) {
        }
        i8 = i4 & 32;
        if (i8 != 0) {
        }
        i9 = i4 & 64;
        if (i9 != 0) {
        }
        i10 = i4 & 128;
        if (i10 != 0) {
        }
        i11 = i4 & 256;
        if (i11 != 0) {
        }
        i12 = i4 & 512;
        if (i12 != 0) {
        }
        i13 = i4 & 1024;
        if (i13 != 0) {
        }
        i15 = i4 & 2048;
        if (i15 != 0) {
        }
        int i2122 = i14;
        i16 = i4 & 4096;
        if (i16 != 0) {
        }
        i17 = i4 & 8192;
        if (i17 == 0) {
        }
        i18 = i4 & 16384;
        if (i18 != 0) {
        }
        if ((i5 & 1533916891) == 306783378) {
        }
        if (i20 != 0) {
        }
        if (i6 != 0) {
        }
        if (i7 != 0) {
        }
        if (i8 != 0) {
        }
        if (i9 != 0) {
        }
        if (i10 != 0) {
        }
        if (i11 != 0) {
        }
        if (i12 != 0) {
        }
        if (i13 != 0) {
        }
        if (i15 != 0) {
        }
        if (i16 != 0) {
        }
        if (i17 != 0) {
        }
        if (i18 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        int i232222 = i2122 << 3;
        composer2 = startRestartGroup;
        BasicTextField(value, onValueChange, companion, z7, z8, textStyle3, keyboardOptions3, keyboardActions3, z9, i22, 1, none, basicTextFieldKt$BasicTextField$13, mutableInteractionSource2, solidColor, m1029getLambda4$foundation_release, composer2, (i5 & 14) | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (i5 & 57344) | (i5 & 458752) | (3670016 & i5) | (29360128 & i5) | (234881024 & i5) | (i5 & 1879048192), (i232222 & 112) | 6 | (i232222 & 896) | (i232222 & 7168) | (i232222 & 57344) | (i232222 & 458752), 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier2 = companion;
        z4 = z7;
        z5 = z8;
        textStyle2 = textStyle3;
        keyboardOptions2 = keyboardOptions3;
        keyboardActions2 = keyboardActions3;
        z6 = z9;
        i19 = i22;
        visualTransformation2 = none;
        function12 = basicTextFieldKt$BasicTextField$13;
        mutableInteractionSource3 = mutableInteractionSource2;
        brush2 = solidColor;
        function32 = m1029getLambda4$foundation_release;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }
}
