package vr;

import java.util.concurrent.TimeUnit;
/* compiled from: TimeProvider.java */
/* loaded from: classes2.dex */
public interface j3 {

    /* renamed from: a  reason: collision with root package name */
    public static final a f35738a = new a();

    /* compiled from: TimeProvider.java */
    /* loaded from: classes2.dex */
    public class a implements j3 {
        @Override // vr.j3
        public final long a() {
            return TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
        }
    }

    long a();
}
