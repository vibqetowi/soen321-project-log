package i5;

import android.content.Context;
import android.util.Log;
import i5.a;
import i5.d;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import w5.e0;
/* compiled from: AppEventDiskStore.kt */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final String f19851a;

    /* compiled from: AppEventDiskStore.kt */
    /* loaded from: classes.dex */
    public static final class a extends ObjectInputStream {
        public a(BufferedInputStream bufferedInputStream) {
            super(bufferedInputStream);
        }

        @Override // java.io.ObjectInputStream
        public final ObjectStreamClass readClassDescriptor() {
            ObjectStreamClass resultClassDescriptor = super.readClassDescriptor();
            if (kotlin.jvm.internal.i.b(resultClassDescriptor.getName(), "com.facebook.appevents.AppEventsLogger$AccessTokenAppIdPair$SerializationProxyV1")) {
                resultClassDescriptor = ObjectStreamClass.lookup(a.C0299a.class);
            } else if (kotlin.jvm.internal.i.b(resultClassDescriptor.getName(), "com.facebook.appevents.AppEventsLogger$AppEvent$SerializationProxyV2")) {
                resultClassDescriptor = ObjectStreamClass.lookup(d.b.class);
            }
            kotlin.jvm.internal.i.f(resultClassDescriptor, "resultClassDescriptor");
            return resultClassDescriptor;
        }
    }

    static {
        new e();
        f19851a = e.class.getName();
    }

    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0068: MOVE  (r2 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:32:0x0067 */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0096 A[Catch: all -> 0x009d, TRY_LEAVE, TryCatch #10 {, blocks: (B:4:0x0003, B:10:0x0027, B:11:0x002a, B:47:0x0096, B:14:0x0035, B:25:0x0053, B:26:0x0056, B:29:0x0061, B:45:0x0091, B:33:0x0069, B:34:0x006c, B:38:0x007e, B:37:0x0077, B:40:0x0080, B:41:0x0083, B:44:0x008e), top: B:63:0x0003, inners: #0, #2, #7, #9 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final synchronized p a() {
        a aVar;
        Closeable closeable;
        String str;
        p pVar;
        Object readObject;
        synchronized (e.class) {
            int i6 = q5.d.f29148a;
            Context a10 = h5.p.a();
            Closeable closeable2 = null;
            pVar = null;
            pVar = null;
            pVar = null;
            try {
                try {
                    FileInputStream openFileInput = a10.openFileInput("AppEventsLogger.persistedevents");
                    kotlin.jvm.internal.i.f(openFileInput, "context.openFileInput(PERSISTED_EVENTS_FILENAME)");
                    aVar = new a(new BufferedInputStream(openFileInput));
                    try {
                        readObject = aVar.readObject();
                    } catch (FileNotFoundException unused) {
                        e0.e(aVar);
                        try {
                            a10.getFileStreamPath("AppEventsLogger.persistedevents").delete();
                        } catch (Exception e10) {
                            e = e10;
                            str = f19851a;
                            Log.w(str, "Got unexpected exception when removing events file: ", e);
                            if (pVar == null) {
                            }
                            return pVar;
                        }
                        if (pVar == null) {
                        }
                        return pVar;
                    } catch (Exception e11) {
                        e = e11;
                        Log.w(f19851a, "Got unexpected exception while reading events: ", e);
                        e0.e(aVar);
                        try {
                            a10.getFileStreamPath("AppEventsLogger.persistedevents").delete();
                        } catch (Exception e12) {
                            e = e12;
                            str = f19851a;
                            Log.w(str, "Got unexpected exception when removing events file: ", e);
                            if (pVar == null) {
                            }
                            return pVar;
                        }
                        if (pVar == null) {
                        }
                        return pVar;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    closeable2 = closeable;
                    e0.e(closeable2);
                    try {
                        a10.getFileStreamPath("AppEventsLogger.persistedevents").delete();
                    } catch (Exception e13) {
                        Log.w(f19851a, "Got unexpected exception when removing events file: ", e13);
                    }
                    throw th;
                }
            } catch (FileNotFoundException unused2) {
                aVar = null;
            } catch (Exception e14) {
                e = e14;
                aVar = null;
            } catch (Throwable th3) {
                th = th3;
                e0.e(closeable2);
                a10.getFileStreamPath("AppEventsLogger.persistedevents").delete();
                throw th;
            }
            if (readObject != null) {
                p pVar2 = (p) readObject;
                e0.e(aVar);
                try {
                    a10.getFileStreamPath("AppEventsLogger.persistedevents").delete();
                } catch (Exception e15) {
                    Log.w(f19851a, "Got unexpected exception when removing events file: ", e15);
                }
                pVar = pVar2;
                if (pVar == null) {
                    pVar = new p();
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type com.facebook.appevents.PersistedEvents");
            }
        }
        return pVar;
    }

    public static final void b(p pVar) {
        ObjectOutputStream objectOutputStream;
        Context a10 = h5.p.a();
        try {
            objectOutputStream = new ObjectOutputStream(new BufferedOutputStream(a10.openFileOutput("AppEventsLogger.persistedevents", 0)));
            try {
                objectOutputStream.writeObject(pVar);
            } catch (Throwable th2) {
                th = th2;
                try {
                    Log.w(f19851a, "Got unexpected exception while persisting events: ", th);
                    try {
                        a10.getFileStreamPath("AppEventsLogger.persistedevents").delete();
                    } catch (Exception unused) {
                    }
                } finally {
                    e0.e(objectOutputStream);
                }
            }
        } catch (Throwable th3) {
            th = th3;
            objectOutputStream = null;
        }
    }
}
