package com.ifriend.analytics.usecase.auth;

import com.ifriend.analytics.AnalyticsConstants;
import com.ifriend.analytics.annalsTracker.AnnalsTrackerAnalyticsSender;
import com.ifriend.domain.data.Preferences;
import com.ifriend.domain.data.install.AppInstallStorage;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AuthScreenOpenedAnalytics.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.analytics.usecase.auth.AuthScreenOpenedAnalytics$send$1", f = "AuthScreenOpenedAnalytics.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class AuthScreenOpenedAnalytics$send$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Map<String, String> $expParamsToSend;
    final /* synthetic */ AnnalsTrackerAnalyticsSender $sender;
    int label;
    final /* synthetic */ AuthScreenOpenedAnalytics this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthScreenOpenedAnalytics$send$1(AnnalsTrackerAnalyticsSender annalsTrackerAnalyticsSender, AuthScreenOpenedAnalytics authScreenOpenedAnalytics, Map<String, String> map, Continuation<? super AuthScreenOpenedAnalytics$send$1> continuation) {
        super(2, continuation);
        this.$sender = annalsTrackerAnalyticsSender;
        this.this$0 = authScreenOpenedAnalytics;
        this.$expParamsToSend = map;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AuthScreenOpenedAnalytics$send$1(this.$sender, this.this$0, this.$expParamsToSend, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AuthScreenOpenedAnalytics$send$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AppInstallStorage appInstallStorage;
        AppInstallStorage appInstallStorage2;
        Preferences preferences;
        Preferences preferences2;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        AnnalsTrackerAnalyticsSender annalsTrackerAnalyticsSender = this.$sender;
        appInstallStorage = this.this$0.appInstallStorage;
        appInstallStorage2 = this.this$0.appInstallStorage;
        annalsTrackerAnalyticsSender.sendEvent("auth-opened", MapsKt.plus(MapsKt.mapOf(AnalyticsConstants.INSTANCE.getTimestamp(), TuplesKt.to(AnalyticsConstants.UUID, appInstallStorage.getUUID()), TuplesKt.to("has_been_authorized", Boxing.boxBoolean(appInstallStorage2.isUserHasBeenAuthorized()))), this.$expParamsToSend));
        preferences = this.this$0.preferences;
        preferences.addValuesToStringSetWithKey("sent_auth_finished_exp_params", this.$expParamsToSend.keySet());
        preferences2 = this.this$0.preferences;
        preferences2.saveBooleanWithKey("is_sent_auth_opened", Boxing.boxBoolean(true));
        return Unit.INSTANCE;
    }
}
