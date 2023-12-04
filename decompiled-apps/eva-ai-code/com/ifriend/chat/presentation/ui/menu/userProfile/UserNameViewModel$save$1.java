package com.ifriend.chat.presentation.ui.menu.userProfile;

import com.ifriend.base.navigation.api.RouterProvider;
import com.ifriend.domain.useCases.user.change.ChangeUserNameUseCase;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: UserNameViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.chat.presentation.ui.menu.userProfile.UserNameViewModel$save$1", f = "UserNameViewModel.kt", i = {}, l = {LockFreeTaskQueueCore.CLOSED_SHIFT}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class UserNameViewModel$save$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ UserNameViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserNameViewModel$save$1(UserNameViewModel userNameViewModel, Continuation<? super UserNameViewModel$save$1> continuation) {
        super(2, continuation);
        this.this$0 = userNameViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UserNameViewModel$save$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((UserNameViewModel$save$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ChangeUserNameUseCase changeUserNameUseCase;
        UserNameViewModel userNameViewModel;
        RouterProvider routerProvider;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            String value = this.this$0.getName().getValue();
            if (value != null) {
                UserNameViewModel userNameViewModel2 = this.this$0;
                changeUserNameUseCase = userNameViewModel2.changeUserNameUseCase;
                this.L$0 = userNameViewModel2;
                this.label = 1;
                if (changeUserNameUseCase.execute(value, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                userNameViewModel = userNameViewModel2;
            }
            return Unit.INSTANCE;
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            userNameViewModel = (UserNameViewModel) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        routerProvider = userNameViewModel.router;
        routerProvider.getRoute().exit();
        return Unit.INSTANCE;
    }
}
