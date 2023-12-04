package com.ifriend.ui.base.mvvm;

import android.os.Looper;
import kotlin.Metadata;
/* compiled from: IsUIThreadChecker.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/ifriend/ui/base/mvvm/IsUIThreadCheckerAndroid;", "Lcom/ifriend/ui/base/mvvm/IsUIThreadChecker;", "()V", "isUIThread", "", "common_ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class IsUIThreadCheckerAndroid implements IsUIThreadChecker {
    public static final int $stable = 0;

    @Override // com.ifriend.ui.base.mvvm.IsUIThreadChecker
    public boolean isUIThread() {
        return Thread.currentThread().getId() == Looper.getMainLooper().getThread().getId();
    }
}
