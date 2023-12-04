package androidx.datastore;

import android.content.Context;
import androidx.datastore.core.DataMigration;
import androidx.exifinterface.media.ExifInterface;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: DataStoreDelegate.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Landroid/content/Context;", "it", "", "Landroidx/datastore/core/DataMigration;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes3.dex */
final class DataStoreDelegateKt$dataStore$1 extends Lambda implements Function1<Context, List<? extends DataMigration<T>>> {
    public static final DataStoreDelegateKt$dataStore$1 INSTANCE = new DataStoreDelegateKt$dataStore$1();

    DataStoreDelegateKt$dataStore$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final List<DataMigration<T>> invoke(Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return CollectionsKt.emptyList();
    }
}
