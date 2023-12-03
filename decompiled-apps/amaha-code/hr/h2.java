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
import com.theinnerhour.b2b.model.ScreenResult26Model;
import com.theinnerhour.b2b.model.TemplateModel;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UtilFunKt;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
/* compiled from: ScreenResult26FragmentNew.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhr/h2;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class h2 extends rr.b {
    public static final /* synthetic */ int A = 0;

    /* renamed from: v  reason: collision with root package name */
    public TemplateActivity f18500v;

    /* renamed from: x  reason: collision with root package name */
    public boolean f18502x;

    /* renamed from: z  reason: collision with root package name */
    public final LinkedHashMap f18504z = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f18499u = LogHelper.INSTANCE.makeLogTag(h2.class);

    /* renamed from: w  reason: collision with root package name */
    public final androidx.lifecycle.m0 f18501w = kotlin.jvm.internal.b0.j(this, kotlin.jvm.internal.y.a(fm.a.class), new c(this), new d(this), new e(this));

    /* renamed from: y  reason: collision with root package name */
    public final String f18503y = "result_26";

    /* compiled from: ScreenResult26FragmentNew.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.l<hs.f<? extends Boolean, ? extends FirestoreGoal>, hs.k> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ fm.a f18506v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ String f18507w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(fm.a aVar, String str) {
            super(1);
            this.f18506v = aVar;
            this.f18507w = str;
        }

        @Override // ss.l
        public final hs.k invoke(hs.f<? extends Boolean, ? extends FirestoreGoal> fVar) {
            hs.f<? extends Boolean, ? extends FirestoreGoal> fVar2 = fVar;
            if (fVar2 != null) {
                h2 h2Var = h2.this;
                TemplateActivity templateActivity = h2Var.f18500v;
                if (templateActivity != null) {
                    boolean z10 = templateActivity.J;
                    boolean z11 = false;
                    String str = this.f18507w;
                    if (!z10 && !templateActivity.I) {
                        if (fVar2.f19465v != 0) {
                            z11 = true;
                        }
                        h2.J(h2Var, str, z11, new ScreenResult26Model(Utils.INSTANCE.getTimeInSeconds()));
                    } else {
                        h2Var.f18502x = true;
                        this.f18506v.o(str, false);
                    }
                } else {
                    kotlin.jvm.internal.i.q("act");
                    throw null;
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: ScreenResult26FragmentNew.kt */
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.l<hs.f<? extends Boolean, ? extends HashMap<String, Object>>, hs.k> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ String f18509v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(1);
            this.f18509v = str;
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
                h2 h2Var = h2.this;
                if (h2Var.f18502x) {
                    h2Var.f18502x = false;
                    h2.J(h2Var, this.f18509v, true, UtilFunKt.result26MapToObject(fVar2.f19465v));
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class c extends kotlin.jvm.internal.k implements ss.a<androidx.lifecycle.q0> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f18510u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f18510u = fragment;
        }

        @Override // ss.a
        public final androidx.lifecycle.q0 invoke() {
            return defpackage.e.m(this.f18510u, "requireActivity().viewModelStore");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class d extends kotlin.jvm.internal.k implements ss.a<k1.a> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f18511u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f18511u = fragment;
        }

        @Override // ss.a
        public final k1.a invoke() {
            return defpackage.b.r(this.f18511u, "requireActivity().defaultViewModelCreationExtras");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class e extends kotlin.jvm.internal.k implements ss.a<o0.b> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f18512u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f18512u = fragment;
        }

        @Override // ss.a
        public final o0.b invoke() {
            return pl.a.e(this.f18512u, "requireActivity().defaultViewModelProviderFactory");
        }
    }

    public static final void J(h2 h2Var, String str, boolean z10, ScreenResult26Model screenResult26Model) {
        TemplateActivity templateActivity;
        String paramsMapToString;
        h2Var.getClass();
        kotlin.jvm.internal.u uVar = new kotlin.jvm.internal.u();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:mm a");
        TemplateActivity templateActivity2 = h2Var.f18500v;
        if (templateActivity2 != null) {
            HashMap<String, Object> A0 = templateActivity2.A0();
            Calendar calendar = Calendar.getInstance();
            Calendar calendar2 = Calendar.getInstance();
            try {
                templateActivity = h2Var.f18500v;
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(h2Var.f18499u, "exception in reading list from firebase", e10);
            }
            if (templateActivity != null) {
                if (!templateActivity.J && !templateActivity.I) {
                    uVar.f23466u = true;
                    Object obj = templateActivity.F.get("sleep_time");
                    kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type java.util.Calendar");
                    Calendar calendar3 = (Calendar) obj;
                    TemplateActivity templateActivity3 = h2Var.f18500v;
                    if (templateActivity3 != null) {
                        Object obj2 = templateActivity3.F.get("wake_up_time");
                        kotlin.jvm.internal.i.e(obj2, "null cannot be cast to non-null type java.util.Calendar");
                        Calendar calendar4 = (Calendar) obj2;
                        TemplateActivity templateActivity4 = h2Var.f18500v;
                        if (templateActivity4 != null) {
                            Object obj3 = templateActivity4.F.get("age");
                            kotlin.jvm.internal.i.e(obj3, "null cannot be cast to non-null type kotlin.String");
                            int parseInt = Integer.parseInt((String) obj3);
                            int hours = UtilFunKt.getHours(parseInt);
                            if (calendar4.getTimeInMillis() < calendar3.getTimeInMillis()) {
                                calendar4.add(5, 1);
                            }
                            double d10 = 2;
                            double rint = Math.rint((TimeUnit.MINUTES.convert(calendar4.getTimeInMillis() - calendar3.getTimeInMillis(), TimeUnit.MILLISECONDS) / 60.0d) * d10) / d10;
                            screenResult26Model.setAge(Integer.valueOf(parseInt));
                            screenResult26Model.setSleepTime(simpleDateFormat.format(calendar3.getTime()));
                            screenResult26Model.setWakeUpTime(simpleDateFormat.format(calendar4.getTime()));
                            double d11 = hours;
                            double d12 = rint - d11;
                            if (d12 > 0.0d) {
                                paramsMapToString = gv.n.F0(UtilFunKt.paramsMapToString(A0.get("r26_decrease_sleep_text")), "%replace_time%", String.valueOf(d12));
                            } else if (d12 < 0.0d) {
                                paramsMapToString = gv.n.F0(UtilFunKt.paramsMapToString(A0.get("r26_increase_sleep_text")), "%replace_time%", String.valueOf(d11 - rint));
                            } else {
                                paramsMapToString = UtilFunKt.paramsMapToString(A0.get("r26_maintain_sleep_text"));
                            }
                            screenResult26Model.setText(paramsMapToString);
                            ((RobertoTextView) h2Var._$_findCachedViewById(R.id.result1)).setText(screenResult26Model.getText());
                            ((RobertoButton) h2Var._$_findCachedViewById(R.id.btnR26ButtonTwo)).setOnClickListener(new g0(z10, uVar, h2Var, str, screenResult26Model, 3));
                            return;
                        }
                        kotlin.jvm.internal.i.q("act");
                        throw null;
                    }
                    kotlin.jvm.internal.i.q("act");
                    throw null;
                }
                uVar.f23466u = false;
                if (z10) {
                    calendar.setTimeInMillis(simpleDateFormat.parse(screenResult26Model.getSleepTime()).getTime());
                    calendar2.setTimeInMillis(simpleDateFormat.parse(screenResult26Model.getWakeUpTime()).getTime());
                    TemplateActivity templateActivity5 = h2Var.f18500v;
                    if (templateActivity5 != null) {
                        templateActivity5.F.put("sleep_time", calendar);
                        TemplateActivity templateActivity6 = h2Var.f18500v;
                        if (templateActivity6 != null) {
                            templateActivity6.F.put("wake_up_time", calendar2);
                            TemplateActivity templateActivity7 = h2Var.f18500v;
                            if (templateActivity7 != null) {
                                templateActivity7.F.put("age", String.valueOf(screenResult26Model.getAge()));
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
                }
                ((RobertoTextView) h2Var._$_findCachedViewById(R.id.result1)).setText(screenResult26Model.getText());
                ((RobertoButton) h2Var._$_findCachedViewById(R.id.btnR26ButtonTwo)).setOnClickListener(new g0(z10, uVar, h2Var, str, screenResult26Model, 3));
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

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f18504z;
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
        return inflater.inflate(R.layout.fragment_screen_result_26, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        fm.a aVar = (fm.a) this.f18501w.getValue();
        aVar.f15174h0.k(getViewLifecycleOwner());
        aVar.f15177k0.k(getViewLifecycleOwner());
        aVar.f15178l0.k(getViewLifecycleOwner());
        aVar.f15180n0.k(getViewLifecycleOwner());
        aVar.f15181o0.k(getViewLifecycleOwner());
        aVar.f15182p0.k(getViewLifecycleOwner());
        aVar.w();
        super.onDestroyView();
        this.f18504z.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00f5 A[Catch: Exception -> 0x015c, TryCatch #0 {Exception -> 0x015c, blocks: (B:3:0x000c, B:6:0x0039, B:8:0x003d, B:10:0x004b, B:11:0x0058, B:12:0x005b, B:13:0x005c, B:15:0x00c1, B:17:0x00cb, B:19:0x00cf, B:25:0x00ee, B:27:0x00f5, B:29:0x00f9, B:32:0x0100, B:34:0x0154, B:35:0x0157, B:22:0x00e0, B:23:0x00e3, B:24:0x00e4, B:36:0x0158, B:37:0x015b), top: B:41:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0154 A[Catch: Exception -> 0x015c, TryCatch #0 {Exception -> 0x015c, blocks: (B:3:0x000c, B:6:0x0039, B:8:0x003d, B:10:0x004b, B:11:0x0058, B:12:0x005b, B:13:0x005c, B:15:0x00c1, B:17:0x00cb, B:19:0x00cf, B:25:0x00ee, B:27:0x00f5, B:29:0x00f9, B:32:0x0100, B:34:0x0154, B:35:0x0157, B:22:0x00e0, B:23:0x00e3, B:24:0x00e4, B:36:0x0158, B:37:0x015b), top: B:41:0x000c }] */
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
            this.f18500v = templateActivity2;
            templateActivity2.Q = false;
            HashMap<String, Object> A0 = templateActivity2.A0();
            androidx.fragment.app.p activity2 = getActivity();
            kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            if (((TemplateActivity) activity2).getIntent().hasExtra("source")) {
                TemplateActivity templateActivity3 = this.f18500v;
                if (templateActivity3 != null) {
                    if (kotlin.jvm.internal.i.b(templateActivity3.getIntent().getStringExtra("source"), "goals")) {
                        ((ImageView) _$_findCachedViewById(R.id.ivClose)).setImageResource(R.drawable.ic_wrong);
                    }
                } else {
                    kotlin.jvm.internal.i.q("act");
                    throw null;
                }
            }
            ((RobertoTextView) _$_findCachedViewById(R.id.tvR26Title)).setText(UtilFunKt.paramsMapToString(A0.get("r26_title")));
            ((RobertoTextView) _$_findCachedViewById(R.id.tvR26Heading)).setText(UtilFunKt.paramsMapToString(A0.get("r26_heading")));
            ((RobertoTextView) _$_findCachedViewById(R.id.tvR26Desc)).setText(UtilFunKt.paramsMapToString(A0.get("r26_description")));
            ((RobertoButton) _$_findCachedViewById(R.id.btnR26ButtonOne)).setText(UtilFunKt.paramsMapToString(A0.get("r26_btn_one_text1")));
            RobertoButton robertoButton = (RobertoButton) _$_findCachedViewById(R.id.btnR26ButtonTwo);
            TemplateActivity templateActivity4 = this.f18500v;
            if (templateActivity4 != null) {
                if (templateActivity4.getIntent().hasExtra("source")) {
                    TemplateActivity templateActivity5 = this.f18500v;
                    if (templateActivity5 != null) {
                        if (kotlin.jvm.internal.i.b(templateActivity5.getIntent().getStringExtra("source"), "goals")) {
                            paramsMapToString = "DONE";
                            robertoButton.setText(paramsMapToString);
                            templateActivity = this.f18500v;
                            if (templateActivity == null) {
                                TemplateModel templateModel = templateActivity.f10547y;
                                if (templateModel != null && (label = templateModel.getLabel()) != null) {
                                    fm.a aVar = (fm.a) this.f18501w.getValue();
                                    aVar.f15178l0.e(getViewLifecycleOwner(), new a2(2, new a(aVar, label)));
                                    aVar.f15181o0.e(getViewLifecycleOwner(), new a2(3, new b(label)));
                                    aVar.m(label, this.f18503y);
                                    ((RobertoButton) _$_findCachedViewById(R.id.btnR26ButtonOne)).setOnClickListener(new View.OnClickListener(this) { // from class: hr.g2

                                        /* renamed from: v  reason: collision with root package name */
                                        public final /* synthetic */ h2 f18435v;

                                        {
                                            this.f18435v = this;
                                        }

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view2) {
                                            int i6 = r2;
                                            h2 this$0 = this.f18435v;
                                            switch (i6) {
                                                case 0:
                                                    int i10 = h2.A;
                                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                                    androidx.fragment.app.p activity3 = this$0.getActivity();
                                                    kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                                    ((TemplateActivity) activity3).I = false;
                                                    androidx.fragment.app.p activity4 = this$0.getActivity();
                                                    kotlin.jvm.internal.i.e(activity4, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                                    ((TemplateActivity) activity4).R = true;
                                                    androidx.fragment.app.p activity5 = this$0.getActivity();
                                                    kotlin.jvm.internal.i.e(activity5, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                                    ((TemplateActivity) activity5).onBackPressed();
                                                    androidx.fragment.app.p activity6 = this$0.getActivity();
                                                    kotlin.jvm.internal.i.e(activity6, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                                    ((TemplateActivity) activity6).onBackPressed();
                                                    androidx.fragment.app.p activity7 = this$0.getActivity();
                                                    kotlin.jvm.internal.i.e(activity7, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                                    ((TemplateActivity) activity7).onBackPressed();
                                                    androidx.fragment.app.p activity8 = this$0.getActivity();
                                                    kotlin.jvm.internal.i.e(activity8, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                                    ((TemplateActivity) activity8).onBackPressed();
                                                    return;
                                                default:
                                                    int i11 = h2.A;
                                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                                    TemplateActivity templateActivity6 = this$0.f18500v;
                                                    if (templateActivity6 != null) {
                                                        templateActivity6.o0();
                                                        return;
                                                    } else {
                                                        kotlin.jvm.internal.i.q("act");
                                                        throw null;
                                                    }
                                            }
                                        }
                                    });
                                    ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new View.OnClickListener(this) { // from class: hr.g2

                                        /* renamed from: v  reason: collision with root package name */
                                        public final /* synthetic */ h2 f18435v;

                                        {
                                            this.f18435v = this;
                                        }

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view2) {
                                            int i6 = r2;
                                            h2 this$0 = this.f18435v;
                                            switch (i6) {
                                                case 0:
                                                    int i10 = h2.A;
                                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                                    androidx.fragment.app.p activity3 = this$0.getActivity();
                                                    kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                                    ((TemplateActivity) activity3).I = false;
                                                    androidx.fragment.app.p activity4 = this$0.getActivity();
                                                    kotlin.jvm.internal.i.e(activity4, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                                    ((TemplateActivity) activity4).R = true;
                                                    androidx.fragment.app.p activity5 = this$0.getActivity();
                                                    kotlin.jvm.internal.i.e(activity5, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                                    ((TemplateActivity) activity5).onBackPressed();
                                                    androidx.fragment.app.p activity6 = this$0.getActivity();
                                                    kotlin.jvm.internal.i.e(activity6, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                                    ((TemplateActivity) activity6).onBackPressed();
                                                    androidx.fragment.app.p activity7 = this$0.getActivity();
                                                    kotlin.jvm.internal.i.e(activity7, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                                    ((TemplateActivity) activity7).onBackPressed();
                                                    androidx.fragment.app.p activity8 = this$0.getActivity();
                                                    kotlin.jvm.internal.i.e(activity8, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                                    ((TemplateActivity) activity8).onBackPressed();
                                                    return;
                                                default:
                                                    int i11 = h2.A;
                                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                                    TemplateActivity templateActivity6 = this$0.f18500v;
                                                    if (templateActivity6 != null) {
                                                        templateActivity6.o0();
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
                    } else {
                        kotlin.jvm.internal.i.q("act");
                        throw null;
                    }
                }
                paramsMapToString = UtilFunKt.paramsMapToString(A0.get("r26_btn_two_text"));
                robertoButton.setText(paramsMapToString);
                templateActivity = this.f18500v;
                if (templateActivity == null) {
                }
            } else {
                kotlin.jvm.internal.i.q("act");
                throw null;
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f18499u, "exception", e10);
        }
    }
}
