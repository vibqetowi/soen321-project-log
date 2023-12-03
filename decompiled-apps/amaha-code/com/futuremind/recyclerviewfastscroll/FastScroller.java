package com.futuremind.recyclerviewfastscroll;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.k;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.R;
import g0.a;
import k0.a;
import l6.b;
/* loaded from: classes.dex */
public class FastScroller extends LinearLayout {
    public static final /* synthetic */ int I = 0;
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public boolean F;
    public b G;
    public k6.b H;

    /* renamed from: u  reason: collision with root package name */
    public final com.futuremind.recyclerviewfastscroll.a f6133u;

    /* renamed from: v  reason: collision with root package name */
    public RecyclerView f6134v;

    /* renamed from: w  reason: collision with root package name */
    public View f6135w;

    /* renamed from: x  reason: collision with root package name */
    public View f6136x;

    /* renamed from: y  reason: collision with root package name */
    public TextView f6137y;

    /* renamed from: z  reason: collision with root package name */
    public int f6138z;

    /* loaded from: classes.dex */
    public class a implements ViewGroup.OnHierarchyChangeListener {
        public a() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewAdded(View view, View view2) {
            int i6 = FastScroller.I;
            FastScroller.this.b();
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewRemoved(View view, View view2) {
            int i6 = FastScroller.I;
            FastScroller.this.b();
        }
    }

