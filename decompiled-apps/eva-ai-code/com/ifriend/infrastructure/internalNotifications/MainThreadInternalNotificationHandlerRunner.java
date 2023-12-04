package com.ifriend.infrastructure.internalNotifications;

import android.os.Handler;
import android.os.Looper;
import com.ifriend.internal_notifications.handler.runner.InternalNotificationHandlerRunner;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: MainThreadInternalNotificationHandlerRunner.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ifriend/infrastructure/internalNotifications/MainThreadInternalNotificationHandlerRunner;", "Lcom/ifriend/internal_notifications/handler/runner/InternalNotificationHandlerRunner;", "()V", "mainThreadHandler", "Landroid/os/Handler;", "run", "", "handlingWork", "Lkotlin/Function0;", "infrastructure_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MainThreadInternalNotificationHandlerRunner implements InternalNotificationHandlerRunner {
    private final Handler mainThreadHandler = new Handler(Looper.getMainLooper());

    /* JADX INFO: Access modifiers changed from: private */
    public static final void run$lambda$0(Function0 handlingWork) {
        Intrinsics.checkNotNullParameter(handlingWork, "$handlingWork");
        handlingWork.invoke();
    }

    @Override // com.ifriend.internal_notifications.handler.runner.InternalNotificationHandlerRunner
    public void run(final Function0<Unit> handlingWork) {
        Intrinsics.checkNotNullParameter(handlingWork, "handlingWork");
        this.mainThreadHandler.post(new Runnable() { // from class: com.ifriend.infrastructure.internalNotifications.MainThreadInternalNotificationHandlerRunner$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                MainThreadInternalNotificationHandlerRunner.run$lambda$0(Function0.this);
            }
        });
    }
}
