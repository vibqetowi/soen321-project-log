package by.kirich1409.viewbindingdelegate;

import android.view.View;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.Fragment;
import androidx.viewbinding.ViewBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: FragmentViewBindings.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00028\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0003*\u00020\u00022\u0006\u0010\u0004\u001a\u00028\u0000H\n"}, d2 = {"Landroidx/fragment/app/Fragment;", "F", "Landroidx/viewbinding/ViewBinding;", ExifInterface.GPS_DIRECTION_TRUE, "fragment", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public final class FragmentViewBindings$viewBinding$5 extends Lambda implements Function1<F, T> {
    final /* synthetic */ Function1<View, T> $vbFactory;
    final /* synthetic */ Function1<F, View> $viewProvider;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FragmentViewBindings$viewBinding$5(Function1<? super View, ? extends T> function1, Function1<? super F, ? extends View> function12) {
        super(1);
        this.$vbFactory = function1;
        this.$viewProvider = function12;
    }

    /* JADX WARN: Incorrect return type in method signature: (TF;)TT; */
    @Override // kotlin.jvm.functions.Function1
    public final ViewBinding invoke(Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        return (ViewBinding) this.$vbFactory.invoke(this.$viewProvider.invoke(fragment));
    }
}
