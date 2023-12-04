package com.ifriend.domain.data.chat;

import com.ifriend.domain.logic.chat.ChatBackgroundTrigger;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import org.apache.http.cookie.ClientCookie;
/* compiled from: ChatBackgroundRepository.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J!\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0007J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0003H¦@ø\u0001\u0000¢\u0006\u0002\u0010\nJ\u001f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\f2\u0006\u0010\u0004\u001a\u00020\u0003H¦@ø\u0001\u0000¢\u0006\u0002\u0010\nJ\u0019\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u0003H¦@ø\u0001\u0000¢\u0006\u0002\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Lcom/ifriend/domain/data/chat/ChatBackgroundRepository;", "", "getTriggerVideoUri", "", "chatId", "backgroundTrigger", "Lcom/ifriend/domain/logic/chat/ChatBackgroundTrigger;", "(Ljava/lang/String;Lcom/ifriend/domain/logic/chat/ChatBackgroundTrigger;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isPreloadVideos", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isPreloadVideosFlow", "Lkotlinx/coroutines/flow/Flow;", "preloadVideos", "", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ChatBackgroundRepository {
    Object getTriggerVideoUri(String str, ChatBackgroundTrigger chatBackgroundTrigger, Continuation<? super String> continuation);

    Object isPreloadVideos(String str, Continuation<? super Boolean> continuation);

    Object isPreloadVideosFlow(String str, Continuation<? super Flow<Boolean>> continuation);

    Object preloadVideos(String str, Continuation<? super Unit> continuation);
}
