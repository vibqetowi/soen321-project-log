package hr;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.o0;
import androidx.viewpager.widget.ViewPager;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.model.CourseDayModelV1;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.model.ScreenResult10Model;
import com.theinnerhour.b2b.model.TemplateModel;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.receiver.WorryTimeReceiver;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UtilFunKt;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoEditText;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Random;
import kotlin.Metadata;
/* compiled from: ScreenS38Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhr/s7;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class s7 extends rr.b {
    public static final /* synthetic */ int M = 0;
    public ek.i A;
    public final Calendar C;
    public String D;
    public String E;
    public final ScreenResult10Model F;
    public boolean G;
    public TemplateActivity H;
    public String I;
    public final androidx.lifecycle.m0 J;
    public final String K;

    /* renamed from: z  reason: collision with root package name */
    public int f19165z;
    public final LinkedHashMap L = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f19160u = LogHelper.INSTANCE.makeLogTag(s7.class);

    /* renamed from: v  reason: collision with root package name */
    public ArrayList<String> f19161v = new ArrayList<>();

    /* renamed from: w  reason: collision with root package name */
    public final SimpleDateFormat f19162w = new SimpleDateFormat("hh:mm a");

    /* renamed from: x  reason: collision with root package name */
    public final SimpleDateFormat f19163x = new SimpleDateFormat("hh:mm");

    /* renamed from: y  reason: collision with root package name */
    public ArrayList<String> f19164y = new ArrayList<>();
    public String B = "s38";

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.a<androidx.lifecycle.q0> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f19166u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Fragment fragment) {
            super(0);
            this.f19166u = fragment;
        }

        @Override // ss.a
        public final androidx.lifecycle.q0 invoke() {
            return defpackage.e.m(this.f19166u, "requireActivity().viewModelStore");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.a<k1.a> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f19167u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Fragment fragment) {
            super(0);
            this.f19167u = fragment;
        }

        @Override // ss.a
        public final k1.a invoke() {
            return defpackage.b.r(this.f19167u, "requireActivity().defaultViewModelCreationExtras");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class c extends kotlin.jvm.internal.k implements ss.a<o0.b> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f19168u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f19168u = fragment;
        }

        @Override // ss.a
        public final o0.b invoke() {
            return pl.a.e(this.f19168u, "requireActivity().defaultViewModelProviderFactory");
        }
    }

    public s7() {
        Calendar calendar = Calendar.getInstance();
        kotlin.jvm.internal.i.f(calendar, "getInstance()");
        this.C = calendar;
        this.D = "";
        this.E = "";
        this.F = new ScreenResult10Model();
        this.I = "";
        this.J = kotlin.jvm.internal.b0.j(this, kotlin.jvm.internal.y.a(fm.a.class), new a(this), new b(this), new c(this));
        this.K = "result_10";
    }

    @Override // rr.b
    public final boolean I() {
        int i6 = this.f19165z;
        if (i6 > 0) {
            this.f19165z = i6 - 1;
            O();
            return false;
        }
        return true;
    }

    public final TemplateActivity J() {
        TemplateActivity templateActivity = this.H;
        if (templateActivity != null) {
            return templateActivity;
        }
        kotlin.jvm.internal.i.q("act");
        throw null;
    }

    public final void K() {
        String str;
        int i6;
        int i10;
        Calendar calendar = this.C;
        try {
            if (calendar.getTimeInMillis() < Calendar.getInstance().getTimeInMillis()) {
                calendar.add(5, 1);
            }
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            HashMap<String, Object> A0 = ((TemplateActivity) activity).A0();
            Intent intent = new Intent(getActivity(), WorryTimeReceiver.class);
            intent.putExtra("msg", this.F.getText());
            intent.putExtra(Constants.API_COURSE_LINK, Constants.NOTIFICATION_WORRY);
            intent.putExtra("params", A0);
            androidx.fragment.app.p activity2 = getActivity();
            kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            CourseDayModelV1 courseDayModelV1 = ((TemplateActivity) activity2).H;
            if (courseDayModelV1 != null) {
                str = courseDayModelV1.getContent_id();
            } else {
                str = null;
            }
            kotlin.jvm.internal.i.d(str);
            intent.putExtra("content_id", str);
            HashMap<String, Object> hashMap = J().F;
            if (hashMap.containsKey("s38_notification_id")) {
                Object obj = hashMap.get("s38_notification_id");
                kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type kotlin.Int");
                i6 = ((Integer) obj).intValue();
            } else {
                int nextInt = new Random().nextInt();
                hashMap.put("s38_notification_id", Integer.valueOf(nextInt));
                i6 = nextInt;
            }
            Context applicationContext = requireActivity().getApplicationContext();
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 23) {
                i10 = 201326592;
            } else {
                i10 = 134217728;
            }
            PendingIntent broadcast = PendingIntent.getBroadcast(applicationContext, i6, intent, i10);
            Object systemService = requireActivity().getSystemService("alarm");
            kotlin.jvm.internal.i.e(systemService, "null cannot be cast to non-null type android.app.AlarmManager");
            AlarmManager alarmManager = (AlarmManager) systemService;
            if (i11 >= 23) {
                alarmManager.setExactAndAllowWhileIdle(0, calendar.getTimeInMillis(), broadcast);
            } else {
                alarmManager.setExact(0, calendar.getTimeInMillis(), broadcast);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f19160u, "Exception", e10);
        }
    }

    public final void M() {
        try {
            ((RobertoEditText) _$_findCachedViewById(R.id.llEditText)).setVisibility(8);
            ((RobertoTextView) _$_findCachedViewById(R.id.llTextView)).setVisibility(0);
            ((RobertoTextView) _$_findCachedViewById(R.id.timePickerBtn)).setVisibility(0);
            ((RobertoTextView) _$_findCachedViewById(R.id.timePickerBtn)).setOnClickListener(new r7(this, 3));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f19160u, "Exception", e10);
        }
    }

    public final void O() {
        boolean z10;
        boolean z11;
        String label;
        int i6 = this.f19165z;
        String str = this.f19160u;
        ScreenResult10Model screenResult10Model = this.F;
        if (i6 != 0) {
            if (i6 != 1) {
                if (i6 == 2) {
                    if (this.G) {
                        this.G = false;
                    }
                    String str2 = this.K;
                    try {
                        if (!J().K) {
                            J().K = true;
                            screenResult10Model.setDate(this.C.getTimeInMillis() / 1000);
                            J().F.put("s38_time", Long.valueOf(screenResult10Model.getDate()));
                            if (J().W) {
                                TemplateModel templateModel = J().f10547y;
                                if (templateModel != null && (label = templateModel.getLabel()) != null) {
                                    ((fm.a) this.J.getValue()).h(screenResult10Model, label);
                                }
                            } else {
                                androidx.fragment.app.p activity = getActivity();
                                kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                Goal y02 = ((TemplateActivity) activity).y0();
                                if (y02 != null) {
                                    if (!y02.getData().containsKey(str2)) {
                                        y02.getData().put(str2, new ArrayList());
                                    }
                                    Object obj = y02.getData().get(str2);
                                    kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type java.util.ArrayList<com.theinnerhour.b2b.model.ScreenResult10Model>{ kotlin.collections.TypeAliasesKt.ArrayList<com.theinnerhour.b2b.model.ScreenResult10Model> }");
                                    ((ArrayList) obj).add(screenResult10Model);
                                    FirebasePersistence.getInstance().updateUserOnFirebase();
                                }
                            }
                        }
                    } catch (Exception e10) {
                        LogHelper.INSTANCE.e(str, "exception", e10);
                    }
                    this.f19165z++;
                }
            } else {
                String str3 = this.B;
                if (kotlin.jvm.internal.i.b(str3, "s38")) {
                    if (this.G) {
                        this.G = false;
                        K();
                        ((RobertoTextView) _$_findCachedViewById(R.id.llTextView)).setText(this.E);
                        ((RobertoTextView) _$_findCachedViewById(R.id.timePickerBtn)).setVisibility(8);
                        ((RobertoTextView) _$_findCachedViewById(R.id.timePickerBtn)).setOnClickListener(null);
                        this.f19165z++;
                    } else {
                        P();
                        M();
                    }
                } else if (kotlin.jvm.internal.i.b(str3, "s39")) {
                    if (this.G) {
                        this.G = false;
                        if (String.valueOf(((RobertoEditText) _$_findCachedViewById(R.id.llEditText)).getText()).length() == 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z11) {
                            Utils.INSTANCE.showCustomToast(getActivity(), this.I);
                        } else {
                            screenResult10Model.setText(String.valueOf(((RobertoEditText) _$_findCachedViewById(R.id.llEditText)).getText()));
                            J().F.put("s39_text", String.valueOf(((RobertoEditText) _$_findCachedViewById(R.id.llEditText)).getText()));
                            ((RobertoTextView) _$_findCachedViewById(R.id.llTextView)).setText(this.E);
                            ((RobertoTextView) _$_findCachedViewById(R.id.timePickerBtn)).setOnClickListener(null);
                            ((RobertoTextView) _$_findCachedViewById(R.id.llTextView)).setVisibility(0);
                            ((RobertoEditText) _$_findCachedViewById(R.id.llEditText)).setVisibility(8);
                            K();
                            this.f19165z++;
                        }
                    } else {
                        ((RobertoEditText) _$_findCachedViewById(R.id.llEditText)).setVisibility(0);
                        ((RobertoTextView) _$_findCachedViewById(R.id.llTextView)).setVisibility(8);
                        ((RobertoTextView) _$_findCachedViewById(R.id.timePickerBtn)).setVisibility(8);
                    }
                }
            }
        } else {
            String str4 = this.B;
            if (kotlin.jvm.internal.i.b(str4, "s38")) {
                if (this.G) {
                    this.G = false;
                    if (gv.r.i1(String.valueOf(((RobertoEditText) _$_findCachedViewById(R.id.llEditText)).getText())).toString().length() == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        Utils.INSTANCE.showCustomToast(getActivity(), this.I);
                    } else {
                        try {
                            Object systemService = requireActivity().getSystemService("input_method");
                            kotlin.jvm.internal.i.e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                            ((InputMethodManager) systemService).hideSoftInputFromWindow(((RobertoEditText) _$_findCachedViewById(R.id.llEditText)).getWindowToken(), 0);
                        } catch (Exception e11) {
                            LogHelper.INSTANCE.e(str, e11);
                        }
                        screenResult10Model.setText(String.valueOf(((RobertoEditText) _$_findCachedViewById(R.id.llEditText)).getText()));
                        J().F.put("s38_text", String.valueOf(((RobertoEditText) _$_findCachedViewById(R.id.llEditText)).getText()));
                        M();
                        this.f19165z++;
                    }
                } else {
                    ((RobertoEditText) _$_findCachedViewById(R.id.llEditText)).setVisibility(0);
                    ((RobertoTextView) _$_findCachedViewById(R.id.llTextView)).setVisibility(8);
                    ((RobertoTextView) _$_findCachedViewById(R.id.timePickerBtn)).setVisibility(8);
                }
            } else if (kotlin.jvm.internal.i.b(str4, "s39")) {
                if (this.G) {
                    this.G = false;
                    this.f19165z++;
                    ((RobertoEditText) _$_findCachedViewById(R.id.llEditText)).setVisibility(0);
                    ((RobertoTextView) _$_findCachedViewById(R.id.llTextView)).setVisibility(8);
                    ((RobertoTextView) _$_findCachedViewById(R.id.timePickerBtn)).setVisibility(8);
                } else {
                    P();
                    M();
                    ((RobertoEditText) _$_findCachedViewById(R.id.llEditText)).setVisibility(8);
                    ((RobertoTextView) _$_findCachedViewById(R.id.llTextView)).setVisibility(0);
                    ((RobertoTextView) _$_findCachedViewById(R.id.timePickerBtn)).setVisibility(0);
                }
            }
        }
        if (this.f19165z < 3) {
            ((RobertoTextView) _$_findCachedViewById(R.id.textView1)).setText(this.f19161v.get(this.f19165z));
            ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText(this.f19164y.get(this.f19165z));
            ((ViewPager) _$_findCachedViewById(R.id.stepsViewPager)).post(new tl.o(29, this));
            return;
        }
        this.f19165z = 0;
        androidx.fragment.app.p activity2 = getActivity();
        kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
        ((TemplateActivity) activity2).t0();
    }

    public final void P() {
        try {
            ((RobertoTextView) _$_findCachedViewById(R.id.llTextView)).setText(this.D);
            ((RobertoTextView) _$_findCachedViewById(R.id.timePickerBtn)).setText(this.f19162w.format(this.C.getTime()));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f19160u, "exception", e10);
        }
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.L;
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
        return inflater.inflate(R.layout.fragment_screen_s38, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        fm.a aVar = (fm.a) this.J.getValue();
        aVar.f15174h0.k(getViewLifecycleOwner());
        aVar.f15177k0.k(getViewLifecycleOwner());
        aVar.f15178l0.k(getViewLifecycleOwner());
        aVar.f15180n0.k(getViewLifecycleOwner());
        aVar.f15181o0.k(getViewLifecycleOwner());
        aVar.f15182p0.k(getViewLifecycleOwner());
        aVar.w();
        super.onDestroyView();
        this.L.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x01e6 A[Catch: Exception -> 0x0212, TryCatch #2 {Exception -> 0x0212, blocks: (B:20:0x0156, B:22:0x015e, B:25:0x0166, B:27:0x0174, B:28:0x018c, B:31:0x0194, B:38:0x01e0, B:40:0x01e6, B:42:0x01f4, B:35:0x019e, B:37:0x01ac), top: B:61:0x0156, outer: #0 }] */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        TemplateModel templateModel;
        String label;
        String str2;
        String str3 = this.f19160u;
        Calendar calendar = this.C;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            this.H = (TemplateActivity) activity;
            HashMap<String, Object> A0 = J().A0();
            this.B = J().B0();
            String B0 = J().B0();
            this.f19161v = UtilFunKt.paramsMapToList(A0.get(B0.concat("_question_list")));
            this.f19164y = UtilFunKt.paramsMapToList(A0.get(B0.concat("_description_list")));
            ((RobertoEditText) _$_findCachedViewById(R.id.llEditText)).setHint(UtilFunKt.paramsMapToString(A0.get(B0.concat("_placeholder"))));
            this.E = UtilFunKt.paramsMapToString(A0.get(B0.concat("_third_note")));
            ((RobertoButton) _$_findCachedViewById(R.id.button2)).setText(UtilFunKt.paramsMapToString(A0.get(B0.concat("_btn_two_text"))));
            this.D = UtilFunKt.paramsMapToString(A0.get(B0.concat("_time_note")));
            if (A0.containsKey("s38_error")) {
                str = UtilFunKt.paramsMapToString(A0.get("s38_error"));
            } else if (A0.containsKey("s39_error")) {
                str = UtilFunKt.paramsMapToString(A0.get("s39_error"));
            } else {
                str = "Please enter some text to continue";
            }
            this.I = str;
            try {
                Calendar calendar2 = Calendar.getInstance();
                calendar2.setTime(this.f19163x.parse(UtilFunKt.paramsMapToString(A0.get(B0.concat("_time")))));
                calendar.set(11, calendar2.get(11));
                calendar.set(12, calendar2.get(12));
                calendar.set(13, 0);
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(str3, "exception", e10);
            }
            this.A = new ek.i(this, 3);
            ((ViewPager) _$_findCachedViewById(R.id.stepsViewPager)).setAdapter(this.A);
            ek.i iVar = this.A;
            if (iVar != null) {
                iVar.k();
            }
            ek.i iVar2 = this.A;
            kotlin.jvm.internal.i.d(iVar2);
            ((ViewPager) _$_findCachedViewById(R.id.stepsViewPager)).b(iVar2);
            ((ViewPager) _$_findCachedViewById(R.id.stepsViewPager)).setOnTouchListener(new w5.h0(15));
            try {
                if (J().J) {
                    if (kotlin.jvm.internal.i.b(B0, "s38") && J().F.containsKey("s38_text")) {
                        Object obj = J().F.get("s38_text");
                        kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type kotlin.String");
                        ((RobertoEditText) _$_findCachedViewById(R.id.llEditText)).setText((String) obj);
                    }
                    if (!kotlin.jvm.internal.i.b(B0, "s38")) {
                        if (kotlin.jvm.internal.i.b(B0, "s39")) {
                        }
                        str2 = "null cannot be cast to non-null type kotlin.String";
                        if (kotlin.jvm.internal.i.b(B0, "s39") && J().F.containsKey("s39_text")) {
                            Object obj2 = J().F.get("s39_text");
                            kotlin.jvm.internal.i.e(obj2, str2);
                            ((RobertoEditText) _$_findCachedViewById(R.id.llEditText)).setText((String) obj2);
                        }
                    }
                    if (J().F.containsKey("s38_time")) {
                        Calendar calendar3 = Calendar.getInstance();
                        Object obj3 = J().F.get("s38_time");
                        kotlin.jvm.internal.i.e(obj3, "null cannot be cast to non-null type kotlin.Long");
                        str2 = "null cannot be cast to non-null type kotlin.String";
                        calendar3.setTimeInMillis(1000 * ((Long) obj3).longValue());
                        calendar.set(11, calendar3.get(11));
                        calendar.set(12, calendar3.get(12));
                        calendar.set(13, 0);
                        if (kotlin.jvm.internal.i.b(B0, "s39")) {
                            Object obj22 = J().F.get("s39_text");
                            kotlin.jvm.internal.i.e(obj22, str2);
                            ((RobertoEditText) _$_findCachedViewById(R.id.llEditText)).setText((String) obj22);
                        }
                    }
                    str2 = "null cannot be cast to non-null type kotlin.String";
                    if (kotlin.jvm.internal.i.b(B0, "s39")) {
                    }
                }
            } catch (Exception e11) {
                LogHelper.INSTANCE.e(str3, "exception", e11);
            }
            O();
            ((RobertoButton) _$_findCachedViewById(R.id.button2)).setOnClickListener(new r7(this, 0));
            ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new r7(this, 1));
            ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setVisibility(0);
            ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setOnClickListener(new r7(this, 2));
            P();
            if (J().W && (templateModel = J().f10547y) != null && (label = templateModel.getLabel()) != null) {
                ((fm.a) this.J.getValue()).m(label, this.K);
            }
        } catch (Exception e12) {
            LogHelper.INSTANCE.e(str3, "exception in on view created", e12);
        }
    }
}
