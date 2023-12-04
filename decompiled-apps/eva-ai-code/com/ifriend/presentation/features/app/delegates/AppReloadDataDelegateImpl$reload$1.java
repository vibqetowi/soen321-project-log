package com.ifriend.presentation.features.app.delegates;

import androidx.core.location.LocationRequestCompat;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AppReloadDataDelegate.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.presentation.features.app.delegates.AppReloadDataDelegateImpl", f = "AppReloadDataDelegate.kt", i = {0, 1}, l = {102, LocationRequestCompat.QUALITY_LOW_POWER}, m = "reload", n = {"this", "this"}, s = {"L$0", "L$0"})
/* loaded from: classes6.dex */
public final class AppReloadDataDelegateImpl$reload$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AppReloadDataDelegateImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppReloadDataDelegateImpl$reload$1(AppReloadDataDelegateImpl appReloadDataDelegateImpl, Continuation<? super AppReloadDataDelegateImpl$reload$1> continuation) {
        super(continuation);
        this.this$0 = appReloadDataDelegateImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object reload;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        reload = this.this$0.reload(this);
        return reload;
    }
}
