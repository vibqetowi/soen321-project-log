package com.ifriend.chat.data.chat.sending;

import androidx.exifinterface.media.ExifInterface;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.internal.NativeProtocol;
import com.facebook.share.internal.ShareConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.internal.LinkedTreeMap;
import com.ifriend.chat.data.chat.sending.SendFileResult;
import com.ifriend.common_utils.Logger;
import com.ifriend.core.tools.api.DispatcherProvider;
import com.ifriend.data.common.CoreExecuteCatching;
import com.ifriend.data.networking.api.chatgifts.models.request.SendChatGiftsRemoteParams;
import com.ifriend.data.networking.datasources.chat.ChatMessagesRemoteDataSource;
import com.ifriend.data.networking.datasources.chat.models.request.ChatFileType;
import com.ifriend.data.networking.datasources.chat.models.response.client.ChatMessageRemote;
import com.ifriend.data.repository.chat.messages.mappers.ChatMessageMapper;
import com.ifriend.domain.data.AuthDataProvider;
import com.ifriend.domain.models.profile.user.AuthData;
import com.ifriend.domain.newChat.chat.models.ChatMessage;
import com.ifriend.domain.newChat.chat.models.MessageTag;
import com.ifriend.domain.newChat.chat.models.MessageToSend;
import com.ifriend.domain.newChat.chat.systems.messages.sending.send.ChatMessagesRepository;
import com.ifriend.domain.newChat.chat.systems.messages.sending.send.SendingMessagesQueue;
import com.ifriend.domain.newChat.chat.systems.messages.sending.send.result.GlobalSendingMessageResultPublisher;
import com.ifriend.domain.socket.MessagesSource;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import retrofit2.Response;
/* compiled from: ChatMessagesRepositoryImpl.kt */
@Metadata(d1 = {"\u0000â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003BW\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0003¢\u0006\u0002\u0010\u0017J!\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001dH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u001fJ%\u0010 \u001a\u0002H!\"\u0004\b\u0000\u0010!2\f\u0010\"\u001a\b\u0012\u0004\u0012\u0002H!0#H\u0096Aø\u0001\u0000¢\u0006\u0002\u0010$J@\u0010 \u001a\u0002H!\"\u0004\b\u0000\u0010!2'\u0010\"\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u0002H!0&\u0012\u0006\u0012\u0004\u0018\u00010'0%¢\u0006\u0002\b(H\u0096Aø\u0001\u0000¢\u0006\u0002\u0010)J/\u0010*\u001a\b\u0012\u0004\u0012\u00020,0+2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020.2\u0006\u0010\u001e\u001a\u00020\u001dH\u0096@ø\u0001\u0000¢\u0006\u0002\u00100J\u0019\u00101\u001a\u0002022\u0006\u0010\u001e\u001a\u00020\u001dH\u0096@ø\u0001\u0000¢\u0006\u0002\u00103J)\u00104\u001a\u0002022\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u0002082\u0006\u0010\u001e\u001a\u00020\u001dH\u0082@ø\u0001\u0000¢\u0006\u0002\u00109J\u0010\u0010:\u001a\u00020\u001b2\u0006\u0010;\u001a\u00020<H\u0016J!\u0010=\u001a\u0002022\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001dH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u001fJ!\u0010>\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001dH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u001fJ)\u0010?\u001a\u00020@2\u0006\u0010;\u001a\u00020A2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u00107\u001a\u000208H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010BJ)\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020F2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010G\u001a\u00020\u001dH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010HJ)\u0010I\u001a\u00020@2\u0006\u0010;\u001a\u00020J2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u00107\u001a\u000208H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010KJ)\u0010L\u001a\u00020@2\u0006\u0010;\u001a\u00020M2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u00107\u001a\u000208H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010NJ)\u0010O\u001a\u00020\u001b2\u0006\u0010P\u001a\u00020Q2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u00107\u001a\u000208H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010RJ!\u0010S\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010P\u001a\u00020QH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010TJ\u0011\u0010U\u001a\u00020\u001bH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010VJ\u0019\u0010W\u001a\u00020\u001b2\u0006\u0010;\u001a\u00020<H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010XJ)\u0010Y\u001a\u00020@2\u0006\u0010Z\u001a\u00020[2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u00107\u001a\u000208H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\\J)\u0010]\u001a\u00020@2\u0006\u0010;\u001a\u00020A2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u00107\u001a\u000208H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010BJ)\u0010^\u001a\u00020@2\u0006\u0010;\u001a\u00020M2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u00107\u001a\u000208H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010NR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006_"}, d2 = {"Lcom/ifriend/chat/data/chat/sending/ChatMessagesRepositoryImpl;", "Lcom/ifriend/domain/newChat/chat/systems/messages/sending/send/ChatMessagesRepository;", "Lcom/ifriend/domain/newChat/chat/systems/messages/sending/send/SendingMessagesQueue$Listener;", "Lcom/ifriend/data/common/CoreExecuteCatching;", "chatMessagesRemoteDataSource", "Lcom/ifriend/data/networking/datasources/chat/ChatMessagesRemoteDataSource;", "logger", "Lcom/ifriend/common_utils/Logger;", "authProvider", "Lcom/ifriend/domain/data/AuthDataProvider;", "chatMessageMapper", "Lcom/ifriend/data/repository/chat/messages/mappers/ChatMessageMapper;", "queue", "Lcom/ifriend/domain/newChat/chat/systems/messages/sending/send/SendingMessagesQueue;", "errorPublisher", "Lcom/ifriend/domain/newChat/chat/systems/messages/sending/send/result/GlobalSendingMessageResultPublisher;", "messagesSource", "Lcom/ifriend/domain/socket/MessagesSource;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "dispatcherProvider", "Lcom/ifriend/core/tools/api/DispatcherProvider;", "coreExecuteCatching", "(Lcom/ifriend/data/networking/datasources/chat/ChatMessagesRemoteDataSource;Lcom/ifriend/common_utils/Logger;Lcom/ifriend/domain/data/AuthDataProvider;Lcom/ifriend/data/repository/chat/messages/mappers/ChatMessageMapper;Lcom/ifriend/domain/newChat/chat/systems/messages/sending/send/SendingMessagesQueue;Lcom/ifriend/domain/newChat/chat/systems/messages/sending/send/result/GlobalSendingMessageResultPublisher;Lcom/ifriend/domain/socket/MessagesSource;Lkotlinx/coroutines/CoroutineScope;Lcom/ifriend/core/tools/api/DispatcherProvider;Lcom/ifriend/data/common/CoreExecuteCatching;)V", "mutex", "Lkotlinx/coroutines/sync/Mutex;", "deleteMessages", "", "messageId", "", "chatId", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "executeInBackground", ExifInterface.GPS_DIRECTION_TRUE, NativeProtocol.WEB_DIALOG_ACTION, "Lkotlin/reflect/KSuspendFunction0;", "(Lkotlin/reflect/KFunction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMessages", "", "Lcom/ifriend/domain/newChat/chat/models/ChatMessage;", "omit", "", "count", "(IILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "initFirstChat", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isApplyFile", "sendFileResult", "Lcom/ifriend/chat/data/chat/sending/SendFileResult$Success;", ViewHierarchyConstants.TAG_KEY, "Lcom/ifriend/domain/newChat/chat/models/MessageTag;", "(Lcom/ifriend/chat/data/chat/sending/SendFileResult$Success;Lcom/ifriend/domain/newChat/chat/models/MessageTag;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onNewMessageAdded", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "Lcom/ifriend/domain/newChat/chat/systems/messages/sending/send/SendingMessagesQueue$QueuedMessage;", "readMessage", "regenerateNewAnswer", "sendAudio", "Lcom/ifriend/domain/newChat/chat/models/MessageToSend$SendingResult;", "Lcom/ifriend/domain/newChat/chat/models/MessageToSend$Audio;", "(Lcom/ifriend/domain/newChat/chat/models/MessageToSend$Audio;Ljava/lang/String;Lcom/ifriend/domain/newChat/chat/models/MessageTag;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendFile", "Lcom/ifriend/chat/data/chat/sending/SendFileResult;", "fileToUpload", "Ljava/io/File;", "mediaType", "(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendGiftMessage", "Lcom/ifriend/domain/newChat/chat/models/MessageToSend$Gift;", "(Lcom/ifriend/domain/newChat/chat/models/MessageToSend$Gift;Ljava/lang/String;Lcom/ifriend/domain/newChat/chat/models/MessageTag;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendImage", "Lcom/ifriend/domain/newChat/chat/models/MessageToSend$Image;", "(Lcom/ifriend/domain/newChat/chat/models/MessageToSend$Image;Ljava/lang/String;Lcom/ifriend/domain/newChat/chat/models/MessageTag;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendMessage", "messageToSend", "Lcom/ifriend/domain/newChat/chat/models/MessageToSend;", "(Lcom/ifriend/domain/newChat/chat/models/MessageToSend;Ljava/lang/String;Lcom/ifriend/domain/newChat/chat/models/MessageTag;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendMessages", "(Ljava/lang/String;Lcom/ifriend/domain/newChat/chat/models/MessageToSend;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendNextMessageFromQueueIfExist", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendQueuedMessage", "(Lcom/ifriend/domain/newChat/chat/systems/messages/sending/send/SendingMessagesQueue$QueuedMessage;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendTextMessage", FirebaseAnalytics.Param.CONTENT, "Lcom/ifriend/domain/newChat/chat/models/MessageToSend$Text;", "(Lcom/ifriend/domain/newChat/chat/models/MessageToSend$Text;Ljava/lang/String;Lcom/ifriend/domain/newChat/chat/models/MessageTag;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "uploadAudio", "uploadImage", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatMessagesRepositoryImpl implements ChatMessagesRepository, SendingMessagesQueue.Listener, CoreExecuteCatching {
    private final AuthDataProvider authProvider;
    private final ChatMessageMapper chatMessageMapper;
    private final ChatMessagesRemoteDataSource chatMessagesRemoteDataSource;
    private final CoreExecuteCatching coreExecuteCatching;
    private final DispatcherProvider dispatcherProvider;
    private final GlobalSendingMessageResultPublisher errorPublisher;
    private final Logger logger;
    private final MessagesSource messagesSource;
    private Mutex mutex;
    private final SendingMessagesQueue queue;
    private final CoroutineScope scope;

    @Override // com.ifriend.data.common.CoreExecuteCatching
    public <T> Object executeInBackground(Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super T> continuation) {
        return this.coreExecuteCatching.executeInBackground(function2, continuation);
    }

    @Override // com.ifriend.data.common.CoreExecuteCatching
    public <T> Object executeInBackground(KFunction<? extends T> kFunction, Continuation<? super T> continuation) {
        return this.coreExecuteCatching.executeInBackground(kFunction, continuation);
    }

    @Inject
    public ChatMessagesRepositoryImpl(ChatMessagesRemoteDataSource chatMessagesRemoteDataSource, Logger logger, AuthDataProvider authProvider, ChatMessageMapper chatMessageMapper, SendingMessagesQueue queue, GlobalSendingMessageResultPublisher errorPublisher, MessagesSource messagesSource, CoroutineScope scope, DispatcherProvider dispatcherProvider, CoreExecuteCatching coreExecuteCatching) {
        Intrinsics.checkNotNullParameter(chatMessagesRemoteDataSource, "chatMessagesRemoteDataSource");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(authProvider, "authProvider");
        Intrinsics.checkNotNullParameter(chatMessageMapper, "chatMessageMapper");
        Intrinsics.checkNotNullParameter(queue, "queue");
        Intrinsics.checkNotNullParameter(errorPublisher, "errorPublisher");
        Intrinsics.checkNotNullParameter(messagesSource, "messagesSource");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
        Intrinsics.checkNotNullParameter(coreExecuteCatching, "coreExecuteCatching");
        this.chatMessagesRemoteDataSource = chatMessagesRemoteDataSource;
        this.logger = logger;
        this.authProvider = authProvider;
        this.chatMessageMapper = chatMessageMapper;
        this.queue = queue;
        this.errorPublisher = errorPublisher;
        this.messagesSource = messagesSource;
        this.scope = scope;
        this.dispatcherProvider = dispatcherProvider;
        this.coreExecuteCatching = coreExecuteCatching;
        this.mutex = MutexKt.Mutex$default(false, 1, null);
        queue.addListener(this);
    }

    @Override // com.ifriend.domain.newChat.chat.systems.messages.sending.send.SendingMessagesQueue.Listener
    public void onMessageRemoved(SendingMessagesQueue.QueuedMessage queuedMessage) {
        SendingMessagesQueue.Listener.DefaultImpls.onMessageRemoved(this, queuedMessage);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    @Override // com.ifriend.domain.newChat.chat.systems.messages.sending.send.ChatMessagesRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object initFirstChat(String str, Continuation<? super Boolean> continuation) {
        ChatMessagesRepositoryImpl$initFirstChat$1 chatMessagesRepositoryImpl$initFirstChat$1;
        int i;
        ChatMessagesRepositoryImpl chatMessagesRepositoryImpl;
        boolean z;
        if (continuation instanceof ChatMessagesRepositoryImpl$initFirstChat$1) {
            chatMessagesRepositoryImpl$initFirstChat$1 = (ChatMessagesRepositoryImpl$initFirstChat$1) continuation;
            if ((chatMessagesRepositoryImpl$initFirstChat$1.label & Integer.MIN_VALUE) != 0) {
                chatMessagesRepositoryImpl$initFirstChat$1.label -= Integer.MIN_VALUE;
                Object obj = chatMessagesRepositoryImpl$initFirstChat$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = chatMessagesRepositoryImpl$initFirstChat$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    try {
                        ChatMessagesRemoteDataSource chatMessagesRemoteDataSource = this.chatMessagesRemoteDataSource;
                        String convertToDBID = SimpleIdentityConverter.Companion.convertToDBID(str);
                        chatMessagesRepositoryImpl$initFirstChat$1.L$0 = this;
                        chatMessagesRepositoryImpl$initFirstChat$1.label = 1;
                        obj = chatMessagesRemoteDataSource.initFirstChat(convertToDBID, chatMessagesRepositoryImpl$initFirstChat$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } catch (Exception e) {
                        e = e;
                        chatMessagesRepositoryImpl = this;
                        chatMessagesRepositoryImpl.logger.logException(e);
                        z = false;
                        return Boxing.boxBoolean(z);
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    chatMessagesRepositoryImpl = (ChatMessagesRepositoryImpl) chatMessagesRepositoryImpl$initFirstChat$1.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (Exception e2) {
                        e = e2;
                        chatMessagesRepositoryImpl.logger.logException(e);
                        z = false;
                        return Boxing.boxBoolean(z);
                    }
                }
                z = ((Boolean) obj).booleanValue();
                return Boxing.boxBoolean(z);
            }
        }
        chatMessagesRepositoryImpl$initFirstChat$1 = new ChatMessagesRepositoryImpl$initFirstChat$1(this, continuation);
        Object obj2 = chatMessagesRepositoryImpl$initFirstChat$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = chatMessagesRepositoryImpl$initFirstChat$1.label;
        if (i != 0) {
        }
        z = ((Boolean) obj2).booleanValue();
        return Boxing.boxBoolean(z);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0084 -> B:26:0x0087). Please submit an issue!!! */
    @Override // com.ifriend.domain.newChat.chat.systems.messages.sending.send.ChatMessagesRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getMessages(int i, int i2, String str, Continuation<? super List<ChatMessage>> continuation) {
        ChatMessagesRepositoryImpl$getMessages$1 chatMessagesRepositoryImpl$getMessages$1;
        int i3;
        ChatMessagesRepositoryImpl chatMessagesRepositoryImpl;
        ArrayList arrayList;
        ChatMessagesRepositoryImpl chatMessagesRepositoryImpl2;
        Iterator it;
        if (continuation instanceof ChatMessagesRepositoryImpl$getMessages$1) {
            chatMessagesRepositoryImpl$getMessages$1 = (ChatMessagesRepositoryImpl$getMessages$1) continuation;
            if ((chatMessagesRepositoryImpl$getMessages$1.label & Integer.MIN_VALUE) != 0) {
                chatMessagesRepositoryImpl$getMessages$1.label -= Integer.MIN_VALUE;
                Object obj = chatMessagesRepositoryImpl$getMessages$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i3 = chatMessagesRepositoryImpl$getMessages$1.label;
                if (i3 != 0) {
                    ResultKt.throwOnFailure(obj);
                    ChatMessagesRemoteDataSource chatMessagesRemoteDataSource = this.chatMessagesRemoteDataSource;
                    chatMessagesRepositoryImpl$getMessages$1.L$0 = this;
                    chatMessagesRepositoryImpl$getMessages$1.label = 1;
                    obj = chatMessagesRemoteDataSource.getMessages(i, i2, str, chatMessagesRepositoryImpl$getMessages$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    chatMessagesRepositoryImpl = this;
                } else if (i3 == 1) {
                    chatMessagesRepositoryImpl = (ChatMessagesRepositoryImpl) chatMessagesRepositoryImpl$getMessages$1.L$0;
                    ResultKt.throwOnFailure(obj);
                } else if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    it = (Iterator) chatMessagesRepositoryImpl$getMessages$1.L$2;
                    arrayList = (Collection) chatMessagesRepositoryImpl$getMessages$1.L$1;
                    chatMessagesRepositoryImpl2 = (ChatMessagesRepositoryImpl) chatMessagesRepositoryImpl$getMessages$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    ChatMessage chatMessage = (ChatMessage) obj;
                    if (chatMessage != null) {
                        arrayList.add(chatMessage);
                    }
                    if (!it.hasNext()) {
                        ChatMessageMapper chatMessageMapper = chatMessagesRepositoryImpl2.chatMessageMapper;
                        chatMessagesRepositoryImpl$getMessages$1.L$0 = chatMessagesRepositoryImpl2;
                        chatMessagesRepositoryImpl$getMessages$1.L$1 = arrayList;
                        chatMessagesRepositoryImpl$getMessages$1.L$2 = it;
                        chatMessagesRepositoryImpl$getMessages$1.label = 2;
                        obj = chatMessageMapper.map((ChatMessageRemote) it.next(), (Continuation<? super ChatMessage>) chatMessagesRepositoryImpl$getMessages$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        ChatMessage chatMessage2 = (ChatMessage) obj;
                        if (chatMessage2 != null) {
                        }
                        if (!it.hasNext()) {
                            return (List) arrayList;
                        }
                    }
                }
                arrayList = new ArrayList();
                chatMessagesRepositoryImpl2 = chatMessagesRepositoryImpl;
                it = ((Iterable) obj).iterator();
                if (!it.hasNext()) {
                }
            }
        }
        chatMessagesRepositoryImpl$getMessages$1 = new ChatMessagesRepositoryImpl$getMessages$1(this, continuation);
        Object obj2 = chatMessagesRepositoryImpl$getMessages$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i3 = chatMessagesRepositoryImpl$getMessages$1.label;
        if (i3 != 0) {
        }
        arrayList = new ArrayList();
        chatMessagesRepositoryImpl2 = chatMessagesRepositoryImpl;
        it = ((Iterable) obj2).iterator();
        if (!it.hasNext()) {
        }
    }

    @Override // com.ifriend.domain.newChat.chat.systems.messages.sending.send.SendingMessagesQueue.Listener
    public void onNewMessageAdded(SendingMessagesQueue.QueuedMessage message) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (this.mutex.isLocked()) {
            return;
        }
        BuildersKt.launch$default(this.scope, this.dispatcherProvider.background(), null, new ChatMessagesRepositoryImpl$onNewMessageAdded$1(this, message, null), 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    @Override // com.ifriend.domain.newChat.chat.systems.messages.sending.send.ChatMessagesRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object readMessage(String str, String str2, Continuation<? super Boolean> continuation) {
        ChatMessagesRepositoryImpl$readMessage$1 chatMessagesRepositoryImpl$readMessage$1;
        int i;
        ChatMessagesRepositoryImpl chatMessagesRepositoryImpl;
        if (continuation instanceof ChatMessagesRepositoryImpl$readMessage$1) {
            chatMessagesRepositoryImpl$readMessage$1 = (ChatMessagesRepositoryImpl$readMessage$1) continuation;
            if ((chatMessagesRepositoryImpl$readMessage$1.label & Integer.MIN_VALUE) != 0) {
                chatMessagesRepositoryImpl$readMessage$1.label -= Integer.MIN_VALUE;
                Object obj = chatMessagesRepositoryImpl$readMessage$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = chatMessagesRepositoryImpl$readMessage$1.label;
                boolean z = false;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (this.authProvider.sessionAuthData().getValue() == null) {
                        return Boxing.boxBoolean(false);
                    }
                    try {
                        ChatMessagesRemoteDataSource chatMessagesRemoteDataSource = this.chatMessagesRemoteDataSource;
                        chatMessagesRepositoryImpl$readMessage$1.L$0 = this;
                        chatMessagesRepositoryImpl$readMessage$1.L$1 = str;
                        chatMessagesRepositoryImpl$readMessage$1.label = 1;
                        if (chatMessagesRemoteDataSource.readMessages(str, str2, chatMessagesRepositoryImpl$readMessage$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        chatMessagesRepositoryImpl = this;
                    } catch (Exception unused) {
                        chatMessagesRepositoryImpl = this;
                        Logger.DefaultImpls.error$default(chatMessagesRepositoryImpl.logger, "Error while reading message " + str, null, 2, null);
                        return Boxing.boxBoolean(z);
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    str = (String) chatMessagesRepositoryImpl$readMessage$1.L$1;
                    chatMessagesRepositoryImpl = (ChatMessagesRepositoryImpl) chatMessagesRepositoryImpl$readMessage$1.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (Exception unused2) {
                        Logger.DefaultImpls.error$default(chatMessagesRepositoryImpl.logger, "Error while reading message " + str, null, 2, null);
                        return Boxing.boxBoolean(z);
                    }
                }
                chatMessagesRepositoryImpl.logger.log("Message " + str + " is read");
                z = true;
                return Boxing.boxBoolean(z);
            }
        }
        chatMessagesRepositoryImpl$readMessage$1 = new ChatMessagesRepositoryImpl$readMessage$1(this, continuation);
        Object obj2 = chatMessagesRepositoryImpl$readMessage$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = chatMessagesRepositoryImpl$readMessage$1.label;
        boolean z2 = false;
        if (i != 0) {
        }
        chatMessagesRepositoryImpl.logger.log("Message " + str + " is read");
        z2 = true;
        return Boxing.boxBoolean(z2);
    }

    @Override // com.ifriend.domain.newChat.chat.systems.messages.sending.send.ChatMessagesRepository
    public Object deleteMessages(String str, String str2, Continuation<? super Unit> continuation) {
        Object executeInBackground = executeInBackground(new ChatMessagesRepositoryImpl$deleteMessages$2(this, str, str2, null), continuation);
        return executeInBackground == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? executeInBackground : Unit.INSTANCE;
    }

    @Override // com.ifriend.domain.newChat.chat.systems.messages.sending.send.ChatMessagesRepository
    public Object regenerateNewAnswer(String str, String str2, Continuation<? super Unit> continuation) {
        Object executeInBackground = executeInBackground(new ChatMessagesRepositoryImpl$regenerateNewAnswer$2(this, str, str2, null), continuation);
        return executeInBackground == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? executeInBackground : Unit.INSTANCE;
    }

    @Override // com.ifriend.domain.newChat.chat.systems.messages.sending.send.ChatMessagesRepository
    public Object sendMessages(String str, MessageToSend messageToSend, Continuation<? super Unit> continuation) {
        BuildersKt.launch$default(this.scope, this.dispatcherProvider.background(), null, new ChatMessagesRepositoryImpl$sendMessages$2(this, messageToSend, str, null), 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0083 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object sendQueuedMessage(SendingMessagesQueue.QueuedMessage queuedMessage, Continuation<? super Unit> continuation) {
        ChatMessagesRepositoryImpl$sendQueuedMessage$1 chatMessagesRepositoryImpl$sendQueuedMessage$1;
        Object coroutine_suspended;
        int i;
        Mutex mutex;
        ChatMessagesRepositoryImpl chatMessagesRepositoryImpl;
        Throwable th;
        Mutex mutex2;
        ChatMessagesRepositoryImpl chatMessagesRepositoryImpl2;
        try {
            if (continuation instanceof ChatMessagesRepositoryImpl$sendQueuedMessage$1) {
                chatMessagesRepositoryImpl$sendQueuedMessage$1 = (ChatMessagesRepositoryImpl$sendQueuedMessage$1) continuation;
                if ((chatMessagesRepositoryImpl$sendQueuedMessage$1.label & Integer.MIN_VALUE) != 0) {
                    chatMessagesRepositoryImpl$sendQueuedMessage$1.label -= Integer.MIN_VALUE;
                    Object obj = chatMessagesRepositoryImpl$sendQueuedMessage$1.result;
                    coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = chatMessagesRepositoryImpl$sendQueuedMessage$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        mutex = this.mutex;
                        chatMessagesRepositoryImpl$sendQueuedMessage$1.L$0 = this;
                        chatMessagesRepositoryImpl$sendQueuedMessage$1.L$1 = queuedMessage;
                        chatMessagesRepositoryImpl$sendQueuedMessage$1.L$2 = mutex;
                        chatMessagesRepositoryImpl$sendQueuedMessage$1.label = 1;
                        if (mutex.lock(null, chatMessagesRepositoryImpl$sendQueuedMessage$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        chatMessagesRepositoryImpl = this;
                    } else if (i != 1) {
                        if (i == 2) {
                            mutex2 = (Mutex) chatMessagesRepositoryImpl$sendQueuedMessage$1.L$1;
                            chatMessagesRepositoryImpl2 = (ChatMessagesRepositoryImpl) chatMessagesRepositoryImpl$sendQueuedMessage$1.L$0;
                            try {
                                ResultKt.throwOnFailure(obj);
                                Unit unit = Unit.INSTANCE;
                                mutex2.unlock(null);
                                BuildersKt.launch$default(chatMessagesRepositoryImpl2.scope, chatMessagesRepositoryImpl2.dispatcherProvider.background(), null, new ChatMessagesRepositoryImpl$sendQueuedMessage$3(chatMessagesRepositoryImpl2, null), 2, null);
                                return Unit.INSTANCE;
                            } catch (Throwable th2) {
                                th = th2;
                                mutex2.unlock(null);
                                throw th;
                            }
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        chatMessagesRepositoryImpl = (ChatMessagesRepositoryImpl) chatMessagesRepositoryImpl$sendQueuedMessage$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        mutex = (Mutex) chatMessagesRepositoryImpl$sendQueuedMessage$1.L$2;
                        queuedMessage = (SendingMessagesQueue.QueuedMessage) chatMessagesRepositoryImpl$sendQueuedMessage$1.L$1;
                    }
                    chatMessagesRepositoryImpl$sendQueuedMessage$1.L$0 = chatMessagesRepositoryImpl;
                    chatMessagesRepositoryImpl$sendQueuedMessage$1.L$1 = mutex;
                    chatMessagesRepositoryImpl$sendQueuedMessage$1.L$2 = null;
                    chatMessagesRepositoryImpl$sendQueuedMessage$1.label = 2;
                    if (BuildersKt.withContext(chatMessagesRepositoryImpl.dispatcherProvider.background(), new ChatMessagesRepositoryImpl$sendQueuedMessage$2$1(chatMessagesRepositoryImpl, queuedMessage, null), chatMessagesRepositoryImpl$sendQueuedMessage$1) != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    mutex2 = mutex;
                    chatMessagesRepositoryImpl2 = chatMessagesRepositoryImpl;
                    Unit unit2 = Unit.INSTANCE;
                    mutex2.unlock(null);
                    BuildersKt.launch$default(chatMessagesRepositoryImpl2.scope, chatMessagesRepositoryImpl2.dispatcherProvider.background(), null, new ChatMessagesRepositoryImpl$sendQueuedMessage$3(chatMessagesRepositoryImpl2, null), 2, null);
                    return Unit.INSTANCE;
                }
            }
            chatMessagesRepositoryImpl$sendQueuedMessage$1.L$0 = chatMessagesRepositoryImpl;
            chatMessagesRepositoryImpl$sendQueuedMessage$1.L$1 = mutex;
            chatMessagesRepositoryImpl$sendQueuedMessage$1.L$2 = null;
            chatMessagesRepositoryImpl$sendQueuedMessage$1.label = 2;
            if (BuildersKt.withContext(chatMessagesRepositoryImpl.dispatcherProvider.background(), new ChatMessagesRepositoryImpl$sendQueuedMessage$2$1(chatMessagesRepositoryImpl, queuedMessage, null), chatMessagesRepositoryImpl$sendQueuedMessage$1) != coroutine_suspended) {
            }
        } catch (Throwable th3) {
            Mutex mutex3 = mutex;
            th = th3;
            mutex2 = mutex3;
            mutex2.unlock(null);
            throw th;
        }
        chatMessagesRepositoryImpl$sendQueuedMessage$1 = new ChatMessagesRepositoryImpl$sendQueuedMessage$1(this, continuation);
        Object obj2 = chatMessagesRepositoryImpl$sendQueuedMessage$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = chatMessagesRepositoryImpl$sendQueuedMessage$1.label;
        if (i != 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object sendNextMessageFromQueueIfExist(Continuation<? super Unit> continuation) {
        ChatMessagesRepositoryImpl$sendNextMessageFromQueueIfExist$1 chatMessagesRepositoryImpl$sendNextMessageFromQueueIfExist$1;
        int i;
        ChatMessagesRepositoryImpl chatMessagesRepositoryImpl;
        SendingMessagesQueue.QueuedMessage queuedMessage;
        if (continuation instanceof ChatMessagesRepositoryImpl$sendNextMessageFromQueueIfExist$1) {
            chatMessagesRepositoryImpl$sendNextMessageFromQueueIfExist$1 = (ChatMessagesRepositoryImpl$sendNextMessageFromQueueIfExist$1) continuation;
            if ((chatMessagesRepositoryImpl$sendNextMessageFromQueueIfExist$1.label & Integer.MIN_VALUE) != 0) {
                chatMessagesRepositoryImpl$sendNextMessageFromQueueIfExist$1.label -= Integer.MIN_VALUE;
                Object obj = chatMessagesRepositoryImpl$sendNextMessageFromQueueIfExist$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = chatMessagesRepositoryImpl$sendNextMessageFromQueueIfExist$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (!this.mutex.isLocked()) {
                        SendingMessagesQueue sendingMessagesQueue = this.queue;
                        chatMessagesRepositoryImpl$sendNextMessageFromQueueIfExist$1.L$0 = this;
                        chatMessagesRepositoryImpl$sendNextMessageFromQueueIfExist$1.label = 1;
                        obj = sendingMessagesQueue.getAll(chatMessagesRepositoryImpl$sendNextMessageFromQueueIfExist$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        chatMessagesRepositoryImpl = this;
                        queuedMessage = (SendingMessagesQueue.QueuedMessage) CollectionsKt.firstOrNull((List<? extends Object>) obj);
                        if (queuedMessage != null) {
                        }
                    }
                } else if (i == 1) {
                    chatMessagesRepositoryImpl = (ChatMessagesRepositoryImpl) chatMessagesRepositoryImpl$sendNextMessageFromQueueIfExist$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    queuedMessage = (SendingMessagesQueue.QueuedMessage) CollectionsKt.firstOrNull((List<? extends Object>) obj);
                    if (queuedMessage != null) {
                        chatMessagesRepositoryImpl$sendNextMessageFromQueueIfExist$1.L$0 = null;
                        chatMessagesRepositoryImpl$sendNextMessageFromQueueIfExist$1.label = 2;
                        if (chatMessagesRepositoryImpl.sendQueuedMessage(queuedMessage, chatMessagesRepositoryImpl$sendNextMessageFromQueueIfExist$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } else if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }
        chatMessagesRepositoryImpl$sendNextMessageFromQueueIfExist$1 = new ChatMessagesRepositoryImpl$sendNextMessageFromQueueIfExist$1(this, continuation);
        Object obj2 = chatMessagesRepositoryImpl$sendNextMessageFromQueueIfExist$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = chatMessagesRepositoryImpl$sendNextMessageFromQueueIfExist$1.label;
        if (i != 0) {
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object sendMessage(MessageToSend messageToSend, String str, MessageTag messageTag, Continuation<? super Unit> continuation) {
        ChatMessagesRepositoryImpl$sendMessage$1 chatMessagesRepositoryImpl$sendMessage$1;
        int i;
        ChatMessagesRepositoryImpl chatMessagesRepositoryImpl;
        MessageToSend.SendingResult sendingResult;
        if (continuation instanceof ChatMessagesRepositoryImpl$sendMessage$1) {
            chatMessagesRepositoryImpl$sendMessage$1 = (ChatMessagesRepositoryImpl$sendMessage$1) continuation;
            if ((chatMessagesRepositoryImpl$sendMessage$1.label & Integer.MIN_VALUE) != 0) {
                chatMessagesRepositoryImpl$sendMessage$1.label -= Integer.MIN_VALUE;
                Object obj = chatMessagesRepositoryImpl$sendMessage$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = chatMessagesRepositoryImpl$sendMessage$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (messageToSend instanceof MessageToSend.Audio) {
                        chatMessagesRepositoryImpl$sendMessage$1.L$0 = this;
                        chatMessagesRepositoryImpl$sendMessage$1.label = 1;
                        obj = sendAudio((MessageToSend.Audio) messageToSend, str, messageTag, chatMessagesRepositoryImpl$sendMessage$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        chatMessagesRepositoryImpl = this;
                        sendingResult = (MessageToSend.SendingResult) obj;
                    } else if (messageToSend instanceof MessageToSend.Image) {
                        chatMessagesRepositoryImpl$sendMessage$1.L$0 = this;
                        chatMessagesRepositoryImpl$sendMessage$1.label = 2;
                        obj = sendImage((MessageToSend.Image) messageToSend, str, messageTag, chatMessagesRepositoryImpl$sendMessage$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        chatMessagesRepositoryImpl = this;
                        sendingResult = (MessageToSend.SendingResult) obj;
                    } else if (messageToSend instanceof MessageToSend.Text) {
                        chatMessagesRepositoryImpl$sendMessage$1.L$0 = this;
                        chatMessagesRepositoryImpl$sendMessage$1.label = 3;
                        obj = sendTextMessage((MessageToSend.Text) messageToSend, str, messageTag, chatMessagesRepositoryImpl$sendMessage$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        chatMessagesRepositoryImpl = this;
                        sendingResult = (MessageToSend.SendingResult) obj;
                    } else if (messageToSend instanceof MessageToSend.Gift) {
                        chatMessagesRepositoryImpl$sendMessage$1.L$0 = this;
                        chatMessagesRepositoryImpl$sendMessage$1.label = 4;
                        obj = sendGiftMessage((MessageToSend.Gift) messageToSend, str, messageTag, chatMessagesRepositoryImpl$sendMessage$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        chatMessagesRepositoryImpl = this;
                        sendingResult = (MessageToSend.SendingResult) obj;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                } else if (i == 1) {
                    chatMessagesRepositoryImpl = (ChatMessagesRepositoryImpl) chatMessagesRepositoryImpl$sendMessage$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    sendingResult = (MessageToSend.SendingResult) obj;
                } else if (i == 2) {
                    chatMessagesRepositoryImpl = (ChatMessagesRepositoryImpl) chatMessagesRepositoryImpl$sendMessage$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    sendingResult = (MessageToSend.SendingResult) obj;
                } else if (i == 3) {
                    chatMessagesRepositoryImpl = (ChatMessagesRepositoryImpl) chatMessagesRepositoryImpl$sendMessage$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    sendingResult = (MessageToSend.SendingResult) obj;
                } else if (i != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    chatMessagesRepositoryImpl = (ChatMessagesRepositoryImpl) chatMessagesRepositoryImpl$sendMessage$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    sendingResult = (MessageToSend.SendingResult) obj;
                }
                chatMessagesRepositoryImpl.errorPublisher.post(sendingResult);
                return Unit.INSTANCE;
            }
        }
        chatMessagesRepositoryImpl$sendMessage$1 = new ChatMessagesRepositoryImpl$sendMessage$1(this, continuation);
        Object obj2 = chatMessagesRepositoryImpl$sendMessage$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = chatMessagesRepositoryImpl$sendMessage$1.label;
        if (i != 0) {
        }
        chatMessagesRepositoryImpl.errorPublisher.post(sendingResult);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object sendGiftMessage(MessageToSend.Gift gift, String str, MessageTag messageTag, Continuation<? super MessageToSend.SendingResult> continuation) {
        ChatMessagesRepositoryImpl$sendGiftMessage$1 chatMessagesRepositoryImpl$sendGiftMessage$1;
        int i;
        String str2;
        MessageTag messageTag2;
        ChatMessagesRepositoryImpl chatMessagesRepositoryImpl;
        ChatMessagesRemoteDataSource chatMessagesRemoteDataSource;
        String chatId;
        String userId;
        SendChatGiftsRemoteParams sendChatGiftsRemoteParams;
        String str3;
        MessageTag messageTag3;
        if (continuation instanceof ChatMessagesRepositoryImpl$sendGiftMessage$1) {
            chatMessagesRepositoryImpl$sendGiftMessage$1 = (ChatMessagesRepositoryImpl$sendGiftMessage$1) continuation;
            if ((chatMessagesRepositoryImpl$sendGiftMessage$1.label & Integer.MIN_VALUE) != 0) {
                chatMessagesRepositoryImpl$sendGiftMessage$1.label -= Integer.MIN_VALUE;
                Object obj = chatMessagesRepositoryImpl$sendGiftMessage$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = chatMessagesRepositoryImpl$sendGiftMessage$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    try {
                        chatMessagesRemoteDataSource = this.chatMessagesRemoteDataSource;
                        chatId = gift.getChatId();
                        userId = gift.getUserId();
                        sendChatGiftsRemoteParams = new SendChatGiftsRemoteParams(messageTag.getValue(), null, 0, gift.getImageUrl(), new SendChatGiftsRemoteParams.Meta(gift.getGiftId()), 6, null);
                        chatMessagesRepositoryImpl$sendGiftMessage$1.L$0 = this;
                        str2 = str;
                    } catch (Exception e) {
                        e = e;
                        str2 = str;
                    }
                    try {
                        chatMessagesRepositoryImpl$sendGiftMessage$1.L$1 = str2;
                        messageTag2 = messageTag;
                    } catch (Exception e2) {
                        e = e2;
                        messageTag2 = messageTag;
                        chatMessagesRepositoryImpl = this;
                        chatMessagesRepositoryImpl.logger.logException(e);
                        return new MessageToSend.ErrorWhileSending(messageTag2, str2);
                    }
                    try {
                        chatMessagesRepositoryImpl$sendGiftMessage$1.L$2 = messageTag2;
                        chatMessagesRepositoryImpl$sendGiftMessage$1.label = 1;
                        if (chatMessagesRemoteDataSource.sendGift(userId, chatId, sendChatGiftsRemoteParams, chatMessagesRepositoryImpl$sendGiftMessage$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        chatMessagesRepositoryImpl = this;
                        str3 = str2;
                        messageTag3 = messageTag2;
                    } catch (Exception e3) {
                        e = e3;
                        chatMessagesRepositoryImpl = this;
                        chatMessagesRepositoryImpl.logger.logException(e);
                        return new MessageToSend.ErrorWhileSending(messageTag2, str2);
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    messageTag3 = (MessageTag) chatMessagesRepositoryImpl$sendGiftMessage$1.L$2;
                    str3 = (String) chatMessagesRepositoryImpl$sendGiftMessage$1.L$1;
                    chatMessagesRepositoryImpl = (ChatMessagesRepositoryImpl) chatMessagesRepositoryImpl$sendGiftMessage$1.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (Exception e4) {
                        e = e4;
                        messageTag2 = messageTag3;
                        str2 = str3;
                        chatMessagesRepositoryImpl.logger.logException(e);
                        return new MessageToSend.ErrorWhileSending(messageTag2, str2);
                    }
                }
                return new MessageToSend.SendingResult.Success(messageTag3, str3);
            }
        }
        chatMessagesRepositoryImpl$sendGiftMessage$1 = new ChatMessagesRepositoryImpl$sendGiftMessage$1(this, continuation);
        Object obj2 = chatMessagesRepositoryImpl$sendGiftMessage$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = chatMessagesRepositoryImpl$sendGiftMessage$1.label;
        if (i != 0) {
        }
        return new MessageToSend.SendingResult.Success(messageTag3, str3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0093 A[Catch: Exception -> 0x00a4, TryCatch #0 {Exception -> 0x00a4, blocks: (B:13:0x0031, B:30:0x0089, B:32:0x0093, B:33:0x009b), top: B:39:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009b A[Catch: Exception -> 0x00a4, TRY_LEAVE, TryCatch #0 {Exception -> 0x00a4, blocks: (B:13:0x0031, B:30:0x0089, B:32:0x0093, B:33:0x009b), top: B:39:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0074 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object sendTextMessage(MessageToSend.Text text, String str, MessageTag messageTag, Continuation<? super MessageToSend.SendingResult> continuation) {
        ChatMessagesRepositoryImpl$sendTextMessage$1 chatMessagesRepositoryImpl$sendTextMessage$1;
        Object obj;
        int i;
        ChatMessagesRepositoryImpl chatMessagesRepositoryImpl;
        MessageTag messageTag2;
        if (continuation instanceof ChatMessagesRepositoryImpl$sendTextMessage$1) {
            chatMessagesRepositoryImpl$sendTextMessage$1 = (ChatMessagesRepositoryImpl$sendTextMessage$1) continuation;
            if ((chatMessagesRepositoryImpl$sendTextMessage$1.label & Integer.MIN_VALUE) != 0) {
                chatMessagesRepositoryImpl$sendTextMessage$1.label -= Integer.MIN_VALUE;
                obj = chatMessagesRepositoryImpl$sendTextMessage$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = chatMessagesRepositoryImpl$sendTextMessage$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    AuthDataProvider authDataProvider = this.authProvider;
                    chatMessagesRepositoryImpl$sendTextMessage$1.L$0 = this;
                    chatMessagesRepositoryImpl$sendTextMessage$1.L$1 = text;
                    chatMessagesRepositoryImpl$sendTextMessage$1.L$2 = str;
                    chatMessagesRepositoryImpl$sendTextMessage$1.L$3 = messageTag;
                    chatMessagesRepositoryImpl$sendTextMessage$1.label = 1;
                    obj = authDataProvider.lastAuthData(chatMessagesRepositoryImpl$sendTextMessage$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    chatMessagesRepositoryImpl = this;
                } else if (i != 1) {
                    if (i == 2) {
                        messageTag2 = (MessageTag) chatMessagesRepositoryImpl$sendTextMessage$1.L$1;
                        str = (String) chatMessagesRepositoryImpl$sendTextMessage$1.L$0;
                        try {
                            ResultKt.throwOnFailure(obj);
                            if (((Response) obj).code() != 202) {
                                return new MessageToSend.SendingResult.Success(messageTag2, str);
                            }
                            return new MessageToSend.ErrorWhileSending(messageTag2, str);
                        } catch (Exception unused) {
                            return new MessageToSend.ErrorWhileSending(messageTag2, str);
                        }
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    messageTag = (MessageTag) chatMessagesRepositoryImpl$sendTextMessage$1.L$3;
                    str = (String) chatMessagesRepositoryImpl$sendTextMessage$1.L$2;
                    text = (MessageToSend.Text) chatMessagesRepositoryImpl$sendTextMessage$1.L$1;
                    chatMessagesRepositoryImpl = (ChatMessagesRepositoryImpl) chatMessagesRepositoryImpl$sendTextMessage$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                if (((AuthData) obj) != null) {
                    return new MessageToSend.UserIsNotAuthorizedError(messageTag, str);
                }
                try {
                    ChatMessagesRemoteDataSource chatMessagesRemoteDataSource = chatMessagesRepositoryImpl.chatMessagesRemoteDataSource;
                    chatMessagesRepositoryImpl$sendTextMessage$1.L$0 = str;
                    chatMessagesRepositoryImpl$sendTextMessage$1.L$1 = messageTag;
                    chatMessagesRepositoryImpl$sendTextMessage$1.L$2 = null;
                    chatMessagesRepositoryImpl$sendTextMessage$1.L$3 = null;
                    chatMessagesRepositoryImpl$sendTextMessage$1.label = 2;
                    obj = chatMessagesRemoteDataSource.sendText(str, messageTag, text, chatMessagesRepositoryImpl$sendTextMessage$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    messageTag2 = messageTag;
                    if (((Response) obj).code() != 202) {
                    }
                } catch (Exception unused2) {
                    messageTag2 = messageTag;
                    return new MessageToSend.ErrorWhileSending(messageTag2, str);
                }
            }
        }
        chatMessagesRepositoryImpl$sendTextMessage$1 = new ChatMessagesRepositoryImpl$sendTextMessage$1(this, continuation);
        obj = chatMessagesRepositoryImpl$sendTextMessage$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = chatMessagesRepositoryImpl$sendTextMessage$1.label;
        if (i != 0) {
        }
        if (((AuthData) obj) != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object sendImage(MessageToSend.Image image, String str, MessageTag messageTag, Continuation<? super MessageToSend.SendingResult> continuation) {
        ChatMessagesRepositoryImpl$sendImage$1 chatMessagesRepositoryImpl$sendImage$1;
        int i;
        ChatMessagesRepositoryImpl chatMessagesRepositoryImpl;
        if (continuation instanceof ChatMessagesRepositoryImpl$sendImage$1) {
            chatMessagesRepositoryImpl$sendImage$1 = (ChatMessagesRepositoryImpl$sendImage$1) continuation;
            if ((chatMessagesRepositoryImpl$sendImage$1.label & Integer.MIN_VALUE) != 0) {
                chatMessagesRepositoryImpl$sendImage$1.label -= Integer.MIN_VALUE;
                Object obj = chatMessagesRepositoryImpl$sendImage$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = chatMessagesRepositoryImpl$sendImage$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    try {
                        chatMessagesRepositoryImpl$sendImage$1.L$0 = this;
                        chatMessagesRepositoryImpl$sendImage$1.L$1 = str;
                        chatMessagesRepositoryImpl$sendImage$1.L$2 = messageTag;
                        chatMessagesRepositoryImpl$sendImage$1.label = 1;
                        obj = uploadImage(image, str, messageTag, chatMessagesRepositoryImpl$sendImage$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        chatMessagesRepositoryImpl = this;
                    } catch (Exception e) {
                        e = e;
                        chatMessagesRepositoryImpl = this;
                        chatMessagesRepositoryImpl.logger.logException(e);
                        return new MessageToSend.ErrorWhileSending(messageTag, str);
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    messageTag = (MessageTag) chatMessagesRepositoryImpl$sendImage$1.L$2;
                    str = (String) chatMessagesRepositoryImpl$sendImage$1.L$1;
                    chatMessagesRepositoryImpl = (ChatMessagesRepositoryImpl) chatMessagesRepositoryImpl$sendImage$1.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (Exception e2) {
                        e = e2;
                        chatMessagesRepositoryImpl.logger.logException(e);
                        return new MessageToSend.ErrorWhileSending(messageTag, str);
                    }
                }
                return (MessageToSend.SendingResult) obj;
            }
        }
        chatMessagesRepositoryImpl$sendImage$1 = new ChatMessagesRepositoryImpl$sendImage$1(this, continuation);
        Object obj2 = chatMessagesRepositoryImpl$sendImage$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = chatMessagesRepositoryImpl$sendImage$1.label;
        if (i != 0) {
        }
        return (MessageToSend.SendingResult) obj2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object uploadImage(MessageToSend.Image image, String str, MessageTag messageTag, Continuation<? super MessageToSend.SendingResult> continuation) {
        ChatMessagesRepositoryImpl$uploadImage$1 chatMessagesRepositoryImpl$uploadImage$1;
        int i;
        Object obj;
        MessageTag messageTag2;
        ChatMessagesRepositoryImpl chatMessagesRepositoryImpl;
        MessageTag messageTag3;
        SendFileResult sendFileResult;
        if (continuation instanceof ChatMessagesRepositoryImpl$uploadImage$1) {
            chatMessagesRepositoryImpl$uploadImage$1 = (ChatMessagesRepositoryImpl$uploadImage$1) continuation;
            if ((chatMessagesRepositoryImpl$uploadImage$1.label & Integer.MIN_VALUE) != 0) {
                chatMessagesRepositoryImpl$uploadImage$1.label -= Integer.MIN_VALUE;
                Object obj2 = chatMessagesRepositoryImpl$uploadImage$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = chatMessagesRepositoryImpl$uploadImage$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj2);
                    AuthDataProvider authDataProvider = this.authProvider;
                    chatMessagesRepositoryImpl$uploadImage$1.L$0 = this;
                    chatMessagesRepositoryImpl$uploadImage$1.L$1 = image;
                    chatMessagesRepositoryImpl$uploadImage$1.L$2 = str;
                    chatMessagesRepositoryImpl$uploadImage$1.L$3 = messageTag;
                    chatMessagesRepositoryImpl$uploadImage$1.label = 1;
                    Object lastAuthData = authDataProvider.lastAuthData(chatMessagesRepositoryImpl$uploadImage$1);
                    if (lastAuthData == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    obj = lastAuthData;
                    messageTag2 = messageTag;
                    chatMessagesRepositoryImpl = this;
                } else if (i == 1) {
                    MessageTag messageTag4 = (MessageTag) chatMessagesRepositoryImpl$uploadImage$1.L$3;
                    str = (String) chatMessagesRepositoryImpl$uploadImage$1.L$2;
                    image = (MessageToSend.Image) chatMessagesRepositoryImpl$uploadImage$1.L$1;
                    ResultKt.throwOnFailure(obj2);
                    messageTag2 = messageTag4;
                    chatMessagesRepositoryImpl = (ChatMessagesRepositoryImpl) chatMessagesRepositoryImpl$uploadImage$1.L$0;
                    obj = obj2;
                } else if (i != 2) {
                    if (i == 3) {
                        messageTag3 = (MessageTag) chatMessagesRepositoryImpl$uploadImage$1.L$1;
                        str = (String) chatMessagesRepositoryImpl$uploadImage$1.L$0;
                        ResultKt.throwOnFailure(obj2);
                        if (!((Boolean) obj2).booleanValue()) {
                            return new MessageToSend.SendingResult.Success(messageTag3, str);
                        }
                        return new MessageToSend.ErrorWhileSending(messageTag3, str);
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    messageTag3 = (MessageTag) chatMessagesRepositoryImpl$uploadImage$1.L$2;
                    str = (String) chatMessagesRepositoryImpl$uploadImage$1.L$1;
                    chatMessagesRepositoryImpl = (ChatMessagesRepositoryImpl) chatMessagesRepositoryImpl$uploadImage$1.L$0;
                    ResultKt.throwOnFailure(obj2);
                    sendFileResult = (SendFileResult) obj2;
                    if (!(sendFileResult instanceof SendFileResult.Success)) {
                        chatMessagesRepositoryImpl$uploadImage$1.L$0 = str;
                        chatMessagesRepositoryImpl$uploadImage$1.L$1 = messageTag3;
                        chatMessagesRepositoryImpl$uploadImage$1.L$2 = null;
                        chatMessagesRepositoryImpl$uploadImage$1.label = 3;
                        obj2 = chatMessagesRepositoryImpl.isApplyFile((SendFileResult.Success) sendFileResult, messageTag3, str, chatMessagesRepositoryImpl$uploadImage$1);
                        if (obj2 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        if (!((Boolean) obj2).booleanValue()) {
                        }
                    } else if (sendFileResult instanceof SendFileResult.Failure) {
                        return new MessageToSend.Image.UnableToSendImage(messageTag3, str);
                    } else {
                        if (sendFileResult instanceof SendFileResult.IncorrectFormat) {
                            return new MessageToSend.Image.IncorrectImageFormat(messageTag3, str);
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                }
                if (((AuthData) obj) != null) {
                    return new MessageToSend.UserIsNotAuthorizedError(messageTag2, str);
                }
                File file = image.getFile();
                String type = ChatMessagesContentType.IMAGE.getType();
                chatMessagesRepositoryImpl$uploadImage$1.L$0 = chatMessagesRepositoryImpl;
                chatMessagesRepositoryImpl$uploadImage$1.L$1 = str;
                chatMessagesRepositoryImpl$uploadImage$1.L$2 = messageTag2;
                chatMessagesRepositoryImpl$uploadImage$1.L$3 = null;
                chatMessagesRepositoryImpl$uploadImage$1.label = 2;
                Object sendFile = chatMessagesRepositoryImpl.sendFile(file, str, type, chatMessagesRepositoryImpl$uploadImage$1);
                if (sendFile == coroutine_suspended) {
                    return coroutine_suspended;
                }
                MessageTag messageTag5 = messageTag2;
                obj2 = sendFile;
                messageTag3 = messageTag5;
                sendFileResult = (SendFileResult) obj2;
                if (!(sendFileResult instanceof SendFileResult.Success)) {
                }
            }
        }
        chatMessagesRepositoryImpl$uploadImage$1 = new ChatMessagesRepositoryImpl$uploadImage$1(this, continuation);
        Object obj22 = chatMessagesRepositoryImpl$uploadImage$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = chatMessagesRepositoryImpl$uploadImage$1.label;
        if (i != 0) {
        }
        if (((AuthData) obj) != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object sendAudio(MessageToSend.Audio audio, String str, MessageTag messageTag, Continuation<? super MessageToSend.SendingResult> continuation) {
        ChatMessagesRepositoryImpl$sendAudio$1 chatMessagesRepositoryImpl$sendAudio$1;
        int i;
        ChatMessagesRepositoryImpl chatMessagesRepositoryImpl;
        if (continuation instanceof ChatMessagesRepositoryImpl$sendAudio$1) {
            chatMessagesRepositoryImpl$sendAudio$1 = (ChatMessagesRepositoryImpl$sendAudio$1) continuation;
            if ((chatMessagesRepositoryImpl$sendAudio$1.label & Integer.MIN_VALUE) != 0) {
                chatMessagesRepositoryImpl$sendAudio$1.label -= Integer.MIN_VALUE;
                Object obj = chatMessagesRepositoryImpl$sendAudio$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = chatMessagesRepositoryImpl$sendAudio$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    try {
                        chatMessagesRepositoryImpl$sendAudio$1.L$0 = this;
                        chatMessagesRepositoryImpl$sendAudio$1.L$1 = str;
                        chatMessagesRepositoryImpl$sendAudio$1.L$2 = messageTag;
                        chatMessagesRepositoryImpl$sendAudio$1.label = 1;
                        obj = uploadAudio(audio, str, messageTag, chatMessagesRepositoryImpl$sendAudio$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        chatMessagesRepositoryImpl = this;
                    } catch (Exception e) {
                        e = e;
                        chatMessagesRepositoryImpl = this;
                        chatMessagesRepositoryImpl.logger.logException(e);
                        return new MessageToSend.ErrorWhileSending(messageTag, str);
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    messageTag = (MessageTag) chatMessagesRepositoryImpl$sendAudio$1.L$2;
                    str = (String) chatMessagesRepositoryImpl$sendAudio$1.L$1;
                    chatMessagesRepositoryImpl = (ChatMessagesRepositoryImpl) chatMessagesRepositoryImpl$sendAudio$1.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (Exception e2) {
                        e = e2;
                        chatMessagesRepositoryImpl.logger.logException(e);
                        return new MessageToSend.ErrorWhileSending(messageTag, str);
                    }
                }
                return (MessageToSend.SendingResult) obj;
            }
        }
        chatMessagesRepositoryImpl$sendAudio$1 = new ChatMessagesRepositoryImpl$sendAudio$1(this, continuation);
        Object obj2 = chatMessagesRepositoryImpl$sendAudio$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = chatMessagesRepositoryImpl$sendAudio$1.label;
        if (i != 0) {
        }
        return (MessageToSend.SendingResult) obj2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object uploadAudio(MessageToSend.Audio audio, String str, MessageTag messageTag, Continuation<? super MessageToSend.SendingResult> continuation) {
        ChatMessagesRepositoryImpl$uploadAudio$1 chatMessagesRepositoryImpl$uploadAudio$1;
        int i;
        ChatMessagesRepositoryImpl chatMessagesRepositoryImpl;
        SendFileResult sendFileResult;
        MessageTag messageTag2;
        if (continuation instanceof ChatMessagesRepositoryImpl$uploadAudio$1) {
            chatMessagesRepositoryImpl$uploadAudio$1 = (ChatMessagesRepositoryImpl$uploadAudio$1) continuation;
            if ((chatMessagesRepositoryImpl$uploadAudio$1.label & Integer.MIN_VALUE) != 0) {
                chatMessagesRepositoryImpl$uploadAudio$1.label -= Integer.MIN_VALUE;
                ChatMessagesRepositoryImpl$uploadAudio$1 chatMessagesRepositoryImpl$uploadAudio$12 = chatMessagesRepositoryImpl$uploadAudio$1;
                Object obj = chatMessagesRepositoryImpl$uploadAudio$12.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = chatMessagesRepositoryImpl$uploadAudio$12.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (this.authProvider.sessionAuthData().getValue() == null) {
                        return new MessageToSend.UserIsNotAuthorizedError(messageTag, str);
                    }
                    File file = audio.getFile();
                    if (!file.exists()) {
                        Logger.DefaultImpls.error$default(this.logger, "sendAudioVoice: no file!", null, 2, null);
                        return new MessageToSend.Audio.NothingToSend(messageTag, str);
                    }
                    String type = ChatMessagesContentType.AUDIO.getType();
                    chatMessagesRepositoryImpl$uploadAudio$12.L$0 = this;
                    chatMessagesRepositoryImpl$uploadAudio$12.L$1 = str;
                    chatMessagesRepositoryImpl$uploadAudio$12.L$2 = messageTag;
                    chatMessagesRepositoryImpl$uploadAudio$12.label = 1;
                    obj = sendFile(file, str, type, chatMessagesRepositoryImpl$uploadAudio$12);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    chatMessagesRepositoryImpl = this;
                } else if (i != 1) {
                    if (i == 2) {
                        messageTag2 = (MessageTag) chatMessagesRepositoryImpl$uploadAudio$12.L$1;
                        str = (String) chatMessagesRepositoryImpl$uploadAudio$12.L$0;
                        ResultKt.throwOnFailure(obj);
                        return new MessageToSend.SendingResult.Success(messageTag2, str);
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    messageTag = (MessageTag) chatMessagesRepositoryImpl$uploadAudio$12.L$2;
                    str = (String) chatMessagesRepositoryImpl$uploadAudio$12.L$1;
                    chatMessagesRepositoryImpl = (ChatMessagesRepositoryImpl) chatMessagesRepositoryImpl$uploadAudio$12.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                sendFileResult = (SendFileResult) obj;
                if (!(sendFileResult instanceof SendFileResult.Success)) {
                    ChatMessagesRemoteDataSource chatMessagesRemoteDataSource = chatMessagesRepositoryImpl.chatMessagesRemoteDataSource;
                    String fileName = ((SendFileResult.Success) sendFileResult).getFileName();
                    ChatFileType chatFileType = ChatFileType.AUDIO;
                    chatMessagesRepositoryImpl$uploadAudio$12.L$0 = str;
                    chatMessagesRepositoryImpl$uploadAudio$12.L$1 = messageTag;
                    chatMessagesRepositoryImpl$uploadAudio$12.L$2 = null;
                    chatMessagesRepositoryImpl$uploadAudio$12.label = 2;
                    if (chatMessagesRemoteDataSource.isApplyFile(messageTag, fileName, chatFileType, str, chatMessagesRepositoryImpl$uploadAudio$12) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    messageTag2 = messageTag;
                    return new MessageToSend.SendingResult.Success(messageTag2, str);
                }
                return new MessageToSend.ErrorWhileSending(messageTag, str);
            }
        }
        chatMessagesRepositoryImpl$uploadAudio$1 = new ChatMessagesRepositoryImpl$uploadAudio$1(this, continuation);
        ChatMessagesRepositoryImpl$uploadAudio$1 chatMessagesRepositoryImpl$uploadAudio$122 = chatMessagesRepositoryImpl$uploadAudio$1;
        Object obj2 = chatMessagesRepositoryImpl$uploadAudio$122.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = chatMessagesRepositoryImpl$uploadAudio$122.label;
        if (i != 0) {
        }
        sendFileResult = (SendFileResult) obj2;
        if (!(sendFileResult instanceof SendFileResult.Success)) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object sendFile(File file, String str, String str2, Continuation<? super SendFileResult> continuation) {
        ChatMessagesRepositoryImpl$sendFile$1 chatMessagesRepositoryImpl$sendFile$1;
        int i;
        ChatMessagesRepositoryImpl chatMessagesRepositoryImpl;
        Response response;
        if (continuation instanceof ChatMessagesRepositoryImpl$sendFile$1) {
            chatMessagesRepositoryImpl$sendFile$1 = (ChatMessagesRepositoryImpl$sendFile$1) continuation;
            if ((chatMessagesRepositoryImpl$sendFile$1.label & Integer.MIN_VALUE) != 0) {
                chatMessagesRepositoryImpl$sendFile$1.label -= Integer.MIN_VALUE;
                Object obj = chatMessagesRepositoryImpl$sendFile$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = chatMessagesRepositoryImpl$sendFile$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    ChatMessagesRemoteDataSource chatMessagesRemoteDataSource = this.chatMessagesRemoteDataSource;
                    chatMessagesRepositoryImpl$sendFile$1.L$0 = this;
                    chatMessagesRepositoryImpl$sendFile$1.label = 1;
                    obj = chatMessagesRemoteDataSource.sendFile(file, str2, str, chatMessagesRepositoryImpl$sendFile$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    chatMessagesRepositoryImpl = this;
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    chatMessagesRepositoryImpl = (ChatMessagesRepositoryImpl) chatMessagesRepositoryImpl$sendFile$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                response = (Response) obj;
                String str3 = null;
                if (response.isSuccessful()) {
                    Logger.DefaultImpls.error$default(chatMessagesRepositoryImpl.logger, "Sending file is failed with code " + response.code(), null, 2, null);
                    if (response.code() == 415) {
                        return SendFileResult.IncorrectFormat.INSTANCE;
                    }
                    return SendFileResult.Failure.INSTANCE;
                }
                Object body = response.body();
                if (body == null) {
                    Logger.DefaultImpls.error$default(chatMessagesRepositoryImpl.logger, "Sending file is failed: null response body", null, 2, null);
                    return SendFileResult.Failure.INSTANCE;
                }
                if (body instanceof ArrayList) {
                    Object obj2 = ((ArrayList) body).get(0);
                    if (obj2 instanceof String) {
                        str3 = (String) obj2;
                    }
                } else if (body instanceof LinkedTreeMap) {
                    Object obj3 = ((Map) body).get("basename");
                    if (obj3 instanceof String) {
                        str3 = (String) obj3;
                    }
                }
                if (str3 == null) {
                    return SendFileResult.Failure.INSTANCE;
                }
                return new SendFileResult.Success(str3);
            }
        }
        chatMessagesRepositoryImpl$sendFile$1 = new ChatMessagesRepositoryImpl$sendFile$1(this, continuation);
        Object obj4 = chatMessagesRepositoryImpl$sendFile$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = chatMessagesRepositoryImpl$sendFile$1.label;
        if (i != 0) {
        }
        response = (Response) obj4;
        String str32 = null;
        if (response.isSuccessful()) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object isApplyFile(SendFileResult.Success success, MessageTag messageTag, String str, Continuation<? super Boolean> continuation) {
        return this.chatMessagesRemoteDataSource.isApplyFile(messageTag, success.getFileName(), ChatFileType.IMAGE, str, continuation);
    }
}
