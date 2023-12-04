package com.ifriend.chat.new_chat.list.delegate;

import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.ifriend.analytics.usecase.audioAi.AnalyticsAudioAiClickConvertToTextMessageUseCase;
import com.ifriend.base.navigation.api.RouterProvider;
import com.ifriend.chat.new_chat.list.ui.model.AudioMessageUiModel;
import com.ifriend.domain.CoroutineDispatchers;
import com.ifriend.domain.logic.chat.ChatClientInteractor;
import com.ifriend.presentation.temp.ChangeVoiceScreenFactory;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
/* compiled from: OnAudioMessageClickDelegate.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ!\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0013J\u0011\u0010\u0014\u001a\u00020\u000eH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0015J!\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0013R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Lcom/ifriend/chat/new_chat/list/delegate/OnAudioMessageClickDelegate;", "", "dispatchers", "Lcom/ifriend/domain/CoroutineDispatchers;", "screenFactory", "Lcom/ifriend/presentation/temp/ChangeVoiceScreenFactory;", "router", "Lcom/ifriend/base/navigation/api/RouterProvider;", "audioClickConvertToTextMessage", "Lcom/ifriend/analytics/usecase/audioAi/AnalyticsAudioAiClickConvertToTextMessageUseCase;", "chatClientInteractor", "Lcom/ifriend/domain/logic/chat/ChatClientInteractor;", "(Lcom/ifriend/domain/CoroutineDispatchers;Lcom/ifriend/presentation/temp/ChangeVoiceScreenFactory;Lcom/ifriend/base/navigation/api/RouterProvider;Lcom/ifriend/analytics/usecase/audioAi/AnalyticsAudioAiClickConvertToTextMessageUseCase;Lcom/ifriend/domain/logic/chat/ChatClientInteractor;)V", "onAudioPlayButtonClick", "", DeviceRequestsHelper.DEVICE_INFO_MODEL, "Lcom/ifriend/chat/new_chat/list/ui/model/AudioMessageUiModel;", "chatId", "", "(Lcom/ifriend/chat/new_chat/list/ui/model/AudioMessageUiModel;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onChangeVoiceClick", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onDecodeAudioMessageClick", "new_chat_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OnAudioMessageClickDelegate {
    public static final int $stable = 8;
    private final AnalyticsAudioAiClickConvertToTextMessageUseCase audioClickConvertToTextMessage;
    private final ChatClientInteractor chatClientInteractor;
    private final CoroutineDispatchers dispatchers;
    private final RouterProvider router;
    private final ChangeVoiceScreenFactory screenFactory;

    @Inject
    public OnAudioMessageClickDelegate(CoroutineDispatchers dispatchers, ChangeVoiceScreenFactory screenFactory, RouterProvider router, AnalyticsAudioAiClickConvertToTextMessageUseCase audioClickConvertToTextMessage, ChatClientInteractor chatClientInteractor) {
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        Intrinsics.checkNotNullParameter(screenFactory, "screenFactory");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(audioClickConvertToTextMessage, "audioClickConvertToTextMessage");
        Intrinsics.checkNotNullParameter(chatClientInteractor, "chatClientInteractor");
        this.dispatchers = dispatchers;
        this.screenFactory = screenFactory;
        this.router = router;
        this.audioClickConvertToTextMessage = audioClickConvertToTextMessage;
        this.chatClientInteractor = chatClientInteractor;
    }

    public final Object onChangeVoiceClick(Continuation<? super Unit> continuation) {
        Object withContext = BuildersKt.withContext(this.dispatchers.getIO(), new OnAudioMessageClickDelegate$onChangeVoiceClick$2(this, null), continuation);
        return withContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : Unit.INSTANCE;
    }

    public final Object onDecodeAudioMessageClick(AudioMessageUiModel audioMessageUiModel, String str, Continuation<? super Unit> continuation) {
        Object withContext = BuildersKt.withContext(this.dispatchers.getIO(), new OnAudioMessageClickDelegate$onDecodeAudioMessageClick$2(audioMessageUiModel, this, str, null), continuation);
        return withContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : Unit.INSTANCE;
    }

    public final Object onAudioPlayButtonClick(AudioMessageUiModel audioMessageUiModel, String str, Continuation<? super Unit> continuation) {
        Object withContext = BuildersKt.withContext(this.dispatchers.getIO(), new OnAudioMessageClickDelegate$onAudioPlayButtonClick$2(audioMessageUiModel, this, str, null), continuation);
        return withContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : Unit.INSTANCE;
    }
}
