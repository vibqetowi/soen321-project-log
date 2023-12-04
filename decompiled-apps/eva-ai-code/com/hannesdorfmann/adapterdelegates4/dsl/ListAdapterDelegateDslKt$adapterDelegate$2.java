package com.hannesdorfmann.adapterdelegates4.dsl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: ListAdapterDelegateDsl.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006\"\n\b\u0000\u0010\u0000\u0018\u0001*\u00028\u0001\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n"}, d2 = {"I", ExifInterface.GPS_DIRECTION_TRUE, "Landroid/view/ViewGroup;", "parent", "", TtmlNode.TAG_LAYOUT, "Landroid/view/View;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class ListAdapterDelegateDslKt$adapterDelegate$2 extends Lambda implements Function2<ViewGroup, Integer, View> {
    public static final ListAdapterDelegateDslKt$adapterDelegate$2 INSTANCE = new ListAdapterDelegateDslKt$adapterDelegate$2();

    public ListAdapterDelegateDslKt$adapterDelegate$2() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ View invoke(ViewGroup viewGroup, Integer num) {
        return invoke(viewGroup, num.intValue());
    }

    public final View invoke(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View inflate = LayoutInflater.from(parent.getContext()).inflate(i, parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "from(parent.context).inf…          false\n        )");
        return inflate;
    }
}
