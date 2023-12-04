package com.ifriend.presentation.features.chat.intro.view;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.ifriend.presentation.features.chat.intro.model.ChatIntroUiState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatIntroPopup.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatIntroPopupKt$ChatIntroContent$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ Function0<Unit> $onCloseClick;
    final /* synthetic */ Function0<Unit> $onContinueClick;
    final /* synthetic */ ChatIntroUiState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatIntroPopupKt$ChatIntroContent$2(ChatIntroUiState chatIntroUiState, Function0<Unit> function0, Function0<Unit> function02, int i) {
        super(2);
        this.$state = chatIntroUiState;
        this.$onCloseClick = function0;
        this.$onContinueClick = function02;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        ChatIntroPopupKt.ChatIntroContent(this.$state, this.$onCloseClick, this.$onContinueClick, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
