package androidx.navigation.dynamicfeatures;

import androidx.navigation.NavDestination;
import androidx.navigation.NavDestinationDsl;
import androidx.navigation.NavGraph;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.NavigatorProvider;
import androidx.navigation.dynamicfeatures.DynamicGraphNavigator;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
/* compiled from: DynamicNavGraphBuilder.kt */
@NavDestinationDsl
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B#\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\nJ\b\u0010\u001d\u001a\u00020\u001eH\u0016R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00058F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R(\u0010\u0018\u001a\u0004\u0018\u00010\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\b@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000e\"\u0004\b\u001a\u0010\u0010R\u0012\u0010\u001b\u001a\u00020\u00058\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Landroidx/navigation/dynamicfeatures/DynamicNavGraphBuilder;", "Landroidx/navigation/NavGraphBuilder;", "provider", "Landroidx/navigation/NavigatorProvider;", "id", "", "startDestination", "(Landroidx/navigation/NavigatorProvider;II)V", "", "route", "(Landroidx/navigation/NavigatorProvider;Ljava/lang/String;Ljava/lang/String;)V", "_progressDestination", "moduleName", "getModuleName", "()Ljava/lang/String;", "setModuleName", "(Ljava/lang/String;)V", TtmlNode.TAG_P, "progressDestination", "getProgressDestination", "()I", "setProgressDestination", "(I)V", "progDestRoute", "progressDestinationRoute", "getProgressDestinationRoute", "setProgressDestinationRoute", "startDestinationId", "startDestinationRoute", "build", "Landroidx/navigation/NavGraph;", "navigation-dynamic-features-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DynamicNavGraphBuilder extends NavGraphBuilder {
    private int _progressDestination;
    private String moduleName;
    private String progressDestinationRoute;
    private int startDestinationId;
    private String startDestinationRoute;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Deprecated(message = "Use routes to create your DynamicNavGraphBuilder instead", replaceWith = @ReplaceWith(expression = "DynamicNavGraphBuilder(provider, startDestination = startDestination.toString(), route = id.toString())", imports = {}))
    public DynamicNavGraphBuilder(NavigatorProvider provider, int i, int i2) {
        super(provider, i, i2);
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.startDestinationId = i2;
    }

    public /* synthetic */ DynamicNavGraphBuilder(NavigatorProvider navigatorProvider, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(navigatorProvider, str, (i & 4) != 0 ? null : str2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DynamicNavGraphBuilder(NavigatorProvider provider, String startDestination, String str) {
        super(provider, startDestination, str);
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(startDestination, "startDestination");
        this.startDestinationRoute = startDestination;
    }

    public final String getModuleName() {
        return this.moduleName;
    }

    public final void setModuleName(String str) {
        this.moduleName = str;
    }

    public final int getProgressDestination() {
        return this._progressDestination;
    }

    public final void setProgressDestination(int i) {
        if (this.progressDestinationRoute != null) {
            setProgressDestinationRoute(null);
        }
        this._progressDestination = i;
    }

    public final String getProgressDestinationRoute() {
        return this.progressDestinationRoute;
    }

    public final void setProgressDestinationRoute(String str) {
        int hashCode;
        if (str == null) {
            hashCode = 0;
        } else if (!(!StringsKt.isBlank(str))) {
            throw new IllegalArgumentException("Cannot have an empty progress destination route".toString());
        } else {
            hashCode = NavDestination.Companion.createRoute(this.progressDestinationRoute).hashCode();
        }
        this._progressDestination = hashCode;
        this.progressDestinationRoute = str;
    }

    @Override // androidx.navigation.NavGraphBuilder, androidx.navigation.NavDestinationBuilder
    public NavGraph build() {
        NavGraph build = super.build();
        if (build instanceof DynamicGraphNavigator.DynamicNavGraph) {
            DynamicGraphNavigator.DynamicNavGraph dynamicNavGraph = (DynamicGraphNavigator.DynamicNavGraph) build;
            dynamicNavGraph.setModuleName(this.moduleName);
            if (build.getRoute() != null) {
                dynamicNavGraph.setProgressDestination(NavDestination.Companion.createRoute(this.progressDestinationRoute).hashCode());
            } else {
                dynamicNavGraph.setProgressDestination(getProgressDestination());
            }
            if (getProgressDestination() == 0) {
                ((DynamicGraphNavigator) getProvider().getNavigator(DynamicGraphNavigator.class)).getDestinationsWithoutDefaultProgressDestination$navigation_dynamic_features_runtime_release().add(build);
            }
        }
        return build;
    }
}
