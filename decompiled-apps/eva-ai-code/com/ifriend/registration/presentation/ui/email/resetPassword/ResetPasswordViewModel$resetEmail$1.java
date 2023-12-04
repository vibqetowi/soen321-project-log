package com.ifriend.registration.presentation.ui.email.resetPassword;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: ResetPasswordViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/registration/presentation/ui/email/resetPassword/ResetPasswordState;", "it", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ResetPasswordViewModel$resetEmail$1 extends Lambda implements Function1<ResetPasswordState, ResetPasswordState> {
    public static final ResetPasswordViewModel$resetEmail$1 INSTANCE = new ResetPasswordViewModel$resetEmail$1();

    ResetPasswordViewModel$resetEmail$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final ResetPasswordState invoke(ResetPasswordState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return ResetPasswordState.copy$default(it, null, false, true, 3, null);
    }
}
