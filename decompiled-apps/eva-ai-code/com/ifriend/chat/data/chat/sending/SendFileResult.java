package com.ifriend.chat.data.chat.sending;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ChatMessagesRepositoryImpl.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/ifriend/chat/data/chat/sending/SendFileResult;", "", "()V", "Failure", "IncorrectFormat", "Success", "Lcom/ifriend/chat/data/chat/sending/SendFileResult$Failure;", "Lcom/ifriend/chat/data/chat/sending/SendFileResult$IncorrectFormat;", "Lcom/ifriend/chat/data/chat/sending/SendFileResult$Success;", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class SendFileResult {
    public /* synthetic */ SendFileResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: ChatMessagesRepositoryImpl.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/ifriend/chat/data/chat/sending/SendFileResult$Success;", "Lcom/ifriend/chat/data/chat/sending/SendFileResult;", "fileName", "", "(Ljava/lang/String;)V", "getFileName", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Success extends SendFileResult {
        private final String fileName;

        public static /* synthetic */ Success copy$default(Success success, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = success.fileName;
            }
            return success.copy(str);
        }

        public final String component1() {
            return this.fileName;
        }

        public final Success copy(String fileName) {
            Intrinsics.checkNotNullParameter(fileName, "fileName");
            return new Success(fileName);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && Intrinsics.areEqual(this.fileName, ((Success) obj).fileName);
        }

        public int hashCode() {
            return this.fileName.hashCode();
        }

        public String toString() {
            String str = this.fileName;
            return "Success(fileName=" + str + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(String fileName) {
            super(null);
            Intrinsics.checkNotNullParameter(fileName, "fileName");
            this.fileName = fileName;
        }

        public final String getFileName() {
            return this.fileName;
        }
    }

    private SendFileResult() {
    }

    /* compiled from: ChatMessagesRepositoryImpl.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/ifriend/chat/data/chat/sending/SendFileResult$Failure;", "Lcom/ifriend/chat/data/chat/sending/SendFileResult;", "()V", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Failure extends SendFileResult {
        public static final Failure INSTANCE = new Failure();

        private Failure() {
            super(null);
        }
    }

    /* compiled from: ChatMessagesRepositoryImpl.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/ifriend/chat/data/chat/sending/SendFileResult$IncorrectFormat;", "Lcom/ifriend/chat/data/chat/sending/SendFileResult;", "()V", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class IncorrectFormat extends SendFileResult {
        public static final IncorrectFormat INSTANCE = new IncorrectFormat();

        private IncorrectFormat() {
            super(null);
        }
    }
}
