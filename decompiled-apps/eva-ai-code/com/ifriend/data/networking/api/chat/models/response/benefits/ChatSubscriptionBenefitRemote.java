package com.ifriend.data.networking.api.chat.models.response.benefits;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ChatRootSubscriptionBenefitRemote.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0015B#\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/ifriend/data/networking/api/chat/models/response/benefits/ChatSubscriptionBenefitRemote;", "", "title", "", FirebaseAnalytics.Param.ITEMS, "", "Lcom/ifriend/data/networking/api/chat/models/response/benefits/ChatSubscriptionBenefitRemote$Benefit;", "(Ljava/lang/String;Ljava/util/List;)V", "getItems", "()Ljava/util/List;", "getTitle", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Benefit", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatSubscriptionBenefitRemote {
    @SerializedName(FirebaseAnalytics.Param.ITEMS)
    private final List<Benefit> items;
    @SerializedName("title")
    private final String title;

    public ChatSubscriptionBenefitRemote() {
        this(null, null, 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChatSubscriptionBenefitRemote copy$default(ChatSubscriptionBenefitRemote chatSubscriptionBenefitRemote, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = chatSubscriptionBenefitRemote.title;
        }
        if ((i & 2) != 0) {
            list = chatSubscriptionBenefitRemote.items;
        }
        return chatSubscriptionBenefitRemote.copy(str, list);
    }

    public final String component1() {
        return this.title;
    }

    public final List<Benefit> component2() {
        return this.items;
    }

    public final ChatSubscriptionBenefitRemote copy(String str, List<Benefit> list) {
        return new ChatSubscriptionBenefitRemote(str, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ChatSubscriptionBenefitRemote) {
            ChatSubscriptionBenefitRemote chatSubscriptionBenefitRemote = (ChatSubscriptionBenefitRemote) obj;
            return Intrinsics.areEqual(this.title, chatSubscriptionBenefitRemote.title) && Intrinsics.areEqual(this.items, chatSubscriptionBenefitRemote.items);
        }
        return false;
    }

    public int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<Benefit> list = this.items;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        String str = this.title;
        List<Benefit> list = this.items;
        return "ChatSubscriptionBenefitRemote(title=" + str + ", items=" + list + ")";
    }

    public ChatSubscriptionBenefitRemote(String str, List<Benefit> list) {
        this.title = str;
        this.items = list;
    }

    public /* synthetic */ ChatSubscriptionBenefitRemote(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list);
    }

    public final String getTitle() {
        return this.title;
    }

    public final List<Benefit> getItems() {
        return this.items;
    }

    /* compiled from: ChatRootSubscriptionBenefitRemote.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/ifriend/data/networking/api/chat/models/response/benefits/ChatSubscriptionBenefitRemote$Benefit;", "", "title", "", "description", "(Ljava/lang/String;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getTitle", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Benefit {
        @SerializedName("description")
        private final String description;
        @SerializedName("title")
        private final String title;

        public Benefit() {
            this(null, null, 3, null);
        }

        public static /* synthetic */ Benefit copy$default(Benefit benefit, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = benefit.title;
            }
            if ((i & 2) != 0) {
                str2 = benefit.description;
            }
            return benefit.copy(str, str2);
        }

        public final String component1() {
            return this.title;
        }

        public final String component2() {
            return this.description;
        }

        public final Benefit copy(String str, String str2) {
            return new Benefit(str, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Benefit) {
                Benefit benefit = (Benefit) obj;
                return Intrinsics.areEqual(this.title, benefit.title) && Intrinsics.areEqual(this.description, benefit.description);
            }
            return false;
        }

        public int hashCode() {
            String str = this.title;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.description;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            String str = this.title;
            String str2 = this.description;
            return "Benefit(title=" + str + ", description=" + str2 + ")";
        }

        public Benefit(String str, String str2) {
            this.title = str;
            this.description = str2;
        }

        public /* synthetic */ Benefit(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getDescription() {
            return this.description;
        }
    }
}
