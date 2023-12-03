package t0;

import android.content.ClipData;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContentInfo;
import android.view.Display;
import android.view.KeyEvent;
import android.view.OnReceiveContentListener;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.Constants;
import j$.util.Objects;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import t0.a;
import t0.c;
import t0.d0;
import t0.s0;
import u0.h;
/* compiled from: ViewCompat.java */
/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a  reason: collision with root package name */
    public static WeakHashMap<View, o0> f32288a;

    /* renamed from: b  reason: collision with root package name */
    public static Field f32289b;

    /* renamed from: c  reason: collision with root package name */
    public static boolean f32290c;

    /* renamed from: d  reason: collision with root package name */
    public static ThreadLocal<Rect> f32291d;

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f32292e;
    public static final y f;

    /* renamed from: g  reason: collision with root package name */
    public static final a f32293g;

    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    public static abstract class b<T> {

        /* renamed from: a  reason: collision with root package name */
        public final int f32295a;

        /* renamed from: b  reason: collision with root package name */
        public final Class<T> f32296b;

        /* renamed from: c  reason: collision with root package name */
        public final int f32297c;

        /* renamed from: d  reason: collision with root package name */
        public final int f32298d;

        public b(int i6, Class<T> cls, int i10, int i11) {
            this.f32295a = i6;
            this.f32296b = cls;
            this.f32298d = i10;
            this.f32297c = i11;
        }

        public static boolean a(Boolean bool, Boolean bool2) {
            boolean z10;
            boolean z11;
            if (bool != null && bool.booleanValue()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (bool2 != null && bool2.booleanValue()) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z10 != z11) {
                return false;
            }
            return true;
        }

        public abstract T b(View view);

        public abstract void c(View view, T t3);

        public final T d(View view) {
            boolean z10;
            if (Build.VERSION.SDK_INT >= this.f32297c) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                return b(view);
            }
            T t3 = (T) view.getTag(this.f32295a);
            if (this.f32296b.isInstance(t3)) {
                return t3;
            }
            return null;
        }

        public final void e(View view, T t3) {
            boolean z10;
            t0.a aVar;
            if (Build.VERSION.SDK_INT >= this.f32297c) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                c(view, t3);
            } else if (f(d(view), t3)) {
                View.AccessibilityDelegate d10 = d0.d(view);
                if (d10 == null) {
                    aVar = null;
                } else if (d10 instanceof a.C0543a) {
                    aVar = ((a.C0543a) d10).f32271a;
                } else {
                    aVar = new t0.a(d10);
                }
                if (aVar == null) {
                    aVar = new t0.a();
                }
                d0.q(view, aVar);
                view.setTag(this.f32295a, t3);
                d0.i(this.f32298d, view);
            }
        }

        public abstract boolean f(T t3, T t10);
    }

    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    public static class c {
        public static boolean a(View view) {
            return view.hasOnClickListeners();
        }
    }

    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    public static class d {
        public static AccessibilityNodeProvider a(View view) {
            return view.getAccessibilityNodeProvider();
        }

        public static boolean b(View view) {
            return view.getFitsSystemWindows();
        }

        public static int c(View view) {
            return view.getImportantForAccessibility();
        }

        public static int d(View view) {
            return view.getMinimumHeight();
        }

        public static int e(View view) {
            return view.getMinimumWidth();
        }

        public static ViewParent f(View view) {
            return view.getParentForAccessibility();
        }

        public static int g(View view) {
            return view.getWindowSystemUiVisibility();
        }

        public static boolean h(View view) {
            return view.hasOverlappingRendering();
        }

        public static boolean i(View view) {
            return view.hasTransientState();
        }

        public static boolean j(View view, int i6, Bundle bundle) {
            return view.performAccessibilityAction(i6, bundle);
        }

        public static void k(View view) {
            view.postInvalidateOnAnimation();
        }

        public static void l(View view, int i6, int i10, int i11, int i12) {
            view.postInvalidateOnAnimation(i6, i10, i11, i12);
        }

        public static void m(View view, Runnable runnable) {
            view.postOnAnimation(runnable);
        }

        public static void n(View view, Runnable runnable, long j10) {
            view.postOnAnimationDelayed(runnable, j10);
        }

        public static void o(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }

        public static void p(View view) {
            view.requestFitSystemWindows();
        }

        public static void q(View view, Drawable drawable) {
            view.setBackground(drawable);
        }

        public static void r(View view, boolean z10) {
            view.setHasTransientState(z10);
        }

        public static void s(View view, int i6) {
            view.setImportantForAccessibility(i6);
        }
    }

    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    public static class e {
        public static int a() {
            return View.generateViewId();
        }

        public static Display b(View view) {
            return view.getDisplay();
        }

        public static int c(View view) {
            return view.getLabelFor();
        }

        public static int d(View view) {
            return view.getLayoutDirection();
        }

        public static int e(View view) {
            return view.getPaddingEnd();
        }

        public static int f(View view) {
            return view.getPaddingStart();
        }

        public static boolean g(View view) {
            return view.isPaddingRelative();
        }

        public static void h(View view, int i6) {
            view.setLabelFor(i6);
        }

        public static void i(View view, Paint paint) {
            view.setLayerPaint(paint);
        }

        public static void j(View view, int i6) {
            view.setLayoutDirection(i6);
        }

        public static void k(View view, int i6, int i10, int i11, int i12) {
            view.setPaddingRelative(i6, i10, i11, i12);
        }
    }

    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    public static class f {
        public static Rect a(View view) {
            return view.getClipBounds();
        }

        public static boolean b(View view) {
            return view.isInLayout();
        }

        public static void c(View view, Rect rect) {
            view.setClipBounds(rect);
        }
    }

    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    public static class g {
        public static int a(View view) {
            return view.getAccessibilityLiveRegion();
        }

        public static boolean b(View view) {
            return view.isAttachedToWindow();
        }

        public static boolean c(View view) {
            return view.isLaidOut();
        }

        public static boolean d(View view) {
            return view.isLayoutDirectionResolved();
        }

        public static void e(ViewParent viewParent, View view, View view2, int i6) {
            viewParent.notifySubtreeAccessibilityStateChanged(view, view2, i6);
        }

        public static void f(View view, int i6) {
            view.setAccessibilityLiveRegion(i6);
        }

        public static void g(AccessibilityEvent accessibilityEvent, int i6) {
            accessibilityEvent.setContentChangeTypes(i6);
        }
    }

    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    public static class h {
        public static WindowInsets a(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        public static WindowInsets b(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        public static void c(View view) {
            view.requestApplyInsets();
        }
    }

    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    public static class i {

        /* compiled from: ViewCompat.java */
        /* loaded from: classes.dex */
        public class a implements View.OnApplyWindowInsetsListener {

            /* renamed from: a  reason: collision with root package name */
            public s0 f32299a = null;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ View f32300b;

            /* renamed from: c  reason: collision with root package name */
            public final /* synthetic */ t f32301c;

            public a(View view, t tVar) {
                this.f32300b = view;
                this.f32301c = tVar;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                s0 h10 = s0.h(windowInsets, view);
                int i6 = Build.VERSION.SDK_INT;
                t tVar = this.f32301c;
                if (i6 < 30) {
                    i.a(windowInsets, this.f32300b);
                    if (h10.equals(this.f32299a)) {
                        return tVar.i(view, h10).g();
                    }
                }
                this.f32299a = h10;
                s0 i10 = tVar.i(view, h10);
                if (i6 >= 30) {
                    return i10.g();
                }
                WeakHashMap<View, o0> weakHashMap = d0.f32288a;
                h.c(view);
                return i10.g();
            }
        }

        public static void a(WindowInsets windowInsets, View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        public static s0 b(View view, s0 s0Var, Rect rect) {
            WindowInsets g5 = s0Var.g();
            if (g5 != null) {
                return s0.h(view.computeSystemWindowInsets(g5, rect), view);
            }
            rect.setEmpty();
            return s0Var;
        }

        public static boolean c(View view, float f, float f2, boolean z10) {
            return view.dispatchNestedFling(f, f2, z10);
        }

        public static boolean d(View view, float f, float f2) {
            return view.dispatchNestedPreFling(f, f2);
        }

        public static boolean e(View view, int i6, int i10, int[] iArr, int[] iArr2) {
            return view.dispatchNestedPreScroll(i6, i10, iArr, iArr2);
        }

        public static boolean f(View view, int i6, int i10, int i11, int i12, int[] iArr) {
            return view.dispatchNestedScroll(i6, i10, i11, i12, iArr);
        }

        public static ColorStateList g(View view) {
            return view.getBackgroundTintList();
        }

        public static PorterDuff.Mode h(View view) {
            return view.getBackgroundTintMode();
        }

        public static float i(View view) {
            return view.getElevation();
        }

        public static s0 j(View view) {
            s0.e bVar;
            if (s0.a.f32355d && view.isAttachedToWindow()) {
                try {
                    Object obj = s0.a.f32352a.get(view.getRootView());
                    if (obj != null) {
                        Rect rect = (Rect) s0.a.f32353b.get(obj);
                        Rect rect2 = (Rect) s0.a.f32354c.get(obj);
                        if (rect != null && rect2 != null) {
                            int i6 = Build.VERSION.SDK_INT;
                            if (i6 >= 30) {
                                bVar = new s0.d();
                            } else if (i6 >= 29) {
                                bVar = new s0.c();
                            } else {
                                bVar = new s0.b();
                            }
                            bVar.c(j0.e.a(rect.left, rect.top, rect.right, rect.bottom));
                            bVar.d(j0.e.a(rect2.left, rect2.top, rect2.right, rect2.bottom));
                            s0 b10 = bVar.b();
                            b10.f32351a.p(b10);
                            b10.f32351a.d(view.getRootView());
                            return b10;
                        }
                    }
                } catch (IllegalAccessException e10) {
                    Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. " + e10.getMessage(), e10);
                }
            }
            return null;
        }

        public static String k(View view) {
            return view.getTransitionName();
        }

        public static float l(View view) {
            return view.getTranslationZ();
        }

        public static float m(View view) {
            return view.getZ();
        }

        public static boolean n(View view) {
            return view.hasNestedScrollingParent();
        }

        public static boolean o(View view) {
            return view.isImportantForAccessibility();
        }

        public static boolean p(View view) {
            return view.isNestedScrollingEnabled();
        }

        public static void q(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        public static void r(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        public static void s(View view, float f) {
            view.setElevation(f);
        }

        public static void t(View view, boolean z10) {
            view.setNestedScrollingEnabled(z10);
        }

        public static void u(View view, t tVar) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(R.id.tag_on_apply_window_listener, tVar);
            }
            if (tVar == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
            } else {
                view.setOnApplyWindowInsetsListener(new a(view, tVar));
            }
        }

        public static void v(View view, String str) {
            view.setTransitionName(str);
        }

        public static void w(View view, float f) {
            view.setTranslationZ(f);
        }

        public static void x(View view, float f) {
            view.setZ(f);
        }

        public static boolean y(View view, int i6) {
            return view.startNestedScroll(i6);
        }

        public static void z(View view) {
            view.stopNestedScroll();
        }
    }

    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    public static class j {
        public static s0 a(View view) {
            WindowInsets l2 = android.support.v4.media.b.l(view);
            if (l2 == null) {
                return null;
            }
            s0 h10 = s0.h(l2, null);
            s0.k kVar = h10.f32351a;
            kVar.p(h10);
            kVar.d(view.getRootView());
            return h10;
        }

        public static int b(View view) {
            int scrollIndicators;
            scrollIndicators = view.getScrollIndicators();
            return scrollIndicators;
        }

        public static void c(View view, int i6) {
            view.setScrollIndicators(i6);
        }

        public static void d(View view, int i6, int i10) {
            view.setScrollIndicators(i6, i10);
        }
    }

    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    public static class k {
        public static void a(View view) {
            view.cancelDragAndDrop();
        }

        public static void b(View view) {
            view.dispatchFinishTemporaryDetach();
        }

        public static void c(View view) {
            view.dispatchStartTemporaryDetach();
        }

        public static void d(View view, PointerIcon pointerIcon) {
            view.setPointerIcon(pointerIcon);
        }

        public static boolean e(View view, ClipData clipData, View.DragShadowBuilder dragShadowBuilder, Object obj, int i6) {
            return bb.e.q(view, clipData, dragShadowBuilder, obj, i6);
        }

        public static void f(View view, View.DragShadowBuilder dragShadowBuilder) {
            view.updateDragShadow(dragShadowBuilder);
        }
    }

    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    public static class l {
        public static void a(View view, Collection<View> collection, int i6) {
            view.addKeyboardNavigationClusters(collection, i6);
        }

        public static int b(View view) {
            int importantForAutofill;
            importantForAutofill = view.getImportantForAutofill();
            return importantForAutofill;
        }

        public static int c(View view) {
            int nextClusterForwardId;
            nextClusterForwardId = view.getNextClusterForwardId();
            return nextClusterForwardId;
        }

        public static boolean d(View view) {
            boolean hasExplicitFocusable;
            hasExplicitFocusable = view.hasExplicitFocusable();
            return hasExplicitFocusable;
        }

        public static boolean e(View view) {
            boolean isFocusedByDefault;
            isFocusedByDefault = view.isFocusedByDefault();
            return isFocusedByDefault;
        }

        public static boolean f(View view) {
            boolean isImportantForAutofill;
            isImportantForAutofill = view.isImportantForAutofill();
            return isImportantForAutofill;
        }

        public static boolean g(View view) {
            boolean isKeyboardNavigationCluster;
            isKeyboardNavigationCluster = view.isKeyboardNavigationCluster();
            return isKeyboardNavigationCluster;
        }

        public static View h(View view, View view2, int i6) {
            return androidx.appcompat.widget.z.j(view, view2, i6);
        }

        public static boolean i(View view) {
            boolean restoreDefaultFocus;
            restoreDefaultFocus = view.restoreDefaultFocus();
            return restoreDefaultFocus;
        }

        public static void j(View view, String... strArr) {
            androidx.appcompat.widget.z.u(view, strArr);
        }

        public static void k(View view, boolean z10) {
            view.setFocusedByDefault(z10);
        }

        public static void l(View view, int i6) {
            androidx.appcompat.widget.z.p(i6, view);
        }

        public static void m(View view, boolean z10) {
            view.setKeyboardNavigationCluster(z10);
        }

        public static void n(View view, int i6) {
            view.setNextClusterForwardId(i6);
        }

        public static void o(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    public static class m {
        /* JADX WARN: Type inference failed for: r0v1, types: [t0.e0, java.lang.Object] */
        public static void a(View view, final r rVar) {
            t.h hVar = (t.h) view.getTag(R.id.tag_unhandled_key_listeners);
            if (hVar == null) {
                hVar = new t.h();
                view.setTag(R.id.tag_unhandled_key_listeners, hVar);
            }
            Objects.requireNonNull(rVar);
            ?? r02 = new View.OnUnhandledKeyEventListener() { // from class: t0.e0
                @Override // android.view.View.OnUnhandledKeyEventListener
                public final boolean onUnhandledKeyEvent(View view2, KeyEvent keyEvent) {
                    return d0.r.this.a();
                }
            };
            hVar.put(rVar, r02);
            view.addOnUnhandledKeyEventListener(r02);
        }

        public static CharSequence b(View view) {
            CharSequence accessibilityPaneTitle;
            accessibilityPaneTitle = view.getAccessibilityPaneTitle();
            return accessibilityPaneTitle;
        }

        public static boolean c(View view) {
            boolean isAccessibilityHeading;
            isAccessibilityHeading = view.isAccessibilityHeading();
            return isAccessibilityHeading;
        }

        public static boolean d(View view) {
            boolean isScreenReaderFocusable;
            isScreenReaderFocusable = view.isScreenReaderFocusable();
            return isScreenReaderFocusable;
        }

        public static void e(View view, r rVar) {
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
            t.h hVar = (t.h) view.getTag(R.id.tag_unhandled_key_listeners);
            if (hVar != null && (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) hVar.getOrDefault(rVar, null)) != null) {
                view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
            }
        }

        public static <T> T f(View view, int i6) {
            View requireViewById;
            requireViewById = view.requireViewById(i6);
            return (T) requireViewById;
        }

        public static void g(View view, boolean z10) {
            view.setAccessibilityHeading(z10);
        }

        public static void h(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        public static void i(View view, boolean z10) {
            view.setScreenReaderFocusable(z10);
        }
    }

    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    public static class n {
        public static View.AccessibilityDelegate a(View view) {
            View.AccessibilityDelegate accessibilityDelegate;
            accessibilityDelegate = view.getAccessibilityDelegate();
            return accessibilityDelegate;
        }

        public static List<Rect> b(View view) {
            List<Rect> systemGestureExclusionRects;
            systemGestureExclusionRects = view.getSystemGestureExclusionRects();
            return systemGestureExclusionRects;
        }

        public static void c(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i6, int i10) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i6, i10);
        }

        public static void d(View view, List<Rect> list) {
            view.setSystemGestureExclusionRects(list);
        }
    }

    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    public static class o {
        public static CharSequence a(View view) {
            CharSequence stateDescription;
            stateDescription = view.getStateDescription();
            return stateDescription;
        }

        public static void b(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    public static final class p {
        public static String[] a(View view) {
            String[] receiveContentMimeTypes;
            receiveContentMimeTypes = view.getReceiveContentMimeTypes();
            return receiveContentMimeTypes;
        }

        public static t0.c b(View view, t0.c cVar) {
            ContentInfo performReceiveContent;
            ContentInfo b10 = cVar.f32274a.b();
            Objects.requireNonNull(b10);
            performReceiveContent = view.performReceiveContent(b10);
            if (performReceiveContent == null) {
                return null;
            }
            if (performReceiveContent == b10) {
                return cVar;
            }
            return new t0.c(new c.d(performReceiveContent));
        }

        public static void c(View view, String[] strArr, u uVar) {
            if (uVar != null) {
                view.setOnReceiveContentListener(strArr, new q(uVar));
            } else {
                view.setOnReceiveContentListener(strArr, null);
            }
        }
    }

    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    public static final class q implements OnReceiveContentListener {

        /* renamed from: a  reason: collision with root package name */
        public final u f32302a;

        public q(u uVar) {
            this.f32302a = uVar;
        }

        @Override // android.view.OnReceiveContentListener
        public final ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
            t0.c cVar = new t0.c(new c.d(contentInfo));
            t0.c a10 = this.f32302a.a(view, cVar);
            if (a10 == null) {
                return null;
            }
            if (a10 == cVar) {
                return contentInfo;
            }
            ContentInfo b10 = a10.f32274a.b();
            Objects.requireNonNull(b10);
            return b10;
        }
    }

    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    public interface r {
        boolean a();
    }

    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    public static class s {

        /* renamed from: d  reason: collision with root package name */
        public static final ArrayList<WeakReference<View>> f32303d = new ArrayList<>();

        /* renamed from: a  reason: collision with root package name */
        public WeakHashMap<View, Boolean> f32304a = null;

        /* renamed from: b  reason: collision with root package name */
        public SparseArray<WeakReference<View>> f32305b = null;

        /* renamed from: c  reason: collision with root package name */
        public WeakReference<KeyEvent> f32306c = null;

        public static boolean b(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    if (((r) arrayList.get(size)).a()) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }

        public final View a(View view, KeyEvent keyEvent) {
            View a10;
            WeakHashMap<View, Boolean> weakHashMap = this.f32304a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    int childCount = viewGroup.getChildCount();
                    do {
                        childCount--;
                        if (childCount >= 0) {
                            a10 = a(viewGroup.getChildAt(childCount), keyEvent);
                        }
                    } while (a10 == null);
                    return a10;
                }
                if (b(view, keyEvent)) {
                    return view;
                }
                return null;
            }
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [t0.y] */
    static {
        new AtomicInteger(1);
        f32288a = null;
        f32290c = false;
        f32292e = new int[]{R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
        f = new v() { // from class: t0.y
            @Override // t0.v
            public final c a(c cVar) {
                return cVar;
            }
        };
        f32293g = new a();
    }

    public static o0 a(View view) {
        if (f32288a == null) {
            f32288a = new WeakHashMap<>();
        }
        o0 o0Var = f32288a.get(view);
        if (o0Var == null) {
            o0 o0Var2 = new o0(view);
            f32288a.put(view, o0Var2);
            return o0Var2;
        }
        return o0Var;
    }

    public static s0 b(View view, s0 s0Var) {
        WindowInsets g5 = s0Var.g();
        if (g5 != null) {
            WindowInsets a10 = h.a(view, g5);
            if (!a10.equals(g5)) {
                return s0.h(a10, view);
            }
        }
        return s0Var;
    }

    public static boolean c(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList<WeakReference<View>> arrayList = s.f32303d;
        s sVar = (s) view.getTag(R.id.tag_unhandled_key_event_manager);
        if (sVar == null) {
            sVar = new s();
            view.setTag(R.id.tag_unhandled_key_event_manager, sVar);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap<View, Boolean> weakHashMap = sVar.f32304a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList<WeakReference<View>> arrayList2 = s.f32303d;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    if (sVar.f32304a == null) {
                        sVar.f32304a = new WeakHashMap<>();
                    }
                    int size = arrayList2.size();
                    while (true) {
                        size--;
                        if (size < 0) {
                            break;
                        }
                        ArrayList<WeakReference<View>> arrayList3 = s.f32303d;
                        View view2 = arrayList3.get(size).get();
                        if (view2 == null) {
                            arrayList3.remove(size);
                        } else {
                            sVar.f32304a.put(view2, Boolean.TRUE);
                            for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                sVar.f32304a.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                }
            }
        }
        View a10 = sVar.a(view, keyEvent);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (a10 != null && !KeyEvent.isModifierKey(keyCode)) {
                if (sVar.f32305b == null) {
                    sVar.f32305b = new SparseArray<>();
                }
                sVar.f32305b.put(keyCode, new WeakReference<>(a10));
            }
        }
        if (a10 == null) {
            return false;
        }
        return true;
    }

    public static View.AccessibilityDelegate d(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return n.a(view);
        }
        if (f32290c) {
            return null;
        }
        if (f32289b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f32289b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f32290c = true;
                return null;
            }
        }
        try {
            Object obj = f32289b.get(view);
            if (!(obj instanceof View.AccessibilityDelegate)) {
                return null;
            }
            return (View.AccessibilityDelegate) obj;
        } catch (Throwable unused2) {
            f32290c = true;
            return null;
        }
    }

    public static CharSequence e(View view) {
        boolean z10;
        Object tag;
        if (Build.VERSION.SDK_INT >= 28) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            tag = m.b(view);
        } else {
            tag = view.getTag(R.id.tag_accessibility_pane_title);
            if (!CharSequence.class.isInstance(tag)) {
                tag = null;
            }
        }
        return (CharSequence) tag;
    }

    public static ArrayList f(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            view.setTag(R.id.tag_accessibility_actions, arrayList2);
            return arrayList2;
        }
        return arrayList;
    }

    public static Rect g() {
        if (f32291d == null) {
            f32291d = new ThreadLocal<>();
        }
        Rect rect = f32291d.get();
        if (rect == null) {
            rect = new Rect();
            f32291d.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    public static String[] h(View view) {
        if (Build.VERSION.SDK_INT >= 31) {
            return p.a(view);
        }
        return (String[]) view.getTag(R.id.tag_on_receive_content_mime_types);
    }

    public static void i(int i6, View view) {
        boolean z10;
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (!accessibilityManager.isEnabled()) {
            return;
        }
        if (e(view) != null && view.isShown() && view.getWindowVisibility() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i10 = 32;
        if (g.a(view) == 0 && !z10) {
            if (i6 == 32) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(obtain);
                obtain.setEventType(32);
                g.g(obtain, i6);
                obtain.setSource(view);
                view.onPopulateAccessibilityEvent(obtain);
                obtain.getText().add(e(view));
                accessibilityManager.sendAccessibilityEvent(obtain);
                return;
            } else if (view.getParent() != null) {
                try {
                    g.e(view.getParent(), view, view, i6);
                    return;
                } catch (AbstractMethodError e10) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e10);
                    return;
                }
            } else {
                return;
            }
        }
        AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
        if (!z10) {
            i10 = Constants.PROFILE_ASSET_DOWNLOAD_JOB_ID;
        }
        obtain2.setEventType(i10);
        g.g(obtain2, i6);
        if (z10) {
            obtain2.getText().add(e(view));
            if (d.c(view) == 0) {
                d.s(view, 1);
            }
            ViewParent parent = view.getParent();
            while (true) {
                if (!(parent instanceof View)) {
                    break;
                } else if (d.c((View) parent) == 4) {
                    d.s(view, 2);
                    break;
                } else {
                    parent = parent.getParent();
                }
            }
        }
        view.sendAccessibilityEventUnchecked(obtain2);
    }

    public static void j(int i6, View view) {
        boolean z10;
        if (Build.VERSION.SDK_INT >= 23) {
            view.offsetLeftAndRight(i6);
            return;
        }
        Rect g5 = g();
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            g5.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z10 = !g5.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        } else {
            z10 = false;
        }
        view.offsetLeftAndRight(i6);
        if (view.getVisibility() == 0) {
            t(view);
            ViewParent parent2 = view.getParent();
            if (parent2 instanceof View) {
                t((View) parent2);
            }
        }
        if (z10 && g5.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(g5);
        }
    }

    public static void k(int i6, View view) {
        boolean z10;
        if (Build.VERSION.SDK_INT >= 23) {
            view.offsetTopAndBottom(i6);
            return;
        }
        Rect g5 = g();
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            g5.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z10 = !g5.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        } else {
            z10 = false;
        }
        view.offsetTopAndBottom(i6);
        if (view.getVisibility() == 0) {
            t(view);
            ViewParent parent2 = view.getParent();
            if (parent2 instanceof View) {
                t((View) parent2);
            }
        }
        if (z10 && g5.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(g5);
        }
    }

    public static s0 l(View view, s0 s0Var) {
        WindowInsets g5 = s0Var.g();
        if (g5 != null) {
            WindowInsets b10 = h.b(view, g5);
            if (!b10.equals(g5)) {
                return s0.h(b10, view);
            }
        }
        return s0Var;
    }

    public static t0.c m(View view, t0.c cVar) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + cVar + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return p.b(view, cVar);
        }
        u uVar = (u) view.getTag(R.id.tag_on_receive_content_listener);
        v vVar = f;
        if (uVar != null) {
            t0.c a10 = uVar.a(view, cVar);
            if (a10 == null) {
                return null;
            }
            if (view instanceof v) {
                vVar = (v) view;
            }
            return vVar.a(a10);
        }
        if (view instanceof v) {
            vVar = (v) view;
        }
        return vVar.a(cVar);
    }

    public static void n(int i6, View view) {
        ArrayList f2 = f(view);
        for (int i10 = 0; i10 < f2.size(); i10++) {
            if (((h.a) f2.get(i10)).a() == i6) {
                f2.remove(i10);
                return;
            }
        }
    }

    public static void o(View view, h.a aVar, u0.l lVar) {
        t0.a aVar2;
        if (lVar == null) {
            n(aVar.a(), view);
            i(0, view);
            return;
        }
        h.a aVar3 = new h.a(null, aVar.f33744b, null, lVar, aVar.f33745c);
        View.AccessibilityDelegate d10 = d(view);
        if (d10 == null) {
            aVar2 = null;
        } else if (d10 instanceof a.C0543a) {
            aVar2 = ((a.C0543a) d10).f32271a;
        } else {
            aVar2 = new t0.a(d10);
        }
        if (aVar2 == null) {
            aVar2 = new t0.a();
        }
        q(view, aVar2);
        n(aVar3.a(), view);
        f(view).add(aVar3);
        i(0, view);
    }

    public static void p(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i6) {
        if (Build.VERSION.SDK_INT >= 29) {
            n.c(view, context, iArr, attributeSet, typedArray, i6, 0);
        }
    }

    public static void q(View view, t0.a aVar) {
        a.C0543a c0543a;
        if (aVar == null && (d(view) instanceof a.C0543a)) {
            aVar = new t0.a();
        }
        if (aVar == null) {
            c0543a = null;
        } else {
            c0543a = aVar.f32270b;
        }
        view.setAccessibilityDelegate(c0543a);
    }

    public static void r(View view, CharSequence charSequence) {
        boolean z10;
        new a0().e(view, charSequence);
        a aVar = f32293g;
        if (charSequence != null) {
            WeakHashMap<View, Boolean> weakHashMap = aVar.f32294u;
            if (view.isShown() && view.getWindowVisibility() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            weakHashMap.put(view, Boolean.valueOf(z10));
            view.addOnAttachStateChangeListener(aVar);
            if (g.b(view)) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(aVar);
                return;
            }
            return;
        }
        aVar.f32294u.remove(view);
        view.removeOnAttachStateChangeListener(aVar);
        d.o(view.getViewTreeObserver(), aVar);
    }

    public static void s(View view, ColorStateList colorStateList) {
        boolean z10;
        int i6 = Build.VERSION.SDK_INT;
        i.q(view, colorStateList);
        if (i6 == 21) {
            Drawable background = view.getBackground();
            if (i.g(view) == null && i.h(view) == null) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (background != null && z10) {
                if (background.isStateful()) {
                    background.setState(view.getDrawableState());
                }
                d.q(view, background);
            }
        }
    }

    public static void t(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }

    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    public static class a implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* renamed from: u  reason: collision with root package name */
        public final WeakHashMap<View, Boolean> f32294u = new WeakHashMap<>();

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            boolean z10;
            int i6;
            if (Build.VERSION.SDK_INT < 28) {
                WeakHashMap<View, Boolean> weakHashMap = this.f32294u;
                for (Map.Entry<View, Boolean> entry : weakHashMap.entrySet()) {
                    View key = entry.getKey();
                    boolean booleanValue = entry.getValue().booleanValue();
                    if (key.isShown() && key.getWindowVisibility() == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (booleanValue != z10) {
                        if (z10) {
                            i6 = 16;
                        } else {
                            i6 = 32;
                        }
                        d0.i(i6, key);
                        weakHashMap.put(key, Boolean.valueOf(z10));
                    }
                }
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
        }
    }
}
