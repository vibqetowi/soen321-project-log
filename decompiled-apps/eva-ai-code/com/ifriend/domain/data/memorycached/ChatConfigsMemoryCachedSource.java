package com.ifriend.domain.data.memorycached;

import com.ifriend.domain.logic.chat.configuration.ChatConfig;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import org.apache.http.cookie.ClientCookie;
/* compiled from: ChatConfigsMemoryCachedSource.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0004J\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0004J\u001d\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\tH¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0004J\u0011\u0010\n\u001a\u00020\u0003H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Lcom/ifriend/domain/data/memorycached/ChatConfigsMemoryCachedSource;", "", "clear", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getChatConfigs", "", "Lcom/ifriend/domain/logic/chat/configuration/ChatConfig;", "getChatConfigsFlow", "Lkotlinx/coroutines/flow/Flow;", "refresh", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ChatConfigsMemoryCachedSource {
    Object clear(Continuation<? super Unit> continuation);

    Object getChatConfigs(Continuation<? super List<ChatConfig>> continuation);

    Object getChatConfigsFlow(Continuation<? super Flow<? extends List<ChatConfig>>> continuation);

    Object refresh(Continuation<? super Unit> continuation);
}
