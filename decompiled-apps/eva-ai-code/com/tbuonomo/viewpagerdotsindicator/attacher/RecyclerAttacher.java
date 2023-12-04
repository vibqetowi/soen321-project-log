package com.tbuonomo.viewpagerdotsindicator.attacher;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator;
import com.tbuonomo.viewpagerdotsindicator.OnPageChangeListenerHelper;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: RecyclerAttacher.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0001B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001c\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016J\u0018\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00032\u0006\u0010\u000b\u001a\u00020\u0002H\u0016J*\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00022\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u00032\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0012H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/tbuonomo/viewpagerdotsindicator/attacher/RecyclerAttacher;", "Lcom/tbuonomo/viewpagerdotsindicator/attacher/DotsIndicatorAttacher;", "Landroidx/recyclerview/widget/RecyclerView;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "snapHelper", "Landroidx/recyclerview/widget/PagerSnapHelper;", "(Landroidx/recyclerview/widget/PagerSnapHelper;)V", "getSnapHelper", "()Landroidx/recyclerview/widget/PagerSnapHelper;", "buildPager", "Lcom/tbuonomo/viewpagerdotsindicator/BaseDotsIndicator$Pager;", "attachable", "adapter", "getAdapterFromAttachable", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "registerAdapterDataChangedObserver", "", "onChanged", "Lkotlin/Function0;", "viewpagerdotsindicator_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
final class RecyclerAttacher extends DotsIndicatorAttacher<RecyclerView, RecyclerView.Adapter<?>> {
    private final PagerSnapHelper snapHelper;

    public final PagerSnapHelper getSnapHelper() {
        return this.snapHelper;
    }

    @Override // com.tbuonomo.viewpagerdotsindicator.attacher.DotsIndicatorAttacher
    public /* bridge */ /* synthetic */ void registerAdapterDataChangedObserver(RecyclerView recyclerView, RecyclerView.Adapter<?> adapter, Function0 function0) {
        registerAdapterDataChangedObserver2(recyclerView, adapter, (Function0<Unit>) function0);
    }

    public RecyclerAttacher(PagerSnapHelper snapHelper) {
        Intrinsics.checkNotNullParameter(snapHelper, "snapHelper");
        this.snapHelper = snapHelper;
    }

    @Override // com.tbuonomo.viewpagerdotsindicator.attacher.DotsIndicatorAttacher
    public RecyclerView.Adapter<RecyclerView.ViewHolder> getAdapterFromAttachable(RecyclerView attachable) {
        Intrinsics.checkNotNullParameter(attachable, "attachable");
        return attachable.getAdapter();
    }

    /* renamed from: registerAdapterDataChangedObserver  reason: avoid collision after fix types in other method */
    public void registerAdapterDataChangedObserver2(RecyclerView attachable, RecyclerView.Adapter<?> adapter, final Function0<Unit> onChanged) {
        Intrinsics.checkNotNullParameter(attachable, "attachable");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(onChanged, "onChanged");
        adapter.registerAdapterDataObserver(new RecyclerView.AdapterDataObserver() { // from class: com.tbuonomo.viewpagerdotsindicator.attacher.RecyclerAttacher$registerAdapterDataChangedObserver$1
            @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
            public void onChanged() {
                super.onChanged();
                onChanged.invoke();
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
            public void onItemRangeChanged(int i, int i2) {
                super.onItemRangeChanged(i, i2);
                onChanged.invoke();
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
            public void onItemRangeChanged(int i, int i2, Object obj) {
                super.onItemRangeChanged(i, i2, obj);
                onChanged.invoke();
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
            public void onItemRangeInserted(int i, int i2) {
                super.onItemRangeInserted(i, i2);
                onChanged.invoke();
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
            public void onItemRangeRemoved(int i, int i2) {
                super.onItemRangeRemoved(i, i2);
                onChanged.invoke();
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
            public void onItemRangeMoved(int i, int i2, int i3) {
                super.onItemRangeMoved(i, i2, i3);
                onChanged.invoke();
            }
        });
    }

    @Override // com.tbuonomo.viewpagerdotsindicator.attacher.DotsIndicatorAttacher
    public BaseDotsIndicator.Pager buildPager(final RecyclerView attachable, final RecyclerView.Adapter<?> adapter) {
        Intrinsics.checkNotNullParameter(attachable, "attachable");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        return new BaseDotsIndicator.Pager() { // from class: com.tbuonomo.viewpagerdotsindicator.attacher.RecyclerAttacher$buildPager$1
            private RecyclerView.OnScrollListener onScrollListener;

            public final RecyclerView.OnScrollListener getOnScrollListener() {
                return this.onScrollListener;
            }

            public final void setOnScrollListener(RecyclerView.OnScrollListener onScrollListener) {
                this.onScrollListener = onScrollListener;
            }

            @Override // com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator.Pager
            public boolean isNotEmpty() {
                return adapter.getItemCount() > 0;
            }

            @Override // com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator.Pager
            public int getCurrentItem() {
                View findSnapView = this.getSnapHelper().findSnapView(attachable.getLayoutManager());
                if (findSnapView != null) {
                    RecyclerView.LayoutManager layoutManager = attachable.getLayoutManager();
                    if (layoutManager != null) {
                        return ((LinearLayoutManager) layoutManager).getPosition(findSnapView);
                    }
                    throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                }
                return 0;
            }

            @Override // com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator.Pager
            public boolean isEmpty() {
                return adapter.getItemCount() == 0;
            }

            @Override // com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator.Pager
            public int getCount() {
                return adapter.getItemCount();
            }

            @Override // com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator.Pager
            public void setCurrentItem(int i, boolean z) {
                if (z) {
                    attachable.smoothScrollToPosition(i);
                } else {
                    attachable.scrollToPosition(i);
                }
            }

            @Override // com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator.Pager
            public void removeOnPageChangeListener() {
                RecyclerView.OnScrollListener onScrollListener = this.onScrollListener;
                if (onScrollListener != null) {
                    attachable.removeOnScrollListener(onScrollListener);
                }
            }

            @Override // com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator.Pager
            public void addOnPageChangeListener(final OnPageChangeListenerHelper onPageChangeListenerHelper) {
                Intrinsics.checkNotNullParameter(onPageChangeListenerHelper, "onPageChangeListenerHelper");
                final RecyclerAttacher recyclerAttacher = this;
                RecyclerView.OnScrollListener onScrollListener = new RecyclerView.OnScrollListener() { // from class: com.tbuonomo.viewpagerdotsindicator.attacher.RecyclerAttacher$buildPager$1$addOnPageChangeListener$1
                    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
                    public void onScrolled(RecyclerView attachable2, int i, int i2) {
                        Intrinsics.checkNotNullParameter(attachable2, "attachable");
                        View findSnapView = RecyclerAttacher.this.getSnapHelper().findSnapView(attachable2.getLayoutManager());
                        if (findSnapView != null) {
                            RecyclerView.LayoutManager layoutManager = attachable2.getLayoutManager();
                            Integer valueOf = layoutManager != null ? Integer.valueOf(layoutManager.getPosition(findSnapView)) : null;
                            if (valueOf != null) {
                                onPageChangeListenerHelper.onPageScrolled(valueOf.intValue(), i);
                            }
                        }
                    }
                };
                this.onScrollListener = onScrollListener;
                RecyclerView recyclerView = attachable;
                Intrinsics.checkNotNull(onScrollListener);
                recyclerView.addOnScrollListener(onScrollListener);
            }
        };
    }
}
