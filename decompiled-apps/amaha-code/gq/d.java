package gq;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.adapter.GoalsAssessmentActivity;
import com.theinnerhour.b2b.model.Course;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
/* compiled from: GoalsAssessmentQuesFragment.java */
/* loaded from: classes2.dex */
public class d extends rr.b {

    /* renamed from: u  reason: collision with root package name */
    public String f16693u = Constants.SCREEN_ENDURING_ASSESSMENT;

    /* compiled from: GoalsAssessmentQuesFragment.java */
    /* loaded from: classes2.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            d.this.getActivity().finish();
        }
    }

    /* compiled from: GoalsAssessmentQuesFragment.java */
    /* loaded from: classes2.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ((GoalsAssessmentActivity) d.this.getActivity()).t0();
        }
    }

    /* compiled from: GoalsAssessmentQuesFragment.java */
    /* loaded from: classes2.dex */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ((GoalsAssessmentActivity) d.this.getActivity()).r0(new gq.c());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.activity_yes_no_assessment, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ((ImageView) view.findViewById(R.id.header_arrow_back)).setOnClickListener(new a());
        UiUtils.Companion.increaseImageClickArea((ImageView) view.findViewById(R.id.header_arrow_back));
        Course courseById = FirebasePersistence.getInstance().getCourseById(FirebasePersistence.getInstance().getUser().getCurrentCourse());
        String string = getActivity().getIntent().getExtras().getString(Constants.API_COURSE_LINK, Constants.SCREEN_ENDURING_ASSESSMENT);
        this.f16693u = string;
        if (string.equals(Constants.SCREEN_ENDURING_ASSESSMENT)) {
            ((RobertoTextView) view.findViewById(R.id.ques)).setText("Did the selected goal(s) / behaviour(s) help you?");
        } else if (this.f16693u.equals(Constants.SCREEN_THOUGHTS_ASSESSMENT)) {
            ((RobertoTextView) view.findViewById(R.id.ques)).setText("Were you able to challenge your negative thinking consistently?");
        } else if (this.f16693u.equals(Constants.SCREEN_REASSESSMENT_1)) {
            if (courseById.getCourseName().equals(Constants.COURSE_SLEEP)) {
                ((RobertoTextView) view.findViewById(R.id.ques)).setText("Did the selected behaviour(s) help you?");
            } else if (courseById.getCourseName().equals(Constants.COURSE_DEPRESSION)) {
                ((RobertoTextView) view.findViewById(R.id.ques)).setText("Did the selected activities help you?");
            } else if (courseById.getCourseName().equals(Constants.COURSE_HAPPINESS)) {
                ((RobertoTextView) view.findViewById(R.id.ques)).setText("Did the selected activities help you?");
            }
        } else if (this.f16693u.equals(Constants.SCREEN_REASSESSMENT_2)) {
            if (courseById.getCourseName().equals(Constants.COURSE_SLEEP)) {
                ((RobertoTextView) view.findViewById(R.id.ques)).setText("Did the selected behaviour(s) help you?");
            } else if (courseById.getCourseName().equals(Constants.COURSE_DEPRESSION)) {
                ((RobertoTextView) view.findViewById(R.id.ques)).setText("Did the selected behaviour(s) help you?");
            } else if (courseById.getCourseName().equals(Constants.COURSE_HAPPINESS)) {
                ((RobertoTextView) view.findViewById(R.id.ques)).setText("Did the selected behaviour(s) help you?");
            } else if (courseById.getCourseName().equals(Constants.COURSE_WORRY)) {
                ((RobertoTextView) view.findViewById(R.id.ques)).setText("Did the selected behaviour(s) help you?");
            } else if (courseById.getCourseName().equals(Constants.COURSE_ANGER)) {
                ((RobertoTextView) view.findViewById(R.id.ques)).setText("Did the selected behaviour(s) help you?");
            }
        }
        ((RobertoButton) view.findViewById(R.id.ll_right)).setOnClickListener(new b());
        ((RobertoButton) view.findViewById(R.id.ll_wrong)).setOnClickListener(new c());
    }
}
