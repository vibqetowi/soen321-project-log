package com.tbuonomo.viewpagerdotsindicator.attacher;

import com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: DotsIndicatorAttacher.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b \u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\u001d\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\b\u001a\u00028\u0001H&¢\u0006\u0002\u0010\tJ\u0017\u0010\n\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0007\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u000bJ+\u0010\f\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\b\u001a\u00028\u00012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u000fH&¢\u0006\u0002\u0010\u0010J\u001b\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0002\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/tbuonomo/viewpagerdotsindicator/attacher/DotsIndicatorAttacher;", "Attachable", "Adapter", "", "()V", "buildPager", "Lcom/tbuonomo/viewpagerdotsindicator/BaseDotsIndicator$Pager;", "attachable", "adapter", "(Ljava/lang/Object;Ljava/lang/Object;)Lcom/tbuonomo/viewpagerdotsindicator/BaseDotsIndicator$Pager;", "getAdapterFromAttachable", "(Ljava/lang/Object;)Ljava/lang/Object;", "registerAdapterDataChangedObserver", "", "onChanged", "Lkotlin/Function0;", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)V", "setup", "baseDotsIndicator", "Lcom/tbuonomo/viewpagerdotsindicator/BaseDotsIndicator;", "(Lcom/tbuonomo/viewpagerdotsindicator/BaseDotsIndicator;Ljava/lang/Object;)V", "viewpagerdotsindicator_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class DotsIndicatorAttacher<Attachable, Adapter> {
    public abstract BaseDotsIndicator.Pager buildPager(Attachable attachable, Adapter adapter);

    public abstract Adapter getAdapterFromAttachable(Attachable attachable);

    public abstract void registerAdapterDataChangedObserver(Attachable attachable, Adapter adapter, Function0<Unit> function0);

    public final void setup(BaseDotsIndicator baseDotsIndicator, Attachable attachable) {
        Intrinsics.checkNotNullParameter(baseDotsIndicator, "baseDotsIndicator");
        Adapter adapterFromAttachable = getAdapterFromAttachable(attachable);
        if (adapterFromAttachable == null) {
            throw new IllegalStateException("Please set an adapter to the view pager (1 or 2) or the recycler before initializing the dots indicator");
        }
        registerAdapterDataChangedObserver(attachable, adapterFromAttachable, new DotsIndicatorAttacher$setup$1(baseDotsIndicator));
        baseDotsIndicator.setPager(buildPager(attachable, adapterFromAttachable));
        baseDotsIndicator.refreshDots();
    }
}
