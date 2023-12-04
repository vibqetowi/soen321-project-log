package com.ifriend.chat.presentation.ui.menu.confirmEmail;

import com.ifriend.presentation.features.profile.confirmemail.ConfirmEmailViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
/* compiled from: ConfirmEmailFragment.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
/* synthetic */ class ConfirmEmailFragment$getBottomDialogButtons$1 extends FunctionReferenceImpl implements Function0<Unit> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public ConfirmEmailFragment$getBottomDialogButtons$1(Object obj) {
        super(0, obj, ConfirmEmailViewModel.class, "resendEmail", "resendEmail()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((ConfirmEmailViewModel) this.receiver).resendEmail();
    }
}
