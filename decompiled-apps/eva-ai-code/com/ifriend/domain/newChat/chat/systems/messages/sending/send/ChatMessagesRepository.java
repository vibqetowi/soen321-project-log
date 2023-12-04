package com.ifriend.domain.newChat.chat.systems.messages.sending.send;

import com.ifriend.domain.newChat.chat.models.ChatMessage;
import com.ifriend.domain.newChat.chat.models.MessageToSend;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.apache.http.cookie.ClientCookie;
/* compiled from: ChatMessagesRepository.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J!\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0007J/\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u0005H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u000eJ\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u0005H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0011J!\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0007J!\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0007J!\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0016H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0017\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Lcom/ifriend/domain/newChat/chat/systems/messages/sending/send/ChatMessagesRepository;", "", "deleteMessages", "", "messageId", "", "chatId", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMessages", "", "Lcom/ifriend/domain/newChat/chat/models/ChatMessage;", "omit", "", "count", "(IILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "initFirstChat", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readMessage", "regenerateNewAnswer", "sendMessages", "messageToSend", "Lcom/ifriend/domain/newChat/chat/models/MessageToSend;", "(Ljava/lang/String;Lcom/ifriend/domain/newChat/chat/models/MessageToSend;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ChatMessagesRepository {
    Object deleteMessages(String str, String str2, Continuation<? super Unit> continuation);

    Object getMessages(int i, int i2, String str, Continuation<? super List<ChatMessage>> continuation);

    Object initFirstChat(String str, Continuation<? super Boolean> continuation);

    Object readMessage(String str, String str2, Continuation<? super Boolean> continuation);

    Object regenerateNewAnswer(String str, String str2, Continuation<? super Unit> continuation);

    Object sendMessages(String str, MessageToSend messageToSend, Continuation<? super Unit> continuation);
}
