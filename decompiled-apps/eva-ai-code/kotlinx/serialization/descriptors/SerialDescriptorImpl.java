package kotlinx.serialization.descriptors;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.CachedNames;
import kotlinx.serialization.internal.Platform_commonKt;
/* compiled from: SerialDescriptors.kt */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u001b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010\u0018\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B3\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/H\u0096\u0002J\u0016\u00100\u001a\b\u0012\u0004\u0012\u00020\u00140\n2\u0006\u00101\u001a\u00020\bH\u0016J\u0010\u00102\u001a\u00020\u00012\u0006\u00101\u001a\u00020\bH\u0016J\u0010\u00103\u001a\u00020\b2\u0006\u00104\u001a\u00020\u0004H\u0016J\u0010\u00105\u001a\u00020\u00042\u0006\u00101\u001a\u00020\bH\u0016J\b\u00106\u001a\u00020\bH\u0016J\u0010\u00107\u001a\u00020-2\u0006\u00101\u001a\u00020\bH\u0016J\b\u00108\u001a\u00020\u0004H\u0016R\u001b\u0010\u000e\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\n0\u0018X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0019R\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00010\u0018X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001bR\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u0018X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001dR\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u001a\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0$X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00040(X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0016\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00010\u0018X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001b¨\u00069"}, d2 = {"Lkotlinx/serialization/descriptors/SerialDescriptorImpl;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Lkotlinx/serialization/internal/CachedNames;", "serialName", "", "kind", "Lkotlinx/serialization/descriptors/SerialKind;", "elementsCount", "", "typeParameters", "", "builder", "Lkotlinx/serialization/descriptors/ClassSerialDescriptorBuilder;", "(Ljava/lang/String;Lkotlinx/serialization/descriptors/SerialKind;ILjava/util/List;Lkotlinx/serialization/descriptors/ClassSerialDescriptorBuilder;)V", "_hashCode", "get_hashCode", "()I", "_hashCode$delegate", "Lkotlin/Lazy;", "annotations", "", "getAnnotations", "()Ljava/util/List;", "elementAnnotations", "", "[Ljava/util/List;", "elementDescriptors", "[Lkotlinx/serialization/descriptors/SerialDescriptor;", "elementNames", "[Ljava/lang/String;", "elementOptionality", "", "getElementsCount", "getKind", "()Lkotlinx/serialization/descriptors/SerialKind;", "name2Index", "", "getSerialName", "()Ljava/lang/String;", "serialNames", "", "getSerialNames", "()Ljava/util/Set;", "typeParametersDescriptors", "equals", "", "other", "", "getElementAnnotations", FirebaseAnalytics.Param.INDEX, "getElementDescriptor", "getElementIndex", "name", "getElementName", "hashCode", "isElementOptional", "toString", "kotlinx-serialization-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SerialDescriptorImpl implements SerialDescriptor, CachedNames {
    private final Lazy _hashCode$delegate;
    private final List<Annotation> annotations;
    private final List<Annotation>[] elementAnnotations;
    private final SerialDescriptor[] elementDescriptors;
    private final String[] elementNames;
    private final boolean[] elementOptionality;
    private final int elementsCount;
    private final SerialKind kind;
    private final Map<String, Integer> name2Index;
    private final String serialName;
    private final Set<String> serialNames;
    private final SerialDescriptor[] typeParametersDescriptors;

    public SerialDescriptorImpl(String serialName, SerialKind kind, int i, List<? extends SerialDescriptor> typeParameters, ClassSerialDescriptorBuilder builder) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(typeParameters, "typeParameters");
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.serialName = serialName;
        this.kind = kind;
        this.elementsCount = i;
        this.annotations = builder.getAnnotations();
        this.serialNames = CollectionsKt.toHashSet(builder.getElementNames$kotlinx_serialization_core());
        Object[] array = builder.getElementNames$kotlinx_serialization_core().toArray(new String[0]);
        if (array != null) {
            String[] strArr = (String[]) array;
            this.elementNames = strArr;
            this.elementDescriptors = Platform_commonKt.compactArray(builder.getElementDescriptors$kotlinx_serialization_core());
            Object[] array2 = builder.getElementAnnotations$kotlinx_serialization_core().toArray(new List[0]);
            if (array2 != null) {
                this.elementAnnotations = (List[]) array2;
                this.elementOptionality = CollectionsKt.toBooleanArray(builder.getElementOptionality$kotlinx_serialization_core());
                Iterable<IndexedValue> withIndex = ArraysKt.withIndex(strArr);
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(withIndex, 10));
                for (IndexedValue indexedValue : withIndex) {
                    arrayList.add(TuplesKt.to(indexedValue.getValue(), Integer.valueOf(indexedValue.getIndex())));
                }
                this.name2Index = MapsKt.toMap(arrayList);
                this.typeParametersDescriptors = Platform_commonKt.compactArray(typeParameters);
                this._hashCode$delegate = LazyKt.lazy(new SerialDescriptorImpl$_hashCode$2(this));
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean isInline() {
        return SerialDescriptor.DefaultImpls.isInline(this);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean isNullable() {
        return SerialDescriptor.DefaultImpls.isNullable(this);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public String getSerialName() {
        return this.serialName;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public SerialKind getKind() {
        return this.kind;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public int getElementsCount() {
        return this.elementsCount;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public List<Annotation> getAnnotations() {
        return this.annotations;
    }

    @Override // kotlinx.serialization.internal.CachedNames
    public Set<String> getSerialNames() {
        return this.serialNames;
    }

    private final int get_hashCode() {
        return ((Number) this._hashCode$delegate.getValue()).intValue();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public String getElementName(int i) {
        return this.elementNames[i];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public int getElementIndex(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Integer num = this.name2Index.get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public List<Annotation> getElementAnnotations(int i) {
        return this.elementAnnotations[i];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public SerialDescriptor getElementDescriptor(int i) {
        return this.elementDescriptors[i];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean isElementOptional(int i) {
        return this.elementOptionality[i];
    }

    public boolean equals(Object obj) {
        int i;
        SerialDescriptorImpl serialDescriptorImpl = this;
        if (serialDescriptorImpl == obj) {
            return true;
        }
        if (obj instanceof SerialDescriptorImpl) {
            SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
            if (Intrinsics.areEqual(serialDescriptorImpl.getSerialName(), serialDescriptor.getSerialName()) && Arrays.equals(this.typeParametersDescriptors, ((SerialDescriptorImpl) obj).typeParametersDescriptors) && serialDescriptorImpl.getElementsCount() == serialDescriptor.getElementsCount()) {
                int elementsCount = serialDescriptorImpl.getElementsCount();
                for (i = 0; i < elementsCount; i = i + 1) {
                    i = (Intrinsics.areEqual(serialDescriptorImpl.getElementDescriptor(i).getSerialName(), serialDescriptor.getElementDescriptor(i).getSerialName()) && Intrinsics.areEqual(serialDescriptorImpl.getElementDescriptor(i).getKind(), serialDescriptor.getElementDescriptor(i).getKind())) ? i + 1 : 0;
                }
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return get_hashCode();
    }

    public String toString() {
        return CollectionsKt.joinToString$default(RangesKt.until(0, getElementsCount()), ", ", getSerialName() + '(', ")", 0, null, new SerialDescriptorImpl$toString$1(this), 24, null);
    }
}
