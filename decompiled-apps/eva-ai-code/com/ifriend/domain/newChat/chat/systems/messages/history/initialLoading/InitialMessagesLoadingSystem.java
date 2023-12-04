package com.ifriend.domain.newChat.chat.systems.messages.history.initialLoading;

import com.ifriend.common_entities_engine.EntitiesState;
import com.ifriend.common_entities_engine.Entity;
import com.ifriend.common_entities_engine.State;
import com.ifriend.domain.newChat.chat.models.ChatMessage;
import com.ifriend.domain.newChat.chat.models.ChatMessageKt;
import com.ifriend.domain.newChat.chat.systems.messages.history.BaseLoadingHistoryMessagesSystem;
import com.ifriend.domain.newChat.chat.systems.messages.sending.send.ChatMessagesRepository;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.apache.http.cookie.ClientCookie;
/* compiled from: InitialMessagesLoadingSystem.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\fJ\u0019\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0010J\f\u0010\u0011\u001a\u00020\u0012*\u00020\u0013H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Lcom/ifriend/domain/newChat/chat/systems/messages/history/initialLoading/InitialMessagesLoadingSystem;", "Lcom/ifriend/domain/newChat/chat/systems/messages/history/BaseLoadingHistoryMessagesSystem;", "chatMessagesRepository", "Lcom/ifriend/domain/newChat/chat/systems/messages/sending/send/ChatMessagesRepository;", "chatId", "", "messagesToLoad", "", "(Lcom/ifriend/domain/newChat/chat/systems/messages/sending/send/ChatMessagesRepository;Ljava/lang/String;I)V", "loadFirstMessages", "", "Lcom/ifriend/common_entities_engine/Entity;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onUpdateState", "Lcom/ifriend/common_entities_engine/EntitiesState;", "state", "(Lcom/ifriend/common_entities_engine/EntitiesState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isInitialDataLoaded", "", "Lcom/ifriend/common_entities_engine/State;", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class InitialMessagesLoadingSystem extends BaseLoadingHistoryMessagesSystem {
    private final String chatId;
    private final ChatMessagesRepository chatMessagesRepository;

    public /* synthetic */ InitialMessagesLoadingSystem(ChatMessagesRepository chatMessagesRepository, String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(chatMessagesRepository, str, (i2 & 4) != 0 ? 30 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitialMessagesLoadingSystem(ChatMessagesRepository chatMessagesRepository, String chatId, int i) {
        super(i);
        Intrinsics.checkNotNullParameter(chatMessagesRepository, "chatMessagesRepository");
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        this.chatMessagesRepository = chatMessagesRepository;
        this.chatId = chatId;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0047  */
    @Override // com.ifriend.common_entities_engine.System
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object onUpdateState(EntitiesState entitiesState, Continuation<? super EntitiesState> continuation) {
        InitialMessagesLoadingSystem$onUpdateState$1 initialMessagesLoadingSystem$onUpdateState$1;
        int i;
        InitialMessagesLoadingSystem initialMessagesLoadingSystem;
        EntitiesState entitiesState2;
        Object obj;
        EntitiesState entitiesState3;
        if (continuation instanceof InitialMessagesLoadingSystem$onUpdateState$1) {
            initialMessagesLoadingSystem$onUpdateState$1 = (InitialMessagesLoadingSystem$onUpdateState$1) continuation;
            if ((initialMessagesLoadingSystem$onUpdateState$1.label & Integer.MIN_VALUE) != 0) {
                initialMessagesLoadingSystem$onUpdateState$1.label -= Integer.MIN_VALUE;
                Object obj2 = initialMessagesLoadingSystem$onUpdateState$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = initialMessagesLoadingSystem$onUpdateState$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj2);
                    if (isInitialDataLoaded(entitiesState)) {
                        return entitiesState;
                    }
                    initialMessagesLoadingSystem$onUpdateState$1.L$0 = entitiesState;
                    initialMessagesLoadingSystem$onUpdateState$1.L$1 = entitiesState;
                    initialMessagesLoadingSystem$onUpdateState$1.L$2 = this;
                    initialMessagesLoadingSystem$onUpdateState$1.L$3 = entitiesState;
                    initialMessagesLoadingSystem$onUpdateState$1.label = 1;
                    Object loadFirstMessages = loadFirstMessages(initialMessagesLoadingSystem$onUpdateState$1);
                    if (loadFirstMessages == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    initialMessagesLoadingSystem = this;
                    entitiesState2 = entitiesState;
                    obj = loadFirstMessages;
                    entitiesState3 = entitiesState2;
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    entitiesState2 = (EntitiesState) initialMessagesLoadingSystem$onUpdateState$1.L$0;
                    ResultKt.throwOnFailure(obj2);
                    entitiesState3 = (EntitiesState) initialMessagesLoadingSystem$onUpdateState$1.L$3;
                    entitiesState = (EntitiesState) initialMessagesLoadingSystem$onUpdateState$1.L$1;
                    initialMessagesLoadingSystem = (InitialMessagesLoadingSystem) initialMessagesLoadingSystem$onUpdateState$1.L$2;
                    obj = obj2;
                }
                return entitiesState.copy(initialMessagesLoadingSystem.updateEntities(entitiesState3, (List) obj), SetsKt.plus(entitiesState2.getComponents(), InitialMessagesLoadedComponent.INSTANCE));
            }
        }
        initialMessagesLoadingSystem$onUpdateState$1 = new InitialMessagesLoadingSystem$onUpdateState$1(this, continuation);
        Object obj22 = initialMessagesLoadingSystem$onUpdateState$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = initialMessagesLoadingSystem$onUpdateState$1.label;
        if (i != 0) {
        }
        return entitiesState.copy(initialMessagesLoadingSystem.updateEntities(entitiesState3, (List) obj), SetsKt.plus(entitiesState2.getComponents(), InitialMessagesLoadedComponent.INSTANCE));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0060 A[LOOP:0: B:18:0x005a->B:20:0x0060, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object loadFirstMessages(Continuation<? super List<Entity>> continuation) {
        InitialMessagesLoadingSystem$loadFirstMessages$1 initialMessagesLoadingSystem$loadFirstMessages$1;
        int i;
        if (continuation instanceof InitialMessagesLoadingSystem$loadFirstMessages$1) {
            initialMessagesLoadingSystem$loadFirstMessages$1 = (InitialMessagesLoadingSystem$loadFirstMessages$1) continuation;
            if ((initialMessagesLoadingSystem$loadFirstMessages$1.label & Integer.MIN_VALUE) != 0) {
                initialMessagesLoadingSystem$loadFirstMessages$1.label -= Integer.MIN_VALUE;
                Object obj = initialMessagesLoadingSystem$loadFirstMessages$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = initialMessagesLoadingSystem$loadFirstMessages$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    ChatMessagesRepository chatMessagesRepository = this.chatMessagesRepository;
                    int messagesToLoad = getMessagesToLoad();
                    String str = this.chatId;
                    initialMessagesLoadingSystem$loadFirstMessages$1.label = 1;
                    obj = chatMessagesRepository.getMessages(0, messagesToLoad, str, initialMessagesLoadingSystem$loadFirstMessages$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ResultKt.throwOnFailure(obj);
                }
                Iterable<ChatMessage> iterable = (Iterable) obj;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
                for (ChatMessage chatMessage : iterable) {
                    arrayList.add(ChatMessageKt.toEntity(chatMessage));
                }
                return arrayList;
            }
        }
        initialMessagesLoadingSystem$loadFirstMessages$1 = new InitialMessagesLoadingSystem$loadFirstMessages$1(this, continuation);
        Object obj2 = initialMessagesLoadingSystem$loadFirstMessages$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = initialMessagesLoadingSystem$loadFirstMessages$1.label;
        if (i != 0) {
        }
        Iterable<ChatMessage> iterable2 = (Iterable) obj2;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable2, 10));
        while (r6.hasNext()) {
        }
        return arrayList2;
    }

    private final boolean isInitialDataLoaded(State state) {
        return state.get(Reflection.getOrCreateKotlinClass(InitialMessagesLoadedComponent.class)) != null;
    }
}
