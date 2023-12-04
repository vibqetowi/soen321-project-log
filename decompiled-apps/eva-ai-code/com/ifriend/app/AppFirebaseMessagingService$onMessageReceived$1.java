package com.ifriend.app;

import com.google.firebase.messaging.RemoteMessage;
import com.ifriend.analytics.usecase.notifications.AnalyticsNotificationReceivedUseCase;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: AppFirebaseMessagingService.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.app.AppFirebaseMessagingService$onMessageReceived$1", f = "AppFirebaseMessagingService.kt", i = {}, l = {124}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class AppFirebaseMessagingService$onMessageReceived$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $appInBackground;
    final /* synthetic */ RemoteMessage $message;
    int label;
    final /* synthetic */ AppFirebaseMessagingService this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppFirebaseMessagingService$onMessageReceived$1(AppFirebaseMessagingService appFirebaseMessagingService, boolean z, RemoteMessage remoteMessage, Continuation<? super AppFirebaseMessagingService$onMessageReceived$1> continuation) {
        super(2, continuation);
        this.this$0 = appFirebaseMessagingService;
        this.$appInBackground = z;
        this.$message = remoteMessage;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AppFirebaseMessagingService$onMessageReceived$1(this.this$0, this.$appInBackground, this.$message, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AppFirebaseMessagingService$onMessageReceived$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            obj = this.this$0.getChatsInfoConfigurationRepository().getLastActiveChatId(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
        }
        this.this$0.getAnalyticsNotificationReceivedUseCase().handle(AnalyticsNotificationReceivedUseCase.NotificationResult.SUCCESS, this.$appInBackground, this.$message, (String) obj);
        return Unit.INSTANCE;
    }
}
