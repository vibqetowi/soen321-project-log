package mm;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.Group;
import com.google.android.material.imageview.ShapeableImageView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.libPackage.circularProgressBar.CircularProgressBar;
import mm.b;
/* compiled from: JournalAttachImageAdapter.kt */
/* loaded from: classes2.dex */
public final class c extends a5.c<Bitmap> {

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ b.a f25621x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ b f25622y;

    public c(b.a aVar, b bVar) {
        this.f25621x = aVar;
        this.f25622y = bVar;
    }

    @Override // a5.h
    public final void f(Object obj) {
        b.a aVar = this.f25621x;
        ((AppCompatImageView) aVar.f2751a.findViewById(R.id.ivJournalAttachImage)).setImageBitmap((Bitmap) obj);
        View view = aVar.f2751a;
        ((CircularProgressBar) view.findViewById(R.id.progressBar)).setVisibility(8);
        ((ShapeableImageView) view.findViewById(R.id.viewTransparentBackground)).setVisibility(8);
        ((Group) view.findViewById(R.id.grpJournalRetry)).setVisibility(8);
        if (!this.f25622y.f25620z) {
            ((AppCompatImageView) view.findViewById(R.id.ivJournalAttachImageClose)).setVisibility(0);
        }
    }

    @Override // a5.h
    public final void m(Drawable drawable) {
    }
}
