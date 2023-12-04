package com.ifriend.chat.new_chat.list.adapter.delegates;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.ifriend.chat.new_chat.databinding.ItemGiftUserMessageBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: GiftMessageDelegate.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lcom/ifriend/chat/new_chat/databinding/ItemGiftUserMessageBinding;", "layoutInflater", "Landroid/view/LayoutInflater;", "parent", "Landroid/view/ViewGroup;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class GiftMessageDelegateKt$giftMessageUserDelegate$1 extends Lambda implements Function2<LayoutInflater, ViewGroup, ItemGiftUserMessageBinding> {
    public static final GiftMessageDelegateKt$giftMessageUserDelegate$1 INSTANCE = new GiftMessageDelegateKt$giftMessageUserDelegate$1();

    GiftMessageDelegateKt$giftMessageUserDelegate$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final ItemGiftUserMessageBinding invoke(LayoutInflater layoutInflater, ViewGroup parent) {
        Intrinsics.checkNotNullParameter(layoutInflater, "layoutInflater");
        Intrinsics.checkNotNullParameter(parent, "parent");
        ItemGiftUserMessageBinding inflate = ItemGiftUserMessageBinding.inflate(layoutInflater, parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return inflate;
    }
}
