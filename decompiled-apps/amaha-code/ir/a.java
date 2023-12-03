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
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.ThoughtsActivity;
import com.theinnerhour.b2b.model.Course;
import com.theinnerhour.b2b.model.ThoughtsModel;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import j$.util.Objects;
/* compiled from: ChallengeThoughtsFragment.java */
/* loaded from: classes2.dex */
public class a extends rr.b {
    public RobertoTextView A;
    public RobertoTextView B;
    public RobertoTextView C;
    public RobertoTextView D;
    public RobertoTextView E;
    public ImageView F;
    public ImageView G;
    public ImageView H;
    public ImageView I;
    public ImageView J;
    public AppCompatImageView K;
    public int L = 1;
    public int M;
    public ScrollView N;
    public LinearLayout O;
    public LinearLayout P;
    public LinearLayout Q;
    public ThoughtsModel R;

    /* renamed from: u  reason: collision with root package name */
    public RobertoTextView f20559u;

    /* renamed from: v  reason: collision with root package name */
    public RobertoTextView f20560v;

    /* renamed from: w  reason: collision with root package name */
    public RobertoTextView f20561w;

    /* renamed from: x  reason: collision with root package name */
    public RobertoTextView f20562x;

    /* renamed from: y  reason: collision with root package name */
    public RobertoTextView f20563y;

    /* renamed from: z  reason: collision with root package name */
    public RobertoTextView f20564z;

