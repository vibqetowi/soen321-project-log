package androidx.datastore;

import android.content.Context;
import androidx.exifinterface.media.ExifInterface;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DataStoreDelegate.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Ljava/io/File;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public final class DataStoreSingletonDelegate$getValue$1$1 extends Lambda implements Function0<File> {
    final /* synthetic */ Context $applicationContext;
    final /* synthetic */ DataStoreSingletonDelegate<T> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreSingletonDelegate$getValue$1$1(Context context, DataStoreSingletonDelegate<T> dataStoreSingletonDelegate) {
        super(0);
        this.$applicationContext = context;
        this.this$0 = dataStoreSingletonDelegate;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final File invoke() {
        String str;
        Context applicationContext = this.$applicationContext;
        Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
        str = ((DataStoreSingletonDelegate) this.this$0).fileName;
        return DataStoreFile.dataStoreFile(applicationContext, str);
    }
}
