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
/* compiled from: BehaviourCauseFragment.java */
/* loaded from: classes2.dex */
public class a extends rr.b {

    /* renamed from: u  reason: collision with root package name */
    public RecyclerView f16697u;

    /* renamed from: v  reason: collision with root package name */
    public ArrayList<SleepCauseModel> f16698v;

    /* renamed from: w  reason: collision with root package name */
    public RobertoTextView f16699w;

    /* renamed from: x  reason: collision with root package name */
    public RobertoTextView f16700x;

    /* renamed from: y  reason: collision with root package name */
    public ImageView f16701y;

    /* compiled from: BehaviourCauseFragment.java */
    /* renamed from: gr.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class View$OnClickListenerC0258a implements View.OnClickListener {
        public View$OnClickListenerC0258a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ((SymptomsActivity) a.this.getActivity()).o0();
        }
    }

    /* compiled from: BehaviourCauseFragment.java */
    /* loaded from: classes2.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            a.this.getActivity().finish();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_stress_symptom, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ((RobertoButton) view.findViewById(R.id.ll_submit)).setOnClickListener(new View$OnClickListenerC0258a());
        ImageView imageView = (ImageView) view.findViewById(R.id.header_arrow_back);
        this.f16701y = imageView;
        UiUtils.Companion.increaseImageClickArea(imageView);
        this.f16701y.setOnClickListener(new b());
        this.f16697u = (RecyclerView) view.findViewById(R.id.recycle_cause);
        this.f16699w = (RobertoTextView) view.findViewById(R.id.txtCauses);
        this.f16700x = (RobertoTextView) view.findViewById(R.id.txtCount);
        if (SymptomsActivity.B.equals(Constants.COURSE_DEPRESSION)) {
            this.f16700x.setText("4/4");
            this.f16699w.setText("Your Behaviour");
        } else if (SymptomsActivity.B.equals(Constants.COURSE_WORRY)) {
            this.f16700x.setText("3/4");
            this.f16699w.setText("Your Behaviour");
        } else if (SymptomsActivity.B.equals(Constants.COURSE_ANGER)) {
            this.f16700x.setText("2/3");
            this.f16699w.setText("Your Behaviour/Relationships");
        }
        this.f16698v = new ArrayList<>();
        if (SymptomsActivity.B.equals(Constants.COURSE_DEPRESSION)) {
            this.f16698v.add(defpackage.c.m(this.f16698v, defpackage.c.m(this.f16698v, defpackage.c.m(this.f16698v, new SleepCauseModel("Little to No Social Interaction"), "Poor Self Care"), "No Interest in Enjoyable Activities"), "Lowered Activity Levels"));
        } else if (SymptomsActivity.B.equals(Constants.COURSE_WORRY)) {
            this.f16698v.add(defpackage.c.m(this.f16698v, defpackage.c.m(this.f16698v, new SleepCauseModel("Restlessness"), "Getting Easily Frightened"), "Procrastination"));
        } else if (SymptomsActivity.B.equals(Constants.COURSE_ANGER)) {
            this.f16698v.add(defpackage.c.m(this.f16698v, new SleepCauseModel("Venting on Friends or Family"), "Problems in Relationships"));
        }
        this.f16697u.setHasFixedSize(true);
        this.f16697u.setLayoutManager(new LinearLayoutManager(getActivity()));
        this.f16697u.setItemAnimator(new androidx.recyclerview.widget.c());
        this.f16697u.setAdapter(new o1(getActivity(), this.f16698v));
    }
}
