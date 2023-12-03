package hr;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.o0;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.components.goals.model.FirestoreGoal;
import com.theinnerhour.b2b.model.ScreenResult25Model;
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
/* compiled from: ScreenResult25FragmentNew.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhr/d2;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class d2 extends rr.b {

    /* renamed from: z  reason: collision with root package name */
    public static final /* synthetic */ int f18293z = 0;

    /* renamed from: v  reason: collision with root package name */
    public TemplateActivity f18295v;

    /* renamed from: x  reason: collision with root package name */
    public boolean f18297x;

    /* renamed from: y  reason: collision with root package name */
    public final LinkedHashMap f18298y = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f18294u = LogHelper.INSTANCE.makeLogTag(d2.class);

    /* renamed from: w  reason: collision with root package name */
    public final androidx.lifecycle.m0 f18296w = kotlin.jvm.internal.b0.j(this, kotlin.jvm.internal.y.a(fm.a.class), new c(this), new d(this), new e(this));

    /* compiled from: ScreenResult25FragmentNew.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.l<hs.f<? extends Boolean, ? extends FirestoreGoal>, hs.k> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ fm.a f18300v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ String f18301w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(fm.a aVar, String str) {
            super(1);
            this.f18300v = aVar;
            this.f18301w = str;
        }

        @Override // ss.l
        public final hs.k invoke(hs.f<? extends Boolean, ? extends FirestoreGoal> fVar) {
            hs.f<? extends Boolean, ? extends FirestoreGoal> fVar2 = fVar;
            if (fVar2 != null) {
                d2 d2Var = d2.this;
                TemplateActivity templateActivity = d2Var.f18295v;
                if (templateActivity != null) {
                    boolean z10 = templateActivity.J;
                    boolean z11 = false;
                    String str = this.f18301w;
                    if (!z10 && !templateActivity.I) {
                        if (fVar2.f19465v != 0) {
                            z11 = true;
                        }
                        d2.J(d2Var, str, z11, new ScreenResult25Model(Utils.INSTANCE.getTimeInSeconds()));
                    } else {
                        d2Var.f18297x = true;
                        this.f18300v.o(str, false);
                    }
                } else {
                    kotlin.jvm.internal.i.q("act");
                    throw null;
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: ScreenResult25FragmentNew.kt */
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.l<hs.f<? extends Boolean, ? extends HashMap<String, Object>>, hs.k> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ String f18303v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(1);
            this.f18303v = str;
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
                d2 d2Var = d2.this;
                if (d2Var.f18297x) {
                    d2Var.f18297x = false;
                    d2.J(d2Var, this.f18303v, true, UtilFunKt.result25MapToObject(fVar2.f19465v));
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class c extends kotlin.jvm.internal.k implements ss.a<androidx.lifecycle.q0> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f18304u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f18304u = fragment;
        }

        @Override // ss.a
        public final androidx.lifecycle.q0 invoke() {
            return defpackage.e.m(this.f18304u, "requireActivity().viewModelStore");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class d extends kotlin.jvm.internal.k implements ss.a<k1.a> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f18305u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f18305u = fragment;
        }

        @Override // ss.a
        public final k1.a invoke() {
            return defpackage.b.r(this.f18305u, "requireActivity().defaultViewModelCreationExtras");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class e extends kotlin.jvm.internal.k implements ss.a<o0.b> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f18306u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f18306u = fragment;
        }

        @Override // ss.a
        public final o0.b invoke() {
            return pl.a.e(this.f18306u, "requireActivity().defaultViewModelProviderFactory");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x006d, code lost:
        r4.put("sleep_duration", java.lang.String.valueOf(r13.getSleepDuration()));
        r0 = r10.f18295v;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007a, code lost:
        if (r0 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007c, code lost:
        r0.F.put("other_duration", java.lang.String.valueOf(r13.getOtherDuration()));
        r0 = r10.f18295v;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008b, code lost:
        if (r0 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008d, code lost:
        r0.F.put("list", r13.getList());
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0097, code lost:
        kotlin.jvm.internal.i.q("act");
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x009a, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x009b, code lost:
        kotlin.jvm.internal.i.q("act");
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009e, code lost:
        throw null;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ae A[Catch: Exception -> 0x0101, LOOP:0: B:33:0x00a8->B:35:0x00ae, LOOP_END, TryCatch #0 {Exception -> 0x0101, blocks: (B:3:0x0005, B:6:0x000c, B:9:0x0019, B:12:0x001e, B:14:0x0030, B:16:0x004a, B:32:0x00a0, B:33:0x00a8, B:35:0x00ae, B:36:0x00e5, B:17:0x0063, B:18:0x0066, B:19:0x0067, B:20:0x006a, B:22:0x006d, B:24:0x007c, B:26:0x008d, B:27:0x0097, B:28:0x009a, B:29:0x009b, B:30:0x009e, B:37:0x00fd, B:38:0x0100), top: B:42:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void J(final d2 d2Var, final String str, final boolean z10, final ScreenResult25Model screenResult25Model) {
        final boolean z11;
        Iterator<String> it;
        d2Var.getClass();
        try {
            TemplateActivity templateActivity = d2Var.f18295v;
            if (templateActivity != null) {
                HashMap<String, Object> hashMap = templateActivity.F;
                if (!templateActivity.J && !templateActivity.I) {
                    Object obj = hashMap.get("list");
                    kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                    screenResult25Model.setList((ArrayList) obj);
                    TemplateActivity templateActivity2 = d2Var.f18295v;
                    if (templateActivity2 != null) {
                        Object obj2 = templateActivity2.F.get("other_duration");
                        kotlin.jvm.internal.i.e(obj2, "null cannot be cast to non-null type kotlin.String");
                        screenResult25Model.setOtherDuration(Integer.valueOf(Integer.parseInt((String) obj2)));
                        TemplateActivity templateActivity3 = d2Var.f18295v;
                        if (templateActivity3 != null) {
                            Object obj3 = templateActivity3.F.get("sleep_duration");
                            kotlin.jvm.internal.i.e(obj3, "null cannot be cast to non-null type kotlin.String");
                            screenResult25Model.setSleepDuration(Integer.valueOf(Integer.parseInt((String) obj3)));
                            z11 = true;
                            it = screenResult25Model.getList().iterator();
                            while (it.hasNext()) {
                                View inflate = d2Var.getLayoutInflater().inflate(R.layout.row_tick_underline_card, (ViewGroup) ((LinearLayout) d2Var._$_findCachedViewById(R.id.linearLayout)), false);
                                kotlin.jvm.internal.i.e(inflate, "null cannot be cast to non-null type android.widget.RelativeLayout");
                                RelativeLayout relativeLayout = (RelativeLayout) inflate;
                                ((RobertoTextView) relativeLayout.findViewById(R.id.tvLabel)).setText(it.next());
                                ((LinearLayout) d2Var._$_findCachedViewById(R.id.linearLayout)).addView(relativeLayout);
                            }
                            ((RobertoButton) d2Var._$_findCachedViewById(R.id.btnR2bButtonTwo)).setOnClickListener(new View.OnClickListener() { // from class: hr.c2
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    int i6 = d2.f18293z;
                                    d2 this$0 = d2Var;
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    String goalId = str;
                                    kotlin.jvm.internal.i.g(goalId, "$goalId");
                                    ScreenResult25Model model = screenResult25Model;
                                    kotlin.jvm.internal.i.g(model, "$model");
                                    if (z10 && z11) {
                                        TemplateActivity templateActivity4 = this$0.f18295v;
                                        if (templateActivity4 != null) {
                                            templateActivity4.K0(true);
                                            fm.a aVar = (fm.a) this$0.f18296w.getValue();
                                            aVar.f15174h0.e(this$0.getViewLifecycleOwner(), new a2(1, new e2(this$0)));
                                            aVar.j(model, goalId);
                                            return;
                                        }
                                        kotlin.jvm.internal.i.q("act");
                                        throw null;
                                    }
                                    TemplateActivity templateActivity5 = this$0.f18295v;
                                    if (templateActivity5 != null) {
                                        templateActivity5.t0();
                                    } else {
                                        kotlin.jvm.internal.i.q("act");
                                        throw null;
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
                z11 = false;
                it = screenResult25Model.getList().iterator();
                while (it.hasNext()) {
                }
                ((RobertoButton) d2Var._$_findCachedViewById(R.id.btnR2bButtonTwo)).setOnClickListener(new View.OnClickListener() { // from class: hr.c2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i6 = d2.f18293z;
                        d2 this$0 = d2Var;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        String goalId = str;
                        kotlin.jvm.internal.i.g(goalId, "$goalId");
                        ScreenResult25Model model = screenResult25Model;
                        kotlin.jvm.internal.i.g(model, "$model");
                        if (z10 && z11) {
                            TemplateActivity templateActivity4 = this$0.f18295v;
                            if (templateActivity4 != null) {
                                templateActivity4.K0(true);
                                fm.a aVar = (fm.a) this$0.f18296w.getValue();
                                aVar.f15174h0.e(this$0.getViewLifecycleOwner(), new a2(1, new e2(this$0)));
                                aVar.j(model, goalId);
                                return;
                            }
                            kotlin.jvm.internal.i.q("act");
                            throw null;
                        }
                        TemplateActivity templateActivity5 = this$0.f18295v;
                        if (templateActivity5 != null) {
                            templateActivity5.t0();
                        } else {
                            kotlin.jvm.internal.i.q("act");
                            throw null;
                        }
                    }
                });
                return;
            }
            kotlin.jvm.internal.i.q("act");
            throw null;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(d2Var.f18294u, "exception in reading list from firebase", e10);
        }
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f18298y;
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
        return inflater.inflate(R.layout.fragment_screen_result_2b, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        fm.a aVar = (fm.a) this.f18296w.getValue();
        aVar.f15174h0.k(getViewLifecycleOwner());
        aVar.f15177k0.k(getViewLifecycleOwner());
        aVar.f15178l0.k(getViewLifecycleOwner());
        aVar.f15180n0.k(getViewLifecycleOwner());
        aVar.f15181o0.k(getViewLifecycleOwner());
        aVar.f15182p0.k(getViewLifecycleOwner());
        aVar.w();
        super.onDestroyView();
        this.f18298y.clear();
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
            this.f18295v = templateActivity;
            HashMap<String, Object> A0 = templateActivity.A0();
            ((RobertoTextView) _$_findCachedViewById(R.id.tvR2bTitle)).setText(UtilFunKt.paramsMapToString(A0.get("r25_title")));
            ((RobertoTextView) _$_findCachedViewById(R.id.tvR2bHeading)).setText(UtilFunKt.paramsMapToString(A0.get("r25_heading")));
            ((RobertoTextView) _$_findCachedViewById(R.id.tvR2bDesc)).setText(UtilFunKt.paramsMapToString(A0.get("r25_desc")));
            ((RobertoButton) _$_findCachedViewById(R.id.btnR2bButtonOne)).setText(UtilFunKt.paramsMapToString(A0.get("r25_btn_one_text")));
            ((RobertoButton) _$_findCachedViewById(R.id.btnR2bButtonTwo)).setText(UtilFunKt.paramsMapToString(A0.get("r25_btn_two_text")));
            TemplateActivity templateActivity2 = this.f18295v;
            if (templateActivity2 != null) {
                TemplateModel templateModel = templateActivity2.f10547y;
                if (templateModel != null && (label = templateModel.getLabel()) != null) {
                    fm.a aVar = (fm.a) this.f18296w.getValue();
                    aVar.f15178l0.e(getViewLifecycleOwner(), new m0(29, new a(aVar, label)));
                    aVar.f15181o0.e(getViewLifecycleOwner(), new a2(0, new b(label)));
                    aVar.m(label, "result_25");
                    ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new View.OnClickListener(this) { // from class: hr.b2

                        /* renamed from: v  reason: collision with root package name */
                        public final /* synthetic */ d2 f18185v;

                        {
                            this.f18185v = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            int i6 = r2;
                            d2 this$0 = this.f18185v;
                            switch (i6) {
                                case 0:
                                    int i10 = d2.f18293z;
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    TemplateActivity templateActivity3 = this$0.f18295v;
                                    if (templateActivity3 != null) {
                                        templateActivity3.o0();
                                        return;
                                    } else {
                                        kotlin.jvm.internal.i.q("act");
                                        throw null;
                                    }
                                default:
                                    int i11 = d2.f18293z;
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    TemplateActivity templateActivity4 = this$0.f18295v;
                                    if (templateActivity4 != null) {
                                        templateActivity4.onBackPressed();
                                        return;
                                    } else {
                                        kotlin.jvm.internal.i.q("act");
                                        throw null;
                                    }
                            }
                        }
                    });
                    ((RobertoButton) _$_findCachedViewById(R.id.btnR2bButtonOne)).setOnClickListener(new View.OnClickListener(this) { // from class: hr.b2

                        /* renamed from: v  reason: collision with root package name */
                        public final /* synthetic */ d2 f18185v;

                        {
                            this.f18185v = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            int i6 = r2;
                            d2 this$0 = this.f18185v;
                            switch (i6) {
                                case 0:
                                    int i10 = d2.f18293z;
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    TemplateActivity templateActivity3 = this$0.f18295v;
                                    if (templateActivity3 != null) {
                                        templateActivity3.o0();
                                        return;
                                    } else {
                                        kotlin.jvm.internal.i.q("act");
                                        throw null;
                                    }
                                default:
                                    int i11 = d2.f18293z;
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    TemplateActivity templateActivity4 = this$0.f18295v;
                                    if (templateActivity4 != null) {
                                        templateActivity4.onBackPressed();
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
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f18294u, "exception", e10);
        }
    }
}
