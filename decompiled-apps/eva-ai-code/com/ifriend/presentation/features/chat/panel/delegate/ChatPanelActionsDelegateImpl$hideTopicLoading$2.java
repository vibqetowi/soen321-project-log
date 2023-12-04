package com.ifriend.presentation.features.chat.panel.delegate;

import com.ifriend.presentation.common.uistate.UiStateDelegate;
import com.ifriend.presentation.features.chat.actions.delegate.ChatPanelActionsEvent;
import com.ifriend.presentation.features.chat.panel.models.ChatPanelActionMarker;
import com.ifriend.presentation.features.chat.panel.models.ChatTopicUi;
import com.ifriend.presentation.features.chat.panel.models.ChatTopicsUiState;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.collections.immutable.ExtensionsKt;
import kotlinx.collections.immutable.ImmutableList;
/* compiled from: ChatPanelActionsDelegate.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/presentation/features/chat/panel/models/ChatTopicsUiState;", "state", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ChatPanelActionsDelegateImpl$hideTopicLoading$2 extends Lambda implements Function1<ChatTopicsUiState, ChatTopicsUiState> {
    final /* synthetic */ ChatTopicUi $topic;
    final /* synthetic */ ChatPanelActionsDelegateImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatPanelActionsDelegateImpl$hideTopicLoading$2(ChatPanelActionsDelegateImpl chatPanelActionsDelegateImpl, ChatTopicUi chatTopicUi) {
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
                chatTopicUi2 = ChatTopicUi.copy$default((ChatTopicUi) chatTopicUi2, null, null, null, false, 7, null);
            }
            arrayList.add(chatTopicUi2);
        }
        return ChatTopicsUiState.copy$default(state, ExtensionsKt.toImmutableList(arrayList), false, null, false, false, false, 62, null);
    }
}
