package com.ifriend.domain.newChat.chat.systems.messages.topics;

import com.ifriend.common_entities_engine.Component;
import com.ifriend.common_entities_engine.EntitiesState;
import com.ifriend.common_entities_engine.Entity;
import com.ifriend.common_entities_engine.System;
import com.ifriend.domain.UpdateKt;
import com.ifriend.domain.newChat.chat.models.ChatMessage;
import com.ifriend.domain.newChat.chat.models.MessageInfo;
import com.ifriend.domain.newChat.chat.models.MessageMeta;
import com.ifriend.domain.newChat.chat.systems.sorting.SortComponent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.apache.http.cookie.ClientCookie;
/* compiled from: TopicsSystem.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0019\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"Lcom/ifriend/domain/newChat/chat/systems/messages/topics/TopicsSystem;", "Lcom/ifriend/common_entities_engine/System;", "Lcom/ifriend/common_entities_engine/EntitiesState;", "()V", "onUpdateState", "state", "(Lcom/ifriend/common_entities_engine/EntitiesState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TopicsSystem extends System<EntitiesState> {
    @Override // com.ifriend.common_entities_engine.System
    public Object onUpdateState(EntitiesState entitiesState, Continuation<? super EntitiesState> continuation) {
        MessageMeta.Topic topic;
        SortComponent sortComponent;
        MessageInfo info;
        List<Entity> entities = entitiesState.getEntities();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = entities.iterator();
        int i = 0;
        while (true) {
            Entity entity = null;
            if (!it.hasNext()) {
                return EntitiesState.copy$default(entitiesState, UpdateKt.update(entities, new TopicsSystem$onUpdateState$updatedEntities$1(arrayList)), null, 2, null);
            }
            Object next = it.next();
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            Entity entity2 = (Entity) next;
            ChatMessage chatMessage = (ChatMessage) entity2.get(Reflection.getOrCreateKotlinClass(ChatMessage.class));
            if (chatMessage != null && (topic = chatMessage.getInfo().getTopic()) != null) {
                Entity entity3 = (Entity) CollectionsKt.getOrNull(entities, i - 1);
                ChatMessage chatMessage2 = entity3 != null ? (ChatMessage) entity3.get(Reflection.getOrCreateKotlinClass(ChatMessage.class)) : null;
                MessageMeta.Topic topic2 = (chatMessage2 == null || (info = chatMessage2.getInfo()) == null) ? null : info.getTopic();
                if (!Intrinsics.areEqual(topic.getText(), topic2 != null ? topic2.getText() : null) && (sortComponent = (SortComponent) entity2.get(Reflection.getOrCreateKotlinClass(SortComponent.class))) != null) {
                    entity = new Entity(SetsKt.setOf((Object[]) new Component[]{new SortComponent.TopDecorator(sortComponent), new TopicComponent(chatMessage.getInfo().getTimestamp(), topic.getText())}));
                }
            }
            if (entity != null) {
                arrayList.add(entity);
            }
            i = i2;
        }
    }
}
