package com.ifriend.analytics.annalsTracker;

import androidx.core.app.NotificationCompat;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AnnalsTrackerAnalyticsSender.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.analytics.annalsTracker.AnnalsTrackerAnalyticsSender", f = "AnnalsTrackerAnalyticsSender.kt", i = {0, 0, 0, 1}, l = {35, 43}, m = "sendEventWithResult", n = {"this", NotificationCompat.CATEGORY_EVENT, FirebaseAnalytics.Param.CONTENT, "this"}, s = {"L$0", "L$1", "L$2", "L$0"})
/* loaded from: classes6.dex */
public final class AnnalsTrackerAnalyticsSender$sendEventWithResult$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AnnalsTrackerAnalyticsSender this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnnalsTrackerAnalyticsSender$sendEventWithResult$1(AnnalsTrackerAnalyticsSender annalsTrackerAnalyticsSender, Continuation<? super AnnalsTrackerAnalyticsSender$sendEventWithResult$1> continuation) {
        super(continuation);
        this.this$0 = annalsTrackerAnalyticsSender;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.sendEventWithResult(null, null, this);
    }
}
