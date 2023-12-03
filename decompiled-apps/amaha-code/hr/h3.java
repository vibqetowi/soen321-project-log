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
import com.theinnerhour.b2b.model.ScreenResult4Model;
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
/* compiled from: ScreenResult4FragmentNew.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhr/h3;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class h3 extends rr.b {

    /* renamed from: z  reason: collision with root package name */
    public static final /* synthetic */ int f18513z = 0;

    /* renamed from: w  reason: collision with root package name */
    public TemplateActivity f18516w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f18517x;

    /* renamed from: y  reason: collision with root package name */
    public final LinkedHashMap f18518y = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f18514u = LogHelper.INSTANCE.makeLogTag(h3.class);

    /* renamed from: v  reason: collision with root package name */
    public final androidx.lifecycle.m0 f18515v = kotlin.jvm.internal.b0.j(this, kotlin.jvm.internal.y.a(fm.a.class), new c(this), new d(this), new e(this));

    /* compiled from: ScreenResult4FragmentNew.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.l<hs.f<? extends Boolean, ? extends FirestoreGoal>, hs.k> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ fm.a f18520v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ String f18521w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ ScreenResult4Model f18522x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(fm.a aVar, String str, ScreenResult4Model screenResult4Model) {
            super(1);
            this.f18520v = aVar;
            this.f18521w = str;
            this.f18522x = screenResult4Model;
        }

        @Override // ss.l
        public final hs.k invoke(hs.f<? extends Boolean, ? extends FirestoreGoal> fVar) {
            hs.f<? extends Boolean, ? extends FirestoreGoal> fVar2 = fVar;
            if (fVar2 != null) {
                h3 h3Var = h3.this;
                TemplateActivity templateActivity = h3Var.f18516w;
                String str = null;
                if (templateActivity != null) {
                    boolean b10 = kotlin.jvm.internal.i.b(templateActivity.F.get("log"), Boolean.TRUE);
                    boolean z10 = true;
                    String str2 = this.f18521w;
                    B b11 = fVar2.f19465v;
                    if (!b10) {
                        TemplateActivity templateActivity2 = h3Var.f18516w;
                        if (templateActivity2 != null) {
                            if ((templateActivity2.J && !templateActivity2.S) || templateActivity2.I) {
                                FirestoreGoal firestoreGoal = (FirestoreGoal) b11;
                                if (firestoreGoal != null) {
                                    str = firestoreGoal.getDataTypeKey();
                                }
                                if (kotlin.jvm.internal.i.b(str, "result_4")) {
                                    h3Var.f18517x = true;
                                    this.f18520v.o(str2, false);
                                }
                            }
                        } else {
                            kotlin.jvm.internal.i.q("act");
                            throw null;
                        }
                    }
                    if (b11 == 0) {
                        z10 = false;
                    }
                    h3.J(h3Var, str2, this.f18522x, z10);
                } else {
                    kotlin.jvm.internal.i.q("act");
                    throw null;
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: ScreenResult4FragmentNew.kt */
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.l<hs.f<? extends Boolean, ? extends HashMap<String, Object>>, hs.k> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ String f18524v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(1);
            this.f18524v = str;
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
                h3 h3Var = h3.this;
                if (h3Var.f18517x) {
                    h3Var.f18517x = false;
                    h3.J(h3Var, this.f18524v, UtilFunKt.result4MapToObject(fVar2.f19465v), true);
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class c extends kotlin.jvm.internal.k implements ss.a<androidx.lifecycle.q0> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f18525u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f18525u = fragment;
        }

        @Override // ss.a
        public final androidx.lifecycle.q0 invoke() {
            return defpackage.e.m(this.f18525u, "requireActivity().viewModelStore");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class d extends kotlin.jvm.internal.k implements ss.a<k1.a> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f18526u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f18526u = fragment;
        }

        @Override // ss.a
        public final k1.a invoke() {
            return defpackage.b.r(this.f18526u, "requireActivity().defaultViewModelCreationExtras");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class e extends kotlin.jvm.internal.k implements ss.a<o0.b> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f18527u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f18527u = fragment;
        }

        @Override // ss.a
        public final o0.b invoke() {
            return pl.a.e(this.f18527u, "requireActivity().defaultViewModelProviderFactory");
        }
    }

    public static final void J(h3 h3Var, String str, ScreenResult4Model screenResult4Model, boolean z10) {
        h3Var.getClass();
        kotlin.jvm.internal.u uVar = new kotlin.jvm.internal.u();
        TemplateActivity templateActivity = h3Var.f18516w;
        if (templateActivity != null) {
            if (kotlin.jvm.internal.i.b(templateActivity.F.get("log"), Boolean.TRUE)) {
                TemplateActivity templateActivity2 = h3Var.f18516w;
                if (templateActivity2 != null) {
                    templateActivity2.F.put("log", Boolean.FALSE);
                    ((ImageView) h3Var._$_findCachedViewById(R.id.ivClose)).setImageResource(R.drawable.ic_arrow_back);
                    ((ImageView) h3Var._$_findCachedViewById(R.id.ivEllipses)).setVisibility(8);
                    ((RobertoButton) h3Var._$_findCachedViewById(R.id.button1)).setVisibility(8);
                    ((RobertoButton) h3Var._$_findCachedViewById(R.id.button2)).setVisibility(8);
                    ((ImageView) h3Var._$_findCachedViewById(R.id.ivEllipses)).setVisibility(8);
                    ((ImageView) h3Var._$_findCachedViewById(R.id.ivHelp)).setVisibility(8);
                    ((ImageView) h3Var._$_findCachedViewById(R.id.ivClose)).setOnClickListener(new g3(h3Var, 1));
                } else {
                    kotlin.jvm.internal.i.q("act");
                    throw null;
                }
            } else {
                TemplateActivity templateActivity3 = h3Var.f18516w;
                if (templateActivity3 != null) {
                    boolean z11 = templateActivity3.J;
                    HashMap<String, Object> hashMap = templateActivity3.F;
                    if ((z11 && !templateActivity3.S) || templateActivity3.I) {
                        hashMap.put("list", ca.a.k(screenResult4Model.getText()));
                        TemplateActivity templateActivity4 = h3Var.f18516w;
                        if (templateActivity4 != null) {
                            HashMap<String, Object> hashMap2 = templateActivity4.F;
                            String text = screenResult4Model.getText();
                            kotlin.jvm.internal.i.e(text, "null cannot be cast to non-null type kotlin.String");
                            hashMap2.put("s18_user_data", text);
                        } else {
                            kotlin.jvm.internal.i.q("act");
                            throw null;
                        }
                    } else {
                        templateActivity3.S = true;
                        uVar.f23466u = true;
                        Object obj = hashMap.get("list");
                        kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                        screenResult4Model.setText((String) ((ArrayList) obj).get(0));
                    }
                } else {
                    kotlin.jvm.internal.i.q("act");
                    throw null;
                }
            }
            ((RobertoTextView) h3Var._$_findCachedViewById(R.id.textView3)).setText(screenResult4Model.getText());
            ((RobertoButton) h3Var._$_findCachedViewById(R.id.button1)).setOnClickListener(new g3(h3Var, 2));
            ((RobertoButton) h3Var._$_findCachedViewById(R.id.button2)).setOnClickListener(new g0(z10, uVar, h3Var, str, screenResult4Model, 6));
            ((ImageView) h3Var._$_findCachedViewById(R.id.ivClose)).setOnClickListener(new g3(h3Var, 3));
            return;
        }
        kotlin.jvm.internal.i.q("act");
        throw null;
    }

    @Override // rr.b
    public final boolean I() {
        TemplateActivity templateActivity;
        boolean z10;
        TemplateActivity templateActivity2;
        boolean z11;
        Intent intent;
        TemplateActivity templateActivity3 = this.f18516w;
        TemplateActivity templateActivity4 = null;
        if (templateActivity3 != null) {
            if (kotlin.jvm.internal.i.b(templateActivity3.F.get("log_back"), Boolean.TRUE)) {
                TemplateActivity templateActivity5 = this.f18516w;
                if (templateActivity5 != null) {
                    androidx.fragment.app.y yVar = templateActivity5.B;
                    kotlin.jvm.internal.i.d(yVar);
                    yVar.W();
                    return false;
                }
                kotlin.jvm.internal.i.q("act");
                throw null;
            }
            androidx.fragment.app.p activity = getActivity();
            if (activity instanceof TemplateActivity) {
                templateActivity = (TemplateActivity) activity;
            } else {
                templateActivity = null;
            }
            if (templateActivity != null && (intent = templateActivity.getIntent()) != null && intent.hasExtra("source")) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                TemplateActivity templateActivity6 = this.f18516w;
                if (templateActivity6 != null) {
                    if (r1.b0.c(templateActivity6, "source", "goals")) {
                        androidx.fragment.app.p activity2 = getActivity();
                        if (activity2 instanceof TemplateActivity) {
                            templateActivity2 = (TemplateActivity) activity2;
                        } else {
                            templateActivity2 = null;
                        }
                        if (templateActivity2 != null && !templateActivity2.R) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z11) {
                            androidx.fragment.app.p activity3 = getActivity();
                            kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                            ((TemplateActivity) activity3).o0();
                            return false;
                        }
                    }
                } else {
                    kotlin.jvm.internal.i.q("act");
                    throw null;
                }
            }
            androidx.fragment.app.p activity4 = getActivity();
            if (activity4 instanceof TemplateActivity) {
                templateActivity4 = (TemplateActivity) activity4;
            }
            if (templateActivity4 != null) {
                templateActivity4.R = false;
            }
            return true;
        }
        kotlin.jvm.internal.i.q("act");
        throw null;
    }

    public final fm.a K() {
        return (fm.a) this.f18515v.getValue();
    }

    public final void M() {
        TemplateActivity templateActivity = this.f18516w;
        if (templateActivity != null) {
            templateActivity.K0(false);
            TemplateActivity templateActivity2 = this.f18516w;
            if (templateActivity2 != null) {
                if (templateActivity2.getIntent().hasExtra("source")) {
                    TemplateActivity templateActivity3 = this.f18516w;
                    if (templateActivity3 != null) {
                        if (r1.b0.c(templateActivity3, "source", "goals")) {
                            TemplateActivity templateActivity4 = this.f18516w;
                            if (templateActivity4 != null) {
                                templateActivity4.n0();
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
                }
                TemplateActivity templateActivity5 = this.f18516w;
                if (templateActivity5 != null) {
                    templateActivity5.t0();
                    return;
                } else {
                    kotlin.jvm.internal.i.q("act");
                    throw null;
                }
            }
            kotlin.jvm.internal.i.q("act");
            throw null;
        }
        kotlin.jvm.internal.i.q("act");
        throw null;
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f18518y;
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
        return inflater.inflate(R.layout.fragment_screen_result_4, viewGroup, false);
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
        this.f18518y.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0129 A[Catch: Exception -> 0x01b0, TryCatch #0 {Exception -> 0x01b0, blocks: (B:3:0x000c, B:6:0x0032, B:8:0x0036, B:10:0x0044, B:11:0x0054, B:12:0x0057, B:13:0x0058, B:15:0x005c, B:17:0x00cd, B:19:0x00d7, B:21:0x00db, B:27:0x00fa, B:29:0x0129, B:31:0x0139, B:33:0x013d, B:37:0x015c, B:39:0x0160, B:41:0x0164, B:44:0x016b, B:46:0x01a0, B:47:0x01a3, B:34:0x014d, B:35:0x0150, B:36:0x0151, B:48:0x01a4, B:49:0x01a7, B:24:0x00ec, B:25:0x00ef, B:26:0x00f0, B:50:0x01a8, B:51:0x01ab, B:52:0x01ac, B:53:0x01af), top: B:57:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01a4 A[Catch: Exception -> 0x01b0, TryCatch #0 {Exception -> 0x01b0, blocks: (B:3:0x000c, B:6:0x0032, B:8:0x0036, B:10:0x0044, B:11:0x0054, B:12:0x0057, B:13:0x0058, B:15:0x005c, B:17:0x00cd, B:19:0x00d7, B:21:0x00db, B:27:0x00fa, B:29:0x0129, B:31:0x0139, B:33:0x013d, B:37:0x015c, B:39:0x0160, B:41:0x0164, B:44:0x016b, B:46:0x01a0, B:47:0x01a3, B:34:0x014d, B:35:0x0150, B:36:0x0151, B:48:0x01a4, B:49:0x01a7, B:24:0x00ec, B:25:0x00ef, B:26:0x00f0, B:50:0x01a8, B:51:0x01ab, B:52:0x01ac, B:53:0x01af), top: B:57:0x000c }] */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onViewCreated(View view, Bundle bundle) {
        String paramsMapToString;
        TemplateActivity templateActivity;
        ScreenResult4Model screenResult4Model;
        String label;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            TemplateActivity templateActivity2 = (TemplateActivity) activity;
            this.f18516w = templateActivity2;
            templateActivity2.Q = false;
            androidx.fragment.app.p activity2 = getActivity();
            kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            if (((TemplateActivity) activity2).getIntent().hasExtra("source")) {
                TemplateActivity templateActivity3 = this.f18516w;
                if (templateActivity3 != null) {
                    if (kotlin.jvm.internal.i.b(templateActivity3.getIntent().getStringExtra("source"), "goals")) {
                        ((ImageView) _$_findCachedViewById(R.id.ivClose)).setImageResource(R.drawable.ic_wrong);
                    }
                } else {
                    kotlin.jvm.internal.i.q("act");
                    throw null;
                }
            }
            TemplateActivity templateActivity4 = this.f18516w;
            if (templateActivity4 != null) {
                HashMap<String, Object> A0 = templateActivity4.A0();
                ((RobertoTextView) _$_findCachedViewById(R.id.textView1)).setText(gv.r.i1(UtilFunKt.paramsMapToString(A0.get("r4_heading"))).toString());
                ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText(UtilFunKt.paramsMapToString(A0.get("r4_sub_heading")));
                ((RobertoTextView) _$_findCachedViewById(R.id.textView4)).setText(UtilFunKt.paramsMapToString(A0.get("r4_description")));
                ((RobertoButton) _$_findCachedViewById(R.id.button1)).setText(UtilFunKt.paramsMapToString(A0.get("r4_btn_one_text")));
                RobertoButton robertoButton = (RobertoButton) _$_findCachedViewById(R.id.button2);
                TemplateActivity templateActivity5 = this.f18516w;
                if (templateActivity5 != null) {
                    if (templateActivity5.getIntent().hasExtra("source")) {
                        TemplateActivity templateActivity6 = this.f18516w;
                        if (templateActivity6 != null) {
                            if (kotlin.jvm.internal.i.b(templateActivity6.getIntent().getStringExtra("source"), "goals")) {
                                paramsMapToString = "DONE";
                                robertoButton.setText(paramsMapToString);
                                ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setVisibility(0);
                                ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setOnClickListener(new g3(this, 0));
                                ((ImageView) _$_findCachedViewById(R.id.ivHelp)).setVisibility(8);
                                templateActivity = this.f18516w;
                                if (templateActivity == null) {
                                    if (kotlin.jvm.internal.i.b(templateActivity.F.get("log"), Boolean.TRUE)) {
                                        TemplateActivity templateActivity7 = this.f18516w;
                                        if (templateActivity7 != null) {
                                            Object obj = templateActivity7.F.get("data");
                                            kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type com.theinnerhour.b2b.model.ScreenResult4Model");
                                            screenResult4Model = (ScreenResult4Model) obj;
                                        } else {
                                            kotlin.jvm.internal.i.q("act");
                                            throw null;
                                        }
                                    } else {
                                        screenResult4Model = new ScreenResult4Model(Utils.INSTANCE.getTimeInSeconds());
                                    }
                                    TemplateActivity templateActivity8 = this.f18516w;
                                    if (templateActivity8 != null) {
                                        TemplateModel templateModel = templateActivity8.f10547y;
                                        if (templateModel != null && (label = templateModel.getLabel()) != null) {
                                            fm.a K = K();
                                            K.f15178l0.e(getViewLifecycleOwner(), new a2(19, new a(K, label, screenResult4Model)));
                                            K.f15181o0.e(getViewLifecycleOwner(), new a2(20, new b(label)));
                                            K.m(label, "result_4");
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
                        } else {
                            kotlin.jvm.internal.i.q("act");
                            throw null;
                        }
                    }
                    paramsMapToString = UtilFunKt.paramsMapToString(A0.get("r4_btn_two_text"));
                    robertoButton.setText(paramsMapToString);
                    ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setVisibility(0);
                    ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setOnClickListener(new g3(this, 0));
                    ((ImageView) _$_findCachedViewById(R.id.ivHelp)).setVisibility(8);
                    templateActivity = this.f18516w;
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
            LogHelper.INSTANCE.e(this.f18514u, "Exception", e10);
        }
    }
}
