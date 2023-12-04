package androidx.datastore.core;

import androidx.exifinterface.media.ExifInterface;
import java.io.File;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SingleProcessDataStore.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Ljava/io/File;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public final class SingleProcessDataStore$file$2 extends Lambda implements Function0<File> {
    final /* synthetic */ SingleProcessDataStore<T> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleProcessDataStore$file$2(SingleProcessDataStore<T> singleProcessDataStore) {
        super(0);
        this.this$0 = singleProcessDataStore;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final File invoke() {
        Function0 function0;
        function0 = ((SingleProcessDataStore) this.this$0).produceFile;
        File file = (File) function0.invoke();
        String it = file.getAbsolutePath();
        synchronized (SingleProcessDataStore.Companion.getActiveFilesLock$datastore_core()) {
            if (!(!SingleProcessDataStore.Companion.getActiveFiles$datastore_core().contains(it))) {
                throw new IllegalStateException(("There are multiple DataStores active for the same file: " + file + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
            }
            Set<String> activeFiles$datastore_core = SingleProcessDataStore.Companion.getActiveFiles$datastore_core();
            Intrinsics.checkNotNullExpressionValue(it, "it");
            activeFiles$datastore_core.add(it);
        }
        return file;
    }
}
