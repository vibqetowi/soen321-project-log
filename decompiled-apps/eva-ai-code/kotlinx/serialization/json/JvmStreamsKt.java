package kotlinx.serialization.json;

import androidx.exifinterface.media.ExifInterface;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KType;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.json.internal.JsonIteratorKt;
import kotlinx.serialization.json.internal.JsonToWriterStringBuilder;
import kotlinx.serialization.json.internal.ReaderJsonLexer;
import kotlinx.serialization.json.internal.StreamingJsonDecoder;
import kotlinx.serialization.json.internal.StreamingJsonEncoder;
import kotlinx.serialization.json.internal.WriteMode;
import kotlinx.serialization.modules.SerializersModule;
/* compiled from: JvmStreams.kt */
@Metadata(d1 = {"\u0000<\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\"\u0010\u0000\u001a\u0002H\u0001\"\u0006\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\b¢\u0006\u0002\u0010\u0005\u001a-\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u0004H\u0007¢\u0006\u0002\u0010\b\u001a8\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00010\n\"\u0004\b\u0000\u0010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00010\u00072\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007\u001a-\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00010\n\"\u0006\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0087\b\u001a*\u0010\r\u001a\u00020\u000e\"\u0006\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00022\u0006\u0010\u000f\u001a\u0002H\u00012\u0006\u0010\u0003\u001a\u00020\u0010H\u0087\b¢\u0006\u0002\u0010\u0011\u001a5\u0010\r\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u0001*\u00020\u00022\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00010\u00132\u0006\u0010\u000f\u001a\u0002H\u00012\u0006\u0010\u0003\u001a\u00020\u0010H\u0007¢\u0006\u0002\u0010\u0014¨\u0006\u0015"}, d2 = {"decodeFromStream", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/serialization/json/Json;", "stream", "Ljava/io/InputStream;", "(Lkotlinx/serialization/json/Json;Ljava/io/InputStream;)Ljava/lang/Object;", "deserializer", "Lkotlinx/serialization/DeserializationStrategy;", "(Lkotlinx/serialization/json/Json;Lkotlinx/serialization/DeserializationStrategy;Ljava/io/InputStream;)Ljava/lang/Object;", "decodeToSequence", "Lkotlin/sequences/Sequence;", "format", "Lkotlinx/serialization/json/DecodeSequenceMode;", "encodeToStream", "", "value", "Ljava/io/OutputStream;", "(Lkotlinx/serialization/json/Json;Ljava/lang/Object;Ljava/io/OutputStream;)V", "serializer", "Lkotlinx/serialization/SerializationStrategy;", "(Lkotlinx/serialization/json/Json;Lkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;Ljava/io/OutputStream;)V", "kotlinx-serialization-json"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class JvmStreamsKt {
    @ExperimentalSerializationApi
    public static final <T> void encodeToStream(Json json, SerializationStrategy<? super T> serializer, T t, OutputStream stream) {
        Intrinsics.checkNotNullParameter(json, "<this>");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Intrinsics.checkNotNullParameter(stream, "stream");
        JsonToWriterStringBuilder jsonToWriterStringBuilder = new JsonToWriterStringBuilder(stream, null, 2, null);
        try {
            new StreamingJsonEncoder(jsonToWriterStringBuilder, json, WriteMode.OBJ, new JsonEncoder[WriteMode.values().length]).encodeSerializableValue(serializer, t);
        } finally {
            jsonToWriterStringBuilder.release();
        }
    }

    @ExperimentalSerializationApi
    public static final /* synthetic */ <T> void encodeToStream(Json json, T t, OutputStream stream) {
        Intrinsics.checkNotNullParameter(json, "<this>");
        Intrinsics.checkNotNullParameter(stream, "stream");
        SerializersModule serializersModule = json.getSerializersModule();
        Intrinsics.reifiedOperationMarker(6, ExifInterface.GPS_DIRECTION_TRUE);
        encodeToStream(json, SerializersKt.serializer(serializersModule, (KType) null), t, stream);
    }

    @ExperimentalSerializationApi
    public static final <T> T decodeFromStream(Json json, DeserializationStrategy<T> deserializer, InputStream stream) {
        Intrinsics.checkNotNullParameter(json, "<this>");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        Intrinsics.checkNotNullParameter(stream, "stream");
        ReaderJsonLexer readerJsonLexer = new ReaderJsonLexer(stream, (Charset) null, 2, (DefaultConstructorMarker) null);
        T t = (T) new StreamingJsonDecoder(json, WriteMode.OBJ, readerJsonLexer, deserializer.getDescriptor()).decodeSerializableValue(deserializer);
        readerJsonLexer.expectEof();
        return t;
    }

    @ExperimentalSerializationApi
    public static final /* synthetic */ <T> T decodeFromStream(Json json, InputStream stream) {
        Intrinsics.checkNotNullParameter(json, "<this>");
        Intrinsics.checkNotNullParameter(stream, "stream");
        SerializersModule serializersModule = json.getSerializersModule();
        Intrinsics.reifiedOperationMarker(6, ExifInterface.GPS_DIRECTION_TRUE);
        return (T) decodeFromStream(json, SerializersKt.serializer(serializersModule, (KType) null), stream);
    }

    public static /* synthetic */ Sequence decodeToSequence$default(Json json, InputStream inputStream, DeserializationStrategy deserializationStrategy, DecodeSequenceMode decodeSequenceMode, int i, Object obj) {
        if ((i & 4) != 0) {
            decodeSequenceMode = DecodeSequenceMode.AUTO_DETECT;
        }
        return decodeToSequence(json, inputStream, deserializationStrategy, decodeSequenceMode);
    }

    @ExperimentalSerializationApi
    public static final <T> Sequence<T> decodeToSequence(Json json, InputStream stream, DeserializationStrategy<T> deserializer, DecodeSequenceMode format) {
        Intrinsics.checkNotNullParameter(json, "<this>");
        Intrinsics.checkNotNullParameter(stream, "stream");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        Intrinsics.checkNotNullParameter(format, "format");
        final Iterator JsonIterator = JsonIteratorKt.JsonIterator(format, json, new ReaderJsonLexer(stream, (Charset) null, 2, (DefaultConstructorMarker) null), deserializer);
        return SequencesKt.constrainOnce(new Sequence<T>() { // from class: kotlinx.serialization.json.JvmStreamsKt$decodeToSequence$$inlined$Sequence$1
            @Override // kotlin.sequences.Sequence
            public Iterator<T> iterator() {
                return JsonIterator;
            }
        });
    }

    public static /* synthetic */ Sequence decodeToSequence$default(Json json, InputStream stream, DecodeSequenceMode format, int i, Object obj) {
        if ((i & 2) != 0) {
            format = DecodeSequenceMode.AUTO_DETECT;
        }
        Intrinsics.checkNotNullParameter(json, "<this>");
        Intrinsics.checkNotNullParameter(stream, "stream");
        Intrinsics.checkNotNullParameter(format, "format");
        SerializersModule serializersModule = json.getSerializersModule();
        Intrinsics.reifiedOperationMarker(6, ExifInterface.GPS_DIRECTION_TRUE);
        return decodeToSequence(json, stream, SerializersKt.serializer(serializersModule, (KType) null), format);
    }

    @ExperimentalSerializationApi
    public static final /* synthetic */ <T> Sequence<T> decodeToSequence(Json json, InputStream stream, DecodeSequenceMode format) {
        Intrinsics.checkNotNullParameter(json, "<this>");
        Intrinsics.checkNotNullParameter(stream, "stream");
        Intrinsics.checkNotNullParameter(format, "format");
        SerializersModule serializersModule = json.getSerializersModule();
        Intrinsics.reifiedOperationMarker(6, ExifInterface.GPS_DIRECTION_TRUE);
        return decodeToSequence(json, stream, SerializersKt.serializer(serializersModule, (KType) null), format);
    }
}
