package androidx.navigation.dynamicfeatures.fragment;

import androidx.navigation.NavDestination;
import androidx.navigation.dynamicfeatures.fragment.DynamicFragmentNavigator;
import androidx.navigation.dynamicfeatures.fragment.ui.DefaultProgressFragment;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: DynamicNavHostFragment.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/navigation/NavDestination;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
final class DynamicNavHostFragment$onCreateNavHostController$1 extends Lambda implements Function0<NavDestination> {
    final /* synthetic */ DynamicFragmentNavigator $fragmentNavigator;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DynamicNavHostFragment$onCreateNavHostController$1(DynamicFragmentNavigator dynamicFragmentNavigator) {
        super(0);
        this.$fragmentNavigator = dynamicFragmentNavigator;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final NavDestination invoke() {
        DynamicFragmentNavigator.Destination createDestination = this.$fragmentNavigator.createDestination();
        String name = DefaultProgressFragment.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "DefaultProgressFragment::class.java.name");
        createDestination.setClassName(name);
        createDestination.setId(R.id.dfn_progress_fragment);
        return createDestination;
    }
}
