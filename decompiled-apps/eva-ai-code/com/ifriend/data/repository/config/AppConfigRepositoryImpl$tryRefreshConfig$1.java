package com.ifriend.data.repository.config;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AppConfigRepositoryImpl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.data.repository.config.AppConfigRepositoryImpl", f = "AppConfigRepositoryImpl.kt", i = {0, 1, 1}, l = {64, 65, TsExtractor.TS_SYNC_BYTE}, m = "tryRefreshConfig", n = {"$this$tryRefreshConfig_u24lambda_u240", "$this$tryRefreshConfig_u24lambda_u240", "localConfig"}, s = {"L$0", "L$0", "L$1"})
/* loaded from: classes6.dex */
public final class AppConfigRepositoryImpl$tryRefreshConfig$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AppConfigRepositoryImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppConfigRepositoryImpl$tryRefreshConfig$1(AppConfigRepositoryImpl appConfigRepositoryImpl, Continuation<? super AppConfigRepositoryImpl$tryRefreshConfig$1> continuation) {
        super(continuation);
        this.this$0 = appConfigRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.tryRefreshConfig(null, this);
    }
}
