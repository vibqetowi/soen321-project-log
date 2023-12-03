package t0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.view.PointerIcon;
/* compiled from: PointerIconCompat.java */
/* loaded from: classes.dex */
public final class x {

    /* renamed from: a  reason: collision with root package name */
    public final PointerIcon f32388a;

    /* compiled from: PointerIconCompat.java */
    /* loaded from: classes.dex */
    public static class a {
        public static PointerIcon a(Bitmap bitmap, float f, float f2) {
            PointerIcon create;
            create = PointerIcon.create(bitmap, f, f2);
            return create;
        }

        public static PointerIcon b(Context context, int i6) {
            PointerIcon systemIcon;
            systemIcon = PointerIcon.getSystemIcon(context, i6);
            return systemIcon;
        }

        public static PointerIcon c(Resources resources, int i6) {
            PointerIcon load;
            load = PointerIcon.load(resources, i6);
            return load;
        }
    }

    public x(PointerIcon pointerIcon) {
        this.f32388a = pointerIcon;
    }
}
