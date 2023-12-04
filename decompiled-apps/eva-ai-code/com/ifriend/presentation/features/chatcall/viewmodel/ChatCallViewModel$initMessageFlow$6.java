package com.ifriend.presentation.features.chatcall.viewmodel;

import com.ifriend.analytics.api.logic.AnalyticsInteractor;
import com.ifriend.presentation.common.uistate.UiStateDelegate;
import com.ifriend.presentation.features.chatcall.viewmodel.ChatCallViewModel;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.flow.FlowCollector;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatCallViewModel.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "", "", "throwable", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.presentation.features.chatcall.viewmodel.ChatCallViewModel$initMessageFlow$6", f = "ChatCallViewModel.kt", i = {0}, l = {246, 254}, m = "invokeSuspend", n = {"throwable"}, s = {"L$0"})
/* loaded from: classes6.dex */
public final class ChatCallViewModel$initMessageFlow$6 extends SuspendLambda implements Function3<FlowCollector<? super String>, Throwable, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ChatCallViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatCallViewModel$initMessageFlow$6(ChatCallViewModel chatCallViewModel, Continuation<? super ChatCallViewModel$initMessageFlow$6> continuation) {
        super(3, continuation);
        this.this$0 = chatCallViewModel;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(FlowCollector<? super String> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
        ChatCallViewModel$initMessageFlow$6 chatCallViewModel$initMessageFlow$6 = new ChatCallViewModel$initMessageFlow$6(this.this$0, continuation);
        chatCallViewModel$initMessageFlow$6.L$0 = th;
        return chatCallViewModel$initMessageFlow$6.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChatCallViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/presentation/features/chatcall/viewmodel/ChatCallViewModel$UiState;", "state", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.presentation.features.chatcall.viewmodel.ChatCallViewModel$initMessageFlow$6$1  reason: invalid class name */
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

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        AnalyticsInteractor analyticsInteractor;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            th = (Throwable) this.L$0;
            UiStateDelegate<ChatCallViewModel.UiState, ChatCallViewModel.Event> uiStateDelegate = this.this$0;
            this.L$0 = th;
            this.label = 1;
            if (uiStateDelegate.updateUiState(uiStateDelegate, AnonymousClass1.INSTANCE, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i != 1) {
            if (i == 2) {
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            th = (Throwable) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        if (th instanceof TimeoutCancellationException) {
            this.this$0.finishCallAfterInactivityTime();
        } else {
            analyticsInteractor = this.this$0.analyticsInteractor;
            analyticsInteractor.trackException(ChatCallViewModel.class + " catch init message flow", th);
            this.L$0 = null;
            this.label = 2;
            if (ChatCallViewModel.finishCallAndCloseFeature$default(this.this$0, FinishCallReason.INTERNAL_ERROR, false, this, 2, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
