package b4;

import gv.m;
import hs.k;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Properties;
import kotlin.jvm.internal.i;
/* compiled from: PropertiesFile.kt */
/* loaded from: classes.dex */
public final class b implements a {

    /* renamed from: a  reason: collision with root package name */
    public final Properties f3943a;

    /* renamed from: b  reason: collision with root package name */
    public final File f3944b;

    public b(File file, String key) {
        i.g(key, "key");
        this.f3943a = new Properties();
        this.f3944b = new File(file, defpackage.b.m("amplitude-identity-", key, ".properties"));
    }

    @Override // b4.a
    public final long a(String key) {
        i.g(key, "key");
        String property = this.f3943a.getProperty(key, "");
        i.f(property, "underlyingProperties.getProperty(key, \"\")");
        Long x02 = m.x0(property);
        if (x02 == null) {
            return 0L;
        }
        return x02.longValue();
    }

    @Override // b4.a
    public final boolean b(long j10, String key) {
        i.g(key, "key");
        this.f3943a.setProperty(key, String.valueOf(j10));
        c();
        return true;
    }

    public final void c() {
        FileOutputStream fileOutputStream = new FileOutputStream(this.f3944b);
        try {
            this.f3943a.store(fileOutputStream, (String) null);
            k kVar = k.f19476a;
            ca.a.z(fileOutputStream, null);
        } finally {
        }
    }
}
