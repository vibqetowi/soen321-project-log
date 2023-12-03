package tv;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Logger;
import kotlin.jvm.internal.i;
import zv.a0;
import zv.o;
import zv.p;
import zv.r;
/* compiled from: FileSystem.kt */
/* loaded from: classes2.dex */
public final class a implements b {
    @Override // tv.b
    public final o a(File file) {
        i.g(file, "file");
        Logger logger = p.f39906a;
        return new o(new FileInputStream(file), a0.f39875d);
    }

    @Override // tv.b
    public final r b(File file) {
        i.g(file, "file");
        try {
            Logger logger = p.f39906a;
            return new r(new FileOutputStream(file, false), new a0());
        } catch (FileNotFoundException unused) {
            file.getParentFile().mkdirs();
            Logger logger2 = p.f39906a;
            return new r(new FileOutputStream(file, false), new a0());
        }
    }

    @Override // tv.b
    public final void c(File directory) {
        i.g(directory, "directory");
        File[] listFiles = directory.listFiles();
        if (listFiles != null) {
            int length = listFiles.length;
            int i6 = 0;
            while (i6 < length) {
                File file = listFiles[i6];
                i6++;
                if (file.isDirectory()) {
                    c(file);
                }
                if (!file.delete()) {
                    throw new IOException(i.n(file, "failed to delete "));
                }
            }
            return;
        }
        throw new IOException(i.n(directory, "not a readable directory: "));
    }

    @Override // tv.b
    public final boolean d(File file) {
        i.g(file, "file");
        return file.exists();
    }

    @Override // tv.b
    public final void e(File from, File to2) {
        i.g(from, "from");
        i.g(to2, "to");
        f(to2);
        if (from.renameTo(to2)) {
            return;
        }
        throw new IOException("failed to rename " + from + " to " + to2);
    }

    @Override // tv.b
    public final void f(File file) {
        i.g(file, "file");
        if (!file.delete() && file.exists()) {
            throw new IOException(i.n(file, "failed to delete "));
        }
    }

    @Override // tv.b
    public final r g(File file) {
        i.g(file, "file");
        try {
            Logger logger = p.f39906a;
            return new r(new FileOutputStream(file, true), new a0());
        } catch (FileNotFoundException unused) {
            file.getParentFile().mkdirs();
            Logger logger2 = p.f39906a;
            return new r(new FileOutputStream(file, true), new a0());
        }
    }

    @Override // tv.b
    public final long h(File file) {
        i.g(file, "file");
        return file.length();
    }

    public final String toString() {
        return "FileSystem.SYSTEM";
    }
}
