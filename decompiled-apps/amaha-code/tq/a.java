package tq;

import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoTextView;
/* compiled from: DesigningHappinessFragment.java */
/* loaded from: classes2.dex */
public class a extends rr.b {
    public RobertoTextView A;
    public AppCompatImageView B;
    public AppCompatImageView C;
    public AppCompatImageView D;
    public LinearLayout E;
    public RelativeLayout F;
    public int G = 1;
    public int H;

    /* renamed from: u  reason: collision with root package name */
    public RobertoTextView f33417u;

    /* renamed from: v  reason: collision with root package name */
    public RobertoTextView f33418v;

    /* renamed from: w  reason: collision with root package name */
    public RobertoTextView f33419w;

    /* renamed from: x  reason: collision with root package name */
    public RobertoTextView f33420x;

    /* renamed from: y  reason: collision with root package name */
    public RobertoTextView f33421y;

    /* renamed from: z  reason: collision with root package name */
    public RobertoTextView f33422z;

    /* compiled from: DesigningHappinessFragment.java */
    /* renamed from: tq.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class View$OnClickListenerC0556a implements View.OnClickListener {
        public View$OnClickListenerC0556a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            a aVar = a.this;
            aVar.G++;
            aVar.J();
        }
    }

    /* compiled from: DesigningHappinessFragment.java */
    /* loaded from: classes2.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            a aVar = a.this;
            aVar.G++;
            aVar.J();
        }
    }

    /* compiled from: DesigningHappinessFragment.java */
    /* loaded from: classes2.dex */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            a aVar = a.this;
            Display defaultDisplay = ((WindowManager) aVar.getActivity().getSystemService("window")).getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            defaultDisplay.getMetrics(displayMetrics);
            aVar.getClass();
            aVar.H = displayMetrics.heightPixels;
            aVar.J();
        }
    }

    /* compiled from: DesigningHappinessFragment.java */
    /* loaded from: classes2.dex */
    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            a.this.getActivity().finish();
        }
    }

    @Override // rr.b
    public final boolean I() {
        int i6 = this.G - 1;
        this.G = i6;
        if (i6 <= 0) {
            return true;
        }
        J();
        return false;
    }

    public final void J() {
        switch (this.G) {
            case 1:
                this.E.setVisibility(8);
                K(R.color.purpleNavy);
                this.f33418v.setText("Your End Goal");
                this.B.setVisibility(0);
                this.B.setImageResource(R.drawable.ic_in_situation);
                this.f33419w.setVisibility(0);
                this.f33419w.setText("You want to lose weight to be happy. To do this, you want to develop the habit of being on a diet.");
                this.B.setAlpha(1.0f);
                this.f33419w.setAlpha(1.0f);
                AppCompatImageView appCompatImageView = this.B;
                O(appCompatImageView, this.H / appCompatImageView.getHeight());
                O(this.f33419w, this.H / this.B.getHeight());
                this.f33417u.setTextColor(Utils.INSTANCE.checkBuildBeforesetColor(R.color.colorTextGrey, getContext()));
                this.f33417u.setText("How can you achieve this?");
                this.C.setVisibility(4);
                this.f33420x.setVisibility(4);
                return;
            case 2:
                this.E.setVisibility(0);
                M(R.color.colorPrimary);
                LinearLayout linearLayout = this.E;
                Utils utils = Utils.INSTANCE;
                linearLayout.setBackgroundColor(utils.checkBuildBeforesetColor(R.color.colorPrimary, getContext()));
                this.D.setImageResource(R.drawable.ic_p_overlay);
                this.f33421y.setText("Set up Primes");
                this.f33422z.setText("Take steps to set up signals in your environment that will remind you to engage in a behaviour.");
                this.f33417u.setTextColor(utils.checkBuildBeforesetColor(R.color.white, getContext()));
                this.f33417u.setText("How can you use this?");
                return;
            case 3:
                this.E.setVisibility(8);
                K(R.color.colorPrimary);
                this.f33418v.setText("Set up Primes");
                this.B.setAlpha(0.2f);
                this.f33419w.setAlpha(0.2f);
                this.C.setVisibility(0);
                this.C.setImageResource(R.drawable.ic_p_main);
                this.f33420x.setVisibility(0);
                this.f33420x.setText("You start using smaller plates as your prime, which will prompt you to take a smaller serving and restrict your intake.");
                this.C.setAlpha(1.0f);
                this.f33420x.setAlpha(1.0f);
                AppCompatImageView appCompatImageView2 = this.C;
                O(appCompatImageView2, (-this.H) / appCompatImageView2.getHeight());
                RobertoTextView robertoTextView = this.f33420x;
                O(robertoTextView, (-this.H) / robertoTextView.getHeight());
                this.f33417u.setTextColor(Utils.INSTANCE.checkBuildBeforesetColor(R.color.colorTextGrey, getContext()));
                this.f33417u.setText("Tap To Continue");
                return;
            case 4:
                this.E.setVisibility(0);
                M(R.color.seaSerpent);
                LinearLayout linearLayout2 = this.E;
                Utils utils2 = Utils.INSTANCE;
                linearLayout2.setBackgroundColor(utils2.checkBuildBeforesetColor(R.color.seaSerpent, getContext()));
                this.D.setImageResource(R.drawable.ic_o_overlay);
                this.f33421y.setText("Keep Pre-selected Options");
                this.f33422z.setText("Surround yourself with preset options that are in line with what you want to achieve, so that it is easier for you to engage in a habit.");
                this.f33417u.setTextColor(utils2.checkBuildBeforesetColor(R.color.white, getContext()));
                this.f33417u.setText("How can you use this?");
                return;
            case 5:
                this.E.setVisibility(8);
                K(R.color.seaSerpent);
                this.f33418v.setText("Keep Pre-selected Options");
                this.B.setAlpha(0.2f);
                this.f33419w.setAlpha(0.2f);
                this.C.setVisibility(0);
                this.C.setImageResource(R.drawable.ic_o_main);
                this.f33420x.setVisibility(0);
                this.f33420x.setText("You stock your fridge with fruits and vegetables, so when you're hungry, you will end up eating healthy food.");
                this.C.setAlpha(1.0f);
                this.f33420x.setAlpha(1.0f);
                AppCompatImageView appCompatImageView3 = this.C;
                O(appCompatImageView3, (-this.H) / appCompatImageView3.getHeight());
                RobertoTextView robertoTextView2 = this.f33420x;
                O(robertoTextView2, (-this.H) / robertoTextView2.getHeight());
                this.f33417u.setTextColor(Utils.INSTANCE.checkBuildBeforesetColor(R.color.colorTextGrey, getContext()));
                this.f33417u.setText("Tap To Continue");
                return;
            case 6:
                this.E.setVisibility(0);
                M(R.color.thoughts_green);
                LinearLayout linearLayout3 = this.E;
                Utils utils3 = Utils.INSTANCE;
                linearLayout3.setBackgroundColor(utils3.checkBuildBeforesetColor(R.color.thoughts_green, getContext()));
                this.D.setImageResource(R.drawable.ic_c_overlay);
                this.f33421y.setText("Commit Yourself");
                this.f33422z.setText("Make a promise to someone that you will engage in the behaviour you want to. Try committing to small changes that will be easier for you to make.");
                this.f33417u.setTextColor(utils3.checkBuildBeforesetColor(R.color.white, getContext()));
                this.f33417u.setText("How can you use this?");
                return;
            case 7:
                this.E.setVisibility(8);
                K(R.color.thoughts_green);
                this.f33418v.setText("Commit Yourself");
                this.B.setAlpha(0.2f);
                this.f33419w.setAlpha(0.2f);
                this.C.setVisibility(0);
                this.C.setImageResource(R.drawable.ic_c_main);
                this.f33420x.setVisibility(0);
                this.f33420x.setText("You tell your friends and family that you are going on a diet.");
                this.C.setAlpha(1.0f);
                this.f33420x.setAlpha(1.0f);
                AppCompatImageView appCompatImageView4 = this.C;
                O(appCompatImageView4, (-this.H) / appCompatImageView4.getHeight());
                RobertoTextView robertoTextView3 = this.f33420x;
                O(robertoTextView3, (-this.H) / robertoTextView3.getHeight());
                this.f33417u.setTextColor(Utils.INSTANCE.checkBuildBeforesetColor(R.color.colorTextGrey, getContext()));
                this.f33417u.setText("Tap To Continue");
                return;
            case 8:
                this.E.setVisibility(0);
                M(R.color.bpBlue);
                LinearLayout linearLayout4 = this.E;
                Utils utils4 = Utils.INSTANCE;
                linearLayout4.setBackgroundColor(utils4.checkBuildBeforesetColor(R.color.bpBlue, getContext()));
                this.D.setImageResource(R.drawable.ic_s_overlay);
                this.f33421y.setText("Use Social Support");
                this.f33422z.setText("Be around people who have similar goals, or want to follow similar habits as you. ");
                this.f33417u.setTextColor(utils4.checkBuildBeforesetColor(R.color.white, getContext()));
                this.f33417u.setText("How can you use this?");
                return;
            case 9:
                this.E.setVisibility(8);
                K(R.color.bpBlue);
                this.f33418v.setText("Use Social Support");
                this.B.setAlpha(0.2f);
                this.f33419w.setAlpha(0.2f);
                this.C.setVisibility(0);
                this.C.setImageResource(R.drawable.ic_s_main);
                this.f33420x.setVisibility(0);
                this.f33420x.setText("You start spending some more time with your friends who are also on a diet or are exercising to lose weight.");
                this.C.setAlpha(1.0f);
                this.f33420x.setAlpha(1.0f);
                AppCompatImageView appCompatImageView5 = this.C;
                O(appCompatImageView5, (-this.H) / appCompatImageView5.getHeight());
                RobertoTextView robertoTextView4 = this.f33420x;
                O(robertoTextView4, (-this.H) / robertoTextView4.getHeight());
                this.f33417u.setTextColor(Utils.INSTANCE.checkBuildBeforesetColor(R.color.colorTextGrey, getContext()));
                this.f33417u.setText("Tap To Continue");
                return;
            case 10:
                this.E.setVisibility(0);
                M(R.color.thoughts_green);
                LinearLayout linearLayout5 = this.E;
                Utils utils5 = Utils.INSTANCE;
                linearLayout5.setBackgroundColor(utils5.checkBuildBeforesetColor(R.color.thoughts_green, getContext()));
                this.D.setImageResource(R.drawable.ic_r_overlay);
                this.f33421y.setText("Reward Yourself");
                this.f33422z.setText("Promise to reward yourself with something that you like if you achieve your goal or develop the habit you want to.");
                this.f33417u.setTextColor(utils5.checkBuildBeforesetColor(R.color.white, getContext()));
                this.f33417u.setText("How can you use this?");
                return;
            case 11:
                this.E.setVisibility(8);
                K(R.color.thoughts_green);
                this.f33418v.setText("Reward Yourself");
                this.B.setAlpha(0.2f);
                this.f33419w.setAlpha(0.2f);
                this.C.setVisibility(0);
                this.C.setImageResource(R.drawable.ic_r_main);
                this.f33420x.setVisibility(0);
                this.f33420x.setText("You tell yourself that you will buy something nice for yourself if you follow your diet for a week.");
                this.C.setAlpha(1.0f);
                this.f33420x.setAlpha(1.0f);
                AppCompatImageView appCompatImageView6 = this.C;
                O(appCompatImageView6, (-this.H) / appCompatImageView6.getHeight());
                RobertoTextView robertoTextView5 = this.f33420x;
                O(robertoTextView5, (-this.H) / robertoTextView5.getHeight());
                this.f33417u.setTextColor(Utils.INSTANCE.checkBuildBeforesetColor(R.color.colorTextGrey, getContext()));
                this.f33417u.setText("Tap To Continue");
                return;
            default:
                ((rr.a) getActivity()).t0();
                return;
        }
    }

    public final void K(int i6) {
        this.f33418v.setTextColor(Utils.INSTANCE.checkBuildBeforesetColor(i6, requireActivity()));
    }

    public final void M(int i6) {
        Window window = requireActivity().getWindow();
        window.addFlags(LinearLayoutManager.INVALID_OFFSET);
        window.setStatusBarColor(Utils.INSTANCE.checkBuildBeforesetColor(i6, requireActivity()));
    }

    public final void O(View view, float f) {
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, f, 1, 0.0f);
        translateAnimation.setDuration(800L);
        view.startAnimation(translateAnimation);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_designing_hapiness, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f33418v = (RobertoTextView) view.findViewById(R.id.header);
        this.F = (RelativeLayout) view.findViewById(R.id.screen1);
        this.E = (LinearLayout) view.findViewById(R.id.screen2);
        this.f33419w = (RobertoTextView) view.findViewById(R.id.textStep1);
        this.f33420x = (RobertoTextView) view.findViewById(R.id.textStep2);
        this.B = (AppCompatImageView) view.findViewById(R.id.imageStep1);
        this.C = (AppCompatImageView) view.findViewById(R.id.imageStep2);
        this.D = (AppCompatImageView) view.findViewById(R.id.overlayImage);
        this.f33421y = (RobertoTextView) view.findViewById(R.id.overlyHeader);
        this.f33422z = (RobertoTextView) view.findViewById(R.id.overlayDesc);
        this.f33417u = (RobertoTextView) view.findViewById(R.id.btnSubmit);
        this.A = (RobertoTextView) view.findViewById(R.id.cardtext);
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.ll_cardview);
        this.f33417u.setOnClickListener(new View$OnClickListenerC0556a());
        this.A.setOnClickListener(new b());
        this.F.post(new c());
        ((ImageView) view.findViewById(R.id.header_arrow_back)).setOnClickListener(new d());
        UiUtils.Companion.increaseImageClickArea((ImageView) view.findViewById(R.id.header_arrow_back));
    }
}
