package iq;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.CausesActivity;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
/* compiled from: SleepCauseIntroFragment.java */
/* loaded from: classes2.dex */
public class k extends rr.b {

    /* renamed from: u  reason: collision with root package name */
    public ImageView f20552u;

    /* renamed from: v  reason: collision with root package name */
    public Animation f20553v;

    /* renamed from: w  reason: collision with root package name */
    public String[] f20554w;

    /* renamed from: x  reason: collision with root package name */
    public int f20555x;

    /* renamed from: y  reason: collision with root package name */
    public RobertoTextView f20556y;

    /* compiled from: SleepCauseIntroFragment.java */
    /* loaded from: classes2.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            k kVar = k.this;
            int i6 = kVar.f20555x + 1;
            kVar.f20555x = i6;
            if (i6 < kVar.f20554w.length) {
                kVar.f20556y.setAnimation(kVar.f20553v);
                kVar.f20556y.setText(kVar.f20554w[kVar.f20555x]);
                kVar.f20553v.setDuration(500L);
                kVar.f20553v.start();
                return;
            }
            ((CausesActivity) kVar.getActivity()).t0();
        }
    }

    /* compiled from: SleepCauseIntroFragment.java */
    /* loaded from: classes2.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            k.this.getActivity().finish();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_sleep_causes_intro, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ((RobertoButton) view.findViewById(R.id.tap)).setOnClickListener(new a());
        this.f20556y = (RobertoTextView) view.findViewById(R.id.desc);
        ImageView imageView = (ImageView) view.findViewById(R.id.header_arrow_back);
        this.f20552u = imageView;
        UiUtils.Companion.increaseImageClickArea(imageView);
        this.f20552u.setOnClickListener(new b());
        this.f20553v = AnimationUtils.loadAnimation(getContext(), R.anim.text_slide_right);
        new ArrayList();
        String[] strArr = {"If you are having difficulty falling or staying asleep, it is important to identify the causes of your sleep disturbance.", "Start sleeping better by identifying the different lifestyle, environmental and food-related causes for your poor sleep."};
        this.f20554w = strArr;
        this.f20556y.setText(strArr[0]);
    }
}
