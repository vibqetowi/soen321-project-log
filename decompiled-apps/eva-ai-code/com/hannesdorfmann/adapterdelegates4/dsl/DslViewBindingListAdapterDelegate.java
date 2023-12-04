package com.hannesdorfmann.adapterdelegates4.dsl;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.exifinterface.media.ExifInterface;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.hannesdorfmann.adapterdelegates4.AbsListItemAdapterDelegate;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.DebugKt;
/* compiled from: ViewBindingListAdapterDelegateDsl.kt */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000*\b\b\u0000\u0010\u0001*\u0002H\u0002*\u0004\b\u0001\u0010\u0002*\b\b\u0002\u0010\u0003*\u00020\u00042 \u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u00060\u0005BØ\u0001\u00126\u0010\u0007\u001a2\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\r¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00028\u00020\b\u0012Q\u0010\u000f\u001aM\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0011\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00010\u0012¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0013\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u00160\u0010\u0012#\u0010\u0017\u001a\u001f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u0006\u0012\u0004\u0012\u00020\u00190\u0018¢\u0006\u0002\b\u001a\u0012!\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\r¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\t0\u0018¢\u0006\u0002\u0010\u001bJ+\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00028\u00012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u001d2\u0006\u0010\u0015\u001a\u00020\u0014H\u0014¢\u0006\u0002\u0010\u001eJ7\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u0011\u001a\u00028\u00002\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u00062\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u001dH\u0014¢\u0006\u0002\u0010#J\u001c\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0014J\u0010\u0010%\u001a\u00020\u00162\u0006\u0010 \u001a\u00020&H\u0014J\u0010\u0010'\u001a\u00020\u00192\u0006\u0010 \u001a\u00020&H\u0014J\u0010\u0010(\u001a\u00020\u00192\u0006\u0010 \u001a\u00020&H\u0014J\u0010\u0010)\u001a\u00020\u00192\u0006\u0010 \u001a\u00020&H\u0014R>\u0010\u0007\u001a2\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\r¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00028\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R+\u0010\u0017\u001a\u001f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u0006\u0012\u0004\u0012\u00020\u00190\u0018¢\u0006\u0002\b\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R)\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\r¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\t0\u0018X\u0082\u0004¢\u0006\u0002\n\u0000RY\u0010\u000f\u001aM\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0011\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00010\u0012¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0013\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u00160\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lcom/hannesdorfmann/adapterdelegates4/dsl/DslViewBindingListAdapterDelegate;", "I", ExifInterface.GPS_DIRECTION_TRUE, ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Landroidx/viewbinding/ViewBinding;", "Lcom/hannesdorfmann/adapterdelegates4/AbsListItemAdapterDelegate;", "Lcom/hannesdorfmann/adapterdelegates4/dsl/AdapterDelegateViewBindingViewHolder;", "binding", "Lkotlin/Function2;", "Landroid/view/LayoutInflater;", "Lkotlin/ParameterName;", "name", "layoutInflater", "Landroid/view/ViewGroup;", "parent", DebugKt.DEBUG_PROPERTY_VALUE_ON, "Lkotlin/Function3;", "item", "", FirebaseAnalytics.Param.ITEMS, "", "position", "", "initializerBlock", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "isForViewType", "", "(Ljava/lang/Object;Ljava/util/List;I)Z", "onBindViewHolder", "holder", "payloads", "", "(Ljava/lang/Object;Lcom/hannesdorfmann/adapterdelegates4/dsl/AdapterDelegateViewBindingViewHolder;Ljava/util/List;)V", "onCreateViewHolder", "onFailedToRecycleView", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "onViewAttachedToWindow", "onViewDetachedFromWindow", "onViewRecycled", "kotlin-dsl-viewbinding_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes6.dex */
public final class DslViewBindingListAdapterDelegate<I extends T, T, V extends ViewBinding> extends AbsListItemAdapterDelegate<I, T, AdapterDelegateViewBindingViewHolder<I, V>> {
    private final Function2<LayoutInflater, ViewGroup, V> binding;
    private final Function1<AdapterDelegateViewBindingViewHolder<I, V>, Unit> initializerBlock;
    private final Function1<ViewGroup, LayoutInflater> layoutInflater;
    private final Function3<T, List<? extends T>, Integer, Boolean> on;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.hannesdorfmann.adapterdelegates4.AbsListItemAdapterDelegate
    public /* bridge */ /* synthetic */ void onBindViewHolder(Object obj, RecyclerView.ViewHolder viewHolder, List list) {
        onBindViewHolder((DslViewBindingListAdapterDelegate<I, T, V>) obj, (AdapterDelegateViewBindingViewHolder<DslViewBindingListAdapterDelegate<I, T, V>, V>) viewHolder, (List<Object>) list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DslViewBindingListAdapterDelegate(Function2<? super LayoutInflater, ? super ViewGroup, ? extends V> binding, Function3<? super T, ? super List<? extends T>, ? super Integer, Boolean> on, Function1<? super AdapterDelegateViewBindingViewHolder<I, V>, Unit> initializerBlock, Function1<? super ViewGroup, ? extends LayoutInflater> layoutInflater) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(on, "on");
        Intrinsics.checkNotNullParameter(initializerBlock, "initializerBlock");
        Intrinsics.checkNotNullParameter(layoutInflater, "layoutInflater");
        this.binding = binding;
        this.on = on;
        this.initializerBlock = initializerBlock;
        this.layoutInflater = layoutInflater;
    }

    @Override // com.hannesdorfmann.adapterdelegates4.AbsListItemAdapterDelegate
    protected boolean isForViewType(T t, List<T> items, int i) {
        Intrinsics.checkNotNullParameter(items, "items");
        return this.on.invoke(t, items, Integer.valueOf(i)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.hannesdorfmann.adapterdelegates4.AbsListItemAdapterDelegate, com.hannesdorfmann.adapterdelegates4.AdapterDelegate
    public AdapterDelegateViewBindingViewHolder<I, V> onCreateViewHolder(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        AdapterDelegateViewBindingViewHolder<I, V> adapterDelegateViewBindingViewHolder = new AdapterDelegateViewBindingViewHolder<>(this.binding.invoke(this.layoutInflater.invoke(parent), parent), null, 2, null);
        this.initializerBlock.invoke(adapterDelegateViewBindingViewHolder);
        return adapterDelegateViewBindingViewHolder;
    }

    protected void onBindViewHolder(I i, AdapterDelegateViewBindingViewHolder<I, V> holder, List<Object> payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        if (i != null) {
            holder.set_item$kotlin_dsl_viewbinding_release(i);
            Function1<List<? extends Object>, Unit> function1 = holder.get_bind$kotlin_dsl_viewbinding_release();
            if (function1 == null) {
                return;
            }
            function1.invoke(payloads);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.hannesdorfmann.adapterdelegates4.AdapterDelegate
    public void onViewRecycled(RecyclerView.ViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Function0<Unit> function0 = ((AdapterDelegateViewBindingViewHolder) holder).get_onViewRecycled$kotlin_dsl_viewbinding_release();
        if (function0 == null) {
            return;
        }
        function0.invoke();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.hannesdorfmann.adapterdelegates4.AdapterDelegate
    public boolean onFailedToRecycleView(RecyclerView.ViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Function0<Boolean> function0 = ((AdapterDelegateViewBindingViewHolder) holder).get_onFailedToRecycleView$kotlin_dsl_viewbinding_release();
        if (function0 == null) {
            return super.onFailedToRecycleView(holder);
        }
        return function0.invoke().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.hannesdorfmann.adapterdelegates4.AdapterDelegate
    public void onViewAttachedToWindow(RecyclerView.ViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Function0<Unit> function0 = ((AdapterDelegateViewBindingViewHolder) holder).get_onViewAttachedToWindow$kotlin_dsl_viewbinding_release();
        if (function0 == null) {
            return;
        }
        function0.invoke();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.hannesdorfmann.adapterdelegates4.AdapterDelegate
    public void onViewDetachedFromWindow(RecyclerView.ViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Function0<Unit> function0 = ((AdapterDelegateViewBindingViewHolder) holder).get_onViewDetachedFromWindow$kotlin_dsl_viewbinding_release();
        if (function0 == null) {
            return;
        }
        function0.invoke();
    }
}
