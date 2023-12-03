package uq;

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
import com.theinnerhour.b2b.activity.EnduringActivity;
import com.theinnerhour.b2b.model.Course;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.MascotAnimationUtils;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
/* compiled from: EnduringInitialFragment.java */
/* loaded from: classes2.dex */
public class a extends rr.b {

    /* renamed from: u  reason: collision with root package name */
    public ImageView f34449u;

    /* renamed from: v  reason: collision with root package name */
    public Animation f34450v;

    /* renamed from: w  reason: collision with root package name */
    public String[] f34451w;

    /* renamed from: x  reason: collision with root package name */
    public int f34452x;

    /* renamed from: y  reason: collision with root package name */
    public RobertoTextView f34453y;

    /* compiled from: EnduringInitialFragment.java */
    /* renamed from: uq.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0580a extends a5.f<Drawable> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ View f34454x;

        public C0580a(View view) {
            this.f34454x = view;
        }

        @Override // a5.h
        public final void f(Object obj) {
            this.f34454x.findViewById(R.id.constraintLayout).setBackground((Drawable) obj);
        }
    }

    /* compiled from: EnduringInitialFragment.java */
    /* loaded from: classes2.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            a aVar = a.this;
            int i6 = aVar.f34452x + 1;
            aVar.f34452x = i6;
            if (i6 < aVar.f34451w.length) {
                aVar.f34453y.setAnimation(aVar.f34450v);
                aVar.f34453y.setText(aVar.f34451w[aVar.f34452x]);
                aVar.f34450v.setDuration(500L);
                aVar.f34450v.start();
                return;
            }
            ((EnduringActivity) aVar.getActivity()).A.clear();
            ((EnduringActivity) aVar.getActivity()).t0();
        }
    }

    /* compiled from: EnduringInitialFragment.java */
    /* loaded from: classes2.dex */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            a.this.getActivity().finish();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_enduring_initial, viewGroup, false);
        Glide.h(this).o(Integer.valueOf((int) R.drawable.template_background)).z(new C0580a(inflate));
        ((RobertoButton) inflate.findViewById(R.id.tap)).setOnClickListener(new b());
        this.f34453y = (RobertoTextView) inflate.findViewById(R.id.desc);
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ImageView imageView = (ImageView) view.findViewById(R.id.header_arrow_back);
        this.f34449u = imageView;
        UiUtils.Companion.increaseImageClickArea(imageView);
        this.f34449u.setOnClickListener(new c());
        Course courseById = FirebasePersistence.getInstance().getCourseById(FirebasePersistence.getInstance().getUser().getCurrentCourse());
        new ArrayList();
        this.f34450v = AnimationUtils.loadAnimation(getContext(), R.anim.text_slide_right);
        if (courseById.getCourseName().equals(Constants.COURSE_STRESS)) {
            String[] strArr = {"Take steps to feel better.\nIt is important to equip yourself with skills and develop healthy habits so that you are less likely to become stressed in the long run.", "Engaging in certain behaviours on a regular basis can also help you deal with stress in a healthy way. Try setting simple goals to practise these behaviours everyday."};
            this.f34451w = strArr;
            this.f34453y.setText(strArr[0]);
        } else if (courseById.getCourseName().equals(Constants.COURSE_DEPRESSION)) {
            String[] strArr2 = {"Take steps to feel better.\nIt is important to prepare your body to deal with upsetting situations before they occur.", "Engaging in certain behaviours on a regular basis can help you manage your mood better and protect you from feeling low. Try setting simple goals to practise these behaviours everyday."};
            this.f34451w = strArr2;
            this.f34453y.setText(strArr2[0]);
        } else if (courseById.getCourseName().equals(Constants.COURSE_SLEEP)) {
            String[] strArr3 = {"When you engage in certain activities at the same time every night, your body learns to associate these activities with bedtime. As a result, just by engaging in these activities, you can start to feel sleepy."};
            this.f34451w = strArr3;
            this.f34453y.setText(strArr3[0]);
        } else if (courseById.getCourseName().equals(Constants.COURSE_HAPPINESS)) {
            String[] strArr4 = {"Take steps to feel happier.\nCertain situations could make you feel upset, but by developing healthy habits, you can help yourself feel happier. Try setting simple goals to practise these behaviours everyday."};
            this.f34451w = strArr4;
            this.f34453y.setText(strArr4[0]);
        } else if (courseById.getCourseName().equals(Constants.COURSE_WORRY)) {
            String[] strArr5 = {"It is important to prepare your body to deal with situations that can cause worry. Engaging in certain behaviours on a regular basis can help you manage your worry better. Set simple goals to practise these behaviours daily."};
            this.f34451w = strArr5;
            this.f34453y.setText(strArr5[0]);
        } else if (courseById.getCourseName().equals(Constants.COURSE_ANGER)) {
            String[] strArr6 = {"Take steps to feel better. \nIt is important to equip yourself with skills and develop healthy habits so that you are less likely to become angry in the long run. ", "Engaging in certain behaviours on a regular basis can also help you deal with anger in a healthy way. Try setting simple goals to practise these behaviours everyday."};
            this.f34451w = strArr6;
            this.f34453y.setText(strArr6[0]);
        }
        new MascotAnimationUtils().initMascot(view, getClass().getSimpleName(), Constants.SCREEN_COPING, "Hello, champ!", "You know what they say - consistency is key! Start today by setting a few goals.", "OK, GOT IT", null);
    }
}
