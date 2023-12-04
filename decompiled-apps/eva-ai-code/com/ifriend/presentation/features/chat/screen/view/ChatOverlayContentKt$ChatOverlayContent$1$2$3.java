package com.ifriend.presentation.features.chat.screen.view;

import com.ifriend.presentation.features.chat.notifications.model.ChatNotificationUi;
import com.ifriend.presentation.features.chat.screen.viewmodel.ChatViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ChatOverlayContent.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
/* synthetic */ class ChatOverlayContentKt$ChatOverlayContent$1$2$3 extends FunctionReferenceImpl implements Function1<ChatNotificationUi, Unit> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public ChatOverlayContentKt$ChatOverlayContent$1$2$3(Object obj) {
        super(1, obj, ChatViewModel.class, "onNotificationDismissed", "onNotificationDismissed(Lcom/ifriend/presentation/features/chat/notifications/model/ChatNotificationUi;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ChatNotificationUi chatNotificationUi) {
        invoke2(chatNotificationUi);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(ChatNotificationUi p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((ChatViewModel) this.receiver).onNotificationDismissed(p0);
    }
}
