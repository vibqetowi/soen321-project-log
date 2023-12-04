package com.ifriend.presentation.common.observers.appevents.params;

import com.google.gson.annotations.SerializedName;
import com.ifriend.analytics.usecase.purchase.PurchaseSource;
import com.ifriend.presentation.extensions.UUIDSerializer;
import com.ifriend.presentation.features.purchases.billing.models.PurchaseReason;
import com.ifriend.presentation.features.purchases.billing.models.PurchaseReason$BuyMessage$$serializer;
import com.ifriend.presentation.features.purchases.billing.models.PurchaseReason$GenerateAvatar$$serializer;
import com.ifriend.presentation.features.purchases.common.model.UpgradeType;
import java.lang.annotation.Annotation;
import java.util.UUID;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SealedClassSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.EnumSerializer;
import kotlinx.serialization.internal.ObjectSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
/* compiled from: AppUiParams.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 52\u00020\u0001:\u000245BU\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u0010\u0012B9\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0013J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0007HÆ\u0003J\t\u0010$\u001a\u00020\tHÆ\u0003J\t\u0010%\u001a\u00020\u000bHÆ\u0003J\t\u0010&\u001a\u00020\rHÆ\u0003J\t\u0010'\u001a\u00020\u000fHÆ\u0003JE\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fHÆ\u0001J\u0013\u0010)\u001a\u00020\t2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020\u0003HÖ\u0001J\t\u0010,\u001a\u00020\u0007HÖ\u0001J!\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\u00002\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u000203HÇ\u0001R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!¨\u00066"}, d2 = {"Lcom/ifriend/presentation/common/observers/appevents/params/BuyChatSubscriptionBillingUiParams;", "", "seen1", "", "requestId", "Ljava/util/UUID;", "chatId", "", "goToBuyNeuronsAfterUpgrade", "", "upgradeType", "Lcom/ifriend/presentation/features/purchases/common/model/UpgradeType;", "purchaseReason", "Lcom/ifriend/presentation/features/purchases/billing/models/PurchaseReason;", "purchaseSource", "Lcom/ifriend/analytics/usecase/purchase/PurchaseSource;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/UUID;Ljava/lang/String;ZLcom/ifriend/presentation/features/purchases/common/model/UpgradeType;Lcom/ifriend/presentation/features/purchases/billing/models/PurchaseReason;Lcom/ifriend/analytics/usecase/purchase/PurchaseSource;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/util/UUID;Ljava/lang/String;ZLcom/ifriend/presentation/features/purchases/common/model/UpgradeType;Lcom/ifriend/presentation/features/purchases/billing/models/PurchaseReason;Lcom/ifriend/analytics/usecase/purchase/PurchaseSource;)V", "getChatId", "()Ljava/lang/String;", "getGoToBuyNeuronsAfterUpgrade", "()Z", "getPurchaseReason", "()Lcom/ifriend/presentation/features/purchases/billing/models/PurchaseReason;", "getPurchaseSource", "()Lcom/ifriend/analytics/usecase/purchase/PurchaseSource;", "getRequestId$annotations", "()V", "getRequestId", "()Ljava/util/UUID;", "getUpgradeType", "()Lcom/ifriend/presentation/features/purchases/common/model/UpgradeType;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Serializable
/* loaded from: classes6.dex */
public final class BuyChatSubscriptionBillingUiParams {
    @SerializedName("chatId")
    private final String chatId;
    @SerializedName("goToBuyNeuronsAfterUpgrade")
    private final boolean goToBuyNeuronsAfterUpgrade;
    @SerializedName("purchaseReason")
    private final PurchaseReason purchaseReason;
    @SerializedName("purchaseSource")
    private final PurchaseSource purchaseSource;
    private final UUID requestId;
    @SerializedName("upgradeType")
    private final UpgradeType upgradeType;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, new EnumSerializer("com.ifriend.presentation.features.purchases.common.model.UpgradeType", UpgradeType.values()), new SealedClassSerializer("com.ifriend.presentation.features.purchases.billing.models.PurchaseReason", Reflection.getOrCreateKotlinClass(PurchaseReason.class), new KClass[]{Reflection.getOrCreateKotlinClass(PurchaseReason.BuyMessage.class), Reflection.getOrCreateKotlinClass(PurchaseReason.GenerateAvatar.class), Reflection.getOrCreateKotlinClass(PurchaseReason.Purchase.class)}, new KSerializer[]{PurchaseReason$BuyMessage$$serializer.INSTANCE, PurchaseReason$GenerateAvatar$$serializer.INSTANCE, new ObjectSerializer("com.ifriend.presentation.features.purchases.billing.models.PurchaseReason.Purchase", PurchaseReason.Purchase.INSTANCE, new Annotation[0])}, new Annotation[0]), new EnumSerializer("com.ifriend.analytics.usecase.purchase.PurchaseSource", PurchaseSource.values())};

    public static /* synthetic */ BuyChatSubscriptionBillingUiParams copy$default(BuyChatSubscriptionBillingUiParams buyChatSubscriptionBillingUiParams, UUID uuid, String str, boolean z, UpgradeType upgradeType, PurchaseReason purchaseReason, PurchaseSource purchaseSource, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = buyChatSubscriptionBillingUiParams.requestId;
        }
        if ((i & 2) != 0) {
            str = buyChatSubscriptionBillingUiParams.chatId;
        }
        String str2 = str;
        if ((i & 4) != 0) {
            z = buyChatSubscriptionBillingUiParams.goToBuyNeuronsAfterUpgrade;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            upgradeType = buyChatSubscriptionBillingUiParams.upgradeType;
        }
        UpgradeType upgradeType2 = upgradeType;
        if ((i & 16) != 0) {
            purchaseReason = buyChatSubscriptionBillingUiParams.purchaseReason;
        }
        PurchaseReason purchaseReason2 = purchaseReason;
        if ((i & 32) != 0) {
            purchaseSource = buyChatSubscriptionBillingUiParams.purchaseSource;
        }
        return buyChatSubscriptionBillingUiParams.copy(uuid, str2, z2, upgradeType2, purchaseReason2, purchaseSource);
    }

    @Serializable(with = UUIDSerializer.class)
    public static /* synthetic */ void getRequestId$annotations() {
    }

    public final UUID component1() {
        return this.requestId;
    }

    public final String component2() {
        return this.chatId;
    }

    public final boolean component3() {
        return this.goToBuyNeuronsAfterUpgrade;
    }

    public final UpgradeType component4() {
        return this.upgradeType;
    }

    public final PurchaseReason component5() {
        return this.purchaseReason;
    }

    public final PurchaseSource component6() {
        return this.purchaseSource;
    }

    public final BuyChatSubscriptionBillingUiParams copy(UUID requestId, String chatId, boolean z, UpgradeType upgradeType, PurchaseReason purchaseReason, PurchaseSource purchaseSource) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(upgradeType, "upgradeType");
        Intrinsics.checkNotNullParameter(purchaseReason, "purchaseReason");
        Intrinsics.checkNotNullParameter(purchaseSource, "purchaseSource");
        return new BuyChatSubscriptionBillingUiParams(requestId, chatId, z, upgradeType, purchaseReason, purchaseSource);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BuyChatSubscriptionBillingUiParams) {
            BuyChatSubscriptionBillingUiParams buyChatSubscriptionBillingUiParams = (BuyChatSubscriptionBillingUiParams) obj;
            return Intrinsics.areEqual(this.requestId, buyChatSubscriptionBillingUiParams.requestId) && Intrinsics.areEqual(this.chatId, buyChatSubscriptionBillingUiParams.chatId) && this.goToBuyNeuronsAfterUpgrade == buyChatSubscriptionBillingUiParams.goToBuyNeuronsAfterUpgrade && this.upgradeType == buyChatSubscriptionBillingUiParams.upgradeType && Intrinsics.areEqual(this.purchaseReason, buyChatSubscriptionBillingUiParams.purchaseReason) && this.purchaseSource == buyChatSubscriptionBillingUiParams.purchaseSource;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.requestId.hashCode() * 31) + this.chatId.hashCode()) * 31;
        boolean z = this.goToBuyNeuronsAfterUpgrade;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return ((((((hashCode + i) * 31) + this.upgradeType.hashCode()) * 31) + this.purchaseReason.hashCode()) * 31) + this.purchaseSource.hashCode();
    }

    public String toString() {
        UUID uuid = this.requestId;
        String str = this.chatId;
        boolean z = this.goToBuyNeuronsAfterUpgrade;
        UpgradeType upgradeType = this.upgradeType;
        PurchaseReason purchaseReason = this.purchaseReason;
        PurchaseSource purchaseSource = this.purchaseSource;
        return "BuyChatSubscriptionBillingUiParams(requestId=" + uuid + ", chatId=" + str + ", goToBuyNeuronsAfterUpgrade=" + z + ", upgradeType=" + upgradeType + ", purchaseReason=" + purchaseReason + ", purchaseSource=" + purchaseSource + ")";
    }

    /* compiled from: AppUiParams.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/ifriend/presentation/common/observers/appevents/params/BuyChatSubscriptionBillingUiParams$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/ifriend/presentation/common/observers/appevents/params/BuyChatSubscriptionBillingUiParams;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<BuyChatSubscriptionBillingUiParams> serializer() {
            return BuyChatSubscriptionBillingUiParams$$serializer.INSTANCE;
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ BuyChatSubscriptionBillingUiParams(int i, @Serializable(with = UUIDSerializer.class) UUID uuid, String str, boolean z, UpgradeType upgradeType, PurchaseReason purchaseReason, PurchaseSource purchaseSource, SerializationConstructorMarker serializationConstructorMarker) {
        if (30 != (i & 30)) {
            PluginExceptionsKt.throwMissingFieldException(i, 30, BuyChatSubscriptionBillingUiParams$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            uuid = UUID.randomUUID();
            Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID(...)");
        }
        this.requestId = uuid;
        this.chatId = str;
        this.goToBuyNeuronsAfterUpgrade = z;
        this.upgradeType = upgradeType;
        this.purchaseReason = purchaseReason;
        if ((i & 32) == 0) {
            this.purchaseSource = PurchaseSource.CHAT;
        } else {
            this.purchaseSource = purchaseSource;
        }
    }

    public BuyChatSubscriptionBillingUiParams(UUID requestId, String chatId, boolean z, UpgradeType upgradeType, PurchaseReason purchaseReason, PurchaseSource purchaseSource) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(upgradeType, "upgradeType");
        Intrinsics.checkNotNullParameter(purchaseReason, "purchaseReason");
        Intrinsics.checkNotNullParameter(purchaseSource, "purchaseSource");
        this.requestId = requestId;
        this.chatId = chatId;
        this.goToBuyNeuronsAfterUpgrade = z;
        this.upgradeType = upgradeType;
        this.purchaseReason = purchaseReason;
        this.purchaseSource = purchaseSource;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void write$Self(BuyChatSubscriptionBillingUiParams buyChatSubscriptionBillingUiParams, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        boolean z;
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0)) {
            UUID uuid = buyChatSubscriptionBillingUiParams.requestId;
            UUID randomUUID = UUID.randomUUID();
            Intrinsics.checkNotNullExpressionValue(randomUUID, "randomUUID(...)");
            if (Intrinsics.areEqual(uuid, randomUUID)) {
                z = false;
                if (z) {
                    compositeEncoder.encodeSerializableElement(serialDescriptor, 0, UUIDSerializer.INSTANCE, buyChatSubscriptionBillingUiParams.requestId);
                }
                compositeEncoder.encodeStringElement(serialDescriptor, 1, buyChatSubscriptionBillingUiParams.chatId);
                compositeEncoder.encodeBooleanElement(serialDescriptor, 2, buyChatSubscriptionBillingUiParams.goToBuyNeuronsAfterUpgrade);
                compositeEncoder.encodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], buyChatSubscriptionBillingUiParams.upgradeType);
                compositeEncoder.encodeSerializableElement(serialDescriptor, 4, kSerializerArr[4], buyChatSubscriptionBillingUiParams.purchaseReason);
                if ((compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && buyChatSubscriptionBillingUiParams.purchaseSource == PurchaseSource.CHAT) ? false : true) {
                    return;
                }
                compositeEncoder.encodeSerializableElement(serialDescriptor, 5, kSerializerArr[5], buyChatSubscriptionBillingUiParams.purchaseSource);
                return;
            }
        }
        z = true;
        if (z) {
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 1, buyChatSubscriptionBillingUiParams.chatId);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 2, buyChatSubscriptionBillingUiParams.goToBuyNeuronsAfterUpgrade);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], buyChatSubscriptionBillingUiParams.upgradeType);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 4, kSerializerArr[4], buyChatSubscriptionBillingUiParams.purchaseReason);
        if ((compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && buyChatSubscriptionBillingUiParams.purchaseSource == PurchaseSource.CHAT) ? false : true) {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ BuyChatSubscriptionBillingUiParams(UUID uuid, String str, boolean z, UpgradeType upgradeType, PurchaseReason purchaseReason, PurchaseSource purchaseSource, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(uuid, str, z, upgradeType, purchaseReason, (i & 32) != 0 ? PurchaseSource.CHAT : purchaseSource);
        if ((i & 1) != 0) {
            uuid = UUID.randomUUID();
            Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID(...)");
        }
    }

    public final UUID getRequestId() {
        return this.requestId;
    }

    public final String getChatId() {
        return this.chatId;
    }

    public final boolean getGoToBuyNeuronsAfterUpgrade() {
        return this.goToBuyNeuronsAfterUpgrade;
    }

    public final UpgradeType getUpgradeType() {
        return this.upgradeType;
    }

    public final PurchaseReason getPurchaseReason() {
        return this.purchaseReason;
    }

    public final PurchaseSource getPurchaseSource() {
        return this.purchaseSource;
    }
}
