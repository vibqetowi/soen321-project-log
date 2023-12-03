package com.futuremind.recyclerviewfastscroll;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import l6.b;
/* compiled from: RecyclerViewScrollListener.java */
/* loaded from: classes.dex */
public final class a extends RecyclerView.r {

    /* renamed from: a  reason: collision with root package name */
    public final FastScroller f6140a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f6141b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public int f6142c = 0;

    /* compiled from: RecyclerViewScrollListener.java */
    /* renamed from: com.futuremind.recyclerviewfastscroll.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0131a {
        void a();
    }

    public a(FastScroller fastScroller) {
        this.f6140a = fastScroller;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public final void a(int i6, RecyclerView recyclerView) {
        FastScroller fastScroller = this.f6140a;
        if (i6 == 0 && this.f6142c != 0) {
            b viewProvider = fastScroller.getViewProvider();
            if (viewProvider.c() != null) {
                viewProvider.c().getClass();
            }
            if (viewProvider.a() != null) {
                viewProvider.a().getClass();
            }
        } else if (i6 != 0 && this.f6142c == 0) {
            b viewProvider2 = fastScroller.getViewProvider();
            if (viewProvider2.c() != null) {
                viewProvider2.c().getClass();
            }
            if (viewProvider2.a() != null) {
                viewProvider2.a().getClass();
            }
        }
        this.f6142c = i6;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public final void b(RecyclerView recyclerView, int i6, int i10) {
        boolean z10;
        FastScroller fastScroller = this.f6140a;
        if (fastScroller.f6136x != null && !fastScroller.F && fastScroller.f6134v.getChildCount() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            c(recyclerView);
        }
    }

    public final void c(RecyclerView recyclerView) {
        int computeHorizontalScrollOffset;
        int computeHorizontalScrollExtent;
        int computeHorizontalScrollRange;
        FastScroller fastScroller = this.f6140a;
        if (fastScroller.c()) {
            computeHorizontalScrollOffset = recyclerView.computeVerticalScrollOffset();
            computeHorizontalScrollExtent = recyclerView.computeVerticalScrollExtent();
            computeHorizontalScrollRange = recyclerView.computeVerticalScrollRange();
        } else {
            computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
            computeHorizontalScrollExtent = recyclerView.computeHorizontalScrollExtent();
            computeHorizontalScrollRange = recyclerView.computeHorizontalScrollRange();
        }
        fastScroller.setScrollerPosition(computeHorizontalScrollOffset / (computeHorizontalScrollRange - computeHorizontalScrollExtent));
        Iterator it = this.f6141b.iterator();
        while (it.hasNext()) {
            ((InterfaceC0131a) it.next()).a();
        }
    }
}
