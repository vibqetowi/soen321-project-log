package com.hannesdorfmann.adapterdelegates4.dsl;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.exifinterface.media.ExifInterface;
import androidx.viewbinding.ViewBinding;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.hannesdorfmann.adapterdelegates4.AdapterDelegate;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.DebugKt;
/* compiled from: ViewBindingListAdapterDelegateDsl.kt */
@Metadata(d1 = {"\u0000R\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u008f\u0002\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00020\u0001\"\n\b\u0000\u0010\u0004\u0018\u0001*\u0002H\u0003\"\u0004\b\u0001\u0010\u0003\"\b\b\u0002\u0010\u0005*\u00020\u000628\b\b\u0010\u0007\u001a2\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\r¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u0002H\u00050\b2S\b\n\u0010\u000f\u001aM\u0012\u0013\u0012\u0011H\u0003¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0011\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u0002H\u00030\u0002¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0012\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u00150\u00102#\b\n\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\r¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\t0\u00162%\b\b\u0010\u0017\u001a\u001f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00050\u0018\u0012\u0004\u0012\u00020\u00190\u0016¢\u0006\u0002\b\u001aH\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001b"}, d2 = {"adapterDelegateViewBinding", "Lcom/hannesdorfmann/adapterdelegates4/AdapterDelegate;", "", ExifInterface.GPS_DIRECTION_TRUE, "I", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Landroidx/viewbinding/ViewBinding;", "viewBinding", "Lkotlin/Function2;", "Landroid/view/LayoutInflater;", "Lkotlin/ParameterName;", "name", "layoutInflater", "Landroid/view/ViewGroup;", "parent", DebugKt.DEBUG_PROPERTY_VALUE_ON, "Lkotlin/Function3;", "item", FirebaseAnalytics.Param.ITEMS, "", "position", "", "Lkotlin/Function1;", "block", "Lcom/hannesdorfmann/adapterdelegates4/dsl/AdapterDelegateViewBindingViewHolder;", "", "Lkotlin/ExtensionFunctionType;", "kotlin-dsl-viewbinding_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes6.dex */
public final class ViewBindingListAdapterDelegateDslKt {
    public static /* synthetic */ AdapterDelegate adapterDelegateViewBinding$default(Function2 viewBinding, Function3 on, Function1 layoutInflater, Function1 block, int i, Object obj) {
        if ((i & 2) != 0) {
            Intrinsics.needClassReification();
            on = new ViewBindingListAdapterDelegateDslKt$adapterDelegateViewBinding$1();
        }
        if ((i & 4) != 0) {
            layoutInflater = ViewBindingListAdapterDelegateDslKt$adapterDelegateViewBinding$2.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(viewBinding, "viewBinding");
        Intrinsics.checkNotNullParameter(on, "on");
        Intrinsics.checkNotNullParameter(layoutInflater, "layoutInflater");
        Intrinsics.checkNotNullParameter(block, "block");
        return new DslViewBindingListAdapterDelegate(viewBinding, on, block, layoutInflater);
    }

    public static final /* synthetic */ <I extends T, T, V extends ViewBinding> AdapterDelegate<List<T>> adapterDelegateViewBinding(Function2<? super LayoutInflater, ? super ViewGroup, ? extends V> viewBinding, Function3<? super T, ? super List<? extends T>, ? super Integer, Boolean> on, Function1<? super ViewGroup, ? extends LayoutInflater> layoutInflater, Function1<? super AdapterDelegateViewBindingViewHolder<I, V>, Unit> block) {
        Intrinsics.checkNotNullParameter(viewBinding, "viewBinding");
        Intrinsics.checkNotNullParameter(on, "on");
        Intrinsics.checkNotNullParameter(layoutInflater, "layoutInflater");
        Intrinsics.checkNotNullParameter(block, "block");
        return new DslViewBindingListAdapterDelegate(viewBinding, on, block, layoutInflater);
    }
}
