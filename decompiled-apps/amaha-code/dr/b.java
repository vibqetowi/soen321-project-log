package dr;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
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
/* compiled from: SleepBenefitsFragment.java */
/* loaded from: classes2.dex */
public class b extends rr.b {

    /* renamed from: x  reason: collision with root package name */
    public static final /* synthetic */ int f13241x = 0;

    /* renamed from: u  reason: collision with root package name */
    public ArrayList<SleepCauseSummaryModel> f13242u;

    /* renamed from: v  reason: collision with root package name */
    public LinearLayout f13243v;

    /* renamed from: w  reason: collision with root package name */
    public ViewPager f13244w;

    /* compiled from: SleepBenefitsFragment.java */
    /* loaded from: classes2.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            b.this.getActivity().finish();
        }
    }

    /* compiled from: SleepBenefitsFragment.java */
    /* renamed from: dr.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class View$OnClickListenerC0195b implements View.OnClickListener {
        public View$OnClickListenerC0195b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ((BenefitsOfSleepActivity) b.this.getActivity()).n0();
        }
    }

    /* compiled from: SleepBenefitsFragment.java */
    /* loaded from: classes2.dex */
    public class c extends k2.a {

        /* renamed from: c  reason: collision with root package name */
        public final Context f13247c;

        /* renamed from: d  reason: collision with root package name */
        public final ArrayList<SleepCauseSummaryModel> f13248d;

        public c(p pVar, ArrayList arrayList) {
            this.f13248d = new ArrayList<>();
            this.f13247c = pVar;
            this.f13248d = arrayList;
        }

        @Override // k2.a
        public final void e(ViewGroup viewGroup, int i6, Object obj) {
            viewGroup.removeView((View) obj);
        }

        @Override // k2.a
        public final int g() {
            return this.f13248d.size();
        }

        @Override // k2.a
        public final CharSequence h() {
            return "";
        }

        @Override // k2.a
        public final Object i(int i6, ViewGroup viewGroup) {
            ViewGroup viewGroup2 = (ViewGroup) LayoutInflater.from(this.f13247c).inflate(R.layout.fragment_stress_impact, viewGroup, false);
            ((ImageView) viewGroup2.findViewById(R.id.img)).setVisibility(8);
            ArrayList<SleepCauseSummaryModel> arrayList = this.f13248d;
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
        this.f13243v.removeAllViews();
        for (int i11 = 0; i11 < i10; i11++) {
            View inflate = getActivity().getLayoutInflater().inflate(R.layout.navigation_dot, (ViewGroup) this.f13243v, false);
            viewArr[i11] = inflate;
            Context context = getContext();
            Object obj = g0.a.f16164a;
            inflate.setBackground(a.c.b(context, R.drawable.circle_filled_grey));
            this.f13243v.addView(viewArr[i11]);
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
        return layoutInflater.inflate(R.layout.fragment_sleep_benefits, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f13244w = (ViewPager) view.findViewById(R.id.viewpager);
        this.f13243v = (LinearLayout) view.findViewById(R.id.layoutDots);
        ((RobertoTextView) view.findViewById(R.id.tvTitle)).setText("Benefits of\nSleep");
        ((ImageView) view.findViewById(R.id.header_arrow_back)).setOnClickListener(new a());
        UiUtils.Companion.increaseImageClickArea((ImageView) view.findViewById(R.id.header_arrow_back));
        ((RobertoButton) view.findViewById(R.id.tap)).setOnClickListener(new View$OnClickListenerC0195b());
        this.f13242u = new ArrayList<>();
        this.f13242u.add(new SleepCauseSummaryModel("Immunity", "If you sleep well every night, your immunity improves and your body can respond better to new infections. As a result, you don't fall sick as often.", "Immunity", 0));
        this.f13242u.add(new SleepCauseSummaryModel("Memory", "When you are asleep, your brain creates new pathways to help you understand, learn and retain new information and skills.", "Memory", 0));
        this.f13242u.add(new SleepCauseSummaryModel("Creativity", "Good sleep improves your attention and creativity, and makes you better at solving problems.", "Creativity", 0));
        this.f13242u.add(new SleepCauseSummaryModel("Productivity", "When you have slept well at night, you can function better during the day- both physically and emotionally- which in turn makes you more productive.", "Productivity", 0));
        this.f13244w.setAdapter(new c(getActivity(), this.f13242u));
        this.f13244w.b(new d(this.f13242u.size()));
        J(0, this.f13242u.size());
    }

    /* compiled from: SleepBenefitsFragment.java */
    /* loaded from: classes2.dex */
    public class d implements ViewPager.i {

        /* renamed from: a  reason: collision with root package name */
        public final int f13249a;

        public d(int i6) {
            this.f13249a = 0;
            this.f13249a = i6;
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public final void c(int i6) {
            int i10 = b.f13241x;
            b.this.J(i6, this.f13249a);
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public final void b(int i6) {
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public final void a(float f, int i6) {
        }
    }
}
