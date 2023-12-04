package androidx.navigation.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.navigation.NavBackStackEntry;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
/* compiled from: NavBackStackEntryProvider.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a,\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0011\u0010\u0005\u001a\r\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\b\u0007H\u0007¢\u0006\u0002\u0010\b\u001a$\u0010\t\u001a\u00020\u0001*\u00020\u00042\u0011\u0010\u0005\u001a\r\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\b\u0007H\u0003¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"LocalOwnersProvider", "", "Landroidx/navigation/NavBackStackEntry;", "saveableStateHolder", "Landroidx/compose/runtime/saveable/SaveableStateHolder;", FirebaseAnalytics.Param.CONTENT, "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Landroidx/navigation/NavBackStackEntry;Landroidx/compose/runtime/saveable/SaveableStateHolder;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "SaveableStateProvider", "(Landroidx/compose/runtime/saveable/SaveableStateHolder;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "navigation-compose_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NavBackStackEntryProviderKt {
    public static final void LocalOwnersProvider(NavBackStackEntry navBackStackEntry, SaveableStateHolder saveableStateHolder, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i) {
        Composer startRestartGroup = composer.startRestartGroup(-1579360880);
        ComposerKt.sourceInformation(startRestartGroup, "C(LocalOwnersProvider)P(1)46@1896L240:NavBackStackEntryProvider.kt#opm8kd");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1579360880, i, -1, "androidx.navigation.compose.LocalOwnersProvider (NavBackStackEntryProvider.kt:45)");
        }
        CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{LocalViewModelStoreOwner.INSTANCE.provides(navBackStackEntry), AndroidCompositionLocals_androidKt.getLocalLifecycleOwner().provides(navBackStackEntry), AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner().provides(navBackStackEntry)}, ComposableLambdaKt.composableLambda(startRestartGroup, -52928304, true, new NavBackStackEntryProviderKt$LocalOwnersProvider$1(saveableStateHolder, function2, i)), startRestartGroup, 56);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new NavBackStackEntryProviderKt$LocalOwnersProvider$2(navBackStackEntry, saveableStateHolder, function2, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SaveableStateProvider(SaveableStateHolder saveableStateHolder, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i) {
        CreationExtras.Empty empty;
        Composer startRestartGroup = composer.startRestartGroup(1211832233);
        ComposerKt.sourceInformation(startRestartGroup, "C(SaveableStateProvider)57@2261L38,64@2774L44:NavBackStackEntryProvider.kt#opm8kd");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1211832233, i, -1, "androidx.navigation.compose.SaveableStateProvider (NavBackStackEntryProvider.kt:56)");
        }
        startRestartGroup.startReplaceableGroup(1729797275);
        ComposerKt.sourceInformation(startRestartGroup, "CC(viewModel)P(3,2,1)*80@3834L7,90@4209L68:ViewModel.kt#3tja67");
        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(startRestartGroup, 6);
        if (current == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        if (current instanceof HasDefaultViewModelProviderFactory) {
            empty = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
        } else {
            empty = CreationExtras.Empty.INSTANCE;
        }
        ViewModel viewModel = ViewModelKt.viewModel(BackStackEntryIdViewModel.class, current, null, null, empty, startRestartGroup, 36936, 0);
        startRestartGroup.endReplaceableGroup();
        BackStackEntryIdViewModel backStackEntryIdViewModel = (BackStackEntryIdViewModel) viewModel;
        backStackEntryIdViewModel.setSaveableStateHolderRef(new WeakReference<>(saveableStateHolder));
        saveableStateHolder.SaveableStateProvider(backStackEntryIdViewModel.getId(), function2, startRestartGroup, (i & 112) | 520);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new NavBackStackEntryProviderKt$SaveableStateProvider$1(saveableStateHolder, function2, i));
    }
}
