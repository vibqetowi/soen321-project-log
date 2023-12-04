package com.ifriend.data.networking.datasources.topics;

import com.ifriend.data.networking.api.topics.TopicsApi;
import com.ifriend.data.networking.api.topics.models.ChatPremiumTopicRemote;
import java.util.List;
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
@Metadata(d1 = {"\u0000\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"", "Lcom/ifriend/data/networking/api/topics/models/ChatPremiumTopicRemote;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.data.networking.datasources.topics.ChatTopicsRemoteDataSource$getPremiumTopics$2", f = "ChatTopicsRemoteDataSource.kt", i = {}, l = {24}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class ChatTopicsRemoteDataSource$getPremiumTopics$2 extends SuspendLambda implements Function1<Continuation<? super List<? extends ChatPremiumTopicRemote>>, Object> {
    final /* synthetic */ String $chatId;
    final /* synthetic */ String $userId;
    int label;
    final /* synthetic */ ChatTopicsRemoteDataSource this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatTopicsRemoteDataSource$getPremiumTopics$2(ChatTopicsRemoteDataSource chatTopicsRemoteDataSource, String str, String str2, Continuation<? super ChatTopicsRemoteDataSource$getPremiumTopics$2> continuation) {
        super(1, continuation);
        this.this$0 = chatTopicsRemoteDataSource;
        this.$userId = str;
        this.$chatId = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new ChatTopicsRemoteDataSource$getPremiumTopics$2(this.this$0, this.$userId, this.$chatId, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Continuation<? super List<? extends ChatPremiumTopicRemote>> continuation) {
        return invoke2((Continuation<? super List<ChatPremiumTopicRemote>>) continuation);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(Continuation<? super List<ChatPremiumTopicRemote>> continuation) {
        return ((ChatTopicsRemoteDataSource$getPremiumTopics$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
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
            obj = topicsApi.getPremiumTopics(this.$userId, this.$chatId, this);
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
