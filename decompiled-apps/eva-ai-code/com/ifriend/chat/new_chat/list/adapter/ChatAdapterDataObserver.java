package com.ifriend.chat.new_chat.list.adapter;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ifriend.chat.new_chat.list.ui.model.TagHolder;
import com.ifriend.chat.new_chat.list.viewModel.ChatListViewModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ChatAdapterDataObserver.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0002J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/ifriend/chat/new_chat/list/adapter/ChatAdapterDataObserver;", "Landroidx/recyclerview/widget/RecyclerView$AdapterDataObserver;", "adapter", "Lcom/ifriend/chat/new_chat/list/adapter/ChatListAdapter;", "layoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "viewModel", "Lcom/ifriend/chat/new_chat/list/viewModel/ChatListViewModel;", "(Lcom/ifriend/chat/new_chat/list/adapter/ChatListAdapter;Landroidx/recyclerview/widget/LinearLayoutManager;Lcom/ifriend/chat/new_chat/list/viewModel/ChatListViewModel;)V", "isInsertToEnd", "", "positionStart", "", "itemCount", "onItemRangeInserted", "", "new_chat_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatAdapterDataObserver extends RecyclerView.AdapterDataObserver {
    public static final int $stable = 8;
    private final ChatListAdapter adapter;
    private final LinearLayoutManager layoutManager;
    private final ChatListViewModel viewModel;

    public ChatAdapterDataObserver(ChatListAdapter adapter, LinearLayoutManager layoutManager, ChatListViewModel viewModel) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(layoutManager, "layoutManager");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        this.adapter = adapter;
        this.layoutManager = layoutManager;
        this.viewModel = viewModel;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
    public void onItemRangeInserted(int i, int i2) {
        List<Object> items = this.adapter.getItems();
        Intrinsics.checkNotNullExpressionValue(items, "getItems(...)");
        int lastIndex = CollectionsKt.getLastIndex(items);
        if (!isInsertToEnd(i, i2) || lastIndex == -1) {
            return;
        }
        LinearLayoutManager linearLayoutManager = this.layoutManager;
        List<Object> items2 = this.adapter.getItems();
        Intrinsics.checkNotNullExpressionValue(items2, "getItems(...)");
        linearLayoutManager.scrollToPosition(CollectionsKt.getLastIndex(items2));
        for (int i3 = 0; i3 < i2; i3++) {
            Object obj = this.adapter.getItems().get(i + i3);
            TagHolder tagHolder = obj instanceof TagHolder ? (TagHolder) obj : null;
            if (tagHolder != null) {
                this.viewModel.onItemShown(tagHolder);
            }
        }
    }

    private final boolean isInsertToEnd(int i, int i2) {
        return this.adapter.getItems().size() - i2 == i;
    }
}
