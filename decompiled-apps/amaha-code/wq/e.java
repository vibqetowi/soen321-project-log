package wq;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.viewpager.widget.ViewPager;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.model.HappinessAndEnviromentModel;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import g0.a;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: HappinessAndEnvironmentDetailFragment.java */
/* loaded from: classes2.dex */
public class e extends rr.b {
    public static final /* synthetic */ int H = 0;
    public RobertoTextView A;
    public ImageView B;
    public RelativeLayout C;
    public RobertoButton D;
    public HappinessAndEnviromentModel E = null;
    public LinearLayout F;
    public ViewPager G;

    /* renamed from: u  reason: collision with root package name */
    public RelativeLayout f37061u;

    /* renamed from: v  reason: collision with root package name */
    public ImageView f37062v;

    /* renamed from: w  reason: collision with root package name */
    public RobertoTextView f37063w;

    /* renamed from: x  reason: collision with root package name */
    public ImageView f37064x;

    /* renamed from: y  reason: collision with root package name */
    public ImageView f37065y;

    /* renamed from: z  reason: collision with root package name */
    public ImageView f37066z;

    /* compiled from: HappinessAndEnvironmentDetailFragment.java */
    /* loaded from: classes2.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ((rr.a) e.this.getActivity()).t0();
        }
    }

    /* compiled from: HappinessAndEnvironmentDetailFragment.java */
    /* loaded from: classes2.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            e.this.getActivity().finish();
        }
    }

    /* compiled from: HappinessAndEnvironmentDetailFragment.java */
    /* loaded from: classes2.dex */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            wq.d dVar = new wq.d();
            e eVar = e.this;
            dVar.setArguments(eVar.getArguments());
            ((rr.a) eVar.getActivity()).r0(dVar);
        }
    }

    /* compiled from: HappinessAndEnvironmentDetailFragment.java */
    /* loaded from: classes2.dex */
    public class d extends k2.a {

        /* renamed from: c  reason: collision with root package name */
        public final Context f37070c;

        /* renamed from: d  reason: collision with root package name */
        public final ArrayList<String> f37071d;

        public d(Context context, ArrayList arrayList) {
            this.f37071d = new ArrayList<>();
            this.f37070c = context;
            this.f37071d = arrayList;
        }

        @Override // k2.a
        public final void e(ViewGroup viewGroup, int i6, Object obj) {
            viewGroup.removeView((View) obj);
        }

        @Override // k2.a
        public final int g() {
            return this.f37071d.size();
        }

        @Override // k2.a
        public final CharSequence h() {
            return "";
        }

        @Override // k2.a
        public final Object i(int i6, ViewGroup viewGroup) {
            Context context = this.f37070c;
            ViewGroup viewGroup2 = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.row_relaxation_activity_pager, viewGroup, false);
            RobertoTextView robertoTextView = (RobertoTextView) viewGroup2.findViewById(R.id.activityTips);
            robertoTextView.setTextColor(g0.a.b(context, R.color.learning_hub_grey_2));
            robertoTextView.setText(this.f37071d.get(i6));
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
        this.F.removeAllViews();
        for (int i11 = 0; i11 < i10; i11++) {
            View inflate = getActivity().getLayoutInflater().inflate(R.layout.navigation_dot, (ViewGroup) this.F, false);
            viewArr[i11] = inflate;
            Context context = getContext();
            Object obj = g0.a.f16164a;
            inflate.setBackground(a.c.b(context, R.drawable.circle_filled_grey));
            this.F.addView(viewArr[i11]);
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
        return layoutInflater.inflate(R.layout.fragment_happiness_environment_detail, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f37061u = (RelativeLayout) view.findViewById(R.id.ll_audio);
        this.F = (LinearLayout) view.findViewById(R.id.layoutDots);
        this.f37063w = (RobertoTextView) view.findViewById(R.id.title);
        this.A = (RobertoTextView) view.findViewById(R.id.tap);
        RobertoTextView robertoTextView = (RobertoTextView) view.findViewById(R.id.desc);
        this.f37062v = (ImageView) view.findViewById(R.id.play);
        this.f37064x = (ImageView) view.findViewById(R.id.act_img);
        this.f37065y = (ImageView) view.findViewById(R.id.act_img_bk_physical);
        this.f37066z = (ImageView) view.findViewById(R.id.act_img_bk_relax);
        this.C = (RelativeLayout) view.findViewById(R.id.ll_relaxation);
        RobertoButton robertoButton = (RobertoButton) view.findViewById(R.id.btnSubmitLogin);
        this.D = robertoButton;
        robertoButton.setText("Proceed");
        this.D.setOnClickListener(new a());
        String string = getArguments().getString("enviromental_model", null);
        Iterator<HappinessAndEnviromentModel> it = wq.b.J().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            HappinessAndEnviromentModel next = it.next();
            if (next.getId().equals(string)) {
                this.E = next;
                break;
            }
        }
        ImageView imageView = (ImageView) view.findViewById(R.id.header_arrow_back);
        this.B = imageView;
        UiUtils.Companion.increaseImageClickArea(imageView);
        this.B.setOnClickListener(new b());
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.frameLayout);
        this.A.setOnClickListener(new c());
        getArguments().getString("activity_id");
        this.f37063w.setText(this.E.getTitle());
        this.f37064x.setImageResource(this.E.getIcon());
        this.f37066z.setVisibility(8);
        this.f37065y.setVisibility(0);
        this.C.setVisibility(0);
        this.f37061u.setVisibility(0);
        this.f37062v.setVisibility(8);
        ArrayList arrayList = new ArrayList();
        if (string.equals("temperature-and-happiness")) {
            arrayList.add("Use fans, ACs or blankets in your room to find a comfortable temperature.");
            arrayList.add("Carry a jacket if you feel too cold or buy a table fan if you feel too hot at work.");
        } else if (string.equals("flowers-and-happiness")) {
            arrayList.add("Keep fresh flowers on your desk at home or at work.");
            arrayList.add("Get flowers for someone you know, in order to tell them you appreciate them.");
        } else if (string.equals("light-and-happiness")) {
            arrayList.add("Buy a fluorescent nightstand for your desk at work or home. A nightstand is the table on which you keep the lamp");
            arrayList.add("If possible, keep your windows open during the day to let the sunlight come in.");
        } else if (string.equals("color-and-happiness")) {
            arrayList.add("Wear bright colours on days you don’t particularly feel upbeat.");
            arrayList.add("Put a colourful picture on your desk or a painting up on the wall.");
        } else if (string.equals("greenery-and-happiness")) {
            arrayList.add("Take a walk in the park a couple of days in the week.");
            arrayList.add("Buy a plant and keep it at home or in an appropriate place at work.");
        } else if (string.equals("people-and-happiness")) {
            arrayList.add("Spend time and effort in building important friendships and relationships.");
            arrayList.add("Make an effort to spend time with those who are happy and cheerful.");
        }
        ViewPager viewPager = (ViewPager) view.findViewById(R.id.viewpager);
        this.G = viewPager;
        viewPager.setAdapter(new d(getContext(), arrayList));
        this.G.b(new C0623e(arrayList.size()));
        J(0, arrayList.size());
    }

    /* compiled from: HappinessAndEnvironmentDetailFragment.java */
    /* renamed from: wq.e$e  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0623e implements ViewPager.i {

        /* renamed from: a  reason: collision with root package name */
        public final int f37072a;

        public C0623e(int i6) {
            this.f37072a = 0;
            this.f37072a = i6;
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public final void c(int i6) {
            int i10 = e.H;
            e.this.J(i6, this.f37072a);
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public final void b(int i6) {
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public final void a(float f, int i6) {
        }
    }
}
