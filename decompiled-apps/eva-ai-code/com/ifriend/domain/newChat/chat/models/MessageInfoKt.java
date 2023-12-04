package com.ifriend.domain.newChat.chat.models;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.cookie.ClientCookie;
/* compiled from: MessageInfo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"id", "", "Lcom/ifriend/domain/newChat/chat/models/MessageInfo;", "getId", "(Lcom/ifriend/domain/newChat/chat/models/MessageInfo;)Ljava/lang/String;", ClientCookie.DOMAIN_ATTR}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MessageInfoKt {
    public static final String getId(MessageInfo messageInfo) {
        Intrinsics.checkNotNullParameter(messageInfo, "<this>");
        return messageInfo.getIds().getMessageId();
    }
}
