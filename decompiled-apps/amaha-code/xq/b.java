package xq;

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
/* compiled from: LocusOfControlIntro.java */
/* loaded from: classes2.dex */
public class b extends rr.b {

    /* renamed from: u  reason: collision with root package name */
    public Animation f37900u;

    /* renamed from: v  reason: collision with root package name */
    public String[] f37901v;

    /* renamed from: w  reason: collision with root package name */
    public int f37902w;

    /* renamed from: x  reason: collision with root package name */
    public RobertoTextView f37903x;

    /* compiled from: LocusOfControlIntro.java */
    /* loaded from: classes2.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            b.this.getActivity().finish();
        }
    }

    /* compiled from: LocusOfControlIntro.java */
    /* renamed from: xq.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class View$OnClickListenerC0640b implements View.OnClickListener {
        public View$OnClickListenerC0640b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            b bVar = b.this;
            int i6 = bVar.f37902w + 1;
            bVar.f37902w = i6;
            if (i6 < bVar.f37901v.length) {
                bVar.f37903x.setAnimation(bVar.f37900u);
                bVar.f37903x.setText(bVar.f37901v[bVar.f37902w]);
                bVar.f37900u.setDuration(500L);
                bVar.f37900u.start();
                return;
            }
            ((rr.a) bVar.getActivity()).t0();
        }
    }

    /* compiled from: LocusOfControlIntro.java */
    /* loaded from: classes2.dex */
    public class c extends f<Drawable> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ View f37906x;

        public c(View view) {
            this.f37906x = view;
        }

        @Override // a5.h
        public final void f(Object obj) {
            this.f37906x.findViewById(R.id.constraintLayout).setBackground((Drawable) obj);
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
        ((RobertoButton) view.findViewById(R.id.tap)).setOnClickListener(new View$OnClickListenerC0640b());
        Glide.h(this).o(Integer.valueOf((int) R.drawable.template_background)).z(new c(view));
        FirebasePersistence.getInstance().getCourseById(FirebasePersistence.getInstance().getUser().getCurrentCourse());
        this.f37903x = (RobertoTextView) view.findViewById(R.id.desc);
        this.f37900u = AnimationUtils.loadAnimation(getContext(), R.anim.text_slide_right);
        new ArrayList();
        int i6 = getArguments().getInt("screen_sequence", 1);
        if (i6 == 1) {
            ((RobertoTextView) view.findViewById(R.id.header)).setText("Being Optimistic");
            this.f37901v = new String[]{"Being optimistic can help you see things in a positive light and feel happier. An optimistic outlook is not an inborn quality. It can be learned by changing the way you understand and explain events in your life."};
        } else if (i6 == 2) {
            ((RobertoTextView) view.findViewById(R.id.header)).setText("Being Optimistic");
            this.f37901v = new String[]{"The way you explain an event in your life can make you feel happy or unhappy.\n\nWhen a negative event takes place, you can learn to look at it in an optimistic way - and feel less unhappy."};
        } else if (i6 == 3) {
            ((RobertoTextView) view.findViewById(R.id.header)).setText("Did You Know?");
            this.f37901v = new String[]{"It's possible to think negatively even about a positive event in your life.\n\nThis means that it is important to develop an optimistic outlook when a positive event occurs in your life.\n\nLet's look at an example."};
        }
        this.f37903x.setText(this.f37901v[0]);
    }
}
