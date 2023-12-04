package com.ifriend.presentation.features.chatcall.viewmodel;

import android.content.res.ColorStateList;
import android.graphics.Typeface;
import androidx.core.app.NotificationCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.facebook.internal.NativeProtocol;
import com.facebook.share.internal.ShareConstants;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.ifriend.analytics.api.logic.AnalyticsInteractor;
import com.ifriend.chat.new_chat.list.player.AudioPlayerState$Pause$$ExternalSyntheticBackport0;
import com.ifriend.core.tools.api.DispatcherProvider;
import com.ifriend.core.utils.CoroutinesKt;
import com.ifriend.domain.logic.calls.ChatCallsInteractor;
import com.ifriend.domain.logic.chat.avatart.GeneratedChatAvatar;
import com.ifriend.domain.logic.chat.avatart.GeneratedChatAvatarInteractor;
import com.ifriend.domain.logic.chat.events.ChatEventsInteractor;
import com.ifriend.domain.logic.chat.info.ChatsInfoInteractor;
import com.ifriend.domain.logic.chat.models.ChatInfo;
import com.ifriend.domain.socket.MessagesSourceMessage;
import com.ifriend.platform.tools.api.ResourceProvider;
import com.ifriend.platform.tools.api.permissions.PermissionProvider;
import com.ifriend.platform.tools.api.speech.TextToSpeechStream;
import com.ifriend.platform.tools.api.speech.voice.StreamingRecognize;
import com.ifriend.platform.tools.api.speech.voice.VoiceRecognitionStreaming;
import com.ifriend.presentation.common.observers.FlowObserverEmitter;
import com.ifriend.presentation.common.uistate.UiStateDelegate;
import com.ifriend.presentation.common.uistate.UiStateDelegateImpl;
import com.ifriend.presentation.features.chatcall.analytics.ChatCallAnalytics;
import com.ifriend.presentation.features.chatcall.viewmodel.ChatCallViewModel;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
/* compiled from: ChatCallViewModel.kt */
@Metadata(d1 = {"\u0000ð\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004:\u0004\u0084\u0001\u0085\u0001B|\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0015\u0010\u000e\u001a\u0011\u0012\t\u0012\u00070\u0010¢\u0006\u0002\b\u00110\u000fj\u0002`\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\u0006\u0010\u0019\u001a\u00020\u001a\u0012\u0006\u0010\u001b\u001a\u00020\u001c\u0012\u0006\u0010\u001d\u001a\u00020\u001e\u0012\u0006\u0010\u001f\u001a\u00020 \u0012\u0006\u0010!\u001a\u00020\"¢\u0006\u0002\u0010#J\u0019\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020CH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010DJ\b\u0010E\u001a\u00020AH\u0002J#\u0010F\u001a\u00020A2\u0006\u0010B\u001a\u00020C2\b\b\u0002\u0010G\u001a\u00020HH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010IJ\u0013\u0010J\u001a\u00020H2\b\b\u0001\u0010K\u001a\u00020LH\u0096\u0001J\u0013\u0010M\u001a\u00020N2\b\b\u0001\u0010O\u001a\u00020LH\u0096\u0001J\u0013\u0010P\u001a\u00020L2\b\b\u0001\u0010Q\u001a\u00020LH\u0097\u0001J\u0015\u0010R\u001a\u0004\u0018\u00010S2\b\b\u0001\u0010K\u001a\u00020LH\u0096\u0001J\u0013\u0010T\u001a\u00020L2\b\b\u0001\u0010K\u001a\u00020LH\u0096\u0001J\u0019\u0010U\u001a\b\u0012\u0004\u0012\u00020L0V2\b\b\u0001\u0010K\u001a\u00020LH\u0096\u0001J\u001b\u0010W\u001a\u00020\u000b2\b\b\u0001\u0010X\u001a\u00020L2\u0006\u0010Y\u001a\u00020LH\u0096\u0001J4\u0010W\u001a\u00020\u000b2\b\b\u0001\u0010X\u001a\u00020L2\u0006\u0010Y\u001a\u00020L2\u0012\u0010Z\u001a\n\u0012\u0006\b\u0001\u0012\u00020\\0[\"\u00020\\H\u0096\u0001¢\u0006\u0002\u0010]J\u0013\u0010^\u001a\u00020\u000b2\b\b\u0001\u0010X\u001a\u00020LH\u0096\u0001J,\u0010^\u001a\u00020\u000b2\b\b\u0001\u0010X\u001a\u00020L2\u0012\u0010Z\u001a\n\u0012\u0006\b\u0001\u0012\u00020\\0[\"\u00020\\H\u0096\u0001¢\u0006\u0002\u0010_J\u0019\u0010`\u001a\b\u0012\u0004\u0012\u00020\u000b0V2\b\b\u0001\u0010X\u001a\u00020LH\u0096\u0001J\b\u0010a\u001a\u00020AH\u0002J\b\u0010b\u001a\u00020AH\u0003J\u0011\u0010c\u001a\u00020AH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010dJ\u000e\u0010e\u001a\u00020A2\u0006\u0010f\u001a\u00020HJ\u0006\u0010g\u001a\u00020AJ\u0006\u0010h\u001a\u00020AJ\u0006\u0010i\u001a\u00020AJ\u0010\u0010j\u001a\u00020A2\u0006\u0010k\u001a\u00020lH\u0016J\u0019\u0010m\u001a\u00020A2\u0006\u0010B\u001a\u00020CH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010DJ\u001c\u0010n\u001a\u00020A2\u0006\u0010o\u001a\u00020\u000b2\n\b\u0002\u0010p\u001a\u0004\u0018\u00010\u000bH\u0002J\b\u0010q\u001a\u00020AH\u0002J\b\u0010r\u001a\u00020AH\u0002J\b\u0010s\u001a\u00020AH\u0002J0\u0010t\u001a\u00020A*\u00020u2!\u0010v\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\bx\u0012\b\by\u0012\u0004\b\b(z\u0012\u0004\u0012\u00020\u00050wH\u0097\u0001JD\u0010{\u001a\u000205*\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010|\u001a\u00020u2!\u0010}\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\bx\u0012\b\by\u0012\u0004\b\b(z\u0012\u0004\u0012\u00020\u00050wH\u0096\u0001JD\u0010~\u001a\u00020A*\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042!\u0010v\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\bx\u0012\b\by\u0012\u0004\b\b(z\u0012\u0004\u0012\u00020\u00050wH\u0097Aø\u0001\u0000¢\u0006\u0002\u0010\u007fJ,\u0010\u0080\u0001\u001a\u00020A*\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0007\u0010\u0081\u0001\u001a\u00020\u0006H\u0096Aø\u0001\u0000¢\u0006\u0003\u0010\u0082\u0001JE\u0010\u0083\u0001\u001a\u00020A*\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042!\u0010}\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\bx\u0012\b\by\u0012\u0004\b\b(=\u0012\u0004\u0012\u00020\u00050wH\u0096Aø\u0001\u0000¢\u0006\u0002\u0010\u007fR\u000e\u0010\u001f\u001a\u00020 X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u000e\u001a\u0011\u0012\t\u0012\u00070\u0010¢\u0006\u0002\b\u00110\u000fj\u0002`\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010$\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b%\u0010&R\u001b\u0010)\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010(\u001a\u0004\b*\u0010&R\u000e\u0010!\u001a\u00020\"X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0-X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010.\u001a\u00020\u000bX\u0096\u0005¢\u0006\u0006\u001a\u0004\b/\u0010&R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u00100\u001a\b\u0012\u0004\u0012\u00020\u000601X\u0096\u0005¢\u0006\u0006\u001a\u0004\b2\u00103R\u0010\u00104\u001a\u0004\u0018\u000105X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00106\u001a\u0004\u0018\u000105X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00107\u001a\u0004\u0018\u000105X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u00108\u001a\u0004\u0018\u000105X\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u00109\u001a\b\u0012\u0004\u0012\u00020\u00050:X\u0096\u0005¢\u0006\u0006\u001a\u0004\b;\u0010<R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010=\u001a\u00020\u0005*\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0096\u0005¢\u0006\u0006\u001a\u0004\b>\u0010?\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0086\u0001"}, d2 = {"Lcom/ifriend/presentation/features/chatcall/viewmodel/ChatCallViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/ifriend/platform/tools/api/ResourceProvider;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Lcom/ifriend/presentation/common/uistate/UiStateDelegate;", "Lcom/ifriend/presentation/features/chatcall/viewmodel/ChatCallViewModel$UiState;", "Lcom/ifriend/presentation/features/chatcall/viewmodel/ChatCallViewModel$Event;", "resourceProvider", "chatEventsInteractor", "Lcom/ifriend/domain/logic/chat/events/ChatEventsInteractor;", "chatId", "", "chatCallsInteractor", "Lcom/ifriend/domain/logic/calls/ChatCallsInteractor;", "exceptionsEmitter", "Lcom/ifriend/presentation/common/observers/FlowObserverEmitter;", "", "Lkotlin/jvm/JvmSuppressWildcards;", "Lcom/ifriend/presentation/common/observers/exceptions/ExceptionsEmitter;", "dispatcherProvider", "Lcom/ifriend/core/tools/api/DispatcherProvider;", "voiceRecognitionStreaming", "Lcom/ifriend/platform/tools/api/speech/voice/VoiceRecognitionStreaming;", "textToSpeechStream", "Lcom/ifriend/platform/tools/api/speech/TextToSpeechStream;", "chatsInfoInteractor", "Lcom/ifriend/domain/logic/chat/info/ChatsInfoInteractor;", "permissionProvider", "Lcom/ifriend/platform/tools/api/permissions/PermissionProvider;", "chatCallAnalytics", "Lcom/ifriend/presentation/features/chatcall/analytics/ChatCallAnalytics;", "analyticsInteractor", "Lcom/ifriend/analytics/api/logic/AnalyticsInteractor;", "generatedChatAvatarInteractor", "Lcom/ifriend/domain/logic/chat/avatart/GeneratedChatAvatarInteractor;", "(Lcom/ifriend/platform/tools/api/ResourceProvider;Lcom/ifriend/domain/logic/chat/events/ChatEventsInteractor;Ljava/lang/String;Lcom/ifriend/domain/logic/calls/ChatCallsInteractor;Lcom/ifriend/presentation/common/observers/FlowObserverEmitter;Lcom/ifriend/core/tools/api/DispatcherProvider;Lcom/ifriend/platform/tools/api/speech/voice/VoiceRecognitionStreaming;Lcom/ifriend/platform/tools/api/speech/TextToSpeechStream;Lcom/ifriend/domain/logic/chat/info/ChatsInfoInteractor;Lcom/ifriend/platform/tools/api/permissions/PermissionProvider;Lcom/ifriend/presentation/features/chatcall/analytics/ChatCallAnalytics;Lcom/ifriend/analytics/api/logic/AnalyticsInteractor;Lcom/ifriend/domain/logic/chat/avatart/GeneratedChatAvatarInteractor;)V", "finishMessageId", "getFinishMessageId", "()Ljava/lang/String;", "finishMessageId$delegate", "Lkotlin/Lazy;", "firstMessageId", "getFirstMessageId", "firstMessageId$delegate", "messages", "", RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, "getPackageName", "singleEvents", "Lkotlinx/coroutines/flow/Flow;", "getSingleEvents", "()Lkotlinx/coroutines/flow/Flow;", "speechRecognizerJob", "Lkotlinx/coroutines/Job;", "startCallingJob", "streamingRecognizeFlowJob", "textToSpeechStreamJob", "uiStateFlow", "Lkotlinx/coroutines/flow/StateFlow;", "getUiStateFlow", "()Lkotlinx/coroutines/flow/StateFlow;", "uiState", "getUiState", "(Lcom/ifriend/presentation/common/uistate/UiStateDelegate;)Lcom/ifriend/presentation/features/chatcall/viewmodel/ChatCallViewModel$UiState;", "finishCall", "", "reason", "Lcom/ifriend/presentation/features/chatcall/viewmodel/FinishCallReason;", "(Lcom/ifriend/presentation/features/chatcall/viewmodel/FinishCallReason;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "finishCallAfterInactivityTime", "finishCallAndCloseFeature", "isTrackEvent", "", "(Lcom/ifriend/presentation/features/chatcall/viewmodel/FinishCallReason;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getBoolean", "resId", "", "getColorStateList", "Landroid/content/res/ColorStateList;", "colorResId", "getDimensionPixelSize", "dimenRes", "getFont", "Landroid/graphics/Typeface;", "getInteger", "getIntegerArray", "", "getQuantityString", "res", FirebaseAnalytics.Param.QUANTITY, "args", "", "", "(II[Ljava/lang/Object;)Ljava/lang/String;", "getString", "(I[Ljava/lang/Object;)Ljava/lang/String;", "getStringArray", "initCall", "initMessageFlow", "lastMessagePlayed", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onAudioPermissionGranted", "isGranted", "onCancelMessageInfoPopupClick", "onEndCallClick", "onMessageInfoPopupClick", "onPause", "owner", "Landroidx/lifecycle/LifecycleOwner;", "sendFinishCallEvent", "speakMessage", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "messageId", "startCalling", "startTimer", "stopJobs", "asyncReduce", "Lkotlinx/coroutines/CoroutineScope;", NativeProtocol.WEB_DIALOG_ACTION, "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "state", "asyncUpdateUiState", "coroutineScope", "transform", "reduce", "(Lcom/ifriend/presentation/common/uistate/UiStateDelegate;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendEvent", NotificationCompat.CATEGORY_EVENT, "(Lcom/ifriend/presentation/common/uistate/UiStateDelegate;Lcom/ifriend/presentation/features/chatcall/viewmodel/ChatCallViewModel$Event;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateUiState", "Event", "UiState", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatCallViewModel extends ViewModel implements ResourceProvider, DefaultLifecycleObserver, UiStateDelegate<UiState, Event> {
    public static final int $stable = 8;
    private final /* synthetic */ ResourceProvider $$delegate_0;
    private final /* synthetic */ UiStateDelegateImpl<UiState, Event> $$delegate_1;
    private final AnalyticsInteractor analyticsInteractor;
    private final ChatCallAnalytics chatCallAnalytics;
    private final ChatCallsInteractor chatCallsInteractor;
    private final ChatEventsInteractor chatEventsInteractor;
    private final String chatId;
    private final ChatsInfoInteractor chatsInfoInteractor;
    private final DispatcherProvider dispatcherProvider;
    private final FlowObserverEmitter<Throwable> exceptionsEmitter;
    private final Lazy finishMessageId$delegate;
    private final Lazy firstMessageId$delegate;
    private final GeneratedChatAvatarInteractor generatedChatAvatarInteractor;
    private final Map<String, String> messages;
    private final PermissionProvider permissionProvider;
    private Job speechRecognizerJob;
    private Job startCallingJob;
    private Job streamingRecognizeFlowJob;
    private final TextToSpeechStream textToSpeechStream;
    private Job textToSpeechStreamJob;
    private final VoiceRecognitionStreaming voiceRecognitionStreaming;

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

    @Override // com.ifriend.platform.tools.api.ResourceProvider
    public boolean getBoolean(int i) {
        return this.$$delegate_0.getBoolean(i);
    }

    @Override // com.ifriend.platform.tools.api.ResourceProvider
    public ColorStateList getColorStateList(int i) {
        return this.$$delegate_0.getColorStateList(i);
    }

    @Override // com.ifriend.platform.tools.api.ResourceProvider
    public int getDimensionPixelSize(int i) {
        return this.$$delegate_0.getDimensionPixelSize(i);
    }

    @Override // com.ifriend.platform.tools.api.ResourceProvider
    public Typeface getFont(int i) {
        return this.$$delegate_0.getFont(i);
    }

    @Override // com.ifriend.platform.tools.api.ResourceProvider
    public int getInteger(int i) {
        return this.$$delegate_0.getInteger(i);
    }

    @Override // com.ifriend.platform.tools.api.ResourceProvider
    public List<Integer> getIntegerArray(int i) {
        return this.$$delegate_0.getIntegerArray(i);
    }

    @Override // com.ifriend.platform.tools.api.ResourceProvider
    public String getPackageName() {
        return this.$$delegate_0.getPackageName();
    }

    @Override // com.ifriend.platform.tools.api.ResourceProvider
    public String getQuantityString(int i, int i2) {
        return this.$$delegate_0.getQuantityString(i, i2);
    }

    @Override // com.ifriend.platform.tools.api.ResourceProvider
    public String getQuantityString(int i, int i2, Object... args) {
        Intrinsics.checkNotNullParameter(args, "args");
        return this.$$delegate_0.getQuantityString(i, i2, args);
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    public Flow<Event> getSingleEvents() {
        return this.$$delegate_1.getSingleEvents();
    }

    @Override // com.ifriend.platform.tools.api.ResourceProvider
    public String getString(int i) {
        return this.$$delegate_0.getString(i);
    }

    @Override // com.ifriend.platform.tools.api.ResourceProvider
    public String getString(int i, Object... args) {
        Intrinsics.checkNotNullParameter(args, "args");
        return this.$$delegate_0.getString(i, args);
    }

    @Override // com.ifriend.platform.tools.api.ResourceProvider
    public List<String> getStringArray(int i) {
        return this.$$delegate_0.getStringArray(i);
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

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "owner");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onDestroy(LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "owner");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
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

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    @Deprecated(message = "use method UiStateDelegate<UiState, Event>.updateUiState")
    public Object reduce(UiStateDelegate<UiState, Event> uiStateDelegate, Function1<? super UiState, ? extends UiState> function1, Continuation<? super Unit> continuation) {
        return this.$$delegate_1.reduce(uiStateDelegate, function1, continuation);
    }

    /* renamed from: sendEvent  reason: avoid collision after fix types in other method */
    public Object sendEvent2(UiStateDelegate<UiState, Event> uiStateDelegate, Event event, Continuation<? super Unit> continuation) {
        return this.$$delegate_1.sendEvent(uiStateDelegate, event, continuation);
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    public Object updateUiState(UiStateDelegate<UiState, Event> uiStateDelegate, Function1<? super UiState, ? extends UiState> function1, Continuation<? super Unit> continuation) {
        return this.$$delegate_1.updateUiState(uiStateDelegate, function1, continuation);
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    public /* bridge */ /* synthetic */ Object sendEvent(UiStateDelegate<UiState, Event> uiStateDelegate, Event event, Continuation continuation) {
        return sendEvent2(uiStateDelegate, event, (Continuation<? super Unit>) continuation);
    }

    public ChatCallViewModel(ResourceProvider resourceProvider, ChatEventsInteractor chatEventsInteractor, String chatId, ChatCallsInteractor chatCallsInteractor, FlowObserverEmitter<Throwable> exceptionsEmitter, DispatcherProvider dispatcherProvider, VoiceRecognitionStreaming voiceRecognitionStreaming, TextToSpeechStream textToSpeechStream, ChatsInfoInteractor chatsInfoInteractor, PermissionProvider permissionProvider, ChatCallAnalytics chatCallAnalytics, AnalyticsInteractor analyticsInteractor, GeneratedChatAvatarInteractor generatedChatAvatarInteractor) {
        Intrinsics.checkNotNullParameter(resourceProvider, "resourceProvider");
        Intrinsics.checkNotNullParameter(chatEventsInteractor, "chatEventsInteractor");
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(chatCallsInteractor, "chatCallsInteractor");
        Intrinsics.checkNotNullParameter(exceptionsEmitter, "exceptionsEmitter");
        Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
        Intrinsics.checkNotNullParameter(voiceRecognitionStreaming, "voiceRecognitionStreaming");
        Intrinsics.checkNotNullParameter(textToSpeechStream, "textToSpeechStream");
        Intrinsics.checkNotNullParameter(chatsInfoInteractor, "chatsInfoInteractor");
        Intrinsics.checkNotNullParameter(permissionProvider, "permissionProvider");
        Intrinsics.checkNotNullParameter(chatCallAnalytics, "chatCallAnalytics");
        Intrinsics.checkNotNullParameter(analyticsInteractor, "analyticsInteractor");
        Intrinsics.checkNotNullParameter(generatedChatAvatarInteractor, "generatedChatAvatarInteractor");
        this.chatEventsInteractor = chatEventsInteractor;
        this.chatId = chatId;
        this.chatCallsInteractor = chatCallsInteractor;
        this.exceptionsEmitter = exceptionsEmitter;
        this.dispatcherProvider = dispatcherProvider;
        this.voiceRecognitionStreaming = voiceRecognitionStreaming;
        this.textToSpeechStream = textToSpeechStream;
        this.chatsInfoInteractor = chatsInfoInteractor;
        this.permissionProvider = permissionProvider;
        this.chatCallAnalytics = chatCallAnalytics;
        this.analyticsInteractor = analyticsInteractor;
        this.generatedChatAvatarInteractor = generatedChatAvatarInteractor;
        this.$$delegate_0 = resourceProvider;
        this.$$delegate_1 = new UiStateDelegateImpl<>(new UiState(null, false, null, false, null, null, null, 0L, null, null, null, false, 4095, null), 0, null, 6, null);
        this.finishMessageId$delegate = LazyKt.lazy(ChatCallViewModel$finishMessageId$2.INSTANCE);
        this.firstMessageId$delegate = LazyKt.lazy(ChatCallViewModel$firstMessageId$2.INSTANCE);
        this.messages = new LinkedHashMap();
        ChatCallViewModel chatCallViewModel = this;
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(chatCallViewModel), null, null, new AnonymousClass1(null), 3, null);
        CoroutinesKt.safeLaunch$default(ViewModelKt.getViewModelScope(chatCallViewModel), null, null, new AnonymousClass2(null), 3, null);
    }

    /* compiled from: ChatCallViewModel.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b!\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0081\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0005¢\u0006\u0002\u0010\u0011J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\fHÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\u0085\u0001\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u0005HÆ\u0001J\u0013\u0010+\u001a\u00020\u00052\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020.HÖ\u0001J\t\u0010/\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0011\u0010\u0010\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0018R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0018R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013¨\u00060"}, d2 = {"Lcom/ifriend/presentation/features/chatcall/viewmodel/ChatCallViewModel$UiState;", "", "callId", "", "isLoading", "", "loadingTitle", "isVisibleInfoPopup", "title", "avatarUrl", "durationLabel", "durationCallMillis", "", "lastMessage", "startMessage", "stopMessage", "isCallActive", "(Ljava/lang/String;ZLjava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getAvatarUrl", "()Ljava/lang/String;", "getCallId", "getDurationCallMillis", "()J", "getDurationLabel", "()Z", "getLastMessage", "getLoadingTitle", "getStartMessage", "getStopMessage", "getTitle", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class UiState {
        public static final int $stable = 0;
        private final String avatarUrl;
        private final String callId;
        private final long durationCallMillis;
        private final String durationLabel;
        private final boolean isCallActive;
        private final boolean isLoading;
        private final boolean isVisibleInfoPopup;
        private final String lastMessage;
        private final String loadingTitle;
        private final String startMessage;
        private final String stopMessage;
        private final String title;

        public UiState() {
            this(null, false, null, false, null, null, null, 0L, null, null, null, false, 4095, null);
        }

        public static /* synthetic */ UiState copy$default(UiState uiState, String str, boolean z, String str2, boolean z2, String str3, String str4, String str5, long j, String str6, String str7, String str8, boolean z3, int i, Object obj) {
            return uiState.copy((i & 1) != 0 ? uiState.callId : str, (i & 2) != 0 ? uiState.isLoading : z, (i & 4) != 0 ? uiState.loadingTitle : str2, (i & 8) != 0 ? uiState.isVisibleInfoPopup : z2, (i & 16) != 0 ? uiState.title : str3, (i & 32) != 0 ? uiState.avatarUrl : str4, (i & 64) != 0 ? uiState.durationLabel : str5, (i & 128) != 0 ? uiState.durationCallMillis : j, (i & 256) != 0 ? uiState.lastMessage : str6, (i & 512) != 0 ? uiState.startMessage : str7, (i & 1024) != 0 ? uiState.stopMessage : str8, (i & 2048) != 0 ? uiState.isCallActive : z3);
        }

        public final String component1() {
            return this.callId;
        }

        public final String component10() {
            return this.startMessage;
        }

        public final String component11() {
            return this.stopMessage;
        }

        public final boolean component12() {
            return this.isCallActive;
        }

        public final boolean component2() {
            return this.isLoading;
        }

        public final String component3() {
            return this.loadingTitle;
        }

        public final boolean component4() {
            return this.isVisibleInfoPopup;
        }

        public final String component5() {
            return this.title;
        }

        public final String component6() {
            return this.avatarUrl;
        }

        public final String component7() {
            return this.durationLabel;
        }

        public final long component8() {
            return this.durationCallMillis;
        }

        public final String component9() {
            return this.lastMessage;
        }

        public final UiState copy(String callId, boolean z, String loadingTitle, boolean z2, String title, String avatarUrl, String durationLabel, long j, String lastMessage, String str, String str2, boolean z3) {
            Intrinsics.checkNotNullParameter(callId, "callId");
            Intrinsics.checkNotNullParameter(loadingTitle, "loadingTitle");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(avatarUrl, "avatarUrl");
            Intrinsics.checkNotNullParameter(durationLabel, "durationLabel");
            Intrinsics.checkNotNullParameter(lastMessage, "lastMessage");
            return new UiState(callId, z, loadingTitle, z2, title, avatarUrl, durationLabel, j, lastMessage, str, str2, z3);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof UiState) {
                UiState uiState = (UiState) obj;
                return Intrinsics.areEqual(this.callId, uiState.callId) && this.isLoading == uiState.isLoading && Intrinsics.areEqual(this.loadingTitle, uiState.loadingTitle) && this.isVisibleInfoPopup == uiState.isVisibleInfoPopup && Intrinsics.areEqual(this.title, uiState.title) && Intrinsics.areEqual(this.avatarUrl, uiState.avatarUrl) && Intrinsics.areEqual(this.durationLabel, uiState.durationLabel) && this.durationCallMillis == uiState.durationCallMillis && Intrinsics.areEqual(this.lastMessage, uiState.lastMessage) && Intrinsics.areEqual(this.startMessage, uiState.startMessage) && Intrinsics.areEqual(this.stopMessage, uiState.stopMessage) && this.isCallActive == uiState.isCallActive;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = this.callId.hashCode() * 31;
            boolean z = this.isLoading;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            int hashCode2 = (((hashCode + i) * 31) + this.loadingTitle.hashCode()) * 31;
            boolean z2 = this.isVisibleInfoPopup;
            int i2 = z2;
            if (z2 != 0) {
                i2 = 1;
            }
            int hashCode3 = (((((((((((hashCode2 + i2) * 31) + this.title.hashCode()) * 31) + this.avatarUrl.hashCode()) * 31) + this.durationLabel.hashCode()) * 31) + AudioPlayerState$Pause$$ExternalSyntheticBackport0.m(this.durationCallMillis)) * 31) + this.lastMessage.hashCode()) * 31;
            String str = this.startMessage;
            int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.stopMessage;
            int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31;
            boolean z3 = this.isCallActive;
            return hashCode5 + (z3 ? 1 : z3 ? 1 : 0);
        }

        public String toString() {
            String str = this.callId;
            boolean z = this.isLoading;
            String str2 = this.loadingTitle;
            boolean z2 = this.isVisibleInfoPopup;
            String str3 = this.title;
            String str4 = this.avatarUrl;
            String str5 = this.durationLabel;
            long j = this.durationCallMillis;
            String str6 = this.lastMessage;
            String str7 = this.startMessage;
            String str8 = this.stopMessage;
            boolean z3 = this.isCallActive;
            return "UiState(callId=" + str + ", isLoading=" + z + ", loadingTitle=" + str2 + ", isVisibleInfoPopup=" + z2 + ", title=" + str3 + ", avatarUrl=" + str4 + ", durationLabel=" + str5 + ", durationCallMillis=" + j + ", lastMessage=" + str6 + ", startMessage=" + str7 + ", stopMessage=" + str8 + ", isCallActive=" + z3 + ")";
        }

        public UiState(String callId, boolean z, String loadingTitle, boolean z2, String title, String avatarUrl, String durationLabel, long j, String lastMessage, String str, String str2, boolean z3) {
            Intrinsics.checkNotNullParameter(callId, "callId");
            Intrinsics.checkNotNullParameter(loadingTitle, "loadingTitle");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(avatarUrl, "avatarUrl");
            Intrinsics.checkNotNullParameter(durationLabel, "durationLabel");
            Intrinsics.checkNotNullParameter(lastMessage, "lastMessage");
            this.callId = callId;
            this.isLoading = z;
            this.loadingTitle = loadingTitle;
            this.isVisibleInfoPopup = z2;
            this.title = title;
            this.avatarUrl = avatarUrl;
            this.durationLabel = durationLabel;
            this.durationCallMillis = j;
            this.lastMessage = lastMessage;
            this.startMessage = str;
            this.stopMessage = str2;
            this.isCallActive = z3;
        }

        public /* synthetic */ UiState(String str, boolean z, String str2, boolean z2, String str3, String str4, String str5, long j, String str6, String str7, String str8, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? "" : str3, (i & 32) != 0 ? "" : str4, (i & 64) != 0 ? "" : str5, (i & 128) != 0 ? 0L : j, (i & 256) == 0 ? str6 : "", (i & 512) != 0 ? null : str7, (i & 1024) == 0 ? str8 : null, (i & 2048) == 0 ? z3 : false);
        }

        public final String getCallId() {
            return this.callId;
        }

        public final boolean isLoading() {
            return this.isLoading;
        }

        public final String getLoadingTitle() {
            return this.loadingTitle;
        }

        public final boolean isVisibleInfoPopup() {
            return this.isVisibleInfoPopup;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getAvatarUrl() {
            return this.avatarUrl;
        }

        public final String getDurationLabel() {
            return this.durationLabel;
        }

        public final long getDurationCallMillis() {
            return this.durationCallMillis;
        }

        public final String getLastMessage() {
            return this.lastMessage;
        }

        public final String getStartMessage() {
            return this.startMessage;
        }

        public final String getStopMessage() {
            return this.stopMessage;
        }

        public final boolean isCallActive() {
            return this.isCallActive;
        }
    }

    /* compiled from: ChatCallViewModel.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/ifriend/presentation/features/chatcall/viewmodel/ChatCallViewModel$Event;", "", "CloseFeature", "OpenSettings", "ShowRecordAudioPermission", "Lcom/ifriend/presentation/features/chatcall/viewmodel/ChatCallViewModel$Event$CloseFeature;", "Lcom/ifriend/presentation/features/chatcall/viewmodel/ChatCallViewModel$Event$OpenSettings;", "Lcom/ifriend/presentation/features/chatcall/viewmodel/ChatCallViewModel$Event$ShowRecordAudioPermission;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public interface Event {

        /* compiled from: ChatCallViewModel.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifriend/presentation/features/chatcall/viewmodel/ChatCallViewModel$Event$CloseFeature;", "Lcom/ifriend/presentation/features/chatcall/viewmodel/ChatCallViewModel$Event;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class CloseFeature implements Event {
            public static final int $stable = 0;
            public static final CloseFeature INSTANCE = new CloseFeature();

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof CloseFeature) {
                    CloseFeature closeFeature = (CloseFeature) obj;
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return 88389507;
            }

            public String toString() {
                return "CloseFeature";
            }

            private CloseFeature() {
            }
        }

        /* compiled from: ChatCallViewModel.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifriend/presentation/features/chatcall/viewmodel/ChatCallViewModel$Event$OpenSettings;", "Lcom/ifriend/presentation/features/chatcall/viewmodel/ChatCallViewModel$Event;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class OpenSettings implements Event {
            public static final int $stable = 0;
            public static final OpenSettings INSTANCE = new OpenSettings();

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof OpenSettings) {
                    OpenSettings openSettings = (OpenSettings) obj;
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return 2040661554;
            }

            public String toString() {
                return "OpenSettings";
            }

            private OpenSettings() {
            }
        }

        /* compiled from: ChatCallViewModel.kt */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/ifriend/presentation/features/chatcall/viewmodel/ChatCallViewModel$Event$ShowRecordAudioPermission;", "Lcom/ifriend/presentation/features/chatcall/viewmodel/ChatCallViewModel$Event;", "permission", "", "(Ljava/lang/String;)V", "getPermission", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class ShowRecordAudioPermission implements Event {
            public static final int $stable = 0;
            private final String permission;

            public static /* synthetic */ ShowRecordAudioPermission copy$default(ShowRecordAudioPermission showRecordAudioPermission, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = showRecordAudioPermission.permission;
                }
                return showRecordAudioPermission.copy(str);
            }

            public final String component1() {
                return this.permission;
            }

            public final ShowRecordAudioPermission copy(String permission) {
                Intrinsics.checkNotNullParameter(permission, "permission");
                return new ShowRecordAudioPermission(permission);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ShowRecordAudioPermission) && Intrinsics.areEqual(this.permission, ((ShowRecordAudioPermission) obj).permission);
            }

            public int hashCode() {
                return this.permission.hashCode();
            }

            public String toString() {
                String str = this.permission;
                return "ShowRecordAudioPermission(permission=" + str + ")";
            }

            public ShowRecordAudioPermission(String permission) {
                Intrinsics.checkNotNullParameter(permission, "permission");
                this.permission = permission;
            }

            public final String getPermission() {
                return this.permission;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getFinishMessageId() {
        return (String) this.finishMessageId$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getFirstMessageId() {
        return (String) this.firstMessageId$delegate.getValue();
    }

    /* compiled from: ChatCallViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.ifriend.presentation.features.chatcall.viewmodel.ChatCallViewModel$1", f = "ChatCallViewModel.kt", i = {}, l = {128}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.ifriend.presentation.features.chatcall.viewmodel.ChatCallViewModel$1  reason: invalid class name */
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
                if (ChatCallViewModel.this.permissionProvider.hasPermission("android.permission.RECORD_AUDIO")) {
                    ChatCallViewModel.this.initCall();
                } else {
                    UiStateDelegate<UiState, Event> uiStateDelegate = ChatCallViewModel.this;
                    this.label = 1;
                    if (uiStateDelegate.sendEvent2(uiStateDelegate, (Event) new Event.ShowRecordAudioPermission("android.permission.RECORD_AUDIO"), (Continuation<? super Unit>) this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* compiled from: ChatCallViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.ifriend.presentation.features.chatcall.viewmodel.ChatCallViewModel$2", f = "ChatCallViewModel.kt", i = {}, l = {133}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.ifriend.presentation.features.chatcall.viewmodel.ChatCallViewModel$2  reason: invalid class name */
    /* loaded from: classes6.dex */
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(continuation);
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
                obj = ChatCallViewModel.this.generatedChatAvatarInteractor.getGeneratedChatAvatarFlow(ChatCallViewModel.this.chatId, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                ResultKt.throwOnFailure(obj);
            }
            FlowKt.launchIn(FlowKt.onEach((Flow) obj, new AnonymousClass1(ChatCallViewModel.this, null)), ViewModelKt.getViewModelScope(ChatCallViewModel.this));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ChatCallViewModel.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/ifriend/domain/logic/chat/avatart/GeneratedChatAvatar;", "avatarState", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.ifriend.presentation.features.chatcall.viewmodel.ChatCallViewModel$2$1", f = "ChatCallViewModel.kt", i = {0}, l = {TsExtractor.TS_STREAM_TYPE_E_AC3, 147}, m = "invokeSuspend", n = {"avatarState"}, s = {"L$0"})
        /* renamed from: com.ifriend.presentation.features.chatcall.viewmodel.ChatCallViewModel$2$1  reason: invalid class name */
        /* loaded from: classes6.dex */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<GeneratedChatAvatar, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ ChatCallViewModel this$0;

            /* compiled from: ChatCallViewModel.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.ifriend.presentation.features.chatcall.viewmodel.ChatCallViewModel$2$1$WhenMappings */
            /* loaded from: classes6.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[GeneratedChatAvatar.VideoAvatar.GeneratingState.values().length];
                    try {
                        iArr[GeneratedChatAvatar.VideoAvatar.GeneratingState.GENERATING.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[GeneratedChatAvatar.VideoAvatar.GeneratingState.READY.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(ChatCallViewModel chatCallViewModel, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = chatCallViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(GeneratedChatAvatar generatedChatAvatar, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(generatedChatAvatar, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code restructure failed: missing block: B:29:0x007f, code lost:
                if (r1 == null) goto L20;
             */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                GeneratedChatAvatar generatedChatAvatar;
                String roundAvatarUrl;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    generatedChatAvatar = (GeneratedChatAvatar) this.L$0;
                    this.L$0 = generatedChatAvatar;
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
                    generatedChatAvatar = (GeneratedChatAvatar) this.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                ChatInfo chatInfo = (ChatInfo) obj;
                if (generatedChatAvatar instanceof GeneratedChatAvatar.ImageAvatar) {
                    roundAvatarUrl = ((GeneratedChatAvatar.ImageAvatar) generatedChatAvatar).getImageAvatarUri();
                } else {
                    if (!(generatedChatAvatar instanceof GeneratedChatAvatar.Empty)) {
                        if (generatedChatAvatar instanceof GeneratedChatAvatar.VideoAvatar) {
                            GeneratedChatAvatar.VideoAvatar videoAvatar = (GeneratedChatAvatar.VideoAvatar) generatedChatAvatar;
                            int i2 = WhenMappings.$EnumSwitchMapping$0[videoAvatar.getGeneratingState().ordinal()];
                            if (i2 != 1 && i2 == 2) {
                                roundAvatarUrl = videoAvatar.getImageAvatarUri();
                            }
                        } else {
                            roundAvatarUrl = chatInfo != null ? chatInfo.getRoundAvatarUrl() : null;
                        }
                        return Unit.INSTANCE;
                    }
                    roundAvatarUrl = "";
                }
                UiStateDelegate<UiState, Event> uiStateDelegate = this.this$0;
                this.L$0 = null;
                this.label = 2;
                if (uiStateDelegate.updateUiState(uiStateDelegate, new C01511(chatInfo, roundAvatarUrl), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: ChatCallViewModel.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/presentation/features/chatcall/viewmodel/ChatCallViewModel$UiState;", "state", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.ifriend.presentation.features.chatcall.viewmodel.ChatCallViewModel$2$1$1  reason: invalid class name and collision with other inner class name */
            /* loaded from: classes6.dex */
            public static final class C01511 extends Lambda implements Function1<UiState, UiState> {
                final /* synthetic */ String $chatAvatarUrl;
                final /* synthetic */ ChatInfo $chatInfo;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C01511(ChatInfo chatInfo, String str) {
                    super(1);
                    this.$chatInfo = chatInfo;
                    this.$chatAvatarUrl = str;
                }

                @Override // kotlin.jvm.functions.Function1
                public final UiState invoke(UiState state) {
                    Intrinsics.checkNotNullParameter(state, "state");
                    ChatInfo chatInfo = this.$chatInfo;
                    String name = chatInfo != null ? chatInfo.getName() : null;
                    if (name == null) {
                        name = "";
                    }
                    return UiState.copy$default(state, null, false, null, false, name, this.$chatAvatarUrl, null, 0L, null, null, null, false, 4047, null);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initCall() {
        final Flow distinctUntilChanged = FlowKt.distinctUntilChanged(this.chatEventsInteractor.getChatCallMessageFlow());
        final Flow<MessagesSourceMessage.ChatCallMessage> flow = new Flow<MessagesSourceMessage.ChatCallMessage>() { // from class: com.ifriend.presentation.features.chatcall.viewmodel.ChatCallViewModel$initCall$$inlined$filter$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super MessagesSourceMessage.ChatCallMessage> flowCollector, Continuation continuation) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector, this), continuation);
                return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.ifriend.presentation.features.chatcall.viewmodel.ChatCallViewModel$initCall$$inlined$filter$1$2  reason: invalid class name */
            /* loaded from: classes6.dex */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;
                final /* synthetic */ ChatCallViewModel this$0;

                /* compiled from: Emitters.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @DebugMetadata(c = "com.ifriend.presentation.features.chatcall.viewmodel.ChatCallViewModel$initCall$$inlined$filter$1$2", f = "ChatCallViewModel.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
                /* renamed from: com.ifriend.presentation.features.chatcall.viewmodel.ChatCallViewModel$initCall$$inlined$filter$1$2$1  reason: invalid class name */
                /* loaded from: classes6.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, ChatCallViewModel chatCallViewModel) {
                    this.$this_unsafeFlow = flowCollector;
                    this.this$0 = chatCallViewModel;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    int i;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label -= Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.result;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.label;
                            if (i != 0) {
                                ResultKt.throwOnFailure(obj2);
                                FlowCollector flowCollector = this.$this_unsafeFlow;
                                MessagesSourceMessage.ChatCallMessage chatCallMessage = (MessagesSourceMessage.ChatCallMessage) obj;
                                String callId = chatCallMessage.getCallId();
                                UiStateDelegate<ChatCallViewModel.UiState, ChatCallViewModel.Event> uiStateDelegate = this.this$0;
                                if (!Intrinsics.areEqual(callId, uiStateDelegate.getUiState(uiStateDelegate).getCallId()) || StringsKt.isBlank(chatCallMessage.getMessage())) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                            } else if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            } else {
                                ResultKt.throwOnFailure(obj2);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(continuation);
                    Object obj22 = anonymousClass1.result;
                    Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.label;
                    if (i != 0) {
                    }
                    return Unit.INSTANCE;
                }
            }
        };
        ChatCallViewModel chatCallViewModel = this;
        BuildersKt.launch(ViewModelKt.getViewModelScope(chatCallViewModel), EmptyCoroutineContext.INSTANCE, CoroutineStart.DEFAULT, new ChatCallViewModel$initCall$$inlined$collectIn$default$1(new Flow<String>() { // from class: com.ifriend.presentation.features.chatcall.viewmodel.ChatCallViewModel$initCall$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super String> flowCollector, Continuation continuation) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), continuation);
                return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.ifriend.presentation.features.chatcall.viewmodel.ChatCallViewModel$initCall$$inlined$map$1$2  reason: invalid class name */
            /* loaded from: classes6.dex */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @DebugMetadata(c = "com.ifriend.presentation.features.chatcall.viewmodel.ChatCallViewModel$initCall$$inlined$map$1$2", f = "ChatCallViewModel.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
                /* renamed from: com.ifriend.presentation.features.chatcall.viewmodel.ChatCallViewModel$initCall$$inlined$map$1$2$1  reason: invalid class name */
                /* loaded from: classes6.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    int i;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label -= Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.result;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.label;
                            if (i != 0) {
                                ResultKt.throwOnFailure(obj2);
                                FlowCollector flowCollector = this.$this_unsafeFlow;
                                String message = ((MessagesSourceMessage.ChatCallMessage) obj).getMessage();
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(message, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            } else {
                                ResultKt.throwOnFailure(obj2);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(continuation);
                    Object obj22 = anonymousClass1.result;
                    Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.label;
                    if (i != 0) {
                    }
                    return Unit.INSTANCE;
                }
            }
        }, null, this));
        CoroutinesKt.safeLaunch$default(ViewModelKt.getViewModelScope(chatCallViewModel), new ChatCallViewModel$initCall$4(this, null), null, new ChatCallViewModel$initCall$5(this, null), 2, null);
        this.textToSpeechStreamJob = FlowKt.launchIn(FlowKt.onEach(this.textToSpeechStream.getMessageStateFlow(), new ChatCallViewModel$initCall$6(this, null)), ViewModelKt.getViewModelScope(chatCallViewModel));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initMessageFlow() {
        Flow flowOn = FlowKt.flowOn(FlowKt.onStart(this.voiceRecognitionStreaming.getStreamingRecognizeFlow(), new ChatCallViewModel$initMessageFlow$1(this, null)), this.dispatcherProvider.background());
        Duration.Companion companion = Duration.Companion;
        final Flow m8849timeoutHG0u8IE = FlowKt.m8849timeoutHG0u8IE(flowOn, DurationKt.toDuration(30L, DurationUnit.SECONDS));
        final Flow<StreamingRecognize> flow = new Flow<StreamingRecognize>() { // from class: com.ifriend.presentation.features.chatcall.viewmodel.ChatCallViewModel$initMessageFlow$$inlined$filter$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super StreamingRecognize> flowCollector, Continuation continuation) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), continuation);
                return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.ifriend.presentation.features.chatcall.viewmodel.ChatCallViewModel$initMessageFlow$$inlined$filter$1$2  reason: invalid class name */
            /* loaded from: classes6.dex */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @DebugMetadata(c = "com.ifriend.presentation.features.chatcall.viewmodel.ChatCallViewModel$initMessageFlow$$inlined$filter$1$2", f = "ChatCallViewModel.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
                /* renamed from: com.ifriend.presentation.features.chatcall.viewmodel.ChatCallViewModel$initMessageFlow$$inlined$filter$1$2$1  reason: invalid class name */
                /* loaded from: classes6.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    int i;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label -= Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.result;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.label;
                            if (i != 0) {
                                ResultKt.throwOnFailure(obj2);
                                FlowCollector flowCollector = this.$this_unsafeFlow;
                                StreamingRecognize streamingRecognize = (StreamingRecognize) obj;
                                if ((StringsKt.isBlank(streamingRecognize.getText()) ^ true) && streamingRecognize.isFinal()) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                            } else if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            } else {
                                ResultKt.throwOnFailure(obj2);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(continuation);
                    Object obj22 = anonymousClass1.result;
                    Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.label;
                    if (i != 0) {
                    }
                    return Unit.INSTANCE;
                }
            }
        };
        this.streamingRecognizeFlowJob = FlowKt.launchIn(FlowKt.m8846catch(com.ifriend.common_utils.extensions.FlowKt.onEachSafe(new Flow<String>() { // from class: com.ifriend.presentation.features.chatcall.viewmodel.ChatCallViewModel$initMessageFlow$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super String> flowCollector, Continuation continuation) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), continuation);
                return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.ifriend.presentation.features.chatcall.viewmodel.ChatCallViewModel$initMessageFlow$$inlined$map$1$2  reason: invalid class name */
            /* loaded from: classes6.dex */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @DebugMetadata(c = "com.ifriend.presentation.features.chatcall.viewmodel.ChatCallViewModel$initMessageFlow$$inlined$map$1$2", f = "ChatCallViewModel.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
                /* renamed from: com.ifriend.presentation.features.chatcall.viewmodel.ChatCallViewModel$initMessageFlow$$inlined$map$1$2$1  reason: invalid class name */
                /* loaded from: classes6.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    int i;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label -= Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.result;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.label;
                            if (i != 0) {
                                ResultKt.throwOnFailure(obj2);
                                FlowCollector flowCollector = this.$this_unsafeFlow;
                                String text = ((StreamingRecognize) obj).getText();
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(text, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            } else {
                                ResultKt.throwOnFailure(obj2);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(continuation);
                    Object obj22 = anonymousClass1.result;
                    Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.label;
                    if (i != 0) {
                    }
                    return Unit.INSTANCE;
                }
            }
        }, new ChatCallViewModel$initMessageFlow$4(this.exceptionsEmitter), new ChatCallViewModel$initMessageFlow$5(this, null)), new ChatCallViewModel$initMessageFlow$6(this, null)), ViewModelKt.getViewModelScope(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startCalling() {
        this.startCallingJob = CoroutinesKt.safeLaunch$default(ViewModelKt.getViewModelScope(this), new ChatCallViewModel$startCalling$1(this, null), null, new ChatCallViewModel$startCalling$2(this, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void speakMessage$default(ChatCallViewModel chatCallViewModel, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        chatCallViewModel.speakMessage(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void speakMessage(String str, String str2) {
        if (str2 == null) {
            str2 = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(str2, "toString(...)");
        }
        this.messages.put(str2, str);
        this.textToSpeechStream.speak(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startTimer() {
        CoroutinesKt.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new ChatCallViewModel$startTimer$1(this, null), 3, null);
    }

    public final void onEndCallClick() {
        CoroutinesKt.safeLaunch$default(ViewModelKt.getViewModelScope(this), new ChatCallViewModel$onEndCallClick$1(this, null), null, new ChatCallViewModel$onEndCallClick$2(this, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006c A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object finishCallAndCloseFeature(FinishCallReason finishCallReason, boolean z, Continuation<? super Unit> continuation) {
        ChatCallViewModel$finishCallAndCloseFeature$1 chatCallViewModel$finishCallAndCloseFeature$1;
        Object coroutine_suspended;
        int i;
        ChatCallViewModel chatCallViewModel;
        if (continuation instanceof ChatCallViewModel$finishCallAndCloseFeature$1) {
            chatCallViewModel$finishCallAndCloseFeature$1 = (ChatCallViewModel$finishCallAndCloseFeature$1) continuation;
            if ((chatCallViewModel$finishCallAndCloseFeature$1.label & Integer.MIN_VALUE) != 0) {
                chatCallViewModel$finishCallAndCloseFeature$1.label -= Integer.MIN_VALUE;
                Object obj = chatCallViewModel$finishCallAndCloseFeature$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = chatCallViewModel$finishCallAndCloseFeature$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (z) {
                        this.chatCallAnalytics.trackAutoEndCallButtonClick(finishCallReason.getKey(), null);
                    }
                    stopJobs();
                    chatCallViewModel$finishCallAndCloseFeature$1.L$0 = this;
                    chatCallViewModel$finishCallAndCloseFeature$1.label = 1;
                    if (sendFinishCallEvent(finishCallReason, chatCallViewModel$finishCallAndCloseFeature$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    chatCallViewModel = this;
                } else if (i != 1) {
                    if (i == 2) {
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    chatCallViewModel = (ChatCallViewModel) chatCallViewModel$finishCallAndCloseFeature$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                chatCallViewModel$finishCallAndCloseFeature$1.L$0 = null;
                chatCallViewModel$finishCallAndCloseFeature$1.label = 2;
                if (chatCallViewModel.sendEvent2((UiStateDelegate<UiState, Event>) chatCallViewModel, (Event) Event.CloseFeature.INSTANCE, (Continuation<? super Unit>) chatCallViewModel$finishCallAndCloseFeature$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
        }
        chatCallViewModel$finishCallAndCloseFeature$1 = new ChatCallViewModel$finishCallAndCloseFeature$1(this, continuation);
        Object obj2 = chatCallViewModel$finishCallAndCloseFeature$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = chatCallViewModel$finishCallAndCloseFeature$1.label;
        if (i != 0) {
        }
        chatCallViewModel$finishCallAndCloseFeature$1.L$0 = null;
        chatCallViewModel$finishCallAndCloseFeature$1.label = 2;
        if (chatCallViewModel.sendEvent2((UiStateDelegate<UiState, Event>) chatCallViewModel, (Event) Event.CloseFeature.INSTANCE, (Continuation<? super Unit>) chatCallViewModel$finishCallAndCloseFeature$1) == coroutine_suspended) {
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Object finishCallAndCloseFeature$default(ChatCallViewModel chatCallViewModel, FinishCallReason finishCallReason, boolean z, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return chatCallViewModel.finishCallAndCloseFeature(finishCallReason, z, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object finishCall(FinishCallReason finishCallReason, Continuation<? super Unit> continuation) {
        stopJobs();
        Object sendFinishCallEvent = sendFinishCallEvent(finishCallReason, continuation);
        return sendFinishCallEvent == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? sendFinishCallEvent : Unit.INSTANCE;
    }

    private final void stopJobs() {
        Job job = this.streamingRecognizeFlowJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        Job job2 = this.textToSpeechStreamJob;
        if (job2 != null) {
            Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
        }
        this.voiceRecognitionStreaming.stopRecognition();
        this.textToSpeechStream.stop();
        Job job3 = this.startCallingJob;
        if (job3 != null) {
            Job.DefaultImpls.cancel$default(job3, (CancellationException) null, 1, (Object) null);
        }
        Job job4 = this.speechRecognizerJob;
        if (job4 != null) {
            Job.DefaultImpls.cancel$default(job4, (CancellationException) null, 1, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object sendFinishCallEvent(FinishCallReason finishCallReason, Continuation<? super Unit> continuation) {
        Object withContext = BuildersKt.withContext(this.dispatcherProvider.nonCancellable(), new ChatCallViewModel$sendFinishCallEvent$2(this, finishCallReason, null), continuation);
        return withContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void finishCallAfterInactivityTime() {
        CoroutinesKt.safeLaunch$default(ViewModelKt.getViewModelScope(this), new ChatCallViewModel$finishCallAfterInactivityTime$1(this, null), null, new ChatCallViewModel$finishCallAfterInactivityTime$2(this, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object lastMessagePlayed(Continuation<? super Unit> continuation) {
        Object sendEvent2 = sendEvent2((UiStateDelegate<UiState, Event>) this, (Event) Event.CloseFeature.INSTANCE, continuation);
        return sendEvent2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? sendEvent2 : Unit.INSTANCE;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onPause(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        if (getUiState((UiStateDelegate<UiState, Event>) this).isCallActive()) {
            CoroutinesKt.safeLaunch$default(ViewModelKt.getViewModelScope(this), new ChatCallViewModel$onPause$1(this, null), null, new ChatCallViewModel$onPause$2(this, null), 2, null);
        }
    }

    public final void onAudioPermissionGranted(boolean z) {
        if (!z) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ChatCallViewModel$onAudioPermissionGranted$1(this, null), 3, null);
        } else {
            initCall();
        }
    }

    public final void onCancelMessageInfoPopupClick() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ChatCallViewModel$onCancelMessageInfoPopupClick$1(this, null), 3, null);
    }

    public final void onMessageInfoPopupClick() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ChatCallViewModel$onMessageInfoPopupClick$1(this, null), 3, null);
    }
}
