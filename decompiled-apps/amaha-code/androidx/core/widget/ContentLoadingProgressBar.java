package androidx.core.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;
/* loaded from: classes.dex */
public class ContentLoadingProgressBar extends ProgressBar {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ int f1968w = 0;

    /* renamed from: u  reason: collision with root package name */
    public final c f1969u;

    /* renamed from: v  reason: collision with root package name */
    public final c f1970v;

    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.core.widget.c] */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.core.widget.c] */
    public ContentLoadingProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f1969u = new Runnable(this) { // from class: androidx.core.widget.c

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ ContentLoadingProgressBar f1990v;

            {
                this.f1990v = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i6 = r2;
                ContentLoadingProgressBar contentLoadingProgressBar = this.f1990v;
                switch (i6) {
                    case 0:
                        int i10 = ContentLoadingProgressBar.f1968w;
                        contentLoadingProgressBar.setVisibility(8);
                        return;
                    default:
                        int i11 = ContentLoadingProgressBar.f1968w;
                        contentLoadingProgressBar.getClass();
                        System.currentTimeMillis();
                        contentLoadingProgressBar.setVisibility(0);
                        return;
                }
            }
        };
        this.f1970v = new Runnable(this) { // from class: androidx.core.widget.c

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ ContentLoadingProgressBar f1990v;

            {
                this.f1990v = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i6 = r2;
                ContentLoadingProgressBar contentLoadingProgressBar = this.f1990v;
                switch (i6) {
                    case 0:
                        int i10 = ContentLoadingProgressBar.f1968w;
                        contentLoadingProgressBar.setVisibility(8);
                        return;
                    default:
                        int i11 = ContentLoadingProgressBar.f1968w;
                        contentLoadingProgressBar.getClass();
                        System.currentTimeMillis();
                        contentLoadingProgressBar.setVisibility(0);
                        return;
                }
            }
        };
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        removeCallbacks(this.f1969u);
        removeCallbacks(this.f1970v);
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f1969u);
        removeCallbacks(this.f1970v);
    }
}
