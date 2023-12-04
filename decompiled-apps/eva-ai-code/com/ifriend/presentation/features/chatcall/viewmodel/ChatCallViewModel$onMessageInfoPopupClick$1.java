package com.ifriend.presentation.features.chatcall.viewmodel;

import com.ifriend.presentation.common.uistate.UiStateDelegate;
import com.ifriend.presentation.features.chatcall.viewmodel.ChatCallViewModel;
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
/* compiled from: ChatCallViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.presentation.features.chatcall.viewmodel.ChatCallViewModel$onMessageInfoPopupClick$1", f = "ChatCallViewModel.kt", i = {}, l = {421, 422}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class ChatCallViewModel$onMessageInfoPopupClick$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ChatCallViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatCallViewModel$onMessageInfoPopupClick$1(ChatCallViewModel chatCallViewModel, Continuation<? super ChatCallViewModel$onMessageInfoPopupClick$1> continuation) {
        super(2, continuation);
        this.this$0 = chatCallViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatCallViewModel$onMessageInfoPopupClick$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ChatCallViewModel$onMessageInfoPopupClick$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            UiStateDelegate<ChatCallViewModel.UiState, ChatCallViewModel.Event> uiStateDelegate = this.this$0;
            this.label = 1;
            if (uiStateDelegate.sendEvent2(uiStateDelegate, (ChatCallViewModel.Event) ChatCallViewModel.Event.OpenSettings.INSTANCE, (Continuation<? super Unit>) this) == coroutine_suspended) {
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
        UiStateDelegate<ChatCallViewModel.UiState, ChatCallViewModel.Event> uiStateDelegate2 = this.this$0;
        this.label = 2;
        if (uiStateDelegate2.sendEvent2(uiStateDelegate2, (ChatCallViewModel.Event) ChatCallViewModel.Event.CloseFeature.INSTANCE, (Continuation<? super Unit>) this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
