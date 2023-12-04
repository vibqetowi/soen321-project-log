package com.ifriend.data.networking.datasources.topics;

import com.ifriend.core.remote.common.RetryKt;
import com.ifriend.data.networking.api.topics.TopicsApi;
import com.ifriend.data.networking.api.topics.models.ChatPremiumTopicRemote;
import com.ifriend.data.networking.api.topics.models.ChatTopicRemote;
import com.ifriend.data.networking.api.topics.models.InitiateTopicRemote;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ChatTopicsRemoteDataSource.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J)\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u000bJ'\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u000fJ'\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\r2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Lcom/ifriend/data/networking/datasources/topics/ChatTopicsRemoteDataSource;", "", "topicsApi", "Lcom/ifriend/data/networking/api/topics/TopicsApi;", "(Lcom/ifriend/data/networking/api/topics/TopicsApi;)V", "activateTopic", "Lcom/ifriend/data/networking/api/topics/models/InitiateTopicRemote;", "topicId", "", "chatId", "userId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPremiumTopics", "", "Lcom/ifriend/data/networking/api/topics/models/ChatPremiumTopicRemote;", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTopics", "Lcom/ifriend/data/networking/api/topics/models/ChatTopicRemote;", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatTopicsRemoteDataSource {
    private final TopicsApi topicsApi;

    @Inject
    public ChatTopicsRemoteDataSource(TopicsApi topicsApi) {
        Intrinsics.checkNotNullParameter(topicsApi, "topicsApi");
        this.topicsApi = topicsApi;
    }

    public final Object getTopics(String str, String str2, Continuation<? super List<ChatTopicRemote>> continuation) {
        return RetryKt.retryRemoteRequest$default(0, 0L, 0L, 0.0d, new ChatTopicsRemoteDataSource$getTopics$2(this, str, str2, null), continuation, 15, null);
    }

    public final Object getPremiumTopics(String str, String str2, Continuation<? super List<ChatPremiumTopicRemote>> continuation) {
        return RetryKt.retryRemoteRequest$default(0, 0L, 0L, 0.0d, new ChatTopicsRemoteDataSource$getPremiumTopics$2(this, str, str2, null), continuation, 15, null);
    }

    public final Object activateTopic(String str, String str2, String str3, Continuation<? super InitiateTopicRemote> continuation) {
        return RetryKt.retryRemoteRequest$default(0, 0L, 0L, 0.0d, new ChatTopicsRemoteDataSource$activateTopic$2(this, str3, str, str2, null), continuation, 15, null);
    }
}
