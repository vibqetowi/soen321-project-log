package hr;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.o0;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.components.goals.model.FirestoreGoal;
import com.theinnerhour.b2b.model.ScreenResult16Model;
import com.theinnerhour.b2b.model.TemplateModel;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UtilFunKt;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: ScreenResult16FragmentNew.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhr/s0;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class s0 extends rr.b {

    /* renamed from: y  reason: collision with root package name */
    public static final /* synthetic */ int f19111y = 0;

    /* renamed from: v  reason: collision with root package name */
    public TemplateActivity f19113v;

    /* renamed from: x  reason: collision with root package name */
    public final LinkedHashMap f19115x = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f19112u = LogHelper.INSTANCE.makeLogTag(s0.class);

    /* renamed from: w  reason: collision with root package name */
    public final androidx.lifecycle.m0 f19114w = kotlin.jvm.internal.b0.j(this, kotlin.jvm.internal.y.a(fm.a.class), new c(this), new d(this), new e(this));

    /* compiled from: ScreenResult16FragmentNew.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.l<hs.f<? extends Boolean, ? extends FirestoreGoal>, hs.k> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.x<ScreenResult16Model> f19117v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ String f19118w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ fm.a f19119x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(kotlin.jvm.internal.x xVar, String str, fm.a aVar) {
            super(1);
            this.f19117v = xVar;
            this.f19118w = str;
            this.f19119x = aVar;
        }

        /* JADX WARN: Type inference failed for: r1v14, types: [T, com.theinnerhour.b2b.model.ScreenResult16Model] */
        /* JADX WARN: Type inference failed for: r1v19, types: [T, com.theinnerhour.b2b.model.ScreenResult16Model] */
        @Override // ss.l
        public final hs.k invoke(hs.f<? extends Boolean, ? extends FirestoreGoal> fVar) {
            String str;
            hs.f<? extends Boolean, ? extends FirestoreGoal> fVar2 = fVar;
            if (fVar2 != null) {
                s0 s0Var = s0.this;
                TemplateActivity templateActivity = s0Var.f19113v;
                if (templateActivity != null) {
                    boolean b10 = kotlin.jvm.internal.i.b(templateActivity.F.get("log"), Boolean.TRUE);
                    boolean z10 = true;
                    String str2 = this.f19118w;
                    kotlin.jvm.internal.x<ScreenResult16Model> xVar = this.f19117v;
                    B b11 = fVar2.f19465v;
                    if (b10) {
                        TemplateActivity templateActivity2 = s0Var.f19113v;
                        if (templateActivity2 != null) {
                            Object obj = templateActivity2.F.get("data");
                            kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type com.theinnerhour.b2b.model.ScreenResult16Model");
                            ?? r12 = (ScreenResult16Model) obj;
                            xVar.f23469u = r12;
                            if (b11 == 0) {
                                z10 = false;
                            }
                            s0.J(s0Var, str2, z10, r12);
                        } else {
                            kotlin.jvm.internal.i.q("act");
                            throw null;
                        }
                    } else {
                        TemplateActivity templateActivity3 = s0Var.f19113v;
                        if (templateActivity3 != null) {
                            if (templateActivity3.J || templateActivity3.I) {
                                FirestoreGoal firestoreGoal = (FirestoreGoal) b11;
                                if (firestoreGoal != null) {
                                    str = firestoreGoal.getDataTypeKey();
                                } else {
                                    str = null;
                                }
                                if (kotlin.jvm.internal.i.b(str, "result_16")) {
                                    this.f19119x.o(str2, false);
                                }
                            }
                            TemplateActivity templateActivity4 = s0Var.f19113v;
                            if (templateActivity4 != null) {
                                Object obj2 = templateActivity4.F.get("model-16");
                                kotlin.jvm.internal.i.e(obj2, "null cannot be cast to non-null type com.theinnerhour.b2b.model.ScreenResult16Model");
                                ?? r13 = (ScreenResult16Model) obj2;
                                xVar.f23469u = r13;
                                if (b11 == 0) {
                                    z10 = false;
                                }
                                s0.J(s0Var, str2, z10, r13);
                            } else {
                                kotlin.jvm.internal.i.q("act");
                                throw null;
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
            return hs.k.f19476a;
        }
    }

    /* compiled from: ScreenResult16FragmentNew.kt */
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.l<hs.f<? extends Boolean, ? extends HashMap<String, Object>>, hs.k> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.x<ScreenResult16Model> f19120u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ s0 f19121v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ String f19122w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(kotlin.jvm.internal.x<ScreenResult16Model> xVar, s0 s0Var, String str) {
            super(1);
            this.f19120u = xVar;
            this.f19121v = s0Var;
            this.f19122w = str;
        }

        /* JADX WARN: Type inference failed for: r4v8, types: [T, com.theinnerhour.b2b.model.ScreenResult16Model] */
        @Override // ss.l
        public final hs.k invoke(hs.f<? extends Boolean, ? extends HashMap<String, Object>> fVar) {
            boolean z10;
            ?? r42;
            hs.f<? extends Boolean, ? extends HashMap<String, Object>> fVar2 = fVar;
            if (fVar2 != null && ((Boolean) fVar2.f19464u).booleanValue()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && (r42 = (ScreenResult16Model) is.u.i2(UtilFunKt.result16MapToObject(ca.a.k((HashMap) fVar2.f19465v)))) != 0) {
                this.f19120u.f23469u = r42;
                s0.J(this.f19121v, this.f19122w, true, r42);
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class c extends kotlin.jvm.internal.k implements ss.a<androidx.lifecycle.q0> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f19123u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f19123u = fragment;
        }

        @Override // ss.a
        public final androidx.lifecycle.q0 invoke() {
            return defpackage.e.m(this.f19123u, "requireActivity().viewModelStore");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class d extends kotlin.jvm.internal.k implements ss.a<k1.a> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f19124u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f19124u = fragment;
        }

        @Override // ss.a
        public final k1.a invoke() {
            return defpackage.b.r(this.f19124u, "requireActivity().defaultViewModelCreationExtras");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class e extends kotlin.jvm.internal.k implements ss.a<o0.b> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f19125u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f19125u = fragment;
        }

        @Override // ss.a
        public final o0.b invoke() {
            return pl.a.e(this.f19125u, "requireActivity().defaultViewModelProviderFactory");
        }
    }

    public static final void J(s0 s0Var, String str, boolean z10, ScreenResult16Model screenResult16Model) {
        ((RobertoButton) s0Var._$_findCachedViewById(R.id.button2)).setOnClickListener(new zk.k(z10, (Object) s0Var, str, (Serializable) screenResult16Model, 6));
        TemplateActivity templateActivity = s0Var.f19113v;
        if (templateActivity != null) {
            if (kotlin.jvm.internal.i.b(templateActivity.F.get("log"), Boolean.TRUE)) {
                TemplateActivity templateActivity2 = s0Var.f19113v;
                if (templateActivity2 != null) {
                    templateActivity2.F.put("log", Boolean.FALSE);
                    ((RobertoTextView) s0Var._$_findCachedViewById(R.id.textView6)).setText(screenResult16Model.getText());
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:mm a");
                    Calendar calendar = Calendar.getInstance();
                    long j10 = 1000;
                    calendar.setTimeInMillis(screenResult16Model.getFromTime() * j10);
                    Calendar calendar2 = Calendar.getInstance();
                    calendar2.setTimeInMillis(screenResult16Model.getTillTime() * j10);
                    ((RobertoTextView) s0Var._$_findCachedViewById(R.id.textView4)).setText(simpleDateFormat.format(calendar.getTime()) + " to " + simpleDateFormat.format(calendar2.getTime()));
                    Iterator<String> it = screenResult16Model.getList().iterator();
                    while (it.hasNext()) {
                        View inflate = s0Var.getLayoutInflater().inflate(R.layout.row_single_text, (ViewGroup) ((LinearLayout) s0Var._$_findCachedViewById(R.id.linearLayout)), false);
                        kotlin.jvm.internal.i.e(inflate, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
                        View view = (ConstraintLayout) inflate;
                        ((RobertoTextView) view.findViewById(R.id.tvSingleLine)).setText(it.next());
                        ViewGroup.LayoutParams layoutParams = ((RobertoTextView) view.findViewById(R.id.tvSingleLine)).getLayoutParams();
                        kotlin.jvm.internal.i.e(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                        ConstraintLayout.a aVar = (ConstraintLayout.a) layoutParams;
                        aVar.setMargins(0, 0, 0, 16);
                        ((RobertoTextView) view.findViewById(R.id.tvSingleLine)).setLayoutParams(aVar);
                        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                        kotlin.jvm.internal.i.e(layoutParams2, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) layoutParams2;
                        layoutParams3.setMargins(0, 0, 0, 0);
                        view.setLayoutParams(layoutParams3);
                        ((LinearLayout) s0Var._$_findCachedViewById(R.id.linearLayout)).addView(view);
                    }
                    ((ImageView) s0Var._$_findCachedViewById(R.id.ivHelp)).setVisibility(8);
                    ((ImageView) s0Var._$_findCachedViewById(R.id.ivEllipses)).setVisibility(8);
                    ((ImageView) s0Var._$_findCachedViewById(R.id.ivClose)).setOnClickListener(new r0(s0Var, 3));
                    ((RobertoButton) s0Var._$_findCachedViewById(R.id.button1)).setVisibility(8);
                    ((RobertoButton) s0Var._$_findCachedViewById(R.id.button2)).setVisibility(8);
                    return;
                }
                kotlin.jvm.internal.i.q("act");
                throw null;
            }
            TemplateActivity templateActivity3 = s0Var.f19113v;
            if (templateActivity3 != null) {
                if (!templateActivity3.J && !templateActivity3.I) {
                    ((RobertoTextView) s0Var._$_findCachedViewById(R.id.textView6)).setText(screenResult16Model.getText());
                    Calendar calendar3 = Calendar.getInstance();
                    long j11 = 1000;
                    calendar3.setTimeInMillis(screenResult16Model.getFromTime() * j11);
                    Calendar calendar4 = Calendar.getInstance();
                    calendar4.setTimeInMillis(screenResult16Model.getTillTime() * j11);
                    SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("hh:mm a");
                    ((RobertoTextView) s0Var._$_findCachedViewById(R.id.textView4)).setText(simpleDateFormat2.format(calendar3.getTime()) + " to " + simpleDateFormat2.format(calendar4.getTime()));
                    Iterator<String> it2 = screenResult16Model.getList().iterator();
                    while (it2.hasNext()) {
                        View inflate2 = s0Var.getLayoutInflater().inflate(R.layout.row_single_text, (ViewGroup) ((LinearLayout) s0Var._$_findCachedViewById(R.id.linearLayout)), false);
                        kotlin.jvm.internal.i.e(inflate2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
                        View view2 = (ConstraintLayout) inflate2;
                        ((RobertoTextView) view2.findViewById(R.id.tvSingleLine)).setText(it2.next());
                        ViewGroup.LayoutParams layoutParams4 = ((RobertoTextView) view2.findViewById(R.id.tvSingleLine)).getLayoutParams();
                        kotlin.jvm.internal.i.e(layoutParams4, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                        ConstraintLayout.a aVar2 = (ConstraintLayout.a) layoutParams4;
                        aVar2.setMargins(0, 0, 0, 16);
                        ((RobertoTextView) view2.findViewById(R.id.tvSingleLine)).setLayoutParams(aVar2);
                        ViewGroup.LayoutParams layoutParams5 = view2.getLayoutParams();
                        kotlin.jvm.internal.i.e(layoutParams5, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                        LinearLayout.LayoutParams layoutParams6 = (LinearLayout.LayoutParams) layoutParams5;
                        layoutParams6.setMargins(0, 0, 0, 0);
                        view2.setLayoutParams(layoutParams6);
                        ((LinearLayout) s0Var._$_findCachedViewById(R.id.linearLayout)).addView(view2);
                    }
                    return;
                }
                ((RobertoTextView) s0Var._$_findCachedViewById(R.id.textView6)).setText(screenResult16Model.getText());
                Calendar calendar5 = Calendar.getInstance();
                long j12 = 1000;
                calendar5.setTimeInMillis(screenResult16Model.getFromTime() * j12);
                Calendar calendar6 = Calendar.getInstance();
                calendar6.setTimeInMillis(screenResult16Model.getTillTime() * j12);
                SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat("hh:mm a");
                ((RobertoTextView) s0Var._$_findCachedViewById(R.id.textView4)).setText(simpleDateFormat3.format(calendar5.getTime()) + " to " + simpleDateFormat3.format(calendar6.getTime()));
                Iterator<String> it3 = screenResult16Model.getList().iterator();
                while (it3.hasNext()) {
                    View inflate3 = s0Var.getLayoutInflater().inflate(R.layout.row_single_text, (ViewGroup) ((LinearLayout) s0Var._$_findCachedViewById(R.id.linearLayout)), false);
                    kotlin.jvm.internal.i.e(inflate3, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
                    View view3 = (ConstraintLayout) inflate3;
                    ((RobertoTextView) view3.findViewById(R.id.tvSingleLine)).setText(it3.next());
                    ViewGroup.LayoutParams layoutParams7 = ((RobertoTextView) view3.findViewById(R.id.tvSingleLine)).getLayoutParams();
                    kotlin.jvm.internal.i.e(layoutParams7, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                    ConstraintLayout.a aVar3 = (ConstraintLayout.a) layoutParams7;
                    aVar3.setMargins(0, 0, 0, 16);
                    ((RobertoTextView) view3.findViewById(R.id.tvSingleLine)).setLayoutParams(aVar3);
                    ViewGroup.LayoutParams layoutParams8 = view3.getLayoutParams();
                    kotlin.jvm.internal.i.e(layoutParams8, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                    LinearLayout.LayoutParams layoutParams9 = (LinearLayout.LayoutParams) layoutParams8;
                    layoutParams9.setMargins(0, 0, 0, 0);
                    view3.setLayoutParams(layoutParams9);
                    ((LinearLayout) s0Var._$_findCachedViewById(R.id.linearLayout)).addView(view3);
                }
                ((ImageView) s0Var._$_findCachedViewById(R.id.ivEllipses)).setVisibility(0);
                ((ImageView) s0Var._$_findCachedViewById(R.id.ivEllipses)).setOnClickListener(new r0(s0Var, 4));
                ((ImageView) s0Var._$_findCachedViewById(R.id.ivHelp)).setVisibility(8);
                ((ImageView) s0Var._$_findCachedViewById(R.id.ivClose)).setOnClickListener(new r0(s0Var, 5));
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

    public final void K() {
        androidx.appcompat.widget.a1 a1Var = new androidx.appcompat.widget.a1(requireContext(), (ImageView) _$_findCachedViewById(R.id.ivEllipses));
        a1Var.a().inflate(R.menu.logs_menu, a1Var.f1344b);
        a1Var.f1346d = new fq.s(this, 8);
        a1Var.b();
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f19115x;
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
        return inflater.inflate(R.layout.fragment_screen_result_16, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        fm.a aVar = (fm.a) this.f19114w.getValue();
        aVar.f15174h0.k(getViewLifecycleOwner());
        aVar.f15177k0.k(getViewLifecycleOwner());
        aVar.f15178l0.k(getViewLifecycleOwner());
        aVar.f15180n0.k(getViewLifecycleOwner());
        aVar.f15181o0.k(getViewLifecycleOwner());
        aVar.f15182p0.k(getViewLifecycleOwner());
        aVar.w();
        super.onDestroyView();
        this.f19115x.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0189 A[Catch: Exception -> 0x01d1, TryCatch #0 {Exception -> 0x01d1, blocks: (B:3:0x000c, B:6:0x003b, B:8:0x003f, B:10:0x004d, B:11:0x005a, B:12:0x005d, B:13:0x005e, B:15:0x010f, B:17:0x0119, B:19:0x011d, B:25:0x013c, B:27:0x0189, B:29:0x018d, B:32:0x0194, B:34:0x01c9, B:35:0x01cc, B:22:0x012e, B:23:0x0131, B:24:0x0132, B:36:0x01cd, B:37:0x01d0), top: B:41:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01c9 A[Catch: Exception -> 0x01d1, TryCatch #0 {Exception -> 0x01d1, blocks: (B:3:0x000c, B:6:0x003b, B:8:0x003f, B:10:0x004d, B:11:0x005a, B:12:0x005d, B:13:0x005e, B:15:0x010f, B:17:0x0119, B:19:0x011d, B:25:0x013c, B:27:0x0189, B:29:0x018d, B:32:0x0194, B:34:0x01c9, B:35:0x01cc, B:22:0x012e, B:23:0x0131, B:24:0x0132, B:36:0x01cd, B:37:0x01d0), top: B:41:0x000c }] */
    /* JADX WARN: Type inference failed for: r3v6, types: [T, com.theinnerhour.b2b.model.ScreenResult16Model] */
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
            this.f19113v = templateActivity2;
            templateActivity2.Q = false;
            HashMap<String, Object> A0 = templateActivity2.A0();
            androidx.fragment.app.p activity2 = getActivity();
            kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            if (((TemplateActivity) activity2).getIntent().hasExtra("source")) {
                TemplateActivity templateActivity3 = this.f19113v;
                if (templateActivity3 != null) {
                    if (kotlin.jvm.internal.i.b(templateActivity3.getIntent().getStringExtra("source"), "goals")) {
                        ((ImageView) _$_findCachedViewById(R.id.ivClose)).setImageResource(R.drawable.ic_wrong);
                    }
                } else {
                    kotlin.jvm.internal.i.q("act");
                    throw null;
                }
            }
            androidx.fragment.app.p activity3 = getActivity();
            kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            ((TemplateActivity) activity3).y0();
            kotlin.jvm.internal.x xVar = new kotlin.jvm.internal.x();
            xVar.f23469u = new ScreenResult16Model(Utils.INSTANCE.getTimeInSeconds(), "");
            ((RobertoTextView) _$_findCachedViewById(R.id.textView1)).setText(UtilFunKt.paramsMapToString(A0.get("r16_heading")));
            ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText(UtilFunKt.paramsMapToString(A0.get("r16_description")));
            ((RobertoTextView) _$_findCachedViewById(R.id.textView7)).setText(UtilFunKt.paramsMapToString(A0.get("r16_first_label")));
            ((RobertoTextView) _$_findCachedViewById(R.id.textView3)).setText(UtilFunKt.paramsMapToString(A0.get("r16_second_label")));
            ((RobertoTextView) _$_findCachedViewById(R.id.textView5)).setText(UtilFunKt.paramsMapToString(A0.get("r16_third_label")));
            ((RobertoButton) _$_findCachedViewById(R.id.button1)).setText(UtilFunKt.paramsMapToString(A0.get("r16_btn_one_text")));
            RobertoButton robertoButton = (RobertoButton) _$_findCachedViewById(R.id.button2);
            TemplateActivity templateActivity4 = this.f19113v;
            if (templateActivity4 != null) {
                if (templateActivity4.getIntent().hasExtra("source")) {
                    TemplateActivity templateActivity5 = this.f19113v;
                    if (templateActivity5 != null) {
                        if (kotlin.jvm.internal.i.b(templateActivity5.getIntent().getStringExtra("source"), "goals")) {
                            paramsMapToString = "DONE";
                            robertoButton.setText(paramsMapToString);
                            ((RobertoButton) _$_findCachedViewById(R.id.button1)).setOnClickListener(new r0(this, 0));
                            ((ImageView) _$_findCachedViewById(R.id.ivHelp)).setVisibility(8);
                            ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setVisibility(0);
                            ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setOnClickListener(new r0(this, 1));
                            ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new r0(this, 2));
                            templateActivity = this.f19113v;
                            if (templateActivity == null) {
                                TemplateModel templateModel = templateActivity.f10547y;
                                if (templateModel != null && (label = templateModel.getLabel()) != null) {
                                    fm.a aVar = (fm.a) this.f19114w.getValue();
                                    aVar.f15178l0.e(getViewLifecycleOwner(), new m0(3, new a(xVar, label, aVar)));
                                    aVar.f15181o0.e(getViewLifecycleOwner(), new m0(4, new b(xVar, this, label)));
                                    aVar.m(label, "result_16");
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
                paramsMapToString = UtilFunKt.paramsMapToString(A0.get("r16_btn_two_text"));
                robertoButton.setText(paramsMapToString);
                ((RobertoButton) _$_findCachedViewById(R.id.button1)).setOnClickListener(new r0(this, 0));
                ((ImageView) _$_findCachedViewById(R.id.ivHelp)).setVisibility(8);
                ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setVisibility(0);
                ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setOnClickListener(new r0(this, 1));
                ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new r0(this, 2));
                templateActivity = this.f19113v;
                if (templateActivity == null) {
                }
            } else {
                kotlin.jvm.internal.i.q("act");
                throw null;
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f19112u, "Exception in on view created", e10);
        }
    }
}
