package com.android.volley.toolbox;

import android.content.Context;
import com.android.volley.toolbox.d;
import java.io.File;
/* compiled from: Volley.java */
/* loaded from: classes.dex */
public final class m implements d.c {

    /* renamed from: a  reason: collision with root package name */
    public File f5900a = null;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f5901b;

    public m(Context context) {
        this.f5901b = context;
    }

    public final File a() {
        if (this.f5900a == null) {
            this.f5900a = new File(this.f5901b.getCacheDir(), "volley");
        }
        return this.f5900a;
    }
}
