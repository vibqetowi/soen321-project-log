package com.ifriend.domain.newChat.chat.systems.messages.sending.removeUnsuccessfulSent;

import com.ifriend.common_entities_engine.EntitiesState;
import com.ifriend.common_entities_engine.Entity;
import com.ifriend.common_entities_engine.System;
import com.ifriend.domain.UpdateKt;
import com.ifriend.domain.newChat.chat.models.MessageTag;
import com.ifriend.domain.newChat.chat.models.MessageToSend;
import com.ifriend.domain.newChat.chat.systems.messages.sending.send.result.GlobalSendingMessageResultPublisher;
import com.ifriend.domain.newChat.chat.systems.messages.sending.send.result.SendingMessageResultObserver;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.cookie.ClientCookie;
/* compiled from: RemoveUnsuccessfulSentMessagesSystem.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\rH\u0016J\b\u0010\u0011\u001a\u00020\rH\u0016J\u0019\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0014J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0013\u001a\u00020\u0002H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R2\u0010\u0007\u001a&\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t \n*\u0012\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t\u0018\u00010\u000b0\bX\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Lcom/ifriend/domain/newChat/chat/systems/messages/sending/removeUnsuccessfulSent/RemoveUnsuccessfulSentMessagesSystem;", "Lcom/ifriend/common_entities_engine/System;", "Lcom/ifriend/common_entities_engine/EntitiesState;", "Lcom/ifriend/domain/newChat/chat/systems/messages/sending/send/result/SendingMessageResultObserver;", "publisher", "Lcom/ifriend/domain/newChat/chat/systems/messages/sending/send/result/GlobalSendingMessageResultPublisher;", "(Lcom/ifriend/domain/newChat/chat/systems/messages/sending/send/result/GlobalSendingMessageResultPublisher;)V", "tagsToRemove", "", "Lcom/ifriend/domain/newChat/chat/models/MessageTag;", "kotlin.jvm.PlatformType", "", "onError", "", "error", "Lcom/ifriend/domain/newChat/chat/models/MessageToSend$SendingResult$Error;", "onStart", "onStop", "onUpdateState", "state", "(Lcom/ifriend/common_entities_engine/EntitiesState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "removeMessagesWithTagsToRemove", "", "Lcom/ifriend/common_entities_engine/Entity;", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RemoveUnsuccessfulSentMessagesSystem extends System<EntitiesState> implements SendingMessageResultObserver {
    private final GlobalSendingMessageResultPublisher publisher;
    private Set<MessageTag> tagsToRemove;

    @Override // com.ifriend.domain.newChat.chat.systems.messages.sending.send.result.SendingMessageResultObserver
    public void onSuccess(MessageToSend.SendingResult.Success success) {
        SendingMessageResultObserver.DefaultImpls.onSuccess(this, success);
    }

    public RemoveUnsuccessfulSentMessagesSystem(GlobalSendingMessageResultPublisher publisher) {
        Intrinsics.checkNotNullParameter(publisher, "publisher");
        this.publisher = publisher;
        this.tagsToRemove = Collections.synchronizedSet(new LinkedHashSet());
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
        this.tagsToRemove.add(error.getTag());
        reportUpdateState();
    }

    @Override // com.ifriend.common_entities_engine.System
    public Object onUpdateState(EntitiesState entitiesState, Continuation<? super EntitiesState> continuation) {
        EntitiesState copy$default = EntitiesState.copy$default(entitiesState, removeMessagesWithTagsToRemove(entitiesState), null, 2, null);
        this.tagsToRemove.clear();
        return copy$default;
    }

    private final List<Entity> removeMessagesWithTagsToRemove(EntitiesState entitiesState) {
        return UpdateKt.update(entitiesState.getEntities(), new RemoveUnsuccessfulSentMessagesSystem$removeMessagesWithTagsToRemove$1(this));
    }
}
