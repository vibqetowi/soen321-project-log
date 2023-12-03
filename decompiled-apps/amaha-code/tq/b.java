package tq;

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
import java.util.ArrayList;
/* compiled from: DesigningHappinessIntroFragment.java */
/* loaded from: classes2.dex */
public class b extends rr.b {

    /* renamed from: u  reason: collision with root package name */
    public Animation f33427u;

    /* renamed from: v  reason: collision with root package name */
    public String[] f33428v;

    /* renamed from: w  reason: collision with root package name */
    public int f33429w;

    /* renamed from: x  reason: collision with root package name */
    public RobertoTextView f33430x;

    /* compiled from: DesigningHappinessIntroFragment.java */
    /* loaded from: classes2.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            b.this.getActivity().finish();
        }
    }

    /* compiled from: DesigningHappinessIntroFragment.java */
    /* renamed from: tq.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class View$OnClickListenerC0557b implements View.OnClickListener {
        public View$OnClickListenerC0557b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            b bVar = b.this;
            int i6 = bVar.f33429w + 1;
            bVar.f33429w = i6;
            if (i6 < bVar.f33428v.length) {
                bVar.f33430x.setAnimation(bVar.f33427u);
                bVar.f33430x.setText(bVar.f33428v[bVar.f33429w]);
                bVar.f33427u.setDuration(500L);
                bVar.f33427u.start();
                return;
            }
            ((rr.a) bVar.getActivity()).t0();
        }
    }

    /* compiled from: DesigningHappinessIntroFragment.java */
    /* loaded from: classes2.dex */
    public class c extends f<Drawable> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ View f33433x;

        public c(View view) {
            this.f33433x = view;
        }

        @Override // a5.h
        public final void f(Object obj) {
            this.f33433x.findViewById(R.id.constraintLayout).setBackground((Drawable) obj);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_intro, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ((ImageView) view.findViewById(R.id.header_arrow_back)).setOnClickListener(new a());
        UiUtils.Companion.increaseImageClickArea((ImageView) view.findViewById(R.id.header_arrow_back));
        ((RobertoButton) view.findViewById(R.id.tap)).setOnClickListener(new View$OnClickListenerC0557b());
        FirebasePersistence.getInstance().getCourseById(FirebasePersistence.getInstance().getUser().getCurrentCourse());
        this.f33430x = (RobertoTextView) view.findViewById(R.id.desc);
        this.f33427u = AnimationUtils.loadAnimation(getContext(), R.anim.text_slide_right);
        new ArrayList();
        Glide.h(this).o(Integer.valueOf((int) R.drawable.template_background)).z(new c(view));
        String[] strArr = {"Happiness means different things to different people. You have the power to be happier by doing things that make you happy. However, it is also important that you create the opportunity to carry out such activities.", "By making changes in your environment, you can make it easier for you to do what makes you happy. There are multiple steps to doing this. Let's learn these from an example."};
        this.f33428v = strArr;
        this.f33430x.setText(strArr[0]);
    }
}
