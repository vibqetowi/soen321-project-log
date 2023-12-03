package ek;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.UtilsKt;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
/* compiled from: CarouselPagerAdapter.kt */
/* loaded from: classes2.dex */
public final class i extends k2.a implements ViewPager.i {

    /* renamed from: c  reason: collision with root package name */
    public final rr.b f14160c;

    /* renamed from: d  reason: collision with root package name */
    public final int f14161d;

    /* renamed from: e  reason: collision with root package name */
    public final ArrayList<RobertoTextView> f14162e;
    public int f;

    /* renamed from: g  reason: collision with root package name */
    public Integer f14163g;

    public i(rr.b fragment, int i6) {
        kotlin.jvm.internal.i.g(fragment, "fragment");
        this.f14160c = fragment;
        this.f14161d = i6;
        this.f14162e = new ArrayList<>();
    }

    @Override // androidx.viewpager.widget.ViewPager.i
    public final void a(float f, int i6) {
        this.f = i6;
        Integer num = this.f14163g;
        ArrayList<RobertoTextView> arrayList = this.f14162e;
        if (num == null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (i6 != i10) {
                    arrayList.get(i10).setBackgroundResource(R.drawable.circle_filled_grey);
                    RobertoTextView robertoTextView = arrayList.get(i10);
                    kotlin.jvm.internal.i.f(robertoTextView, "textViewArr[i]");
                    UtilsKt.scaleView(robertoTextView, arrayList.get(i10).getScaleY(), 0.5f, arrayList.get(i10).getScaleX(), 0.5f);
                } else {
                    arrayList.get(i10).setBackgroundResource(R.drawable.circle_filled_orange);
                    RobertoTextView robertoTextView2 = arrayList.get(i10);
                    kotlin.jvm.internal.i.f(robertoTextView2, "textViewArr[i]");
                    UtilsKt.scaleView(robertoTextView2, arrayList.get(i10).getScaleX(), 1.0f, arrayList.get(i10).getScaleY(), 1.0f);
                }
            }
        } else if (num.intValue() != i6) {
            Integer num2 = this.f14163g;
            kotlin.jvm.internal.i.d(num2);
            arrayList.get(num2.intValue()).setBackgroundResource(R.drawable.circle_filled_grey);
            Integer num3 = this.f14163g;
            kotlin.jvm.internal.i.d(num3);
            RobertoTextView robertoTextView3 = arrayList.get(num3.intValue());
            kotlin.jvm.internal.i.f(robertoTextView3, "textViewArr[previousOne!!]");
            Integer num4 = this.f14163g;
            kotlin.jvm.internal.i.d(num4);
            float scaleY = arrayList.get(num4.intValue()).getScaleY();
            Integer num5 = this.f14163g;
            kotlin.jvm.internal.i.d(num5);
            UtilsKt.scaleView(robertoTextView3, scaleY, 0.5f, arrayList.get(num5.intValue()).getScaleX(), 0.5f);
            arrayList.get(this.f).setBackgroundResource(R.drawable.circle_filled_orange);
            RobertoTextView robertoTextView4 = arrayList.get(this.f);
            kotlin.jvm.internal.i.f(robertoTextView4, "textViewArr[chosenOne]");
            UtilsKt.scaleView(robertoTextView4, 0.5f, 1.0f, 0.5f, 1.0f);
        }
        this.f14163g = Integer.valueOf(i6);
    }

    @Override // k2.a
    public final void d(View container, Object object) {
        kotlin.jvm.internal.i.g(container, "container");
        kotlin.jvm.internal.i.g(object, "object");
    }

    @Override // k2.a
    public final int g() {
        try {
            return this.f14161d;
        } catch (Exception e10) {
            e10.printStackTrace();
            return 0;
        }
    }

    @Override // k2.a
    public final Object i(int i6, ViewGroup collection) {
        kotlin.jvm.internal.i.g(collection, "collection");
        View inflate = LayoutInflater.from(this.f14160c.getContext()).inflate(R.layout.pager_steps, (ViewGroup) null);
        kotlin.jvm.internal.i.e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) inflate;
        View findViewById = viewGroup.findViewById(R.id.textView2);
        kotlin.jvm.internal.i.e(findViewById, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.RobertoTextView");
        RobertoTextView robertoTextView = (RobertoTextView) findViewById;
        robertoTextView.setText(String.valueOf(i6 + 1));
        this.f14162e.add(robertoTextView);
        collection.addView(viewGroup);
        return viewGroup;
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

    @Override // androidx.viewpager.widget.ViewPager.i
    public final void b(int i6) {
    }

    @Override // androidx.viewpager.widget.ViewPager.i
    public final void c(int i6) {
    }
}
