package kq;

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
import com.theinnerhour.b2b.activity.CopingActivity;
import com.theinnerhour.b2b.model.Course;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
/* compiled from: CopingIntroFragment.java */
/* loaded from: classes2.dex */
public class b extends rr.b {
    public int A;

    /* renamed from: u  reason: collision with root package name */
    public RobertoTextView f23778u;

    /* renamed from: v  reason: collision with root package name */
    public RobertoTextView f23779v;

    /* renamed from: w  reason: collision with root package name */
    public RobertoButton f23780w;

    /* renamed from: x  reason: collision with root package name */
    public ImageView f23781x;

    /* renamed from: y  reason: collision with root package name */
    public Animation f23782y;

    /* renamed from: z  reason: collision with root package name */
    public String[] f23783z;

    /* compiled from: CopingIntroFragment.java */
    /* loaded from: classes2.dex */
    public class a extends a5.f<Drawable> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ View f23784x;

        public a(View view) {
            this.f23784x = view;
        }

        @Override // a5.h
        public final void f(Object obj) {
            this.f23784x.findViewById(R.id.constraintLayout).setBackground((Drawable) obj);
        }
    }

    /* compiled from: CopingIntroFragment.java */
    /* renamed from: kq.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class View$OnClickListenerC0368b implements View.OnClickListener {
        public View$OnClickListenerC0368b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            b bVar = b.this;
            int i6 = bVar.A + 1;
            bVar.A = i6;
            if (i6 < bVar.f23783z.length) {
                bVar.f23779v.setAnimation(bVar.f23782y);
                bVar.f23779v.setText(bVar.f23783z[bVar.A]);
                bVar.f23782y.setDuration(500L);
                bVar.f23782y.start();
                return;
            }
            ((CopingActivity) bVar.getActivity()).t0();
        }
    }

    /* compiled from: CopingIntroFragment.java */
    /* loaded from: classes2.dex */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            b.this.getActivity().finish();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_coping_intro, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f23780w = (RobertoButton) view.findViewById(R.id.tap);
        this.f23778u = (RobertoTextView) view.findViewById(R.id.Title);
        this.f23779v = (RobertoTextView) view.findViewById(R.id.desc);
        Glide.h(this).o(Integer.valueOf((int) R.drawable.template_background)).z(new a(view));
        try {
            Course courseById = FirebasePersistence.getInstance().getCourseById(FirebasePersistence.getInstance().getUser().getCurrentCourse());
            this.f23779v.getMeasuredWidth();
            this.f23782y = AnimationUtils.loadAnimation(getContext(), R.anim.text_slide_right);
            new ArrayList();
            if (courseById.getCourseName().equals(Constants.COURSE_STRESS)) {
                this.f23778u.setText("Coping with\nStress");
                String[] strArr = {"When stressed, you might often feel overwhelmed, which prevents you from dealing effectively with the environment.", "Some activities can help you feel less stressed. By practising them regularly, you may not only experience lesser stress but can also feel calmer and better-prepared to deal with life."};
                this.f23783z = strArr;
                this.f23779v.setText(strArr[0]);
            } else if (courseById.getCourseName().equals(Constants.COURSE_DEPRESSION)) {
                this.f23778u.setText("Activities to Improve Mood");
                String[] strArr2 = {"Feeling sad or upset might make you unable to deal with situations that require your attention.", "When your mood prevents you from solving problems effectively, you can try engaging in coping activities to feel better."};
                this.f23783z = strArr2;
                this.f23779v.setText(strArr2[0]);
            } else if (courseById.getCourseName().equals(Constants.COURSE_WORRY)) {
                this.f23778u.setText("Coping with\nWorry");
                String[] strArr3 = {"At times, you may worry so much that you feel overwhelmed, helpless, or ill-equipped to deal with a problem.", "When this happens, you can try practising activities that can help you cope with worry and feel better."};
                this.f23783z = strArr3;
                this.f23779v.setText(strArr3[0]);
            } else if (courseById.getCourseName().equals(Constants.COURSE_ANGER)) {
                this.f23778u.setText("Coping with\nAnger");
                String[] strArr4 = {"When you feel angry, you may find it hard to think clearly, concentrate or deal well with situations.", "However, you can still channelise your anger in healthy ways by trying these coping activities to feel better."};
                this.f23783z = strArr4;
                this.f23779v.setText(strArr4[0]);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(Constants.ONBOARDING_VARIANT, "View not found", e10);
            getActivity().onBackPressed();
        }
        this.f23780w.setOnClickListener(new View$OnClickListenerC0368b());
        ImageView imageView = (ImageView) view.findViewById(R.id.header_arrow_back);
        this.f23781x = imageView;
        UiUtils.Companion.increaseImageClickArea(imageView);
        this.f23781x.setOnClickListener(new c());
    }
}
