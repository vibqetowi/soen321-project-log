package com.ifriend.presentation.features.app.viewmodel;

import android.content.Intent;
import androidx.activity.result.ActivityResult;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.facebook.internal.NativeProtocol;
import com.ifriend.analytics.usecase.screenshot.AnalyticsScreenName;
import com.ifriend.core.tools.api.AppIdentityConverter;
import com.ifriend.core.tools.api.DispatcherProvider;
import com.ifriend.core.utils.CoroutinesKt;
import com.ifriend.domain.data.chat.ChatsInfoConfigurationRepository;
import com.ifriend.domain.logic.logout.LogoutUseCase;
import com.ifriend.internal_notifications.notification.InternalNotification;
import com.ifriend.presentation.common.exception.ThrowablesKt;
import com.ifriend.presentation.common.exception.mappers.FeatureExceptionMapper;
import com.ifriend.presentation.common.observers.FlowObserver;
import com.ifriend.presentation.common.observers.appevents.AppEvents;
import com.ifriend.presentation.common.observers.appevents.params.BuyChatSubscriptionBillingUiParams;
import com.ifriend.presentation.common.observers.appevents.params.BuyNeuronsBillingUiParams;
import com.ifriend.presentation.common.observers.appevents.params.BuySubscriptionBillingUiParams;
import com.ifriend.presentation.common.uistate.UiStateDelegate;
import com.ifriend.presentation.common.uistate.UiStateDelegateImpl;
import com.ifriend.presentation.features.app.delegates.AppChatEventsDelegate;
import com.ifriend.presentation.features.app.delegates.AppChatEventsDelegateImpl;
import com.ifriend.presentation.features.app.delegates.AppChatMessagesDelegate;
import com.ifriend.presentation.features.app.delegates.AppChatMessagesDelegateImpl;
import com.ifriend.presentation.features.app.delegates.AppDeepLinksDelegate;
import com.ifriend.presentation.features.app.delegates.AppDeepLinksDelegateImpl;
import com.ifriend.presentation.features.app.delegates.AppNavigationDelegate;
import com.ifriend.presentation.features.app.delegates.AppNavigationDelegateImpl;
import com.ifriend.presentation.features.app.delegates.AppReloadDataDelegate;
import com.ifriend.presentation.features.app.delegates.AppReloadDataDelegateImpl;
import com.ifriend.presentation.features.app.delegates.AppServicesDelegate;
import com.ifriend.presentation.features.app.delegates.AppServicesDelegateImpl;
import com.ifriend.presentation.features.app.delegates.AppStartFlowDelegate;
import com.ifriend.presentation.features.app.delegates.AppStartFlowDelegateImpl;
import com.ifriend.presentation.features.app.delegates.BillingEventDelegate;
import com.ifriend.presentation.features.app.delegates.BillingEventDelegateImpl;
import com.ifriend.presentation.features.app.delegates.OnboardingSubmittedDelegate;
import com.ifriend.presentation.features.app.delegates.OnboardingSubmittedDelegateImpl;
import com.ifriend.presentation.features.app.delegates.PurchaseInfoDelegate;
import com.ifriend.presentation.features.app.delegates.PurchaseInfoDelegateImpl;
import com.ifriend.presentation.features.app.delegates.StartChatFlowDelegate;
import com.ifriend.presentation.features.app.delegates.StartChatFlowDelegateImpl;
import com.ifriend.presentation.features.app.viewmodel.models.AppSystemState;
import com.ifriend.presentation.features.update.delegate.InAppUpdateDelegate;
import com.ifriend.presentation.features.update.delegate.InAppUpdateDelegateImpl;
import com.ifriend.presentation.features.update.model.InAppUpdateEvent;
import com.ifriend.presentation.features.update.model.InAppUpdateState;
import javax.inject.Inject;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
/* compiled from: AppViewModel.kt */
@Metadata(d1 = {"\u0000â\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n2\u00020\u000b2\u00020\f2\u00020\r2\u00020\u000e2\u00020\u000f2\u00020\u00102\u00020\u0011:\u0004 \u0001¡\u0001B½\u0001\b\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\u0006\u0010\u001c\u001a\u00020\u001d\u0012\u0006\u0010\u001e\u001a\u00020\u001f\u0012\u0006\u0010 \u001a\u00020!\u0012\u0006\u0010\"\u001a\u00020#\u0012\u0006\u0010$\u001a\u00020%\u0012\u0006\u0010&\u001a\u00020'\u0012\u0006\u0010(\u001a\u00020)\u0012\u0006\u0010*\u001a\u00020+\u0012\u0006\u0010,\u001a\u00020-\u0012\u0006\u0010.\u001a\u00020/\u0012\u0006\u00100\u001a\u000201\u0012\u0015\u00102\u001a\u0011\u0012\t\u0012\u000704¢\u0006\u0002\b503j\u0002`6\u0012\u0015\u00107\u001a\u0011\u0012\t\u0012\u000708¢\u0006\u0002\b503j\u0002`9\u0012\u0006\u0010:\u001a\u00020;¢\u0006\u0002\u0010<J\t\u0010N\u001a\u00020OH\u0096\u0001J\t\u0010P\u001a\u00020OH\u0096\u0001J\t\u0010Q\u001a\u00020OH\u0096\u0001J\u0013\u0010R\u001a\u00020O2\b\b\u0002\u0010S\u001a\u00020TH\u0096\u0001J\u001a\u0010U\u001a\u00020O2\u0006\u0010V\u001a\u00020WH\u0096\u0001R\u00020\u0000¢\u0006\u0002\u0010XJ\u0010\u0010Y\u001a\u00020O2\u0006\u0010V\u001a\u000204H\u0002J\u001a\u0010Z\u001a\u00020O2\u0006\u0010V\u001a\u00020[H\u0096\u0001R\u00020\u0000¢\u0006\u0002\u0010\\J\u001a\u0010]\u001a\u00020O2\u0006\u0010^\u001a\u00020_H\u0096\u0001R\u00020\u0000¢\u0006\u0002\u0010`J\u0010\u0010a\u001a\u00020O2\u0006\u0010b\u001a\u000208H\u0002J\u001a\u0010c\u001a\u00020O2\u0006\u0010V\u001a\u00020dH\u0096\u0001R\u00020\u0000¢\u0006\u0002\u0010eJ\u0010\u0010f\u001a\u00020O2\u0006\u0010g\u001a\u00020hH\u0002J\u001a\u0010i\u001a\u00020O2\u0006\u0010V\u001a\u00020jH\u0096\u0001R\u00020\u0000¢\u0006\u0002\u0010kJ\u0011\u0010l\u001a\u00020O2\u0006\u0010m\u001a\u00020nH\u0096\u0001J\u0010\u0010o\u001a\u00020O2\u0006\u0010p\u001a\u00020TH\u0002J\b\u0010q\u001a\u00020OH\u0014J\u0010\u0010r\u001a\u00020O2\b\u0010^\u001a\u0004\u0018\u00010_J\u0010\u0010s\u001a\u00020O2\b\u0010^\u001a\u0004\u0018\u00010_J\u0010\u0010t\u001a\u00020O2\u0006\u0010u\u001a\u00020vH\u0016J\u0010\u0010w\u001a\u00020O2\u0006\u0010u\u001a\u00020vH\u0016J\u0016\u0010x\u001a\u00020O2\u0006\u0010y\u001a\u00020z2\u0006\u0010{\u001a\u00020hJ\u0006\u0010|\u001a\u00020OJ\u0006\u0010}\u001a\u00020OJ\u000e\u0010~\u001a\u00020O2\u0006\u0010m\u001a\u00020nJ\u0006\u0010\u007f\u001a\u00020OJ\u001c\u0010\u0080\u0001\u001a\u00020O2\u0006\u0010V\u001a\u000204H\u0096\u0001R\u00020\u0000¢\u0006\u0003\u0010\u0081\u0001J\t\u0010\u0082\u0001\u001a\u00020OH\u0002J\n\u0010\u0083\u0001\u001a\u00020OH\u0096\u0001J\u0014\u0010\u0084\u0001\u001a\u00020OH\u0096\u0001R\u00020\u0000¢\u0006\u0003\u0010\u0085\u0001J\n\u0010\u0086\u0001\u001a\u00020OH\u0096\u0001J\u001e\u0010\u0087\u0001\u001a\u00020O2\b\u0010\u0088\u0001\u001a\u00030\u0089\u0001H\u0096\u0001R\u00020\u0000¢\u0006\u0003\u0010\u008a\u0001J\u001d\u0010\u008b\u0001\u001a\u00020O2\b\u0010^\u001a\u0004\u0018\u00010_H\u0096\u0001R\u00020\u0000¢\u0006\u0002\u0010`J\n\u0010\u008c\u0001\u001a\u00020OH\u0096\u0001J\u0014\u0010\u008d\u0001\u001a\u00020OH\u0096\u0001R\u00020\u0001¢\u0006\u0003\u0010\u008e\u0001J7\u0010\u008f\u0001\u001a\u00020O*\u00030\u0090\u00012&\u0010\u0091\u0001\u001a!\u0012\u0016\u0012\u00140\u0003¢\u0006\u000f\b\u0093\u0001\u0012\n\b\u0094\u0001\u0012\u0005\b\b(\u0095\u0001\u0012\u0004\u0012\u00020\u00030\u0092\u0001H\u0097\u0001JM\u0010\u0096\u0001\u001a\u00030\u0097\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\b\u0010\u0098\u0001\u001a\u00030\u0090\u00012&\u0010\u0099\u0001\u001a!\u0012\u0016\u0012\u00140\u0003¢\u0006\u000f\b\u0093\u0001\u0012\n\b\u0094\u0001\u0012\u0005\b\b(\u0095\u0001\u0012\u0004\u0012\u00020\u00030\u0092\u0001H\u0096\u0001J\u000e\u0010\u009a\u0001\u001a\u00020O*\u00020\u0000H\u0096\u0001JK\u0010\u009b\u0001\u001a\u00020O*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022&\u0010\u0091\u0001\u001a!\u0012\u0016\u0012\u00140\u0003¢\u0006\u000f\b\u0093\u0001\u0012\n\b\u0094\u0001\u0012\u0005\b\b(\u0095\u0001\u0012\u0004\u0012\u00020\u00030\u0092\u0001H\u0097Aø\u0001\u0000¢\u0006\u0003\u0010\u009c\u0001J+\u0010\u009d\u0001\u001a\u00020O*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010V\u001a\u00020\u0004H\u0096Aø\u0001\u0000¢\u0006\u0003\u0010\u009e\u0001JJ\u0010\u009f\u0001\u001a\u00020O*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022%\u0010\u0099\u0001\u001a \u0012\u0015\u0012\u00130\u0003¢\u0006\u000e\b\u0093\u0001\u0012\t\b\u0094\u0001\u0012\u0004\b\b(K\u0012\u0004\u0012\u00020\u00030\u0092\u0001H\u0096Aø\u0001\u0000¢\u0006\u0003\u0010\u009c\u0001R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010=\u001a\b\u0012\u0004\u0012\u00020?0>X\u0096\u0005¢\u0006\u0006\u001a\u0004\b@\u0010AR\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00040CX\u0096\u0005¢\u0006\u0006\u001a\u0004\bD\u0010ER\u0018\u0010F\u001a\b\u0012\u0004\u0012\u00020G0CX\u0096\u0005¢\u0006\u0006\u001a\u0004\bH\u0010ER\u0018\u0010I\u001a\b\u0012\u0004\u0012\u00020\u00030>X\u0096\u0005¢\u0006\u0006\u001a\u0004\bJ\u0010AR\"\u0010K\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002X\u0096\u0005¢\u0006\u0006\u001a\u0004\bL\u0010M\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006¢\u0001"}, d2 = {"Lcom/ifriend/presentation/features/app/viewmodel/AppViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/ifriend/presentation/common/uistate/UiStateDelegate;", "Lcom/ifriend/presentation/features/app/viewmodel/AppViewModel$UiState;", "Lcom/ifriend/presentation/features/app/viewmodel/AppViewModel$Event;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Lcom/ifriend/presentation/features/app/delegates/AppChatEventsDelegate;", "Lcom/ifriend/presentation/features/app/delegates/AppReloadDataDelegate;", "Lcom/ifriend/presentation/features/app/delegates/AppDeepLinksDelegate;", "Lcom/ifriend/presentation/features/app/delegates/BillingEventDelegate;", "Lcom/ifriend/presentation/features/app/delegates/AppStartFlowDelegate;", "Lcom/ifriend/presentation/features/app/delegates/StartChatFlowDelegate;", "Lcom/ifriend/presentation/features/app/delegates/OnboardingSubmittedDelegate;", "Lcom/ifriend/presentation/features/app/delegates/AppNavigationDelegate;", "Lcom/ifriend/presentation/features/app/delegates/AppChatMessagesDelegate;", "Lcom/ifriend/presentation/features/app/delegates/AppServicesDelegate;", "Lcom/ifriend/presentation/features/update/delegate/InAppUpdateDelegate;", "Lcom/ifriend/presentation/features/app/delegates/PurchaseInfoDelegate;", "chatsInfoConfigurationRepository", "Lcom/ifriend/domain/data/chat/ChatsInfoConfigurationRepository;", "featureExceptionMapper", "Lcom/ifriend/presentation/common/exception/mappers/FeatureExceptionMapper;", "logoutUseCase", "Lcom/ifriend/domain/logic/logout/LogoutUseCase;", "appIdentityConverter", "Lcom/ifriend/core/tools/api/AppIdentityConverter;", "dispatchers", "Lcom/ifriend/core/tools/api/DispatcherProvider;", "appServicesDelegate", "Lcom/ifriend/presentation/features/app/delegates/AppServicesDelegateImpl;", "appChatMessagesDelegate", "Lcom/ifriend/presentation/features/app/delegates/AppChatMessagesDelegateImpl;", "addNeuronsBillingDelegate", "Lcom/ifriend/presentation/features/app/delegates/BillingEventDelegateImpl;", "appStartFlowDelegate", "Lcom/ifriend/presentation/features/app/delegates/AppStartFlowDelegateImpl;", "deepLinkDelegate", "Lcom/ifriend/presentation/features/app/delegates/AppDeepLinksDelegateImpl;", "appReloadDataDelegate", "Lcom/ifriend/presentation/features/app/delegates/AppReloadDataDelegateImpl;", "startChatFlowDelegate", "Lcom/ifriend/presentation/features/app/delegates/StartChatFlowDelegateImpl;", "appChatEventsDelegate", "Lcom/ifriend/presentation/features/app/delegates/AppChatEventsDelegateImpl;", "onboardingSubmittedDelegate", "Lcom/ifriend/presentation/features/app/delegates/OnboardingSubmittedDelegateImpl;", "appNavigationDelegate", "Lcom/ifriend/presentation/features/app/delegates/AppNavigationDelegateImpl;", "purchaseInfoDelegate", "Lcom/ifriend/presentation/features/app/delegates/PurchaseInfoDelegateImpl;", "appEventsFlow", "Lcom/ifriend/presentation/common/observers/FlowObserver;", "Lcom/ifriend/presentation/common/observers/appevents/AppEvents;", "Lkotlin/jvm/JvmSuppressWildcards;", "Lcom/ifriend/presentation/common/observers/appevents/AppEventsFlow;", "exceptionsFlow", "", "Lcom/ifriend/presentation/common/observers/exceptions/ExceptionsFlow;", "appUpdatesDelegate", "Lcom/ifriend/presentation/features/update/delegate/InAppUpdateDelegateImpl;", "(Lcom/ifriend/domain/data/chat/ChatsInfoConfigurationRepository;Lcom/ifriend/presentation/common/exception/mappers/FeatureExceptionMapper;Lcom/ifriend/domain/logic/logout/LogoutUseCase;Lcom/ifriend/core/tools/api/AppIdentityConverter;Lcom/ifriend/core/tools/api/DispatcherProvider;Lcom/ifriend/presentation/features/app/delegates/AppServicesDelegateImpl;Lcom/ifriend/presentation/features/app/delegates/AppChatMessagesDelegateImpl;Lcom/ifriend/presentation/features/app/delegates/BillingEventDelegateImpl;Lcom/ifriend/presentation/features/app/delegates/AppStartFlowDelegateImpl;Lcom/ifriend/presentation/features/app/delegates/AppDeepLinksDelegateImpl;Lcom/ifriend/presentation/features/app/delegates/AppReloadDataDelegateImpl;Lcom/ifriend/presentation/features/app/delegates/StartChatFlowDelegateImpl;Lcom/ifriend/presentation/features/app/delegates/AppChatEventsDelegateImpl;Lcom/ifriend/presentation/features/app/delegates/OnboardingSubmittedDelegateImpl;Lcom/ifriend/presentation/features/app/delegates/AppNavigationDelegateImpl;Lcom/ifriend/presentation/features/app/delegates/PurchaseInfoDelegateImpl;Lcom/ifriend/presentation/common/observers/FlowObserver;Lcom/ifriend/presentation/common/observers/FlowObserver;Lcom/ifriend/presentation/features/update/delegate/InAppUpdateDelegateImpl;)V", "inAppUpdateState", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/ifriend/presentation/features/update/model/InAppUpdateState;", "getInAppUpdateState", "()Lkotlinx/coroutines/flow/StateFlow;", "singleEvents", "Lkotlinx/coroutines/flow/Flow;", "getSingleEvents", "()Lkotlinx/coroutines/flow/Flow;", "startUpdateEvents", "Lcom/ifriend/presentation/features/update/model/InAppUpdateEvent;", "getStartUpdateEvents", "uiStateFlow", "getUiStateFlow", "uiState", "getUiState", "(Lcom/ifriend/presentation/common/uistate/UiStateDelegate;)Lcom/ifriend/presentation/features/app/viewmodel/AppViewModel$UiState;", "checkForAppUpdates", "", "clearInAppUpdateDelegate", "completeUpdate", "dismissUpdatePopup", "fromUser", "", "handleAppChatEvents", NotificationCompat.CATEGORY_EVENT, "Lcom/ifriend/presentation/common/observers/appevents/AppEvents$Chat;", "(Lcom/ifriend/presentation/features/app/viewmodel/AppViewModel;Lcom/ifriend/presentation/common/observers/appevents/AppEvents$Chat;)V", "handleAppEvents", "handleBillingEvent", "Lcom/ifriend/presentation/common/observers/appevents/AppEvents$Billing;", "(Lcom/ifriend/presentation/features/app/viewmodel/AppViewModel;Lcom/ifriend/presentation/common/observers/appevents/AppEvents$Billing;)V", "handleDeepLinks", "intent", "Landroid/content/Intent;", "(Lcom/ifriend/presentation/features/app/viewmodel/AppViewModel;Landroid/content/Intent;)V", "handleError", "throwable", "handleNavigationEvents", "Lcom/ifriend/presentation/common/observers/appevents/AppEvents$Navigation;", "(Lcom/ifriend/presentation/features/app/viewmodel/AppViewModel;Lcom/ifriend/presentation/common/observers/appevents/AppEvents$Navigation;)V", "handleOpenLinkEvent", "link", "", "handlePurchaseInfoEvent", "Lcom/ifriend/presentation/common/observers/appevents/AppEvents$PurchaseInfo;", "(Lcom/ifriend/presentation/features/app/viewmodel/AppViewModel;Lcom/ifriend/presentation/common/observers/appevents/AppEvents$PurchaseInfo;)V", "handleStartUpdateResult", "result", "Landroidx/activity/result/ActivityResult;", "logout", "hard", "onCleared", "onNewIntent", "onNewProcess", "onPause", "owner", "Landroidx/lifecycle/LifecycleOwner;", "onResume", "onTrackScreenshot", "screenName", "Lcom/ifriend/analytics/usecase/screenshot/AnalyticsScreenName;", "platformName", "onUpdateClick", "onUpdatePopupDismiss", "onUpdatePromptResult", "onUpdateSnackbarClick", "onboardingDataSubmitted", "(Lcom/ifriend/presentation/features/app/viewmodel/AppViewModel;Lcom/ifriend/presentation/common/observers/appevents/AppEvents;)V", "restartApp", "showUpdatePrompt", "startAppChatLaunchService", "(Lcom/ifriend/presentation/features/app/viewmodel/AppViewModel;)V", "startAppServices", "startChatFlow", "navigationMode", "Lcom/ifriend/presentation/common/observers/appevents/AppEvents$StartChatFlow$NavigationMode;", "(Lcom/ifriend/presentation/features/app/viewmodel/AppViewModel;Lcom/ifriend/presentation/common/observers/appevents/AppEvents$StartChatFlow$NavigationMode;)V", "startFlow", "stopAppServices", "tryReloadData", "(Landroidx/lifecycle/ViewModel;)V", "asyncReduce", "Lkotlinx/coroutines/CoroutineScope;", NativeProtocol.WEB_DIALOG_ACTION, "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "state", "asyncUpdateUiState", "Lkotlinx/coroutines/Job;", "coroutineScope", "transform", "initAppReloadData", "reduce", "(Lcom/ifriend/presentation/common/uistate/UiStateDelegate;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendEvent", "(Lcom/ifriend/presentation/common/uistate/UiStateDelegate;Lcom/ifriend/presentation/features/app/viewmodel/AppViewModel$Event;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateUiState", "Event", "UiState", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AppViewModel extends ViewModel implements UiStateDelegate<UiState, Event>, DefaultLifecycleObserver, AppChatEventsDelegate, AppReloadDataDelegate, AppDeepLinksDelegate, BillingEventDelegate, AppStartFlowDelegate, StartChatFlowDelegate, OnboardingSubmittedDelegate, AppNavigationDelegate, AppChatMessagesDelegate, AppServicesDelegate, InAppUpdateDelegate, PurchaseInfoDelegate {
    public static final int $stable = 8;
    private final /* synthetic */ UiStateDelegateImpl<UiState, Event> $$delegate_0;
    private final /* synthetic */ AppChatEventsDelegateImpl $$delegate_1;
    private final /* synthetic */ AppServicesDelegateImpl $$delegate_10;
    private final /* synthetic */ InAppUpdateDelegateImpl $$delegate_11;
    private final /* synthetic */ PurchaseInfoDelegateImpl $$delegate_12;
    private final /* synthetic */ AppReloadDataDelegateImpl $$delegate_2;
    private final /* synthetic */ AppDeepLinksDelegateImpl $$delegate_3;
    private final /* synthetic */ BillingEventDelegateImpl $$delegate_4;
    private final /* synthetic */ AppStartFlowDelegateImpl $$delegate_5;
    private final /* synthetic */ StartChatFlowDelegateImpl $$delegate_6;
    private final /* synthetic */ OnboardingSubmittedDelegateImpl $$delegate_7;
    private final /* synthetic */ AppNavigationDelegateImpl $$delegate_8;
    private final /* synthetic */ AppChatMessagesDelegateImpl $$delegate_9;
    private final AppIdentityConverter appIdentityConverter;
    private final ChatsInfoConfigurationRepository chatsInfoConfigurationRepository;
    private final DispatcherProvider dispatchers;
    private final FeatureExceptionMapper featureExceptionMapper;
    private final LogoutUseCase logoutUseCase;

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    @Deprecated(message = "use method UiStateDelegate<UiState, Event>.asyncUpdateInternalState")
    public void asyncReduce(CoroutineScope coroutineScope, Function1<? super UiState, ? extends UiState> action) {
        Intrinsics.checkNotNullParameter(coroutineScope, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        this.$$delegate_0.asyncReduce(coroutineScope, action);
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    public Job asyncUpdateUiState(UiStateDelegate<UiState, Event> uiStateDelegate, CoroutineScope coroutineScope, Function1<? super UiState, ? extends UiState> transform) {
        Intrinsics.checkNotNullParameter(uiStateDelegate, "<this>");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return this.$$delegate_0.asyncUpdateUiState(uiStateDelegate, coroutineScope, transform);
    }

    @Override // com.ifriend.presentation.features.update.delegate.InAppUpdateDelegate
    public void checkForAppUpdates() {
        this.$$delegate_11.checkForAppUpdates();
    }

    @Override // com.ifriend.presentation.features.update.delegate.InAppUpdateDelegate
    public void clearInAppUpdateDelegate() {
        this.$$delegate_11.clearInAppUpdateDelegate();
    }

    @Override // com.ifriend.presentation.features.update.delegate.InAppUpdateDelegate
    public void completeUpdate() {
        this.$$delegate_11.completeUpdate();
    }

    @Override // com.ifriend.presentation.features.update.delegate.InAppUpdateDelegate
    public void dismissUpdatePopup(boolean z) {
        this.$$delegate_11.dismissUpdatePopup(z);
    }

    @Override // com.ifriend.presentation.features.update.delegate.InAppUpdateDelegate
    public StateFlow<InAppUpdateState> getInAppUpdateState() {
        return this.$$delegate_11.getInAppUpdateState();
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    public Flow<Event> getSingleEvents() {
        return this.$$delegate_0.getSingleEvents();
    }

    @Override // com.ifriend.presentation.features.update.delegate.InAppUpdateDelegate
    public Flow<InAppUpdateEvent> getStartUpdateEvents() {
        return this.$$delegate_11.getStartUpdateEvents();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    public UiState getUiState(UiStateDelegate<UiState, Event> uiStateDelegate) {
        Intrinsics.checkNotNullParameter(uiStateDelegate, "<this>");
        return this.$$delegate_0.getUiState(uiStateDelegate);
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    public StateFlow<UiState> getUiStateFlow() {
        return this.$$delegate_0.getUiStateFlow();
    }

    @Override // com.ifriend.presentation.features.app.delegates.AppChatEventsDelegate
    public void handleAppChatEvents(AppViewModel context_receiver_0, AppEvents.Chat event) {
        Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
        Intrinsics.checkNotNullParameter(event, "event");
        this.$$delegate_1.handleAppChatEvents(context_receiver_0, event);
    }

    @Override // com.ifriend.presentation.features.app.delegates.BillingEventDelegate
    public void handleBillingEvent(AppViewModel context_receiver_0, AppEvents.Billing event) {
        Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
        Intrinsics.checkNotNullParameter(event, "event");
        this.$$delegate_4.handleBillingEvent(context_receiver_0, event);
    }

    @Override // com.ifriend.presentation.features.app.delegates.AppDeepLinksDelegate
    public void handleDeepLinks(AppViewModel context_receiver_0, Intent intent) {
        Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
        Intrinsics.checkNotNullParameter(intent, "intent");
        this.$$delegate_3.handleDeepLinks(context_receiver_0, intent);
    }

    @Override // com.ifriend.presentation.features.app.delegates.AppNavigationDelegate
    public void handleNavigationEvents(AppViewModel context_receiver_0, AppEvents.Navigation event) {
        Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
        Intrinsics.checkNotNullParameter(event, "event");
        this.$$delegate_8.handleNavigationEvents(context_receiver_0, event);
    }

    @Override // com.ifriend.presentation.features.app.delegates.PurchaseInfoDelegate
    public void handlePurchaseInfoEvent(AppViewModel context_receiver_0, AppEvents.PurchaseInfo event) {
        Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
        Intrinsics.checkNotNullParameter(event, "event");
        this.$$delegate_12.handlePurchaseInfoEvent(context_receiver_0, event);
    }

    @Override // com.ifriend.presentation.features.update.delegate.InAppUpdateDelegate
    public void handleStartUpdateResult(ActivityResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.$$delegate_11.handleStartUpdateResult(result);
    }

    @Override // com.ifriend.presentation.features.app.delegates.AppReloadDataDelegate
    public void initAppReloadData(AppViewModel appViewModel) {
        Intrinsics.checkNotNullParameter(appViewModel, "<this>");
        this.$$delegate_2.initAppReloadData(appViewModel);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "owner");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onDestroy(LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "owner");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "owner");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "owner");
    }

    @Override // com.ifriend.presentation.features.app.delegates.OnboardingSubmittedDelegate
    public void onboardingDataSubmitted(AppViewModel context_receiver_0, AppEvents event) {
        Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
        Intrinsics.checkNotNullParameter(event, "event");
        this.$$delegate_7.onboardingDataSubmitted(context_receiver_0, event);
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    @Deprecated(message = "use method UiStateDelegate<UiState, Event>.updateUiState")
    public Object reduce(UiStateDelegate<UiState, Event> uiStateDelegate, Function1<? super UiState, ? extends UiState> function1, Continuation<? super Unit> continuation) {
        return this.$$delegate_0.reduce(uiStateDelegate, function1, continuation);
    }

    /* renamed from: sendEvent  reason: avoid collision after fix types in other method */
    public Object sendEvent2(UiStateDelegate<UiState, Event> uiStateDelegate, Event event, Continuation<? super Unit> continuation) {
        return this.$$delegate_0.sendEvent(uiStateDelegate, event, continuation);
    }

    @Override // com.ifriend.presentation.features.update.delegate.InAppUpdateDelegate
    public void showUpdatePrompt() {
        this.$$delegate_11.showUpdatePrompt();
    }

    @Override // com.ifriend.presentation.features.app.delegates.AppChatMessagesDelegate
    public void startAppChatLaunchService(AppViewModel context_receiver_0) {
        Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
        this.$$delegate_9.startAppChatLaunchService(context_receiver_0);
    }

    @Override // com.ifriend.presentation.features.app.delegates.AppServicesDelegate
    public void startAppServices() {
        this.$$delegate_10.startAppServices();
    }

    @Override // com.ifriend.presentation.features.app.delegates.StartChatFlowDelegate
    public void startChatFlow(AppViewModel context_receiver_0, AppEvents.StartChatFlow.NavigationMode navigationMode) {
        Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
        Intrinsics.checkNotNullParameter(navigationMode, "navigationMode");
        this.$$delegate_6.startChatFlow(context_receiver_0, navigationMode);
    }

    @Override // com.ifriend.presentation.features.app.delegates.AppStartFlowDelegate
    public void startFlow(AppViewModel context_receiver_0, Intent intent) {
        Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
        this.$$delegate_5.startFlow(context_receiver_0, intent);
    }

    @Override // com.ifriend.presentation.features.app.delegates.AppServicesDelegate
    public void stopAppServices() {
        this.$$delegate_10.stopAppServices();
    }

    @Override // com.ifriend.presentation.features.app.delegates.AppReloadDataDelegate
    public void tryReloadData(ViewModel context_receiver_0) {
        Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
        this.$$delegate_2.tryReloadData(context_receiver_0);
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    public Object updateUiState(UiStateDelegate<UiState, Event> uiStateDelegate, Function1<? super UiState, ? extends UiState> function1, Continuation<? super Unit> continuation) {
        return this.$$delegate_0.updateUiState(uiStateDelegate, function1, continuation);
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    public /* bridge */ /* synthetic */ Object sendEvent(UiStateDelegate<UiState, Event> uiStateDelegate, Event event, Continuation continuation) {
        return sendEvent2(uiStateDelegate, event, (Continuation<? super Unit>) continuation);
    }

    @Inject
    public AppViewModel(ChatsInfoConfigurationRepository chatsInfoConfigurationRepository, FeatureExceptionMapper featureExceptionMapper, LogoutUseCase logoutUseCase, AppIdentityConverter appIdentityConverter, DispatcherProvider dispatchers, AppServicesDelegateImpl appServicesDelegate, AppChatMessagesDelegateImpl appChatMessagesDelegate, BillingEventDelegateImpl addNeuronsBillingDelegate, AppStartFlowDelegateImpl appStartFlowDelegate, AppDeepLinksDelegateImpl deepLinkDelegate, AppReloadDataDelegateImpl appReloadDataDelegate, StartChatFlowDelegateImpl startChatFlowDelegate, AppChatEventsDelegateImpl appChatEventsDelegate, OnboardingSubmittedDelegateImpl onboardingSubmittedDelegate, AppNavigationDelegateImpl appNavigationDelegate, PurchaseInfoDelegateImpl purchaseInfoDelegate, FlowObserver<AppEvents> appEventsFlow, FlowObserver<Throwable> exceptionsFlow, InAppUpdateDelegateImpl appUpdatesDelegate) {
        Intrinsics.checkNotNullParameter(chatsInfoConfigurationRepository, "chatsInfoConfigurationRepository");
        Intrinsics.checkNotNullParameter(featureExceptionMapper, "featureExceptionMapper");
        Intrinsics.checkNotNullParameter(logoutUseCase, "logoutUseCase");
        Intrinsics.checkNotNullParameter(appIdentityConverter, "appIdentityConverter");
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        Intrinsics.checkNotNullParameter(appServicesDelegate, "appServicesDelegate");
        Intrinsics.checkNotNullParameter(appChatMessagesDelegate, "appChatMessagesDelegate");
        Intrinsics.checkNotNullParameter(addNeuronsBillingDelegate, "addNeuronsBillingDelegate");
        Intrinsics.checkNotNullParameter(appStartFlowDelegate, "appStartFlowDelegate");
        Intrinsics.checkNotNullParameter(deepLinkDelegate, "deepLinkDelegate");
        Intrinsics.checkNotNullParameter(appReloadDataDelegate, "appReloadDataDelegate");
        Intrinsics.checkNotNullParameter(startChatFlowDelegate, "startChatFlowDelegate");
        Intrinsics.checkNotNullParameter(appChatEventsDelegate, "appChatEventsDelegate");
        Intrinsics.checkNotNullParameter(onboardingSubmittedDelegate, "onboardingSubmittedDelegate");
        Intrinsics.checkNotNullParameter(appNavigationDelegate, "appNavigationDelegate");
        Intrinsics.checkNotNullParameter(purchaseInfoDelegate, "purchaseInfoDelegate");
        Intrinsics.checkNotNullParameter(appEventsFlow, "appEventsFlow");
        Intrinsics.checkNotNullParameter(exceptionsFlow, "exceptionsFlow");
        Intrinsics.checkNotNullParameter(appUpdatesDelegate, "appUpdatesDelegate");
        this.chatsInfoConfigurationRepository = chatsInfoConfigurationRepository;
        this.featureExceptionMapper = featureExceptionMapper;
        this.logoutUseCase = logoutUseCase;
        this.appIdentityConverter = appIdentityConverter;
        this.dispatchers = dispatchers;
        this.$$delegate_0 = new UiStateDelegateImpl<>(new UiState(false, null, 3, null), 0, null, 6, null);
        this.$$delegate_1 = appChatEventsDelegate;
        this.$$delegate_2 = appReloadDataDelegate;
        this.$$delegate_3 = deepLinkDelegate;
        this.$$delegate_4 = addNeuronsBillingDelegate;
        this.$$delegate_5 = appStartFlowDelegate;
        this.$$delegate_6 = startChatFlowDelegate;
        this.$$delegate_7 = onboardingSubmittedDelegate;
        this.$$delegate_8 = appNavigationDelegate;
        this.$$delegate_9 = appChatMessagesDelegate;
        this.$$delegate_10 = appServicesDelegate;
        this.$$delegate_11 = appUpdatesDelegate;
        this.$$delegate_12 = purchaseInfoDelegate;
        initAppReloadData(this);
        startAppChatLaunchService(this);
        startAppServices();
        AppViewModel appViewModel = this;
        FlowKt.launchIn(FlowKt.onEach(appEventsFlow.subscribe(), new AnonymousClass1(this)), ViewModelKt.getViewModelScope(appViewModel));
        FlowKt.launchIn(FlowKt.onEach(exceptionsFlow.subscribe(), new AnonymousClass2(this)), ViewModelKt.getViewModelScope(appViewModel));
    }

    /* compiled from: AppViewModel.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\r\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\t¨\u0006\u0013"}, d2 = {"Lcom/ifriend/presentation/features/app/viewmodel/AppViewModel$UiState;", "", "isLoading", "", "appSystemState", "Lcom/ifriend/presentation/features/app/viewmodel/models/AppSystemState;", "(ZLcom/ifriend/presentation/features/app/viewmodel/models/AppSystemState;)V", "getAppSystemState", "()Lcom/ifriend/presentation/features/app/viewmodel/models/AppSystemState;", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class UiState {
        public static final int $stable = 0;
        private final AppSystemState appSystemState;
        private final boolean isLoading;

        public UiState() {
            this(false, null, 3, null);
        }

        public static /* synthetic */ UiState copy$default(UiState uiState, boolean z, AppSystemState appSystemState, int i, Object obj) {
            if ((i & 1) != 0) {
                z = uiState.isLoading;
            }
            if ((i & 2) != 0) {
                appSystemState = uiState.appSystemState;
            }
            return uiState.copy(z, appSystemState);
        }

        public final boolean component1() {
            return this.isLoading;
        }

        public final AppSystemState component2() {
            return this.appSystemState;
        }

        public final UiState copy(boolean z, AppSystemState appSystemState) {
            Intrinsics.checkNotNullParameter(appSystemState, "appSystemState");
            return new UiState(z, appSystemState);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof UiState) {
                UiState uiState = (UiState) obj;
                return this.isLoading == uiState.isLoading && this.appSystemState == uiState.appSystemState;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v4 */
        /* JADX WARN: Type inference failed for: r0v5 */
        public int hashCode() {
            boolean z = this.isLoading;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            return (r0 * 31) + this.appSystemState.hashCode();
        }

        public String toString() {
            boolean z = this.isLoading;
            AppSystemState appSystemState = this.appSystemState;
            return "UiState(isLoading=" + z + ", appSystemState=" + appSystemState + ")";
        }

        public UiState(boolean z, AppSystemState appSystemState) {
            Intrinsics.checkNotNullParameter(appSystemState, "appSystemState");
            this.isLoading = z;
            this.appSystemState = appSystemState;
        }

        public final boolean isLoading() {
            return this.isLoading;
        }

        public /* synthetic */ UiState(boolean z, AppSystemState appSystemState, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? AppSystemState.Background : appSystemState);
        }

        public final AppSystemState getAppSystemState() {
            return this.appSystemState;
        }
    }

    /* compiled from: AppViewModel.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\f\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u0082\u0001\f\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019¨\u0006\u001a"}, d2 = {"Lcom/ifriend/presentation/features/app/viewmodel/AppViewModel$Event;", "", "BackToHomeFeature", "GoToAddNeurons", "GoToBuyChatSubscription", "GoToBuySubscription", "GoToInfoOnboarding", "OpenLink", "RestartApp", "RestartAppFlow", "ShowInternalNotification", "StartChatFeature", "StartHomeFeature", "StartOnboardingFeature", "Lcom/ifriend/presentation/features/app/viewmodel/AppViewModel$Event$BackToHomeFeature;", "Lcom/ifriend/presentation/features/app/viewmodel/AppViewModel$Event$GoToAddNeurons;", "Lcom/ifriend/presentation/features/app/viewmodel/AppViewModel$Event$GoToBuyChatSubscription;", "Lcom/ifriend/presentation/features/app/viewmodel/AppViewModel$Event$GoToBuySubscription;", "Lcom/ifriend/presentation/features/app/viewmodel/AppViewModel$Event$GoToInfoOnboarding;", "Lcom/ifriend/presentation/features/app/viewmodel/AppViewModel$Event$OpenLink;", "Lcom/ifriend/presentation/features/app/viewmodel/AppViewModel$Event$RestartApp;", "Lcom/ifriend/presentation/features/app/viewmodel/AppViewModel$Event$RestartAppFlow;", "Lcom/ifriend/presentation/features/app/viewmodel/AppViewModel$Event$ShowInternalNotification;", "Lcom/ifriend/presentation/features/app/viewmodel/AppViewModel$Event$StartChatFeature;", "Lcom/ifriend/presentation/features/app/viewmodel/AppViewModel$Event$StartHomeFeature;", "Lcom/ifriend/presentation/features/app/viewmodel/AppViewModel$Event$StartOnboardingFeature;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public interface Event {

        /* compiled from: AppViewModel.kt */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/ifriend/presentation/features/app/viewmodel/AppViewModel$Event$StartChatFeature;", "Lcom/ifriend/presentation/features/app/viewmodel/AppViewModel$Event;", "chatId", "", "(Ljava/lang/String;)V", "getChatId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class StartChatFeature implements Event {
            public static final int $stable = 0;
            private final String chatId;

            public static /* synthetic */ StartChatFeature copy$default(StartChatFeature startChatFeature, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = startChatFeature.chatId;
                }
                return startChatFeature.copy(str);
            }

            public final String component1() {
                return this.chatId;
            }

            public final StartChatFeature copy(String chatId) {
                Intrinsics.checkNotNullParameter(chatId, "chatId");
                return new StartChatFeature(chatId);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof StartChatFeature) && Intrinsics.areEqual(this.chatId, ((StartChatFeature) obj).chatId);
            }

            public int hashCode() {
                return this.chatId.hashCode();
            }

            public String toString() {
                String str = this.chatId;
                return "StartChatFeature(chatId=" + str + ")";
            }

            public StartChatFeature(String chatId) {
                Intrinsics.checkNotNullParameter(chatId, "chatId");
                this.chatId = chatId;
            }

            public final String getChatId() {
                return this.chatId;
            }
        }

        /* compiled from: AppViewModel.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifriend/presentation/features/app/viewmodel/AppViewModel$Event$StartHomeFeature;", "Lcom/ifriend/presentation/features/app/viewmodel/AppViewModel$Event;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class StartHomeFeature implements Event {
            public static final int $stable = 0;
            public static final StartHomeFeature INSTANCE = new StartHomeFeature();

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof StartHomeFeature) {
                    StartHomeFeature startHomeFeature = (StartHomeFeature) obj;
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return -1635284820;
            }

            public String toString() {
                return "StartHomeFeature";
            }

            private StartHomeFeature() {
            }
        }

        /* compiled from: AppViewModel.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifriend/presentation/features/app/viewmodel/AppViewModel$Event$BackToHomeFeature;", "Lcom/ifriend/presentation/features/app/viewmodel/AppViewModel$Event;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class BackToHomeFeature implements Event {
            public static final int $stable = 0;
            public static final BackToHomeFeature INSTANCE = new BackToHomeFeature();

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof BackToHomeFeature) {
                    BackToHomeFeature backToHomeFeature = (BackToHomeFeature) obj;
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return 162375550;
            }

            public String toString() {
                return "BackToHomeFeature";
            }

            private BackToHomeFeature() {
            }
        }

        /* compiled from: AppViewModel.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifriend/presentation/features/app/viewmodel/AppViewModel$Event$StartOnboardingFeature;", "Lcom/ifriend/presentation/features/app/viewmodel/AppViewModel$Event;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class StartOnboardingFeature implements Event {
            public static final int $stable = 0;
            public static final StartOnboardingFeature INSTANCE = new StartOnboardingFeature();

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof StartOnboardingFeature) {
                    StartOnboardingFeature startOnboardingFeature = (StartOnboardingFeature) obj;
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return 295168048;
            }

            public String toString() {
                return "StartOnboardingFeature";
            }

            private StartOnboardingFeature() {
            }
        }

        /* compiled from: AppViewModel.kt */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/ifriend/presentation/features/app/viewmodel/AppViewModel$Event$GoToAddNeurons;", "Lcom/ifriend/presentation/features/app/viewmodel/AppViewModel$Event;", NativeProtocol.WEB_DIALOG_PARAMS, "Lcom/ifriend/presentation/common/observers/appevents/params/BuyNeuronsBillingUiParams;", "(Lcom/ifriend/presentation/common/observers/appevents/params/BuyNeuronsBillingUiParams;)V", "getParams", "()Lcom/ifriend/presentation/common/observers/appevents/params/BuyNeuronsBillingUiParams;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class GoToAddNeurons implements Event {
            public static final int $stable = 8;
            private final BuyNeuronsBillingUiParams params;

            public static /* synthetic */ GoToAddNeurons copy$default(GoToAddNeurons goToAddNeurons, BuyNeuronsBillingUiParams buyNeuronsBillingUiParams, int i, Object obj) {
                if ((i & 1) != 0) {
                    buyNeuronsBillingUiParams = goToAddNeurons.params;
                }
                return goToAddNeurons.copy(buyNeuronsBillingUiParams);
            }

            public final BuyNeuronsBillingUiParams component1() {
                return this.params;
            }

            public final GoToAddNeurons copy(BuyNeuronsBillingUiParams params) {
                Intrinsics.checkNotNullParameter(params, "params");
                return new GoToAddNeurons(params);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof GoToAddNeurons) && Intrinsics.areEqual(this.params, ((GoToAddNeurons) obj).params);
            }

            public int hashCode() {
                return this.params.hashCode();
            }

            public String toString() {
                BuyNeuronsBillingUiParams buyNeuronsBillingUiParams = this.params;
                return "GoToAddNeurons(params=" + buyNeuronsBillingUiParams + ")";
            }

            public GoToAddNeurons(BuyNeuronsBillingUiParams params) {
                Intrinsics.checkNotNullParameter(params, "params");
                this.params = params;
            }

            public final BuyNeuronsBillingUiParams getParams() {
                return this.params;
            }
        }

        /* compiled from: AppViewModel.kt */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/ifriend/presentation/features/app/viewmodel/AppViewModel$Event$GoToBuySubscription;", "Lcom/ifriend/presentation/features/app/viewmodel/AppViewModel$Event;", NativeProtocol.WEB_DIALOG_PARAMS, "Lcom/ifriend/presentation/common/observers/appevents/params/BuySubscriptionBillingUiParams;", "(Lcom/ifriend/presentation/common/observers/appevents/params/BuySubscriptionBillingUiParams;)V", "getParams", "()Lcom/ifriend/presentation/common/observers/appevents/params/BuySubscriptionBillingUiParams;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class GoToBuySubscription implements Event {
            public static final int $stable = 8;
            private final BuySubscriptionBillingUiParams params;

            public static /* synthetic */ GoToBuySubscription copy$default(GoToBuySubscription goToBuySubscription, BuySubscriptionBillingUiParams buySubscriptionBillingUiParams, int i, Object obj) {
                if ((i & 1) != 0) {
                    buySubscriptionBillingUiParams = goToBuySubscription.params;
                }
                return goToBuySubscription.copy(buySubscriptionBillingUiParams);
            }

            public final BuySubscriptionBillingUiParams component1() {
                return this.params;
            }

            public final GoToBuySubscription copy(BuySubscriptionBillingUiParams params) {
                Intrinsics.checkNotNullParameter(params, "params");
                return new GoToBuySubscription(params);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof GoToBuySubscription) && Intrinsics.areEqual(this.params, ((GoToBuySubscription) obj).params);
            }

            public int hashCode() {
                return this.params.hashCode();
            }

            public String toString() {
                BuySubscriptionBillingUiParams buySubscriptionBillingUiParams = this.params;
                return "GoToBuySubscription(params=" + buySubscriptionBillingUiParams + ")";
            }

            public GoToBuySubscription(BuySubscriptionBillingUiParams params) {
                Intrinsics.checkNotNullParameter(params, "params");
                this.params = params;
            }

            public final BuySubscriptionBillingUiParams getParams() {
                return this.params;
            }
        }

        /* compiled from: AppViewModel.kt */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/ifriend/presentation/features/app/viewmodel/AppViewModel$Event$GoToBuyChatSubscription;", "Lcom/ifriend/presentation/features/app/viewmodel/AppViewModel$Event;", NativeProtocol.WEB_DIALOG_PARAMS, "Lcom/ifriend/presentation/common/observers/appevents/params/BuyChatSubscriptionBillingUiParams;", "(Lcom/ifriend/presentation/common/observers/appevents/params/BuyChatSubscriptionBillingUiParams;)V", "getParams", "()Lcom/ifriend/presentation/common/observers/appevents/params/BuyChatSubscriptionBillingUiParams;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class GoToBuyChatSubscription implements Event {
            public static final int $stable = 8;
            private final BuyChatSubscriptionBillingUiParams params;

            public static /* synthetic */ GoToBuyChatSubscription copy$default(GoToBuyChatSubscription goToBuyChatSubscription, BuyChatSubscriptionBillingUiParams buyChatSubscriptionBillingUiParams, int i, Object obj) {
                if ((i & 1) != 0) {
                    buyChatSubscriptionBillingUiParams = goToBuyChatSubscription.params;
                }
                return goToBuyChatSubscription.copy(buyChatSubscriptionBillingUiParams);
            }

            public final BuyChatSubscriptionBillingUiParams component1() {
                return this.params;
            }

            public final GoToBuyChatSubscription copy(BuyChatSubscriptionBillingUiParams params) {
                Intrinsics.checkNotNullParameter(params, "params");
                return new GoToBuyChatSubscription(params);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof GoToBuyChatSubscription) && Intrinsics.areEqual(this.params, ((GoToBuyChatSubscription) obj).params);
            }

            public int hashCode() {
                return this.params.hashCode();
            }

            public String toString() {
                BuyChatSubscriptionBillingUiParams buyChatSubscriptionBillingUiParams = this.params;
                return "GoToBuyChatSubscription(params=" + buyChatSubscriptionBillingUiParams + ")";
            }

            public GoToBuyChatSubscription(BuyChatSubscriptionBillingUiParams params) {
                Intrinsics.checkNotNullParameter(params, "params");
                this.params = params;
            }

            public final BuyChatSubscriptionBillingUiParams getParams() {
                return this.params;
            }
        }

        /* compiled from: AppViewModel.kt */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/ifriend/presentation/features/app/viewmodel/AppViewModel$Event$ShowInternalNotification;", "Lcom/ifriend/presentation/features/app/viewmodel/AppViewModel$Event;", NativeProtocol.WEB_DIALOG_PARAMS, "Lcom/ifriend/internal_notifications/notification/InternalNotification;", "(Lcom/ifriend/internal_notifications/notification/InternalNotification;)V", "getParams", "()Lcom/ifriend/internal_notifications/notification/InternalNotification;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class ShowInternalNotification implements Event {
            public static final int $stable = 8;
            private final InternalNotification params;

            public static /* synthetic */ ShowInternalNotification copy$default(ShowInternalNotification showInternalNotification, InternalNotification internalNotification, int i, Object obj) {
                if ((i & 1) != 0) {
                    internalNotification = showInternalNotification.params;
                }
                return showInternalNotification.copy(internalNotification);
            }

            public final InternalNotification component1() {
                return this.params;
            }

            public final ShowInternalNotification copy(InternalNotification params) {
                Intrinsics.checkNotNullParameter(params, "params");
                return new ShowInternalNotification(params);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ShowInternalNotification) && Intrinsics.areEqual(this.params, ((ShowInternalNotification) obj).params);
            }

            public int hashCode() {
                return this.params.hashCode();
            }

            public String toString() {
                InternalNotification internalNotification = this.params;
                return "ShowInternalNotification(params=" + internalNotification + ")";
            }

            public ShowInternalNotification(InternalNotification params) {
                Intrinsics.checkNotNullParameter(params, "params");
                this.params = params;
            }

            public final InternalNotification getParams() {
                return this.params;
            }
        }

        /* compiled from: AppViewModel.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifriend/presentation/features/app/viewmodel/AppViewModel$Event$GoToInfoOnboarding;", "Lcom/ifriend/presentation/features/app/viewmodel/AppViewModel$Event;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class GoToInfoOnboarding implements Event {
            public static final int $stable = 0;
            public static final GoToInfoOnboarding INSTANCE = new GoToInfoOnboarding();

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof GoToInfoOnboarding) {
                    GoToInfoOnboarding goToInfoOnboarding = (GoToInfoOnboarding) obj;
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return -484768413;
            }

            public String toString() {
                return "GoToInfoOnboarding";
            }

            private GoToInfoOnboarding() {
            }
        }

        /* compiled from: AppViewModel.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifriend/presentation/features/app/viewmodel/AppViewModel$Event$RestartApp;", "Lcom/ifriend/presentation/features/app/viewmodel/AppViewModel$Event;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class RestartApp implements Event {
            public static final int $stable = 0;
            public static final RestartApp INSTANCE = new RestartApp();

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof RestartApp) {
                    RestartApp restartApp = (RestartApp) obj;
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return 1804739625;
            }

            public String toString() {
                return "RestartApp";
            }

            private RestartApp() {
            }
        }

        /* compiled from: AppViewModel.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifriend/presentation/features/app/viewmodel/AppViewModel$Event$RestartAppFlow;", "Lcom/ifriend/presentation/features/app/viewmodel/AppViewModel$Event;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class RestartAppFlow implements Event {
            public static final int $stable = 0;
            public static final RestartAppFlow INSTANCE = new RestartAppFlow();

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof RestartAppFlow) {
                    RestartAppFlow restartAppFlow = (RestartAppFlow) obj;
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return 1346591991;
            }

            public String toString() {
                return "RestartAppFlow";
            }

            private RestartAppFlow() {
            }
        }

        /* compiled from: AppViewModel.kt */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/ifriend/presentation/features/app/viewmodel/AppViewModel$Event$OpenLink;", "Lcom/ifriend/presentation/features/app/viewmodel/AppViewModel$Event;", "url", "", "(Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class OpenLink implements Event {
            public static final int $stable = 0;
            private final String url;

            public static /* synthetic */ OpenLink copy$default(OpenLink openLink, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = openLink.url;
                }
                return openLink.copy(str);
            }

            public final String component1() {
                return this.url;
            }

            public final OpenLink copy(String url) {
                Intrinsics.checkNotNullParameter(url, "url");
                return new OpenLink(url);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof OpenLink) && Intrinsics.areEqual(this.url, ((OpenLink) obj).url);
            }

            public int hashCode() {
                return this.url.hashCode();
            }

            public String toString() {
                String str = this.url;
                return "OpenLink(url=" + str + ")";
            }

            public OpenLink(String url) {
                Intrinsics.checkNotNullParameter(url, "url");
                this.url = url;
            }

            public final String getUrl() {
                return this.url;
            }
        }
    }

    /* compiled from: AppViewModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.presentation.features.app.viewmodel.AppViewModel$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    /* synthetic */ class AnonymousClass1 extends AdaptedFunctionReference implements Function2<AppEvents, Continuation<? super Unit>, Object>, SuspendFunction {
        AnonymousClass1(Object obj) {
            super(2, obj, AppViewModel.class, "handleAppEvents", "handleAppEvents(Lcom/ifriend/presentation/common/observers/appevents/AppEvents;)V", 4);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AppEvents appEvents, Continuation<? super Unit> continuation) {
            return AppViewModel._init_$handleAppEvents((AppViewModel) this.receiver, appEvents, continuation);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object _init_$handleAppEvents(AppViewModel appViewModel, AppEvents appEvents, Continuation continuation) {
        appViewModel.handleAppEvents(appEvents);
        return Unit.INSTANCE;
    }

    /* compiled from: AppViewModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.presentation.features.app.viewmodel.AppViewModel$2  reason: invalid class name */
    /* loaded from: classes6.dex */
    /* synthetic */ class AnonymousClass2 extends AdaptedFunctionReference implements Function2<Throwable, Continuation<? super Unit>, Object>, SuspendFunction {
        AnonymousClass2(Object obj) {
            super(2, obj, AppViewModel.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 4);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Throwable th, Continuation<? super Unit> continuation) {
            return AppViewModel._init_$handleError((AppViewModel) this.receiver, th, continuation);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object _init_$handleError(AppViewModel appViewModel, Throwable th, Continuation continuation) {
        appViewModel.handleError(th);
        return Unit.INSTANCE;
    }

    private final void handleError(Throwable th) {
        boolean isUnauthorized = ThrowablesKt.isUnauthorized(th);
        if (isUnauthorized) {
            logout(isUnauthorized);
        }
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AppViewModel$handleError$3(this, th, null), 3, null);
    }

    private final void logout(boolean z) {
        CoroutinesKt.safeLaunch(ViewModelKt.getViewModelScope(this), new AppViewModel$logout$1(z, this, null), this.dispatchers.background(), new AppViewModel$logout$2(this, null));
    }

    public final void onNewProcess(Intent intent) {
        startFlow(this, intent);
        if (intent != null) {
            handleDeepLinks(this, intent);
        }
    }

    public final void onNewIntent(Intent intent) {
        if (intent != null) {
            handleDeepLinks(this, intent);
        }
    }

    public final void onUpdateClick() {
        showUpdatePrompt();
    }

    public final void onUpdatePopupDismiss() {
        InAppUpdateDelegate.DefaultImpls.dismissUpdatePopup$default(this, false, 1, null);
    }

    public final void onUpdatePromptResult(ActivityResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        handleStartUpdateResult(result);
    }

    public final void onUpdateSnackbarClick() {
        completeUpdate();
    }

    private final void handleAppEvents(AppEvents appEvents) {
        if (appEvents instanceof AppEvents.OnboardingSubmitted) {
            onboardingDataSubmitted(this, appEvents);
        } else if (appEvents instanceof AppEvents.Billing) {
            handleBillingEvent(this, (AppEvents.Billing) appEvents);
        } else if (appEvents instanceof AppEvents.PurchaseInfo) {
            handlePurchaseInfoEvent(this, (AppEvents.PurchaseInfo) appEvents);
        } else if (appEvents instanceof AppEvents.RestartApp) {
            restartApp();
        } else if (appEvents instanceof AppEvents.StartChatFlow) {
            startChatFlow(this, ((AppEvents.StartChatFlow) appEvents).getMode());
        } else if (appEvents instanceof AppEvents.Chat) {
            handleAppChatEvents(this, (AppEvents.Chat) appEvents);
        } else if (appEvents instanceof AppEvents.Navigation) {
            handleNavigationEvents(this, (AppEvents.Navigation) appEvents);
        } else if (appEvents instanceof AppEvents.ShowInAppNotification) {
            BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AppViewModel$handleAppEvents$2(this, appEvents, null), 3, null);
        } else if (appEvents instanceof AppEvents.LogOut) {
            logout(((AppEvents.LogOut) appEvents).getHard());
        } else if (!(appEvents instanceof AppEvents.OpenLink)) {
            throw new NoWhenBranchMatchedException();
        } else {
            handleOpenLinkEvent(((AppEvents.OpenLink) appEvents).getLink());
        }
    }

    private final void handleOpenLinkEvent(String str) {
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AppViewModel$handleOpenLinkEvent$1(this, str, null), 3, null);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onResume(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        checkForAppUpdates();
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AppViewModel$onResume$1(this, null), 3, null);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onPause(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        asyncUpdateUiState(this, ViewModelKt.getViewModelScope(this), AppViewModel$onPause$1.INSTANCE);
    }

    private final void restartApp() {
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AppViewModel$restartApp$1(this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        clearInAppUpdateDelegate();
        stopAppServices();
        super.onCleared();
    }

    public final void onTrackScreenshot(AnalyticsScreenName screenName, String platformName) {
        Intrinsics.checkNotNullParameter(screenName, "screenName");
        Intrinsics.checkNotNullParameter(platformName, "platformName");
        CoroutinesKt.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new AppViewModel$onTrackScreenshot$1(this, screenName, platformName, null), 3, null);
    }
}
