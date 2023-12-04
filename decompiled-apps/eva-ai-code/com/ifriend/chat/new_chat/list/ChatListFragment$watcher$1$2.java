package com.ifriend.chat.new_chat.list;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.ifriend.chat.new_chat.list.adapter.ChatListAdapter;
import com.ifriend.chat.new_chat.list.ui.model.TagHolder;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatListFragment.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", FirebaseAnalytics.Param.ITEMS, "", "Lcom/ifriend/chat/new_chat/list/ui/model/TagHolder;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatListFragment$watcher$1$2 extends Lambda implements Function1<List<? extends TagHolder>, Unit> {
    final /* synthetic */ ChatListFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatListFragment$watcher$1$2(ChatListFragment chatListFragment) {
        super(1);
        this.this$0 = chatListFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(List<? extends TagHolder> list) {
        invoke2(list);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<? extends TagHolder> items) {
        ChatListAdapter adapter;
        Intrinsics.checkNotNullParameter(items, "items");
        adapter = this.this$0.getAdapter();
        adapter.setItems(items);
    }
}
