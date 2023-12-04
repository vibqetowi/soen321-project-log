package com.ifriend.chat.presentation.ui.menu.userProfile;

import android.view.View;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.ifriend.base.navigation.api.RouterProvider;
import com.ifriend.domain.models.profile.Gender;
import com.ifriend.domain.models.profile.user.User;
import com.ifriend.domain.useCases.user.change.ChangeUserGenderUseCase;
import com.ifriend.domain.useCases.user.get.GetUserUseCase;
import javax.inject.Inject;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
/* compiled from: UserGenderViewModel.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u000e\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 J\u0006\u0010!\u001a\u00020\u001eJ\u0006\u0010\"\u001a\u00020\u001eJ\u0006\u0010#\u001a\u00020\u001eJ\u0006\u0010$\u001a\u00020\u001eJ\u0012\u0010%\u001a\u00020\u001e2\b\u0010&\u001a\u0004\u0018\u00010'H\u0002J\u000e\u0010(\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\f¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006)"}, d2 = {"Lcom/ifriend/chat/presentation/ui/menu/userProfile/UserGenderViewModel;", "Landroidx/lifecycle/ViewModel;", "getUserUseCase", "Lcom/ifriend/domain/useCases/user/get/GetUserUseCase;", "changeUserGenderUseCase", "Lcom/ifriend/domain/useCases/user/change/ChangeUserGenderUseCase;", "router", "Lcom/ifriend/base/navigation/api/RouterProvider;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "(Lcom/ifriend/domain/useCases/user/get/GetUserUseCase;Lcom/ifriend/domain/useCases/user/change/ChangeUserGenderUseCase;Lcom/ifriend/base/navigation/api/RouterProvider;Lkotlinx/coroutines/CoroutineScope;)V", "currentGender", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/ifriend/domain/models/profile/Gender;", "getCurrentGender", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "fragment", "Lcom/ifriend/chat/presentation/ui/menu/userProfile/UserGenderFragment;", "getFragment", "()Lcom/ifriend/chat/presentation/ui/menu/userProfile/UserGenderFragment;", "setFragment", "(Lcom/ifriend/chat/presentation/ui/menu/userProfile/UserGenderFragment;)V", "isEdited", "", "savedGender", "getSavedGender", "()Lcom/ifriend/domain/models/profile/Gender;", "setSavedGender", "(Lcom/ifriend/domain/models/profile/Gender;)V", "back", "", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "femaleClick", "init", "maleClick", "nonBinaryClick", "onUserChanged", "user", "Lcom/ifriend/domain/models/profile/user/User;", "save", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UserGenderViewModel extends ViewModel {
    public static final int $stable = 8;
    private final ChangeUserGenderUseCase changeUserGenderUseCase;
    private final MutableStateFlow<Gender> currentGender;
    private UserGenderFragment fragment;
    private final GetUserUseCase getUserUseCase;
    private final MutableStateFlow<Boolean> isEdited;
    private final RouterProvider router;
    private Gender savedGender;

    @Inject
    public UserGenderViewModel(GetUserUseCase getUserUseCase, ChangeUserGenderUseCase changeUserGenderUseCase, RouterProvider router, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(getUserUseCase, "getUserUseCase");
        Intrinsics.checkNotNullParameter(changeUserGenderUseCase, "changeUserGenderUseCase");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.getUserUseCase = getUserUseCase;
        this.changeUserGenderUseCase = changeUserGenderUseCase;
        this.router = router;
        this.currentGender = StateFlowKt.MutableStateFlow(Gender.FEMALE);
        this.isEdited = StateFlowKt.MutableStateFlow(false);
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(null), 3, null);
    }

    public final UserGenderFragment getFragment() {
        return this.fragment;
    }

    public final void setFragment(UserGenderFragment userGenderFragment) {
        this.fragment = userGenderFragment;
    }

    public final MutableStateFlow<Gender> getCurrentGender() {
        return this.currentGender;
    }

    public final Gender getSavedGender() {
        return this.savedGender;
    }

    public final void setSavedGender(Gender gender) {
        this.savedGender = gender;
    }

    public final MutableStateFlow<Boolean> isEdited() {
        return this.isEdited;
    }

    /* compiled from: UserGenderViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.ifriend.chat.presentation.ui.menu.userProfile.UserGenderViewModel$1", f = "UserGenderViewModel.kt", i = {}, l = {32}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.ifriend.chat.presentation.ui.menu.userProfile.UserGenderViewModel$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MutableStateFlow<Gender> currentGender = UserGenderViewModel.this.getCurrentGender();
                final UserGenderViewModel userGenderViewModel = UserGenderViewModel.this;
                this.label = 1;
                if (currentGender.collect(new FlowCollector<Gender>() { // from class: com.ifriend.chat.presentation.ui.menu.userProfile.UserGenderViewModel.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Gender gender, Continuation continuation) {
                        return emit2(gender, (Continuation<? super Unit>) continuation);
                    }

                    /* renamed from: emit  reason: avoid collision after fix types in other method */
                    public final Object emit2(Gender gender, Continuation<? super Unit> continuation) {
                        UserGenderViewModel.this.isEdited().setValue(Boxing.boxBoolean(gender != UserGenderViewModel.this.getSavedGender()));
                        return Unit.INSTANCE;
                    }
                }, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    public final void init() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new UserGenderViewModel$init$1(this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onUserChanged(User user) {
        Gender gender;
        if (user == null || (gender = user.getGender()) == null) {
            gender = Gender.NON_BINARY;
        }
        this.savedGender = gender;
        this.currentGender.tryEmit(gender);
    }

    public final void maleClick() {
        this.currentGender.tryEmit(Gender.MALE);
    }

    public final void femaleClick() {
        this.currentGender.tryEmit(Gender.FEMALE);
    }

    public final void nonBinaryClick() {
        this.currentGender.tryEmit(Gender.NON_BINARY);
    }

    public final void save(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.isEdited.setValue(false);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new UserGenderViewModel$save$1(this, null), 3, null);
    }

    public final void back(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.router.getRoute().exit();
    }
}
