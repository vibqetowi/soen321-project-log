package vq;

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
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
/* compiled from: GratitudeJournalIntroFragment.java */
/* loaded from: classes2.dex */
public class a extends rr.b {

    /* renamed from: u  reason: collision with root package name */
    public Animation f35346u;

    /* renamed from: v  reason: collision with root package name */
    public String[] f35347v;

    /* renamed from: w  reason: collision with root package name */
    public int f35348w;

    /* renamed from: x  reason: collision with root package name */
    public RobertoTextView f35349x;

    /* compiled from: GratitudeJournalIntroFragment.java */
    /* renamed from: vq.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class View$OnClickListenerC0600a implements View.OnClickListener {
        public View$OnClickListenerC0600a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            a.this.getActivity().finish();
        }
    }

    /* compiled from: GratitudeJournalIntroFragment.java */
    /* loaded from: classes2.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            a aVar = a.this;
            int i6 = aVar.f35348w + 1;
            aVar.f35348w = i6;
            if (i6 < aVar.f35347v.length) {
                aVar.f35349x.setAnimation(aVar.f35346u);
                aVar.f35349x.setText(aVar.f35347v[aVar.f35348w]);
                aVar.f35346u.setDuration(500L);
                aVar.f35346u.start();
                return;
            }
            ((rr.a) aVar.getActivity()).t0();
        }
    }

    /* compiled from: GratitudeJournalIntroFragment.java */
    /* loaded from: classes2.dex */
    public class c extends f<Drawable> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ View f35352x;

        public c(View view) {
            this.f35352x = view;
        }

        @Override // a5.h
        public final void f(Object obj) {
            this.f35352x.findViewById(R.id.constraintLayout).setBackground((Drawable) obj);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_intro, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        view.findViewById(R.id.header_arrow_back).setOnClickListener(new View$OnClickListenerC0600a());
        UiUtils.Companion.increaseImageClickArea((ImageView) view.findViewById(R.id.header_arrow_back));
        view.findViewById(R.id.tap).setOnClickListener(new b());
        this.f35349x = (RobertoTextView) view.findViewById(R.id.desc);
        this.f35346u = AnimationUtils.loadAnimation(getContext(), R.anim.text_slide_right);
        new ArrayList();
        ((RobertoTextView) view.findViewById(R.id.header)).setText("Your Happiness Journal");
        Glide.h(this).o(Integer.valueOf((int) R.drawable.template_background)).z(new c(view));
        String[] strArr = {"If you are thankful for what you have, it helps you develop a more positive attitude. Being thankful can also protect you from stress, helping you feel healthier and happier.", "The Amaha Happiness Journal is a way for you to record the things that you are thankful for in your life. You can visit these memories from time to time to feel happier."};
        this.f35347v = strArr;
        this.f35349x.setText(strArr[0]);
    }
}
