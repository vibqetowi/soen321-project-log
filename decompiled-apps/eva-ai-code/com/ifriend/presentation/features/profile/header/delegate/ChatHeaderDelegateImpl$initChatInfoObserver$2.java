package com.ifriend.presentation.features.profile.header.delegate;

import com.ifriend.domain.logic.chat.info.ChatsInfoInteractor;
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
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatHeaderDelegate.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.presentation.features.profile.header.delegate.ChatHeaderDelegateImpl$initChatInfoObserver$2", f = "ChatHeaderDelegate.kt", i = {}, l = {148, 149}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class ChatHeaderDelegateImpl$initChatInfoObserver$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $chatId;
    int label;
    final /* synthetic */ ChatHeaderDelegateImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatHeaderDelegateImpl$initChatInfoObserver$2(ChatHeaderDelegateImpl chatHeaderDelegateImpl, String str, Continuation<? super ChatHeaderDelegateImpl$initChatInfoObserver$2> continuation) {
        super(2, continuation);
        this.this$0 = chatHeaderDelegateImpl;
        this.$chatId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatHeaderDelegateImpl$initChatInfoObserver$2(this.this$0, this.$chatId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ChatHeaderDelegateImpl$initChatInfoObserver$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            obj = chatsInfoInteractor.getCountOfUnreadMessages(this.$chatId, this);
            if (obj == coroutine_suspended) {
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
        this.label = 2;
        if (FlowKt.collectLatest((Flow) obj, new AnonymousClass1(this.this$0, null), this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChatHeaderDelegate.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "count", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.ifriend.presentation.features.profile.header.delegate.ChatHeaderDelegateImpl$initChatInfoObserver$2$1", f = "ChatHeaderDelegate.kt", i = {}, l = {150}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.ifriend.presentation.features.profile.header.delegate.ChatHeaderDelegateImpl$initChatInfoObserver$2$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
        /* synthetic */ int I$0;
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
            anonymousClass1.I$0 = ((Number) obj).intValue();
            return anonymousClass1;
        }

        public final Object invoke(int i, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(Integer.valueOf(i), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Integer num, Continuation<? super Unit> continuation) {
            return invoke(num.intValue(), continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                int i2 = this.I$0;
                UiStateDelegate<ChatHeaderUiState, Unit> uiStateDelegate = this.this$0;
                this.label = 1;
                if (uiStateDelegate.updateUiState(uiStateDelegate, new C01681(i2), this) == coroutine_suspended) {
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
        /* renamed from: com.ifriend.presentation.features.profile.header.delegate.ChatHeaderDelegateImpl$initChatInfoObserver$2$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes6.dex */
        public static final class C01681 extends Lambda implements Function1<ChatHeaderUiState, ChatHeaderUiState> {
            final /* synthetic */ int $count;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C01681(int i) {
                super(1);
                this.$count = i;
            }

            @Override // kotlin.jvm.functions.Function1
            public final ChatHeaderUiState invoke(ChatHeaderUiState state) {
                ChatHeaderUiState copy;
                Intrinsics.checkNotNullParameter(state, "state");
                copy = state.copy((r26 & 1) != 0 ? state.animatedAvatarState : null, (r26 & 2) != 0 ? state.title : null, (r26 & 4) != 0 ? state.unreadMessagesCount : this.$count, (r26 & 8) != 0 ? state.lvlProgress : 0.0f, (r26 & 16) != 0 ? state.lvlLabel : null, (r26 & 32) != 0 ? state.isVisibleLvlProgress : false, (r26 & 64) != 0 ? state.balanceLabel : null, (r26 & 128) != 0 ? state.isVisibleBackButton : false, (r26 & 256) != 0 ? state.isVisibleMenuButton : false, (r26 & 512) != 0 ? state.isVisibleMenuIndicator : false, (r26 & 1024) != 0 ? state.isVisibleUpdateIndicator : false, (r26 & 2048) != 0 ? state.isVisibleVerified : false);
                return copy;
            }
        }
    }
}
