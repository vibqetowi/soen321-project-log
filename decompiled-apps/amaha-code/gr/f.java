package gr;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.SymptomsActivity;
import com.theinnerhour.b2b.model.SleepCauseModel;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import ek.o1;
import java.util.ArrayList;
/* compiled from: StressFeelingCauseFragment.java */
/* loaded from: classes2.dex */
public class f extends rr.b {

    /* renamed from: u  reason: collision with root package name */
    public RecyclerView f16738u;

    /* renamed from: v  reason: collision with root package name */
    public ArrayList<SleepCauseModel> f16739v;

    /* renamed from: w  reason: collision with root package name */
    public RobertoTextView f16740w;

    /* renamed from: x  reason: collision with root package name */
    public RobertoTextView f16741x;

    /* renamed from: y  reason: collision with root package name */
    public ImageView f16742y;

    /* compiled from: StressFeelingCauseFragment.java */
    /* loaded from: classes2.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ((SymptomsActivity) f.this.getActivity()).o0();
        }
    }

    /* compiled from: StressFeelingCauseFragment.java */
    /* loaded from: classes2.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            f.this.getActivity().finish();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_stress_symptom, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ((RobertoButton) view.findViewById(R.id.ll_submit)).setOnClickListener(new a());
        ImageView imageView = (ImageView) view.findViewById(R.id.header_arrow_back);
        this.f16742y = imageView;
        UiUtils.Companion.increaseImageClickArea(imageView);
        this.f16742y.setOnClickListener(new b());
        this.f16738u = (RecyclerView) view.findViewById(R.id.recycle_cause);
        this.f16740w = (RobertoTextView) view.findViewById(R.id.txtCauses);
        this.f16741x = (RobertoTextView) view.findViewById(R.id.txtCount);
        if (SymptomsActivity.B.equals(Constants.COURSE_DEPRESSION)) {
            this.f16741x.setText("3/4");
        } else if (SymptomsActivity.B.equals(Constants.COURSE_STRESS)) {
            this.f16741x.setText("3/3");
        } else if (SymptomsActivity.B.equals(Constants.COURSE_WORRY)) {
            this.f16741x.setText("1/4");
        }
        this.f16740w.setText("Your Feelings");
        this.f16739v = new ArrayList<>();
        if (SymptomsActivity.B.equals(Constants.COURSE_DEPRESSION)) {
            this.f16739v.add(defpackage.c.m(this.f16739v, defpackage.c.m(this.f16739v, defpackage.c.m(this.f16739v, defpackage.c.m(this.f16739v, defpackage.c.m(this.f16739v, new SleepCauseModel("Feeling Hopeless"), "Feeling Worthless"), "Feeling Helpless"), "Feeling Sad"), "Feeling Angry or Irritable"), "Feeling Guilty"));
        } else if (SymptomsActivity.B.equals(Constants.COURSE_STRESS)) {
            this.f16739v.add(defpackage.c.m(this.f16739v, defpackage.c.m(this.f16739v, new SleepCauseModel("Sadness"), "Worry and Nervousness"), "Anger and Frustration"));
        } else if (SymptomsActivity.B.equals(Constants.COURSE_WORRY)) {
            this.f16739v.add(defpackage.c.m(this.f16739v, defpackage.c.m(this.f16739v, new SleepCauseModel("Frustration and Irritability"), "Excessive Worrying"), "Sadness"));
        }
        this.f16738u.setHasFixedSize(true);
        this.f16738u.setLayoutManager(new LinearLayoutManager(getActivity()));
        this.f16738u.setItemAnimator(new androidx.recyclerview.widget.c());
        this.f16738u.setAdapter(new o1(getActivity(), this.f16739v));
    }
}
