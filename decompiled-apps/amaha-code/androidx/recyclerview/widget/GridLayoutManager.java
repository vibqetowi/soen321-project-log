package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.j;
import java.util.Arrays;
import u0.h;
/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* renamed from: a  reason: collision with root package name */
    public boolean f2677a;

    /* renamed from: b  reason: collision with root package name */
    public int f2678b;

    /* renamed from: c  reason: collision with root package name */
    public int[] f2679c;

    /* renamed from: d  reason: collision with root package name */
    public View[] f2680d;

    /* renamed from: e  reason: collision with root package name */
    public final SparseIntArray f2681e;
    public final SparseIntArray f;

    /* renamed from: g  reason: collision with root package name */
    public final a f2682g;

    /* renamed from: h  reason: collision with root package name */
    public final Rect f2683h;

    /* loaded from: classes.dex */
    public static final class a extends c {
    }

    /* loaded from: classes.dex */
    public static abstract class c {

        /* renamed from: a  reason: collision with root package name */
        public final SparseIntArray f2685a = new SparseIntArray();

        /* renamed from: b  reason: collision with root package name */
        public final SparseIntArray f2686b = new SparseIntArray();

        public static int a(int i6, int i10) {
            int i11 = 0;
            int i12 = 0;
            for (int i13 = 0; i13 < i6; i13++) {
                i11++;
                if (i11 == i10) {
                    i12++;
                    i11 = 0;
                } else if (i11 > i10) {
                    i12++;
                    i11 = 1;
                }
            }
            if (i11 + 1 > i10) {
                return i12 + 1;
            }
            return i12;
        }

        public final void b() {
            this.f2685a.clear();
        }
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i6, int i10) {
        super(context, attributeSet, i6, i10);
        this.f2677a = false;
        this.f2678b = -1;
        this.f2681e = new SparseIntArray();
        this.f = new SparseIntArray();
        this.f2682g = new a();
        this.f2683h = new Rect();
        g(RecyclerView.m.getProperties(context, attributeSet, i6, i10).f2783b);
    }

    public final void a(int i6) {
        int i10;
        int[] iArr = this.f2679c;
        int i11 = this.f2678b;
        if (iArr == null || iArr.length != i11 + 1 || iArr[iArr.length - 1] != i6) {
            iArr = new int[i11 + 1];
        }
        int i12 = 0;
        iArr[0] = 0;
        int i13 = i6 / i11;
        int i14 = i6 % i11;
        int i15 = 0;
        for (int i16 = 1; i16 <= i11; i16++) {
            i12 += i14;
            if (i12 > 0 && i11 - i12 < i14) {
                i10 = i13 + 1;
                i12 -= i11;
            } else {
                i10 = i13;
            }
            i15 += i10;
            iArr[i16] = i15;
        }
        this.f2679c = iArr;
    }

    public final int b(int i6, int i10) {
        if (this.mOrientation == 1 && isLayoutRTL()) {
            int[] iArr = this.f2679c;
            int i11 = this.f2678b;
            return iArr[i11 - i6] - iArr[(i11 - i6) - i10];
        }
        int[] iArr2 = this.f2679c;
        return iArr2[i10 + i6] - iArr2[i6];
    }

    public final int c(int i6, RecyclerView.t tVar, RecyclerView.y yVar) {
        boolean z10 = yVar.f2817g;
        a aVar = this.f2682g;
        if (!z10) {
            int i10 = this.f2678b;
            aVar.getClass();
            return c.a(i6, i10);
        }
        int b10 = tVar.b(i6);
        if (b10 == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i6);
            return 0;
        }
        int i11 = this.f2678b;
        aVar.getClass();
        return c.a(b10, i11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final boolean checkLayoutParams(RecyclerView.n nVar) {
        return nVar instanceof b;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void collectPrefetchPositionsForLayoutState(RecyclerView.y yVar, LinearLayoutManager.c cVar, RecyclerView.m.c cVar2) {
        boolean z10;
        int i6 = this.f2678b;
        for (int i10 = 0; i10 < this.f2678b; i10++) {
            int i11 = cVar.f2699d;
            if (i11 >= 0 && i11 < yVar.b()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && i6 > 0) {
                ((j.b) cVar2).a(cVar.f2699d, Math.max(0, cVar.f2701g));
                this.f2682g.getClass();
                i6--;
                cVar.f2699d += cVar.f2700e;
            } else {
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public final int computeHorizontalScrollOffset(RecyclerView.y yVar) {
        return super.computeHorizontalScrollOffset(yVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public final int computeHorizontalScrollRange(RecyclerView.y yVar) {
        return super.computeHorizontalScrollRange(yVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public final int computeVerticalScrollOffset(RecyclerView.y yVar) {
        return super.computeVerticalScrollOffset(yVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public final int computeVerticalScrollRange(RecyclerView.y yVar) {
        return super.computeVerticalScrollRange(yVar);
    }

    public final int d(int i6, RecyclerView.t tVar, RecyclerView.y yVar) {
        boolean z10 = yVar.f2817g;
        a aVar = this.f2682g;
        if (!z10) {
            int i10 = this.f2678b;
            aVar.getClass();
            return i6 % i10;
        }
        int i11 = this.f.get(i6, -1);
        if (i11 != -1) {
            return i11;
        }
        int b10 = tVar.b(i6);
        if (b10 == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i6);
            return 0;
        }
        int i12 = this.f2678b;
        aVar.getClass();
        return b10 % i12;
    }

    public final int e(int i6, RecyclerView.t tVar, RecyclerView.y yVar) {
        boolean z10 = yVar.f2817g;
        a aVar = this.f2682g;
        if (!z10) {
            aVar.getClass();
            return 1;
        }
        int i10 = this.f2681e.get(i6, -1);
        if (i10 != -1) {
            return i10;
        }
        if (tVar.b(i6) == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i6);
            return 1;
        }
        aVar.getClass();
        return 1;
    }

    public final void f(View view, int i6, boolean z10) {
        int i10;
        int i11;
        boolean shouldMeasureChild;
        b bVar = (b) view.getLayoutParams();
        Rect rect = bVar.f2787b;
        int i12 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) bVar).topMargin + ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
        int i13 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) bVar).leftMargin + ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
        int b10 = b(bVar.f2684e, bVar.f);
        if (this.mOrientation == 1) {
            i11 = RecyclerView.m.getChildMeasureSpec(b10, i6, i13, ((ViewGroup.MarginLayoutParams) bVar).width, false);
            i10 = RecyclerView.m.getChildMeasureSpec(this.mOrientationHelper.l(), getHeightMode(), i12, ((ViewGroup.MarginLayoutParams) bVar).height, true);
        } else {
            int childMeasureSpec = RecyclerView.m.getChildMeasureSpec(b10, i6, i12, ((ViewGroup.MarginLayoutParams) bVar).height, false);
            int childMeasureSpec2 = RecyclerView.m.getChildMeasureSpec(this.mOrientationHelper.l(), getWidthMode(), i13, ((ViewGroup.MarginLayoutParams) bVar).width, true);
            i10 = childMeasureSpec;
            i11 = childMeasureSpec2;
        }
        RecyclerView.n nVar = (RecyclerView.n) view.getLayoutParams();
        if (z10) {
            shouldMeasureChild = shouldReMeasureChild(view, i11, i10, nVar);
        } else {
            shouldMeasureChild = shouldMeasureChild(view, i11, i10, nVar);
        }
        if (shouldMeasureChild) {
            view.measure(i11, i10);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final View findReferenceChild(RecyclerView.t tVar, RecyclerView.y yVar, boolean z10, boolean z11) {
        int i6;
        int i10;
        int childCount = getChildCount();
        int i11 = 1;
        if (z11) {
            i10 = getChildCount() - 1;
            i6 = -1;
            i11 = -1;
        } else {
            i6 = childCount;
            i10 = 0;
        }
        int b10 = yVar.b();
        ensureLayoutState();
        int k10 = this.mOrientationHelper.k();
        int g5 = this.mOrientationHelper.g();
        View view = null;
        View view2 = null;
        while (i10 != i6) {
            View childAt = getChildAt(i10);
            int position = getPosition(childAt);
            if (position >= 0 && position < b10 && d(position, tVar, yVar) == 0) {
                if (((RecyclerView.n) childAt.getLayoutParams()).c()) {
                    if (view2 == null) {
                        view2 = childAt;
                    }
                } else if (this.mOrientationHelper.e(childAt) < g5 && this.mOrientationHelper.b(childAt) >= k10) {
                    return childAt;
                } else {
                    if (view == null) {
                        view = childAt;
                    }
                }
            }
            i10 += i11;
        }
        if (view == null) {
            return view2;
        }
        return view;
    }

    public final void g(int i6) {
        if (i6 == this.f2678b) {
            return;
        }
        this.f2677a = true;
        if (i6 >= 1) {
            this.f2678b = i6;
            this.f2682g.b();
            requestLayout();
            return;
        }
        throw new IllegalArgumentException(defpackage.c.p("Span count should be at least 1. Provided ", i6));
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public final RecyclerView.n generateDefaultLayoutParams() {
        if (this.mOrientation == 0) {
            return new b(-2, -1);
        }
        return new b(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final RecyclerView.n generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new b(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final int getColumnCountForAccessibility(RecyclerView.t tVar, RecyclerView.y yVar) {
        if (this.mOrientation == 1) {
            return this.f2678b;
        }
        if (yVar.b() < 1) {
            return 0;
        }
        return c(yVar.b() - 1, tVar, yVar) + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final int getRowCountForAccessibility(RecyclerView.t tVar, RecyclerView.y yVar) {
        if (this.mOrientation == 0) {
            return this.f2678b;
        }
        if (yVar.b() < 1) {
            return 0;
        }
        return c(yVar.b() - 1, tVar, yVar) + 1;
    }

    public final void h() {
        int height;
        int paddingTop;
        if (getOrientation() == 1) {
            height = getWidth() - getPaddingRight();
            paddingTop = getPaddingLeft();
        } else {
            height = getHeight() - getPaddingBottom();
            paddingTop = getPaddingTop();
        }
        a(height - paddingTop);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void layoutChunk(RecyclerView.t tVar, RecyclerView.y yVar, LinearLayoutManager.c cVar, LinearLayoutManager.b bVar) {
        boolean z10;
        int i6;
        boolean z11;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int d10;
        int childMeasureSpec;
        int i19;
        boolean z12;
        boolean z13;
        View b10;
        int j10 = this.mOrientationHelper.j();
        if (j10 != 1073741824) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (getChildCount() > 0) {
            i6 = this.f2679c[this.f2678b];
        } else {
            i6 = 0;
        }
        if (z10) {
            h();
        }
        if (cVar.f2700e == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        int i20 = this.f2678b;
        if (!z11) {
            i20 = d(cVar.f2699d, tVar, yVar) + e(cVar.f2699d, tVar, yVar);
        }
        int i21 = 0;
        while (i21 < this.f2678b) {
            int i22 = cVar.f2699d;
            if (i22 >= 0 && i22 < yVar.b()) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (!z13 || i20 <= 0) {
                break;
            }
            int i23 = cVar.f2699d;
            int e10 = e(i23, tVar, yVar);
            if (e10 <= this.f2678b) {
                i20 -= e10;
                if (i20 < 0 || (b10 = cVar.b(tVar)) == null) {
                    break;
                }
                this.f2680d[i21] = b10;
                i21++;
            } else {
                StringBuilder sb2 = new StringBuilder("Item at position ");
                sb2.append(i23);
                sb2.append(" requires ");
                sb2.append(e10);
                sb2.append(" spans but GridLayoutManager has only ");
                throw new IllegalArgumentException(pl.a.g(sb2, this.f2678b, " spans."));
            }
        }
        if (i21 == 0) {
            bVar.f2693b = true;
            return;
        }
        if (z11) {
            i10 = 0;
            i11 = i21;
            i12 = 0;
            i13 = 1;
        } else {
            i10 = i21 - 1;
            i11 = -1;
            i12 = 0;
            i13 = -1;
        }
        while (i10 != i11) {
            View view = this.f2680d[i10];
            b bVar2 = (b) view.getLayoutParams();
            int e11 = e(getPosition(view), tVar, yVar);
            bVar2.f = e11;
            bVar2.f2684e = i12;
            i12 += e11;
            i10 += i13;
        }
        float f = 0.0f;
        int i24 = 0;
        for (int i25 = 0; i25 < i21; i25++) {
            View view2 = this.f2680d[i25];
            if (cVar.f2705k == null) {
                if (z11) {
                    addView(view2);
                    z12 = false;
                } else {
                    z12 = false;
                    addView(view2, 0);
                }
            } else {
                z12 = false;
                if (z11) {
                    addDisappearingView(view2);
                } else {
                    addDisappearingView(view2, 0);
                }
            }
            calculateItemDecorationsForChild(view2, this.f2683h);
            f(view2, j10, z12);
            int c10 = this.mOrientationHelper.c(view2);
            if (c10 > i24) {
                i24 = c10;
            }
            float d11 = (this.mOrientationHelper.d(view2) * 1.0f) / ((b) view2.getLayoutParams()).f;
            if (d11 > f) {
                f = d11;
            }
        }
        if (z10) {
            a(Math.max(Math.round(f * this.f2678b), i6));
            i24 = 0;
            for (int i26 = 0; i26 < i21; i26++) {
                View view3 = this.f2680d[i26];
                f(view3, 1073741824, true);
                int c11 = this.mOrientationHelper.c(view3);
                if (c11 > i24) {
                    i24 = c11;
                }
            }
        }
        for (int i27 = 0; i27 < i21; i27++) {
            View view4 = this.f2680d[i27];
            if (this.mOrientationHelper.c(view4) != i24) {
                b bVar3 = (b) view4.getLayoutParams();
                Rect rect = bVar3.f2787b;
                int i28 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) bVar3).topMargin + ((ViewGroup.MarginLayoutParams) bVar3).bottomMargin;
                int i29 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) bVar3).leftMargin + ((ViewGroup.MarginLayoutParams) bVar3).rightMargin;
                int b11 = b(bVar3.f2684e, bVar3.f);
                if (this.mOrientation == 1) {
                    i19 = RecyclerView.m.getChildMeasureSpec(b11, 1073741824, i29, ((ViewGroup.MarginLayoutParams) bVar3).width, false);
                    childMeasureSpec = View.MeasureSpec.makeMeasureSpec(i24 - i28, 1073741824);
                } else {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i24 - i29, 1073741824);
                    childMeasureSpec = RecyclerView.m.getChildMeasureSpec(b11, 1073741824, i28, ((ViewGroup.MarginLayoutParams) bVar3).height, false);
                    i19 = makeMeasureSpec;
                }
                if (shouldReMeasureChild(view4, i19, childMeasureSpec, (RecyclerView.n) view4.getLayoutParams())) {
                    view4.measure(i19, childMeasureSpec);
                }
            }
        }
        bVar.f2692a = i24;
        if (this.mOrientation == 1) {
            if (cVar.f == -1) {
                i17 = cVar.f2697b;
                i16 = i17 - i24;
            } else {
                i16 = cVar.f2697b;
                i17 = i16 + i24;
            }
            i15 = 0;
            i14 = 0;
        } else {
            if (cVar.f == -1) {
                int i30 = cVar.f2697b;
                i15 = i30;
                i14 = i30 - i24;
            } else {
                int i31 = cVar.f2697b;
                i14 = i31;
                i15 = i24 + i31;
            }
            i16 = 0;
            i17 = 0;
        }
        int i32 = 0;
        while (i32 < i21) {
            View view5 = this.f2680d[i32];
            b bVar4 = (b) view5.getLayoutParams();
            if (this.mOrientation == 1) {
                if (isLayoutRTL()) {
                    i15 = getPaddingLeft() + this.f2679c[this.f2678b - bVar4.f2684e];
                    i14 = i15 - this.mOrientationHelper.d(view5);
                } else {
                    i14 = this.f2679c[bVar4.f2684e] + getPaddingLeft();
                    i15 = this.mOrientationHelper.d(view5) + i14;
                }
                d10 = i17;
                i18 = i16;
            } else {
                int paddingTop = getPaddingTop() + this.f2679c[bVar4.f2684e];
                i18 = paddingTop;
                d10 = this.mOrientationHelper.d(view5) + paddingTop;
            }
            int i33 = i15;
            int i34 = i14;
            layoutDecoratedWithMargins(view5, i34, i18, i33, d10);
            if (bVar4.c() || bVar4.b()) {
                bVar.f2694c = true;
            }
            bVar.f2695d |= view5.hasFocusable();
            i32++;
            i17 = d10;
            i16 = i18;
            i15 = i33;
            i14 = i34;
        }
        Arrays.fill(this.f2680d, (Object) null);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void onAnchorReady(RecyclerView.t tVar, RecyclerView.y yVar, LinearLayoutManager.a aVar, int i6) {
        boolean z10;
        super.onAnchorReady(tVar, yVar, aVar, i6);
        h();
        if (yVar.b() > 0 && !yVar.f2817g) {
            if (i6 == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            int d10 = d(aVar.f2688b, tVar, yVar);
            if (z10) {
                while (d10 > 0) {
                    int i10 = aVar.f2688b;
                    if (i10 <= 0) {
                        break;
                    }
                    int i11 = i10 - 1;
                    aVar.f2688b = i11;
                    d10 = d(i11, tVar, yVar);
                }
            } else {
                int b10 = yVar.b() - 1;
                int i12 = aVar.f2688b;
                while (i12 < b10) {
                    int i13 = i12 + 1;
                    int d11 = d(i13, tVar, yVar);
                    if (d11 <= d10) {
                        break;
                    }
                    i12 = i13;
                    d10 = d11;
                }
                aVar.f2688b = i12;
            }
        }
        View[] viewArr = this.f2680d;
        if (viewArr == null || viewArr.length != this.f2678b) {
            this.f2680d = new View[this.f2678b];
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00d6, code lost:
        if (r13 == r7) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00f6, code lost:
        if (r13 == r11) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0107  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View onFocusSearchFailed(View view, int i6, RecyclerView.t tVar, RecyclerView.y yVar) {
        boolean z10;
        boolean z11;
        int childCount;
        int i10;
        int i11;
        boolean z12;
        View view2;
        View view3;
        int i12;
        int i13;
        boolean z13;
        int i14;
        int i15;
        boolean z14;
        RecyclerView.t tVar2 = tVar;
        RecyclerView.y yVar2 = yVar;
        View findContainingItemView = findContainingItemView(view);
        View view4 = null;
        if (findContainingItemView == null) {
            return null;
        }
        b bVar = (b) findContainingItemView.getLayoutParams();
        int i16 = bVar.f2684e;
        int i17 = bVar.f + i16;
        if (super.onFocusSearchFailed(view, i6, tVar, yVar) == null) {
            return null;
        }
        if (convertFocusDirectionToLayoutDirection(i6) == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 != this.mShouldReverseLayout) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            i10 = getChildCount() - 1;
            childCount = -1;
            i11 = -1;
        } else {
            childCount = getChildCount();
            i10 = 0;
            i11 = 1;
        }
        if (this.mOrientation == 1 && isLayoutRTL()) {
            z12 = true;
        } else {
            z12 = false;
        }
        int c10 = c(i10, tVar2, yVar2);
        int i18 = i10;
        int i19 = 0;
        int i20 = -1;
        int i21 = -1;
        int i22 = 0;
        View view5 = null;
        while (i18 != childCount) {
            int c11 = c(i18, tVar2, yVar2);
            View childAt = getChildAt(i18);
            if (childAt == findContainingItemView) {
                break;
            }
            if (childAt.hasFocusable() && c11 != c10) {
                if (view4 != null) {
                    break;
                }
                view2 = findContainingItemView;
                view3 = view5;
                i12 = i19;
                i13 = childCount;
                i15 = i21;
                i14 = i22;
            } else {
                b bVar2 = (b) childAt.getLayoutParams();
                int i23 = bVar2.f2684e;
                view2 = findContainingItemView;
                int i24 = bVar2.f + i23;
                if (childAt.hasFocusable() && i23 == i16 && i24 == i17) {
                    return childAt;
                }
                if ((childAt.hasFocusable() && view4 == null) || (!childAt.hasFocusable() && view5 == null)) {
                    view3 = view5;
                } else {
                    view3 = view5;
                    int min = Math.min(i24, i17) - Math.max(i23, i16);
                    if (childAt.hasFocusable()) {
                        if (min <= i19) {
                            if (min == i19) {
                                if (i23 > i20) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                            }
                        }
                    } else if (view4 == null) {
                        i12 = i19;
                        i13 = childCount;
                        z13 = true;
                        if (isViewPartiallyVisible(childAt, false, true)) {
                            i14 = i22;
                            if (min > i14) {
                                i15 = i21;
                                if (z13) {
                                    if (childAt.hasFocusable()) {
                                        i20 = bVar2.f2684e;
                                        i21 = i15;
                                        i22 = i14;
                                        view5 = view3;
                                        view4 = childAt;
                                        i19 = Math.min(i24, i17) - Math.max(i23, i16);
                                    } else {
                                        int i25 = bVar2.f2684e;
                                        i22 = Math.min(i24, i17) - Math.max(i23, i16);
                                        i21 = i25;
                                        i19 = i12;
                                        view5 = childAt;
                                    }
                                    i18 += i11;
                                    tVar2 = tVar;
                                    yVar2 = yVar;
                                    findContainingItemView = view2;
                                    childCount = i13;
                                }
                            } else {
                                if (min == i14) {
                                    i15 = i21;
                                    if (i23 <= i15) {
                                        z13 = false;
                                    }
                                } else {
                                    i15 = i21;
                                }
                                z13 = false;
                                if (z13) {
                                }
                            }
                        }
                        i15 = i21;
                        i14 = i22;
                        z13 = false;
                        if (z13) {
                        }
                    }
                    i12 = i19;
                    i13 = childCount;
                    i15 = i21;
                    i14 = i22;
                    z13 = false;
                    if (z13) {
                    }
                }
                i12 = i19;
                i13 = childCount;
                i15 = i21;
                i14 = i22;
                z13 = true;
                if (z13) {
                }
            }
            i21 = i15;
            i22 = i14;
            i19 = i12;
            view5 = view3;
            i18 += i11;
            tVar2 = tVar;
            yVar2 = yVar;
            findContainingItemView = view2;
            childCount = i13;
        }
        View view6 = view5;
        if (view4 == null) {
            return view6;
        }
        return view4;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void onInitializeAccessibilityNodeInfo(RecyclerView.t tVar, RecyclerView.y yVar, u0.h hVar) {
        super.onInitializeAccessibilityNodeInfo(tVar, yVar, hVar);
        hVar.g(GridView.class.getName());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void onInitializeAccessibilityNodeInfoForItem(RecyclerView.t tVar, RecyclerView.y yVar, View view, u0.h hVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof b)) {
            super.onInitializeAccessibilityNodeInfoForItem(view, hVar);
            return;
        }
        b bVar = (b) layoutParams;
        int c10 = c(bVar.a(), tVar, yVar);
        if (this.mOrientation == 0) {
            hVar.h(h.c.a(bVar.f2684e, bVar.f, c10, 1, false, false));
        } else {
            hVar.h(h.c.a(c10, 1, bVar.f2684e, bVar.f, false, false));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void onItemsAdded(RecyclerView recyclerView, int i6, int i10) {
        a aVar = this.f2682g;
        aVar.b();
        aVar.f2686b.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void onItemsChanged(RecyclerView recyclerView) {
        a aVar = this.f2682g;
        aVar.b();
        aVar.f2686b.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void onItemsMoved(RecyclerView recyclerView, int i6, int i10, int i11) {
        a aVar = this.f2682g;
        aVar.b();
        aVar.f2686b.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void onItemsRemoved(RecyclerView recyclerView, int i6, int i10) {
        a aVar = this.f2682g;
        aVar.b();
        aVar.f2686b.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void onItemsUpdated(RecyclerView recyclerView, int i6, int i10, Object obj) {
        a aVar = this.f2682g;
        aVar.b();
        aVar.f2686b.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public final void onLayoutChildren(RecyclerView.t tVar, RecyclerView.y yVar) {
        boolean z10 = yVar.f2817g;
        SparseIntArray sparseIntArray = this.f;
        SparseIntArray sparseIntArray2 = this.f2681e;
        if (z10) {
            int childCount = getChildCount();
            for (int i6 = 0; i6 < childCount; i6++) {
                b bVar = (b) getChildAt(i6).getLayoutParams();
                int a10 = bVar.a();
                sparseIntArray2.put(a10, bVar.f);
                sparseIntArray.put(a10, bVar.f2684e);
            }
        }
        super.onLayoutChildren(tVar, yVar);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public final void onLayoutCompleted(RecyclerView.y yVar) {
        super.onLayoutCompleted(yVar);
        this.f2677a = false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public final int scrollHorizontallyBy(int i6, RecyclerView.t tVar, RecyclerView.y yVar) {
        h();
        View[] viewArr = this.f2680d;
        if (viewArr == null || viewArr.length != this.f2678b) {
            this.f2680d = new View[this.f2678b];
        }
        return super.scrollHorizontallyBy(i6, tVar, yVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public final int scrollVerticallyBy(int i6, RecyclerView.t tVar, RecyclerView.y yVar) {
        h();
        View[] viewArr = this.f2680d;
        if (viewArr == null || viewArr.length != this.f2678b) {
            this.f2680d = new View[this.f2678b];
        }
        return super.scrollVerticallyBy(i6, tVar, yVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void setMeasuredDimension(Rect rect, int i6, int i10) {
        int chooseSize;
        int chooseSize2;
        if (this.f2679c == null) {
            super.setMeasuredDimension(rect, i6, i10);
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (this.mOrientation == 1) {
            chooseSize2 = RecyclerView.m.chooseSize(i10, rect.height() + paddingBottom, getMinimumHeight());
            int[] iArr = this.f2679c;
            chooseSize = RecyclerView.m.chooseSize(i6, iArr[iArr.length - 1] + paddingRight, getMinimumWidth());
        } else {
            chooseSize = RecyclerView.m.chooseSize(i6, rect.width() + paddingRight, getMinimumWidth());
            int[] iArr2 = this.f2679c;
            chooseSize2 = RecyclerView.m.chooseSize(i10, iArr2[iArr2.length - 1] + paddingBottom, getMinimumHeight());
        }
        setMeasuredDimension(chooseSize, chooseSize2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void setStackFromEnd(boolean z10) {
        if (!z10) {
            super.setStackFromEnd(false);
            return;
        }
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public final boolean supportsPredictiveItemAnimations() {
        if (this.mPendingSavedState == null && !this.f2677a) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final RecyclerView.n generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new b((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new b(layoutParams);
    }

    /* loaded from: classes.dex */
    public static class b extends RecyclerView.n {

        /* renamed from: e  reason: collision with root package name */
        public int f2684e;
        public int f;

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f2684e = -1;
            this.f = 0;
        }

        public b(int i6, int i10) {
            super(i6, i10);
            this.f2684e = -1;
            this.f = 0;
        }

        public b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f2684e = -1;
            this.f = 0;
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f2684e = -1;
            this.f = 0;
        }
    }

    public GridLayoutManager(Context context, int i6) {
        super(context);
        this.f2677a = false;
        this.f2678b = -1;
        this.f2681e = new SparseIntArray();
        this.f = new SparseIntArray();
        this.f2682g = new a();
        this.f2683h = new Rect();
        g(i6);
    }

    public GridLayoutManager(Context context, int i6, int i10) {
        super(context, 1, false);
        this.f2677a = false;
        this.f2678b = -1;
        this.f2681e = new SparseIntArray();
        this.f = new SparseIntArray();
        this.f2682g = new a();
        this.f2683h = new Rect();
        g(i6);
    }
}
