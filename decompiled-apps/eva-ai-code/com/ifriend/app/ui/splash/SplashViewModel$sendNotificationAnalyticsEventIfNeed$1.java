package com.ifriend.app.ui.splash;

import android.content.Intent;
import com.ifriend.analytics.usecase.notifications.AnalyticsNotificationAppOpenedUseCase;
import com.ifriend.analytics.usecase.notifications.AnalyticsPushNotification;
import com.ifriend.common_utils.Constants;
import com.ifriend.domain.data.chat.ChatsInfoConfigurationRepository;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SplashViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.app.ui.splash.SplashViewModel$sendNotificationAnalyticsEventIfNeed$1", f = "SplashViewModel.kt", i = {}, l = {115}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class SplashViewModel$sendNotificationAnalyticsEventIfNeed$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Intent $intent;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ SplashViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SplashViewModel$sendNotificationAnalyticsEventIfNeed$1(SplashViewModel splashViewModel, Intent intent, Continuation<? super SplashViewModel$sendNotificationAnalyticsEventIfNeed$1> continuation) {
        super(2, continuation);
        this.this$0 = splashViewModel;
        this.$intent = intent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SplashViewModel$sendNotificationAnalyticsEventIfNeed$1(this.this$0, this.$intent, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SplashViewModel$sendNotificationAnalyticsEventIfNeed$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AnalyticsNotificationAppOpenedUseCase analyticsNotificationAppOpenedUseCase;
        ChatsInfoConfigurationRepository chatsInfoConfigurationRepository;
        AnalyticsPushNotification analyticsPushNotification;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            analyticsNotificationAppOpenedUseCase = this.this$0.analyticsNotificationAppOpenedUseCase;
            String stringExtra = this.$intent.getStringExtra(Constants.NOTIFICATION_PAYLOAD);
            if (stringExtra == null) {
                stringExtra = "";
            }
            AnalyticsPushNotification analyticsPushNotification2 = new AnalyticsPushNotification(stringExtra);
            chatsInfoConfigurationRepository = this.this$0.f63hatsInfoConfigurationRepository;
            this.L$0 = analyticsNotificationAppOpenedUseCase;
            this.L$1 = analyticsPushNotification2;
            this.label = 1;
            Object lastActiveChatId = chatsInfoConfigurationRepository.getLastActiveChatId(this);
            if (lastActiveChatId == coroutine_suspended) {
                return coroutine_suspended;
            }
            analyticsPushNotification = analyticsPushNotification2;
            obj = lastActiveChatId;
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            analyticsPushNotification = (AnalyticsPushNotification) this.L$1;
            analyticsNotificationAppOpenedUseCase = (AnalyticsNotificationAppOpenedUseCase) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        analyticsNotificationAppOpenedUseCase.handle(analyticsPushNotification, (String) obj);
        return Unit.INSTANCE;
    }
}
