package dq;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.viewpager.widget.ViewPager;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.model.Course;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import g0.a;
/* compiled from: MasteryPleasurableActivitiesFragment.java */
/* loaded from: classes2.dex */
public class g extends rr.b {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ int f13215w = 0;

    /* renamed from: u  reason: collision with root package name */
    public ViewPager f13216u;

    /* renamed from: v  reason: collision with root package name */
    public LinearLayout f13217v;

    /* compiled from: MasteryPleasurableActivitiesFragment.java */
    /* loaded from: classes2.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            g.this.getActivity().finish();
        }
    }

    /* compiled from: MasteryPleasurableActivitiesFragment.java */
    /* loaded from: classes2.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ((rr.a) g.this.getActivity()).t0();
        }
    }

    /* compiled from: MasteryPleasurableActivitiesFragment.java */
    /* loaded from: classes2.dex */
    public class c extends k2.a {

        /* renamed from: c  reason: collision with root package name */
        public final Context f13220c;

        public c(Context context) {
            this.f13220c = context;
        }

        @Override // k2.a
        public final void e(ViewGroup viewGroup, int i6, Object obj) {
            viewGroup.removeView((View) obj);
        }

        @Override // k2.a
        public final int g() {
            return 2;
        }

        @Override // k2.a
        public final CharSequence h() {
            return "";
        }

        @Override // k2.a
        public final Object i(int i6, ViewGroup viewGroup) {
            ViewGroup viewGroup2;
            LayoutInflater from = LayoutInflater.from(this.f13220c);
            if (i6 == 0) {
                viewGroup2 = (ViewGroup) from.inflate(R.layout.row_mastery_intro, viewGroup, false);
            } else {
                viewGroup2 = (ViewGroup) from.inflate(R.layout.row_pleasurable_intro, viewGroup, false);
            }
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
        this.f13217v.removeAllViews();
        for (int i11 = 0; i11 < i10; i11++) {
            View inflate = getActivity().getLayoutInflater().inflate(R.layout.navigation_dot, (ViewGroup) this.f13217v, false);
            viewArr[i11] = inflate;
            Context context = getContext();
            Object obj = g0.a.f16164a;
            inflate.setBackground(a.c.b(context, R.drawable.circle_filled_grey));
            this.f13217v.addView(viewArr[i11]);
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
        return layoutInflater.inflate(R.layout.fragment_mastery_pleasurable, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ((ImageView) view.findViewById(R.id.header_arrow_back)).setOnClickListener(new a());
        UiUtils.Companion.increaseImageClickArea((ImageView) view.findViewById(R.id.header_arrow_back));
        ((RobertoButton) view.findViewById(R.id.tap)).setOnClickListener(new b());
        Course courseById = FirebasePersistence.getInstance().getCourseById(FirebasePersistence.getInstance().getUser().getCurrentCourse());
        if (courseById.getCourseName().equals(Constants.COURSE_DEPRESSION)) {
            ((RobertoTextView) view.findViewById(R.id.act_sch)).setText("There are two types of activites or tasks you can engage in to start feeling better - pleasurable tasks and mastery tasks.");
        } else if (courseById.getCourseName().equals(Constants.COURSE_HAPPINESS)) {
            ((RobertoTextView) view.findViewById(R.id.act_sch)).setText("There are two types of activites you can engage in to start feeling happier - pleasurable tasks and mastery tasks.");
        }
        ((RobertoTextView) view.findViewById(R.id.header)).setText("Types of Happiness Tasks");
        this.f13217v = (LinearLayout) view.findViewById(R.id.layoutDots);
        ViewPager viewPager = (ViewPager) view.findViewById(R.id.viewpager);
        this.f13216u = viewPager;
        viewPager.setAdapter(new c(getContext()));
        this.f13216u.b(new d());
        J(0, 2);
    }

    /* compiled from: MasteryPleasurableActivitiesFragment.java */
    /* loaded from: classes2.dex */
    public class d implements ViewPager.i {

        /* renamed from: a  reason: collision with root package name */
        public final int f13221a;

        public d() {
            this.f13221a = 0;
            this.f13221a = 2;
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public final void c(int i6) {
            int i10 = g.f13215w;
            g.this.J(i6, this.f13221a);
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public final void b(int i6) {
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public final void a(float f, int i6) {
        }
    }
}
