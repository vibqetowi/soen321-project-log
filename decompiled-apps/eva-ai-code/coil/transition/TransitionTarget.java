package coil.transition;

import android.graphics.drawable.Drawable;
import android.view.View;
import coil.target.Target;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import kotlin.Metadata;
/* compiled from: TransitionTarget.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcoil/transition/TransitionTarget;", "Lcoil/target/Target;", "drawable", "Landroid/graphics/drawable/Drawable;", "getDrawable", "()Landroid/graphics/drawable/Drawable;", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "getView", "()Landroid/view/View;", "coil-base_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface TransitionTarget extends Target {
    Drawable getDrawable();

    View getView();

    /* compiled from: TransitionTarget.kt */
    /* renamed from: coil.transition.TransitionTarget$-CC  reason: invalid class name */
    /* loaded from: classes2.dex */
    public final /* synthetic */ class CC {
    }

    /* compiled from: TransitionTarget.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static void onError(TransitionTarget transitionTarget, Drawable drawable) {
            Target.CC.$default$onError(transitionTarget, drawable);
        }

        @Deprecated
        public static void onStart(TransitionTarget transitionTarget, Drawable drawable) {
            Target.CC.$default$onStart(transitionTarget, drawable);
        }

        @Deprecated
        public static void onSuccess(TransitionTarget transitionTarget, Drawable drawable) {
            Target.CC.$default$onSuccess(transitionTarget, drawable);
        }
    }
}
