package com.ifriend.chat.new_chat.list.adapter.delegates;

import com.hannesdorfmann.adapterdelegates4.AdapterDelegate;
import com.hannesdorfmann.adapterdelegates4.dsl.DslViewBindingListAdapterDelegate;
import com.ifriend.chat.new_chat.list.viewModel.ListItemsClick;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: TextMessageBotDelegate.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001\u001a\u001a\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"textMessageBotDelegate", "Lcom/hannesdorfmann/adapterdelegates4/AdapterDelegate;", "", "", "textPaidTextMessageFromBotDelegate", "itemsClick", "Lcom/ifriend/chat/new_chat/list/viewModel/ListItemsClick;", "new_chat_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TextMessageBotDelegateKt {
    public static final AdapterDelegate<List<Object>> textMessageBotDelegate() {
        return new DslViewBindingListAdapterDelegate(TextMessageBotDelegateKt$textMessageBotDelegate$1.INSTANCE, new TextMessageBotDelegateKt$textMessageBotDelegate$$inlined$adapterDelegateViewBinding$default$1(), TextMessageBotDelegateKt$textMessageBotDelegate$2.INSTANCE, TextMessageBotDelegateKt$textMessageBotDelegate$$inlined$adapterDelegateViewBinding$default$2.INSTANCE);
    }

    public static final AdapterDelegate<List<Object>> textPaidTextMessageFromBotDelegate(ListItemsClick itemsClick) {
        Intrinsics.checkNotNullParameter(itemsClick, "itemsClick");
        return new DslViewBindingListAdapterDelegate(TextMessageBotDelegateKt$textPaidTextMessageFromBotDelegate$1.INSTANCE, new TextMessageBotDelegateKt$textPaidTextMessageFromBotDelegate$$inlined$adapterDelegateViewBinding$default$1(), new TextMessageBotDelegateKt$textPaidTextMessageFromBotDelegate$2(itemsClick), TextMessageBotDelegateKt$textPaidTextMessageFromBotDelegate$$inlined$adapterDelegateViewBinding$default$2.INSTANCE);
    }
}
