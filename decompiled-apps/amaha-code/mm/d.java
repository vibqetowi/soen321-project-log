package mm;

import android.app.Dialog;
import android.graphics.Bitmap;
import android.view.View;
import com.davemorrissey.labs.subscaleview.ImageSource;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.theinnerhour.b2b.R;
/* compiled from: JournalAttachImageAdapter.kt */
/* loaded from: classes2.dex */
public final class d extends a5.f<Bitmap> {

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ Dialog f25623x;

    public d(Dialog dialog) {
        this.f25623x = dialog;
    }

    @Override // a5.h
    public final void f(Object obj) {
        View findViewById = this.f25623x.findViewById(R.id.ivFullscreenImage);
        kotlin.jvm.internal.i.e(findViewById, "null cannot be cast to non-null type com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView");
        ((SubsamplingScaleImageView) findViewById).setImage(ImageSource.bitmap((Bitmap) obj));
    }
}
