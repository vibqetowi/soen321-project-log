package com.ifriend.domain.newChat.chat.systems.distinct;

import com.ifriend.common_entities_engine.EntitiesState;
import com.ifriend.common_entities_engine.Entity;
import com.ifriend.common_entities_engine.System;
import java.util.ArrayList;
import java.util.HashSet;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Reflection;
import org.apache.http.cookie.ClientCookie;
/* compiled from: DistinctSystem.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0019\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"Lcom/ifriend/domain/newChat/chat/systems/distinct/DistinctSystem;", "Lcom/ifriend/common_entities_engine/System;", "Lcom/ifriend/common_entities_engine/EntitiesState;", "()V", "onUpdateState", "state", "(Lcom/ifriend/common_entities_engine/EntitiesState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DistinctSystem extends System<EntitiesState> {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [com.ifriend.domain.newChat.chat.systems.distinct.UniqueComponent] */
    @Override // com.ifriend.common_entities_engine.System
    public Object onUpdateState(EntitiesState entitiesState, Continuation<? super EntitiesState> continuation) {
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : CollectionsKt.reversed(entitiesState.getEntities())) {
            Entity entity = (Entity) obj;
            ?? r4 = (UniqueComponent) entity.get(Reflection.getOrCreateKotlinClass(UniqueComponent.class));
            if (r4 != 0) {
                entity = r4;
            }
            if (hashSet.add(entity)) {
                arrayList.add(0, obj);
            }
        }
        return EntitiesState.copy$default(entitiesState, arrayList, null, 2, null);
    }
}
