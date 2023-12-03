package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import com.theinnerhour.b2b.R;
/* compiled from: AppCompatRatingBar.java */
/* loaded from: classes.dex */
public final class u extends RatingBar {

    /* renamed from: u  reason: collision with root package name */
    public final s f1561u;

    public u(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.ratingBarStyle);
        g1.a(getContext(), this);
        s sVar = new s(this);
        this.f1561u = sVar;
        sVar.a(attributeSet, R.attr.ratingBarStyle);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i6, int i10) {
        super.onMeasure(i6, i10);
        Bitmap bitmap = this.f1561u.f1541b;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i6, 0), getMeasuredHeight());
        }
    }
}
