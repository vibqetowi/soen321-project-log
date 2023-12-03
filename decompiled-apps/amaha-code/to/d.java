package to;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.i;
/* compiled from: GridSpacingItemDecoration.kt */
/* loaded from: classes2.dex */
public final class d extends RecyclerView.l {

    /* renamed from: b  reason: collision with root package name */
    public final int f33392b;

    /* renamed from: a  reason: collision with root package name */
    public final int f33391a = 3;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f33393c = true;

    public d(int i6) {
        this.f33392b = i6;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void f(Rect outRect, View view, RecyclerView parent, RecyclerView.y state) {
        int i6;
        i.g(outRect, "outRect");
        i.g(view, "view");
        i.g(parent, "parent");
        i.g(state, "state");
        RecyclerView.c0 L = RecyclerView.L(view);
        if (L != null) {
            i6 = L.e();
        } else {
            i6 = -1;
        }
        int i10 = this.f33391a;
        int i11 = i6 % i10;
        boolean z10 = this.f33393c;
        int i12 = this.f33392b;
        if (z10) {
            outRect.left = i12 - ((i11 * i12) / i10);
            outRect.right = ((i11 + 1) * i12) / i10;
            if (i6 < i10) {
                outRect.top = i12 * 2;
            }
            outRect.bottom = i12 * 2;
            return;
        }
        outRect.left = (i11 * i12) / i10;
        outRect.right = i12 - (((i11 + 1) * i12) / i10);
        if (i6 >= i10) {
            outRect.top = i12;
        }
    }
}
