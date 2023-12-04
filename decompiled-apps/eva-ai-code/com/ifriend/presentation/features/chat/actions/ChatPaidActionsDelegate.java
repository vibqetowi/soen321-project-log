package com.ifriend.presentation.features.chat.actions;

import com.facebook.internal.NativeProtocol;
import com.ifriend.presentation.features.chat.actions.ChatAction;
import com.ifriend.presentation.features.chat.screen.viewmodel.ChatViewModel;
import kotlin.Metadata;
/* compiled from: ChatPaidActionsDelegate.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J!\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&R\u00020\u0004¢\u0006\u0002\u0010\tJ\u0019\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&R\u00020\u0004¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/ifriend/presentation/features/chat/actions/ChatPaidActionsDelegate;", "", "dispatchPaidAction", "", "Lcom/ifriend/presentation/features/chat/screen/viewmodel/ChatViewModel;", NativeProtocol.WEB_DIALOG_ACTION, "Lcom/ifriend/presentation/features/chat/actions/ChatAction$PaidAction;", "chatId", "", "(Lcom/ifriend/presentation/features/chat/screen/viewmodel/ChatViewModel;Lcom/ifriend/presentation/features/chat/actions/ChatAction$PaidAction;Ljava/lang/String;)V", "initChatPaidActions", "(Lcom/ifriend/presentation/features/chat/screen/viewmodel/ChatViewModel;Ljava/lang/String;)V", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ChatPaidActionsDelegate {
    void dispatchPaidAction(ChatViewModel chatViewModel, ChatAction.PaidAction paidAction, String str);

    void initChatPaidActions(ChatViewModel chatViewModel, String str);
}
