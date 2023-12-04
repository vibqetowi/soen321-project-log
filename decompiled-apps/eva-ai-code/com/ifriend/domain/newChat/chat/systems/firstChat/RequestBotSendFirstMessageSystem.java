package com.ifriend.domain.newChat.chat.systems.firstChat;

import com.ifriend.common_entities_engine.CoroutineScopeSystem;
import com.ifriend.common_entities_engine.EntitiesState;
import com.ifriend.common_entities_engine.State;
import com.ifriend.domain.newChat.chat.ChatClientKt;
import com.ifriend.domain.newChat.chat.systems.messages.sending.send.ChatMessagesRepository;
import com.ifriend.domain.socket.MessagesSource;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.apache.http.cookie.ClientCookie;
/* compiled from: RequestBotSendFirstMessageSystem.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0011R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Lcom/ifriend/domain/newChat/chat/systems/firstChat/RequestBotSendFirstMessageSystem;", "Lcom/ifriend/common_entities_engine/CoroutineScopeSystem;", "Lcom/ifriend/common_entities_engine/EntitiesState;", "chatMessagesRepository", "Lcom/ifriend/domain/newChat/chat/systems/messages/sending/send/ChatMessagesRepository;", "messagesSource", "Lcom/ifriend/domain/socket/MessagesSource;", "chatId", "", "scope", "Lkotlinx/coroutines/CoroutineScope;", "(Lcom/ifriend/domain/newChat/chat/systems/messages/sending/send/ChatMessagesRepository;Lcom/ifriend/domain/socket/MessagesSource;Ljava/lang/String;Lkotlinx/coroutines/CoroutineScope;)V", "isMessageRequested", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isRequestInProgress", "onUpdateState", "state", "(Lcom/ifriend/common_entities_engine/EntitiesState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RequestBotSendFirstMessageSystem extends CoroutineScopeSystem<EntitiesState> {
    private final String chatId;
    private final ChatMessagesRepository chatMessagesRepository;
    private final AtomicBoolean isMessageRequested;
    private final AtomicBoolean isRequestInProgress;
    private final MessagesSource messagesSource;

    @Override // com.ifriend.common_entities_engine.System
    public /* bridge */ /* synthetic */ Object onUpdateState(State state, Continuation continuation) {
        return onUpdateState((EntitiesState) state, (Continuation<? super EntitiesState>) continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RequestBotSendFirstMessageSystem(ChatMessagesRepository chatMessagesRepository, MessagesSource messagesSource, String chatId, CoroutineScope scope) {
        super(scope);
        Intrinsics.checkNotNullParameter(chatMessagesRepository, "chatMessagesRepository");
        Intrinsics.checkNotNullParameter(messagesSource, "messagesSource");
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.chatMessagesRepository = chatMessagesRepository;
        this.messagesSource = messagesSource;
        this.chatId = chatId;
        this.isRequestInProgress = new AtomicBoolean(false);
        this.isMessageRequested = new AtomicBoolean(false);
    }

    public Object onUpdateState(EntitiesState entitiesState, Continuation<? super EntitiesState> continuation) {
        if (ChatClientKt.getMessages(entitiesState).isEmpty() && !this.isMessageRequested.get() && !this.isRequestInProgress.get()) {
            this.isRequestInProgress.set(true);
            BuildersKt__Builders_commonKt.launch$default(this, null, null, new RequestBotSendFirstMessageSystem$onUpdateState$2(this, null), 3, null);
        }
        return entitiesState;
    }
}
