package com.ifriend.chat.new_chat.list.adapter.delegates;

import com.hannesdorfmann.adapterdelegates4.AdapterDelegate;
import com.hannesdorfmann.adapterdelegates4.dsl.DslViewBindingListAdapterDelegate;
import com.ifriend.chat.new_chat.list.imageLoader.ImageLoader;
import com.ifriend.chat.new_chat.list.viewModel.ListItemsClick;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ImageMessageUserDelegate.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\"\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"imageMessageUserDelegate", "Lcom/hannesdorfmann/adapterdelegates4/AdapterDelegate;", "", "", "imageLoader", "Lcom/ifriend/chat/new_chat/list/imageLoader/ImageLoader;", "itemsClick", "Lcom/ifriend/chat/new_chat/list/viewModel/ListItemsClick;", "new_chat_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ImageMessageUserDelegateKt {
    public static final AdapterDelegate<List<Object>> imageMessageUserDelegate(ImageLoader imageLoader, ListItemsClick itemsClick) {
        Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
        Intrinsics.checkNotNullParameter(itemsClick, "itemsClick");
        return new DslViewBindingListAdapterDelegate(ImageMessageUserDelegateKt$imageMessageUserDelegate$1.INSTANCE, new ImageMessageUserDelegateKt$imageMessageUserDelegate$$inlined$adapterDelegateViewBinding$default$1(), new ImageMessageUserDelegateKt$imageMessageUserDelegate$2(itemsClick, imageLoader), ImageMessageUserDelegateKt$imageMessageUserDelegate$$inlined$adapterDelegateViewBinding$default$2.INSTANCE);
    }
}
