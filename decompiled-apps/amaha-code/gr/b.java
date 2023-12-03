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
/* compiled from: StressBodyCauseFragment.java */
/* loaded from: classes2.dex */
public class b extends rr.b {

    /* renamed from: u  reason: collision with root package name */
    public RecyclerView f16704u;

    /* renamed from: v  reason: collision with root package name */
    public ArrayList<SleepCauseModel> f16705v;

    /* renamed from: w  reason: collision with root package name */
    public RobertoTextView f16706w;

    /* renamed from: x  reason: collision with root package name */
    public RobertoTextView f16707x;

    /* renamed from: y  reason: collision with root package name */
    public ImageView f16708y;

    /* compiled from: StressBodyCauseFragment.java */
    /* loaded from: classes2.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ((SymptomsActivity) b.this.getActivity()).o0();
        }
    }

    /* compiled from: StressBodyCauseFragment.java */
    /* renamed from: gr.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class View$OnClickListenerC0259b implements View.OnClickListener {
        public View$OnClickListenerC0259b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            b.this.getActivity().finish();
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
        this.f16708y = imageView;
        UiUtils.Companion.increaseImageClickArea(imageView);
        this.f16708y.setOnClickListener(new View$OnClickListenerC0259b());
        this.f16704u = (RecyclerView) view.findViewById(R.id.recycle_cause);
        this.f16706w = (RobertoTextView) view.findViewById(R.id.txtCauses);
        this.f16707x = (RobertoTextView) view.findViewById(R.id.txtCount);
        if (SymptomsActivity.B.equals(Constants.COURSE_DEPRESSION)) {
            this.f16707x.setText("2/4");
            this.f16706w.setText("Your Body");
        } else if (SymptomsActivity.B.equals(Constants.COURSE_STRESS)) {
            this.f16707x.setText("2/3");
            this.f16706w.setText("Your Body");
        } else if (SymptomsActivity.B.equals(Constants.COURSE_WORRY)) {
            this.f16707x.setText("2/4");
            this.f16706w.setText("Your Body");
        } else if (SymptomsActivity.B.equals(Constants.COURSE_ANGER)) {
            this.f16707x.setText("3/3");
            this.f16706w.setText("Your Body");
        }
        this.f16705v = new ArrayList<>();
        if (SymptomsActivity.B.equals(Constants.COURSE_DEPRESSION)) {
            this.f16705v.add(defpackage.c.m(this.f16705v, defpackage.c.m(this.f16705v, defpackage.c.m(this.f16705v, defpackage.c.m(this.f16705v, defpackage.c.m(this.f16705v, new SleepCauseModel("Changes in Appetite"), "Changes in Weight"), "Difficulty Sleeping"), "Little Interest in Sexual Activities"), "Feeling Tired"), "Aches and Pains"));
        } else if (SymptomsActivity.B.equals(Constants.COURSE_STRESS)) {
            this.f16705v.add(defpackage.c.m(this.f16705v, defpackage.c.m(this.f16705v, defpackage.c.m(this.f16705v, defpackage.c.m(this.f16705v, defpackage.c.m(this.f16705v, defpackage.c.m(this.f16705v, defpackage.c.m(this.f16705v, defpackage.c.m(this.f16705v, new SleepCauseModel("Difficulty Sleeping"), "Body Aches"), "Increased Heart Rate, Shortness of Breath and Sweating"), "Heart Problems"), "Skin Conditions"), "Reduced Immunity"), "Sexual Problems and Difficulties"), "Stomach Problems"), "Feeling Tired"));
        } else if (SymptomsActivity.B.equals(Constants.COURSE_WORRY)) {
            this.f16705v.add(defpackage.c.m(this.f16705v, defpackage.c.m(this.f16705v, defpackage.c.m(this.f16705v, defpackage.c.m(this.f16705v, defpackage.c.m(this.f16705v, defpackage.c.m(this.f16705v, defpackage.c.m(this.f16705v, defpackage.c.m(this.f16705v, new SleepCauseModel("Heavy Breathing"), "Racing Heart"), "Tiredness"), "Muscle Tension"), "Disturbed Sleep Patterns"), "Dizziness"), "Headaches"), "Trembling"), "Frequent Urination"));
        } else if (SymptomsActivity.B.equals(Constants.COURSE_ANGER)) {
            this.f16705v.add(defpackage.c.m(this.f16705v, defpackage.c.m(this.f16705v, defpackage.c.m(this.f16705v, defpackage.c.m(this.f16705v, new SleepCauseModel("Tense Muscles"), "Racing Heartbeat"), "Disturbed Breathing Patterns"), "Increased Blood Pressure"), "Frequent Headaches"));
        }
        this.f16704u.setHasFixedSize(true);
        this.f16704u.setLayoutManager(new LinearLayoutManager(getActivity()));
        this.f16704u.setItemAnimator(new androidx.recyclerview.widget.c());
        this.f16704u.setAdapter(new o1(getActivity(), this.f16705v));
    }
}
