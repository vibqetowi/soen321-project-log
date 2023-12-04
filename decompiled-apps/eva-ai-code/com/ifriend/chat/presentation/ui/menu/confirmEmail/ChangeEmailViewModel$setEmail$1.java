package com.ifriend.chat.presentation.ui.menu.confirmEmail;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: ChangeEmailViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/chat/presentation/ui/menu/confirmEmail/ChangeEmailState;", "it", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ChangeEmailViewModel$setEmail$1 extends Lambda implements Function1<ChangeEmailState, ChangeEmailState> {
    final /* synthetic */ String $email;
    final /* synthetic */ ChangeEmailViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChangeEmailViewModel$setEmail$1(ChangeEmailViewModel changeEmailViewModel, String str) {
        super(1);
        this.this$0 = changeEmailViewModel;
        this.$email = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final ChangeEmailState invoke(ChangeEmailState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return this.this$0.currentState().copy(this.$email, null);
    }
}
