package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.KSerializer;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PluginGeneratedSerialDescriptor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/serialization/KSerializer;", "invoke", "()[Lkotlinx/serialization/KSerializer;"}, k = 3, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PluginGeneratedSerialDescriptor$childSerializers$2 extends Lambda implements Function0<KSerializer<?>[]> {
    final /* synthetic */ PluginGeneratedSerialDescriptor this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PluginGeneratedSerialDescriptor$childSerializers$2(PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor) {
        super(0);
        this.this$0 = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlin.jvm.functions.Function0
    public final KSerializer<?>[] invoke() {
        GeneratedSerializer generatedSerializer;
        KSerializer<?>[] childSerializers;
        generatedSerializer = this.this$0.generatedSerializer;
        return (generatedSerializer == null || (childSerializers = generatedSerializer.childSerializers()) == null) ? PluginHelperInterfacesKt.EMPTY_SERIALIZER_ARRAY : childSerializers;
    }
}
