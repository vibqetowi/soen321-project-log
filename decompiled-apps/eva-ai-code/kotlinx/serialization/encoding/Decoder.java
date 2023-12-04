package kotlinx.serialization.encoding;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.modules.SerializersModule;
/* compiled from: Decoding.kt */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\n\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\u000bH&J\b\u0010\f\u001a\u00020\rH&J\b\u0010\u000e\u001a\u00020\u000fH&J\b\u0010\u0010\u001a\u00020\u0011H&J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\tH&J\b\u0010\u0015\u001a\u00020\u0016H&J\u0010\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\tH'J\b\u0010\u0019\u001a\u00020\u0013H&J\b\u0010\u001a\u001a\u00020\u001bH&J\b\u0010\u001c\u001a\u00020\u000bH'J\n\u0010\u001d\u001a\u0004\u0018\u00010\u001eH'J)\u0010\u001f\u001a\u0004\u0018\u0001H \"\b\b\u0000\u0010 *\u00020\u00012\u000e\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H 0\"H\u0017¢\u0006\u0002\u0010#J!\u0010$\u001a\u0002H \"\u0004\b\u0000\u0010 2\f\u0010!\u001a\b\u0012\u0004\u0012\u0002H 0\"H\u0016¢\u0006\u0002\u0010#J\b\u0010%\u001a\u00020&H&J\b\u0010'\u001a\u00020(H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006)"}, d2 = {"Lkotlinx/serialization/encoding/Decoder;", "", "serializersModule", "Lkotlinx/serialization/modules/SerializersModule;", "getSerializersModule", "()Lkotlinx/serialization/modules/SerializersModule;", "beginStructure", "Lkotlinx/serialization/encoding/CompositeDecoder;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "decodeBoolean", "", "decodeByte", "", "decodeChar", "", "decodeDouble", "", "decodeEnum", "", "enumDescriptor", "decodeFloat", "", "decodeInline", "inlineDescriptor", "decodeInt", "decodeLong", "", "decodeNotNullMark", "decodeNull", "", "decodeNullableSerializableValue", ExifInterface.GPS_DIRECTION_TRUE, "deserializer", "Lkotlinx/serialization/DeserializationStrategy;", "(Lkotlinx/serialization/DeserializationStrategy;)Ljava/lang/Object;", "decodeSerializableValue", "decodeShort", "", "decodeString", "", "kotlinx-serialization-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface Decoder {
    CompositeDecoder beginStructure(SerialDescriptor serialDescriptor);

    boolean decodeBoolean();

    byte decodeByte();

    char decodeChar();

    double decodeDouble();

    int decodeEnum(SerialDescriptor serialDescriptor);

    float decodeFloat();

    @ExperimentalSerializationApi
    Decoder decodeInline(SerialDescriptor serialDescriptor);

    int decodeInt();

    long decodeLong();

    @ExperimentalSerializationApi
    boolean decodeNotNullMark();

    @ExperimentalSerializationApi
    Void decodeNull();

    @ExperimentalSerializationApi
    <T> T decodeNullableSerializableValue(DeserializationStrategy<T> deserializationStrategy);

    <T> T decodeSerializableValue(DeserializationStrategy<T> deserializationStrategy);

    short decodeShort();

    String decodeString();

    SerializersModule getSerializersModule();

    /* compiled from: Decoding.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class DefaultImpls {
        public static <T> T decodeSerializableValue(Decoder decoder, DeserializationStrategy<T> deserializer) {
            Intrinsics.checkNotNullParameter(deserializer, "deserializer");
            return deserializer.deserialize(decoder);
        }

        @ExperimentalSerializationApi
        public static <T> T decodeNullableSerializableValue(Decoder decoder, DeserializationStrategy<T> deserializer) {
            Intrinsics.checkNotNullParameter(deserializer, "deserializer");
            return (deserializer.getDescriptor().isNullable() || decoder.decodeNotNullMark()) ? (T) decoder.decodeSerializableValue(deserializer) : (T) decoder.decodeNull();
        }
    }
}
