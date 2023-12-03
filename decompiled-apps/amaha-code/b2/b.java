package b2;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.io.Closeable;
/* compiled from: SupportSQLiteDatabase.kt */
/* loaded from: classes.dex */
public interface b extends Closeable {
    Cursor A(e eVar);

    void Q();

    Cursor X(e eVar, CancellationSignal cancellationSignal);

    void beginTransaction();

    void endTransaction();

    boolean isOpen();

    boolean n0();

    void q(String str);

    boolean s0();

    void setTransactionSuccessful();

    f w(String str);
}
