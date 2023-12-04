package androidx.navigation.dynamicfeatures.fragment;

import androidx.navigation.NavDestination;
import androidx.navigation.NavDestinationBuilder;
import androidx.navigation.NavDestinationDsl;
import androidx.navigation.dynamicfeatures.fragment.DynamicFragmentNavigator;
import androidx.navigation.fragment.FragmentNavigator;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: DynamicFragmentNavigatorDestinationBuilder.kt */
@NavDestinationDsl
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B!\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tB\u001f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\u000bJ\b\u0010\u0011\u001a\u00020\u0012H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Landroidx/navigation/dynamicfeatures/fragment/DynamicFragmentNavigatorDestinationBuilder;", "Landroidx/navigation/NavDestinationBuilder;", "Landroidx/navigation/fragment/FragmentNavigator$Destination;", "navigator", "Landroidx/navigation/dynamicfeatures/fragment/DynamicFragmentNavigator;", "id", "", "fragmentClassName", "", "(Landroidx/navigation/dynamicfeatures/fragment/DynamicFragmentNavigator;ILjava/lang/String;)V", "route", "(Landroidx/navigation/dynamicfeatures/fragment/DynamicFragmentNavigator;Ljava/lang/String;Ljava/lang/String;)V", "moduleName", "getModuleName", "()Ljava/lang/String;", "setModuleName", "(Ljava/lang/String;)V", "build", "Landroidx/navigation/dynamicfeatures/fragment/DynamicFragmentNavigator$Destination;", "navigation-dynamic-features-fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DynamicFragmentNavigatorDestinationBuilder extends NavDestinationBuilder<FragmentNavigator.Destination> {
    private String fragmentClassName;
    private String moduleName;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Deprecated(message = "Use routes to create your DynamicFragmentDestinationBuilder instead", replaceWith = @ReplaceWith(expression = "DynamicFragmentNavigatorDestinationBuilder(navigator, route = id.toString(), fragmentClassName)", imports = {}))
    public DynamicFragmentNavigatorDestinationBuilder(DynamicFragmentNavigator navigator, int i, String fragmentClassName) {
        super(navigator, i);
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(fragmentClassName, "fragmentClassName");
        this.fragmentClassName = fragmentClassName;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DynamicFragmentNavigatorDestinationBuilder(DynamicFragmentNavigator navigator, String route, String fragmentClassName) {
        super(navigator, route);
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(fragmentClassName, "fragmentClassName");
        this.fragmentClassName = fragmentClassName;
    }

    public final String getModuleName() {
        return this.moduleName;
    }

    public final void setModuleName(String str) {
        this.moduleName = str;
    }

    @Override // androidx.navigation.NavDestinationBuilder
    public FragmentNavigator.Destination build() {
        NavDestination build = super.build();
        Intrinsics.checkNotNull(build, "null cannot be cast to non-null type androidx.navigation.dynamicfeatures.fragment.DynamicFragmentNavigator.Destination");
        DynamicFragmentNavigator.Destination destination = (DynamicFragmentNavigator.Destination) build;
        destination.setClassName(this.fragmentClassName);
        destination.setModuleName(this.moduleName);
        return destination;
    }
}
