package zq;

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
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.t1;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.ProblemSolvingActivity;
import com.theinnerhour.b2b.model.Course;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import g.w;
/* compiled from: ProblemSolvingExampleFragment.java */
/* loaded from: classes2.dex */
public class a extends rr.b {
    public LinearLayout A;
    public LinearLayout B;
    public RelativeLayout C;
    public int D = 1;
    public int E;
    public int F;
    public LinearLayout G;
    public ScrollView H;
    public LayoutInflater I;
    public Course J;

    /* renamed from: u  reason: collision with root package name */
    public RobertoTextView f39801u;

    /* renamed from: v  reason: collision with root package name */
    public RobertoTextView f39802v;

    /* renamed from: w  reason: collision with root package name */
    public RobertoTextView f39803w;

    /* renamed from: x  reason: collision with root package name */
    public RobertoTextView f39804x;

    /* renamed from: y  reason: collision with root package name */
    public RobertoTextView f39805y;

    /* renamed from: z  reason: collision with root package name */
    public AppCompatImageView f39806z;

    /* compiled from: ProblemSolvingExampleFragment.java */
    /* loaded from: classes2.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            a aVar = a.this;
            a.J(aVar);
            aVar.H.smoothScrollTo(aVar.E / 2, aVar.F / 2);
        }
    }

    /* compiled from: ProblemSolvingExampleFragment.java */
    /* loaded from: classes2.dex */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            a.J(a.this);
        }
    }

    /* compiled from: ProblemSolvingExampleFragment.java */
    /* loaded from: classes2.dex */
    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            a.J(a.this);
        }
    }

    /* compiled from: ProblemSolvingExampleFragment.java */
    /* loaded from: classes2.dex */
    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            a aVar = a.this;
            Display defaultDisplay = ((WindowManager) aVar.getActivity().getSystemService("window")).getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            defaultDisplay.getMetrics(displayMetrics);
            aVar.E = displayMetrics.widthPixels;
            aVar.F = displayMetrics.heightPixels;
        }
    }

    /* compiled from: ProblemSolvingExampleFragment.java */
    /* loaded from: classes2.dex */
    public class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            a.this.getActivity().finish();
        }
    }

    /* compiled from: ProblemSolvingExampleFragment.java */
    /* loaded from: classes2.dex */
    public class g implements Runnable {
        public g() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            a.K(a.this);
        }
    }

    /* compiled from: ProblemSolvingExampleFragment.java */
    /* loaded from: classes2.dex */
    public class h implements Runnable {
        public h() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            a.K(a.this);
        }
    }

    /* compiled from: ProblemSolvingExampleFragment.java */
    /* loaded from: classes2.dex */
    public class i implements Runnable {
        public i() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            a.K(a.this);
        }
    }

    /* compiled from: ProblemSolvingExampleFragment.java */
    /* loaded from: classes2.dex */
    public class j implements Runnable {
        public j() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            a.K(a.this);
        }
    }

    static {
        w.a aVar = g.j.f16054u;
        int i6 = t1.f1560a;
    }

    public static void J(a aVar) {
        aVar.D++;
        if (aVar.J.getCourseName().equals(Constants.COURSE_WORRY)) {
            aVar.P(true);
        } else if (aVar.J.getCourseName().equals(Constants.COURSE_ANGER)) {
            aVar.O(true);
        }
    }

    public static void K(a aVar) {
        aVar.G.setVisibility(0);
        aVar.G.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        ValueAnimator ofInt = ValueAnimator.ofInt(0, aVar.G.getMeasuredHeight());
        ofInt.addUpdateListener(new zq.b(aVar));
        ofInt.start();
    }

    @Override // rr.b
    public final boolean I() {
        boolean z10 = true;
        int i6 = this.D - 1;
        this.D = i6;
        if (i6 > 0) {
            z10 = false;
            if (this.J.getCourseName().equals(Constants.COURSE_WORRY)) {
                P(false);
            } else if (this.J.getCourseName().equals(Constants.COURSE_ANGER)) {
                O(false);
            }
        }
        return z10;
    }

    public final void M() {
        ValueAnimator ofInt = ValueAnimator.ofInt(this.G.getHeight(), 0);
        ofInt.addUpdateListener(new zq.b(this));
        ofInt.addListener(new C0683a());
        ofInt.start();
    }

    public final void O(boolean z10) {
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        LinearLayout linearLayout3;
        LinearLayout linearLayout4;
        LinearLayout linearLayout5;
        LinearLayout linearLayout6;
        LinearLayout linearLayout7;
        LinearLayout linearLayout8;
        LinearLayout linearLayout9;
        switch (this.D) {
            case 1:
                ((ProblemSolvingActivity) getActivity()).o0();
                if (z10) {
                    LinearLayout linearLayout10 = (LinearLayout) this.I.inflate(R.layout.row_problem_solving_layout, (ViewGroup) null);
                    RobertoTextView robertoTextView = (RobertoTextView) linearLayout10.findViewById(R.id.imageStep);
                    this.f39802v.setVisibility(4);
                    robertoTextView.setText("Step \n1");
                    robertoTextView.setBackgroundResource(R.drawable.circle_filled_green);
                    ((RobertoTextView) linearLayout10.findViewById(R.id.textStep)).setText(Html.fromHtml("<strong><font color=\"#47A8AD\">Identify the Problem</font></strong><br>Begin by identifying the type of problem"));
                    ri.e.f(this, Utils.INSTANCE, R.color.colorTextGrey, this.f39801u);
                    this.B.addView(linearLayout10);
                    return;
                }
                this.B.removeView(this.B.getChildAt(1));
                this.B.getChildAt(0).setAlpha(1.0f);
                return;
            case 2:
                if (z10) {
                    linearLayout = (LinearLayout) this.I.inflate(R.layout.row_problem_solving_text, (ViewGroup) null);
                    this.B.addView(linearLayout);
                } else {
                    linearLayout = (LinearLayout) this.B.getChildAt(1);
                }
                this.B.getChildAt(0).setAlpha(0.2f);
                RobertoTextView robertoTextView2 = (RobertoTextView) linearLayout.findViewById(R.id.text);
                robertoTextView2.setVisibility(0);
                robertoTextView2.setText(Html.fromHtml("<strong><font color=\"#47A8AD\">Solvable Problems or Problems Within Your Control</font><strong><br>These are problems you can solve by actively taking steps towards doing the same."));
                ri.e.f(this, Utils.INSTANCE, R.color.colorTextGrey, this.f39801u);
                this.f39805y.setText("For Example: Getting to work late.");
                M();
                new Handler().postDelayed(new i(), 400L);
                return;
            case 3:
                if (z10) {
                    linearLayout2 = (LinearLayout) this.B.getChildAt(1);
                } else {
                    this.B.removeView(v.g.b(this.B, 1));
                    linearLayout2 = (LinearLayout) this.I.inflate(R.layout.row_problem_solving_text, (ViewGroup) null);
                    this.B.addView(linearLayout2);
                }
                RobertoTextView robertoTextView3 = (RobertoTextView) linearLayout2.findViewById(R.id.text);
                robertoTextView3.setVisibility(0);
                robertoTextView3.setText(Html.fromHtml("<strong><font color=\"#47A8AD\">Unsolvable Problems or Problems Not Within Your Control </font><strong><br>These are problems that you cannot really solve because you have no control over the outcome. You need to learn to 'let go' of the worry you have about this type of problem."));
                ri.e.f(this, Utils.INSTANCE, R.color.colorTextGrey, this.f39801u);
                this.f39805y.setText("For Example: There might be heavy rain tomorrow.");
                M();
                new Handler().postDelayed(new j(), 400L);
                return;
            case 4:
                this.B.removeView(v.g.b(this.B, 1));
                if (z10) {
                    ((ProblemSolvingActivity) getActivity()).o0();
                    linearLayout3 = (LinearLayout) this.I.inflate(R.layout.row_problem_solving_layout, (ViewGroup) null);
                    this.B.addView(linearLayout3);
                } else {
                    ((ProblemSolvingActivity) getActivity()).n0();
                    linearLayout3 = (LinearLayout) this.B.getChildAt(1);
                }
                RobertoTextView robertoTextView4 = (RobertoTextView) linearLayout3.findViewById(R.id.imageStep);
                RobertoTextView robertoTextView5 = (RobertoTextView) linearLayout3.findViewById(R.id.textStep);
                this.f39802v.setVisibility(4);
                robertoTextView4.setText("Step \n2");
                robertoTextView4.setBackgroundResource(R.drawable.circle_filled_purple);
                robertoTextView5.setText(Html.fromHtml("<strong><font color=\"#7961B5\">Define the Problem</font></strong><br>"));
                robertoTextView4.setAlpha(1.0f);
                robertoTextView5.setAlpha(1.0f);
                ri.e.f(this, Utils.INSTANCE, R.color.colorTextGrey, this.f39801u);
                return;
            case 5:
                if (!z10 && this.B.getChildCount() == 3) {
                    this.B.removeView(v.g.b(this.B, 1));
                }
                this.A.setVisibility(8);
                LinearLayout linearLayout11 = (LinearLayout) this.I.inflate(R.layout.row_problem_solving_text, (ViewGroup) null);
                this.B.addView(linearLayout11);
                this.B.removeView(linearLayout11);
                RobertoTextView robertoTextView6 = (RobertoTextView) linearLayout11.findViewById(R.id.text);
                robertoTextView6.setVisibility(0);
                robertoTextView6.setText(Html.fromHtml("It's important to first understand your problem and state it in terms of what you observe rather than what you feel."));
                this.B.addView(linearLayout11);
                this.f39801u.setTextColor(Utils.INSTANCE.checkBuildBeforesetColor(R.color.colorTextGrey, getContext()));
                M();
                return;
            case 6:
                this.A.setVisibility(0);
                this.f39806z.setImageResource(R.drawable.ic_feeling);
                this.f39803w.setText("Define the problem");
                this.f39804x.setText("\"Ask yourself why you are angry. \nAre you annoyed because of work, conflicts at home or with friends?\nAccordingly, your final problem definition could be -\"I am angry because my colleague keeps delaying my work.\"");
                M();
                return;
            case 7:
                this.B.removeView(v.g.b(this.B, 1));
                if (z10) {
                    ((ProblemSolvingActivity) getActivity()).o0();
                    LinearLayout linearLayout12 = this.B;
                    linearLayout12.getChildAt(linearLayout12.getChildCount() - 1).setAlpha(0.2f);
                    linearLayout4 = (LinearLayout) this.I.inflate(R.layout.row_problem_solving_layout, (ViewGroup) null);
                    this.B.addView(linearLayout4);
                } else {
                    ((ProblemSolvingActivity) getActivity()).n0();
                    linearLayout4 = (LinearLayout) this.B.getChildAt(2);
                }
                this.A.setVisibility(8);
                RobertoTextView robertoTextView7 = (RobertoTextView) linearLayout4.findViewById(R.id.imageStep);
                RobertoTextView robertoTextView8 = (RobertoTextView) linearLayout4.findViewById(R.id.textStep);
                this.f39802v.setVisibility(4);
                robertoTextView7.setText("Step \n3");
                robertoTextView7.setBackgroundResource(R.drawable.circle_filled_green);
                robertoTextView8.setText(Html.fromHtml("<strong><font color=\"#47A8AD\">List all possible solutions</font></strong><br>"));
                robertoTextView7.setAlpha(1.0f);
                robertoTextView8.setAlpha(1.0f);
                ri.e.f(this, Utils.INSTANCE, R.color.colorTextGrey, this.f39801u);
                return;
            case 8:
                if (!z10 && this.B.getChildCount() == 4) {
                    this.B.removeView(v.g.b(this.B, 1));
                }
                this.A.setVisibility(8);
                LinearLayout linearLayout13 = (LinearLayout) this.I.inflate(R.layout.row_problem_solving_text, (ViewGroup) null);
                this.B.addView(linearLayout13);
                this.B.removeView(linearLayout13);
                RobertoTextView robertoTextView9 = (RobertoTextView) linearLayout13.findViewById(R.id.text);
                robertoTextView9.setVisibility(0);
                robertoTextView9.setText(Html.fromHtml("Even if they might seem silly to you, write all of them down anyway."));
                this.B.addView(linearLayout13);
                this.f39801u.setTextColor(Utils.INSTANCE.checkBuildBeforesetColor(R.color.colorTextGrey, getContext()));
                M();
                return;
            case 9:
                this.A.setVisibility(0);
                this.f39806z.setImageResource(R.drawable.ic_feeling);
                this.f39803w.setText("List all possible solutions");
                this.f39804x.setText("Possible solutions are:\n-Discussing your difficulties with the colleague in question. \n-Looking for ways you can complete the project on your own. \n-Speaking to your boss about the difficulties you are facing. \n-Requesting a change of project.");
                M();
                return;
            case 10:
                this.B.removeView(v.g.b(this.B, 1));
                if (z10) {
                    ((ProblemSolvingActivity) getActivity()).o0();
                    LinearLayout linearLayout14 = this.B;
                    linearLayout14.getChildAt(linearLayout14.getChildCount() - 1).setAlpha(0.2f);
                    linearLayout5 = (LinearLayout) this.I.inflate(R.layout.row_problem_solving_layout, (ViewGroup) null);
                    this.B.addView(linearLayout5);
                } else {
                    ((ProblemSolvingActivity) getActivity()).n0();
                    linearLayout5 = (LinearLayout) this.B.getChildAt(3);
                }
                this.A.setVisibility(8);
                RobertoTextView robertoTextView10 = (RobertoTextView) linearLayout5.findViewById(R.id.imageStep);
                RobertoTextView robertoTextView11 = (RobertoTextView) linearLayout5.findViewById(R.id.textStep);
                this.f39802v.setVisibility(4);
                robertoTextView10.setText("Step \n4");
                robertoTextView10.setBackgroundResource(R.drawable.circle_filled_purple);
                robertoTextView11.setText(Html.fromHtml("<strong><font color=\"#7961B5\">Remove the ones that you believe are undesirable</font></strong>"));
                robertoTextView10.setAlpha(1.0f);
                robertoTextView11.setAlpha(1.0f);
                ri.e.f(this, Utils.INSTANCE, R.color.colorTextGrey, this.f39801u);
                return;
            case 11:
                if (!z10 && this.B.getChildCount() == 5) {
                    this.B.removeView(v.g.b(this.B, 1));
                }
                this.A.setVisibility(8);
                LinearLayout linearLayout15 = (LinearLayout) this.I.inflate(R.layout.row_problem_solving_text, (ViewGroup) null);
                this.B.addView(linearLayout15);
                this.B.removeView(linearLayout15);
                RobertoTextView robertoTextView12 = (RobertoTextView) linearLayout15.findViewById(R.id.text);
                robertoTextView12.setVisibility(0);
                robertoTextView12.setText(Html.fromHtml("Do this only after you've listed as many solutions as possible."));
                this.B.addView(linearLayout15);
                this.f39801u.setTextColor(Utils.INSTANCE.checkBuildBeforesetColor(R.color.colorTextGrey, getContext()));
                M();
                return;
            case 12:
                this.A.setVisibility(0);
                this.f39806z.setImageResource(R.drawable.ic_feeling);
                this.f39803w.setText("Remove the ones that you believe are undesirable");
                this.f39804x.setText("You might not be able to speak to your boss as they might be unavailable and asking for a change of project might create too much chaos at work.");
                M();
                return;
            case 13:
                this.B.removeView(v.g.b(this.B, 1));
                if (z10) {
                    ((ProblemSolvingActivity) getActivity()).o0();
                    LinearLayout linearLayout16 = this.B;
                    linearLayout16.getChildAt(linearLayout16.getChildCount() - 1).setAlpha(0.2f);
                    linearLayout6 = (LinearLayout) this.I.inflate(R.layout.row_problem_solving_layout, (ViewGroup) null);
                    this.B.addView(linearLayout6);
                } else {
                    ((ProblemSolvingActivity) getActivity()).n0();
                    linearLayout6 = (LinearLayout) this.B.getChildAt(4);
                }
                this.A.setVisibility(8);
                RobertoTextView robertoTextView13 = (RobertoTextView) linearLayout6.findViewById(R.id.imageStep);
                RobertoTextView robertoTextView14 = (RobertoTextView) linearLayout6.findViewById(R.id.textStep);
                this.f39802v.setVisibility(4);
                robertoTextView13.setText("Step \n5");
                robertoTextView13.setBackgroundResource(R.drawable.circle_filled_green);
                robertoTextView14.setText(Html.fromHtml("<strong><font color=\"#47A8AD\">Evaluate the outcomes</font></strong><br>"));
                robertoTextView13.setAlpha(1.0f);
                robertoTextView14.setAlpha(1.0f);
                ri.e.f(this, Utils.INSTANCE, R.color.colorTextGrey, this.f39801u);
                return;
            case 14:
                if (!z10 && this.B.getChildCount() == 6) {
                    this.B.removeView(v.g.b(this.B, 1));
                }
                this.A.setVisibility(8);
                LinearLayout linearLayout17 = (LinearLayout) this.I.inflate(R.layout.row_problem_solving_text, (ViewGroup) null);
                this.B.addView(linearLayout17);
                this.B.removeView(linearLayout17);
                RobertoTextView robertoTextView15 = (RobertoTextView) linearLayout17.findViewById(R.id.text);
                robertoTextView15.setVisibility(0);
                robertoTextView15.setText(Html.fromHtml("List down the possible outcomes for each solution, if there is more than one outcome, write that down as well."));
                this.B.addView(linearLayout17);
                this.f39801u.setTextColor(Utils.INSTANCE.checkBuildBeforesetColor(R.color.colorTextGrey, getContext()));
                M();
                return;
            case 15:
                this.A.setVisibility(0);
                this.f39806z.setImageResource(R.drawable.ic_feeling);
                this.f39803w.setText("Evaluate the outcomes");
                this.f39804x.setText("You now have to choose between speaking to your colleague or completing the project on your own. You realise that completing the project on your own is impossible so you must speak to your colleague.");
                M();
                return;
            case 16:
                this.B.removeView(v.g.b(this.B, 1));
                if (z10) {
                    ((ProblemSolvingActivity) getActivity()).o0();
                    LinearLayout linearLayout18 = this.B;
                    linearLayout18.getChildAt(linearLayout18.getChildCount() - 1).setAlpha(0.2f);
                    linearLayout7 = (LinearLayout) this.I.inflate(R.layout.row_problem_solving_layout, (ViewGroup) null);
                    this.B.addView(linearLayout7);
                } else {
                    ((ProblemSolvingActivity) getActivity()).n0();
                    linearLayout7 = (LinearLayout) this.B.getChildAt(5);
                }
                this.A.setVisibility(8);
                RobertoTextView robertoTextView16 = (RobertoTextView) linearLayout7.findViewById(R.id.imageStep);
                RobertoTextView robertoTextView17 = (RobertoTextView) linearLayout7.findViewById(R.id.textStep);
                this.f39802v.setVisibility(4);
                robertoTextView16.setText("Step \n6");
                robertoTextView16.setBackgroundResource(R.drawable.circle_filled_purple);
                robertoTextView17.setText(Html.fromHtml("<strong><font color=\"#7961B5\">Make a plan</font></strong><br>"));
                robertoTextView16.setAlpha(1.0f);
                robertoTextView17.setAlpha(1.0f);
                ri.e.f(this, Utils.INSTANCE, R.color.colorTextGrey, this.f39801u);
                return;
            case 17:
                if (!z10 && this.B.getChildCount() == 7) {
                    this.B.removeView(v.g.b(this.B, 1));
                }
                this.A.setVisibility(8);
                LinearLayout linearLayout19 = (LinearLayout) this.I.inflate(R.layout.row_problem_solving_text, (ViewGroup) null);
                this.B.addView(linearLayout19);
                this.B.removeView(linearLayout19);
                RobertoTextView robertoTextView18 = (RobertoTextView) linearLayout19.findViewById(R.id.text);
                robertoTextView18.setVisibility(0);
                robertoTextView18.setText(Html.fromHtml("Once you've decided on a solution, think of all the steps you would have to take in order to effectively carry it out. Try and list out the when, how, and where aspects of it as well."));
                this.B.addView(linearLayout19);
                this.f39801u.setTextColor(Utils.INSTANCE.checkBuildBeforesetColor(R.color.colorTextGrey, getContext()));
                M();
                return;
            case 18:
                this.A.setVisibility(0);
                this.f39806z.setImageResource(R.drawable.ic_feeling);
                this.f39803w.setText("Make a plan");
                this.f39804x.setText("You will now have to think about how you can broach the topic with your colleague in such a way so that they do not feel attacked and you do not feel more frustrated. You can list out a number of concerns you have and think of ways to bring them up in a calm, constructive manner.");
                M();
                return;
            case 19:
                this.B.removeView(v.g.b(this.B, 1));
                if (z10) {
                    ((ProblemSolvingActivity) getActivity()).o0();
                    LinearLayout linearLayout20 = this.B;
                    linearLayout20.getChildAt(linearLayout20.getChildCount() - 1).setAlpha(0.2f);
                    linearLayout8 = (LinearLayout) this.I.inflate(R.layout.row_problem_solving_layout, (ViewGroup) null);
                    this.B.addView(linearLayout8);
                } else {
                    ((ProblemSolvingActivity) getActivity()).n0();
                    linearLayout8 = (LinearLayout) this.B.getChildAt(6);
                }
                this.A.setVisibility(8);
                RobertoTextView robertoTextView19 = (RobertoTextView) linearLayout8.findViewById(R.id.imageStep);
                RobertoTextView robertoTextView20 = (RobertoTextView) linearLayout8.findViewById(R.id.textStep);
                this.f39802v.setVisibility(4);
                robertoTextView19.setText("Step \n7");
                robertoTextView19.setBackgroundResource(R.drawable.circle_filled_green);
                robertoTextView20.setText(Html.fromHtml("<strong><font color=\"#47A8AD\">Carry out your plan</font></strong><br>"));
                robertoTextView19.setAlpha(1.0f);
                robertoTextView20.setAlpha(1.0f);
                ri.e.f(this, Utils.INSTANCE, R.color.colorTextGrey, this.f39801u);
                return;
            case 20:
                if (!z10 && this.B.getChildCount() == 8) {
                    this.B.removeView(v.g.b(this.B, 1));
                }
                this.A.setVisibility(8);
                LinearLayout linearLayout21 = (LinearLayout) this.I.inflate(R.layout.row_problem_solving_text, (ViewGroup) null);
                this.B.addView(linearLayout21);
                this.B.removeView(linearLayout21);
                RobertoTextView robertoTextView21 = (RobertoTextView) linearLayout21.findViewById(R.id.text);
                robertoTextView21.setVisibility(0);
                robertoTextView21.setText(Html.fromHtml("It's now time to implement the plan you've constructed."));
                this.B.addView(linearLayout21);
                this.f39801u.setTextColor(Utils.INSTANCE.checkBuildBeforesetColor(R.color.colorTextGrey, getContext()));
                M();
                return;
            case 21:
                this.A.setVisibility(0);
                this.f39806z.setImageResource(R.drawable.ic_feeling);
                this.f39803w.setText("Carry out your plan");
                this.f39804x.setText("Once you have a plan, you schedule a meeting with your colleague.");
                M();
                return;
            case 22:
                this.B.removeView(v.g.b(this.B, 1));
                if (z10) {
                    ((ProblemSolvingActivity) getActivity()).o0();
                    LinearLayout linearLayout22 = this.B;
                    linearLayout22.getChildAt(linearLayout22.getChildCount() - 1).setAlpha(0.2f);
                    linearLayout9 = (LinearLayout) this.I.inflate(R.layout.row_problem_solving_layout, (ViewGroup) null);
                    this.B.addView(linearLayout9);
                } else {
                    ((ProblemSolvingActivity) getActivity()).n0();
                    linearLayout9 = (LinearLayout) this.B.getChildAt(7);
                }
                this.A.setVisibility(8);
                RobertoTextView robertoTextView22 = (RobertoTextView) linearLayout9.findViewById(R.id.imageStep);
                RobertoTextView robertoTextView23 = (RobertoTextView) linearLayout9.findViewById(R.id.textStep);
                this.f39802v.setVisibility(4);
                robertoTextView22.setText("Step \n8");
                robertoTextView22.setBackgroundResource(R.drawable.circle_filled_purple);
                robertoTextView23.setText(Html.fromHtml("<strong><font color=\"#7961B5\">Reflect on the outcomes</font></strong><br>"));
                robertoTextView22.setAlpha(1.0f);
                robertoTextView23.setAlpha(1.0f);
                ri.e.f(this, Utils.INSTANCE, R.color.colorTextGrey, this.f39801u);
                return;
            case 23:
                if (!z10 && this.B.getChildCount() == 9) {
                    this.B.removeView(v.g.b(this.B, 1));
                }
                this.A.setVisibility(8);
                LinearLayout linearLayout23 = (LinearLayout) this.I.inflate(R.layout.row_problem_solving_text, (ViewGroup) null);
                this.B.addView(linearLayout23);
                this.B.removeView(linearLayout23);
                RobertoTextView robertoTextView24 = (RobertoTextView) linearLayout23.findViewById(R.id.text);
                robertoTextView24.setVisibility(0);
                robertoTextView24.setText(Html.fromHtml("Was the outcome desirable and effective? Maybe your plan needed a few changes or a new plan might help the situation better."));
                this.B.addView(linearLayout23);
                this.f39801u.setTextColor(Utils.INSTANCE.checkBuildBeforesetColor(R.color.colorTextGrey, getContext()));
                M();
                return;
            case 24:
                this.A.setVisibility(0);
                this.f39806z.setImageResource(R.drawable.ic_feeling);
                this.f39803w.setText("Reflect on the outcomes");
                this.f39804x.setText("After the meeting, take a moment to think about whether your plan was successful. Think about what you could have done differently and what you'd like to remember the next time a similar situation takes place.");
                M();
                return;
            default:
                ProblemSolvingActivity problemSolvingActivity = (ProblemSolvingActivity) getActivity();
                problemSolvingActivity.o0();
                problemSolvingActivity.f10462w++;
                problemSolvingActivity.p0(false, true);
                return;
        }
    }

    public final void P(boolean z10) {
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        LinearLayout linearLayout3;
        LinearLayout linearLayout4;
        LinearLayout linearLayout5;
        LinearLayout linearLayout6;
        LinearLayout linearLayout7;
        LinearLayout linearLayout8;
        LinearLayout linearLayout9;
        switch (this.D) {
            case 1:
                ((ProblemSolvingActivity) getActivity()).o0();
                if (z10) {
                    LinearLayout linearLayout10 = (LinearLayout) this.I.inflate(R.layout.row_problem_solving_layout, (ViewGroup) null);
                    RobertoTextView robertoTextView = (RobertoTextView) linearLayout10.findViewById(R.id.imageStep);
                    this.f39802v.setVisibility(4);
                    robertoTextView.setBackgroundResource(R.drawable.circle_filled_green);
                    robertoTextView.setText("Step \n1");
                    ((RobertoTextView) linearLayout10.findViewById(R.id.textStep)).setText(Html.fromHtml("<strong><font color=\"#47A8AD\">Identify the Problem</font></strong><br>Begin by identifying the type of problem"));
                    ri.e.f(this, Utils.INSTANCE, R.color.colorTextGrey, this.f39801u);
                    this.B.addView(linearLayout10);
                    return;
                }
                this.B.removeView(this.B.getChildAt(1));
                this.B.getChildAt(0).setAlpha(1.0f);
                return;
            case 2:
                if (z10) {
                    linearLayout = (LinearLayout) this.I.inflate(R.layout.row_problem_solving_text, (ViewGroup) null);
                    this.B.addView(linearLayout);
                } else {
                    linearLayout = (LinearLayout) this.B.getChildAt(1);
                }
                this.B.getChildAt(0).setAlpha(0.2f);
                RobertoTextView robertoTextView2 = (RobertoTextView) linearLayout.findViewById(R.id.text);
                robertoTextView2.setVisibility(0);
                robertoTextView2.setText(Html.fromHtml("<strong><font color=\"#47A8AD\">Solvable Problems or Problems Within Your Control</font><strong><br>These are problems you can solve by actively taking steps towards doing the same."));
                ri.e.f(this, Utils.INSTANCE, R.color.colorTextGrey, this.f39801u);
                this.f39805y.setText("For Example: Getting to work late.");
                M();
                new Handler().postDelayed(new g(), 400L);
                return;
            case 3:
                if (z10) {
                    linearLayout2 = (LinearLayout) this.B.getChildAt(1);
                } else {
                    this.B.removeView(v.g.b(this.B, 1));
                    linearLayout2 = (LinearLayout) this.I.inflate(R.layout.row_problem_solving_text, (ViewGroup) null);
                    this.B.addView(linearLayout2);
                }
                RobertoTextView robertoTextView3 = (RobertoTextView) linearLayout2.findViewById(R.id.text);
                robertoTextView3.setVisibility(0);
                robertoTextView3.setText(Html.fromHtml("<strong><font color=\"#47A8AD\">Unsolvable Problems or Problems Not Within Your Control</font><strong><br>These are problems that you cannot really solve because you have no control over the outcome. You need to learn to 'let go' of the worry you have about this type of problem."));
                ri.e.f(this, Utils.INSTANCE, R.color.colorTextGrey, this.f39801u);
                this.f39805y.setText("For Example: There might be heavy rain tomorrow.");
                M();
                new Handler().postDelayed(new h(), 400L);
                return;
            case 4:
                this.B.removeView(v.g.b(this.B, 1));
                if (z10) {
                    ((ProblemSolvingActivity) getActivity()).o0();
                    linearLayout3 = (LinearLayout) this.I.inflate(R.layout.row_problem_solving_layout, (ViewGroup) null);
                    this.B.addView(linearLayout3);
                } else {
                    ((ProblemSolvingActivity) getActivity()).n0();
                    linearLayout3 = (LinearLayout) this.B.getChildAt(1);
                }
                RobertoTextView robertoTextView4 = (RobertoTextView) linearLayout3.findViewById(R.id.imageStep);
                RobertoTextView robertoTextView5 = (RobertoTextView) linearLayout3.findViewById(R.id.textStep);
                this.f39802v.setVisibility(4);
                robertoTextView4.setText("Step \n2");
                robertoTextView4.setBackgroundResource(R.drawable.circle_filled_purple);
                robertoTextView5.setText(Html.fromHtml("<strong><font color=\"#7961B5\">Define the Problem</font></strong><br>"));
                robertoTextView4.setAlpha(1.0f);
                robertoTextView5.setAlpha(1.0f);
                ri.e.f(this, Utils.INSTANCE, R.color.colorTextGrey, this.f39801u);
                return;
            case 5:
                if (!z10 && this.B.getChildCount() == 3) {
                    this.B.removeView(v.g.b(this.B, 1));
                }
                this.A.setVisibility(8);
                LinearLayout linearLayout11 = (LinearLayout) this.I.inflate(R.layout.row_problem_solving_text, (ViewGroup) null);
                this.B.addView(linearLayout11);
                this.B.removeView(linearLayout11);
                RobertoTextView robertoTextView6 = (RobertoTextView) linearLayout11.findViewById(R.id.text);
                robertoTextView6.setVisibility(0);
                robertoTextView6.setText(Html.fromHtml("It's important to first understand your problem and state it in terms of what you observe rather than what you feel."));
                this.B.addView(linearLayout11);
                this.f39801u.setTextColor(Utils.INSTANCE.checkBuildBeforesetColor(R.color.colorTextGrey, getContext()));
                M();
                return;
            case 6:
                this.A.setVisibility(0);
                this.f39806z.setImageResource(R.drawable.ic_feeling);
                this.f39803w.setText("Define the problem");
                this.f39804x.setText("Ask yourself why you are late. \nDid you wake up too late? \nIs there traffic on the way to work? \nAccordingly, your final problem definition could be -\n\"I am late to work because there is too much traffic on the way.\"\nor\n\"I am late to work because I got up late. \"");
                M();
                return;
            case 7:
                this.B.removeView(v.g.b(this.B, 1));
                if (z10) {
                    ((ProblemSolvingActivity) getActivity()).o0();
                    LinearLayout linearLayout12 = this.B;
                    linearLayout12.getChildAt(linearLayout12.getChildCount() - 1).setAlpha(0.2f);
                    linearLayout4 = (LinearLayout) this.I.inflate(R.layout.row_problem_solving_layout, (ViewGroup) null);
                    this.B.addView(linearLayout4);
                } else {
                    ((ProblemSolvingActivity) getActivity()).n0();
                    linearLayout4 = (LinearLayout) this.B.getChildAt(2);
                }
                this.A.setVisibility(8);
                RobertoTextView robertoTextView7 = (RobertoTextView) linearLayout4.findViewById(R.id.imageStep);
                RobertoTextView robertoTextView8 = (RobertoTextView) linearLayout4.findViewById(R.id.textStep);
                this.f39802v.setVisibility(4);
                robertoTextView7.setText("Step \n3");
                robertoTextView7.setBackgroundResource(R.drawable.circle_filled_green);
                robertoTextView8.setText(Html.fromHtml("<strong><font color=\"#47A8AD\">List all possible solutions</font></strong><br>"));
                robertoTextView7.setAlpha(1.0f);
                robertoTextView8.setAlpha(1.0f);
                ri.e.f(this, Utils.INSTANCE, R.color.colorTextGrey, this.f39801u);
                return;
            case 8:
                if (!z10 && this.B.getChildCount() == 4) {
                    this.B.removeView(v.g.b(this.B, 1));
                }
                this.A.setVisibility(8);
                LinearLayout linearLayout13 = (LinearLayout) this.I.inflate(R.layout.row_problem_solving_text, (ViewGroup) null);
                this.B.addView(linearLayout13);
                this.B.removeView(linearLayout13);
                RobertoTextView robertoTextView9 = (RobertoTextView) linearLayout13.findViewById(R.id.text);
                robertoTextView9.setVisibility(0);
                robertoTextView9.setText(Html.fromHtml("Even if they might seem silly to you, write all of them down anyway."));
                this.B.addView(linearLayout13);
                this.f39801u.setTextColor(Utils.INSTANCE.checkBuildBeforesetColor(R.color.colorTextGrey, getContext()));
                M();
                return;
            case 9:
                this.A.setVisibility(0);
                this.f39806z.setImageResource(R.drawable.ic_feeling);
                this.f39803w.setText("List all possible solutions");
                this.f39804x.setText("Possible solutions are:\n- Waking up earlier than usual\n- If you travel by road, you could consider changing your mode of transport, for example taking a train instead of driving. \n- Leaving a little earlier than usual. \n- Changing your route to work.");
                M();
                return;
            case 10:
                this.B.removeView(v.g.b(this.B, 1));
                if (z10) {
                    ((ProblemSolvingActivity) getActivity()).o0();
                    LinearLayout linearLayout14 = this.B;
                    linearLayout14.getChildAt(linearLayout14.getChildCount() - 1).setAlpha(0.2f);
                    linearLayout5 = (LinearLayout) this.I.inflate(R.layout.row_problem_solving_layout, (ViewGroup) null);
                    this.B.addView(linearLayout5);
                } else {
                    ((ProblemSolvingActivity) getActivity()).n0();
                    linearLayout5 = (LinearLayout) this.B.getChildAt(3);
                }
                this.A.setVisibility(8);
                RobertoTextView robertoTextView10 = (RobertoTextView) linearLayout5.findViewById(R.id.imageStep);
                RobertoTextView robertoTextView11 = (RobertoTextView) linearLayout5.findViewById(R.id.textStep);
                this.f39802v.setVisibility(4);
                robertoTextView10.setText("Step \n4");
                robertoTextView10.setBackgroundResource(R.drawable.circle_filled_purple);
                robertoTextView11.setText(Html.fromHtml("<strong><font color=\"#7961B5\">Remove the ones that you believe are undesirable</font></strong>"));
                robertoTextView10.setAlpha(1.0f);
                robertoTextView11.setAlpha(1.0f);
                ri.e.f(this, Utils.INSTANCE, R.color.colorTextGrey, this.f39801u);
                return;
            case 11:
                if (!z10 && this.B.getChildCount() == 5) {
                    this.B.removeView(v.g.b(this.B, 1));
                }
                this.A.setVisibility(8);
                LinearLayout linearLayout15 = (LinearLayout) this.I.inflate(R.layout.row_problem_solving_text, (ViewGroup) null);
                this.B.addView(linearLayout15);
                this.B.removeView(linearLayout15);
                RobertoTextView robertoTextView12 = (RobertoTextView) linearLayout15.findViewById(R.id.text);
                robertoTextView12.setVisibility(0);
                robertoTextView12.setText(Html.fromHtml("Do this only after you've listed as many solutions as possible."));
                this.B.addView(linearLayout15);
                this.f39801u.setTextColor(Utils.INSTANCE.checkBuildBeforesetColor(R.color.colorTextGrey, getContext()));
                M();
                return;
            case 12:
                this.A.setVisibility(0);
                this.f39806z.setImageResource(R.drawable.ic_feeling);
                this.f39803w.setText("Remove the ones that you believe are undesirable");
                this.f39804x.setText("You cannot leave earlier because you have to drop your child at school. Additionally, you might not be able to wake up earlier because you would like to get a good night's rest.");
                M();
                return;
            case 13:
                this.B.removeView(v.g.b(this.B, 1));
                if (z10) {
                    ((ProblemSolvingActivity) getActivity()).o0();
                    LinearLayout linearLayout16 = this.B;
                    linearLayout16.getChildAt(linearLayout16.getChildCount() - 1).setAlpha(0.2f);
                    linearLayout6 = (LinearLayout) this.I.inflate(R.layout.row_problem_solving_layout, (ViewGroup) null);
                    this.B.addView(linearLayout6);
                } else {
                    ((ProblemSolvingActivity) getActivity()).n0();
                    linearLayout6 = (LinearLayout) this.B.getChildAt(4);
                }
                this.A.setVisibility(8);
                RobertoTextView robertoTextView13 = (RobertoTextView) linearLayout6.findViewById(R.id.imageStep);
                RobertoTextView robertoTextView14 = (RobertoTextView) linearLayout6.findViewById(R.id.textStep);
                this.f39802v.setVisibility(4);
                robertoTextView13.setText("Step \n5");
                robertoTextView13.setBackgroundResource(R.drawable.button_border_gray);
                robertoTextView14.setText(Html.fromHtml("<strong><font color=\"#47A8AD\">Evaluate the outcomes</font></strong><br>"));
                robertoTextView13.setAlpha(1.0f);
                robertoTextView14.setAlpha(1.0f);
                ri.e.f(this, Utils.INSTANCE, R.color.colorTextGrey, this.f39801u);
                return;
            case 14:
                if (!z10 && this.B.getChildCount() == 6) {
                    this.B.removeView(v.g.b(this.B, 1));
                }
                this.A.setVisibility(8);
                LinearLayout linearLayout17 = (LinearLayout) this.I.inflate(R.layout.row_problem_solving_text, (ViewGroup) null);
                this.B.addView(linearLayout17);
                this.B.removeView(linearLayout17);
                RobertoTextView robertoTextView15 = (RobertoTextView) linearLayout17.findViewById(R.id.text);
                robertoTextView15.setVisibility(0);
                robertoTextView15.setText(Html.fromHtml("List down the possible outcomes for each solution, if there is more than one outcome, write that down as well."));
                this.B.addView(linearLayout17);
                this.f39801u.setTextColor(Utils.INSTANCE.checkBuildBeforesetColor(R.color.colorTextGrey, getContext()));
                M();
                return;
            case 15:
                this.A.setVisibility(0);
                this.f39806z.setImageResource(R.drawable.ic_feeling);
                this.f39803w.setText("Evaluate the outcomes");
                this.f39804x.setText("You now have to choose between changing your route to work or travelling by train. You realise that changing your route might mean taking a long cut to the office, increasing your travel time by 15 minutes. You realise that taking a train will enable you to reach work 20 minutes earlier than usual.");
                M();
                return;
            case 16:
                this.B.removeView(v.g.b(this.B, 1));
                if (z10) {
                    ((ProblemSolvingActivity) getActivity()).o0();
                    LinearLayout linearLayout18 = this.B;
                    linearLayout18.getChildAt(linearLayout18.getChildCount() - 1).setAlpha(0.2f);
                    linearLayout7 = (LinearLayout) this.I.inflate(R.layout.row_problem_solving_layout, (ViewGroup) null);
                    this.B.addView(linearLayout7);
                } else {
                    ((ProblemSolvingActivity) getActivity()).n0();
                    linearLayout7 = (LinearLayout) this.B.getChildAt(5);
                }
                this.A.setVisibility(8);
                RobertoTextView robertoTextView16 = (RobertoTextView) linearLayout7.findViewById(R.id.imageStep);
                RobertoTextView robertoTextView17 = (RobertoTextView) linearLayout7.findViewById(R.id.textStep);
                this.f39802v.setVisibility(4);
                robertoTextView16.setText("Step \n6");
                robertoTextView16.setBackgroundResource(R.drawable.circle_filled_purple);
                robertoTextView17.setText(Html.fromHtml("<strong><font color=\"#7961B5\">Make a plan</font></strong><br>"));
                robertoTextView16.setAlpha(1.0f);
                robertoTextView17.setAlpha(1.0f);
                ri.e.f(this, Utils.INSTANCE, R.color.colorTextGrey, this.f39801u);
                return;
            case 17:
                if (!z10 && this.B.getChildCount() == 7) {
                    this.B.removeView(v.g.b(this.B, 1));
                }
                this.A.setVisibility(8);
                LinearLayout linearLayout19 = (LinearLayout) this.I.inflate(R.layout.row_problem_solving_text, (ViewGroup) null);
                this.B.addView(linearLayout19);
                this.B.removeView(linearLayout19);
                RobertoTextView robertoTextView18 = (RobertoTextView) linearLayout19.findViewById(R.id.text);
                robertoTextView18.setVisibility(0);
                robertoTextView18.setText(Html.fromHtml("\"Once you've decided on a solution, think of all the steps you would have to take in order to effectively carry it out. Try and list out the when, how, and where aspects of it as well.\""));
                this.B.addView(linearLayout19);
                this.f39801u.setTextColor(Utils.INSTANCE.checkBuildBeforesetColor(R.color.colorTextGrey, getContext()));
                M();
                return;
            case 18:
                this.A.setVisibility(0);
                this.f39806z.setImageResource(R.drawable.ic_feeling);
                this.f39803w.setText("Make a plan");
                this.f39804x.setText("\"If you have decided to travel by train, start thinking about: \n- when you should reach the station\n- what train you should take to reach on time\n- the price of each ticket \n- the time it takes to reach office from the station\"");
                M();
                return;
            case 19:
                this.B.removeView(v.g.b(this.B, 1));
                if (z10) {
                    ((ProblemSolvingActivity) getActivity()).o0();
                    LinearLayout linearLayout20 = this.B;
                    linearLayout20.getChildAt(linearLayout20.getChildCount() - 1).setAlpha(0.2f);
                    linearLayout8 = (LinearLayout) this.I.inflate(R.layout.row_problem_solving_layout, (ViewGroup) null);
                    this.B.addView(linearLayout8);
                } else {
                    ((ProblemSolvingActivity) getActivity()).n0();
                    linearLayout8 = (LinearLayout) this.B.getChildAt(6);
                }
                this.A.setVisibility(8);
                RobertoTextView robertoTextView19 = (RobertoTextView) linearLayout8.findViewById(R.id.imageStep);
                RobertoTextView robertoTextView20 = (RobertoTextView) linearLayout8.findViewById(R.id.textStep);
                this.f39802v.setVisibility(4);
                robertoTextView19.setText("Step \n7");
                robertoTextView19.setBackgroundResource(R.drawable.button_border_gray);
                robertoTextView20.setText(Html.fromHtml("<strong><font color=\"#47A8AD\">Carry out your plan</font></strong><br>"));
                robertoTextView19.setAlpha(1.0f);
                robertoTextView20.setAlpha(1.0f);
                ri.e.f(this, Utils.INSTANCE, R.color.colorTextGrey, this.f39801u);
                return;
            case 20:
                if (!z10 && this.B.getChildCount() == 8) {
                    this.B.removeView(v.g.b(this.B, 1));
                }
                this.A.setVisibility(8);
                LinearLayout linearLayout21 = (LinearLayout) this.I.inflate(R.layout.row_problem_solving_text, (ViewGroup) null);
                this.B.addView(linearLayout21);
                this.B.removeView(linearLayout21);
                RobertoTextView robertoTextView21 = (RobertoTextView) linearLayout21.findViewById(R.id.text);
                robertoTextView21.setVisibility(0);
                robertoTextView21.setText(Html.fromHtml("It's now time to implement the plan you've constructed."));
                this.B.addView(linearLayout21);
                this.f39801u.setTextColor(Utils.INSTANCE.checkBuildBeforesetColor(R.color.colorTextGrey, getContext()));
                M();
                return;
            case 21:
                this.A.setVisibility(0);
                this.f39806z.setImageResource(R.drawable.ic_feeling);
                this.f39803w.setText("Carry out your plan");
                this.f39804x.setText("Once you answer all the questions and construct the plan, you can decide to try travelling by train for a week and evaluate this.");
                M();
                return;
            case 22:
                this.B.removeView(v.g.b(this.B, 1));
                if (z10) {
                    ((ProblemSolvingActivity) getActivity()).o0();
                    LinearLayout linearLayout22 = this.B;
                    linearLayout22.getChildAt(linearLayout22.getChildCount() - 1).setAlpha(0.2f);
                    linearLayout9 = (LinearLayout) this.I.inflate(R.layout.row_problem_solving_layout, (ViewGroup) null);
                    this.B.addView(linearLayout9);
                } else {
                    ((ProblemSolvingActivity) getActivity()).n0();
                    linearLayout9 = (LinearLayout) this.B.getChildAt(7);
                }
                this.A.setVisibility(8);
                RobertoTextView robertoTextView22 = (RobertoTextView) linearLayout9.findViewById(R.id.imageStep);
                RobertoTextView robertoTextView23 = (RobertoTextView) linearLayout9.findViewById(R.id.textStep);
                this.f39802v.setVisibility(4);
                robertoTextView22.setText("Step \n8");
                robertoTextView22.setBackgroundResource(R.drawable.circle_filled_purple);
                robertoTextView23.setText(Html.fromHtml("<strong><font color=\"#7961B5\">Reflect on the outcomes</font></strong><br>"));
                robertoTextView22.setAlpha(1.0f);
                robertoTextView23.setAlpha(1.0f);
                ri.e.f(this, Utils.INSTANCE, R.color.colorTextGrey, this.f39801u);
                return;
            case 23:
                if (!z10 && this.B.getChildCount() == 9) {
                    this.B.removeView(v.g.b(this.B, 1));
                }
                this.A.setVisibility(8);
                LinearLayout linearLayout23 = (LinearLayout) this.I.inflate(R.layout.row_problem_solving_text, (ViewGroup) null);
                this.B.addView(linearLayout23);
                this.B.removeView(linearLayout23);
                RobertoTextView robertoTextView24 = (RobertoTextView) linearLayout23.findViewById(R.id.text);
                robertoTextView24.setVisibility(0);
                robertoTextView24.setText(Html.fromHtml("Was the outcome desirable and effective? Maybe your plan needed a few changes or a new plan might help the situation better."));
                this.B.addView(linearLayout23);
                this.f39801u.setTextColor(Utils.INSTANCE.checkBuildBeforesetColor(R.color.colorTextGrey, getContext()));
                M();
                return;
            case 24:
                this.A.setVisibility(0);
                this.f39806z.setImageResource(R.drawable.ic_feeling);
                this.f39803w.setText("Reflect on the outcomes");
                this.f39804x.setText("At the end of the week, after you have had time to try out your plan, you may decide that you could take a later train and still reach on time.");
                M();
                return;
            default:
                ProblemSolvingActivity problemSolvingActivity = (ProblemSolvingActivity) getActivity();
                problemSolvingActivity.o0();
                problemSolvingActivity.f10462w++;
                problemSolvingActivity.p0(false, true);
                return;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_problem_solving_example, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f39802v = (RobertoTextView) view.findViewById(R.id.header);
        this.C = (RelativeLayout) view.findViewById(R.id.screen1);
        this.A = (LinearLayout) view.findViewById(R.id.screen2);
        this.B = (LinearLayout) view.findViewById(R.id.ll_row_problem_solving);
        this.f39806z = (AppCompatImageView) view.findViewById(R.id.overlayImage);
        this.f39803w = (RobertoTextView) view.findViewById(R.id.overlyHeader);
        this.f39804x = (RobertoTextView) view.findViewById(R.id.overlayDesc);
        this.f39801u = (RobertoTextView) view.findViewById(R.id.btnSubmit);
        this.f39805y = (RobertoTextView) view.findViewById(R.id.cardtext);
        this.G = (LinearLayout) view.findViewById(R.id.ll_cardview);
        this.H = (ScrollView) view.findViewById(R.id.scroll);
        this.J = FirebasePersistence.getInstance().getCourseById(defpackage.c.n());
        this.f39801u.setOnClickListener(new b());
        this.f39805y.setOnClickListener(new c());
        this.f39806z.setOnClickListener(new d());
        this.C.post(new e());
        this.I = (LayoutInflater) getActivity().getSystemService("layout_inflater");
        ((ImageView) view.findViewById(R.id.header_arrow_back)).setOnClickListener(new f());
        if (this.J.getCourseName().equals(Constants.COURSE_WORRY)) {
            P(true);
        } else if (this.J.getCourseName().equals(Constants.COURSE_ANGER)) {
            O(true);
        }
    }

    /* compiled from: ProblemSolvingExampleFragment.java */
    /* renamed from: zq.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0683a implements Animator.AnimatorListener {
        public C0683a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            a.this.G.setVisibility(8);
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
