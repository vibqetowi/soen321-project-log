package kotlinx.serialization.json.internal;

import androidx.exifinterface.media.ExifInterface;
import java.util.Iterator;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.json.DecodeSequenceMode;
import kotlinx.serialization.json.Json;
/* compiled from: JsonIterator.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B#\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0002\u0010\tJ\t\u0010\f\u001a\u00020\u000bH\u0096\u0002J\u000e\u0010\r\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u000eR\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lkotlinx/serialization/json/internal/JsonIteratorArrayWrapped;", ExifInterface.GPS_DIRECTION_TRUE, "", "json", "Lkotlinx/serialization/json/Json;", "lexer", "Lkotlinx/serialization/json/internal/ReaderJsonLexer;", "deserializer", "Lkotlinx/serialization/DeserializationStrategy;", "(Lkotlinx/serialization/json/Json;Lkotlinx/serialization/json/internal/ReaderJsonLexer;Lkotlinx/serialization/DeserializationStrategy;)V", "first", "", "hasNext", "next", "()Ljava/lang/Object;", "kotlinx-serialization-json"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
final class JsonIteratorArrayWrapped<T> implements Iterator<T>, KMappedMarker {
    private final DeserializationStrategy<T> deserializer;
    private boolean first;
    private final Json json;
    private final ReaderJsonLexer lexer;

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public JsonIteratorArrayWrapped(Json json, ReaderJsonLexer lexer, DeserializationStrategy<T> deserializer) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(lexer, "lexer");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        this.json = json;
        this.lexer = lexer;
        this.deserializer = deserializer;
        this.first = true;
    }

    @Override // java.util.Iterator
    public T next() {
        if (this.first) {
            this.first = false;
        } else {
            this.lexer.consumeNextToken(',');
        }
        return (T) new StreamingJsonDecoder(this.json, WriteMode.OBJ, this.lexer, this.deserializer.getDescriptor()).decodeSerializableValue(this.deserializer);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.lexer.peekNextToken() != 9) {
            if (this.lexer.isNotEof()) {
                return true;
            }
            this.lexer.fail$kotlinx_serialization_json((byte) 9);
            throw new KotlinNothingValueException();
        }
        this.lexer.consumeNextToken((byte) 9);
        if (this.lexer.isNotEof()) {
            if (this.lexer.peekNextToken() != 8) {
                this.lexer.expectEof();
                return false;
            }
            ReaderJsonLexer readerJsonLexer = this.lexer;
            AbstractJsonLexer.fail$default(readerJsonLexer, "There is a start of the new array after the one parsed to sequence. " + DecodeSequenceMode.ARRAY_WRAPPED.name() + " mode doesn't merge consecutive arrays.\nIf you need to parse a stream of arrays, please use " + DecodeSequenceMode.WHITESPACE_SEPARATED.name() + " mode instead.", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        return false;
    }
}
