package com.ifriend.registration.presentation.ui.email.resetPassword;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ResetPasswordViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/registration/presentation/ui/email/resetPassword/ResetPasswordState;", "it", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ResetPasswordViewModel$changeEmail$1 extends Lambda implements Function1<ResetPasswordState, ResetPasswordState> {
    final /* synthetic */ String $email;
    final /* synthetic */ ResetPasswordViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResetPasswordViewModel$changeEmail$1(ResetPasswordViewModel resetPasswordViewModel, String str) {
        super(1);
        this.this$0 = resetPasswordViewModel;
        this.$email = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final ResetPasswordState invoke(ResetPasswordState it) {
        boolean checkIsEmailValid;
        Intrinsics.checkNotNullParameter(it, "it");
        ResetPasswordState currentState = this.this$0.currentState();
        String str = this.$email;
        checkIsEmailValid = this.this$0.checkIsEmailValid(str);
        return ResetPasswordState.copy$default(currentState, str, checkIsEmailValid, false, 4, null);
    }
}
