package kotlinx.serialization.descriptors;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
/* compiled from: SerialDescriptors.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
final class SerialDescriptorImpl$toString$1 extends Lambda implements Function1<Integer, CharSequence> {
    final /* synthetic */ SerialDescriptorImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SerialDescriptorImpl$toString$1(SerialDescriptorImpl serialDescriptorImpl) {
        super(1);
        this.this$0 = serialDescriptorImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ CharSequence invoke(Integer num) {
        return invoke(num.intValue());
    }

    public final CharSequence invoke(int i) {
        return this.this$0.getElementName(i) + ": " + this.this$0.getElementDescriptor(i).getSerialName();
    }
}
