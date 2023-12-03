package hr;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.o0;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.components.goals.model.FirestoreGoal;
import com.theinnerhour.b2b.model.ScreenResult3Model;
import com.theinnerhour.b2b.model.TemplateModel;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UtilFunKt;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: ScreenResult3FragmentNew.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhr/a3;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class a3 extends rr.b {

    /* renamed from: z  reason: collision with root package name */
    public static final /* synthetic */ int f18139z = 0;

    /* renamed from: w  reason: collision with root package name */
    public TemplateActivity f18142w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f18143x;

    /* renamed from: y  reason: collision with root package name */
    public final LinkedHashMap f18144y = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f18140u = LogHelper.INSTANCE.makeLogTag(a3.class);

    /* renamed from: v  reason: collision with root package name */
    public final androidx.lifecycle.m0 f18141v = kotlin.jvm.internal.b0.j(this, kotlin.jvm.internal.y.a(fm.a.class), new c(this), new d(this), new e(this));

    /* compiled from: ScreenResult3FragmentNew.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.l<hs.f<? extends Boolean, ? extends FirestoreGoal>, hs.k> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ fm.a f18146v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ String f18147w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(fm.a aVar, String str) {
            super(1);
            this.f18146v = aVar;
            this.f18147w = str;
        }

        @Override // ss.l
        public final hs.k invoke(hs.f<? extends Boolean, ? extends FirestoreGoal> fVar) {
            FirestoreGoal firestoreGoal;
            hs.f<? extends Boolean, ? extends FirestoreGoal> fVar2 = fVar;
            String str = null;
            if (fVar2 != null) {
                firestoreGoal = (FirestoreGoal) fVar2.f19465v;
            } else {
                firestoreGoal = null;
            }
            String str2 = this.f18147w;
            a3 a3Var = a3.this;
            if (firestoreGoal != null) {
                TemplateActivity templateActivity = a3Var.f18142w;
                if (templateActivity != null) {
                    if (templateActivity.J || templateActivity.I) {
                        FirestoreGoal firestoreGoal2 = (FirestoreGoal) fVar2.f19465v;
                        if (firestoreGoal2 != null) {
                            str = firestoreGoal2.getDataTypeKey();
                        }
                        if (kotlin.jvm.internal.i.b(str, "result_3")) {
                            a3Var.f18143x = true;
                            this.f18146v.o(str2, false);
                        }
                    }
                    a3.J(a3Var, str2, new ScreenResult3Model(Utils.INSTANCE.getTimeInSeconds()), true);
                } else {
                    kotlin.jvm.internal.i.q("act");
                    throw null;
                }
            } else {
                a3.J(a3Var, str2, new ScreenResult3Model(Utils.INSTANCE.getTimeInSeconds()), false);
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: ScreenResult3FragmentNew.kt */
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.l<hs.f<? extends Boolean, ? extends HashMap<String, Object>>, hs.k> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ String f18149v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(1);
            this.f18149v = str;
        }

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
                a3 a3Var = a3.this;
                if (a3Var.f18143x) {
                    a3Var.f18143x = false;
                    ScreenResult3Model screenResult3Model = (ScreenResult3Model) is.u.i2(UtilFunKt.result3ListMapToObject(ca.a.k((HashMap) fVar2.f19465v)));
                    if (screenResult3Model != null) {
                        a3.J(a3Var, this.f18149v, screenResult3Model, true);
                    }
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class c extends kotlin.jvm.internal.k implements ss.a<androidx.lifecycle.q0> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f18150u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f18150u = fragment;
        }

        @Override // ss.a
        public final androidx.lifecycle.q0 invoke() {
            return defpackage.e.m(this.f18150u, "requireActivity().viewModelStore");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class d extends kotlin.jvm.internal.k implements ss.a<k1.a> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f18151u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f18151u = fragment;
        }

        @Override // ss.a
        public final k1.a invoke() {
            return defpackage.b.r(this.f18151u, "requireActivity().defaultViewModelCreationExtras");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class e extends kotlin.jvm.internal.k implements ss.a<o0.b> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f18152u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f18152u = fragment;
        }

        @Override // ss.a
        public final o0.b invoke() {
            return pl.a.e(this.f18152u, "requireActivity().defaultViewModelProviderFactory");
        }
    }

    public static final void J(a3 a3Var, String str, ScreenResult3Model screenResult3Model, boolean z10) {
        a3Var.getClass();
        kotlin.jvm.internal.u uVar = new kotlin.jvm.internal.u();
        TemplateActivity templateActivity = a3Var.f18142w;
        if (templateActivity != null) {
            boolean z11 = templateActivity.J;
            HashMap<String, Object> hashMap = templateActivity.F;
            if (!z11 && !templateActivity.I) {
                uVar.f23466u = true;
                Object obj = hashMap.get("list");
                kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                screenResult3Model.setList((ArrayList) obj);
            } else {
                hashMap.put("list", screenResult3Model.getList());
                TemplateActivity templateActivity2 = a3Var.f18142w;
                if (templateActivity2 != null) {
                    templateActivity2.F.put("result_3_initial_val", screenResult3Model.getList());
                    if (!screenResult3Model.getList().isEmpty()) {
                        TemplateActivity templateActivity3 = a3Var.f18142w;
                        if (templateActivity3 != null) {
                            HashMap<String, Object> hashMap2 = templateActivity3.F;
                            String str2 = screenResult3Model.getList().get(0);
                            kotlin.jvm.internal.i.f(str2, "model.list[0]");
                            hashMap2.put("s5_user_data", str2);
                        } else {
                            kotlin.jvm.internal.i.q("act");
                            throw null;
                        }
                    }
                    String str3 = screenResult3Model.getList().get(0);
                    kotlin.jvm.internal.i.f(str3, "model.list[0]");
                    if (!gv.n.B0(str3)) {
                        TemplateActivity templateActivity4 = a3Var.f18142w;
                        if (templateActivity4 != null) {
                            HashMap<String, Object> hashMap3 = templateActivity4.F;
                            String str4 = screenResult3Model.getList().get(0);
                            kotlin.jvm.internal.i.f(str4, "model.list[0]");
                            hashMap3.put("s6_user_data", str4);
                        } else {
                            kotlin.jvm.internal.i.q("act");
                            throw null;
                        }
                    }
                    String str5 = screenResult3Model.getList().get(0);
                    kotlin.jvm.internal.i.f(str5, "model.list[0]");
                    if (!gv.n.B0(str5)) {
                        TemplateActivity templateActivity5 = a3Var.f18142w;
                        if (templateActivity5 != null) {
                            templateActivity5.F.put("s12_user_list", ca.a.w0(screenResult3Model.getList().get(0)));
                        } else {
                            kotlin.jvm.internal.i.q("act");
                            throw null;
                        }
                    }
                } else {
                    kotlin.jvm.internal.i.q("act");
                    throw null;
                }
            }
            ((LinearLayout) a3Var._$_findCachedViewById(R.id.ll_list)).removeAllViews();
            TemplateActivity templateActivity6 = a3Var.f18142w;
            if (templateActivity6 != null) {
                if (kotlin.jvm.internal.i.b(templateActivity6.B0(), "s142")) {
                    View inflate = a3Var.requireActivity().getLayoutInflater().inflate(R.layout.row_result3, (ViewGroup) ((LinearLayout) a3Var._$_findCachedViewById(R.id.ll_list)), false);
                    ((RobertoTextView) inflate.findViewById(R.id.textView)).setText(screenResult3Model.getList().get(2));
                    ((LinearLayout) a3Var._$_findCachedViewById(R.id.ll_list)).addView(inflate);
                } else {
                    Iterator<String> it = screenResult3Model.getList().iterator();
                    while (it.hasNext()) {
                        View inflate2 = a3Var.requireActivity().getLayoutInflater().inflate(R.layout.row_result3, (ViewGroup) ((LinearLayout) a3Var._$_findCachedViewById(R.id.ll_list)), false);
                        ((RobertoTextView) inflate2.findViewById(R.id.textView)).setText(it.next());
                        ((LinearLayout) a3Var._$_findCachedViewById(R.id.ll_list)).addView(inflate2);
                    }
                }
                ((RobertoButton) a3Var._$_findCachedViewById(R.id.button1)).setOnClickListener(new z2(a3Var, 1));
                ((RobertoButton) a3Var._$_findCachedViewById(R.id.button)).setOnClickListener(new g0(z10, uVar, a3Var, str, screenResult3Model, 5));
                return;
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
            if (r1.b0.c((TemplateActivity) activity2, "source", "goals")) {
                androidx.fragment.app.p activity3 = getActivity();
                kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                if (!((TemplateActivity) activity3).R) {
                    androidx.fragment.app.p activity4 = getActivity();
                    kotlin.jvm.internal.i.e(activity4, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                    ((TemplateActivity) activity4).o0();
                    return false;
                }
            }
        }
        androidx.fragment.app.p activity5 = getActivity();
        kotlin.jvm.internal.i.e(activity5, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
        ((TemplateActivity) activity5).R = false;
        return true;
    }

    public final fm.a K() {
        return (fm.a) this.f18141v.getValue();
    }

    public final void M() {
        TemplateActivity templateActivity = this.f18142w;
        if (templateActivity != null) {
            templateActivity.K0(false);
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            if (((TemplateActivity) activity).getIntent().hasExtra("source")) {
                TemplateActivity templateActivity2 = this.f18142w;
                if (templateActivity2 != null) {
                    if (r1.b0.c(templateActivity2, "source", "goals")) {
                        androidx.fragment.app.p activity2 = getActivity();
                        kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                        ((TemplateActivity) activity2).n0();
                        return;
                    }
                } else {
                    kotlin.jvm.internal.i.q("act");
                    throw null;
                }
            }
            TemplateActivity templateActivity3 = this.f18142w;
            if (templateActivity3 != null) {
                templateActivity3.t0();
                return;
            } else {
                kotlin.jvm.internal.i.q("act");
                throw null;
            }
        }
        kotlin.jvm.internal.i.q("act");
        throw null;
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f18144y;
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
        return inflater.inflate(R.layout.fragment_screen_result_3, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        fm.a K = K();
        K.f15174h0.k(getViewLifecycleOwner());
        K.f15177k0.k(getViewLifecycleOwner());
        K.f15178l0.k(getViewLifecycleOwner());
        K.f15180n0.k(getViewLifecycleOwner());
        K.f15181o0.k(getViewLifecycleOwner());
        K.f15182p0.k(getViewLifecycleOwner());
        K.w();
        super.onDestroyView();
        this.f18144y.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00cf A[Catch: Exception -> 0x0129, TryCatch #0 {Exception -> 0x0129, blocks: (B:3:0x000a, B:7:0x002e, B:9:0x0099, B:11:0x00a3, B:13:0x00a7, B:19:0x00c8, B:21:0x00cf, B:23:0x00d3, B:26:0x00da, B:28:0x011d, B:29:0x0120, B:16:0x00ba, B:17:0x00bd, B:18:0x00be, B:30:0x0121, B:31:0x0124, B:32:0x0125, B:33:0x0128), top: B:37:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x011d A[Catch: Exception -> 0x0129, TryCatch #0 {Exception -> 0x0129, blocks: (B:3:0x000a, B:7:0x002e, B:9:0x0099, B:11:0x00a3, B:13:0x00a7, B:19:0x00c8, B:21:0x00cf, B:23:0x00d3, B:26:0x00da, B:28:0x011d, B:29:0x0120, B:16:0x00ba, B:17:0x00bd, B:18:0x00be, B:30:0x0121, B:31:0x0124, B:32:0x0125, B:33:0x0128), top: B:37:0x000a }] */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onViewCreated(View view, Bundle bundle) {
        String paramsMapToString;
        TemplateActivity templateActivity;
        String label;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            this.f18142w = (TemplateActivity) activity;
            ((ImageView) _$_findCachedViewById(R.id.ivClose)).setImageResource(R.drawable.ic_wrong);
            TemplateActivity templateActivity2 = this.f18142w;
            if (templateActivity2 != null) {
                templateActivity2.Q = false;
                HashMap<String, Object> A0 = templateActivity2.A0();
                ((RobertoTextView) _$_findCachedViewById(R.id.text_1)).setText(UtilFunKt.paramsMapToString(A0.get("r3_title")));
                ((RobertoTextView) _$_findCachedViewById(R.id.text_2)).setText(UtilFunKt.paramsMapToString(A0.get("r3_heading")));
                ((RobertoTextView) _$_findCachedViewById(R.id.text_3)).setText(UtilFunKt.paramsMapToString(A0.get("r3_description")));
                ((RobertoButton) _$_findCachedViewById(R.id.button1)).setText(UtilFunKt.paramsMapToString(A0.get("r3_btn_one_text")));
                RobertoButton robertoButton = (RobertoButton) _$_findCachedViewById(R.id.button);
                TemplateActivity templateActivity3 = this.f18142w;
                if (templateActivity3 != null) {
                    if (templateActivity3.getIntent().hasExtra("source")) {
                        TemplateActivity templateActivity4 = this.f18142w;
                        if (templateActivity4 != null) {
                            if (kotlin.jvm.internal.i.b(templateActivity4.getIntent().getStringExtra("source"), "goals")) {
                                paramsMapToString = "DONE";
                                robertoButton.setText(paramsMapToString);
                                templateActivity = this.f18142w;
                                if (templateActivity == null) {
                                    TemplateModel templateModel = templateActivity.f10547y;
                                    if (templateModel != null && (label = templateModel.getLabel()) != null) {
                                        fm.a K = K();
                                        K.f15178l0.e(getViewLifecycleOwner(), new a2(14, new a(K, label)));
                                        K.f15181o0.e(getViewLifecycleOwner(), new a2(15, new b(label)));
                                        K.m(label, "result_3");
                                        ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new z2(this, 0));
                                        return;
                                    }
                                    return;
                                }
                                kotlin.jvm.internal.i.q("act");
                                throw null;
                            }
                        } else {
                            kotlin.jvm.internal.i.q("act");
                            throw null;
                        }
                    }
                    paramsMapToString = UtilFunKt.paramsMapToString(A0.get("r3_btn_two_text"));
                    robertoButton.setText(paramsMapToString);
                    templateActivity = this.f18142w;
                    if (templateActivity == null) {
                    }
                } else {
                    kotlin.jvm.internal.i.q("act");
                    throw null;
                }
            } else {
                kotlin.jvm.internal.i.q("act");
                throw null;
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f18140u, "exception on view created", e10);
        }
    }
}
