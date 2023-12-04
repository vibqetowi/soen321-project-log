package kotlinx.serialization.json.internal;

import androidx.exifinterface.media.ExifInterface;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.UByte;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.UShort;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.PolymorphicSerializerKt;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.PolymorphicKind;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.descriptors.StructureKind;
import kotlinx.serialization.encoding.AbstractEncoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.AbstractPolymorphicSerializer;
import kotlinx.serialization.internal.NamedValueEncoder;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonConfiguration;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonElementSerializer;
import kotlinx.serialization.json.JsonEncoder;
import kotlinx.serialization.json.JsonLiteral;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.modules.SerializersModule;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TreeJsonEncoder.kt */
@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b3\u0018\u00002\u00020\u00012\u00020\u0002B#\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\u0010\tJ\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0018\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u000fH\u0014J\u0010\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u0007H\u0016J\b\u0010\u001d\u001a\u00020\bH\u0016J)\u0010\u001e\u001a\u00020\b\"\u0004\b\u0000\u0010\u001f2\f\u0010 \u001a\b\u0012\u0004\u0012\u0002H\u001f0!2\u0006\u0010\"\u001a\u0002H\u001fH\u0016¢\u0006\u0002\u0010#J\u0018\u0010$\u001a\u00020\b2\u0006\u0010%\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020&H\u0014J\u0018\u0010'\u001a\u00020\b2\u0006\u0010%\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020(H\u0014J\u0018\u0010)\u001a\u00020\b2\u0006\u0010%\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020*H\u0014J\u0018\u0010+\u001a\u00020\b2\u0006\u0010%\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020,H\u0014J \u0010-\u001a\u00020\b2\u0006\u0010%\u001a\u00020\u000f2\u0006\u0010.\u001a\u00020\u00172\u0006\u0010/\u001a\u000200H\u0014J\u0018\u00101\u001a\u00020\b2\u0006\u0010%\u001a\u00020\u000f2\u0006\u0010\"\u001a\u000202H\u0014J\u0018\u00103\u001a\u0002042\u0006\u0010%\u001a\u00020\u000f2\u0006\u00105\u001a\u00020\u0017H\u0014J\u0018\u00106\u001a\u00020\b2\u0006\u0010%\u001a\u00020\u000f2\u0006\u0010\"\u001a\u000200H\u0014J\u0018\u00107\u001a\u00020\b2\u0006\u0010%\u001a\u00020\u000f2\u0006\u0010\"\u001a\u000208H\u0014J\u0010\u00109\u001a\u00020\b2\u0006\u0010%\u001a\u00020\u000fH\u0014J\u0018\u0010:\u001a\u00020\b2\u0006\u0010%\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020;H\u0014J\u0018\u0010<\u001a\u00020\b2\u0006\u0010%\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\u000fH\u0014J\u0018\u0010=\u001a\u00020\b2\u0006\u0010%\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020>H\u0014J\u0010\u0010?\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0017H\u0014J\b\u0010@\u001a\u00020\u0007H&J\u0018\u0010A\u001a\u00020\b2\u0006\u0010B\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u0007H&J\u0018\u0010C\u001a\u00020&2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010D\u001a\u000200H\u0016R\u0010\u0010\n\u001a\u00020\u000b8\u0004X\u0085\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\u0082\u0001\u0003EFG¨\u0006H"}, d2 = {"Lkotlinx/serialization/json/internal/AbstractJsonTreeEncoder;", "Lkotlinx/serialization/internal/NamedValueEncoder;", "Lkotlinx/serialization/json/JsonEncoder;", "json", "Lkotlinx/serialization/json/Json;", "nodeConsumer", "Lkotlin/Function1;", "Lkotlinx/serialization/json/JsonElement;", "", "(Lkotlinx/serialization/json/Json;Lkotlin/jvm/functions/Function1;)V", "configuration", "Lkotlinx/serialization/json/JsonConfiguration;", "getJson", "()Lkotlinx/serialization/json/Json;", "polymorphicDiscriminator", "", "serializersModule", "Lkotlinx/serialization/modules/SerializersModule;", "getSerializersModule", "()Lkotlinx/serialization/modules/SerializersModule;", "beginStructure", "Lkotlinx/serialization/encoding/CompositeEncoder;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "composeName", "parentName", "childName", "encodeJsonElement", "element", "encodeNull", "encodeSerializableValue", ExifInterface.GPS_DIRECTION_TRUE, "serializer", "Lkotlinx/serialization/SerializationStrategy;", "value", "(Lkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V", "encodeTaggedBoolean", ViewHierarchyConstants.TAG_KEY, "", "encodeTaggedByte", "", "encodeTaggedChar", "", "encodeTaggedDouble", "", "encodeTaggedEnum", "enumDescriptor", "ordinal", "", "encodeTaggedFloat", "", "encodeTaggedInline", "Lkotlinx/serialization/encoding/Encoder;", "inlineDescriptor", "encodeTaggedInt", "encodeTaggedLong", "", "encodeTaggedNull", "encodeTaggedShort", "", "encodeTaggedString", "encodeTaggedValue", "", "endEncode", "getCurrent", "putElement", "key", "shouldEncodeElementDefault", FirebaseAnalytics.Param.INDEX, "Lkotlinx/serialization/json/internal/JsonPrimitiveEncoder;", "Lkotlinx/serialization/json/internal/JsonTreeEncoder;", "Lkotlinx/serialization/json/internal/JsonTreeListEncoder;", "kotlinx-serialization-json"}, k = 1, mv = {1, 6, 0}, xi = 48)
@ExperimentalSerializationApi
/* loaded from: classes5.dex */
public abstract class AbstractJsonTreeEncoder extends NamedValueEncoder implements JsonEncoder {
    protected final JsonConfiguration configuration;
    private final Json json;
    private final Function1<JsonElement, Unit> nodeConsumer;
    private String polymorphicDiscriminator;

