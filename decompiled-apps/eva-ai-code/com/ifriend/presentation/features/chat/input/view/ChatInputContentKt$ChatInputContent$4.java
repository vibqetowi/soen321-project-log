package com.ifriend.presentation.features.chat.input.view;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.focus.FocusRequester;
import com.ifriend.presentation.features.chat.input.model.ChatInputState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatInputContent.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatInputContentKt$ChatInputContent$4 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ ChatInputCallbacks $callbacks;
    final /* synthetic */ FocusRequester $focusRequester;
    final /* synthetic */ ChatInputState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatInputContentKt$ChatInputContent$4(ChatInputState chatInputState, ChatInputCallbacks chatInputCallbacks, FocusRequester focusRequester, int i, int i2) {
        super(2);
        this.$state = chatInputState;
        this.$callbacks = chatInputCallbacks;
        this.$focusRequester = focusRequester;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        ChatInputContentKt.ChatInputContent(this.$state, this.$callbacks, this.$focusRequester, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
