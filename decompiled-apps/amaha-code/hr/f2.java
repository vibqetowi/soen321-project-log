package hr;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.model.ScreenResult26Model;
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
/* compiled from: ScreenResult26Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhr/f2;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class f2 extends rr.b {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ int f18362w = 0;

    /* renamed from: v  reason: collision with root package name */
    public final LinkedHashMap f18364v = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f18363u = LogHelper.INSTANCE.makeLogTag(f2.class);

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
        LinkedHashMap linkedHashMap = this.f18364v;
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
        super.onDestroyView();
        this.f18364v.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0, types: [com.theinnerhour.b2b.model.ScreenResult26Model, T] */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v16, types: [com.theinnerhour.b2b.model.ScreenResult26Model, T] */
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        TemplateActivity templateActivity;
        HashMap<String, Object> A0;
        String paramsMapToString;
        Goal y02;
        kotlin.jvm.internal.u uVar;
        SimpleDateFormat simpleDateFormat;
        kotlin.jvm.internal.x xVar;
        Calendar calendar;
        Calendar calendar2;
        ?? r15;
        TemplateActivity templateActivity2;
        String str2;
        String paramsMapToString2;
        String str3 = this.f18363u;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            templateActivity = (TemplateActivity) activity;
            templateActivity.Q = false;
            A0 = templateActivity.A0();
            androidx.fragment.app.p activity2 = getActivity();
            kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            if (((TemplateActivity) activity2).getIntent().hasExtra("source") && kotlin.jvm.internal.i.b(templateActivity.getIntent().getStringExtra("source"), "goals")) {
                ((ImageView) _$_findCachedViewById(R.id.ivClose)).setImageResource(R.drawable.ic_wrong);
            }
            ((RobertoTextView) _$_findCachedViewById(R.id.tvR26Title)).setText(UtilFunKt.paramsMapToString(A0.get("r26_title")));
            ((RobertoTextView) _$_findCachedViewById(R.id.tvR26Heading)).setText(UtilFunKt.paramsMapToString(A0.get("r26_heading")));
            ((RobertoTextView) _$_findCachedViewById(R.id.tvR26Desc)).setText(UtilFunKt.paramsMapToString(A0.get("r26_description")));
            ((RobertoButton) _$_findCachedViewById(R.id.btnR26ButtonOne)).setText(UtilFunKt.paramsMapToString(A0.get("r26_btn_one_text1")));
            RobertoButton robertoButton = (RobertoButton) _$_findCachedViewById(R.id.btnR26ButtonTwo);
            if (templateActivity.getIntent().hasExtra("source") && kotlin.jvm.internal.i.b(templateActivity.getIntent().getStringExtra("source"), "goals")) {
                paramsMapToString = "DONE";
            } else {
                paramsMapToString = UtilFunKt.paramsMapToString(A0.get("r26_btn_two_text"));
            }
            robertoButton.setText(paramsMapToString);
            y02 = templateActivity.y0();
            uVar = new kotlin.jvm.internal.u();
            simpleDateFormat = new SimpleDateFormat("hh:mm a");
            xVar = new kotlin.jvm.internal.x();
            xVar.f23469u = new ScreenResult26Model(Utils.INSTANCE.getTimeInSeconds());
            calendar = Calendar.getInstance();
            calendar2 = Calendar.getInstance();
            try {
                r15 = templateActivity.J;
                try {
                } catch (Exception e10) {
                    e = e10;
                    try {
                        str = r15;
                    } catch (Exception e11) {
                        e = e11;
                        str = r15;
                    }
                    try {
                        LogHelper.INSTANCE.e(str, "exception in reading list from firebase", e);
                        ((RobertoTextView) _$_findCachedViewById(R.id.result1)).setText(((ScreenResult26Model) xVar.f23469u).getText());
                        ((RobertoButton) _$_findCachedViewById(R.id.btnR26ButtonTwo)).setOnClickListener(new wm.a(y02, uVar, xVar, this, templateActivity2));
                        ((RobertoButton) _$_findCachedViewById(R.id.btnR26ButtonOne)).setOnClickListener(new z0(this, 6));
                        ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new c0(templateActivity2, 15));
                        return;
                    } catch (Exception e12) {
                        e = e12;
                        LogHelper.INSTANCE.e(str, "exception", e);
                        return;
                    }
                }
            } catch (Exception e13) {
                e = e13;
                r15 = str3;
                templateActivity2 = templateActivity;
            }
        } catch (Exception e14) {
            e = e14;
            str = str3;
        }
        try {
            if (r15 == 0 && !templateActivity.I) {
                uVar.f23466u = true;
                HashMap<String, Object> hashMap = templateActivity.F;
                Object obj = hashMap.get("sleep_time");
                kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type java.util.Calendar");
                Calendar calendar3 = (Calendar) obj;
                Object obj2 = hashMap.get("wake_up_time");
                kotlin.jvm.internal.i.e(obj2, "null cannot be cast to non-null type java.util.Calendar");
                Calendar calendar4 = (Calendar) obj2;
                Object obj3 = hashMap.get("age");
                kotlin.jvm.internal.i.e(obj3, "null cannot be cast to non-null type kotlin.String");
                int parseInt = Integer.parseInt((String) obj3);
                int hours = UtilFunKt.getHours(parseInt);
                if (calendar4.getTimeInMillis() < calendar3.getTimeInMillis()) {
                    calendar4.add(5, 1);
                }
                str2 = str3;
                templateActivity2 = templateActivity;
                double d10 = 2;
                double rint = Math.rint((TimeUnit.MINUTES.convert(calendar4.getTimeInMillis() - calendar3.getTimeInMillis(), TimeUnit.MILLISECONDS) / 60.0d) * d10) / d10;
                ((ScreenResult26Model) xVar.f23469u).setAge(Integer.valueOf(parseInt));
                ((ScreenResult26Model) xVar.f23469u).setSleepTime(simpleDateFormat.format(calendar3.getTime()));
                ((ScreenResult26Model) xVar.f23469u).setWakeUpTime(simpleDateFormat.format(calendar4.getTime()));
                ScreenResult26Model screenResult26Model = (ScreenResult26Model) xVar.f23469u;
                double d11 = hours;
                double d12 = rint - d11;
                if (d12 > 0.0d) {
                    paramsMapToString2 = gv.n.F0(UtilFunKt.paramsMapToString(A0.get("r26_decrease_sleep_text")), "%replace_time%", String.valueOf(d12));
                } else if (d12 < 0.0d) {
                    paramsMapToString2 = gv.n.F0(UtilFunKt.paramsMapToString(A0.get("r26_increase_sleep_text")), "%replace_time%", String.valueOf(d11 - rint));
                } else {
                    paramsMapToString2 = UtilFunKt.paramsMapToString(A0.get("r26_maintain_sleep_text"));
                }
                screenResult26Model.setText(paramsMapToString2);
                str = str2;
                ((RobertoTextView) _$_findCachedViewById(R.id.result1)).setText(((ScreenResult26Model) xVar.f23469u).getText());
                ((RobertoButton) _$_findCachedViewById(R.id.btnR26ButtonTwo)).setOnClickListener(new wm.a(y02, uVar, xVar, this, templateActivity2));
                ((RobertoButton) _$_findCachedViewById(R.id.btnR26ButtonOne)).setOnClickListener(new z0(this, 6));
                ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new c0(templateActivity2, 15));
                return;
            }
            ((RobertoTextView) _$_findCachedViewById(R.id.result1)).setText(((ScreenResult26Model) xVar.f23469u).getText());
            ((RobertoButton) _$_findCachedViewById(R.id.btnR26ButtonTwo)).setOnClickListener(new wm.a(y02, uVar, xVar, this, templateActivity2));
            ((RobertoButton) _$_findCachedViewById(R.id.btnR26ButtonOne)).setOnClickListener(new z0(this, 6));
            ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new c0(templateActivity2, 15));
            return;
        } catch (Exception e15) {
            e = e15;
            LogHelper.INSTANCE.e(str, "exception", e);
            return;
        }
        str2 = str3;
        templateActivity2 = templateActivity;
        uVar.f23466u = false;
        androidx.fragment.app.p activity3 = getActivity();
        kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
        TemplateActivity templateActivity3 = (TemplateActivity) activity3;
        if (y02 != null && y02.getData().containsKey("result_26")) {
            ?? result26MapToObject = UtilFunKt.result26MapToObject(y02.getData().get("result_26"));
            xVar.f23469u = result26MapToObject;
            calendar.setTimeInMillis(simpleDateFormat.parse(result26MapToObject.getSleepTime()).getTime());
            calendar2.setTimeInMillis(simpleDateFormat.parse(((ScreenResult26Model) xVar.f23469u).getWakeUpTime()).getTime());
            templateActivity3.F.put("sleep_time", calendar);
            HashMap<String, Object> hashMap2 = templateActivity3.F;
            hashMap2.put("wake_up_time", calendar2);
            hashMap2.put("age", String.valueOf(((ScreenResult26Model) xVar.f23469u).getAge()));
        }
        str = str2;
    }
}
