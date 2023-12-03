package dq;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import com.bumptech.glide.Glide;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.model.Course;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
/* compiled from: ActivitySchedulingIntro1Fragment.java */
/* loaded from: classes2.dex */
public class c extends rr.b {

    /* renamed from: u  reason: collision with root package name */
    public Animation f13198u;

    /* renamed from: v  reason: collision with root package name */
    public String[] f13199v;

    /* renamed from: w  reason: collision with root package name */
    public int f13200w;

    /* renamed from: x  reason: collision with root package name */
    public RobertoTextView f13201x;

    /* compiled from: ActivitySchedulingIntro1Fragment.java */
    /* loaded from: classes2.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            c.this.getActivity().finish();
        }
    }

    /* compiled from: ActivitySchedulingIntro1Fragment.java */
    /* loaded from: classes2.dex */
    public class b extends a5.f<Drawable> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ View f13203x;

        public b(View view) {
            this.f13203x = view;
        }

        @Override // a5.h
        public final void f(Object obj) {
            this.f13203x.findViewById(R.id.constraintLayout).setBackground((Drawable) obj);
        }
    }

    /* compiled from: ActivitySchedulingIntro1Fragment.java */
    /* renamed from: dq.c$c  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class View$OnClickListenerC0193c implements View.OnClickListener {
        public View$OnClickListenerC0193c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            c cVar = c.this;
            int i6 = cVar.f13200w + 1;
            cVar.f13200w = i6;
            if (i6 < cVar.f13199v.length) {
                cVar.f13201x.setAnimation(cVar.f13198u);
                cVar.f13201x.setText(cVar.f13199v[cVar.f13200w]);
                cVar.f13198u.setDuration(500L);
                cVar.f13198u.start();
                return;
            }
            ((rr.a) cVar.getActivity()).t0();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_activity_scheduling_intro, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ((ImageView) view.findViewById(R.id.header_arrow_back)).setOnClickListener(new a());
        Glide.h(this).o(Integer.valueOf((int) R.drawable.template_background)).z(new b(view));
        UiUtils.Companion.increaseImageClickArea((ImageView) view.findViewById(R.id.header_arrow_back));
        ((RobertoButton) view.findViewById(R.id.tap)).setOnClickListener(new View$OnClickListenerC0193c());
        try {
            Course courseById = FirebasePersistence.getInstance().getCourseById(FirebasePersistence.getInstance().getUser().getCurrentCourse());
            this.f13201x = (RobertoTextView) view.findViewById(R.id.desc);
            this.f13198u = AnimationUtils.loadAnimation(getContext(), R.anim.text_slide_right);
            new ArrayList();
            if (courseById.getCourseName().equals(Constants.COURSE_DEPRESSION)) {
                this.f13199v = new String[]{"Low mood can have an impact on your routine and your behaviours. Lack of motivation can make you neglect daily tasks and can prevent you from interacting with others.", "A decline in your activity levels can make you feel lethargic - reducing motivation and worsening mood. This may cause you to think about all your pending tasks, which can make you feel overwhelmed and low.", "A technique called Activity Scheduling ensures that you engage in activities that you enjoy and that give you a sense of accomplishment. By following this technique, you can create your own Happiness Tasks."};
            } else if (courseById.getCourseName().equals(Constants.COURSE_HAPPINESS)) {
                this.f13199v = new String[]{"Engaging in certain activities can help you think and behave more positively - in turn making you happy.", "A decline in activity levels can make you feel lethargic - reducing your motivation and making you feel unhappy. This may cause you to think about all your pending tasks, which can make you feel overwhelmed and upset.", "Scheduling and engaging in activities that you enjoy and that give you a sense of accomplishment can help you feel happier. By following this simple scheduling technique, you can create your own Happiness Tasks."};
            }
            this.f13201x.setText(this.f13199v[0]);
            ((RobertoTextView) view.findViewById(R.id.header)).setText("Your Happiness Tasks");
        } catch (Exception e10) {
            LogHelper.INSTANCE.e("activityschedulingintro", "exception in on create.", e10);
            getActivity().finish();
        }
    }
}
