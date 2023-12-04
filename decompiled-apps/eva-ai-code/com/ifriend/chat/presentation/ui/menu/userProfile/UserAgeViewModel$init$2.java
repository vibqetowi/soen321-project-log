package com.ifriend.chat.presentation.ui.menu.userProfile;

import com.ifriend.domain.useCases.AppConfigUseCase;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: UserAgeViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.chat.presentation.ui.menu.userProfile.UserAgeViewModel$init$2", f = "UserAgeViewModel.kt", i = {}, l = {41, 41, 42, 42}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class UserAgeViewModel$init$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ UserAgeViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserAgeViewModel$init$2(UserAgeViewModel userAgeViewModel, Continuation<? super UserAgeViewModel$init$2> continuation) {
        super(2, continuation);
        this.this$0 = userAgeViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UserAgeViewModel$init$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((UserAgeViewModel$init$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x008e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ac A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        MutableStateFlow<Integer> minAge;
        AppConfigUseCase appConfigUseCase;
        MutableStateFlow<Integer> maxAge;
        AppConfigUseCase appConfigUseCase2;
        long longValue;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            minAge = this.this$0.getMinAge();
            appConfigUseCase = this.this$0.appConfigUseCase;
            this.L$0 = minAge;
            this.label = 1;
            obj = appConfigUseCase.getLongValue("user_min_age", this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                maxAge = (MutableStateFlow) this.L$0;
                ResultKt.throwOnFailure(obj);
                Long l = (Long) obj;
                longValue = l != null ? l.longValue() : 99L;
                this.L$0 = null;
                this.label = 4;
                if (maxAge.emit(Boxing.boxInt((int) longValue), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            maxAge = this.this$0.getMaxAge();
            appConfigUseCase2 = this.this$0.appConfigUseCase;
            this.L$0 = maxAge;
            this.label = 3;
            obj = appConfigUseCase2.getLongValue("user_max_age", this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            Long l2 = (Long) obj;
            if (l2 != null) {
            }
            this.L$0 = null;
            this.label = 4;
            if (maxAge.emit(Boxing.boxInt((int) longValue), this) == coroutine_suspended) {
            }
            return Unit.INSTANCE;
        } else {
            minAge = (MutableStateFlow) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        Long l3 = (Long) obj;
        long longValue2 = l3 != null ? l3.longValue() : 0L;
        this.L$0 = null;
        this.label = 2;
        if (minAge.emit(Boxing.boxInt((int) longValue2), this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        maxAge = this.this$0.getMaxAge();
        appConfigUseCase2 = this.this$0.appConfigUseCase;
        this.L$0 = maxAge;
        this.label = 3;
        obj = appConfigUseCase2.getLongValue("user_max_age", this);
        if (obj == coroutine_suspended) {
        }
        Long l22 = (Long) obj;
        if (l22 != null) {
        }
        this.L$0 = null;
        this.label = 4;
        if (maxAge.emit(Boxing.boxInt((int) longValue), this) == coroutine_suspended) {
        }
        return Unit.INSTANCE;
    }
}
