package gr;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.SymptomsActivity;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
/* compiled from: SymptomsNoGoalFragment.java */
/* loaded from: classes2.dex */
public class i extends rr.b {

    /* renamed from: u  reason: collision with root package name */
    public RobertoTextView f16757u;

    /* compiled from: SymptomsNoGoalFragment.java */
    /* loaded from: classes2.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            i.this.getActivity().finish();
        }
    }

    /* compiled from: SymptomsNoGoalFragment.java */
    /* loaded from: classes2.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ((SymptomsActivity) i.this.getActivity()).o0();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_enduring_no_goals, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f16757u = (RobertoTextView) view.findViewById(R.id.txt_desc);
        if (SymptomsActivity.B.equals(Constants.COURSE_STRESS)) {
            this.f16757u.setText("Great! Looks like you are not experiencing any stress symptoms which is fantastic. \nBut keep on working on your happiness!");
        } else if (SymptomsActivity.B.equals(Constants.COURSE_DEPRESSION)) {
            this.f16757u.setText("Great! Looks like you are not experiencing any depression symptoms which is fantastic. \nBut keep on working on your happiness!");
        } else if (SymptomsActivity.B.equals(Constants.COURSE_WORRY)) {
            this.f16757u.setText("Great! Looks like you are not experiencing any worry symptoms which is fantastic. \nBut keep on working on your happiness!");
        } else if (SymptomsActivity.B.equals(Constants.COURSE_ANGER)) {
            this.f16757u.setText("Great! Looks like you are not experiencing any anger symptoms which is fantastic. \nBut keep on working on your happiness!");
        }
        ((ImageView) view.findViewById(R.id.header_arrow_back)).setOnClickListener(new a());
        ((RobertoButton) view.findViewById(R.id.tap)).setOnClickListener(new b());
    }
}
