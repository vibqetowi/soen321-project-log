package com.ifriend.data.repository.topics;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.ifriend.data.networking.datasources.topics.ChatTopicsRemoteDataSource;
import com.ifriend.domain.data.AuthDataProvider;
import com.ifriend.domain.models.profile.user.AuthData;
import com.ifriend.domain.models.profile.user.UserId;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: ChatTopicsRepositoryImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.data.repository.topics.ChatTopicsRepositoryImpl$activateTopic$2", f = "ChatTopicsRepositoryImpl.kt", i = {}, l = {ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG, 50}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class ChatTopicsRepositoryImpl$activateTopic$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $chatId;
    final /* synthetic */ String $topicId;
    Object L$0;
    int label;
    final /* synthetic */ ChatTopicsRepositoryImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatTopicsRepositoryImpl$activateTopic$2(ChatTopicsRepositoryImpl chatTopicsRepositoryImpl, String str, String str2, Continuation<? super ChatTopicsRepositoryImpl$activateTopic$2> continuation) {
        super(2, continuation);
        this.this$0 = chatTopicsRepositoryImpl;
        this.$topicId = str;
        this.$chatId = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatTopicsRepositoryImpl$activateTopic$2(this.this$0, this.$topicId, this.$chatId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ChatTopicsRepositoryImpl$activateTopic$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ChatTopicsRemoteDataSource chatTopicsRemoteDataSource;
        AuthDataProvider authDataProvider;
        UserId userId;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            chatTopicsRemoteDataSource = this.this$0.remoteDataSource;
            authDataProvider = this.this$0.authDataProvider;
            this.L$0 = chatTopicsRemoteDataSource;
            this.label = 1;
            obj = authDataProvider.lastAuthData(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i != 1) {
            if (i == 2) {
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            chatTopicsRemoteDataSource = (ChatTopicsRemoteDataSource) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        AuthData authData = (AuthData) obj;
        String value = (authData == null || (userId = authData.getUserId()) == null) ? null : userId.getValue();
        if (value == null) {
            value = "";
        }
        this.L$0 = null;
        this.label = 2;
        if (chatTopicsRemoteDataSource.activateTopic(this.$topicId, this.$chatId, value, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
