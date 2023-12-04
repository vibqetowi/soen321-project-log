package com.ifriend.presentation.features.onboarding.steps.view.selectbot;

import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ExtensionsKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.PersistentList;
/* compiled from: OnboardingBotPagerState.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u0001:\u0001'BQ\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0002\u0010\u000eJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÆ\u0003J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\t\u0010 \u001a\u00020\fHÆ\u0003J\t\u0010!\u001a\u00020\fHÆ\u0003JU\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001J\u0013\u0010#\u001a\u00020\u00062\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\fHÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\r\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0019R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0019R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012¨\u0006("}, d2 = {"Lcom/ifriend/presentation/features/onboarding/steps/view/selectbot/OnboardingBotPagerState;", "", "titleLabel", "", "buttonLabel", "isNeedSelectChat", "", "isButtonActive", "bots", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/ifriend/presentation/features/onboarding/steps/view/selectbot/OnboardingBotPagerState$Bot;", "initPageIndex", "", "currentPage", "(Ljava/lang/String;Ljava/lang/String;ZZLkotlinx/collections/immutable/ImmutableList;II)V", "getBots", "()Lkotlinx/collections/immutable/ImmutableList;", "getButtonLabel", "()Ljava/lang/String;", "currentBot", "getCurrentBot", "()Lcom/ifriend/presentation/features/onboarding/steps/view/selectbot/OnboardingBotPagerState$Bot;", "getCurrentPage", "()I", "getInitPageIndex", "()Z", "getTitleLabel", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "Bot", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OnboardingBotPagerState {
    public static final int $stable = 0;
    private final ImmutableList<Bot> bots;
    private final String buttonLabel;
    private final Bot currentBot;
    private final int currentPage;
    private final int initPageIndex;
    private final boolean isButtonActive;
    private final boolean isNeedSelectChat;
    private final String titleLabel;

    public OnboardingBotPagerState() {
        this(null, null, false, false, null, 0, 0, 127, null);
    }

    public static /* synthetic */ OnboardingBotPagerState copy$default(OnboardingBotPagerState onboardingBotPagerState, String str, String str2, boolean z, boolean z2, ImmutableList immutableList, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = onboardingBotPagerState.titleLabel;
        }
        if ((i3 & 2) != 0) {
            str2 = onboardingBotPagerState.buttonLabel;
        }
        String str3 = str2;
        if ((i3 & 4) != 0) {
            z = onboardingBotPagerState.isNeedSelectChat;
        }
        boolean z3 = z;
        if ((i3 & 8) != 0) {
            z2 = onboardingBotPagerState.isButtonActive;
        }
        boolean z4 = z2;
        ImmutableList<Bot> immutableList2 = immutableList;
        if ((i3 & 16) != 0) {
            immutableList2 = onboardingBotPagerState.bots;
        }
        ImmutableList immutableList3 = immutableList2;
        if ((i3 & 32) != 0) {
            i = onboardingBotPagerState.initPageIndex;
        }
        int i4 = i;
        if ((i3 & 64) != 0) {
            i2 = onboardingBotPagerState.currentPage;
        }
        return onboardingBotPagerState.copy(str, str3, z3, z4, immutableList3, i4, i2);
    }

    public final String component1() {
        return this.titleLabel;
    }

    public final String component2() {
        return this.buttonLabel;
    }

    public final boolean component3() {
        return this.isNeedSelectChat;
    }

    public final boolean component4() {
        return this.isButtonActive;
    }

    public final ImmutableList<Bot> component5() {
        return this.bots;
    }

    public final int component6() {
        return this.initPageIndex;
    }

    public final int component7() {
        return this.currentPage;
    }

    public final OnboardingBotPagerState copy(String titleLabel, String buttonLabel, boolean z, boolean z2, ImmutableList<Bot> bots, int i, int i2) {
        Intrinsics.checkNotNullParameter(titleLabel, "titleLabel");
        Intrinsics.checkNotNullParameter(buttonLabel, "buttonLabel");
        Intrinsics.checkNotNullParameter(bots, "bots");
        return new OnboardingBotPagerState(titleLabel, buttonLabel, z, z2, bots, i, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnboardingBotPagerState) {
            OnboardingBotPagerState onboardingBotPagerState = (OnboardingBotPagerState) obj;
            return Intrinsics.areEqual(this.titleLabel, onboardingBotPagerState.titleLabel) && Intrinsics.areEqual(this.buttonLabel, onboardingBotPagerState.buttonLabel) && this.isNeedSelectChat == onboardingBotPagerState.isNeedSelectChat && this.isButtonActive == onboardingBotPagerState.isButtonActive && Intrinsics.areEqual(this.bots, onboardingBotPagerState.bots) && this.initPageIndex == onboardingBotPagerState.initPageIndex && this.currentPage == onboardingBotPagerState.currentPage;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.titleLabel.hashCode() * 31) + this.buttonLabel.hashCode()) * 31;
        boolean z = this.isNeedSelectChat;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        boolean z2 = this.isButtonActive;
        return ((((((i2 + (z2 ? 1 : z2 ? 1 : 0)) * 31) + this.bots.hashCode()) * 31) + this.initPageIndex) * 31) + this.currentPage;
    }

    public String toString() {
        String str = this.titleLabel;
        String str2 = this.buttonLabel;
        boolean z = this.isNeedSelectChat;
        boolean z2 = this.isButtonActive;
        ImmutableList<Bot> immutableList = this.bots;
        int i = this.initPageIndex;
        int i2 = this.currentPage;
        return "OnboardingBotPagerState(titleLabel=" + str + ", buttonLabel=" + str2 + ", isNeedSelectChat=" + z + ", isButtonActive=" + z2 + ", bots=" + immutableList + ", initPageIndex=" + i + ", currentPage=" + i2 + ")";
    }

    public OnboardingBotPagerState(String titleLabel, String buttonLabel, boolean z, boolean z2, ImmutableList<Bot> bots, int i, int i2) {
        Intrinsics.checkNotNullParameter(titleLabel, "titleLabel");
        Intrinsics.checkNotNullParameter(buttonLabel, "buttonLabel");
        Intrinsics.checkNotNullParameter(bots, "bots");
        this.titleLabel = titleLabel;
        this.buttonLabel = buttonLabel;
        this.isNeedSelectChat = z;
        this.isButtonActive = z2;
        this.bots = bots;
        this.initPageIndex = i;
        this.currentPage = i2;
        this.currentBot = (Bot) CollectionsKt.getOrNull(bots, i2);
    }

    public final String getTitleLabel() {
        return this.titleLabel;
    }

    public final String getButtonLabel() {
        return this.buttonLabel;
    }

    public final boolean isNeedSelectChat() {
        return this.isNeedSelectChat;
    }

    public final boolean isButtonActive() {
        return this.isButtonActive;
    }

    public /* synthetic */ OnboardingBotPagerState(String str, String str2, boolean z, boolean z2, PersistentList persistentList, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) == 0 ? str2 : "", (i3 & 4) != 0 ? false : z, (i3 & 8) != 0 ? true : z2, (i3 & 16) != 0 ? ExtensionsKt.persistentListOf() : persistentList, (i3 & 32) != 0 ? 0 : i, (i3 & 64) != 0 ? 0 : i2);
    }

    public final ImmutableList<Bot> getBots() {
        return this.bots;
    }

    public final int getInitPageIndex() {
        return this.initPageIndex;
    }

    public final int getCurrentPage() {
        return this.currentPage;
    }

    public final Bot getCurrentBot() {
        return this.currentBot;
    }

    /* compiled from: OnboardingBotPagerState.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u000bHÆ\u0003JY\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001f\u001a\u00020\u000b2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e¨\u0006$"}, d2 = {"Lcom/ifriend/presentation/features/onboarding/steps/view/selectbot/OnboardingBotPagerState$Bot;", "", "id", "", "userId", "name", "imageUrl", "imageBgUrl", "logoUrl", "description", "isVerified", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getDescription", "()Ljava/lang/String;", "getId", "getImageBgUrl", "getImageUrl", "()Z", "getLogoUrl", "getName", "getUserId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Bot {
        public static final int $stable = 0;
        private final String description;
        private final String id;
        private final String imageBgUrl;
        private final String imageUrl;
        private final boolean isVerified;
        private final String logoUrl;
        private final String name;
        private final String userId;

        public final String component1() {
            return this.id;
        }

        public final String component2() {
            return this.userId;
        }

        public final String component3() {
            return this.name;
        }

        public final String component4() {
            return this.imageUrl;
        }

        public final String component5() {
            return this.imageBgUrl;
        }

        public final String component6() {
            return this.logoUrl;
        }

        public final String component7() {
            return this.description;
        }

        public final boolean component8() {
            return this.isVerified;
        }

        public final Bot copy(String id, String userId, String name, String imageUrl, String imageBgUrl, String logoUrl, String description, boolean z) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(userId, "userId");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
            Intrinsics.checkNotNullParameter(imageBgUrl, "imageBgUrl");
            Intrinsics.checkNotNullParameter(logoUrl, "logoUrl");
            Intrinsics.checkNotNullParameter(description, "description");
            return new Bot(id, userId, name, imageUrl, imageBgUrl, logoUrl, description, z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Bot) {
                Bot bot = (Bot) obj;
                return Intrinsics.areEqual(this.id, bot.id) && Intrinsics.areEqual(this.userId, bot.userId) && Intrinsics.areEqual(this.name, bot.name) && Intrinsics.areEqual(this.imageUrl, bot.imageUrl) && Intrinsics.areEqual(this.imageBgUrl, bot.imageBgUrl) && Intrinsics.areEqual(this.logoUrl, bot.logoUrl) && Intrinsics.areEqual(this.description, bot.description) && this.isVerified == bot.isVerified;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = ((((((((((((this.id.hashCode() * 31) + this.userId.hashCode()) * 31) + this.name.hashCode()) * 31) + this.imageUrl.hashCode()) * 31) + this.imageBgUrl.hashCode()) * 31) + this.logoUrl.hashCode()) * 31) + this.description.hashCode()) * 31;
            boolean z = this.isVerified;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            return hashCode + i;
        }

        public String toString() {
            String str = this.id;
            String str2 = this.userId;
            String str3 = this.name;
            String str4 = this.imageUrl;
            String str5 = this.imageBgUrl;
            String str6 = this.logoUrl;
            String str7 = this.description;
            boolean z = this.isVerified;
            return "Bot(id=" + str + ", userId=" + str2 + ", name=" + str3 + ", imageUrl=" + str4 + ", imageBgUrl=" + str5 + ", logoUrl=" + str6 + ", description=" + str7 + ", isVerified=" + z + ")";
        }

        public Bot(String id, String userId, String name, String imageUrl, String imageBgUrl, String logoUrl, String description, boolean z) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(userId, "userId");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
            Intrinsics.checkNotNullParameter(imageBgUrl, "imageBgUrl");
            Intrinsics.checkNotNullParameter(logoUrl, "logoUrl");
            Intrinsics.checkNotNullParameter(description, "description");
            this.id = id;
            this.userId = userId;
            this.name = name;
            this.imageUrl = imageUrl;
            this.imageBgUrl = imageBgUrl;
            this.logoUrl = logoUrl;
            this.description = description;
            this.isVerified = z;
        }

        public final String getId() {
            return this.id;
        }

        public final String getUserId() {
            return this.userId;
        }

        public final String getName() {
            return this.name;
        }

        public final String getImageUrl() {
            return this.imageUrl;
        }

        public final String getImageBgUrl() {
            return this.imageBgUrl;
        }

        public final String getLogoUrl() {
            return this.logoUrl;
        }

        public final String getDescription() {
            return this.description;
        }

        public final boolean isVerified() {
            return this.isVerified;
        }
    }
}
