package cq;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.ActivitiesActivity;
import com.theinnerhour.b2b.model.Course;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
/* compiled from: ActivityIntroFragment.java */
/* loaded from: classes2.dex */
public class a extends rr.b {

    /* renamed from: u  reason: collision with root package name */
    public RobertoButton f11883u;

    /* renamed from: v  reason: collision with root package name */
    public ImageView f11884v;

    /* renamed from: w  reason: collision with root package name */
    public Animation f11885w;

    /* renamed from: x  reason: collision with root package name */
    public String[] f11886x;

    /* renamed from: y  reason: collision with root package name */
    public int f11887y;

    /* renamed from: z  reason: collision with root package name */
    public RobertoTextView f11888z;

    /* compiled from: ActivityIntroFragment.java */
    /* renamed from: cq.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class View$OnClickListenerC0173a implements View.OnClickListener {
        public View$OnClickListenerC0173a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            a aVar = a.this;
            try {
                int i6 = aVar.f11887y + 1;
                aVar.f11887y = i6;
                if (i6 < aVar.f11886x.length) {
                    aVar.f11888z.setAnimation(aVar.f11885w);
                    aVar.f11888z.setText(aVar.f11886x[aVar.f11887y]);
                    aVar.f11885w.setDuration(500L);
                    aVar.f11885w.start();
                } else {
                    ((ActivitiesActivity) aVar.getActivity()).t0();
                }
            } catch (Exception e10) {
                LogHelper.INSTANCE.e("activityintrofragment", "exception in on tap on click listener", e10);
            }
        }
    }

    /* compiled from: ActivityIntroFragment.java */
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
        return layoutInflater.inflate(R.layout.fragment_activity_intro, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f11883u = (RobertoButton) view.findViewById(R.id.tap);
        RobertoTextView robertoTextView = (RobertoTextView) view.findViewById(R.id.header);
        this.f11888z = (RobertoTextView) view.findViewById(R.id.desc);
        this.f11883u.setOnClickListener(new View$OnClickListenerC0173a());
        ImageView imageView = (ImageView) view.findViewById(R.id.header_arrow_back);
        this.f11884v = imageView;
        UiUtils.Companion.increaseImageClickArea(imageView);
        this.f11884v.setOnClickListener(new b());
        try {
            new ArrayList();
            Course courseById = FirebasePersistence.getInstance().getCourseById(FirebasePersistence.getInstance().getUser().getCurrentCourse());
            this.f11885w = AnimationUtils.loadAnimation(getContext(), R.anim.text_slide_right);
            if (courseById.getCourseName().equals(Constants.COURSE_STRESS)) {
                robertoTextView.setText("Activities to Reduce Stress");
                String[] strArr = {"Experiencing stress over a long period of time can be harmful for you.", "It can put you at risk for health problems such as high blood pressure, stomach aches, headaches, anxiety, and depression.", "Practising certain types of activities regularly can help ease the effects of stress on your body."};
                this.f11886x = strArr;
                this.f11888z.setText(strArr[0]);
            } else if (courseById.getCourseName().equals(Constants.COURSE_SLEEP)) {
                robertoTextView.setText("Activities to Sleep Better");
                String[] strArr2 = {"There are certain activities that can help you feel more relaxed and improve the quality of your sleep.", "It is important to engage in these activities regularly in order to see a positive effect on your sleeping patterns."};
                this.f11886x = strArr2;
                this.f11888z.setText(strArr2[0]);
            } else if (courseById.getCourseName().equals(Constants.COURSE_DEPRESSION)) {
                robertoTextView.setText("Activities to Improve Mood");
                String[] strArr3 = {"Occasional low mood is an inevitable part of your life. However, experiencing low mood over a long period of time can impact your health.", "Practicing certain activities on a regular basis can counter your low mood, making you feel happier."};
                this.f11886x = strArr3;
                this.f11888z.setText(strArr3[0]);
            } else if (courseById.getCourseName().equals(Constants.COURSE_HAPPINESS)) {
                robertoTextView.setText("Activities help you feel happier");
                String[] strArr4 = {"Engaging in relaxation and physical activities on a regular basis can help you feel happier and protect you from experiencing negative emotions."};
                this.f11886x = strArr4;
                this.f11888z.setText(strArr4[0]);
            } else if (courseById.getCourseName().equals(Constants.COURSE_WORRY)) {
                robertoTextView.setText("Activities to Reduce Worry");
                String[] strArr5 = {"Worrying over a long period of time can put you at risk for health problems such as high blood pressure, stomach aches, headaches, or even depression.", "Practising certain activities regularly can help ease the effects of worry on your body."};
                this.f11886x = strArr5;
                this.f11888z.setText(strArr5[0]);
            } else if (courseById.getCourseName().equals(Constants.COURSE_ANGER)) {
                robertoTextView.setText("Activities to Reduce Anger");
                String[] strArr6 = {"Anger can have long-term negative effects on your body - including increased blood pressure and elevated heart rate.", "Practising certain activities regularly can help ease the effects that anger often has on you."};
                this.f11886x = strArr6;
                this.f11888z.setText(strArr6[0]);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e("activityintrofragment", "exception in on create", e10);
        }
    }
}
