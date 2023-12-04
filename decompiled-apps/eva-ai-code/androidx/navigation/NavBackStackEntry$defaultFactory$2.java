package androidx.navigation;

import android.app.Application;
import android.content.Context;
import androidx.lifecycle.SavedStateViewModelFactory;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NavBackStackEntry.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/lifecycle/SavedStateViewModelFactory;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NavBackStackEntry$defaultFactory$2 extends Lambda implements Function0<SavedStateViewModelFactory> {
    final /* synthetic */ NavBackStackEntry this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavBackStackEntry$defaultFactory$2(NavBackStackEntry navBackStackEntry) {
        super(0);
        this.this$0 = navBackStackEntry;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final SavedStateViewModelFactory invoke() {
        Context context;
        context = this.this$0.context;
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
        NavBackStackEntry navBackStackEntry = this.this$0;
        return new SavedStateViewModelFactory(application, navBackStackEntry, navBackStackEntry.getArguments());
    }
}
