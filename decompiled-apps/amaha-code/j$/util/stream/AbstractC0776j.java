package j$.util.stream;

import java.util.stream.Collector;
/* renamed from: j$.util.stream.j  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC0776j {
    public static /* synthetic */ EnumC0781k a(Collector.Characteristics characteristics) {
        if (characteristics == null) {
            return null;
        }
        return characteristics == Collector.Characteristics.CONCURRENT ? EnumC0781k.CONCURRENT : characteristics == Collector.Characteristics.UNORDERED ? EnumC0781k.UNORDERED : EnumC0781k.IDENTITY_FINISH;
    }

    public static /* synthetic */ Collector.Characteristics b(EnumC0781k enumC0781k) {
        if (enumC0781k == null) {
            return null;
        }
        return enumC0781k == EnumC0781k.CONCURRENT ? Collector.Characteristics.CONCURRENT : enumC0781k == EnumC0781k.UNORDERED ? Collector.Characteristics.UNORDERED : Collector.Characteristics.IDENTITY_FINISH;
    }
}
