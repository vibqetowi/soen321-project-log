package androidx.navigation.fragment;

import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.navigation.fragment.FragmentNavigator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: FragmentNavigator.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroidx/navigation/fragment/FragmentNavigator$ClearEntryStateViewModel;", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
final class FragmentNavigator$attachClearViewModel$viewModel$1$1 extends Lambda implements Function1<CreationExtras, FragmentNavigator.ClearEntryStateViewModel> {
    public static final FragmentNavigator$attachClearViewModel$viewModel$1$1 INSTANCE = new FragmentNavigator$attachClearViewModel$viewModel$1$1();

    FragmentNavigator$attachClearViewModel$viewModel$1$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentNavigator.ClearEntryStateViewModel invoke(CreationExtras initializer) {
        Intrinsics.checkNotNullParameter(initializer, "$this$initializer");
        return new FragmentNavigator.ClearEntryStateViewModel();
    }
}
