package com.hannesdorfmann.adapterdelegates4.dsl;

import android.view.View;
import android.view.ViewGroup;
import androidx.exifinterface.media.ExifInterface;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
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
/* compiled from: ListAdapterDelegateDsl.kt */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000*\b\b\u0000\u0010\u0001*\u0002H\u0002*\u0004\b\u0001\u0010\u00022\u001a\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00040\u0003B¹\u0001\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012Q\u0010\u0007\u001aM\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00010\f¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f0\b\u0012\u001d\u0010\u0010\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0002\b\u0013\u00126\u0010\u0014\u001a2\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0017\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00180\u0015¢\u0006\u0002\u0010\u0019J+\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00028\u00012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\u001b2\u0006\u0010\u000e\u001a\u00020\u0006H\u0014¢\u0006\u0002\u0010\u001cJ1\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00028\u00002\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u001bH\u0014¢\u0006\u0002\u0010!J\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0017\u001a\u00020\u0016H\u0014J\u0010\u0010#\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020$H\u0014J\u0010\u0010%\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020$H\u0014J\u0010\u0010&\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020$H\u0014J\u0010\u0010'\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020$H\u0014R%\u0010\u0010\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0002\b\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R>\u0010\u0014\u001a2\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0017\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00180\u0015X\u0082\u0004¢\u0006\u0002\n\u0000RY\u0010\u0007\u001aM\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00010\f¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f0\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/hannesdorfmann/adapterdelegates4/dsl/DslListAdapterDelegate;", "I", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/hannesdorfmann/adapterdelegates4/AbsListItemAdapterDelegate;", "Lcom/hannesdorfmann/adapterdelegates4/dsl/AdapterDelegateViewHolder;", TtmlNode.TAG_LAYOUT, "", DebugKt.DEBUG_PROPERTY_VALUE_ON, "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "item", "", FirebaseAnalytics.Param.ITEMS, "position", "", "initializerBlock", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "layoutInflater", "Lkotlin/Function2;", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "(ILkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V", "isForViewType", "", "(Ljava/lang/Object;Ljava/util/List;I)Z", "onBindViewHolder", "holder", "payloads", "", "(Ljava/lang/Object;Lcom/hannesdorfmann/adapterdelegates4/dsl/AdapterDelegateViewHolder;Ljava/util/List;)V", "onCreateViewHolder", "onFailedToRecycleView", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "onViewAttachedToWindow", "onViewDetachedFromWindow", "onViewRecycled", "kotlin-dsl_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes6.dex */
public final class DslListAdapterDelegate<I extends T, T> extends AbsListItemAdapterDelegate<I, T, AdapterDelegateViewHolder<I>> {
    private final Function1<AdapterDelegateViewHolder<I>, Unit> initializerBlock;
    private final int layout;
    private final Function2<ViewGroup, Integer, View> layoutInflater;
    private final Function3<T, List<? extends T>, Integer, Boolean> on;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.hannesdorfmann.adapterdelegates4.AbsListItemAdapterDelegate
    public /* bridge */ /* synthetic */ void onBindViewHolder(Object obj, RecyclerView.ViewHolder viewHolder, List list) {
        onBindViewHolder((DslListAdapterDelegate<I, T>) obj, (AdapterDelegateViewHolder<DslListAdapterDelegate<I, T>>) viewHolder, (List<Object>) list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DslListAdapterDelegate(int i, Function3<? super T, ? super List<? extends T>, ? super Integer, Boolean> on, Function1<? super AdapterDelegateViewHolder<I>, Unit> initializerBlock, Function2<? super ViewGroup, ? super Integer, ? extends View> layoutInflater) {
        Intrinsics.checkNotNullParameter(on, "on");
        Intrinsics.checkNotNullParameter(initializerBlock, "initializerBlock");
        Intrinsics.checkNotNullParameter(layoutInflater, "layoutInflater");
        this.layout = i;
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
    public AdapterDelegateViewHolder<I> onCreateViewHolder(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        AdapterDelegateViewHolder<I> adapterDelegateViewHolder = new AdapterDelegateViewHolder<>(this.layoutInflater.invoke(parent, Integer.valueOf(this.layout)));
        this.initializerBlock.invoke(adapterDelegateViewHolder);
        return adapterDelegateViewHolder;
    }

    protected void onBindViewHolder(I i, AdapterDelegateViewHolder<I> holder, List<Object> payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        if (i != null) {
            holder.set_item$kotlin_dsl_release(i);
            Function1<List<? extends Object>, Unit> function1 = holder.get_bind$kotlin_dsl_release();
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
        Function0<Unit> function0 = ((AdapterDelegateViewHolder) holder).get_onViewRecycled$kotlin_dsl_release();
        if (function0 == null) {
            return;
        }
        function0.invoke();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.hannesdorfmann.adapterdelegates4.AdapterDelegate
    public boolean onFailedToRecycleView(RecyclerView.ViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Function0<Boolean> function0 = ((AdapterDelegateViewHolder) holder).get_onFailedToRecycleView$kotlin_dsl_release();
        if (function0 == null) {
            return super.onFailedToRecycleView(holder);
        }
        return function0.invoke().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.hannesdorfmann.adapterdelegates4.AdapterDelegate
    public void onViewAttachedToWindow(RecyclerView.ViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Function0<Unit> function0 = ((AdapterDelegateViewHolder) holder).get_onViewAttachedToWindow$kotlin_dsl_release();
        if (function0 == null) {
            return;
        }
        function0.invoke();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.hannesdorfmann.adapterdelegates4.AdapterDelegate
    public void onViewDetachedFromWindow(RecyclerView.ViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Function0<Unit> function0 = ((AdapterDelegateViewHolder) holder).get_onViewDetachedFromWindow$kotlin_dsl_release();
        if (function0 == null) {
            return;
        }
        function0.invoke();
    }
}
