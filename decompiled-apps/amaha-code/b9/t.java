package b9;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;
/* compiled from: StatsDataSource.java */
/* loaded from: classes.dex */
public final class t implements f {

    /* renamed from: a  reason: collision with root package name */
    public final f f4212a;

    /* renamed from: b  reason: collision with root package name */
    public long f4213b;

    /* renamed from: c  reason: collision with root package name */
    public Uri f4214c;

    /* renamed from: d  reason: collision with root package name */
    public Map<String, List<String>> f4215d;

    public t(f fVar) {
        fVar.getClass();
        this.f4212a = fVar;
        this.f4214c = Uri.EMPTY;
        this.f4215d = Collections.emptyMap();
    }

    @Override // b9.f
    public final void c(u uVar) {
        uVar.getClass();
        this.f4212a.c(uVar);
    }

    @Override // b9.f
    public final void close() {
        this.f4212a.close();
    }

    @Override // b9.f
    public final Uri getUri() {
        return this.f4212a.getUri();
    }

    @Override // b9.f
    public final long h(h hVar) {
        this.f4214c = hVar.f4128a;
        this.f4215d = Collections.emptyMap();
        long h10 = this.f4212a.h(hVar);
        Uri uri = getUri();
        uri.getClass();
        this.f4214c = uri;
        this.f4215d = j();
        return h10;
    }

    @Override // b9.f
    public final Map<String, List<String>> j() {
        return this.f4212a.j();
    }

    @Override // b9.d
    public final int read(byte[] bArr, int i6, int i10) {
        int read = this.f4212a.read(bArr, i6, i10);
        if (read != -1) {
            this.f4213b += read;
        }
        return read;
    }
}
