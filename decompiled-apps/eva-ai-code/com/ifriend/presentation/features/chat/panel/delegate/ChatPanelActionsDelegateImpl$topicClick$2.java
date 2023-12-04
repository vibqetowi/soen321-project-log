package com.ifriend.presentation.features.chat.panel.delegate;

import com.ifriend.domain.logic.topics.ChatPanelActionsInteractor;
import com.ifriend.presentation.common.uistate.UiStateDelegate;
import com.ifriend.presentation.features.chat.actions.delegate.ChatPanelActionsEvent;
import com.ifriend.presentation.features.chat.panel.models.ChatPanelActionMarker;
import com.ifriend.presentation.features.chat.panel.models.ChatTopicUi;
import com.ifriend.presentation.features.chat.panel.models.ChatTopicsUiState;
import java.util.ArrayList;
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
import kotlinx.collections.immutable.ExtensionsKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatPanelActionsDelegate.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.presentation.features.chat.panel.delegate.ChatPanelActionsDelegateImpl$topicClick$2", f = "ChatPanelActionsDelegate.kt", i = {}, l = {187, 200}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class ChatPanelActionsDelegateImpl$topicClick$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $chatId;
    final /* synthetic */ ChatTopicUi $topic;
    int label;
    final /* synthetic */ ChatPanelActionsDelegateImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatPanelActionsDelegateImpl$topicClick$2(ChatPanelActionsDelegateImpl chatPanelActionsDelegateImpl, ChatTopicUi chatTopicUi, String str, Continuation<? super ChatPanelActionsDelegateImpl$topicClick$2> continuation) {
        super(2, continuation);
        this.this$0 = chatPanelActionsDelegateImpl;
        this.$topic = chatTopicUi;
        this.$chatId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatPanelActionsDelegateImpl$topicClick$2(this.this$0, this.$topic, this.$chatId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ChatPanelActionsDelegateImpl$topicClick$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ChatPanelActionsInteractor chatPanelActionsInteractor;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            UiStateDelegate<ChatTopicsUiState, ChatPanelActionsEvent> uiStateDelegate = this.this$0;
            this.label = 1;
            if (uiStateDelegate.updateUiState(uiStateDelegate, new AnonymousClass1(this.this$0, this.$topic), this) == coroutine_suspended) {
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
        this.this$0.trackTopicClick(this.$topic, this.$chatId);
        chatPanelActionsInteractor = this.this$0.chatPanelActionsInteractor;
        this.label = 2;
        if (chatPanelActionsInteractor.activateTopic(this.$topic.getId(), this.$chatId, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChatPanelActionsDelegate.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/presentation/features/chat/panel/models/ChatTopicsUiState;", "state", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.presentation.features.chat.panel.delegate.ChatPanelActionsDelegateImpl$topicClick$2$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Function1<ChatTopicsUiState, ChatTopicsUiState> {
        final /* synthetic */ ChatTopicUi $topic;
        final /* synthetic */ ChatPanelActionsDelegateImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ChatPanelActionsDelegateImpl chatPanelActionsDelegateImpl, ChatTopicUi chatTopicUi) {
            super(1);
            this.this$0 = chatPanelActionsDelegateImpl;
            this.$topic = chatTopicUi;
        }

        @Override // kotlin.jvm.functions.Function1
        public final ChatTopicsUiState invoke(ChatTopicsUiState state) {
            Intrinsics.checkNotNullParameter(state, "state");
            UiStateDelegate<ChatTopicsUiState, ChatPanelActionsEvent> uiStateDelegate = this.this$0;
            ImmutableList<ChatPanelActionMarker> topics = uiStateDelegate.getUiState(uiStateDelegate).getTopics();
            ChatTopicUi chatTopicUi = this.$topic;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(topics, 10));
            for (ChatTopicUi chatTopicUi2 : topics) {
                if ((chatTopicUi2 instanceof ChatTopicUi) && Intrinsics.areEqual(chatTopicUi.getId(), chatTopicUi2.getId())) {
                    chatTopicUi2 = ChatTopicUi.copy$default((ChatTopicUi) chatTopicUi2, null, null, null, true, 7, null);
                }
                arrayList.add(chatTopicUi2);
            }
            return ChatTopicsUiState.copy$default(state, ExtensionsKt.toImmutableList(arrayList), false, null, false, false, false, 60, null);
        }
    }
}
