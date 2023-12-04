package com.ifriend.presentation.features.profile.header.delegate;

import com.ifriend.domain.logic.chat.info.ChatsInfoInteractor;
import com.ifriend.domain.logic.chat.models.ChatsState;
import com.ifriend.presentation.common.uistate.UiStateDelegate;
import com.ifriend.presentation.features.profile.header.model.ChatHeaderUiState;
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
import kotlinx.coroutines.flow.FlowKt;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatHeaderDelegate.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.presentation.features.profile.header.delegate.ChatHeaderDelegateImpl$initChatInfoObserver$3", f = "ChatHeaderDelegate.kt", i = {}, l = {159}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class ChatHeaderDelegateImpl$initChatInfoObserver$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ChatHeaderDelegateImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatHeaderDelegateImpl$initChatInfoObserver$3(ChatHeaderDelegateImpl chatHeaderDelegateImpl, Continuation<? super ChatHeaderDelegateImpl$initChatInfoObserver$3> continuation) {
        super(2, continuation);
        this.this$0 = chatHeaderDelegateImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatHeaderDelegateImpl$initChatInfoObserver$3(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ChatHeaderDelegateImpl$initChatInfoObserver$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ChatsInfoInteractor chatsInfoInteractor;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            chatsInfoInteractor = this.this$0.chatsInfoInteractor;
            this.label = 1;
            if (FlowKt.collectLatest(chatsInfoInteractor.getChatsStateFlow(), new AnonymousClass1(this.this$0, null), this) == coroutine_suspended) {
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
    /* compiled from: ChatHeaderDelegate.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/ifriend/domain/logic/chat/models/ChatsState;", "chatState", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.ifriend.presentation.features.profile.header.delegate.ChatHeaderDelegateImpl$initChatInfoObserver$3$1", f = "ChatHeaderDelegate.kt", i = {}, l = {161}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.ifriend.presentation.features.profile.header.delegate.ChatHeaderDelegateImpl$initChatInfoObserver$3$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<ChatsState, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ ChatHeaderDelegateImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ChatHeaderDelegateImpl chatHeaderDelegateImpl, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = chatHeaderDelegateImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ChatsState chatsState, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(chatsState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                UiStateDelegate<ChatHeaderUiState, Unit> uiStateDelegate = this.this$0;
                this.label = 1;
                if (uiStateDelegate.updateUiState(uiStateDelegate, new C01691(((ChatsState) this.L$0) instanceof ChatsState.ChatListChats), this) == coroutine_suspended) {
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
        /* compiled from: ChatHeaderDelegate.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/presentation/features/profile/header/model/ChatHeaderUiState;", "state", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.ifriend.presentation.features.profile.header.delegate.ChatHeaderDelegateImpl$initChatInfoObserver$3$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes6.dex */
        public static final class C01691 extends Lambda implements Function1<ChatHeaderUiState, ChatHeaderUiState> {
            final /* synthetic */ boolean $isMultiChats;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C01691(boolean z) {
                super(1);
                this.$isMultiChats = z;
            }

            @Override // kotlin.jvm.functions.Function1
            public final ChatHeaderUiState invoke(ChatHeaderUiState state) {
                ChatHeaderUiState copy;
                Intrinsics.checkNotNullParameter(state, "state");
                boolean z = this.$isMultiChats;
                copy = state.copy((r26 & 1) != 0 ? state.animatedAvatarState : null, (r26 & 2) != 0 ? state.title : null, (r26 & 4) != 0 ? state.unreadMessagesCount : 0, (r26 & 8) != 0 ? state.lvlProgress : 0.0f, (r26 & 16) != 0 ? state.lvlLabel : null, (r26 & 32) != 0 ? state.isVisibleLvlProgress : false, (r26 & 64) != 0 ? state.balanceLabel : null, (r26 & 128) != 0 ? state.isVisibleBackButton : z, (r26 & 256) != 0 ? state.isVisibleMenuButton : !z, (r26 & 512) != 0 ? state.isVisibleMenuIndicator : false, (r26 & 1024) != 0 ? state.isVisibleUpdateIndicator : false, (r26 & 2048) != 0 ? state.isVisibleVerified : false);
                return copy;
            }
        }
    }
}
