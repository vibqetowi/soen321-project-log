package androidx.appcompat.widget;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.b;
import com.theinnerhour.b2b.R;
import java.util.WeakHashMap;
import t0.d0;
/* loaded from: classes.dex */
public class AppCompatSpinner extends Spinner {
    public static final int[] C = {16843505};
    public int A;
    public final Rect B;

    /* renamed from: u  reason: collision with root package name */
    public final androidx.appcompat.widget.e f1197u;

    /* renamed from: v  reason: collision with root package name */
    public final Context f1198v;

    /* renamed from: w  reason: collision with root package name */
    public final y f1199w;

    /* renamed from: x  reason: collision with root package name */
    public SpinnerAdapter f1200x;

    /* renamed from: y  reason: collision with root package name */
    public final boolean f1201y;

    /* renamed from: z  reason: collision with root package name */
    public final i f1202z;

    /* loaded from: classes.dex */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
            if (!appCompatSpinner.getInternalPopup().a()) {
                appCompatSpinner.f1202z.n(c.b(appCompatSpinner), c.a(appCompatSpinner));
            }
            ViewTreeObserver viewTreeObserver = appCompatSpinner.getViewTreeObserver();
            if (viewTreeObserver != null) {
                b.a(viewTreeObserver, this);
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        public static void a(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    /* loaded from: classes.dex */
    public static final class c {
        public static int a(View view) {
            return view.getTextAlignment();
        }

        public static int b(View view) {
            return view.getTextDirection();
        }

        public static void c(View view, int i6) {
            view.setTextAlignment(i6);
        }

        public static void d(View view, int i6) {
            view.setTextDirection(i6);
        }
    }

    /* loaded from: classes.dex */
    public static final class d {
        public static void a(ThemedSpinnerAdapter themedSpinnerAdapter, Resources.Theme theme) {
            Resources.Theme dropDownViewTheme;
            dropDownViewTheme = themedSpinnerAdapter.getDropDownViewTheme();
            if (!s0.b.a(dropDownViewTheme, theme)) {
                themedSpinnerAdapter.setDropDownViewTheme(theme);
            }
        }
    }

    /* loaded from: classes.dex */
    public class e implements i, DialogInterface.OnClickListener {

        /* renamed from: u  reason: collision with root package name */
        public androidx.appcompat.app.b f1204u;

        /* renamed from: v  reason: collision with root package name */
        public ListAdapter f1205v;

        /* renamed from: w  reason: collision with root package name */
        public CharSequence f1206w;

        public e() {
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.i
        public final boolean a() {
            androidx.appcompat.app.b bVar = this.f1204u;
            if (bVar != null) {
                return bVar.isShowing();
            }
            return false;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.i
        public final int c() {
            return 0;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.i
        public final void dismiss() {
            androidx.appcompat.app.b bVar = this.f1204u;
            if (bVar != null) {
                bVar.dismiss();
                this.f1204u = null;
            }
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.i
        public final void e(int i6) {
            Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.i
        public final CharSequence f() {
            return this.f1206w;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.i
        public final Drawable h() {
            return null;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.i
        public final void i(CharSequence charSequence) {
            this.f1206w = charSequence;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.i
        public final void k(Drawable drawable) {
            Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.i
        public final void l(int i6) {
            Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.i
        public final void m(int i6) {
            Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.i
        public final void n(int i6, int i10) {
            if (this.f1205v == null) {
                return;
            }
            AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
            b.a aVar = new b.a(appCompatSpinner.getPopupContext());
            CharSequence charSequence = this.f1206w;
            if (charSequence != null) {
                aVar.setTitle(charSequence);
            }
            ListAdapter listAdapter = this.f1205v;
            int selectedItemPosition = appCompatSpinner.getSelectedItemPosition();
            AlertController.b bVar = aVar.f1046a;
            bVar.f1038n = listAdapter;
            bVar.f1039o = this;
            bVar.r = selectedItemPosition;
            bVar.f1041q = true;
            androidx.appcompat.app.b create = aVar.create();
            this.f1204u = create;
            AlertController.RecycleListView recycleListView = create.f1045y.f1004g;
            c.d(recycleListView, i6);
            c.c(recycleListView, i10);
            this.f1204u.show();
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.i
        public final int o() {
            return 0;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i6) {
            AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
            appCompatSpinner.setSelection(i6);
            if (appCompatSpinner.getOnItemClickListener() != null) {
                appCompatSpinner.performItemClick(null, i6, this.f1205v.getItemId(i6));
            }
            dismiss();
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.i
        public final void p(ListAdapter listAdapter) {
            this.f1205v = listAdapter;
        }
    }

    /* loaded from: classes.dex */
    public static class f implements ListAdapter, SpinnerAdapter {

        /* renamed from: u  reason: collision with root package name */
        public final SpinnerAdapter f1208u;

        /* renamed from: v  reason: collision with root package name */
        public final ListAdapter f1209v;

        public f(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f1208u = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f1209v = (ListAdapter) spinnerAdapter;
            }
            if (theme != null) {
                if (Build.VERSION.SDK_INT >= 23 && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                    d.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
                } else if (spinnerAdapter instanceof h1) {
                    h1 h1Var = (h1) spinnerAdapter;
                    if (h1Var.getDropDownViewTheme() == null) {
                        h1Var.a();
                    }
                }
            }
        }

        @Override // android.widget.ListAdapter
        public final boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f1209v;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        @Override // android.widget.Adapter
        public final int getCount() {
            SpinnerAdapter spinnerAdapter = this.f1208u;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        @Override // android.widget.SpinnerAdapter
        public final View getDropDownView(int i6, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f1208u;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i6, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public final Object getItem(int i6) {
            SpinnerAdapter spinnerAdapter = this.f1208u;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i6);
        }

        @Override // android.widget.Adapter
        public final long getItemId(int i6) {
            SpinnerAdapter spinnerAdapter = this.f1208u;
            if (spinnerAdapter == null) {
                return -1L;
            }
            return spinnerAdapter.getItemId(i6);
        }

        @Override // android.widget.Adapter
        public final int getItemViewType(int i6) {
            return 0;
        }

        @Override // android.widget.Adapter
        public final View getView(int i6, View view, ViewGroup viewGroup) {
            return getDropDownView(i6, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public final int getViewTypeCount() {
            return 1;
        }

        @Override // android.widget.Adapter
        public final boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f1208u;
            if (spinnerAdapter != null && spinnerAdapter.hasStableIds()) {
                return true;
            }
            return false;
        }

        @Override // android.widget.Adapter
        public final boolean isEmpty() {
            if (getCount() == 0) {
                return true;
            }
            return false;
        }

        @Override // android.widget.ListAdapter
        public final boolean isEnabled(int i6) {
            ListAdapter listAdapter = this.f1209v;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i6);
            }
            return true;
        }

        @Override // android.widget.Adapter
        public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f1208u;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f1208u;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    /* loaded from: classes.dex */
    public class g extends v0 implements i {
        public CharSequence X;
        public ListAdapter Y;
        public final Rect Z;

        /* renamed from: a0  reason: collision with root package name */
        public int f1210a0;

        /* loaded from: classes.dex */
        public class a implements AdapterView.OnItemClickListener {
            public a() {
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView<?> adapterView, View view, int i6, long j10) {
                g gVar = g.this;
                AppCompatSpinner.this.setSelection(i6);
                if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                    AppCompatSpinner.this.performItemClick(view, i6, gVar.Y.getItemId(i6));
                }
                gVar.dismiss();
            }
        }

        /* loaded from: classes.dex */
        public class b implements ViewTreeObserver.OnGlobalLayoutListener {
            public b() {
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                boolean z10;
                g gVar = g.this;
                AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
                gVar.getClass();
                WeakHashMap<View, t0.o0> weakHashMap = t0.d0.f32288a;
                if (d0.g.b(appCompatSpinner) && appCompatSpinner.getGlobalVisibleRect(gVar.Z)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    gVar.dismiss();
                    return;
                }
                gVar.s();
                gVar.b();
            }
        }

        /* loaded from: classes.dex */
        public class c implements PopupWindow.OnDismissListener {

            /* renamed from: u  reason: collision with root package name */
            public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f1214u;

            public c(b bVar) {
                this.f1214u = bVar;
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f1214u);
                }
            }
        }

        public g(Context context, AttributeSet attributeSet, int i6) {
            super(context, attributeSet, i6, 0);
            this.Z = new Rect();
            this.I = AppCompatSpinner.this;
            this.S = true;
            this.T.setFocusable(true);
            this.J = new a();
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.i
        public final CharSequence f() {
            return this.X;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.i
        public final void i(CharSequence charSequence) {
            this.X = charSequence;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.i
        public final void m(int i6) {
            this.f1210a0 = i6;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.i
        public final void n(int i6, int i10) {
            ViewTreeObserver viewTreeObserver;
            boolean a10 = a();
            s();
            p pVar = this.T;
            pVar.setInputMethodMode(2);
            b();
            r0 r0Var = this.f1567w;
            r0Var.setChoiceMode(1);
            c.d(r0Var, i6);
            c.c(r0Var, i10);
            AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
            int selectedItemPosition = appCompatSpinner.getSelectedItemPosition();
            r0 r0Var2 = this.f1567w;
            if (a() && r0Var2 != null) {
                r0Var2.setListSelectionHidden(false);
                r0Var2.setSelection(selectedItemPosition);
                if (r0Var2.getChoiceMode() != 0) {
                    r0Var2.setItemChecked(selectedItemPosition, true);
                }
            }
            if (!a10 && (viewTreeObserver = appCompatSpinner.getViewTreeObserver()) != null) {
                b bVar = new b();
                viewTreeObserver.addOnGlobalLayoutListener(bVar);
                pVar.setOnDismissListener(new c(bVar));
            }
        }

        @Override // androidx.appcompat.widget.v0, androidx.appcompat.widget.AppCompatSpinner.i
        public final void p(ListAdapter listAdapter) {
            super.p(listAdapter);
            this.Y = listAdapter;
        }

        public final void s() {
            int i6;
            int i10;
            Drawable h10 = h();
            AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
            if (h10 != null) {
                h10.getPadding(appCompatSpinner.B);
                if (u1.a(appCompatSpinner)) {
                    i6 = appCompatSpinner.B.right;
                } else {
                    i6 = -appCompatSpinner.B.left;
                }
            } else {
                Rect rect = appCompatSpinner.B;
                rect.right = 0;
                rect.left = 0;
                i6 = 0;
            }
            int paddingLeft = appCompatSpinner.getPaddingLeft();
            int paddingRight = appCompatSpinner.getPaddingRight();
            int width = appCompatSpinner.getWidth();
            int i11 = appCompatSpinner.A;
            if (i11 == -2) {
                int a10 = appCompatSpinner.a((SpinnerAdapter) this.Y, h());
                int i12 = appCompatSpinner.getContext().getResources().getDisplayMetrics().widthPixels;
                Rect rect2 = appCompatSpinner.B;
                int i13 = (i12 - rect2.left) - rect2.right;
                if (a10 > i13) {
                    a10 = i13;
                }
                r(Math.max(a10, (width - paddingLeft) - paddingRight));
            } else if (i11 == -1) {
                r((width - paddingLeft) - paddingRight);
            } else {
                r(i11);
            }
            if (u1.a(appCompatSpinner)) {
                i10 = (((width - paddingRight) - this.f1569y) - this.f1210a0) + i6;
            } else {
                i10 = paddingLeft + this.f1210a0 + i6;
            }
            this.f1570z = i10;
        }
    }

    /* loaded from: classes.dex */
    public static class h extends View.BaseSavedState {
        public static final Parcelable.Creator<h> CREATOR = new a();

        /* renamed from: u  reason: collision with root package name */
        public boolean f1216u;

        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator<h> {
            @Override // android.os.Parcelable.Creator
            public final h createFromParcel(Parcel parcel) {
                return new h(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final h[] newArray(int i6) {
                return new h[i6];
            }
        }

        public h(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i6) {
            super.writeToParcel(parcel, i6);
            parcel.writeByte(this.f1216u ? (byte) 1 : (byte) 0);
        }

        public h(Parcel parcel) {
            super(parcel);
            this.f1216u = parcel.readByte() != 0;
        }
    }

    /* loaded from: classes.dex */
    public interface i {
        boolean a();

        int c();

        void dismiss();

        void e(int i6);

        CharSequence f();

        Drawable h();

        void i(CharSequence charSequence);

        void k(Drawable drawable);

        void l(int i6);

        void m(int i6);

        void n(int i6, int i10);

        int o();

        void p(ListAdapter listAdapter);
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.spinnerStyle);
    }

    public final int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i6 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i10 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i6) {
                view = null;
                i6 = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i10 = Math.max(i10, view.getMeasuredWidth());
        }
        if (drawable != null) {
            Rect rect = this.B;
            drawable.getPadding(rect);
            return i10 + rect.left + rect.right;
        }
        return i10;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        androidx.appcompat.widget.e eVar = this.f1197u;
        if (eVar != null) {
            eVar.a();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        i iVar = this.f1202z;
        if (iVar != null) {
            return iVar.c();
        }
        return super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        i iVar = this.f1202z;
        if (iVar != null) {
            return iVar.o();
        }
        return super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        if (this.f1202z != null) {
            return this.A;
        }
        return super.getDropDownWidth();
    }

    public final i getInternalPopup() {
        return this.f1202z;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        i iVar = this.f1202z;
        if (iVar != null) {
            return iVar.h();
        }
        return super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f1198v;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        i iVar = this.f1202z;
        if (iVar != null) {
            return iVar.f();
        }
        return super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        androidx.appcompat.widget.e eVar = this.f1197u;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        androidx.appcompat.widget.e eVar = this.f1197u;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        i iVar = this.f1202z;
        if (iVar != null && iVar.a()) {
            iVar.dismiss();
        }
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i6, int i10) {
        super.onMeasure(i6, i10);
        if (this.f1202z != null && View.MeasureSpec.getMode(i6) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i6)), getMeasuredHeight());
        }
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        h hVar = (h) parcelable;
        super.onRestoreInstanceState(hVar.getSuperState());
        if (hVar.f1216u && (viewTreeObserver = getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new a());
        }
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        boolean z10;
        h hVar = new h(super.onSaveInstanceState());
        i iVar = this.f1202z;
        if (iVar != null && iVar.a()) {
            z10 = true;
        } else {
            z10 = false;
        }
        hVar.f1216u = z10;
        return hVar;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        y yVar = this.f1199w;
        if (yVar != null && yVar.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        i iVar = this.f1202z;
        if (iVar != null) {
            if (!iVar.a()) {
                iVar.n(c.b(this), c.a(this));
                return true;
            }
            return true;
        }
        return super.performClick();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        androidx.appcompat.widget.e eVar = this.f1197u;
        if (eVar != null) {
            eVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i6) {
        super.setBackgroundResource(i6);
        androidx.appcompat.widget.e eVar = this.f1197u;
        if (eVar != null) {
            eVar.f(i6);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i6) {
        i iVar = this.f1202z;
        if (iVar != null) {
            iVar.m(i6);
            iVar.e(i6);
            return;
        }
        super.setDropDownHorizontalOffset(i6);
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i6) {
        i iVar = this.f1202z;
        if (iVar != null) {
            iVar.l(i6);
        } else {
            super.setDropDownVerticalOffset(i6);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i6) {
        if (this.f1202z != null) {
            this.A = i6;
        } else {
            super.setDropDownWidth(i6);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        i iVar = this.f1202z;
        if (iVar != null) {
            iVar.k(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i6) {
        setPopupBackgroundDrawable(hc.d.H(getPopupContext(), i6));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        i iVar = this.f1202z;
        if (iVar != null) {
            iVar.i(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        androidx.appcompat.widget.e eVar = this.f1197u;
        if (eVar != null) {
            eVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        androidx.appcompat.widget.e eVar = this.f1197u;
        if (eVar != null) {
            eVar.i(mode);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0056, code lost:
        if (r5 == null) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i6) {
        super(context, attributeSet, i6);
        Exception e10;
        TypedArray typedArray;
        this.B = new Rect();
        g1.a(getContext(), this);
        int[] iArr = kc.f.U;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i6, 0);
        this.f1197u = new androidx.appcompat.widget.e(this);
        int resourceId = obtainStyledAttributes.getResourceId(4, 0);
        if (resourceId != 0) {
            this.f1198v = new k.c(context, resourceId);
        } else {
            this.f1198v = context;
        }
        int i10 = -1;
        TypedArray typedArray2 = null;
        try {
            try {
                typedArray = context.obtainStyledAttributes(attributeSet, C, i6, 0);
                try {
                    if (typedArray.hasValue(0)) {
                        i10 = typedArray.getInt(0, 0);
                    }
                } catch (Exception e11) {
                    e10 = e11;
                    Log.i("AppCompatSpinner", "Could not read android:spinnerMode", e10);
                }
            } catch (Throwable th2) {
                th = th2;
                typedArray2 = typedArray;
                if (typedArray2 != null) {
                    typedArray2.recycle();
                }
                throw th;
            }
        } catch (Exception e12) {
            e10 = e12;
            typedArray = null;
        } catch (Throwable th3) {
            th = th3;
            if (typedArray2 != null) {
            }
            throw th;
        }
        typedArray.recycle();
        if (i10 == 0) {
            e eVar = new e();
            this.f1202z = eVar;
            eVar.f1206w = obtainStyledAttributes.getString(2);
        } else if (i10 == 1) {
            g gVar = new g(this.f1198v, attributeSet, i6);
            l1 m10 = l1.m(this.f1198v, attributeSet, iArr, i6);
            this.A = m10.f1474b.getLayoutDimension(3, -2);
            gVar.k(m10.e(1));
            gVar.X = obtainStyledAttributes.getString(2);
            m10.n();
            this.f1202z = gVar;
            this.f1199w = new y(this, this, gVar);
        }
        CharSequence[] textArray = obtainStyledAttributes.getTextArray(0);
        if (textArray != null) {
            ArrayAdapter arrayAdapter = new ArrayAdapter(context, 17367048, textArray);
            arrayAdapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
            setAdapter((SpinnerAdapter) arrayAdapter);
        }
        obtainStyledAttributes.recycle();
        this.f1201y = true;
        SpinnerAdapter spinnerAdapter = this.f1200x;
        if (spinnerAdapter != null) {
            setAdapter(spinnerAdapter);
            this.f1200x = null;
        }
        this.f1197u.d(attributeSet, i6);
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f1201y) {
            this.f1200x = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        i iVar = this.f1202z;
        if (iVar != null) {
            Context context = this.f1198v;
            if (context == null) {
                context = getContext();
            }
            iVar.p(new f(spinnerAdapter, context.getTheme()));
        }
    }
}
