package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.j;
import androidx.recyclerview.widget.k;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.util.List;
/* loaded from: classes.dex */
public class LinearLayoutManager extends RecyclerView.m implements k.g, RecyclerView.x.b {
    static final boolean DEBUG = false;
    public static final int HORIZONTAL = 0;
    public static final int INVALID_OFFSET = Integer.MIN_VALUE;
    private static final float MAX_SCROLL_FACTOR = 0.33333334f;
    private static final String TAG = "LinearLayoutManager";
    public static final int VERTICAL = 1;
    final a mAnchorInfo;
    private int mInitialPrefetchItemCount;
    private boolean mLastStackFromEnd;
    private final b mLayoutChunkResult;
    private c mLayoutState;
    int mOrientation;
    v mOrientationHelper;
    d mPendingSavedState;
    int mPendingScrollPosition;
    int mPendingScrollPositionOffset;
    private boolean mRecycleChildrenOnDetach;
    private int[] mReusableIntPair;
    private boolean mReverseLayout;
    boolean mShouldReverseLayout;
    private boolean mSmoothScrollbarEnabled;
    private boolean mStackFromEnd;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public v f2687a;

        /* renamed from: b  reason: collision with root package name */
        public int f2688b;

        /* renamed from: c  reason: collision with root package name */
        public int f2689c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f2690d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f2691e;

        public a() {
            d();
        }

        public final void a() {
            int k10;
            if (this.f2690d) {
                k10 = this.f2687a.g();
            } else {
                k10 = this.f2687a.k();
            }
            this.f2689c = k10;
        }

        public final void b(int i6, View view) {
            int l2;
            if (this.f2690d) {
                int b10 = this.f2687a.b(view);
                v vVar = this.f2687a;
                if (Integer.MIN_VALUE == vVar.f3056b) {
                    l2 = 0;
                } else {
                    l2 = vVar.l() - vVar.f3056b;
                }
                this.f2689c = l2 + b10;
            } else {
                this.f2689c = this.f2687a.e(view);
            }
            this.f2688b = i6;
        }

        public final void c(int i6, View view) {
            int l2;
            v vVar = this.f2687a;
            if (Integer.MIN_VALUE == vVar.f3056b) {
                l2 = 0;
            } else {
                l2 = vVar.l() - vVar.f3056b;
            }
            if (l2 >= 0) {
                b(i6, view);
                return;
            }
            this.f2688b = i6;
            if (this.f2690d) {
                int g5 = (this.f2687a.g() - l2) - this.f2687a.b(view);
                this.f2689c = this.f2687a.g() - g5;
                if (g5 > 0) {
                    int c10 = this.f2689c - this.f2687a.c(view);
                    int k10 = this.f2687a.k();
                    int min = c10 - (Math.min(this.f2687a.e(view) - k10, 0) + k10);
                    if (min < 0) {
                        this.f2689c = Math.min(g5, -min) + this.f2689c;
                        return;
                    }
                    return;
                }
                return;
            }
            int e10 = this.f2687a.e(view);
            int k11 = e10 - this.f2687a.k();
            this.f2689c = e10;
            if (k11 > 0) {
                int g10 = (this.f2687a.g() - Math.min(0, (this.f2687a.g() - l2) - this.f2687a.b(view))) - (this.f2687a.c(view) + e10);
                if (g10 < 0) {
                    this.f2689c -= Math.min(k11, -g10);
                }
            }
        }

        public final void d() {
            this.f2688b = -1;
            this.f2689c = LinearLayoutManager.INVALID_OFFSET;
            this.f2690d = false;
            this.f2691e = false;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("AnchorInfo{mPosition=");
            sb2.append(this.f2688b);
            sb2.append(", mCoordinate=");
            sb2.append(this.f2689c);
            sb2.append(", mLayoutFromEnd=");
            sb2.append(this.f2690d);
            sb2.append(", mValid=");
            return defpackage.c.t(sb2, this.f2691e, '}');
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public int f2692a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f2693b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f2694c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f2695d;
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: b  reason: collision with root package name */
        public int f2697b;

        /* renamed from: c  reason: collision with root package name */
        public int f2698c;

        /* renamed from: d  reason: collision with root package name */
        public int f2699d;

        /* renamed from: e  reason: collision with root package name */
        public int f2700e;
        public int f;

        /* renamed from: g  reason: collision with root package name */
        public int f2701g;

        /* renamed from: j  reason: collision with root package name */
        public int f2704j;

        /* renamed from: l  reason: collision with root package name */
        public boolean f2706l;

        /* renamed from: a  reason: collision with root package name */
        public boolean f2696a = true;

        /* renamed from: h  reason: collision with root package name */
        public int f2702h = 0;

        /* renamed from: i  reason: collision with root package name */
        public int f2703i = 0;

        /* renamed from: k  reason: collision with root package name */
        public List<RecyclerView.c0> f2705k = null;

        public final void a(View view) {
            int a10;
            int size = this.f2705k.size();
            View view2 = null;
            int i6 = SubsamplingScaleImageView.TILE_SIZE_AUTO;
            for (int i10 = 0; i10 < size; i10++) {
                View view3 = this.f2705k.get(i10).f2751a;
                RecyclerView.n nVar = (RecyclerView.n) view3.getLayoutParams();
                if (view3 != view && !nVar.c() && (a10 = (nVar.a() - this.f2699d) * this.f2700e) >= 0 && a10 < i6) {
                    view2 = view3;
                    if (a10 == 0) {
                        break;
                    }
                    i6 = a10;
                }
            }
            if (view2 == null) {
                this.f2699d = -1;
            } else {
                this.f2699d = ((RecyclerView.n) view2.getLayoutParams()).a();
            }
        }

        public final View b(RecyclerView.t tVar) {
            List<RecyclerView.c0> list = this.f2705k;
            if (list != null) {
                int size = list.size();
                for (int i6 = 0; i6 < size; i6++) {
                    View view = this.f2705k.get(i6).f2751a;
                    RecyclerView.n nVar = (RecyclerView.n) view.getLayoutParams();
                    if (!nVar.c() && this.f2699d == nVar.a()) {
                        a(view);
                        return view;
                    }
                }
                return null;
            }
            View view2 = tVar.k(this.f2699d, Long.MAX_VALUE).f2751a;
            this.f2699d += this.f2700e;
            return view2;
        }
    }

    /* loaded from: classes.dex */
    public static class d implements Parcelable {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: u  reason: collision with root package name */
        public int f2707u;

        /* renamed from: v  reason: collision with root package name */
        public int f2708v;

        /* renamed from: w  reason: collision with root package name */
        public boolean f2709w;

        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator<d> {
            @Override // android.os.Parcelable.Creator
            public final d createFromParcel(Parcel parcel) {
                return new d(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final d[] newArray(int i6) {
                return new d[i6];
            }
        }

        public d() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i6) {
            parcel.writeInt(this.f2707u);
            parcel.writeInt(this.f2708v);
            parcel.writeInt(this.f2709w ? 1 : 0);
        }

        public d(Parcel parcel) {
            this.f2707u = parcel.readInt();
            this.f2708v = parcel.readInt();
            this.f2709w = parcel.readInt() == 1;
        }

        public d(d dVar) {
            this.f2707u = dVar.f2707u;
            this.f2708v = dVar.f2708v;
            this.f2709w = dVar.f2709w;
        }
    }

