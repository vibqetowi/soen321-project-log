package jr;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.model.Course;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.io.IOException;
import pl.droidsonroids.gif.GifImageView;
/* compiled from: DepressionTips2Fragment.java */
/* loaded from: classes2.dex */
public class b extends rr.b {

    /* renamed from: u  reason: collision with root package name */
    public RobertoTextView f22575u;

    /* renamed from: v  reason: collision with root package name */
    public RobertoTextView f22576v;

    /* compiled from: DepressionTips2Fragment.java */
    /* loaded from: classes2.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ((rr.a) b.this.getActivity()).n0();
        }
    }

    /* compiled from: DepressionTips2Fragment.java */
    /* renamed from: jr.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class View$OnClickListenerC0342b implements View.OnClickListener {
        public View$OnClickListenerC0342b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ((rr.a) b.this.getActivity()).n0();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_depression_tips, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        String stringExtra = getActivity().getIntent().getStringExtra(Constants.API_COURSE_LINK);
        this.f22575u = (RobertoTextView) view.findViewById(R.id.txt_title);
        this.f22576v = (RobertoTextView) view.findViewById(R.id.txt_desc);
        Course courseById = FirebasePersistence.getInstance().getCourseById(defpackage.c.n());
        if (stringExtra.equals(Constants.SCREEN_MULTIPLE_TIPS_1)) {
            if (courseById.getCourseName().equals(Constants.COURSE_DEPRESSION)) {
                this.f22575u.setText("Your social media usage could be making you depressed.");
                this.f22576v.setText("Social media usage can lead to FOMO, or the Fear Of Missing Out. FOMO occurs when you view other people's 'happier' life and find yourself comparing your life to theirs. As a result, you may feel sad or low.");
            } else if (courseById.getCourseName().equals(Constants.COURSE_HAPPINESS)) {
                this.f22575u.setText("Getting enough sleep can help you feel happier.");
                this.f22576v.setText("Sleeping regularly and sticking to a sleeping and waking time can make you feel happier. An irregular schedule can make you feel tired and even interfere with your brain's ability to experience positive emotions.");
            } else if (courseById.getCourseName().equals(Constants.COURSE_WORRY)) {
                this.f22575u.setText("Scheduling a time to worry can help you break the cycle of worrying.");
                this.f22576v.setText("Since 'worry time' is a time in the day that you schedule for your worries - it's a time you choose and have control over - it  can help you refocus on the present and can help you manage intrusive thoughts.");
            } else if (courseById.getCourseName().equals(Constants.COURSE_ANGER)) {
                this.f22575u.setText("Angry drivers are more likely to get into accidents.");
                this.f22576v.setText("Studies show that drivers who are angry take more risks while they are on the road - as a result of which they are likely to have collisions and accidents.");
            }
        } else if (stringExtra.equals(Constants.SCREEN_MULTIPLE_TIPS_2)) {
            if (courseById.getCourseName().equals(Constants.COURSE_DEPRESSION)) {
                this.f22575u.setText("Alcohol could affect your mood.");
                this.f22576v.setText("Regular alcohol consumption has an impact on your brain and increases the chances of depression. It's always advisable to check with a doctor about what the safe weekly limit for your alcohol intake is.");
            } else if (courseById.getCourseName().equals(Constants.COURSE_HAPPINESS)) {
                this.f22575u.setText("You are happier when you pay for experiences instead of things.");
                this.f22576v.setText("When you spend on exciting and challenging experiences, you are likely to create unforgettable and happy memories. Experiences also help you explore your passions and purpose in life.");
            } else if (courseById.getCourseName().equals(Constants.COURSE_WORRY)) {
                this.f22575u.setText("Excessive worrying can activate the stress response.");
                this.f22576v.setText("Worrying can trigger the stress response (even when it is not entirely necessary) that prepares your body to deal with difficult situations. This response brings about changes in your body by releasing hormones, changing your heart rate, lung function, and many more.");
            } else if (courseById.getCourseName().equals(Constants.COURSE_ANGER)) {
                this.f22575u.setText("Anger is different from aggression.");
                this.f22576v.setText("Whilst anger is an emotion you feel as a result of an upsetting event, aggression is behaviour that you engage in so as to harm another person. Aggression could be verbal, emotional, or even physical.");
            }
        }
        ((ImageView) view.findViewById(R.id.cancel)).setOnClickListener(new a());
        ((RobertoButton) view.findViewById(R.id.tap)).setOnClickListener(new View$OnClickListenerC0342b());
        try {
            ((GifImageView) view.findViewById(R.id.mascot)).setImageDrawable(new pl.droidsonroids.gif.b(getResources(), (int) R.raw.mascot_tips));
        } catch (IOException e10) {
            LogHelper.INSTANCE.e(e10);
        }
    }
}
