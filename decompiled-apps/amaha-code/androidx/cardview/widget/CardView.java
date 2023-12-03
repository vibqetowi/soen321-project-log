package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.theinnerhour.b2b.R;
import s.b;
import tr.r;
/* loaded from: classes.dex */
public class CardView extends FrameLayout {

    /* renamed from: u  reason: collision with root package name */
    public boolean f1586u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f1587v;

    /* renamed from: w  reason: collision with root package name */
    public final Rect f1588w;

    /* renamed from: x  reason: collision with root package name */
    public final Rect f1589x;

    /* renamed from: y  reason: collision with root package name */
    public final a f1590y;

    /* renamed from: z  reason: collision with root package name */
    public static final int[] f1585z = {16842801};
    public static final r A = new r();

    /* loaded from: classes.dex */
    public class a implements s.a {

        /* renamed from: a  reason: collision with root package name */
        public Drawable f1591a;

        public a() {
        }

        public final void a(int i6, int i10, int i11, int i12) {
            CardView cardView = CardView.this;
            cardView.f1589x.set(i6, i10, i11, i12);
            Rect rect = cardView.f1588w;
            CardView.super.setPadding(i6 + rect.left, i10 + rect.top, i11 + rect.right, i12 + rect.bottom);
        }
    }

    public CardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.cardViewStyle);
        int color;
        ColorStateList valueOf;
        Rect rect = new Rect();
        this.f1588w = rect;
        this.f1589x = new Rect();
        a aVar = new a();
        this.f1590y = aVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.f33555n0, R.attr.cardViewStyle, R.style.CardView);
        if (obtainStyledAttributes.hasValue(2)) {
            valueOf = obtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(f1585z);
            int color2 = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color2, fArr);
            if (fArr[2] > 0.5f) {
                color = getResources().getColor(R.color.cardview_light_background);
            } else {
                color = getResources().getColor(R.color.cardview_dark_background);
            }
            valueOf = ColorStateList.valueOf(color);
        }
        float dimension = obtainStyledAttributes.getDimension(3, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(4, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(5, 0.0f);
        this.f1586u = obtainStyledAttributes.getBoolean(7, false);
        this.f1587v = obtainStyledAttributes.getBoolean(6, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        rect.left = obtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        rect.top = obtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        rect.right = obtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        rect.bottom = obtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        r rVar = A;
        b bVar = new b(dimension, valueOf);
        aVar.f1591a = bVar;
        setBackgroundDrawable(bVar);
        setClipToOutline(true);
        setElevation(dimension2);
        rVar.u(aVar, dimension3);
    }

    public ColorStateList getCardBackgroundColor() {
        return ((b) this.f1590y.f1591a).f31058h;
    }

    public float getCardElevation() {
        return CardView.this.getElevation();
    }

    public int getContentPaddingBottom() {
        return this.f1588w.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f1588w.left;
    }

    public int getContentPaddingRight() {
        return this.f1588w.right;
    }

    public int getContentPaddingTop() {
        return this.f1588w.top;
    }

    public float getMaxCardElevation() {
        return ((b) this.f1590y.f1591a).f31056e;
    }

    public boolean getPreventCornerOverlap() {
        return this.f1587v;
    }

    public float getRadius() {
        return ((b) this.f1590y.f1591a).f31052a;
    }

    public boolean getUseCompatPadding() {
        return this.f1586u;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i6, int i10) {
        super.onMeasure(i6, i10);
    }

    public void setCardBackgroundColor(int i6) {
        ColorStateList valueOf = ColorStateList.valueOf(i6);
        b bVar = (b) this.f1590y.f1591a;
        bVar.b(valueOf);
        bVar.invalidateSelf();
    }

    public void setCardElevation(float f) {
        CardView.this.setElevation(f);
    }

    public void setMaxCardElevation(float f) {
        A.u(this.f1590y, f);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i6) {
        super.setMinimumHeight(i6);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i6) {
        super.setMinimumWidth(i6);
    }

    public void setPreventCornerOverlap(boolean z10) {
        if (z10 != this.f1587v) {
            this.f1587v = z10;
            r rVar = A;
            a aVar = this.f1590y;
            rVar.u(aVar, ((b) aVar.f1591a).f31056e);
        }
    }

    public void setRadius(float f) {
        b bVar = (b) this.f1590y.f1591a;
        if (f != bVar.f31052a) {
            bVar.f31052a = f;
            bVar.c(null);
            bVar.invalidateSelf();
        }
    }

    public void setUseCompatPadding(boolean z10) {
        if (this.f1586u != z10) {
            this.f1586u = z10;
            r rVar = A;
            a aVar = this.f1590y;
            rVar.u(aVar, ((b) aVar.f1591a).f31056e);
        }
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        b bVar = (b) this.f1590y.f1591a;
        bVar.b(colorStateList);
        bVar.invalidateSelf();
    }

    @Override // android.view.View
    public final void setPadding(int i6, int i10, int i11, int i12) {
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i6, int i10, int i11, int i12) {
    }
}
