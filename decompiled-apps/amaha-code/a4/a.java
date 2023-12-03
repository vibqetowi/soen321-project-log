package a4;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
/* compiled from: FileIdentityStorage.kt */
/* loaded from: classes.dex */
public final class a implements i {

    /* renamed from: a  reason: collision with root package name */
    public final b4.b f284a;

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0070, code lost:
        if (r0 == false) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a(d dVar) {
        String property;
        boolean b10;
        String property2;
        String str = dVar.f289a;
        File file = dVar.f293e;
        file = file == null ? new File(kotlin.jvm.internal.i.n(str, "/tmp/amplitude-identity/")) : file;
        kc.f.v(file);
        b4.b bVar = new b4.b(file, str);
        this.f284a = bVar;
        File file2 = bVar.f3944b;
        boolean exists = file2.exists();
        Properties properties = bVar.f3943a;
        if (exists) {
            FileInputStream fileInputStream = new FileInputStream(file2);
            try {
                properties.load(fileInputStream);
                hs.k kVar = hs.k.f19476a;
                ca.a.z(fileInputStream, null);
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    ca.a.z(fileInputStream, th2);
                    throw th3;
                }
            }
        } else {
            file2.getParentFile().mkdirs();
            file2.createNewFile();
        }
        boolean z10 = true;
        String str2 = dVar.f290b;
        if (str2 == null || (property = properties.getProperty("api_key", null)) == null) {
            b10 = true;
        } else {
            b10 = kotlin.jvm.internal.i.b(property, str2);
        }
        String str3 = dVar.f291c;
        if (b10) {
            if (str3 != null && (property2 = properties.getProperty("experiment_api_key", null)) != null) {
                z10 = kotlin.jvm.internal.i.b(property2, str3);
            }
        }
        for (String str4 : ca.a.P0("user_id", "device_id", "api_key", "experiment_api_key")) {
            properties.remove(str4);
        }
        bVar.c();
        if (str2 != null) {
            properties.setProperty("api_key", str2);
            bVar.c();
        }
        if (str3 != null) {
            properties.setProperty("experiment_api_key", str3);
            bVar.c();
        }
    }

    @Override // a4.i
    public final c a() {
        b4.b bVar = this.f284a;
        return new c(bVar.f3943a.getProperty("user_id", null), bVar.f3943a.getProperty("device_id", null));
    }

    @Override // a4.i
    public final void b(String str) {
        if (str == null) {
            str = "";
        }
        b4.b bVar = this.f284a;
        bVar.f3943a.setProperty("device_id", str);
        bVar.c();
    }

    @Override // a4.i
    public final void c(String str) {
        if (str == null) {
            str = "";
        }
        b4.b bVar = this.f284a;
        bVar.f3943a.setProperty("user_id", str);
        bVar.c();
    }
}
