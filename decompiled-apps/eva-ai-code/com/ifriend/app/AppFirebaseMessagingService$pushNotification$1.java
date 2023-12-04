package com.ifriend.app;

import com.facebook.share.internal.ShareConstants;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.ifriend.push_notification.PushConstant;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AppFirebaseMessagingService.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.app.AppFirebaseMessagingService", f = "AppFirebaseMessagingService.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3}, l = {166, 167, 171, TsExtractor.TS_STREAM_TYPE_AC4}, m = "pushNotification", n = {"this", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "channelId", "soundUri", "notificationType", "title", TtmlNode.TAG_BODY, PushConstant.PUSH_DATA_IMPORTANCE_KEY, "bitmap", "this", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "channelId", "soundUri", "title", TtmlNode.TAG_BODY, PushConstant.PUSH_DATA_IMPORTANCE_KEY, "bitmap", "this", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "channelId", "soundUri", "title", TtmlNode.TAG_BODY, PushConstant.PUSH_DATA_IMPORTANCE_KEY, "bitmap", "messageTypesWithoutDefaultAvatar", "this", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "channelId", "soundUri", "title", TtmlNode.TAG_BODY, PushConstant.PUSH_DATA_IMPORTANCE_KEY, "bitmap"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "Z$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7"})
/* loaded from: classes6.dex */
public final class AppFirebaseMessagingService$pushNotification$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AppFirebaseMessagingService this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppFirebaseMessagingService$pushNotification$1(AppFirebaseMessagingService appFirebaseMessagingService, Continuation<? super AppFirebaseMessagingService$pushNotification$1> continuation) {
        super(continuation);
        this.this$0 = appFirebaseMessagingService;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object pushNotification;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        pushNotification = this.this$0.pushNotification(null, null, null, this);
        return pushNotification;
    }
}
