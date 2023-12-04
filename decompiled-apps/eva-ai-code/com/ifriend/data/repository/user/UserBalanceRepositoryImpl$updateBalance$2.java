package com.ifriend.data.repository.user;

import com.ifriend.common_utils.extensions.ommonKt;
import com.ifriend.core.local.api.AuthLocalDataSource;
import com.ifriend.core.remote.datasources.user.UserNeuronesBalanceRemote;
import com.ifriend.core.remote.services.UserApiService;
import com.ifriend.domain.logic.balance.UserBalance;
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
/* compiled from: UserBalanceRepositoryImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.data.repository.user.UserBalanceRepositoryImpl$updateBalance$2", f = "UserBalanceRepositoryImpl.kt", i = {}, l = {40, 39}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class UserBalanceRepositoryImpl$updateBalance$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ UserBalanceRepositoryImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserBalanceRepositoryImpl$updateBalance$2(UserBalanceRepositoryImpl userBalanceRepositoryImpl, Continuation<? super UserBalanceRepositoryImpl$updateBalance$2> continuation) {
        super(2, continuation);
        this.this$0 = userBalanceRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UserBalanceRepositoryImpl$updateBalance$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((UserBalanceRepositoryImpl$updateBalance$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        UserApiService userApiService;
        AuthLocalDataSource authLocalDataSource;
        UserNeuronesBalanceRemote userNeuronesBalanceRemote;
        MutableStateFlow mutableStateFlow;
        Object value;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            userApiService = this.this$0.userApiService;
            authLocalDataSource = this.this$0.authLocalDataSource;
            this.L$0 = userApiService;
            this.label = 1;
            obj = authLocalDataSource.getUserId(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i != 1) {
            if (i == 2) {
                ResultKt.throwOnFailure(obj);
                userNeuronesBalanceRemote = (UserNeuronesBalanceRemote) obj;
                mutableStateFlow = this.this$0.state;
                do {
                    value = mutableStateFlow.getValue();
                } while (!mutableStateFlow.compareAndSet(value, ((UserBalance) value).copy(ommonKt.orZero(userNeuronesBalanceRemote.getBalance()))));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            userApiService = (UserApiService) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        String str = (String) obj;
        if (str == null) {
            str = "";
        }
        this.L$0 = null;
        this.label = 2;
        obj = userApiService.getNeuronesBalance(str, this);
        if (obj == coroutine_suspended) {
            return coroutine_suspended;
        }
        userNeuronesBalanceRemote = (UserNeuronesBalanceRemote) obj;
        mutableStateFlow = this.this$0.state;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, ((UserBalance) value).copy(ommonKt.orZero(userNeuronesBalanceRemote.getBalance()))));
        return Unit.INSTANCE;
    }
}
