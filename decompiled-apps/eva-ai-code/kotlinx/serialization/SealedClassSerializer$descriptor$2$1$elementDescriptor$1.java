package kotlinx.serialization;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder;
import kotlinx.serialization.descriptors.SerialDescriptor;
/* compiled from: SealedSerializer.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "", "Lkotlinx/serialization/descriptors/ClassSerialDescriptorBuilder;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
final class SealedClassSerializer$descriptor$2$1$elementDescriptor$1 extends Lambda implements Function1<ClassSerialDescriptorBuilder, Unit> {
    final /* synthetic */ KSerializer<? extends T>[] $subclassSerializers;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SealedClassSerializer$descriptor$2$1$elementDescriptor$1(KSerializer<? extends T>[] kSerializerArr) {
        super(1);
        this.$subclassSerializers = kSerializerArr;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ClassSerialDescriptorBuilder classSerialDescriptorBuilder) {
        invoke2(classSerialDescriptorBuilder);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(ClassSerialDescriptorBuilder buildSerialDescriptor) {
        Intrinsics.checkNotNullParameter(buildSerialDescriptor, "$this$buildSerialDescriptor");
        for (KSerializer kSerializer : this.$subclassSerializers) {
            SerialDescriptor descriptor = kSerializer.getDescriptor();
            ClassSerialDescriptorBuilder.element$default(buildSerialDescriptor, descriptor.getSerialName(), descriptor, null, false, 12, null);
        }
    }
}
