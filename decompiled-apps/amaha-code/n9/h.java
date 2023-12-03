package n9;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
/* loaded from: classes.dex */
public final class h implements a {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f25958u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ j f25959v;

    public /* synthetic */ h(j jVar, int i6) {
        this.f25958u = i6;
        this.f25959v = jVar;
    }

    @Override // n9.a
    public final void b(Bitmap bitmap) {
        int i6 = this.f25958u;
        j jVar = this.f25959v;
        switch (i6) {
            case 0:
                Bitmap bitmap2 = null;
                if (bitmap != null) {
                    int width = bitmap.getWidth();
                    int height = bitmap.getHeight();
                    float f = width;
                    int i10 = (int) (((9.0f * f) / 16.0f) + 0.5f);
                    float f2 = (i10 - height) / 2;
                    RectF rectF = new RectF(0.0f, f2, f, height + f2);
                    Bitmap.Config config = bitmap.getConfig();
                    if (config == null) {
                        config = Bitmap.Config.ARGB_8888;
                    }
                    Bitmap createBitmap = Bitmap.createBitmap(width, i10, config);
                    new Canvas(createBitmap).drawBitmap(bitmap, (Rect) null, rectF, (Paint) null);
                    bitmap2 = createBitmap;
                }
                jVar.j(0, bitmap2);
                return;
            default:
                jVar.j(3, bitmap);
                return;
        }
    }
}
