package com.ifriend.data.repository;

import com.ifriend.data.networking.api.UserApi;
import com.ifriend.data.networking.requests.SetUserAgeRequest;
import com.ifriend.domain.models.profile.Birthday;
import com.ifriend.domain.models.profile.user.AuthData;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import retrofit2.Response;
/* compiled from: UserRepositoryImpl.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/ifriend/domain/models/profile/user/AuthData;", "auth", "Lretrofit2/Response;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.data.repository.UserRepositoryImpl$setBirthday$3", f = "UserRepositoryImpl.kt", i = {}, l = {153}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class UserRepositoryImpl$setBirthday$3 extends SuspendLambda implements Function2<AuthData, Continuation<? super Response<Unit>>, Object> {
    final /* synthetic */ Birthday $birthday;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ UserRepositoryImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserRepositoryImpl$setBirthday$3(UserRepositoryImpl userRepositoryImpl, Birthday birthday, Continuation<? super UserRepositoryImpl$setBirthday$3> continuation) {
        super(2, continuation);
        this.this$0 = userRepositoryImpl;
        this.$birthday = birthday;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        UserRepositoryImpl$setBirthday$3 userRepositoryImpl$setBirthday$3 = new UserRepositoryImpl$setBirthday$3(this.this$0, this.$birthday, continuation);
        userRepositoryImpl$setBirthday$3.L$0 = obj;
        return userRepositoryImpl$setBirthday$3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AuthData authData, Continuation<? super Response<Unit>> continuation) {
        return ((UserRepositoryImpl$setBirthday$3) create(authData, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        UserApi userApi;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            AuthData authData = (AuthData) this.L$0;
            userApi = this.this$0.api;
            this.label = 1;
            obj = userApi.setUserAge(authData.getToken().formatted(), authData.getUserId().getValue(), new SetUserAgeRequest(this.$birthday.getDatetime()), this);
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
