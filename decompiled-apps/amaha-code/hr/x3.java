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
import com.theinnerhour.b2b.model.ScreenResult7Model;
import com.theinnerhour.b2b.model.TemplateModel;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UtilFunKt;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: ScreenResult7FragmentNew.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhr/x3;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class x3 extends rr.b {

    /* renamed from: z  reason: collision with root package name */
    public static final /* synthetic */ int f19371z = 0;

    /* renamed from: w  reason: collision with root package name */
    public boolean f19374w;

    /* renamed from: x  reason: collision with root package name */
    public TemplateActivity f19375x;

    /* renamed from: y  reason: collision with root package name */
    public final LinkedHashMap f19376y = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f19372u = LogHelper.INSTANCE.makeLogTag(x3.class);

    /* renamed from: v  reason: collision with root package name */
    public final androidx.lifecycle.m0 f19373v = kotlin.jvm.internal.b0.j(this, kotlin.jvm.internal.y.a(fm.a.class), new c(this), new d(this), new e(this));

    /* compiled from: ScreenResult7FragmentNew.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.l<hs.f<? extends Boolean, ? extends FirestoreGoal>, hs.k> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ fm.a f19378v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ String f19379w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(fm.a aVar, String str) {
            super(1);
            this.f19378v = aVar;
            this.f19379w = str;
        }

        @Override // ss.l
        public final hs.k invoke(hs.f<? extends Boolean, ? extends FirestoreGoal> fVar) {
            hs.f<? extends Boolean, ? extends FirestoreGoal> fVar2 = fVar;
            if (fVar2 != null) {
                x3 x3Var = x3.this;
                TemplateActivity templateActivity = x3Var.f19375x;
                String str = null;
                if (templateActivity != null) {
                    boolean z10 = templateActivity.J;
                    boolean z11 = false;
                    String str2 = this.f19379w;
                    B b10 = fVar2.f19465v;
                    if (!z10 && !templateActivity.I) {
                        if (b10 != 0) {
                            z11 = true;
                        }
                        x3.J(x3Var, str2, z11, new ScreenResult7Model(Utils.INSTANCE.getTodayTimeInSeconds()));
                    } else {
                        FirestoreGoal firestoreGoal = (FirestoreGoal) b10;
                        if (firestoreGoal != null) {
                            str = firestoreGoal.getDataTypeKey();
                        }
                        if (kotlin.jvm.internal.i.b(str, "result_7")) {
                            this.f19378v.o(str2, false);
                            x3Var.f19374w = true;
                        } else {
                            x3.J(x3Var, str2, true, new ScreenResult7Model(Utils.INSTANCE.getTodayTimeInSeconds()));
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

    /* compiled from: ScreenResult7FragmentNew.kt */
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.l<hs.f<? extends Boolean, ? extends HashMap<String, Object>>, hs.k> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ String f19381v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(1);
            this.f19381v = str;
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
                x3 x3Var = x3.this;
                if (x3Var.f19374w) {
                    x3Var.f19374w = false;
                    x3.J(x3Var, this.f19381v, true, UtilFunKt.result7MapToObject(fVar2.f19465v));
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class c extends kotlin.jvm.internal.k implements ss.a<androidx.lifecycle.q0> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f19382u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f19382u = fragment;
        }

        @Override // ss.a
        public final androidx.lifecycle.q0 invoke() {
            return defpackage.e.m(this.f19382u, "requireActivity().viewModelStore");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class d extends kotlin.jvm.internal.k implements ss.a<k1.a> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f19383u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f19383u = fragment;
        }

        @Override // ss.a
        public final k1.a invoke() {
            return defpackage.b.r(this.f19383u, "requireActivity().defaultViewModelCreationExtras");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class e extends kotlin.jvm.internal.k implements ss.a<o0.b> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f19384u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f19384u = fragment;
        }

        @Override // ss.a
        public final o0.b invoke() {
            return pl.a.e(this.f19384u, "requireActivity().defaultViewModelProviderFactory");
        }
    }

    public static final void J(x3 x3Var, String str, boolean z10, ScreenResult7Model screenResult7Model) {
        x3Var.getClass();
        kotlin.jvm.internal.u uVar = new kotlin.jvm.internal.u();
        TemplateActivity templateActivity = x3Var.f19375x;
        if (templateActivity != null) {
            boolean z11 = templateActivity.J;
            HashMap<String, Object> hashMap = templateActivity.F;
            if (!z11 && !templateActivity.I) {
                uVar.f23466u = true;
                Object obj = hashMap.get("list");
                kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                screenResult7Model.setList((ArrayList) obj);
                TemplateActivity templateActivity2 = x3Var.f19375x;
                if (templateActivity2 != null) {
                    if (templateActivity2.F.containsKey("userAdded")) {
                        TemplateActivity templateActivity3 = x3Var.f19375x;
                        if (templateActivity3 != null) {
                            Object obj2 = templateActivity3.F.get("userAdded");
                            kotlin.jvm.internal.i.e(obj2, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                            screenResult7Model.setUserAdded((ArrayList) obj2);
                        } else {
                            kotlin.jvm.internal.i.q("act");
                            throw null;
                        }
                    }
                    TemplateActivity templateActivity4 = x3Var.f19375x;
                    if (templateActivity4 != null) {
                        screenResult7Model.setHeadings(UtilFunKt.paramsMapToList(templateActivity4.A0().get("r7_statement_list")));
                    } else {
                        kotlin.jvm.internal.i.q("act");
                        throw null;
                    }
                } else {
                    kotlin.jvm.internal.i.q("act");
                    throw null;
                }
            } else if (z10) {
                hashMap.put("list", screenResult7Model.getList());
                TemplateActivity templateActivity5 = x3Var.f19375x;
                if (templateActivity5 != null) {
                    templateActivity5.F.put("userAdded", screenResult7Model.getUserAdded());
                } else {
                    kotlin.jvm.internal.i.q("act");
                    throw null;
                }
            } else {
                if (hashMap.containsKey("list")) {
                    TemplateActivity templateActivity6 = x3Var.f19375x;
                    if (templateActivity6 != null) {
                        Object obj3 = templateActivity6.F.get("list");
                        kotlin.jvm.internal.i.e(obj3, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                        if (!((ArrayList) obj3).isEmpty()) {
                            TemplateActivity templateActivity7 = x3Var.f19375x;
                            if (templateActivity7 != null) {
                                Object obj4 = templateActivity7.F.get("list");
                                kotlin.jvm.internal.i.e(obj4, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                                screenResult7Model.setList((ArrayList) obj4);
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
                TemplateActivity templateActivity8 = x3Var.f19375x;
                if (templateActivity8 != null) {
                    if (templateActivity8.F.containsKey("userAdded")) {
                        TemplateActivity templateActivity9 = x3Var.f19375x;
                        if (templateActivity9 != null) {
                            Object obj5 = templateActivity9.F.get("userAdded");
                            kotlin.jvm.internal.i.e(obj5, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                            if (!((ArrayList) obj5).isEmpty()) {
                                TemplateActivity templateActivity10 = x3Var.f19375x;
                                if (templateActivity10 != null) {
                                    Object obj6 = templateActivity10.F.get("userAdded");
                                    kotlin.jvm.internal.i.e(obj6, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                                    screenResult7Model.setList((ArrayList) obj6);
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
                } else {
                    kotlin.jvm.internal.i.q("act");
                    throw null;
                }
            }
            ((RobertoTextView) x3Var._$_findCachedViewById(R.id.tvR7StmtOneDesc)).setText(screenResult7Model.getList().get(0));
            ((RobertoTextView) x3Var._$_findCachedViewById(R.id.tvR7StmtTwoDesc)).setText(screenResult7Model.getList().get(1));
            ((RobertoTextView) x3Var._$_findCachedViewById(R.id.tvR7StmtThreeDesc)).setText(screenResult7Model.getList().get(2));
            ((RobertoButton) x3Var._$_findCachedViewById(R.id.btnR7ButtonOne)).setOnClickListener(new w3(x3Var, 1));
            ((RobertoButton) x3Var._$_findCachedViewById(R.id.btnR7ButtonTwo)).setOnClickListener(new g0(z10, uVar, x3Var, str, screenResult7Model, 7));
            return;
        }
        kotlin.jvm.internal.i.q("act");
        throw null;
    }

    @Override // rr.b
    public final boolean I() {
        androidx.fragment.app.p activity = getActivity();
        kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
        TemplateActivity templateActivity = (TemplateActivity) activity;
        if (templateActivity.F.containsKey(Constants.DAYMODEL_POSITION)) {
            HashMap<String, Object> hashMap = templateActivity.F;
            Object obj = hashMap.get(Constants.DAYMODEL_POSITION);
            kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) obj).intValue();
            if (intValue > 0) {
                hashMap.put(Constants.DAYMODEL_POSITION, Integer.valueOf(intValue - 1));
            }
        }
        return true;
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f19376y;
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
        return inflater.inflate(R.layout.fragment_screen_result_7, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        fm.a aVar = (fm.a) this.f19373v.getValue();
        aVar.f15174h0.k(getViewLifecycleOwner());
        aVar.f15177k0.k(getViewLifecycleOwner());
        aVar.f15178l0.k(getViewLifecycleOwner());
        aVar.f15180n0.k(getViewLifecycleOwner());
        aVar.f15181o0.k(getViewLifecycleOwner());
        aVar.f15182p0.k(getViewLifecycleOwner());
        aVar.w();
        super.onDestroyView();
        this.f19376y.clear();
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
            this.f19375x = templateActivity;
            HashMap<String, Object> A0 = templateActivity.A0();
            TemplateActivity templateActivity2 = this.f19375x;
            if (templateActivity2 != null) {
                templateActivity2.P = false;
                if (kotlin.jvm.internal.i.b(templateActivity2.B0(), "r7")) {
                    ((RobertoTextView) _$_findCachedViewById(R.id.tvR7Heading)).setText(UtilFunKt.paramsMapToString(A0.get("r7_heading")));
                    ((RobertoTextView) _$_findCachedViewById(R.id.tvR7StmtOne)).setText(UtilFunKt.paramsMapToList(A0.get("r7_statement_list")).get(0));
                    ((RobertoTextView) _$_findCachedViewById(R.id.tvR7StmtTwo)).setText(UtilFunKt.paramsMapToList(A0.get("r7_statement_list")).get(1));
                    ((RobertoTextView) _$_findCachedViewById(R.id.tvR7StmtThree)).setText(UtilFunKt.paramsMapToList(A0.get("r7_statement_list")).get(2));
                    ((RobertoTextView) _$_findCachedViewById(R.id.tvR7Rem)).setText(UtilFunKt.paramsMapToString(A0.get("r7_remember_text")));
                    ((RobertoTextView) _$_findCachedViewById(R.id.tvR7RemDesc)).setText(UtilFunKt.paramsMapToString(A0.get("r7_remember_description")));
                    ((RobertoButton) _$_findCachedViewById(R.id.btnR7ButtonOne)).setText(UtilFunKt.paramsMapToString(A0.get("r7_btn_one_text")));
                    ((RobertoButton) _$_findCachedViewById(R.id.btnR7ButtonTwo)).setText(UtilFunKt.paramsMapToString(A0.get("r7_btn_two_text")));
                }
                TemplateActivity templateActivity3 = this.f19375x;
                if (templateActivity3 != null) {
                    TemplateModel templateModel = templateActivity3.f10547y;
                    if (templateModel != null && (label = templateModel.getLabel()) != null) {
                        fm.a aVar = (fm.a) this.f19373v.getValue();
                        aVar.f15178l0.e(getViewLifecycleOwner(), new r3(1, new a(aVar, label)));
                        aVar.f15181o0.e(getViewLifecycleOwner(), new r3(2, new b(label)));
                        aVar.m(label, "result_7");
                        ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new w3(this, 0));
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
            LogHelper.INSTANCE.e(this.f19372u, "exception on view created", e10);
        }
    }
}
