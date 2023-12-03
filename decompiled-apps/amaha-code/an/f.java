package an;

import android.app.Application;
import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.l0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cn.e1;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.logs.model.LogModel;
import com.theinnerhour.b2b.model.LearningHubModel;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.DebouncedOnClickListener;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Metadata;
import pl.w0;
import t0.d0;
import t0.o0;
import t0.u0;
/* compiled from: LibraryAllResourcesFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lan/f;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class f extends rr.b {
    public static final /* synthetic */ int C = 0;
    public zm.l A;
    public final LinkedHashMap B = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f700u = LogHelper.INSTANCE.makeLogTag(f.class);

    /* renamed from: v  reason: collision with root package name */
    public String f701v = "";

    /* renamed from: w  reason: collision with root package name */
    public ArrayList<LearningHubModel> f702w = new ArrayList<>();

    /* renamed from: x  reason: collision with root package name */
    public cn.w f703x;

    /* renamed from: y  reason: collision with root package name */
    public ArrayList<String> f704y;

    /* renamed from: z  reason: collision with root package name */
    public ArrayList<String> f705z;

    /* compiled from: LibraryAllResourcesFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a extends RecyclerView.r {
        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r
        public final void b(RecyclerView recyclerView, int i6, int i10) {
            LinearLayoutManager linearLayoutManager;
            Integer num;
            LinearLayoutManager linearLayoutManager2;
            Integer num2;
            LinearLayoutManager linearLayoutManager3;
            Integer num3;
            kotlin.jvm.internal.i.g(recyclerView, "recyclerView");
            RecyclerView.m layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof LinearLayoutManager) {
                linearLayoutManager = (LinearLayoutManager) layoutManager;
            } else {
                linearLayoutManager = null;
            }
            if (linearLayoutManager != null) {
                num = Integer.valueOf(linearLayoutManager.findLastVisibleItemPosition());
            } else {
                num = null;
            }
            RecyclerView.m layoutManager2 = recyclerView.getLayoutManager();
            if (layoutManager2 instanceof LinearLayoutManager) {
                linearLayoutManager2 = (LinearLayoutManager) layoutManager2;
            } else {
                linearLayoutManager2 = null;
            }
            if (linearLayoutManager2 != null) {
                num2 = Integer.valueOf(linearLayoutManager2.getItemCount() - 1);
            } else {
                num2 = null;
            }
            if (kotlin.jvm.internal.i.b(num, num2)) {
                RecyclerView.m layoutManager3 = recyclerView.getLayoutManager();
                if (layoutManager3 instanceof LinearLayoutManager) {
                    linearLayoutManager3 = (LinearLayoutManager) layoutManager3;
                } else {
                    linearLayoutManager3 = null;
                }
                if (linearLayoutManager3 != null) {
                    num3 = Integer.valueOf(linearLayoutManager3.findLastVisibleItemPosition() + 1);
                } else {
                    num3 = null;
                }
                if (num3 != null) {
                    num3.intValue();
                    f fVar = f.this;
                    cn.w wVar = fVar.f703x;
                    if (wVar != null) {
                        if (((Number) wVar.A.getValue()).intValue() < num3.intValue()) {
                            cn.w wVar2 = fVar.f703x;
                            if (wVar2 != null) {
                                wVar2.A.setValue(Integer.valueOf(fVar.f702w.size()));
                                cn.w wVar3 = fVar.f703x;
                                if (wVar3 != null) {
                                    wVar3.D.l(Boolean.TRUE);
                                    return;
                                } else {
                                    kotlin.jvm.internal.i.q("libraryResourcesViewModel");
                                    throw null;
                                }
                            }
                            kotlin.jvm.internal.i.q("libraryResourcesViewModel");
                            throw null;
                        }
                        return;
                    }
                    kotlin.jvm.internal.i.q("libraryResourcesViewModel");
                    throw null;
                }
            }
        }
    }

    /* compiled from: LibraryAllResourcesFragment.kt */
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.l<List<? extends LearningHubModel>, hs.k> {
        public b() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(List<? extends LearningHubModel> list) {
            RecyclerView.e eVar;
            List<? extends LearningHubModel> list2 = list;
            kotlin.jvm.internal.i.e(list2, "null cannot be cast to non-null type java.util.ArrayList<com.theinnerhour.b2b.model.LearningHubModel?>");
            ArrayList<LearningHubModel> arrayList = (ArrayList) list2;
            f fVar = f.this;
            fVar.getClass();
            fVar.f702w = arrayList;
            try {
                if (((RecyclerView) fVar._$_findCachedViewById(R.id.rvLibraryResources)).getAdapter() == null) {
                    ArrayList<LearningHubModel> arrayList2 = fVar.f702w;
                    androidx.fragment.app.p requireActivity = fVar.requireActivity();
                    kotlin.jvm.internal.i.f(requireActivity, "requireActivity()");
                    ((RecyclerView) fVar._$_findCachedViewById(R.id.rvLibraryResources)).setAdapter(new zm.k(arrayList2, arrayList, requireActivity, new g(fVar)));
                } else {
                    RecyclerView recyclerView = (RecyclerView) fVar._$_findCachedViewById(R.id.rvLibraryResources);
                    zm.k kVar = null;
                    if (recyclerView != null) {
                        eVar = recyclerView.getAdapter();
                    } else {
                        eVar = null;
                    }
                    if (eVar instanceof zm.k) {
                        kVar = (zm.k) eVar;
                    }
                    if (kVar != null) {
                        ArrayList<LearningHubModel> list3 = fVar.f702w;
                        kotlin.jvm.internal.i.g(list3, "list");
                        kVar.A = arrayList;
                        kVar.i();
                    }
                }
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(fVar.f700u, e10);
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: LibraryAllResourcesFragment.kt */
    /* loaded from: classes2.dex */
    public static final class c extends kotlin.jvm.internal.k implements ss.l<Boolean, hs.k> {
        public c() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(Boolean bool) {
            Boolean bool2 = bool;
            if (bool2 != null) {
                bool2.booleanValue();
                boolean booleanValue = bool2.booleanValue();
                f fVar = f.this;
                if (booleanValue) {
                    ((ConstraintLayout) fVar._$_findCachedViewById(R.id.clProgressView)).setVisibility(0);
                } else {
                    ((ConstraintLayout) fVar._$_findCachedViewById(R.id.clProgressView)).setVisibility(8);
                }
            }
            return hs.k.f19476a;
        }
    }

    public final ArrayList<String> J() {
        ArrayList<String> arrayList = this.f704y;
        if (arrayList != null) {
            return arrayList;
        }
        kotlin.jvm.internal.i.q("postTypeFilter");
        throw null;
    }

    public final void K() {
        RecyclerView recyclerView;
        try {
            if (this.f703x != null && (recyclerView = (RecyclerView) _$_findCachedViewById(R.id.rvLibraryResources)) != null) {
                recyclerView.i(new a());
            }
            ((AppCompatImageView) _$_findCachedViewById(R.id.ivLibraryResourcesFilter)).setOnClickListener(DebouncedOnClickListener.wrap(new View.OnClickListener(this) { // from class: an.d

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ f f687v;

                {
                    this.f687v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i6 = r2;
                    f this$0 = this.f687v;
                    switch (i6) {
                        case 0:
                            int i10 = f.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            String str = gk.a.f16573a;
                            Bundle bundle = new Bundle();
                            bundle.putString("resource_chip", this$0.f701v);
                            hs.k kVar = hs.k.f19476a;
                            gk.a.b(bundle, "lib_resource_filter_icon_click");
                            if (Utils.INSTANCE.checkConnectivity(this$0.requireActivity())) {
                                try {
                                    Dialog styledDialog = UiUtils.Companion.getStyledDialog(R.layout.library_resources_filter, this$0.requireActivity(), R.style.Theme_Dialog);
                                    Window window = styledDialog.getWindow();
                                    if (window != null) {
                                        window.setLayout(-1, -1);
                                    }
                                    ((RecyclerView) styledDialog.findViewById(R.id.rvLibraryResourcesFilter)).setLayoutManager(new LinearLayoutManager(this$0.requireActivity(), 1, false));
                                    ArrayList arrayList = new ArrayList();
                                    arrayList.addAll(this$0.J());
                                    ArrayList<String> arrayList2 = this$0.f705z;
                                    if (arrayList2 != null) {
                                        androidx.fragment.app.p requireActivity = this$0.requireActivity();
                                        kotlin.jvm.internal.i.f(requireActivity, "requireActivity()");
                                        this$0.A = new zm.l(requireActivity, arrayList2, arrayList);
                                        RecyclerView recyclerView2 = (RecyclerView) styledDialog.findViewById(R.id.rvLibraryResourcesFilter);
                                        zm.l lVar = this$0.A;
                                        if (lVar != null) {
                                            recyclerView2.setAdapter(lVar);
                                            ((AppCompatImageView) styledDialog.findViewById(R.id.ivFilterClose)).setOnClickListener(DebouncedOnClickListener.wrap(new w0(styledDialog, 17, this$0)));
                                            ((RobertoTextView) styledDialog.findViewById(R.id.tvResourcesFilterResetCta)).setOnClickListener(DebouncedOnClickListener.wrap(new w0(arrayList, 18, this$0)));
                                            ((RobertoTextView) styledDialog.findViewById(R.id.tvResourcesFilterApplyCta)).setOnClickListener(DebouncedOnClickListener.wrap(new dk.t(29, this$0, arrayList, styledDialog)));
                                            styledDialog.show();
                                            return;
                                        }
                                        kotlin.jvm.internal.i.q("resourcesFilterAdapter");
                                        throw null;
                                    }
                                    kotlin.jvm.internal.i.q("predefinedPostTypeFilters");
                                    throw null;
                                } catch (Exception e10) {
                                    LogHelper.INSTANCE.e(this$0.f700u, e10);
                                    return;
                                }
                            }
                            return;
                        default:
                            int i11 = f.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            String str2 = gk.a.f16573a;
                            Bundle bundle2 = new Bundle();
                            bundle2.putString("resource_chip", this$0.f701v);
                            bundle2.putString("source_of_action", "resource_list_view");
                            hs.k kVar2 = hs.k.f19476a;
                            gk.a.b(bundle2, "lib_resource_list_view_back_click");
                            this$0.requireActivity().onBackPressed();
                            return;
                    }
                }
            }));
            ((AppCompatImageView) _$_findCachedViewById(R.id.ivResourcesBack)).setOnClickListener(DebouncedOnClickListener.wrap(new View.OnClickListener(this) { // from class: an.d

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ f f687v;

                {
                    this.f687v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i6 = r2;
                    f this$0 = this.f687v;
                    switch (i6) {
                        case 0:
                            int i10 = f.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            String str = gk.a.f16573a;
                            Bundle bundle = new Bundle();
                            bundle.putString("resource_chip", this$0.f701v);
                            hs.k kVar = hs.k.f19476a;
                            gk.a.b(bundle, "lib_resource_filter_icon_click");
                            if (Utils.INSTANCE.checkConnectivity(this$0.requireActivity())) {
                                try {
                                    Dialog styledDialog = UiUtils.Companion.getStyledDialog(R.layout.library_resources_filter, this$0.requireActivity(), R.style.Theme_Dialog);
                                    Window window = styledDialog.getWindow();
                                    if (window != null) {
                                        window.setLayout(-1, -1);
                                    }
                                    ((RecyclerView) styledDialog.findViewById(R.id.rvLibraryResourcesFilter)).setLayoutManager(new LinearLayoutManager(this$0.requireActivity(), 1, false));
                                    ArrayList arrayList = new ArrayList();
                                    arrayList.addAll(this$0.J());
                                    ArrayList<String> arrayList2 = this$0.f705z;
                                    if (arrayList2 != null) {
                                        androidx.fragment.app.p requireActivity = this$0.requireActivity();
                                        kotlin.jvm.internal.i.f(requireActivity, "requireActivity()");
                                        this$0.A = new zm.l(requireActivity, arrayList2, arrayList);
                                        RecyclerView recyclerView2 = (RecyclerView) styledDialog.findViewById(R.id.rvLibraryResourcesFilter);
                                        zm.l lVar = this$0.A;
                                        if (lVar != null) {
                                            recyclerView2.setAdapter(lVar);
                                            ((AppCompatImageView) styledDialog.findViewById(R.id.ivFilterClose)).setOnClickListener(DebouncedOnClickListener.wrap(new w0(styledDialog, 17, this$0)));
                                            ((RobertoTextView) styledDialog.findViewById(R.id.tvResourcesFilterResetCta)).setOnClickListener(DebouncedOnClickListener.wrap(new w0(arrayList, 18, this$0)));
                                            ((RobertoTextView) styledDialog.findViewById(R.id.tvResourcesFilterApplyCta)).setOnClickListener(DebouncedOnClickListener.wrap(new dk.t(29, this$0, arrayList, styledDialog)));
                                            styledDialog.show();
                                            return;
                                        }
                                        kotlin.jvm.internal.i.q("resourcesFilterAdapter");
                                        throw null;
                                    }
                                    kotlin.jvm.internal.i.q("predefinedPostTypeFilters");
                                    throw null;
                                } catch (Exception e10) {
                                    LogHelper.INSTANCE.e(this$0.f700u, e10);
                                    return;
                                }
                            }
                            return;
                        default:
                            int i11 = f.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            String str2 = gk.a.f16573a;
                            Bundle bundle2 = new Bundle();
                            bundle2.putString("resource_chip", this$0.f701v);
                            bundle2.putString("source_of_action", "resource_list_view");
                            hs.k kVar2 = hs.k.f19476a;
                            gk.a.b(bundle2, "lib_resource_list_view_back_click");
                            this$0.requireActivity().onBackPressed();
                            return;
                    }
                }
            }));
            String string = getString(R.string.articles);
            kotlin.jvm.internal.i.f(string, "getString(R.string.articles)");
            String string2 = getString(R.string.quotes);
            kotlin.jvm.internal.i.f(string2, "getString(R.string.quotes)");
            String string3 = getString(R.string.tips);
            kotlin.jvm.internal.i.f(string3, "getString(R.string.tips)");
            String string4 = getString(R.string.therapistSays);
            kotlin.jvm.internal.i.f(string4, "getString(R.string.therapistSays)");
            String string5 = getString(R.string.creatives);
            kotlin.jvm.internal.i.f(string5, "getString(R.string.creatives)");
            String string6 = getString(R.string.videos);
            kotlin.jvm.internal.i.f(string6, "getString(R.string.videos)");
            this.f705z = ca.a.k(string, string2, string3, string4, string5, string6);
            this.f704y = new ArrayList<>();
            M(ca.a.k(Constants.COURSE_DEPRESSION, Constants.COURSE_WORRY, Constants.COURSE_STRESS, Constants.COURSE_SLEEP, Constants.COURSE_HAPPINESS, Constants.COURSE_ANGER));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f700u, e10);
        }
    }

    /* JADX WARN: Type inference failed for: r2v16, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r2v6, types: [T, java.lang.Object, java.lang.String] */
    public final void M(ArrayList<String> arrayList) {
        try {
            kotlin.jvm.internal.x xVar = new kotlin.jvm.internal.x();
            kotlin.jvm.internal.x xVar2 = new kotlin.jvm.internal.x();
            xVar2.f23469u = "";
            Iterator<T> it = arrayList.iterator();
            while (it.hasNext()) {
                ?? r22 = (String) it.next();
                int i6 = bn.a.f4534a;
                String j10 = kn.a.j(r22);
                ChipGroup cgResourcesFilters = (ChipGroup) _$_findCachedViewById(R.id.cgResourcesFilters);
                kotlin.jvm.internal.i.f(cgResourcesFilters, "cgResourcesFilters");
                Context requireContext = requireContext();
                kotlin.jvm.internal.i.f(requireContext, "requireContext()");
                Chip b10 = bn.a.b(requireContext, cgResourcesFilters, j10);
                String str = null;
                if (b10 != null) {
                    WeakHashMap<View, o0> weakHashMap = t0.d0.f32288a;
                    b10.setId(d0.e.a());
                } else {
                    b10 = null;
                }
                if (b10 != null) {
                    User user = FirebasePersistence.getInstance().getUser();
                    if (user != null) {
                        str = user.getCurrentCourseName();
                    }
                    if (kotlin.jvm.internal.i.b(r22, kn.a.o(str))) {
                        xVar2.f23469u = r22;
                        this.f701v = kn.a.n(b10.getText().toString());
                        xVar.f23469u = Integer.valueOf(b10.getId());
                        String str2 = gk.a.f16573a;
                        Bundle bundle = new Bundle();
                        bundle.putString("resource_chip", this.f701v);
                        hs.k kVar = hs.k.f19476a;
                        gk.a.b(bundle, "lib_rescource_list_view_load");
                        b10.setChecked(true);
                        b10.setChipBackgroundColorResource(R.color.title_high_contrast);
                        b10.setChipStrokeColorResource(R.color.title_high_contrast);
                        b10.setTextColor(g0.a.b(requireActivity(), R.color.white));
                    } else {
                        b10.setChipBackgroundColorResource(R.color.white);
                        b10.setChipStrokeColorResource(R.color.title_high_contrast_35_opacity);
                        b10.setTextColor(g0.a.b(requireActivity(), R.color.title_high_contrast));
                    }
                    ((ChipGroup) _$_findCachedViewById(R.id.cgResourcesFilters)).addView(b10);
                }
            }
            ChipGroup chipGroup = (ChipGroup) _$_findCachedViewById(R.id.cgResourcesFilters);
            if (chipGroup != null) {
                chipGroup.setOnCheckedStateChangeListener(new e(xVar, this, 0));
            }
            ChipGroup chipGroup2 = (ChipGroup) _$_findCachedViewById(R.id.cgResourcesFilters);
            if (chipGroup2 != null) {
                chipGroup2.post(new ne.u(this, 27, xVar2));
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f700u, "Error adding chip", e10);
        }
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.B;
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
        return inflater.inflate(R.layout.fragment_library_all_resources, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.B.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        u0.e aVar;
        u0.e eVar;
        String str2 = this.f700u;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        ((RecyclerView) _$_findCachedViewById(R.id.rvLibraryResources)).setLayoutManager(new LinearLayoutManager(requireActivity(), 1, false));
        try {
            Window window = requireActivity().getWindow();
            if (Build.VERSION.SDK_INT >= 23) {
                View decorView = window.getDecorView();
                int i6 = Build.VERSION.SDK_INT;
                if (i6 >= 30) {
                    eVar = new u0.d(window);
                } else {
                    if (i6 >= 26) {
                        aVar = new u0.c(decorView, window);
                    } else if (i6 >= 23) {
                        aVar = new u0.b(decorView, window);
                    } else {
                        aVar = new u0.a(decorView, window);
                    }
                    eVar = aVar;
                }
                eVar.d(true);
            }
            window.setStatusBarColor(g0.a.b(requireActivity(), R.color.login_grey_background));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(str2, "Error in setting custom status bar", e10);
        }
        try {
            e1 e1Var = new e1();
            Application application = requireActivity().getApplication();
            kotlin.jvm.internal.i.f(application, "requireActivity().application");
            l0 a10 = new androidx.lifecycle.o0(this, new kk.c(e1Var, application)).a(cn.w.class);
            cn.w wVar = (cn.w) a10;
            wVar.C.e(getViewLifecycleOwner(), new qm.c(10, new b()));
            wVar.D.e(getViewLifecycleOwner(), new qm.c(11, new c()));
            ArrayList<LogModel> arrayList = kn.a.f23436a;
            User user = FirebasePersistence.getInstance().getUser();
            if (user != null) {
                str = user.getCurrentCourseName();
            } else {
                str = null;
            }
            wVar.f(kn.a.o(str), null);
            this.f703x = (cn.w) a10;
            K();
        } catch (Exception e11) {
            LogHelper.INSTANCE.e(str2, e11);
        }
    }
}
