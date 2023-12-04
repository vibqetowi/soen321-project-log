package com.ifriend.data.storages.config;

import com.ifriend.domain.config.PrimitiveValue;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AppConfigLocalDataSource.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.data.storages.config.AppConfigLocalDataSourceImpl", f = "AppConfigLocalDataSource.kt", i = {}, l = {82}, m = "get", n = {}, s = {})
/* loaded from: classes6.dex */
public final class AppConfigLocalDataSourceImpl$get$1<T extends PrimitiveValue> extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AppConfigLocalDataSourceImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppConfigLocalDataSourceImpl$get$1(AppConfigLocalDataSourceImpl appConfigLocalDataSourceImpl, Continuation<? super AppConfigLocalDataSourceImpl$get$1> continuation) {
        super(continuation);
        this.this$0 = appConfigLocalDataSourceImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        obj2 = this.this$0.get(null, this);
        return obj2;
    }
}
