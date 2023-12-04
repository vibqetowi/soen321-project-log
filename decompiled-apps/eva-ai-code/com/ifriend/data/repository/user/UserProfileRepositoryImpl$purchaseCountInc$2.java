package com.ifriend.data.repository.user;

import com.ifriend.common_utils.Constants;
import com.ifriend.domain.data.Preferences;
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
/* compiled from: UserProfileRepositoryImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.data.repository.user.UserProfileRepositoryImpl$purchaseCountInc$2", f = "UserProfileRepositoryImpl.kt", i = {}, l = {45}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class UserProfileRepositoryImpl$purchaseCountInc$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ UserProfileRepositoryImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserProfileRepositoryImpl$purchaseCountInc$2(UserProfileRepositoryImpl userProfileRepositoryImpl, Continuation<? super UserProfileRepositoryImpl$purchaseCountInc$2> continuation) {
        super(2, continuation);
        this.this$0 = userProfileRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UserProfileRepositoryImpl$purchaseCountInc$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((UserProfileRepositoryImpl$purchaseCountInc$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Preferences preferences;
        String str;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            preferences = this.this$0.preferences;
            this.L$0 = preferences;
            this.L$1 = Constants.PURCHASE_AMOUNT;
            this.label = 1;
            obj = this.this$0.getPurchaseCount(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            str = Constants.PURCHASE_AMOUNT;
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            str = (String) this.L$1;
            preferences = (Preferences) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        preferences.saveIntWithKey(str, Boxing.boxInt(((Number) obj).intValue() + 1));
        return Unit.INSTANCE;
    }
}
