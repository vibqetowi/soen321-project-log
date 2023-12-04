package com.ifriend.presentation.features.chatcall.viewmodel;

import com.ifriend.domain.logic.calls.ChatCallsInteractor;
import com.ifriend.presentation.common.uistate.UiStateDelegate;
import com.ifriend.presentation.features.chatcall.analytics.ChatCallAnalytics;
import com.ifriend.presentation.features.chatcall.viewmodel.ChatCallViewModel;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatCallViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.presentation.features.chatcall.viewmodel.ChatCallViewModel$finishCallAfterInactivityTime$2", f = "ChatCallViewModel.kt", i = {}, l = {374, 375, 377, 389}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class ChatCallViewModel$finishCallAfterInactivityTime$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ChatCallViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatCallViewModel$finishCallAfterInactivityTime$2(ChatCallViewModel chatCallViewModel, Continuation<? super ChatCallViewModel$finishCallAfterInactivityTime$2> continuation) {
        super(2, continuation);
        this.this$0 = chatCallViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatCallViewModel$finishCallAfterInactivityTime$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ChatCallViewModel$finishCallAfterInactivityTime$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChatCallViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/presentation/features/chatcall/viewmodel/ChatCallViewModel$UiState;", "state", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.presentation.features.chatcall.viewmodel.ChatCallViewModel$finishCallAfterInactivityTime$2$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Function1<ChatCallViewModel.UiState, ChatCallViewModel.UiState> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final ChatCallViewModel.UiState invoke(ChatCallViewModel.UiState state) {
            Intrinsics.checkNotNullParameter(state, "state");
            return ChatCallViewModel.UiState.copy$default(state, null, false, null, false, null, null, null, 0L, null, null, null, false, 2047, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0066 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008c  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object finishCall;
        ChatCallsInteractor chatCallsInteractor;
        String str;
        ChatCallAnalytics chatCallAnalytics;
        ChatCallAnalytics chatCallAnalytics2;
        String finishMessageId;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            UiStateDelegate<ChatCallViewModel.UiState, ChatCallViewModel.Event> uiStateDelegate = this.this$0;
            this.label = 1;
            if (uiStateDelegate.updateUiState(uiStateDelegate, AnonymousClass1.INSTANCE, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i != 1) {
            if (i == 2) {
                ResultKt.throwOnFailure(obj);
                chatCallsInteractor = this.this$0.chatCallsInteractor;
                this.label = 3;
                obj = chatCallsInteractor.getFinishPhrase(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                str = (String) obj;
                if (!StringsKt.isBlank(str)) {
                }
                return Unit.INSTANCE;
            } else if (i != 3) {
                if (i == 4) {
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                ResultKt.throwOnFailure(obj);
                str = (String) obj;
                if (!StringsKt.isBlank(str)) {
                    chatCallAnalytics2 = this.this$0.chatCallAnalytics;
                    chatCallAnalytics2.trackAutoEndCallButtonClick(FinishCallReason.TIMEOUT_ACTIONS.getKey(), str);
                    ChatCallViewModel chatCallViewModel = this.this$0;
                    finishMessageId = chatCallViewModel.getFinishMessageId();
                    chatCallViewModel.speakMessage(str, finishMessageId);
                } else {
                    chatCallAnalytics = this.this$0.chatCallAnalytics;
                    chatCallAnalytics.trackAutoEndCallButtonClick(FinishCallReason.TIMEOUT_ACTIONS.getKey(), null);
                    UiStateDelegate<ChatCallViewModel.UiState, ChatCallViewModel.Event> uiStateDelegate2 = this.this$0;
                    this.label = 4;
                    if (uiStateDelegate2.sendEvent2(uiStateDelegate2, (ChatCallViewModel.Event) ChatCallViewModel.Event.CloseFeature.INSTANCE, (Continuation<? super Unit>) this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
        } else {
            ResultKt.throwOnFailure(obj);
        }
        this.label = 2;
        finishCall = this.this$0.finishCall(FinishCallReason.TIMEOUT_ACTIONS, this);
        if (finishCall == coroutine_suspended) {
            return coroutine_suspended;
        }
        chatCallsInteractor = this.this$0.chatCallsInteractor;
        this.label = 3;
        obj = chatCallsInteractor.getFinishPhrase(this);
        if (obj == coroutine_suspended) {
        }
        str = (String) obj;
        if (!StringsKt.isBlank(str)) {
        }
        return Unit.INSTANCE;
    }
}
