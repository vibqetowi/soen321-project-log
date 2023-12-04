package com.ifriend.presentation.features.chat.panel.delegate;

import com.ifriend.analytics.usecase.chat.DiaryAnalytics;
import com.ifriend.presentation.common.uistate.UiStateDelegate;
import com.ifriend.presentation.features.chat.actions.delegate.ChatPanelActionsEvent;
import com.ifriend.presentation.features.chat.panel.models.ChatDiaryUi;
import com.ifriend.presentation.features.chat.panel.models.ChatTopicsUiState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: ChatPanelActionsDelegate.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.presentation.features.chat.panel.delegate.ChatPanelActionsDelegateImpl$diaryClick$1", f = "ChatPanelActionsDelegate.kt", i = {}, l = {285}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class ChatPanelActionsDelegateImpl$diaryClick$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ChatDiaryUi $diary;
    int label;
    final /* synthetic */ ChatPanelActionsDelegateImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatPanelActionsDelegateImpl$diaryClick$1(ChatDiaryUi chatDiaryUi, ChatPanelActionsDelegateImpl chatPanelActionsDelegateImpl, Continuation<? super ChatPanelActionsDelegateImpl$diaryClick$1> continuation) {
        super(2, continuation);
        this.$diary = chatDiaryUi;
        this.this$0 = chatPanelActionsDelegateImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatPanelActionsDelegateImpl$diaryClick$1(this.$diary, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ChatPanelActionsDelegateImpl$diaryClick$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            DiaryAnalytics.INSTANCE.trackClickDiaryButtonAnalytics(this.$diary.getHasNotifications());
            UiStateDelegate<ChatTopicsUiState, ChatPanelActionsEvent> uiStateDelegate = this.this$0;
            this.label = 1;
            if (uiStateDelegate.sendEvent2(uiStateDelegate, (ChatPanelActionsEvent) ChatPanelActionsEvent.OpenDiary.INSTANCE, (Continuation<? super Unit>) this) == coroutine_suspended) {
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
