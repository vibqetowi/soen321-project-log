package com.ifriend.chat.presentation.ui.menu.userProfile;

import com.ifriend.chat.domain.profile.user.DeleteUserUseCase;
import com.ifriend.icon_switcher.PremiumAppIconManager;
import com.ifriend.presentation.common.observers.appevents.AppEvents;
import com.ifriend.presentation.common.observers.appevents.AppEventsEmitter;
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
/* compiled from: UserProfileDeleteViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.chat.presentation.ui.menu.userProfile.UserProfileDeleteViewModel$deleteAccount$1", f = "UserProfileDeleteViewModel.kt", i = {}, l = {LockFreeTaskQueueCore.FROZEN_SHIFT}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class UserProfileDeleteViewModel$deleteAccount$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ UserProfileDeleteViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserProfileDeleteViewModel$deleteAccount$1(UserProfileDeleteViewModel userProfileDeleteViewModel, Continuation<? super UserProfileDeleteViewModel$deleteAccount$1> continuation) {
        super(2, continuation);
        this.this$0 = userProfileDeleteViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UserProfileDeleteViewModel$deleteAccount$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((UserProfileDeleteViewModel$deleteAccount$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        PremiumAppIconManager premiumAppIconManager;
        DeleteUserUseCase deleteUserUseCase;
        AppEventsEmitter appEventsEmitter;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            premiumAppIconManager = this.this$0.premiumAppIconManager;
            premiumAppIconManager.disablePremiumIcon();
            deleteUserUseCase = this.this$0.deleteUserUseCase;
            this.label = 1;
            if (deleteUserUseCase.invoke(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
        }
        appEventsEmitter = this.this$0.appEventsEmitter;
        appEventsEmitter.emit(new AppEvents.LogOut(true));
        return Unit.INSTANCE;
    }
}