    public FastScroller(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f6133u = new com.futuremind.recyclerviewfastscroll.a(this);
        setClipChildren(false);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, sc.b.H, R.attr.fastscroll__style, 0);
        try {
            this.B = obtainStyledAttributes.getColor(0, -1);
            this.A = obtainStyledAttributes.getColor(2, -1);
            this.C = obtainStyledAttributes.getResourceId(1, -1);
            obtainStyledAttributes.recycle();
            this.E = getVisibility();
            setViewProvider(new l6.a());
        } catch (Throwable th2) {
            obtainStyledAttributes.recycle();
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRecyclerViewPosition(float f) {
        TextView textView;
        RecyclerView recyclerView = this.f6134v;
        if (recyclerView == null) {
            return;
        }
        int f2 = recyclerView.getAdapter().f();
        int min = (int) Math.min(Math.max(0.0f, (int) (f * f2)), f2 - 1);
        this.f6134v.h0(min);
        k6.b bVar = this.H;
        if (bVar != null && (textView = this.f6137y) != null) {
            textView.setText(bVar.c(min));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0040, code lost:
        if ((r4.f6134v.getAdapter().f() * r4.f6134v.getChildAt(0).getHeight()) <= r4.f6134v.getHeight()) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0043, code lost:
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0061, code lost:
        if ((r4.f6134v.getAdapter().f() * r4.f6134v.getChildAt(0).getWidth()) <= r4.f6134v.getWidth()) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0063, code lost:
        if (r2 != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0067, code lost:
        if (r4.E == 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006a, code lost:
        super.setVisibility(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:?, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        if (this.f6134v.getAdapter() != null && this.f6134v.getAdapter().f() != 0 && this.f6134v.getChildAt(0) != null) {
            boolean z10 = true;
            if (c()) {
            }
        }
        super.setVisibility(4);
    }

    public final boolean c() {
        if (this.D == 1) {
            return true;
        }
        return false;
    }

    public b getViewProvider() {
        return this.G;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i6, int i10, int i11, int i12) {
        float width;
        int width2;
        super.onLayout(z10, i6, i10, i11, i12);
        this.f6136x.setOnTouchListener(new k6.a(this));
        l6.a aVar = (l6.a) this.G;
        if (aVar.f24094a.c()) {
            width = aVar.f24093d.getHeight() / 2.0f;
            width2 = aVar.f24092c.getHeight();
        } else {
            width = aVar.f24093d.getWidth() / 2.0f;
            width2 = aVar.f24092c.getWidth();
        }
        this.f6138z = (int) (width - width2);
        int i13 = this.B;
        if (i13 != -1) {
            TextView textView = this.f6137y;
            Drawable g5 = k0.a.g(textView.getBackground());
            if (g5 != null) {
                a.b.g(g5.mutate(), i13);
                textView.setBackground(g5);
            }
        }
        int i14 = this.A;
        if (i14 != -1) {
            View view = this.f6136x;
            Drawable g10 = k0.a.g(view.getBackground());
            if (g10 != null) {
                a.b.g(g10.mutate(), i14);
                view.setBackground(g10);
            }
        }
        int i15 = this.C;
        if (i15 != -1) {
            k.e(this.f6137y, i15);
        }
        if (!isInEditMode()) {
            this.f6133u.c(this.f6134v);
        }
    }

    public void setBubbleColor(int i6) {
        this.B = i6;
        invalidate();
    }

    public void setBubbleTextAppearance(int i6) {
        this.C = i6;
        invalidate();
    }

    public void setHandleColor(int i6) {
        this.A = i6;
        invalidate();
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i6) {
        int i10;
        this.D = i6;
        if (i6 == 0) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        super.setOrientation(i10);
    }

    public void setRecyclerView(RecyclerView recyclerView) {
        this.f6134v = recyclerView;
        if (recyclerView.getAdapter() instanceof k6.b) {
            this.H = (k6.b) recyclerView.getAdapter();
        }
        recyclerView.i(this.f6133u);
        b();
        recyclerView.setOnHierarchyChangeListener(new a());
    }

    public void setScrollerPosition(float f) {
        if (c()) {
            this.f6135w.setY(Math.min(Math.max(0.0f, ((getHeight() - this.f6136x.getHeight()) * f) + this.f6138z), getHeight() - this.f6135w.getHeight()));
            this.f6136x.setY(Math.min(Math.max(0.0f, f * (getHeight() - this.f6136x.getHeight())), getHeight() - this.f6136x.getHeight()));
            return;
        }
        this.f6135w.setX(Math.min(Math.max(0.0f, ((getWidth() - this.f6136x.getWidth()) * f) + this.f6138z), getWidth() - this.f6135w.getWidth()));
        this.f6136x.setX(Math.min(Math.max(0.0f, f * (getWidth() - this.f6136x.getWidth())), getWidth() - this.f6136x.getWidth()));
    }

    public void setViewProvider(b bVar) {
        int dimensionPixelSize;
        int dimensionPixelSize2;
        int i6;
        removeAllViews();
        this.G = bVar;
        bVar.f24094a = this;
        l6.a aVar = (l6.a) bVar;
        View inflate = LayoutInflater.from(aVar.b()).inflate(R.layout.fastscroll__default_bubble, (ViewGroup) this, false);
        aVar.f24092c = inflate;
        this.f6135w = inflate;
        aVar.f24093d = new View(aVar.b());
        if (aVar.f24094a.c()) {
            dimensionPixelSize = 0;
        } else {
            dimensionPixelSize = aVar.b().getResources().getDimensionPixelSize(R.dimen.fastscroll__handle_inset);
        }
        if (!aVar.f24094a.c()) {
            dimensionPixelSize2 = 0;
        } else {
            dimensionPixelSize2 = aVar.b().getResources().getDimensionPixelSize(R.dimen.fastscroll__handle_inset);
        }
        Context b10 = aVar.b();
        Object obj = g0.a.f16164a;
        aVar.f24093d.setBackground(new InsetDrawable(a.c.b(b10, R.drawable.fastscroll__default_handle), dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize));
        Resources resources = aVar.b().getResources();
        boolean c10 = aVar.f24094a.c();
        int i10 = R.dimen.fastscroll__handle_height;
        if (c10) {
            i6 = R.dimen.fastscroll__handle_clickable_width;
        } else {
            i6 = R.dimen.fastscroll__handle_height;
        }
        int dimensionPixelSize3 = resources.getDimensionPixelSize(i6);
        Resources resources2 = aVar.b().getResources();
        if (!aVar.f24094a.c()) {
            i10 = R.dimen.fastscroll__handle_clickable_width;
        }
        aVar.f24093d.setLayoutParams(new ViewGroup.LayoutParams(dimensionPixelSize3, resources2.getDimensionPixelSize(i10)));
        this.f6136x = aVar.f24093d;
        this.f6137y = (TextView) aVar.f24092c;
        addView(this.f6135w);
        addView(this.f6136x);
    }

    @Override // android.view.View
    public void setVisibility(int i6) {
        this.E = i6;
        b();
    }
}
