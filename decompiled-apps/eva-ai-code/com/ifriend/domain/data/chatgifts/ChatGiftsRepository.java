package com.ifriend.domain.data.chatgifts;

import com.ifriend.domain.logic.chat.gifts.ChatGift;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import org.apache.http.cookie.ClientCookie;
/* compiled from: ChatGiftsRepository.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\bf\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0004J+\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH¦@ø\u0001\u0000¢\u0006\u0002\u0010\u000bJ!\u0010\f\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH¦@ø\u0001\u0000¢\u0006\u0002\u0010\rJ)\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH¦@ø\u0001\u0000¢\u0006\u0002\u0010\u000bJ$\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00110\u00102\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH&\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Lcom/ifriend/domain/data/chatgifts/ChatGiftsRepository;", "", "clear", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getGift", "Lcom/ifriend/domain/logic/chat/gifts/ChatGift;", "chatId", "", "userId", "giftId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "refresh", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "removeGiftFromLocal", "subscribe", "Lkotlinx/coroutines/flow/Flow;", "", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ChatGiftsRepository {
    Object clear(Continuation<? super Unit> continuation);

    Object getGift(String str, String str2, String str3, Continuation<? super ChatGift> continuation);

    Object refresh(String str, String str2, Continuation<? super Unit> continuation);

    Object removeGiftFromLocal(String str, String str2, String str3, Continuation<? super Unit> continuation);

    Flow<List<ChatGift>> subscribe(String str, String str2);
}
