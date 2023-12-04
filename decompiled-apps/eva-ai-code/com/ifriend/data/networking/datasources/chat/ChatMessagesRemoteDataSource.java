package com.ifriend.data.networking.datasources.chat;

import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.internal.NativeProtocol;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ifriend.core.local.api.AuthLocalDataSource;
import com.ifriend.data.networking.api.chat.ChatMessagesApi;
import com.ifriend.data.networking.api.chatgifts.models.request.SendChatGiftsRemoteParams;
import com.ifriend.data.networking.datasources.chat.models.request.ApplyFileRequestRemoteParams;
import com.ifriend.data.networking.datasources.chat.models.request.ChatFileType;
import com.ifriend.data.networking.datasources.chat.models.request.ReadMessageRemoteParams;
import com.ifriend.data.networking.datasources.chat.models.request.RegenerateNewAnswerRemoteParams;
import com.ifriend.data.networking.datasources.chat.models.response.client.BuyChatMessageRemote;
import com.ifriend.data.networking.datasources.chat.models.response.client.ChatMessageRemote;
import com.ifriend.data.networking.datasources.chat.models.response.client.ChatMessageRemoteParams;
import com.ifriend.data.networking.datasources.chat.models.response.client.InitFirstChatRequest;
import com.ifriend.domain.config.ConfigKeys;
import com.ifriend.domain.newChat.chat.models.MessageTag;
import com.ifriend.domain.newChat.chat.models.MessageToSend;
import java.io.File;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Response;
/* compiled from: ChatMessagesRemoteDataSource.kt */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J)\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\rJ!\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\nH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0011J/\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\nH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0018J\u0011\u0010\u0019\u001a\u00020\nH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u001aJ\u0019\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\nH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u001dJ1\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\n2\u0006\u0010\"\u001a\u00020#2\u0006\u0010\u0010\u001a\u00020\nH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010$J!\u0010%\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\nH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0011J!\u0010&\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\nH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0011J/\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00010(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\nH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010,J)\u0010-\u001a\u00020\u000f2\u0006\u0010.\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010/\u001a\u000200H\u0086@ø\u0001\u0000¢\u0006\u0002\u00101J-\u00102\u001a\u0006\u0012\u0002\b\u00030(2\u0006\u00103\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020 2\u0006\u00104\u001a\u000205H\u0086@ø\u0001\u0000¢\u0006\u0002\u00106R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u00067"}, d2 = {"Lcom/ifriend/data/networking/datasources/chat/ChatMessagesRemoteDataSource;", "", "chatMessagesApi", "Lcom/ifriend/data/networking/api/chat/ChatMessagesApi;", "authLocalDataSource", "Lcom/ifriend/core/local/api/AuthLocalDataSource;", "(Lcom/ifriend/data/networking/api/chat/ChatMessagesApi;Lcom/ifriend/core/local/api/AuthLocalDataSource;)V", "buyMessage", "", "messageId", "", "senderId", "recipientId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteMessages", "", "chatId", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMessages", "", "Lcom/ifriend/data/networking/datasources/chat/models/response/client/ChatMessageRemote;", "omit", "", "count", "(IILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUserId", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "initFirstChat", "dbId", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isApplyFile", ViewHierarchyConstants.TAG_KEY, "Lcom/ifriend/domain/newChat/chat/models/MessageTag;", "uploadedFileName", "fileType", "Lcom/ifriend/data/networking/datasources/chat/models/request/ChatFileType;", "(Lcom/ifriend/domain/newChat/chat/models/MessageTag;Ljava/lang/String;Lcom/ifriend/data/networking/datasources/chat/models/request/ChatFileType;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readMessages", "regenerateNewAnswer", "sendFile", "Lretrofit2/Response;", "fileToUpload", "Ljava/io/File;", "mediaType", "(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendGift", "userId", NativeProtocol.WEB_DIALOG_PARAMS, "Lcom/ifriend/data/networking/api/chatgifts/models/request/SendChatGiftsRemoteParams;", "(Ljava/lang/String;Ljava/lang/String;Lcom/ifriend/data/networking/api/chatgifts/models/request/SendChatGiftsRemoteParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendText", ConfigKeys.CLIENT_ID, FirebaseAnalytics.Param.CONTENT, "Lcom/ifriend/domain/newChat/chat/models/MessageToSend$Text;", "(Ljava/lang/String;Lcom/ifriend/domain/newChat/chat/models/MessageTag;Lcom/ifriend/domain/newChat/chat/models/MessageToSend$Text;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatMessagesRemoteDataSource {
    private final AuthLocalDataSource authLocalDataSource;
    private final ChatMessagesApi chatMessagesApi;

    /* compiled from: ChatMessagesRemoteDataSource.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ChatFileType.values().length];
            try {
                iArr[ChatFileType.AUDIO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ChatFileType.IMAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Inject
    public ChatMessagesRemoteDataSource(ChatMessagesApi chatMessagesApi, AuthLocalDataSource authLocalDataSource) {
        Intrinsics.checkNotNullParameter(chatMessagesApi, "chatMessagesApi");
        Intrinsics.checkNotNullParameter(authLocalDataSource, "authLocalDataSource");
        this.chatMessagesApi = chatMessagesApi;
        this.authLocalDataSource = authLocalDataSource;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0044 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getUserId(Continuation<? super String> continuation) {
        ChatMessagesRemoteDataSource$getUserId$1 chatMessagesRemoteDataSource$getUserId$1;
        int i;
        if (continuation instanceof ChatMessagesRemoteDataSource$getUserId$1) {
            chatMessagesRemoteDataSource$getUserId$1 = (ChatMessagesRemoteDataSource$getUserId$1) continuation;
            if ((chatMessagesRemoteDataSource$getUserId$1.label & Integer.MIN_VALUE) != 0) {
                chatMessagesRemoteDataSource$getUserId$1.label -= Integer.MIN_VALUE;
                Object obj = chatMessagesRemoteDataSource$getUserId$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = chatMessagesRemoteDataSource$getUserId$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    AuthLocalDataSource authLocalDataSource = this.authLocalDataSource;
                    chatMessagesRemoteDataSource$getUserId$1.label = 1;
                    obj = authLocalDataSource.getUserId(chatMessagesRemoteDataSource$getUserId$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ResultKt.throwOnFailure(obj);
                }
                String str = (String) obj;
                return str != null ? "" : str;
            }
        }
        chatMessagesRemoteDataSource$getUserId$1 = new ChatMessagesRemoteDataSource$getUserId$1(this, continuation);
        Object obj2 = chatMessagesRemoteDataSource$getUserId$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = chatMessagesRemoteDataSource$getUserId$1.label;
        if (i != 0) {
        }
        String str2 = (String) obj2;
        if (str2 != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0094 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object initFirstChat(String str, Continuation<? super Boolean> continuation) {
        ChatMessagesRemoteDataSource$initFirstChat$1 chatMessagesRemoteDataSource$initFirstChat$1;
        Object obj;
        int i;
        ChatMessagesRemoteDataSource chatMessagesRemoteDataSource;
        String str2;
        ChatMessagesApi chatMessagesApi;
        if (continuation instanceof ChatMessagesRemoteDataSource$initFirstChat$1) {
            chatMessagesRemoteDataSource$initFirstChat$1 = (ChatMessagesRemoteDataSource$initFirstChat$1) continuation;
            if ((chatMessagesRemoteDataSource$initFirstChat$1.label & Integer.MIN_VALUE) != 0) {
                chatMessagesRemoteDataSource$initFirstChat$1.label -= Integer.MIN_VALUE;
                obj = chatMessagesRemoteDataSource$initFirstChat$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = chatMessagesRemoteDataSource$initFirstChat$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    AuthLocalDataSource authLocalDataSource = this.authLocalDataSource;
                    chatMessagesRemoteDataSource$initFirstChat$1.L$0 = this;
                    chatMessagesRemoteDataSource$initFirstChat$1.L$1 = str;
                    chatMessagesRemoteDataSource$initFirstChat$1.label = 1;
                    obj = authLocalDataSource.getFormattedUserToken(chatMessagesRemoteDataSource$initFirstChat$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    chatMessagesRemoteDataSource = this;
                } else if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            ResultKt.throwOnFailure(obj);
                            return Boxing.boxBoolean(((Response) obj).isSuccessful());
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    chatMessagesApi = (ChatMessagesApi) chatMessagesRemoteDataSource$initFirstChat$1.L$1;
                    str2 = (String) chatMessagesRemoteDataSource$initFirstChat$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    InitFirstChatRequest initFirstChatRequest = new InitFirstChatRequest(str2);
                    chatMessagesRemoteDataSource$initFirstChat$1.L$0 = null;
                    chatMessagesRemoteDataSource$initFirstChat$1.L$1 = null;
                    chatMessagesRemoteDataSource$initFirstChat$1.label = 3;
                    obj = chatMessagesApi.initFirstChat((String) obj, initFirstChatRequest, chatMessagesRemoteDataSource$initFirstChat$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Boxing.boxBoolean(((Response) obj).isSuccessful());
                } else {
                    str = (String) chatMessagesRemoteDataSource$initFirstChat$1.L$1;
                    chatMessagesRemoteDataSource = (ChatMessagesRemoteDataSource) chatMessagesRemoteDataSource$initFirstChat$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                if (((String) obj) != null) {
                    return Boxing.boxBoolean(false);
                }
                ChatMessagesApi chatMessagesApi2 = chatMessagesRemoteDataSource.chatMessagesApi;
                chatMessagesRemoteDataSource$initFirstChat$1.L$0 = str;
                chatMessagesRemoteDataSource$initFirstChat$1.L$1 = chatMessagesApi2;
                chatMessagesRemoteDataSource$initFirstChat$1.label = 2;
                Object userId = chatMessagesRemoteDataSource.getUserId(chatMessagesRemoteDataSource$initFirstChat$1);
                if (userId == coroutine_suspended) {
                    return coroutine_suspended;
                }
                str2 = str;
                chatMessagesApi = chatMessagesApi2;
                obj = userId;
                InitFirstChatRequest initFirstChatRequest2 = new InitFirstChatRequest(str2);
                chatMessagesRemoteDataSource$initFirstChat$1.L$0 = null;
                chatMessagesRemoteDataSource$initFirstChat$1.L$1 = null;
                chatMessagesRemoteDataSource$initFirstChat$1.label = 3;
                obj = chatMessagesApi.initFirstChat((String) obj, initFirstChatRequest2, chatMessagesRemoteDataSource$initFirstChat$1);
                if (obj == coroutine_suspended) {
                }
                return Boxing.boxBoolean(((Response) obj).isSuccessful());
            }
        }
        chatMessagesRemoteDataSource$initFirstChat$1 = new ChatMessagesRemoteDataSource$initFirstChat$1(this, continuation);
        obj = chatMessagesRemoteDataSource$initFirstChat$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = chatMessagesRemoteDataSource$initFirstChat$1.label;
        if (i != 0) {
        }
        if (((String) obj) != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0080 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getMessages(int i, int i2, String str, Continuation<? super List<ChatMessageRemote>> continuation) {
        ChatMessagesRemoteDataSource$getMessages$1 chatMessagesRemoteDataSource$getMessages$1;
        Object obj;
        Object coroutine_suspended;
        int i3;
        int i4;
        int i5;
        String str2;
        String str3;
        ChatMessagesApi chatMessagesApi;
        if (continuation instanceof ChatMessagesRemoteDataSource$getMessages$1) {
            chatMessagesRemoteDataSource$getMessages$1 = (ChatMessagesRemoteDataSource$getMessages$1) continuation;
            if ((chatMessagesRemoteDataSource$getMessages$1.label & Integer.MIN_VALUE) != 0) {
                chatMessagesRemoteDataSource$getMessages$1.label -= Integer.MIN_VALUE;
                ChatMessagesRemoteDataSource$getMessages$1 chatMessagesRemoteDataSource$getMessages$12 = chatMessagesRemoteDataSource$getMessages$1;
                obj = chatMessagesRemoteDataSource$getMessages$12.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i3 = chatMessagesRemoteDataSource$getMessages$12.label;
                if (i3 != 0) {
                    ResultKt.throwOnFailure(obj);
                    ChatMessagesApi chatMessagesApi2 = this.chatMessagesApi;
                    chatMessagesRemoteDataSource$getMessages$12.L$0 = str;
                    chatMessagesRemoteDataSource$getMessages$12.L$1 = chatMessagesApi2;
                    chatMessagesRemoteDataSource$getMessages$12.L$2 = "application/json+videos";
                    chatMessagesRemoteDataSource$getMessages$12.I$0 = i;
                    chatMessagesRemoteDataSource$getMessages$12.I$1 = i2;
                    chatMessagesRemoteDataSource$getMessages$12.label = 1;
                    Object userId = getUserId(chatMessagesRemoteDataSource$getMessages$12);
                    if (userId == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    i4 = i;
                    i5 = i2;
                    str2 = str;
                    str3 = "application/json+videos";
                    chatMessagesApi = chatMessagesApi2;
                    obj = userId;
                } else if (i3 != 1) {
                    if (i3 == 2) {
                        ResultKt.throwOnFailure(obj);
                        List list = (List) ((Response) obj).body();
                        return list == null ? CollectionsKt.emptyList() : list;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    int i6 = chatMessagesRemoteDataSource$getMessages$12.I$1;
                    int i7 = chatMessagesRemoteDataSource$getMessages$12.I$0;
                    str3 = (String) chatMessagesRemoteDataSource$getMessages$12.L$2;
                    chatMessagesApi = (ChatMessagesApi) chatMessagesRemoteDataSource$getMessages$12.L$1;
                    ResultKt.throwOnFailure(obj);
                    i4 = i7;
                    i5 = i6;
                    str2 = (String) chatMessagesRemoteDataSource$getMessages$12.L$0;
                }
                chatMessagesRemoteDataSource$getMessages$12.L$0 = null;
                chatMessagesRemoteDataSource$getMessages$12.L$1 = null;
                chatMessagesRemoteDataSource$getMessages$12.L$2 = null;
                chatMessagesRemoteDataSource$getMessages$12.label = 2;
                obj = chatMessagesApi.getMessages(str3, (String) obj, str2, i4, i5, chatMessagesRemoteDataSource$getMessages$12);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                List list2 = (List) ((Response) obj).body();
                if (list2 == null) {
                }
            }
        }
        chatMessagesRemoteDataSource$getMessages$1 = new ChatMessagesRemoteDataSource$getMessages$1(this, continuation);
        ChatMessagesRemoteDataSource$getMessages$1 chatMessagesRemoteDataSource$getMessages$122 = chatMessagesRemoteDataSource$getMessages$1;
        obj = chatMessagesRemoteDataSource$getMessages$122.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i3 = chatMessagesRemoteDataSource$getMessages$122.label;
        if (i3 != 0) {
        }
        chatMessagesRemoteDataSource$getMessages$122.L$0 = null;
        chatMessagesRemoteDataSource$getMessages$122.L$1 = null;
        chatMessagesRemoteDataSource$getMessages$122.L$2 = null;
        chatMessagesRemoteDataSource$getMessages$122.label = 2;
        obj = chatMessagesApi.getMessages(str3, (String) obj, str2, i4, i5, chatMessagesRemoteDataSource$getMessages$122);
        if (obj == coroutine_suspended) {
        }
        List list22 = (List) ((Response) obj).body();
        if (list22 == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0079 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object readMessages(String str, String str2, Continuation<? super Unit> continuation) {
        ChatMessagesRemoteDataSource$readMessages$1 chatMessagesRemoteDataSource$readMessages$1;
        ChatMessagesRemoteDataSource$readMessages$1 chatMessagesRemoteDataSource$readMessages$12;
        Object obj;
        Object coroutine_suspended;
        int i;
        String str3;
        ChatMessagesApi chatMessagesApi;
        ReadMessageRemoteParams readMessageRemoteParams;
        if (continuation instanceof ChatMessagesRemoteDataSource$readMessages$1) {
            chatMessagesRemoteDataSource$readMessages$1 = (ChatMessagesRemoteDataSource$readMessages$1) continuation;
            if ((chatMessagesRemoteDataSource$readMessages$1.label & Integer.MIN_VALUE) != 0) {
                chatMessagesRemoteDataSource$readMessages$1.label -= Integer.MIN_VALUE;
                chatMessagesRemoteDataSource$readMessages$12 = chatMessagesRemoteDataSource$readMessages$1;
                obj = chatMessagesRemoteDataSource$readMessages$12.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = chatMessagesRemoteDataSource$readMessages$12.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    ChatMessagesApi chatMessagesApi2 = this.chatMessagesApi;
                    chatMessagesRemoteDataSource$readMessages$12.L$0 = str;
                    chatMessagesRemoteDataSource$readMessages$12.L$1 = str2;
                    chatMessagesRemoteDataSource$readMessages$12.L$2 = chatMessagesApi2;
                    chatMessagesRemoteDataSource$readMessages$12.label = 1;
                    Object userId = getUserId(chatMessagesRemoteDataSource$readMessages$12);
                    if (userId == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    str3 = str;
                    chatMessagesApi = chatMessagesApi2;
                    obj = userId;
                } else if (i != 1) {
                    if (i == 2) {
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    str2 = (String) chatMessagesRemoteDataSource$readMessages$12.L$1;
                    ResultKt.throwOnFailure(obj);
                    str3 = (String) chatMessagesRemoteDataSource$readMessages$12.L$0;
                    chatMessagesApi = (ChatMessagesApi) chatMessagesRemoteDataSource$readMessages$12.L$2;
                }
                readMessageRemoteParams = new ReadMessageRemoteParams(true);
                chatMessagesRemoteDataSource$readMessages$12.L$0 = null;
                chatMessagesRemoteDataSource$readMessages$12.L$1 = null;
                chatMessagesRemoteDataSource$readMessages$12.L$2 = null;
                chatMessagesRemoteDataSource$readMessages$12.label = 2;
                if (chatMessagesApi.readMessage((String) obj, str2, str3, readMessageRemoteParams, chatMessagesRemoteDataSource$readMessages$12) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
        }
        chatMessagesRemoteDataSource$readMessages$1 = new ChatMessagesRemoteDataSource$readMessages$1(this, continuation);
        chatMessagesRemoteDataSource$readMessages$12 = chatMessagesRemoteDataSource$readMessages$1;
        obj = chatMessagesRemoteDataSource$readMessages$12.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = chatMessagesRemoteDataSource$readMessages$12.label;
        if (i != 0) {
        }
        readMessageRemoteParams = new ReadMessageRemoteParams(true);
        chatMessagesRemoteDataSource$readMessages$12.L$0 = null;
        chatMessagesRemoteDataSource$readMessages$12.L$1 = null;
        chatMessagesRemoteDataSource$readMessages$12.L$2 = null;
        chatMessagesRemoteDataSource$readMessages$12.label = 2;
        if (chatMessagesApi.readMessage((String) obj, str2, str3, readMessageRemoteParams, chatMessagesRemoteDataSource$readMessages$12) == coroutine_suspended) {
        }
        return Unit.INSTANCE;
    }

    public final Object sendGift(String str, String str2, SendChatGiftsRemoteParams sendChatGiftsRemoteParams, Continuation<? super Unit> continuation) {
        Object sendGiftMessage = this.chatMessagesApi.sendGiftMessage(str, str2, sendChatGiftsRemoteParams, continuation);
        return sendGiftMessage == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? sendGiftMessage : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0099 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009a A[PHI: r1 
      PHI: (r1v5 java.lang.Object) = (r1v4 java.lang.Object), (r1v1 java.lang.Object) binds: [B:21:0x0097, B:12:0x002d] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object sendText(String str, MessageTag messageTag, MessageToSend.Text text, Continuation<? super Response<?>> continuation) {
        ChatMessagesRemoteDataSource$sendText$1 chatMessagesRemoteDataSource$sendText$1;
        int i;
        String str2;
        MessageTag messageTag2;
        MessageToSend.Text text2;
        Object userId;
        ChatMessagesRemoteDataSource chatMessagesRemoteDataSource;
        if (continuation instanceof ChatMessagesRemoteDataSource$sendText$1) {
            chatMessagesRemoteDataSource$sendText$1 = (ChatMessagesRemoteDataSource$sendText$1) continuation;
            if ((chatMessagesRemoteDataSource$sendText$1.label & Integer.MIN_VALUE) != 0) {
                chatMessagesRemoteDataSource$sendText$1.label -= Integer.MIN_VALUE;
                Object obj = chatMessagesRemoteDataSource$sendText$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = chatMessagesRemoteDataSource$sendText$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    chatMessagesRemoteDataSource$sendText$1.L$0 = this;
                    str2 = str;
                    chatMessagesRemoteDataSource$sendText$1.L$1 = str2;
                    messageTag2 = messageTag;
                    chatMessagesRemoteDataSource$sendText$1.L$2 = messageTag2;
                    text2 = text;
                    chatMessagesRemoteDataSource$sendText$1.L$3 = text2;
                    chatMessagesRemoteDataSource$sendText$1.label = 1;
                    userId = getUserId(chatMessagesRemoteDataSource$sendText$1);
                    if (userId == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    chatMessagesRemoteDataSource = this;
                } else if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                } else {
                    MessageTag messageTag3 = (MessageTag) chatMessagesRemoteDataSource$sendText$1.L$2;
                    chatMessagesRemoteDataSource = (ChatMessagesRemoteDataSource) chatMessagesRemoteDataSource$sendText$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    userId = obj;
                    str2 = (String) chatMessagesRemoteDataSource$sendText$1.L$1;
                    text2 = (MessageToSend.Text) chatMessagesRemoteDataSource$sendText$1.L$3;
                    messageTag2 = messageTag3;
                }
                ChatMessagesApi chatMessagesApi = chatMessagesRemoteDataSource.chatMessagesApi;
                ChatMessageRemoteParams chatMessageRemoteParams = new ChatMessageRemoteParams(messageTag2.getValue(), text2.getText(), 0, null, 12, null);
                chatMessagesRemoteDataSource$sendText$1.L$0 = null;
                chatMessagesRemoteDataSource$sendText$1.L$1 = null;
                chatMessagesRemoteDataSource$sendText$1.L$2 = null;
                chatMessagesRemoteDataSource$sendText$1.L$3 = null;
                chatMessagesRemoteDataSource$sendText$1.label = 2;
                obj = chatMessagesApi.sendMessage((String) userId, str2, chatMessageRemoteParams, chatMessagesRemoteDataSource$sendText$1);
                return obj != coroutine_suspended ? coroutine_suspended : obj;
            }
        }
        chatMessagesRemoteDataSource$sendText$1 = new ChatMessagesRemoteDataSource$sendText$1(this, continuation);
        Object obj2 = chatMessagesRemoteDataSource$sendText$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = chatMessagesRemoteDataSource$sendText$1.label;
        if (i != 0) {
        }
        ChatMessagesApi chatMessagesApi2 = chatMessagesRemoteDataSource.chatMessagesApi;
        ChatMessageRemoteParams chatMessageRemoteParams2 = new ChatMessageRemoteParams(messageTag2.getValue(), text2.getText(), 0, null, 12, null);
        chatMessagesRemoteDataSource$sendText$1.L$0 = null;
        chatMessagesRemoteDataSource$sendText$1.L$1 = null;
        chatMessagesRemoteDataSource$sendText$1.L$2 = null;
        chatMessagesRemoteDataSource$sendText$1.L$3 = null;
        chatMessagesRemoteDataSource$sendText$1.label = 2;
        obj2 = chatMessagesApi2.sendMessage((String) userId, str2, chatMessageRemoteParams2, chatMessagesRemoteDataSource$sendText$1);
        if (obj2 != coroutine_suspended2) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007d A[PHI: r9 
      PHI: (r9v8 java.lang.Object) = (r9v7 java.lang.Object), (r9v1 java.lang.Object) binds: [B:20:0x007a, B:12:0x0029] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object sendFile(File file, String str, String str2, Continuation<? super Response<Object>> continuation) {
        ChatMessagesRemoteDataSource$sendFile$1 chatMessagesRemoteDataSource$sendFile$1;
        int i;
        MultipartBody.Part create;
        ChatMessagesApi chatMessagesApi;
        if (continuation instanceof ChatMessagesRemoteDataSource$sendFile$1) {
            chatMessagesRemoteDataSource$sendFile$1 = (ChatMessagesRemoteDataSource$sendFile$1) continuation;
            if ((chatMessagesRemoteDataSource$sendFile$1.label & Integer.MIN_VALUE) != 0) {
                chatMessagesRemoteDataSource$sendFile$1.label -= Integer.MIN_VALUE;
                Object obj = chatMessagesRemoteDataSource$sendFile$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = chatMessagesRemoteDataSource$sendFile$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    create = MultipartBody.Part.Companion.create(RequestBody.Companion.create(file, MediaType.Companion.parse(str)));
                    chatMessagesApi = this.chatMessagesApi;
                    chatMessagesRemoteDataSource$sendFile$1.L$0 = str2;
                    chatMessagesRemoteDataSource$sendFile$1.L$1 = create;
                    chatMessagesRemoteDataSource$sendFile$1.L$2 = chatMessagesApi;
                    chatMessagesRemoteDataSource$sendFile$1.label = 1;
                    obj = getUserId(chatMessagesRemoteDataSource$sendFile$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                } else {
                    chatMessagesApi = (ChatMessagesApi) chatMessagesRemoteDataSource$sendFile$1.L$2;
                    create = (MultipartBody.Part) chatMessagesRemoteDataSource$sendFile$1.L$1;
                    str2 = (String) chatMessagesRemoteDataSource$sendFile$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                chatMessagesRemoteDataSource$sendFile$1.L$0 = null;
                chatMessagesRemoteDataSource$sendFile$1.L$1 = null;
                chatMessagesRemoteDataSource$sendFile$1.L$2 = null;
                chatMessagesRemoteDataSource$sendFile$1.label = 2;
                obj = chatMessagesApi.sendFile((String) obj, str2, create, chatMessagesRemoteDataSource$sendFile$1);
                return obj != coroutine_suspended ? coroutine_suspended : obj;
            }
        }
        chatMessagesRemoteDataSource$sendFile$1 = new ChatMessagesRemoteDataSource$sendFile$1(this, continuation);
        Object obj2 = chatMessagesRemoteDataSource$sendFile$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = chatMessagesRemoteDataSource$sendFile$1.label;
        if (i != 0) {
        }
        chatMessagesRemoteDataSource$sendFile$1.L$0 = null;
        chatMessagesRemoteDataSource$sendFile$1.L$1 = null;
        chatMessagesRemoteDataSource$sendFile$1.L$2 = null;
        chatMessagesRemoteDataSource$sendFile$1.label = 2;
        obj2 = chatMessagesApi.sendFile((String) obj2, str2, create, chatMessagesRemoteDataSource$sendFile$1);
        if (obj2 != coroutine_suspended2) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object isApplyFile(MessageTag messageTag, String str, ChatFileType chatFileType, String str2, Continuation<? super Boolean> continuation) {
        ChatMessagesRemoteDataSource$isApplyFile$1 chatMessagesRemoteDataSource$isApplyFile$1;
        Object obj;
        Object coroutine_suspended;
        int i;
        ApplyFileRequestRemoteParams createAudio;
        ApplyFileRequestRemoteParams applyFileRequestRemoteParams;
        ChatMessagesApi chatMessagesApi;
        if (continuation instanceof ChatMessagesRemoteDataSource$isApplyFile$1) {
            chatMessagesRemoteDataSource$isApplyFile$1 = (ChatMessagesRemoteDataSource$isApplyFile$1) continuation;
            if ((chatMessagesRemoteDataSource$isApplyFile$1.label & Integer.MIN_VALUE) != 0) {
                chatMessagesRemoteDataSource$isApplyFile$1.label -= Integer.MIN_VALUE;
                obj = chatMessagesRemoteDataSource$isApplyFile$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = chatMessagesRemoteDataSource$isApplyFile$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    int i2 = WhenMappings.$EnumSwitchMapping$0[chatFileType.ordinal()];
                    if (i2 == 1) {
                        createAudio = ApplyFileRequestRemoteParams.Companion.createAudio(str, messageTag);
                    } else if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    } else {
                        createAudio = ApplyFileRequestRemoteParams.Companion.createImage(str, messageTag);
                    }
                    applyFileRequestRemoteParams = createAudio;
                    chatMessagesApi = this.chatMessagesApi;
                    chatMessagesRemoteDataSource$isApplyFile$1.L$0 = str2;
                    chatMessagesRemoteDataSource$isApplyFile$1.L$1 = applyFileRequestRemoteParams;
                    chatMessagesRemoteDataSource$isApplyFile$1.L$2 = chatMessagesApi;
                    chatMessagesRemoteDataSource$isApplyFile$1.label = 1;
                    obj = getUserId(chatMessagesRemoteDataSource$isApplyFile$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i != 1) {
                    if (i == 2) {
                        ResultKt.throwOnFailure(obj);
                        return Boxing.boxBoolean(((Response) obj).isSuccessful());
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    chatMessagesApi = (ChatMessagesApi) chatMessagesRemoteDataSource$isApplyFile$1.L$2;
                    applyFileRequestRemoteParams = (ApplyFileRequestRemoteParams) chatMessagesRemoteDataSource$isApplyFile$1.L$1;
                    str2 = (String) chatMessagesRemoteDataSource$isApplyFile$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                chatMessagesRemoteDataSource$isApplyFile$1.L$0 = null;
                chatMessagesRemoteDataSource$isApplyFile$1.L$1 = null;
                chatMessagesRemoteDataSource$isApplyFile$1.L$2 = null;
                chatMessagesRemoteDataSource$isApplyFile$1.label = 2;
                obj = chatMessagesApi.applyFile((String) obj, str2, applyFileRequestRemoteParams, chatMessagesRemoteDataSource$isApplyFile$1);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Boxing.boxBoolean(((Response) obj).isSuccessful());
            }
        }
        chatMessagesRemoteDataSource$isApplyFile$1 = new ChatMessagesRemoteDataSource$isApplyFile$1(this, continuation);
        obj = chatMessagesRemoteDataSource$isApplyFile$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = chatMessagesRemoteDataSource$isApplyFile$1.label;
        if (i != 0) {
        }
        chatMessagesRemoteDataSource$isApplyFile$1.L$0 = null;
        chatMessagesRemoteDataSource$isApplyFile$1.L$1 = null;
        chatMessagesRemoteDataSource$isApplyFile$1.L$2 = null;
        chatMessagesRemoteDataSource$isApplyFile$1.label = 2;
        obj = chatMessagesApi.applyFile((String) obj, str2, applyFileRequestRemoteParams, chatMessagesRemoteDataSource$isApplyFile$1);
        if (obj == coroutine_suspended) {
        }
        return Boxing.boxBoolean(((Response) obj).isSuccessful());
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object buyMessage(String str, String str2, String str3, Continuation<? super Boolean> continuation) {
        ChatMessagesRemoteDataSource$buyMessage$1 chatMessagesRemoteDataSource$buyMessage$1;
        int i;
        if (continuation instanceof ChatMessagesRemoteDataSource$buyMessage$1) {
            chatMessagesRemoteDataSource$buyMessage$1 = (ChatMessagesRemoteDataSource$buyMessage$1) continuation;
            if ((chatMessagesRemoteDataSource$buyMessage$1.label & Integer.MIN_VALUE) != 0) {
                chatMessagesRemoteDataSource$buyMessage$1.label -= Integer.MIN_VALUE;
                Object obj = chatMessagesRemoteDataSource$buyMessage$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = chatMessagesRemoteDataSource$buyMessage$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    ChatMessagesApi chatMessagesApi = this.chatMessagesApi;
                    chatMessagesRemoteDataSource$buyMessage$1.label = 1;
                    obj = chatMessagesApi.buyMessage(str2, str3, str, chatMessagesRemoteDataSource$buyMessage$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ResultKt.throwOnFailure(obj);
                }
                return Boxing.boxBoolean(((BuyChatMessageRemote) obj).isSuccess());
            }
        }
        chatMessagesRemoteDataSource$buyMessage$1 = new ChatMessagesRemoteDataSource$buyMessage$1(this, continuation);
        Object obj2 = chatMessagesRemoteDataSource$buyMessage$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = chatMessagesRemoteDataSource$buyMessage$1.label;
        if (i != 0) {
        }
        return Boxing.boxBoolean(((BuyChatMessageRemote) obj2).isSuccess());
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0073 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object regenerateNewAnswer(String str, String str2, Continuation<? super Unit> continuation) {
        ChatMessagesRemoteDataSource$regenerateNewAnswer$1 chatMessagesRemoteDataSource$regenerateNewAnswer$1;
        Object obj;
        Object coroutine_suspended;
        int i;
        String str3;
        ChatMessagesApi chatMessagesApi;
        RegenerateNewAnswerRemoteParams regenerateNewAnswerRemoteParams;
        if (continuation instanceof ChatMessagesRemoteDataSource$regenerateNewAnswer$1) {
            chatMessagesRemoteDataSource$regenerateNewAnswer$1 = (ChatMessagesRemoteDataSource$regenerateNewAnswer$1) continuation;
            if ((chatMessagesRemoteDataSource$regenerateNewAnswer$1.label & Integer.MIN_VALUE) != 0) {
                chatMessagesRemoteDataSource$regenerateNewAnswer$1.label -= Integer.MIN_VALUE;
                obj = chatMessagesRemoteDataSource$regenerateNewAnswer$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = chatMessagesRemoteDataSource$regenerateNewAnswer$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    ChatMessagesApi chatMessagesApi2 = this.chatMessagesApi;
                    chatMessagesRemoteDataSource$regenerateNewAnswer$1.L$0 = str;
                    chatMessagesRemoteDataSource$regenerateNewAnswer$1.L$1 = str2;
                    chatMessagesRemoteDataSource$regenerateNewAnswer$1.L$2 = chatMessagesApi2;
                    chatMessagesRemoteDataSource$regenerateNewAnswer$1.label = 1;
                    Object userId = getUserId(chatMessagesRemoteDataSource$regenerateNewAnswer$1);
                    if (userId == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    str3 = str;
                    chatMessagesApi = chatMessagesApi2;
                    obj = userId;
                } else if (i != 1) {
                    if (i == 2) {
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    chatMessagesApi = (ChatMessagesApi) chatMessagesRemoteDataSource$regenerateNewAnswer$1.L$2;
                    str2 = (String) chatMessagesRemoteDataSource$regenerateNewAnswer$1.L$1;
                    str3 = (String) chatMessagesRemoteDataSource$regenerateNewAnswer$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                regenerateNewAnswerRemoteParams = new RegenerateNewAnswerRemoteParams(str2);
                chatMessagesRemoteDataSource$regenerateNewAnswer$1.L$0 = null;
                chatMessagesRemoteDataSource$regenerateNewAnswer$1.L$1 = null;
                chatMessagesRemoteDataSource$regenerateNewAnswer$1.L$2 = null;
                chatMessagesRemoteDataSource$regenerateNewAnswer$1.label = 2;
                if (chatMessagesApi.regenerateNewAnswer((String) obj, str3, regenerateNewAnswerRemoteParams, chatMessagesRemoteDataSource$regenerateNewAnswer$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
        }
        chatMessagesRemoteDataSource$regenerateNewAnswer$1 = new ChatMessagesRemoteDataSource$regenerateNewAnswer$1(this, continuation);
        obj = chatMessagesRemoteDataSource$regenerateNewAnswer$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = chatMessagesRemoteDataSource$regenerateNewAnswer$1.label;
        if (i != 0) {
        }
        regenerateNewAnswerRemoteParams = new RegenerateNewAnswerRemoteParams(str2);
        chatMessagesRemoteDataSource$regenerateNewAnswer$1.L$0 = null;
        chatMessagesRemoteDataSource$regenerateNewAnswer$1.L$1 = null;
        chatMessagesRemoteDataSource$regenerateNewAnswer$1.L$2 = null;
        chatMessagesRemoteDataSource$regenerateNewAnswer$1.label = 2;
        if (chatMessagesApi.regenerateNewAnswer((String) obj, str3, regenerateNewAnswerRemoteParams, chatMessagesRemoteDataSource$regenerateNewAnswer$1) == coroutine_suspended) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0084 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object deleteMessages(String str, String str2, Continuation<? super Unit> continuation) {
        ChatMessagesRemoteDataSource$deleteMessages$1 chatMessagesRemoteDataSource$deleteMessages$1;
        Object coroutine_suspended;
        int i;
        ChatMessagesRemoteDataSource chatMessagesRemoteDataSource;
        ChatMessagesApi chatMessagesApi;
        String valueOf;
        String valueOf2;
        if (continuation instanceof ChatMessagesRemoteDataSource$deleteMessages$1) {
            chatMessagesRemoteDataSource$deleteMessages$1 = (ChatMessagesRemoteDataSource$deleteMessages$1) continuation;
            if ((chatMessagesRemoteDataSource$deleteMessages$1.label & Integer.MIN_VALUE) != 0) {
                chatMessagesRemoteDataSource$deleteMessages$1.label -= Integer.MIN_VALUE;
                Object obj = chatMessagesRemoteDataSource$deleteMessages$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = chatMessagesRemoteDataSource$deleteMessages$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    chatMessagesRemoteDataSource$deleteMessages$1.L$0 = this;
                    chatMessagesRemoteDataSource$deleteMessages$1.L$1 = str;
                    chatMessagesRemoteDataSource$deleteMessages$1.L$2 = str2;
                    chatMessagesRemoteDataSource$deleteMessages$1.label = 1;
                    obj = getUserId(chatMessagesRemoteDataSource$deleteMessages$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    chatMessagesRemoteDataSource = this;
                } else if (i != 1) {
                    if (i == 2) {
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    str2 = (String) chatMessagesRemoteDataSource$deleteMessages$1.L$2;
                    str = (String) chatMessagesRemoteDataSource$deleteMessages$1.L$1;
                    chatMessagesRemoteDataSource = (ChatMessagesRemoteDataSource) chatMessagesRemoteDataSource$deleteMessages$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                long parseLong = Long.parseLong((String) obj);
                long parseLong2 = Long.parseLong(str2);
                long coerceAtLeast = RangesKt.coerceAtLeast(parseLong, parseLong2);
                long coerceAtMost = RangesKt.coerceAtMost(parseLong, parseLong2);
                chatMessagesApi = chatMessagesRemoteDataSource.chatMessagesApi;
                valueOf = String.valueOf(coerceAtMost);
                valueOf2 = String.valueOf(coerceAtLeast);
                chatMessagesRemoteDataSource$deleteMessages$1.L$0 = null;
                chatMessagesRemoteDataSource$deleteMessages$1.L$1 = null;
                chatMessagesRemoteDataSource$deleteMessages$1.L$2 = null;
                chatMessagesRemoteDataSource$deleteMessages$1.label = 2;
                if (chatMessagesApi.deleteMessages(valueOf, valueOf2, str, chatMessagesRemoteDataSource$deleteMessages$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
        }
        chatMessagesRemoteDataSource$deleteMessages$1 = new ChatMessagesRemoteDataSource$deleteMessages$1(this, continuation);
        Object obj2 = chatMessagesRemoteDataSource$deleteMessages$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = chatMessagesRemoteDataSource$deleteMessages$1.label;
        if (i != 0) {
        }
        long parseLong3 = Long.parseLong((String) obj2);
        long parseLong22 = Long.parseLong(str2);
        long coerceAtLeast2 = RangesKt.coerceAtLeast(parseLong3, parseLong22);
        long coerceAtMost2 = RangesKt.coerceAtMost(parseLong3, parseLong22);
        chatMessagesApi = chatMessagesRemoteDataSource.chatMessagesApi;
        valueOf = String.valueOf(coerceAtMost2);
        valueOf2 = String.valueOf(coerceAtLeast2);
        chatMessagesRemoteDataSource$deleteMessages$1.L$0 = null;
        chatMessagesRemoteDataSource$deleteMessages$1.L$1 = null;
        chatMessagesRemoteDataSource$deleteMessages$1.L$2 = null;
        chatMessagesRemoteDataSource$deleteMessages$1.label = 2;
        if (chatMessagesApi.deleteMessages(valueOf, valueOf2, str, chatMessagesRemoteDataSource$deleteMessages$1) == coroutine_suspended) {
        }
        return Unit.INSTANCE;
    }
}
