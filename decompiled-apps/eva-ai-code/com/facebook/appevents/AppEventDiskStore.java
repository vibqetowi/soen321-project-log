package com.facebook.appevents;

import android.content.Context;
import android.util.Log;
import com.facebook.FacebookSdk;
import com.facebook.appevents.AccessTokenAppIdPair;
import com.facebook.appevents.AppEvent;
import com.facebook.appevents.internal.AppEventUtility;
import com.facebook.internal.Utility;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: AppEventDiskStore.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\fB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0006\u001a\u00020\u0007H\u0007J\u0017\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0007H\u0001¢\u0006\u0002\b\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/facebook/appevents/AppEventDiskStore;", "", "()V", "PERSISTED_EVENTS_FILENAME", "", "TAG", "readAndClearStore", "Lcom/facebook/appevents/PersistedEvents;", "saveEventsToDisk", "", "eventsToPersist", "saveEventsToDisk$facebook_core_release", "MovedClassObjectInputStream", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class AppEventDiskStore {
    public static final AppEventDiskStore INSTANCE = new AppEventDiskStore();
    private static final String PERSISTED_EVENTS_FILENAME = "AppEventsLogger.persistedevents";
    private static final String TAG;

    private AppEventDiskStore() {
    }

    static {
        String name = AppEventDiskStore.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "AppEventDiskStore::class.java.name");
        TAG = name;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00bc A[Catch: all -> 0x00c3, TRY_LEAVE, TryCatch #3 {, blocks: (B:4:0x0003, B:10:0x0030, B:11:0x0037, B:45:0x00bc, B:14:0x0042, B:25:0x0067, B:26:0x006e, B:29:0x0079, B:30:0x007f, B:32:0x0084, B:33:0x008b, B:37:0x009f, B:36:0x0096, B:39:0x00a1, B:40:0x00a8, B:43:0x00b3), top: B:53:0x0003, inners: #5, #8, #9, #10 }] */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final synchronized PersistedEvents readAndClearStore() {
        PersistedEvents persistedEvents;
        Throwable th;
        MovedClassObjectInputStream movedClassObjectInputStream;
        String str;
        String str2;
        Exception exc;
        Object readObject;
        synchronized (AppEventDiskStore.class) {
            AppEventUtility appEventUtility = AppEventUtility.INSTANCE;
            AppEventUtility.assertIsNotMainThread();
            FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
            Context applicationContext = FacebookSdk.getApplicationContext();
            persistedEvents = null;
            try {
                try {
                    FileInputStream openFileInput = applicationContext.openFileInput(PERSISTED_EVENTS_FILENAME);
                    Intrinsics.checkNotNullExpressionValue(openFileInput, "context.openFileInput(PERSISTED_EVENTS_FILENAME)");
                    movedClassObjectInputStream = new MovedClassObjectInputStream(new BufferedInputStream(openFileInput));
                    try {
                        readObject = movedClassObjectInputStream.readObject();
                    } catch (FileNotFoundException unused) {
                        Utility utility = Utility.INSTANCE;
                        Utility.closeQuietly(movedClassObjectInputStream);
                        try {
                            applicationContext.getFileStreamPath(PERSISTED_EVENTS_FILENAME).delete();
                        } catch (Exception e) {
                            str = TAG;
                            str2 = "Got unexpected exception when removing events file: ";
                            exc = e;
                            Log.w(str, str2, exc);
                            if (persistedEvents == null) {
                            }
                            return persistedEvents;
                        }
                        if (persistedEvents == null) {
                        }
                        return persistedEvents;
                    } catch (Exception e2) {
                        e = e2;
                        Log.w(TAG, "Got unexpected exception while reading events: ", e);
                        Utility utility2 = Utility.INSTANCE;
                        Utility.closeQuietly(movedClassObjectInputStream);
                        try {
                            applicationContext.getFileStreamPath(PERSISTED_EVENTS_FILENAME).delete();
                        } catch (Exception e3) {
                            str = TAG;
                            str2 = "Got unexpected exception when removing events file: ";
                            exc = e3;
                            Log.w(str, str2, exc);
                            if (persistedEvents == null) {
                            }
                            return persistedEvents;
                        }
                        if (persistedEvents == null) {
                        }
                        return persistedEvents;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    Utility utility3 = Utility.INSTANCE;
                    Utility.closeQuietly(null);
                    try {
                        applicationContext.getFileStreamPath(PERSISTED_EVENTS_FILENAME).delete();
                    } catch (Exception e4) {
                        Log.w(TAG, "Got unexpected exception when removing events file: ", e4);
                    }
                    throw th;
                }
            } catch (FileNotFoundException unused2) {
                movedClassObjectInputStream = null;
            } catch (Exception e5) {
                e = e5;
                movedClassObjectInputStream = null;
            } catch (Throwable th3) {
                th = th3;
                Utility utility32 = Utility.INSTANCE;
                Utility.closeQuietly(null);
                applicationContext.getFileStreamPath(PERSISTED_EVENTS_FILENAME).delete();
                throw th;
            }
            if (readObject == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.facebook.appevents.PersistedEvents");
            }
            PersistedEvents persistedEvents2 = (PersistedEvents) readObject;
            Utility utility4 = Utility.INSTANCE;
            Utility.closeQuietly(movedClassObjectInputStream);
            try {
                applicationContext.getFileStreamPath(PERSISTED_EVENTS_FILENAME).delete();
            } catch (Exception e6) {
                Log.w(TAG, "Got unexpected exception when removing events file: ", e6);
            }
            persistedEvents = persistedEvents2;
            if (persistedEvents == null) {
                persistedEvents = new PersistedEvents();
            }
        }
        return persistedEvents;
    }

    @JvmStatic
    public static final void saveEventsToDisk$facebook_core_release(PersistedEvents persistedEvents) {
        FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
        Context applicationContext = FacebookSdk.getApplicationContext();
        ObjectOutputStream objectOutputStream = null;
        try {
            ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(new BufferedOutputStream(applicationContext.openFileOutput(PERSISTED_EVENTS_FILENAME, 0)));
            try {
                objectOutputStream2.writeObject(persistedEvents);
                Utility utility = Utility.INSTANCE;
                Utility.closeQuietly(objectOutputStream2);
            } catch (Throwable th) {
                th = th;
                objectOutputStream = objectOutputStream2;
                try {
                    Log.w(TAG, "Got unexpected exception while persisting events: ", th);
                    try {
                        applicationContext.getFileStreamPath(PERSISTED_EVENTS_FILENAME).delete();
                    } catch (Exception unused) {
                    }
                } finally {
                    Utility utility2 = Utility.INSTANCE;
                    Utility.closeQuietly(objectOutputStream);
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* compiled from: AppEventDiskStore.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0014¨\u0006\b"}, d2 = {"Lcom/facebook/appevents/AppEventDiskStore$MovedClassObjectInputStream;", "Ljava/io/ObjectInputStream;", "inputStream", "Ljava/io/InputStream;", "(Ljava/io/InputStream;)V", "readClassDescriptor", "Ljava/io/ObjectStreamClass;", "Companion", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes2.dex */
    private static final class MovedClassObjectInputStream extends ObjectInputStream {
        private static final String ACCESS_TOKEN_APP_ID_PAIR_SERIALIZATION_PROXY_V1_CLASS_NAME = "com.facebook.appevents.AppEventsLogger$AccessTokenAppIdPair$SerializationProxyV1";
        private static final String APP_EVENT_SERIALIZATION_PROXY_V1_CLASS_NAME = "com.facebook.appevents.AppEventsLogger$AppEvent$SerializationProxyV2";
        public static final Companion Companion = new Companion(null);

        public MovedClassObjectInputStream(InputStream inputStream) {
            super(inputStream);
        }

        @Override // java.io.ObjectInputStream
        protected ObjectStreamClass readClassDescriptor() throws IOException, ClassNotFoundException {
            ObjectStreamClass resultClassDescriptor = super.readClassDescriptor();
            if (Intrinsics.areEqual(resultClassDescriptor.getName(), ACCESS_TOKEN_APP_ID_PAIR_SERIALIZATION_PROXY_V1_CLASS_NAME)) {
                resultClassDescriptor = ObjectStreamClass.lookup(AccessTokenAppIdPair.SerializationProxyV1.class);
            } else if (Intrinsics.areEqual(resultClassDescriptor.getName(), APP_EVENT_SERIALIZATION_PROXY_V1_CLASS_NAME)) {
                resultClassDescriptor = ObjectStreamClass.lookup(AppEvent.SerializationProxyV2.class);
            }
            Intrinsics.checkNotNullExpressionValue(resultClassDescriptor, "resultClassDescriptor");
            return resultClassDescriptor;
        }

        /* compiled from: AppEventDiskStore.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/facebook/appevents/AppEventDiskStore$MovedClassObjectInputStream$Companion;", "", "()V", "ACCESS_TOKEN_APP_ID_PAIR_SERIALIZATION_PROXY_V1_CLASS_NAME", "", "APP_EVENT_SERIALIZATION_PROXY_V1_CLASS_NAME", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
        /* loaded from: classes2.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }
    }
}
