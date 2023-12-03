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
import com.theinnerhour.b2b.model.ScreenResult1Model;
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
/* compiled from: ScreenResult1FragmentNew.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhr/i1;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class i1 extends rr.b {

    /* renamed from: z  reason: collision with root package name */
    public static final /* synthetic */ int f18558z = 0;

    /* renamed from: v  reason: collision with root package name */
    public TemplateActivity f18560v;

    /* renamed from: x  reason: collision with root package name */
    public boolean f18562x;

    /* renamed from: y  reason: collision with root package name */
    public final LinkedHashMap f18563y = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f18559u = LogHelper.INSTANCE.makeLogTag(i1.class);

    /* renamed from: w  reason: collision with root package name */
    public final androidx.lifecycle.m0 f18561w = kotlin.jvm.internal.b0.j(this, kotlin.jvm.internal.y.a(fm.a.class), new c(this), new d(this), new e(this));

    /* compiled from: ScreenResult1FragmentNew.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.l<hs.f<? extends Boolean, ? extends FirestoreGoal>, hs.k> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ fm.a f18565v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ String f18566w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(fm.a aVar, String str) {
            super(1);
            this.f18565v = aVar;
            this.f18566w = str;
        }

        @Override // ss.l
        public final hs.k invoke(hs.f<? extends Boolean, ? extends FirestoreGoal> fVar) {
            hs.f<? extends Boolean, ? extends FirestoreGoal> fVar2 = fVar;
            if (fVar2 != null) {
                i1 i1Var = i1.this;
                TemplateActivity templateActivity = i1Var.f18560v;
                String str = null;
                if (templateActivity != null) {
                    boolean b10 = kotlin.jvm.internal.i.b(templateActivity.F.get("log"), Boolean.TRUE);
                    boolean z10 = true;
                    String str2 = this.f18566w;
                    B b11 = fVar2.f19465v;
                    if (!b10) {
                        TemplateActivity templateActivity2 = i1Var.f18560v;
                        if (templateActivity2 != null) {
                            if ((templateActivity2.J && !templateActivity2.S) || templateActivity2.I) {
                                FirestoreGoal firestoreGoal = (FirestoreGoal) b11;
                                if (firestoreGoal != null) {
                                    str = firestoreGoal.getDataTypeKey();
                                }
                                if (kotlin.jvm.internal.i.b(str, "result_1")) {
                                    this.f18565v.o(str2, false);
                                    i1Var.f18562x = true;
                                }
                            }
                        } else {
                            kotlin.jvm.internal.i.q("act");
                            throw null;
                        }
                    }
                    ScreenResult1Model screenResult1Model = new ScreenResult1Model(Utils.INSTANCE.getTimeInSeconds());
                    if (b11 == 0) {
                        z10 = false;
                    }
                    i1.J(i1Var, str2, screenResult1Model, z10);
                } else {
                    kotlin.jvm.internal.i.q("act");
                    throw null;
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: ScreenResult1FragmentNew.kt */
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.l<hs.f<? extends Boolean, ? extends HashMap<String, Object>>, hs.k> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ String f18568v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(1);
            this.f18568v = str;
        }

        @Override // ss.l
        public final hs.k invoke(hs.f<? extends Boolean, ? extends HashMap<String, Object>> fVar) {
            boolean z10;
            hs.f<? extends Boolean, ? extends HashMap<String, Object>> fVar2 = fVar;
            i1 i1Var = i1.this;
            if (i1Var.f18562x) {
                if (fVar2 != null && ((Boolean) fVar2.f19464u).booleanValue()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    i1Var.f18562x = false;
                    ScreenResult1Model screenResult1Model = (ScreenResult1Model) is.u.p2(UtilFunKt.result1ListMapToObject(ca.a.k((HashMap) fVar2.f19465v)));
                    if (screenResult1Model != null) {
                        i1.J(i1Var, this.f18568v, screenResult1Model, true);
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
        public final /* synthetic */ Fragment f18569u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f18569u = fragment;
        }

        @Override // ss.a
        public final androidx.lifecycle.q0 invoke() {
            return defpackage.e.m(this.f18569u, "requireActivity().viewModelStore");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class d extends kotlin.jvm.internal.k implements ss.a<k1.a> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f18570u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f18570u = fragment;
        }

        @Override // ss.a
        public final k1.a invoke() {
            return defpackage.b.r(this.f18570u, "requireActivity().defaultViewModelCreationExtras");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class e extends kotlin.jvm.internal.k implements ss.a<o0.b> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f18571u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f18571u = fragment;
        }

        @Override // ss.a
        public final o0.b invoke() {
            return pl.a.e(this.f18571u, "requireActivity().defaultViewModelProviderFactory");
        }
    }

    public static final void J(i1 i1Var, String str, ScreenResult1Model screenResult1Model, boolean z10) {
        ArrayList<String> paramsMapToList;
        i1Var.getClass();
        kotlin.jvm.internal.u uVar = new kotlin.jvm.internal.u();
        TemplateActivity templateActivity = i1Var.f18560v;
        if (templateActivity != null) {
            HashMap<String, Object> A0 = templateActivity.A0();
            TemplateActivity templateActivity2 = i1Var.f18560v;
            if (templateActivity2 != null) {
                if (kotlin.jvm.internal.i.b(templateActivity2.F.get("log"), Boolean.TRUE)) {
                    TemplateActivity templateActivity3 = i1Var.f18560v;
                    if (templateActivity3 != null) {
                        templateActivity3.F.put("log", Boolean.FALSE);
                        ((ImageView) i1Var._$_findCachedViewById(R.id.ivClose)).setImageResource(R.drawable.ic_arrow_back);
                        ((ImageView) i1Var._$_findCachedViewById(R.id.ivEllipses)).setVisibility(8);
                        ((RobertoButton) i1Var._$_findCachedViewById(R.id.button1)).setVisibility(8);
                        ((RobertoButton) i1Var._$_findCachedViewById(R.id.button2)).setVisibility(8);
                        TemplateActivity templateActivity4 = i1Var.f18560v;
                        if (templateActivity4 != null) {
                            Object obj = templateActivity4.F.get("qus");
                            kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                            screenResult1Model.setHeadings((ArrayList) obj);
                            TemplateActivity templateActivity5 = i1Var.f18560v;
                            if (templateActivity5 != null) {
                                Object obj2 = templateActivity5.F.get("ans");
                                kotlin.jvm.internal.i.e(obj2, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                                screenResult1Model.setList((ArrayList) obj2);
                            } else {
                                kotlin.jvm.internal.i.q("act");
                                throw null;
                            }
                        } else {
                            kotlin.jvm.internal.i.q("act");
                            throw null;
                        }
                    } else {
                        kotlin.jvm.internal.i.q("act");
                        throw null;
                    }
                } else {
                    TemplateActivity templateActivity6 = i1Var.f18560v;
                    if (templateActivity6 != null) {
                        boolean z11 = templateActivity6.J;
                        HashMap<String, Object> hashMap = templateActivity6.F;
                        if ((z11 && !templateActivity6.S) || templateActivity6.I) {
                            hashMap.put("list", screenResult1Model.getList());
                            TemplateActivity templateActivity7 = i1Var.f18560v;
                            if (templateActivity7 != null) {
                                templateActivity7.F.put("list_selection", screenResult1Model.getList());
                            } else {
                                kotlin.jvm.internal.i.q("act");
                                throw null;
                            }
                        } else {
                            templateActivity6.S = true;
                            uVar.f23466u = true;
                            Object obj3 = hashMap.get("list");
                            kotlin.jvm.internal.i.e(obj3, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                            screenResult1Model.setList((ArrayList) obj3);
                            TemplateActivity templateActivity8 = i1Var.f18560v;
                            if (templateActivity8 != null) {
                                if (kotlin.jvm.internal.i.b(templateActivity8.B0(), "s9")) {
                                    paramsMapToList = UtilFunKt.paramsMapToList(A0.get("r1_heading_list"));
                                } else {
                                    paramsMapToList = UtilFunKt.paramsMapToList(A0.get("r1_sub_heading_list"));
                                }
                                screenResult1Model.setHeadings(paramsMapToList);
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
                ((LinearLayout) i1Var._$_findCachedViewById(R.id.linearlayout)).removeAllViews();
                Iterator<String> it = screenResult1Model.getList().iterator();
                int i6 = 0;
                while (it.hasNext()) {
                    int i10 = i6 + 1;
                    View inflate = i1Var.getLayoutInflater().inflate(R.layout.row_result1, (ViewGroup) ((LinearLayout) i1Var._$_findCachedViewById(R.id.linearlayout)), false);
                    ((RobertoTextView) inflate.findViewById(R.id.textView1)).setText(screenResult1Model.getHeadings().get(i6));
                    ((RobertoTextView) inflate.findViewById(R.id.textView2)).setText(it.next());
                    ((LinearLayout) i1Var._$_findCachedViewById(R.id.linearlayout)).addView(inflate);
                    i6 = i10;
                }
                ((RobertoButton) i1Var._$_findCachedViewById(R.id.button1)).setOnClickListener(new h1(i1Var, 1));
                ((RobertoButton) i1Var._$_findCachedViewById(R.id.button2)).setOnClickListener(new g0(z10, uVar, screenResult1Model, i1Var, str));
                ((ImageView) i1Var._$_findCachedViewById(R.id.ivHelp)).setVisibility(8);
                ((ImageView) i1Var._$_findCachedViewById(R.id.ivClose)).setOnClickListener(new h1(i1Var, 2));
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
        TemplateActivity templateActivity;
        boolean z10;
        TemplateActivity templateActivity2;
        String str;
        TemplateActivity templateActivity3;
        TemplateModel templateModel;
        TemplateActivity templateActivity4 = this.f18560v;
        TemplateActivity templateActivity5 = null;
        if (templateActivity4 != null) {
            if (kotlin.jvm.internal.i.b(templateActivity4.F.get("log_back"), Boolean.TRUE)) {
                TemplateActivity templateActivity6 = this.f18560v;
                if (templateActivity6 != null) {
                    androidx.fragment.app.y yVar = templateActivity6.B;
                    kotlin.jvm.internal.i.d(yVar);
                    yVar.W();
                    return false;
                }
                kotlin.jvm.internal.i.q("act");
                throw null;
            }
            TemplateActivity templateActivity7 = this.f18560v;
            if (templateActivity7 != null) {
                if (templateActivity7.getIntent().hasExtra("source")) {
                    TemplateActivity templateActivity8 = this.f18560v;
                    if (templateActivity8 != null) {
                        if (r1.b0.c(templateActivity8, "source", "goals")) {
                            androidx.fragment.app.p activity = getActivity();
                            if (activity instanceof TemplateActivity) {
                                templateActivity = (TemplateActivity) activity;
                            } else {
                                templateActivity = null;
                            }
                            if (templateActivity != null && !templateActivity.R) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10) {
                                androidx.fragment.app.p activity2 = getActivity();
                                if (activity2 instanceof TemplateActivity) {
                                    templateActivity2 = (TemplateActivity) activity2;
                                } else {
                                    templateActivity2 = null;
                                }
                                if (templateActivity2 != null && (templateModel = templateActivity2.f10547y) != null) {
                                    str = templateModel.getLabel();
                                } else {
                                    str = null;
                                }
                                if (kotlin.jvm.internal.i.b(str, "AskzVbMafuaqKJtzT9g9")) {
                                    androidx.fragment.app.p activity3 = getActivity();
                                    if (activity3 instanceof TemplateActivity) {
                                        templateActivity3 = (TemplateActivity) activity3;
                                    } else {
                                        templateActivity3 = null;
                                    }
                                    if (templateActivity3 != null) {
                                        templateActivity3.I = false;
                                    }
                                    androidx.fragment.app.p activity4 = getActivity();
                                    if (activity4 instanceof TemplateActivity) {
                                        templateActivity5 = (TemplateActivity) activity4;
                                    }
                                    if (templateActivity5 != null) {
                                        templateActivity5.R = true;
                                    }
                                    return true;
                                }
                                androidx.fragment.app.p activity5 = getActivity();
                                kotlin.jvm.internal.i.e(activity5, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                ((TemplateActivity) activity5).o0();
                                return false;
                            }
                        }
                    } else {
                        kotlin.jvm.internal.i.q("act");
                        throw null;
                    }
                }
                androidx.fragment.app.p activity6 = getActivity();
                if (activity6 instanceof TemplateActivity) {
                    templateActivity5 = (TemplateActivity) activity6;
                }
                if (templateActivity5 != null) {
                    templateActivity5.R = false;
                }
                return true;
            }
            kotlin.jvm.internal.i.q("act");
            throw null;
        }
        kotlin.jvm.internal.i.q("act");
        throw null;
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f18563y;
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
        return inflater.inflate(R.layout.fragment_screen_result_1, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        fm.a aVar = (fm.a) this.f18561w.getValue();
        aVar.f15174h0.k(getViewLifecycleOwner());
        aVar.f15177k0.k(getViewLifecycleOwner());
        aVar.f15178l0.k(getViewLifecycleOwner());
        aVar.f15180n0.k(getViewLifecycleOwner());
        aVar.f15181o0.k(getViewLifecycleOwner());
        aVar.f15182p0.k(getViewLifecycleOwner());
        aVar.w();
        super.onDestroyView();
        this.f18563y.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String label;
        String paramsMapToString;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            TemplateActivity templateActivity = (TemplateActivity) activity;
            this.f18560v = templateActivity;
            templateActivity.Q = false;
            HashMap<String, Object> A0 = templateActivity.A0();
            TemplateActivity templateActivity2 = this.f18560v;
            if (templateActivity2 != null) {
                TemplateModel templateModel = templateActivity2.f10547y;
                if (templateModel != null && (label = templateModel.getLabel()) != null) {
                    androidx.fragment.app.p activity2 = getActivity();
                    kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                    if (((TemplateActivity) activity2).getIntent().hasExtra("source")) {
                        TemplateActivity templateActivity3 = this.f18560v;
                        if (templateActivity3 != null) {
                            if (kotlin.jvm.internal.i.b(templateActivity3.getIntent().getStringExtra("source"), "goals") && !kotlin.jvm.internal.i.b(label, "AskzVbMafuaqKJtzT9g9")) {
                                ((ImageView) _$_findCachedViewById(R.id.ivClose)).setImageResource(R.drawable.ic_wrong);
                            }
                        } else {
                            kotlin.jvm.internal.i.q("act");
                            throw null;
                        }
                    }
                    ((RobertoTextView) _$_findCachedViewById(R.id.textView9)).setText(UtilFunKt.paramsMapToString(A0.get("r1_heading")));
                    ((RobertoButton) _$_findCachedViewById(R.id.button1)).setText(UtilFunKt.paramsMapToString(A0.get("r1_btn_one_text")));
                    RobertoButton robertoButton = (RobertoButton) _$_findCachedViewById(R.id.button2);
                    TemplateActivity templateActivity4 = this.f18560v;
                    if (templateActivity4 != null) {
                        if (templateActivity4.getIntent().hasExtra("source")) {
                            TemplateActivity templateActivity5 = this.f18560v;
                            if (templateActivity5 != null) {
                                if (kotlin.jvm.internal.i.b(templateActivity5.getIntent().getStringExtra("source"), "goals")) {
                                    paramsMapToString = "DONE";
                                    robertoButton.setText(paramsMapToString);
                                    ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setVisibility(0);
                                    fm.a aVar = (fm.a) this.f18561w.getValue();
                                    aVar.f15178l0.e(getViewLifecycleOwner(), new m0(16, new a(aVar, label)));
                                    aVar.f15181o0.e(getViewLifecycleOwner(), new m0(17, new b(label)));
                                    aVar.m(label, "result_1");
                                    ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setOnClickListener(new h1(this, 0));
                                    return;
                                }
                            } else {
                                kotlin.jvm.internal.i.q("act");
                                throw null;
                            }
                        }
                        paramsMapToString = UtilFunKt.paramsMapToString(A0.get("r1_btn_two_text"));
                        robertoButton.setText(paramsMapToString);
                        ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setVisibility(0);
                        fm.a aVar2 = (fm.a) this.f18561w.getValue();
                        aVar2.f15178l0.e(getViewLifecycleOwner(), new m0(16, new a(aVar2, label)));
                        aVar2.f15181o0.e(getViewLifecycleOwner(), new m0(17, new b(label)));
                        aVar2.m(label, "result_1");
                        ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setOnClickListener(new h1(this, 0));
                        return;
                    }
                    kotlin.jvm.internal.i.q("act");
                    throw null;
                }
                return;
            }
            kotlin.jvm.internal.i.q("act");
            throw null;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f18559u, "exception on view created", e10);
        }
    }
}
