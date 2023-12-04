package com.ifriend.presentation.features.app.delegates;

import androidx.core.app.NotificationCompat;
import androidx.lifecycle.ViewModelKt;
import com.ifriend.core.utils.CoroutinesKt;
import com.ifriend.domain.useCases.AppConfigUseCase;
import com.ifriend.presentation.common.observers.appevents.AppEvents;
import com.ifriend.presentation.features.app.viewmodel.AppViewModel;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: PurchaseInfoDelegate.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0016R\u00020\u0007¢\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/ifriend/presentation/features/app/delegates/PurchaseInfoDelegateImpl;", "Lcom/ifriend/presentation/features/app/delegates/PurchaseInfoDelegate;", "appConfigUseCase", "Lcom/ifriend/domain/useCases/AppConfigUseCase;", "(Lcom/ifriend/domain/useCases/AppConfigUseCase;)V", "handlePurchaseInfoEvent", "", "Lcom/ifriend/presentation/features/app/viewmodel/AppViewModel;", NotificationCompat.CATEGORY_EVENT, "Lcom/ifriend/presentation/common/observers/appevents/AppEvents$PurchaseInfo;", "(Lcom/ifriend/presentation/features/app/viewmodel/AppViewModel;Lcom/ifriend/presentation/common/observers/appevents/AppEvents$PurchaseInfo;)V", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PurchaseInfoDelegateImpl implements PurchaseInfoDelegate {
    public static final int $stable = 8;
    private final AppConfigUseCase appConfigUseCase;

    @Inject
    public PurchaseInfoDelegateImpl(AppConfigUseCase appConfigUseCase) {
        Intrinsics.checkNotNullParameter(appConfigUseCase, "appConfigUseCase");
        this.appConfigUseCase = appConfigUseCase;
    }

    @Override // com.ifriend.presentation.features.app.delegates.PurchaseInfoDelegate
    public void handlePurchaseInfoEvent(AppViewModel context_receiver_0, AppEvents.PurchaseInfo event) {
        Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
        Intrinsics.checkNotNullParameter(event, "event");
        CoroutinesKt.safeLaunch$default(ViewModelKt.getViewModelScope(context_receiver_0), null, null, new PurchaseInfoDelegateImpl$handlePurchaseInfoEvent$1(event, this, context_receiver_0, null), 3, null);
    }
}
