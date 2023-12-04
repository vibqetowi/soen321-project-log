package com.ifriend.chat.new_chat.list;

import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ifriend.chat.new_chat.backstack.ChatBackStackChangedListenerKt;
import com.ifriend.chat.new_chat.list.adapter.ChatListAdapter;
import com.ifriend.chat.new_chat.list.adapter.ChatListAdapterExtKt;
import com.ifriend.chat.new_chat.list.imageLoader.ImageLoader;
import com.ifriend.chat.new_chat.list.viewModel.ChatListViewModel;
import com.ifriend.common_utils.extensions.ommonKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatListFragment.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ifriend/chat/new_chat/list/adapter/ChatListAdapter;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatListFragment$adapter$2 extends Lambda implements Function0<ChatListAdapter> {
    final /* synthetic */ ChatListFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatListFragment$adapter$2(ChatListFragment chatListFragment) {
        super(0);
        this.this$0 = chatListFragment;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final ChatListAdapter invoke() {
        ChatListViewModel viewModel;
        ImageLoader imageLoader = this.this$0.getImageLoader();
        viewModel = this.this$0.getViewModel();
        ChatListAdapter chatListAdapter = new ChatListAdapter(imageLoader, viewModel, this.this$0.getAudioPlayer());
        final ChatListFragment chatListFragment = this.this$0;
        chatListAdapter.registerAdapterDataObserver(new RecyclerView.AdapterDataObserver() { // from class: com.ifriend.chat.new_chat.list.ChatListFragment$adapter$2$1$1
            @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
            public void onItemRangeInserted(int i, int i2) {
                ChatListAdapter adapter;
                ChatListAdapter adapter2;
                ChatListViewModel viewModel2;
                boolean shouldShowKeyboardOnStart;
                adapter = ChatListFragment.this.getAdapter();
                if (i2 == adapter.getItemCount() && i == 0) {
                    shouldShowKeyboardOnStart = ChatListFragment.this.getShouldShowKeyboardOnStart();
                    if (!shouldShowKeyboardOnStart) {
                        return;
                    }
                }
                boolean isInsertToEnd = isInsertToEnd(i, i2);
                FragmentManager childFragmentManager = ChatListFragment.this.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                boolean isChatFragmentForeground = ChatBackStackChangedListenerKt.isChatFragmentForeground(childFragmentManager);
                adapter2 = ChatListFragment.this.getAdapter();
                if (!(adapter2 instanceof ChatListAdapter)) {
                    adapter2 = null;
                }
                boolean orFalse = ommonKt.orFalse(adapter2 != null ? Boolean.valueOf(ChatListAdapterExtKt.isNeedShowKeyboard(adapter2)) : null);
                if (isInsertToEnd && isChatFragmentForeground && orFalse) {
                    viewModel2 = ChatListFragment.this.getViewModel();
                    viewModel2.showKeyboard();
                }
            }

            private final boolean isInsertToEnd(int i, int i2) {
                ChatListAdapter adapter;
                adapter = ChatListFragment.this.getAdapter();
                return adapter.getItemCount() - i2 == i;
            }
        });
        return chatListAdapter;
    }
}
