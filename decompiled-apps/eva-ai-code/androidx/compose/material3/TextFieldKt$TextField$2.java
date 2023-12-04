package androidx.compose.material3;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: TextField.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class TextFieldKt$TextField$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ int $$dirty1;
    final /* synthetic */ int $$dirty2;
    final /* synthetic */ TextFieldColors $colors;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ boolean $isError;
    final /* synthetic */ KeyboardActions $keyboardActions;
    final /* synthetic */ KeyboardOptions $keyboardOptions;
    final /* synthetic */ Function2<Composer, Integer, Unit> $label;
    final /* synthetic */ Function2<Composer, Integer, Unit> $leadingIcon;
    final /* synthetic */ int $maxLines;
    final /* synthetic */ TextStyle $mergedTextStyle;
    final /* synthetic */ int $minLines;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Function1<String, Unit> $onValueChange;
    final /* synthetic */ Function2<Composer, Integer, Unit> $placeholder;
    final /* synthetic */ Function2<Composer, Integer, Unit> $prefix;
    final /* synthetic */ boolean $readOnly;
    final /* synthetic */ Shape $shape;
    final /* synthetic */ boolean $singleLine;
    final /* synthetic */ Function2<Composer, Integer, Unit> $suffix;
    final /* synthetic */ Function2<Composer, Integer, Unit> $supportingText;
    final /* synthetic */ Function2<Composer, Integer, Unit> $trailingIcon;
    final /* synthetic */ String $value;
    final /* synthetic */ VisualTransformation $visualTransformation;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TextFieldKt$TextField$2(Modifier modifier, TextFieldColors textFieldColors, boolean z, int i, int i2, String str, Function1<? super String, Unit> function1, boolean z2, boolean z3, TextStyle textStyle, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z4, int i3, int i4, VisualTransformation visualTransformation, MutableInteractionSource mutableInteractionSource, int i5, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, Function2<? super Composer, ? super Integer, Unit> function25, Function2<? super Composer, ? super Integer, Unit> function26, Function2<? super Composer, ? super Integer, Unit> function27, Shape shape) {
        super(2);
        this.$modifier = modifier;
        this.$colors = textFieldColors;
        this.$isError = z;
        this.$$dirty1 = i;
        this.$$dirty2 = i2;
        this.$value = str;
        this.$onValueChange = function1;
        this.$enabled = z2;
        this.$readOnly = z3;
        this.$mergedTextStyle = textStyle;
        this.$keyboardOptions = keyboardOptions;
        this.$keyboardActions = keyboardActions;
        this.$singleLine = z4;
        this.$maxLines = i3;
        this.$minLines = i4;
        this.$visualTransformation = visualTransformation;
        this.$interactionSource = mutableInteractionSource;
        this.$$dirty = i5;
        this.$label = function2;
        this.$placeholder = function22;
        this.$leadingIcon = function23;
        this.$trailingIcon = function24;
        this.$prefix = function25;
        this.$suffix = function26;
        this.$supportingText = function27;
        this.$shape = shape;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C208@10657L20,197@10219L1726:TextField.kt#uh7d8r");
        if ((i & 11) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1859145987, i, -1, "androidx.compose.material3.TextField.<anonymous> (TextField.kt:196)");
            }
            Modifier m779defaultMinSizeVpY3zN4 = SizeKt.m779defaultMinSizeVpY3zN4(this.$modifier, TextFieldDefaults.INSTANCE.m2121getMinWidthD9Ej5fM(), TextFieldDefaults.INSTANCE.m2120getMinHeightD9Ej5fM());
            SolidColor solidColor = new SolidColor(this.$colors.cursorColor$material3_release(this.$isError, composer, ((this.$$dirty1 >> 9) & 14) | ((this.$$dirty2 >> 3) & 112)).getValue().m3301unboximpl(), null);
            ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer, -288211827, true, new AnonymousClass1(this.$value, this.$enabled, this.$singleLine, this.$visualTransformation, this.$interactionSource, this.$isError, this.$label, this.$placeholder, this.$leadingIcon, this.$trailingIcon, this.$prefix, this.$suffix, this.$supportingText, this.$shape, this.$colors, this.$$dirty, this.$$dirty1, this.$$dirty2));
            int i2 = this.$$dirty;
            int i3 = this.$$dirty1;
            BasicTextFieldKt.BasicTextField(this.$value, this.$onValueChange, m779defaultMinSizeVpY3zN4, this.$enabled, this.$readOnly, this.$mergedTextStyle, this.$keyboardOptions, this.$keyboardActions, this.$singleLine, this.$maxLines, this.$minLines, this.$visualTransformation, (Function1<? super TextLayoutResult, Unit>) null, this.$interactionSource, solidColor, composableLambda, composer, (i2 & 57344) | (i2 & 14) | (i2 & 112) | (i2 & 7168) | ((i3 << 3) & 3670016) | ((i3 << 3) & 29360128) | ((i3 << 3) & 234881024) | ((i3 << 3) & 1879048192), ((i3 >> 27) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | ((i3 >> 9) & 112) | ((this.$$dirty2 << 9) & 7168), 4096);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TextField.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.material3.TextFieldKt$TextField$2$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends Lambda implements Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit> {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ int $$dirty1;
        final /* synthetic */ int $$dirty2;
        final /* synthetic */ TextFieldColors $colors;
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ MutableInteractionSource $interactionSource;
        final /* synthetic */ boolean $isError;
        final /* synthetic */ Function2<Composer, Integer, Unit> $label;
        final /* synthetic */ Function2<Composer, Integer, Unit> $leadingIcon;
        final /* synthetic */ Function2<Composer, Integer, Unit> $placeholder;
        final /* synthetic */ Function2<Composer, Integer, Unit> $prefix;
        final /* synthetic */ Shape $shape;
        final /* synthetic */ boolean $singleLine;
        final /* synthetic */ Function2<Composer, Integer, Unit> $suffix;
        final /* synthetic */ Function2<Composer, Integer, Unit> $supportingText;
        final /* synthetic */ Function2<Composer, Integer, Unit> $trailingIcon;
        final /* synthetic */ String $value;
        final /* synthetic */ VisualTransformation $visualTransformation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(String str, boolean z, boolean z2, VisualTransformation visualTransformation, MutableInteractionSource mutableInteractionSource, boolean z3, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, Function2<? super Composer, ? super Integer, Unit> function25, Function2<? super Composer, ? super Integer, Unit> function26, Function2<? super Composer, ? super Integer, Unit> function27, Shape shape, TextFieldColors textFieldColors, int i, int i2, int i3) {
            super(3);
            this.$value = str;
            this.$enabled = z;
            this.$singleLine = z2;
            this.$visualTransformation = visualTransformation;
            this.$interactionSource = mutableInteractionSource;
            this.$isError = z3;
            this.$label = function2;
            this.$placeholder = function22;
            this.$leadingIcon = function23;
            this.$trailingIcon = function24;
            this.$prefix = function25;
            this.$suffix = function26;
            this.$supportingText = function27;
            this.$shape = shape;
            this.$colors = textFieldColors;
            this.$$dirty = i;
            this.$$dirty1 = i2;
            this.$$dirty2 = i3;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function2, Composer composer, Integer num) {
            invoke((Function2<? super Composer, ? super Integer, Unit>) function2, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Function2<? super Composer, ? super Integer, Unit> innerTextField, Composer composer, int i) {
            int i2;
            Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
            ComposerKt.sourceInformation(composer, "C218@11178L743:TextField.kt#uh7d8r");
            if ((i & 14) == 0) {
                i2 = i | (composer.changedInstance(innerTextField) ? 4 : 2);
            } else {
                i2 = i;
            }
            if ((i2 & 91) != 18 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-288211827, i2, -1, "androidx.compose.material3.TextField.<anonymous>.<anonymous> (TextField.kt:216)");
                }
                boolean z = this.$isError;
                Function2<Composer, Integer, Unit> function2 = this.$label;
                Function2<Composer, Integer, Unit> function22 = this.$placeholder;
                Function2<Composer, Integer, Unit> function23 = this.$leadingIcon;
                Function2<Composer, Integer, Unit> function24 = this.$trailingIcon;
                Function2<Composer, Integer, Unit> function25 = this.$prefix;
                Function2<Composer, Integer, Unit> function26 = this.$suffix;
                Function2<Composer, Integer, Unit> function27 = this.$supportingText;
                Shape shape = this.$shape;
                TextFieldColors textFieldColors = this.$colors;
                int i3 = this.$$dirty;
                int i4 = this.$$dirty1;
                int i5 = this.$$dirty2;
                TextFieldDefaults.INSTANCE.DecorationBox(this.$value, innerTextField, this.$enabled, this.$singleLine, this.$visualTransformation, this.$interactionSource, z, function2, function22, function23, function24, function25, function26, function27, shape, textFieldColors, null, null, composer, (i3 & 14) | ((i2 << 3) & 112) | ((i3 >> 3) & 896) | ((i4 >> 12) & 7168) | (i4 & 57344) | ((i5 << 15) & 458752) | ((i4 << 9) & 3670016) | ((i3 << 3) & 29360128) | ((i3 << 3) & 234881024) | ((i3 << 3) & 1879048192), ((i3 >> 27) & 14) | 100663296 | ((i4 << 3) & 112) | ((i4 << 3) & 896) | ((i4 << 3) & 7168) | ((i5 << 9) & 57344) | ((i5 << 9) & 458752), ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    }
}
