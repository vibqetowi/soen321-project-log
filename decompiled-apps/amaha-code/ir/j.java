package ir;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.os.Handler;
import android.text.Html;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.t1;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.ThoughtsActivity;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import g.w;
/* compiled from: UnderstandingThoughtsFragment.java */
/* loaded from: classes2.dex */
public class j extends rr.b {
    public RobertoTextView A;
    public RobertoTextView B;
    public AppCompatImageView C;
    public AppCompatImageView D;
    public AppCompatImageView E;
    public AppCompatImageView F;
    public LinearLayout G;
    public RelativeLayout H;
    public int J;
    public LinearLayout K;

    /* renamed from: u  reason: collision with root package name */
    public RobertoTextView f20619u;

    /* renamed from: v  reason: collision with root package name */
    public RobertoTextView f20620v;

    /* renamed from: w  reason: collision with root package name */
    public RobertoTextView f20621w;

    /* renamed from: x  reason: collision with root package name */
    public RobertoTextView f20622x;

    /* renamed from: y  reason: collision with root package name */
    public RobertoTextView f20623y;

    /* renamed from: z  reason: collision with root package name */
    public RobertoTextView f20624z;
    public int I = 1;
    public String L = Constants.COURSE_SLEEP;

    /* compiled from: UnderstandingThoughtsFragment.java */
    /* loaded from: classes2.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            j jVar = j.this;
            jVar.I++;
            jVar.M();
        }
    }

    /* compiled from: UnderstandingThoughtsFragment.java */
    /* loaded from: classes2.dex */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            j jVar = j.this;
            jVar.I++;
            jVar.M();
        }
    }

    /* compiled from: UnderstandingThoughtsFragment.java */
    /* loaded from: classes2.dex */
    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            j jVar = j.this;
            jVar.I++;
            jVar.M();
        }
    }

    /* compiled from: UnderstandingThoughtsFragment.java */
    /* loaded from: classes2.dex */
    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            j jVar = j.this;
            try {
                if (jVar.isAdded()) {
                    Display defaultDisplay = ((WindowManager) jVar.requireActivity().getSystemService("window")).getDefaultDisplay();
                    DisplayMetrics displayMetrics = new DisplayMetrics();
                    defaultDisplay.getMetrics(displayMetrics);
                    jVar.getClass();
                    jVar.J = displayMetrics.heightPixels;
                }
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(e10);
            }
        }
    }

    /* compiled from: UnderstandingThoughtsFragment.java */
    /* loaded from: classes2.dex */
    public class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            j.this.getActivity().finish();
        }
    }

    /* compiled from: UnderstandingThoughtsFragment.java */
    /* loaded from: classes2.dex */
    public class g implements Runnable {
        public g() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            j.J(j.this);
        }
    }

    /* compiled from: UnderstandingThoughtsFragment.java */
    /* loaded from: classes2.dex */
    public class h implements Runnable {
        public h() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            j.J(j.this);
        }
    }

    /* compiled from: UnderstandingThoughtsFragment.java */
    /* loaded from: classes2.dex */
    public class i implements Runnable {
        public i() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            j.J(j.this);
        }
    }

    /* compiled from: UnderstandingThoughtsFragment.java */
    /* renamed from: ir.j$j  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class RunnableC0316j implements Runnable {
        public RunnableC0316j() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            j.J(j.this);
        }
    }

    static {
        w.a aVar = g.j.f16054u;
        int i6 = t1.f1560a;
    }

    public static void J(j jVar) {
        jVar.K.setVisibility(0);
        jVar.K.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        ValueAnimator ofInt = ValueAnimator.ofInt(0, jVar.K.getMeasuredHeight());
        ofInt.addUpdateListener(new k(jVar));
        ofInt.start();
    }

    public static void Q(View view) {
        TranslateAnimation translateAnimation = new TranslateAnimation(0, 0.0f, 0, 20.0f, 1, 0.0f, 1, 0.0f);
        long j10 = 40;
        translateAnimation.setDuration(j10);
        TranslateAnimation translateAnimation2 = new TranslateAnimation(0, 20.0f, 0, 0.0f, 1, 0.0f, 1, 0.0f);
        translateAnimation2.setDuration(j10);
        translateAnimation2.setStartOffset(j10);
        AnimationSet animationSet = new AnimationSet(false);
        animationSet.addAnimation(translateAnimation);
        animationSet.addAnimation(translateAnimation2);
        view.startAnimation(animationSet);
    }

    @Override // rr.b
    public final boolean I() {
        int i6 = this.I - 1;
        this.I = i6;
        if (i6 <= 0) {
            return true;
        }
        M();
        return false;
    }

    public final void K() {
        ValueAnimator ofInt = ValueAnimator.ofInt(this.K.getHeight(), 0);
        ofInt.addUpdateListener(new k(this));
        ofInt.addListener(new a());
        ofInt.start();
    }

    public final void M() {
        switch (this.I) {
            case 1:
                this.G.setVisibility(0);
                LinearLayout linearLayout = this.G;
                Utils utils = Utils.INSTANCE;
                linearLayout.setBackgroundColor(utils.checkBuildBeforesetColor(R.color.purpleNavy, getContext()));
                this.F.setImageResource(R.drawable.ic_situation);
                this.f20624z.setText("Situation");
                this.A.setText("To understand how your thoughts can affect your feelings, let’s start by imagining a situation.");
                this.f20619u.setTextColor(utils.checkBuildBeforesetColor(R.color.white, getContext()));
                return;
            case 2:
                ((ThoughtsActivity) getActivity()).n0();
                this.G.setVisibility(8);
                O(R.color.purpleNavy);
                this.f20620v.setText("Situation");
                this.C.setVisibility(0);
                this.C.setImageResource(R.drawable.ic_in_situation);
                this.f20621w.setVisibility(0);
                this.C.setAlpha(1.0f);
                this.f20621w.setAlpha(1.0f);
                AppCompatImageView appCompatImageView = this.C;
                P(appCompatImageView, this.J / appCompatImageView.getHeight());
                P(this.f20621w, this.J / this.C.getHeight());
                this.B.setText("How does that make you feel?");
                RobertoTextView robertoTextView = this.B;
                Utils utils2 = Utils.INSTANCE;
                robertoTextView.setTextColor(utils2.checkBuildBeforesetColor(R.color.purpleNavy, getContext()));
                new Handler().postDelayed(new g(), 800L);
                this.f20619u.setTextColor(utils2.checkBuildBeforesetColor(R.color.colorTextGrey, getContext()));
                this.D.setVisibility(4);
                this.f20622x.setVisibility(4);
                return;
            case 3:
                this.G.setVisibility(0);
                LinearLayout linearLayout2 = this.G;
                Utils utils3 = Utils.INSTANCE;
                linearLayout2.setBackgroundColor(utils3.checkBuildBeforesetColor(R.color.seaSerpent, getContext()));
                this.F.setImageResource(R.drawable.ic_feeling);
                this.f20624z.setText("Feelings");
                this.A.setText("These are your emotional reactions to situations.");
                K();
                this.f20619u.setTextColor(utils3.checkBuildBeforesetColor(R.color.white, getContext()));
                return;
            case 4:
                ((ThoughtsActivity) getActivity()).n0();
                this.G.setVisibility(8);
                O(R.color.seaSerpent);
                this.f20620v.setText("Feelings");
                this.C.setAlpha(0.2f);
                this.f20621w.setAlpha(0.2f);
                this.D.setVisibility(0);
                this.D.setImageResource(R.drawable.ic_in_feeling);
                this.f20622x.setVisibility(0);
                this.f20622x.setText(Html.fromHtml("You may feel<br><strong><font color=\"#47A8AD\">upset.</font><strong>"));
                this.D.setAlpha(1.0f);
                this.f20622x.setAlpha(1.0f);
                AppCompatImageView appCompatImageView2 = this.D;
                P(appCompatImageView2, (-this.J) / appCompatImageView2.getHeight());
                RobertoTextView robertoTextView2 = this.f20622x;
                P(robertoTextView2, (-this.J) / robertoTextView2.getHeight());
                this.B.setText("But, what is really making you feel this way?");
                RobertoTextView robertoTextView3 = this.B;
                Utils utils4 = Utils.INSTANCE;
                robertoTextView3.setTextColor(utils4.checkBuildBeforesetColor(R.color.seaSerpent, getContext()));
                new Handler().postDelayed(new h(), 800L);
                this.f20619u.setTextColor(utils4.checkBuildBeforesetColor(R.color.colorTextGrey, getContext()));
                this.E.setVisibility(4);
                this.f20623y.setVisibility(4);
                return;
            case 5:
                this.G.setVisibility(0);
                LinearLayout linearLayout3 = this.G;
                Utils utils5 = Utils.INSTANCE;
                linearLayout3.setBackgroundColor(utils5.checkBuildBeforesetColor(R.color.bpBlue, getContext()));
                this.f20624z.setText("Thoughts");
                this.F.setImageResource(R.drawable.ic_thought);
                this.A.setText("Your thoughts play a crucial role in making you feel good or bad, happy or upset.");
                K();
                this.f20619u.setTextColor(utils5.checkBuildBeforesetColor(R.color.white, getContext()));
                return;
            case 6:
                ((ThoughtsActivity) getActivity()).n0();
                this.G.setVisibility(8);
                O(R.color.bpBlue);
                this.f20620v.setText("Thoughts");
                this.D.setAlpha(0.2f);
                this.f20622x.setAlpha(0.2f);
                this.E.setVisibility(0);
                this.E.setImageResource(R.drawable.ic_in_thought);
                this.f20623y.setVisibility(0);
                this.f20623y.setText(Html.fromHtml("Perhaps you thought<br><strong><font color=\"#33b5e5\">She doesn't want to talk to me.</font></strong>"));
                this.E.setAlpha(1.0f);
                this.f20623y.setAlpha(1.0f);
                AppCompatImageView appCompatImageView3 = this.E;
                P(appCompatImageView3, this.J / appCompatImageView3.getHeight());
                RobertoTextView robertoTextView4 = this.f20623y;
                P(robertoTextView4, this.J / robertoTextView4.getHeight());
                this.B.setText("So it's not always the situation that upsets you, but what you think about it.");
                RobertoTextView robertoTextView5 = this.B;
                Utils utils6 = Utils.INSTANCE;
                robertoTextView5.setTextColor(utils6.checkBuildBeforesetColor(R.color.bpBlue, getContext()));
                new Handler().postDelayed(new i(), 800L);
                this.f20619u.setTextColor(utils6.checkBuildBeforesetColor(R.color.colorTextGrey, getContext()));
                return;
            case 7:
                this.G.setVisibility(0);
                this.f20624z.setText("New Thoughts");
                this.A.setText("You cannot always change the situation, but you can learn to think about it differently.");
                K();
                this.f20619u.setTextColor(Utils.INSTANCE.checkBuildBeforesetColor(R.color.white, getContext()));
                return;
            case 8:
                ((ThoughtsActivity) getActivity()).n0();
                this.G.setVisibility(8);
                this.f20620v.setText("New Thoughts");
                this.f20623y.setText(Html.fromHtml("You could also think:<br><strong><font color=\"#33b5e5\">• She could be in a hurry to reach somewhere.</font></strong><br><strong><font color=\"#33b5e5\">• Perhaps she did not see me.</font></strong><br><strong><font color=\"#33b5e5\">• Maybe she was preoccupied with something.</font></strong>"));
                this.E.setAlpha(1.0f);
                this.f20623y.setAlpha(1.0f);
                this.D.setAlpha(0.2f);
                this.f20622x.setAlpha(0.2f);
                Q(this.E);
                Q(this.f20623y);
                this.B.setText("How can this new thought help you?");
                new Handler().postDelayed(new RunnableC0316j(), 500L);
                this.f20619u.setTextColor(Utils.INSTANCE.checkBuildBeforesetColor(R.color.colorTextGrey, getContext()));
                return;
            case 9:
                this.G.setVisibility(0);
                LinearLayout linearLayout4 = this.G;
                Utils utils7 = Utils.INSTANCE;
                linearLayout4.setBackgroundColor(utils7.checkBuildBeforesetColor(R.color.seaSerpent, getContext()));
                this.f20624z.setText("New Feeling");
                this.A.setText("By thinking differently, you can change the way you feel.");
                K();
                this.f20619u.setTextColor(utils7.checkBuildBeforesetColor(R.color.white, getContext()));
                return;
            case 10:
                ((ThoughtsActivity) getActivity()).n0();
                this.G.setVisibility(8);
                O(R.color.seaSerpent);
                this.f20620v.setText("New Feeling");
                if (this.L.equals(Constants.COURSE_DEPRESSION)) {
                    this.f20622x.setText(Html.fromHtml("You might now start to feel <strong><font color=\"#47A8AD\">neutral.</font></strong>"));
                } else if (this.L.equals(Constants.COURSE_WORRY)) {
                    this.f20622x.setText(Html.fromHtml("You may start feeling <strong><font color=\"#47A8AD\">neutral.</font></strong>"));
                } else {
                    this.f20622x.setText(Html.fromHtml("Now, you might feel <strong><font color=\"#47A8AD\">less upset</font></strong> or <strong><font color=\"#47A8AD\">feel neutral</font></strong> about the situation."));
                }
                this.E.setAlpha(0.2f);
                this.f20623y.setAlpha(0.2f);
                this.D.setAlpha(1.0f);
                this.f20622x.setAlpha(1.0f);
                Q(this.D);
                Q(this.f20622x);
                this.f20619u.setTextColor(Utils.INSTANCE.checkBuildBeforesetColor(R.color.colorTextGrey, getContext()));
                return;
            default:
                ((ThoughtsActivity) getActivity()).o0();
                return;
        }
    }

    public final void O(int i6) {
        this.f20620v.setTextColor(Utils.INSTANCE.checkBuildBeforesetColor(i6, getActivity()));
    }

    public final void P(View view, float f2) {
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, f2, 1, 0.0f);
        translateAnimation.setDuration(800L);
        view.startAnimation(translateAnimation);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_understanding_thoughts, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f20620v = (RobertoTextView) view.findViewById(R.id.header);
        this.H = (RelativeLayout) view.findViewById(R.id.screen1);
        this.G = (LinearLayout) view.findViewById(R.id.screen2);
        this.f20621w = (RobertoTextView) view.findViewById(R.id.textStep1);
        this.f20622x = (RobertoTextView) view.findViewById(R.id.textStep2);
        this.f20623y = (RobertoTextView) view.findViewById(R.id.textStep3);
        this.C = (AppCompatImageView) view.findViewById(R.id.imageStep1);
        this.D = (AppCompatImageView) view.findViewById(R.id.imageStep2);
        this.E = (AppCompatImageView) view.findViewById(R.id.imageStep3);
        this.F = (AppCompatImageView) view.findViewById(R.id.overlayImage);
        this.f20624z = (RobertoTextView) view.findViewById(R.id.overlyHeader);
        this.A = (RobertoTextView) view.findViewById(R.id.overlayDesc);
        this.f20619u = (RobertoTextView) view.findViewById(R.id.btnSubmit);
        this.B = (RobertoTextView) view.findViewById(R.id.cardtext);
        this.K = (LinearLayout) view.findViewById(R.id.ll_cardview);
        this.f20619u.setOnClickListener(new b());
        this.B.setOnClickListener(new c());
        this.F.setOnClickListener(new d());
        this.H.post(new e());
        ((ImageView) view.findViewById(R.id.header_arrow_back)).setOnClickListener(new f());
        this.L = FirebasePersistence.getInstance().getCourseById(FirebasePersistence.getInstance().getUser().getCurrentCourse()).getCourseName();
        M();
    }

    /* compiled from: UnderstandingThoughtsFragment.java */
    /* loaded from: classes2.dex */
    public class a implements Animator.AnimatorListener {
        public a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            j.this.K.setVisibility(8);
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
        }
    }
}
