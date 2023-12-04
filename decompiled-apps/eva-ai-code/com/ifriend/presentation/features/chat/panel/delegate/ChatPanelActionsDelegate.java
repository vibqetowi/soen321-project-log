package com.ifriend.presentation.features.chat.panel.delegate;

import androidx.lifecycle.ViewModel;
import com.facebook.internal.NativeProtocol;
import com.ifriend.presentation.features.chat.actions.delegate.ChatPanelActionsEvent;
import com.ifriend.presentation.features.chat.panel.models.ChatPanelActionMarker;
import com.ifriend.presentation.features.chat.panel.models.ChatTopicsUiState;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;
/* compiled from: ChatPanelActionsDelegate.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J!\u0010\f\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H&R\u00020\u000e¢\u0006\u0002\u0010\u0013J\u0019\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012H&R\u00020\u000e¢\u0006\u0002\u0010\u0015J\u0011\u0010\u0016\u001a\u00020\rH&R\u00020\u000e¢\u0006\u0002\u0010\u0017J\u0019\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u001aH&R\u00020\u000e¢\u0006\u0002\u0010\u001bR\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/ifriend/presentation/features/chat/panel/delegate/ChatPanelActionsDelegate;", "", "panelActionsEvents", "Lkotlinx/coroutines/flow/Flow;", "Lcom/ifriend/presentation/features/chat/actions/delegate/ChatPanelActionsEvent;", "getPanelActionsEvents", "()Lkotlinx/coroutines/flow/Flow;", "panelActionsState", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/ifriend/presentation/features/chat/panel/models/ChatTopicsUiState;", "getPanelActionsState", "()Lkotlinx/coroutines/flow/StateFlow;", "chatTopicClick", "", "Landroidx/lifecycle/ViewModel;", NativeProtocol.WEB_DIALOG_ACTION, "Lcom/ifriend/presentation/features/chat/panel/models/ChatPanelActionMarker;", "chatId", "", "(Landroidx/lifecycle/ViewModel;Lcom/ifriend/presentation/features/chat/panel/models/ChatPanelActionMarker;Ljava/lang/String;)V", "initChatPanelActions", "(Landroidx/lifecycle/ViewModel;Ljava/lang/String;)V", "remindButtonClicked", "(Landroidx/lifecycle/ViewModel;)V", "remindPermissionGranted", "granted", "", "(Landroidx/lifecycle/ViewModel;Z)V", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ChatPanelActionsDelegate {
    void chatTopicClick(ViewModel viewModel, ChatPanelActionMarker chatPanelActionMarker, String str);

    Flow<ChatPanelActionsEvent> getPanelActionsEvents();

    StateFlow<ChatTopicsUiState> getPanelActionsState();

    void initChatPanelActions(ViewModel viewModel, String str);

    void remindButtonClicked(ViewModel viewModel);

    void remindPermissionGranted(ViewModel viewModel, boolean z);
}
