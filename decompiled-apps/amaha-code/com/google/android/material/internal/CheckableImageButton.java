package com.google.android.material.internal;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import androidx.appcompat.widget.AppCompatImageButton;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.Constants;
import qb.c;
import t0.d0;
/* loaded from: classes.dex */
public class CheckableImageButton extends AppCompatImageButton implements Checkable {
    public static final int[] A = {16842912};

    /* renamed from: x  reason: collision with root package name */
    public boolean f9086x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f9087y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f9088z;

    /* loaded from: classes.dex */
    public static class a extends z0.a {
        public static final Parcelable.Creator<a> CREATOR = new C0149a();

        /* renamed from: w  reason: collision with root package name */
        public boolean f9089w;

        /* renamed from: com.google.android.material.internal.CheckableImageButton$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0149a implements Parcelable.ClassLoaderCreator<a> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final a createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new a(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i6) {
                return new a[i6];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new a(parcel, null);
            }
        }

        public a(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // z0.a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i6) {
            parcel.writeParcelable(this.f39113u, i6);
            parcel.writeInt(this.f9089w ? 1 : 0);
        }

        public a(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f9089w = parcel.readInt() == 1;
        }
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.imageButtonStyle);
        this.f9087y = true;
        this.f9088z = true;
        d0.q(this, new c(this));
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f9086x;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i6) {
        if (this.f9086x) {
            return View.mergeDrawableStates(super.onCreateDrawableState(i6 + 1), A);
        }
        return super.onCreateDrawableState(i6);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        super.onRestoreInstanceState(aVar.f39113u);
        setChecked(aVar.f9089w);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        a aVar = new a(super.onSaveInstanceState());
        aVar.f9089w = this.f9086x;
        return aVar;
    }

    public void setCheckable(boolean z10) {
        if (this.f9087y != z10) {
            this.f9087y = z10;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z10) {
        if (this.f9087y && this.f9086x != z10) {
            this.f9086x = z10;
            refreshDrawableState();
            sendAccessibilityEvent(Constants.PROFILE_ASSET_DOWNLOAD_JOB_ID);
        }
    }

    public void setPressable(boolean z10) {
        this.f9088z = z10;
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
        if (this.f9088z) {
            super.setPressed(z10);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f9086x);
    }
}
