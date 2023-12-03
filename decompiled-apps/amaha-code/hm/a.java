package hm;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.p;
import androidx.lifecycle.o0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.r;
import com.google.firebase.messaging.j;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.telecommunications.model.TherapistPackagesModel;
import com.theinnerhour.b2b.network.model.ProviderAboutResponseModel;
import com.theinnerhour.b2b.utils.SingleUseEvent;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import g0.a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
import ss.l;
import tl.m;
/* compiled from: MatchingCompletedProviderListFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhm/a;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class a extends Fragment {
    public static final /* synthetic */ int B = 0;

    /* renamed from: u  reason: collision with root package name */
    public gm.c f17773u;

    /* renamed from: x  reason: collision with root package name */
    public boolean f17776x;

    /* renamed from: y  reason: collision with root package name */
    public km.d f17777y;

    /* renamed from: z  reason: collision with root package name */
    public final androidx.activity.result.c<Intent> f17778z;
    public final LinkedHashMap A = new LinkedHashMap();

    /* renamed from: v  reason: collision with root package name */
    public final ArrayList<ProviderAboutResponseModel> f17774v = new ArrayList<>();

    /* renamed from: w  reason: collision with root package name */
    public final ArrayList<TherapistPackagesModel> f17775w = new ArrayList<>();

    /* compiled from: MatchingCompletedProviderListFragment.kt */
    /* renamed from: hm.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0283a extends k implements l<SingleUseEvent<? extends ArrayList<TherapistPackagesModel>>, hs.k> {
        public C0283a() {
            super(1);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x005a, code lost:
            r6.setAbout(r4.getData().getAbout());
         */
        @Override // ss.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final hs.k invoke(SingleUseEvent<? extends ArrayList<TherapistPackagesModel>> singleUseEvent) {
            int i6;
            boolean z10;
            ArrayList<TherapistPackagesModel> contentIfNotHandled = singleUseEvent.getContentIfNotHandled();
            if (contentIfNotHandled != null) {
                int size = contentIfNotHandled.size();
                a aVar = a.this;
                if (size > 0) {
                    ((ConstraintLayout) aVar._$_findCachedViewById(R.id.clProviderParent)).setVisibility(0);
                    if (!aVar.f17776x) {
                        Iterator<ProviderAboutResponseModel> it = aVar.f17774v.iterator();
                        while (it.hasNext()) {
                            ProviderAboutResponseModel next = it.next();
                            for (TherapistPackagesModel therapistPackagesModel : contentIfNotHandled) {
                                if (therapistPackagesModel.getId() == next.getData().getId()) {
                                    z10 = true;
                                    continue;
                                } else {
                                    z10 = false;
                                    continue;
                                }
                                if (z10) {
                                    break;
                                }
                            }
                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                        }
                    }
                    if (contentIfNotHandled.size() > 0) {
                        ((RobertoTextView) aVar._$_findCachedViewById(R.id.tvProviderMatchCompletedViewAll)).setVisibility(0);
                        ((RobertoTextView) aVar._$_findCachedViewById(R.id.tvProviderMatchCompletedViewAll)).setOnClickListener(new ol.k(16, aVar));
                    } else {
                        ((RobertoTextView) aVar._$_findCachedViewById(R.id.tvProviderMatchCompletedViewAll)).setVisibility(8);
                    }
                    int size2 = contentIfNotHandled.size();
                    for (int i10 = 0; i10 < size2; i10++) {
                        View inflate = aVar.requireActivity().getLayoutInflater().inflate(R.layout.navigation_dot, (ViewGroup) ((LinearLayout) aVar._$_findCachedViewById(R.id.layoutDots)), false);
                        p requireActivity = aVar.requireActivity();
                        if (i10 == 0) {
                            i6 = R.drawable.background_solid_amaha_dark_grey_corner_8dp;
                        } else {
                            i6 = R.drawable.background_stroke_amaha_dark_grey_corner_8dp;
                        }
                        Object obj = g0.a.f16164a;
                        inflate.setBackground(a.c.b(requireActivity, i6));
                        ((LinearLayout) aVar._$_findCachedViewById(R.id.layoutDots)).addView(inflate);
                    }
                    RecyclerView recyclerView = (RecyclerView) aVar._$_findCachedViewById(R.id.rvProviderMatchCompleted);
                    if (recyclerView != null) {
                        recyclerView.setLayoutManager(new LinearLayoutManager(aVar.requireActivity(), 0, false));
                    }
                    aVar.f17773u = new gm.c(contentIfNotHandled, new hm.b(aVar), new c(aVar));
                    RecyclerView recyclerView2 = (RecyclerView) aVar._$_findCachedViewById(R.id.rvProviderMatchCompleted);
                    if (recyclerView2 != null) {
                        gm.c cVar = aVar.f17773u;
                        if (cVar != null) {
                            recyclerView2.setAdapter(cVar);
                        } else {
                            i.q("adapter");
                            throw null;
                        }
                    }
                    new r().a((RecyclerView) aVar._$_findCachedViewById(R.id.rvProviderMatchCompleted));
                    RecyclerView recyclerView3 = (RecyclerView) aVar._$_findCachedViewById(R.id.rvProviderMatchCompleted);
                    if (recyclerView3 != null) {
                        recyclerView3.i(new d(aVar, contentIfNotHandled));
                    }
                } else {
                    ((ConstraintLayout) aVar._$_findCachedViewById(R.id.clProviderParent)).setVisibility(8);
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: MatchingCompletedProviderListFragment.kt */
    /* loaded from: classes2.dex */
    public static final class b extends k implements l<ProviderAboutResponseModel, hs.k> {
        public b() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(ProviderAboutResponseModel providerAboutResponseModel) {
            TherapistPackagesModel therapistPackagesModel;
            boolean z10;
            ProviderAboutResponseModel providerAboutResponseModel2 = providerAboutResponseModel;
            if (providerAboutResponseModel2 != null) {
                a aVar = a.this;
                aVar.f17774v.add(providerAboutResponseModel2);
                ArrayList<TherapistPackagesModel> arrayList = aVar.f17775w;
                if (arrayList.size() > 0) {
                    aVar.f17776x = true;
                    Iterator<TherapistPackagesModel> it = arrayList.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            therapistPackagesModel = it.next();
                            if (therapistPackagesModel.getId() == providerAboutResponseModel2.getData().getId()) {
                                z10 = true;
                                continue;
                            } else {
                                z10 = false;
                                continue;
                            }
                            if (z10) {
                                break;
                            }
                        } else {
                            therapistPackagesModel = null;
                            break;
                        }
                    }
                    TherapistPackagesModel therapistPackagesModel2 = therapistPackagesModel;
                    if (therapistPackagesModel2 != null) {
                        int indexOf = arrayList.indexOf(therapistPackagesModel2);
                        therapistPackagesModel2.setAbout(providerAboutResponseModel2.getData().getAbout());
                        arrayList.set(indexOf, therapistPackagesModel2);
                        gm.c cVar = aVar.f17773u;
                        if (cVar != null) {
                            if (cVar != null) {
                                cVar.f16619x.set(indexOf, therapistPackagesModel2);
                                cVar.j(indexOf);
                            } else {
                                i.q("adapter");
                                throw null;
                            }
                        }
                    }
                }
            }
            return hs.k.f19476a;
        }
    }

    public a() {
        androidx.activity.result.c<Intent> registerForActivityResult = registerForActivityResult(new e.d(), new j(7));
        i.f(registerForActivityResult, "registerForActivityResul…)\n            }\n        }");
        this.f17778z = registerForActivityResult;
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.A;
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
        i.g(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_matching_completed_provider_list, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.A.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Serializable serializable;
        i.g(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        ArrayList<String> arrayList = null;
        Serializable serializable2 = null;
        if (arguments != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                serializable = arguments.getSerializable("uuids", ArrayList.class);
            } else {
                Serializable serializable3 = arguments.getSerializable("uuids");
                if (serializable3 instanceof ArrayList) {
                    serializable2 = serializable3;
                }
                serializable = (ArrayList) serializable2;
            }
            arrayList = (ArrayList) serializable;
        }
        km.d dVar = (km.d) new o0(this).a(km.d.class);
        if (arrayList != null) {
            dVar.g(arrayList);
            dVar.j(arrayList);
        }
        dVar.f().e(getViewLifecycleOwner(), new m(24, new C0283a()));
        dVar.h().e(getViewLifecycleOwner(), new m(25, new b()));
        this.f17777y = dVar;
    }
}
