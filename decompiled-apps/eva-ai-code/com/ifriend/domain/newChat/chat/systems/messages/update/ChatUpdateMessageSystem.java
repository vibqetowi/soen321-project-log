package com.ifriend.domain.newChat.chat.systems.messages.update;

import androidx.core.app.NotificationCompat;
import com.ifriend.common_entities_engine.Component;
import com.ifriend.common_entities_engine.ComponentsHolderKt;
import com.ifriend.common_entities_engine.CoroutineScopeSystem;
import com.ifriend.common_entities_engine.EntitiesState;
import com.ifriend.common_entities_engine.Entity;
import com.ifriend.common_entities_engine.Event;
import com.ifriend.common_entities_engine.State;
import com.ifriend.domain.logic.chat.events.ChatUpdateMessageEvent;
import com.ifriend.domain.newChat.chat.models.ChatMessage;
import com.ifriend.domain.newChat.chat.models.ChatMessageKt;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScope;
import org.apache.http.cookie.ClientCookie;
/* compiled from: ChatUpdateMessageSystem.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0019\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u000fJ\u0019\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0012R2\u0010\u0006\u001a&\u0012\f\u0012\n \t*\u0004\u0018\u00010\b0\b \t*\u0012\u0012\f\u0012\n \t*\u0004\u0018\u00010\b0\b\u0018\u00010\n0\u0007X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Lcom/ifriend/domain/newChat/chat/systems/messages/update/ChatUpdateMessageSystem;", "Lcom/ifriend/common_entities_engine/CoroutineScopeSystem;", "Lcom/ifriend/common_entities_engine/EntitiesState;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "(Lkotlinx/coroutines/CoroutineScope;)V", "messages", "", "Lcom/ifriend/domain/newChat/chat/models/ChatMessage;", "kotlin.jvm.PlatformType", "", "onHandleEvent", "", NotificationCompat.CATEGORY_EVENT, "Lcom/ifriend/common_entities_engine/Event;", "(Lcom/ifriend/common_entities_engine/Event;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onUpdateState", "state", "(Lcom/ifriend/common_entities_engine/EntitiesState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatUpdateMessageSystem extends CoroutineScopeSystem<EntitiesState> {
    private List<ChatMessage> messages;

    @Override // com.ifriend.common_entities_engine.System
    public /* bridge */ /* synthetic */ Object onUpdateState(State state, Continuation continuation) {
        return onUpdateState((EntitiesState) state, (Continuation<? super EntitiesState>) continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatUpdateMessageSystem(CoroutineScope scope) {
        super(scope);
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.messages = Collections.synchronizedList(new ArrayList());
    }

    @Override // com.ifriend.common_entities_engine.System
    public Object onHandleEvent(Event event, Continuation<? super Boolean> continuation) {
        if (event instanceof ChatUpdateMessageEvent) {
            this.messages.add(((ChatUpdateMessageEvent) event).getChatMessage());
            reportUpdateState();
            return Boxing.boxBoolean(true);
        }
        return super.onHandleEvent(event, continuation);
    }

    public Object onUpdateState(EntitiesState entitiesState, Continuation<? super EntitiesState> continuation) {
        List<ChatMessage> messages = this.messages;
        Intrinsics.checkNotNullExpressionValue(messages, "messages");
        if (!(!messages.isEmpty())) {
            return entitiesState;
        }
        List<Entity> entities = entitiesState.getEntities();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(entities, 10));
        Iterator<T> it = entities.iterator();
        while (true) {
            Object obj = null;
            if (!it.hasNext()) {
                return EntitiesState.copy$default(entitiesState, arrayList, null, 2, null);
            }
            Entity entity = (Entity) it.next();
            Component component = entity.get(Reflection.getOrCreateKotlinClass(ChatMessage.class));
            if (component != null) {
                ChatMessage chatMessage = (ChatMessage) component;
                List<ChatMessage> messages2 = this.messages;
                Intrinsics.checkNotNullExpressionValue(messages2, "messages");
                Iterator<T> it2 = messages2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next = it2.next();
                    ChatMessage chatMessage2 = (ChatMessage) next;
                    Intrinsics.checkNotNull(chatMessage2);
                    if (Intrinsics.areEqual(ChatMessageKt.getId(chatMessage2), ChatMessageKt.getId(chatMessage))) {
                        obj = next;
                        break;
                    }
                }
                ChatMessage chatMessage3 = (ChatMessage) obj;
                if (chatMessage3 != null) {
                    this.messages.remove(chatMessage3);
                    ChatMessage copy = chatMessage.copy(chatMessage3.getInfo(), chatMessage3.getContent());
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : entity.getComponents()) {
                        if (!(((Component) obj2) instanceof ChatMessage)) {
                            arrayList2.add(obj2);
                        }
                    }
                    Entity copy2 = entity.copy(ComponentsHolderKt.add(CollectionsKt.toSet(arrayList2), copy));
                    if (copy2 != null) {
                        entity = copy2;
                    }
                }
            }
            arrayList.add(entity);
        }
    }
}
