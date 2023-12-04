package com.ifriend.domain.data.chat.subscription;

import com.ifriend.domain.logic.chat.subscription.models.ChatSubscriptionBenefits;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import org.apache.http.cookie.ClientCookie;
/* compiled from: ChatSubscriptionRepository.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0004J%\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\t\u001a\u00020\nH¦@ø\u0001\u0000¢\u0006\u0002\u0010\u000bJ\u0019\u0010\f\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH¦@ø\u0001\u0000¢\u0006\u0002\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lcom/ifriend/domain/data/chat/subscription/ChatSubscriptionRepository;", "", "clear", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSubscriptionBenefitsFlow", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/ifriend/domain/logic/chat/subscription/models/ChatSubscriptionBenefits;", "chatId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "refreshSubscriptionBenefits", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ChatSubscriptionRepository {
    Object clear(Continuation<? super Unit> continuation);

    Object getSubscriptionBenefitsFlow(String str, Continuation<? super Flow<? extends List<ChatSubscriptionBenefits>>> continuation);

    Object refreshSubscriptionBenefits(String str, Continuation<? super Unit> continuation);
}
