package com.ifriend.domain.exceptions.features;

import com.ifriend.domain.exceptions.features.common.FeatureException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.apache.http.cookie.ClientCookie;
/* compiled from: ChatMessageAccessFeatureException.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/ifriend/domain/exceptions/features/ChatMessageAccessFeatureException;", "Lcom/ifriend/domain/exceptions/features/common/FeatureException;", "()V", "BuyChatMessageFailure", "UnknownMessageType", "Lcom/ifriend/domain/exceptions/features/ChatMessageAccessFeatureException$BuyChatMessageFailure;", "Lcom/ifriend/domain/exceptions/features/ChatMessageAccessFeatureException$UnknownMessageType;", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class ChatMessageAccessFeatureException extends FeatureException {
    public /* synthetic */ ChatMessageAccessFeatureException(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ChatMessageAccessFeatureException() {
    }

    /* compiled from: ChatMessageAccessFeatureException.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifriend/domain/exceptions/features/ChatMessageAccessFeatureException$BuyChatMessageFailure;", "Lcom/ifriend/domain/exceptions/features/ChatMessageAccessFeatureException;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class BuyChatMessageFailure extends ChatMessageAccessFeatureException {
        public static final BuyChatMessageFailure INSTANCE = new BuyChatMessageFailure();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof BuyChatMessageFailure) {
                BuyChatMessageFailure buyChatMessageFailure = (BuyChatMessageFailure) obj;
                return true;
            }
            return false;
        }

        public int hashCode() {
            return 116496578;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "BuyChatMessageFailure";
        }

        private BuyChatMessageFailure() {
            super(null);
        }
    }

    /* compiled from: ChatMessageAccessFeatureException.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifriend/domain/exceptions/features/ChatMessageAccessFeatureException$UnknownMessageType;", "Lcom/ifriend/domain/exceptions/features/ChatMessageAccessFeatureException;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class UnknownMessageType extends ChatMessageAccessFeatureException {
        public static final UnknownMessageType INSTANCE = new UnknownMessageType();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof UnknownMessageType) {
                UnknownMessageType unknownMessageType = (UnknownMessageType) obj;
                return true;
            }
            return false;
        }

        public int hashCode() {
            return 2087572022;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "UnknownMessageType";
        }

        private UnknownMessageType() {
            super(null);
        }
    }
}
