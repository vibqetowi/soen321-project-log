package com.ifriend.chat.new_chat.list.adapter;

import com.ifriend.chat.new_chat.list.ui.model.AudioMessageUserUiModel;
import com.ifriend.chat.new_chat.list.ui.model.EndCallUi;
import com.ifriend.chat.new_chat.list.ui.model.GiftUserMessageUiModel;
import com.ifriend.chat.new_chat.list.ui.model.TextMessageUserUiModel;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ChatListAdapterExt.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"isNeedShowKeyboard", "", "Lcom/ifriend/chat/new_chat/list/adapter/ChatListAdapter;", "new_chat_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatListAdapterExtKt {
    public static final boolean isNeedShowKeyboard(ChatListAdapter chatListAdapter) {
        Object obj;
        boolean z;
        Intrinsics.checkNotNullParameter(chatListAdapter, "<this>");
        List<Object> items = chatListAdapter.getItems();
        Intrinsics.checkNotNullExpressionValue(items, "getItems(...)");
        Object lastOrNull = CollectionsKt.lastOrNull((List<? extends Object>) items);
        List<Object> items2 = chatListAdapter.getItems();
        Intrinsics.checkNotNullExpressionValue(items2, "getItems(...)");
        ListIterator<Object> listIterator = items2.listIterator(items2.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            }
            obj = listIterator.previous();
            if ((obj instanceof TextMessageUserUiModel) || (obj instanceof AudioMessageUserUiModel) || (obj instanceof GiftUserMessageUiModel)) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        return ((lastOrNull instanceof EndCallUi) || (obj instanceof GiftUserMessageUiModel)) ? false : true;
    }
}
