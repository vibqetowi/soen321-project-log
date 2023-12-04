package com.ifriend.data.networking.datasources.topics;

import com.ifriend.data.networking.api.topics.TopicsApi;
import com.ifriend.data.networking.api.topics.models.InitiateTopicRemote;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatTopicsRemoteDataSource.kt */
@Metadata(d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/ifriend/data/networking/api/topics/models/InitiateTopicRemote;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.data.networking.datasources.topics.ChatTopicsRemoteDataSource$activateTopic$2", f = "ChatTopicsRemoteDataSource.kt", i = {}, l = {35}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class ChatTopicsRemoteDataSource$activateTopic$2 extends SuspendLambda implements Function1<Continuation<? super InitiateTopicRemote>, Object> {
    final /* synthetic */ String $chatId;
    final /* synthetic */ String $topicId;
    final /* synthetic */ String $userId;
    int label;
    final /* synthetic */ ChatTopicsRemoteDataSource this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatTopicsRemoteDataSource$activateTopic$2(ChatTopicsRemoteDataSource chatTopicsRemoteDataSource, String str, String str2, String str3, Continuation<? super ChatTopicsRemoteDataSource$activateTopic$2> continuation) {
        super(1, continuation);
        this.this$0 = chatTopicsRemoteDataSource;
        this.$userId = str;
        this.$topicId = str2;
        this.$chatId = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new ChatTopicsRemoteDataSource$activateTopic$2(this.this$0, this.$userId, this.$topicId, this.$chatId, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super InitiateTopicRemote> continuation) {
        return ((ChatTopicsRemoteDataSource$activateTopic$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        TopicsApi topicsApi;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            topicsApi = this.this$0.topicsApi;
            this.label = 1;
            obj = topicsApi.activateTopic(this.$userId, this.$topicId, this.$chatId, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}
