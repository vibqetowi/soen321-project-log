package br;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.RelaxationActivity;
import com.theinnerhour.b2b.model.Course;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
/* compiled from: RelaxationIntroFragment.java */
/* loaded from: classes2.dex */
public class b extends rr.b {
    public String A;

    /* renamed from: u  reason: collision with root package name */
    public RobertoTextView f4662u;

    /* renamed from: v  reason: collision with root package name */
    public RobertoTextView f4663v;

    /* renamed from: w  reason: collision with root package name */
    public ImageView f4664w;

    /* renamed from: x  reason: collision with root package name */
    public Animation f4665x;

    /* renamed from: y  reason: collision with root package name */
    public String[] f4666y;

    /* renamed from: z  reason: collision with root package name */
    public int f4667z;

    /* compiled from: RelaxationIntroFragment.java */
    /* loaded from: classes2.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            b.this.getActivity().finish();
        }
    }

    /* compiled from: RelaxationIntroFragment.java */
    /* renamed from: br.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class View$OnClickListenerC0092b implements View.OnClickListener {
        public View$OnClickListenerC0092b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            b bVar = b.this;
            int i6 = bVar.f4667z + 1;
            bVar.f4667z = i6;
            if (i6 < bVar.f4666y.length) {
                bVar.f4663v.setAnimation(bVar.f4665x);
                bVar.f4663v.setText(bVar.f4666y[bVar.f4667z]);
                bVar.f4665x.setDuration(500L);
                bVar.f4665x.start();
                return;
            }
            ((RelaxationActivity) bVar.getActivity()).t0();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_relaxation_activity, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f4662u = (RobertoTextView) view.findViewById(R.id.title);
        this.f4663v = (RobertoTextView) view.findViewById(R.id.desc);
        Bundle arguments = getArguments();
        if (arguments != null && arguments.containsKey(Constants.COURSE_TITLE)) {
            arguments.getString(Constants.COURSE_TITLE);
        }
        Course courseById = FirebasePersistence.getInstance().getCourseById(c.n());
        this.A = getActivity().getIntent().getExtras().getString(Constants.API_COURSE_LINK, Constants.SCREEN_ACTIVITY_1);
        this.f4665x = AnimationUtils.loadAnimation(getContext(), R.anim.text_slide_right);
        new ArrayList();
        if (courseById.getCourseName().equals(Constants.COURSE_STRESS)) {
            if (this.A.equals(Constants.SCREEN_THOUGHTS_ACTIVITY)) {
                this.f4662u.setText("How Relaxation Helps");
                String[] strArr = {"To effectively fight stress, we need to activate the body's natural relaxation response - which is a state of deep rest.", "By learning how to produce this response, you can control your reactions to stress and bring your body and mind back into a state of calmness.", "These activities calm your body and mind by relaxing tense muscles and improving blood flow, thereby helping you feel energised and focussed. Try practising them everyday to feel calm and relaxed."};
                this.f4666y = strArr;
                this.f4663v.setText(strArr[0]);
            } else if (this.A.equals("physical_activity")) {
                this.f4662u.setText("How Exercise Helps");
                String[] strArr2 = {"Simple exercises carried out on a regular basis produce feel-good chemicals in your body that can decrease tension and improve both your mood and well-being."};
                this.f4666y = strArr2;
                this.f4663v.setText(strArr2[0]);
            }
        } else if (courseById.getCourseName().equals(Constants.COURSE_SLEEP)) {
            if (this.A.equals(Constants.SCREEN_ACTIVITY_1)) {
                this.f4662u.setText("How relaxation helps");
                String[] strArr3 = {"Relaxation activities help improve the quality of your sleep by calming you and helping your body recover after dealing with the day's stressful events."};
                this.f4666y = strArr3;
                this.f4663v.setText(strArr3[0]);
            } else if (this.A.equals(Constants.SCREEN_ACTIVITY_2)) {
                this.f4662u.setText("How exercise helps");
                String[] strArr4 = {"Physical activity can improve sleep by balancing your body clock, boosting daytime alertness and helping you fall asleep. People who exercise regularly report better sleep than those who are not physically active."};
                this.f4666y = strArr4;
                this.f4663v.setText(strArr4[0]);
            }
        }
        ImageView imageView = (ImageView) view.findViewById(R.id.header_arrow_back);
        this.f4664w = imageView;
        UiUtils.Companion.increaseImageClickArea(imageView);
        this.f4664w.setOnClickListener(new a());
        ((RobertoButton) view.findViewById(R.id.tap)).setOnClickListener(new View$OnClickListenerC0092b());
    }
}
