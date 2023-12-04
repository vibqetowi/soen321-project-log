package com.ifriend.data.repository.benefits;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PremiumBenefitsRepositoryImpl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.data.repository.benefits.PremiumBenefitsRepositoryImpl", f = "PremiumBenefitsRepositoryImpl.kt", i = {0, 0}, l = {85}, m = "addBenefitIfFeatureEnabled", n = {"$this$addBenefitIfFeatureEnabled", "benefit"}, s = {"L$0", "L$1"})
/* loaded from: classes6.dex */
public final class PremiumBenefitsRepositoryImpl$addBenefitIfFeatureEnabled$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PremiumBenefitsRepositoryImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PremiumBenefitsRepositoryImpl$addBenefitIfFeatureEnabled$1(PremiumBenefitsRepositoryImpl premiumBenefitsRepositoryImpl, Continuation<? super PremiumBenefitsRepositoryImpl$addBenefitIfFeatureEnabled$1> continuation) {
        super(continuation);
        this.this$0 = premiumBenefitsRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object addBenefitIfFeatureEnabled;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        addBenefitIfFeatureEnabled = this.this$0.addBenefitIfFeatureEnabled(null, null, null, this);
        return addBenefitIfFeatureEnabled;
    }
}
