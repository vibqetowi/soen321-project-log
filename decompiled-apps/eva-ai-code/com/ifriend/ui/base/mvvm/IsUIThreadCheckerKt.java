package com.ifriend.ui.base.mvvm;

import kotlin.Metadata;
/* compiled from: IsUIThreadChecker.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u001a\u0006\u0010\u0002\u001a\u00020\u0003\u001a\b\u0010\u0004\u001a\u00020\u0005H\u0007\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"checker", "Lcom/ifriend/ui/base/mvvm/IsUIThreadChecker;", "isUIThread", "", "stubChecker", "", "common_ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class IsUIThreadCheckerKt {
    private static IsUIThreadChecker checker = new IsUIThreadCheckerAndroid();

    public static final void stubChecker() {
        checker = new IsUIThreadCheckerStub();
    }

    public static final boolean isUIThread() {
        return checker.isUIThread();
    }
}
