package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: OrientationHelper.java */
/* loaded from: classes.dex */
public final class t extends v {
    public t(RecyclerView.m mVar) {
        super(mVar);
    }

    @Override // androidx.recyclerview.widget.v
    public final int b(View view) {
        return this.f3055a.getDecoratedRight(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.n) view.getLayoutParams())).rightMargin;
    }

    @Override // androidx.recyclerview.widget.v
    public final int c(View view) {
        RecyclerView.n nVar = (RecyclerView.n) view.getLayoutParams();
        return this.f3055a.getDecoratedMeasuredWidth(view) + ((ViewGroup.MarginLayoutParams) nVar).leftMargin + ((ViewGroup.MarginLayoutParams) nVar).rightMargin;
    }

    @Override // androidx.recyclerview.widget.v
    public final int d(View view) {
        RecyclerView.n nVar = (RecyclerView.n) view.getLayoutParams();
        return this.f3055a.getDecoratedMeasuredHeight(view) + ((ViewGroup.MarginLayoutParams) nVar).topMargin + ((ViewGroup.MarginLayoutParams) nVar).bottomMargin;
    }

    @Override // androidx.recyclerview.widget.v
    public final int e(View view) {
        return this.f3055a.getDecoratedLeft(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.n) view.getLayoutParams())).leftMargin;
    }

    @Override // androidx.recyclerview.widget.v
    public final int f() {
        return this.f3055a.getWidth();
    }

    @Override // androidx.recyclerview.widget.v
    public final int g() {
        RecyclerView.m mVar = this.f3055a;
        return mVar.getWidth() - mVar.getPaddingRight();
    }

    @Override // androidx.recyclerview.widget.v
    public final int h() {
        return this.f3055a.getPaddingRight();
    }

    @Override // androidx.recyclerview.widget.v
    public final int i() {
        return this.f3055a.getWidthMode();
    }

    @Override // androidx.recyclerview.widget.v
    public final int j() {
        return this.f3055a.getHeightMode();
    }

    @Override // androidx.recyclerview.widget.v
    public final int k() {
        return this.f3055a.getPaddingLeft();
    }

    @Override // androidx.recyclerview.widget.v
    public final int l() {
        RecyclerView.m mVar = this.f3055a;
        return (mVar.getWidth() - mVar.getPaddingLeft()) - mVar.getPaddingRight();
    }

    @Override // androidx.recyclerview.widget.v
    public final int m(View view) {
        RecyclerView.m mVar = this.f3055a;
        Rect rect = this.f3057c;
        mVar.getTransformedBoundingBox(view, true, rect);
        return rect.right;
    }

    @Override // androidx.recyclerview.widget.v
    public final int n(View view) {
        RecyclerView.m mVar = this.f3055a;
        Rect rect = this.f3057c;
        mVar.getTransformedBoundingBox(view, true, rect);
        return rect.left;
    }

    @Override // androidx.recyclerview.widget.v
    public final void o(int i6) {
        this.f3055a.offsetChildrenHorizontal(i6);
    }
}
