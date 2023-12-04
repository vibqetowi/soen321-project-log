package com.ifriend.presentation.features.chatsettings.ui;

import com.ifriend.presentation.features.chatsettings.viewmodel.ChatSettingsViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ChatSettingsScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
/* synthetic */ class ChatSettingsScreenKt$ChatSettingsScreen$1$1$1$2 extends FunctionReferenceImpl implements Function1<ChatSettingsViewModel.UiState.ActionTag, Unit> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public ChatSettingsScreenKt$ChatSettingsScreen$1$1$1$2(Object obj) {
        super(1, obj, ChatSettingsViewModel.class, "onActionTagClick", "onActionTagClick(Lcom/ifriend/presentation/features/chatsettings/viewmodel/ChatSettingsViewModel$UiState$ActionTag;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ChatSettingsViewModel.UiState.ActionTag actionTag) {
        invoke2(actionTag);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(ChatSettingsViewModel.UiState.ActionTag p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((ChatSettingsViewModel) this.receiver).onActionTagClick(p0);
    }
}
