package com.ifriend.domain.data.topics;

import com.ifriend.domain.logic.topics.models.ChatPremiumTopic;
import com.ifriend.domain.logic.topics.models.PremiumTopicPopup;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import org.apache.http.cookie.ClientCookie;
/* compiled from: ChatPremiumTopicsRepository.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J#\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0007J'\u0010\b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n0\t2\u0006\u0010\u0006\u001a\u00020\u0005H¦@ø\u0001\u0000¢\u0006\u0002\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lcom/ifriend/domain/data/topics/ChatPremiumTopicsRepository;", "", "activateTopic", "Lcom/ifriend/domain/logic/topics/models/PremiumTopicPopup;", "topicId", "", "chatId", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTopicFlow", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/ifriend/domain/logic/topics/models/ChatPremiumTopic;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ChatPremiumTopicsRepository {
    Object activateTopic(String str, String str2, Continuation<? super PremiumTopicPopup> continuation);

    Object getTopicFlow(String str, Continuation<? super Flow<? extends List<ChatPremiumTopic>>> continuation);
}
