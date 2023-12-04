package com.ifriend.presentation.features.chatcall.viewmodel;

import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.ifriend.domain.logic.calls.ChatCallsInteractor;
import com.ifriend.domain.logic.calls.models.ChatStartCall;
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
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatCallViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.presentation.features.chatcall.viewmodel.ChatCallViewModel$startCalling$2", f = "ChatCallViewModel.kt", i = {2}, l = {270, 271, 272}, m = "invokeSuspend", n = {DeviceRequestsHelper.DEVICE_INFO_MODEL}, s = {"L$0"})
/* loaded from: classes6.dex */
public final class ChatCallViewModel$startCalling$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ ChatCallViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatCallViewModel$startCalling$2(ChatCallViewModel chatCallViewModel, Continuation<? super ChatCallViewModel$startCalling$2> continuation) {
        super(2, continuation);
        this.this$0 = chatCallViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatCallViewModel$startCalling$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ChatCallViewModel$startCalling$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChatCallViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/presentation/features/chatcall/viewmodel/ChatCallViewModel$UiState;", "state", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.presentation.features.chatcall.viewmodel.ChatCallViewModel$startCalling$2$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Function1<ChatCallViewModel.UiState, ChatCallViewModel.UiState> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final ChatCallViewModel.UiState invoke(ChatCallViewModel.UiState state) {
            Intrinsics.checkNotNullParameter(state, "state");
            return ChatCallViewModel.UiState.copy$default(state, null, true, null, false, null, null, null, 0L, null, null, null, false, 4093, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0074 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0075  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ChatCallsInteractor chatCallsInteractor;
        ChatStartCall chatStartCall;
        UiStateDelegate<ChatCallViewModel.UiState, ChatCallViewModel.Event> uiStateDelegate;
        ChatStartCall chatStartCall2;
        String firstMessageId;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            UiStateDelegate<ChatCallViewModel.UiState, ChatCallViewModel.Event> uiStateDelegate2 = this.this$0;
            this.label = 1;
            if (uiStateDelegate2.updateUiState(uiStateDelegate2, AnonymousClass1.INSTANCE, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    chatStartCall2 = (ChatStartCall) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    ChatCallViewModel chatCallViewModel = this.this$0;
                    String startMessage = chatStartCall2.getStartMessage();
                    firstMessageId = this.this$0.getFirstMessageId();
                    chatCallViewModel.speakMessage(startMessage, firstMessageId);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            chatStartCall = (ChatStartCall) obj;
            uiStateDelegate = this.this$0;
            this.L$0 = chatStartCall;
            this.label = 3;
            if (uiStateDelegate.updateUiState(uiStateDelegate, new AnonymousClass2(chatStartCall), this) != coroutine_suspended) {
                return coroutine_suspended;
            }
            chatStartCall2 = chatStartCall;
            ChatCallViewModel chatCallViewModel2 = this.this$0;
            String startMessage2 = chatStartCall2.getStartMessage();
            firstMessageId = this.this$0.getFirstMessageId();
            chatCallViewModel2.speakMessage(startMessage2, firstMessageId);
            return Unit.INSTANCE;
        } else {
            ResultKt.throwOnFailure(obj);
        }
        chatCallsInteractor = this.this$0.chatCallsInteractor;
        this.label = 2;
        obj = chatCallsInteractor.startCall(this.this$0.chatId, this);
        if (obj == coroutine_suspended) {
            return coroutine_suspended;
        }
        chatStartCall = (ChatStartCall) obj;
        uiStateDelegate = this.this$0;
        this.L$0 = chatStartCall;
        this.label = 3;
        if (uiStateDelegate.updateUiState(uiStateDelegate, new AnonymousClass2(chatStartCall), this) != coroutine_suspended) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChatCallViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/presentation/features/chatcall/viewmodel/ChatCallViewModel$UiState;", "state", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.presentation.features.chatcall.viewmodel.ChatCallViewModel$startCalling$2$2  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass2 extends Lambda implements Function1<ChatCallViewModel.UiState, ChatCallViewModel.UiState> {
        final /* synthetic */ ChatStartCall $model;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(ChatStartCall chatStartCall) {
            super(1);
            this.$model = chatStartCall;
        }

        @Override // kotlin.jvm.functions.Function1
        public final ChatCallViewModel.UiState invoke(ChatCallViewModel.UiState state) {
            Intrinsics.checkNotNullParameter(state, "state");
            return ChatCallViewModel.UiState.copy$default(state, this.$model.getCallId(), false, null, false, null, null, null, 0L, null, null, null, true, 2046, null);
        }
    }
}
