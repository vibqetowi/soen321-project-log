package zq;

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
import com.theinnerhour.b2b.activity.ProblemSolvingActivity;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
/* compiled from: ProblemSolvingIntroFragment.java */
/* loaded from: classes2.dex */
public class c extends rr.b {
    public int A;

    /* renamed from: u  reason: collision with root package name */
    public RobertoTextView f39818u;

    /* renamed from: v  reason: collision with root package name */
    public RobertoTextView f39819v;

    /* renamed from: w  reason: collision with root package name */
    public RobertoButton f39820w;

    /* renamed from: x  reason: collision with root package name */
    public ImageView f39821x;

    /* renamed from: y  reason: collision with root package name */
    public Animation f39822y;

    /* renamed from: z  reason: collision with root package name */
    public String[] f39823z;

    /* compiled from: ProblemSolvingIntroFragment.java */
    /* loaded from: classes2.dex */
    public class a extends f<Drawable> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ View f39824x;

        public a(View view) {
            this.f39824x = view;
        }

        @Override // a5.h
        public final void f(Object obj) {
            this.f39824x.findViewById(R.id.constraintLayout).setBackground((Drawable) obj);
        }
    }

    /* compiled from: ProblemSolvingIntroFragment.java */
    /* loaded from: classes2.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            c cVar = c.this;
            int i6 = cVar.A + 1;
            cVar.A = i6;
            if (i6 < cVar.f39823z.length) {
                cVar.f39819v.setAnimation(cVar.f39822y);
                cVar.f39819v.setText(cVar.f39823z[cVar.A]);
                cVar.f39822y.setDuration(500L);
                cVar.f39822y.start();
                return;
            }
            ProblemSolvingActivity problemSolvingActivity = (ProblemSolvingActivity) cVar.getActivity();
            problemSolvingActivity.o0();
            problemSolvingActivity.f10462w++;
            problemSolvingActivity.p0(false, true);
        }
    }

    /* compiled from: ProblemSolvingIntroFragment.java */
    /* renamed from: zq.c$c  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class View$OnClickListenerC0684c implements View.OnClickListener {
        public View$OnClickListenerC0684c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            c.this.getActivity().finish();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_coping_intro, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f39820w = (RobertoButton) view.findViewById(R.id.tap);
        this.f39818u = (RobertoTextView) view.findViewById(R.id.Title);
        this.f39819v = (RobertoTextView) view.findViewById(R.id.desc);
        Glide.h(this).o(Integer.valueOf((int) R.drawable.template_background)).z(new a(view));
        FirebasePersistence.getInstance().getCourseById(FirebasePersistence.getInstance().getUser().getCurrentCourse());
        this.f39819v.getMeasuredWidth();
        this.f39822y = AnimationUtils.loadAnimation(getContext(), R.anim.text_slide_right);
        new ArrayList();
        this.f39818u.setText("Problem Solving");
        String[] strArr = {"Worrying is a repetitive cycle of negative thoughts which prevent us from thinking clearly while problem solving involves actually coming up with ways to address and deal with a situation.", "If you find yourself stuck in a negative cycle of worry without being able to actually deal with your problems, here's what you can try."};
        this.f39823z = strArr;
        this.f39819v.setText(strArr[0]);
        this.f39820w.setOnClickListener(new b());
        ImageView imageView = (ImageView) view.findViewById(R.id.header_arrow_back);
        this.f39821x = imageView;
        UiUtils.Companion.increaseImageClickArea(imageView);
        this.f39821x.setOnClickListener(new View$OnClickListenerC0684c());
    }
}
