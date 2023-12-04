package com.ifriend.domain.newChat.chat.systems.consuming;

import androidx.core.app.NotificationCompat;
import com.ifriend.common_entities_engine.Component;
import com.ifriend.common_entities_engine.ConsumableComponent;
import com.ifriend.common_entities_engine.EntitiesState;
import com.ifriend.common_entities_engine.Event;
import com.ifriend.common_entities_engine.System;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.cookie.ClientCookie;
/* compiled from: ConsumingComponentsSystem.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0019\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\rJ\u0019\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0010R2\u0010\u0004\u001a&\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006 \u0007*\u0012\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\b0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Lcom/ifriend/domain/newChat/chat/systems/consuming/ConsumingComponentsSystem;", "Lcom/ifriend/common_entities_engine/System;", "Lcom/ifriend/common_entities_engine/EntitiesState;", "()V", "componentsToConsume", "", "Lcom/ifriend/common_entities_engine/ConsumableComponent;", "kotlin.jvm.PlatformType", "", "onHandleEvent", "", NotificationCompat.CATEGORY_EVENT, "Lcom/ifriend/common_entities_engine/Event;", "(Lcom/ifriend/common_entities_engine/Event;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onUpdateState", "state", "(Lcom/ifriend/common_entities_engine/EntitiesState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ConsumingComponentsSystem extends System<EntitiesState> {
    private final Set<ConsumableComponent> componentsToConsume = Collections.synchronizedSet(new LinkedHashSet());

    @Override // com.ifriend.common_entities_engine.System
    public Object onUpdateState(EntitiesState entitiesState, Continuation<? super EntitiesState> continuation) {
        Set<ConsumableComponent> componentsToConsume = this.componentsToConsume;
        Intrinsics.checkNotNullExpressionValue(componentsToConsume, "componentsToConsume");
        if (!componentsToConsume.isEmpty()) {
            Set<Component> components = entitiesState.getComponents();
            Set<ConsumableComponent> componentsToConsume2 = this.componentsToConsume;
            Intrinsics.checkNotNullExpressionValue(componentsToConsume2, "componentsToConsume");
            EntitiesState copy$default = EntitiesState.copy$default(entitiesState, null, SetsKt.minus((Set) components, (Iterable) componentsToConsume2), 1, null);
            this.componentsToConsume.clear();
            return copy$default;
        }
        return super.onUpdateState((ConsumingComponentsSystem) entitiesState, (Continuation<? super ConsumingComponentsSystem>) continuation);
    }

    @Override // com.ifriend.common_entities_engine.System
    public Object onHandleEvent(Event event, Continuation<? super Boolean> continuation) {
        if (event instanceof ConsumeComponentEvent) {
            this.componentsToConsume.add(((ConsumeComponentEvent) event).getComponent());
            return Boxing.boxBoolean(true);
        }
        return super.onHandleEvent(event, continuation);
    }
}
