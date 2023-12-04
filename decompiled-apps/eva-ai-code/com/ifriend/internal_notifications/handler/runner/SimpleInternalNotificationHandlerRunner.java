package com.ifriend.internal_notifications.handler.runner;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: SimpleInternalNotificationHandlerRunner.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/ifriend/internal_notifications/handler/runner/SimpleInternalNotificationHandlerRunner;", "Lcom/ifriend/internal_notifications/handler/runner/InternalNotificationHandlerRunner;", "()V", "run", "", "handlingWork", "Lkotlin/Function0;", "internal_notifications"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SimpleInternalNotificationHandlerRunner implements InternalNotificationHandlerRunner {
    @Override // com.ifriend.internal_notifications.handler.runner.InternalNotificationHandlerRunner
    public void run(Function0<Unit> handlingWork) {
        Intrinsics.checkNotNullParameter(handlingWork, "handlingWork");
        handlingWork.invoke();
    }
}
