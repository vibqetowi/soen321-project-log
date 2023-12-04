package kotlinx.serialization.json.internal;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.serialization.descriptors.SerialDescriptor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: JsonNamesMap.kt */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
public /* synthetic */ class JsonNamesMapKt$getJsonNameIndex$alternativeNamesMap$1 extends FunctionReferenceImpl implements Function0<Map<String, ? extends Integer>> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public JsonNamesMapKt$getJsonNameIndex$alternativeNamesMap$1(Object obj) {
        super(0, obj, JsonNamesMapKt.class, "buildAlternativeNamesMap", "buildAlternativeNamesMap(Lkotlinx/serialization/descriptors/SerialDescriptor;)Ljava/util/Map;", 1);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Map<String, ? extends Integer> invoke() {
        return JsonNamesMapKt.buildAlternativeNamesMap((SerialDescriptor) this.receiver);
    }
}
