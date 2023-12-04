package com.ifriend.domain.socket;

import androidx.exifinterface.media.ExifInterface;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.apache.http.cookie.ClientCookie;
/* compiled from: MessagesSource.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a)\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u0086\b¨\u0006\u0007"}, d2 = {"getMessagesOf", "Lkotlinx/coroutines/flow/Flow;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/ifriend/domain/socket/MessagesSourceMessage;", "Lcom/ifriend/domain/socket/MessagesSource;", TtmlNode.START, "", ClientCookie.DOMAIN_ATTR}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MessagesSourceKt {
    public static /* synthetic */ Flow getMessagesOf$default(MessagesSource messagesSource, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        Intrinsics.checkNotNullParameter(messagesSource, "<this>");
        Flow<MessagesSourceMessage> allMessages = messagesSource.getAllMessages(z);
        Intrinsics.needClassReification();
        return new MessagesSourceKt$getMessagesOf$$inlined$filterIsInstance$1(allMessages);
    }

    public static final /* synthetic */ <T extends MessagesSourceMessage> Flow<T> getMessagesOf(MessagesSource messagesSource, boolean z) {
        Intrinsics.checkNotNullParameter(messagesSource, "<this>");
        Flow<MessagesSourceMessage> allMessages = messagesSource.getAllMessages(z);
        Intrinsics.needClassReification();
        return new MessagesSourceKt$getMessagesOf$$inlined$filterIsInstance$1(allMessages);
    }
}
