package hr;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.o0;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.components.goals.model.FirestoreGoal;
import com.theinnerhour.b2b.model.ScreenResult15Model;
import com.theinnerhour.b2b.model.TemplateModel;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UtilFunKt;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: ScreenResult15FragmentNew.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhr/n0;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class n0 extends rr.b {
    public static final /* synthetic */ int C = 0;

    /* renamed from: v  reason: collision with root package name */
    public int f18859v;

    /* renamed from: z  reason: collision with root package name */
    public TemplateActivity f18863z;
    public final LinkedHashMap B = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f18858u = LogHelper.INSTANCE.makeLogTag(n0.class);

    /* renamed from: w  reason: collision with root package name */
    public final String f18860w = "list_result_15";

    /* renamed from: x  reason: collision with root package name */
    public ArrayList<String> f18861x = new ArrayList<>();

    /* renamed from: y  reason: collision with root package name */
    public ArrayList<String> f18862y = new ArrayList<>();
    public final androidx.lifecycle.m0 A = kotlin.jvm.internal.b0.j(this, kotlin.jvm.internal.y.a(fm.a.class), new c(this), new d(this), new e(this));

    /* compiled from: ScreenResult15FragmentNew.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.l<hs.f<? extends Boolean, ? extends FirestoreGoal>, hs.k> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ fm.a f18865v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ String f18866w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.x<ScreenResult15Model> f18867x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(fm.a aVar, String str, kotlin.jvm.internal.x<ScreenResult15Model> xVar) {
            super(1);
            this.f18865v = aVar;
            this.f18866w = str;
            this.f18867x = xVar;
        }

        @Override // ss.l
        public final hs.k invoke(hs.f<? extends Boolean, ? extends FirestoreGoal> fVar) {
            hs.f<? extends Boolean, ? extends FirestoreGoal> fVar2 = fVar;
            if (fVar2 != null) {
                n0 n0Var = n0.this;
                TemplateActivity templateActivity = n0Var.f18863z;
                String str = null;
                if (templateActivity != null) {
                    boolean z10 = templateActivity.J;
                    boolean z11 = true;
                    String str2 = this.f18866w;
                    B b10 = fVar2.f19465v;
                    if (z10 || templateActivity.I) {
                        FirestoreGoal firestoreGoal = (FirestoreGoal) b10;
                        if (firestoreGoal != null) {
                            str = firestoreGoal.getDataTypeKey();
                        }
                        if (kotlin.jvm.internal.i.b(str, n0Var.f18860w)) {
                            this.f18865v.o(str2, true);
                        }
                    }
                    if (b10 == 0) {
                        z11 = false;
                    }
                    n0.J(n0Var, str2, z11, this.f18867x.f23469u);
                } else {
                    kotlin.jvm.internal.i.q("act");
                    throw null;
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: ScreenResult15FragmentNew.kt */
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.l<hs.f<? extends Boolean, ? extends HashMap<String, Object>>, hs.k> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.x<ScreenResult15Model> f18868u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ n0 f18869v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ String f18870w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(kotlin.jvm.internal.x<ScreenResult15Model> xVar, n0 n0Var, String str) {
            super(1);
            this.f18868u = xVar;
            this.f18869v = n0Var;
            this.f18870w = str;
        }

        /* JADX WARN: Type inference failed for: r4v4, types: [com.theinnerhour.b2b.model.ScreenResult15Model, T] */
        @Override // ss.l
        public final hs.k invoke(hs.f<? extends Boolean, ? extends HashMap<String, Object>> fVar) {
            boolean z10;
            hs.f<? extends Boolean, ? extends HashMap<String, Object>> fVar2 = fVar;
            if (fVar2 != null && ((Boolean) fVar2.f19464u).booleanValue()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                ?? result15MapToObject = UtilFunKt.result15MapToObject(fVar2.f19465v);
                this.f18868u.f23469u = result15MapToObject;
                n0.J(this.f18869v, this.f18870w, true, result15MapToObject);
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class c extends kotlin.jvm.internal.k implements ss.a<androidx.lifecycle.q0> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f18871u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f18871u = fragment;
        }

        @Override // ss.a
        public final androidx.lifecycle.q0 invoke() {
            return defpackage.e.m(this.f18871u, "requireActivity().viewModelStore");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class d extends kotlin.jvm.internal.k implements ss.a<k1.a> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f18872u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f18872u = fragment;
        }

        @Override // ss.a
        public final k1.a invoke() {
            return defpackage.b.r(this.f18872u, "requireActivity().defaultViewModelCreationExtras");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class e extends kotlin.jvm.internal.k implements ss.a<o0.b> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f18873u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f18873u = fragment;
        }

        @Override // ss.a
        public final o0.b invoke() {
            return pl.a.e(this.f18873u, "requireActivity().defaultViewModelProviderFactory");
        }
    }

    public static final void J(n0 n0Var, String str, boolean z10, ScreenResult15Model screenResult15Model) {
        n0Var.getClass();
        kotlin.jvm.internal.u uVar = new kotlin.jvm.internal.u();
        TemplateActivity templateActivity = n0Var.f18863z;
        if (templateActivity != null) {
            boolean z11 = templateActivity.J;
            HashMap<String, Object> hashMap = templateActivity.F;
            if (!z11 && !templateActivity.I) {
                uVar.f23466u = true;
                Object obj = hashMap.get("list");
                kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                ArrayList<String> arrayList = (ArrayList) obj;
                n0Var.f18861x = arrayList;
                screenResult15Model.setList(arrayList);
            } else if (z10) {
                hashMap.put("list", screenResult15Model.getList());
                TemplateActivity templateActivity2 = n0Var.f18863z;
                if (templateActivity2 != null) {
                    Object obj2 = templateActivity2.F.get("list");
                    kotlin.jvm.internal.i.e(obj2, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                    n0Var.f18861x = (ArrayList) obj2;
                } else {
                    kotlin.jvm.internal.i.q("act");
                    throw null;
                }
            } else {
                Object obj3 = hashMap.get("list");
                kotlin.jvm.internal.i.e(obj3, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                n0Var.f18861x = (ArrayList) obj3;
            }
            TemplateActivity templateActivity3 = n0Var.f18863z;
            if (templateActivity3 != null) {
                templateActivity3.Q = false;
                HashMap<String, Object> A0 = templateActivity3.A0();
                n0Var.f18862y = UtilFunKt.paramsMapToList(A0.get("r15_heading_list"));
                TemplateActivity templateActivity4 = n0Var.f18863z;
                if (templateActivity4 != null) {
                    if (templateActivity4.getIntent().hasExtra("source")) {
                        TemplateActivity templateActivity5 = n0Var.f18863z;
                        if (templateActivity5 != null) {
                            if (r1.b0.c(templateActivity5, "source", "goals")) {
                                if (n0Var.f18861x.size() == 1) {
                                    ((RobertoButton) n0Var._$_findCachedViewById(R.id.btnR15Button)).setText("DONE");
                                } else {
                                    ((RobertoButton) n0Var._$_findCachedViewById(R.id.btnR15Button)).setText("NEXT");
                                }
                                n0Var.K();
                                ((ImageView) n0Var._$_findCachedViewById(R.id.ivClose)).setOnClickListener(new qq.n(n0Var, 26));
                                ((ImageView) n0Var._$_findCachedViewById(R.id.ivEllipses)).setVisibility(8);
                                ((RobertoButton) n0Var._$_findCachedViewById(R.id.btnR15Button)).setOnClickListener(new g0(n0Var, z10, uVar, str, screenResult15Model));
                                return;
                            }
                        } else {
                            kotlin.jvm.internal.i.q("act");
                            throw null;
                        }
                    }
                    ((RobertoButton) n0Var._$_findCachedViewById(R.id.btnR15Button)).setText(UtilFunKt.paramsMapToString(A0.get("r15_btn_text")));
                    n0Var.K();
                    ((ImageView) n0Var._$_findCachedViewById(R.id.ivClose)).setOnClickListener(new qq.n(n0Var, 26));
                    ((ImageView) n0Var._$_findCachedViewById(R.id.ivEllipses)).setVisibility(8);
                    ((RobertoButton) n0Var._$_findCachedViewById(R.id.btnR15Button)).setOnClickListener(new g0(n0Var, z10, uVar, str, screenResult15Model));
                    return;
                }
                kotlin.jvm.internal.i.q("act");
                throw null;
            }
            kotlin.jvm.internal.i.q("act");
            throw null;
        }
        kotlin.jvm.internal.i.q("act");
        throw null;
    }

    @Override // rr.b
    public final boolean I() {
        androidx.fragment.app.p activity = getActivity();
        kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
        if (((TemplateActivity) activity).getIntent().hasExtra("source")) {
            androidx.fragment.app.p activity2 = getActivity();
            kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            if (r1.b0.c((TemplateActivity) activity2, "source", "goals") && this.f18859v == 0) {
                androidx.fragment.app.p activity3 = getActivity();
                kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                ((TemplateActivity) activity3).o0();
                return false;
            }
        }
        int i6 = this.f18859v;
        if (i6 > 0) {
            this.f18859v = i6 - 1;
            K();
            return false;
        }
        return true;
    }

    public final void K() {
        String str;
        try {
            ((RobertoTextView) _$_findCachedViewById(R.id.tvR15Text)).setVisibility(4);
            ((RobertoTextView) _$_findCachedViewById(R.id.tvR15Header)).setVisibility(4);
            RobertoTextView robertoTextView = (RobertoTextView) _$_findCachedViewById(R.id.tvR15Text);
            String str2 = "";
            if (this.f18859v >= this.f18861x.size()) {
                str = "";
            } else {
                str = this.f18861x.get(this.f18859v);
            }
            robertoTextView.setText(str);
            RobertoTextView robertoTextView2 = (RobertoTextView) _$_findCachedViewById(R.id.tvR15Header);
            if (this.f18859v < this.f18862y.size()) {
                str2 = this.f18862y.get(this.f18859v);
            }
            robertoTextView2.setText(str2);
            boolean z10 = false;
            ((RobertoTextView) _$_findCachedViewById(R.id.tvR15Text)).setVisibility(0);
            ((RobertoTextView) _$_findCachedViewById(R.id.tvR15Header)).setVisibility(0);
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            Intent intent = ((TemplateActivity) activity).getIntent();
            if (intent != null && intent.hasExtra("source")) {
                z10 = true;
            }
            if (z10) {
                androidx.fragment.app.p activity2 = getActivity();
                kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                if (kotlin.jvm.internal.i.b(((TemplateActivity) activity2).getIntent().getStringExtra("source"), "goals")) {
                    if (this.f18859v + 1 < this.f18861x.size()) {
                        ((RobertoButton) _$_findCachedViewById(R.id.btnR15Button)).setText("NEXT");
                    } else {
                        ((RobertoButton) _$_findCachedViewById(R.id.btnR15Button)).setText("DONE");
                    }
                    if (this.f18859v == 0) {
                        ((ImageView) _$_findCachedViewById(R.id.ivClose)).setImageResource(R.drawable.ic_wrong);
                    } else {
                        ((ImageView) _$_findCachedViewById(R.id.ivClose)).setImageResource(R.drawable.ic_arrow_back);
                    }
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f18858u, "exception", e10);
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
        return inflater.inflate(R.layout.fragment_screen_result_15, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        fm.a aVar = (fm.a) this.A.getValue();
        aVar.f15174h0.k(getViewLifecycleOwner());
        aVar.f15177k0.k(getViewLifecycleOwner());
        aVar.f15178l0.k(getViewLifecycleOwner());
        aVar.f15180n0.k(getViewLifecycleOwner());
        aVar.f15181o0.k(getViewLifecycleOwner());
        aVar.f15182p0.k(getViewLifecycleOwner());
        aVar.w();
        super.onDestroyView();
        this.B.clear();
    }

    /* JADX WARN: Type inference failed for: r8v3, types: [com.theinnerhour.b2b.model.ScreenResult15Model, T] */
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String label;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            this.f18863z = (TemplateActivity) activity;
            kotlin.jvm.internal.x xVar = new kotlin.jvm.internal.x();
            xVar.f23469u = new ScreenResult15Model(new ArrayList());
            TemplateActivity templateActivity = this.f18863z;
            if (templateActivity != null) {
                if (templateActivity.getIntent().hasExtra("source")) {
                    TemplateActivity templateActivity2 = this.f18863z;
                    if (templateActivity2 != null) {
                        if (kotlin.jvm.internal.i.b(templateActivity2.getIntent().getStringExtra("source"), "goals")) {
                            ((ImageView) _$_findCachedViewById(R.id.ivClose)).setImageResource(R.drawable.ic_wrong);
                        }
                    } else {
                        kotlin.jvm.internal.i.q("act");
                        throw null;
                    }
                }
                TemplateActivity templateActivity3 = this.f18863z;
                if (templateActivity3 != null) {
                    TemplateModel templateModel = templateActivity3.f10547y;
                    if (templateModel != null && (label = templateModel.getLabel()) != null) {
                        fm.a aVar = (fm.a) this.A.getValue();
                        aVar.f15178l0.e(getViewLifecycleOwner(), new m0(0, new a(aVar, label, xVar)));
                        aVar.f15181o0.e(getViewLifecycleOwner(), new m0(1, new b(xVar, this, label)));
                        aVar.m(label, this.f18860w);
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
            LogHelper.INSTANCE.e(this.f18858u, "exception in on view created", e10);
        }
    }
}
