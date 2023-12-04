package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.descriptors.StructureKind;
import org.apache.commons.lang3.ClassUtils;
/* compiled from: Enums.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "invoke", "()[Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 3, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
final class EnumDescriptor$elementDescriptors$2 extends Lambda implements Function0<SerialDescriptor[]> {
    final /* synthetic */ int $elementsCount;
    final /* synthetic */ String $name;
    final /* synthetic */ EnumDescriptor this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnumDescriptor$elementDescriptors$2(int i, String str, EnumDescriptor enumDescriptor) {
        super(0);
        this.$elementsCount = i;
        this.$name = str;
        this.this$0 = enumDescriptor;
    }

    @Override // kotlin.jvm.functions.Function0
    public final SerialDescriptor[] invoke() {
        int i = this.$elementsCount;
        SerialDescriptor[] serialDescriptorArr = new SerialDescriptor[i];
        for (int i2 = 0; i2 < i; i2++) {
            serialDescriptorArr[i2] = SerialDescriptorsKt.buildSerialDescriptor$default(this.$name + ClassUtils.PACKAGE_SEPARATOR_CHAR + this.this$0.getElementName(i2), StructureKind.OBJECT.INSTANCE, new SerialDescriptor[0], null, 8, null);
        }
        return serialDescriptorArr;
    }
}
