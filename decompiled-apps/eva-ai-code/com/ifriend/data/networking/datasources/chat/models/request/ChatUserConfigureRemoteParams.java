package com.ifriend.data.networking.datasources.chat.models.request;

import com.google.gson.annotations.SerializedName;
import com.ifriend.domain.config.ConfigKeys;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ChatUserConfigureRemoteParams.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0004HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/ifriend/data/networking/datasources/chat/models/request/ChatUserConfigureRemoteParams;", "", ConfigKeys.FEATURE, "", "", "(Ljava/util/List;)V", "getFeatures", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatUserConfigureRemoteParams {
    @SerializedName(ConfigKeys.FEATURE)
    private final List<String> features;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChatUserConfigureRemoteParams copy$default(ChatUserConfigureRemoteParams chatUserConfigureRemoteParams, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = chatUserConfigureRemoteParams.features;
        }
        return chatUserConfigureRemoteParams.copy(list);
    }

    public final List<String> component1() {
        return this.features;
    }

    public final ChatUserConfigureRemoteParams copy(List<String> features) {
        Intrinsics.checkNotNullParameter(features, "features");
        return new ChatUserConfigureRemoteParams(features);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChatUserConfigureRemoteParams) && Intrinsics.areEqual(this.features, ((ChatUserConfigureRemoteParams) obj).features);
    }

    public int hashCode() {
        return this.features.hashCode();
    }

    public String toString() {
        List<String> list = this.features;
        return "ChatUserConfigureRemoteParams(features=" + list + ")";
    }

    public ChatUserConfigureRemoteParams(List<String> features) {
        Intrinsics.checkNotNullParameter(features, "features");
        this.features = features;
    }

    public final List<String> getFeatures() {
        return this.features;
    }
}
