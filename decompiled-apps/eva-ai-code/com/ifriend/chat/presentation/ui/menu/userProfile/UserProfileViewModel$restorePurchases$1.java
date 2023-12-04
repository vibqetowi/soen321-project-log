package com.ifriend.chat.presentation.ui.menu.userProfile;

import android.os.Handler;
import com.ifriend.ui.base.BaseFragment;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: UserProfileViewModel.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.chat.presentation.ui.menu.userProfile.UserProfileViewModel$restorePurchases$1", f = "UserProfileViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class UserProfileViewModel$restorePurchases$1 extends SuspendLambda implements Function2<Throwable, Continuation<? super Unit>, Object> {
    final /* synthetic */ Handler $handler;
    int label;
    final /* synthetic */ UserProfileViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserProfileViewModel$restorePurchases$1(Handler handler, UserProfileViewModel userProfileViewModel, Continuation<? super UserProfileViewModel$restorePurchases$1> continuation) {
        super(2, continuation);
        this.$handler = handler;
        this.this$0 = userProfileViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UserProfileViewModel$restorePurchases$1(this.$handler, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Throwable th, Continuation<? super Unit> continuation) {
        return ((UserProfileViewModel$restorePurchases$1) create(th, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Handler handler = this.$handler;
        final UserProfileViewModel userProfileViewModel = this.this$0;
        handler.post(new Runnable() { // from class: com.ifriend.chat.presentation.ui.menu.userProfile.UserProfileViewModel$restorePurchases$1$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                UserProfileViewModel$restorePurchases$1.invokeSuspend$lambda$0(UserProfileViewModel.this);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$0(UserProfileViewModel userProfileViewModel) {
        UserProfileFragment fragment = userProfileViewModel.getFragment();
        if (fragment != null) {
            fragment.hideLoading();
        }
        UserProfileFragment fragment2 = userProfileViewModel.getFragment();
        if (fragment2 != null) {
            BaseFragment.showDialog$default(fragment2, "Error", "Purchases are not restored.", null, 4, null);
        }
    }
}
