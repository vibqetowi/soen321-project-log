package br;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.PushActivity;
import com.theinnerhour.b2b.model.Course;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
/* compiled from: PushActivityIntroFragment.java */
/* loaded from: classes2.dex */
public class a extends rr.b {

    /* renamed from: u  reason: collision with root package name */
    public RobertoTextView f4654u;

    /* renamed from: v  reason: collision with root package name */
    public RobertoTextView f4655v;

    /* renamed from: w  reason: collision with root package name */
    public String f4656w;

    /* renamed from: x  reason: collision with root package name */
    public Animation f4657x;

    /* renamed from: y  reason: collision with root package name */
    public String[] f4658y;

    /* renamed from: z  reason: collision with root package name */
    public int f4659z;

    /* compiled from: PushActivityIntroFragment.java */
    /* renamed from: br.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class View$OnClickListenerC0091a implements View.OnClickListener {
        public View$OnClickListenerC0091a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            a.this.getActivity().finish();
        }
    }

    /* compiled from: PushActivityIntroFragment.java */
    /* loaded from: classes2.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            a aVar = a.this;
            int i6 = aVar.f4659z + 1;
            aVar.f4659z = i6;
            if (i6 < aVar.f4658y.length) {
                aVar.f4655v.setAnimation(aVar.f4657x);
                aVar.f4655v.setText(aVar.f4658y[aVar.f4659z]);
                aVar.f4657x.setDuration(500L);
                aVar.f4657x.start();
                return;
            }
            ((PushActivity) aVar.getActivity()).t0();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_relaxation_activity, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f4654u = (RobertoTextView) view.findViewById(R.id.title);
        this.f4655v = (RobertoTextView) view.findViewById(R.id.desc);
        Bundle arguments = getArguments();
        if (arguments != null && arguments.containsKey(Constants.COURSE_TITLE)) {
            arguments.getString(Constants.COURSE_TITLE);
        }
        Course courseById = FirebasePersistence.getInstance().getCourseById(c.n());
        this.f4656w = getActivity().getIntent().getExtras().getString(Constants.API_COURSE_LINK, Constants.SCREEN_ACTIVITY_1);
        new ArrayList();
        this.f4657x = AnimationUtils.loadAnimation(getContext(), R.anim.text_slide_right);
        if (this.f4656w.equals(Constants.SCREEN_ACTIVITY_1)) {
            if (courseById.getCourseName().equals(Constants.COURSE_SLEEP)) {
                this.f4654u.setText("How Relaxation Helps");
                String[] strArr = {"Relaxation activities help improve the quality of your sleep by calming you and helping your body recover after dealing with the day's stressful events."};
                this.f4658y = strArr;
                this.f4655v.setText(strArr[0]);
            } else if (courseById.getCourseName().equals(Constants.COURSE_DEPRESSION)) {
                this.f4654u.setText("How relaxation helps");
                String[] strArr2 = {"In daily life, several situations can make you feel sad and upset.", "Relaxation activities are designed to make you feel calmer and to counter the negative impact that sadness can have on your body.", "Learn more about the different kinds of activities that you can try out to give your mood an instant boost."};
                this.f4658y = strArr2;
                this.f4655v.setText(strArr2[0]);
            } else if (courseById.getCourseName().equals(Constants.COURSE_HAPPINESS)) {
                this.f4654u.setText("How relaxation helps");
                String[] strArr3 = {"Relaxation activities can help you experience a sense of calm, protecting you from negative emotions and making you feel happier.", "Learn more about the different kinds of activities that you can try out to feel happier."};
                this.f4658y = strArr3;
                this.f4655v.setText(strArr3[0]);
            } else if (courseById.getCourseName().equals(Constants.COURSE_WORRY)) {
                this.f4654u.setText("How relaxation helps");
                String[] strArr4 = {"Excessive worrying can trigger the stress response in your body, which, over time, may be quite harmful for you.", "To counter this response, you can practise simple relaxation activities that help you feel calm."};
                this.f4658y = strArr4;
                this.f4655v.setText(strArr4[0]);
            } else if (courseById.getCourseName().equals(Constants.COURSE_ANGER)) {
                this.f4654u.setText("How Relaxation Helps");
                String[] strArr5 = {"Anger can have a negative impact on your body, causing your muscles to tense or your heart to start beating faster.", "Relaxation activities can not only reduce feelings of anger, but can also help you feel calm and in control."};
                this.f4658y = strArr5;
                this.f4655v.setText(strArr5[0]);
            }
        } else if (this.f4656w.equals(Constants.SCREEN_ACTIVITY_2)) {
            if (courseById.getCourseName().equals(Constants.COURSE_SLEEP)) {
                this.f4654u.setText("Simple Exercises to Sleep Better");
                String[] strArr6 = {"Physical activity can improve sleep by balancing your body clock, boosting daytime alertness and helping you fall asleep. People who exercise regularly report better sleep than those who are not physically active."};
                this.f4658y = strArr6;
                this.f4655v.setText(strArr6[0]);
            } else if (courseById.getCourseName().equals(Constants.COURSE_DEPRESSION)) {
                this.f4654u.setText("How exercise helps");
                String[] strArr7 = {"Engaging in different types of physical activities can help you manage your mood better.", "Different forms of exercise not only distract you from worrying or negative (depressive) thoughts, but also increase the levels of feel-good chemicals in your brain."};
                this.f4658y = strArr7;
                this.f4655v.setText(strArr7[0]);
            } else if (courseById.getCourseName().equals(Constants.COURSE_HAPPINESS)) {
                this.f4654u.setText("How exercise helps");
                String[] strArr8 = {"Physical activity can be beneficial for your body and mind. Regular exercise can distract you from negative thoughts and increase the level of feel-good chemicals in your brain, thereby making you happier."};
                this.f4658y = strArr8;
                this.f4655v.setText(strArr8[0]);
            } else if (courseById.getCourseName().equals(Constants.COURSE_WORRY)) {
                this.f4654u.setText("How exercise helps");
                String[] strArr9 = {"Physical activities can be quite beneficial as they keep you alert and help you deal with negative feelings like worry. Engaging in these activities is a great way to start leading a healthier and happier life."};
                this.f4658y = strArr9;
                this.f4655v.setText(strArr9[0]);
            } else if (courseById.getCourseName().equals(Constants.COURSE_ANGER)) {
                this.f4654u.setText("How Exercise Helps");
                String[] strArr10 = {"Physical activities build your strength and immunity, thereby reducing the negative impact that anger might have on your body and mind. Regular physical activity can help you lead a happier and healthier life."};
                this.f4658y = strArr10;
                this.f4655v.setText(strArr10[0]);
            }
        }
        ((ImageView) view.findViewById(R.id.header_arrow_back)).setOnClickListener(new View$OnClickListenerC0091a());
        ((RobertoButton) view.findViewById(R.id.tap)).setOnClickListener(new b());
    }
}
