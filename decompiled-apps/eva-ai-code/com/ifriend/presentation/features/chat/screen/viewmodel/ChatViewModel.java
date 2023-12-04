package com.ifriend.presentation.features.chat.screen.viewmodel;

import android.app.NotificationChannel;
import android.content.Context;
import android.os.Build;
import androidx.compose.ui.graphics.Color;
import androidx.core.app.FrameMetricsAggregator;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.facebook.internal.NativeProtocol;
import com.ifriend.analytics.api.logic.AnalyticsInteractor;
import com.ifriend.analytics.usecase.chat.ChatScreenAnalyticsUseCase;
import com.ifriend.analytics.usecase.notifications.AnalyticsNotificationPermissionChangedUseCase;
import com.ifriend.analytics.usecase.purchase.PurchaseSource;
import com.ifriend.analytics.usecase.rateUs.AnalyticsRateUsModalUseCase;
import com.ifriend.animatedBackground.AnimatedBackgroundView;
import com.ifriend.base.di.UserSessionSharedPreferences;
import com.ifriend.chat.domain.firebase.ClearBadgesUseCase;
import com.ifriend.chat.domain.firebase.FirebaseSubscribeUseCase;
import com.ifriend.common_utils.Constants;
import com.ifriend.common_utils.Logger;
import com.ifriend.core.tools.api.DispatcherProvider;
import com.ifriend.domain.data.Preferences;
import com.ifriend.domain.data.authorization.confirmEmail.SendConfirmationEmailUseCase;
import com.ifriend.domain.logic.chat.ChatClientInteractor;
import com.ifriend.domain.logic.chat.info.ChatsInfoInteractor;
import com.ifriend.domain.logic.chat.models.ChatInfo;
import com.ifriend.domain.models.chat.notifications.ChatNotification;
import com.ifriend.domain.rateUs.OnUserRatedAppUseCase;
import com.ifriend.keychain.KeychainModule;
import com.ifriend.presentation.common.ActionDispatcher;
import com.ifriend.presentation.common.observers.FlowObserver;
import com.ifriend.presentation.common.observers.appevents.AppEvents;
import com.ifriend.presentation.common.observers.appevents.AppEventsEmitter;
import com.ifriend.presentation.common.observers.appevents.params.BuyChatSubscriptionBillingUiParams;
import com.ifriend.presentation.common.uistate.UiStateDelegate;
import com.ifriend.presentation.common.uistate.UiStateDelegateImpl;
import com.ifriend.presentation.features.chat.actions.ChatAction;
import com.ifriend.presentation.features.chat.actions.ChatPaidActionsDelegate;
import com.ifriend.presentation.features.chat.actions.delegate.ChatPanelActionsEvent;
import com.ifriend.presentation.features.chat.background.delegate.ChatBackgroundDelegate;
import com.ifriend.presentation.features.chat.common.ChatEvents;
import com.ifriend.presentation.features.chat.configuration.ChatConfigurationDelegate;
import com.ifriend.presentation.features.chat.deeplinks.ChatHandleDeepLinksDelegate;
import com.ifriend.presentation.features.chat.gifts.delegate.ChatGiftsDelegate;
import com.ifriend.presentation.features.chat.gifts.model.ChatGiftUi;
import com.ifriend.presentation.features.chat.gifts.model.ChatGiftsUiState;
import com.ifriend.presentation.features.chat.input.analytics.VoiceRecordingAnalytics;
import com.ifriend.presentation.features.chat.input.delegate.ChatInputDelegate;
import com.ifriend.presentation.features.chat.input.model.ChatInputState;
import com.ifriend.presentation.features.chat.intro.delegate.ChatIntroDelegate;
import com.ifriend.presentation.features.chat.intro.model.ChatIntroUiState;
import com.ifriend.presentation.features.chat.message.ChatMessageDelegate;
import com.ifriend.presentation.features.chat.notifications.delegate.ChatNotificationsDelegate;
import com.ifriend.presentation.features.chat.notifications.model.ChatNotificationUi;
import com.ifriend.presentation.features.chat.offers.ChatSubscriptionOfferDelegate;
import com.ifriend.presentation.features.chat.panel.delegate.ChatPanelActionsDelegate;
import com.ifriend.presentation.features.chat.panel.models.ChatPanelActionMarker;
import com.ifriend.presentation.features.chat.panel.models.ChatTopicsUiState;
import com.ifriend.presentation.features.chat.photo.delegate.ChatPhotoDelegate;
import com.ifriend.presentation.features.chat.photo.ui.ChatPhotoUiState;
import com.ifriend.presentation.features.chat.sextingmessage.SextingMessagePaywallShowingDelegate;
import com.ifriend.presentation.features.profile.actions.ChatProfileActionDelegate;
import com.ifriend.presentation.features.profile.header.delegate.ChatHeaderDelegate;
import com.ifriend.presentation.features.profile.header.model.ChatHeaderUiState;
import com.ifriend.presentation.features.profile.menu.delegate.ProfileMenuDelegate;
import com.ifriend.presentation.features.profile.menu.model.ProfileMenuUiState;
import com.ifriend.presentation.features.purchases.billing.models.PurchaseReason;
import com.ifriend.presentation.features.purchases.common.model.UpgradeType;
import com.ifriend.ui.base.modalMessage.RateAppPopupDelegate;
import com.ifriend.ui.utils.UIUtils$$ExternalSyntheticApiModelOutline0;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.collections.immutable.PersistentList;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;
/* compiled from: ChatViewModel.kt */
@Metadata(d1 = {"\u0000\u0092\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u00042\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u00020\b2\u00020\t2\u00020\n2\u00020\u000b2\u00020\f2\u00020\r2\u00020\u000e2\u00020\u000f2\u00020\u00102\u00020\u00112\u00020\u00122\u00020\u00132\u00020\u00142\u00020\u00152\u00020\u0016:\u0004ì\u0001í\u0001B¦\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\u0006\u0010\u0019\u001a\u00020\u001a\u0012\u0006\u0010\u001b\u001a\u00020\u001c\u0012\u0006\u0010\u001d\u001a\u00020\u001e\u0012\b\b\u0001\u0010\u001f\u001a\u00020 \u0012\u0006\u0010!\u001a\u00020\"\u0012\u0006\u0010#\u001a\u00020$\u0012\u0006\u0010%\u001a\u00020&\u0012\u0006\u0010'\u001a\u00020(\u0012\u0006\u0010)\u001a\u00020*\u0012\u0006\u0010+\u001a\u00020,\u0012\u0006\u0010-\u001a\u00020.\u0012\u0006\u0010/\u001a\u000200\u0012\u0006\u00101\u001a\u000202\u0012\u0006\u00103\u001a\u000204\u0012\u0006\u00105\u001a\u000206\u0012\u0015\u00107\u001a\u0011\u0012\t\u0012\u000709¢\u0006\u0002\b:08j\u0002`;\u0012\u0006\u0010<\u001a\u00020=\u0012\u0006\u0010>\u001a\u00020\f\u0012\u0006\u0010?\u001a\u00020\u000b\u0012\u0006\u0010@\u001a\u00020\n\u0012\u0006\u0010A\u001a\u00020\t\u0012\u0006\u0010B\u001a\u00020\b\u0012\u0006\u0010C\u001a\u00020\u0010\u0012\u0006\u0010D\u001a\u00020\r\u0012\u0006\u0010E\u001a\u00020\u000e\u0012\u0006\u0010F\u001a\u00020\u0011\u0012\u0006\u0010G\u001a\u00020\u0014\u0012\u0006\u0010H\u001a\u00020\u0013\u0012\u0006\u0010I\u001a\u00020\u0015\u0012\u0006\u0010J\u001a\u00020\u000f\u0012\u0006\u0010K\u001a\u00020\u0012\u0012\u0006\u0010L\u001a\u00020\u0016\u0012\u0006\u0010M\u001a\u00020\u0004¢\u0006\u0002\u0010NJ\u0010\u0010z\u001a\u00020{2\u0006\u0010|\u001a\u00020}H\u0002J\u001c\u0010~\u001a\u00020\u007f2\u0007\u0010\u0080\u0001\u001a\u00020\u0018H\u0096\u0001R\u00020\u0001¢\u0006\u0003\u0010\u0081\u0001J\u0014\u0010\u0082\u0001\u001a\u00020\u007fH\u0096\u0001R\u00020\u0000¢\u0006\u0003\u0010\u0083\u0001J\u0014\u0010\u0084\u0001\u001a\u00020\u007fH\u0096\u0001R\u00020\u0000¢\u0006\u0003\u0010\u0083\u0001J&\u0010\u0085\u0001\u001a\u00020\u007f2\b\u0010\u0086\u0001\u001a\u00030\u0087\u00012\u0006\u0010\u0017\u001a\u00020\u0018H\u0096\u0001R\u00020\u0001¢\u0006\u0003\u0010\u0088\u0001J\u0014\u0010\u0089\u0001\u001a\u00020\u007fH\u0096\u0001R\u00020\u0001¢\u0006\u0003\u0010\u008a\u0001J\u0011\u0010\u008b\u0001\u001a\u00020\u007f2\u0006\u0010|\u001a\u00020}H\u0002J\t\u0010\u008c\u0001\u001a\u00020\u007fH\u0002J\u0014\u0010\u008d\u0001\u001a\u00020\u007fH\u0096\u0001R\u00020\u0001¢\u0006\u0003\u0010\u008a\u0001J\u0014\u0010\u008e\u0001\u001a\u00020\u007fH\u0096\u0001R\u00020\u0001¢\u0006\u0003\u0010\u008a\u0001J\u0014\u0010\u008f\u0001\u001a\u00020\u007fH\u0096\u0001R\u00020\u0001¢\u0006\u0003\u0010\u008a\u0001J\u0014\u0010\u0090\u0001\u001a\u00020\u007fH\u0096\u0001R\u00020\u0001¢\u0006\u0003\u0010\u008a\u0001J\u0012\u0010\u0091\u0001\u001a\u00020\u007f2\u0007\u0010\u0086\u0001\u001a\u00020\u0003H\u0016J&\u0010\u0092\u0001\u001a\u00020\u007f2\b\u0010\u0086\u0001\u001a\u00030\u0093\u00012\u0006\u0010\u0017\u001a\u00020\u0018H\u0096\u0001R\u00020\u0000¢\u0006\u0003\u0010\u0094\u0001J\n\u0010\u0095\u0001\u001a\u00020\u007fH\u0096\u0001J&\u0010\u0096\u0001\u001a\u00020\u007f2\b\u0010\u0097\u0001\u001a\u00030\u0098\u00012\u0006\u0010\u0017\u001a\u00020\u0018H\u0096\u0001R\u00020\u0001¢\u0006\u0003\u0010\u0099\u0001J\u001c\u0010\u009a\u0001\u001a\u00020\u007f2\u0006\u0010\u0017\u001a\u00020\u0018H\u0096\u0001R\u00020\u0001¢\u0006\u0003\u0010\u0081\u0001J\u0014\u0010\u009b\u0001\u001a\u00020\u007fH\u0096\u0001R\u00020\u0001¢\u0006\u0003\u0010\u008a\u0001J\u001c\u0010\u009c\u0001\u001a\u00020\u007f2\u0006\u0010\u0017\u001a\u00020\u0018H\u0096\u0001R\u00020\u0000¢\u0006\u0003\u0010\u009d\u0001J\u001d\u0010\u009e\u0001\u001a\u00020\u007f2\u0007\u0010\u009f\u0001\u001a\u00020_H\u0096\u0001R\u00020\u0001¢\u0006\u0003\u0010 \u0001J\n\u0010¡\u0001\u001a\u00020\u007fH\u0096\u0001J\u001c\u0010¢\u0001\u001a\u00020\u007f2\u0006\u0010\u0017\u001a\u00020\u0018H\u0096\u0001R\u00020\u0000¢\u0006\u0003\u0010\u009d\u0001J\u0014\u0010£\u0001\u001a\u00020\u007fH\u0096\u0001R\u00020\u0000¢\u0006\u0003\u0010\u0083\u0001J\u001c\u0010¤\u0001\u001a\u00020\u007f2\u0006\u0010\u0017\u001a\u00020\u0018H\u0096\u0001R\u00020\u0001¢\u0006\u0003\u0010\u0081\u0001J\u001c\u0010¥\u0001\u001a\u00020\u007f2\u0006\u0010\u0017\u001a\u00020\u0018H\u0096\u0001R\u00020\u0001¢\u0006\u0003\u0010\u0081\u0001J\u001c\u0010¦\u0001\u001a\u00020\u007f2\u0006\u0010\u0017\u001a\u00020\u0018H\u0096\u0001R\u00020\u0001¢\u0006\u0003\u0010\u0081\u0001J\u001c\u0010§\u0001\u001a\u00020\u007f2\u0006\u0010\u0017\u001a\u00020\u0018H\u0096\u0001R\u00020\u0001¢\u0006\u0003\u0010\u0081\u0001J\u0014\u0010¨\u0001\u001a\u00020\u007fH\u0096\u0001R\u00020\u0000¢\u0006\u0003\u0010\u0083\u0001J\u001c\u0010©\u0001\u001a\u00020\u007f2\u0006\u0010\u0017\u001a\u00020\u0018H\u0096\u0001R\u00020\u0000¢\u0006\u0003\u0010\u009d\u0001J\u001c\u0010ª\u0001\u001a\u00020\u007f2\u0006\u0010\u0017\u001a\u00020\u0018H\u0096\u0001R\u00020\u0001¢\u0006\u0003\u0010\u0081\u0001J\u0014\u0010«\u0001\u001a\u00020\u007fH\u0096\u0001R\u00020\u0001¢\u0006\u0003\u0010\u008a\u0001JE\u0010¬\u0001\u001a\u00020\u007f2\n\b\u0002\u0010\u00ad\u0001\u001a\u00030®\u00012\n\b\u0002\u0010¯\u0001\u001a\u00030°\u00012\u0017\b\u0002\u0010±\u0001\u001a\u0010\u0012\u0005\u0012\u00030³\u0001\u0012\u0004\u0012\u00020{0²\u0001H\u0096\u0001R\u00020\u0001¢\u0006\u0003\u0010´\u0001J\t\u0010µ\u0001\u001a\u00020\u007fH\u0002J \u0010¶\u0001\u001a\u00020\u007f2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0096\u0001R\u00020\u0001¢\u0006\u0003\u0010\u0081\u0001J\u001c\u0010·\u0001\u001a\u00020\u007f2\u0006\u0010\u0017\u001a\u00020\u0018H\u0096\u0001R\u00020\u0001¢\u0006\u0003\u0010\u0081\u0001J\u0011\u0010¸\u0001\u001a\u00020\u007f2\b\u0010¹\u0001\u001a\u00030º\u0001J\u0007\u0010»\u0001\u001a\u00020\u007fJ\u0007\u0010¼\u0001\u001a\u00020\u007fJ\u0007\u0010½\u0001\u001a\u00020\u007fJ\t\u0010¾\u0001\u001a\u00020\u007fH\u0002J\u0007\u0010¿\u0001\u001a\u00020\u007fJ\u0007\u0010À\u0001\u001a\u00020\u007fJ\u0007\u0010Á\u0001\u001a\u00020\u007fJ\u0007\u0010Â\u0001\u001a\u00020\u007fJ\u0007\u0010Ã\u0001\u001a\u00020\u007fJ\u0007\u0010Ä\u0001\u001a\u00020\u007fJ\u0007\u0010Å\u0001\u001a\u00020\u007fJ\u0010\u0010Æ\u0001\u001a\u00020\u007f2\u0007\u0010\u0080\u0001\u001a\u00020\u0018J\u0010\u0010Ç\u0001\u001a\u00020\u007f2\u0007\u0010È\u0001\u001a\u00020_J\u0010\u0010É\u0001\u001a\u00020\u007f2\u0007\u0010È\u0001\u001a\u00020_J\u0007\u0010Ê\u0001\u001a\u00020\u007fJ\u0007\u0010Ë\u0001\u001a\u00020\u007fJ\u0007\u0010Ì\u0001\u001a\u00020\u007fJ\u000f\u0010Í\u0001\u001a\u00020\u007f2\u0006\u0010|\u001a\u00020}J\u0007\u0010Î\u0001\u001a\u00020\u007fJ\u0007\u0010Ï\u0001\u001a\u00020\u007fJ\u0014\u0010Ð\u0001\u001a\u00020\u007fH\u0096\u0001R\u00020\u0001¢\u0006\u0003\u0010\u008a\u0001J\u001d\u0010Ñ\u0001\u001a\u00020\u007f2\u0007\u0010Ò\u0001\u001a\u00020{H\u0096\u0001R\u00020\u0001¢\u0006\u0003\u0010Ó\u0001J\u001d\u0010Ô\u0001\u001a\u00020\u007f2\u0007\u0010Õ\u0001\u001a\u00020\u0018H\u0096\u0001R\u00020\u0001¢\u0006\u0003\u0010\u0081\u0001J\u0014\u0010Ö\u0001\u001a\u00020\u007fH\u0096\u0001R\u00020\u0001¢\u0006\u0003\u0010\u008a\u0001J\u0014\u0010×\u0001\u001a\u00020\u007fH\u0096\u0001R\u00020\u0001¢\u0006\u0003\u0010\u008a\u0001J\u001d\u0010Ø\u0001\u001a\u00020\u007f2\u0007\u0010Õ\u0001\u001a\u00020\u0018H\u0096\u0001R\u00020\u0001¢\u0006\u0003\u0010\u0081\u0001J\n\u0010Ù\u0001\u001a\u00020\u007fH\u0096\u0001J\u0014\u0010Ú\u0001\u001a\u00020\u007fH\u0096\u0001R\u00020\u0001¢\u0006\u0003\u0010\u008a\u0001J\u001d\u0010Û\u0001\u001a\u00020\u007f2\u0007\u0010Ü\u0001\u001a\u00020{H\u0096\u0001R\u00020\u0001¢\u0006\u0003\u0010Ó\u0001J7\u0010Ý\u0001\u001a\u00020\u007f*\u00030Þ\u00012&\u0010\u0086\u0001\u001a!\u0012\u0016\u0012\u00140\u0006¢\u0006\u000f\bß\u0001\u0012\n\bà\u0001\u0012\u0005\b\b(á\u0001\u0012\u0004\u0012\u00020\u00060²\u0001H\u0097\u0001JM\u0010â\u0001\u001a\u00030ã\u0001*\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\b\u0010ä\u0001\u001a\u00030Þ\u00012&\u0010å\u0001\u001a!\u0012\u0016\u0012\u00140\u0006¢\u0006\u000f\bß\u0001\u0012\n\bà\u0001\u0012\u0005\b\b(á\u0001\u0012\u0004\u0012\u00020\u00060²\u0001H\u0096\u0001JK\u0010æ\u0001\u001a\u00020\u007f*\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052&\u0010\u0086\u0001\u001a!\u0012\u0016\u0012\u00140\u0006¢\u0006\u000f\bß\u0001\u0012\n\bà\u0001\u0012\u0005\b\b(á\u0001\u0012\u0004\u0012\u00020\u00060²\u0001H\u0097Aø\u0001\u0000¢\u0006\u0003\u0010ç\u0001J,\u0010è\u0001\u001a\u00020\u007f*\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u0007\u0010é\u0001\u001a\u00020\u0007H\u0096Aø\u0001\u0000¢\u0006\u0003\u0010ê\u0001JJ\u0010ë\u0001\u001a\u00020\u007f*\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052%\u0010å\u0001\u001a \u0012\u0015\u0012\u00130\u0006¢\u0006\u000e\bß\u0001\u0012\t\bà\u0001\u0012\u0004\b\b(w\u0012\u0004\u0012\u00020\u00060²\u0001H\u0096Aø\u0001\u0000¢\u0006\u0003\u0010ç\u0001R\u000e\u00105\u001a\u000206X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020&X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020*X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u000200X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010O\u001a\b\u0012\u0004\u0012\u00020Q0PX\u0096\u0005¢\u0006\u0006\u001a\u0004\bR\u0010SR\u0018\u0010T\u001a\b\u0012\u0004\u0012\u00020U0PX\u0096\u0005¢\u0006\u0006\u001a\u0004\bV\u0010SR\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010W\u001a\b\u0012\u0004\u0012\u00020X0PX\u0096\u0005¢\u0006\u0006\u001a\u0004\bY\u0010SR\u0018\u0010Z\u001a\b\u0012\u0004\u0012\u00020[0PX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\\\u0010SR\u001e\u0010]\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020_0^0PX\u0096\u0005¢\u0006\u0006\u001a\u0004\b`\u0010SR\u000e\u0010-\u001a\u00020.X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020,X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010a\u001a\u00020bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u000202X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020(X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010c\u001a\b\u0012\u0004\u0012\u00020e0dX\u0096\u0005¢\u0006\u0006\u001a\u0004\bf\u0010gR\u0018\u0010h\u001a\b\u0012\u0004\u0012\u00020i0PX\u0096\u0005¢\u0006\u0006\u001a\u0004\bj\u0010SR\u0018\u0010k\u001a\b\u0012\u0004\u0012\u00020l0PX\u0096\u0005¢\u0006\u0006\u001a\u0004\bm\u0010SR\u0011\u0010\u001f\u001a\u00020 ¢\u0006\b\n\u0000\u001a\u0004\bn\u0010oR\u0018\u0010p\u001a\b\u0012\u0004\u0012\u00020q0PX\u0096\u0005¢\u0006\u0006\u001a\u0004\br\u0010SR\u000e\u0010#\u001a\u00020$X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010s\u001a\b\u0012\u0004\u0012\u00020\u00070dX\u0096\u0005¢\u0006\u0006\u001a\u0004\bt\u0010gR\u0018\u0010u\u001a\b\u0012\u0004\u0012\u00020\u00060PX\u0096\u0005¢\u0006\u0006\u001a\u0004\bv\u0010SR\u000e\u00103\u001a\u000204X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010w\u001a\u00020\u0006*\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0096\u0005¢\u0006\u0006\u001a\u0004\bx\u0010y\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006î\u0001"}, d2 = {"Lcom/ifriend/presentation/features/chat/screen/viewmodel/ChatViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/ifriend/presentation/common/ActionDispatcher;", "Lcom/ifriend/presentation/features/chat/actions/ChatAction;", "Lcom/ifriend/presentation/features/chat/message/ChatMessageDelegate;", "Lcom/ifriend/presentation/common/uistate/UiStateDelegate;", "Lcom/ifriend/presentation/features/chat/screen/viewmodel/ChatViewModel$UiState;", "Lcom/ifriend/presentation/features/chat/screen/viewmodel/ChatViewModel$Event;", "Lcom/ifriend/presentation/features/chat/notifications/delegate/ChatNotificationsDelegate;", "Lcom/ifriend/presentation/features/profile/menu/delegate/ProfileMenuDelegate;", "Lcom/ifriend/presentation/features/chat/background/delegate/ChatBackgroundDelegate;", "Lcom/ifriend/presentation/features/chat/deeplinks/ChatHandleDeepLinksDelegate;", "Lcom/ifriend/presentation/features/chat/gifts/delegate/ChatGiftsDelegate;", "Lcom/ifriend/presentation/features/chat/actions/ChatPaidActionsDelegate;", "Lcom/ifriend/presentation/features/profile/actions/ChatProfileActionDelegate;", "Lcom/ifriend/presentation/features/chat/photo/delegate/ChatPhotoDelegate;", "Lcom/ifriend/presentation/features/profile/header/delegate/ChatHeaderDelegate;", "Lcom/ifriend/presentation/features/chat/intro/delegate/ChatIntroDelegate;", "Lcom/ifriend/presentation/features/chat/configuration/ChatConfigurationDelegate;", "Lcom/ifriend/presentation/features/chat/sextingmessage/SextingMessagePaywallShowingDelegate;", "Lcom/ifriend/presentation/features/chat/panel/delegate/ChatPanelActionsDelegate;", "Lcom/ifriend/presentation/features/chat/input/delegate/ChatInputDelegate;", "Lcom/ifriend/presentation/features/chat/offers/ChatSubscriptionOfferDelegate;", "chatId", "", "onUserRateUsUseCase", "Lcom/ifriend/domain/rateUs/OnUserRatedAppUseCase;", "firebaseSubscribeUseCase", "Lcom/ifriend/chat/domain/firebase/FirebaseSubscribeUseCase;", "clearBadgesUseCase", "Lcom/ifriend/chat/domain/firebase/ClearBadgesUseCase;", "preferences", "Lcom/ifriend/domain/data/Preferences;", "analyticsNotificationPermissionChangedUseCase", "Lcom/ifriend/analytics/usecase/notifications/AnalyticsNotificationPermissionChangedUseCase;", "sendConfirmationEmailUseCase", "Lcom/ifriend/domain/data/authorization/confirmEmail/SendConfirmationEmailUseCase;", "analyticsRateUsUseCase", "Lcom/ifriend/analytics/usecase/rateUs/AnalyticsRateUsModalUseCase;", "logger", "Lcom/ifriend/common_utils/Logger;", "appEventsEmitter", "Lcom/ifriend/presentation/common/observers/appevents/AppEventsEmitter;", "chatsInfoInteractor", "Lcom/ifriend/domain/logic/chat/info/ChatsInfoInteractor;", "chatScreenAnalyticsUseCase", "Lcom/ifriend/analytics/usecase/chat/ChatScreenAnalyticsUseCase;", "chatClientInteractor", "Lcom/ifriend/domain/logic/chat/ChatClientInteractor;", "dispatchers", "Lcom/ifriend/core/tools/api/DispatcherProvider;", "voiceRecordingAnalytics", "Lcom/ifriend/presentation/features/chat/input/analytics/VoiceRecordingAnalytics;", "analyticsInteractor", "Lcom/ifriend/analytics/api/logic/AnalyticsInteractor;", "chatEventsFlow", "Lcom/ifriend/presentation/common/observers/FlowObserver;", "Lcom/ifriend/presentation/features/chat/common/ChatEvents;", "Lkotlin/jvm/JvmSuppressWildcards;", "Lcom/ifriend/presentation/features/chat/common/ChatEventsFlow;", "rateAppPopupDelegate", "Lcom/ifriend/ui/base/modalMessage/RateAppPopupDelegate;", "chatGiftsDelegate", "chatHandleDeepLinksDelegate", "chatBackgroundDelegate", "profileMenuDelegate", "chatNotificationsDelegate", "chatHeaderDelegate", "chatPaidActionsDelegate", "chatProfileActionDelegate", "chatIntroDelegate", "chatPanelActionsDelegate", "sextingMessagePaywallShowingDelegate", "chatInputDelegate", "photoDelegate", "chatConfigurationDelegate", "chatSubscriptionOfferDelegate", "chatMessageDelegate", "(Ljava/lang/String;Lcom/ifriend/domain/rateUs/OnUserRatedAppUseCase;Lcom/ifriend/chat/domain/firebase/FirebaseSubscribeUseCase;Lcom/ifriend/chat/domain/firebase/ClearBadgesUseCase;Lcom/ifriend/domain/data/Preferences;Lcom/ifriend/analytics/usecase/notifications/AnalyticsNotificationPermissionChangedUseCase;Lcom/ifriend/domain/data/authorization/confirmEmail/SendConfirmationEmailUseCase;Lcom/ifriend/analytics/usecase/rateUs/AnalyticsRateUsModalUseCase;Lcom/ifriend/common_utils/Logger;Lcom/ifriend/presentation/common/observers/appevents/AppEventsEmitter;Lcom/ifriend/domain/logic/chat/info/ChatsInfoInteractor;Lcom/ifriend/analytics/usecase/chat/ChatScreenAnalyticsUseCase;Lcom/ifriend/domain/logic/chat/ChatClientInteractor;Lcom/ifriend/core/tools/api/DispatcherProvider;Lcom/ifriend/presentation/features/chat/input/analytics/VoiceRecordingAnalytics;Lcom/ifriend/analytics/api/logic/AnalyticsInteractor;Lcom/ifriend/presentation/common/observers/FlowObserver;Lcom/ifriend/ui/base/modalMessage/RateAppPopupDelegate;Lcom/ifriend/presentation/features/chat/gifts/delegate/ChatGiftsDelegate;Lcom/ifriend/presentation/features/chat/deeplinks/ChatHandleDeepLinksDelegate;Lcom/ifriend/presentation/features/chat/background/delegate/ChatBackgroundDelegate;Lcom/ifriend/presentation/features/profile/menu/delegate/ProfileMenuDelegate;Lcom/ifriend/presentation/features/chat/notifications/delegate/ChatNotificationsDelegate;Lcom/ifriend/presentation/features/profile/header/delegate/ChatHeaderDelegate;Lcom/ifriend/presentation/features/chat/actions/ChatPaidActionsDelegate;Lcom/ifriend/presentation/features/profile/actions/ChatProfileActionDelegate;Lcom/ifriend/presentation/features/chat/intro/delegate/ChatIntroDelegate;Lcom/ifriend/presentation/features/chat/panel/delegate/ChatPanelActionsDelegate;Lcom/ifriend/presentation/features/chat/sextingmessage/SextingMessagePaywallShowingDelegate;Lcom/ifriend/presentation/features/chat/input/delegate/ChatInputDelegate;Lcom/ifriend/presentation/features/chat/photo/delegate/ChatPhotoDelegate;Lcom/ifriend/presentation/features/chat/configuration/ChatConfigurationDelegate;Lcom/ifriend/presentation/features/chat/offers/ChatSubscriptionOfferDelegate;Lcom/ifriend/presentation/features/chat/message/ChatMessageDelegate;)V", "chatGiftsUiState", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/ifriend/presentation/features/chat/gifts/model/ChatGiftsUiState;", "getChatGiftsUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "chatHeaderState", "Lcom/ifriend/presentation/features/profile/header/model/ChatHeaderUiState;", "getChatHeaderState", "chatInputState", "Lcom/ifriend/presentation/features/chat/input/model/ChatInputState;", "getChatInputState", "chatIntroState", "Lcom/ifriend/presentation/features/chat/intro/model/ChatIntroUiState;", "getChatIntroState", "chatNotifications", "Lkotlinx/collections/immutable/PersistentList;", "Lcom/ifriend/presentation/features/chat/notifications/model/ChatNotificationUi;", "getChatNotifications", "coroutineErrorHandler", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "panelActionsEvents", "Lkotlinx/coroutines/flow/Flow;", "Lcom/ifriend/presentation/features/chat/actions/delegate/ChatPanelActionsEvent;", "getPanelActionsEvents", "()Lkotlinx/coroutines/flow/Flow;", "panelActionsState", "Lcom/ifriend/presentation/features/chat/panel/models/ChatTopicsUiState;", "getPanelActionsState", "photoModalState", "Lcom/ifriend/presentation/features/chat/photo/ui/ChatPhotoUiState;", "getPhotoModalState", "getPreferences", "()Lcom/ifriend/domain/data/Preferences;", "profileMenuState", "Lcom/ifriend/presentation/features/profile/menu/model/ProfileMenuUiState;", "getProfileMenuState", "singleEvents", "getSingleEvents", "uiStateFlow", "getUiStateFlow", "uiState", "getUiState", "(Lcom/ifriend/presentation/common/uistate/UiStateDelegate;)Lcom/ifriend/presentation/features/chat/screen/viewmodel/ChatViewModel$UiState;", "areNotificationsEnabled", "", "context", "Landroid/content/Context;", "changeInputMessage", "", "new", "(Landroidx/lifecycle/ViewModel;Ljava/lang/String;)V", "chatAvatarClick", "(Lcom/ifriend/presentation/features/chat/screen/viewmodel/ChatViewModel;)V", "chatNameClick", "chatTopicClick", NativeProtocol.WEB_DIALOG_ACTION, "Lcom/ifriend/presentation/features/chat/panel/models/ChatPanelActionMarker;", "(Landroidx/lifecycle/ViewModel;Lcom/ifriend/presentation/features/chat/panel/models/ChatPanelActionMarker;Ljava/lang/String;)V", "checkIfNeedShowSubscriptionOffer", "(Landroidx/lifecycle/ViewModel;)V", "checkNotificationPermission", "clearBadges", "clearChatInputDelegate", "clearInputMessage", "closeChatIntro", "dismissPhotoModalPopup", "dispatchAction", "dispatchPaidAction", "Lcom/ifriend/presentation/features/chat/actions/ChatAction$PaidAction;", "(Lcom/ifriend/presentation/features/chat/screen/viewmodel/ChatViewModel;Lcom/ifriend/presentation/features/chat/actions/ChatAction$PaidAction;Ljava/lang/String;)V", "disposeNotificationsObserver", "giftClick", "gift", "Lcom/ifriend/presentation/features/chat/gifts/model/ChatGiftUi;", "(Landroidx/lifecycle/ViewModel;Lcom/ifriend/presentation/features/chat/gifts/model/ChatGiftUi;Ljava/lang/String;)V", "giftsClick", "giftsCloseClick", "handleDeepLinks", "(Lcom/ifriend/presentation/features/chat/screen/viewmodel/ChatViewModel;Ljava/lang/String;)V", "hideNotification", "item", "(Landroidx/lifecycle/ViewModel;Lcom/ifriend/presentation/features/chat/notifications/model/ChatNotificationUi;)V", "hideProfileMenu", "initChatBackground", "initChatConfiguration", "initChatGifts", "initChatHeader", "initChatInputDelegate", "initChatIntroDelegate", "initChatMessageDelegate", "initChatPaidActions", "initChatPanelActions", "initChatPhotoDelegate", "initNotificationsObserver", "notificationsLimit", "", "hideDelay", "", "notificationsFilter", "Lkotlin/Function1;", "Lcom/ifriend/domain/models/chat/notifications/ChatNotification;", "(Landroidx/lifecycle/ViewModel;IJLkotlin/jvm/functions/Function1;)V", "initObservers", "initProfileMenuDelegate", "initSextingMessagePaywall", "logFocusRequesterThrowable", "throwable", "", "onAddNeuronsClick", "onAudioPermissionGranted", "onBackClick", "onBackPressed", "onChatAvatarClick", "onChatIntroCloseClick", "onChatIntroContinueClick", "onChatNameClick", "onClearMessageClicked", "onDestroy", "onDismissPhotoModalPopup", "onMessageChanged", "onNotificationClick", "notification", "onNotificationDismissed", "onOpenMenuClick", "onRecordAudioPressed", "onResume", "onStart", "onStop", "onUpgradeClick", "remindButtonClicked", "remindPermissionGranted", "granted", "(Landroidx/lifecycle/ViewModel;Z)V", "requestTextMessageAccess", "messageId", "sendInputMessage", "showNextChatIntroCard", "showPhoto", "showProfileMenu", "startAudioRecording", "stopRecordAudio", KeychainModule.AuthPromptOptions.CANCEL, "asyncReduce", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/ParameterName;", "name", "state", "asyncUpdateUiState", "Lkotlinx/coroutines/Job;", "coroutineScope", "transform", "reduce", "(Lcom/ifriend/presentation/common/uistate/UiStateDelegate;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendEvent", NotificationCompat.CATEGORY_EVENT, "(Lcom/ifriend/presentation/common/uistate/UiStateDelegate;Lcom/ifriend/presentation/features/chat/screen/viewmodel/ChatViewModel$Event;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateUiState", "Event", "UiState", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatViewModel extends ViewModel implements ActionDispatcher<ChatAction>, ChatMessageDelegate, UiStateDelegate<UiState, Event>, ChatNotificationsDelegate, ProfileMenuDelegate, ChatBackgroundDelegate, ChatHandleDeepLinksDelegate, ChatGiftsDelegate, ChatPaidActionsDelegate, ChatProfileActionDelegate, ChatPhotoDelegate, ChatHeaderDelegate, ChatIntroDelegate, ChatConfigurationDelegate, SextingMessagePaywallShowingDelegate, ChatPanelActionsDelegate, ChatInputDelegate, ChatSubscriptionOfferDelegate {
    public static final int $stable = 8;
    private final /* synthetic */ ChatMessageDelegate $$delegate_0;
    private final /* synthetic */ UiStateDelegateImpl<UiState, Event> $$delegate_1;
    private final /* synthetic */ ChatHeaderDelegate $$delegate_10;
    private final /* synthetic */ ChatIntroDelegate $$delegate_11;
    private final /* synthetic */ ChatConfigurationDelegate $$delegate_12;
    private final /* synthetic */ SextingMessagePaywallShowingDelegate $$delegate_13;
    private final /* synthetic */ ChatPanelActionsDelegate $$delegate_14;
    private final /* synthetic */ ChatInputDelegate $$delegate_15;
    private final /* synthetic */ ChatSubscriptionOfferDelegate $$delegate_16;
    private final /* synthetic */ ChatNotificationsDelegate $$delegate_2;
    private final /* synthetic */ ProfileMenuDelegate $$delegate_3;
    private final /* synthetic */ ChatBackgroundDelegate $$delegate_4;
    private final /* synthetic */ ChatHandleDeepLinksDelegate $$delegate_5;
    private final /* synthetic */ ChatGiftsDelegate $$delegate_6;
    private final /* synthetic */ ChatPaidActionsDelegate $$delegate_7;
    private final /* synthetic */ ChatProfileActionDelegate $$delegate_8;
    private final /* synthetic */ ChatPhotoDelegate $$delegate_9;
    private final AnalyticsInteractor analyticsInteractor;
    private final AnalyticsNotificationPermissionChangedUseCase analyticsNotificationPermissionChangedUseCase;
    private final AnalyticsRateUsModalUseCase analyticsRateUsUseCase;
    private final AppEventsEmitter appEventsEmitter;
    private final ChatClientInteractor chatClientInteractor;
    private final String chatId;
    private final ChatScreenAnalyticsUseCase chatScreenAnalyticsUseCase;
    private final ChatsInfoInteractor chatsInfoInteractor;
    private final ClearBadgesUseCase clearBadgesUseCase;
    private final CoroutineExceptionHandler coroutineErrorHandler;
    private final DispatcherProvider dispatchers;
    private final FirebaseSubscribeUseCase firebaseSubscribeUseCase;
    private final Logger logger;
    private final OnUserRatedAppUseCase onUserRateUsUseCase;
    private final Preferences preferences;
    private final SendConfirmationEmailUseCase sendConfirmationEmailUseCase;
    private final VoiceRecordingAnalytics voiceRecordingAnalytics;

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    @Deprecated(message = "use method UiStateDelegate<UiState, Event>.asyncUpdateInternalState")
    public void asyncReduce(CoroutineScope coroutineScope, Function1<? super UiState, ? extends UiState> action) {
        Intrinsics.checkNotNullParameter(coroutineScope, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        this.$$delegate_1.asyncReduce(coroutineScope, action);
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    public Job asyncUpdateUiState(UiStateDelegate<UiState, Event> uiStateDelegate, CoroutineScope coroutineScope, Function1<? super UiState, ? extends UiState> transform) {
        Intrinsics.checkNotNullParameter(uiStateDelegate, "<this>");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return this.$$delegate_1.asyncUpdateUiState(uiStateDelegate, coroutineScope, transform);
    }

    @Override // com.ifriend.presentation.features.chat.input.delegate.ChatInputDelegate
    public void changeInputMessage(ViewModel context_receiver_0, String str) {
        Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
        Intrinsics.checkNotNullParameter(str, "new");
        this.$$delegate_15.changeInputMessage(context_receiver_0, str);
    }

    @Override // com.ifriend.presentation.features.profile.actions.ChatProfileActionDelegate
    public void chatAvatarClick(ChatViewModel context_receiver_0) {
        Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
        this.$$delegate_8.chatAvatarClick(context_receiver_0);
    }

    @Override // com.ifriend.presentation.features.profile.actions.ChatProfileActionDelegate
    public void chatNameClick(ChatViewModel context_receiver_0) {
        Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
        this.$$delegate_8.chatNameClick(context_receiver_0);
    }

    @Override // com.ifriend.presentation.features.chat.panel.delegate.ChatPanelActionsDelegate
    public void chatTopicClick(ViewModel context_receiver_0, ChatPanelActionMarker action, String chatId) {
        Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        this.$$delegate_14.chatTopicClick(context_receiver_0, action, chatId);
    }

    @Override // com.ifriend.presentation.features.chat.offers.ChatSubscriptionOfferDelegate
    public void checkIfNeedShowSubscriptionOffer(ViewModel context_receiver_0) {
        Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
        this.$$delegate_16.checkIfNeedShowSubscriptionOffer(context_receiver_0);
    }

    @Override // com.ifriend.presentation.features.chat.input.delegate.ChatInputDelegate
    public void clearChatInputDelegate(ViewModel context_receiver_0) {
        Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
        this.$$delegate_15.clearChatInputDelegate(context_receiver_0);
    }

    @Override // com.ifriend.presentation.features.chat.input.delegate.ChatInputDelegate
    public void clearInputMessage(ViewModel context_receiver_0) {
        Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
        this.$$delegate_15.clearInputMessage(context_receiver_0);
    }

    @Override // com.ifriend.presentation.features.chat.intro.delegate.ChatIntroDelegate
    public void closeChatIntro(ViewModel context_receiver_0) {
        Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
        this.$$delegate_11.closeChatIntro(context_receiver_0);
    }

    @Override // com.ifriend.presentation.features.chat.photo.delegate.ChatPhotoDelegate
    public void dismissPhotoModalPopup(ViewModel context_receiver_0) {
        Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
        this.$$delegate_9.dismissPhotoModalPopup(context_receiver_0);
    }

    @Override // com.ifriend.presentation.features.chat.actions.ChatPaidActionsDelegate
    public void dispatchPaidAction(ChatViewModel context_receiver_0, ChatAction.PaidAction action, String chatId) {
        Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        this.$$delegate_7.dispatchPaidAction(context_receiver_0, action, chatId);
    }

    @Override // com.ifriend.presentation.features.chat.notifications.delegate.ChatNotificationsDelegate
    public void disposeNotificationsObserver() {
        this.$$delegate_2.disposeNotificationsObserver();
    }

    @Override // com.ifriend.presentation.features.chat.gifts.delegate.ChatGiftsDelegate
    public StateFlow<ChatGiftsUiState> getChatGiftsUiState() {
        return this.$$delegate_6.getChatGiftsUiState();
    }

    @Override // com.ifriend.presentation.features.profile.header.delegate.ChatHeaderDelegate
    public StateFlow<ChatHeaderUiState> getChatHeaderState() {
        return this.$$delegate_10.getChatHeaderState();
    }

    @Override // com.ifriend.presentation.features.chat.input.delegate.ChatInputDelegate
    public StateFlow<ChatInputState> getChatInputState() {
        return this.$$delegate_15.getChatInputState();
    }

    @Override // com.ifriend.presentation.features.chat.intro.delegate.ChatIntroDelegate
    public StateFlow<ChatIntroUiState> getChatIntroState() {
        return this.$$delegate_11.getChatIntroState();
    }

    @Override // com.ifriend.presentation.features.chat.notifications.delegate.ChatNotificationsDelegate
    public StateFlow<PersistentList<ChatNotificationUi>> getChatNotifications() {
        return this.$$delegate_2.getChatNotifications();
    }

    @Override // com.ifriend.presentation.features.chat.panel.delegate.ChatPanelActionsDelegate
    public Flow<ChatPanelActionsEvent> getPanelActionsEvents() {
        return this.$$delegate_14.getPanelActionsEvents();
    }

    @Override // com.ifriend.presentation.features.chat.panel.delegate.ChatPanelActionsDelegate
    public StateFlow<ChatTopicsUiState> getPanelActionsState() {
        return this.$$delegate_14.getPanelActionsState();
    }

    @Override // com.ifriend.presentation.features.chat.photo.delegate.ChatPhotoDelegate
    public StateFlow<ChatPhotoUiState> getPhotoModalState() {
        return this.$$delegate_9.getPhotoModalState();
    }

    @Override // com.ifriend.presentation.features.profile.menu.delegate.ProfileMenuDelegate
    public StateFlow<ProfileMenuUiState> getProfileMenuState() {
        return this.$$delegate_3.getProfileMenuState();
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    public Flow<Event> getSingleEvents() {
        return this.$$delegate_1.getSingleEvents();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    public UiState getUiState(UiStateDelegate<UiState, Event> uiStateDelegate) {
        Intrinsics.checkNotNullParameter(uiStateDelegate, "<this>");
        return this.$$delegate_1.getUiState(uiStateDelegate);
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    public StateFlow<UiState> getUiStateFlow() {
        return this.$$delegate_1.getUiStateFlow();
    }

    @Override // com.ifriend.presentation.features.chat.gifts.delegate.ChatGiftsDelegate
    public void giftClick(ViewModel context_receiver_0, ChatGiftUi gift, String chatId) {
        Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
        Intrinsics.checkNotNullParameter(gift, "gift");
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        this.$$delegate_6.giftClick(context_receiver_0, gift, chatId);
    }

    @Override // com.ifriend.presentation.features.chat.gifts.delegate.ChatGiftsDelegate
    public void giftsClick(ViewModel context_receiver_0, String chatId) {
        Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        this.$$delegate_6.giftsClick(context_receiver_0, chatId);
    }

    @Override // com.ifriend.presentation.features.chat.gifts.delegate.ChatGiftsDelegate
    public void giftsCloseClick(ViewModel context_receiver_0) {
        Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
        this.$$delegate_6.giftsCloseClick(context_receiver_0);
    }

    @Override // com.ifriend.presentation.features.chat.deeplinks.ChatHandleDeepLinksDelegate
    public void handleDeepLinks(ChatViewModel context_receiver_0, String chatId) {
        Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        this.$$delegate_5.handleDeepLinks(context_receiver_0, chatId);
    }

    @Override // com.ifriend.presentation.features.chat.notifications.delegate.ChatNotificationsDelegate
    public void hideNotification(ViewModel context_receiver_0, ChatNotificationUi item) {
        Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
        Intrinsics.checkNotNullParameter(item, "item");
        this.$$delegate_2.hideNotification(context_receiver_0, item);
    }

    @Override // com.ifriend.presentation.features.profile.menu.delegate.ProfileMenuDelegate
    public void hideProfileMenu() {
        this.$$delegate_3.hideProfileMenu();
    }

    @Override // com.ifriend.presentation.features.chat.background.delegate.ChatBackgroundDelegate
    public void initChatBackground(ChatViewModel context_receiver_0, String chatId) {
        Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        this.$$delegate_4.initChatBackground(context_receiver_0, chatId);
    }

    @Override // com.ifriend.presentation.features.chat.configuration.ChatConfigurationDelegate
    public void initChatConfiguration(ChatViewModel context_receiver_0) {
        Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
        this.$$delegate_12.initChatConfiguration(context_receiver_0);
    }

    @Override // com.ifriend.presentation.features.chat.gifts.delegate.ChatGiftsDelegate
    public void initChatGifts(ViewModel context_receiver_0, String chatId) {
        Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        this.$$delegate_6.initChatGifts(context_receiver_0, chatId);
    }

    @Override // com.ifriend.presentation.features.profile.header.delegate.ChatHeaderDelegate
    public void initChatHeader(ViewModel context_receiver_0, String chatId) {
        Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        this.$$delegate_10.initChatHeader(context_receiver_0, chatId);
    }

    @Override // com.ifriend.presentation.features.chat.input.delegate.ChatInputDelegate
    public void initChatInputDelegate(ViewModel context_receiver_0, String chatId) {
        Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        this.$$delegate_15.initChatInputDelegate(context_receiver_0, chatId);
    }

    @Override // com.ifriend.presentation.features.chat.intro.delegate.ChatIntroDelegate
    public void initChatIntroDelegate(ViewModel context_receiver_0, String chatId) {
        Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        this.$$delegate_11.initChatIntroDelegate(context_receiver_0, chatId);
    }

    @Override // com.ifriend.presentation.features.chat.message.ChatMessageDelegate
    public void initChatMessageDelegate(ChatViewModel context_receiver_0) {
        Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
        this.$$delegate_0.initChatMessageDelegate(context_receiver_0);
    }

    @Override // com.ifriend.presentation.features.chat.actions.ChatPaidActionsDelegate
    public void initChatPaidActions(ChatViewModel context_receiver_0, String chatId) {
        Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        this.$$delegate_7.initChatPaidActions(context_receiver_0, chatId);
    }

    @Override // com.ifriend.presentation.features.chat.panel.delegate.ChatPanelActionsDelegate
    public void initChatPanelActions(ViewModel context_receiver_0, String chatId) {
        Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        this.$$delegate_14.initChatPanelActions(context_receiver_0, chatId);
    }

    @Override // com.ifriend.presentation.features.chat.photo.delegate.ChatPhotoDelegate
    public void initChatPhotoDelegate(ViewModel context_receiver_0) {
        Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
        this.$$delegate_9.initChatPhotoDelegate(context_receiver_0);
    }

    @Override // com.ifriend.presentation.features.chat.notifications.delegate.ChatNotificationsDelegate
    public void initNotificationsObserver(ViewModel context_receiver_0, int i, long j, Function1<? super ChatNotification, Boolean> notificationsFilter) {
        Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
        Intrinsics.checkNotNullParameter(notificationsFilter, "notificationsFilter");
        this.$$delegate_2.initNotificationsObserver(context_receiver_0, i, j, notificationsFilter);
    }

    @Override // com.ifriend.presentation.features.profile.menu.delegate.ProfileMenuDelegate
    public void initProfileMenuDelegate(ViewModel context_receiver_0, String str) {
        Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
        this.$$delegate_3.initProfileMenuDelegate(context_receiver_0, str);
    }

    @Override // com.ifriend.presentation.features.chat.sextingmessage.SextingMessagePaywallShowingDelegate
    public void initSextingMessagePaywall(ViewModel context_receiver_0, String chatId) {
        Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        this.$$delegate_13.initSextingMessagePaywall(context_receiver_0, chatId);
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    @Deprecated(message = "use method UiStateDelegate<UiState, Event>.updateUiState")
    public Object reduce(UiStateDelegate<UiState, Event> uiStateDelegate, Function1<? super UiState, ? extends UiState> function1, Continuation<? super Unit> continuation) {
        return this.$$delegate_1.reduce(uiStateDelegate, function1, continuation);
    }

    @Override // com.ifriend.presentation.features.chat.panel.delegate.ChatPanelActionsDelegate
    public void remindButtonClicked(ViewModel context_receiver_0) {
        Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
        this.$$delegate_14.remindButtonClicked(context_receiver_0);
    }

    @Override // com.ifriend.presentation.features.chat.panel.delegate.ChatPanelActionsDelegate
    public void remindPermissionGranted(ViewModel context_receiver_0, boolean z) {
        Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
        this.$$delegate_14.remindPermissionGranted(context_receiver_0, z);
    }

    @Override // com.ifriend.presentation.features.chat.message.ChatMessageDelegate
    public void requestTextMessageAccess(ViewModel context_receiver_0, String messageId) {
        Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        this.$$delegate_0.requestTextMessageAccess(context_receiver_0, messageId);
    }

    /* renamed from: sendEvent  reason: avoid collision after fix types in other method */
    public Object sendEvent2(UiStateDelegate<UiState, Event> uiStateDelegate, Event event, Continuation<? super Unit> continuation) {
        return this.$$delegate_1.sendEvent(uiStateDelegate, event, continuation);
    }

    @Override // com.ifriend.presentation.features.chat.input.delegate.ChatInputDelegate
    public void sendInputMessage(ViewModel context_receiver_0) {
        Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
        this.$$delegate_15.sendInputMessage(context_receiver_0);
    }

    @Override // com.ifriend.presentation.features.chat.intro.delegate.ChatIntroDelegate
    public void showNextChatIntroCard(ViewModel context_receiver_0) {
        Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
        this.$$delegate_11.showNextChatIntroCard(context_receiver_0);
    }

    @Override // com.ifriend.presentation.features.chat.photo.delegate.ChatPhotoDelegate
    public void showPhoto(ViewModel context_receiver_0, String messageId) {
        Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        this.$$delegate_9.showPhoto(context_receiver_0, messageId);
    }

    @Override // com.ifriend.presentation.features.profile.menu.delegate.ProfileMenuDelegate
    public void showProfileMenu() {
        this.$$delegate_3.showProfileMenu();
    }

    @Override // com.ifriend.presentation.features.chat.input.delegate.ChatInputDelegate
    public void startAudioRecording(ViewModel context_receiver_0) {
        Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
        this.$$delegate_15.startAudioRecording(context_receiver_0);
    }

    @Override // com.ifriend.presentation.features.chat.input.delegate.ChatInputDelegate
    public void stopRecordAudio(ViewModel context_receiver_0, boolean z) {
        Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
        this.$$delegate_15.stopRecordAudio(context_receiver_0, z);
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    public Object updateUiState(UiStateDelegate<UiState, Event> uiStateDelegate, Function1<? super UiState, ? extends UiState> function1, Continuation<? super Unit> continuation) {
        return this.$$delegate_1.updateUiState(uiStateDelegate, function1, continuation);
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    public /* bridge */ /* synthetic */ Object sendEvent(UiStateDelegate<UiState, Event> uiStateDelegate, Event event, Continuation continuation) {
        return sendEvent2(uiStateDelegate, event, (Continuation<? super Unit>) continuation);
    }

    public final Preferences getPreferences() {
        return this.preferences;
    }

    public ChatViewModel(String chatId, OnUserRatedAppUseCase onUserRateUsUseCase, FirebaseSubscribeUseCase firebaseSubscribeUseCase, ClearBadgesUseCase clearBadgesUseCase, @UserSessionSharedPreferences Preferences preferences, AnalyticsNotificationPermissionChangedUseCase analyticsNotificationPermissionChangedUseCase, SendConfirmationEmailUseCase sendConfirmationEmailUseCase, AnalyticsRateUsModalUseCase analyticsRateUsUseCase, Logger logger, AppEventsEmitter appEventsEmitter, ChatsInfoInteractor chatsInfoInteractor, ChatScreenAnalyticsUseCase chatScreenAnalyticsUseCase, ChatClientInteractor chatClientInteractor, DispatcherProvider dispatchers, VoiceRecordingAnalytics voiceRecordingAnalytics, AnalyticsInteractor analyticsInteractor, FlowObserver<ChatEvents> chatEventsFlow, RateAppPopupDelegate rateAppPopupDelegate, ChatGiftsDelegate chatGiftsDelegate, ChatHandleDeepLinksDelegate chatHandleDeepLinksDelegate, ChatBackgroundDelegate chatBackgroundDelegate, ProfileMenuDelegate profileMenuDelegate, ChatNotificationsDelegate chatNotificationsDelegate, ChatHeaderDelegate chatHeaderDelegate, ChatPaidActionsDelegate chatPaidActionsDelegate, ChatProfileActionDelegate chatProfileActionDelegate, ChatIntroDelegate chatIntroDelegate, ChatPanelActionsDelegate chatPanelActionsDelegate, SextingMessagePaywallShowingDelegate sextingMessagePaywallShowingDelegate, ChatInputDelegate chatInputDelegate, ChatPhotoDelegate photoDelegate, ChatConfigurationDelegate chatConfigurationDelegate, ChatSubscriptionOfferDelegate chatSubscriptionOfferDelegate, ChatMessageDelegate chatMessageDelegate) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(onUserRateUsUseCase, "onUserRateUsUseCase");
        Intrinsics.checkNotNullParameter(firebaseSubscribeUseCase, "firebaseSubscribeUseCase");
        Intrinsics.checkNotNullParameter(clearBadgesUseCase, "clearBadgesUseCase");
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        Intrinsics.checkNotNullParameter(analyticsNotificationPermissionChangedUseCase, "analyticsNotificationPermissionChangedUseCase");
        Intrinsics.checkNotNullParameter(sendConfirmationEmailUseCase, "sendConfirmationEmailUseCase");
        Intrinsics.checkNotNullParameter(analyticsRateUsUseCase, "analyticsRateUsUseCase");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(appEventsEmitter, "appEventsEmitter");
        Intrinsics.checkNotNullParameter(chatsInfoInteractor, "chatsInfoInteractor");
        Intrinsics.checkNotNullParameter(chatScreenAnalyticsUseCase, "chatScreenAnalyticsUseCase");
        Intrinsics.checkNotNullParameter(chatClientInteractor, "chatClientInteractor");
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        Intrinsics.checkNotNullParameter(voiceRecordingAnalytics, "voiceRecordingAnalytics");
        Intrinsics.checkNotNullParameter(analyticsInteractor, "analyticsInteractor");
        Intrinsics.checkNotNullParameter(chatEventsFlow, "chatEventsFlow");
        Intrinsics.checkNotNullParameter(rateAppPopupDelegate, "rateAppPopupDelegate");
        Intrinsics.checkNotNullParameter(chatGiftsDelegate, "chatGiftsDelegate");
        Intrinsics.checkNotNullParameter(chatHandleDeepLinksDelegate, "chatHandleDeepLinksDelegate");
        Intrinsics.checkNotNullParameter(chatBackgroundDelegate, "chatBackgroundDelegate");
        Intrinsics.checkNotNullParameter(profileMenuDelegate, "profileMenuDelegate");
        Intrinsics.checkNotNullParameter(chatNotificationsDelegate, "chatNotificationsDelegate");
        Intrinsics.checkNotNullParameter(chatHeaderDelegate, "chatHeaderDelegate");
        Intrinsics.checkNotNullParameter(chatPaidActionsDelegate, "chatPaidActionsDelegate");
        Intrinsics.checkNotNullParameter(chatProfileActionDelegate, "chatProfileActionDelegate");
        Intrinsics.checkNotNullParameter(chatIntroDelegate, "chatIntroDelegate");
        Intrinsics.checkNotNullParameter(chatPanelActionsDelegate, "chatPanelActionsDelegate");
        Intrinsics.checkNotNullParameter(sextingMessagePaywallShowingDelegate, "sextingMessagePaywallShowingDelegate");
        Intrinsics.checkNotNullParameter(chatInputDelegate, "chatInputDelegate");
        Intrinsics.checkNotNullParameter(photoDelegate, "photoDelegate");
        Intrinsics.checkNotNullParameter(chatConfigurationDelegate, "chatConfigurationDelegate");
        Intrinsics.checkNotNullParameter(chatSubscriptionOfferDelegate, "chatSubscriptionOfferDelegate");
        Intrinsics.checkNotNullParameter(chatMessageDelegate, "chatMessageDelegate");
        this.chatId = chatId;
        this.onUserRateUsUseCase = onUserRateUsUseCase;
        this.firebaseSubscribeUseCase = firebaseSubscribeUseCase;
        this.clearBadgesUseCase = clearBadgesUseCase;
        this.preferences = preferences;
        this.analyticsNotificationPermissionChangedUseCase = analyticsNotificationPermissionChangedUseCase;
        this.sendConfirmationEmailUseCase = sendConfirmationEmailUseCase;
        this.analyticsRateUsUseCase = analyticsRateUsUseCase;
        this.logger = logger;
        this.appEventsEmitter = appEventsEmitter;
        this.chatsInfoInteractor = chatsInfoInteractor;
        this.chatScreenAnalyticsUseCase = chatScreenAnalyticsUseCase;
        this.chatClientInteractor = chatClientInteractor;
        this.dispatchers = dispatchers;
        this.voiceRecordingAnalytics = voiceRecordingAnalytics;
        this.analyticsInteractor = analyticsInteractor;
        this.$$delegate_0 = chatMessageDelegate;
        this.$$delegate_1 = new UiStateDelegateImpl<>(new UiState(false, null, null, 0L, null, false, false, null, null, FrameMetricsAggregator.EVERY_DURATION, null), 0, null, 6, null);
        this.$$delegate_2 = chatNotificationsDelegate;
        this.$$delegate_3 = profileMenuDelegate;
        this.$$delegate_4 = chatBackgroundDelegate;
        this.$$delegate_5 = chatHandleDeepLinksDelegate;
        this.$$delegate_6 = chatGiftsDelegate;
        this.$$delegate_7 = chatPaidActionsDelegate;
        this.$$delegate_8 = chatProfileActionDelegate;
        this.$$delegate_9 = photoDelegate;
        this.$$delegate_10 = chatHeaderDelegate;
        this.$$delegate_11 = chatIntroDelegate;
        this.$$delegate_12 = chatConfigurationDelegate;
        this.$$delegate_13 = sextingMessagePaywallShowingDelegate;
        this.$$delegate_14 = chatPanelActionsDelegate;
        this.$$delegate_15 = chatInputDelegate;
        this.$$delegate_16 = chatSubscriptionOfferDelegate;
        this.coroutineErrorHandler = new ChatViewModel$special$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.Key, this);
        ChatViewModel chatViewModel = this;
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(chatViewModel), dispatchers.background(), null, new AnonymousClass1(null), 2, null);
        initObservers();
        initChatBackground(this, chatId);
        initChatGifts(chatViewModel, chatId);
        initProfileMenuDelegate(chatViewModel, chatId);
        initChatHeader(chatViewModel, chatId);
        initChatPaidActions(this, chatId);
        initChatIntroDelegate(chatViewModel, chatId);
        initChatPanelActions(chatViewModel, chatId);
        initSextingMessagePaywall(chatViewModel, chatId);
        initChatInputDelegate(chatViewModel, chatId);
        initChatConfiguration(this);
        initChatMessageDelegate(this);
        initChatPhotoDelegate(chatViewModel);
        checkIfNeedShowSubscriptionOffer(chatViewModel);
        BuildersKt.launch(ViewModelKt.getViewModelScope(chatViewModel), EmptyCoroutineContext.INSTANCE, CoroutineStart.DEFAULT, new ChatViewModel$special$$inlined$collectIn$default$1(chatEventsFlow.subscribe(), null, this));
        BuildersKt.launch(ViewModelKt.getViewModelScope(chatViewModel), EmptyCoroutineContext.INSTANCE, CoroutineStart.DEFAULT, new ChatViewModel$special$$inlined$collectIn$default$2(chatsInfoInteractor.getChatsInfoFlow(chatId), null, this));
        rateAppPopupDelegate.setOnResultListeners(new AnonymousClass4(), new AnonymousClass5());
    }

    /* compiled from: ChatViewModel.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bd\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fø\u0001\u0000¢\u0006\u0002\u0010\u0010J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003J\u0019\u0010 \u001a\u00020\tHÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b!\u0010\u0018J\t\u0010\"\u001a\u00020\u0007HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0007HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u000fHÆ\u0003Jr\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00072\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b(\u0010)J\u0013\u0010*\u001a\u00020\u00032\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020-HÖ\u0001J\t\u0010.\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\b\u001a\u00020\tø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u001bR\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u001bR\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u001bR\u0011\u0010\r\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006/"}, d2 = {"Lcom/ifriend/presentation/features/chat/screen/viewmodel/ChatViewModel$UiState;", "", "isLoading", "", "animatedBgState", "Lcom/ifriend/animatedBackground/AnimatedBackgroundView$State;", "imageBgState", "", "gradientColor", "Landroidx/compose/ui/graphics/Color;", "chatName", "isVerified", "isShowSubscriptionState", "subscriptionStateLabel", "chatInfo", "Lcom/ifriend/domain/logic/chat/models/ChatInfo;", "(ZLcom/ifriend/animatedBackground/AnimatedBackgroundView$State;Ljava/lang/String;JLjava/lang/String;ZZLjava/lang/String;Lcom/ifriend/domain/logic/chat/models/ChatInfo;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAnimatedBgState", "()Lcom/ifriend/animatedBackground/AnimatedBackgroundView$State;", "getChatInfo", "()Lcom/ifriend/domain/logic/chat/models/ChatInfo;", "getChatName", "()Ljava/lang/String;", "getGradientColor-0d7_KjU", "()J", "J", "getImageBgState", "()Z", "getSubscriptionStateLabel", "component1", "component2", "component3", "component4", "component4-0d7_KjU", "component5", "component6", "component7", "component8", "component9", "copy", "copy-fWhpE4E", "(ZLcom/ifriend/animatedBackground/AnimatedBackgroundView$State;Ljava/lang/String;JLjava/lang/String;ZZLjava/lang/String;Lcom/ifriend/domain/logic/chat/models/ChatInfo;)Lcom/ifriend/presentation/features/chat/screen/viewmodel/ChatViewModel$UiState;", "equals", "other", "hashCode", "", "toString", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class UiState {
        public static final int $stable = 8;
        private final AnimatedBackgroundView.State animatedBgState;
        private final ChatInfo chatInfo;
        private final String chatName;
        private final long gradientColor;
        private final String imageBgState;
        private final boolean isLoading;
        private final boolean isShowSubscriptionState;
        private final boolean isVerified;
        private final String subscriptionStateLabel;

        public /* synthetic */ UiState(boolean z, AnimatedBackgroundView.State state, String str, long j, String str2, boolean z2, boolean z3, String str3, ChatInfo chatInfo, DefaultConstructorMarker defaultConstructorMarker) {
            this(z, state, str, j, str2, z2, z3, str3, chatInfo);
        }

        public final boolean component1() {
            return this.isLoading;
        }

        public final AnimatedBackgroundView.State component2() {
            return this.animatedBgState;
        }

        public final String component3() {
            return this.imageBgState;
        }

        /* renamed from: component4-0d7_KjU  reason: not valid java name */
        public final long m6923component40d7_KjU() {
            return this.gradientColor;
        }

        public final String component5() {
            return this.chatName;
        }

        public final boolean component6() {
            return this.isVerified;
        }

        public final boolean component7() {
            return this.isShowSubscriptionState;
        }

        public final String component8() {
            return this.subscriptionStateLabel;
        }

        public final ChatInfo component9() {
            return this.chatInfo;
        }

        /* renamed from: copy-fWhpE4E  reason: not valid java name */
        public final UiState m6924copyfWhpE4E(boolean z, AnimatedBackgroundView.State animatedBgState, String imageBgState, long j, String chatName, boolean z2, boolean z3, String subscriptionStateLabel, ChatInfo chatInfo) {
            Intrinsics.checkNotNullParameter(animatedBgState, "animatedBgState");
            Intrinsics.checkNotNullParameter(imageBgState, "imageBgState");
            Intrinsics.checkNotNullParameter(chatName, "chatName");
            Intrinsics.checkNotNullParameter(subscriptionStateLabel, "subscriptionStateLabel");
            return new UiState(z, animatedBgState, imageBgState, j, chatName, z2, z3, subscriptionStateLabel, chatInfo, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof UiState) {
                UiState uiState = (UiState) obj;
                return this.isLoading == uiState.isLoading && Intrinsics.areEqual(this.animatedBgState, uiState.animatedBgState) && Intrinsics.areEqual(this.imageBgState, uiState.imageBgState) && Color.m3292equalsimpl0(this.gradientColor, uiState.gradientColor) && Intrinsics.areEqual(this.chatName, uiState.chatName) && this.isVerified == uiState.isVerified && this.isShowSubscriptionState == uiState.isShowSubscriptionState && Intrinsics.areEqual(this.subscriptionStateLabel, uiState.subscriptionStateLabel) && Intrinsics.areEqual(this.chatInfo, uiState.chatInfo);
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v18 */
        /* JADX WARN: Type inference failed for: r0v19 */
        /* JADX WARN: Type inference failed for: r2v8, types: [boolean] */
        public int hashCode() {
            boolean z = this.isLoading;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            int hashCode = ((((((((r0 * 31) + this.animatedBgState.hashCode()) * 31) + this.imageBgState.hashCode()) * 31) + Color.m3298hashCodeimpl(this.gradientColor)) * 31) + this.chatName.hashCode()) * 31;
            ?? r2 = this.isVerified;
            int i = r2;
            if (r2 != 0) {
                i = 1;
            }
            int i2 = (hashCode + i) * 31;
            boolean z2 = this.isShowSubscriptionState;
            int hashCode2 = (((i2 + (z2 ? 1 : z2 ? 1 : 0)) * 31) + this.subscriptionStateLabel.hashCode()) * 31;
            ChatInfo chatInfo = this.chatInfo;
            return hashCode2 + (chatInfo == null ? 0 : chatInfo.hashCode());
        }

        public String toString() {
            boolean z = this.isLoading;
            AnimatedBackgroundView.State state = this.animatedBgState;
            String str = this.imageBgState;
            String m3299toStringimpl = Color.m3299toStringimpl(this.gradientColor);
            String str2 = this.chatName;
            boolean z2 = this.isVerified;
            boolean z3 = this.isShowSubscriptionState;
            String str3 = this.subscriptionStateLabel;
            ChatInfo chatInfo = this.chatInfo;
            return "UiState(isLoading=" + z + ", animatedBgState=" + state + ", imageBgState=" + str + ", gradientColor=" + m3299toStringimpl + ", chatName=" + str2 + ", isVerified=" + z2 + ", isShowSubscriptionState=" + z3 + ", subscriptionStateLabel=" + str3 + ", chatInfo=" + chatInfo + ")";
        }

        private UiState(boolean z, AnimatedBackgroundView.State animatedBgState, String imageBgState, long j, String chatName, boolean z2, boolean z3, String subscriptionStateLabel, ChatInfo chatInfo) {
            Intrinsics.checkNotNullParameter(animatedBgState, "animatedBgState");
            Intrinsics.checkNotNullParameter(imageBgState, "imageBgState");
            Intrinsics.checkNotNullParameter(chatName, "chatName");
            Intrinsics.checkNotNullParameter(subscriptionStateLabel, "subscriptionStateLabel");
            this.isLoading = z;
            this.animatedBgState = animatedBgState;
            this.imageBgState = imageBgState;
            this.gradientColor = j;
            this.chatName = chatName;
            this.isVerified = z2;
            this.isShowSubscriptionState = z3;
            this.subscriptionStateLabel = subscriptionStateLabel;
            this.chatInfo = chatInfo;
        }

        public final boolean isLoading() {
            return this.isLoading;
        }

        public /* synthetic */ UiState(boolean z, AnimatedBackgroundView.State state, String str, long j, String str2, boolean z2, boolean z3, String str3, ChatInfo chatInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? new AnimatedBackgroundView.State.Droplet(true) : state, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? Color.Companion.m3326getTransparent0d7_KjU() : j, (i & 16) != 0 ? "" : str2, (i & 32) != 0 ? false : z2, (i & 64) == 0 ? z3 : false, (i & 128) == 0 ? str3 : "", (i & 256) != 0 ? null : chatInfo, null);
        }

        public final AnimatedBackgroundView.State getAnimatedBgState() {
            return this.animatedBgState;
        }

        public final String getImageBgState() {
            return this.imageBgState;
        }

        /* renamed from: getGradientColor-0d7_KjU  reason: not valid java name */
        public final long m6925getGradientColor0d7_KjU() {
            return this.gradientColor;
        }

        public final String getChatName() {
            return this.chatName;
        }

        public final boolean isVerified() {
            return this.isVerified;
        }

        public final boolean isShowSubscriptionState() {
            return this.isShowSubscriptionState;
        }

        public final String getSubscriptionStateLabel() {
            return this.subscriptionStateLabel;
        }

        public final ChatInfo getChatInfo() {
            return this.chatInfo;
        }
    }

    /* compiled from: ChatViewModel.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\f\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u0082\u0001\f\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019¨\u0006\u001a"}, d2 = {"Lcom/ifriend/presentation/features/chat/screen/viewmodel/ChatViewModel$Event;", "", "NavigateBackToHome", "NavigateCloseApp", "OpenAppMarket", "OpenBotProfile", "OpenChat", "OpenChatSettings", "OpenDiary", "OpenGenerateAvatar", "OpenLink", "OpenSelectGeneratedAvatar", "OpenTakePhotoAlert", "ShowKeyboard", "Lcom/ifriend/presentation/features/chat/screen/viewmodel/ChatViewModel$Event$NavigateBackToHome;", "Lcom/ifriend/presentation/features/chat/screen/viewmodel/ChatViewModel$Event$NavigateCloseApp;", "Lcom/ifriend/presentation/features/chat/screen/viewmodel/ChatViewModel$Event$OpenAppMarket;", "Lcom/ifriend/presentation/features/chat/screen/viewmodel/ChatViewModel$Event$OpenBotProfile;", "Lcom/ifriend/presentation/features/chat/screen/viewmodel/ChatViewModel$Event$OpenChat;", "Lcom/ifriend/presentation/features/chat/screen/viewmodel/ChatViewModel$Event$OpenChatSettings;", "Lcom/ifriend/presentation/features/chat/screen/viewmodel/ChatViewModel$Event$OpenDiary;", "Lcom/ifriend/presentation/features/chat/screen/viewmodel/ChatViewModel$Event$OpenGenerateAvatar;", "Lcom/ifriend/presentation/features/chat/screen/viewmodel/ChatViewModel$Event$OpenLink;", "Lcom/ifriend/presentation/features/chat/screen/viewmodel/ChatViewModel$Event$OpenSelectGeneratedAvatar;", "Lcom/ifriend/presentation/features/chat/screen/viewmodel/ChatViewModel$Event$OpenTakePhotoAlert;", "Lcom/ifriend/presentation/features/chat/screen/viewmodel/ChatViewModel$Event$ShowKeyboard;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public interface Event {

        /* compiled from: ChatViewModel.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifriend/presentation/features/chat/screen/viewmodel/ChatViewModel$Event$NavigateBackToHome;", "Lcom/ifriend/presentation/features/chat/screen/viewmodel/ChatViewModel$Event;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class NavigateBackToHome implements Event {
            public static final int $stable = 0;
            public static final NavigateBackToHome INSTANCE = new NavigateBackToHome();

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof NavigateBackToHome) {
                    NavigateBackToHome navigateBackToHome = (NavigateBackToHome) obj;
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return -1761657105;
            }

            public String toString() {
                return "NavigateBackToHome";
            }

            private NavigateBackToHome() {
            }
        }

        /* compiled from: ChatViewModel.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifriend/presentation/features/chat/screen/viewmodel/ChatViewModel$Event$NavigateCloseApp;", "Lcom/ifriend/presentation/features/chat/screen/viewmodel/ChatViewModel$Event;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class NavigateCloseApp implements Event {
            public static final int $stable = 0;
            public static final NavigateCloseApp INSTANCE = new NavigateCloseApp();

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof NavigateCloseApp) {
                    NavigateCloseApp navigateCloseApp = (NavigateCloseApp) obj;
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return 833702327;
            }

            public String toString() {
                return "NavigateCloseApp";
            }

            private NavigateCloseApp() {
            }
        }

        /* compiled from: ChatViewModel.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifriend/presentation/features/chat/screen/viewmodel/ChatViewModel$Event$OpenGenerateAvatar;", "Lcom/ifriend/presentation/features/chat/screen/viewmodel/ChatViewModel$Event;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class OpenGenerateAvatar implements Event {
            public static final int $stable = 0;
            public static final OpenGenerateAvatar INSTANCE = new OpenGenerateAvatar();

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof OpenGenerateAvatar) {
                    OpenGenerateAvatar openGenerateAvatar = (OpenGenerateAvatar) obj;
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return -2103620363;
            }

            public String toString() {
                return "OpenGenerateAvatar";
            }

            private OpenGenerateAvatar() {
            }
        }

        /* compiled from: ChatViewModel.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifriend/presentation/features/chat/screen/viewmodel/ChatViewModel$Event$OpenBotProfile;", "Lcom/ifriend/presentation/features/chat/screen/viewmodel/ChatViewModel$Event;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class OpenBotProfile implements Event {
            public static final int $stable = 0;
            public static final OpenBotProfile INSTANCE = new OpenBotProfile();

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof OpenBotProfile) {
                    OpenBotProfile openBotProfile = (OpenBotProfile) obj;
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return -382134487;
            }

            public String toString() {
                return "OpenBotProfile";
            }

            private OpenBotProfile() {
            }
        }

        /* compiled from: ChatViewModel.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifriend/presentation/features/chat/screen/viewmodel/ChatViewModel$Event$OpenSelectGeneratedAvatar;", "Lcom/ifriend/presentation/features/chat/screen/viewmodel/ChatViewModel$Event;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class OpenSelectGeneratedAvatar implements Event {
            public static final int $stable = 0;
            public static final OpenSelectGeneratedAvatar INSTANCE = new OpenSelectGeneratedAvatar();

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof OpenSelectGeneratedAvatar) {
                    OpenSelectGeneratedAvatar openSelectGeneratedAvatar = (OpenSelectGeneratedAvatar) obj;
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return 1088296837;
            }

            public String toString() {
                return "OpenSelectGeneratedAvatar";
            }

            private OpenSelectGeneratedAvatar() {
            }
        }

        /* compiled from: ChatViewModel.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifriend/presentation/features/chat/screen/viewmodel/ChatViewModel$Event$OpenTakePhotoAlert;", "Lcom/ifriend/presentation/features/chat/screen/viewmodel/ChatViewModel$Event;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class OpenTakePhotoAlert implements Event {
            public static final int $stable = 0;
            public static final OpenTakePhotoAlert INSTANCE = new OpenTakePhotoAlert();

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof OpenTakePhotoAlert) {
                    OpenTakePhotoAlert openTakePhotoAlert = (OpenTakePhotoAlert) obj;
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return 596505592;
            }

            public String toString() {
                return "OpenTakePhotoAlert";
            }

            private OpenTakePhotoAlert() {
            }
        }

        /* compiled from: ChatViewModel.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifriend/presentation/features/chat/screen/viewmodel/ChatViewModel$Event$OpenAppMarket;", "Lcom/ifriend/presentation/features/chat/screen/viewmodel/ChatViewModel$Event;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class OpenAppMarket implements Event {
            public static final int $stable = 0;
            public static final OpenAppMarket INSTANCE = new OpenAppMarket();

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof OpenAppMarket) {
                    OpenAppMarket openAppMarket = (OpenAppMarket) obj;
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return -2053232746;
            }

            public String toString() {
                return "OpenAppMarket";
            }

            private OpenAppMarket() {
            }
        }

        /* compiled from: ChatViewModel.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifriend/presentation/features/chat/screen/viewmodel/ChatViewModel$Event$ShowKeyboard;", "Lcom/ifriend/presentation/features/chat/screen/viewmodel/ChatViewModel$Event;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class ShowKeyboard implements Event {
            public static final int $stable = 0;
            public static final ShowKeyboard INSTANCE = new ShowKeyboard();

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof ShowKeyboard) {
                    ShowKeyboard showKeyboard = (ShowKeyboard) obj;
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return 380083361;
            }

            public String toString() {
                return "ShowKeyboard";
            }

            private ShowKeyboard() {
            }
        }

        /* compiled from: ChatViewModel.kt */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/ifriend/presentation/features/chat/screen/viewmodel/ChatViewModel$Event$OpenDiary;", "Lcom/ifriend/presentation/features/chat/screen/viewmodel/ChatViewModel$Event;", "nodeId", "", "(Ljava/lang/String;)V", "getNodeId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class OpenDiary implements Event {
            public static final int $stable = 0;
            private final String nodeId;

            public static /* synthetic */ OpenDiary copy$default(OpenDiary openDiary, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = openDiary.nodeId;
                }
                return openDiary.copy(str);
            }

            public final String component1() {
                return this.nodeId;
            }

            public final OpenDiary copy(String str) {
                return new OpenDiary(str);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof OpenDiary) && Intrinsics.areEqual(this.nodeId, ((OpenDiary) obj).nodeId);
            }

            public int hashCode() {
                String str = this.nodeId;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public String toString() {
                String str = this.nodeId;
                return "OpenDiary(nodeId=" + str + ")";
            }

            public OpenDiary(String str) {
                this.nodeId = str;
            }

            public final String getNodeId() {
                return this.nodeId;
            }
        }

        /* compiled from: ChatViewModel.kt */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/ifriend/presentation/features/chat/screen/viewmodel/ChatViewModel$Event$OpenChat;", "Lcom/ifriend/presentation/features/chat/screen/viewmodel/ChatViewModel$Event;", "chatId", "", "(Ljava/lang/String;)V", "getChatId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class OpenChat implements Event {
            public static final int $stable = 0;
            private final String chatId;

            public static /* synthetic */ OpenChat copy$default(OpenChat openChat, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = openChat.chatId;
                }
                return openChat.copy(str);
            }

            public final String component1() {
                return this.chatId;
            }

            public final OpenChat copy(String chatId) {
                Intrinsics.checkNotNullParameter(chatId, "chatId");
                return new OpenChat(chatId);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof OpenChat) && Intrinsics.areEqual(this.chatId, ((OpenChat) obj).chatId);
            }

            public int hashCode() {
                return this.chatId.hashCode();
            }

            public String toString() {
                String str = this.chatId;
                return "OpenChat(chatId=" + str + ")";
            }

            public OpenChat(String chatId) {
                Intrinsics.checkNotNullParameter(chatId, "chatId");
                this.chatId = chatId;
            }

            public final String getChatId() {
                return this.chatId;
            }
        }

        /* compiled from: ChatViewModel.kt */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/ifriend/presentation/features/chat/screen/viewmodel/ChatViewModel$Event$OpenChatSettings;", "Lcom/ifriend/presentation/features/chat/screen/viewmodel/ChatViewModel$Event;", "chatId", "", "(Ljava/lang/String;)V", "getChatId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class OpenChatSettings implements Event {
            public static final int $stable = 0;
            private final String chatId;

            public static /* synthetic */ OpenChatSettings copy$default(OpenChatSettings openChatSettings, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = openChatSettings.chatId;
                }
                return openChatSettings.copy(str);
            }

            public final String component1() {
                return this.chatId;
            }

            public final OpenChatSettings copy(String chatId) {
                Intrinsics.checkNotNullParameter(chatId, "chatId");
                return new OpenChatSettings(chatId);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof OpenChatSettings) && Intrinsics.areEqual(this.chatId, ((OpenChatSettings) obj).chatId);
            }

            public int hashCode() {
                return this.chatId.hashCode();
            }

            public String toString() {
                String str = this.chatId;
                return "OpenChatSettings(chatId=" + str + ")";
            }

            public OpenChatSettings(String chatId) {
                Intrinsics.checkNotNullParameter(chatId, "chatId");
                this.chatId = chatId;
            }

            public final String getChatId() {
                return this.chatId;
            }
        }

        /* compiled from: ChatViewModel.kt */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/ifriend/presentation/features/chat/screen/viewmodel/ChatViewModel$Event$OpenLink;", "Lcom/ifriend/presentation/features/chat/screen/viewmodel/ChatViewModel$Event;", "link", "", "(Ljava/lang/String;)V", "getLink", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class OpenLink implements Event {
            public static final int $stable = 0;
            private final String link;

            public static /* synthetic */ OpenLink copy$default(OpenLink openLink, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = openLink.link;
                }
                return openLink.copy(str);
            }

            public final String component1() {
                return this.link;
            }

            public final OpenLink copy(String link) {
                Intrinsics.checkNotNullParameter(link, "link");
                return new OpenLink(link);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof OpenLink) && Intrinsics.areEqual(this.link, ((OpenLink) obj).link);
            }

            public int hashCode() {
                return this.link.hashCode();
            }

            public String toString() {
                String str = this.link;
                return "OpenLink(link=" + str + ")";
            }

            public OpenLink(String link) {
                Intrinsics.checkNotNullParameter(link, "link");
                this.link = link;
            }

            public final String getLink() {
                return this.link;
            }
        }
    }

    /* compiled from: ChatViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.ifriend.presentation.features.chat.screen.viewmodel.ChatViewModel$1", f = "ChatViewModel.kt", i = {}, l = {162, 163}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.ifriend.presentation.features.chat.screen.viewmodel.ChatViewModel$1  reason: invalid class name */
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
                if (ChatViewModel.this.chatClientInteractor.launch(ChatViewModel.this.chatId, this) == coroutine_suspended) {
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
            if (ChatViewModel.this.chatsInfoInteractor.setLastActiveChat(ChatViewModel.this.chatId, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    /* compiled from: ChatViewModel.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.presentation.features.chat.screen.viewmodel.ChatViewModel$4  reason: invalid class name */
    /* loaded from: classes6.dex */
    static final class AnonymousClass4 extends Lambda implements Function0<Unit> {
        AnonymousClass4() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            AnalyticsRateUsModalUseCase.handle$default(ChatViewModel.this.analyticsRateUsUseCase, true, null, 2, null);
            ChatViewModel.this.onUserRateUsUseCase.execute();
        }
    }

    /* compiled from: ChatViewModel.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.presentation.features.chat.screen.viewmodel.ChatViewModel$5  reason: invalid class name */
    /* loaded from: classes6.dex */
    static final class AnonymousClass5 extends Lambda implements Function0<Unit> {
        AnonymousClass5() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            AnalyticsRateUsModalUseCase.handle$default(ChatViewModel.this.analyticsRateUsUseCase, false, null, 2, null);
        }
    }

    private final void initObservers() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), this.coroutineErrorHandler, null, new ChatViewModel$initObservers$1(this, null), 2, null);
    }

    public final void onNotificationDismissed(ChatNotificationUi notification) {
        Intrinsics.checkNotNullParameter(notification, "notification");
        hideNotification(this, notification);
    }

    public final void onNotificationClick(ChatNotificationUi notification) {
        Intrinsics.checkNotNullParameter(notification, "notification");
        this.chatScreenAnalyticsUseCase.trackInAppNotificationClick(notification.getTitle(), notification.getMessage(), notification.getChatId());
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ChatViewModel$onNotificationClick$1(this, notification, null), 3, null);
    }

    public final void onOpenMenuClick() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ChatViewModel$onOpenMenuClick$1(this, null), 3, null);
    }

    public final void onAddNeuronsClick() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ChatViewModel$onAddNeuronsClick$1(this, null), 3, null);
    }

    public final void onUpgradeClick() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ChatViewModel$onUpgradeClick$1(this, null), 3, null);
    }

    public final void onChatAvatarClick() {
        chatAvatarClick(this);
    }

    public final void onChatNameClick() {
        chatNameClick(this);
    }

    public final void onChatIntroCloseClick() {
        closeChatIntro(this);
    }

    public final void onChatIntroContinueClick() {
        showNextChatIntroCard(this);
    }

    public final void onMessageChanged(String str) {
        Intrinsics.checkNotNullParameter(str, "new");
        changeInputMessage(this, str);
    }

    public final void onClearMessageClicked() {
        clearInputMessage(this);
    }

    public final void onRecordAudioPressed() {
        this.voiceRecordingAnalytics.trackUserClickRecordMessage(this.chatId);
    }

    public final void onAudioPermissionGranted() {
        this.voiceRecordingAnalytics.trackUserAllowRecording(this.chatId);
    }

    public final void onBackClick() {
        this.chatScreenAnalyticsUseCase.trackClickBackScreen(getChatHeaderState().getValue().getUnreadMessagesCount(), this.chatId);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ChatViewModel$onBackClick$1(this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onBackPressed() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ChatViewModel$onBackPressed$1(this, null), 3, null);
    }

    public final void onResume() {
        handleDeepLinks(this, this.chatId);
    }

    private final void clearBadges() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), this.coroutineErrorHandler, null, new ChatViewModel$clearBadges$1(this, null), 2, null);
    }

    private final void checkNotificationPermission(Context context) {
        boolean booleanWithKey$default = Preferences.DefaultImpls.getBooleanWithKey$default(this.preferences, Constants.NOTIFICATION_PERMISSION, false, 2, null);
        boolean areNotificationsEnabled = areNotificationsEnabled(context);
        if (booleanWithKey$default != areNotificationsEnabled) {
            this.analyticsNotificationPermissionChangedUseCase.handle(areNotificationsEnabled);
            this.preferences.saveBooleanWithKey(Constants.NOTIFICATION_PERMISSION, Boolean.valueOf(areNotificationsEnabled));
        }
    }

    private final boolean areNotificationsEnabled(Context context) {
        Object obj;
        int importance;
        boolean z;
        if (NotificationManagerCompat.from(context).areNotificationsEnabled()) {
            if (Build.VERSION.SDK_INT >= 26) {
                List<NotificationChannel> notificationChannels = NotificationManagerCompat.from(context).getNotificationChannels();
                Intrinsics.checkNotNullExpressionValue(notificationChannels, "getNotificationChannels(...)");
                Iterator<T> it = notificationChannels.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    importance = UIUtils$$ExternalSyntheticApiModelOutline0.m(obj).getImportance();
                    if (importance == 0) {
                        z = true;
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                    if (z) {
                        break;
                    }
                }
                if (obj != null) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public final void onStart(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        clearBadges();
        checkNotificationPermission(context);
        ChatNotificationsDelegate.DefaultImpls.initNotificationsObserver$default(this, this, 0, 0L, new ChatViewModel$onStart$1(this), 6, null);
    }

    public final void onStop() {
        disposeNotificationsObserver();
    }

    public final void onDestroy() {
        clearChatInputDelegate(this);
    }

    public final void onDismissPhotoModalPopup() {
        dismissPhotoModalPopup(this);
    }

    public final void logFocusRequesterThrowable(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        this.analyticsInteractor.trackException("FocusRequester", throwable);
    }

    @Override // com.ifriend.presentation.common.ActionDispatcher
    public void dispatchAction(ChatAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (action instanceof ChatAction.GiftClick) {
            giftClick(this, ((ChatAction.GiftClick) action).getGift(), this.chatId);
        } else if (action instanceof ChatAction.GiftsCloseClick) {
            giftsCloseClick(this);
        } else if (action instanceof ChatAction.OpenGiftsClick) {
            giftsClick(this, this.chatId);
        } else if (action instanceof ChatAction.PaidAction) {
            dispatchPaidAction(this, (ChatAction.PaidAction) action, this.chatId);
        } else if (action instanceof ChatAction.NightButtonRemindClicked) {
            remindButtonClicked(this);
        } else if (action instanceof ChatAction.NightButtonPermissionGranted) {
            remindPermissionGranted(this, ((ChatAction.NightButtonPermissionGranted) action).getGranted());
        } else if (action instanceof ChatAction.StopRecording) {
            stopRecordAudio(this, !((ChatAction.StopRecording) action).getSend());
        } else if (Intrinsics.areEqual(action, ChatAction.SubscriptionBadgeClick.INSTANCE)) {
            this.appEventsEmitter.emit(new AppEvents.Billing.BuyChatSubscription(new BuyChatSubscriptionBillingUiParams((UUID) null, this.chatId, false, UpgradeType.ALL, (PurchaseReason) PurchaseReason.Purchase.INSTANCE, (PurchaseSource) null, 33, (DefaultConstructorMarker) null)));
        }
    }
}