    /* compiled from: ChallengeThoughtsFragment.java */
    /* renamed from: ir.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class RunnableC0312a implements Runnable {
        public RunnableC0312a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            a aVar = a.this;
            aVar.I.setVisibility(0);
            aVar.I.setImageResource(R.drawable.ic_in_thought);
            aVar.f20564z.setVisibility(0);
            aVar.f20564z.setText(Html.fromHtml(aVar.R.text11));
            ImageView imageView = aVar.I;
            aVar.P(imageView, aVar.M / imageView.getHeight());
            RobertoTextView robertoTextView = aVar.f20564z;
            aVar.P(robertoTextView, aVar.M / robertoTextView.getHeight());
        }
    }

    /* compiled from: ChallengeThoughtsFragment.java */
    /* loaded from: classes2.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ScrollView scrollView = a.this.N;
            scrollView.smoothScrollTo(0, scrollView.getBottom());
        }
    }

    /* compiled from: ChallengeThoughtsFragment.java */
    /* loaded from: classes2.dex */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            a.J(a.this);
        }
    }

    /* compiled from: ChallengeThoughtsFragment.java */
    /* loaded from: classes2.dex */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            a.J(a.this);
        }
    }

    /* compiled from: ChallengeThoughtsFragment.java */
    /* loaded from: classes2.dex */
    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            a aVar = a.this;
            aVar.I.setVisibility(0);
            aVar.I.setImageResource(R.drawable.ic_in_thought);
            aVar.f20564z.setVisibility(0);
            aVar.f20564z.setText(Html.fromHtml(aVar.R.text16));
            ImageView imageView = aVar.I;
            aVar.P(imageView, aVar.M / imageView.getHeight());
            RobertoTextView robertoTextView = aVar.f20564z;
            aVar.P(robertoTextView, aVar.M / robertoTextView.getHeight());
        }
    }

    /* compiled from: ChallengeThoughtsFragment.java */
    /* loaded from: classes2.dex */
    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ScrollView scrollView = a.this.N;
            scrollView.smoothScrollTo(0, scrollView.getBottom());
        }
    }

    /* compiled from: ChallengeThoughtsFragment.java */
    /* loaded from: classes2.dex */
    public class h implements View.OnClickListener {
        public h() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            a aVar = a.this;
            aVar.L++;
            aVar.M();
        }
    }

    /* compiled from: ChallengeThoughtsFragment.java */
    /* loaded from: classes2.dex */
    public class i implements View.OnClickListener {
        public i() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            a aVar = a.this;
            aVar.L++;
            aVar.M();
        }
    }

    /* compiled from: ChallengeThoughtsFragment.java */
    /* loaded from: classes2.dex */
    public class j implements Runnable {
        public j() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            a aVar = a.this;
            Display defaultDisplay = ((WindowManager) aVar.requireActivity().getSystemService("window")).getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            defaultDisplay.getMetrics(displayMetrics);
            aVar.getClass();
            aVar.M = displayMetrics.heightPixels;
        }
    }

    /* compiled from: ChallengeThoughtsFragment.java */
    /* loaded from: classes2.dex */
    public class k implements View.OnClickListener {
        public k() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            a.this.requireActivity().finish();
        }
    }

    /* compiled from: ChallengeThoughtsFragment.java */
    /* loaded from: classes2.dex */
    public class l implements View.OnClickListener {
        public l() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            a aVar = a.this;
            aVar.L++;
            aVar.M();
        }
    }

    /* compiled from: ChallengeThoughtsFragment.java */
    /* loaded from: classes2.dex */
    public class m implements Runnable {
        public m() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            a.J(a.this);
        }
    }

    /* compiled from: ChallengeThoughtsFragment.java */
    /* loaded from: classes2.dex */
    public class n implements Runnable {
        public n() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            a.J(a.this);
        }
    }

    /* compiled from: ChallengeThoughtsFragment.java */
    /* loaded from: classes2.dex */
    public class o implements Runnable {
        public o() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ScrollView scrollView = a.this.N;
            scrollView.smoothScrollTo(0, scrollView.getBottom());
        }
    }

    /* compiled from: ChallengeThoughtsFragment.java */
    /* loaded from: classes2.dex */
    public class p implements Runnable {
        public p() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            a.J(a.this);
        }
    }

    public static void J(a aVar) {
        aVar.O.setVisibility(0);
        aVar.O.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        ValueAnimator ofInt = ValueAnimator.ofInt(0, aVar.O.getMeasuredHeight());
        ofInt.addUpdateListener(new ir.b(aVar));
        ofInt.start();
    }

    @Override // rr.b
    public final boolean I() {
        int i6 = this.L - 1;
        this.L = i6;
        if (i6 <= 0) {
            return true;
        }
        M();
        return false;
    }

    public final void K() {
        ValueAnimator ofInt = ValueAnimator.ofInt(this.O.getHeight(), 0);
        ofInt.addUpdateListener(new ir.b(this));
        ofInt.addListener(new g());
        ofInt.start();
    }

    public final void M() {
        switch (this.L) {
            case 1:
                this.P.setVisibility(0);
                LinearLayout linearLayout = this.P;
                Utils utils = Utils.INSTANCE;
                linearLayout.setBackgroundColor(utils.checkBuildBeforesetColor(R.color.purpleNavy, getContext()));
                this.B.setText("Situation");
                this.K.setImageResource(R.drawable.ic_situation);
                this.C.setText("We will help you learn some very simple but effective skills to challenge your thinking patterns. Let’s start by imagining a situation.");
                this.f20559u.setTextColor(utils.checkBuildBeforesetColor(R.color.white, getContext()));
                return;
            case 2:
                ((ThoughtsActivity) getActivity()).n0();
                this.P.setVisibility(8);
                O(R.color.purpleNavy);
                this.f20560v.setText("Situation");
                this.F.setVisibility(0);
                this.F.setImageResource(R.drawable.ic_in_situation);
                this.f20561w.setVisibility(0);
                this.f20561w.setText(this.R.text1);
                this.F.setAlpha(1.0f);
                this.f20561w.setAlpha(1.0f);
                ImageView imageView = this.F;
                P(imageView, this.M / imageView.getHeight());
                RobertoTextView robertoTextView = this.f20561w;
                P(robertoTextView, this.M / robertoTextView.getHeight());
                this.E.setText(this.R.text2);
                RobertoTextView robertoTextView2 = this.E;
                Utils utils2 = Utils.INSTANCE;
                robertoTextView2.setTextColor(utils2.checkBuildBeforesetColor(R.color.purpleNavy, getContext()));
                new Handler().postDelayed(new m(), 800L);
                this.f20559u.setTextColor(utils2.checkBuildBeforesetColor(R.color.colorTextGrey, getContext()));
                ScrollView scrollView = this.N;
                scrollView.smoothScrollTo(0, scrollView.getTop());
                this.G.setVisibility(4);
                this.f20562x.setVisibility(4);
                this.H.setVisibility(4);
                this.f20563y.setVisibility(4);
                return;
            case 3:
                ((ThoughtsActivity) getActivity()).n0();
                this.P.setVisibility(8);
                O(R.color.seaSerpent);
                this.f20560v.setText("Thoughts");
                this.F.setAlpha(0.2f);
                this.f20561w.setAlpha(0.2f);
                this.G.setVisibility(0);
                this.G.setImageResource(R.drawable.ic_in_thought);
                this.f20562x.setVisibility(0);
                this.f20562x.setText(Html.fromHtml(this.R.text3));
                ImageView imageView2 = this.G;
                P(imageView2, this.M / imageView2.getHeight());
                RobertoTextView robertoTextView3 = this.f20562x;
                P(robertoTextView3, this.M / robertoTextView3.getHeight());
                this.G.setAlpha(1.0f);
                this.f20562x.setAlpha(1.0f);
                this.H.setVisibility(0);
                this.H.setImageResource(R.drawable.ic_in_feeling);
                this.f20563y.setVisibility(0);
                this.f20563y.setText(Html.fromHtml(this.R.text4));
                ImageView imageView3 = this.H;
                P(imageView3, this.M / imageView3.getHeight());
                RobertoTextView robertoTextView4 = this.f20563y;
                P(robertoTextView4, this.M / robertoTextView4.getHeight());
                this.E.setText("So let's learn to challenge these thoughts!");
                RobertoTextView robertoTextView5 = this.E;
                Utils utils3 = Utils.INSTANCE;
                robertoTextView5.setTextColor(utils3.checkBuildBeforesetColor(R.color.seaSerpent, getContext()));
                new Handler().postDelayed(new n(), 800L);
                this.f20559u.setTextColor(utils3.checkBuildBeforesetColor(R.color.colorTextGrey, getContext()));
                this.Q.setVisibility(8);
                return;
            case 4:
                this.P.setVisibility(0);
                LinearLayout linearLayout2 = this.P;
                Utils utils4 = Utils.INSTANCE;
                linearLayout2.setBackgroundColor(utils4.checkBuildBeforesetColor(R.color.thoughts_green, getContext()));
                this.B.setText("Looking at the evidence");
                this.K.setImageResource(R.drawable.ic_skill);
                this.C.setText("You can change the way you think using this skill.");
                K();
                this.f20559u.setTextColor(utils4.checkBuildBeforesetColor(R.color.white, getContext()));
                return;
            case 5:
                this.P.setVisibility(8);
                this.H.setVisibility(4);
                this.f20563y.setVisibility(4);
                O(R.color.thoughts_green);
                this.f20560v.setText("Skills");
                P(this.Q, this.M / this.G.getHeight());
                this.Q.setVisibility(0);
                this.f20560v.setText("Looking at the evidence");
                this.D.setText("Why could you be thinking this way?");
                ((CardView) this.Q.findViewById(R.id.card3)).setVisibility(0);
                RobertoTextView robertoTextView6 = this.D;
                Utils utils5 = Utils.INSTANCE;
                robertoTextView6.setTextColor(utils5.checkBuildBeforesetColor(R.color.purpleNavy, getContext()));
                this.Q.findViewById(R.id.view1).setBackgroundColor(utils5.checkBuildBeforesetColor(R.color.purpleNavy, getActivity()));
                this.Q.findViewById(R.id.view2).setBackgroundColor(utils5.checkBuildBeforesetColor(R.color.purpleNavy, getActivity()));
                this.Q.findViewById(R.id.view3).setBackgroundColor(utils5.checkBuildBeforesetColor(R.color.purpleNavy, getActivity()));
                ((RobertoTextView) this.Q.findViewById(R.id.text1)).setText(this.R.text5);
                ((RobertoTextView) this.Q.findViewById(R.id.text2)).setText(this.R.text6);
                ((RobertoTextView) this.Q.findViewById(R.id.text3)).setText(this.R.text7);
                new Handler().postDelayed(new o(), 500L);
                this.f20559u.setTextColor(utils5.checkBuildBeforesetColor(R.color.colorTextGrey, getContext()));
                return;
            case 6:
                this.D.setText("Have you considered all the facts?");
                this.Q.setVisibility(0);
                RobertoTextView robertoTextView7 = this.D;
                Utils utils6 = Utils.INSTANCE;
                robertoTextView7.setTextColor(utils6.checkBuildBeforesetColor(R.color.bpBlue, getContext()));
                this.Q.findViewById(R.id.view1).setBackgroundColor(utils6.checkBuildBeforesetColor(R.color.bpBlue, getActivity()));
                this.Q.findViewById(R.id.view2).setBackgroundColor(utils6.checkBuildBeforesetColor(R.color.bpBlue, getActivity()));
                this.Q.findViewById(R.id.view3).setBackgroundColor(utils6.checkBuildBeforesetColor(R.color.bpBlue, getActivity()));
                ((RobertoTextView) this.Q.findViewById(R.id.text1)).setText(this.R.text8);
                ((RobertoTextView) this.Q.findViewById(R.id.text2)).setText(this.R.text9);
                ((RobertoTextView) this.Q.findViewById(R.id.text3)).setText(this.R.text10);
                P(this.Q, this.M / this.G.getHeight());
                this.f20559u.setTextColor(utils6.checkBuildBeforesetColor(R.color.colorTextGrey, getContext()));
                this.P.setVisibility(8);
                this.H.setVisibility(4);
                this.f20563y.setVisibility(4);
                this.I.setVisibility(4);
                this.f20564z.setVisibility(4);
                return;
            case 7:
                this.P.setVisibility(0);
                LinearLayout linearLayout3 = this.P;
                Utils utils7 = Utils.INSTANCE;
                linearLayout3.setBackgroundColor(utils7.checkBuildBeforesetColor(R.color.bpBlue, getContext()));
                this.B.setText("New Thoughts");
                this.K.setImageResource(R.drawable.ic_thought);
                this.C.setText("Looking at all the evidence gathered, you could change how you think.");
                this.f20559u.setTextColor(utils7.checkBuildBeforesetColor(R.color.white, getContext()));
                return;
            case 8:
                ((ThoughtsActivity) getActivity()).n0();
                this.P.setVisibility(8);
                O(R.color.bpBlue);
                this.f20560v.setText("New Thoughts");
                this.Q.setVisibility(8);
                this.H.setVisibility(0);
                this.H.setImageResource(R.drawable.ic_in_skill);
                this.f20563y.setVisibility(0);
                this.f20563y.setText("LOOKING AT THE EVIDENCE");
                this.I.setVisibility(4);
                this.f20564z.setVisibility(4);
                ImageView imageView4 = this.H;
                P(imageView4, this.M / imageView4.getHeight());
                RobertoTextView robertoTextView8 = this.f20563y;
                P(robertoTextView8, this.M / robertoTextView8.getHeight());
                this.E.setText("How does this new thought help?");
                RobertoTextView robertoTextView9 = this.E;
                Utils utils8 = Utils.INSTANCE;
                robertoTextView9.setTextColor(utils8.checkBuildBeforesetColor(R.color.bpBlue, getContext()));
                new Handler().postDelayed(new p(), 800L);
                new Handler().postDelayed(new RunnableC0312a(), 300L);
                this.f20559u.setTextColor(utils8.checkBuildBeforesetColor(R.color.colorTextGrey, getContext()));
                this.J.setVisibility(4);
                this.A.setVisibility(4);
                return;
            case 9:
                this.P.setVisibility(0);
                LinearLayout linearLayout4 = this.P;
                Utils utils9 = Utils.INSTANCE;
                linearLayout4.setBackgroundColor(utils9.checkBuildBeforesetColor(R.color.seaSerpent, getContext()));
                this.B.setText("New Feeling");
                this.K.setImageResource(R.drawable.ic_feeling);
                this.C.setText("The new thought might make you feel better.");
                this.f20559u.setTextColor(utils9.checkBuildBeforesetColor(R.color.white, getContext()));
                K();
                return;
            case 10:
                ((ThoughtsActivity) getActivity()).n0();
                this.P.setVisibility(8);
                O(R.color.seaSerpent);
                this.f20560v.setText("New Feeling");
                this.J.setVisibility(0);
                this.J.setImageResource(R.drawable.ic_in_feeling);
                this.A.setVisibility(0);
                this.A.setText(Html.fromHtml(this.R.text12));
                ImageView imageView5 = this.J;
                P(imageView5, (-this.M) / imageView5.getHeight());
                RobertoTextView robertoTextView10 = this.A;
                P(robertoTextView10, (-this.M) / robertoTextView10.getHeight());
                this.E.setText("Let's quickly learn one more skill.");
                RobertoTextView robertoTextView11 = this.E;
                Utils utils10 = Utils.INSTANCE;
                robertoTextView11.setTextColor(utils10.checkBuildBeforesetColor(R.color.seaSerpent, getContext()));
                new Handler().postDelayed(new b(), 800L);
                new Handler().postDelayed(new c(), 800L);
                this.f20559u.setTextColor(utils10.checkBuildBeforesetColor(R.color.colorTextGrey, getContext()));
                this.Q.setVisibility(8);
                return;
            case 11:
                this.P.setVisibility(0);
                LinearLayout linearLayout5 = this.P;
                Utils utils11 = Utils.INSTANCE;
                linearLayout5.setBackgroundColor(utils11.checkBuildBeforesetColor(R.color.thoughts_green, getContext()));
                this.B.setText("Alternative ways of thinking");
                K();
                this.C.setText("");
                this.K.setImageResource(R.drawable.ic_skill);
                this.f20559u.setTextColor(utils11.checkBuildBeforesetColor(R.color.white, getContext()));
                return;
            case 12:
                this.P.setVisibility(8);
                this.f20560v.setText("Skills");
                this.H.setVisibility(4);
                this.f20563y.setVisibility(4);
                this.I.setVisibility(4);
                this.f20564z.setVisibility(4);
                this.J.setVisibility(4);
                this.A.setVisibility(4);
                this.Q.setVisibility(0);
                this.f20560v.setText("Alternative ways of thinking:");
                this.D.setText("Have you considered other possible explanations?");
                RobertoTextView robertoTextView12 = this.D;
                Utils utils12 = Utils.INSTANCE;
                robertoTextView12.setTextColor(utils12.checkBuildBeforesetColor(R.color.bpBlue, getContext()));
                ((CardView) this.Q.findViewById(R.id.card3)).setVisibility(0);
                this.Q.findViewById(R.id.view1).setBackgroundColor(utils12.checkBuildBeforesetColor(R.color.bpBlue, getActivity()));
                this.Q.findViewById(R.id.view2).setBackgroundColor(utils12.checkBuildBeforesetColor(R.color.bpBlue, getActivity()));
                this.Q.findViewById(R.id.view3).setBackgroundColor(utils12.checkBuildBeforesetColor(R.color.bpBlue, getActivity()));
                ((RobertoTextView) this.Q.findViewById(R.id.text1)).setText(this.R.text13);
                ((RobertoTextView) this.Q.findViewById(R.id.text2)).setText(this.R.text14);
                ((RobertoTextView) this.Q.findViewById(R.id.text3)).setText(this.R.text15);
                P(this.Q, this.M / this.G.getHeight());
                this.f20559u.setTextColor(utils12.checkBuildBeforesetColor(R.color.colorTextGrey, getContext()));
                this.H.setVisibility(4);
                this.f20563y.setVisibility(4);
                this.I.setVisibility(4);
                this.f20564z.setVisibility(4);
                return;
            case 13:
                this.P.setVisibility(0);
                this.Q.setVisibility(0);
                LinearLayout linearLayout6 = this.P;
                Utils utils13 = Utils.INSTANCE;
                linearLayout6.setBackgroundColor(utils13.checkBuildBeforesetColor(R.color.bpBlue, getContext()));
                this.B.setText("New Thoughts");
                this.K.setImageResource(R.drawable.ic_thought);
                this.C.setText("By thinking alternatively, you can change your thoughts.");
                this.f20559u.setTextColor(utils13.checkBuildBeforesetColor(R.color.white, getContext()));
                return;
            case 14:
                ((ThoughtsActivity) getActivity()).n0();
                this.P.setVisibility(8);
                O(R.color.bpBlue);
                this.f20560v.setText("New Thoughts");
                this.Q.setVisibility(8);
                this.H.setVisibility(0);
                this.H.setImageResource(R.drawable.ic_in_skill);
                this.f20563y.setVisibility(0);
                this.f20563y.setText("Alternative ways of thinking");
                this.I.setVisibility(4);
                this.f20564z.setVisibility(4);
                ImageView imageView6 = this.H;
                P(imageView6, this.M / imageView6.getHeight());
                RobertoTextView robertoTextView13 = this.f20563y;
                P(robertoTextView13, this.M / robertoTextView13.getHeight());
                this.E.setText("How does this new thought help?");
                RobertoTextView robertoTextView14 = this.E;
                Utils utils14 = Utils.INSTANCE;
                robertoTextView14.setTextColor(utils14.checkBuildBeforesetColor(R.color.bpBlue, getContext()));
                new Handler().postDelayed(new d(), 800L);
                new Handler().postDelayed(new e(), 300L);
                this.f20559u.setTextColor(utils14.checkBuildBeforesetColor(R.color.colorTextGrey, getContext()));
                this.J.setVisibility(4);
                this.A.setVisibility(4);
                return;
            case 15:
                this.P.setVisibility(0);
                LinearLayout linearLayout7 = this.P;
                Utils utils15 = Utils.INSTANCE;
                linearLayout7.setBackgroundColor(utils15.checkBuildBeforesetColor(R.color.seaSerpent, getContext()));
                this.B.setText("New Feeling");
                this.K.setImageResource(R.drawable.ic_feeling);
                this.C.setText("The new thought might make you feel better.");
                K();
                this.f20559u.setTextColor(utils15.checkBuildBeforesetColor(R.color.white, getContext()));
                return;
            case 16:
                ((ThoughtsActivity) getActivity()).n0();
                this.P.setVisibility(8);
                O(R.color.seaSerpent);
                this.f20560v.setText("New Feeling");
                this.J.setVisibility(0);
                this.J.setImageResource(R.drawable.ic_in_feeling);
                this.A.setVisibility(0);
                this.A.setText(Html.fromHtml(this.R.text17));
                new Handler().postDelayed(new f(), 900L);
                this.f20559u.setTextColor(Utils.INSTANCE.checkBuildBeforesetColor(R.color.colorTextGrey, getContext()));
                return;
            default:
                ((ThoughtsActivity) getActivity()).o0();
                return;
        }
    }

    public final void O(int i6) {
        this.f20560v.setTextColor(Utils.INSTANCE.checkBuildBeforesetColor(i6, getActivity()));
    }

    public final void P(View view, float f2) {
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, f2, 1, 0.0f);
        translateAnimation.setDuration(800L);
        view.startAnimation(translateAnimation);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_challenge_thoughts, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        Object obj;
        String str2;
        Object obj2;
        String str3;
        super.onViewCreated(view, bundle);
        try {
            this.f20560v = (RobertoTextView) view.findViewById(R.id.header);
            RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(R.id.screen1);
            this.P = (LinearLayout) view.findViewById(R.id.screen2);
            this.f20561w = (RobertoTextView) view.findViewById(R.id.textStep1);
            this.f20562x = (RobertoTextView) view.findViewById(R.id.textStep2);
            this.f20563y = (RobertoTextView) view.findViewById(R.id.textStep3);
            this.f20564z = (RobertoTextView) view.findViewById(R.id.textStep4);
            this.A = (RobertoTextView) view.findViewById(R.id.textStep5);
            this.F = (ImageView) view.findViewById(R.id.imageStep1);
            this.G = (ImageView) view.findViewById(R.id.imageStep2);
            this.H = (ImageView) view.findViewById(R.id.imageStep3);
            this.I = (ImageView) view.findViewById(R.id.imageStep4);
            this.J = (ImageView) view.findViewById(R.id.imageStep5);
            this.Q = (LinearLayout) view.findViewById(R.id.ll_desc);
            this.N = (ScrollView) view.findViewById(R.id.scroll_view);
            this.K = (AppCompatImageView) view.findViewById(R.id.overlayImage);
            this.B = (RobertoTextView) view.findViewById(R.id.overlyHeader);
            this.C = (RobertoTextView) view.findViewById(R.id.overlayDesc);
            this.D = (RobertoTextView) view.findViewById(R.id.LAEdesc);
            this.E = (RobertoTextView) view.findViewById(R.id.cardtext);
            this.O = (LinearLayout) view.findViewById(R.id.ll_cardview);
            RobertoTextView robertoTextView = (RobertoTextView) view.findViewById(R.id.btnSubmit);
            this.f20559u = robertoTextView;
            robertoTextView.setOnClickListener(new h());
            this.E.setOnClickListener(new i());
            Course courseById = FirebasePersistence.getInstance().getCourseById(FirebasePersistence.getInstance().getUser().getCurrentCourse());
            if (Objects.equals(courseById.getCourseName(), Constants.COURSE_STRESS)) {
                if (ThoughtsActivity.B.equals(Constants.THOUGHTS_WORK) && ThoughtsActivity.C.equals("I can usually tell what someone is thinking about me.")) {
                    this.R = Constants.getThoughtsDistortions(Constants.THOUGHTS_WORK, Constants.THOUGHTS_MIND_READING);
                } else if (ThoughtsActivity.B.equals(Constants.THOUGHTS_WORK) && ThoughtsActivity.C.equals(Constants.THOUGHTS_FORTUNE_TELLING_TEXT)) {
                    this.R = Constants.getThoughtsDistortions(Constants.THOUGHTS_WORK, Constants.THOUGHTS_FORTUNE_TELLING);
                } else if (ThoughtsActivity.B.equals(Constants.THOUGHTS_WORK) && ThoughtsActivity.C.equals(Constants.THOUGHTS_BLACK_AND_WHITE_THINKIING_TEXT)) {
                    this.R = Constants.getThoughtsDistortions(Constants.THOUGHTS_WORK, Constants.THOUGHTS_BLACK_AND_WHITE_THINKIING);
                } else if (ThoughtsActivity.B.equals(Constants.THOUGHTS_WORK) && ThoughtsActivity.C.equals(Constants.THOUGHTS_EMOTIONAL_REASONING_TEXT)) {
                    this.R = Constants.getThoughtsDistortions(Constants.THOUGHTS_WORK, Constants.THOUGHTS_EMOTIONAL_REASONING);
                } else if (ThoughtsActivity.B.equals(Constants.THOUGHTS_WORK) && ThoughtsActivity.C.equals("Things are always much worse for me than they might seem.")) {
                    this.R = Constants.getThoughtsDistortions(Constants.THOUGHTS_WORK, Constants.THOUGHTS_CATASTROPHISATION);
                } else if (ThoughtsActivity.B.equals(Constants.THOUGHTS_WORK) && ThoughtsActivity.C.equals("I have clear rules for how things should be and I stick to them.")) {
                    this.R = Constants.getThoughtsDistortions(Constants.THOUGHTS_WORK, Constants.THOUGHTS_SHOULD_AND_MUST);
                } else if (ThoughtsActivity.B.equals(Constants.THOUGHTS_RELATIONSHIP) && ThoughtsActivity.C.equals("I can usually tell what someone is thinking about me.")) {
                    this.R = Constants.getThoughtsDistortions(Constants.THOUGHTS_RELATIONSHIP, Constants.THOUGHTS_MIND_READING);
                } else if (ThoughtsActivity.B.equals(Constants.THOUGHTS_RELATIONSHIP) && ThoughtsActivity.C.equals(Constants.THOUGHTS_FORTUNE_TELLING_TEXT)) {
                    this.R = Constants.getThoughtsDistortions(Constants.THOUGHTS_RELATIONSHIP, Constants.THOUGHTS_FORTUNE_TELLING);
                } else if (ThoughtsActivity.B.equals(Constants.THOUGHTS_RELATIONSHIP) && ThoughtsActivity.C.equals(Constants.THOUGHTS_BLACK_AND_WHITE_THINKIING_TEXT)) {
                    this.R = Constants.getThoughtsDistortions(Constants.THOUGHTS_RELATIONSHIP, Constants.THOUGHTS_BLACK_AND_WHITE_THINKIING);
                } else if (ThoughtsActivity.B.equals(Constants.THOUGHTS_RELATIONSHIP) && ThoughtsActivity.C.equals(Constants.THOUGHTS_EMOTIONAL_REASONING_TEXT)) {
                    this.R = Constants.getThoughtsDistortions(Constants.THOUGHTS_RELATIONSHIP, Constants.THOUGHTS_EMOTIONAL_REASONING);
                } else if (ThoughtsActivity.B.equals(Constants.THOUGHTS_RELATIONSHIP) && ThoughtsActivity.C.equals("Things are always much worse for me than they might seem.")) {
                    this.R = Constants.getThoughtsDistortions(Constants.THOUGHTS_RELATIONSHIP, Constants.THOUGHTS_CATASTROPHISATION);
                } else if (ThoughtsActivity.B.equals(Constants.THOUGHTS_RELATIONSHIP) && ThoughtsActivity.C.equals("I have clear rules for how things should be and I stick to them.")) {
                    this.R = Constants.getThoughtsDistortions(Constants.THOUGHTS_RELATIONSHIP, Constants.THOUGHTS_SHOULD_AND_MUST);
                }
            } else if (Objects.equals(courseById.getCourseName(), Constants.COURSE_DEPRESSION)) {
                if (ThoughtsActivity.B.equals(Constants.THOUGHTS_WORK) && ThoughtsActivity.C.equals("I can usually tell what someone is thinking about me.")) {
                    this.R = Constants.getThoughtsDistortions(Constants.THOUGHTS_WORK, Constants.THOUGHTS_MIND_READING);
                } else if (ThoughtsActivity.B.equals(Constants.THOUGHTS_WORK) && ThoughtsActivity.C.equals(Constants.THOUGHTS_FORTUNE_TELLING_TEXT)) {
                    this.R = Constants.getThoughtsDistortions(Constants.THOUGHTS_WORK, Constants.THOUGHTS_FORTUNE_TELLING);
                } else if (ThoughtsActivity.B.equals(Constants.THOUGHTS_WORK) && ThoughtsActivity.C.equals(Constants.THOUGHTS_EMOTIONAL_REASONING_TEXT)) {
                    this.R = Constants.getThoughtsDistortions(Constants.THOUGHTS_WORK, Constants.THOUGHTS_EMOTIONAL_REASONING);
                } else if (ThoughtsActivity.B.equals(Constants.THOUGHTS_WORK) && ThoughtsActivity.C.equals(Constants.THOUGHTS_OVERGENERALISATION_TEXT)) {
                    this.R = Constants.getThoughtsDistortions(Constants.THOUGHTS_WORK, "overgeneralisation");
                } else if (ThoughtsActivity.B.equals(Constants.THOUGHTS_WORK) && ThoughtsActivity.C.equals("I have clear rules for how things should be and I stick to them.")) {
                    this.R = Constants.getThoughtsDistortions(Constants.THOUGHTS_WORK, Constants.THOUGHTS_SHOULD_AND_MUST);
                } else {
                    if (ThoughtsActivity.B.equals(Constants.THOUGHTS_WORK)) {
                        String str4 = ThoughtsActivity.C;
                        str3 = Constants.THOUGHTS_SHOULD_AND_MUST;
                        if (str4.equals(Constants.THOUGHTS_DISCOUNTING_THE_POSITIVE_TEXT)) {
                            this.R = Constants.getThoughtsDistortions(Constants.THOUGHTS_WORK, "discounting-the-positive");
                        }
                    } else {
                        str3 = Constants.THOUGHTS_SHOULD_AND_MUST;
                    }
                    if (ThoughtsActivity.B.equals(Constants.THOUGHTS_WORK) && ThoughtsActivity.C.equals(Constants.THOUGHTS_PERSONALISATION_TEXT)) {
                        this.R = Constants.getThoughtsDistortions(Constants.THOUGHTS_WORK, "personalisation");
                    } else if (ThoughtsActivity.B.equals(Constants.THOUGHTS_RELATIONSHIP) && ThoughtsActivity.C.equals("I can usually tell what someone is thinking about me.")) {
                        this.R = Constants.getThoughtsDistortions(Constants.THOUGHTS_RELATIONSHIP, Constants.THOUGHTS_MIND_READING);
                    } else if (ThoughtsActivity.B.equals(Constants.THOUGHTS_RELATIONSHIP) && ThoughtsActivity.C.equals(Constants.THOUGHTS_FORTUNE_TELLING_TEXT)) {
                        this.R = Constants.getThoughtsDistortions(Constants.THOUGHTS_RELATIONSHIP, Constants.THOUGHTS_FORTUNE_TELLING);
                    } else if (ThoughtsActivity.B.equals(Constants.THOUGHTS_RELATIONSHIP) && ThoughtsActivity.C.equals(Constants.THOUGHTS_OVERGENERALISATION_TEXT)) {
                        this.R = Constants.getThoughtsDistortions(Constants.THOUGHTS_RELATIONSHIP, "overgeneralisation");
                    } else if (ThoughtsActivity.B.equals(Constants.THOUGHTS_RELATIONSHIP) && ThoughtsActivity.C.equals(Constants.THOUGHTS_EMOTIONAL_REASONING_TEXT)) {
                        this.R = Constants.getThoughtsDistortions(Constants.THOUGHTS_RELATIONSHIP, Constants.THOUGHTS_EMOTIONAL_REASONING);
                    } else if (ThoughtsActivity.B.equals(Constants.THOUGHTS_RELATIONSHIP) && ThoughtsActivity.C.equals(Constants.THOUGHTS_DISCOUNTING_THE_POSITIVE_TEXT)) {
                        this.R = Constants.getThoughtsDistortions(Constants.THOUGHTS_RELATIONSHIP, "discounting-the-positive");
                    } else if (ThoughtsActivity.B.equals(Constants.THOUGHTS_RELATIONSHIP) && ThoughtsActivity.C.equals("I have clear rules for how things should be and I stick to them.")) {
                        this.R = Constants.getThoughtsDistortions(Constants.THOUGHTS_RELATIONSHIP, str3);
                    } else if (ThoughtsActivity.B.equals(Constants.THOUGHTS_RELATIONSHIP) && ThoughtsActivity.C.equals(Constants.THOUGHTS_PERSONALISATION_TEXT)) {
                        this.R = Constants.getThoughtsDistortions(Constants.THOUGHTS_RELATIONSHIP, "personalisation");
                    }
                }
            } else if (Objects.equals(courseById.getCourseName(), Constants.COURSE_HAPPINESS)) {
                if (ThoughtsActivity.B.equals(Constants.THOUGHTS_WORK) && ThoughtsActivity.C.equals("I can usually tell what someone is thinking about me.")) {
                    this.R = Constants.getThoughtsDistortions(Constants.THOUGHTS_WORK, Constants.THOUGHTS_MIND_READING);
                } else if (ThoughtsActivity.B.equals(Constants.THOUGHTS_WORK) && ThoughtsActivity.C.equals(Constants.THOUGHTS_FORTUNE_TELLING_TEXT)) {
                    this.R = Constants.getThoughtsDistortions(Constants.THOUGHTS_WORK, Constants.THOUGHTS_FORTUNE_TELLING);
                } else {
                    if (ThoughtsActivity.B.equals(Constants.THOUGHTS_WORK)) {
                        String str5 = ThoughtsActivity.C;
                        obj2 = Constants.THOUGHTS_BLACK_AND_WHITE_THINKIING_TEXT;
                        boolean equals = str5.equals(obj2);
                        str2 = Constants.THOUGHTS_BLACK_AND_WHITE_THINKIING;
                        if (equals) {
                            this.R = Constants.getThoughtsDistortions(Constants.THOUGHTS_WORK, str2);
                        }
                    } else {
                        str2 = Constants.THOUGHTS_BLACK_AND_WHITE_THINKIING;
                        obj2 = Constants.THOUGHTS_BLACK_AND_WHITE_THINKIING_TEXT;
                    }
                    if (ThoughtsActivity.B.equals(Constants.THOUGHTS_WORK) && ThoughtsActivity.C.equals("I have clear rules for how things should be and I stick to them.")) {
                        this.R = Constants.getThoughtsDistortions(Constants.THOUGHTS_WORK, Constants.THOUGHTS_SHOULD_AND_MUST);
                    } else if (ThoughtsActivity.B.equals(Constants.THOUGHTS_WORK) && ThoughtsActivity.C.equals(Constants.THOUGHTS_PERSONALISATION_TEXT)) {
                        this.R = Constants.getThoughtsDistortions(Constants.THOUGHTS_WORK, "personalisation");
                    } else if (ThoughtsActivity.B.equals(Constants.THOUGHTS_WORK) && ThoughtsActivity.C.equals("I usually blame situations and people for my problems.")) {
                        this.R = Constants.getThoughtsDistortions(Constants.THOUGHTS_WORK, "blaming");
                    } else if (ThoughtsActivity.B.equals(Constants.THOUGHTS_RELATIONSHIP) && ThoughtsActivity.C.equals("I can usually tell what someone is thinking about me.")) {
                        this.R = Constants.getThoughtsDistortions(Constants.THOUGHTS_RELATIONSHIP, Constants.THOUGHTS_MIND_READING);
                    } else if (ThoughtsActivity.B.equals(Constants.THOUGHTS_RELATIONSHIP) && ThoughtsActivity.C.equals(Constants.THOUGHTS_FORTUNE_TELLING_TEXT)) {
                        this.R = Constants.getThoughtsDistortions(Constants.THOUGHTS_RELATIONSHIP, Constants.THOUGHTS_FORTUNE_TELLING);
                    } else if (ThoughtsActivity.B.equals(Constants.THOUGHTS_RELATIONSHIP) && ThoughtsActivity.C.equals(obj2)) {
                        this.R = Constants.getThoughtsDistortions(Constants.THOUGHTS_RELATIONSHIP, str2);
                    } else if (ThoughtsActivity.B.equals(Constants.THOUGHTS_RELATIONSHIP) && ThoughtsActivity.C.equals("I usually blame situations and people for my problems.")) {
                        this.R = Constants.getThoughtsDistortions(Constants.THOUGHTS_RELATIONSHIP, "blaming");
                    } else if (ThoughtsActivity.B.equals(Constants.THOUGHTS_RELATIONSHIP) && ThoughtsActivity.C.equals("I have clear rules for how things should be and I stick to them.")) {
                        this.R = Constants.getThoughtsDistortions(Constants.THOUGHTS_RELATIONSHIP, Constants.THOUGHTS_SHOULD_AND_MUST);
                    } else if (ThoughtsActivity.B.equals(Constants.THOUGHTS_RELATIONSHIP) && ThoughtsActivity.C.equals(Constants.THOUGHTS_PERSONALISATION_TEXT)) {
                        this.R = Constants.getThoughtsDistortions(Constants.THOUGHTS_RELATIONSHIP, "personalisation");
                    }
                }
            } else if (Objects.equals(courseById.getCourseName(), Constants.COURSE_WORRY)) {
                if (ThoughtsActivity.B.equals(Constants.THOUGHTS_WORK) && ThoughtsActivity.C.equals("I can usually tell what someone is thinking about me.")) {
                    this.R = Constants.getThoughtsDistortions(Constants.THOUGHTS_WORK, Constants.THOUGHTS_WORRY_MIND_READING);
                } else if (ThoughtsActivity.B.equals(Constants.THOUGHTS_WORK) && ThoughtsActivity.C.equals(Constants.THOUGHTS_FORTUNE_TELLING_TEXT)) {
                    this.R = Constants.getThoughtsDistortions(Constants.THOUGHTS_WORK, Constants.THOUGHTS_FORTUNE_TELLING);
                } else if (ThoughtsActivity.B.equals(Constants.THOUGHTS_WORK) && ThoughtsActivity.C.equals(Constants.THOUGHTS_BLACK_AND_WHITE_THINKIING_TEXT)) {
                    this.R = Constants.getThoughtsDistortions(Constants.THOUGHTS_WORK, Constants.THOUGHTS_BLACK_AND_WHITE_THINKIING);
                } else if (ThoughtsActivity.B.equals(Constants.THOUGHTS_WORK) && ThoughtsActivity.C.equals("I have clear rules for how things should be and I stick to them.")) {
                    this.R = Constants.getThoughtsDistortions(Constants.THOUGHTS_WORK, Constants.THOUGHTS_SHOULD_AND_MUST);
                } else if (ThoughtsActivity.B.equals(Constants.THOUGHTS_WORK) && ThoughtsActivity.C.equals(Constants.THOUGHTS_PERSONALISATION_TEXT)) {
                    this.R = Constants.getThoughtsDistortions(Constants.THOUGHTS_WORK, "personalisation");
                } else {
                    if (ThoughtsActivity.B.equals(Constants.THOUGHTS_WORK)) {
                        obj = "Things are always much worse for me than they might seem.";
                        if (ThoughtsActivity.C.equals(obj)) {
                            this.R = Constants.getThoughtsDistortions(Constants.THOUGHTS_WORK, Constants.THOUGHTS_CATASTROPHISATION);
                        } else {
                            str = Constants.THOUGHTS_CATASTROPHISATION;
                        }
                    } else {
                        str = Constants.THOUGHTS_CATASTROPHISATION;
                        obj = "Things are always much worse for me than they might seem.";
                    }
                    if (ThoughtsActivity.B.equals(Constants.THOUGHTS_RELATIONSHIP) && ThoughtsActivity.C.equals("I can usually tell what someone is thinking about me.")) {
                        this.R = Constants.getThoughtsDistortions(Constants.THOUGHTS_RELATIONSHIP, Constants.THOUGHTS_WORRY_MIND_READING);
                    } else if (ThoughtsActivity.B.equals(Constants.THOUGHTS_RELATIONSHIP) && ThoughtsActivity.C.equals(Constants.THOUGHTS_FORTUNE_TELLING_TEXT)) {
                        this.R = Constants.getThoughtsDistortions(Constants.THOUGHTS_RELATIONSHIP, Constants.THOUGHTS_FORTUNE_TELLING);
                    } else if (ThoughtsActivity.B.equals(Constants.THOUGHTS_RELATIONSHIP) && ThoughtsActivity.C.equals(Constants.THOUGHTS_BLACK_AND_WHITE_THINKIING_TEXT)) {
                        this.R = Constants.getThoughtsDistortions(Constants.THOUGHTS_RELATIONSHIP, Constants.THOUGHTS_BLACK_AND_WHITE_THINKIING);
                    } else if (ThoughtsActivity.B.equals(Constants.THOUGHTS_RELATIONSHIP) && ThoughtsActivity.C.equals(obj)) {
                        this.R = Constants.getThoughtsDistortions(Constants.THOUGHTS_RELATIONSHIP, str);
                    } else if (ThoughtsActivity.B.equals(Constants.THOUGHTS_RELATIONSHIP) && ThoughtsActivity.C.equals("I have clear rules for how things should be and I stick to them.")) {
                        this.R = Constants.getThoughtsDistortions(Constants.THOUGHTS_RELATIONSHIP, Constants.THOUGHTS_SHOULD_AND_MUST);
                    } else if (ThoughtsActivity.B.equals(Constants.THOUGHTS_RELATIONSHIP) && ThoughtsActivity.C.equals(Constants.THOUGHTS_PERSONALISATION_TEXT)) {
                        this.R = Constants.getThoughtsDistortions(Constants.THOUGHTS_RELATIONSHIP, "personalisation");
                    }
                }
            } else if (Objects.equals(courseById.getCourseName(), Constants.COURSE_ANGER)) {
                if (ThoughtsActivity.B.equals(Constants.THOUGHTS_WORK) && ThoughtsActivity.C.equals("I can usually tell what someone is thinking about me.")) {
                    this.R = Constants.getThoughtsDistortions(Constants.THOUGHTS_WORK, Constants.THOUGHTS_ANGER_MIND_READING);
                } else if (ThoughtsActivity.B.equals(Constants.THOUGHTS_WORK) && ThoughtsActivity.C.equals(Constants.THOUGHTS_ANGER_LABELLING_TEXT)) {
                    this.R = Constants.getThoughtsDistortions(Constants.THOUGHTS_WORK, Constants.THOUGHTS_ANGER_LABELLING);
                } else if (ThoughtsActivity.B.equals(Constants.THOUGHTS_WORK) && ThoughtsActivity.C.equals("I usually blame situations and people for my problems.")) {
                    this.R = Constants.getThoughtsDistortions(Constants.THOUGHTS_WORK, Constants.THOUGHTS_ANGER_BLAMING);
                } else if (ThoughtsActivity.B.equals(Constants.THOUGHTS_WORK) && ThoughtsActivity.C.equals(Constants.THOUGHTS_OVERGENERALISATION_TEXT)) {
                    this.R = Constants.getThoughtsDistortions(Constants.THOUGHTS_WORK, "overgeneralisation");
                } else if (ThoughtsActivity.B.equals(Constants.THOUGHTS_WORK) && ThoughtsActivity.C.equals("Things are always much worse for me than they might seem.")) {
                    this.R = Constants.getThoughtsDistortions(Constants.THOUGHTS_WORK, Constants.THOUGHTS_ANGER_CATASTROPHISATION);
                } else if (ThoughtsActivity.B.equals(Constants.THOUGHTS_WORK) && ThoughtsActivity.C.equals("I have clear rules for how things should be and I stick to them.")) {
                    this.R = Constants.getThoughtsDistortions(Constants.THOUGHTS_WORK, Constants.THOUGHTS_ANGER_SHOULD_AND_MUST);
                } else if (ThoughtsActivity.B.equals(Constants.THOUGHTS_RELATIONSHIP) && ThoughtsActivity.C.equals("I can usually tell what someone is thinking about me.")) {
                    this.R = Constants.getThoughtsDistortions(Constants.THOUGHTS_RELATIONSHIP, Constants.THOUGHTS_ANGER_MIND_READING);
                } else if (ThoughtsActivity.B.equals(Constants.THOUGHTS_RELATIONSHIP) && ThoughtsActivity.C.equals(Constants.THOUGHTS_ANGER_LABELLING_TEXT)) {
                    this.R = Constants.getThoughtsDistortions(Constants.THOUGHTS_RELATIONSHIP, Constants.THOUGHTS_ANGER_LABELLING);
                } else if (ThoughtsActivity.B.equals(Constants.THOUGHTS_RELATIONSHIP) && ThoughtsActivity.C.equals("I usually blame situations and people for my problems.")) {
                    this.R = Constants.getThoughtsDistortions(Constants.THOUGHTS_RELATIONSHIP, Constants.THOUGHTS_ANGER_BLAMING);
                } else if (ThoughtsActivity.B.equals(Constants.THOUGHTS_RELATIONSHIP) && ThoughtsActivity.C.equals(Constants.THOUGHTS_OVERGENERALISATION_TEXT)) {
                    this.R = Constants.getThoughtsDistortions(Constants.THOUGHTS_RELATIONSHIP, "overgeneralisation");
                } else if (ThoughtsActivity.B.equals(Constants.THOUGHTS_RELATIONSHIP) && ThoughtsActivity.C.equals("Things are always much worse for me than they might seem.")) {
                    this.R = Constants.getThoughtsDistortions(Constants.THOUGHTS_RELATIONSHIP, Constants.THOUGHTS_ANGER_CATASTROPHISATION);
                } else if (ThoughtsActivity.B.equals(Constants.THOUGHTS_RELATIONSHIP) && ThoughtsActivity.C.equals("I have clear rules for how things should be and I stick to them.")) {
                    this.R = Constants.getThoughtsDistortions(Constants.THOUGHTS_RELATIONSHIP, Constants.THOUGHTS_ANGER_SHOULD_AND_MUST);
                }
            }
            this.F.post(new j());
            ((ImageView) view.findViewById(R.id.header_arrow_back)).setOnClickListener(new k());
            M();
            this.K.setOnClickListener(new l());
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(e10);
        }
    }

    /* compiled from: ChallengeThoughtsFragment.java */
    /* loaded from: classes2.dex */
    public class g implements Animator.AnimatorListener {
        public g() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            a.this.O.setVisibility(8);
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
