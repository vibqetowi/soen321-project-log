package com.ifriend.domain.newChat.chat.systems.messages.history;

import com.ifriend.common_entities_engine.Component;
import com.ifriend.common_entities_engine.EntitiesState;
import com.ifriend.common_entities_engine.Entity;
import com.ifriend.common_entities_engine.System;
import com.ifriend.domain.newChat.chat.systems.messages.history.loadMore.LoadMoreComponent;
import com.ifriend.domain.newChat.chat.systems.messages.history.loadMore.LoadMoreSystemKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.apache.http.cookie.ClientCookie;
/* compiled from: BaseLoadingHistoryMessagesSystem.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J \u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t*\u00020\u00022\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0004R\u0014\u0010\u0003\u001a\u00020\u0004X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/ifriend/domain/newChat/chat/systems/messages/history/BaseLoadingHistoryMessagesSystem;", "Lcom/ifriend/common_entities_engine/System;", "Lcom/ifriend/common_entities_engine/EntitiesState;", "messagesToLoad", "", "(I)V", "getMessagesToLoad", "()I", "updateEntities", "", "Lcom/ifriend/common_entities_engine/Entity;", "loadedMessages", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class BaseLoadingHistoryMessagesSystem extends System<EntitiesState> {
    private final int messagesToLoad;

    /* JADX INFO: Access modifiers changed from: protected */
    public final int getMessagesToLoad() {
        return this.messagesToLoad;
    }

    public BaseLoadingHistoryMessagesSystem(int i) {
        this.messagesToLoad = i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final List<Entity> updateEntities(EntitiesState entitiesState, List<Entity> loadedMessages) {
        boolean z;
        boolean z2;
        Intrinsics.checkNotNullParameter(entitiesState, "<this>");
        Intrinsics.checkNotNullParameter(loadedMessages, "loadedMessages");
        boolean z3 = loadedMessages.size() == this.messagesToLoad;
        boolean z4 = entitiesState.get(Reflection.getOrCreateKotlinClass(LoadMoreComponent.class)) == null;
        List plus = CollectionsKt.plus((Collection) entitiesState.getEntities(), (Iterable) loadedMessages);
        if (z3 && z4) {
            return CollectionsKt.plus((Collection) CollectionsKt.listOf(LoadMoreSystemKt.createLoadMoreEntity()), (Iterable) plus);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : plus) {
            Entity entity = (Entity) obj;
            Set<Component> components = entity.getComponents();
            if (!(components instanceof Collection) || !components.isEmpty()) {
                for (Component component : components) {
                    if (entity.get(Reflection.getOrCreateKotlinClass(LoadMoreComponent.class)) != null) {
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
            z2 = false;
            if (!z2) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
