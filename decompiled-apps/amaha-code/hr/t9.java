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
import java.util.Calendar;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: ScreenS92bFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhr/t9;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class t9 extends rr.b {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ int f19215w = 0;

    /* renamed from: v  reason: collision with root package name */
    public final LinkedHashMap f19217v = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f19216u = LogHelper.INSTANCE.makeLogTag(t9.class);

    /* compiled from: ScreenS92bFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.a<Boolean> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.x<Calendar> f19219v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(kotlin.jvm.internal.x<Calendar> xVar) {
            super(0);
            this.f19219v = xVar;
        }

        @Override // ss.a
        public final Boolean invoke() {
            t9 t9Var = t9.this;
            return Boolean.valueOf(((RobertoTextView) t9Var._$_findCachedViewById(R.id.tvS92Time)).post(new nn.f(t9Var, 11, this.f19219v)));
        }
    }

    @Override // rr.b
    public final boolean I() {
        androidx.fragment.app.p activity = getActivity();
        kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
        if (!((TemplateActivity) activity).getIntent().hasExtra("source")) {
            return true;
        }
        androidx.fragment.app.p activity2 = getActivity();
        kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
        if (!r1.b0.c((TemplateActivity) activity2, "source", "goals")) {
            return true;
        }
        androidx.fragment.app.p activity3 = getActivity();
        kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
        ((TemplateActivity) activity3).Q = true;
        androidx.fragment.app.p activity4 = getActivity();
        kotlin.jvm.internal.i.e(activity4, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
        ((TemplateActivity) activity4).s0(new u9());
        return false;
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f19217v;
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
        return inflater.inflate(R.layout.fragment_screen_s92, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f19217v.clear();
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.util.Calendar, T] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.util.Calendar, T] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.util.Calendar, T] */
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            TemplateActivity templateActivity = (TemplateActivity) activity;
            if (Utils.INSTANCE.getClearingFragmentBackStack()) {
                return;
            }
            androidx.fragment.app.p activity2 = getActivity();
            kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            if (((TemplateActivity) activity2).Q) {
                templateActivity.s0(new u9());
                return;
            }
            ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setVisibility(4);
            HashMap<String, Object> A0 = templateActivity.A0();
            ((RobertoTextView) _$_findCachedViewById(R.id.tvS92Header)).setText(UtilFunKt.paramsMapToString(A0.get("s92b_heading_list")));
            ((RobertoTextView) _$_findCachedViewById(R.id.tvS92Description)).setText(UtilFunKt.paramsMapToString(A0.get("s92b_description")));
            ((RobertoTextView) _$_findCachedViewById(R.id.tvS92Timelabel)).setText(UtilFunKt.paramsMapToString(A0.get("s92b_time_label")));
            ((RobertoTextView) _$_findCachedViewById(R.id.tvS92Time)).setText(UtilFunKt.paramsMapToString(A0.get("s92b_default_time")));
            ((RobertoButton) _$_findCachedViewById(R.id.btnS92Button)).setText(UtilFunKt.paramsMapToString(A0.get("s92b_btn_text")));
            kotlin.jvm.internal.x xVar = new kotlin.jvm.internal.x();
            ?? calendar = Calendar.getInstance();
            xVar.f23469u = calendar;
            calendar.set(11, 22);
            ((Calendar) xVar.f23469u).set(12, 0);
            a aVar = new a(xVar);
            if (templateActivity.J) {
                HashMap<String, Object> hashMap = templateActivity.F;
                if (hashMap.containsKey("s92b_user_data")) {
                    Object obj = hashMap.get("s92b_user_data");
                    kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type java.util.Calendar");
                    xVar.f23469u = (Calendar) obj;
                } else if (hashMap.containsKey("sleep_time") && templateActivity.getIntent().hasExtra("source") && kotlin.jvm.internal.i.b(templateActivity.getIntent().getStringExtra("source"), "goals")) {
                    Object obj2 = hashMap.get("sleep_time");
                    kotlin.jvm.internal.i.e(obj2, "null cannot be cast to non-null type java.util.Calendar");
                    xVar.f23469u = (Calendar) obj2;
                }
            }
            aVar.invoke();
            ((RobertoTextView) _$_findCachedViewById(R.id.tvS92Time)).setOnClickListener(new o4(19, this, xVar, aVar));
            ((RobertoButton) _$_findCachedViewById(R.id.btnS92Button)).setOnClickListener(new o4(xVar, templateActivity, this, 20));
            ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new d9(this, 6, templateActivity));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f19216u, "Exception", e10);
        }
    }
}
