package kotlinx.serialization.descriptors;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptorKt;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SerialDescriptors.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SerialDescriptorImpl$_hashCode$2 extends Lambda implements Function0<Integer> {
    final /* synthetic */ SerialDescriptorImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SerialDescriptorImpl$_hashCode$2(SerialDescriptorImpl serialDescriptorImpl) {
        super(0);
        this.this$0 = serialDescriptorImpl;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        SerialDescriptor[] serialDescriptorArr;
        SerialDescriptorImpl serialDescriptorImpl = this.this$0;
        SerialDescriptorImpl serialDescriptorImpl2 = serialDescriptorImpl;
        serialDescriptorArr = serialDescriptorImpl.typeParametersDescriptors;
        return Integer.valueOf(PluginGeneratedSerialDescriptorKt.hashCodeImpl(serialDescriptorImpl2, serialDescriptorArr));
    }
}
