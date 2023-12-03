package ep;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.p;
import androidx.lifecycle.o0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cn.z0;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.resources.model.ResourceData;
import com.theinnerhour.b2b.components.resources.model.ResourcesResponse;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UtilsKt;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
import kotlinx.coroutines.flow.x;
import nn.v0;
import so.b0;
import ss.l;
/* compiled from: ResourceViewAllFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lep/d;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class d extends Fragment {

    /* renamed from: z  reason: collision with root package name */
    public static final /* synthetic */ int f14454z = 0;

    /* renamed from: v  reason: collision with root package name */
    public hp.a f14456v;

    /* renamed from: w  reason: collision with root package name */
    public il.b f14457w;

    /* renamed from: y  reason: collision with root package name */
    public final LinkedHashMap f14459y = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f14455u = LogHelper.INSTANCE.makeLogTag("ResourceViewAllFragment");

    /* renamed from: x  reason: collision with root package name */
    public final a f14458x = new a();

    /* compiled from: ResourceViewAllFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a extends RecyclerView.r {
        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r
        public final void b(RecyclerView recyclerView, int i6, int i10) {
            LinearLayoutManager linearLayoutManager;
            i.g(recyclerView, "recyclerView");
            RecyclerView.m layoutManager = recyclerView.getLayoutManager();
            x xVar = null;
            if (layoutManager instanceof LinearLayoutManager) {
                linearLayoutManager = (LinearLayoutManager) layoutManager;
            } else {
                linearLayoutManager = null;
            }
            if (linearLayoutManager != null) {
                int findLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition() + 1;
                hp.a aVar = d.this.f14456v;
                if (aVar != null) {
                    xVar = aVar.f18074z;
                }
                if (xVar != null) {
                    xVar.setValue(Integer.valueOf(findLastVisibleItemPosition));
                }
            }
        }
    }

    /* compiled from: ResourceViewAllFragment.kt */
    /* loaded from: classes2.dex */
    public static final class b extends k implements l<ResourcesResponse, hs.k> {
        public b() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(ResourcesResponse resourcesResponse) {
            RecyclerView.e eVar;
            ResourcesResponse resourcesResponse2 = resourcesResponse;
            if (resourcesResponse2 != null) {
                ArrayList<ResourceData> newResourceList = resourcesResponse2.getData();
                int i6 = d.f14454z;
                d dVar = d.this;
                dVar.getClass();
                try {
                    if (((RecyclerView) dVar._$_findCachedViewById(R.id.rvLibraryResources)).getAdapter() == null) {
                        if (newResourceList.size() > 0) {
                            ((Group) dVar._$_findCachedViewById(R.id.grpNullState)).setVisibility(8);
                            p requireActivity = dVar.requireActivity();
                            i.f(requireActivity, "requireActivity()");
                            ((RecyclerView) dVar._$_findCachedViewById(R.id.rvLibraryResources)).setAdapter(new dp.b(requireActivity, newResourceList, new e(dVar)));
                        } else {
                            ((Group) dVar._$_findCachedViewById(R.id.grpNullState)).setVisibility(0);
                        }
                    } else {
                        RecyclerView recyclerView = (RecyclerView) dVar._$_findCachedViewById(R.id.rvLibraryResources);
                        dp.a aVar = null;
                        if (recyclerView != null) {
                            eVar = recyclerView.getAdapter();
                        } else {
                            eVar = null;
                        }
                        if (eVar instanceof dp.a) {
                            aVar = (dp.a) eVar;
                        }
                        if (aVar != null) {
                            i.g(newResourceList, "newResourceList");
                            ArrayList<ResourceData> arrayList = aVar.f13190z;
                            int size = arrayList.size();
                            arrayList.addAll(newResourceList);
                            aVar.f2769u.e(size, newResourceList.size());
                        }
                    }
                    a aVar2 = dVar.f14458x;
                    RecyclerView recyclerView2 = (RecyclerView) dVar._$_findCachedViewById(R.id.rvLibraryResources);
                    if (recyclerView2 != null) {
                        recyclerView2.i(aVar2);
                    }
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(dVar.f14455u, e10);
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: ResourceViewAllFragment.kt */
    /* loaded from: classes2.dex */
    public static final class c extends k implements l<Boolean, hs.k> {
        public c() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(Boolean bool) {
            Boolean bool2 = bool;
            if (bool2 != null) {
                bool2.booleanValue();
                boolean booleanValue = bool2.booleanValue();
                d dVar = d.this;
                if (booleanValue) {
                    ((ConstraintLayout) dVar._$_findCachedViewById(R.id.clProgressView)).setVisibility(0);
                } else {
                    ((ConstraintLayout) dVar._$_findCachedViewById(R.id.clProgressView)).setVisibility(8);
                }
            }
            return hs.k.f19476a;
        }
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f14459y;
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
    public final void onAttach(Context context) {
        i.g(context, "context");
        super.onAttach(context);
        if (context instanceof il.b) {
            this.f14457w = (il.b) context;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        i.g(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_resource_view_all, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f14459y.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        i.g(view, "view");
        super.onViewCreated(view, bundle);
        ((RecyclerView) _$_findCachedViewById(R.id.rvLibraryResources)).setLayoutManager(new LinearLayoutManager(requireActivity(), 1, false));
        Application application = requireActivity().getApplication();
        i.f(application, "requireActivity().application");
        hp.a aVar = (hp.a) new o0(this, new z0(application, 2)).a(hp.a.class);
        aVar.D.e(getViewLifecycleOwner(), new b0(18, new b()));
        aVar.F.e(getViewLifecycleOwner(), new b0(19, new c()));
        String currentCourseName = FirebasePersistence.getInstance().getUser().getCurrentCourseName();
        i.f(currentCourseName, "getInstance().user.currentCourseName");
        aVar.f(currentCourseName);
        this.f14456v = aVar;
        String str = gk.a.f16573a;
        Bundle analyticsBundle = UtilsKt.getAnalyticsBundle();
        Bundle arguments = getArguments();
        if (arguments != null && (string = arguments.getString("source")) != null) {
            analyticsBundle.putString("source", string);
        }
        hs.k kVar = hs.k.f19476a;
        gk.a.b(analyticsBundle, "cm_list");
        AppCompatImageView appCompatImageView = (AppCompatImageView) _$_findCachedViewById(R.id.ivLibraryResourcesFilter);
        if (appCompatImageView != null) {
            appCompatImageView.setVisibility(8);
        }
        AppCompatImageView appCompatImageView2 = (AppCompatImageView) _$_findCachedViewById(R.id.ivResourcesBack);
        if (appCompatImageView2 != null) {
            appCompatImageView2.setOnClickListener(new v0(23, this));
        }
    }
}
