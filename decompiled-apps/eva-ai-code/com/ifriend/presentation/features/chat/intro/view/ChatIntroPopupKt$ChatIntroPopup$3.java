package com.ifriend.presentation.features.chat.intro.view;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.ifriend.presentation.features.chat.intro.model.ChatIntroUiState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatIntroPopup.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatIntroPopupKt$ChatIntroPopup$3 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ Function0<Unit> $onCloseClick;
    final /* synthetic */ Function0<Unit> $onContinueClick;
    final /* synthetic */ ChatIntroUiState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatIntroPopupKt$ChatIntroPopup$3(ChatIntroUiState chatIntroUiState, Function0<Unit> function0, Function0<Unit> function02, int i) {
        super(2);
        this.$state = chatIntroUiState;
        this.$onCloseClick = function0;
        this.$onContinueClick = function02;
        this.$$dirty = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 11) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1454565870, i, -1, "com.ifriend.presentation.features.chat.intro.view.ChatIntroPopup.<anonymous> (ChatIntroPopup.kt:78)");
            }
            ChatIntroUiState chatIntroUiState = this.$state;
            Function0<Unit> function0 = this.$onCloseClick;
            Function0<Unit> function02 = this.$onContinueClick;
            int i2 = this.$$dirty;
            ChatIntroPopupKt.ChatIntroContent(chatIntroUiState, function0, function02, composer, (i2 & 896) | (i2 & 14) | (i2 & 112));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
