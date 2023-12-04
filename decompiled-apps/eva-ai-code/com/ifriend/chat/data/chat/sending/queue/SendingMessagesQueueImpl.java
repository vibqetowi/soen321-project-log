package com.ifriend.chat.data.chat.sending.queue;

import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.share.internal.ShareConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ifriend.domain.data.DoubleSuspendMapper;
import com.ifriend.domain.newChat.chat.models.MessageTag;
import com.ifriend.domain.newChat.chat.models.MessageToSend;
import com.ifriend.domain.newChat.chat.systems.messages.sending.send.SendingMessagesQueue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: SendingMessagesQueueImpl.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0018\u0010\u0002\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0002\u0010\u0007J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\nH\u0016J\u0019\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0006H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0014J\u0019\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0017H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0018J\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u000eH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u001aJ!\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0005H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\nH\u0016R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u000e¢\u0006\u0002\n\u0000R2\u0010\u000b\u001a&\u0012\f\u0012\n \r*\u0004\u0018\u00010\u00060\u0006 \r*\u0012\u0012\f\u0012\n \r*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u000e0\fX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0002\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006 "}, d2 = {"Lcom/ifriend/chat/data/chat/sending/queue/SendingMessagesQueueImpl;", "Lcom/ifriend/domain/newChat/chat/systems/messages/sending/send/SendingMessagesQueue;", "toQueuedMessageMapper", "Lcom/ifriend/domain/data/DoubleSuspendMapper;", "Lcom/ifriend/domain/newChat/chat/models/MessageToSend;", "", "Lcom/ifriend/domain/newChat/chat/systems/messages/sending/send/SendingMessagesQueue$QueuedMessage;", "(Lcom/ifriend/domain/data/DoubleSuspendMapper;)V", "listeners", "", "Lcom/ifriend/domain/newChat/chat/systems/messages/sending/send/SendingMessagesQueue$Listener;", "queue", "", "kotlin.jvm.PlatformType", "", "addListener", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "delete", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "(Lcom/ifriend/domain/newChat/chat/systems/messages/sending/send/SendingMessagesQueue$QueuedMessage;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteMessageWithTag", ViewHierarchyConstants.TAG_KEY, "Lcom/ifriend/domain/newChat/chat/models/MessageTag;", "(Lcom/ifriend/domain/newChat/chat/models/MessageTag;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAll", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "put", "messageToSend", "chatId", "(Lcom/ifriend/domain/newChat/chat/models/MessageToSend;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "removeListener", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SendingMessagesQueueImpl implements SendingMessagesQueue {
    private Set<SendingMessagesQueue.Listener> listeners;
    private final List<SendingMessagesQueue.QueuedMessage> queue;
    private final DoubleSuspendMapper<MessageToSend, String, SendingMessagesQueue.QueuedMessage> toQueuedMessageMapper;

    @Inject
    public SendingMessagesQueueImpl(DoubleSuspendMapper<MessageToSend, String, SendingMessagesQueue.QueuedMessage> toQueuedMessageMapper) {
        Intrinsics.checkNotNullParameter(toQueuedMessageMapper, "toQueuedMessageMapper");
        this.toQueuedMessageMapper = toQueuedMessageMapper;
        this.listeners = new LinkedHashSet();
        this.queue = Collections.synchronizedList(new ArrayList());
    }

    @Override // com.ifriend.domain.newChat.chat.systems.messages.sending.send.SendingMessagesQueue
    public Object getAll(Continuation<? super List<SendingMessagesQueue.QueuedMessage>> continuation) {
        List<SendingMessagesQueue.QueuedMessage> queue = this.queue;
        Intrinsics.checkNotNullExpressionValue(queue, "queue");
        return queue;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005c A[LOOP:0: B:19:0x0056->B:21:0x005c, LOOP_END] */
    @Override // com.ifriend.domain.newChat.chat.systems.messages.sending.send.SendingMessagesQueue
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object put(MessageToSend messageToSend, String str, Continuation<? super Unit> continuation) {
        SendingMessagesQueueImpl$put$1 sendingMessagesQueueImpl$put$1;
        int i;
        SendingMessagesQueueImpl sendingMessagesQueueImpl;
        if (continuation instanceof SendingMessagesQueueImpl$put$1) {
            sendingMessagesQueueImpl$put$1 = (SendingMessagesQueueImpl$put$1) continuation;
            if ((sendingMessagesQueueImpl$put$1.label & Integer.MIN_VALUE) != 0) {
                sendingMessagesQueueImpl$put$1.label -= Integer.MIN_VALUE;
                Object obj = sendingMessagesQueueImpl$put$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = sendingMessagesQueueImpl$put$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    DoubleSuspendMapper<MessageToSend, String, SendingMessagesQueue.QueuedMessage> doubleSuspendMapper = this.toQueuedMessageMapper;
                    sendingMessagesQueueImpl$put$1.L$0 = this;
                    sendingMessagesQueueImpl$put$1.label = 1;
                    obj = doubleSuspendMapper.map(messageToSend, str, sendingMessagesQueueImpl$put$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    sendingMessagesQueueImpl = this;
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sendingMessagesQueueImpl = (SendingMessagesQueueImpl) sendingMessagesQueueImpl$put$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                SendingMessagesQueue.QueuedMessage queuedMessage = (SendingMessagesQueue.QueuedMessage) obj;
                sendingMessagesQueueImpl.queue.add(queuedMessage);
                for (SendingMessagesQueue.Listener listener : sendingMessagesQueueImpl.listeners) {
                    listener.onNewMessageAdded(queuedMessage);
                }
                return Unit.INSTANCE;
            }
        }
        sendingMessagesQueueImpl$put$1 = new SendingMessagesQueueImpl$put$1(this, continuation);
        Object obj2 = sendingMessagesQueueImpl$put$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = sendingMessagesQueueImpl$put$1.label;
        if (i != 0) {
        }
        SendingMessagesQueue.QueuedMessage queuedMessage2 = (SendingMessagesQueue.QueuedMessage) obj2;
        sendingMessagesQueueImpl.queue.add(queuedMessage2);
        while (r5.hasNext()) {
        }
        return Unit.INSTANCE;
    }

    @Override // com.ifriend.domain.newChat.chat.systems.messages.sending.send.SendingMessagesQueue
    public Object delete(SendingMessagesQueue.QueuedMessage queuedMessage, Continuation<? super Unit> continuation) {
        if (this.queue.remove(queuedMessage)) {
            for (SendingMessagesQueue.Listener listener : this.listeners) {
                listener.onMessageRemoved(queuedMessage);
            }
        }
        return Unit.INSTANCE;
    }

    @Override // com.ifriend.domain.newChat.chat.systems.messages.sending.send.SendingMessagesQueue
    public Object deleteMessageWithTag(MessageTag messageTag, Continuation<? super Unit> continuation) {
        List<SendingMessagesQueue.QueuedMessage> queue = this.queue;
        Intrinsics.checkNotNullExpressionValue(queue, "queue");
        Iterator<SendingMessagesQueue.QueuedMessage> it = queue.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (Intrinsics.areEqual(it.next().getTag(), messageTag)) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return Unit.INSTANCE;
        }
        SendingMessagesQueue.QueuedMessage remove = this.queue.remove(i);
        for (SendingMessagesQueue.Listener listener : this.listeners) {
            Intrinsics.checkNotNull(remove);
            listener.onMessageRemoved(remove);
        }
        return Unit.INSTANCE;
    }

    @Override // com.ifriend.domain.newChat.chat.systems.messages.sending.send.SendingMessagesQueue
    public void addListener(SendingMessagesQueue.Listener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.listeners.add(listener);
    }

    @Override // com.ifriend.domain.newChat.chat.systems.messages.sending.send.SendingMessagesQueue
    public void removeListener(SendingMessagesQueue.Listener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.listeners.remove(listener);
    }
}
