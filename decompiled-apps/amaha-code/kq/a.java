package kq;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.CopingActivity;
import com.theinnerhour.b2b.model.Coping;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.UiUtils;
/* compiled from: CopingFeelingFragment.java */
/* loaded from: classes2.dex */
public class a extends rr.b implements View.OnClickListener {
    public ImageView A;
    public Coping B;

    /* renamed from: u  reason: collision with root package name */
    public LinearLayout f23770u;

    /* renamed from: v  reason: collision with root package name */
    public LinearLayout f23771v;

    /* renamed from: w  reason: collision with root package name */
    public LinearLayout f23772w;

    /* renamed from: x  reason: collision with root package name */
    public LinearLayout f23773x;

    /* renamed from: y  reason: collision with root package name */
    public LinearLayout f23774y;

    /* renamed from: z  reason: collision with root package name */
    public LinearLayout f23775z;

    /* compiled from: CopingFeelingFragment.java */
    /* renamed from: kq.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class View$OnClickListenerC0367a implements View.OnClickListener {
        public View$OnClickListenerC0367a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ((CopingActivity) a.this.getActivity()).t0();
        }
    }

    /* compiled from: CopingFeelingFragment.java */
    /* loaded from: classes2.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            a.this.getActivity().finish();
        }
    }

    public a() {
        Constants.getCourseNameIdMap();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int id2 = view.getId();
        if (id2 != R.id.ll_sleep) {
            if (id2 != R.id.ll_worry) {
                switch (id2) {
                    case R.id.iv_anger /* 2131364445 */:
                        this.B.setFeelings("Angry");
                        ((CopingActivity) getActivity()).B = Constants.COURSE_ANGER;
                        ((CopingActivity) getActivity()).t0();
                        break;
                    case R.id.iv_depression /* 2131364446 */:
                        this.B.setFeelings("Depressed");
                        ((CopingActivity) getActivity()).B = Constants.COURSE_DEPRESSION;
                        ((CopingActivity) getActivity()).t0();
                        break;
                    case R.id.iv_happiness /* 2131364447 */:
                        this.B.setFeelings("Happiness");
                        Toast.makeText(getContext(), "That's great to hear! Continue working on your goals.", 0).show();
                        ((CopingActivity) getActivity()).n0();
                        break;
                    case R.id.iv_stress /* 2131364448 */:
                        this.B.setFeelings("Stressed");
                        ((CopingActivity) getActivity()).B = Constants.COURSE_STRESS;
                        ((CopingActivity) getActivity()).t0();
                        break;
                }
            } else {
                this.B.setFeelings("Worried");
                ((CopingActivity) getActivity()).B = Constants.COURSE_WORRY;
                ((CopingActivity) getActivity()).t0();
            }
        } else {
            this.B.setFeelings("Wakeful(Difficulty Sleeping)");
            ((CopingActivity) getActivity()).B = Constants.COURSE_SLEEP;
            ((CopingActivity) getActivity()).t0();
        }
        Bundle bundle = new Bundle();
        if (FirebasePersistence.getInstance().getUser() != null && defpackage.b.g() != null) {
            defpackage.d.m(bundle, "course");
        }
        bundle.putString("area", ((CopingActivity) getActivity()).B);
        gk.a.b(bundle, "coping_area_click");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_stress_coping_feeling, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ((LinearLayout) view.findViewById(R.id.ll_submit)).setOnClickListener(new View$OnClickListenerC0367a());
        ImageView imageView = (ImageView) view.findViewById(R.id.header_arrow_back);
        this.A = imageView;
        UiUtils.Companion.increaseImageClickArea(imageView);
        this.A.setOnClickListener(new b());
        this.f23770u = (LinearLayout) view.findViewById(R.id.iv_anger);
        this.f23771v = (LinearLayout) view.findViewById(R.id.ll_sleep);
        this.f23772w = (LinearLayout) view.findViewById(R.id.ll_worry);
        this.f23773x = (LinearLayout) view.findViewById(R.id.iv_stress);
        this.f23774y = (LinearLayout) view.findViewById(R.id.iv_depression);
        this.f23775z = (LinearLayout) view.findViewById(R.id.iv_happiness);
        this.f23770u.setOnClickListener(this);
        this.f23771v.setOnClickListener(this);
        this.f23772w.setOnClickListener(this);
        this.f23773x.setOnClickListener(this);
        this.f23774y.setOnClickListener(this);
        this.f23775z.setOnClickListener(this);
        this.B = ((CopingActivity) getActivity()).A;
    }
}
