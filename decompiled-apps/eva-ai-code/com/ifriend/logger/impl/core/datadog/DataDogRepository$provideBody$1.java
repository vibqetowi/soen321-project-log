package com.ifriend.logger.impl.core.datadog;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ifriend.domain.config.ConfigKeys;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DataDogRepository.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.logger.impl.core.datadog.DataDogRepository", f = "DataDogRepository.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1}, l = {47, ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_TOP_OF}, m = "provideBody", n = {"this", "payload", FirebaseAnalytics.Param.LEVEL, "service", "this", "payload", FirebaseAnalytics.Param.LEVEL, "service", "userId", "productVersion", ConfigKeys.CURRENT_DEVICE}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6"})
/* loaded from: classes6.dex */
public final class DataDogRepository$provideBody$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DataDogRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataDogRepository$provideBody$1(DataDogRepository dataDogRepository, Continuation<? super DataDogRepository$provideBody$1> continuation) {
        super(continuation);
        this.this$0 = dataDogRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object provideBody;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        provideBody = this.this$0.provideBody(null, null, null, this);
        return provideBody;
    }
}
