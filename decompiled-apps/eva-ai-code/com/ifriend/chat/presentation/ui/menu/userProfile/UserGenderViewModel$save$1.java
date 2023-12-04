package com.ifriend.chat.presentation.ui.menu.userProfile;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.ifriend.base.navigation.api.RouterProvider;
import com.ifriend.domain.useCases.user.change.ChangeUserGenderUseCase;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: UserGenderViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.chat.presentation.ui.menu.userProfile.UserGenderViewModel$save$1", f = "UserGenderViewModel.kt", i = {}, l = {ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class UserGenderViewModel$save$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ UserGenderViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserGenderViewModel$save$1(UserGenderViewModel userGenderViewModel, Continuation<? super UserGenderViewModel$save$1> continuation) {
        super(2, continuation);
        this.this$0 = userGenderViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UserGenderViewModel$save$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((UserGenderViewModel$save$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ChangeUserGenderUseCase changeUserGenderUseCase;
        RouterProvider routerProvider;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            changeUserGenderUseCase = this.this$0.changeUserGenderUseCase;
            this.label = 1;
            if (changeUserGenderUseCase.change(this.this$0.getCurrentGender().getValue(), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
        }
        routerProvider = this.this$0.router;
        routerProvider.getRoute().exit();
        return Unit.INSTANCE;
    }
}
