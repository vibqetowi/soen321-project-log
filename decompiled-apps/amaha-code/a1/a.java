package a1;

import a1.b;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.google.android.material.chip.Chip;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;
import t0.d0;
import t0.o0;
import u0.h;
import u0.i;
import u0.k;
/* compiled from: ExploreByTouchHelper.java */
/* loaded from: classes.dex */
public abstract class a extends t0.a {

    /* renamed from: n  reason: collision with root package name */
    public static final Rect f128n = new Rect(SubsamplingScaleImageView.TILE_SIZE_AUTO, SubsamplingScaleImageView.TILE_SIZE_AUTO, LinearLayoutManager.INVALID_OFFSET, LinearLayoutManager.INVALID_OFFSET);

    /* renamed from: o  reason: collision with root package name */
    public static final C0002a f129o = new C0002a();

    /* renamed from: p  reason: collision with root package name */
    public static final b f130p = new b();

    /* renamed from: h  reason: collision with root package name */
    public final AccessibilityManager f134h;

    /* renamed from: i  reason: collision with root package name */
    public final View f135i;

    /* renamed from: j  reason: collision with root package name */
    public c f136j;

    /* renamed from: d  reason: collision with root package name */
    public final Rect f131d = new Rect();

    /* renamed from: e  reason: collision with root package name */
    public final Rect f132e = new Rect();
    public final Rect f = new Rect();

    /* renamed from: g  reason: collision with root package name */
    public final int[] f133g = new int[2];

    /* renamed from: k  reason: collision with root package name */
    public int f137k = LinearLayoutManager.INVALID_OFFSET;

    /* renamed from: l  reason: collision with root package name */
    public int f138l = LinearLayoutManager.INVALID_OFFSET;

    /* renamed from: m  reason: collision with root package name */
    public int f139m = LinearLayoutManager.INVALID_OFFSET;

    /* compiled from: ExploreByTouchHelper.java */
    /* renamed from: a1.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0002a implements b.a<h> {
    }

    /* compiled from: ExploreByTouchHelper.java */
    /* loaded from: classes.dex */
    public class b {
    }

    /* compiled from: ExploreByTouchHelper.java */
    /* loaded from: classes.dex */
    public class c extends i {
        public c() {
        }

        @Override // u0.i
        public final h a(int i6) {
            return new h(AccessibilityNodeInfo.obtain(a.this.n(i6).f33731a));
        }

        @Override // u0.i
        public final h b(int i6) {
            int i10;
            a aVar = a.this;
            if (i6 == 2) {
                i10 = aVar.f137k;
            } else {
                i10 = aVar.f138l;
            }
            if (i10 == Integer.MIN_VALUE) {
                return null;
            }
            return a(i10);
        }

