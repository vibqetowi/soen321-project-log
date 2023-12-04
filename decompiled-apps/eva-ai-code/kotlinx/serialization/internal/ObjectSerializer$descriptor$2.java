package kotlinx.serialization.internal;

import androidx.exifinterface.media.ExifInterface;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.descriptors.StructureKind;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ObjectSerializer.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lkotlinx/serialization/descriptors/SerialDescriptor;", ExifInterface.GPS_DIRECTION_TRUE, "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ObjectSerializer$descriptor$2 extends Lambda implements Function0<SerialDescriptor> {
    final /* synthetic */ String $serialName;
    final /* synthetic */ ObjectSerializer<T> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ObjectSerializer$descriptor$2(String str, ObjectSerializer<T> objectSerializer) {
        super(0);
        this.$serialName = str;
        this.this$0 = objectSerializer;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ObjectSerializer.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "", "Lkotlinx/serialization/descriptors/ClassSerialDescriptorBuilder;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* renamed from: kotlinx.serialization.internal.ObjectSerializer$descriptor$2$1  reason: invalid class name */
    /* loaded from: classes5.dex */
    public static final class AnonymousClass1 extends Lambda implements Function1<ClassSerialDescriptorBuilder, Unit> {
        final /* synthetic */ ObjectSerializer<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ObjectSerializer<T> objectSerializer) {
            super(1);
            this.this$0 = objectSerializer;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ClassSerialDescriptorBuilder classSerialDescriptorBuilder) {
            invoke2(classSerialDescriptorBuilder);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(ClassSerialDescriptorBuilder buildSerialDescriptor) {
            List<? extends Annotation> list;
            Intrinsics.checkNotNullParameter(buildSerialDescriptor, "$this$buildSerialDescriptor");
            list = ((ObjectSerializer) this.this$0)._annotations;
            buildSerialDescriptor.setAnnotations(list);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final SerialDescriptor invoke() {
        return SerialDescriptorsKt.buildSerialDescriptor(this.$serialName, StructureKind.OBJECT.INSTANCE, new SerialDescriptor[0], new AnonymousClass1(this.this$0));
    }
}
