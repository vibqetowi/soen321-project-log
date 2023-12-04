package com.ifriend.presentation.features.chat.configuration;

import androidx.lifecycle.ViewModelKt;
import com.ifriend.core.tools.api.DispatcherProvider;
import com.ifriend.domain.logic.chat.configuration.ChatsConfiguration;
import com.ifriend.domain.logic.chat.configuration.ChatsConfigurationInteractor;
import com.ifriend.domain.logic.chat.models.ChatInfo;
import com.ifriend.presentation.common.uistate.UiStateDelegate;
import com.ifriend.presentation.features.chat.screen.viewmodel.ChatViewModel;
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
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
/* compiled from: ChatConfigurationDelegate.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.presentation.features.chat.configuration.ChatConfigurationDelegateImpl$initChatConfiguration$2", f = "ChatConfigurationDelegate.kt", i = {}, l = {46}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class ChatConfigurationDelegateImpl$initChatConfiguration$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ChatViewModel $$context_receiver_0;
    int label;
    final /* synthetic */ ChatConfigurationDelegateImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatConfigurationDelegateImpl$initChatConfiguration$2(ChatConfigurationDelegateImpl chatConfigurationDelegateImpl, ChatViewModel chatViewModel, Continuation<? super ChatConfigurationDelegateImpl$initChatConfiguration$2> continuation) {
        super(2, continuation);
        this.this$0 = chatConfigurationDelegateImpl;
        this.$$context_receiver_0 = chatViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatConfigurationDelegateImpl$initChatConfiguration$2(this.this$0, this.$$context_receiver_0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ChatConfigurationDelegateImpl$initChatConfiguration$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ChatsConfigurationInteractor chatsConfigurationInteractor;
        String str;
        DispatcherProvider dispatcherProvider;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            chatsConfigurationInteractor = this.this$0.chatsConfigurationInteractor;
            str = this.this$0.chatId;
            this.label = 1;
            obj = chatsConfigurationInteractor.getChatConfigurationFlow(str, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
        }
        dispatcherProvider = this.this$0.dispatcherProvider;
        FlowKt.launchIn(FlowKt.onEach(FlowKt.flowOn((Flow) obj, dispatcherProvider.background()), new AnonymousClass1(this.$$context_receiver_0, null)), ViewModelKt.getViewModelScope(this.$$context_receiver_0));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChatConfigurationDelegate.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/ifriend/domain/logic/chat/configuration/ChatsConfiguration;", "configuration", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.ifriend.presentation.features.chat.configuration.ChatConfigurationDelegateImpl$initChatConfiguration$2$1", f = "ChatConfigurationDelegate.kt", i = {}, l = {50}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.ifriend.presentation.features.chat.configuration.ChatConfigurationDelegateImpl$initChatConfiguration$2$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<ChatsConfiguration, Continuation<? super Unit>, Object> {
        final /* synthetic */ ChatViewModel $$context_receiver_0;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ChatViewModel chatViewModel, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$$context_receiver_0 = chatViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$$context_receiver_0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ChatsConfiguration chatsConfiguration, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(chatsConfiguration, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ChatInfo chatInfo = ((ChatsConfiguration) this.L$0).getChatInfo();
                UiStateDelegate<ChatViewModel.UiState, ChatViewModel.Event> uiStateDelegate = this.$$context_receiver_0;
                this.label = 1;
                if (uiStateDelegate.updateUiState(uiStateDelegate, new C01491(chatInfo), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ChatConfigurationDelegate.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/presentation/features/chat/screen/viewmodel/ChatViewModel$UiState;", "state", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.ifriend.presentation.features.chat.configuration.ChatConfigurationDelegateImpl$initChatConfiguration$2$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes6.dex */
        public static final class C01491 extends Lambda implements Function1<ChatViewModel.UiState, ChatViewModel.UiState> {
            final /* synthetic */ ChatInfo $chatInfo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C01491(ChatInfo chatInfo) {
                super(1);
                this.$chatInfo = chatInfo;
            }

            @Override // kotlin.jvm.functions.Function1
            public final ChatViewModel.UiState invoke(ChatViewModel.UiState state) {
                ChatViewModel.UiState m6924copyfWhpE4E;
                Intrinsics.checkNotNullParameter(state, "state");
                m6924copyfWhpE4E = state.m6924copyfWhpE4E((r22 & 1) != 0 ? state.isLoading : false, (r22 & 2) != 0 ? state.animatedBgState : null, (r22 & 4) != 0 ? state.imageBgState : null, (r22 & 8) != 0 ? state.gradientColor : 0L, (r22 & 16) != 0 ? state.chatName : this.$chatInfo.getName(), (r22 & 32) != 0 ? state.isVerified : this.$chatInfo.isVerified(), (r22 & 64) != 0 ? state.isShowSubscriptionState : false, (r22 & 128) != 0 ? state.subscriptionStateLabel : null, (r22 & 256) != 0 ? state.chatInfo : null);
                return m6924copyfWhpE4E;
            }
        }
    }
}
