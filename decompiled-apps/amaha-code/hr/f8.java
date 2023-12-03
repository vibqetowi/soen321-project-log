package hr;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.utils.Constants;
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
/* compiled from: ScreenS5Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhr/f8;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class f8 extends rr.b {
    public static final /* synthetic */ int C = 0;

    /* renamed from: v  reason: collision with root package name */
    public String f18391v;

    /* renamed from: x  reason: collision with root package name */
    public RelativeLayout f18393x;

    /* renamed from: z  reason: collision with root package name */
    public TemplateActivity f18395z;
    public final LinkedHashMap B = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f18390u = LogHelper.INSTANCE.makeLogTag(f8.class);

    /* renamed from: w  reason: collision with root package name */
    public final HashSet<String> f18392w = new HashSet<>();

    /* renamed from: y  reason: collision with root package name */
    public String f18394y = "";
    public String A = "";

    @Override // rr.b
    public final boolean I() {
        boolean b10;
        try {
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f18390u, "exception", e10);
        }
        if (getActivity() != null && isAdded()) {
            if (((RobertoEditText) _$_findCachedViewById(R.id.etAddNew)) != null && ((RobertoEditText) _$_findCachedViewById(R.id.etAddNew)).hasFocus()) {
                ((RobertoEditText) _$_findCachedViewById(R.id.etAddNew)).clearFocus();
                UiUtils.Companion.showSearch(R.layout.fragment_screen_s5, (ConstraintLayout) _$_findCachedViewById(R.id.constraintRoot), getActivity());
                return false;
            } else if (kotlin.jvm.internal.i.b(this.A, "s147-b")) {
                return true;
            } else {
                androidx.fragment.app.p activity = getActivity();
                kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                if (((TemplateActivity) activity).getIntent().hasExtra("source") && kotlin.jvm.internal.i.b(M().getIntent().getStringExtra("source"), "goals")) {
                    androidx.fragment.app.p activity2 = getActivity();
                    kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                    ((TemplateActivity) activity2).Q = true;
                    androidx.fragment.app.p activity3 = getActivity();
                    kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                    ((TemplateActivity) activity3).J0();
                    return false;
                }
                String str = this.A;
                if (kotlin.jvm.internal.i.b(str, "s5b")) {
                    b10 = true;
                } else {
                    b10 = kotlin.jvm.internal.i.b(str, "s5-b");
                }
                if (b10 && M().F.containsKey(Constants.DAYMODEL_POSITION)) {
                    Object obj = M().F.get(Constants.DAYMODEL_POSITION);
                    kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type kotlin.Int");
                    int intValue = ((Integer) obj).intValue();
                    if (intValue > 0) {
                        M().F.put(Constants.DAYMODEL_POSITION, Integer.valueOf(intValue - 1));
                    }
                }
                return true;
            }
        }
        return true;
    }

    public final void J(String str) {
        try {
            if (((RobertoEditText) _$_findCachedViewById(R.id.etAddNew)).hasFocus()) {
                androidx.fragment.app.p activity = getActivity();
                kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                Context context = getContext();
                kotlin.jvm.internal.i.d(context);
                RobertoEditText etAddNew = (RobertoEditText) _$_findCachedViewById(R.id.etAddNew);
                kotlin.jvm.internal.i.f(etAddNew, "etAddNew");
                ((TemplateActivity) activity).D0(context, etAddNew);
            }
            HashSet<String> hashSet = this.f18392w;
            if (!hashSet.contains(str)) {
                this.f18391v = str;
                hashSet.add(str);
                K(str);
                I();
                ((ScrollView) _$_findCachedViewById(R.id.scrollview)).postDelayed(new e8(0, this), 500L);
                return;
            }
            I();
            Utils utils = Utils.INSTANCE;
            androidx.fragment.app.p activity2 = getActivity();
            kotlin.jvm.internal.i.d(activity2);
            utils.showCustomToast(activity2, "Item Already Exists");
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f18390u, "exception", e10);
        }
    }

    public final void K(String str) {
        try {
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.d(activity);
            View inflate = activity.getLayoutInflater().inflate(R.layout.row_s5, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.llS5List)), false);
            kotlin.jvm.internal.i.e(inflate, "null cannot be cast to non-null type android.widget.RelativeLayout");
            RelativeLayout relativeLayout = (RelativeLayout) inflate;
            ((RobertoTextView) relativeLayout.findViewById(R.id.label)).setText(str);
            String str2 = this.f18391v;
            if (str2 != null && kotlin.jvm.internal.i.b(str2, str)) {
                O(relativeLayout);
                ScrollView scrollView = (ScrollView) _$_findCachedViewById(R.id.scrollview);
                if (scrollView != null) {
                    scrollView.post(new nn.f(this, 9, relativeLayout));
                }
            }
            relativeLayout.setOnClickListener(new o4(12, this, relativeLayout, str));
            ((LinearLayout) _$_findCachedViewById(R.id.llS5List)).addView(relativeLayout);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f18390u, e10);
        }
    }

    public final TemplateActivity M() {
        TemplateActivity templateActivity = this.f18395z;
        if (templateActivity != null) {
            return templateActivity;
        }
        kotlin.jvm.internal.i.q("act");
        throw null;
    }

    public final void O(RelativeLayout relativeLayout) {
        try {
            RelativeLayout relativeLayout2 = this.f18393x;
            if (relativeLayout2 != null) {
                relativeLayout2.setBackgroundColor(0);
                RelativeLayout relativeLayout3 = this.f18393x;
                kotlin.jvm.internal.i.d(relativeLayout3);
                ((TextView) relativeLayout3.findViewById(R.id.tvUnderline)).setVisibility(0);
                RelativeLayout relativeLayout4 = this.f18393x;
                kotlin.jvm.internal.i.d(relativeLayout4);
                androidx.fragment.app.p activity = getActivity();
                kotlin.jvm.internal.i.d(activity);
                ((RobertoTextView) relativeLayout4.findViewById(R.id.label)).setTextColor(g0.a.b(activity, R.color.grey_high_contrast));
            }
            this.f18393x = relativeLayout;
            androidx.fragment.app.p activity2 = getActivity();
            kotlin.jvm.internal.i.d(activity2);
            relativeLayout.setBackgroundColor(g0.a.b(activity2, R.color.selected_row));
            androidx.fragment.app.p activity3 = getActivity();
            kotlin.jvm.internal.i.d(activity3);
            ((RobertoTextView) relativeLayout.findViewById(R.id.label)).setTextColor(g0.a.b(activity3, R.color.selected_row_text));
            ((TextView) relativeLayout.findViewById(R.id.tvUnderline)).setVisibility(4);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f18390u, "Exception", e10);
        }
    }

    public final void P(ArrayList<String> arrayList) {
        try {
            ((LinearLayout) _$_findCachedViewById(R.id.llS5List)).removeAllViews();
            int size = arrayList.size();
            for (int i6 = 0; i6 < size; i6++) {
                String str = arrayList.get(i6);
                kotlin.jvm.internal.i.f(str, "list1[i]");
                K(str);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f18390u, "Exception", e10);
        }
    }

    public final void Q(ArrayList<String> arrayList) {
        try {
            for (String str : arrayList) {
                if (!this.f18392w.contains(str)) {
                    View inflate = getLayoutInflater().inflate(R.layout.row_search, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.llSearch)), false);
                    ((RobertoTextView) inflate.findViewById(R.id.tvLabelSearch)).setText(str);
                    inflate.setOnClickListener(new o4(13, this, str, inflate));
                    ((LinearLayout) _$_findCachedViewById(R.id.llSearch)).addView(inflate);
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f18390u, "exception", e10);
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
        return inflater.inflate(R.layout.fragment_screen_s5, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.B.clear();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0550 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0554 A[Catch: Exception -> 0x065c, TryCatch #0 {Exception -> 0x065c, blocks: (B:3:0x001c, B:5:0x002f, B:7:0x0037, B:9:0x005b, B:11:0x0063, B:15:0x0079, B:18:0x0081, B:117:0x0547, B:118:0x054d, B:136:0x05b6, B:137:0x05d4, B:120:0x0554, B:123:0x055d, B:124:0x056d, B:127:0x0578, B:128:0x0586, B:131:0x058f, B:132:0x059d, B:135:0x05a8, B:116:0x0540, B:19:0x00d8, B:22:0x00e0, B:23:0x0137, B:26:0x013f, B:27:0x0195, B:30:0x019c, B:32:0x01e8, B:34:0x028e), top: B:142:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x056d A[Catch: Exception -> 0x065c, TryCatch #0 {Exception -> 0x065c, blocks: (B:3:0x001c, B:5:0x002f, B:7:0x0037, B:9:0x005b, B:11:0x0063, B:15:0x0079, B:18:0x0081, B:117:0x0547, B:118:0x054d, B:136:0x05b6, B:137:0x05d4, B:120:0x0554, B:123:0x055d, B:124:0x056d, B:127:0x0578, B:128:0x0586, B:131:0x058f, B:132:0x059d, B:135:0x05a8, B:116:0x0540, B:19:0x00d8, B:22:0x00e0, B:23:0x0137, B:26:0x013f, B:27:0x0195, B:30:0x019c, B:32:0x01e8, B:34:0x028e), top: B:142:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0586 A[Catch: Exception -> 0x065c, TryCatch #0 {Exception -> 0x065c, blocks: (B:3:0x001c, B:5:0x002f, B:7:0x0037, B:9:0x005b, B:11:0x0063, B:15:0x0079, B:18:0x0081, B:117:0x0547, B:118:0x054d, B:136:0x05b6, B:137:0x05d4, B:120:0x0554, B:123:0x055d, B:124:0x056d, B:127:0x0578, B:128:0x0586, B:131:0x058f, B:132:0x059d, B:135:0x05a8, B:116:0x0540, B:19:0x00d8, B:22:0x00e0, B:23:0x0137, B:26:0x013f, B:27:0x0195, B:30:0x019c, B:32:0x01e8, B:34:0x028e), top: B:142:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x059d A[Catch: Exception -> 0x065c, TryCatch #0 {Exception -> 0x065c, blocks: (B:3:0x001c, B:5:0x002f, B:7:0x0037, B:9:0x005b, B:11:0x0063, B:15:0x0079, B:18:0x0081, B:117:0x0547, B:118:0x054d, B:136:0x05b6, B:137:0x05d4, B:120:0x0554, B:123:0x055d, B:124:0x056d, B:127:0x0578, B:128:0x0586, B:131:0x058f, B:132:0x059d, B:135:0x05a8, B:116:0x0540, B:19:0x00d8, B:22:0x00e0, B:23:0x0137, B:26:0x013f, B:27:0x0195, B:30:0x019c, B:32:0x01e8, B:34:0x028e), top: B:142:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x028e A[Catch: Exception -> 0x065c, TRY_LEAVE, TryCatch #0 {Exception -> 0x065c, blocks: (B:3:0x001c, B:5:0x002f, B:7:0x0037, B:9:0x005b, B:11:0x0063, B:15:0x0079, B:18:0x0081, B:117:0x0547, B:118:0x054d, B:136:0x05b6, B:137:0x05d4, B:120:0x0554, B:123:0x055d, B:124:0x056d, B:127:0x0578, B:128:0x0586, B:131:0x058f, B:132:0x059d, B:135:0x05a8, B:116:0x0540, B:19:0x00d8, B:22:0x00e0, B:23:0x0137, B:26:0x013f, B:27:0x0195, B:30:0x019c, B:32:0x01e8, B:34:0x028e), top: B:142:0x001c }] */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onViewCreated(View view, Bundle bundle) {
        ArrayList<String> arrayList;
        ArrayList<String> paramsMapToList;
        HashMap<String, Object> hashMap;
        Object obj;
        Object obj2;
        Object obj3;
        String str;
        HashMap<String, Object> hashMap2;
        boolean b10;
        HashSet<String> hashSet;
        int i6;
        String str2 = this.f18390u;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            this.f18395z = (TemplateActivity) activity;
            if (M().Q) {
                M().J0();
                return;
            }
            HashMap<String, Object> A0 = M().A0();
            new ArrayList();
            this.A = M().B0();
            androidx.fragment.app.p activity2 = getActivity();
            kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            if (((TemplateActivity) activity2).Q) {
                M().J0();
                return;
            }
            String str3 = this.A;
            switch (str3.hashCode()) {
                case -955847334:
                    if (str3.equals("s118-b")) {
                        paramsMapToList = UtilFunKt.paramsMapToList(A0.get("s5_list"));
                        ((RobertoTextView) _$_findCachedViewById(R.id.tvS5Header)).setText(UtilFunKt.paramsMapToString(A0.get("s5_heading")));
                        ((RobertoEditText) _$_findCachedViewById(R.id.etAddNew)).setHint(UtilFunKt.paramsMapToString(A0.get("s5_placeholder")));
                        ((RobertoButton) _$_findCachedViewById(R.id.btnS5Button)).setText(UtilFunKt.paramsMapToString(A0.get("s5_btn_text")));
                        arrayList = paramsMapToList;
                        break;
                    } else {
                        ArrayList<String> paramsMapToList2 = UtilFunKt.paramsMapToList(A0.get(this.A + "_list"));
                        ((RobertoTextView) _$_findCachedViewById(R.id.tvS5Header)).setText(UtilFunKt.paramsMapToString(A0.get(this.A + "_heading")));
                        ((RobertoEditText) _$_findCachedViewById(R.id.etAddNew)).setHint(UtilFunKt.paramsMapToString(A0.get(this.A + "_placeholder")));
                        ((RobertoButton) _$_findCachedViewById(R.id.btnS5Button)).setText(UtilFunKt.paramsMapToString(A0.get(this.A + "_btn_text")));
                        if (A0.containsKey(this.A + "_error")) {
                            this.f18394y = UtilFunKt.paramsMapToString(A0.get(this.A + "_error"));
                        }
                        arrayList = paramsMapToList2;
                        break;
                    }
                case -955758923:
                    if (str3.equals("s147-a")) {
                        paramsMapToList = UtilFunKt.paramsMapToList(A0.get("s147a_list"));
                        ((RobertoTextView) _$_findCachedViewById(R.id.tvS5Header)).setText(UtilFunKt.paramsMapToString(A0.get("s147a_heading")));
                        ((RobertoEditText) _$_findCachedViewById(R.id.etAddNew)).setHint(UtilFunKt.paramsMapToString(A0.get("s147a_placeholder")));
                        ((RobertoButton) _$_findCachedViewById(R.id.btnS5Button)).setText(UtilFunKt.paramsMapToString(A0.get("s147a_btn_one_text")));
                        this.f18394y = UtilFunKt.paramsMapToString(A0.get("s147a_error"));
                        arrayList = paramsMapToList;
                        break;
                    } else {
                        ArrayList<String> paramsMapToList22 = UtilFunKt.paramsMapToList(A0.get(this.A + "_list"));
                        ((RobertoTextView) _$_findCachedViewById(R.id.tvS5Header)).setText(UtilFunKt.paramsMapToString(A0.get(this.A + "_heading")));
                        ((RobertoEditText) _$_findCachedViewById(R.id.etAddNew)).setHint(UtilFunKt.paramsMapToString(A0.get(this.A + "_placeholder")));
                        ((RobertoButton) _$_findCachedViewById(R.id.btnS5Button)).setText(UtilFunKt.paramsMapToString(A0.get(this.A + "_btn_text")));
                        if (A0.containsKey(this.A + "_error")) {
                        }
                        arrayList = paramsMapToList22;
                        break;
                    }
                case -955758922:
                    if (str3.equals("s147-b")) {
                        paramsMapToList = UtilFunKt.paramsMapToList(A0.get("s147b_list"));
                        ((RobertoTextView) _$_findCachedViewById(R.id.tvS5Header)).setText(UtilFunKt.paramsMapToString(A0.get("s147b_heading")));
                        ((RobertoEditText) _$_findCachedViewById(R.id.etAddNew)).setHint(UtilFunKt.paramsMapToString(A0.get("s147b_placeholder")));
                        ((RobertoButton) _$_findCachedViewById(R.id.btnS5Button)).setText(UtilFunKt.paramsMapToString(A0.get("s147b_btn_one_text")));
                        this.f18394y = UtilFunKt.paramsMapToString(A0.get("s147b_error"));
                        arrayList = paramsMapToList;
                        break;
                    } else {
                        ArrayList<String> paramsMapToList222 = UtilFunKt.paramsMapToList(A0.get(this.A + "_list"));
                        ((RobertoTextView) _$_findCachedViewById(R.id.tvS5Header)).setText(UtilFunKt.paramsMapToString(A0.get(this.A + "_heading")));
                        ((RobertoEditText) _$_findCachedViewById(R.id.etAddNew)).setHint(UtilFunKt.paramsMapToString(A0.get(this.A + "_placeholder")));
                        ((RobertoButton) _$_findCachedViewById(R.id.btnS5Button)).setText(UtilFunKt.paramsMapToString(A0.get(this.A + "_btn_text")));
                        if (A0.containsKey(this.A + "_error")) {
                        }
                        arrayList = paramsMapToList222;
                        break;
                    }
                case 3478391:
                    if (str3.equals("s5-b")) {
                        paramsMapToList = UtilFunKt.paramsMapToList(A0.get("s5b_list"));
                        ((RobertoTextView) _$_findCachedViewById(R.id.tvS5Header)).setText(UtilFunKt.paramsMapToString(A0.get("s5b_heading")));
                        ((RobertoEditText) _$_findCachedViewById(R.id.etAddNew)).setHint(UtilFunKt.paramsMapToString(A0.get("s5b_placeholder")));
                        ((RobertoButton) _$_findCachedViewById(R.id.btnS5Button)).setText(UtilFunKt.paramsMapToString(A0.get("s5b_btn_one_text")));
                        this.f18394y = UtilFunKt.paramsMapToString(A0.get("s5b_error"));
                        arrayList = paramsMapToList;
                        break;
                    } else {
                        ArrayList<String> paramsMapToList2222 = UtilFunKt.paramsMapToList(A0.get(this.A + "_list"));
                        ((RobertoTextView) _$_findCachedViewById(R.id.tvS5Header)).setText(UtilFunKt.paramsMapToString(A0.get(this.A + "_heading")));
                        ((RobertoEditText) _$_findCachedViewById(R.id.etAddNew)).setHint(UtilFunKt.paramsMapToString(A0.get(this.A + "_placeholder")));
                        ((RobertoButton) _$_findCachedViewById(R.id.btnS5Button)).setText(UtilFunKt.paramsMapToString(A0.get(this.A + "_btn_text")));
                        if (A0.containsKey(this.A + "_error")) {
                        }
                        arrayList = paramsMapToList2222;
                        break;
                    }
                default:
                    ArrayList<String> paramsMapToList22222 = UtilFunKt.paramsMapToList(A0.get(this.A + "_list"));
                    ((RobertoTextView) _$_findCachedViewById(R.id.tvS5Header)).setText(UtilFunKt.paramsMapToString(A0.get(this.A + "_heading")));
                    ((RobertoEditText) _$_findCachedViewById(R.id.etAddNew)).setHint(UtilFunKt.paramsMapToString(A0.get(this.A + "_placeholder")));
                    ((RobertoButton) _$_findCachedViewById(R.id.btnS5Button)).setText(UtilFunKt.paramsMapToString(A0.get(this.A + "_btn_text")));
                    if (A0.containsKey(this.A + "_error")) {
                    }
                    arrayList = paramsMapToList22222;
                    break;
            }
            try {
                b10 = kotlin.jvm.internal.i.b(M().B0(), "s5-b");
                hashSet = this.f18392w;
                obj = "s118-b";
                hashMap = A0;
                obj2 = "s5-b";
            } catch (Exception e10) {
                e = e10;
                hashMap = A0;
                obj = "s118-b";
                obj2 = "s5-b";
            }
            try {
                if (!b10) {
                    obj3 = "s147-b";
                    try {
                        if (kotlin.jvm.internal.i.b(M().B0(), "s147-b")) {
                            if (M().J && M().F.containsKey("s147b_userAdded")) {
                                Object obj4 = M().F.get("s147b_userAdded");
                                kotlin.jvm.internal.i.e(obj4, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                                hashSet.addAll((ArrayList) obj4);
                                arrayList.addAll(is.u.I2(hashSet));
                            }
                            if ((M().J || M().P) && M().F.containsKey("s147b_user_data")) {
                                Object obj5 = M().F.get("s147b_user_data");
                                kotlin.jvm.internal.i.e(obj5, "null cannot be cast to non-null type kotlin.String");
                                this.f18391v = (String) obj5;
                                if (M().getIntent().hasExtra("source") && kotlin.jvm.internal.i.b(M().getIntent().getStringExtra("source"), "goals")) {
                                    String str4 = this.f18391v;
                                    kotlin.jvm.internal.i.d(str4);
                                    if (!arrayList.contains(str4)) {
                                        String str5 = this.f18391v;
                                        kotlin.jvm.internal.i.d(str5);
                                        arrayList.add(str5);
                                    }
                                }
                            }
                        } else if (kotlin.jvm.internal.i.b(M().B0(), "s147-a")) {
                            if (M().J && M().F.containsKey("s147a_userAdded")) {
                                Object obj6 = M().F.get("s147a_userAdded");
                                kotlin.jvm.internal.i.e(obj6, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                                hashSet.addAll((ArrayList) obj6);
                                arrayList.addAll(is.u.I2(hashSet));
                            }
                            if (M().J && M().F.containsKey("s147a_user_data")) {
                                Object obj7 = M().F.get("s147a_user_data");
                                kotlin.jvm.internal.i.e(obj7, "null cannot be cast to non-null type kotlin.String");
                                this.f18391v = (String) obj7;
                                if (M().getIntent().hasExtra("source") && kotlin.jvm.internal.i.b(M().getIntent().getStringExtra("source"), "goals")) {
                                    String str6 = this.f18391v;
                                    kotlin.jvm.internal.i.d(str6);
                                    if (!arrayList.contains(str6)) {
                                        String str7 = this.f18391v;
                                        kotlin.jvm.internal.i.d(str7);
                                        arrayList.add(str7);
                                    }
                                }
                            }
                        } else {
                            if (M().J && M().F.containsKey("userAdded")) {
                                Object obj8 = M().F.get("userAdded");
                                kotlin.jvm.internal.i.e(obj8, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                                hashSet.addAll((ArrayList) obj8);
                                arrayList.addAll(is.u.I2(hashSet));
                            }
                            if (M().J && M().F.containsKey("s5_user_data")) {
                                Object obj9 = M().F.get("s5_user_data");
                                kotlin.jvm.internal.i.e(obj9, "null cannot be cast to non-null type kotlin.String");
                                this.f18391v = (String) obj9;
                                if (M().getIntent().hasExtra("source") && kotlin.jvm.internal.i.b(M().getIntent().getStringExtra("source"), "goals")) {
                                    String str8 = this.f18391v;
                                    kotlin.jvm.internal.i.d(str8);
                                    if (!arrayList.contains(str8)) {
                                        String str9 = this.f18391v;
                                        kotlin.jvm.internal.i.d(str9);
                                        arrayList.add(str9);
                                    }
                                }
                            }
                        }
                    } catch (Exception e11) {
                        e = e11;
                        LogHelper.INSTANCE.e(str2, "exception", e);
                        str = this.A;
                        switch (str.hashCode()) {
                            case -955847334:
                                break;
                            case -955758923:
                                break;
                            case -955758922:
                                break;
                            case 3478391:
                                break;
                        }
                        P(arrayList);
                        ((ImageButton) _$_findCachedViewById(R.id.imgTextAdd)).setOnClickListener(new View.OnClickListener(this) { // from class: hr.d8

                            /* renamed from: v  reason: collision with root package name */
                            public final /* synthetic */ f8 f18317v;

                            {
                                this.f18317v = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                Object obj10;
                                int i10;
                                String str10;
                                int i11 = r2;
                                String str11 = "";
                                f8 this$0 = this.f18317v;
                                switch (i11) {
                                    case 0:
                                        boolean z10 = false;
                                        int i12 = f8.C;
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        String valueOf = String.valueOf(((RobertoEditText) this$0._$_findCachedViewById(R.id.etAddNew)).getText());
                                        if (valueOf.length() == 0) {
                                            z10 = true;
                                        }
                                        if (z10) {
                                            Utils.INSTANCE.showCustomToast(this$0.getActivity(), "Enter Text");
                                            return;
                                        }
                                        ((RobertoEditText) this$0._$_findCachedViewById(R.id.etAddNew)).setText("");
                                        this$0.J(valueOf);
                                        return;
                                    case 1:
                                        int i13 = f8.C;
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        try {
                                            if (this$0.f18391v == null) {
                                                Utils utils = Utils.INSTANCE;
                                                androidx.fragment.app.p activity3 = this$0.getActivity();
                                                if (kotlin.jvm.internal.i.b(this$0.f18394y, "")) {
                                                    str10 = this$0.getString(R.string.select_1_option);
                                                } else {
                                                    str10 = this$0.f18394y;
                                                }
                                                kotlin.jvm.internal.i.f(str10, "if (errorMsg == \"\") getS…t_1_option) else errorMsg");
                                                utils.showCustomToast(activity3, str10);
                                                return;
                                            }
                                            androidx.fragment.app.p activity4 = this$0.getActivity();
                                            kotlin.jvm.internal.i.e(activity4, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                            TemplateActivity templateActivity = (TemplateActivity) activity4;
                                            String B0 = templateActivity.B0();
                                            int hashCode = B0.hashCode();
                                            HashSet<String> hashSet2 = this$0.f18392w;
                                            HashMap<String, Object> hashMap3 = templateActivity.F;
                                            switch (hashCode) {
                                                case -955847334:
                                                    if (!B0.equals("s118-b")) {
                                                        hashMap3.put("userAdded", new ArrayList(hashSet2));
                                                        hashMap3.put("list", ca.a.k(this$0.f18391v));
                                                        String str12 = this$0.f18391v;
                                                        kotlin.jvm.internal.i.d(str12);
                                                        hashMap3.put("s5_user_data", str12);
                                                        templateActivity.t0();
                                                        return;
                                                    }
                                                    hashMap3.put("list", ca.a.k(this$0.f18391v));
                                                    hashMap3.put("userAdded", new ArrayList(hashSet2));
                                                    String str13 = this$0.f18391v;
                                                    kotlin.jvm.internal.i.d(str13);
                                                    hashMap3.put("s5_user_data", str13);
                                                    return;
                                                case -955758923:
                                                    if (B0.equals("s147-a")) {
                                                        hashMap3.put("s147a_userAdded", new ArrayList(hashSet2));
                                                        if (hashMap3.containsKey("list") && (hashMap3.get("list") instanceof ArrayList)) {
                                                            kotlin.jvm.internal.i.e(hashMap3.get("list"), "null cannot be cast to non-null type java.util.ArrayList<*>{ kotlin.collections.TypeAliasesKt.ArrayList<*> }");
                                                            if (!((ArrayList) obj10).isEmpty()) {
                                                                Object obj11 = hashMap3.get("list");
                                                                kotlin.jvm.internal.i.e(obj11, "null cannot be cast to non-null type java.util.ArrayList<*>{ kotlin.collections.TypeAliasesKt.ArrayList<*> }");
                                                                if (is.u.j2(0, (ArrayList) obj11) instanceof String) {
                                                                    Object obj12 = hashMap3.get("list");
                                                                    kotlin.jvm.internal.i.e(obj12, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                                                                    ArrayList arrayList2 = (ArrayList) obj12;
                                                                    String str14 = this$0.f18391v;
                                                                    if (str14 != null) {
                                                                        str11 = str14;
                                                                    }
                                                                    arrayList2.set(0, str11);
                                                                    String str15 = this$0.f18391v;
                                                                    kotlin.jvm.internal.i.d(str15);
                                                                    hashMap3.put("s147a_user_data", str15);
                                                                    templateActivity.t0();
                                                                    return;
                                                                }
                                                            }
                                                        }
                                                        hashMap3.put("list", ca.a.k(this$0.f18391v));
                                                        String str152 = this$0.f18391v;
                                                        kotlin.jvm.internal.i.d(str152);
                                                        hashMap3.put("s147a_user_data", str152);
                                                        templateActivity.t0();
                                                        return;
                                                    }
                                                    hashMap3.put("userAdded", new ArrayList(hashSet2));
                                                    hashMap3.put("list", ca.a.k(this$0.f18391v));
                                                    String str122 = this$0.f18391v;
                                                    kotlin.jvm.internal.i.d(str122);
                                                    hashMap3.put("s5_user_data", str122);
                                                    templateActivity.t0();
                                                    return;
                                                case -955758922:
                                                    if (B0.equals("s147-b")) {
                                                        hashMap3.put("s147b_userAdded", new ArrayList(hashSet2));
                                                        Object obj13 = hashMap3.get("list");
                                                        kotlin.jvm.internal.i.e(obj13, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                                                        ArrayList arrayList3 = (ArrayList) obj13;
                                                        if (arrayList3.size() >= 2) {
                                                            String str16 = this$0.f18391v;
                                                            kotlin.jvm.internal.i.d(str16);
                                                            arrayList3.set(1, str16);
                                                        } else {
                                                            String str17 = this$0.f18391v;
                                                            kotlin.jvm.internal.i.d(str17);
                                                            arrayList3.add(str17);
                                                        }
                                                        hashMap3.put("list", arrayList3);
                                                        String str18 = this$0.f18391v;
                                                        kotlin.jvm.internal.i.d(str18);
                                                        hashMap3.put("s147b_user_data", str18);
                                                        templateActivity.t0();
                                                        return;
                                                    }
                                                    hashMap3.put("userAdded", new ArrayList(hashSet2));
                                                    hashMap3.put("list", ca.a.k(this$0.f18391v));
                                                    String str1222 = this$0.f18391v;
                                                    kotlin.jvm.internal.i.d(str1222);
                                                    hashMap3.put("s5_user_data", str1222);
                                                    templateActivity.t0();
                                                    return;
                                                case 3474656:
                                                    if (!B0.equals("s124")) {
                                                        hashMap3.put("userAdded", new ArrayList(hashSet2));
                                                        hashMap3.put("list", ca.a.k(this$0.f18391v));
                                                        String str12222 = this$0.f18391v;
                                                        kotlin.jvm.internal.i.d(str12222);
                                                        hashMap3.put("s5_user_data", str12222);
                                                        templateActivity.t0();
                                                        return;
                                                    }
                                                    hashMap3.put("list", ca.a.k(this$0.f18391v));
                                                    hashMap3.put("userAdded", new ArrayList(hashSet2));
                                                    String str132 = this$0.f18391v;
                                                    kotlin.jvm.internal.i.d(str132);
                                                    hashMap3.put("s5_user_data", str132);
                                                    return;
                                                case 3478391:
                                                    if (B0.equals("s5-b")) {
                                                        if (hashMap3.containsKey(Constants.DAYMODEL_POSITION)) {
                                                            Object obj14 = hashMap3.get(Constants.DAYMODEL_POSITION);
                                                            kotlin.jvm.internal.i.e(obj14, "null cannot be cast to non-null type kotlin.Int");
                                                            i10 = ((Integer) obj14).intValue();
                                                        } else {
                                                            i10 = 0;
                                                        }
                                                        Object obj15 = hashMap3.get("list");
                                                        kotlin.jvm.internal.i.e(obj15, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                                                        ArrayList arrayList4 = (ArrayList) obj15;
                                                        int i14 = i10 + 1;
                                                        if (arrayList4.size() >= i14) {
                                                            String str19 = this$0.f18391v;
                                                            kotlin.jvm.internal.i.d(str19);
                                                            arrayList4.set(i10, str19);
                                                        } else {
                                                            String str20 = this$0.f18391v;
                                                            kotlin.jvm.internal.i.d(str20);
                                                            arrayList4.add(i10, str20);
                                                        }
                                                        hashMap3.put("userAdded" + i10, new ArrayList(hashSet2));
                                                        String str21 = "s5_user_data" + i10;
                                                        String str22 = this$0.f18391v;
                                                        kotlin.jvm.internal.i.d(str22);
                                                        hashMap3.put(str21, str22);
                                                        hashMap3.put("list", arrayList4);
                                                        hashMap3.put(Constants.DAYMODEL_POSITION, Integer.valueOf(i14));
                                                        templateActivity.t0();
                                                        return;
                                                    }
                                                    hashMap3.put("userAdded", new ArrayList(hashSet2));
                                                    hashMap3.put("list", ca.a.k(this$0.f18391v));
                                                    String str122222 = this$0.f18391v;
                                                    kotlin.jvm.internal.i.d(str122222);
                                                    hashMap3.put("s5_user_data", str122222);
                                                    templateActivity.t0();
                                                    return;
                                                default:
                                                    hashMap3.put("userAdded", new ArrayList(hashSet2));
                                                    hashMap3.put("list", ca.a.k(this$0.f18391v));
                                                    String str1222222 = this$0.f18391v;
                                                    kotlin.jvm.internal.i.d(str1222222);
                                                    hashMap3.put("s5_user_data", str1222222);
                                                    templateActivity.t0();
                                                    return;
                                            }
                                        } catch (Exception e12) {
                                            LogHelper.INSTANCE.e(this$0.f18390u, "Exception", e12);
                                            return;
                                        }
                                    default:
                                        int i15 = f8.C;
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        if (kotlin.jvm.internal.i.b(this$0.A, "s147-b")) {
                                            this$0.M().onBackPressed();
                                            return;
                                        }
                                        androidx.fragment.app.p activity5 = this$0.getActivity();
                                        kotlin.jvm.internal.i.e(activity5, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                        if (((TemplateActivity) activity5).getIntent().hasExtra("source") && kotlin.jvm.internal.i.b(this$0.M().getIntent().getStringExtra("source"), "goals")) {
                                            androidx.fragment.app.p activity6 = this$0.getActivity();
                                            kotlin.jvm.internal.i.e(activity6, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                            ((TemplateActivity) activity6).Q = true;
                                            androidx.fragment.app.p activity7 = this$0.getActivity();
                                            kotlin.jvm.internal.i.e(activity7, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                            ((TemplateActivity) activity7).J0();
                                            return;
                                        }
                                        this$0.M().onBackPressed();
                                        return;
                                }
                            }
                        });
                        ((RobertoEditText) _$_findCachedViewById(R.id.etAddNew)).addTextChangedListener(new a());
                        ((RobertoEditText) _$_findCachedViewById(R.id.etAddNew)).setOnEditorActionListener(new dl.w(13, this));
                        ((RobertoButton) _$_findCachedViewById(R.id.btnS5Button)).setOnClickListener(new View.OnClickListener(this) { // from class: hr.d8

                            /* renamed from: v  reason: collision with root package name */
                            public final /* synthetic */ f8 f18317v;

                            {
                                this.f18317v = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                Object obj10;
                                int i10;
                                String str10;
                                int i11 = r2;
                                String str11 = "";
                                f8 this$0 = this.f18317v;
                                switch (i11) {
                                    case 0:
                                        boolean z10 = false;
                                        int i12 = f8.C;
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        String valueOf = String.valueOf(((RobertoEditText) this$0._$_findCachedViewById(R.id.etAddNew)).getText());
                                        if (valueOf.length() == 0) {
                                            z10 = true;
                                        }
                                        if (z10) {
                                            Utils.INSTANCE.showCustomToast(this$0.getActivity(), "Enter Text");
                                            return;
                                        }
                                        ((RobertoEditText) this$0._$_findCachedViewById(R.id.etAddNew)).setText("");
                                        this$0.J(valueOf);
                                        return;
                                    case 1:
                                        int i13 = f8.C;
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        try {
                                            if (this$0.f18391v == null) {
                                                Utils utils = Utils.INSTANCE;
                                                androidx.fragment.app.p activity3 = this$0.getActivity();
                                                if (kotlin.jvm.internal.i.b(this$0.f18394y, "")) {
                                                    str10 = this$0.getString(R.string.select_1_option);
                                                } else {
                                                    str10 = this$0.f18394y;
                                                }
                                                kotlin.jvm.internal.i.f(str10, "if (errorMsg == \"\") getS…t_1_option) else errorMsg");
                                                utils.showCustomToast(activity3, str10);
                                                return;
                                            }
                                            androidx.fragment.app.p activity4 = this$0.getActivity();
                                            kotlin.jvm.internal.i.e(activity4, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                            TemplateActivity templateActivity = (TemplateActivity) activity4;
                                            String B0 = templateActivity.B0();
                                            int hashCode = B0.hashCode();
                                            HashSet<String> hashSet2 = this$0.f18392w;
                                            HashMap<String, Object> hashMap3 = templateActivity.F;
                                            switch (hashCode) {
                                                case -955847334:
                                                    if (!B0.equals("s118-b")) {
                                                        hashMap3.put("userAdded", new ArrayList(hashSet2));
                                                        hashMap3.put("list", ca.a.k(this$0.f18391v));
                                                        String str1222222 = this$0.f18391v;
                                                        kotlin.jvm.internal.i.d(str1222222);
                                                        hashMap3.put("s5_user_data", str1222222);
                                                        templateActivity.t0();
                                                        return;
                                                    }
                                                    hashMap3.put("list", ca.a.k(this$0.f18391v));
                                                    hashMap3.put("userAdded", new ArrayList(hashSet2));
                                                    String str132 = this$0.f18391v;
                                                    kotlin.jvm.internal.i.d(str132);
                                                    hashMap3.put("s5_user_data", str132);
                                                    return;
                                                case -955758923:
                                                    if (B0.equals("s147-a")) {
                                                        hashMap3.put("s147a_userAdded", new ArrayList(hashSet2));
                                                        if (hashMap3.containsKey("list") && (hashMap3.get("list") instanceof ArrayList)) {
                                                            kotlin.jvm.internal.i.e(hashMap3.get("list"), "null cannot be cast to non-null type java.util.ArrayList<*>{ kotlin.collections.TypeAliasesKt.ArrayList<*> }");
                                                            if (!((ArrayList) obj10).isEmpty()) {
                                                                Object obj11 = hashMap3.get("list");
                                                                kotlin.jvm.internal.i.e(obj11, "null cannot be cast to non-null type java.util.ArrayList<*>{ kotlin.collections.TypeAliasesKt.ArrayList<*> }");
                                                                if (is.u.j2(0, (ArrayList) obj11) instanceof String) {
                                                                    Object obj12 = hashMap3.get("list");
                                                                    kotlin.jvm.internal.i.e(obj12, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                                                                    ArrayList arrayList2 = (ArrayList) obj12;
                                                                    String str14 = this$0.f18391v;
                                                                    if (str14 != null) {
                                                                        str11 = str14;
                                                                    }
                                                                    arrayList2.set(0, str11);
                                                                    String str152 = this$0.f18391v;
                                                                    kotlin.jvm.internal.i.d(str152);
                                                                    hashMap3.put("s147a_user_data", str152);
                                                                    templateActivity.t0();
                                                                    return;
                                                                }
                                                            }
                                                        }
                                                        hashMap3.put("list", ca.a.k(this$0.f18391v));
                                                        String str1522 = this$0.f18391v;
                                                        kotlin.jvm.internal.i.d(str1522);
                                                        hashMap3.put("s147a_user_data", str1522);
                                                        templateActivity.t0();
                                                        return;
                                                    }
                                                    hashMap3.put("userAdded", new ArrayList(hashSet2));
                                                    hashMap3.put("list", ca.a.k(this$0.f18391v));
                                                    String str12222222 = this$0.f18391v;
                                                    kotlin.jvm.internal.i.d(str12222222);
                                                    hashMap3.put("s5_user_data", str12222222);
                                                    templateActivity.t0();
                                                    return;
                                                case -955758922:
                                                    if (B0.equals("s147-b")) {
                                                        hashMap3.put("s147b_userAdded", new ArrayList(hashSet2));
                                                        Object obj13 = hashMap3.get("list");
                                                        kotlin.jvm.internal.i.e(obj13, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                                                        ArrayList arrayList3 = (ArrayList) obj13;
                                                        if (arrayList3.size() >= 2) {
                                                            String str16 = this$0.f18391v;
                                                            kotlin.jvm.internal.i.d(str16);
                                                            arrayList3.set(1, str16);
                                                        } else {
                                                            String str17 = this$0.f18391v;
                                                            kotlin.jvm.internal.i.d(str17);
                                                            arrayList3.add(str17);
                                                        }
                                                        hashMap3.put("list", arrayList3);
                                                        String str18 = this$0.f18391v;
                                                        kotlin.jvm.internal.i.d(str18);
                                                        hashMap3.put("s147b_user_data", str18);
                                                        templateActivity.t0();
                                                        return;
                                                    }
                                                    hashMap3.put("userAdded", new ArrayList(hashSet2));
                                                    hashMap3.put("list", ca.a.k(this$0.f18391v));
                                                    String str122222222 = this$0.f18391v;
                                                    kotlin.jvm.internal.i.d(str122222222);
                                                    hashMap3.put("s5_user_data", str122222222);
                                                    templateActivity.t0();
                                                    return;
                                                case 3474656:
                                                    if (!B0.equals("s124")) {
                                                        hashMap3.put("userAdded", new ArrayList(hashSet2));
                                                        hashMap3.put("list", ca.a.k(this$0.f18391v));
                                                        String str1222222222 = this$0.f18391v;
                                                        kotlin.jvm.internal.i.d(str1222222222);
                                                        hashMap3.put("s5_user_data", str1222222222);
                                                        templateActivity.t0();
                                                        return;
                                                    }
                                                    hashMap3.put("list", ca.a.k(this$0.f18391v));
                                                    hashMap3.put("userAdded", new ArrayList(hashSet2));
                                                    String str1322 = this$0.f18391v;
                                                    kotlin.jvm.internal.i.d(str1322);
                                                    hashMap3.put("s5_user_data", str1322);
                                                    return;
                                                case 3478391:
                                                    if (B0.equals("s5-b")) {
                                                        if (hashMap3.containsKey(Constants.DAYMODEL_POSITION)) {
                                                            Object obj14 = hashMap3.get(Constants.DAYMODEL_POSITION);
                                                            kotlin.jvm.internal.i.e(obj14, "null cannot be cast to non-null type kotlin.Int");
                                                            i10 = ((Integer) obj14).intValue();
                                                        } else {
                                                            i10 = 0;
                                                        }
                                                        Object obj15 = hashMap3.get("list");
                                                        kotlin.jvm.internal.i.e(obj15, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                                                        ArrayList arrayList4 = (ArrayList) obj15;
                                                        int i14 = i10 + 1;
                                                        if (arrayList4.size() >= i14) {
                                                            String str19 = this$0.f18391v;
                                                            kotlin.jvm.internal.i.d(str19);
                                                            arrayList4.set(i10, str19);
                                                        } else {
                                                            String str20 = this$0.f18391v;
                                                            kotlin.jvm.internal.i.d(str20);
                                                            arrayList4.add(i10, str20);
                                                        }
                                                        hashMap3.put("userAdded" + i10, new ArrayList(hashSet2));
                                                        String str21 = "s5_user_data" + i10;
                                                        String str22 = this$0.f18391v;
                                                        kotlin.jvm.internal.i.d(str22);
                                                        hashMap3.put(str21, str22);
                                                        hashMap3.put("list", arrayList4);
                                                        hashMap3.put(Constants.DAYMODEL_POSITION, Integer.valueOf(i14));
                                                        templateActivity.t0();
                                                        return;
                                                    }
                                                    hashMap3.put("userAdded", new ArrayList(hashSet2));
                                                    hashMap3.put("list", ca.a.k(this$0.f18391v));
                                                    String str12222222222 = this$0.f18391v;
                                                    kotlin.jvm.internal.i.d(str12222222222);
                                                    hashMap3.put("s5_user_data", str12222222222);
                                                    templateActivity.t0();
                                                    return;
                                                default:
                                                    hashMap3.put("userAdded", new ArrayList(hashSet2));
                                                    hashMap3.put("list", ca.a.k(this$0.f18391v));
                                                    String str122222222222 = this$0.f18391v;
                                                    kotlin.jvm.internal.i.d(str122222222222);
                                                    hashMap3.put("s5_user_data", str122222222222);
                                                    templateActivity.t0();
                                                    return;
                                            }
                                        } catch (Exception e12) {
                                            LogHelper.INSTANCE.e(this$0.f18390u, "Exception", e12);
                                            return;
                                        }
                                    default:
                                        int i15 = f8.C;
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        if (kotlin.jvm.internal.i.b(this$0.A, "s147-b")) {
                                            this$0.M().onBackPressed();
                                            return;
                                        }
                                        androidx.fragment.app.p activity5 = this$0.getActivity();
                                        kotlin.jvm.internal.i.e(activity5, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                        if (((TemplateActivity) activity5).getIntent().hasExtra("source") && kotlin.jvm.internal.i.b(this$0.M().getIntent().getStringExtra("source"), "goals")) {
                                            androidx.fragment.app.p activity6 = this$0.getActivity();
                                            kotlin.jvm.internal.i.e(activity6, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                            ((TemplateActivity) activity6).Q = true;
                                            androidx.fragment.app.p activity7 = this$0.getActivity();
                                            kotlin.jvm.internal.i.e(activity7, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                            ((TemplateActivity) activity7).J0();
                                            return;
                                        }
                                        this$0.M().onBackPressed();
                                        return;
                                }
                            }
                        });
                        ((RobertoEditText) _$_findCachedViewById(R.id.etAddNew)).setOnFocusChangeListener(new dc.b(12, this));
                        ((ImageView) _$_findCachedViewById(R.id.ivHelp)).setVisibility(8);
                        ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setVisibility(8);
                        ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new View.OnClickListener(this) { // from class: hr.d8

                            /* renamed from: v  reason: collision with root package name */
                            public final /* synthetic */ f8 f18317v;

                            {
                                this.f18317v = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                Object obj10;
                                int i10;
                                String str10;
                                int i11 = r2;
                                String str11 = "";
                                f8 this$0 = this.f18317v;
                                switch (i11) {
                                    case 0:
                                        boolean z10 = false;
                                        int i12 = f8.C;
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        String valueOf = String.valueOf(((RobertoEditText) this$0._$_findCachedViewById(R.id.etAddNew)).getText());
                                        if (valueOf.length() == 0) {
                                            z10 = true;
                                        }
                                        if (z10) {
                                            Utils.INSTANCE.showCustomToast(this$0.getActivity(), "Enter Text");
                                            return;
                                        }
                                        ((RobertoEditText) this$0._$_findCachedViewById(R.id.etAddNew)).setText("");
                                        this$0.J(valueOf);
                                        return;
                                    case 1:
                                        int i13 = f8.C;
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        try {
                                            if (this$0.f18391v == null) {
                                                Utils utils = Utils.INSTANCE;
                                                androidx.fragment.app.p activity3 = this$0.getActivity();
                                                if (kotlin.jvm.internal.i.b(this$0.f18394y, "")) {
                                                    str10 = this$0.getString(R.string.select_1_option);
                                                } else {
                                                    str10 = this$0.f18394y;
                                                }
                                                kotlin.jvm.internal.i.f(str10, "if (errorMsg == \"\") getS…t_1_option) else errorMsg");
                                                utils.showCustomToast(activity3, str10);
                                                return;
                                            }
                                            androidx.fragment.app.p activity4 = this$0.getActivity();
                                            kotlin.jvm.internal.i.e(activity4, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                            TemplateActivity templateActivity = (TemplateActivity) activity4;
                                            String B0 = templateActivity.B0();
                                            int hashCode = B0.hashCode();
                                            HashSet<String> hashSet2 = this$0.f18392w;
                                            HashMap<String, Object> hashMap3 = templateActivity.F;
                                            switch (hashCode) {
                                                case -955847334:
                                                    if (!B0.equals("s118-b")) {
                                                        hashMap3.put("userAdded", new ArrayList(hashSet2));
                                                        hashMap3.put("list", ca.a.k(this$0.f18391v));
                                                        String str122222222222 = this$0.f18391v;
                                                        kotlin.jvm.internal.i.d(str122222222222);
                                                        hashMap3.put("s5_user_data", str122222222222);
                                                        templateActivity.t0();
                                                        return;
                                                    }
                                                    hashMap3.put("list", ca.a.k(this$0.f18391v));
                                                    hashMap3.put("userAdded", new ArrayList(hashSet2));
                                                    String str1322 = this$0.f18391v;
                                                    kotlin.jvm.internal.i.d(str1322);
                                                    hashMap3.put("s5_user_data", str1322);
                                                    return;
                                                case -955758923:
                                                    if (B0.equals("s147-a")) {
                                                        hashMap3.put("s147a_userAdded", new ArrayList(hashSet2));
                                                        if (hashMap3.containsKey("list") && (hashMap3.get("list") instanceof ArrayList)) {
                                                            kotlin.jvm.internal.i.e(hashMap3.get("list"), "null cannot be cast to non-null type java.util.ArrayList<*>{ kotlin.collections.TypeAliasesKt.ArrayList<*> }");
                                                            if (!((ArrayList) obj10).isEmpty()) {
                                                                Object obj11 = hashMap3.get("list");
                                                                kotlin.jvm.internal.i.e(obj11, "null cannot be cast to non-null type java.util.ArrayList<*>{ kotlin.collections.TypeAliasesKt.ArrayList<*> }");
                                                                if (is.u.j2(0, (ArrayList) obj11) instanceof String) {
                                                                    Object obj12 = hashMap3.get("list");
                                                                    kotlin.jvm.internal.i.e(obj12, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                                                                    ArrayList arrayList2 = (ArrayList) obj12;
                                                                    String str14 = this$0.f18391v;
                                                                    if (str14 != null) {
                                                                        str11 = str14;
                                                                    }
                                                                    arrayList2.set(0, str11);
                                                                    String str1522 = this$0.f18391v;
                                                                    kotlin.jvm.internal.i.d(str1522);
                                                                    hashMap3.put("s147a_user_data", str1522);
                                                                    templateActivity.t0();
                                                                    return;
                                                                }
                                                            }
                                                        }
                                                        hashMap3.put("list", ca.a.k(this$0.f18391v));
                                                        String str15222 = this$0.f18391v;
                                                        kotlin.jvm.internal.i.d(str15222);
                                                        hashMap3.put("s147a_user_data", str15222);
                                                        templateActivity.t0();
                                                        return;
                                                    }
                                                    hashMap3.put("userAdded", new ArrayList(hashSet2));
                                                    hashMap3.put("list", ca.a.k(this$0.f18391v));
                                                    String str1222222222222 = this$0.f18391v;
                                                    kotlin.jvm.internal.i.d(str1222222222222);
                                                    hashMap3.put("s5_user_data", str1222222222222);
                                                    templateActivity.t0();
                                                    return;
                                                case -955758922:
                                                    if (B0.equals("s147-b")) {
                                                        hashMap3.put("s147b_userAdded", new ArrayList(hashSet2));
                                                        Object obj13 = hashMap3.get("list");
                                                        kotlin.jvm.internal.i.e(obj13, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                                                        ArrayList arrayList3 = (ArrayList) obj13;
                                                        if (arrayList3.size() >= 2) {
                                                            String str16 = this$0.f18391v;
                                                            kotlin.jvm.internal.i.d(str16);
                                                            arrayList3.set(1, str16);
                                                        } else {
                                                            String str17 = this$0.f18391v;
                                                            kotlin.jvm.internal.i.d(str17);
                                                            arrayList3.add(str17);
                                                        }
                                                        hashMap3.put("list", arrayList3);
                                                        String str18 = this$0.f18391v;
                                                        kotlin.jvm.internal.i.d(str18);
                                                        hashMap3.put("s147b_user_data", str18);
                                                        templateActivity.t0();
                                                        return;
                                                    }
                                                    hashMap3.put("userAdded", new ArrayList(hashSet2));
                                                    hashMap3.put("list", ca.a.k(this$0.f18391v));
                                                    String str12222222222222 = this$0.f18391v;
                                                    kotlin.jvm.internal.i.d(str12222222222222);
                                                    hashMap3.put("s5_user_data", str12222222222222);
                                                    templateActivity.t0();
                                                    return;
                                                case 3474656:
                                                    if (!B0.equals("s124")) {
                                                        hashMap3.put("userAdded", new ArrayList(hashSet2));
                                                        hashMap3.put("list", ca.a.k(this$0.f18391v));
                                                        String str122222222222222 = this$0.f18391v;
                                                        kotlin.jvm.internal.i.d(str122222222222222);
                                                        hashMap3.put("s5_user_data", str122222222222222);
                                                        templateActivity.t0();
                                                        return;
                                                    }
                                                    hashMap3.put("list", ca.a.k(this$0.f18391v));
                                                    hashMap3.put("userAdded", new ArrayList(hashSet2));
                                                    String str13222 = this$0.f18391v;
                                                    kotlin.jvm.internal.i.d(str13222);
                                                    hashMap3.put("s5_user_data", str13222);
                                                    return;
                                                case 3478391:
                                                    if (B0.equals("s5-b")) {
                                                        if (hashMap3.containsKey(Constants.DAYMODEL_POSITION)) {
                                                            Object obj14 = hashMap3.get(Constants.DAYMODEL_POSITION);
                                                            kotlin.jvm.internal.i.e(obj14, "null cannot be cast to non-null type kotlin.Int");
                                                            i10 = ((Integer) obj14).intValue();
                                                        } else {
                                                            i10 = 0;
                                                        }
                                                        Object obj15 = hashMap3.get("list");
                                                        kotlin.jvm.internal.i.e(obj15, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                                                        ArrayList arrayList4 = (ArrayList) obj15;
                                                        int i14 = i10 + 1;
                                                        if (arrayList4.size() >= i14) {
                                                            String str19 = this$0.f18391v;
                                                            kotlin.jvm.internal.i.d(str19);
                                                            arrayList4.set(i10, str19);
                                                        } else {
                                                            String str20 = this$0.f18391v;
                                                            kotlin.jvm.internal.i.d(str20);
                                                            arrayList4.add(i10, str20);
                                                        }
                                                        hashMap3.put("userAdded" + i10, new ArrayList(hashSet2));
                                                        String str21 = "s5_user_data" + i10;
                                                        String str22 = this$0.f18391v;
                                                        kotlin.jvm.internal.i.d(str22);
                                                        hashMap3.put(str21, str22);
                                                        hashMap3.put("list", arrayList4);
                                                        hashMap3.put(Constants.DAYMODEL_POSITION, Integer.valueOf(i14));
                                                        templateActivity.t0();
                                                        return;
                                                    }
                                                    hashMap3.put("userAdded", new ArrayList(hashSet2));
                                                    hashMap3.put("list", ca.a.k(this$0.f18391v));
                                                    String str1222222222222222 = this$0.f18391v;
                                                    kotlin.jvm.internal.i.d(str1222222222222222);
                                                    hashMap3.put("s5_user_data", str1222222222222222);
                                                    templateActivity.t0();
                                                    return;
                                                default:
                                                    hashMap3.put("userAdded", new ArrayList(hashSet2));
                                                    hashMap3.put("list", ca.a.k(this$0.f18391v));
                                                    String str12222222222222222 = this$0.f18391v;
                                                    kotlin.jvm.internal.i.d(str12222222222222222);
                                                    hashMap3.put("s5_user_data", str12222222222222222);
                                                    templateActivity.t0();
                                                    return;
                                            }
                                        } catch (Exception e12) {
                                            LogHelper.INSTANCE.e(this$0.f18390u, "Exception", e12);
                                            return;
                                        }
                                    default:
                                        int i15 = f8.C;
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        if (kotlin.jvm.internal.i.b(this$0.A, "s147-b")) {
                                            this$0.M().onBackPressed();
                                            return;
                                        }
                                        androidx.fragment.app.p activity5 = this$0.getActivity();
                                        kotlin.jvm.internal.i.e(activity5, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                        if (((TemplateActivity) activity5).getIntent().hasExtra("source") && kotlin.jvm.internal.i.b(this$0.M().getIntent().getStringExtra("source"), "goals")) {
                                            androidx.fragment.app.p activity6 = this$0.getActivity();
                                            kotlin.jvm.internal.i.e(activity6, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                            ((TemplateActivity) activity6).Q = true;
                                            androidx.fragment.app.p activity7 = this$0.getActivity();
                                            kotlin.jvm.internal.i.e(activity7, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                            ((TemplateActivity) activity7).J0();
                                            return;
                                        }
                                        this$0.M().onBackPressed();
                                        return;
                                }
                            }
                        });
                    }
                } else {
                    if (M().J || M().P) {
                        if (M().F.containsKey(Constants.DAYMODEL_POSITION)) {
                            Object obj10 = M().F.get(Constants.DAYMODEL_POSITION);
                            kotlin.jvm.internal.i.e(obj10, "null cannot be cast to non-null type kotlin.Int");
                            i6 = ((Integer) obj10).intValue();
                        } else {
                            i6 = 0;
                        }
                        HashMap<String, Object> hashMap3 = M().F;
                        if (hashMap3.containsKey("userAdded" + i6)) {
                            HashMap<String, Object> hashMap4 = M().F;
                            Object obj11 = hashMap4.get("userAdded" + i6);
                            kotlin.jvm.internal.i.e(obj11, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                            hashSet.addAll((ArrayList) obj11);
                            arrayList.addAll(is.u.I2(hashSet));
                        }
                        HashMap<String, Object> hashMap5 = M().F;
                        if (hashMap5.containsKey("s5_user_data" + i6)) {
                            HashMap<String, Object> hashMap6 = M().F;
                            Object obj12 = hashMap6.get("s5_user_data" + i6);
                            kotlin.jvm.internal.i.e(obj12, "null cannot be cast to non-null type kotlin.String");
                            this.f18391v = (String) obj12;
                        }
                    }
                    obj3 = "s147-b";
                }
            } catch (Exception e12) {
                e = e12;
                obj3 = "s147-b";
                LogHelper.INSTANCE.e(str2, "exception", e);
                str = this.A;
                switch (str.hashCode()) {
                    case -955847334:
                        break;
                    case -955758923:
                        break;
                    case -955758922:
                        break;
                    case 3478391:
                        break;
                }
                P(arrayList);
                ((ImageButton) _$_findCachedViewById(R.id.imgTextAdd)).setOnClickListener(new View.OnClickListener(this) { // from class: hr.d8

                    /* renamed from: v  reason: collision with root package name */
                    public final /* synthetic */ f8 f18317v;

                    {
                        this.f18317v = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        Object obj102;
                        int i10;
                        String str10;
                        int i11 = r2;
                        String str11 = "";
                        f8 this$0 = this.f18317v;
                        switch (i11) {
                            case 0:
                                boolean z10 = false;
                                int i12 = f8.C;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                String valueOf = String.valueOf(((RobertoEditText) this$0._$_findCachedViewById(R.id.etAddNew)).getText());
                                if (valueOf.length() == 0) {
                                    z10 = true;
                                }
                                if (z10) {
                                    Utils.INSTANCE.showCustomToast(this$0.getActivity(), "Enter Text");
                                    return;
                                }
                                ((RobertoEditText) this$0._$_findCachedViewById(R.id.etAddNew)).setText("");
                                this$0.J(valueOf);
                                return;
                            case 1:
                                int i13 = f8.C;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                try {
                                    if (this$0.f18391v == null) {
                                        Utils utils = Utils.INSTANCE;
                                        androidx.fragment.app.p activity3 = this$0.getActivity();
                                        if (kotlin.jvm.internal.i.b(this$0.f18394y, "")) {
                                            str10 = this$0.getString(R.string.select_1_option);
                                        } else {
                                            str10 = this$0.f18394y;
                                        }
                                        kotlin.jvm.internal.i.f(str10, "if (errorMsg == \"\") getS…t_1_option) else errorMsg");
                                        utils.showCustomToast(activity3, str10);
                                        return;
                                    }
                                    androidx.fragment.app.p activity4 = this$0.getActivity();
                                    kotlin.jvm.internal.i.e(activity4, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                    TemplateActivity templateActivity = (TemplateActivity) activity4;
                                    String B0 = templateActivity.B0();
                                    int hashCode = B0.hashCode();
                                    HashSet<String> hashSet2 = this$0.f18392w;
                                    HashMap<String, Object> hashMap32 = templateActivity.F;
                                    switch (hashCode) {
                                        case -955847334:
                                            if (!B0.equals("s118-b")) {
                                                hashMap32.put("userAdded", new ArrayList(hashSet2));
                                                hashMap32.put("list", ca.a.k(this$0.f18391v));
                                                String str12222222222222222 = this$0.f18391v;
                                                kotlin.jvm.internal.i.d(str12222222222222222);
                                                hashMap32.put("s5_user_data", str12222222222222222);
                                                templateActivity.t0();
                                                return;
                                            }
                                            hashMap32.put("list", ca.a.k(this$0.f18391v));
                                            hashMap32.put("userAdded", new ArrayList(hashSet2));
                                            String str13222 = this$0.f18391v;
                                            kotlin.jvm.internal.i.d(str13222);
                                            hashMap32.put("s5_user_data", str13222);
                                            return;
                                        case -955758923:
                                            if (B0.equals("s147-a")) {
                                                hashMap32.put("s147a_userAdded", new ArrayList(hashSet2));
                                                if (hashMap32.containsKey("list") && (hashMap32.get("list") instanceof ArrayList)) {
                                                    kotlin.jvm.internal.i.e(hashMap32.get("list"), "null cannot be cast to non-null type java.util.ArrayList<*>{ kotlin.collections.TypeAliasesKt.ArrayList<*> }");
                                                    if (!((ArrayList) obj102).isEmpty()) {
                                                        Object obj112 = hashMap32.get("list");
                                                        kotlin.jvm.internal.i.e(obj112, "null cannot be cast to non-null type java.util.ArrayList<*>{ kotlin.collections.TypeAliasesKt.ArrayList<*> }");
                                                        if (is.u.j2(0, (ArrayList) obj112) instanceof String) {
                                                            Object obj122 = hashMap32.get("list");
                                                            kotlin.jvm.internal.i.e(obj122, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                                                            ArrayList arrayList2 = (ArrayList) obj122;
                                                            String str14 = this$0.f18391v;
                                                            if (str14 != null) {
                                                                str11 = str14;
                                                            }
                                                            arrayList2.set(0, str11);
                                                            String str15222 = this$0.f18391v;
                                                            kotlin.jvm.internal.i.d(str15222);
                                                            hashMap32.put("s147a_user_data", str15222);
                                                            templateActivity.t0();
                                                            return;
                                                        }
                                                    }
                                                }
                                                hashMap32.put("list", ca.a.k(this$0.f18391v));
                                                String str152222 = this$0.f18391v;
                                                kotlin.jvm.internal.i.d(str152222);
                                                hashMap32.put("s147a_user_data", str152222);
                                                templateActivity.t0();
                                                return;
                                            }
                                            hashMap32.put("userAdded", new ArrayList(hashSet2));
                                            hashMap32.put("list", ca.a.k(this$0.f18391v));
                                            String str122222222222222222 = this$0.f18391v;
                                            kotlin.jvm.internal.i.d(str122222222222222222);
                                            hashMap32.put("s5_user_data", str122222222222222222);
                                            templateActivity.t0();
                                            return;
                                        case -955758922:
                                            if (B0.equals("s147-b")) {
                                                hashMap32.put("s147b_userAdded", new ArrayList(hashSet2));
                                                Object obj13 = hashMap32.get("list");
                                                kotlin.jvm.internal.i.e(obj13, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                                                ArrayList arrayList3 = (ArrayList) obj13;
                                                if (arrayList3.size() >= 2) {
                                                    String str16 = this$0.f18391v;
                                                    kotlin.jvm.internal.i.d(str16);
                                                    arrayList3.set(1, str16);
                                                } else {
                                                    String str17 = this$0.f18391v;
                                                    kotlin.jvm.internal.i.d(str17);
                                                    arrayList3.add(str17);
                                                }
                                                hashMap32.put("list", arrayList3);
                                                String str18 = this$0.f18391v;
                                                kotlin.jvm.internal.i.d(str18);
                                                hashMap32.put("s147b_user_data", str18);
                                                templateActivity.t0();
                                                return;
                                            }
                                            hashMap32.put("userAdded", new ArrayList(hashSet2));
                                            hashMap32.put("list", ca.a.k(this$0.f18391v));
                                            String str1222222222222222222 = this$0.f18391v;
                                            kotlin.jvm.internal.i.d(str1222222222222222222);
                                            hashMap32.put("s5_user_data", str1222222222222222222);
                                            templateActivity.t0();
                                            return;
                                        case 3474656:
                                            if (!B0.equals("s124")) {
                                                hashMap32.put("userAdded", new ArrayList(hashSet2));
                                                hashMap32.put("list", ca.a.k(this$0.f18391v));
                                                String str12222222222222222222 = this$0.f18391v;
                                                kotlin.jvm.internal.i.d(str12222222222222222222);
                                                hashMap32.put("s5_user_data", str12222222222222222222);
                                                templateActivity.t0();
                                                return;
                                            }
                                            hashMap32.put("list", ca.a.k(this$0.f18391v));
                                            hashMap32.put("userAdded", new ArrayList(hashSet2));
                                            String str132222 = this$0.f18391v;
                                            kotlin.jvm.internal.i.d(str132222);
                                            hashMap32.put("s5_user_data", str132222);
                                            return;
                                        case 3478391:
                                            if (B0.equals("s5-b")) {
                                                if (hashMap32.containsKey(Constants.DAYMODEL_POSITION)) {
                                                    Object obj14 = hashMap32.get(Constants.DAYMODEL_POSITION);
                                                    kotlin.jvm.internal.i.e(obj14, "null cannot be cast to non-null type kotlin.Int");
                                                    i10 = ((Integer) obj14).intValue();
                                                } else {
                                                    i10 = 0;
                                                }
                                                Object obj15 = hashMap32.get("list");
                                                kotlin.jvm.internal.i.e(obj15, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                                                ArrayList arrayList4 = (ArrayList) obj15;
                                                int i14 = i10 + 1;
                                                if (arrayList4.size() >= i14) {
                                                    String str19 = this$0.f18391v;
                                                    kotlin.jvm.internal.i.d(str19);
                                                    arrayList4.set(i10, str19);
                                                } else {
                                                    String str20 = this$0.f18391v;
                                                    kotlin.jvm.internal.i.d(str20);
                                                    arrayList4.add(i10, str20);
                                                }
                                                hashMap32.put("userAdded" + i10, new ArrayList(hashSet2));
                                                String str21 = "s5_user_data" + i10;
                                                String str22 = this$0.f18391v;
                                                kotlin.jvm.internal.i.d(str22);
                                                hashMap32.put(str21, str22);
                                                hashMap32.put("list", arrayList4);
                                                hashMap32.put(Constants.DAYMODEL_POSITION, Integer.valueOf(i14));
                                                templateActivity.t0();
                                                return;
                                            }
                                            hashMap32.put("userAdded", new ArrayList(hashSet2));
                                            hashMap32.put("list", ca.a.k(this$0.f18391v));
                                            String str122222222222222222222 = this$0.f18391v;
                                            kotlin.jvm.internal.i.d(str122222222222222222222);
                                            hashMap32.put("s5_user_data", str122222222222222222222);
                                            templateActivity.t0();
                                            return;
                                        default:
                                            hashMap32.put("userAdded", new ArrayList(hashSet2));
                                            hashMap32.put("list", ca.a.k(this$0.f18391v));
                                            String str1222222222222222222222 = this$0.f18391v;
                                            kotlin.jvm.internal.i.d(str1222222222222222222222);
                                            hashMap32.put("s5_user_data", str1222222222222222222222);
                                            templateActivity.t0();
                                            return;
                                    }
                                } catch (Exception e122) {
                                    LogHelper.INSTANCE.e(this$0.f18390u, "Exception", e122);
                                    return;
                                }
                            default:
                                int i15 = f8.C;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                if (kotlin.jvm.internal.i.b(this$0.A, "s147-b")) {
                                    this$0.M().onBackPressed();
                                    return;
                                }
                                androidx.fragment.app.p activity5 = this$0.getActivity();
                                kotlin.jvm.internal.i.e(activity5, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                if (((TemplateActivity) activity5).getIntent().hasExtra("source") && kotlin.jvm.internal.i.b(this$0.M().getIntent().getStringExtra("source"), "goals")) {
                                    androidx.fragment.app.p activity6 = this$0.getActivity();
                                    kotlin.jvm.internal.i.e(activity6, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                    ((TemplateActivity) activity6).Q = true;
                                    androidx.fragment.app.p activity7 = this$0.getActivity();
                                    kotlin.jvm.internal.i.e(activity7, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                    ((TemplateActivity) activity7).J0();
                                    return;
                                }
                                this$0.M().onBackPressed();
                                return;
                        }
                    }
                });
                ((RobertoEditText) _$_findCachedViewById(R.id.etAddNew)).addTextChangedListener(new a());
                ((RobertoEditText) _$_findCachedViewById(R.id.etAddNew)).setOnEditorActionListener(new dl.w(13, this));
                ((RobertoButton) _$_findCachedViewById(R.id.btnS5Button)).setOnClickListener(new View.OnClickListener(this) { // from class: hr.d8

                    /* renamed from: v  reason: collision with root package name */
                    public final /* synthetic */ f8 f18317v;

                    {
                        this.f18317v = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        Object obj102;
                        int i10;
                        String str10;
                        int i11 = r2;
                        String str11 = "";
                        f8 this$0 = this.f18317v;
                        switch (i11) {
                            case 0:
                                boolean z10 = false;
                                int i12 = f8.C;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                String valueOf = String.valueOf(((RobertoEditText) this$0._$_findCachedViewById(R.id.etAddNew)).getText());
                                if (valueOf.length() == 0) {
                                    z10 = true;
                                }
                                if (z10) {
                                    Utils.INSTANCE.showCustomToast(this$0.getActivity(), "Enter Text");
                                    return;
                                }
                                ((RobertoEditText) this$0._$_findCachedViewById(R.id.etAddNew)).setText("");
                                this$0.J(valueOf);
                                return;
                            case 1:
                                int i13 = f8.C;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                try {
                                    if (this$0.f18391v == null) {
                                        Utils utils = Utils.INSTANCE;
                                        androidx.fragment.app.p activity3 = this$0.getActivity();
                                        if (kotlin.jvm.internal.i.b(this$0.f18394y, "")) {
                                            str10 = this$0.getString(R.string.select_1_option);
                                        } else {
                                            str10 = this$0.f18394y;
                                        }
                                        kotlin.jvm.internal.i.f(str10, "if (errorMsg == \"\") getS…t_1_option) else errorMsg");
                                        utils.showCustomToast(activity3, str10);
                                        return;
                                    }
                                    androidx.fragment.app.p activity4 = this$0.getActivity();
                                    kotlin.jvm.internal.i.e(activity4, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                    TemplateActivity templateActivity = (TemplateActivity) activity4;
                                    String B0 = templateActivity.B0();
                                    int hashCode = B0.hashCode();
                                    HashSet<String> hashSet2 = this$0.f18392w;
                                    HashMap<String, Object> hashMap32 = templateActivity.F;
                                    switch (hashCode) {
                                        case -955847334:
                                            if (!B0.equals("s118-b")) {
                                                hashMap32.put("userAdded", new ArrayList(hashSet2));
                                                hashMap32.put("list", ca.a.k(this$0.f18391v));
                                                String str1222222222222222222222 = this$0.f18391v;
                                                kotlin.jvm.internal.i.d(str1222222222222222222222);
                                                hashMap32.put("s5_user_data", str1222222222222222222222);
                                                templateActivity.t0();
                                                return;
                                            }
                                            hashMap32.put("list", ca.a.k(this$0.f18391v));
                                            hashMap32.put("userAdded", new ArrayList(hashSet2));
                                            String str132222 = this$0.f18391v;
                                            kotlin.jvm.internal.i.d(str132222);
                                            hashMap32.put("s5_user_data", str132222);
                                            return;
                                        case -955758923:
                                            if (B0.equals("s147-a")) {
                                                hashMap32.put("s147a_userAdded", new ArrayList(hashSet2));
                                                if (hashMap32.containsKey("list") && (hashMap32.get("list") instanceof ArrayList)) {
                                                    kotlin.jvm.internal.i.e(hashMap32.get("list"), "null cannot be cast to non-null type java.util.ArrayList<*>{ kotlin.collections.TypeAliasesKt.ArrayList<*> }");
                                                    if (!((ArrayList) obj102).isEmpty()) {
                                                        Object obj112 = hashMap32.get("list");
                                                        kotlin.jvm.internal.i.e(obj112, "null cannot be cast to non-null type java.util.ArrayList<*>{ kotlin.collections.TypeAliasesKt.ArrayList<*> }");
                                                        if (is.u.j2(0, (ArrayList) obj112) instanceof String) {
                                                            Object obj122 = hashMap32.get("list");
                                                            kotlin.jvm.internal.i.e(obj122, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                                                            ArrayList arrayList2 = (ArrayList) obj122;
                                                            String str14 = this$0.f18391v;
                                                            if (str14 != null) {
                                                                str11 = str14;
                                                            }
                                                            arrayList2.set(0, str11);
                                                            String str152222 = this$0.f18391v;
                                                            kotlin.jvm.internal.i.d(str152222);
                                                            hashMap32.put("s147a_user_data", str152222);
                                                            templateActivity.t0();
                                                            return;
                                                        }
                                                    }
                                                }
                                                hashMap32.put("list", ca.a.k(this$0.f18391v));
                                                String str1522222 = this$0.f18391v;
                                                kotlin.jvm.internal.i.d(str1522222);
                                                hashMap32.put("s147a_user_data", str1522222);
                                                templateActivity.t0();
                                                return;
                                            }
                                            hashMap32.put("userAdded", new ArrayList(hashSet2));
                                            hashMap32.put("list", ca.a.k(this$0.f18391v));
                                            String str12222222222222222222222 = this$0.f18391v;
                                            kotlin.jvm.internal.i.d(str12222222222222222222222);
                                            hashMap32.put("s5_user_data", str12222222222222222222222);
                                            templateActivity.t0();
                                            return;
                                        case -955758922:
                                            if (B0.equals("s147-b")) {
                                                hashMap32.put("s147b_userAdded", new ArrayList(hashSet2));
                                                Object obj13 = hashMap32.get("list");
                                                kotlin.jvm.internal.i.e(obj13, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                                                ArrayList arrayList3 = (ArrayList) obj13;
                                                if (arrayList3.size() >= 2) {
                                                    String str16 = this$0.f18391v;
                                                    kotlin.jvm.internal.i.d(str16);
                                                    arrayList3.set(1, str16);
                                                } else {
                                                    String str17 = this$0.f18391v;
                                                    kotlin.jvm.internal.i.d(str17);
                                                    arrayList3.add(str17);
                                                }
                                                hashMap32.put("list", arrayList3);
                                                String str18 = this$0.f18391v;
                                                kotlin.jvm.internal.i.d(str18);
                                                hashMap32.put("s147b_user_data", str18);
                                                templateActivity.t0();
                                                return;
                                            }
                                            hashMap32.put("userAdded", new ArrayList(hashSet2));
                                            hashMap32.put("list", ca.a.k(this$0.f18391v));
                                            String str122222222222222222222222 = this$0.f18391v;
                                            kotlin.jvm.internal.i.d(str122222222222222222222222);
                                            hashMap32.put("s5_user_data", str122222222222222222222222);
                                            templateActivity.t0();
                                            return;
                                        case 3474656:
                                            if (!B0.equals("s124")) {
                                                hashMap32.put("userAdded", new ArrayList(hashSet2));
                                                hashMap32.put("list", ca.a.k(this$0.f18391v));
                                                String str1222222222222222222222222 = this$0.f18391v;
                                                kotlin.jvm.internal.i.d(str1222222222222222222222222);
                                                hashMap32.put("s5_user_data", str1222222222222222222222222);
                                                templateActivity.t0();
                                                return;
                                            }
                                            hashMap32.put("list", ca.a.k(this$0.f18391v));
                                            hashMap32.put("userAdded", new ArrayList(hashSet2));
                                            String str1322222 = this$0.f18391v;
                                            kotlin.jvm.internal.i.d(str1322222);
                                            hashMap32.put("s5_user_data", str1322222);
                                            return;
                                        case 3478391:
                                            if (B0.equals("s5-b")) {
                                                if (hashMap32.containsKey(Constants.DAYMODEL_POSITION)) {
                                                    Object obj14 = hashMap32.get(Constants.DAYMODEL_POSITION);
                                                    kotlin.jvm.internal.i.e(obj14, "null cannot be cast to non-null type kotlin.Int");
                                                    i10 = ((Integer) obj14).intValue();
                                                } else {
                                                    i10 = 0;
                                                }
                                                Object obj15 = hashMap32.get("list");
                                                kotlin.jvm.internal.i.e(obj15, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                                                ArrayList arrayList4 = (ArrayList) obj15;
                                                int i14 = i10 + 1;
                                                if (arrayList4.size() >= i14) {
                                                    String str19 = this$0.f18391v;
                                                    kotlin.jvm.internal.i.d(str19);
                                                    arrayList4.set(i10, str19);
                                                } else {
                                                    String str20 = this$0.f18391v;
                                                    kotlin.jvm.internal.i.d(str20);
                                                    arrayList4.add(i10, str20);
                                                }
                                                hashMap32.put("userAdded" + i10, new ArrayList(hashSet2));
                                                String str21 = "s5_user_data" + i10;
                                                String str22 = this$0.f18391v;
                                                kotlin.jvm.internal.i.d(str22);
                                                hashMap32.put(str21, str22);
                                                hashMap32.put("list", arrayList4);
                                                hashMap32.put(Constants.DAYMODEL_POSITION, Integer.valueOf(i14));
                                                templateActivity.t0();
                                                return;
                                            }
                                            hashMap32.put("userAdded", new ArrayList(hashSet2));
                                            hashMap32.put("list", ca.a.k(this$0.f18391v));
                                            String str12222222222222222222222222 = this$0.f18391v;
                                            kotlin.jvm.internal.i.d(str12222222222222222222222222);
                                            hashMap32.put("s5_user_data", str12222222222222222222222222);
                                            templateActivity.t0();
                                            return;
                                        default:
                                            hashMap32.put("userAdded", new ArrayList(hashSet2));
                                            hashMap32.put("list", ca.a.k(this$0.f18391v));
                                            String str122222222222222222222222222 = this$0.f18391v;
                                            kotlin.jvm.internal.i.d(str122222222222222222222222222);
                                            hashMap32.put("s5_user_data", str122222222222222222222222222);
                                            templateActivity.t0();
                                            return;
                                    }
                                } catch (Exception e122) {
                                    LogHelper.INSTANCE.e(this$0.f18390u, "Exception", e122);
                                    return;
                                }
                            default:
                                int i15 = f8.C;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                if (kotlin.jvm.internal.i.b(this$0.A, "s147-b")) {
                                    this$0.M().onBackPressed();
                                    return;
                                }
                                androidx.fragment.app.p activity5 = this$0.getActivity();
                                kotlin.jvm.internal.i.e(activity5, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                if (((TemplateActivity) activity5).getIntent().hasExtra("source") && kotlin.jvm.internal.i.b(this$0.M().getIntent().getStringExtra("source"), "goals")) {
                                    androidx.fragment.app.p activity6 = this$0.getActivity();
                                    kotlin.jvm.internal.i.e(activity6, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                    ((TemplateActivity) activity6).Q = true;
                                    androidx.fragment.app.p activity7 = this$0.getActivity();
                                    kotlin.jvm.internal.i.e(activity7, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                    ((TemplateActivity) activity7).J0();
                                    return;
                                }
                                this$0.M().onBackPressed();
                                return;
                        }
                    }
                });
                ((RobertoEditText) _$_findCachedViewById(R.id.etAddNew)).setOnFocusChangeListener(new dc.b(12, this));
                ((ImageView) _$_findCachedViewById(R.id.ivHelp)).setVisibility(8);
                ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setVisibility(8);
                ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new View.OnClickListener(this) { // from class: hr.d8

                    /* renamed from: v  reason: collision with root package name */
                    public final /* synthetic */ f8 f18317v;

                    {
                        this.f18317v = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        Object obj102;
                        int i10;
                        String str10;
                        int i11 = r2;
                        String str11 = "";
                        f8 this$0 = this.f18317v;
                        switch (i11) {
                            case 0:
                                boolean z10 = false;
                                int i12 = f8.C;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                String valueOf = String.valueOf(((RobertoEditText) this$0._$_findCachedViewById(R.id.etAddNew)).getText());
                                if (valueOf.length() == 0) {
                                    z10 = true;
                                }
                                if (z10) {
                                    Utils.INSTANCE.showCustomToast(this$0.getActivity(), "Enter Text");
                                    return;
                                }
                                ((RobertoEditText) this$0._$_findCachedViewById(R.id.etAddNew)).setText("");
                                this$0.J(valueOf);
                                return;
                            case 1:
                                int i13 = f8.C;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                try {
                                    if (this$0.f18391v == null) {
                                        Utils utils = Utils.INSTANCE;
                                        androidx.fragment.app.p activity3 = this$0.getActivity();
                                        if (kotlin.jvm.internal.i.b(this$0.f18394y, "")) {
                                            str10 = this$0.getString(R.string.select_1_option);
                                        } else {
                                            str10 = this$0.f18394y;
                                        }
                                        kotlin.jvm.internal.i.f(str10, "if (errorMsg == \"\") getS…t_1_option) else errorMsg");
                                        utils.showCustomToast(activity3, str10);
                                        return;
                                    }
                                    androidx.fragment.app.p activity4 = this$0.getActivity();
                                    kotlin.jvm.internal.i.e(activity4, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                    TemplateActivity templateActivity = (TemplateActivity) activity4;
                                    String B0 = templateActivity.B0();
                                    int hashCode = B0.hashCode();
                                    HashSet<String> hashSet2 = this$0.f18392w;
                                    HashMap<String, Object> hashMap32 = templateActivity.F;
                                    switch (hashCode) {
                                        case -955847334:
                                            if (!B0.equals("s118-b")) {
                                                hashMap32.put("userAdded", new ArrayList(hashSet2));
                                                hashMap32.put("list", ca.a.k(this$0.f18391v));
                                                String str122222222222222222222222222 = this$0.f18391v;
                                                kotlin.jvm.internal.i.d(str122222222222222222222222222);
                                                hashMap32.put("s5_user_data", str122222222222222222222222222);
                                                templateActivity.t0();
                                                return;
                                            }
                                            hashMap32.put("list", ca.a.k(this$0.f18391v));
                                            hashMap32.put("userAdded", new ArrayList(hashSet2));
                                            String str1322222 = this$0.f18391v;
                                            kotlin.jvm.internal.i.d(str1322222);
                                            hashMap32.put("s5_user_data", str1322222);
                                            return;
                                        case -955758923:
                                            if (B0.equals("s147-a")) {
                                                hashMap32.put("s147a_userAdded", new ArrayList(hashSet2));
                                                if (hashMap32.containsKey("list") && (hashMap32.get("list") instanceof ArrayList)) {
                                                    kotlin.jvm.internal.i.e(hashMap32.get("list"), "null cannot be cast to non-null type java.util.ArrayList<*>{ kotlin.collections.TypeAliasesKt.ArrayList<*> }");
                                                    if (!((ArrayList) obj102).isEmpty()) {
                                                        Object obj112 = hashMap32.get("list");
                                                        kotlin.jvm.internal.i.e(obj112, "null cannot be cast to non-null type java.util.ArrayList<*>{ kotlin.collections.TypeAliasesKt.ArrayList<*> }");
                                                        if (is.u.j2(0, (ArrayList) obj112) instanceof String) {
                                                            Object obj122 = hashMap32.get("list");
                                                            kotlin.jvm.internal.i.e(obj122, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                                                            ArrayList arrayList2 = (ArrayList) obj122;
                                                            String str14 = this$0.f18391v;
                                                            if (str14 != null) {
                                                                str11 = str14;
                                                            }
                                                            arrayList2.set(0, str11);
                                                            String str1522222 = this$0.f18391v;
                                                            kotlin.jvm.internal.i.d(str1522222);
                                                            hashMap32.put("s147a_user_data", str1522222);
                                                            templateActivity.t0();
                                                            return;
                                                        }
                                                    }
                                                }
                                                hashMap32.put("list", ca.a.k(this$0.f18391v));
                                                String str15222222 = this$0.f18391v;
                                                kotlin.jvm.internal.i.d(str15222222);
                                                hashMap32.put("s147a_user_data", str15222222);
                                                templateActivity.t0();
                                                return;
                                            }
                                            hashMap32.put("userAdded", new ArrayList(hashSet2));
                                            hashMap32.put("list", ca.a.k(this$0.f18391v));
                                            String str1222222222222222222222222222 = this$0.f18391v;
                                            kotlin.jvm.internal.i.d(str1222222222222222222222222222);
                                            hashMap32.put("s5_user_data", str1222222222222222222222222222);
                                            templateActivity.t0();
                                            return;
                                        case -955758922:
                                            if (B0.equals("s147-b")) {
                                                hashMap32.put("s147b_userAdded", new ArrayList(hashSet2));
                                                Object obj13 = hashMap32.get("list");
                                                kotlin.jvm.internal.i.e(obj13, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                                                ArrayList arrayList3 = (ArrayList) obj13;
                                                if (arrayList3.size() >= 2) {
                                                    String str16 = this$0.f18391v;
                                                    kotlin.jvm.internal.i.d(str16);
                                                    arrayList3.set(1, str16);
                                                } else {
                                                    String str17 = this$0.f18391v;
                                                    kotlin.jvm.internal.i.d(str17);
                                                    arrayList3.add(str17);
                                                }
                                                hashMap32.put("list", arrayList3);
                                                String str18 = this$0.f18391v;
                                                kotlin.jvm.internal.i.d(str18);
                                                hashMap32.put("s147b_user_data", str18);
                                                templateActivity.t0();
                                                return;
                                            }
                                            hashMap32.put("userAdded", new ArrayList(hashSet2));
                                            hashMap32.put("list", ca.a.k(this$0.f18391v));
                                            String str12222222222222222222222222222 = this$0.f18391v;
                                            kotlin.jvm.internal.i.d(str12222222222222222222222222222);
                                            hashMap32.put("s5_user_data", str12222222222222222222222222222);
                                            templateActivity.t0();
                                            return;
                                        case 3474656:
                                            if (!B0.equals("s124")) {
                                                hashMap32.put("userAdded", new ArrayList(hashSet2));
                                                hashMap32.put("list", ca.a.k(this$0.f18391v));
                                                String str122222222222222222222222222222 = this$0.f18391v;
                                                kotlin.jvm.internal.i.d(str122222222222222222222222222222);
                                                hashMap32.put("s5_user_data", str122222222222222222222222222222);
                                                templateActivity.t0();
                                                return;
                                            }
                                            hashMap32.put("list", ca.a.k(this$0.f18391v));
                                            hashMap32.put("userAdded", new ArrayList(hashSet2));
                                            String str13222222 = this$0.f18391v;
                                            kotlin.jvm.internal.i.d(str13222222);
                                            hashMap32.put("s5_user_data", str13222222);
                                            return;
                                        case 3478391:
                                            if (B0.equals("s5-b")) {
                                                if (hashMap32.containsKey(Constants.DAYMODEL_POSITION)) {
                                                    Object obj14 = hashMap32.get(Constants.DAYMODEL_POSITION);
                                                    kotlin.jvm.internal.i.e(obj14, "null cannot be cast to non-null type kotlin.Int");
                                                    i10 = ((Integer) obj14).intValue();
                                                } else {
                                                    i10 = 0;
                                                }
                                                Object obj15 = hashMap32.get("list");
                                                kotlin.jvm.internal.i.e(obj15, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                                                ArrayList arrayList4 = (ArrayList) obj15;
                                                int i14 = i10 + 1;
                                                if (arrayList4.size() >= i14) {
                                                    String str19 = this$0.f18391v;
                                                    kotlin.jvm.internal.i.d(str19);
                                                    arrayList4.set(i10, str19);
                                                } else {
                                                    String str20 = this$0.f18391v;
                                                    kotlin.jvm.internal.i.d(str20);
                                                    arrayList4.add(i10, str20);
                                                }
                                                hashMap32.put("userAdded" + i10, new ArrayList(hashSet2));
                                                String str21 = "s5_user_data" + i10;
                                                String str22 = this$0.f18391v;
                                                kotlin.jvm.internal.i.d(str22);
                                                hashMap32.put(str21, str22);
                                                hashMap32.put("list", arrayList4);
                                                hashMap32.put(Constants.DAYMODEL_POSITION, Integer.valueOf(i14));
                                                templateActivity.t0();
                                                return;
                                            }
                                            hashMap32.put("userAdded", new ArrayList(hashSet2));
                                            hashMap32.put("list", ca.a.k(this$0.f18391v));
                                            String str1222222222222222222222222222222 = this$0.f18391v;
                                            kotlin.jvm.internal.i.d(str1222222222222222222222222222222);
                                            hashMap32.put("s5_user_data", str1222222222222222222222222222222);
                                            templateActivity.t0();
                                            return;
                                        default:
                                            hashMap32.put("userAdded", new ArrayList(hashSet2));
                                            hashMap32.put("list", ca.a.k(this$0.f18391v));
                                            String str12222222222222222222222222222222 = this$0.f18391v;
                                            kotlin.jvm.internal.i.d(str12222222222222222222222222222222);
                                            hashMap32.put("s5_user_data", str12222222222222222222222222222222);
                                            templateActivity.t0();
                                            return;
                                    }
                                } catch (Exception e122) {
                                    LogHelper.INSTANCE.e(this$0.f18390u, "Exception", e122);
                                    return;
                                }
                            default:
                                int i15 = f8.C;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                if (kotlin.jvm.internal.i.b(this$0.A, "s147-b")) {
                                    this$0.M().onBackPressed();
                                    return;
                                }
                                androidx.fragment.app.p activity5 = this$0.getActivity();
                                kotlin.jvm.internal.i.e(activity5, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                if (((TemplateActivity) activity5).getIntent().hasExtra("source") && kotlin.jvm.internal.i.b(this$0.M().getIntent().getStringExtra("source"), "goals")) {
                                    androidx.fragment.app.p activity6 = this$0.getActivity();
                                    kotlin.jvm.internal.i.e(activity6, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                    ((TemplateActivity) activity6).Q = true;
                                    androidx.fragment.app.p activity7 = this$0.getActivity();
                                    kotlin.jvm.internal.i.e(activity7, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                    ((TemplateActivity) activity7).J0();
                                    return;
                                }
                                this$0.M().onBackPressed();
                                return;
                        }
                    }
                });
            }
            str = this.A;
            switch (str.hashCode()) {
                case -955847334:
                    hashMap2 = hashMap;
                    if (str.equals(obj)) {
                        Q(UtilFunKt.paramsMapToList(hashMap2.get("s5_search_list")));
                        break;
                    } else {
                        Q(UtilFunKt.paramsMapToList(hashMap2.get(this.A + "_search_list")));
                        break;
                    }
                case -955758923:
                    hashMap2 = hashMap;
                    if (str.equals("s147-a")) {
                        Q(UtilFunKt.paramsMapToList(hashMap2.get("s147a_search_list")));
                        break;
                    } else {
                        Q(UtilFunKt.paramsMapToList(hashMap2.get(this.A + "_search_list")));
                        break;
                    }
                case -955758922:
                    hashMap2 = hashMap;
                    if (str.equals(obj3)) {
                        Q(UtilFunKt.paramsMapToList(hashMap2.get("s147b_search_list")));
                        break;
                    } else {
                        Q(UtilFunKt.paramsMapToList(hashMap2.get(this.A + "_search_list")));
                        break;
                    }
                case 3478391:
                    if (str.equals(obj2)) {
                        Q(UtilFunKt.paramsMapToList(hashMap.get("s5b_search_list")));
                        break;
                    }
                default:
                    hashMap2 = hashMap;
                    Q(UtilFunKt.paramsMapToList(hashMap2.get(this.A + "_search_list")));
                    break;
            }
            P(arrayList);
            ((ImageButton) _$_findCachedViewById(R.id.imgTextAdd)).setOnClickListener(new View.OnClickListener(this) { // from class: hr.d8

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ f8 f18317v;

                {
                    this.f18317v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    Object obj102;
                    int i10;
                    String str10;
                    int i11 = r2;
                    String str11 = "";
                    f8 this$0 = this.f18317v;
                    switch (i11) {
                        case 0:
                            boolean z10 = false;
                            int i12 = f8.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            String valueOf = String.valueOf(((RobertoEditText) this$0._$_findCachedViewById(R.id.etAddNew)).getText());
                            if (valueOf.length() == 0) {
                                z10 = true;
                            }
                            if (z10) {
                                Utils.INSTANCE.showCustomToast(this$0.getActivity(), "Enter Text");
                                return;
                            }
                            ((RobertoEditText) this$0._$_findCachedViewById(R.id.etAddNew)).setText("");
                            this$0.J(valueOf);
                            return;
                        case 1:
                            int i13 = f8.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            try {
                                if (this$0.f18391v == null) {
                                    Utils utils = Utils.INSTANCE;
                                    androidx.fragment.app.p activity3 = this$0.getActivity();
                                    if (kotlin.jvm.internal.i.b(this$0.f18394y, "")) {
                                        str10 = this$0.getString(R.string.select_1_option);
                                    } else {
                                        str10 = this$0.f18394y;
                                    }
                                    kotlin.jvm.internal.i.f(str10, "if (errorMsg == \"\") getS…t_1_option) else errorMsg");
                                    utils.showCustomToast(activity3, str10);
                                    return;
                                }
                                androidx.fragment.app.p activity4 = this$0.getActivity();
                                kotlin.jvm.internal.i.e(activity4, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                TemplateActivity templateActivity = (TemplateActivity) activity4;
                                String B0 = templateActivity.B0();
                                int hashCode = B0.hashCode();
                                HashSet<String> hashSet2 = this$0.f18392w;
                                HashMap<String, Object> hashMap32 = templateActivity.F;
                                switch (hashCode) {
                                    case -955847334:
                                        if (!B0.equals("s118-b")) {
                                            hashMap32.put("userAdded", new ArrayList(hashSet2));
                                            hashMap32.put("list", ca.a.k(this$0.f18391v));
                                            String str12222222222222222222222222222222 = this$0.f18391v;
                                            kotlin.jvm.internal.i.d(str12222222222222222222222222222222);
                                            hashMap32.put("s5_user_data", str12222222222222222222222222222222);
                                            templateActivity.t0();
                                            return;
                                        }
                                        hashMap32.put("list", ca.a.k(this$0.f18391v));
                                        hashMap32.put("userAdded", new ArrayList(hashSet2));
                                        String str13222222 = this$0.f18391v;
                                        kotlin.jvm.internal.i.d(str13222222);
                                        hashMap32.put("s5_user_data", str13222222);
                                        return;
                                    case -955758923:
                                        if (B0.equals("s147-a")) {
                                            hashMap32.put("s147a_userAdded", new ArrayList(hashSet2));
                                            if (hashMap32.containsKey("list") && (hashMap32.get("list") instanceof ArrayList)) {
                                                kotlin.jvm.internal.i.e(hashMap32.get("list"), "null cannot be cast to non-null type java.util.ArrayList<*>{ kotlin.collections.TypeAliasesKt.ArrayList<*> }");
                                                if (!((ArrayList) obj102).isEmpty()) {
                                                    Object obj112 = hashMap32.get("list");
                                                    kotlin.jvm.internal.i.e(obj112, "null cannot be cast to non-null type java.util.ArrayList<*>{ kotlin.collections.TypeAliasesKt.ArrayList<*> }");
                                                    if (is.u.j2(0, (ArrayList) obj112) instanceof String) {
                                                        Object obj122 = hashMap32.get("list");
                                                        kotlin.jvm.internal.i.e(obj122, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                                                        ArrayList arrayList2 = (ArrayList) obj122;
                                                        String str14 = this$0.f18391v;
                                                        if (str14 != null) {
                                                            str11 = str14;
                                                        }
                                                        arrayList2.set(0, str11);
                                                        String str15222222 = this$0.f18391v;
                                                        kotlin.jvm.internal.i.d(str15222222);
                                                        hashMap32.put("s147a_user_data", str15222222);
                                                        templateActivity.t0();
                                                        return;
                                                    }
                                                }
                                            }
                                            hashMap32.put("list", ca.a.k(this$0.f18391v));
                                            String str152222222 = this$0.f18391v;
                                            kotlin.jvm.internal.i.d(str152222222);
                                            hashMap32.put("s147a_user_data", str152222222);
                                            templateActivity.t0();
                                            return;
                                        }
                                        hashMap32.put("userAdded", new ArrayList(hashSet2));
                                        hashMap32.put("list", ca.a.k(this$0.f18391v));
                                        String str122222222222222222222222222222222 = this$0.f18391v;
                                        kotlin.jvm.internal.i.d(str122222222222222222222222222222222);
                                        hashMap32.put("s5_user_data", str122222222222222222222222222222222);
                                        templateActivity.t0();
                                        return;
                                    case -955758922:
                                        if (B0.equals("s147-b")) {
                                            hashMap32.put("s147b_userAdded", new ArrayList(hashSet2));
                                            Object obj13 = hashMap32.get("list");
                                            kotlin.jvm.internal.i.e(obj13, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                                            ArrayList arrayList3 = (ArrayList) obj13;
                                            if (arrayList3.size() >= 2) {
                                                String str16 = this$0.f18391v;
                                                kotlin.jvm.internal.i.d(str16);
                                                arrayList3.set(1, str16);
                                            } else {
                                                String str17 = this$0.f18391v;
                                                kotlin.jvm.internal.i.d(str17);
                                                arrayList3.add(str17);
                                            }
                                            hashMap32.put("list", arrayList3);
                                            String str18 = this$0.f18391v;
                                            kotlin.jvm.internal.i.d(str18);
                                            hashMap32.put("s147b_user_data", str18);
                                            templateActivity.t0();
                                            return;
                                        }
                                        hashMap32.put("userAdded", new ArrayList(hashSet2));
                                        hashMap32.put("list", ca.a.k(this$0.f18391v));
                                        String str1222222222222222222222222222222222 = this$0.f18391v;
                                        kotlin.jvm.internal.i.d(str1222222222222222222222222222222222);
                                        hashMap32.put("s5_user_data", str1222222222222222222222222222222222);
                                        templateActivity.t0();
                                        return;
                                    case 3474656:
                                        if (!B0.equals("s124")) {
                                            hashMap32.put("userAdded", new ArrayList(hashSet2));
                                            hashMap32.put("list", ca.a.k(this$0.f18391v));
                                            String str12222222222222222222222222222222222 = this$0.f18391v;
                                            kotlin.jvm.internal.i.d(str12222222222222222222222222222222222);
                                            hashMap32.put("s5_user_data", str12222222222222222222222222222222222);
                                            templateActivity.t0();
                                            return;
                                        }
                                        hashMap32.put("list", ca.a.k(this$0.f18391v));
                                        hashMap32.put("userAdded", new ArrayList(hashSet2));
                                        String str132222222 = this$0.f18391v;
                                        kotlin.jvm.internal.i.d(str132222222);
                                        hashMap32.put("s5_user_data", str132222222);
                                        return;
                                    case 3478391:
                                        if (B0.equals("s5-b")) {
                                            if (hashMap32.containsKey(Constants.DAYMODEL_POSITION)) {
                                                Object obj14 = hashMap32.get(Constants.DAYMODEL_POSITION);
                                                kotlin.jvm.internal.i.e(obj14, "null cannot be cast to non-null type kotlin.Int");
                                                i10 = ((Integer) obj14).intValue();
                                            } else {
                                                i10 = 0;
                                            }
                                            Object obj15 = hashMap32.get("list");
                                            kotlin.jvm.internal.i.e(obj15, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                                            ArrayList arrayList4 = (ArrayList) obj15;
                                            int i14 = i10 + 1;
                                            if (arrayList4.size() >= i14) {
                                                String str19 = this$0.f18391v;
                                                kotlin.jvm.internal.i.d(str19);
                                                arrayList4.set(i10, str19);
                                            } else {
                                                String str20 = this$0.f18391v;
                                                kotlin.jvm.internal.i.d(str20);
                                                arrayList4.add(i10, str20);
                                            }
                                            hashMap32.put("userAdded" + i10, new ArrayList(hashSet2));
                                            String str21 = "s5_user_data" + i10;
                                            String str22 = this$0.f18391v;
                                            kotlin.jvm.internal.i.d(str22);
                                            hashMap32.put(str21, str22);
                                            hashMap32.put("list", arrayList4);
                                            hashMap32.put(Constants.DAYMODEL_POSITION, Integer.valueOf(i14));
                                            templateActivity.t0();
                                            return;
                                        }
                                        hashMap32.put("userAdded", new ArrayList(hashSet2));
                                        hashMap32.put("list", ca.a.k(this$0.f18391v));
                                        String str122222222222222222222222222222222222 = this$0.f18391v;
                                        kotlin.jvm.internal.i.d(str122222222222222222222222222222222222);
                                        hashMap32.put("s5_user_data", str122222222222222222222222222222222222);
                                        templateActivity.t0();
                                        return;
                                    default:
                                        hashMap32.put("userAdded", new ArrayList(hashSet2));
                                        hashMap32.put("list", ca.a.k(this$0.f18391v));
                                        String str1222222222222222222222222222222222222 = this$0.f18391v;
                                        kotlin.jvm.internal.i.d(str1222222222222222222222222222222222222);
                                        hashMap32.put("s5_user_data", str1222222222222222222222222222222222222);
                                        templateActivity.t0();
                                        return;
                                }
                            } catch (Exception e122) {
                                LogHelper.INSTANCE.e(this$0.f18390u, "Exception", e122);
                                return;
                            }
                        default:
                            int i15 = f8.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            if (kotlin.jvm.internal.i.b(this$0.A, "s147-b")) {
                                this$0.M().onBackPressed();
                                return;
                            }
                            androidx.fragment.app.p activity5 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity5, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                            if (((TemplateActivity) activity5).getIntent().hasExtra("source") && kotlin.jvm.internal.i.b(this$0.M().getIntent().getStringExtra("source"), "goals")) {
                                androidx.fragment.app.p activity6 = this$0.getActivity();
                                kotlin.jvm.internal.i.e(activity6, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                ((TemplateActivity) activity6).Q = true;
                                androidx.fragment.app.p activity7 = this$0.getActivity();
                                kotlin.jvm.internal.i.e(activity7, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                ((TemplateActivity) activity7).J0();
                                return;
                            }
                            this$0.M().onBackPressed();
                            return;
                    }
                }
            });
            ((RobertoEditText) _$_findCachedViewById(R.id.etAddNew)).addTextChangedListener(new a());
            ((RobertoEditText) _$_findCachedViewById(R.id.etAddNew)).setOnEditorActionListener(new dl.w(13, this));
            ((RobertoButton) _$_findCachedViewById(R.id.btnS5Button)).setOnClickListener(new View.OnClickListener(this) { // from class: hr.d8

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ f8 f18317v;

                {
                    this.f18317v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    Object obj102;
                    int i10;
                    String str10;
                    int i11 = r2;
                    String str11 = "";
                    f8 this$0 = this.f18317v;
                    switch (i11) {
                        case 0:
                            boolean z10 = false;
                            int i12 = f8.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            String valueOf = String.valueOf(((RobertoEditText) this$0._$_findCachedViewById(R.id.etAddNew)).getText());
                            if (valueOf.length() == 0) {
                                z10 = true;
                            }
                            if (z10) {
                                Utils.INSTANCE.showCustomToast(this$0.getActivity(), "Enter Text");
                                return;
                            }
                            ((RobertoEditText) this$0._$_findCachedViewById(R.id.etAddNew)).setText("");
                            this$0.J(valueOf);
                            return;
                        case 1:
                            int i13 = f8.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            try {
                                if (this$0.f18391v == null) {
                                    Utils utils = Utils.INSTANCE;
                                    androidx.fragment.app.p activity3 = this$0.getActivity();
                                    if (kotlin.jvm.internal.i.b(this$0.f18394y, "")) {
                                        str10 = this$0.getString(R.string.select_1_option);
                                    } else {
                                        str10 = this$0.f18394y;
                                    }
                                    kotlin.jvm.internal.i.f(str10, "if (errorMsg == \"\") getS…t_1_option) else errorMsg");
                                    utils.showCustomToast(activity3, str10);
                                    return;
                                }
                                androidx.fragment.app.p activity4 = this$0.getActivity();
                                kotlin.jvm.internal.i.e(activity4, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                TemplateActivity templateActivity = (TemplateActivity) activity4;
                                String B0 = templateActivity.B0();
                                int hashCode = B0.hashCode();
                                HashSet<String> hashSet2 = this$0.f18392w;
                                HashMap<String, Object> hashMap32 = templateActivity.F;
                                switch (hashCode) {
                                    case -955847334:
                                        if (!B0.equals("s118-b")) {
                                            hashMap32.put("userAdded", new ArrayList(hashSet2));
                                            hashMap32.put("list", ca.a.k(this$0.f18391v));
                                            String str1222222222222222222222222222222222222 = this$0.f18391v;
                                            kotlin.jvm.internal.i.d(str1222222222222222222222222222222222222);
                                            hashMap32.put("s5_user_data", str1222222222222222222222222222222222222);
                                            templateActivity.t0();
                                            return;
                                        }
                                        hashMap32.put("list", ca.a.k(this$0.f18391v));
                                        hashMap32.put("userAdded", new ArrayList(hashSet2));
                                        String str132222222 = this$0.f18391v;
                                        kotlin.jvm.internal.i.d(str132222222);
                                        hashMap32.put("s5_user_data", str132222222);
                                        return;
                                    case -955758923:
                                        if (B0.equals("s147-a")) {
                                            hashMap32.put("s147a_userAdded", new ArrayList(hashSet2));
                                            if (hashMap32.containsKey("list") && (hashMap32.get("list") instanceof ArrayList)) {
                                                kotlin.jvm.internal.i.e(hashMap32.get("list"), "null cannot be cast to non-null type java.util.ArrayList<*>{ kotlin.collections.TypeAliasesKt.ArrayList<*> }");
                                                if (!((ArrayList) obj102).isEmpty()) {
                                                    Object obj112 = hashMap32.get("list");
                                                    kotlin.jvm.internal.i.e(obj112, "null cannot be cast to non-null type java.util.ArrayList<*>{ kotlin.collections.TypeAliasesKt.ArrayList<*> }");
                                                    if (is.u.j2(0, (ArrayList) obj112) instanceof String) {
                                                        Object obj122 = hashMap32.get("list");
                                                        kotlin.jvm.internal.i.e(obj122, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                                                        ArrayList arrayList2 = (ArrayList) obj122;
                                                        String str14 = this$0.f18391v;
                                                        if (str14 != null) {
                                                            str11 = str14;
                                                        }
                                                        arrayList2.set(0, str11);
                                                        String str152222222 = this$0.f18391v;
                                                        kotlin.jvm.internal.i.d(str152222222);
                                                        hashMap32.put("s147a_user_data", str152222222);
                                                        templateActivity.t0();
                                                        return;
                                                    }
                                                }
                                            }
                                            hashMap32.put("list", ca.a.k(this$0.f18391v));
                                            String str1522222222 = this$0.f18391v;
                                            kotlin.jvm.internal.i.d(str1522222222);
                                            hashMap32.put("s147a_user_data", str1522222222);
                                            templateActivity.t0();
                                            return;
                                        }
                                        hashMap32.put("userAdded", new ArrayList(hashSet2));
                                        hashMap32.put("list", ca.a.k(this$0.f18391v));
                                        String str12222222222222222222222222222222222222 = this$0.f18391v;
                                        kotlin.jvm.internal.i.d(str12222222222222222222222222222222222222);
                                        hashMap32.put("s5_user_data", str12222222222222222222222222222222222222);
                                        templateActivity.t0();
                                        return;
                                    case -955758922:
                                        if (B0.equals("s147-b")) {
                                            hashMap32.put("s147b_userAdded", new ArrayList(hashSet2));
                                            Object obj13 = hashMap32.get("list");
                                            kotlin.jvm.internal.i.e(obj13, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                                            ArrayList arrayList3 = (ArrayList) obj13;
                                            if (arrayList3.size() >= 2) {
                                                String str16 = this$0.f18391v;
                                                kotlin.jvm.internal.i.d(str16);
                                                arrayList3.set(1, str16);
                                            } else {
                                                String str17 = this$0.f18391v;
                                                kotlin.jvm.internal.i.d(str17);
                                                arrayList3.add(str17);
                                            }
                                            hashMap32.put("list", arrayList3);
                                            String str18 = this$0.f18391v;
                                            kotlin.jvm.internal.i.d(str18);
                                            hashMap32.put("s147b_user_data", str18);
                                            templateActivity.t0();
                                            return;
                                        }
                                        hashMap32.put("userAdded", new ArrayList(hashSet2));
                                        hashMap32.put("list", ca.a.k(this$0.f18391v));
                                        String str122222222222222222222222222222222222222 = this$0.f18391v;
                                        kotlin.jvm.internal.i.d(str122222222222222222222222222222222222222);
                                        hashMap32.put("s5_user_data", str122222222222222222222222222222222222222);
                                        templateActivity.t0();
                                        return;
                                    case 3474656:
                                        if (!B0.equals("s124")) {
                                            hashMap32.put("userAdded", new ArrayList(hashSet2));
                                            hashMap32.put("list", ca.a.k(this$0.f18391v));
                                            String str1222222222222222222222222222222222222222 = this$0.f18391v;
                                            kotlin.jvm.internal.i.d(str1222222222222222222222222222222222222222);
                                            hashMap32.put("s5_user_data", str1222222222222222222222222222222222222222);
                                            templateActivity.t0();
                                            return;
                                        }
                                        hashMap32.put("list", ca.a.k(this$0.f18391v));
                                        hashMap32.put("userAdded", new ArrayList(hashSet2));
                                        String str1322222222 = this$0.f18391v;
                                        kotlin.jvm.internal.i.d(str1322222222);
                                        hashMap32.put("s5_user_data", str1322222222);
                                        return;
                                    case 3478391:
                                        if (B0.equals("s5-b")) {
                                            if (hashMap32.containsKey(Constants.DAYMODEL_POSITION)) {
                                                Object obj14 = hashMap32.get(Constants.DAYMODEL_POSITION);
                                                kotlin.jvm.internal.i.e(obj14, "null cannot be cast to non-null type kotlin.Int");
                                                i10 = ((Integer) obj14).intValue();
                                            } else {
                                                i10 = 0;
                                            }
                                            Object obj15 = hashMap32.get("list");
                                            kotlin.jvm.internal.i.e(obj15, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                                            ArrayList arrayList4 = (ArrayList) obj15;
                                            int i14 = i10 + 1;
                                            if (arrayList4.size() >= i14) {
                                                String str19 = this$0.f18391v;
                                                kotlin.jvm.internal.i.d(str19);
                                                arrayList4.set(i10, str19);
                                            } else {
                                                String str20 = this$0.f18391v;
                                                kotlin.jvm.internal.i.d(str20);
                                                arrayList4.add(i10, str20);
                                            }
                                            hashMap32.put("userAdded" + i10, new ArrayList(hashSet2));
                                            String str21 = "s5_user_data" + i10;
                                            String str22 = this$0.f18391v;
                                            kotlin.jvm.internal.i.d(str22);
                                            hashMap32.put(str21, str22);
                                            hashMap32.put("list", arrayList4);
                                            hashMap32.put(Constants.DAYMODEL_POSITION, Integer.valueOf(i14));
                                            templateActivity.t0();
                                            return;
                                        }
                                        hashMap32.put("userAdded", new ArrayList(hashSet2));
                                        hashMap32.put("list", ca.a.k(this$0.f18391v));
                                        String str12222222222222222222222222222222222222222 = this$0.f18391v;
                                        kotlin.jvm.internal.i.d(str12222222222222222222222222222222222222222);
                                        hashMap32.put("s5_user_data", str12222222222222222222222222222222222222222);
                                        templateActivity.t0();
                                        return;
                                    default:
                                        hashMap32.put("userAdded", new ArrayList(hashSet2));
                                        hashMap32.put("list", ca.a.k(this$0.f18391v));
                                        String str122222222222222222222222222222222222222222 = this$0.f18391v;
                                        kotlin.jvm.internal.i.d(str122222222222222222222222222222222222222222);
                                        hashMap32.put("s5_user_data", str122222222222222222222222222222222222222222);
                                        templateActivity.t0();
                                        return;
                                }
                            } catch (Exception e122) {
                                LogHelper.INSTANCE.e(this$0.f18390u, "Exception", e122);
                                return;
                            }
                        default:
                            int i15 = f8.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            if (kotlin.jvm.internal.i.b(this$0.A, "s147-b")) {
                                this$0.M().onBackPressed();
                                return;
                            }
                            androidx.fragment.app.p activity5 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity5, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                            if (((TemplateActivity) activity5).getIntent().hasExtra("source") && kotlin.jvm.internal.i.b(this$0.M().getIntent().getStringExtra("source"), "goals")) {
                                androidx.fragment.app.p activity6 = this$0.getActivity();
                                kotlin.jvm.internal.i.e(activity6, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                ((TemplateActivity) activity6).Q = true;
                                androidx.fragment.app.p activity7 = this$0.getActivity();
                                kotlin.jvm.internal.i.e(activity7, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                ((TemplateActivity) activity7).J0();
                                return;
                            }
                            this$0.M().onBackPressed();
                            return;
                    }
                }
            });
            ((RobertoEditText) _$_findCachedViewById(R.id.etAddNew)).setOnFocusChangeListener(new dc.b(12, this));
            ((ImageView) _$_findCachedViewById(R.id.ivHelp)).setVisibility(8);
            ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setVisibility(8);
            ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new View.OnClickListener(this) { // from class: hr.d8

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ f8 f18317v;

                {
                    this.f18317v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    Object obj102;
                    int i10;
                    String str10;
                    int i11 = r2;
                    String str11 = "";
                    f8 this$0 = this.f18317v;
                    switch (i11) {
                        case 0:
                            boolean z10 = false;
                            int i12 = f8.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            String valueOf = String.valueOf(((RobertoEditText) this$0._$_findCachedViewById(R.id.etAddNew)).getText());
                            if (valueOf.length() == 0) {
                                z10 = true;
                            }
                            if (z10) {
                                Utils.INSTANCE.showCustomToast(this$0.getActivity(), "Enter Text");
                                return;
                            }
                            ((RobertoEditText) this$0._$_findCachedViewById(R.id.etAddNew)).setText("");
                            this$0.J(valueOf);
                            return;
                        case 1:
                            int i13 = f8.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            try {
                                if (this$0.f18391v == null) {
                                    Utils utils = Utils.INSTANCE;
                                    androidx.fragment.app.p activity3 = this$0.getActivity();
                                    if (kotlin.jvm.internal.i.b(this$0.f18394y, "")) {
                                        str10 = this$0.getString(R.string.select_1_option);
                                    } else {
                                        str10 = this$0.f18394y;
                                    }
                                    kotlin.jvm.internal.i.f(str10, "if (errorMsg == \"\") getS…t_1_option) else errorMsg");
                                    utils.showCustomToast(activity3, str10);
                                    return;
                                }
                                androidx.fragment.app.p activity4 = this$0.getActivity();
                                kotlin.jvm.internal.i.e(activity4, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                TemplateActivity templateActivity = (TemplateActivity) activity4;
                                String B0 = templateActivity.B0();
                                int hashCode = B0.hashCode();
                                HashSet<String> hashSet2 = this$0.f18392w;
                                HashMap<String, Object> hashMap32 = templateActivity.F;
                                switch (hashCode) {
                                    case -955847334:
                                        if (!B0.equals("s118-b")) {
                                            hashMap32.put("userAdded", new ArrayList(hashSet2));
                                            hashMap32.put("list", ca.a.k(this$0.f18391v));
                                            String str122222222222222222222222222222222222222222 = this$0.f18391v;
                                            kotlin.jvm.internal.i.d(str122222222222222222222222222222222222222222);
                                            hashMap32.put("s5_user_data", str122222222222222222222222222222222222222222);
                                            templateActivity.t0();
                                            return;
                                        }
                                        hashMap32.put("list", ca.a.k(this$0.f18391v));
                                        hashMap32.put("userAdded", new ArrayList(hashSet2));
                                        String str1322222222 = this$0.f18391v;
                                        kotlin.jvm.internal.i.d(str1322222222);
                                        hashMap32.put("s5_user_data", str1322222222);
                                        return;
                                    case -955758923:
                                        if (B0.equals("s147-a")) {
                                            hashMap32.put("s147a_userAdded", new ArrayList(hashSet2));
                                            if (hashMap32.containsKey("list") && (hashMap32.get("list") instanceof ArrayList)) {
                                                kotlin.jvm.internal.i.e(hashMap32.get("list"), "null cannot be cast to non-null type java.util.ArrayList<*>{ kotlin.collections.TypeAliasesKt.ArrayList<*> }");
                                                if (!((ArrayList) obj102).isEmpty()) {
                                                    Object obj112 = hashMap32.get("list");
                                                    kotlin.jvm.internal.i.e(obj112, "null cannot be cast to non-null type java.util.ArrayList<*>{ kotlin.collections.TypeAliasesKt.ArrayList<*> }");
                                                    if (is.u.j2(0, (ArrayList) obj112) instanceof String) {
                                                        Object obj122 = hashMap32.get("list");
                                                        kotlin.jvm.internal.i.e(obj122, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                                                        ArrayList arrayList2 = (ArrayList) obj122;
                                                        String str14 = this$0.f18391v;
                                                        if (str14 != null) {
                                                            str11 = str14;
                                                        }
                                                        arrayList2.set(0, str11);
                                                        String str1522222222 = this$0.f18391v;
                                                        kotlin.jvm.internal.i.d(str1522222222);
                                                        hashMap32.put("s147a_user_data", str1522222222);
                                                        templateActivity.t0();
                                                        return;
                                                    }
                                                }
                                            }
                                            hashMap32.put("list", ca.a.k(this$0.f18391v));
                                            String str15222222222 = this$0.f18391v;
                                            kotlin.jvm.internal.i.d(str15222222222);
                                            hashMap32.put("s147a_user_data", str15222222222);
                                            templateActivity.t0();
                                            return;
                                        }
                                        hashMap32.put("userAdded", new ArrayList(hashSet2));
                                        hashMap32.put("list", ca.a.k(this$0.f18391v));
                                        String str1222222222222222222222222222222222222222222 = this$0.f18391v;
                                        kotlin.jvm.internal.i.d(str1222222222222222222222222222222222222222222);
                                        hashMap32.put("s5_user_data", str1222222222222222222222222222222222222222222);
                                        templateActivity.t0();
                                        return;
                                    case -955758922:
                                        if (B0.equals("s147-b")) {
                                            hashMap32.put("s147b_userAdded", new ArrayList(hashSet2));
                                            Object obj13 = hashMap32.get("list");
                                            kotlin.jvm.internal.i.e(obj13, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                                            ArrayList arrayList3 = (ArrayList) obj13;
                                            if (arrayList3.size() >= 2) {
                                                String str16 = this$0.f18391v;
                                                kotlin.jvm.internal.i.d(str16);
                                                arrayList3.set(1, str16);
                                            } else {
                                                String str17 = this$0.f18391v;
                                                kotlin.jvm.internal.i.d(str17);
                                                arrayList3.add(str17);
                                            }
                                            hashMap32.put("list", arrayList3);
                                            String str18 = this$0.f18391v;
                                            kotlin.jvm.internal.i.d(str18);
                                            hashMap32.put("s147b_user_data", str18);
                                            templateActivity.t0();
                                            return;
                                        }
                                        hashMap32.put("userAdded", new ArrayList(hashSet2));
                                        hashMap32.put("list", ca.a.k(this$0.f18391v));
                                        String str12222222222222222222222222222222222222222222 = this$0.f18391v;
                                        kotlin.jvm.internal.i.d(str12222222222222222222222222222222222222222222);
                                        hashMap32.put("s5_user_data", str12222222222222222222222222222222222222222222);
                                        templateActivity.t0();
                                        return;
                                    case 3474656:
                                        if (!B0.equals("s124")) {
                                            hashMap32.put("userAdded", new ArrayList(hashSet2));
                                            hashMap32.put("list", ca.a.k(this$0.f18391v));
                                            String str122222222222222222222222222222222222222222222 = this$0.f18391v;
                                            kotlin.jvm.internal.i.d(str122222222222222222222222222222222222222222222);
                                            hashMap32.put("s5_user_data", str122222222222222222222222222222222222222222222);
                                            templateActivity.t0();
                                            return;
                                        }
                                        hashMap32.put("list", ca.a.k(this$0.f18391v));
                                        hashMap32.put("userAdded", new ArrayList(hashSet2));
                                        String str13222222222 = this$0.f18391v;
                                        kotlin.jvm.internal.i.d(str13222222222);
                                        hashMap32.put("s5_user_data", str13222222222);
                                        return;
                                    case 3478391:
                                        if (B0.equals("s5-b")) {
                                            if (hashMap32.containsKey(Constants.DAYMODEL_POSITION)) {
                                                Object obj14 = hashMap32.get(Constants.DAYMODEL_POSITION);
                                                kotlin.jvm.internal.i.e(obj14, "null cannot be cast to non-null type kotlin.Int");
                                                i10 = ((Integer) obj14).intValue();
                                            } else {
                                                i10 = 0;
                                            }
                                            Object obj15 = hashMap32.get("list");
                                            kotlin.jvm.internal.i.e(obj15, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                                            ArrayList arrayList4 = (ArrayList) obj15;
                                            int i14 = i10 + 1;
                                            if (arrayList4.size() >= i14) {
                                                String str19 = this$0.f18391v;
                                                kotlin.jvm.internal.i.d(str19);
                                                arrayList4.set(i10, str19);
                                            } else {
                                                String str20 = this$0.f18391v;
                                                kotlin.jvm.internal.i.d(str20);
                                                arrayList4.add(i10, str20);
                                            }
                                            hashMap32.put("userAdded" + i10, new ArrayList(hashSet2));
                                            String str21 = "s5_user_data" + i10;
                                            String str22 = this$0.f18391v;
                                            kotlin.jvm.internal.i.d(str22);
                                            hashMap32.put(str21, str22);
                                            hashMap32.put("list", arrayList4);
                                            hashMap32.put(Constants.DAYMODEL_POSITION, Integer.valueOf(i14));
                                            templateActivity.t0();
                                            return;
                                        }
                                        hashMap32.put("userAdded", new ArrayList(hashSet2));
                                        hashMap32.put("list", ca.a.k(this$0.f18391v));
                                        String str1222222222222222222222222222222222222222222222 = this$0.f18391v;
                                        kotlin.jvm.internal.i.d(str1222222222222222222222222222222222222222222222);
                                        hashMap32.put("s5_user_data", str1222222222222222222222222222222222222222222222);
                                        templateActivity.t0();
                                        return;
                                    default:
                                        hashMap32.put("userAdded", new ArrayList(hashSet2));
                                        hashMap32.put("list", ca.a.k(this$0.f18391v));
                                        String str12222222222222222222222222222222222222222222222 = this$0.f18391v;
                                        kotlin.jvm.internal.i.d(str12222222222222222222222222222222222222222222222);
                                        hashMap32.put("s5_user_data", str12222222222222222222222222222222222222222222222);
                                        templateActivity.t0();
                                        return;
                                }
                            } catch (Exception e122) {
                                LogHelper.INSTANCE.e(this$0.f18390u, "Exception", e122);
                                return;
                            }
                        default:
                            int i15 = f8.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            if (kotlin.jvm.internal.i.b(this$0.A, "s147-b")) {
                                this$0.M().onBackPressed();
                                return;
                            }
                            androidx.fragment.app.p activity5 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity5, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                            if (((TemplateActivity) activity5).getIntent().hasExtra("source") && kotlin.jvm.internal.i.b(this$0.M().getIntent().getStringExtra("source"), "goals")) {
                                androidx.fragment.app.p activity6 = this$0.getActivity();
                                kotlin.jvm.internal.i.e(activity6, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                ((TemplateActivity) activity6).Q = true;
                                androidx.fragment.app.p activity7 = this$0.getActivity();
                                kotlin.jvm.internal.i.e(activity7, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                ((TemplateActivity) activity7).J0();
                                return;
                            }
                            this$0.M().onBackPressed();
                            return;
                    }
                }
            });
        } catch (Exception e13) {
            LogHelper.INSTANCE.e(str2, "exception in on view created", e13);
        }
    }

    /* compiled from: ScreenS5Fragment.kt */
    /* loaded from: classes2.dex */
    public static final class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i6, int i10, int i11) {
            boolean z10;
            f8 f8Var = f8.this;
            if (String.valueOf(((RobertoEditText) f8Var._$_findCachedViewById(R.id.etAddNew)).getText()).length() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                ((ImageButton) f8Var._$_findCachedViewById(R.id.imgTextAdd)).setVisibility(0);
            } else {
                ((ImageButton) f8Var._$_findCachedViewById(R.id.imgTextAdd)).setVisibility(8);
            }
            String lowerCase = String.valueOf(((RobertoEditText) f8Var._$_findCachedViewById(R.id.etAddNew)).getText()).toLowerCase();
            kotlin.jvm.internal.i.f(lowerCase, "this as java.lang.String).toLowerCase()");
            try {
                int childCount = ((LinearLayout) f8Var._$_findCachedViewById(R.id.llSearch)).getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = ((LinearLayout) f8Var._$_findCachedViewById(R.id.llSearch)).getChildAt(i12);
                    String lowerCase2 = ((RobertoTextView) childAt.findViewById(R.id.tvLabelSearch)).getText().toString().toLowerCase();
                    kotlin.jvm.internal.i.f(lowerCase2, "this as java.lang.String).toLowerCase()");
                    if (gv.r.J0(lowerCase2, lowerCase)) {
                        childAt.setVisibility(0);
                    } else {
                        childAt.setVisibility(8);
                    }
                }
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(f8Var.f18390u, "exception", e10);
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
