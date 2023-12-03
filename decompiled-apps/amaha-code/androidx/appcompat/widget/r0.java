package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.theinnerhour.b2b.R;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import k0.a;
/* compiled from: DropDownListView.java */
/* loaded from: classes.dex */
public class r0 extends ListView {
    public d A;
    public boolean B;
    public final boolean C;
    public boolean D;
    public androidx.core.widget.h E;
    public f F;

    /* renamed from: u  reason: collision with root package name */
    public final Rect f1520u;

    /* renamed from: v  reason: collision with root package name */
    public int f1521v;

    /* renamed from: w  reason: collision with root package name */
    public int f1522w;

    /* renamed from: x  reason: collision with root package name */
    public int f1523x;

    /* renamed from: y  reason: collision with root package name */
    public int f1524y;

    /* renamed from: z  reason: collision with root package name */
    public int f1525z;

    /* compiled from: DropDownListView.java */
    /* loaded from: classes.dex */
    public static class a {
        public static void a(View view, float f, float f2) {
            view.drawableHotspotChanged(f, f2);
        }
    }

    /* compiled from: DropDownListView.java */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public static final Method f1526a;

        /* renamed from: b  reason: collision with root package name */
        public static final Method f1527b;

        /* renamed from: c  reason: collision with root package name */
        public static final Method f1528c;

        /* renamed from: d  reason: collision with root package name */
        public static final boolean f1529d;

