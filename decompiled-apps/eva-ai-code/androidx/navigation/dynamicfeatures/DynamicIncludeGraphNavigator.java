package androidx.navigation.dynamicfeatures;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import androidx.core.app.NotificationCompat;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import androidx.navigation.NavGraph;
import androidx.navigation.NavInflater;
import androidx.navigation.NavOptions;
import androidx.navigation.Navigator;
import androidx.navigation.NavigatorProvider;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.apache.commons.lang3.ClassUtils;
/* compiled from: DynamicIncludeGraphNavigator.kt */
@Navigator.Name("include-dynamic")
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001$B%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\b\u0010\u0012\u001a\u00020\u0002H\u0016J$\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0002J*\u0010\u0013\u001a\u00020\u00142\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00160\u001c2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u0010\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\n\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016J\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0002H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u000fX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006%"}, d2 = {"Landroidx/navigation/dynamicfeatures/DynamicIncludeGraphNavigator;", "Landroidx/navigation/Navigator;", "Landroidx/navigation/dynamicfeatures/DynamicIncludeGraphNavigator$DynamicIncludeNavGraph;", "context", "Landroid/content/Context;", "navigatorProvider", "Landroidx/navigation/NavigatorProvider;", "navInflater", "Landroidx/navigation/NavInflater;", "installManager", "Landroidx/navigation/dynamicfeatures/DynamicInstallManager;", "(Landroid/content/Context;Landroidx/navigation/NavigatorProvider;Landroidx/navigation/NavInflater;Landroidx/navigation/dynamicfeatures/DynamicInstallManager;)V", "createdDestinations", "", RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, "", "getPackageName$navigation_dynamic_features_runtime_release", "()Ljava/lang/String;", "createDestination", "navigate", "", "entry", "Landroidx/navigation/NavBackStackEntry;", "navOptions", "Landroidx/navigation/NavOptions;", "navigatorExtras", "Landroidx/navigation/Navigator$Extras;", RemoteConfigConstants.ResponseFieldKey.ENTRIES, "", "onRestoreState", "savedState", "Landroid/os/Bundle;", "onSaveState", "replaceWithIncludedNav", "Landroidx/navigation/NavGraph;", "destination", "DynamicIncludeNavGraph", "navigation-dynamic-features-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DynamicIncludeGraphNavigator extends Navigator<DynamicIncludeNavGraph> {
    private final Context context;
    private final List<DynamicIncludeNavGraph> createdDestinations;
    private final DynamicInstallManager installManager;
    private final NavInflater navInflater;
    private final NavigatorProvider navigatorProvider;
    private final String packageName;

    public DynamicIncludeGraphNavigator(Context context, NavigatorProvider navigatorProvider, NavInflater navInflater, DynamicInstallManager installManager) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(navigatorProvider, "navigatorProvider");
        Intrinsics.checkNotNullParameter(navInflater, "navInflater");
        Intrinsics.checkNotNullParameter(installManager, "installManager");
        this.context = context;
        this.navigatorProvider = navigatorProvider;
        this.navInflater = navInflater;
        this.installManager = installManager;
        String packageName = context.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "context.packageName");
        this.packageName = packageName;
        this.createdDestinations = new ArrayList();
    }

    public final String getPackageName$navigation_dynamic_features_runtime_release() {
        return this.packageName;
    }

    @Override // androidx.navigation.Navigator
    public DynamicIncludeNavGraph createDestination() {
        DynamicIncludeNavGraph dynamicIncludeNavGraph = new DynamicIncludeNavGraph(this);
        this.createdDestinations.add(dynamicIncludeNavGraph);
        return dynamicIncludeNavGraph;
    }

    @Override // androidx.navigation.Navigator
    public void navigate(List<NavBackStackEntry> entries, NavOptions navOptions, Navigator.Extras extras) {
        Intrinsics.checkNotNullParameter(entries, "entries");
        for (NavBackStackEntry navBackStackEntry : entries) {
            navigate(navBackStackEntry, navOptions, extras);
        }
    }

    private final void navigate(NavBackStackEntry navBackStackEntry, NavOptions navOptions, Navigator.Extras extras) {
        NavDestination destination = navBackStackEntry.getDestination();
        Intrinsics.checkNotNull(destination, "null cannot be cast to non-null type androidx.navigation.dynamicfeatures.DynamicIncludeGraphNavigator.DynamicIncludeNavGraph");
        DynamicIncludeNavGraph dynamicIncludeNavGraph = (DynamicIncludeNavGraph) destination;
        DynamicExtras dynamicExtras = extras instanceof DynamicExtras ? (DynamicExtras) extras : null;
        String moduleName = dynamicIncludeNavGraph.getModuleName();
        if (moduleName != null && this.installManager.needsInstall(moduleName)) {
            this.installManager.performInstall(navBackStackEntry, dynamicExtras, moduleName);
            return;
        }
        NavGraph replaceWithIncludedNav = replaceWithIncludedNav(dynamicIncludeNavGraph);
        this.navigatorProvider.getNavigator(replaceWithIncludedNav.getNavigatorName()).navigate(CollectionsKt.listOf(getState().createBackStackEntry(replaceWithIncludedNav, navBackStackEntry.getArguments())), navOptions, extras);
    }

    private final NavGraph replaceWithIncludedNav(DynamicIncludeNavGraph dynamicIncludeNavGraph) {
        int identifier = this.context.getResources().getIdentifier(dynamicIncludeNavGraph.getGraphResourceName(), NotificationCompat.CATEGORY_NAVIGATION, dynamicIncludeNavGraph.getGraphPackage());
        if (identifier == 0) {
            throw new Resources.NotFoundException(dynamicIncludeNavGraph.getGraphPackage() + ":navigation/" + dynamicIncludeNavGraph.getGraphResourceName());
        }
        NavGraph inflate = this.navInflater.inflate(identifier);
        if (!(inflate.getId() == 0 || inflate.getId() == dynamicIncludeNavGraph.getId())) {
            throw new IllegalStateException(("The included <navigation>'s id " + inflate.getDisplayName() + " is different from the destination id " + dynamicIncludeNavGraph.getDisplayName() + ". Either remove the <navigation> id or make them match.").toString());
        }
        inflate.setId(dynamicIncludeNavGraph.getId());
        NavGraph parent = dynamicIncludeNavGraph.getParent();
        if (parent == null) {
            throw new IllegalStateException("The include-dynamic destination with id " + dynamicIncludeNavGraph.getDisplayName() + " does not have a parent. Make sure it is attached to a NavGraph.");
        }
        parent.addDestination(inflate);
        this.createdDestinations.remove(dynamicIncludeNavGraph);
        return inflate;
    }

    @Override // androidx.navigation.Navigator
    public Bundle onSaveState() {
        return Bundle.EMPTY;
    }

    @Override // androidx.navigation.Navigator
    public void onRestoreState(Bundle savedState) {
        Intrinsics.checkNotNullParameter(savedState, "savedState");
        super.onRestoreState(savedState);
        while (!this.createdDestinations.isEmpty()) {
            Iterator it = new ArrayList(this.createdDestinations).iterator();
            Intrinsics.checkNotNullExpressionValue(it, "ArrayList(createdDestinations).iterator()");
            this.createdDestinations.clear();
            while (it.hasNext()) {
                DynamicIncludeNavGraph dynamicNavGraph = (DynamicIncludeNavGraph) it.next();
                String moduleName = dynamicNavGraph.getModuleName();
                if (moduleName == null || !this.installManager.needsInstall(moduleName)) {
                    Intrinsics.checkNotNullExpressionValue(dynamicNavGraph, "dynamicNavGraph");
                    replaceWithIncludedNav(dynamicNavGraph);
                }
            }
        }
    }

    /* compiled from: DynamicIncludeGraphNavigator.kt */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0000\u0012\u000e\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\u001f\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0002\b\u0018J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u001eH\u0016R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\b\"\u0004\b\u0010\u0010\n¨\u0006\u001f"}, d2 = {"Landroidx/navigation/dynamicfeatures/DynamicIncludeGraphNavigator$DynamicIncludeNavGraph;", "Landroidx/navigation/NavDestination;", "navGraphNavigator", "Landroidx/navigation/Navigator;", "(Landroidx/navigation/Navigator;)V", "graphPackage", "", "getGraphPackage", "()Ljava/lang/String;", "setGraphPackage", "(Ljava/lang/String;)V", "graphResourceName", "getGraphResourceName", "setGraphResourceName", "moduleName", "getModuleName", "setModuleName", "equals", "", "other", "", "getPackageOrDefault", "context", "Landroid/content/Context;", "getPackageOrDefault$navigation_dynamic_features_runtime_release", "hashCode", "", "onInflate", "", "attrs", "Landroid/util/AttributeSet;", "navigation-dynamic-features-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class DynamicIncludeNavGraph extends NavDestination {
        private String graphPackage;
        private String graphResourceName;
        private String moduleName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DynamicIncludeNavGraph(Navigator<? extends NavDestination> navGraphNavigator) {
            super(navGraphNavigator);
            Intrinsics.checkNotNullParameter(navGraphNavigator, "navGraphNavigator");
        }

        public final String getGraphResourceName() {
            return this.graphResourceName;
        }

        public final void setGraphResourceName(String str) {
            this.graphResourceName = str;
        }

        public final String getGraphPackage() {
            return this.graphPackage;
        }

        public final void setGraphPackage(String str) {
            this.graphPackage = str;
        }

        public final String getModuleName() {
            return this.moduleName;
        }

        public final void setModuleName(String str) {
            this.moduleName = str;
        }

        @Override // androidx.navigation.NavDestination
        public void onInflate(Context context, AttributeSet attrs) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(attrs, "attrs");
            super.onInflate(context, attrs);
            int[] DynamicIncludeGraphNavigator = R.styleable.DynamicIncludeGraphNavigator;
            Intrinsics.checkNotNullExpressionValue(DynamicIncludeGraphNavigator, "DynamicIncludeGraphNavigator");
            boolean z = false;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, DynamicIncludeGraphNavigator, 0, 0);
            String string = obtainStyledAttributes.getString(R.styleable.DynamicIncludeGraphNavigator_moduleName);
            this.moduleName = string;
            String str = string;
            if (!(!(str == null || str.length() == 0))) {
                throw new IllegalArgumentException("`moduleName` must be set for <include-dynamic>".toString());
            }
            String string2 = obtainStyledAttributes.getString(R.styleable.DynamicIncludeGraphNavigator_graphPackage);
            if (string2 != null) {
                if (!(string2.length() > 0)) {
                    throw new IllegalArgumentException(("`graphPackage` cannot be empty for <include-dynamic>. You can omit the `graphPackage` attribute entirely to use the default of " + context.getPackageName() + ClassUtils.PACKAGE_SEPARATOR_CHAR + this.moduleName + ClassUtils.PACKAGE_SEPARATOR_CHAR).toString());
                }
            }
            this.graphPackage = getPackageOrDefault$navigation_dynamic_features_runtime_release(context, string2);
            String string3 = obtainStyledAttributes.getString(R.styleable.DynamicIncludeGraphNavigator_graphResName);
            this.graphResourceName = string3;
            String str2 = string3;
            if (str2 == null || str2.length() == 0) {
                z = true;
            }
            if (!(!z)) {
                throw new IllegalArgumentException("`graphResName` must be set for <include-dynamic>".toString());
            }
            obtainStyledAttributes.recycle();
        }

        public final String getPackageOrDefault$navigation_dynamic_features_runtime_release(Context context, String str) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (str != null) {
                String packageName = context.getPackageName();
                Intrinsics.checkNotNullExpressionValue(packageName, "context.packageName");
                String replace$default = StringsKt.replace$default(str, NavInflater.APPLICATION_ID_PLACEHOLDER, packageName, false, 4, (Object) null);
                if (replace$default != null) {
                    return replace$default;
                }
            }
            return context.getPackageName() + ClassUtils.PACKAGE_SEPARATOR_CHAR + this.moduleName;
        }

        @Override // androidx.navigation.NavDestination
        public boolean equals(Object obj) {
            if (obj != null && (obj instanceof DynamicIncludeNavGraph) && super.equals(obj)) {
                DynamicIncludeNavGraph dynamicIncludeNavGraph = (DynamicIncludeNavGraph) obj;
                return Intrinsics.areEqual(this.graphResourceName, dynamicIncludeNavGraph.graphResourceName) && Intrinsics.areEqual(this.graphPackage, dynamicIncludeNavGraph.graphPackage) && Intrinsics.areEqual(this.moduleName, dynamicIncludeNavGraph.moduleName);
            }
            return false;
        }

        @Override // androidx.navigation.NavDestination
        public int hashCode() {
            int hashCode = super.hashCode() * 31;
            String str = this.graphResourceName;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.graphPackage;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.moduleName;
            return hashCode3 + (str3 != null ? str3.hashCode() : 0);
        }
    }
}
