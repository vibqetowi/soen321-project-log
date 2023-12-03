package vf;

import java.util.Date;
/* compiled from: DefaultDateTypeAdapter.java */
/* loaded from: classes.dex */
public abstract class d<T extends Date> {

    /* compiled from: DefaultDateTypeAdapter.java */
    /* loaded from: classes.dex */
    public class a extends d<Date> {
        public a() {
            super(Date.class);
        }
    }

    static {
        new a();
    }

    public d(Class<T> cls) {
    }
}
