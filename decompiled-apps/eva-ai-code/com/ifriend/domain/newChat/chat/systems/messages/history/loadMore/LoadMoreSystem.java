package com.ifriend.domain.newChat.chat.systems.messages.history.loadMore;

import androidx.core.app.NotificationCompat;
import com.ifriend.common_entities_engine.Component;
import com.ifriend.common_entities_engine.EntitiesState;
import com.ifriend.common_entities_engine.Entity;
import com.ifriend.common_entities_engine.Event;
import com.ifriend.domain.newChat.chat.models.ChatMessage;
import com.ifriend.domain.newChat.chat.models.ChatMessageKt;
import com.ifriend.domain.newChat.chat.systems.messages.history.BaseLoadingHistoryMessagesSystem;
import com.ifriend.domain.newChat.chat.systems.messages.sending.send.ChatMessagesRepository;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.apache.http.cookie.ClientCookie;
/* compiled from: LoadMoreSystem.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0011\u0010\u000e\u001a\u00020\u000fH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0010J\u001f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\r2\u0006\u0010\u0006\u001a\u00020\u0007H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0012J\u0019\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0017J\u0019\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0019H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u001bR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R2\u0010\t\u001a&\u0012\f\u0012\n \f*\u0004\u0018\u00010\u000b0\u000b \f*\u0012\u0012\f\u0012\n \f*\u0004\u0018\u00010\u000b0\u000b\u0018\u00010\r0\nX\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"Lcom/ifriend/domain/newChat/chat/systems/messages/history/loadMore/LoadMoreSystem;", "Lcom/ifriend/domain/newChat/chat/systems/messages/history/BaseLoadingHistoryMessagesSystem;", "chatMessagesRepository", "Lcom/ifriend/domain/newChat/chat/systems/messages/sending/send/ChatMessagesRepository;", "messagesToLoad", "", "chatId", "", "(Lcom/ifriend/domain/newChat/chat/systems/messages/sending/send/ChatMessagesRepository;ILjava/lang/String;)V", "entitiesToAdd", "", "Lcom/ifriend/common_entities_engine/Entity;", "kotlin.jvm.PlatformType", "", "handleLoadMore", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadNewMessages", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onHandleEvent", "", NotificationCompat.CATEGORY_EVENT, "Lcom/ifriend/common_entities_engine/Event;", "(Lcom/ifriend/common_entities_engine/Event;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onUpdateState", "Lcom/ifriend/common_entities_engine/EntitiesState;", "state", "(Lcom/ifriend/common_entities_engine/EntitiesState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LoadMoreSystem extends BaseLoadingHistoryMessagesSystem {
    private final String chatId;
    private final ChatMessagesRepository chatMessagesRepository;
    private List<Entity> entitiesToAdd;

    public /* synthetic */ LoadMoreSystem(ChatMessagesRepository chatMessagesRepository, int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(chatMessagesRepository, (i2 & 2) != 0 ? 30 : i, str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoadMoreSystem(ChatMessagesRepository chatMessagesRepository, int i, String chatId) {
        super(i);
        Intrinsics.checkNotNullParameter(chatMessagesRepository, "chatMessagesRepository");
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        this.chatMessagesRepository = chatMessagesRepository;
        this.chatId = chatId;
        this.entitiesToAdd = Collections.synchronizedList(new ArrayList());
    }

    @Override // com.ifriend.common_entities_engine.System
    public Object onUpdateState(EntitiesState entitiesState, Continuation<? super EntitiesState> continuation) {
        List<Entity> entitiesToAdd = this.entitiesToAdd;
        Intrinsics.checkNotNullExpressionValue(entitiesToAdd, "entitiesToAdd");
        if (!entitiesToAdd.isEmpty()) {
            List<Entity> entitiesToAdd2 = this.entitiesToAdd;
            Intrinsics.checkNotNullExpressionValue(entitiesToAdd2, "entitiesToAdd");
            EntitiesState copy$default = EntitiesState.copy$default(entitiesState, updateEntities(entitiesState, entitiesToAdd2), null, 2, null);
            this.entitiesToAdd.clear();
            return copy$default;
        }
        return entitiesState;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    @Override // com.ifriend.common_entities_engine.System
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object onHandleEvent(Event event, Continuation<? super Boolean> continuation) {
        LoadMoreSystem$onHandleEvent$1 loadMoreSystem$onHandleEvent$1;
        int i;
        if (continuation instanceof LoadMoreSystem$onHandleEvent$1) {
            loadMoreSystem$onHandleEvent$1 = (LoadMoreSystem$onHandleEvent$1) continuation;
            if ((loadMoreSystem$onHandleEvent$1.label & Integer.MIN_VALUE) != 0) {
                loadMoreSystem$onHandleEvent$1.label -= Integer.MIN_VALUE;
                Object obj = loadMoreSystem$onHandleEvent$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = loadMoreSystem$onHandleEvent$1.label;
                if (i == 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                        return Boxing.boxBoolean(true);
                    } else if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ResultKt.throwOnFailure(obj);
                    }
                }
                ResultKt.throwOnFailure(obj);
                if (event instanceof LoadMoreChatEvent) {
                    loadMoreSystem$onHandleEvent$1.label = 1;
                    if (handleLoadMore(loadMoreSystem$onHandleEvent$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Boxing.boxBoolean(true);
                }
                loadMoreSystem$onHandleEvent$1.label = 2;
                obj = super.onHandleEvent(event, loadMoreSystem$onHandleEvent$1);
                return obj == coroutine_suspended ? coroutine_suspended : obj;
            }
        }
        loadMoreSystem$onHandleEvent$1 = new LoadMoreSystem$onHandleEvent$1(this, continuation);
        Object obj2 = loadMoreSystem$onHandleEvent$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = loadMoreSystem$onHandleEvent$1.label;
        if (i == 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object handleLoadMore(Continuation<? super Unit> continuation) {
        LoadMoreSystem$handleLoadMore$1 loadMoreSystem$handleLoadMore$1;
        int i;
        List<Entity> list;
        LoadMoreSystem loadMoreSystem;
        if (continuation instanceof LoadMoreSystem$handleLoadMore$1) {
            loadMoreSystem$handleLoadMore$1 = (LoadMoreSystem$handleLoadMore$1) continuation;
            if ((loadMoreSystem$handleLoadMore$1.label & Integer.MIN_VALUE) != 0) {
                loadMoreSystem$handleLoadMore$1.label -= Integer.MIN_VALUE;
                Object obj = loadMoreSystem$handleLoadMore$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = loadMoreSystem$handleLoadMore$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    this.entitiesToAdd.clear();
                    List<Entity> list2 = this.entitiesToAdd;
                    String str = this.chatId;
                    loadMoreSystem$handleLoadMore$1.L$0 = this;
                    loadMoreSystem$handleLoadMore$1.L$1 = list2;
                    loadMoreSystem$handleLoadMore$1.label = 1;
                    Object loadNewMessages = loadNewMessages(str, loadMoreSystem$handleLoadMore$1);
                    if (loadNewMessages == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    list = list2;
                    obj = loadNewMessages;
                    loadMoreSystem = this;
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    list = (List) loadMoreSystem$handleLoadMore$1.L$1;
                    loadMoreSystem = (LoadMoreSystem) loadMoreSystem$handleLoadMore$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                list.addAll((Collection) obj);
                loadMoreSystem.reportUpdateState();
                return Unit.INSTANCE;
            }
        }
        loadMoreSystem$handleLoadMore$1 = new LoadMoreSystem$handleLoadMore$1(this, continuation);
        Object obj2 = loadMoreSystem$handleLoadMore$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = loadMoreSystem$handleLoadMore$1.label;
        if (i != 0) {
        }
        list.addAll((Collection) obj2);
        loadMoreSystem.reportUpdateState();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a5 A[LOOP:0: B:31:0x009f->B:33:0x00a5, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object loadNewMessages(String str, Continuation<? super List<Entity>> continuation) {
        LoadMoreSystem$loadNewMessages$1 loadMoreSystem$loadNewMessages$1;
        int i;
        if (continuation instanceof LoadMoreSystem$loadNewMessages$1) {
            loadMoreSystem$loadNewMessages$1 = (LoadMoreSystem$loadNewMessages$1) continuation;
            if ((loadMoreSystem$loadNewMessages$1.label & Integer.MIN_VALUE) != 0) {
                loadMoreSystem$loadNewMessages$1.label -= Integer.MIN_VALUE;
                Object obj = loadMoreSystem$loadNewMessages$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = loadMoreSystem$loadNewMessages$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    EntitiesState currentState = currentState();
                    if (currentState == null) {
                        return CollectionsKt.emptyList();
                    }
                    ArrayList arrayList = new ArrayList();
                    for (Entity entity : currentState.getEntities()) {
                        Component component = entity.get(Reflection.getOrCreateKotlinClass(ChatMessage.class));
                        Pair pair = component == null ? null : TuplesKt.to(entity, component);
                        if (pair != null) {
                            arrayList.add(pair);
                        }
                    }
                    ChatMessagesRepository chatMessagesRepository = this.chatMessagesRepository;
                    int size = arrayList.size();
                    int messagesToLoad = getMessagesToLoad();
                    loadMoreSystem$loadNewMessages$1.label = 1;
                    obj = chatMessagesRepository.getMessages(size, messagesToLoad, str, loadMoreSystem$loadNewMessages$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ResultKt.throwOnFailure(obj);
                }
                Iterable<ChatMessage> iterable = (Iterable) obj;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
                for (ChatMessage chatMessage : iterable) {
                    arrayList2.add(ChatMessageKt.toEntity(chatMessage));
                }
                return arrayList2;
            }
        }
        loadMoreSystem$loadNewMessages$1 = new LoadMoreSystem$loadNewMessages$1(this, continuation);
        Object obj2 = loadMoreSystem$loadNewMessages$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = loadMoreSystem$loadNewMessages$1.label;
        if (i != 0) {
        }
        Iterable<ChatMessage> iterable2 = (Iterable) obj2;
        ArrayList arrayList22 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable2, 10));
        while (r8.hasNext()) {
        }
        return arrayList22;
    }
}
