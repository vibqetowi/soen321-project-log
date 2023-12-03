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
import com.theinnerhour.b2b.model.ScreenResult9Model;
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
/* compiled from: ScreenResult9FragmentNew.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhr/g4;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class g4 extends rr.b {

    /* renamed from: z  reason: collision with root package name */
    public static final /* synthetic */ int f18438z = 0;

    /* renamed from: w  reason: collision with root package name */
    public boolean f18441w;

    /* renamed from: x  reason: collision with root package name */
    public TemplateActivity f18442x;

    /* renamed from: y  reason: collision with root package name */
    public final LinkedHashMap f18443y = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f18439u = LogHelper.INSTANCE.makeLogTag(g4.class);

    /* renamed from: v  reason: collision with root package name */
    public final androidx.lifecycle.m0 f18440v = kotlin.jvm.internal.b0.j(this, kotlin.jvm.internal.y.a(fm.a.class), new c(this), new d(this), new e(this));

    /* compiled from: ScreenResult9FragmentNew.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.l<hs.f<? extends Boolean, ? extends FirestoreGoal>, hs.k> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ String f18445v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ fm.a f18446w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, fm.a aVar) {
            super(1);
            this.f18445v = str;
            this.f18446w = aVar;
        }

        @Override // ss.l
        public final hs.k invoke(hs.f<? extends Boolean, ? extends FirestoreGoal> fVar) {
            hs.f<? extends Boolean, ? extends FirestoreGoal> fVar2 = fVar;
            if (fVar2 != null) {
                g4 g4Var = g4.this;
                TemplateActivity templateActivity = g4Var.f18442x;
                String str = null;
                if (templateActivity != null) {
                    boolean b10 = kotlin.jvm.internal.i.b(templateActivity.F.get("log"), Boolean.TRUE);
                    boolean z10 = true;
                    String str2 = this.f18445v;
                    if (b10) {
                        TemplateActivity templateActivity2 = g4Var.f18442x;
                        if (templateActivity2 != null) {
                            Object obj = templateActivity2.F.get("data");
                            kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type com.theinnerhour.b2b.model.ScreenResult9Model");
                            g4.J(g4Var, str2, true, (ScreenResult9Model) obj);
                        } else {
                            kotlin.jvm.internal.i.q("act");
                            throw null;
                        }
                    } else {
                        TemplateActivity templateActivity3 = g4Var.f18442x;
                        if (templateActivity3 != null) {
                            boolean z11 = templateActivity3.J;
                            B b11 = fVar2.f19465v;
                            if (!z11 && !templateActivity3.I) {
                                if (b11 == 0) {
                                    z10 = false;
                                }
                                g4.J(g4Var, str2, z10, new ScreenResult9Model(Utils.INSTANCE.getTimeInSeconds()));
                            } else {
                                FirestoreGoal firestoreGoal = (FirestoreGoal) b11;
                                if (firestoreGoal != null) {
                                    str = firestoreGoal.getDataTypeKey();
                                }
                                if (kotlin.jvm.internal.i.b(str, "result_9")) {
                                    g4Var.f18441w = true;
                                    this.f18446w.o(str2, false);
                                } else {
                                    g4.J(g4Var, str2, false, new ScreenResult9Model(Utils.INSTANCE.getTimeInSeconds()));
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
            return hs.k.f19476a;
        }
    }

    /* compiled from: ScreenResult9FragmentNew.kt */
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.l<hs.f<? extends Boolean, ? extends HashMap<String, Object>>, hs.k> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ String f18448v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(1);
            this.f18448v = str;
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
                g4 g4Var = g4.this;
                if (g4Var.f18441w) {
                    g4Var.f18441w = false;
                    ScreenResult9Model screenResult9Model = (ScreenResult9Model) is.u.i2(UtilFunKt.result9MapToObject(ca.a.k((HashMap) fVar2.f19465v)));
                    if (screenResult9Model != null) {
                        g4.J(g4Var, this.f18448v, true, screenResult9Model);
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
        public final /* synthetic */ Fragment f18449u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f18449u = fragment;
        }

        @Override // ss.a
        public final androidx.lifecycle.q0 invoke() {
            return defpackage.e.m(this.f18449u, "requireActivity().viewModelStore");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class d extends kotlin.jvm.internal.k implements ss.a<k1.a> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f18450u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f18450u = fragment;
        }

        @Override // ss.a
        public final k1.a invoke() {
            return defpackage.b.r(this.f18450u, "requireActivity().defaultViewModelCreationExtras");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class e extends kotlin.jvm.internal.k implements ss.a<o0.b> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f18451u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f18451u = fragment;
        }

        @Override // ss.a
        public final o0.b invoke() {
            return pl.a.e(this.f18451u, "requireActivity().defaultViewModelProviderFactory");
        }
    }

    public static final void J(final g4 g4Var, String str, boolean z10, ScreenResult9Model screenResult9Model) {
        boolean z11;
        boolean z12;
        String str2;
        g4Var.getClass();
        kotlin.jvm.internal.u uVar = new kotlin.jvm.internal.u();
        TemplateActivity templateActivity = g4Var.f18442x;
        if (templateActivity != null) {
            HashMap<String, Object> A0 = templateActivity.A0();
            TemplateActivity templateActivity2 = g4Var.f18442x;
            if (templateActivity2 != null) {
                boolean z13 = true;
                if (kotlin.jvm.internal.i.b(templateActivity2.F.get("log"), Boolean.TRUE)) {
                    ((RobertoButton) g4Var._$_findCachedViewById(R.id.buttonClose)).setVisibility(0);
                    TemplateActivity templateActivity3 = g4Var.f18442x;
                    if (templateActivity3 != null) {
                        templateActivity3.F.put("log", Boolean.FALSE);
                        ((RobertoButton) g4Var._$_findCachedViewById(R.id.button1)).setVisibility(8);
                        ((RobertoButton) g4Var._$_findCachedViewById(R.id.button2)).setVisibility(8);
                        ((RobertoButton) g4Var._$_findCachedViewById(R.id.buttonClose)).setOnClickListener(new View.OnClickListener(g4Var) { // from class: hr.f4

                            /* renamed from: v  reason: collision with root package name */
                            public final /* synthetic */ g4 f18370v;

                            {
                                this.f18370v = g4Var;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                int i6 = r2;
                                g4 this$0 = this.f18370v;
                                switch (i6) {
                                    case 0:
                                        int i10 = g4.f18438z;
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        TemplateActivity templateActivity4 = this$0.f18442x;
                                        if (templateActivity4 != null) {
                                            androidx.fragment.app.y yVar = templateActivity4.B;
                                            kotlin.jvm.internal.i.d(yVar);
                                            yVar.W();
                                            return;
                                        }
                                        kotlin.jvm.internal.i.q("act");
                                        throw null;
                                    case 1:
                                        int i11 = g4.f18438z;
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        TemplateActivity templateActivity5 = this$0.f18442x;
                                        if (templateActivity5 != null) {
                                            androidx.fragment.app.y yVar2 = templateActivity5.B;
                                            kotlin.jvm.internal.i.d(yVar2);
                                            yVar2.W();
                                            return;
                                        }
                                        kotlin.jvm.internal.i.q("act");
                                        throw null;
                                    case 2:
                                        int i12 = g4.f18438z;
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        this$0.K();
                                        return;
                                    case 3:
                                        int i13 = g4.f18438z;
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        androidx.fragment.app.p activity = this$0.getActivity();
                                        if (activity != null) {
                                            activity.onBackPressed();
                                            return;
                                        }
                                        return;
                                    case 4:
                                        int i14 = g4.f18438z;
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        this$0.K();
                                        return;
                                    case 5:
                                        int i15 = g4.f18438z;
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        androidx.fragment.app.p activity2 = this$0.getActivity();
                                        if (activity2 != null) {
                                            activity2.onBackPressed();
                                            return;
                                        }
                                        return;
                                    default:
                                        int i16 = g4.f18438z;
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        TemplateActivity templateActivity6 = this$0.f18442x;
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
                        ((RobertoTextView) g4Var._$_findCachedViewById(R.id.textView1)).setText(UtilFunKt.paramsMapToString(A0.get("r9_heading")));
                        ((ImageView) g4Var._$_findCachedViewById(R.id.ivEllipses)).setVisibility(8);
                        ((ImageView) g4Var._$_findCachedViewById(R.id.ivHelp)).setVisibility(8);
                        ((ImageView) g4Var._$_findCachedViewById(R.id.ivClose)).setOnClickListener(new View.OnClickListener(g4Var) { // from class: hr.f4

                            /* renamed from: v  reason: collision with root package name */
                            public final /* synthetic */ g4 f18370v;

                            {
                                this.f18370v = g4Var;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                int i6 = r2;
                                g4 this$0 = this.f18370v;
                                switch (i6) {
                                    case 0:
                                        int i10 = g4.f18438z;
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        TemplateActivity templateActivity4 = this$0.f18442x;
                                        if (templateActivity4 != null) {
                                            androidx.fragment.app.y yVar = templateActivity4.B;
                                            kotlin.jvm.internal.i.d(yVar);
                                            yVar.W();
                                            return;
                                        }
                                        kotlin.jvm.internal.i.q("act");
                                        throw null;
                                    case 1:
                                        int i11 = g4.f18438z;
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        TemplateActivity templateActivity5 = this$0.f18442x;
                                        if (templateActivity5 != null) {
                                            androidx.fragment.app.y yVar2 = templateActivity5.B;
                                            kotlin.jvm.internal.i.d(yVar2);
                                            yVar2.W();
                                            return;
                                        }
                                        kotlin.jvm.internal.i.q("act");
                                        throw null;
                                    case 2:
                                        int i12 = g4.f18438z;
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        this$0.K();
                                        return;
                                    case 3:
                                        int i13 = g4.f18438z;
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        androidx.fragment.app.p activity = this$0.getActivity();
                                        if (activity != null) {
                                            activity.onBackPressed();
                                            return;
                                        }
                                        return;
                                    case 4:
                                        int i14 = g4.f18438z;
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        this$0.K();
                                        return;
                                    case 5:
                                        int i15 = g4.f18438z;
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        androidx.fragment.app.p activity2 = this$0.getActivity();
                                        if (activity2 != null) {
                                            activity2.onBackPressed();
                                            return;
                                        }
                                        return;
                                    default:
                                        int i16 = g4.f18438z;
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        TemplateActivity templateActivity6 = this$0.f18442x;
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
                    } else {
                        kotlin.jvm.internal.i.q("act");
                        throw null;
                    }
                } else {
                    TemplateActivity templateActivity4 = g4Var.f18442x;
                    if (templateActivity4 != null) {
                        boolean z14 = templateActivity4.J;
                        HashMap<String, Object> hashMap = templateActivity4.F;
                        if (!z14 && !templateActivity4.I) {
                            uVar.f23466u = true;
                            Object obj = hashMap.get("list");
                            kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                            screenResult9Model.setList((ArrayList) obj);
                            ((ImageView) g4Var._$_findCachedViewById(R.id.ivEllipses)).setVisibility(0);
                            ((ImageView) g4Var._$_findCachedViewById(R.id.ivEllipses)).setOnClickListener(new View.OnClickListener(g4Var) { // from class: hr.f4

                                /* renamed from: v  reason: collision with root package name */
                                public final /* synthetic */ g4 f18370v;

                                {
                                    this.f18370v = g4Var;
                                }

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    int i6 = r2;
                                    g4 this$0 = this.f18370v;
                                    switch (i6) {
                                        case 0:
                                            int i10 = g4.f18438z;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            TemplateActivity templateActivity42 = this$0.f18442x;
                                            if (templateActivity42 != null) {
                                                androidx.fragment.app.y yVar = templateActivity42.B;
                                                kotlin.jvm.internal.i.d(yVar);
                                                yVar.W();
                                                return;
                                            }
                                            kotlin.jvm.internal.i.q("act");
                                            throw null;
                                        case 1:
                                            int i11 = g4.f18438z;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            TemplateActivity templateActivity5 = this$0.f18442x;
                                            if (templateActivity5 != null) {
                                                androidx.fragment.app.y yVar2 = templateActivity5.B;
                                                kotlin.jvm.internal.i.d(yVar2);
                                                yVar2.W();
                                                return;
                                            }
                                            kotlin.jvm.internal.i.q("act");
                                            throw null;
                                        case 2:
                                            int i12 = g4.f18438z;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            this$0.K();
                                            return;
                                        case 3:
                                            int i13 = g4.f18438z;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            androidx.fragment.app.p activity = this$0.getActivity();
                                            if (activity != null) {
                                                activity.onBackPressed();
                                                return;
                                            }
                                            return;
                                        case 4:
                                            int i14 = g4.f18438z;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            this$0.K();
                                            return;
                                        case 5:
                                            int i15 = g4.f18438z;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            androidx.fragment.app.p activity2 = this$0.getActivity();
                                            if (activity2 != null) {
                                                activity2.onBackPressed();
                                                return;
                                            }
                                            return;
                                        default:
                                            int i16 = g4.f18438z;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            TemplateActivity templateActivity6 = this$0.f18442x;
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
                            ((ImageView) g4Var._$_findCachedViewById(R.id.ivHelp)).setVisibility(8);
                            ((ImageView) g4Var._$_findCachedViewById(R.id.ivClose)).setOnClickListener(new View.OnClickListener(g4Var) { // from class: hr.f4

                                /* renamed from: v  reason: collision with root package name */
                                public final /* synthetic */ g4 f18370v;

                                {
                                    this.f18370v = g4Var;
                                }

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    int i6 = r2;
                                    g4 this$0 = this.f18370v;
                                    switch (i6) {
                                        case 0:
                                            int i10 = g4.f18438z;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            TemplateActivity templateActivity42 = this$0.f18442x;
                                            if (templateActivity42 != null) {
                                                androidx.fragment.app.y yVar = templateActivity42.B;
                                                kotlin.jvm.internal.i.d(yVar);
                                                yVar.W();
                                                return;
                                            }
                                            kotlin.jvm.internal.i.q("act");
                                            throw null;
                                        case 1:
                                            int i11 = g4.f18438z;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            TemplateActivity templateActivity5 = this$0.f18442x;
                                            if (templateActivity5 != null) {
                                                androidx.fragment.app.y yVar2 = templateActivity5.B;
                                                kotlin.jvm.internal.i.d(yVar2);
                                                yVar2.W();
                                                return;
                                            }
                                            kotlin.jvm.internal.i.q("act");
                                            throw null;
                                        case 2:
                                            int i12 = g4.f18438z;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            this$0.K();
                                            return;
                                        case 3:
                                            int i13 = g4.f18438z;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            androidx.fragment.app.p activity = this$0.getActivity();
                                            if (activity != null) {
                                                activity.onBackPressed();
                                                return;
                                            }
                                            return;
                                        case 4:
                                            int i14 = g4.f18438z;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            this$0.K();
                                            return;
                                        case 5:
                                            int i15 = g4.f18438z;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            androidx.fragment.app.p activity2 = this$0.getActivity();
                                            if (activity2 != null) {
                                                activity2.onBackPressed();
                                                return;
                                            }
                                            return;
                                        default:
                                            int i16 = g4.f18438z;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            TemplateActivity templateActivity6 = this$0.f18442x;
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
                        } else {
                            if (z10) {
                                hashMap.put("list", screenResult9Model.getList());
                            }
                            ((ImageView) g4Var._$_findCachedViewById(R.id.ivEllipses)).setVisibility(0);
                            ((ImageView) g4Var._$_findCachedViewById(R.id.ivEllipses)).setOnClickListener(new View.OnClickListener(g4Var) { // from class: hr.f4

                                /* renamed from: v  reason: collision with root package name */
                                public final /* synthetic */ g4 f18370v;

                                {
                                    this.f18370v = g4Var;
                                }

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    int i6 = r2;
                                    g4 this$0 = this.f18370v;
                                    switch (i6) {
                                        case 0:
                                            int i10 = g4.f18438z;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            TemplateActivity templateActivity42 = this$0.f18442x;
                                            if (templateActivity42 != null) {
                                                androidx.fragment.app.y yVar = templateActivity42.B;
                                                kotlin.jvm.internal.i.d(yVar);
                                                yVar.W();
                                                return;
                                            }
                                            kotlin.jvm.internal.i.q("act");
                                            throw null;
                                        case 1:
                                            int i11 = g4.f18438z;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            TemplateActivity templateActivity5 = this$0.f18442x;
                                            if (templateActivity5 != null) {
                                                androidx.fragment.app.y yVar2 = templateActivity5.B;
                                                kotlin.jvm.internal.i.d(yVar2);
                                                yVar2.W();
                                                return;
                                            }
                                            kotlin.jvm.internal.i.q("act");
                                            throw null;
                                        case 2:
                                            int i12 = g4.f18438z;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            this$0.K();
                                            return;
                                        case 3:
                                            int i13 = g4.f18438z;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            androidx.fragment.app.p activity = this$0.getActivity();
                                            if (activity != null) {
                                                activity.onBackPressed();
                                                return;
                                            }
                                            return;
                                        case 4:
                                            int i14 = g4.f18438z;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            this$0.K();
                                            return;
                                        case 5:
                                            int i15 = g4.f18438z;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            androidx.fragment.app.p activity2 = this$0.getActivity();
                                            if (activity2 != null) {
                                                activity2.onBackPressed();
                                                return;
                                            }
                                            return;
                                        default:
                                            int i16 = g4.f18438z;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            TemplateActivity templateActivity6 = this$0.f18442x;
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
                            ((ImageView) g4Var._$_findCachedViewById(R.id.ivHelp)).setVisibility(8);
                            ((ImageView) g4Var._$_findCachedViewById(R.id.ivClose)).setOnClickListener(new View.OnClickListener(g4Var) { // from class: hr.f4

                                /* renamed from: v  reason: collision with root package name */
                                public final /* synthetic */ g4 f18370v;

                                {
                                    this.f18370v = g4Var;
                                }

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    int i6 = r2;
                                    g4 this$0 = this.f18370v;
                                    switch (i6) {
                                        case 0:
                                            int i10 = g4.f18438z;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            TemplateActivity templateActivity42 = this$0.f18442x;
                                            if (templateActivity42 != null) {
                                                androidx.fragment.app.y yVar = templateActivity42.B;
                                                kotlin.jvm.internal.i.d(yVar);
                                                yVar.W();
                                                return;
                                            }
                                            kotlin.jvm.internal.i.q("act");
                                            throw null;
                                        case 1:
                                            int i11 = g4.f18438z;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            TemplateActivity templateActivity5 = this$0.f18442x;
                                            if (templateActivity5 != null) {
                                                androidx.fragment.app.y yVar2 = templateActivity5.B;
                                                kotlin.jvm.internal.i.d(yVar2);
                                                yVar2.W();
                                                return;
                                            }
                                            kotlin.jvm.internal.i.q("act");
                                            throw null;
                                        case 2:
                                            int i12 = g4.f18438z;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            this$0.K();
                                            return;
                                        case 3:
                                            int i13 = g4.f18438z;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            androidx.fragment.app.p activity = this$0.getActivity();
                                            if (activity != null) {
                                                activity.onBackPressed();
                                                return;
                                            }
                                            return;
                                        case 4:
                                            int i14 = g4.f18438z;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            this$0.K();
                                            return;
                                        case 5:
                                            int i15 = g4.f18438z;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            androidx.fragment.app.p activity2 = this$0.getActivity();
                                            if (activity2 != null) {
                                                activity2.onBackPressed();
                                                return;
                                            }
                                            return;
                                        default:
                                            int i16 = g4.f18438z;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            TemplateActivity templateActivity6 = this$0.f18442x;
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
                        }
                    } else {
                        kotlin.jvm.internal.i.q("act");
                        throw null;
                    }
                }
                ((LinearLayout) g4Var._$_findCachedViewById(R.id.linearLayout)).removeAllViews();
                ArrayList<String> paramsMapToList = UtilFunKt.paramsMapToList(A0.get("r9_statement_list"));
                int size = screenResult9Model.getList().size();
                for (int i6 = 0; i6 < size; i6++) {
                    View inflate = g4Var.getLayoutInflater().inflate(R.layout.row_result_6, (ViewGroup) ((LinearLayout) g4Var._$_findCachedViewById(R.id.linearLayout)), false);
                    RobertoTextView robertoTextView = (RobertoTextView) inflate.findViewById(R.id.rowQuestion);
                    String str3 = "";
                    if (i6 >= paramsMapToList.size()) {
                        str2 = "";
                    } else {
                        str2 = paramsMapToList.get(i6);
                    }
                    robertoTextView.setText(str2);
                    RobertoTextView robertoTextView2 = (RobertoTextView) inflate.findViewById(R.id.rowAnswer);
                    if (i6 < screenResult9Model.getList().size()) {
                        str3 = screenResult9Model.getList().get(i6);
                    }
                    robertoTextView2.setText(str3);
                    ((LinearLayout) g4Var._$_findCachedViewById(R.id.linearLayout)).addView(inflate);
                }
                if (A0.containsKey("r9_remember_text") && screenResult9Model.getList().size() > 1) {
                    String str4 = screenResult9Model.getList().get(1);
                    kotlin.jvm.internal.i.f(str4, "model.list[1]");
                    int parseInt = Integer.parseInt(str4);
                    if (parseInt >= 0 && parseInt < 4) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        View inflate2 = g4Var.getLayoutInflater().inflate(R.layout.row_result_6, (ViewGroup) ((LinearLayout) g4Var._$_findCachedViewById(R.id.linearLayout)), false);
                        ((RobertoTextView) inflate2.findViewById(R.id.rowQuestion)).setText(UtilFunKt.paramsMapToString(A0.get("r9_remember_text")));
                        ((RobertoTextView) inflate2.findViewById(R.id.rowAnswer)).setText(UtilFunKt.paramsMapToString(A0.get("r9_remember_description_low")));
                        ((LinearLayout) g4Var._$_findCachedViewById(R.id.linearLayout)).addView(inflate2);
                    } else {
                        if (4 <= parseInt && parseInt < 7) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (z12) {
                            View inflate3 = g4Var.getLayoutInflater().inflate(R.layout.row_result_6, (ViewGroup) ((LinearLayout) g4Var._$_findCachedViewById(R.id.linearLayout)), false);
                            ((RobertoTextView) inflate3.findViewById(R.id.rowQuestion)).setText(UtilFunKt.paramsMapToString(A0.get("r9_remember_text")));
                            ((RobertoTextView) inflate3.findViewById(R.id.rowAnswer)).setText(UtilFunKt.paramsMapToString(A0.get("r9_remember_description_moderate")));
                            ((LinearLayout) g4Var._$_findCachedViewById(R.id.linearLayout)).addView(inflate3);
                        } else if ((7 > parseInt || parseInt >= 11) ? false : false) {
                            View inflate4 = g4Var.getLayoutInflater().inflate(R.layout.row_result_6, (ViewGroup) ((LinearLayout) g4Var._$_findCachedViewById(R.id.linearLayout)), false);
                            ((RobertoTextView) inflate4.findViewById(R.id.rowQuestion)).setText(UtilFunKt.paramsMapToString(A0.get("r9_remember_text")));
                            ((RobertoTextView) inflate4.findViewById(R.id.rowAnswer)).setText(UtilFunKt.paramsMapToString(A0.get("r9_remember_description_high")));
                            ((LinearLayout) g4Var._$_findCachedViewById(R.id.linearLayout)).addView(inflate4);
                        }
                    }
                }
                ((RobertoButton) g4Var._$_findCachedViewById(R.id.button1)).setOnClickListener(new View.OnClickListener(g4Var) { // from class: hr.f4

                    /* renamed from: v  reason: collision with root package name */
                    public final /* synthetic */ g4 f18370v;

                    {
                        this.f18370v = g4Var;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i62 = r2;
                        g4 this$0 = this.f18370v;
                        switch (i62) {
                            case 0:
                                int i10 = g4.f18438z;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                TemplateActivity templateActivity42 = this$0.f18442x;
                                if (templateActivity42 != null) {
                                    androidx.fragment.app.y yVar = templateActivity42.B;
                                    kotlin.jvm.internal.i.d(yVar);
                                    yVar.W();
                                    return;
                                }
                                kotlin.jvm.internal.i.q("act");
                                throw null;
                            case 1:
                                int i11 = g4.f18438z;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                TemplateActivity templateActivity5 = this$0.f18442x;
                                if (templateActivity5 != null) {
                                    androidx.fragment.app.y yVar2 = templateActivity5.B;
                                    kotlin.jvm.internal.i.d(yVar2);
                                    yVar2.W();
                                    return;
                                }
                                kotlin.jvm.internal.i.q("act");
                                throw null;
                            case 2:
                                int i12 = g4.f18438z;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.K();
                                return;
                            case 3:
                                int i13 = g4.f18438z;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                androidx.fragment.app.p activity = this$0.getActivity();
                                if (activity != null) {
                                    activity.onBackPressed();
                                    return;
                                }
                                return;
                            case 4:
                                int i14 = g4.f18438z;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.K();
                                return;
                            case 5:
                                int i15 = g4.f18438z;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                androidx.fragment.app.p activity2 = this$0.getActivity();
                                if (activity2 != null) {
                                    activity2.onBackPressed();
                                    return;
                                }
                                return;
                            default:
                                int i16 = g4.f18438z;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                TemplateActivity templateActivity6 = this$0.f18442x;
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
                ((RobertoButton) g4Var._$_findCachedViewById(R.id.button2)).setOnClickListener(new g0(z10, uVar, g4Var, str, screenResult9Model, 9));
                return;
            }
            kotlin.jvm.internal.i.q("act");
            throw null;
        }
        kotlin.jvm.internal.i.q("act");
        throw null;
    }

    public final void K() {
        androidx.appcompat.widget.a1 a1Var = new androidx.appcompat.widget.a1(requireContext(), (ImageView) _$_findCachedViewById(R.id.ivEllipses));
        a1Var.a().inflate(R.menu.logs_menu, a1Var.f1344b);
        a1Var.f1346d = new fq.s(this, 22);
        a1Var.b();
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f18443y;
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
        return inflater.inflate(R.layout.fragment_screen_result_9, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        fm.a aVar = (fm.a) this.f18440v.getValue();
        aVar.f15174h0.k(getViewLifecycleOwner());
        aVar.f15177k0.k(getViewLifecycleOwner());
        aVar.f15178l0.k(getViewLifecycleOwner());
        aVar.f15180n0.k(getViewLifecycleOwner());
        aVar.f15181o0.k(getViewLifecycleOwner());
        aVar.f15182p0.k(getViewLifecycleOwner());
        aVar.w();
        super.onDestroyView();
        this.f18443y.clear();
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
            this.f18442x = templateActivity;
            HashMap<String, Object> A0 = templateActivity.A0();
            ((RobertoTextView) _$_findCachedViewById(R.id.textView1)).setText(UtilFunKt.paramsMapToString(A0.get("r9_heading")));
            ((RobertoButton) _$_findCachedViewById(R.id.button1)).setText(UtilFunKt.paramsMapToString(A0.get("r9_btn_one_text")));
            ((RobertoButton) _$_findCachedViewById(R.id.button2)).setText(UtilFunKt.paramsMapToString(A0.get("r9_btn_two_text")));
            TemplateActivity templateActivity2 = this.f18442x;
            if (templateActivity2 != null) {
                TemplateModel templateModel = templateActivity2.f10547y;
                if (templateModel != null && (label = templateModel.getLabel()) != null) {
                    fm.a aVar = (fm.a) this.f18440v.getValue();
                    aVar.f15178l0.e(getViewLifecycleOwner(), new r3(7, new a(label, aVar)));
                    aVar.f15181o0.e(getViewLifecycleOwner(), new r3(8, new b(label)));
                    aVar.m(label, "result_9");
                    return;
                }
                return;
            }
            kotlin.jvm.internal.i.q("act");
            throw null;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f18439u, "Exception", e10);
        }
    }
}
