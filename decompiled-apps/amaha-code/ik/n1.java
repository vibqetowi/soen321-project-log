package ik;

import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: InitialAssessmentSeparatorFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lik/n1;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class n1 extends rr.b {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ int f20255w = 0;

    /* renamed from: v  reason: collision with root package name */
    public final LinkedHashMap f20257v = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f20256u = LogHelper.INSTANCE.makeLogTag(n1.class);

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f20257v;
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
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.g(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_initial_assessment_separator, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f20257v.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            Bundle arguments = getArguments();
            kotlin.jvm.internal.i.d(arguments);
            int i6 = arguments.getInt("index");
            Bundle arguments2 = getArguments();
            kotlin.jvm.internal.i.d(arguments2);
            int i10 = arguments2.getInt(Constants.SCREEN_PROGRESS);
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
            ((RobertoTextView) _$_findCachedViewById(R.id.separatorTitle)).setText(((InitialAssessmentActivity) activity).f10606z.get(i10).get(i6).getTitle());
            androidx.fragment.app.p activity2 = getActivity();
            kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
            ((RobertoTextView) _$_findCachedViewById(R.id.separatorSubtitle)).setText(((InitialAssessmentActivity) activity2).f10606z.get(i10).get(i6).getSubtitle());
            Bundle bundle2 = new Bundle();
            bundle2.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
            androidx.fragment.app.p activity3 = getActivity();
            kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
            int i11 = ((InitialAssessmentActivity) activity3).K;
            if (i11 != 0) {
                if (i11 != 1) {
                    bundle2.putInt("day", 28);
                } else {
                    bundle2.putInt("day", 15);
                }
            } else {
                bundle2.putInt("day", 0);
            }
            bundle2.putString("variant", (String) FirebasePersistence.getInstance().getUser().getAppConfig().get(Constants.ONBOARDING_EXPERIMENT));
            bundle2.putString("version", FirebasePersistence.getInstance().getUser().getVersion());
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        gk.a.b(bundle2, "global_assessment_start");
                        ((AppCompatImageView) _$_findCachedViewById(R.id.assessmentImage)).setImageResource(R.drawable.ic_assessment_global);
                    }
                } else {
                    gk.a.b(bundle2, "symptom_assessment_start");
                    ((AppCompatImageView) _$_findCachedViewById(R.id.assessmentImage)).setImageResource(R.drawable.ic_assessment_symptom);
                }
            } else {
                gk.a.b(bundle2, "health_assessment_start");
                ((AppCompatImageView) _$_findCachedViewById(R.id.assessmentImage)).setImageResource(R.drawable.ic_assessment_health);
            }
            new Handler().postDelayed(new je.o(23, this), 600L);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f20256u, e10);
        }
    }
}
