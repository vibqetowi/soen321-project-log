package com.ifriend.domain.newChat.chat.systems.sorting;

import com.ifriend.common_entities_engine.EntitiesState;
import com.ifriend.common_entities_engine.Entity;
import com.ifriend.common_entities_engine.System;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Reflection;
import org.apache.http.cookie.ClientCookie;
/* compiled from: SortingSystem.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0019\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"Lcom/ifriend/domain/newChat/chat/systems/sorting/SortingSystem;", "Lcom/ifriend/common_entities_engine/System;", "Lcom/ifriend/common_entities_engine/EntitiesState;", "()V", "onUpdateState", "state", "(Lcom/ifriend/common_entities_engine/EntitiesState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SortingSystem extends System<EntitiesState> {
    @Override // com.ifriend.common_entities_engine.System
    public Object onUpdateState(EntitiesState entitiesState, Continuation<? super EntitiesState> continuation) {
        return EntitiesState.copy$default(entitiesState, CollectionsKt.sortedWith(entitiesState.getEntities(), new Comparator() { // from class: com.ifriend.domain.newChat.chat.systems.sorting.SortingSystem$onUpdateState$$inlined$sortedBy$1
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues((SortComponent) ((Entity) t).get(Reflection.getOrCreateKotlinClass(SortComponent.class)), (SortComponent) ((Entity) t2).get(Reflection.getOrCreateKotlinClass(SortComponent.class)));
            }
        }), null, 2, null);
    }
}
