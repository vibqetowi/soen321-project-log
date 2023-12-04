package com.ifriend.domain.data.chat;

import com.ifriend.domain.logic.chat.models.ChatIntroSlide;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.apache.http.cookie.ClientCookie;
/* compiled from: ChatIntroRepository.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0007J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0006H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0007J!\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\tH¦@ø\u0001\u0000¢\u0006\u0002\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Lcom/ifriend/domain/data/chat/ChatIntroRepository;", "", "getChatIntroSlides", "", "Lcom/ifriend/domain/logic/chat/models/ChatIntroSlide;", "botId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isChatIntroShown", "", "setChatIntroShown", "", "isShown", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ChatIntroRepository {
    Object getChatIntroSlides(String str, Continuation<? super List<ChatIntroSlide>> continuation);

    Object isChatIntroShown(String str, Continuation<? super Boolean> continuation);

    Object setChatIntroShown(String str, boolean z, Continuation<? super Unit> continuation);
}
