package gq;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.adapter.GoalsAssessmentActivity;
import com.theinnerhour.b2b.model.Course;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
/* compiled from: GoalsAssessmentNoSelectionFragment.java */
/* loaded from: classes2.dex */
public class c extends rr.b {

    /* renamed from: u  reason: collision with root package name */
    public String f16689u = Constants.SCREEN_ENDURING_ASSESSMENT;

    /* compiled from: GoalsAssessmentNoSelectionFragment.java */
    /* loaded from: classes2.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            c.this.getActivity().finish();
        }
    }

    /* compiled from: GoalsAssessmentNoSelectionFragment.java */
    /* loaded from: classes2.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ((GoalsAssessmentActivity) c.this.getActivity()).t0();
        }
    }

    /* compiled from: GoalsAssessmentNoSelectionFragment.java */
    /* renamed from: gq.c$c  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class View$OnClickListenerC0257c implements View.OnClickListener {
        public View$OnClickListenerC0257c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ((GoalsAssessmentActivity) c.this.getActivity()).t0();
        }
    }

    @Override // rr.b
    public final rr.b F() {
        return new d();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_goals_assessment_intro, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ((ImageView) view.findViewById(R.id.header_arrow_back)).setOnClickListener(new a());
        Course courseById = FirebasePersistence.getInstance().getCourseById(FirebasePersistence.getInstance().getUser().getCurrentCourse());
        this.f16689u = getActivity().getIntent().getExtras().getString(Constants.API_COURSE_LINK, Constants.SCREEN_ENDURING_ASSESSMENT);
        ((ConstraintLayout) view.findViewById(R.id.constraintLayout)).setVisibility(4);
        ((RobertoButton) view.findViewById(R.id.tap_1)).setVisibility(0);
        if (this.f16689u.equals(Constants.SCREEN_ENDURING_ASSESSMENT)) {
            ((RobertoTextView) view.findViewById(R.id.txt_desc)).setText("It often takes time to deliver results. We all react differently and some of us may take more time to learn or benefit from certain behaviours.");
        } else if (this.f16689u.equals(Constants.SCREEN_THOUGHTS_ASSESSMENT)) {
            if (!courseById.getCourseName().equals(Constants.COURSE_DEPRESSION) && !courseById.getCourseName().equals(Constants.COURSE_HAPPINESS)) {
                ((RobertoTextView) view.findViewById(R.id.txt_desc)).setText("We all react differently and some of us may take more time to identify and challenge our negative thinking patterns.");
            } else {
                ((RobertoTextView) view.findViewById(R.id.txt_desc)).setText("Working on yourself can be hard, and it often takes time for you to see the results. Each person progresses at their own pace, and some may take more time to learn or benefit from the steps you've been taking towards happiness.");
            }
        } else if (this.f16689u.equals(Constants.SCREEN_REASSESSMENT_1) || this.f16689u.equals(Constants.SCREEN_REASSESSMENT_2)) {
            ((RobertoTextView) view.findViewById(R.id.txt_desc)).setText("Working on yourself can be hard, and it often takes time for you to see the results. Each person progresses at their own pace, and some may take more time to learn or benefit from the steps you've been taking towards happiness.");
        }
        ((RobertoButton) view.findViewById(R.id.tap_1)).setOnClickListener(new b());
        ((RobertoButton) view.findViewById(R.id.tap)).setOnClickListener(new View$OnClickListenerC0257c());
    }
}
