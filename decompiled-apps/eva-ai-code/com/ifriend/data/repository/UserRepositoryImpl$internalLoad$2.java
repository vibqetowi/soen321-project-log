package com.ifriend.data.repository;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.ifriend.data.mappers.ToUserMapper;
import com.ifriend.data.networking.api.UserApi;
import com.ifriend.data.networking.responses.UserDataResponse;
import com.ifriend.domain.models.Tag;
import com.ifriend.domain.models.profile.user.AuthData;
import com.ifriend.domain.models.profile.user.User;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import retrofit2.Response;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: UserRepositoryImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.data.repository.UserRepositoryImpl$internalLoad$2", f = "UserRepositoryImpl.kt", i = {}, l = {79, 83, TsExtractor.TS_STREAM_TYPE_DVBSUBS}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class UserRepositoryImpl$internalLoad$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AuthData $auth;
    final /* synthetic */ List<Tag> $tags;
    int label;
    final /* synthetic */ UserRepositoryImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserRepositoryImpl$internalLoad$2(UserRepositoryImpl userRepositoryImpl, AuthData authData, List<Tag> list, Continuation<? super UserRepositoryImpl$internalLoad$2> continuation) {
        super(2, continuation);
        this.this$0 = userRepositoryImpl;
        this.$auth = authData;
        this.$tags = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UserRepositoryImpl$internalLoad$2(this.this$0, this.$auth, this.$tags, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((UserRepositoryImpl$internalLoad$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        UserApi userApi;
        ToUserMapper toUserMapper;
        MutableStateFlow mutableStateFlow;
        MutableStateFlow mutableStateFlow2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            userApi = this.this$0.api;
            this.label = 1;
            obj = userApi.getUserData(this.$auth.getToken().formatted(), this.$auth.getUserId().getValue(), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i != 1) {
            if (i == 2) {
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            } else if (i == 3) {
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
        }
        UserDataResponse userDataResponse = (UserDataResponse) ((Response) obj).body();
        if (userDataResponse == null) {
            mutableStateFlow2 = this.this$0.state;
            this.label = 2;
            if (mutableStateFlow2.emit(null, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
        toUserMapper = this.this$0.toUserMapper;
        User map = toUserMapper.map(userDataResponse, this.$auth, this.$tags);
        mutableStateFlow = this.this$0.state;
        this.label = 3;
        if (mutableStateFlow.emit(map, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
