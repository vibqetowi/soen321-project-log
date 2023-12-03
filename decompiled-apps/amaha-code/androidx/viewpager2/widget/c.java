package androidx.viewpager2.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Locale;
/* compiled from: ScrollEventAdapter.java */
/* loaded from: classes.dex */
public final class c extends RecyclerView.r {

    /* renamed from: a  reason: collision with root package name */
    public ViewPager2.e f3172a;

    /* renamed from: b  reason: collision with root package name */
    public final ViewPager2 f3173b;

    /* renamed from: c  reason: collision with root package name */
    public final RecyclerView f3174c;

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayoutManager f3175d;

    /* renamed from: e  reason: collision with root package name */
    public int f3176e;
    public int f;

    /* renamed from: g  reason: collision with root package name */
    public final a f3177g;

    /* renamed from: h  reason: collision with root package name */
    public int f3178h;

    /* renamed from: i  reason: collision with root package name */
    public int f3179i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f3180j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f3181k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f3182l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f3183m;

    /* compiled from: ScrollEventAdapter.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public int f3184a;

        /* renamed from: b  reason: collision with root package name */
        public float f3185b;

        /* renamed from: c  reason: collision with root package name */
        public int f3186c;
    }

    public c(ViewPager2 viewPager2) {
        this.f3173b = viewPager2;
        ViewPager2.i iVar = viewPager2.D;
        this.f3174c = iVar;
        this.f3175d = (LinearLayoutManager) iVar.getLayoutManager();
        this.f3177g = new a();
        e();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public final void a(int i6, RecyclerView recyclerView) {
        boolean z10;
        boolean z11;
        ViewPager2.e eVar;
        int i10 = this.f3176e;
        boolean z12 = true;
        if ((i10 != 1 || this.f != 1) && i6 == 1) {
            this.f3183m = false;
            this.f3176e = 1;
            int i11 = this.f3179i;
            if (i11 != -1) {
                this.f3178h = i11;
                this.f3179i = -1;
            } else if (this.f3178h == -1) {
                this.f3178h = this.f3175d.findFirstVisibleItemPosition();
            }
            d(1);
            return;
        }
        if (i10 != 1 && i10 != 4) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10 && i6 == 2) {
            if (this.f3181k) {
                d(2);
                this.f3180j = true;
                return;
            }
            return;
        }
        if (i10 != 1 && i10 != 4) {
            z11 = false;
        } else {
            z11 = true;
        }
        a aVar = this.f3177g;
        if (z11 && i6 == 0) {
            f();
            if (!this.f3181k) {
                int i12 = aVar.f3184a;
                if (i12 != -1 && (eVar = this.f3172a) != null) {
                    eVar.b(0.0f, i12, 0);
                }
            } else if (aVar.f3186c == 0) {
                int i13 = this.f3178h;
                int i14 = aVar.f3184a;
                if (i13 != i14) {
                    c(i14);
                }
            } else {
                z12 = false;
            }
            if (z12) {
                d(0);
                e();
            }
        }
        if (this.f3176e == 2 && i6 == 0 && this.f3182l) {
            f();
            if (aVar.f3186c == 0) {
                int i15 = this.f3179i;
                int i16 = aVar.f3184a;
                if (i15 != i16) {
                    if (i16 == -1) {
                        i16 = 0;
                    }
                    c(i16);
                }
                d(0);
                e();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0026, code lost:
        if (r7 == r8) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003e  */
    @Override // androidx.recyclerview.widget.RecyclerView.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(RecyclerView recyclerView, int i6, int i10) {
        boolean z10;
        int i11;
        boolean z11;
        boolean z12;
        this.f3181k = true;
        f();
        boolean z13 = this.f3180j;
        a aVar = this.f3177g;
        if (z13) {
            this.f3180j = false;
            if (i10 <= 0) {
                if (i10 == 0) {
                    if (i6 < 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (this.f3173b.A.getLayoutDirection() == 1) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                }
                z10 = false;
                if (!z10 && aVar.f3186c != 0) {
                    i11 = aVar.f3184a + 1;
                } else {
                    i11 = aVar.f3184a;
                }
                this.f3179i = i11;
                if (this.f3178h != i11) {
                    c(i11);
                }
            }
            z10 = true;
            if (!z10) {
            }
            i11 = aVar.f3184a;
            this.f3179i = i11;
            if (this.f3178h != i11) {
            }
        } else if (this.f3176e == 0) {
            int i12 = aVar.f3184a;
            if (i12 == -1) {
                i12 = 0;
            }
            c(i12);
        }
        int i13 = aVar.f3184a;
        if (i13 == -1) {
            i13 = 0;
        }
        float f = aVar.f3185b;
        int i14 = aVar.f3186c;
        ViewPager2.e eVar = this.f3172a;
        if (eVar != null) {
            eVar.b(f, i13, i14);
        }
        int i15 = aVar.f3184a;
        int i16 = this.f3179i;
        if ((i15 == i16 || i16 == -1) && aVar.f3186c == 0 && this.f != 1) {
            d(0);
            e();
        }
    }

    public final void c(int i6) {
        ViewPager2.e eVar = this.f3172a;
        if (eVar != null) {
            eVar.c(i6);
        }
    }

    public final void d(int i6) {
        if ((this.f3176e == 3 && this.f == 0) || this.f == i6) {
            return;
        }
        this.f = i6;
        ViewPager2.e eVar = this.f3172a;
        if (eVar != null) {
            eVar.a(i6);
        }
    }

    public final void e() {
        this.f3176e = 0;
        this.f = 0;
        a aVar = this.f3177g;
        aVar.f3184a = -1;
        aVar.f3185b = 0.0f;
        aVar.f3186c = 0;
        this.f3178h = -1;
        this.f3179i = -1;
        this.f3180j = false;
        this.f3181k = false;
        this.f3183m = false;
        this.f3182l = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x0122, code lost:
        if (r5[r1 - 1][1] >= r6) goto L87;
     */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0146 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f() {
        boolean z10;
        int top;
        boolean z11;
        int childCount;
        int i6;
        boolean z12;
        boolean z13;
        boolean z14;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int top2;
        int i10;
        int bottom;
        int i11;
        boolean z15;
        LinearLayoutManager linearLayoutManager = this.f3175d;
        int findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        a aVar = this.f3177g;
        aVar.f3184a = findFirstVisibleItemPosition;
        float f = 0.0f;
        if (findFirstVisibleItemPosition == -1) {
            aVar.f3184a = -1;
            aVar.f3185b = 0.0f;
            aVar.f3186c = 0;
            return;
        }
        View findViewByPosition = linearLayoutManager.findViewByPosition(findFirstVisibleItemPosition);
        if (findViewByPosition == null) {
            aVar.f3184a = -1;
            aVar.f3185b = 0.0f;
            aVar.f3186c = 0;
            return;
        }
        int leftDecorationWidth = linearLayoutManager.getLeftDecorationWidth(findViewByPosition);
        int rightDecorationWidth = linearLayoutManager.getRightDecorationWidth(findViewByPosition);
        int topDecorationHeight = linearLayoutManager.getTopDecorationHeight(findViewByPosition);
        int bottomDecorationHeight = linearLayoutManager.getBottomDecorationHeight(findViewByPosition);
        ViewGroup.LayoutParams layoutParams = findViewByPosition.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams;
            leftDecorationWidth += marginLayoutParams2.leftMargin;
            rightDecorationWidth += marginLayoutParams2.rightMargin;
            topDecorationHeight += marginLayoutParams2.topMargin;
            bottomDecorationHeight += marginLayoutParams2.bottomMargin;
        }
        int height = findViewByPosition.getHeight() + topDecorationHeight + bottomDecorationHeight;
        int width = findViewByPosition.getWidth() + leftDecorationWidth + rightDecorationWidth;
        if (linearLayoutManager.getOrientation() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        RecyclerView recyclerView = this.f3174c;
        if (z10) {
            top = (findViewByPosition.getLeft() - leftDecorationWidth) - recyclerView.getPaddingLeft();
            if (this.f3173b.A.getLayoutDirection() == 1) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (z15) {
                top = -top;
            }
            height = width;
        } else {
            top = (findViewByPosition.getTop() - topDecorationHeight) - recyclerView.getPaddingTop();
        }
        int i12 = -top;
        aVar.f3186c = i12;
        if (i12 < 0) {
            int childCount2 = linearLayoutManager.getChildCount();
            if (childCount2 != 0) {
                if (linearLayoutManager.getOrientation() == 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                int[][] iArr = (int[][]) Array.newInstance(Integer.TYPE, childCount2, 2);
                for (int i13 = 0; i13 < childCount2; i13++) {
                    View childAt = linearLayoutManager.getChildAt(i13);
                    if (childAt != null) {
                        ViewGroup.LayoutParams layoutParams2 = childAt.getLayoutParams();
                        if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
                        } else {
                            marginLayoutParams = m2.b.f24788a;
                        }
                        int[] iArr2 = iArr[i13];
                        if (z14) {
                            top2 = childAt.getLeft();
                            i10 = marginLayoutParams.leftMargin;
                        } else {
                            top2 = childAt.getTop();
                            i10 = marginLayoutParams.topMargin;
                        }
                        iArr2[0] = top2 - i10;
                        int[] iArr3 = iArr[i13];
                        if (z14) {
                            bottom = childAt.getRight();
                            i11 = marginLayoutParams.rightMargin;
                        } else {
                            bottom = childAt.getBottom();
                            i11 = marginLayoutParams.bottomMargin;
                        }
                        iArr3[1] = bottom + i11;
                    } else {
                        throw new IllegalStateException("null view contained in the view hierarchy");
                    }
                }
                Arrays.sort(iArr, new m2.a());
                int i14 = 1;
                while (true) {
                    if (i14 < childCount2) {
                        if (iArr[i14 - 1][1] != iArr[i14][0]) {
                            break;
                        }
                        i14++;
                    } else {
                        int[] iArr4 = iArr[0];
                        int i15 = iArr4[1];
                        int i16 = iArr4[0];
                        int i17 = i15 - i16;
                        if (i16 <= 0) {
                        }
                    }
                }
                z11 = false;
                if (z11 || linearLayoutManager.getChildCount() <= 1) {
                    childCount = linearLayoutManager.getChildCount();
                    i6 = 0;
                    while (true) {
                        if (i6 >= childCount) {
                            if (m2.b.a(linearLayoutManager.getChildAt(i6))) {
                                z12 = true;
                                break;
                            }
                            i6++;
                        } else {
                            z12 = false;
                            break;
                        }
                    }
                    if (z12) {
                        z13 = true;
                        if (z13) {
                            throw new IllegalStateException("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
                        }
                        throw new IllegalStateException(String.format(Locale.US, "Page can only be offset by a positive amount, not by %d", Integer.valueOf(aVar.f3186c)));
                    }
                }
                z13 = false;
                if (z13) {
                }
            }
            z11 = true;
            if (z11) {
            }
            childCount = linearLayoutManager.getChildCount();
            i6 = 0;
            while (true) {
                if (i6 >= childCount) {
                }
                i6++;
            }
            if (z12) {
            }
            z13 = false;
            if (z13) {
            }
        } else {
            if (height != 0) {
                f = i12 / height;
            }
            aVar.f3185b = f;
        }
    }
}
