package com.tbuonomo.viewpagerdotsindicator.attacher;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator;
import com.tbuonomo.viewpagerdotsindicator.ExtensionsKt;
import com.tbuonomo.viewpagerdotsindicator.OnPageChangeListenerHelper;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ViewPager2Attacher.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u001c\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016J\u0016\u0010\t\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J*\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00022\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00032\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\rH\u0016¨\u0006\u000e"}, d2 = {"Lcom/tbuonomo/viewpagerdotsindicator/attacher/ViewPager2Attacher;", "Lcom/tbuonomo/viewpagerdotsindicator/attacher/DotsIndicatorAttacher;", "Landroidx/viewpager2/widget/ViewPager2;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "()V", "buildPager", "Lcom/tbuonomo/viewpagerdotsindicator/BaseDotsIndicator$Pager;", "attachable", "adapter", "getAdapterFromAttachable", "registerAdapterDataChangedObserver", "", "onChanged", "Lkotlin/Function0;", "viewpagerdotsindicator_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ViewPager2Attacher extends DotsIndicatorAttacher<ViewPager2, RecyclerView.Adapter<?>> {
    @Override // com.tbuonomo.viewpagerdotsindicator.attacher.DotsIndicatorAttacher
    public /* bridge */ /* synthetic */ void registerAdapterDataChangedObserver(ViewPager2 viewPager2, RecyclerView.Adapter<?> adapter, Function0 function0) {
        registerAdapterDataChangedObserver2(viewPager2, adapter, (Function0<Unit>) function0);
    }

    @Override // com.tbuonomo.viewpagerdotsindicator.attacher.DotsIndicatorAttacher
    public RecyclerView.Adapter<?> getAdapterFromAttachable(ViewPager2 attachable) {
        Intrinsics.checkNotNullParameter(attachable, "attachable");
        return attachable.getAdapter();
    }

    /* renamed from: registerAdapterDataChangedObserver  reason: avoid collision after fix types in other method */
    public void registerAdapterDataChangedObserver2(ViewPager2 attachable, RecyclerView.Adapter<?> adapter, final Function0<Unit> onChanged) {
        Intrinsics.checkNotNullParameter(attachable, "attachable");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(onChanged, "onChanged");
        adapter.registerAdapterDataObserver(new RecyclerView.AdapterDataObserver() { // from class: com.tbuonomo.viewpagerdotsindicator.attacher.ViewPager2Attacher$registerAdapterDataChangedObserver$1
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
    public BaseDotsIndicator.Pager buildPager(final ViewPager2 attachable, RecyclerView.Adapter<?> adapter) {
        Intrinsics.checkNotNullParameter(attachable, "attachable");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        return new BaseDotsIndicator.Pager() { // from class: com.tbuonomo.viewpagerdotsindicator.attacher.ViewPager2Attacher$buildPager$1
            private ViewPager2.OnPageChangeCallback onPageChangeCallback;

            public final ViewPager2.OnPageChangeCallback getOnPageChangeCallback() {
                return this.onPageChangeCallback;
            }

            public final void setOnPageChangeCallback(ViewPager2.OnPageChangeCallback onPageChangeCallback) {
                this.onPageChangeCallback = onPageChangeCallback;
            }

            @Override // com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator.Pager
            public boolean isNotEmpty() {
                return ExtensionsKt.isNotEmpty(ViewPager2.this);
            }

            @Override // com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator.Pager
            public int getCurrentItem() {
                return ViewPager2.this.getCurrentItem();
            }

            @Override // com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator.Pager
            public boolean isEmpty() {
                return ExtensionsKt.isEmpty(ViewPager2.this);
            }

            @Override // com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator.Pager
            public int getCount() {
                RecyclerView.Adapter adapter2 = ViewPager2.this.getAdapter();
                if (adapter2 != null) {
                    return adapter2.getItemCount();
                }
                return 0;
            }

            @Override // com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator.Pager
            public void setCurrentItem(int i, boolean z) {
                ViewPager2.this.setCurrentItem(i, z);
            }

            @Override // com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator.Pager
            public void removeOnPageChangeListener() {
                ViewPager2.OnPageChangeCallback onPageChangeCallback = this.onPageChangeCallback;
                if (onPageChangeCallback != null) {
                    ViewPager2.this.unregisterOnPageChangeCallback(onPageChangeCallback);
                }
            }

            @Override // com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator.Pager
            public void addOnPageChangeListener(final OnPageChangeListenerHelper onPageChangeListenerHelper) {
                Intrinsics.checkNotNullParameter(onPageChangeListenerHelper, "onPageChangeListenerHelper");
                ViewPager2.OnPageChangeCallback onPageChangeCallback = new ViewPager2.OnPageChangeCallback() { // from class: com.tbuonomo.viewpagerdotsindicator.attacher.ViewPager2Attacher$buildPager$1$addOnPageChangeListener$1
                    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
                    public void onPageScrolled(int i, float f, int i2) {
                        super.onPageScrolled(i, f, i2);
                        OnPageChangeListenerHelper.this.onPageScrolled(i, f);
                    }
                };
                this.onPageChangeCallback = onPageChangeCallback;
                ViewPager2 viewPager2 = ViewPager2.this;
                Intrinsics.checkNotNull(onPageChangeCallback);
                viewPager2.registerOnPageChangeCallback(onPageChangeCallback);
            }
        };
    }
}
