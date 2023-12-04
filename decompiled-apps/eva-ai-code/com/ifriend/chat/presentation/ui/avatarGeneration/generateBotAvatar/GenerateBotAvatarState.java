package com.ifriend.chat.presentation.ui.avatarGeneration.generateBotAvatar;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.ifriend.domain.models.profile.Gender;
import com.ifriend.ui.base.mvvm.BaseState;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: GenerateBotAvatarState.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002%&BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0002\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010\u001c\u001a\u00020\u000bHÆ\u0003J\t\u0010\u001d\u001a\u00020\u000bHÆ\u0003JM\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001f\u001a\u00020\u000b2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0016R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016¨\u0006'"}, d2 = {"Lcom/ifriend/chat/presentation/ui/avatarGeneration/generateBotAvatar/GenerateBotAvatarState;", "Lcom/ifriend/ui/base/mvvm/BaseState;", "botGender", "Lcom/ifriend/domain/models/profile/Gender;", "description", "", "descriptionOptions", "", "avatarGenerationPrice", "Lcom/ifriend/chat/presentation/ui/avatarGeneration/generateBotAvatar/GenerateBotAvatarState$AvatarGenerationPrice;", "shouldUpdateDescription", "", "isLoading", "(Lcom/ifriend/domain/models/profile/Gender;Ljava/lang/String;Ljava/util/List;Lcom/ifriend/chat/presentation/ui/avatarGeneration/generateBotAvatar/GenerateBotAvatarState$AvatarGenerationPrice;ZZ)V", "getAvatarGenerationPrice", "()Lcom/ifriend/chat/presentation/ui/avatarGeneration/generateBotAvatar/GenerateBotAvatarState$AvatarGenerationPrice;", "getBotGender", "()Lcom/ifriend/domain/models/profile/Gender;", "getDescription", "()Ljava/lang/String;", "getDescriptionOptions", "()Ljava/util/List;", "()Z", "getShouldUpdateDescription", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "", "hashCode", "", "toString", "AvatarGenerationPrice", "Companion", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class GenerateBotAvatarState extends BaseState {
    private final AvatarGenerationPrice avatarGenerationPrice;
    private final Gender botGender;
    private final String description;
    private final List<String> descriptionOptions;
    private final boolean isLoading;
    private final boolean shouldUpdateDescription;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static /* synthetic */ GenerateBotAvatarState copy$default(GenerateBotAvatarState generateBotAvatarState, Gender gender, String str, List list, AvatarGenerationPrice avatarGenerationPrice, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            gender = generateBotAvatarState.botGender;
        }
        if ((i & 2) != 0) {
            str = generateBotAvatarState.description;
        }
        String str2 = str;
        List<String> list2 = list;
        if ((i & 4) != 0) {
            list2 = generateBotAvatarState.descriptionOptions;
        }
        List list3 = list2;
        if ((i & 8) != 0) {
            avatarGenerationPrice = generateBotAvatarState.avatarGenerationPrice;
        }
        AvatarGenerationPrice avatarGenerationPrice2 = avatarGenerationPrice;
        if ((i & 16) != 0) {
            z = generateBotAvatarState.shouldUpdateDescription;
        }
        boolean z3 = z;
        if ((i & 32) != 0) {
            z2 = generateBotAvatarState.isLoading;
        }
        return generateBotAvatarState.copy(gender, str2, list3, avatarGenerationPrice2, z3, z2);
    }

    public final Gender component1() {
        return this.botGender;
    }

    public final String component2() {
        return this.description;
    }

    public final List<String> component3() {
        return this.descriptionOptions;
    }

    public final AvatarGenerationPrice component4() {
        return this.avatarGenerationPrice;
    }

    public final boolean component5() {
        return this.shouldUpdateDescription;
    }

    public final boolean component6() {
        return this.isLoading;
    }

    public final GenerateBotAvatarState copy(Gender botGender, String description, List<String> descriptionOptions, AvatarGenerationPrice avatarGenerationPrice, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(botGender, "botGender");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(descriptionOptions, "descriptionOptions");
        return new GenerateBotAvatarState(botGender, description, descriptionOptions, avatarGenerationPrice, z, z2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GenerateBotAvatarState) {
            GenerateBotAvatarState generateBotAvatarState = (GenerateBotAvatarState) obj;
            return this.botGender == generateBotAvatarState.botGender && Intrinsics.areEqual(this.description, generateBotAvatarState.description) && Intrinsics.areEqual(this.descriptionOptions, generateBotAvatarState.descriptionOptions) && Intrinsics.areEqual(this.avatarGenerationPrice, generateBotAvatarState.avatarGenerationPrice) && this.shouldUpdateDescription == generateBotAvatarState.shouldUpdateDescription && this.isLoading == generateBotAvatarState.isLoading;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((this.botGender.hashCode() * 31) + this.description.hashCode()) * 31) + this.descriptionOptions.hashCode()) * 31;
        AvatarGenerationPrice avatarGenerationPrice = this.avatarGenerationPrice;
        int hashCode2 = (hashCode + (avatarGenerationPrice == null ? 0 : avatarGenerationPrice.hashCode())) * 31;
        boolean z = this.shouldUpdateDescription;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode2 + i) * 31;
        boolean z2 = this.isLoading;
        return i2 + (z2 ? 1 : z2 ? 1 : 0);
    }

    public String toString() {
        Gender gender = this.botGender;
        String str = this.description;
        List<String> list = this.descriptionOptions;
        AvatarGenerationPrice avatarGenerationPrice = this.avatarGenerationPrice;
        boolean z = this.shouldUpdateDescription;
        boolean z2 = this.isLoading;
        return "GenerateBotAvatarState(botGender=" + gender + ", description=" + str + ", descriptionOptions=" + list + ", avatarGenerationPrice=" + avatarGenerationPrice + ", shouldUpdateDescription=" + z + ", isLoading=" + z2 + ")";
    }

    public /* synthetic */ GenerateBotAvatarState(Gender gender, String str, List list, AvatarGenerationPrice avatarGenerationPrice, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(gender, str, list, avatarGenerationPrice, (i & 16) != 0 ? false : z, (i & 32) != 0 ? false : z2);
    }

    public final Gender getBotGender() {
        return this.botGender;
    }

    public final String getDescription() {
        return this.description;
    }

    public final List<String> getDescriptionOptions() {
        return this.descriptionOptions;
    }

    public final AvatarGenerationPrice getAvatarGenerationPrice() {
        return this.avatarGenerationPrice;
    }

    public final boolean getShouldUpdateDescription() {
        return this.shouldUpdateDescription;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    /* compiled from: GenerateBotAvatarState.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/ifriend/chat/presentation/ui/avatarGeneration/generateBotAvatar/GenerateBotAvatarState$Companion;", "", "()V", "empty", "Lcom/ifriend/chat/presentation/ui/avatarGeneration/generateBotAvatar/GenerateBotAvatarState;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final GenerateBotAvatarState empty() {
            return new GenerateBotAvatarState(Gender.FEMALE, "", CollectionsKt.emptyList(), null, false, false, 48, null);
        }
    }

    public GenerateBotAvatarState(Gender botGender, String description, List<String> descriptionOptions, AvatarGenerationPrice avatarGenerationPrice, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(botGender, "botGender");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(descriptionOptions, "descriptionOptions");
        this.botGender = botGender;
        this.description = description;
        this.descriptionOptions = descriptionOptions;
        this.avatarGenerationPrice = avatarGenerationPrice;
        this.shouldUpdateDescription = z;
        this.isLoading = z2;
    }

    /* compiled from: GenerateBotAvatarState.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/ifriend/chat/presentation/ui/avatarGeneration/generateBotAvatar/GenerateBotAvatarState$AvatarGenerationPrice;", "", FirebaseAnalytics.Param.PRICE, "", "amount", "(II)V", "getAmount", "()I", "getPrice", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class AvatarGenerationPrice {
        public static final int $stable = 0;
        private final int amount;
        private final int price;

        public static /* synthetic */ AvatarGenerationPrice copy$default(AvatarGenerationPrice avatarGenerationPrice, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = avatarGenerationPrice.price;
            }
            if ((i3 & 2) != 0) {
                i2 = avatarGenerationPrice.amount;
            }
            return avatarGenerationPrice.copy(i, i2);
        }

        public final int component1() {
            return this.price;
        }

        public final int component2() {
            return this.amount;
        }

        public final AvatarGenerationPrice copy(int i, int i2) {
            return new AvatarGenerationPrice(i, i2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof AvatarGenerationPrice) {
                AvatarGenerationPrice avatarGenerationPrice = (AvatarGenerationPrice) obj;
                return this.price == avatarGenerationPrice.price && this.amount == avatarGenerationPrice.amount;
            }
            return false;
        }

        public int hashCode() {
            return (this.price * 31) + this.amount;
        }

        public String toString() {
            int i = this.price;
            int i2 = this.amount;
            return "AvatarGenerationPrice(price=" + i + ", amount=" + i2 + ")";
        }

        public AvatarGenerationPrice(int i, int i2) {
            this.price = i;
            this.amount = i2;
        }

        public final int getAmount() {
            return this.amount;
        }

        public final int getPrice() {
            return this.price;
        }
    }
}
