package androidx.navigation.dynamicfeatures.fragment.ui;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.navigation.dynamicfeatures.DynamicInstallMonitor;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: InstallViewModel.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Landroidx/navigation/dynamicfeatures/fragment/ui/InstallViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "installMonitor", "Landroidx/navigation/dynamicfeatures/DynamicInstallMonitor;", "getInstallMonitor", "()Landroidx/navigation/dynamicfeatures/DynamicInstallMonitor;", "setInstallMonitor", "(Landroidx/navigation/dynamicfeatures/DynamicInstallMonitor;)V", "Companion", "navigation-dynamic-features-fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class InstallViewModel extends ViewModel {
    public static final Companion Companion = new Companion(null);
    private static final ViewModelProvider.Factory FACTORY = new ViewModelProvider.Factory() { // from class: androidx.navigation.dynamicfeatures.fragment.ui.InstallViewModel$Companion$FACTORY$1
        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public /* synthetic */ ViewModel create(Class cls, CreationExtras creationExtras) {
            return ViewModelProvider.Factory.CC.$default$create(this, cls, creationExtras);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends ViewModel> T create(Class<T> modelClass) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            return new InstallViewModel();
        }
    };
    private DynamicInstallMonitor installMonitor;

    /* compiled from: InstallViewModel.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/navigation/dynamicfeatures/fragment/ui/InstallViewModel$Companion;", "", "()V", "FACTORY", "Landroidx/lifecycle/ViewModelProvider$Factory;", "getFACTORY", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "navigation-dynamic-features-fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ViewModelProvider.Factory getFACTORY() {
            return InstallViewModel.FACTORY;
        }
    }

    public final DynamicInstallMonitor getInstallMonitor() {
        return this.installMonitor;
    }

    public final void setInstallMonitor(DynamicInstallMonitor dynamicInstallMonitor) {
        this.installMonitor = dynamicInstallMonitor;
    }
}
