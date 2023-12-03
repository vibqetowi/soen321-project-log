package t0;

import android.util.Log;
import android.view.View;
import android.view.ViewParent;
/* compiled from: NestedScrollingChildHelper.java */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    public ViewParent f32343a;

    /* renamed from: b  reason: collision with root package name */
    public ViewParent f32344b;

    /* renamed from: c  reason: collision with root package name */
    public final View f32345c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f32346d;

    /* renamed from: e  reason: collision with root package name */
    public int[] f32347e;

    public p(View view) {
        this.f32345c = view;
    }

    public final boolean a(float f, float f2, boolean z10) {
        ViewParent e10;
        if (!this.f32346d || (e10 = e(0)) == null) {
            return false;
        }
        try {
            return m0.a(e10, this.f32345c, f, f2, z10);
        } catch (AbstractMethodError e11) {
            Log.e("ViewParentCompat", "ViewParent " + e10 + " does not implement interface method onNestedFling", e11);
            return false;
        }
    }

    public final boolean b(float f, float f2) {
        ViewParent e10;
        if (!this.f32346d || (e10 = e(0)) == null) {
            return false;
        }
        try {
            return m0.b(e10, this.f32345c, f, f2);
        } catch (AbstractMethodError e11) {
            Log.e("ViewParentCompat", "ViewParent " + e10 + " does not implement interface method onNestedPreFling", e11);
            return false;
        }
    }

    public final boolean c(int i6, int i10, int[] iArr, int[] iArr2, int i11) {
        ViewParent e10;
        int i12;
        int i13;
        int[] iArr3;
        if (!this.f32346d || (e10 = e(i11)) == null) {
            return false;
        }
        if (i6 == 0 && i10 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        View view = this.f32345c;
        if (iArr2 != null) {
            view.getLocationInWindow(iArr2);
            i12 = iArr2[0];
            i13 = iArr2[1];
        } else {
            i12 = 0;
            i13 = 0;
        }
        if (iArr == null) {
            if (this.f32347e == null) {
                this.f32347e = new int[2];
            }
            iArr3 = this.f32347e;
        } else {
            iArr3 = iArr;
        }
        iArr3[0] = 0;
        iArr3[1] = 0;
        View view2 = this.f32345c;
        if (e10 instanceof q) {
            ((q) e10).onNestedPreScroll(view2, i6, i10, iArr3, i11);
        } else if (i11 == 0) {
            try {
                m0.c(e10, view2, i6, i10, iArr3);
            } catch (AbstractMethodError e11) {
                Log.e("ViewParentCompat", "ViewParent " + e10 + " does not implement interface method onNestedPreScroll", e11);
            }
        }
        if (iArr2 != null) {
            view.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i12;
            iArr2[1] = iArr2[1] - i13;
        }
        if (iArr3[0] == 0 && iArr3[1] == 0) {
            return false;
        }
        return true;
    }

    public final boolean d(int i6, int i10, int i11, int i12, int[] iArr, int i13, int[] iArr2) {
        ViewParent e10;
        int i14;
        int i15;
        int[] iArr3;
        if (!this.f32346d || (e10 = e(i13)) == null) {
            return false;
        }
        if (i6 == 0 && i10 == 0 && i11 == 0 && i12 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        View view = this.f32345c;
        if (iArr != null) {
            view.getLocationInWindow(iArr);
            i14 = iArr[0];
            i15 = iArr[1];
        } else {
            i14 = 0;
            i15 = 0;
        }
        if (iArr2 == null) {
            if (this.f32347e == null) {
                this.f32347e = new int[2];
            }
            int[] iArr4 = this.f32347e;
            iArr4[0] = 0;
            iArr4[1] = 0;
            iArr3 = iArr4;
        } else {
            iArr3 = iArr2;
        }
        View view2 = this.f32345c;
        if (e10 instanceof r) {
            ((r) e10).onNestedScroll(view2, i6, i10, i11, i12, i13, iArr3);
        } else {
            iArr3[0] = iArr3[0] + i11;
            iArr3[1] = iArr3[1] + i12;
            if (e10 instanceof q) {
                ((q) e10).onNestedScroll(view2, i6, i10, i11, i12, i13);
            } else if (i13 == 0) {
                try {
                    m0.d(e10, view2, i6, i10, i11, i12);
                } catch (AbstractMethodError e11) {
                    Log.e("ViewParentCompat", "ViewParent " + e10 + " does not implement interface method onNestedScroll", e11);
                }
            }
        }
        if (iArr != null) {
            view.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i14;
            iArr[1] = iArr[1] - i15;
        }
        return true;
    }

    public final ViewParent e(int i6) {
        if (i6 != 0) {
            if (i6 != 1) {
                return null;
            }
            return this.f32344b;
        }
        return this.f32343a;
    }

    public final boolean f(int i6, int i10) {
        boolean z10;
        boolean f;
        if (e(i10) != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return true;
        }
        if (this.f32346d) {
            View view = this.f32345c;
            View view2 = view;
            for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                boolean z11 = parent instanceof q;
                if (z11) {
                    f = ((q) parent).onStartNestedScroll(view2, view, i6, i10);
                } else {
                    if (i10 == 0) {
                        try {
                            f = m0.f(parent, view2, view, i6);
                        } catch (AbstractMethodError e10) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e10);
                        }
                    }
                    f = false;
                }
                if (f) {
                    if (i10 != 0) {
                        if (i10 == 1) {
                            this.f32344b = parent;
                        }
                    } else {
                        this.f32343a = parent;
                    }
                    if (z11) {
                        ((q) parent).onNestedScrollAccepted(view2, view, i6, i10);
                    } else if (i10 == 0) {
                        try {
                            m0.e(parent, view2, view, i6);
                        } catch (AbstractMethodError e11) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e11);
                        }
                    }
                    return true;
                }
                if (parent instanceof View) {
                    view2 = (View) parent;
                }
            }
        }
        return false;
    }

    public final void g(int i6) {
        ViewParent e10 = e(i6);
        if (e10 != null) {
            boolean z10 = e10 instanceof q;
            View view = this.f32345c;
            if (z10) {
                ((q) e10).onStopNestedScroll(view, i6);
            } else if (i6 == 0) {
                try {
                    m0.g(e10, view);
                } catch (AbstractMethodError e11) {
                    Log.e("ViewParentCompat", "ViewParent " + e10 + " does not implement interface method onStopNestedScroll", e11);
                }
            }
            if (i6 != 0) {
                if (i6 == 1) {
                    this.f32344b = null;
                    return;
                }
                return;
            }
            this.f32343a = null;
        }
    }
}
