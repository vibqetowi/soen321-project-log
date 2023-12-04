package com.ifriend.chat.new_chat.list.adapter.delegates;

import com.hannesdorfmann.adapterdelegates4.AdapterDelegate;
import com.hannesdorfmann.adapterdelegates4.dsl.DslViewBindingListAdapterDelegate;
import java.util.List;
import kotlin.Metadata;
/* compiled from: TopicSeparatorDelegate.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0002\u001a\u0012\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001\u001a\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0005"}, d2 = {"darkTopicSeparatorDelegate", "Lcom/hannesdorfmann/adapterdelegates4/AdapterDelegate;", "", "", "premiumTopicSeparatorDelegate", "new_chat_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TopicSeparatorDelegateKt {
    public static final AdapterDelegate<List<Object>> darkTopicSeparatorDelegate() {
        return new DslViewBindingListAdapterDelegate(TopicSeparatorDelegateKt$darkTopicSeparatorDelegate$1.INSTANCE, new TopicSeparatorDelegateKt$darkTopicSeparatorDelegate$$inlined$adapterDelegateViewBinding$default$1(), TopicSeparatorDelegateKt$darkTopicSeparatorDelegate$2.INSTANCE, TopicSeparatorDelegateKt$darkTopicSeparatorDelegate$$inlined$adapterDelegateViewBinding$default$2.INSTANCE);
    }

    public static final AdapterDelegate<List<Object>> premiumTopicSeparatorDelegate() {
        return new DslViewBindingListAdapterDelegate(TopicSeparatorDelegateKt$premiumTopicSeparatorDelegate$1.INSTANCE, new TopicSeparatorDelegateKt$premiumTopicSeparatorDelegate$$inlined$adapterDelegateViewBinding$default$1(), TopicSeparatorDelegateKt$premiumTopicSeparatorDelegate$2.INSTANCE, TopicSeparatorDelegateKt$premiumTopicSeparatorDelegate$$inlined$adapterDelegateViewBinding$default$2.INSTANCE);
    }
}
