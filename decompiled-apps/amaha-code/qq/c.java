package qq;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager.widget.ViewPager;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.InsetsUtils;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.CustomViewPager;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: DepressionPleasurableAffirmationFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lqq/c;", "Lrr/b;", "<init>", "()V", "a", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class c extends rr.b {

    /* renamed from: x  reason: collision with root package name */
    public static final /* synthetic */ int f30018x = 0;

    /* renamed from: w  reason: collision with root package name */
    public final LinkedHashMap f30021w = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public int f30019u = 1;

    /* renamed from: v  reason: collision with root package name */
    public final String f30020v = LogHelper.INSTANCE.makeLogTag(c.class);

    /* compiled from: DepressionPleasurableAffirmationFragment.kt */
    /* loaded from: classes2.dex */
    public final class a extends k2.a {

        /* renamed from: c  reason: collision with root package name */
        public final Context f30022c;

        /* renamed from: d  reason: collision with root package name */
        public final ArrayList<String> f30023d;

        /* renamed from: e  reason: collision with root package name */
        public final int f30024e = R.drawable.ic_a4_3gt_lightbulb;
        public final ArrayList<String> f;

        public a(Context context, ArrayList arrayList, ArrayList arrayList2) {
            this.f30022c = context;
            this.f30023d = new ArrayList<>();
            this.f = new ArrayList<>();
            this.f30023d = arrayList;
            this.f = arrayList2;
        }

        @Override // k2.a
        public final int g() {
            return this.f.size();
        }

        @Override // k2.a
        public final Object i(int i6, ViewGroup container) {
            kotlin.jvm.internal.i.g(container, "container");
            View inflate = LayoutInflater.from(this.f30022c).inflate(R.layout.row_screen_a29, container, false);
            kotlin.jvm.internal.i.e(inflate, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
            ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
            ((RobertoTextView) constraintLayout.findViewById(R.id.a29ViewPagerTitleText)).setText(this.f30023d.get(i6));
            ((RobertoTextView) constraintLayout.findViewById(R.id.a29ViewPagerSubtitleText)).setText(this.f.get(i6));
            ((AppCompatImageView) constraintLayout.findViewById(R.id.a29ViewPagerImage)).setImageResource(this.f30024e);
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

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f30021w;
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
        return inflater.inflate(R.layout.fragment_screen_a13, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f30021w.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            InsetsUtils insetsUtils = InsetsUtils.INSTANCE;
            CustomViewPager a13ViewPager = (CustomViewPager) _$_findCachedViewById(R.id.a13ViewPager);
            kotlin.jvm.internal.i.f(a13ViewPager, "a13ViewPager");
            insetsUtils.addStatusBarHeight(a13ViewPager);
            ArrayList arrayList = new ArrayList();
            arrayList.add(getString(R.string.depressionPleasurableAffirmationHeader1));
            arrayList.add(getString(R.string.depressionPleasurableAffirmationHeader2));
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(getString(R.string.depressionPleasurableAffirmationText1));
            arrayList2.add(getString(R.string.depressionPleasurableAffirmationText2));
            Context requireContext = requireContext();
            kotlin.jvm.internal.i.f(requireContext, "requireContext()");
            ((CustomViewPager) _$_findCachedViewById(R.id.a13ViewPager)).setAdapter(new a(requireContext, arrayList, arrayList2));
            ((CustomViewPager) _$_findCachedViewById(R.id.a13ViewPager)).setPagingEnabled(false);
            ((ConstraintLayout) _$_findCachedViewById(R.id.a13parent)).setOnClickListener(new fq.x(26, this));
            rr.c cVar = new rr.c(requireContext(), new LinearInterpolator());
            Field declaredField = ViewPager.class.getDeclaredField("D");
            declaredField.setAccessible(true);
            declaredField.set((CustomViewPager) _$_findCachedViewById(R.id.a13ViewPager), cVar);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f30020v, e10);
        }
    }
}
