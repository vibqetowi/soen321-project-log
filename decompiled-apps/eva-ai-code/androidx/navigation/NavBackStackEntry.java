package androidx.navigation;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.AbstractSavedStateViewModelFactory;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.SavedStateViewModelFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.MutableCreationExtras;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryController;
import androidx.savedstate.SavedStateRegistryOwner;
import java.util.Collection;
import java.util.Set;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: NavBackStackEntry.kt */
@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\u0018\u0000 V2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0003VWXB\u001b\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0000\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bBQ\b\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u0015J\u0013\u0010I\u001a\u00020B2\b\u0010J\u001a\u0004\u0018\u00010KH\u0096\u0002J\u0010\u0010L\u001a\u00020M2\u0006\u0010N\u001a\u00020OH\u0007J\b\u0010P\u001a\u00020QH\u0016J\u0010\u0010R\u001a\u00020M2\u0006\u0010S\u001a\u00020\u0007H\u0007J\b\u0010T\u001a\u00020\u0013H\u0016J\b\u0010U\u001a\u00020MH\u0007R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u00078F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u001a\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020%X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u001c\u0010\u000b\u001a\u00020\f@\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0010\u0010\r\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010.\u001a\u00020/8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R&\u00103\u001a\u00020\u000f2\u0006\u00102\u001a\u00020\u000f8G@GX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u00108\u001a\u0002098FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b<\u0010\u001f\u001a\u0004\b:\u0010;R\u0014\u0010=\u001a\u00020>8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b?\u0010@R\u000e\u0010A\u001a\u00020BX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010C\u001a\u00020DX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010E\u001a\u00020F8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bG\u0010HR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006Y"}, d2 = {"Landroidx/navigation/NavBackStackEntry;", "Landroidx/lifecycle/LifecycleOwner;", "Landroidx/lifecycle/ViewModelStoreOwner;", "Landroidx/lifecycle/HasDefaultViewModelProviderFactory;", "Landroidx/savedstate/SavedStateRegistryOwner;", "entry", "arguments", "Landroid/os/Bundle;", "(Landroidx/navigation/NavBackStackEntry;Landroid/os/Bundle;)V", "context", "Landroid/content/Context;", "destination", "Landroidx/navigation/NavDestination;", "immutableArgs", "hostLifecycleState", "Landroidx/lifecycle/Lifecycle$State;", "viewModelStoreProvider", "Landroidx/navigation/NavViewModelStoreProvider;", "id", "", "savedState", "(Landroid/content/Context;Landroidx/navigation/NavDestination;Landroid/os/Bundle;Landroidx/lifecycle/Lifecycle$State;Landroidx/navigation/NavViewModelStoreProvider;Ljava/lang/String;Landroid/os/Bundle;)V", "_lifecycle", "Landroidx/lifecycle/LifecycleRegistry;", "getArguments", "()Landroid/os/Bundle;", "defaultFactory", "Landroidx/lifecycle/SavedStateViewModelFactory;", "getDefaultFactory", "()Landroidx/lifecycle/SavedStateViewModelFactory;", "defaultFactory$delegate", "Lkotlin/Lazy;", "defaultViewModelCreationExtras", "Landroidx/lifecycle/viewmodel/CreationExtras;", "getDefaultViewModelCreationExtras", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "defaultViewModelProviderFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "getDefaultViewModelProviderFactory", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "getDestination", "()Landroidx/navigation/NavDestination;", "setDestination", "(Landroidx/navigation/NavDestination;)V", "getId", "()Ljava/lang/String;", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "getLifecycle", "()Landroidx/lifecycle/Lifecycle;", "maxState", "maxLifecycle", "getMaxLifecycle", "()Landroidx/lifecycle/Lifecycle$State;", "setMaxLifecycle", "(Landroidx/lifecycle/Lifecycle$State;)V", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle$delegate", "savedStateRegistry", "Landroidx/savedstate/SavedStateRegistry;", "getSavedStateRegistry", "()Landroidx/savedstate/SavedStateRegistry;", "savedStateRegistryAttached", "", "savedStateRegistryController", "Landroidx/savedstate/SavedStateRegistryController;", "viewModelStore", "Landroidx/lifecycle/ViewModelStore;", "getViewModelStore", "()Landroidx/lifecycle/ViewModelStore;", "equals", "other", "", "handleLifecycleEvent", "", NotificationCompat.CATEGORY_EVENT, "Landroidx/lifecycle/Lifecycle$Event;", "hashCode", "", "saveState", "outBundle", "toString", "updateState", "Companion", "NavResultSavedStateFactory", "SavedStateViewModel", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NavBackStackEntry implements LifecycleOwner, ViewModelStoreOwner, HasDefaultViewModelProviderFactory, SavedStateRegistryOwner {
    public static final Companion Companion = new Companion(null);
    private LifecycleRegistry _lifecycle;
    private final Context context;
    private final Lazy defaultFactory$delegate;
    private final ViewModelProvider.Factory defaultViewModelProviderFactory;
    private NavDestination destination;
    private Lifecycle.State hostLifecycleState;
    private final String id;
    private final Bundle immutableArgs;
    private Lifecycle.State maxLifecycle;
    private final Bundle savedState;
    private final Lazy savedStateHandle$delegate;
    private boolean savedStateRegistryAttached;
    private final SavedStateRegistryController savedStateRegistryController;
    private final NavViewModelStoreProvider viewModelStoreProvider;

    public /* synthetic */ NavBackStackEntry(Context context, NavDestination navDestination, Bundle bundle, Lifecycle.State state, NavViewModelStoreProvider navViewModelStoreProvider, String str, Bundle bundle2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, navDestination, bundle, state, navViewModelStoreProvider, str, bundle2);
    }

    private NavBackStackEntry(Context context, NavDestination navDestination, Bundle bundle, Lifecycle.State state, NavViewModelStoreProvider navViewModelStoreProvider, String str, Bundle bundle2) {
        this.context = context;
        this.destination = navDestination;
        this.immutableArgs = bundle;
        this.hostLifecycleState = state;
        this.viewModelStoreProvider = navViewModelStoreProvider;
        this.id = str;
        this.savedState = bundle2;
        this._lifecycle = new LifecycleRegistry(this);
        this.savedStateRegistryController = SavedStateRegistryController.Companion.create(this);
        this.defaultFactory$delegate = LazyKt.lazy(new NavBackStackEntry$defaultFactory$2(this));
        this.savedStateHandle$delegate = LazyKt.lazy(new NavBackStackEntry$savedStateHandle$2(this));
        this.maxLifecycle = Lifecycle.State.INITIALIZED;
        this.defaultViewModelProviderFactory = getDefaultFactory();
    }

    public final NavDestination getDestination() {
        return this.destination;
    }

    public final void setDestination(NavDestination navDestination) {
        Intrinsics.checkNotNullParameter(navDestination, "<set-?>");
        this.destination = navDestination;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    /* synthetic */ NavBackStackEntry(Context context, NavDestination navDestination, Bundle bundle, Lifecycle.State state, NavViewModelStoreProvider navViewModelStoreProvider, String str, Bundle bundle2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, navDestination, r5, r6, r7, r8, (i & 64) != 0 ? null : bundle2);
        String str2;
        Bundle bundle3 = (i & 4) != 0 ? null : bundle;
        Lifecycle.State state2 = (i & 8) != 0 ? Lifecycle.State.CREATED : state;
        NavViewModelStoreProvider navViewModelStoreProvider2 = (i & 16) != 0 ? null : navViewModelStoreProvider;
        if ((i & 32) != 0) {
            String uuid = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
            str2 = uuid;
        } else {
            str2 = str;
        }
    }

    public final String getId() {
        return this.id;
    }

    public /* synthetic */ NavBackStackEntry(NavBackStackEntry navBackStackEntry, Bundle bundle, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(navBackStackEntry, (i & 2) != 0 ? navBackStackEntry.getArguments() : bundle);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NavBackStackEntry(NavBackStackEntry entry, Bundle bundle) {
        this(entry.context, entry.destination, bundle, entry.hostLifecycleState, entry.viewModelStoreProvider, entry.id, entry.savedState);
        Intrinsics.checkNotNullParameter(entry, "entry");
        this.hostLifecycleState = entry.hostLifecycleState;
        setMaxLifecycle(entry.maxLifecycle);
    }

    /* compiled from: NavBackStackEntry.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JR\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\nH\u0007¨\u0006\u0012"}, d2 = {"Landroidx/navigation/NavBackStackEntry$Companion;", "", "()V", "create", "Landroidx/navigation/NavBackStackEntry;", "context", "Landroid/content/Context;", "destination", "Landroidx/navigation/NavDestination;", "arguments", "Landroid/os/Bundle;", "hostLifecycleState", "Landroidx/lifecycle/Lifecycle$State;", "viewModelStoreProvider", "Landroidx/navigation/NavViewModelStoreProvider;", "id", "", "savedState", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ NavBackStackEntry create$default(Companion companion, Context context, NavDestination navDestination, Bundle bundle, Lifecycle.State state, NavViewModelStoreProvider navViewModelStoreProvider, String str, Bundle bundle2, int i, Object obj) {
            String str2;
            Bundle bundle3 = (i & 4) != 0 ? null : bundle;
            Lifecycle.State state2 = (i & 8) != 0 ? Lifecycle.State.CREATED : state;
            NavViewModelStoreProvider navViewModelStoreProvider2 = (i & 16) != 0 ? null : navViewModelStoreProvider;
            if ((i & 32) != 0) {
                String uuid = UUID.randomUUID().toString();
                Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
                str2 = uuid;
            } else {
                str2 = str;
            }
            return companion.create(context, navDestination, bundle3, state2, navViewModelStoreProvider2, str2, (i & 64) != 0 ? null : bundle2);
        }

        public final NavBackStackEntry create(Context context, NavDestination destination, Bundle bundle, Lifecycle.State hostLifecycleState, NavViewModelStoreProvider navViewModelStoreProvider, String id, Bundle bundle2) {
            Intrinsics.checkNotNullParameter(destination, "destination");
            Intrinsics.checkNotNullParameter(hostLifecycleState, "hostLifecycleState");
            Intrinsics.checkNotNullParameter(id, "id");
            return new NavBackStackEntry(context, destination, bundle, hostLifecycleState, navViewModelStoreProvider, id, bundle2, null);
        }
    }

    private final SavedStateViewModelFactory getDefaultFactory() {
        return (SavedStateViewModelFactory) this.defaultFactory$delegate.getValue();
    }

    public final Bundle getArguments() {
        if (this.immutableArgs == null) {
            return null;
        }
        return new Bundle(this.immutableArgs);
    }

    public final SavedStateHandle getSavedStateHandle() {
        return (SavedStateHandle) this.savedStateHandle$delegate.getValue();
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        return this._lifecycle;
    }

    public final Lifecycle.State getMaxLifecycle() {
        return this.maxLifecycle;
    }

    public final void setMaxLifecycle(Lifecycle.State maxState) {
        Intrinsics.checkNotNullParameter(maxState, "maxState");
        this.maxLifecycle = maxState;
        updateState();
    }

    public final void handleLifecycleEvent(Lifecycle.Event event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.hostLifecycleState = event.getTargetState();
        updateState();
    }

    public final void updateState() {
        if (!this.savedStateRegistryAttached) {
            this.savedStateRegistryController.performAttach();
            this.savedStateRegistryAttached = true;
            if (this.viewModelStoreProvider != null) {
                SavedStateHandleSupport.enableSavedStateHandles(this);
            }
            this.savedStateRegistryController.performRestore(this.savedState);
        }
        if (this.hostLifecycleState.ordinal() < this.maxLifecycle.ordinal()) {
            this._lifecycle.setCurrentState(this.hostLifecycleState);
        } else {
            this._lifecycle.setCurrentState(this.maxLifecycle);
        }
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    public ViewModelStore getViewModelStore() {
        if (!this.savedStateRegistryAttached) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).".toString());
        }
        if (!(getLifecycle().getCurrentState() != Lifecycle.State.DESTROYED)) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels after the NavBackStackEntry is destroyed.".toString());
        }
        NavViewModelStoreProvider navViewModelStoreProvider = this.viewModelStoreProvider;
        if (navViewModelStoreProvider == null) {
            throw new IllegalStateException("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.".toString());
        }
        return navViewModelStoreProvider.getViewModelStore(this.id);
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return this.defaultViewModelProviderFactory;
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    public CreationExtras getDefaultViewModelCreationExtras() {
        MutableCreationExtras mutableCreationExtras = new MutableCreationExtras(null, 1, null);
        Context context = this.context;
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        Application application = applicationContext instanceof Application ? applicationContext : null;
        if (application != null) {
            mutableCreationExtras.set(ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY, application);
        }
        mutableCreationExtras.set(SavedStateHandleSupport.SAVED_STATE_REGISTRY_OWNER_KEY, this);
        mutableCreationExtras.set(SavedStateHandleSupport.VIEW_MODEL_STORE_OWNER_KEY, this);
        Bundle arguments = getArguments();
        if (arguments != null) {
            mutableCreationExtras.set(SavedStateHandleSupport.DEFAULT_ARGS_KEY, arguments);
        }
        return mutableCreationExtras;
    }

    @Override // androidx.savedstate.SavedStateRegistryOwner
    public SavedStateRegistry getSavedStateRegistry() {
        return this.savedStateRegistryController.getSavedStateRegistry();
    }

    public final void saveState(Bundle outBundle) {
        Intrinsics.checkNotNullParameter(outBundle, "outBundle");
        this.savedStateRegistryController.performSave(outBundle);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(Object obj) {
        boolean z;
        Set<String> keySet;
        boolean z2;
        if (obj == null || !(obj instanceof NavBackStackEntry)) {
            return false;
        }
        NavBackStackEntry navBackStackEntry = (NavBackStackEntry) obj;
        if (Intrinsics.areEqual(this.id, navBackStackEntry.id) && Intrinsics.areEqual(this.destination, navBackStackEntry.destination) && Intrinsics.areEqual(getLifecycle(), navBackStackEntry.getLifecycle()) && Intrinsics.areEqual(getSavedStateRegistry(), navBackStackEntry.getSavedStateRegistry())) {
            if (!Intrinsics.areEqual(this.immutableArgs, navBackStackEntry.immutableArgs)) {
                Bundle bundle = this.immutableArgs;
                if (bundle != null && (keySet = bundle.keySet()) != null) {
                    Set<String> set = keySet;
                    if (!(set instanceof Collection) || !set.isEmpty()) {
                        for (String str : set) {
                            Object obj2 = this.immutableArgs.get(str);
                            Bundle bundle2 = navBackStackEntry.immutableArgs;
                            if (!Intrinsics.areEqual(obj2, bundle2 != null ? bundle2.get(str) : null)) {
                                z2 = false;
                                break;
                            }
                        }
                    }
                    z2 = true;
                    if (z2) {
                        z = true;
                        if (!z) {
                            return false;
                        }
                    }
                }
                z = false;
                if (!z) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        Set<String> keySet;
        int hashCode = (this.id.hashCode() * 31) + this.destination.hashCode();
        Bundle bundle = this.immutableArgs;
        if (bundle != null && (keySet = bundle.keySet()) != null) {
            for (String str : keySet) {
                int i = hashCode * 31;
                Object obj = this.immutableArgs.get(str);
                hashCode = i + (obj != null ? obj.hashCode() : 0);
            }
        }
        return (((hashCode * 31) + getLifecycle().hashCode()) * 31) + getSavedStateRegistry().hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(" + this.id + ')');
        sb.append(" destination=");
        sb.append(this.destination);
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "sb.toString()");
        return sb2;
    }

    /* compiled from: NavBackStackEntry.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J5\u0010\u0005\u001a\u0002H\u0006\"\b\b\u0000\u0010\u0006*\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00060\u000b2\u0006\u0010\f\u001a\u00020\rH\u0014¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/navigation/NavBackStackEntry$NavResultSavedStateFactory;", "Landroidx/lifecycle/AbstractSavedStateViewModelFactory;", "owner", "Landroidx/savedstate/SavedStateRegistryOwner;", "(Landroidx/savedstate/SavedStateRegistryOwner;)V", "create", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/ViewModel;", "key", "", "modelClass", "Ljava/lang/Class;", "handle", "Landroidx/lifecycle/SavedStateHandle;", "(Ljava/lang/String;Ljava/lang/Class;Landroidx/lifecycle/SavedStateHandle;)Landroidx/lifecycle/ViewModel;", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class NavResultSavedStateFactory extends AbstractSavedStateViewModelFactory {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavResultSavedStateFactory(SavedStateRegistryOwner owner) {
            super(owner, null);
            Intrinsics.checkNotNullParameter(owner, "owner");
        }

        @Override // androidx.lifecycle.AbstractSavedStateViewModelFactory
        protected <T extends ViewModel> T create(String key, Class<T> modelClass, SavedStateHandle handle) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Intrinsics.checkNotNullParameter(handle, "handle");
            return new SavedStateViewModel(handle);
        }
    }

    /* compiled from: NavBackStackEntry.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/navigation/NavBackStackEntry$SavedStateViewModel;", "Landroidx/lifecycle/ViewModel;", "handle", "Landroidx/lifecycle/SavedStateHandle;", "(Landroidx/lifecycle/SavedStateHandle;)V", "getHandle", "()Landroidx/lifecycle/SavedStateHandle;", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class SavedStateViewModel extends ViewModel {
        private final SavedStateHandle handle;

        public SavedStateViewModel(SavedStateHandle handle) {
            Intrinsics.checkNotNullParameter(handle, "handle");
            this.handle = handle;
        }

        public final SavedStateHandle getHandle() {
            return this.handle;
        }
    }
}
