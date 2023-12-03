package sb;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.l1;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.theinnerhour.b2b.R;
import java.util.WeakHashMap;
import k0.a;
import qb.t;
import t0.d0;
import t0.o0;
import ug.l;
import yb.i;
/* compiled from: NavigationBarView.java */
/* loaded from: classes.dex */
public abstract class g extends FrameLayout {

    /* renamed from: u  reason: collision with root package name */
    public final sb.c f31410u;

    /* renamed from: v  reason: collision with root package name */
    public final d f31411v;

    /* renamed from: w  reason: collision with root package name */
    public final e f31412w;

    /* renamed from: x  reason: collision with root package name */
    public k.f f31413x;

    /* renamed from: y  reason: collision with root package name */
    public b f31414y;

    /* compiled from: NavigationBarView.java */
    /* loaded from: classes.dex */
    public interface a {
    }

    /* compiled from: NavigationBarView.java */
    /* loaded from: classes.dex */
    public interface b {
        boolean c(MenuItem menuItem);
    }

    /* compiled from: NavigationBarView.java */
    /* loaded from: classes.dex */
    public static class c extends z0.a {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: w  reason: collision with root package name */
        public Bundle f31415w;

        /* compiled from: NavigationBarView.java */
        /* loaded from: classes.dex */
        public class a implements Parcelable.ClassLoaderCreator<c> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final c createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new c(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i6) {
                return new c[i6];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new c(parcel, null);
            }
        }

        public c(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // z0.a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i6) {
            parcel.writeParcelable(this.f39113u, i6);
            parcel.writeBundle(this.f31415w);
        }

