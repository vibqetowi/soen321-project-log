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
import com.theinnerhour.b2b.model.ScreenResult22Model;
import com.theinnerhour.b2b.model.TaskIn2Min;
import com.theinnerhour.b2b.model.TemplateModel;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UtilFunKt;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: ScreenResult22FragmentNew.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhr/w1;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class w1 extends rr.b {

    /* renamed from: z  reason: collision with root package name */
    public static final /* synthetic */ int f19329z = 0;

    /* renamed from: x  reason: collision with root package name */
    public TemplateActivity f19333x;

    /* renamed from: y  reason: collision with root package name */
    public final LinkedHashMap f19334y = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f19330u = LogHelper.INSTANCE.makeLogTag(w1.class);

    /* renamed from: v  reason: collision with root package name */
    public String f19331v = "";

    /* renamed from: w  reason: collision with root package name */
    public final androidx.lifecycle.m0 f19332w = kotlin.jvm.internal.b0.j(this, kotlin.jvm.internal.y.a(fm.a.class), new b(this), new c(this), new d(this));

    /* compiled from: ScreenResult22FragmentNew.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.l<hs.f<? extends Boolean, ? extends FirestoreGoal>, hs.k> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ String f19336v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ScreenResult22Model f19337w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, ScreenResult22Model screenResult22Model) {
            super(1);
            this.f19336v = str;
            this.f19337w = screenResult22Model;
        }

        @Override // ss.l
        public final hs.k invoke(hs.f<? extends Boolean, ? extends FirestoreGoal> fVar) {
            boolean z10;
            hs.f<? extends Boolean, ? extends FirestoreGoal> fVar2 = fVar;
            if (fVar2 != null) {
                if (fVar2.f19465v != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                int i6 = w1.f19329z;
                w1 w1Var = w1.this;
                ((RobertoButton) w1Var._$_findCachedViewById(R.id.button1)).setOnClickListener(new zk.k(w1Var, this.f19337w, this.f19336v, z10));
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.a<androidx.lifecycle.q0> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f19338u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Fragment fragment) {
            super(0);
            this.f19338u = fragment;
        }

        @Override // ss.a
        public final androidx.lifecycle.q0 invoke() {
            return defpackage.e.m(this.f19338u, "requireActivity().viewModelStore");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class c extends kotlin.jvm.internal.k implements ss.a<k1.a> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f19339u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f19339u = fragment;
        }

        @Override // ss.a
        public final k1.a invoke() {
            return defpackage.b.r(this.f19339u, "requireActivity().defaultViewModelCreationExtras");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class d extends kotlin.jvm.internal.k implements ss.a<o0.b> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f19340u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f19340u = fragment;
        }

        @Override // ss.a
        public final o0.b invoke() {
            return pl.a.e(this.f19340u, "requireActivity().defaultViewModelProviderFactory");
        }
    }

    public final void J(ScreenResult22Model screenResult22Model, String str) {
        ((LinearLayout) _$_findCachedViewById(R.id.linearLayout)).removeAllViews();
        Iterator<TaskIn2Min> it = screenResult22Model.getItems().iterator();
        int i6 = 0;
        while (it.hasNext()) {
            TaskIn2Min next = it.next();
            if (kotlin.jvm.internal.i.b(str, "r22")) {
                if (next.getIn2Min()) {
                    i6++;
                    View inflate = getLayoutInflater().inflate(R.layout.row_vertical_2_textview, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.linearLayout)), false);
                    kotlin.jvm.internal.i.e(inflate, "null cannot be cast to non-null type android.widget.LinearLayout");
                    LinearLayout linearLayout = (LinearLayout) inflate;
                    ((RobertoTextView) linearLayout.findViewById(R.id.text1)).setText(this.f19331v + ' ' + i6);
                    ((RobertoTextView) linearLayout.findViewById(R.id.text2)).setText(next.getText());
                    ((LinearLayout) _$_findCachedViewById(R.id.linearLayout)).addView(linearLayout);
                }
            } else if (kotlin.jvm.internal.i.b(str, "r22-b") && !next.getIn2Min()) {
                i6++;
                View inflate2 = getLayoutInflater().inflate(R.layout.row_vertical_2_textview, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.linearLayout)), false);
                kotlin.jvm.internal.i.e(inflate2, "null cannot be cast to non-null type android.widget.LinearLayout");
                LinearLayout linearLayout2 = (LinearLayout) inflate2;
                ((RobertoTextView) linearLayout2.findViewById(R.id.text1)).setText(this.f19331v + ' ' + i6);
                ((RobertoTextView) linearLayout2.findViewById(R.id.text2)).setText(next.getText());
                ((LinearLayout) _$_findCachedViewById(R.id.linearLayout)).addView(linearLayout2);
            }
        }
        androidx.fragment.app.p activity = getActivity();
        kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
        TemplateActivity templateActivity = (TemplateActivity) activity;
        if (i6 == 0) {
            if (templateActivity.J) {
                templateActivity.onBackPressed();
            } else {
                ((RobertoButton) _$_findCachedViewById(R.id.button1)).performClick();
            }
        }
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f19334y;
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
        return inflater.inflate(R.layout.fragment_screen_result_22, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        fm.a aVar = (fm.a) this.f19332w.getValue();
        aVar.f15174h0.k(getViewLifecycleOwner());
        aVar.f15177k0.k(getViewLifecycleOwner());
        aVar.f15178l0.k(getViewLifecycleOwner());
        aVar.f15180n0.k(getViewLifecycleOwner());
        aVar.f15181o0.k(getViewLifecycleOwner());
        aVar.f15182p0.k(getViewLifecycleOwner());
        aVar.w();
        super.onDestroyView();
        this.f19334y.clear();
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
            this.f19333x = templateActivity;
            HashMap<String, Object> A0 = templateActivity.A0();
            TemplateActivity templateActivity2 = this.f19333x;
            if (templateActivity2 != null) {
                String B0 = templateActivity2.B0();
                TemplateActivity templateActivity3 = this.f19333x;
                if (templateActivity3 != null) {
                    Object obj = templateActivity3.F.get("result_22");
                    kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type com.theinnerhour.b2b.model.ScreenResult22Model");
                    ScreenResult22Model screenResult22Model = (ScreenResult22Model) obj;
                    this.f19331v = UtilFunKt.paramsMapToString(A0.get("r22_statement_prefix"));
                    screenResult22Model.setPrefix(UtilFunKt.paramsMapToString(A0.get("r22_statement_prefix")));
                    if (kotlin.jvm.internal.i.b(B0, "r22")) {
                        ((RobertoTextView) _$_findCachedViewById(R.id.textView1)).setText(UtilFunKt.paramsMapToString(A0.get("r22_heading")));
                        screenResult22Model.setTitle1(UtilFunKt.paramsMapToString(A0.get("r22_heading")));
                        ((RobertoTextView) _$_findCachedViewById(R.id.tvRememberLabel)).setText(UtilFunKt.paramsMapToString(A0.get("r22_remember_text")));
                        screenResult22Model.setRememberLabel(UtilFunKt.paramsMapToString(A0.get("r22_remember_text")));
                        ((RobertoTextView) _$_findCachedViewById(R.id.tvRemember)).setText(UtilFunKt.paramsMapToString(A0.get("r22_remember_description")));
                        screenResult22Model.setRememberText1(UtilFunKt.paramsMapToString(A0.get("r22_remember_description")));
                        ((RobertoButton) _$_findCachedViewById(R.id.button1)).setText(UtilFunKt.paramsMapToString(A0.get("r22_btn_two_text")));
                    } else if (kotlin.jvm.internal.i.b(B0, "r22-b")) {
                        ((RobertoTextView) _$_findCachedViewById(R.id.textView1)).setText(UtilFunKt.paramsMapToString(A0.get("r22b_heading")));
                        screenResult22Model.setTitle2(UtilFunKt.paramsMapToString(A0.get("r22b_heading")));
                        ((RobertoTextView) _$_findCachedViewById(R.id.tvRememberLabel)).setText(UtilFunKt.paramsMapToString(A0.get("r22b_remember_text")));
                        screenResult22Model.setRememberLabel(UtilFunKt.paramsMapToString(A0.get("r22b_remember_text")));
                        ((RobertoTextView) _$_findCachedViewById(R.id.tvRemember)).setText(UtilFunKt.paramsMapToString(A0.get("r22b_remember_description")));
                        screenResult22Model.setRememberText2(UtilFunKt.paramsMapToString(A0.get("r22b_remember_description")));
                        ((RobertoButton) _$_findCachedViewById(R.id.button1)).setText(UtilFunKt.paramsMapToString(A0.get("r22b_btn_two_text")));
                    }
                    TemplateActivity templateActivity4 = this.f19333x;
                    if (templateActivity4 != null) {
                        TemplateModel templateModel = templateActivity4.f10547y;
                        if (templateModel != null && (label = templateModel.getLabel()) != null) {
                            fm.a aVar = (fm.a) this.f19332w.getValue();
                            aVar.f15178l0.e(getViewLifecycleOwner(), new m0(26, new a(label, screenResult22Model)));
                            aVar.m(label, "result_22");
                            J(screenResult22Model, B0);
                            ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new View.OnClickListener(this) { // from class: hr.v1

                                /* renamed from: v  reason: collision with root package name */
                                public final /* synthetic */ w1 f19273v;

                                {
                                    this.f19273v = this;
                                }

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view2) {
                                    int i6 = r2;
                                    w1 this$0 = this.f19273v;
                                    switch (i6) {
                                        case 0:
                                            int i10 = w1.f19329z;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            TemplateActivity templateActivity5 = this$0.f19333x;
                                            if (templateActivity5 != null) {
                                                androidx.fragment.app.y yVar = templateActivity5.B;
                                                kotlin.jvm.internal.i.d(yVar);
                                                yVar.W();
                                                return;
                                            }
                                            kotlin.jvm.internal.i.q("act");
                                            throw null;
                                        case 1:
                                            int i11 = w1.f19329z;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            androidx.appcompat.widget.a1 a1Var = new androidx.appcompat.widget.a1(this$0.requireContext(), (ImageView) this$0._$_findCachedViewById(R.id.ivEllipses));
                                            a1Var.a().inflate(R.menu.logs_menu, a1Var.f1344b);
                                            a1Var.f1346d = new fq.s(this$0, 14);
                                            a1Var.b();
                                            return;
                                        default:
                                            int i12 = w1.f19329z;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            TemplateActivity templateActivity6 = this$0.f19333x;
                                            if (templateActivity6 != null) {
                                                templateActivity6.onBackPressed();
                                                return;
                                            } else {
                                                kotlin.jvm.internal.i.q("act");
                                                throw null;
                                            }
                                    }
                                }
                            });
                            ((ImageView) _$_findCachedViewById(R.id.ivHelp)).setVisibility(8);
                            ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setVisibility(0);
                            ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setOnClickListener(new View.OnClickListener(this) { // from class: hr.v1

                                /* renamed from: v  reason: collision with root package name */
                                public final /* synthetic */ w1 f19273v;

                                {
                                    this.f19273v = this;
                                }

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view2) {
                                    int i6 = r2;
                                    w1 this$0 = this.f19273v;
                                    switch (i6) {
                                        case 0:
                                            int i10 = w1.f19329z;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            TemplateActivity templateActivity5 = this$0.f19333x;
                                            if (templateActivity5 != null) {
                                                androidx.fragment.app.y yVar = templateActivity5.B;
                                                kotlin.jvm.internal.i.d(yVar);
                                                yVar.W();
                                                return;
                                            }
                                            kotlin.jvm.internal.i.q("act");
                                            throw null;
                                        case 1:
                                            int i11 = w1.f19329z;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            androidx.appcompat.widget.a1 a1Var = new androidx.appcompat.widget.a1(this$0.requireContext(), (ImageView) this$0._$_findCachedViewById(R.id.ivEllipses));
                                            a1Var.a().inflate(R.menu.logs_menu, a1Var.f1344b);
                                            a1Var.f1346d = new fq.s(this$0, 14);
                                            a1Var.b();
                                            return;
                                        default:
                                            int i12 = w1.f19329z;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            TemplateActivity templateActivity6 = this$0.f19333x;
                                            if (templateActivity6 != null) {
                                                templateActivity6.onBackPressed();
                                                return;
                                            } else {
                                                kotlin.jvm.internal.i.q("act");
                                                throw null;
                                            }
                                    }
                                }
                            });
                            ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new View.OnClickListener(this) { // from class: hr.v1

                                /* renamed from: v  reason: collision with root package name */
                                public final /* synthetic */ w1 f19273v;

                                {
                                    this.f19273v = this;
                                }

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view2) {
                                    int i6 = r2;
                                    w1 this$0 = this.f19273v;
                                    switch (i6) {
                                        case 0:
                                            int i10 = w1.f19329z;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            TemplateActivity templateActivity5 = this$0.f19333x;
                                            if (templateActivity5 != null) {
                                                androidx.fragment.app.y yVar = templateActivity5.B;
                                                kotlin.jvm.internal.i.d(yVar);
                                                yVar.W();
                                                return;
                                            }
                                            kotlin.jvm.internal.i.q("act");
                                            throw null;
                                        case 1:
                                            int i11 = w1.f19329z;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            androidx.appcompat.widget.a1 a1Var = new androidx.appcompat.widget.a1(this$0.requireContext(), (ImageView) this$0._$_findCachedViewById(R.id.ivEllipses));
                                            a1Var.a().inflate(R.menu.logs_menu, a1Var.f1344b);
                                            a1Var.f1346d = new fq.s(this$0, 14);
                                            a1Var.b();
                                            return;
                                        default:
                                            int i12 = w1.f19329z;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            TemplateActivity templateActivity6 = this$0.f19333x;
                                            if (templateActivity6 != null) {
                                                templateActivity6.onBackPressed();
                                                return;
                                            } else {
                                                kotlin.jvm.internal.i.q("act");
                                                throw null;
                                            }
                                    }
                                }
                            });
                            return;
                        }
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
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f19330u, "exception in on view created", e10);
        }
    }
}
