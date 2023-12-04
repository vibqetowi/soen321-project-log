package com.ifriend.presentation.features.chat.panel.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.ifriend.presentation.features.chat.panel.models.ChatPanelActionMarker;
import com.ifriend.presentation.features.chat.panel.models.ChatTopicsUiState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatPanelActionsContent.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatPanelActionsContentKt$ChatPanelActionsContent$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ Function1<ChatPanelActionMarker, Unit> $onPanelActionClick;
    final /* synthetic */ ChatTopicsUiState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChatPanelActionsContentKt$ChatPanelActionsContent$2(ChatTopicsUiState chatTopicsUiState, Function1<? super ChatPanelActionMarker, Unit> function1, int i) {
        super(2);
        this.$state = chatTopicsUiState;
        this.$onPanelActionClick = function1;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        ChatPanelActionsContentKt.ChatPanelActionsContent(this.$state, this.$onPanelActionClick, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
