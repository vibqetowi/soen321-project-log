package com.ifriend.domain.newChat.chat.systems.errorsHandling;

import com.ifriend.common_entities_engine.EntitiesState;
import com.ifriend.common_entities_engine.System;
import com.ifriend.domain.newChat.chat.models.MessageToSend;
import com.ifriend.domain.newChat.chat.systems.errorsHandling.notifications.IncorrectImageFormat;
import com.ifriend.domain.newChat.chat.systems.errorsHandling.notifications.UnableToSendImage;
import com.ifriend.domain.newChat.chat.systems.messages.sending.send.result.GlobalSendingMessageResultPublisher;
import com.ifriend.domain.newChat.chat.systems.messages.sending.send.result.SendingMessageResultObserver;
import com.ifriend.internal_notifications.handler.InternalNotificationHandler;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.cookie.ClientCookie;
/* compiled from: SendingErrorsHandlingSystem.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0017\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\nH\u0016J\b\u0010\u000e\u001a\u00020\nH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/ifriend/domain/newChat/chat/systems/errorsHandling/SendingErrorsHandlingSystem;", "Lcom/ifriend/common_entities_engine/System;", "Lcom/ifriend/common_entities_engine/EntitiesState;", "Lcom/ifriend/domain/newChat/chat/systems/messages/sending/send/result/SendingMessageResultObserver;", "publisher", "Lcom/ifriend/domain/newChat/chat/systems/messages/sending/send/result/GlobalSendingMessageResultPublisher;", "internalNotificationHandler", "Lcom/ifriend/internal_notifications/handler/InternalNotificationHandler;", "(Lcom/ifriend/domain/newChat/chat/systems/messages/sending/send/result/GlobalSendingMessageResultPublisher;Lcom/ifriend/internal_notifications/handler/InternalNotificationHandler;)V", "onError", "", "error", "Lcom/ifriend/domain/newChat/chat/models/MessageToSend$SendingResult$Error;", "onStart", "onStop", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SendingErrorsHandlingSystem extends System<EntitiesState> implements SendingMessageResultObserver {
    private final InternalNotificationHandler internalNotificationHandler;
    private final GlobalSendingMessageResultPublisher publisher;

    @Override // com.ifriend.domain.newChat.chat.systems.messages.sending.send.result.SendingMessageResultObserver
    public void onSuccess(MessageToSend.SendingResult.Success success) {
        SendingMessageResultObserver.DefaultImpls.onSuccess(this, success);
    }

    @Inject
    public SendingErrorsHandlingSystem(GlobalSendingMessageResultPublisher publisher, InternalNotificationHandler internalNotificationHandler) {
        Intrinsics.checkNotNullParameter(publisher, "publisher");
        Intrinsics.checkNotNullParameter(internalNotificationHandler, "internalNotificationHandler");
        this.publisher = publisher;
        this.internalNotificationHandler = internalNotificationHandler;
    }

    @Override // com.ifriend.common_entities_engine.System
    public void onStart() {
        super.onStart();
        this.publisher.addObserver(this);
    }

    @Override // com.ifriend.common_entities_engine.System
    public void onStop() {
        super.onStop();
        this.publisher.removeObserver(this);
    }

    @Override // com.ifriend.domain.newChat.chat.systems.messages.sending.send.result.SendingMessageResultObserver
    public void onError(MessageToSend.SendingResult.Error error) {
        Intrinsics.checkNotNullParameter(error, "error");
        SendingMessageResultObserver.DefaultImpls.onError(this, error);
        if ((error instanceof MessageToSend.ErrorWhileSending) || (error instanceof MessageToSend.UserIsNotAuthorizedError)) {
            return;
        }
        if (error instanceof MessageToSend.Image.IncorrectImageFormat) {
            this.internalNotificationHandler.handle(IncorrectImageFormat.INSTANCE);
        } else if (error instanceof MessageToSend.Image.UnableToSendImage) {
            this.internalNotificationHandler.handle(UnableToSendImage.INSTANCE);
        } else {
            boolean z = error instanceof MessageToSend.Audio.NothingToSend;
        }
    }
}
