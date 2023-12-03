package xq;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.fragment.app.p;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.model.DosDonts;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import g0.a;
import java.util.ArrayList;
/* compiled from: LocusOfControlPagerFragment.java */
/* loaded from: classes2.dex */
public class c extends rr.b {
    public static final /* synthetic */ int A = 0;

    /* renamed from: u  reason: collision with root package name */
    public LinearLayout f37907u;

    /* renamed from: v  reason: collision with root package name */
    public ViewPager f37908v;

    /* renamed from: w  reason: collision with root package name */
    public final ArrayList<DosDonts> f37909w = new ArrayList<>();

    /* renamed from: x  reason: collision with root package name */
    public RecyclerView f37910x;

    /* renamed from: y  reason: collision with root package name */
    public RobertoTextView f37911y;

    /* renamed from: z  reason: collision with root package name */
    public ImageView f37912z;

    /* compiled from: LocusOfControlPagerFragment.java */
    /* loaded from: classes2.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            c.this.getActivity().finish();
        }
    }

    /* compiled from: LocusOfControlPagerFragment.java */
    /* loaded from: classes2.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ((rr.a) c.this.getActivity()).t0();
        }
    }

    /* compiled from: LocusOfControlPagerFragment.java */
    /* renamed from: xq.c$c  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0641c extends k2.a {

        /* renamed from: c  reason: collision with root package name */
        public final Context f37915c;

        /* renamed from: d  reason: collision with root package name */
        public final ArrayList<DosDonts> f37916d;

        public C0641c(p pVar, ArrayList arrayList) {
            this.f37916d = new ArrayList<>();
            this.f37915c = pVar;
            this.f37916d = arrayList;
        }

        @Override // k2.a
        public final void e(ViewGroup viewGroup, int i6, Object obj) {
            viewGroup.removeView((View) obj);
        }

        @Override // k2.a
        public final int g() {
            return this.f37916d.size();
        }

        @Override // k2.a
        public final CharSequence h() {
            return "";
        }

        @Override // k2.a
        public final Object i(int i6, ViewGroup viewGroup) {
            ViewGroup viewGroup2 = (ViewGroup) LayoutInflater.from(this.f37915c).inflate(R.layout.fragment_stress_impact, viewGroup, false);
            ImageView imageView = (ImageView) viewGroup2.findViewById(R.id.img);
            ArrayList<DosDonts> arrayList = this.f37916d;
            imageView.setImageDrawable(arrayList.get(i6).getDrawbale());
            imageView.setColorFilter(c.this.getResources().getColor(R.color.tracker_orange));
            ((RobertoTextView) viewGroup2.findViewById(R.id.title)).setText(arrayList.get(i6).getTitle());
            ((RobertoTextView) viewGroup2.findViewById(R.id.desc)).setText(arrayList.get(i6).getDescription());
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
        this.f37907u.removeAllViews();
        for (int i11 = 0; i11 < i10; i11++) {
            View inflate = getActivity().getLayoutInflater().inflate(R.layout.navigation_dot, (ViewGroup) this.f37907u, false);
            viewArr[i11] = inflate;
            Context context = getContext();
            Object obj = g0.a.f16164a;
            inflate.setBackground(a.c.b(context, R.drawable.circle_filled_grey));
            this.f37907u.addView(viewArr[i11]);
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
        return layoutInflater.inflate(R.layout.fragment_sleep_dont_list, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f37911y = (RobertoTextView) view.findViewById(R.id.tvTitle);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.rcDosDonts);
        this.f37910x = recyclerView;
        recyclerView.setHasFixedSize(false);
        this.f37910x.setLayoutManager(new LinearLayoutManager(getActivity()));
        this.f37910x.setItemAnimator(new androidx.recyclerview.widget.c());
        this.f37908v = (ViewPager) view.findViewById(R.id.viewpager);
        this.f37907u = (LinearLayout) view.findViewById(R.id.layoutDots);
        ImageView imageView = (ImageView) view.findViewById(R.id.header_arrow_back);
        this.f37912z = imageView;
        UiUtils.Companion.increaseImageClickArea(imageView);
        this.f37912z.setOnClickListener(new a());
        ((RobertoButton) view.findViewById(R.id.tap)).setOnClickListener(new b());
        this.f37911y.setText("Realistically assess if the event is:");
        ArrayList<DosDonts> arrayList = this.f37909w;
        arrayList.clear();
        DosDonts dosDonts = new DosDonts("Caused by External Factors", "Think of all factors unrelated to you that could have possibly resulted in the event, instead of focussing only on factors related to you.", getActivity().getResources().getDrawable(R.drawable.ic_external_factors));
        DosDonts dosDonts2 = new DosDonts("Not Likely to Occur Again", "Instead of viewing the negative event as something that will keep happening, consider the possibility of it being an unfortunate occurrence that won't happen again.", getActivity().getResources().getDrawable(R.drawable.ic_global));
        DosDonts dosDonts3 = new DosDonts("Limited to One Area of Your Life", "Check if the negative event is restricted to one specific area of your life, and assess if it is possible that it won't apply to other spheres.", getActivity().getResources().getDrawable(R.drawable.ic_specific));
        arrayList.add(dosDonts);
        arrayList.add(dosDonts2);
        arrayList.add(dosDonts3);
        this.f37908v.setAdapter(new C0641c(getActivity(), arrayList));
        this.f37908v.b(new d(arrayList.size()));
        J(0, arrayList.size());
    }

    /* compiled from: LocusOfControlPagerFragment.java */
    /* loaded from: classes2.dex */
    public class d implements ViewPager.i {

        /* renamed from: a  reason: collision with root package name */
        public final int f37918a;

        public d(int i6) {
            this.f37918a = 0;
            this.f37918a = i6;
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public final void c(int i6) {
            int i10 = c.A;
            c.this.J(i6, this.f37918a);
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public final void b(int i6) {
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public final void a(float f, int i6) {
        }
    }
}
