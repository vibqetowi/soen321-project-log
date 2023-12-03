package wq;

import a5.f;
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
/* compiled from: HappinessAndEnviromentIntro.java */
/* loaded from: classes2.dex */
public class a extends rr.b {

    /* renamed from: u  reason: collision with root package name */
    public Animation f37045u;

    /* renamed from: v  reason: collision with root package name */
    public String[] f37046v;

    /* renamed from: w  reason: collision with root package name */
    public int f37047w;

    /* renamed from: x  reason: collision with root package name */
    public RobertoTextView f37048x;

    /* compiled from: HappinessAndEnviromentIntro.java */
    /* renamed from: wq.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class View$OnClickListenerC0622a implements View.OnClickListener {
        public View$OnClickListenerC0622a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            a.this.getActivity().finish();
        }
    }

    /* compiled from: HappinessAndEnviromentIntro.java */
    /* loaded from: classes2.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            a aVar = a.this;
            int i6 = aVar.f37047w + 1;
            aVar.f37047w = i6;
            if (i6 < aVar.f37046v.length) {
                aVar.f37048x.setAnimation(aVar.f37045u);
                aVar.f37048x.setText(aVar.f37046v[aVar.f37047w]);
                aVar.f37045u.setDuration(500L);
                aVar.f37045u.start();
                return;
            }
            ((rr.a) aVar.getActivity()).t0();
        }
    }

    /* compiled from: HappinessAndEnviromentIntro.java */
    /* loaded from: classes2.dex */
    public class c extends f<Drawable> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ View f37051x;

        public c(View view) {
            this.f37051x = view;
        }

        @Override // a5.h
        public final void f(Object obj) {
            this.f37051x.findViewById(R.id.constraintLayout).setBackground((Drawable) obj);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_intro, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ((ImageView) view.findViewById(R.id.header_arrow_back)).setOnClickListener(new View$OnClickListenerC0622a());
        UiUtils.Companion.increaseImageClickArea((ImageView) view.findViewById(R.id.header_arrow_back));
        ((RobertoButton) view.findViewById(R.id.tap)).setOnClickListener(new b());
        Glide.h(this).o(Integer.valueOf((int) R.drawable.template_background)).z(new c(view));
        FirebasePersistence.getInstance().getCourseById(FirebasePersistence.getInstance().getUser().getCurrentCourse());
        this.f37048x = (RobertoTextView) view.findViewById(R.id.desc);
        this.f37045u = AnimationUtils.loadAnimation(getContext(), R.anim.text_slide_right);
        ((RobertoTextView) view.findViewById(R.id.header)).setText("Happiness Around You");
        String[] strArr = {"Happiness is within your reach. There are several factors in your environment that can influence how happy you are, and while you may not be able to control what happens around you, you can certainly take some steps to feel happier."};
        this.f37046v = strArr;
        this.f37048x.setText(strArr[0]);
    }
}
