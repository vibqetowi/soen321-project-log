package com.ifriend.presentation.features.purchases.chatsubscription.subscription.models;

import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ChatSubscriptionOfferUi.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B \u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0002\u0010\u0007J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u0019\u0010\u000f\u001a\u00020\u0005HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\tJ\u0019\u0010\u0011\u001a\u00020\u0005HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\tJ4\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0006\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001c"}, d2 = {"Lcom/ifriend/presentation/features/purchases/chatsubscription/subscription/models/ChatSubscriptionOfferBadgesUi;", "", "title", "", "background", "Landroidx/compose/ui/graphics/Color;", "shadowColor", "(Ljava/lang/String;JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getBackground-0d7_KjU", "()J", "J", "getShadowColor-0d7_KjU", "getTitle", "()Ljava/lang/String;", "component1", "component2", "component2-0d7_KjU", "component3", "component3-0d7_KjU", "copy", "copy-WkMS-hQ", "(Ljava/lang/String;JJ)Lcom/ifriend/presentation/features/purchases/chatsubscription/subscription/models/ChatSubscriptionOfferBadgesUi;", "equals", "", "other", "hashCode", "", "toString", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatSubscriptionOfferBadgesUi {
    public static final int $stable = 0;
    private final long background;
    private final long shadowColor;
    private final String title;

    public /* synthetic */ ChatSubscriptionOfferBadgesUi(String str, long j, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j, j2);
    }

    /* renamed from: copy-WkMS-hQ$default  reason: not valid java name */
    public static /* synthetic */ ChatSubscriptionOfferBadgesUi m6970copyWkMShQ$default(ChatSubscriptionOfferBadgesUi chatSubscriptionOfferBadgesUi, String str, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = chatSubscriptionOfferBadgesUi.title;
        }
        if ((i & 2) != 0) {
            j = chatSubscriptionOfferBadgesUi.background;
        }
        long j3 = j;
        if ((i & 4) != 0) {
            j2 = chatSubscriptionOfferBadgesUi.shadowColor;
        }
        return chatSubscriptionOfferBadgesUi.m6973copyWkMShQ(str, j3, j2);
    }

    public final String component1() {
        return this.title;
    }

    /* renamed from: component2-0d7_KjU  reason: not valid java name */
    public final long m6971component20d7_KjU() {
        return this.background;
    }

    /* renamed from: component3-0d7_KjU  reason: not valid java name */
    public final long m6972component30d7_KjU() {
        return this.shadowColor;
    }

    /* renamed from: copy-WkMS-hQ  reason: not valid java name */
    public final ChatSubscriptionOfferBadgesUi m6973copyWkMShQ(String title, long j, long j2) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new ChatSubscriptionOfferBadgesUi(title, j, j2, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ChatSubscriptionOfferBadgesUi) {
            ChatSubscriptionOfferBadgesUi chatSubscriptionOfferBadgesUi = (ChatSubscriptionOfferBadgesUi) obj;
            return Intrinsics.areEqual(this.title, chatSubscriptionOfferBadgesUi.title) && Color.m3292equalsimpl0(this.background, chatSubscriptionOfferBadgesUi.background) && Color.m3292equalsimpl0(this.shadowColor, chatSubscriptionOfferBadgesUi.shadowColor);
        }
        return false;
    }

    public int hashCode() {
        return (((this.title.hashCode() * 31) + Color.m3298hashCodeimpl(this.background)) * 31) + Color.m3298hashCodeimpl(this.shadowColor);
    }

    public String toString() {
        String str = this.title;
        String m3299toStringimpl = Color.m3299toStringimpl(this.background);
        String m3299toStringimpl2 = Color.m3299toStringimpl(this.shadowColor);
        return "ChatSubscriptionOfferBadgesUi(title=" + str + ", background=" + m3299toStringimpl + ", shadowColor=" + m3299toStringimpl2 + ")";
    }

    private ChatSubscriptionOfferBadgesUi(String title, long j, long j2) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.title = title;
        this.background = j;
        this.shadowColor = j2;
    }

    public final String getTitle() {
        return this.title;
    }

    /* renamed from: getBackground-0d7_KjU  reason: not valid java name */
    public final long m6974getBackground0d7_KjU() {
        return this.background;
    }

    /* renamed from: getShadowColor-0d7_KjU  reason: not valid java name */
    public final long m6975getShadowColor0d7_KjU() {
        return this.shadowColor;
    }
}
