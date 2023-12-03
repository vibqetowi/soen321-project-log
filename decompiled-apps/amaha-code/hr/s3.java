package hr;

import android.content.Intent;
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
import com.theinnerhour.b2b.model.ScreenResult6Model;
import com.theinnerhour.b2b.model.TemplateModel;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UtilFunKt;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: ScreenResult6FragmentNew.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhr/s3;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class s3 extends rr.b {

    /* renamed from: z  reason: collision with root package name */
    public static final /* synthetic */ int f19129z = 0;

    /* renamed from: v  reason: collision with root package name */
    public TemplateActivity f19131v;

    /* renamed from: x  reason: collision with root package name */
    public boolean f19133x;

    /* renamed from: y  reason: collision with root package name */
    public final LinkedHashMap f19134y = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f19130u = LogHelper.INSTANCE.makeLogTag(s3.class);

    /* renamed from: w  reason: collision with root package name */
    public final androidx.lifecycle.m0 f19132w = kotlin.jvm.internal.b0.j(this, kotlin.jvm.internal.y.a(fm.a.class), new c(this), new d(this), new e(this));

    /* compiled from: ScreenResult6FragmentNew.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.l<hs.f<? extends Boolean, ? extends FirestoreGoal>, hs.k> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ fm.a f19136v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ String f19137w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(fm.a aVar, String str) {
            super(1);
            this.f19136v = aVar;
            this.f19137w = str;
        }

        @Override // ss.l
        public final hs.k invoke(hs.f<? extends Boolean, ? extends FirestoreGoal> fVar) {
            hs.f<? extends Boolean, ? extends FirestoreGoal> fVar2 = fVar;
            if (fVar2 != null) {
                s3 s3Var = s3.this;
                TemplateActivity templateActivity = s3Var.f19131v;
                String str = null;
                if (templateActivity != null) {
                    boolean b10 = kotlin.jvm.internal.i.b(templateActivity.F.get("log"), Boolean.TRUE);
                    boolean z10 = true;
                    String str2 = this.f19137w;
                    B b11 = fVar2.f19465v;
                    if (!b10) {
                        TemplateActivity templateActivity2 = s3Var.f19131v;
                        if (templateActivity2 != null) {
                            if ((templateActivity2.J && !templateActivity2.S) || templateActivity2.I) {
                                FirestoreGoal firestoreGoal = (FirestoreGoal) b11;
                                if (firestoreGoal != null) {
                                    str = firestoreGoal.getDataTypeKey();
                                }
                                if (kotlin.jvm.internal.i.b(str, "result_6")) {
                                    s3Var.f19133x = true;
                                    this.f19136v.o(str2, false);
                                }
                            }
                        } else {
                            kotlin.jvm.internal.i.q("act");
                            throw null;
                        }
                    }
                    ScreenResult6Model screenResult6Model = new ScreenResult6Model(Utils.INSTANCE.getTimeInSeconds());
                    if (b11 == 0) {
                        z10 = false;
                    }
                    s3.J(s3Var, str2, screenResult6Model, z10);
                } else {
                    kotlin.jvm.internal.i.q("act");
                    throw null;
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: ScreenResult6FragmentNew.kt */
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.l<hs.f<? extends Boolean, ? extends HashMap<String, Object>>, hs.k> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ String f19139v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(1);
            this.f19139v = str;
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
                s3 s3Var = s3.this;
                if (s3Var.f19133x) {
                    s3Var.f19133x = false;
                    ScreenResult6Model screenResult6Model = (ScreenResult6Model) is.u.i2(UtilFunKt.result6MapToObject(ca.a.k((HashMap) fVar2.f19465v)));
                    if (screenResult6Model != null) {
                        s3.J(s3Var, this.f19139v, screenResult6Model, true);
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
        public final /* synthetic */ Fragment f19140u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f19140u = fragment;
        }

        @Override // ss.a
        public final androidx.lifecycle.q0 invoke() {
            return defpackage.e.m(this.f19140u, "requireActivity().viewModelStore");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class d extends kotlin.jvm.internal.k implements ss.a<k1.a> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f19141u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f19141u = fragment;
        }

        @Override // ss.a
        public final k1.a invoke() {
            return defpackage.b.r(this.f19141u, "requireActivity().defaultViewModelCreationExtras");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class e extends kotlin.jvm.internal.k implements ss.a<o0.b> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f19142u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f19142u = fragment;
        }

        @Override // ss.a
        public final o0.b invoke() {
            return pl.a.e(this.f19142u, "requireActivity().defaultViewModelProviderFactory");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0112, code lost:
        if (r1.b0.c(r5, "source", "goals") != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01a7, code lost:
        if (r1.b0.c(r5, "source", "goals") != false) goto L77;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void J(s3 s3Var, String str, ScreenResult6Model screenResult6Model, boolean z10) {
        String str2;
        TemplateActivity templateActivity = s3Var.f19131v;
        if (templateActivity != null) {
            HashMap<String, Object> A0 = templateActivity.A0();
            ArrayList<String> paramsMapToList = UtilFunKt.paramsMapToList(A0.get("r6_sub_heading_list"));
            TemplateActivity templateActivity2 = s3Var.f19131v;
            if (templateActivity2 != null) {
                if (kotlin.jvm.internal.i.b(templateActivity2.F.get("log"), Boolean.TRUE)) {
                    ((ImageView) s3Var._$_findCachedViewById(R.id.ivClose)).setImageResource(R.drawable.ic_arrow_back);
                    TemplateActivity templateActivity3 = s3Var.f19131v;
                    if (templateActivity3 != null) {
                        Object obj = templateActivity3.F.get("ans");
                        kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                        screenResult6Model.setList((ArrayList) obj);
                        RobertoTextView robertoTextView = (RobertoTextView) s3Var._$_findCachedViewById(R.id.textView1);
                        TemplateActivity templateActivity4 = s3Var.f19131v;
                        if (templateActivity4 != null) {
                            Object obj2 = templateActivity4.F.get("heading");
                            kotlin.jvm.internal.i.e(obj2, "null cannot be cast to non-null type kotlin.String");
                            robertoTextView.setText((String) obj2);
                            ((RobertoButton) s3Var._$_findCachedViewById(R.id.button1)).setVisibility(8);
                            ((RobertoButton) s3Var._$_findCachedViewById(R.id.button2)).setVisibility(8);
                            ((ImageView) s3Var._$_findCachedViewById(R.id.ivEllipses)).setVisibility(8);
                            TemplateActivity templateActivity5 = s3Var.f19131v;
                            if (templateActivity5 != null) {
                                templateActivity5.F.put("log", Boolean.FALSE);
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
                    TemplateActivity templateActivity6 = s3Var.f19131v;
                    if (templateActivity6 != null) {
                        String str3 = "DONE";
                        if ((templateActivity6.J && !templateActivity6.S) || templateActivity6.I) {
                            ((RobertoTextView) s3Var._$_findCachedViewById(R.id.textView1)).setText(UtilFunKt.paramsMapToString(A0.get("r6_heading")));
                            ((RobertoButton) s3Var._$_findCachedViewById(R.id.button1)).setText(UtilFunKt.paramsMapToString(A0.get("r6_btn_one_text")));
                            RobertoButton robertoButton = (RobertoButton) s3Var._$_findCachedViewById(R.id.button2);
                            TemplateActivity templateActivity7 = s3Var.f19131v;
                            if (templateActivity7 != null) {
                                if (templateActivity7.getIntent().hasExtra("source")) {
                                    TemplateActivity templateActivity8 = s3Var.f19131v;
                                    if (templateActivity8 == null) {
                                        kotlin.jvm.internal.i.q("act");
                                        throw null;
                                    }
                                }
                                str3 = UtilFunKt.paramsMapToString(A0.get("r6_btn_two_text"));
                                robertoButton.setText(str3);
                                TemplateActivity templateActivity9 = s3Var.f19131v;
                                if (templateActivity9 != null) {
                                    templateActivity9.F.put("list", screenResult6Model.getList());
                                    TemplateActivity templateActivity10 = s3Var.f19131v;
                                    if (templateActivity10 != null) {
                                        templateActivity10.F.put("result_6_initial_val", screenResult6Model.getList());
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
                            templateActivity6.S = true;
                            Object obj3 = templateActivity6.F.get("list");
                            kotlin.jvm.internal.i.e(obj3, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                            screenResult6Model.setList((ArrayList) obj3);
                            ((RobertoTextView) s3Var._$_findCachedViewById(R.id.textView1)).setText(UtilFunKt.paramsMapToString(A0.get("r6_heading")));
                            ((RobertoButton) s3Var._$_findCachedViewById(R.id.button1)).setText(UtilFunKt.paramsMapToString(A0.get("r6_btn_one_text")));
                            RobertoButton robertoButton2 = (RobertoButton) s3Var._$_findCachedViewById(R.id.button2);
                            TemplateActivity templateActivity11 = s3Var.f19131v;
                            if (templateActivity11 != null) {
                                if (templateActivity11.getIntent().hasExtra("source")) {
                                    TemplateActivity templateActivity12 = s3Var.f19131v;
                                    if (templateActivity12 == null) {
                                        kotlin.jvm.internal.i.q("act");
                                        throw null;
                                    }
                                }
                                str3 = UtilFunKt.paramsMapToString(A0.get("r6_btn_two_text"));
                                robertoButton2.setText(str3);
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
                ((LinearLayout) s3Var._$_findCachedViewById(R.id.linearLayout)).removeAllViews();
                if (paramsMapToList.size() == 1) {
                    View inflate = s3Var.requireActivity().getLayoutInflater().inflate(R.layout.row_result_6, (ViewGroup) ((LinearLayout) s3Var._$_findCachedViewById(R.id.linearLayout)), false);
                    ((RobertoTextView) inflate.findViewById(R.id.rowQuestion)).setText(paramsMapToList.get(0));
                    ((RobertoTextView) inflate.findViewById(R.id.rowAnswer)).setText(screenResult6Model.getList().get(screenResult6Model.getList().size() - 1));
                    ((LinearLayout) s3Var._$_findCachedViewById(R.id.linearLayout)).addView(inflate);
                } else {
                    int size = screenResult6Model.getList().size();
                    for (int i6 = 0; i6 < size; i6++) {
                        View inflate2 = s3Var.requireActivity().getLayoutInflater().inflate(R.layout.row_result_6, (ViewGroup) ((LinearLayout) s3Var._$_findCachedViewById(R.id.linearLayout)), false);
                        RobertoTextView robertoTextView2 = (RobertoTextView) inflate2.findViewById(R.id.rowQuestion);
                        String str4 = "";
                        if (i6 >= paramsMapToList.size()) {
                            str2 = "";
                        } else {
                            str2 = paramsMapToList.get(i6);
                        }
                        robertoTextView2.setText(str2);
                        RobertoTextView robertoTextView3 = (RobertoTextView) inflate2.findViewById(R.id.rowAnswer);
                        if (i6 < screenResult6Model.getList().size()) {
                            str4 = screenResult6Model.getList().get(i6);
                        }
                        robertoTextView3.setText(str4);
                        ((LinearLayout) s3Var._$_findCachedViewById(R.id.linearLayout)).addView(inflate2);
                    }
                }
                ((RobertoButton) s3Var._$_findCachedViewById(R.id.button1)).setOnClickListener(new q3(s3Var, 1));
                ((RobertoButton) s3Var._$_findCachedViewById(R.id.button2)).setOnClickListener(new zk.k(z10, (Object) s3Var, str, (Serializable) screenResult6Model, 15));
                ((ImageView) s3Var._$_findCachedViewById(R.id.ivHelp)).setVisibility(8);
                ((ImageView) s3Var._$_findCachedViewById(R.id.ivClose)).setOnClickListener(new q3(s3Var, 2));
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
        boolean z10;
        TemplateActivity templateActivity;
        String str;
        TemplateActivity templateActivity2;
        boolean z11;
        TemplateActivity templateActivity3;
        String str2;
        TemplateModel templateModel;
        Intent intent;
        Intent intent2;
        androidx.fragment.app.p activity = getActivity();
        if (activity != null && (intent2 = activity.getIntent()) != null && intent2.hasExtra("source")) {
            z10 = true;
        } else {
            z10 = false;
        }
        TemplateActivity templateActivity4 = null;
        if (z10) {
            androidx.fragment.app.p activity2 = getActivity();
            if (activity2 instanceof TemplateActivity) {
                templateActivity = (TemplateActivity) activity2;
            } else {
                templateActivity = null;
            }
            if (templateActivity != null && (intent = templateActivity.getIntent()) != null) {
                str = intent.getStringExtra("source");
            } else {
                str = null;
            }
            if (kotlin.jvm.internal.i.b(str, "goals")) {
                androidx.fragment.app.p activity3 = getActivity();
                if (activity3 instanceof TemplateActivity) {
                    templateActivity2 = (TemplateActivity) activity3;
                } else {
                    templateActivity2 = null;
                }
                if (templateActivity2 != null && !templateActivity2.R) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    ArrayList k10 = ca.a.k("HeDKoBM3U4UoRTGsy0TE", "e4VaAGYWhfIoFD0PGt6e", "GOorgabeKajhZhtBwFqL");
                    androidx.fragment.app.p activity4 = getActivity();
                    if (activity4 instanceof TemplateActivity) {
                        templateActivity3 = (TemplateActivity) activity4;
                    } else {
                        templateActivity3 = null;
                    }
                    if (templateActivity3 != null && (templateModel = templateActivity3.f10547y) != null) {
                        str2 = templateModel.getLabel();
                    } else {
                        str2 = null;
                    }
                    if (!is.u.Z1(k10, str2)) {
                        androidx.fragment.app.p activity5 = getActivity();
                        kotlin.jvm.internal.i.e(activity5, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                        ((TemplateActivity) activity5).o0();
                        return false;
                    }
                }
            }
        }
        androidx.fragment.app.p activity6 = getActivity();
        if (activity6 instanceof TemplateActivity) {
            templateActivity4 = (TemplateActivity) activity6;
        }
        if (templateActivity4 == null) {
            return true;
        }
        templateActivity4.R = false;
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
        if (r0.equals("s154") == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
        if (r0.equals("s151") != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
        if (r0.equals("s140") == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003d, code lost:
        if (r0.equals("s139") == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0046, code lost:
        if (r0.equals("s138") == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004f, code lost:
        if (r0.equals("s56") == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0058, code lost:
        if (r0.equals("s55") == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0061, code lost:
        if (r0.equals("s45") == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006a, code lost:
        if (r0.equals("s37") == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x006d, code lost:
        r0 = r5.f19131v;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x006f, code lost:
        if (r0 == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0071, code lost:
        r0.s0(new hr.p6());
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x007a, code lost:
        kotlin.jvm.internal.i.q("act");
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x007d, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:?, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void K() {
        TemplateActivity templateActivity = this.f19131v;
        if (templateActivity != null) {
            templateActivity.K0(false);
            TemplateActivity templateActivity2 = this.f19131v;
            if (templateActivity2 != null) {
                String B0 = templateActivity2.B0();
                switch (B0.hashCode()) {
                    case 112151:
                        break;
                    case 112180:
                        break;
                    case 112211:
                        break;
                    case 112212:
                        break;
                    case 3474691:
                        break;
                    case 3474692:
                        break;
                    case 3474714:
                        break;
                    case 3474746:
                        break;
                    case 3474749:
                        break;
                    default:
                        androidx.fragment.app.p activity = getActivity();
                        kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                        if (((TemplateActivity) activity).getIntent().hasExtra("source")) {
                            androidx.fragment.app.p activity2 = getActivity();
                            kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                            ((TemplateActivity) activity2).n0();
                            return;
                        }
                        TemplateActivity templateActivity3 = this.f19131v;
                        if (templateActivity3 != null) {
                            templateActivity3.t0();
                            return;
                        } else {
                            kotlin.jvm.internal.i.q("act");
                            throw null;
                        }
                }
            } else {
                kotlin.jvm.internal.i.q("act");
                throw null;
            }
        } else {
            kotlin.jvm.internal.i.q("act");
            throw null;
        }
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f19134y;
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
        return inflater.inflate(R.layout.fragment_screen_result_6, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        fm.a aVar = (fm.a) this.f19132w.getValue();
        aVar.f15174h0.k(getViewLifecycleOwner());
        aVar.f15177k0.k(getViewLifecycleOwner());
        aVar.f15178l0.k(getViewLifecycleOwner());
        aVar.f15180n0.k(getViewLifecycleOwner());
        aVar.f15181o0.k(getViewLifecycleOwner());
        aVar.f15182p0.k(getViewLifecycleOwner());
        aVar.w();
        super.onDestroyView();
        this.f19134y.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String label;
        String str;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            TemplateActivity templateActivity = (TemplateActivity) activity;
            this.f19131v = templateActivity;
            templateActivity.Q = false;
            androidx.fragment.app.p activity2 = getActivity();
            kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            if (((TemplateActivity) activity2).getIntent().hasExtra("source")) {
                TemplateActivity templateActivity2 = this.f19131v;
                if (templateActivity2 != null) {
                    if (kotlin.jvm.internal.i.b(templateActivity2.getIntent().getStringExtra("source"), "goals")) {
                        ArrayList k10 = ca.a.k("GOorgabeKajhZhtBwFqL", "HeDKoBM3U4UoRTGsy0TE", "e4VaAGYWhfIoFD0PGt6e");
                        TemplateActivity templateActivity3 = this.f19131v;
                        if (templateActivity3 != null) {
                            TemplateModel templateModel = templateActivity3.f10547y;
                            if (templateModel != null) {
                                str = templateModel.getLabel();
                            } else {
                                str = null;
                            }
                            if (!is.u.Z1(k10, str)) {
                                ((ImageView) _$_findCachedViewById(R.id.ivClose)).setImageResource(R.drawable.ic_wrong);
                            }
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
            ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setVisibility(0);
            ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setOnClickListener(new q3(this, 0));
            TemplateActivity templateActivity4 = this.f19131v;
            if (templateActivity4 != null) {
                TemplateModel templateModel2 = templateActivity4.f10547y;
                if (templateModel2 != null && (label = templateModel2.getLabel()) != null) {
                    fm.a aVar = (fm.a) this.f19132w.getValue();
                    aVar.f15178l0.e(getViewLifecycleOwner(), new a2(27, new a(aVar, label)));
                    aVar.f15181o0.e(getViewLifecycleOwner(), new a2(28, new b(label)));
                    aVar.m(label, "result_6");
                    return;
                }
                return;
            }
            kotlin.jvm.internal.i.q("act");
            throw null;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f19130u, "Exception", e10);
        }
    }
}
