package hr;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UtilFunKt;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: ScreenS92Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhr/s9;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class s9 extends rr.b {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ int f19179w = 0;

    /* renamed from: v  reason: collision with root package name */
    public final LinkedHashMap f19181v = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f19180u = LogHelper.INSTANCE.makeLogTag(s9.class);

    /* compiled from: ScreenS92Fragment.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.a<hs.k> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.x<Calendar> f19183v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(kotlin.jvm.internal.x<Calendar> xVar) {
            super(0);
            this.f19183v = xVar;
        }

        @Override // ss.a
        public final hs.k invoke() {
            ((RobertoTextView) s9.this._$_findCachedViewById(R.id.tvS92Time)).setText(new SimpleDateFormat("hh:mm a").format(this.f19183v.f23469u.getTime()));
            return hs.k.f19476a;
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
        if (kotlin.jvm.internal.i.b(((TemplateActivity) activity4).B0(), "s92")) {
            androidx.fragment.app.p activity5 = getActivity();
            kotlin.jvm.internal.i.e(activity5, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            ((TemplateActivity) activity5).s0(new w9());
        } else {
            androidx.fragment.app.p activity6 = getActivity();
            kotlin.jvm.internal.i.e(activity6, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            if (kotlin.jvm.internal.i.b(((TemplateActivity) activity6).B0(), "s92-d")) {
                ArrayList k10 = ca.a.k("Hu1zjaK518AGX6p1uNyw", "TVjSoqFdOrM0CE0YU1ja", "pIjSaq3mFoJJuwZZr1BW", "hFSM0DtKqmPlpmt7bTE4");
                androidx.fragment.app.p activity7 = getActivity();
                kotlin.jvm.internal.i.e(activity7, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                Goal y02 = ((TemplateActivity) activity7).y0();
                kotlin.jvm.internal.i.d(y02);
                if (is.u.Z1(k10, y02.getGoalId())) {
                    androidx.fragment.app.p activity8 = getActivity();
                    kotlin.jvm.internal.i.e(activity8, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                    ((TemplateActivity) activity8).I = true;
                }
                androidx.fragment.app.p activity9 = getActivity();
                kotlin.jvm.internal.i.e(activity9, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                ((TemplateActivity) activity9).s0(new k4());
            }
        }
        return false;
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f19181v;
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
        this.f19181v.clear();
    }

    /* JADX WARN: Type inference failed for: r13v9, types: [java.util.Calendar, T] */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.util.Calendar, T] */
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        try {
            if (Utils.INSTANCE.getClearingFragmentBackStack()) {
                return;
            }
            ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setVisibility(4);
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            TemplateActivity templateActivity = (TemplateActivity) activity;
            templateActivity.F.put("fromEdit", Boolean.FALSE);
            if (templateActivity.Q) {
                if (kotlin.jvm.internal.i.b(templateActivity.B0(), "s92")) {
                    templateActivity.s0(new w9());
                } else if (kotlin.jvm.internal.i.b(templateActivity.B0(), "s92-d")) {
                    templateActivity.s0(new k4());
                }
            }
            HashMap<String, Object> A0 = templateActivity.A0();
            String F0 = gv.n.F0(templateActivity.B0(), "-", "");
            if (kotlin.jvm.internal.i.b(templateActivity.B0(), "s92")) {
                ((RobertoTextView) _$_findCachedViewById(R.id.tvS92Header)).setText(UtilFunKt.paramsMapToString(A0.get("s92_heading")));
                ((RobertoTextView) _$_findCachedViewById(R.id.tvS92Description)).setText(UtilFunKt.paramsMapToString(A0.get("s92_description")));
                ((RobertoTextView) _$_findCachedViewById(R.id.tvS92Timelabel)).setText(UtilFunKt.paramsMapToString(A0.get("s92_time_label")));
                ((RobertoTextView) _$_findCachedViewById(R.id.tvS92Time)).setText(UtilFunKt.paramsMapToString(A0.get("s92_default_time")));
                ((RobertoButton) _$_findCachedViewById(R.id.btnS92Button)).setText(UtilFunKt.paramsMapToString(A0.get("s92_btn_text")));
            } else {
                ((RobertoTextView) _$_findCachedViewById(R.id.tvS92Header)).setText(UtilFunKt.paramsMapToString(A0.get("s92d_heading")));
                ((RobertoTextView) _$_findCachedViewById(R.id.tvS92Description)).setText(UtilFunKt.paramsMapToString(A0.get("s92d_description")));
                ((RobertoTextView) _$_findCachedViewById(R.id.tvS92Timelabel)).setText(UtilFunKt.paramsMapToString(A0.get("s92d_time_label")));
                ((RobertoTextView) _$_findCachedViewById(R.id.tvS92Time)).setText(UtilFunKt.paramsMapToString(A0.get("s92d_default_time")));
                ((RobertoButton) _$_findCachedViewById(R.id.btnS92Button)).setText(UtilFunKt.paramsMapToString(A0.get("s92d_btn_text")));
            }
            kotlin.jvm.internal.x xVar = new kotlin.jvm.internal.x();
            ?? calendar = Calendar.getInstance();
            xVar.f23469u = calendar;
            calendar.set(11, 22);
            ((Calendar) xVar.f23469u).set(12, 0);
            try {
                ((Calendar) xVar.f23469u).setTime(new SimpleDateFormat("hh:mm").parse(UtilFunKt.paramsMapToString(A0.get(F0.concat("_default_time")))));
            } catch (Exception e10) {
                LogHelper.INSTANCE.i(this.f19180u, "exception", e10);
            }
            if (templateActivity.J) {
                HashMap<String, Object> hashMap = templateActivity.F;
                if (hashMap.containsKey("s92_user_data")) {
                    Object obj = hashMap.get("s92_user_data");
                    kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type java.util.Calendar");
                    xVar.f23469u = (Calendar) obj;
                }
            }
            a aVar = new a(xVar);
            aVar.invoke();
            ((RobertoTextView) _$_findCachedViewById(R.id.tvS92Time)).setOnClickListener(new o4(18, this, xVar, aVar));
            ((RobertoButton) _$_findCachedViewById(R.id.btnS92Button)).setOnClickListener(new d9(templateActivity, 4, xVar));
            ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new d9(this, 5, templateActivity));
        } catch (Exception unused) {
        }
    }
}
