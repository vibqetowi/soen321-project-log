package com.ifriend.presentation.features.chat.gifts.view;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.ifriend.presentation.features.chat.gifts.model.ChatGiftUi;
import com.ifriend.presentation.features.chat.gifts.model.ChatGiftsUiState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatGiftsContent.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatGiftsContentKt$ChatGiftsContent$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ Function1<ChatGiftUi, Unit> $onGiftClick;
    final /* synthetic */ Function0<Unit> $onGiftsCloseClick;
    final /* synthetic */ ChatGiftsUiState $uiState;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChatGiftsContentKt$ChatGiftsContent$2(ChatGiftsUiState chatGiftsUiState, Function1<? super ChatGiftUi, Unit> function1, Function0<Unit> function0, int i) {
        super(2);
        this.$uiState = chatGiftsUiState;
        this.$onGiftClick = function1;
        this.$onGiftsCloseClick = function0;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        ChatGiftsContentKt.ChatGiftsContent(this.$uiState, this.$onGiftClick, this.$onGiftsCloseClick, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
