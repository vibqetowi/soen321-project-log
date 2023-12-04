package com.ifriend.data.repository.user;

import androidx.exifinterface.media.ExifInterface;
import com.facebook.internal.NativeProtocol;
import com.ifriend.core.local.api.AuthLocalDataSource;
import com.ifriend.core.remote.services.UserApiService;
import com.ifriend.data.common.CoreExecuteCatching;
import com.ifriend.domain.data.user.UserBalanceRepository;
import com.ifriend.domain.logic.balance.UserBalance;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
/* compiled from: UserBalanceRepositoryImpl.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0011\u0010\f\u001a\u00020\rH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u000eJ%\u0010\u000f\u001a\u0002H\u0010\"\u0004\b\u0000\u0010\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00100\u0012H\u0096Aø\u0001\u0000¢\u0006\u0002\u0010\u0013J@\u0010\u000f\u001a\u0002H\u0010\"\u0004\b\u0000\u0010\u00102'\u0010\u0011\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00100\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u0014¢\u0006\u0002\b\u0018H\u0096Aø\u0001\u0000¢\u0006\u0002\u0010\u0019J\u0011\u0010\u001a\u001a\u00020\u000bH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u000eJ\u000e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016J\u0011\u0010\u001c\u001a\u00020\rH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u000eJ\u0019\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u001fH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010 R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006!"}, d2 = {"Lcom/ifriend/data/repository/user/UserBalanceRepositoryImpl;", "Lcom/ifriend/domain/data/user/UserBalanceRepository;", "Lcom/ifriend/data/common/CoreExecuteCatching;", "userApiService", "Lcom/ifriend/core/remote/services/UserApiService;", "coreExecuteCatching", "authLocalDataSource", "Lcom/ifriend/core/local/api/AuthLocalDataSource;", "(Lcom/ifriend/core/remote/services/UserApiService;Lcom/ifriend/data/common/CoreExecuteCatching;Lcom/ifriend/core/local/api/AuthLocalDataSource;)V", "state", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/ifriend/domain/logic/balance/UserBalance;", "clear", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "executeInBackground", ExifInterface.GPS_DIRECTION_TRUE, NativeProtocol.WEB_DIALOG_ACTION, "Lkotlin/reflect/KSuspendFunction0;", "(Lkotlin/reflect/KFunction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getBalance", "getBalanceFlow", "updateBalance", "updateNeurones", "neurons", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UserBalanceRepositoryImpl implements UserBalanceRepository, CoreExecuteCatching {
    private final AuthLocalDataSource authLocalDataSource;
    private final CoreExecuteCatching coreExecuteCatching;
    private final MutableStateFlow<UserBalance> state;
    private final UserApiService userApiService;

    @Override // com.ifriend.data.common.CoreExecuteCatching
    public <T> Object executeInBackground(Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super T> continuation) {
        return this.coreExecuteCatching.executeInBackground(function2, continuation);
    }

    @Override // com.ifriend.data.common.CoreExecuteCatching
    public <T> Object executeInBackground(KFunction<? extends T> kFunction, Continuation<? super T> continuation) {
        return this.coreExecuteCatching.executeInBackground(kFunction, continuation);
    }

    @Inject
    public UserBalanceRepositoryImpl(UserApiService userApiService, CoreExecuteCatching coreExecuteCatching, AuthLocalDataSource authLocalDataSource) {
        Intrinsics.checkNotNullParameter(userApiService, "userApiService");
        Intrinsics.checkNotNullParameter(coreExecuteCatching, "coreExecuteCatching");
        Intrinsics.checkNotNullParameter(authLocalDataSource, "authLocalDataSource");
        this.userApiService = userApiService;
        this.coreExecuteCatching = coreExecuteCatching;
        this.authLocalDataSource = authLocalDataSource;
        this.state = StateFlowKt.MutableStateFlow(new UserBalance(0));
    }

    @Override // com.ifriend.domain.data.user.UserBalanceRepository
    public MutableStateFlow<UserBalance> getBalanceFlow() {
        return this.state;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0044 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0045  */
    @Override // com.ifriend.domain.data.user.UserBalanceRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getBalance(Continuation<? super UserBalance> continuation) {
        UserBalanceRepositoryImpl$getBalance$1 userBalanceRepositoryImpl$getBalance$1;
        Object obj;
        int i;
        if (continuation instanceof UserBalanceRepositoryImpl$getBalance$1) {
            userBalanceRepositoryImpl$getBalance$1 = (UserBalanceRepositoryImpl$getBalance$1) continuation;
            if ((userBalanceRepositoryImpl$getBalance$1.label & Integer.MIN_VALUE) != 0) {
                userBalanceRepositoryImpl$getBalance$1.label -= Integer.MIN_VALUE;
                obj = userBalanceRepositoryImpl$getBalance$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = userBalanceRepositoryImpl$getBalance$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    userBalanceRepositoryImpl$getBalance$1.label = 1;
                    obj = FlowKt.firstOrNull(this.state, userBalanceRepositoryImpl$getBalance$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ResultKt.throwOnFailure(obj);
                }
                if (obj == null) {
                    return obj;
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        }
        userBalanceRepositoryImpl$getBalance$1 = new UserBalanceRepositoryImpl$getBalance$1(this, continuation);
        obj = userBalanceRepositoryImpl$getBalance$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = userBalanceRepositoryImpl$getBalance$1.label;
        if (i != 0) {
        }
        if (obj == null) {
        }
    }

    @Override // com.ifriend.domain.data.user.UserBalanceRepository
    public Object updateNeurones(int i, Continuation<? super Unit> continuation) {
        UserBalance value;
        MutableStateFlow<UserBalance> mutableStateFlow = this.state;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, value.copy(i)));
        return Unit.INSTANCE;
    }

    @Override // com.ifriend.domain.data.user.UserBalanceRepository
    public Object updateBalance(Continuation<? super Unit> continuation) {
        Object executeInBackground = executeInBackground(new UserBalanceRepositoryImpl$updateBalance$2(this, null), continuation);
        return executeInBackground == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? executeInBackground : Unit.INSTANCE;
    }

    @Override // com.ifriend.domain.data.user.UserBalanceRepository
    public Object clear(Continuation<? super Unit> continuation) {
        UserBalance value;
        MutableStateFlow<UserBalance> mutableStateFlow = this.state;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, value.copy(0)));
        return Unit.INSTANCE;
    }
}
