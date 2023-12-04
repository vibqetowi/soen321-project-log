package com.ifriend.presentation.features.profile.header.delegate;

import androidx.lifecycle.ViewModel;
import com.ifriend.presentation.features.profile.header.model.ChatHeaderUiState;
import kotlin.Metadata;
import kotlinx.coroutines.flow.StateFlow;
/* compiled from: ChatHeaderDelegate.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0007\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH&R\u00020\t¢\u0006\u0002\u0010\fR\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\r"}, d2 = {"Lcom/ifriend/presentation/features/profile/header/delegate/ChatHeaderDelegate;", "", "chatHeaderState", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/ifriend/presentation/features/profile/header/model/ChatHeaderUiState;", "getChatHeaderState", "()Lkotlinx/coroutines/flow/StateFlow;", "initChatHeader", "", "Landroidx/lifecycle/ViewModel;", "chatId", "", "(Landroidx/lifecycle/ViewModel;Ljava/lang/String;)V", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ChatHeaderDelegate {
    StateFlow<ChatHeaderUiState> getChatHeaderState();

    void initChatHeader(ViewModel viewModel, String str);
}
