package dq;

import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
/* compiled from: MasterActivityDetailFragment.java */
/* loaded from: classes2.dex */
public class e extends rr.b {

    /* compiled from: MasterActivityDetailFragment.java */
    /* loaded from: classes2.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            e.this.getActivity().finish();
        }
    }

    /* compiled from: MasterActivityDetailFragment.java */
    /* loaded from: classes2.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ((rr.a) e.this.getActivity()).t0();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_enduring_no_goals, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ((ImageView) view.findViewById(R.id.header_arrow_back)).setOnClickListener(new a());
        UiUtils.Companion.increaseImageClickArea((ImageView) view.findViewById(R.id.header_arrow_back));
        ((RobertoButton) view.findViewById(R.id.tap)).setOnClickListener(new b());
        RobertoTextView robertoTextView = (RobertoTextView) view.findViewById(R.id.score);
        robertoTextView.setVisibility(0);
        robertoTextView.setText("Mastery");
        AppCompatImageView appCompatImageView = (AppCompatImageView) view.findViewById(R.id.image);
        appCompatImageView.setVisibility(0);
        appCompatImageView.setImageResource(R.drawable.ic_mastery);
        if (FirebasePersistence.getInstance().getCourseById(FirebasePersistence.getInstance().getUser().getCurrentCourse()).getCourseName().equals(Constants.COURSE_DEPRESSION)) {
            ((RobertoTextView) view.findViewById(R.id.txt_desc)).setText(Html.fromHtml("They can help you feel more in control of your life and can also improve your productivity.<br><br>For example:<i> Self-help measures like bathing, going to the bank, returning an important phone call.</i>"));
        } else {
            ((RobertoTextView) view.findViewById(R.id.txt_desc)).setText(Html.fromHtml("They can help you feel more in control of your life and can also improve your productivity.<br><br>For example:<i> Small, daily tasks like ironing your clothes, going to the bank, returning an important phone call.</i>"));
        }
    }
}
