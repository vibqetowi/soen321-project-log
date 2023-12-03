package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public final class ViewStubCompat extends View {

    /* renamed from: u  reason: collision with root package name */
    public int f1330u;

    /* renamed from: v  reason: collision with root package name */
    public int f1331v;

    /* renamed from: w  reason: collision with root package name */
    public WeakReference<View> f1332w;

    /* renamed from: x  reason: collision with root package name */
    public LayoutInflater f1333x;

    /* loaded from: classes.dex */
    public interface a {
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f1330u = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, kc.f.f23213a0, 0, 0);
        this.f1331v = obtainStyledAttributes.getResourceId(2, -1);
        this.f1330u = obtainStyledAttributes.getResourceId(1, 0);
        setId(obtainStyledAttributes.getResourceId(0, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    public final View a() {
        ViewParent parent = getParent();
        if (parent instanceof ViewGroup) {
            if (this.f1330u != 0) {
                ViewGroup viewGroup = (ViewGroup) parent;
                LayoutInflater layoutInflater = this.f1333x;
                if (layoutInflater == null) {
                    layoutInflater = LayoutInflater.from(getContext());
                }
                View inflate = layoutInflater.inflate(this.f1330u, viewGroup, false);
                int i6 = this.f1331v;
                if (i6 != -1) {
                    inflate.setId(i6);
                }
                int indexOfChild = viewGroup.indexOfChild(this);
                viewGroup.removeViewInLayout(this);
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                if (layoutParams != null) {
                    viewGroup.addView(inflate, indexOfChild, layoutParams);
                } else {
                    viewGroup.addView(inflate, indexOfChild);
                }
                this.f1332w = new WeakReference<>(inflate);
                return inflate;
            }
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
        throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
    }

    public int getInflatedId() {
        return this.f1331v;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f1333x;
    }

    public int getLayoutResource() {
        return this.f1330u;
    }

    @Override // android.view.View
    public final void onMeasure(int i6, int i10) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i6) {
        this.f1331v = i6;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f1333x = layoutInflater;
    }

    public void setLayoutResource(int i6) {
        this.f1330u = i6;
    }

    @Override // android.view.View
    public void setVisibility(int i6) {
        WeakReference<View> weakReference = this.f1332w;
        if (weakReference != null) {
            View view = weakReference.get();
            if (view != null) {
                view.setVisibility(i6);
                return;
            }
            throw new IllegalStateException("setVisibility called on un-referenced view");
        }
        super.setVisibility(i6);
        if (i6 == 0 || i6 == 4) {
            a();
        }
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    public void setOnInflateListener(a aVar) {
    }
}
