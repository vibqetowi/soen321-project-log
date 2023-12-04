package com.ifriend.presentation.features.chat.input.view;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.focus.FocusRequester;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatInputContent.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatInputContentKt$MessageTextField$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ FocusRequester $focusRequester;
    final /* synthetic */ boolean $isVisible;
    final /* synthetic */ Function1<String, Unit> $onTextChange;
    final /* synthetic */ String $placeholder;
    final /* synthetic */ String $text;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChatInputContentKt$MessageTextField$1(String str, String str2, boolean z, Function1<? super String, Unit> function1, FocusRequester focusRequester, int i) {
        super(2);
        this.$text = str;
        this.$placeholder = str2;
        this.$isVisible = z;
        this.$onTextChange = function1;
        this.$focusRequester = focusRequester;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        ChatInputContentKt.MessageTextField(this.$text, this.$placeholder, this.$isVisible, this.$onTextChange, this.$focusRequester, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
