package dr;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.fragment.app.p;
import androidx.viewpager.widget.ViewPager;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.BenefitsOfSleepActivity;
import com.theinnerhour.b2b.model.SleepCauseSummaryModel;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import g0.a;
import java.util.ArrayList;
/* compiled from: SleepBadlyFragment.java */
/* loaded from: classes2.dex */
public class a extends rr.b {

    /* renamed from: x  reason: collision with root package name */
    public static final /* synthetic */ int f13231x = 0;

    /* renamed from: u  reason: collision with root package name */
    public ArrayList<SleepCauseSummaryModel> f13232u;

    /* renamed from: v  reason: collision with root package name */
    public LinearLayout f13233v;

    /* renamed from: w  reason: collision with root package name */
    public ViewPager f13234w;

    /* compiled from: SleepBadlyFragment.java */
    /* renamed from: dr.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class View$OnClickListenerC0194a implements View.OnClickListener {
        public View$OnClickListenerC0194a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            a.this.getActivity().finish();
        }
    }

    /* compiled from: SleepBadlyFragment.java */
    /* loaded from: classes2.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ((BenefitsOfSleepActivity) a.this.getActivity()).n0();
        }
    }

    /* compiled from: SleepBadlyFragment.java */
    /* loaded from: classes2.dex */
    public class c extends k2.a {

        /* renamed from: c  reason: collision with root package name */
        public final Context f13237c;

        /* renamed from: d  reason: collision with root package name */
        public final ArrayList<SleepCauseSummaryModel> f13238d;

        public c(p pVar, ArrayList arrayList) {
            this.f13238d = new ArrayList<>();
            this.f13237c = pVar;
            this.f13238d = arrayList;
        }

        @Override // k2.a
        public final void e(ViewGroup viewGroup, int i6, Object obj) {
            viewGroup.removeView((View) obj);
        }

        @Override // k2.a
        public final int g() {
            return this.f13238d.size();
        }

        @Override // k2.a
        public final CharSequence h() {
            return "";
        }

        @Override // k2.a
        public final Object i(int i6, ViewGroup viewGroup) {
            ViewGroup viewGroup2 = (ViewGroup) LayoutInflater.from(this.f13237c).inflate(R.layout.fragment_stress_impact, viewGroup, false);
            ((ImageView) viewGroup2.findViewById(R.id.img)).setVisibility(8);
            ArrayList<SleepCauseSummaryModel> arrayList = this.f13238d;
            ((RobertoTextView) viewGroup2.findViewById(R.id.title)).setText(arrayList.get(i6).getPopupTitleText());
            ((RobertoTextView) viewGroup2.findViewById(R.id.desc)).setText(arrayList.get(i6).getPopupInfoText());
            viewGroup.addView(viewGroup2);
            return viewGroup2;
        }

        @Override // k2.a
        public final boolean j(View view, Object obj) {
            if (view == obj) {
                return true;
            }
            return false;
        }
    }

    public final void J(int i6, int i10) {
        View[] viewArr = new View[i10];
        this.f13233v.removeAllViews();
        for (int i11 = 0; i11 < i10; i11++) {
            View inflate = getActivity().getLayoutInflater().inflate(R.layout.navigation_dot, (ViewGroup) this.f13233v, false);
            viewArr[i11] = inflate;
            Context context = getContext();
            Object obj = g0.a.f16164a;
            inflate.setBackground(a.c.b(context, R.drawable.circle_filled_grey));
            this.f13233v.addView(viewArr[i11]);
        }
        if (i10 > 0) {
            View view = viewArr[i6];
            Context context2 = getContext();
            Object obj2 = g0.a.f16164a;
            view.setBackground(a.c.b(context2, R.drawable.circle_filled_taupe_grey));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_sleep_benefits, viewGroup, false);
        RelativeLayout relativeLayout = (RelativeLayout) inflate.findViewById(R.id.sleepCauseLinear);
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f13234w = (ViewPager) view.findViewById(R.id.viewpager);
        this.f13233v = (LinearLayout) view.findViewById(R.id.layoutDots);
        ((RobertoTextView) view.findViewById(R.id.tvTitle)).setText("What do you\nthink happens\nif you sleep badly?");
        ((ImageView) view.findViewById(R.id.header_arrow_back)).setOnClickListener(new View$OnClickListenerC0194a());
        UiUtils.Companion.increaseImageClickArea((ImageView) view.findViewById(R.id.header_arrow_back));
        ((RobertoButton) view.findViewById(R.id.tap)).setOnClickListener(new b());
        this.f13232u = new ArrayList<>();
        this.f13232u.add(new SleepCauseSummaryModel("Thinking", "When you don’t sleep well, you may find it difficult to pay attention, remember things or think clearly. This affects your decision-making or problem-solving abilities. ", "Thinking", 0));
        this.f13232u.add(new SleepCauseSummaryModel("Mood", "When sleep deprived, you might find yourself getting irritated or angry more easily. You are also likely to become more anxious and have emotional difficulties.", "Mood", 0));
        this.f13232u.add(new SleepCauseSummaryModel("Body", "Lack of sleep can cause changes in hormones which can lead to high blood pressure, breathing difficulties and other diseases. You might even start falling sick more often.", "Body", 0));
        this.f13232u.add(new SleepCauseSummaryModel("Behaviour", "Owing to poor sleep, you might avoid others, start drinking alcohol and smoke more often. You might also become more likely to have accidents.", "Behaviour", 0));
        this.f13234w.setAdapter(new c(getActivity(), this.f13232u));
        this.f13234w.b(new d(this.f13232u.size()));
        J(0, this.f13232u.size());
    }

    /* compiled from: SleepBadlyFragment.java */
    /* loaded from: classes2.dex */
    public class d implements ViewPager.i {

        /* renamed from: a  reason: collision with root package name */
        public final int f13239a;

        public d(int i6) {
            this.f13239a = 0;
            this.f13239a = i6;
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public final void c(int i6) {
            int i10 = a.f13231x;
            a.this.J(i6, this.f13239a);
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public final void b(int i6) {
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public final void a(float f, int i6) {
        }
    }
}
