package kotlinx.serialization.internal;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PluginGeneratedSerialDescriptor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "invoke", "()[Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 3, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PluginGeneratedSerialDescriptor$typeParameterDescriptors$2 extends Lambda implements Function0<SerialDescriptor[]> {
    final /* synthetic */ PluginGeneratedSerialDescriptor this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PluginGeneratedSerialDescriptor$typeParameterDescriptors$2(PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor) {
        super(0);
        this.this$0 = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlin.jvm.functions.Function0
    public final SerialDescriptor[] invoke() {
        GeneratedSerializer generatedSerializer;
        ArrayList arrayList;
        KSerializer<?>[] typeParametersSerializers;
        generatedSerializer = this.this$0.generatedSerializer;
        if (generatedSerializer == null || (typeParametersSerializers = generatedSerializer.typeParametersSerializers()) == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(typeParametersSerializers.length);
            for (KSerializer<?> kSerializer : typeParametersSerializers) {
                arrayList2.add(kSerializer.getDescriptor());
            }
            arrayList = arrayList2;
        }
        return Platform_commonKt.compactArray(arrayList);
    }
}
