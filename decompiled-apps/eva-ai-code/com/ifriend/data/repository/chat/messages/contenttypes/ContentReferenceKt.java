package com.ifriend.data.repository.chat.messages.contenttypes;

import com.facebook.internal.security.CertificateUtil;
import com.ifriend.data.networking.datasources.chat.models.response.client.ChatMessageMetaRemote;
import com.ifriend.data.networking.datasources.chat.models.response.client.ChatMessageRemote;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
/* compiled from: ContentReference.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u001a\f\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002\u001a\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0003¨\u0006\u0004"}, d2 = {"getContentReference", "Lcom/ifriend/data/repository/chat/messages/contenttypes/ContentReference;", "Lcom/ifriend/data/networking/datasources/chat/models/response/client/ChatMessageRemote;", "", "data_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ContentReferenceKt {
    public static final ContentReference getContentReference(ChatMessageRemote chatMessageRemote) {
        String reference;
        List split$default;
        Intrinsics.checkNotNullParameter(chatMessageRemote, "<this>");
        ChatMessageMetaRemote meta = chatMessageRemote.getMeta();
        if (meta == null || (reference = meta.getReference()) == null || (split$default = StringsKt.split$default((CharSequence) reference, new String[]{CertificateUtil.DELIMITER}, false, 0, 6, (Object) null)) == null) {
            return null;
        }
        return new ContentReference((String) split$default.get(0), (String) split$default.get(1));
    }

    public static final ContentReference getContentReference(String str) {
        List split$default;
        if (str == null || (split$default = StringsKt.split$default((CharSequence) str, new String[]{CertificateUtil.DELIMITER}, false, 0, 6, (Object) null)) == null) {
            return null;
        }
        return new ContentReference((String) split$default.get(0), (String) split$default.get(1));
    }
}
