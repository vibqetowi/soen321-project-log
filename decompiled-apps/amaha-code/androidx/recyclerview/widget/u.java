package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: OrientationHelper.java */
/* loaded from: classes.dex */
public final class u extends v {
    public u(RecyclerView.m mVar) {
        super(mVar);
    }

    @Override // androidx.recyclerview.widget.v
    public final int b(View view) {
        return this.f3055a.getDecoratedBottom(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.n) view.getLayoutParams())).bottomMargin;
    }

    @Override // androidx.recyclerview.widget.v
    public final int c(View view) {
        RecyclerView.n nVar = (RecyclerView.n) view.getLayoutParams();
        return this.f3055a.getDecoratedMeasuredHeight(view) + ((ViewGroup.MarginLayoutParams) nVar).topMargin + ((ViewGroup.MarginLayoutParams) nVar).bottomMargin;
    }

    @Override // androidx.recyclerview.widget.v
    public final int d(View view) {
        RecyclerView.n nVar = (RecyclerView.n) view.getLayoutParams();
        return this.f3055a.getDecoratedMeasuredWidth(view) + ((ViewGroup.MarginLayoutParams) nVar).leftMargin + ((ViewGroup.MarginLayoutParams) nVar).rightMargin;
    }

    @Override // androidx.recyclerview.widget.v
    public final int e(View view) {
        return this.f3055a.getDecoratedTop(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.n) view.getLayoutParams())).topMargin;
    }

    @Override // androidx.recyclerview.widget.v
    public final int f() {
        return this.f3055a.getHeight();
    }

    @Override // androidx.recyclerview.widget.v
    public final int g() {
        RecyclerView.m mVar = this.f3055a;
        return mVar.getHeight() - mVar.getPaddingBottom();
    }

    @Override // androidx.recyclerview.widget.v
    public final int h() {
        return this.f3055a.getPaddingBottom();
    }

    @Override // androidx.recyclerview.widget.v
    public final int i() {
        return this.f3055a.getHeightMode();
    }

    @Override // androidx.recyclerview.widget.v
    public final int j() {
        return this.f3055a.getWidthMode();
    }

    @Override // androidx.recyclerview.widget.v
    public final int k() {
        return this.f3055a.getPaddingTop();
    }

    @Override // androidx.recyclerview.widget.v
    public final int l() {
        RecyclerView.m mVar = this.f3055a;
        return (mVar.getHeight() - mVar.getPaddingTop()) - mVar.getPaddingBottom();
    }

    @Override // androidx.recyclerview.widget.v
    public final int m(View view) {
        RecyclerView.m mVar = this.f3055a;
        Rect rect = this.f3057c;
        mVar.getTransformedBoundingBox(view, true, rect);
        return rect.bottom;
    }

    @Override // androidx.recyclerview.widget.v
    public final int n(View view) {
        RecyclerView.m mVar = this.f3055a;
        Rect rect = this.f3057c;
        mVar.getTransformedBoundingBox(view, true, rect);
        return rect.top;
    }

    @Override // androidx.recyclerview.widget.v
    public final void o(int i6) {
        this.f3055a.offsetChildrenVertical(i6);
    }
}
