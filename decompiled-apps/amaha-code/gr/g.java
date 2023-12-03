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
/* compiled from: StressMindCauseFragment.java */
/* loaded from: classes2.dex */
public class g extends rr.b {

    /* renamed from: u  reason: collision with root package name */
    public RecyclerView f16745u;

    /* renamed from: v  reason: collision with root package name */
    public ArrayList<SleepCauseModel> f16746v;

    /* renamed from: w  reason: collision with root package name */
    public RobertoTextView f16747w;

    /* renamed from: x  reason: collision with root package name */
    public RobertoTextView f16748x;

    /* renamed from: y  reason: collision with root package name */
    public ImageView f16749y;

    /* compiled from: StressMindCauseFragment.java */
    /* loaded from: classes2.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ((SymptomsActivity) g.this.getActivity()).o0();
        }
    }

    /* compiled from: StressMindCauseFragment.java */
    /* loaded from: classes2.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            g.this.getActivity().finish();
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
        this.f16749y = imageView;
        UiUtils.Companion.increaseImageClickArea(imageView);
        this.f16749y.setOnClickListener(new b());
        this.f16745u = (RecyclerView) view.findViewById(R.id.recycle_cause);
        this.f16748x = (RobertoTextView) view.findViewById(R.id.txtCount);
        this.f16747w = (RobertoTextView) view.findViewById(R.id.txtCauses);
        if (SymptomsActivity.B.equals(Constants.COURSE_DEPRESSION)) {
            this.f16748x.setText("1/4");
            this.f16747w.setText("Your Mind");
        } else if (SymptomsActivity.B.equals(Constants.COURSE_STRESS)) {
            this.f16748x.setText("1/3");
            this.f16747w.setText("Your Mind");
        } else if (SymptomsActivity.B.equals(Constants.COURSE_WORRY)) {
            this.f16748x.setText("4/4");
            this.f16747w.setText("Your Mind");
        } else if (SymptomsActivity.B.equals(Constants.COURSE_ANGER)) {
            this.f16748x.setText("1/3");
            this.f16747w.setText("Your Mood");
        }
        this.f16746v = new ArrayList<>();
        if (SymptomsActivity.B.equals(Constants.COURSE_DEPRESSION)) {
            this.f16746v.add(defpackage.c.m(this.f16746v, defpackage.c.m(this.f16746v, defpackage.c.m(this.f16746v, new SleepCauseModel("Difficulty Remembering Things"), "Difficulty Paying Attention"), "Difficulty Making Decisions"), "Negative Thinking"));
        } else if (SymptomsActivity.B.equals(Constants.COURSE_STRESS)) {
            this.f16746v.add(defpackage.c.m(this.f16746v, defpackage.c.m(this.f16746v, defpackage.c.m(this.f16746v, defpackage.c.m(this.f16746v, new SleepCauseModel("Difficulty Remembering Things"), "Negative Thinking"), "Difficulty Thinking Clearly"), "Difficulty Concentrating"), "Rapid Thinking"));
        } else if (SymptomsActivity.B.equals(Constants.COURSE_WORRY)) {
            this.f16746v.add(defpackage.c.m(this.f16746v, defpackage.c.m(this.f16746v, defpackage.c.m(this.f16746v, defpackage.c.m(this.f16746v, new SleepCauseModel("Difficulty Making Decisions"), "Difficulty Concentrating"), "Inability to Recall Events"), "Negative Thinking"), "Thinking That You Worry Too Much"));
        } else if (SymptomsActivity.B.equals(Constants.COURSE_ANGER)) {
            this.f16746v.add(defpackage.c.m(this.f16746v, defpackage.c.m(this.f16746v, new SleepCauseModel("Feeling Irritable"), "Feeling Angry Easily and Frequently"), "Feeling Worried about Your Anger"));
        }
        this.f16745u.setHasFixedSize(true);
        this.f16745u.setLayoutManager(new LinearLayoutManager(getActivity()));
        this.f16745u.setItemAnimator(new androidx.recyclerview.widget.c());
        this.f16745u.setAdapter(new o1(getActivity(), this.f16746v));
    }
}
