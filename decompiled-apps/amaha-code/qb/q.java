package qb;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import java.lang.ref.WeakReference;
/* compiled from: TextDrawableHelper.java */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: c  reason: collision with root package name */
    public float f29504c;

    /* renamed from: e  reason: collision with root package name */
    public WeakReference<b> f29506e;
    public ub.e f;

    /* renamed from: a  reason: collision with root package name */
    public final TextPaint f29502a = new TextPaint(1);

    /* renamed from: b  reason: collision with root package name */
    public final a f29503b = new a();

    /* renamed from: d  reason: collision with root package name */
    public boolean f29505d = true;

    /* compiled from: TextDrawableHelper.java */
    /* loaded from: classes.dex */
    public class a extends com.android.volley.toolbox.a {
        public a() {
        }

        @Override // com.android.volley.toolbox.a
        public final void m(int i6) {
            q qVar = q.this;
            qVar.f29505d = true;
            b bVar = qVar.f29506e.get();
            if (bVar != null) {
                bVar.a();
            }
        }

        @Override // com.android.volley.toolbox.a
        public final void n(Typeface typeface, boolean z10) {
            if (z10) {
                return;
            }
            q qVar = q.this;
            qVar.f29505d = true;
            b bVar = qVar.f29506e.get();
            if (bVar != null) {
                bVar.a();
            }
        }
    }

    /* compiled from: TextDrawableHelper.java */
    /* loaded from: classes.dex */
    public interface b {
        void a();

        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public q(b bVar) {
        this.f29506e = new WeakReference<>(null);
        this.f29506e = new WeakReference<>(bVar);
    }

    public final float a(String str) {
        float measureText;
        if (!this.f29505d) {
            return this.f29504c;
        }
        if (str == null) {
            measureText = 0.0f;
        } else {
            measureText = this.f29502a.measureText((CharSequence) str, 0, str.length());
        }
        this.f29504c = measureText;
        this.f29505d = false;
        return measureText;
    }

    public final void b(ub.e eVar, Context context) {
        if (this.f != eVar) {
            this.f = eVar;
            if (eVar != null) {
                TextPaint textPaint = this.f29502a;
                a aVar = this.f29503b;
                eVar.f(context, textPaint, aVar);
                b bVar = this.f29506e.get();
                if (bVar != null) {
                    textPaint.drawableState = bVar.getState();
                }
                eVar.e(context, textPaint, aVar);
                this.f29505d = true;
            }
            b bVar2 = this.f29506e.get();
            if (bVar2 != null) {
                bVar2.a();
                bVar2.onStateChange(bVar2.getState());
            }
        }
    }
}
