package com.ifriend.data.socket.mapper;

import android.content.Context;
import com.facebook.internal.AnalyticsEvents;
import com.facebook.internal.security.CertificateUtil;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.ifriend.data.BuildConfig;
import com.ifriend.data.networking.OkHttpClientProviderKt;
import com.ifriend.data.socket.generator.BotAudioMessageUrlGenerator;
import com.ifriend.data.socket.generator.UserAudioMessageUrlGenerator;
import com.ifriend.domain.data.AuthDataProvider;
import com.ifriend.domain.models.profile.user.AuthData;
import com.ifriend.domain.models.profile.user.UserId;
import com.ifriend.domain.newChat.chat.models.MessageContent;
import com.ifriend.infrastructure.UtilsKt;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
/* compiled from: ChatMessageMapHelperImpl.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJC\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0013\u001a\u00020\u0014H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0015J'\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0012\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0018\u001a\u0004\u0018\u00010\u000eH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u000eH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"Lcom/ifriend/data/socket/mapper/ChatMessageMapHelperImpl;", "Lcom/ifriend/data/socket/mapper/ChatMessageMapHelper;", "authDataProvider", "Lcom/ifriend/domain/data/AuthDataProvider;", "botAudioMessageUrlGenerator", "Lcom/ifriend/data/socket/generator/BotAudioMessageUrlGenerator;", "userAudioMessageUrlGenerator", "Lcom/ifriend/data/socket/generator/UserAudioMessageUrlGenerator;", "context", "Landroid/content/Context;", "(Lcom/ifriend/domain/data/AuthDataProvider;Lcom/ifriend/data/socket/generator/BotAudioMessageUrlGenerator;Lcom/ifriend/data/socket/generator/UserAudioMessageUrlGenerator;Landroid/content/Context;)V", "buildChatAudioContent", "Lcom/ifriend/domain/newChat/chat/models/MessageContent$Audio;", "id", "", "text", "sender", "recipient", "reference", "isPremium", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "buildChatPhotoContent", "Lcom/ifriend/domain/newChat/chat/models/MessageContent$Image;", "preview", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isYours", "senderId", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatMessageMapHelperImpl implements ChatMessageMapHelper {
    private final AuthDataProvider authDataProvider;
    private final BotAudioMessageUrlGenerator botAudioMessageUrlGenerator;
    private final Context context;
    private final UserAudioMessageUrlGenerator userAudioMessageUrlGenerator;

    @Inject
    public ChatMessageMapHelperImpl(AuthDataProvider authDataProvider, BotAudioMessageUrlGenerator botAudioMessageUrlGenerator, UserAudioMessageUrlGenerator userAudioMessageUrlGenerator, Context context) {
        Intrinsics.checkNotNullParameter(authDataProvider, "authDataProvider");
        Intrinsics.checkNotNullParameter(botAudioMessageUrlGenerator, "botAudioMessageUrlGenerator");
        Intrinsics.checkNotNullParameter(userAudioMessageUrlGenerator, "userAudioMessageUrlGenerator");
        Intrinsics.checkNotNullParameter(context, "context");
        this.authDataProvider = authDataProvider;
        this.botAudioMessageUrlGenerator = botAudioMessageUrlGenerator;
        this.userAudioMessageUrlGenerator = userAudioMessageUrlGenerator;
        this.context = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009b  */
    @Override // com.ifriend.data.socket.mapper.ChatMessageMapHelper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object buildChatPhotoContent(String str, String str2, Continuation<? super MessageContent.Image> continuation) {
        ChatMessageMapHelperImpl$buildChatPhotoContent$1 chatMessageMapHelperImpl$buildChatPhotoContent$1;
        int i;
        String str3;
        String str4;
        AuthData authData;
        if (continuation instanceof ChatMessageMapHelperImpl$buildChatPhotoContent$1) {
            chatMessageMapHelperImpl$buildChatPhotoContent$1 = (ChatMessageMapHelperImpl$buildChatPhotoContent$1) continuation;
            if ((chatMessageMapHelperImpl$buildChatPhotoContent$1.label & Integer.MIN_VALUE) != 0) {
                chatMessageMapHelperImpl$buildChatPhotoContent$1.label -= Integer.MIN_VALUE;
                Object obj = chatMessageMapHelperImpl$buildChatPhotoContent$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = chatMessageMapHelperImpl$buildChatPhotoContent$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (str == null) {
                        return null;
                    }
                    List split$default = StringsKt.split$default((CharSequence) str, new String[]{CertificateUtil.DELIMITER}, false, 0, 6, (Object) null);
                    if (split$default.size() < 2) {
                        return UtilsKt.unexpectedNull();
                    }
                    String str5 = (String) split$default.get(0);
                    String str6 = (String) split$default.get(1);
                    String string = this.context.getSharedPreferences(OkHttpClientProviderKt.DEBUG_KEY, 0).getString(OkHttpClientProviderKt.API_URL_KEY, BuildConfig.API_URL);
                    if (Intrinsics.areEqual(str5, AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_PHOTO)) {
                        AuthDataProvider authDataProvider = this.authDataProvider;
                        chatMessageMapHelperImpl$buildChatPhotoContent$1.L$0 = str6;
                        chatMessageMapHelperImpl$buildChatPhotoContent$1.L$1 = string;
                        chatMessageMapHelperImpl$buildChatPhotoContent$1.label = 1;
                        Object lastAuthData = authDataProvider.lastAuthData(chatMessageMapHelperImpl$buildChatPhotoContent$1);
                        if (lastAuthData == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        str3 = str6;
                        str4 = string;
                        obj = lastAuthData;
                    } else if (Intrinsics.areEqual(str5, "photo-ai")) {
                        return new MessageContent.Image(string + str6, string + str2);
                    } else {
                        return null;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    str4 = (String) chatMessageMapHelperImpl$buildChatPhotoContent$1.L$1;
                    str3 = (String) chatMessageMapHelperImpl$buildChatPhotoContent$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                authData = (AuthData) obj;
                if (authData != null) {
                    return null;
                }
                return new MessageContent.Image(str4 + "/dialogs/usermedia/" + authData.getClientId().getValue() + RemoteSettings.FORWARD_SLASH_STRING + authData.getUserId().getValue() + RemoteSettings.FORWARD_SLASH_STRING + str3, null);
            }
        }
        chatMessageMapHelperImpl$buildChatPhotoContent$1 = new ChatMessageMapHelperImpl$buildChatPhotoContent$1(this, continuation);
        Object obj2 = chatMessageMapHelperImpl$buildChatPhotoContent$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = chatMessageMapHelperImpl$buildChatPhotoContent$1.label;
        if (i != 0) {
        }
        authData = (AuthData) obj2;
        if (authData != null) {
        }
    }

    @Override // com.ifriend.data.socket.mapper.ChatMessageMapHelper
    public Object buildChatAudioContent(String str, String str2, String str3, String str4, String str5, boolean z, Continuation<? super MessageContent.Audio> continuation) {
        String generate;
        if (str5 == null) {
            generate = this.botAudioMessageUrlGenerator.generate(str3, str4, str);
        } else if (z) {
            generate = this.botAudioMessageUrlGenerator.generatePremium(str5);
        } else {
            generate = this.userAudioMessageUrlGenerator.generate(str3, str4, str5);
        }
        return new MessageContent.Audio(str2, generate, z);
    }

    @Override // com.ifriend.data.socket.mapper.ChatMessageMapHelper
    public boolean isYours(String senderId) {
        UserId userId;
        Intrinsics.checkNotNullParameter(senderId, "senderId");
        AuthData value = this.authDataProvider.sessionAuthData().getValue();
        return Intrinsics.areEqual(senderId, (value == null || (userId = value.getUserId()) == null || (r0 = userId.getValue()) == null) ? false : false);
    }
}