    public /* synthetic */ AbstractJsonTreeEncoder(Json json, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(json, function1);
    }

    @Override // kotlinx.serialization.internal.NamedValueEncoder
    protected String composeName(String parentName, String childName) {
        Intrinsics.checkNotNullParameter(parentName, "parentName");
        Intrinsics.checkNotNullParameter(childName, "childName");
        return childName;
    }

    public abstract JsonElement getCurrent();

    public abstract void putElement(String str, JsonElement jsonElement);

    @Override // kotlinx.serialization.json.JsonEncoder
    public final Json getJson() {
        return this.json;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private AbstractJsonTreeEncoder(Json json, Function1<? super JsonElement, Unit> function1) {
        this.json = json;
        this.nodeConsumer = function1;
        this.configuration = json.getConfiguration();
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder, kotlinx.serialization.encoding.Encoder, kotlinx.serialization.encoding.CompositeEncoder
    public final SerializersModule getSerializersModule() {
        return this.json.getSerializersModule();
    }

    @Override // kotlinx.serialization.json.JsonEncoder
    public void encodeJsonElement(JsonElement element) {
        Intrinsics.checkNotNullParameter(element, "element");
        encodeSerializableValue(JsonElementSerializer.INSTANCE, element);
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder, kotlinx.serialization.encoding.CompositeEncoder
    public boolean shouldEncodeElementDefault(SerialDescriptor descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return this.configuration.getEncodeDefaults();
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder, kotlinx.serialization.encoding.Encoder
    public void encodeNull() {
        String currentTagOrNull = getCurrentTagOrNull();
        if (currentTagOrNull == null) {
            this.nodeConsumer.invoke(JsonNull.INSTANCE);
        } else {
            encodeTaggedNull(currentTagOrNull);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.TaggedEncoder
    public void encodeTaggedNull(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        putElement(tag, JsonNull.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.TaggedEncoder
    public void encodeTaggedInt(String tag, int i) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        putElement(tag, JsonElementKt.JsonPrimitive(Integer.valueOf(i)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.TaggedEncoder
    public void encodeTaggedByte(String tag, byte b) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        putElement(tag, JsonElementKt.JsonPrimitive(Byte.valueOf(b)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.TaggedEncoder
    public void encodeTaggedShort(String tag, short s) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        putElement(tag, JsonElementKt.JsonPrimitive(Short.valueOf(s)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.TaggedEncoder
    public void encodeTaggedLong(String tag, long j) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        putElement(tag, JsonElementKt.JsonPrimitive(Long.valueOf(j)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.TaggedEncoder
    public void encodeTaggedFloat(String tag, float f) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        putElement(tag, JsonElementKt.JsonPrimitive(Float.valueOf(f)));
        if (this.configuration.getAllowSpecialFloatingPointValues()) {
            return;
        }
        if (!((Float.isInfinite(f) || Float.isNaN(f)) ? false : true)) {
            throw JsonExceptionsKt.InvalidFloatingPointEncoded(Float.valueOf(f), tag, getCurrent().toString());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.TaggedEncoder, kotlinx.serialization.encoding.Encoder
    public <T> void encodeSerializableValue(SerializationStrategy<? super T> serializer, T t) {
        boolean requiresTopLevelTag;
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        if (getCurrentTagOrNull() == null) {
            requiresTopLevelTag = TreeJsonEncoderKt.getRequiresTopLevelTag(WriteModeKt.carrierDescriptor(serializer.getDescriptor(), getSerializersModule()));
            if (requiresTopLevelTag) {
                JsonPrimitiveEncoder jsonPrimitiveEncoder = new JsonPrimitiveEncoder(this.json, this.nodeConsumer);
                jsonPrimitiveEncoder.encodeSerializableValue(serializer, t);
                jsonPrimitiveEncoder.endEncode(serializer.getDescriptor());
                return;
            }
        }
        AbstractJsonTreeEncoder abstractJsonTreeEncoder = this;
        if (!(serializer instanceof AbstractPolymorphicSerializer) || abstractJsonTreeEncoder.getJson().getConfiguration().getUseArrayPolymorphism()) {
            serializer.serialize(abstractJsonTreeEncoder, t);
            return;
        }
        AbstractPolymorphicSerializer abstractPolymorphicSerializer = (AbstractPolymorphicSerializer) serializer;
        String classDiscriminator = PolymorphicKt.classDiscriminator(serializer.getDescriptor(), abstractJsonTreeEncoder.getJson());
        AbstractJsonTreeEncoder abstractJsonTreeEncoder2 = abstractJsonTreeEncoder;
        if (t != 0) {
            SerializationStrategy findPolymorphicSerializer = PolymorphicSerializerKt.findPolymorphicSerializer(abstractPolymorphicSerializer, abstractJsonTreeEncoder2, t);
            PolymorphicKt.validateIfSealed(abstractPolymorphicSerializer, findPolymorphicSerializer, classDiscriminator);
            PolymorphicKt.checkKind(findPolymorphicSerializer.getDescriptor().getKind());
            this.polymorphicDiscriminator = classDiscriminator;
            findPolymorphicSerializer.serialize(abstractJsonTreeEncoder2, t);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.TaggedEncoder
    public void encodeTaggedDouble(String tag, double d) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        putElement(tag, JsonElementKt.JsonPrimitive(Double.valueOf(d)));
        if (this.configuration.getAllowSpecialFloatingPointValues()) {
            return;
        }
        if (!((Double.isInfinite(d) || Double.isNaN(d)) ? false : true)) {
            throw JsonExceptionsKt.InvalidFloatingPointEncoded(Double.valueOf(d), tag, getCurrent().toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.TaggedEncoder
    public void encodeTaggedBoolean(String tag, boolean z) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        putElement(tag, JsonElementKt.JsonPrimitive(Boolean.valueOf(z)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.TaggedEncoder
    public void encodeTaggedChar(String tag, char c) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        putElement(tag, JsonElementKt.JsonPrimitive(String.valueOf(c)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.TaggedEncoder
    public void encodeTaggedString(String tag, String value) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(value, "value");
        putElement(tag, JsonElementKt.JsonPrimitive(value));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.TaggedEncoder
    public void encodeTaggedEnum(String tag, SerialDescriptor enumDescriptor, int i) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        putElement(tag, JsonElementKt.JsonPrimitive(enumDescriptor.getElementName(i)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.TaggedEncoder
    public void encodeTaggedValue(String tag, Object value) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(value, "value");
        putElement(tag, JsonElementKt.JsonPrimitive(value.toString()));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.TaggedEncoder
    public Encoder encodeTaggedInline(final String tag, SerialDescriptor inlineDescriptor) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(inlineDescriptor, "inlineDescriptor");
        return StreamingJsonEncoderKt.isUnsignedNumber(inlineDescriptor) ? new AbstractEncoder() { // from class: kotlinx.serialization.json.internal.AbstractJsonTreeEncoder$encodeTaggedInline$1
            private final SerializersModule serializersModule;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.serializersModule = AbstractJsonTreeEncoder.this.getJson().getSerializersModule();
            }

            @Override // kotlinx.serialization.encoding.Encoder, kotlinx.serialization.encoding.CompositeEncoder
            public SerializersModule getSerializersModule() {
                return this.serializersModule;
            }

            public final void putUnquotedString(String s) {
                Intrinsics.checkNotNullParameter(s, "s");
                AbstractJsonTreeEncoder.this.putElement(tag, new JsonLiteral(s, false));
            }

            @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
            public void encodeInt(int i) {
                putUnquotedString(UInt.m7413toStringimpl(UInt.m7367constructorimpl(i)));
            }

            @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
            public void encodeLong(long j) {
                putUnquotedString(ULong.m7492toStringimpl(ULong.m7446constructorimpl(j)));
            }

            @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
            public void encodeByte(byte b) {
                putUnquotedString(UByte.m7333toStringimpl(UByte.m7289constructorimpl(b)));
            }

            @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
            public void encodeShort(short s) {
                putUnquotedString(UShort.m7597toStringimpl(UShort.m7553constructorimpl(s)));
            }
        } : super.encodeTaggedInline((AbstractJsonTreeEncoder) tag, inlineDescriptor);
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder, kotlinx.serialization.encoding.Encoder
    public CompositeEncoder beginStructure(SerialDescriptor descriptor) {
        JsonTreeEncoder jsonTreeEncoder;
        AbstractJsonTreeEncoder jsonTreeMapEncoder;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        AbstractJsonTreeEncoder$beginStructure$consumer$1 abstractJsonTreeEncoder$beginStructure$consumer$1 = getCurrentTagOrNull() == null ? this.nodeConsumer : new AbstractJsonTreeEncoder$beginStructure$consumer$1(this);
        SerialKind kind = descriptor.getKind();
        if (Intrinsics.areEqual(kind, StructureKind.LIST.INSTANCE) ? true : kind instanceof PolymorphicKind) {
            jsonTreeEncoder = new JsonTreeListEncoder(this.json, abstractJsonTreeEncoder$beginStructure$consumer$1);
        } else if (!Intrinsics.areEqual(kind, StructureKind.MAP.INSTANCE)) {
            jsonTreeEncoder = new JsonTreeEncoder(this.json, abstractJsonTreeEncoder$beginStructure$consumer$1);
        } else {
            Json json = this.json;
            SerialDescriptor carrierDescriptor = WriteModeKt.carrierDescriptor(descriptor.getElementDescriptor(0), json.getSerializersModule());
            SerialKind kind2 = carrierDescriptor.getKind();
            if ((kind2 instanceof PrimitiveKind) || Intrinsics.areEqual(kind2, SerialKind.ENUM.INSTANCE)) {
                jsonTreeMapEncoder = new JsonTreeMapEncoder(this.json, abstractJsonTreeEncoder$beginStructure$consumer$1);
            } else if (json.getConfiguration().getAllowStructuredMapKeys()) {
                jsonTreeMapEncoder = new JsonTreeListEncoder(this.json, abstractJsonTreeEncoder$beginStructure$consumer$1);
            } else {
                throw JsonExceptionsKt.InvalidKeyKindException(carrierDescriptor);
            }
            jsonTreeEncoder = jsonTreeMapEncoder;
        }
        String str = this.polymorphicDiscriminator;
        if (str != null) {
            Intrinsics.checkNotNull(str);
            jsonTreeEncoder.putElement(str, JsonElementKt.JsonPrimitive(descriptor.getSerialName()));
            this.polymorphicDiscriminator = null;
        }
        return jsonTreeEncoder;
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder
    protected void endEncode(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        this.nodeConsumer.invoke(getCurrent());
    }
}
