package com.hannesdorfmann.adapterdelegates4.dsl;

import android.view.View;
import android.view.ViewGroup;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
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
/* compiled from: ListAdapterDelegateDsl.kt */
@Metadata(d1 = {"\u0000J\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001aä\u0001\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00020\u0001\"\n\b\u0000\u0010\u0004\u0018\u0001*\u0002H\u0003\"\u0004\b\u0001\u0010\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062S\b\n\u0010\u0007\u001aM\u0012\u0013\u0012\u0011H\u0003¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u0002H\u00030\u0002¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e0\b28\b\n\u0010\u000f\u001a2\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0012\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00140\u00102\u001f\b\b\u0010\u0015\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u0017\u0012\u0004\u0012\u00020\u00180\u0016¢\u0006\u0002\b\u0019H\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001a"}, d2 = {"adapterDelegate", "Lcom/hannesdorfmann/adapterdelegates4/AdapterDelegate;", "", ExifInterface.GPS_DIRECTION_TRUE, "I", TtmlNode.TAG_LAYOUT, "", DebugKt.DEBUG_PROPERTY_VALUE_ON, "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "item", FirebaseAnalytics.Param.ITEMS, "position", "", "layoutInflater", "Lkotlin/Function2;", "Landroid/view/ViewGroup;", "parent", "layoutRes", "Landroid/view/View;", "block", "Lkotlin/Function1;", "Lcom/hannesdorfmann/adapterdelegates4/dsl/AdapterDelegateViewHolder;", "", "Lkotlin/ExtensionFunctionType;", "kotlin-dsl_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes6.dex */
public final class ListAdapterDelegateDslKt {
    public static /* synthetic */ AdapterDelegate adapterDelegate$default(int i, Function3 on, Function2 layoutInflater, Function1 block, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            Intrinsics.needClassReification();
            on = new ListAdapterDelegateDslKt$adapterDelegate$1();
        }
        if ((i2 & 4) != 0) {
            layoutInflater = ListAdapterDelegateDslKt$adapterDelegate$2.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(on, "on");
        Intrinsics.checkNotNullParameter(layoutInflater, "layoutInflater");
        Intrinsics.checkNotNullParameter(block, "block");
        return new DslListAdapterDelegate(i, on, block, layoutInflater);
    }

    public static final /* synthetic */ <I extends T, T> AdapterDelegate<List<T>> adapterDelegate(int i, Function3<? super T, ? super List<? extends T>, ? super Integer, Boolean> on, Function2<? super ViewGroup, ? super Integer, ? extends View> layoutInflater, Function1<? super AdapterDelegateViewHolder<I>, Unit> block) {
        Intrinsics.checkNotNullParameter(on, "on");
        Intrinsics.checkNotNullParameter(layoutInflater, "layoutInflater");
        Intrinsics.checkNotNullParameter(block, "block");
        return new DslListAdapterDelegate(i, on, block, layoutInflater);
    }
}
