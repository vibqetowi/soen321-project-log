package com.ifriend.presentation.features.purchases.billing.models;

import com.ifriend.presentation.features.chat.common.models.MessageIdsParams;
import java.lang.annotation.Annotation;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SealedClassSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.ObjectSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
/* compiled from: PurchaseReason.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00032\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/ifriend/presentation/features/purchases/billing/models/PurchaseReason;", "", "BuyMessage", "Companion", "GenerateAvatar", "Purchase", "Lcom/ifriend/presentation/features/purchases/billing/models/PurchaseReason$BuyMessage;", "Lcom/ifriend/presentation/features/purchases/billing/models/PurchaseReason$GenerateAvatar;", "Lcom/ifriend/presentation/features/purchases/billing/models/PurchaseReason$Purchase;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Serializable
/* loaded from: classes6.dex */
public interface PurchaseReason {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: PurchaseReason.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/ifriend/presentation/features/purchases/billing/models/PurchaseReason$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/ifriend/presentation/features/purchases/billing/models/PurchaseReason;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final KSerializer<PurchaseReason> serializer() {
            return new SealedClassSerializer("com.ifriend.presentation.features.purchases.billing.models.PurchaseReason", Reflection.getOrCreateKotlinClass(PurchaseReason.class), new KClass[]{Reflection.getOrCreateKotlinClass(BuyMessage.class), Reflection.getOrCreateKotlinClass(GenerateAvatar.class), Reflection.getOrCreateKotlinClass(Purchase.class)}, new KSerializer[]{PurchaseReason$BuyMessage$$serializer.INSTANCE, PurchaseReason$GenerateAvatar$$serializer.INSTANCE, new ObjectSerializer("com.ifriend.presentation.features.purchases.billing.models.PurchaseReason.Purchase", Purchase.INSTANCE, new Annotation[0])}, new Annotation[0]);
        }
    }

    /* compiled from: PurchaseReason.kt */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001c\u001dB#\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\b\u0010\u0013\u001a\u00020\u0014H\u0016J!\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bHÇ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001e"}, d2 = {"Lcom/ifriend/presentation/features/purchases/billing/models/PurchaseReason$BuyMessage;", "Lcom/ifriend/presentation/features/purchases/billing/models/PurchaseReason;", "seen1", "", "messageIds", "Lcom/ifriend/presentation/features/chat/common/models/MessageIdsParams;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/ifriend/presentation/features/chat/common/models/MessageIdsParams;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lcom/ifriend/presentation/features/chat/common/models/MessageIdsParams;)V", "getMessageIds", "()Lcom/ifriend/presentation/features/chat/common/models/MessageIdsParams;", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @Serializable
    /* loaded from: classes6.dex */
    public static final class BuyMessage implements PurchaseReason {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);
        private final MessageIdsParams messageIds;

        public static /* synthetic */ BuyMessage copy$default(BuyMessage buyMessage, MessageIdsParams messageIdsParams, int i, Object obj) {
            if ((i & 1) != 0) {
                messageIdsParams = buyMessage.messageIds;
            }
            return buyMessage.copy(messageIdsParams);
        }

        public final MessageIdsParams component1() {
            return this.messageIds;
        }

        public final BuyMessage copy(MessageIdsParams messageIds) {
            Intrinsics.checkNotNullParameter(messageIds, "messageIds");
            return new BuyMessage(messageIds);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof BuyMessage) && Intrinsics.areEqual(this.messageIds, ((BuyMessage) obj).messageIds);
        }

        public int hashCode() {
            return this.messageIds.hashCode();
        }

        /* compiled from: PurchaseReason.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/ifriend/presentation/features/purchases/billing/models/PurchaseReason$BuyMessage$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/ifriend/presentation/features/purchases/billing/models/PurchaseReason$BuyMessage;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<BuyMessage> serializer() {
                return PurchaseReason$BuyMessage$$serializer.INSTANCE;
            }
        }

        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
        public /* synthetic */ BuyMessage(int i, MessageIdsParams messageIdsParams, SerializationConstructorMarker serializationConstructorMarker) {
            if (1 != (i & 1)) {
                PluginExceptionsKt.throwMissingFieldException(i, 1, PurchaseReason$BuyMessage$$serializer.INSTANCE.getDescriptor());
            }
            this.messageIds = messageIdsParams;
        }

        public BuyMessage(MessageIdsParams messageIds) {
            Intrinsics.checkNotNullParameter(messageIds, "messageIds");
            this.messageIds = messageIds;
        }

        public final MessageIdsParams getMessageIds() {
            return this.messageIds;
        }

        public String toString() {
            MessageIdsParams messageIdsParams = this.messageIds;
            return "BuyMessage: messageId=" + messageIdsParams;
        }
    }

    /* compiled from: PurchaseReason.kt */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001b\u001cB#\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\b\u0010\u0013\u001a\u00020\u0005H\u0016J!\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aHÇ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/ifriend/presentation/features/purchases/billing/models/PurchaseReason$GenerateAvatar;", "Lcom/ifriend/presentation/features/purchases/billing/models/PurchaseReason;", "seen1", "", "description", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @Serializable
    /* loaded from: classes6.dex */
    public static final class GenerateAvatar implements PurchaseReason {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);
        private final String description;

        public static /* synthetic */ GenerateAvatar copy$default(GenerateAvatar generateAvatar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = generateAvatar.description;
            }
            return generateAvatar.copy(str);
        }

        public final String component1() {
            return this.description;
        }

        public final GenerateAvatar copy(String description) {
            Intrinsics.checkNotNullParameter(description, "description");
            return new GenerateAvatar(description);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof GenerateAvatar) && Intrinsics.areEqual(this.description, ((GenerateAvatar) obj).description);
        }

        public int hashCode() {
            return this.description.hashCode();
        }

        /* compiled from: PurchaseReason.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/ifriend/presentation/features/purchases/billing/models/PurchaseReason$GenerateAvatar$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/ifriend/presentation/features/purchases/billing/models/PurchaseReason$GenerateAvatar;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<GenerateAvatar> serializer() {
                return PurchaseReason$GenerateAvatar$$serializer.INSTANCE;
            }
        }

        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
        public /* synthetic */ GenerateAvatar(int i, String str, SerializationConstructorMarker serializationConstructorMarker) {
            if (1 != (i & 1)) {
                PluginExceptionsKt.throwMissingFieldException(i, 1, PurchaseReason$GenerateAvatar$$serializer.INSTANCE.getDescriptor());
            }
            this.description = str;
        }

        public GenerateAvatar(String description) {
            Intrinsics.checkNotNullParameter(description, "description");
            this.description = description;
        }

        public final String getDescription() {
            return this.description;
        }

        public String toString() {
            String str = this.description;
            return "GenerateAvatar: description=" + str;
        }
    }

    /* compiled from: PurchaseReason.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00000\nHÆ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001¨\u0006\r"}, d2 = {"Lcom/ifriend/presentation/features/purchases/billing/models/PurchaseReason$Purchase;", "Lcom/ifriend/presentation/features/purchases/billing/models/PurchaseReason;", "()V", "equals", "", "other", "", "hashCode", "", "serializer", "Lkotlinx/serialization/KSerializer;", "toString", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @Serializable
    /* loaded from: classes6.dex */
    public static final class Purchase implements PurchaseReason {
        public static final Purchase INSTANCE = new Purchase();
        private static final /* synthetic */ Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) AnonymousClass1.INSTANCE);
        public static final int $stable = 8;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Purchase) {
                Purchase purchase = (Purchase) obj;
                return true;
            }
            return false;
        }

        public int hashCode() {
            return 640181670;
        }

        public String toString() {
            return "Purchase";
        }

        /* compiled from: PurchaseReason.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.ifriend.presentation.features.purchases.billing.models.PurchaseReason$Purchase$1  reason: invalid class name */
        /* loaded from: classes6.dex */
        static final class AnonymousClass1 extends Lambda implements Function0<KSerializer<Object>> {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            AnonymousClass1() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final KSerializer<Object> invoke() {
                return new ObjectSerializer("com.ifriend.presentation.features.purchases.billing.models.PurchaseReason.Purchase", Purchase.INSTANCE, new Annotation[0]);
            }
        }

        private Purchase() {
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return $cachedSerializer$delegate.getValue();
        }

        public final KSerializer<Purchase> serializer() {
            return get$cachedSerializer();
        }
    }
}
