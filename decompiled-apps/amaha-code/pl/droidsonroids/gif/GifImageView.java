package pl.droidsonroids.gif;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.ImageView;
import java.io.IOException;
import java.util.List;
import pl.droidsonroids.gif.d;
/* loaded from: classes2.dex */
public class GifImageView extends ImageView {

    /* renamed from: u  reason: collision with root package name */
    public boolean f28564u;

    public GifImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        d.a aVar;
        List<String> list = d.f28577a;
        if (attributeSet != null && !isInEditMode()) {
            aVar = new d.a(this, attributeSet);
            int i6 = aVar.f28581b;
            if (i6 >= 0) {
                Drawable drawable = getDrawable();
                if (drawable instanceof b) {
                    ((b) drawable).A.t(i6);
                }
                Drawable background = getBackground();
                if (background instanceof b) {
                    ((b) background).A.t(i6);
                }
            }
        } else {
            aVar = new d.a();
        }
        this.f28564u = aVar.f28580a;
        int i10 = aVar.f28578c;
        if (i10 > 0) {
            super.setImageResource(i10);
        }
        int i11 = aVar.f28579d;
        if (i11 > 0) {
            super.setBackgroundResource(i11);
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        c cVar = (c) parcelable;
        super.onRestoreInstanceState(cVar.getSuperState());
        Drawable drawable = getDrawable();
        long[][] jArr = cVar.f28576u;
        long[] jArr2 = jArr[0];
        if (jArr2 != null && (drawable instanceof b)) {
            b bVar = (b) drawable;
            bVar.a(bVar.A.q(jArr2, bVar.f28573z));
        }
        Drawable background = getBackground();
        long[] jArr3 = jArr[1];
        if (jArr3 != null && (background instanceof b)) {
            b bVar2 = (b) background;
            bVar2.a(bVar2.A.q(jArr3, bVar2.f28573z));
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Drawable drawable;
        Drawable drawable2 = null;
        if (this.f28564u) {
            drawable = getDrawable();
        } else {
            drawable = null;
        }
        if (this.f28564u) {
            drawable2 = getBackground();
        }
        return new c(super.onSaveInstanceState(), drawable, drawable2);
    }

    @Override // android.view.View
    public void setBackgroundResource(int i6) {
        if (!d.a(this, false, i6)) {
            super.setBackgroundResource(i6);
        }
    }

    public void setFreezesAnimation(boolean z10) {
        this.f28564u = z10;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i6) {
        if (!d.a(this, true, i6)) {
            super.setImageResource(i6);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    @Override // android.widget.ImageView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setImageURI(Uri uri) {
        boolean z10;
        List<String> list = d.f28577a;
        if (uri != null) {
            try {
                setImageDrawable(new b(getContext().getContentResolver(), uri));
                z10 = true;
            } catch (IOException unused) {
            }
            if (z10) {
                super.setImageURI(uri);
                return;
            }
            return;
        }
        z10 = false;
        if (z10) {
        }
    }
}
