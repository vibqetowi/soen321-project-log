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
import com.theinnerhour.b2b.model.ScreenResult30Model;
import com.theinnerhour.b2b.model.TemplateModel;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UtilFunKt;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: ScreenResult30FragmentNew.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhr/v2;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class v2 extends rr.b {

    /* renamed from: y  reason: collision with root package name */
    public static final /* synthetic */ int f19274y = 0;

    /* renamed from: v  reason: collision with root package name */
    public TemplateActivity f19276v;

    /* renamed from: x  reason: collision with root package name */
    public final LinkedHashMap f19278x = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f19275u = LogHelper.INSTANCE.makeLogTag(v2.class);

    /* renamed from: w  reason: collision with root package name */
    public final androidx.lifecycle.m0 f19277w = kotlin.jvm.internal.b0.j(this, kotlin.jvm.internal.y.a(fm.a.class), new b(this), new c(this), new d(this));

    /* compiled from: ScreenResult30FragmentNew.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.l<hs.f<? extends Boolean, ? extends FirestoreGoal>, hs.k> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ String f19280v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ScreenResult30Model f19281w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, ScreenResult30Model screenResult30Model) {
            super(1);
            this.f19280v = str;
            this.f19281w = screenResult30Model;
        }

        @Override // ss.l
        public final hs.k invoke(hs.f<? extends Boolean, ? extends FirestoreGoal> fVar) {
            boolean z10;
            hs.f<? extends Boolean, ? extends FirestoreGoal> fVar2 = fVar;
            if (fVar2 != null) {
                String str = this.f19280v;
                if (fVar2.f19465v != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ScreenResult30Model screenResult30Model = this.f19281w;
                int i6 = v2.f19274y;
                v2 v2Var = v2.this;
                ((RobertoButton) v2Var._$_findCachedViewById(R.id.btnR30ButtonTwo)).setOnClickListener(new zk.k(z10, (Object) v2Var, str, (Serializable) screenResult30Model, 13));
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.a<androidx.lifecycle.q0> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f19282u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Fragment fragment) {
            super(0);
            this.f19282u = fragment;
        }

        @Override // ss.a
        public final androidx.lifecycle.q0 invoke() {
            return defpackage.e.m(this.f19282u, "requireActivity().viewModelStore");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class c extends kotlin.jvm.internal.k implements ss.a<k1.a> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f19283u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f19283u = fragment;
        }

        @Override // ss.a
        public final k1.a invoke() {
            return defpackage.b.r(this.f19283u, "requireActivity().defaultViewModelCreationExtras");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class d extends kotlin.jvm.internal.k implements ss.a<o0.b> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f19284u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f19284u = fragment;
        }

        @Override // ss.a
        public final o0.b invoke() {
            return pl.a.e(this.f19284u, "requireActivity().defaultViewModelProviderFactory");
        }
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f19278x;
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
        return inflater.inflate(R.layout.fragment_screen_result_30, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        fm.a aVar = (fm.a) this.f19277w.getValue();
        aVar.f15174h0.k(getViewLifecycleOwner());
        aVar.f15177k0.k(getViewLifecycleOwner());
        aVar.f15178l0.k(getViewLifecycleOwner());
        aVar.f15180n0.k(getViewLifecycleOwner());
        aVar.f15181o0.k(getViewLifecycleOwner());
        aVar.f15182p0.k(getViewLifecycleOwner());
        aVar.w();
        super.onDestroyView();
        this.f19278x.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x027f A[Catch: Exception -> 0x02c0, TryCatch #0 {Exception -> 0x02c0, blocks: (B:3:0x0012, B:6:0x002b, B:9:0x004d, B:11:0x0051, B:13:0x005c, B:14:0x00a4, B:16:0x00aa, B:17:0x00d8, B:18:0x011e, B:19:0x0122, B:20:0x0123, B:21:0x0127, B:22:0x0128, B:24:0x012c, B:25:0x0141, B:27:0x0147, B:28:0x0186, B:30:0x01e5, B:32:0x01ef, B:34:0x01f3, B:36:0x0201, B:38:0x0205, B:46:0x022a, B:48:0x027f, B:50:0x0283, B:53:0x028a, B:55:0x02ac, B:56:0x02b0, B:41:0x0216, B:42:0x021a, B:43:0x021b, B:44:0x021f, B:45:0x0220, B:57:0x02b1, B:58:0x02b5, B:59:0x02b6, B:60:0x02ba, B:61:0x02bb, B:62:0x02bf), top: B:66:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02ac A[Catch: Exception -> 0x02c0, TryCatch #0 {Exception -> 0x02c0, blocks: (B:3:0x0012, B:6:0x002b, B:9:0x004d, B:11:0x0051, B:13:0x005c, B:14:0x00a4, B:16:0x00aa, B:17:0x00d8, B:18:0x011e, B:19:0x0122, B:20:0x0123, B:21:0x0127, B:22:0x0128, B:24:0x012c, B:25:0x0141, B:27:0x0147, B:28:0x0186, B:30:0x01e5, B:32:0x01ef, B:34:0x01f3, B:36:0x0201, B:38:0x0205, B:46:0x022a, B:48:0x027f, B:50:0x0283, B:53:0x028a, B:55:0x02ac, B:56:0x02b0, B:41:0x0216, B:42:0x021a, B:43:0x021b, B:44:0x021f, B:45:0x0220, B:57:0x02b1, B:58:0x02b5, B:59:0x02b6, B:60:0x02ba, B:61:0x02bb, B:62:0x02bf), top: B:66:0x0012 }] */
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
            this.f19276v = templateActivity2;
            HashMap<String, Object> A0 = templateActivity2.A0();
            TemplateActivity templateActivity3 = this.f19276v;
            if (templateActivity3 != null) {
                boolean b10 = kotlin.jvm.internal.i.b(templateActivity3.F.get("log"), Boolean.TRUE);
                int i6 = R.id.linearLayout;
                if (b10) {
                    TemplateActivity templateActivity4 = this.f19276v;
                    if (templateActivity4 != null) {
                        templateActivity4.F.put("log", Boolean.FALSE);
                        TemplateActivity templateActivity5 = this.f19276v;
                        if (templateActivity5 != null) {
                            Object obj = templateActivity5.F.get("data");
                            kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type com.theinnerhour.b2b.model.ScreenResult30Model");
                            ((RobertoTextView) _$_findCachedViewById(R.id.tvR30Heading)).setText(UtilFunKt.paramsMapToString(A0.get("r30_heading")));
                            ((RobertoTextView) _$_findCachedViewById(R.id.tvR30StmtOneDesc)).setText(UtilFunKt.paramsMapToString(A0.get("r30_description")));
                            ((RobertoTextView) _$_findCachedViewById(R.id.tvR30Subheading)).setText(UtilFunKt.paramsMapToString(A0.get("r30_subheading")));
                            Iterator<String> it = ((ScreenResult30Model) obj).getList().iterator();
                            while (it.hasNext()) {
                                View inflate = getLayoutInflater().inflate(R.layout.row_result_30, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.linearLayout)), false);
                                ((RobertoTextView) inflate.findViewById(R.id.text2)).setText(it.next());
                                ((LinearLayout) _$_findCachedViewById(R.id.linearLayout)).addView(inflate);
                            }
                            ((RobertoButton) _$_findCachedViewById(R.id.btnR30ButtonOne)).setVisibility(8);
                            ((RobertoButton) _$_findCachedViewById(R.id.btnR30ButtonTwo)).setVisibility(8);
                            ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setVisibility(8);
                            ((ImageView) _$_findCachedViewById(R.id.ivHelp)).setVisibility(8);
                            ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new View.OnClickListener(this) { // from class: hr.u2

                                /* renamed from: v  reason: collision with root package name */
                                public final /* synthetic */ v2 f19235v;

                                {
                                    this.f19235v = this;
                                }

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view2) {
                                    int i10 = r2;
                                    v2 this$0 = this.f19235v;
                                    switch (i10) {
                                        case 0:
                                            int i11 = v2.f19274y;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            TemplateActivity templateActivity6 = this$0.f19276v;
                                            if (templateActivity6 != null) {
                                                androidx.fragment.app.y yVar = templateActivity6.B;
                                                kotlin.jvm.internal.i.d(yVar);
                                                yVar.W();
                                                return;
                                            }
                                            kotlin.jvm.internal.i.q("act");
                                            throw null;
                                        case 1:
                                            int i12 = v2.f19274y;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            TemplateActivity templateActivity7 = this$0.f19276v;
                                            if (templateActivity7 != null) {
                                                templateActivity7.onBackPressed();
                                                return;
                                            } else {
                                                kotlin.jvm.internal.i.q("act");
                                                throw null;
                                            }
                                        case 2:
                                            int i13 = v2.f19274y;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            androidx.appcompat.widget.a1 a1Var = new androidx.appcompat.widget.a1(this$0.requireContext(), (ImageView) this$0._$_findCachedViewById(R.id.ivEllipses));
                                            a1Var.a().inflate(R.menu.logs_menu, a1Var.f1344b);
                                            a1Var.f1346d = new fq.s(this$0, 16);
                                            a1Var.b();
                                            return;
                                        default:
                                            int i14 = v2.f19274y;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            androidx.fragment.app.p activity2 = this$0.getActivity();
                                            kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
                                            ((rr.a) activity2).onBackPressed();
                                            return;
                                    }
                                }
                            });
                            return;
                        }
                        kotlin.jvm.internal.i.q("act");
                        throw null;
                    }
                    kotlin.jvm.internal.i.q("act");
                    throw null;
                }
                TemplateActivity templateActivity6 = this.f19276v;
                if (templateActivity6 != null) {
                    Object obj2 = templateActivity6.F.get("screen_model_30");
                    kotlin.jvm.internal.i.e(obj2, "null cannot be cast to non-null type com.theinnerhour.b2b.model.ScreenResult30Model");
                    ScreenResult30Model screenResult30Model = (ScreenResult30Model) obj2;
                    Iterator<String> it2 = screenResult30Model.getList().iterator();
                    while (it2.hasNext()) {
                        View inflate2 = getLayoutInflater().inflate(R.layout.row_result_30, (ViewGroup) ((LinearLayout) _$_findCachedViewById(i6)), false);
                        ((RobertoTextView) inflate2.findViewById(R.id.text2)).setText(it2.next());
                        ((LinearLayout) _$_findCachedViewById(R.id.linearLayout)).addView(inflate2);
                        i6 = R.id.linearLayout;
                    }
                    ((RobertoTextView) _$_findCachedViewById(R.id.tvR30Subheading)).setText(UtilFunKt.paramsMapToString(A0.get("r30_subheading")));
                    ((RobertoTextView) _$_findCachedViewById(R.id.tvR30Heading)).setText(UtilFunKt.paramsMapToString(A0.get("r30_heading")));
                    ((RobertoTextView) _$_findCachedViewById(R.id.tvR30StmtOneDesc)).setText(UtilFunKt.paramsMapToString(A0.get("r30_description")));
                    ((RobertoButton) _$_findCachedViewById(R.id.btnR30ButtonOne)).setText(UtilFunKt.paramsMapToString(A0.get("r30_btn_one_text")));
                    RobertoButton robertoButton = (RobertoButton) _$_findCachedViewById(R.id.btnR30ButtonTwo);
                    TemplateActivity templateActivity7 = this.f19276v;
                    if (templateActivity7 != null) {
                        if (templateActivity7.getIntent().hasExtra("source")) {
                            TemplateActivity templateActivity8 = this.f19276v;
                            if (templateActivity8 != null) {
                                if (kotlin.jvm.internal.i.b(templateActivity8.getIntent().getStringExtra("source"), "goals")) {
                                    TemplateActivity templateActivity9 = this.f19276v;
                                    if (templateActivity9 != null) {
                                        if (kotlin.jvm.internal.i.b(templateActivity9.getIntent().getStringExtra("source"), "goals")) {
                                            paramsMapToString = "DONE";
                                            robertoButton.setText(paramsMapToString);
                                            ((RobertoButton) _$_findCachedViewById(R.id.btnR30ButtonOne)).setOnClickListener(new View.OnClickListener(this) { // from class: hr.u2

                                                /* renamed from: v  reason: collision with root package name */
                                                public final /* synthetic */ v2 f19235v;

                                                {
                                                    this.f19235v = this;
                                                }

                                                @Override // android.view.View.OnClickListener
                                                public final void onClick(View view2) {
                                                    int i10 = r2;
                                                    v2 this$0 = this.f19235v;
                                                    switch (i10) {
                                                        case 0:
                                                            int i11 = v2.f19274y;
                                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                                            TemplateActivity templateActivity62 = this$0.f19276v;
                                                            if (templateActivity62 != null) {
                                                                androidx.fragment.app.y yVar = templateActivity62.B;
                                                                kotlin.jvm.internal.i.d(yVar);
                                                                yVar.W();
                                                                return;
                                                            }
                                                            kotlin.jvm.internal.i.q("act");
                                                            throw null;
                                                        case 1:
                                                            int i12 = v2.f19274y;
                                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                                            TemplateActivity templateActivity72 = this$0.f19276v;
                                                            if (templateActivity72 != null) {
                                                                templateActivity72.onBackPressed();
                                                                return;
                                                            } else {
                                                                kotlin.jvm.internal.i.q("act");
                                                                throw null;
                                                            }
                                                        case 2:
                                                            int i13 = v2.f19274y;
                                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                                            androidx.appcompat.widget.a1 a1Var = new androidx.appcompat.widget.a1(this$0.requireContext(), (ImageView) this$0._$_findCachedViewById(R.id.ivEllipses));
                                                            a1Var.a().inflate(R.menu.logs_menu, a1Var.f1344b);
                                                            a1Var.f1346d = new fq.s(this$0, 16);
                                                            a1Var.b();
                                                            return;
                                                        default:
                                                            int i14 = v2.f19274y;
                                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                                            androidx.fragment.app.p activity2 = this$0.getActivity();
                                                            kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
                                                            ((rr.a) activity2).onBackPressed();
                                                            return;
                                                    }
                                                }
                                            });
                                            ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setVisibility(0);
                                            ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setOnClickListener(new View.OnClickListener(this) { // from class: hr.u2

                                                /* renamed from: v  reason: collision with root package name */
                                                public final /* synthetic */ v2 f19235v;

                                                {
                                                    this.f19235v = this;
                                                }

                                                @Override // android.view.View.OnClickListener
                                                public final void onClick(View view2) {
                                                    int i10 = r2;
                                                    v2 this$0 = this.f19235v;
                                                    switch (i10) {
                                                        case 0:
                                                            int i11 = v2.f19274y;
                                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                                            TemplateActivity templateActivity62 = this$0.f19276v;
                                                            if (templateActivity62 != null) {
                                                                androidx.fragment.app.y yVar = templateActivity62.B;
                                                                kotlin.jvm.internal.i.d(yVar);
                                                                yVar.W();
                                                                return;
                                                            }
                                                            kotlin.jvm.internal.i.q("act");
                                                            throw null;
                                                        case 1:
                                                            int i12 = v2.f19274y;
                                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                                            TemplateActivity templateActivity72 = this$0.f19276v;
                                                            if (templateActivity72 != null) {
                                                                templateActivity72.onBackPressed();
                                                                return;
                                                            } else {
                                                                kotlin.jvm.internal.i.q("act");
                                                                throw null;
                                                            }
                                                        case 2:
                                                            int i13 = v2.f19274y;
                                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                                            androidx.appcompat.widget.a1 a1Var = new androidx.appcompat.widget.a1(this$0.requireContext(), (ImageView) this$0._$_findCachedViewById(R.id.ivEllipses));
                                                            a1Var.a().inflate(R.menu.logs_menu, a1Var.f1344b);
                                                            a1Var.f1346d = new fq.s(this$0, 16);
                                                            a1Var.b();
                                                            return;
                                                        default:
                                                            int i14 = v2.f19274y;
                                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                                            androidx.fragment.app.p activity2 = this$0.getActivity();
                                                            kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
                                                            ((rr.a) activity2).onBackPressed();
                                                            return;
                                                    }
                                                }
                                            });
                                            ((ImageView) _$_findCachedViewById(R.id.ivHelp)).setVisibility(8);
                                            ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new View.OnClickListener(this) { // from class: hr.u2

                                                /* renamed from: v  reason: collision with root package name */
                                                public final /* synthetic */ v2 f19235v;

                                                {
                                                    this.f19235v = this;
                                                }

                                                @Override // android.view.View.OnClickListener
                                                public final void onClick(View view2) {
                                                    int i10 = r2;
                                                    v2 this$0 = this.f19235v;
                                                    switch (i10) {
                                                        case 0:
                                                            int i11 = v2.f19274y;
                                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                                            TemplateActivity templateActivity62 = this$0.f19276v;
                                                            if (templateActivity62 != null) {
                                                                androidx.fragment.app.y yVar = templateActivity62.B;
                                                                kotlin.jvm.internal.i.d(yVar);
                                                                yVar.W();
                                                                return;
                                                            }
                                                            kotlin.jvm.internal.i.q("act");
                                                            throw null;
                                                        case 1:
                                                            int i12 = v2.f19274y;
                                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                                            TemplateActivity templateActivity72 = this$0.f19276v;
                                                            if (templateActivity72 != null) {
                                                                templateActivity72.onBackPressed();
                                                                return;
                                                            } else {
                                                                kotlin.jvm.internal.i.q("act");
                                                                throw null;
                                                            }
                                                        case 2:
                                                            int i13 = v2.f19274y;
                                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                                            androidx.appcompat.widget.a1 a1Var = new androidx.appcompat.widget.a1(this$0.requireContext(), (ImageView) this$0._$_findCachedViewById(R.id.ivEllipses));
                                                            a1Var.a().inflate(R.menu.logs_menu, a1Var.f1344b);
                                                            a1Var.f1346d = new fq.s(this$0, 16);
                                                            a1Var.b();
                                                            return;
                                                        default:
                                                            int i14 = v2.f19274y;
                                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                                            androidx.fragment.app.p activity2 = this$0.getActivity();
                                                            kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
                                                            ((rr.a) activity2).onBackPressed();
                                                            return;
                                                    }
                                                }
                                            });
                                            templateActivity = this.f19276v;
                                            if (templateActivity == null) {
                                                TemplateModel templateModel = templateActivity.f10547y;
                                                if (templateModel != null && (label = templateModel.getLabel()) != null) {
                                                    fm.a aVar = (fm.a) this.f19277w.getValue();
                                                    aVar.f15178l0.e(getViewLifecycleOwner(), new a2(11, new a(label, screenResult30Model)));
                                                    aVar.m(label, "result_30");
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
                            } else {
                                kotlin.jvm.internal.i.q("act");
                                throw null;
                            }
                        }
                        paramsMapToString = UtilFunKt.paramsMapToString(A0.get("r30_btn_two_text"));
                        robertoButton.setText(paramsMapToString);
                        ((RobertoButton) _$_findCachedViewById(R.id.btnR30ButtonOne)).setOnClickListener(new View.OnClickListener(this) { // from class: hr.u2

                            /* renamed from: v  reason: collision with root package name */
                            public final /* synthetic */ v2 f19235v;

                            {
                                this.f19235v = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                int i10 = r2;
                                v2 this$0 = this.f19235v;
                                switch (i10) {
                                    case 0:
                                        int i11 = v2.f19274y;
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        TemplateActivity templateActivity62 = this$0.f19276v;
                                        if (templateActivity62 != null) {
                                            androidx.fragment.app.y yVar = templateActivity62.B;
                                            kotlin.jvm.internal.i.d(yVar);
                                            yVar.W();
                                            return;
                                        }
                                        kotlin.jvm.internal.i.q("act");
                                        throw null;
                                    case 1:
                                        int i12 = v2.f19274y;
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        TemplateActivity templateActivity72 = this$0.f19276v;
                                        if (templateActivity72 != null) {
                                            templateActivity72.onBackPressed();
                                            return;
                                        } else {
                                            kotlin.jvm.internal.i.q("act");
                                            throw null;
                                        }
                                    case 2:
                                        int i13 = v2.f19274y;
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        androidx.appcompat.widget.a1 a1Var = new androidx.appcompat.widget.a1(this$0.requireContext(), (ImageView) this$0._$_findCachedViewById(R.id.ivEllipses));
                                        a1Var.a().inflate(R.menu.logs_menu, a1Var.f1344b);
                                        a1Var.f1346d = new fq.s(this$0, 16);
                                        a1Var.b();
                                        return;
                                    default:
                                        int i14 = v2.f19274y;
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        androidx.fragment.app.p activity2 = this$0.getActivity();
                                        kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
                                        ((rr.a) activity2).onBackPressed();
                                        return;
                                }
                            }
                        });
                        ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setVisibility(0);
                        ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setOnClickListener(new View.OnClickListener(this) { // from class: hr.u2

                            /* renamed from: v  reason: collision with root package name */
                            public final /* synthetic */ v2 f19235v;

                            {
                                this.f19235v = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                int i10 = r2;
                                v2 this$0 = this.f19235v;
                                switch (i10) {
                                    case 0:
                                        int i11 = v2.f19274y;
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        TemplateActivity templateActivity62 = this$0.f19276v;
                                        if (templateActivity62 != null) {
                                            androidx.fragment.app.y yVar = templateActivity62.B;
                                            kotlin.jvm.internal.i.d(yVar);
                                            yVar.W();
                                            return;
                                        }
                                        kotlin.jvm.internal.i.q("act");
                                        throw null;
                                    case 1:
                                        int i12 = v2.f19274y;
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        TemplateActivity templateActivity72 = this$0.f19276v;
                                        if (templateActivity72 != null) {
                                            templateActivity72.onBackPressed();
                                            return;
                                        } else {
                                            kotlin.jvm.internal.i.q("act");
                                            throw null;
                                        }
                                    case 2:
                                        int i13 = v2.f19274y;
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        androidx.appcompat.widget.a1 a1Var = new androidx.appcompat.widget.a1(this$0.requireContext(), (ImageView) this$0._$_findCachedViewById(R.id.ivEllipses));
                                        a1Var.a().inflate(R.menu.logs_menu, a1Var.f1344b);
                                        a1Var.f1346d = new fq.s(this$0, 16);
                                        a1Var.b();
                                        return;
                                    default:
                                        int i14 = v2.f19274y;
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        androidx.fragment.app.p activity2 = this$0.getActivity();
                                        kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
                                        ((rr.a) activity2).onBackPressed();
                                        return;
                                }
                            }
                        });
                        ((ImageView) _$_findCachedViewById(R.id.ivHelp)).setVisibility(8);
                        ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new View.OnClickListener(this) { // from class: hr.u2

                            /* renamed from: v  reason: collision with root package name */
                            public final /* synthetic */ v2 f19235v;

                            {
                                this.f19235v = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                int i10 = r2;
                                v2 this$0 = this.f19235v;
                                switch (i10) {
                                    case 0:
                                        int i11 = v2.f19274y;
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        TemplateActivity templateActivity62 = this$0.f19276v;
                                        if (templateActivity62 != null) {
                                            androidx.fragment.app.y yVar = templateActivity62.B;
                                            kotlin.jvm.internal.i.d(yVar);
                                            yVar.W();
                                            return;
                                        }
                                        kotlin.jvm.internal.i.q("act");
                                        throw null;
                                    case 1:
                                        int i12 = v2.f19274y;
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        TemplateActivity templateActivity72 = this$0.f19276v;
                                        if (templateActivity72 != null) {
                                            templateActivity72.onBackPressed();
                                            return;
                                        } else {
                                            kotlin.jvm.internal.i.q("act");
                                            throw null;
                                        }
                                    case 2:
                                        int i13 = v2.f19274y;
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        androidx.appcompat.widget.a1 a1Var = new androidx.appcompat.widget.a1(this$0.requireContext(), (ImageView) this$0._$_findCachedViewById(R.id.ivEllipses));
                                        a1Var.a().inflate(R.menu.logs_menu, a1Var.f1344b);
                                        a1Var.f1346d = new fq.s(this$0, 16);
                                        a1Var.b();
                                        return;
                                    default:
                                        int i14 = v2.f19274y;
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        androidx.fragment.app.p activity2 = this$0.getActivity();
                                        kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
                                        ((rr.a) activity2).onBackPressed();
                                        return;
                                }
                            }
                        });
                        templateActivity = this.f19276v;
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
            } else {
                kotlin.jvm.internal.i.q("act");
                throw null;
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f19275u, "exception", e10);
        }
    }
}
