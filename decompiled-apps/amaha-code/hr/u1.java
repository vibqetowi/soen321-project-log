package hr;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.model.ScreenResult22Model;
import com.theinnerhour.b2b.model.TaskIn2Min;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UtilFunKt;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: ScreenResult22Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhr/u1;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class u1 extends rr.b {

    /* renamed from: x  reason: collision with root package name */
    public static final /* synthetic */ int f19230x = 0;

    /* renamed from: w  reason: collision with root package name */
    public final LinkedHashMap f19233w = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f19231u = LogHelper.INSTANCE.makeLogTag(u1.class);

    /* renamed from: v  reason: collision with root package name */
    public String f19232v = "";

    public final void J(ScreenResult22Model screenResult22Model, String str) {
        ((LinearLayout) _$_findCachedViewById(R.id.linearLayout)).removeAllViews();
        Iterator<TaskIn2Min> it = screenResult22Model.getItems().iterator();
        int i6 = 0;
        while (it.hasNext()) {
            TaskIn2Min next = it.next();
            if (kotlin.jvm.internal.i.b(str, "r22")) {
                if (next.getIn2Min()) {
                    i6++;
                    androidx.fragment.app.p activity = getActivity();
                    kotlin.jvm.internal.i.d(activity);
                    View inflate = activity.getLayoutInflater().inflate(R.layout.row_vertical_2_textview, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.linearLayout)), false);
                    kotlin.jvm.internal.i.e(inflate, "null cannot be cast to non-null type android.widget.LinearLayout");
                    LinearLayout linearLayout = (LinearLayout) inflate;
                    ((RobertoTextView) linearLayout.findViewById(R.id.text1)).setText(this.f19232v + ' ' + i6);
                    ((RobertoTextView) linearLayout.findViewById(R.id.text2)).setText(next.getText());
                    ((LinearLayout) _$_findCachedViewById(R.id.linearLayout)).addView(linearLayout);
                }
            } else if (kotlin.jvm.internal.i.b(str, "r22-b") && !next.getIn2Min()) {
                i6++;
                androidx.fragment.app.p activity2 = getActivity();
                kotlin.jvm.internal.i.d(activity2);
                View inflate2 = activity2.getLayoutInflater().inflate(R.layout.row_vertical_2_textview, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.linearLayout)), false);
                kotlin.jvm.internal.i.e(inflate2, "null cannot be cast to non-null type android.widget.LinearLayout");
                LinearLayout linearLayout2 = (LinearLayout) inflate2;
                ((RobertoTextView) linearLayout2.findViewById(R.id.text1)).setText(this.f19232v + ' ' + i6);
                ((RobertoTextView) linearLayout2.findViewById(R.id.text2)).setText(next.getText());
                ((LinearLayout) _$_findCachedViewById(R.id.linearLayout)).addView(linearLayout2);
            }
        }
        androidx.fragment.app.p activity3 = getActivity();
        kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
        TemplateActivity templateActivity = (TemplateActivity) activity3;
        if (i6 == 0) {
            if (templateActivity.J) {
                templateActivity.onBackPressed();
            } else {
                ((RobertoButton) _$_findCachedViewById(R.id.button1)).performClick();
            }
        }
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f19233w;
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
        return inflater.inflate(R.layout.fragment_screen_result_22, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f19233w.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            TemplateActivity templateActivity = (TemplateActivity) activity;
            HashMap<String, Object> A0 = templateActivity.A0();
            String B0 = templateActivity.B0();
            Object obj = templateActivity.F.get("result_22");
            kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type com.theinnerhour.b2b.model.ScreenResult22Model");
            ScreenResult22Model screenResult22Model = (ScreenResult22Model) obj;
            this.f19232v = UtilFunKt.paramsMapToString(A0.get("r22_statement_prefix"));
            screenResult22Model.setPrefix(UtilFunKt.paramsMapToString(A0.get("r22_statement_prefix")));
            if (kotlin.jvm.internal.i.b(B0, "r22")) {
                ((RobertoTextView) _$_findCachedViewById(R.id.textView1)).setText(UtilFunKt.paramsMapToString(A0.get("r22_heading")));
                screenResult22Model.setTitle1(UtilFunKt.paramsMapToString(A0.get("r22_heading")));
                ((RobertoTextView) _$_findCachedViewById(R.id.tvRememberLabel)).setText(UtilFunKt.paramsMapToString(A0.get("r22_remember_text")));
                screenResult22Model.setRememberLabel(UtilFunKt.paramsMapToString(A0.get("r22_remember_text")));
                ((RobertoTextView) _$_findCachedViewById(R.id.tvRemember)).setText(UtilFunKt.paramsMapToString(A0.get("r22_remember_description")));
                screenResult22Model.setRememberText1(UtilFunKt.paramsMapToString(A0.get("r22_remember_description")));
                ((RobertoButton) _$_findCachedViewById(R.id.button1)).setText(UtilFunKt.paramsMapToString(A0.get("r22_btn_two_text")));
            } else if (kotlin.jvm.internal.i.b(B0, "r22-b")) {
                ((RobertoTextView) _$_findCachedViewById(R.id.textView1)).setText(UtilFunKt.paramsMapToString(A0.get("r22b_heading")));
                screenResult22Model.setTitle2(UtilFunKt.paramsMapToString(A0.get("r22b_heading")));
                ((RobertoTextView) _$_findCachedViewById(R.id.tvRememberLabel)).setText(UtilFunKt.paramsMapToString(A0.get("r22b_remember_text")));
                screenResult22Model.setRememberLabel(UtilFunKt.paramsMapToString(A0.get("r22b_remember_text")));
                ((RobertoTextView) _$_findCachedViewById(R.id.tvRemember)).setText(UtilFunKt.paramsMapToString(A0.get("r22b_remember_description")));
                screenResult22Model.setRememberText2(UtilFunKt.paramsMapToString(A0.get("r22b_remember_description")));
                ((RobertoButton) _$_findCachedViewById(R.id.button1)).setText(UtilFunKt.paramsMapToString(A0.get("r22b_btn_two_text")));
            }
            ((RobertoButton) _$_findCachedViewById(R.id.button1)).setOnClickListener(new ek.p(B0, this, templateActivity, "result_22", screenResult22Model, 6));
            J(screenResult22Model, B0);
            ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new c0(templateActivity, 11));
            ((ImageView) _$_findCachedViewById(R.id.ivHelp)).setVisibility(8);
            ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setVisibility(0);
            ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setOnClickListener(new z0(this, 5));
            ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new c0(templateActivity, 12));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f19231u, "exception in on view created", e10);
        }
    }
}
