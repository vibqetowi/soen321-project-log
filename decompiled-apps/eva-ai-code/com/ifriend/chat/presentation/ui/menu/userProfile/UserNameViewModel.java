package com.ifriend.chat.presentation.ui.menu.userProfile;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.ifriend.base.navigation.api.RouterProvider;
import com.ifriend.domain.models.profile.user.User;
import com.ifriend.domain.useCases.user.change.ChangeUserNameUseCase;
import com.ifriend.domain.useCases.user.get.GetUserUseCase;
import com.ifriend.domain.validation.ValidateNameUseCase;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
/* compiled from: UserNameViewModel.kt */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u000e\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&J\u0006\u0010'\u001a\u00020$J\u0012\u0010(\u001a\u00020$2\b\u0010)\u001a\u0004\u0018\u00010*H\u0002J\u000e\u0010+\u001a\u00020$2\u0006\u0010%\u001a\u00020&R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0014R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001a\u001a\u00020\u001b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006,"}, d2 = {"Lcom/ifriend/chat/presentation/ui/menu/userProfile/UserNameViewModel;", "Landroidx/lifecycle/ViewModel;", "getUserUseCase", "Lcom/ifriend/domain/useCases/user/get/GetUserUseCase;", "changeUserNameUseCase", "Lcom/ifriend/domain/useCases/user/change/ChangeUserNameUseCase;", "validateNameUseCase", "Lcom/ifriend/domain/validation/ValidateNameUseCase;", "router", "Lcom/ifriend/base/navigation/api/RouterProvider;", "(Lcom/ifriend/domain/useCases/user/get/GetUserUseCase;Lcom/ifriend/domain/useCases/user/change/ChangeUserNameUseCase;Lcom/ifriend/domain/validation/ValidateNameUseCase;Lcom/ifriend/base/navigation/api/RouterProvider;)V", "fragment", "Lcom/ifriend/chat/presentation/ui/menu/userProfile/UserNameFragment;", "getFragment", "()Lcom/ifriend/chat/presentation/ui/menu/userProfile/UserNameFragment;", "setFragment", "(Lcom/ifriend/chat/presentation/ui/menu/userProfile/UserNameFragment;)V", "isValid", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "name", "Landroidx/lifecycle/MutableLiveData;", "", "getName", "()Landroidx/lifecycle/MutableLiveData;", "nameChangedWatcher", "Landroid/text/TextWatcher;", "getNameChangedWatcher", "()Landroid/text/TextWatcher;", "savedName", "getSavedName", "()Ljava/lang/String;", "setSavedName", "(Ljava/lang/String;)V", "back", "", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "init", "onUserChanged", "user", "Lcom/ifriend/domain/models/profile/user/User;", "save", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UserNameViewModel extends ViewModel {
    public static final int $stable = 8;
    private final ChangeUserNameUseCase changeUserNameUseCase;
    private UserNameFragment fragment;
    private final GetUserUseCase getUserUseCase;
    private final MutableStateFlow<Boolean> isValid;
    private final MutableLiveData<String> name;
    private final TextWatcher nameChangedWatcher;
    private final RouterProvider router;
    private String savedName;
    private final ValidateNameUseCase validateNameUseCase;

    @Inject
    public UserNameViewModel(GetUserUseCase getUserUseCase, ChangeUserNameUseCase changeUserNameUseCase, ValidateNameUseCase validateNameUseCase, RouterProvider router) {
        Intrinsics.checkNotNullParameter(getUserUseCase, "getUserUseCase");
        Intrinsics.checkNotNullParameter(changeUserNameUseCase, "changeUserNameUseCase");
        Intrinsics.checkNotNullParameter(validateNameUseCase, "validateNameUseCase");
        Intrinsics.checkNotNullParameter(router, "router");
        this.getUserUseCase = getUserUseCase;
        this.changeUserNameUseCase = changeUserNameUseCase;
        this.validateNameUseCase = validateNameUseCase;
        this.router = router;
        this.name = new MutableLiveData<>();
        this.isValid = StateFlowKt.MutableStateFlow(false);
        this.nameChangedWatcher = new TextWatcher() { // from class: com.ifriend.chat.presentation.ui.menu.userProfile.UserNameViewModel$nameChangedWatcher$1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                boolean z;
                ValidateNameUseCase validateNameUseCase2;
                UserNameViewModel.this.getName().setValue(String.valueOf(charSequence));
                MutableStateFlow<Boolean> isValid = UserNameViewModel.this.isValid();
                if (!Intrinsics.areEqual(UserNameViewModel.this.getName().getValue(), UserNameViewModel.this.getSavedName())) {
                    validateNameUseCase2 = UserNameViewModel.this.validateNameUseCase;
                    if (validateNameUseCase2.invoke(String.valueOf(UserNameViewModel.this.getName().getValue()))) {
                        z = true;
                        isValid.setValue(Boolean.valueOf(z));
                    }
                }
                z = false;
                isValid.setValue(Boolean.valueOf(z));
            }
        };
    }

    public final UserNameFragment getFragment() {
        return this.fragment;
    }

    public final void setFragment(UserNameFragment userNameFragment) {
        this.fragment = userNameFragment;
    }

    public final MutableLiveData<String> getName() {
        return this.name;
    }

    public final String getSavedName() {
        return this.savedName;
    }

    public final void setSavedName(String str) {
        this.savedName = str;
    }

    public final MutableStateFlow<Boolean> isValid() {
        return this.isValid;
    }

    public final void init() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new UserNameViewModel$init$1(this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onUserChanged(User user) {
        if (user == null) {
            return;
        }
        MutableLiveData<String> mutableLiveData = this.name;
        String name = user.getName();
        if (name == null) {
            name = "";
        }
        mutableLiveData.setValue(name);
        this.savedName = this.name.getValue();
    }

    public final TextWatcher getNameChangedWatcher() {
        return this.nameChangedWatcher;
    }

    public final void save(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.isValid.setValue(false);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new UserNameViewModel$save$1(this, null), 3, null);
    }

    public final void back(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.router.getRoute().exit();
    }
}
