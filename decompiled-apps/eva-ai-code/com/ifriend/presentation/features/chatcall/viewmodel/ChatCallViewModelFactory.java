package com.ifriend.presentation.features.chatcall.viewmodel;

import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.facebook.bolts.AppLinks;
import com.ifriend.analytics.api.logic.AnalyticsInteractor;
import com.ifriend.core.tools.api.DispatcherProvider;
import com.ifriend.domain.logic.calls.ChatCallsInteractor;
import com.ifriend.domain.logic.chat.avatart.GeneratedChatAvatarInteractor;
import com.ifriend.domain.logic.chat.events.ChatEventsInteractor;
import com.ifriend.domain.logic.chat.info.ChatsInfoInteractor;
import com.ifriend.platform.tools.api.ResourceProvider;
import com.ifriend.platform.tools.api.permissions.PermissionProvider;
import com.ifriend.platform.tools.api.speech.TextToSpeechStream;
import com.ifriend.platform.tools.api.speech.voice.VoiceRecognitionStreaming;
import com.ifriend.presentation.common.observers.FlowObserverEmitter;
import com.ifriend.presentation.features.chatcall.analytics.ChatCallAnalytics;
import dagger.assisted.Assisted;
import dagger.assisted.AssistedFactory;
import dagger.assisted.AssistedInject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ChatCallViewModelFactory.kt */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001(B\u0080\u0001\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0015\u0010\n\u001a\u0011\u0012\t\u0012\u00070\f¢\u0006\u0002\b\r0\u000bj\u0002`\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\u0006\u0010\u0019\u001a\u00020\u001a\u0012\u0006\u0010\u001b\u001a\u00020\u001c\u0012\u0006\u0010\u001d\u001a\u00020\u001e¢\u0006\u0002\u0010\u001fJ-\u0010 \u001a\u0002H!\"\b\b\u0000\u0010!*\u00020\"2\f\u0010#\u001a\b\u0012\u0004\u0012\u0002H!0$2\u0006\u0010%\u001a\u00020&H\u0016¢\u0006\u0002\u0010'R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\n\u001a\u0011\u0012\t\u0012\u00070\f¢\u0006\u0002\b\r0\u000bj\u0002`\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lcom/ifriend/presentation/features/chatcall/viewmodel/ChatCallViewModelFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "chatId", "", "chatsInfoInteractor", "Lcom/ifriend/domain/logic/chat/info/ChatsInfoInteractor;", "resourceProvider", "Lcom/ifriend/platform/tools/api/ResourceProvider;", "chatCallsInteractor", "Lcom/ifriend/domain/logic/calls/ChatCallsInteractor;", "exceptionsEmitter", "Lcom/ifriend/presentation/common/observers/FlowObserverEmitter;", "", "Lkotlin/jvm/JvmSuppressWildcards;", "Lcom/ifriend/presentation/common/observers/exceptions/ExceptionsEmitter;", "dispatcherProvider", "Lcom/ifriend/core/tools/api/DispatcherProvider;", "textToSpeechStream", "Lcom/ifriend/platform/tools/api/speech/TextToSpeechStream;", "voiceRecognitionStreaming", "Lcom/ifriend/platform/tools/api/speech/voice/VoiceRecognitionStreaming;", "chatEventsInteractor", "Lcom/ifriend/domain/logic/chat/events/ChatEventsInteractor;", "permissionProvider", "Lcom/ifriend/platform/tools/api/permissions/PermissionProvider;", "chatCallAnalytics", "Lcom/ifriend/presentation/features/chatcall/analytics/ChatCallAnalytics;", "analyticsInteractor", "Lcom/ifriend/analytics/api/logic/AnalyticsInteractor;", "generatedChatAvatarInteractor", "Lcom/ifriend/domain/logic/chat/avatart/GeneratedChatAvatarInteractor;", "(Ljava/lang/String;Lcom/ifriend/domain/logic/chat/info/ChatsInfoInteractor;Lcom/ifriend/platform/tools/api/ResourceProvider;Lcom/ifriend/domain/logic/calls/ChatCallsInteractor;Lcom/ifriend/presentation/common/observers/FlowObserverEmitter;Lcom/ifriend/core/tools/api/DispatcherProvider;Lcom/ifriend/platform/tools/api/speech/TextToSpeechStream;Lcom/ifriend/platform/tools/api/speech/voice/VoiceRecognitionStreaming;Lcom/ifriend/domain/logic/chat/events/ChatEventsInteractor;Lcom/ifriend/platform/tools/api/permissions/PermissionProvider;Lcom/ifriend/presentation/features/chatcall/analytics/ChatCallAnalytics;Lcom/ifriend/analytics/api/logic/AnalyticsInteractor;Lcom/ifriend/domain/logic/chat/avatart/GeneratedChatAvatarInteractor;)V", "create", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", AppLinks.KEY_NAME_EXTRAS, "Landroidx/lifecycle/viewmodel/CreationExtras;", "(Ljava/lang/Class;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/ViewModel;", "Factory", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatCallViewModelFactory implements ViewModelProvider.Factory {
    public static final int $stable = 8;
    private final AnalyticsInteractor analyticsInteractor;
    private final ChatCallAnalytics chatCallAnalytics;
    private final ChatCallsInteractor chatCallsInteractor;
    private final ChatEventsInteractor chatEventsInteractor;
    private final String chatId;
    private final ChatsInfoInteractor chatsInfoInteractor;
    private final DispatcherProvider dispatcherProvider;
    private final FlowObserverEmitter<Throwable> exceptionsEmitter;
    private final GeneratedChatAvatarInteractor generatedChatAvatarInteractor;
    private final PermissionProvider permissionProvider;
    private final ResourceProvider resourceProvider;
    private final TextToSpeechStream textToSpeechStream;
    private final VoiceRecognitionStreaming voiceRecognitionStreaming;

    /* compiled from: ChatCallViewModelFactory.kt */
    @AssistedFactory
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ifriend/presentation/features/chatcall/viewmodel/ChatCallViewModelFactory$Factory;", "", "create", "Lcom/ifriend/presentation/features/chatcall/viewmodel/ChatCallViewModelFactory;", "chatId", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public interface Factory {
        ChatCallViewModelFactory create(String str);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public /* synthetic */ ViewModel create(Class cls) {
        return ViewModelProvider.Factory.CC.$default$create(this, cls);
    }

    @AssistedInject
    public ChatCallViewModelFactory(@Assisted String chatId, ChatsInfoInteractor chatsInfoInteractor, ResourceProvider resourceProvider, ChatCallsInteractor chatCallsInteractor, FlowObserverEmitter<Throwable> exceptionsEmitter, DispatcherProvider dispatcherProvider, TextToSpeechStream textToSpeechStream, VoiceRecognitionStreaming voiceRecognitionStreaming, ChatEventsInteractor chatEventsInteractor, PermissionProvider permissionProvider, ChatCallAnalytics chatCallAnalytics, AnalyticsInteractor analyticsInteractor, GeneratedChatAvatarInteractor generatedChatAvatarInteractor) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(chatsInfoInteractor, "chatsInfoInteractor");
        Intrinsics.checkNotNullParameter(resourceProvider, "resourceProvider");
        Intrinsics.checkNotNullParameter(chatCallsInteractor, "chatCallsInteractor");
        Intrinsics.checkNotNullParameter(exceptionsEmitter, "exceptionsEmitter");
        Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
        Intrinsics.checkNotNullParameter(textToSpeechStream, "textToSpeechStream");
        Intrinsics.checkNotNullParameter(voiceRecognitionStreaming, "voiceRecognitionStreaming");
        Intrinsics.checkNotNullParameter(chatEventsInteractor, "chatEventsInteractor");
        Intrinsics.checkNotNullParameter(permissionProvider, "permissionProvider");
        Intrinsics.checkNotNullParameter(chatCallAnalytics, "chatCallAnalytics");
        Intrinsics.checkNotNullParameter(analyticsInteractor, "analyticsInteractor");
        Intrinsics.checkNotNullParameter(generatedChatAvatarInteractor, "generatedChatAvatarInteractor");
        this.chatId = chatId;
        this.chatsInfoInteractor = chatsInfoInteractor;
        this.resourceProvider = resourceProvider;
        this.chatCallsInteractor = chatCallsInteractor;
        this.exceptionsEmitter = exceptionsEmitter;
        this.dispatcherProvider = dispatcherProvider;
        this.textToSpeechStream = textToSpeechStream;
        this.voiceRecognitionStreaming = voiceRecognitionStreaming;
        this.chatEventsInteractor = chatEventsInteractor;
        this.permissionProvider = permissionProvider;
        this.chatCallAnalytics = chatCallAnalytics;
        this.analyticsInteractor = analyticsInteractor;
        this.generatedChatAvatarInteractor = generatedChatAvatarInteractor;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public <T extends ViewModel> T create(Class<T> modelClass, CreationExtras extras) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        if (modelClass.isAssignableFrom(ChatCallViewModel.class)) {
            String str = this.chatId;
            ChatsInfoInteractor chatsInfoInteractor = this.chatsInfoInteractor;
            ResourceProvider resourceProvider = this.resourceProvider;
            ChatCallsInteractor chatCallsInteractor = this.chatCallsInteractor;
            FlowObserverEmitter<Throwable> flowObserverEmitter = this.exceptionsEmitter;
            DispatcherProvider dispatcherProvider = this.dispatcherProvider;
            TextToSpeechStream textToSpeechStream = this.textToSpeechStream;
            return new ChatCallViewModel(resourceProvider, this.chatEventsInteractor, str, chatCallsInteractor, flowObserverEmitter, dispatcherProvider, this.voiceRecognitionStreaming, textToSpeechStream, chatsInfoInteractor, this.permissionProvider, this.chatCallAnalytics, this.analyticsInteractor, this.generatedChatAvatarInteractor);
        }
        String simpleName = getClass().getSimpleName();
        throw new IllegalArgumentException("Unknown ViewModel class=" + simpleName);
    }
}
