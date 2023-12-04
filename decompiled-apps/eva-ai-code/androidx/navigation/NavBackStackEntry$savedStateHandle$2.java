package androidx.navigation;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavBackStackEntry;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NavBackStackEntry.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/lifecycle/SavedStateHandle;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NavBackStackEntry$savedStateHandle$2 extends Lambda implements Function0<SavedStateHandle> {
    final /* synthetic */ NavBackStackEntry this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavBackStackEntry$savedStateHandle$2(NavBackStackEntry navBackStackEntry) {
        super(0);
        this.this$0 = navBackStackEntry;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final SavedStateHandle invoke() {
        boolean z;
        z = this.this$0.savedStateRegistryAttached;
        if (!z) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).".toString());
        }
        if (!(this.this$0.getLifecycle().getCurrentState() != Lifecycle.State.DESTROYED)) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle after the NavBackStackEntry is destroyed.".toString());
        }
        return ((NavBackStackEntry.SavedStateViewModel) new ViewModelProvider(this.this$0, new NavBackStackEntry.NavResultSavedStateFactory(this.this$0)).get(NavBackStackEntry.SavedStateViewModel.class)).getHandle();
    }
}
