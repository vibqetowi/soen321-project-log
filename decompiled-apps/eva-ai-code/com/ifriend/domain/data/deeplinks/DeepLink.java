package com.ifriend.domain.data.deeplinks;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.cookie.ClientCookie;
/* compiled from: DeepLink.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/ifriend/domain/data/deeplinks/DeepLink;", "", "OpenChat", "OpenDiary", "OpenGenerateAvatar", "OpenNeurons", "OpenSubscription", "Lcom/ifriend/domain/data/deeplinks/DeepLink$OpenChat;", "Lcom/ifriend/domain/data/deeplinks/DeepLink$OpenDiary;", "Lcom/ifriend/domain/data/deeplinks/DeepLink$OpenGenerateAvatar;", "Lcom/ifriend/domain/data/deeplinks/DeepLink$OpenNeurons;", "Lcom/ifriend/domain/data/deeplinks/DeepLink$OpenSubscription;", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface DeepLink {

    /* compiled from: DeepLink.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifriend/domain/data/deeplinks/DeepLink$OpenChat;", "Lcom/ifriend/domain/data/deeplinks/DeepLink;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class OpenChat implements DeepLink {
        public static final OpenChat INSTANCE = new OpenChat();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof OpenChat) {
                OpenChat openChat = (OpenChat) obj;
                return true;
            }
            return false;
        }

        public int hashCode() {
            return -234638373;
        }

        public String toString() {
            return "OpenChat";
        }

        private OpenChat() {
        }
    }

    /* compiled from: DeepLink.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/ifriend/domain/data/deeplinks/DeepLink$OpenDiary;", "Lcom/ifriend/domain/data/deeplinks/DeepLink;", "nodeId", "", "(Ljava/lang/String;)V", "getNodeId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class OpenDiary implements DeepLink {
        private final String nodeId;

        public static /* synthetic */ OpenDiary copy$default(OpenDiary openDiary, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = openDiary.nodeId;
            }
            return openDiary.copy(str);
        }

        public final String component1() {
            return this.nodeId;
        }

        public final OpenDiary copy(String nodeId) {
            Intrinsics.checkNotNullParameter(nodeId, "nodeId");
            return new OpenDiary(nodeId);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenDiary) && Intrinsics.areEqual(this.nodeId, ((OpenDiary) obj).nodeId);
        }

        public int hashCode() {
            return this.nodeId.hashCode();
        }

        public String toString() {
            String str = this.nodeId;
            return "OpenDiary(nodeId=" + str + ")";
        }

        public OpenDiary(String nodeId) {
            Intrinsics.checkNotNullParameter(nodeId, "nodeId");
            this.nodeId = nodeId;
        }

        public final String getNodeId() {
            return this.nodeId;
        }
    }

    /* compiled from: DeepLink.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifriend/domain/data/deeplinks/DeepLink$OpenGenerateAvatar;", "Lcom/ifriend/domain/data/deeplinks/DeepLink;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class OpenGenerateAvatar implements DeepLink {
        public static final OpenGenerateAvatar INSTANCE = new OpenGenerateAvatar();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof OpenGenerateAvatar) {
                OpenGenerateAvatar openGenerateAvatar = (OpenGenerateAvatar) obj;
                return true;
            }
            return false;
        }

        public int hashCode() {
            return -1769361423;
        }

        public String toString() {
            return "OpenGenerateAvatar";
        }

        private OpenGenerateAvatar() {
        }
    }

    /* compiled from: DeepLink.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifriend/domain/data/deeplinks/DeepLink$OpenSubscription;", "Lcom/ifriend/domain/data/deeplinks/DeepLink;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class OpenSubscription implements DeepLink {
        public static final OpenSubscription INSTANCE = new OpenSubscription();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof OpenSubscription) {
                OpenSubscription openSubscription = (OpenSubscription) obj;
                return true;
            }
            return false;
        }

        public int hashCode() {
            return -837794144;
        }

        public String toString() {
            return "OpenSubscription";
        }

        private OpenSubscription() {
        }
    }

    /* compiled from: DeepLink.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifriend/domain/data/deeplinks/DeepLink$OpenNeurons;", "Lcom/ifriend/domain/data/deeplinks/DeepLink;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class OpenNeurons implements DeepLink {
        public static final OpenNeurons INSTANCE = new OpenNeurons();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof OpenNeurons) {
                OpenNeurons openNeurons = (OpenNeurons) obj;
                return true;
            }
            return false;
        }

        public int hashCode() {
            return -1094739971;
        }

        public String toString() {
            return "OpenNeurons";
        }

        private OpenNeurons() {
        }
    }
}
