package kotlinx.serialization.internal;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.DeserializationStrategy;
/* compiled from: Tagged.kt */
@Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0005\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", ExifInterface.GPS_DIRECTION_TRUE, "Tag", "invoke", "()Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
final class TaggedDecoder$decodeSerializableElement$1 extends Lambda implements Function0<T> {
    final /* synthetic */ DeserializationStrategy<T> $deserializer;
    final /* synthetic */ T $previousValue;
    final /* synthetic */ TaggedDecoder<Tag> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaggedDecoder$decodeSerializableElement$1(TaggedDecoder<Tag> taggedDecoder, DeserializationStrategy<T> deserializationStrategy, T t) {
        super(0);
        this.this$0 = taggedDecoder;
        this.$deserializer = deserializationStrategy;
        this.$previousValue = t;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final T invoke() {
        return this.this$0.decodeSerializableValue(this.$deserializer, this.$previousValue);
    }
}
