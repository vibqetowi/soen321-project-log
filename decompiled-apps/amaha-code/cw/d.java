package cw;

import java.io.File;
import java.io.FilenameFilter;
/* compiled from: ReLinkerInstance.java */
/* loaded from: classes2.dex */
public final class d implements FilenameFilter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f12121a;

    public d(String str) {
        this.f12121a = str;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return str.startsWith(this.f12121a);
    }
}
