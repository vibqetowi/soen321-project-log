package xq;

import android.os.Bundle;
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
import androidx.appcompat.widget.AppCompatImageView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoTextView;
/* compiled from: LocusOfControlDescFragment.java */
/* loaded from: classes2.dex */
public class a extends rr.b {
    public AppCompatImageView A;
    public LinearLayout B;
    public RelativeLayout C;
    public int D = 1;
    public int E;

    /* renamed from: u  reason: collision with root package name */
    public RobertoTextView f37890u;

    /* renamed from: v  reason: collision with root package name */
    public RobertoTextView f37891v;

    /* renamed from: w  reason: collision with root package name */
    public RobertoTextView f37892w;

    /* renamed from: x  reason: collision with root package name */
    public RobertoTextView f37893x;

    /* renamed from: y  reason: collision with root package name */
    public RobertoTextView f37894y;

    /* renamed from: z  reason: collision with root package name */
    public AppCompatImageView f37895z;

    /* compiled from: LocusOfControlDescFragment.java */
    /* renamed from: xq.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class View$OnClickListenerC0639a implements View.OnClickListener {
        public View$OnClickListenerC0639a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            a aVar = a.this;
            aVar.D++;
            aVar.J();
        }
    }

    /* compiled from: LocusOfControlDescFragment.java */
    /* loaded from: classes2.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            a aVar = a.this;
            aVar.D++;
            aVar.J();
        }
    }

    /* compiled from: LocusOfControlDescFragment.java */
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
            aVar.E = displayMetrics.heightPixels;
            aVar.J();
        }
    }

    /* compiled from: LocusOfControlDescFragment.java */
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
        int i6 = this.D - 1;
        this.D = i6;
        if (i6 <= 0) {
            return true;
        }
        J();
        return false;
    }

    public final void J() {
        int i6 = this.D;
        if (i6 != 1) {
            if (i6 != 2) {
                if (i6 != 3) {
                    if (i6 != 4) {
                        ((rr.a) getActivity()).t0();
                        return;
                    }
                    this.B.setVisibility(8);
                    K(R.color.seaSerpent);
                    this.f37891v.setText("Being Optimistic");
                    this.f37895z.setAlpha(0.2f);
                    this.f37892w.setAlpha(0.2f);
                    this.A.setVisibility(0);
                    this.A.setImageResource(R.drawable.ic_o_main);
                    this.f37893x.setVisibility(0);
                    this.f37893x.setText("Try and think of other areas in your life where you have experienced positive events. \nFor example, \"I have also been helpful to many people at work.\"");
                    this.A.setAlpha(1.0f);
                    this.f37893x.setAlpha(1.0f);
                    AppCompatImageView appCompatImageView = this.A;
                    M(appCompatImageView, (-this.E) / appCompatImageView.getHeight());
                    RobertoTextView robertoTextView = this.f37893x;
                    M(robertoTextView, (-this.E) / robertoTextView.getHeight());
                    this.f37890u.setTextColor(Utils.INSTANCE.checkBuildBeforesetColor(R.color.colorTextGrey, getContext()));
                    return;
                }
                this.B.setVisibility(8);
                K(R.color.seaSerpent);
                this.f37891v.setText("Being Optimistic");
                this.f37895z.setAlpha(0.2f);
                this.f37892w.setAlpha(0.2f);
                this.A.setVisibility(0);
                this.A.setImageResource(R.drawable.ic_o_main);
                this.f37893x.setVisibility(0);
                this.f37893x.setText("Try and look at the event as likely to occur again. \nFor example, \"I may get a raise in some months if I continue to work hard and do even better.\"");
                this.A.setAlpha(1.0f);
                this.f37893x.setAlpha(1.0f);
                AppCompatImageView appCompatImageView2 = this.A;
                M(appCompatImageView2, (-this.E) / appCompatImageView2.getHeight());
                RobertoTextView robertoTextView2 = this.f37893x;
                M(robertoTextView2, (-this.E) / robertoTextView2.getHeight());
                this.f37890u.setTextColor(Utils.INSTANCE.checkBuildBeforesetColor(R.color.colorTextGrey, getContext()));
                return;
            }
            this.B.setVisibility(8);
            K(R.color.seaSerpent);
            this.f37891v.setText("Being Optimistic");
            this.f37895z.setAlpha(0.2f);
            this.f37892w.setAlpha(0.2f);
            this.A.setVisibility(0);
            this.A.setImageResource(R.drawable.ic_o_main);
            this.f37893x.setVisibility(0);
            this.f37893x.setText("Try and think of factors related to you that could have led to this event.\nFor example, \"I have been working really hard and performing well at work.\"");
            this.A.setAlpha(1.0f);
            this.f37893x.setAlpha(1.0f);
            AppCompatImageView appCompatImageView3 = this.A;
            M(appCompatImageView3, (-this.E) / appCompatImageView3.getHeight());
            RobertoTextView robertoTextView3 = this.f37893x;
            M(robertoTextView3, (-this.E) / robertoTextView3.getHeight());
            this.f37890u.setTextColor(Utils.INSTANCE.checkBuildBeforesetColor(R.color.colorTextGrey, getContext()));
            return;
        }
        this.B.setVisibility(8);
        K(R.color.purpleNavy);
        this.f37891v.setText("Situation");
        this.f37895z.setVisibility(0);
        this.f37895z.setImageResource(R.drawable.ic_in_situation);
        this.f37892w.setVisibility(0);
        this.f37892w.setText("You get a raise at work.");
        this.f37895z.setAlpha(1.0f);
        this.f37892w.setAlpha(1.0f);
        AppCompatImageView appCompatImageView4 = this.f37895z;
        M(appCompatImageView4, this.E / appCompatImageView4.getHeight());
        M(this.f37892w, this.E / this.f37895z.getHeight());
        this.f37890u.setTextColor(Utils.INSTANCE.checkBuildBeforesetColor(R.color.colorTextGrey, getContext()));
        this.A.setVisibility(4);
        this.f37893x.setVisibility(4);
    }

    public final void K(int i6) {
        this.f37891v.setTextColor(Utils.INSTANCE.checkBuildBeforesetColor(i6, getActivity()));
    }

    public final void M(View view, float f) {
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
        this.f37891v = (RobertoTextView) view.findViewById(R.id.header);
        this.C = (RelativeLayout) view.findViewById(R.id.screen1);
        this.B = (LinearLayout) view.findViewById(R.id.screen2);
        this.f37892w = (RobertoTextView) view.findViewById(R.id.textStep1);
        this.f37893x = (RobertoTextView) view.findViewById(R.id.textStep2);
        this.f37895z = (AppCompatImageView) view.findViewById(R.id.imageStep1);
        this.A = (AppCompatImageView) view.findViewById(R.id.imageStep2);
        AppCompatImageView appCompatImageView = (AppCompatImageView) view.findViewById(R.id.overlayImage);
        RobertoTextView robertoTextView = (RobertoTextView) view.findViewById(R.id.overlyHeader);
        RobertoTextView robertoTextView2 = (RobertoTextView) view.findViewById(R.id.overlayDesc);
        this.f37890u = (RobertoTextView) view.findViewById(R.id.btnSubmit);
        this.f37894y = (RobertoTextView) view.findViewById(R.id.cardtext);
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.ll_cardview);
        this.f37890u.setOnClickListener(new View$OnClickListenerC0639a());
        this.f37894y.setOnClickListener(new b());
        this.C.post(new c());
        ((ImageView) view.findViewById(R.id.header_arrow_back)).setOnClickListener(new d());
        UiUtils.Companion.increaseImageClickArea((ImageView) view.findViewById(R.id.header_arrow_back));
    }
}
