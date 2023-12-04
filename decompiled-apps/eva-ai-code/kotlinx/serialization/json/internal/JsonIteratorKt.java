package kotlinx.serialization.json.internal;

import androidx.exifinterface.media.ExifInterface;
import io.grpc.netty.shaded.io.netty.handler.codec.rtsp.RtspHeaders;
import java.util.Iterator;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.json.DecodeSequenceMode;
import kotlinx.serialization.json.Json;
/* compiled from: JsonIterator.kt */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u001a:\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00020\nH\u0000\u001a\u0014\u0010\u000b\u001a\u00020\u0004*\u00020\f2\u0006\u0010\r\u001a\u00020\u0004H\u0002\u001a\f\u0010\u000e\u001a\u00020\u000f*\u00020\fH\u0002¨\u0006\u0010"}, d2 = {"JsonIterator", "", ExifInterface.GPS_DIRECTION_TRUE, RtspHeaders.Values.MODE, "Lkotlinx/serialization/json/DecodeSequenceMode;", "json", "Lkotlinx/serialization/json/Json;", "lexer", "Lkotlinx/serialization/json/internal/ReaderJsonLexer;", "deserializer", "Lkotlinx/serialization/DeserializationStrategy;", "determineFormat", "Lkotlinx/serialization/json/internal/AbstractJsonLexer;", "suggested", "tryConsumeStartArray", "", "kotlinx-serialization-json"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class JsonIteratorKt {

    /* compiled from: JsonIterator.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DecodeSequenceMode.values().length];
            iArr[DecodeSequenceMode.WHITESPACE_SEPARATED.ordinal()] = 1;
            iArr[DecodeSequenceMode.ARRAY_WRAPPED.ordinal()] = 2;
            iArr[DecodeSequenceMode.AUTO_DETECT.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final <T> Iterator<T> JsonIterator(DecodeSequenceMode mode, Json json, ReaderJsonLexer lexer, DeserializationStrategy<T> deserializer) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(lexer, "lexer");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        int i = WhenMappings.$EnumSwitchMapping$0[determineFormat(lexer, mode).ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    throw new IllegalStateException("AbstractJsonLexer.determineFormat must be called beforehand.".toString());
                }
                throw new NoWhenBranchMatchedException();
            }
            return new JsonIteratorArrayWrapped(json, lexer, deserializer);
        }
        return new JsonIteratorWsSeparated(json, lexer, deserializer);
    }

    private static final DecodeSequenceMode determineFormat(AbstractJsonLexer abstractJsonLexer, DecodeSequenceMode decodeSequenceMode) {
        int i = WhenMappings.$EnumSwitchMapping$0[decodeSequenceMode.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return tryConsumeStartArray(abstractJsonLexer) ? DecodeSequenceMode.ARRAY_WRAPPED : DecodeSequenceMode.WHITESPACE_SEPARATED;
                }
                throw new NoWhenBranchMatchedException();
            } else if (tryConsumeStartArray(abstractJsonLexer)) {
                return DecodeSequenceMode.ARRAY_WRAPPED;
            } else {
                abstractJsonLexer.fail$kotlinx_serialization_json((byte) 8);
                throw new KotlinNothingValueException();
            }
        }
        return DecodeSequenceMode.WHITESPACE_SEPARATED;
    }

    private static final boolean tryConsumeStartArray(AbstractJsonLexer abstractJsonLexer) {
        if (abstractJsonLexer.peekNextToken() == 8) {
            abstractJsonLexer.consumeNextToken((byte) 8);
            return true;
        }
        return false;
    }
}
