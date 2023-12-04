package androidx.navigation.ui;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.widget.Openable;
import androidx.navigation.ActivityNavigator;
import androidx.navigation.FloatingWindow;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import androidx.navigation.NavGraph;
import androidx.navigation.NavOptions;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.profileinstaller.ProfileVerifier;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.navigation.NavigationBarView;
import com.google.android.material.navigation.NavigationView;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: NavigationUI.kt */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u001a\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0007J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u0018\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\fH\u0007J \u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\nH\u0007J\"\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0007J\"\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0007J\"\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0007J\"\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0007J*\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0007J*\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0007J\u0018\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u000b\u001a\u00020\fH\u0007J \u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\nH\u0007J\u0018\u0010\u0019\u001a\u00020\u00162\u0006\u0010 \u001a\u00020!2\u0006\u0010\u000b\u001a\u00020\fH\u0007J \u0010\u0019\u001a\u00020\u00162\u0006\u0010 \u001a\u00020!2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\nH\u0007J\u001b\u0010\"\u001a\u00020\n*\u00020#2\b\b\u0001\u0010$\u001a\u00020%H\u0001¢\u0006\u0002\b&R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Landroidx/navigation/ui/NavigationUI;", "", "()V", "TAG", "", "findBottomSheetBehavior", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "navigateUp", "", "navController", "Landroidx/navigation/NavController;", "openableLayout", "Landroidx/customview/widget/Openable;", "configuration", "Landroidx/navigation/ui/AppBarConfiguration;", "onNavDestinationSelected", "item", "Landroid/view/MenuItem;", "saveState", "setupActionBarWithNavController", "", "activity", "Landroidx/appcompat/app/AppCompatActivity;", "setupWithNavController", "toolbar", "Landroidx/appcompat/widget/Toolbar;", "collapsingToolbarLayout", "Lcom/google/android/material/appbar/CollapsingToolbarLayout;", "navigationBarView", "Lcom/google/android/material/navigation/NavigationBarView;", "navigationView", "Lcom/google/android/material/navigation/NavigationView;", "matchDestination", "Landroidx/navigation/NavDestination;", "destId", "", "matchDestination$navigation_ui_release", "navigation-ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NavigationUI {
    public static final NavigationUI INSTANCE = new NavigationUI();
    private static final String TAG = "NavigationUI";

    @JvmStatic
    public static final void setupActionBarWithNavController(AppCompatActivity activity, NavController navController) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(navController, "navController");
        setupActionBarWithNavController$default(activity, navController, null, 4, null);
    }

    @JvmStatic
    public static final void setupWithNavController(Toolbar toolbar, NavController navController) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        Intrinsics.checkNotNullParameter(navController, "navController");
        setupWithNavController$default(toolbar, navController, null, 4, null);
    }

    @JvmStatic
    public static final void setupWithNavController(CollapsingToolbarLayout collapsingToolbarLayout, Toolbar toolbar, NavController navController) {
        Intrinsics.checkNotNullParameter(collapsingToolbarLayout, "collapsingToolbarLayout");
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        Intrinsics.checkNotNullParameter(navController, "navController");
        setupWithNavController$default(collapsingToolbarLayout, toolbar, navController, null, 8, null);
    }

    private NavigationUI() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0096, code lost:
        if (matchDestination$navigation_ui_release(r0, r5.getItemId()) == true) goto L13;
     */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean onNavDestinationSelected(MenuItem item, NavController navController) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(navController, "navController");
        boolean z = true;
        NavOptions.Builder restoreState = new NavOptions.Builder().setLaunchSingleTop(true).setRestoreState(true);
        NavDestination currentDestination = navController.getCurrentDestination();
        Intrinsics.checkNotNull(currentDestination);
        NavGraph parent = currentDestination.getParent();
        Intrinsics.checkNotNull(parent);
        if (parent.findNode(item.getItemId()) instanceof ActivityNavigator.Destination) {
            restoreState.setEnterAnim(R.anim.nav_default_enter_anim).setExitAnim(R.anim.nav_default_exit_anim).setPopEnterAnim(R.anim.nav_default_pop_enter_anim).setPopExitAnim(R.anim.nav_default_pop_exit_anim);
        } else {
            restoreState.setEnterAnim(R.animator.nav_default_enter_anim).setExitAnim(R.animator.nav_default_exit_anim).setPopEnterAnim(R.animator.nav_default_pop_enter_anim).setPopExitAnim(R.animator.nav_default_pop_exit_anim);
        }
        if ((item.getOrder() & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            restoreState.setPopUpTo(NavGraph.Companion.findStartDestination(navController.getGraph()).getId(), false, true);
        }
        try {
            navController.navigate(item.getItemId(), (Bundle) null, restoreState.build());
            NavDestination currentDestination2 = navController.getCurrentDestination();
            if (currentDestination2 != null) {
            }
            z = false;
            return z;
        } catch (IllegalArgumentException e) {
            Log.i(TAG, "Ignoring onNavDestinationSelected for MenuItem " + NavDestination.Companion.getDisplayName(navController.getContext(), item.getItemId()) + " as it cannot be found from the current destination " + navController.getCurrentDestination(), e);
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x009a, code lost:
        if (matchDestination$navigation_ui_release(r9, r7.getItemId()) == true) goto L15;
     */
    @NavigationUiSaveStateControl
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean onNavDestinationSelected(MenuItem item, NavController navController, boolean z) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(navController, "navController");
        boolean z2 = true;
        if (!(!z)) {
            throw new IllegalStateException("Leave the saveState parameter out entirely to use the non-experimental version of this API, which saves the state by default".toString());
        }
        NavOptions.Builder launchSingleTop = new NavOptions.Builder().setLaunchSingleTop(true);
        NavDestination currentDestination = navController.getCurrentDestination();
        Intrinsics.checkNotNull(currentDestination);
        NavGraph parent = currentDestination.getParent();
        Intrinsics.checkNotNull(parent);
        if (parent.findNode(item.getItemId()) instanceof ActivityNavigator.Destination) {
            launchSingleTop.setEnterAnim(R.anim.nav_default_enter_anim).setExitAnim(R.anim.nav_default_exit_anim).setPopEnterAnim(R.anim.nav_default_pop_enter_anim).setPopExitAnim(R.anim.nav_default_pop_exit_anim);
        } else {
            launchSingleTop.setEnterAnim(R.animator.nav_default_enter_anim).setExitAnim(R.animator.nav_default_exit_anim).setPopEnterAnim(R.animator.nav_default_pop_enter_anim).setPopExitAnim(R.animator.nav_default_pop_exit_anim);
        }
        if ((item.getOrder() & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            NavOptions.Builder.setPopUpTo$default(launchSingleTop, NavGraph.Companion.findStartDestination(navController.getGraph()).getId(), false, false, 4, (Object) null);
        }
        try {
            navController.navigate(item.getItemId(), (Bundle) null, launchSingleTop.build());
            NavDestination currentDestination2 = navController.getCurrentDestination();
            if (currentDestination2 != null) {
            }
            z2 = false;
            return z2;
        } catch (IllegalArgumentException e) {
            Log.i(TAG, "Ignoring onNavDestinationSelected for MenuItem " + NavDestination.Companion.getDisplayName(navController.getContext(), item.getItemId()) + " as it cannot be found from the current destination " + navController.getCurrentDestination(), e);
            return false;
        }
    }

    @JvmStatic
    public static final boolean navigateUp(NavController navController, Openable openable) {
        Intrinsics.checkNotNullParameter(navController, "navController");
        return navigateUp(navController, new AppBarConfiguration.Builder(navController.getGraph()).setOpenableLayout(openable).build());
    }

    @JvmStatic
    public static final boolean navigateUp(NavController navController, AppBarConfiguration configuration) {
        Intrinsics.checkNotNullParameter(navController, "navController");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Openable openableLayout = configuration.getOpenableLayout();
        NavDestination currentDestination = navController.getCurrentDestination();
        if (openableLayout != null && currentDestination != null && configuration.isTopLevelDestination(currentDestination)) {
            openableLayout.open();
            return true;
        } else if (navController.navigateUp()) {
            return true;
        } else {
            AppBarConfiguration.OnNavigateUpListener fallbackOnNavigateUpListener = configuration.getFallbackOnNavigateUpListener();
            if (fallbackOnNavigateUpListener != null) {
                return fallbackOnNavigateUpListener.onNavigateUp();
            }
            return false;
        }
    }

    @JvmStatic
    public static final void setupActionBarWithNavController(AppCompatActivity activity, NavController navController, Openable openable) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(navController, "navController");
        setupActionBarWithNavController(activity, navController, new AppBarConfiguration.Builder(navController.getGraph()).setOpenableLayout(openable).build());
    }

    public static /* synthetic */ void setupActionBarWithNavController$default(AppCompatActivity appCompatActivity, NavController navController, AppBarConfiguration appBarConfiguration, int i, Object obj) {
        if ((i & 4) != 0) {
            appBarConfiguration = new AppBarConfiguration.Builder(navController.getGraph()).build();
        }
        setupActionBarWithNavController(appCompatActivity, navController, appBarConfiguration);
    }

    @JvmStatic
    public static final void setupActionBarWithNavController(AppCompatActivity activity, NavController navController, AppBarConfiguration configuration) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(navController, "navController");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        navController.addOnDestinationChangedListener(new ActionBarOnDestinationChangedListener(activity, configuration));
    }

    @JvmStatic
    public static final void setupWithNavController(Toolbar toolbar, NavController navController, Openable openable) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        Intrinsics.checkNotNullParameter(navController, "navController");
        setupWithNavController(toolbar, navController, new AppBarConfiguration.Builder(navController.getGraph()).setOpenableLayout(openable).build());
    }

    public static /* synthetic */ void setupWithNavController$default(Toolbar toolbar, NavController navController, AppBarConfiguration appBarConfiguration, int i, Object obj) {
        if ((i & 4) != 0) {
            appBarConfiguration = new AppBarConfiguration.Builder(navController.getGraph()).build();
        }
        setupWithNavController(toolbar, navController, appBarConfiguration);
    }

    @JvmStatic
    public static final void setupWithNavController(Toolbar toolbar, final NavController navController, final AppBarConfiguration configuration) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        Intrinsics.checkNotNullParameter(navController, "navController");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        navController.addOnDestinationChangedListener(new ToolbarOnDestinationChangedListener(toolbar, configuration));
        toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: androidx.navigation.ui.NavigationUI$$ExternalSyntheticLambda4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NavigationUI.setupWithNavController$lambda$1(NavController.this, configuration, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupWithNavController$lambda$1(NavController navController, AppBarConfiguration configuration, View view) {
        Intrinsics.checkNotNullParameter(navController, "$navController");
        Intrinsics.checkNotNullParameter(configuration, "$configuration");
        navigateUp(navController, configuration);
    }

    @JvmStatic
    public static final void setupWithNavController(CollapsingToolbarLayout collapsingToolbarLayout, Toolbar toolbar, NavController navController, Openable openable) {
        Intrinsics.checkNotNullParameter(collapsingToolbarLayout, "collapsingToolbarLayout");
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        Intrinsics.checkNotNullParameter(navController, "navController");
        setupWithNavController(collapsingToolbarLayout, toolbar, navController, new AppBarConfiguration.Builder(navController.getGraph()).setOpenableLayout(openable).build());
    }

    public static /* synthetic */ void setupWithNavController$default(CollapsingToolbarLayout collapsingToolbarLayout, Toolbar toolbar, NavController navController, AppBarConfiguration appBarConfiguration, int i, Object obj) {
        if ((i & 8) != 0) {
            appBarConfiguration = new AppBarConfiguration.Builder(navController.getGraph()).build();
        }
        setupWithNavController(collapsingToolbarLayout, toolbar, navController, appBarConfiguration);
    }

    @JvmStatic
    public static final void setupWithNavController(CollapsingToolbarLayout collapsingToolbarLayout, Toolbar toolbar, final NavController navController, final AppBarConfiguration configuration) {
        Intrinsics.checkNotNullParameter(collapsingToolbarLayout, "collapsingToolbarLayout");
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        Intrinsics.checkNotNullParameter(navController, "navController");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        navController.addOnDestinationChangedListener(new CollapsingToolbarOnDestinationChangedListener(collapsingToolbarLayout, toolbar, configuration));
        toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: androidx.navigation.ui.NavigationUI$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NavigationUI.setupWithNavController$lambda$2(NavController.this, configuration, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupWithNavController$lambda$2(NavController navController, AppBarConfiguration configuration, View view) {
        Intrinsics.checkNotNullParameter(navController, "$navController");
        Intrinsics.checkNotNullParameter(configuration, "$configuration");
        navigateUp(navController, configuration);
    }

    @JvmStatic
    public static final void setupWithNavController(final NavigationView navigationView, final NavController navController) {
        Intrinsics.checkNotNullParameter(navigationView, "navigationView");
        Intrinsics.checkNotNullParameter(navController, "navController");
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() { // from class: androidx.navigation.ui.NavigationUI$$ExternalSyntheticLambda3
            @Override // com.google.android.material.navigation.NavigationView.OnNavigationItemSelectedListener
            public final boolean onNavigationItemSelected(MenuItem menuItem) {
                boolean z;
                z = NavigationUI.setupWithNavController$lambda$3(NavController.this, navigationView, menuItem);
                return z;
            }
        });
        final WeakReference weakReference = new WeakReference(navigationView);
        navController.addOnDestinationChangedListener(new NavController.OnDestinationChangedListener() { // from class: androidx.navigation.ui.NavigationUI$setupWithNavController$4
            @Override // androidx.navigation.NavController.OnDestinationChangedListener
            public void onDestinationChanged(NavController controller, NavDestination destination, Bundle bundle) {
                Intrinsics.checkNotNullParameter(controller, "controller");
                Intrinsics.checkNotNullParameter(destination, "destination");
                NavigationView navigationView2 = weakReference.get();
                if (navigationView2 == null) {
                    navController.removeOnDestinationChangedListener(this);
                } else if (!(destination instanceof FloatingWindow)) {
                    Menu menu = navigationView2.getMenu();
                    Intrinsics.checkNotNullExpressionValue(menu, "view.menu");
                    int size = menu.size();
                    for (int i = 0; i < size; i++) {
                        MenuItem item = menu.getItem(i);
                        Intrinsics.checkExpressionValueIsNotNull(item, "getItem(index)");
                        item.setChecked(NavigationUI.matchDestination$navigation_ui_release(destination, item.getItemId()));
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setupWithNavController$lambda$3(NavController navController, NavigationView navigationView, MenuItem item) {
        Intrinsics.checkNotNullParameter(navController, "$navController");
        Intrinsics.checkNotNullParameter(navigationView, "$navigationView");
        Intrinsics.checkNotNullParameter(item, "item");
        boolean onNavDestinationSelected = onNavDestinationSelected(item, navController);
        if (onNavDestinationSelected) {
            ViewParent parent = navigationView.getParent();
            if (parent instanceof Openable) {
                ((Openable) parent).close();
            } else {
                BottomSheetBehavior<?> findBottomSheetBehavior = findBottomSheetBehavior(navigationView);
                if (findBottomSheetBehavior != null) {
                    findBottomSheetBehavior.setState(5);
                }
            }
        }
        return onNavDestinationSelected;
    }

    @NavigationUiSaveStateControl
    @JvmStatic
    public static final void setupWithNavController(final NavigationView navigationView, final NavController navController, final boolean z) {
        Intrinsics.checkNotNullParameter(navigationView, "navigationView");
        Intrinsics.checkNotNullParameter(navController, "navController");
        if (!(!z)) {
            throw new IllegalStateException("Leave the saveState parameter out entirely to use the non-experimental version of this API, which saves the state by default".toString());
        }
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() { // from class: androidx.navigation.ui.NavigationUI$$ExternalSyntheticLambda0
            @Override // com.google.android.material.navigation.NavigationView.OnNavigationItemSelectedListener
            public final boolean onNavigationItemSelected(MenuItem menuItem) {
                boolean z2;
                z2 = NavigationUI.setupWithNavController$lambda$5(NavController.this, z, navigationView, menuItem);
                return z2;
            }
        });
        final WeakReference weakReference = new WeakReference(navigationView);
        navController.addOnDestinationChangedListener(new NavController.OnDestinationChangedListener() { // from class: androidx.navigation.ui.NavigationUI$setupWithNavController$7
            @Override // androidx.navigation.NavController.OnDestinationChangedListener
            public void onDestinationChanged(NavController controller, NavDestination destination, Bundle bundle) {
                Intrinsics.checkNotNullParameter(controller, "controller");
                Intrinsics.checkNotNullParameter(destination, "destination");
                NavigationView navigationView2 = weakReference.get();
                if (navigationView2 == null) {
                    navController.removeOnDestinationChangedListener(this);
                } else if (!(destination instanceof FloatingWindow)) {
                    Menu menu = navigationView2.getMenu();
                    Intrinsics.checkNotNullExpressionValue(menu, "view.menu");
                    int size = menu.size();
                    for (int i = 0; i < size; i++) {
                        MenuItem item = menu.getItem(i);
                        Intrinsics.checkExpressionValueIsNotNull(item, "getItem(index)");
                        item.setChecked(NavigationUI.matchDestination$navigation_ui_release(destination, item.getItemId()));
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setupWithNavController$lambda$5(NavController navController, boolean z, NavigationView navigationView, MenuItem item) {
        Intrinsics.checkNotNullParameter(navController, "$navController");
        Intrinsics.checkNotNullParameter(navigationView, "$navigationView");
        Intrinsics.checkNotNullParameter(item, "item");
        boolean onNavDestinationSelected = onNavDestinationSelected(item, navController, z);
        if (onNavDestinationSelected) {
            ViewParent parent = navigationView.getParent();
            if (parent instanceof Openable) {
                ((Openable) parent).close();
            } else {
                BottomSheetBehavior<?> findBottomSheetBehavior = findBottomSheetBehavior(navigationView);
                if (findBottomSheetBehavior != null) {
                    findBottomSheetBehavior.setState(5);
                }
            }
        }
        return onNavDestinationSelected;
    }

    @JvmStatic
    public static final BottomSheetBehavior<?> findBottomSheetBehavior(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof CoordinatorLayout.LayoutParams)) {
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                return findBottomSheetBehavior((View) parent);
            }
            return null;
        }
        CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) layoutParams).getBehavior();
        if (behavior instanceof BottomSheetBehavior) {
            return (BottomSheetBehavior) behavior;
        }
        return null;
    }

    @JvmStatic
    public static final void setupWithNavController(NavigationBarView navigationBarView, final NavController navController) {
        Intrinsics.checkNotNullParameter(navigationBarView, "navigationBarView");
        Intrinsics.checkNotNullParameter(navController, "navController");
        navigationBarView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() { // from class: androidx.navigation.ui.NavigationUI$$ExternalSyntheticLambda2
            @Override // com.google.android.material.navigation.NavigationBarView.OnItemSelectedListener
            public final boolean onNavigationItemSelected(MenuItem menuItem) {
                boolean z;
                z = NavigationUI.setupWithNavController$lambda$6(NavController.this, menuItem);
                return z;
            }
        });
        final WeakReference weakReference = new WeakReference(navigationBarView);
        navController.addOnDestinationChangedListener(new NavController.OnDestinationChangedListener() { // from class: androidx.navigation.ui.NavigationUI$setupWithNavController$9
            @Override // androidx.navigation.NavController.OnDestinationChangedListener
            public void onDestinationChanged(NavController controller, NavDestination destination, Bundle bundle) {
                Intrinsics.checkNotNullParameter(controller, "controller");
                Intrinsics.checkNotNullParameter(destination, "destination");
                NavigationBarView navigationBarView2 = weakReference.get();
                if (navigationBarView2 == null) {
                    navController.removeOnDestinationChangedListener(this);
                } else if (!(destination instanceof FloatingWindow)) {
                    Menu menu = navigationBarView2.getMenu();
                    Intrinsics.checkNotNullExpressionValue(menu, "view.menu");
                    int size = menu.size();
                    for (int i = 0; i < size; i++) {
                        MenuItem item = menu.getItem(i);
                        Intrinsics.checkExpressionValueIsNotNull(item, "getItem(index)");
                        if (NavigationUI.matchDestination$navigation_ui_release(destination, item.getItemId())) {
                            item.setChecked(true);
                        }
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setupWithNavController$lambda$6(NavController navController, MenuItem item) {
        Intrinsics.checkNotNullParameter(navController, "$navController");
        Intrinsics.checkNotNullParameter(item, "item");
        return onNavDestinationSelected(item, navController);
    }

    @NavigationUiSaveStateControl
    @JvmStatic
    public static final void setupWithNavController(NavigationBarView navigationBarView, final NavController navController, final boolean z) {
        Intrinsics.checkNotNullParameter(navigationBarView, "navigationBarView");
        Intrinsics.checkNotNullParameter(navController, "navController");
        if (!(!z)) {
            throw new IllegalStateException("Leave the saveState parameter out entirely to use the non-experimental version of this API, which saves the state by default".toString());
        }
        navigationBarView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() { // from class: androidx.navigation.ui.NavigationUI$$ExternalSyntheticLambda5
            @Override // com.google.android.material.navigation.NavigationBarView.OnItemSelectedListener
            public final boolean onNavigationItemSelected(MenuItem menuItem) {
                boolean z2;
                z2 = NavigationUI.setupWithNavController$lambda$8(NavController.this, z, menuItem);
                return z2;
            }
        });
        final WeakReference weakReference = new WeakReference(navigationBarView);
        navController.addOnDestinationChangedListener(new NavController.OnDestinationChangedListener() { // from class: androidx.navigation.ui.NavigationUI$setupWithNavController$12
            @Override // androidx.navigation.NavController.OnDestinationChangedListener
            public void onDestinationChanged(NavController controller, NavDestination destination, Bundle bundle) {
                Intrinsics.checkNotNullParameter(controller, "controller");
                Intrinsics.checkNotNullParameter(destination, "destination");
                NavigationBarView navigationBarView2 = weakReference.get();
                if (navigationBarView2 == null) {
                    navController.removeOnDestinationChangedListener(this);
                } else if (!(destination instanceof FloatingWindow)) {
                    Menu menu = navigationBarView2.getMenu();
                    Intrinsics.checkNotNullExpressionValue(menu, "view.menu");
                    int size = menu.size();
                    for (int i = 0; i < size; i++) {
                        MenuItem item = menu.getItem(i);
                        Intrinsics.checkExpressionValueIsNotNull(item, "getItem(index)");
                        if (NavigationUI.matchDestination$navigation_ui_release(destination, item.getItemId())) {
                            item.setChecked(true);
                        }
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setupWithNavController$lambda$8(NavController navController, boolean z, MenuItem item) {
        Intrinsics.checkNotNullParameter(navController, "$navController");
        Intrinsics.checkNotNullParameter(item, "item");
        return onNavDestinationSelected(item, navController, z);
    }

    @JvmStatic
    public static final boolean matchDestination$navigation_ui_release(NavDestination navDestination, int i) {
        boolean z;
        Intrinsics.checkNotNullParameter(navDestination, "<this>");
        Iterator<NavDestination> it = NavDestination.Companion.getHierarchy(navDestination).iterator();
        do {
            z = false;
            if (!it.hasNext()) {
                return false;
            }
            if (it.next().getId() == i) {
                z = true;
                continue;
            }
        } while (!z);
        return true;
    }
}
