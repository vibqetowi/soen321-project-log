package com.ifriend.presentation.features.chatsettings.viewmodel;

import android.content.res.ColorStateList;
import android.graphics.Typeface;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.ViewModel;
import com.facebook.internal.NativeProtocol;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.ifriend.analytics.usecase.purchase.PurchaseSource;
import com.ifriend.platform.tools.api.ResourceProvider;
import com.ifriend.presentation.common.observers.appevents.AppEvents;
import com.ifriend.presentation.common.observers.appevents.AppEventsEmitter;
import com.ifriend.presentation.common.observers.appevents.params.BuyChatSubscriptionBillingUiParams;
import com.ifriend.presentation.common.uistate.UiStateDelegate;
import com.ifriend.presentation.common.uistate.UiStateDelegateImpl;
import com.ifriend.presentation.features.chatsettings.delegates.ChatSettingsConfigurationDelegate;
import com.ifriend.presentation.features.chatsettings.delegates.ChatSettingsLevelsDelegate;
import com.ifriend.presentation.features.purchases.billing.models.PurchaseReason;
import com.ifriend.presentation.features.purchases.common.model.UpgradeType;
import java.util.List;
import java.util.UUID;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ExtensionsKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;
/* compiled from: ChatSettingsViewModel.kt */
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005:\u0001NB-\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u001e\u001a\u00020\u001f2\b\b\u0001\u0010 \u001a\u00020!H\u0096\u0001J\u0013\u0010\"\u001a\u00020#2\b\b\u0001\u0010$\u001a\u00020!H\u0096\u0001J\u0013\u0010%\u001a\u00020!2\b\b\u0001\u0010&\u001a\u00020!H\u0097\u0001J\u0015\u0010'\u001a\u0004\u0018\u00010(2\b\b\u0001\u0010 \u001a\u00020!H\u0096\u0001J\u0013\u0010)\u001a\u00020!2\b\b\u0001\u0010 \u001a\u00020!H\u0096\u0001J\u0019\u0010*\u001a\b\u0012\u0004\u0012\u00020!0+2\b\b\u0001\u0010 \u001a\u00020!H\u0096\u0001J\u001b\u0010,\u001a\u00020\t2\b\b\u0001\u0010-\u001a\u00020!2\u0006\u0010.\u001a\u00020!H\u0096\u0001J4\u0010,\u001a\u00020\t2\b\b\u0001\u0010-\u001a\u00020!2\u0006\u0010.\u001a\u00020!2\u0012\u0010/\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000700\"\u00020\u0007H\u0096\u0001¢\u0006\u0002\u00101J\u0013\u00102\u001a\u00020\t2\b\b\u0001\u0010-\u001a\u00020!H\u0096\u0001J,\u00102\u001a\u00020\t2\b\b\u0001\u0010-\u001a\u00020!2\u0012\u0010/\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000700\"\u00020\u0007H\u0096\u0001¢\u0006\u0002\u00103J\u0019\u00104\u001a\b\u0012\u0004\u0012\u00020\t0+2\b\b\u0001\u0010-\u001a\u00020!H\u0096\u0001J\u001a\u00105\u001a\u0002062\u0006\u0010\b\u001a\u00020\tH\u0096\u0001R\u00020\u0000¢\u0006\u0002\u00107J\u0012\u00108\u001a\u000206H\u0096\u0001R\u00020\u0000¢\u0006\u0002\u00109J\u000e\u0010:\u001a\u0002062\u0006\u0010;\u001a\u00020<J\u0006\u0010=\u001a\u000206J0\u0010>\u001a\u000206*\u00020?2!\u0010;\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\bA\u0012\b\bB\u0012\u0004\b\b(C\u0012\u0004\u0012\u00020\u00060@H\u0097\u0001JD\u0010D\u001a\u00020E*\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u0006\u0010F\u001a\u00020?2!\u0010G\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\bA\u0012\b\bB\u0012\u0004\b\b(C\u0012\u0004\u0012\u00020\u00060@H\u0096\u0001JD\u0010H\u001a\u000206*\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052!\u0010;\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\bA\u0012\b\bB\u0012\u0004\b\b(C\u0012\u0004\u0012\u00020\u00060@H\u0097Aø\u0001\u0000¢\u0006\u0002\u0010IJ)\u0010J\u001a\u000206*\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u0006\u0010K\u001a\u00020\u0007H\u0096Aø\u0001\u0000¢\u0006\u0002\u0010LJD\u0010M\u001a\u000206*\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052!\u0010G\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\bA\u0012\b\bB\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u00060@H\u0096Aø\u0001\u0000¢\u0006\u0002\u0010IR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0010\u001a\u00020\tX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\f\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u0014X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u0018X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\"\u0010\u001b\u001a\u00020\u0006*\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006O"}, d2 = {"Lcom/ifriend/presentation/features/chatsettings/viewmodel/ChatSettingsViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/ifriend/presentation/features/chatsettings/delegates/ChatSettingsConfigurationDelegate;", "Lcom/ifriend/presentation/features/chatsettings/delegates/ChatSettingsLevelsDelegate;", "Lcom/ifriend/platform/tools/api/ResourceProvider;", "Lcom/ifriend/presentation/common/uistate/UiStateDelegate;", "Lcom/ifriend/presentation/features/chatsettings/viewmodel/ChatSettingsViewModel$UiState;", "", "chatId", "", "chatSettingsLevelsDelegate", "chatSettingsConfigurationDelegate", "resourceProvider", "appEventsEmitter", "Lcom/ifriend/presentation/common/observers/appevents/AppEventsEmitter;", "(Ljava/lang/String;Lcom/ifriend/presentation/features/chatsettings/delegates/ChatSettingsLevelsDelegate;Lcom/ifriend/presentation/features/chatsettings/delegates/ChatSettingsConfigurationDelegate;Lcom/ifriend/platform/tools/api/ResourceProvider;Lcom/ifriend/presentation/common/observers/appevents/AppEventsEmitter;)V", RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, "getPackageName", "()Ljava/lang/String;", "singleEvents", "Lkotlinx/coroutines/flow/Flow;", "getSingleEvents", "()Lkotlinx/coroutines/flow/Flow;", "uiStateFlow", "Lkotlinx/coroutines/flow/StateFlow;", "getUiStateFlow", "()Lkotlinx/coroutines/flow/StateFlow;", "uiState", "getUiState", "(Lcom/ifriend/presentation/common/uistate/UiStateDelegate;)Lcom/ifriend/presentation/features/chatsettings/viewmodel/ChatSettingsViewModel$UiState;", "getBoolean", "", "resId", "", "getColorStateList", "Landroid/content/res/ColorStateList;", "colorResId", "getDimensionPixelSize", "dimenRes", "getFont", "Landroid/graphics/Typeface;", "getInteger", "getIntegerArray", "", "getQuantityString", "res", FirebaseAnalytics.Param.QUANTITY, "args", "", "(II[Ljava/lang/Object;)Ljava/lang/String;", "getString", "(I[Ljava/lang/Object;)Ljava/lang/String;", "getStringArray", "initChatSettingsConfiguration", "", "(Lcom/ifriend/presentation/features/chatsettings/viewmodel/ChatSettingsViewModel;Ljava/lang/String;)V", "initChatSettingsLevelsDelegate", "(Lcom/ifriend/presentation/features/chatsettings/viewmodel/ChatSettingsViewModel;)V", "onActionTagClick", NativeProtocol.WEB_DIALOG_ACTION, "Lcom/ifriend/presentation/features/chatsettings/viewmodel/ChatSettingsViewModel$UiState$ActionTag;", "onSubscriptionBadgeClick", "asyncReduce", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "state", "asyncUpdateUiState", "Lkotlinx/coroutines/Job;", "coroutineScope", "transform", "reduce", "(Lcom/ifriend/presentation/common/uistate/UiStateDelegate;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendEvent", NotificationCompat.CATEGORY_EVENT, "(Lcom/ifriend/presentation/common/uistate/UiStateDelegate;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateUiState", "UiState", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatSettingsViewModel extends ViewModel implements ChatSettingsConfigurationDelegate, ChatSettingsLevelsDelegate, ResourceProvider, UiStateDelegate<UiState, Object> {
    public static final int $stable = 8;
    private final /* synthetic */ UiStateDelegateImpl<UiState, Object> $$delegate_3;
    private final AppEventsEmitter appEventsEmitter;
    private final String chatId;
    private final ChatSettingsConfigurationDelegate chatSettingsConfigurationDelegate;
    private final ChatSettingsLevelsDelegate chatSettingsLevelsDelegate;
    private final ResourceProvider resourceProvider;

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    @Deprecated(message = "use method UiStateDelegate<UiState, Event>.asyncUpdateInternalState")
    public void asyncReduce(CoroutineScope coroutineScope, Function1<? super UiState, ? extends UiState> action) {
        Intrinsics.checkNotNullParameter(coroutineScope, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        this.$$delegate_3.asyncReduce(coroutineScope, action);
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    public Job asyncUpdateUiState(UiStateDelegate<UiState, Object> uiStateDelegate, CoroutineScope coroutineScope, Function1<? super UiState, ? extends UiState> transform) {
        Intrinsics.checkNotNullParameter(uiStateDelegate, "<this>");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return this.$$delegate_3.asyncUpdateUiState(uiStateDelegate, coroutineScope, transform);
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
        return this.$$delegate_3.getSingleEvents();
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
        return this.$$delegate_3.getUiState(uiStateDelegate);
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    public StateFlow<UiState> getUiStateFlow() {
        return this.$$delegate_3.getUiStateFlow();
    }

    @Override // com.ifriend.presentation.features.chatsettings.delegates.ChatSettingsConfigurationDelegate
    public void initChatSettingsConfiguration(ChatSettingsViewModel context_receiver_0, String chatId) {
        Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        this.chatSettingsConfigurationDelegate.initChatSettingsConfiguration(context_receiver_0, chatId);
    }

    @Override // com.ifriend.presentation.features.chatsettings.delegates.ChatSettingsLevelsDelegate
    public void initChatSettingsLevelsDelegate(ChatSettingsViewModel context_receiver_0) {
        Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
        this.chatSettingsLevelsDelegate.initChatSettingsLevelsDelegate(context_receiver_0);
    }

    public final void onActionTagClick(UiState.ActionTag action) {
        Intrinsics.checkNotNullParameter(action, "action");
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    @Deprecated(message = "use method UiStateDelegate<UiState, Event>.updateUiState")
    public Object reduce(UiStateDelegate<UiState, Object> uiStateDelegate, Function1<? super UiState, ? extends UiState> function1, Continuation<? super Unit> continuation) {
        return this.$$delegate_3.reduce(uiStateDelegate, function1, continuation);
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    public Object sendEvent(UiStateDelegate<UiState, Object> uiStateDelegate, Object obj, Continuation<? super Unit> continuation) {
        return this.$$delegate_3.sendEvent(uiStateDelegate, obj, continuation);
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    public Object updateUiState(UiStateDelegate<UiState, Object> uiStateDelegate, Function1<? super UiState, ? extends UiState> function1, Continuation<? super Unit> continuation) {
        return this.$$delegate_3.updateUiState(uiStateDelegate, function1, continuation);
    }

    public ChatSettingsViewModel(String chatId, ChatSettingsLevelsDelegate chatSettingsLevelsDelegate, ChatSettingsConfigurationDelegate chatSettingsConfigurationDelegate, ResourceProvider resourceProvider, AppEventsEmitter appEventsEmitter) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(chatSettingsLevelsDelegate, "chatSettingsLevelsDelegate");
        Intrinsics.checkNotNullParameter(chatSettingsConfigurationDelegate, "chatSettingsConfigurationDelegate");
        Intrinsics.checkNotNullParameter(resourceProvider, "resourceProvider");
        Intrinsics.checkNotNullParameter(appEventsEmitter, "appEventsEmitter");
        this.chatId = chatId;
        this.chatSettingsLevelsDelegate = chatSettingsLevelsDelegate;
        this.chatSettingsConfigurationDelegate = chatSettingsConfigurationDelegate;
        this.resourceProvider = resourceProvider;
        this.appEventsEmitter = appEventsEmitter;
        this.$$delegate_3 = new UiStateDelegateImpl<>(new UiState(0.0f, null, false, null, null, null, false, null, null, null, false, 2047, null), 0, null, 6, null);
        initChatSettingsLevelsDelegate(this);
        initChatSettingsConfiguration(this, chatId);
    }

    /* compiled from: ChatSettingsViewModel.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u00010B\u007f\u0012\b\b\u0003\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\r\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0007¢\u0006\u0002\u0010\u0012J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0007HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0007HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\t\u0010'\u001a\u00020\u0007HÆ\u0003J\u000f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00050\rHÆ\u0003J\u000f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u000f0\rHÆ\u0003J\u0083\u0001\u0010*\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00072\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\r2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\r2\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u0007HÆ\u0001J\u0013\u0010+\u001a\u00020\u00072\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020.HÖ\u0001J\t\u0010/\u001a\u00020\u0005HÖ\u0001R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\r¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0011\u0010\u0011\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0019R\u0011\u0010\u000b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0019R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0019R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R\u0011\u0010\u0010\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016¨\u00061"}, d2 = {"Lcom/ifriend/presentation/features/chatsettings/viewmodel/ChatSettingsViewModel$UiState;", "", "lvlProgress", "", "lvlLabel", "", "isVisibleLvlProgress", "", "name", "avatarUrl", "description", "isVerified", "interests", "Lkotlinx/collections/immutable/ImmutableList;", "actionTags", "Lcom/ifriend/presentation/features/chatsettings/viewmodel/ChatSettingsViewModel$UiState$ActionTag;", "subscriptionStateLabel", "isShowSubscriptionState", "(FLjava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLkotlinx/collections/immutable/ImmutableList;Lkotlinx/collections/immutable/ImmutableList;Ljava/lang/String;Z)V", "getActionTags", "()Lkotlinx/collections/immutable/ImmutableList;", "getAvatarUrl", "()Ljava/lang/String;", "getDescription", "getInterests", "()Z", "getLvlLabel", "getLvlProgress", "()F", "getName", "getSubscriptionStateLabel", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "ActionTag", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class UiState {
        public static final int $stable = 0;
        private final ImmutableList<ActionTag> actionTags;
        private final String avatarUrl;
        private final String description;
        private final ImmutableList<String> interests;
        private final boolean isShowSubscriptionState;
        private final boolean isVerified;
        private final boolean isVisibleLvlProgress;
        private final String lvlLabel;
        private final float lvlProgress;
        private final String name;
        private final String subscriptionStateLabel;

        public UiState() {
            this(0.0f, null, false, null, null, null, false, null, null, null, false, 2047, null);
        }

        public final float component1() {
            return this.lvlProgress;
        }

        public final String component10() {
            return this.subscriptionStateLabel;
        }

        public final boolean component11() {
            return this.isShowSubscriptionState;
        }

        public final String component2() {
            return this.lvlLabel;
        }

        public final boolean component3() {
            return this.isVisibleLvlProgress;
        }

        public final String component4() {
            return this.name;
        }

        public final String component5() {
            return this.avatarUrl;
        }

        public final String component6() {
            return this.description;
        }

        public final boolean component7() {
            return this.isVerified;
        }

        public final ImmutableList<String> component8() {
            return this.interests;
        }

        public final ImmutableList<ActionTag> component9() {
            return this.actionTags;
        }

        public final UiState copy(float f, String lvlLabel, boolean z, String name, String avatarUrl, String description, boolean z2, ImmutableList<String> interests, ImmutableList<ActionTag> actionTags, String subscriptionStateLabel, boolean z3) {
            Intrinsics.checkNotNullParameter(lvlLabel, "lvlLabel");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(avatarUrl, "avatarUrl");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(interests, "interests");
            Intrinsics.checkNotNullParameter(actionTags, "actionTags");
            Intrinsics.checkNotNullParameter(subscriptionStateLabel, "subscriptionStateLabel");
            return new UiState(f, lvlLabel, z, name, avatarUrl, description, z2, interests, actionTags, subscriptionStateLabel, z3);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof UiState) {
                UiState uiState = (UiState) obj;
                return Float.compare(this.lvlProgress, uiState.lvlProgress) == 0 && Intrinsics.areEqual(this.lvlLabel, uiState.lvlLabel) && this.isVisibleLvlProgress == uiState.isVisibleLvlProgress && Intrinsics.areEqual(this.name, uiState.name) && Intrinsics.areEqual(this.avatarUrl, uiState.avatarUrl) && Intrinsics.areEqual(this.description, uiState.description) && this.isVerified == uiState.isVerified && Intrinsics.areEqual(this.interests, uiState.interests) && Intrinsics.areEqual(this.actionTags, uiState.actionTags) && Intrinsics.areEqual(this.subscriptionStateLabel, uiState.subscriptionStateLabel) && this.isShowSubscriptionState == uiState.isShowSubscriptionState;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int floatToIntBits = ((Float.floatToIntBits(this.lvlProgress) * 31) + this.lvlLabel.hashCode()) * 31;
            boolean z = this.isVisibleLvlProgress;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            int hashCode = (((((((floatToIntBits + i) * 31) + this.name.hashCode()) * 31) + this.avatarUrl.hashCode()) * 31) + this.description.hashCode()) * 31;
            boolean z2 = this.isVerified;
            int i2 = z2;
            if (z2 != 0) {
                i2 = 1;
            }
            int hashCode2 = (((((((hashCode + i2) * 31) + this.interests.hashCode()) * 31) + this.actionTags.hashCode()) * 31) + this.subscriptionStateLabel.hashCode()) * 31;
            boolean z3 = this.isShowSubscriptionState;
            return hashCode2 + (z3 ? 1 : z3 ? 1 : 0);
        }

        public String toString() {
            float f = this.lvlProgress;
            String str = this.lvlLabel;
            boolean z = this.isVisibleLvlProgress;
            String str2 = this.name;
            String str3 = this.avatarUrl;
            String str4 = this.description;
            boolean z2 = this.isVerified;
            ImmutableList<String> immutableList = this.interests;
            ImmutableList<ActionTag> immutableList2 = this.actionTags;
            String str5 = this.subscriptionStateLabel;
            boolean z3 = this.isShowSubscriptionState;
            return "UiState(lvlProgress=" + f + ", lvlLabel=" + str + ", isVisibleLvlProgress=" + z + ", name=" + str2 + ", avatarUrl=" + str3 + ", description=" + str4 + ", isVerified=" + z2 + ", interests=" + immutableList + ", actionTags=" + immutableList2 + ", subscriptionStateLabel=" + str5 + ", isShowSubscriptionState=" + z3 + ")";
        }

        public UiState(float f, String lvlLabel, boolean z, String name, String avatarUrl, String description, boolean z2, ImmutableList<String> interests, ImmutableList<ActionTag> actionTags, String subscriptionStateLabel, boolean z3) {
            Intrinsics.checkNotNullParameter(lvlLabel, "lvlLabel");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(avatarUrl, "avatarUrl");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(interests, "interests");
            Intrinsics.checkNotNullParameter(actionTags, "actionTags");
            Intrinsics.checkNotNullParameter(subscriptionStateLabel, "subscriptionStateLabel");
            this.lvlProgress = f;
            this.lvlLabel = lvlLabel;
            this.isVisibleLvlProgress = z;
            this.name = name;
            this.avatarUrl = avatarUrl;
            this.description = description;
            this.isVerified = z2;
            this.interests = interests;
            this.actionTags = actionTags;
            this.subscriptionStateLabel = subscriptionStateLabel;
            this.isShowSubscriptionState = z3;
        }

        public final float getLvlProgress() {
            return this.lvlProgress;
        }

        public final String getLvlLabel() {
            return this.lvlLabel;
        }

        public final boolean isVisibleLvlProgress() {
            return this.isVisibleLvlProgress;
        }

        public final String getName() {
            return this.name;
        }

        public final String getAvatarUrl() {
            return this.avatarUrl;
        }

        public final String getDescription() {
            return this.description;
        }

        public final boolean isVerified() {
            return this.isVerified;
        }

        public /* synthetic */ UiState(float f, String str, boolean z, String str2, String str3, String str4, boolean z2, ImmutableList immutableList, ImmutableList immutableList2, String str5, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? 0.0f : f, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? false : z, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? "" : str3, (i & 32) != 0 ? "" : str4, (i & 64) != 0 ? false : z2, (i & 128) != 0 ? ExtensionsKt.persistentListOf() : immutableList, (i & 256) != 0 ? ExtensionsKt.persistentListOf() : immutableList2, (i & 512) == 0 ? str5 : "", (i & 1024) == 0 ? z3 : false);
        }

        public final ImmutableList<String> getInterests() {
            return this.interests;
        }

        public final ImmutableList<ActionTag> getActionTags() {
            return this.actionTags;
        }

        public final String getSubscriptionStateLabel() {
            return this.subscriptionStateLabel;
        }

        public final boolean isShowSubscriptionState() {
            return this.isShowSubscriptionState;
        }

        /* compiled from: ChatSettingsViewModel.kt */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0017B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0007HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/ifriend/presentation/features/chatsettings/viewmodel/ChatSettingsViewModel$UiState$ActionTag;", "", "name", "", "isClickable", "", "actionType", "Lcom/ifriend/presentation/features/chatsettings/viewmodel/ChatSettingsViewModel$UiState$ActionTag$ActionType;", "(Ljava/lang/String;ZLcom/ifriend/presentation/features/chatsettings/viewmodel/ChatSettingsViewModel$UiState$ActionTag$ActionType;)V", "getActionType", "()Lcom/ifriend/presentation/features/chatsettings/viewmodel/ChatSettingsViewModel$UiState$ActionTag$ActionType;", "()Z", "getName", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "ActionType", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class ActionTag {
            public static final int $stable = 0;
            private final ActionType actionType;
            private final boolean isClickable;
            private final String name;

            public static /* synthetic */ ActionTag copy$default(ActionTag actionTag, String str, boolean z, ActionType actionType, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = actionTag.name;
                }
                if ((i & 2) != 0) {
                    z = actionTag.isClickable;
                }
                if ((i & 4) != 0) {
                    actionType = actionTag.actionType;
                }
                return actionTag.copy(str, z, actionType);
            }

            public final String component1() {
                return this.name;
            }

            public final boolean component2() {
                return this.isClickable;
            }

            public final ActionType component3() {
                return this.actionType;
            }

            public final ActionTag copy(String name, boolean z, ActionType actionType) {
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(actionType, "actionType");
                return new ActionTag(name, z, actionType);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof ActionTag) {
                    ActionTag actionTag = (ActionTag) obj;
                    return Intrinsics.areEqual(this.name, actionTag.name) && this.isClickable == actionTag.isClickable && this.actionType == actionTag.actionType;
                }
                return false;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public int hashCode() {
                int hashCode = this.name.hashCode() * 31;
                boolean z = this.isClickable;
                int i = z;
                if (z != 0) {
                    i = 1;
                }
                return ((hashCode + i) * 31) + this.actionType.hashCode();
            }

            public String toString() {
                String str = this.name;
                boolean z = this.isClickable;
                ActionType actionType = this.actionType;
                return "ActionTag(name=" + str + ", isClickable=" + z + ", actionType=" + actionType + ")";
            }

            public ActionTag(String name, boolean z, ActionType actionType) {
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(actionType, "actionType");
                this.name = name;
                this.isClickable = z;
                this.actionType = actionType;
            }

            public final String getName() {
                return this.name;
            }

            public final boolean isClickable() {
                return this.isClickable;
            }

            public final ActionType getActionType() {
                return this.actionType;
            }

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* compiled from: ChatSettingsViewModel.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ifriend/presentation/features/chatsettings/viewmodel/ChatSettingsViewModel$UiState$ActionTag$ActionType;", "", "(Ljava/lang/String;I)V", "GENDER", "AGE", "PERSONALITY", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* loaded from: classes6.dex */
            public static final class ActionType {
                private static final /* synthetic */ EnumEntries $ENTRIES;
                private static final /* synthetic */ ActionType[] $VALUES;
                public static final ActionType GENDER = new ActionType("GENDER", 0);
                public static final ActionType AGE = new ActionType("AGE", 1);
                public static final ActionType PERSONALITY = new ActionType("PERSONALITY", 2);

                private static final /* synthetic */ ActionType[] $values() {
                    return new ActionType[]{GENDER, AGE, PERSONALITY};
                }

                public static EnumEntries<ActionType> getEntries() {
                    return $ENTRIES;
                }

                public static ActionType valueOf(String str) {
                    return (ActionType) Enum.valueOf(ActionType.class, str);
                }

                public static ActionType[] values() {
                    return (ActionType[]) $VALUES.clone();
                }

                private ActionType(String str, int i) {
                }

                static {
                    ActionType[] $values = $values();
                    $VALUES = $values;
                    $ENTRIES = EnumEntriesKt.enumEntries($values);
                }
            }
        }
    }

    public final void onSubscriptionBadgeClick() {
        this.appEventsEmitter.emit(new AppEvents.Billing.BuyChatSubscription(new BuyChatSubscriptionBillingUiParams((UUID) null, this.chatId, false, UpgradeType.ALL, (PurchaseReason) PurchaseReason.Purchase.INSTANCE, (PurchaseSource) null, 33, (DefaultConstructorMarker) null)));
    }
}
