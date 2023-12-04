package kotlinx.serialization.json.internal;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.descriptors.PolymorphicKind;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.descriptors.StructureKind;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.internal.NamedValueDecoder;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonConfiguration;
import kotlinx.serialization.json.JsonDecoder;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonLiteral;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import kotlinx.serialization.modules.SerializersModule;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TreeJsonDecoder.kt */
@Metadata(d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017H\u0014J\u0010\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u0017H$J\b\u0010\u001c\u001a\u00020\u0006H\u0002J\b\u0010\u001d\u001a\u00020\u0006H\u0016J\b\u0010\u001e\u001a\u00020\u001fH\u0016J!\u0010 \u001a\u0002H!\"\u0004\b\u0000\u0010!2\f\u0010\"\u001a\b\u0012\u0004\u0012\u0002H!0#H\u0016¢\u0006\u0002\u0010$J\u0010\u0010%\u001a\u00020\u001f2\u0006\u0010\u001b\u001a\u00020\u0017H\u0014J\u0010\u0010&\u001a\u00020'2\u0006\u0010\u001b\u001a\u00020\u0017H\u0014J\u0010\u0010(\u001a\u00020)2\u0006\u0010\u001b\u001a\u00020\u0017H\u0014J\u0010\u0010*\u001a\u00020+2\u0006\u0010\u001b\u001a\u00020\u0017H\u0014J\u0018\u0010,\u001a\u00020-2\u0006\u0010\u001b\u001a\u00020\u00172\u0006\u0010.\u001a\u00020\u0015H\u0014J\u0010\u0010/\u001a\u0002002\u0006\u0010\u001b\u001a\u00020\u0017H\u0014J\u0018\u00101\u001a\u0002022\u0006\u0010\u001b\u001a\u00020\u00172\u0006\u00103\u001a\u00020\u0015H\u0014J\u0010\u00104\u001a\u00020-2\u0006\u0010\u001b\u001a\u00020\u0017H\u0014J\u0010\u00105\u001a\u0002062\u0006\u0010\u001b\u001a\u00020\u0017H\u0014J\u0010\u00107\u001a\u00020\u001f2\u0006\u0010\u001b\u001a\u00020\u0017H\u0014J\u0012\u00108\u001a\u0004\u0018\u0001092\u0006\u0010\u001b\u001a\u00020\u0017H\u0014J\u0010\u0010:\u001a\u00020;2\u0006\u0010\u001b\u001a\u00020\u0017H\u0014J\u0010\u0010<\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u0017H\u0014J\u0010\u0010=\u001a\u00020>2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010?\u001a\u00020@2\u0006\u0010\u001b\u001a\u00020\u0017H\u0004J\u0010\u0010A\u001a\u0002092\u0006\u0010B\u001a\u00020\u0017H\u0002J\u0014\u0010C\u001a\u00020D*\u00020@2\u0006\u0010E\u001a\u00020\u0017H\u0002J?\u0010B\u001a\u0002H!\"\b\b\u0000\u0010!*\u00020F*\u00020@2\u0006\u0010B\u001a\u00020\u00172\u0019\u0010G\u001a\u0015\u0012\u0004\u0012\u00020@\u0012\u0006\u0012\u0004\u0018\u0001H!0H¢\u0006\u0002\bIH\u0082\b¢\u0006\u0002\u0010JR\u0010\u0010\b\u001a\u00020\t8\u0004X\u0085\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011\u0082\u0001\u0003KLM¨\u0006N"}, d2 = {"Lkotlinx/serialization/json/internal/AbstractJsonTreeDecoder;", "Lkotlinx/serialization/internal/NamedValueDecoder;", "Lkotlinx/serialization/json/JsonDecoder;", "json", "Lkotlinx/serialization/json/Json;", "value", "Lkotlinx/serialization/json/JsonElement;", "(Lkotlinx/serialization/json/Json;Lkotlinx/serialization/json/JsonElement;)V", "configuration", "Lkotlinx/serialization/json/JsonConfiguration;", "getJson", "()Lkotlinx/serialization/json/Json;", "serializersModule", "Lkotlinx/serialization/modules/SerializersModule;", "getSerializersModule", "()Lkotlinx/serialization/modules/SerializersModule;", "getValue", "()Lkotlinx/serialization/json/JsonElement;", "beginStructure", "Lkotlinx/serialization/encoding/CompositeDecoder;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "composeName", "", "parentName", "childName", "currentElement", ViewHierarchyConstants.TAG_KEY, "currentObject", "decodeJsonElement", "decodeNotNullMark", "", "decodeSerializableValue", ExifInterface.GPS_DIRECTION_TRUE, "deserializer", "Lkotlinx/serialization/DeserializationStrategy;", "(Lkotlinx/serialization/DeserializationStrategy;)Ljava/lang/Object;", "decodeTaggedBoolean", "decodeTaggedByte", "", "decodeTaggedChar", "", "decodeTaggedDouble", "", "decodeTaggedEnum", "", "enumDescriptor", "decodeTaggedFloat", "", "decodeTaggedInline", "Lkotlinx/serialization/encoding/Decoder;", "inlineDescriptor", "decodeTaggedInt", "decodeTaggedLong", "", "decodeTaggedNotNullMark", "decodeTaggedNull", "", "decodeTaggedShort", "", "decodeTaggedString", "endStructure", "", "getPrimitiveValue", "Lkotlinx/serialization/json/JsonPrimitive;", "unparsedPrimitive", TreeJsonEncoderKt.PRIMITIVE_TAG, "asLiteral", "Lkotlinx/serialization/json/JsonLiteral;", "type", "", "block", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "(Lkotlinx/serialization/json/JsonPrimitive;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "Lkotlinx/serialization/json/internal/JsonPrimitiveDecoder;", "Lkotlinx/serialization/json/internal/JsonTreeDecoder;", "Lkotlinx/serialization/json/internal/JsonTreeListDecoder;", "kotlinx-serialization-json"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class AbstractJsonTreeDecoder extends NamedValueDecoder implements JsonDecoder {
    protected final JsonConfiguration configuration;
    private final Json json;
    private final JsonElement value;

    public /* synthetic */ AbstractJsonTreeDecoder(Json json, JsonElement jsonElement, DefaultConstructorMarker defaultConstructorMarker) {
        this(json, jsonElement);
    }

    @Override // kotlinx.serialization.internal.NamedValueDecoder
    protected String composeName(String parentName, String childName) {
        Intrinsics.checkNotNullParameter(parentName, "parentName");
        Intrinsics.checkNotNullParameter(childName, "childName");
        return childName;
    }

    protected abstract JsonElement currentElement(String str);

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.TaggedDecoder
    public Void decodeTaggedNull(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        return null;
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder, kotlinx.serialization.encoding.CompositeDecoder
    public void endStructure(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
    }

    @Override // kotlinx.serialization.json.JsonDecoder
    public Json getJson() {
        return this.json;
    }

    public JsonElement getValue() {
        return this.value;
    }

    private AbstractJsonTreeDecoder(Json json, JsonElement jsonElement) {
        this.json = json;
        this.value = jsonElement;
        this.configuration = getJson().getConfiguration();
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder, kotlinx.serialization.encoding.Decoder, kotlinx.serialization.encoding.CompositeDecoder
    public SerializersModule getSerializersModule() {
        return getJson().getSerializersModule();
    }

    private final JsonElement currentObject() {
        JsonElement currentElement;
        String currentTagOrNull = getCurrentTagOrNull();
        return (currentTagOrNull == null || (currentElement = currentElement(currentTagOrNull)) == null) ? getValue() : currentElement;
    }

    @Override // kotlinx.serialization.json.JsonDecoder
    public JsonElement decodeJsonElement() {
        return currentObject();
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder, kotlinx.serialization.encoding.Decoder
    public <T> T decodeSerializableValue(DeserializationStrategy<T> deserializer) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        return (T) PolymorphicKt.decodeSerializableValuePolymorphic(this, deserializer);
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder, kotlinx.serialization.encoding.Decoder
    public CompositeDecoder beginStructure(SerialDescriptor descriptor) {
        CompositeDecoder jsonTreeMapDecoder;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        JsonElement currentObject = currentObject();
        SerialKind kind = descriptor.getKind();
        if (!(Intrinsics.areEqual(kind, StructureKind.LIST.INSTANCE) ? true : kind instanceof PolymorphicKind)) {
            if (Intrinsics.areEqual(kind, StructureKind.MAP.INSTANCE)) {
                Json json = getJson();
                SerialDescriptor carrierDescriptor = WriteModeKt.carrierDescriptor(descriptor.getElementDescriptor(0), json.getSerializersModule());
                SerialKind kind2 = carrierDescriptor.getKind();
                if ((kind2 instanceof PrimitiveKind) || Intrinsics.areEqual(kind2, SerialKind.ENUM.INSTANCE)) {
                    Json json2 = getJson();
                    if (currentObject instanceof JsonObject) {
                        jsonTreeMapDecoder = new JsonTreeMapDecoder(json2, (JsonObject) currentObject);
                    } else {
                        throw JsonExceptionsKt.JsonDecodingException(-1, "Expected " + Reflection.getOrCreateKotlinClass(JsonObject.class) + " as the serialized body of " + descriptor.getSerialName() + ", but had " + Reflection.getOrCreateKotlinClass(currentObject.getClass()));
                    }
                } else if (json.getConfiguration().getAllowStructuredMapKeys()) {
                    Json json3 = getJson();
                    if (currentObject instanceof JsonArray) {
                        jsonTreeMapDecoder = new JsonTreeListDecoder(json3, (JsonArray) currentObject);
                    } else {
                        throw JsonExceptionsKt.JsonDecodingException(-1, "Expected " + Reflection.getOrCreateKotlinClass(JsonArray.class) + " as the serialized body of " + descriptor.getSerialName() + ", but had " + Reflection.getOrCreateKotlinClass(currentObject.getClass()));
                    }
                } else {
                    throw JsonExceptionsKt.InvalidKeyKindException(carrierDescriptor);
                }
                return jsonTreeMapDecoder;
            }
            Json json4 = getJson();
            if (currentObject instanceof JsonObject) {
                return new JsonTreeDecoder(json4, (JsonObject) currentObject, null, null, 12, null);
            }
            throw JsonExceptionsKt.JsonDecodingException(-1, "Expected " + Reflection.getOrCreateKotlinClass(JsonObject.class) + " as the serialized body of " + descriptor.getSerialName() + ", but had " + Reflection.getOrCreateKotlinClass(currentObject.getClass()));
        }
        Json json5 = getJson();
        if (currentObject instanceof JsonArray) {
            return new JsonTreeListDecoder(json5, (JsonArray) currentObject);
        }
        throw JsonExceptionsKt.JsonDecodingException(-1, "Expected " + Reflection.getOrCreateKotlinClass(JsonArray.class) + " as the serialized body of " + descriptor.getSerialName() + ", but had " + Reflection.getOrCreateKotlinClass(currentObject.getClass()));
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder, kotlinx.serialization.encoding.Decoder
    public boolean decodeNotNullMark() {
        return !(currentObject() instanceof JsonNull);
    }

    protected final JsonPrimitive getPrimitiveValue(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        JsonElement currentElement = currentElement(tag);
        JsonPrimitive jsonPrimitive = currentElement instanceof JsonPrimitive ? (JsonPrimitive) currentElement : null;
        if (jsonPrimitive != null) {
            return jsonPrimitive;
        }
        throw JsonExceptionsKt.JsonDecodingException(-1, "Expected JsonPrimitive at " + tag + ", found " + currentElement, currentObject().toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.TaggedDecoder
    public int decodeTaggedEnum(String tag, SerialDescriptor enumDescriptor) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        return JsonNamesMapKt.getJsonNameIndexOrThrow$default(enumDescriptor, getJson(), getPrimitiveValue(tag).getContent(), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.TaggedDecoder
    public boolean decodeTaggedNotNullMark(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        return currentElement(tag) != JsonNull.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.TaggedDecoder
    public boolean decodeTaggedBoolean(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        JsonPrimitive primitiveValue = getPrimitiveValue(tag);
        if (!getJson().getConfiguration().isLenient() && asLiteral(primitiveValue, TypedValues.Custom.S_BOOLEAN).isString()) {
            throw JsonExceptionsKt.JsonDecodingException(-1, "Boolean literal for key '" + tag + "' should be unquoted.\nUse 'isLenient = true' in 'Json {}` builder to accept non-compliant JSON.", currentObject().toString());
        }
        try {
            Boolean booleanOrNull = JsonElementKt.getBooleanOrNull(primitiveValue);
            if (booleanOrNull != null) {
                return booleanOrNull.booleanValue();
            }
            throw new IllegalArgumentException();
        } catch (IllegalArgumentException unused) {
            unparsedPrimitive(TypedValues.Custom.S_BOOLEAN);
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.TaggedDecoder
    public byte decodeTaggedByte(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        try {
            int i = JsonElementKt.getInt(getPrimitiveValue(tag));
            boolean z = false;
            if (-128 <= i && i <= 127) {
                z = true;
            }
            Byte valueOf = z ? Byte.valueOf((byte) i) : null;
            if (valueOf == null) {
                unparsedPrimitive("byte");
                throw new KotlinNothingValueException();
            }
            return valueOf.byteValue();
        } catch (IllegalArgumentException unused) {
            unparsedPrimitive("byte");
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.TaggedDecoder
    public short decodeTaggedShort(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        try {
            int i = JsonElementKt.getInt(getPrimitiveValue(tag));
            boolean z = false;
            if (-32768 <= i && i <= 32767) {
                z = true;
            }
            Short valueOf = z ? Short.valueOf((short) i) : null;
            if (valueOf == null) {
                unparsedPrimitive("short");
                throw new KotlinNothingValueException();
            }
            return valueOf.shortValue();
        } catch (IllegalArgumentException unused) {
            unparsedPrimitive("short");
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.TaggedDecoder
    public int decodeTaggedInt(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        try {
            return JsonElementKt.getInt(getPrimitiveValue(tag));
        } catch (IllegalArgumentException unused) {
            unparsedPrimitive("int");
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.TaggedDecoder
    public long decodeTaggedLong(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        try {
            return JsonElementKt.getLong(getPrimitiveValue(tag));
        } catch (IllegalArgumentException unused) {
            unparsedPrimitive("long");
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.TaggedDecoder
    public float decodeTaggedFloat(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        try {
            float f = JsonElementKt.getFloat(getPrimitiveValue(tag));
            if (!getJson().getConfiguration().getAllowSpecialFloatingPointValues()) {
                if (!((Float.isInfinite(f) || Float.isNaN(f)) ? false : true)) {
                    throw JsonExceptionsKt.InvalidFloatingPointDecoded(Float.valueOf(f), tag, currentObject().toString());
                }
            }
            return f;
        } catch (IllegalArgumentException unused) {
            unparsedPrimitive(TypedValues.Custom.S_FLOAT);
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.TaggedDecoder
    public double decodeTaggedDouble(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        try {
            double d = JsonElementKt.getDouble(getPrimitiveValue(tag));
            if (!getJson().getConfiguration().getAllowSpecialFloatingPointValues()) {
                if (!((Double.isInfinite(d) || Double.isNaN(d)) ? false : true)) {
                    throw JsonExceptionsKt.InvalidFloatingPointDecoded(Double.valueOf(d), tag, currentObject().toString());
                }
            }
            return d;
        } catch (IllegalArgumentException unused) {
            unparsedPrimitive("double");
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.TaggedDecoder
    public char decodeTaggedChar(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        try {
            return StringsKt.single(getPrimitiveValue(tag).getContent());
        } catch (IllegalArgumentException unused) {
            unparsedPrimitive("char");
            throw new KotlinNothingValueException();
        }
    }

    private final <T> T primitive(JsonPrimitive jsonPrimitive, String str, Function1<? super JsonPrimitive, ? extends T> function1) {
        try {
            T invoke = function1.invoke(jsonPrimitive);
            if (invoke != null) {
                return invoke;
            }
            unparsedPrimitive(str);
            throw new KotlinNothingValueException();
        } catch (IllegalArgumentException unused) {
            unparsedPrimitive(str);
            throw new KotlinNothingValueException();
        }
    }

    private final Void unparsedPrimitive(String str) {
        throw JsonExceptionsKt.JsonDecodingException(-1, "Failed to parse '" + str + '\'', currentObject().toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.TaggedDecoder
    public String decodeTaggedString(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        JsonPrimitive primitiveValue = getPrimitiveValue(tag);
        if (!getJson().getConfiguration().isLenient() && !asLiteral(primitiveValue, TypedValues.Custom.S_STRING).isString()) {
            throw JsonExceptionsKt.JsonDecodingException(-1, "String literal for key '" + tag + "' should be quoted.\nUse 'isLenient = true' in 'Json {}` builder to accept non-compliant JSON.", currentObject().toString());
        } else if (primitiveValue instanceof JsonNull) {
            throw JsonExceptionsKt.JsonDecodingException(-1, "Unexpected 'null' value instead of string literal", currentObject().toString());
        } else {
            return primitiveValue.getContent();
        }
    }

    private final JsonLiteral asLiteral(JsonPrimitive jsonPrimitive, String str) {
        JsonLiteral jsonLiteral = jsonPrimitive instanceof JsonLiteral ? (JsonLiteral) jsonPrimitive : null;
        if (jsonLiteral != null) {
            return jsonLiteral;
        }
        throw JsonExceptionsKt.JsonDecodingException(-1, "Unexpected 'null' when " + str + " was expected");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.TaggedDecoder
    public Decoder decodeTaggedInline(String tag, SerialDescriptor inlineDescriptor) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(inlineDescriptor, "inlineDescriptor");
        return StreamingJsonEncoderKt.isUnsignedNumber(inlineDescriptor) ? new JsonDecoderForUnsignedTypes(new StringJsonLexer(getPrimitiveValue(tag).getContent()), getJson()) : super.decodeTaggedInline((AbstractJsonTreeDecoder) tag, inlineDescriptor);
    }
}