        @Override // u0.i
        public final boolean c(int i6, int i10, Bundle bundle) {
            int i11;
            a aVar = a.this;
            View view = aVar.f135i;
            if (i6 != -1) {
                boolean z10 = true;
                if (i10 != 1) {
                    if (i10 != 2) {
                        boolean z11 = false;
                        if (i10 != 64) {
                            if (i10 != 128) {
                                Chip.b bVar = (Chip.b) aVar;
                                if (i10 == 16) {
                                    Chip chip = Chip.this;
                                    if (i6 == 0) {
                                        return chip.performClick();
                                    }
                                    if (i6 == 1) {
                                        chip.playSoundEffect(0);
                                        View.OnClickListener onClickListener = chip.B;
                                        if (onClickListener != null) {
                                            onClickListener.onClick(chip);
                                            z11 = true;
                                        }
                                        if (chip.N) {
                                            chip.M.q(1, 1);
                                        }
                                    }
                                }
                                return z11;
                            }
                            if (aVar.f137k == i6) {
                                aVar.f137k = LinearLayoutManager.INVALID_OFFSET;
                                view.invalidate();
                                aVar.q(i6, 65536);
                            }
                            z10 = false;
                        } else {
                            AccessibilityManager accessibilityManager = aVar.f134h;
                            if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled() && (i11 = aVar.f137k) != i6) {
                                if (i11 != Integer.MIN_VALUE) {
                                    aVar.f137k = LinearLayoutManager.INVALID_OFFSET;
                                    aVar.f135i.invalidate();
                                    aVar.q(i11, 65536);
                                }
                                aVar.f137k = i6;
                                view.invalidate();
                                aVar.q(i6, 32768);
                            }
                            z10 = false;
                        }
                        return z10;
                    }
                    return aVar.j(i6);
                }
                return aVar.p(i6);
            }
            WeakHashMap<View, o0> weakHashMap = d0.f32288a;
            return d0.d.j(view, i10, bundle);
        }
    }

    public a(View view) {
        if (view != null) {
            this.f135i = view;
            this.f134h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
            view.setFocusable(true);
            WeakHashMap<View, o0> weakHashMap = d0.f32288a;
            if (d0.d.c(view) == 0) {
                d0.d.s(view, 1);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("View may not be null");
    }

    @Override // t0.a
    public final i b(View view) {
        if (this.f136j == null) {
            this.f136j = new c();
        }
        return this.f136j;
    }

    @Override // t0.a
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
    }

    @Override // t0.a
    public final void d(View view, h hVar) {
        boolean z10;
        View.AccessibilityDelegate accessibilityDelegate = this.f32269a;
        AccessibilityNodeInfo accessibilityNodeInfo = hVar.f33731a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        Chip chip = Chip.this;
        com.google.android.material.chip.a aVar = chip.f8886y;
        if (aVar != null && aVar.f8904k0) {
            z10 = true;
        } else {
            z10 = false;
        }
        accessibilityNodeInfo.setCheckable(z10);
        accessibilityNodeInfo.setClickable(chip.isClickable());
        hVar.g(chip.getAccessibilityClassName());
        CharSequence text = chip.getText();
        if (Build.VERSION.SDK_INT >= 23) {
            hVar.l(text);
        } else {
            hVar.i(text);
        }
    }

    public final boolean j(int i6) {
        if (this.f138l != i6) {
            return false;
        }
        this.f138l = LinearLayoutManager.INVALID_OFFSET;
        Chip.b bVar = (Chip.b) this;
        if (i6 == 1) {
            Chip chip = Chip.this;
            chip.H = false;
            chip.refreshDrawableState();
        }
        q(i6, 8);
        return true;
    }

    public final h k(int i6) {
        boolean z10;
        AccessibilityNodeInfo accessibilityNodeInfo;
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
        h hVar = new h(obtain);
        obtain.setEnabled(true);
        obtain.setFocusable(true);
        hVar.g("android.view.View");
        Rect rect = f128n;
        obtain.setBoundsInParent(rect);
        obtain.setBoundsInScreen(rect);
        hVar.f33732b = -1;
        View view = this.f135i;
        obtain.setParent(view);
        o(i6, hVar);
        if (hVar.e() == null && obtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        Rect rect2 = this.f132e;
        hVar.d(rect2);
        if (!rect2.equals(rect)) {
            int actions = obtain.getActions();
            if ((actions & 64) == 0) {
                if ((actions & 128) == 0) {
                    obtain.setPackageName(view.getContext().getPackageName());
                    hVar.f33733c = i6;
                    obtain.setSource(view, i6);
                    boolean z11 = false;
                    if (this.f137k == i6) {
                        obtain.setAccessibilityFocused(true);
                        hVar.a(128);
                    } else {
                        obtain.setAccessibilityFocused(false);
                        hVar.a(64);
                    }
                    if (this.f138l == i6) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        hVar.a(2);
                    } else if (obtain.isFocusable()) {
                        hVar.a(1);
                    }
                    obtain.setFocused(z10);
                    int[] iArr = this.f133g;
                    view.getLocationOnScreen(iArr);
                    Rect rect3 = this.f131d;
                    obtain.getBoundsInScreen(rect3);
                    if (rect3.equals(rect)) {
                        hVar.d(rect3);
                        if (hVar.f33732b != -1) {
                            h hVar2 = new h(AccessibilityNodeInfo.obtain());
                            int i10 = hVar.f33732b;
                            while (true) {
                                accessibilityNodeInfo = hVar2.f33731a;
                                if (i10 == -1) {
                                    break;
                                }
                                hVar2.f33732b = -1;
                                accessibilityNodeInfo.setParent(view, -1);
                                accessibilityNodeInfo.setBoundsInParent(rect);
                                o(i10, hVar2);
                                hVar2.d(rect2);
                                rect3.offset(rect2.left, rect2.top);
                                i10 = hVar2.f33732b;
                            }
                            accessibilityNodeInfo.recycle();
                        }
                        rect3.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
                    }
                    Rect rect4 = this.f;
                    if (view.getLocalVisibleRect(rect4)) {
                        rect4.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
                        if (rect3.intersect(rect4)) {
                            AccessibilityNodeInfo accessibilityNodeInfo2 = hVar.f33731a;
                            accessibilityNodeInfo2.setBoundsInScreen(rect3);
                            if (!rect3.isEmpty() && view.getWindowVisibility() == 0) {
                                ViewParent parent = view.getParent();
                                while (true) {
                                    if (parent instanceof View) {
                                        View view2 = (View) parent;
                                        if (view2.getAlpha() <= 0.0f || view2.getVisibility() != 0) {
                                            break;
                                        }
                                        parent = view2.getParent();
                                    } else if (parent != null) {
                                        z11 = true;
                                    }
                                }
                            }
                            if (z11) {
                                accessibilityNodeInfo2.setVisibleToUser(true);
                            }
                        }
                    }
                    return hVar;
                }
                throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            }
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
    }

    public abstract void l(ArrayList arrayList);

    /* JADX WARN: Code restructure failed: missing block: B:67:0x0148, code lost:
        if (r14 < ((r15 * r15) + ((r13 * 13) * r13))) goto L44;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0154 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x014f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m(int i6, Rect rect) {
        h hVar;
        boolean z10;
        Object obj;
        h hVar2;
        int lastIndexOf;
        int i10;
        int i11;
        int f;
        int i12;
        boolean z11;
        ArrayList arrayList = new ArrayList();
        l(arrayList);
        t.i iVar = new t.i();
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            iVar.e(((Integer) arrayList.get(i13)).intValue(), k(((Integer) arrayList.get(i13)).intValue()));
        }
        int i14 = this.f138l;
        int i15 = LinearLayoutManager.INVALID_OFFSET;
        if (i14 == Integer.MIN_VALUE) {
            hVar = null;
        } else {
            hVar = (h) iVar.d(i14, null);
        }
        C0002a c0002a = f129o;
        b bVar = f130p;
        View view = this.f135i;
        if (i6 != 1 && i6 != 2) {
            if (i6 != 17 && i6 != 33 && i6 != 66 && i6 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            Rect rect2 = new Rect();
            int i16 = this.f138l;
            if (i16 != Integer.MIN_VALUE) {
                n(i16).d(rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                int width = view.getWidth();
                int height = view.getHeight();
                if (i6 != 17) {
                    if (i6 != 33) {
                        if (i6 != 66) {
                            if (i6 == 130) {
                                rect2.set(0, -1, width, -1);
                            } else {
                                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                            }
                        } else {
                            rect2.set(-1, 0, -1, height);
                        }
                    } else {
                        i11 = 0;
                        rect2.set(0, height, width, height);
                    }
                } else {
                    i11 = 0;
                    rect2.set(width, 0, width, height);
                }
                Rect rect3 = new Rect(rect2);
                if (i6 == 17) {
                    if (i6 != 33) {
                        if (i6 != 66) {
                            if (i6 == 130) {
                                rect3.offset(i11, -(rect2.height() + 1));
                            } else {
                                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                            }
                        } else {
                            rect3.offset(-(rect2.width() + 1), i11);
                        }
                    } else {
                        rect3.offset(i11, rect2.height() + 1);
                    }
                } else {
                    rect3.offset(rect2.width() + 1, i11);
                }
                bVar.getClass();
                f = iVar.f();
                Rect rect4 = new Rect();
                h hVar3 = null;
                for (i12 = 0; i12 < f; i12++) {
                    h hVar4 = (h) iVar.h(i12);
                    if (hVar4 != hVar) {
                        c0002a.getClass();
                        hVar4.d(rect4);
                        if (a1.b.c(i6, rect2, rect4)) {
                            if (a1.b.c(i6, rect2, rect3) && !a1.b.a(i6, rect2, rect4, rect3)) {
                                if (!a1.b.a(i6, rect2, rect3, rect4)) {
                                    int d10 = a1.b.d(i6, rect2, rect4);
                                    int e10 = a1.b.e(i6, rect2, rect4);
                                    int i17 = (e10 * e10) + (d10 * 13 * d10);
                                    int d11 = a1.b.d(i6, rect2, rect3);
                                    int e11 = a1.b.e(i6, rect2, rect3);
                                }
                            }
                            z11 = true;
                            if (!z11) {
                                rect3.set(rect4);
                                hVar3 = hVar4;
                            }
                        }
                        z11 = false;
                        if (!z11) {
                        }
                    }
                }
                hVar2 = hVar3;
            }
            i11 = 0;
            Rect rect32 = new Rect(rect2);
            if (i6 == 17) {
            }
            bVar.getClass();
            f = iVar.f();
            Rect rect42 = new Rect();
            h hVar32 = null;
            while (i12 < f) {
            }
            hVar2 = hVar32;
        } else {
            WeakHashMap<View, o0> weakHashMap = d0.f32288a;
            if (d0.e.d(view) == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            bVar.getClass();
            int f2 = iVar.f();
            ArrayList arrayList2 = new ArrayList(f2);
            for (int i18 = 0; i18 < f2; i18++) {
                arrayList2.add((h) iVar.h(i18));
            }
            Collections.sort(arrayList2, new b.C0003b(z10, c0002a));
            if (i6 != 1) {
                if (i6 == 2) {
                    int size = arrayList2.size();
                    if (hVar == null) {
                        lastIndexOf = -1;
                    } else {
                        lastIndexOf = arrayList2.lastIndexOf(hVar);
                    }
                    int i19 = lastIndexOf + 1;
                    if (i19 < size) {
                        obj = arrayList2.get(i19);
                        hVar2 = (h) obj;
                    } else {
                        obj = null;
                        hVar2 = (h) obj;
                    }
                } else {
                    throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
                }
            } else {
                int size2 = arrayList2.size();
                if (hVar != null) {
                    size2 = arrayList2.indexOf(hVar);
                }
                int i20 = size2 - 1;
                if (i20 >= 0) {
                    obj = arrayList2.get(i20);
                    hVar2 = (h) obj;
                }
                obj = null;
                hVar2 = (h) obj;
            }
        }
        if (hVar2 != null) {
            if (iVar.f32262u) {
                iVar.c();
            }
            int i21 = 0;
            while (true) {
                if (i21 < iVar.f32265x) {
                    if (iVar.f32264w[i21] == hVar2) {
                        i10 = i21;
                        break;
                    }
                    i21++;
                } else {
                    i10 = -1;
                    break;
                }
            }
            if (iVar.f32262u) {
                iVar.c();
            }
            i15 = iVar.f32263v[i10];
        }
        return p(i15);
    }

    public final h n(int i6) {
        if (i6 == -1) {
            View view = this.f135i;
            AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(view);
            h hVar = new h(obtain);
            WeakHashMap<View, o0> weakHashMap = d0.f32288a;
            view.onInitializeAccessibilityNodeInfo(obtain);
            ArrayList arrayList = new ArrayList();
            l(arrayList);
            if (obtain.getChildCount() > 0 && arrayList.size() > 0) {
                throw new RuntimeException("Views cannot have both real and virtual children");
            }
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                hVar.f33731a.addChild(view, ((Integer) arrayList.get(i10)).intValue());
            }
            return hVar;
        }
        return k(i6);
    }

    public abstract void o(int i6, h hVar);

    public final boolean p(int i6) {
        int i10;
        View view = this.f135i;
        if ((!view.isFocused() && !view.requestFocus()) || (i10 = this.f138l) == i6) {
            return false;
        }
        if (i10 != Integer.MIN_VALUE) {
            j(i10);
        }
        if (i6 == Integer.MIN_VALUE) {
            return false;
        }
        this.f138l = i6;
        Chip.b bVar = (Chip.b) this;
        if (i6 == 1) {
            Chip chip = Chip.this;
            chip.H = true;
            chip.refreshDrawableState();
        }
        q(i6, 8);
        return true;
    }

    public final void q(int i6, int i10) {
        View view;
        ViewParent parent;
        AccessibilityEvent obtain;
        if (i6 == Integer.MIN_VALUE || !this.f134h.isEnabled() || (parent = (view = this.f135i).getParent()) == null) {
            return;
        }
        if (i6 != -1) {
            obtain = AccessibilityEvent.obtain(i10);
            h n10 = n(i6);
            obtain.getText().add(n10.e());
            AccessibilityNodeInfo accessibilityNodeInfo = n10.f33731a;
            obtain.setContentDescription(accessibilityNodeInfo.getContentDescription());
            obtain.setScrollable(accessibilityNodeInfo.isScrollable());
            obtain.setPassword(accessibilityNodeInfo.isPassword());
            obtain.setEnabled(accessibilityNodeInfo.isEnabled());
            obtain.setChecked(accessibilityNodeInfo.isChecked());
            if (obtain.getText().isEmpty() && obtain.getContentDescription() == null) {
                throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
            }
            obtain.setClassName(accessibilityNodeInfo.getClassName());
            k.a(obtain, view, i6);
            obtain.setPackageName(view.getContext().getPackageName());
        } else {
            obtain = AccessibilityEvent.obtain(i10);
            view.onInitializeAccessibilityEvent(obtain);
        }
        parent.requestSendAccessibilityEvent(view, obtain);
    }
}
