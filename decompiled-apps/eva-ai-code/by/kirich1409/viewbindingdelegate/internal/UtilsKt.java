package by.kirich1409.viewbindingdelegate.internal;

import android.app.Activity;
import android.app.Dialog;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.core.app.ActivityCompat;
import androidx.core.view.ViewCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.DialogFragment;
import androidx.viewbinding.ViewBinding;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.lang3.ClassUtils;
/* compiled from: Utils.kt */
@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u001a\b\u0010\u0006\u001a\u00020\u0003H\u0000\u001a\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0000\u001a\u001e\u0010\t\u001a\u000e\u0012\u0004\u0012\u0002H\n\u0012\u0004\u0012\u00020\u00030\u0001\"\b\b\u0000\u0010\n*\u00020\u0002H\u0007\u001a\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007\u001a\u0014\u0010\u000f\u001a\u00020\f*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007\u001a&\u0010\u0013\u001a\u0002H\u0014\"\b\b\u0000\u0010\u0014*\u00020\f*\u00020\u000e2\b\b\u0001\u0010\u0015\u001a\u00020\u0012H\u0087\b¢\u0006\u0002\u0010\u0016\u001a&\u0010\u0013\u001a\u0002H\u0014\"\b\b\u0000\u0010\u0014*\u00020\f*\u00020\f2\b\b\u0001\u0010\u0015\u001a\u00020\u0012H\u0087\b¢\u0006\u0002\u0010\u0017\" \u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0018"}, d2 = {"EMPTY_VB_CALLBACK", "Lkotlin/Function1;", "Landroidx/viewbinding/ViewBinding;", "", "getEMPTY_VB_CALLBACK", "()Lkotlin/jvm/functions/Function1;", "checkMainThread", "reason", "", "emptyVbCallback", ExifInterface.GPS_DIRECTION_TRUE, "findRootView", "Landroid/view/View;", "activity", "Landroid/app/Activity;", "getRootView", "Landroidx/fragment/app/DialogFragment;", "viewBindingRootId", "", "requireViewByIdCompat", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "id", "(Landroid/app/Activity;I)Landroid/view/View;", "(Landroid/view/View;I)Landroid/view/View;", "com.github.kirich1409.ViewBindingPropertyDelegate.noreflection"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class UtilsKt {
    private static final Function1<ViewBinding, Unit> EMPTY_VB_CALLBACK = UtilsKt$EMPTY_VB_CALLBACK$1.INSTANCE;

    public static final <V extends View> V requireViewByIdCompat(View view, int i) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        V v = (V) ViewCompat.requireViewById(view, i);
        Intrinsics.checkNotNullExpressionValue(v, "requireViewById(this, id)");
        return v;
    }

    public static final <V extends View> V requireViewByIdCompat(Activity activity, int i) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        V v = (V) ActivityCompat.requireViewById(activity, i);
        Intrinsics.checkNotNullExpressionValue(v, "requireViewById(this, id)");
        return v;
    }

    public static final View findRootView(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        ViewGroup viewGroup = (ViewGroup) activity.findViewById(16908290);
        if (viewGroup == null) {
            throw new IllegalStateException("Activity has no content view".toString());
        }
        int childCount = viewGroup.getChildCount();
        if (childCount != 0) {
            if (childCount == 1) {
                View childAt = viewGroup.getChildAt(0);
                Intrinsics.checkNotNullExpressionValue(childAt, "contentView.getChildAt(0)");
                return childAt;
            }
            throw new IllegalStateException("More than one child view found in Activity content view".toString());
        }
        throw new IllegalStateException("Content view has no children. Provide root view explicitly".toString());
    }

    public static final View getRootView(DialogFragment dialogFragment, int i) {
        Intrinsics.checkNotNullParameter(dialogFragment, "<this>");
        Dialog dialog = dialogFragment.getDialog();
        if (dialog == null) {
            throw new IllegalStateException("DialogFragment doesn't have dialog. Use viewBinding delegate after onCreateDialog".toString());
        }
        Window window = dialog.getWindow();
        if (window == null) {
            throw new IllegalStateException("Fragment's Dialog has no window".toString());
        }
        View decorView = window.getDecorView();
        if (i == 0) {
            Intrinsics.checkNotNullExpressionValue(decorView, "this");
            return decorView;
        }
        Intrinsics.checkNotNullExpressionValue(decorView, "");
        View requireViewById = ViewCompat.requireViewById(decorView, i);
        Intrinsics.checkNotNullExpressionValue(requireViewById, "requireViewById(this, id)");
        return requireViewById;
    }

    public static final Function1<ViewBinding, Unit> getEMPTY_VB_CALLBACK() {
        return EMPTY_VB_CALLBACK;
    }

    public static final <T extends ViewBinding> Function1<T, Unit> emptyVbCallback() {
        return (Function1<T, Unit>) EMPTY_VB_CALLBACK;
    }

    public static final void checkMainThread() {
        if (!(Looper.getMainLooper() == Looper.myLooper())) {
            throw new IllegalStateException("The method must be called on the main thread".toString());
        }
    }

    public static final void checkMainThread(String reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        if (Looper.getMainLooper() == Looper.myLooper()) {
            return;
        }
        throw new IllegalStateException(("The method must be called on the main thread. Reason: " + reason + ClassUtils.PACKAGE_SEPARATOR_CHAR).toString());
    }
}
