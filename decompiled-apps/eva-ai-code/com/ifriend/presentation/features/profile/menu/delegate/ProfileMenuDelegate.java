package com.ifriend.presentation.features.profile.menu.delegate;

import androidx.lifecycle.ViewModel;
import com.ifriend.presentation.features.profile.menu.model.ProfileMenuUiState;
import kotlin.Metadata;
import kotlinx.coroutines.flow.StateFlow;
/* compiled from: ProfileMenuDelegate.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0007\u001a\u00020\bH&J\u001d\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fH&R\u00020\n¢\u0006\u0002\u0010\rJ\b\u0010\u000e\u001a\u00020\bH&R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/ifriend/presentation/features/profile/menu/delegate/ProfileMenuDelegate;", "", "profileMenuState", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/ifriend/presentation/features/profile/menu/model/ProfileMenuUiState;", "getProfileMenuState", "()Lkotlinx/coroutines/flow/StateFlow;", "hideProfileMenu", "", "initProfileMenuDelegate", "Landroidx/lifecycle/ViewModel;", "chatId", "", "(Landroidx/lifecycle/ViewModel;Ljava/lang/String;)V", "showProfileMenu", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ProfileMenuDelegate {
    StateFlow<ProfileMenuUiState> getProfileMenuState();

    void hideProfileMenu();

    void initProfileMenuDelegate(ViewModel viewModel, String str);

    void showProfileMenu();

    /* compiled from: ProfileMenuDelegate.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ void initProfileMenuDelegate$default(ProfileMenuDelegate profileMenuDelegate, ViewModel viewModel, String str, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: initProfileMenuDelegate");
            }
            if ((i & 2) != 0) {
                str = null;
            }
            profileMenuDelegate.initProfileMenuDelegate(viewModel, str);
        }
    }
}
