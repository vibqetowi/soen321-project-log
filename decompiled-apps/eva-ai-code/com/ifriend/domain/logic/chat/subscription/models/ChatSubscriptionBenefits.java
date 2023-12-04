package com.ifriend.domain.logic.chat.subscription.models;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.cookie.ClientCookie;
/* compiled from: ChatSubscriptionBenefits.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0015B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/ifriend/domain/logic/chat/subscription/models/ChatSubscriptionBenefits;", "", "title", "", "benefits", "", "Lcom/ifriend/domain/logic/chat/subscription/models/ChatSubscriptionBenefits$Benefit;", "(Ljava/lang/String;Ljava/util/List;)V", "getBenefits", "()Ljava/util/List;", "getTitle", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Benefit", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatSubscriptionBenefits {
    private final List<Benefit> benefits;
    private final String title;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChatSubscriptionBenefits copy$default(ChatSubscriptionBenefits chatSubscriptionBenefits, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = chatSubscriptionBenefits.title;
        }
        if ((i & 2) != 0) {
            list = chatSubscriptionBenefits.benefits;
        }
        return chatSubscriptionBenefits.copy(str, list);
    }

    public final String component1() {
        return this.title;
    }

    public final List<Benefit> component2() {
        return this.benefits;
    }

    public final ChatSubscriptionBenefits copy(String title, List<Benefit> benefits) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(benefits, "benefits");
        return new ChatSubscriptionBenefits(title, benefits);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ChatSubscriptionBenefits) {
            ChatSubscriptionBenefits chatSubscriptionBenefits = (ChatSubscriptionBenefits) obj;
            return Intrinsics.areEqual(this.title, chatSubscriptionBenefits.title) && Intrinsics.areEqual(this.benefits, chatSubscriptionBenefits.benefits);
        }
        return false;
    }

    public int hashCode() {
        return (this.title.hashCode() * 31) + this.benefits.hashCode();
    }

    public String toString() {
        String str = this.title;
        List<Benefit> list = this.benefits;
        return "ChatSubscriptionBenefits(title=" + str + ", benefits=" + list + ")";
    }

    public ChatSubscriptionBenefits(String title, List<Benefit> benefits) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(benefits, "benefits");
        this.title = title;
        this.benefits = benefits;
    }

    public final String getTitle() {
        return this.title;
    }

    public /* synthetic */ ChatSubscriptionBenefits(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? CollectionsKt.emptyList() : list);
    }

    public final List<Benefit> getBenefits() {
        return this.benefits;
    }

    /* compiled from: ChatSubscriptionBenefits.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/ifriend/domain/logic/chat/subscription/models/ChatSubscriptionBenefits$Benefit;", "", "title", "", "description", "(Ljava/lang/String;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getTitle", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Benefit {
        private final String description;
        private final String title;

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

        public final Benefit copy(String title, String description) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            return new Benefit(title, description);
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
            return (this.title.hashCode() * 31) + this.description.hashCode();
        }

        public String toString() {
            String str = this.title;
            String str2 = this.description;
            return "Benefit(title=" + str + ", description=" + str2 + ")";
        }

        public Benefit(String title, String description) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            this.title = title;
            this.description = description;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getDescription() {
            return this.description;
        }
    }
}
