package jr;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.TipsActivity;
import com.theinnerhour.b2b.model.Course;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import hr.r8;
import java.io.IOException;
import pl.droidsonroids.gif.GifImageView;
/* compiled from: DepressionTips1Fragment.java */
/* loaded from: classes2.dex */
public class a extends rr.b {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ int f22571w = 0;

    /* renamed from: u  reason: collision with root package name */
    public RobertoTextView f22572u;

    /* renamed from: v  reason: collision with root package name */
    public RobertoTextView f22573v;

    /* compiled from: DepressionTips1Fragment.java */
    /* renamed from: jr.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class View$OnClickListenerC0341a implements View.OnClickListener {
        public View$OnClickListenerC0341a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ((TipsActivity) a.this.getActivity()).t0();
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
        this.f22572u = (RobertoTextView) view.findViewById(R.id.txt_title);
        this.f22573v = (RobertoTextView) view.findViewById(R.id.txt_desc);
        Course courseById = FirebasePersistence.getInstance().getCourseById(defpackage.c.n());
        if (stringExtra.equals(Constants.SCREEN_MULTIPLE_TIPS_1)) {
            if (courseById.getCourseName().equals(Constants.COURSE_DEPRESSION)) {
                this.f22572u.setText("Your smartphone could be making you depressed.");
                this.f22573v.setText("Smartphone usage is linked to depression and anxiety. Overusing your smartphone could negatively impact your sleep and also worsen your mood.");
            } else if (courseById.getCourseName().equals(Constants.COURSE_HAPPINESS)) {
                this.f22572u.setText("Smiling can actually make you happier.");
                this.f22573v.setText("When you smile (even if you don't feel like doing it), the muscles in your face move in a particular way, signalling to your brain that you are happy. This can actually make you feel happy.");
            } else if (courseById.getCourseName().equals(Constants.COURSE_WORRY)) {
                this.f22572u.setText("You can worry about different things at once.");
                this.f22573v.setText("From worrying about nothing in particular to worrying about a specific event - such as a social interaction, an upcoming presentation, or your daily commute - worry can take different forms.");
            } else if (courseById.getCourseName().equals(Constants.COURSE_ANGER)) {
                this.f22572u.setText("Anger can lead to frequent changes in weight.");
                this.f22573v.setText("Frequent episodes of anger can lead to increased levels of the stress hormone cortisol. As a result, your body starts to store food instead of utilising it to provide energy - leading to weight gain.");
            }
        } else if (stringExtra.equals(Constants.SCREEN_MULTIPLE_TIPS_2)) {
            if (courseById.getCourseName().equals(Constants.COURSE_DEPRESSION)) {
                this.f22572u.setText("Getting a good night's rest can improve your mood.");
                this.f22573v.setText("Sleep deprivation impacts the part of your brain that controls the way you feel. Over time, poor sleep can have an impact on your mood, making you feel sad and thus lowering your well-being.");
            } else if (courseById.getCourseName().equals(Constants.COURSE_HAPPINESS)) {
                this.f22572u.setText("Music with faster rhythms can make you feel happier.");
                this.f22573v.setText("Research has shown that listening to music with a cheerful rhythm can be quite effective in giving your mood a quick boost.");
            } else if (courseById.getCourseName().equals(Constants.COURSE_WORRY)) {
                this.f22572u.setText("Telling yourself not to worry might cause you to worry even more.");
                this.f22573v.setText("Research has shown that when you try to not worry about something, your mind tries to 'monitor' whether or not you are successful in your effort. As a result, you might find that your worry stays in your head longer.");
            } else if (courseById.getCourseName().equals(Constants.COURSE_ANGER)) {
                this.f22572u.setText("Laughing can help reduce your anger.");
                this.f22573v.setText("Studies have found that laughter can reduce anger. Laughing can also lower stress levels and lead you to look at a situation in a less negative light.");
            }
        }
        view.findViewById(R.id.cancel).setOnClickListener(new r8(8, this));
        RobertoButton robertoButton = (RobertoButton) view.findViewById(R.id.tap);
        robertoButton.setText("NEXT");
        robertoButton.setOnClickListener(new View$OnClickListenerC0341a());
        try {
            ((GifImageView) view.findViewById(R.id.mascot)).setImageDrawable(new pl.droidsonroids.gif.b(getResources(), (int) R.raw.mascot_tips));
        } catch (IOException e10) {
            LogHelper.INSTANCE.e(e10);
        }
    }
}
