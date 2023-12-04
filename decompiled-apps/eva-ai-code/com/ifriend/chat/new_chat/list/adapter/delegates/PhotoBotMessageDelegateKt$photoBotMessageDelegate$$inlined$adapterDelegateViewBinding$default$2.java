package com.ifriend.chat.new_chat.list.adapter.delegates;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: ViewBindingListAdapterDelegateDsl.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006\"\n\b\u0000\u0010\u0000\u0018\u0001*\u00028\u0001\"\u0004\b\u0001\u0010\u0001\"\b\b\u0002\u0010\u0003*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¨\u0006\b"}, d2 = {"I", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/viewbinding/ViewBinding;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Landroid/view/ViewGroup;", "parent", "Landroid/view/LayoutInflater;", "kotlin.jvm.PlatformType", "com/hannesdorfmann/adapterdelegates4/dsl/ViewBindingListAdapterDelegateDslKt$adapterDelegateViewBinding$2", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes6.dex */
public final class PhotoBotMessageDelegateKt$photoBotMessageDelegate$$inlined$adapterDelegateViewBinding$default$2 extends Lambda implements Function1<ViewGroup, LayoutInflater> {
    public static final PhotoBotMessageDelegateKt$photoBotMessageDelegate$$inlined$adapterDelegateViewBinding$default$2 INSTANCE = new PhotoBotMessageDelegateKt$photoBotMessageDelegate$$inlined$adapterDelegateViewBinding$default$2();

    public PhotoBotMessageDelegateKt$photoBotMessageDelegate$$inlined$adapterDelegateViewBinding$default$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final LayoutInflater invoke(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        LayoutInflater from = LayoutInflater.from(parent.getContext());
        Intrinsics.checkNotNullExpressionValue(from, "from(parent.context)");
        return from;
    }
}
