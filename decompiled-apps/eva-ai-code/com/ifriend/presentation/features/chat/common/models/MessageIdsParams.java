package com.ifriend.presentation.features.chat.common.models;

import com.google.gson.annotations.SerializedName;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
/* compiled from: MessageIdsParams.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0002!\"B7\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nB\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0002\u0010\u000bJ\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001J!\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 HÇ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006#"}, d2 = {"Lcom/ifriend/presentation/features/chat/common/models/MessageIdsParams;", "Ljava/io/Serializable;", "seen1", "", "messageId", "", "senderId", "recipientId", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getMessageId", "()Ljava/lang/String;", "getRecipientId", "getSenderId", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Serializable
/* loaded from: classes6.dex */
public final class MessageIdsParams implements java.io.Serializable {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    @SerializedName("messageId")
    private final String messageId;
    @SerializedName("recipientId")
    private final String recipientId;
    @SerializedName("senderId")
    private final String senderId;

    public static /* synthetic */ MessageIdsParams copy$default(MessageIdsParams messageIdsParams, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = messageIdsParams.messageId;
        }
        if ((i & 2) != 0) {
            str2 = messageIdsParams.senderId;
        }
        if ((i & 4) != 0) {
            str3 = messageIdsParams.recipientId;
        }
        return messageIdsParams.copy(str, str2, str3);
    }

    public final String component1() {
        return this.messageId;
    }

    public final String component2() {
        return this.senderId;
    }

    public final String component3() {
        return this.recipientId;
    }

    public final MessageIdsParams copy(String messageId, String senderId, String recipientId) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Intrinsics.checkNotNullParameter(senderId, "senderId");
        Intrinsics.checkNotNullParameter(recipientId, "recipientId");
        return new MessageIdsParams(messageId, senderId, recipientId);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MessageIdsParams) {
            MessageIdsParams messageIdsParams = (MessageIdsParams) obj;
            return Intrinsics.areEqual(this.messageId, messageIdsParams.messageId) && Intrinsics.areEqual(this.senderId, messageIdsParams.senderId) && Intrinsics.areEqual(this.recipientId, messageIdsParams.recipientId);
        }
        return false;
    }

    public int hashCode() {
        return (((this.messageId.hashCode() * 31) + this.senderId.hashCode()) * 31) + this.recipientId.hashCode();
    }

    public String toString() {
        String str = this.messageId;
        String str2 = this.senderId;
        String str3 = this.recipientId;
        return "MessageIdsParams(messageId=" + str + ", senderId=" + str2 + ", recipientId=" + str3 + ")";
    }

    /* compiled from: MessageIdsParams.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/ifriend/presentation/features/chat/common/models/MessageIdsParams$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/ifriend/presentation/features/chat/common/models/MessageIdsParams;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<MessageIdsParams> serializer() {
            return MessageIdsParams$$serializer.INSTANCE;
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ MessageIdsParams(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, MessageIdsParams$$serializer.INSTANCE.getDescriptor());
        }
        this.messageId = str;
        this.senderId = str2;
        this.recipientId = str3;
    }

    public MessageIdsParams(String messageId, String senderId, String recipientId) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Intrinsics.checkNotNullParameter(senderId, "senderId");
        Intrinsics.checkNotNullParameter(recipientId, "recipientId");
        this.messageId = messageId;
        this.senderId = senderId;
        this.recipientId = recipientId;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self(MessageIdsParams messageIdsParams, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, messageIdsParams.messageId);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, messageIdsParams.senderId);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, messageIdsParams.recipientId);
    }

    public final String getMessageId() {
        return this.messageId;
    }

    public final String getSenderId() {
        return this.senderId;
    }

    public final String getRecipientId() {
        return this.recipientId;
    }
}
