package com.ifriend.presentation.features.chat.notifications.view;

import com.ifriend.presentation.features.chat.notifications.model.ChatNotificationUi;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: ChatNotificationsContent.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ifriend/presentation/features/chat/notifications/model/ChatNotificationUi;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ChatNotificationsContentKt$ChatNotificationPreview$1$2 extends Lambda implements Function1<ChatNotificationUi, Unit> {
    public static final ChatNotificationsContentKt$ChatNotificationPreview$1$2 INSTANCE = new ChatNotificationsContentKt$ChatNotificationPreview$1$2();

    ChatNotificationsContentKt$ChatNotificationPreview$1$2() {
        super(1);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(ChatNotificationUi it) {
        Intrinsics.checkNotNullParameter(it, "it");
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ChatNotificationUi chatNotificationUi) {
        invoke2(chatNotificationUi);
        return Unit.INSTANCE;
    }
}
