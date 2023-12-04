package com.ifriend.domain.models;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.cookie.ClientCookie;
/* compiled from: MessageMetaInfo.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\tJ2\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/ifriend/domain/models/MessageMetaInfo;", "", "reference", "", "preview", "hasAudio", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "getHasAudio", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getPreview", "()Ljava/lang/String;", "getReference", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/ifriend/domain/models/MessageMetaInfo;", "equals", "other", "hashCode", "", "toString", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MessageMetaInfo {
    private final Boolean hasAudio;
    private final String preview;
    private final String reference;

    public static /* synthetic */ MessageMetaInfo copy$default(MessageMetaInfo messageMetaInfo, String str, String str2, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = messageMetaInfo.reference;
        }
        if ((i & 2) != 0) {
            str2 = messageMetaInfo.preview;
        }
        if ((i & 4) != 0) {
            bool = messageMetaInfo.hasAudio;
        }
        return messageMetaInfo.copy(str, str2, bool);
    }

    public final String component1() {
        return this.reference;
    }

    public final String component2() {
        return this.preview;
    }

    public final Boolean component3() {
        return this.hasAudio;
    }

    public final MessageMetaInfo copy(String str, String str2, Boolean bool) {
        return new MessageMetaInfo(str, str2, bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MessageMetaInfo) {
            MessageMetaInfo messageMetaInfo = (MessageMetaInfo) obj;
            return Intrinsics.areEqual(this.reference, messageMetaInfo.reference) && Intrinsics.areEqual(this.preview, messageMetaInfo.preview) && Intrinsics.areEqual(this.hasAudio, messageMetaInfo.hasAudio);
        }
        return false;
    }

    public int hashCode() {
        String str = this.reference;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.preview;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.hasAudio;
        return hashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        String str = this.reference;
        String str2 = this.preview;
        Boolean bool = this.hasAudio;
        return "MessageMetaInfo(reference=" + str + ", preview=" + str2 + ", hasAudio=" + bool + ")";
    }

    public MessageMetaInfo(String str, String str2, Boolean bool) {
        this.reference = str;
        this.preview = str2;
        this.hasAudio = bool;
    }

    public final String getReference() {
        return this.reference;
    }

    public final String getPreview() {
        return this.preview;
    }

    public final Boolean getHasAudio() {
        return this.hasAudio;
    }
}
