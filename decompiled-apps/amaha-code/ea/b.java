package ea;

import android.os.Looper;
import android.util.Log;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static volatile ClassLoader f13928a;

    /* renamed from: b  reason: collision with root package name */
    public static volatile Thread f13929b;

    public static synchronized ClassLoader a() {
        ClassLoader classLoader;
        synchronized (b.class) {
            if (f13928a == null) {
                f13928a = b();
            }
            classLoader = f13928a;
        }
        return classLoader;
    }

    public static synchronized ClassLoader b() {
        synchronized (b.class) {
            ClassLoader classLoader = null;
            if (f13929b == null) {
                f13929b = c();
                if (f13929b == null) {
                    return null;
                }
            }
            synchronized (f13929b) {
                try {
                    classLoader = f13929b.getContextClassLoader();
                } catch (SecurityException e10) {
                    String message = e10.getMessage();
                    Log.w("DynamiteLoaderV2CL", "Failed to get thread context classloader " + message);
                }
            }
            return classLoader;
        }
    }

    public static synchronized Thread c() {
        SecurityException e10;
        a aVar;
        a aVar2;
        ThreadGroup threadGroup;
        synchronized (b.class) {
            ThreadGroup threadGroup2 = Looper.getMainLooper().getThread().getThreadGroup();
            if (threadGroup2 == null) {
                return null;
            }
            synchronized (Void.class) {
                try {
                    int activeGroupCount = threadGroup2.activeGroupCount();
                    ThreadGroup[] threadGroupArr = new ThreadGroup[activeGroupCount];
                    threadGroup2.enumerate(threadGroupArr);
                    int i6 = 0;
                    int i10 = 0;
                    while (true) {
                        if (i10 < activeGroupCount) {
                            threadGroup = threadGroupArr[i10];
                            if ("dynamiteLoader".equals(threadGroup.getName())) {
                                break;
                            }
                            i10++;
                        } else {
                            threadGroup = null;
                            break;
                        }
                    }
                    if (threadGroup == null) {
                        threadGroup = new ThreadGroup(threadGroup2, "dynamiteLoader");
                    }
                    int activeCount = threadGroup.activeCount();
                    Thread[] threadArr = new Thread[activeCount];
                    threadGroup.enumerate(threadArr);
                    while (true) {
                        if (i6 < activeCount) {
                            aVar2 = threadArr[i6];
                            if ("GmsDynamite".equals(aVar2.getName())) {
                                break;
                            }
                            i6++;
                        } else {
                            aVar2 = null;
                            break;
                        }
                    }
                } catch (SecurityException e11) {
                    e10 = e11;
                    aVar = null;
                }
                if (aVar2 == null) {
                    try {
                        aVar = new a(threadGroup);
                        try {
                            aVar.setContextClassLoader(null);
                            aVar.start();
                        } catch (SecurityException e12) {
                            e10 = e12;
                            Log.w("DynamiteLoaderV2CL", "Failed to enumerate thread/threadgroup " + e10.getMessage());
                            aVar2 = aVar;
                            return aVar2;
                        }
                    } catch (SecurityException e13) {
                        e10 = e13;
                        aVar = aVar2;
                    }
                    aVar2 = aVar;
                }
            }
            return aVar2;
        }
    }
}
