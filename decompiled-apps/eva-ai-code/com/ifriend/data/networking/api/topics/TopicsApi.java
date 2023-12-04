package com.ifriend.data.networking.api.topics;

import com.ifriend.data.networking.api.topics.models.ChatPremiumTopicRemote;
import com.ifriend.data.networking.api.topics.models.ChatTopicRemote;
import com.ifriend.data.networking.api.topics.models.InitiateTopicRemote;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
/* compiled from: TopicsApi.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J/\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0007\u001a\u00020\u0005H§@ø\u0001\u0000¢\u0006\u0002\u0010\bJ+\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0007\u001a\u00020\u0005H§@ø\u0001\u0000¢\u0006\u0002\u0010\fJ+\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\n2\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0007\u001a\u00020\u0005H§@ø\u0001\u0000¢\u0006\u0002\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Lcom/ifriend/data/networking/api/topics/TopicsApi;", "", "activateTopic", "Lcom/ifriend/data/networking/api/topics/models/InitiateTopicRemote;", "userId", "", "topicId", "chatId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPremiumTopics", "", "Lcom/ifriend/data/networking/api/topics/models/ChatPremiumTopicRemote;", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTopics", "Lcom/ifriend/data/networking/api/topics/models/ChatTopicRemote;", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface TopicsApi {
    @POST("ai/users/{userId}/{chatId}/initiate-topic/{topicId}")
    Object activateTopic(@Path("userId") String str, @Path("topicId") String str2, @Path("chatId") String str3, Continuation<? super InitiateTopicRemote> continuation);

    @GET("ai/users/{userId}/{chatId}/premium-topics")
    Object getPremiumTopics(@Path("userId") String str, @Path("chatId") String str2, Continuation<? super List<ChatPremiumTopicRemote>> continuation);

    @GET("ai/users/{userId}/{chatId}/topics")
    Object getTopics(@Path("userId") String str, @Path("chatId") String str2, Continuation<? super List<ChatTopicRemote>> continuation);
}
