package nq;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.DepressionPleasurableActivity;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: DepressionPleasurableFeedbackFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lnq/u;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class u extends rr.b {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ int f26764w = 0;

    /* renamed from: v  reason: collision with root package name */
    public final LinkedHashMap f26766v = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f26765u = LogHelper.INSTANCE.makeLogTag(u.class);

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f26766v;
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
        return inflater.inflate(R.layout.fragment_screen_afeedback, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f26766v.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            ((RobertoTextView) _$_findCachedViewById(R.id.feedbackHeader)).setText(getString(R.string.depressionPleasurableFeedbackHeader));
            ((RobertoTextView) _$_findCachedViewById(R.id.feedbackSubheader)).setText(getString(R.string.depressionPleasurableFeedbackSubheader));
            ((RobertoButton) _$_findCachedViewById(R.id.feedbackYesCTA)).setText(getString(R.string.depressionPleasurableFeedbackYes));
            final Bundle bundle2 = new Bundle();
            bundle2.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
            bundle2.putString(Constants.API_COURSE_LINK, Constants.DAILY_ACTIVITY_GOAL_ID_DEPRESSION_PLEASURABLE_NEW);
            bundle2.putString("day", "1");
            bundle2.putBoolean("isNewActivities", true);
            bundle2.putString("version", FirebasePersistence.getInstance().getUser().getVersion());
            ((RobertoButton) _$_findCachedViewById(R.id.feedbackYesCTA)).setOnClickListener(new View.OnClickListener() { // from class: nq.t
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i6 = r3;
                    u this$0 = this;
                    Bundle analyticsBundle = bundle2;
                    switch (i6) {
                        case 0:
                            int i10 = u.f26764w;
                            kotlin.jvm.internal.i.g(analyticsBundle, "$analyticsBundle");
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            gk.a.b(analyticsBundle, "s32_yes_click");
                            Context context = this$0.getContext();
                            kotlin.jvm.internal.i.d(context);
                            Toast.makeText(context, this$0.getString(R.string.depressionThoughtsFeedbackYesToast), 1).show();
                            androidx.fragment.app.p activity = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionPleasurableActivity");
                            ((DepressionPleasurableActivity) activity).t0();
                            return;
                        default:
                            int i11 = u.f26764w;
                            kotlin.jvm.internal.i.g(analyticsBundle, "$analyticsBundle");
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            gk.a.b(analyticsBundle, "s32_no_click");
                            Context context2 = this$0.getContext();
                            kotlin.jvm.internal.i.d(context2);
                            Toast.makeText(context2, this$0.getString(R.string.depressionThoughtsFeedbackNOToast), 1).show();
                            androidx.fragment.app.p activity2 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionPleasurableActivity");
                            ((DepressionPleasurableActivity) activity2).t0();
                            return;
                    }
                }
            });
            ((RobertoButton) _$_findCachedViewById(R.id.feedbackNoCTA)).setOnClickListener(new View.OnClickListener() { // from class: nq.t
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i6 = r3;
                    u this$0 = this;
                    Bundle analyticsBundle = bundle2;
                    switch (i6) {
                        case 0:
                            int i10 = u.f26764w;
                            kotlin.jvm.internal.i.g(analyticsBundle, "$analyticsBundle");
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            gk.a.b(analyticsBundle, "s32_yes_click");
                            Context context = this$0.getContext();
                            kotlin.jvm.internal.i.d(context);
                            Toast.makeText(context, this$0.getString(R.string.depressionThoughtsFeedbackYesToast), 1).show();
                            androidx.fragment.app.p activity = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionPleasurableActivity");
                            ((DepressionPleasurableActivity) activity).t0();
                            return;
                        default:
                            int i11 = u.f26764w;
                            kotlin.jvm.internal.i.g(analyticsBundle, "$analyticsBundle");
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            gk.a.b(analyticsBundle, "s32_no_click");
                            Context context2 = this$0.getContext();
                            kotlin.jvm.internal.i.d(context2);
                            Toast.makeText(context2, this$0.getString(R.string.depressionThoughtsFeedbackNOToast), 1).show();
                            androidx.fragment.app.p activity2 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionPleasurableActivity");
                            ((DepressionPleasurableActivity) activity2).t0();
                            return;
                    }
                }
            });
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f26765u, e10);
        }
    }
}
