package com.ifriend.registration.presentation.ui.email;

import com.ifriend.registration.presentation.databinding.FragmentEmailRegistrationBinding;
import com.ifriend.ui.button.AppButton;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: EmailRegistrationFragment.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class EmailRegistrationFragment$init$1 extends Lambda implements Function1<Boolean, Unit> {
    final /* synthetic */ EmailRegistrationFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmailRegistrationFragment$init$1(EmailRegistrationFragment emailRegistrationFragment) {
        super(1);
        this.this$0 = emailRegistrationFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke2(bool);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Boolean bool) {
        FragmentEmailRegistrationBinding binding;
        binding = this.this$0.getBinding();
        AppButton appButton = binding.next;
        Intrinsics.checkNotNull(bool);
        appButton.setActive(bool.booleanValue());
    }
}
