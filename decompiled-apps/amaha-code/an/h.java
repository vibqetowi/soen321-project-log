package an;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.lifecycle.l0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cn.e1;
import cn.i0;
import cn.j0;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.libraryExperiment.activity.LibraryActivity;
import com.theinnerhour.b2b.components.libraryExperiment.model.MiniCourseMetadata;
import com.theinnerhour.b2b.components.logs.model.LogModel;
import com.theinnerhour.b2b.model.MiniCourse;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.DebouncedOnClickListener;
import com.theinnerhour.b2b.utils.LogHelper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.WeakHashMap;
import kotlin.Metadata;
import t0.d0;
import t0.o0;
import t0.u0;
/* compiled from: LibraryAllShortCoursesFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lan/h;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class h extends rr.b {
    public static final /* synthetic */ int F = 0;
    public String D;

    /* renamed from: v  reason: collision with root package name */
    public j0 f714v;

    /* renamed from: w  reason: collision with root package name */
    public ArrayList<MiniCourseMetadata> f715w;

    /* renamed from: x  reason: collision with root package name */
    public ArrayList<MiniCourse> f716x;

    /* renamed from: y  reason: collision with root package name */
    public ArrayList<MiniCourse> f717y;

    /* renamed from: z  reason: collision with root package name */
    public ArrayList<MiniCourseMetadata> f718z;
    public final LinkedHashMap E = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f713u = LogHelper.INSTANCE.makeLogTag(h.class);
    public ArrayList<MiniCourseMetadata> A = new ArrayList<>();
    public ArrayList<MiniCourse> B = new ArrayList<>();
    public HashSet<String> C = new HashSet<>();

    /* compiled from: LibraryAllShortCoursesFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.l<List<? extends MiniCourseMetadata>, hs.k> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ j0 f720v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(j0 j0Var) {
            super(1);
            this.f720v = j0Var;
        }

        @Override // ss.l
        public final hs.k invoke(List<? extends MiniCourseMetadata> list) {
            List<? extends MiniCourseMetadata> list2 = list;
            h hVar = h.this;
            ArrayList<MiniCourseMetadata> arrayList = hVar.f718z;
            if (arrayList != null) {
                if (arrayList.isEmpty()) {
                    kotlin.jvm.internal.i.e(list2, "null cannot be cast to non-null type java.util.ArrayList<com.theinnerhour.b2b.components.libraryExperiment.model.MiniCourseMetadata?>{ kotlin.collections.TypeAliasesKt.ArrayList<com.theinnerhour.b2b.components.libraryExperiment.model.MiniCourseMetadata?> }");
                    hVar.f715w = (ArrayList) list2;
                    j0 j0Var = this.f720v;
                    j0Var.getClass();
                    try {
                        ta.v.H(kc.f.H(j0Var), null, 0, new i0(j0Var, null), 3);
                    } catch (Exception e10) {
                        LogHelper.INSTANCE.e(j0Var.f5582y, e10);
                    }
                }
                return hs.k.f19476a;
            }
            kotlin.jvm.internal.i.q("tcMetaDataList");
            throw null;
        }
    }

    /* compiled from: LibraryAllShortCoursesFragment.kt */
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.l<List<? extends MiniCourse>, hs.k> {
        public b() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(List<? extends MiniCourse> list) {
            List<? extends MiniCourse> list2 = list;
            h hVar = h.this;
            ArrayList<MiniCourse> arrayList = hVar.f717y;
            if (arrayList != null) {
                if (arrayList.isEmpty()) {
                    kotlin.jvm.internal.i.e(list2, "null cannot be cast to non-null type java.util.ArrayList<com.theinnerhour.b2b.model.MiniCourse?>{ kotlin.collections.TypeAliasesKt.ArrayList<com.theinnerhour.b2b.model.MiniCourse?> }");
                    hVar.f716x = (ArrayList) list2;
                }
                return hs.k.f19476a;
            }
            kotlin.jvm.internal.i.q("topicalCoursesList");
            throw null;
        }
    }

    /* compiled from: LibraryAllShortCoursesFragment.kt */
    /* loaded from: classes2.dex */
    public static final class c extends kotlin.jvm.internal.k implements ss.l<List<? extends MiniCourseMetadata>, hs.k> {
        public c() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(List<? extends MiniCourseMetadata> list) {
            List<? extends MiniCourseMetadata> list2 = list;
            h hVar = h.this;
            ArrayList<MiniCourseMetadata> arrayList = hVar.f718z;
            if (arrayList != null) {
                if (arrayList.isEmpty()) {
                    kotlin.jvm.internal.i.e(list2, "null cannot be cast to non-null type java.util.ArrayList<com.theinnerhour.b2b.components.libraryExperiment.model.MiniCourseMetadata?>{ kotlin.collections.TypeAliasesKt.ArrayList<com.theinnerhour.b2b.components.libraryExperiment.model.MiniCourseMetadata?> }");
                    ArrayList<MiniCourseMetadata> arrayList2 = (ArrayList) list2;
                    hVar.f718z = arrayList2;
                    ArrayList<MiniCourseMetadata> arrayList3 = hVar.f715w;
                    if (arrayList3 != null) {
                        arrayList3.addAll(arrayList2);
                    } else {
                        kotlin.jvm.internal.i.q("mcMetaDataList");
                        throw null;
                    }
                }
                return hs.k.f19476a;
            }
            kotlin.jvm.internal.i.q("tcMetaDataList");
            throw null;
        }
    }

    /* compiled from: LibraryAllShortCoursesFragment.kt */
    /* loaded from: classes2.dex */
    public static final class d extends kotlin.jvm.internal.k implements ss.l<HashSet<String>, hs.k> {
        public d() {
            super(1);
        }

        /* JADX WARN: Type inference failed for: r4v11, types: [T, java.lang.Integer] */
        /* JADX WARN: Type inference failed for: r4v4, types: [T, java.lang.String] */
        @Override // ss.l
        public final hs.k invoke(HashSet<String> hashSet) {
            HashSet<String> hashSet2 = hashSet;
            h hVar = h.this;
            if (hVar.C.isEmpty()) {
                kotlin.jvm.internal.i.e(hashSet2, "null cannot be cast to non-null type java.util.HashSet<kotlin.String?>{ kotlin.collections.TypeAliasesKt.HashSet<kotlin.String?> }");
                hVar.C = hashSet2;
                ((ChipGroup) hVar._$_findCachedViewById(R.id.cgShortCoursesFilters)).removeAllViews();
                kotlin.jvm.internal.x xVar = new kotlin.jvm.internal.x();
                kotlin.jvm.internal.x xVar2 = new kotlin.jvm.internal.x();
                xVar2.f23469u = "";
                try {
                    Iterator<T> it = hashSet2.iterator();
                    while (it.hasNext()) {
                        ?? r42 = (String) it.next();
                        if (r42 != 0) {
                            int i6 = bn.a.f4534a;
                            ChipGroup cgShortCoursesFilters = (ChipGroup) hVar._$_findCachedViewById(R.id.cgShortCoursesFilters);
                            kotlin.jvm.internal.i.f(cgShortCoursesFilters, "cgShortCoursesFilters");
                            Context requireContext = hVar.requireContext();
                            kotlin.jvm.internal.i.f(requireContext, "requireContext()");
                            Chip b10 = bn.a.b(requireContext, cgShortCoursesFilters, r42);
                            if (b10 != null) {
                                WeakHashMap<View, o0> weakHashMap = t0.d0.f32288a;
                                b10.setId(d0.e.a());
                            } else {
                                b10 = null;
                            }
                            if (b10 != null) {
                                if (gv.n.A0(r42, hVar.K(), true)) {
                                    xVar2.f23469u = r42;
                                    xVar.f23469u = Integer.valueOf(b10.getId());
                                    b10.setChecked(true);
                                    b10.setChipBackgroundColorResource(R.color.title_high_contrast);
                                    b10.setChipStrokeColorResource(R.color.title_high_contrast);
                                    b10.setTextColor(g0.a.b(hVar.requireActivity(), R.color.white));
                                } else {
                                    b10.setChipBackgroundColorResource(R.color.white);
                                    b10.setChipStrokeColorResource(R.color.title_high_contrast_35_opacity);
                                    b10.setTextColor(g0.a.b(hVar.requireActivity(), R.color.title_high_contrast));
                                }
                                ((ChipGroup) hVar._$_findCachedViewById(R.id.cgShortCoursesFilters)).addView(b10);
                            }
                        }
                    }
                    ChipGroup chipGroup = (ChipGroup) hVar._$_findCachedViewById(R.id.cgShortCoursesFilters);
                    if (chipGroup != null) {
                        chipGroup.setOnCheckedStateChangeListener(new an.e(xVar, hVar, 1));
                    }
                    ChipGroup chipGroup2 = (ChipGroup) hVar._$_findCachedViewById(R.id.cgShortCoursesFilters);
                    if (chipGroup2 != null) {
                        chipGroup2.post(new ne.u(hVar, 28, xVar2));
                    }
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(hVar.f713u, "Error adding chip", e10);
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: LibraryAllShortCoursesFragment.kt */
    /* loaded from: classes2.dex */
    public static final class e extends kotlin.jvm.internal.k implements ss.l<List<? extends MiniCourse>, hs.k> {
        public e() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(List<? extends MiniCourse> list) {
            List<? extends MiniCourse> list2 = list;
            h hVar = h.this;
            ArrayList<MiniCourse> arrayList = hVar.f717y;
            if (arrayList != null) {
                if (arrayList.isEmpty()) {
                    kotlin.jvm.internal.i.e(list2, "null cannot be cast to non-null type java.util.ArrayList<com.theinnerhour.b2b.model.MiniCourse?>{ kotlin.collections.TypeAliasesKt.ArrayList<com.theinnerhour.b2b.model.MiniCourse?> }");
                    hVar.f717y = (ArrayList) list2;
                    ArrayList<MiniCourse> arrayList2 = hVar.f716x;
                    if (arrayList2 != null) {
                        arrayList2.addAll(list2);
                    } else {
                        kotlin.jvm.internal.i.q("miniCoursesList");
                        throw null;
                    }
                }
                hVar.M(hVar.K());
                return hs.k.f19476a;
            }
            kotlin.jvm.internal.i.q("topicalCoursesList");
            throw null;
        }
    }

    /* compiled from: LibraryAllShortCoursesFragment.kt */
    /* loaded from: classes2.dex */
    public static final class f extends kotlin.jvm.internal.k implements ss.l<Boolean, hs.k> {
        public f() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(Boolean bool) {
            Boolean bool2 = bool;
            if (bool2 != null) {
                bool2.booleanValue();
                boolean booleanValue = bool2.booleanValue();
                h hVar = h.this;
                if (booleanValue) {
                    ((CardView) hVar._$_findCachedViewById(R.id.cvLibrarySCLoader)).setVisibility(0);
                    ((RecyclerView) hVar._$_findCachedViewById(R.id.rvLibraryDbShortCourses)).setVisibility(8);
                } else {
                    ((CardView) hVar._$_findCachedViewById(R.id.cvLibrarySCLoader)).setVisibility(8);
                    ((RecyclerView) hVar._$_findCachedViewById(R.id.rvLibraryDbShortCourses)).setVisibility(0);
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: LibraryAllShortCoursesFragment.kt */
    /* loaded from: classes2.dex */
    public static final class g extends kotlin.jvm.internal.k implements ss.r<MiniCourseMetadata, MiniCourse, String, Integer, hs.k> {
        public g() {
            super(4);
        }

        @Override // ss.r
        public final hs.k r(MiniCourseMetadata miniCourseMetadata, MiniCourse miniCourse, String str, Integer num) {
            LibraryActivity libraryActivity;
            MiniCourseMetadata miniCourseMetadata2 = miniCourseMetadata;
            MiniCourse miniCourseModel = miniCourse;
            String chip = str;
            int intValue = num.intValue();
            kotlin.jvm.internal.i.g(miniCourseModel, "miniCourseModel");
            kotlin.jvm.internal.i.g(chip, "chip");
            androidx.fragment.app.p requireActivity = h.this.requireActivity();
            if (requireActivity instanceof LibraryActivity) {
                libraryActivity = (LibraryActivity) requireActivity;
            } else {
                libraryActivity = null;
            }
            if (libraryActivity != null) {
                Bundle bundle = new Bundle();
                bundle.putSerializable("mcMetaData", miniCourseMetadata2);
                bundle.putSerializable("miniCourse", miniCourseModel);
                bundle.putString("miniCourse_chip", chip);
                bundle.putInt("miniCourse_position_in_list", intValue);
                hs.k kVar = hs.k.f19476a;
                libraryActivity.n0(bundle, "short_courses");
            }
            return hs.k.f19476a;
        }
    }

    public final void J() {
        this.f715w = new ArrayList<>();
        this.f716x = new ArrayList<>();
        this.f717y = new ArrayList<>();
        this.f718z = new ArrayList<>();
        j0 j0Var = this.f714v;
        if (j0Var != null) {
            try {
                j0Var.f5583z.l(Boolean.TRUE);
                ta.v.H(kc.f.H(j0Var), null, 0, new cn.f0(j0Var, null), 3);
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(j0Var.f5582y, e10);
            }
        }
    }

    public final String K() {
        String str = this.D;
        if (str != null) {
            return str;
        }
        kotlin.jvm.internal.i.q("chipFilter");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x009e, code lost:
        r3.add(r5);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void M(String str) {
        String str2;
        String str3;
        ArrayList<String> arrayList;
        boolean z10;
        try {
            this.A = new ArrayList<>();
            this.B = new ArrayList<>();
            ArrayList<MiniCourseMetadata> arrayList2 = this.A;
            ArrayList<MiniCourseMetadata> arrayList3 = this.f715w;
            if (arrayList3 != null) {
                ArrayList arrayList4 = new ArrayList();
                for (Object obj : arrayList3) {
                    MiniCourseMetadata miniCourseMetadata = (MiniCourseMetadata) obj;
                    if (miniCourseMetadata != null) {
                        arrayList = miniCourseMetadata.getChips();
                    } else {
                        arrayList = null;
                    }
                    kotlin.jvm.internal.i.d(arrayList);
                    if (!arrayList.isEmpty()) {
                        for (String str4 : arrayList) {
                            z10 = true;
                            if (gv.n.A0(str4, str, true)) {
                                break;
                            }
                        }
                    }
                    z10 = false;
                    if (z10) {
                        arrayList4.add(obj);
                    }
                }
                arrayList2.addAll(arrayList4);
                Iterator<MiniCourseMetadata> it = this.A.iterator();
                while (it.hasNext()) {
                    MiniCourseMetadata next = it.next();
                    ArrayList<MiniCourse> arrayList5 = this.B;
                    ArrayList<MiniCourse> arrayList6 = this.f716x;
                    if (arrayList6 != null) {
                        Iterator<T> it2 = arrayList6.iterator();
                        while (it2.hasNext()) {
                            Object next2 = it2.next();
                            MiniCourse miniCourse = (MiniCourse) next2;
                            if (miniCourse != null) {
                                str2 = miniCourse.getDomain();
                            } else {
                                str2 = null;
                            }
                            if (next != null) {
                                str3 = next.getSlug();
                            } else {
                                str3 = null;
                            }
                            if (kotlin.jvm.internal.i.b(str2, str3)) {
                                break;
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                    kotlin.jvm.internal.i.q("miniCoursesList");
                    throw null;
                }
                this.D = str;
                O(K());
                return;
            }
            kotlin.jvm.internal.i.q("mcMetaDataList");
            throw null;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f713u, e10);
        }
    }

    public final void O(String str) {
        RecyclerView.e eVar;
        try {
            if (((RecyclerView) _$_findCachedViewById(R.id.rvLibraryDbShortCourses)).getAdapter() == null) {
                String str2 = gk.a.f16573a;
                Bundle bundle = new Bundle();
                bundle.putString("miniCourse_chip_selected", K());
                hs.k kVar = hs.k.f19476a;
                gk.a.b(bundle, "lib_course_list_view_load");
                ArrayList<MiniCourseMetadata> arrayList = this.A;
                ArrayList<MiniCourse> arrayList2 = this.B;
                androidx.fragment.app.p requireActivity = requireActivity();
                kotlin.jvm.internal.i.f(requireActivity, "requireActivity()");
                ((RecyclerView) _$_findCachedViewById(R.id.rvLibraryDbShortCourses)).setAdapter(new zm.j(arrayList, arrayList2, "course_list_view", str, requireActivity, new g()));
                return;
            }
            RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.rvLibraryDbShortCourses);
            zm.j jVar = null;
            if (recyclerView != null) {
                eVar = recyclerView.getAdapter();
            } else {
                eVar = null;
            }
            if (eVar instanceof zm.j) {
                jVar = (zm.j) eVar;
            }
            if (jVar != null) {
                jVar.w(str, this.A, this.B);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f713u, e10);
        }
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.E;
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
        return inflater.inflate(R.layout.fragment_all_short_courses, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.E.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        u0.e aVar;
        u0.e eVar;
        String str2 = this.f713u;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
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
        ArrayList<LogModel> arrayList = kn.a.f23436a;
        User user = FirebasePersistence.getInstance().getUser();
        if (user != null) {
            str = user.getCurrentCourseName();
        } else {
            str = null;
        }
        this.D = kn.a.j(kn.a.o(str));
        try {
            l0 a10 = new androidx.lifecycle.o0(this, new jl.b0(new e1(), 6)).a(j0.class);
            j0 j0Var = (j0) a10;
            j0Var.A.e(getViewLifecycleOwner(), new qm.c(12, new a(j0Var)));
            j0Var.B.e(getViewLifecycleOwner(), new qm.c(13, new b()));
            j0Var.D.e(getViewLifecycleOwner(), new qm.c(14, new c()));
            j0Var.F.e(getViewLifecycleOwner(), new qm.c(15, new d()));
            j0Var.E.e(getViewLifecycleOwner(), new qm.c(16, new e()));
            j0Var.f5583z.e(requireActivity(), new qm.c(17, new f()));
            ((RecyclerView) _$_findCachedViewById(R.id.rvLibraryDbShortCourses)).setLayoutManager(new LinearLayoutManager(requireActivity(), 1, false));
            this.f714v = (j0) a10;
            J();
            try {
                ((AppCompatImageView) _$_findCachedViewById(R.id.ivAllShortCoursesBack)).setOnClickListener(DebouncedOnClickListener.wrap(new ol.k(22, this)));
            } catch (Exception e11) {
                LogHelper.INSTANCE.e(str2, "Error adding chip", e11);
            }
        } catch (Exception e12) {
            LogHelper.INSTANCE.e(str2, e12);
        }
    }
}
