package com.ifriend.registration.presentation.ui.email;

import android.os.Bundle;
import com.ifriend.registration.presentation.databinding.FragmentEmailRegistrationBinding;
import com.ifriend.registration.presentation.ui.email.resetPassword.ResetPasswordFragmentKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: EmailRegistrationFragment.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "", "bundle", "Landroid/os/Bundle;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class EmailRegistrationFragment$init$3 extends Lambda implements Function2<String, Bundle, Unit> {
    final /* synthetic */ EmailRegistrationFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmailRegistrationFragment$init$3(EmailRegistrationFragment emailRegistrationFragment) {
        super(2);
        this.this$0 = emailRegistrationFragment;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(String str, Bundle bundle) {
        invoke2(str, bundle);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(String str, Bundle bundle) {
        FragmentEmailRegistrationBinding binding;
        FragmentEmailRegistrationBinding binding2;
        Intrinsics.checkNotNullParameter(str, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        String string = bundle.getString(ResetPasswordFragmentKt.RESET_EMAIL_KEY);
        if (string != null) {
            EmailRegistrationFragment emailRegistrationFragment = this.this$0;
            binding = emailRegistrationFragment.getBinding();
            binding.email.setText(string);
            binding2 = emailRegistrationFragment.getBinding();
            binding2.password.setText("");
        }
    }
}
