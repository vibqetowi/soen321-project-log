package t4;

import android.graphics.drawable.Drawable;
import h4.g;
import h4.i;
import java.io.File;
import k4.v;
/* compiled from: UnitDrawableDecoder.java */
/* loaded from: classes.dex */
public final class e implements i {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f32409a;

    public /* synthetic */ e(int i6) {
        this.f32409a = i6;
    }

    @Override // h4.i
    public final /* bridge */ /* synthetic */ boolean a(Object obj, g gVar) {
        switch (this.f32409a) {
            case 0:
                Drawable drawable = (Drawable) obj;
                return true;
            default:
                File file = (File) obj;
                return true;
        }
    }

    @Override // h4.i
    public final v b(Object obj, int i6, int i10, g gVar) {
        switch (this.f32409a) {
            case 0:
                Drawable drawable = (Drawable) obj;
                if (drawable != null) {
                    return new c(drawable, 0);
                }
                return null;
            default:
                return new s4.b((File) obj);
        }
    }
}
