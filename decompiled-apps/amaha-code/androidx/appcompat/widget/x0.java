package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.Transition;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.lang.reflect.Method;
/* compiled from: MenuPopupWindow.java */
/* loaded from: classes.dex */
public final class x0 extends v0 implements w0 {
    public static final Method Y;
    public w0 X;

    /* compiled from: MenuPopupWindow.java */
    /* loaded from: classes.dex */
    public static class a {
        public static void a(PopupWindow popupWindow, Transition transition) {
            popupWindow.setEnterTransition(transition);
        }

        public static void b(PopupWindow popupWindow, Transition transition) {
            popupWindow.setExitTransition(transition);
        }
    }

    /* compiled from: MenuPopupWindow.java */
    /* loaded from: classes.dex */
    public static class b {
        public static void a(PopupWindow popupWindow, boolean z10) {
            popupWindow.setTouchModal(z10);
        }
    }

    /* compiled from: MenuPopupWindow.java */
    /* loaded from: classes.dex */
    public static class c extends r0 {
        public final int G;
        public final int H;
        public w0 I;
        public androidx.appcompat.view.menu.h J;

        /* compiled from: MenuPopupWindow.java */
        /* loaded from: classes.dex */
        public static class a {
            public static int a(Configuration configuration) {
                return configuration.getLayoutDirection();
            }
        }

        public c(boolean z10, Context context) {
            super(z10, context);
            if (1 == a.a(context.getResources().getConfiguration())) {
                this.G = 21;
                this.H = 22;
                return;
            }
            this.G = 22;
            this.H = 21;
        }

        @Override // androidx.appcompat.widget.r0, android.view.View
        public final boolean onHoverEvent(MotionEvent motionEvent) {
            androidx.appcompat.view.menu.e eVar;
            int i6;
            androidx.appcompat.view.menu.h hVar;
            int pointToPosition;
            int i10;
            if (this.I != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i6 = headerViewListAdapter.getHeadersCount();
                    eVar = (androidx.appcompat.view.menu.e) headerViewListAdapter.getWrappedAdapter();
                } else {
                    eVar = (androidx.appcompat.view.menu.e) adapter;
                    i6 = 0;
                }
                if (motionEvent.getAction() != 10 && (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i10 = pointToPosition - i6) >= 0 && i10 < eVar.getCount()) {
                    hVar = eVar.getItem(i10);
                } else {
                    hVar = null;
                }
                androidx.appcompat.view.menu.h hVar2 = this.J;
                if (hVar2 != hVar) {
                    androidx.appcompat.view.menu.f fVar = eVar.f1086u;
                    if (hVar2 != null) {
                        this.I.g(fVar, hVar2);
                    }
                    this.J = hVar;
                    if (hVar != null) {
                        this.I.d(fVar, hVar);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
        public final boolean onKeyDown(int i6, KeyEvent keyEvent) {
            androidx.appcompat.view.menu.e eVar;
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i6 == this.G) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            } else if (listMenuItemView != null && i6 == this.H) {
                setSelection(-1);
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    eVar = (androidx.appcompat.view.menu.e) ((HeaderViewListAdapter) adapter).getWrappedAdapter();
                } else {
                    eVar = (androidx.appcompat.view.menu.e) adapter;
                }
                eVar.f1086u.c(false);
                return true;
            } else {
                return super.onKeyDown(i6, keyEvent);
            }
        }

        public void setHoverListener(w0 w0Var) {
            this.I = w0Var;
        }

        @Override // androidx.appcompat.widget.r0, android.widget.AbsListView
        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                Y = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public x0(Context context, int i6, int i10) {
        super(context, null, i6, i10);
    }

    @Override // androidx.appcompat.widget.w0
    public final void d(androidx.appcompat.view.menu.f fVar, androidx.appcompat.view.menu.h hVar) {
        w0 w0Var = this.X;
        if (w0Var != null) {
            w0Var.d(fVar, hVar);
        }
    }

    @Override // androidx.appcompat.widget.w0
    public final void g(androidx.appcompat.view.menu.f fVar, MenuItem menuItem) {
        w0 w0Var = this.X;
        if (w0Var != null) {
            w0Var.g(fVar, menuItem);
        }
    }

    @Override // androidx.appcompat.widget.v0
    public final r0 q(boolean z10, Context context) {
        c cVar = new c(z10, context);
        cVar.setHoverListener(this);
        return cVar;
    }
}
