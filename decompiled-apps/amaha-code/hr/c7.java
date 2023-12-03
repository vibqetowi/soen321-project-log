package hr;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.model.Goal;
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
/* compiled from: ScreenS29Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhr/c7;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class c7 extends rr.b {
    public static final /* synthetic */ int D = 0;
    public TemplateActivity B;

    /* renamed from: z  reason: collision with root package name */
    public int f18259z;
    public final LinkedHashMap C = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f18254u = LogHelper.INSTANCE.makeLogTag(c7.class);

    /* renamed from: v  reason: collision with root package name */
    public ArrayList<String> f18255v = new ArrayList<>();

    /* renamed from: w  reason: collision with root package name */
    public ArrayList<String> f18256w = new ArrayList<>();

    /* renamed from: x  reason: collision with root package name */
    public ArrayList<String> f18257x = new ArrayList<>();

    /* renamed from: y  reason: collision with root package name */
    public HashMap<String, Object> f18258y = new HashMap<>();
    public String A = "";

    public static void Z(int i6, ConstraintLayout constraintLayout, androidx.fragment.app.p pVar) {
        try {
            androidx.constraintlayout.widget.b bVar = new androidx.constraintlayout.widget.b();
            bVar.e(i6, pVar);
            bVar.b(constraintLayout);
            h2.b bVar2 = new h2.b();
            bVar2.f17045x = new AccelerateDecelerateInterpolator();
            h2.o.a(constraintLayout, bVar2);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e("ih_showSearch", "exception", e10);
        }
    }

    @Override // rr.b
    public final boolean I() {
        String str;
        rr.b p3Var;
        if (((RobertoEditText) _$_findCachedViewById(R.id.editTextAdd)).hasFocus()) {
            ((RobertoEditText) _$_findCachedViewById(R.id.editTextAdd)).clearFocus();
            Z(R.layout.fragment_screen_s29_search_hidden, (ConstraintLayout) _$_findCachedViewById(R.id.constraintRoot), getActivity());
            return false;
        }
        int i6 = this.f18259z;
        if (i6 > 0) {
            this.f18259z = i6 - 1;
            Y();
            return false;
        }
        androidx.fragment.app.p activity = getActivity();
        kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
        if (((TemplateActivity) activity).getIntent().hasExtra("source") && kotlin.jvm.internal.i.b(P().getIntent().getStringExtra("source"), "goals") && this.f18259z == 0) {
            ArrayList k10 = ca.a.k("HeDKoBM3U4UoRTGsy0TE", "e4VaAGYWhfIoFD0PGt6e");
            androidx.fragment.app.p activity2 = getActivity();
            kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            Goal y02 = ((TemplateActivity) activity2).y0();
            if (y02 != null) {
                str = y02.getGoalId();
            } else {
                str = null;
            }
            if (!is.u.Z1(k10, str)) {
                androidx.fragment.app.p activity3 = getActivity();
                kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                Goal y03 = ((TemplateActivity) activity3).y0();
                kotlin.jvm.internal.i.d(y03);
                if (kotlin.jvm.internal.i.b(y03.getGoalId(), "HeDKoBM3U4UoRTGsy0TE")) {
                    androidx.fragment.app.p activity4 = getActivity();
                    kotlin.jvm.internal.i.e(activity4, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                    if (((TemplateActivity) activity4).F.containsKey("result_6_initial_val")) {
                        HashMap<String, Object> hashMap = P().F;
                        Object obj = P().F.get("result_6_initial_val");
                        kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                        hashMap.put("list", (ArrayList) obj);
                    }
                }
                androidx.fragment.app.p activity5 = getActivity();
                kotlin.jvm.internal.i.e(activity5, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                ((TemplateActivity) activity5).Q = true;
                androidx.fragment.app.p activity6 = getActivity();
                kotlin.jvm.internal.i.e(activity6, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                TemplateActivity templateActivity = (TemplateActivity) activity6;
                if (P().W) {
                    p3Var = new s3();
                } else {
                    p3Var = new p3();
                }
                templateActivity.s0(p3Var);
                return false;
            }
        }
        return true;
    }

    public final void J(String str) {
        try {
            if (!this.f18255v.contains(str)) {
                this.f18255v.add(str);
                K(str);
                ((ScrollView) _$_findCachedViewById(R.id.scrollView)).postDelayed(new b7(this, 2), 500L);
            } else {
                I();
                Utils utils = Utils.INSTANCE;
                androidx.fragment.app.p activity = getActivity();
                kotlin.jvm.internal.i.d(activity);
                utils.showCustomToast(activity, "Item Already Exists");
            }
            Q();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f18254u, "exception", e10);
        }
    }

    public final void K(String str) {
        try {
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.d(activity);
            View inflate = activity.getLayoutInflater().inflate(R.layout.row_card_text_image, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.linearLayout2)), false);
            kotlin.jvm.internal.i.e(inflate, "null cannot be cast to non-null type android.widget.RelativeLayout");
            RelativeLayout relativeLayout = (RelativeLayout) inflate;
            ((RobertoTextView) relativeLayout.findViewById(R.id.textView)).setText(str);
            ((ImageView) relativeLayout.findViewById(R.id.imageView)).setImageResource(0);
            ((ImageView) relativeLayout.findViewById(R.id.imageView)).setBackgroundResource(0);
            relativeLayout.setOnClickListener(new sq.p(this, 23, str));
            ((LinearLayout) _$_findCachedViewById(R.id.linearLayout2)).addView(relativeLayout);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f18254u, "Exception", e10);
        }
    }

    public final boolean M() {
        boolean z10;
        Editable text = ((RobertoEditText) _$_findCachedViewById(R.id.editText)).getText();
        if (text != null && text.length() != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            if (this.f18258y.containsKey("s29_error_input")) {
                Utils utils = Utils.INSTANCE;
                androidx.fragment.app.p activity = getActivity();
                kotlin.jvm.internal.i.d(activity);
                utils.showCustomToast(activity, UtilFunKt.paramsMapToString(this.f18258y.get("s29_error_input")));
                return false;
            }
            Utils utils2 = Utils.INSTANCE;
            androidx.fragment.app.p activity2 = getActivity();
            kotlin.jvm.internal.i.d(activity2);
            String string = getString(R.string.enter_text);
            kotlin.jvm.internal.i.f(string, "getString(R.string.enter_text)");
            utils2.showCustomToast(activity2, string);
            return false;
        }
        if (this.f18259z < this.f18257x.size()) {
            this.f18257x.set(this.f18259z, String.valueOf(((RobertoEditText) _$_findCachedViewById(R.id.editText)).getText()));
        } else {
            this.f18257x.add(String.valueOf(((RobertoEditText) _$_findCachedViewById(R.id.editText)).getText()));
        }
        return true;
    }

    public final boolean O() {
        if (kotlin.jvm.internal.i.b(String.valueOf(((RobertoEditText) _$_findCachedViewById(R.id.editTextAdd)).getText()), "")) {
            if (this.f18258y.containsKey("s29_error_input")) {
                Utils utils = Utils.INSTANCE;
                androidx.fragment.app.p activity = getActivity();
                kotlin.jvm.internal.i.d(activity);
                utils.showCustomToast(activity, UtilFunKt.paramsMapToString(this.f18258y.get("s29_error_input")));
            } else {
                Utils utils2 = Utils.INSTANCE;
                androidx.fragment.app.p activity2 = getActivity();
                kotlin.jvm.internal.i.d(activity2);
                String string = getString(R.string.select_option);
                kotlin.jvm.internal.i.f(string, "getString(R.string.select_option)");
                utils2.showCustomToast(activity2, string);
            }
            return false;
        }
        if (this.f18259z < this.f18257x.size()) {
            this.f18257x.set(this.f18259z, String.valueOf(((RobertoEditText) _$_findCachedViewById(R.id.editTextAdd)).getText()));
        } else {
            this.f18257x.add(String.valueOf(((RobertoEditText) _$_findCachedViewById(R.id.editTextAdd)).getText()));
        }
        return true;
    }

    public final TemplateActivity P() {
        TemplateActivity templateActivity = this.B;
        if (templateActivity != null) {
            return templateActivity;
        }
        kotlin.jvm.internal.i.q("act");
        throw null;
    }

    public final void Q() {
        if (((RobertoEditText) _$_findCachedViewById(R.id.editText)).hasFocus()) {
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            Context context = getContext();
            kotlin.jvm.internal.i.d(context);
            RobertoEditText editText = (RobertoEditText) _$_findCachedViewById(R.id.editText);
            kotlin.jvm.internal.i.f(editText, "editText");
            ((TemplateActivity) activity).D0(context, editText);
            return;
        }
        androidx.fragment.app.p activity2 = getActivity();
        kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
        Context context2 = getContext();
        kotlin.jvm.internal.i.d(context2);
        RobertoEditText editTextAdd = (RobertoEditText) _$_findCachedViewById(R.id.editTextAdd);
        kotlin.jvm.internal.i.f(editTextAdd, "editTextAdd");
        ((TemplateActivity) activity2).D0(context2, editTextAdd);
    }

    public final void S(String str, String str2, String str3) {
        try {
            this.f18255v.clear();
            this.f18255v = UtilFunKt.paramsMapToList(this.f18258y.get("s29_one_suggest_list"));
            b0(str2);
            a0(str3);
            if (this.f18257x.size() > 0) {
                ((RobertoEditText) _$_findCachedViewById(R.id.editTextAdd)).post(new b7(this, 1));
                ((ImageButton) _$_findCachedViewById(R.id.textAdd)).setVisibility(8);
                Z(R.layout.fragment_screen_s29_search_hidden, (ConstraintLayout) _$_findCachedViewById(R.id.constraintRoot), getActivity());
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f18254u, "exception", e10);
        }
    }

    public final void U(String str) {
        try {
            ((RobertoEditText) _$_findCachedViewById(R.id.editTextAdd)).setText(str);
            I();
            ((ImageButton) _$_findCachedViewById(R.id.textAdd)).setVisibility(8);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f18254u, "exception", e10);
        }
    }

    public final void X(String str, String str2) {
        try {
            b0(str);
            c0(str2);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f18254u, "Exception", e10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x012f A[Catch: Exception -> 0x0223, TryCatch #0 {Exception -> 0x0223, blocks: (B:3:0x0004, B:5:0x000e, B:7:0x0038, B:9:0x0049, B:11:0x0054, B:10:0x004f, B:13:0x0058, B:15:0x0069, B:17:0x007d, B:19:0x0081, B:21:0x0097, B:23:0x009d, B:25:0x00a3, B:27:0x00bc, B:29:0x012f, B:40:0x0142, B:41:0x015f, B:42:0x017b, B:43:0x0197, B:44:0x01b3, B:45:0x01cf, B:46:0x01ec, B:26:0x00b0), top: B:51:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Y() {
        String str;
        rr.b p3Var;
        try {
            if (this.f18259z >= this.f18256w.size()) {
                androidx.fragment.app.p activity = getActivity();
                kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                HashMap<String, Object> hashMap = ((TemplateActivity) activity).F;
                hashMap.put("headings", this.f18256w);
                hashMap.put("list", this.f18257x);
                hashMap.put("s29_user_list", this.f18257x);
                if (this.f18258y.containsKey("r6_heading")) {
                    androidx.fragment.app.p activity2 = getActivity();
                    kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                    TemplateActivity templateActivity = (TemplateActivity) activity2;
                    if (P().W) {
                        p3Var = new s3();
                    } else {
                        p3Var = new p3();
                    }
                    templateActivity.s0(p3Var);
                    return;
                }
                return;
            }
            if (P().getIntent().hasExtra("source") && kotlin.jvm.internal.i.b(P().getIntent().getStringExtra("source"), "goals") && this.f18259z == 0) {
                ArrayList k10 = ca.a.k("HeDKoBM3U4UoRTGsy0TE", "e4VaAGYWhfIoFD0PGt6e");
                Goal y02 = P().y0();
                if (y02 != null) {
                    str = y02.getGoalId();
                } else {
                    str = null;
                }
                if (is.u.Z1(k10, str)) {
                    ((ImageView) _$_findCachedViewById(R.id.ivClose)).setImageResource(R.drawable.ic_wrong);
                    ((ScrollView) _$_findCachedViewById(R.id.scrollView)).setVisibility(8);
                    ((RelativeLayout) _$_findCachedViewById(R.id.linearLayoutAdd)).setVisibility(8);
                    ((RobertoEditText) _$_findCachedViewById(R.id.editText)).setVisibility(8);
                    ((RobertoTextView) _$_findCachedViewById(R.id.question)).setVisibility(8);
                    ((RobertoTextView) _$_findCachedViewById(R.id.subHeading)).setVisibility(8);
                    ((RobertoTextView) _$_findCachedViewById(R.id.tvListSelection)).setVisibility(8);
                    ((RobertoTextView) _$_findCachedViewById(R.id.question)).setText(this.f18256w.get(this.f18259z));
                    ((RobertoTextView) _$_findCachedViewById(R.id.question)).setVisibility(0);
                    if (kotlin.jvm.internal.i.b(this.A, "s29")) {
                        int i6 = this.f18259z;
                        if (i6 != 0) {
                            if (i6 != 1) {
                                if (i6 != 2) {
                                    if (i6 != 3) {
                                        if (i6 != 4) {
                                            if (i6 == 5) {
                                                X(UtilFunKt.paramsMapToString(this.f18258y.get("s29_six_sub_heading")), UtilFunKt.paramsMapToString(this.f18258y.get("s29_six_placeholder")));
                                            }
                                        } else {
                                            X(UtilFunKt.paramsMapToString(this.f18258y.get("s29_five_sub_heading")), UtilFunKt.paramsMapToString(this.f18258y.get("s29_five_placeholder")));
                                        }
                                    } else {
                                        X(UtilFunKt.paramsMapToString(this.f18258y.get("s29_four_sub_heading")), UtilFunKt.paramsMapToString(this.f18258y.get("s29_four_placeholder")));
                                    }
                                } else {
                                    X(UtilFunKt.paramsMapToString(this.f18258y.get("s29_three_sub_heading")), UtilFunKt.paramsMapToString(this.f18258y.get("s29_three_placeholder")));
                                }
                            } else {
                                X(UtilFunKt.paramsMapToString(this.f18258y.get("s29_two_sub_heading")), UtilFunKt.paramsMapToString(this.f18258y.get("s29_two_placeholder")));
                            }
                        } else {
                            S("s29_one_suggest_list", UtilFunKt.paramsMapToString(this.f18258y.get("s29_one_sub_heading")), UtilFunKt.paramsMapToString(this.f18258y.get("s29_one_placeholder")));
                        }
                    }
                    ObjectAnimator ofInt = ObjectAnimator.ofInt((ProgressBar) _$_findCachedViewById(R.id.progressBar), Constants.SCREEN_PROGRESS, ((ProgressBar) _$_findCachedViewById(R.id.progressBar)).getProgress(), ((this.f18259z + 1) * 100) / this.f18256w.size());
                    ofInt.setInterpolator(new AccelerateInterpolator());
                    ofInt.start();
                }
            }
            ((ImageView) _$_findCachedViewById(R.id.ivClose)).setImageResource(R.drawable.ic_arrow_back);
            ((ScrollView) _$_findCachedViewById(R.id.scrollView)).setVisibility(8);
            ((RelativeLayout) _$_findCachedViewById(R.id.linearLayoutAdd)).setVisibility(8);
            ((RobertoEditText) _$_findCachedViewById(R.id.editText)).setVisibility(8);
            ((RobertoTextView) _$_findCachedViewById(R.id.question)).setVisibility(8);
            ((RobertoTextView) _$_findCachedViewById(R.id.subHeading)).setVisibility(8);
            ((RobertoTextView) _$_findCachedViewById(R.id.tvListSelection)).setVisibility(8);
            ((RobertoTextView) _$_findCachedViewById(R.id.question)).setText(this.f18256w.get(this.f18259z));
            ((RobertoTextView) _$_findCachedViewById(R.id.question)).setVisibility(0);
            if (kotlin.jvm.internal.i.b(this.A, "s29")) {
            }
            ObjectAnimator ofInt2 = ObjectAnimator.ofInt((ProgressBar) _$_findCachedViewById(R.id.progressBar), Constants.SCREEN_PROGRESS, ((ProgressBar) _$_findCachedViewById(R.id.progressBar)).getProgress(), ((this.f18259z + 1) * 100) / this.f18256w.size());
            ofInt2.setInterpolator(new AccelerateInterpolator());
            ofInt2.start();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f18254u, "Exception", e10);
        }
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.C;
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

    public final void a0(String str) {
        try {
            ((RelativeLayout) _$_findCachedViewById(R.id.linearLayoutAdd)).setVisibility(0);
            ((LinearLayout) _$_findCachedViewById(R.id.linearLayout2)).removeAllViews();
            ((RobertoEditText) _$_findCachedViewById(R.id.editTextAdd)).setHint(str);
            for (String str2 : this.f18255v) {
                K(str2);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f18254u, "Exception", e10);
        }
    }

    public final void b0(String str) {
        try {
            ((RobertoTextView) _$_findCachedViewById(R.id.subHeading)).setText(str);
            ((RobertoTextView) _$_findCachedViewById(R.id.subHeading)).setVisibility(0);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f18254u, "exception", e10);
        }
    }

    public final void c0(String str) {
        try {
            ((RobertoEditText) _$_findCachedViewById(R.id.editText)).setHint(str);
            boolean z10 = false;
            ((RobertoEditText) _$_findCachedViewById(R.id.editText)).setVisibility(0);
            if (this.f18259z < this.f18257x.size()) {
                String str2 = this.f18257x.get(this.f18259z);
                if (!((str2 == null || str2.length() == 0) ? true : true)) {
                    ((RobertoEditText) _$_findCachedViewById(R.id.editText)).setText(this.f18257x.get(this.f18259z));
                    return;
                }
            }
            ((RobertoEditText) _$_findCachedViewById(R.id.editText)).setText("");
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f18254u, "Exception", e10);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.g(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_screen_s29, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.C.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        rr.b p3Var;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            this.f18259z = 0;
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            this.B = (TemplateActivity) activity;
            if (Utils.INSTANCE.getClearingFragmentBackStack()) {
                return;
            }
            androidx.fragment.app.p activity2 = getActivity();
            kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            String str2 = null;
            if (((TemplateActivity) activity2).Q) {
                Goal y02 = P().y0();
                if (y02 != null) {
                    str = y02.getGoalId();
                } else {
                    str = null;
                }
                if (!kotlin.jvm.internal.i.b(str, "e4VaAGYWhfIoFD0PGt6e")) {
                    TemplateActivity P = P();
                    if (P().W) {
                        p3Var = new s3();
                    } else {
                        p3Var = new p3();
                    }
                    P.s0(p3Var);
                    return;
                }
            }
            Goal y03 = P().y0();
            if (y03 != null) {
                str2 = y03.getGoalId();
            }
            if (kotlin.jvm.internal.i.b(str2, "e4VaAGYWhfIoFD0PGt6e")) {
                P().I = false;
            }
            this.f18258y = P().A0();
            this.A = P().B0();
            ((RobertoButton) _$_findCachedViewById(R.id.button2)).setText(UtilFunKt.paramsMapToString(this.f18258y.get("s29_btn_two_text")));
            this.f18256w = UtilFunKt.paramsMapToList(this.f18258y.get("s29_question_list"));
            if (P().J && P().F.containsKey("s29_user_list")) {
                Object obj = P().F.get("s29_user_list");
                kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                this.f18257x = (ArrayList) obj;
            }
            Y();
            ((RobertoButton) _$_findCachedViewById(R.id.button2)).setOnClickListener(new View.OnClickListener(this) { // from class: hr.a7

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ c7 f18159v;

                {
                    this.f18159v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    String str3;
                    rr.b p3Var2;
                    int i6 = r2;
                    boolean z10 = true;
                    c7 this$0 = this.f18159v;
                    switch (i6) {
                        case 0:
                            int i10 = c7.D;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            try {
                                if (kotlin.jvm.internal.i.b(this$0.A, "s29")) {
                                    if (this$0.f18259z == 0) {
                                        if (this$0.O()) {
                                            this$0.f18259z++;
                                            this$0.Y();
                                        }
                                    } else if (this$0.M()) {
                                        this$0.f18259z++;
                                        this$0.Y();
                                    }
                                }
                                return;
                            } catch (Exception e10) {
                                LogHelper.INSTANCE.e(this$0.f18254u, "Exception", e10);
                                return;
                            }
                        case 1:
                            int i11 = c7.D;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            String valueOf = String.valueOf(((RobertoEditText) this$0._$_findCachedViewById(R.id.editTextAdd)).getText());
                            if (valueOf.length() != 0) {
                                z10 = false;
                            }
                            if (z10) {
                                if (this$0.f18258y.containsKey("s29_error_input")) {
                                    Utils utils = Utils.INSTANCE;
                                    androidx.fragment.app.p activity3 = this$0.getActivity();
                                    kotlin.jvm.internal.i.d(activity3);
                                    utils.showCustomToast(activity3, UtilFunKt.paramsMapToString(this$0.f18258y.get("s29_error_input")));
                                    return;
                                }
                                Utils utils2 = Utils.INSTANCE;
                                androidx.fragment.app.p activity4 = this$0.getActivity();
                                kotlin.jvm.internal.i.d(activity4);
                                String string = this$0.getString(R.string.enter_text);
                                kotlin.jvm.internal.i.f(string, "getString(R.string.enter_text)");
                                utils2.showCustomToast(activity4, string);
                                return;
                            }
                            this$0.J(valueOf);
                            this$0.U(valueOf);
                            return;
                        case 2:
                            int i12 = c7.D;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            Context context = this$0.getContext();
                            kotlin.jvm.internal.i.d(context);
                            androidx.appcompat.widget.a1 a1Var = new androidx.appcompat.widget.a1(context, (ImageView) this$0._$_findCachedViewById(R.id.ivEllipses));
                            a1Var.a().inflate(R.menu.logs_menu, a1Var.f1344b);
                            a1Var.f1346d = new hd.a(3, this$0);
                            a1Var.b();
                            return;
                        case 3:
                            int i13 = c7.D;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            androidx.fragment.app.p activity5 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity5, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                            if (((TemplateActivity) activity5).getIntent().hasExtra("source") && kotlin.jvm.internal.i.b(this$0.P().getIntent().getStringExtra("source"), "goals") && this$0.f18259z == 0) {
                                ArrayList k10 = ca.a.k("HeDKoBM3U4UoRTGsy0TE", "e4VaAGYWhfIoFD0PGt6e");
                                Goal y04 = this$0.P().y0();
                                if (y04 != null) {
                                    str3 = y04.getGoalId();
                                } else {
                                    str3 = null;
                                }
                                if (is.u.Z1(k10, str3)) {
                                    androidx.fragment.app.p activity6 = this$0.getActivity();
                                    kotlin.jvm.internal.i.e(activity6, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                    ((TemplateActivity) activity6).o0();
                                    return;
                                }
                                androidx.fragment.app.p activity7 = this$0.getActivity();
                                kotlin.jvm.internal.i.e(activity7, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                Goal y05 = ((TemplateActivity) activity7).y0();
                                kotlin.jvm.internal.i.d(y05);
                                if (kotlin.jvm.internal.i.b(y05.getGoalId(), "HeDKoBM3U4UoRTGsy0TE")) {
                                    androidx.fragment.app.p activity8 = this$0.getActivity();
                                    kotlin.jvm.internal.i.e(activity8, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                    if (((TemplateActivity) activity8).F.containsKey("result_6_initial_val")) {
                                        HashMap<String, Object> hashMap = this$0.P().F;
                                        Object obj2 = this$0.P().F.get("result_6_initial_val");
                                        kotlin.jvm.internal.i.e(obj2, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                                        hashMap.put("list", (ArrayList) obj2);
                                    }
                                }
                                androidx.fragment.app.p activity9 = this$0.getActivity();
                                kotlin.jvm.internal.i.e(activity9, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                ((TemplateActivity) activity9).Q = true;
                                androidx.fragment.app.p activity10 = this$0.getActivity();
                                kotlin.jvm.internal.i.e(activity10, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                TemplateActivity templateActivity = (TemplateActivity) activity10;
                                if (this$0.P().W) {
                                    p3Var2 = new s3();
                                } else {
                                    p3Var2 = new p3();
                                }
                                templateActivity.s0(p3Var2);
                                return;
                            }
                            this$0.P().onBackPressed();
                            return;
                        default:
                            int i14 = c7.D;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            androidx.fragment.app.p activity11 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity11, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                            HashMap<String, Object> hashMap2 = ((TemplateActivity) activity11).F;
                            hashMap2.put("headings", this$0.f18256w);
                            hashMap2.put("list", this$0.f18257x);
                            this$0.P().s0(new b0());
                            return;
                    }
                }
            });
            ((ImageButton) _$_findCachedViewById(R.id.textAdd)).setOnClickListener(new View.OnClickListener(this) { // from class: hr.a7

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ c7 f18159v;

                {
                    this.f18159v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    String str3;
                    rr.b p3Var2;
                    int i6 = r2;
                    boolean z10 = true;
                    c7 this$0 = this.f18159v;
                    switch (i6) {
                        case 0:
                            int i10 = c7.D;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            try {
                                if (kotlin.jvm.internal.i.b(this$0.A, "s29")) {
                                    if (this$0.f18259z == 0) {
                                        if (this$0.O()) {
                                            this$0.f18259z++;
                                            this$0.Y();
                                        }
                                    } else if (this$0.M()) {
                                        this$0.f18259z++;
                                        this$0.Y();
                                    }
                                }
                                return;
                            } catch (Exception e10) {
                                LogHelper.INSTANCE.e(this$0.f18254u, "Exception", e10);
                                return;
                            }
                        case 1:
                            int i11 = c7.D;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            String valueOf = String.valueOf(((RobertoEditText) this$0._$_findCachedViewById(R.id.editTextAdd)).getText());
                            if (valueOf.length() != 0) {
                                z10 = false;
                            }
                            if (z10) {
                                if (this$0.f18258y.containsKey("s29_error_input")) {
                                    Utils utils = Utils.INSTANCE;
                                    androidx.fragment.app.p activity3 = this$0.getActivity();
                                    kotlin.jvm.internal.i.d(activity3);
                                    utils.showCustomToast(activity3, UtilFunKt.paramsMapToString(this$0.f18258y.get("s29_error_input")));
                                    return;
                                }
                                Utils utils2 = Utils.INSTANCE;
                                androidx.fragment.app.p activity4 = this$0.getActivity();
                                kotlin.jvm.internal.i.d(activity4);
                                String string = this$0.getString(R.string.enter_text);
                                kotlin.jvm.internal.i.f(string, "getString(R.string.enter_text)");
                                utils2.showCustomToast(activity4, string);
                                return;
                            }
                            this$0.J(valueOf);
                            this$0.U(valueOf);
                            return;
                        case 2:
                            int i12 = c7.D;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            Context context = this$0.getContext();
                            kotlin.jvm.internal.i.d(context);
                            androidx.appcompat.widget.a1 a1Var = new androidx.appcompat.widget.a1(context, (ImageView) this$0._$_findCachedViewById(R.id.ivEllipses));
                            a1Var.a().inflate(R.menu.logs_menu, a1Var.f1344b);
                            a1Var.f1346d = new hd.a(3, this$0);
                            a1Var.b();
                            return;
                        case 3:
                            int i13 = c7.D;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            androidx.fragment.app.p activity5 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity5, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                            if (((TemplateActivity) activity5).getIntent().hasExtra("source") && kotlin.jvm.internal.i.b(this$0.P().getIntent().getStringExtra("source"), "goals") && this$0.f18259z == 0) {
                                ArrayList k10 = ca.a.k("HeDKoBM3U4UoRTGsy0TE", "e4VaAGYWhfIoFD0PGt6e");
                                Goal y04 = this$0.P().y0();
                                if (y04 != null) {
                                    str3 = y04.getGoalId();
                                } else {
                                    str3 = null;
                                }
                                if (is.u.Z1(k10, str3)) {
                                    androidx.fragment.app.p activity6 = this$0.getActivity();
                                    kotlin.jvm.internal.i.e(activity6, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                    ((TemplateActivity) activity6).o0();
                                    return;
                                }
                                androidx.fragment.app.p activity7 = this$0.getActivity();
                                kotlin.jvm.internal.i.e(activity7, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                Goal y05 = ((TemplateActivity) activity7).y0();
                                kotlin.jvm.internal.i.d(y05);
                                if (kotlin.jvm.internal.i.b(y05.getGoalId(), "HeDKoBM3U4UoRTGsy0TE")) {
                                    androidx.fragment.app.p activity8 = this$0.getActivity();
                                    kotlin.jvm.internal.i.e(activity8, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                    if (((TemplateActivity) activity8).F.containsKey("result_6_initial_val")) {
                                        HashMap<String, Object> hashMap = this$0.P().F;
                                        Object obj2 = this$0.P().F.get("result_6_initial_val");
                                        kotlin.jvm.internal.i.e(obj2, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                                        hashMap.put("list", (ArrayList) obj2);
                                    }
                                }
                                androidx.fragment.app.p activity9 = this$0.getActivity();
                                kotlin.jvm.internal.i.e(activity9, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                ((TemplateActivity) activity9).Q = true;
                                androidx.fragment.app.p activity10 = this$0.getActivity();
                                kotlin.jvm.internal.i.e(activity10, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                TemplateActivity templateActivity = (TemplateActivity) activity10;
                                if (this$0.P().W) {
                                    p3Var2 = new s3();
                                } else {
                                    p3Var2 = new p3();
                                }
                                templateActivity.s0(p3Var2);
                                return;
                            }
                            this$0.P().onBackPressed();
                            return;
                        default:
                            int i14 = c7.D;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            androidx.fragment.app.p activity11 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity11, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                            HashMap<String, Object> hashMap2 = ((TemplateActivity) activity11).F;
                            hashMap2.put("headings", this$0.f18256w);
                            hashMap2.put("list", this$0.f18257x);
                            this$0.P().s0(new b0());
                            return;
                    }
                }
            });
            ((ImageButton) _$_findCachedViewById(R.id.textAdd)).post(new b7(this, 0));
            ((RobertoEditText) _$_findCachedViewById(R.id.editTextAdd)).setOnEditorActionListener(new dl.w(11, this));
            ((RobertoEditText) _$_findCachedViewById(R.id.editTextAdd)).addTextChangedListener(new a());
            ((RobertoEditText) _$_findCachedViewById(R.id.editTextAdd)).setOnFocusChangeListener(new dc.b(10, this));
            ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setVisibility(0);
            ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setOnClickListener(new View.OnClickListener(this) { // from class: hr.a7

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ c7 f18159v;

                {
                    this.f18159v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    String str3;
                    rr.b p3Var2;
                    int i6 = r2;
                    boolean z10 = true;
                    c7 this$0 = this.f18159v;
                    switch (i6) {
                        case 0:
                            int i10 = c7.D;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            try {
                                if (kotlin.jvm.internal.i.b(this$0.A, "s29")) {
                                    if (this$0.f18259z == 0) {
                                        if (this$0.O()) {
                                            this$0.f18259z++;
                                            this$0.Y();
                                        }
                                    } else if (this$0.M()) {
                                        this$0.f18259z++;
                                        this$0.Y();
                                    }
                                }
                                return;
                            } catch (Exception e10) {
                                LogHelper.INSTANCE.e(this$0.f18254u, "Exception", e10);
                                return;
                            }
                        case 1:
                            int i11 = c7.D;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            String valueOf = String.valueOf(((RobertoEditText) this$0._$_findCachedViewById(R.id.editTextAdd)).getText());
                            if (valueOf.length() != 0) {
                                z10 = false;
                            }
                            if (z10) {
                                if (this$0.f18258y.containsKey("s29_error_input")) {
                                    Utils utils = Utils.INSTANCE;
                                    androidx.fragment.app.p activity3 = this$0.getActivity();
                                    kotlin.jvm.internal.i.d(activity3);
                                    utils.showCustomToast(activity3, UtilFunKt.paramsMapToString(this$0.f18258y.get("s29_error_input")));
                                    return;
                                }
                                Utils utils2 = Utils.INSTANCE;
                                androidx.fragment.app.p activity4 = this$0.getActivity();
                                kotlin.jvm.internal.i.d(activity4);
                                String string = this$0.getString(R.string.enter_text);
                                kotlin.jvm.internal.i.f(string, "getString(R.string.enter_text)");
                                utils2.showCustomToast(activity4, string);
                                return;
                            }
                            this$0.J(valueOf);
                            this$0.U(valueOf);
                            return;
                        case 2:
                            int i12 = c7.D;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            Context context = this$0.getContext();
                            kotlin.jvm.internal.i.d(context);
                            androidx.appcompat.widget.a1 a1Var = new androidx.appcompat.widget.a1(context, (ImageView) this$0._$_findCachedViewById(R.id.ivEllipses));
                            a1Var.a().inflate(R.menu.logs_menu, a1Var.f1344b);
                            a1Var.f1346d = new hd.a(3, this$0);
                            a1Var.b();
                            return;
                        case 3:
                            int i13 = c7.D;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            androidx.fragment.app.p activity5 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity5, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                            if (((TemplateActivity) activity5).getIntent().hasExtra("source") && kotlin.jvm.internal.i.b(this$0.P().getIntent().getStringExtra("source"), "goals") && this$0.f18259z == 0) {
                                ArrayList k10 = ca.a.k("HeDKoBM3U4UoRTGsy0TE", "e4VaAGYWhfIoFD0PGt6e");
                                Goal y04 = this$0.P().y0();
                                if (y04 != null) {
                                    str3 = y04.getGoalId();
                                } else {
                                    str3 = null;
                                }
                                if (is.u.Z1(k10, str3)) {
                                    androidx.fragment.app.p activity6 = this$0.getActivity();
                                    kotlin.jvm.internal.i.e(activity6, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                    ((TemplateActivity) activity6).o0();
                                    return;
                                }
                                androidx.fragment.app.p activity7 = this$0.getActivity();
                                kotlin.jvm.internal.i.e(activity7, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                Goal y05 = ((TemplateActivity) activity7).y0();
                                kotlin.jvm.internal.i.d(y05);
                                if (kotlin.jvm.internal.i.b(y05.getGoalId(), "HeDKoBM3U4UoRTGsy0TE")) {
                                    androidx.fragment.app.p activity8 = this$0.getActivity();
                                    kotlin.jvm.internal.i.e(activity8, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                    if (((TemplateActivity) activity8).F.containsKey("result_6_initial_val")) {
                                        HashMap<String, Object> hashMap = this$0.P().F;
                                        Object obj2 = this$0.P().F.get("result_6_initial_val");
                                        kotlin.jvm.internal.i.e(obj2, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                                        hashMap.put("list", (ArrayList) obj2);
                                    }
                                }
                                androidx.fragment.app.p activity9 = this$0.getActivity();
                                kotlin.jvm.internal.i.e(activity9, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                ((TemplateActivity) activity9).Q = true;
                                androidx.fragment.app.p activity10 = this$0.getActivity();
                                kotlin.jvm.internal.i.e(activity10, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                TemplateActivity templateActivity = (TemplateActivity) activity10;
                                if (this$0.P().W) {
                                    p3Var2 = new s3();
                                } else {
                                    p3Var2 = new p3();
                                }
                                templateActivity.s0(p3Var2);
                                return;
                            }
                            this$0.P().onBackPressed();
                            return;
                        default:
                            int i14 = c7.D;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            androidx.fragment.app.p activity11 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity11, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                            HashMap<String, Object> hashMap2 = ((TemplateActivity) activity11).F;
                            hashMap2.put("headings", this$0.f18256w);
                            hashMap2.put("list", this$0.f18257x);
                            this$0.P().s0(new b0());
                            return;
                    }
                }
            });
            ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new View.OnClickListener(this) { // from class: hr.a7

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ c7 f18159v;

                {
                    this.f18159v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    String str3;
                    rr.b p3Var2;
                    int i6 = r2;
                    boolean z10 = true;
                    c7 this$0 = this.f18159v;
                    switch (i6) {
                        case 0:
                            int i10 = c7.D;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            try {
                                if (kotlin.jvm.internal.i.b(this$0.A, "s29")) {
                                    if (this$0.f18259z == 0) {
                                        if (this$0.O()) {
                                            this$0.f18259z++;
                                            this$0.Y();
                                        }
                                    } else if (this$0.M()) {
                                        this$0.f18259z++;
                                        this$0.Y();
                                    }
                                }
                                return;
                            } catch (Exception e10) {
                                LogHelper.INSTANCE.e(this$0.f18254u, "Exception", e10);
                                return;
                            }
                        case 1:
                            int i11 = c7.D;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            String valueOf = String.valueOf(((RobertoEditText) this$0._$_findCachedViewById(R.id.editTextAdd)).getText());
                            if (valueOf.length() != 0) {
                                z10 = false;
                            }
                            if (z10) {
                                if (this$0.f18258y.containsKey("s29_error_input")) {
                                    Utils utils = Utils.INSTANCE;
                                    androidx.fragment.app.p activity3 = this$0.getActivity();
                                    kotlin.jvm.internal.i.d(activity3);
                                    utils.showCustomToast(activity3, UtilFunKt.paramsMapToString(this$0.f18258y.get("s29_error_input")));
                                    return;
                                }
                                Utils utils2 = Utils.INSTANCE;
                                androidx.fragment.app.p activity4 = this$0.getActivity();
                                kotlin.jvm.internal.i.d(activity4);
                                String string = this$0.getString(R.string.enter_text);
                                kotlin.jvm.internal.i.f(string, "getString(R.string.enter_text)");
                                utils2.showCustomToast(activity4, string);
                                return;
                            }
                            this$0.J(valueOf);
                            this$0.U(valueOf);
                            return;
                        case 2:
                            int i12 = c7.D;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            Context context = this$0.getContext();
                            kotlin.jvm.internal.i.d(context);
                            androidx.appcompat.widget.a1 a1Var = new androidx.appcompat.widget.a1(context, (ImageView) this$0._$_findCachedViewById(R.id.ivEllipses));
                            a1Var.a().inflate(R.menu.logs_menu, a1Var.f1344b);
                            a1Var.f1346d = new hd.a(3, this$0);
                            a1Var.b();
                            return;
                        case 3:
                            int i13 = c7.D;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            androidx.fragment.app.p activity5 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity5, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                            if (((TemplateActivity) activity5).getIntent().hasExtra("source") && kotlin.jvm.internal.i.b(this$0.P().getIntent().getStringExtra("source"), "goals") && this$0.f18259z == 0) {
                                ArrayList k10 = ca.a.k("HeDKoBM3U4UoRTGsy0TE", "e4VaAGYWhfIoFD0PGt6e");
                                Goal y04 = this$0.P().y0();
                                if (y04 != null) {
                                    str3 = y04.getGoalId();
                                } else {
                                    str3 = null;
                                }
                                if (is.u.Z1(k10, str3)) {
                                    androidx.fragment.app.p activity6 = this$0.getActivity();
                                    kotlin.jvm.internal.i.e(activity6, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                    ((TemplateActivity) activity6).o0();
                                    return;
                                }
                                androidx.fragment.app.p activity7 = this$0.getActivity();
                                kotlin.jvm.internal.i.e(activity7, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                Goal y05 = ((TemplateActivity) activity7).y0();
                                kotlin.jvm.internal.i.d(y05);
                                if (kotlin.jvm.internal.i.b(y05.getGoalId(), "HeDKoBM3U4UoRTGsy0TE")) {
                                    androidx.fragment.app.p activity8 = this$0.getActivity();
                                    kotlin.jvm.internal.i.e(activity8, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                    if (((TemplateActivity) activity8).F.containsKey("result_6_initial_val")) {
                                        HashMap<String, Object> hashMap = this$0.P().F;
                                        Object obj2 = this$0.P().F.get("result_6_initial_val");
                                        kotlin.jvm.internal.i.e(obj2, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                                        hashMap.put("list", (ArrayList) obj2);
                                    }
                                }
                                androidx.fragment.app.p activity9 = this$0.getActivity();
                                kotlin.jvm.internal.i.e(activity9, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                ((TemplateActivity) activity9).Q = true;
                                androidx.fragment.app.p activity10 = this$0.getActivity();
                                kotlin.jvm.internal.i.e(activity10, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                TemplateActivity templateActivity = (TemplateActivity) activity10;
                                if (this$0.P().W) {
                                    p3Var2 = new s3();
                                } else {
                                    p3Var2 = new p3();
                                }
                                templateActivity.s0(p3Var2);
                                return;
                            }
                            this$0.P().onBackPressed();
                            return;
                        default:
                            int i14 = c7.D;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            androidx.fragment.app.p activity11 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity11, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                            HashMap<String, Object> hashMap2 = ((TemplateActivity) activity11).F;
                            hashMap2.put("headings", this$0.f18256w);
                            hashMap2.put("list", this$0.f18257x);
                            this$0.P().s0(new b0());
                            return;
                    }
                }
            });
            ((ImageView) _$_findCachedViewById(R.id.ivHelp)).setVisibility(0);
            ((ImageView) _$_findCachedViewById(R.id.ivHelp)).setOnClickListener(new View.OnClickListener(this) { // from class: hr.a7

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ c7 f18159v;

                {
                    this.f18159v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    String str3;
                    rr.b p3Var2;
                    int i6 = r2;
                    boolean z10 = true;
                    c7 this$0 = this.f18159v;
                    switch (i6) {
                        case 0:
                            int i10 = c7.D;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            try {
                                if (kotlin.jvm.internal.i.b(this$0.A, "s29")) {
                                    if (this$0.f18259z == 0) {
                                        if (this$0.O()) {
                                            this$0.f18259z++;
                                            this$0.Y();
                                        }
                                    } else if (this$0.M()) {
                                        this$0.f18259z++;
                                        this$0.Y();
                                    }
                                }
                                return;
                            } catch (Exception e10) {
                                LogHelper.INSTANCE.e(this$0.f18254u, "Exception", e10);
                                return;
                            }
                        case 1:
                            int i11 = c7.D;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            String valueOf = String.valueOf(((RobertoEditText) this$0._$_findCachedViewById(R.id.editTextAdd)).getText());
                            if (valueOf.length() != 0) {
                                z10 = false;
                            }
                            if (z10) {
                                if (this$0.f18258y.containsKey("s29_error_input")) {
                                    Utils utils = Utils.INSTANCE;
                                    androidx.fragment.app.p activity3 = this$0.getActivity();
                                    kotlin.jvm.internal.i.d(activity3);
                                    utils.showCustomToast(activity3, UtilFunKt.paramsMapToString(this$0.f18258y.get("s29_error_input")));
                                    return;
                                }
                                Utils utils2 = Utils.INSTANCE;
                                androidx.fragment.app.p activity4 = this$0.getActivity();
                                kotlin.jvm.internal.i.d(activity4);
                                String string = this$0.getString(R.string.enter_text);
                                kotlin.jvm.internal.i.f(string, "getString(R.string.enter_text)");
                                utils2.showCustomToast(activity4, string);
                                return;
                            }
                            this$0.J(valueOf);
                            this$0.U(valueOf);
                            return;
                        case 2:
                            int i12 = c7.D;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            Context context = this$0.getContext();
                            kotlin.jvm.internal.i.d(context);
                            androidx.appcompat.widget.a1 a1Var = new androidx.appcompat.widget.a1(context, (ImageView) this$0._$_findCachedViewById(R.id.ivEllipses));
                            a1Var.a().inflate(R.menu.logs_menu, a1Var.f1344b);
                            a1Var.f1346d = new hd.a(3, this$0);
                            a1Var.b();
                            return;
                        case 3:
                            int i13 = c7.D;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            androidx.fragment.app.p activity5 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity5, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                            if (((TemplateActivity) activity5).getIntent().hasExtra("source") && kotlin.jvm.internal.i.b(this$0.P().getIntent().getStringExtra("source"), "goals") && this$0.f18259z == 0) {
                                ArrayList k10 = ca.a.k("HeDKoBM3U4UoRTGsy0TE", "e4VaAGYWhfIoFD0PGt6e");
                                Goal y04 = this$0.P().y0();
                                if (y04 != null) {
                                    str3 = y04.getGoalId();
                                } else {
                                    str3 = null;
                                }
                                if (is.u.Z1(k10, str3)) {
                                    androidx.fragment.app.p activity6 = this$0.getActivity();
                                    kotlin.jvm.internal.i.e(activity6, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                    ((TemplateActivity) activity6).o0();
                                    return;
                                }
                                androidx.fragment.app.p activity7 = this$0.getActivity();
                                kotlin.jvm.internal.i.e(activity7, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                Goal y05 = ((TemplateActivity) activity7).y0();
                                kotlin.jvm.internal.i.d(y05);
                                if (kotlin.jvm.internal.i.b(y05.getGoalId(), "HeDKoBM3U4UoRTGsy0TE")) {
                                    androidx.fragment.app.p activity8 = this$0.getActivity();
                                    kotlin.jvm.internal.i.e(activity8, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                    if (((TemplateActivity) activity8).F.containsKey("result_6_initial_val")) {
                                        HashMap<String, Object> hashMap = this$0.P().F;
                                        Object obj2 = this$0.P().F.get("result_6_initial_val");
                                        kotlin.jvm.internal.i.e(obj2, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                                        hashMap.put("list", (ArrayList) obj2);
                                    }
                                }
                                androidx.fragment.app.p activity9 = this$0.getActivity();
                                kotlin.jvm.internal.i.e(activity9, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                ((TemplateActivity) activity9).Q = true;
                                androidx.fragment.app.p activity10 = this$0.getActivity();
                                kotlin.jvm.internal.i.e(activity10, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                TemplateActivity templateActivity = (TemplateActivity) activity10;
                                if (this$0.P().W) {
                                    p3Var2 = new s3();
                                } else {
                                    p3Var2 = new p3();
                                }
                                templateActivity.s0(p3Var2);
                                return;
                            }
                            this$0.P().onBackPressed();
                            return;
                        default:
                            int i14 = c7.D;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            androidx.fragment.app.p activity11 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity11, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                            HashMap<String, Object> hashMap2 = ((TemplateActivity) activity11).F;
                            hashMap2.put("headings", this$0.f18256w);
                            hashMap2.put("list", this$0.f18257x);
                            this$0.P().s0(new b0());
                            return;
                    }
                }
            });
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f18254u, "exception", e10);
        }
    }

    /* compiled from: ScreenS29Fragment.kt */
    /* loaded from: classes2.dex */
    public static final class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i6, int i10, int i11) {
            LogHelper logHelper = LogHelper.INSTANCE;
            c7 c7Var = c7.this;
            boolean z10 = true;
            logHelper.i(c7Var.f18254u, String.valueOf(charSequence));
            if (String.valueOf(((RobertoEditText) c7Var._$_findCachedViewById(R.id.editTextAdd)).getText()).length() <= 0) {
                z10 = false;
            }
            if (z10) {
                ((ImageButton) c7Var._$_findCachedViewById(R.id.textAdd)).setVisibility(0);
            } else {
                ((ImageButton) c7Var._$_findCachedViewById(R.id.textAdd)).setVisibility(8);
            }
            String lowerCase = String.valueOf(charSequence).toLowerCase();
            kotlin.jvm.internal.i.f(lowerCase, "this as java.lang.String).toLowerCase()");
            try {
                int childCount = ((LinearLayout) c7Var._$_findCachedViewById(R.id.linearLayout2)).getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = ((LinearLayout) c7Var._$_findCachedViewById(R.id.linearLayout2)).getChildAt(i12);
                    String lowerCase2 = ((RobertoTextView) childAt.findViewById(R.id.textView)).getText().toString().toLowerCase();
                    kotlin.jvm.internal.i.f(lowerCase2, "this as java.lang.String).toLowerCase()");
                    if (gv.r.J0(lowerCase2, lowerCase)) {
                        childAt.setVisibility(0);
                    } else {
                        childAt.setVisibility(8);
                    }
                }
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(c7Var.f18254u, "Exeption", e10);
            }
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i6, int i10, int i11) {
        }
    }
}
