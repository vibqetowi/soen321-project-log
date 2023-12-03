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
import com.theinnerhour.b2b.model.ScreenResult8Model;
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
/* compiled from: ScreenResult8FragmentNew.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhr/b4;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class b4 extends rr.b {

    /* renamed from: z  reason: collision with root package name */
    public static final /* synthetic */ int f18187z = 0;

    /* renamed from: v  reason: collision with root package name */
    public TemplateActivity f18189v;

    /* renamed from: x  reason: collision with root package name */
    public boolean f18191x;

    /* renamed from: y  reason: collision with root package name */
    public final LinkedHashMap f18192y = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f18188u = LogHelper.INSTANCE.makeLogTag(b4.class);

    /* renamed from: w  reason: collision with root package name */
    public final androidx.lifecycle.m0 f18190w = kotlin.jvm.internal.b0.j(this, kotlin.jvm.internal.y.a(fm.a.class), new c(this), new d(this), new e(this));

    /* compiled from: ScreenResult8FragmentNew.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.l<hs.f<? extends Boolean, ? extends FirestoreGoal>, hs.k> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ fm.a f18194v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ String f18195w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(fm.a aVar, String str) {
            super(1);
            this.f18194v = aVar;
            this.f18195w = str;
        }

        @Override // ss.l
        public final hs.k invoke(hs.f<? extends Boolean, ? extends FirestoreGoal> fVar) {
            hs.f<? extends Boolean, ? extends FirestoreGoal> fVar2 = fVar;
            if (fVar2 != null) {
                b4 b4Var = b4.this;
                TemplateActivity templateActivity = b4Var.f18189v;
                String str = null;
                if (templateActivity != null) {
                    boolean z10 = templateActivity.J;
                    boolean z11 = true;
                    String str2 = this.f18195w;
                    B b10 = fVar2.f19465v;
                    if (!z10 && !templateActivity.I) {
                        if (b10 == 0) {
                            z11 = false;
                        }
                        b4.J(b4Var, str2, z11, new ScreenResult8Model(Utils.INSTANCE.getTimeInSeconds()));
                    } else {
                        FirestoreGoal firestoreGoal = (FirestoreGoal) b10;
                        if (firestoreGoal != null) {
                            str = firestoreGoal.getDataTypeKey();
                        }
                        if (kotlin.jvm.internal.i.b(str, "result_8")) {
                            b4Var.f18191x = true;
                            this.f18194v.o(str2, false);
                        } else {
                            b4.J(b4Var, str2, false, new ScreenResult8Model(Utils.INSTANCE.getTimeInSeconds()));
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

    /* compiled from: ScreenResult8FragmentNew.kt */
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.l<hs.f<? extends Boolean, ? extends HashMap<String, Object>>, hs.k> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ String f18197v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(1);
            this.f18197v = str;
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
                b4 b4Var = b4.this;
                if (b4Var.f18191x) {
                    b4Var.f18191x = false;
                    b4.J(b4Var, this.f18197v, true, UtilFunKt.result8MapToObject(fVar2.f19465v));
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class c extends kotlin.jvm.internal.k implements ss.a<androidx.lifecycle.q0> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f18198u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f18198u = fragment;
        }

        @Override // ss.a
        public final androidx.lifecycle.q0 invoke() {
            return defpackage.e.m(this.f18198u, "requireActivity().viewModelStore");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class d extends kotlin.jvm.internal.k implements ss.a<k1.a> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f18199u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f18199u = fragment;
        }

        @Override // ss.a
        public final k1.a invoke() {
            return defpackage.b.r(this.f18199u, "requireActivity().defaultViewModelCreationExtras");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class e extends kotlin.jvm.internal.k implements ss.a<o0.b> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f18200u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f18200u = fragment;
        }

        @Override // ss.a
        public final o0.b invoke() {
            return pl.a.e(this.f18200u, "requireActivity().defaultViewModelProviderFactory");
        }
    }

    public static final void J(b4 b4Var, String str, boolean z10, ScreenResult8Model screenResult8Model) {
        Object obj;
        Object obj2;
        String str2;
        String str3;
        String str4;
        b4Var.getClass();
        kotlin.jvm.internal.u uVar = new kotlin.jvm.internal.u();
        TemplateActivity templateActivity = b4Var.f18189v;
        if (templateActivity != null) {
            if (!templateActivity.J && !templateActivity.I) {
                uVar.f23466u = true;
                ArrayList k10 = ca.a.k("Hu1zjaK518AGX6p1uNyw", "TVjSoqFdOrM0CE0YU1ja", "pIjSaq3mFoJJuwZZr1BW", "hFSM0DtKqmPlpmt7bTE4");
                TemplateActivity templateActivity2 = b4Var.f18189v;
                if (templateActivity2 != null) {
                    TemplateModel templateModel = templateActivity2.f10547y;
                    if (templateModel != null) {
                        str4 = templateModel.getLabel();
                    } else {
                        str4 = null;
                    }
                    if (!is.u.Z1(k10, str4)) {
                        TemplateActivity templateActivity3 = b4Var.f18189v;
                        if (templateActivity3 != null) {
                            Object obj3 = templateActivity3.F.get("list");
                            kotlin.jvm.internal.i.e(obj3, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                            screenResult8Model.setList((ArrayList) obj3);
                        } else {
                            kotlin.jvm.internal.i.q("act");
                            throw null;
                        }
                    } else {
                        TemplateActivity templateActivity4 = b4Var.f18189v;
                        if (templateActivity4 != null) {
                            if (templateActivity4.F.containsKey("s109_t13_list")) {
                                TemplateActivity templateActivity5 = b4Var.f18189v;
                                if (templateActivity5 != null) {
                                    Object obj4 = templateActivity5.F.get("s109_t13_list");
                                    kotlin.jvm.internal.i.e(obj4, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                                    screenResult8Model.setList((ArrayList) obj4);
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
                    TemplateActivity templateActivity6 = b4Var.f18189v;
                    if (templateActivity6 != null) {
                        if (templateActivity6.F.containsKey("userAdded")) {
                            TemplateActivity templateActivity7 = b4Var.f18189v;
                            if (templateActivity7 != null) {
                                Object obj5 = templateActivity7.F.get("userAdded");
                                kotlin.jvm.internal.i.e(obj5, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                                screenResult8Model.setUserAdded((ArrayList) obj5);
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
            } else if (z10) {
                ArrayList k11 = ca.a.k("Hu1zjaK518AGX6p1uNyw", "TVjSoqFdOrM0CE0YU1ja", "pIjSaq3mFoJJuwZZr1BW", "hFSM0DtKqmPlpmt7bTE4");
                TemplateActivity templateActivity8 = b4Var.f18189v;
                if (templateActivity8 != null) {
                    TemplateModel templateModel2 = templateActivity8.f10547y;
                    if (templateModel2 != null) {
                        str2 = templateModel2.getLabel();
                    } else {
                        str2 = null;
                    }
                    if (!is.u.Z1(k11, str2)) {
                        TemplateActivity templateActivity9 = b4Var.f18189v;
                        if (templateActivity9 != null) {
                            templateActivity9.F.put("list", screenResult8Model.getList());
                            TemplateActivity templateActivity10 = b4Var.f18189v;
                            if (templateActivity10 != null) {
                                templateActivity10.F.put("selected_list", screenResult8Model.getList());
                            } else {
                                kotlin.jvm.internal.i.q("act");
                                throw null;
                            }
                        } else {
                            kotlin.jvm.internal.i.q("act");
                            throw null;
                        }
                    }
                    ArrayList arrayList = new ArrayList();
                    arrayList.addAll(screenResult8Model.getList());
                    TemplateActivity templateActivity11 = b4Var.f18189v;
                    if (templateActivity11 != null) {
                        templateActivity11.F.put("s109_user_list", arrayList);
                    } else {
                        kotlin.jvm.internal.i.q("act");
                        throw null;
                    }
                } else {
                    kotlin.jvm.internal.i.q("act");
                    throw null;
                }
            } else {
                if (templateActivity.F.containsKey("list")) {
                    TemplateActivity templateActivity12 = b4Var.f18189v;
                    if (templateActivity12 != null) {
                        kotlin.jvm.internal.i.e(templateActivity12.F.get("list"), "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                        if (!((ArrayList) obj2).isEmpty()) {
                            TemplateActivity templateActivity13 = b4Var.f18189v;
                            if (templateActivity13 != null) {
                                Object obj6 = templateActivity13.F.get("list");
                                kotlin.jvm.internal.i.e(obj6, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                                screenResult8Model.setList((ArrayList) obj6);
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
                TemplateActivity templateActivity14 = b4Var.f18189v;
                if (templateActivity14 != null) {
                    if (templateActivity14.F.containsKey("selected_list")) {
                        TemplateActivity templateActivity15 = b4Var.f18189v;
                        if (templateActivity15 != null) {
                            kotlin.jvm.internal.i.e(templateActivity15.F.get("selected_list"), "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                            if (!((ArrayList) obj).isEmpty()) {
                                TemplateActivity templateActivity16 = b4Var.f18189v;
                                if (templateActivity16 != null) {
                                    Object obj7 = templateActivity16.F.get("selected_list");
                                    kotlin.jvm.internal.i.e(obj7, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                                    screenResult8Model.setList((ArrayList) obj7);
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
            RobertoTextView robertoTextView = (RobertoTextView) b4Var._$_findCachedViewById(R.id.result1);
            String str5 = "";
            if (screenResult8Model.getList().size() <= 0) {
                str3 = "";
            } else {
                str3 = screenResult8Model.getList().get(0);
            }
            robertoTextView.setText(str3);
            RobertoTextView robertoTextView2 = (RobertoTextView) b4Var._$_findCachedViewById(R.id.result2);
            if (screenResult8Model.getList().size() > 1) {
                str5 = screenResult8Model.getList().get(1);
            }
            robertoTextView2.setText(str5);
            if (screenResult8Model.getList().size() < 2) {
                ((ImageView) b4Var._$_findCachedViewById(R.id.imageView6)).setVisibility(8);
                b4Var._$_findCachedViewById(R.id.view3).setVisibility(8);
            }
            ((RobertoButton) b4Var._$_findCachedViewById(R.id.btnR8ButtonOne)).setOnClickListener(new dl.m0(b4Var, z10, 2));
            ((RobertoButton) b4Var._$_findCachedViewById(R.id.btnR8ButtonTwo)).setOnClickListener(new g0(z10, uVar, b4Var, str, screenResult8Model, 8));
            ((ImageView) b4Var._$_findCachedViewById(R.id.ivClose)).setOnClickListener(new a4(b4Var, 1));
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
        LinkedHashMap linkedHashMap = this.f18192y;
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
        return inflater.inflate(R.layout.fragment_screen_result_8, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        fm.a aVar = (fm.a) this.f18190w.getValue();
        aVar.f15174h0.k(getViewLifecycleOwner());
        aVar.f15177k0.k(getViewLifecycleOwner());
        aVar.f15178l0.k(getViewLifecycleOwner());
        aVar.f15180n0.k(getViewLifecycleOwner());
        aVar.f15181o0.k(getViewLifecycleOwner());
        aVar.f15182p0.k(getViewLifecycleOwner());
        aVar.w();
        super.onDestroyView();
        this.f18192y.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00f7 A[Catch: Exception -> 0x014d, TryCatch #0 {Exception -> 0x014d, blocks: (B:3:0x000c, B:6:0x0039, B:8:0x003d, B:10:0x004b, B:11:0x0058, B:12:0x005b, B:13:0x005c, B:15:0x00c1, B:17:0x00cb, B:19:0x00cf, B:25:0x00ee, B:27:0x00f7, B:29:0x00fb, B:32:0x0102, B:34:0x0145, B:35:0x0148, B:22:0x00e0, B:23:0x00e3, B:24:0x00e4, B:36:0x0149, B:37:0x014c), top: B:41:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0145 A[Catch: Exception -> 0x014d, TryCatch #0 {Exception -> 0x014d, blocks: (B:3:0x000c, B:6:0x0039, B:8:0x003d, B:10:0x004b, B:11:0x0058, B:12:0x005b, B:13:0x005c, B:15:0x00c1, B:17:0x00cb, B:19:0x00cf, B:25:0x00ee, B:27:0x00f7, B:29:0x00fb, B:32:0x0102, B:34:0x0145, B:35:0x0148, B:22:0x00e0, B:23:0x00e3, B:24:0x00e4, B:36:0x0149, B:37:0x014c), top: B:41:0x000c }] */
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
            this.f18189v = templateActivity2;
            templateActivity2.Q = false;
            HashMap<String, Object> A0 = templateActivity2.A0();
            androidx.fragment.app.p activity2 = getActivity();
            kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            if (((TemplateActivity) activity2).getIntent().hasExtra("source")) {
                TemplateActivity templateActivity3 = this.f18189v;
                if (templateActivity3 != null) {
                    if (kotlin.jvm.internal.i.b(templateActivity3.getIntent().getStringExtra("source"), "goals")) {
                        ((ImageView) _$_findCachedViewById(R.id.ivClose)).setImageResource(R.drawable.ic_wrong);
                    }
                } else {
                    kotlin.jvm.internal.i.q("act");
                    throw null;
                }
            }
            ((RobertoTextView) _$_findCachedViewById(R.id.tvR8Title)).setText(UtilFunKt.paramsMapToString(A0.get("r8_title")));
            ((RobertoTextView) _$_findCachedViewById(R.id.tvR8Heading)).setText(UtilFunKt.paramsMapToString(A0.get("r8_heading")));
            ((RobertoTextView) _$_findCachedViewById(R.id.tvR8Desc)).setText(UtilFunKt.paramsMapToString(A0.get("r8_description")));
            ((RobertoButton) _$_findCachedViewById(R.id.btnR8ButtonOne)).setText(UtilFunKt.paramsMapToString(A0.get("r8_btn_one_text")));
            RobertoButton robertoButton = (RobertoButton) _$_findCachedViewById(R.id.btnR8ButtonTwo);
            TemplateActivity templateActivity4 = this.f18189v;
            if (templateActivity4 != null) {
                if (templateActivity4.getIntent().hasExtra("source")) {
                    TemplateActivity templateActivity5 = this.f18189v;
                    if (templateActivity5 != null) {
                        if (kotlin.jvm.internal.i.b(templateActivity5.getIntent().getStringExtra("source"), "goals")) {
                            paramsMapToString = "DONE";
                            robertoButton.setText(paramsMapToString);
                            templateActivity = this.f18189v;
                            if (templateActivity == null) {
                                TemplateModel templateModel = templateActivity.f10547y;
                                if (templateModel != null && (label = templateModel.getLabel()) != null) {
                                    fm.a aVar = (fm.a) this.f18190w.getValue();
                                    aVar.f15178l0.e(getViewLifecycleOwner(), new r3(4, new a(aVar, label)));
                                    aVar.f15181o0.e(getViewLifecycleOwner(), new r3(5, new b(label)));
                                    aVar.m(label, "result_8");
                                    ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new a4(this, 0));
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
                paramsMapToString = UtilFunKt.paramsMapToString(A0.get("r8_btn_two_text"));
                robertoButton.setText(paramsMapToString);
                templateActivity = this.f18189v;
                if (templateActivity == null) {
                }
            } else {
                kotlin.jvm.internal.i.q("act");
                throw null;
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f18188u, "Exception in on view created", e10);
        }
    }
}
