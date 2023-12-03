package dq;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.model.Course;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
/* compiled from: ActivitiesHelpFragment.java */
/* loaded from: classes2.dex */
public class a extends rr.b {

    /* compiled from: ActivitiesHelpFragment.java */
    /* renamed from: dq.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class View$OnClickListenerC0191a implements View.OnClickListener {
        public View$OnClickListenerC0191a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            a.this.getActivity().finish();
        }
    }

    /* compiled from: ActivitiesHelpFragment.java */
    /* loaded from: classes2.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ((rr.a) a.this.getActivity()).t0();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_activities_help, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ((ImageView) view.findViewById(R.id.header_arrow_back)).setOnClickListener(new View$OnClickListenerC0191a());
        UiUtils.Companion.increaseImageClickArea((ImageView) view.findViewById(R.id.header_arrow_back));
        ((RobertoButton) view.findViewById(R.id.tap)).setOnClickListener(new b());
        Course courseById = FirebasePersistence.getInstance().getCourseById(FirebasePersistence.getInstance().getUser().getCurrentCourse());
        if (courseById.getCourseName().equals(Constants.COURSE_DEPRESSION)) {
            ((RobertoTextView) view.findViewById(R.id.text1)).setText("feel better");
            ((RobertoTextView) view.findViewById(R.id.text2)).setText("feel less tired");
            ((RobertoTextView) view.findViewById(R.id.text3)).setText("think more clearly");
            ((RobertoTextView) view.findViewById(R.id.text4)).setText("do more");
        } else if (courseById.getCourseName().equals(Constants.COURSE_HAPPINESS)) {
            ((RobertoTextView) view.findViewById(R.id.text1)).setText("feel happier");
            ((RobertoTextView) view.findViewById(R.id.text2)).setText("think more positively");
            ((RobertoTextView) view.findViewById(R.id.text3)).setText("feel less tired");
            ((RobertoTextView) view.findViewById(R.id.text4)).setText("do more");
        }
        Bundle bundle2 = new Bundle();
        defpackage.b.s(bundle2, "course", bundle2, "activity_scheduling_help_screen_view");
    }
}
