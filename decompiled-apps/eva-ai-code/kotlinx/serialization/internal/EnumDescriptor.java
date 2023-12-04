package kotlinx.serialization.internal;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorKt;
import kotlinx.serialization.descriptors.SerialKind;
/* compiled from: Enums.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\u0010\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0005H\u0016J\b\u0010\u0018\u001a\u00020\u0005H\u0016J\b\u0010\u0019\u001a\u00020\u0003H\u0016R!\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001a"}, d2 = {"Lkotlinx/serialization/internal/EnumDescriptor;", "Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;", "name", "", "elementsCount", "", "(Ljava/lang/String;I)V", "elementDescriptors", "", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getElementDescriptors", "()[Lkotlinx/serialization/descriptors/SerialDescriptor;", "elementDescriptors$delegate", "Lkotlin/Lazy;", "kind", "Lkotlinx/serialization/descriptors/SerialKind;", "getKind", "()Lkotlinx/serialization/descriptors/SerialKind;", "equals", "", "other", "", "getElementDescriptor", FirebaseAnalytics.Param.INDEX, "hashCode", "toString", "kotlinx-serialization-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class EnumDescriptor extends PluginGeneratedSerialDescriptor {
    private final Lazy elementDescriptors$delegate;
    private final SerialKind kind;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnumDescriptor(String name, int i) {
        super(name, null, i, 2, null);
        Intrinsics.checkNotNullParameter(name, "name");
        this.kind = SerialKind.ENUM.INSTANCE;
        this.elementDescriptors$delegate = LazyKt.lazy(new EnumDescriptor$elementDescriptors$2(i, name, this));
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor, kotlinx.serialization.descriptors.SerialDescriptor
    public SerialKind getKind() {
        return this.kind;
    }

    private final SerialDescriptor[] getElementDescriptors() {
        return (SerialDescriptor[]) this.elementDescriptors$delegate.getValue();
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor, kotlinx.serialization.descriptors.SerialDescriptor
    public SerialDescriptor getElementDescriptor(int i) {
        return getElementDescriptors()[i];
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof SerialDescriptor)) {
            SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
            return serialDescriptor.getKind() == SerialKind.ENUM.INSTANCE && Intrinsics.areEqual(getSerialName(), serialDescriptor.getSerialName()) && Intrinsics.areEqual(Platform_commonKt.cachedSerialNames(this), Platform_commonKt.cachedSerialNames(serialDescriptor));
        }
        return false;
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
    public String toString() {
        return CollectionsKt.joinToString$default(SerialDescriptorKt.getElementNames(this), ", ", getSerialName() + '(', ")", 0, null, null, 56, null);
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
    public int hashCode() {
        int hashCode = getSerialName().hashCode();
        Iterator<String> it = SerialDescriptorKt.getElementNames(this).iterator();
        int i = 1;
        while (it.hasNext()) {
            int i2 = i * 31;
            String next = it.next();
            i = i2 + (next != null ? next.hashCode() : 0);
        }
        return (hashCode * 31) + i;
    }
}
