package com.ifriend.presentation.features.chat.intro.delegate;

import com.ifriend.presentation.common.uistate.UiStateDelegate;
import com.ifriend.presentation.features.chat.intro.analytics.ChatIntroAnalyticsInteractor;
import com.ifriend.presentation.features.chat.intro.model.ChatIntroCardUiParams;
import com.ifriend.presentation.features.chat.intro.model.ChatIntroUiState;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: ChatIntroDelegate.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.presentation.features.chat.intro.delegate.ChatIntroDelegateImpl$showNextChatIntroCard$1", f = "ChatIntroDelegate.kt", i = {}, l = {80, 86}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class ChatIntroDelegateImpl$showNextChatIntroCard$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ChatIntroDelegateImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatIntroDelegateImpl$showNextChatIntroCard$1(ChatIntroDelegateImpl chatIntroDelegateImpl, Continuation<? super ChatIntroDelegateImpl$showNextChatIntroCard$1> continuation) {
        super(2, continuation);
        this.this$0 = chatIntroDelegateImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatIntroDelegateImpl$showNextChatIntroCard$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ChatIntroDelegateImpl$showNextChatIntroCard$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ChatIntroAnalyticsInteractor chatIntroAnalyticsInteractor;
        int i;
        int i2;
        List list;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = this.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            chatIntroAnalyticsInteractor = this.this$0.chatIntroAnalyticsInteractor;
            UiStateDelegate<ChatIntroUiState, Unit> uiStateDelegate = this.this$0;
            String chatId = uiStateDelegate.getUiState(uiStateDelegate).getChatId();
            i = this.this$0.currentIndex;
            chatIntroAnalyticsInteractor.trackIntroActionClick(chatId, i + 1);
            i2 = this.this$0.currentIndex;
            list = this.this$0.slides;
            if (i2 < CollectionsKt.getLastIndex(list)) {
                UiStateDelegate<ChatIntroUiState, Unit> uiStateDelegate2 = this.this$0;
                this.label = 1;
                if (uiStateDelegate2.reduce(uiStateDelegate2, new AnonymousClass1(this.this$0), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                UiStateDelegate<ChatIntroUiState, Unit> uiStateDelegate3 = this.this$0;
                this.label = 2;
                if (uiStateDelegate3.reduce(uiStateDelegate3, AnonymousClass2.INSTANCE, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else if (i3 != 1 && i3 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChatIntroDelegate.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/presentation/features/chat/intro/model/ChatIntroUiState;", "state", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.presentation.features.chat.intro.delegate.ChatIntroDelegateImpl$showNextChatIntroCard$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Function1<ChatIntroUiState, ChatIntroUiState> {
        final /* synthetic */ ChatIntroDelegateImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ChatIntroDelegateImpl chatIntroDelegateImpl) {
            super(1);
            this.this$0 = chatIntroDelegateImpl;
        }

        @Override // kotlin.jvm.functions.Function1
        public final ChatIntroUiState invoke(ChatIntroUiState state) {
            List list;
            int i;
            int i2;
            Intrinsics.checkNotNullParameter(state, "state");
            list = this.this$0.slides;
            ChatIntroDelegateImpl chatIntroDelegateImpl = this.this$0;
            i = chatIntroDelegateImpl.currentIndex;
            chatIntroDelegateImpl.currentIndex = i + 1;
            i2 = chatIntroDelegateImpl.currentIndex;
            return ChatIntroUiState.copy$default(state, false, null, null, null, null, (ChatIntroCardUiParams) list.get(i2), 31, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChatIntroDelegate.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/presentation/features/chat/intro/model/ChatIntroUiState;", "state", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.presentation.features.chat.intro.delegate.ChatIntroDelegateImpl$showNextChatIntroCard$1$2  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass2 extends Lambda implements Function1<ChatIntroUiState, ChatIntroUiState> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        AnonymousClass2() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final ChatIntroUiState invoke(ChatIntroUiState state) {
            Intrinsics.checkNotNullParameter(state, "state");
            return ChatIntroUiState.copy$default(state, false, null, null, null, null, null, 62, null);
        }
    }
}
