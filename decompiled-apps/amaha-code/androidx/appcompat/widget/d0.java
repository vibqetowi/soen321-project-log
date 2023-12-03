package androidx.appcompat.widget;

import android.graphics.Typeface;
import android.widget.TextView;
/* compiled from: AppCompatTextHelper.java */
/* loaded from: classes.dex */
public final class d0 implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ TextView f1387u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Typeface f1388v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ int f1389w;

    public d0(TextView textView, Typeface typeface, int i6) {
        this.f1387u = textView;
        this.f1388v = typeface;
        this.f1389w = i6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f1387u.setTypeface(this.f1388v, this.f1389w);
    }
}
