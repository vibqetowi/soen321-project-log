package com.ifriend.presentation.features.chat.gifts.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ExtensionsKt;
import kotlinx.collections.immutable.PersistentList;
/* compiled from: ChatGiftsUiState.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\t¢\u0006\u0002\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\tHÆ\u0003JC\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00032\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\t¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u000f¨\u0006\u001e"}, d2 = {"Lcom/ifriend/presentation/features/chat/gifts/model/ChatGiftsUiState;", "", "isShowGiftButtonAvailable", "", "isShowGiftButton", "buttonGift", "Lcom/ifriend/presentation/features/chat/gifts/model/ChatGiftUi;", "isShowGiftsContent", "gifts", "Lkotlinx/collections/immutable/PersistentList;", "(ZZLcom/ifriend/presentation/features/chat/gifts/model/ChatGiftUi;ZLkotlinx/collections/immutable/PersistentList;)V", "getButtonGift", "()Lcom/ifriend/presentation/features/chat/gifts/model/ChatGiftUi;", "canShowGiftButton", "getCanShowGiftButton", "()Z", "getGifts", "()Lkotlinx/collections/immutable/PersistentList;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatGiftsUiState {
    public static final int $stable = 0;
    private final ChatGiftUi buttonGift;
    private final PersistentList<ChatGiftUi> gifts;
    private final boolean isShowGiftButton;
    private final boolean isShowGiftButtonAvailable;
    private final boolean isShowGiftsContent;

    public ChatGiftsUiState() {
        this(false, false, null, false, null, 31, null);
    }

    public static /* synthetic */ ChatGiftsUiState copy$default(ChatGiftsUiState chatGiftsUiState, boolean z, boolean z2, ChatGiftUi chatGiftUi, boolean z3, PersistentList persistentList, int i, Object obj) {
        if ((i & 1) != 0) {
            z = chatGiftsUiState.isShowGiftButtonAvailable;
        }
        if ((i & 2) != 0) {
            z2 = chatGiftsUiState.isShowGiftButton;
        }
        boolean z4 = z2;
        if ((i & 4) != 0) {
            chatGiftUi = chatGiftsUiState.buttonGift;
        }
        ChatGiftUi chatGiftUi2 = chatGiftUi;
        if ((i & 8) != 0) {
            z3 = chatGiftsUiState.isShowGiftsContent;
        }
        boolean z5 = z3;
        PersistentList<ChatGiftUi> persistentList2 = persistentList;
        if ((i & 16) != 0) {
            persistentList2 = chatGiftsUiState.gifts;
        }
        return chatGiftsUiState.copy(z, z4, chatGiftUi2, z5, persistentList2);
    }

    public final boolean component1() {
        return this.isShowGiftButtonAvailable;
    }

    public final boolean component2() {
        return this.isShowGiftButton;
    }

    public final ChatGiftUi component3() {
        return this.buttonGift;
    }

    public final boolean component4() {
        return this.isShowGiftsContent;
    }

    public final PersistentList<ChatGiftUi> component5() {
        return this.gifts;
    }

    public final ChatGiftsUiState copy(boolean z, boolean z2, ChatGiftUi chatGiftUi, boolean z3, PersistentList<ChatGiftUi> gifts) {
        Intrinsics.checkNotNullParameter(gifts, "gifts");
        return new ChatGiftsUiState(z, z2, chatGiftUi, z3, gifts);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ChatGiftsUiState) {
            ChatGiftsUiState chatGiftsUiState = (ChatGiftsUiState) obj;
            return this.isShowGiftButtonAvailable == chatGiftsUiState.isShowGiftButtonAvailable && this.isShowGiftButton == chatGiftsUiState.isShowGiftButton && Intrinsics.areEqual(this.buttonGift, chatGiftsUiState.buttonGift) && this.isShowGiftsContent == chatGiftsUiState.isShowGiftsContent && Intrinsics.areEqual(this.gifts, chatGiftsUiState.gifts);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    public int hashCode() {
        boolean z = this.isShowGiftButtonAvailable;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        ?? r2 = this.isShowGiftButton;
        int i2 = r2;
        if (r2 != 0) {
            i2 = 1;
        }
        int i3 = (i + i2) * 31;
        ChatGiftUi chatGiftUi = this.buttonGift;
        int hashCode = (i3 + (chatGiftUi == null ? 0 : chatGiftUi.hashCode())) * 31;
        boolean z2 = this.isShowGiftsContent;
        return ((hashCode + (z2 ? 1 : z2 ? 1 : 0)) * 31) + this.gifts.hashCode();
    }

    public String toString() {
        boolean z = this.isShowGiftButtonAvailable;
        boolean z2 = this.isShowGiftButton;
        ChatGiftUi chatGiftUi = this.buttonGift;
        boolean z3 = this.isShowGiftsContent;
        PersistentList<ChatGiftUi> persistentList = this.gifts;
        return "ChatGiftsUiState(isShowGiftButtonAvailable=" + z + ", isShowGiftButton=" + z2 + ", buttonGift=" + chatGiftUi + ", isShowGiftsContent=" + z3 + ", gifts=" + persistentList + ")";
    }

    public ChatGiftsUiState(boolean z, boolean z2, ChatGiftUi chatGiftUi, boolean z3, PersistentList<ChatGiftUi> gifts) {
        Intrinsics.checkNotNullParameter(gifts, "gifts");
        this.isShowGiftButtonAvailable = z;
        this.isShowGiftButton = z2;
        this.buttonGift = chatGiftUi;
        this.isShowGiftsContent = z3;
        this.gifts = gifts;
    }

    public final boolean isShowGiftButtonAvailable() {
        return this.isShowGiftButtonAvailable;
    }

    public final boolean isShowGiftButton() {
        return this.isShowGiftButton;
    }

    public final ChatGiftUi getButtonGift() {
        return this.buttonGift;
    }

    public final boolean isShowGiftsContent() {
        return this.isShowGiftsContent;
    }

    public /* synthetic */ ChatGiftsUiState(boolean z, boolean z2, ChatGiftUi chatGiftUi, boolean z3, PersistentList persistentList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? true : z2, (i & 4) != 0 ? null : chatGiftUi, (i & 8) == 0 ? z3 : false, (i & 16) != 0 ? ExtensionsKt.persistentListOf() : persistentList);
    }

    public final PersistentList<ChatGiftUi> getGifts() {
        return this.gifts;
    }

    public final boolean getCanShowGiftButton() {
        return this.isShowGiftButton && this.isShowGiftButtonAvailable && this.buttonGift != null;
    }
}
