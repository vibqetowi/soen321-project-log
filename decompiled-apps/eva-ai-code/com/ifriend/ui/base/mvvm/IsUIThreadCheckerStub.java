package com.ifriend.ui.base.mvvm;

import kotlin.Metadata;
/* compiled from: IsUIThreadChecker.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\b\u001a\u00020\u0004H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/ifriend/ui/base/mvvm/IsUIThreadCheckerStub;", "Lcom/ifriend/ui/base/mvvm/IsUIThreadChecker;", "()V", "isUI", "", "()Z", "setUI", "(Z)V", "isUIThread", "common_ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class IsUIThreadCheckerStub implements IsUIThreadChecker {
    public static final int $stable = 8;
    private boolean isUI = true;

    public final boolean isUI() {
        return this.isUI;
    }

    public final void setUI(boolean z) {
        this.isUI = z;
    }

    @Override // com.ifriend.ui.base.mvvm.IsUIThreadChecker
    public boolean isUIThread() {
        return this.isUI;
    }
}
