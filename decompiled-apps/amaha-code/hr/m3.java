package hr;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.o0;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.components.goals.model.FirestoreGoal;
import com.theinnerhour.b2b.model.TemplateModel;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
/* compiled from: ScreenResult5FragmentNew.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhr/m3;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class m3 extends rr.b {

    /* renamed from: z  reason: collision with root package name */
    public static final /* synthetic */ int f18806z = 0;

    /* renamed from: w  reason: collision with root package name */
    public TemplateActivity f18809w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f18810x;

    /* renamed from: y  reason: collision with root package name */
    public final LinkedHashMap f18811y = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f18807u = LogHelper.INSTANCE.makeLogTag(m3.class);

    /* renamed from: v  reason: collision with root package name */
    public final androidx.lifecycle.m0 f18808v = kotlin.jvm.internal.b0.j(this, kotlin.jvm.internal.y.a(fm.a.class), new c(this), new d(this), new e(this));

    /* compiled from: ScreenResult5FragmentNew.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.l<hs.f<? extends Boolean, ? extends FirestoreGoal>, hs.k> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ fm.a f18813v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ String f18814w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(fm.a aVar, String str) {
            super(1);
            this.f18813v = aVar;
            this.f18814w = str;
        }

        @Override // ss.l
        public final hs.k invoke(hs.f<? extends Boolean, ? extends FirestoreGoal> fVar) {
            hs.f<? extends Boolean, ? extends FirestoreGoal> fVar2 = fVar;
            if (fVar2 != null) {
                m3 m3Var = m3.this;
                TemplateActivity templateActivity = m3Var.f18809w;
                String str = null;
                if (templateActivity != null) {
                    boolean z10 = templateActivity.J;
                    boolean z11 = false;
                    String str2 = this.f18814w;
                    B b10 = fVar2.f19465v;
                    if (!z10 && !templateActivity.I) {
                        if (b10 != 0) {
                            z11 = true;
                        }
                        Object obj = templateActivity.F.get("list");
                        kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                        m3.J(m3Var, str2, z11, (ArrayList) obj);
                    } else {
                        FirestoreGoal firestoreGoal = (FirestoreGoal) b10;
                        if (firestoreGoal != null) {
                            str = firestoreGoal.getDataTypeKey();
                        }
                        if (kotlin.jvm.internal.i.b(str, "result_5")) {
                            this.f18813v.n(str2);
                            m3Var.f18810x = true;
                        } else {
                            if (b10 != 0) {
                                z11 = true;
                            }
                            m3.J(m3Var, str2, z11, new ArrayList());
                        }
                    }
                } else {
                    kotlin.jvm.internal.i.q("act");
                    throw null;
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: ScreenResult5FragmentNew.kt */
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.l<List<? extends HashMap<String, Object>>, hs.k> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ String f18816v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(1);
            this.f18816v = str;
        }

        @Override // ss.l
        public final hs.k invoke(List<? extends HashMap<String, Object>> list) {
            String str;
            List<? extends HashMap<String, Object>> list2 = list;
            if (list2 != null) {
                m3 m3Var = m3.this;
                if (m3Var.f18810x) {
                    m3Var.f18810x = false;
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
                    m3.J(m3Var, this.f18816v, true, arrayList);
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class c extends kotlin.jvm.internal.k implements ss.a<androidx.lifecycle.q0> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f18817u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f18817u = fragment;
        }

        @Override // ss.a
        public final androidx.lifecycle.q0 invoke() {
            return defpackage.e.m(this.f18817u, "requireActivity().viewModelStore");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class d extends kotlin.jvm.internal.k implements ss.a<k1.a> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f18818u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f18818u = fragment;
        }

        @Override // ss.a
        public final k1.a invoke() {
            return defpackage.b.r(this.f18818u, "requireActivity().defaultViewModelCreationExtras");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class e extends kotlin.jvm.internal.k implements ss.a<o0.b> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f18819u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f18819u = fragment;
        }

        @Override // ss.a
        public final o0.b invoke() {
            return pl.a.e(this.f18819u, "requireActivity().defaultViewModelProviderFactory");
        }
    }

    public static final void J(m3 m3Var, String str, boolean z10, ArrayList arrayList) {
        TemplateActivity templateActivity = m3Var.f18809w;
        if (templateActivity != null) {
            if (templateActivity.J || templateActivity.I) {
                templateActivity.F.put("list", arrayList);
            }
            View inflate = m3Var.getLayoutInflater().inflate(R.layout.row_textview, (LinearLayout) m3Var._$_findCachedViewById(R.id.linearlayout));
            kotlin.jvm.internal.i.e(inflate, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.RobertoTextView");
            RobertoTextView robertoTextView = (RobertoTextView) inflate;
            robertoTextView.setText("The strength you have selected is\n" + ((String) arrayList.get(0)));
            ((LinearLayout) m3Var._$_findCachedViewById(R.id.linearlayout)).addView(robertoTextView);
            ((Button) m3Var._$_findCachedViewById(R.id.button6)).setOnClickListener(new z0(m3Var, 10));
            ((Button) m3Var._$_findCachedViewById(R.id.button7)).setOnClickListener(new zk.k(z10, (rr.b) m3Var, (List) arrayList, str, 14));
            return;
        }
        kotlin.jvm.internal.i.q("act");
        throw null;
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f18811y;
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
        return inflater.inflate(R.layout.fragment_screen_result_5, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        fm.a aVar = (fm.a) this.f18808v.getValue();
        aVar.f15174h0.k(getViewLifecycleOwner());
        aVar.f15177k0.k(getViewLifecycleOwner());
        aVar.f15178l0.k(getViewLifecycleOwner());
        aVar.f15180n0.k(getViewLifecycleOwner());
        aVar.f15181o0.k(getViewLifecycleOwner());
        aVar.f15182p0.k(getViewLifecycleOwner());
        aVar.w();
        super.onDestroyView();
        this.f18811y.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String label;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            TemplateActivity templateActivity = (TemplateActivity) activity;
            this.f18809w = templateActivity;
            TemplateModel templateModel = templateActivity.f10547y;
            if (templateModel != null && (label = templateModel.getLabel()) != null) {
                fm.a aVar = (fm.a) this.f18808v.getValue();
                aVar.f15178l0.e(getViewLifecycleOwner(), new a2(24, new a(aVar, label)));
                aVar.f15180n0.e(getViewLifecycleOwner(), new a2(25, new b(label)));
                aVar.m(label, "result_5");
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f18807u, "exception in on view created", e10);
        }
    }
}
