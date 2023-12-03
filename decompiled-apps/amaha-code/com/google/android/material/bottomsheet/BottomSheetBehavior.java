package com.google.android.material.bottomsheet;

import a1.c;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.theinnerhour.b2b.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import qb.w;
import r1.b0;
import t0.a;
import t0.d0;
import t0.o0;
import t0.s0;
import u0.h;
import u0.l;
import yb.f;
import yb.i;
/* loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.c<V> {
    private static final int CORNER_ANIMATION_DURATION = 500;
    static final int DEFAULT_SIGNIFICANT_VEL_THRESHOLD = 500;
    private static final int DEF_STYLE_RES = 2132083618;
    private static final float HIDE_FRICTION = 0.1f;
    private static final float HIDE_THRESHOLD = 0.5f;
    private static final int NO_MAX_SIZE = -1;
    public static final int PEEK_HEIGHT_AUTO = -1;
    public static final int SAVE_ALL = -1;
    public static final int SAVE_FIT_TO_CONTENTS = 2;
    public static final int SAVE_HIDEABLE = 4;
    public static final int SAVE_NONE = 0;
    public static final int SAVE_PEEK_HEIGHT = 1;
    public static final int SAVE_SKIP_COLLAPSED = 8;
    public static final int STATE_COLLAPSED = 4;
    public static final int STATE_DRAGGING = 1;
    public static final int STATE_EXPANDED = 3;
    public static final int STATE_HALF_EXPANDED = 6;
    public static final int STATE_HIDDEN = 5;
    public static final int STATE_SETTLING = 2;
    private static final String TAG = "BottomSheetBehavior";
    static final int VIEW_INDEX_ACCESSIBILITY_DELEGATE_VIEW = 1;
    private static final int VIEW_INDEX_BOTTOM_SHEET = 0;
    WeakReference<View> accessibilityDelegateViewRef;
    int activePointerId;
    private ColorStateList backgroundTint;
    private final ArrayList<f> callbacks;
    private int childHeight;
    int collapsedOffset;
    private final c.AbstractC0004c dragCallback;
    private boolean draggable;
    float elevation;
    final SparseIntArray expandHalfwayActionIds;
    private boolean expandedCornersRemoved;
    int expandedOffset;
    private boolean fitToContents;
    int fitToContentsOffset;
    private int gestureInsetBottom;
    private boolean gestureInsetBottomIgnored;
    int halfExpandedOffset;
    float halfExpandedRatio;
    private float hideFriction;
    boolean hideable;
    private boolean ignoreEvents;
    private Map<View, Integer> importantForAccessibilityMap;
    private int initialY;
    private int insetBottom;
    private int insetTop;
    private ValueAnimator interpolatorAnimator;
    private int lastNestedScrollDy;
    int lastStableState;
    private boolean marginLeftSystemWindowInsets;
    private boolean marginRightSystemWindowInsets;
    private boolean marginTopSystemWindowInsets;
    private yb.f materialShapeDrawable;
    private int maxHeight;
    private int maxWidth;
    private float maximumVelocity;
    private boolean nestedScrolled;
    WeakReference<View> nestedScrollingChildRef;
    private boolean paddingBottomSystemWindowInsets;
    private boolean paddingLeftSystemWindowInsets;
    private boolean paddingRightSystemWindowInsets;
    private boolean paddingTopSystemWindowInsets;
    int parentHeight;
    int parentWidth;
    private int peekHeight;
    private boolean peekHeightAuto;
    private int peekHeightGestureInsetBuffer;
    private int peekHeightMin;
    private int saveFlags;
    private i shapeAppearanceModelDefault;
    private boolean shouldRemoveExpandedCorners;
    private int significantVelocityThreshold;
    private boolean skipCollapsed;
    int state;
    private final BottomSheetBehavior<V>.h stateSettlingTracker;
    boolean touchingScrollingChild;
    private boolean updateImportantForAccessibilityOnSiblings;
    private VelocityTracker velocityTracker;
    a1.c viewDragHelper;
    WeakReference<V> viewRef;

    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ View f8838u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ int f8839v;

        public a(View view, int i6) {
            this.f8838u = view;
            this.f8839v = i6;
        }

        @Override // java.lang.Runnable
        public final void run() {
            BottomSheetBehavior.this.startSettling(this.f8838u, this.f8839v, false);
        }
    }

    /* loaded from: classes.dex */
    public class b implements ValueAnimator.AnimatorUpdateListener {
        public b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            if (bottomSheetBehavior.materialShapeDrawable != null) {
                yb.f fVar = bottomSheetBehavior.materialShapeDrawable;
                f.b bVar = fVar.f38424u;
                if (bVar.f38439j != floatValue) {
                    bVar.f38439j = floatValue;
                    fVar.f38428y = true;
                    fVar.invalidateSelf();
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public class c implements w.b {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f8842a;

        public c(boolean z10) {
            this.f8842a = z10;
        }

        /* JADX WARN: Removed duplicated region for block: B:35:0x008f  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x009d  */
        @Override // qb.w.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final s0 a(View view, s0 s0Var, w.c cVar) {
            boolean z10;
            boolean z11;
            int i6;
            int i10;
            s0.k kVar = s0Var.f32351a;
            j0.e f = kVar.f(7);
            j0.e f2 = kVar.f(32);
            int i11 = f.f21624b;
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            bottomSheetBehavior.insetTop = i11;
            boolean c10 = w.c(view);
            int paddingBottom = view.getPaddingBottom();
            int paddingLeft = view.getPaddingLeft();
            int paddingRight = view.getPaddingRight();
            if (bottomSheetBehavior.paddingBottomSystemWindowInsets) {
                bottomSheetBehavior.insetBottom = s0Var.a();
                paddingBottom = cVar.f29518d + bottomSheetBehavior.insetBottom;
            }
            boolean z12 = bottomSheetBehavior.paddingLeftSystemWindowInsets;
            int i12 = f.f21623a;
            if (z12) {
                if (c10) {
                    i10 = cVar.f29517c;
                } else {
                    i10 = cVar.f29515a;
                }
                paddingLeft = i10 + i12;
            }
            boolean z13 = bottomSheetBehavior.paddingRightSystemWindowInsets;
            int i13 = f.f21625c;
            if (z13) {
                if (c10) {
                    i6 = cVar.f29515a;
                } else {
                    i6 = cVar.f29517c;
                }
                paddingRight = i6 + i13;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            boolean z14 = true;
            if (bottomSheetBehavior.marginLeftSystemWindowInsets && marginLayoutParams.leftMargin != i12) {
                marginLayoutParams.leftMargin = i12;
                z10 = true;
            } else {
                z10 = false;
            }
            if (bottomSheetBehavior.marginRightSystemWindowInsets && marginLayoutParams.rightMargin != i13) {
                marginLayoutParams.rightMargin = i13;
                z10 = true;
            }
            if (bottomSheetBehavior.marginTopSystemWindowInsets) {
                int i14 = marginLayoutParams.topMargin;
                int i15 = f.f21624b;
                if (i14 != i15) {
                    marginLayoutParams.topMargin = i15;
                    if (z14) {
                        view.setLayoutParams(marginLayoutParams);
                    }
                    view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
                    z11 = this.f8842a;
                    if (z11) {
                        bottomSheetBehavior.gestureInsetBottom = f2.f21626d;
                    }
                    if (!bottomSheetBehavior.paddingBottomSystemWindowInsets || z11) {
                        bottomSheetBehavior.updatePeekHeight(false);
                    }
                    return s0Var;
                }
            }
            z14 = z10;
            if (z14) {
            }
            view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
            z11 = this.f8842a;
            if (z11) {
            }
            if (!bottomSheetBehavior.paddingBottomSystemWindowInsets) {
            }
            bottomSheetBehavior.updatePeekHeight(false);
            return s0Var;
        }
    }

    /* loaded from: classes.dex */
    public class d extends c.AbstractC0004c {

        /* renamed from: a  reason: collision with root package name */
        public long f8844a;

        public d() {
        }

        @Override // a1.c.AbstractC0004c
        public final int a(View view, int i6) {
            return view.getLeft();
        }

        @Override // a1.c.AbstractC0004c
        public final int b(View view, int i6) {
            return hc.d.j(i6, BottomSheetBehavior.this.getExpandedOffset(), d());
        }

        @Override // a1.c.AbstractC0004c
        public final int d() {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            if (bottomSheetBehavior.canBeHiddenByDragging()) {
                return bottomSheetBehavior.parentHeight;
            }
            return bottomSheetBehavior.collapsedOffset;
        }

        @Override // a1.c.AbstractC0004c
        public final void h(int i6) {
            if (i6 == 1) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.draggable) {
                    bottomSheetBehavior.setStateInternal(1);
                }
            }
        }

        @Override // a1.c.AbstractC0004c
        public final void i(View view, int i6, int i10) {
            BottomSheetBehavior.this.dispatchOnSlide(i10);
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x002d, code lost:
            if (r0.shouldExpandOnUpwardDrag(r1, (r7 * 100.0f) / r0.parentHeight) != false) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0033, code lost:
            if (r7 > r0.halfExpandedOffset) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x008d, code lost:
            if (java.lang.Math.abs(r6.getTop() - r0.getExpandedOffset()) < java.lang.Math.abs(r6.getTop() - r0.halfExpandedOffset)) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x00c1, code lost:
            if (r0.shouldSkipHalfExpandedStateWhenDragging() == false) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x00dd, code lost:
            if (java.lang.Math.abs(r7 - r0.fitToContentsOffset) < java.lang.Math.abs(r7 - r0.collapsedOffset)) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x00f4, code lost:
            if (r0.shouldSkipHalfExpandedStateWhenDragging() != false) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:64:0x010a, code lost:
            if (r0.shouldSkipHalfExpandedStateWhenDragging() == false) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:66:0x010d, code lost:
            r7 = 6;
         */
        @Override // a1.c.AbstractC0004c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void j(View view, float f, float f2) {
            boolean z10;
            int i6;
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            if (f2 < 0.0f) {
                if (!bottomSheetBehavior.fitToContents) {
                    int top = view.getTop();
                    long currentTimeMillis = System.currentTimeMillis() - this.f8844a;
                    if (bottomSheetBehavior.shouldSkipHalfExpandedStateWhenDragging()) {
                    }
                }
                i6 = 3;
            } else if (bottomSheetBehavior.hideable && bottomSheetBehavior.shouldHide(view, f2)) {
                if (Math.abs(f) >= Math.abs(f2) || f2 <= bottomSheetBehavior.significantVelocityThreshold) {
                    if (view.getTop() > (bottomSheetBehavior.getExpandedOffset() + bottomSheetBehavior.parentHeight) / 2) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        if (!bottomSheetBehavior.fitToContents) {
                        }
                        i6 = 3;
                    }
                }
                i6 = 5;
            } else if (f2 != 0.0f && Math.abs(f) <= Math.abs(f2)) {
                if (!bottomSheetBehavior.fitToContents) {
                    int top2 = view.getTop();
                    if (Math.abs(top2 - bottomSheetBehavior.halfExpandedOffset) < Math.abs(top2 - bottomSheetBehavior.collapsedOffset)) {
                    }
                }
                i6 = 4;
            } else {
                int top3 = view.getTop();
                if (!bottomSheetBehavior.fitToContents) {
                    int i10 = bottomSheetBehavior.halfExpandedOffset;
                    if (top3 < i10) {
                        if (top3 >= Math.abs(top3 - bottomSheetBehavior.collapsedOffset)) {
                        }
                        i6 = 3;
                    } else {
                        if (Math.abs(top3 - i10) < Math.abs(top3 - bottomSheetBehavior.collapsedOffset)) {
                        }
                        i6 = 4;
                    }
                }
            }
            bottomSheetBehavior.startSettling(view, i6, bottomSheetBehavior.shouldSkipSmoothAnimation());
        }

        @Override // a1.c.AbstractC0004c
        public final boolean k(int i6, View view) {
            View view2;
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i10 = bottomSheetBehavior.state;
            if (i10 == 1 || bottomSheetBehavior.touchingScrollingChild) {
                return false;
            }
            if (i10 == 3 && bottomSheetBehavior.activePointerId == i6) {
                WeakReference<View> weakReference = bottomSheetBehavior.nestedScrollingChildRef;
                if (weakReference != null) {
                    view2 = weakReference.get();
                } else {
                    view2 = null;
                }
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            this.f8844a = System.currentTimeMillis();
            WeakReference<V> weakReference2 = bottomSheetBehavior.viewRef;
            if (weakReference2 == null || weakReference2.get() != view) {
                return false;
            }
            return true;
        }
    }

    /* loaded from: classes.dex */
    public class e implements l {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ int f8846u;

        public e(int i6) {
            this.f8846u = i6;
        }

        @Override // u0.l
        public final boolean a(View view) {
            BottomSheetBehavior.this.setState(this.f8846u);
            return true;
        }
    }

    /* loaded from: classes.dex */
    public class h {

        /* renamed from: a  reason: collision with root package name */
        public int f8852a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f8853b;

        /* renamed from: c  reason: collision with root package name */
        public final a f8854c = new a();

        /* loaded from: classes.dex */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                h hVar = h.this;
                hVar.f8853b = false;
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                a1.c cVar = bottomSheetBehavior.viewDragHelper;
                if (cVar != null && cVar.g()) {
                    hVar.a(hVar.f8852a);
                } else if (bottomSheetBehavior.state == 2) {
                    bottomSheetBehavior.setStateInternal(hVar.f8852a);
                }
            }
        }

        public h() {
        }

        public final void a(int i6) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            WeakReference<V> weakReference = bottomSheetBehavior.viewRef;
            if (weakReference != null && weakReference.get() != null) {
                this.f8852a = i6;
                if (!this.f8853b) {
                    WeakHashMap<View, o0> weakHashMap = d0.f32288a;
                    d0.d.m(bottomSheetBehavior.viewRef.get(), this.f8854c);
                    this.f8853b = true;
                }
            }
        }
    }

    public BottomSheetBehavior() {
        this.saveFlags = 0;
        this.fitToContents = true;
        this.updateImportantForAccessibilityOnSiblings = false;
        this.maxWidth = -1;
        this.maxHeight = -1;
        this.stateSettlingTracker = new h();
        this.halfExpandedRatio = HIDE_THRESHOLD;
        this.elevation = -1.0f;
        this.draggable = true;
        this.state = 4;
        this.lastStableState = 4;
        this.hideFriction = HIDE_FRICTION;
        this.callbacks = new ArrayList<>();
        this.expandHalfwayActionIds = new SparseIntArray();
        this.dragCallback = new d();
    }

    private int addAccessibilityActionForState(View view, int i6, int i10) {
        int i11;
        boolean z10;
        t0.a aVar;
        String string = view.getResources().getString(i6);
        l createAccessibilityViewCommandForState = createAccessibilityViewCommandForState(i10);
        ArrayList f2 = d0.f(view);
        int i12 = 0;
        while (true) {
            if (i12 < f2.size()) {
                if (TextUtils.equals(string, ((h.a) f2.get(i12)).b())) {
                    i11 = ((h.a) f2.get(i12)).a();
                    break;
                }
                i12++;
            } else {
                int i13 = -1;
                int i14 = 0;
                while (true) {
                    int[] iArr = d0.f32292e;
                    if (i14 >= iArr.length || i13 != -1) {
                        break;
                    }
                    int i15 = iArr[i14];
                    boolean z11 = true;
                    for (int i16 = 0; i16 < f2.size(); i16++) {
                        if (((h.a) f2.get(i16)).a() != i15) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        z11 &= z10;
                    }
                    if (z11) {
                        i13 = i15;
                    }
                    i14++;
                }
                i11 = i13;
            }
        }
        if (i11 != -1) {
            h.a aVar2 = new h.a(null, i11, string, createAccessibilityViewCommandForState, null);
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
            d0.n(aVar2.a(), view);
            d0.f(view).add(aVar2);
            d0.i(0, view);
        }
        return i11;
    }

    private void calculateCollapsedOffset() {
        int calculatePeekHeight = calculatePeekHeight();
        if (this.fitToContents) {
            this.collapsedOffset = Math.max(this.parentHeight - calculatePeekHeight, this.fitToContentsOffset);
        } else {
            this.collapsedOffset = this.parentHeight - calculatePeekHeight;
        }
    }

    private void calculateHalfExpandedOffset() {
        this.halfExpandedOffset = (int) ((1.0f - this.halfExpandedRatio) * this.parentHeight);
    }

    private int calculatePeekHeight() {
        int i6;
        if (this.peekHeightAuto) {
            return Math.min(Math.max(this.peekHeightMin, this.parentHeight - ((this.parentWidth * 9) / 16)), this.childHeight) + this.insetBottom;
        }
        if (!this.gestureInsetBottomIgnored && !this.paddingBottomSystemWindowInsets && (i6 = this.gestureInsetBottom) > 0) {
            return Math.max(this.peekHeight, i6 + this.peekHeightGestureInsetBuffer);
        }
        return this.peekHeight + this.insetBottom;
    }

    private float calculateSlideOffsetWithTop(int i6) {
        float f2;
        float f10;
        int i10 = this.collapsedOffset;
        if (i6 <= i10 && i10 != getExpandedOffset()) {
            int i11 = this.collapsedOffset;
            f2 = i11 - i6;
            f10 = i11 - getExpandedOffset();
        } else {
            int i12 = this.collapsedOffset;
            f2 = i12 - i6;
            f10 = this.parentHeight - i12;
        }
        return f2 / f10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean canBeHiddenByDragging() {
        if (isHideable() && isHideableWhenDragging()) {
            return true;
        }
        return false;
    }

    private void clearAccessibilityAction(View view, int i6) {
        if (view == null) {
            return;
        }
        d0.n(524288, view);
        d0.i(0, view);
        d0.n(262144, view);
        d0.i(0, view);
        d0.n(1048576, view);
        d0.i(0, view);
        int i10 = this.expandHalfwayActionIds.get(i6, -1);
        if (i10 != -1) {
            d0.n(i10, view);
            d0.i(0, view);
            this.expandHalfwayActionIds.delete(i6);
        }
    }

    private l createAccessibilityViewCommandForState(int i6) {
        return new e(i6);
    }

    private void createMaterialShapeDrawableIfNeeded(Context context) {
        if (this.shapeAppearanceModelDefault == null) {
            return;
        }
        yb.f fVar = new yb.f(this.shapeAppearanceModelDefault);
        this.materialShapeDrawable = fVar;
        fVar.i(context);
        ColorStateList colorStateList = this.backgroundTint;
        if (colorStateList != null) {
            this.materialShapeDrawable.k(colorStateList);
            return;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16842801, typedValue, true);
        this.materialShapeDrawable.setTint(typedValue.data);
    }

    private void createShapeValueAnimator() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.interpolatorAnimator = ofFloat;
        ofFloat.setDuration(500L);
        this.interpolatorAnimator.addUpdateListener(new b());
    }

    public static <V extends View> BottomSheetBehavior<V> from(V v10) {
        ViewGroup.LayoutParams layoutParams = v10.getLayoutParams();
        if (layoutParams instanceof CoordinatorLayout.f) {
            CoordinatorLayout.c cVar = ((CoordinatorLayout.f) layoutParams).f1929a;
            if (cVar instanceof BottomSheetBehavior) {
                return (BottomSheetBehavior) cVar;
            }
            throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
        }
        throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
    }

    private int getChildMeasureSpec(int i6, int i10, int i11, int i12) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i6, i10, i12);
        if (i11 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode != 1073741824) {
            if (size != 0) {
                i11 = Math.min(size, i11);
            }
            return View.MeasureSpec.makeMeasureSpec(i11, LinearLayoutManager.INVALID_OFFSET);
        }
        return View.MeasureSpec.makeMeasureSpec(Math.min(size, i11), 1073741824);
    }

    private int getTopOffsetForState(int i6) {
        if (i6 != 3) {
            if (i6 != 4) {
                if (i6 != 5) {
                    if (i6 == 6) {
                        return this.halfExpandedOffset;
                    }
                    throw new IllegalArgumentException(defpackage.c.p("Invalid state to get top offset: ", i6));
                }
                return this.parentHeight;
            }
            return this.collapsedOffset;
        }
        return getExpandedOffset();
    }

    private float getYVelocity() {
        VelocityTracker velocityTracker = this.velocityTracker;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.maximumVelocity);
        return this.velocityTracker.getYVelocity(this.activePointerId);
    }

    private boolean isExpandedAndShouldRemoveCorners() {
        if (this.state == 3 && (this.shouldRemoveExpandedCorners || getExpandedOffset() == 0)) {
            return true;
        }
        return false;
    }

    private boolean isLayouting(V v10) {
        ViewParent parent = v10.getParent();
        if (parent != null && parent.isLayoutRequested()) {
            WeakHashMap<View, o0> weakHashMap = d0.f32288a;
            if (d0.g.b(v10)) {
                return true;
            }
        }
        return false;
    }

    private void replaceAccessibilityActionForState(View view, h.a aVar, int i6) {
        d0.o(view, aVar, createAccessibilityViewCommandForState(i6));
    }

    private void reset() {
        this.activePointerId = -1;
        VelocityTracker velocityTracker = this.velocityTracker;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.velocityTracker = null;
        }
    }

    private void restoreOptionalState(g gVar) {
        int i6 = this.saveFlags;
        if (i6 == 0) {
            return;
        }
        if (i6 == -1 || (i6 & 1) == 1) {
            this.peekHeight = gVar.f8849x;
        }
        if (i6 == -1 || (i6 & 2) == 2) {
            this.fitToContents = gVar.f8850y;
        }
        if (i6 == -1 || (i6 & 4) == 4) {
            this.hideable = gVar.f8851z;
        }
        if (i6 == -1 || (i6 & 8) == 8) {
            this.skipCollapsed = gVar.A;
        }
    }

    private void runAfterLayout(V v10, Runnable runnable) {
        if (isLayouting(v10)) {
            v10.post(runnable);
        } else {
            runnable.run();
        }
    }

    private void setWindowInsetsListener(View view) {
        boolean z10;
        if (Build.VERSION.SDK_INT >= 29 && !isGestureInsetBottomIgnored() && !this.peekHeightAuto) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!this.paddingBottomSystemWindowInsets && !this.paddingLeftSystemWindowInsets && !this.paddingRightSystemWindowInsets && !this.marginLeftSystemWindowInsets && !this.marginRightSystemWindowInsets && !this.marginTopSystemWindowInsets && !z10) {
            return;
        }
        w.a(view, new c(z10));
    }

    private boolean shouldHandleDraggingWithHelper() {
        if (this.viewDragHelper != null && (this.draggable || this.state == 1)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startSettling(View view, int i6, boolean z10) {
        boolean z11;
        int topOffsetForState = getTopOffsetForState(i6);
        a1.c cVar = this.viewDragHelper;
        if (cVar != null && (!z10 ? cVar.s(view, view.getLeft(), topOffsetForState) : cVar.q(view.getLeft(), topOffsetForState))) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            setStateInternal(2);
            updateDrawableForTargetState(i6, true);
            this.stateSettlingTracker.a(i6);
            return;
        }
        setStateInternal(i6);
    }

    private void updateAccessibilityActions() {
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference != null) {
            updateAccessibilityActions(weakReference.get(), 0);
        }
        WeakReference<View> weakReference2 = this.accessibilityDelegateViewRef;
        if (weakReference2 != null) {
            updateAccessibilityActions(weakReference2.get(), 1);
        }
    }

    private void updateDrawableForTargetState(int i6, boolean z10) {
        boolean isExpandedAndShouldRemoveCorners;
        ValueAnimator valueAnimator;
        if (i6 != 2 && this.expandedCornersRemoved != (isExpandedAndShouldRemoveCorners = isExpandedAndShouldRemoveCorners()) && this.materialShapeDrawable != null) {
            this.expandedCornersRemoved = isExpandedAndShouldRemoveCorners;
            float f2 = 1.0f;
            float f10 = 0.0f;
            if (z10 && (valueAnimator = this.interpolatorAnimator) != null) {
                if (valueAnimator.isRunning()) {
                    this.interpolatorAnimator.reverse();
                    return;
                }
                if (!isExpandedAndShouldRemoveCorners) {
                    f10 = 1.0f;
                }
                this.interpolatorAnimator.setFloatValues(1.0f - f10, f10);
                this.interpolatorAnimator.start();
                return;
            }
            ValueAnimator valueAnimator2 = this.interpolatorAnimator;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.interpolatorAnimator.cancel();
            }
            yb.f fVar = this.materialShapeDrawable;
            if (this.expandedCornersRemoved) {
                f2 = 0.0f;
            }
            f.b bVar = fVar.f38424u;
            if (bVar.f38439j != f2) {
                bVar.f38439j = f2;
                fVar.f38428y = true;
                fVar.invalidateSelf();
            }
        }
    }

    private void updateImportantForAccessibility(boolean z10) {
        Map<View, Integer> map;
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = weakReference.get().getParent();
        if (!(parent instanceof CoordinatorLayout)) {
            return;
        }
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
        int childCount = coordinatorLayout.getChildCount();
        if (z10) {
            if (this.importantForAccessibilityMap == null) {
                this.importantForAccessibilityMap = new HashMap(childCount);
            } else {
                return;
            }
        }
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = coordinatorLayout.getChildAt(i6);
            if (childAt != this.viewRef.get()) {
                if (z10) {
                    this.importantForAccessibilityMap.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                    if (this.updateImportantForAccessibilityOnSiblings) {
                        WeakHashMap<View, o0> weakHashMap = d0.f32288a;
                        d0.d.s(childAt, 4);
                    }
                } else if (this.updateImportantForAccessibilityOnSiblings && (map = this.importantForAccessibilityMap) != null && map.containsKey(childAt)) {
                    int intValue = this.importantForAccessibilityMap.get(childAt).intValue();
                    WeakHashMap<View, o0> weakHashMap2 = d0.f32288a;
                    d0.d.s(childAt, intValue);
                }
            }
        }
        if (!z10) {
            this.importantForAccessibilityMap = null;
        } else if (this.updateImportantForAccessibilityOnSiblings) {
            this.viewRef.get().sendAccessibilityEvent(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updatePeekHeight(boolean z10) {
        V v10;
        if (this.viewRef != null) {
            calculateCollapsedOffset();
            if (this.state == 4 && (v10 = this.viewRef.get()) != null) {
                if (z10) {
                    setState(4);
                } else {
                    v10.requestLayout();
                }
            }
        }
    }

    public void addBottomSheetCallback(f fVar) {
        if (!this.callbacks.contains(fVar)) {
            this.callbacks.add(fVar);
        }
    }

    public float calculateSlideOffset() {
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference != null && weakReference.get() != null) {
            return calculateSlideOffsetWithTop(this.viewRef.get().getTop());
        }
        return -1.0f;
    }

    public void disableShapeAnimations() {
        this.interpolatorAnimator = null;
    }

    public void dispatchOnSlide(int i6) {
        V v10 = this.viewRef.get();
        if (v10 != null && !this.callbacks.isEmpty()) {
            calculateSlideOffsetWithTop(i6);
            for (int i10 = 0; i10 < this.callbacks.size(); i10++) {
                this.callbacks.get(i10).b(v10);
            }
        }
    }

    public View findScrollingChild(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        WeakHashMap<View, o0> weakHashMap = d0.f32288a;
        if (d0.i.p(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i6 = 0; i6 < childCount; i6++) {
                View findScrollingChild = findScrollingChild(viewGroup.getChildAt(i6));
                if (findScrollingChild != null) {
                    return findScrollingChild;
                }
            }
        }
        return null;
    }

    public int getExpandedOffset() {
        int i6;
        if (this.fitToContents) {
            return this.fitToContentsOffset;
        }
        int i10 = this.expandedOffset;
        if (this.paddingTopSystemWindowInsets) {
            i6 = 0;
        } else {
            i6 = this.insetTop;
        }
        return Math.max(i10, i6);
    }

    public float getHalfExpandedRatio() {
        return this.halfExpandedRatio;
    }

    public float getHideFriction() {
        return this.hideFriction;
    }

    public int getLastStableState() {
        return this.lastStableState;
    }

    public yb.f getMaterialShapeDrawable() {
        return this.materialShapeDrawable;
    }

    public int getMaxHeight() {
        return this.maxHeight;
    }

    public int getMaxWidth() {
        return this.maxWidth;
    }

    public int getPeekHeight() {
        if (this.peekHeightAuto) {
            return -1;
        }
        return this.peekHeight;
    }

    public int getPeekHeightMin() {
        return this.peekHeightMin;
    }

    public int getSaveFlags() {
        return this.saveFlags;
    }

    public int getSignificantVelocityThreshold() {
        return this.significantVelocityThreshold;
    }

    public boolean getSkipCollapsed() {
        return this.skipCollapsed;
    }

    public int getState() {
        return this.state;
    }

    public boolean isDraggable() {
        return this.draggable;
    }

    public boolean isFitToContents() {
        return this.fitToContents;
    }

    public boolean isGestureInsetBottomIgnored() {
        return this.gestureInsetBottomIgnored;
    }

    public boolean isHideable() {
        return this.hideable;
    }

    public boolean isHideableWhenDragging() {
        return true;
    }

    public boolean isNestedScrollingCheckEnabled() {
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void onAttachedToLayoutParams(CoordinatorLayout.f fVar) {
        super.onAttachedToLayoutParams(fVar);
        this.viewRef = null;
        this.viewDragHelper = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void onDetachedFromLayoutParams() {
        super.onDetachedFromLayoutParams();
        this.viewRef = null;
        this.viewDragHelper = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
        boolean z10;
        View view;
        a1.c cVar;
        if (v10.isShown() && this.draggable) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                reset();
            }
            if (this.velocityTracker == null) {
                this.velocityTracker = VelocityTracker.obtain();
            }
            this.velocityTracker.addMovement(motionEvent);
            View view2 = null;
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    this.touchingScrollingChild = false;
                    this.activePointerId = -1;
                    if (this.ignoreEvents) {
                        this.ignoreEvents = false;
                        return false;
                    }
                }
            } else {
                int x10 = (int) motionEvent.getX();
                this.initialY = (int) motionEvent.getY();
                if (this.state != 2) {
                    WeakReference<View> weakReference = this.nestedScrollingChildRef;
                    if (weakReference != null) {
                        view = weakReference.get();
                    } else {
                        view = null;
                    }
                    if (view != null && coordinatorLayout.j(view, x10, this.initialY)) {
                        this.activePointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                        this.touchingScrollingChild = true;
                    }
                }
                if (this.activePointerId == -1 && !coordinatorLayout.j(v10, x10, this.initialY)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.ignoreEvents = z10;
            }
            if (!this.ignoreEvents && (cVar = this.viewDragHelper) != null && cVar.r(motionEvent)) {
                return true;
            }
            WeakReference<View> weakReference2 = this.nestedScrollingChildRef;
            if (weakReference2 != null) {
                view2 = weakReference2.get();
            }
            if (actionMasked != 2 || view2 == null || this.ignoreEvents || this.state == 1 || coordinatorLayout.j(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.viewDragHelper == null || Math.abs(this.initialY - motionEvent.getY()) <= this.viewDragHelper.f147b) {
                return false;
            }
            return true;
        }
        this.ignoreEvents = true;
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v10, int i6) {
        WeakHashMap<View, o0> weakHashMap = d0.f32288a;
        if (d0.d.b(coordinatorLayout) && !d0.d.b(v10)) {
            v10.setFitsSystemWindows(true);
        }
        if (this.viewRef == null) {
            this.peekHeightMin = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            setWindowInsetsListener(v10);
            this.viewRef = new WeakReference<>(v10);
            yb.f fVar = this.materialShapeDrawable;
            if (fVar != null) {
                d0.d.q(v10, fVar);
                yb.f fVar2 = this.materialShapeDrawable;
                float f2 = this.elevation;
                if (f2 == -1.0f) {
                    f2 = d0.i.i(v10);
                }
                fVar2.j(f2);
            } else {
                ColorStateList colorStateList = this.backgroundTint;
                if (colorStateList != null) {
                    d0.s(v10, colorStateList);
                }
            }
            updateAccessibilityActions();
            if (d0.d.c(v10) == 0) {
                d0.d.s(v10, 1);
            }
        }
        if (this.viewDragHelper == null) {
            this.viewDragHelper = new a1.c(coordinatorLayout.getContext(), coordinatorLayout, this.dragCallback);
        }
        int top = v10.getTop();
        coordinatorLayout.l(i6, v10);
        this.parentWidth = coordinatorLayout.getWidth();
        this.parentHeight = coordinatorLayout.getHeight();
        int height = v10.getHeight();
        this.childHeight = height;
        int i10 = this.parentHeight;
        int i11 = i10 - height;
        int i12 = this.insetTop;
        if (i11 < i12) {
            if (this.paddingTopSystemWindowInsets) {
                this.childHeight = i10;
            } else {
                this.childHeight = i10 - i12;
            }
        }
        this.fitToContentsOffset = Math.max(0, i10 - this.childHeight);
        calculateHalfExpandedOffset();
        calculateCollapsedOffset();
        int i13 = this.state;
        if (i13 == 3) {
            d0.k(getExpandedOffset(), v10);
        } else if (i13 == 6) {
            d0.k(this.halfExpandedOffset, v10);
        } else if (this.hideable && i13 == 5) {
            d0.k(this.parentHeight, v10);
        } else if (i13 == 4) {
            d0.k(this.collapsedOffset, v10);
        } else if (i13 == 1 || i13 == 2) {
            d0.k(top - v10.getTop(), v10);
        }
        updateDrawableForTargetState(this.state, false);
        this.nestedScrollingChildRef = new WeakReference<>(findScrollingChild(v10));
        for (int i14 = 0; i14 < this.callbacks.size(); i14++) {
            this.callbacks.get(i14).a(v10);
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onMeasureChild(CoordinatorLayout coordinatorLayout, V v10, int i6, int i10, int i11, int i12) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v10.getLayoutParams();
        v10.measure(getChildMeasureSpec(i6, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i10, this.maxWidth, marginLayoutParams.width), getChildMeasureSpec(i11, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i12, this.maxHeight, marginLayoutParams.height));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onNestedPreFling(CoordinatorLayout coordinatorLayout, V v10, View view, float f2, float f10) {
        WeakReference<View> weakReference;
        if (!isNestedScrollingCheckEnabled() || (weakReference = this.nestedScrollingChildRef) == null || view != weakReference.get()) {
            return false;
        }
        if (this.state == 3 && !super.onNestedPreFling(coordinatorLayout, v10, view, f2, f10)) {
            return false;
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, V v10, View view, int i6, int i10, int[] iArr, int i11) {
        View view2;
        if (i11 == 1) {
            return;
        }
        WeakReference<View> weakReference = this.nestedScrollingChildRef;
        if (weakReference != null) {
            view2 = weakReference.get();
        } else {
            view2 = null;
        }
        if (isNestedScrollingCheckEnabled() && view != view2) {
            return;
        }
        int top = v10.getTop();
        int i12 = top - i10;
        if (i10 > 0) {
            if (i12 < getExpandedOffset()) {
                int expandedOffset = top - getExpandedOffset();
                iArr[1] = expandedOffset;
                d0.k(-expandedOffset, v10);
                setStateInternal(3);
            } else if (!this.draggable) {
                return;
            } else {
                iArr[1] = i10;
                d0.k(-i10, v10);
                setStateInternal(1);
            }
        } else if (i10 < 0 && !view.canScrollVertically(-1)) {
            if (i12 > this.collapsedOffset && !canBeHiddenByDragging()) {
                int i13 = top - this.collapsedOffset;
                iArr[1] = i13;
                d0.k(-i13, v10);
                setStateInternal(4);
            } else if (!this.draggable) {
                return;
            } else {
                iArr[1] = i10;
                d0.k(-i10, v10);
                setStateInternal(1);
            }
        }
        dispatchOnSlide(v10.getTop());
        this.lastNestedScrollDy = i10;
        this.nestedScrolled = true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, V v10, Parcelable parcelable) {
        g gVar = (g) parcelable;
        super.onRestoreInstanceState(coordinatorLayout, v10, gVar.f39113u);
        restoreOptionalState(gVar);
        int i6 = gVar.f8848w;
        if (i6 != 1 && i6 != 2) {
            this.state = i6;
            this.lastStableState = i6;
            return;
        }
        this.state = 4;
        this.lastStableState = 4;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, V v10) {
        return new g(super.onSaveInstanceState(coordinatorLayout, v10), (BottomSheetBehavior<?>) this);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, V v10, View view, View view2, int i6, int i10) {
        this.lastNestedScrollDy = 0;
        this.nestedScrolled = false;
        if ((i6 & 2) == 0) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0035, code lost:
        if (r4.getTop() <= r2.halfExpandedOffset) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0065, code lost:
        if (java.lang.Math.abs(r3 - r2.fitToContentsOffset) < java.lang.Math.abs(r3 - r2.collapsedOffset)) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x007b, code lost:
        if (shouldSkipHalfExpandedStateWhenDragging() != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x008b, code lost:
        if (java.lang.Math.abs(r3 - r1) < java.lang.Math.abs(r3 - r2.collapsedOffset)) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a7, code lost:
        if (java.lang.Math.abs(r3 - r2.halfExpandedOffset) < java.lang.Math.abs(r3 - r2.collapsedOffset)) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a9, code lost:
        r0 = 6;
     */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, V v10, View view, int i6) {
        WeakReference<View> weakReference;
        int i10 = 3;
        if (v10.getTop() == getExpandedOffset()) {
            setStateInternal(3);
        } else if (isNestedScrollingCheckEnabled() && ((weakReference = this.nestedScrollingChildRef) == null || view != weakReference.get() || !this.nestedScrolled)) {
        } else {
            if (this.lastNestedScrollDy > 0) {
                if (!this.fitToContents) {
                }
                startSettling(v10, i10, false);
                this.nestedScrolled = false;
            }
            if (this.hideable && shouldHide(v10, getYVelocity())) {
                i10 = 5;
            } else if (this.lastNestedScrollDy == 0) {
                int top = v10.getTop();
                if (!this.fitToContents) {
                    int i11 = this.halfExpandedOffset;
                    if (top < i11) {
                        if (top >= Math.abs(top - this.collapsedOffset)) {
                        }
                    }
                }
            } else {
                if (!this.fitToContents) {
                    int top2 = v10.getTop();
                }
                i10 = 4;
            }
            startSettling(v10, i10, false);
            this.nestedScrolled = false;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
        if (!v10.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.state == 1 && actionMasked == 0) {
            return true;
        }
        if (shouldHandleDraggingWithHelper()) {
            this.viewDragHelper.k(motionEvent);
        }
        if (actionMasked == 0) {
            reset();
        }
        if (this.velocityTracker == null) {
            this.velocityTracker = VelocityTracker.obtain();
        }
        this.velocityTracker.addMovement(motionEvent);
        if (shouldHandleDraggingWithHelper() && actionMasked == 2 && !this.ignoreEvents) {
            float abs = Math.abs(this.initialY - motionEvent.getY());
            a1.c cVar = this.viewDragHelper;
            if (abs > cVar.f147b) {
                cVar.b(motionEvent.getPointerId(motionEvent.getActionIndex()), v10);
            }
        }
        return !this.ignoreEvents;
    }

    public void removeBottomSheetCallback(f fVar) {
        this.callbacks.remove(fVar);
    }

    public void setAccessibilityDelegateView(View view) {
        WeakReference<View> weakReference;
        if (view == null && (weakReference = this.accessibilityDelegateViewRef) != null) {
            clearAccessibilityAction(weakReference.get(), 1);
            this.accessibilityDelegateViewRef = null;
            return;
        }
        this.accessibilityDelegateViewRef = new WeakReference<>(view);
        updateAccessibilityActions(view, 1);
    }

    @Deprecated
    public void setBottomSheetCallback(f fVar) {
        Log.w(TAG, "BottomSheetBehavior now supports multiple callbacks. `setBottomSheetCallback()` removes all existing callbacks, including ones set internally by library authors, which may result in unintended behavior. This may change in the future. Please use `addBottomSheetCallback()` and `removeBottomSheetCallback()` instead to set your own callbacks.");
        this.callbacks.clear();
        if (fVar != null) {
            this.callbacks.add(fVar);
        }
    }

    public void setDraggable(boolean z10) {
        this.draggable = z10;
    }

    public void setExpandedOffset(int i6) {
        if (i6 >= 0) {
            this.expandedOffset = i6;
            updateDrawableForTargetState(this.state, true);
            return;
        }
        throw new IllegalArgumentException("offset must be greater than or equal to 0");
    }

    public void setFitToContents(boolean z10) {
        int i6;
        if (this.fitToContents == z10) {
            return;
        }
        this.fitToContents = z10;
        if (this.viewRef != null) {
            calculateCollapsedOffset();
        }
        if (this.fitToContents && this.state == 6) {
            i6 = 3;
        } else {
            i6 = this.state;
        }
        setStateInternal(i6);
        updateDrawableForTargetState(this.state, true);
        updateAccessibilityActions();
    }

    public void setGestureInsetBottomIgnored(boolean z10) {
        this.gestureInsetBottomIgnored = z10;
    }

    public void setHalfExpandedRatio(float f2) {
        if (f2 > 0.0f && f2 < 1.0f) {
            this.halfExpandedRatio = f2;
            if (this.viewRef != null) {
                calculateHalfExpandedOffset();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    }

    public void setHideFriction(float f2) {
        this.hideFriction = f2;
    }

    public void setHideable(boolean z10) {
        if (this.hideable != z10) {
            this.hideable = z10;
            if (!z10 && this.state == 5) {
                setState(4);
            }
            updateAccessibilityActions();
        }
    }

    public void setHideableInternal(boolean z10) {
        this.hideable = z10;
    }

    public void setMaxHeight(int i6) {
        this.maxHeight = i6;
    }

    public void setMaxWidth(int i6) {
        this.maxWidth = i6;
    }

    public void setPeekHeight(int i6) {
        setPeekHeight(i6, false);
    }

    public void setSaveFlags(int i6) {
        this.saveFlags = i6;
    }

    public void setSignificantVelocityThreshold(int i6) {
        this.significantVelocityThreshold = i6;
    }

    public void setSkipCollapsed(boolean z10) {
        this.skipCollapsed = z10;
    }

    public void setState(int i6) {
        String str;
        int i10;
        if (i6 != 1 && i6 != 2) {
            if (!this.hideable && i6 == 5) {
                Log.w(TAG, "Cannot set state: " + i6);
                return;
            }
            if (i6 == 6 && this.fitToContents && getTopOffsetForState(i6) <= this.fitToContentsOffset) {
                i10 = 3;
            } else {
                i10 = i6;
            }
            WeakReference<V> weakReference = this.viewRef;
            if (weakReference != null && weakReference.get() != null) {
                V v10 = this.viewRef.get();
                runAfterLayout(v10, new a(v10, i10));
                return;
            }
            setStateInternal(i6);
            return;
        }
        StringBuilder sb2 = new StringBuilder("STATE_");
        if (i6 == 1) {
            str = "DRAGGING";
        } else {
            str = "SETTLING";
        }
        throw new IllegalArgumentException(b0.b(sb2, str, " should not be set externally."));
    }

    public void setStateInternal(int i6) {
        V v10;
        if (this.state == i6) {
            return;
        }
        this.state = i6;
        if (i6 == 4 || i6 == 3 || i6 == 6 || (this.hideable && i6 == 5)) {
            this.lastStableState = i6;
        }
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference == null || (v10 = weakReference.get()) == null) {
            return;
        }
        if (i6 == 3) {
            updateImportantForAccessibility(true);
        } else if (i6 == 6 || i6 == 5 || i6 == 4) {
            updateImportantForAccessibility(false);
        }
        updateDrawableForTargetState(i6, true);
        for (int i10 = 0; i10 < this.callbacks.size(); i10++) {
            this.callbacks.get(i10).c(i6, v10);
        }
        updateAccessibilityActions();
    }

    public void setUpdateImportantForAccessibilityOnSiblings(boolean z10) {
        this.updateImportantForAccessibilityOnSiblings = z10;
    }

    public boolean shouldExpandOnUpwardDrag(long j10, float f2) {
        return false;
    }

    public boolean shouldHide(View view, float f2) {
        if (this.skipCollapsed) {
            return true;
        }
        if (!isHideableWhenDragging() || view.getTop() < this.collapsedOffset) {
            return false;
        }
        int calculatePeekHeight = calculatePeekHeight();
        if (Math.abs(((f2 * this.hideFriction) + view.getTop()) - this.collapsedOffset) / calculatePeekHeight > HIDE_THRESHOLD) {
            return true;
        }
        return false;
    }

    public boolean shouldSkipHalfExpandedStateWhenDragging() {
        return false;
    }

    public boolean shouldSkipSmoothAnimation() {
        return true;
    }

    public final void setPeekHeight(int i6, boolean z10) {
        boolean z11 = true;
        if (i6 == -1) {
            if (!this.peekHeightAuto) {
                this.peekHeightAuto = true;
            }
            z11 = false;
        } else {
            if (this.peekHeightAuto || this.peekHeight != i6) {
                this.peekHeightAuto = false;
                this.peekHeight = Math.max(0, i6);
            }
            z11 = false;
        }
        if (z11) {
            updatePeekHeight(z10);
        }
    }

    /* loaded from: classes.dex */
    public static class g extends z0.a {
        public static final Parcelable.Creator<g> CREATOR = new a();
        public final boolean A;

        /* renamed from: w  reason: collision with root package name */
        public final int f8848w;

        /* renamed from: x  reason: collision with root package name */
        public final int f8849x;

        /* renamed from: y  reason: collision with root package name */
        public final boolean f8850y;

        /* renamed from: z  reason: collision with root package name */
        public final boolean f8851z;

        /* loaded from: classes.dex */
        public class a implements Parcelable.ClassLoaderCreator<g> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final g createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new g(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i6) {
                return new g[i6];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new g(parcel, (ClassLoader) null);
            }
        }

        public g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f8848w = parcel.readInt();
            this.f8849x = parcel.readInt();
            this.f8850y = parcel.readInt() == 1;
            this.f8851z = parcel.readInt() == 1;
            this.A = parcel.readInt() == 1;
        }

        @Override // z0.a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i6) {
            parcel.writeParcelable(this.f39113u, i6);
            parcel.writeInt(this.f8848w);
            parcel.writeInt(this.f8849x);
            parcel.writeInt(this.f8850y ? 1 : 0);
            parcel.writeInt(this.f8851z ? 1 : 0);
            parcel.writeInt(this.A ? 1 : 0);
        }

        public g(Parcelable parcelable, BottomSheetBehavior<?> bottomSheetBehavior) {
            super(parcelable);
            this.f8848w = bottomSheetBehavior.state;
            this.f8849x = ((BottomSheetBehavior) bottomSheetBehavior).peekHeight;
            this.f8850y = ((BottomSheetBehavior) bottomSheetBehavior).fitToContents;
            this.f8851z = bottomSheetBehavior.hideable;
            this.A = ((BottomSheetBehavior) bottomSheetBehavior).skipCollapsed;
        }
    }

    private void updateAccessibilityActions(View view, int i6) {
        if (view == null) {
            return;
        }
        clearAccessibilityAction(view, i6);
        if (!this.fitToContents && this.state != 6) {
            this.expandHalfwayActionIds.put(i6, addAccessibilityActionForState(view, R.string.bottomsheet_action_expand_halfway, 6));
        }
        if (this.hideable && isHideableWhenDragging() && this.state != 5) {
            replaceAccessibilityActionForState(view, h.a.f33740l, 5);
        }
        int i10 = this.state;
        if (i10 == 3) {
            replaceAccessibilityActionForState(view, h.a.f33739k, this.fitToContents ? 4 : 6);
        } else if (i10 == 4) {
            replaceAccessibilityActionForState(view, h.a.f33738j, this.fitToContents ? 3 : 6);
        } else if (i10 != 6) {
        } else {
            replaceAccessibilityActionForState(view, h.a.f33739k, 4);
            replaceAccessibilityActionForState(view, h.a.f33738j, 3);
        }
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i6;
        this.saveFlags = 0;
        this.fitToContents = true;
        this.updateImportantForAccessibilityOnSiblings = false;
        this.maxWidth = -1;
        this.maxHeight = -1;
        this.stateSettlingTracker = new h();
        this.halfExpandedRatio = HIDE_THRESHOLD;
        this.elevation = -1.0f;
        this.draggable = true;
        this.state = 4;
        this.lastStableState = 4;
        this.hideFriction = HIDE_FRICTION;
        this.callbacks = new ArrayList<>();
        this.expandHalfwayActionIds = new SparseIntArray();
        this.dragCallback = new d();
        this.peekHeightGestureInsetBuffer = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ug.l.f);
        if (obtainStyledAttributes.hasValue(3)) {
            this.backgroundTint = ub.d.a(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(21)) {
            this.shapeAppearanceModelDefault = new i(i.b(context, attributeSet, R.attr.bottomSheetStyle, DEF_STYLE_RES));
        }
        createMaterialShapeDrawableIfNeeded(context);
        createShapeValueAnimator();
        this.elevation = obtainStyledAttributes.getDimension(2, -1.0f);
        if (obtainStyledAttributes.hasValue(0)) {
            setMaxWidth(obtainStyledAttributes.getDimensionPixelSize(0, -1));
        }
        if (obtainStyledAttributes.hasValue(1)) {
            setMaxHeight(obtainStyledAttributes.getDimensionPixelSize(1, -1));
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(9);
        if (peekValue != null && (i6 = peekValue.data) == -1) {
            setPeekHeight(i6);
        } else {
            setPeekHeight(obtainStyledAttributes.getDimensionPixelSize(9, -1));
        }
        setHideable(obtainStyledAttributes.getBoolean(8, false));
        setGestureInsetBottomIgnored(obtainStyledAttributes.getBoolean(13, false));
        setFitToContents(obtainStyledAttributes.getBoolean(6, true));
        setSkipCollapsed(obtainStyledAttributes.getBoolean(12, false));
        setDraggable(obtainStyledAttributes.getBoolean(4, true));
        setSaveFlags(obtainStyledAttributes.getInt(10, 0));
        setHalfExpandedRatio(obtainStyledAttributes.getFloat(7, HIDE_THRESHOLD));
        TypedValue peekValue2 = obtainStyledAttributes.peekValue(5);
        if (peekValue2 != null && peekValue2.type == 16) {
            setExpandedOffset(peekValue2.data);
        } else {
            setExpandedOffset(obtainStyledAttributes.getDimensionPixelOffset(5, 0));
        }
        setSignificantVelocityThreshold(obtainStyledAttributes.getInt(11, 500));
        this.paddingBottomSystemWindowInsets = obtainStyledAttributes.getBoolean(17, false);
        this.paddingLeftSystemWindowInsets = obtainStyledAttributes.getBoolean(18, false);
        this.paddingRightSystemWindowInsets = obtainStyledAttributes.getBoolean(19, false);
        this.paddingTopSystemWindowInsets = obtainStyledAttributes.getBoolean(20, true);
        this.marginLeftSystemWindowInsets = obtainStyledAttributes.getBoolean(14, false);
        this.marginRightSystemWindowInsets = obtainStyledAttributes.getBoolean(15, false);
        this.marginTopSystemWindowInsets = obtainStyledAttributes.getBoolean(16, false);
        this.shouldRemoveExpandedCorners = obtainStyledAttributes.getBoolean(23, true);
        obtainStyledAttributes.recycle();
        this.maximumVelocity = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    /* loaded from: classes.dex */
    public static abstract class f {
        public abstract void b(View view);

        public abstract void c(int i6, View view);

        public void a(View view) {
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void onNestedScroll(CoordinatorLayout coordinatorLayout, V v10, View view, int i6, int i10, int i11, int i12, int i13, int[] iArr) {
    }
}
