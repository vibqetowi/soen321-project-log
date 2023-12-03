package gr;

import android.os.Bundle;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.SymptomsActivity;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import qq.n;
/* compiled from: StressCycleFragment.java */
/* loaded from: classes2.dex */
public class d extends rr.b {
    public static final /* synthetic */ int P = 0;
    public RobertoTextView A;
    public RobertoTextView B;
    public RobertoTextView C;
    public RobertoTextView D;
    public RobertoTextView E;
    public RobertoTextView F;
    public int G;
    public ScrollView H;
    public LinearLayout I;
    public LinearLayout J;
    public LinearLayout K;
    public LinearLayout L;
    public LinearLayout M;
    public LinearLayout N;
    public int O;

    /* renamed from: u  reason: collision with root package name */
    public RobertoTextView f16724u;

    /* renamed from: v  reason: collision with root package name */
    public RobertoTextView f16725v;

    /* renamed from: w  reason: collision with root package name */
    public RobertoTextView f16726w;

    /* renamed from: x  reason: collision with root package name */
    public RobertoTextView f16727x;

    /* renamed from: y  reason: collision with root package name */
    public RobertoTextView f16728y;

    /* renamed from: z  reason: collision with root package name */
    public RobertoTextView f16729z;

    /* compiled from: StressCycleFragment.java */
    /* loaded from: classes2.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            d.this.getActivity().finish();
        }
    }

    /* compiled from: StressCycleFragment.java */
    /* loaded from: classes2.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ScrollView scrollView = d.this.H;
            scrollView.scrollTo(0, scrollView.getBottom());
        }
    }

    /* compiled from: StressCycleFragment.java */
    /* loaded from: classes2.dex */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ScrollView scrollView = d.this.H;
            scrollView.scrollTo(0, scrollView.getBottom());
        }
    }

    public final void J() {
        switch (this.O) {
            case 0:
                this.I.setVisibility(0);
                K(this.I, this.G / 50.0f);
                this.O++;
                ScrollView scrollView = this.H;
                scrollView.scrollTo(0, scrollView.getBottom());
                return;
            case 1:
                this.M.setVisibility(0);
                K(this.M, this.G / 50.0f);
                this.O++;
                ScrollView scrollView2 = this.H;
                scrollView2.scrollTo(0, scrollView2.getBottom());
                return;
            case 2:
                this.J.setVisibility(0);
                K(this.J, this.G / 50.0f);
                this.O++;
                ScrollView scrollView3 = this.H;
                scrollView3.scrollTo(0, scrollView3.getBottom());
                return;
            case 3:
                this.L.setVisibility(0);
                K(this.L, this.G / 50.0f);
                this.O++;
                ScrollView scrollView4 = this.H;
                scrollView4.scrollTo(0, scrollView4.getBottom());
                return;
            case 4:
                this.K.setVisibility(0);
                K(this.K, this.G / 50.0f);
                this.O++;
                new Handler().postDelayed(new b(), 200L);
                return;
            case 5:
                this.N.setVisibility(0);
                K(this.N, this.G / 50.0f);
                this.O++;
                new Handler().postDelayed(new c(), 200L);
                return;
            case 6:
                ((SymptomsActivity) getActivity()).o0();
                return;
            default:
                return;
        }
    }

    public final void K(View view, float f) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(1500L);
        view.startAnimation(alphaAnimation);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_stress_cycle, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        RobertoTextView robertoTextView = (RobertoTextView) view.findViewById(R.id.tap);
        Display defaultDisplay = ((WindowManager) getActivity().getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        this.G = displayMetrics.heightPixels;
        this.H = (ScrollView) view.findViewById(R.id.scroll_view);
        this.I = (LinearLayout) view.findViewById(R.id.iv_stress);
        this.J = (LinearLayout) view.findViewById(R.id.ll_negFeeling);
        this.K = (LinearLayout) view.findViewById(R.id.ll_poor);
        this.L = (LinearLayout) view.findViewById(R.id.ll_unhealthy);
        this.M = (LinearLayout) view.findViewById(R.id.ll_thinking);
        this.N = (LinearLayout) view.findViewById(R.id.ll_morestress);
        this.f16724u = (RobertoTextView) view.findViewById(R.id.imageStep1);
        this.f16726w = (RobertoTextView) view.findViewById(R.id.imageStep2);
        this.f16728y = (RobertoTextView) view.findViewById(R.id.imageStep3);
        this.A = (RobertoTextView) view.findViewById(R.id.imageStep4);
        this.C = (RobertoTextView) view.findViewById(R.id.imageStep5);
        this.E = (RobertoTextView) view.findViewById(R.id.imageStep6);
        this.f16725v = (RobertoTextView) view.findViewById(R.id.introText1);
        this.f16727x = (RobertoTextView) view.findViewById(R.id.introText2);
        this.f16729z = (RobertoTextView) view.findViewById(R.id.introText3);
        this.B = (RobertoTextView) view.findViewById(R.id.introText4);
        this.D = (RobertoTextView) view.findViewById(R.id.introText5);
        this.F = (RobertoTextView) view.findViewById(R.id.introText6);
        if (SymptomsActivity.B.equals(Constants.COURSE_STRESS)) {
            this.f16724u.setText("Stress");
            this.f16726w.setText("Negative Thinking");
            this.f16728y.setText("Negative Feelings");
            this.A.setText("Unhealthy Lifestyle");
            this.C.setText("Poor Health");
            this.E.setText("More\nStress");
            this.f16725v.setText("In certain situations, you might begin to feel stressed and worried.");
            this.f16727x.setText("You begin to think negatively.");
            this.f16729z.setText("These negative thoughts upset you and this often results in sadness, anger or frustration.");
            this.B.setText("When feeling sad/low you often stay up late, increase your caffeine consumption and drink unhealthy amounts of alchohol.");
            this.D.setText("Unhealthy lifestyle choices make you fall sick. This itself can cause more stress and lead to the cycle repeating itself.");
        } else if (SymptomsActivity.B.equals(Constants.COURSE_WORRY)) {
            this.f16724u.setText("'What If' Thinking");
            this.f16726w.setText("Worry");
            this.f16728y.setText("Negative Thinking");
            this.A.setText("Increased Worry");
            this.C.setText("Unhealthy Behaviour");
            this.E.setText("The Worry Effect");
            this.f16725v.setText("Your worry can begin with a 'what if' thought. For example, \"What if I don't get the promotion I want?\"");
            this.f16727x.setText("You respond to the thought by worrying because you believe it will help the situation.");
            this.f16729z.setText("You are unable to think in a way that could help you deal with the problem.");
            this.B.setText("You start thinking that your worry is excessive and out of your control.");
            this.D.setText("You may start to engage in unhelpful behaviour to distract yourself which may actually worsen your worry.");
            this.F.setText("Excessive worry can negatively impact the way you think, feel and behave. Read on to know more about the symptoms that indicate it might be a problem.");
            this.F.setVisibility(0);
        } else if (SymptomsActivity.B.equals(Constants.COURSE_ANGER)) {
            this.f16724u.setText("Trigger");
            this.f16726w.setText("Thoughts");
            this.f16728y.setText("Emotions");
            this.A.setText("Physical Symptoms");
            this.C.setText("Behaviour");
            this.E.setText("More\nAnger");
            this.f16725v.setText("Firstly, there is an event that sets off your anger. It could be anything - from your boss being rude to you at work to you getting stuck in a bad traffic jam.");
            this.f16727x.setText("You might think about the situation negatively. For instance, you might think, \"I must have done a bad job on this work assignment.\" This can make the difficult situation worse.");
            this.f16729z.setText("As a result of such negative thoughts, you begin to experience negative emotions like sadness, guilt or anger.");
            this.B.setText("Your body responds to these emotions with physical reactions like tensed muscles or a racing heart.");
            this.D.setText("These thoughts, emotions and physical reactions influence the way you behave. In response to the event, then, you might end up shouting, picking a fight or being violent.");
        }
        robertoTextView.setOnClickListener(new n(this, 22));
        ((ImageView) view.findViewById(R.id.header_arrow_back)).setOnClickListener(new a());
        this.I.setVisibility(8);
        this.J.setVisibility(8);
        this.K.setVisibility(8);
        this.L.setVisibility(8);
        this.M.setVisibility(8);
        this.N.setVisibility(8);
        J();
    }
}