        static {
            try {
                Class cls = Integer.TYPE;
                Class cls2 = Float.TYPE;
                Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, Boolean.TYPE, cls2, cls2);
                f1526a = declaredMethod;
                declaredMethod.setAccessible(true);
                Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
                f1527b = declaredMethod2;
                declaredMethod2.setAccessible(true);
                Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
                f1528c = declaredMethod3;
                declaredMethod3.setAccessible(true);
                f1529d = true;
            } catch (NoSuchMethodException e10) {
                e10.printStackTrace();
            }
        }
    }

    /* compiled from: DropDownListView.java */
    /* loaded from: classes.dex */
    public static class c {
        public static boolean a(AbsListView absListView) {
            return absListView.isSelectedChildViewEnabled();
        }

        public static void b(AbsListView absListView, boolean z10) {
            absListView.setSelectedChildViewEnabled(z10);
        }
    }

    /* compiled from: DropDownListView.java */
    /* loaded from: classes.dex */
    public static class d extends h.c {

        /* renamed from: v  reason: collision with root package name */
        public boolean f1530v;

        public d(Drawable drawable) {
            super(drawable);
            this.f1530v = true;
        }

        @Override // h.c, android.graphics.drawable.Drawable
        public final void draw(Canvas canvas) {
            if (this.f1530v) {
                super.draw(canvas);
            }
        }

        @Override // h.c, android.graphics.drawable.Drawable
        public final void setHotspot(float f, float f2) {
            if (this.f1530v) {
                super.setHotspot(f, f2);
            }
        }

        @Override // h.c, android.graphics.drawable.Drawable
        public final void setHotspotBounds(int i6, int i10, int i11, int i12) {
            if (this.f1530v) {
                super.setHotspotBounds(i6, i10, i11, i12);
            }
        }

        @Override // h.c, android.graphics.drawable.Drawable
        public final boolean setState(int[] iArr) {
            if (this.f1530v) {
                return super.setState(iArr);
            }
            return false;
        }

        @Override // h.c, android.graphics.drawable.Drawable
        public final boolean setVisible(boolean z10, boolean z11) {
            if (this.f1530v) {
                return super.setVisible(z10, z11);
            }
            return false;
        }
    }

    /* compiled from: DropDownListView.java */
    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public static final Field f1531a;

        static {
            Field field = null;
            try {
                field = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
                field.setAccessible(true);
            } catch (NoSuchFieldException e10) {
                e10.printStackTrace();
            }
            f1531a = field;
        }
    }

    /* compiled from: DropDownListView.java */
    /* loaded from: classes.dex */
    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            r0 r0Var = r0.this;
            r0Var.F = null;
            r0Var.drawableStateChanged();
        }
    }

    public r0(boolean z10, Context context) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.f1520u = new Rect();
        this.f1521v = 0;
        this.f1522w = 0;
        this.f1523x = 0;
        this.f1524y = 0;
        this.C = z10;
        setCacheColorHint(0);
    }

    private void setSelectorEnabled(boolean z10) {
        d dVar = this.A;
        if (dVar != null) {
            dVar.f1530v = z10;
        }
    }

    public final int a(int i6, int i10) {
        int makeMeasureSpec;
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        int i11 = listPaddingTop + listPaddingBottom;
        if (adapter == null) {
            return i11;
        }
        dividerHeight = (dividerHeight <= 0 || divider == null) ? 0 : 0;
        int count = adapter.getCount();
        View view = null;
        int i12 = 0;
        for (int i13 = 0; i13 < count; i13++) {
            int itemViewType = adapter.getItemViewType(i13);
            if (itemViewType != i12) {
                view = null;
                i12 = itemViewType;
            }
            view = adapter.getView(i13, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i14 = layoutParams.height;
            if (i14 > 0) {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i14, 1073741824);
            } else {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            }
            view.measure(i6, makeMeasureSpec);
            view.forceLayout();
            if (i13 > 0) {
                i11 += dividerHeight;
            }
            i11 += view.getMeasuredHeight();
            if (i11 >= i10) {
                return i10;
            }
        }
        return i11;
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x0143 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0175  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(MotionEvent motionEvent, int i6) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        View childAt;
        View childAt2;
        int actionMasked = motionEvent.getActionMasked();
        boolean z15 = false;
        if (actionMasked != 1) {
            if (actionMasked != 2) {
                if (actionMasked != 3) {
                    z10 = true;
                    if (z10 || z15) {
                        this.D = false;
                        setPressed(false);
                        drawableStateChanged();
                        childAt2 = getChildAt(this.f1525z - getFirstVisiblePosition());
                        if (childAt2 != null) {
                            childAt2.setPressed(false);
                        }
                    }
                    if (!z10) {
                        if (this.E == null) {
                            this.E = new androidx.core.widget.h(this);
                        }
                        androidx.core.widget.h hVar = this.E;
                        boolean z16 = hVar.J;
                        hVar.J = true;
                        hVar.onTouch(this, motionEvent);
                    } else {
                        androidx.core.widget.h hVar2 = this.E;
                        if (hVar2 != null) {
                            if (hVar2.J) {
                                hVar2.d();
                            }
                            hVar2.J = false;
                        }
                    }
                    return z10;
                }
                z10 = false;
                if (z10) {
                }
                this.D = false;
                setPressed(false);
                drawableStateChanged();
                childAt2 = getChildAt(this.f1525z - getFirstVisiblePosition());
                if (childAt2 != null) {
                }
                if (!z10) {
                }
                return z10;
            }
            z10 = true;
        } else {
            z10 = false;
        }
        int findPointerIndex = motionEvent.findPointerIndex(i6);
        if (findPointerIndex >= 0) {
            int x10 = (int) motionEvent.getX(findPointerIndex);
            int y10 = (int) motionEvent.getY(findPointerIndex);
            int pointToPosition = pointToPosition(x10, y10);
            if (pointToPosition == -1) {
                z15 = true;
            } else {
                View childAt3 = getChildAt(pointToPosition - getFirstVisiblePosition());
                float f2 = x10;
                float f10 = y10;
                this.D = true;
                a.a(this, f2, f10);
                if (!isPressed()) {
                    setPressed(true);
                }
                layoutChildren();
                int i10 = this.f1525z;
                if (i10 != -1 && (childAt = getChildAt(i10 - getFirstVisiblePosition())) != null && childAt != childAt3 && childAt.isPressed()) {
                    childAt.setPressed(false);
                }
                this.f1525z = pointToPosition;
                a.a(childAt3, f2 - childAt3.getLeft(), f10 - childAt3.getTop());
                if (!childAt3.isPressed()) {
                    childAt3.setPressed(true);
                }
                Drawable selector = getSelector();
                if (selector != null && pointToPosition != -1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    selector.setVisible(false, false);
                }
                int left = childAt3.getLeft();
                int top = childAt3.getTop();
                int right = childAt3.getRight();
                int bottom = childAt3.getBottom();
                Rect rect = this.f1520u;
                rect.set(left, top, right, bottom);
                rect.left -= this.f1521v;
                rect.top -= this.f1522w;
                rect.right += this.f1523x;
                rect.bottom += this.f1524y;
                if (o0.a.a()) {
                    z12 = c.a(this);
                } else {
                    Field field = e.f1531a;
                    if (field != null) {
                        try {
                            z12 = field.getBoolean(this);
                        } catch (IllegalAccessException e10) {
                            e10.printStackTrace();
                        }
                    }
                    z12 = false;
                }
                if (childAt3.isEnabled() != z12) {
                    boolean z17 = !z12;
                    if (o0.a.a()) {
                        c.b(this, z17);
                    } else {
                        Field field2 = e.f1531a;
                        if (field2 != null) {
                            try {
                                field2.set(this, Boolean.valueOf(z17));
                            } catch (IllegalAccessException e11) {
                                e11.printStackTrace();
                            }
                        }
                    }
                    if (pointToPosition != -1) {
                        refreshDrawableState();
                    }
                }
                if (z11) {
                    float exactCenterX = rect.exactCenterX();
                    float exactCenterY = rect.exactCenterY();
                    if (getVisibility() == 0) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    z13 = false;
                    selector.setVisible(z14, false);
                    a.b.e(selector, exactCenterX, exactCenterY);
                } else {
                    z13 = false;
                }
                Drawable selector2 = getSelector();
                if (selector2 != null && pointToPosition != -1) {
                    a.b.e(selector2, f2, f10);
                }
                setSelectorEnabled(z13);
                refreshDrawableState();
                if (actionMasked == 1) {
                    performItemClick(childAt3, pointToPosition, getItemIdAtPosition(pointToPosition));
                }
                z10 = true;
                z15 = false;
            }
            if (z10) {
            }
            this.D = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.f1525z - getFirstVisiblePosition());
            if (childAt2 != null) {
            }
            if (!z10) {
            }
            return z10;
        }
        z10 = false;
        if (z10) {
        }
        this.D = false;
        setPressed(false);
        drawableStateChanged();
        childAt2 = getChildAt(this.f1525z - getFirstVisiblePosition());
        if (childAt2 != null) {
        }
        if (!z10) {
        }
        return z10;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f1520u;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.F != null) {
            return;
        }
        super.drawableStateChanged();
        setSelectorEnabled(true);
        Drawable selector = getSelector();
        if (selector != null && this.D && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        if (!this.C && !super.hasFocus()) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        if (!this.C && !super.hasWindowFocus()) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public final boolean isFocused() {
        if (!this.C && !super.isFocused()) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        if ((this.C && this.B) || super.isInTouchMode()) {
            return true;
        }
        return false;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.F = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i6 = Build.VERSION.SDK_INT;
        if (i6 < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.F == null) {
            f fVar = new f();
            this.F = fVar;
            post(fVar);
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked != 9 && actionMasked != 7) {
            setSelection(-1);
        } else {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (pointToPosition != -1 && pointToPosition != getSelectedItemPosition()) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    requestFocus();
                    if (i6 >= 30 && b.f1529d) {
                        try {
                            b.f1526a.invoke(this, Integer.valueOf(pointToPosition), childAt, Boolean.FALSE, -1, -1);
                            b.f1527b.invoke(this, Integer.valueOf(pointToPosition));
                            b.f1528c.invoke(this, Integer.valueOf(pointToPosition));
                        } catch (IllegalAccessException e10) {
                            e10.printStackTrace();
                        } catch (InvocationTargetException e11) {
                            e11.printStackTrace();
                        }
                    } else {
                        setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                    }
                }
                Drawable selector = getSelector();
                if (selector != null && this.D && isPressed()) {
                    selector.setState(getDrawableState());
                }
            }
        }
        return onHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f1525z = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        f fVar = this.F;
        if (fVar != null) {
            r0 r0Var = r0.this;
            r0Var.F = null;
            r0Var.removeCallbacks(fVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z10) {
        this.B = z10;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        d dVar;
        if (drawable != null) {
            dVar = new d(drawable);
        } else {
            dVar = null;
        }
        this.A = dVar;
        super.setSelector(dVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f1521v = rect.left;
        this.f1522w = rect.top;
        this.f1523x = rect.right;
        this.f1524y = rect.bottom;
    }
}
