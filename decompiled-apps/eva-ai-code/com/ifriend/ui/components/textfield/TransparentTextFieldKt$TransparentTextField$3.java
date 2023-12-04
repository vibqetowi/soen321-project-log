package com.ifriend.ui.components.textfield;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TransparentTextField.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TransparentTextFieldKt$TransparentTextField$3 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ KeyboardActions $keyboardActions;
    final /* synthetic */ KeyboardOptions $keyboardOptions;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Function1<String, Unit> $onTextChanged;
    final /* synthetic */ String $placeholder;
    final /* synthetic */ TextStyle $placeholderTextStyle;
    final /* synthetic */ boolean $singleLine;
    final /* synthetic */ String $text;
    final /* synthetic */ TextStyle $textStyle;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TransparentTextFieldKt$TransparentTextField$3(String str, Function1<? super String, Unit> function1, Modifier modifier, boolean z, TextStyle textStyle, TextStyle textStyle2, String str2, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, MutableInteractionSource mutableInteractionSource, int i, int i2) {
        super(2);
        this.$text = str;
        this.$onTextChanged = function1;
        this.$modifier = modifier;
        this.$singleLine = z;
        this.$textStyle = textStyle;
        this.$placeholderTextStyle = textStyle2;
        this.$placeholder = str2;
        this.$keyboardOptions = keyboardOptions;
        this.$keyboardActions = keyboardActions;
        this.$interactionSource = mutableInteractionSource;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        TransparentTextFieldKt.TransparentTextField(this.$text, this.$onTextChanged, this.$modifier, this.$singleLine, this.$textStyle, this.$placeholderTextStyle, this.$placeholder, this.$keyboardOptions, this.$keyboardActions, this.$interactionSource, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
