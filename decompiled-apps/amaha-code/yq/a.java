package yq;

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
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
/* compiled from: HappinessMindfullnessIntro.java */
/* loaded from: classes2.dex */
public class a extends rr.b {

    /* renamed from: u  reason: collision with root package name */
    public Animation f38883u;

    /* renamed from: v  reason: collision with root package name */
    public String[] f38884v;

    /* renamed from: w  reason: collision with root package name */
    public int f38885w;

    /* renamed from: x  reason: collision with root package name */
    public RobertoTextView f38886x;

    /* compiled from: HappinessMindfullnessIntro.java */
    /* renamed from: yq.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class View$OnClickListenerC0658a implements View.OnClickListener {
        public View$OnClickListenerC0658a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            a.this.getActivity().finish();
        }
    }

    /* compiled from: HappinessMindfullnessIntro.java */
    /* loaded from: classes2.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            a aVar = a.this;
            int i6 = aVar.f38885w + 1;
            aVar.f38885w = i6;
            if (i6 < aVar.f38884v.length) {
                aVar.f38886x.setAnimation(aVar.f38883u);
                aVar.f38886x.setText(aVar.f38884v[aVar.f38885w]);
                aVar.f38883u.setDuration(500L);
                aVar.f38883u.start();
                return;
            }
            ((rr.a) aVar.getActivity()).t0();
        }
    }

    /* compiled from: HappinessMindfullnessIntro.java */
    /* loaded from: classes2.dex */
    public class c extends a5.f<Drawable> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ View f38889x;

        public c(View view) {
            this.f38889x = view;
        }

        @Override // a5.h
        public final void f(Object obj) {
            this.f38889x.findViewById(R.id.constraintLayout).setBackground((Drawable) obj);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_intro, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ((ImageView) view.findViewById(R.id.header_arrow_back)).setOnClickListener(new View$OnClickListenerC0658a());
        UiUtils.Companion.increaseImageClickArea((ImageView) view.findViewById(R.id.header_arrow_back));
        ((RobertoButton) view.findViewById(R.id.tap)).setOnClickListener(new b());
        Glide.h(this).o(Integer.valueOf((int) R.drawable.template_background)).z(new c(view));
        FirebasePersistence.getInstance().getCourseById(FirebasePersistence.getInstance().getUser().getCurrentCourse());
        this.f38886x = (RobertoTextView) view.findViewById(R.id.desc);
        this.f38883u = AnimationUtils.loadAnimation(getContext(), R.anim.text_slide_right);
        int i6 = getArguments().getInt("screen_sequence", 1);
        if (i6 == 1) {
            ((RobertoTextView) view.findViewById(R.id.header)).setText("Your Mindfulness Activities");
            this.f38884v = new String[]{"Mindfulness is the practise of being aware of and paying attention to your environment in a non-judgmental way.", "It is associated with more positive emotions, higher levels of life satisfaction, self-esteem, optimism and competence."};
        } else if (i6 == 2) {
            ((RobertoTextView) view.findViewById(R.id.header)).setText("Your Mindfulness Activity");
            this.f38884v = new String[]{"Mindfulness is a state of awareness which involves paying attention to your thoughts, feelings or surroundings in a non-judgmental way. Research has shown that mindfulness has a positive impact on mental, emotional and physical health.", "Practising mindfulness activities can help you focus better and even feel happier. Other benefits include improved immunity and an enhanced ability to cope with stress."};
        }
        this.f38886x.setText(this.f38884v[0]);
    }
}
