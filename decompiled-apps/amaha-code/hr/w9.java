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
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: ScreenS93Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhr/w9;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class w9 extends rr.b {

    /* renamed from: v  reason: collision with root package name */
    public static final /* synthetic */ int f19364v = 0;

    /* renamed from: u  reason: collision with root package name */
    public final LinkedHashMap f19365u = new LinkedHashMap();

    public w9() {
        LogHelper.INSTANCE.makeLogTag(w9.class);
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f19365u;
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
        return inflater.inflate(R.layout.fragment_screen_s93, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f19365u.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            if (Utils.INSTANCE.getClearingFragmentBackStack()) {
                return;
            }
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            TemplateActivity templateActivity = (TemplateActivity) activity;
            if (templateActivity.Q) {
                templateActivity.J0();
                return;
            }
            HashMap<String, Object> A0 = templateActivity.A0();
            ((RobertoButton) _$_findCachedViewById(R.id.btnS93ButtonOne)).setOnClickListener(new View.OnClickListener(this) { // from class: hr.v9

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ w9 f19304v;

                {
                    this.f19304v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i6 = r2;
                    w9 this$0 = this.f19304v;
                    switch (i6) {
                        case 0:
                            int i10 = w9.f19364v;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            androidx.fragment.app.p activity2 = this$0.getActivity();
                            kotlin.jvm.internal.i.d(activity2);
                            activity2.onBackPressed();
                            return;
                        default:
                            int i11 = w9.f19364v;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            androidx.fragment.app.p activity3 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                            ((TemplateActivity) activity3).t0();
                            return;
                    }
                }
            });
            ((RobertoButton) _$_findCachedViewById(R.id.btnS93ButtonTwo)).setOnClickListener(new View.OnClickListener(this) { // from class: hr.v9

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ w9 f19304v;

                {
                    this.f19304v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i6 = r2;
                    w9 this$0 = this.f19304v;
                    switch (i6) {
                        case 0:
                            int i10 = w9.f19364v;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            androidx.fragment.app.p activity2 = this$0.getActivity();
                            kotlin.jvm.internal.i.d(activity2);
                            activity2.onBackPressed();
                            return;
                        default:
                            int i11 = w9.f19364v;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            androidx.fragment.app.p activity3 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                            ((TemplateActivity) activity3).t0();
                            return;
                    }
                }
            });
            ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setVisibility(8);
            ((RobertoTextView) _$_findCachedViewById(R.id.tvS93Header)).setText(UtilFunKt.paramsMapToString(A0.get("s93_heading")));
            ((RobertoTextView) _$_findCachedViewById(R.id.tvS93StmtOne)).setText(UtilFunKt.paramsMapToString(A0.get("s93_statement_one")));
            ((RobertoTextView) _$_findCachedViewById(R.id.tvS93StmtTwo)).setText(UtilFunKt.paramsMapToString(A0.get("s93_statement_two")));
            ((RobertoButton) _$_findCachedViewById(R.id.btnS93ButtonOne)).setText(UtilFunKt.paramsMapToString(A0.get("s93_btn_one_text")));
            ((RobertoButton) _$_findCachedViewById(R.id.btnS93ButtonTwo)).setText(UtilFunKt.paramsMapToString(A0.get("s93_btn_two_text")));
            androidx.fragment.app.p activity2 = getActivity();
            kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            Object obj = ((TemplateActivity) activity2).F.get("calendar");
            kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type java.util.Calendar");
            Calendar calendar = (Calendar) obj;
            Calendar calendar2 = Calendar.getInstance();
            calendar2.setTimeInMillis(calendar.getTimeInMillis());
            calendar2.add(11, -1);
            ((RobertoTextView) _$_findCachedViewById(R.id.textView18)).setText(new SimpleDateFormat("hh:mm a").format(calendar.getTime()));
            ((RobertoTextView) _$_findCachedViewById(R.id.textView24)).setText(new SimpleDateFormat("hh:mm a").format(calendar2.getTime()));
            ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new b8(templateActivity, 13));
        } catch (Exception unused) {
        }
    }
}
