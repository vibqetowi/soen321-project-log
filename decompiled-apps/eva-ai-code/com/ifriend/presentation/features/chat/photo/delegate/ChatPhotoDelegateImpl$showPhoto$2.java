package com.ifriend.presentation.features.chat.photo.delegate;

import androidx.lifecycle.ViewModel;
import com.ifriend.domain.logic.chat.messages.models.ChatMessageAccessReason;
import com.ifriend.domain.newChat.chat.models.ChatMessage;
import com.ifriend.domain.newChat.chat.models.MessageInfo;
import com.ifriend.presentation.analytics.ChatPhotoAnalytics;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: ChatPhotoDelegate.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.presentation.features.chat.photo.delegate.ChatPhotoDelegateImpl$showPhoto$2", f = "ChatPhotoDelegate.kt", i = {}, l = {75, 84}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class ChatPhotoDelegateImpl$showPhoto$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ViewModel $$context_receiver_0;
    final /* synthetic */ String $messageId;
    int label;
    final /* synthetic */ ChatPhotoDelegateImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatPhotoDelegateImpl$showPhoto$2(ChatPhotoDelegateImpl chatPhotoDelegateImpl, String str, ViewModel viewModel, Continuation<? super ChatPhotoDelegateImpl$showPhoto$2> continuation) {
        super(2, continuation);
        this.this$0 = chatPhotoDelegateImpl;
        this.$messageId = str;
        this.$$context_receiver_0 = viewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatPhotoDelegateImpl$showPhoto$2(this.this$0, this.$messageId, this.$$context_receiver_0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ChatPhotoDelegateImpl$showPhoto$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        ChatPhotoAnalytics chatPhotoAnalytics;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            str = this.this$0.chatId;
            this.label = 1;
            obj = this.this$0.getChatMessage(this.$messageId, str, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i != 1) {
            if (i == 2) {
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
        }
        chatPhotoAnalytics = this.this$0.photoAnalytics;
        MessageInfo.Meta meta = ((ChatMessage) obj).getInfo().getMeta();
        String mediaId = meta != null ? meta.getMediaId() : null;
        if (mediaId == null) {
            mediaId = "";
        }
        chatPhotoAnalytics.trackAiPhotoClick(mediaId);
        this.label = 2;
        if (this.this$0.requestMessageAccess(this.$$context_receiver_0, this.$messageId, ChatMessageAccessReason.BuyPhoto.INSTANCE, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
