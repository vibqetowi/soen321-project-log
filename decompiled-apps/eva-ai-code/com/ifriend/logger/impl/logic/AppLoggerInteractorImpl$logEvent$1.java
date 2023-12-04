package com.ifriend.logger.impl.logic;

import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AppLoggerInteractorImpl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.logger.impl.logic.AppLoggerInteractorImpl", f = "AppLoggerInteractorImpl.kt", i = {0, 0, 0, 1, 1, 1}, l = {29, 30}, m = "logEvent", n = {"this", NotificationCompat.CATEGORY_EVENT, "isHandleError", "this", NotificationCompat.CATEGORY_EVENT, "isHandleError"}, s = {"L$0", "L$1", "Z$0", "L$0", "L$1", "Z$0"})
/* loaded from: classes6.dex */
public final class AppLoggerInteractorImpl$logEvent$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AppLoggerInteractorImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppLoggerInteractorImpl$logEvent$1(AppLoggerInteractorImpl appLoggerInteractorImpl, Continuation<? super AppLoggerInteractorImpl$logEvent$1> continuation) {
        super(continuation);
        this.this$0 = appLoggerInteractorImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.logEvent(null, false, this);
    }
}
