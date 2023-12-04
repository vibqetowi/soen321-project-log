package com.ifriend.presentation.features.purchases.chatsubscription.benefits.viewmodel;

import android.content.res.ColorStateList;
import android.graphics.Typeface;
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
import com.ifriend.platform.tools.api.ResourceProvider;
import com.ifriend.presentation.R;
import com.ifriend.presentation.common.observers.FlowObserverEmitter;
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
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
/* compiled from: ChatSubscriptionBenefitsViewModel.kt */
@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003:\u0001NBL\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0015\u0010\u000f\u001a\u0011\u0012\t\u0012\u00070\u0011¢\u0006\u0002\b\u00120\u0010j\u0002`\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015¢\u0006\u0002\u0010\u0016J\u0013\u0010%\u001a\u00020&2\b\b\u0001\u0010'\u001a\u00020(H\u0096\u0001J\u0013\u0010)\u001a\u00020*2\b\b\u0001\u0010+\u001a\u00020(H\u0096\u0001J\u0013\u0010,\u001a\u00020(2\b\b\u0001\u0010-\u001a\u00020(H\u0097\u0001J\u0015\u0010.\u001a\u0004\u0018\u00010/2\b\b\u0001\u0010'\u001a\u00020(H\u0096\u0001J\u0013\u00100\u001a\u00020(2\b\b\u0001\u0010'\u001a\u00020(H\u0096\u0001J\u0019\u00101\u001a\b\u0012\u0004\u0012\u00020(022\b\b\u0001\u0010'\u001a\u00020(H\u0096\u0001J\u001b\u00103\u001a\u00020\u00072\b\b\u0001\u00104\u001a\u00020(2\u0006\u00105\u001a\u00020(H\u0096\u0001J4\u00103\u001a\u00020\u00072\b\b\u0001\u00104\u001a\u00020(2\u0006\u00105\u001a\u00020(2\u0012\u00106\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000507\"\u00020\u0005H\u0096\u0001¢\u0006\u0002\u00108J\u0013\u00109\u001a\u00020\u00072\b\b\u0001\u00104\u001a\u00020(H\u0096\u0001J,\u00109\u001a\u00020\u00072\b\b\u0001\u00104\u001a\u00020(2\u0012\u00106\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000507\"\u00020\u0005H\u0096\u0001¢\u0006\u0002\u0010:J\u0019\u0010;\u001a\b\u0012\u0004\u0012\u00020\u0007022\b\b\u0001\u00104\u001a\u00020(H\u0096\u0001J0\u0010<\u001a\u00020=*\u00020>2!\u0010?\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\bA\u0012\b\bB\u0012\u0004\b\b(C\u0012\u0004\u0012\u00020\u00040@H\u0097\u0001JD\u0010D\u001a\u00020E*\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010F\u001a\u00020>2!\u0010G\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\bA\u0012\b\bB\u0012\u0004\b\b(C\u0012\u0004\u0012\u00020\u00040@H\u0096\u0001JD\u0010H\u001a\u00020=*\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032!\u0010?\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\bA\u0012\b\bB\u0012\u0004\b\b(C\u0012\u0004\u0012\u00020\u00040@H\u0097Aø\u0001\u0000¢\u0006\u0002\u0010IJ)\u0010J\u001a\u00020=*\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010K\u001a\u00020\u0005H\u0096Aø\u0001\u0000¢\u0006\u0002\u0010LJD\u0010M\u001a\u00020=*\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032!\u0010G\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\bA\u0012\b\bB\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020\u00040@H\u0096Aø\u0001\u0000¢\u0006\u0002\u0010IR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u000f\u001a\u0011\u0012\t\u0012\u00070\u0011¢\u0006\u0002\b\u00120\u0010j\u0002`\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0017\u001a\u00020\u0007X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u000e\u0010\b\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u001bX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\u001fX\u0096\u0005¢\u0006\u0006\u001a\u0004\b \u0010!R\"\u0010\"\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0096\u0005¢\u0006\u0006\u001a\u0004\b#\u0010$\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006O"}, d2 = {"Lcom/ifriend/presentation/features/purchases/chatsubscription/benefits/viewmodel/ChatSubscriptionBenefitsViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/ifriend/platform/tools/api/ResourceProvider;", "Lcom/ifriend/presentation/common/uistate/UiStateDelegate;", "Lcom/ifriend/presentation/features/purchases/chatsubscription/benefits/viewmodel/ChatSubscriptionBenefitsViewModel$UiState;", "", "chatId", "", "resourceProvider", "chatsConfigurationInteractor", "Lcom/ifriend/domain/logic/chat/configuration/ChatsConfigurationInteractor;", "subscriptionBenefitsMapper", "Lcom/ifriend/presentation/features/purchases/chatsubscription/common/mappers/SubscriptionBenefitsMapper;", "chatSubscriptionInteractor", "Lcom/ifriend/domain/logic/chat/subscription/ChatSubscriptionInteractor;", "exceptionsEmitter", "Lcom/ifriend/presentation/common/observers/FlowObserverEmitter;", "", "Lkotlin/jvm/JvmSuppressWildcards;", "Lcom/ifriend/presentation/common/observers/exceptions/ExceptionsEmitter;", "chatsInfoInteractor", "Lcom/ifriend/domain/logic/chat/info/ChatsInfoInteractor;", "(Ljava/lang/String;Lcom/ifriend/platform/tools/api/ResourceProvider;Lcom/ifriend/domain/logic/chat/configuration/ChatsConfigurationInteractor;Lcom/ifriend/presentation/features/purchases/chatsubscription/common/mappers/SubscriptionBenefitsMapper;Lcom/ifriend/domain/logic/chat/subscription/ChatSubscriptionInteractor;Lcom/ifriend/presentation/common/observers/FlowObserverEmitter;Lcom/ifriend/domain/logic/chat/info/ChatsInfoInteractor;)V", RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, "getPackageName", "()Ljava/lang/String;", "singleEvents", "Lkotlinx/coroutines/flow/Flow;", "getSingleEvents", "()Lkotlinx/coroutines/flow/Flow;", "uiStateFlow", "Lkotlinx/coroutines/flow/StateFlow;", "getUiStateFlow", "()Lkotlinx/coroutines/flow/StateFlow;", "uiState", "getUiState", "(Lcom/ifriend/presentation/common/uistate/UiStateDelegate;)Lcom/ifriend/presentation/features/purchases/chatsubscription/benefits/viewmodel/ChatSubscriptionBenefitsViewModel$UiState;", "getBoolean", "", "resId", "", "getColorStateList", "Landroid/content/res/ColorStateList;", "colorResId", "getDimensionPixelSize", "dimenRes", "getFont", "Landroid/graphics/Typeface;", "getInteger", "getIntegerArray", "", "getQuantityString", "res", FirebaseAnalytics.Param.QUANTITY, "args", "", "(II[Ljava/lang/Object;)Ljava/lang/String;", "getString", "(I[Ljava/lang/Object;)Ljava/lang/String;", "getStringArray", "asyncReduce", "", "Lkotlinx/coroutines/CoroutineScope;", NativeProtocol.WEB_DIALOG_ACTION, "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "state", "asyncUpdateUiState", "Lkotlinx/coroutines/Job;", "coroutineScope", "transform", "reduce", "(Lcom/ifriend/presentation/common/uistate/UiStateDelegate;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendEvent", NotificationCompat.CATEGORY_EVENT, "(Lcom/ifriend/presentation/common/uistate/UiStateDelegate;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateUiState", "UiState", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatSubscriptionBenefitsViewModel extends ViewModel implements ResourceProvider, UiStateDelegate<UiState, Object> {
    public static final int $stable = 8;
    private final /* synthetic */ UiStateDelegateImpl<UiState, Object> $$delegate_1;
    private final String chatId;
    private final ChatSubscriptionInteractor chatSubscriptionInteractor;
    private final ChatsConfigurationInteractor chatsConfigurationInteractor;
    private final ChatsInfoInteractor chatsInfoInteractor;
    private final FlowObserverEmitter<Throwable> exceptionsEmitter;
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

    public ChatSubscriptionBenefitsViewModel(String chatId, ResourceProvider resourceProvider, ChatsConfigurationInteractor chatsConfigurationInteractor, SubscriptionBenefitsMapper subscriptionBenefitsMapper, ChatSubscriptionInteractor chatSubscriptionInteractor, FlowObserverEmitter<Throwable> exceptionsEmitter, ChatsInfoInteractor chatsInfoInteractor) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(resourceProvider, "resourceProvider");
        Intrinsics.checkNotNullParameter(chatsConfigurationInteractor, "chatsConfigurationInteractor");
        Intrinsics.checkNotNullParameter(subscriptionBenefitsMapper, "subscriptionBenefitsMapper");
        Intrinsics.checkNotNullParameter(chatSubscriptionInteractor, "chatSubscriptionInteractor");
        Intrinsics.checkNotNullParameter(exceptionsEmitter, "exceptionsEmitter");
        Intrinsics.checkNotNullParameter(chatsInfoInteractor, "chatsInfoInteractor");
        this.chatId = chatId;
        this.resourceProvider = resourceProvider;
        this.chatsConfigurationInteractor = chatsConfigurationInteractor;
        this.subscriptionBenefitsMapper = subscriptionBenefitsMapper;
        this.chatSubscriptionInteractor = chatSubscriptionInteractor;
        this.exceptionsEmitter = exceptionsEmitter;
        this.chatsInfoInteractor = chatsInfoInteractor;
        this.$$delegate_1 = new UiStateDelegateImpl<>(new UiState(false, null, null, 0L, null, 31, null), 0, null, 6, null);
        ChatSubscriptionBenefitsViewModel chatSubscriptionBenefitsViewModel = this;
        CoroutinesKt.safeLaunch$default(ViewModelKt.getViewModelScope(chatSubscriptionBenefitsViewModel), null, null, new AnonymousClass1(null), 3, null);
        CoroutinesKt.safeLaunch$default(ViewModelKt.getViewModelScope(chatSubscriptionBenefitsViewModel), new AnonymousClass2(exceptionsEmitter), null, new AnonymousClass3(null), 2, null);
    }

    /* compiled from: ChatSubscriptionBenefitsViewModel.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B@\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nø\u0001\u0000¢\u0006\u0002\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\u0019\u0010\u0019\u001a\u00020\bHÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0012J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003JN\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020\u00032\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0005HÖ\u0001R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0007\u001a\u00020\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006$"}, d2 = {"Lcom/ifriend/presentation/features/purchases/chatsubscription/benefits/viewmodel/ChatSubscriptionBenefitsViewModel$UiState;", "", "isLoading", "", "chatName", "", "screenTitle", "gradientColor", "Landroidx/compose/ui/graphics/Color;", "benefits", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/ifriend/presentation/features/purchases/common/model/SubscriptionBenefitsGroupUiParams;", "(ZLjava/lang/String;Ljava/lang/String;JLkotlinx/collections/immutable/ImmutableList;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getBenefits", "()Lkotlinx/collections/immutable/ImmutableList;", "getChatName", "()Ljava/lang/String;", "getGradientColor-0d7_KjU", "()J", "J", "()Z", "getScreenTitle", "component1", "component2", "component3", "component4", "component4-0d7_KjU", "component5", "copy", "copy-42QJj7c", "(ZLjava/lang/String;Ljava/lang/String;JLkotlinx/collections/immutable/ImmutableList;)Lcom/ifriend/presentation/features/purchases/chatsubscription/benefits/viewmodel/ChatSubscriptionBenefitsViewModel$UiState;", "equals", "other", "hashCode", "", "toString", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class UiState {
        public static final int $stable = 8;
        private final ImmutableList<SubscriptionBenefitsGroupUiParams> benefits;
        private final String chatName;
        private final long gradientColor;
        private final boolean isLoading;
        private final String screenTitle;

        public /* synthetic */ UiState(boolean z, String str, String str2, long j, ImmutableList immutableList, DefaultConstructorMarker defaultConstructorMarker) {
            this(z, str, str2, j, immutableList);
        }

        /* renamed from: copy-42QJj7c$default  reason: not valid java name */
        public static /* synthetic */ UiState m6957copy42QJj7c$default(UiState uiState, boolean z, String str, String str2, long j, ImmutableList immutableList, int i, Object obj) {
            if ((i & 1) != 0) {
                z = uiState.isLoading;
            }
            if ((i & 2) != 0) {
                str = uiState.chatName;
            }
            String str3 = str;
            if ((i & 4) != 0) {
                str2 = uiState.screenTitle;
            }
            String str4 = str2;
            if ((i & 8) != 0) {
                j = uiState.gradientColor;
            }
            long j2 = j;
            ImmutableList<SubscriptionBenefitsGroupUiParams> immutableList2 = immutableList;
            if ((i & 16) != 0) {
                immutableList2 = uiState.benefits;
            }
            return uiState.m6959copy42QJj7c(z, str3, str4, j2, immutableList2);
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

        /* renamed from: component4-0d7_KjU  reason: not valid java name */
        public final long m6958component40d7_KjU() {
            return this.gradientColor;
        }

        public final ImmutableList<SubscriptionBenefitsGroupUiParams> component5() {
            return this.benefits;
        }

        /* renamed from: copy-42QJj7c  reason: not valid java name */
        public final UiState m6959copy42QJj7c(boolean z, String chatName, String screenTitle, long j, ImmutableList<SubscriptionBenefitsGroupUiParams> benefits) {
            Intrinsics.checkNotNullParameter(chatName, "chatName");
            Intrinsics.checkNotNullParameter(screenTitle, "screenTitle");
            Intrinsics.checkNotNullParameter(benefits, "benefits");
            return new UiState(z, chatName, screenTitle, j, benefits, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof UiState) {
                UiState uiState = (UiState) obj;
                return this.isLoading == uiState.isLoading && Intrinsics.areEqual(this.chatName, uiState.chatName) && Intrinsics.areEqual(this.screenTitle, uiState.screenTitle) && Color.m3292equalsimpl0(this.gradientColor, uiState.gradientColor) && Intrinsics.areEqual(this.benefits, uiState.benefits);
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v10 */
        /* JADX WARN: Type inference failed for: r0v11 */
        public int hashCode() {
            boolean z = this.isLoading;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            return (((((((r0 * 31) + this.chatName.hashCode()) * 31) + this.screenTitle.hashCode()) * 31) + Color.m3298hashCodeimpl(this.gradientColor)) * 31) + this.benefits.hashCode();
        }

        public String toString() {
            boolean z = this.isLoading;
            String str = this.chatName;
            String str2 = this.screenTitle;
            String m3299toStringimpl = Color.m3299toStringimpl(this.gradientColor);
            ImmutableList<SubscriptionBenefitsGroupUiParams> immutableList = this.benefits;
            return "UiState(isLoading=" + z + ", chatName=" + str + ", screenTitle=" + str2 + ", gradientColor=" + m3299toStringimpl + ", benefits=" + immutableList + ")";
        }

        private UiState(boolean z, String chatName, String screenTitle, long j, ImmutableList<SubscriptionBenefitsGroupUiParams> benefits) {
            Intrinsics.checkNotNullParameter(chatName, "chatName");
            Intrinsics.checkNotNullParameter(screenTitle, "screenTitle");
            Intrinsics.checkNotNullParameter(benefits, "benefits");
            this.isLoading = z;
            this.chatName = chatName;
            this.screenTitle = screenTitle;
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

        public /* synthetic */ UiState(boolean z, String str, String str2, long j, ImmutableList immutableList, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? "" : str, (i & 4) == 0 ? str2 : "", (i & 8) != 0 ? Color.Companion.m3326getTransparent0d7_KjU() : j, (i & 16) != 0 ? ExtensionsKt.persistentListOf() : immutableList, null);
        }

        /* renamed from: getGradientColor-0d7_KjU  reason: not valid java name */
        public final long m6960getGradientColor0d7_KjU() {
            return this.gradientColor;
        }

        public final ImmutableList<SubscriptionBenefitsGroupUiParams> getBenefits() {
            return this.benefits;
        }
    }

    /* compiled from: ChatSubscriptionBenefitsViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.ifriend.presentation.features.purchases.chatsubscription.benefits.viewmodel.ChatSubscriptionBenefitsViewModel$1", f = "ChatSubscriptionBenefitsViewModel.kt", i = {}, l = {57}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.ifriend.presentation.features.purchases.chatsubscription.benefits.viewmodel.ChatSubscriptionBenefitsViewModel$1  reason: invalid class name */
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
                obj = ChatSubscriptionBenefitsViewModel.this.chatsConfigurationInteractor.getChatConfigurationFlow(ChatSubscriptionBenefitsViewModel.this.chatId, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                ResultKt.throwOnFailure(obj);
            }
            FlowKt.launchIn(FlowKt.onEach((Flow) obj, new C01761(ChatSubscriptionBenefitsViewModel.this, null)), ViewModelKt.getViewModelScope(ChatSubscriptionBenefitsViewModel.this));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ChatSubscriptionBenefitsViewModel.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/ifriend/domain/logic/chat/configuration/ChatsConfiguration;", "chat", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.ifriend.presentation.features.purchases.chatsubscription.benefits.viewmodel.ChatSubscriptionBenefitsViewModel$1$1", f = "ChatSubscriptionBenefitsViewModel.kt", i = {}, l = {68}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.ifriend.presentation.features.purchases.chatsubscription.benefits.viewmodel.ChatSubscriptionBenefitsViewModel$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes6.dex */
        public static final class C01761 extends SuspendLambda implements Function2<ChatsConfiguration, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ ChatSubscriptionBenefitsViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C01761(ChatSubscriptionBenefitsViewModel chatSubscriptionBenefitsViewModel, Continuation<? super C01761> continuation) {
                super(2, continuation);
                this.this$0 = chatSubscriptionBenefitsViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C01761 c01761 = new C01761(this.this$0, continuation);
                c01761.L$0 = obj;
                return c01761;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ChatsConfiguration chatsConfiguration, Continuation<? super Unit> continuation) {
                return ((C01761) create(chatsConfiguration, continuation)).invokeSuspend(Unit.INSTANCE);
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
                    if (uiStateDelegate.updateUiState(uiStateDelegate, new C01771(chatInfo, this.this$0, m7040hexToColorSafe4WTKRHQ), this) == coroutine_suspended) {
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
            /* compiled from: ChatSubscriptionBenefitsViewModel.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/presentation/features/purchases/chatsubscription/benefits/viewmodel/ChatSubscriptionBenefitsViewModel$UiState;", "state", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.ifriend.presentation.features.purchases.chatsubscription.benefits.viewmodel.ChatSubscriptionBenefitsViewModel$1$1$1  reason: invalid class name and collision with other inner class name */
            /* loaded from: classes6.dex */
            public static final class C01771 extends Lambda implements Function1<UiState, UiState> {
                final /* synthetic */ ChatInfo $chatInfo;
                final /* synthetic */ long $gradientColor;
                final /* synthetic */ ChatSubscriptionBenefitsViewModel this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C01771(ChatInfo chatInfo, ChatSubscriptionBenefitsViewModel chatSubscriptionBenefitsViewModel, long j) {
                    super(1);
                    this.$chatInfo = chatInfo;
                    this.this$0 = chatSubscriptionBenefitsViewModel;
                    this.$gradientColor = j;
                }

                @Override // kotlin.jvm.functions.Function1
                public final UiState invoke(UiState state) {
                    Intrinsics.checkNotNullParameter(state, "state");
                    String name = this.$chatInfo.getName();
                    String upperCase = this.this$0.getString(R.string.buy_subscriotion_benefits__screen_title).toUpperCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                    return UiState.m6957copy42QJj7c$default(state, false, name, upperCase, this.$gradientColor, null, 17, null);
                }
            }
        }
    }

    /* compiled from: ChatSubscriptionBenefitsViewModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.presentation.features.purchases.chatsubscription.benefits.viewmodel.ChatSubscriptionBenefitsViewModel$2  reason: invalid class name */
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

    /* compiled from: ChatSubscriptionBenefitsViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.ifriend.presentation.features.purchases.chatsubscription.benefits.viewmodel.ChatSubscriptionBenefitsViewModel$3", f = "ChatSubscriptionBenefitsViewModel.kt", i = {}, l = {80}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.ifriend.presentation.features.purchases.chatsubscription.benefits.viewmodel.ChatSubscriptionBenefitsViewModel$3  reason: invalid class name */
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
                obj = ChatSubscriptionBenefitsViewModel.this.chatSubscriptionInteractor.getSubscriptionBenefitsFlow(ChatSubscriptionBenefitsViewModel.this.chatId, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                ResultKt.throwOnFailure(obj);
            }
            FlowKt.launchIn(FlowKt.m8846catch(FlowKt.onEach(FlowKt.onStart((Flow) obj, new AnonymousClass1(ChatSubscriptionBenefitsViewModel.this, null)), new AnonymousClass2(ChatSubscriptionBenefitsViewModel.this, null)), new C01793(ChatSubscriptionBenefitsViewModel.this, null)), ViewModelKt.getViewModelScope(ChatSubscriptionBenefitsViewModel.this));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ChatSubscriptionBenefitsViewModel.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "", "Lcom/ifriend/domain/logic/chat/subscription/models/ChatSubscriptionBenefits;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.ifriend.presentation.features.purchases.chatsubscription.benefits.viewmodel.ChatSubscriptionBenefitsViewModel$3$1", f = "ChatSubscriptionBenefitsViewModel.kt", i = {}, l = {82}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.ifriend.presentation.features.purchases.chatsubscription.benefits.viewmodel.ChatSubscriptionBenefitsViewModel$3$1  reason: invalid class name */
        /* loaded from: classes6.dex */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<FlowCollector<? super List<? extends ChatSubscriptionBenefits>>, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ ChatSubscriptionBenefitsViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(ChatSubscriptionBenefitsViewModel chatSubscriptionBenefitsViewModel, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = chatSubscriptionBenefitsViewModel;
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
            /* compiled from: ChatSubscriptionBenefitsViewModel.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/presentation/features/purchases/chatsubscription/benefits/viewmodel/ChatSubscriptionBenefitsViewModel$UiState;", "state", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.ifriend.presentation.features.purchases.chatsubscription.benefits.viewmodel.ChatSubscriptionBenefitsViewModel$3$1$1  reason: invalid class name and collision with other inner class name */
            /* loaded from: classes6.dex */
            public static final class C01781 extends Lambda implements Function1<UiState, UiState> {
                public static final C01781 INSTANCE = new C01781();

                C01781() {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final UiState invoke(UiState state) {
                    Intrinsics.checkNotNullParameter(state, "state");
                    return UiState.m6957copy42QJj7c$default(state, true, null, null, 0L, null, 30, null);
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
                    if (uiStateDelegate.updateUiState(uiStateDelegate, C01781.INSTANCE, this) == coroutine_suspended) {
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
        /* compiled from: ChatSubscriptionBenefitsViewModel.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"", "Lcom/ifriend/domain/logic/chat/subscription/models/ChatSubscriptionBenefits;", "benefits", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.ifriend.presentation.features.purchases.chatsubscription.benefits.viewmodel.ChatSubscriptionBenefitsViewModel$3$2", f = "ChatSubscriptionBenefitsViewModel.kt", i = {0}, l = {85, 94}, m = "invokeSuspend", n = {"benefits"}, s = {"L$0"})
        /* renamed from: com.ifriend.presentation.features.purchases.chatsubscription.benefits.viewmodel.ChatSubscriptionBenefitsViewModel$3$2  reason: invalid class name */
        /* loaded from: classes6.dex */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<List<? extends ChatSubscriptionBenefits>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ ChatSubscriptionBenefitsViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(ChatSubscriptionBenefitsViewModel chatSubscriptionBenefitsViewModel, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = chatSubscriptionBenefitsViewModel;
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

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                List list;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    list = (List) this.L$0;
                    this.L$0 = list;
                    this.label = 1;
                    obj = this.this$0.chatsInfoInteractor.getChatInfo(this.this$0.chatId, this);
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
                    list = (List) this.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                ChatInfo chatInfo = (ChatInfo) obj;
                List list2 = list;
                ChatSubscriptionBenefitsViewModel chatSubscriptionBenefitsViewModel = this.this$0;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                Iterator it = list2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    ChatSubscriptionBenefits chatSubscriptionBenefits = (ChatSubscriptionBenefits) it.next();
                    SubscriptionBenefitsMapper subscriptionBenefitsMapper = chatSubscriptionBenefitsViewModel.subscriptionBenefitsMapper;
                    String name = chatInfo != null ? chatInfo.getName() : null;
                    if (name == null) {
                        name = "";
                    }
                    arrayList.add(subscriptionBenefitsMapper.map(chatSubscriptionBenefits, name));
                }
                UiStateDelegate<UiState, Object> uiStateDelegate = this.this$0;
                this.L$0 = null;
                this.label = 2;
                if (uiStateDelegate.updateUiState(uiStateDelegate, new AnonymousClass1(arrayList), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: ChatSubscriptionBenefitsViewModel.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/presentation/features/purchases/chatsubscription/benefits/viewmodel/ChatSubscriptionBenefitsViewModel$UiState;", "state", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.ifriend.presentation.features.purchases.chatsubscription.benefits.viewmodel.ChatSubscriptionBenefitsViewModel$3$2$1  reason: invalid class name */
            /* loaded from: classes6.dex */
            public static final class AnonymousClass1 extends Lambda implements Function1<UiState, UiState> {
                final /* synthetic */ List<SubscriptionBenefitsGroupUiParams> $benefitsUi;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(List<SubscriptionBenefitsGroupUiParams> list) {
                    super(1);
                    this.$benefitsUi = list;
                }

                @Override // kotlin.jvm.functions.Function1
                public final UiState invoke(UiState state) {
                    Intrinsics.checkNotNullParameter(state, "state");
                    return UiState.m6957copy42QJj7c$default(state, false, null, null, 0L, ExtensionsKt.toImmutableList(this.$benefitsUi), 14, null);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ChatSubscriptionBenefitsViewModel.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u008a@"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "", "Lcom/ifriend/domain/logic/chat/subscription/models/ChatSubscriptionBenefits;", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.ifriend.presentation.features.purchases.chatsubscription.benefits.viewmodel.ChatSubscriptionBenefitsViewModel$3$3", f = "ChatSubscriptionBenefitsViewModel.kt", i = {}, l = {102}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.ifriend.presentation.features.purchases.chatsubscription.benefits.viewmodel.ChatSubscriptionBenefitsViewModel$3$3  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes6.dex */
        public static final class C01793 extends SuspendLambda implements Function3<FlowCollector<? super List<? extends ChatSubscriptionBenefits>>, Throwable, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ ChatSubscriptionBenefitsViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C01793(ChatSubscriptionBenefitsViewModel chatSubscriptionBenefitsViewModel, Continuation<? super C01793> continuation) {
                super(3, continuation);
                this.this$0 = chatSubscriptionBenefitsViewModel;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super List<? extends ChatSubscriptionBenefits>> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
                return invoke2((FlowCollector<? super List<ChatSubscriptionBenefits>>) flowCollector, th, continuation);
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final Object invoke2(FlowCollector<? super List<ChatSubscriptionBenefits>> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
                return new C01793(this.this$0, continuation).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: ChatSubscriptionBenefitsViewModel.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/presentation/features/purchases/chatsubscription/benefits/viewmodel/ChatSubscriptionBenefitsViewModel$UiState;", "state", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.ifriend.presentation.features.purchases.chatsubscription.benefits.viewmodel.ChatSubscriptionBenefitsViewModel$3$3$1  reason: invalid class name */
            /* loaded from: classes6.dex */
            public static final class AnonymousClass1 extends Lambda implements Function1<UiState, UiState> {
                public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

                AnonymousClass1() {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final UiState invoke(UiState state) {
                    Intrinsics.checkNotNullParameter(state, "state");
                    return UiState.m6957copy42QJj7c$default(state, false, null, null, 0L, null, 30, null);
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
}
