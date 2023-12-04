package com.ifriend.domain.newChat.chat.systems.events.processing;

import com.ifriend.common_entities_engine.Entity;
import com.ifriend.domain.newChat.chat.systems.distinct.UniqueComponent;
import com.ifriend.domain.newChat.chat.systems.sorting.SortComponent;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import org.apache.http.cookie.ClientCookie;
/* compiled from: BotProcessingSystem.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002¨\u0006\u0004"}, d2 = {"createProcessingEntity", "Lcom/ifriend/common_entities_engine/Entity;", "sortingComponent", "Lcom/ifriend/domain/newChat/chat/systems/sorting/SortComponent;", ClientCookie.DOMAIN_ATTR}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BotProcessingSystemKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Entity createProcessingEntity(SortComponent sortComponent) {
        return new Entity(SetsKt.mutableSetOf(ProcessingComponent.INSTANCE, new UniqueComponent("ProcessingComponent"), sortComponent));
    }
}
