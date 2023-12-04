package com.ifriend.data.socket;

import androidx.core.app.NotificationCompat;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.ifriend.common_utils.Logger;
import com.ifriend.data.socket.mapper.SocketMessageToMessagesSourceMessageMapper;
import com.ifriend.domain.CoroutineDispatchers;
import com.ifriend.domain.socket.MessagesSource;
import com.ifriend.domain.socket.MessagesSourceMessage;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import okio.ByteString;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: SocketMessagesSource.kt */
@Metadata(d1 = {"\u0000\u0093\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f*\u0001$\u0018\u0000 =2\u00020\u0001:\u0001=BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0002\u0010\u0013J\u0016\u0010&\u001a\b\u0012\u0004\u0012\u00020(0'2\u0006\u0010)\u001a\u00020\u0007H\u0016J\b\u0010*\u001a\u00020+H\u0016J\u000e\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00180'H\u0016J\u0016\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00180'2\u0006\u0010.\u001a\u00020\u0018H\u0016J\b\u0010/\u001a\u000200H\u0002J\b\u00101\u001a\u00020\u0007H\u0016J\u000e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000702H\u0016J\u0010\u00103\u001a\u0002002\u0006\u00104\u001a\u00020\u001bH\u0002J\u0010\u00105\u001a\u0002002\u0006\u00106\u001a\u00020\u001eH\u0002J\u0010\u00107\u001a\u0002002\u0006\u00108\u001a\u00020\u0018H\u0002J\b\u00109\u001a\u000200H\u0016J\u0011\u0010)\u001a\u000200H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010:J\b\u0010;\u001a\u000200H\u0016J\u0011\u0010<\u001a\u000200H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010:R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00070\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010!\u001a\u0004\u0018\u00010\"X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010#\u001a\u00020$X\u0082\u0004¢\u0006\u0004\n\u0002\u0010%\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006>"}, d2 = {"Lcom/ifriend/data/socket/SocketMessagesSource;", "Lcom/ifriend/domain/socket/MessagesSource;", "socketUrlProvider", "Lcom/ifriend/data/socket/SocketUrlProvider;", "okHttpClient", "Lokhttp3/OkHttpClient;", "reconnectOnError", "", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "coroutineDispatchers", "Lcom/ifriend/domain/CoroutineDispatchers;", "logger", "Lcom/ifriend/common_utils/Logger;", "socketMessageToMessagesSourceMessageMapper", "Lcom/ifriend/data/socket/mapper/SocketMessageToMessagesSourceMessageMapper;", "replay", "", "buffer", "(Lcom/ifriend/data/socket/SocketUrlProvider;Lokhttp3/OkHttpClient;ZLkotlinx/coroutines/CoroutineScope;Lcom/ifriend/domain/CoroutineDispatchers;Lcom/ifriend/common_utils/Logger;Lcom/ifriend/data/socket/mapper/SocketMessageToMessagesSourceMessageMapper;II)V", "coroutineExceptionHandler", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "events", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/ifriend/domain/socket/MessagesSource$SourceEvent;", "isRunningFlow", "lastSync", "", "messagesState", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/ifriend/data/socket/SocketMessage;", "mutex", "Lkotlinx/coroutines/sync/Mutex;", "socket", "Lokhttp3/WebSocket;", "webSocketListener", "com/ifriend/data/socket/SocketMessagesSource$webSocketListener$1", "Lcom/ifriend/data/socket/SocketMessagesSource$webSocketListener$1;", "getAllMessages", "Lkotlinx/coroutines/flow/Flow;", "Lcom/ifriend/domain/socket/MessagesSourceMessage;", TtmlNode.START, "getLastSync", "", "getSourceEvents", "getSourceEventsOf", "type", "internalStart", "", "isRunning", "Lkotlinx/coroutines/flow/StateFlow;", "logMessageReceived", "text", "post", "socketMessage", "postSourceEvent", NotificationCompat.CATEGORY_EVENT, "reset", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "stop", "waitUntilRunning", "Companion", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SocketMessagesSource implements MessagesSource {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "SocketMessagesSource";
    private final CoroutineDispatchers coroutineDispatchers;
    private final CoroutineExceptionHandler coroutineExceptionHandler;
    private final CoroutineScope coroutineScope;
    private final MutableStateFlow<MessagesSource.SourceEvent> events;
    private final MutableStateFlow<Boolean> isRunningFlow;
    private String lastSync;
    private final Logger logger;
    private final MutableSharedFlow<SocketMessage> messagesState;
    private final Mutex mutex;
    private final OkHttpClient okHttpClient;
    private final boolean reconnectOnError;
    private WebSocket socket;
    private final SocketMessageToMessagesSourceMessageMapper socketMessageToMessagesSourceMessageMapper;
    private final SocketUrlProvider socketUrlProvider;
    private final SocketMessagesSource$webSocketListener$1 webSocketListener;

    /* JADX WARN: Type inference failed for: r2v4, types: [com.ifriend.data.socket.SocketMessagesSource$webSocketListener$1] */
    public SocketMessagesSource(SocketUrlProvider socketUrlProvider, OkHttpClient okHttpClient, boolean z, CoroutineScope coroutineScope, CoroutineDispatchers coroutineDispatchers, Logger logger, SocketMessageToMessagesSourceMessageMapper socketMessageToMessagesSourceMessageMapper, int i, int i2) {
        Intrinsics.checkNotNullParameter(socketUrlProvider, "socketUrlProvider");
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(coroutineDispatchers, "coroutineDispatchers");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(socketMessageToMessagesSourceMessageMapper, "socketMessageToMessagesSourceMessageMapper");
        this.socketUrlProvider = socketUrlProvider;
        this.okHttpClient = okHttpClient;
        this.reconnectOnError = z;
        this.coroutineScope = coroutineScope;
        this.coroutineDispatchers = coroutineDispatchers;
        this.logger = logger;
        this.socketMessageToMessagesSourceMessageMapper = socketMessageToMessagesSourceMessageMapper;
        this.mutex = MutexKt.Mutex(false);
        this.messagesState = SharedFlowKt.MutableSharedFlow(i, i2, BufferOverflow.DROP_OLDEST);
        this.events = StateFlowKt.MutableStateFlow(null);
        this.coroutineExceptionHandler = new SocketMessagesSource$special$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.Key, this);
        this.isRunningFlow = StateFlowKt.MutableStateFlow(false);
        this.webSocketListener = new WebSocketListener() { // from class: com.ifriend.data.socket.SocketMessagesSource$webSocketListener$1
            @Override // okhttp3.WebSocketListener
            public void onOpen(WebSocket webSocket, Response response) {
                Logger logger2;
                Intrinsics.checkNotNullParameter(webSocket, "webSocket");
                Intrinsics.checkNotNullParameter(response, "response");
                logger2 = SocketMessagesSource.this.logger;
                logger2.info("Socket is opened", "SocketMessagesSource");
            }

            @Override // okhttp3.WebSocketListener
            public void onMessage(WebSocket webSocket, String text) {
                Logger logger2;
                Intrinsics.checkNotNullParameter(webSocket, "webSocket");
                Intrinsics.checkNotNullParameter(text, "text");
                SocketMessagesSource.this.logMessageReceived(text);
                SocketMessagesSource.this.lastSync = String.valueOf(System.currentTimeMillis());
                try {
                    JSONObject jSONObject = new JSONObject(text);
                    SocketMessagesSource socketMessagesSource = SocketMessagesSource.this;
                    String str = null;
                    if (jSONObject.has("sync")) {
                        Object obj = jSONObject.get("sync");
                        if (obj != null ? obj instanceof String : true) {
                            str = obj;
                        }
                    }
                    socketMessagesSource.lastSync = str;
                    String string = jSONObject.getString("type");
                    Intrinsics.checkNotNull(string);
                    SocketMessagesSource.this.post(new SocketMessage(string, text, jSONObject));
                } catch (JSONException e) {
                    logger2 = SocketMessagesSource.this.logger;
                    String message = e.getMessage();
                    logger2.info("Invalid message received from socket\nbody: " + text + "\nerror: " + message, "SocketMessagesSource");
                }
            }

            @Override // okhttp3.WebSocketListener
            public void onMessage(WebSocket webSocket, ByteString bytes) {
                Logger logger2;
                Intrinsics.checkNotNullParameter(webSocket, "webSocket");
                Intrinsics.checkNotNullParameter(bytes, "bytes");
                logger2 = SocketMessagesSource.this.logger;
                String hex = bytes.hex();
                logger2.info("Receive Bytes : " + hex, "SocketMessagesSource");
            }

            @Override // okhttp3.WebSocketListener
            public void onClosing(WebSocket webSocket, int i3, String reason) {
                Logger logger2;
                boolean z2;
                Intrinsics.checkNotNullParameter(webSocket, "webSocket");
                Intrinsics.checkNotNullParameter(reason, "reason");
                webSocket.close(1000, null);
                SocketMessagesSource.this.socket = null;
                SocketMessagesSource.this.postSourceEvent(MessagesSource.SourceEvent.CLOSED);
                logger2 = SocketMessagesSource.this.logger;
                logger2.info("Socket is closed : " + i3 + " / " + reason, "SocketMessagesSource");
                if (Intrinsics.areEqual(reason, "by ttl")) {
                    z2 = SocketMessagesSource.this.reconnectOnError;
                    if (z2) {
                        SocketMessagesSource.this.internalStart();
                    }
                }
            }

            @Override // okhttp3.WebSocketListener
            public void onFailure(WebSocket webSocket, Throwable throwable, Response response) {
                Logger logger2;
                Logger logger3;
                boolean z2;
                Intrinsics.checkNotNullParameter(webSocket, "webSocket");
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                logger2 = SocketMessagesSource.this.logger;
                logger2.info("Socket error : " + throwable, "SocketMessagesSource");
                SocketMessagesSource.this.socket = null;
                SocketMessagesSource.this.postSourceEvent(MessagesSource.SourceEvent.CLOSED);
                if (!isNormalSocketClosingException(throwable)) {
                    z2 = SocketMessagesSource.this.reconnectOnError;
                    if (z2) {
                        SocketMessagesSource.this.internalStart();
                        return;
                    }
                }
                logger3 = SocketMessagesSource.this.logger;
                logger3.logException(throwable);
            }

            private final boolean isNormalSocketClosingException(Throwable th) {
                return Intrinsics.areEqual(th.getMessage(), "Socket closed");
            }
        };
    }

    public /* synthetic */ SocketMessagesSource(SocketUrlProvider socketUrlProvider, OkHttpClient okHttpClient, boolean z, CoroutineScope coroutineScope, CoroutineDispatchers coroutineDispatchers, Logger logger, SocketMessageToMessagesSourceMessageMapper socketMessageToMessagesSourceMessageMapper, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(socketUrlProvider, okHttpClient, (i3 & 4) != 0 ? true : z, coroutineScope, coroutineDispatchers, logger, socketMessageToMessagesSourceMessageMapper, (i3 & 128) != 0 ? 0 : i, (i3 & 256) != 0 ? 10 : i2);
    }

    /* compiled from: SocketMessagesSource.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ifriend/data/socket/SocketMessagesSource$Companion;", "", "()V", "TAG", "", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Override // com.ifriend.domain.socket.MessagesSource
    public long getLastSync() {
        String str = this.lastSync;
        if (str != null) {
            return Long.parseLong(str);
        }
        return 0L;
    }

    @Override // com.ifriend.domain.socket.MessagesSource
    public Flow<MessagesSourceMessage> getAllMessages(boolean z) {
        if (!isRunning() && z) {
            internalStart();
        }
        final Flow distinctUntilChanged = FlowKt.distinctUntilChanged(FlowKt.filterNotNull(this.messagesState));
        return FlowKt.filterNotNull(new Flow<MessagesSourceMessage>() { // from class: com.ifriend.data.socket.SocketMessagesSource$getAllMessages$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super MessagesSourceMessage> flowCollector, Continuation continuation) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector, this), continuation);
                return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.ifriend.data.socket.SocketMessagesSource$getAllMessages$$inlined$map$1$2  reason: invalid class name */
            /* loaded from: classes6.dex */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;
                final /* synthetic */ SocketMessagesSource this$0;

                /* compiled from: Emitters.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @DebugMetadata(c = "com.ifriend.data.socket.SocketMessagesSource$getAllMessages$$inlined$map$1$2", f = "SocketMessagesSource.kt", i = {}, l = {224, 223}, m = "emit", n = {}, s = {})
                /* renamed from: com.ifriend.data.socket.SocketMessagesSource$getAllMessages$$inlined$map$1$2$1  reason: invalid class name */
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

                public AnonymousClass2(FlowCollector flowCollector, SocketMessagesSource socketMessagesSource) {
                    this.$this_unsafeFlow = flowCollector;
                    this.this$0 = socketMessagesSource;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
                /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
                /* JADX WARN: Removed duplicated region for block: B:22:0x0066 A[RETURN] */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    Object obj2;
                    Object coroutine_suspended;
                    int i;
                    SocketMessageToMessagesSourceMessageMapper socketMessageToMessagesSourceMessageMapper;
                    FlowCollector flowCollector;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label -= Integer.MIN_VALUE;
                            obj2 = anonymousClass1.result;
                            coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.label;
                            if (i != 0) {
                                ResultKt.throwOnFailure(obj2);
                                FlowCollector flowCollector2 = this.$this_unsafeFlow;
                                socketMessageToMessagesSourceMessageMapper = this.this$0.socketMessageToMessagesSourceMessageMapper;
                                anonymousClass1.L$0 = flowCollector2;
                                anonymousClass1.label = 1;
                                Object map = socketMessageToMessagesSourceMessageMapper.map((SocketMessage) obj, anonymousClass1);
                                if (map == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                obj2 = map;
                                flowCollector = flowCollector2;
                            } else if (i != 1) {
                                if (i != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj2);
                                return Unit.INSTANCE;
                            } else {
                                flowCollector = (FlowCollector) anonymousClass1.L$0;
                                ResultKt.throwOnFailure(obj2);
                            }
                            anonymousClass1.L$0 = null;
                            anonymousClass1.label = 2;
                            if (flowCollector.emit(obj2, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(continuation);
                    obj2 = anonymousClass1.result;
                    coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.label;
                    if (i != 0) {
                    }
                    anonymousClass1.L$0 = null;
                    anonymousClass1.label = 2;
                    if (flowCollector.emit(obj2, anonymousClass1) == coroutine_suspended) {
                    }
                    return Unit.INSTANCE;
                }
            }
        });
    }

    @Override // com.ifriend.domain.socket.MessagesSource
    public Flow<MessagesSource.SourceEvent> getSourceEvents() {
        return FlowKt.filterNotNull(this.events);
    }

    @Override // com.ifriend.domain.socket.MessagesSource
    public Flow<MessagesSource.SourceEvent> getSourceEventsOf(final MessagesSource.SourceEvent type) {
        Intrinsics.checkNotNullParameter(type, "type");
        final Flow<MessagesSource.SourceEvent> sourceEvents = getSourceEvents();
        return new Flow<MessagesSource.SourceEvent>() { // from class: com.ifriend.data.socket.SocketMessagesSource$getSourceEventsOf$$inlined$filter$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super MessagesSource.SourceEvent> flowCollector, Continuation continuation) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector, type), continuation);
                return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.ifriend.data.socket.SocketMessagesSource$getSourceEventsOf$$inlined$filter$1$2  reason: invalid class name */
            /* loaded from: classes6.dex */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;
                final /* synthetic */ MessagesSource.SourceEvent $type$inlined;

                /* compiled from: Emitters.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @DebugMetadata(c = "com.ifriend.data.socket.SocketMessagesSource$getSourceEventsOf$$inlined$filter$1$2", f = "SocketMessagesSource.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
                /* renamed from: com.ifriend.data.socket.SocketMessagesSource$getSourceEventsOf$$inlined$filter$1$2$1  reason: invalid class name */
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

                public AnonymousClass2(FlowCollector flowCollector, MessagesSource.SourceEvent sourceEvent) {
                    this.$this_unsafeFlow = flowCollector;
                    this.$type$inlined = sourceEvent;
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
                                if (((MessagesSource.SourceEvent) obj) == this.$type$inlined) {
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
    }

    @Override // com.ifriend.domain.socket.MessagesSource
    public void reset() {
        this.lastSync = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void post(SocketMessage socketMessage) {
        this.messagesState.tryEmit(socketMessage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void postSourceEvent(MessagesSource.SourceEvent sourceEvent) {
        this.events.tryEmit(sourceEvent);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:1|(4:(2:3|(7:5|6|7|(1:(1:(10:11|12|13|14|15|(1:17)(1:24)|18|19|20|21)(2:28|29))(1:30))(2:48|(1:50)(1:51))|31|32|(4:34|35|36|(1:38)(8:39|14|15|(0)(0)|18|19|20|21))(4:43|19|20|21)))|31|32|(0)(0))|53|6|7|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0041, code lost:
        r10 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008e A[Catch: all -> 0x00f2, TRY_LEAVE, TryCatch #1 {all -> 0x00f2, blocks: (B:26:0x0088, B:28:0x008e, B:29:0x0095), top: B:53:0x0088 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e9  */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v2, types: [kotlinx.coroutines.sync.Mutex] */
    @Override // com.ifriend.domain.socket.MessagesSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object start(Continuation<? super Unit> continuation) {
        SocketMessagesSource$start$1 socketMessagesSource$start$1;
        int i;
        Mutex mutex;
        Mutex mutex2;
        SocketMessagesSource socketMessagesSource;
        Mutex mutex3;
        Exception e;
        SocketMessagesSource socketMessagesSource2;
        SocketMessagesSource socketMessagesSource3;
        Object url;
        SocketMessagesSource socketMessagesSource4;
        WebSocket webSocket;
        Mutex mutex4;
        try {
            if (continuation instanceof SocketMessagesSource$start$1) {
                socketMessagesSource$start$1 = (SocketMessagesSource$start$1) continuation;
                if ((socketMessagesSource$start$1.label & Integer.MIN_VALUE) != 0) {
                    socketMessagesSource$start$1.label -= Integer.MIN_VALUE;
                    Object obj = socketMessagesSource$start$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = socketMessagesSource$start$1.label;
                    mutex = TAG;
                    boolean z = true;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        this.logger.info("Trying start socket connection\nMutex isLocked = " + this.mutex.isLocked(), TAG);
                        mutex2 = this.mutex;
                        socketMessagesSource$start$1.L$0 = this;
                        socketMessagesSource$start$1.L$1 = mutex2;
                        socketMessagesSource$start$1.label = 1;
                        if (mutex2.lock(null, socketMessagesSource$start$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        socketMessagesSource = this;
                    } else if (i != 1) {
                        if (i == 2) {
                            socketMessagesSource4 = (SocketMessagesSource) socketMessagesSource$start$1.L$3;
                            socketMessagesSource3 = (SocketMessagesSource) socketMessagesSource$start$1.L$2;
                            mutex3 = (Mutex) socketMessagesSource$start$1.L$1;
                            socketMessagesSource2 = (SocketMessagesSource) socketMessagesSource$start$1.L$0;
                            try {
                                ResultKt.throwOnFailure(obj);
                                mutex3 = mutex3;
                                webSocket = socketMessagesSource2.okHttpClient.newWebSocket(new Request.Builder().url((String) obj).build(), socketMessagesSource2.webSocketListener);
                                mutex4 = mutex3;
                            } catch (Exception e2) {
                                e = e2;
                                socketMessagesSource2.logger.logException(e);
                                socketMessagesSource4 = socketMessagesSource3;
                                webSocket = null;
                                mutex4 = mutex3;
                                socketMessagesSource4.socket = webSocket;
                                MutableStateFlow<Boolean> mutableStateFlow = socketMessagesSource2.isRunningFlow;
                                if (socketMessagesSource2.socket != null) {
                                }
                                mutableStateFlow.tryEmit(Boxing.boxBoolean(z));
                                mutex = mutex4;
                                Unit unit = Unit.INSTANCE;
                                mutex.unlock(null);
                                return Unit.INSTANCE;
                            }
                            socketMessagesSource4.socket = webSocket;
                            MutableStateFlow<Boolean> mutableStateFlow2 = socketMessagesSource2.isRunningFlow;
                            if (socketMessagesSource2.socket != null) {
                                z = false;
                            }
                            mutableStateFlow2.tryEmit(Boxing.boxBoolean(z));
                            mutex = mutex4;
                            Unit unit2 = Unit.INSTANCE;
                            mutex.unlock(null);
                            return Unit.INSTANCE;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        socketMessagesSource = (SocketMessagesSource) socketMessagesSource$start$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        mutex2 = (Mutex) socketMessagesSource$start$1.L$1;
                    }
                    if (socketMessagesSource.isRunning()) {
                        socketMessagesSource.logger.info("Starting socket connection", TAG);
                        try {
                            SocketUrlProvider socketUrlProvider = socketMessagesSource.socketUrlProvider;
                            String str = socketMessagesSource.lastSync;
                            socketMessagesSource$start$1.L$0 = socketMessagesSource;
                            socketMessagesSource$start$1.L$1 = mutex2;
                            socketMessagesSource$start$1.L$2 = socketMessagesSource;
                            socketMessagesSource$start$1.L$3 = socketMessagesSource;
                            socketMessagesSource$start$1.label = 2;
                            url = socketUrlProvider.getUrl(str, socketMessagesSource$start$1);
                        } catch (Exception e3) {
                            mutex3 = mutex2;
                            e = e3;
                            socketMessagesSource2 = socketMessagesSource;
                            socketMessagesSource3 = socketMessagesSource2;
                            socketMessagesSource2.logger.logException(e);
                            socketMessagesSource4 = socketMessagesSource3;
                            webSocket = null;
                            mutex4 = mutex3;
                            socketMessagesSource4.socket = webSocket;
                            MutableStateFlow<Boolean> mutableStateFlow22 = socketMessagesSource2.isRunningFlow;
                            if (socketMessagesSource2.socket != null) {
                            }
                            mutableStateFlow22.tryEmit(Boxing.boxBoolean(z));
                            mutex = mutex4;
                            Unit unit22 = Unit.INSTANCE;
                            mutex.unlock(null);
                            return Unit.INSTANCE;
                        }
                        if (url == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        mutex3 = mutex2;
                        obj = url;
                        socketMessagesSource2 = socketMessagesSource;
                        socketMessagesSource4 = socketMessagesSource2;
                        socketMessagesSource3 = socketMessagesSource4;
                        webSocket = socketMessagesSource2.okHttpClient.newWebSocket(new Request.Builder().url((String) obj).build(), socketMessagesSource2.webSocketListener);
                        mutex4 = mutex3;
                        socketMessagesSource4.socket = webSocket;
                        MutableStateFlow<Boolean> mutableStateFlow222 = socketMessagesSource2.isRunningFlow;
                        if (socketMessagesSource2.socket != null) {
                        }
                        mutableStateFlow222.tryEmit(Boxing.boxBoolean(z));
                        mutex = mutex4;
                        Unit unit222 = Unit.INSTANCE;
                        mutex.unlock(null);
                        return Unit.INSTANCE;
                    }
                    mutex = mutex2;
                    Unit unit2222 = Unit.INSTANCE;
                    mutex.unlock(null);
                    return Unit.INSTANCE;
                }
            }
            if (socketMessagesSource.isRunning()) {
            }
        } catch (Throwable th) {
            mutex = mutex2;
            th = th;
            mutex.unlock(null);
            throw th;
        }
        socketMessagesSource$start$1 = new SocketMessagesSource$start$1(this, continuation);
        Object obj2 = socketMessagesSource$start$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = socketMessagesSource$start$1.label;
        mutex = TAG;
        boolean z2 = true;
        if (i != 0) {
        }
    }

    @Override // com.ifriend.domain.socket.MessagesSource
    public void stop() {
        this.logger.info("Stopping socket connection", TAG);
        WebSocket webSocket = this.socket;
        if (webSocket != null) {
            webSocket.cancel();
        }
        this.socket = null;
        this.isRunningFlow.tryEmit(false);
    }

    @Override // com.ifriend.domain.socket.MessagesSource
    public boolean isRunning() {
        return this.socket != null;
    }

    @Override // com.ifriend.domain.socket.MessagesSource
    public StateFlow<Boolean> isRunningFlow() {
        return this.isRunningFlow;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006d A[RETURN] */
    @Override // com.ifriend.domain.socket.MessagesSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object waitUntilRunning(Continuation<? super Unit> continuation) {
        SocketMessagesSource$waitUntilRunning$1 socketMessagesSource$waitUntilRunning$1;
        Object coroutine_suspended;
        int i;
        if (continuation instanceof SocketMessagesSource$waitUntilRunning$1) {
            socketMessagesSource$waitUntilRunning$1 = (SocketMessagesSource$waitUntilRunning$1) continuation;
            if ((socketMessagesSource$waitUntilRunning$1.label & Integer.MIN_VALUE) != 0) {
                socketMessagesSource$waitUntilRunning$1.label -= Integer.MIN_VALUE;
                Object obj = socketMessagesSource$waitUntilRunning$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = socketMessagesSource$waitUntilRunning$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (isRunningFlow().getValue().booleanValue()) {
                        return Unit.INSTANCE;
                    }
                    socketMessagesSource$waitUntilRunning$1.label = 1;
                    if (FlowKt.first(isRunningFlow(), new SocketMessagesSource$waitUntilRunning$2(null), socketMessagesSource$waitUntilRunning$1) == coroutine_suspended) {
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
                socketMessagesSource$waitUntilRunning$1.label = 2;
                if (DelayKt.delay(1000L, socketMessagesSource$waitUntilRunning$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
        }
        socketMessagesSource$waitUntilRunning$1 = new SocketMessagesSource$waitUntilRunning$1(this, continuation);
        Object obj2 = socketMessagesSource$waitUntilRunning$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = socketMessagesSource$waitUntilRunning$1.label;
        if (i != 0) {
        }
        socketMessagesSource$waitUntilRunning$1.label = 2;
        if (DelayKt.delay(1000L, socketMessagesSource$waitUntilRunning$1) == coroutine_suspended) {
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void internalStart() {
        BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, this.coroutineDispatchers.getIO().plus(this.coroutineExceptionHandler), null, new SocketMessagesSource$internalStart$1(this, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logMessageReceived(String str) {
        this.logger.info("Socket message received", TAG);
    }
}
