package androidx.navigation.dynamicfeatures;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.navigation.ActivityNavigator;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import androidx.navigation.NavOptions;
import androidx.navigation.Navigator;
import androidx.navigation.NavigatorProvider;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.HttpHeaders;
/* compiled from: DynamicActivityNavigator.kt */
@Navigator.Name("activity")
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0017B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u000b\u001a\u00020\fH\u0016J$\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0002J*\u0010\r\u001a\u00020\u000e2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00100\u00162\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0018"}, d2 = {"Landroidx/navigation/dynamicfeatures/DynamicActivityNavigator;", "Landroidx/navigation/ActivityNavigator;", "context", "Landroid/content/Context;", "installManager", "Landroidx/navigation/dynamicfeatures/DynamicInstallManager;", "(Landroid/content/Context;Landroidx/navigation/dynamicfeatures/DynamicInstallManager;)V", RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, "", "getPackageName$navigation_dynamic_features_runtime_release", "()Ljava/lang/String;", "createDestination", "Landroidx/navigation/dynamicfeatures/DynamicActivityNavigator$Destination;", "navigate", "", "entry", "Landroidx/navigation/NavBackStackEntry;", "navOptions", "Landroidx/navigation/NavOptions;", "navigatorExtras", "Landroidx/navigation/Navigator$Extras;", RemoteConfigConstants.ResponseFieldKey.ENTRIES, "", HttpHeaders.DESTINATION, "navigation-dynamic-features-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DynamicActivityNavigator extends ActivityNavigator {
    private final DynamicInstallManager installManager;
    private final String packageName;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DynamicActivityNavigator(Context context, DynamicInstallManager installManager) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(installManager, "installManager");
        this.installManager = installManager;
        String packageName = context.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "context.packageName");
        this.packageName = packageName;
    }

    public final String getPackageName$navigation_dynamic_features_runtime_release() {
        return this.packageName;
    }

    @Override // androidx.navigation.Navigator
    public void navigate(List<NavBackStackEntry> entries, NavOptions navOptions, Navigator.Extras extras) {
        Intrinsics.checkNotNullParameter(entries, "entries");
        for (NavBackStackEntry navBackStackEntry : entries) {
            navigate(navBackStackEntry, navOptions, extras);
        }
    }

    private final void navigate(NavBackStackEntry navBackStackEntry, NavOptions navOptions, Navigator.Extras extras) {
        String moduleName;
        NavDestination destination = navBackStackEntry.getDestination();
        DynamicExtras dynamicExtras = extras instanceof DynamicExtras ? (DynamicExtras) extras : null;
        if ((destination instanceof Destination) && (moduleName = ((Destination) destination).getModuleName()) != null && this.installManager.needsInstall(moduleName)) {
            this.installManager.performInstall(navBackStackEntry, dynamicExtras, moduleName);
            return;
        }
        List<NavBackStackEntry> listOf = CollectionsKt.listOf(navBackStackEntry);
        if (dynamicExtras != null) {
            extras = dynamicExtras.getDestinationExtras();
        }
        super.navigate(listOf, navOptions, extras);
    }

    @Override // androidx.navigation.ActivityNavigator, androidx.navigation.Navigator
    public ActivityNavigator.Destination createDestination() {
        return new Destination(this);
    }

    /* compiled from: DynamicActivityNavigator.kt */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0017\b\u0016\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u001a"}, d2 = {"Landroidx/navigation/dynamicfeatures/DynamicActivityNavigator$Destination;", "Landroidx/navigation/ActivityNavigator$Destination;", "navigatorProvider", "Landroidx/navigation/NavigatorProvider;", "(Landroidx/navigation/NavigatorProvider;)V", "activityNavigator", "Landroidx/navigation/Navigator;", "(Landroidx/navigation/Navigator;)V", "moduleName", "", "getModuleName", "()Ljava/lang/String;", "setModuleName", "(Ljava/lang/String;)V", "equals", "", "other", "", "hashCode", "", "onInflate", "", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "navigation-dynamic-features-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Destination extends ActivityNavigator.Destination {
        private String moduleName;

        public final String getModuleName() {
            return this.moduleName;
        }

        public final void setModuleName(String str) {
            this.moduleName = str;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Destination(NavigatorProvider navigatorProvider) {
            super(navigatorProvider);
            Intrinsics.checkNotNullParameter(navigatorProvider, "navigatorProvider");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Destination(Navigator<? extends ActivityNavigator.Destination> activityNavigator) {
            super(activityNavigator);
            Intrinsics.checkNotNullParameter(activityNavigator, "activityNavigator");
        }

        @Override // androidx.navigation.ActivityNavigator.Destination, androidx.navigation.NavDestination
        public void onInflate(Context context, AttributeSet attrs) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(attrs, "attrs");
            super.onInflate(context, attrs);
            int[] DynamicActivityNavigator = R.styleable.DynamicActivityNavigator;
            Intrinsics.checkNotNullExpressionValue(DynamicActivityNavigator, "DynamicActivityNavigator");
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, DynamicActivityNavigator, 0, 0);
            this.moduleName = obtainStyledAttributes.getString(R.styleable.DynamicActivityNavigator_moduleName);
            obtainStyledAttributes.recycle();
        }

        @Override // androidx.navigation.ActivityNavigator.Destination, androidx.navigation.NavDestination
        public boolean equals(Object obj) {
            return obj != null && (obj instanceof Destination) && super.equals(obj) && Intrinsics.areEqual(this.moduleName, ((Destination) obj).moduleName);
        }

        @Override // androidx.navigation.ActivityNavigator.Destination, androidx.navigation.NavDestination
        public int hashCode() {
            int hashCode = super.hashCode() * 31;
            String str = this.moduleName;
            return hashCode + (str != null ? str.hashCode() : 0);
        }
    }
}
