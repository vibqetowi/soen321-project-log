package hr;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UtilFunKt;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.Calendar;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
/* compiled from: ScreenS106Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhr/j4;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class j4 extends rr.b {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ int f18616w = 0;

    /* renamed from: v  reason: collision with root package name */
    public final LinkedHashMap f18618v = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f18617u = LogHelper.INSTANCE.makeLogTag(j4.class);

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f18618v;
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
        return inflater.inflate(R.layout.fragment_screen_s106, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f18618v.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z10;
        double d10;
        String paramsMapToString;
        String str;
        rr.b f2Var;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            HashMap<String, Object> A0 = ((TemplateActivity) activity).A0();
            androidx.fragment.app.p activity2 = getActivity();
            kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            TemplateActivity templateActivity = (TemplateActivity) activity2;
            androidx.fragment.app.p activity3 = getActivity();
            kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            if (((TemplateActivity) activity3).Q) {
                androidx.fragment.app.p activity4 = getActivity();
                kotlin.jvm.internal.i.e(activity4, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                if (((TemplateActivity) activity4).W) {
                    f2Var = new h2();
                } else {
                    f2Var = new f2();
                }
                templateActivity.s0(f2Var);
                return;
            }
            ((RobertoTextView) _$_findCachedViewById(R.id.tvS106Header)).setText(UtilFunKt.paramsMapToString(A0.get("s106_heading")));
            ((RobertoTextView) _$_findCachedViewById(R.id.tvS106StmtOne)).setText(UtilFunKt.paramsMapToString(A0.get("s106_label_one")));
            ((RobertoTextView) _$_findCachedViewById(R.id.tvS106StmtTwo)).setText(UtilFunKt.paramsMapToString(A0.get("s106_label_two")));
            ((RobertoButton) _$_findCachedViewById(R.id.btnS106ButtonOne)).setText(UtilFunKt.paramsMapToString(A0.get("s106_btn_one_text")));
            ((RobertoButton) _$_findCachedViewById(R.id.btnS106ButtonTwo)).setText(UtilFunKt.paramsMapToString(A0.get("s106_btn_two_text")));
            Object obj = templateActivity.F.get("age");
            kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type kotlin.String");
            int parseInt = Integer.parseInt((String) obj);
            HashMap<String, Object> hashMap = templateActivity.F;
            Object obj2 = hashMap.get("sleep_time");
            kotlin.jvm.internal.i.e(obj2, "null cannot be cast to non-null type java.util.Calendar");
            Calendar calendar = (Calendar) obj2;
            Object obj3 = hashMap.get("wake_up_time");
            kotlin.jvm.internal.i.e(obj3, "null cannot be cast to non-null type java.util.Calendar");
            Calendar calendar2 = (Calendar) obj3;
            Calendar calendar3 = Calendar.getInstance();
            calendar3.set(11, calendar.get(11));
            calendar3.set(12, calendar.get(12));
            Calendar calendar4 = Calendar.getInstance();
            calendar4.set(11, calendar2.get(11));
            calendar4.set(12, calendar2.get(12));
            if (calendar4.getTimeInMillis() < calendar3.getTimeInMillis()) {
                calendar4.add(5, 1);
            }
            double convert = TimeUnit.MINUTES.convert(calendar4.getTimeInMillis() - calendar3.getTimeInMillis(), TimeUnit.MILLISECONDS) / 60.0d;
            double d11 = 2;
            double rint = Math.rint(convert * d11) / d11;
            int hours = UtilFunKt.getHours(parseInt);
            if (rint == convert) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                ((RobertoTextView) _$_findCachedViewById(R.id.textView24)).setText("~" + rint + " hours");
            } else {
                ((RobertoTextView) _$_findCachedViewById(R.id.textView24)).setText(rint + " hours");
            }
            ((RobertoTextView) _$_findCachedViewById(R.id.textView18)).setText(hours + " hours");
            RobertoTextView robertoTextView = (RobertoTextView) _$_findCachedViewById(R.id.tvS106StmtThree);
            double d12 = rint - ((double) hours);
            int i6 = (d12 > 0.0d ? 1 : (d12 == 0.0d ? 0 : -1));
            if (i6 > 0) {
                paramsMapToString = UtilFunKt.paramsMapToString(A0.get("s106_label_three_decrease_sleep"));
            } else if (d12 < 0.0d) {
                paramsMapToString = UtilFunKt.paramsMapToString(A0.get("s106_label_three_increase_sleep"));
            } else {
                paramsMapToString = UtilFunKt.paramsMapToString(A0.get("s106_label_three_maintain_sleep"));
            }
            robertoTextView.setText(paramsMapToString);
            RobertoTextView robertoTextView2 = (RobertoTextView) _$_findCachedViewById(R.id.textView17);
            if (i6 > 0) {
                str = d12 + " hour(s)";
            } else if (d12 < 0.0d) {
                str = (d10 - rint) + " hour(s)";
            } else {
                str = "";
            }
            robertoTextView2.setText(str);
            ((RobertoButton) _$_findCachedViewById(R.id.btnS106ButtonOne)).setOnClickListener(new i4(templateActivity, 0));
            ((RobertoButton) _$_findCachedViewById(R.id.btnS106ButtonTwo)).setOnClickListener(new z0(this, 12));
            ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new i4(templateActivity, 1));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f18617u, "exception", e10);
        }
    }
}