    public LinearLayoutManager(Context context) {
        this(context, 1, false);
    }

    private int computeScrollExtent(RecyclerView.y yVar) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return a0.a(yVar, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled);
    }

    private int computeScrollOffset(RecyclerView.y yVar) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return a0.b(yVar, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled, this.mShouldReverseLayout);
    }

    private int computeScrollRange(RecyclerView.y yVar) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return a0.c(yVar, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled);
    }

    private View findFirstPartiallyOrCompletelyInvisibleChild() {
        return findOnePartiallyOrCompletelyInvisibleChild(0, getChildCount());
    }

    private View findLastPartiallyOrCompletelyInvisibleChild() {
        return findOnePartiallyOrCompletelyInvisibleChild(getChildCount() - 1, -1);
    }

    private View findPartiallyOrCompletelyInvisibleChildClosestToEnd() {
        if (this.mShouldReverseLayout) {
            return findFirstPartiallyOrCompletelyInvisibleChild();
        }
        return findLastPartiallyOrCompletelyInvisibleChild();
    }

    private View findPartiallyOrCompletelyInvisibleChildClosestToStart() {
        if (this.mShouldReverseLayout) {
            return findLastPartiallyOrCompletelyInvisibleChild();
        }
        return findFirstPartiallyOrCompletelyInvisibleChild();
    }

    private int fixLayoutEndGap(int i6, RecyclerView.t tVar, RecyclerView.y yVar, boolean z10) {
        int g5;
        int g10 = this.mOrientationHelper.g() - i6;
        if (g10 > 0) {
            int i10 = -scrollBy(-g10, tVar, yVar);
            int i11 = i6 + i10;
            if (z10 && (g5 = this.mOrientationHelper.g() - i11) > 0) {
                this.mOrientationHelper.o(g5);
                return g5 + i10;
            }
            return i10;
        }
        return 0;
    }

    private int fixLayoutStartGap(int i6, RecyclerView.t tVar, RecyclerView.y yVar, boolean z10) {
        int k10;
        int k11 = i6 - this.mOrientationHelper.k();
        if (k11 > 0) {
            int i10 = -scrollBy(k11, tVar, yVar);
            int i11 = i6 + i10;
            if (z10 && (k10 = i11 - this.mOrientationHelper.k()) > 0) {
                this.mOrientationHelper.o(-k10);
                return i10 - k10;
            }
            return i10;
        }
        return 0;
    }

    private View getChildClosestToEnd() {
        int childCount;
        if (this.mShouldReverseLayout) {
            childCount = 0;
        } else {
            childCount = getChildCount() - 1;
        }
        return getChildAt(childCount);
    }

    private View getChildClosestToStart() {
        int i6;
        if (this.mShouldReverseLayout) {
            i6 = getChildCount() - 1;
        } else {
            i6 = 0;
        }
        return getChildAt(i6);
    }

    private void layoutForPredictiveAnimations(RecyclerView.t tVar, RecyclerView.y yVar, int i6, int i10) {
        boolean z10;
        if (yVar.f2821k && getChildCount() != 0 && !yVar.f2817g && supportsPredictiveItemAnimations()) {
            List<RecyclerView.c0> list = tVar.f2800d;
            int size = list.size();
            int position = getPosition(getChildAt(0));
            int i11 = 0;
            int i12 = 0;
            for (int i13 = 0; i13 < size; i13++) {
                RecyclerView.c0 c0Var = list.get(i13);
                if (!c0Var.n()) {
                    char c10 = 1;
                    if (c0Var.h() < position) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10 != this.mShouldReverseLayout) {
                        c10 = 65535;
                    }
                    View view = c0Var.f2751a;
                    if (c10 == 65535) {
                        i11 += this.mOrientationHelper.c(view);
                    } else {
                        i12 += this.mOrientationHelper.c(view);
                    }
                }
            }
            this.mLayoutState.f2705k = list;
            if (i11 > 0) {
                updateLayoutStateToFillStart(getPosition(getChildClosestToStart()), i6);
                c cVar = this.mLayoutState;
                cVar.f2702h = i11;
                cVar.f2698c = 0;
                cVar.a(null);
                fill(tVar, this.mLayoutState, yVar, false);
            }
            if (i12 > 0) {
                updateLayoutStateToFillEnd(getPosition(getChildClosestToEnd()), i10);
                c cVar2 = this.mLayoutState;
                cVar2.f2702h = i12;
                cVar2.f2698c = 0;
                cVar2.a(null);
                fill(tVar, this.mLayoutState, yVar, false);
            }
            this.mLayoutState.f2705k = null;
        }
    }

    private void logChildren() {
        Log.d(TAG, "internal representation of views on the screen");
        for (int i6 = 0; i6 < getChildCount(); i6++) {
            View childAt = getChildAt(i6);
            Log.d(TAG, "item " + getPosition(childAt) + ", coord:" + this.mOrientationHelper.e(childAt));
        }
        Log.d(TAG, "==============");
    }

    private void recycleByLayoutState(RecyclerView.t tVar, c cVar) {
        if (cVar.f2696a && !cVar.f2706l) {
            int i6 = cVar.f2701g;
            int i10 = cVar.f2703i;
            if (cVar.f == -1) {
                recycleViewsFromEnd(tVar, i6, i10);
            } else {
                recycleViewsFromStart(tVar, i6, i10);
            }
        }
    }

    private void recycleChildren(RecyclerView.t tVar, int i6, int i10) {
        if (i6 == i10) {
            return;
        }
        if (i10 > i6) {
            for (int i11 = i10 - 1; i11 >= i6; i11--) {
                removeAndRecycleViewAt(i11, tVar);
            }
            return;
        }
        while (i6 > i10) {
            removeAndRecycleViewAt(i6, tVar);
            i6--;
        }
    }

    private void recycleViewsFromEnd(RecyclerView.t tVar, int i6, int i10) {
        int childCount = getChildCount();
        if (i6 < 0) {
            return;
        }
        int f = (this.mOrientationHelper.f() - i6) + i10;
        if (this.mShouldReverseLayout) {
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                if (this.mOrientationHelper.e(childAt) < f || this.mOrientationHelper.n(childAt) < f) {
                    recycleChildren(tVar, 0, i11);
                    return;
                }
            }
            return;
        }
        int i12 = childCount - 1;
        for (int i13 = i12; i13 >= 0; i13--) {
            View childAt2 = getChildAt(i13);
            if (this.mOrientationHelper.e(childAt2) < f || this.mOrientationHelper.n(childAt2) < f) {
                recycleChildren(tVar, i12, i13);
                return;
            }
        }
    }

    private void recycleViewsFromStart(RecyclerView.t tVar, int i6, int i10) {
        if (i6 < 0) {
            return;
        }
        int i11 = i6 - i10;
        int childCount = getChildCount();
        if (this.mShouldReverseLayout) {
            int i12 = childCount - 1;
            for (int i13 = i12; i13 >= 0; i13--) {
                View childAt = getChildAt(i13);
                if (this.mOrientationHelper.b(childAt) > i11 || this.mOrientationHelper.m(childAt) > i11) {
                    recycleChildren(tVar, i12, i13);
                    return;
                }
            }
            return;
        }
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt2 = getChildAt(i14);
            if (this.mOrientationHelper.b(childAt2) > i11 || this.mOrientationHelper.m(childAt2) > i11) {
                recycleChildren(tVar, 0, i14);
                return;
            }
        }
    }

    private void resolveShouldLayoutReverse() {
        if (this.mOrientation != 1 && isLayoutRTL()) {
            this.mShouldReverseLayout = !this.mReverseLayout;
        } else {
            this.mShouldReverseLayout = this.mReverseLayout;
        }
    }

    private boolean updateAnchorFromChildren(RecyclerView.t tVar, RecyclerView.y yVar, a aVar) {
        View findReferenceChild;
        boolean z10;
        boolean z11;
        boolean z12 = false;
        if (getChildCount() == 0) {
            return false;
        }
        View focusedChild = getFocusedChild();
        if (focusedChild != null) {
            aVar.getClass();
            RecyclerView.n nVar = (RecyclerView.n) focusedChild.getLayoutParams();
            if (!nVar.c() && nVar.a() >= 0 && nVar.a() < yVar.b()) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                aVar.c(getPosition(focusedChild), focusedChild);
                return true;
            }
        }
        boolean z13 = this.mLastStackFromEnd;
        boolean z14 = this.mStackFromEnd;
        if (z13 != z14 || (findReferenceChild = findReferenceChild(tVar, yVar, aVar.f2690d, z14)) == null) {
            return false;
        }
        aVar.b(getPosition(findReferenceChild), findReferenceChild);
        if (!yVar.f2817g && supportsPredictiveItemAnimations()) {
            int e10 = this.mOrientationHelper.e(findReferenceChild);
            int b10 = this.mOrientationHelper.b(findReferenceChild);
            int k10 = this.mOrientationHelper.k();
            int g5 = this.mOrientationHelper.g();
            if (b10 <= k10 && e10 < k10) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (e10 >= g5 && b10 > g5) {
                z12 = true;
            }
            if (z10 || z12) {
                if (aVar.f2690d) {
                    k10 = g5;
                }
                aVar.f2689c = k10;
            }
        }
        return true;
    }

    private boolean updateAnchorFromPendingData(RecyclerView.y yVar, a aVar) {
        int i6;
        boolean z10;
        int e10;
        boolean z11;
        boolean z12 = false;
        int i10 = 0;
        if (!yVar.f2817g && (i6 = this.mPendingScrollPosition) != -1) {
            if (i6 >= 0 && i6 < yVar.b()) {
                int i11 = this.mPendingScrollPosition;
                aVar.f2688b = i11;
                d dVar = this.mPendingSavedState;
                if (dVar != null) {
                    if (dVar.f2707u >= 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        boolean z13 = dVar.f2709w;
                        aVar.f2690d = z13;
                        if (z13) {
                            aVar.f2689c = this.mOrientationHelper.g() - this.mPendingSavedState.f2708v;
                        } else {
                            aVar.f2689c = this.mOrientationHelper.k() + this.mPendingSavedState.f2708v;
                        }
                        return true;
                    }
                }
                if (this.mPendingScrollPositionOffset == Integer.MIN_VALUE) {
                    View findViewByPosition = findViewByPosition(i11);
                    if (findViewByPosition != null) {
                        if (this.mOrientationHelper.c(findViewByPosition) > this.mOrientationHelper.l()) {
                            aVar.a();
                            return true;
                        } else if (this.mOrientationHelper.e(findViewByPosition) - this.mOrientationHelper.k() < 0) {
                            aVar.f2689c = this.mOrientationHelper.k();
                            aVar.f2690d = false;
                            return true;
                        } else if (this.mOrientationHelper.g() - this.mOrientationHelper.b(findViewByPosition) < 0) {
                            aVar.f2689c = this.mOrientationHelper.g();
                            aVar.f2690d = true;
                            return true;
                        } else {
                            if (aVar.f2690d) {
                                int b10 = this.mOrientationHelper.b(findViewByPosition);
                                v vVar = this.mOrientationHelper;
                                if (Integer.MIN_VALUE != vVar.f3056b) {
                                    i10 = vVar.l() - vVar.f3056b;
                                }
                                e10 = i10 + b10;
                            } else {
                                e10 = this.mOrientationHelper.e(findViewByPosition);
                            }
                            aVar.f2689c = e10;
                        }
                    } else {
                        if (getChildCount() > 0) {
                            if (this.mPendingScrollPosition < getPosition(getChildAt(0))) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10 == this.mShouldReverseLayout) {
                                z12 = true;
                            }
                            aVar.f2690d = z12;
                        }
                        aVar.a();
                    }
                    return true;
                }
                boolean z14 = this.mShouldReverseLayout;
                aVar.f2690d = z14;
                if (z14) {
                    aVar.f2689c = this.mOrientationHelper.g() - this.mPendingScrollPositionOffset;
                } else {
                    aVar.f2689c = this.mOrientationHelper.k() + this.mPendingScrollPositionOffset;
                }
                return true;
            }
            this.mPendingScrollPosition = -1;
            this.mPendingScrollPositionOffset = INVALID_OFFSET;
        }
        return false;
    }

    private void updateAnchorInfoForLayout(RecyclerView.t tVar, RecyclerView.y yVar, a aVar) {
        int i6;
        if (updateAnchorFromPendingData(yVar, aVar) || updateAnchorFromChildren(tVar, yVar, aVar)) {
            return;
        }
        aVar.a();
        if (this.mStackFromEnd) {
            i6 = yVar.b() - 1;
        } else {
            i6 = 0;
        }
        aVar.f2688b = i6;
    }

    private void updateLayoutState(int i6, int i10, boolean z10, RecyclerView.y yVar) {
        int i11;
        int k10;
        this.mLayoutState.f2706l = resolveIsInfinite();
        this.mLayoutState.f = i6;
        int[] iArr = this.mReusableIntPair;
        boolean z11 = false;
        iArr[0] = 0;
        int i12 = 1;
        iArr[1] = 0;
        calculateExtraLayoutSpace(yVar, iArr);
        int max = Math.max(0, this.mReusableIntPair[0]);
        int max2 = Math.max(0, this.mReusableIntPair[1]);
        if (i6 == 1) {
            z11 = true;
        }
        c cVar = this.mLayoutState;
        if (z11) {
            i11 = max2;
        } else {
            i11 = max;
        }
        cVar.f2702h = i11;
        if (!z11) {
            max = max2;
        }
        cVar.f2703i = max;
        if (z11) {
            cVar.f2702h = this.mOrientationHelper.h() + i11;
            View childClosestToEnd = getChildClosestToEnd();
            c cVar2 = this.mLayoutState;
            if (this.mShouldReverseLayout) {
                i12 = -1;
            }
            cVar2.f2700e = i12;
            int position = getPosition(childClosestToEnd);
            c cVar3 = this.mLayoutState;
            cVar2.f2699d = position + cVar3.f2700e;
            cVar3.f2697b = this.mOrientationHelper.b(childClosestToEnd);
            k10 = this.mOrientationHelper.b(childClosestToEnd) - this.mOrientationHelper.g();
        } else {
            View childClosestToStart = getChildClosestToStart();
            c cVar4 = this.mLayoutState;
            cVar4.f2702h = this.mOrientationHelper.k() + cVar4.f2702h;
            c cVar5 = this.mLayoutState;
            if (!this.mShouldReverseLayout) {
                i12 = -1;
            }
            cVar5.f2700e = i12;
            int position2 = getPosition(childClosestToStart);
            c cVar6 = this.mLayoutState;
            cVar5.f2699d = position2 + cVar6.f2700e;
            cVar6.f2697b = this.mOrientationHelper.e(childClosestToStart);
            k10 = (-this.mOrientationHelper.e(childClosestToStart)) + this.mOrientationHelper.k();
        }
        c cVar7 = this.mLayoutState;
        cVar7.f2698c = i10;
        if (z10) {
            cVar7.f2698c = i10 - k10;
        }
        cVar7.f2701g = k10;
    }

    private void updateLayoutStateToFillEnd(a aVar) {
        updateLayoutStateToFillEnd(aVar.f2688b, aVar.f2689c);
    }

    private void updateLayoutStateToFillStart(a aVar) {
        updateLayoutStateToFillStart(aVar.f2688b, aVar.f2689c);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void assertNotInLayoutOrScroll(String str) {
        if (this.mPendingSavedState == null) {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    public void calculateExtraLayoutSpace(RecyclerView.y yVar, int[] iArr) {
        int i6;
        int extraLayoutSpace = getExtraLayoutSpace(yVar);
        if (this.mLayoutState.f == -1) {
            i6 = 0;
        } else {
            i6 = extraLayoutSpace;
            extraLayoutSpace = 0;
        }
        iArr[0] = extraLayoutSpace;
        iArr[1] = i6;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean canScrollHorizontally() {
        if (this.mOrientation == 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean canScrollVertically() {
        if (this.mOrientation == 1) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void collectAdjacentPrefetchPositions(int i6, int i10, RecyclerView.y yVar, RecyclerView.m.c cVar) {
        int i11;
        if (this.mOrientation != 0) {
            i6 = i10;
        }
        if (getChildCount() != 0 && i6 != 0) {
            ensureLayoutState();
            if (i6 > 0) {
                i11 = 1;
            } else {
                i11 = -1;
            }
            updateLayoutState(i11, Math.abs(i6), true, yVar);
            collectPrefetchPositionsForLayoutState(yVar, this.mLayoutState, cVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0024  */
    @Override // androidx.recyclerview.widget.RecyclerView.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void collectInitialPrefetchPositions(int i6, RecyclerView.m.c cVar) {
        boolean z10;
        int i10;
        int i11;
        boolean z11;
        d dVar = this.mPendingSavedState;
        int i12 = 1;
        if (dVar != null) {
            i10 = dVar.f2707u;
            if (i10 >= 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                z10 = dVar.f2709w;
                if (z10) {
                    i12 = -1;
                }
                for (i11 = 0; i11 < this.mInitialPrefetchItemCount && i10 >= 0 && i10 < i6; i11++) {
                    ((j.b) cVar).a(i10, 0);
                    i10 += i12;
                }
                return;
            }
        }
        resolveShouldLayoutReverse();
        z10 = this.mShouldReverseLayout;
        i10 = this.mPendingScrollPosition;
        if (i10 == -1) {
            i10 = z10 ? i6 - 1 : 0;
        }
        if (z10) {
        }
        while (i11 < this.mInitialPrefetchItemCount) {
            ((j.b) cVar).a(i10, 0);
            i10 += i12;
        }
    }

    public void collectPrefetchPositionsForLayoutState(RecyclerView.y yVar, c cVar, RecyclerView.m.c cVar2) {
        int i6 = cVar.f2699d;
        if (i6 >= 0 && i6 < yVar.b()) {
            ((j.b) cVar2).a(i6, Math.max(0, cVar.f2701g));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public int computeHorizontalScrollExtent(RecyclerView.y yVar) {
        return computeScrollExtent(yVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public int computeHorizontalScrollOffset(RecyclerView.y yVar) {
        return computeScrollOffset(yVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public int computeHorizontalScrollRange(RecyclerView.y yVar) {
        return computeScrollRange(yVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.x.b
    public PointF computeScrollVectorForPosition(int i6) {
        if (getChildCount() == 0) {
            return null;
        }
        boolean z10 = false;
        int i10 = 1;
        if (i6 < getPosition(getChildAt(0))) {
            z10 = true;
        }
        if (z10 != this.mShouldReverseLayout) {
            i10 = -1;
        }
        if (this.mOrientation == 0) {
            return new PointF(i10, 0.0f);
        }
        return new PointF(0.0f, i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public int computeVerticalScrollExtent(RecyclerView.y yVar) {
        return computeScrollExtent(yVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public int computeVerticalScrollOffset(RecyclerView.y yVar) {
        return computeScrollOffset(yVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public int computeVerticalScrollRange(RecyclerView.y yVar) {
        return computeScrollRange(yVar);
    }

    public int convertFocusDirectionToLayoutDirection(int i6) {
        if (i6 != 1) {
            if (i6 != 2) {
                if (i6 != 17) {
                    if (i6 != 33) {
                        if (i6 != 66) {
                            if (i6 != 130) {
                                return INVALID_OFFSET;
                            }
                            if (this.mOrientation == 1) {
                                return 1;
                            }
                            return INVALID_OFFSET;
                        } else if (this.mOrientation == 0) {
                            return 1;
                        } else {
                            return INVALID_OFFSET;
                        }
                    } else if (this.mOrientation == 1) {
                        return -1;
                    } else {
                        return INVALID_OFFSET;
                    }
                } else if (this.mOrientation == 0) {
                    return -1;
                } else {
                    return INVALID_OFFSET;
                }
            } else if (this.mOrientation != 1 && isLayoutRTL()) {
                return -1;
            } else {
                return 1;
            }
        } else if (this.mOrientation == 1 || !isLayoutRTL()) {
            return -1;
        } else {
            return 1;
        }
    }

    public c createLayoutState() {
        return new c();
    }

    public void ensureLayoutState() {
        if (this.mLayoutState == null) {
            this.mLayoutState = createLayoutState();
        }
    }

    public int fill(RecyclerView.t tVar, c cVar, RecyclerView.y yVar, boolean z10) {
        boolean z11;
        int i6 = cVar.f2698c;
        int i10 = cVar.f2701g;
        if (i10 != Integer.MIN_VALUE) {
            if (i6 < 0) {
                cVar.f2701g = i10 + i6;
            }
            recycleByLayoutState(tVar, cVar);
        }
        int i11 = cVar.f2698c + cVar.f2702h;
        b bVar = this.mLayoutChunkResult;
        while (true) {
            if (!cVar.f2706l && i11 <= 0) {
                break;
            }
            int i12 = cVar.f2699d;
            if (i12 >= 0 && i12 < yVar.b()) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                break;
            }
            bVar.f2692a = 0;
            bVar.f2693b = false;
            bVar.f2694c = false;
            bVar.f2695d = false;
            layoutChunk(tVar, yVar, cVar, bVar);
            if (!bVar.f2693b) {
                int i13 = cVar.f2697b;
                int i14 = bVar.f2692a;
                cVar.f2697b = (cVar.f * i14) + i13;
                if (!bVar.f2694c || cVar.f2705k != null || !yVar.f2817g) {
                    cVar.f2698c -= i14;
                    i11 -= i14;
                }
                int i15 = cVar.f2701g;
                if (i15 != Integer.MIN_VALUE) {
                    int i16 = i15 + i14;
                    cVar.f2701g = i16;
                    int i17 = cVar.f2698c;
                    if (i17 < 0) {
                        cVar.f2701g = i16 + i17;
                    }
                    recycleByLayoutState(tVar, cVar);
                }
                if (z10 && bVar.f2695d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i6 - cVar.f2698c;
    }

    public int findFirstCompletelyVisibleItemPosition() {
        View findOneVisibleChild = findOneVisibleChild(0, getChildCount(), true, false);
        if (findOneVisibleChild == null) {
            return -1;
        }
        return getPosition(findOneVisibleChild);
    }

    public View findFirstVisibleChildClosestToEnd(boolean z10, boolean z11) {
        if (this.mShouldReverseLayout) {
            return findOneVisibleChild(0, getChildCount(), z10, z11);
        }
        return findOneVisibleChild(getChildCount() - 1, -1, z10, z11);
    }

    public View findFirstVisibleChildClosestToStart(boolean z10, boolean z11) {
        if (this.mShouldReverseLayout) {
            return findOneVisibleChild(getChildCount() - 1, -1, z10, z11);
        }
        return findOneVisibleChild(0, getChildCount(), z10, z11);
    }

    public int findFirstVisibleItemPosition() {
        View findOneVisibleChild = findOneVisibleChild(0, getChildCount(), false, true);
        if (findOneVisibleChild == null) {
            return -1;
        }
        return getPosition(findOneVisibleChild);
    }

    public int findLastCompletelyVisibleItemPosition() {
        View findOneVisibleChild = findOneVisibleChild(getChildCount() - 1, -1, true, false);
        if (findOneVisibleChild == null) {
            return -1;
        }
        return getPosition(findOneVisibleChild);
    }

    public int findLastVisibleItemPosition() {
        View findOneVisibleChild = findOneVisibleChild(getChildCount() - 1, -1, false, true);
        if (findOneVisibleChild == null) {
            return -1;
        }
        return getPosition(findOneVisibleChild);
    }

    public View findOnePartiallyOrCompletelyInvisibleChild(int i6, int i10) {
        char c10;
        int i11;
        int i12;
        ensureLayoutState();
        if (i10 > i6) {
            c10 = 1;
        } else if (i10 < i6) {
            c10 = 65535;
        } else {
            c10 = 0;
        }
        if (c10 == 0) {
            return getChildAt(i6);
        }
        if (this.mOrientationHelper.e(getChildAt(i6)) < this.mOrientationHelper.k()) {
            i11 = 16644;
            i12 = 16388;
        } else {
            i11 = 4161;
            i12 = 4097;
        }
        if (this.mOrientation == 0) {
            return this.mHorizontalBoundCheck.a(i6, i10, i11, i12);
        }
        return this.mVerticalBoundCheck.a(i6, i10, i11, i12);
    }

    public View findOneVisibleChild(int i6, int i10, boolean z10, boolean z11) {
        int i11;
        ensureLayoutState();
        int i12 = 320;
        if (z10) {
            i11 = 24579;
        } else {
            i11 = 320;
        }
        if (!z11) {
            i12 = 0;
        }
        if (this.mOrientation == 0) {
            return this.mHorizontalBoundCheck.a(i6, i10, i11, i12);
        }
        return this.mVerticalBoundCheck.a(i6, i10, i11, i12);
    }

    public View findReferenceChild(RecyclerView.t tVar, RecyclerView.y yVar, boolean z10, boolean z11) {
        int i6;
        int i10;
        int i11;
        boolean z12;
        boolean z13;
        ensureLayoutState();
        int childCount = getChildCount();
        if (z11) {
            i10 = getChildCount() - 1;
            i6 = -1;
            i11 = -1;
        } else {
            i6 = childCount;
            i10 = 0;
            i11 = 1;
        }
        int b10 = yVar.b();
        int k10 = this.mOrientationHelper.k();
        int g5 = this.mOrientationHelper.g();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (i10 != i6) {
            View childAt = getChildAt(i10);
            int position = getPosition(childAt);
            int e10 = this.mOrientationHelper.e(childAt);
            int b11 = this.mOrientationHelper.b(childAt);
            if (position >= 0 && position < b10) {
                if (((RecyclerView.n) childAt.getLayoutParams()).c()) {
                    if (view3 == null) {
                        view3 = childAt;
                    }
                } else {
                    if (b11 <= k10 && e10 < k10) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (e10 >= g5 && b11 > g5) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (!z12 && !z13) {
                        return childAt;
                    }
                    if (z10) {
                        if (!z13) {
                            if (view != null) {
                            }
                            view = childAt;
                        }
                        view2 = childAt;
                    } else {
                        if (!z12) {
                            if (view != null) {
                            }
                            view = childAt;
                        }
                        view2 = childAt;
                    }
                }
            }
            i10 += i11;
        }
        if (view == null) {
            if (view2 != null) {
                return view2;
            }
            return view3;
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public View findViewByPosition(int i6) {
        int childCount = getChildCount();
        if (childCount == 0) {
            return null;
        }
        int position = i6 - getPosition(getChildAt(0));
        if (position >= 0 && position < childCount) {
            View childAt = getChildAt(position);
            if (getPosition(childAt) == i6) {
                return childAt;
            }
        }
        return super.findViewByPosition(i6);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public RecyclerView.n generateDefaultLayoutParams() {
        return new RecyclerView.n(-2, -2);
    }

    @Deprecated
    public int getExtraLayoutSpace(RecyclerView.y yVar) {
        boolean z10;
        if (yVar.f2812a != -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return 0;
        }
        return this.mOrientationHelper.l();
    }

    public int getInitialPrefetchItemCount() {
        return this.mInitialPrefetchItemCount;
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public boolean getRecycleChildrenOnDetach() {
        return this.mRecycleChildrenOnDetach;
    }

    public boolean getReverseLayout() {
        return this.mReverseLayout;
    }

    public boolean getStackFromEnd() {
        return this.mStackFromEnd;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean isAutoMeasureEnabled() {
        return true;
    }

    public boolean isLayoutRTL() {
        if (getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }

    public boolean isSmoothScrollbarEnabled() {
        return this.mSmoothScrollbarEnabled;
    }

    public void layoutChunk(RecyclerView.t tVar, RecyclerView.y yVar, c cVar, b bVar) {
        boolean z10;
        int i6;
        int i10;
        int i11;
        int i12;
        int d10;
        boolean z11;
        View b10 = cVar.b(tVar);
        if (b10 == null) {
            bVar.f2693b = true;
            return;
        }
        RecyclerView.n nVar = (RecyclerView.n) b10.getLayoutParams();
        if (cVar.f2705k == null) {
            boolean z12 = this.mShouldReverseLayout;
            if (cVar.f == -1) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z12 == z11) {
                addView(b10);
            } else {
                addView(b10, 0);
            }
        } else {
            boolean z13 = this.mShouldReverseLayout;
            if (cVar.f == -1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z13 == z10) {
                addDisappearingView(b10);
            } else {
                addDisappearingView(b10, 0);
            }
        }
        measureChildWithMargins(b10, 0, 0);
        bVar.f2692a = this.mOrientationHelper.c(b10);
        if (this.mOrientation == 1) {
            if (isLayoutRTL()) {
                d10 = getWidth() - getPaddingRight();
                i12 = d10 - this.mOrientationHelper.d(b10);
            } else {
                i12 = getPaddingLeft();
                d10 = this.mOrientationHelper.d(b10) + i12;
            }
            if (cVar.f == -1) {
                int i13 = cVar.f2697b;
                i11 = i13;
                i10 = d10;
                i6 = i13 - bVar.f2692a;
            } else {
                int i14 = cVar.f2697b;
                i6 = i14;
                i10 = d10;
                i11 = bVar.f2692a + i14;
            }
        } else {
            int paddingTop = getPaddingTop();
            int d11 = this.mOrientationHelper.d(b10) + paddingTop;
            if (cVar.f == -1) {
                int i15 = cVar.f2697b;
                i10 = i15;
                i6 = paddingTop;
                i11 = d11;
                i12 = i15 - bVar.f2692a;
            } else {
                int i16 = cVar.f2697b;
                i6 = paddingTop;
                i10 = bVar.f2692a + i16;
                i11 = d11;
                i12 = i16;
            }
        }
        layoutDecoratedWithMargins(b10, i12, i6, i10, i11);
        if (nVar.c() || nVar.b()) {
            bVar.f2694c = true;
        }
        bVar.f2695d = b10.hasFocusable();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.t tVar) {
        super.onDetachedFromWindow(recyclerView, tVar);
        if (this.mRecycleChildrenOnDetach) {
            removeAndRecycleAllViews(tVar);
            tVar.f2797a.clear();
            tVar.f();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public View onFocusSearchFailed(View view, int i6, RecyclerView.t tVar, RecyclerView.y yVar) {
        int convertFocusDirectionToLayoutDirection;
        View findPartiallyOrCompletelyInvisibleChildClosestToEnd;
        View childClosestToEnd;
        resolveShouldLayoutReverse();
        if (getChildCount() == 0 || (convertFocusDirectionToLayoutDirection = convertFocusDirectionToLayoutDirection(i6)) == Integer.MIN_VALUE) {
            return null;
        }
        ensureLayoutState();
        updateLayoutState(convertFocusDirectionToLayoutDirection, (int) (this.mOrientationHelper.l() * MAX_SCROLL_FACTOR), false, yVar);
        c cVar = this.mLayoutState;
        cVar.f2701g = INVALID_OFFSET;
        cVar.f2696a = false;
        fill(tVar, cVar, yVar, true);
        if (convertFocusDirectionToLayoutDirection == -1) {
            findPartiallyOrCompletelyInvisibleChildClosestToEnd = findPartiallyOrCompletelyInvisibleChildClosestToStart();
        } else {
            findPartiallyOrCompletelyInvisibleChildClosestToEnd = findPartiallyOrCompletelyInvisibleChildClosestToEnd();
        }
        if (convertFocusDirectionToLayoutDirection == -1) {
            childClosestToEnd = getChildClosestToStart();
        } else {
            childClosestToEnd = getChildClosestToEnd();
        }
        if (childClosestToEnd.hasFocusable()) {
            if (findPartiallyOrCompletelyInvisibleChildClosestToEnd == null) {
                return null;
            }
            return childClosestToEnd;
        }
        return findPartiallyOrCompletelyInvisibleChildClosestToEnd;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            accessibilityEvent.setFromIndex(findFirstVisibleItemPosition());
            accessibilityEvent.setToIndex(findLastVisibleItemPosition());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void onLayoutChildren(RecyclerView.t tVar, RecyclerView.y yVar) {
        int i6;
        int i10;
        int i11;
        int i12;
        int i13;
        int fixLayoutEndGap;
        int i14;
        View findViewByPosition;
        int e10;
        int i15;
        boolean z10;
        int i16 = -1;
        if ((this.mPendingSavedState != null || this.mPendingScrollPosition != -1) && yVar.b() == 0) {
            removeAndRecycleAllViews(tVar);
            return;
        }
        d dVar = this.mPendingSavedState;
        if (dVar != null) {
            int i17 = dVar.f2707u;
            if (i17 >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                this.mPendingScrollPosition = i17;
            }
        }
        ensureLayoutState();
        this.mLayoutState.f2696a = false;
        resolveShouldLayoutReverse();
        View focusedChild = getFocusedChild();
        a aVar = this.mAnchorInfo;
        if (aVar.f2691e && this.mPendingScrollPosition == -1 && this.mPendingSavedState == null) {
            if (focusedChild != null && (this.mOrientationHelper.e(focusedChild) >= this.mOrientationHelper.g() || this.mOrientationHelper.b(focusedChild) <= this.mOrientationHelper.k())) {
                this.mAnchorInfo.c(getPosition(focusedChild), focusedChild);
            }
        } else {
            aVar.d();
            a aVar2 = this.mAnchorInfo;
            aVar2.f2690d = this.mShouldReverseLayout ^ this.mStackFromEnd;
            updateAnchorInfoForLayout(tVar, yVar, aVar2);
            this.mAnchorInfo.f2691e = true;
        }
        c cVar = this.mLayoutState;
        if (cVar.f2704j >= 0) {
            i6 = 1;
        } else {
            i6 = -1;
        }
        cVar.f = i6;
        int[] iArr = this.mReusableIntPair;
        iArr[0] = 0;
        iArr[1] = 0;
        calculateExtraLayoutSpace(yVar, iArr);
        int k10 = this.mOrientationHelper.k() + Math.max(0, this.mReusableIntPair[0]);
        int h10 = this.mOrientationHelper.h() + Math.max(0, this.mReusableIntPair[1]);
        if (yVar.f2817g && (i14 = this.mPendingScrollPosition) != -1 && this.mPendingScrollPositionOffset != Integer.MIN_VALUE && (findViewByPosition = findViewByPosition(i14)) != null) {
            if (this.mShouldReverseLayout) {
                i15 = this.mOrientationHelper.g() - this.mOrientationHelper.b(findViewByPosition);
                e10 = this.mPendingScrollPositionOffset;
            } else {
                e10 = this.mOrientationHelper.e(findViewByPosition) - this.mOrientationHelper.k();
                i15 = this.mPendingScrollPositionOffset;
            }
            int i18 = i15 - e10;
            if (i18 > 0) {
                k10 += i18;
            } else {
                h10 -= i18;
            }
        }
        a aVar3 = this.mAnchorInfo;
        if (!aVar3.f2690d ? !this.mShouldReverseLayout : this.mShouldReverseLayout) {
            i16 = 1;
        }
        onAnchorReady(tVar, yVar, aVar3, i16);
        detachAndScrapAttachedViews(tVar);
        this.mLayoutState.f2706l = resolveIsInfinite();
        this.mLayoutState.getClass();
        this.mLayoutState.f2703i = 0;
        a aVar4 = this.mAnchorInfo;
        if (aVar4.f2690d) {
            updateLayoutStateToFillStart(aVar4);
            c cVar2 = this.mLayoutState;
            cVar2.f2702h = k10;
            fill(tVar, cVar2, yVar, false);
            c cVar3 = this.mLayoutState;
            i11 = cVar3.f2697b;
            int i19 = cVar3.f2699d;
            int i20 = cVar3.f2698c;
            if (i20 > 0) {
                h10 += i20;
            }
            updateLayoutStateToFillEnd(this.mAnchorInfo);
            c cVar4 = this.mLayoutState;
            cVar4.f2702h = h10;
            cVar4.f2699d += cVar4.f2700e;
            fill(tVar, cVar4, yVar, false);
            c cVar5 = this.mLayoutState;
            i10 = cVar5.f2697b;
            int i21 = cVar5.f2698c;
            if (i21 > 0) {
                updateLayoutStateToFillStart(i19, i11);
                c cVar6 = this.mLayoutState;
                cVar6.f2702h = i21;
                fill(tVar, cVar6, yVar, false);
                i11 = this.mLayoutState.f2697b;
            }
        } else {
            updateLayoutStateToFillEnd(aVar4);
            c cVar7 = this.mLayoutState;
            cVar7.f2702h = h10;
            fill(tVar, cVar7, yVar, false);
            c cVar8 = this.mLayoutState;
            int i22 = cVar8.f2697b;
            int i23 = cVar8.f2699d;
            int i24 = cVar8.f2698c;
            if (i24 > 0) {
                k10 += i24;
            }
            updateLayoutStateToFillStart(this.mAnchorInfo);
            c cVar9 = this.mLayoutState;
            cVar9.f2702h = k10;
            cVar9.f2699d += cVar9.f2700e;
            fill(tVar, cVar9, yVar, false);
            c cVar10 = this.mLayoutState;
            int i25 = cVar10.f2697b;
            int i26 = cVar10.f2698c;
            if (i26 > 0) {
                updateLayoutStateToFillEnd(i23, i22);
                c cVar11 = this.mLayoutState;
                cVar11.f2702h = i26;
                fill(tVar, cVar11, yVar, false);
                i10 = this.mLayoutState.f2697b;
            } else {
                i10 = i22;
            }
            i11 = i25;
        }
        if (getChildCount() > 0) {
            if (this.mShouldReverseLayout ^ this.mStackFromEnd) {
                int fixLayoutEndGap2 = fixLayoutEndGap(i10, tVar, yVar, true);
                i12 = i11 + fixLayoutEndGap2;
                i13 = i10 + fixLayoutEndGap2;
                fixLayoutEndGap = fixLayoutStartGap(i12, tVar, yVar, false);
            } else {
                int fixLayoutStartGap = fixLayoutStartGap(i11, tVar, yVar, true);
                i12 = i11 + fixLayoutStartGap;
                i13 = i10 + fixLayoutStartGap;
                fixLayoutEndGap = fixLayoutEndGap(i13, tVar, yVar, false);
            }
            i11 = i12 + fixLayoutEndGap;
            i10 = i13 + fixLayoutEndGap;
        }
        layoutForPredictiveAnimations(tVar, yVar, i11, i10);
        if (!yVar.f2817g) {
            v vVar = this.mOrientationHelper;
            vVar.f3056b = vVar.l();
        } else {
            this.mAnchorInfo.d();
        }
        this.mLastStackFromEnd = this.mStackFromEnd;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void onLayoutCompleted(RecyclerView.y yVar) {
        super.onLayoutCompleted(yVar);
        this.mPendingSavedState = null;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = INVALID_OFFSET;
        this.mAnchorInfo.d();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof d) {
            d dVar = (d) parcelable;
            this.mPendingSavedState = dVar;
            if (this.mPendingScrollPosition != -1) {
                dVar.f2707u = -1;
            }
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public Parcelable onSaveInstanceState() {
        d dVar = this.mPendingSavedState;
        if (dVar != null) {
            return new d(dVar);
        }
        d dVar2 = new d();
        if (getChildCount() > 0) {
            ensureLayoutState();
            boolean z10 = this.mLastStackFromEnd ^ this.mShouldReverseLayout;
            dVar2.f2709w = z10;
            if (z10) {
                View childClosestToEnd = getChildClosestToEnd();
                dVar2.f2708v = this.mOrientationHelper.g() - this.mOrientationHelper.b(childClosestToEnd);
                dVar2.f2707u = getPosition(childClosestToEnd);
            } else {
                View childClosestToStart = getChildClosestToStart();
                dVar2.f2707u = getPosition(childClosestToStart);
                dVar2.f2708v = this.mOrientationHelper.e(childClosestToStart) - this.mOrientationHelper.k();
            }
        } else {
            dVar2.f2707u = -1;
        }
        return dVar2;
    }

    @Override // androidx.recyclerview.widget.k.g
    public void prepareForDrop(View view, View view2, int i6, int i10) {
        char c10;
        assertNotInLayoutOrScroll("Cannot drop a view during a scroll or layout calculation");
        ensureLayoutState();
        resolveShouldLayoutReverse();
        int position = getPosition(view);
        int position2 = getPosition(view2);
        if (position < position2) {
            c10 = 1;
        } else {
            c10 = 65535;
        }
        if (this.mShouldReverseLayout) {
            if (c10 == 1) {
                scrollToPositionWithOffset(position2, this.mOrientationHelper.g() - (this.mOrientationHelper.c(view) + this.mOrientationHelper.e(view2)));
                return;
            }
            scrollToPositionWithOffset(position2, this.mOrientationHelper.g() - this.mOrientationHelper.b(view2));
        } else if (c10 == 65535) {
            scrollToPositionWithOffset(position2, this.mOrientationHelper.e(view2));
        } else {
            scrollToPositionWithOffset(position2, this.mOrientationHelper.b(view2) - this.mOrientationHelper.c(view));
        }
    }

    public boolean resolveIsInfinite() {
        if (this.mOrientationHelper.i() == 0 && this.mOrientationHelper.f() == 0) {
            return true;
        }
        return false;
    }

    public int scrollBy(int i6, RecyclerView.t tVar, RecyclerView.y yVar) {
        int i10;
        if (getChildCount() == 0 || i6 == 0) {
            return 0;
        }
        ensureLayoutState();
        this.mLayoutState.f2696a = true;
        if (i6 > 0) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        int abs = Math.abs(i6);
        updateLayoutState(i10, abs, true, yVar);
        c cVar = this.mLayoutState;
        int fill = fill(tVar, cVar, yVar, false) + cVar.f2701g;
        if (fill < 0) {
            return 0;
        }
        if (abs > fill) {
            i6 = i10 * fill;
        }
        this.mOrientationHelper.o(-i6);
        this.mLayoutState.f2704j = i6;
        return i6;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public int scrollHorizontallyBy(int i6, RecyclerView.t tVar, RecyclerView.y yVar) {
        if (this.mOrientation == 1) {
            return 0;
        }
        return scrollBy(i6, tVar, yVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void scrollToPosition(int i6) {
        this.mPendingScrollPosition = i6;
        this.mPendingScrollPositionOffset = INVALID_OFFSET;
        d dVar = this.mPendingSavedState;
        if (dVar != null) {
            dVar.f2707u = -1;
        }
        requestLayout();
    }

    public void scrollToPositionWithOffset(int i6, int i10) {
        this.mPendingScrollPosition = i6;
        this.mPendingScrollPositionOffset = i10;
        d dVar = this.mPendingSavedState;
        if (dVar != null) {
            dVar.f2707u = -1;
        }
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public int scrollVerticallyBy(int i6, RecyclerView.t tVar, RecyclerView.y yVar) {
        if (this.mOrientation == 0) {
            return 0;
        }
        return scrollBy(i6, tVar, yVar);
    }

    public void setInitialPrefetchItemCount(int i6) {
        this.mInitialPrefetchItemCount = i6;
    }

    public void setOrientation(int i6) {
        if (i6 != 0 && i6 != 1) {
            throw new IllegalArgumentException(defpackage.c.p("invalid orientation:", i6));
        }
        assertNotInLayoutOrScroll(null);
        if (i6 != this.mOrientation || this.mOrientationHelper == null) {
            v a10 = v.a(this, i6);
            this.mOrientationHelper = a10;
            this.mAnchorInfo.f2687a = a10;
            this.mOrientation = i6;
            requestLayout();
        }
    }

    public void setRecycleChildrenOnDetach(boolean z10) {
        this.mRecycleChildrenOnDetach = z10;
    }

    public void setReverseLayout(boolean z10) {
        assertNotInLayoutOrScroll(null);
        if (z10 == this.mReverseLayout) {
            return;
        }
        this.mReverseLayout = z10;
        requestLayout();
    }

    public void setSmoothScrollbarEnabled(boolean z10) {
        this.mSmoothScrollbarEnabled = z10;
    }

    public void setStackFromEnd(boolean z10) {
        assertNotInLayoutOrScroll(null);
        if (this.mStackFromEnd == z10) {
            return;
        }
        this.mStackFromEnd = z10;
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean shouldMeasureTwice() {
        if (getHeightMode() != 1073741824 && getWidthMode() != 1073741824 && hasFlexibleChildInBothOrientations()) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.y yVar, int i6) {
        q qVar = new q(recyclerView.getContext());
        qVar.setTargetPosition(i6);
        startSmoothScroll(qVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean supportsPredictiveItemAnimations() {
        if (this.mPendingSavedState == null && this.mLastStackFromEnd == this.mStackFromEnd) {
            return true;
        }
        return false;
    }

    public void validateChildOrder() {
        Log.d(TAG, "validating child count " + getChildCount());
        boolean z10 = true;
        if (getChildCount() < 1) {
            return;
        }
        int position = getPosition(getChildAt(0));
        int e10 = this.mOrientationHelper.e(getChildAt(0));
        if (this.mShouldReverseLayout) {
            for (int i6 = 1; i6 < getChildCount(); i6++) {
                View childAt = getChildAt(i6);
                int position2 = getPosition(childAt);
                int e11 = this.mOrientationHelper.e(childAt);
                if (position2 < position) {
                    logChildren();
                    StringBuilder sb2 = new StringBuilder("detected invalid position. loc invalid? ");
                    if (e11 >= e10) {
                        z10 = false;
                    }
                    sb2.append(z10);
                    throw new RuntimeException(sb2.toString());
                } else if (e11 > e10) {
                    logChildren();
                    throw new RuntimeException("detected invalid location");
                }
            }
            return;
        }
        for (int i10 = 1; i10 < getChildCount(); i10++) {
            View childAt2 = getChildAt(i10);
            int position3 = getPosition(childAt2);
            int e12 = this.mOrientationHelper.e(childAt2);
            if (position3 < position) {
                logChildren();
                StringBuilder sb3 = new StringBuilder("detected invalid position. loc invalid? ");
                if (e12 >= e10) {
                    z10 = false;
                }
                sb3.append(z10);
                throw new RuntimeException(sb3.toString());
            } else if (e12 < e10) {
                logChildren();
                throw new RuntimeException("detected invalid location");
            }
        }
    }

    public LinearLayoutManager(Context context, int i6, boolean z10) {
        this.mOrientation = 1;
        this.mReverseLayout = false;
        this.mShouldReverseLayout = false;
        this.mStackFromEnd = false;
        this.mSmoothScrollbarEnabled = true;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = INVALID_OFFSET;
        this.mPendingSavedState = null;
        this.mAnchorInfo = new a();
        this.mLayoutChunkResult = new b();
        this.mInitialPrefetchItemCount = 2;
        this.mReusableIntPair = new int[2];
        setOrientation(i6);
        setReverseLayout(z10);
    }

    private void updateLayoutStateToFillEnd(int i6, int i10) {
        this.mLayoutState.f2698c = this.mOrientationHelper.g() - i10;
        c cVar = this.mLayoutState;
        cVar.f2700e = this.mShouldReverseLayout ? -1 : 1;
        cVar.f2699d = i6;
        cVar.f = 1;
        cVar.f2697b = i10;
        cVar.f2701g = INVALID_OFFSET;
    }

    private void updateLayoutStateToFillStart(int i6, int i10) {
        this.mLayoutState.f2698c = i10 - this.mOrientationHelper.k();
        c cVar = this.mLayoutState;
        cVar.f2699d = i6;
        cVar.f2700e = this.mShouldReverseLayout ? 1 : -1;
        cVar.f = -1;
        cVar.f2697b = i10;
        cVar.f2701g = INVALID_OFFSET;
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i6, int i10) {
        this.mOrientation = 1;
        this.mReverseLayout = false;
        this.mShouldReverseLayout = false;
        this.mStackFromEnd = false;
        this.mSmoothScrollbarEnabled = true;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = INVALID_OFFSET;
        this.mPendingSavedState = null;
        this.mAnchorInfo = new a();
        this.mLayoutChunkResult = new b();
        this.mInitialPrefetchItemCount = 2;
        this.mReusableIntPair = new int[2];
        RecyclerView.m.d properties = RecyclerView.m.getProperties(context, attributeSet, i6, i10);
        setOrientation(properties.f2782a);
        setReverseLayout(properties.f2784c);
        setStackFromEnd(properties.f2785d);
    }

    public void onAnchorReady(RecyclerView.t tVar, RecyclerView.y yVar, a aVar, int i6) {
    }
}
