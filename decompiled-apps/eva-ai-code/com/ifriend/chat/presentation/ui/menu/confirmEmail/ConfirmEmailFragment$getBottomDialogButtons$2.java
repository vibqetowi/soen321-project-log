package com.ifriend.chat.presentation.ui.menu.confirmEmail;

import com.ifriend.ui.base.dialog.bottomDialog.BottomDialog;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ConfirmEmailFragment.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ConfirmEmailFragment$getBottomDialogButtons$2 extends Lambda implements Function0<Unit> {
    final /* synthetic */ BottomDialog $this_getBottomDialogButtons;
    final /* synthetic */ ConfirmEmailFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfirmEmailFragment$getBottomDialogButtons$2(ConfirmEmailFragment confirmEmailFragment, BottomDialog bottomDialog) {
        super(0);
        this.this$0 = confirmEmailFragment;
        this.$this_getBottomDialogButtons = bottomDialog;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.this$0.changeEmail();
        this.$this_getBottomDialogButtons.dismiss();
    }
}
