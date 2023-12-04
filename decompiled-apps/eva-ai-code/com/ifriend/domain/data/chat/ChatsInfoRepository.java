package com.ifriend.domain.data.chat;

import com.ifriend.domain.logic.chat.models.ChatInfo;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import org.apache.http.cookie.ClientCookie;
/* compiled from: ChatsInfoRepository.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0006J\u0011\u0010\b\u001a\u00020\u0003H¦@ø\u0001\u0000¢\u0006\u0002\u0010\tJ\u001b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0004\u001a\u00020\u0005H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0006J\u0014\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u000e0\rH&J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\r2\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0019\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0005H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0006J!\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0005H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0013\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Lcom/ifriend/domain/data/chat/ChatsInfoRepository;", "", "activateNewChat", "", "chatId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addMainChat", "clear", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getChat", "Lcom/ifriend/domain/logic/chat/models/ChatInfo;", "getChatFlow", "Lkotlinx/coroutines/flow/Flow;", "", "refreshChats", "mainChatId", "updateChatName", "newName", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ChatsInfoRepository {
    Object activateNewChat(String str, Continuation<? super Unit> continuation);

    Object addMainChat(String str, Continuation<? super Unit> continuation);

    Object clear(Continuation<? super Unit> continuation);

    Object getChat(String str, Continuation<? super ChatInfo> continuation);

    Flow<List<ChatInfo>> getChatFlow();

    Flow<ChatInfo> getChatFlow(String str);

    Object refreshChats(String str, Continuation<? super Unit> continuation);

    Object updateChatName(String str, String str2, Continuation<? super Unit> continuation);
}
