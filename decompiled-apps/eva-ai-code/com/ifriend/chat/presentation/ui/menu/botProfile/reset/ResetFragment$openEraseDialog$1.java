package com.ifriend.chat.presentation.ui.menu.botProfile.reset;

import com.ifriend.chat.domain.chat.reset.ResetAiPeriod;
import com.ifriend.ui.base.dialog.bottomDialog.BottomDialog;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ResetFragment.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ResetFragment$openEraseDialog$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ ResetAiPeriod $period;
    final /* synthetic */ ResetFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResetFragment$openEraseDialog$1(ResetFragment resetFragment, ResetAiPeriod resetAiPeriod) {
        super(0);
        this.this$0 = resetFragment;
        this.$period = resetAiPeriod;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        BottomDialog bottomDialog;
        bottomDialog = this.this$0.bottomDialog;
        if (bottomDialog != null) {
            bottomDialog.cancel();
        }
        this.this$0.confirmErase(this.$period);
    }
}
