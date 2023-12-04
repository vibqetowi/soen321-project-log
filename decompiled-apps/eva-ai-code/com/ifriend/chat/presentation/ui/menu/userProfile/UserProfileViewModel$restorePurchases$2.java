package com.ifriend.chat.presentation.ui.menu.userProfile;

import android.os.Handler;
import com.ifriend.billing.api.models.RestorePurchasesResult;
import com.ifriend.ui.base.BaseFragment;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: UserProfileViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.chat.presentation.ui.menu.userProfile.UserProfileViewModel$restorePurchases$2", f = "UserProfileViewModel.kt", i = {}, l = {128}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class UserProfileViewModel$restorePurchases$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Handler $handler;
    int label;
    final /* synthetic */ UserProfileViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserProfileViewModel$restorePurchases$2(UserProfileViewModel userProfileViewModel, Handler handler, Continuation<? super UserProfileViewModel$restorePurchases$2> continuation) {
        super(2, continuation);
        this.this$0 = userProfileViewModel;
        this.$handler = handler;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UserProfileViewModel$restorePurchases$2(this.this$0, this.$handler, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((UserProfileViewModel$restorePurchases$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            UserProfileFragment fragment = this.this$0.getFragment();
            if (fragment != null) {
                fragment.showLoading();
            }
            this.label = 1;
            obj = this.this$0.restoreBillingPurchases(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
        }
        RestorePurchasesResult restorePurchasesResult = (RestorePurchasesResult) obj;
        if (Intrinsics.areEqual(restorePurchasesResult, RestorePurchasesResult.Successful.INSTANCE)) {
            Handler handler = this.$handler;
            final UserProfileViewModel userProfileViewModel = this.this$0;
            handler.post(new Runnable() { // from class: com.ifriend.chat.presentation.ui.menu.userProfile.UserProfileViewModel$restorePurchases$2$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    UserProfileViewModel$restorePurchases$2.invokeSuspend$lambda$0(UserProfileViewModel.this);
                }
            });
        } else if (Intrinsics.areEqual(restorePurchasesResult, RestorePurchasesResult.NoPurchases.INSTANCE)) {
            Handler handler2 = this.$handler;
            final UserProfileViewModel userProfileViewModel2 = this.this$0;
            handler2.post(new Runnable() { // from class: com.ifriend.chat.presentation.ui.menu.userProfile.UserProfileViewModel$restorePurchases$2$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    UserProfileViewModel$restorePurchases$2.invokeSuspend$lambda$1(UserProfileViewModel.this);
                }
            });
        }
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
            BaseFragment.showDialog$default(fragment2, "Success", "Purchases are restored.", null, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$1(UserProfileViewModel userProfileViewModel) {
        UserProfileFragment fragment = userProfileViewModel.getFragment();
        if (fragment != null) {
            fragment.hideLoading();
        }
        UserProfileFragment fragment2 = userProfileViewModel.getFragment();
        if (fragment2 != null) {
            BaseFragment.showDialog$default(fragment2, "Error", "There are not purchases to restore.", null, 4, null);
        }
    }
}
