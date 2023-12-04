package kotlinx.serialization.json.internal;

import androidx.exifinterface.media.ExifInterface;
import java.lang.annotation.Annotation;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.PolymorphicSerializerKt;
import kotlinx.serialization.SealedClassSerializer;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.PolymorphicKind;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.internal.AbstractPolymorphicSerializer;
import kotlinx.serialization.internal.JsonInternalDependenciesKt;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonClassDiscriminator;
import kotlinx.serialization.json.JsonDecoder;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonEncoder;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
/* compiled from: Polymorphic.kt */
@Metadata(d1 = {"\u0000Z\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u001a\u001a\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH\u0002\u001a*\u0010\n\u001a\u00020\u00012\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\u000f\u001a\u00020\u0007H\u0002\u001a\u0014\u0010\u000f\u001a\u00020\u0007*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0000\u001a%\u0010\u0013\u001a\u0002H\u0014\"\u0004\b\u0000\u0010\u0014*\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u00140\u0017H\u0000¢\u0006\u0002\u0010\u0018\u001aE\u0010\u0019\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0014*\u00020\u001a2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00140\f2\u0006\u0010\u001b\u001a\u0002H\u00142\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u001dH\u0080\bø\u0001\u0000¢\u0006\u0002\u0010\u001e\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001f"}, d2 = {"checkKind", "", "kind", "Lkotlinx/serialization/descriptors/SerialKind;", "throwSerializerNotFound", "", "type", "", "jsonTree", "Lkotlinx/serialization/json/JsonObject;", "validateIfSealed", "serializer", "Lkotlinx/serialization/SerializationStrategy;", "actualSerializer", "", "classDiscriminator", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "json", "Lkotlinx/serialization/json/Json;", "decodeSerializableValuePolymorphic", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/serialization/json/JsonDecoder;", "deserializer", "Lkotlinx/serialization/DeserializationStrategy;", "(Lkotlinx/serialization/json/JsonDecoder;Lkotlinx/serialization/DeserializationStrategy;)Ljava/lang/Object;", "encodePolymorphically", "Lkotlinx/serialization/json/JsonEncoder;", "value", "ifPolymorphic", "Lkotlin/Function1;", "(Lkotlinx/serialization/json/JsonEncoder;Lkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "kotlinx-serialization-json"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PolymorphicKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> void encodePolymorphically(JsonEncoder jsonEncoder, SerializationStrategy<? super T> serializer, T t, Function1<? super String, Unit> ifPolymorphic) {
        Intrinsics.checkNotNullParameter(jsonEncoder, "<this>");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Intrinsics.checkNotNullParameter(ifPolymorphic, "ifPolymorphic");
        if (!(serializer instanceof AbstractPolymorphicSerializer) || jsonEncoder.getJson().getConfiguration().getUseArrayPolymorphism()) {
            serializer.serialize(jsonEncoder, t);
            return;
        }
        AbstractPolymorphicSerializer abstractPolymorphicSerializer = (AbstractPolymorphicSerializer) serializer;
        String classDiscriminator = classDiscriminator(serializer.getDescriptor(), jsonEncoder.getJson());
        JsonEncoder jsonEncoder2 = jsonEncoder;
        if (t != 0) {
            SerializationStrategy findPolymorphicSerializer = PolymorphicSerializerKt.findPolymorphicSerializer(abstractPolymorphicSerializer, jsonEncoder2, t);
            validateIfSealed(abstractPolymorphicSerializer, findPolymorphicSerializer, classDiscriminator);
            checkKind(findPolymorphicSerializer.getDescriptor().getKind());
            ifPolymorphic.invoke(classDiscriminator);
            findPolymorphicSerializer.serialize(jsonEncoder2, t);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
    }

    public static final void validateIfSealed(SerializationStrategy<?> serializationStrategy, SerializationStrategy<Object> serializationStrategy2, String str) {
        if ((serializationStrategy instanceof SealedClassSerializer) && JsonInternalDependenciesKt.jsonCachedSerialNames(serializationStrategy2.getDescriptor()).contains(str)) {
            String serialName = serializationStrategy.getDescriptor().getSerialName();
            String serialName2 = serializationStrategy2.getDescriptor().getSerialName();
            throw new IllegalStateException(("Sealed class '" + serialName2 + "' cannot be serialized as base class '" + serialName + "' because it has property name that conflicts with JSON class discriminator '" + str + "'. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism").toString());
        }
    }

    public static final void checkKind(SerialKind kind) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        if (kind instanceof SerialKind.ENUM) {
            throw new IllegalStateException("Enums cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead".toString());
        }
        if (kind instanceof PrimitiveKind) {
            throw new IllegalStateException("Primitives cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead".toString());
        }
        if (kind instanceof PolymorphicKind) {
            throw new IllegalStateException("Actual serializer for polymorphic cannot be polymorphic itself".toString());
        }
    }

    public static final <T> T decodeSerializableValuePolymorphic(JsonDecoder jsonDecoder, DeserializationStrategy<T> deserializer) {
        JsonPrimitive jsonPrimitive;
        Intrinsics.checkNotNullParameter(jsonDecoder, "<this>");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        if (!(deserializer instanceof AbstractPolymorphicSerializer) || jsonDecoder.getJson().getConfiguration().getUseArrayPolymorphism()) {
            return deserializer.deserialize(jsonDecoder);
        }
        JsonElement decodeJsonElement = jsonDecoder.decodeJsonElement();
        SerialDescriptor descriptor = deserializer.getDescriptor();
        if (decodeJsonElement instanceof JsonObject) {
            JsonObject jsonObject = (JsonObject) decodeJsonElement;
            String classDiscriminator = classDiscriminator(deserializer.getDescriptor(), jsonDecoder.getJson());
            JsonElement jsonElement = (JsonElement) jsonObject.get((Object) classDiscriminator);
            String content = (jsonElement == null || (jsonPrimitive = JsonElementKt.getJsonPrimitive(jsonElement)) == null) ? null : jsonPrimitive.getContent();
            DeserializationStrategy<? extends T> findPolymorphicSerializerOrNull = ((AbstractPolymorphicSerializer) deserializer).findPolymorphicSerializerOrNull(jsonDecoder, content);
            if (findPolymorphicSerializerOrNull == null) {
                throwSerializerNotFound(content, jsonObject);
                throw new KotlinNothingValueException();
            }
            return (T) TreeJsonDecoderKt.readPolymorphicJson(jsonDecoder.getJson(), classDiscriminator, jsonObject, findPolymorphicSerializerOrNull);
        }
        throw JsonExceptionsKt.JsonDecodingException(-1, "Expected " + Reflection.getOrCreateKotlinClass(JsonObject.class) + " as the serialized body of " + descriptor.getSerialName() + ", but had " + Reflection.getOrCreateKotlinClass(decodeJsonElement.getClass()));
    }

    private static final Void throwSerializerNotFound(String str, JsonObject jsonObject) {
        String str2;
        if (str == null) {
            str2 = "missing class discriminator ('null')";
        } else {
            str2 = "class discriminator '" + str + '\'';
        }
        throw JsonExceptionsKt.JsonDecodingException(-1, "Polymorphic serializer was not found for " + str2, jsonObject.toString());
    }

    public static final String classDiscriminator(SerialDescriptor serialDescriptor, Json json) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "<this>");
        Intrinsics.checkNotNullParameter(json, "json");
        for (Annotation annotation : serialDescriptor.getAnnotations()) {
            if (annotation instanceof JsonClassDiscriminator) {
                return ((JsonClassDiscriminator) annotation).discriminator();
            }
        }
        return json.getConfiguration().getClassDiscriminator();
    }
}
