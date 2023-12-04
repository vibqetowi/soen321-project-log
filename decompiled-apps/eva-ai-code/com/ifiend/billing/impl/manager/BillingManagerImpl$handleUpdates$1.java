package com.ifiend.billing.impl.manager;

import androidx.core.location.LocationRequestCompat;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BillingManagerImpl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifiend.billing.impl.manager.BillingManagerImpl", f = "BillingManagerImpl.kt", i = {0, 0, 0, 1, 1, 4, 4}, l = {ModuleDescriptor.MODULE_VERSION, 103, LocationRequestCompat.QUALITY_LOW_POWER, 113, 117, 119}, m = "handleUpdates", n = {"this", "billingResult", BillingManagerImpl.PURCHASES_KEY, "this", "billingResult", "this", BillingManagerImpl.PURCHASES_KEY}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$0", "L$1"})
/* loaded from: classes6.dex */
public final class BillingManagerImpl$handleUpdates$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BillingManagerImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BillingManagerImpl$handleUpdates$1(BillingManagerImpl billingManagerImpl, Continuation<? super BillingManagerImpl$handleUpdates$1> continuation) {
        super(continuation);
        this.this$0 = billingManagerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object handleUpdates;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        handleUpdates = this.this$0.handleUpdates(null, null, this);
        return handleUpdates;
    }
}
