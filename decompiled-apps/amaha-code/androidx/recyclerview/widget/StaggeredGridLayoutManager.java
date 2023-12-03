package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.j;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends RecyclerView.m implements RecyclerView.x.b {

    /* renamed from: a  reason: collision with root package name */
    public int f2825a;

    /* renamed from: b  reason: collision with root package name */
    public f[] f2826b;

    /* renamed from: c  reason: collision with root package name */
    public v f2827c;

    /* renamed from: d  reason: collision with root package name */
    public v f2828d;

    /* renamed from: e  reason: collision with root package name */
    public int f2829e;
    public int f;

    /* renamed from: g  reason: collision with root package name */
    public final p f2830g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f2831h;

    /* renamed from: j  reason: collision with root package name */
    public BitSet f2833j;

    /* renamed from: m  reason: collision with root package name */
    public final d f2836m;

    /* renamed from: n  reason: collision with root package name */
    public final int f2837n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f2838o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f2839p;

    /* renamed from: q  reason: collision with root package name */
    public e f2840q;
    public final Rect r;

    /* renamed from: s  reason: collision with root package name */
    public final b f2841s;

    /* renamed from: t  reason: collision with root package name */
    public final boolean f2842t;

    /* renamed from: u  reason: collision with root package name */
    public int[] f2843u;

    /* renamed from: v  reason: collision with root package name */
    public final a f2844v;

    /* renamed from: i  reason: collision with root package name */
    public boolean f2832i = false;

    /* renamed from: k  reason: collision with root package name */
    public int f2834k = -1;

    /* renamed from: l  reason: collision with root package name */
    public int f2835l = LinearLayoutManager.INVALID_OFFSET;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            StaggeredGridLayoutManager.this.b();
        }
    }

    /* loaded from: classes.dex */
    public class b {

        /* renamed from: a  reason: collision with root package name */
        public int f2846a;

        /* renamed from: b  reason: collision with root package name */
        public int f2847b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f2848c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f2849d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f2850e;
        public int[] f;

        public b() {
            a();
        }

        public final void a() {
            this.f2846a = -1;
            this.f2847b = LinearLayoutManager.INVALID_OFFSET;
            this.f2848c = false;
            this.f2849d = false;
            this.f2850e = false;
            int[] iArr = this.f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class c extends RecyclerView.n {

        /* renamed from: e  reason: collision with root package name */
        public f f2852e;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(int i6, int i10) {
            super(i6, i10);
        }

        public c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    /* loaded from: classes.dex */
    public static class e implements Parcelable {
        public static final Parcelable.Creator<e> CREATOR = new a();
        public List<d.a> A;
        public boolean B;
        public boolean C;
        public boolean D;

        /* renamed from: u  reason: collision with root package name */
        public int f2859u;

        /* renamed from: v  reason: collision with root package name */
        public int f2860v;

        /* renamed from: w  reason: collision with root package name */
        public int f2861w;

        /* renamed from: x  reason: collision with root package name */
        public int[] f2862x;

        /* renamed from: y  reason: collision with root package name */
        public int f2863y;

        /* renamed from: z  reason: collision with root package name */
        public int[] f2864z;

        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator<e> {
            @Override // android.os.Parcelable.Creator
            public final e createFromParcel(Parcel parcel) {
                return new e(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final e[] newArray(int i6) {
                return new e[i6];
            }
        }

        public e() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i6) {
            parcel.writeInt(this.f2859u);
            parcel.writeInt(this.f2860v);
            parcel.writeInt(this.f2861w);
            if (this.f2861w > 0) {
                parcel.writeIntArray(this.f2862x);
            }
            parcel.writeInt(this.f2863y);
            if (this.f2863y > 0) {
                parcel.writeIntArray(this.f2864z);
            }
            parcel.writeInt(this.B ? 1 : 0);
            parcel.writeInt(this.C ? 1 : 0);
            parcel.writeInt(this.D ? 1 : 0);
            parcel.writeList(this.A);
        }

        public e(Parcel parcel) {
            this.f2859u = parcel.readInt();
            this.f2860v = parcel.readInt();
            int readInt = parcel.readInt();
            this.f2861w = readInt;
            if (readInt > 0) {
                int[] iArr = new int[readInt];
                this.f2862x = iArr;
                parcel.readIntArray(iArr);
            }
            int readInt2 = parcel.readInt();
            this.f2863y = readInt2;
            if (readInt2 > 0) {
                int[] iArr2 = new int[readInt2];
                this.f2864z = iArr2;
                parcel.readIntArray(iArr2);
            }
            this.B = parcel.readInt() == 1;
            this.C = parcel.readInt() == 1;
            this.D = parcel.readInt() == 1;
            this.A = parcel.readArrayList(d.a.class.getClassLoader());
        }

        public e(e eVar) {
            this.f2861w = eVar.f2861w;
            this.f2859u = eVar.f2859u;
            this.f2860v = eVar.f2860v;
            this.f2862x = eVar.f2862x;
            this.f2863y = eVar.f2863y;
            this.f2864z = eVar.f2864z;
            this.B = eVar.B;
            this.C = eVar.C;
            this.D = eVar.D;
            this.A = eVar.A;
        }
    }

    /* loaded from: classes.dex */
    public class f {

        /* renamed from: a  reason: collision with root package name */
        public final ArrayList<View> f2865a = new ArrayList<>();

        /* renamed from: b  reason: collision with root package name */
        public int f2866b = LinearLayoutManager.INVALID_OFFSET;

        /* renamed from: c  reason: collision with root package name */
        public int f2867c = LinearLayoutManager.INVALID_OFFSET;

        /* renamed from: d  reason: collision with root package name */
        public int f2868d = 0;

        /* renamed from: e  reason: collision with root package name */
        public final int f2869e;

        public f(int i6) {
            this.f2869e = i6;
        }

        public static c h(View view) {
            return (c) view.getLayoutParams();
        }

        public final void a() {
            ArrayList<View> arrayList = this.f2865a;
            View view = arrayList.get(arrayList.size() - 1);
            c h10 = h(view);
            this.f2867c = StaggeredGridLayoutManager.this.f2827c.b(view);
            h10.getClass();
        }

        public final void b() {
            this.f2865a.clear();
            this.f2866b = LinearLayoutManager.INVALID_OFFSET;
            this.f2867c = LinearLayoutManager.INVALID_OFFSET;
            this.f2868d = 0;
        }

        public final int c() {
            boolean z10 = StaggeredGridLayoutManager.this.f2831h;
            ArrayList<View> arrayList = this.f2865a;
            if (z10) {
                return e(arrayList.size() - 1, -1);
            }
            return e(0, arrayList.size());
        }

        public final int d() {
            boolean z10 = StaggeredGridLayoutManager.this.f2831h;
            ArrayList<View> arrayList = this.f2865a;
            if (z10) {
                return e(0, arrayList.size());
            }
            return e(arrayList.size() - 1, -1);
        }

        public final int e(int i6, int i10) {
            int i11;
            boolean z10;
            StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
            int k10 = staggeredGridLayoutManager.f2827c.k();
            int g5 = staggeredGridLayoutManager.f2827c.g();
            if (i10 > i6) {
                i11 = 1;
            } else {
                i11 = -1;
            }
            while (i6 != i10) {
                View view = this.f2865a.get(i6);
                int e10 = staggeredGridLayoutManager.f2827c.e(view);
                int b10 = staggeredGridLayoutManager.f2827c.b(view);
                boolean z11 = false;
                if (e10 <= g5) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (b10 >= k10) {
                    z11 = true;
                }
                if (z10 && z11 && (e10 < k10 || b10 > g5)) {
                    return staggeredGridLayoutManager.getPosition(view);
                }
                i6 += i11;
            }
            return -1;
        }

        public final int f(int i6) {
            int i10 = this.f2867c;
            if (i10 != Integer.MIN_VALUE) {
                return i10;
            }
            if (this.f2865a.size() == 0) {
                return i6;
            }
            a();
            return this.f2867c;
        }

        public final View g(int i6, int i10) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
            ArrayList<View> arrayList = this.f2865a;
            View view = null;
            if (i10 == -1) {
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    View view2 = arrayList.get(i11);
                    if ((staggeredGridLayoutManager.f2831h && staggeredGridLayoutManager.getPosition(view2) <= i6) || ((!staggeredGridLayoutManager.f2831h && staggeredGridLayoutManager.getPosition(view2) >= i6) || !view2.hasFocusable())) {
                        break;
                    }
                    i11++;
                    view = view2;
                }
            } else {
                int size2 = arrayList.size() - 1;
                while (size2 >= 0) {
                    View view3 = arrayList.get(size2);
                    if ((staggeredGridLayoutManager.f2831h && staggeredGridLayoutManager.getPosition(view3) >= i6) || ((!staggeredGridLayoutManager.f2831h && staggeredGridLayoutManager.getPosition(view3) <= i6) || !view3.hasFocusable())) {
                        break;
                    }
                    size2--;
                    view = view3;
                }
            }
            return view;
        }

        public final int i(int i6) {
            int i10 = this.f2866b;
            if (i10 != Integer.MIN_VALUE) {
                return i10;
            }
            ArrayList<View> arrayList = this.f2865a;
            if (arrayList.size() == 0) {
                return i6;
            }
            View view = arrayList.get(0);
            c h10 = h(view);
            this.f2866b = StaggeredGridLayoutManager.this.f2827c.e(view);
            h10.getClass();
            return this.f2866b;
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i6, int i10) {
        this.f2825a = -1;
        this.f2831h = false;
        d dVar = new d();
        this.f2836m = dVar;
        this.f2837n = 2;
        this.r = new Rect();
        this.f2841s = new b();
        this.f2842t = true;
        this.f2844v = new a();
        RecyclerView.m.d properties = RecyclerView.m.getProperties(context, attributeSet, i6, i10);
        int i11 = properties.f2782a;
        if (i11 != 0 && i11 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        assertNotInLayoutOrScroll(null);
        if (i11 != this.f2829e) {
            this.f2829e = i11;
            v vVar = this.f2827c;
            this.f2827c = this.f2828d;
            this.f2828d = vVar;
            requestLayout();
        }
        int i12 = properties.f2783b;
        assertNotInLayoutOrScroll(null);
        if (i12 != this.f2825a) {
            dVar.a();
            requestLayout();
            this.f2825a = i12;
            this.f2833j = new BitSet(this.f2825a);
            this.f2826b = new f[this.f2825a];
            for (int i13 = 0; i13 < this.f2825a; i13++) {
                this.f2826b[i13] = new f(i13);
            }
            requestLayout();
        }
        boolean z10 = properties.f2784c;
        assertNotInLayoutOrScroll(null);
        e eVar = this.f2840q;
        if (eVar != null && eVar.B != z10) {
            eVar.B = z10;
        }
        this.f2831h = z10;
        requestLayout();
        this.f2830g = new p();
        this.f2827c = v.a(this, this.f2829e);
        this.f2828d = v.a(this, 1 - this.f2829e);
    }

    public static int x(int i6, int i10, int i11) {
        if (i10 == 0 && i11 == 0) {
            return i6;
        }
        int mode = View.MeasureSpec.getMode(i6);
        if (mode != Integer.MIN_VALUE && mode != 1073741824) {
            return i6;
        }
        return View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i6) - i10) - i11), mode);
    }

    public final int a(int i6) {
        boolean z10;
        if (getChildCount() == 0) {
            if (!this.f2832i) {
                return -1;
            }
            return 1;
        }
        if (i6 < h()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 != this.f2832i) {
            return -1;
        }
        return 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void assertNotInLayoutOrScroll(String str) {
        if (this.f2840q == null) {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    public final boolean b() {
        int h10;
        if (getChildCount() != 0 && this.f2837n != 0 && isAttachedToWindow()) {
            if (this.f2832i) {
                h10 = i();
                h();
            } else {
                h10 = h();
                i();
            }
            if (h10 == 0 && m() != null) {
                this.f2836m.a();
                requestSimpleAnimationsInNextLayout();
                requestLayout();
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r1v51 */
    public final int c(RecyclerView.t tVar, p pVar, RecyclerView.y yVar) {
        int i6;
        int i10;
        int k10;
        boolean z10;
        int j10;
        int i11;
        boolean z11;
        f fVar;
        ?? r12;
        int i12;
        int c10;
        int k11;
        int c11;
        View view;
        int i13;
        int i14;
        RecyclerView.t tVar2 = tVar;
        int i15 = 1;
        this.f2833j.set(0, this.f2825a, true);
        p pVar2 = this.f2830g;
        if (pVar2.f3051i) {
            if (pVar.f3048e == 1) {
                i10 = SubsamplingScaleImageView.TILE_SIZE_AUTO;
            } else {
                i10 = LinearLayoutManager.INVALID_OFFSET;
            }
        } else {
            if (pVar.f3048e == 1) {
                i6 = pVar.f3049g + pVar.f3045b;
            } else {
                i6 = pVar.f - pVar.f3045b;
            }
            i10 = i6;
        }
        int i16 = pVar.f3048e;
        for (int i17 = 0; i17 < this.f2825a; i17++) {
            if (!this.f2826b[i17].f2865a.isEmpty()) {
                w(this.f2826b[i17], i16, i10);
            }
        }
        if (this.f2832i) {
            k10 = this.f2827c.g();
        } else {
            k10 = this.f2827c.k();
        }
        int i18 = k10;
        boolean z12 = false;
        while (true) {
            int i19 = pVar.f3046c;
            if (i19 >= 0 && i19 < yVar.b()) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i20 = -1;
            if (!z10 || (!pVar2.f3051i && this.f2833j.isEmpty())) {
                break;
            }
            View view2 = tVar2.k(pVar.f3046c, Long.MAX_VALUE).f2751a;
            pVar.f3046c += pVar.f3047d;
            c cVar = (c) view2.getLayoutParams();
            int a10 = cVar.a();
            d dVar = this.f2836m;
            int[] iArr = dVar.f2853a;
            if (iArr != null && a10 < iArr.length) {
                i11 = iArr[a10];
            } else {
                i11 = -1;
            }
            if (i11 == -1) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                if (p(pVar.f3048e)) {
                    i14 = this.f2825a - i15;
                    i13 = -1;
                } else {
                    i20 = this.f2825a;
                    i13 = 1;
                    i14 = 0;
                }
                f fVar2 = null;
                if (pVar.f3048e == i15) {
                    int k12 = this.f2827c.k();
                    int i21 = SubsamplingScaleImageView.TILE_SIZE_AUTO;
                    while (i14 != i20) {
                        f fVar3 = this.f2826b[i14];
                        int f2 = fVar3.f(k12);
                        if (f2 < i21) {
                            i21 = f2;
                            fVar2 = fVar3;
                        }
                        i14 += i13;
                    }
                } else {
                    int g5 = this.f2827c.g();
                    int i22 = LinearLayoutManager.INVALID_OFFSET;
                    while (i14 != i20) {
                        f fVar4 = this.f2826b[i14];
                        int i23 = fVar4.i(g5);
                        if (i23 > i22) {
                            fVar2 = fVar4;
                            i22 = i23;
                        }
                        i14 += i13;
                    }
                }
                fVar = fVar2;
                dVar.b(a10);
                dVar.f2853a[a10] = fVar.f2869e;
            } else {
                fVar = this.f2826b[i11];
            }
            f fVar5 = fVar;
            cVar.f2852e = fVar5;
            if (pVar.f3048e == 1) {
                addView(view2);
                r12 = 0;
            } else {
                r12 = 0;
                addView(view2, 0);
            }
            if (this.f2829e == 1) {
                n(view2, RecyclerView.m.getChildMeasureSpec(this.f, getWidthMode(), r12, ((ViewGroup.MarginLayoutParams) cVar).width, r12), RecyclerView.m.getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingBottom() + getPaddingTop(), ((ViewGroup.MarginLayoutParams) cVar).height, true), r12);
            } else {
                n(view2, RecyclerView.m.getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingRight() + getPaddingLeft(), ((ViewGroup.MarginLayoutParams) cVar).width, true), RecyclerView.m.getChildMeasureSpec(this.f, getHeightMode(), 0, ((ViewGroup.MarginLayoutParams) cVar).height, false), false);
            }
            if (pVar.f3048e == 1) {
                int f10 = fVar5.f(i18);
                c10 = f10;
                i12 = this.f2827c.c(view2) + f10;
            } else {
                int i24 = fVar5.i(i18);
                i12 = i24;
                c10 = i24 - this.f2827c.c(view2);
            }
            if (pVar.f3048e == 1) {
                f fVar6 = cVar.f2852e;
                fVar6.getClass();
                c cVar2 = (c) view2.getLayoutParams();
                cVar2.f2852e = fVar6;
                ArrayList<View> arrayList = fVar6.f2865a;
                arrayList.add(view2);
                fVar6.f2867c = LinearLayoutManager.INVALID_OFFSET;
                if (arrayList.size() == 1) {
                    fVar6.f2866b = LinearLayoutManager.INVALID_OFFSET;
                }
                if (cVar2.c() || cVar2.b()) {
                    fVar6.f2868d = StaggeredGridLayoutManager.this.f2827c.c(view2) + fVar6.f2868d;
                }
            } else {
                f fVar7 = cVar.f2852e;
                fVar7.getClass();
                c cVar3 = (c) view2.getLayoutParams();
                cVar3.f2852e = fVar7;
                ArrayList<View> arrayList2 = fVar7.f2865a;
                arrayList2.add(0, view2);
                fVar7.f2866b = LinearLayoutManager.INVALID_OFFSET;
                if (arrayList2.size() == 1) {
                    fVar7.f2867c = LinearLayoutManager.INVALID_OFFSET;
                }
                if (cVar3.c() || cVar3.b()) {
                    fVar7.f2868d = StaggeredGridLayoutManager.this.f2827c.c(view2) + fVar7.f2868d;
                }
            }
            if (isLayoutRTL() && this.f2829e == 1) {
                c11 = this.f2828d.g() - (((this.f2825a - 1) - fVar5.f2869e) * this.f);
                k11 = c11 - this.f2828d.c(view2);
            } else {
                k11 = this.f2828d.k() + (fVar5.f2869e * this.f);
                c11 = this.f2828d.c(view2) + k11;
            }
            int i25 = c11;
            int i26 = k11;
            if (this.f2829e == 1) {
                view = view2;
                layoutDecoratedWithMargins(view2, i26, c10, i25, i12);
            } else {
                view = view2;
                layoutDecoratedWithMargins(view, c10, i26, i12, i25);
            }
            w(fVar5, pVar2.f3048e, i10);
            r(tVar, pVar2);
            if (pVar2.f3050h && view.hasFocusable()) {
                this.f2833j.set(fVar5.f2869e, false);
            }
            tVar2 = tVar;
            z12 = true;
            i15 = 1;
        }
        RecyclerView.t tVar3 = tVar2;
        if (!z12) {
            r(tVar3, pVar2);
        }
        if (pVar2.f3048e == -1) {
            j10 = this.f2827c.k() - k(this.f2827c.k());
        } else {
            j10 = j(this.f2827c.g()) - this.f2827c.g();
        }
        if (j10 > 0) {
            return Math.min(pVar.f3045b, j10);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final boolean canScrollHorizontally() {
        if (this.f2829e == 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final boolean canScrollVertically() {
        if (this.f2829e == 1) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final boolean checkLayoutParams(RecyclerView.n nVar) {
        return nVar instanceof c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void collectAdjacentPrefetchPositions(int i6, int i10, RecyclerView.y yVar, RecyclerView.m.c cVar) {
        p pVar;
        boolean z10;
        int f2;
        int i11;
        if (this.f2829e != 0) {
            i6 = i10;
        }
        if (getChildCount() != 0 && i6 != 0) {
            q(i6, yVar);
            int[] iArr = this.f2843u;
            if (iArr == null || iArr.length < this.f2825a) {
                this.f2843u = new int[this.f2825a];
            }
            int i12 = 0;
            int i13 = 0;
            while (true) {
                int i14 = this.f2825a;
                pVar = this.f2830g;
                if (i12 >= i14) {
                    break;
                }
                if (pVar.f3047d == -1) {
                    f2 = pVar.f;
                    i11 = this.f2826b[i12].i(f2);
                } else {
                    f2 = this.f2826b[i12].f(pVar.f3049g);
                    i11 = pVar.f3049g;
                }
                int i15 = f2 - i11;
                if (i15 >= 0) {
                    this.f2843u[i13] = i15;
                    i13++;
                }
                i12++;
            }
            Arrays.sort(this.f2843u, 0, i13);
            for (int i16 = 0; i16 < i13; i16++) {
                int i17 = pVar.f3046c;
                if (i17 >= 0 && i17 < yVar.b()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    ((j.b) cVar).a(pVar.f3046c, this.f2843u[i16]);
                    pVar.f3046c += pVar.f3047d;
                } else {
                    return;
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final int computeHorizontalScrollExtent(RecyclerView.y yVar) {
        return computeScrollExtent(yVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final int computeHorizontalScrollOffset(RecyclerView.y yVar) {
        return computeScrollOffset(yVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final int computeHorizontalScrollRange(RecyclerView.y yVar) {
        return computeScrollRange(yVar);
    }

    public final int computeScrollExtent(RecyclerView.y yVar) {
        if (getChildCount() == 0) {
            return 0;
        }
        v vVar = this.f2827c;
        boolean z10 = this.f2842t;
        return a0.a(yVar, vVar, e(!z10), d(!z10), this, this.f2842t);
    }

    public final int computeScrollOffset(RecyclerView.y yVar) {
        if (getChildCount() == 0) {
            return 0;
        }
        v vVar = this.f2827c;
        boolean z10 = this.f2842t;
        return a0.b(yVar, vVar, e(!z10), d(!z10), this, this.f2842t, this.f2832i);
    }

    public final int computeScrollRange(RecyclerView.y yVar) {
        if (getChildCount() == 0) {
            return 0;
        }
        v vVar = this.f2827c;
        boolean z10 = this.f2842t;
        return a0.c(yVar, vVar, e(!z10), d(!z10), this, this.f2842t);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.x.b
    public final PointF computeScrollVectorForPosition(int i6) {
        int a10 = a(i6);
        PointF pointF = new PointF();
        if (a10 == 0) {
            return null;
        }
        if (this.f2829e == 0) {
            pointF.x = a10;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = a10;
        }
        return pointF;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final int computeVerticalScrollExtent(RecyclerView.y yVar) {
        return computeScrollExtent(yVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final int computeVerticalScrollOffset(RecyclerView.y yVar) {
        return computeScrollOffset(yVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final int computeVerticalScrollRange(RecyclerView.y yVar) {
        return computeScrollRange(yVar);
    }

    public final View d(boolean z10) {
        int k10 = this.f2827c.k();
        int g5 = this.f2827c.g();
        View view = null;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            int e10 = this.f2827c.e(childAt);
            int b10 = this.f2827c.b(childAt);
            if (b10 > k10 && e10 < g5) {
                if (b10 > g5 && z10) {
                    if (view == null) {
                        view = childAt;
                    }
                } else {
                    return childAt;
                }
            }
        }
        return view;
    }

    public final View e(boolean z10) {
        int k10 = this.f2827c.k();
        int g5 = this.f2827c.g();
        int childCount = getChildCount();
        View view = null;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            int e10 = this.f2827c.e(childAt);
            if (this.f2827c.b(childAt) > k10 && e10 < g5) {
                if (e10 < k10 && z10) {
                    if (view == null) {
                        view = childAt;
                    }
                } else {
                    return childAt;
                }
            }
        }
        return view;
    }

    public final void f(RecyclerView.t tVar, RecyclerView.y yVar, boolean z10) {
        int g5;
        int j10 = j(LinearLayoutManager.INVALID_OFFSET);
        if (j10 != Integer.MIN_VALUE && (g5 = this.f2827c.g() - j10) > 0) {
            int i6 = g5 - (-scrollBy(-g5, tVar, yVar));
            if (z10 && i6 > 0) {
                this.f2827c.o(i6);
            }
        }
    }

    public final void g(RecyclerView.t tVar, RecyclerView.y yVar, boolean z10) {
        int k10;
        int k11 = k(SubsamplingScaleImageView.TILE_SIZE_AUTO);
        if (k11 != Integer.MAX_VALUE && (k10 = k11 - this.f2827c.k()) > 0) {
            int scrollBy = k10 - scrollBy(k10, tVar, yVar);
            if (z10 && scrollBy > 0) {
                this.f2827c.o(-scrollBy);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final RecyclerView.n generateDefaultLayoutParams() {
        if (this.f2829e == 0) {
            return new c(-2, -1);
        }
        return new c(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final RecyclerView.n generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    public final int h() {
        if (getChildCount() == 0) {
            return 0;
        }
        return getPosition(getChildAt(0));
    }

    public final int i() {
        int childCount = getChildCount();
        if (childCount == 0) {
            return 0;
        }
        return getPosition(getChildAt(childCount - 1));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final boolean isAutoMeasureEnabled() {
        if (this.f2837n != 0) {
            return true;
        }
        return false;
    }

    public final boolean isLayoutRTL() {
        if (getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }

    public final int j(int i6) {
        int f2 = this.f2826b[0].f(i6);
        for (int i10 = 1; i10 < this.f2825a; i10++) {
            int f10 = this.f2826b[i10].f(i6);
            if (f10 > f2) {
                f2 = f10;
            }
        }
        return f2;
    }

    public final int k(int i6) {
        int i10 = this.f2826b[0].i(i6);
        for (int i11 = 1; i11 < this.f2825a; i11++) {
            int i12 = this.f2826b[i11].i(i6);
            if (i12 < i10) {
                i10 = i12;
            }
        }
        return i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(int i6, int i10, int i11) {
        int h10;
        int i12;
        int i13;
        int i14;
        if (this.f2832i) {
            h10 = i();
        } else {
            h10 = h();
        }
        if (i11 == 8) {
            if (i6 < i10) {
                i12 = i10 + 1;
            } else {
                i12 = i6 + 1;
                i13 = i10;
                d dVar = this.f2836m;
                dVar.c(i13);
                if (i11 == 1) {
                    if (i11 != 2) {
                        if (i11 == 8) {
                            dVar.e(i6, 1);
                            dVar.d(i10, 1);
                        }
                    } else {
                        dVar.e(i6, i10);
                    }
                } else {
                    dVar.d(i6, i10);
                }
                if (i12 > h10) {
                    return;
                }
                if (this.f2832i) {
                    i14 = h();
                } else {
                    i14 = i();
                }
                if (i13 <= i14) {
                    requestLayout();
                    return;
                }
                return;
            }
        } else {
            i12 = i6 + i10;
        }
        i13 = i6;
        d dVar2 = this.f2836m;
        dVar2.c(i13);
        if (i11 == 1) {
        }
        if (i12 > h10) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d1, code lost:
        if (r10 == r11) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00e3, code lost:
        if (r10 == r11) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00e5, code lost:
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e7, code lost:
        r10 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View m() {
        char c10;
        int i6;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int childCount = getChildCount() - 1;
        BitSet bitSet = new BitSet(this.f2825a);
        bitSet.set(0, this.f2825a, true);
        int i10 = -1;
        if (this.f2829e == 1 && isLayoutRTL()) {
            c10 = 1;
        } else {
            c10 = 65535;
        }
        if (this.f2832i) {
            i6 = -1;
        } else {
            i6 = childCount + 1;
            childCount = 0;
        }
        if (childCount < i6) {
            i10 = 1;
        }
        while (childCount != i6) {
            View childAt = getChildAt(childCount);
            c cVar = (c) childAt.getLayoutParams();
            if (bitSet.get(cVar.f2852e.f2869e)) {
                f fVar = cVar.f2852e;
                if (this.f2832i) {
                    int i11 = fVar.f2867c;
                    if (i11 == Integer.MIN_VALUE) {
                        fVar.a();
                        i11 = fVar.f2867c;
                    }
                    if (i11 < this.f2827c.g()) {
                        ArrayList<View> arrayList = fVar.f2865a;
                        f.h(arrayList.get(arrayList.size() - 1)).getClass();
                        z13 = true;
                    }
                    z13 = false;
                } else {
                    int i12 = fVar.f2866b;
                    if (i12 == Integer.MIN_VALUE) {
                        View view = fVar.f2865a.get(0);
                        c h10 = f.h(view);
                        fVar.f2866b = StaggeredGridLayoutManager.this.f2827c.e(view);
                        h10.getClass();
                        i12 = fVar.f2866b;
                    }
                    if (i12 > this.f2827c.k()) {
                        f.h(fVar.f2865a.get(0)).getClass();
                        z13 = true;
                    }
                    z13 = false;
                }
                if (z13) {
                    return childAt;
                }
                bitSet.clear(cVar.f2852e.f2869e);
            }
            childCount += i10;
            if (childCount != i6) {
                View childAt2 = getChildAt(childCount);
                if (this.f2832i) {
                    int b10 = this.f2827c.b(childAt);
                    int b11 = this.f2827c.b(childAt2);
                    if (b10 < b11) {
                        return childAt;
                    }
                } else {
                    int e10 = this.f2827c.e(childAt);
                    int e11 = this.f2827c.e(childAt2);
                    if (e10 > e11) {
                        return childAt;
                    }
                }
                if (z10) {
                    if (cVar.f2852e.f2869e - ((c) childAt2.getLayoutParams()).f2852e.f2869e < 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (c10 < 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z11 != z12) {
                        return childAt;
                    }
                } else {
                    continue;
                }
            }
        }
        return null;
    }

    public final void n(View view, int i6, int i10, boolean z10) {
        Rect rect = this.r;
        calculateItemDecorationsForChild(view, rect);
        c cVar = (c) view.getLayoutParams();
        int x10 = x(i6, ((ViewGroup.MarginLayoutParams) cVar).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) cVar).rightMargin + rect.right);
        int x11 = x(i10, ((ViewGroup.MarginLayoutParams) cVar).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) cVar).bottomMargin + rect.bottom);
        if (shouldMeasureChild(view, x10, x11, cVar)) {
            view.measure(x10, x11);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:248:0x0408, code lost:
        if (b() != false) goto L259;
     */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o(RecyclerView.t tVar, RecyclerView.y yVar, boolean z10) {
        boolean z11;
        boolean z12;
        e eVar;
        int i6;
        boolean z13;
        int i10;
        int i11;
        boolean z14;
        int k10;
        int h10;
        int k11;
        int k12;
        e eVar2 = this.f2840q;
        b bVar = this.f2841s;
        if ((eVar2 != null || this.f2834k != -1) && yVar.b() == 0) {
            removeAndRecycleAllViews(tVar);
            bVar.a();
            return;
        }
        boolean z15 = true;
        if (bVar.f2850e && this.f2834k == -1 && this.f2840q == null) {
            z11 = false;
        } else {
            z11 = true;
        }
        StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
        d dVar = this.f2836m;
        if (z11) {
            bVar.a();
            e eVar3 = this.f2840q;
            if (eVar3 != null) {
                int i12 = eVar3.f2861w;
                if (i12 > 0) {
                    if (i12 == this.f2825a) {
                        for (int i13 = 0; i13 < this.f2825a; i13++) {
                            this.f2826b[i13].b();
                            e eVar4 = this.f2840q;
                            int i14 = eVar4.f2862x[i13];
                            if (i14 != Integer.MIN_VALUE) {
                                if (eVar4.C) {
                                    k12 = this.f2827c.g();
                                } else {
                                    k12 = this.f2827c.k();
                                }
                                i14 += k12;
                            }
                            f fVar = this.f2826b[i13];
                            fVar.f2866b = i14;
                            fVar.f2867c = i14;
                        }
                    } else {
                        eVar3.f2862x = null;
                        eVar3.f2861w = 0;
                        eVar3.f2863y = 0;
                        eVar3.f2864z = null;
                        eVar3.A = null;
                        eVar3.f2859u = eVar3.f2860v;
                    }
                }
                e eVar5 = this.f2840q;
                this.f2839p = eVar5.D;
                boolean z16 = eVar5.B;
                assertNotInLayoutOrScroll(null);
                e eVar6 = this.f2840q;
                if (eVar6 != null && eVar6.B != z16) {
                    eVar6.B = z16;
                }
                this.f2831h = z16;
                requestLayout();
                resolveShouldLayoutReverse();
                e eVar7 = this.f2840q;
                int i15 = eVar7.f2859u;
                if (i15 != -1) {
                    this.f2834k = i15;
                    bVar.f2848c = eVar7.C;
                } else {
                    bVar.f2848c = this.f2832i;
                }
                if (eVar7.f2863y > 1) {
                    dVar.f2853a = eVar7.f2864z;
                    dVar.f2854b = eVar7.A;
                }
            } else {
                resolveShouldLayoutReverse();
                bVar.f2848c = this.f2832i;
            }
            if (!yVar.f2817g && (i11 = this.f2834k) != -1) {
                if (i11 >= 0 && i11 < yVar.b()) {
                    e eVar8 = this.f2840q;
                    if (eVar8 != null && eVar8.f2859u != -1 && eVar8.f2861w >= 1) {
                        bVar.f2847b = LinearLayoutManager.INVALID_OFFSET;
                        bVar.f2846a = this.f2834k;
                    } else {
                        View findViewByPosition = findViewByPosition(this.f2834k);
                        if (findViewByPosition != null) {
                            if (this.f2832i) {
                                h10 = i();
                            } else {
                                h10 = h();
                            }
                            bVar.f2846a = h10;
                            if (this.f2835l != Integer.MIN_VALUE) {
                                if (bVar.f2848c) {
                                    bVar.f2847b = (this.f2827c.g() - this.f2835l) - this.f2827c.b(findViewByPosition);
                                } else {
                                    bVar.f2847b = (this.f2827c.k() + this.f2835l) - this.f2827c.e(findViewByPosition);
                                }
                            } else if (this.f2827c.c(findViewByPosition) > this.f2827c.l()) {
                                if (bVar.f2848c) {
                                    k11 = this.f2827c.g();
                                } else {
                                    k11 = this.f2827c.k();
                                }
                                bVar.f2847b = k11;
                            } else {
                                int e10 = this.f2827c.e(findViewByPosition) - this.f2827c.k();
                                if (e10 < 0) {
                                    bVar.f2847b = -e10;
                                } else {
                                    int g5 = this.f2827c.g() - this.f2827c.b(findViewByPosition);
                                    if (g5 < 0) {
                                        bVar.f2847b = g5;
                                    } else {
                                        bVar.f2847b = LinearLayoutManager.INVALID_OFFSET;
                                    }
                                }
                            }
                        } else {
                            int i16 = this.f2834k;
                            bVar.f2846a = i16;
                            int i17 = this.f2835l;
                            if (i17 == Integer.MIN_VALUE) {
                                if (a(i16) == 1) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                bVar.f2848c = z14;
                                if (z14) {
                                    k10 = staggeredGridLayoutManager.f2827c.g();
                                } else {
                                    k10 = staggeredGridLayoutManager.f2827c.k();
                                }
                                bVar.f2847b = k10;
                            } else if (bVar.f2848c) {
                                bVar.f2847b = staggeredGridLayoutManager.f2827c.g() - i17;
                            } else {
                                bVar.f2847b = staggeredGridLayoutManager.f2827c.k() + i17;
                            }
                            bVar.f2849d = true;
                        }
                    }
                    z13 = true;
                    if (!z13) {
                        if (this.f2838o) {
                            int b10 = yVar.b();
                            int childCount = getChildCount();
                            while (true) {
                                childCount--;
                                if (childCount < 0) {
                                    break;
                                }
                                i10 = getPosition(getChildAt(childCount));
                                if (i10 >= 0 && i10 < b10) {
                                    break;
                                }
                            }
                            i10 = 0;
                            bVar.f2846a = i10;
                            bVar.f2847b = LinearLayoutManager.INVALID_OFFSET;
                        } else {
                            int b11 = yVar.b();
                            int childCount2 = getChildCount();
                            for (int i18 = 0; i18 < childCount2; i18++) {
                                int position = getPosition(getChildAt(i18));
                                if (position >= 0 && position < b11) {
                                    i10 = position;
                                    break;
                                }
                            }
                            i10 = 0;
                            bVar.f2846a = i10;
                            bVar.f2847b = LinearLayoutManager.INVALID_OFFSET;
                        }
                    }
                    bVar.f2850e = true;
                } else {
                    this.f2834k = -1;
                    this.f2835l = LinearLayoutManager.INVALID_OFFSET;
                }
            }
            z13 = false;
            if (!z13) {
            }
            bVar.f2850e = true;
        }
        if (this.f2840q == null && this.f2834k == -1 && (bVar.f2848c != this.f2838o || isLayoutRTL() != this.f2839p)) {
            dVar.a();
            bVar.f2849d = true;
        }
        if (getChildCount() > 0 && ((eVar = this.f2840q) == null || eVar.f2861w < 1)) {
            if (bVar.f2849d) {
                for (int i19 = 0; i19 < this.f2825a; i19++) {
                    this.f2826b[i19].b();
                    int i20 = bVar.f2847b;
                    if (i20 != Integer.MIN_VALUE) {
                        f fVar2 = this.f2826b[i19];
                        fVar2.f2866b = i20;
                        fVar2.f2867c = i20;
                    }
                }
            } else if (!z11 && bVar.f != null) {
                for (int i21 = 0; i21 < this.f2825a; i21++) {
                    f fVar3 = this.f2826b[i21];
                    fVar3.b();
                    int i22 = bVar.f[i21];
                    fVar3.f2866b = i22;
                    fVar3.f2867c = i22;
                }
            } else {
                for (int i23 = 0; i23 < this.f2825a; i23++) {
                    f fVar4 = this.f2826b[i23];
                    boolean z17 = this.f2832i;
                    int i24 = bVar.f2847b;
                    if (z17) {
                        i6 = fVar4.f(LinearLayoutManager.INVALID_OFFSET);
                    } else {
                        i6 = fVar4.i(LinearLayoutManager.INVALID_OFFSET);
                    }
                    fVar4.b();
                    if (i6 != Integer.MIN_VALUE) {
                        StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                        if ((!z17 || i6 >= staggeredGridLayoutManager2.f2827c.g()) && (z17 || i6 <= staggeredGridLayoutManager2.f2827c.k())) {
                            if (i24 != Integer.MIN_VALUE) {
                                i6 += i24;
                            }
                            fVar4.f2867c = i6;
                            fVar4.f2866b = i6;
                        }
                    }
                }
                f[] fVarArr = this.f2826b;
                int length = fVarArr.length;
                int[] iArr = bVar.f;
                if (iArr == null || iArr.length < length) {
                    bVar.f = new int[staggeredGridLayoutManager.f2826b.length];
                }
                for (int i25 = 0; i25 < length; i25++) {
                    bVar.f[i25] = fVarArr[i25].i(LinearLayoutManager.INVALID_OFFSET);
                }
            }
        }
        detachAndScrapAttachedViews(tVar);
        p pVar = this.f2830g;
        pVar.f3044a = false;
        int l2 = this.f2828d.l();
        this.f = l2 / this.f2825a;
        View.MeasureSpec.makeMeasureSpec(l2, this.f2828d.i());
        v(bVar.f2846a, yVar);
        if (bVar.f2848c) {
            u(-1);
            c(tVar, pVar, yVar);
            u(1);
            pVar.f3046c = bVar.f2846a + pVar.f3047d;
            c(tVar, pVar, yVar);
        } else {
            u(1);
            c(tVar, pVar, yVar);
            u(-1);
            pVar.f3046c = bVar.f2846a + pVar.f3047d;
            c(tVar, pVar, yVar);
        }
        if (this.f2828d.i() != 1073741824) {
            int childCount3 = getChildCount();
            float f2 = 0.0f;
            for (int i26 = 0; i26 < childCount3; i26++) {
                View childAt = getChildAt(i26);
                float c10 = this.f2828d.c(childAt);
                if (c10 >= f2) {
                    ((c) childAt.getLayoutParams()).getClass();
                    f2 = Math.max(f2, c10);
                }
            }
            int i27 = this.f;
            int round = Math.round(f2 * this.f2825a);
            if (this.f2828d.i() == Integer.MIN_VALUE) {
                round = Math.min(round, this.f2828d.l());
            }
            this.f = round / this.f2825a;
            View.MeasureSpec.makeMeasureSpec(round, this.f2828d.i());
            if (this.f != i27) {
                for (int i28 = 0; i28 < childCount3; i28++) {
                    View childAt2 = getChildAt(i28);
                    c cVar = (c) childAt2.getLayoutParams();
                    cVar.getClass();
                    if (isLayoutRTL() && this.f2829e == 1) {
                        int i29 = this.f2825a;
                        int i30 = cVar.f2852e.f2869e;
                        childAt2.offsetLeftAndRight(((-((i29 - 1) - i30)) * this.f) - ((-((i29 - 1) - i30)) * i27));
                    } else {
                        int i31 = cVar.f2852e.f2869e;
                        int i32 = this.f * i31;
                        int i33 = i31 * i27;
                        if (this.f2829e == 1) {
                            childAt2.offsetLeftAndRight(i32 - i33);
                        } else {
                            childAt2.offsetTopAndBottom(i32 - i33);
                        }
                    }
                }
            }
        }
        if (getChildCount() > 0) {
            if (this.f2832i) {
                f(tVar, yVar, true);
                g(tVar, yVar, false);
            } else {
                g(tVar, yVar, true);
                f(tVar, yVar, false);
            }
        }
        if (z10 && !yVar.f2817g) {
            if (this.f2837n != 0 && getChildCount() > 0 && m() != null) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12) {
                removeCallbacks(this.f2844v);
            }
        }
        z15 = false;
        if (yVar.f2817g) {
            bVar.a();
        }
        this.f2838o = bVar.f2848c;
        this.f2839p = isLayoutRTL();
        if (z15) {
            bVar.a();
            o(tVar, yVar, false);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void offsetChildrenHorizontal(int i6) {
        super.offsetChildrenHorizontal(i6);
        for (int i10 = 0; i10 < this.f2825a; i10++) {
            f fVar = this.f2826b[i10];
            int i11 = fVar.f2866b;
            if (i11 != Integer.MIN_VALUE) {
                fVar.f2866b = i11 + i6;
            }
            int i12 = fVar.f2867c;
            if (i12 != Integer.MIN_VALUE) {
                fVar.f2867c = i12 + i6;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void offsetChildrenVertical(int i6) {
        super.offsetChildrenVertical(i6);
        for (int i10 = 0; i10 < this.f2825a; i10++) {
            f fVar = this.f2826b[i10];
            int i11 = fVar.f2866b;
            if (i11 != Integer.MIN_VALUE) {
                fVar.f2866b = i11 + i6;
            }
            int i12 = fVar.f2867c;
            if (i12 != Integer.MIN_VALUE) {
                fVar.f2867c = i12 + i6;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void onAdapterChanged(RecyclerView.e eVar, RecyclerView.e eVar2) {
        this.f2836m.a();
        for (int i6 = 0; i6 < this.f2825a; i6++) {
            this.f2826b[i6].b();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.t tVar) {
        super.onDetachedFromWindow(recyclerView, tVar);
        removeCallbacks(this.f2844v);
        for (int i6 = 0; i6 < this.f2825a; i6++) {
            this.f2826b[i6].b();
        }
        recyclerView.requestLayout();
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x003c, code lost:
        if (r8.f2829e == 1) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0042, code lost:
        if (r8.f2829e == 0) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x004e, code lost:
        if (isLayoutRTL() == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x005a, code lost:
        if (isLayoutRTL() == false) goto L111;
     */
    @Override // androidx.recyclerview.widget.RecyclerView.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View onFocusSearchFailed(View view, int i6, RecyclerView.t tVar, RecyclerView.y yVar) {
        View findContainingItemView;
        int i10;
        int h10;
        boolean z10;
        boolean z11;
        int d10;
        int d11;
        int d12;
        if (getChildCount() == 0 || (findContainingItemView = findContainingItemView(view)) == null) {
            return null;
        }
        resolveShouldLayoutReverse();
        if (i6 != 1) {
            if (i6 != 2) {
                if (i6 != 17) {
                    if (i6 != 33) {
                        if (i6 == 66) {
                        }
                    }
                    i10 = LinearLayoutManager.INVALID_OFFSET;
                }
            } else {
                if (this.f2829e != 1) {
                }
                i10 = 1;
            }
        } else {
            if (this.f2829e != 1) {
            }
            i10 = -1;
        }
        if (i10 == Integer.MIN_VALUE) {
            return null;
        }
        c cVar = (c) findContainingItemView.getLayoutParams();
        cVar.getClass();
        f fVar = cVar.f2852e;
        if (i10 == 1) {
            h10 = i();
        } else {
            h10 = h();
        }
        v(h10, yVar);
        u(i10);
        p pVar = this.f2830g;
        pVar.f3046c = pVar.f3047d + h10;
        pVar.f3045b = (int) (this.f2827c.l() * 0.33333334f);
        pVar.f3050h = true;
        pVar.f3044a = false;
        c(tVar, pVar, yVar);
        this.f2838o = this.f2832i;
        View g5 = fVar.g(h10, i10);
        if (g5 != null && g5 != findContainingItemView) {
            return g5;
        }
        if (p(i10)) {
            for (int i11 = this.f2825a - 1; i11 >= 0; i11--) {
                View g10 = this.f2826b[i11].g(h10, i10);
                if (g10 != null && g10 != findContainingItemView) {
                    return g10;
                }
            }
        } else {
            for (int i12 = 0; i12 < this.f2825a; i12++) {
                View g11 = this.f2826b[i12].g(h10, i10);
                if (g11 != null && g11 != findContainingItemView) {
                    return g11;
                }
            }
        }
        boolean z12 = !this.f2831h;
        if (i10 == -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z12 == z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            d10 = fVar.c();
        } else {
            d10 = fVar.d();
        }
        View findViewByPosition = findViewByPosition(d10);
        if (findViewByPosition != null && findViewByPosition != findContainingItemView) {
            return findViewByPosition;
        }
        if (p(i10)) {
            for (int i13 = this.f2825a - 1; i13 >= 0; i13--) {
                if (i13 != fVar.f2869e) {
                    if (z11) {
                        d12 = this.f2826b[i13].c();
                    } else {
                        d12 = this.f2826b[i13].d();
                    }
                    View findViewByPosition2 = findViewByPosition(d12);
                    if (findViewByPosition2 != null && findViewByPosition2 != findContainingItemView) {
                        return findViewByPosition2;
                    }
                }
            }
        } else {
            for (int i14 = 0; i14 < this.f2825a; i14++) {
                if (z11) {
                    d11 = this.f2826b[i14].c();
                } else {
                    d11 = this.f2826b[i14].d();
                }
                View findViewByPosition3 = findViewByPosition(d11);
                if (findViewByPosition3 != null && findViewByPosition3 != findContainingItemView) {
                    return findViewByPosition3;
                }
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            View e10 = e(false);
            View d10 = d(false);
            if (e10 != null && d10 != null) {
                int position = getPosition(e10);
                int position2 = getPosition(d10);
                if (position < position2) {
                    accessibilityEvent.setFromIndex(position);
                    accessibilityEvent.setToIndex(position2);
                    return;
                }
                accessibilityEvent.setFromIndex(position2);
                accessibilityEvent.setToIndex(position);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void onItemsAdded(RecyclerView recyclerView, int i6, int i10) {
        l(i6, i10, 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void onItemsChanged(RecyclerView recyclerView) {
        this.f2836m.a();
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void onItemsMoved(RecyclerView recyclerView, int i6, int i10, int i11) {
        l(i6, i10, 8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void onItemsRemoved(RecyclerView recyclerView, int i6, int i10) {
        l(i6, i10, 2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void onItemsUpdated(RecyclerView recyclerView, int i6, int i10, Object obj) {
        l(i6, i10, 4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void onLayoutChildren(RecyclerView.t tVar, RecyclerView.y yVar) {
        o(tVar, yVar, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void onLayoutCompleted(RecyclerView.y yVar) {
        super.onLayoutCompleted(yVar);
        this.f2834k = -1;
        this.f2835l = LinearLayoutManager.INVALID_OFFSET;
        this.f2840q = null;
        this.f2841s.a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof e) {
            e eVar = (e) parcelable;
            this.f2840q = eVar;
            if (this.f2834k != -1) {
                eVar.f2862x = null;
                eVar.f2861w = 0;
                eVar.f2859u = -1;
                eVar.f2860v = -1;
                eVar.f2862x = null;
                eVar.f2861w = 0;
                eVar.f2863y = 0;
                eVar.f2864z = null;
                eVar.A = null;
            }
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final Parcelable onSaveInstanceState() {
        int h10;
        View e10;
        int i6;
        int k10;
        int[] iArr;
        e eVar = this.f2840q;
        if (eVar != null) {
            return new e(eVar);
        }
        e eVar2 = new e();
        eVar2.B = this.f2831h;
        eVar2.C = this.f2838o;
        eVar2.D = this.f2839p;
        d dVar = this.f2836m;
        if (dVar != null && (iArr = dVar.f2853a) != null) {
            eVar2.f2864z = iArr;
            eVar2.f2863y = iArr.length;
            eVar2.A = dVar.f2854b;
        } else {
            eVar2.f2863y = 0;
        }
        int i10 = -1;
        if (getChildCount() > 0) {
            if (this.f2838o) {
                h10 = i();
            } else {
                h10 = h();
            }
            eVar2.f2859u = h10;
            if (this.f2832i) {
                e10 = d(true);
            } else {
                e10 = e(true);
            }
            if (e10 != null) {
                i10 = getPosition(e10);
            }
            eVar2.f2860v = i10;
            int i11 = this.f2825a;
            eVar2.f2861w = i11;
            eVar2.f2862x = new int[i11];
            for (int i12 = 0; i12 < this.f2825a; i12++) {
                if (this.f2838o) {
                    i6 = this.f2826b[i12].f(LinearLayoutManager.INVALID_OFFSET);
                    if (i6 != Integer.MIN_VALUE) {
                        k10 = this.f2827c.g();
                        i6 -= k10;
                        eVar2.f2862x[i12] = i6;
                    } else {
                        eVar2.f2862x[i12] = i6;
                    }
                } else {
                    i6 = this.f2826b[i12].i(LinearLayoutManager.INVALID_OFFSET);
                    if (i6 != Integer.MIN_VALUE) {
                        k10 = this.f2827c.k();
                        i6 -= k10;
                        eVar2.f2862x[i12] = i6;
                    } else {
                        eVar2.f2862x[i12] = i6;
                    }
                }
            }
        } else {
            eVar2.f2859u = -1;
            eVar2.f2860v = -1;
            eVar2.f2861w = 0;
        }
        return eVar2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void onScrollStateChanged(int i6) {
        if (i6 == 0) {
            b();
        }
    }

    public final boolean p(int i6) {
        boolean z10;
        boolean z11;
        boolean z12;
        if (this.f2829e == 0) {
            if (i6 == -1) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12 != this.f2832i) {
                return true;
            }
            return false;
        }
        if (i6 == -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 == this.f2832i) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 == isLayoutRTL()) {
            return true;
        }
        return false;
    }

    public final void q(int i6, RecyclerView.y yVar) {
        int h10;
        int i10;
        if (i6 > 0) {
            h10 = i();
            i10 = 1;
        } else {
            h10 = h();
            i10 = -1;
        }
        p pVar = this.f2830g;
        pVar.f3044a = true;
        v(h10, yVar);
        u(i10);
        pVar.f3046c = h10 + pVar.f3047d;
        pVar.f3045b = Math.abs(i6);
    }

    public final void r(RecyclerView.t tVar, p pVar) {
        int min;
        int min2;
        if (pVar.f3044a && !pVar.f3051i) {
            if (pVar.f3045b == 0) {
                if (pVar.f3048e == -1) {
                    s(pVar.f3049g, tVar);
                    return;
                } else {
                    t(pVar.f, tVar);
                    return;
                }
            }
            int i6 = 1;
            if (pVar.f3048e == -1) {
                int i10 = pVar.f;
                int i11 = this.f2826b[0].i(i10);
                while (i6 < this.f2825a) {
                    int i12 = this.f2826b[i6].i(i10);
                    if (i12 > i11) {
                        i11 = i12;
                    }
                    i6++;
                }
                int i13 = i10 - i11;
                if (i13 < 0) {
                    min2 = pVar.f3049g;
                } else {
                    min2 = pVar.f3049g - Math.min(i13, pVar.f3045b);
                }
                s(min2, tVar);
                return;
            }
            int i14 = pVar.f3049g;
            int f2 = this.f2826b[0].f(i14);
            while (i6 < this.f2825a) {
                int f10 = this.f2826b[i6].f(i14);
                if (f10 < f2) {
                    f2 = f10;
                }
                i6++;
            }
            int i15 = f2 - pVar.f3049g;
            if (i15 < 0) {
                min = pVar.f;
            } else {
                min = Math.min(i15, pVar.f3045b) + pVar.f;
            }
            t(min, tVar);
        }
    }

    public final void resolveShouldLayoutReverse() {
        if (this.f2829e != 1 && isLayoutRTL()) {
            this.f2832i = !this.f2831h;
        } else {
            this.f2832i = this.f2831h;
        }
    }

    public final void s(int i6, RecyclerView.t tVar) {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (this.f2827c.e(childAt) >= i6 && this.f2827c.n(childAt) >= i6) {
                c cVar = (c) childAt.getLayoutParams();
                cVar.getClass();
                if (cVar.f2852e.f2865a.size() == 1) {
                    return;
                }
                f fVar = cVar.f2852e;
                ArrayList<View> arrayList = fVar.f2865a;
                int size = arrayList.size();
                View remove = arrayList.remove(size - 1);
                c h10 = f.h(remove);
                h10.f2852e = null;
                if (h10.c() || h10.b()) {
                    fVar.f2868d -= StaggeredGridLayoutManager.this.f2827c.c(remove);
                }
                if (size == 1) {
                    fVar.f2866b = LinearLayoutManager.INVALID_OFFSET;
                }
                fVar.f2867c = LinearLayoutManager.INVALID_OFFSET;
                removeAndRecycleView(childAt, tVar);
            } else {
                return;
            }
        }
    }

    public final int scrollBy(int i6, RecyclerView.t tVar, RecyclerView.y yVar) {
        if (getChildCount() == 0 || i6 == 0) {
            return 0;
        }
        q(i6, yVar);
        p pVar = this.f2830g;
        int c10 = c(tVar, pVar, yVar);
        if (pVar.f3045b >= c10) {
            if (i6 < 0) {
                i6 = -c10;
            } else {
                i6 = c10;
            }
        }
        this.f2827c.o(-i6);
        this.f2838o = this.f2832i;
        pVar.f3045b = 0;
        r(tVar, pVar);
        return i6;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final int scrollHorizontallyBy(int i6, RecyclerView.t tVar, RecyclerView.y yVar) {
        return scrollBy(i6, tVar, yVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void scrollToPosition(int i6) {
        e eVar = this.f2840q;
        if (eVar != null && eVar.f2859u != i6) {
            eVar.f2862x = null;
            eVar.f2861w = 0;
            eVar.f2859u = -1;
            eVar.f2860v = -1;
        }
        this.f2834k = i6;
        this.f2835l = LinearLayoutManager.INVALID_OFFSET;
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final int scrollVerticallyBy(int i6, RecyclerView.t tVar, RecyclerView.y yVar) {
        return scrollBy(i6, tVar, yVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void setMeasuredDimension(Rect rect, int i6, int i10) {
        int chooseSize;
        int chooseSize2;
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (this.f2829e == 1) {
            chooseSize2 = RecyclerView.m.chooseSize(i10, rect.height() + paddingBottom, getMinimumHeight());
            chooseSize = RecyclerView.m.chooseSize(i6, (this.f * this.f2825a) + paddingRight, getMinimumWidth());
        } else {
            chooseSize = RecyclerView.m.chooseSize(i6, rect.width() + paddingRight, getMinimumWidth());
            chooseSize2 = RecyclerView.m.chooseSize(i10, (this.f * this.f2825a) + paddingBottom, getMinimumHeight());
        }
        setMeasuredDimension(chooseSize, chooseSize2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.y yVar, int i6) {
        q qVar = new q(recyclerView.getContext());
        qVar.setTargetPosition(i6);
        startSmoothScroll(qVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final boolean supportsPredictiveItemAnimations() {
        if (this.f2840q == null) {
            return true;
        }
        return false;
    }

    public final void t(int i6, RecyclerView.t tVar) {
        while (getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (this.f2827c.b(childAt) <= i6 && this.f2827c.m(childAt) <= i6) {
                c cVar = (c) childAt.getLayoutParams();
                cVar.getClass();
                if (cVar.f2852e.f2865a.size() == 1) {
                    return;
                }
                f fVar = cVar.f2852e;
                ArrayList<View> arrayList = fVar.f2865a;
                View remove = arrayList.remove(0);
                c h10 = f.h(remove);
                h10.f2852e = null;
                if (arrayList.size() == 0) {
                    fVar.f2867c = LinearLayoutManager.INVALID_OFFSET;
                }
                if (h10.c() || h10.b()) {
                    fVar.f2868d -= StaggeredGridLayoutManager.this.f2827c.c(remove);
                }
                fVar.f2866b = LinearLayoutManager.INVALID_OFFSET;
                removeAndRecycleView(childAt, tVar);
            } else {
                return;
            }
        }
    }

    public final void u(int i6) {
        boolean z10;
        p pVar = this.f2830g;
        pVar.f3048e = i6;
        boolean z11 = this.f2832i;
        int i10 = 1;
        if (i6 == -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z11 != z10) {
            i10 = -1;
        }
        pVar.f3047d = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(int i6, RecyclerView.y yVar) {
        int i10;
        int i11;
        int i12;
        boolean z10;
        p pVar = this.f2830g;
        boolean z11 = false;
        pVar.f3045b = 0;
        pVar.f3046c = i6;
        if (isSmoothScrolling() && (i12 = yVar.f2812a) != -1) {
            boolean z12 = this.f2832i;
            if (i12 < i6) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z12 == z10) {
                i10 = this.f2827c.l();
            } else {
                i11 = this.f2827c.l();
                i10 = 0;
                if (!getClipToPadding()) {
                    pVar.f = this.f2827c.k() - i11;
                    pVar.f3049g = this.f2827c.g() + i10;
                } else {
                    pVar.f3049g = this.f2827c.f() + i10;
                    pVar.f = -i11;
                }
                pVar.f3050h = false;
                pVar.f3044a = true;
                if (this.f2827c.i() == 0 && this.f2827c.f() == 0) {
                    z11 = true;
                }
                pVar.f3051i = z11;
            }
        } else {
            i10 = 0;
        }
        i11 = 0;
        if (!getClipToPadding()) {
        }
        pVar.f3050h = false;
        pVar.f3044a = true;
        if (this.f2827c.i() == 0) {
            z11 = true;
        }
        pVar.f3051i = z11;
    }

    public final void w(f fVar, int i6, int i10) {
        int i11 = fVar.f2868d;
        int i12 = fVar.f2869e;
        if (i6 == -1) {
            int i13 = fVar.f2866b;
            if (i13 == Integer.MIN_VALUE) {
                View view = fVar.f2865a.get(0);
                c h10 = f.h(view);
                fVar.f2866b = StaggeredGridLayoutManager.this.f2827c.e(view);
                h10.getClass();
                i13 = fVar.f2866b;
            }
            if (i13 + i11 <= i10) {
                this.f2833j.set(i12, false);
                return;
            }
            return;
        }
        int i14 = fVar.f2867c;
        if (i14 == Integer.MIN_VALUE) {
            fVar.a();
            i14 = fVar.f2867c;
        }
        if (i14 - i11 >= i10) {
            this.f2833j.set(i12, false);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final RecyclerView.n generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new c((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new c(layoutParams);
    }

    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public int[] f2853a;

        /* renamed from: b  reason: collision with root package name */
        public List<a> f2854b;

        public final void a() {
            int[] iArr = this.f2853a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f2854b = null;
        }

        public final void b(int i6) {
            int[] iArr = this.f2853a;
            if (iArr == null) {
                int[] iArr2 = new int[Math.max(i6, 10) + 1];
                this.f2853a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i6 >= iArr.length) {
                int length = iArr.length;
                while (length <= i6) {
                    length *= 2;
                }
                int[] iArr3 = new int[length];
                this.f2853a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f2853a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:33:0x0061  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x006b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final int c(int i6) {
            int i10;
            int[] iArr = this.f2853a;
            if (iArr == null || i6 >= iArr.length) {
                return -1;
            }
            List<a> list = this.f2854b;
            if (list != null) {
                a aVar = null;
                if (list != null) {
                    int size = list.size() - 1;
                    while (true) {
                        if (size < 0) {
                            break;
                        }
                        a aVar2 = this.f2854b.get(size);
                        if (aVar2.f2855u == i6) {
                            aVar = aVar2;
                            break;
                        }
                        size--;
                    }
                }
                if (aVar != null) {
                    this.f2854b.remove(aVar);
                }
                int size2 = this.f2854b.size();
                int i11 = 0;
                while (true) {
                    if (i11 < size2) {
                        if (this.f2854b.get(i11).f2855u >= i6) {
                            break;
                        }
                        i11++;
                    } else {
                        i11 = -1;
                        break;
                    }
                }
                if (i11 != -1) {
                    this.f2854b.remove(i11);
                    i10 = this.f2854b.get(i11).f2855u;
                    if (i10 != -1) {
                        int[] iArr2 = this.f2853a;
                        Arrays.fill(iArr2, i6, iArr2.length, -1);
                        return this.f2853a.length;
                    }
                    int min = Math.min(i10 + 1, this.f2853a.length);
                    Arrays.fill(this.f2853a, i6, min, -1);
                    return min;
                }
            }
            i10 = -1;
            if (i10 != -1) {
            }
        }

        public final void d(int i6, int i10) {
            int[] iArr = this.f2853a;
            if (iArr != null && i6 < iArr.length) {
                int i11 = i6 + i10;
                b(i11);
                int[] iArr2 = this.f2853a;
                System.arraycopy(iArr2, i6, iArr2, i11, (iArr2.length - i6) - i10);
                Arrays.fill(this.f2853a, i6, i11, -1);
                List<a> list = this.f2854b;
                if (list != null) {
                    for (int size = list.size() - 1; size >= 0; size--) {
                        a aVar = this.f2854b.get(size);
                        int i12 = aVar.f2855u;
                        if (i12 >= i6) {
                            aVar.f2855u = i12 + i10;
                        }
                    }
                }
            }
        }

        public final void e(int i6, int i10) {
            int[] iArr = this.f2853a;
            if (iArr != null && i6 < iArr.length) {
                int i11 = i6 + i10;
                b(i11);
                int[] iArr2 = this.f2853a;
                System.arraycopy(iArr2, i11, iArr2, i6, (iArr2.length - i6) - i10);
                int[] iArr3 = this.f2853a;
                Arrays.fill(iArr3, iArr3.length - i10, iArr3.length, -1);
                List<a> list = this.f2854b;
                if (list != null) {
                    for (int size = list.size() - 1; size >= 0; size--) {
                        a aVar = this.f2854b.get(size);
                        int i12 = aVar.f2855u;
                        if (i12 >= i6) {
                            if (i12 < i11) {
                                this.f2854b.remove(size);
                            } else {
                                aVar.f2855u = i12 - i10;
                            }
                        }
                    }
                }
            }
        }

        /* loaded from: classes.dex */
        public static class a implements Parcelable {
            public static final Parcelable.Creator<a> CREATOR = new C0036a();

            /* renamed from: u  reason: collision with root package name */
            public int f2855u;

            /* renamed from: v  reason: collision with root package name */
            public int f2856v;

            /* renamed from: w  reason: collision with root package name */
            public int[] f2857w;

            /* renamed from: x  reason: collision with root package name */
            public boolean f2858x;

            /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public class C0036a implements Parcelable.Creator<a> {
                @Override // android.os.Parcelable.Creator
                public final a createFromParcel(Parcel parcel) {
                    return new a(parcel);
                }

                @Override // android.os.Parcelable.Creator
                public final a[] newArray(int i6) {
                    return new a[i6];
                }
            }

            public a(Parcel parcel) {
                this.f2855u = parcel.readInt();
                this.f2856v = parcel.readInt();
                this.f2858x = parcel.readInt() == 1;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    this.f2857w = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final String toString() {
                return "FullSpanItem{mPosition=" + this.f2855u + ", mGapDir=" + this.f2856v + ", mHasUnwantedGapAfter=" + this.f2858x + ", mGapPerSpan=" + Arrays.toString(this.f2857w) + '}';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i6) {
                parcel.writeInt(this.f2855u);
                parcel.writeInt(this.f2856v);
                parcel.writeInt(this.f2858x ? 1 : 0);
                int[] iArr = this.f2857w;
                if (iArr != null && iArr.length > 0) {
                    parcel.writeInt(iArr.length);
                    parcel.writeIntArray(this.f2857w);
                    return;
                }
                parcel.writeInt(0);
            }

            public a() {
            }
        }
    }
}
