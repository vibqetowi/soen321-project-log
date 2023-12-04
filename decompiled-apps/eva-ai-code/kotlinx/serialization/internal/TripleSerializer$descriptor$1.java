package kotlinx.serialization.internal;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Tuples.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u0004*\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "B", "C", "Lkotlinx/serialization/descriptors/ClassSerialDescriptorBuilder;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TripleSerializer$descriptor$1 extends Lambda implements Function1<ClassSerialDescriptorBuilder, Unit> {
    final /* synthetic */ TripleSerializer<A, B, C> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TripleSerializer$descriptor$1(TripleSerializer<A, B, C> tripleSerializer) {
        super(1);
        this.this$0 = tripleSerializer;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ClassSerialDescriptorBuilder classSerialDescriptorBuilder) {
        invoke2(classSerialDescriptorBuilder);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(ClassSerialDescriptorBuilder buildClassSerialDescriptor) {
        KSerializer kSerializer;
        KSerializer kSerializer2;
        KSerializer kSerializer3;
        Intrinsics.checkNotNullParameter(buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
        kSerializer = ((TripleSerializer) this.this$0).aSerializer;
        ClassSerialDescriptorBuilder.element$default(buildClassSerialDescriptor, "first", kSerializer.getDescriptor(), null, false, 12, null);
        kSerializer2 = ((TripleSerializer) this.this$0).bSerializer;
        ClassSerialDescriptorBuilder.element$default(buildClassSerialDescriptor, "second", kSerializer2.getDescriptor(), null, false, 12, null);
        kSerializer3 = ((TripleSerializer) this.this$0).cSerializer;
        ClassSerialDescriptorBuilder.element$default(buildClassSerialDescriptor, "third", kSerializer3.getDescriptor(), null, false, 12, null);
    }
}
