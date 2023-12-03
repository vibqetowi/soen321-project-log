package n2;

import android.content.Context;
import java.io.File;
/* compiled from: WorkDatabasePathHelper.kt */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f25788a = new a();

    public final File a(Context context) {
        kotlin.jvm.internal.i.g(context, "context");
        File noBackupFilesDir = context.getNoBackupFilesDir();
        kotlin.jvm.internal.i.f(noBackupFilesDir, "context.noBackupFilesDir");
        return noBackupFilesDir;
    }
}
