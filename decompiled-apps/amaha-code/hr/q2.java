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
import com.theinnerhour.b2b.model.ScreenResult2Model;
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
/* compiled from: ScreenResult2FragmentNew.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhr/q2;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class q2 extends rr.b {

    /* renamed from: z  reason: collision with root package name */
    public static final /* synthetic */ int f18995z = 0;

    /* renamed from: w  reason: collision with root package name */
    public TemplateActivity f18998w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f18999x;

    /* renamed from: y  reason: collision with root package name */
    public final LinkedHashMap f19000y = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f18996u = LogHelper.INSTANCE.makeLogTag(q2.class);

    /* renamed from: v  reason: collision with root package name */
    public final androidx.lifecycle.m0 f18997v = kotlin.jvm.internal.b0.j(this, kotlin.jvm.internal.y.a(fm.a.class), new c(this), new d(this), new e(this));

    /* compiled from: ScreenResult2FragmentNew.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.l<hs.f<? extends Boolean, ? extends FirestoreGoal>, hs.k> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ fm.a f19002v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ String f19003w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(fm.a aVar, String str) {
            super(1);
            this.f19002v = aVar;
            this.f19003w = str;
        }

        @Override // ss.l
        public final hs.k invoke(hs.f<? extends Boolean, ? extends FirestoreGoal> fVar) {
            String str;
            hs.f<? extends Boolean, ? extends FirestoreGoal> fVar2 = fVar;
            if (fVar2 != null) {
                q2 q2Var = q2.this;
                boolean z10 = q2Var.K().J;
                boolean z11 = true;
                String str2 = this.f19003w;
                B b10 = fVar2.f19465v;
                if (z10 || q2Var.K().I) {
                    FirestoreGoal firestoreGoal = (FirestoreGoal) b10;
                    if (firestoreGoal != null) {
                        str = firestoreGoal.getDataTypeKey();
                    } else {
                        str = null;
                    }
                    if (kotlin.jvm.internal.i.b(str, "result_2")) {
                        q2Var.f18999x = true;
                        this.f19002v.o(str2, false);
                    }
                }
                if (b10 == 0) {
                    z11 = false;
                }
                q2.J(q2Var, str2, z11, new ScreenResult2Model(Utils.INSTANCE.getTimeInSeconds()));
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: ScreenResult2FragmentNew.kt */
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.l<hs.f<? extends Boolean, ? extends HashMap<String, Object>>, hs.k> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ String f19005v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(1);
            this.f19005v = str;
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
                q2 q2Var = q2.this;
                if (q2Var.f18999x) {
                    q2Var.f18999x = false;
                    q2.J(q2Var, this.f19005v, true, UtilFunKt.result2MapToObject(fVar2.f19465v));
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class c extends kotlin.jvm.internal.k implements ss.a<androidx.lifecycle.q0> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f19006u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f19006u = fragment;
        }

        @Override // ss.a
        public final androidx.lifecycle.q0 invoke() {
            return defpackage.e.m(this.f19006u, "requireActivity().viewModelStore");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class d extends kotlin.jvm.internal.k implements ss.a<k1.a> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f19007u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f19007u = fragment;
        }

        @Override // ss.a
        public final k1.a invoke() {
            return defpackage.b.r(this.f19007u, "requireActivity().defaultViewModelCreationExtras");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class e extends kotlin.jvm.internal.k implements ss.a<o0.b> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f19008u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f19008u = fragment;
        }

        @Override // ss.a
        public final o0.b invoke() {
            return pl.a.e(this.f19008u, "requireActivity().defaultViewModelProviderFactory");
        }
    }

    public static final void J(q2 q2Var, String str, boolean z10, ScreenResult2Model screenResult2Model) {
        q2Var.getClass();
        kotlin.jvm.internal.u uVar = new kotlin.jvm.internal.u();
        if (!q2Var.K().J && !q2Var.K().I) {
            uVar.f23466u = true;
            Object obj = q2Var.K().F.get("list");
            kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
            screenResult2Model.setList((ArrayList) obj);
            if (q2Var.K().F.containsKey("userAdded")) {
                Object obj2 = q2Var.K().F.get("userAdded");
                kotlin.jvm.internal.i.e(obj2, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                screenResult2Model.setUserAdded((ArrayList) obj2);
            }
        } else {
            q2Var.K().F.put("list", screenResult2Model.getList());
            q2Var.K().F.put("userAdded", screenResult2Model.getUserAdded());
        }
        ((LinearLayout) q2Var._$_findCachedViewById(R.id.ll_list)).removeAllViews();
        Iterator<String> it = screenResult2Model.getList().iterator();
        while (it.hasNext()) {
            View inflate = q2Var.getLayoutInflater().inflate(R.layout.row_result2, (ViewGroup) ((LinearLayout) q2Var._$_findCachedViewById(R.id.ll_list)), false);
            ((RobertoTextView) inflate.findViewById(R.id.textView)).setText(it.next());
            ((LinearLayout) q2Var._$_findCachedViewById(R.id.ll_list)).addView(inflate);
        }
        ((RobertoButton) q2Var._$_findCachedViewById(R.id.button)).setOnClickListener(new g0(z10, uVar, q2Var, str, screenResult2Model, 4));
        ((RobertoButton) q2Var._$_findCachedViewById(R.id.button1)).setOnClickListener(new p2(q2Var, 1));
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

    public final TemplateActivity K() {
        TemplateActivity templateActivity = this.f18998w;
        if (templateActivity != null) {
            return templateActivity;
        }
        kotlin.jvm.internal.i.q("act");
        throw null;
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f19000y;
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
        return inflater.inflate(R.layout.fragment_screen_result_2, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        fm.a aVar = (fm.a) this.f18997v.getValue();
        aVar.f15174h0.k(getViewLifecycleOwner());
        aVar.f15177k0.k(getViewLifecycleOwner());
        aVar.f15178l0.k(getViewLifecycleOwner());
        aVar.f15180n0.k(getViewLifecycleOwner());
        aVar.f15181o0.k(getViewLifecycleOwner());
        aVar.f15182p0.k(getViewLifecycleOwner());
        aVar.w();
        super.onDestroyView();
        this.f19000y.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String paramsMapToString;
        String label;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            this.f18998w = (TemplateActivity) activity;
            K().Q = false;
            ((ImageView) _$_findCachedViewById(R.id.ivClose)).setImageResource(R.drawable.ic_wrong);
            HashMap<String, Object> A0 = K().A0();
            ((RobertoTextView) _$_findCachedViewById(R.id.text_2)).setText(UtilFunKt.paramsMapToString(A0.get("r2_heading")));
            ((RobertoTextView) _$_findCachedViewById(R.id.text_1)).setText(UtilFunKt.paramsMapToString(A0.get("r2_title")));
            ((RobertoTextView) _$_findCachedViewById(R.id.text_3)).setText(UtilFunKt.paramsMapToString(A0.get("r2_description")));
            ((RobertoButton) _$_findCachedViewById(R.id.button1)).setText(UtilFunKt.paramsMapToString(A0.get("r2_btn_one_text")));
            RobertoButton robertoButton = (RobertoButton) _$_findCachedViewById(R.id.button);
            if (K().getIntent().hasExtra("source") && kotlin.jvm.internal.i.b(K().getIntent().getStringExtra("source"), "goals")) {
                paramsMapToString = "DONE";
            } else {
                paramsMapToString = UtilFunKt.paramsMapToString(A0.get("r2_btn_two_text"));
            }
            robertoButton.setText(paramsMapToString);
            TemplateModel templateModel = K().f10547y;
            if (templateModel != null && (label = templateModel.getLabel()) != null) {
                fm.a aVar = (fm.a) this.f18997v.getValue();
                aVar.f15178l0.e(getViewLifecycleOwner(), new a2(8, new a(aVar, label)));
                aVar.f15181o0.e(getViewLifecycleOwner(), new a2(9, new b(label)));
                aVar.m(label, "result_2");
                ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new p2(this, 0));
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f18996u, "exception in on view created", e10);
        }
    }
}
