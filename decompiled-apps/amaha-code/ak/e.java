package ak;

import ak.b;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.tbuonomo.viewpagerdotsindicator.DotsIndicator;
import java.util.ArrayList;
import kotlin.jvm.internal.i;
/* compiled from: DotsIndicator.kt */
/* loaded from: classes.dex */
public final class e extends f {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ DotsIndicator f608c;

    public e(DotsIndicator dotsIndicator) {
        this.f608c = dotsIndicator;
    }

    @Override // ak.f
    public final int a() {
        return this.f608c.f593u.size();
    }

    @Override // ak.f
    public final void c(float f, int i6, int i10) {
        DotsIndicator dotsIndicator = this.f608c;
        ImageView imageView = dotsIndicator.f593u.get(i6);
        i.f(imageView, "dots[selectedPosition]");
        ImageView imageView2 = imageView;
        boolean z10 = true;
        float f2 = 1;
        sp.b.Y((int) defpackage.e.e(f2, f, (dotsIndicator.C - f2) * dotsIndicator.getDotsSize(), dotsIndicator.getDotsSize()), imageView2);
        ArrayList<ImageView> arrayList = dotsIndicator.f593u;
        i.g(arrayList, "<this>");
        if ((i10 < 0 || i10 >= arrayList.size()) ? false : false) {
            ImageView imageView3 = dotsIndicator.f593u.get(i10);
            i.f(imageView3, "dots[nextPosition]");
            ImageView imageView4 = imageView3;
            sp.b.Y((int) (((dotsIndicator.C - f2) * dotsIndicator.getDotsSize() * f) + dotsIndicator.getDotsSize()), imageView4);
            Drawable background = imageView2.getBackground();
            if (background != null) {
                c cVar = (c) background;
                Drawable background2 = imageView4.getBackground();
                if (background2 != null) {
                    c cVar2 = (c) background2;
                    if (dotsIndicator.getSelectedDotColor() != dotsIndicator.getDotsColor()) {
                        Object evaluate = dotsIndicator.G.evaluate(f, Integer.valueOf(dotsIndicator.getSelectedDotColor()), Integer.valueOf(dotsIndicator.getDotsColor()));
                        if (evaluate != null) {
                            int intValue = ((Integer) evaluate).intValue();
                            Object evaluate2 = dotsIndicator.G.evaluate(f, Integer.valueOf(dotsIndicator.getDotsColor()), Integer.valueOf(dotsIndicator.getSelectedDotColor()));
                            if (evaluate2 != null) {
                                cVar2.setColor(((Integer) evaluate2).intValue());
                                if (dotsIndicator.D) {
                                    b.a pager = dotsIndicator.getPager();
                                    i.d(pager);
                                    if (i6 <= pager.a()) {
                                        cVar.setColor(dotsIndicator.getSelectedDotColor());
                                    }
                                }
                                cVar.setColor(intValue);
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                            }
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                        }
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type com.tbuonomo.viewpagerdotsindicator.DotsGradientDrawable");
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type com.tbuonomo.viewpagerdotsindicator.DotsGradientDrawable");
            }
        }
        dotsIndicator.invalidate();
    }

    @Override // ak.f
    public final void d(int i6) {
        DotsIndicator dotsIndicator = this.f608c;
        ImageView imageView = dotsIndicator.f593u.get(i6);
        i.f(imageView, "dots[position]");
        sp.b.Y((int) dotsIndicator.getDotsSize(), imageView);
        dotsIndicator.c(i6);
    }
}
