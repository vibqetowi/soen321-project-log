package hr;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.o0;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.components.goals.model.FirestoreGoal;
import com.theinnerhour.b2b.model.TemplateModel;
import com.theinnerhour.b2b.utils.LogHelper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
/* compiled from: ScreenResult20FragmentNew.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhr/m1;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class m1 extends rr.b {

    /* renamed from: z  reason: collision with root package name */
    public static final /* synthetic */ int f18785z = 0;

    /* renamed from: w  reason: collision with root package name */
    public TemplateActivity f18788w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f18789x;

    /* renamed from: y  reason: collision with root package name */
    public final LinkedHashMap f18790y = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f18786u = LogHelper.INSTANCE.makeLogTag(m1.class);

    /* renamed from: v  reason: collision with root package name */
    public final androidx.lifecycle.m0 f18787v = kotlin.jvm.internal.b0.j(this, kotlin.jvm.internal.y.a(fm.a.class), new c(this), new d(this), new e(this));

    /* compiled from: ScreenResult20FragmentNew.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.l<hs.f<? extends Boolean, ? extends FirestoreGoal>, hs.k> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ fm.a f18792v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ String f18793w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ ArrayList<String> f18794x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(fm.a aVar, String str, ArrayList<String> arrayList) {
            super(1);
            this.f18792v = aVar;
            this.f18793w = str;
            this.f18794x = arrayList;
        }

        @Override // ss.l
        public final hs.k invoke(hs.f<? extends Boolean, ? extends FirestoreGoal> fVar) {
            hs.f<? extends Boolean, ? extends FirestoreGoal> fVar2 = fVar;
            if (fVar2 != null) {
                m1 m1Var = m1.this;
                TemplateActivity templateActivity = m1Var.f18788w;
                if (templateActivity != null) {
                    boolean z10 = templateActivity.J;
                    String str = this.f18793w;
                    boolean z11 = true;
                    if (!z10 && !templateActivity.I) {
                        if (fVar2.f19465v == 0) {
                            z11 = false;
                        }
                        m1.J(m1Var, str, z11, this.f18794x);
                    } else {
                        m1Var.f18789x = true;
                        this.f18792v.n(str);
                    }
                } else {
                    kotlin.jvm.internal.i.q("act");
                    throw null;
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: ScreenResult20FragmentNew.kt */
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.l<List<? extends HashMap<String, Object>>, hs.k> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ String f18796v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(1);
            this.f18796v = str;
        }

        @Override // ss.l
        public final hs.k invoke(List<? extends HashMap<String, Object>> list) {
            String str;
            List<? extends HashMap<String, Object>> list2 = list;
            if (list2 != null) {
                m1 m1Var = m1.this;
                if (m1Var.f18789x) {
                    m1Var.f18789x = false;
                    ArrayList arrayList = new ArrayList();
                    Iterator<T> it = list2.iterator();
                    while (it.hasNext()) {
                        Object obj = ((HashMap) it.next()).get("value");
                        if (obj instanceof String) {
                            str = (String) obj;
                        } else {
                            str = null;
                        }
                        if (str != null) {
                            arrayList.add(str);
                        }
                    }
                    m1.J(m1Var, this.f18796v, true, arrayList);
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class c extends kotlin.jvm.internal.k implements ss.a<androidx.lifecycle.q0> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f18797u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f18797u = fragment;
        }

        @Override // ss.a
        public final androidx.lifecycle.q0 invoke() {
            return defpackage.e.m(this.f18797u, "requireActivity().viewModelStore");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class d extends kotlin.jvm.internal.k implements ss.a<k1.a> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f18798u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f18798u = fragment;
        }

        @Override // ss.a
        public final k1.a invoke() {
            return defpackage.b.r(this.f18798u, "requireActivity().defaultViewModelCreationExtras");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class e extends kotlin.jvm.internal.k implements ss.a<o0.b> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f18799u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f18799u = fragment;
        }

        @Override // ss.a
        public final o0.b invoke() {
            return pl.a.e(this.f18799u, "requireActivity().defaultViewModelProviderFactory");
        }
    }

    public static final void J(m1 m1Var, String str, boolean z10, ArrayList arrayList) {
        TemplateActivity templateActivity = m1Var.f18788w;
        if (templateActivity != null) {
            if (templateActivity.J || templateActivity.I) {
                templateActivity.F.put("list", arrayList);
            }
            ((TextView) m1Var._$_findCachedViewById(R.id.result1)).setText((CharSequence) arrayList.get(0));
            ((Button) m1Var._$_findCachedViewById(R.id.button1)).setOnClickListener(new z0(m1Var, 4));
            ((Button) m1Var._$_findCachedViewById(R.id.button2)).setOnClickListener(new zk.k(z10, (rr.b) m1Var, (List) arrayList, str, 10));
            return;
        }
        kotlin.jvm.internal.i.q("act");
        throw null;
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f18790y;
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
        return inflater.inflate(R.layout.fragment_screen_result_20, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        fm.a aVar = (fm.a) this.f18787v.getValue();
        aVar.f15174h0.k(getViewLifecycleOwner());
        aVar.f15177k0.k(getViewLifecycleOwner());
        aVar.f15178l0.k(getViewLifecycleOwner());
        aVar.f15180n0.k(getViewLifecycleOwner());
        aVar.f15181o0.k(getViewLifecycleOwner());
        aVar.f15182p0.k(getViewLifecycleOwner());
        aVar.w();
        super.onDestroyView();
        this.f18790y.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String label;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            androidx.fragment.app.p requireActivity = requireActivity();
            kotlin.jvm.internal.i.e(requireActivity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            TemplateActivity templateActivity = (TemplateActivity) requireActivity;
            this.f18788w = templateActivity;
            Object obj = templateActivity.F.get("list");
            kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>");
            ArrayList arrayList = (ArrayList) obj;
            TemplateActivity templateActivity2 = this.f18788w;
            if (templateActivity2 != null) {
                TemplateModel templateModel = templateActivity2.f10547y;
                if (templateModel != null && (label = templateModel.getLabel()) != null) {
                    fm.a aVar = (fm.a) this.f18787v.getValue();
                    aVar.m(label, "result_20");
                    aVar.f15178l0.e(getViewLifecycleOwner(), new m0(20, new a(aVar, label, arrayList)));
                    aVar.f15180n0.e(getViewLifecycleOwner(), new m0(21, new b(label)));
                    return;
                }
                return;
            }
            kotlin.jvm.internal.i.q("act");
            throw null;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f18786u, "Excption in on view created", e10);
        }
    }
}
