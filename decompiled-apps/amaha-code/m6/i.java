package m6;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import m6.g;
/* compiled from: ViewTapTarget.java */
/* loaded from: classes.dex */
public final class i implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ Runnable f24915u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ j f24916v;

    public i(j jVar, g.a aVar) {
        this.f24916v = jVar;
        this.f24915u = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int[] iArr = new int[2];
        j jVar = this.f24916v;
        jVar.f24917i.getLocationOnScreen(iArr);
        int i6 = iArr[0];
        int i10 = iArr[1];
        View view = jVar.f24917i;
        jVar.f24863c = new Rect(i6, i10, view.getWidth() + i6, view.getHeight() + iArr[1]);
        if (jVar.f24864d == null && view.getWidth() > 0 && view.getHeight() > 0) {
            Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
            view.draw(new Canvas(createBitmap));
            BitmapDrawable bitmapDrawable = new BitmapDrawable(view.getContext().getResources(), createBitmap);
            jVar.f24864d = bitmapDrawable;
            bitmapDrawable.setBounds(0, 0, bitmapDrawable.getIntrinsicWidth(), jVar.f24864d.getIntrinsicHeight());
        }
        this.f24915u.run();
    }
}
