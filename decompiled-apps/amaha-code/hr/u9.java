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
import kotlin.Metadata;
/* compiled from: ScreenS92cFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhr/u9;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class u9 extends rr.b {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ int f19255w = 0;

    /* renamed from: v  reason: collision with root package name */
    public final LinkedHashMap f19257v = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f19256u = LogHelper.INSTANCE.makeLogTag(u9.class);

    /* compiled from: ScreenS92cFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.a<Boolean> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.x<Calendar> f19259v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(kotlin.jvm.internal.x<Calendar> xVar) {
            super(0);
            this.f19259v = xVar;
        }

        @Override // ss.a
        public final Boolean invoke() {
            u9 u9Var = u9.this;
            return Boolean.valueOf(((RobertoTextView) u9Var._$_findCachedViewById(R.id.tvS92Time)).post(new nn.f(u9Var, 12, this.f19259v)));
        }
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f19257v;
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
        this.f19257v.clear();
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [java.util.Calendar, T] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.util.Calendar, T] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.Calendar, T] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.Calendar, T] */
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setVisibility(4);
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            TemplateActivity templateActivity = (TemplateActivity) activity;
            androidx.fragment.app.p activity2 = getActivity();
            kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            if (((TemplateActivity) activity2).Q) {
                templateActivity.s0(new ba());
                return;
            }
            HashMap<String, Object> A0 = templateActivity.A0();
            ((RobertoTextView) _$_findCachedViewById(R.id.tvS92Header)).setText(UtilFunKt.paramsMapToString(A0.get("s92c_heading")));
            ((RobertoTextView) _$_findCachedViewById(R.id.tvS92Description)).setText(UtilFunKt.paramsMapToString(A0.get("s92c_description")));
            ((RobertoTextView) _$_findCachedViewById(R.id.tvS92Timelabel)).setText(UtilFunKt.paramsMapToString(A0.get("s92c_time_label")));
            ((RobertoTextView) _$_findCachedViewById(R.id.tvS92Time)).setText(UtilFunKt.paramsMapToString(A0.get("s92c_default_time")));
            ((RobertoButton) _$_findCachedViewById(R.id.btnS92Button)).setText(UtilFunKt.paramsMapToString(A0.get("s92c_btn_text")));
            kotlin.jvm.internal.x xVar = new kotlin.jvm.internal.x();
            ?? calendar = Calendar.getInstance();
            xVar.f23469u = calendar;
            calendar.set(11, 6);
            ((Calendar) xVar.f23469u).set(12, 0);
            a aVar = new a(xVar);
            boolean b10 = kotlin.jvm.internal.i.b(templateActivity.B0(), "s92-b");
            HashMap<String, Object> hashMap = templateActivity.F;
            if (b10) {
                if (hashMap.containsKey("s92c_user_data")) {
                    Object obj = hashMap.get("s92c_user_data");
                    kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type java.util.Calendar");
                    xVar.f23469u = (Calendar) obj;
                } else if (hashMap.containsKey("wake_up_time") && templateActivity.getIntent().hasExtra("source") && kotlin.jvm.internal.i.b(templateActivity.getIntent().getStringExtra("source"), "goals")) {
                    Object obj2 = hashMap.get("wake_up_time");
                    kotlin.jvm.internal.i.e(obj2, "null cannot be cast to non-null type java.util.Calendar");
                    xVar.f23469u = (Calendar) obj2;
                }
            } else if (templateActivity.J && hashMap.containsKey("s92c_user_data")) {
                Object obj3 = hashMap.get("s92c_user_data");
                kotlin.jvm.internal.i.e(obj3, "null cannot be cast to non-null type java.util.Calendar");
                xVar.f23469u = (Calendar) obj3;
            }
            aVar.invoke();
            ((RobertoTextView) _$_findCachedViewById(R.id.tvS92Time)).setOnClickListener(new o4(21, this, xVar, aVar));
            ((RobertoButton) _$_findCachedViewById(R.id.btnS92Button)).setOnClickListener(new o4(xVar, templateActivity, this, 22));
            ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new b8(templateActivity, 12));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f19256u, "Exception", e10);
        }
    }
}
