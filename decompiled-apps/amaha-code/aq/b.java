package aq;

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
import com.theinnerhour.b2b.activity.SleepDosDontsActivity;
import com.theinnerhour.b2b.model.DosDonts;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import g0.a;
import java.util.ArrayList;
/* compiled from: SleepDoDontListFragment.java */
/* loaded from: classes2.dex */
public class b extends rr.b {
    public static final /* synthetic */ int B = 0;

    /* renamed from: v  reason: collision with root package name */
    public LinearLayout f3419v;

    /* renamed from: w  reason: collision with root package name */
    public ViewPager f3420w;

    /* renamed from: x  reason: collision with root package name */
    public RecyclerView f3421x;

    /* renamed from: y  reason: collision with root package name */
    public ImageView f3422y;

    /* renamed from: z  reason: collision with root package name */
    public RobertoTextView f3423z;

    /* renamed from: u  reason: collision with root package name */
    public final ArrayList<DosDonts> f3418u = new ArrayList<>();
    public final String A = "Things to do to sleep";

    /* compiled from: SleepDoDontListFragment.java */
    /* loaded from: classes2.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            b.this.getActivity().finish();
        }
    }

    /* compiled from: SleepDoDontListFragment.java */
    /* renamed from: aq.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class View$OnClickListenerC0050b implements View.OnClickListener {
        public View$OnClickListenerC0050b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ((SleepDosDontsActivity) b.this.getActivity()).n0();
        }
    }

    /* compiled from: SleepDoDontListFragment.java */
    /* loaded from: classes2.dex */
    public class c extends k2.a {

        /* renamed from: c  reason: collision with root package name */
        public final Context f3426c;

        /* renamed from: d  reason: collision with root package name */
        public final ArrayList<DosDonts> f3427d;

        public c(p pVar, ArrayList arrayList) {
            this.f3427d = new ArrayList<>();
            this.f3426c = pVar;
            this.f3427d = arrayList;
        }

        @Override // k2.a
        public final void e(ViewGroup viewGroup, int i6, Object obj) {
            viewGroup.removeView((View) obj);
        }

        @Override // k2.a
        public final int g() {
            return this.f3427d.size();
        }

        @Override // k2.a
        public final CharSequence h() {
            return "";
        }

        @Override // k2.a
        public final Object i(int i6, ViewGroup viewGroup) {
            ViewGroup viewGroup2 = (ViewGroup) LayoutInflater.from(this.f3426c).inflate(R.layout.fragment_stress_impact, viewGroup, false);
            ImageView imageView = (ImageView) viewGroup2.findViewById(R.id.img);
            imageView.setColorFilter(b.this.getResources().getColor(R.color.v1_green));
            ArrayList<DosDonts> arrayList = this.f3427d;
            imageView.setImageDrawable(arrayList.get(i6).getDrawbale());
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
        this.f3419v.removeAllViews();
        for (int i11 = 0; i11 < i10; i11++) {
            View inflate = getActivity().getLayoutInflater().inflate(R.layout.navigation_dot, (ViewGroup) this.f3419v, false);
            viewArr[i11] = inflate;
            Context context = getContext();
            Object obj = g0.a.f16164a;
            inflate.setBackground(a.c.b(context, R.drawable.circle_filled_grey));
            this.f3419v.addView(viewArr[i11]);
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
        return layoutInflater.inflate(R.layout.fragment_sleep_do_dont_list, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f3423z = (RobertoTextView) view.findViewById(R.id.tvTitle);
        this.f3421x = (RecyclerView) view.findViewById(R.id.rcDosDonts);
        this.f3420w = (ViewPager) view.findViewById(R.id.viewpager);
        this.f3419v = (LinearLayout) view.findViewById(R.id.layoutDots);
        this.f3421x.setHasFixedSize(false);
        this.f3421x.setLayoutManager(new LinearLayoutManager(getActivity()));
        this.f3421x.setItemAnimator(new androidx.recyclerview.widget.c());
        ImageView imageView = (ImageView) view.findViewById(R.id.header_arrow_back);
        this.f3422y = imageView;
        UiUtils.Companion.increaseImageClickArea(imageView);
        this.f3422y.setOnClickListener(new a());
        ((RobertoButton) view.findViewById(R.id.tap)).setOnClickListener(new View$OnClickListenerC0050b());
        this.f3423z.setText(this.A);
        ArrayList<DosDonts> arrayList = this.f3418u;
        arrayList.clear();
        DosDonts dosDonts = new DosDonts("Sleep", "When you use your bed only to sleep, your brain learns that it should feel sleepy the minute you lie down.", getActivity().getResources().getDrawable(R.drawable.ic_bed));
        DosDonts dosDonts2 = new DosDonts("Think happy thoughts ", "This makes you feel more relaxed and helps you to fall asleep.", getActivity().getResources().getDrawable(R.drawable.ic_smile));
        DosDonts dosDonts3 = new DosDonts("Pray/Meditate ", "Studies have shown that meditating daily leads to better sleep.", getActivity().getResources().getDrawable(R.drawable.ic_yoga));
        arrayList.add(dosDonts);
        arrayList.add(dosDonts2);
        arrayList.add(dosDonts3);
        this.f3420w.setAdapter(new c(getActivity(), arrayList));
        this.f3420w.b(new d(arrayList.size()));
        J(0, arrayList.size());
    }

    /* compiled from: SleepDoDontListFragment.java */
    /* loaded from: classes2.dex */
    public class d implements ViewPager.i {

        /* renamed from: a  reason: collision with root package name */
        public final int f3429a;

        public d(int i6) {
            this.f3429a = 0;
            this.f3429a = i6;
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public final void c(int i6) {
            int i10 = b.B;
            b.this.J(i6, this.f3429a);
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public final void b(int i6) {
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public final void a(float f, int i6) {
        }
    }
}
