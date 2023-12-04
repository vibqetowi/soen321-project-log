package com.ifriend.chat.new_chat.list.adapter.delegates;

import com.hannesdorfmann.adapterdelegates4.AdapterDelegate;
import com.hannesdorfmann.adapterdelegates4.dsl.DslViewBindingListAdapterDelegate;
import com.ifriend.chat.new_chat.list.viewModel.RegenerationMessageItemClick;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: RegenerateMessageDelegate.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"regenerationMessageDelegate", "Lcom/hannesdorfmann/adapterdelegates4/AdapterDelegate;", "", "", "regenerationMessageItemClick", "Lcom/ifriend/chat/new_chat/list/viewModel/RegenerationMessageItemClick;", "new_chat_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RegenerateMessageDelegateKt {
    public static final AdapterDelegate<List<Object>> regenerationMessageDelegate(RegenerationMessageItemClick regenerationMessageItemClick) {
        Intrinsics.checkNotNullParameter(regenerationMessageItemClick, "regenerationMessageItemClick");
        return new DslViewBindingListAdapterDelegate(RegenerateMessageDelegateKt$regenerationMessageDelegate$1.INSTANCE, new RegenerateMessageDelegateKt$regenerationMessageDelegate$$inlined$adapterDelegateViewBinding$default$1(), new RegenerateMessageDelegateKt$regenerationMessageDelegate$2(regenerationMessageItemClick), RegenerateMessageDelegateKt$regenerationMessageDelegate$$inlined$adapterDelegateViewBinding$default$2.INSTANCE);
    }
}
