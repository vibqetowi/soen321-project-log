package com.ifriend.data.socket.mapper;

import com.ifriend.domain.newChat.chat.models.MessageContent;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
/* compiled from: ChatMessageMapHelper.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001JI\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\n\u001a\u00020\u000bH¦@ø\u0001\u0000¢\u0006\u0002\u0010\fJ)\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0005H&\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Lcom/ifriend/data/socket/mapper/ChatMessageMapHelper;", "", "buildChatAudioContent", "Lcom/ifriend/domain/newChat/chat/models/MessageContent$Audio;", "id", "", "text", "sender", "recipient", "reference", "isPremium", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "buildChatPhotoContent", "Lcom/ifriend/domain/newChat/chat/models/MessageContent$Image;", "preview", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isYours", "senderId", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ChatMessageMapHelper {
    Object buildChatAudioContent(String str, String str2, String str3, String str4, String str5, boolean z, Continuation<? super MessageContent.Audio> continuation);

    Object buildChatPhotoContent(String str, String str2, Continuation<? super MessageContent.Image> continuation);

    boolean isYours(String str);

    /* compiled from: ChatMessageMapHelper.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ Object buildChatPhotoContent$default(ChatMessageMapHelper chatMessageMapHelper, String str, String str2, Continuation continuation, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    str2 = null;
                }
                return chatMessageMapHelper.buildChatPhotoContent(str, str2, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: buildChatPhotoContent");
        }

        public static /* synthetic */ Object buildChatAudioContent$default(ChatMessageMapHelper chatMessageMapHelper, String str, String str2, String str3, String str4, String str5, boolean z, Continuation continuation, int i, Object obj) {
            if (obj == null) {
                return chatMessageMapHelper.buildChatAudioContent(str, str2, str3, str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? false : z, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: buildChatAudioContent");
        }
    }
}
