package com.ifriend.domain.newChat.chat.systems.messages.reading;

import androidx.core.app.NotificationCompat;
import com.ifriend.common_entities_engine.EntitiesState;
import com.ifriend.common_entities_engine.Entity;
import com.ifriend.common_entities_engine.EntityKt;
import com.ifriend.common_entities_engine.Event;
import com.ifriend.common_entities_engine.System;
import com.ifriend.domain.newChat.chat.models.ChatMessage;
import com.ifriend.domain.newChat.chat.models.ChatMessageKt;
import com.ifriend.domain.newChat.chat.systems.OnEntityShown;
import com.ifriend.domain.newChat.chat.systems.distinct.UniqueComponent;
import com.ifriend.domain.newChat.chat.systems.messages.sending.send.ChatMessagesRepository;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import org.apache.http.cookie.ClientCookie;
/* compiled from: ReadingMessagesSystem.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010#\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0019\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0014J\u0019\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0017J\u0019\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0019H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u001aR2\u0010\b\u001a&\u0012\f\u0012\n \n*\u0004\u0018\u00010\u00060\u0006 \n*\u0012\u0012\f\u0012\n \n*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u000b0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"Lcom/ifriend/domain/newChat/chat/systems/messages/reading/ReadingMessagesSystem;", "Lcom/ifriend/common_entities_engine/System;", "Lcom/ifriend/common_entities_engine/EntitiesState;", "chatMessagesRepository", "Lcom/ifriend/domain/newChat/chat/systems/messages/sending/send/ChatMessagesRepository;", "chatId", "", "(Lcom/ifriend/domain/newChat/chat/systems/messages/sending/send/ChatMessagesRepository;Ljava/lang/String;)V", "alreadyRead", "", "kotlin.jvm.PlatformType", "", "isNeedToReadAllMessages", "Ljava/util/concurrent/atomic/AtomicBoolean;", "mutex", "Lkotlinx/coroutines/sync/Mutex;", "onHandleEvent", "", NotificationCompat.CATEGORY_EVENT, "Lcom/ifriend/common_entities_engine/Event;", "(Lcom/ifriend/common_entities_engine/Event;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onUpdateState", "state", "(Lcom/ifriend/common_entities_engine/EntitiesState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readMessage", "Lcom/ifriend/domain/newChat/chat/systems/OnEntityShown;", "(Lcom/ifriend/domain/newChat/chat/systems/OnEntityShown;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ReadingMessagesSystem extends System<EntitiesState> {
    private final Set<String> alreadyRead;
    private final String chatId;
    private final ChatMessagesRepository chatMessagesRepository;
    private AtomicBoolean isNeedToReadAllMessages;
    private final Mutex mutex;

    public ReadingMessagesSystem(ChatMessagesRepository chatMessagesRepository, String chatId) {
        Intrinsics.checkNotNullParameter(chatMessagesRepository, "chatMessagesRepository");
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        this.chatMessagesRepository = chatMessagesRepository;
        this.chatId = chatId;
        this.alreadyRead = Collections.synchronizedSet(new LinkedHashSet());
        this.isNeedToReadAllMessages = new AtomicBoolean(false);
        this.mutex = MutexKt.Mutex(false);
    }

    @Override // com.ifriend.common_entities_engine.System
    public Object onUpdateState(EntitiesState entitiesState, Continuation<? super EntitiesState> continuation) {
        if (!this.isNeedToReadAllMessages.get()) {
            return super.onUpdateState((ReadingMessagesSystem) entitiesState, (Continuation<? super ReadingMessagesSystem>) continuation);
        }
        List<Entity> entities = entitiesState.getEntities();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(entities, 10));
        for (Entity entity : entities) {
            arrayList.add(EntityKt.newWithComponent(entity, MessageIsReadComponent.INSTANCE));
        }
        this.isNeedToReadAllMessages.set(false);
        return EntitiesState.copy$default(entitiesState, arrayList, null, 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0083 A[Catch: all -> 0x00b8, TRY_LEAVE, TryCatch #1 {all -> 0x00b8, blocks: (B:28:0x0074, B:30:0x0083, B:33:0x008b), top: B:52:0x0074 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008b A[Catch: all -> 0x00b8, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x00b8, blocks: (B:28:0x0074, B:30:0x0083, B:33:0x008b), top: B:52:0x0074 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a8 A[Catch: all -> 0x0046, TRY_LEAVE, TryCatch #0 {all -> 0x0046, blocks: (B:17:0x0042, B:37:0x00a0, B:39:0x00a8), top: B:50:0x0042 }] */
    @Override // com.ifriend.common_entities_engine.System
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object onHandleEvent(Event event, Continuation<? super Boolean> continuation) {
        ReadingMessagesSystem$onHandleEvent$1 readingMessagesSystem$onHandleEvent$1;
        Object obj;
        int i;
        Mutex mutex;
        ReadingMessagesSystem readingMessagesSystem;
        Throwable th;
        Mutex mutex2;
        ReadingMessagesSystem readingMessagesSystem2;
        if (continuation instanceof ReadingMessagesSystem$onHandleEvent$1) {
            readingMessagesSystem$onHandleEvent$1 = (ReadingMessagesSystem$onHandleEvent$1) continuation;
            if ((readingMessagesSystem$onHandleEvent$1.label & Integer.MIN_VALUE) != 0) {
                readingMessagesSystem$onHandleEvent$1.label -= Integer.MIN_VALUE;
                obj = readingMessagesSystem$onHandleEvent$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = readingMessagesSystem$onHandleEvent$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (event instanceof OnEntityShown) {
                        mutex = this.mutex;
                        readingMessagesSystem$onHandleEvent$1.L$0 = this;
                        readingMessagesSystem$onHandleEvent$1.L$1 = event;
                        readingMessagesSystem$onHandleEvent$1.L$2 = mutex;
                        readingMessagesSystem$onHandleEvent$1.label = 1;
                        if (mutex.lock(null, readingMessagesSystem$onHandleEvent$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        readingMessagesSystem = this;
                        if (readingMessagesSystem.alreadyRead.contains(((OnEntityShown) event).getId())) {
                        }
                    } else {
                        readingMessagesSystem$onHandleEvent$1.label = 3;
                        obj = super.onHandleEvent(event, readingMessagesSystem$onHandleEvent$1);
                        return obj == coroutine_suspended ? coroutine_suspended : obj;
                    }
                } else if (i == 1) {
                    readingMessagesSystem = (ReadingMessagesSystem) readingMessagesSystem$onHandleEvent$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    mutex = (Mutex) readingMessagesSystem$onHandleEvent$1.L$2;
                    event = (Event) readingMessagesSystem$onHandleEvent$1.L$1;
                    try {
                        if (readingMessagesSystem.alreadyRead.contains(((OnEntityShown) event).getId())) {
                            readingMessagesSystem$onHandleEvent$1.L$0 = readingMessagesSystem;
                            readingMessagesSystem$onHandleEvent$1.L$1 = mutex;
                            readingMessagesSystem$onHandleEvent$1.L$2 = null;
                            readingMessagesSystem$onHandleEvent$1.label = 2;
                            Object readMessage = readingMessagesSystem.readMessage((OnEntityShown) event, readingMessagesSystem$onHandleEvent$1);
                            if (readMessage == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            readingMessagesSystem2 = readingMessagesSystem;
                            Mutex mutex3 = mutex;
                            obj = readMessage;
                            mutex2 = mutex3;
                        } else {
                            Boolean boxBoolean = Boxing.boxBoolean(true);
                            mutex.unlock(null);
                            return boxBoolean;
                        }
                    } catch (Throwable th2) {
                        Mutex mutex4 = mutex;
                        th = th2;
                        mutex2 = mutex4;
                        mutex2.unlock(null);
                        throw th;
                    }
                } else if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                } else {
                    mutex2 = (Mutex) readingMessagesSystem$onHandleEvent$1.L$1;
                    readingMessagesSystem2 = (ReadingMessagesSystem) readingMessagesSystem$onHandleEvent$1.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        mutex2.unlock(null);
                        throw th;
                    }
                }
                if (((Boolean) obj).booleanValue()) {
                    readingMessagesSystem2.isNeedToReadAllMessages.set(true);
                    readingMessagesSystem2.reportUpdateState();
                }
                mutex2.unlock(null);
                return Boxing.boxBoolean(true);
            }
        }
        readingMessagesSystem$onHandleEvent$1 = new ReadingMessagesSystem$onHandleEvent$1(this, continuation);
        obj = readingMessagesSystem$onHandleEvent$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = readingMessagesSystem$onHandleEvent$1.label;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
        mutex2.unlock(null);
        return Boxing.boxBoolean(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object readMessage(OnEntityShown onEntityShown, Continuation<? super Boolean> continuation) {
        ReadingMessagesSystem$readMessage$1 readingMessagesSystem$readMessage$1;
        int i;
        UniqueComponent uniqueComponent;
        ReadingMessagesSystem readingMessagesSystem;
        if (continuation instanceof ReadingMessagesSystem$readMessage$1) {
            readingMessagesSystem$readMessage$1 = (ReadingMessagesSystem$readMessage$1) continuation;
            if ((readingMessagesSystem$readMessage$1.label & Integer.MIN_VALUE) != 0) {
                readingMessagesSystem$readMessage$1.label -= Integer.MIN_VALUE;
                Object obj = readingMessagesSystem$readMessage$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = readingMessagesSystem$readMessage$1.label;
                boolean z = true;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    EntitiesState currentState = currentState();
                    if (currentState == null) {
                        return Boxing.boxBoolean(false);
                    }
                    for (Entity entity : currentState.getEntities()) {
                        ChatMessage chatMessage = (ChatMessage) entity.get(Reflection.getOrCreateKotlinClass(ChatMessage.class));
                        if (chatMessage != null && (uniqueComponent = (UniqueComponent) entity.get(Reflection.getOrCreateKotlinClass(UniqueComponent.class))) != null && Intrinsics.areEqual(uniqueComponent.getId(), onEntityShown.getId()) && !chatMessage.getInfo().getRead() && ChatMessageKt.isFromBot(chatMessage) && Intrinsics.areEqual(chatMessage.getInfo().getIds().getSenderId(), this.chatId)) {
                            ChatMessagesRepository chatMessagesRepository = this.chatMessagesRepository;
                            String id = ChatMessageKt.getId(chatMessage);
                            String str = this.chatId;
                            readingMessagesSystem$readMessage$1.L$0 = this;
                            readingMessagesSystem$readMessage$1.L$1 = onEntityShown;
                            readingMessagesSystem$readMessage$1.label = 1;
                            if (chatMessagesRepository.readMessage(id, str, readingMessagesSystem$readMessage$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            readingMessagesSystem = this;
                        }
                    }
                    z = false;
                    return Boxing.boxBoolean(z);
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    onEntityShown = (OnEntityShown) readingMessagesSystem$readMessage$1.L$1;
                    readingMessagesSystem = (ReadingMessagesSystem) readingMessagesSystem$readMessage$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                readingMessagesSystem.alreadyRead.add(onEntityShown.getId());
                return Boxing.boxBoolean(z);
            }
        }
        readingMessagesSystem$readMessage$1 = new ReadingMessagesSystem$readMessage$1(this, continuation);
        Object obj2 = readingMessagesSystem$readMessage$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = readingMessagesSystem$readMessage$1.label;
        boolean z2 = true;
        if (i != 0) {
        }
        readingMessagesSystem.alreadyRead.add(onEntityShown.getId());
        return Boxing.boxBoolean(z2);
    }
}
