package coil.target;

import android.graphics.drawable.Drawable;
import kotlin.Metadata;
/* compiled from: Target.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0017J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0017J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0005H\u0017ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcoil/target/Target;", "", "onError", "", "error", "Landroid/graphics/drawable/Drawable;", "onStart", "placeholder", "onSuccess", "result", "coil-base_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface Target {
    void onError(Drawable drawable);

    void onStart(Drawable drawable);

    void onSuccess(Drawable drawable);

    /* compiled from: Target.kt */
    /* renamed from: coil.target.Target$-CC  reason: invalid class name */
    /* loaded from: classes2.dex */
    public final /* synthetic */ class CC {
        public static void $default$onError(Target _this, Drawable drawable) {
        }

        public static void $default$onStart(Target _this, Drawable drawable) {
        }

        public static void $default$onSuccess(Target _this, Drawable drawable) {
        }
    }

    /* compiled from: Target.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static void onStart(Target target, Drawable drawable) {
            CC.$default$onStart(target, drawable);
        }

        @Deprecated
        public static void onError(Target target, Drawable drawable) {
            CC.$default$onError(target, drawable);
        }

        @Deprecated
        public static void onSuccess(Target target, Drawable drawable) {
            CC.$default$onSuccess(target, drawable);
        }
    }
}
