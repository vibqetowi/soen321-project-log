package ir;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.TipsActivity;
import com.theinnerhour.b2b.model.Course;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
/* compiled from: ThoughtBlog1Fragment.java */
/* loaded from: classes2.dex */
public class d extends rr.b {

    /* renamed from: u  reason: collision with root package name */
    public ImageView f20587u;

    /* renamed from: v  reason: collision with root package name */
    public Animation f20588v;

    /* renamed from: w  reason: collision with root package name */
    public String[] f20589w;

    /* renamed from: x  reason: collision with root package name */
    public int f20590x;

    /* renamed from: y  reason: collision with root package name */
    public RobertoTextView f20591y;

    /* compiled from: ThoughtBlog1Fragment.java */
    /* loaded from: classes2.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            d dVar = d.this;
            int i6 = dVar.f20590x + 1;
            dVar.f20590x = i6;
            if (i6 < dVar.f20589w.length) {
                dVar.f20591y.setAnimation(dVar.f20588v);
                dVar.f20591y.setText(dVar.f20589w[dVar.f20590x]);
                dVar.f20588v.setDuration(500L);
                dVar.f20588v.start();
                return;
            }
            ((TipsActivity) dVar.getActivity()).t0();
        }
    }

    /* compiled from: ThoughtBlog1Fragment.java */
    /* loaded from: classes2.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            d.this.getActivity().finish();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.thought_blog_1, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ((RobertoButton) view.findViewById(R.id.tap)).setOnClickListener(new a());
        ImageView imageView = (ImageView) view.findViewById(R.id.header_arrow_back);
        this.f20587u = imageView;
        UiUtils.Companion.increaseImageClickArea(imageView);
        this.f20587u.setOnClickListener(new b());
        this.f20591y = (RobertoTextView) view.findViewById(R.id.desc);
        Course courseById = FirebasePersistence.getInstance().getCourseById(defpackage.c.n());
        this.f20588v = AnimationUtils.loadAnimation(getContext(), R.anim.text_slide_right);
        new ArrayList();
        if (courseById.getCourseName().equals(Constants.COURSE_STRESS)) {
            String[] strArr = {"When you experience a stressful event, you often automatically begin to engage in negative thinking. For example 'I can never do this' or 'No one can help me'.", "These unhelpful thoughts can make you feel helpless and cause you to feel more stressed.", "Identifying these thinking patterns and then challenging them helps you think positively. ", "This helps you behave in a postive manner and increases your ability to deal with the stress."};
            this.f20589w = strArr;
            this.f20591y.setText(strArr[0]);
        } else if (courseById.getCourseName().equals(Constants.COURSE_DEPRESSION)) {
            String[] strArr2 = {"When things are not going well, you might often begin to automatically engage in negative thinking. For example, you might think, \"I can never do this\" or \"No one can help me.\"", "These unhelpful thoughts can make you feel helpless and cause you to feel even more sad.", "Identifying and challenging your negative thinking patterns can help you to look at situations in a more positive light.", "This has been shown to help you behave in healthier ways and increases your ability to manage your mood."};
            this.f20589w = strArr2;
            this.f20591y.setText(strArr2[0]);
        } else if (courseById.getCourseName().equals(Constants.COURSE_WORRY)) {
            String[] strArr3 = {"When you experience a stressful event, you often automatically begin to engage in negative thinking. For example \"I can never do this\" or \"No one can help me\".", "These unhelpful thoughts can make you feel helpless and cause you to feel more stressed.", "Identifying negative thinking patterns and challenging them can help you think positively", "This helps you behave in a postive manner and increases your ability to deal with the stress."};
            this.f20589w = strArr3;
            this.f20591y.setText(strArr3[0]);
        } else if (courseById.getCourseName().equals(Constants.COURSE_ANGER)) {
            String[] strArr4 = {"When an upsetting event takes place, you might automatically begin to think negatively. Unhelpful thoughts like, \"I can never do this,\" or \"No one can help me,\" can make you feel helpless and angry.", "Identifying your negative thought patterns and taking steps to change them can help you develop positive thinking. As a result, you will end up behaving in healthy ways and manage your anger better."};
            this.f20589w = strArr4;
            this.f20591y.setText(strArr4[0]);
        }
    }
}
