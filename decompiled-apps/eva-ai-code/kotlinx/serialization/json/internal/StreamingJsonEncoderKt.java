package kotlinx.serialization.json.internal;

import java.util.Set;
import kotlin.Metadata;
import kotlin.UByte;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.UShort;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
/* compiled from: StreamingJsonEncoder.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\"\u001c\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0003\u0010\u0004\"\u001e\u0010\u0005\u001a\u00020\u0006*\u00020\u00028@X\u0081\u0004¢\u0006\f\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\t¨\u0006\n"}, d2 = {"unsignedNumberDescriptors", "", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getUnsignedNumberDescriptors$annotations", "()V", "isUnsignedNumber", "", "isUnsignedNumber$annotations", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)Z", "kotlinx-serialization-json"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class StreamingJsonEncoderKt {
    private static final Set<SerialDescriptor> unsignedNumberDescriptors = SetsKt.setOf((Object[]) new SerialDescriptor[]{BuiltinSerializersKt.serializer(UInt.Companion).getDescriptor(), BuiltinSerializersKt.serializer(ULong.Companion).getDescriptor(), BuiltinSerializersKt.serializer(UByte.Companion).getDescriptor(), BuiltinSerializersKt.serializer(UShort.Companion).getDescriptor()});

    @ExperimentalSerializationApi
    private static /* synthetic */ void getUnsignedNumberDescriptors$annotations() {
    }

    @ExperimentalSerializationApi
    public static /* synthetic */ void isUnsignedNumber$annotations(SerialDescriptor serialDescriptor) {
    }

    public static final boolean isUnsignedNumber(SerialDescriptor serialDescriptor) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "<this>");
        return serialDescriptor.isInline() && unsignedNumberDescriptors.contains(serialDescriptor);
    }
}
