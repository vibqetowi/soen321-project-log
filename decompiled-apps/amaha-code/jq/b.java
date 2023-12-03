package jq;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.p;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.InsetsUtils;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
/* compiled from: ConditionSelectionReassessmentFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ljq/b;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class b extends rr.b {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ int f22568w = 0;

    /* renamed from: v  reason: collision with root package name */
    public final LinkedHashMap f22570v = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f22569u = LogHelper.INSTANCE.makeLogTag(b.class);

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f22570v;
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
        i.g(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_condition_selection_reassessment, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f22570v.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i6;
        i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            InsetsUtils insetsUtils = InsetsUtils.INSTANCE;
            AppCompatImageView backButton = (AppCompatImageView) _$_findCachedViewById(R.id.backButton);
            i.f(backButton, "backButton");
            insetsUtils.addStatusBarHeight(backButton);
            AppCompatImageView headerImage = (AppCompatImageView) _$_findCachedViewById(R.id.headerImage);
            i.f(headerImage, "headerImage");
            insetsUtils.addStatusBarHeight(headerImage);
            ((RobertoButton) _$_findCachedViewById(R.id.continueCTA)).setOnClickListener(new View.OnClickListener(this) { // from class: jq.a

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ b f22567v;

                {
                    this.f22567v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i10 = r2;
                    b this$0 = this.f22567v;
                    switch (i10) {
                        case 0:
                            int i11 = b.f22568w;
                            i.g(this$0, "this$0");
                            p activity = this$0.getActivity();
                            i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
                            ((rr.a) activity).t0();
                            return;
                        default:
                            int i12 = b.f22568w;
                            i.g(this$0, "this$0");
                            p activity2 = this$0.getActivity();
                            i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
                            ((rr.a) activity2).n0();
                            return;
                    }
                }
            });
            ((AppCompatImageView) _$_findCachedViewById(R.id.backButton)).setOnClickListener(new View.OnClickListener(this) { // from class: jq.a

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ b f22567v;

                {
                    this.f22567v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i10 = r2;
                    b this$0 = this.f22567v;
                    switch (i10) {
                        case 0:
                            int i11 = b.f22568w;
                            i.g(this$0, "this$0");
                            p activity = this$0.getActivity();
                            i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
                            ((rr.a) activity).t0();
                            return;
                        default:
                            int i12 = b.f22568w;
                            i.g(this$0, "this$0");
                            p activity2 = this$0.getActivity();
                            i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
                            ((rr.a) activity2).n0();
                            return;
                    }
                }
            });
            if (i.b(FirebasePersistence.getInstance().getUser().getVersion(), "v2.3")) {
                ((RobertoTextView) _$_findCachedViewById(R.id.header)).setText(getString(R.string.reassessmentMidHeader));
                RobertoTextView robertoTextView = (RobertoTextView) _$_findCachedViewById(R.id.subheader);
                p activity = getActivity();
                i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                if (((InitialAssessmentActivity) activity).K == 0) {
                    i6 = R.string.v2reassessmentString1;
                } else {
                    i6 = R.string.v2reassessmentString2;
                }
                robertoTextView.setText(getString(i6));
                ((RobertoTextView) _$_findCachedViewById(R.id.prompt)).setText(getString(R.string.reassessmentMidPrompt));
                ((RobertoButton) _$_findCachedViewById(R.id.continueCTA)).setText(getString(R.string.initial_assessment_activity_btn));
            } else {
                p activity2 = getActivity();
                i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                if (((InitialAssessmentActivity) activity2).K == 1) {
                    ((RobertoTextView) _$_findCachedViewById(R.id.header)).setText(getString(R.string.reassessmentMidHeader));
                    ((RobertoTextView) _$_findCachedViewById(R.id.subheader)).setText(getString(R.string.reassessmentMidSubheader));
                    ((RobertoTextView) _$_findCachedViewById(R.id.prompt)).setText(getString(R.string.reassessmentMidPrompt));
                    ((RobertoButton) _$_findCachedViewById(R.id.continueCTA)).setText(getString(R.string.initial_assessment_activity_btn));
                } else {
                    ((RobertoTextView) _$_findCachedViewById(R.id.header)).setText(getString(R.string.reassessmentEndHeader));
                    ((RobertoTextView) _$_findCachedViewById(R.id.subheader)).setText(getString(R.string.reassessmentEndPrompt));
                    ((RobertoTextView) _$_findCachedViewById(R.id.prompt)).setText(getString(R.string.reassessmentEndSubheader));
                    ((RobertoButton) _$_findCachedViewById(R.id.continueCTA)).setText(getString(R.string.lets_start));
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f22569u, e10);
        }
    }
}
