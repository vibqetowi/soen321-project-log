package com.ifriend.domain.newChat.chat.systems.messages.buy;

import androidx.core.app.NotificationCompat;
import com.ifriend.common_entities_engine.Component;
import com.ifriend.common_entities_engine.ComponentsHolderKt;
import com.ifriend.common_entities_engine.CoroutineScopeSystem;
import com.ifriend.common_entities_engine.EntitiesState;
import com.ifriend.common_entities_engine.Entity;
import com.ifriend.common_entities_engine.Event;
import com.ifriend.common_entities_engine.State;
import com.ifriend.domain.CoroutineDispatchers;
import com.ifriend.domain.logic.chat.events.ChatPaidMessageUserEvent;
import com.ifriend.domain.newChat.chat.models.ChatMessage;
import com.ifriend.domain.newChat.chat.models.ChatMessageKt;
import com.ifriend.domain.newChat.chat.models.MessageInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.apache.http.cookie.ClientCookie;
/* compiled from: ChatPaidMessageSystem.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0019\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0011J\u0019\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R2\u0010\b\u001a&\u0012\f\u0012\n \u000b*\u0004\u0018\u00010\n0\n \u000b*\u0012\u0012\f\u0012\n \u000b*\u0004\u0018\u00010\n0\n\u0018\u00010\f0\tX\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Lcom/ifriend/domain/newChat/chat/systems/messages/buy/ChatPaidMessageSystem;", "Lcom/ifriend/common_entities_engine/CoroutineScopeSystem;", "Lcom/ifriend/common_entities_engine/EntitiesState;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "dispatchers", "Lcom/ifriend/domain/CoroutineDispatchers;", "(Lkotlinx/coroutines/CoroutineScope;Lcom/ifriend/domain/CoroutineDispatchers;)V", "paidMessageIds", "", "", "kotlin.jvm.PlatformType", "", "onHandleEvent", "", NotificationCompat.CATEGORY_EVENT, "Lcom/ifriend/common_entities_engine/Event;", "(Lcom/ifriend/common_entities_engine/Event;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onUpdateState", "state", "(Lcom/ifriend/common_entities_engine/EntitiesState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatPaidMessageSystem extends CoroutineScopeSystem<EntitiesState> {
    private final CoroutineDispatchers dispatchers;
    private List<String> paidMessageIds;

    @Override // com.ifriend.common_entities_engine.System
    public /* bridge */ /* synthetic */ Object onUpdateState(State state, Continuation continuation) {
        return onUpdateState((EntitiesState) state, (Continuation<? super EntitiesState>) continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatPaidMessageSystem(CoroutineScope scope, CoroutineDispatchers dispatchers) {
        super(scope);
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        this.dispatchers = dispatchers;
        this.paidMessageIds = Collections.synchronizedList(new ArrayList());
    }

    @Override // com.ifriend.common_entities_engine.System
    public Object onHandleEvent(Event event, Continuation<? super Boolean> continuation) {
        if (event instanceof ChatPaidMessageUserEvent) {
            BuildersKt__Builders_commonKt.launch$default(this, this.dispatchers.getIO(), null, new ChatPaidMessageSystem$onHandleEvent$2(this, event, null), 2, null);
            return Boxing.boxBoolean(true);
        }
        return super.onHandleEvent(event, continuation);
    }

    public Object onUpdateState(EntitiesState entitiesState, Continuation<? super EntitiesState> continuation) {
        MessageInfo copy;
        boolean z;
        List<String> paidMessageIds = this.paidMessageIds;
        Intrinsics.checkNotNullExpressionValue(paidMessageIds, "paidMessageIds");
        boolean z2 = true;
        if (!paidMessageIds.isEmpty()) {
            List<Entity> entities = entitiesState.getEntities();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(entities, 10));
            for (Entity entity : entities) {
                Component component = entity.get(Reflection.getOrCreateKotlinClass(ChatMessage.class));
                if (component != null) {
                    ChatMessage chatMessage = (ChatMessage) component;
                    if (this.paidMessageIds.contains(ChatMessageKt.getId(chatMessage))) {
                        MessageInfo info = chatMessage.getInfo();
                        MessageInfo.PaymentInfo paymentInfo = chatMessage.getInfo().getPaymentInfo();
                        copy = info.copy((r26 & 1) != 0 ? info.ids : null, (r26 & 2) != 0 ? info.tag : null, (r26 & 4) != 0 ? info.timestamp : 0L, (r26 & 8) != 0 ? info.isFromUser : false, (r26 & 16) != 0 ? info.read : false, (r26 & 32) != 0 ? info.isSexting : false, (r26 & 64) != 0 ? info.topic : null, (r26 & 128) != 0 ? info.paymentInfo : paymentInfo != null ? MessageInfo.PaymentInfo.copy$default(paymentInfo, Boxing.boxBoolean(z2), 0, 2, null) : null, (r26 & 256) != 0 ? info.messageAccess : null, (r26 & 512) != 0 ? info.meta : null, (r26 & 1024) != 0 ? info.regenerate : null);
                        ChatMessage copy$default = ChatMessage.copy$default(chatMessage, copy, null, 2, null);
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj : entity.getComponents()) {
                            if (!(((Component) obj) instanceof ChatMessage)) {
                                arrayList2.add(obj);
                            }
                        }
                        z = true;
                        entity = entity.copy(ComponentsHolderKt.add(CollectionsKt.toSet(arrayList2), copy$default));
                        arrayList.add(entity);
                        z2 = z;
                    }
                }
                z = z2;
                arrayList.add(entity);
                z2 = z;
            }
            this.paidMessageIds.clear();
            return EntitiesState.copy$default(entitiesState, arrayList, null, 2, null);
        }
        return entitiesState;
    }
}
