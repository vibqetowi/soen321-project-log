package kotlinx.serialization.internal;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder;
/* compiled from: Tuples.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Lkotlinx/serialization/descriptors/ClassSerialDescriptorBuilder;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
final class MapEntrySerializer$descriptor$1 extends Lambda implements Function1<ClassSerialDescriptorBuilder, Unit> {
    final /* synthetic */ KSerializer<K> $keySerializer;
    final /* synthetic */ KSerializer<V> $valueSerializer;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapEntrySerializer$descriptor$1(KSerializer<K> kSerializer, KSerializer<V> kSerializer2) {
        super(1);
        this.$keySerializer = kSerializer;
        this.$valueSerializer = kSerializer2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ClassSerialDescriptorBuilder classSerialDescriptorBuilder) {
        invoke2(classSerialDescriptorBuilder);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(ClassSerialDescriptorBuilder buildSerialDescriptor) {
        Intrinsics.checkNotNullParameter(buildSerialDescriptor, "$this$buildSerialDescriptor");
        ClassSerialDescriptorBuilder.element$default(buildSerialDescriptor, "key", this.$keySerializer.getDescriptor(), null, false, 12, null);
        ClassSerialDescriptorBuilder.element$default(buildSerialDescriptor, "value", this.$valueSerializer.getDescriptor(), null, false, 12, null);
    }
}
