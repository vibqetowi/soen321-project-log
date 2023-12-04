package com.ifriend.chat.presentation.ui.menu.userProfile;

import android.view.View;
import androidx.lifecycle.ViewModelKt;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.ifriend.base.navigation.api.RouterProvider;
import com.ifriend.chat.domain.profile.user.DeleteUserUseCase;
import com.ifriend.chat.presentation.ui.menu.botProfile.reset.BotResetScreen;
import com.ifriend.domain.CoroutineDispatchers;
import com.ifriend.domain.models.profile.bot.Bot;
import com.ifriend.domain.useCases.bot.get.GetBotUseCase;
import com.ifriend.icon_switcher.PremiumAppIconManager;
import com.ifriend.presentation.common.observers.appevents.AppEventsEmitter;
import com.ifriend.ui.base.mvvm.BaseViewModel;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
/* compiled from: UserProfileDeleteViewModel.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B7\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019J\u0006\u0010\u001a\u001a\u00020\u0017J\u0006\u0010\u001b\u001a\u00020\u0017R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/ifriend/chat/presentation/ui/menu/userProfile/UserProfileDeleteViewModel;", "Lcom/ifriend/ui/base/mvvm/BaseViewModel;", "Lcom/ifriend/chat/presentation/ui/menu/userProfile/DeleteProfileState;", "deleteUserUseCase", "Lcom/ifriend/chat/domain/profile/user/DeleteUserUseCase;", "premiumAppIconManager", "Lcom/ifriend/icon_switcher/PremiumAppIconManager;", "getBotUseCase", "Lcom/ifriend/domain/useCases/bot/get/GetBotUseCase;", "router", "Lcom/ifriend/base/navigation/api/RouterProvider;", "appEventsEmitter", "Lcom/ifriend/presentation/common/observers/appevents/AppEventsEmitter;", "dispatchers", "Lcom/ifriend/domain/CoroutineDispatchers;", "(Lcom/ifriend/chat/domain/profile/user/DeleteUserUseCase;Lcom/ifriend/icon_switcher/PremiumAppIconManager;Lcom/ifriend/domain/useCases/bot/get/GetBotUseCase;Lcom/ifriend/base/navigation/api/RouterProvider;Lcom/ifriend/presentation/common/observers/appevents/AppEventsEmitter;Lcom/ifriend/domain/CoroutineDispatchers;)V", "fragment", "Lcom/ifriend/chat/presentation/ui/menu/userProfile/UserProfileDeleteFragment;", "getFragment", "()Lcom/ifriend/chat/presentation/ui/menu/userProfile/UserProfileDeleteFragment;", "setFragment", "(Lcom/ifriend/chat/presentation/ui/menu/userProfile/UserProfileDeleteFragment;)V", "back", "", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "deleteAccount", "onClickResetBot", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UserProfileDeleteViewModel extends BaseViewModel<DeleteProfileState> {
    public static final int $stable = 8;
    private final AppEventsEmitter appEventsEmitter;
    private final DeleteUserUseCase deleteUserUseCase;
    private UserProfileDeleteFragment fragment;
    private final GetBotUseCase getBotUseCase;
    private final PremiumAppIconManager premiumAppIconManager;
    private final RouterProvider router;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public UserProfileDeleteViewModel(DeleteUserUseCase deleteUserUseCase, PremiumAppIconManager premiumAppIconManager, GetBotUseCase getBotUseCase, RouterProvider router, AppEventsEmitter appEventsEmitter, CoroutineDispatchers dispatchers) {
        super(dispatchers, new DeleteProfileState(null, 1, null));
        Intrinsics.checkNotNullParameter(deleteUserUseCase, "deleteUserUseCase");
        Intrinsics.checkNotNullParameter(premiumAppIconManager, "premiumAppIconManager");
        Intrinsics.checkNotNullParameter(getBotUseCase, "getBotUseCase");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(appEventsEmitter, "appEventsEmitter");
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        this.deleteUserUseCase = deleteUserUseCase;
        this.premiumAppIconManager = premiumAppIconManager;
        this.getBotUseCase = getBotUseCase;
        this.router = router;
        this.appEventsEmitter = appEventsEmitter;
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(null), 3, null);
    }

    public final UserProfileDeleteFragment getFragment() {
        return this.fragment;
    }

    public final void setFragment(UserProfileDeleteFragment userProfileDeleteFragment) {
        this.fragment = userProfileDeleteFragment;
    }

    /* compiled from: UserProfileDeleteViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.ifriend.chat.presentation.ui.menu.userProfile.UserProfileDeleteViewModel$1", f = "UserProfileDeleteViewModel.kt", i = {}, l = {39, 47}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.ifriend.chat.presentation.ui.menu.userProfile.UserProfileDeleteViewModel$1  reason: invalid class name */
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
                this.label = 1;
                obj = UserProfileDeleteViewModel.this.getBotUseCase.flow(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i != 1) {
                if (i == 2) {
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                ResultKt.throwOnFailure(obj);
            }
            this.label = 2;
            if (FlowKt.collect(FlowKt.onEach((Flow) obj, new C01271(UserProfileDeleteViewModel.this, null)), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: UserProfileDeleteViewModel.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, d2 = {"Lcom/ifriend/domain/models/profile/bot/Bot;", "bot", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.ifriend.chat.presentation.ui.menu.userProfile.UserProfileDeleteViewModel$1$1", f = "UserProfileDeleteViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.ifriend.chat.presentation.ui.menu.userProfile.UserProfileDeleteViewModel$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes6.dex */
        public static final class C01271 extends SuspendLambda implements Function2<Bot, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ UserProfileDeleteViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C01271(UserProfileDeleteViewModel userProfileDeleteViewModel, Continuation<? super C01271> continuation) {
                super(2, continuation);
                this.this$0 = userProfileDeleteViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C01271 c01271 = new C01271(this.this$0, continuation);
                c01271.L$0 = obj;
                return c01271;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Bot bot, Continuation<? super Unit> continuation) {
                return ((C01271) create(bot, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.changeState(new C01281((Bot) this.L$0));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: UserProfileDeleteViewModel.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/chat/presentation/ui/menu/userProfile/DeleteProfileState;", "it", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.ifriend.chat.presentation.ui.menu.userProfile.UserProfileDeleteViewModel$1$1$1  reason: invalid class name and collision with other inner class name */
            /* loaded from: classes6.dex */
            public static final class C01281 extends Lambda implements Function1<DeleteProfileState, DeleteProfileState> {
                final /* synthetic */ Bot $bot;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C01281(Bot bot) {
                    super(1);
                    this.$bot = bot;
                }

                @Override // kotlin.jvm.functions.Function1
                public final DeleteProfileState invoke(DeleteProfileState it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    Bot bot = this.$bot;
                    String name = bot != null ? bot.getName() : null;
                    if (name == null) {
                        name = "";
                    }
                    return it.copy(name);
                }
            }
        }
    }

    public final void back(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.router.getRoute().exit();
    }

    public final void deleteAccount() {
        UserProfileDeleteFragment userProfileDeleteFragment = this.fragment;
        if (userProfileDeleteFragment != null) {
            userProfileDeleteFragment.showLoading();
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new UserProfileDeleteViewModel$deleteAccount$1(this, null), 3, null);
    }

    public final void onClickResetBot() {
        this.router.getRoute().navigateTo(BotResetScreen.INSTANCE);
    }
}
