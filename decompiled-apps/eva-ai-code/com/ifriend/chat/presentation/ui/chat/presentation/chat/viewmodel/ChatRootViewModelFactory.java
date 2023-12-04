package com.ifriend.chat.presentation.ui.chat.presentation.chat.viewmodel;

import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.facebook.bolts.AppLinks;
import com.ifriend.analytics.api.logic.AnalyticsInteractor;
import com.ifriend.analytics.usecase.chat.ChatScreenAnalyticsUseCase;
import com.ifriend.analytics.usecase.notifications.AnalyticsNotificationPermissionChangedUseCase;
import com.ifriend.analytics.usecase.rateUs.AnalyticsRateUsModalUseCase;
import com.ifriend.base.di.UserSessionSharedPreferences;
import com.ifriend.chat.domain.firebase.ClearBadgesUseCase;
import com.ifriend.chat.domain.firebase.FirebaseSubscribeUseCase;
import com.ifriend.common_utils.Logger;
import com.ifriend.core.tools.api.DispatcherProvider;
import com.ifriend.domain.data.Preferences;
import com.ifriend.domain.data.authorization.confirmEmail.SendConfirmationEmailUseCase;
import com.ifriend.domain.logic.chat.ChatClientInteractor;
import com.ifriend.domain.logic.chat.info.ChatsInfoInteractor;
import com.ifriend.domain.rateUs.OnUserRatedAppUseCase;
import com.ifriend.presentation.common.observers.FlowObserver;
import com.ifriend.presentation.common.observers.appevents.AppEventsEmitter;
import com.ifriend.presentation.features.chat.actions.ChatPaidActionsDelegateImpl;
import com.ifriend.presentation.features.chat.background.delegate.ChatBackgroundDelegateImpl;
import com.ifriend.presentation.features.chat.common.ChatEvents;
import com.ifriend.presentation.features.chat.configuration.ChatConfigurationDelegate;
import com.ifriend.presentation.features.chat.deeplinks.ChatHandleDeepLinksDelegateImpl;
import com.ifriend.presentation.features.chat.gifts.delegate.ChatGiftsDelegateImpl;
import com.ifriend.presentation.features.chat.input.analytics.VoiceRecordingAnalytics;
import com.ifriend.presentation.features.chat.input.delegate.ChatInputDelegateImpl;
import com.ifriend.presentation.features.chat.intro.delegate.ChatIntroDelegateImpl;
import com.ifriend.presentation.features.chat.message.ChatMessageDelegate;
import com.ifriend.presentation.features.chat.notifications.delegate.ChatNotificationsDelegateImpl;
import com.ifriend.presentation.features.chat.offers.ChatSubscriptionOfferDelegateImpl;
import com.ifriend.presentation.features.chat.panel.delegate.ChatPanelActionsDelegateImpl;
import com.ifriend.presentation.features.chat.photo.delegate.ChatPhotoDelegate;
import com.ifriend.presentation.features.chat.photo.delegate.ChatPhotoDelegateImpl;
import com.ifriend.presentation.features.chat.screen.viewmodel.ChatViewModel;
import com.ifriend.presentation.features.chat.sextingmessage.SextingMessagePaywallShowingDelegateImpl;
import com.ifriend.presentation.features.profile.actions.ChatProfileActionDelegateImpl;
import com.ifriend.presentation.features.profile.header.delegate.ChatHeaderDelegateImpl;
import com.ifriend.presentation.features.profile.menu.delegate.ProfileMenuDelegateImpl;
import com.ifriend.ui.base.modalMessage.RateAppPopupDelegate;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ChatRootViewModelFactory.kt */
@Metadata(d1 = {"\u0000ò\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B \u0002\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\b\u0001\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\u0006\u0010\u001c\u001a\u00020\u001d\u0012\u0006\u0010\u001e\u001a\u00020\u001f\u0012\u0006\u0010 \u001a\u00020!\u0012\u0006\u0010\"\u001a\u00020#\u0012\u0006\u0010$\u001a\u00020%\u0012\u0006\u0010&\u001a\u00020'\u0012\u0015\u0010(\u001a\u0011\u0012\t\u0012\u00070*¢\u0006\u0002\b+0)j\u0002`,\u0012\u0006\u0010-\u001a\u00020.\u0012\u0006\u0010/\u001a\u000200\u0012\u0006\u00101\u001a\u000202\u0012\u0006\u00103\u001a\u000204\u0012\u0006\u00105\u001a\u000206\u0012\u0006\u00107\u001a\u000208\u0012\u0006\u00109\u001a\u00020:\u0012\u0006\u0010;\u001a\u00020<\u0012\u0006\u0010=\u001a\u00020>\u0012\u0006\u0010?\u001a\u00020@\u0012\u0006\u0010A\u001a\u00020B\u0012\u0006\u0010C\u001a\u00020D\u0012\u0006\u0010E\u001a\u00020F¢\u0006\u0002\u0010GJ-\u0010J\u001a\u0002HK\"\b\b\u0000\u0010K*\u00020L2\f\u0010M\u001a\b\u0012\u0004\u0012\u0002HK0N2\u0006\u0010O\u001a\u00020PH\u0016¢\u0006\u0002\u0010QR\u000e\u0010?\u001a\u00020@X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020.X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020<X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010A\u001a\u00020BX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010(\u001a\u0011\u0012\t\u0012\u00070*¢\u0006\u0002\b+0)j\u0002`,X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00107\u001a\u000208X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u000202X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010E\u001a\u00020FX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u000200X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010C\u001a\u00020DX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u000204X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010=\u001a\u00020>X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020'X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\bH\u0010IR\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u000206X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020:X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006R"}, d2 = {"Lcom/ifriend/chat/presentation/ui/chat/presentation/chat/viewmodel/ChatRootViewModelFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "chatGiftsDelegate", "Lcom/ifriend/presentation/features/chat/gifts/delegate/ChatGiftsDelegateImpl;", "chatHandleDeepLinksDelegate", "Lcom/ifriend/presentation/features/chat/deeplinks/ChatHandleDeepLinksDelegateImpl;", "chatsInfoInteractor", "Lcom/ifriend/domain/logic/chat/info/ChatsInfoInteractor;", "onUserRateUsUseCase", "Lcom/ifriend/domain/rateUs/OnUserRatedAppUseCase;", "firebaseSubscribeUseCase", "Lcom/ifriend/chat/domain/firebase/FirebaseSubscribeUseCase;", "clearBadgesUseCase", "Lcom/ifriend/chat/domain/firebase/ClearBadgesUseCase;", "preferences", "Lcom/ifriend/domain/data/Preferences;", "analyticsNotificationPermissionChangedUseCase", "Lcom/ifriend/analytics/usecase/notifications/AnalyticsNotificationPermissionChangedUseCase;", "sendConfirmationEmailUseCase", "Lcom/ifriend/domain/data/authorization/confirmEmail/SendConfirmationEmailUseCase;", "rateAppPopupDelegate", "Lcom/ifriend/ui/base/modalMessage/RateAppPopupDelegate;", "analyticsRateUsUseCase", "Lcom/ifriend/analytics/usecase/rateUs/AnalyticsRateUsModalUseCase;", "logger", "Lcom/ifriend/common_utils/Logger;", "chatNotificationsDelegate", "Lcom/ifriend/presentation/features/chat/notifications/delegate/ChatNotificationsDelegateImpl;", "appEventsEmitter", "Lcom/ifriend/presentation/common/observers/appevents/AppEventsEmitter;", "profileMenuDelegate", "Lcom/ifriend/presentation/features/profile/menu/delegate/ProfileMenuDelegateImpl;", "chatBackgroundDelegate", "Lcom/ifriend/presentation/features/chat/background/delegate/ChatBackgroundDelegateImpl;", "chatHeaderDelegate", "Lcom/ifriend/presentation/features/profile/header/delegate/ChatHeaderDelegateImpl;", "chatScreenAnalyticsUseCase", "Lcom/ifriend/analytics/usecase/chat/ChatScreenAnalyticsUseCase;", "photoDelegate", "Lcom/ifriend/presentation/features/chat/photo/delegate/ChatPhotoDelegate$Factory;", "chatEventsFlow", "Lcom/ifriend/presentation/common/observers/FlowObserver;", "Lcom/ifriend/presentation/features/chat/common/ChatEvents;", "Lkotlin/jvm/JvmSuppressWildcards;", "Lcom/ifriend/presentation/features/chat/common/ChatEventsFlow;", "chatActionsDelegate", "Lcom/ifriend/presentation/features/chat/actions/ChatPaidActionsDelegateImpl;", "chatProfileActionDelegate", "Lcom/ifriend/presentation/features/profile/actions/ChatProfileActionDelegateImpl;", "chatIntroDelegate", "Lcom/ifriend/presentation/features/chat/intro/delegate/ChatIntroDelegateImpl;", "chatTopicActionsDelegate", "Lcom/ifriend/presentation/features/chat/panel/delegate/ChatPanelActionsDelegateImpl;", "sextingMessagePaywallShowingDelegate", "Lcom/ifriend/presentation/features/chat/sextingmessage/SextingMessagePaywallShowingDelegateImpl;", "chatInputDelegate", "Lcom/ifriend/presentation/features/chat/input/delegate/ChatInputDelegateImpl;", "voiceRecordingAnalytics", "Lcom/ifriend/presentation/features/chat/input/analytics/VoiceRecordingAnalytics;", "chatClientInteractor", "Lcom/ifriend/domain/logic/chat/ChatClientInteractor;", "dispatchers", "Lcom/ifriend/core/tools/api/DispatcherProvider;", "analyticsInteractor", "Lcom/ifriend/analytics/api/logic/AnalyticsInteractor;", "chatConfigurationDelegate", "Lcom/ifriend/presentation/features/chat/configuration/ChatConfigurationDelegate$Factory;", "chatSubscriptionOfferDelegate", "Lcom/ifriend/presentation/features/chat/offers/ChatSubscriptionOfferDelegateImpl;", "chatMessageDelegate", "Lcom/ifriend/presentation/features/chat/message/ChatMessageDelegate$Factory;", "(Lcom/ifriend/presentation/features/chat/gifts/delegate/ChatGiftsDelegateImpl;Lcom/ifriend/presentation/features/chat/deeplinks/ChatHandleDeepLinksDelegateImpl;Lcom/ifriend/domain/logic/chat/info/ChatsInfoInteractor;Lcom/ifriend/domain/rateUs/OnUserRatedAppUseCase;Lcom/ifriend/chat/domain/firebase/FirebaseSubscribeUseCase;Lcom/ifriend/chat/domain/firebase/ClearBadgesUseCase;Lcom/ifriend/domain/data/Preferences;Lcom/ifriend/analytics/usecase/notifications/AnalyticsNotificationPermissionChangedUseCase;Lcom/ifriend/domain/data/authorization/confirmEmail/SendConfirmationEmailUseCase;Lcom/ifriend/ui/base/modalMessage/RateAppPopupDelegate;Lcom/ifriend/analytics/usecase/rateUs/AnalyticsRateUsModalUseCase;Lcom/ifriend/common_utils/Logger;Lcom/ifriend/presentation/features/chat/notifications/delegate/ChatNotificationsDelegateImpl;Lcom/ifriend/presentation/common/observers/appevents/AppEventsEmitter;Lcom/ifriend/presentation/features/profile/menu/delegate/ProfileMenuDelegateImpl;Lcom/ifriend/presentation/features/chat/background/delegate/ChatBackgroundDelegateImpl;Lcom/ifriend/presentation/features/profile/header/delegate/ChatHeaderDelegateImpl;Lcom/ifriend/analytics/usecase/chat/ChatScreenAnalyticsUseCase;Lcom/ifriend/presentation/features/chat/photo/delegate/ChatPhotoDelegate$Factory;Lcom/ifriend/presentation/common/observers/FlowObserver;Lcom/ifriend/presentation/features/chat/actions/ChatPaidActionsDelegateImpl;Lcom/ifriend/presentation/features/profile/actions/ChatProfileActionDelegateImpl;Lcom/ifriend/presentation/features/chat/intro/delegate/ChatIntroDelegateImpl;Lcom/ifriend/presentation/features/chat/panel/delegate/ChatPanelActionsDelegateImpl;Lcom/ifriend/presentation/features/chat/sextingmessage/SextingMessagePaywallShowingDelegateImpl;Lcom/ifriend/presentation/features/chat/input/delegate/ChatInputDelegateImpl;Lcom/ifriend/presentation/features/chat/input/analytics/VoiceRecordingAnalytics;Lcom/ifriend/domain/logic/chat/ChatClientInteractor;Lcom/ifriend/core/tools/api/DispatcherProvider;Lcom/ifriend/analytics/api/logic/AnalyticsInteractor;Lcom/ifriend/presentation/features/chat/configuration/ChatConfigurationDelegate$Factory;Lcom/ifriend/presentation/features/chat/offers/ChatSubscriptionOfferDelegateImpl;Lcom/ifriend/presentation/features/chat/message/ChatMessageDelegate$Factory;)V", "getPreferences", "()Lcom/ifriend/domain/data/Preferences;", "create", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", AppLinks.KEY_NAME_EXTRAS, "Landroidx/lifecycle/viewmodel/CreationExtras;", "(Ljava/lang/Class;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/ViewModel;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatRootViewModelFactory implements ViewModelProvider.Factory {
    public static final int $stable = 8;
    private final AnalyticsInteractor analyticsInteractor;
    private final AnalyticsNotificationPermissionChangedUseCase analyticsNotificationPermissionChangedUseCase;
    private final AnalyticsRateUsModalUseCase analyticsRateUsUseCase;
    private final AppEventsEmitter appEventsEmitter;
    private final ChatPaidActionsDelegateImpl chatActionsDelegate;
    private final ChatBackgroundDelegateImpl chatBackgroundDelegate;
    private final ChatClientInteractor chatClientInteractor;
    private final ChatConfigurationDelegate.Factory chatConfigurationDelegate;
    private final FlowObserver<ChatEvents> chatEventsFlow;
    private final ChatGiftsDelegateImpl chatGiftsDelegate;
    private final ChatHandleDeepLinksDelegateImpl chatHandleDeepLinksDelegate;
    private final ChatHeaderDelegateImpl chatHeaderDelegate;
    private final ChatInputDelegateImpl chatInputDelegate;
    private final ChatIntroDelegateImpl chatIntroDelegate;
    private final ChatMessageDelegate.Factory chatMessageDelegate;
    private final ChatNotificationsDelegateImpl chatNotificationsDelegate;
    private final ChatProfileActionDelegateImpl chatProfileActionDelegate;
    private final ChatScreenAnalyticsUseCase chatScreenAnalyticsUseCase;
    private final ChatSubscriptionOfferDelegateImpl chatSubscriptionOfferDelegate;
    private final ChatPanelActionsDelegateImpl chatTopicActionsDelegate;
    private final ChatsInfoInteractor chatsInfoInteractor;
    private final ClearBadgesUseCase clearBadgesUseCase;
    private final DispatcherProvider dispatchers;
    private final FirebaseSubscribeUseCase firebaseSubscribeUseCase;
    private final Logger logger;
    private final OnUserRatedAppUseCase onUserRateUsUseCase;
    private final ChatPhotoDelegate.Factory photoDelegate;
    private final Preferences preferences;
    private final ProfileMenuDelegateImpl profileMenuDelegate;
    private final RateAppPopupDelegate rateAppPopupDelegate;
    private final SendConfirmationEmailUseCase sendConfirmationEmailUseCase;
    private final SextingMessagePaywallShowingDelegateImpl sextingMessagePaywallShowingDelegate;
    private final VoiceRecordingAnalytics voiceRecordingAnalytics;

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public /* synthetic */ ViewModel create(Class cls) {
        return ViewModelProvider.Factory.CC.$default$create(this, cls);
    }

    @Inject
    public ChatRootViewModelFactory(ChatGiftsDelegateImpl chatGiftsDelegate, ChatHandleDeepLinksDelegateImpl chatHandleDeepLinksDelegate, ChatsInfoInteractor chatsInfoInteractor, OnUserRatedAppUseCase onUserRateUsUseCase, FirebaseSubscribeUseCase firebaseSubscribeUseCase, ClearBadgesUseCase clearBadgesUseCase, @UserSessionSharedPreferences Preferences preferences, AnalyticsNotificationPermissionChangedUseCase analyticsNotificationPermissionChangedUseCase, SendConfirmationEmailUseCase sendConfirmationEmailUseCase, RateAppPopupDelegate rateAppPopupDelegate, AnalyticsRateUsModalUseCase analyticsRateUsUseCase, Logger logger, ChatNotificationsDelegateImpl chatNotificationsDelegate, AppEventsEmitter appEventsEmitter, ProfileMenuDelegateImpl profileMenuDelegate, ChatBackgroundDelegateImpl chatBackgroundDelegate, ChatHeaderDelegateImpl chatHeaderDelegate, ChatScreenAnalyticsUseCase chatScreenAnalyticsUseCase, ChatPhotoDelegate.Factory photoDelegate, FlowObserver<ChatEvents> chatEventsFlow, ChatPaidActionsDelegateImpl chatActionsDelegate, ChatProfileActionDelegateImpl chatProfileActionDelegate, ChatIntroDelegateImpl chatIntroDelegate, ChatPanelActionsDelegateImpl chatTopicActionsDelegate, SextingMessagePaywallShowingDelegateImpl sextingMessagePaywallShowingDelegate, ChatInputDelegateImpl chatInputDelegate, VoiceRecordingAnalytics voiceRecordingAnalytics, ChatClientInteractor chatClientInteractor, DispatcherProvider dispatchers, AnalyticsInteractor analyticsInteractor, ChatConfigurationDelegate.Factory chatConfigurationDelegate, ChatSubscriptionOfferDelegateImpl chatSubscriptionOfferDelegate, ChatMessageDelegate.Factory chatMessageDelegate) {
        Intrinsics.checkNotNullParameter(chatGiftsDelegate, "chatGiftsDelegate");
        Intrinsics.checkNotNullParameter(chatHandleDeepLinksDelegate, "chatHandleDeepLinksDelegate");
        Intrinsics.checkNotNullParameter(chatsInfoInteractor, "chatsInfoInteractor");
        Intrinsics.checkNotNullParameter(onUserRateUsUseCase, "onUserRateUsUseCase");
        Intrinsics.checkNotNullParameter(firebaseSubscribeUseCase, "firebaseSubscribeUseCase");
        Intrinsics.checkNotNullParameter(clearBadgesUseCase, "clearBadgesUseCase");
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        Intrinsics.checkNotNullParameter(analyticsNotificationPermissionChangedUseCase, "analyticsNotificationPermissionChangedUseCase");
        Intrinsics.checkNotNullParameter(sendConfirmationEmailUseCase, "sendConfirmationEmailUseCase");
        Intrinsics.checkNotNullParameter(rateAppPopupDelegate, "rateAppPopupDelegate");
        Intrinsics.checkNotNullParameter(analyticsRateUsUseCase, "analyticsRateUsUseCase");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(chatNotificationsDelegate, "chatNotificationsDelegate");
        Intrinsics.checkNotNullParameter(appEventsEmitter, "appEventsEmitter");
        Intrinsics.checkNotNullParameter(profileMenuDelegate, "profileMenuDelegate");
        Intrinsics.checkNotNullParameter(chatBackgroundDelegate, "chatBackgroundDelegate");
        Intrinsics.checkNotNullParameter(chatHeaderDelegate, "chatHeaderDelegate");
        Intrinsics.checkNotNullParameter(chatScreenAnalyticsUseCase, "chatScreenAnalyticsUseCase");
        Intrinsics.checkNotNullParameter(photoDelegate, "photoDelegate");
        Intrinsics.checkNotNullParameter(chatEventsFlow, "chatEventsFlow");
        Intrinsics.checkNotNullParameter(chatActionsDelegate, "chatActionsDelegate");
        Intrinsics.checkNotNullParameter(chatProfileActionDelegate, "chatProfileActionDelegate");
        Intrinsics.checkNotNullParameter(chatIntroDelegate, "chatIntroDelegate");
        Intrinsics.checkNotNullParameter(chatTopicActionsDelegate, "chatTopicActionsDelegate");
        Intrinsics.checkNotNullParameter(sextingMessagePaywallShowingDelegate, "sextingMessagePaywallShowingDelegate");
        Intrinsics.checkNotNullParameter(chatInputDelegate, "chatInputDelegate");
        Intrinsics.checkNotNullParameter(voiceRecordingAnalytics, "voiceRecordingAnalytics");
        Intrinsics.checkNotNullParameter(chatClientInteractor, "chatClientInteractor");
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        Intrinsics.checkNotNullParameter(analyticsInteractor, "analyticsInteractor");
        Intrinsics.checkNotNullParameter(chatConfigurationDelegate, "chatConfigurationDelegate");
        Intrinsics.checkNotNullParameter(chatSubscriptionOfferDelegate, "chatSubscriptionOfferDelegate");
        Intrinsics.checkNotNullParameter(chatMessageDelegate, "chatMessageDelegate");
        this.chatGiftsDelegate = chatGiftsDelegate;
        this.chatHandleDeepLinksDelegate = chatHandleDeepLinksDelegate;
        this.chatsInfoInteractor = chatsInfoInteractor;
        this.onUserRateUsUseCase = onUserRateUsUseCase;
        this.firebaseSubscribeUseCase = firebaseSubscribeUseCase;
        this.clearBadgesUseCase = clearBadgesUseCase;
        this.preferences = preferences;
        this.analyticsNotificationPermissionChangedUseCase = analyticsNotificationPermissionChangedUseCase;
        this.sendConfirmationEmailUseCase = sendConfirmationEmailUseCase;
        this.rateAppPopupDelegate = rateAppPopupDelegate;
        this.analyticsRateUsUseCase = analyticsRateUsUseCase;
        this.logger = logger;
        this.chatNotificationsDelegate = chatNotificationsDelegate;
        this.appEventsEmitter = appEventsEmitter;
        this.profileMenuDelegate = profileMenuDelegate;
        this.chatBackgroundDelegate = chatBackgroundDelegate;
        this.chatHeaderDelegate = chatHeaderDelegate;
        this.chatScreenAnalyticsUseCase = chatScreenAnalyticsUseCase;
        this.photoDelegate = photoDelegate;
        this.chatEventsFlow = chatEventsFlow;
        this.chatActionsDelegate = chatActionsDelegate;
        this.chatProfileActionDelegate = chatProfileActionDelegate;
        this.chatIntroDelegate = chatIntroDelegate;
        this.chatTopicActionsDelegate = chatTopicActionsDelegate;
        this.sextingMessagePaywallShowingDelegate = sextingMessagePaywallShowingDelegate;
        this.chatInputDelegate = chatInputDelegate;
        this.voiceRecordingAnalytics = voiceRecordingAnalytics;
        this.chatClientInteractor = chatClientInteractor;
        this.dispatchers = dispatchers;
        this.analyticsInteractor = analyticsInteractor;
        this.chatConfigurationDelegate = chatConfigurationDelegate;
        this.chatSubscriptionOfferDelegate = chatSubscriptionOfferDelegate;
        this.chatMessageDelegate = chatMessageDelegate;
    }

    public final Preferences getPreferences() {
        return this.preferences;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public <T extends ViewModel> T create(Class<T> modelClass, CreationExtras extras) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        if (!Intrinsics.areEqual(modelClass, ChatViewModel.class)) {
            throw new IllegalStateException("This factory cannot create " + modelClass);
        }
        String str = (String) SavedStateHandleSupport.createSavedStateHandle(extras).get("chat_id");
        if (str == null) {
            str = "";
        }
        String str2 = str;
        ChatGiftsDelegateImpl chatGiftsDelegateImpl = this.chatGiftsDelegate;
        ChatHandleDeepLinksDelegateImpl chatHandleDeepLinksDelegateImpl = this.chatHandleDeepLinksDelegate;
        OnUserRatedAppUseCase onUserRatedAppUseCase = this.onUserRateUsUseCase;
        FirebaseSubscribeUseCase firebaseSubscribeUseCase = this.firebaseSubscribeUseCase;
        ClearBadgesUseCase clearBadgesUseCase = this.clearBadgesUseCase;
        ChatPhotoDelegateImpl create = this.photoDelegate.create(str2);
        Preferences preferences = this.preferences;
        AnalyticsNotificationPermissionChangedUseCase analyticsNotificationPermissionChangedUseCase = this.analyticsNotificationPermissionChangedUseCase;
        SendConfirmationEmailUseCase sendConfirmationEmailUseCase = this.sendConfirmationEmailUseCase;
        RateAppPopupDelegate rateAppPopupDelegate = this.rateAppPopupDelegate;
        AnalyticsRateUsModalUseCase analyticsRateUsModalUseCase = this.analyticsRateUsUseCase;
        Logger logger = this.logger;
        ChatNotificationsDelegateImpl chatNotificationsDelegateImpl = this.chatNotificationsDelegate;
        AppEventsEmitter appEventsEmitter = this.appEventsEmitter;
        ProfileMenuDelegateImpl profileMenuDelegateImpl = this.profileMenuDelegate;
        ChatsInfoInteractor chatsInfoInteractor = this.chatsInfoInteractor;
        ChatBackgroundDelegateImpl chatBackgroundDelegateImpl = this.chatBackgroundDelegate;
        ChatHeaderDelegateImpl chatHeaderDelegateImpl = this.chatHeaderDelegate;
        FlowObserver<ChatEvents> flowObserver = this.chatEventsFlow;
        ChatPaidActionsDelegateImpl chatPaidActionsDelegateImpl = this.chatActionsDelegate;
        ChatProfileActionDelegateImpl chatProfileActionDelegateImpl = this.chatProfileActionDelegate;
        ChatScreenAnalyticsUseCase chatScreenAnalyticsUseCase = this.chatScreenAnalyticsUseCase;
        ChatIntroDelegateImpl chatIntroDelegateImpl = this.chatIntroDelegate;
        ChatPanelActionsDelegateImpl chatPanelActionsDelegateImpl = this.chatTopicActionsDelegate;
        SextingMessagePaywallShowingDelegateImpl sextingMessagePaywallShowingDelegateImpl = this.sextingMessagePaywallShowingDelegate;
        ChatInputDelegateImpl chatInputDelegateImpl = this.chatInputDelegate;
        VoiceRecordingAnalytics voiceRecordingAnalytics = this.voiceRecordingAnalytics;
        return new ChatViewModel(str2, onUserRatedAppUseCase, firebaseSubscribeUseCase, clearBadgesUseCase, preferences, analyticsNotificationPermissionChangedUseCase, sendConfirmationEmailUseCase, analyticsRateUsModalUseCase, logger, appEventsEmitter, chatsInfoInteractor, chatScreenAnalyticsUseCase, this.chatClientInteractor, this.dispatchers, voiceRecordingAnalytics, this.analyticsInteractor, flowObserver, rateAppPopupDelegate, chatGiftsDelegateImpl, chatHandleDeepLinksDelegateImpl, chatBackgroundDelegateImpl, profileMenuDelegateImpl, chatNotificationsDelegateImpl, chatHeaderDelegateImpl, chatPaidActionsDelegateImpl, chatProfileActionDelegateImpl, chatIntroDelegateImpl, chatPanelActionsDelegateImpl, sextingMessagePaywallShowingDelegateImpl, chatInputDelegateImpl, create, this.chatConfigurationDelegate.create(str2), this.chatSubscriptionOfferDelegate, this.chatMessageDelegate.create(str2));
    }
}
