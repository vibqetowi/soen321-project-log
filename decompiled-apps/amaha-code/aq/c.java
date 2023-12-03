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
/* compiled from: SleepDontListFragment.java */
/* loaded from: classes2.dex */
public class c extends rr.b {
    public static final /* synthetic */ int B = 0;

    /* renamed from: u  reason: collision with root package name */
    public LinearLayout f3431u;

    /* renamed from: v  reason: collision with root package name */
    public ViewPager f3432v;

    /* renamed from: x  reason: collision with root package name */
    public RecyclerView f3434x;

    /* renamed from: y  reason: collision with root package name */
    public RobertoTextView f3435y;

    /* renamed from: z  reason: collision with root package name */
    public ImageView f3436z;

    /* renamed from: w  reason: collision with root package name */
    public final ArrayList<DosDonts> f3433w = new ArrayList<>();
    public final String A = "Things not to do to sleep";

    /* compiled from: SleepDontListFragment.java */
    /* loaded from: classes2.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            c.this.getActivity().finish();
        }
    }

    /* compiled from: SleepDontListFragment.java */
    /* loaded from: classes2.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ((SleepDosDontsActivity) c.this.getActivity()).n0();
        }
    }

    /* compiled from: SleepDontListFragment.java */
    /* renamed from: aq.c$c  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0051c extends k2.a {

        /* renamed from: c  reason: collision with root package name */
        public final Context f3439c;

        /* renamed from: d  reason: collision with root package name */
        public final ArrayList<DosDonts> f3440d;

        public C0051c(p pVar, ArrayList arrayList) {
            this.f3440d = new ArrayList<>();
            this.f3439c = pVar;
            this.f3440d = arrayList;
        }

        @Override // k2.a
        public final void e(ViewGroup viewGroup, int i6, Object obj) {
            viewGroup.removeView((View) obj);
        }

        @Override // k2.a
        public final int g() {
            return this.f3440d.size();
        }

        @Override // k2.a
        public final CharSequence h() {
            return "";
        }

        @Override // k2.a
        public final Object i(int i6, ViewGroup viewGroup) {
            ViewGroup viewGroup2 = (ViewGroup) LayoutInflater.from(this.f3439c).inflate(R.layout.fragment_stress_impact, viewGroup, false);
            ImageView imageView = (ImageView) viewGroup2.findViewById(R.id.img);
            ArrayList<DosDonts> arrayList = this.f3440d;
            imageView.setImageDrawable(arrayList.get(i6).getDrawbale());
            imageView.setColorFilter(c.this.getResources().getColor(R.color.v1_red));
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
        this.f3431u.removeAllViews();
        for (int i11 = 0; i11 < i10; i11++) {
            View inflate = getActivity().getLayoutInflater().inflate(R.layout.navigation_dot, (ViewGroup) this.f3431u, false);
            viewArr[i11] = inflate;
            Context context = getContext();
            Object obj = g0.a.f16164a;
            inflate.setBackground(a.c.b(context, R.drawable.circle_filled_grey));
            this.f3431u.addView(viewArr[i11]);
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
        this.f3435y = (RobertoTextView) view.findViewById(R.id.tvTitle);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.rcDosDonts);
        this.f3434x = recyclerView;
        recyclerView.setHasFixedSize(false);
        this.f3434x.setLayoutManager(new LinearLayoutManager(getActivity()));
        this.f3434x.setItemAnimator(new androidx.recyclerview.widget.c());
        this.f3432v = (ViewPager) view.findViewById(R.id.viewpager);
        this.f3431u = (LinearLayout) view.findViewById(R.id.layoutDots);
        ImageView imageView = (ImageView) view.findViewById(R.id.header_arrow_back);
        this.f3436z = imageView;
        UiUtils.Companion.increaseImageClickArea(imageView);
        this.f3436z.setOnClickListener(new a());
        ((RobertoButton) view.findViewById(R.id.tap)).setOnClickListener(new b());
        this.f3435y.setText(this.A);
        ArrayList<DosDonts> arrayList = this.f3433w;
        arrayList.clear();
        DosDonts dosDonts = new DosDonts("Watch TV", "Light from any screen will make you feel more awake. Moreover, if the content of what you are watching might make you excited, you might find it difficult to sleep thereafter.", getActivity().getResources().getDrawable(R.drawable.ic_television));
        DosDonts dosDonts2 = new DosDonts("Read an exciting book", "While reading a calming book can help you fall asleep, an exciting book (for example, a suspense thriler) will make you feel more awake.", getActivity().getResources().getDrawable(R.drawable.ic_book));
        DosDonts dosDonts3 = new DosDonts("Eat", "Eating in bed teaches your brain that your bed is for doing other things besides sleeping. As a result, you are likely to feel more awake in bed.", getActivity().getResources().getDrawable(R.drawable.ic_plate));
        DosDonts dosDonts4 = new DosDonts("Lie awake ", "Lying in bed makes you even more anxious about falling sleep and makes it harder to sleep.", getActivity().getResources().getDrawable(R.drawable.ic_person_chair));
        DosDonts dosDonts5 = new DosDonts("Scroll through social media", "Both the light from your screen as well as the information you're reading on social media can make you feel more awake.", getActivity().getResources().getDrawable(R.drawable.ic_ppl_tumb));
        DosDonts dosDonts6 = new DosDonts("Finish work", "As work requires you to be alert and focussed, you could take a while to feel relaxed and ready to sleep once you are done.", getActivity().getResources().getDrawable(R.drawable.ic_bk_clock));
        DosDonts dosDonts7 = new DosDonts("Use your phone or laptop", "Both the light from your screen and the information you're engaging with on your device can make you feel more awake.", getActivity().getResources().getDrawable(R.drawable.ic_mob));
        arrayList.add(dosDonts);
        arrayList.add(dosDonts2);
        arrayList.add(dosDonts3);
        arrayList.add(dosDonts4);
        arrayList.add(dosDonts5);
        arrayList.add(dosDonts6);
        arrayList.add(dosDonts7);
        this.f3432v.setAdapter(new C0051c(getActivity(), arrayList));
        this.f3432v.b(new d(arrayList.size()));
        J(0, arrayList.size());
    }

    /* compiled from: SleepDontListFragment.java */
    /* loaded from: classes2.dex */
    public class d implements ViewPager.i {

        /* renamed from: a  reason: collision with root package name */
        public final int f3442a;

        public d(int i6) {
            this.f3442a = 0;
            this.f3442a = i6;
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public final void c(int i6) {
            int i10 = c.B;
            c.this.J(i6, this.f3442a);
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public final void b(int i6) {
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public final void a(float f, int i6) {
        }
    }
}
