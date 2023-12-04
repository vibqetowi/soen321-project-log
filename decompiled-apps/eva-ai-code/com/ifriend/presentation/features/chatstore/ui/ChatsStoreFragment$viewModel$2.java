package com.ifriend.presentation.features.chatstore.ui;

import androidx.lifecycle.ViewModelProvider;
import com.ifriend.presentation.features.chatstore.viewmodel.ChatsStoreViewModelFactory;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatsStoreFragment.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/lifecycle/ViewModelProvider$Factory;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatsStoreFragment$viewModel$2 extends Lambda implements Function0<ViewModelProvider.Factory> {
    final /* synthetic */ ChatsStoreFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatsStoreFragment$viewModel$2(ChatsStoreFragment chatsStoreFragment) {
        super(0);
        this.this$0 = chatsStoreFragment;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final ViewModelProvider.Factory invoke() {
        ChatsStoreViewModelFactory.Factory viewModelFactory = this.this$0.getViewModelFactory();
        String string = this.this$0.requireArguments().getString("ChatsStoreFragment.chatId");
        if (string != null) {
            Intrinsics.checkNotNullExpressionValue(string, "requireNotNull(...)");
            return viewModelFactory.create(string);
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
