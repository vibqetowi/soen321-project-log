package ak;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;
import bk.g;
import java.util.ArrayList;
import kotlin.jvm.internal.i;
import tr.r;
/* compiled from: BaseDotsIndicator.kt */
/* loaded from: classes.dex */
public abstract class b extends FrameLayout {
    public a A;

    /* renamed from: u  reason: collision with root package name */
    public final ArrayList<ImageView> f593u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f594v;

    /* renamed from: w  reason: collision with root package name */
    public int f595w;

    /* renamed from: x  reason: collision with root package name */
    public float f596x;

    /* renamed from: y  reason: collision with root package name */
    public float f597y;

    /* renamed from: z  reason: collision with root package name */
    public float f598z;

    /* compiled from: BaseDotsIndicator.kt */
    /* loaded from: classes.dex */
    public interface a {
        int a();

        void b(int i6);

        void c();

        boolean d();

        void e(f fVar);

        int getCount();
    }

    /* compiled from: BaseDotsIndicator.kt */
    /* renamed from: ak.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public enum EnumC0012b {
        DEFAULT(8.0f, r.f33562v, 2, 4, 5, 3),
        /* JADX INFO: Fake field, exist only in values array */
        SPRING(4.0f, r.f33561u, 1, 4, 5, 2),
        /* JADX INFO: Fake field, exist only in values array */
        WORM(4.0f, r.f33563w, 1, 3, 4, 2);
        
        public final int A;

        /* renamed from: v  reason: collision with root package name */
        public final float f600v;

        /* renamed from: w  reason: collision with root package name */
        public final int[] f601w;

        /* renamed from: x  reason: collision with root package name */
        public final int f602x;

        /* renamed from: y  reason: collision with root package name */
        public final int f603y;

        /* renamed from: z  reason: collision with root package name */
        public final int f604z;

        /* renamed from: u  reason: collision with root package name */
        public final float f599u = 16.0f;
        public final int B = 1;

        EnumC0012b(float f, int[] iArr, int i6, int i10, int i11, int i12) {
            this.f600v = f;
            this.f601w = iArr;
            this.f602x = i6;
            this.f603y = i10;
            this.f604z = i11;
            this.A = i12;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        i.g(context, "context");
    }

    public abstract void a(int i6);

    public abstract e b();

    public abstract void c(int i6);

    public final void d() {
        if (this.A == null) {
            return;
        }
        post(new ak.a(this, 1));
    }

    public final void e() {
        int size = this.f593u.size();
        for (int i6 = 0; i6 < size; i6++) {
            c(i6);
        }
    }

    public abstract void f();

    public final boolean getDotsClickable() {
        return this.f594v;
    }

    public final int getDotsColor() {
        return this.f595w;
    }

    public final float getDotsCornerRadius() {
        return this.f597y;
    }

    public final float getDotsSize() {
        return this.f596x;
    }

    public final float getDotsSpacing() {
        return this.f598z;
    }

    public final a getPager() {
        return this.A;
    }

    public abstract EnumC0012b getType();

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        post(new ak.a(this, 2));
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i6, int i10, int i11, int i12) {
        super.onLayout(z10, i6, i10, i11, i12);
        if (getLayoutDirection() == 1) {
            setLayoutDirection(0);
            setRotation(180.0f);
            requestLayout();
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(parcelable);
        post(new ak.a(this, 0));
    }

    public final void setDotsClickable(boolean z10) {
        this.f594v = z10;
    }

    public final void setDotsColor(int i6) {
        this.f595w = i6;
        e();
    }

    public final void setDotsCornerRadius(float f) {
        this.f597y = f;
    }

    public final void setDotsSize(float f) {
        this.f596x = f;
    }

    public final void setDotsSpacing(float f) {
        this.f598z = f;
    }

    public final void setPager(a aVar) {
        this.A = aVar;
    }

    public final void setPointsColor(int i6) {
        setDotsColor(i6);
        e();
    }

    public final void setViewPager(ViewPager viewPager) {
        i.g(viewPager, "viewPager");
        new g().d(this, viewPager);
    }

    public final void setViewPager2(ViewPager2 viewPager2) {
        i.g(viewPager2, "viewPager2");
        new bk.d().d(this, viewPager2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context, AttributeSet attributeSet, int i6) {
        super(context, attributeSet, i6);
        i.g(context, "context");
        this.f593u = new ArrayList<>();
        this.f594v = true;
        this.f595w = -16711681;
        float f = getContext().getResources().getDisplayMetrics().density * getType().f599u;
        this.f596x = f;
        this.f597y = f / 2.0f;
        this.f598z = getContext().getResources().getDisplayMetrics().density * getType().f600v;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, getType().f601w);
            i.f(obtainStyledAttributes, "context.obtainStyledAttr…(attrs, type.styleableId)");
            setDotsColor(obtainStyledAttributes.getColor(getType().f602x, -16711681));
            this.f596x = obtainStyledAttributes.getDimension(getType().f603y, this.f596x);
            this.f597y = obtainStyledAttributes.getDimension(getType().A, this.f597y);
            this.f598z = obtainStyledAttributes.getDimension(getType().f604z, this.f598z);
            this.f594v = obtainStyledAttributes.getBoolean(getType().B, true);
            obtainStyledAttributes.recycle();
        }
    }
}
