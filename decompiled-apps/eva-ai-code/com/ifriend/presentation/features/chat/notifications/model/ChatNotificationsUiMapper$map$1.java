package com.ifriend.presentation.features.chat.notifications.model;

import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatNotificationsUiMapper.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.presentation.features.chat.notifications.model.ChatNotificationsUiMapper", f = "ChatNotificationsUiMapper.kt", i = {0, 0, 0, 0}, l = {38}, m = "map", n = {"this", DeviceRequestsHelper.DEVICE_INFO_MODEL, "chatAvatarUrl", "order"}, s = {"L$0", "L$1", "L$2", "I$0"})
/* loaded from: classes6.dex */
public final class ChatNotificationsUiMapper$map$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ChatNotificationsUiMapper this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatNotificationsUiMapper$map$1(ChatNotificationsUiMapper chatNotificationsUiMapper, Continuation<? super ChatNotificationsUiMapper$map$1> continuation) {
        super(continuation);
        this.this$0 = chatNotificationsUiMapper;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.map(0, null, null, this);
    }
}
