package com.ifriend.presentation.features.purchases.chatsubscription.activesubscription.viewmodel;

import android.content.res.ColorStateList;
import android.graphics.Typeface;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.compose.ui.graphics.Color;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.facebook.internal.NativeProtocol;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.ifriend.core.utils.CoroutinesKt;
import com.ifriend.domain.logic.chat.configuration.ChatConfig;
import com.ifriend.domain.logic.chat.configuration.ChatsConfiguration;
import com.ifriend.domain.logic.chat.configuration.ChatsConfigurationInteractor;
import com.ifriend.domain.logic.chat.info.ChatsInfoInteractor;
import com.ifriend.domain.logic.chat.models.ChatInfo;
import com.ifriend.domain.logic.chat.subscription.ChatSubscriptionInteractor;
import com.ifriend.domain.logic.chat.subscription.models.ChatSubscriptionBenefits;
import com.ifriend.domain.models.profile.user.User;
import com.ifriend.domain.useCases.user.get.GetUserUseCase;
import com.ifriend.platform.tools.api.AppInfoProvider;
import com.ifriend.platform.tools.api.ResourceProvider;
import com.ifriend.presentation.R;
import com.ifriend.presentation.common.observers.FlowObserverEmitter;
import com.ifriend.presentation.common.observers.appevents.AppEvents;
import com.ifriend.presentation.common.observers.appevents.AppEventsEmitter;
import com.ifriend.presentation.common.uistate.UiStateDelegate;
import com.ifriend.presentation.common.uistate.UiStateDelegateImpl;
import com.ifriend.presentation.features.purchases.chatsubscription.common.mappers.SubscriptionBenefitsMapper;
import com.ifriend.presentation.features.purchases.common.model.SubscriptionBenefitsGroupUiParams;
import com.ifriend.ui.components.ext.StringKt;
import com.ifriend.ui.theme.AppColors;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.collections.immutable.ExtensionsKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
/* compiled from: ChatActiveSubscriptionViewModel.kt */
@Metadata(d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003:\u0001UBd\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0015\u0010\u0013\u001a\u0011\u0012\t\u0012\u00070\u0015¢\u0006\u0002\b\u00160\u0014j\u0002`\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b¢\u0006\u0002\u0010\u001cJ\u0013\u0010+\u001a\u00020,2\b\b\u0001\u0010-\u001a\u00020.H\u0096\u0001J\u0013\u0010/\u001a\u0002002\b\b\u0001\u00101\u001a\u00020.H\u0096\u0001J\u0013\u00102\u001a\u00020.2\b\b\u0001\u00103\u001a\u00020.H\u0097\u0001J\u0015\u00104\u001a\u0004\u0018\u0001052\b\b\u0001\u0010-\u001a\u00020.H\u0096\u0001J\u0013\u00106\u001a\u00020.2\b\b\u0001\u0010-\u001a\u00020.H\u0096\u0001J\u0019\u00107\u001a\b\u0012\u0004\u0012\u00020.082\b\b\u0001\u0010-\u001a\u00020.H\u0096\u0001J\u001b\u00109\u001a\u00020\u00072\b\b\u0001\u0010:\u001a\u00020.2\u0006\u0010;\u001a\u00020.H\u0096\u0001J4\u00109\u001a\u00020\u00072\b\b\u0001\u0010:\u001a\u00020.2\u0006\u0010;\u001a\u00020.2\u0012\u0010<\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050=\"\u00020\u0005H\u0096\u0001¢\u0006\u0002\u0010>J\u0013\u0010?\u001a\u00020\u00072\b\b\u0001\u0010:\u001a\u00020.H\u0096\u0001J,\u0010?\u001a\u00020\u00072\b\b\u0001\u0010:\u001a\u00020.2\u0012\u0010<\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050=\"\u00020\u0005H\u0096\u0001¢\u0006\u0002\u0010@J\u0019\u0010A\u001a\b\u0012\u0004\u0012\u00020\u0007082\b\b\u0001\u0010:\u001a\u00020.H\u0096\u0001J\u0006\u0010B\u001a\u00020CJ0\u0010D\u001a\u00020C*\u00020E2!\u0010F\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\bH\u0012\b\bI\u0012\u0004\b\b(J\u0012\u0004\u0012\u00020\u00040GH\u0097\u0001JD\u0010K\u001a\u00020L*\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010M\u001a\u00020E2!\u0010N\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\bH\u0012\b\bI\u0012\u0004\b\b(J\u0012\u0004\u0012\u00020\u00040GH\u0096\u0001JD\u0010O\u001a\u00020C*\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032!\u0010F\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\bH\u0012\b\bI\u0012\u0004\b\b(J\u0012\u0004\u0012\u00020\u00040GH\u0097Aø\u0001\u0000¢\u0006\u0002\u0010PJ)\u0010Q\u001a\u00020C*\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010R\u001a\u00020\u0005H\u0096Aø\u0001\u0000¢\u0006\u0002\u0010SJD\u0010T\u001a\u00020C*\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032!\u0010N\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\bH\u0012\b\bI\u0012\u0004\b\b((\u0012\u0004\u0012\u00020\u00040GH\u0096Aø\u0001\u0000¢\u0006\u0002\u0010PR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0013\u001a\u0011\u0012\t\u0012\u00070\u0015¢\u0006\u0002\b\u00160\u0014j\u0002`\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u001d\u001a\u00020\u0007X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u000e\u0010\b\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00050!X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00040%X\u0096\u0005¢\u0006\u0006\u001a\u0004\b&\u0010'R\"\u0010(\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0096\u0005¢\u0006\u0006\u001a\u0004\b)\u0010*\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006V"}, d2 = {"Lcom/ifriend/presentation/features/purchases/chatsubscription/activesubscription/viewmodel/ChatActiveSubscriptionViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/ifriend/platform/tools/api/ResourceProvider;", "Lcom/ifriend/presentation/common/uistate/UiStateDelegate;", "Lcom/ifriend/presentation/features/purchases/chatsubscription/activesubscription/viewmodel/ChatActiveSubscriptionViewModel$UiState;", "", "chatId", "", "resourceProvider", "chatsConfigurationInteractor", "Lcom/ifriend/domain/logic/chat/configuration/ChatsConfigurationInteractor;", "appEventsEmitter", "Lcom/ifriend/presentation/common/observers/appevents/AppEventsEmitter;", "subscriptionBenefitsMapper", "Lcom/ifriend/presentation/features/purchases/chatsubscription/common/mappers/SubscriptionBenefitsMapper;", "getUserUseCase", "Lcom/ifriend/domain/useCases/user/get/GetUserUseCase;", "appInfoProvider", "Lcom/ifriend/platform/tools/api/AppInfoProvider;", "exceptionsEmitter", "Lcom/ifriend/presentation/common/observers/FlowObserverEmitter;", "", "Lkotlin/jvm/JvmSuppressWildcards;", "Lcom/ifriend/presentation/common/observers/exceptions/ExceptionsEmitter;", "chatsInfoInteractor", "Lcom/ifriend/domain/logic/chat/info/ChatsInfoInteractor;", "chatSubscriptionInteractor", "Lcom/ifriend/domain/logic/chat/subscription/ChatSubscriptionInteractor;", "(Ljava/lang/String;Lcom/ifriend/platform/tools/api/ResourceProvider;Lcom/ifriend/domain/logic/chat/configuration/ChatsConfigurationInteractor;Lcom/ifriend/presentation/common/observers/appevents/AppEventsEmitter;Lcom/ifriend/presentation/features/purchases/chatsubscription/common/mappers/SubscriptionBenefitsMapper;Lcom/ifriend/domain/useCases/user/get/GetUserUseCase;Lcom/ifriend/platform/tools/api/AppInfoProvider;Lcom/ifriend/presentation/common/observers/FlowObserverEmitter;Lcom/ifriend/domain/logic/chat/info/ChatsInfoInteractor;Lcom/ifriend/domain/logic/chat/subscription/ChatSubscriptionInteractor;)V", RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, "getPackageName", "()Ljava/lang/String;", "singleEvents", "Lkotlinx/coroutines/flow/Flow;", "getSingleEvents", "()Lkotlinx/coroutines/flow/Flow;", "uiStateFlow", "Lkotlinx/coroutines/flow/StateFlow;", "getUiStateFlow", "()Lkotlinx/coroutines/flow/StateFlow;", "uiState", "getUiState", "(Lcom/ifriend/presentation/common/uistate/UiStateDelegate;)Lcom/ifriend/presentation/features/purchases/chatsubscription/activesubscription/viewmodel/ChatActiveSubscriptionViewModel$UiState;", "getBoolean", "", "resId", "", "getColorStateList", "Landroid/content/res/ColorStateList;", "colorResId", "getDimensionPixelSize", "dimenRes", "getFont", "Landroid/graphics/Typeface;", "getInteger", "getIntegerArray", "", "getQuantityString", "res", FirebaseAnalytics.Param.QUANTITY, "args", "", "(II[Ljava/lang/Object;)Ljava/lang/String;", "getString", "(I[Ljava/lang/Object;)Ljava/lang/String;", "getStringArray", "onManageSubscriptionClick", "", "asyncReduce", "Lkotlinx/coroutines/CoroutineScope;", NativeProtocol.WEB_DIALOG_ACTION, "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "state", "asyncUpdateUiState", "Lkotlinx/coroutines/Job;", "coroutineScope", "transform", "reduce", "(Lcom/ifriend/presentation/common/uistate/UiStateDelegate;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendEvent", NotificationCompat.CATEGORY_EVENT, "(Lcom/ifriend/presentation/common/uistate/UiStateDelegate;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateUiState", "UiState", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatActiveSubscriptionViewModel extends ViewModel implements ResourceProvider, UiStateDelegate<UiState, Object> {
    public static final int $stable = 8;
    private final /* synthetic */ UiStateDelegateImpl<UiState, Object> $$delegate_1;
    private final AppEventsEmitter appEventsEmitter;
    private final AppInfoProvider appInfoProvider;
    private final String chatId;
    private final ChatSubscriptionInteractor chatSubscriptionInteractor;
    private final ChatsConfigurationInteractor chatsConfigurationInteractor;
    private final ChatsInfoInteractor chatsInfoInteractor;
    private final FlowObserverEmitter<Throwable> exceptionsEmitter;
    private final GetUserUseCase getUserUseCase;
    private final ResourceProvider resourceProvider;
    private final SubscriptionBenefitsMapper subscriptionBenefitsMapper;

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    @Deprecated(message = "use method UiStateDelegate<UiState, Event>.asyncUpdateInternalState")
    public void asyncReduce(CoroutineScope coroutineScope, Function1<? super UiState, ? extends UiState> action) {
        Intrinsics.checkNotNullParameter(coroutineScope, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        this.$$delegate_1.asyncReduce(coroutineScope, action);
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    public Job asyncUpdateUiState(UiStateDelegate<UiState, Object> uiStateDelegate, CoroutineScope coroutineScope, Function1<? super UiState, ? extends UiState> transform) {
        Intrinsics.checkNotNullParameter(uiStateDelegate, "<this>");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return this.$$delegate_1.asyncUpdateUiState(uiStateDelegate, coroutineScope, transform);
    }

    @Override // com.ifriend.platform.tools.api.ResourceProvider
    public boolean getBoolean(int i) {
        return this.resourceProvider.getBoolean(i);
    }

    @Override // com.ifriend.platform.tools.api.ResourceProvider
    public ColorStateList getColorStateList(int i) {
        return this.resourceProvider.getColorStateList(i);
    }

    @Override // com.ifriend.platform.tools.api.ResourceProvider
    public int getDimensionPixelSize(int i) {
        return this.resourceProvider.getDimensionPixelSize(i);
    }

    @Override // com.ifriend.platform.tools.api.ResourceProvider
    public Typeface getFont(int i) {
        return this.resourceProvider.getFont(i);
    }

    @Override // com.ifriend.platform.tools.api.ResourceProvider
    public int getInteger(int i) {
        return this.resourceProvider.getInteger(i);
    }

    @Override // com.ifriend.platform.tools.api.ResourceProvider
    public List<Integer> getIntegerArray(int i) {
        return this.resourceProvider.getIntegerArray(i);
    }

    @Override // com.ifriend.platform.tools.api.ResourceProvider
    public String getPackageName() {
        return this.resourceProvider.getPackageName();
    }

    @Override // com.ifriend.platform.tools.api.ResourceProvider
    public String getQuantityString(int i, int i2) {
        return this.resourceProvider.getQuantityString(i, i2);
    }

    @Override // com.ifriend.platform.tools.api.ResourceProvider
    public String getQuantityString(int i, int i2, Object... args) {
        Intrinsics.checkNotNullParameter(args, "args");
        return this.resourceProvider.getQuantityString(i, i2, args);
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    public Flow<Object> getSingleEvents() {
        return this.$$delegate_1.getSingleEvents();
    }

    @Override // com.ifriend.platform.tools.api.ResourceProvider
    public String getString(int i) {
        return this.resourceProvider.getString(i);
    }

    @Override // com.ifriend.platform.tools.api.ResourceProvider
    public String getString(int i, Object... args) {
        Intrinsics.checkNotNullParameter(args, "args");
        return this.resourceProvider.getString(i, args);
    }

    @Override // com.ifriend.platform.tools.api.ResourceProvider
    public List<String> getStringArray(int i) {
        return this.resourceProvider.getStringArray(i);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    public UiState getUiState(UiStateDelegate<UiState, Object> uiStateDelegate) {
        Intrinsics.checkNotNullParameter(uiStateDelegate, "<this>");
        return this.$$delegate_1.getUiState(uiStateDelegate);
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    public StateFlow<UiState> getUiStateFlow() {
        return this.$$delegate_1.getUiStateFlow();
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    @Deprecated(message = "use method UiStateDelegate<UiState, Event>.updateUiState")
    public Object reduce(UiStateDelegate<UiState, Object> uiStateDelegate, Function1<? super UiState, ? extends UiState> function1, Continuation<? super Unit> continuation) {
        return this.$$delegate_1.reduce(uiStateDelegate, function1, continuation);
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    public Object sendEvent(UiStateDelegate<UiState, Object> uiStateDelegate, Object obj, Continuation<? super Unit> continuation) {
        return this.$$delegate_1.sendEvent(uiStateDelegate, obj, continuation);
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    public Object updateUiState(UiStateDelegate<UiState, Object> uiStateDelegate, Function1<? super UiState, ? extends UiState> function1, Continuation<? super Unit> continuation) {
        return this.$$delegate_1.updateUiState(uiStateDelegate, function1, continuation);
    }

    public ChatActiveSubscriptionViewModel(String chatId, ResourceProvider resourceProvider, ChatsConfigurationInteractor chatsConfigurationInteractor, AppEventsEmitter appEventsEmitter, SubscriptionBenefitsMapper subscriptionBenefitsMapper, GetUserUseCase getUserUseCase, AppInfoProvider appInfoProvider, FlowObserverEmitter<Throwable> exceptionsEmitter, ChatsInfoInteractor chatsInfoInteractor, ChatSubscriptionInteractor chatSubscriptionInteractor) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(resourceProvider, "resourceProvider");
        Intrinsics.checkNotNullParameter(chatsConfigurationInteractor, "chatsConfigurationInteractor");
        Intrinsics.checkNotNullParameter(appEventsEmitter, "appEventsEmitter");
        Intrinsics.checkNotNullParameter(subscriptionBenefitsMapper, "subscriptionBenefitsMapper");
        Intrinsics.checkNotNullParameter(getUserUseCase, "getUserUseCase");
        Intrinsics.checkNotNullParameter(appInfoProvider, "appInfoProvider");
        Intrinsics.checkNotNullParameter(exceptionsEmitter, "exceptionsEmitter");
        Intrinsics.checkNotNullParameter(chatsInfoInteractor, "chatsInfoInteractor");
        Intrinsics.checkNotNullParameter(chatSubscriptionInteractor, "chatSubscriptionInteractor");
        this.chatId = chatId;
        this.resourceProvider = resourceProvider;
        this.chatsConfigurationInteractor = chatsConfigurationInteractor;
        this.appEventsEmitter = appEventsEmitter;
        this.subscriptionBenefitsMapper = subscriptionBenefitsMapper;
        this.getUserUseCase = getUserUseCase;
        this.appInfoProvider = appInfoProvider;
        this.exceptionsEmitter = exceptionsEmitter;
        this.chatsInfoInteractor = chatsInfoInteractor;
        this.chatSubscriptionInteractor = chatSubscriptionInteractor;
        this.$$delegate_1 = new UiStateDelegateImpl<>(new UiState(false, null, null, null, 0L, null, 63, null), 0, null, 6, null);
        ChatActiveSubscriptionViewModel chatActiveSubscriptionViewModel = this;
        CoroutinesKt.safeLaunch$default(ViewModelKt.getViewModelScope(chatActiveSubscriptionViewModel), null, null, new AnonymousClass1(null), 3, null);
        CoroutinesKt.safeLaunch$default(ViewModelKt.getViewModelScope(chatActiveSubscriptionViewModel), new AnonymousClass2(exceptionsEmitter), null, new AnonymousClass3(null), 2, null);
    }

    /* compiled from: ChatActiveSubscriptionViewModel.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BJ\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bø\u0001\u0000¢\u0006\u0002\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\u0019\u0010\u001c\u001a\u00020\tHÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u0013J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003JX\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b \u0010!J\u0013\u0010\"\u001a\u00020\u00032\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0005HÖ\u0001R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\b\u001a\u00020\tø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006'"}, d2 = {"Lcom/ifriend/presentation/features/purchases/chatsubscription/activesubscription/viewmodel/ChatActiveSubscriptionViewModel$UiState;", "", "isLoading", "", "chatName", "", "screenTitle", "subscriptionActivatedTitle", "gradientColor", "Landroidx/compose/ui/graphics/Color;", "benefits", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/ifriend/presentation/features/purchases/common/model/SubscriptionBenefitsGroupUiParams;", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JLkotlinx/collections/immutable/ImmutableList;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getBenefits", "()Lkotlinx/collections/immutable/ImmutableList;", "getChatName", "()Ljava/lang/String;", "getGradientColor-0d7_KjU", "()J", "J", "()Z", "getScreenTitle", "getSubscriptionActivatedTitle", "component1", "component2", "component3", "component4", "component5", "component5-0d7_KjU", "component6", "copy", "copy-jzV_Hc0", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JLkotlinx/collections/immutable/ImmutableList;)Lcom/ifriend/presentation/features/purchases/chatsubscription/activesubscription/viewmodel/ChatActiveSubscriptionViewModel$UiState;", "equals", "other", "hashCode", "", "toString", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class UiState {
        public static final int $stable = 8;
        private final ImmutableList<SubscriptionBenefitsGroupUiParams> benefits;
        private final String chatName;
        private final long gradientColor;
        private final boolean isLoading;
        private final String screenTitle;
        private final String subscriptionActivatedTitle;

        public /* synthetic */ UiState(boolean z, String str, String str2, String str3, long j, ImmutableList immutableList, DefaultConstructorMarker defaultConstructorMarker) {
            this(z, str, str2, str3, j, immutableList);
        }

        /* renamed from: copy-jzV_Hc0$default  reason: not valid java name */
        public static /* synthetic */ UiState m6953copyjzV_Hc0$default(UiState uiState, boolean z, String str, String str2, String str3, long j, ImmutableList immutableList, int i, Object obj) {
            if ((i & 1) != 0) {
                z = uiState.isLoading;
            }
            if ((i & 2) != 0) {
                str = uiState.chatName;
            }
            String str4 = str;
            if ((i & 4) != 0) {
                str2 = uiState.screenTitle;
            }
            String str5 = str2;
            if ((i & 8) != 0) {
                str3 = uiState.subscriptionActivatedTitle;
            }
            String str6 = str3;
            if ((i & 16) != 0) {
                j = uiState.gradientColor;
            }
            long j2 = j;
            ImmutableList<SubscriptionBenefitsGroupUiParams> immutableList2 = immutableList;
            if ((i & 32) != 0) {
                immutableList2 = uiState.benefits;
            }
            return uiState.m6955copyjzV_Hc0(z, str4, str5, str6, j2, immutableList2);
        }

        public final boolean component1() {
            return this.isLoading;
        }

        public final String component2() {
            return this.chatName;
        }

        public final String component3() {
            return this.screenTitle;
        }

        public final String component4() {
            return this.subscriptionActivatedTitle;
        }

        /* renamed from: component5-0d7_KjU  reason: not valid java name */
        public final long m6954component50d7_KjU() {
            return this.gradientColor;
        }

        public final ImmutableList<SubscriptionBenefitsGroupUiParams> component6() {
            return this.benefits;
        }

        /* renamed from: copy-jzV_Hc0  reason: not valid java name */
        public final UiState m6955copyjzV_Hc0(boolean z, String chatName, String screenTitle, String subscriptionActivatedTitle, long j, ImmutableList<SubscriptionBenefitsGroupUiParams> benefits) {
            Intrinsics.checkNotNullParameter(chatName, "chatName");
            Intrinsics.checkNotNullParameter(screenTitle, "screenTitle");
            Intrinsics.checkNotNullParameter(subscriptionActivatedTitle, "subscriptionActivatedTitle");
            Intrinsics.checkNotNullParameter(benefits, "benefits");
            return new UiState(z, chatName, screenTitle, subscriptionActivatedTitle, j, benefits, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof UiState) {
                UiState uiState = (UiState) obj;
                return this.isLoading == uiState.isLoading && Intrinsics.areEqual(this.chatName, uiState.chatName) && Intrinsics.areEqual(this.screenTitle, uiState.screenTitle) && Intrinsics.areEqual(this.subscriptionActivatedTitle, uiState.subscriptionActivatedTitle) && Color.m3292equalsimpl0(this.gradientColor, uiState.gradientColor) && Intrinsics.areEqual(this.benefits, uiState.benefits);
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v12 */
        /* JADX WARN: Type inference failed for: r0v13 */
        public int hashCode() {
            boolean z = this.isLoading;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            return (((((((((r0 * 31) + this.chatName.hashCode()) * 31) + this.screenTitle.hashCode()) * 31) + this.subscriptionActivatedTitle.hashCode()) * 31) + Color.m3298hashCodeimpl(this.gradientColor)) * 31) + this.benefits.hashCode();
        }

        public String toString() {
            boolean z = this.isLoading;
            String str = this.chatName;
            String str2 = this.screenTitle;
            String str3 = this.subscriptionActivatedTitle;
            String m3299toStringimpl = Color.m3299toStringimpl(this.gradientColor);
            ImmutableList<SubscriptionBenefitsGroupUiParams> immutableList = this.benefits;
            return "UiState(isLoading=" + z + ", chatName=" + str + ", screenTitle=" + str2 + ", subscriptionActivatedTitle=" + str3 + ", gradientColor=" + m3299toStringimpl + ", benefits=" + immutableList + ")";
        }

        private UiState(boolean z, String chatName, String screenTitle, String subscriptionActivatedTitle, long j, ImmutableList<SubscriptionBenefitsGroupUiParams> benefits) {
            Intrinsics.checkNotNullParameter(chatName, "chatName");
            Intrinsics.checkNotNullParameter(screenTitle, "screenTitle");
            Intrinsics.checkNotNullParameter(subscriptionActivatedTitle, "subscriptionActivatedTitle");
            Intrinsics.checkNotNullParameter(benefits, "benefits");
            this.isLoading = z;
            this.chatName = chatName;
            this.screenTitle = screenTitle;
            this.subscriptionActivatedTitle = subscriptionActivatedTitle;
            this.gradientColor = j;
            this.benefits = benefits;
        }

        public final boolean isLoading() {
            return this.isLoading;
        }

        public final String getChatName() {
            return this.chatName;
        }

        public final String getScreenTitle() {
            return this.screenTitle;
        }

        public final String getSubscriptionActivatedTitle() {
            return this.subscriptionActivatedTitle;
        }

        public /* synthetic */ UiState(boolean z, String str, String str2, String str3, long j, ImmutableList immutableList, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) == 0 ? str3 : "", (i & 16) != 0 ? Color.Companion.m3326getTransparent0d7_KjU() : j, (i & 32) != 0 ? ExtensionsKt.persistentListOf() : immutableList, null);
        }

        /* renamed from: getGradientColor-0d7_KjU  reason: not valid java name */
        public final long m6956getGradientColor0d7_KjU() {
            return this.gradientColor;
        }

        public final ImmutableList<SubscriptionBenefitsGroupUiParams> getBenefits() {
            return this.benefits;
        }
    }

    /* compiled from: ChatActiveSubscriptionViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.ifriend.presentation.features.purchases.chatsubscription.activesubscription.viewmodel.ChatActiveSubscriptionViewModel$1", f = "ChatActiveSubscriptionViewModel.kt", i = {}, l = {65}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.ifriend.presentation.features.purchases.chatsubscription.activesubscription.viewmodel.ChatActiveSubscriptionViewModel$1  reason: invalid class name */
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
                obj = ChatActiveSubscriptionViewModel.this.chatsConfigurationInteractor.getChatConfigurationFlow(ChatActiveSubscriptionViewModel.this.chatId, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                ResultKt.throwOnFailure(obj);
            }
            FlowKt.launchIn(FlowKt.onEach((Flow) obj, new C01701(ChatActiveSubscriptionViewModel.this, null)), ViewModelKt.getViewModelScope(ChatActiveSubscriptionViewModel.this));
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(ChatActiveSubscriptionViewModel.this), null, null, new AnonymousClass2(ChatActiveSubscriptionViewModel.this, null), 3, null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ChatActiveSubscriptionViewModel.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/ifriend/domain/logic/chat/configuration/ChatsConfiguration;", "chat", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.ifriend.presentation.features.purchases.chatsubscription.activesubscription.viewmodel.ChatActiveSubscriptionViewModel$1$1", f = "ChatActiveSubscriptionViewModel.kt", i = {}, l = {76}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.ifriend.presentation.features.purchases.chatsubscription.activesubscription.viewmodel.ChatActiveSubscriptionViewModel$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes6.dex */
        public static final class C01701 extends SuspendLambda implements Function2<ChatsConfiguration, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ ChatActiveSubscriptionViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C01701(ChatActiveSubscriptionViewModel chatActiveSubscriptionViewModel, Continuation<? super C01701> continuation) {
                super(2, continuation);
                this.this$0 = chatActiveSubscriptionViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C01701 c01701 = new C01701(this.this$0, continuation);
                c01701.L$0 = obj;
                return c01701;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ChatsConfiguration chatsConfiguration, Continuation<? super Unit> continuation) {
                return ((C01701) create(chatsConfiguration, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                ChatConfig.SubscriptionInfo.Style style;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    ChatsConfiguration chatsConfiguration = (ChatsConfiguration) this.L$0;
                    ChatInfo chatInfo = chatsConfiguration.getChatInfo();
                    ChatConfig chatConfig = chatsConfiguration.getChatConfig();
                    String str = null;
                    ChatConfig.SubscriptionInfo subscriptionInfo = chatConfig != null ? chatConfig.getSubscriptionInfo() : null;
                    if (subscriptionInfo != null && (style = subscriptionInfo.getStyle()) != null) {
                        str = style.getHexBackgroundGradient();
                    }
                    if (str == null) {
                        str = "";
                    }
                    long m7040hexToColorSafe4WTKRHQ = StringKt.m7040hexToColorSafe4WTKRHQ(str, AppColors.Companion.m7133getAppVioletGradient0d7_KjU());
                    UiStateDelegate<UiState, Object> uiStateDelegate = this.this$0;
                    this.label = 1;
                    if (uiStateDelegate.updateUiState(uiStateDelegate, new C01711(chatInfo, m7040hexToColorSafe4WTKRHQ), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: ChatActiveSubscriptionViewModel.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/presentation/features/purchases/chatsubscription/activesubscription/viewmodel/ChatActiveSubscriptionViewModel$UiState;", "state", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.ifriend.presentation.features.purchases.chatsubscription.activesubscription.viewmodel.ChatActiveSubscriptionViewModel$1$1$1  reason: invalid class name and collision with other inner class name */
            /* loaded from: classes6.dex */
            public static final class C01711 extends Lambda implements Function1<UiState, UiState> {
                final /* synthetic */ ChatInfo $chatInfo;
                final /* synthetic */ long $gradientColor;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C01711(ChatInfo chatInfo, long j) {
                    super(1);
                    this.$chatInfo = chatInfo;
                    this.$gradientColor = j;
                }

                @Override // kotlin.jvm.functions.Function1
                public final UiState invoke(UiState state) {
                    Intrinsics.checkNotNullParameter(state, "state");
                    return UiState.m6953copyjzV_Hc0$default(state, false, this.$chatInfo.getName(), null, null, this.$gradientColor, null, 45, null);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ChatActiveSubscriptionViewModel.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.ifriend.presentation.features.purchases.chatsubscription.activesubscription.viewmodel.ChatActiveSubscriptionViewModel$1$2", f = "ChatActiveSubscriptionViewModel.kt", i = {}, l = {85, 87}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.ifriend.presentation.features.purchases.chatsubscription.activesubscription.viewmodel.ChatActiveSubscriptionViewModel$1$2  reason: invalid class name */
        /* loaded from: classes6.dex */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ ChatActiveSubscriptionViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(ChatActiveSubscriptionViewModel chatActiveSubscriptionViewModel, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = chatActiveSubscriptionViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.label = 1;
                    obj = this.this$0.getUserUseCase.flow(this);
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
                Flow filterNotNull = FlowKt.filterNotNull((Flow) obj);
                final ChatActiveSubscriptionViewModel chatActiveSubscriptionViewModel = this.this$0;
                this.label = 2;
                if (filterNotNull.collect(new FlowCollector<User>() { // from class: com.ifriend.presentation.features.purchases.chatsubscription.activesubscription.viewmodel.ChatActiveSubscriptionViewModel.1.2.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(User user, Continuation continuation) {
                        return emit2(user, (Continuation<? super Unit>) continuation);
                    }

                    /* renamed from: emit  reason: avoid collision after fix types in other method */
                    public final Object emit2(User user, Continuation<? super Unit> continuation) {
                        ChatActiveSubscriptionViewModel chatActiveSubscriptionViewModel2 = ChatActiveSubscriptionViewModel.this;
                        int i2 = R.string.buy_premium__congrats__title;
                        Object[] objArr = new Object[1];
                        String name = user.getName();
                        if (name == null) {
                            name = "";
                        }
                        objArr[0] = name;
                        String upperCase = chatActiveSubscriptionViewModel2.getString(i2, objArr).toUpperCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                        String string = ChatActiveSubscriptionViewModel.this.getString(R.string.subscriotion__subscription_activated);
                        UiStateDelegate<UiState, Object> uiStateDelegate = ChatActiveSubscriptionViewModel.this;
                        Object updateUiState = uiStateDelegate.updateUiState(uiStateDelegate, new ChatActiveSubscriptionViewModel$1$2$1$emit$2(upperCase, string), continuation);
                        return updateUiState == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? updateUiState : Unit.INSTANCE;
                    }
                }, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
        }
    }

    /* compiled from: ChatActiveSubscriptionViewModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.presentation.features.purchases.chatsubscription.activesubscription.viewmodel.ChatActiveSubscriptionViewModel$2  reason: invalid class name */
    /* loaded from: classes6.dex */
    /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements Function2<Throwable, Continuation<? super Unit>, Object>, SuspendFunction {
        AnonymousClass2(Object obj) {
            super(2, obj, FlowObserverEmitter.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Throwable th, Continuation<? super Unit> continuation) {
            return ((FlowObserverEmitter) this.receiver).emit(th, continuation);
        }
    }

    /* compiled from: ChatActiveSubscriptionViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.ifriend.presentation.features.purchases.chatsubscription.activesubscription.viewmodel.ChatActiveSubscriptionViewModel$3", f = "ChatActiveSubscriptionViewModel.kt", i = {}, l = {107}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.ifriend.presentation.features.purchases.chatsubscription.activesubscription.viewmodel.ChatActiveSubscriptionViewModel$3  reason: invalid class name */
    /* loaded from: classes6.dex */
    static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                obj = ChatActiveSubscriptionViewModel.this.chatSubscriptionInteractor.getSubscriptionBenefitsFlow(ChatActiveSubscriptionViewModel.this.chatId, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                ResultKt.throwOnFailure(obj);
            }
            FlowKt.launchIn(FlowKt.m8846catch(FlowKt.onEach(FlowKt.onStart((Flow) obj, new AnonymousClass1(ChatActiveSubscriptionViewModel.this, null)), new AnonymousClass2(ChatActiveSubscriptionViewModel.this, null)), new C01753(ChatActiveSubscriptionViewModel.this, null)), ViewModelKt.getViewModelScope(ChatActiveSubscriptionViewModel.this));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ChatActiveSubscriptionViewModel.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "", "Lcom/ifriend/domain/logic/chat/subscription/models/ChatSubscriptionBenefits;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.ifriend.presentation.features.purchases.chatsubscription.activesubscription.viewmodel.ChatActiveSubscriptionViewModel$3$1", f = "ChatActiveSubscriptionViewModel.kt", i = {}, l = {AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.ifriend.presentation.features.purchases.chatsubscription.activesubscription.viewmodel.ChatActiveSubscriptionViewModel$3$1  reason: invalid class name */
        /* loaded from: classes6.dex */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<FlowCollector<? super List<? extends ChatSubscriptionBenefits>>, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ ChatActiveSubscriptionViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(ChatActiveSubscriptionViewModel chatActiveSubscriptionViewModel, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = chatActiveSubscriptionViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super List<? extends ChatSubscriptionBenefits>> flowCollector, Continuation<? super Unit> continuation) {
                return invoke2((FlowCollector<? super List<ChatSubscriptionBenefits>>) flowCollector, continuation);
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final Object invoke2(FlowCollector<? super List<ChatSubscriptionBenefits>> flowCollector, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: ChatActiveSubscriptionViewModel.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/presentation/features/purchases/chatsubscription/activesubscription/viewmodel/ChatActiveSubscriptionViewModel$UiState;", "state", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.ifriend.presentation.features.purchases.chatsubscription.activesubscription.viewmodel.ChatActiveSubscriptionViewModel$3$1$1  reason: invalid class name and collision with other inner class name */
            /* loaded from: classes6.dex */
            public static final class C01731 extends Lambda implements Function1<UiState, UiState> {
                public static final C01731 INSTANCE = new C01731();

                C01731() {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final UiState invoke(UiState state) {
                    Intrinsics.checkNotNullParameter(state, "state");
                    return UiState.m6953copyjzV_Hc0$default(state, true, null, null, null, 0L, null, 62, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    UiStateDelegate<UiState, Object> uiStateDelegate = this.this$0;
                    this.label = 1;
                    if (uiStateDelegate.updateUiState(uiStateDelegate, C01731.INSTANCE, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ChatActiveSubscriptionViewModel.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"", "Lcom/ifriend/domain/logic/chat/subscription/models/ChatSubscriptionBenefits;", "benefits", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.ifriend.presentation.features.purchases.chatsubscription.activesubscription.viewmodel.ChatActiveSubscriptionViewModel$3$2", f = "ChatActiveSubscriptionViewModel.kt", i = {0, 1}, l = {112, 113, 122}, m = "invokeSuspend", n = {"benefits", "benefits"}, s = {"L$0", "L$0"})
        /* renamed from: com.ifriend.presentation.features.purchases.chatsubscription.activesubscription.viewmodel.ChatActiveSubscriptionViewModel$3$2  reason: invalid class name */
        /* loaded from: classes6.dex */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<List<? extends ChatSubscriptionBenefits>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ ChatActiveSubscriptionViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(ChatActiveSubscriptionViewModel chatActiveSubscriptionViewModel, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = chatActiveSubscriptionViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(List<? extends ChatSubscriptionBenefits> list, Continuation<? super Unit> continuation) {
                return invoke2((List<ChatSubscriptionBenefits>) list, continuation);
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final Object invoke2(List<ChatSubscriptionBenefits> list, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: ChatActiveSubscriptionViewModel.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/presentation/features/purchases/chatsubscription/activesubscription/viewmodel/ChatActiveSubscriptionViewModel$UiState;", "state", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.ifriend.presentation.features.purchases.chatsubscription.activesubscription.viewmodel.ChatActiveSubscriptionViewModel$3$2$1  reason: invalid class name */
            /* loaded from: classes6.dex */
            public static final class AnonymousClass1 extends Lambda implements Function1<UiState, UiState> {
                public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

                AnonymousClass1() {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final UiState invoke(UiState state) {
                    Intrinsics.checkNotNullParameter(state, "state");
                    return UiState.m6953copyjzV_Hc0$default(state, false, null, null, null, 0L, null, 62, null);
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:22:0x0085  */
            /* JADX WARN: Removed duplicated region for block: B:30:0x00bc A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:33:0x00a1 A[EDGE_INSN: B:33:0x00a1->B:28:0x00a1 ?: BREAK  , SYNTHETIC] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                List list;
                ArrayList arrayList;
                Iterator it;
                UiStateDelegate<UiState, Object> uiStateDelegate;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    List list2 = (List) this.L$0;
                    UiStateDelegate<UiState, Object> uiStateDelegate2 = this.this$0;
                    this.L$0 = list2;
                    this.label = 1;
                    if (uiStateDelegate2.updateUiState(uiStateDelegate2, AnonymousClass1.INSTANCE, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    list = list2;
                } else if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            ResultKt.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    list = (List) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    ChatInfo chatInfo = (ChatInfo) obj;
                    List list3 = list;
                    ChatActiveSubscriptionViewModel chatActiveSubscriptionViewModel = this.this$0;
                    arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
                    it = list3.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            break;
                        }
                        ChatSubscriptionBenefits chatSubscriptionBenefits = (ChatSubscriptionBenefits) it.next();
                        SubscriptionBenefitsMapper subscriptionBenefitsMapper = chatActiveSubscriptionViewModel.subscriptionBenefitsMapper;
                        String name = chatInfo != null ? chatInfo.getName() : null;
                        if (name == null) {
                            name = "";
                        }
                        arrayList.add(subscriptionBenefitsMapper.map(chatSubscriptionBenefits, name));
                    }
                    uiStateDelegate = this.this$0;
                    this.L$0 = null;
                    this.label = 3;
                    if (uiStateDelegate.updateUiState(uiStateDelegate, new C01742(arrayList), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                } else {
                    list = (List) this.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                this.L$0 = list;
                this.label = 2;
                obj = this.this$0.chatsInfoInteractor.getChatInfo(this.this$0.chatId, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                ChatInfo chatInfo2 = (ChatInfo) obj;
                List list32 = list;
                ChatActiveSubscriptionViewModel chatActiveSubscriptionViewModel2 = this.this$0;
                arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list32, 10));
                it = list32.iterator();
                while (true) {
                    if (it.hasNext()) {
                    }
                    arrayList.add(subscriptionBenefitsMapper.map(chatSubscriptionBenefits, name));
                }
                uiStateDelegate = this.this$0;
                this.L$0 = null;
                this.label = 3;
                if (uiStateDelegate.updateUiState(uiStateDelegate, new C01742(arrayList), this) == coroutine_suspended) {
                }
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: ChatActiveSubscriptionViewModel.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/presentation/features/purchases/chatsubscription/activesubscription/viewmodel/ChatActiveSubscriptionViewModel$UiState;", "state", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.ifriend.presentation.features.purchases.chatsubscription.activesubscription.viewmodel.ChatActiveSubscriptionViewModel$3$2$2  reason: invalid class name and collision with other inner class name */
            /* loaded from: classes6.dex */
            public static final class C01742 extends Lambda implements Function1<UiState, UiState> {
                final /* synthetic */ List<SubscriptionBenefitsGroupUiParams> $benefitsUi;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C01742(List<SubscriptionBenefitsGroupUiParams> list) {
                    super(1);
                    this.$benefitsUi = list;
                }

                @Override // kotlin.jvm.functions.Function1
                public final UiState invoke(UiState state) {
                    Intrinsics.checkNotNullParameter(state, "state");
                    return UiState.m6953copyjzV_Hc0$default(state, false, null, null, null, 0L, ExtensionsKt.toImmutableList(this.$benefitsUi), 31, null);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ChatActiveSubscriptionViewModel.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u008a@"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "", "Lcom/ifriend/domain/logic/chat/subscription/models/ChatSubscriptionBenefits;", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.ifriend.presentation.features.purchases.chatsubscription.activesubscription.viewmodel.ChatActiveSubscriptionViewModel$3$3", f = "ChatActiveSubscriptionViewModel.kt", i = {}, l = {125}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.ifriend.presentation.features.purchases.chatsubscription.activesubscription.viewmodel.ChatActiveSubscriptionViewModel$3$3  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes6.dex */
        public static final class C01753 extends SuspendLambda implements Function3<FlowCollector<? super List<? extends ChatSubscriptionBenefits>>, Throwable, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ ChatActiveSubscriptionViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C01753(ChatActiveSubscriptionViewModel chatActiveSubscriptionViewModel, Continuation<? super C01753> continuation) {
                super(3, continuation);
                this.this$0 = chatActiveSubscriptionViewModel;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super List<? extends ChatSubscriptionBenefits>> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
                return invoke2((FlowCollector<? super List<ChatSubscriptionBenefits>>) flowCollector, th, continuation);
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final Object invoke2(FlowCollector<? super List<ChatSubscriptionBenefits>> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
                return new C01753(this.this$0, continuation).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: ChatActiveSubscriptionViewModel.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/presentation/features/purchases/chatsubscription/activesubscription/viewmodel/ChatActiveSubscriptionViewModel$UiState;", "state", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.ifriend.presentation.features.purchases.chatsubscription.activesubscription.viewmodel.ChatActiveSubscriptionViewModel$3$3$1  reason: invalid class name */
            /* loaded from: classes6.dex */
            public static final class AnonymousClass1 extends Lambda implements Function1<UiState, UiState> {
                public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

                AnonymousClass1() {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final UiState invoke(UiState state) {
                    Intrinsics.checkNotNullParameter(state, "state");
                    return UiState.m6953copyjzV_Hc0$default(state, false, null, null, null, 0L, null, 62, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    UiStateDelegate<UiState, Object> uiStateDelegate = this.this$0;
                    this.label = 1;
                    if (uiStateDelegate.updateUiState(uiStateDelegate, AnonymousClass1.INSTANCE, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }
    }

    public final void onManageSubscriptionClick() {
        this.appEventsEmitter.emit(new AppEvents.OpenLink(this.appInfoProvider.getGooglePlayStoreSubscriptionsLink()));
    }
}
