package com.ifriend.domain.newChat.chat.systems.messages.sending.send;

import androidx.core.app.NotificationCompat;
import com.ifriend.common_entities_engine.CoroutineScopeSystem;
import com.ifriend.common_entities_engine.EntitiesState;
import com.ifriend.common_entities_engine.Event;
import com.ifriend.domain.CoroutineDispatchers;
import com.ifriend.domain.newChat.chat.systems.messages.sending.send.SendingMessagesQueue;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.apache.http.cookie.ClientCookie;
/* compiled from: SendingMessagesSystem.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B%\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0019\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0011R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Lcom/ifriend/domain/newChat/chat/systems/messages/sending/send/SendingMessagesSystem;", "Lcom/ifriend/common_entities_engine/CoroutineScopeSystem;", "Lcom/ifriend/common_entities_engine/EntitiesState;", "Lcom/ifriend/domain/newChat/chat/systems/messages/sending/send/SendingMessagesQueue$Listener;", "chatId", "", "chatMessagesRepository", "Lcom/ifriend/domain/newChat/chat/systems/messages/sending/send/ChatMessagesRepository;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "dispatchers", "Lcom/ifriend/domain/CoroutineDispatchers;", "(Ljava/lang/String;Lcom/ifriend/domain/newChat/chat/systems/messages/sending/send/ChatMessagesRepository;Lkotlinx/coroutines/CoroutineScope;Lcom/ifriend/domain/CoroutineDispatchers;)V", "onHandleEvent", "", NotificationCompat.CATEGORY_EVENT, "Lcom/ifriend/common_entities_engine/Event;", "(Lcom/ifriend/common_entities_engine/Event;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SendingMessagesSystem extends CoroutineScopeSystem<EntitiesState> implements SendingMessagesQueue.Listener {
    private final String chatId;
    private final ChatMessagesRepository chatMessagesRepository;
    private final CoroutineDispatchers dispatchers;

    @Override // com.ifriend.domain.newChat.chat.systems.messages.sending.send.SendingMessagesQueue.Listener
    public void onMessageRemoved(SendingMessagesQueue.QueuedMessage queuedMessage) {
        SendingMessagesQueue.Listener.DefaultImpls.onMessageRemoved(this, queuedMessage);
    }

    @Override // com.ifriend.domain.newChat.chat.systems.messages.sending.send.SendingMessagesQueue.Listener
    public void onNewMessageAdded(SendingMessagesQueue.QueuedMessage queuedMessage) {
        SendingMessagesQueue.Listener.DefaultImpls.onNewMessageAdded(this, queuedMessage);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SendingMessagesSystem(String chatId, ChatMessagesRepository chatMessagesRepository, CoroutineScope scope, CoroutineDispatchers dispatchers) {
        super(scope);
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(chatMessagesRepository, "chatMessagesRepository");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        this.chatId = chatId;
        this.chatMessagesRepository = chatMessagesRepository;
        this.dispatchers = dispatchers;
    }

    @Override // com.ifriend.common_entities_engine.System
    public Object onHandleEvent(Event event, Continuation<? super Boolean> continuation) {
        if (event instanceof SendMessageEvent) {
            BuildersKt__Builders_commonKt.launch$default(this, this.dispatchers.getIO(), null, new SendingMessagesSystem$onHandleEvent$2(this, event, null), 2, null);
            return Boxing.boxBoolean(true);
        }
        return super.onHandleEvent(event, continuation);
    }
}
