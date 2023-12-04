package com.ifriend.app;

import android.net.Uri;
import com.google.firebase.messaging.RemoteMessage;
import com.ifriend.push_notification.PushConstant;
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
/* compiled from: AppFirebaseMessagingService.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.app.AppFirebaseMessagingService$showNotification$1", f = "AppFirebaseMessagingService.kt", i = {}, l = {144}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class AppFirebaseMessagingService$showNotification$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ RemoteMessage $message;
    int label;
    final /* synthetic */ AppFirebaseMessagingService this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppFirebaseMessagingService$showNotification$1(RemoteMessage remoteMessage, AppFirebaseMessagingService appFirebaseMessagingService, Continuation<? super AppFirebaseMessagingService$showNotification$1> continuation) {
        super(2, continuation);
        this.$message = remoteMessage;
        this.this$0 = appFirebaseMessagingService;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AppFirebaseMessagingService$showNotification$1(this.$message, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AppFirebaseMessagingService$showNotification$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Uri soundUri;
        String initChannel;
        Object pushNotification;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            soundUri = this.this$0.soundUri(this.$message.getData().get(PushConstant.PUSH_DATA_SOUND_KEY));
            initChannel = this.this$0.initChannel(this.$message, soundUri);
            this.label = 1;
            pushNotification = this.this$0.pushNotification(this.$message, initChannel, soundUri, this);
            if (pushNotification == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
