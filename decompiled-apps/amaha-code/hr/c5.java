package hr;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.o0;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.model.ScreenResult28Model;
import com.theinnerhour.b2b.model.TemplateModel;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UtilFunKt;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoEditText;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: ScreenS122Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhr/c5;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class c5 extends rr.b {
    public static final /* synthetic */ int C = 0;
    public final androidx.lifecycle.m0 A;
    public final LinkedHashMap B = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f18233u = LogHelper.INSTANCE.makeLogTag(c5.class);

    /* renamed from: v  reason: collision with root package name */
    public final ArrayList<String> f18234v;

    /* renamed from: w  reason: collision with root package name */
    public HashMap<String, Object> f18235w;

    /* renamed from: x  reason: collision with root package name */
    public int f18236x;

    /* renamed from: y  reason: collision with root package name */
    public final ScreenResult28Model f18237y;

    /* renamed from: z  reason: collision with root package name */
    public final String f18238z;

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.a<androidx.lifecycle.q0> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f18239u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Fragment fragment) {
            super(0);
            this.f18239u = fragment;
        }

        @Override // ss.a
        public final androidx.lifecycle.q0 invoke() {
            return defpackage.e.m(this.f18239u, "requireActivity().viewModelStore");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.a<k1.a> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f18240u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Fragment fragment) {
            super(0);
            this.f18240u = fragment;
        }

        @Override // ss.a
        public final k1.a invoke() {
            return defpackage.b.r(this.f18240u, "requireActivity().defaultViewModelCreationExtras");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class c extends kotlin.jvm.internal.k implements ss.a<o0.b> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f18241u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f18241u = fragment;
        }

        @Override // ss.a
        public final o0.b invoke() {
            return pl.a.e(this.f18241u, "requireActivity().defaultViewModelProviderFactory");
        }
    }

    public c5() {
        new ArrayList();
        new ArrayList();
        this.f18234v = new ArrayList<>();
        this.f18235w = new HashMap<>();
        this.f18237y = new ScreenResult28Model(Utils.INSTANCE.getTimeInSeconds());
        this.f18238z = "result_28";
        this.A = kotlin.jvm.internal.b0.j(this, kotlin.jvm.internal.y.a(fm.a.class), new a(this), new b(this), new c(this));
    }

    @Override // rr.b
    public final boolean I() {
        int i6 = this.f18236x;
        if (i6 > 0) {
            this.f18236x = i6 - 1;
            M();
            return false;
        }
        return true;
    }

    public final boolean J() {
        boolean z10;
        Editable text = ((RobertoEditText) _$_findCachedViewById(R.id.etAddNew)).getText();
        if (text != null && text.length() != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            Utils utils = Utils.INSTANCE;
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.d(activity);
            String string = getString(R.string.enter_text);
            kotlin.jvm.internal.i.f(string, "getString(R.string.enter_text)");
            utils.showCustomToast(activity, string);
            return false;
        }
        this.f18234v.add(String.valueOf(((RobertoEditText) _$_findCachedViewById(R.id.etAddNew)).getText()));
        androidx.fragment.app.p activity2 = getActivity();
        kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
        ((TemplateActivity) activity2).F.put("s122_user_data", String.valueOf(((RobertoEditText) _$_findCachedViewById(R.id.etAddNew)).getText()));
        return true;
    }

    public final fm.a K() {
        return (fm.a) this.A.getValue();
    }

    public final void M() {
        try {
            int i6 = this.f18236x;
            if (i6 >= 4) {
                androidx.fragment.app.p activity = getActivity();
                kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                HashMap<String, Object> hashMap = ((TemplateActivity) activity).F;
                hashMap.put("list", this.f18234v);
                hashMap.put("3u_model", this.f18237y);
                androidx.fragment.app.p activity2 = getActivity();
                kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                ((TemplateActivity) activity2).s0(new w8());
                return;
            }
            if (i6 != 0) {
                if (i6 != 1) {
                    if (i6 != 2) {
                        if (i6 == 3) {
                            Q(UtilFunKt.paramsMapToString(this.f18235w.get("s122_four_question")), UtilFunKt.paramsMapToString(this.f18235w.get("s122_four_btn_one_text")), UtilFunKt.paramsMapToString(this.f18235w.get("s122_four_btn_two_text")));
                        }
                    } else {
                        Q(UtilFunKt.paramsMapToString(this.f18235w.get("s122_three_question")), UtilFunKt.paramsMapToString(this.f18235w.get("s122_three_btn_one_text")), UtilFunKt.paramsMapToString(this.f18235w.get("s122_three_btn_two_text")));
                    }
                } else {
                    P();
                    Q(UtilFunKt.paramsMapToString(this.f18235w.get("s122_two_question")), UtilFunKt.paramsMapToString(this.f18235w.get("s122_two_btn_one_text")), UtilFunKt.paramsMapToString(this.f18235w.get("s122_two_btn_two_text")));
                }
            } else {
                O();
                ((RobertoTextView) _$_findCachedViewById(R.id.tvS122Header)).setText(UtilFunKt.paramsMapToString(this.f18235w.get("s122_one_heading")));
                ((RobertoTextView) _$_findCachedViewById(R.id.tvS122QuesOne)).setText(UtilFunKt.paramsMapToString(this.f18235w.get("s122_one_question")));
                ((RobertoEditText) _$_findCachedViewById(R.id.etAddNew)).setHint(UtilFunKt.paramsMapToString(this.f18235w.get("s122_one_placeholder")));
                ((RobertoButton) _$_findCachedViewById(R.id.btnS122Button)).setText(UtilFunKt.paramsMapToString(this.f18235w.get("s122_one_btn_text")));
            }
            ObjectAnimator ofInt = ObjectAnimator.ofInt((ProgressBar) _$_findCachedViewById(R.id.progressBar), Constants.SCREEN_PROGRESS, ((ProgressBar) _$_findCachedViewById(R.id.progressBar)).getProgress(), ((this.f18236x + 1) * 100) / 4);
            ofInt.setInterpolator(new AccelerateInterpolator());
            ofInt.start();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f18233u, "Exception", e10);
        }
    }

    public final void O() {
        try {
            ((RobertoButton) _$_findCachedViewById(R.id.btnS122ButtonYes)).setVisibility(8);
            ((RobertoButton) _$_findCachedViewById(R.id.btnS122ButtonNo)).setVisibility(8);
            ((RobertoTextView) _$_findCachedViewById(R.id.tvS122Question)).setVisibility(8);
            ((RobertoButton) _$_findCachedViewById(R.id.btnS122Button)).setVisibility(0);
            ((RobertoTextView) _$_findCachedViewById(R.id.tvS122Header)).setVisibility(0);
            ((RelativeLayout) _$_findCachedViewById(R.id.rlAddNew)).setVisibility(0);
            ((RobertoTextView) _$_findCachedViewById(R.id.tvS122QuesOne)).setVisibility(0);
            ((RobertoEditText) _$_findCachedViewById(R.id.etAddNew)).setVisibility(0);
            ((RobertoButton) _$_findCachedViewById(R.id.btnS122Button)).setVisibility(0);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f18233u, "Exception", e10);
        }
    }

    public final void P() {
        try {
            ((RobertoButton) _$_findCachedViewById(R.id.btnS122ButtonYes)).setVisibility(0);
            ((RobertoButton) _$_findCachedViewById(R.id.btnS122ButtonNo)).setVisibility(0);
            ((RobertoTextView) _$_findCachedViewById(R.id.tvS122Question)).setVisibility(0);
            ((RobertoButton) _$_findCachedViewById(R.id.btnS122Button)).setVisibility(8);
            ((RobertoTextView) _$_findCachedViewById(R.id.tvS122Header)).setVisibility(8);
            ((RelativeLayout) _$_findCachedViewById(R.id.rlAddNew)).setVisibility(8);
            ((RobertoTextView) _$_findCachedViewById(R.id.tvS122QuesOne)).setVisibility(8);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f18233u, "Exception", e10);
        }
    }

    public final void Q(String str, String str2, String str3) {
        try {
            ((RobertoTextView) _$_findCachedViewById(R.id.tvS122Question)).setText(str);
            ((RobertoButton) _$_findCachedViewById(R.id.btnS122ButtonYes)).setText(str2);
            ((RobertoButton) _$_findCachedViewById(R.id.btnS122ButtonNo)).setText(str3);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f18233u, "exception", e10);
        }
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.B;
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
        return inflater.inflate(R.layout.fragment_screen_s122, viewGroup, false);
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
        this.B.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String label;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            if (Utils.INSTANCE.getClearingFragmentBackStack()) {
                return;
            }
            this.f18236x = 0;
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            TemplateActivity templateActivity = (TemplateActivity) activity;
            this.f18235w = templateActivity.A0();
            templateActivity.B0();
            if (templateActivity.W) {
                fm.a K = K();
                TemplateModel templateModel = templateActivity.f10547y;
                if (templateModel != null && (label = templateModel.getLabel()) != null) {
                    K.m(label, this.f18238z);
                }
            }
            M();
            ((RobertoButton) _$_findCachedViewById(R.id.btnS122Button)).setOnClickListener(new View.OnClickListener(this) { // from class: hr.y4

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ c5 f19413v;

                {
                    this.f19413v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i6 = r2;
                    c5 this$0 = this.f19413v;
                    switch (i6) {
                        case 0:
                            int i10 = c5.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            ScreenResult28Model screenResult28Model = this$0.f18237y;
                            try {
                                int i11 = this$0.f18236x;
                                if (i11 == 0) {
                                    if (this$0.J()) {
                                        screenResult28Model.setSituation(String.valueOf(((RobertoEditText) this$0._$_findCachedViewById(R.id.etAddNew)).getText()));
                                        screenResult28Model.getAnswers().clear();
                                        this$0.f18236x++;
                                        this$0.M();
                                    }
                                } else {
                                    this$0.f18236x = i11 + 1;
                                    this$0.M();
                                }
                                return;
                            } catch (Exception e10) {
                                LogHelper.INSTANCE.e(this$0.f18233u, "Exception", e10);
                                return;
                            }
                        case 1:
                            int i12 = c5.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.f18237y.getAnswers().add("Yes");
                            this$0.f18234v.add("Yes");
                            this$0.f18236x++;
                            this$0.M();
                            return;
                        default:
                            int i13 = c5.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            androidx.appcompat.widget.a1 a1Var = new androidx.appcompat.widget.a1(this$0.requireContext(), (ImageView) this$0._$_findCachedViewById(R.id.ivEllipses));
                            a1Var.a().inflate(R.menu.logs_menu, a1Var.f1344b);
                            a1Var.f1346d = new fq.s(this$0, 23);
                            a1Var.b();
                            return;
                    }
                }
            });
            if (templateActivity.J) {
                HashMap<String, Object> hashMap = templateActivity.F;
                if (hashMap.containsKey("s122_user_data")) {
                    Object obj = hashMap.get("s122_user_data");
                    kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type kotlin.String");
                    ((RobertoEditText) _$_findCachedViewById(R.id.etAddNew)).setText((String) obj);
                }
            }
            ((RobertoButton) _$_findCachedViewById(R.id.btnS122ButtonYes)).setOnClickListener(new View.OnClickListener(this) { // from class: hr.y4

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ c5 f19413v;

                {
                    this.f19413v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i6 = r2;
                    c5 this$0 = this.f19413v;
                    switch (i6) {
                        case 0:
                            int i10 = c5.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            ScreenResult28Model screenResult28Model = this$0.f18237y;
                            try {
                                int i11 = this$0.f18236x;
                                if (i11 == 0) {
                                    if (this$0.J()) {
                                        screenResult28Model.setSituation(String.valueOf(((RobertoEditText) this$0._$_findCachedViewById(R.id.etAddNew)).getText()));
                                        screenResult28Model.getAnswers().clear();
                                        this$0.f18236x++;
                                        this$0.M();
                                    }
                                } else {
                                    this$0.f18236x = i11 + 1;
                                    this$0.M();
                                }
                                return;
                            } catch (Exception e10) {
                                LogHelper.INSTANCE.e(this$0.f18233u, "Exception", e10);
                                return;
                            }
                        case 1:
                            int i12 = c5.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.f18237y.getAnswers().add("Yes");
                            this$0.f18234v.add("Yes");
                            this$0.f18236x++;
                            this$0.M();
                            return;
                        default:
                            int i13 = c5.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            androidx.appcompat.widget.a1 a1Var = new androidx.appcompat.widget.a1(this$0.requireContext(), (ImageView) this$0._$_findCachedViewById(R.id.ivEllipses));
                            a1Var.a().inflate(R.menu.logs_menu, a1Var.f1344b);
                            a1Var.f1346d = new fq.s(this$0, 23);
                            a1Var.b();
                            return;
                    }
                }
            });
            ((RobertoButton) _$_findCachedViewById(R.id.btnS122ButtonNo)).setOnClickListener(new sq.p(this, 15, templateActivity));
            ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new i4(templateActivity, 8));
            ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setVisibility(0);
            ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setOnClickListener(new View.OnClickListener(this) { // from class: hr.y4

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ c5 f19413v;

                {
                    this.f19413v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i6 = r2;
                    c5 this$0 = this.f19413v;
                    switch (i6) {
                        case 0:
                            int i10 = c5.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            ScreenResult28Model screenResult28Model = this$0.f18237y;
                            try {
                                int i11 = this$0.f18236x;
                                if (i11 == 0) {
                                    if (this$0.J()) {
                                        screenResult28Model.setSituation(String.valueOf(((RobertoEditText) this$0._$_findCachedViewById(R.id.etAddNew)).getText()));
                                        screenResult28Model.getAnswers().clear();
                                        this$0.f18236x++;
                                        this$0.M();
                                    }
                                } else {
                                    this$0.f18236x = i11 + 1;
                                    this$0.M();
                                }
                                return;
                            } catch (Exception e10) {
                                LogHelper.INSTANCE.e(this$0.f18233u, "Exception", e10);
                                return;
                            }
                        case 1:
                            int i12 = c5.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.f18237y.getAnswers().add("Yes");
                            this$0.f18234v.add("Yes");
                            this$0.f18236x++;
                            this$0.M();
                            return;
                        default:
                            int i13 = c5.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            androidx.appcompat.widget.a1 a1Var = new androidx.appcompat.widget.a1(this$0.requireContext(), (ImageView) this$0._$_findCachedViewById(R.id.ivEllipses));
                            a1Var.a().inflate(R.menu.logs_menu, a1Var.f1344b);
                            a1Var.f1346d = new fq.s(this$0, 23);
                            a1Var.b();
                            return;
                    }
                }
            });
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f18233u, "exception", e10);
        }
    }
}
