package com.ifriend.presentation.features.chat.panel.delegate;

import com.google.firebase.perf.util.Constants;
import com.ifriend.presentation.features.chat.panel.models.ChatCallUi;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ChatPanelActionsDelegate.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", Constants.ENABLE_DISABLE, "Lcom/ifriend/presentation/features/chat/panel/models/ChatCallUi;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.presentation.features.chat.panel.delegate.ChatPanelActionsDelegateImpl$getCallFlow$2", f = "ChatPanelActionsDelegate.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class ChatPanelActionsDelegateImpl$getCallFlow$2 extends SuspendLambda implements Function2<Boolean, Continuation<? super ChatCallUi>, Object> {
    /* synthetic */ boolean Z$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ChatPanelActionsDelegateImpl$getCallFlow$2(Continuation<? super ChatPanelActionsDelegateImpl$getCallFlow$2> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ChatPanelActionsDelegateImpl$getCallFlow$2 chatPanelActionsDelegateImpl$getCallFlow$2 = new ChatPanelActionsDelegateImpl$getCallFlow$2(continuation);
        chatPanelActionsDelegateImpl$getCallFlow$2.Z$0 = ((Boolean) obj).booleanValue();
        return chatPanelActionsDelegateImpl$getCallFlow$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super ChatCallUi> continuation) {
        return invoke(bool.booleanValue(), continuation);
    }

    public final Object invoke(boolean z, Continuation<? super ChatCallUi> continuation) {
        return ((ChatPanelActionsDelegateImpl$getCallFlow$2) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.Z$0) {
                Intrinsics.checkNotNullExpressionValue("ChatCallUi", "getSimpleName(...)");
                return new ChatCallUi("ChatCallUi", false);
            }
            return null;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
