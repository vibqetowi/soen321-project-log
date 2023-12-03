package er;

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
import com.theinnerhour.b2b.activity.SleepTimeTableActivity;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
/* compiled from: SleepTimeTableIntroFragment.java */
/* loaded from: classes2.dex */
public class o extends rr.b {

    /* renamed from: u  reason: collision with root package name */
    public ImageView f14531u;

    /* renamed from: v  reason: collision with root package name */
    public Animation f14532v;

    /* renamed from: w  reason: collision with root package name */
    public String[] f14533w;

    /* renamed from: x  reason: collision with root package name */
    public int f14534x;

    /* renamed from: y  reason: collision with root package name */
    public RobertoTextView f14535y;

    /* compiled from: SleepTimeTableIntroFragment.java */
    /* loaded from: classes2.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            o oVar = o.this;
            int i6 = oVar.f14534x + 1;
            oVar.f14534x = i6;
            if (i6 < oVar.f14533w.length) {
                oVar.f14535y.setAnimation(oVar.f14532v);
                oVar.f14535y.setText(oVar.f14533w[oVar.f14534x]);
                oVar.f14532v.setDuration(500L);
                oVar.f14532v.start();
                return;
            }
            ((SleepTimeTableActivity) oVar.getActivity()).t0();
        }
    }

    /* compiled from: SleepTimeTableIntroFragment.java */
    /* loaded from: classes2.dex */
    public class b extends a5.f<Drawable> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ View f14537x;

        public b(View view) {
            this.f14537x = view;
        }

        @Override // a5.h
        public final void f(Object obj) {
            this.f14537x.findViewById(R.id.constraintLayout).setBackground((Drawable) obj);
        }
    }

    /* compiled from: SleepTimeTableIntroFragment.java */
    /* loaded from: classes2.dex */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            o.this.getActivity().finish();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_sleep_timetable_intro, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ((RobertoButton) view.findViewById(R.id.tap)).setOnClickListener(new a());
        Glide.h(this).o(Integer.valueOf((int) R.drawable.template_background)).z(new b(view));
        FirebasePersistence.getInstance().getCourseById(FirebasePersistence.getInstance().getUser().getCurrentCourse());
        this.f14535y = (RobertoTextView) view.findViewById(R.id.desc);
        this.f14532v = AnimationUtils.loadAnimation(getContext(), R.anim.text_slide_right);
        new ArrayList();
        String[] strArr = {"Setting a sleep schedule can help you identify habits that stop you from getting a good night's rest.", "Set your sleep and wake times, track the activities you engage in just before and after your sleep, and set goals for healthier sleeping habits."};
        this.f14533w = strArr;
        this.f14535y.setText(strArr[0]);
        ImageView imageView = (ImageView) view.findViewById(R.id.header_arrow_back);
        this.f14531u = imageView;
        UiUtils.Companion.increaseImageClickArea(imageView);
        this.f14531u.setOnClickListener(new c());
    }
}
