package com.ifriend.domain.newChat.chat.systems.messages.live;

import com.ifriend.domain.newChat.chat.models.ChatMessage;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
/* compiled from: LiveMessagesSystem.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/ifriend/domain/newChat/chat/models/ChatMessage;", "newMessage", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.domain.newChat.chat.systems.messages.live.LiveMessagesSystem$onStart$1", f = "LiveMessagesSystem.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class LiveMessagesSystem$onStart$1 extends SuspendLambda implements Function2<ChatMessage, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ LiveMessagesSystem this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveMessagesSystem$onStart$1(LiveMessagesSystem liveMessagesSystem, Continuation<? super LiveMessagesSystem$onStart$1> continuation) {
        super(2, continuation);
        this.this$0 = liveMessagesSystem;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        LiveMessagesSystem$onStart$1 liveMessagesSystem$onStart$1 = new LiveMessagesSystem$onStart$1(this.this$0, continuation);
        liveMessagesSystem$onStart$1.L$0 = obj;
        return liveMessagesSystem$onStart$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ChatMessage chatMessage, Continuation<? super Unit> continuation) {
        return ((LiveMessagesSystem$onStart$1) create(chatMessage, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List list;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            list = this.this$0.messagesToAdd;
            list.add((ChatMessage) this.L$0);
            this.this$0.reportUpdateState();
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
