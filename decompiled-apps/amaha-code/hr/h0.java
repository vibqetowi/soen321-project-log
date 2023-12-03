package hr;

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
import com.theinnerhour.b2b.model.ScreenResult13Model;
import com.theinnerhour.b2b.model.TemplateModel;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UtilFunKt;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: ScreenResult13FragmentNew.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhr/h0;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class h0 extends rr.b {

    /* renamed from: y  reason: collision with root package name */
    public static final /* synthetic */ int f18483y = 0;

    /* renamed from: w  reason: collision with root package name */
    public TemplateActivity f18486w;

    /* renamed from: x  reason: collision with root package name */
    public final LinkedHashMap f18487x = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f18484u = LogHelper.INSTANCE.makeLogTag(h0.class);

    /* renamed from: v  reason: collision with root package name */
    public final androidx.lifecycle.m0 f18485v = kotlin.jvm.internal.b0.j(this, kotlin.jvm.internal.y.a(fm.a.class), new c(this), new d(this), new e(this));

    /* compiled from: ScreenResult13FragmentNew.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.l<hs.f<? extends Boolean, ? extends FirestoreGoal>, hs.k> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ fm.a f18489v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ String f18490w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ ScreenResult13Model f18491x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(fm.a aVar, String str, ScreenResult13Model screenResult13Model) {
            super(1);
            this.f18489v = aVar;
            this.f18490w = str;
            this.f18491x = screenResult13Model;
        }

        @Override // ss.l
        public final hs.k invoke(hs.f<? extends Boolean, ? extends FirestoreGoal> fVar) {
            hs.f<? extends Boolean, ? extends FirestoreGoal> fVar2 = fVar;
            if (fVar2 != null) {
                h0 h0Var = h0.this;
                TemplateActivity templateActivity = h0Var.f18486w;
                String str = null;
                if (templateActivity != null) {
                    boolean z10 = templateActivity.J;
                    boolean z11 = false;
                    ScreenResult13Model screenResult13Model = this.f18491x;
                    String str2 = this.f18490w;
                    B b10 = fVar2.f19465v;
                    if (!z10 && !templateActivity.I) {
                        if (b10 != 0) {
                            z11 = true;
                        }
                        h0.J(h0Var, str2, z11, screenResult13Model);
                    } else {
                        FirestoreGoal firestoreGoal = (FirestoreGoal) b10;
                        if (firestoreGoal != null) {
                            str = firestoreGoal.getDataTypeKey();
                        }
                        if (kotlin.jvm.internal.i.b(str, "result_13")) {
                            this.f18489v.o(str2, false);
                        } else {
                            h0.J(h0Var, str2, false, screenResult13Model);
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

    /* compiled from: ScreenResult13FragmentNew.kt */
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.l<hs.f<? extends Boolean, ? extends HashMap<String, Object>>, hs.k> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ String f18493v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(1);
            this.f18493v = str;
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
                h0.J(h0.this, this.f18493v, true, UtilFunKt.result13MapToObject(fVar2.f19465v));
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class c extends kotlin.jvm.internal.k implements ss.a<androidx.lifecycle.q0> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f18494u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f18494u = fragment;
        }

        @Override // ss.a
        public final androidx.lifecycle.q0 invoke() {
            return defpackage.e.m(this.f18494u, "requireActivity().viewModelStore");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class d extends kotlin.jvm.internal.k implements ss.a<k1.a> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f18495u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f18495u = fragment;
        }

        @Override // ss.a
        public final k1.a invoke() {
            return defpackage.b.r(this.f18495u, "requireActivity().defaultViewModelCreationExtras");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class e extends kotlin.jvm.internal.k implements ss.a<o0.b> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f18496u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f18496u = fragment;
        }

        @Override // ss.a
        public final o0.b invoke() {
            return pl.a.e(this.f18496u, "requireActivity().defaultViewModelProviderFactory");
        }
    }

    public static final void J(h0 h0Var, String str, boolean z10, ScreenResult13Model screenResult13Model) {
        boolean z11;
        h0Var.getClass();
        kotlin.jvm.internal.u uVar = new kotlin.jvm.internal.u();
        TemplateActivity templateActivity = h0Var.f18486w;
        if (templateActivity != null) {
            boolean z12 = templateActivity.J;
            boolean z13 = false;
            HashMap<String, Object> hashMap = templateActivity.F;
            if (!z12 && !templateActivity.I) {
                uVar.f23466u = true;
                Object obj = hashMap.get("list");
                kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                ArrayList arrayList = (ArrayList) obj;
                if (arrayList.size() >= 2) {
                    screenResult13Model.setAns1((String) arrayList.get(0));
                    screenResult13Model.setAns2((String) arrayList.get(1));
                }
            } else if (z10) {
                hashMap.put("list", ca.a.k(screenResult13Model.getAns1(), screenResult13Model.getAns2()));
                TemplateActivity templateActivity2 = h0Var.f18486w;
                if (templateActivity2 != null) {
                    templateActivity2.F.put("s10_user_list", ca.a.k(screenResult13Model.getAns1(), screenResult13Model.getAns2()));
                    String ans1 = screenResult13Model.getAns1();
                    if (ans1 != null && !gv.n.B0(ans1)) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    if (!z11) {
                        TemplateActivity templateActivity3 = h0Var.f18486w;
                        if (templateActivity3 != null) {
                            HashMap<String, Object> hashMap2 = templateActivity3.F;
                            String ans12 = screenResult13Model.getAns1();
                            kotlin.jvm.internal.i.d(ans12);
                            hashMap2.put("s147a_user_data", ans12);
                        } else {
                            kotlin.jvm.internal.i.q("act");
                            throw null;
                        }
                    }
                    String ans2 = screenResult13Model.getAns2();
                    if (!((ans2 == null || gv.n.B0(ans2)) ? true : true)) {
                        TemplateActivity templateActivity4 = h0Var.f18486w;
                        if (templateActivity4 != null) {
                            HashMap<String, Object> hashMap3 = templateActivity4.F;
                            String ans22 = screenResult13Model.getAns2();
                            kotlin.jvm.internal.i.d(ans22);
                            hashMap3.put("s147b_user_data", ans22);
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
            ((RobertoTextView) h0Var._$_findCachedViewById(R.id.result1)).setText(screenResult13Model.getAns1());
            ((RobertoTextView) h0Var._$_findCachedViewById(R.id.result2)).setText(screenResult13Model.getAns2());
            ((RobertoButton) h0Var._$_findCachedViewById(R.id.button1)).setOnClickListener(new f0(h0Var, 1));
            ((RobertoButton) h0Var._$_findCachedViewById(R.id.button2)).setOnClickListener(new g0(z10, uVar, h0Var, str, screenResult13Model, 0));
            return;
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

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f18487x;
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
        return inflater.inflate(R.layout.fragment_screen_result_13, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        fm.a aVar = (fm.a) this.f18485v.getValue();
        aVar.f15174h0.k(getViewLifecycleOwner());
        aVar.f15177k0.k(getViewLifecycleOwner());
        aVar.f15178l0.k(getViewLifecycleOwner());
        aVar.f15180n0.k(getViewLifecycleOwner());
        aVar.f15181o0.k(getViewLifecycleOwner());
        aVar.f15182p0.k(getViewLifecycleOwner());
        aVar.w();
        super.onDestroyView();
        this.f18487x.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0106 A[Catch: Exception -> 0x0162, TryCatch #0 {Exception -> 0x0162, blocks: (B:3:0x000c, B:6:0x0035, B:8:0x0039, B:10:0x0047, B:11:0x0054, B:12:0x0057, B:13:0x0058, B:15:0x005c, B:17:0x00c5, B:19:0x00cf, B:21:0x00d3, B:27:0x00f2, B:29:0x0106, B:31:0x010a, B:34:0x0111, B:36:0x0156, B:37:0x0159, B:24:0x00e4, B:25:0x00e7, B:26:0x00e8, B:38:0x015a, B:39:0x015d, B:40:0x015e, B:41:0x0161), top: B:45:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0156 A[Catch: Exception -> 0x0162, TryCatch #0 {Exception -> 0x0162, blocks: (B:3:0x000c, B:6:0x0035, B:8:0x0039, B:10:0x0047, B:11:0x0054, B:12:0x0057, B:13:0x0058, B:15:0x005c, B:17:0x00c5, B:19:0x00cf, B:21:0x00d3, B:27:0x00f2, B:29:0x0106, B:31:0x010a, B:34:0x0111, B:36:0x0156, B:37:0x0159, B:24:0x00e4, B:25:0x00e7, B:26:0x00e8, B:38:0x015a, B:39:0x015d, B:40:0x015e, B:41:0x0161), top: B:45:0x000c }] */
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
            TemplateActivity templateActivity2 = (TemplateActivity) activity;
            this.f18486w = templateActivity2;
            templateActivity2.Q = false;
            androidx.fragment.app.p activity2 = getActivity();
            kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            if (((TemplateActivity) activity2).getIntent().hasExtra("source")) {
                TemplateActivity templateActivity3 = this.f18486w;
                if (templateActivity3 != null) {
                    if (kotlin.jvm.internal.i.b(templateActivity3.getIntent().getStringExtra("source"), "goals")) {
                        ((ImageView) _$_findCachedViewById(R.id.ivClose)).setImageResource(R.drawable.ic_wrong);
                    }
                } else {
                    kotlin.jvm.internal.i.q("act");
                    throw null;
                }
            }
            TemplateActivity templateActivity4 = this.f18486w;
            if (templateActivity4 != null) {
                HashMap<String, Object> A0 = templateActivity4.A0();
                ((RobertoTextView) _$_findCachedViewById(R.id.textView1)).setText(UtilFunKt.paramsMapToString(A0.get("r13_title")));
                ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText(UtilFunKt.paramsMapToString(A0.get("r13_heading")));
                ((RobertoTextView) _$_findCachedViewById(R.id.textView3)).setText(UtilFunKt.paramsMapToString(A0.get("r13_description")));
                ((RobertoButton) _$_findCachedViewById(R.id.button1)).setText(UtilFunKt.paramsMapToString(A0.get("r13_btn_one_text")));
                RobertoButton robertoButton = (RobertoButton) _$_findCachedViewById(R.id.button2);
                TemplateActivity templateActivity5 = this.f18486w;
                if (templateActivity5 != null) {
                    if (templateActivity5.getIntent().hasExtra("source")) {
                        TemplateActivity templateActivity6 = this.f18486w;
                        if (templateActivity6 != null) {
                            if (kotlin.jvm.internal.i.b(templateActivity6.getIntent().getStringExtra("source"), "goals")) {
                                paramsMapToString = "DONE";
                                robertoButton.setText(paramsMapToString);
                                ScreenResult13Model screenResult13Model = new ScreenResult13Model(Utils.INSTANCE.getTimeInSeconds());
                                templateActivity = this.f18486w;
                                if (templateActivity == null) {
                                    TemplateModel templateModel = templateActivity.f10547y;
                                    if (templateModel != null && (label = templateModel.getLabel()) != null) {
                                        fm.a aVar = (fm.a) this.f18485v.getValue();
                                        aVar.f15178l0.e(getViewLifecycleOwner(), new pp.b(24, new a(aVar, label, screenResult13Model)));
                                        aVar.f15181o0.e(getViewLifecycleOwner(), new pp.b(25, new b(label)));
                                        aVar.m(label, "result_13");
                                        ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new f0(this, 0));
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
                    paramsMapToString = UtilFunKt.paramsMapToString(A0.get("r13_btn_two_text"));
                    robertoButton.setText(paramsMapToString);
                    ScreenResult13Model screenResult13Model2 = new ScreenResult13Model(Utils.INSTANCE.getTimeInSeconds());
                    templateActivity = this.f18486w;
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
            LogHelper.INSTANCE.e(this.f18484u, "Exception in on view created", e10);
        }
    }
}
