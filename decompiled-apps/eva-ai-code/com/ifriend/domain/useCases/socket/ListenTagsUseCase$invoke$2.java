package com.ifriend.domain.useCases.socket;

import com.facebook.share.internal.ShareConstants;
import com.ifriend.domain.socket.MessagesSourceMessage;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ListenTagsUseCase.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/ifriend/domain/socket/MessagesSourceMessage;", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.domain.useCases.socket.ListenTagsUseCase$invoke$2", f = "ListenTagsUseCase.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class ListenTagsUseCase$invoke$2 extends SuspendLambda implements Function2<MessagesSourceMessage, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ListenTagsUseCase this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListenTagsUseCase$invoke$2(ListenTagsUseCase listenTagsUseCase, Continuation<? super ListenTagsUseCase$invoke$2> continuation) {
        super(2, continuation);
        this.this$0 = listenTagsUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ListenTagsUseCase$invoke$2 listenTagsUseCase$invoke$2 = new ListenTagsUseCase$invoke$2(this.this$0, continuation);
        listenTagsUseCase$invoke$2.L$0 = obj;
        return listenTagsUseCase$invoke$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(MessagesSourceMessage messagesSourceMessage, Continuation<? super Unit> continuation) {
        return ((ListenTagsUseCase$invoke$2) create(messagesSourceMessage, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        MessagesSourceMessage messagesSourceMessage = (MessagesSourceMessage) this.L$0;
        if (messagesSourceMessage instanceof MessagesSourceMessage.TagAdded) {
            this.this$0.onTagAdded((MessagesSourceMessage.TagAdded) messagesSourceMessage);
        } else if (messagesSourceMessage instanceof MessagesSourceMessage.TagRemoved) {
            this.this$0.onTagRemoved((MessagesSourceMessage.TagRemoved) messagesSourceMessage);
        }
        return Unit.INSTANCE;
    }
}
