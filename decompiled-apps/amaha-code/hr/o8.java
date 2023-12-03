package hr;

import android.app.TimePickerDialog;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TimePicker;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager.widget.ViewPager;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.model.ScreenResult16Model;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.utils.UtilFunKt;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoEditText;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: ScreenS66Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhr/o8;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class o8 extends rr.b {
    public static final /* synthetic */ int H = 0;
    public boolean F;

    /* renamed from: x  reason: collision with root package name */
    public int f18925x;

    /* renamed from: y  reason: collision with root package name */
    public ek.i f18926y;

    /* renamed from: z  reason: collision with root package name */
    public ScreenResult16Model f18927z;
    public final LinkedHashMap G = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f18922u = LogHelper.INSTANCE.makeLogTag(o8.class);

    /* renamed from: v  reason: collision with root package name */
    public HashMap<String, Object> f18923v = new HashMap<>();

    /* renamed from: w  reason: collision with root package name */
    public ArrayList<String> f18924w = new ArrayList<>();
    public ArrayList<String> A = new ArrayList<>();
    public final SimpleDateFormat B = new SimpleDateFormat("hh:mm a");
    public final Calendar C = Calendar.getInstance();
    public final Calendar D = Calendar.getInstance();
    public final Calendar E = Calendar.getInstance();

    @Override // rr.b
    public final boolean I() {
        rr.b q0Var;
        if (((RobertoEditText) _$_findCachedViewById(R.id.etAddNew)).hasFocus()) {
            ((RobertoEditText) _$_findCachedViewById(R.id.etAddNew)).clearFocus();
            UiUtils.Companion.showSearch(R.layout.fragment_screen_s66_search_hidden, (ConstraintLayout) _$_findCachedViewById(R.id.constraintRoot), getActivity());
        } else {
            int i6 = this.f18925x;
            if (i6 > 0) {
                this.f18925x = i6 - 1;
                Q();
            } else {
                androidx.fragment.app.p activity = getActivity();
                kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                if (((TemplateActivity) activity).getIntent().hasExtra("source")) {
                    androidx.fragment.app.p activity2 = getActivity();
                    kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                    if (r1.b0.c((TemplateActivity) activity2, "source", "goals") && this.f18925x == 0) {
                        androidx.fragment.app.p activity3 = getActivity();
                        kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                        ((TemplateActivity) activity3).Q = true;
                        androidx.fragment.app.p activity4 = getActivity();
                        kotlin.jvm.internal.i.e(activity4, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                        TemplateActivity templateActivity = (TemplateActivity) activity4;
                        androidx.fragment.app.p activity5 = getActivity();
                        kotlin.jvm.internal.i.e(activity5, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                        if (((TemplateActivity) activity5).W) {
                            q0Var = new s0();
                        } else {
                            q0Var = new q0();
                        }
                        templateActivity.s0(q0Var);
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void J(String str) {
        try {
            if (!K().getList().contains(str)) {
                K().getList().add(str);
                View inflate = getLayoutInflater().inflate(R.layout.row_search, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.llAdded)), false);
                ((RobertoTextView) inflate.findViewById(R.id.tvLabelSearch)).setText(str);
                ((LinearLayout) _$_findCachedViewById(R.id.llAdded)).addView(inflate);
                I();
                ScrollView scrollView = (ScrollView) _$_findCachedViewById(R.id.scrollView1);
                if (scrollView != null) {
                    scrollView.postDelayed(new k8(this, 5), 500L);
                }
            } else {
                I();
                Utils utils = Utils.INSTANCE;
                androidx.fragment.app.p activity = getActivity();
                kotlin.jvm.internal.i.d(activity);
                utils.showCustomToast(activity, "Item Already Exists");
            }
            M();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f18922u, "exception", e10);
        }
    }

    public final ScreenResult16Model K() {
        ScreenResult16Model screenResult16Model = this.f18927z;
        if (screenResult16Model != null) {
            return screenResult16Model;
        }
        kotlin.jvm.internal.i.q("resultModel");
        throw null;
    }

    public final void M() {
        if (((RobertoEditText) _$_findCachedViewById(R.id.llEditText1)).hasFocus()) {
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            Context context = getContext();
            kotlin.jvm.internal.i.d(context);
            RobertoEditText llEditText1 = (RobertoEditText) _$_findCachedViewById(R.id.llEditText1);
            kotlin.jvm.internal.i.f(llEditText1, "llEditText1");
            ((TemplateActivity) activity).D0(context, llEditText1);
            return;
        }
        androidx.fragment.app.p activity2 = getActivity();
        kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
        Context context2 = getContext();
        kotlin.jvm.internal.i.d(context2);
        RobertoEditText etAddNew = (RobertoEditText) _$_findCachedViewById(R.id.etAddNew);
        kotlin.jvm.internal.i.f(etAddNew, "etAddNew");
        ((TemplateActivity) activity2).D0(context2, etAddNew);
    }

    public final void O(ArrayList<String> arrayList) {
        try {
            ((LinearLayout) _$_findCachedViewById(R.id.llSearch)).removeAllViews();
            for (String str : arrayList) {
                if (!K().getList().contains(str)) {
                    View inflate = getLayoutInflater().inflate(R.layout.row_search, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.llSearch)), false);
                    ((RobertoTextView) inflate.findViewById(R.id.tvLabelSearch)).setText(str);
                    inflate.setOnClickListener(new o4(14, this, str, inflate));
                    ((LinearLayout) _$_findCachedViewById(R.id.llSearch)).addView(inflate);
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f18922u, "exception", e10);
        }
    }

    public final void P(final boolean z10) {
        Calendar calendar = this.C;
        try {
            TimePickerDialog timePickerDialog = new TimePickerDialog(getActivity(), new TimePickerDialog.OnTimeSetListener() { // from class: hr.n8
                @Override // android.app.TimePickerDialog.OnTimeSetListener
                public final void onTimeSet(TimePicker timePicker, int i6, int i10) {
                    int i11 = o8.H;
                    o8 this$0 = o8.this;
                    kotlin.jvm.internal.i.g(this$0, "this$0");
                    Calendar calendar2 = this$0.C;
                    calendar2.set(11, i6);
                    calendar2.set(12, i10);
                    SimpleDateFormat simpleDateFormat = this$0.B;
                    if (z10) {
                        ((RobertoTextView) this$0._$_findCachedViewById(R.id.tvFromTime)).setText(simpleDateFormat.format(calendar2.getTime()));
                        this$0.K().setFromTime(calendar2.getTimeInMillis() / 1000);
                        return;
                    }
                    ((RobertoTextView) this$0._$_findCachedViewById(R.id.tvToTime)).setText(simpleDateFormat.format(calendar2.getTime()));
                    this$0.K().setTillTime(calendar2.getTimeInMillis() / 1000);
                }
            }, calendar.get(11), calendar.get(12), false);
            timePickerDialog.setTitle("Select Time");
            timePickerDialog.show();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f18922u, "exception", e10);
        }
    }

    public final void Q() {
        boolean z10;
        rr.b q0Var;
        int i6 = this.f18925x;
        if (i6 != 0) {
            if (i6 != 1) {
                if (i6 != 2) {
                    if (this.F) {
                        this.F = false;
                    }
                    this.f18925x = i6 + 1;
                } else if (this.F) {
                    this.F = false;
                    if (!K().getList().isEmpty()) {
                        this.f18925x++;
                    } else {
                        Utils.INSTANCE.showCustomToast(getActivity(), "Please enter some text to continue");
                    }
                }
            } else if (this.F) {
                this.F = false;
                if (K().getFromTime() != 0 && K().getTillTime() != 0) {
                    ((RobertoTextView) _$_findCachedViewById(R.id.textFromTime)).setVisibility(8);
                    ((RobertoTextView) _$_findCachedViewById(R.id.textToTime)).setVisibility(8);
                    ((RobertoTextView) _$_findCachedViewById(R.id.tvFromTime)).setVisibility(8);
                    ((RobertoTextView) _$_findCachedViewById(R.id.tvToTime)).setVisibility(8);
                    ((RelativeLayout) _$_findCachedViewById(R.id.relativeLayout)).setVisibility(0);
                    ((ScrollView) _$_findCachedViewById(R.id.scrollView1)).setVisibility(0);
                    ((LinearLayout) _$_findCachedViewById(R.id.llAdded)).removeAllViews();
                    if (K().getList().size() > 0) {
                        Iterator<String> it = K().getList().iterator();
                        while (it.hasNext()) {
                            ((ScrollView) _$_findCachedViewById(R.id.scrollView1)).setVisibility(0);
                            View inflate = getLayoutInflater().inflate(R.layout.row_search, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.llAdded)), false);
                            ((RobertoTextView) inflate.findViewById(R.id.tvLabelSearch)).setText(it.next());
                            ((LinearLayout) _$_findCachedViewById(R.id.llAdded)).addView(inflate);
                        }
                    }
                    this.f18925x++;
                } else {
                    Utils.INSTANCE.showCustomToast(getActivity(), "Select Time");
                }
            } else {
                ((RobertoTextView) _$_findCachedViewById(R.id.textFromTime)).setVisibility(0);
                ((RobertoTextView) _$_findCachedViewById(R.id.textToTime)).setVisibility(0);
                ((RobertoTextView) _$_findCachedViewById(R.id.tvFromTime)).setVisibility(0);
                ((RobertoTextView) _$_findCachedViewById(R.id.tvToTime)).setVisibility(0);
                ((RelativeLayout) _$_findCachedViewById(R.id.relativeLayout)).setVisibility(8);
                ((ScrollView) _$_findCachedViewById(R.id.scrollView1)).setVisibility(8);
            }
        } else if (this.F) {
            this.F = false;
            String obj = gv.r.i1(String.valueOf(((RobertoEditText) _$_findCachedViewById(R.id.llEditText1)).getText())).toString();
            if (obj != null && obj.length() != 0) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                ((RobertoEditText) _$_findCachedViewById(R.id.llEditText1)).setVisibility(0);
                Utils.INSTANCE.showCustomToast(getActivity(), "Please enter some text to continue");
            } else {
                try {
                    androidx.fragment.app.p activity = getActivity();
                    kotlin.jvm.internal.i.d(activity);
                    Object systemService = activity.getSystemService("input_method");
                    kotlin.jvm.internal.i.e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                    ((InputMethodManager) systemService).hideSoftInputFromWindow(((RobertoEditText) _$_findCachedViewById(R.id.llEditText1)).getWindowToken(), 0);
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(this.f18922u, e10);
                }
                K().setText(String.valueOf(((RobertoEditText) _$_findCachedViewById(R.id.llEditText1)).getText()));
                ((RobertoEditText) _$_findCachedViewById(R.id.llEditText1)).setVisibility(8);
                ((RobertoTextView) _$_findCachedViewById(R.id.textFromTime)).setVisibility(0);
                ((RobertoTextView) _$_findCachedViewById(R.id.textToTime)).setVisibility(0);
                ((RobertoTextView) _$_findCachedViewById(R.id.tvFromTime)).setVisibility(0);
                ((RobertoTextView) _$_findCachedViewById(R.id.tvToTime)).setVisibility(0);
                h2.o.a((ConstraintLayout) _$_findCachedViewById(R.id.constraintRoot), null);
                long fromTime = K().getFromTime();
                Calendar calendar = this.D;
                if (fromTime != 0) {
                    calendar.setTimeInMillis(K().getFromTime() * 1000);
                    ((RobertoTextView) _$_findCachedViewById(R.id.tvFromTime)).post(new k8(this, 0));
                } else {
                    calendar.setTime(Calendar.getInstance().getTime());
                    calendar.set(11, 15);
                    calendar.set(12, 0);
                    ((RobertoTextView) _$_findCachedViewById(R.id.tvFromTime)).setText(this.B.format(calendar.getTime()));
                    K().setFromTime(calendar.getTimeInMillis() / 1000);
                }
                long tillTime = K().getTillTime();
                Calendar calendar2 = this.E;
                if (tillTime != 0) {
                    calendar2.setTimeInMillis(K().getTillTime() * 1000);
                    ((RobertoTextView) _$_findCachedViewById(R.id.tvToTime)).post(new k8(this, 1));
                } else {
                    calendar2.setTime(Calendar.getInstance().getTime());
                    calendar2.set(11, 16);
                    calendar2.set(12, 0);
                    ((RobertoTextView) _$_findCachedViewById(R.id.tvToTime)).setText(this.B.format(calendar2.getTime()));
                    K().setTillTime(calendar2.getTimeInMillis() / 1000);
                }
                this.f18925x++;
            }
        } else {
            ((RobertoEditText) _$_findCachedViewById(R.id.llEditText1)).setVisibility(0);
            ((RobertoTextView) _$_findCachedViewById(R.id.textFromTime)).setVisibility(8);
            ((RobertoTextView) _$_findCachedViewById(R.id.textToTime)).setVisibility(8);
            ((RobertoTextView) _$_findCachedViewById(R.id.tvFromTime)).setVisibility(8);
            ((RobertoTextView) _$_findCachedViewById(R.id.tvToTime)).setVisibility(8);
            ((RobertoEditText) _$_findCachedViewById(R.id.llEditText1)).post(new k8(this, 2));
        }
        if (this.f18925x < 3) {
            ((RobertoTextView) _$_findCachedViewById(R.id.textView1)).setText(this.f18924w.get(this.f18925x));
            ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText(this.A.get(this.f18925x));
            ((ViewPager) _$_findCachedViewById(R.id.stepsViewPager)).post(new k8(this, 3));
            return;
        }
        this.f18925x = 0;
        ((ViewPager) _$_findCachedViewById(R.id.stepsViewPager)).setCurrentItem(this.f18925x);
        androidx.fragment.app.p activity2 = getActivity();
        kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
        ((TemplateActivity) activity2).F.put("model-16", K());
        androidx.fragment.app.p activity3 = getActivity();
        kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
        ((TemplateActivity) activity3).F.put("s66_user_data", K());
        androidx.fragment.app.p activity4 = getActivity();
        kotlin.jvm.internal.i.e(activity4, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
        rr.a aVar = (rr.a) activity4;
        androidx.fragment.app.p activity5 = getActivity();
        kotlin.jvm.internal.i.e(activity5, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
        if (((TemplateActivity) activity5).W) {
            q0Var = new s0();
        } else {
            q0Var = new q0();
        }
        aVar.s0(q0Var);
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.G;
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
        return inflater.inflate(R.layout.fragment_screen_s66, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.G.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        rr.b q0Var;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            Utils utils = Utils.INSTANCE;
            this.f18927z = new ScreenResult16Model(utils.getTimeInSeconds(), "");
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            final TemplateActivity templateActivity = (TemplateActivity) activity;
            this.f18923v = templateActivity.A0();
            String B0 = templateActivity.B0();
            if (utils.getClearingFragmentBackStack()) {
                return;
            }
            androidx.fragment.app.p activity2 = getActivity();
            kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            if (((TemplateActivity) activity2).Q) {
                if (templateActivity.W) {
                    q0Var = new s0();
                } else {
                    q0Var = new q0();
                }
                templateActivity.s0(q0Var);
                return;
            }
            if (kotlin.jvm.internal.i.b(B0, "s66")) {
                this.f18924w = UtilFunKt.paramsMapToList(this.f18923v.get("s66_question_list"));
                this.A = UtilFunKt.paramsMapToList(this.f18923v.get("s66_description_list"));
                ((RobertoButton) _$_findCachedViewById(R.id.button2)).setText(UtilFunKt.paramsMapToString(this.f18923v.get("s66_btn_two_text")));
                ((RobertoEditText) _$_findCachedViewById(R.id.llEditText1)).setHint(UtilFunKt.paramsMapToString(this.f18923v.get("s66_one_placeholder")));
                ((RobertoEditText) _$_findCachedViewById(R.id.etAddNew)).setHint(UtilFunKt.paramsMapToString(this.f18923v.get("s66_three_placeholder")));
                ((RobertoTextView) _$_findCachedViewById(R.id.textFromTime)).setText(UtilFunKt.paramsMapToString(this.f18923v.get("s66_from_text")));
                ((RobertoTextView) _$_findCachedViewById(R.id.textToTime)).setText(UtilFunKt.paramsMapToString(this.f18923v.get("s66_to_text")));
                O(UtilFunKt.paramsMapToList(this.f18923v.get("pop_up2_search_list")));
            } else if (kotlin.jvm.internal.i.b(B0, "s115")) {
                this.f18924w = UtilFunKt.paramsMapToList(this.f18923v.get("s115_heading_list"));
                this.A = UtilFunKt.paramsMapToList(this.f18923v.get("s115_description_list"));
                ((RobertoButton) _$_findCachedViewById(R.id.button2)).setText(UtilFunKt.paramsMapToString(this.f18923v.get("s115_btn_two_text")));
                ((RobertoEditText) _$_findCachedViewById(R.id.llEditText1)).setHint(UtilFunKt.paramsMapToString(this.f18923v.get("s115_placeholder")));
                ((RobertoEditText) _$_findCachedViewById(R.id.etAddNew)).setHint(UtilFunKt.paramsMapToString(this.f18923v.get("s115_three_placeholder")));
                ((RobertoTextView) _$_findCachedViewById(R.id.textFromTime)).setText(UtilFunKt.paramsMapToString(this.f18923v.get("s115_two_from_text")));
                ((RobertoTextView) _$_findCachedViewById(R.id.textToTime)).setText(UtilFunKt.paramsMapToString(this.f18923v.get("s115_two_till_text")));
            }
            this.f18926y = new ek.i(this, 3);
            ((ViewPager) _$_findCachedViewById(R.id.stepsViewPager)).setAdapter(this.f18926y);
            ek.i iVar = this.f18926y;
            if (iVar != null) {
                iVar.k();
            }
            ek.i iVar2 = this.f18926y;
            kotlin.jvm.internal.i.d(iVar2);
            ((ViewPager) _$_findCachedViewById(R.id.stepsViewPager)).b(iVar2);
            ((ViewPager) _$_findCachedViewById(R.id.stepsViewPager)).setOnTouchListener(new w5.h0(16));
            if (templateActivity.J) {
                HashMap<String, Object> hashMap = templateActivity.F;
                if (hashMap.containsKey("s66_user_data")) {
                    ScreenResult16Model K = K();
                    Object obj = hashMap.get("s66_user_data");
                    kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type com.theinnerhour.b2b.model.ScreenResult16Model");
                    K.setText(((ScreenResult16Model) obj).getText());
                    ScreenResult16Model K2 = K();
                    Object obj2 = hashMap.get("s66_user_data");
                    kotlin.jvm.internal.i.e(obj2, "null cannot be cast to non-null type com.theinnerhour.b2b.model.ScreenResult16Model");
                    K2.setFromTime(((ScreenResult16Model) obj2).getFromTime());
                    ScreenResult16Model K3 = K();
                    Object obj3 = hashMap.get("s66_user_data");
                    kotlin.jvm.internal.i.e(obj3, "null cannot be cast to non-null type com.theinnerhour.b2b.model.ScreenResult16Model");
                    K3.setTillTime(((ScreenResult16Model) obj3).getTillTime());
                    ScreenResult16Model K4 = K();
                    Object obj4 = hashMap.get("s66_user_data");
                    kotlin.jvm.internal.i.e(obj4, "null cannot be cast to non-null type com.theinnerhour.b2b.model.ScreenResult16Model");
                    K4.setList(((ScreenResult16Model) obj4).getList());
                    ((RobertoEditText) _$_findCachedViewById(R.id.llEditText1)).post(new k8(this, 4));
                    if (kotlin.jvm.internal.i.b(B0, "s66")) {
                        O(UtilFunKt.paramsMapToList(this.f18923v.get("pop_up2_search_list")));
                    }
                }
            }
            Q();
            ((RobertoButton) _$_findCachedViewById(R.id.button2)).setOnClickListener(new View.OnClickListener(this) { // from class: hr.m8

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ o8 f18845v;

                {
                    this.f18845v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i6 = r2;
                    boolean z10 = false;
                    boolean z11 = true;
                    o8 this$0 = this.f18845v;
                    switch (i6) {
                        case 0:
                            int i10 = o8.H;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            Context context = this$0.getContext();
                            kotlin.jvm.internal.i.d(context);
                            androidx.appcompat.widget.a1 a1Var = new androidx.appcompat.widget.a1(context, (ImageView) this$0._$_findCachedViewById(R.id.ivEllipses));
                            a1Var.a().inflate(R.menu.logs_menu, a1Var.f1344b);
                            a1Var.f1346d = new hd.a(9, this$0);
                            a1Var.b();
                            return;
                        case 1:
                            int i11 = o8.H;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.F = true;
                            this$0.Q();
                            return;
                        case 2:
                            int i12 = o8.H;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.P(true);
                            return;
                        case 3:
                            int i13 = o8.H;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.P(true);
                            return;
                        case 4:
                            int i14 = o8.H;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            if (((RobertoTextView) this$0._$_findCachedViewById(R.id.textFromTime)).getText().toString().length() != 0) {
                                z11 = false;
                            }
                            if (z11) {
                                Utils.INSTANCE.showCustomToast(this$0.getActivity(), "Enter from date");
                                return;
                            } else {
                                this$0.P(false);
                                return;
                            }
                        case 5:
                            int i15 = o8.H;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            if (((RobertoTextView) this$0._$_findCachedViewById(R.id.textFromTime)).getText().toString().length() != 0) {
                                z11 = false;
                            }
                            if (z11) {
                                Utils.INSTANCE.showCustomToast(this$0.getActivity(), "Enter to date");
                                return;
                            } else {
                                this$0.P(false);
                                return;
                            }
                        default:
                            int i16 = o8.H;
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
                    }
                }
            });
            ((RobertoTextView) _$_findCachedViewById(R.id.textFromTime)).setOnClickListener(new View.OnClickListener(this) { // from class: hr.m8

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ o8 f18845v;

                {
                    this.f18845v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i6 = r2;
                    boolean z10 = false;
                    boolean z11 = true;
                    o8 this$0 = this.f18845v;
                    switch (i6) {
                        case 0:
                            int i10 = o8.H;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            Context context = this$0.getContext();
                            kotlin.jvm.internal.i.d(context);
                            androidx.appcompat.widget.a1 a1Var = new androidx.appcompat.widget.a1(context, (ImageView) this$0._$_findCachedViewById(R.id.ivEllipses));
                            a1Var.a().inflate(R.menu.logs_menu, a1Var.f1344b);
                            a1Var.f1346d = new hd.a(9, this$0);
                            a1Var.b();
                            return;
                        case 1:
                            int i11 = o8.H;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.F = true;
                            this$0.Q();
                            return;
                        case 2:
                            int i12 = o8.H;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.P(true);
                            return;
                        case 3:
                            int i13 = o8.H;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.P(true);
                            return;
                        case 4:
                            int i14 = o8.H;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            if (((RobertoTextView) this$0._$_findCachedViewById(R.id.textFromTime)).getText().toString().length() != 0) {
                                z11 = false;
                            }
                            if (z11) {
                                Utils.INSTANCE.showCustomToast(this$0.getActivity(), "Enter from date");
                                return;
                            } else {
                                this$0.P(false);
                                return;
                            }
                        case 5:
                            int i15 = o8.H;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            if (((RobertoTextView) this$0._$_findCachedViewById(R.id.textFromTime)).getText().toString().length() != 0) {
                                z11 = false;
                            }
                            if (z11) {
                                Utils.INSTANCE.showCustomToast(this$0.getActivity(), "Enter to date");
                                return;
                            } else {
                                this$0.P(false);
                                return;
                            }
                        default:
                            int i16 = o8.H;
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
                    }
                }
            });
            ((RobertoTextView) _$_findCachedViewById(R.id.tvFromTime)).setOnClickListener(new View.OnClickListener(this) { // from class: hr.m8

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ o8 f18845v;

                {
                    this.f18845v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i6 = r2;
                    boolean z10 = false;
                    boolean z11 = true;
                    o8 this$0 = this.f18845v;
                    switch (i6) {
                        case 0:
                            int i10 = o8.H;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            Context context = this$0.getContext();
                            kotlin.jvm.internal.i.d(context);
                            androidx.appcompat.widget.a1 a1Var = new androidx.appcompat.widget.a1(context, (ImageView) this$0._$_findCachedViewById(R.id.ivEllipses));
                            a1Var.a().inflate(R.menu.logs_menu, a1Var.f1344b);
                            a1Var.f1346d = new hd.a(9, this$0);
                            a1Var.b();
                            return;
                        case 1:
                            int i11 = o8.H;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.F = true;
                            this$0.Q();
                            return;
                        case 2:
                            int i12 = o8.H;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.P(true);
                            return;
                        case 3:
                            int i13 = o8.H;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.P(true);
                            return;
                        case 4:
                            int i14 = o8.H;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            if (((RobertoTextView) this$0._$_findCachedViewById(R.id.textFromTime)).getText().toString().length() != 0) {
                                z11 = false;
                            }
                            if (z11) {
                                Utils.INSTANCE.showCustomToast(this$0.getActivity(), "Enter from date");
                                return;
                            } else {
                                this$0.P(false);
                                return;
                            }
                        case 5:
                            int i15 = o8.H;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            if (((RobertoTextView) this$0._$_findCachedViewById(R.id.textFromTime)).getText().toString().length() != 0) {
                                z11 = false;
                            }
                            if (z11) {
                                Utils.INSTANCE.showCustomToast(this$0.getActivity(), "Enter to date");
                                return;
                            } else {
                                this$0.P(false);
                                return;
                            }
                        default:
                            int i16 = o8.H;
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
                    }
                }
            });
            ((RobertoTextView) _$_findCachedViewById(R.id.textToTime)).setOnClickListener(new View.OnClickListener(this) { // from class: hr.m8

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ o8 f18845v;

                {
                    this.f18845v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i6 = r2;
                    boolean z10 = false;
                    boolean z11 = true;
                    o8 this$0 = this.f18845v;
                    switch (i6) {
                        case 0:
                            int i10 = o8.H;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            Context context = this$0.getContext();
                            kotlin.jvm.internal.i.d(context);
                            androidx.appcompat.widget.a1 a1Var = new androidx.appcompat.widget.a1(context, (ImageView) this$0._$_findCachedViewById(R.id.ivEllipses));
                            a1Var.a().inflate(R.menu.logs_menu, a1Var.f1344b);
                            a1Var.f1346d = new hd.a(9, this$0);
                            a1Var.b();
                            return;
                        case 1:
                            int i11 = o8.H;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.F = true;
                            this$0.Q();
                            return;
                        case 2:
                            int i12 = o8.H;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.P(true);
                            return;
                        case 3:
                            int i13 = o8.H;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.P(true);
                            return;
                        case 4:
                            int i14 = o8.H;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            if (((RobertoTextView) this$0._$_findCachedViewById(R.id.textFromTime)).getText().toString().length() != 0) {
                                z11 = false;
                            }
                            if (z11) {
                                Utils.INSTANCE.showCustomToast(this$0.getActivity(), "Enter from date");
                                return;
                            } else {
                                this$0.P(false);
                                return;
                            }
                        case 5:
                            int i15 = o8.H;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            if (((RobertoTextView) this$0._$_findCachedViewById(R.id.textFromTime)).getText().toString().length() != 0) {
                                z11 = false;
                            }
                            if (z11) {
                                Utils.INSTANCE.showCustomToast(this$0.getActivity(), "Enter to date");
                                return;
                            } else {
                                this$0.P(false);
                                return;
                            }
                        default:
                            int i16 = o8.H;
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
                    }
                }
            });
            ((RobertoTextView) _$_findCachedViewById(R.id.tvToTime)).setOnClickListener(new View.OnClickListener(this) { // from class: hr.m8

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ o8 f18845v;

                {
                    this.f18845v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i6 = r2;
                    boolean z10 = false;
                    boolean z11 = true;
                    o8 this$0 = this.f18845v;
                    switch (i6) {
                        case 0:
                            int i10 = o8.H;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            Context context = this$0.getContext();
                            kotlin.jvm.internal.i.d(context);
                            androidx.appcompat.widget.a1 a1Var = new androidx.appcompat.widget.a1(context, (ImageView) this$0._$_findCachedViewById(R.id.ivEllipses));
                            a1Var.a().inflate(R.menu.logs_menu, a1Var.f1344b);
                            a1Var.f1346d = new hd.a(9, this$0);
                            a1Var.b();
                            return;
                        case 1:
                            int i11 = o8.H;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.F = true;
                            this$0.Q();
                            return;
                        case 2:
                            int i12 = o8.H;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.P(true);
                            return;
                        case 3:
                            int i13 = o8.H;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.P(true);
                            return;
                        case 4:
                            int i14 = o8.H;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            if (((RobertoTextView) this$0._$_findCachedViewById(R.id.textFromTime)).getText().toString().length() != 0) {
                                z11 = false;
                            }
                            if (z11) {
                                Utils.INSTANCE.showCustomToast(this$0.getActivity(), "Enter from date");
                                return;
                            } else {
                                this$0.P(false);
                                return;
                            }
                        case 5:
                            int i15 = o8.H;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            if (((RobertoTextView) this$0._$_findCachedViewById(R.id.textFromTime)).getText().toString().length() != 0) {
                                z11 = false;
                            }
                            if (z11) {
                                Utils.INSTANCE.showCustomToast(this$0.getActivity(), "Enter to date");
                                return;
                            } else {
                                this$0.P(false);
                                return;
                            }
                        default:
                            int i16 = o8.H;
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
                    }
                }
            });
            ((ImageButton) _$_findCachedViewById(R.id.imgTextAdd)).setOnClickListener(new View.OnClickListener(this) { // from class: hr.m8

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ o8 f18845v;

                {
                    this.f18845v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i6 = r2;
                    boolean z10 = false;
                    boolean z11 = true;
                    o8 this$0 = this.f18845v;
                    switch (i6) {
                        case 0:
                            int i10 = o8.H;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            Context context = this$0.getContext();
                            kotlin.jvm.internal.i.d(context);
                            androidx.appcompat.widget.a1 a1Var = new androidx.appcompat.widget.a1(context, (ImageView) this$0._$_findCachedViewById(R.id.ivEllipses));
                            a1Var.a().inflate(R.menu.logs_menu, a1Var.f1344b);
                            a1Var.f1346d = new hd.a(9, this$0);
                            a1Var.b();
                            return;
                        case 1:
                            int i11 = o8.H;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.F = true;
                            this$0.Q();
                            return;
                        case 2:
                            int i12 = o8.H;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.P(true);
                            return;
                        case 3:
                            int i13 = o8.H;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.P(true);
                            return;
                        case 4:
                            int i14 = o8.H;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            if (((RobertoTextView) this$0._$_findCachedViewById(R.id.textFromTime)).getText().toString().length() != 0) {
                                z11 = false;
                            }
                            if (z11) {
                                Utils.INSTANCE.showCustomToast(this$0.getActivity(), "Enter from date");
                                return;
                            } else {
                                this$0.P(false);
                                return;
                            }
                        case 5:
                            int i15 = o8.H;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            if (((RobertoTextView) this$0._$_findCachedViewById(R.id.textFromTime)).getText().toString().length() != 0) {
                                z11 = false;
                            }
                            if (z11) {
                                Utils.INSTANCE.showCustomToast(this$0.getActivity(), "Enter to date");
                                return;
                            } else {
                                this$0.P(false);
                                return;
                            }
                        default:
                            int i16 = o8.H;
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
                    }
                }
            });
            ((RobertoEditText) _$_findCachedViewById(R.id.etAddNew)).addTextChangedListener(new a());
            ((RobertoEditText) _$_findCachedViewById(R.id.etAddNew)).setOnFocusChangeListener(new dc.b(13, this));
            ((RobertoEditText) _$_findCachedViewById(R.id.etAddNew)).setOnEditorActionListener(new dl.w(14, this));
            ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new View.OnClickListener(this) { // from class: hr.l8

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ o8 f18766v;

                {
                    this.f18766v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    rr.b q0Var2;
                    int i6 = r3;
                    TemplateActivity act = templateActivity;
                    o8 this$0 = this.f18766v;
                    switch (i6) {
                        case 0:
                            int i10 = o8.H;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            kotlin.jvm.internal.i.g(act, "$act");
                            androidx.fragment.app.p activity3 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                            if (((TemplateActivity) activity3).getIntent().hasExtra("source") && this$0.f18925x == 0) {
                                androidx.fragment.app.p activity4 = this$0.getActivity();
                                kotlin.jvm.internal.i.e(activity4, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                ((TemplateActivity) activity4).Q = true;
                                androidx.fragment.app.p activity5 = this$0.getActivity();
                                kotlin.jvm.internal.i.e(activity5, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                TemplateActivity templateActivity2 = (TemplateActivity) activity5;
                                if (act.W) {
                                    q0Var2 = new s0();
                                } else {
                                    q0Var2 = new q0();
                                }
                                templateActivity2.s0(q0Var2);
                                return;
                            }
                            act.onBackPressed();
                            return;
                        default:
                            int i11 = o8.H;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            kotlin.jvm.internal.i.g(act, "$act");
                            this$0.f18925x = 0;
                            ((ViewPager) this$0._$_findCachedViewById(R.id.stepsViewPager)).setCurrentItem(this$0.f18925x);
                            this$0.M();
                            androidx.fragment.app.p activity6 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity6, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                            ((TemplateActivity) activity6).F.put("s66_user_data", this$0.K());
                            act.s0(new b0());
                            return;
                    }
                }
            });
            ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setVisibility(0);
            ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setOnClickListener(new View.OnClickListener(this) { // from class: hr.m8

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ o8 f18845v;

                {
                    this.f18845v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i6 = r2;
                    boolean z10 = false;
                    boolean z11 = true;
                    o8 this$0 = this.f18845v;
                    switch (i6) {
                        case 0:
                            int i10 = o8.H;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            Context context = this$0.getContext();
                            kotlin.jvm.internal.i.d(context);
                            androidx.appcompat.widget.a1 a1Var = new androidx.appcompat.widget.a1(context, (ImageView) this$0._$_findCachedViewById(R.id.ivEllipses));
                            a1Var.a().inflate(R.menu.logs_menu, a1Var.f1344b);
                            a1Var.f1346d = new hd.a(9, this$0);
                            a1Var.b();
                            return;
                        case 1:
                            int i11 = o8.H;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.F = true;
                            this$0.Q();
                            return;
                        case 2:
                            int i12 = o8.H;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.P(true);
                            return;
                        case 3:
                            int i13 = o8.H;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.P(true);
                            return;
                        case 4:
                            int i14 = o8.H;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            if (((RobertoTextView) this$0._$_findCachedViewById(R.id.textFromTime)).getText().toString().length() != 0) {
                                z11 = false;
                            }
                            if (z11) {
                                Utils.INSTANCE.showCustomToast(this$0.getActivity(), "Enter from date");
                                return;
                            } else {
                                this$0.P(false);
                                return;
                            }
                        case 5:
                            int i15 = o8.H;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            if (((RobertoTextView) this$0._$_findCachedViewById(R.id.textFromTime)).getText().toString().length() != 0) {
                                z11 = false;
                            }
                            if (z11) {
                                Utils.INSTANCE.showCustomToast(this$0.getActivity(), "Enter to date");
                                return;
                            } else {
                                this$0.P(false);
                                return;
                            }
                        default:
                            int i16 = o8.H;
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
                    }
                }
            });
            if (kotlin.jvm.internal.i.b(B0, "s115")) {
                ((ImageView) _$_findCachedViewById(R.id.ivHelp)).setVisibility(0);
                ((ImageView) _$_findCachedViewById(R.id.ivHelp)).setOnClickListener(new View.OnClickListener(this) { // from class: hr.l8

                    /* renamed from: v  reason: collision with root package name */
                    public final /* synthetic */ o8 f18766v;

                    {
                        this.f18766v = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        rr.b q0Var2;
                        int i6 = r3;
                        TemplateActivity act = templateActivity;
                        o8 this$0 = this.f18766v;
                        switch (i6) {
                            case 0:
                                int i10 = o8.H;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                kotlin.jvm.internal.i.g(act, "$act");
                                androidx.fragment.app.p activity3 = this$0.getActivity();
                                kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                if (((TemplateActivity) activity3).getIntent().hasExtra("source") && this$0.f18925x == 0) {
                                    androidx.fragment.app.p activity4 = this$0.getActivity();
                                    kotlin.jvm.internal.i.e(activity4, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                    ((TemplateActivity) activity4).Q = true;
                                    androidx.fragment.app.p activity5 = this$0.getActivity();
                                    kotlin.jvm.internal.i.e(activity5, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                    TemplateActivity templateActivity2 = (TemplateActivity) activity5;
                                    if (act.W) {
                                        q0Var2 = new s0();
                                    } else {
                                        q0Var2 = new q0();
                                    }
                                    templateActivity2.s0(q0Var2);
                                    return;
                                }
                                act.onBackPressed();
                                return;
                            default:
                                int i11 = o8.H;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                kotlin.jvm.internal.i.g(act, "$act");
                                this$0.f18925x = 0;
                                ((ViewPager) this$0._$_findCachedViewById(R.id.stepsViewPager)).setCurrentItem(this$0.f18925x);
                                this$0.M();
                                androidx.fragment.app.p activity6 = this$0.getActivity();
                                kotlin.jvm.internal.i.e(activity6, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                ((TemplateActivity) activity6).F.put("s66_user_data", this$0.K());
                                act.s0(new b0());
                                return;
                        }
                    }
                });
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f18922u, "exception in on view created", e10);
        }
    }

    /* compiled from: ScreenS66Fragment.kt */
    /* loaded from: classes2.dex */
    public static final class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i6, int i10, int i11) {
            boolean z10;
            o8 o8Var = o8.this;
            if (String.valueOf(((RobertoEditText) o8Var._$_findCachedViewById(R.id.etAddNew)).getText()).length() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                ((ImageButton) o8Var._$_findCachedViewById(R.id.imgTextAdd)).setVisibility(0);
            } else {
                ((ImageButton) o8Var._$_findCachedViewById(R.id.imgTextAdd)).setVisibility(8);
            }
            String lowerCase = String.valueOf(((RobertoEditText) o8Var._$_findCachedViewById(R.id.etAddNew)).getText()).toLowerCase();
            kotlin.jvm.internal.i.f(lowerCase, "this as java.lang.String).toLowerCase()");
            try {
                int childCount = ((LinearLayout) o8Var._$_findCachedViewById(R.id.llSearch)).getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = ((LinearLayout) o8Var._$_findCachedViewById(R.id.llSearch)).getChildAt(i12);
                    String lowerCase2 = ((RobertoTextView) childAt.findViewById(R.id.tvLabelSearch)).getText().toString().toLowerCase();
                    kotlin.jvm.internal.i.f(lowerCase2, "this as java.lang.String).toLowerCase()");
                    if (gv.r.J0(lowerCase2, lowerCase)) {
                        childAt.setVisibility(0);
                    } else {
                        childAt.setVisibility(8);
                    }
                }
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(o8Var.f18922u, "exception", e10);
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
