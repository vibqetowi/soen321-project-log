package com.ifriend.presentation.features.chat.configuration;

import android.content.res.ColorStateList;
import android.graphics.Typeface;
import androidx.lifecycle.ViewModelKt;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.ifriend.core.tools.api.DispatcherProvider;
import com.ifriend.core.utils.CoroutinesKt;
import com.ifriend.domain.logic.chat.configuration.ChatsConfigurationInteractor;
import com.ifriend.domain.logic.chat.subscription.ChatSubscriptionInteractor;
import com.ifriend.domain.logic.chat.subscription.ChatSubscriptionState;
import com.ifriend.platform.tools.api.ResourceProvider;
import com.ifriend.presentation.R;
import com.ifriend.presentation.common.observers.FlowObserverEmitter;
import com.ifriend.presentation.features.chat.screen.viewmodel.ChatViewModel;
import dagger.assisted.Assisted;
import dagger.assisted.AssistedInject;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ChatConfigurationDelegate.kt */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002BH\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0015\u0010\t\u001a\u0011\u0012\t\u0012\u00070\u000b¢\u0006\u0002\b\f0\nj\u0002`\r\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010\u0011J\u0013\u0010\u0015\u001a\u00020\u00162\b\b\u0001\u0010\u0017\u001a\u00020\u0018H\u0096\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\b\u0001\u0010\u001b\u001a\u00020\u0018H\u0096\u0001J\u0013\u0010\u001c\u001a\u00020\u00182\b\b\u0001\u0010\u001d\u001a\u00020\u0018H\u0097\u0001J\u0015\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0001\u0010\u0017\u001a\u00020\u0018H\u0096\u0001J\u0013\u0010 \u001a\u00020\u00182\b\b\u0001\u0010\u0017\u001a\u00020\u0018H\u0096\u0001J\u0019\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00180\"2\b\b\u0001\u0010\u0017\u001a\u00020\u0018H\u0096\u0001J\u001b\u0010#\u001a\u00020\u00042\b\b\u0001\u0010$\u001a\u00020\u00182\u0006\u0010%\u001a\u00020\u0018H\u0096\u0001J4\u0010#\u001a\u00020\u00042\b\b\u0001\u0010$\u001a\u00020\u00182\u0006\u0010%\u001a\u00020\u00182\u0012\u0010&\u001a\n\u0012\u0006\b\u0001\u0012\u00020(0'\"\u00020(H\u0096\u0001¢\u0006\u0002\u0010)J\u0013\u0010*\u001a\u00020\u00042\b\b\u0001\u0010$\u001a\u00020\u0018H\u0096\u0001J,\u0010*\u001a\u00020\u00042\b\b\u0001\u0010$\u001a\u00020\u00182\u0012\u0010&\u001a\n\u0012\u0006\b\u0001\u0012\u00020(0'\"\u00020(H\u0096\u0001¢\u0006\u0002\u0010+J\u0019\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00040\"2\b\b\u0001\u0010$\u001a\u00020\u0018H\u0096\u0001J\u0010\u0010-\u001a\u00020\u00042\u0006\u0010.\u001a\u00020/H\u0002J\u0011\u00100\u001a\u000201H\u0016R\u000202¢\u0006\u0002\u00103J\u0010\u00104\u001a\u00020\u00162\u0006\u0010.\u001a\u00020/H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\t\u001a\u0011\u0012\t\u0012\u00070\u000b¢\u0006\u0002\b\f0\nj\u0002`\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0012\u001a\u00020\u0004X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u000e\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00065"}, d2 = {"Lcom/ifriend/presentation/features/chat/configuration/ChatConfigurationDelegateImpl;", "Lcom/ifriend/presentation/features/chat/configuration/ChatConfigurationDelegate;", "Lcom/ifriend/platform/tools/api/ResourceProvider;", "chatId", "", "chatsConfigurationInteractor", "Lcom/ifriend/domain/logic/chat/configuration/ChatsConfigurationInteractor;", "chatSubscriptionInteractor", "Lcom/ifriend/domain/logic/chat/subscription/ChatSubscriptionInteractor;", "exceptionsEmitter", "Lcom/ifriend/presentation/common/observers/FlowObserverEmitter;", "", "Lkotlin/jvm/JvmSuppressWildcards;", "Lcom/ifriend/presentation/common/observers/exceptions/ExceptionsEmitter;", "resourceProvider", "dispatcherProvider", "Lcom/ifriend/core/tools/api/DispatcherProvider;", "(Ljava/lang/String;Lcom/ifriend/domain/logic/chat/configuration/ChatsConfigurationInteractor;Lcom/ifriend/domain/logic/chat/subscription/ChatSubscriptionInteractor;Lcom/ifriend/presentation/common/observers/FlowObserverEmitter;Lcom/ifriend/platform/tools/api/ResourceProvider;Lcom/ifriend/core/tools/api/DispatcherProvider;)V", RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, "getPackageName", "()Ljava/lang/String;", "getBoolean", "", "resId", "", "getColorStateList", "Landroid/content/res/ColorStateList;", "colorResId", "getDimensionPixelSize", "dimenRes", "getFont", "Landroid/graphics/Typeface;", "getInteger", "getIntegerArray", "", "getQuantityString", "res", FirebaseAnalytics.Param.QUANTITY, "args", "", "", "(II[Ljava/lang/Object;)Ljava/lang/String;", "getString", "(I[Ljava/lang/Object;)Ljava/lang/String;", "getStringArray", "getSubscriptionStatusLabel", "state", "Lcom/ifriend/domain/logic/chat/subscription/ChatSubscriptionState;", "initChatConfiguration", "", "Lcom/ifriend/presentation/features/chat/screen/viewmodel/ChatViewModel;", "(Lcom/ifriend/presentation/features/chat/screen/viewmodel/ChatViewModel;)V", "isShowSubscriptionState", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatConfigurationDelegateImpl implements ChatConfigurationDelegate, ResourceProvider {
    public static final int $stable = 8;
    private final String chatId;
    private final ChatSubscriptionInteractor chatSubscriptionInteractor;
    private final ChatsConfigurationInteractor chatsConfigurationInteractor;
    private final DispatcherProvider dispatcherProvider;
    private final FlowObserverEmitter<Throwable> exceptionsEmitter;
    private final ResourceProvider resourceProvider;

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

    @AssistedInject
    public ChatConfigurationDelegateImpl(@Assisted String chatId, ChatsConfigurationInteractor chatsConfigurationInteractor, ChatSubscriptionInteractor chatSubscriptionInteractor, FlowObserverEmitter<Throwable> exceptionsEmitter, ResourceProvider resourceProvider, DispatcherProvider dispatcherProvider) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(chatsConfigurationInteractor, "chatsConfigurationInteractor");
        Intrinsics.checkNotNullParameter(chatSubscriptionInteractor, "chatSubscriptionInteractor");
        Intrinsics.checkNotNullParameter(exceptionsEmitter, "exceptionsEmitter");
        Intrinsics.checkNotNullParameter(resourceProvider, "resourceProvider");
        Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
        this.chatId = chatId;
        this.chatsConfigurationInteractor = chatsConfigurationInteractor;
        this.chatSubscriptionInteractor = chatSubscriptionInteractor;
        this.exceptionsEmitter = exceptionsEmitter;
        this.resourceProvider = resourceProvider;
        this.dispatcherProvider = dispatcherProvider;
    }

    @Override // com.ifriend.presentation.features.chat.configuration.ChatConfigurationDelegate
    public void initChatConfiguration(ChatViewModel context_receiver_0) {
        Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
        ChatViewModel chatViewModel = context_receiver_0;
        CoroutinesKt.safeLaunch$default(ViewModelKt.getViewModelScope(chatViewModel), new ChatConfigurationDelegateImpl$initChatConfiguration$1(this.exceptionsEmitter), null, new ChatConfigurationDelegateImpl$initChatConfiguration$2(this, context_receiver_0, null), 2, null);
        CoroutinesKt.safeLaunch$default(ViewModelKt.getViewModelScope(chatViewModel), new ChatConfigurationDelegateImpl$initChatConfiguration$3(this.exceptionsEmitter), null, new ChatConfigurationDelegateImpl$initChatConfiguration$4(this, context_receiver_0, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getSubscriptionStatusLabel(ChatSubscriptionState chatSubscriptionState) {
        if (Intrinsics.areEqual(chatSubscriptionState, ChatSubscriptionState.SubscriptionUnactivated.INSTANCE)) {
            return getString(R.string.chat_subscription__unactivated);
        }
        if (Intrinsics.areEqual(chatSubscriptionState, ChatSubscriptionState.TrialPeriodFinished.INSTANCE) ? true : Intrinsics.areEqual(chatSubscriptionState, ChatSubscriptionState.SubscriptionActivated.INSTANCE) ? true : Intrinsics.areEqual(chatSubscriptionState, ChatSubscriptionState.Empty.INSTANCE) ? true : Intrinsics.areEqual(chatSubscriptionState, ChatSubscriptionState.TrialPeriod.INSTANCE)) {
            return "";
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isShowSubscriptionState(ChatSubscriptionState chatSubscriptionState) {
        if (Intrinsics.areEqual(chatSubscriptionState, ChatSubscriptionState.SubscriptionUnactivated.INSTANCE)) {
            return true;
        }
        if (Intrinsics.areEqual(chatSubscriptionState, ChatSubscriptionState.TrialPeriodFinished.INSTANCE) ? true : Intrinsics.areEqual(chatSubscriptionState, ChatSubscriptionState.SubscriptionActivated.INSTANCE) ? true : Intrinsics.areEqual(chatSubscriptionState, ChatSubscriptionState.TrialPeriod.INSTANCE) ? true : Intrinsics.areEqual(chatSubscriptionState, ChatSubscriptionState.Empty.INSTANCE)) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }
}
