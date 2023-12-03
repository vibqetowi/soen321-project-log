package androidx.constraintlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
/* loaded from: classes.dex */
public class Guideline extends View {

    /* renamed from: u  reason: collision with root package name */
    public boolean f1804u;

    public Guideline(Context context) {
        super(context);
        this.f1804u = true;
        super.setVisibility(8);
    }

    @Override // android.view.View
    public final void onMeasure(int i6, int i10) {
        setMeasuredDimension(0, 0);
    }

    public void setFilterRedundantCalls(boolean z10) {
        this.f1804u = z10;
    }

    public void setGuidelineBegin(int i6) {
        ConstraintLayout.a aVar = (ConstraintLayout.a) getLayoutParams();
        if (this.f1804u && aVar.f1757a == i6) {
            return;
        }
        aVar.f1757a = i6;
        setLayoutParams(aVar);
    }

    public void setGuidelineEnd(int i6) {
        ConstraintLayout.a aVar = (ConstraintLayout.a) getLayoutParams();
        if (this.f1804u && aVar.f1759b == i6) {
            return;
        }
        aVar.f1759b = i6;
        setLayoutParams(aVar);
    }

    public void setGuidelinePercent(float f) {
        ConstraintLayout.a aVar = (ConstraintLayout.a) getLayoutParams();
        if (this.f1804u && aVar.f1761c == f) {
            return;
        }
        aVar.f1761c = f;
        setLayoutParams(aVar);
    }

    public Guideline(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1804u = true;
        super.setVisibility(8);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public void setVisibility(int i6) {
    }
}
