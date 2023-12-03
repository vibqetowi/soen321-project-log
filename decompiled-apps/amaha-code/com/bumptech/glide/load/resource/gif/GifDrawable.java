package com.bumptech.glide.load.resource.gif;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import com.appsflyer.R;
import com.bumptech.glide.load.resource.gif.a;
import java.util.ArrayList;
import kc.f;
/* loaded from: classes.dex */
public class GifDrawable extends Drawable implements a.b, Animatable {
    public final int A;
    public boolean B;
    public Paint C;
    public Rect D;

    /* renamed from: u  reason: collision with root package name */
    public final a f5980u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f5981v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f5982w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f5983x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f5984y;

    /* renamed from: z  reason: collision with root package name */
    public int f5985z;

    /* loaded from: classes.dex */
    public static final class a extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        public final com.bumptech.glide.load.resource.gif.a f5986a;

        public a(com.bumptech.glide.load.resource.gif.a aVar) {
            this.f5986a = aVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            return new GifDrawable(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            return new GifDrawable(this);
        }
    }

    public GifDrawable() {
        throw null;
    }

    public GifDrawable(a aVar) {
        this.f5984y = true;
        this.A = -1;
        f.p(aVar);
        this.f5980u = aVar;
    }

    @Override // com.bumptech.glide.load.resource.gif.a.b
    public final void a() {
        com.bumptech.glide.load.resource.gif.a aVar;
        int i6;
        Drawable.Callback callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        if (callback == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        a.C0127a c0127a = this.f5980u.f5986a.f5994i;
        if (c0127a != null) {
            i6 = c0127a.f6004y;
        } else {
            i6 = -1;
        }
        if (i6 == aVar.f5987a.c() - 1) {
            this.f5985z++;
        }
        int i10 = this.A;
        if (i10 != -1 && this.f5985z >= i10) {
            stop();
        }
    }

    public final void b() {
        f.n("You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.", !this.f5983x);
        a aVar = this.f5980u;
        if (aVar.f5986a.f5987a.c() == 1) {
            invalidateSelf();
        } else if (!this.f5981v) {
            this.f5981v = true;
            com.bumptech.glide.load.resource.gif.a aVar2 = aVar.f5986a;
            if (!aVar2.f5995j) {
                ArrayList arrayList = aVar2.f5989c;
                if (!arrayList.contains(this)) {
                    boolean isEmpty = arrayList.isEmpty();
                    arrayList.add(this);
                    if (isEmpty && !aVar2.f) {
                        aVar2.f = true;
                        aVar2.f5995j = false;
                        aVar2.a();
                    }
                    invalidateSelf();
                    return;
                }
                throw new IllegalStateException("Cannot subscribe twice in a row");
            }
            throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Bitmap bitmap;
        if (this.f5983x) {
            return;
        }
        if (this.B) {
            int intrinsicWidth = getIntrinsicWidth();
            int intrinsicHeight = getIntrinsicHeight();
            Rect bounds = getBounds();
            if (this.D == null) {
                this.D = new Rect();
            }
            Gravity.apply(R.styleable.AppCompatTheme_windowActionModeOverlay, intrinsicWidth, intrinsicHeight, bounds, this.D);
            this.B = false;
        }
        com.bumptech.glide.load.resource.gif.a aVar = this.f5980u.f5986a;
        a.C0127a c0127a = aVar.f5994i;
        if (c0127a != null) {
            bitmap = c0127a.A;
        } else {
            bitmap = aVar.f5997l;
        }
        if (this.D == null) {
            this.D = new Rect();
        }
        Rect rect = this.D;
        if (this.C == null) {
            this.C = new Paint(2);
        }
        canvas.drawBitmap(bitmap, (Rect) null, rect, this.C);
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f5980u;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f5980u.f5986a.f6002q;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f5980u.f5986a.f6001p;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f5981v;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.B = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i6) {
        if (this.C == null) {
            this.C = new Paint(2);
        }
        this.C.setAlpha(i6);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.C == null) {
            this.C = new Paint(2);
        }
        this.C.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z10, boolean z11) {
        f.n("Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.", !this.f5983x);
        this.f5984y = z10;
        if (!z10) {
            this.f5981v = false;
            com.bumptech.glide.load.resource.gif.a aVar = this.f5980u.f5986a;
            ArrayList arrayList = aVar.f5989c;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                aVar.f = false;
            }
        } else if (this.f5982w) {
            b();
        }
        return super.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.f5982w = true;
        this.f5985z = 0;
        if (this.f5984y) {
            b();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f5982w = false;
        this.f5981v = false;
        com.bumptech.glide.load.resource.gif.a aVar = this.f5980u.f5986a;
        ArrayList arrayList = aVar.f5989c;
        arrayList.remove(this);
        if (arrayList.isEmpty()) {
            aVar.f = false;
        }
    }
}
