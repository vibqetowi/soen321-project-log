package kotlinx.serialization.encoding;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
/* compiled from: Decoding.kt */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a>\u0010\u0002\u001a\u0002H\u0003\"\u0004\b\u0000\u0010\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0019\b\u0004\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u0002H\u00030\b¢\u0006\u0002\b\nH\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\u000b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\f"}, d2 = {"decodeMethodDeprecated", "", "decodeStructure", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/serialization/encoding/Decoder;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "block", "Lkotlin/Function1;", "Lkotlinx/serialization/encoding/CompositeDecoder;", "Lkotlin/ExtensionFunctionType;", "(Lkotlinx/serialization/encoding/Decoder;Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "kotlinx-serialization-core"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DecodingKt {
    private static final String decodeMethodDeprecated = "Please migrate to decodeElement method which accepts old value.Feel free to ignore it if your format does not support updates.";

    public static final <T> T decodeStructure(Decoder decoder, SerialDescriptor descriptor, Function1<? super CompositeDecoder, ? extends T> block) {
        Intrinsics.checkNotNullParameter(decoder, "<this>");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(block, "block");
        CompositeDecoder beginStructure = decoder.beginStructure(descriptor);
        T invoke = block.invoke(beginStructure);
        beginStructure.endStructure(descriptor);
        return invoke;
    }
}
