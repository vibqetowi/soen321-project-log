package gr;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bumptech.glide.Glide;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.SymptomsActivity;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
/* compiled from: StressCycleIntroFragment.java */
/* loaded from: classes2.dex */
public class e extends rr.b {

    /* renamed from: u  reason: collision with root package name */
    public RobertoTextView f16733u;

    /* renamed from: v  reason: collision with root package name */
    public RobertoTextView f16734v;

    /* compiled from: StressCycleIntroFragment.java */
    /* loaded from: classes2.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ((SymptomsActivity) e.this.getActivity()).o0();
        }
    }

    /* compiled from: StressCycleIntroFragment.java */
    /* loaded from: classes2.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            e.this.getActivity().finish();
        }
    }

    /* compiled from: StressCycleIntroFragment.java */
    /* loaded from: classes2.dex */
    public class c extends a5.f<Drawable> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ View f16737x;

        public c(View view) {
            this.f16737x = view;
        }

        @Override // a5.h
        public final void f(Object obj) {
            this.f16737x.findViewById(R.id.constraintLayout).setBackground((Drawable) obj);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.stress_cycle_intro, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f16733u = (RobertoTextView) view.findViewById(R.id.header);
        this.f16734v = (RobertoTextView) view.findViewById(R.id.desc);
        if (SymptomsActivity.B.equals(Constants.COURSE_DEPRESSION)) {
            this.f16733u.setText("Mind and Body");
            this.f16734v.setText("How do you know if your sadness is temporary, or if it's something that you should be concerned about? It is important for you to know how low mood could manifest itself in the way you think, feel and behave.");
        } else if (SymptomsActivity.B.equals(Constants.COURSE_STRESS)) {
            this.f16733u.setText("The Stress Cycle");
            this.f16734v.setText("Experiencing stress over a long period of time can have a negative impact on your body. Read on to learn more about this stress cycle.");
        } else if (SymptomsActivity.B.equals(Constants.COURSE_WORRY)) {
            this.f16733u.setText("The Worry Cycle");
            this.f16734v.setText("At times when you worry, you may find yourself stuck in a cycle of worrying thoughts and unhelpful behaviours. It is important to understand this cycle first, so you can then break it.");
        } else if (SymptomsActivity.B.equals(Constants.COURSE_ANGER)) {
            this.f16733u.setText("The Anger Cycle");
            this.f16734v.setText("When you are angry, you may find yourself stuck in a cycle of negative thoughts and unhelpful or even unhealthy behaviour that might only worsen your anger. Understanding this cycle will help you break unhealthy patterns.");
        }
        ((RobertoButton) view.findViewById(R.id.tap)).setOnClickListener(new a());
        ((ImageView) view.findViewById(R.id.header_arrow_back)).setOnClickListener(new b());
        Glide.h(this).o(Integer.valueOf((int) R.drawable.template_background)).z(new c(view));
    }
}
