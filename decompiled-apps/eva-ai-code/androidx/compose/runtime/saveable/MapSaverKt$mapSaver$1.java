package androidx.compose.runtime.saveable;

import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: MapSaver.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001\"\u0004\b\u0000\u0010\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u0002H\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/runtime/saveable/SaverScope;", "it", "invoke", "(Landroidx/compose/runtime/saveable/SaverScope;Ljava/lang/Object;)Ljava/util/List;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
final class MapSaverKt$mapSaver$1 extends Lambda implements Function2<SaverScope, T, List<? extends Object>> {
    final /* synthetic */ Function2<SaverScope, T, Map<String, Object>> $save;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MapSaverKt$mapSaver$1(Function2<? super SaverScope, ? super T, ? extends Map<String, ? extends Object>> function2) {
        super(2);
        this.$save = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ List<? extends Object> invoke(SaverScope saverScope, Object obj) {
        return invoke2(saverScope, (SaverScope) obj);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final List<Object> invoke2(SaverScope listSaver, T t) {
        Intrinsics.checkNotNullParameter(listSaver, "$this$listSaver");
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, Object> entry : this.$save.invoke(listSaver, t).entrySet()) {
            arrayList.add(entry.getKey());
            arrayList.add(entry.getValue());
        }
        return arrayList;
    }
}
