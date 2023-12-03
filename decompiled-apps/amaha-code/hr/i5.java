package hr;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.utils.UtilFunKt;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoEditText;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: ScreenS12Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhr/i5;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class i5 extends rr.b {
    public static final /* synthetic */ int A = 0;

    /* renamed from: v  reason: collision with root package name */
    public HashMap<String, Object> f18577v;

    /* renamed from: w  reason: collision with root package name */
    public final HashSet<String> f18578w;

    /* renamed from: x  reason: collision with root package name */
    public HashSet<String> f18579x;

    /* renamed from: y  reason: collision with root package name */
    public ArrayList<String> f18580y;

    /* renamed from: z  reason: collision with root package name */
    public final LinkedHashMap f18581z = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f18576u = LogHelper.INSTANCE.makeLogTag(i5.class);

    public i5() {
        new ArrayList();
        this.f18577v = new HashMap<>();
        this.f18578w = new HashSet<>();
        this.f18579x = new HashSet<>();
        this.f18580y = new ArrayList<>();
    }

    @Override // rr.b
    public final boolean I() {
        if (((RobertoEditText) _$_findCachedViewById(R.id.etS12Edit)).hasFocus()) {
            ((RobertoEditText) _$_findCachedViewById(R.id.etS12Edit)).clearFocus();
            UiUtils.Companion.showSearch(R.layout.fragment_screen_s12, (ConstraintLayout) _$_findCachedViewById(R.id.constraintRoot), getActivity());
            return false;
        }
        androidx.fragment.app.p activity = getActivity();
        kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
        if (((TemplateActivity) activity).getIntent().hasExtra("source")) {
            androidx.fragment.app.p activity2 = getActivity();
            kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            if (r1.b0.c((TemplateActivity) activity2, "source", "goals")) {
                androidx.fragment.app.p activity3 = getActivity();
                kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                ((TemplateActivity) activity3).Q = true;
                androidx.fragment.app.p activity4 = getActivity();
                kotlin.jvm.internal.i.e(activity4, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                String B0 = ((TemplateActivity) activity4).B0();
                if (ca.a.k("s12e", "s12-e").contains(B0)) {
                    androidx.fragment.app.p activity5 = getActivity();
                    kotlin.jvm.internal.i.e(activity5, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                    ((TemplateActivity) activity5).J0();
                    return false;
                } else if (!ca.a.k("s12c", "s12-c").contains(B0)) {
                    return false;
                } else {
                    androidx.fragment.app.p activity6 = getActivity();
                    kotlin.jvm.internal.i.e(activity6, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                    ((TemplateActivity) activity6).s0(new t8());
                    return false;
                }
            }
        }
        return true;
    }

    public final void J(String str) {
        try {
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.d(activity);
            View inflate = activity.getLayoutInflater().inflate(R.layout.row_checkbox, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.llS12List)), false);
            kotlin.jvm.internal.i.e(inflate, "null cannot be cast to non-null type android.widget.FrameLayout");
            FrameLayout frameLayout = (FrameLayout) inflate;
            ((RobertoTextView) frameLayout.findViewById(R.id.tvLabel)).setText(str);
            androidx.fragment.app.p activity2 = getActivity();
            kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            if (kotlin.jvm.internal.i.b(((TemplateActivity) activity2).B0(), "s129")) {
                ((ImageView) frameLayout.findViewById(R.id.chkBxSelected)).setVisibility(8);
            } else {
                if (this.f18579x.contains(str)) {
                    M(frameLayout);
                } else {
                    Q(frameLayout);
                }
                frameLayout.setOnClickListener(new sq.p(this, 17, str));
            }
            ((LinearLayout) _$_findCachedViewById(R.id.llS12List)).addView(frameLayout);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f18576u, "exception in add RadioButton", e10);
        }
    }

    public final void K(String str) {
        try {
            if (((RobertoEditText) _$_findCachedViewById(R.id.etS12Edit)).hasFocus()) {
                androidx.fragment.app.p activity = getActivity();
                kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                Context context = getContext();
                kotlin.jvm.internal.i.d(context);
                RobertoEditText etS12Edit = (RobertoEditText) _$_findCachedViewById(R.id.etS12Edit);
                kotlin.jvm.internal.i.f(etS12Edit, "etS12Edit");
                ((TemplateActivity) activity).D0(context, etS12Edit);
            }
            if (!this.f18580y.contains(str)) {
                this.f18578w.add(str);
                this.f18580y.add(str);
                if (!O(false)) {
                    this.f18579x.add(str);
                }
                J(str);
                I();
                ((ScrollView) _$_findCachedViewById(R.id.scrollview)).postDelayed(new tl.o(25, this), 500L);
                return;
            }
            I();
            Utils utils = Utils.INSTANCE;
            androidx.fragment.app.p activity2 = getActivity();
            kotlin.jvm.internal.i.d(activity2);
            utils.showCustomToast(activity2, "Item Already Exists");
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f18576u, "exception", e10);
        }
    }

    public final void M(View view) {
        androidx.fragment.app.p activity = getActivity();
        kotlin.jvm.internal.i.d(activity);
        Object obj = g0.a.f16164a;
        ((RobertoTextView) defpackage.e.g(activity, R.drawable.ic_check_box_orange_24dp, (ImageView) view.findViewById(R.id.chkBxSelected), view, R.id.tvLabel)).setFont("Lato-Bold.ttf");
        androidx.fragment.app.p activity2 = getActivity();
        kotlin.jvm.internal.i.d(activity2);
        ((RobertoTextView) view.findViewById(R.id.tvLabel)).setTextColor(g0.a.b(activity2, R.color.title_high_contrast));
    }

    public final boolean O(boolean z10) {
        androidx.fragment.app.p activity = getActivity();
        kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
        if (!kotlin.jvm.internal.i.b(((TemplateActivity) activity).B0(), "s12")) {
            androidx.fragment.app.p activity2 = getActivity();
            kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            if (!kotlin.jvm.internal.i.b(((TemplateActivity) activity2).B0(), "s12b")) {
                androidx.fragment.app.p activity3 = getActivity();
                kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                if (!kotlin.jvm.internal.i.b(((TemplateActivity) activity3).B0(), "s12-b")) {
                    androidx.fragment.app.p activity4 = getActivity();
                    kotlin.jvm.internal.i.e(activity4, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                    if (!kotlin.jvm.internal.i.b(((TemplateActivity) activity4).B0(), "s129")) {
                        androidx.fragment.app.p activity5 = getActivity();
                        kotlin.jvm.internal.i.e(activity5, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                        if (!kotlin.jvm.internal.i.b(((TemplateActivity) activity5).B0(), "s12d")) {
                            androidx.fragment.app.p activity6 = getActivity();
                            kotlin.jvm.internal.i.e(activity6, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                            if (!kotlin.jvm.internal.i.b(((TemplateActivity) activity6).B0(), "s12-d")) {
                                return false;
                            }
                        }
                    }
                    if (this.f18579x.size() == 10) {
                        if (z10) {
                            Utils utils = Utils.INSTANCE;
                            androidx.fragment.app.p activity7 = getActivity();
                            kotlin.jvm.internal.i.d(activity7);
                            String string = getString(R.string.max_10_options_to_select);
                            kotlin.jvm.internal.i.f(string, "getString(R.string.max_10_options_to_select)");
                            utils.showCustomToast(activity7, string);
                        }
                        return true;
                    }
                    return false;
                }
            }
        }
        if (this.f18579x.size() == 3) {
            if (z10) {
                if (this.f18577v.containsKey("s12_error_2")) {
                    Utils utils2 = Utils.INSTANCE;
                    androidx.fragment.app.p activity8 = getActivity();
                    kotlin.jvm.internal.i.d(activity8);
                    utils2.showCustomToast(activity8, UtilFunKt.paramsMapToString(this.f18577v.get("s12_error_2")));
                } else if (this.f18577v.containsKey("s12b_error_2")) {
                    Utils utils3 = Utils.INSTANCE;
                    androidx.fragment.app.p activity9 = getActivity();
                    kotlin.jvm.internal.i.d(activity9);
                    utils3.showCustomToast(activity9, UtilFunKt.paramsMapToString(this.f18577v.get("s12b_error_2")));
                } else {
                    Utils utils4 = Utils.INSTANCE;
                    androidx.fragment.app.p activity10 = getActivity();
                    kotlin.jvm.internal.i.d(activity10);
                    String string2 = getString(R.string.max_3_options_to_select);
                    kotlin.jvm.internal.i.f(string2, "getString(R.string.max_3_options_to_select)");
                    utils4.showCustomToast(activity10, string2);
                }
            }
            return true;
        }
        return false;
    }

    public final void P(ArrayList<String> arrayList) {
        try {
            for (String str : arrayList) {
                View inflate = getLayoutInflater().inflate(R.layout.row_search, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.llSearch)), false);
                ((RobertoTextView) inflate.findViewById(R.id.tvLabelSearch)).setText(str);
                inflate.setOnClickListener(new o4(1, this, str, inflate));
                if (!this.f18578w.contains(str)) {
                    ((LinearLayout) _$_findCachedViewById(R.id.llSearch)).addView(inflate);
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f18576u, "exception", e10);
        }
    }

    public final void Q(View view) {
        androidx.fragment.app.p activity = getActivity();
        kotlin.jvm.internal.i.d(activity);
        Object obj = g0.a.f16164a;
        ((RobertoTextView) defpackage.e.g(activity, R.drawable.ic_check_box_outline_blank_gray_24dp, (ImageView) view.findViewById(R.id.chkBxSelected), view, R.id.tvLabel)).setFont("Lato-Medium.ttf");
        androidx.fragment.app.p activity2 = getActivity();
        kotlin.jvm.internal.i.d(activity2);
        ((RobertoTextView) view.findViewById(R.id.tvLabel)).setTextColor(g0.a.b(activity2, R.color.grey_high_contrast));
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f18581z;
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
        return inflater.inflate(R.layout.fragment_screen_s12, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f18581z.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x045f A[Catch: Exception -> 0x04eb, LOOP:0: B:98:0x0459->B:100:0x045f, LOOP_END, TryCatch #0 {Exception -> 0x04eb, blocks: (B:3:0x001a, B:6:0x0033, B:8:0x0041, B:9:0x0045, B:11:0x0055, B:13:0x005e, B:22:0x0092, B:25:0x009a, B:26:0x00ea, B:29:0x00f2, B:30:0x014a, B:33:0x0152, B:34:0x01aa, B:37:0x01b2, B:50:0x0352, B:54:0x035a, B:56:0x0360, B:57:0x036d, B:59:0x0371, B:61:0x0379, B:63:0x037f, B:65:0x0386, B:66:0x03ac, B:73:0x03c1, B:76:0x03c9, B:77:0x03d8, B:80:0x03e0, B:81:0x03f0, B:84:0x03f7, B:85:0x0407, B:88:0x040e, B:97:0x0453, B:98:0x0459, B:100:0x045f, B:101:0x0469, B:89:0x041e, B:92:0x0425, B:93:0x0433, B:96:0x043c, B:38:0x020a, B:41:0x0212, B:42:0x0262, B:45:0x026a, B:46:0x02e5, B:49:0x02ee), top: B:106:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x037f A[Catch: Exception -> 0x04eb, TRY_LEAVE, TryCatch #0 {Exception -> 0x04eb, blocks: (B:3:0x001a, B:6:0x0033, B:8:0x0041, B:9:0x0045, B:11:0x0055, B:13:0x005e, B:22:0x0092, B:25:0x009a, B:26:0x00ea, B:29:0x00f2, B:30:0x014a, B:33:0x0152, B:34:0x01aa, B:37:0x01b2, B:50:0x0352, B:54:0x035a, B:56:0x0360, B:57:0x036d, B:59:0x0371, B:61:0x0379, B:63:0x037f, B:65:0x0386, B:66:0x03ac, B:73:0x03c1, B:76:0x03c9, B:77:0x03d8, B:80:0x03e0, B:81:0x03f0, B:84:0x03f7, B:85:0x0407, B:88:0x040e, B:97:0x0453, B:98:0x0459, B:100:0x045f, B:101:0x0469, B:89:0x041e, B:92:0x0425, B:93:0x0433, B:96:0x043c, B:38:0x020a, B:41:0x0212, B:42:0x0262, B:45:0x026a, B:46:0x02e5, B:49:0x02ee), top: B:106:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0433 A[Catch: Exception -> 0x04eb, TryCatch #0 {Exception -> 0x04eb, blocks: (B:3:0x001a, B:6:0x0033, B:8:0x0041, B:9:0x0045, B:11:0x0055, B:13:0x005e, B:22:0x0092, B:25:0x009a, B:26:0x00ea, B:29:0x00f2, B:30:0x014a, B:33:0x0152, B:34:0x01aa, B:37:0x01b2, B:50:0x0352, B:54:0x035a, B:56:0x0360, B:57:0x036d, B:59:0x0371, B:61:0x0379, B:63:0x037f, B:65:0x0386, B:66:0x03ac, B:73:0x03c1, B:76:0x03c9, B:77:0x03d8, B:80:0x03e0, B:81:0x03f0, B:84:0x03f7, B:85:0x0407, B:88:0x040e, B:97:0x0453, B:98:0x0459, B:100:0x045f, B:101:0x0469, B:89:0x041e, B:92:0x0425, B:93:0x0433, B:96:0x043c, B:38:0x020a, B:41:0x0212, B:42:0x0262, B:45:0x026a, B:46:0x02e5, B:49:0x02ee), top: B:106:0x001a }] */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onViewCreated(View view, Bundle bundle) {
        Object obj;
        boolean z10;
        HashMap<String, Object> hashMap;
        int hashCode;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            TemplateActivity templateActivity = (TemplateActivity) activity;
            String B0 = templateActivity.B0();
            if (templateActivity.Q) {
                if (ca.a.k("s12e", "s12-e").contains(B0)) {
                    templateActivity.J0();
                    return;
                } else if (ca.a.k("s12c", "s12-c").contains(B0)) {
                    templateActivity.s0(new t8());
                    return;
                } else {
                    return;
                }
            }
            this.f18577v = templateActivity.A0();
            int hashCode2 = B0.hashCode();
            if (hashCode2 != 112084) {
                if (hashCode2 != 3474661) {
                    if (hashCode2 != 3474705) {
                        switch (hashCode2) {
                            case 107714217:
                                if (B0.equals("s12-b")) {
                                    ((RobertoTextView) _$_findCachedViewById(R.id.tvS12Header)).setText(UtilFunKt.paramsMapToString(this.f18577v.get("s12b_heading")));
                                    ((RobertoButton) _$_findCachedViewById(R.id.btnS12Button)).setText(UtilFunKt.paramsMapToString(this.f18577v.get("s12b_btn_text")));
                                    this.f18580y = UtilFunKt.paramsMapToList(this.f18577v.get("s12b_list"));
                                    ((RobertoEditText) _$_findCachedViewById(R.id.etS12Edit)).setHint(UtilFunKt.paramsMapToString(this.f18577v.get("s12b_placeholder")));
                                    break;
                                } else {
                                    break;
                                }
                            case 107714218:
                                if (B0.equals("s12-c")) {
                                    ((RobertoTextView) _$_findCachedViewById(R.id.tvS12Header)).setText(UtilFunKt.paramsMapToString(this.f18577v.get("s12c_heading")));
                                    ((RobertoButton) _$_findCachedViewById(R.id.btnS12Button)).setText(UtilFunKt.paramsMapToString(this.f18577v.get("s12c_btn_text")));
                                    this.f18580y = UtilFunKt.paramsMapToList(this.f18577v.get("s12c_list"));
                                    ((RobertoEditText) _$_findCachedViewById(R.id.etS12Edit)).setHint(UtilFunKt.paramsMapToString(this.f18577v.get("s12c_placeholder")));
                                    break;
                                } else {
                                    break;
                                }
                            case 107714219:
                                if (B0.equals("s12-d")) {
                                    ((RobertoTextView) _$_findCachedViewById(R.id.tvS12Header)).setText(UtilFunKt.paramsMapToString(this.f18577v.get("s12_heading")));
                                    ((RobertoButton) _$_findCachedViewById(R.id.btnS12Button)).setText(UtilFunKt.paramsMapToString(this.f18577v.get("s12_btn_text")));
                                    this.f18580y = UtilFunKt.paramsMapToList(this.f18577v.get("s12_list"));
                                    ((RobertoEditText) _$_findCachedViewById(R.id.etS12Edit)).setHint(UtilFunKt.paramsMapToString(this.f18577v.get("s12_placeholder")));
                                    break;
                                } else {
                                    break;
                                }
                            case 107714220:
                                if (B0.equals("s12-e")) {
                                    ((RobertoTextView) _$_findCachedViewById(R.id.tvS12Header)).setText(UtilFunKt.paramsMapToString(this.f18577v.get("s12e_heading")));
                                    ((RobertoButton) _$_findCachedViewById(R.id.btnS12Button)).setText(UtilFunKt.paramsMapToString(this.f18577v.get("s12e_button")));
                                    this.f18580y = UtilFunKt.paramsMapToList(this.f18577v.get("s12e_list"));
                                    ((RobertoEditText) _$_findCachedViewById(R.id.etS12Edit)).setHint(UtilFunKt.paramsMapToString(this.f18577v.get("s12e_placeholder")));
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (B0.equals("s12e")) {
                        ((RobertoTextView) _$_findCachedViewById(R.id.tvS12Header)).setText(UtilFunKt.paramsMapToString(this.f18577v.get("s12e_heading")));
                        ((RobertoButton) _$_findCachedViewById(R.id.btnS12Button)).setText(UtilFunKt.paramsMapToString(this.f18577v.get("s12e_button")));
                        this.f18580y = UtilFunKt.paramsMapToList(this.f18577v.get("s12e_list"));
                        ((RobertoEditText) _$_findCachedViewById(R.id.etS12Edit)).setHint(UtilFunKt.paramsMapToString(this.f18577v.get("s12e_placeholder")));
                    }
                } else if (B0.equals("s129")) {
                    ((RobertoTextView) _$_findCachedViewById(R.id.tvS12Header)).setText(UtilFunKt.paramsMapToString(this.f18577v.get("s129_heading")));
                    ((RobertoButton) _$_findCachedViewById(R.id.btnS12Skip)).setText(UtilFunKt.paramsMapToString(this.f18577v.get("s129_btn_one_text")));
                    ((RobertoButton) _$_findCachedViewById(R.id.btnS12Button)).setText(UtilFunKt.paramsMapToString(this.f18577v.get("s129_btn_two_text")));
                    ((RobertoEditText) _$_findCachedViewById(R.id.etS12Edit)).setHint(UtilFunKt.paramsMapToString(this.f18577v.get("s129_placeholder")));
                    ((RobertoButton) _$_findCachedViewById(R.id.btnS12Skip)).setVisibility(0);
                    ((RobertoButton) _$_findCachedViewById(R.id.btnS12Skip)).setOnClickListener(new i4(templateActivity, 10));
                }
            } else if (B0.equals("s12")) {
                String B02 = templateActivity.B0();
                obj = "s12";
                ((RobertoTextView) _$_findCachedViewById(R.id.tvS12Header)).setText(UtilFunKt.paramsMapToString(this.f18577v.get(B02.concat("_heading"))));
                ((RobertoButton) _$_findCachedViewById(R.id.btnS12Button)).setText(UtilFunKt.paramsMapToString(this.f18577v.get(B02.concat("_btn_text"))));
                this.f18580y = UtilFunKt.paramsMapToList(this.f18577v.get(B02.concat("_list")));
                ((RobertoEditText) _$_findCachedViewById(R.id.etS12Edit)).setHint(UtilFunKt.paramsMapToString(this.f18577v.get(B02.concat("_placeholder"))));
                z10 = templateActivity.J;
                hashMap = templateActivity.F;
                if (z10 && hashMap.containsKey("s12_user_list")) {
                    Object obj2 = hashMap.get("s12_user_list");
                    kotlin.jvm.internal.i.e(obj2, "null cannot be cast to non-null type java.util.HashSet<kotlin.String>");
                    this.f18579x = (HashSet) obj2;
                }
                if (templateActivity.J && hashMap.containsKey("userAdded")) {
                    if (kotlin.jvm.internal.i.b(B0, "s129")) {
                        this.f18580y.clear();
                    }
                    HashSet<String> hashSet = this.f18578w;
                    hashSet.clear();
                    ((LinearLayout) _$_findCachedViewById(R.id.llS12List)).removeAllViews();
                    Object obj3 = hashMap.get("userAdded");
                    kotlin.jvm.internal.i.e(obj3, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                    hashSet.addAll((ArrayList) obj3);
                    this.f18580y.addAll(is.u.I2(hashSet));
                }
                hashCode = B0.hashCode();
                if (hashCode == 112084) {
                    if (hashCode != 3474705) {
                        switch (hashCode) {
                            case 107714217:
                                if (B0.equals("s12-b")) {
                                    P(UtilFunKt.paramsMapToList(this.f18577v.get("s12b_search_list")));
                                    break;
                                } else {
                                    break;
                                }
                            case 107714218:
                                if (B0.equals("s12-c")) {
                                    P(UtilFunKt.paramsMapToList(this.f18577v.get("s12c_search_list")));
                                    break;
                                } else {
                                    break;
                                }
                            case 107714219:
                                if (B0.equals("s12-d")) {
                                    P(UtilFunKt.paramsMapToList(this.f18577v.get("s12_search_list")));
                                    break;
                                } else {
                                    break;
                                }
                            case 107714220:
                                if (B0.equals("s12-e")) {
                                    P(UtilFunKt.paramsMapToList(this.f18577v.get("s12e_search_list")));
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (B0.equals("s12e")) {
                        P(UtilFunKt.paramsMapToList(this.f18577v.get("s12e_search_list")));
                    }
                } else if (B0.equals(obj)) {
                    P(UtilFunKt.paramsMapToList(this.f18577v.get(templateActivity.B0().concat("_search_list"))));
                }
                for (String str : this.f18580y) {
                    J(str);
                }
                ((ImageButton) _$_findCachedViewById(R.id.imgTextAdd)).setOnClickListener(new z0(this, 19));
                ((RobertoEditText) _$_findCachedViewById(R.id.etS12Edit)).setOnEditorActionListener(new dl.w(9, this));
                ((RobertoEditText) _$_findCachedViewById(R.id.etS12Edit)).addTextChangedListener(new a());
                ((RobertoButton) _$_findCachedViewById(R.id.btnS12Button)).setOnClickListener(new h5(B0, this, templateActivity));
                ((RobertoEditText) _$_findCachedViewById(R.id.etS12Edit)).setOnFocusChangeListener(new dc.b(8, this));
                ((ImageView) _$_findCachedViewById(R.id.ivHelp)).setVisibility(8);
                ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setVisibility(8);
                ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new h5(templateActivity, B0, this));
            }
            obj = "s12";
            z10 = templateActivity.J;
            hashMap = templateActivity.F;
            if (z10) {
                Object obj22 = hashMap.get("s12_user_list");
                kotlin.jvm.internal.i.e(obj22, "null cannot be cast to non-null type java.util.HashSet<kotlin.String>");
                this.f18579x = (HashSet) obj22;
            }
            if (templateActivity.J) {
                if (kotlin.jvm.internal.i.b(B0, "s129")) {
                }
                HashSet<String> hashSet2 = this.f18578w;
                hashSet2.clear();
                ((LinearLayout) _$_findCachedViewById(R.id.llS12List)).removeAllViews();
                Object obj32 = hashMap.get("userAdded");
                kotlin.jvm.internal.i.e(obj32, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                hashSet2.addAll((ArrayList) obj32);
                this.f18580y.addAll(is.u.I2(hashSet2));
            }
            hashCode = B0.hashCode();
            if (hashCode == 112084) {
            }
            while (r0.hasNext()) {
            }
            ((ImageButton) _$_findCachedViewById(R.id.imgTextAdd)).setOnClickListener(new z0(this, 19));
            ((RobertoEditText) _$_findCachedViewById(R.id.etS12Edit)).setOnEditorActionListener(new dl.w(9, this));
            ((RobertoEditText) _$_findCachedViewById(R.id.etS12Edit)).addTextChangedListener(new a());
            ((RobertoButton) _$_findCachedViewById(R.id.btnS12Button)).setOnClickListener(new h5(B0, this, templateActivity));
            ((RobertoEditText) _$_findCachedViewById(R.id.etS12Edit)).setOnFocusChangeListener(new dc.b(8, this));
            ((ImageView) _$_findCachedViewById(R.id.ivHelp)).setVisibility(8);
            ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setVisibility(8);
            ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new h5(templateActivity, B0, this));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f18576u, "exception in on view created", e10);
        }
    }

    /* compiled from: ScreenS12Fragment.kt */
    /* loaded from: classes2.dex */
    public static final class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i6, int i10, int i11) {
            boolean z10;
            i5 i5Var = i5.this;
            if (String.valueOf(((RobertoEditText) i5Var._$_findCachedViewById(R.id.etS12Edit)).getText()).length() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                ((ImageButton) i5Var._$_findCachedViewById(R.id.imgTextAdd)).setVisibility(0);
            } else {
                ((ImageButton) i5Var._$_findCachedViewById(R.id.imgTextAdd)).setVisibility(8);
            }
            String lowerCase = String.valueOf(((RobertoEditText) i5Var._$_findCachedViewById(R.id.etS12Edit)).getText()).toLowerCase();
            kotlin.jvm.internal.i.f(lowerCase, "this as java.lang.String).toLowerCase()");
            try {
                int childCount = ((LinearLayout) i5Var._$_findCachedViewById(R.id.llSearch)).getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = ((LinearLayout) i5Var._$_findCachedViewById(R.id.llSearch)).getChildAt(i12);
                    String lowerCase2 = ((RobertoTextView) childAt.findViewById(R.id.tvLabelSearch)).getText().toString().toLowerCase();
                    kotlin.jvm.internal.i.f(lowerCase2, "this as java.lang.String).toLowerCase()");
                    if (gv.r.J0(lowerCase2, lowerCase)) {
                        childAt.setVisibility(0);
                    } else {
                        childAt.setVisibility(8);
                    }
                }
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(i5Var.f18576u, "exception", e10);
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
