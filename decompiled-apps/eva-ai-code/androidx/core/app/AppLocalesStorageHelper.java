package androidx.core.app;

import android.content.Context;
import android.util.Log;
import android.util.Xml;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;
/* loaded from: classes3.dex */
public class AppLocalesStorageHelper {
    static final String APPLICATION_LOCALES_RECORD_FILE = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file";
    static final boolean DEBUG = false;
    static final String LOCALE_RECORD_ATTRIBUTE_TAG = "application_locales";
    static final String LOCALE_RECORD_FILE_TAG = "locales";
    static final String TAG = "AppLocalesStorageHelper";
    private static final Object sAppLocaleStorageSync = new Object();

    private AppLocalesStorageHelper() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003a, code lost:
        r1 = r3.getAttributeValue(null, androidx.core.app.AppLocalesStorageHelper.LOCALE_RECORD_ATTRIBUTE_TAG);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0041, code lost:
        if (r2 != null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0043, code lost:
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0050, code lost:
        if (r2 == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0057, code lost:
        if (r1.isEmpty() == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005a, code lost:
        r8.deleteFile(androidx.core.app.AppLocalesStorageHelper.APPLICATION_LOCALES_RECORD_FILE);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String readLocales(Context context) {
        String str;
        synchronized (sAppLocaleStorageSync) {
            str = "";
            try {
                FileInputStream openFileInput = context.openFileInput(APPLICATION_LOCALES_RECORD_FILE);
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
            } catch (FileNotFoundException unused2) {
                return "";
            }
        }
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003d, code lost:
        if (r5 != null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003f, code lost:
        r5.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004d, code lost:
        if (r5 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0051, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void persistLocales(Context context, String str) {
        synchronized (sAppLocaleStorageSync) {
            if (str.equals("")) {
                context.deleteFile(APPLICATION_LOCALES_RECORD_FILE);
                return;
            }
            try {
                FileOutputStream openFileOutput = context.openFileOutput(APPLICATION_LOCALES_RECORD_FILE, 0);
                XmlSerializer newSerializer = Xml.newSerializer();
                try {
                    newSerializer.setOutput(openFileOutput, null);
                    newSerializer.startDocument("UTF-8", true);
                    newSerializer.startTag(null, LOCALE_RECORD_FILE_TAG);
                    newSerializer.attribute(null, LOCALE_RECORD_ATTRIBUTE_TAG, str);
                    newSerializer.endTag(null, LOCALE_RECORD_FILE_TAG);
                    newSerializer.endDocument();
                } catch (Exception e) {
                    Log.w(TAG, "Storing App Locales : Failed to persist app-locales in storage ", e);
                }
            } catch (FileNotFoundException unused) {
                Log.w(TAG, String.format("Storing App Locales : FileNotFoundException: Cannot open file %s for writing ", APPLICATION_LOCALES_RECORD_FILE));
            }
        }
    }
}
