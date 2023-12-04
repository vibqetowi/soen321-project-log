package com.ifriend.domain.newChat.chat.systems.appRate;

import com.ifriend.common_entities_engine.EntitiesState;
import com.ifriend.common_entities_engine.System;
import com.ifriend.domain.newChat.chat.models.MessageToSend;
import com.ifriend.domain.newChat.chat.systems.messages.sending.send.result.GlobalSendingMessageResultPublisher;
import com.ifriend.domain.newChat.chat.systems.messages.sending.send.result.SendingMessageResultObserver;
import com.ifriend.domain.rateUs.ShowRateUsUseCase;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.cookie.ClientCookie;
/* compiled from: RateAppChatSystem.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/ifriend/domain/newChat/chat/systems/appRate/RateAppChatSystem;", "Lcom/ifriend/common_entities_engine/System;", "Lcom/ifriend/common_entities_engine/EntitiesState;", "Lcom/ifriend/domain/newChat/chat/systems/messages/sending/send/result/SendingMessageResultObserver;", "globalSendingMessageResultPublisher", "Lcom/ifriend/domain/newChat/chat/systems/messages/sending/send/result/GlobalSendingMessageResultPublisher;", "showRateUsUseCase", "Lcom/ifriend/domain/rateUs/ShowRateUsUseCase;", "(Lcom/ifriend/domain/newChat/chat/systems/messages/sending/send/result/GlobalSendingMessageResultPublisher;Lcom/ifriend/domain/rateUs/ShowRateUsUseCase;)V", "messagesSent", "", "onStart", "", "onStop", "onSuccess", "result", "Lcom/ifriend/domain/newChat/chat/models/MessageToSend$SendingResult$Success;", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RateAppChatSystem extends System<EntitiesState> implements SendingMessageResultObserver {
    private final GlobalSendingMessageResultPublisher globalSendingMessageResultPublisher;
    private int messagesSent;
    private final ShowRateUsUseCase showRateUsUseCase;

    @Override // com.ifriend.domain.newChat.chat.systems.messages.sending.send.result.SendingMessageResultObserver
    public void onError(MessageToSend.SendingResult.Error error) {
        SendingMessageResultObserver.DefaultImpls.onError(this, error);
    }

    public RateAppChatSystem(GlobalSendingMessageResultPublisher globalSendingMessageResultPublisher, ShowRateUsUseCase showRateUsUseCase) {
        Intrinsics.checkNotNullParameter(globalSendingMessageResultPublisher, "globalSendingMessageResultPublisher");
        Intrinsics.checkNotNullParameter(showRateUsUseCase, "showRateUsUseCase");
        this.globalSendingMessageResultPublisher = globalSendingMessageResultPublisher;
        this.showRateUsUseCase = showRateUsUseCase;
    }

    @Override // com.ifriend.common_entities_engine.System
    public void onStart() {
        super.onStart();
        this.globalSendingMessageResultPublisher.addObserver(this);
    }

    @Override // com.ifriend.common_entities_engine.System
    public void onStop() {
        super.onStop();
        this.globalSendingMessageResultPublisher.removeObserver(this);
    }

    @Override // com.ifriend.domain.newChat.chat.systems.messages.sending.send.result.SendingMessageResultObserver
    public void onSuccess(MessageToSend.SendingResult.Success result) {
        Intrinsics.checkNotNullParameter(result, "result");
        SendingMessageResultObserver.DefaultImpls.onSuccess(this, result);
        int i = this.messagesSent + 1;
        this.messagesSent = i;
        this.showRateUsUseCase.showIfNecessary(i);
    }
}
