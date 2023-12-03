package gq;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.ActivityScheduling;
import com.theinnerhour.b2b.activity.CausesActivity;
import com.theinnerhour.b2b.activity.EnduringActivity;
import com.theinnerhour.b2b.activity.SleepTimeTableActivity;
import com.theinnerhour.b2b.activity.ThoughtsActivity;
import com.theinnerhour.b2b.adapter.GoalsAssessmentActivity;
import com.theinnerhour.b2b.model.Course;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.widgets.RobertoTextView;
/* compiled from: GoalsAssessmentConclusionFragment.java */
/* loaded from: classes2.dex */
public class a extends rr.b {

    /* renamed from: u  reason: collision with root package name */
    public String f16678u = Constants.SCREEN_ENDURING_ASSESSMENT;

    /* renamed from: v  reason: collision with root package name */
    public Course f16679v;

    /* compiled from: GoalsAssessmentConclusionFragment.java */
    /* renamed from: gq.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class View$OnClickListenerC0255a implements View.OnClickListener {
        public View$OnClickListenerC0255a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            a.this.getActivity().finish();
        }
    }

    /* compiled from: GoalsAssessmentConclusionFragment.java */
    /* loaded from: classes2.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ((GoalsAssessmentActivity) a.this.getActivity()).t0();
        }
    }

    /* compiled from: GoalsAssessmentConclusionFragment.java */
    /* loaded from: classes2.dex */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            a aVar = a.this;
            if (aVar.f16678u.equals(Constants.SCREEN_ENDURING_ASSESSMENT)) {
                Intent intent = new Intent(aVar.getActivity(), EnduringActivity.class);
                intent.setFlags(33554432);
                aVar.startActivity(intent);
                aVar.getActivity().finish();
            } else if (aVar.f16678u.equals(Constants.SCREEN_THOUGHTS_ASSESSMENT)) {
                Intent intent2 = new Intent(aVar.getActivity(), ThoughtsActivity.class);
                intent2.setFlags(33554432);
                aVar.startActivity(intent2);
                aVar.getActivity().finish();
            } else if (aVar.f16678u.equals(Constants.SCREEN_REASSESSMENT_1)) {
                if (aVar.f16679v.getCourseName().equals(Constants.COURSE_SLEEP)) {
                    Intent intent3 = new Intent(aVar.getActivity(), SleepTimeTableActivity.class);
                    intent3.setFlags(33554432);
                    aVar.startActivity(intent3);
                    aVar.getActivity().finish();
                } else if (aVar.f16679v.getCourseName().equals(Constants.COURSE_DEPRESSION) || aVar.f16679v.getCourseName().equals(Constants.COURSE_HAPPINESS)) {
                    Intent intent4 = new Intent(aVar.getActivity(), ActivityScheduling.class);
                    intent4.setFlags(33554432);
                    aVar.startActivity(intent4);
                    aVar.getActivity().finish();
                }
            } else if (aVar.f16678u.equals(Constants.SCREEN_REASSESSMENT_2)) {
                if (aVar.f16679v.getCourseName().equals(Constants.COURSE_SLEEP)) {
                    Intent intent5 = new Intent(aVar.getActivity(), CausesActivity.class);
                    intent5.setFlags(33554432);
                    aVar.startActivity(intent5);
                    aVar.getActivity().finish();
                } else if (aVar.f16679v.getCourseName().equals(Constants.COURSE_DEPRESSION) || aVar.f16679v.getCourseName().equals(Constants.COURSE_HAPPINESS) || aVar.f16679v.getCourseName().equals(Constants.COURSE_WORRY) || aVar.f16679v.getCourseName().equals(Constants.COURSE_ANGER)) {
                    Intent intent6 = new Intent(aVar.getActivity(), EnduringActivity.class);
                    intent6.setFlags(33554432);
                    aVar.startActivity(intent6);
                    aVar.getActivity().finish();
                }
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_goals_assessment_conclusion, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ((ImageView) view.findViewById(R.id.header_arrow_back)).setOnClickListener(new View$OnClickListenerC0255a());
        UiUtils.Companion.increaseImageClickArea((ImageView) view.findViewById(R.id.header_arrow_back));
        this.f16679v = FirebasePersistence.getInstance().getCourseById(FirebasePersistence.getInstance().getUser().getCurrentCourse());
        String string = getActivity().getIntent().getExtras().getString(Constants.API_COURSE_LINK, Constants.SCREEN_ENDURING_ASSESSMENT);
        this.f16678u = string;
        if (string.equals(Constants.SCREEN_ENDURING_ASSESSMENT)) {
            ((RobertoTextView) view.findViewById(R.id.text1)).setText("Continue with the same goals");
            ((RobertoTextView) view.findViewById(R.id.text2)).setText("Edit your goals");
        } else if (this.f16678u.equals(Constants.SCREEN_THOUGHTS_ASSESSMENT)) {
            ((RobertoTextView) view.findViewById(R.id.text1)).setText("Continue with same thinking pattern");
            ((RobertoTextView) view.findViewById(R.id.text2)).setText("Edit thinking pattern");
        } else if (this.f16678u.equals(Constants.SCREEN_REASSESSMENT_1)) {
            if (this.f16679v.getCourseName().equals(Constants.COURSE_SLEEP)) {
                ((RobertoTextView) view.findViewById(R.id.text1)).setText("Continue with the same goals");
                ((RobertoTextView) view.findViewById(R.id.text2)).setText("Edit your goals");
            } else if (this.f16679v.getCourseName().equals(Constants.COURSE_DEPRESSION) || this.f16679v.getCourseName().equals(Constants.COURSE_HAPPINESS)) {
                ((RobertoTextView) view.findViewById(R.id.text1)).setText("Continue with the same tasks");
                ((RobertoTextView) view.findViewById(R.id.text2)).setText("Edit your tasks");
            }
        } else if (this.f16678u.equals(Constants.SCREEN_REASSESSMENT_2)) {
            if (this.f16679v.getCourseName().equals(Constants.COURSE_SLEEP)) {
                ((RobertoTextView) view.findViewById(R.id.text1)).setText("Continue with the same goals");
                ((RobertoTextView) view.findViewById(R.id.text2)).setText("Edit your goals");
            } else if (this.f16679v.getCourseName().equals(Constants.COURSE_DEPRESSION) || this.f16679v.getCourseName().equals(Constants.COURSE_HAPPINESS) || this.f16679v.getCourseName().equals(Constants.COURSE_WORRY) || this.f16679v.getCourseName().equals(Constants.COURSE_ANGER)) {
                ((RobertoTextView) view.findViewById(R.id.text1)).setText("Continue with the same goals");
                ((RobertoTextView) view.findViewById(R.id.text2)).setText("Edit your goals");
            }
        }
        ((CardView) view.findViewById(R.id.card1)).setOnClickListener(new b());
        ((CardView) view.findViewById(R.id.card2)).setOnClickListener(new c());
    }
}
