package an;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.lifecycle.l0;
import androidx.lifecycle.o0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cn.e1;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.libraryExperiment.model.LibraryCollection;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.SingleUseEvent;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
/* compiled from: LibraryAllCollectionsFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lan/c;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class c extends rr.b {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ int f680w = 0;

    /* renamed from: v  reason: collision with root package name */
    public final LinkedHashMap f682v = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f681u = LogHelper.INSTANCE.makeLogTag("LibraryAllCollectionsFragment");

    /* compiled from: LibraryAllCollectionsFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.l<SingleUseEvent<? extends List<? extends LibraryCollection>>, hs.k> {
        public a() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(SingleUseEvent<? extends List<? extends LibraryCollection>> singleUseEvent) {
            SingleUseEvent<? extends List<? extends LibraryCollection>> singleUseEvent2 = singleUseEvent;
            c cVar = c.this;
            if (singleUseEvent2 != null) {
                try {
                    List<? extends LibraryCollection> contentIfNotHandled = singleUseEvent2.getContentIfNotHandled();
                    if (contentIfNotHandled != null) {
                        RecyclerView recyclerView = (RecyclerView) cVar._$_findCachedViewById(R.id.rvAcItemsRecycler);
                        if (recyclerView != null) {
                            recyclerView.setLayoutManager(new LinearLayoutManager(cVar.requireContext(), 1, false));
                        }
                        RecyclerView recyclerView2 = (RecyclerView) cVar._$_findCachedViewById(R.id.rvAcItemsRecycler);
                        if (recyclerView2 != null) {
                            recyclerView2.setAdapter(new zm.b(is.u.e2(contentIfNotHandled), new an.a(cVar), new b(contentIfNotHandled, cVar)));
                        }
                        RecyclerView recyclerView3 = (RecyclerView) cVar._$_findCachedViewById(R.id.rvAcItemsRecycler);
                        if (recyclerView3 != null) {
                            recyclerView3.setVisibility(0);
                        }
                        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) cVar._$_findCachedViewById(R.id.shimmerAcBanner);
                        if (shimmerFrameLayout != null) {
                            shimmerFrameLayout.c();
                        }
                        ShimmerFrameLayout shimmerFrameLayout2 = (ShimmerFrameLayout) cVar._$_findCachedViewById(R.id.shimmerAcHeader);
                        if (shimmerFrameLayout2 != null) {
                            shimmerFrameLayout2.c();
                        }
                        ShimmerFrameLayout shimmerFrameLayout3 = (ShimmerFrameLayout) cVar._$_findCachedViewById(R.id.shimmerAcSubHeader);
                        if (shimmerFrameLayout3 != null) {
                            shimmerFrameLayout3.c();
                        }
                        ShimmerFrameLayout shimmerFrameLayout4 = (ShimmerFrameLayout) cVar._$_findCachedViewById(R.id.shimmerAcCta);
                        if (shimmerFrameLayout4 != null) {
                            shimmerFrameLayout4.c();
                        }
                        CardView cardView = (CardView) cVar._$_findCachedViewById(R.id.cvAcLoader);
                        if (cardView != null) {
                            cardView.setVisibility(8);
                        }
                        gk.a.b(null, "lib_collect_list_view_load");
                    }
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(cVar.f681u, e10);
                }
            }
            return hs.k.f19476a;
        }
    }

    @Override // rr.b
    public final boolean I() {
        try {
            gk.a.b(null, "lib_collect_list_view_back_click");
            return true;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f681u, e10);
            return true;
        }
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f682v;
        View view = (View) linkedHashMap.get(Integer.valueOf(i6));
        if (view == null) {
            View view2 = getView();
            if (view2 != null && (findViewById = view2.findViewById(i6)) != null) {
                linkedHashMap.put(Integer.valueOf(i6), findViewById);
                return findViewById;
            }
            return null;
        }
        return view;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.g(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_library_all_collections, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f682v.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            AppCompatImageView appCompatImageView = (AppCompatImageView) _$_findCachedViewById(R.id.ivAcBack);
            if (appCompatImageView != null) {
                appCompatImageView.setOnClickListener(new ol.k(21, this));
            }
            ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) _$_findCachedViewById(R.id.shimmerAcBanner);
            if (shimmerFrameLayout != null) {
                shimmerFrameLayout.b();
            }
            ShimmerFrameLayout shimmerFrameLayout2 = (ShimmerFrameLayout) _$_findCachedViewById(R.id.shimmerAcHeader);
            if (shimmerFrameLayout2 != null) {
                shimmerFrameLayout2.b();
            }
            ShimmerFrameLayout shimmerFrameLayout3 = (ShimmerFrameLayout) _$_findCachedViewById(R.id.shimmerAcSubHeader);
            if (shimmerFrameLayout3 != null) {
                shimmerFrameLayout3.b();
            }
            ShimmerFrameLayout shimmerFrameLayout4 = (ShimmerFrameLayout) _$_findCachedViewById(R.id.shimmerAcCta);
            if (shimmerFrameLayout4 != null) {
                shimmerFrameLayout4.b();
            }
            CardView cardView = (CardView) _$_findCachedViewById(R.id.cvAcLoader);
            if (cardView != null) {
                cardView.setVisibility(0);
            }
            RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.rvAcItemsRecycler);
            if (recyclerView != null) {
                recyclerView.setVisibility(8);
            }
            l0 a10 = new o0(this, new jl.b0(new e1(), 3)).a(cn.b.class);
            cn.b bVar = (cn.b) a10;
            bVar.f5413z.e(getViewLifecycleOwner(), new qm.c(9, new a()));
            ta.v.H(kc.f.H(bVar), null, 0, new cn.a(bVar, null), 3);
            cn.b bVar2 = (cn.b) a10;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f681u, e10);
        }
    }
}
