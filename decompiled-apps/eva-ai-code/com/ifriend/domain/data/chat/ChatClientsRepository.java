package com.ifriend.domain.data.chat;

import com.ifriend.domain.newChat.chat.ChatClient;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import org.apache.http.cookie.ClientCookie;
/* compiled from: ChatClientsRepository.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H¦@ø\u0001\u0000¢\u0006\u0002\u0010\bJ\u0019\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0007H¦@ø\u0001\u0000¢\u0006\u0002\u0010\bJ\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\r0\fH¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0004J)\u0010\u000e\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n0\u000f0\r0\fH¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"Lcom/ifriend/domain/data/chat/ChatClientsRepository;", "", "clearAllChatClients", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clearChatClient", "chatId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getChatClient", "Lcom/ifriend/domain/newChat/chat/ChatClient;", "getChatClientsFlow", "Lkotlinx/coroutines/flow/Flow;", "", "getChatClientsWithChatIdFlow", "Lkotlin/Pair;", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ChatClientsRepository {
    Object clearAllChatClients(Continuation<? super Unit> continuation);

    Object clearChatClient(String str, Continuation<? super Unit> continuation);

    Object getChatClient(String str, Continuation<? super ChatClient> continuation);

    Object getChatClientsFlow(Continuation<? super Flow<? extends List<? extends ChatClient>>> continuation);

    Object getChatClientsWithChatIdFlow(Continuation<? super Flow<? extends List<? extends Pair<String, ? extends ChatClient>>>> continuation);
}
