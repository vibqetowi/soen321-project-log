package com.ifriend.data.repository.topics;

import com.ifriend.core.local.api.AuthLocalDataSource;
import com.ifriend.data.networking.api.topics.models.InitiateTopicRemote;
import com.ifriend.data.networking.api.topics.models.InitiateTopicRemoteKt;
import com.ifriend.data.networking.datasources.topics.ChatTopicsRemoteDataSource;
import com.ifriend.domain.logic.topics.models.PremiumTopicPopup;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: ChatPremiumTopicsRepositoryImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/ifriend/domain/logic/topics/models/PremiumTopicPopup;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.data.repository.topics.ChatPremiumTopicsRepositoryImpl$activateTopic$2", f = "ChatPremiumTopicsRepositoryImpl.kt", i = {}, l = {47, 46}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class ChatPremiumTopicsRepositoryImpl$activateTopic$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super PremiumTopicPopup>, Object> {
    final /* synthetic */ String $chatId;
    final /* synthetic */ String $topicId;
    Object L$0;
    int label;
    final /* synthetic */ ChatPremiumTopicsRepositoryImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatPremiumTopicsRepositoryImpl$activateTopic$2(ChatPremiumTopicsRepositoryImpl chatPremiumTopicsRepositoryImpl, String str, String str2, Continuation<? super ChatPremiumTopicsRepositoryImpl$activateTopic$2> continuation) {
        super(2, continuation);
        this.this$0 = chatPremiumTopicsRepositoryImpl;
        this.$topicId = str;
        this.$chatId = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatPremiumTopicsRepositoryImpl$activateTopic$2(this.this$0, this.$topicId, this.$chatId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super PremiumTopicPopup> continuation) {
        return ((ChatPremiumTopicsRepositoryImpl$activateTopic$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ChatTopicsRemoteDataSource chatTopicsRemoteDataSource;
        AuthLocalDataSource authLocalDataSource;
        InitiateTopicRemote.PopupData popupData;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            chatTopicsRemoteDataSource = this.this$0.remoteDataSource;
            authLocalDataSource = this.this$0.authDataSource;
            this.L$0 = chatTopicsRemoteDataSource;
            this.label = 1;
            obj = authLocalDataSource.getUserId(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i != 1) {
            if (i == 2) {
                ResultKt.throwOnFailure(obj);
                popupData = ((InitiateTopicRemote) obj).getPopupData();
                if (popupData == null) {
                    return InitiateTopicRemoteKt.toDomain(popupData);
                }
                return null;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            chatTopicsRemoteDataSource = (ChatTopicsRemoteDataSource) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        String str = (String) obj;
        if (str != null) {
            this.L$0 = null;
            this.label = 2;
            obj = chatTopicsRemoteDataSource.activateTopic(this.$topicId, this.$chatId, str, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            popupData = ((InitiateTopicRemote) obj).getPopupData();
            if (popupData == null) {
            }
        } else {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }
}
