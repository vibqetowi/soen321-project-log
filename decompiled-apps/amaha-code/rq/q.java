package rq;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
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
import kotlin.jvm.internal.v;
/* compiled from: DepressionThoughtsViewPagerFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lrq/q;", "Lrr/b;", "<init>", "()V", "a", Constants.ONBOARDING_VARIANT, "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class q extends rr.b {

    /* renamed from: x  reason: collision with root package name */
    public static final /* synthetic */ int f30978x = 0;

    /* renamed from: u  reason: collision with root package name */
    public int f30979u;

    /* renamed from: w  reason: collision with root package name */
    public final LinkedHashMap f30981w = new LinkedHashMap();

    /* renamed from: v  reason: collision with root package name */
    public final String f30980v = LogHelper.INSTANCE.makeLogTag(q.class);

    /* compiled from: DepressionThoughtsViewPagerFragment.kt */
    /* loaded from: classes2.dex */
    public final class a extends k2.a {

        /* renamed from: c  reason: collision with root package name */
        public final Context f30982c;

        /* renamed from: d  reason: collision with root package name */
        public final ArrayList<String> f30983d;

        /* renamed from: e  reason: collision with root package name */
        public final ArrayList<String> f30984e;

        public a(Context context, ArrayList<String> arrayList, ArrayList<String> arrayList2) {
            this.f30982c = context;
            this.f30983d = new ArrayList<>();
            this.f30984e = new ArrayList<>();
            this.f30983d = arrayList;
            this.f30984e = arrayList2;
        }

        @Override // k2.a
        public final void e(ViewGroup container, int i6, Object object) {
            kotlin.jvm.internal.i.g(container, "container");
            kotlin.jvm.internal.i.g(object, "object");
            try {
                View view = q.this.getView();
                kotlin.jvm.internal.i.e(view, "null cannot be cast to non-null type android.view.View");
                container.removeView(view);
            } catch (Exception unused) {
            }
        }

        @Override // k2.a
        public final int g() {
            return this.f30983d.size();
        }

        @Override // k2.a
        public final CharSequence h() {
            return "";
        }

        @Override // k2.a
        public final Object i(int i6, ViewGroup container) {
            kotlin.jvm.internal.i.g(container, "container");
            View inflate = LayoutInflater.from(this.f30982c).inflate(R.layout.row_screen_a25, container, false);
            kotlin.jvm.internal.i.e(inflate, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
            ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
            ((RobertoTextView) constraintLayout.findViewById(R.id.rowA23Title)).setText(this.f30983d.get(i6));
            ((RobertoTextView) constraintLayout.findViewById(R.id.rowA23Subtitle)).setText(this.f30984e.get(i6));
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

    public final void J(int i6, int i10) {
        try {
            if (i6 != 0) {
                if (i6 == 1) {
                    ((ImageView) _$_findCachedViewById(R.id.a25dot1)).setColorFilter(g0.a.b(requireActivity(), R.color.sea));
                    ((ImageView) _$_findCachedViewById(R.id.a25dot2)).setColorFilter(g0.a.b(requireActivity(), R.color.sea));
                    ((ImageView) _$_findCachedViewById(R.id.a25dot2)).setAlpha(1.0f);
                    ((RobertoButton) _$_findCachedViewById(R.id.a25ViewPagerButton)).setVisibility(0);
                    ((RobertoTextView) _$_findCachedViewById(R.id.a25TextCTA)).setVisibility(8);
                }
            } else {
                ((ImageView) _$_findCachedViewById(R.id.a25dot1)).setColorFilter(g0.a.b(requireActivity(), R.color.sea));
                ((ImageView) _$_findCachedViewById(R.id.a25dot2)).setColorFilter(g0.a.b(requireActivity(), R.color.title_high_contrast));
                ((ImageView) _$_findCachedViewById(R.id.a25dot2)).setAlpha(0.1f);
                ((RobertoButton) _$_findCachedViewById(R.id.a25ViewPagerButton)).setVisibility(8);
                ((RobertoTextView) _$_findCachedViewById(R.id.a25TextCTA)).setVisibility(0);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f30980v, e10);
        }
    }

    public final void K(String str, String str2, String str3, String str4) {
        ((RobertoTextView) _$_findCachedViewById(R.id.a25TextCTA)).setText(getString(R.string.depressionThoughtsWaitTap));
        v vVar = new v();
        vVar.f23467u = 1;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList.add(str);
        arrayList.add(str3);
        arrayList2.add(str2);
        arrayList2.add(str4);
        ((CustomViewPager) _$_findCachedViewById(R.id.a25ViewPager)).setPagingEnabled(false);
        J(0, arrayList.size());
        Context context = getContext();
        kotlin.jvm.internal.i.d(context);
        ((CustomViewPager) _$_findCachedViewById(R.id.a25ViewPager)).setAdapter(new a(context, arrayList, arrayList2));
        ((RobertoButton) _$_findCachedViewById(R.id.a25ViewPagerButton)).setVisibility(8);
        ((CustomViewPager) _$_findCachedViewById(R.id.a25ViewPager)).b(new b(arrayList.size()));
        ((ConstraintLayout) _$_findCachedViewById(R.id.a25parent)).setOnClickListener(new ho.o(this, 29, vVar));
        rr.c cVar = new rr.c(requireContext(), new LinearInterpolator());
        Field declaredField = ViewPager.class.getDeclaredField("D");
        declaredField.setAccessible(true);
        declaredField.set((CustomViewPager) _$_findCachedViewById(R.id.a25ViewPager), cVar);
        ((RobertoButton) _$_findCachedViewById(R.id.a25ViewPagerButton)).setText(getString(R.string.depressionThoughtsViewPagerCTAText));
        ((RobertoButton) _$_findCachedViewById(R.id.a25ViewPagerButton)).setOnClickListener(new qq.n(this, 15));
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f30981w;
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
        return inflater.inflate(R.layout.fragment_screen_a25, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f30981w.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            this.f30979u = requireArguments().getInt("ViewPager");
            InsetsUtils insetsUtils = InsetsUtils.INSTANCE;
            CustomViewPager a25ViewPager = (CustomViewPager) _$_findCachedViewById(R.id.a25ViewPager);
            kotlin.jvm.internal.i.f(a25ViewPager, "a25ViewPager");
            insetsUtils.addStatusBarHeight(a25ViewPager);
            int i6 = this.f30979u;
            if (i6 != 1) {
                if (i6 != 2) {
                    if (i6 != 3) {
                        if (i6 == 4) {
                            String string = getString(R.string.depressionThoughtsViewPagerHead7);
                            kotlin.jvm.internal.i.f(string, "getString(R.string.depre…onThoughtsViewPagerHead7)");
                            String string2 = getString(R.string.depressionThoughtsViewPagerSubtitle7);
                            kotlin.jvm.internal.i.f(string2, "getString(R.string.depre…oughtsViewPagerSubtitle7)");
                            String string3 = getString(R.string.depressionThoughtsViewPagerHead8);
                            kotlin.jvm.internal.i.f(string3, "getString(R.string.depre…onThoughtsViewPagerHead8)");
                            String string4 = getString(R.string.depressionThoughtsViewPagerSubtitle8);
                            kotlin.jvm.internal.i.f(string4, "getString(R.string.depre…oughtsViewPagerSubtitle8)");
                            K(string, string2, string3, string4);
                        }
                    } else {
                        String string5 = getString(R.string.depressionThoughtsViewPagerHead5);
                        kotlin.jvm.internal.i.f(string5, "getString(R.string.depre…onThoughtsViewPagerHead5)");
                        String string6 = getString(R.string.depressionThoughtsViewPagerSubtitle5);
                        kotlin.jvm.internal.i.f(string6, "getString(R.string.depre…oughtsViewPagerSubtitle5)");
                        String string7 = getString(R.string.depressionThoughtsViewPagerHead6);
                        kotlin.jvm.internal.i.f(string7, "getString(R.string.depre…onThoughtsViewPagerHead6)");
                        String string8 = getString(R.string.depressionThoughtsViewPagerSubtitle6);
                        kotlin.jvm.internal.i.f(string8, "getString(R.string.depre…oughtsViewPagerSubtitle6)");
                        K(string5, string6, string7, string8);
                    }
                } else {
                    String string9 = getString(R.string.depressionThoughtsViewPagerHead3);
                    kotlin.jvm.internal.i.f(string9, "getString(R.string.depre…onThoughtsViewPagerHead3)");
                    String string10 = getString(R.string.depressionThoughtsViewPagerSubtitle3);
                    kotlin.jvm.internal.i.f(string10, "getString(R.string.depre…oughtsViewPagerSubtitle3)");
                    String string11 = getString(R.string.depressionThoughtsViewPagerHead4);
                    kotlin.jvm.internal.i.f(string11, "getString(R.string.depre…onThoughtsViewPagerHead4)");
                    String string12 = getString(R.string.depressionThoughtsViewPagerSubtitle4);
                    kotlin.jvm.internal.i.f(string12, "getString(R.string.depre…oughtsViewPagerSubtitle4)");
                    K(string9, string10, string11, string12);
                }
            } else {
                String string13 = getString(R.string.depressionThoughtsViewPagerHead1);
                kotlin.jvm.internal.i.f(string13, "getString(R.string.depre…onThoughtsViewPagerHead1)");
                String string14 = getString(R.string.depressionThoughtsViewPagerSubTitle1);
                kotlin.jvm.internal.i.f(string14, "getString(R.string.depre…oughtsViewPagerSubTitle1)");
                String string15 = getString(R.string.depressionThoughtsViewPagerHead2);
                kotlin.jvm.internal.i.f(string15, "getString(R.string.depre…onThoughtsViewPagerHead2)");
                String string16 = getString(R.string.depressionThoughtsViewPagerSubTitle2);
                kotlin.jvm.internal.i.f(string16, "getString(R.string.depre…oughtsViewPagerSubTitle2)");
                K(string13, string14, string15, string16);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f30980v, "Thoughts ViewPager", e10);
        }
    }

    /* compiled from: DepressionThoughtsViewPagerFragment.kt */
    /* loaded from: classes2.dex */
    public final class b implements ViewPager.i {

        /* renamed from: a  reason: collision with root package name */
        public final int f30985a;

        public b(int i6) {
            this.f30985a = i6;
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public final void c(int i6) {
            int i10 = q.f30978x;
            q.this.J(i6, this.f30985a);
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public final void b(int i6) {
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public final void a(float f, int i6) {
        }
    }
}
