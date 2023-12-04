package androidx.appcompat.app;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.util.Xml;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.app.AppLocalesStorageHelper;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class AppLocalesStorageHelper {
    static final String APPLICATION_LOCALES_RECORD_FILE = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file";
    static final String APP_LOCALES_META_DATA_HOLDER_SERVICE_NAME = "androidx.appcompat.app.AppLocalesMetadataHolderService";
    static final String LOCALE_RECORD_ATTRIBUTE_TAG = "application_locales";
    static final String LOCALE_RECORD_FILE_TAG = "locales";
    static final String TAG = "AppLocalesStorageHelper";

    private AppLocalesStorageHelper() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003b, code lost:
        r2 = r4.getAttributeValue(null, androidx.appcompat.app.AppLocalesStorageHelper.LOCALE_RECORD_ATTRIBUTE_TAG);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0043, code lost:
        if (r3 != null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0045, code lost:
        r3.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0050, code lost:
        if (r3 == null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0057, code lost:
        if (r2.isEmpty() == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0059, code lost:
        android.util.Log.d(androidx.appcompat.app.AppLocalesStorageHelper.TAG, "Reading app Locales : Locales read from file: androidx.appcompat.app.AppCompatDelegate.application_locales_record_file , appLocales: " + r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006b, code lost:
        r9.deleteFile(androidx.appcompat.app.AppLocalesStorageHelper.APPLICATION_LOCALES_RECORD_FILE);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006e, code lost:
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String readLocales(Context context) {
        String str = "";
        try {
            FileInputStream openFileInput = context.openFileInput(APPLICATION_LOCALES_RECORD_FILE);
            try {
                try {
                    XmlPullParser newPullParser = Xml.newPullParser();
                    newPullParser.setInput(openFileInput, "UTF-8");
                    int depth = newPullParser.getDepth();
                    while (true) {
                        int next = newPullParser.next();
                        if (next == 1 || (next == 3 && newPullParser.getDepth() <= depth)) {
                            break;
                        } else if (next != 3 && next != 4 && newPullParser.getName().equals(LOCALE_RECORD_FILE_TAG)) {
                            break;
                        }
                    }
                } catch (IOException | XmlPullParserException unused) {
                    Log.w(TAG, "Reading app Locales : Unable to parse through file :androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                }
            } catch (Throwable th) {
                if (openFileInput != null) {
                    try {
                        openFileInput.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        } catch (FileNotFoundException unused3) {
            Log.w(TAG, "Reading app Locales : Locales record file not found: androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void persistLocales(Context context, String str) {
        if (str.equals("")) {
            context.deleteFile(APPLICATION_LOCALES_RECORD_FILE);
            return;
        }
        try {
            FileOutputStream openFileOutput = context.openFileOutput(APPLICATION_LOCALES_RECORD_FILE, 0);
            XmlSerializer newSerializer = Xml.newSerializer();
            try {
                try {
                    newSerializer.setOutput(openFileOutput, null);
                    newSerializer.startDocument("UTF-8", true);
                    newSerializer.startTag(null, LOCALE_RECORD_FILE_TAG);
                    newSerializer.attribute(null, LOCALE_RECORD_ATTRIBUTE_TAG, str);
                    newSerializer.endTag(null, LOCALE_RECORD_FILE_TAG);
                    newSerializer.endDocument();
                    Log.d(TAG, "Storing App Locales : app-locales: " + str + " persisted successfully.");
                    if (openFileOutput == null) {
                        return;
                    }
                } catch (Exception e) {
                    Log.w(TAG, "Storing App Locales : Failed to persist app-locales: " + str, e);
                    if (openFileOutput == null) {
                        return;
                    }
                }
                try {
                    openFileOutput.close();
                } catch (IOException unused) {
                }
            } catch (Throwable th) {
                if (openFileOutput != null) {
                    try {
                        openFileOutput.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        } catch (FileNotFoundException unused3) {
            Log.w(TAG, String.format("Storing App Locales : FileNotFoundException: Cannot open file %s for writing ", APPLICATION_LOCALES_RECORD_FILE));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void syncLocalesToFramework(Context context) {
        if (Build.VERSION.SDK_INT >= 33) {
            ComponentName componentName = new ComponentName(context, APP_LOCALES_META_DATA_HOLDER_SERVICE_NAME);
            if (context.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                if (AppCompatDelegate.getApplicationLocales().isEmpty()) {
                    String readLocales = readLocales(context);
                    Object systemService = context.getSystemService("locale");
                    if (systemService != null) {
                        AppCompatDelegate.Api33Impl.localeManagerSetApplicationLocales(systemService, AppCompatDelegate.Api24Impl.localeListForLanguageTags(readLocales));
                    }
                }
                context.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
            }
        }
    }

    /* loaded from: classes.dex */
    static class ThreadPerTaskExecutor implements Executor {
        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            new Thread(runnable).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class SerialExecutor implements Executor {
        Runnable mActive;
        final Executor mExecutor;
        private final Object mLock = new Object();
        final Queue<Runnable> mTasks = new ArrayDeque();

        /* JADX INFO: Access modifiers changed from: package-private */
        public SerialExecutor(Executor executor) {
            this.mExecutor = executor;
        }

        @Override // java.util.concurrent.Executor
        public void execute(final Runnable runnable) {
            synchronized (this.mLock) {
                this.mTasks.add(new Runnable() { // from class: androidx.appcompat.app.AppLocalesStorageHelper$SerialExecutor$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        AppLocalesStorageHelper.SerialExecutor.this.m36xd188c474(runnable);
                    }
                });
                if (this.mActive == null) {
                    scheduleNext();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: lambda$execute$0$androidx-appcompat-app-AppLocalesStorageHelper$SerialExecutor  reason: not valid java name */
        public /* synthetic */ void m36xd188c474(Runnable runnable) {
            try {
                runnable.run();
            } finally {
                scheduleNext();
            }
        }

        protected void scheduleNext() {
            synchronized (this.mLock) {
                Runnable poll = this.mTasks.poll();
                this.mActive = poll;
                if (poll != null) {
                    this.mExecutor.execute(poll);
                }
            }
        }
    }
}
