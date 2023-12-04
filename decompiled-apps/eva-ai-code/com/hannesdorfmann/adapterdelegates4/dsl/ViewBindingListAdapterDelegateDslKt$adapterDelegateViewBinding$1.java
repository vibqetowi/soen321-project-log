package com.hannesdorfmann.adapterdelegates4.dsl;

import androidx.exifinterface.media.ExifInterface;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: ViewBindingListAdapterDelegateDsl.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\n\u001a\u00020\t\"\n\b\u0000\u0010\u0000\u0018\u0001*\u00028\u0001\"\u0004\b\u0001\u0010\u0001\"\b\b\u0002\u0010\u0003*\u00020\u00022\u0006\u0010\u0004\u001a\u00028\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u00052\u0006\u0010\b\u001a\u00020\u0007H\n"}, d2 = {"I", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/viewbinding/ViewBinding;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "item", "", "<anonymous parameter 1>", "", "<anonymous parameter 2>", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class ViewBindingListAdapterDelegateDslKt$adapterDelegateViewBinding$1 extends Lambda implements Function3<T, List<? extends T>, Integer, Boolean> {
    public ViewBindingListAdapterDelegateDslKt$adapterDelegateViewBinding$1() {
        super(3);
    }

    public final Boolean invoke(T t, List<? extends T> noName_1, int i) {
        Intrinsics.checkNotNullParameter(noName_1, "$noName_1");
        Intrinsics.reifiedOperationMarker(3, "I");
        return Boolean.valueOf(t instanceof Object);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Boolean invoke(Object obj, Object obj2, Integer num) {
        return invoke((ViewBindingListAdapterDelegateDslKt$adapterDelegateViewBinding$1) obj, (List<? extends ViewBindingListAdapterDelegateDslKt$adapterDelegateViewBinding$1>) obj2, num.intValue());
    }
}
