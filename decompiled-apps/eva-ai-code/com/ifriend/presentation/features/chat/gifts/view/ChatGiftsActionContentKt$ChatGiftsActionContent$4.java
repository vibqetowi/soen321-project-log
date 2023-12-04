package com.ifriend.presentation.features.chat.gifts.view;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import com.ifriend.presentation.features.chat.gifts.model.ChatGiftsUiState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatGiftsActionContent.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatGiftsActionContentKt$ChatGiftsActionContent$4 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Function0<Unit> $onGiftsClick;
    final /* synthetic */ ChatGiftsUiState $uiState;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatGiftsActionContentKt$ChatGiftsActionContent$4(Modifier modifier, ChatGiftsUiState chatGiftsUiState, Function0<Unit> function0, int i, int i2) {
        super(2);
        this.$modifier = modifier;
        this.$uiState = chatGiftsUiState;
        this.$onGiftsClick = function0;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        ChatGiftsActionContentKt.ChatGiftsActionContent(this.$modifier, this.$uiState, this.$onGiftsClick, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
