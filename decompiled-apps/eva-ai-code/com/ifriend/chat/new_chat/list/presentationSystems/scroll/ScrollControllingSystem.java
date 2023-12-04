package com.ifriend.chat.new_chat.list.presentationSystems.scroll;

import com.ifriend.common_entities_engine.Component;
import com.ifriend.common_entities_engine.EntitiesState;
import com.ifriend.common_entities_engine.Entity;
import com.ifriend.common_entities_engine.System;
import com.ifriend.domain.newChat.chat.systems.messages.live.LiveMessageComponent;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Reflection;
/* compiled from: ScrollControllingSystem.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, d2 = {"Lcom/ifriend/chat/new_chat/list/presentationSystems/scroll/ScrollControllingSystem;", "Lcom/ifriend/common_entities_engine/System;", "Lcom/ifriend/common_entities_engine/EntitiesState;", "()V", "oldCountOfNewMessages", "", "onUpdateState", "state", "(Lcom/ifriend/common_entities_engine/EntitiesState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "new_chat_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ScrollControllingSystem extends System<EntitiesState> {
    public static final int $stable = 8;
    private int oldCountOfNewMessages;

    @Override // com.ifriend.common_entities_engine.System
    public Object onUpdateState(EntitiesState entitiesState, Continuation<? super EntitiesState> continuation) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = entitiesState.getEntities().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Entity entity = (Entity) it.next();
            Component component = entity.get(Reflection.getOrCreateKotlinClass(LiveMessageComponent.class));
            Pair pair = component != null ? TuplesKt.to(entity, component) : null;
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        int size = arrayList.size();
        if (size > this.oldCountOfNewMessages) {
            this.oldCountOfNewMessages = size;
            return EntitiesState.copy$default(entitiesState, null, SetsKt.plus(entitiesState.getComponents(), ScrollBottomComponent.INSTANCE), 1, null);
        }
        return super.onUpdateState((ScrollControllingSystem) entitiesState, (Continuation<? super ScrollControllingSystem>) continuation);
    }
}
