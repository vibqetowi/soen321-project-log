package com.ifriend.presentation.features.home.delegates;

import androidx.lifecycle.ViewModelKt;
import com.ifriend.core.utils.CoroutinesKt;
import com.ifriend.domain.data.deeplinks.DeepLinksRepository;
import com.ifriend.domain.logic.chat.info.ChatsInfoInteractor;
import com.ifriend.domain.logic.chat.models.ChatInfo;
import com.ifriend.presentation.common.observers.appevents.AppEventsEmitter;
import com.ifriend.presentation.common.uistate.UiStateDelegate;
import com.ifriend.presentation.features.home.viewmodel.HomeViewModel;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: HomeHandleDeepLinksDelegate.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0011\u0010\t\u001a\u00020\nH\u0016R\u00020\u000b¢\u0006\u0002\u0010\fJ\u0015\u0010\r\u001a\u00020\n*\u00020\u000bH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u000eR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Lcom/ifriend/presentation/features/home/delegates/HomeHandleDeepLinksDelegateImpl;", "Lcom/ifriend/presentation/features/home/delegates/HomeHandleDeepLinksDelegate;", "deepLinksRepository", "Lcom/ifriend/domain/data/deeplinks/DeepLinksRepository;", "chatsInfoInteractor", "Lcom/ifriend/domain/logic/chat/info/ChatsInfoInteractor;", "appEventsEmitter", "Lcom/ifriend/presentation/common/observers/appevents/AppEventsEmitter;", "(Lcom/ifriend/domain/data/deeplinks/DeepLinksRepository;Lcom/ifriend/domain/logic/chat/info/ChatsInfoInteractor;Lcom/ifriend/presentation/common/observers/appevents/AppEventsEmitter;)V", "handleDeepLinks", "", "Lcom/ifriend/presentation/features/home/viewmodel/HomeViewModel;", "(Lcom/ifriend/presentation/features/home/viewmodel/HomeViewModel;)V", "navigateToDefaultChat", "(Lcom/ifriend/presentation/features/home/viewmodel/HomeViewModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class HomeHandleDeepLinksDelegateImpl implements HomeHandleDeepLinksDelegate {
    public static final int $stable = 8;
    private final AppEventsEmitter appEventsEmitter;
    private final ChatsInfoInteractor chatsInfoInteractor;
    private final DeepLinksRepository deepLinksRepository;

    @Inject
    public HomeHandleDeepLinksDelegateImpl(DeepLinksRepository deepLinksRepository, ChatsInfoInteractor chatsInfoInteractor, AppEventsEmitter appEventsEmitter) {
        Intrinsics.checkNotNullParameter(deepLinksRepository, "deepLinksRepository");
        Intrinsics.checkNotNullParameter(chatsInfoInteractor, "chatsInfoInteractor");
        Intrinsics.checkNotNullParameter(appEventsEmitter, "appEventsEmitter");
        this.deepLinksRepository = deepLinksRepository;
        this.chatsInfoInteractor = chatsInfoInteractor;
        this.appEventsEmitter = appEventsEmitter;
    }

    @Override // com.ifriend.presentation.features.home.delegates.HomeHandleDeepLinksDelegate
    public void handleDeepLinks(HomeViewModel context_receiver_0) {
        Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
        CoroutinesKt.safeLaunch$default(ViewModelKt.getViewModelScope(context_receiver_0), new HomeHandleDeepLinksDelegateImpl$handleDeepLinks$1(null), null, new HomeHandleDeepLinksDelegateImpl$handleDeepLinks$2(this, context_receiver_0, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object navigateToDefaultChat(HomeViewModel homeViewModel, Continuation<? super Unit> continuation) {
        HomeHandleDeepLinksDelegateImpl$navigateToDefaultChat$1 homeHandleDeepLinksDelegateImpl$navigateToDefaultChat$1;
        int i;
        ChatInfo chatInfo;
        if (continuation instanceof HomeHandleDeepLinksDelegateImpl$navigateToDefaultChat$1) {
            homeHandleDeepLinksDelegateImpl$navigateToDefaultChat$1 = (HomeHandleDeepLinksDelegateImpl$navigateToDefaultChat$1) continuation;
            if ((homeHandleDeepLinksDelegateImpl$navigateToDefaultChat$1.label & Integer.MIN_VALUE) != 0) {
                homeHandleDeepLinksDelegateImpl$navigateToDefaultChat$1.label -= Integer.MIN_VALUE;
                Object obj = homeHandleDeepLinksDelegateImpl$navigateToDefaultChat$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = homeHandleDeepLinksDelegateImpl$navigateToDefaultChat$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    ChatsInfoInteractor chatsInfoInteractor = this.chatsInfoInteractor;
                    homeHandleDeepLinksDelegateImpl$navigateToDefaultChat$1.L$0 = homeViewModel;
                    homeHandleDeepLinksDelegateImpl$navigateToDefaultChat$1.label = 1;
                    obj = chatsInfoInteractor.getDefaultChatInfo(homeHandleDeepLinksDelegateImpl$navigateToDefaultChat$1);
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
                    homeViewModel = (HomeViewModel) homeHandleDeepLinksDelegateImpl$navigateToDefaultChat$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                chatInfo = (ChatInfo) obj;
                if (chatInfo != null) {
                    return Unit.INSTANCE;
                }
                homeHandleDeepLinksDelegateImpl$navigateToDefaultChat$1.L$0 = null;
                homeHandleDeepLinksDelegateImpl$navigateToDefaultChat$1.label = 2;
                if (homeViewModel.sendEvent2((UiStateDelegate<HomeViewModel.UiState, HomeViewModel.Event>) homeViewModel, (HomeViewModel.Event) new HomeViewModel.Event.GoToChat(chatInfo.getChatId()), (Continuation<? super Unit>) homeHandleDeepLinksDelegateImpl$navigateToDefaultChat$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
        }
        homeHandleDeepLinksDelegateImpl$navigateToDefaultChat$1 = new HomeHandleDeepLinksDelegateImpl$navigateToDefaultChat$1(this, continuation);
        Object obj2 = homeHandleDeepLinksDelegateImpl$navigateToDefaultChat$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = homeHandleDeepLinksDelegateImpl$navigateToDefaultChat$1.label;
        if (i != 0) {
        }
        chatInfo = (ChatInfo) obj2;
        if (chatInfo != null) {
        }
    }
}
