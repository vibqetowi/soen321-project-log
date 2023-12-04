package com.ifriend.presentation.features.app.viewmodel;

import com.ifriend.presentation.features.app.viewmodel.AppViewModel;
import com.ifriend.presentation.features.app.viewmodel.models.AppSystemState;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: AppViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/presentation/features/app/viewmodel/AppViewModel$UiState;", "state", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class AppViewModel$onPause$1 extends Lambda implements Function1<AppViewModel.UiState, AppViewModel.UiState> {
    public static final AppViewModel$onPause$1 INSTANCE = new AppViewModel$onPause$1();

    AppViewModel$onPause$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final AppViewModel.UiState invoke(AppViewModel.UiState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return AppViewModel.UiState.copy$default(state, false, AppSystemState.Background, 1, null);
    }
}
