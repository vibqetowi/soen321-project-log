package com.ifriend.chat.new_chat.list.viewModel;

import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.ifriend.chat.new_chat.list.ui.model.ChatPhotoMessageUi;
import kotlin.Metadata;
/* compiled from: ChatListViewModel.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH&¨\u0006\u000b"}, d2 = {"Lcom/ifriend/chat/new_chat/list/viewModel/ListItemsClick;", "Lcom/ifriend/chat/new_chat/list/viewModel/LoadMoreItemClick;", "Lcom/ifriend/chat/new_chat/list/viewModel/AudioItemClick;", "Lcom/ifriend/chat/new_chat/list/viewModel/RegenerationMessageItemClick;", "onPaidTextMessageClick", "", "messageId", "", "onPhotoClick", DeviceRequestsHelper.DEVICE_INFO_MODEL, "Lcom/ifriend/chat/new_chat/list/ui/model/ChatPhotoMessageUi;", "new_chat_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ListItemsClick extends LoadMoreItemClick, AudioItemClick, RegenerationMessageItemClick {
    void onPaidTextMessageClick(String str);

    void onPhotoClick(ChatPhotoMessageUi chatPhotoMessageUi);
}
