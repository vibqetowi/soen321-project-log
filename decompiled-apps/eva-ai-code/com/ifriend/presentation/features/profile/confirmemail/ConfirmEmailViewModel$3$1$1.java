package com.ifriend.presentation.features.profile.confirmemail;

import com.ifriend.presentation.features.profile.confirmemail.ConfirmEmailViewModel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ConfirmEmailViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/presentation/features/profile/confirmemail/ConfirmEmailViewModel$UiState;", "state", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ConfirmEmailViewModel$3$1$1 extends Lambda implements Function1<ConfirmEmailViewModel.UiState, ConfirmEmailViewModel.UiState> {
    final /* synthetic */ long $neurons;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfirmEmailViewModel$3$1$1(long j) {
        super(1);
        this.$neurons = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final ConfirmEmailViewModel.UiState invoke(ConfirmEmailViewModel.UiState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return ConfirmEmailViewModel.UiState.copy$default(state, null, this.$neurons, 1, null);
    }
}
