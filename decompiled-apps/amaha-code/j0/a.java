package j0;

import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
/* compiled from: BlendModeColorFilterCompat.java */
/* loaded from: classes.dex */
public final class a {

    /* compiled from: BlendModeColorFilterCompat.java */
    /* renamed from: j0.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0320a {
        public static ColorFilter a(int i6, Object obj) {
            return new BlendModeColorFilter(i6, (BlendMode) obj);
        }
    }

    public static ColorFilter a(int i6) {
        b bVar = b.SRC_ATOP;
        if (Build.VERSION.SDK_INT >= 29) {
            Object a10 = c.a(bVar);
            if (a10 == null) {
                return null;
            }
            return C0320a.a(i6, a10);
        }
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
        if (mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(i6, mode);
    }
}
