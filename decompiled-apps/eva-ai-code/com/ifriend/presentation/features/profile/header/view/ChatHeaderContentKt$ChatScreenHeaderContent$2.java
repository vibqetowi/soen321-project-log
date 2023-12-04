package com.ifriend.presentation.features.profile.header.view;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import com.ifriend.presentation.features.profile.header.model.ChatHeaderUiState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatHeaderContent.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatHeaderContentKt$ChatScreenHeaderContent$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ ChatHeaderClicks $clicks;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ ChatHeaderUiState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatHeaderContentKt$ChatScreenHeaderContent$2(ChatHeaderUiState chatHeaderUiState, Modifier modifier, ChatHeaderClicks chatHeaderClicks, int i, int i2) {
        super(2);
        this.$state = chatHeaderUiState;
        this.$modifier = modifier;
        this.$clicks = chatHeaderClicks;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        ChatHeaderContentKt.ChatScreenHeaderContent(this.$state, this.$modifier, this.$clicks, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
