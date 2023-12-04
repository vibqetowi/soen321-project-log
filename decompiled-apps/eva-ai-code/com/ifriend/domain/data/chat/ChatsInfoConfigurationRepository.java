package com.ifriend.domain.data.chat;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.apache.http.cookie.ClientCookie;
/* compiled from: ChatsInfoConfigurationRepository.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u0006H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0004J\u0019\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0006H¦@ø\u0001\u0000¢\u0006\u0002\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, d2 = {"Lcom/ifriend/domain/data/chat/ChatsInfoConfigurationRepository;", "", "clear", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLastActiveChatId", "", "setLastActiveChat", "chatId", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ChatsInfoConfigurationRepository {
    Object clear(Continuation<? super Unit> continuation);

    Object getLastActiveChatId(Continuation<? super String> continuation);

    Object setLastActiveChat(String str, Continuation<? super Unit> continuation);
}
