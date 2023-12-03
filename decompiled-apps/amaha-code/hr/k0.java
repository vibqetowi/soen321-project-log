package hr;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.o0;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.components.goals.model.FirestoreGoal;
import com.theinnerhour.b2b.model.ProsAndConsModel;
import com.theinnerhour.b2b.model.ScreenResult14Model;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: ScreenResult14FragmentNew.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhr/k0;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class k0 extends rr.b {
    public static final /* synthetic */ int B = 0;
    public final LinkedHashMap A = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f18654u = LogHelper.INSTANCE.makeLogTag(k0.class);

    /* renamed from: v  reason: collision with root package name */
    public final androidx.lifecycle.m0 f18655v = kotlin.jvm.internal.b0.j(this, kotlin.jvm.internal.y.a(fm.a.class), new d(this), new e(this), new f(this));

    /* renamed from: w  reason: collision with root package name */
    public int f18656w;

    /* renamed from: x  reason: collision with root package name */
    public int f18657x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f18658y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f18659z;

    /* compiled from: ScreenResult14FragmentNew.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.l<hs.f<? extends Boolean, ? extends FirestoreGoal>, hs.k> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ TemplateActivity f18660u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ String f18661v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ fm.a f18662w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ String f18663x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ ScreenResult14Model f18664y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ k0 f18665z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(TemplateActivity templateActivity, String str, fm.a aVar, String str2, ScreenResult14Model screenResult14Model, k0 k0Var) {
            super(1);
            this.f18660u = templateActivity;
            this.f18661v = str;
            this.f18662w = aVar;
            this.f18663x = str2;
            this.f18664y = screenResult14Model;
            this.f18665z = k0Var;
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
            k0 k0Var = this.f18665z;
            TemplateActivity templateActivity = this.f18660u;
            if (firestoreGoal != null) {
                boolean z10 = templateActivity.K;
                ScreenResult14Model screenResult14Model = this.f18664y;
                String str2 = this.f18663x;
                fm.a aVar = this.f18662w;
                if (z10) {
                    FirestoreGoal firestoreGoal2 = (FirestoreGoal) fVar2.f19465v;
                    if (firestoreGoal2 != null) {
                        str = firestoreGoal2.getDataTypeKey();
                    }
                    if (kotlin.jvm.internal.i.b(str, this.f18661v)) {
                        aVar.j(screenResult14Model, str2);
                        k0Var.f18659z = true;
                    }
                }
                aVar.h(screenResult14Model, str2);
                templateActivity.K = true;
                k0Var.f18658y = true;
            } else {
                templateActivity.K0(false);
                androidx.fragment.app.p activity = k0Var.getActivity();
                kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                ((TemplateActivity) activity).t0();
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: ScreenResult14FragmentNew.kt */
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.l<Boolean, hs.k> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ TemplateActivity f18667v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(TemplateActivity templateActivity) {
            super(1);
            this.f18667v = templateActivity;
        }

        @Override // ss.l
        public final hs.k invoke(Boolean bool) {
            if (bool != null) {
                k0 k0Var = k0.this;
                if (k0Var.f18659z) {
                    this.f18667v.K0(false);
                    k0Var.f18659z = false;
                    androidx.fragment.app.p activity = k0Var.getActivity();
                    kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                    ((TemplateActivity) activity).t0();
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: ScreenResult14FragmentNew.kt */
    /* loaded from: classes2.dex */
    public static final class c extends kotlin.jvm.internal.k implements ss.l<Boolean, hs.k> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ TemplateActivity f18669v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(TemplateActivity templateActivity) {
            super(1);
            this.f18669v = templateActivity;
        }

        @Override // ss.l
        public final hs.k invoke(Boolean bool) {
            if (bool != null) {
                k0 k0Var = k0.this;
                if (k0Var.f18658y) {
                    this.f18669v.K0(false);
                    k0Var.f18658y = false;
                    androidx.fragment.app.p activity = k0Var.getActivity();
                    kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                    ((TemplateActivity) activity).t0();
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class d extends kotlin.jvm.internal.k implements ss.a<androidx.lifecycle.q0> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f18670u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f18670u = fragment;
        }

        @Override // ss.a
        public final androidx.lifecycle.q0 invoke() {
            return defpackage.e.m(this.f18670u, "requireActivity().viewModelStore");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class e extends kotlin.jvm.internal.k implements ss.a<k1.a> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f18671u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f18671u = fragment;
        }

        @Override // ss.a
        public final k1.a invoke() {
            return defpackage.b.r(this.f18671u, "requireActivity().defaultViewModelCreationExtras");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class f extends kotlin.jvm.internal.k implements ss.a<o0.b> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f18672u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Fragment fragment) {
            super(0);
            this.f18672u = fragment;
        }

        @Override // ss.a
        public final o0.b invoke() {
            return pl.a.e(this.f18672u, "requireActivity().defaultViewModelProviderFactory");
        }
    }

    public final View J(int i6, String str) {
        View inflate = getLayoutInflater().inflate(R.layout.row_pros_and_cons_result, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.prosLinearLayout)), false);
        ((TextView) inflate.findViewById(R.id.textView1)).setText(str);
        ((TextView) inflate.findViewById(R.id.textView2)).setText(String.valueOf(i6));
        return inflate;
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
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.g(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_screen_result_14, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        fm.a aVar = (fm.a) this.f18655v.getValue();
        aVar.f15174h0.k(getViewLifecycleOwner());
        aVar.f15177k0.k(getViewLifecycleOwner());
        aVar.f15178l0.k(getViewLifecycleOwner());
        aVar.f15180n0.k(getViewLifecycleOwner());
        aVar.f15181o0.k(getViewLifecycleOwner());
        aVar.f15182p0.k(getViewLifecycleOwner());
        aVar.w();
        super.onDestroyView();
        this.A.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            ((ImageView) _$_findCachedViewById(R.id.ivHelp)).setVisibility(4);
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            TemplateActivity templateActivity = (TemplateActivity) activity;
            HashMap<String, Object> A0 = templateActivity.A0();
            Object obj = templateActivity.F.get("pros-and-cons");
            kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type com.theinnerhour.b2b.model.ScreenResult14Model");
            ScreenResult14Model screenResult14Model = (ScreenResult14Model) obj;
            this.f18657x = 0;
            this.f18656w = 0;
            if (A0.containsKey("r14_heading")) {
                Object obj2 = A0.get("r14_heading");
                kotlin.jvm.internal.i.e(obj2, "null cannot be cast to non-null type kotlin.String");
                ((RobertoTextView) _$_findCachedViewById(R.id.tvR14Header)).setText((String) obj2);
            }
            if (A0.containsKey("r14_pros_text")) {
                Object obj3 = A0.get("r14_pros_text");
                kotlin.jvm.internal.i.e(obj3, "null cannot be cast to non-null type kotlin.String");
                ((RobertoTextView) _$_findCachedViewById(R.id.tvR14ProsText)).setText((String) obj3);
            }
            if (A0.containsKey("r14_cons_text")) {
                Object obj4 = A0.get("r14_cons_text");
                kotlin.jvm.internal.i.e(obj4, "null cannot be cast to non-null type kotlin.String");
                ((RobertoTextView) _$_findCachedViewById(R.id.tvR14ConsText)).setText((String) obj4);
            }
            if (A0.containsKey("r14_btn_one_text")) {
                Object obj5 = A0.get("r14_btn_one_text");
                kotlin.jvm.internal.i.e(obj5, "null cannot be cast to non-null type kotlin.String");
                ((RobertoButton) _$_findCachedViewById(R.id.btnR14ButtonOne)).setText((String) obj5);
            }
            if (A0.containsKey("r14_btn_two_text")) {
                Object obj6 = A0.get("r14_btn_two_text");
                kotlin.jvm.internal.i.e(obj6, "null cannot be cast to non-null type kotlin.String");
                ((RobertoButton) _$_findCachedViewById(R.id.btnR14ButtonTwo)).setText((String) obj6);
            }
            if (!screenResult14Model.getPros().isEmpty()) {
                Iterator<ProsAndConsModel> it = screenResult14Model.getPros().iterator();
                while (it.hasNext()) {
                    ProsAndConsModel next = it.next();
                    this.f18657x += next.getValue();
                    ((LinearLayout) _$_findCachedViewById(R.id.prosLinearLayout)).addView(J(next.getValue(), next.getText()));
                }
                ((RobertoTextView) _$_findCachedViewById(R.id.tvR14ProsCountText)).setText(String.valueOf(this.f18657x));
            } else {
                ((RobertoTextView) _$_findCachedViewById(R.id.tvR14ProsCountText)).setText("0");
            }
            if (!screenResult14Model.getCons().isEmpty()) {
                Iterator<ProsAndConsModel> it2 = screenResult14Model.getCons().iterator();
                while (it2.hasNext()) {
                    ProsAndConsModel next2 = it2.next();
                    this.f18656w += next2.getValue();
                    ((LinearLayout) _$_findCachedViewById(R.id.consLinearLayout)).addView(J(next2.getValue(), next2.getText()));
                }
                ((RobertoTextView) _$_findCachedViewById(R.id.tvR14ConsCountText)).setText(String.valueOf(this.f18656w));
            } else {
                ((RobertoTextView) _$_findCachedViewById(R.id.tvR14ConsCountText)).setText("0");
            }
            ((RobertoTextView) _$_findCachedViewById(R.id.textView13)).setText(screenResult14Model.getStatement());
            int i6 = this.f18657x;
            int i10 = this.f18656w;
            if (i6 > i10) {
                Object obj7 = A0.get("r14_pros_more_text");
                kotlin.jvm.internal.i.e(obj7, "null cannot be cast to non-null type kotlin.String");
                ((RobertoTextView) _$_findCachedViewById(R.id.textView14)).setText((String) obj7);
            } else if (i10 > i6) {
                Object obj8 = A0.get("r14_cons_more_text");
                kotlin.jvm.internal.i.e(obj8, "null cannot be cast to non-null type kotlin.String");
                ((RobertoTextView) _$_findCachedViewById(R.id.textView14)).setText((String) obj8);
            } else {
                Object obj9 = A0.get("r14_similar_text");
                kotlin.jvm.internal.i.e(obj9, "null cannot be cast to non-null type kotlin.String");
                ((RobertoTextView) _$_findCachedViewById(R.id.textView14)).setText((String) obj9);
            }
            ((RobertoButton) _$_findCachedViewById(R.id.btnR14ButtonTwo)).setOnClickListener(new tk.q((Object) templateActivity, (Object) this, (Object) "result_14", (Object) screenResult14Model, 14));
            ((RobertoButton) _$_findCachedViewById(R.id.btnR14ButtonOne)).setOnClickListener(new c0(templateActivity, 4));
            ((ImageView) _$_findCachedViewById(R.id.ivHelp)).setVisibility(8);
            ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setVisibility(0);
            ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setOnClickListener(new qq.n(this, 25));
            ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new c0(templateActivity, 5));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f18654u, "Exception in on view created", e10);
        }
    }
}
