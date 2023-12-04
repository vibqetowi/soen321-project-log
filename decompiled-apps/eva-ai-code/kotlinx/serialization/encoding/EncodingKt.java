package kotlinx.serialization.encoding;

import androidx.exifinterface.media.ExifInterface;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
/* compiled from: Encoding.kt */
@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a;\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0019\b\u0004\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\b\nH\u0086\bø\u0001\u0000\u001ab\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u000b*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u000b0\r24\b\u0004\u0010\u0007\u001a.\u0012\u0004\u0012\u00020\t\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u0002H\u000b\u0012\u0004\u0012\u00020\u00010\u000e¢\u0006\u0002\b\nH\u0086\bø\u0001\u0000\u001a3\u0010\u0012\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0019\b\u0004\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\b\nH\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0013"}, d2 = {"encodeCollection", "", "Lkotlinx/serialization/encoding/Encoder;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "collectionSize", "", "block", "Lkotlin/Function1;", "Lkotlinx/serialization/encoding/CompositeEncoder;", "Lkotlin/ExtensionFunctionType;", ExifInterface.LONGITUDE_EAST, "collection", "", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", FirebaseAnalytics.Param.INDEX, "encodeStructure", "kotlinx-serialization-core"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class EncodingKt {
    public static final void encodeStructure(Encoder encoder, SerialDescriptor descriptor, Function1<? super CompositeEncoder, Unit> block) {
        Intrinsics.checkNotNullParameter(encoder, "<this>");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(block, "block");
        CompositeEncoder beginStructure = encoder.beginStructure(descriptor);
        block.invoke(beginStructure);
        beginStructure.endStructure(descriptor);
    }

    public static final void encodeCollection(Encoder encoder, SerialDescriptor descriptor, int i, Function1<? super CompositeEncoder, Unit> block) {
        Intrinsics.checkNotNullParameter(encoder, "<this>");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(block, "block");
        CompositeEncoder beginCollection = encoder.beginCollection(descriptor, i);
        block.invoke(beginCollection);
        beginCollection.endStructure(descriptor);
    }

    public static final <E> void encodeCollection(Encoder encoder, SerialDescriptor descriptor, Collection<? extends E> collection, Function3<? super CompositeEncoder, ? super Integer, ? super E, Unit> block) {
        Intrinsics.checkNotNullParameter(encoder, "<this>");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(collection, "collection");
        Intrinsics.checkNotNullParameter(block, "block");
        CompositeEncoder beginCollection = encoder.beginCollection(descriptor, collection.size());
        Iterator<T> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object obj = (Object) it.next();
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            block.invoke(beginCollection, Integer.valueOf(i), obj);
            i = i2;
        }
        beginCollection.endStructure(descriptor);
    }
}
