package com.ifriend.chat.presentation.ui;

import com.ifriend.presentation.features.app.viewmodel.AppViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
/* compiled from: AppActivity.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
/* synthetic */ class AppActivity$onCreate$3$1$1$2 extends FunctionReferenceImpl implements Function0<Unit> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public AppActivity$onCreate$3$1$1$2(Object obj) {
        super(0, obj, AppViewModel.class, "onUpdatePopupDismiss", "onUpdatePopupDismiss()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((AppViewModel) this.receiver).onUpdatePopupDismiss();
    }
}
