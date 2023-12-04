package androidx.datastore.preferences.core;

import java.io.File;
import kotlin.Metadata;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PreferenceDataStoreFactory.kt */
@Metadata(d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Ljava/io/File;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public final class PreferenceDataStoreFactory$create$delegate$1 extends Lambda implements Function0<File> {
    final /* synthetic */ Function0<File> $produceFile;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PreferenceDataStoreFactory$create$delegate$1(Function0<? extends File> function0) {
        super(0);
        this.$produceFile = function0;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final File invoke() {
        File invoke = this.$produceFile.invoke();
        if (Intrinsics.areEqual(FilesKt.getExtension(invoke), PreferencesSerializer.INSTANCE.getFileExtension())) {
            return invoke;
        }
        throw new IllegalStateException(("File extension for file: " + invoke + " does not match required extension for Preferences file: " + PreferencesSerializer.INSTANCE.getFileExtension()).toString());
    }
}
