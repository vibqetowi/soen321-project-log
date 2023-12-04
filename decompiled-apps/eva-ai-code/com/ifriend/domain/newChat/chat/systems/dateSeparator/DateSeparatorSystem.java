package com.ifriend.domain.newChat.chat.systems.dateSeparator;

import com.ifriend.common_entities_engine.Component;
import com.ifriend.common_entities_engine.EntitiesState;
import com.ifriend.common_entities_engine.Entity;
import com.ifriend.common_entities_engine.System;
import com.ifriend.common_utils.extensions.TimestampKt;
import com.ifriend.domain.newChat.chat.models.ChatMessage;
import com.ifriend.domain.newChat.chat.systems.sorting.SortComponent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Reflection;
import org.apache.http.cookie.ClientCookie;
/* compiled from: DateSeparatorSystem.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0003J\u0019\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b*\b\u0012\u0004\u0012\u00020\t0\bH\u0002\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, d2 = {"Lcom/ifriend/domain/newChat/chat/systems/dateSeparator/DateSeparatorSystem;", "Lcom/ifriend/common_entities_engine/System;", "Lcom/ifriend/common_entities_engine/EntitiesState;", "()V", "onUpdateState", "state", "(Lcom/ifriend/common_entities_engine/EntitiesState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addDates", "", "Lcom/ifriend/common_entities_engine/Entity;", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DateSeparatorSystem extends System<EntitiesState> {
    @Override // com.ifriend.common_entities_engine.System
    public Object onUpdateState(EntitiesState entitiesState, Continuation<? super EntitiesState> continuation) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        for (Object obj : entitiesState.getEntities()) {
            Entity entity = (Entity) obj;
            Set<Component> components = entity.getComponents();
            boolean z2 = false;
            if (!(components instanceof Collection) || !components.isEmpty()) {
                Iterator<T> it = components.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Component component = (Component) it.next();
                    if (entity.get(Reflection.getOrCreateKotlinClass(DateSeparatorComponent.class)) != null) {
                        z = true;
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                    if (z) {
                        z2 = true;
                        break;
                    }
                }
            }
            if (!z2) {
                arrayList.add(obj);
            }
        }
        return EntitiesState.copy$default(entitiesState, addDates(CollectionsKt.toMutableList((Collection) arrayList)), null, 2, null);
    }

    private final List<Entity> addDates(List<Entity> list) {
        Entity createDateSeparatorEntity;
        long j = 0;
        int i = 0;
        while (i < list.size()) {
            ChatMessage chatMessage = (ChatMessage) list.get(i).get(Reflection.getOrCreateKotlinClass(ChatMessage.class));
            if (chatMessage == null) {
                i++;
            } else {
                long startOfADay = TimestampKt.toStartOfADay(chatMessage.getInfo().getTimestamp());
                SortComponent.RegularMessage regularMessage = new SortComponent.RegularMessage(startOfADay);
                if (startOfADay != j) {
                    createDateSeparatorEntity = DateSeparatorSystemKt.createDateSeparatorEntity(startOfADay, regularMessage);
                    list.add(i, createDateSeparatorEntity);
                }
                i++;
                j = startOfADay;
            }
        }
        return list;
    }
}
