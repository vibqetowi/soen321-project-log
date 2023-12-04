package com.ifriend.presentation.navigation.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ScopedStore.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a9\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00010\bH\u0007¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"rememberScopingState", "Component", "", "storeOwner", "Landroidx/lifecycle/ViewModelStoreOwner;", "key", "", "builder", "Lkotlin/Function0;", "(Landroidx/lifecycle/ViewModelStoreOwner;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Ljava/lang/Object;", "presentation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ScopedStoreKt {
    public static final <Component> Component rememberScopingState(ViewModelStoreOwner storeOwner, String str, final Function0<? extends Component> builder, Composer composer, int i, int i2) {
        CreationExtras.Empty empty;
        Intrinsics.checkNotNullParameter(storeOwner, "storeOwner");
        Intrinsics.checkNotNullParameter(builder, "builder");
        composer.startReplaceableGroup(-667451036);
        ComposerKt.sourceInformation(composer, "C(rememberScopingState)P(2,1)");
        if ((i2 & 2) != 0) {
            str = null;
        }
        String str2 = str;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-667451036, i, -1, "com.ifriend.presentation.navigation.compose.rememberScopingState (ScopedStore.kt:16)");
        }
        composer.startReplaceableGroup(1157296644);
        ComposerKt.sourceInformation(composer, "CC(remember)P(1):Composables.kt#9igjgp");
        boolean changed = composer.changed(str2);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new ViewModelProvider.Factory() { // from class: com.ifriend.presentation.navigation.compose.ScopedStoreKt$rememberScopingState$factory$1$1
                @Override // androidx.lifecycle.ViewModelProvider.Factory
                public /* synthetic */ ViewModel create(Class cls, CreationExtras creationExtras) {
                    return ViewModelProvider.Factory.CC.$default$create(this, cls, creationExtras);
                }

                @Override // androidx.lifecycle.ViewModelProvider.Factory
                public <VM extends ViewModel> VM create(Class<VM> modelClass) {
                    Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                    return new ScopingState(builder.invoke());
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        ScopedStoreKt$rememberScopingState$factory$1$1 scopedStoreKt$rememberScopingState$factory$1$1 = (ScopedStoreKt$rememberScopingState$factory$1$1) rememberedValue;
        int i3 = (i & 112) | 8;
        composer.startReplaceableGroup(1729797275);
        ComposerKt.sourceInformation(composer, "CC(viewModel)P(3,2,1)*80@3834L7,90@4209L68:ViewModel.kt#3tja67");
        if (storeOwner instanceof HasDefaultViewModelProviderFactory) {
            empty = ((HasDefaultViewModelProviderFactory) storeOwner).getDefaultViewModelCreationExtras();
        } else {
            empty = CreationExtras.Empty.INSTANCE;
        }
        ViewModel viewModel = ViewModelKt.viewModel(ScopingState.class, storeOwner, str2, scopedStoreKt$rememberScopingState$factory$1$1, empty, composer, ((i3 << 3) & 896) | 36936, 0);
        composer.endReplaceableGroup();
        Component component = (Component) ((ScopingState) viewModel).getValue();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return component;
    }
}
