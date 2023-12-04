package com.ifriend.domain.newChat.chat.systems.messages.live;

import com.ifriend.common_entities_engine.Component;
import com.ifriend.common_entities_engine.ComponentsHolderKt;
import com.ifriend.common_entities_engine.CoroutineScopeSystem;
import com.ifriend.common_entities_engine.EntitiesState;
import com.ifriend.common_entities_engine.Entity;
import com.ifriend.common_entities_engine.State;
import com.ifriend.domain.newChat.chat.models.ChatMessage;
import com.ifriend.domain.newChat.chat.models.ChatMessageKt;
import com.ifriend.domain.newChat.chat.models.MessageContent;
import com.ifriend.domain.newChat.chat.systems.messages.sending.showSending.SendingStatusComponent;
import com.ifriend.domain.newChat.chat.systems.sorting.SortComponent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import org.apache.http.cookie.ClientCookie;
/* compiled from: LiveMessagesSystem.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\fH\u0002J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\fH\u0002J \u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\fH\u0002J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00170\u000e2\u0006\u0010\u001a\u001a\u00020\u0002H\u0002J\u000e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00170\u000eH\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\u0019\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u001fR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R2\u0010\n\u001a&\u0012\f\u0012\n \r*\u0004\u0018\u00010\f0\f \r*\u0012\u0012\f\u0012\n \r*\u0004\u0018\u00010\f0\f\u0018\u00010\u000e0\u000bX\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006 "}, d2 = {"Lcom/ifriend/domain/newChat/chat/systems/messages/live/LiveMessagesSystem;", "Lcom/ifriend/common_entities_engine/CoroutineScopeSystem;", "Lcom/ifriend/common_entities_engine/EntitiesState;", "liveMessagesFlow", "Lcom/ifriend/domain/newChat/chat/systems/messages/live/LiveChatMessagesFlow;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "chatId", "", "(Lcom/ifriend/domain/newChat/chat/systems/messages/live/LiveChatMessagesFlow;Lkotlinx/coroutines/CoroutineScope;Ljava/lang/String;)V", "messagesToAdd", "", "Lcom/ifriend/domain/newChat/chat/models/ChatMessage;", "kotlin.jvm.PlatformType", "", "indexOfRealMessagesFromLive", "", "potentiallyPlaceholderMessage", "isImageMessages", "", "placeholderMessage", "realMessage", "merge", "Lcom/ifriend/common_entities_engine/Entity;", "placeholderEntity", "mergePlaceholderMessagesWithReal", "state", "newMessages", "onStart", "", "onUpdateState", "(Lcom/ifriend/common_entities_engine/EntitiesState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LiveMessagesSystem extends CoroutineScopeSystem<EntitiesState> {
    private final String chatId;
    private final LiveChatMessagesFlow liveMessagesFlow;
    private List<ChatMessage> messagesToAdd;

    @Override // com.ifriend.common_entities_engine.System
    public /* bridge */ /* synthetic */ Object onUpdateState(State state, Continuation continuation) {
        return onUpdateState((EntitiesState) state, (Continuation<? super EntitiesState>) continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveMessagesSystem(LiveChatMessagesFlow liveMessagesFlow, CoroutineScope scope, String chatId) {
        super(scope);
        Intrinsics.checkNotNullParameter(liveMessagesFlow, "liveMessagesFlow");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        this.liveMessagesFlow = liveMessagesFlow;
        this.chatId = chatId;
        this.messagesToAdd = Collections.synchronizedList(new ArrayList());
    }

    @Override // com.ifriend.common_entities_engine.System
    public void onStart() {
        super.onStart();
        FlowKt.launchIn(FlowKt.onEach(this.liveMessagesFlow.newMessages(this.chatId), new LiveMessagesSystem$onStart$1(this, null)), this);
    }

    public Object onUpdateState(EntitiesState entitiesState, Continuation<? super EntitiesState> continuation) {
        EntitiesState copy$default = EntitiesState.copy$default(entitiesState, CollectionsKt.plus((Collection) mergePlaceholderMessagesWithReal(entitiesState), (Iterable) newMessages()), null, 2, null);
        this.messagesToAdd.clear();
        return copy$default;
    }

    private final List<Entity> mergePlaceholderMessagesWithReal(EntitiesState entitiesState) {
        int indexOfRealMessagesFromLive;
        List<Entity> entities = entitiesState.getEntities();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(entities, 10));
        for (Entity entity : entities) {
            ChatMessage chatMessage = (ChatMessage) entity.get(Reflection.getOrCreateKotlinClass(ChatMessage.class));
            if (chatMessage != null && (indexOfRealMessagesFromLive = indexOfRealMessagesFromLive(chatMessage)) != -1) {
                ChatMessage chatMessage2 = this.messagesToAdd.get(indexOfRealMessagesFromLive);
                this.messagesToAdd.remove(indexOfRealMessagesFromLive);
                Intrinsics.checkNotNull(chatMessage2);
                entity = merge(chatMessage2, entity, chatMessage);
            }
            arrayList.add(entity);
        }
        return arrayList;
    }

    private final Entity merge(ChatMessage chatMessage, Entity entity, ChatMessage chatMessage2) {
        ChatMessage copy$default = isImageMessages(chatMessage2, chatMessage) ? ChatMessage.copy$default(chatMessage, null, chatMessage2.getContent(), 1, null) : chatMessage;
        ArrayList arrayList = new ArrayList();
        for (Object obj : entity.getComponents()) {
            if (!(((Component) obj) instanceof SendingStatusComponent)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : CollectionsKt.toSet(arrayList)) {
            if (!(((Component) obj2) instanceof ChatMessage)) {
                arrayList2.add(obj2);
            }
        }
        Set<Component> add = ComponentsHolderKt.add(CollectionsKt.toSet(arrayList2), copy$default);
        SortComponent.RegularMessage regularMessage = new SortComponent.RegularMessage(chatMessage.getInfo().getTimestamp());
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : add) {
            if (!(((Component) obj3) instanceof SortComponent)) {
                arrayList3.add(obj3);
            }
        }
        return entity.copy(ComponentsHolderKt.add(CollectionsKt.toSet(arrayList3), regularMessage));
    }

    private final boolean isImageMessages(ChatMessage chatMessage, ChatMessage chatMessage2) {
        return (chatMessage.getContent() instanceof MessageContent.Image) && (chatMessage2.getContent() instanceof MessageContent.Image);
    }

    private final int indexOfRealMessagesFromLive(ChatMessage chatMessage) {
        List<ChatMessage> messagesToAdd = this.messagesToAdd;
        Intrinsics.checkNotNullExpressionValue(messagesToAdd, "messagesToAdd");
        int i = 0;
        for (ChatMessage chatMessage2 : messagesToAdd) {
            if (Intrinsics.areEqual(chatMessage2.getInfo().getTag().getValue(), chatMessage.getInfo().getTag().getValue())) {
                return i;
            }
            i++;
        }
        return -1;
    }

    private final List<Entity> newMessages() {
        List<ChatMessage> messagesToAdd = this.messagesToAdd;
        Intrinsics.checkNotNullExpressionValue(messagesToAdd, "messagesToAdd");
        List<ChatMessage> list = messagesToAdd;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (ChatMessage chatMessage : list) {
            Intrinsics.checkNotNull(chatMessage);
            arrayList.add(new Entity(SetsKt.plus(ChatMessageKt.baseComponentsSet(chatMessage), LiveMessageComponent.INSTANCE)));
        }
        return arrayList;
    }
}
