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
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: ScreenResult18FragmentNew.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhr/a1;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class a1 extends rr.b {

    /* renamed from: z  reason: collision with root package name */
    public static final /* synthetic */ int f18121z = 0;

    /* renamed from: w  reason: collision with root package name */
    public TemplateActivity f18124w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f18125x;

    /* renamed from: y  reason: collision with root package name */
    public final LinkedHashMap f18126y = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f18122u = LogHelper.INSTANCE.makeLogTag(a1.class);

    /* renamed from: v  reason: collision with root package name */
    public final androidx.lifecycle.m0 f18123v = kotlin.jvm.internal.b0.j(this, kotlin.jvm.internal.y.a(fm.a.class), new c(this), new d(this), new e(this));

    /* compiled from: ScreenResult18FragmentNew.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.l<hs.f<? extends Boolean, ? extends FirestoreGoal>, hs.k> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ fm.a f18128v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ String f18129w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.x<ArrayList<String>> f18130x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(fm.a aVar, String str, kotlin.jvm.internal.x xVar) {
            super(1);
            this.f18128v = aVar;
            this.f18129w = str;
            this.f18130x = xVar;
        }

        /* JADX WARN: Type inference failed for: r1v5, types: [T, java.util.ArrayList] */
        @Override // ss.l
        public final hs.k invoke(hs.f<? extends Boolean, ? extends FirestoreGoal> fVar) {
            hs.f<? extends Boolean, ? extends FirestoreGoal> fVar2 = fVar;
            if (fVar2 != null) {
                a1 a1Var = a1.this;
                TemplateActivity templateActivity = a1Var.f18124w;
                String str = null;
                if (templateActivity != null) {
                    boolean z10 = templateActivity.J;
                    boolean z11 = false;
                    String str2 = this.f18129w;
                    B b10 = fVar2.f19465v;
                    if (z10 || templateActivity.I) {
                        FirestoreGoal firestoreGoal = (FirestoreGoal) b10;
                        if (firestoreGoal != null) {
                            str = firestoreGoal.getDataTypeKey();
                        }
                        if (kotlin.jvm.internal.i.b(str, "list_result_18")) {
                            a1Var.f18125x = true;
                            this.f18128v.o(str2, false);
                        }
                    }
                    ?? arrayList = new ArrayList();
                    this.f18130x.f23469u = arrayList;
                    if (b10 != 0) {
                        z11 = true;
                    }
                    a1.J(a1Var, str2, z11, arrayList);
                } else {
                    kotlin.jvm.internal.i.q("act");
                    throw null;
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: ScreenResult18FragmentNew.kt */
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.l<hs.f<? extends Boolean, ? extends HashMap<String, Object>>, hs.k> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.x<ArrayList<String>> f18132v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ String f18133w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(kotlin.jvm.internal.x<ArrayList<String>> xVar, String str) {
            super(1);
            this.f18132v = xVar;
            this.f18133w = str;
        }

        /* JADX WARN: Type inference failed for: r9v9, types: [T, java.util.ArrayList] */
        @Override // ss.l
        public final hs.k invoke(hs.f<? extends Boolean, ? extends HashMap<String, Object>> fVar) {
            boolean z10;
            boolean z11;
            String str;
            String str2;
            String str3;
            Set keySet;
            hs.f<? extends Boolean, ? extends HashMap<String, Object>> fVar2 = fVar;
            if (fVar2 != null && ((Boolean) fVar2.f19464u).booleanValue()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                a1 a1Var = a1.this;
                if (a1Var.f18125x) {
                    a1Var.f18125x = false;
                    HashMap hashMap = (HashMap) fVar2.f19465v;
                    if (hashMap != null && (keySet = hashMap.keySet()) != null && (!keySet.isEmpty())) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    kotlin.jvm.internal.x<ArrayList<String>> xVar = this.f18132v;
                    if (z11) {
                        String[] strArr = new String[4];
                        B b10 = fVar2.f19465v;
                        kotlin.jvm.internal.i.d(b10);
                        HashMap hashMap2 = (HashMap) b10;
                        Object obj = hashMap2.get("text1");
                        String str4 = null;
                        if (obj instanceof String) {
                            str = (String) obj;
                        } else {
                            str = null;
                        }
                        String str5 = "";
                        if (str == null) {
                            str = "";
                        }
                        strArr[0] = str;
                        Object obj2 = hashMap2.get("text2");
                        if (obj2 instanceof String) {
                            str2 = (String) obj2;
                        } else {
                            str2 = null;
                        }
                        if (str2 == null) {
                            str2 = "";
                        }
                        strArr[1] = str2;
                        Object obj3 = hashMap2.get("text3");
                        if (obj3 instanceof String) {
                            str3 = (String) obj3;
                        } else {
                            str3 = null;
                        }
                        if (str3 == null) {
                            str3 = "";
                        }
                        strArr[2] = str3;
                        Object obj4 = hashMap2.get("text4");
                        if (obj4 instanceof String) {
                            str4 = (String) obj4;
                        }
                        if (str4 != null) {
                            str5 = str4;
                        }
                        strArr[3] = str5;
                        xVar.f23469u = ca.a.k(strArr);
                    }
                    a1.J(a1Var, this.f18133w, true, xVar.f23469u);
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class c extends kotlin.jvm.internal.k implements ss.a<androidx.lifecycle.q0> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f18134u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f18134u = fragment;
        }

        @Override // ss.a
        public final androidx.lifecycle.q0 invoke() {
            return defpackage.e.m(this.f18134u, "requireActivity().viewModelStore");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class d extends kotlin.jvm.internal.k implements ss.a<k1.a> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f18135u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f18135u = fragment;
        }

        @Override // ss.a
        public final k1.a invoke() {
            return defpackage.b.r(this.f18135u, "requireActivity().defaultViewModelCreationExtras");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class e extends kotlin.jvm.internal.k implements ss.a<o0.b> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f18136u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f18136u = fragment;
        }

        @Override // ss.a
        public final o0.b invoke() {
            return pl.a.e(this.f18136u, "requireActivity().defaultViewModelProviderFactory");
        }
    }

    public static final void J(a1 a1Var, String str, boolean z10, ArrayList arrayList) {
        TemplateActivity templateActivity = a1Var.f18124w;
        if (templateActivity != null) {
            if (templateActivity.J || templateActivity.I) {
                templateActivity.F.put("list", arrayList);
            }
            ((TextView) a1Var._$_findCachedViewById(R.id.result1)).setText((CharSequence) arrayList.get(0));
            ((TextView) a1Var._$_findCachedViewById(R.id.result2)).setText((CharSequence) arrayList.get(1));
            ((TextView) a1Var._$_findCachedViewById(R.id.result3)).setText((CharSequence) arrayList.get(2));
            ((TextView) a1Var._$_findCachedViewById(R.id.result4)).setText((CharSequence) arrayList.get(3));
            ((Button) a1Var._$_findCachedViewById(R.id.button1)).setOnClickListener(new z0(a1Var, 0));
            ((Button) a1Var._$_findCachedViewById(R.id.button2)).setOnClickListener(new zk.k(z10, (rr.b) a1Var, (List) arrayList, str, 8));
            return;
        }
        kotlin.jvm.internal.i.q("act");
        throw null;
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f18126y;
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
        return inflater.inflate(R.layout.fragment_screen_result_18, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        fm.a aVar = (fm.a) this.f18123v.getValue();
        aVar.f15174h0.k(getViewLifecycleOwner());
        aVar.f15177k0.k(getViewLifecycleOwner());
        aVar.f15178l0.k(getViewLifecycleOwner());
        aVar.f15180n0.k(getViewLifecycleOwner());
        aVar.f15181o0.k(getViewLifecycleOwner());
        aVar.f15182p0.k(getViewLifecycleOwner());
        aVar.w();
        super.onDestroyView();
        this.f18126y.clear();
    }

    /* JADX WARN: Type inference failed for: r8v6, types: [T, java.util.ArrayList] */
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String label;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            this.f18124w = (TemplateActivity) activity;
            kotlin.jvm.internal.x xVar = new kotlin.jvm.internal.x();
            TemplateActivity templateActivity = this.f18124w;
            if (templateActivity != null) {
                Object obj = templateActivity.F.get("list");
                kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                xVar.f23469u = (ArrayList) obj;
                TemplateActivity templateActivity2 = this.f18124w;
                if (templateActivity2 != null) {
                    TemplateModel templateModel = templateActivity2.f10547y;
                    if (templateModel != null && (label = templateModel.getLabel()) != null) {
                        fm.a aVar = (fm.a) this.f18123v.getValue();
                        aVar.m(label, "list_result_18");
                        aVar.f15178l0.e(getViewLifecycleOwner(), new m0(10, new a(aVar, label, xVar)));
                        aVar.f15181o0.e(getViewLifecycleOwner(), new m0(11, new b(xVar, label)));
                        return;
                    }
                    return;
                }
                kotlin.jvm.internal.i.q("act");
                throw null;
            }
            kotlin.jvm.internal.i.q("act");
            throw null;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f18122u, "Exception in view created", e10);
        }
    }
}
