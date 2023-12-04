package com.ifriend.data.repository.experiments;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FeatureTogglePayloadsRepositoryImpl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.data.repository.experiments.FeatureTogglePayloadsRepositoryImpl", f = "FeatureTogglePayloadsRepositoryImpl.kt", i = {0}, l = {28}, m = "getChatIdsPayload", n = {"this"}, s = {"L$0"})
/* loaded from: classes6.dex */
public final class FeatureTogglePayloadsRepositoryImpl$getChatIdsPayload$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FeatureTogglePayloadsRepositoryImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeatureTogglePayloadsRepositoryImpl$getChatIdsPayload$1(FeatureTogglePayloadsRepositoryImpl featureTogglePayloadsRepositoryImpl, Continuation<? super FeatureTogglePayloadsRepositoryImpl$getChatIdsPayload$1> continuation) {
        super(continuation);
        this.this$0 = featureTogglePayloadsRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object chatIdsPayload;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        chatIdsPayload = this.this$0.getChatIdsPayload(null, this);
        return chatIdsPayload;
    }
}
