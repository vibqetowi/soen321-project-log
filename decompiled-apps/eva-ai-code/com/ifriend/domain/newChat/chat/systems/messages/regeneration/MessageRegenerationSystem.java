package com.ifriend.domain.newChat.chat.systems.messages.regeneration;

import androidx.core.app.NotificationCompat;
import com.ifriend.common_entities_engine.Component;
import com.ifriend.common_entities_engine.ComponentsHolderKt;
import com.ifriend.common_entities_engine.EntitiesState;
import com.ifriend.common_entities_engine.Entity;
import com.ifriend.common_entities_engine.Event;
import com.ifriend.common_entities_engine.System;
import com.ifriend.domain.newChat.chat.models.ChatMessage;
import com.ifriend.domain.newChat.chat.models.ChatMessageKt;
import com.ifriend.domain.newChat.chat.systems.events.regeneration.MessageRegeneratingEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.apache.http.cookie.ClientCookie;
/* compiled from: MessageRegenerationSystem.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0019\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0010J\u0019\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0013RN\u0010\u0004\u001aB\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\b0\b \u0007* \u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\b0\b\u0018\u00010\t0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Lcom/ifriend/domain/newChat/chat/systems/messages/regeneration/MessageRegenerationSystem;", "Lcom/ifriend/common_entities_engine/System;", "Lcom/ifriend/common_entities_engine/EntitiesState;", "()V", "updates", "", "", "kotlin.jvm.PlatformType", "", "", "handleEntity", "Lcom/ifriend/common_entities_engine/Entity;", "entity", "onHandleEvent", NotificationCompat.CATEGORY_EVENT, "Lcom/ifriend/common_entities_engine/Event;", "(Lcom/ifriend/common_entities_engine/Event;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onUpdateState", "state", "(Lcom/ifriend/common_entities_engine/EntitiesState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MessageRegenerationSystem extends System<EntitiesState> {
    private final Map<String, Boolean> updates = Collections.synchronizedMap(new HashMap());

    @Override // com.ifriend.common_entities_engine.System
    public Object onUpdateState(EntitiesState entitiesState, Continuation<? super EntitiesState> continuation) {
        Map<String, Boolean> updates = this.updates;
        Intrinsics.checkNotNullExpressionValue(updates, "updates");
        if (!updates.isEmpty()) {
            List<Entity> entities = entitiesState.getEntities();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(entities, 10));
            for (Entity entity : entities) {
                arrayList.add(handleEntity(entity));
            }
            return EntitiesState.copy$default(entitiesState, arrayList, null, 2, null);
        }
        return entitiesState;
    }

    private final Entity handleEntity(Entity entity) {
        ChatMessage chatMessage = (ChatMessage) entity.get(Reflection.getOrCreateKotlinClass(ChatMessage.class));
        String id = chatMessage != null ? ChatMessageKt.getId(chatMessage) : null;
        Boolean remove = this.updates.remove(id);
        if (id != null && Intrinsics.areEqual((Object) remove, (Object) true)) {
            return entity.copy(ComponentsHolderKt.add(entity.getComponents(), RegeneratingComponent.INSTANCE));
        }
        if (id == null || !Intrinsics.areEqual((Object) remove, (Object) false)) {
            return entity;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : entity.getComponents()) {
            if (!(((Component) obj) instanceof RegeneratingComponent)) {
                arrayList.add(obj);
            }
        }
        return entity.copy(CollectionsKt.toSet(arrayList));
    }

    @Override // com.ifriend.common_entities_engine.System
    public Object onHandleEvent(Event event, Continuation<? super Boolean> continuation) {
        boolean z;
        if (event instanceof MessageRegeneratingEvent) {
            Map<String, Boolean> updates = this.updates;
            Intrinsics.checkNotNullExpressionValue(updates, "updates");
            MessageRegeneratingEvent messageRegeneratingEvent = (MessageRegeneratingEvent) event;
            updates.put(messageRegeneratingEvent.getMessageId(), Boxing.boxBoolean(messageRegeneratingEvent.isRegenerating()));
            reportUpdateState();
            z = true;
        } else {
            z = false;
        }
        return Boxing.boxBoolean(z);
    }
}
