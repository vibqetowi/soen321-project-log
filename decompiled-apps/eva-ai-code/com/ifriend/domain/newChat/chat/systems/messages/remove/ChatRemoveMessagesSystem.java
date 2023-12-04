package com.ifriend.domain.newChat.chat.systems.messages.remove;

import androidx.core.app.NotificationCompat;
import com.ifriend.common_entities_engine.CoroutineScopeSystem;
import com.ifriend.common_entities_engine.EntitiesState;
import com.ifriend.common_entities_engine.Entity;
import com.ifriend.common_entities_engine.Event;
import com.ifriend.common_entities_engine.State;
import com.ifriend.domain.CoroutineDispatchers;
import com.ifriend.domain.logic.chat.events.ChatRemoveMessageEvent;
import com.ifriend.domain.logic.chat.events.ChatRemoveMessageUserEvent;
import com.ifriend.domain.newChat.chat.models.ChatMessage;
import com.ifriend.domain.newChat.chat.systems.messages.sending.send.ChatMessagesRepository;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.apache.http.cookie.ClientCookie;
/* compiled from: ChatRemoveMessagesSystem.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0019\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0014J\u0019\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0017R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R2\u0010\f\u001a&\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\u00060\u0006 \u000e*\u0012\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u000f0\rX\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Lcom/ifriend/domain/newChat/chat/systems/messages/remove/ChatRemoveMessagesSystem;", "Lcom/ifriend/common_entities_engine/CoroutineScopeSystem;", "Lcom/ifriend/common_entities_engine/EntitiesState;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "chatId", "", "dispatchers", "Lcom/ifriend/domain/CoroutineDispatchers;", "chatMessagesRepository", "Lcom/ifriend/domain/newChat/chat/systems/messages/sending/send/ChatMessagesRepository;", "(Lkotlinx/coroutines/CoroutineScope;Ljava/lang/String;Lcom/ifriend/domain/CoroutineDispatchers;Lcom/ifriend/domain/newChat/chat/systems/messages/sending/send/ChatMessagesRepository;)V", "removeMessage", "", "kotlin.jvm.PlatformType", "", "onHandleEvent", "", NotificationCompat.CATEGORY_EVENT, "Lcom/ifriend/common_entities_engine/Event;", "(Lcom/ifriend/common_entities_engine/Event;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onUpdateState", "state", "(Lcom/ifriend/common_entities_engine/EntitiesState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatRemoveMessagesSystem extends CoroutineScopeSystem<EntitiesState> {
    private final String chatId;
    private final ChatMessagesRepository chatMessagesRepository;
    private final CoroutineDispatchers dispatchers;
    private List<String> removeMessage;

    @Override // com.ifriend.common_entities_engine.System
    public /* bridge */ /* synthetic */ Object onUpdateState(State state, Continuation continuation) {
        return onUpdateState((EntitiesState) state, (Continuation<? super EntitiesState>) continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatRemoveMessagesSystem(CoroutineScope scope, String chatId, CoroutineDispatchers dispatchers, ChatMessagesRepository chatMessagesRepository) {
        super(scope);
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        Intrinsics.checkNotNullParameter(chatMessagesRepository, "chatMessagesRepository");
        this.chatId = chatId;
        this.dispatchers = dispatchers;
        this.chatMessagesRepository = chatMessagesRepository;
        this.removeMessage = Collections.synchronizedList(new ArrayList());
    }

    @Override // com.ifriend.common_entities_engine.System
    public Object onHandleEvent(Event event, Continuation<? super Boolean> continuation) {
        if (event instanceof ChatRemoveMessageUserEvent) {
            BuildersKt__Builders_commonKt.launch$default(this, this.dispatchers.getIO(), null, new ChatRemoveMessagesSystem$onHandleEvent$2(event, this, null), 2, null);
        } else if (event instanceof ChatRemoveMessageEvent) {
            this.removeMessage.add(((ChatRemoveMessageEvent) event).getMessageId());
            reportUpdateState();
        } else {
            return super.onHandleEvent(event, continuation);
        }
        return Boxing.boxBoolean(true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0056, code lost:
        if (r5.removeMessage.contains(r3.getInfo().getIds().getMessageId()) != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object onUpdateState(EntitiesState entitiesState, Continuation<? super EntitiesState> continuation) {
        List<String> removeMessage = this.removeMessage;
        Intrinsics.checkNotNullExpressionValue(removeMessage, "removeMessage");
        if (!(!removeMessage.isEmpty())) {
            return entitiesState;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = CollectionsKt.toMutableList((Collection) entitiesState.getEntities()).iterator();
        while (true) {
            Entity entity = null;
            if (!it.hasNext()) {
                this.removeMessage.clear();
                return EntitiesState.copy$default(entitiesState, arrayList, null, 2, null);
            }
            Entity entity2 = (Entity) it.next();
            ChatMessage chatMessage = (ChatMessage) entity2.get(Reflection.getOrCreateKotlinClass(ChatMessage.class));
            if (chatMessage != null) {
            }
            entity = entity2;
            if (entity != null) {
                arrayList.add(entity);
            }
        }
    }
}
