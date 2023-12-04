package kotlinx.serialization.internal;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.descriptors.StructureKind;
import org.apache.commons.lang3.ClassUtils;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Enums.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003*\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "", "Lkotlinx/serialization/descriptors/ClassSerialDescriptorBuilder;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class EnumSerializer$descriptor$1 extends Lambda implements Function1<ClassSerialDescriptorBuilder, Unit> {
    final /* synthetic */ String $serialName;
    final /* synthetic */ EnumSerializer<T> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnumSerializer$descriptor$1(EnumSerializer<T> enumSerializer, String str) {
        super(1);
        this.this$0 = enumSerializer;
        this.$serialName = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ClassSerialDescriptorBuilder classSerialDescriptorBuilder) {
        invoke2(classSerialDescriptorBuilder);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(ClassSerialDescriptorBuilder buildSerialDescriptor) {
        Enum[] enumArr;
        Intrinsics.checkNotNullParameter(buildSerialDescriptor, "$this$buildSerialDescriptor");
        enumArr = ((EnumSerializer) this.this$0).values;
        String str = this.$serialName;
        for (Enum r2 : enumArr) {
            ClassSerialDescriptorBuilder.element$default(buildSerialDescriptor, r2.name(), SerialDescriptorsKt.buildSerialDescriptor$default(str + ClassUtils.PACKAGE_SEPARATOR_CHAR + r2.name(), StructureKind.OBJECT.INSTANCE, new SerialDescriptor[0], null, 8, null), null, false, 12, null);
        }
    }
}
