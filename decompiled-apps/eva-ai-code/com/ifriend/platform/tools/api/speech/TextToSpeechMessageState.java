package com.ifriend.platform.tools.api.speech;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: TextToSpeechStream.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0007\b\tB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0003\n\u000b\f¨\u0006\r"}, d2 = {"Lcom/ifriend/platform/tools/api/speech/TextToSpeechMessageState;", "", "messageId", "", "(Ljava/lang/String;)V", "getMessageId", "()Ljava/lang/String;", "Done", "Error", "Start", "Lcom/ifriend/platform/tools/api/speech/TextToSpeechMessageState$Done;", "Lcom/ifriend/platform/tools/api/speech/TextToSpeechMessageState$Error;", "Lcom/ifriend/platform/tools/api/speech/TextToSpeechMessageState$Start;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class TextToSpeechMessageState {
    private final String messageId;

    public /* synthetic */ TextToSpeechMessageState(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    /* compiled from: TextToSpeechStream.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/ifriend/platform/tools/api/speech/TextToSpeechMessageState$Start;", "Lcom/ifriend/platform/tools/api/speech/TextToSpeechMessageState;", "messageId", "", "(Ljava/lang/String;)V", "getMessageId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Start extends TextToSpeechMessageState {
        private final String messageId;

        public static /* synthetic */ Start copy$default(Start start, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = start.messageId;
            }
            return start.copy(str);
        }

        public final String component1() {
            return this.messageId;
        }

        public final Start copy(String messageId) {
            Intrinsics.checkNotNullParameter(messageId, "messageId");
            return new Start(messageId);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Start) && Intrinsics.areEqual(this.messageId, ((Start) obj).messageId);
        }

        public int hashCode() {
            return this.messageId.hashCode();
        }

        public String toString() {
            String str = this.messageId;
            return "Start(messageId=" + str + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Start(String messageId) {
            super(messageId, null);
            Intrinsics.checkNotNullParameter(messageId, "messageId");
            this.messageId = messageId;
        }

        @Override // com.ifriend.platform.tools.api.speech.TextToSpeechMessageState
        public String getMessageId() {
            return this.messageId;
        }
    }

    private TextToSpeechMessageState(String str) {
        this.messageId = str;
    }

    public String getMessageId() {
        return this.messageId;
    }

    /* compiled from: TextToSpeechStream.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/ifriend/platform/tools/api/speech/TextToSpeechMessageState$Done;", "Lcom/ifriend/platform/tools/api/speech/TextToSpeechMessageState;", "messageId", "", "(Ljava/lang/String;)V", "getMessageId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Done extends TextToSpeechMessageState {
        private final String messageId;

        public static /* synthetic */ Done copy$default(Done done, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = done.messageId;
            }
            return done.copy(str);
        }

        public final String component1() {
            return this.messageId;
        }

        public final Done copy(String messageId) {
            Intrinsics.checkNotNullParameter(messageId, "messageId");
            return new Done(messageId);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Done) && Intrinsics.areEqual(this.messageId, ((Done) obj).messageId);
        }

        public int hashCode() {
            return this.messageId.hashCode();
        }

        public String toString() {
            String str = this.messageId;
            return "Done(messageId=" + str + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Done(String messageId) {
            super(messageId, null);
            Intrinsics.checkNotNullParameter(messageId, "messageId");
            this.messageId = messageId;
        }

        @Override // com.ifriend.platform.tools.api.speech.TextToSpeechMessageState
        public String getMessageId() {
            return this.messageId;
        }
    }

    /* compiled from: TextToSpeechStream.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/ifriend/platform/tools/api/speech/TextToSpeechMessageState$Error;", "Lcom/ifriend/platform/tools/api/speech/TextToSpeechMessageState;", "messageId", "", "(Ljava/lang/String;)V", "getMessageId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Error extends TextToSpeechMessageState {
        private final String messageId;

        public static /* synthetic */ Error copy$default(Error error, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = error.messageId;
            }
            return error.copy(str);
        }

        public final String component1() {
            return this.messageId;
        }

        public final Error copy(String messageId) {
            Intrinsics.checkNotNullParameter(messageId, "messageId");
            return new Error(messageId);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && Intrinsics.areEqual(this.messageId, ((Error) obj).messageId);
        }

        public int hashCode() {
            return this.messageId.hashCode();
        }

        public String toString() {
            String str = this.messageId;
            return "Error(messageId=" + str + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(String messageId) {
            super(messageId, null);
            Intrinsics.checkNotNullParameter(messageId, "messageId");
            this.messageId = messageId;
        }

        @Override // com.ifriend.platform.tools.api.speech.TextToSpeechMessageState
        public String getMessageId() {
            return this.messageId;
        }
    }
}
