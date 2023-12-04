package com.ifriend.domain.newChat.chat.systems.messages.sending.showSending;

import com.facebook.share.internal.ShareConstants;
import com.ifriend.common_entities_engine.EntitiesState;
import com.ifriend.common_entities_engine.Entity;
import com.ifriend.common_entities_engine.System;
import com.ifriend.domain.newChat.chat.systems.messages.sending.send.QueuedMessageToEntityMapper;
import com.ifriend.domain.newChat.chat.systems.messages.sending.send.SendingMessagesQueue;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.cookie.ClientCookie;
/* compiled from: ShowSendingMessagesSystem.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rH\u0016J\b\u0010\u0013\u001a\u00020\u0011H\u0016J\b\u0010\u0014\u001a\u00020\u0011H\u0016J\u0019\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0017R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R2\u0010\u000b\u001a&\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\r0\r \u000e*\u0012\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\r0\r\u0018\u00010\u000f0\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Lcom/ifriend/domain/newChat/chat/systems/messages/sending/showSending/ShowSendingMessagesSystem;", "Lcom/ifriend/common_entities_engine/System;", "Lcom/ifriend/common_entities_engine/EntitiesState;", "Lcom/ifriend/domain/newChat/chat/systems/messages/sending/send/SendingMessagesQueue$Listener;", "queue", "Lcom/ifriend/domain/newChat/chat/systems/messages/sending/send/SendingMessagesQueue;", "queuedMessageToEntityMapper", "Lcom/ifriend/domain/newChat/chat/systems/messages/sending/send/QueuedMessageToEntityMapper;", "chatId", "", "(Lcom/ifriend/domain/newChat/chat/systems/messages/sending/send/SendingMessagesQueue;Lcom/ifriend/domain/newChat/chat/systems/messages/sending/send/QueuedMessageToEntityMapper;Ljava/lang/String;)V", "messagesToAdd", "", "Lcom/ifriend/domain/newChat/chat/systems/messages/sending/send/SendingMessagesQueue$QueuedMessage;", "kotlin.jvm.PlatformType", "", "onNewMessageAdded", "", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "onStart", "onStop", "onUpdateState", "state", "(Lcom/ifriend/common_entities_engine/EntitiesState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ShowSendingMessagesSystem extends System<EntitiesState> implements SendingMessagesQueue.Listener {
    private final String chatId;
    private List<SendingMessagesQueue.QueuedMessage> messagesToAdd;
    private final SendingMessagesQueue queue;
    private final QueuedMessageToEntityMapper queuedMessageToEntityMapper;

    @Override // com.ifriend.domain.newChat.chat.systems.messages.sending.send.SendingMessagesQueue.Listener
    public void onMessageRemoved(SendingMessagesQueue.QueuedMessage queuedMessage) {
        SendingMessagesQueue.Listener.DefaultImpls.onMessageRemoved(this, queuedMessage);
    }

    public ShowSendingMessagesSystem(SendingMessagesQueue queue, QueuedMessageToEntityMapper queuedMessageToEntityMapper, String chatId) {
        Intrinsics.checkNotNullParameter(queue, "queue");
        Intrinsics.checkNotNullParameter(queuedMessageToEntityMapper, "queuedMessageToEntityMapper");
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        this.queue = queue;
        this.queuedMessageToEntityMapper = queuedMessageToEntityMapper;
        this.chatId = chatId;
        this.messagesToAdd = Collections.synchronizedList(new ArrayList());
    }

    @Override // com.ifriend.common_entities_engine.System
    public void onStart() {
        super.onStart();
        this.queue.addListener(this);
    }

    @Override // com.ifriend.common_entities_engine.System
    public void onStop() {
        super.onStop();
        this.queue.removeListener(this);
    }

    @Override // com.ifriend.domain.newChat.chat.systems.messages.sending.send.SendingMessagesQueue.Listener
    public void onNewMessageAdded(SendingMessagesQueue.QueuedMessage message) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (Intrinsics.areEqual(message.getChatId(), this.chatId)) {
            this.messagesToAdd.add(message);
            reportUpdateState();
        }
    }

    @Override // com.ifriend.common_entities_engine.System
    public Object onUpdateState(EntitiesState entitiesState, Continuation<? super EntitiesState> continuation) {
        List<SendingMessagesQueue.QueuedMessage> messagesToAdd = this.messagesToAdd;
        Intrinsics.checkNotNullExpressionValue(messagesToAdd, "messagesToAdd");
        ArrayList arrayList = new ArrayList();
        for (SendingMessagesQueue.QueuedMessage queuedMessage : messagesToAdd) {
            QueuedMessageToEntityMapper queuedMessageToEntityMapper = this.queuedMessageToEntityMapper;
            Intrinsics.checkNotNull(queuedMessage);
            Entity map = queuedMessageToEntityMapper.map(queuedMessage);
            if (map != null) {
                arrayList.add(map);
            }
        }
        this.messagesToAdd.clear();
        return EntitiesState.copy$default(entitiesState, CollectionsKt.plus((Collection) entitiesState.getEntities(), (Iterable) arrayList), null, 2, null);
    }
}
