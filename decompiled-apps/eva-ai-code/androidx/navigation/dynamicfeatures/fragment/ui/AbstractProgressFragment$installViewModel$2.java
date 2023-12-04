package androidx.navigation.dynamicfeatures.fragment.ui;

import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AbstractProgressFragment.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/navigation/dynamicfeatures/fragment/ui/InstallViewModel;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AbstractProgressFragment$installViewModel$2 extends Lambda implements Function0<InstallViewModel> {
    final /* synthetic */ AbstractProgressFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractProgressFragment$installViewModel$2(AbstractProgressFragment abstractProgressFragment) {
        super(0);
        this.this$0 = abstractProgressFragment;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final InstallViewModel invoke() {
        ViewModelStore viewModelStore = this.this$0.getViewModelStore();
        Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
        ViewModelProvider.Factory factory = InstallViewModel.Companion.getFACTORY();
        CreationExtras defaultViewModelCreationExtras = this.this$0.getDefaultViewModelCreationExtras();
        Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "defaultViewModelCreationExtras");
        return (InstallViewModel) new ViewModelProvider(viewModelStore, factory, defaultViewModelCreationExtras).get(InstallViewModel.class);
    }
}
