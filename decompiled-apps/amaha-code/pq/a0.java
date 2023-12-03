package pq;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager.widget.ViewPager;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.InsetsUtils;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.CustomViewPager;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: DepressionMasteryViewPagerFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lpq/a0;", "Lrr/b;", "<init>", "()V", "a", Constants.ONBOARDING_VARIANT, "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class a0 extends rr.b {

    /* renamed from: x  reason: collision with root package name */
    public static final /* synthetic */ int f28752x = 0;

    /* renamed from: w  reason: collision with root package name */
    public final LinkedHashMap f28755w = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f28753u = LogHelper.INSTANCE.makeLogTag(a0.class);

    /* renamed from: v  reason: collision with root package name */
    public int f28754v = 1;

    /* compiled from: DepressionMasteryViewPagerFragment.kt */
    /* loaded from: classes2.dex */
    public final class a extends k2.a {

        /* renamed from: c  reason: collision with root package name */
        public final Context f28756c;

        /* renamed from: d  reason: collision with root package name */
        public final ArrayList<String> f28757d;

        /* renamed from: e  reason: collision with root package name */
        public final ArrayList<String> f28758e;
        public final ArrayList<Integer> f;

        public a(Context context, ArrayList<String> arrayList, ArrayList<String> arrayList2, ArrayList<Integer> arrayList3) {
            this.f28756c = context;
            this.f28757d = new ArrayList<>();
            this.f28758e = new ArrayList<>();
            this.f = new ArrayList<>();
            this.f28757d = arrayList;
            this.f28758e = arrayList2;
            this.f = arrayList3;
        }

        @Override // k2.a
        public final void e(ViewGroup container, int i6, Object object) {
            kotlin.jvm.internal.i.g(container, "container");
            kotlin.jvm.internal.i.g(object, "object");
            try {
                View view = a0.this.getView();
                kotlin.jvm.internal.i.e(view, "null cannot be cast to non-null type android.view.View");
                container.removeView(view);
            } catch (Exception unused) {
            }
        }

        @Override // k2.a
        public final int g() {
            return this.f28757d.size();
        }

        @Override // k2.a
        public final CharSequence h() {
            return "";
        }

        @Override // k2.a
        public final Object i(int i6, ViewGroup container) {
            kotlin.jvm.internal.i.g(container, "container");
            View inflate = LayoutInflater.from(this.f28756c).inflate(R.layout.row_screen_a29, container, false);
            kotlin.jvm.internal.i.e(inflate, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
            ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
            ((RobertoTextView) constraintLayout.findViewById(R.id.a29ViewPagerTitleText)).setText(this.f28757d.get(i6));
            ((RobertoTextView) constraintLayout.findViewById(R.id.a29ViewPagerSubtitleText)).setText(this.f28758e.get(i6));
            Integer num = this.f.get(i6);
            kotlin.jvm.internal.i.f(num, "images[position]");
            ((AppCompatImageView) constraintLayout.findViewById(R.id.a29ViewPagerImage)).setImageResource(num.intValue());
            container.addView(constraintLayout);
            return constraintLayout;
        }

        @Override // k2.a
        public final boolean j(View view, Object object) {
            kotlin.jvm.internal.i.g(view, "view");
            kotlin.jvm.internal.i.g(object, "object");
            if (view == object) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: DepressionMasteryViewPagerFragment.kt */
    /* loaded from: classes2.dex */
    public static final class c implements Animator.AnimatorListener {
        public c() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator p02) {
            kotlin.jvm.internal.i.g(p02, "p0");
            a0 a0Var = a0.this;
            ((RobertoButton) a0Var._$_findCachedViewById(R.id.a29ViewPagerButton)).setOnClickListener(new z(a0Var, 1));
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator p02) {
            kotlin.jvm.internal.i.g(p02, "p0");
            a0 a0Var = a0.this;
            ((RobertoButton) a0Var._$_findCachedViewById(R.id.a29ViewPagerButton)).setOnClickListener(new z(a0Var, 2));
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator p02) {
            kotlin.jvm.internal.i.g(p02, "p0");
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator p02) {
            kotlin.jvm.internal.i.g(p02, "p0");
        }
    }

    public final void J(int i6, int i10) {
        try {
            if (i6 != 0) {
                if (i6 != 1) {
                    if (i6 == 2) {
                        ((ImageView) _$_findCachedViewById(R.id.a29dot1)).setColorFilter(g0.a.b(requireActivity(), R.color.sea));
                        ((ImageView) _$_findCachedViewById(R.id.a29dot2)).setColorFilter(g0.a.b(requireActivity(), R.color.sea));
                        ((ImageView) _$_findCachedViewById(R.id.a29dot2)).setAlpha(1.0f);
                        ((ImageView) _$_findCachedViewById(R.id.a29dot3)).setColorFilter(g0.a.b(requireActivity(), R.color.sea));
                        ((ImageView) _$_findCachedViewById(R.id.a29dot3)).setAlpha(1.0f);
                        ((RobertoTextView) _$_findCachedViewById(R.id.a29TextCTA)).setVisibility(8);
                        ((RobertoButton) _$_findCachedViewById(R.id.a29ViewPagerButton)).setVisibility(0);
                        ((RobertoButton) _$_findCachedViewById(R.id.a29ViewPagerButton)).setAlpha(0.0f);
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat((RobertoButton) _$_findCachedViewById(R.id.a29ViewPagerButton), "alpha", 0.0f, 1.0f);
                        ofFloat.setDuration(600L);
                        ofFloat.setStartDelay(500L);
                        ofFloat.addListener(new c());
                        ofFloat.start();
                    }
                }
                ((ImageView) _$_findCachedViewById(R.id.a29dot1)).setColorFilter(g0.a.b(requireActivity(), R.color.sea));
                ((ImageView) _$_findCachedViewById(R.id.a29dot2)).setColorFilter(g0.a.b(requireActivity(), R.color.sea));
                ((ImageView) _$_findCachedViewById(R.id.a29dot2)).setAlpha(1.0f);
                ((ImageView) _$_findCachedViewById(R.id.a29dot3)).setColorFilter(g0.a.b(requireActivity(), R.color.title_high_contrast));
                ((ImageView) _$_findCachedViewById(R.id.a29dot3)).setAlpha(0.1f);
                ((RobertoButton) _$_findCachedViewById(R.id.a29ViewPagerButton)).setVisibility(8);
                ((RobertoTextView) _$_findCachedViewById(R.id.a29TextCTA)).setVisibility(0);
            } else {
                ((ImageView) _$_findCachedViewById(R.id.a29dot1)).setColorFilter(g0.a.b(requireActivity(), R.color.sea));
                ((ImageView) _$_findCachedViewById(R.id.a29dot2)).setColorFilter(g0.a.b(requireActivity(), R.color.title_high_contrast));
                ((ImageView) _$_findCachedViewById(R.id.a29dot2)).setAlpha(0.1f);
                ((ImageView) _$_findCachedViewById(R.id.a29dot3)).setColorFilter(g0.a.b(requireActivity(), R.color.title_high_contrast));
                ((ImageView) _$_findCachedViewById(R.id.a29dot3)).setAlpha(0.1f);
                ((RobertoButton) _$_findCachedViewById(R.id.a29ViewPagerButton)).setVisibility(8);
                ((RobertoTextView) _$_findCachedViewById(R.id.a29TextCTA)).setVisibility(0);
            }
        } catch (Exception unused) {
        }
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f28755w;
        View view = (View) linkedHashMap.get(Integer.valueOf(i6));
        if (view == null) {
            View view2 = getView();
            if (view2 != null && (findViewById = view2.findViewById(i6)) != null) {
                linkedHashMap.put(Integer.valueOf(i6), findViewById);
                return findViewById;
            }
            return null;
        }
        return view;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.g(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_screen_a29, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f28755w.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        InsetsUtils insetsUtils = InsetsUtils.INSTANCE;
        CustomViewPager a29ViewPager = (CustomViewPager) _$_findCachedViewById(R.id.a29ViewPager);
        kotlin.jvm.internal.i.f(a29ViewPager, "a29ViewPager");
        insetsUtils.addStatusBarHeight(a29ViewPager);
        try {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            arrayList.add(getString(R.string.depressionMasteryVPHeader1));
            arrayList.add(getString(R.string.depressionMasteryVPHeader2));
            arrayList.add(getString(R.string.depressionMasteryVPHeader3));
            arrayList2.add(getString(R.string.depressionMasteryVPText1));
            arrayList2.add(getString(R.string.depressionMasteryVPText2));
            arrayList2.add(getString(R.string.depressionMasteryVPText3));
            arrayList3.add(Integer.valueOf((int) R.drawable.ic_a29_mastery_rock));
            arrayList3.add(Integer.valueOf((int) R.drawable.ic_a29_mastery_pebble));
            arrayList3.add(Integer.valueOf((int) R.drawable.ic_a29_mastery_sand));
            J(0, arrayList.size());
            ((RobertoTextView) _$_findCachedViewById(R.id.a29TextCTA)).setVisibility(0);
            Context context = getContext();
            kotlin.jvm.internal.i.d(context);
            ((CustomViewPager) _$_findCachedViewById(R.id.a29ViewPager)).setAdapter(new a(context, arrayList, arrayList2, arrayList3));
            ((CustomViewPager) _$_findCachedViewById(R.id.a29ViewPager)).setPagingEnabled(false);
            ((ConstraintLayout) _$_findCachedViewById(R.id.a29parent)).setOnClickListener(new z(this, 0));
            ((CustomViewPager) _$_findCachedViewById(R.id.a29ViewPager)).b(new b(arrayList.size()));
            rr.c cVar = new rr.c(requireContext(), new LinearInterpolator());
            Field declaredField = ViewPager.class.getDeclaredField("D");
            declaredField.setAccessible(true);
            declaredField.set((CustomViewPager) _$_findCachedViewById(R.id.a29ViewPager), cVar);
            ((RobertoButton) _$_findCachedViewById(R.id.a29ViewPagerButton)).setText(getString(R.string.depressionMasteryVPCTA));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f28753u, e10);
        }
    }

    /* compiled from: DepressionMasteryViewPagerFragment.kt */
    /* loaded from: classes2.dex */
    public final class b implements ViewPager.i {

        /* renamed from: a  reason: collision with root package name */
        public final int f28760a;

        public b(int i6) {
            this.f28760a = i6;
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public final void c(int i6) {
            int i10 = a0.f28752x;
            a0.this.J(i6, this.f28760a);
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public final void b(int i6) {
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public final void a(float f, int i6) {
        }
    }
}
