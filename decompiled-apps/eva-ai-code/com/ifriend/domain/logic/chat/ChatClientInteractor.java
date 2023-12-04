package com.ifriend.domain.logic.chat;

import androidx.core.app.NotificationCompat;
import com.ifriend.common_entities_engine.EntitiesState;
import com.ifriend.common_entities_engine.Event;
import com.ifriend.domain.data.chat.ChatClientsRepository;
import com.ifriend.domain.newChat.chat.ChatClient;
import com.ifriend.domain.newChat.chat.ChatClientKt;
import com.ifriend.domain.newChat.chat.models.ChatMessage;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import org.apache.http.cookie.ClientCookie;
/* compiled from: ChatClientInteractor.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J#\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\nJ\u0019\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\bH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\rJ\u001f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0007\u001a\u00020\bH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\rJ!\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0014H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0015J\u0019\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0017J'\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00140\u001aH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u001bJ\u0019\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\bH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\rJ\u0019\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\bH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, d2 = {"Lcom/ifriend/domain/logic/chat/ChatClientInteractor;", "", "chatsRepository", "Lcom/ifriend/domain/data/chat/ChatClientsRepository;", "(Lcom/ifriend/domain/data/chat/ChatClientsRepository;)V", "getChatMessage", "Lcom/ifriend/domain/newChat/chat/models/ChatMessage;", "chatId", "", "messageId", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getChatsClient", "Lcom/ifriend/domain/newChat/chat/ChatClient;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getState", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/ifriend/common_entities_engine/EntitiesState;", "handleEvent", "", NotificationCompat.CATEGORY_EVENT, "Lcom/ifriend/common_entities_engine/Event;", "(Ljava/lang/String;Lcom/ifriend/common_entities_engine/Event;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleEventForAll", "(Lcom/ifriend/common_entities_engine/Event;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleEvents", "events", "", "(Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "launch", "refresh", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatClientInteractor {
    private final ChatClientsRepository chatsRepository;

    @Inject
    public ChatClientInteractor(ChatClientsRepository chatsRepository) {
        Intrinsics.checkNotNullParameter(chatsRepository, "chatsRepository");
        this.chatsRepository = chatsRepository;
    }

    public final Object getChatsClient(String str, Continuation<? super ChatClient> continuation) {
        return this.chatsRepository.getChatClient(str, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getState(String str, Continuation<? super StateFlow<EntitiesState>> continuation) {
        ChatClientInteractor$getState$1 chatClientInteractor$getState$1;
        int i;
        if (continuation instanceof ChatClientInteractor$getState$1) {
            chatClientInteractor$getState$1 = (ChatClientInteractor$getState$1) continuation;
            if ((chatClientInteractor$getState$1.label & Integer.MIN_VALUE) != 0) {
                chatClientInteractor$getState$1.label -= Integer.MIN_VALUE;
                Object obj = chatClientInteractor$getState$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = chatClientInteractor$getState$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    chatClientInteractor$getState$1.label = 1;
                    obj = getChatsClient(str, chatClientInteractor$getState$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ResultKt.throwOnFailure(obj);
                }
                return ((ChatClient) obj).getState();
            }
        }
        chatClientInteractor$getState$1 = new ChatClientInteractor$getState$1(this, continuation);
        Object obj2 = chatClientInteractor$getState$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = chatClientInteractor$getState$1.label;
        if (i != 0) {
        }
        return ((ChatClient) obj2).getState();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0059 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object handleEvent(String str, Event event, Continuation<? super Unit> continuation) {
        ChatClientInteractor$handleEvent$1 chatClientInteractor$handleEvent$1;
        Object obj;
        Object coroutine_suspended;
        int i;
        if (continuation instanceof ChatClientInteractor$handleEvent$1) {
            chatClientInteractor$handleEvent$1 = (ChatClientInteractor$handleEvent$1) continuation;
            if ((chatClientInteractor$handleEvent$1.label & Integer.MIN_VALUE) != 0) {
                chatClientInteractor$handleEvent$1.label -= Integer.MIN_VALUE;
                obj = chatClientInteractor$handleEvent$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = chatClientInteractor$handleEvent$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    chatClientInteractor$handleEvent$1.L$0 = event;
                    chatClientInteractor$handleEvent$1.label = 1;
                    obj = getChatsClient(str, chatClientInteractor$handleEvent$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i != 1) {
                    if (i == 2) {
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    event = (Event) chatClientInteractor$handleEvent$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                chatClientInteractor$handleEvent$1.L$0 = null;
                chatClientInteractor$handleEvent$1.label = 2;
                if (((ChatClient) obj).handle(event, chatClientInteractor$handleEvent$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
        }
        chatClientInteractor$handleEvent$1 = new ChatClientInteractor$handleEvent$1(this, continuation);
        obj = chatClientInteractor$handleEvent$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = chatClientInteractor$handleEvent$1.label;
        if (i != 0) {
        }
        chatClientInteractor$handleEvent$1.L$0 = null;
        chatClientInteractor$handleEvent$1.label = 2;
        if (((ChatClient) obj).handle(event, chatClientInteractor$handleEvent$1) == coroutine_suspended) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object handleEvents(String str, List<? extends Event> list, Continuation<? super Unit> continuation) {
        ChatClientInteractor$handleEvents$1 chatClientInteractor$handleEvents$1;
        int i;
        List<? extends Event> list2;
        Iterator it;
        ChatClient chatClient;
        if (continuation instanceof ChatClientInteractor$handleEvents$1) {
            chatClientInteractor$handleEvents$1 = (ChatClientInteractor$handleEvents$1) continuation;
            if ((chatClientInteractor$handleEvents$1.label & Integer.MIN_VALUE) != 0) {
                chatClientInteractor$handleEvents$1.label -= Integer.MIN_VALUE;
                Object obj = chatClientInteractor$handleEvents$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = chatClientInteractor$handleEvents$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    chatClientInteractor$handleEvents$1.L$0 = list;
                    chatClientInteractor$handleEvents$1.label = 1;
                    obj = getChatsClient(str, chatClientInteractor$handleEvents$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i != 1) {
                    if (i == 2) {
                        it = (Iterator) chatClientInteractor$handleEvents$1.L$2;
                        list2 = (Iterable) chatClientInteractor$handleEvents$1.L$1;
                        chatClient = (ChatClient) chatClientInteractor$handleEvents$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        while (it.hasNext()) {
                            chatClientInteractor$handleEvents$1.L$0 = chatClient;
                            chatClientInteractor$handleEvents$1.L$1 = list2;
                            chatClientInteractor$handleEvents$1.L$2 = it;
                            chatClientInteractor$handleEvents$1.label = 2;
                            if (chatClient.handle((Event) it.next(), chatClientInteractor$handleEvents$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    list = (List) chatClientInteractor$handleEvents$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                list2 = list;
                it = list2.iterator();
                chatClient = (ChatClient) obj;
                while (it.hasNext()) {
                }
                return Unit.INSTANCE;
            }
        }
        chatClientInteractor$handleEvents$1 = new ChatClientInteractor$handleEvents$1(this, continuation);
        Object obj2 = chatClientInteractor$handleEvents$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = chatClientInteractor$handleEvents$1.label;
        if (i != 0) {
        }
        list2 = list;
        it = list2.iterator();
        chatClient = (ChatClient) obj2;
        while (it.hasNext()) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0070 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object handleEventForAll(Event event, Continuation<? super Unit> continuation) {
        ChatClientInteractor$handleEventForAll$1 chatClientInteractor$handleEventForAll$1;
        Object obj;
        Object coroutine_suspended;
        int i;
        List list;
        Event event2;
        Iterator it;
        Iterable iterable;
        if (continuation instanceof ChatClientInteractor$handleEventForAll$1) {
            chatClientInteractor$handleEventForAll$1 = (ChatClientInteractor$handleEventForAll$1) continuation;
            if ((chatClientInteractor$handleEventForAll$1.label & Integer.MIN_VALUE) != 0) {
                chatClientInteractor$handleEventForAll$1.label -= Integer.MIN_VALUE;
                obj = chatClientInteractor$handleEventForAll$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = chatClientInteractor$handleEventForAll$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    ChatClientsRepository chatClientsRepository = this.chatsRepository;
                    chatClientInteractor$handleEventForAll$1.L$0 = event;
                    chatClientInteractor$handleEventForAll$1.label = 1;
                    obj = chatClientsRepository.getChatClientsFlow(chatClientInteractor$handleEventForAll$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i != 1) {
                    if (i == 2) {
                        event = (Event) chatClientInteractor$handleEventForAll$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        list = (List) obj;
                        if (list != null) {
                            List list2 = list;
                            event2 = event;
                            it = list2.iterator();
                            iterable = list2;
                            while (it.hasNext()) {
                            }
                            List list3 = (List) iterable;
                        }
                        return Unit.INSTANCE;
                    } else if (i == 3) {
                        it = (Iterator) chatClientInteractor$handleEventForAll$1.L$2;
                        iterable = (Iterable) chatClientInteractor$handleEventForAll$1.L$1;
                        event2 = (Event) chatClientInteractor$handleEventForAll$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        while (it.hasNext()) {
                            chatClientInteractor$handleEventForAll$1.L$0 = event2;
                            chatClientInteractor$handleEventForAll$1.L$1 = iterable;
                            chatClientInteractor$handleEventForAll$1.L$2 = it;
                            chatClientInteractor$handleEventForAll$1.label = 3;
                            if (((ChatClient) it.next()).handle(event2, chatClientInteractor$handleEventForAll$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        List list32 = (List) iterable;
                        return Unit.INSTANCE;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    event = (Event) chatClientInteractor$handleEventForAll$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                chatClientInteractor$handleEventForAll$1.L$0 = event;
                chatClientInteractor$handleEventForAll$1.label = 2;
                obj = FlowKt.firstOrNull((Flow) obj, chatClientInteractor$handleEventForAll$1);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                list = (List) obj;
                if (list != null) {
                }
                return Unit.INSTANCE;
            }
        }
        chatClientInteractor$handleEventForAll$1 = new ChatClientInteractor$handleEventForAll$1(this, continuation);
        obj = chatClientInteractor$handleEventForAll$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = chatClientInteractor$handleEventForAll$1.label;
        if (i != 0) {
        }
        chatClientInteractor$handleEventForAll$1.L$0 = event;
        chatClientInteractor$handleEventForAll$1.label = 2;
        obj = FlowKt.firstOrNull((Flow) obj, chatClientInteractor$handleEventForAll$1);
        if (obj == coroutine_suspended) {
        }
        list = (List) obj;
        if (list != null) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object launch(String str, Continuation<? super Unit> continuation) {
        ChatClientInteractor$launch$1 chatClientInteractor$launch$1;
        int i;
        if (continuation instanceof ChatClientInteractor$launch$1) {
            chatClientInteractor$launch$1 = (ChatClientInteractor$launch$1) continuation;
            if ((chatClientInteractor$launch$1.label & Integer.MIN_VALUE) != 0) {
                chatClientInteractor$launch$1.label -= Integer.MIN_VALUE;
                Object obj = chatClientInteractor$launch$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = chatClientInteractor$launch$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    ChatClientsRepository chatClientsRepository = this.chatsRepository;
                    chatClientInteractor$launch$1.label = 1;
                    obj = chatClientsRepository.getChatClient(str, chatClientInteractor$launch$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ResultKt.throwOnFailure(obj);
                }
                ((ChatClient) obj).launch();
                return Unit.INSTANCE;
            }
        }
        chatClientInteractor$launch$1 = new ChatClientInteractor$launch$1(this, continuation);
        Object obj2 = chatClientInteractor$launch$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = chatClientInteractor$launch$1.label;
        if (i != 0) {
        }
        ((ChatClient) obj2).launch();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object refresh(String str, Continuation<? super Unit> continuation) {
        ChatClientInteractor$refresh$1 chatClientInteractor$refresh$1;
        int i;
        if (continuation instanceof ChatClientInteractor$refresh$1) {
            chatClientInteractor$refresh$1 = (ChatClientInteractor$refresh$1) continuation;
            if ((chatClientInteractor$refresh$1.label & Integer.MIN_VALUE) != 0) {
                chatClientInteractor$refresh$1.label -= Integer.MIN_VALUE;
                Object obj = chatClientInteractor$refresh$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = chatClientInteractor$refresh$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    ChatClientsRepository chatClientsRepository = this.chatsRepository;
                    chatClientInteractor$refresh$1.label = 1;
                    obj = chatClientsRepository.getChatClient(str, chatClientInteractor$refresh$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ResultKt.throwOnFailure(obj);
                }
                ((ChatClient) obj).refresh();
                return Unit.INSTANCE;
            }
        }
        chatClientInteractor$refresh$1 = new ChatClientInteractor$refresh$1(this, continuation);
        Object obj2 = chatClientInteractor$refresh$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = chatClientInteractor$refresh$1.label;
        if (i != 0) {
        }
        ((ChatClient) obj2).refresh();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getChatMessage(String str, String str2, Continuation<? super ChatMessage> continuation) {
        ChatClientInteractor$getChatMessage$1 chatClientInteractor$getChatMessage$1;
        int i;
        if (continuation instanceof ChatClientInteractor$getChatMessage$1) {
            chatClientInteractor$getChatMessage$1 = (ChatClientInteractor$getChatMessage$1) continuation;
            if ((chatClientInteractor$getChatMessage$1.label & Integer.MIN_VALUE) != 0) {
                chatClientInteractor$getChatMessage$1.label -= Integer.MIN_VALUE;
                Object obj = chatClientInteractor$getChatMessage$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = chatClientInteractor$getChatMessage$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    ChatClientsRepository chatClientsRepository = this.chatsRepository;
                    chatClientInteractor$getChatMessage$1.L$0 = str2;
                    chatClientInteractor$getChatMessage$1.label = 1;
                    obj = chatClientsRepository.getChatClient(str, chatClientInteractor$getChatMessage$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    str2 = (String) chatClientInteractor$getChatMessage$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                for (Object obj2 : ChatClientKt.getMessages(((ChatClient) obj).getState().getValue())) {
                    if (Intrinsics.areEqual(((ChatMessage) obj2).getInfo().getIds().getMessageId(), str2)) {
                        return obj2;
                    }
                }
                return null;
            }
        }
        chatClientInteractor$getChatMessage$1 = new ChatClientInteractor$getChatMessage$1(this, continuation);
        Object obj3 = chatClientInteractor$getChatMessage$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = chatClientInteractor$getChatMessage$1.label;
        if (i != 0) {
        }
        while (r5.hasNext()) {
        }
        return null;
    }
}
