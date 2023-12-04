package com.ifriend.chat.new_chat.list;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.ifriend.chat.new_chat.list.viewModel.ChatListViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;
/* compiled from: ChatListFragment.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
/* synthetic */ class ChatListFragment$watcher$1$1 extends PropertyReference1Impl {
    public static final ChatListFragment$watcher$1$1 INSTANCE = new ChatListFragment$watcher$1$1();

    ChatListFragment$watcher$1$1() {
        super(ChatListViewModel.UiState.class, FirebaseAnalytics.Param.ITEMS, "getItems()Ljava/util/List;", 0);
    }

    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
    public Object get(Object obj) {
        return ((ChatListViewModel.UiState) obj).getItems();
    }
}
