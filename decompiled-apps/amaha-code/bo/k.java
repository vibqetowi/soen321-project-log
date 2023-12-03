package bo;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.Barrier;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.m0;
import androidx.lifecycle.o0;
import androidx.lifecycle.q0;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import g0.a;
import is.u;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.y;
import ss.l;
/* compiled from: NewOnboardingMatchingQuestionFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lbo/k;", "Lrr/b;", "<init>", "()V", "a", Constants.ONBOARDING_VARIANT, "c", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class k extends rr.b {
    public static final /* synthetic */ int B = 0;

    /* renamed from: w  reason: collision with root package name */
    public eo.g f4599w;
    public final LinkedHashMap A = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f4597u = LogHelper.INSTANCE.makeLogTag("NewOnboardingMatchingQuestion");

    /* renamed from: v  reason: collision with root package name */
    public final m0 f4598v = b0.j(this, y.a(eo.f.class), new e(this), new f(this), new g(this));

    /* renamed from: x  reason: collision with root package name */
    public String f4600x = "domain";

    /* renamed from: y  reason: collision with root package name */
    public String f4601y = "therapist";

    /* renamed from: z  reason: collision with root package name */
    public int f4602z = 5;

    /* compiled from: NewOnboardingMatchingQuestionFragment.kt */
    /* loaded from: classes2.dex */
    public final class a extends RecyclerView.e<RecyclerView.c0> {

        /* renamed from: x  reason: collision with root package name */
        public final ArrayList<hs.j<String, String, Integer>> f4603x;

        /* renamed from: y  reason: collision with root package name */
        public final HashSet<Integer> f4604y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ k f4605z;

        /* compiled from: NewOnboardingMatchingQuestionFragment.kt */
        /* renamed from: bo.k$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public final class C0088a extends RecyclerView.c0 {
            public C0088a(View view) {
                super(view);
            }
        }

        public a(k kVar, ArrayList<hs.j<String, String, Integer>> optionsList, HashSet<Integer> hashSet) {
            kotlin.jvm.internal.i.g(optionsList, "optionsList");
            this.f4605z = kVar;
            this.f4603x = optionsList;
            this.f4604y = hashSet == null ? new HashSet<>() : hashSet;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.e
        public final int f() {
            return this.f4603x.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.e
        public final void n(RecyclerView.c0 c0Var, int i6) {
            View findViewById;
            Integer num;
            String str;
            View view = c0Var.f2751a;
            try {
                RobertoTextView robertoTextView = (RobertoTextView) view.findViewById(R.id.tvLayoutMatchingRowGridText);
                ArrayList<hs.j<String, String, Integer>> arrayList = this.f4603x;
                hs.k kVar = null;
                if (robertoTextView != null) {
                    hs.j jVar = (hs.j) u.j2(i6, arrayList);
                    if (jVar != null) {
                        str = (String) jVar.f19473u;
                    } else {
                        str = null;
                    }
                    robertoTextView.setText(str);
                }
                hs.j jVar2 = (hs.j) u.j2(i6, arrayList);
                if (jVar2 != null && (num = (Integer) jVar2.f19475w) != null) {
                    int intValue = num.intValue();
                    View findViewById2 = view.findViewById(R.id.ivLayoutMatchingRowGridImage);
                    if (findViewById2 != null) {
                        findViewById2.setVisibility(0);
                    }
                    AppCompatImageView appCompatImageView = (AppCompatImageView) view.findViewById(R.id.ivLayoutMatchingRowGridImage);
                    if (appCompatImageView != null) {
                        appCompatImageView.setImageResource(intValue);
                        kVar = hs.k.f19476a;
                    }
                }
                if (kVar == null && (findViewById = view.findViewById(R.id.ivLayoutMatchingRowGridImage)) != null) {
                    findViewById.setVisibility(8);
                }
                if (this.f4604y.contains(Integer.valueOf(i6))) {
                    View findViewById3 = view.findViewById(R.id.viewLayoutMatchingRowGridBackground);
                    if (findViewById3 != null) {
                        Context context = view.getContext();
                        Object obj = g0.a.f16164a;
                        findViewById3.setBackground(a.c.b(context, R.drawable.background_stroke_terracota_corner_8dp));
                    }
                } else {
                    View findViewById4 = view.findViewById(R.id.viewLayoutMatchingRowGridBackground);
                    if (findViewById4 != null) {
                        Context context2 = view.getContext();
                        Object obj2 = g0.a.f16164a;
                        findViewById4.setBackground(a.c.b(context2, R.drawable.background_stroke_gray_corner_8dp));
                    }
                }
                view.setOnClickListener(new ak.d(i6, 15, this));
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(this.f4605z.f4597u, e10);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.e
        public final RecyclerView.c0 p(int i6, RecyclerView parent) {
            kotlin.jvm.internal.i.g(parent, "parent");
            return new C0088a(defpackage.e.h(parent, R.layout.layout_matching_question_row_grid, parent, false, "from(parent.context).inf…_row_grid, parent, false)"));
        }
    }

    /* compiled from: NewOnboardingMatchingQuestionFragment.kt */
    /* loaded from: classes2.dex */
    public final class b extends RecyclerView.e<RecyclerView.c0> {

        /* renamed from: x  reason: collision with root package name */
        public final ArrayList<hs.j<String, String, Integer>> f4606x;

        /* renamed from: y  reason: collision with root package name */
        public Integer f4607y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ k f4608z;

        /* compiled from: NewOnboardingMatchingQuestionFragment.kt */
        /* loaded from: classes2.dex */
        public final class a extends RecyclerView.c0 {
            public a(View view) {
                super(view);
            }
        }

        public b(k kVar, ArrayList<hs.j<String, String, Integer>> optionsList, Integer num) {
            kotlin.jvm.internal.i.g(optionsList, "optionsList");
            this.f4608z = kVar;
            this.f4606x = optionsList;
            this.f4607y = num;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.e
        public final int f() {
            return this.f4606x.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.e
        public final void n(RecyclerView.c0 c0Var, int i6) {
            AppCompatImageView appCompatImageView;
            Integer num;
            String str;
            View view = c0Var.f2751a;
            try {
                RobertoTextView robertoTextView = (RobertoTextView) view.findViewById(R.id.tvLayoutMatchingItemText);
                ArrayList<hs.j<String, String, Integer>> arrayList = this.f4606x;
                hs.k kVar = null;
                if (robertoTextView != null) {
                    hs.j jVar = (hs.j) u.j2(i6, arrayList);
                    if (jVar != null) {
                        str = (String) jVar.f19473u;
                    } else {
                        str = null;
                    }
                    robertoTextView.setText(str);
                }
                hs.j jVar2 = (hs.j) u.j2(i6, arrayList);
                if (jVar2 != null && (num = (Integer) jVar2.f19475w) != null) {
                    int intValue = num.intValue();
                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) view.findViewById(R.id.ivLayoutMatchingItemImage);
                    if (appCompatImageView2 != null) {
                        appCompatImageView2.setVisibility(0);
                    }
                    AppCompatImageView appCompatImageView3 = (AppCompatImageView) view.findViewById(R.id.ivLayoutMatchingItemImage);
                    if (appCompatImageView3 != null) {
                        appCompatImageView3.setImageResource(intValue);
                        kVar = hs.k.f19476a;
                    }
                }
                if (kVar == null && (appCompatImageView = (AppCompatImageView) view.findViewById(R.id.ivLayoutMatchingItemImage)) != null) {
                    appCompatImageView.setVisibility(8);
                }
                Integer num2 = this.f4607y;
                if (num2 != null && num2.intValue() == i6) {
                    View findViewById = view.findViewById(R.id.viewLayoutMatchingItemBackground);
                    if (findViewById != null) {
                        Context context = view.getContext();
                        Object obj = g0.a.f16164a;
                        findViewById.setBackground(a.c.b(context, R.drawable.background_stroke_terracota_corner_8dp));
                    }
                    View findViewById2 = view.findViewById(R.id.ivLayoutMatchingCheckImage);
                    if (findViewById2 != null) {
                        findViewById2.setVisibility(0);
                    }
                    view.setOnClickListener(new ak.d(i6, this, 16));
                }
                View findViewById3 = view.findViewById(R.id.viewLayoutMatchingItemBackground);
                if (findViewById3 != null) {
                    Context context2 = view.getContext();
                    Object obj2 = g0.a.f16164a;
                    findViewById3.setBackground(a.c.b(context2, R.drawable.background_stroke_gray_corner_8dp));
                }
                View findViewById4 = view.findViewById(R.id.ivLayoutMatchingCheckImage);
                if (findViewById4 != null) {
                    findViewById4.setVisibility(8);
                }
                view.setOnClickListener(new ak.d(i6, this, 16));
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(this.f4608z.f4597u, e10);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.e
        public final RecyclerView.c0 p(int i6, RecyclerView parent) {
            kotlin.jvm.internal.i.g(parent, "parent");
            return new a(defpackage.e.h(parent, R.layout.layout_matching_question_row_item, parent, false, "from(parent.context).inf…_row_item, parent, false)"));
        }
    }

    /* compiled from: NewOnboardingMatchingQuestionFragment.kt */
    /* loaded from: classes2.dex */
    public static final class c extends RecyclerView.e<RecyclerView.c0> {
        public final hs.j<String, String, Integer> A;
        public final hs.j<String, String, Integer> B;
        public final eo.a C;
        public final l<Integer, hs.k> D;
        public final String E = LogHelper.INSTANCE.makeLogTag("OnboardingMatchingResponseSummary");

        /* renamed from: x  reason: collision with root package name */
        public final List<hs.j<String, String, Integer>> f4609x;

        /* renamed from: y  reason: collision with root package name */
        public final List<hs.j<String, String, Integer>> f4610y;

        /* renamed from: z  reason: collision with root package name */
        public final hs.j<String, String, Integer> f4611z;

        /* compiled from: NewOnboardingMatchingQuestionFragment.kt */
        /* loaded from: classes2.dex */
        public final class a extends RecyclerView.c0 {
            public a(View view) {
                super(view);
            }
        }

        public c(List list, List list2, hs.j jVar, hs.j jVar2, hs.j jVar3, eo.a aVar, d dVar) {
            this.f4609x = list;
            this.f4610y = list2;
            this.f4611z = jVar;
            this.A = jVar2;
            this.B = jVar3;
            this.C = aVar;
            this.D = dVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.e
        public final int f() {
            if (this.C == eo.a.MATCHING_THERAPY) {
                return 5;
            }
            return 3;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.e
        public final void n(RecyclerView.c0 c0Var, int i6) {
            String str;
            String v10;
            String v11;
            View view = c0Var.f2751a;
            try {
                RobertoTextView robertoTextView = (RobertoTextView) view.findViewById(R.id.ivLayoutMatchingResponseNumber);
                if (robertoTextView != null) {
                    robertoTextView.setText(String.valueOf(i6 + 1));
                }
                RobertoTextView robertoTextView2 = (RobertoTextView) view.findViewById(R.id.tvLayoutMatchingResponseHeader);
                if (robertoTextView2 != null) {
                    if (i6 != 0) {
                        if (i6 != 1) {
                            if (i6 != 2) {
                                if (i6 != 3) {
                                    str = "Your age:";
                                } else {
                                    str = "Languages you’re comfortable with:";
                                }
                            } else {
                                str = "How difficult it is for you to function normally?";
                            }
                        } else {
                            str = "Duration of your concerns:";
                        }
                    } else {
                        str = "Your concerns:";
                    }
                    robertoTextView2.setText(str);
                }
                eo.a aVar = this.C;
                eo.a aVar2 = eo.a.MATCHING_THERAPY;
                hs.j<String, String, Integer> jVar = this.B;
                hs.j<String, String, Integer> jVar2 = this.f4611z;
                List<hs.j<String, String, Integer>> list = this.f4609x;
                if (aVar == aVar2) {
                    RobertoTextView robertoTextView3 = (RobertoTextView) view.findViewById(R.id.tvLayoutMatchingResponseBody);
                    if (robertoTextView3 != null) {
                        if (i6 != 0) {
                            if (i6 != 1) {
                                v11 = null;
                                ArrayList arrayList = null;
                                if (i6 != 2) {
                                    if (i6 != 3) {
                                        v11 = jVar.f19473u;
                                    } else {
                                        List<hs.j<String, String, Integer>> list2 = this.f4610y;
                                        if (list2 != null) {
                                            arrayList = new ArrayList(is.i.H1(list2, 10));
                                            Iterator<T> it = list2.iterator();
                                            while (it.hasNext()) {
                                                arrayList.add((String) ((hs.j) it.next()).f19473u);
                                            }
                                        }
                                        v11 = v(arrayList);
                                    }
                                } else {
                                    hs.j<String, String, Integer> jVar3 = this.A;
                                    if (jVar3 != null) {
                                        v11 = jVar3.f19473u;
                                    }
                                }
                            } else {
                                v11 = jVar2.f19473u;
                            }
                        } else {
                            ArrayList arrayList2 = new ArrayList(is.i.H1(list, 10));
                            Iterator<T> it2 = list.iterator();
                            while (it2.hasNext()) {
                                arrayList2.add((String) ((hs.j) it2.next()).f19473u);
                            }
                            v11 = v(arrayList2);
                        }
                        robertoTextView3.setText(v11);
                    }
                } else {
                    RobertoTextView robertoTextView4 = (RobertoTextView) view.findViewById(R.id.tvLayoutMatchingResponseBody);
                    if (robertoTextView4 != null) {
                        if (i6 != 0) {
                            if (i6 != 1) {
                                v10 = jVar.f19473u;
                            } else {
                                v10 = jVar2.f19473u;
                            }
                        } else {
                            ArrayList arrayList3 = new ArrayList(is.i.H1(list, 10));
                            Iterator<T> it3 = list.iterator();
                            while (it3.hasNext()) {
                                arrayList3.add((String) ((hs.j) it3.next()).f19473u);
                            }
                            v10 = v(arrayList3);
                        }
                        robertoTextView4.setText(v10);
                    }
                }
                View findViewById = view.findViewById(R.id.tvLayoutMatchingResponseEdit);
                if (findViewById != null) {
                    findViewById.setOnClickListener(new ak.d(i6, 17, this));
                }
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(this.E, e10);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.e
        public final RecyclerView.c0 p(int i6, RecyclerView parent) {
            kotlin.jvm.internal.i.g(parent, "parent");
            return new a(defpackage.e.h(parent, R.layout.layout_matching_question_response_item, parent, false, "from(parent.context).inf…onse_item, parent, false)"));
        }

        public final String v(ArrayList arrayList) {
            if (arrayList == null) {
                return "";
            }
            try {
                Iterator it = arrayList.iterator();
                boolean z10 = true;
                String str = "";
                while (it.hasNext()) {
                    String str2 = (String) it.next();
                    if (z10) {
                        str = str + str2;
                        z10 = false;
                    } else {
                        str = str + ", " + str2;
                    }
                }
                return str;
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(this.E, e10);
                return "";
            }
        }
    }

    /* compiled from: NewOnboardingMatchingQuestionFragment.kt */
    /* loaded from: classes2.dex */
    public static final class d extends kotlin.jvm.internal.k implements l<Integer, hs.k> {
        public d() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(Integer num) {
            String str;
            eo.a aVar;
            String str2;
            int intValue = num.intValue();
            if (intValue != 0) {
                if (intValue != 1) {
                    if (intValue != 2) {
                        if (intValue != 3) {
                            if (intValue != 4) {
                                str = "q0";
                            } else {
                                str = "q5";
                            }
                        } else {
                            str = "q4";
                        }
                    } else {
                        str = "q3";
                    }
                } else {
                    str = "q2";
                }
            } else {
                str = "q1";
            }
            String str3 = gk.a.f16573a;
            Bundle bundle = new Bundle();
            k kVar = k.this;
            eo.g gVar = kVar.f4599w;
            if (gVar != null) {
                aVar = gVar.h();
            } else {
                aVar = null;
            }
            if (aVar == eo.a.MATCHING_THERAPY) {
                str2 = "therapy";
            } else {
                str2 = "psychiatry";
            }
            bundle.putString("flow", str2);
            bundle.putString("source", "app_onboarding_matching");
            bundle.putString("question", str);
            hs.k kVar2 = hs.k.f19476a;
            gk.a.b(bundle, "setpref_flow_edit");
            eo.g gVar2 = kVar.f4599w;
            if (gVar2 != null) {
                gVar2.P(intValue);
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class e extends kotlin.jvm.internal.k implements ss.a<q0> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f4613u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f4613u = fragment;
        }

        @Override // ss.a
        public final q0 invoke() {
            return defpackage.e.m(this.f4613u, "requireActivity().viewModelStore");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class f extends kotlin.jvm.internal.k implements ss.a<k1.a> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f4614u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Fragment fragment) {
            super(0);
            this.f4614u = fragment;
        }

        @Override // ss.a
        public final k1.a invoke() {
            return defpackage.b.r(this.f4614u, "requireActivity().defaultViewModelCreationExtras");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class g extends kotlin.jvm.internal.k implements ss.a<o0.b> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f4615u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Fragment fragment) {
            super(0);
            this.f4615u = fragment;
        }

        @Override // ss.a
        public final o0.b invoke() {
            return pl.a.e(this.f4615u, "requireActivity().defaultViewModelProviderFactory");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    @Override // rr.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean I() {
        RecyclerView.e eVar;
        b bVar;
        RecyclerView.e eVar2;
        a aVar;
        boolean z10;
        try {
            Integer num = null;
            HashSet<Integer> hashSet = null;
            if (is.k.Q1(this.f4600x, new String[]{"domain", "language"})) {
                RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.rvMatchingQuestionResponseContainer);
                if (recyclerView != null) {
                    eVar2 = recyclerView.getAdapter();
                } else {
                    eVar2 = null;
                }
                if (eVar2 instanceof a) {
                    aVar = (a) eVar2;
                } else {
                    aVar = null;
                }
                if (aVar != null) {
                    hashSet = aVar.f4604y;
                }
                if (hashSet != null && !hashSet.isEmpty()) {
                    z10 = false;
                    if (!z10) {
                        return false;
                    }
                }
                z10 = true;
                if (!z10) {
                }
            } else {
                RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(R.id.rvMatchingQuestionResponseContainer);
                if (recyclerView2 != null) {
                    eVar = recyclerView2.getAdapter();
                } else {
                    eVar = null;
                }
                if (eVar instanceof b) {
                    bVar = (b) eVar;
                } else {
                    bVar = null;
                }
                if (bVar != null) {
                    num = bVar.f4607y;
                }
                if (num == null) {
                    return false;
                }
            }
            return true;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f4597u, e10);
            return false;
        }
    }

    public final eo.f J() {
        return (eo.f) this.f4598v.getValue();
    }

    public final void K(String str) {
        eo.a aVar;
        String str2;
        String str3 = gk.a.f16573a;
        Bundle a10 = r1.b0.a("screen", str);
        eo.g gVar = this.f4599w;
        if (gVar != null) {
            aVar = gVar.h();
        } else {
            aVar = null;
        }
        if (aVar == eo.a.MATCHING_THERAPY) {
            str2 = "therapy";
        } else {
            str2 = "psychiatry";
        }
        a10.putString("flow", str2);
        a10.putString("source", "app_onboarding_matching");
        hs.k kVar = hs.k.f19476a;
        gk.a.b(a10, "setpref_flow_proceed");
    }

    public final void M(int i6) {
        if (i6 >= 2) {
            try {
                _$_findCachedViewById(R.id.viewMatchingQuestionProgress1).setBackgroundTintList(g0.a.c(R.color.amahaTerracota, requireContext()));
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(this.f4597u, e10);
                return;
            }
        }
        if (i6 >= 3) {
            _$_findCachedViewById(R.id.viewMatchingQuestionProgress2).setBackgroundTintList(g0.a.c(R.color.amahaTerracota, requireContext()));
        }
        if (i6 >= 4) {
            _$_findCachedViewById(R.id.viewMatchingQuestionProgress3).setBackgroundTintList(g0.a.c(R.color.amahaTerracota, requireContext()));
        }
        if (i6 >= 5) {
            _$_findCachedViewById(R.id.viewMatchingQuestionProgress4).setBackgroundTintList(g0.a.c(R.color.amahaTerracota, requireContext()));
        }
        if (i6 == 6) {
            _$_findCachedViewById(R.id.viewMatchingQuestionProgress5).setBackgroundTintList(g0.a.c(R.color.amahaTerracota, requireContext()));
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i6 - 1);
        sb2.append('/');
        sb2.append(this.f4602z);
        ((RobertoTextView) _$_findCachedViewById(R.id.tvMatchingQuestionProgress)).setText(sb2.toString());
    }

    public final void O(ArrayList<hs.j<String, String, Integer>> arrayList, HashSet<Integer> hashSet) {
        try {
            RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.rvMatchingQuestionResponseContainer);
            if (recyclerView != null) {
                recyclerView.setLayoutManager(new GridLayoutManager(requireContext(), 2));
            }
            RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(R.id.rvMatchingQuestionResponseContainer);
            if (recyclerView2 != null) {
                recyclerView2.setAdapter(new a(this, arrayList, hashSet));
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f4597u, e10);
        }
    }

    public final void P(Integer num, ArrayList arrayList) {
        try {
            RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.rvMatchingQuestionResponseContainer);
            if (recyclerView != null) {
                recyclerView.setLayoutManager(new LinearLayoutManager(requireContext(), 1, false));
            }
            RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(R.id.rvMatchingQuestionResponseContainer);
            if (recyclerView2 != null) {
                recyclerView2.setAdapter(new b(this, arrayList, num));
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f4597u, e10);
        }
    }

    public final void Q() {
        eo.a aVar;
        RecyclerView recyclerView;
        eo.a aVar2;
        eo.a h10;
        try {
            AppCompatImageView appCompatImageView = (AppCompatImageView) _$_findCachedViewById(R.id.ivMatchingQuestionSummaryImage);
            if (appCompatImageView != null) {
                appCompatImageView.setVisibility(0);
            }
            RobertoTextView robertoTextView = (RobertoTextView) _$_findCachedViewById(R.id.tvMatchingQuestionSummaryHeader);
            if (robertoTextView != null) {
                robertoTextView.setVisibility(0);
            }
            RobertoTextView robertoTextView2 = (RobertoTextView) _$_findCachedViewById(R.id.tvMatchingQuestionSummarySubHeader);
            if (robertoTextView2 != null) {
                robertoTextView2.setVisibility(0);
            }
            RobertoTextView robertoTextView3 = (RobertoTextView) _$_findCachedViewById(R.id.tvMatchingQuestionText);
            if (robertoTextView3 != null) {
                robertoTextView3.setVisibility(8);
            }
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) _$_findCachedViewById(R.id.ivMatchingQuestionImage);
            if (appCompatImageView2 != null) {
                appCompatImageView2.setVisibility(4);
            }
            View _$_findCachedViewById = _$_findCachedViewById(R.id.viewMatchingQuestionProgress5);
            if (_$_findCachedViewById != null) {
                _$_findCachedViewById.setVisibility(4);
            }
            View _$_findCachedViewById2 = _$_findCachedViewById(R.id.viewMatchingQuestionProgress4);
            if (_$_findCachedViewById2 != null) {
                _$_findCachedViewById2.setVisibility(4);
            }
            View _$_findCachedViewById3 = _$_findCachedViewById(R.id.viewMatchingQuestionProgress3);
            if (_$_findCachedViewById3 != null) {
                _$_findCachedViewById3.setVisibility(4);
            }
            View _$_findCachedViewById4 = _$_findCachedViewById(R.id.viewMatchingQuestionProgress2);
            if (_$_findCachedViewById4 != null) {
                _$_findCachedViewById4.setVisibility(4);
            }
            View _$_findCachedViewById5 = _$_findCachedViewById(R.id.viewMatchingQuestionProgress1);
            if (_$_findCachedViewById5 != null) {
                _$_findCachedViewById5.setVisibility(4);
            }
            RobertoTextView robertoTextView4 = (RobertoTextView) _$_findCachedViewById(R.id.tvMatchingQuestionProgress);
            if (robertoTextView4 != null) {
                robertoTextView4.setVisibility(4);
            }
            RobertoTextView robertoTextView5 = (RobertoTextView) _$_findCachedViewById(R.id.tvMatchingQuestionDescription);
            if (robertoTextView5 != null) {
                robertoTextView5.setVisibility(8);
            }
            eo.g gVar = this.f4599w;
            if (gVar != null) {
                aVar = gVar.h();
            } else {
                aVar = null;
            }
            eo.a aVar3 = eo.a.MATCHING_THERAPY;
            if (aVar == aVar3) {
                RobertoTextView robertoTextView6 = (RobertoTextView) _$_findCachedViewById(R.id.tvMatchingQuestion24HourPrompt);
                if (robertoTextView6 != null) {
                    robertoTextView6.setVisibility(0);
                }
                AppCompatImageView appCompatImageView3 = (AppCompatImageView) _$_findCachedViewById(R.id.ivMatchingQuestion24HourCheck);
                if (appCompatImageView3 != null) {
                    appCompatImageView3.setVisibility(0);
                }
            } else {
                Barrier barrier = (Barrier) _$_findCachedViewById(R.id.barrierMatchingQuestionHeader);
                if (barrier != null) {
                    barrier.setVisibility(8);
                }
            }
            RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(R.id.rvMatchingQuestionResponseContainer);
            if (recyclerView2 != null) {
                recyclerView2.setLayoutManager(new LinearLayoutManager(requireContext(), 1, false));
            }
            ((AppCompatImageView) _$_findCachedViewById(R.id.ivMatchingQuestion24HourCheck)).setOnClickListener(new j(this, 2));
            if (J().f14444y != null && J().A != null && J().C != null && (recyclerView = (RecyclerView) _$_findCachedViewById(R.id.rvMatchingQuestionResponseContainer)) != null) {
                List<hs.j<String, String, Integer>> list = J().f14444y;
                kotlin.jvm.internal.i.d(list);
                List<hs.j<String, String, Integer>> list2 = J().f14445z;
                hs.j<String, String, Integer> jVar = J().A;
                kotlin.jvm.internal.i.d(jVar);
                hs.j<String, String, Integer> jVar2 = J().B;
                hs.j<String, String, Integer> jVar3 = J().C;
                kotlin.jvm.internal.i.d(jVar3);
                eo.g gVar2 = this.f4599w;
                if (gVar2 != null && (h10 = gVar2.h()) != null) {
                    aVar2 = h10;
                    recyclerView.setAdapter(new c(list, list2, jVar, jVar2, jVar3, aVar2, new d()));
                }
                aVar2 = aVar3;
                recyclerView.setAdapter(new c(list, list2, jVar, jVar2, jVar3, aVar2, new d()));
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f4597u, e10);
        }
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
    public final void onAttach(Context context) {
        kotlin.jvm.internal.i.g(context, "context");
        super.onAttach(context);
        if (context instanceof eo.g) {
            this.f4599w = (eo.g) context;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.g(inflater, "inflater");
        return inflater.inflate(R.layout.layout_matching_question, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.A.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        eo.a aVar;
        String str2;
        eo.a aVar2;
        boolean z10;
        ArrayList arrayList;
        boolean z11;
        ArrayList arrayList2;
        boolean z12;
        boolean z13;
        boolean z14;
        eo.a aVar3;
        String str3;
        kotlin.jvm.internal.i.g(view, "view");
        try {
            super.onViewCreated(view, bundle);
            Bundle arguments = getArguments();
            Integer num = null;
            r12 = null;
            Integer num2 = null;
            r12 = null;
            Integer num3 = null;
            HashSet<Integer> hashSet = null;
            HashSet<Integer> hashSet2 = null;
            num = null;
            if (arguments != null) {
                str = arguments.getString("questionType");
            } else {
                str = null;
            }
            if (str == null) {
                str = "domain";
            }
            this.f4600x = str;
            eo.g gVar = this.f4599w;
            if (gVar != null) {
                aVar = gVar.h();
            } else {
                aVar = null;
            }
            eo.a aVar4 = eo.a.MATCHING_THERAPY;
            if (aVar == aVar4) {
                str2 = "therapist";
            } else {
                str2 = "psychiatrist";
            }
            this.f4601y = str2;
            if (kotlin.jvm.internal.i.b(this.f4600x, "summary")) {
                RobertoTextView robertoTextView = (RobertoTextView) _$_findCachedViewById(R.id.tvMatchingQuestionResponseCta);
                eo.g gVar2 = this.f4599w;
                if (gVar2 != null) {
                    aVar3 = gVar2.h();
                } else {
                    aVar3 = null;
                }
                if (aVar3 == aVar4) {
                    str3 = "FIND A THERAPIST";
                } else {
                    str3 = "FIND A PSYCHIATRIST";
                }
                robertoTextView.setText(str3);
            } else {
                ((RobertoTextView) _$_findCachedViewById(R.id.tvMatchingQuestionResponseCta)).setText("NEXT");
            }
            eo.g gVar3 = this.f4599w;
            if (gVar3 != null) {
                aVar2 = gVar3.h();
            } else {
                aVar2 = null;
            }
            if (aVar2 == aVar4) {
                this.f4602z = 5;
                _$_findCachedViewById(R.id.viewMatchingQuestionProgress4).setVisibility(0);
                _$_findCachedViewById(R.id.viewMatchingQuestionProgress5).setVisibility(0);
            } else {
                this.f4602z = 3;
                _$_findCachedViewById(R.id.viewMatchingQuestionProgress4).setVisibility(8);
                _$_findCachedViewById(R.id.viewMatchingQuestionProgress5).setVisibility(8);
            }
            eo.g gVar4 = this.f4599w;
            if (gVar4 != null) {
                M(Integer.valueOf(gVar4.getCurrentPosition()).intValue());
            }
            String str4 = this.f4600x;
            switch (str4.hashCode()) {
                case -1992012396:
                    if (!str4.equals("duration")) {
                        break;
                    } else {
                        ((AppCompatImageView) _$_findCachedViewById(R.id.ivMatchingQuestionImage)).setImageResource(R.drawable.ic_on_boarding_duration_screen);
                        ((RobertoTextView) _$_findCachedViewById(R.id.tvMatchingQuestionText)).setText(requireActivity().getString(R.string.on_boarding_duration_screen_header));
                        ((RobertoTextView) _$_findCachedViewById(R.id.tvMatchingQuestionDescription)).setText(requireActivity().getString(R.string.on_boarding_duration_screen_description, this.f4601y));
                        hs.j<String, String, Integer> jVar = J().A;
                        if (jVar != null) {
                            Iterator<hs.j<String, String, Integer>> it = J().M.iterator();
                            int i6 = 0;
                            while (true) {
                                if (it.hasNext()) {
                                    if (!kotlin.jvm.internal.i.b(it.next().f19474v, jVar.f19474v)) {
                                        i6++;
                                    }
                                } else {
                                    i6 = -1;
                                }
                            }
                            Integer valueOf = Integer.valueOf(i6);
                            if (valueOf.intValue() == -1) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (!z10) {
                                num = valueOf;
                            }
                        }
                        P(num, J().M);
                        break;
                    }
                case -1857640538:
                    if (!str4.equals("summary")) {
                        break;
                    } else {
                        Q();
                        break;
                    }
                case -1613589672:
                    if (!str4.equals("language")) {
                        break;
                    } else {
                        ((AppCompatImageView) _$_findCachedViewById(R.id.ivMatchingQuestionImage)).setImageResource(R.drawable.ic_on_boarding_language_screen);
                        ((RobertoTextView) _$_findCachedViewById(R.id.tvMatchingQuestionText)).setText(requireActivity().getString(R.string.on_boarding_language_screen_header));
                        ((RobertoTextView) _$_findCachedViewById(R.id.tvMatchingQuestionDescription)).setText(requireActivity().getString(R.string.on_boarding_language_screen_description));
                        List<hs.j<String, String, Integer>> list = J().f14445z;
                        if (list != null) {
                            arrayList = new ArrayList();
                            Iterator<T> it2 = list.iterator();
                            while (it2.hasNext()) {
                                hs.j jVar2 = (hs.j) it2.next();
                                Iterator<hs.j<String, String, Integer>> it3 = J().L.iterator();
                                int i10 = 0;
                                while (true) {
                                    if (it3.hasNext()) {
                                        if (!kotlin.jvm.internal.i.b(it3.next().f19474v, jVar2.f19474v)) {
                                            i10++;
                                        }
                                    } else {
                                        i10 = -1;
                                    }
                                }
                                Integer valueOf2 = Integer.valueOf(i10);
                                if (valueOf2.intValue() == -1) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                if (z11) {
                                    valueOf2 = null;
                                }
                                if (valueOf2 != null) {
                                    arrayList.add(valueOf2);
                                }
                            }
                        } else {
                            arrayList = null;
                        }
                        if (arrayList != null) {
                            hashSet2 = new HashSet<>();
                            hashSet2.addAll(arrayList);
                        }
                        O(J().L, hashSet2);
                        break;
                    }
                case -1326197564:
                    if (!str4.equals("domain")) {
                        break;
                    } else {
                        ((AppCompatImageView) _$_findCachedViewById(R.id.ivMatchingQuestionImage)).setImageResource(R.drawable.ic_on_boarding_domain_screen);
                        ((RobertoTextView) _$_findCachedViewById(R.id.tvMatchingQuestionText)).setText(requireActivity().getString(R.string.on_boarding_domain_screen_header));
                        ((RobertoTextView) _$_findCachedViewById(R.id.tvMatchingQuestionDescription)).setText(requireActivity().getString(R.string.on_boarding_domain_screen_description, this.f4601y));
                        List<hs.j<String, String, Integer>> list2 = J().f14444y;
                        if (list2 != null) {
                            arrayList2 = new ArrayList();
                            Iterator<T> it4 = list2.iterator();
                            while (it4.hasNext()) {
                                hs.j jVar3 = (hs.j) it4.next();
                                Iterator<hs.j<String, String, Integer>> it5 = J().K.iterator();
                                int i11 = 0;
                                while (true) {
                                    if (it5.hasNext()) {
                                        if (!kotlin.jvm.internal.i.b(it5.next().f19474v, jVar3.f19474v)) {
                                            i11++;
                                        }
                                    } else {
                                        i11 = -1;
                                    }
                                }
                                Integer valueOf3 = Integer.valueOf(i11);
                                if (valueOf3.intValue() == -1) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                if (z12) {
                                    valueOf3 = null;
                                }
                                if (valueOf3 != null) {
                                    arrayList2.add(valueOf3);
                                }
                            }
                        } else {
                            arrayList2 = null;
                        }
                        if (arrayList2 != null) {
                            hashSet = new HashSet<>();
                            hashSet.addAll(arrayList2);
                        }
                        O(J().K, hashSet);
                        break;
                    }
                case 96511:
                    if (!str4.equals("age")) {
                        break;
                    } else {
                        ((AppCompatImageView) _$_findCachedViewById(R.id.ivMatchingQuestionImage)).setImageResource(R.drawable.ic_on_boarding_age_screen);
                        ((RobertoTextView) _$_findCachedViewById(R.id.tvMatchingQuestionText)).setText(requireActivity().getString(R.string.on_boarding_age_screen_header));
                        ((RobertoTextView) _$_findCachedViewById(R.id.tvMatchingQuestionDescription)).setText(requireActivity().getString(R.string.on_boarding_age_screen_description, this.f4601y));
                        hs.j<String, String, Integer> jVar4 = J().C;
                        if (jVar4 != null) {
                            Iterator<hs.j<String, String, Integer>> it6 = J().O.iterator();
                            int i12 = 0;
                            while (true) {
                                if (it6.hasNext()) {
                                    if (!kotlin.jvm.internal.i.b(it6.next().f19474v, jVar4.f19474v)) {
                                        i12++;
                                    }
                                } else {
                                    i12 = -1;
                                }
                            }
                            Integer valueOf4 = Integer.valueOf(i12);
                            if (valueOf4.intValue() == -1) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            if (!z13) {
                                num3 = valueOf4;
                            }
                        }
                        P(num3, J().O);
                        break;
                    }
                case 1829500859:
                    if (!str4.equals("difficulty")) {
                        break;
                    } else {
                        ((AppCompatImageView) _$_findCachedViewById(R.id.ivMatchingQuestionImage)).setImageResource(R.drawable.ic_on_boarding_difficulty_screen);
                        ((RobertoTextView) _$_findCachedViewById(R.id.tvMatchingQuestionText)).setText(requireActivity().getString(R.string.on_boarding_difficulty_screen_header));
                        ((RobertoTextView) _$_findCachedViewById(R.id.tvMatchingQuestionDescription)).setText(requireActivity().getString(R.string.on_boarding_difficulty_screen_description));
                        hs.j<String, String, Integer> jVar5 = J().B;
                        if (jVar5 != null) {
                            Iterator<hs.j<String, String, Integer>> it7 = J().N.iterator();
                            int i13 = 0;
                            while (true) {
                                if (it7.hasNext()) {
                                    if (!kotlin.jvm.internal.i.b(it7.next().f19474v, jVar5.f19474v)) {
                                        i13++;
                                    }
                                } else {
                                    i13 = -1;
                                }
                            }
                            Integer valueOf5 = Integer.valueOf(i13);
                            if (valueOf5.intValue() == -1) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            if (!z14) {
                                num2 = valueOf5;
                            }
                        }
                        P(num2, J().N);
                        break;
                    }
            }
            RobertoTextView robertoTextView2 = (RobertoTextView) _$_findCachedViewById(R.id.tvMatchingQuestionResponseCta);
            if (robertoTextView2 != null) {
                robertoTextView2.setOnClickListener(new j(this, 0));
            }
            ((AppCompatImageView) _$_findCachedViewById(R.id.ivMatchingQuestionBack)).setOnClickListener(new j(this, 1));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f4597u, e10);
        }
    }
}
