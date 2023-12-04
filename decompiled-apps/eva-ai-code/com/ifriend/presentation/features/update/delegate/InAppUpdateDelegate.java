package com.ifriend.presentation.features.update.delegate;

import androidx.activity.result.ActivityResult;
import com.ifriend.presentation.features.update.model.InAppUpdateEvent;
import com.ifriend.presentation.features.update.model.InAppUpdateState;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;
/* compiled from: InAppUpdateDelegate.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\f\u001a\u00020\rH&J\b\u0010\u000e\u001a\u00020\rH&J\b\u0010\u000f\u001a\u00020\rH&J\u0012\u0010\u0010\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\u0012H&J\u0010\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0015H&J\b\u0010\u0016\u001a\u00020\rH&R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/ifriend/presentation/features/update/delegate/InAppUpdateDelegate;", "", "inAppUpdateState", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/ifriend/presentation/features/update/model/InAppUpdateState;", "getInAppUpdateState", "()Lkotlinx/coroutines/flow/StateFlow;", "startUpdateEvents", "Lkotlinx/coroutines/flow/Flow;", "Lcom/ifriend/presentation/features/update/model/InAppUpdateEvent;", "getStartUpdateEvents", "()Lkotlinx/coroutines/flow/Flow;", "checkForAppUpdates", "", "clearInAppUpdateDelegate", "completeUpdate", "dismissUpdatePopup", "fromUser", "", "handleStartUpdateResult", "result", "Landroidx/activity/result/ActivityResult;", "showUpdatePrompt", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface InAppUpdateDelegate {
    void checkForAppUpdates();

    void clearInAppUpdateDelegate();

    void completeUpdate();

    void dismissUpdatePopup(boolean z);

    StateFlow<InAppUpdateState> getInAppUpdateState();

    Flow<InAppUpdateEvent> getStartUpdateEvents();

    void handleStartUpdateResult(ActivityResult activityResult);

    void showUpdatePrompt();

    /* compiled from: InAppUpdateDelegate.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ void dismissUpdatePopup$default(InAppUpdateDelegate inAppUpdateDelegate, boolean z, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: dismissUpdatePopup");
            }
            if ((i & 1) != 0) {
                z = true;
            }
            inAppUpdateDelegate.dismissUpdatePopup(z);
        }
    }
}