        public c(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f31415w = parcel.readBundle(classLoader == null ? c.class.getClassLoader() : classLoader);
        }
    }

    public g(Context context, AttributeSet attributeSet) {
        super(fc.a.a(context, attributeSet, R.attr.bottomNavigationStyle, 2132083617), attributeSet, R.attr.bottomNavigationStyle);
        e eVar = new e();
        this.f31412w = eVar;
        Context context2 = getContext();
        l1 e10 = t.e(context2, attributeSet, l.D, R.attr.bottomNavigationStyle, 2132083617, 10, 9);
        sb.c cVar = new sb.c(context2, getClass(), getMaxItemCount());
        this.f31410u = cVar;
        eb.b bVar = new eb.b(context2);
        this.f31411v = bVar;
        eVar.f31404u = bVar;
        eVar.f31406w = 1;
        bVar.setPresenter(eVar);
        cVar.b(eVar, cVar.f1093a);
        getContext();
        eVar.f31404u.W = cVar;
        if (e10.l(5)) {
            bVar.setIconTintList(e10.b(5));
        } else {
            bVar.setIconTintList(bVar.c());
        }
        setItemIconSize(e10.d(4, getResources().getDimensionPixelSize(R.dimen.mtrl_navigation_bar_item_default_icon_size)));
        if (e10.l(10)) {
            setItemTextAppearanceInactive(e10.i(10, 0));
        }
        if (e10.l(9)) {
            setItemTextAppearanceActive(e10.i(9, 0));
        }
        if (e10.l(11)) {
            setItemTextColor(e10.b(11));
        }
        if (getBackground() == null || (getBackground() instanceof ColorDrawable)) {
            yb.f fVar = new yb.f();
            Drawable background = getBackground();
            if (background instanceof ColorDrawable) {
                fVar.k(ColorStateList.valueOf(((ColorDrawable) background).getColor()));
            }
            fVar.i(context2);
            WeakHashMap<View, o0> weakHashMap = d0.f32288a;
            d0.d.q(this, fVar);
        }
        if (e10.l(7)) {
            setItemPaddingTop(e10.d(7, 0));
        }
        if (e10.l(6)) {
            setItemPaddingBottom(e10.d(6, 0));
        }
        if (e10.l(1)) {
            setElevation(e10.d(1, 0));
        }
        a.b.h(getBackground().mutate(), ub.d.b(context2, e10, 0));
        setLabelVisibilityMode(e10.f1474b.getInteger(12, -1));
        int i6 = e10.i(3, 0);
        if (i6 != 0) {
            bVar.setItemBackgroundRes(i6);
        } else {
            setItemRippleColor(ub.d.b(context2, e10, 8));
        }
        int i10 = e10.i(2, 0);
        if (i10 != 0) {
            setItemActiveIndicatorEnabled(true);
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(i10, l.C);
            setItemActiveIndicatorWidth(obtainStyledAttributes.getDimensionPixelSize(1, 0));
            setItemActiveIndicatorHeight(obtainStyledAttributes.getDimensionPixelSize(0, 0));
            setItemActiveIndicatorMarginHorizontal(obtainStyledAttributes.getDimensionPixelOffset(3, 0));
            setItemActiveIndicatorColor(ub.d.a(context2, obtainStyledAttributes, 2));
            setItemActiveIndicatorShapeAppearance(new i(i.a(context2, obtainStyledAttributes.getResourceId(4, 0), 0, new yb.a(0))));
            obtainStyledAttributes.recycle();
        }
        if (e10.l(13)) {
            int i11 = e10.i(13, 0);
            eVar.f31405v = true;
            getMenuInflater().inflate(i11, cVar);
            eVar.f31405v = false;
            eVar.d(true);
        }
        e10.n();
        addView(bVar);
        cVar.f1097e = new f((BottomNavigationView) this);
    }

    private MenuInflater getMenuInflater() {
        if (this.f31413x == null) {
            this.f31413x = new k.f(getContext());
        }
        return this.f31413x;
    }

    public ColorStateList getItemActiveIndicatorColor() {
        return this.f31411v.getItemActiveIndicatorColor();
    }

    public int getItemActiveIndicatorHeight() {
        return this.f31411v.getItemActiveIndicatorHeight();
    }

    public int getItemActiveIndicatorMarginHorizontal() {
        return this.f31411v.getItemActiveIndicatorMarginHorizontal();
    }

    public i getItemActiveIndicatorShapeAppearance() {
        return this.f31411v.getItemActiveIndicatorShapeAppearance();
    }

    public int getItemActiveIndicatorWidth() {
        return this.f31411v.getItemActiveIndicatorWidth();
    }

    public Drawable getItemBackground() {
        return this.f31411v.getItemBackground();
    }

    @Deprecated
    public int getItemBackgroundResource() {
        return this.f31411v.getItemBackgroundRes();
    }

    public int getItemIconSize() {
        return this.f31411v.getItemIconSize();
    }

    public ColorStateList getItemIconTintList() {
        return this.f31411v.getIconTintList();
    }

    public int getItemPaddingBottom() {
        return this.f31411v.getItemPaddingBottom();
    }

    public int getItemPaddingTop() {
        return this.f31411v.getItemPaddingTop();
    }

    public ColorStateList getItemRippleColor() {
        return this.f31411v.getItemRippleColor();
    }

    public int getItemTextAppearanceActive() {
        return this.f31411v.getItemTextAppearanceActive();
    }

    public int getItemTextAppearanceInactive() {
        return this.f31411v.getItemTextAppearanceInactive();
    }

    public ColorStateList getItemTextColor() {
        return this.f31411v.getItemTextColor();
    }

    public int getLabelVisibilityMode() {
        return this.f31411v.getLabelVisibilityMode();
    }

    public abstract int getMaxItemCount();

    public Menu getMenu() {
        return this.f31410u;
    }

    public k getMenuView() {
        return this.f31411v;
    }

    public e getPresenter() {
        return this.f31412w;
    }

    public int getSelectedItemId() {
        return this.f31411v.getSelectedItemId();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        f6.b.Q0(this);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        c cVar = (c) parcelable;
        super.onRestoreInstanceState(cVar.f39113u);
        this.f31410u.t(cVar.f31415w);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        c cVar = new c(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        cVar.f31415w = bundle;
        this.f31410u.v(bundle);
        return cVar;
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        f6.b.O0(this, f);
    }

    public void setItemActiveIndicatorColor(ColorStateList colorStateList) {
        this.f31411v.setItemActiveIndicatorColor(colorStateList);
    }

    public void setItemActiveIndicatorEnabled(boolean z10) {
        this.f31411v.setItemActiveIndicatorEnabled(z10);
    }

    public void setItemActiveIndicatorHeight(int i6) {
        this.f31411v.setItemActiveIndicatorHeight(i6);
    }

    public void setItemActiveIndicatorMarginHorizontal(int i6) {
        this.f31411v.setItemActiveIndicatorMarginHorizontal(i6);
    }

    public void setItemActiveIndicatorShapeAppearance(i iVar) {
        this.f31411v.setItemActiveIndicatorShapeAppearance(iVar);
    }

    public void setItemActiveIndicatorWidth(int i6) {
        this.f31411v.setItemActiveIndicatorWidth(i6);
    }

    public void setItemBackground(Drawable drawable) {
        this.f31411v.setItemBackground(drawable);
    }

    public void setItemBackgroundResource(int i6) {
        this.f31411v.setItemBackgroundRes(i6);
    }

    public void setItemIconSize(int i6) {
        this.f31411v.setItemIconSize(i6);
    }

    public void setItemIconSizeRes(int i6) {
        setItemIconSize(getResources().getDimensionPixelSize(i6));
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.f31411v.setIconTintList(colorStateList);
    }

    public void setItemPaddingBottom(int i6) {
        this.f31411v.setItemPaddingBottom(i6);
    }

    public void setItemPaddingTop(int i6) {
        this.f31411v.setItemPaddingTop(i6);
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.f31411v.setItemRippleColor(colorStateList);
    }

    public void setItemTextAppearanceActive(int i6) {
        this.f31411v.setItemTextAppearanceActive(i6);
    }

    public void setItemTextAppearanceInactive(int i6) {
        this.f31411v.setItemTextAppearanceInactive(i6);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f31411v.setItemTextColor(colorStateList);
    }

    public void setLabelVisibilityMode(int i6) {
        d dVar = this.f31411v;
        if (dVar.getLabelVisibilityMode() != i6) {
            dVar.setLabelVisibilityMode(i6);
            this.f31412w.d(false);
        }
    }

    public void setOnItemSelectedListener(b bVar) {
        this.f31414y = bVar;
    }

    public void setSelectedItemId(int i6) {
        sb.c cVar = this.f31410u;
        MenuItem findItem = cVar.findItem(i6);
        if (findItem != null && !cVar.q(findItem, this.f31412w, 0)) {
            findItem.setChecked(true);
        }
    }

    public void setOnItemReselectedListener(a aVar) {
    }
}
