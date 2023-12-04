package com.facebook.login;

import androidx.activity.result.ActivityResult;
import androidx.fragment.app.FragmentActivity;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: LoginFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroidx/activity/result/ActivityResult;", "result", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes2.dex */
final class LoginFragment$getLoginMethodHandlerCallback$1 extends Lambda implements Function1<ActivityResult, Unit> {
    final /* synthetic */ FragmentActivity $activity;
    final /* synthetic */ LoginFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoginFragment$getLoginMethodHandlerCallback$1(LoginFragment loginFragment, FragmentActivity fragmentActivity) {
        super(1);
        this.this$0 = loginFragment;
        this.$activity = fragmentActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ActivityResult activityResult) {
        invoke2(activityResult);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(ActivityResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        if (result.getResultCode() == -1) {
            this.this$0.getLoginClient().onActivityResult(LoginClient.Companion.getLoginRequestCode(), result.getResultCode(), result.getData());
        } else {
            this.$activity.finish();
        }
    }
}
