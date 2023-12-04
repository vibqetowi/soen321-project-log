package by.kirich1409.viewbindingdelegate;

import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.viewbinding.ViewBinding;
import by.kirich1409.viewbindingdelegate.internal.UtilsKt;
import by.kirich1409.viewbindingdelegate.internal.ViewBindingCache;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: FragmentViewBindings.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n"}, d2 = {"Landroidx/viewbinding/ViewBinding;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/fragment/app/Fragment;", "dialogFragment", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes3.dex */
final class ReflectionFragmentViewBindings$viewBinding$1 extends Lambda implements Function1<Fragment, T> {
    final /* synthetic */ Class<T> $viewBindingClass;
    final /* synthetic */ int $viewBindingRootId;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReflectionFragmentViewBindings$viewBinding$1(Class<T> cls, int i) {
        super(1);
        this.$viewBindingClass = cls;
        this.$viewBindingRootId = i;
    }

    /* JADX WARN: Incorrect return type in method signature: (Landroidx/fragment/app/Fragment;)TT; */
    @Override // kotlin.jvm.functions.Function1
    public final ViewBinding invoke(Fragment dialogFragment) {
        Intrinsics.checkNotNullParameter(dialogFragment, "dialogFragment");
        if (!(dialogFragment instanceof DialogFragment)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        return ViewBindingCache.INSTANCE.getBind$com_github_kirich1409_ViewBindingPropertyDelegate(this.$viewBindingClass).bind(UtilsKt.getRootView((DialogFragment) dialogFragment, this.$viewBindingRootId));
    }
}
