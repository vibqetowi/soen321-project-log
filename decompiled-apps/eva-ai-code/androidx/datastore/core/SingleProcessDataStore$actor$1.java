package androidx.datastore.core;

import androidx.exifinterface.media.ExifInterface;
import java.io.File;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.flow.MutableStateFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SingleProcessDataStore.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public final class SingleProcessDataStore$actor$1 extends Lambda implements Function1<Throwable, Unit> {
    final /* synthetic */ SingleProcessDataStore<T> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleProcessDataStore$actor$1(SingleProcessDataStore<T> singleProcessDataStore) {
        super(1);
        this.this$0 = singleProcessDataStore;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        invoke2(th);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th) {
        File file;
        MutableStateFlow mutableStateFlow;
        if (th != null) {
            mutableStateFlow = ((SingleProcessDataStore) this.this$0).downstreamFlow;
            mutableStateFlow.setValue(new Final(th));
        }
        Object activeFilesLock$datastore_core = SingleProcessDataStore.Companion.getActiveFilesLock$datastore_core();
        SingleProcessDataStore<T> singleProcessDataStore = this.this$0;
        synchronized (activeFilesLock$datastore_core) {
            Set<String> activeFiles$datastore_core = SingleProcessDataStore.Companion.getActiveFiles$datastore_core();
            file = singleProcessDataStore.getFile();
            activeFiles$datastore_core.remove(file.getAbsolutePath());
            Unit unit = Unit.INSTANCE;
        }
    }
}
