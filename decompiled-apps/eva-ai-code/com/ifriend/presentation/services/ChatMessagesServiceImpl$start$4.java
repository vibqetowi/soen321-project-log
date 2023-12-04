package com.ifriend.presentation.services;

import com.facebook.share.internal.ShareConstants;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.ifriend.domain.data.notifications.ChatNotificationsRepository;
import com.ifriend.domain.logic.chat.ChatClientInteractor;
import com.ifriend.domain.logic.chat.events.ChatUpdateMessageEvent;
import com.ifriend.domain.socket.MessagesSourceMessage;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
/* compiled from: ChatMessagesService.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/ifriend/domain/socket/MessagesSourceMessage$Chat$ChatMessageEvent;", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.presentation.services.ChatMessagesServiceImpl$start$4", f = "ChatMessagesService.kt", i = {0}, l = {87, ModuleDescriptor.MODULE_VERSION, 96}, m = "invokeSuspend", n = {ShareConstants.WEB_DIALOG_PARAM_MESSAGE}, s = {"L$0"})
/* loaded from: classes6.dex */
final class ChatMessagesServiceImpl$start$4 extends SuspendLambda implements Function2<MessagesSourceMessage.Chat.ChatMessageEvent, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ChatMessagesServiceImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatMessagesServiceImpl$start$4(ChatMessagesServiceImpl chatMessagesServiceImpl, Continuation<? super ChatMessagesServiceImpl$start$4> continuation) {
        super(2, continuation);
        this.this$0 = chatMessagesServiceImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ChatMessagesServiceImpl$start$4 chatMessagesServiceImpl$start$4 = new ChatMessagesServiceImpl$start$4(this.this$0, continuation);
        chatMessagesServiceImpl$start$4.L$0 = obj;
        return chatMessagesServiceImpl$start$4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(MessagesSourceMessage.Chat.ChatMessageEvent chatMessageEvent, Continuation<? super Unit> continuation) {
        return ((ChatMessagesServiceImpl$start$4) create(chatMessageEvent, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0083 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        MessagesSourceMessage.Chat.ChatMessageEvent chatMessageEvent;
        ChatClientInteractor chatClientInteractor;
        Object removeMessage;
        ChatNotificationsRepository chatNotificationsRepository;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            chatMessageEvent = (MessagesSourceMessage.Chat.ChatMessageEvent) this.L$0;
            String senderId = chatMessageEvent.getChatMessage().getInfo().getIds().getSenderId();
            if (chatMessageEvent instanceof MessagesSourceMessage.Chat.Message) {
                String oldMessageId = chatMessageEvent.getChatMessage().getInfo().getRegenerate().getOldMessageId();
                if (!StringsKt.isBlank(oldMessageId)) {
                    this.L$0 = chatMessageEvent;
                    this.label = 1;
                    removeMessage = this.this$0.removeMessage(senderId, oldMessageId, this);
                    if (removeMessage == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                chatNotificationsRepository = this.this$0.notificationsRepo;
                this.L$0 = null;
                this.label = 2;
                if (chatNotificationsRepository.emitNew((MessagesSourceMessage.Chat.Message) chatMessageEvent, this) == coroutine_suspended) {
                }
            } else if (chatMessageEvent instanceof MessagesSourceMessage.Chat.MessageUpdated) {
                chatClientInteractor = this.this$0.chatClientInteractor;
                this.label = 3;
                if (chatClientInteractor.handleEvent(senderId, new ChatUpdateMessageEvent(chatMessageEvent.getChatMessage()), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else if (i == 1) {
            chatMessageEvent = (MessagesSourceMessage.Chat.ChatMessageEvent) this.L$0;
            ResultKt.throwOnFailure(obj);
            chatNotificationsRepository = this.this$0.notificationsRepo;
            this.L$0 = null;
            this.label = 2;
            if (chatNotificationsRepository.emitNew((MessagesSourceMessage.Chat.Message) chatMessageEvent, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i != 2 && i != 3) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
