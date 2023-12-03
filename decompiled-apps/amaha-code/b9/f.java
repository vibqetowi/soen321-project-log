package b9;

import android.net.Uri;
import java.util.List;
import java.util.Map;
/* compiled from: DataSource.java */
/* loaded from: classes.dex */
public interface f extends d {

    /* compiled from: DataSource.java */
    /* loaded from: classes.dex */
    public interface a {
        f a();
    }

    void c(u uVar);

    void close();

    Uri getUri();

    long h(h hVar);

    Map<String, List<String>> j();
}
